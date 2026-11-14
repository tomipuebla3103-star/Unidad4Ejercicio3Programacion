public class ServicioNotificaciones {

    public void enviarNotificacion(CanalMensajeria canal, String destinatario, String texto) {

        canal.enviarMensaje(destinatario, texto);

    }
}
