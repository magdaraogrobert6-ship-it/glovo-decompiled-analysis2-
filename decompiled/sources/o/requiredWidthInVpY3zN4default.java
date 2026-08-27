package o;

import com.huawei.hms.location.LocationRequest;

/* JADX INFO: loaded from: classes.dex */
public final class requiredWidthInVpY3zN4default implements accessanimateDecay {
    public final int IconCompatParcelizer;
    public final fling RemoteActionCompatParcelizer;
    public final int write;

    @Override // o.TrackpadScrollingLogic
    public final size3ABfNKs serializer(requiredSizeInqDBjuR0default requiredsizeinqdbjur0default) {
        return new UnspecifiedConstraintsNode(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        return ((this.RemoteActionCompatParcelizer.hashCode() + (i * 31)) * 31) + this.write;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof requiredWidthInVpY3zN4default)) {
            return false;
        }
        requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = (requiredWidthInVpY3zN4default) obj;
        if (requiredwidthinvpy3zn4default.IconCompatParcelizer != this.IconCompatParcelizer || requiredwidthinvpy3zn4default.write != this.write) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requiredwidthinvpy3zn4default.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    @Override // o.accessanimateDecay
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final SizeNode serializer(requiredSizeInqDBjuR0default requiredsizeinqdbjur0default) {
        return new UnspecifiedConstraintsNode(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer);
    }

    public requiredWidthInVpY3zN4default(int i, fling flingVar, int i2) {
        this((i2 & 1) != 0 ? LocationRequest.PRIORITY_INDOOR : i, (i2 & 2) != 0 ? 0 : 3000, (i2 & 4) != 0 ? performFling.RemoteActionCompatParcelizer : flingVar);
    }

    public requiredWidthInVpY3zN4default(int i, int i2, fling flingVar) {
        this.IconCompatParcelizer = i;
        this.write = i2;
        this.RemoteActionCompatParcelizer = flingVar;
    }
}
