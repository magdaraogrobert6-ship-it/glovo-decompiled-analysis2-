package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDirectionUpRightcp implements accessdetachAndRemoveNode {
    public static final accessgetAggregateChildKindSet IconCompatParcelizer;
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer;
    public static final accessgetAggregateChildKindSet read;
    public static final accessgetDirectionUpRightcp serializer = new accessgetDirectionUpRightcp();
    public static final accessgetAggregateChildKindSet write;

    static {
        propagateCoordinator propagatecoordinatorWrite = propagateCoordinator.write();
        propagatecoordinatorWrite.RemoteActionCompatParcelizer = 1;
        read = new accessgetAggregateChildKindSet("window", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite.serializer())));
        propagateCoordinator propagatecoordinatorWrite2 = propagateCoordinator.write();
        propagatecoordinatorWrite2.RemoteActionCompatParcelizer = 2;
        IconCompatParcelizer = new accessgetAggregateChildKindSet("logSourceMetrics", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite2.serializer())));
        propagateCoordinator propagatecoordinatorWrite3 = propagateCoordinator.write();
        propagatecoordinatorWrite3.RemoteActionCompatParcelizer = 3;
        write = new accessgetAggregateChildKindSet("globalMetrics", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite3.serializer())));
        propagateCoordinator propagatecoordinatorWrite4 = propagateCoordinator.write();
        propagatecoordinatorWrite4.RemoteActionCompatParcelizer = 4;
        RemoteActionCompatParcelizer = new accessgetAggregateChildKindSet("appNamespace", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite4.serializer())));
    }

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessgetGravecp accessgetgravecp = (accessgetGravecp) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(read, accessgetgravecp.read);
        accessupdatenode.write(IconCompatParcelizer, accessgetgravecp.serializer);
        accessupdatenode.write(write, accessgetgravecp.RemoteActionCompatParcelizer);
        accessupdatenode.write(RemoteActionCompatParcelizer, accessgetgravecp.write);
    }
}
