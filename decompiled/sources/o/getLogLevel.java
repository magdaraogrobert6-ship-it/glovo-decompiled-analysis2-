package o;

import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes4.dex */
public final class getLogLevel extends ReplacementSpan {
    public final Drawable RemoteActionCompatParcelizer;
    public final int serializer;

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        Drawable drawable = this.RemoteActionCompatParcelizer;
        canvas.getClass();
        paint.getClass();
        int iSave = canvas.save();
        try {
            canvas.translate(f, ((i3 + i5) - drawable.getBounds().height()) / 2.0f);
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public getLogLevel(Drawable drawable, int i) {
        this.RemoteActionCompatParcelizer = drawable;
        this.serializer = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        return this.RemoteActionCompatParcelizer.getBounds().width() - this.serializer;
    }
}
