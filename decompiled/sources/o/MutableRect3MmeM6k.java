package o;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class MutableRect3MmeM6k {
    public static final ThreadLocal RemoteActionCompatParcelizer = new ThreadLocal();
    public final TextPaint write;

    public MutableRect3MmeM6k() {
        TextPaint textPaint = new TextPaint();
        this.write = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
