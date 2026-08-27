package o;

/* JADX INFO: loaded from: classes.dex */
public final class FlowMeasurePolicy implements TrackpadScrollingLogic {
    public final TrackpadScrollingLogic RemoteActionCompatParcelizer;
    public final long read;

    public final int hashCode() {
        return Long.hashCode(this.read) + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    @Override // o.TrackpadScrollingLogic
    public final size3ABfNKs serializer(requiredSizeInqDBjuR0default requiredsizeinqdbjur0default) {
        return new FlowRow(this.RemoteActionCompatParcelizer.serializer(requiredsizeinqdbjur0default), this.read);
    }

    public FlowMeasurePolicy(Arrangement arrangement, long j) {
        this.RemoteActionCompatParcelizer = arrangement;
        this.read = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        if (flowMeasurePolicy.read == this.read) {
            Object[] objArr = {flowMeasurePolicy.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
