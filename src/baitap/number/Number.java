package baitap.number;

public class Number {
    public static void main(String[] args) {
        String regex = "^[(][0-9]{2}[)][-][(][0-9]{10,11}[)]$";

        String[] string = {"(84)-(0978489648)", "(a8)-(22222222)"};
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i].matches(regex));
        }
    }
}
