package o;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class setTextOff {
    public final InputConfiguration read;

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        return this.read.toString();
    }

    public setTextOff(Object obj) {
        this.read = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setTextOff)) {
            return false;
        }
        return Objects.equals(this.read, ((setTextOff) obj).read);
    }
}
