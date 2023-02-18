package basejava;

import by.belstu.it.denisenko.Main;

import static java.lang.Math.log;
import static java.lang.Math.*;

public class JavaTest {
    static int sint;
    final int V1 = 3; // нельзя изменить
    public final int V2 = 3; // нельзя изменить + параметр доступа public(видны другим классам из текущего пакета)
    public static final int V3 = 3; // постоянное число для всех экземпляров класса
    public static void main(String[] args) {
        char charVar = 'a'; // 2 байта, UTF-16
        String stringVar = "dim";
        int intVar = 25;// от -2147483648 до 2147483647 (4 байта)
        short shortVar = 15;// от -32768 до 32767 (2 байта)
        byte byteVar = 10;// от -128 до 127 (1 байт)
        long longVar = 35;// от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 (8 байт)
        double doubleVar = 45;
        boolean booleanVar = true;
        boolean booleanVar2 = false;
        System.out.println("Strint + int: " + (stringVar+intVar));
        System.out.println("Strint + char: " + (stringVar+charVar));
        System.out.println("Strint + double: " + (stringVar+doubleVar));
        byte byteVar2 = (byte) (byteVar + intVar);
        System.out.println("byte = byte + int: " + byteVar2);
        int intVar2 = (int) (doubleVar + longVar);
        System.out.println("int = double + long: " + intVar2);
        long longVar2 = intVar + 2147483647;
        System.out.println("long = int + 2147483647: " + longVar2);
        System.out.println("static int sint: " + sint);
        boolean booleanVar3 = booleanVar && booleanVar2;
        System.out.println("true && false: " + booleanVar3);
        booleanVar3 = booleanVar ^ booleanVar2;
        System.out.println("true ^ false: " + booleanVar3);
        // нельзя booleanVar3 = booleanVar + booleanVar2;
        //подберите типы для чисел 9223372036854775807 и 0x7fff_ffff_fff
        long testVar = 9_223_372_036_854_775_807L;
        long testInt = 0x7ffffffffffL;
        System.out.println(charVar + " " + '\u0061' + " " + 97);
        System.out.println(3.45%2.4);
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));
        // Целые можно записывать в трёх системах счисления: десятичной, восьмеричной, шестнадцатеричной
        System.out.println(min(round(PI), round(E)));
        System.out.println(random());
        Boolean boolO = false;
        Character charO = 'a';
        Integer intO = 5;
        Byte byteO = 1;
        Short shortO = 7;
        Long longO = 1L;
        Double doubleO = 2D;
        System.out.println(intO >>> byteO);// побитовый сдвиг вправо
        System.out.println(intO >> byteO);
        System.out.println(~byteO);
        System.out.println(byteO & intO);
        System.out.println(longO - doubleO + shortO * byteO);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
}
