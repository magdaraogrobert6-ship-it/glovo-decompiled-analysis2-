package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior {
    public ExpandableBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (!view.isLaidOut()) {
            ArrayList arrayList = coordinatorLayout.read(view);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                layoutDependsOn(coordinatorLayout, view, (View) arrayList.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }
}
