package o;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class isFinitek4lQ0Mannotations extends coil3.UriKt {
    public final getZeroF1C5BW0 RemoteActionCompatParcelizer;
    public boolean read = true;
    public final TextView serializer;

    @Override // coil3.UriKt
    public final boolean read() {
        return this.read;
    }

    @Override // coil3.UriKt
    public final void RemoteActionCompatParcelizer(boolean z) {
        if (z) {
            TextView textView = this.serializer;
            textView.setTransformationMethod(IconCompatParcelizer(textView.getTransformationMethod()));
        }
    }

    @Override // coil3.UriKt
    public final void serializer(boolean z) {
        this.read = z;
        TextView textView = this.serializer;
        textView.setTransformationMethod(IconCompatParcelizer(textView.getTransformationMethod()));
        textView.setFilters(write(textView.getFilters()));
    }

    public isFinitek4lQ0Mannotations(TextView textView) {
        this.serializer = textView;
        this.RemoteActionCompatParcelizer = new getZeroF1C5BW0(textView);
    }

    @Override // coil3.UriKt
    public final TransformationMethod IconCompatParcelizer(TransformationMethod transformationMethod) {
        if (this.read) {
            return ((transformationMethod instanceof lerpWko1d7g) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new lerpWko1d7g(transformationMethod);
        }
        return transformationMethod instanceof lerpWko1d7g ? ((lerpWko1d7g) transformationMethod).write : transformationMethod;
    }

    @Override // coil3.UriKt
    public final InputFilter[] write(InputFilter[] inputFilterArr) {
        if (!this.read) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof getZeroF1C5BW0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            getZeroF1C5BW0 getzerof1c5bw0 = this.RemoteActionCompatParcelizer;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = getzerof1c5bw0;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == getzerof1c5bw0) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
