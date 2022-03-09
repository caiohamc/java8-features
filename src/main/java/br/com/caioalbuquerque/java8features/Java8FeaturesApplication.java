package br.com.caioalbuquerque.java8features;

import br.com.caioalbuquerque.java8features.model.binarytree.BinaryTree;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 11/02/2022
 */
@SpringBootApplication
@EnableScheduling
public class Java8FeaturesApplication implements CommandLineRunner {
	private static final Logger LOGGER = Logger.getLogger("MAIN");

	public static void main(String[] args) {
		SpringApplication.run(Java8FeaturesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		runJobs();
		runBinaryTreeCreation();
	}

	/* Jobs */
	private void runJobs(){
		LOGGER.info("---------------------");
		LOGGER.info("JOBs EXECUTION");
		LOGGER.info(" ");
		LOGGER.info("Running jobs with a few parameters ...");
		LOGGER.info("---------------------");
	}

	/* Binary Tree */
	private void runBinaryTreeCreation(){
		LOGGER.info("---------------------");
		LOGGER.info("BINARY TREE PROBLEM SOLVING");

		LOGGER.info(" ");
		LOGGER.info("Retrieving singleton instance of the statically created binary tree object");
		BinaryTree binaryTree = BinaryTree.getInstance();
		LOGGER.info("Binary Tree: " + binaryTree);

		LOGGER.info(" ");
		LOGGER.info("Filling dinamically a binary tree with a few elements");
		LOGGER.info(" ");
		binaryTree.addNode(5);
		binaryTree.addNode(3);
		binaryTree.addNode(4);
		binaryTree.addNode(1);
		binaryTree.addNode(8);
		binaryTree.addNode(9);
		binaryTree.addNode(2);
	}



	/* ----------- Apache Kafka Setup ----------- */

	@Bean
	public KafkaAdmin admin() {
		Map<String, Object> configs = new HashMap<>();
		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		return new KafkaAdmin(configs);
	}

//	@Bean
//	public NewTopic topic1() {
//		return TopicBuilder.name("thing1").partitions(10).replicas(3).compact().build();
//	}

//	@Bean
//	public NewTopic topic2() {
//		return TopicBuilder.name("thing2").partitions(10).replicas(3)
//				.config(TopicConfig.COMPRESSION_TYPE_CONFIG, "zstd").build();
//	}

//	@Bean
//	public NewTopic topic3() {
//		return TopicBuilder.name("thing3")
//				.assignReplicas(0, Arrays.asList(0, 1))
//				.assignReplicas(1, Arrays.asList(1, 2))
//				.assignReplicas(2, Arrays.asList(2, 0))
//				.config(TopicConfig.COMPRESSION_TYPE_CONFIG, "zstd").build();
//	}

//	@Bean
//	public KafkaAdmin.NewTopics topics456() {
//		return new KafkaAdmin.NewTopics(
//				TopicBuilder.name("defaultBoth").build(),
//				TopicBuilder.name("defaultPart").replicas(1).build(),
//				TopicBuilder.name("defaultRepl").partitions(3).build());
//	}

//	@KafkaListener(id = "myId", topics = "topic1")
//	public void listen(String in) {
//		System.out.println(in);
//	}
//
//	@Bean
//	public ApplicationRunner runner(KafkaTemplate<String, String> template) {
//		return args -> {
//			template.send("topic1", "test");
//		};
//	}
}