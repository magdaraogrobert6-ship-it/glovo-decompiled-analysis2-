package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setPivotOffsetk4lQ0M extends getTopLeftnOccac {
    public final String IconCompatParcelizer;
    public final getTopLeftnOccac RemoteActionCompatParcelizer;
    public final String read;
    public final ArrayList serializer;
    public final String write;

    @Override // o.getTopLeftnOccac
    public final getTopLeftnOccac IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getTopLeftnOccac
    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.getTopLeftnOccac
    public final String read() {
        return this.read;
    }

    @Override // o.getTopLeftnOccac
    public final List serializer() {
        return this.serializer;
    }

    public final int hashCode() {
        int iWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.serializer, this.read.hashCode() * 31, 31);
        String str = this.IconCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        getTopLeftnOccac gettopleftnoccac = this.RemoteActionCompatParcelizer;
        return this.write.hashCode() + ((((iWrite + iHashCode) * 31) + (gettopleftnoccac != null ? gettopleftnoccac.hashCode() : 0)) * 31);
    }

    public setPivotOffsetk4lQ0M(String str, ArrayList arrayList, String str2, getTopLeftnOccac gettopleftnoccac, String str3) {
        str.getClass();
        this.read = str;
        this.serializer = arrayList;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = gettopleftnoccac;
        this.write = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPivotOffsetk4lQ0M)) {
            return false;
        }
        setPivotOffsetk4lQ0M setpivotoffsetk4lq0m = (setPivotOffsetk4lQ0M) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, setpivotoffsetk4lq0m.read}, getCieXyz.write())).booleanValue() || !this.serializer.equals(setpivotoffsetk4lq0m.serializer)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, setpivotoffsetk4lq0m.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, setpivotoffsetk4lq0m.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && this.write.equals(setpivotoffsetk4lq0m.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dispatcher(channelId=");
        sb.append(this.read);
        sb.append(", visibleMessages=");
        sb.append(this.serializer);
        sb.append(", badgeContent=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", bgCardContent=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", headerDetailsContent=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, ")");
    }
}
