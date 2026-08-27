package com.google.android.material.appbar;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.FocusRequesterModifierKt;
import o.getActiveFocusTargetNode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public final Rect RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public final Rect write;

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final void write(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutWrite = AppBarLayout.ScrollingViewBehavior.write(coordinatorLayout.read(view));
        if (appBarLayoutWrite == null) {
            coordinatorLayout.RemoteActionCompatParcelizer(i, view);
            this.serializer = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int bottom = appBarLayoutWrite.getBottom();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int width = coordinatorLayout.getWidth();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int height = coordinatorLayout.getHeight();
        int bottom2 = appBarLayoutWrite.getBottom();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        Rect rect = this.write;
        rect.set(paddingLeft + i2, bottom + i3, (width - paddingRight) - i4, ((bottom2 + height) - paddingBottom) - i5);
        FocusRequesterModifierKt lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.read() + rect.left;
                rect.right -= lastWindowInsets.serializer();
            }
        }
        int i6 = layoutParams.IconCompatParcelizer;
        if (i6 == 0) {
            i6 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.RemoteActionCompatParcelizer;
        Gravity.apply(i6, measuredWidth, measuredHeight, rect, rect2, i);
        int iWrite = write(appBarLayoutWrite);
        view.layout(rect2.left, rect2.top - iWrite, rect2.right, rect2.bottom - iWrite);
        this.serializer = rect2.top - appBarLayoutWrite.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        AppBarLayout appBarLayoutWrite;
        FocusRequesterModifierKt lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (appBarLayoutWrite = AppBarLayout.ScrollingViewBehavior.write(coordinatorLayout.read(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (appBarLayoutWrite.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.write() + lastWindowInsets.RemoteActionCompatParcelizer();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = appBarLayoutWrite.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutWrite.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.write(i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
        return true;
    }

    public HeaderScrollingViewBehavior() {
        this.write = new Rect();
        this.RemoteActionCompatParcelizer = new Rect();
        this.serializer = 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public final int write(View view) {
        float f;
        int i;
        if (this.read == 0) {
            return 0;
        }
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).MediaDescriptionCompat;
            int iRemoteActionCompatParcelizer = behavior instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) behavior).RemoteActionCompatParcelizer() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iRemoteActionCompatParcelizer > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iRemoteActionCompatParcelizer / i) + 1.0f;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        int i2 = this.read;
        return getActiveFocusTargetNode.RemoteActionCompatParcelizer((int) (f * i2), 0, i2);
    }

    public HeaderScrollingViewBehavior(int i) {
        super(0);
        this.write = new Rect();
        this.RemoteActionCompatParcelizer = new Rect();
        this.serializer = 0;
    }
}
