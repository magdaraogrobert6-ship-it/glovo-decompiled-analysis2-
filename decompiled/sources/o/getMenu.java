package o;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment;
import com.sentiance.core.model.events.E$b;

/* JADX INFO: loaded from: classes.dex */
public abstract class getMenu {
    public static E$b IconCompatParcelizer = null;
    private static int read = 1;
    private static int write;

    public static TimeChangedBlockingDialogFragment RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        TimeChangedBlockingDialogFragment timeChangedBlockingDialogFragment = new TimeChangedBlockingDialogFragment();
        int i2 = write + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return timeChangedBlockingDialogFragment;
    }

    public static void RemoteActionCompatParcelizer(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = 2 % 2;
        if (inputConnection != null) {
            int i2 = read + 39;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (editorInfo.hintText == null) {
                int i4 = write + 101;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
                    int i6 = write + 23;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        parent.getParent();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
    }
}
