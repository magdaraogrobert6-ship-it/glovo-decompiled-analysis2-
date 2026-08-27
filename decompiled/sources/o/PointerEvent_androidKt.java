package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class PointerEvent_androidKt implements accessdetachAndRemoveNode {
    public static final PointerEvent_androidKt serializer = new PointerEvent_androidKt();
    public static final accessgetAggregateChildKindSet write = new accessgetAggregateChildKindSet("maxMs", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(1, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = new accessgetAggregateChildKindSet("minMs", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(2, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = new accessgetAggregateChildKindSet("avgMs", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(3, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet read = new accessgetAggregateChildKindSet("firstQuartileMs", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(4, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet RatingCompat = new accessgetAggregateChildKindSet("medianMs", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(5, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = new accessgetAggregateChildKindSet("thirdQuartileMs", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(6, getComposePointerId_I2yYro.DEFAULT))));

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(write, pointerInteropFilter.IconCompatParcelizer);
        accessupdatenode.write(RemoteActionCompatParcelizer, pointerInteropFilter.read);
        accessupdatenode.write(IconCompatParcelizer, pointerInteropFilter.serializer);
        accessupdatenode.write(read, pointerInteropFilter.RemoteActionCompatParcelizer);
        accessupdatenode.write(RatingCompat, pointerInteropFilter.write);
        accessupdatenode.write(MediaSessionCompatQueueItem, pointerInteropFilter.MediaMetadataCompat);
    }
}
