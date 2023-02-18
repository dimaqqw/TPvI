package basejava;

import by.belstu.it.denisenko.Main;
import com.sun.source.tree.DoWhileLoopTree;
import java.util.Arrays;

import static java.lang.Math.log;
import static java.lang.Math.*;

public class JavaTest {
    /**@author dimaqqw
    @version 1.2 **/
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
        System.out.println("String + int: " + (stringVar+intVar));
        System.out.println("String + char: " + (stringVar+charVar));
        System.out.println("String + double: " + (stringVar+doubleVar));
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
        /**- @value maxLong @see **/
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
        Integer integer = 9;// упаковка
        int b1 = integer;// распаковка
        Byte byte1 = 3;
        byte by1 = byte1;
        int intz = Integer.parseInt("9");
        int l =234;
        System.out.println(Integer.toHexString(l));
        System.out.println(Integer.compare(4,7));
        System.out.println(Integer.toString(5));
        System.out.println(Integer.bitCount(4));
        Double db = 4.2;
        System.out.println(db.isNaN());

        String s1 = "2341";

        var s1_1 = new Integer(s1);
        var s1_2 = Integer.parseInt(s1);
        var s1_3 = Integer.valueOf(s1);

        String s2 = "Hello Java!";
        byte[] bytes = s2.getBytes();
        String str1 = new String(bytes);
        System.out.println(str1);

        String str2 = "123456";
        Boolean b2 = Boolean.valueOf(str2);
        System.out.println(b2);

        String str3 = "true";
        Boolean b3 = Boolean.parseBoolean(str3);
        System.out.println(b3);

        String stroke1 = "Hello";
        String stroke2 = "Hello";
        System.out.println("stroke1 == stroke2 = " + (stroke1 == stroke2) );
        System.out.println("stroke1.equals(stroke2) = " + stroke1.equals(stroke2));
        System.out.println("stroke1.compareTo(stroke2) = " + stroke1.compareTo(stroke2));


        String stroke4 = null;
        System.out.println("stroke1 == stroke4 = " + (stroke1 == stroke4) );
        System.out.println("stroke1.equals(stroke2) = " + stroke1.equals(stroke4));
        //System.out.println("stroke1.compareTo(stroke2) = " + stroke1.compareTo(stroke4));

        String[] s2_split = s2.split(" ");
        System.out.println("s2_split = " + Arrays.toString(s2_split));
        System.out.println("s2.contains(\"a\") = " + s2.contains("a"));
        System.out.println("s2.indexOf(\"va\") = " + s2.indexOf("va"));
        System.out.println("s2.hashCode() = " + s2.hashCode());
        System.out.println("s2.length() = " + s2.length());
        System.out.println(s2.replace("a", "r"));

        char[][] c1;
        char[] c2[];
        char c3[][];

        c1 = new char[3][];
        c1[0] = new char[1];
        c1[1] = new char[2];
        c1[2] = new char[3];
        System.out.println(c1.length);
        System.out.println(c1[0].length);
        System.out.println(c1[1].length);
        System.out.println(c1[2].length);

        c2 = new char [][]{ {'a', 'b' }, { 'b', 'c' } };
        c3 = new char [][]{ {'d', 'm'}, { 'r', 'p'}};
        System.out.println(c2 == c3);
        System.out.println(c2 = c3);
        for (var it : c2
        ) {
            System.out.println(it);
        }



        WrapperString wrapper = new WrapperString("Hello");
        wrapper.replace('e', 'o');
        System.out.println(wrapper.getName());

        WrapperString wrapper1 = new WrapperString("Hello"){
            @Override
            public void replace(char oldchar, char newchar) {
                super.replace(oldchar, newchar);
            }
            public void delete(char newchar) {
                super.replace(newchar, ' ');
            }
        };


        /*
         * Аннотации – это пометки, с помощью которых программист указывает компилятору
         *  Java и средствам разработки, что делать с участками кода помимо
         *  исполнения программы.
         * */
        /**
         @return 0
         @throws null
         @param default
         **/
    }


}
