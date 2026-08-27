package o;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.core.view.WindowInsetsCompat$Impl;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class FocusRequesterElement implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FocusRequesterModifierKt IconCompatParcelizer;
    public final /* synthetic */ component14 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ View serializer;
    public final /* synthetic */ FocusRequesterModifierKt write;

    public FocusRequesterElement(component14 component14Var, FocusRequesterModifierKt focusRequesterModifierKt, FocusRequesterModifierKt focusRequesterModifierKt2, int i, View view) {
        this.RemoteActionCompatParcelizer = component14Var;
        this.IconCompatParcelizer = focusRequesterModifierKt;
        this.write = focusRequesterModifierKt2;
        this.read = i;
        this.serializer = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FocusRequesterModifier focusRequesterKt;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        component14 component14Var = this.RemoteActionCompatParcelizer;
        component13 component13Var = component14Var.IconCompatParcelizer;
        component13Var.serializer(animatedFraction);
        float fRemoteActionCompatParcelizer = component13Var.RemoteActionCompatParcelizer();
        PathInterpolator pathInterpolator = component11.RatingCompat;
        int i = Build.VERSION.SDK_INT;
        FocusRequesterModifierKt focusRequesterModifierKt = this.IconCompatParcelizer;
        if (i >= 36) {
            focusRequesterKt = new pinFocusedChild(focusRequesterModifierKt);
        } else if (i >= 35) {
            focusRequesterKt = new FocusRequesterNode(focusRequesterModifierKt);
        } else if (i >= 34) {
            focusRequesterKt = new FocusRequesterModifierNode(focusRequesterModifierKt);
        } else if (i >= 31) {
            focusRequesterKt = new C0165focusRequester(focusRequesterModifierKt);
        } else if (i >= 30) {
            focusRequesterKt = new FocusRequesterModifierNodeKt(focusRequesterModifierKt);
        } else {
            focusRequesterKt = i >= 29 ? new FocusRequesterKt(focusRequesterModifierKt) : new getFocusRequester(focusRequesterModifierKt);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.read;
            WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
            if ((i3 & i2) == 0) {
                focusRequesterKt.IconCompatParcelizer(i2, windowInsetsCompat$Impl.getInsets(i2));
            } else {
                setRight insets = windowInsetsCompat$Impl.getInsets(i2);
                setRight insets2 = this.write.IconCompatParcelizer.getInsets(i2);
                float f = 1.0f - fRemoteActionCompatParcelizer;
                focusRequesterKt.IconCompatParcelizer(i2, FocusRequesterModifierKt.IconCompatParcelizer(insets, (int) (((double) ((insets.RemoteActionCompatParcelizer - insets2.RemoteActionCompatParcelizer) * f)) + 0.5d), (int) (((double) ((insets.write - insets2.write) * f)) + 0.5d), (int) (((double) ((insets.read - insets2.read) * f)) + 0.5d), (int) (((double) ((insets.serializer - insets2.serializer) * f)) + 0.5d)));
            }
        }
        component11.IconCompatParcelizer(this.serializer, focusRequesterKt.RemoteActionCompatParcelizer(), Collections.singletonList(component14Var));
    }
}
