package o;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class setEnter {
    public final DisplayCutout write;

    public final int hashCode() {
        return this.write.hashCode();
    }

    public setEnter(DisplayCutout displayCutout) {
        this.write = displayCutout;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.write + "}";
    }

    public final setRight RemoteActionCompatParcelizer() {
        return Build.VERSION.SDK_INT >= 30 ? setRight.bs_(getOnEnter.bU_(this.write)) : setRight.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || setEnter.class != obj.getClass()) {
            return false;
        }
        return this.write.equals(((setEnter) obj).write);
    }
}
