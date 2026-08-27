package o;

/* JADX INFO: loaded from: classes2.dex */
public final class setMeasurePending implements accessdetachAndRemoveNode {
    public static final setMeasurePending RemoteActionCompatParcelizer = new setMeasurePending();
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("rolloutId");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("parameterKey");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("parameterValue");
    public static final accessgetAggregateChildKindSet MediaBrowserCompatMediaItem = accessgetAggregateChildKindSet.read("variantId");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("templateVersion");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        getChildDelegatesDirtyui getchilddelegatesdirtyui = (getChildDelegatesDirtyui) ((onNodePlacedui) obj);
        accessupdatenode.write(serializer, getchilddelegatesdirtyui.read);
        accessupdatenode.write(IconCompatParcelizer, getchilddelegatesdirtyui.serializer);
        accessupdatenode.write(write, getchilddelegatesdirtyui.IconCompatParcelizer);
        accessupdatenode.write(MediaBrowserCompatMediaItem, getchilddelegatesdirtyui.RemoteActionCompatParcelizer);
        accessupdatenode.write(read, getchilddelegatesdirtyui.write);
    }
}
