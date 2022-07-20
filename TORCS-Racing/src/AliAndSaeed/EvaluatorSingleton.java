package AliAndSaeed;

public class EvaluatorSingleton{
    private static EvaluatorSingleton instance;
    
    private EvaluatorSingleton(){
        //Private instantiation
    }

    public static synchronized EvaluatorSingleton getInstance()  //If you want your method thread safe...
    { 
        if (instance == null) {
            instance = new EvaluatorSingleton();
        }
                

        return instance;
    }
    
    public static int lap=new Integer(1);
    public static Config currentConfig = new Config();
}
