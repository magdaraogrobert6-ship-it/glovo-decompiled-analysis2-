package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes4.dex */
public final class IntentUtils extends MaterialButton {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentUtils(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        int[] iArr = {android.R.attr.textColor, android.R.attr.backgroundTint, android.R.attr.strokeColor, android.R.attr.strokeWidth};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, accessgetDependenciesSetp.TagView, 0, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(4, com.logistics.rider.glovo.R.style.Widget_RoadRunner_Tag_Background_White), iArr);
        read(typedArrayObtainStyledAttributes2);
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(2, com.logistics.rider.glovo.R.style.Widget_RoadRunner_Tag_Background_Default), iArr);
        read(typedArrayObtainStyledAttributes3);
        typedArrayObtainStyledAttributes3.recycle();
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(3, com.logistics.rider.glovo.R.style.Widget_RoadRunner_Tag_Background_Success), iArr);
        read(typedArrayObtainStyledAttributes4);
        typedArrayObtainStyledAttributes4.recycle();
        TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(1, com.logistics.rider.glovo.R.style.Widget_RoadRunner_Tag_Background_Error), iArr);
        read(typedArrayObtainStyledAttributes5);
        typedArrayObtainStyledAttributes5.recycle();
        TypedArray typedArrayObtainStyledAttributes6 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(0, com.logistics.rider.glovo.R.style.Widget_RoadRunner_Tag_Background_Alert), iArr);
        read(typedArrayObtainStyledAttributes6);
        typedArrayObtainStyledAttributes6.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }

    public static validateDateComponents read(TypedArray typedArray) {
        return new validateDateComponents(typedArray.getColorStateList(0), typedArray.getColorStateList(1), typedArray.getColorStateList(2), typedArray.getResourceId(3, -1));
    }
}
