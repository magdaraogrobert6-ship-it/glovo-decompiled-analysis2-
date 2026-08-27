package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public final class VerticalRulerCompanionminOf1 extends androidx.appcompat.widget.AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalRulerCompanionminOf1(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = getContext();
        if (BuildersKt.IconCompatParcelizer(context2, com.logistics.rider.glovo.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = setMeasuredSizeozmzZPI.MaterialTextView;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iSerializer = -1;
            for (int i = 0; i < 2 && iSerializer < 0; i++) {
                iSerializer = ScaleFactorKt.serializer(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iSerializer != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, setMeasuredSizeozmzZPI.MaterialTextAppearance);
                Context context3 = getContext();
                int[] iArr3 = {1, 2};
                int iSerializer2 = -1;
                for (int i2 = 0; i2 < 2 && iSerializer2 < 0; i2++) {
                    iSerializer2 = ScaleFactorKt.serializer(context3, typedArrayObtainStyledAttributes3, iArr3[i2], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iSerializer2 >= 0) {
                    setLineHeight(iSerializer2);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (BuildersKt.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, setMeasuredSizeozmzZPI.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iSerializer = -1;
            for (int i2 = 0; i2 < 2 && iSerializer < 0; i2++) {
                iSerializer = ScaleFactorKt.serializer(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iSerializer >= 0) {
                setLineHeight(iSerializer);
            }
        }
    }
}
