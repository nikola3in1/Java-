public class Testing {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void init(){
        System.out.println("Init");
    }
    public void destroy(){
        System.out.println("Destroy");
    }
}
