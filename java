public class HomeWork {
    public static void main(String[] args) {

// Char to Int when String.valueOf


        char a = '9';
        int anInt = Integer.parseInt(String.valueOf(a));

        System.out.println(anInt);
        System.out.println(anInt + 1);


// Char to Int when Character.getNumericValue

        char s = '9';
        int sInt = Character.getNumericValue(s);

        System.out.println(sInt);

        System.out.println(sInt + 1);


    }
}
