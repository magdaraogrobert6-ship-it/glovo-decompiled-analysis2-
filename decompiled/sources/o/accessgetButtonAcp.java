package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonAcp implements accessdetachAndRemoveNode {
    public static final accessgetButtonAcp read = new accessgetButtonAcp();
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("networkType");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("mobileSubtype");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessgetCalculatorcp accessgetcalculatorcp = (accessgetCalculatorcp) ((accessgetDirectionDownRightcp) obj);
        accessupdatenode.write(write, accessgetcalculatorcp.read);
        accessupdatenode.write(IconCompatParcelizer, accessgetcalculatorcp.IconCompatParcelizer);
    }
}
