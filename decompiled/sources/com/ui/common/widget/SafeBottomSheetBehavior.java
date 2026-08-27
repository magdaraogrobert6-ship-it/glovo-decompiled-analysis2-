package com.ui.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class SafeBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        coordinatorLayout.getClass();
        v.getClass();
        motionEvent.getClass();
        try {
            return super.onInterceptTouchEvent(coordinatorLayout, v, motionEvent);
        } catch (IllegalArgumentException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Bottom sheet touch event exception captured safely in onInterceptTouchEvent", new Object[0]);
            return false;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        coordinatorLayout.getClass();
        v.getClass();
        motionEvent.getClass();
        try {
            return super.onTouchEvent(coordinatorLayout, v, motionEvent);
        } catch (IllegalArgumentException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Bottom sheet touch event exception captured safely in onTouchEvent", new Object[0]);
            return false;
        }
    }

    public SafeBottomSheetBehavior() {
    }
}
