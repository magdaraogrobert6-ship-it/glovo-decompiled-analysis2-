package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.unit.VelocityKt;

/* JADX INFO: loaded from: classes.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private final PlatformVelocityTracker platformVelocityTracker = PlatformVelocityTracker_androidKt.PlatformVelocityTracker();

    public final PlatformVelocityTracker getPlatformVelocityTracker$ui() {
        return this.platformVelocityTracker;
    }

    /* JADX INFO: renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m2179addPositionUv8p0NA(long j, long j2) {
        this.platformVelocityTracker.mo2170addPositionUv8p0NA(j, j2);
    }

    /* JADX INFO: renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m2181calculateVelocityAH228Gc(long j) {
        return this.platformVelocityTracker.mo2171calculateVelocityAH228Gc(j);
    }

    public final void resetTracking() {
        this.platformVelocityTracker.resetTracking();
    }

    /* JADX INFO: renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m2180calculateVelocity9UxMQ8M() {
        return m2181calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }
}
