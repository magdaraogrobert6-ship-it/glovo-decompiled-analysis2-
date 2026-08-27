package o;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadPassDelegatelayoutChildrenBlock11 implements accessdetachAndRemoveNode {
    public static final LookaheadPassDelegatelayoutChildrenBlock11 read = new LookaheadPassDelegatelayoutChildrenBlock11();
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("baseAddress");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("size");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("name");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("uuid");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        requestRelayoutdefault requestrelayoutdefault = (requestRelayoutdefault) ((markDetachedFromParentLookaheadPassui) obj);
        accessupdatenode.write(RemoteActionCompatParcelizer, requestrelayoutdefault.read);
        accessupdatenode.write(write, requestrelayoutdefault.serializer);
        accessupdatenode.write(IconCompatParcelizer, requestrelayoutdefault.write);
        String str = requestrelayoutdefault.IconCompatParcelizer;
        accessupdatenode.write(serializer, str != null ? str.getBytes(traceMeasureLayout.PlaybackStateCompat) : null);
    }
}
