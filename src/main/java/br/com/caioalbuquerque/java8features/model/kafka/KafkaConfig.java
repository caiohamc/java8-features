package br.com.caioalbuquerque.java8features.model.kafka;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 14/03/2022
 */
@Service
public class KafkaConfig {
    private static final Logger LOGGER = Logger.getLogger("KafkaConfig");

    @Bean
    public KafkaAdmin admin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        return new KafkaAdmin(configs);
    }

    @Bean
    public KafkaAdmin.NewTopics getTopics() {
        return new KafkaAdmin.NewTopics(
                TopicBuilder.name("topic1_default").build(),
                TopicBuilder.name("topic2_replicas1").replicas(1).build(),
                TopicBuilder.name("topic3_partitions3").partitions(3).build(),
                TopicBuilder.name("topic4_partitions10_replicas3_compact")
                        .partitions(10).replicas(3).compact().build(),
                TopicBuilder.name("topic5_partitions10_replicas3_configCompressionZstd")
                        .partitions(10).replicas(3)
                        .config(TopicConfig.COMPRESSION_TYPE_CONFIG, "zstd").build(),
                TopicBuilder.name("topic6_assingReplicasPartitionsAndReplicas3_configCompressionZstd")
                        .assignReplicas(0, Arrays.asList(0, 1))
                        .assignReplicas(1, Arrays.asList(1, 2))
                        .assignReplicas(2, Arrays.asList(2, 0))
                        .config(TopicConfig.COMPRESSION_TYPE_CONFIG, "zstd").build());
    }

    @KafkaListener(id = "myId", topics = "topic1_default")
    public void listen(String in) {
        System.out.println(in);
    }

    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> template) {
        return args -> {
            template.send("topic1_default", "test");
        };
    }
}