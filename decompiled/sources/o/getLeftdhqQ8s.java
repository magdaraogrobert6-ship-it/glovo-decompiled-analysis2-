package o;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* JADX INFO: loaded from: classes.dex */
public abstract class getLeftdhqQ8s {
    public static void RemoteActionCompatParcelizer(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void read(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void serializer(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }
}
