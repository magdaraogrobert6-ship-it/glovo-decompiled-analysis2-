package o;

import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class getInfiniteF1C5BW0 implements Spannable {
    public Spannable IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.IconCompatParcelizer.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return AbstractC0193pointerInteropFilter.read(this.IconCompatParcelizer);
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return AbstractC0193pointerInteropFilter.write(this.IconCompatParcelizer);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.IconCompatParcelizer.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.IconCompatParcelizer.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.IconCompatParcelizer.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.IconCompatParcelizer.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.IconCompatParcelizer.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.IconCompatParcelizer.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.IconCompatParcelizer.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.IconCompatParcelizer.toString();
    }

    public final void write() {
        Spannable spannable = this.IconCompatParcelizer;
        if (!this.RemoteActionCompatParcelizer && prepareInAppMessageWithBitmapDownloadlambda2.write(spannable)) {
            this.IconCompatParcelizer = new SpannableString(spannable);
        }
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        write();
        this.IconCompatParcelizer.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        write();
        this.IconCompatParcelizer.setSpan(obj, i, i2, i3);
    }

    public getInfiniteF1C5BW0(Spannable spannable) {
        this.RemoteActionCompatParcelizer = false;
        this.IconCompatParcelizer = spannable;
    }

    public getInfiniteF1C5BW0() {
    }
}
