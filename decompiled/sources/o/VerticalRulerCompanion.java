package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VerticalRulerCompanion {
    public static final int[] write = {android.R.attr.theme, com.logistics.rider.glovo.R.attr.theme};
    public static final int[] IconCompatParcelizer = {com.logistics.rider.glovo.R.attr.materialThemeOverlay};

    public static Context IconCompatParcelizer(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IconCompatParcelizer, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof getIndexOfFirstFeature) && ((getIndexOfFirstFeature) context).MediaDescriptionCompat == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        getIndexOfFirstFeature getindexoffirstfeature = new getIndexOfFirstFeature(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, write);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            getindexoffirstfeature.getTheme().applyStyle(resourceId2, true);
        }
        return getindexoffirstfeature;
    }
}
