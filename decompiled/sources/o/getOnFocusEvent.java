package o;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class getOnFocusEvent {
    public static Notification.MessagingStyle read(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }

    public static Notification.MessagingStyle IconCompatParcelizer(android.app.Person person) {
        return new Notification.MessagingStyle(person);
    }
}
