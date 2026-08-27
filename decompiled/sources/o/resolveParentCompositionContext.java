package o;

/* JADX INFO: loaded from: classes4.dex */
public final class resolveParentCompositionContext implements getTextInputServiceannotations {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ resolveParentCompositionContext(onAttachedToWindowlambda0 onattachedtowindowlambda0, int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        return this.RemoteActionCompatParcelizer != 0 ? new getHasComposition() : new disposeComposition();
    }
}
