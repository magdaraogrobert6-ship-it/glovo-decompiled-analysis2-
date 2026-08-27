package o;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class lastLocalKeyInputNode {
    public final TextPaint IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final TextDirectionHeuristic read;
    public final int serializer;

    public final int RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final int read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final TextDirectionHeuristic serializer() {
        return this.read;
    }

    public final TextPaint write() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        TextPaint textPaint = this.IconCompatParcelizer;
        float textSize = textPaint.getTextSize();
        float textScaleX = textPaint.getTextScaleX();
        float textSkewX = textPaint.getTextSkewX();
        float letterSpacing = textPaint.getLetterSpacing();
        int flags = textPaint.getFlags();
        android.os.LocaleList textLocales = textPaint.getTextLocales();
        android.graphics.Typeface typeface = textPaint.getTypeface();
        boolean zIsElegantTextHeight = textPaint.isElegantTextHeight();
        int i = this.serializer;
        int i2 = this.RemoteActionCompatParcelizer;
        return Objects.hash(Float.valueOf(textSize), Float.valueOf(textScaleX), Float.valueOf(textSkewX), Float.valueOf(letterSpacing), Integer.valueOf(flags), textLocales, typeface, Boolean.valueOf(zIsElegantTextHeight), this.read, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public lastLocalKeyInputNode(PrecomputedText.Params params) {
        this.IconCompatParcelizer = params.getTextPaint();
        this.read = params.getTextDirection();
        this.serializer = params.getBreakStrategy();
        this.RemoteActionCompatParcelizer = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lastLocalKeyInputNode)) {
            return false;
        }
        lastLocalKeyInputNode lastlocalkeyinputnode = (lastLocalKeyInputNode) obj;
        int i = lastlocalkeyinputnode.serializer;
        TextPaint textPaint = lastlocalkeyinputnode.IconCompatParcelizer;
        if (this.serializer != i || this.RemoteActionCompatParcelizer != lastlocalkeyinputnode.RemoteActionCompatParcelizer) {
            return false;
        }
        TextPaint textPaint2 = this.IconCompatParcelizer;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.read == lastlocalkeyinputnode.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.IconCompatParcelizer;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.read);
        sb.append(", breakStrategy=" + this.serializer);
        sb.append(", hyphenationFrequency=" + this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }
}
