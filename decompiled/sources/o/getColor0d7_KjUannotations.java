package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getColor0d7_KjUannotations implements RadialGradientShader8uybcMk {
    public final boolean IconCompatParcelizer;
    public final accessgetPointscp MediaMetadataCompat;
    public final ShaderKt RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final accessrewindjd read;
    public final getSegmentdefault serializer;
    public final boolean write;

    @Override // o.RadialGradientShader8uybcMk
    public final accessrewindjd IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.RadialGradientShader8uybcMk
    public final ShaderKt write() {
        return this.RatingCompat;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.RatingCompat.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        accessgetPointscp accessgetpointscp = this.MediaMetadataCompat;
        int iHashCode4 = accessgetpointscp == null ? 0 : accessgetpointscp.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        return Boolean.hashCode(this.write) + d$$ExternalSyntheticOutline0.m((((((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0)) * 31, 31, this.IconCompatParcelizer);
    }

    public getColor0d7_KjUannotations(accessrewindjd accessrewindjdVar, ShaderKt shaderKt, getSegmentdefault getsegmentdefault, accessgetPointscp accessgetpointscp, String str, boolean z, boolean z2) {
        this.read = accessrewindjdVar;
        this.RatingCompat = shaderKt;
        this.serializer = getsegmentdefault;
        this.MediaMetadataCompat = accessgetpointscp;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = z;
        this.write = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getColor0d7_KjUannotations)) {
            return false;
        }
        getColor0d7_KjUannotations getcolor0d7_kjuannotations = (getColor0d7_KjUannotations) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getcolor0d7_kjuannotations.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, getcolor0d7_kjuannotations.RatingCompat}, getCieXyz.write())).booleanValue() || this.serializer != getcolor0d7_kjuannotations.serializer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, getcolor0d7_kjuannotations.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getcolor0d7_kjuannotations.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == getcolor0d7_kjuannotations.IconCompatParcelizer && this.write == getcolor0d7_kjuannotations.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.read);
        sb.append(", request=");
        sb.append(this.RatingCompat);
        sb.append(", dataSource=");
        sb.append(this.serializer);
        sb.append(", memoryCacheKey=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", diskCacheKey=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.RemoteActionCompatParcelizer, ", isSampled=", ", isPlaceholderCached=", sb, this.IconCompatParcelizer);
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, ")");
    }
}
