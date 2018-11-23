public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message){
        System.out.println(String.format("Message : %s ", message));
    }

    public void printBasicInfo(){
        System.out.println(String.format("name: %s, color: %s, brand: %s", name, color, brand));
    }

}
