package o;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class getNextdhqQ8s {
    public static Notification.MessagingStyle write(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    public static Notification.MessagingStyle write(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }
}
