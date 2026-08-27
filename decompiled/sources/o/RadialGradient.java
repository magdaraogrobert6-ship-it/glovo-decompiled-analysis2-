package o;

import java.util.Map;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
public final class RadialGradient {
    public final accessrewindjd IconCompatParcelizer;
    public final Map read;

    public final int hashCode() {
        return this.read.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public RadialGradient(accessrewindjd accessrewindjdVar, Map map) {
        this.IconCompatParcelizer = accessrewindjdVar;
        this.read = DelayKt.write(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, radialGradient.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, radialGradient.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Value(image=" + this.IconCompatParcelizer + ", extras=" + this.read + ")";
    }
}
