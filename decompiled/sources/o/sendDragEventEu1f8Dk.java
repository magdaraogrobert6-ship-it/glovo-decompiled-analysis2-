package o;

/* JADX INFO: loaded from: classes.dex */
public final class sendDragEventEu1f8Dk implements androidx.compose.animation.AnimatedVisibilityScope {
    public final /* synthetic */ androidx.compose.animation.AnimatedVisibilityScope read;

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final androidx.compose.ui.Modifier animateEnterExit(androidx.compose.ui.Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt) {
        return this.read.animateEnterExit(modifier, scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final androidx.compose.animation.core.Transition serializer() {
        return this.read.serializer();
    }

    public sendDragEventEu1f8Dk(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope) {
        this.read = animatedVisibilityScope;
    }
}
