package com.mapbox.navigation.ui.components.maneuver.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxManeuversList extends RecyclerView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public boolean mRequestedLayout;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        if (this.mRequestedLayout) {
            return;
        }
        this.mRequestedLayout = true;
        post(new ZM$$ExternalSyntheticLambda2(10, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxManeuversList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
    }
}
