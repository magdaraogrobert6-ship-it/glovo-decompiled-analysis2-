package o;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes4.dex */
public final class getApplyPausedNjRlDlw {
    public final java.lang.ref.WeakReference IconCompatParcelizer;
    public float RatingCompat;
    public isSpecifiedFK8aYYsannotations serializer;
    public final TextPaint write = new TextPaint(1);
    public final RootMeasurePolicymeasure3 read = new RootMeasurePolicymeasure3(1, this);
    public boolean RemoteActionCompatParcelizer = true;

    public final float RemoteActionCompatParcelizer(String str) {
        if (!this.RemoteActionCompatParcelizer) {
            return this.RatingCompat;
        }
        TextPaint textPaint = this.write;
        this.RatingCompat = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.RemoteActionCompatParcelizer = false;
        return this.RatingCompat;
    }

    public getApplyPausedNjRlDlw(RulerScope rulerScope) {
        this.IconCompatParcelizer = new java.lang.ref.WeakReference(null);
        this.IconCompatParcelizer = new java.lang.ref.WeakReference(rulerScope);
    }
}
