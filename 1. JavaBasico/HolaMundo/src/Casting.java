public class Casting {
    public static void main(String[] args) {

        //En un año ubique a 30 perritos
        //Cuantos peritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACION
        int estimaciondMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimaciondMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println(a/b);
        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);
    }
}
