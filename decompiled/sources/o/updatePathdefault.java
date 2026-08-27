package o;

/* JADX INFO: loaded from: classes.dex */
public final class updatePathdefault {
    public final coil3.RealImageLoader RemoteActionCompatParcelizer;
    public final Object serializer;
    public final or write;

    public final int hashCode() {
        or orVar = this.write;
        int iHashCode = orVar.hashCode();
        return this.RemoteActionCompatParcelizer.hashCode() + ((orVar.IconCompatParcelizer(this.serializer) + (iHashCode * 31)) * 31);
    }

    public updatePathdefault(Object obj, or orVar, coil3.RealImageLoader realImageLoader) {
        this.serializer = obj;
        this.write = orVar;
        this.RemoteActionCompatParcelizer = realImageLoader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof updatePathdefault)) {
            return false;
        }
        updatePathdefault updatepathdefault = (updatePathdefault) obj;
        or orVar = updatepathdefault.write;
        or orVar2 = this.write;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{orVar2, orVar}, getCieXyz.write())).booleanValue() && orVar2.serializer(this.serializer, updatepathdefault.serializer) && this.RemoteActionCompatParcelizer == updatepathdefault.RemoteActionCompatParcelizer;
    }
}
