package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import o.SelectionHandleIcon;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class IndirectPointerInputDragCycleDetectorKt {
    /* JADX INFO: renamed from: positionChangeInternal-wfG_k4k, reason: not valid java name */
    public static final long m39positionChangeInternalwfG_k4k(IndirectPointerInputChange indirectPointerInputChange, SelectionHandleIcon selectionHandleIcon, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, boolean z) {
        long jM1575getPreviousPositionF1C5BW0;
        float fIntBitsToFloat;
        if (selectionHandleIcon == null) {
            jM1575getPreviousPositionF1C5BW0 = indirectPointerInputChange.m1575getPreviousPositionF1C5BW0();
        } else {
            IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
            int iM1560getXnZO2Niw = companion.m1560getXnZO2Niw();
            if (indirectPointerEventPrimaryDirectionalMotionAxis != null && IndirectPointerEventPrimaryDirectionalMotionAxis.m1555equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m1558unboximpl(), iM1560getXnZO2Niw)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m1575getPreviousPositionF1C5BW0() >> 32));
            } else {
                int iM1561getYnZO2Niw = companion.m1561getYnZO2Niw();
                if (indirectPointerEventPrimaryDirectionalMotionAxis != null && IndirectPointerEventPrimaryDirectionalMotionAxis.m1555equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m1558unboximpl(), iM1561getYnZO2Niw)) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m1575getPreviousPositionF1C5BW0() & 4294967295L));
                } else {
                    jM1575getPreviousPositionF1C5BW0 = indirectPointerInputChange.m1575getPreviousPositionF1C5BW0();
                }
            }
            if (selectionHandleIcon == SelectionHandleIcon.Horizontal) {
                jM1575getPreviousPositionF1C5BW0 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f))));
            } else {
                jM1575getPreviousPositionF1C5BW0 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32));
            }
        }
        return (z || !indirectPointerInputChange.isConsumed()) ? Offset.m481minusMKHz9U(m40primaryAxisPosition_bfSUIo(indirectPointerInputChange, selectionHandleIcon, indirectPointerEventPrimaryDirectionalMotionAxis), jM1575getPreviousPositionF1C5BW0) : Offset.Companion.m493getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: primaryAxisPosition-_bfSUIo, reason: not valid java name */
    public static final long m40primaryAxisPosition_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, SelectionHandleIcon selectionHandleIcon, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float fIntBitsToFloat;
        if (selectionHandleIcon == null) {
            return indirectPointerInputChange.m1574getPositionF1C5BW0();
        }
        IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
        int iM1560getXnZO2Niw = companion.m1560getXnZO2Niw();
        if (indirectPointerEventPrimaryDirectionalMotionAxis != null && IndirectPointerEventPrimaryDirectionalMotionAxis.m1555equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m1558unboximpl(), iM1560getXnZO2Niw)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m1574getPositionF1C5BW0() >> 32));
        } else {
            int iM1561getYnZO2Niw = companion.m1561getYnZO2Niw();
            if (indirectPointerEventPrimaryDirectionalMotionAxis == null || !IndirectPointerEventPrimaryDirectionalMotionAxis.m1555equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m1558unboximpl(), iM1561getYnZO2Niw)) {
                return indirectPointerInputChange.m1574getPositionF1C5BW0();
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m1574getPositionF1C5BW0() & 4294967295L));
        }
        if (selectionHandleIcon == SelectionHandleIcon.Horizontal) {
            return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
    }

    public static final boolean IconCompatParcelizer(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && !indirectPointerInputChange.getPressed();
    }

    public static final boolean RemoteActionCompatParcelizer(IndirectPointerInputChange indirectPointerInputChange) {
        return !indirectPointerInputChange.getPreviousPressed() && indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: renamed from: access$addIndirectPointerInputChange-Qf4Zb88, reason: not valid java name */
    public static final void m38access$addIndirectPointerInputChangeQf4Zb88(VelocityTracker velocityTracker, IndirectPointerInputChange indirectPointerInputChange, SelectionHandleIcon selectionHandleIcon, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, DeltaDecoder deltaDecoder, long j) {
        float fIntBitsToFloat;
        o.ContentInViewNode contentInViewNode = (o.ContentInViewNode) deltaDecoder.serializer;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (indirectPointerInputChange.m1574getPositionF1C5BW0() >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (indirectPointerInputChange.m1574getPositionF1C5BW0() & 4294967295L));
        if (RemoteActionCompatParcelizer(indirectPointerInputChange)) {
            deltaDecoder.write = 0;
            contentInViewNode.IconCompatParcelizer();
        }
        if (!IconCompatParcelizer(indirectPointerInputChange) && !RemoteActionCompatParcelizer(indirectPointerInputChange)) {
            if (contentInViewNode.IconCompatParcelizer == 3) {
                int i = deltaDecoder.write;
                deltaDecoder.write = i + 1;
                contentInViewNode.read(i, indirectPointerInputChange);
            } else {
                contentInViewNode.read(indirectPointerInputChange);
            }
            if (deltaDecoder.write == 3) {
                deltaDecoder.write = 0;
            }
            Object[] objArr = contentInViewNode.read;
            int i2 = contentInViewNode.IconCompatParcelizer;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((IndirectPointerInputChange) objArr[i3]).m1574getPositionF1C5BW0() >> 32));
            }
            int i4 = contentInViewNode.IconCompatParcelizer;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = contentInViewNode.read;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((IndirectPointerInputChange) objArr2[i5]).m1574getPositionF1C5BW0() & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / contentInViewNode.IconCompatParcelizer;
        }
        long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L));
        if (selectionHandleIcon != null) {
            IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
            int iM1560getXnZO2Niw = companion.m1560getXnZO2Niw();
            if (indirectPointerEventPrimaryDirectionalMotionAxis != null && IndirectPointerEventPrimaryDirectionalMotionAxis.m1555equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m1558unboximpl(), iM1560getXnZO2Niw)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jM469constructorimpl >> 32));
            } else {
                int iM1561getYnZO2Niw = companion.m1561getYnZO2Niw();
                if (indirectPointerEventPrimaryDirectionalMotionAxis != null && IndirectPointerEventPrimaryDirectionalMotionAxis.m1555equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m1558unboximpl(), iM1561getYnZO2Niw)) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jM469constructorimpl & 4294967295L));
                }
            }
            jM469constructorimpl = selectionHandleIcon == SelectionHandleIcon.Horizontal ? Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)) : Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32));
        }
        velocityTracker.m2179addPositionUv8p0NA(indirectPointerInputChange.getUptimeMillis(), Offset.m482plusMKHz9U(jM469constructorimpl, j));
    }
}
