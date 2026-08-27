package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* JADX INFO: loaded from: classes.dex */
public interface FontScaling {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3784toDpGaN1DYA(FontScaling fontScaling, long j) {
            return FontScaling.super.mo43toDpGaN1DYA(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3785toSp0xMU5do(FontScaling fontScaling, float f) {
            return FontScaling.super.mo50toSp0xMU5do(f);
        }
    }

    float getFontScale();

    /* JADX INFO: renamed from: toSp-0xMU5do */
    default long mo50toSp0xMU5do(float f) {
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale())) {
            return TextUnitKt.getSp(f / getFontScale());
        }
        FontScaleConverter fontScaleConverterForScale = fontScaleConverterFactory.forScale(getFontScale());
        return TextUnitKt.getSp(fontScaleConverterForScale != null ? fontScaleConverterForScale.convertDpToSp(f) : f / getFontScale());
    }

    /* JADX INFO: renamed from: toDp-GaN1DYA */
    default float mo43toDpGaN1DYA(long j) {
        if (!TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(j), TextUnitType.Companion.m3900getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale())) {
            return Dp.m3673constructorimpl(getFontScale() * TextUnit.m3867getValueimpl(j));
        }
        FontScaleConverter fontScaleConverterForScale = fontScaleConverterFactory.forScale(getFontScale());
        if (fontScaleConverterForScale != null) {
            return Dp.m3673constructorimpl(fontScaleConverterForScale.convertSpToDp(TextUnit.m3867getValueimpl(j)));
        }
        return Dp.m3673constructorimpl(getFontScale() * TextUnit.m3867getValueimpl(j));
    }
}
