package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDirectionRightcp implements accessdetachAndRemoveNode {
    public static final accessgetAggregateChildKindSet serializer;
    public static final accessgetDirectionRightcp write = new accessgetDirectionRightcp();

    static {
        propagateCoordinator propagatecoordinatorWrite = propagateCoordinator.write();
        propagatecoordinatorWrite.RemoteActionCompatParcelizer = 1;
        serializer = new accessgetAggregateChildKindSet("storageMetrics", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite.serializer())));
    }

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        ((accessupdateNode) obj2).write(serializer, ((accessgetGcp) obj).serializer);
    }
}
