package o;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FocusEventModifierKt {
    public static void bj_(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    public static void bk_(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void bl_(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    public static void bo_(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void bp_(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void bq_(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }

    public static void bm_(Notification.ProgressStyle progressStyle, List<invalidateFocusEvent> list) {
        for (invalidateFocusEvent invalidatefocusevent : list) {
            progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(invalidatefocusevent.write).setColor(invalidatefocusevent.serializer).setId(invalidatefocusevent.IconCompatParcelizer));
        }
    }

    public static void bn_(Notification.ProgressStyle progressStyle, List<getFocusState> list) {
        for (getFocusState getfocusstate : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(getfocusstate.read).setColor(getfocusstate.write).setId(getfocusstate.IconCompatParcelizer));
        }
    }
}
