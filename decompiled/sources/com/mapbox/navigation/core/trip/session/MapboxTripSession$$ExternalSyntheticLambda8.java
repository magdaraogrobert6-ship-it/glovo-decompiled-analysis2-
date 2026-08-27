package com.mapbox.navigation.core.trip.session;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.geojson.Feature;
import com.mapbox.navigation.ui.maps.route.arrow.model.ArrowAddedValue;
import com.mapbox.navigation.ui.maps.route.arrow.model.UpdateManeuverArrowValue;
import com.mapbox.navigation.ui.maps.route.line.model.ClosestRouteValue;
import com.mapbox.navigation.ui.maps.route.line.model.RouteFeatureData;
import java.util.List;
import o.containsImportantForAccessibilityui;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxTripSession$$ExternalSyntheticLambda8 implements Expected.Transformer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;

    public /* synthetic */ MapboxTripSession$$ExternalSyntheticLambda8(List list, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        List list = this.f$0;
        if (i == 0) {
            List list2 = (List) obj;
            list.getClass();
            list2.getClass();
            return new NativeSetRouteValue(list, list2);
        }
        if (i == 1) {
            ((containsImportantForAccessibilityui) obj).getClass();
            return new UpdateManeuverArrowValue(list, null, null);
        }
        if (i != 2) {
            Integer num = (Integer) obj;
            list.getClass();
            num.getClass();
            return ExpectedFactory.createValue(new ClosestRouteValue(((RouteFeatureData) list.get(num.intValue())).route));
        }
        ArrowAddedValue arrowAddedValue = (ArrowAddedValue) obj;
        arrowAddedValue.getClass();
        List<Feature> listFeatures = arrowAddedValue.arrowShaftFeatureCollection.features();
        Feature feature = listFeatures != null ? (Feature) onContentCardDismissed.MediaMetadataCompat((List) listFeatures) : null;
        List<Feature> listFeatures2 = arrowAddedValue.arrowHeadFeatureCollection.features();
        return new UpdateManeuverArrowValue(list, feature, listFeatures2 != null ? (Feature) onContentCardDismissed.MediaMetadataCompat((List) listFeatures2) : null);
    }
}
