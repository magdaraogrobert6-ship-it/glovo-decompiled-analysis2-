package o;

/* JADX INFO: loaded from: classes.dex */
public final class enterPictureInPictureMode extends computeHorizontalBoundsdefault {
    public final Object IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;

    public final int hashCode() {
        return Long.hashCode(this.RemoteActionCompatParcelizer) + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public enterPictureInPictureMode(long j, Object obj) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enterPictureInPictureMode)) {
            return false;
        }
        enterPictureInPictureMode enterpictureinpicturemode = (enterPictureInPictureMode) obj;
        return this.IconCompatParcelizer.equals(enterpictureinpicturemode.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == enterpictureinpicturemode.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictiveBackHandlerInfo(owner=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", compositeKey=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
