package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class pointerHoverIcondefault implements accessdetachAndRemoveNode {
    public static final pointerHoverIcondefault serializer = new pointerHoverIcondefault();
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = new accessgetAggregateChildKindSet("inferenceCommonLogEvent", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(1, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = new accessgetAggregateChildKindSet("options", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(2, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet write = new accessgetAggregateChildKindSet("detectedBarcodeFormats", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(3, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet read = new accessgetAggregateChildKindSet("detectedBarcodeValueTypes", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(4, getComposePointerId_I2yYro.DEFAULT))));
    public static final accessgetAggregateChildKindSet RatingCompat = new accessgetAggregateChildKindSet("imageInfo", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(5, getComposePointerId_I2yYro.DEFAULT))));

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        PointerInteropFilter_androidKt pointerInteropFilter_androidKt = (PointerInteropFilter_androidKt) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(IconCompatParcelizer, pointerInteropFilter_androidKt.IconCompatParcelizer);
        accessupdatenode.write(RemoteActionCompatParcelizer, pointerInteropFilter_androidKt.write);
        accessupdatenode.write(write, pointerInteropFilter_androidKt.serializer);
        accessupdatenode.write(read, pointerInteropFilter_androidKt.RemoteActionCompatParcelizer);
        accessupdatenode.write(RatingCompat, pointerInteropFilter_androidKt.read);
    }
}
