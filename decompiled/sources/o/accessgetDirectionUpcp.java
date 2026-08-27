package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDirectionUpcp implements accessdetachAndRemoveNode {
    public static final accessgetDirectionUpcp RemoteActionCompatParcelizer = new accessgetDirectionUpcp();
    public static final accessgetAggregateChildKindSet read;
    public static final accessgetAggregateChildKindSet serializer;

    static {
        propagateCoordinator propagatecoordinatorWrite = propagateCoordinator.write();
        propagatecoordinatorWrite.RemoteActionCompatParcelizer = 1;
        serializer = new accessgetAggregateChildKindSet("logSource", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite.serializer())));
        propagateCoordinator propagatecoordinatorWrite2 = propagateCoordinator.write();
        propagatecoordinatorWrite2.RemoteActionCompatParcelizer = 2;
        read = new accessgetAggregateChildKindSet("logEventDropped", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite2.serializer())));
    }

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessgetHeadsetHookcp accessgetheadsethookcp = (accessgetHeadsetHookcp) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(serializer, accessgetheadsethookcp.write);
        accessupdatenode.write(read, accessgetheadsethookcp.IconCompatParcelizer);
    }
}
