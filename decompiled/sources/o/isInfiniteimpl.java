package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class isInfiniteimpl implements isCaptured {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ androidx.transition.TransitionValuesMaps write;

    public /* synthetic */ isInfiniteimpl(androidx.transition.TransitionValuesMaps transitionValuesMaps, int i) {
        this.serializer = i;
        this.write = transitionValuesMaps;
    }

    @Override // o.isCaptured
    public final boolean read(View view) {
        int i = this.serializer;
        androidx.transition.TransitionValuesMaps transitionValuesMaps = this.write;
        if (i != 0) {
            int currentItem = ((androidx.viewpager2.widget.ViewPager2) view).getCurrentItem();
            androidx.viewpager2.widget.ViewPager2 viewPager2 = (androidx.viewpager2.widget.ViewPager2) transitionValuesMaps.RatingCompat;
            if (viewPager2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                viewPager2.setCurrentItemInternal(currentItem - 1);
            }
            return true;
        }
        int currentItem2 = ((androidx.viewpager2.widget.ViewPager2) view).getCurrentItem();
        androidx.viewpager2.widget.ViewPager2 viewPager3 = (androidx.viewpager2.widget.ViewPager2) transitionValuesMaps.RatingCompat;
        if (viewPager3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            viewPager3.setCurrentItemInternal(currentItem2 + 1);
        }
        return true;
    }
}
