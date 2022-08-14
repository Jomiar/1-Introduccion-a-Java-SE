public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.ceil(x));//Devuelve un Redondeo hacia arriba
        System.out.println(Math.floor(x));//Devuelve un Redondeo hacia abajo
        System.out.println(Math.pow(x,y));//Devuelve un numero elevado al otro
        System.out.println(Math.max(x,y));//Devuelve el numero mayor
        System.out.println(Math.sqrt(y));//Devuelve la raiz cuadrada
        System.out.println(Math.PI * Math.pow(y,2));//Devuelve el area de un circulo
        //Area de una esfera
        //4*PI*r2
        System.out.println(4 * Math.PI *Math.pow(y,2));//Devuelve el Area de la esfera
        //Volumen de una esfera
        //(4/3) * pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));//Devuelve el volumen de la esfera
    }
}
