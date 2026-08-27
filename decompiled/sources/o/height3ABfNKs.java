package o;

/* JADX INFO: loaded from: classes.dex */
public final class height3ABfNKs implements getPersonMiddleInitial {
    public final /* synthetic */ androidx.compose.animation.core.Transition read;

    @Override // o.getPersonMiddleInitial
    public final void dispose() {
        androidx.compose.animation.core.Transition transition = this.read;
        transition.onTransitionEnd$animation_core();
        transition.MediaSessionCompatToken.write();
    }

    public height3ABfNKs(androidx.compose.animation.core.Transition transition) {
        this.read = transition;
    }
}
