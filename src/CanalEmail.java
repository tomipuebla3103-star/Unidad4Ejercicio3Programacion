public class CanalEmail extends CanalMensajeria{
    public void enviarMensaje(String destinatario, String texto) {

        System.out.println("Conectando con el servidor de Email...");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + texto);
        System.out.println("Email enviado correctamente.");

    }
}
