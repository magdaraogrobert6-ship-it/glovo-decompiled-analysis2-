package com.mapbox.maps.extension.style.sources.generated;

import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.sources.Source;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageSource extends Source {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageSource(String str, int i) {
        super(str);
        this.$r8$classId = i;
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public void bindTo(MapboxStyleManager mapboxStyleManager) {
        if (this.$r8$classId != 1) {
            super.bindTo(mapboxStyleManager);
        } else {
            mapboxStyleManager.getClass();
            super.bindTo(mapboxStyleManager);
        }
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public final String getType$extension_style_release() {
        int i = this.$r8$classId;
        if (i == 0) {
            return "image";
        }
        if (i == 1) {
            return "model";
        }
        if (i == 2) {
            return "raster-array";
        }
        if (i != 3) {
            return i != 4 ? "vector" : "raster";
        }
        return "raster-dem";
    }
}
