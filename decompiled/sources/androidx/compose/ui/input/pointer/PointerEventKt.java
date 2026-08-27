package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class PointerEventKt {
    @onItemDismisslambda0
    public static final boolean anyChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    @onItemDismisslambda0
    public static final void consumeAllChanges(PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    public static final long positionChange(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    @onItemDismisslambda0
    public static final boolean positionChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange) {
        return !Offset.m474equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m493getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !Offset.m474equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m493getZeroF1C5BW0());
    }

    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    @onItemDismisslambda0
    public static final void consumeDownChange(PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @onItemDismisslambda0
    public static final void consumePositionChange(PointerInputChange pointerInputChange) {
        if (Offset.m474equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m493getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    /* JADX INFO: renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m2007isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j, long j2) {
        boolean zM2146equalsimpl0 = PointerType.m2146equalsimpl0(pointerInputChange.m2074getTypeT8wyACA(), PointerType.Companion.m2153getTouchT8wyACA());
        long jM2071getPositionF1C5BW0 = pointerInputChange.m2071getPositionF1C5BW0();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2071getPositionF1C5BW0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2071getPositionF1C5BW0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = zM2146equalsimpl0 ? 1.0f : 0.0f;
        float f2 = fIntBitsToFloat3 * f;
        float f3 = (int) (j >> 32);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        float f4 = (int) (j & 4294967295L);
        boolean z = fIntBitsToFloat < (-f2);
        return (fIntBitsToFloat > f3 + f2) | z | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > f4 + fIntBitsToFloat4);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        return (z || !pointerInputChange.isConsumed()) ? Offset.m481minusMKHz9U(pointerInputChange.m2071getPositionF1C5BW0(), pointerInputChange.m2072getPreviousPositionF1C5BW0()) : Offset.Companion.m493getZeroF1C5BW0();
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return positionChangeInternal(pointerInputChange, z);
    }

    public static final boolean changedToDown(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m2006isOutOfBoundsO0kMr_c(PointerInputChange pointerInputChange, long j) {
        long jM2071getPositionF1C5BW0 = pointerInputChange.m2071getPositionF1C5BW0();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2071getPositionF1C5BW0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2071getPositionF1C5BW0 & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        boolean z = fIntBitsToFloat < 0.0f;
        boolean z2 = fIntBitsToFloat > ((float) i);
        return z2 | z | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i2));
    }
}
