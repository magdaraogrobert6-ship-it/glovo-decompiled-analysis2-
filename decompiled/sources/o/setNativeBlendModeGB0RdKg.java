package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class setNativeBlendModeGB0RdKg {
    public long IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public final List read;
    public long serializer;
    public long write;

    public final int RemoteActionCompatParcelizer() {
        return this.read.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.IconCompatParcelizer) * 31, 31, this.serializer), 31, this.RemoteActionCompatParcelizer);
    }

    public setNativeBlendModeGB0RdKg serializer() {
        long j = this.IconCompatParcelizer;
        long j2 = this.serializer;
        long j3 = this.write;
        setNativeBlendModeGB0RdKg setnativeblendmodegb0rdkg = new setNativeBlendModeGB0RdKg(j, j2, this.RemoteActionCompatParcelizer, new ArrayList(this.read));
        setnativeblendmodegb0rdkg.write = j3;
        return setnativeblendmodegb0rdkg;
    }

    public setNativeBlendModeGB0RdKg(long j, long j2, boolean z, List list) {
        list.getClass();
        this.read = list;
        this.IconCompatParcelizer = j;
        this.serializer = j2;
        this.RemoteActionCompatParcelizer = z;
    }

    public boolean equals(Object obj) {
        return (obj instanceof setNativeBlendModeGB0RdKg) && read(obj) && this.write == ((setNativeBlendModeGB0RdKg) obj).write;
    }

    public final boolean read(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        setNativeBlendModeGB0RdKg setnativeblendmodegb0rdkg = (setNativeBlendModeGB0RdKg) obj;
        if (this.IconCompatParcelizer != setnativeblendmodegb0rdkg.IconCompatParcelizer || this.serializer != setnativeblendmodegb0rdkg.serializer || this.RemoteActionCompatParcelizer != setnativeblendmodegb0rdkg.RemoteActionCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, setnativeblendmodegb0rdkg.read}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.serializer);
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.write);
        sb.append(", isJank=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", states=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.read, ')');
    }

    public int hashCode() {
        return Long.hashCode(this.write) + (RemoteActionCompatParcelizer() * 31);
    }
}
