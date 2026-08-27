package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButton5cp implements accessdetachAndRemoveNode {
    public static final accessgetButton5cp serializer = new accessgetButton5cp();
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("clearBlob");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("encryptedBlob");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessgetButtonThumbLeftcp accessgetbuttonthumbleftcp = (accessgetButtonThumbLeftcp) ((accessgetChannelDowncp) obj);
        accessupdatenode.write(write, accessgetbuttonthumbleftcp.serializer);
        accessupdatenode.write(IconCompatParcelizer, accessgetbuttonthumbleftcp.write);
    }
}
