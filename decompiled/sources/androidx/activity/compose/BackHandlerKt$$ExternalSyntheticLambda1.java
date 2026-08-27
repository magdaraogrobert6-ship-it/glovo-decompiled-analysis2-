package androidx.activity.compose;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.maps.MapView;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy;
import kotlinx.coroutines.DelayKt;
import o.addOnConfigurationChangedListener;
import o.addOnContextAvailableListener;
import o.createFromParcel;
import o.getPersonNamePrefix;
import o.getStrokeWidth;
import o.onActivityCreated;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BackHandlerKt$$ExternalSyntheticLambda1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ BackHandlerKt$$ExternalSyntheticLambda1(Object obj, boolean z, int i) {
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        boolean z = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        if (i2 == 0) {
            addOnConfigurationChangedListener addonconfigurationchangedlistener = (addOnConfigurationChangedListener) obj2;
            addonconfigurationchangedlistener.MediaBrowserCompatMediaItem.setEnabled(z);
            addonconfigurationchangedlistener.MediaSessionCompatQueueItem.read(z);
            return new addOnContextAvailableListener((getStrokeWidth) obj, addonconfigurationchangedlistener);
        }
        if (i2 == 1) {
            ((getPersonNamePrefix) obj).getClass();
            ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(Boolean.valueOf(z));
            return new onActivityCreated();
        }
        ((Style) obj).getClass();
        MapView mapView = ((MapboxViewProxy) obj2).MediaMetadataCompat;
        if (mapView == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        int i3 = write + 125;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        LocationComponentPluginImpl locationComponent = DelayKt.getLocationComponent(mapView);
        LocationComponentSettings.Builder builder = locationComponent.getInternalSettings().toBuilder();
        builder.enabled = z;
        builder.pulsingEnabled = false;
        LocationComponentSettings locationComponentSettingsBuild = builder.build();
        boolean z2 = locationComponentSettingsBuild.enabled;
        if (locationComponent.getInternalSettings().enabled != z2) {
            int i5 = write + 5;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                LocationComponentSettings.Builder builder2 = locationComponent.getInternalSettings().toBuilder();
                builder2.enabled = z2;
                locationComponent.internalSettings = builder2.build();
                locationComponent.applySettings();
                throw null;
            }
            LocationComponentSettings.Builder builder3 = locationComponent.getInternalSettings().toBuilder();
            builder3.enabled = z2;
            locationComponent.internalSettings = builder3.build();
            locationComponent.applySettings();
        }
        locationComponent.internalSettings = locationComponentSettingsBuild;
        locationComponent.applySettings();
        return createFromParcel.INSTANCE;
    }
}
