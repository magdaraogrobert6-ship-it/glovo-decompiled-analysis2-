package o;

/* JADX INFO: loaded from: classes2.dex */
public final class MeasureAndLayoutDelegate implements accessdetachAndRemoveNode {
    public static final MeasureAndLayoutDelegate read = new MeasureAndLayoutDelegate();
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("processName");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("pid");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("importance");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("defaultProcess");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        getUncaughtExceptionHandlerui getuncaughtexceptionhandlerui = (getUncaughtExceptionHandlerui) ((markLayoutPending) obj);
        accessupdatenode.write(serializer, getuncaughtexceptionhandlerui.RemoteActionCompatParcelizer);
        accessupdatenode.write(write, getuncaughtexceptionhandlerui.serializer);
        accessupdatenode.write(IconCompatParcelizer, getuncaughtexceptionhandlerui.IconCompatParcelizer);
        accessupdatenode.read(RemoteActionCompatParcelizer, getuncaughtexceptionhandlerui.write);
    }
}
