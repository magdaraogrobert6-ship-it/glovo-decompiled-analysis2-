package o;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: loaded from: classes4.dex */
public final class AppCompatViewInflater {
    public final /* synthetic */ AppCompatDialogFragment serializer;

    public final TextClassifier read() {
        return super/*android.widget.TextView*/.getTextClassifier();
    }

    public final void write(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }

    public AppCompatViewInflater(AppCompatDialogFragment appCompatDialogFragment) {
        this.serializer = appCompatDialogFragment;
    }
}
