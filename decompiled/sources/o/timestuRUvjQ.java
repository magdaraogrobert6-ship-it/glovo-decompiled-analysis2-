package o;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class timestuRUvjQ implements TextWatcher, SpanWatcher {
    public final AtomicInteger IconCompatParcelizer = new AtomicInteger(0);
    public final Object serializer;

    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer.incrementAndGet();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.serializer).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.serializer).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.IconCompatParcelizer.get() <= 0 || !(obj instanceof isValidimpl)) {
            ((SpanWatcher) this.serializer).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.IconCompatParcelizer.get() <= 0 || !(obj instanceof isValidimpl)) {
            ((SpanWatcher) this.serializer).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.IconCompatParcelizer.get() <= 0 || !(obj instanceof isValidimpl)) {
            ((SpanWatcher) this.serializer).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.serializer).onTextChanged(charSequence, i, i2, i3);
    }

    public final void serializer() {
        this.IconCompatParcelizer.decrementAndGet();
    }

    public timestuRUvjQ(Object obj) {
        this.serializer = obj;
    }
}
