package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerInputChange;

/* JADX INFO: loaded from: classes.dex */
public interface PlatformVelocityTracker {
    /* JADX INFO: renamed from: addPointerInputChange-Uv8p0NA */
    void mo2169addPointerInputChangeUv8p0NA(PointerInputChange pointerInputChange, long j);

    /* JADX INFO: renamed from: addPosition-Uv8p0NA */
    void mo2170addPositionUv8p0NA(long j, long j2);

    /* JADX INFO: renamed from: calculateVelocity-AH228Gc */
    long mo2171calculateVelocityAH228Gc(long j);

    void resetTracking();
}
