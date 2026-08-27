package com.mapbox.navigation.ui.components.maneuver.view;

import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.base.internal.maneuver.ManeuverTurnIcon;
import o.createFromParcel;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxTurnIconManeuver$$ExternalSyntheticLambda1 implements Expected.Transformer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapboxTurnIconManeuver f$0;

    public /* synthetic */ MapboxTurnIconManeuver$$ExternalSyntheticLambda1(MapboxTurnIconManeuver mapboxTurnIconManeuver, int i) {
        this.$r8$classId = i;
        this.f$0 = mapboxTurnIconManeuver;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        MapboxTurnIconManeuver mapboxTurnIconManeuver = this.f$0;
        ManeuverTurnIcon maneuverTurnIcon = (ManeuverTurnIcon) obj;
        if (i != 0) {
            int i2 = MapboxTurnIconManeuver.$r8$clinit;
            maneuverTurnIcon.getClass();
            mapboxTurnIconManeuver.renderIcon(maneuverTurnIcon);
            return createfromparcel;
        }
        int i3 = MapboxTurnIconManeuver.$r8$clinit;
        maneuverTurnIcon.getClass();
        mapboxTurnIconManeuver.renderIcon(maneuverTurnIcon);
        return createfromparcel;
    }
}
