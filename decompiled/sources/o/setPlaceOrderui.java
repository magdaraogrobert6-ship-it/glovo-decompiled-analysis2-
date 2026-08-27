package o;

/* JADX INFO: loaded from: classes2.dex */
public final class setPlaceOrderui implements accessdetachAndRemoveNode {
    public static final setPlaceOrderui read = new setPlaceOrderui();
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("arch");
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("model");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("cores");
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = accessgetAggregateChildKindSet.read("ram");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("diskSpace");
    public static final accessgetAggregateChildKindSet RatingCompat = accessgetAggregateChildKindSet.read("simulator");
    public static final accessgetAggregateChildKindSet MediaBrowserCompatMediaItem = accessgetAggregateChildKindSet.read("state");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("manufacturer");
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = accessgetAggregateChildKindSet.read("modelClass");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        requestLookaheadRelayoutdefault requestlookaheadrelayoutdefault = (requestLookaheadRelayoutdefault) ((placeOuterCoordinatorMLgxB_4) obj);
        accessupdatenode.write(serializer, requestlookaheadrelayoutdefault.RemoteActionCompatParcelizer);
        accessupdatenode.write(MediaSessionCompatQueueItem, requestlookaheadrelayoutdefault.write);
        accessupdatenode.write(RemoteActionCompatParcelizer, requestlookaheadrelayoutdefault.read);
        accessupdatenode.write(MediaDescriptionCompat, requestlookaheadrelayoutdefault.MediaSessionCompatQueueItem);
        accessupdatenode.write(write, requestlookaheadrelayoutdefault.IconCompatParcelizer);
        accessupdatenode.read(RatingCompat, requestlookaheadrelayoutdefault.RatingCompat);
        accessupdatenode.write(MediaBrowserCompatMediaItem, requestlookaheadrelayoutdefault.MediaBrowserCompatMediaItem);
        accessupdatenode.write(IconCompatParcelizer, requestlookaheadrelayoutdefault.serializer);
        accessupdatenode.write(MediaMetadataCompat, requestlookaheadrelayoutdefault.MediaDescriptionCompat);
    }
}
