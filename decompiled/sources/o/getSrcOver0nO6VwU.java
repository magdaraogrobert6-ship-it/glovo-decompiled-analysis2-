package o;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class getSrcOver0nO6VwU extends androidx.recyclerview.widget.LinearSmoothScroller {
    public final /* synthetic */ androidx.recyclerview.widget.PagerSnapHelper r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final float write(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSrcOver0nO6VwU(androidx.recyclerview.widget.PagerSnapHelper pagerSnapHelper, Context context) {
        super(context);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = pagerSnapHelper;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final void RemoteActionCompatParcelizer(View view, BrushCompanion brushCompanion) {
        androidx.recyclerview.widget.PagerSnapHelper pagerSnapHelper = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int[] iArrWrite = pagerSnapHelper.write(pagerSnapHelper.read.getLayoutManager(), view);
        int i = iArrWrite[0];
        int i2 = iArrWrite[1];
        int iCeil = (int) Math.ceil(((double) serializer(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            brushCompanion.read = i;
            brushCompanion.IconCompatParcelizer = i2;
            brushCompanion.write = iCeil;
            brushCompanion.RatingCompat = this.read;
            brushCompanion.RemoteActionCompatParcelizer = true;
        }
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int serializer(int i) {
        return Math.min(100, super.serializer(i));
    }
}
