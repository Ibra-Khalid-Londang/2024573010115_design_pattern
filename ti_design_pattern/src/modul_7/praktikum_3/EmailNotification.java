package modul_7.praktikum_3;

public class EmailNotification implements NotificationStrategy{
    public void send(String message) {
        System.out.println("Mengirim email: " + message);
    }
}
