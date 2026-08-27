package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class packShorts implements accessdetachAndRemoveNode {
    public static final packShorts IconCompatParcelizer = new packShorts();
    public static final accessgetAggregateChildKindSet read = new accessgetAggregateChildKindSet("logEventKey", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(1, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet write = new accessgetAggregateChildKindSet("eventCount", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(2, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = new accessgetAggregateChildKindSet("inferenceDurationStats", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(3, getComposePointerId_I2yYro.DEFAULT))));

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        convertToPointerInputEventui converttopointerinputeventui = (convertToPointerInputEventui) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(read, converttopointerinputeventui.write);
        accessupdatenode.write(write, converttopointerinputeventui.serializer);
        accessupdatenode.write(RemoteActionCompatParcelizer, converttopointerinputeventui.RemoteActionCompatParcelizer);
    }
}
