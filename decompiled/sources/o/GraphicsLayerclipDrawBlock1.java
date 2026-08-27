package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class GraphicsLayerclipDrawBlock1 implements setCompositingStrategyWpw9cng {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    @Override // o.setCompositingStrategyWpw9cng
    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.setCompositingStrategyWpw9cng
    public final String write() {
        return this.read;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        String str = this.IconCompatParcelizer;
        return this.RemoteActionCompatParcelizer.hashCode() + (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31);
    }

    public GraphicsLayerclipDrawBlock1(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerclipDrawBlock1)) {
            return false;
        }
        GraphicsLayerclipDrawBlock1 graphicsLayerclipDrawBlock1 = (GraphicsLayerclipDrawBlock1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, graphicsLayerclipDrawBlock1.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, graphicsLayerclipDrawBlock1.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, graphicsLayerclipDrawBlock1.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Customer(orderCode=", this.read, ", pushAlert=", this.IconCompatParcelizer, ", message="), this.RemoteActionCompatParcelizer, ")");
    }
}
