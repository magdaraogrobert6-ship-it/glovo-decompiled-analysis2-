package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButton16cp implements accessdetachAndRemoveNode {
    public static final accessgetButton16cp write = new accessgetButton16cp();
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("privacyContext");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("productIdOrigin");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessgetButtonModecp accessgetbuttonmodecp = (accessgetButtonModecp) ((accessgetCallcp) obj);
        accessupdatenode.write(read, accessgetbuttonmodecp.RemoteActionCompatParcelizer);
        accessupdatenode.write(serializer, accessgetbuttonmodecp.IconCompatParcelizer);
    }
}
