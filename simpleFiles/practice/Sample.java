package practice;

public class Sample {

    public static void change(String something) {
        something = "revised";
    }
    
    public static void main(String[] args) {
        String sample = "new";
        System.out.println(sample);

        change(sample);
        System.out.println(sample);
    }

    
}
