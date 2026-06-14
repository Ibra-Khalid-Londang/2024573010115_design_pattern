package modul_7.praktikum_3;

public class PushNotification implements NotificationStrategy{
    public void send(String message) {
        System.out.println("Mengirim notifikasi push: " + message);
    }
}
