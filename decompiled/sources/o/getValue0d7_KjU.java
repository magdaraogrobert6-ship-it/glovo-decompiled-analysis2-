package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes.dex */
public final class getValue0d7_KjU implements StampedPathEffectStyleCompanion {
    public final PathEffectCompanion IconCompatParcelizer;
    public final RadialGradientShader8uybcMk RemoteActionCompatParcelizer;
    public final int read;

    @Override // o.StampedPathEffectStyleCompanion
    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer.getClass();
        RadialGradientShader8uybcMk radialGradientShader8uybcMk = this.RemoteActionCompatParcelizer;
        if (radialGradientShader8uybcMk.IconCompatParcelizer() != null) {
            getAlignmentLinesMap.write();
            return;
        }
        boolean z = radialGradientShader8uybcMk instanceof getColor0d7_KjUannotations;
        SolidColor solidColor = new SolidColor(radialGradientShader8uybcMk.write().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.read, (z && ((getColor0d7_KjUannotations) radialGradientShader8uybcMk).write) ? false : true);
        if (z) {
            RegexKt.serializer(solidColor);
        } else if (radialGradientShader8uybcMk instanceof ImageShaderF49vj9s) {
            RegexKt.serializer(solidColor);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
    }

    public getValue0d7_KjU(PathEffectCompanion pathEffectCompanion, RadialGradientShader8uybcMk radialGradientShader8uybcMk, int i) {
        this.IconCompatParcelizer = pathEffectCompanion;
        this.RemoteActionCompatParcelizer = radialGradientShader8uybcMk;
        this.read = i;
        if (i > 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("durationMillis must be > 0.");
        throw null;
    }
}
