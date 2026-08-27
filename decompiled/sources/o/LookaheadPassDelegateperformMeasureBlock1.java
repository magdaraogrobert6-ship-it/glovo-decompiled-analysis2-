package o;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadPassDelegateperformMeasureBlock1 implements accessdetachAndRemoveNode {
    public static final LookaheadPassDelegateperformMeasureBlock1 RatingCompat = new LookaheadPassDelegateperformMeasureBlock1();
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("execution");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("customAttributes");
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("internalKeys");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("background");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("currentProcessDetails");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("appProcessDetails");
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = accessgetAggregateChildKindSet.read("uiOrientation");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        dispatchOnPositionedCallbacks dispatchonpositionedcallbacks = (dispatchOnPositionedCallbacks) ((getPreviousPlaceOrderui) obj);
        accessupdatenode.write(read, dispatchonpositionedcallbacks.read);
        accessupdatenode.write(write, dispatchonpositionedcallbacks.serializer);
        accessupdatenode.write(MediaSessionCompatQueueItem, dispatchonpositionedcallbacks.MediaDescriptionCompat);
        accessupdatenode.write(IconCompatParcelizer, dispatchonpositionedcallbacks.write);
        accessupdatenode.write(RemoteActionCompatParcelizer, dispatchonpositionedcallbacks.RemoteActionCompatParcelizer);
        accessupdatenode.write(serializer, dispatchonpositionedcallbacks.IconCompatParcelizer);
        accessupdatenode.write(MediaMetadataCompat, dispatchonpositionedcallbacks.MediaBrowserCompatMediaItem);
    }
}
