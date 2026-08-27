package o;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadPassDelegatelayoutChildrenBlock1 implements accessdetachAndRemoveNode {
    public static final LookaheadPassDelegatelayoutChildrenBlock1 IconCompatParcelizer = new LookaheadPassDelegatelayoutChildrenBlock1();
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = accessgetAggregateChildKindSet.read("threads");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("exception");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("appExitInfo");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("signal");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("binaries");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        requestRemeasuredefault requestremeasuredefault = (requestRemeasuredefault) ((getZIndexui) obj);
        accessupdatenode.write(MediaMetadataCompat, requestremeasuredefault.RemoteActionCompatParcelizer);
        accessupdatenode.write(read, requestremeasuredefault.serializer);
        accessupdatenode.write(write, requestremeasuredefault.read);
        accessupdatenode.write(serializer, requestremeasuredefault.IconCompatParcelizer);
        accessupdatenode.write(RemoteActionCompatParcelizer, requestremeasuredefault.write);
    }
}
