package com.google.android.gms.internal.mlkit_vision_face;

import com.mapbox.api.directions.v5.models.MapboxShield;
import com.mapbox.navigation.base.road.model.Road;
import com.mapbox.navigation.base.road.model.RoadComponent;
import com.mapbox.navigator.NavigationStatus;
import com.mapbox.navigator.RoadName;
import com.mapbox.navigator.Shield;
import java.util.ArrayList;
import java.util.List;
import o.accessgetInstancedelegatecp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzmc {
    public static Road buildRoadObject(NavigationStatus navigationStatus) {
        List<RoadName> roads = navigationStatus.getRoads();
        roads.getClass();
        List<RoadName> list = roads;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (RoadName roadName : list) {
            String text = roadName.getText();
            Shield shield = roadName.getShield();
            MapboxShield mapboxShieldBuild = shield != null ? MapboxShield.builder().name(shield.getName()).baseUrl(shield.getBaseUrl()).textColor(shield.getTextColor()).displayRef(shield.getDisplayRef()).build() : null;
            String imageBaseUrl = roadName.getImageBaseUrl();
            String language = roadName.getLanguage();
            text.getClass();
            language.getClass();
            arrayList.add(new RoadComponent(text, language, mapboxShieldBuild, imageBaseUrl));
        }
        return new Road(arrayList);
    }
}
