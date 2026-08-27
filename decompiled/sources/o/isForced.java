package o;

/* JADX INFO: loaded from: classes2.dex */
public final class isForced {
    public final MeasureAndLayoutDelegatePostponedRequest IconCompatParcelizer;
    public final MeasureAndLayoutDelegateKt RemoteActionCompatParcelizer;
    public final isLookahead serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003) ^ this.serializer.hashCode();
    }

    public isForced(MeasureAndLayoutDelegatePostponedRequest measureAndLayoutDelegatePostponedRequest, MeasureAndLayoutDelegateKt measureAndLayoutDelegateKt, isLookahead islookahead) {
        this.IconCompatParcelizer = measureAndLayoutDelegatePostponedRequest;
        this.RemoteActionCompatParcelizer = measureAndLayoutDelegateKt;
        this.serializer = islookahead;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isForced)) {
            return false;
        }
        isForced isforced = (isForced) obj;
        return this.IconCompatParcelizer.equals(isforced.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(isforced.RemoteActionCompatParcelizer) && this.serializer.equals(isforced.serializer);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.IconCompatParcelizer + ", osData=" + this.RemoteActionCompatParcelizer + ", deviceData=" + this.serializer + "}";
    }
}
