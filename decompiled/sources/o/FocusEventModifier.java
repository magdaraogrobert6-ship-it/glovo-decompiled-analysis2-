package o;

import android.app.Notification;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusEventModifier {
    public static Notification.MessagingStyle.Message serializer(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
