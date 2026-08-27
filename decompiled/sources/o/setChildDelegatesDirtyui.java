package o;

/* JADX INFO: loaded from: classes2.dex */
public final class setChildDelegatesDirtyui implements accessdetachAndRemoveNode {
    public static final setChildDelegatesDirtyui IconCompatParcelizer = new setChildDelegatesDirtyui();
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("pid");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("processName");
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("reasonCode");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("importance");
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = accessgetAggregateChildKindSet.read("pss");
    public static final accessgetAggregateChildKindSet MediaBrowserCompatMediaItem = accessgetAggregateChildKindSet.read("rss");
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = accessgetAggregateChildKindSet.read("timestamp");
    public static final accessgetAggregateChildKindSet RatingCompat = accessgetAggregateChildKindSet.read("traceFile");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("buildIdMappingForArch");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        getLookaheadRemeasureCanAffectParentSize getlookaheadremeasurecanaffectparentsize = (getLookaheadRemeasureCanAffectParentSize) ((MeasurePassDelegate) obj);
        accessupdatenode.write(RemoteActionCompatParcelizer, getlookaheadremeasurecanaffectparentsize.write);
        accessupdatenode.write(read, getlookaheadremeasurecanaffectparentsize.IconCompatParcelizer);
        accessupdatenode.write(MediaSessionCompatQueueItem, getlookaheadremeasurecanaffectparentsize.MediaSessionCompatQueueItem);
        accessupdatenode.write(write, getlookaheadremeasurecanaffectparentsize.serializer);
        accessupdatenode.write(MediaMetadataCompat, getlookaheadremeasurecanaffectparentsize.RemoteActionCompatParcelizer);
        accessupdatenode.write(MediaBrowserCompatMediaItem, getlookaheadremeasurecanaffectparentsize.RatingCompat);
        accessupdatenode.write(MediaDescriptionCompat, getlookaheadremeasurecanaffectparentsize.MediaMetadataCompat);
        accessupdatenode.write(RatingCompat, getlookaheadremeasurecanaffectparentsize.MediaDescriptionCompat);
        accessupdatenode.write(serializer, getlookaheadremeasurecanaffectparentsize.read);
    }
}
