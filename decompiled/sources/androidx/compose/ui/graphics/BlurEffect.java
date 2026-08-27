package androidx.compose.ui.graphics;

import bo.app.af$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class BlurEffect extends RenderEffect {
    public static final int $stable = 0;
    private final int edgeTreatment;
    private final float radiusX;
    private final float radiusY;
    private final RenderEffect renderEffect;

    @Override // androidx.compose.ui.graphics.RenderEffect
    public android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m1051createBlurEffect8A3gB4(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        if (this.radiusX != blurEffect.radiusX || this.radiusY != blurEffect.radiusY || !TileMode.m1116equalsimpl0(this.edgeTreatment, blurEffect.edgeTreatment)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.renderEffect, blurEffect.renderEffect}, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return TileMode.m1117hashCodeimpl(this.edgeTreatment) + af$$ExternalSyntheticOutline1.m(this.radiusY, af$$ExternalSyntheticOutline1.m(this.radiusX, (renderEffect != null ? renderEffect.hashCode() : 0) * 31, 31), 31);
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) TileMode.m1118toStringimpl(this.edgeTreatment)) + ')';
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, f, (i2 & 4) != 0 ? f : f2, (i2 & 8) != 0 ? TileMode.Companion.m1120getClamp3opZhB0() : i, null);
    }

    private BlurEffect(RenderEffect renderEffect, float f, float f2, int i) {
        super(null);
        this.renderEffect = renderEffect;
        this.radiusX = f;
        this.radiusY = f2;
        this.edgeTreatment = i;
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, f, f2, i);
    }
}
