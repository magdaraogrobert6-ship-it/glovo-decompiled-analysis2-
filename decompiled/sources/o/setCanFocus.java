package o;

import android.app.Notification;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public abstract class setCanFocus {
    public static android.graphics.Path RemoteActionCompatParcelizer(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static void serializer(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
