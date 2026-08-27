package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getLastResult extends LayoutNodeSubcompositionsStatecreateMeasureResult1 {
    public final /* synthetic */ setViewportBounds MediaBrowserCompatMediaItem;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getLastResult(setViewportBounds setviewportbounds, LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221, int i) {
        super(lookaheadScopeKtLookaheadScope221);
        this.write = i;
        this.MediaBrowserCompatMediaItem = setviewportbounds;
    }

    @Override // o.LayoutNodeSubcompositionsStatecreateMeasureResult1
    public final void serializer() {
        int i = this.write;
        setViewportBounds setviewportbounds = this.MediaBrowserCompatMediaItem;
        if (i != 0) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Tasks have been queued for a long time");
            return;
        }
        setviewportbounds.MediaSessionCompatToken();
        if (setviewportbounds.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()) {
            getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.PlaybackStateCompat.RemoteActionCompatParcelizer("Inactivity, disconnecting from the service");
            setviewportbounds.ComponentActivity();
        }
    }
}
