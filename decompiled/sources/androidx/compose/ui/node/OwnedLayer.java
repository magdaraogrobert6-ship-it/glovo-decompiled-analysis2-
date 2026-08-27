package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer);

    float getFrameRate();

    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo2608getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* JADX INFO: renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo2609inverseTransform58bKbWc(float[] fArr);

    boolean isFrameRateFromParent();

    /* JADX INFO: renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo2610isInLayerk4lQ0M(long j);

    void mapBounds(MutableRect mutableRect, boolean z);

    /* JADX INFO: renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo2611mapOffset8S9VItk(long j, boolean z);

    /* JADX INFO: renamed from: move--gyyYBs, reason: not valid java name */
    void mo2612movegyyYBs(long j);

    /* JADX INFO: renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo2613resizeozmzZPI(long j);

    void reuseLayer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0);

    void setFrameRate(float f);

    void setFrameRateFromParent(boolean z);

    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    void mo2614transform58bKbWc(float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope);
}
