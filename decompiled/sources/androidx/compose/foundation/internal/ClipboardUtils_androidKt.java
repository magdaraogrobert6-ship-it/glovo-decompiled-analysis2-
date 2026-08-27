package androidx.compose.foundation.internal;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import o.CheckboxDefaults;

/* JADX INFO: loaded from: classes.dex */
public abstract class ClipboardUtils_androidKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0107  */
    public static final ClipEntry toClipEntry(AnnotatedString annotatedString) {
        CharSequence text;
        byte b;
        if (annotatedString.getSpanStyles().isEmpty()) {
            text = annotatedString.getText();
        } else {
            SpannableString spannableString = new SpannableString(annotatedString.getText());
            CheckboxDefaults checkboxDefaults = new CheckboxDefaults();
            checkboxDefaults.write = Parcel.obtain();
            List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
            int size = spanStyles.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range<SpanStyle> range = spanStyles.get(i);
                SpanStyle spanStyleComponent1 = range.component1();
                int iComponent2 = range.component2();
                int iComponent3 = range.component3();
                checkboxDefaults.write.recycle();
                checkboxDefaults.write = Parcel.obtain();
                long jM3016getColor0d7_KjU = spanStyleComponent1.m3016getColor0d7_KjU();
                Color.Companion companion = Color.Companion;
                if (!Color.m723equalsimpl0(jM3016getColor0d7_KjU, companion.m758getUnspecified0d7_KjU())) {
                    checkboxDefaults.read((byte) 1);
                    checkboxDefaults.write.writeLong(spanStyleComponent1.m3016getColor0d7_KjU());
                }
                long jM3017getFontSizeXSAIIZE = spanStyleComponent1.m3017getFontSizeXSAIIZE();
                TextUnit.Companion companion2 = TextUnit.Companion;
                if (!TextUnit.m3864equalsimpl0(jM3017getFontSizeXSAIIZE, companion2.m3878getUnspecifiedXSAIIZE())) {
                    checkboxDefaults.read((byte) 2);
                    checkboxDefaults.serializer(spanStyleComponent1.m3017getFontSizeXSAIIZE());
                }
                FontWeight fontWeight = spanStyleComponent1.getFontWeight();
                if (fontWeight != null) {
                    checkboxDefaults.read((byte) 3);
                    checkboxDefaults.write.writeInt(fontWeight.getWeight());
                }
                FontStyle fontStyleM3018getFontStyle4Lr2A7w = spanStyleComponent1.m3018getFontStyle4Lr2A7w();
                if (fontStyleM3018getFontStyle4Lr2A7w != null) {
                    int iM3193unboximpl = fontStyleM3018getFontStyle4Lr2A7w.m3193unboximpl();
                    checkboxDefaults.read((byte) 4);
                    FontStyle.Companion companion3 = FontStyle.Companion;
                    checkboxDefaults.read((!FontStyle.m3190equalsimpl0(iM3193unboximpl, companion3.m3197getNormal_LCdwA()) && FontStyle.m3190equalsimpl0(iM3193unboximpl, companion3.m3196getItalic_LCdwA())) ? (byte) 1 : (byte) 0);
                }
                FontSynthesis fontSynthesisM3019getFontSynthesisZQGJjVo = spanStyleComponent1.m3019getFontSynthesisZQGJjVo();
                if (fontSynthesisM3019getFontSynthesisZQGJjVo != null) {
                    int iM3206unboximpl = fontSynthesisM3019getFontSynthesisZQGJjVo.m3206unboximpl();
                    checkboxDefaults.read((byte) 5);
                    FontSynthesis.Companion companion4 = FontSynthesis.Companion;
                    if (FontSynthesis.m3201equalsimpl0(iM3206unboximpl, companion4.m3208getNoneGVVA2EU())) {
                        b = 0;
                    } else if (FontSynthesis.m3201equalsimpl0(iM3206unboximpl, companion4.m3207getAllGVVA2EU())) {
                        b = 1;
                    } else if (FontSynthesis.m3201equalsimpl0(iM3206unboximpl, companion4.m3210getWeightGVVA2EU())) {
                        b = 2;
                    } else if (FontSynthesis.m3201equalsimpl0(iM3206unboximpl, companion4.m3209getStyleGVVA2EU())) {
                        b = 3;
                    } else {
                        b = 0;
                    }
                    checkboxDefaults.read(b);
                }
                String fontFeatureSettings = spanStyleComponent1.getFontFeatureSettings();
                if (fontFeatureSettings != null) {
                    checkboxDefaults.read((byte) 6);
                    checkboxDefaults.write.writeString(fontFeatureSettings);
                }
                if (!TextUnit.m3864equalsimpl0(spanStyleComponent1.m3020getLetterSpacingXSAIIZE(), companion2.m3878getUnspecifiedXSAIIZE())) {
                    checkboxDefaults.read((byte) 7);
                    checkboxDefaults.serializer(spanStyleComponent1.m3020getLetterSpacingXSAIIZE());
                }
                BaselineShift baselineShiftM3015getBaselineShift5SSeXJ0 = spanStyleComponent1.m3015getBaselineShift5SSeXJ0();
                if (baselineShiftM3015getBaselineShift5SSeXJ0 != null) {
                    float fM3379unboximpl = baselineShiftM3015getBaselineShift5SSeXJ0.m3379unboximpl();
                    checkboxDefaults.read((byte) 8);
                    checkboxDefaults.IconCompatParcelizer(fM3379unboximpl);
                }
                TextGeometricTransform textGeometricTransform = spanStyleComponent1.getTextGeometricTransform();
                if (textGeometricTransform != null) {
                    checkboxDefaults.read((byte) 9);
                    checkboxDefaults.IconCompatParcelizer(textGeometricTransform.getScaleX());
                    checkboxDefaults.IconCompatParcelizer(textGeometricTransform.getSkewX());
                }
                if (!Color.m723equalsimpl0(spanStyleComponent1.m3014getBackground0d7_KjU(), companion.m758getUnspecified0d7_KjU())) {
                    checkboxDefaults.read((byte) 10);
                    checkboxDefaults.write.writeLong(spanStyleComponent1.m3014getBackground0d7_KjU());
                }
                TextDecoration textDecoration = spanStyleComponent1.getTextDecoration();
                if (textDecoration != null) {
                    checkboxDefaults.read((byte) 11);
                    checkboxDefaults.write.writeInt(textDecoration.getMask());
                }
                Shadow shadow = spanStyleComponent1.getShadow();
                if (shadow != null) {
                    checkboxDefaults.read((byte) 12);
                    checkboxDefaults.write.writeLong(shadow.m1069getColor0d7_KjU());
                    checkboxDefaults.IconCompatParcelizer(Float.intBitsToFloat((int) (shadow.m1070getOffsetF1C5BW0() >> 32)));
                    checkboxDefaults.IconCompatParcelizer(Float.intBitsToFloat((int) (shadow.m1070getOffsetF1C5BW0() & 4294967295L)));
                    checkboxDefaults.IconCompatParcelizer(shadow.getBlurRadius());
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(checkboxDefaults.write.marshall(), 0)), iComponent2, iComponent3, 33);
            }
            text = spannableString;
        }
        return new ClipEntry(ClipData.newPlainText("plain text", text));
    }
}
