package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButton4cp implements accessdetachAndRemoveNode {
    public static final accessgetButton4cp serializer = new accessgetButton4cp();
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("clientType");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("androidClientInfo");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessgetButtonL1cp accessgetbuttonl1cp = (accessgetButtonL1cp) ((accessgetCapsLockcp) obj);
        accessupdatenode.write(read, accessgetbuttonl1cp.serializer);
        accessupdatenode.write(RemoteActionCompatParcelizer, accessgetbuttonl1cp.write);
    }
}
