package o;

/* JADX INFO: loaded from: classes.dex */
public final class BoxScopeInstance implements Arrangement {
    public final long IconCompatParcelizer;
    public final BoxMeasurePolicy RemoteActionCompatParcelizer;
    public final ArrangementVertical read;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return Long.hashCode(this.IconCompatParcelizer) + ((this.RemoteActionCompatParcelizer.hashCode() + ((iHashCode + 62) * 31)) * 31);
    }

    @Override // o.TrackpadScrollingLogic
    public final size3ABfNKs serializer(requiredSizeInqDBjuR0default requiredsizeinqdbjur0default) {
        return new consumeWindowInsets(this.read.serializer(requiredsizeinqdbjur0default), this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }

    public BoxScopeInstance(ArrangementVertical arrangementVertical, BoxMeasurePolicy boxMeasurePolicy, long j) {
        this.read = arrangementVertical;
        this.RemoteActionCompatParcelizer = boxMeasurePolicy;
        this.IconCompatParcelizer = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BoxScopeInstance) {
            BoxScopeInstance boxScopeInstance = (BoxScopeInstance) obj;
            if (boxScopeInstance.read == this.read && boxScopeInstance.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && boxScopeInstance.IconCompatParcelizer == this.IconCompatParcelizer) {
                return true;
            }
        }
        return false;
    }
}
