package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getCollapseIcon implements setTitleMarginStart {
    public final long IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final OnePixelShiftQuirk read;
    public final android.graphics.Matrix serializer;
    public final int write;

    @Override // o.setTitleMarginStart
    public final OnePixelShiftQuirk IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.setTitleMarginStart
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.setTitleMarginStart
    public final int read() {
        return this.write;
    }

    @Override // o.setTitleMarginStart
    public final long serializer() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        long j = this.IconCompatParcelizer;
        int i = this.write;
        int iHashCode2 = this.serializer.hashCode();
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ iHashCode2) * 1000003) ^ this.RemoteActionCompatParcelizer;
    }

    @Override // o.setTitleMarginStart
    public final void serializer(ExcludeStretchedVideoQualityQuirk excludeStretchedVideoQualityQuirk) {
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer(this.write);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getCollapseIcon)) {
            return false;
        }
        getCollapseIcon getcollapseicon = (getCollapseIcon) obj;
        return this.read.equals(getcollapseicon.read) && this.IconCompatParcelizer == getcollapseicon.IconCompatParcelizer && this.write == getcollapseicon.write && this.serializer.equals(getcollapseicon.serializer) && this.RemoteActionCompatParcelizer == getcollapseicon.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.read);
        sb.append(", timestamp=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", rotationDegrees=");
        sb.append(this.write);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.serializer);
        sb.append(", flashState=");
        return af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "}", sb);
    }

    public getCollapseIcon(OnePixelShiftQuirk onePixelShiftQuirk, long j, int i, android.graphics.Matrix matrix, int i2) {
        if (onePixelShiftQuirk == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null tagBundle");
            throw null;
        }
        this.read = onePixelShiftQuirk;
        this.IconCompatParcelizer = j;
        this.write = i;
        if (matrix == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null sensorToBufferTransformMatrix");
            throw null;
        }
        this.serializer = matrix;
        this.RemoteActionCompatParcelizer = i2;
    }
}
