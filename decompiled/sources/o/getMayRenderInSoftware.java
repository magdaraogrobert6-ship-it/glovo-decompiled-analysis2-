package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getMayRenderInSoftware {
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final Boolean serializer;
    public final String write;

    public final boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Boolean read() {
        return this.serializer;
    }

    public final boolean serializer() {
        return this.read;
    }

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.read);
        Boolean bool = this.serializer;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.write;
        return ((iM + iHashCode) * 31) + (str != null ? str.hashCode() : 0);
    }

    public getMayRenderInSoftware(boolean z, boolean z2, Boolean bool, String str) {
        this.RemoteActionCompatParcelizer = z;
        this.read = z2;
        this.serializer = bool;
        this.write = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMayRenderInSoftware)) {
            return false;
        }
        getMayRenderInSoftware getmayrenderinsoftware = (getMayRenderInSoftware) obj;
        if (this.RemoteActionCompatParcelizer != getmayrenderinsoftware.RemoteActionCompatParcelizer || this.read != getmayrenderinsoftware.read) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getmayrenderinsoftware.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getmayrenderinsoftware.write}, getCieXyz.write())).booleanValue();
    }

    public static getMayRenderInSoftware read(getMayRenderInSoftware getmayrenderinsoftware, boolean z, boolean z2, Boolean bool, String str, int i) {
        if ((i & 2) != 0) {
            z2 = getmayrenderinsoftware.read;
        }
        if ((i & 4) != 0) {
            bool = getmayrenderinsoftware.serializer;
        }
        if ((i & 8) != 0) {
            str = getmayrenderinsoftware.write;
        }
        getmayrenderinsoftware.getClass();
        return new getMayRenderInSoftware(z, z2, bool, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UIState(showLoading=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isError=");
        sb.append(this.read);
        sb.append(", shouldShowWebChat=");
        sb.append(this.serializer);
        sb.append(", chatID=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, ')');
    }

    public /* synthetic */ getMayRenderInSoftware() {
        this(false, false, null, null);
    }
}
