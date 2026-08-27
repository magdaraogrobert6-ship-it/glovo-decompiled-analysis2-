package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public interface TextForegroundStyle {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final TextForegroundStyle from(Brush brush, float f) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m3538from8_81llA(TextDrawStyleKt.m3537modulateDxMtmZc(((SolidColor) brush).m1081getValue0d7_KjU(), f));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }

        /* JADX INFO: renamed from: from-8_81llA, reason: not valid java name */
        public final TextForegroundStyle m3538from8_81llA(long j) {
            if (j != 16) {
                return new ColorStyle(j, null);
            }
            return Unspecified.INSTANCE;
        }
    }

    public static final class Unspecified implements TextForegroundStyle {
        public static final int $stable = 0;
        public static final Unspecified INSTANCE = new Unspecified();

        private Unspecified() {
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public Brush getBrush() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* JADX INFO: renamed from: getColor-0d7_KjU */
        public long mo3391getColor0d7_KjU() {
            return Color.Companion.m758getUnspecified0d7_KjU();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static TextForegroundStyle merge$lambda$1(TextForegroundStyle textForegroundStyle) {
        return textForegroundStyle;
    }

    float getAlpha();

    Brush getBrush();

    /* JADX INFO: renamed from: getColor-0d7_KjU */
    long mo3391getColor0d7_KjU();

    /* JADX INFO: Access modifiers changed from: private */
    static float merge$lambda$0(TextForegroundStyle textForegroundStyle) {
        return ((BrushStyle) textForegroundStyle).getAlpha();
    }

    default TextForegroundStyle takeOrElse(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return !equals(Unspecified.INSTANCE) ? this : (TextForegroundStyle) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    default TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        boolean z = textForegroundStyle instanceof BrushStyle;
        if (z && (this instanceof BrushStyle)) {
            BrushStyle brushStyle = (BrushStyle) textForegroundStyle;
            final int i = 0;
            return new BrushStyle(brushStyle.getValue(), TextDrawStyleKt.takeOrElse(brushStyle.getAlpha(), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.compose.ui.text.style.TextForegroundStyle$$ExternalSyntheticLambda0
                public final /* synthetic */ TextForegroundStyle f$0;

                {
                    this.f$0 = this;
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i2 = i;
                    TextForegroundStyle textForegroundStyle2 = this.f$0;
                    return i2 != 0 ? TextForegroundStyle.merge$lambda$1(textForegroundStyle2) : Float.valueOf(TextForegroundStyle.merge$lambda$0(textForegroundStyle2));
                }
            }));
        }
        if (z && !(this instanceof BrushStyle)) {
            return textForegroundStyle;
        }
        if (!z && (this instanceof BrushStyle)) {
            return this;
        }
        final int i2 = 1;
        return textForegroundStyle.takeOrElse(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.compose.ui.text.style.TextForegroundStyle$$ExternalSyntheticLambda0
            public final /* synthetic */ TextForegroundStyle f$0;

            {
                this.f$0 = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                TextForegroundStyle textForegroundStyle2 = this.f$0;
                return i3 != 0 ? TextForegroundStyle.merge$lambda$1(textForegroundStyle2) : Float.valueOf(TextForegroundStyle.merge$lambda$0(textForegroundStyle2));
            }
        });
    }
}
