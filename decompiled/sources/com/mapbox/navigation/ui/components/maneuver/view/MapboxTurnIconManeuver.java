package com.mapbox.navigation.ui.components.maneuver.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.internal.maneuver.ManeuverTurnIcon;
import com.mapbox.navigation.base.internal.maneuver.TurnIconHelper;
import com.mapbox.navigation.tripdata.maneuver.model.PrimaryManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.TurnIconResources;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import o.getIndexOfFirstFeature;
import o.getNonefv9h1I;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxTurnIconManeuver extends AppCompatImageView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public getIndexOfFirstFeature contextThemeWrapper;
    public final AnalyticsServiceImpl turnIconsApi;

    public final getIndexOfFirstFeature getTurnIconTheme$ui_components_release() {
        return this.contextThemeWrapper;
    }

    public final void renderIcon(ManeuverTurnIcon maneuverTurnIcon) {
        if (maneuverTurnIcon != null) {
            int iIntValue = maneuverTurnIcon.icon.intValue();
            setRotationY(maneuverTurnIcon.shouldFlipIcon ? 180.0f : 0.0f);
            setImageDrawable(getNonefv9h1I.RemoteActionCompatParcelizer(getContext().getResources(), iIntValue, this.contextThemeWrapper.getTheme()));
        }
    }

    public final void renderPrimaryTurnIcon(PrimaryManeuver primaryManeuver) {
        String str = primaryManeuver.type;
        Double d = primaryManeuver.degrees;
        this.turnIconsApi.generateTurnIcon(str, d != null ? Float.valueOf((float) d.doubleValue()) : null, primaryManeuver.modifier, primaryManeuver.drivingSide).fold(new Snapshotter$$ExternalSyntheticLambda0(23), new MapboxTurnIconManeuver$$ExternalSyntheticLambda1(this, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxTurnIconManeuver(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.contextThemeWrapper = new getIndexOfFirstFeature(context, R.style.MapboxStyleTurnIconManeuver);
        TurnIconResources turnIconResources = new TurnIconResources();
        AnalyticsServiceImpl analyticsServiceImpl = new AnalyticsServiceImpl(14);
        analyticsServiceImpl.locationProvider = new TurnIconHelper(turnIconResources);
        this.turnIconsApi = analyticsServiceImpl;
    }
}
