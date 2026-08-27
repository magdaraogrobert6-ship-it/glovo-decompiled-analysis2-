package o;

/* JADX INFO: loaded from: classes2.dex */
public final class observeMeasureSnapshotReadsAffectingLookaheadui implements decodeByte {
    public final /* synthetic */ int MediaMetadataCompat;
    public static final observeMeasureSnapshotReadsAffectingLookaheadui read = new observeMeasureSnapshotReadsAffectingLookaheadui(1);
    public static final observeMeasureSnapshotReadsAffectingLookaheadui write = new observeMeasureSnapshotReadsAffectingLookaheadui(2);
    public static final observeMeasureSnapshotReadsAffectingLookaheadui serializer = new observeMeasureSnapshotReadsAffectingLookaheadui(0);
    public static final observeMeasureSnapshotReadsAffectingLookaheadui RemoteActionCompatParcelizer = new observeMeasureSnapshotReadsAffectingLookaheadui(3);
    public static final observeMeasureSnapshotReadsAffectingLookaheadui IconCompatParcelizer = new observeMeasureSnapshotReadsAffectingLookaheadui(4);

    public /* synthetic */ observeMeasureSnapshotReadsAffectingLookaheadui(int i) {
        this.MediaMetadataCompat = i;
    }

    @Override // o.decodeByte
    public final boolean write(int i) {
        int i2 = this.MediaMetadataCompat;
        if (i2 == 0) {
            return observeReadsui.forNumber(i) != null;
        }
        if (i2 == 1) {
            return observeLayoutSnapshotReadsui.forNumber(i) != null;
        }
        if (i2 == 2) {
            return observeMeasureSnapshotReadsui.forNumber(i) != null;
        }
        if (i2 != 3) {
            return PointerInputModifierNodeKt.forNumber(i) != null;
        }
        return OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1.forNumber(i) != null;
    }
}
