public class CanalSMS extends CanalMensajeria{
    public void enviarMensaje(String destinatario, String texto) {

        System.out.println("Conectando con el servidor SMS...");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + texto);
        System.out.println("SMS enviado correctamente.");

    }
}
