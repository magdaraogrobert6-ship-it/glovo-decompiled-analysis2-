package o;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ContentTypeCompanion extends DragAndDropNodeonMovedinlinedfirstDescendantOrNull1 {
    public CancellableContinuationImpl IconCompatParcelizer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;

    @Override // o.DragAndDropNodeonMovedinlinedfirstDescendantOrNull1
    public final void RemoteActionCompatParcelizer() {
        this.serializer = null;
        this.IconCompatParcelizer = null;
    }

    @Override // o.DragAndDropNodeonMovedinlinedfirstDescendantOrNull1
    public final void RemoteActionCompatParcelizer(Throwable th) {
        CancellableContinuationImpl cancellableContinuationImpl = this.IconCompatParcelizer;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.resumeWith(coil3.ExtrasKt.IconCompatParcelizer(th));
        }
    }
}
