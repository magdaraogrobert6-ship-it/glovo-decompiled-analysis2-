package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class ReusableGraphicsLayerScope {
    public final String RemoteActionCompatParcelizer;
    public final accessplusjd read;
    public final String serializer;
    public final getGraphicsDensityui write;

    public final int hashCode() {
        return this.read.read.hashCode() + IconCompatParcelizer.RemoteActionCompatParcelizer(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.serializer), this.write.serializer, 961);
    }

    public ReusableGraphicsLayerScope(String str, String str2, getGraphicsDensityui getgraphicsdensityui, accessplusjd accessplusjdVar) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.write = getgraphicsdensityui;
        this.read = accessplusjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReusableGraphicsLayerScope)) {
            return false;
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
        if (!this.RemoteActionCompatParcelizer.equals(reusableGraphicsLayerScope.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, reusableGraphicsLayerScope.serializer}, getCieXyz.write())).booleanValue() || !this.write.equals(reusableGraphicsLayerScope.write)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, reusableGraphicsLayerScope.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("NetworkRequest(url=", this.RemoteActionCompatParcelizer, ", method=", this.serializer, ", headers=");
        sbM.append(this.write);
        sbM.append(", body=null, extras=");
        sbM.append(this.read);
        sbM.append(")");
        return sbM.toString();
    }
}
