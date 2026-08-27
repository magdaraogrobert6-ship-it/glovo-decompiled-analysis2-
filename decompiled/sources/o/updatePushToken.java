package o;

/* JADX INFO: loaded from: classes.dex */
public final class updatePushToken {
    public final android.util.Size IconCompatParcelizer;
    public final android.util.Size serializer;
    public final android.graphics.Rect write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        return this.serializer.hashCode() + ((this.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
    }

    public updatePushToken(android.graphics.Rect rect, android.util.Size size, android.util.Size size2) {
        size.getClass();
        size2.getClass();
        this.write = rect;
        this.IconCompatParcelizer = size;
        this.serializer = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof updatePushToken)) {
            return false;
        }
        updatePushToken updatepushtoken = (updatePushToken) obj;
        if (!this.write.equals(updatepushtoken.write)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, updatepushtoken.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, updatepushtoken.serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.write + ", childSizeToScale=" + this.IconCompatParcelizer + ", originalSelectedChildSize=" + this.serializer + ')';
    }
}
