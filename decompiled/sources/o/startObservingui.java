package o;

/* JADX INFO: loaded from: classes2.dex */
public final class startObservingui implements dataAvailable {
    public final /* synthetic */ int read;

    @Override // o.dataAvailable
    public final ifDebug IconCompatParcelizer(int i) {
        int i2 = this.read;
        if (i2 != 0) {
            return i2 != 1 ? OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1.forNumber(i) : observeLayoutSnapshotReadsui.forNumber(i);
        }
        return observeReadsui.forNumber(i);
    }
}
