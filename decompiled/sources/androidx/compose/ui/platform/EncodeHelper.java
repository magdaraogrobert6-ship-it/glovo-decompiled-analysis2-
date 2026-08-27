package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.graphics.AndroidColor_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;

/* JADX INFO: loaded from: classes4.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    /* JADX INFO: renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m2736encode4Dl_Bck(float f) {
        encode(f);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX INFO: renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m2737encode6p3vJLY(int i) {
        byte b;
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        if (FontSynthesis.m3201equalsimpl0(i, companion.m3208getNoneGVVA2EU())) {
            b = 0;
        } else if (FontSynthesis.m3201equalsimpl0(i, companion.m3207getAllGVVA2EU())) {
            b = 1;
        } else if (FontSynthesis.m3201equalsimpl0(i, companion.m3210getWeightGVVA2EU())) {
            b = 2;
        } else if (FontSynthesis.m3201equalsimpl0(i, companion.m3209getStyleGVVA2EU())) {
            b = 3;
        } else {
            b = 0;
        }
        encode(b);
    }

    /* JADX INFO: renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m2739encodeVKZWuLQ(long j) {
        this.parcel.writeLong(j);
    }

    /* JADX INFO: renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m2740encodenzbMABs(int i) {
        FontStyle.Companion companion = FontStyle.Companion;
        encode((!FontStyle.m3190equalsimpl0(i, companion.m3197getNormal_LCdwA()) && FontStyle.m3190equalsimpl0(i, companion.m3196getItalic_LCdwA())) ? (byte) 1 : (byte) 0);
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final void encode(SpanStyle spanStyle) {
        long jM3016getColor0d7_KjU = spanStyle.m3016getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m723equalsimpl0(jM3016getColor0d7_KjU, companion.m758getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m2738encode8_81llA(spanStyle.m3016getColor0d7_KjU());
        }
        long jM3017getFontSizeXSAIIZE = spanStyle.m3017getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m3864equalsimpl0(jM3017getFontSizeXSAIIZE, companion2.m3878getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m2735encodeR2X_6o(spanStyle.m3017getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyleM3018getFontStyle4Lr2A7w = spanStyle.m3018getFontStyle4Lr2A7w();
        if (fontStyleM3018getFontStyle4Lr2A7w != null) {
            int iM3193unboximpl = fontStyleM3018getFontStyle4Lr2A7w.m3193unboximpl();
            encode((byte) 4);
            m2740encodenzbMABs(iM3193unboximpl);
        }
        FontSynthesis fontSynthesisM3019getFontSynthesisZQGJjVo = spanStyle.m3019getFontSynthesisZQGJjVo();
        if (fontSynthesisM3019getFontSynthesisZQGJjVo != null) {
            int iM3206unboximpl = fontSynthesisM3019getFontSynthesisZQGJjVo.m3206unboximpl();
            encode((byte) 5);
            m2737encode6p3vJLY(iM3206unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m3864equalsimpl0(spanStyle.m3020getLetterSpacingXSAIIZE(), companion2.m3878getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m2735encodeR2X_6o(spanStyle.m3020getLetterSpacingXSAIIZE());
        }
        BaselineShift baselineShiftM3015getBaselineShift5SSeXJ0 = spanStyle.m3015getBaselineShift5SSeXJ0();
        if (baselineShiftM3015getBaselineShift5SSeXJ0 != null) {
            float fM3379unboximpl = baselineShiftM3015getBaselineShift5SSeXJ0.m3379unboximpl();
            encode((byte) 8);
            m2736encode4Dl_Bck(fM3379unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m723equalsimpl0(spanStyle.m3014getBackground0d7_KjU(), companion.m758getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m2738encode8_81llA(spanStyle.m3014getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m2735encodeR2X_6o(long j) {
        byte b;
        long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3901getUnspecifiedUIouoOA())) {
            b = 0;
        } else if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
            b = 1;
        } else if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA())) {
            b = 2;
        } else {
            b = 0;
        }
        encode(b);
        if (TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(j), companion.m3901getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m3867getValueimpl(j));
    }

    /* JADX INFO: renamed from: encode-8_81llA, reason: not valid java name */
    public final void m2738encode8_81llA(long j) {
        m2739encodeVKZWuLQ(AndroidColor_androidKt.m585toColorLong8_81llA(j));
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        m2738encode8_81llA(shadow.m1069getColor0d7_KjU());
        encode(Float.intBitsToFloat((int) (shadow.m1070getOffsetF1C5BW0() >> 32)));
        encode(Float.intBitsToFloat((int) (shadow.m1070getOffsetF1C5BW0() & 4294967295L)));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b) {
        this.parcel.writeByte(b);
    }

    public final void encode(int i) {
        this.parcel.writeInt(i);
    }

    public final void encode(float f) {
        this.parcel.writeFloat(f);
    }

    public final void encode(String str) {
        this.parcel.writeString(str);
    }
}
