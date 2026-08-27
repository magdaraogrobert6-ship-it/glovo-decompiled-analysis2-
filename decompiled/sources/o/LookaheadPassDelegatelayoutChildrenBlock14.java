package o;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadPassDelegatelayoutChildrenBlock14 implements accessdetachAndRemoveNode {
    public static final LookaheadPassDelegatelayoutChildrenBlock14 RemoteActionCompatParcelizer = new LookaheadPassDelegatelayoutChildrenBlock14();
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("type");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("reason");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("frames");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("causedBy");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("overflowCount");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        forceMeasureTheSubtree forcemeasurethesubtree = (forceMeasureTheSubtree) ((getPlacedOnce) obj);
        accessupdatenode.write(MediaSessionCompatQueueItem, forcemeasurethesubtree.read);
        accessupdatenode.write(read, forcemeasurethesubtree.serializer);
        accessupdatenode.write(write, forcemeasurethesubtree.write);
        accessupdatenode.write(IconCompatParcelizer, forcemeasurethesubtree.RemoteActionCompatParcelizer);
        accessupdatenode.write(serializer, forcemeasurethesubtree.IconCompatParcelizer);
    }
}
