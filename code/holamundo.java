import org.apache.commons.lang3.StringUtils;

public class HolaMundo {
    public static void main(String[] args) {
        String mensaje = "Hola, Mundo";
        // Usando una función de la librería Apache Commons Lang para invertir el mensaje
        String mensajeInvertido = StringUtils.reverse(mensaje);
        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje invertido: " + mensajeInvertido);
    }
}
