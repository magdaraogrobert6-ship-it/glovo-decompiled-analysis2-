package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetEisucp implements accessdetachAndRemoveNode {
    public static final accessgetAggregateChildKindSet IconCompatParcelizer;
    public static final accessgetAggregateChildKindSet serializer;
    public static final accessgetEisucp write = new accessgetEisucp();

    static {
        propagateCoordinator propagatecoordinatorWrite = propagateCoordinator.write();
        propagatecoordinatorWrite.RemoteActionCompatParcelizer = 1;
        serializer = new accessgetAggregateChildKindSet("startMs", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite.serializer())));
        propagateCoordinator propagatecoordinatorWrite2 = propagateCoordinator.write();
        propagatecoordinatorWrite2.RemoteActionCompatParcelizer = 2;
        IconCompatParcelizer = new accessgetAggregateChildKindSet("endMs", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite2.serializer())));
    }

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessgetIcp accessgeticp = (accessgetIcp) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(serializer, accessgeticp.RemoteActionCompatParcelizer);
        accessupdatenode.write(IconCompatParcelizer, accessgeticp.IconCompatParcelizer);
    }
}
