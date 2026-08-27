package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class idefault extends RectRulersImpl {
    public final float ParcelableVolumeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idefault(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, accessgetDependenciesSetp.RoadrunnerCardView);
        typedArrayObtainStyledAttributes.getClass();
        float dimension = typedArrayObtainStyledAttributes.getDimension(1, this.ParcelableVolumeInfo);
        this.ParcelableVolumeInfo = dimension;
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.48f);
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new getLogLevelannotations(f, (int) dimension, 0));
    }
}
