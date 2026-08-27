package com.mapbox.maps;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.maps.plugin.Plugin;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SemanticsActions;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapInitOptions {
    public static final Companion Companion = new Companion(null);
    private static final List<Plugin> defaultPluginList = SQLite.read(new SemanticsActions("MAPBOX_CAMERA_PLUGIN_ID", null), new SemanticsActions("MAPBOX_GESTURES_PLUGIN_ID", null), new SemanticsActions("MAPBOX_COMPASS_PLUGIN_ID", null), new SemanticsActions("MAPBOX_LOGO_PLUGIN_ID", null), new SemanticsActions("MAPBOX_ATTRIBUTION_PLUGIN_ID", null), new SemanticsActions("MAPBOX_LOCATION_COMPONENT_PLUGIN_ID", null), new SemanticsActions("MAPBOX_SCALEBAR_PLUGIN_ID", null), new SemanticsActions("MAPBOX_ANNOTATION_PLUGIN_ID", null), new SemanticsActions("MAPBOX_LIFECYCLE_PLUGIN_ID", null), new SemanticsActions("MAPBOX_MAP_OVERLAY_PLUGIN_ID", null), new SemanticsActions("MAPBOX_VIEWPORT_PLUGIN_ID", null));
    private int antialiasingSampleCount;
    private AttributeSet attrs;
    private CameraOptions cameraOptions;
    private final Context context;
    private String mapName;
    private MapOptions mapOptions;
    private List<? extends Plugin> plugins;
    private final String styleUri;
    private boolean textureView;

    public final Context component1() {
        return this.context;
    }

    public final MapOptions component2() {
        return this.mapOptions;
    }

    public final List<Plugin> component3() {
        return this.plugins;
    }

    public final CameraOptions component4() {
        return this.cameraOptions;
    }

    public final boolean component5() {
        return this.textureView;
    }

    public final String component6() {
        return this.styleUri;
    }

    public final AttributeSet component7() {
        return this.attrs;
    }

    public final int component8() {
        return this.antialiasingSampleCount;
    }

    public final String component9() {
        return this.mapName;
    }

    public final int getAntialiasingSampleCount() {
        return this.antialiasingSampleCount;
    }

    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final CameraOptions getCameraOptions() {
        return this.cameraOptions;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getMapName() {
        return this.mapName;
    }

    public final MapOptions getMapOptions() {
        return this.mapOptions;
    }

    public final List<Plugin> getPlugins() {
        return this.plugins;
    }

    public final String getStyleUri() {
        return this.styleUri;
    }

    public final boolean getTextureView() {
        return this.textureView;
    }

    public final void setAntialiasingSampleCount(int i) {
        this.antialiasingSampleCount = i;
    }

    public final void setAttrs(AttributeSet attributeSet) {
        this.attrs = attributeSet;
    }

    public final void setCameraOptions(CameraOptions cameraOptions) {
        this.cameraOptions = cameraOptions;
    }

    public final void setTextureView(boolean z) {
        this.textureView = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.plugins, (this.mapOptions.hashCode() + (this.context.hashCode() * 31)) * 31, 31);
        CameraOptions cameraOptions = this.cameraOptions;
        int iHashCode = cameraOptions == null ? 0 : cameraOptions.hashCode();
        boolean z = this.textureView;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        String str = this.styleUri;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        AttributeSet attributeSet = this.attrs;
        return this.mapName.hashCode() + af$$ExternalSyntheticOutline0.m(this.antialiasingSampleCount, (((((((iM + iHashCode) * 31) + r4) * 31) + iHashCode2) * 31) + (attributeSet != null ? attributeSet.hashCode() : 0)) * 31, 31);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Plugin> getDefaultPluginList() {
            return MapInitOptions.defaultPluginList;
        }

        private Companion() {
        }

        public final MapOptions getDefaultMapOptions(Context context) {
            context.getClass();
            MapOptions mapOptionsBuild = MapInitOptionsKt.applyDefaultParams(new MapOptions.Builder(), context).build();
            mapOptionsBuild.getClass();
            return mapOptionsBuild;
        }
    }

    public final MapInitOptions copy(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z, String str, AttributeSet attributeSet, int i, String str2) {
        context.getClass();
        mapOptions.getClass();
        list.getClass();
        str2.getClass();
        return new MapInitOptions(context, mapOptions, list, cameraOptions, z, str, attributeSet, i, str2);
    }

    public final void setMapName(String str) {
        str.getClass();
        this.mapName = str;
    }

    public final void setMapOptions(MapOptions mapOptions) {
        mapOptions.getClass();
        this.mapOptions = mapOptions;
    }

    public final void setPlugins(List<? extends Plugin> list) {
        list.getClass();
        this.plugins = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapInitOptions)) {
            return false;
        }
        MapInitOptions mapInitOptions = (MapInitOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.context, mapInitOptions.context}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mapOptions, mapInitOptions.mapOptions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.plugins, mapInitOptions.plugins}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cameraOptions, mapInitOptions.cameraOptions}, getCieXyz.write())).booleanValue() || this.textureView != mapInitOptions.textureView) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.styleUri, mapInitOptions.styleUri}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.attrs, mapInitOptions.attrs}, getCieXyz.write())).booleanValue() || this.antialiasingSampleCount != mapInitOptions.antialiasingSampleCount) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mapName, mapInitOptions.mapName}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MapInitOptions(context=");
        sb.append(this.context);
        sb.append(", mapOptions=");
        sb.append(this.mapOptions);
        sb.append(", plugins=");
        sb.append(this.plugins);
        sb.append(", cameraOptions=");
        sb.append(this.cameraOptions);
        sb.append(", textureView=");
        sb.append(this.textureView);
        sb.append(", styleUri=");
        sb.append(this.styleUri);
        sb.append(", attrs=");
        sb.append(this.attrs);
        sb.append(", antialiasingSampleCount=");
        sb.append(this.antialiasingSampleCount);
        sb.append(", mapName=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.mapName, ')');
    }

    public /* synthetic */ MapInitOptions(Context context, MapOptions mapOptions, List list, CameraOptions cameraOptions, boolean z, String str, AttributeSet attributeSet, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? Companion.getDefaultMapOptions(context) : mapOptions, (i2 & 4) != 0 ? defaultPluginList : list, (i2 & 8) != 0 ? null : cameraOptions, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? Style.STANDARD : str, (i2 & 64) == 0 ? attributeSet : null, (i2 & Fields.SpotShadowColor) != 0 ? 1 : i, (i2 & Fields.RotationX) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions) {
        this(context, mapOptions, null, null, false, null, null, 0, null, 508, null);
        context.getClass();
        mapOptions.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list) {
        this(context, mapOptions, list, null, false, null, null, 0, null, 504, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions) {
        this(context, mapOptions, list, cameraOptions, false, null, null, 0, null, 496, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z) {
        this(context, mapOptions, list, cameraOptions, z, null, null, 0, null, 480, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z, String str) {
        this(context, mapOptions, list, cameraOptions, z, str, null, 0, null, 448, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z, String str, AttributeSet attributeSet) {
        this(context, mapOptions, list, cameraOptions, z, str, attributeSet, 0, null, 384, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z, String str, AttributeSet attributeSet, int i) {
        this(context, mapOptions, list, cameraOptions, z, str, attributeSet, i, null, Fields.RotationX, null);
        context.getClass();
        mapOptions.getClass();
        list.getClass();
    }

    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends Plugin> list, CameraOptions cameraOptions, boolean z, String str, AttributeSet attributeSet, int i, String str2) {
        context.getClass();
        mapOptions.getClass();
        list.getClass();
        str2.getClass();
        this.context = context;
        this.mapOptions = mapOptions;
        this.plugins = list;
        this.cameraOptions = cameraOptions;
        this.textureView = z;
        this.styleUri = str;
        this.attrs = attributeSet;
        this.antialiasingSampleCount = i;
        this.mapName = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context) {
        this(context, null, null, null, false, null, null, 0, null, 510, null);
        context.getClass();
    }
}
