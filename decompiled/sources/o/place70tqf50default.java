package o;

import android.animation.TimeInterpolator;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class place70tqf50default {
    public int IconCompatParcelizer;
    public TimeInterpolator RemoteActionCompatParcelizer;
    public long read;
    public long serializer;
    public int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof place70tqf50default)) {
            return false;
        }
        place70tqf50default place70tqf50defaultVar = (place70tqf50default) obj;
        if (this.serializer == place70tqf50defaultVar.serializer && this.read == place70tqf50defaultVar.read && this.write == place70tqf50defaultVar.write && this.IconCompatParcelizer == place70tqf50defaultVar.IconCompatParcelizer) {
            return IconCompatParcelizer().getClass().equals(place70tqf50defaultVar.IconCompatParcelizer().getClass());
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(place70tqf50default.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.serializer);
        sb.append(" duration: ");
        sb.append(this.read);
        sb.append(" interpolator: ");
        sb.append(IconCompatParcelizer().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.write);
        sb.append(" repeatMode: ");
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "}\n", sb);
    }

    public final TimeInterpolator IconCompatParcelizer() {
        TimeInterpolator timeInterpolator = this.RemoteActionCompatParcelizer;
        return timeInterpolator != null ? timeInterpolator : handleMotionFrameOfReferencePlacement.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        long j = this.serializer;
        long j2 = this.read;
        int i = (int) ((j2 >>> 32) ^ j2);
        int iHashCode = IconCompatParcelizer().getClass().hashCode();
        int i2 = this.write;
        return ((((iHashCode + (((((int) (j ^ (j >>> 32))) * 31) + i) * 31)) * 31) + i2) * 31) + this.IconCompatParcelizer;
    }
}
