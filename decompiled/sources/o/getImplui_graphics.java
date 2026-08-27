package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getImplui_graphics {
    public final String serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        String str = this.write;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public getImplui_graphics(String str, String str2) {
        str.getClass();
        this.serializer = str;
        this.write = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getImplui_graphics)) {
            return false;
        }
        getImplui_graphics getimplui_graphics = (getImplui_graphics) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getimplui_graphics.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getimplui_graphics.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("MessageInfo(message=", this.serializer, ", timeSent=", this.write, ")");
    }
}
