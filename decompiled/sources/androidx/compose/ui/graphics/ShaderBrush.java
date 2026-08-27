package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    public static final int $stable = 0;
    private long createdSize;
    private TransformShader internalTransformShader;
    private float[] transform;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m554getUnspecifiedNHjbRc();
    }

    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public abstract Shader mo691createShaderuvyYCjk(long j);

    /* JADX INFO: renamed from: getTransform-3i98HWw, reason: not valid java name */
    public final float[] m1054getTransform3i98HWw() {
        return this.transform;
    }

    /* JADX INFO: renamed from: setTransform-Q8lPUPs, reason: not valid java name */
    public final void m1055setTransformQ8lPUPs(float[] fArr) {
        this.transform = fArr;
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader != null) {
            transformShader.m1139transformQ8lPUPs(fArr);
        }
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public final void mo667applyToPq9zytI(long j, Paint paint, float f) {
        TransformShader transformShaderObtainTransformShader = this.internalTransformShader;
        if (transformShaderObtainTransformShader == null || !Size.m542equalsimpl0(this.createdSize, j)) {
            if (Size.m548isEmptyimpl(j)) {
                this.internalTransformShader = null;
                this.createdSize = Size.Companion.m554getUnspecifiedNHjbRc();
                transformShaderObtainTransformShader = null;
            } else {
                transformShaderObtainTransformShader = obtainTransformShader();
                float[] fArr = this.transform;
                if (fArr != null) {
                    transformShaderObtainTransformShader.m1139transformQ8lPUPs(fArr);
                }
                transformShaderObtainTransformShader.setShader(mo691createShaderuvyYCjk(j));
                this.internalTransformShader = transformShaderObtainTransformShader;
                this.createdSize = j;
            }
        }
        long jMo592getColor0d7_KjU = paint.mo592getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m723equalsimpl0(jMo592getColor0d7_KjU, companion.m748getBlack0d7_KjU())) {
            paint.mo598setColor8_81llA(companion.m748getBlack0d7_KjU());
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{paint.getShader(), transformShaderObtainTransformShader != null ? transformShaderObtainTransformShader.getShader() : null}, getCieXyz.write())).booleanValue()) {
            paint.setShader(transformShaderObtainTransformShader != null ? transformShaderObtainTransformShader.getShader() : null);
        }
        if (paint.getAlpha() == f) {
            return;
        }
        paint.setAlpha(f);
    }

    private final TransformShader obtainTransformShader() {
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader != null) {
            return transformShader;
        }
        TransformShader transformShader2 = new TransformShader();
        this.internalTransformShader = transformShader2;
        return transformShader2;
    }
}
