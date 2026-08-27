package o;

/* JADX INFO: loaded from: classes2.dex */
public final class remeasureBRTryo0 implements accessdetachAndRemoveNode {
    public static final remeasureBRTryo0 MediaBrowserCompatMediaItem = new remeasureBRTryo0();
    public static final accessgetAggregateChildKindSet MediaSessionCompatResultReceiverWrapper = accessgetAggregateChildKindSet.read("sdkVersion");
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = accessgetAggregateChildKindSet.read("gmpAppId");
    public static final accessgetAggregateChildKindSet PlaybackStateCompatCustomAction = accessgetAggregateChildKindSet.read("platform");
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = accessgetAggregateChildKindSet.read("installationUuid");
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("firebaseInstallationId");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("firebaseAuthenticationToken");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("appQualitySessionId");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("buildVersion");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("displayVersion");
    public static final accessgetAggregateChildKindSet MediaSessionCompatToken = accessgetAggregateChildKindSet.read("session");
    public static final accessgetAggregateChildKindSet RatingCompat = accessgetAggregateChildKindSet.read("ndkPayload");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("appExitInfo");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        ensureSubtreeLookaheadReplaced ensuresubtreelookaheadreplaced = (ensureSubtreeLookaheadReplaced) ((traceMeasureLayout) obj);
        accessupdatenode.write(MediaSessionCompatResultReceiverWrapper, ensuresubtreelookaheadreplaced.PlaybackStateCompatCustomAction);
        accessupdatenode.write(MediaDescriptionCompat, ensuresubtreelookaheadreplaced.MediaSessionCompatQueueItem);
        accessupdatenode.write(PlaybackStateCompatCustomAction, ensuresubtreelookaheadreplaced.MediaMetadataCompat);
        accessupdatenode.write(MediaMetadataCompat, ensuresubtreelookaheadreplaced.RatingCompat);
        accessupdatenode.write(MediaSessionCompatQueueItem, ensuresubtreelookaheadreplaced.MediaBrowserCompatMediaItem);
        accessupdatenode.write(IconCompatParcelizer, ensuresubtreelookaheadreplaced.read);
        accessupdatenode.write(RemoteActionCompatParcelizer, ensuresubtreelookaheadreplaced.serializer);
        accessupdatenode.write(serializer, ensuresubtreelookaheadreplaced.IconCompatParcelizer);
        accessupdatenode.write(read, ensuresubtreelookaheadreplaced.RemoteActionCompatParcelizer);
        accessupdatenode.write(MediaSessionCompatToken, ensuresubtreelookaheadreplaced.ParcelableVolumeInfo);
        accessupdatenode.write(RatingCompat, ensuresubtreelookaheadreplaced.MediaDescriptionCompat);
        accessupdatenode.write(write, ensuresubtreelookaheadreplaced.write);
    }
}
