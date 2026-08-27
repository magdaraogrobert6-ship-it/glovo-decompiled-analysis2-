package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessremeasureIfNeeded implements accessdetachAndRemoveNode {
    public static final accessremeasureIfNeeded read = new accessremeasureIfNeeded();
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("name");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("code");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("address");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        getDuringMeasureLayoutui getduringmeasurelayoutui = (getDuringMeasureLayoutui) ((setPlacedui) obj);
        accessupdatenode.write(serializer, getduringmeasurelayoutui.write);
        accessupdatenode.write(RemoteActionCompatParcelizer, getduringmeasurelayoutui.IconCompatParcelizer);
        accessupdatenode.write(IconCompatParcelizer, getduringmeasurelayoutui.serializer);
    }
}
