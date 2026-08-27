package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class resetShadow {
    public final float IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final float read;
    public final float serializer;
    public final float write;

    public resetShadow(Context context, XmlResourceParser xmlResourceParser) {
        this.read = Float.NaN;
        this.write = Float.NaN;
        this.IconCompatParcelizer = Float.NaN;
        this.serializer = Float.NaN;
        this.RemoteActionCompatParcelizer = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), BeyondBoundsLayoutKt.Variant);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.RemoteActionCompatParcelizer);
                this.RemoteActionCompatParcelizer = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new androidx.constraintlayout.widget.ConstraintSet().read((androidx.constraintlayout.widget.ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.serializer = typedArrayObtainStyledAttributes.getDimension(index, this.serializer);
            } else if (index == 2) {
                this.write = typedArrayObtainStyledAttributes.getDimension(index, this.write);
            } else if (index == 3) {
                this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimension(index, this.IconCompatParcelizer);
            } else if (index == 4) {
                this.read = typedArrayObtainStyledAttributes.getDimension(index, this.read);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
