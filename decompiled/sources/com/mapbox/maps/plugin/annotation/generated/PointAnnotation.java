package com.mapbox.maps.plugin.annotation.generated;

import android.graphics.Bitmap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
public final class PointAnnotation {
    public final PointAnnotationManager annotationManager;
    public final Point geometry;
    public Bitmap iconImageBitmap;
    public final String id;
    public boolean isSelected;
    public final JsonObject jsonObject;

    public PointAnnotation(String str, PointAnnotationManager pointAnnotationManager, JsonObject jsonObject, Point point) {
        this.id = str;
        this.jsonObject = jsonObject;
        this.geometry = point;
        this.annotationManager = pointAnnotationManager;
        jsonObject.addProperty("PointAnnotation", str);
    }

    public final String getIconImageInternal$plugin_annotation_release() {
        JsonElement jsonElement = this.jsonObject.get("icon-image");
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }
}
