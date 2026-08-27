package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDirectionUpLeftcp implements accessdetachAndRemoveNode {
    public static final accessgetAggregateChildKindSet IconCompatParcelizer;
    public static final accessgetDirectionUpLeftcp serializer = new accessgetDirectionUpLeftcp();
    public static final accessgetAggregateChildKindSet write;

    static {
        propagateCoordinator propagatecoordinatorWrite = propagateCoordinator.write();
        propagatecoordinatorWrite.RemoteActionCompatParcelizer = 1;
        write = new accessgetAggregateChildKindSet("eventsDroppedCount", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite.serializer())));
        propagateCoordinator propagatecoordinatorWrite2 = propagateCoordinator.write();
        propagatecoordinatorWrite2.RemoteActionCompatParcelizer = 3;
        IconCompatParcelizer = new accessgetAggregateChildKindSet("reason", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite2.serializer())));
    }

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessgetFunctioncp accessgetfunctioncp = (accessgetFunctioncp) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(write, accessgetfunctioncp.read);
        accessupdatenode.write(IconCompatParcelizer, accessgetfunctioncp.write);
    }
}
