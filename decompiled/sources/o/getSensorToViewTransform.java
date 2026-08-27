package o;

/* JADX INFO: loaded from: classes.dex */
public final class getSensorToViewTransform {
    public final int IconCompatParcelizer;
    public final onDrawWithContent RemoteActionCompatParcelizer;
    public final int serializer;

    public getSensorToViewTransform(int i, int i2, onDrawWithContent ondrawwithcontent) {
        this.IconCompatParcelizer = i;
        this.serializer = i2;
        this.RemoteActionCompatParcelizer = ondrawwithcontent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getSensorToViewTransform) {
            getSensorToViewTransform getsensortoviewtransform = (getSensorToViewTransform) obj;
            return this.IconCompatParcelizer == getsensortoviewtransform.IconCompatParcelizer && this.serializer == getsensortoviewtransform.serializer && this.RemoteActionCompatParcelizer == getsensortoviewtransform.RemoteActionCompatParcelizer;
        }
        return false;
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.IconCompatParcelizer + ", rotationDegrees=" + this.serializer + ", completer=" + this.RemoteActionCompatParcelizer + "}";
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        return ((((i ^ 1000003) * 1000003) ^ this.serializer) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode();
    }
}
