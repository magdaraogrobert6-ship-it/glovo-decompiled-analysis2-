package o;

import android.app.Notification;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusEventModifierDefaultImpls {
    public static Parcelable serializer(android.app.Person person) {
        return person;
    }

    public static Notification.MessagingStyle.Message IconCompatParcelizer(CharSequence charSequence, long j, android.app.Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j, person);
    }
}
