package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class offsetVpY3zN4default implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.animation.core.Transition serializer;

    public /* synthetic */ offsetVpY3zN4default(androidx.compose.animation.core.Transition transition, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = transition;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.RemoteActionCompatParcelizer;
        androidx.compose.animation.core.Transition transition = this.serializer;
        if (i != 0) {
            return Long.valueOf(transition.calculateTotalDurationNanos());
        }
        return Boolean.valueOf((((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue(), transition.MediaSessionCompatToken.IconCompatParcelizer()}, getCieXyz.write())).booleanValue() && ((onCreateVirtualViewTranslationRequestsui) transition.RatingCompat).RemoteActionCompatParcelizer() == Long.MIN_VALUE && !((Boolean) ((onShowTranslationui) transition.PlaybackStateCompat).getValue()).booleanValue()) ? false : true);
    }
}
