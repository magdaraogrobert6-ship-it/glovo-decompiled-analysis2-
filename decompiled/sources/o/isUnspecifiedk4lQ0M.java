package o;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class isUnspecifiedk4lQ0M extends coil3.UriKt {
    public final isFinitek4lQ0Mannotations read;

    @Override // coil3.UriKt
    public final boolean read() {
        return this.read.read;
    }

    @Override // coil3.UriKt
    public final void serializer(boolean z) {
        boolean zWrite = MutableRectKt.write();
        isFinitek4lQ0Mannotations isfinitek4lq0mannotations = this.read;
        if (zWrite) {
            isfinitek4lq0mannotations.serializer(z);
        } else {
            isfinitek4lq0mannotations.read = z;
        }
    }

    public isUnspecifiedk4lQ0M(TextView textView) {
        this.read = new isFinitek4lQ0Mannotations(textView);
    }

    @Override // coil3.UriKt
    public final TransformationMethod IconCompatParcelizer(TransformationMethod transformationMethod) {
        return !MutableRectKt.write() ? transformationMethod : this.read.IconCompatParcelizer(transformationMethod);
    }

    @Override // coil3.UriKt
    public final void RemoteActionCompatParcelizer(boolean z) {
        if (MutableRectKt.write()) {
            this.read.RemoteActionCompatParcelizer(z);
        }
    }

    @Override // coil3.UriKt
    public final InputFilter[] write(InputFilter[] inputFilterArr) {
        return !MutableRectKt.write() ? inputFilterArr : this.read.write(inputFilterArr);
    }
}
