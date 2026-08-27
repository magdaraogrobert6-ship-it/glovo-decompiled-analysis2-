package com.roadrunner.map.integration.mapbox.navigation;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import com.mapbox.navigation.core.MapboxNavigation;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class MapNavigationImpl$$ExternalSyntheticLambda3 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ MapNavigationImpl write;

    public /* synthetic */ MapNavigationImpl$$ExternalSyntheticLambda3(MapNavigationImpl mapNavigationImpl, int i) {
        this.read = i;
        this.write = mapNavigationImpl;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        MapNavigationImpl mapNavigationImpl = this.write;
        if (i3 != 0) {
            LocationComponentSettings.Builder builder = (LocationComponentSettings.Builder) obj;
            builder.getClass();
            builder.locationPuck = mapNavigationImpl.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer();
            builder.puckBearingEnabled = true;
            builder.enabled = true;
            return createfromparcel2;
        }
        MapboxNavigation mapboxNavigation = (MapboxNavigation) obj;
        mapboxNavigation.getClass();
        mapNavigationImpl.getClass();
        mapboxNavigation.startTripSession();
        int i4 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel2;
        }
        obj2.hashCode();
        throw null;
    }
}
