package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.transition.Transition$3;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import io.sentry.SentryUUID;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.handleMotionFrameOfReferencePlacement;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior {
    public int IconCompatParcelizer;
    public TimeInterpolator MediaBrowserCompatMediaItem;
    public ViewPropertyAnimator RemoteActionCompatParcelizer;
    public TimeInterpolator read;
    public int serializer;
    public final LinkedHashSet MediaDescriptionCompat = new LinkedHashSet();
    public int RatingCompat = 0;
    public int write = 2;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LinkedHashSet linkedHashSet = this.MediaDescriptionCompat;
        if (i2 > 0) {
            if (this.write == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.RemoteActionCompatParcelizer;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.write = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
            this.RemoteActionCompatParcelizer = view.animate().translationY(this.RatingCompat).setInterpolator(this.MediaBrowserCompatMediaItem).setDuration(this.serializer).setListener(new Transition$3(4, this));
            return;
        }
        if (i2 >= 0 || this.write == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.RemoteActionCompatParcelizer;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.write = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it2);
        }
        this.RemoteActionCompatParcelizer = view.animate().translationY(0.0f).setInterpolator(this.read).setDuration(this.IconCompatParcelizer).setListener(new Transition$3(4, this));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.RatingCompat = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.IconCompatParcelizer = SentryUUID.write(view.getContext(), R.attr.motionDurationLong2, 225);
        this.serializer = SentryUUID.write(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.read = SentryUUID.IconCompatParcelizer(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, handleMotionFrameOfReferencePlacement.IconCompatParcelizer);
        this.MediaBrowserCompatMediaItem = SentryUUID.IconCompatParcelizer(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, handleMotionFrameOfReferencePlacement.serializer);
        return false;
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
