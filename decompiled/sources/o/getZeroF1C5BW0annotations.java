package o;

import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import coil3.ImageLoader$Builder;

/* JADX INFO: loaded from: classes.dex */
public final class getZeroF1C5BW0annotations extends isValidimpl {
    public TextPaint write;

    public getZeroF1C5BW0annotations(unaryMinusF1C5BW0 unaryminusf1c5bw0) {
        super(unaryminusf1c5bw0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        TextPaint textPaint;
        android.graphics.Paint paint2 = paint;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    textPaint = this.write;
                    if (textPaint == null) {
                        textPaint = new TextPaint();
                        this.write = textPaint;
                    }
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint2 instanceof TextPaint) {
                    textPaint = (TextPaint) paint2;
                } else {
                    textPaint = null;
                }
            } else if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            } else {
                textPaint = null;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        } else {
            textPaint = null;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            float f2 = this.serializer;
            int color = textPaint.getColor();
            android.graphics.Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawRect(f, i3, f + f2, i5, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        MutableRectKt.RemoteActionCompatParcelizer().getClass();
        float f3 = i4;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        unaryMinusF1C5BW0 unaryminusf1c5bw0 = this.read;
        ImageLoader$Builder imageLoader$Builder = unaryminusf1c5bw0.read;
        android.graphics.Typeface typeface = (android.graphics.Typeface) imageLoader$Builder.serializer;
        android.graphics.Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) imageLoader$Builder.IconCompatParcelizer, unaryminusf1c5bw0.write * 2, 2, f, f3, paint2);
        paint2.setTypeface(typeface2);
    }
}
