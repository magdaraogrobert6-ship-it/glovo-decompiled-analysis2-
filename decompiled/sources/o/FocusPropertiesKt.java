package o;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public final class FocusPropertiesKt {
    public final getFunctionDelegate RemoteActionCompatParcelizer;

    public static FocusPropertiesKt IconCompatParcelizer(NestedScrollView nestedScrollView) {
        return new FocusPropertiesKt(nestedScrollView);
    }

    public final void read(int i, int i2, int i3, boolean z) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i, i2, i3, z);
    }

    public final void serializer(int i, int i2, int i3, int i4) {
        this.RemoteActionCompatParcelizer.write(i, i2, i3, i4);
    }

    public FocusPropertiesKt(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.RemoteActionCompatParcelizer = new toUsingEnterExitScope(nestedScrollView);
        } else {
            this.RemoteActionCompatParcelizer = new Timestamp.Companion(0);
        }
    }
}
