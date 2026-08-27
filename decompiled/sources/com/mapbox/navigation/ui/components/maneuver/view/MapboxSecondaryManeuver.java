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
import com.mapbox.navigation.tripdata.maneuver.model.RoadShieldComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.SecondaryManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.TextComponentNode;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverExitOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverInstructionGenerator;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverSecondaryOptions;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.getSetText;
import o.getShowTextSubstitution;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxSecondaryManeuver extends AppCompatTextView {
    public ManeuverSecondaryOptions options;

    public final ManeuverSecondaryOptions getOptions$ui_components_release() {
        return this.options;
    }

    public final void renderManeuver(SecondaryManeuver secondaryManeuver, LinkedHashSet linkedHashSet) {
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
        if (secondaryManeuver != null) {
            Iterator it = secondaryManeuver.componentList.iterator();
            while (it.hasNext()) {
                ComponentNode componentNode = ((Component) it.next()).node;
                if (componentNode instanceof TextComponentNode) {
                    spannableStringBuilder.append((CharSequence) ((TextComponentNode) componentNode).text);
                    spannableStringBuilder.append((CharSequence) " ");
                } else if (componentNode instanceof ExitNumberComponentNode) {
                    ExitNumberComponentNode exitNumberComponentNode = (ExitNumberComponentNode) componentNode;
                    mapboxExitText.setExit(secondaryManeuver.modifier, exitNumberComponentNode);
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
        }
        if (spannableStringBuilder.length() > 0) {
            setText(spannableStringBuilder);
        }
    }

    public MapboxSecondaryManeuver(Context context, AttributeSet attributeSet) {
        context.getClass();
        ManeuverSecondaryOptions maneuverSecondaryOptions = new ManeuverSecondaryOptions(R.style.MapboxStyleSecondaryManeuver, new ManeuverExitOptions(R.style.MapboxStyleExitTextForSecondary, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna)));
        super(context, attributeSet, R.style.MapboxStyleSecondaryManeuver);
        this.options = maneuverSecondaryOptions;
    }
}
