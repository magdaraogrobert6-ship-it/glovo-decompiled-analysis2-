package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButton9cp implements accessdetachAndRemoveNode {
    public static final accessgetButton9cp read = new accessgetButton9cp();
    public static final accessgetAggregateChildKindSet RatingCompat = accessgetAggregateChildKindSet.read("requestTimeMs");
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = accessgetAggregateChildKindSet.read("requestUptimeMs");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("clientInfo");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("logSource");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("logSourceName");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("logEvent");
    public static final accessgetAggregateChildKindSet MediaBrowserCompatMediaItem = accessgetAggregateChildKindSet.read("qosTier");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessgetButtonZcp accessgetbuttonzcp = (accessgetButtonZcp) ((accessgetDirectionDownLeftcp) obj);
        accessupdatenode.write(RatingCompat, accessgetbuttonzcp.RatingCompat);
        accessupdatenode.write(MediaDescriptionCompat, accessgetbuttonzcp.MediaMetadataCompat);
        accessupdatenode.write(RemoteActionCompatParcelizer, accessgetbuttonzcp.read);
        accessupdatenode.write(serializer, accessgetbuttonzcp.serializer);
        accessupdatenode.write(write, accessgetbuttonzcp.write);
        accessupdatenode.write(IconCompatParcelizer, accessgetbuttonzcp.RemoteActionCompatParcelizer);
        accessupdatenode.write(MediaBrowserCompatMediaItem, accessgetbuttonzcp.IconCompatParcelizer);
    }
}
