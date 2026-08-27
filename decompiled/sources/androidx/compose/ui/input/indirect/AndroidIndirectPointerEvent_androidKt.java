package androidx.compose.ui.input.indirect;

import android.view.InputDevice;
import android.view.MotionEvent;
import androidx.compose.ui.ExperimentalIndirectPointerApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerId;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidIndirectPointerEvent_androidKt {
    private static final float RATIO_CUTOFF = 5.0f;

    public static final int indirectPrimaryDirectionalScrollAxis(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange != null && motionRange2 == null) {
                return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m1560getXnZO2Niw();
            }
            if (motionRange2 != null && motionRange == null) {
                return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m1561getYnZO2Niw();
            }
            if (motionRange != null && motionRange2 != null) {
                float range = motionRange.getRange();
                float range2 = motionRange2.getRange();
                if (range > range2 && (range2 == 0.0f || range / range2 >= RATIO_CUTOFF)) {
                    return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m1560getXnZO2Niw();
                }
                if (range2 > range && (range == 0.0f || range2 / range >= RATIO_CUTOFF)) {
                    return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m1561getYnZO2Niw();
                }
            }
        }
        return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m1559getNonenZO2Niw();
    }

    public static final MotionEvent getNativeEvent(IndirectPointerEvent indirectPointerEvent) {
        indirectPointerEvent.getClass();
        return ((AndroidIndirectPointerEvent) indirectPointerEvent).getNativeEvent$ui();
    }

    @ExperimentalIndirectPointerApi
    /* JADX INFO: renamed from: IndirectPointerEvent-eAXfkT4, reason: not valid java name */
    public static final IndirectPointerEvent m1550IndirectPointerEventeAXfkT4(MotionEvent motionEvent, int i, MotionEvent motionEvent2) {
        int actionIndex;
        boolean z;
        long jM469constructorimpl;
        long j;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        Integer numValueOf = motionEvent2 != null ? Integer.valueOf(motionEvent2.getActionMasked()) : null;
        boolean z4 = (numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 5) || (numValueOf != null && numValueOf.intValue() == 2);
        long eventTime = motionEvent.getEventTime();
        int pointerCount = motionEvent.getPointerCount();
        ArrayList arrayList = new ArrayList(pointerCount);
        int i2 = 0;
        while (i2 < pointerCount) {
            int pointerId = motionEvent.getPointerId(i2);
            long jM2048constructorimpl = PointerId.m2048constructorimpl(pointerId);
            long jM469constructorimpl2 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getX(i2))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i2))) & 4294967295L));
            boolean z5 = i2 != actionIndex ? z3 : false;
            int iFindPointerIndex = motionEvent2 != null ? motionEvent2.findPointerIndex(pointerId) : -1;
            if (iFindPointerIndex >= 0) {
                motionEvent2.getClass();
                long eventTime2 = motionEvent2.getEventTime();
                z = z4;
                jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent2.getX(iFindPointerIndex))) << 32) | (((long) Float.floatToRawIntBits(motionEvent2.getY(iFindPointerIndex))) & 4294967295L));
                j = eventTime2;
                z2 = z;
            } else {
                z = z4;
                jM469constructorimpl = jM469constructorimpl2;
                j = eventTime;
                z2 = false;
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new IndirectPointerInputChange(jM2048constructorimpl, eventTime, jM469constructorimpl2, z5, motionEvent.getPressure(i2), j, jM469constructorimpl, z2, null));
            i2++;
            pointerCount = pointerCount;
            arrayList = arrayList2;
            actionIndex = actionIndex;
            z4 = z;
            z3 = true;
        }
        return new AndroidIndirectPointerEvent(arrayList, convertActionToIndirectPointerEventType(actionMasked), i, motionEvent, null);
    }

    /* JADX INFO: renamed from: IndirectPointerEvent-eAXfkT4$default, reason: not valid java name */
    public static /* synthetic */ IndirectPointerEvent m1551IndirectPointerEventeAXfkT4$default(MotionEvent motionEvent, int i, MotionEvent motionEvent2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m1559getNonenZO2Niw();
        }
        if ((i2 & 4) != 0) {
            motionEvent2 = null;
        }
        return m1550IndirectPointerEventeAXfkT4(motionEvent, i, motionEvent2);
    }

    public static final int convertActionToIndirectPointerEventType(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return IndirectPointerEventType.Companion.m1569getMove4ZHQPSE();
                }
                if (i != 5) {
                    if (i != 6) {
                        return IndirectPointerEventType.Companion.m1572getUnknown4ZHQPSE();
                    }
                }
            }
            return IndirectPointerEventType.Companion.m1571getRelease4ZHQPSE();
        }
        return IndirectPointerEventType.Companion.m1570getPress4ZHQPSE();
    }
}
