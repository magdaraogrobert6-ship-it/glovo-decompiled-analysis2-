package androidx.compose.ui.unit;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public interface FontScalingLinear {

    public static final class DefaultImpls {
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3790toDpGaN1DYA(FontScalingLinear fontScalingLinear, long j) {
            return FontScalingLinear.super.m3788toDpGaN1DYA(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3791toSp0xMU5do(FontScalingLinear fontScalingLinear, float f) {
            return FontScalingLinear.super.m3789toSp0xMU5do(f);
        }
    }

    float getFontScale();

    /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
    default float m3788toDpGaN1DYA(long j) {
        if (TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(j), TextUnitType.Companion.m3900getSpUIouoOA())) {
            return Dp.m3673constructorimpl(getFontScale() * TextUnit.m3867getValueimpl(j));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Only Sp can convert to Px");
        return 0.0f;
    }

    /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
    default long m3789toSp0xMU5do(float f) {
        return TextUnitKt.getSp(f / getFontScale());
    }
}
