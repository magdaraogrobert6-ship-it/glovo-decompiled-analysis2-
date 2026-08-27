package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetIsShowingLayoutBounds implements accessdetachAndRemoveNode {
    public static final accessgetIsShowingLayoutBounds IconCompatParcelizer = new accessgetIsShowingLayoutBounds();
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("rolloutId");
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = accessgetAggregateChildKindSet.read("variantId");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("parameterKey");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("parameterValue");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("templateVersion");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        addNotificationForSysPropsChange addnotificationforsyspropschange = (addNotificationForSysPropsChange) ((getIsShowingLayoutBounds) obj);
        accessupdatenode.write(RemoteActionCompatParcelizer, addnotificationforsyspropschange.write);
        accessupdatenode.write(MediaMetadataCompat, addnotificationforsyspropschange.RemoteActionCompatParcelizer);
        accessupdatenode.write(serializer, addnotificationforsyspropschange.IconCompatParcelizer);
        accessupdatenode.write(read, addnotificationforsyspropschange.read);
        accessupdatenode.write(write, addnotificationforsyspropschange.serializer);
    }
}
