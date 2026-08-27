package o;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class setSwitchTypeface {
    public final setSwitchMinWidth IconCompatParcelizer;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public setSwitchTypeface(int i, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.IconCompatParcelizer = new setThumbTextPadding(new OutputConfiguration(i, surface));
        } else {
            this.IconCompatParcelizer = new setSwitchMinWidth(new setTextOn(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setSwitchTypeface)) {
            return false;
        }
        return this.IconCompatParcelizer.equals(((setSwitchTypeface) obj).IconCompatParcelizer);
    }

    public setSwitchTypeface(setSwitchMinWidth setswitchminwidth) {
        this.IconCompatParcelizer = setswitchminwidth;
    }
}
