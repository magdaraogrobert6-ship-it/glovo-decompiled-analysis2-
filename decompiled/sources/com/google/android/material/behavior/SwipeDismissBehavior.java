package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.FocusRestorerNode;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.SubcomposeLayoutStatePausedPrecomposition;
import o.clearChildFocusdefault;
import o.placeWithLayeraW9wMdefault;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior {
    public clearChildFocusdefault MediaSessionCompatQueueItem;
    public boolean RatingCompat;
    public SubcomposeLayoutStatePausedPrecomposition RemoteActionCompatParcelizer;
    public boolean read;
    public int MediaMetadataCompat = 2;
    public float IconCompatParcelizer = 0.0f;
    public float write = 0.5f;
    public final placeWithLayeraW9wMdefault serializer = new placeWithLayeraW9wMdefault(this);

    public boolean write(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zWrite = this.read;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zWrite = coordinatorLayout.write((int) motionEvent.getX(), (int) motionEvent.getY(), view);
            this.read = zWrite;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.read = false;
        }
        if (zWrite) {
            if (this.MediaSessionCompatQueueItem == null) {
                this.MediaSessionCompatQueueItem = new clearChildFocusdefault(coordinatorLayout.getContext(), coordinatorLayout, this.serializer);
            }
            if (!this.RatingCompat && this.MediaSessionCompatQueueItem.read(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            FocusPropertiesNode.read(1048576, view);
            FocusPropertiesNode.serializer(0, view);
            if (write(view)) {
                FocusPropertiesNode.read(view, FocusRestorerNode.MediaBrowserCompatMediaItem, new PinnableContainerKtLocalPinnableContainer1(14, this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.MediaSessionCompatQueueItem == null) {
            return false;
        }
        if (this.RatingCompat && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.MediaSessionCompatQueueItem.serializer(motionEvent);
        return true;
    }
}
