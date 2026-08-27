package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.MatrixKt;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;
    private Matrix androidMatrixCache;
    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getMatrix;
    private boolean isDirty;
    private boolean isInverseDirty;
    private float[] matrixCache = androidx.compose.ui.graphics.Matrix.m969constructorimpl$default(null, 1, null);
    private float[] inverseMatrixCache = androidx.compose.ui.graphics.Matrix.m969constructorimpl$default(null, 1, null);
    private boolean isInverseValid = true;
    private boolean isIdentity = true;

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.ui.graphics.Matrix.m978resetimpl(this.matrixCache);
        androidx.compose.ui.graphics.Matrix.m978resetimpl(this.inverseMatrixCache);
    }

    /* JADX INFO: renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m2748calculateInverseMatrixbWbORWo(T t) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m2746invertToJiSxe2E(m2749calculateMatrixGrdbGEg(t), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    /* JADX INFO: renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m2749calculateMatrixGrdbGEg(T t) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t, matrix);
        AndroidMatrixConversions_androidKt.m590setFromtUYjHk(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = MatrixKt.m994isIdentity58bKbWc(fArr);
        return fArr;
    }

    public LayerMatrixCache(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.getMatrix = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    public final void map(T t, MutableRect mutableRect) {
        float[] fArrM2749calculateMatrixGrdbGEg = m2749calculateMatrixGrdbGEg(t);
        if (this.isIdentity) {
            return;
        }
        androidx.compose.ui.graphics.Matrix.m977mapimpl(fArrM2749calculateMatrixGrdbGEg, mutableRect);
    }

    /* JADX INFO: renamed from: map-R5De75A, reason: not valid java name */
    public final long m2750mapR5De75A(T t, long j) {
        return !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m975mapMKHz9U(m2749calculateMatrixGrdbGEg(t), j) : j;
    }

    /* JADX INFO: renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m2751mapInverseR5De75A(T t, long j) {
        float[] fArrM2748calculateInverseMatrixbWbORWo = m2748calculateInverseMatrixbWbORWo(t);
        if (fArrM2748calculateInverseMatrixbWbORWo == null) {
            return Offset.Companion.m491getInfiniteF1C5BW0();
        }
        return !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m975mapMKHz9U(fArrM2748calculateInverseMatrixbWbORWo, j) : j;
    }

    public final void mapInverse(T t, MutableRect mutableRect) {
        float[] fArrM2748calculateInverseMatrixbWbORWo = m2748calculateInverseMatrixbWbORWo(t);
        if (fArrM2748calculateInverseMatrixbWbORWo == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.isIdentity) {
                return;
            }
            androidx.compose.ui.graphics.Matrix.m977mapimpl(fArrM2748calculateInverseMatrixbWbORWo, mutableRect);
        }
    }
}
