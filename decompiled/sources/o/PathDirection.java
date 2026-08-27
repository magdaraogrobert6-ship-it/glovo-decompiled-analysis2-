package o;

/* JADX INFO: loaded from: classes.dex */
public final class PathDirection {
    public final ShaderKt IconCompatParcelizer;
    public final coil3.RealImageLoader RemoteActionCompatParcelizer;
    public final or serializer;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        or orVar = this.serializer;
        return orVar.IconCompatParcelizer(this.IconCompatParcelizer) + ((orVar.hashCode() + (iHashCode * 31)) * 31);
    }

    public PathDirection(coil3.RealImageLoader realImageLoader, ShaderKt shaderKt, or orVar) {
        this.RemoteActionCompatParcelizer = realImageLoader;
        this.IconCompatParcelizer = shaderKt;
        this.serializer = orVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathDirection)) {
            return false;
        }
        PathDirection pathDirection = (PathDirection) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, pathDirection.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        or orVar = pathDirection.serializer;
        or orVar2 = this.serializer;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{orVar2, orVar}, getCieXyz.write())).booleanValue() && orVar2.serializer(this.IconCompatParcelizer, pathDirection.IconCompatParcelizer);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.RemoteActionCompatParcelizer + ", request=" + this.IconCompatParcelizer + ", modelEqualityDelegate=" + this.serializer + ")";
    }
}
