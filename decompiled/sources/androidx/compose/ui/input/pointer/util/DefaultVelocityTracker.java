package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultVelocityTracker implements PlatformVelocityTracker {
    public static final int $stable = 8;
    private long currentPointerPositionAccumulator;
    private long lastMoveEventTimeStamp;
    private final VelocityTracker1D.Strategy strategy;
    private final VelocityTracker1D xVelocityTracker;
    private final VelocityTracker1D yVelocityTracker;

    /* JADX INFO: renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui, reason: not valid java name */
    public final long m2172getCurrentPointerPositionAccumulatorF1C5BW0$ui() {
        return this.currentPointerPositionAccumulator;
    }

    public final long getLastMoveEventTimeStamp$ui() {
        return this.lastMoveEventTimeStamp;
    }

    /* JADX INFO: renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui, reason: not valid java name */
    public final void m2173setCurrentPointerPositionAccumulatork4lQ0M$ui(long j) {
        this.currentPointerPositionAccumulator = j;
    }

    public final void setLastMoveEventTimeStamp$ui(long j) {
        this.lastMoveEventTimeStamp = j;
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    public void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }

    public DefaultVelocityTracker() {
        VelocityTracker1D.Strategy strategy = VelocityTracker1D.Strategy.Lsq2;
        this.strategy = strategy;
        boolean z = false;
        int i = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.xVelocityTracker = new VelocityTracker1D(z, strategy, i, defaultConstructorMarker);
        this.yVelocityTracker = new VelocityTracker1D(z, strategy, i, defaultConstructorMarker);
        this.currentPointerPositionAccumulator = Offset.Companion.m493getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: addPointerInputChangeLegacy-Uv8p0NA, reason: not valid java name */
    private final void m2167addPointerInputChangeLegacyUv8p0NA(PointerInputChange pointerInputChange, long j) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            this.currentPointerPositionAccumulator = pointerInputChange.m2071getPositionF1C5BW0();
            resetTracking();
        }
        long jM2072getPreviousPositionF1C5BW0 = pointerInputChange.m2072getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i = 0;
        while (i < size) {
            HistoricalChange historicalChange = historical.get(i);
            long jM481minusMKHz9U = Offset.m481minusMKHz9U(historicalChange.m1970getPositionF1C5BW0(), jM2072getPreviousPositionF1C5BW0);
            long jM1970getPositionF1C5BW0 = historicalChange.m1970getPositionF1C5BW0();
            this.currentPointerPositionAccumulator = Offset.m482plusMKHz9U(this.currentPointerPositionAccumulator, jM481minusMKHz9U);
            mo2170addPositionUv8p0NA(historicalChange.getUptimeMillis(), Offset.m482plusMKHz9U(this.currentPointerPositionAccumulator, j));
            i++;
            jM2072getPreviousPositionF1C5BW0 = jM1970getPositionF1C5BW0;
        }
        this.currentPointerPositionAccumulator = Offset.m482plusMKHz9U(this.currentPointerPositionAccumulator, Offset.m481minusMKHz9U(pointerInputChange.m2071getPositionF1C5BW0(), jM2072getPreviousPositionF1C5BW0));
        mo2170addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), Offset.m482plusMKHz9U(this.currentPointerPositionAccumulator, j));
    }

    /* JADX INFO: renamed from: addPointerInputChangeWithFix-Uv8p0NA, reason: not valid java name */
    private final void m2168addPointerInputChangeWithFixUv8p0NA(PointerInputChange pointerInputChange, long j) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i = 0; i < size; i++) {
                HistoricalChange historicalChange = historical.get(i);
                mo2170addPositionUv8p0NA(historicalChange.getUptimeMillis(), Offset.m482plusMKHz9U(historicalChange.m1968getOriginalEventPositionF1C5BW0$ui(), j));
            }
            mo2170addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), Offset.m482plusMKHz9U(pointerInputChange.m2069getOriginalEventPositionF1C5BW0$ui(), j));
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - this.lastMoveEventTimeStamp > 40) {
            resetTracking();
        }
        this.lastMoveEventTimeStamp = pointerInputChange.getUptimeMillis();
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* JADX INFO: renamed from: addPointerInputChange-Uv8p0NA, reason: not valid java name */
    public void mo2169addPointerInputChangeUv8p0NA(PointerInputChange pointerInputChange, long j) {
        if (VelocityTrackerKt.getVelocityTrackerAddPointsFix()) {
            m2168addPointerInputChangeWithFixUv8p0NA(pointerInputChange, j);
        } else {
            m2167addPointerInputChangeLegacyUv8p0NA(pointerInputChange, j);
        }
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* JADX INFO: renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public void mo2170addPositionUv8p0NA(long j, long j2) {
        this.xVelocityTracker.addDataPoint(j, Float.intBitsToFloat((int) (j2 >> 32)));
        this.yVelocityTracker.addDataPoint(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Override // androidx.compose.ui.input.pointer.util.PlatformVelocityTracker
    /* JADX INFO: renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public long mo2171calculateVelocityAH228Gc(long j) {
        if (Velocity.m3911getXimpl(j) <= 0.0f || Velocity.m3912getYimpl(j) <= 0.0f) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m3918toStringimpl(j)));
        }
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m3911getXimpl(j)), this.yVelocityTracker.calculateVelocity(Velocity.m3912getYimpl(j)));
    }
}
