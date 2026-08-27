package com.mapbox.maps;

import android.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import com.huawei.location.Vw$Vw;
import com.mapbox.maps.extension.style.StyleContract$StyleExtension;
import com.mapbox.navigation.ui.maps.building.model.MapboxBuildingHighlightOptions;
import com.mapbox.navigation.ui.maps.building.view.BuildingView;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import io.sentry.SentryAttributes;
import o.i0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda2 implements Style.OnStyleLoaded {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda2(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style style) {
        BuildingView buildingView;
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        if (i2 == 0) {
            MapboxMap.loadStyle$lambda$7((StyleContract$StyleExtension) obj, style);
            int i3 = RemoteActionCompatParcelizer + 59;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 12 / 0;
                return;
            }
            return;
        }
        if (i2 == 1) {
            MapboxMap.loadStyle$lambda$10((StyleContract$StyleExtension) obj, style);
            int i5 = write + 45;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (i2 == 2) {
            MapboxMap.loadStyle$lambda$13((StyleContract$StyleExtension) obj, style);
            return;
        }
        i0 i0Var = (i0) obj;
        style.getClass();
        Vw$Vw vw$Vw = i0Var.IconCompatParcelizer;
        if (vw$Vw != null) {
            MapboxBuildingHighlightOptions mapboxBuildingHighlightOptions = new MapboxBuildingHighlightOptions(Color.parseColor("#FC2B14"));
            if (style.styleLayerExists("building-extrusion")) {
                int i6 = write + 39;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                buildingView = (SentryAttributes) vw$Vw.IconCompatParcelizer;
            } else {
                buildingView = (AnalyticsServiceImpl) vw$Vw.serializer;
            }
            buildingView.removeBuildingHighlight(style, mapboxBuildingHighlightOptions);
        }
        i0Var.serializer = false;
        i0Var.RemoteActionCompatParcelizer.serializer.IconCompatParcelizer(Boolean.FALSE);
    }
}
