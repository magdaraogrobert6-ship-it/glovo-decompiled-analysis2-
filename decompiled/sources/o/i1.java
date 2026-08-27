package o;

import android.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import com.huawei.location.Vw$Vw;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleObjectInfo;
import com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer;
import com.mapbox.navigation.ui.maps.building.model.BuildingValue;
import com.mapbox.navigation.ui.maps.building.model.MapboxBuildingHighlightOptions;
import com.mapbox.navigation.ui.maps.building.view.BuildingView;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger$logNavigationArrival$1;
import io.sentry.SentryAttributes;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import o.createFromParcel;
import o.i0;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 implements MapboxNavigationConsumer {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ MapboxMap IconCompatParcelizer;
    public final /* synthetic */ i0 read;
    public final /* synthetic */ i0 serializer;

    public i1(i0 i0Var, MapboxMap mapboxMap, i0 i0Var2) {
        this.serializer = i0Var;
        this.IconCompatParcelizer = mapboxMap;
        this.read = i0Var2;
    }

    @Override // com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer
    public final void accept(Object obj) {
        int i = 2 % 2;
        Expected expected = (Expected) obj;
        expected.getClass();
        final i0 i0Var = this.serializer;
        final i0 i0Var2 = this.read;
        i7 i7Var = new i7(i0Var, i0Var2);
        final MapboxMap mapboxMap = this.IconCompatParcelizer;
        expected.fold(i7Var, new Expected.Transformer() { // from class: com.roadrunner.map.integration.mapbox.buildinghighlight.BuildingHighlightApi$init$$inlined$buildingResultCallback$1$2
            private static int read = 0;
            private static int serializer = 1;

            @Override // com.mapbox.bindgen.Expected.Transformer
            public final Object invoke(Object obj2) {
                int i2 = 2 % 2;
                int i3 = serializer + 19;
                read = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    BuildingValue buildingValue = (BuildingValue) obj2;
                    buildingValue.getClass();
                    buildingValue.buildings.isEmpty();
                    throw null;
                }
                final BuildingValue buildingValue2 = (BuildingValue) obj2;
                buildingValue2.getClass();
                boolean zIsEmpty = buildingValue2.buildings.isEmpty();
                final i0 i0Var3 = i0Var2;
                final i0 i0Var4 = i0Var;
                if (zIsEmpty) {
                    i0Var4.serializer = false;
                    i0Var3.RemoteActionCompatParcelizer.serializer.IconCompatParcelizer(Boolean.FALSE);
                } else {
                    i0Var4.serializer = true;
                    mapboxMap.getStyle(new Style.OnStyleLoaded() { // from class: com.roadrunner.map.integration.mapbox.buildinghighlight.BuildingHighlightApi$init$$inlined$buildingResultCallback$1$2.1
                        private static int IconCompatParcelizer = 1;
                        private static int RemoteActionCompatParcelizer;

                        @Override // com.mapbox.maps.Style.OnStyleLoaded
                        public final void onStyleLoaded(Style style) {
                            Object next;
                            String id;
                            String id2;
                            BuildingView buildingView;
                            int i4 = 2 % 2;
                            int i5 = RemoteActionCompatParcelizer + 111;
                            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            style.getClass();
                            Vw$Vw vw$Vw = i0Var4.IconCompatParcelizer;
                            if (vw$Vw != null) {
                                List list = buildingValue2.buildings;
                                MapboxBuildingHighlightOptions mapboxBuildingHighlightOptions = new MapboxBuildingHighlightOptions(Color.parseColor("#FC2B14"));
                                list.getClass();
                                if (style.styleLayerExists("building-extrusion")) {
                                    buildingView = (SentryAttributes) vw$Vw.IconCompatParcelizer;
                                    int i7 = RemoteActionCompatParcelizer + 87;
                                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                                    int i8 = i7 % 2;
                                } else {
                                    buildingView = (AnalyticsServiceImpl) vw$Vw.serializer;
                                }
                                buildingView.highlightBuilding(style, list, mapboxBuildingHighlightOptions);
                            }
                            Iterator<T> it = style.getStyleLayers().iterator();
                            int i9 = RemoteActionCompatParcelizer + 103;
                            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                } else {
                                    next = it.next();
                                    id2 = ((StyleObjectInfo) next).getId();
                                    id2.getClass();
                                }
                            } while (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(id2, "LAYER_TYPE_ROAD_", false));
                            StyleObjectInfo styleObjectInfo = (StyleObjectInfo) next;
                            if (styleObjectInfo != null && (id = styleObjectInfo.getId()) != null) {
                                style.moveStyleLayer("mapbox-building-highlight-layer", new LayerPosition(id, null, null));
                            }
                            i0 i0Var5 = i0Var3;
                            i0Var5.RemoteActionCompatParcelizer.serializer.IconCompatParcelizer(Boolean.TRUE);
                            TurnByTurnNavigationLogger turnByTurnNavigationLogger = i0Var5.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
                            BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, null, 1), 3);
                        }
                    });
                }
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                int i4 = serializer + 39;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 19 / 0;
                }
                return createfromparcel;
            }
        });
        int i2 = RemoteActionCompatParcelizer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
