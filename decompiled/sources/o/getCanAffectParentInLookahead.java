package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getCanAffectParentInLookahead implements accessdetachAndRemoveNode {
    public static final getCanAffectParentInLookahead serializer = new getCanAffectParentInLookahead();
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("platform");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("version");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("buildVersion");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("jailbroken");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        setDuringMeasureLayoutui setduringmeasurelayoutui = (setDuringMeasureLayoutui) ((MergedViewAdapter) obj);
        accessupdatenode.write(write, setduringmeasurelayoutui.write);
        accessupdatenode.write(RemoteActionCompatParcelizer, setduringmeasurelayoutui.IconCompatParcelizer);
        accessupdatenode.write(IconCompatParcelizer, setduringmeasurelayoutui.read);
        accessupdatenode.read(read, setduringmeasurelayoutui.serializer);
    }
}
