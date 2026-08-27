package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class setNativeAntiAlias extends setNativeBlendModeGB0RdKg {
    public long MediaDescriptionCompat;
    public long RatingCompat;

    @Override // o.setNativeBlendModeGB0RdKg
    public final setNativeBlendModeGB0RdKg serializer() {
        return new setNativeAntiAlias(this.IconCompatParcelizer, this.serializer, this.write, this.RatingCompat, this.MediaDescriptionCompat, this.RemoteActionCompatParcelizer, new ArrayList(this.read));
    }

    @Override // o.setNativeBlendModeGB0RdKg
    public final boolean equals(Object obj) {
        if (!(obj instanceof setNativeAntiAlias) || !super.equals(obj)) {
            return false;
        }
        setNativeAntiAlias setnativeantialias = (setNativeAntiAlias) obj;
        return this.RatingCompat == setnativeantialias.RatingCompat && this.MediaDescriptionCompat == setnativeantialias.MediaDescriptionCompat;
    }

    @Override // o.setNativeBlendModeGB0RdKg
    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.serializer);
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.write);
        sb.append(", frameDurationTotalNanos=");
        sb.append(this.RatingCompat);
        sb.append(", frameOverrunNanos=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isJank=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", states=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.read, ')');
    }

    @Override // o.setNativeBlendModeGB0RdKg
    public final int hashCode() {
        int iHashCode = super.hashCode();
        return Long.hashCode(this.MediaDescriptionCompat) + (Long.hashCode(this.RatingCompat) * 31) + (iHashCode * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setNativeAntiAlias(long j, long j2, long j3, long j4, long j5, boolean z, ArrayList arrayList) {
        super(j, j2, z, arrayList);
        arrayList.getClass();
        this.write = j3;
        this.RatingCompat = j4;
        this.MediaDescriptionCompat = j5;
    }
}
