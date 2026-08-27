package o;

/* JADX INFO: loaded from: classes2.dex */
public final class setMeasuredByParentui implements accessdetachAndRemoveNode {
    public static final setMeasuredByParentui RemoteActionCompatParcelizer = new setMeasuredByParentui();
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("files");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("orgId");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        isUsedInMeasureOrLayout isusedinmeasureorlayout = (isUsedInMeasureOrLayout) ((accessgetPlaceOuterCoordinatorLayerBlockp) obj);
        accessupdatenode.write(read, isusedinmeasureorlayout.IconCompatParcelizer);
        accessupdatenode.write(IconCompatParcelizer, isusedinmeasureorlayout.write);
    }
}
