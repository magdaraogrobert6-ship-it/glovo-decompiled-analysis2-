package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPathMeasure implements PathMeasure {
    public static final int $stable = 8;
    private final android.graphics.PathMeasure internalPathMeasure;
    private float[] positionArray;
    private float[] tangentArray;

    @Override // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float f, float f2, Path path, boolean z) {
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path instanceof AndroidPath) {
            return pathMeasure.getSegment(f, f2, ((AndroidPath) path).getInternalPath(), z);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        return false;
    }

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public void setPath(Path path, boolean z) {
        android.graphics.Path internalPath;
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            internalPath = null;
        } else {
            if (!(path instanceof AndroidPath)) {
                IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
                return;
            }
            internalPath = ((AndroidPath) path).getInternalPath();
        }
        pathMeasure.setPath(internalPath, z);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* JADX INFO: renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo617getPositiontuRUvjQ(float f) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(f, this.positionArray, this.tangentArray)) {
            return Offset.Companion.m492getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.positionArray;
        fArr.getClass();
        float f2 = fArr[0];
        float[] fArr2 = this.positionArray;
        fArr2.getClass();
        float f3 = fArr2[1];
        return Offset.m469constructorimpl((Float.floatToRawIntBits(f2) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* JADX INFO: renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo618getTangenttuRUvjQ(float f) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(f, this.positionArray, this.tangentArray)) {
            return Offset.Companion.m492getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.tangentArray;
        fArr.getClass();
        float f2 = fArr[0];
        float[] fArr2 = this.tangentArray;
        fArr2.getClass();
        float f3 = fArr2[1];
        return Offset.m469constructorimpl((Float.floatToRawIntBits(f2) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }
}
