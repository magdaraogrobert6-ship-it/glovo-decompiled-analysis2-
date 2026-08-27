package o;

/* JADX INFO: loaded from: classes2.dex */
public final class replace implements accessdetachAndRemoveNode {
    public static final replace IconCompatParcelizer = new replace();
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("arch");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("libraryName");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("buildId");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        measurePending measurepending = (measurePending) ((accessgetPlaceOuterCoordinatorLayerp) obj);
        accessupdatenode.write(serializer, measurepending.IconCompatParcelizer);
        accessupdatenode.write(RemoteActionCompatParcelizer, measurepending.RemoteActionCompatParcelizer);
        accessupdatenode.write(write, measurepending.serializer);
    }
}
