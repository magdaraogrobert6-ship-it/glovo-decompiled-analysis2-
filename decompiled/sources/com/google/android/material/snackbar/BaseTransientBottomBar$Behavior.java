package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.transition.TransitionValuesMaps;
import com.google.android.material.behavior.SwipeDismissBehavior;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.SubcomposeMeasureScope;
import o.SubcomposeSlotReusePolicySlotIdsSet;

/* JADX INFO: loaded from: classes4.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final PinnableContainerKtLocalPinnableContainer1 MediaBrowserCompatMediaItem;

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = this.MediaBrowserCompatMediaItem;
        pinnableContainerKtLocalPinnableContainer1.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                TransitionValuesMaps.MediaDescriptionCompat().write((SubcomposeMeasureScope) pinnableContainerKtLocalPinnableContainer1.serializer);
            }
        } else if (coordinatorLayout.write((int) motionEvent.getX(), (int) motionEvent.getY(), view)) {
            TransitionValuesMaps.MediaDescriptionCompat().RemoteActionCompatParcelizer((SubcomposeMeasureScope) pinnableContainerKtLocalPinnableContainer1.serializer);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean write(View view) {
        this.MediaBrowserCompatMediaItem.getClass();
        return view instanceof SubcomposeSlotReusePolicySlotIdsSet;
    }

    public BaseTransientBottomBar$Behavior() {
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = new PinnableContainerKtLocalPinnableContainer1(19, false);
        this.IconCompatParcelizer = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.write = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.MediaMetadataCompat = 0;
        this.MediaBrowserCompatMediaItem = pinnableContainerKtLocalPinnableContainer1;
    }
}
