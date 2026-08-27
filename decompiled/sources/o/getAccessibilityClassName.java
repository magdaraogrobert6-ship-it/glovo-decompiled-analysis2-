package o;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class getAccessibilityClassName {
    public final coil3.memory.MemoryCacheService RemoteActionCompatParcelizer;
    public final TextView write;

    public final void RemoteActionCompatParcelizer(boolean z) {
        ((coil3.UriKt) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(z);
    }

    public final void serializer(boolean z) {
        ((coil3.UriKt) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).serializer(z);
    }

    public final InputFilter[] serializer(InputFilter[] inputFilterArr) {
        return ((coil3.UriKt) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).write(inputFilterArr);
    }

    public final void write(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.write.getContext().obtainStyledAttributes(attributeSet, onUserLeaveHint.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            serializer(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public getAccessibilityClassName(TextView textView) {
        this.write = textView;
        coil3.memory.MemoryCacheService memoryCacheService = new coil3.memory.MemoryCacheService();
        memoryCacheService.RemoteActionCompatParcelizer = new isUnspecifiedk4lQ0M(textView);
        this.RemoteActionCompatParcelizer = memoryCacheService;
    }
}
