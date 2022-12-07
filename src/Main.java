public class Main {

    public static void main(String[] args) {

        System.out.print("Suma =");
        System.out.println(sumar(1,2,3));

        Coche coche1 = new Coche();
        coche1.aumentarPuertas();
    }
    public static int sumar(int a, int b, int c){
        return a + b + c;
    }


    }

