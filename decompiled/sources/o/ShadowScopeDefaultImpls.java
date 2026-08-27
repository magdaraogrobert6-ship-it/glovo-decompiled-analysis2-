package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowScopeDefaultImpls {
    public float IconCompatParcelizer;
    public float read;
    public int serializer;
    public int write;

    public final void serializer(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BeyondBoundsLayoutKt.PropertySet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.read = typedArrayObtainStyledAttributes.getFloat(index, this.read);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.serializer);
                this.serializer = i2;
                this.serializer = androidx.constraintlayout.widget.ConstraintSet.IconCompatParcelizer[i2];
            } else if (index == 4) {
                this.write = typedArrayObtainStyledAttributes.getInt(index, this.write);
            } else if (index == 3) {
                this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.IconCompatParcelizer);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
