// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(canGoOuitside(10,24));
        System.out.println( canGoOuitside(40,52));
        System.out.println(canGoOuitside(12, 10));
        System.out.println(canGoOuitside(38,19));
        System.out.println(canGoOuitside(34, 43));
        


    }
    public static String canGoOuitside(int age, float temperature){
        if (age >= 20 && age <= 45 && temperature > -20 && temperature<=30)
            return  " Можно идти гулять ";
        else  if (age < 20 && temperature >=0 && temperature<= 28)
            return " Можно идти гулять";
        else if (age > 45 && temperature >= -10 && temperature<= 25)
            return " Можно идти гулять";
        else
            return " Остовайся дома";





        }


    }










