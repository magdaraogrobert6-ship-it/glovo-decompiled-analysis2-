package com.mapbox.maps.extension.style.sources;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.CustomGeometrySourceOptions;
import com.mapbox.maps.CustomRasterSourceOptions;
import com.mapbox.maps.MapboxStyleManager;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomRasterSource extends Source {
    public final /* synthetic */ int $r8$classId = 1;
    public final Serializable options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRasterSource(String str, CustomGeometrySourceOptions customGeometrySourceOptions) {
        super(str);
        str.getClass();
        this.options = customGeometrySourceOptions;
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public final Expected addSource(MapboxStyleManager mapboxStyleManager) {
        int i = this.$r8$classId;
        Serializable serializable = this.options;
        String str = this.sourceId;
        mapboxStyleManager.getClass();
        return i != 0 ? mapboxStyleManager.addStyleCustomGeometrySource(str, (CustomGeometrySourceOptions) serializable) : mapboxStyleManager.addStyleCustomRasterSource(str, (CustomRasterSourceOptions) serializable);
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public final String getType$extension_style_release() {
        return this.$r8$classId != 0 ? "custom-geometry" : "custom-raster";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRasterSource(String str, CustomRasterSourceOptions customRasterSourceOptions) {
        super(str);
        str.getClass();
        this.options = customRasterSourceOptions;
    }
}
