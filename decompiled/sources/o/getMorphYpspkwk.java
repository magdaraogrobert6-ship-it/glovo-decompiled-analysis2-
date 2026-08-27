package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getMorphYpspkwk implements accessgetTranslatecp {
    public final int read;

    public getMorphYpspkwk(int i) {
        this.read = i;
        if (i > 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("durationMillis must be > 0.");
        throw null;
    }

    @Override // o.accessgetTranslatecp
    public final StampedPathEffectStyleCompanion read(PathEffectCompanion pathEffectCompanion, RadialGradientShader8uybcMk radialGradientShader8uybcMk) {
        if (radialGradientShader8uybcMk instanceof getColor0d7_KjUannotations) {
            return ((getColor0d7_KjUannotations) radialGradientShader8uybcMk).serializer == getSegmentdefault.MEMORY_CACHE ? new getRotateYpspkwk(pathEffectCompanion, radialGradientShader8uybcMk) : new getValue0d7_KjU(pathEffectCompanion, radialGradientShader8uybcMk, this.read);
        }
        return new getRotateYpspkwk(pathEffectCompanion, radialGradientShader8uybcMk);
    }
}
