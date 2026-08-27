package o;

/* JADX INFO: loaded from: classes2.dex */
public final class performMeasureBRTryo0ui implements accessdetachAndRemoveNode {
    public static final performMeasureBRTryo0ui IconCompatParcelizer = new performMeasureBRTryo0ui();
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("key");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("value");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        measureAndLayoutdefault measureandlayoutdefault = (measureAndLayoutdefault) ((accesssetPerformMeasureConstraintsp) obj);
        accessupdatenode.write(serializer, measureandlayoutdefault.IconCompatParcelizer);
        accessupdatenode.write(RemoteActionCompatParcelizer, measureandlayoutdefault.serializer);
    }
}
