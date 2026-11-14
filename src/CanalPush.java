public class CanalPush extends CanalMensajeria{
    public void enviarMensaje(String destinatario, String texto) {

        System.out.println("Conectando con el servidor Push...");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + texto);
        System.out.println("Notificacion Push enviada correctamente.");

    }
}
