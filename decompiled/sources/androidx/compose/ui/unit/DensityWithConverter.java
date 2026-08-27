package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class DensityWithConverter implements Density {
    private final FontScaleConverter converter;
    private final float density;
    private final float fontScale;

    private final FontScaleConverter component3() {
        return this.converter;
    }

    public final float component1() {
        return this.density;
    }

    public final float component2() {
        return this.fontScale;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public final DensityWithConverter copy(float f, float f2, FontScaleConverter fontScaleConverter) {
        return new DensityWithConverter(f, f2, fontScaleConverter);
    }

    public int hashCode() {
        return this.converter.hashCode() + af$$ExternalSyntheticOutline1.m(this.fontScale, Float.hashCode(this.density) * 31, 31);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo50toSp0xMU5do(float f) {
        return TextUnitKt.getSp(this.converter.convertDpToSp(f));
    }

    public DensityWithConverter(float f, float f2, FontScaleConverter fontScaleConverter) {
        this.density = f;
        this.fontScale = f2;
        this.converter = fontScaleConverter;
    }

    public static /* synthetic */ DensityWithConverter copy$default(DensityWithConverter densityWithConverter, float f, float f2, FontScaleConverter fontScaleConverter, int i, Object obj) {
        if ((i & 1) != 0) {
            f = densityWithConverter.density;
        }
        if ((i & 2) != 0) {
            f2 = densityWithConverter.fontScale;
        }
        if ((i & 4) != 0) {
            fontScaleConverter = densityWithConverter.converter;
        }
        return densityWithConverter.copy(f, f2, fontScaleConverter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) obj;
        if (Float.compare(this.density, densityWithConverter.density) != 0 || Float.compare(this.fontScale, densityWithConverter.fontScale) != 0) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.converter, densityWithConverter.converter}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo43toDpGaN1DYA(long j) {
        if (TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(j), TextUnitType.Companion.m3900getSpUIouoOA())) {
            return Dp.m3673constructorimpl(this.converter.convertSpToDp(TextUnit.m3867getValueimpl(j)));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Only Sp can convert to Px");
        return 0.0f;
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }
}
