package br.com.caioalbuquerque.java8features.example05;

/**
 * @author Caio Albuquerque
 * @since 12/02/2022
 */
public class StaticMethodInsideInterfaceImpl implements StaticMethodInsideInterface {
    public void executeStaticMethodFromInterfaceNoReturnNoParams(){
        StaticMethodInsideInterface.executeSomethingNoReturnNoParam();
    }

    public void executeStaticMethodFromInterfaceNoReturnOneParam(String param1){
        StaticMethodInsideInterface.executeSomethingNoReturnOneParam(param1);
    }

    public void executeStaticMethodFromInterfaceNoReturnTwoParams(String param1, String param2){
        StaticMethodInsideInterface.executeSomethingNoReturnTwoParam(param1, param2);
    }

    public String executeStaticMethodFromInterfaceWithReturnNoParams(){
        return StaticMethodInsideInterface.executeSomethingWithReturnNoParams();
    }

    public String executeStaticMethodFromInterfaceWithResultOneParam(String param1) {
        return StaticMethodInsideInterface.executeSomethingWithReturnOneParam(param1);
    }

    public String executeStaticMethodFromInterfaceWithResultTwoParams(String param1, String param2) {
        return StaticMethodInsideInterface.executeSomethingWithReturnTwoParams(param1, param2);
    }
}