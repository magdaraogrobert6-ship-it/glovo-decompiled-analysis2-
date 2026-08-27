package o;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableKt implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.compose.animation.core.Transition serializer;

    public /* synthetic */ ScrollableKt(androidx.compose.animation.core.Transition transition, int i) {
        this.read = i;
        this.serializer = transition;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.read;
        androidx.compose.animation.core.Transition transition = this.serializer;
        return i != 0 ? transition.IconCompatParcelizer() : ((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue();
    }
}
