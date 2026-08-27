package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButton8cp implements accessdetachAndRemoveNode {
    public static final accessgetButton8cp MediaMetadataCompat = new accessgetButton8cp();
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("eventTimeMs");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("eventCode");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("complianceData");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("eventUptimeMs");
    public static final accessgetAggregateChildKindSet RatingCompat = accessgetAggregateChildKindSet.read("sourceExtension");
    public static final accessgetAggregateChildKindSet MediaBrowserCompatMediaItem = accessgetAggregateChildKindSet.read("sourceExtensionJsonProto3");
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("timezoneOffsetSeconds");
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = accessgetAggregateChildKindSet.read("networkConnectionInfo");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("experimentIds");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessgetCcp accessgetccp = (accessgetCcp) ((accessgetCtrlRightcp) obj);
        accessupdatenode.write(read, accessgetccp.IconCompatParcelizer);
        accessupdatenode.write(write, accessgetccp.read);
        accessupdatenode.write(IconCompatParcelizer, accessgetccp.write);
        accessupdatenode.write(RemoteActionCompatParcelizer, accessgetccp.serializer);
        accessupdatenode.write(RatingCompat, accessgetccp.MediaSessionCompatQueueItem);
        accessupdatenode.write(MediaBrowserCompatMediaItem, accessgetccp.RatingCompat);
        accessupdatenode.write(MediaSessionCompatQueueItem, accessgetccp.MediaMetadataCompat);
        accessupdatenode.write(MediaDescriptionCompat, accessgetccp.MediaDescriptionCompat);
        accessupdatenode.write(serializer, accessgetccp.RemoteActionCompatParcelizer);
    }
}
