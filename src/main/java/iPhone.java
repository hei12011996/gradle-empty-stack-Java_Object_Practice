public class iPhone extends Mobile {

    public iPhone(String name, String color, String brand){
        super(name, color, brand);
    }

    @Override
    public void call(String message){
        System.out.print("<iPhone> ");
        if (message.length() > 25) {
            System.out.println("Message cannot be sent");
        } else {
            super.call(message);
        }
    }

}
