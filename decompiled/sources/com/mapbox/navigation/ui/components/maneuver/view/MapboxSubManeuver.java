package com.mapbox.navigation.ui.components.maneuver.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverExitOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverSubOptions;
import o.getSetText;
import o.getShowTextSubstitution;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxSubManeuver extends AppCompatTextView {
    public ManeuverSubOptions options;

    public MapboxSubManeuver(Context context, AttributeSet attributeSet) {
        context.getClass();
        ManeuverSubOptions maneuverSubOptions = new ManeuverSubOptions(R.style.MapboxStyleSubManeuver, new ManeuverExitOptions(R.style.MapboxStyleExitTextForSub, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna)));
        super(context, attributeSet, R.style.MapboxStyleSubManeuver);
        this.options = maneuverSubOptions;
    }
}
