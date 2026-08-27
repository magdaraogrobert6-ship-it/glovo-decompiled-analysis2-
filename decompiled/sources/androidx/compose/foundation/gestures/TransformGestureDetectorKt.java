package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransformGestureDetectorKt {
    public static final long IconCompatParcelizer(PointerEvent pointerEvent) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.Companion;
        return Offset.m474equalsimpl0(jCalculateCentroid, companion.m492getUnspecifiedF1C5BW0()) ? companion.m493getZeroF1C5BW0() : Offset.m481minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z) {
        long jM493getZeroF1C5BW0 = Offset.Companion.m493getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM493getZeroF1C5BW0 = Offset.m482plusMKHz9U(jM493getZeroF1C5BW0, z ? pointerInputChange.m2071getPositionF1C5BW0() : pointerInputChange.m2072getPreviousPositionF1C5BW0());
                i++;
            }
        }
        return i == 0 ? Offset.Companion.m492getUnspecifiedF1C5BW0() : Offset.m472divtuRUvjQ(jM493getZeroF1C5BW0, i);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, z);
        float fM475getDistanceimpl = 0.0f;
        if (Offset.m474equalsimpl0(jCalculateCentroid, Offset.Companion.m492getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                i++;
                fM475getDistanceimpl = Offset.m475getDistanceimpl(Offset.m481minusMKHz9U(z ? pointerInputChange.m2071getPositionF1C5BW0() : pointerInputChange.m2072getPreviousPositionF1C5BW0(), jCalculateCentroid)) + fM475getDistanceimpl;
            }
        }
        return fM475getDistanceimpl / i;
    }

    /* JADX INFO: renamed from: angle-k-4lQ0M, reason: not valid java name */
    public static final float m63anglek4lQ0M(long j) {
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }
}
