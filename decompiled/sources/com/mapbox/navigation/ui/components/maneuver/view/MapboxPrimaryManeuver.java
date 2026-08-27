package com.mapbox.navigation.ui.components.maneuver.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.tripdata.maneuver.model.Component;
import com.mapbox.navigation.tripdata.maneuver.model.ComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.DelimiterComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.ExitNumberComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.PrimaryManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.RoadShieldComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.TextComponentNode;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverExitOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverInstructionGenerator;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverPrimaryOptions;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.getSetText;
import o.getShowTextSubstitution;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxPrimaryManeuver extends AppCompatTextView {
    public ManeuverPrimaryOptions options;

    public final ManeuverPrimaryOptions getOptions$ui_components_release() {
        return this.options;
    }

    public final void renderManeuver(PrimaryManeuver primaryManeuver, LinkedHashSet linkedHashSet) {
        Context context = getContext();
        context.getClass();
        MapboxExitText mapboxExitText = new MapboxExitText(context);
        mapboxExitText.setTextAppearance(this.options.exitOptions.textAppearance);
        mapboxExitText.exitProperties = this.options.exitOptions.mutcdExitProperties;
        mapboxExitText.exitBackground = mapboxExitText.getContext().getDrawable(R.drawable.mapbox_exit_board_background);
        Context context2 = getContext();
        context2.getClass();
        int lineHeight = getLineHeight();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = primaryManeuver.componentList.iterator();
        while (it.hasNext()) {
            ComponentNode componentNode = ((Component) it.next()).node;
            if (componentNode instanceof TextComponentNode) {
                spannableStringBuilder.append((CharSequence) ((TextComponentNode) componentNode).text);
                spannableStringBuilder.append((CharSequence) " ");
            } else if (componentNode instanceof ExitNumberComponentNode) {
                ExitNumberComponentNode exitNumberComponentNode = (ExitNumberComponentNode) componentNode;
                mapboxExitText.setExit(primaryManeuver.modifier, exitNumberComponentNode);
                String str = exitNumberComponentNode.text;
                Resources resources = context2.getResources();
                resources.getClass();
                ManeuverInstructionGenerator.addExitToBuilder(str, mapboxExitText, lineHeight, resources, spannableStringBuilder);
            } else if (componentNode instanceof RoadShieldComponentNode) {
                RoadShieldComponentNode roadShieldComponentNode = (RoadShieldComponentNode) componentNode;
                String str2 = roadShieldComponentNode.text;
                Resources resources2 = context2.getResources();
                resources2.getClass();
                ManeuverInstructionGenerator.getShieldToRender(roadShieldComponentNode, linkedHashSet);
                ManeuverInstructionGenerator.addShieldToBuilder(str2, resources2, spannableStringBuilder);
            } else if (componentNode instanceof DelimiterComponentNode) {
                spannableStringBuilder.append((CharSequence) ((DelimiterComponentNode) componentNode).text);
                spannableStringBuilder.append((CharSequence) " ");
            }
        }
        if (spannableStringBuilder.length() > 0) {
            setText(spannableStringBuilder);
        }
    }

    public MapboxPrimaryManeuver(Context context, AttributeSet attributeSet) {
        context.getClass();
        ManeuverPrimaryOptions maneuverPrimaryOptions = new ManeuverPrimaryOptions(R.style.MapboxStylePrimaryManeuver, new ManeuverExitOptions(R.style.MapboxStyleExitTextForPrimary, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna)));
        super(context, attributeSet, R.style.MapboxStylePrimaryManeuver);
        this.options = maneuverPrimaryOptions;
    }
}
