package by.belstu.it.denisenko;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        TextFunction obj = new TextFunction();

        for (int i=0; i<9; i++) {
            if (i>-1)
                if (i<10)
                    System.out.println(i);

        }
        obj.onCreate();
    }
}