package o;

import android.graphics.drawable.Drawable;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetAppSwitchcp {
    public static final onViewDetachedFromWindowlambda1 read = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new setRectOutlinetz77jQwdefault(26));

    public static final long serializer(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? androidx.compose.ui.geometry.Size.Companion.m554getUnspecifiedNHjbRc() : androidx.compose.ui.geometry.SizeKt.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
