package o;

/* JADX INFO: loaded from: classes4.dex */
public final class prepareInAppMessage extends r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y {
    public int MediaMetadataCompat;
    public final requestDisallowParentIntercept MediaSessionCompatQueueItem;
    public final int RatingCompat;

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    public final SwipeDismissTouchListenerVerticalDismissDirection RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prepareInAppMessage(resetTransientState resettransientstate, requestDisallowParentIntercept requestdisallowparentintercept) {
        super(resettransientstate, null);
        resettransientstate.getClass();
        requestdisallowparentintercept.getClass();
        this.MediaSessionCompatQueueItem = requestdisallowparentintercept;
        this.RatingCompat = requestdisallowparentintercept.content.size();
        this.MediaMetadataCompat = -1;
    }

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    public final SwipeDismissTouchListenerVerticalDismissDirection RemoteActionCompatParcelizer(String str) {
        str.getClass();
        return (SwipeDismissTouchListenerVerticalDismissDirection) this.MediaSessionCompatQueueItem.content.get(Integer.parseInt(str));
    }

    @Override // o.createInAppMessageViewlambda1
    public final int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        int i = this.MediaMetadataCompat;
        if (i >= this.RatingCompat - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.MediaMetadataCompat = i2;
        return i2;
    }

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    public final String MediaDescriptionCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return String.valueOf(i);
    }
}
