package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class setExit {
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;

    public setExit(String str, int i, int i2) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setExit)) {
            return false;
        }
        setExit setexit = (setExit) obj;
        return this.IconCompatParcelizer.equals(setexit.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == setexit.RemoteActionCompatParcelizer && this.read == setexit.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.IconCompatParcelizer.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(" displayHeight=");
        return af$$ExternalSyntheticOutline0.m(this.read, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb);
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.read;
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.IconCompatParcelizer, Integer.valueOf(i), Integer.valueOf(i2), fValueOf, 0, 0, 0, fValueOf);
    }
}
