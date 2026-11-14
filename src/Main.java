//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ServicioNotificaciones servicio = new ServicioNotificaciones();

    CanalMensajeria email = new CanalEmail();
    CanalMensajeria sms = new CanalSMS();
    CanalMensajeria push = new CanalPush();

    servicio.enviarNotificacion(email, "usuario@gmail.com", "Bienvenido al sistema.");

    System.out.println("-------------------------");

    servicio.enviarNotificacion(sms, "2611234567", "Su codigo fue generado.");

    System.out.println("-------------------------");

    servicio.enviarNotificacion(push, "Usuario123", "Tiene una nueva notificacion.");
}
