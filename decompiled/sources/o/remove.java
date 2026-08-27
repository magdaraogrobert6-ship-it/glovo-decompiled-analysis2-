package o;

import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class remove implements TransformationMethod {
    public java.util.Locale read;

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, android.graphics.Rect rect) {
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.read);
        }
        return null;
    }
}
