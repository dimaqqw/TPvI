package by.belstu.it.denisenko;

public class TextFunction {
    public int test;
    public int getTest() {
        return test;
    }
    public String getValue(){
        return "Hello from First project";
    }
    public String testCodeRefactoring(){
        return  "Test";
    }
    public void onCreate(){
        for (int count = 0; count < 10; count++) {
            System.out.println("Counter " + count);
        }
    }
}
