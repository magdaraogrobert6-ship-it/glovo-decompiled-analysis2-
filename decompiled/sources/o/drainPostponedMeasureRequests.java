package o;

/* JADX INFO: loaded from: classes2.dex */
public final class drainPostponedMeasureRequests implements accessdetachAndRemoveNode {
    public static final drainPostponedMeasureRequests RemoteActionCompatParcelizer = new drainPostponedMeasureRequests();
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("rolloutVariant");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("parameterKey");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("parameterValue");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("templateVersion");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        requestLookaheadRemeasure requestlookaheadremeasure = (requestLookaheadRemeasure) ((MeasurePassDelegateplaceOuterCoordinatorBlock1) obj);
        accessupdatenode.write(read, requestlookaheadremeasure.serializer);
        accessupdatenode.write(serializer, requestlookaheadremeasure.write);
        accessupdatenode.write(IconCompatParcelizer, requestlookaheadremeasure.IconCompatParcelizer);
        accessupdatenode.write(write, requestlookaheadremeasure.RemoteActionCompatParcelizer);
    }
}
