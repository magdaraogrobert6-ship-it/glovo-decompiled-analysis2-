package com.mapbox.navigation.ui.maps.route;

import android.graphics.Color;
import androidx.sqlite.SQLite;
import com.logistics.rider.glovo.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RouteLayerConstants {
    public static final int ALTERNATE_RESTRICTED_ROAD_COLOR;
    public static final int ALTERNATE_ROUTE_CASING_COLOR;
    public static final int ALTERNATE_ROUTE_DEFAULT_COLOR;
    public static final int ALTERNATE_ROUTE_HEAVY_TRAFFIC_COLOR;
    public static final int ALTERNATE_ROUTE_LOW_TRAFFIC_COLOR;
    public static final int ALTERNATE_ROUTE_MODERATE_TRAFFIC_COLOR;
    public static final int ALTERNATE_ROUTE_SEVERE_TRAFFIC_COLOR;
    public static final int ALTERNATE_ROUTE_UNKNOWN_TRAFFIC_COLOR;
    public static final int ALTERNATIVE_ROUTE_CLOSURE_COLOR;
    public static final Double[] ARROW_HEAD_CASING_OFFSET;
    public static final Double[] ARROW_HEAD_OFFSET;
    public static final int DEFAULT_BLUR_COLOR;
    public static final int DESTINATION_WAYPOINT_ICON;
    public static final int MANEUVER_ARROWHEAD_ICON_CASING_DRAWABLE;
    public static final int MANEUVER_ARROWHEAD_ICON_DRAWABLE;
    public static final int MANEUVER_ARROW_CASING_COLOR;
    public static final int MANEUVER_ARROW_COLOR;
    public static final int ORIGIN_WAYPOINT_ICON;
    public static final int RESTRICTED_ROAD_COLOR;
    public static final List RESTRICTED_ROAD_DASH_ARRAY;
    public static final int ROUTE_CASING_COLOR;
    public static final int ROUTE_CLOSURE_COLOR;
    public static final int ROUTE_DEFAULT_COLOR;
    public static final int ROUTE_HEAVY_TRAFFIC_COLOR;
    public static final int ROUTE_LOW_TRAFFIC_COLOR;
    public static final int ROUTE_MODERATE_TRAFFIC_COLOR;
    public static final int ROUTE_SEVERE_TRAFFIC_COLOR;
    public static final int ROUTE_UNKNOWN_TRAFFIC_COLOR;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(-7.0d);
        ARROW_HEAD_CASING_OFFSET = new Double[]{dValueOf, dValueOf2};
        ARROW_HEAD_OFFSET = new Double[]{dValueOf, dValueOf2};
        RESTRICTED_ROAD_DASH_ARRAY = SQLite.read(Double.valueOf(0.5d), Double.valueOf(2.0d));
        ROUTE_DEFAULT_COLOR = Color.parseColor("#56A8FB");
        ROUTE_UNKNOWN_TRAFFIC_COLOR = Color.parseColor("#56A8FB");
        ROUTE_LOW_TRAFFIC_COLOR = Color.parseColor("#56A8FB");
        ROUTE_MODERATE_TRAFFIC_COLOR = Color.parseColor("#F5C32E");
        ROUTE_HEAVY_TRAFFIC_COLOR = Color.parseColor("#F54724");
        ROUTE_SEVERE_TRAFFIC_COLOR = Color.parseColor("#C32828");
        ROUTE_CASING_COLOR = Color.parseColor("#2F7AC6");
        ALTERNATE_ROUTE_DEFAULT_COLOR = Color.parseColor("#8694A5");
        ALTERNATE_ROUTE_CASING_COLOR = Color.parseColor("#727E8D");
        ALTERNATE_ROUTE_UNKNOWN_TRAFFIC_COLOR = Color.parseColor("#8694A5");
        ALTERNATE_ROUTE_LOW_TRAFFIC_COLOR = Color.parseColor("#8694A5");
        ALTERNATE_ROUTE_MODERATE_TRAFFIC_COLOR = Color.parseColor("#BEA087");
        ALTERNATE_ROUTE_HEAVY_TRAFFIC_COLOR = Color.parseColor("#B58281");
        ALTERNATE_ROUTE_SEVERE_TRAFFIC_COLOR = Color.parseColor("#B58281");
        RESTRICTED_ROAD_COLOR = Color.parseColor("#000000");
        ALTERNATE_RESTRICTED_ROAD_COLOR = Color.parseColor("#333333");
        ORIGIN_WAYPOINT_ICON = 2131232244;
        DESTINATION_WAYPOINT_ICON = 2131232243;
        MANEUVER_ARROW_COLOR = Color.parseColor("#FFFFFF");
        MANEUVER_ARROW_CASING_COLOR = Color.parseColor("#054AAD");
        ROUTE_CLOSURE_COLOR = Color.parseColor("#000000");
        ALTERNATIVE_ROUTE_CLOSURE_COLOR = Color.parseColor("#333333");
        DEFAULT_BLUR_COLOR = Color.parseColor("#ffffff");
        MANEUVER_ARROWHEAD_ICON_DRAWABLE = 2131232128;
        MANEUVER_ARROWHEAD_ICON_CASING_DRAWABLE = R.drawable.mapbox_ic_arrow_head_casing;
    }
}
