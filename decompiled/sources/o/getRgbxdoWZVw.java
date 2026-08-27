package o;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getRgbxdoWZVw implements getFrameworkTileModeDecal {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ CancellableContinuationImpl write;

    public /* synthetic */ getRgbxdoWZVw(CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.IconCompatParcelizer = i;
        this.write = cancellableContinuationImpl;
    }

    @Override // o.getFrameworkTileModeDecal
    public final void serializer(Object obj) {
        int i = this.IconCompatParcelizer;
        CancellableContinuationImpl cancellableContinuationImpl = this.write;
        if (i == 0) {
            if (cancellableContinuationImpl.RatingCompat()) {
                return;
            }
            cancellableContinuationImpl.resumeWith(obj);
        } else {
            Throwable th = (Throwable) obj;
            if (cancellableContinuationImpl.RatingCompat()) {
                return;
            }
            th.getClass();
            cancellableContinuationImpl.resumeWith(new isItemDismissable(th));
        }
    }
}
