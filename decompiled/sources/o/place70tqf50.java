package o;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class place70tqf50 {
    public static final int[] serializer = {android.R.attr.stateListAnimator};

    public static void serializer(AppBarLayout appBarLayout, float f) {
        int integer = appBarLayout.getResources().getInteger(com.logistics.rider.glovo.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, com.logistics.rider.glovo.R.attr.state_liftable, -2130970087}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
