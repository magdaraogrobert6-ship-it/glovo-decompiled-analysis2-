package o;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class prepareInAppMessageWithBitmapDownloadlambda0 extends prepareInAppMessagelambda1 {
    public final List MediaBrowserCompatMediaItem;
    public int MediaSessionCompatToken;
    public final int ParcelableVolumeInfo;
    public final r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k PlaybackStateCompatCustomAction;

    @Override // o.prepareInAppMessagelambda1, o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    public final SwipeDismissTouchListenerVerticalDismissDirection RemoteActionCompatParcelizer() {
        return this.PlaybackStateCompatCustomAction;
    }

    @Override // o.prepareInAppMessagelambda1, o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y, o.createInAppMessageViewlambda1
    public final void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
    }

    @Override // o.prepareInAppMessagelambda1
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem */
    public final r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k RemoteActionCompatParcelizer() {
        return this.PlaybackStateCompatCustomAction;
    }

    @Override // o.prepareInAppMessagelambda1, o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    public final String MediaDescriptionCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return (String) this.MediaBrowserCompatMediaItem.get(i / 2);
    }

    @Override // o.prepareInAppMessagelambda1, o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    public final SwipeDismissTouchListenerVerticalDismissDirection RemoteActionCompatParcelizer(String str) {
        str.getClass();
        return this.MediaSessionCompatToken % 2 == 0 ? TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(str) : (SwipeDismissTouchListenerVerticalDismissDirection) onMove.read(this.PlaybackStateCompatCustomAction, str);
    }

    @Override // o.prepareInAppMessagelambda1, o.createInAppMessageViewlambda1
    public final int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        int i = this.MediaSessionCompatToken;
        if (i >= this.ParcelableVolumeInfo - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.MediaSessionCompatToken = i2;
        return i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prepareInAppMessageWithBitmapDownloadlambda0(resetTransientState resettransientstate, r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k) {
        super(resettransientstate, r8lambdaerwhggzq_gqgn8cultnvrcshm8k, (String) null, 12);
        resettransientstate.getClass();
        this.PlaybackStateCompatCustomAction = r8lambdaerwhggzq_gqgn8cultnvrcshm8k;
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(r8lambdaerwhggzq_gqgn8cultnvrcshm8k.content.keySet());
        this.MediaBrowserCompatMediaItem = listPlaybackStateCompat;
        this.ParcelableVolumeInfo = listPlaybackStateCompat.size() * 2;
        this.MediaSessionCompatToken = -1;
    }
}
