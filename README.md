<img width="389" height="348" alt="image" src="https://github.com/user-attachments/assets/7eefe02a-1389-4619-aa17-5cc561152946" />

 Sistema de Notificaciones Omnicanal con Envío Polimórfico

 Descripción

Este proyecto consiste en desarrollar un sistema de notificaciones en Java, aplicando conceptos de Programación Orientada a Objetos (POO), especialmente el polimorfismo y la abstracción.

El sistema permite enviar mensajes a través de diferentes canales de comunicación, como correo electrónico, SMS y notificaciones push, utilizando una estructura común.

 Objetivo

Implementar un servicio de notificaciones capaz de enviar mensajes por diferentes medios de comunicación sin necesidad de conocer los detalles internos de cada canal.

 Clases utilizadas

CanalMensajeria: Clase abstracta o interfaz que declara el método enviarMensaje().

CanalEmail: Representa el canal de correo electrónico y define su propia lógica de envío.

CanalSMS: Representa el canal de mensajes de texto y define su propia lógica de envío.

CanalPush: Representa el canal de notificaciones push móviles y define su propia lógica de envío.

ServicioNotificaciones: Clase encargada de recibir un canal de mensajería y despachar las notificaciones.

Main: Contiene el método principal, crea los diferentes canales y demuestra el funcionamiento del sistema.

 Conceptos aplicados

Programación Orientada a Objetos (POO).

Polimorfismo.

Abstracción.

Interfaces o clases abstractas.

Sobrescritura de métodos (@Override).

Desacoplamiento entre clases.

Parámetros de tipo abstracto.

 Funcionamiento

Se define una estructura común llamada CanalMensajeria.

Se crean los canales CanalEmail, CanalSMS y CanalPush, cada uno con su propia implementación del método enviarMensaje().

La clase ServicioNotificaciones recibe un objeto de tipo CanalMensajeria.

Desde el método main se crean diferentes canales y se envían mensajes a través del servicio.

Cada canal ejecuta su propio comportamiento de manera polimórfica.

Se muestran por consola las trazas de comunicación correspondientes a cada envío.

 Tecnologías utilizadas

Lenguaje: Java.

Entorno de desarrollo: IntelliJ IDEA.

Paradigma: Programación Orientada a Objetos.

 Resultado esperado

Al ejecutar el programa, el servicio podrá enviar notificaciones mediante diferentes canales de comunicación utilizando un mismo método, permitiendo agregar nuevos medios de envío sin modificar la lógica principal del servicio.
