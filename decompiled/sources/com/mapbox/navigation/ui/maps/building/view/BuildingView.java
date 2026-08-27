package com.mapbox.navigation.ui.maps.building.view;

import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.building.model.MapboxBuildingHighlightOptions;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface BuildingView {
    void highlightBuilding(Style style, List list, MapboxBuildingHighlightOptions mapboxBuildingHighlightOptions);

    void removeBuildingHighlight(Style style, MapboxBuildingHighlightOptions mapboxBuildingHighlightOptions);
}
