package o;

/* JADX INFO: loaded from: classes.dex */
public final class BoxKt extends androidx.compose.animation.core.TransitionState {
    public final PopulateViewStructure_androidKtpopulate7 read;
    public final PopulateViewStructure_androidKtpopulate7 write;

    public BoxKt(Object obj) {
        super(0);
        this.read = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(obj);
        this.write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(obj);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void read(androidx.compose.animation.core.Transition transition) {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void write() {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object IconCompatParcelizer() {
        return this.read.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object RemoteActionCompatParcelizer() {
        return this.write.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void write(Object obj) {
        ((onShowTranslationui) this.read).setValue(obj);
    }
}
