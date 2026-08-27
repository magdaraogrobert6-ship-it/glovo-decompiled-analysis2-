package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetEcp implements accessdetachAndRemoveNode {
    public static final accessgetEcp IconCompatParcelizer = new accessgetEcp();
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer;
    public static final accessgetAggregateChildKindSet serializer;

    static {
        propagateCoordinator propagatecoordinatorWrite = propagateCoordinator.write();
        propagatecoordinatorWrite.RemoteActionCompatParcelizer = 1;
        RemoteActionCompatParcelizer = new accessgetAggregateChildKindSet("currentCacheSizeBytes", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite.serializer())));
        propagateCoordinator propagatecoordinatorWrite2 = propagateCoordinator.write();
        propagatecoordinatorWrite2.RemoteActionCompatParcelizer = 2;
        serializer = new accessgetAggregateChildKindSet("maxCacheSizeBytes", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite2.serializer())));
    }

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessgetHenkancp accessgethenkancp = (accessgetHenkancp) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(RemoteActionCompatParcelizer, accessgethenkancp.RemoteActionCompatParcelizer);
        accessupdatenode.write(serializer, accessgethenkancp.IconCompatParcelizer);
    }
}
