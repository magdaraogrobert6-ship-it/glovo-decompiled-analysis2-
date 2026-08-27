package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessremeasureAndRelayoutIfNeeded implements accessdetachAndRemoveNode {
    public static final accessremeasureAndRelayoutIfNeeded RemoteActionCompatParcelizer = new accessremeasureAndRelayoutIfNeeded();
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("name");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("importance");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("frames");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        getHasPendingMeasureOrLayout gethaspendingmeasureorlayout = (getHasPendingMeasureOrLayout) ((requestLayoutIfCoordinatesAreUsedAndNotifyChildren) obj);
        accessupdatenode.write(serializer, gethaspendingmeasureorlayout.read);
        accessupdatenode.write(IconCompatParcelizer, gethaspendingmeasureorlayout.serializer);
        accessupdatenode.write(read, gethaspendingmeasureorlayout.IconCompatParcelizer);
    }
}
