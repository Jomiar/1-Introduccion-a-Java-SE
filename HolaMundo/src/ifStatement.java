import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ifStatement {
    public static void main(String[] args) {
        //boolean isBluetoothEnabled = true;
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //Send file
            //La variable fileSended solo ser usada dentro de la funcion método
            fileSended++;
            System.out.println("Arvhivo Enviado");

            int i = 0;
            //La variable i++, quiere decir que cada vez que el software recorra
            //dicha variable, esta se ira aumentando de 1 en 1.
            i++;
        } else{
            fileSended--;
            System.out.println("Porfavor enciende tu Bloetooth   para iniciar la transferenca");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
