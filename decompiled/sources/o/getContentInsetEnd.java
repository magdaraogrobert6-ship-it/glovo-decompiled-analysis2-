package o;

/* JADX INFO: loaded from: classes.dex */
public final class getContentInsetEnd {
    public final SurfaceViewNotCroppedByParentQuirk write;

    public final int hashCode() {
        return this.write.hashCode() ^ (-721379959);
    }

    public getContentInsetEnd(SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk) {
        this.write = surfaceViewNotCroppedByParentQuirk;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof getContentInsetEnd) && this.write.equals(((getContentInsetEnd) obj).write);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.write + "}";
    }
}
