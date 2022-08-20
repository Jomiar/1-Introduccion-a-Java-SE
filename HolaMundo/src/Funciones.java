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

        System.out.println("PESOS A DOLARES: " + converterToDolar(200, "MXN"));

    }


    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereEsfera(double r){
        return 4 * Math.PI *Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI *  Math.pow(r,3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares.
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve cantidad en dolares
     *  */
    public static double converterToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }


}
