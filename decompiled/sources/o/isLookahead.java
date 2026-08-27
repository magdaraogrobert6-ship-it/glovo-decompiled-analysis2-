package o;

import android.os.Build;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class isLookahead {
    public final int IconCompatParcelizer;
    public final long RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final boolean serializer;
    public final long write;

    public isLookahead(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.read = i;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null model");
            throw null;
        }
        this.IconCompatParcelizer = i2;
        this.RatingCompat = j;
        this.write = j2;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = i3;
        if (str2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null manufacturer");
            throw null;
        }
        if (str3 != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null modelClass");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isLookahead)) {
            return false;
        }
        isLookahead islookahead = (isLookahead) obj;
        if (this.read != islookahead.read) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.IconCompatParcelizer != islookahead.IconCompatParcelizer || this.RatingCompat != islookahead.RatingCompat || this.write != islookahead.write || this.serializer != islookahead.serializer || this.RemoteActionCompatParcelizer != islookahead.RemoteActionCompatParcelizer) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.read);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", totalRam=");
        sb.append(this.RatingCompat);
        sb.append(", diskSpace=");
        sb.append(this.write);
        sb.append(", isEmulator=");
        sb.append(this.serializer);
        sb.append(", state=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return ff$$ExternalSyntheticOutline0.m(sb, Build.PRODUCT, "}");
    }

    public final int hashCode() {
        int i = this.read;
        int iHashCode = Build.MODEL.hashCode();
        int i2 = this.IconCompatParcelizer;
        long j = this.RatingCompat;
        int i3 = (int) (j ^ (j >>> 32));
        long j2 = this.write;
        int i4 = (int) ((j2 >>> 32) ^ j2);
        int i5 = this.serializer ? 1231 : 1237;
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ this.RemoteActionCompatParcelizer) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }
}
