package o;

/* JADX INFO: loaded from: classes.dex */
public final class invokecomroadrunnerdeliveryonthewaycrowdsourcingtermspresentationTermsAndConditionsFragmentExternalSyntheticLambda1 implements accessanimateToThreshold {
    public final androidx.compose.foundation.pager.PagerState write;

    @Override // o.accessanimateToThreshold
    public final int IconCompatParcelizer() {
        return this.write.read();
    }

    @Override // o.accessanimateToThreshold
    public final int RemoteActionCompatParcelizer() {
        androidx.compose.foundation.pager.PagerState pagerState = this.write;
        return Math.min(pagerState.read() - 1, ((androidx.compose.foundation.pager.MeasuredPage) ((ComposePausableCompositionExceptionoperationsSequence1) onContentCardDismissed.MediaDescriptionCompat(pagerState.MediaSessionCompatQueueItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4))).RemoteActionCompatParcelizer);
    }

    @Override // o.accessanimateToThreshold
    public final boolean read() {
        return !this.write.MediaSessionCompatQueueItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.isEmpty();
    }

    @Override // o.accessanimateToThreshold
    public final int serializer() {
        return Math.max(0, this.write.PlaybackStateCompatCustomAction);
    }

    @Override // o.accessanimateToThreshold
    public final int write() {
        int i;
        androidx.compose.foundation.pager.PagerState pagerState = this.write;
        if (pagerState.MediaSessionCompatQueueItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.size() == 0) {
            return 0;
        }
        int iWrite = MultiSubscriptionSnapshotFlowManager.write(pagerState.MediaSessionCompatQueueItem());
        int i2 = pagerState.MediaSessionCompatQueueItem().PlaybackStateCompatCustomAction + pagerState.MediaSessionCompatQueueItem().ComponentActivity;
        if (i2 != 0 && (i = iWrite / i2) >= 1) {
            return i;
        }
        return 1;
    }

    public invokecomroadrunnerdeliveryonthewaycrowdsourcingtermspresentationTermsAndConditionsFragmentExternalSyntheticLambda1(androidx.compose.foundation.pager.PagerState pagerState) {
        this.write = pagerState;
    }
}
