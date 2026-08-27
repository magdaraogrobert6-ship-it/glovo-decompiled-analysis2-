package o;

/* JADX INFO: loaded from: classes.dex */
public final class toComposeBlendMode implements android.transition.Transition.TransitionListener {
    public final /* synthetic */ Runnable write;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(android.transition.Transition transition) {
        this.write.run();
    }

    public toComposeBlendMode(Runnable runnable) {
        this.write = runnable;
    }
}
