package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.PointAsCoordinatesTypeAdapter;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import o.SemanticsConfiguration;
import o.ensureSubscribedToInAppMessageEventslambda7;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class RouteLineEvent {
    public static final SemanticsConfiguration Companion = new SemanticsConfiguration();
    private final String instanceId;

    @SerializedName("subtype")
    private final String subtype;

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Companion.getClass();
        gsonBuilder.registerTypeAdapter(ensureSubscribedToInAppMessageEventslambda7.class, new IntRangeTypeAdapter());
        gsonBuilder.registerTypeAdapter(Point.class, new PointAsCoordinatesTypeAdapter());
        gsonBuilder.registerTypeAdapter(Expression.class, new ExpressionTypeAdapter());
        gsonBuilder.registerTypeAdapter(FeatureCollection.class, new FeatureCollectionAdapter());
        String json = gsonBuilder.create().toJson(this);
        json.getClass();
        return json;
    }

    public RouteLineEvent(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.subtype = str;
        this.instanceId = str2;
    }
}
