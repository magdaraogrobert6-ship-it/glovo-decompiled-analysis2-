package o;

import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class lerpWko1d7g implements TransformationMethod {
    public final TransformationMethod write;

    public lerpWko1d7g(TransformationMethod transformationMethod) {
        this.write = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, android.graphics.Rect rect) {
        TransformationMethod transformationMethod = this.write;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.write;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || MutableRectKt.RemoteActionCompatParcelizer().IconCompatParcelizer() != 1) {
            return charSequence;
        }
        MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
        mutableRectKtRemoteActionCompatParcelizer.getClass();
        return mutableRectKtRemoteActionCompatParcelizer.write(0, charSequence.length(), 0, charSequence);
    }
}
