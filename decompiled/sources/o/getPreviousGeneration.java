package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getPreviousGeneration implements accessdetachAndRemoveNode {
    public static final getPreviousGeneration write = new getPreviousGeneration();
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("performance");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("crashlytics");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("sessionSamplingRate");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        getRulerLambda getrulerlambda = (getRulerLambda) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(read, getrulerlambda.read);
        accessupdatenode.write(IconCompatParcelizer, getrulerlambda.RemoteActionCompatParcelizer);
        accessupdatenode.write(serializer, getrulerlambda.IconCompatParcelizer);
    }
}
