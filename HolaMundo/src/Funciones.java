import org.jcp.xml.dsig.internal.dom.ApacheNodeSetData;

public class Funciones {
    public static void main(String[] args) {
        double y = 3;



        //Area de un circulo
        //pi * r2
        double area = circleArea(y);
        System.out.println(area);

        //Area de una esfera
        //4*PI*r2
        double areaEsfera = sphereEsfera(y);
        System.out.println(areaEsfera);

        //Volumen de una esfera
        //(4/3) * pi * r3
        double volumenEsfera = sphereVolumen(y);
        System.out.println(volumenEsfera);
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereEsfera(double r){
        return 4 * Math.PI *Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }


}
