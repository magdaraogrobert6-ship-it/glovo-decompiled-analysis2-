package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ScaleFactorKt {
    public static ColorStateList IconCompatParcelizer(Context context, androidx.emoji2.text.EmojiProcessor emojiProcessor, int i) {
        int resourceId;
        ColorStateList colorStateListWrite;
        TypedArray typedArray = (TypedArray) emojiProcessor.read;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListWrite = FocusListener.write(context, resourceId)) == null) ? emojiProcessor.serializer(i) : colorStateListWrite;
    }

    public static int serializer(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static boolean write(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static Drawable write(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableWrite;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableWrite = coil3.util.IntPair.write(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableWrite;
    }

    public static ColorStateList IconCompatParcelizer(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListWrite;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListWrite = FocusListener.write(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListWrite;
    }
}
