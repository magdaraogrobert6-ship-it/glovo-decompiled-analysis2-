package o;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.core.view.WindowInsetsCompat$Impl;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class component12 implements View.OnApplyWindowInsetsListener {
    public FocusRequesterModifierKt RemoteActionCompatParcelizer;
    public final WindowInsetsAnimationCompat$Callback read;

    public component12(View view, WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$Callback) {
        FocusRequesterModifierKt focusRequesterModifierKtRemoteActionCompatParcelizer;
        this.read = windowInsetsAnimationCompat$Callback;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        FocusRequesterModifierKt focusRequesterModifierKt = findFocusTargetui.read(view);
        if (focusRequesterModifierKt != null) {
            int i = Build.VERSION.SDK_INT;
            focusRequesterModifierKtRemoteActionCompatParcelizer = (i >= 36 ? new pinFocusedChild(focusRequesterModifierKt) : i >= 35 ? new FocusRequesterNode(focusRequesterModifierKt) : i >= 34 ? new FocusRequesterModifierNode(focusRequesterModifierKt) : i >= 31 ? new C0165focusRequester(focusRequesterModifierKt) : i >= 30 ? new FocusRequesterModifierNodeKt(focusRequesterModifierKt) : i >= 29 ? new FocusRequesterKt(focusRequesterModifierKt) : new getFocusRequester(focusRequesterModifierKt)).RemoteActionCompatParcelizer();
        } else {
            focusRequesterModifierKtRemoteActionCompatParcelizer = null;
        }
        this.RemoteActionCompatParcelizer = focusRequesterModifierKtRemoteActionCompatParcelizer;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.RemoteActionCompatParcelizer = FocusRequesterModifierKt.write(view, windowInsets);
            return component11.read(view, windowInsets);
        }
        FocusRequesterModifierKt focusRequesterModifierKtWrite = FocusRequesterModifierKt.write(view, windowInsets);
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKtWrite.IconCompatParcelizer;
        if (this.RemoteActionCompatParcelizer == null) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            this.RemoteActionCompatParcelizer = findFocusTargetui.read(view);
        }
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = focusRequesterModifierKtWrite;
            return component11.read(view, windowInsets);
        }
        WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$CallbackWrite = component11.write(view);
        if (windowInsetsAnimationCompat$CallbackWrite != null && Objects.equals(windowInsetsAnimationCompat$CallbackWrite.RemoteActionCompatParcelizer, focusRequesterModifierKtWrite)) {
            return component11.read(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        FocusRequesterModifierKt focusRequesterModifierKt = this.RemoteActionCompatParcelizer;
        int i = 1;
        while (i <= 512) {
            setRight insets = windowInsetsCompat$Impl.getInsets(i);
            setRight insets2 = focusRequesterModifierKt.IconCompatParcelizer.getInsets(i);
            int i2 = insets.RemoteActionCompatParcelizer;
            int i3 = insets.serializer;
            int i4 = insets.read;
            int i5 = insets.write;
            int i6 = insets2.RemoteActionCompatParcelizer;
            int i7 = insets2.serializer;
            int i8 = insets2.read;
            int i9 = insets2.write;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            focusRequesterModifierKt = focusRequesterModifierKt;
        }
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.RemoteActionCompatParcelizer = focusRequesterModifierKtWrite;
            return component11.read(view, windowInsets);
        }
        FocusRequesterModifierKt focusRequesterModifierKt2 = this.RemoteActionCompatParcelizer;
        if ((i10 & 8) != 0) {
            interpolator = component11.RatingCompat;
        } else if ((i11 & 8) != 0) {
            interpolator = component11.IconCompatParcelizer;
        } else if ((i10 & 519) != 0) {
            interpolator = component11.MediaDescriptionCompat;
        } else {
            interpolator = (i11 & 519) != 0 ? component11.MediaMetadataCompat : null;
        }
        component14 component14Var = new component14(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        component14Var.IconCompatParcelizer.serializer(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(component14Var.IconCompatParcelizer.IconCompatParcelizer());
        setRight insets3 = windowInsetsCompat$Impl.getInsets(i12);
        setRight insets4 = focusRequesterModifierKt2.IconCompatParcelizer.getInsets(i12);
        int iMin = Math.min(insets3.RemoteActionCompatParcelizer, insets4.RemoteActionCompatParcelizer);
        int i13 = insets3.write;
        int i14 = insets4.write;
        int iMin2 = Math.min(i13, i14);
        int i15 = insets3.read;
        int i16 = insets4.read;
        int iMin3 = Math.min(i15, i16);
        int i17 = insets3.serializer;
        int i18 = insets4.serializer;
        component15 component15Var = new component15(setRight.IconCompatParcelizer(iMin, iMin2, iMin3, Math.min(i17, i18)), setRight.IconCompatParcelizer(Math.max(insets3.RemoteActionCompatParcelizer, insets4.RemoteActionCompatParcelizer), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        component11.read(view, component14Var, focusRequesterModifierKtWrite, false);
        duration.addUpdateListener(new FocusRequesterElement(component14Var, focusRequesterModifierKtWrite, focusRequesterModifierKt2, i12, view));
        duration.addListener(new ColorSpaceVerificationHelperV34(component14Var, 1, view));
        accesstoUsingEnterExitScope.read(view, new ImageVectorCacheImageVectorEntry(2, view, component14Var, component15Var, duration, false));
        this.RemoteActionCompatParcelizer = focusRequesterModifierKtWrite;
        return component11.read(view, windowInsets);
    }
}
