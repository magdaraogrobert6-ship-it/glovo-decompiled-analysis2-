package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExtendedSrgblambda1 implements encodeColorList {
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ ExtendedSrgblambda1(int i, Object obj) {
        this.read = i;
        this.write = obj;
    }

    @Override // o.encodeColorList
    public final void serializer() {
        int i = this.read;
        Object obj = this.write;
        if (i == 0) {
            ExtendedSrgblambda0 extendedSrgblambda0 = (ExtendedSrgblambda0) obj;
            boolean z = extendedSrgblambda0.PlaybackStateCompatCustomAction.write() == 1.0f;
            if (z != extendedSrgblambda0.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                extendedSrgblambda0.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = z;
                extendedSrgblambda0.ParcelableVolumeInfo.invalidateSelf();
                return;
            }
            return;
        }
        if (i == 1) {
            ((AdaptationCompanion) obj).PlaybackStateCompat = true;
        } else if (i != 2) {
            ((AdaptationCompanion) obj).PlaybackStateCompat = true;
        } else {
            ((AdaptationCompanion) obj).PlaybackStateCompat = true;
        }
    }
}
