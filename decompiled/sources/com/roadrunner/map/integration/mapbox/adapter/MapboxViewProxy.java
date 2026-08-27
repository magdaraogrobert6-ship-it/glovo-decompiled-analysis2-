package com.roadrunner.map.integration.mapbox.adapter;

import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.ObjectList$toString$1;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.logistics.rider.glovo.R;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.maps.viewannotation.ViewAnnotationOptionsKtxKt;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.TuplesKt;
import kotlinx.coroutines.DelayKt;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.BrazeCompanionExternalSyntheticLambda21;
import o.accessgetReuseDeactivationViaHostcp;
import o.accesssetDependencyp;
import o.f5;
import o.f6;
import o.f7;
import o.f8;
import o.fc;
import o.ffExternalSyntheticLambda2;
import o.fromColorLong;
import o.g0;
import o.g0ExternalSyntheticLambda11;
import o.g0ExternalSyntheticLambda28;
import o.g0ExternalSyntheticLambda8;
import o.g1;
import o.g2;
import o.g3;
import o.gExternalSyntheticLambda0;
import o.getCieXyz;
import o.getDefaultCapKaPHkGw;
import o.getDefaultJoinLxFBmk8;
import o.getDownimpl;
import o.getOnLoggedCallback;
import o.getPresentationContext;
import o.gh;
import o.h2ExternalSyntheticLambda1;
import o.h7;
import o.h9;
import o.hExternalSyntheticLambda0;
import o.hf;
import o.hgExternalSyntheticLambda1;
import o.hgExternalSyntheticLambda9;
import o.hh;
import o.ihExternalSyntheticLambda2;
import o.ihExternalSyntheticLambda9;
import o.isAdapterPositionOnScreen;
import o.isMainThread;
import o.j5;
import o.ja;
import o.jd;
import o.je;
import o.jeExternalSyntheticLambda0;
import o.jf;
import o.jh;
import o.k1;
import o.k2;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.removeNodeAtDepth;
import o.roleFakeNodeId;
import o.setCarryoverInAppMessage;
import o.setReferencedIds;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class MapboxViewProxy implements g3 {
    private static int ComponentActivity = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final ihExternalSyntheticLambda9 IconCompatParcelizer;
    public final ja MediaBrowserCompatMediaItem;
    public final jf MediaDescriptionCompat;
    public MapView MediaMetadataCompat;
    public final SharedResourcePool MediaSessionCompatQueueItem;
    public final roleFakeNodeId MediaSessionCompatToken;
    public final jd PlaybackStateCompat;
    public final hf PlaybackStateCompatCustomAction;
    public final getPresentationContext RatingCompat;
    public final Application RemoteActionCompatParcelizer;
    public je ResultReceiver;
    public final k1 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final fromColorLong read;
    public CallTracer serializer;
    public final ihExternalSyntheticLambda2 write;
    public final MapboxViewProxy$$ExternalSyntheticLambda0 MediaSessionCompatResultReceiverWrapper = new MapboxViewProxy$$ExternalSyntheticLambda0(this, 0);
    public final MapboxViewProxy$$ExternalSyntheticLambda0 ParcelableVolumeInfo = new MapboxViewProxy$$ExternalSyntheticLambda0(this, 1);

    public MapboxViewProxy(Context context, SharedResourcePool sharedResourcePool, fromColorLong fromcolorlong, ja jaVar, jf jfVar, ihExternalSyntheticLambda9 ihexternalsyntheticlambda9, getPresentationContext getpresentationcontext, j5 j5Var, jd jdVar, hf hfVar, h9 h9Var, ihExternalSyntheticLambda2 ihexternalsyntheticlambda2, isMainThread ismainthread, h7 h7Var, k2 k2Var, Application application, k1 k1Var, roleFakeNodeId rolefakenodeid) {
        this.MediaSessionCompatQueueItem = sharedResourcePool;
        this.read = fromcolorlong;
        this.MediaBrowserCompatMediaItem = jaVar;
        this.MediaDescriptionCompat = jfVar;
        this.IconCompatParcelizer = ihexternalsyntheticlambda9;
        this.RatingCompat = getpresentationcontext;
        this.PlaybackStateCompat = jdVar;
        this.PlaybackStateCompatCustomAction = hfVar;
        this.write = ihexternalsyntheticlambda2;
        this.RemoteActionCompatParcelizer = application;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = k1Var;
        this.MediaSessionCompatToken = rolefakenodeid;
    }

    @Override // o.g3
    public final View IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ComponentActivity + 95;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3;
        int i4 = i2 % 2;
        MapView mapView = this.MediaMetadataCompat;
        if (mapView == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        int i5 = i3 + 25;
        ComponentActivity = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i3 + 15;
        ComponentActivity = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return mapView;
    }

    @Override // o.g3
    public final void write() {
        int i = 2 % 2;
        MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1 = new MapApiError$$ExternalSyntheticLambda1(19);
        MapView mapView = this.MediaMetadataCompat;
        if (mapView != null) {
            MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
            mapboxMapDeprecated.getClass();
            mapboxMapDeprecated.getStyle(new hh(mapApiError$$ExternalSyntheticLambda1));
            int i2 = ComponentActivity + 107;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        removeNodeAtDepth.serializer("mapView");
        throw null;
    }

    @Override // o.g3
    public final void serializer(List list) {
        int i = 2 % 2;
        list.getClass();
        MapboxViewProxy$$ExternalSyntheticLambda4 mapboxViewProxy$$ExternalSyntheticLambda4 = new MapboxViewProxy$$ExternalSyntheticLambda4(0, this, list);
        MapView mapView = this.MediaMetadataCompat;
        if (mapView == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
        mapboxMapDeprecated.getClass();
        mapboxMapDeprecated.getStyle(new hh(mapboxViewProxy$$ExternalSyntheticLambda4));
        int i2 = ComponentActivity + 83;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.g3
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        this.MediaDescriptionCompat.read.serializer.clear();
        CallTracer callTracer = this.serializer;
        if (callTracer == null) {
            removeNodeAtDepth.serializer("annotationManagers");
            throw null;
        }
        int i2 = ComponentActivity + 7;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((PointAnnotationManager) callTracer.serializer).deleteAll();
        Iterator it = ((LinkedHashMap) callTracer.IconCompatParcelizer).entrySet().iterator();
        while (it.hasNext()) {
            ((PointAnnotationManager) ((Map.Entry) it.next()).getValue()).deleteAll();
        }
        int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 87;
        ComponentActivity = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r1.getInternalSettings().enabled == r3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r4 = com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 119;
        com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.ComponentActivity = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
        r0 = r1.getInternalSettings().toBuilder();
        r0.enabled = r3;
        r1.internalSettings = r0.build();
        r1.applySettings();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        r1.internalSettings = r2;
        r1.applySettings();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        o.removeNodeAtDepth.serializer("mapView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = kotlinx.coroutines.DelayKt.getLocationComponent(r1);
        r3 = r1.getInternalSettings().toBuilder();
        r3.enabled = false;
        r3.pulsingEnabled = false;
        r3.puckBearingEnabled = false;
        r2 = r3.build();
        r3 = r2.enabled;
     */
    @Override // o.g3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void disableLiveLocation() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.ComponentActivity
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            com.mapbox.maps.MapView r1 = r6.MediaMetadataCompat
            r3 = 9
            int r3 = r3 / r2
            if (r1 == 0) goto L5d
            goto L1b
        L17:
            com.mapbox.maps.MapView r1 = r6.MediaMetadataCompat
            if (r1 == 0) goto L5d
        L1b:
            com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl r1 = kotlinx.coroutines.DelayKt.getLocationComponent(r1)
            com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings r3 = r1.getInternalSettings()
            com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings$Builder r3 = r3.toBuilder()
            r3.enabled = r2
            r3.pulsingEnabled = r2
            r3.puckBearingEnabled = r2
            com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings r2 = r3.build()
            boolean r3 = r2.enabled
            com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings r4 = r1.getInternalSettings()
            boolean r4 = r4.enabled
            if (r4 == r3) goto L57
            int r4 = com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys
            int r4 = r4 + 119
            int r5 = r4 % 128
            com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.ComponentActivity = r5
            int r4 = r4 % r0
            com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings r0 = r1.getInternalSettings()
            com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings$Builder r0 = r0.toBuilder()
            r0.enabled = r3
            com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings r0 = r0.build()
            r1.internalSettings = r0
            r1.applySettings()
        L57:
            r1.internalSettings = r2
            r1.applySettings()
            return
        L5d:
            java.lang.String r0 = "mapView"
            o.removeNodeAtDepth.serializer(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.disableLiveLocation():void");
    }

    @Override // o.g3
    public final void read() {
        int i = 2 % 2;
        je jeVar = this.ResultReceiver;
        if (jeVar == null) {
            removeNodeAtDepth.serializer("viewAnnotationManager");
            throw null;
        }
        LinkedHashMap linkedHashMap = jeVar.read;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            int i2 = ComponentActivity + 25;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            jeExternalSyntheticLambda0 jeexternalsyntheticlambda0 = (jeExternalSyntheticLambda0) ((Map.Entry) it.next()).getValue();
            jeexternalsyntheticlambda0.serializer().IconCompatParcelizer();
            try {
                jeVar.serializer.getViewAnnotationManager().removeViewAnnotation(jeexternalsyntheticlambda0.serializer().write());
            } catch (Exception unused) {
            }
        }
        linkedHashMap.clear();
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = jeVar.write;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        jeVar.RemoteActionCompatParcelizer = false;
        jeVar.MediaBrowserCompatMediaItem = false;
        int i4 = ComponentActivity + 73;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.g3
    public final void enableLiveLocation() {
        int i = 2 % 2;
        MapView mapView = this.MediaMetadataCompat;
        if (mapView == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        int i2 = ComponentActivity + 113;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                boolean z = DelayKt.getLocationComponent(mapView).getInternalSettings().enabled;
                throw null;
            }
            LocationComponentPluginImpl locationComponent = DelayKt.getLocationComponent(mapView);
            boolean z2 = locationComponent.getInternalSettings().enabled;
            ihExternalSyntheticLambda9 ihexternalsyntheticlambda9 = this.IconCompatParcelizer;
            if (z2 && !locationComponent.getInternalSettings().pulsingEnabled && !(!locationComponent.getInternalSettings().puckBearingEnabled)) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{locationComponent.getInternalSettings().locationPuck, ihexternalsyntheticlambda9.serializer.RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                    return;
                }
            }
            locationComponent.updateSettings(new RoomDatabase$$ExternalSyntheticLambda2(27, ihexternalsyntheticlambda9));
            int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 113;
            ComponentActivity = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to enable live location", new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        disableLiveLocation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        disableLiveLocation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r7 = r6.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r7 = r7.getContext().getApplicationContext();
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (o.FocusListener.write(r7, "android.permission.ACCESS_COARSE_LOCATION") == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (o.FocusListener.write(r7, "android.permission.ACCESS_FINE_LOCATION") != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        r7 = r6.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r7 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (kotlinx.coroutines.DelayKt.getLocationComponent(r7).getInternalSettings().enabled != r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r7 = r6.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r7 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r2 = com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 109;
        com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.ComponentActivity = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if ((r2 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (kotlinx.coroutines.DelayKt.getLocationComponent(r7).getInternalSettings().pulsingEnabled != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        r7 = com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.ComponentActivity + 35;
        com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r7 = kotlinx.coroutines.DelayKt.getLocationComponent(r7).getInternalSettings().pulsingEnabled;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        o.removeNodeAtDepth.serializer("mapView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        r7 = new androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda1(r6, r3, r0);
        r0 = r6.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        r0 = r0.getMapboxMapDeprecated();
        r0.getClass();
        r0.getStyle(new o.hh(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        o.removeNodeAtDepth.serializer("mapView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        o.removeNodeAtDepth.serializer("mapView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
    
        o.removeNodeAtDepth.serializer("mapView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 93;
        com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    @Override // o.g3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updatePermissionSettings(boolean r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.ComponentActivity = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 48
            int r1 = r1 / r3
            if (r7 != 0) goto L29
            goto L18
        L16:
            if (r7 != 0) goto L29
        L18:
            int r2 = r2 + 93
            int r7 = r2 % 128
            com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r7
            int r2 = r2 % r0
            if (r2 == 0) goto L25
            r6.disableLiveLocation()
            return
        L25:
            r6.disableLiveLocation()
            throw r4
        L29:
            com.mapbox.maps.MapView r7 = r6.MediaMetadataCompat
            java.lang.String r1 = "mapView"
            if (r7 == 0) goto Lb3
            android.content.Context r7 = r7.getContext()
            android.content.Context r7 = r7.getApplicationContext()
            r7.getClass()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = o.FocusListener.write(r7, r2)
            if (r2 == 0) goto L4a
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            int r7 = o.FocusListener.write(r7, r2)
            if (r7 != 0) goto L4b
        L4a:
            r3 = 1
        L4b:
            com.mapbox.maps.MapView r7 = r6.MediaMetadataCompat
            if (r7 == 0) goto Laf
            com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl r7 = kotlinx.coroutines.DelayKt.getLocationComponent(r7)
            com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings r7 = r7.getInternalSettings()
            boolean r7 = r7.enabled
            if (r7 != r3) goto L92
            com.mapbox.maps.MapView r7 = r6.MediaMetadataCompat
            if (r7 == 0) goto L8e
            int r2 = com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys
            int r2 = r2 + 109
            int r5 = r2 % 128
            com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.ComponentActivity = r5
            int r2 = r2 % r0
            if (r2 != 0) goto L80
            com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl r7 = kotlinx.coroutines.DelayKt.getLocationComponent(r7)
            com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings r7 = r7.getInternalSettings()
            boolean r7 = r7.pulsingEnabled
            if (r7 != 0) goto L92
            int r7 = com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.ComponentActivity
            int r7 = r7 + 35
            int r1 = r7 % 128
            com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r1
            int r7 = r7 % r0
            return
        L80:
            com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl r7 = kotlinx.coroutines.DelayKt.getLocationComponent(r7)
            com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings r7 = r7.getInternalSettings()
            boolean r7 = r7.pulsingEnabled
            r4.hashCode()
            throw r4
        L8e:
            o.removeNodeAtDepth.serializer(r1)
            throw r4
        L92:
            androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda1 r7 = new androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda1
            r7.<init>(r6, r3, r0)
            com.mapbox.maps.MapView r0 = r6.MediaMetadataCompat
            if (r0 == 0) goto Lab
            com.mapbox.maps.MapboxMap r0 = r0.getMapboxMapDeprecated()
            r0.getClass()
            o.hh r1 = new o.hh
            r1.<init>(r7)
            r0.getStyle(r1)
            return
        Lab:
            o.removeNodeAtDepth.serializer(r1)
            throw r4
        Laf:
            o.removeNodeAtDepth.serializer(r1)
            throw r4
        Lb3:
            o.removeNodeAtDepth.serializer(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.updatePermissionSettings(boolean):void");
    }

    @Override // o.g3
    public final void destroy() {
        MapboxMap mapboxMapDeprecated;
        int i = 2 % 2;
        je jeVar = this.ResultReceiver;
        if (jeVar == null) {
            removeNodeAtDepth.serializer("viewAnnotationManager");
            throw null;
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = jeVar.IconCompatParcelizer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 103;
            ComponentActivity = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = jeVar.write;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
        }
        jeVar.read.clear();
        jeVar.RemoteActionCompatParcelizer = false;
        jeVar.MediaBrowserCompatMediaItem = false;
        this.MediaDescriptionCompat.read.serializer.clear();
        hf hfVar = this.PlaybackStateCompatCustomAction;
        MapView mapView = hfVar.read;
        if (mapView != null && (mapboxMapDeprecated = mapView.getMapboxMapDeprecated()) != null) {
            hgExternalSyntheticLambda9 hgexternalsyntheticlambda9 = (hgExternalSyntheticLambda9) hfVar.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
            hgexternalsyntheticlambda9.getClass();
            mapboxMapDeprecated.gesturesPlugin(new ObjectList$toString$1(13, hgexternalsyntheticlambda9));
        }
        MapView mapView2 = hfVar.read;
        if (mapView2 != null) {
            int i4 = ComponentActivity + 11;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            MapboxMap mapboxMapDeprecated2 = mapView2.getMapboxMapDeprecated();
            if (mapboxMapDeprecated2 != null) {
                hgExternalSyntheticLambda1 hgexternalsyntheticlambda1 = (hgExternalSyntheticLambda1) hfVar.RatingCompat.MediaSessionCompatResultReceiverWrapper();
                hgexternalsyntheticlambda1.getClass();
                mapboxMapDeprecated2.gesturesPlugin(new ObjectList$toString$1(14, hgexternalsyntheticlambda1));
            }
        }
        Cancelable cancelable = hfVar.write;
        if (cancelable != null) {
            cancelable.cancel();
            int i6 = ComponentActivity + 51;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        hfVar.read = null;
        MapView mapView3 = this.MediaMetadataCompat;
        if (mapView3 == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        DelayKt.getLocationComponent(mapView3).setLocationProvider(new BrazeCompanionExternalSyntheticLambda21(3));
        MapView mapView4 = this.MediaMetadataCompat;
        if (mapView4 == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        MapboxMap mapboxMapDeprecated3 = mapView4.getMapboxMapDeprecated();
        mapboxMapDeprecated3.getClass();
        mapboxMapDeprecated3.cameraAnimationsPlugin(new RetryWithDelay$$ExternalSyntheticLambda0(28, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0173, code lost:
    
        if (r2 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017a, code lost:
    
        if (r2 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017c, code lost:
    
        kotlin.TuplesKt.flyTo$default(com.mapbox.maps.plugin.animation.CameraAnimationsUtils.getCamera(r2), r1, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0184, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0185, code lost:
    
        o.removeNodeAtDepth.serializer("mapView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0188, code lost:
    
        throw null;
     */
    @Override // o.g3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RemoteActionCompatParcelizer(java.util.ArrayList r16, o.g6 r17, double r18, boolean r20) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy.RemoteActionCompatParcelizer(java.util.ArrayList, o.g6, double, boolean):void");
    }

    @Override // o.g3
    public final void write(ffExternalSyntheticLambda2 ffexternalsyntheticlambda2) {
        float dimension;
        int i = 2 % 2;
        je jeVar = this.ResultReceiver;
        if (jeVar == null) {
            removeNodeAtDepth.serializer("viewAnnotationManager");
            throw null;
        }
        f8 f8Var = ffexternalsyntheticlambda2.write;
        MapView mapView = jeVar.serializer;
        Context context = mapView.getContext();
        context.getClass();
        getDefaultCapKaPHkGw getdefaultcapkaphkgwIconCompatParcelizer = getDefaultCapKaPHkGw.IconCompatParcelizer(LayoutInflater.from(context));
        f5 f5Var = ffexternalsyntheticlambda2.IconCompatParcelizer;
        int iWrite = setReferencedIds.write();
        int iWrite2 = setReferencedIds.write();
        int i2 = hExternalSyntheticLambda0.RemoteActionCompatParcelizer[((g1) f5.write(setReferencedIds.write(), setReferencedIds.write(), -2129248991, iWrite2, iWrite, new Object[]{f5Var}, 2129248991)).ordinal()];
        if (i2 == 1) {
            dimension = 1.7014117E38f;
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            dimension = context.getResources().getDimension(R.dimen.corner_radius_02);
        }
        LinearLayout linearLayout = (LinearLayout) getdefaultcapkaphkgwIconCompatParcelizer.IconCompatParcelizer;
        AppCompatTextView appCompatTextView = (AppCompatTextView) getdefaultcapkaphkgwIconCompatParcelizer.MediaMetadataCompat;
        accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp = (accessgetReuseDeactivationViaHostcp) getdefaultcapkaphkgwIconCompatParcelizer.write;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) getdefaultcapkaphkgwIconCompatParcelizer.RemoteActionCompatParcelizer;
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) getdefaultcapkaphkgwIconCompatParcelizer.MediaDescriptionCompat;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(context.getColor(f5Var.RemoteActionCompatParcelizer()));
        gradientDrawable.setCornerRadius(dimension);
        linearLayout.setBackground(gradientDrawable);
        accessgetreusedeactivationviahostcp.setColorFilter(context.getColor(f5Var.write()));
        accessgetreusedeactivationviahostcp.setImageResource(f5Var.serializer());
        if (f5Var.read() > 0) {
            appCompatTextView2.setVisibility(0);
            appCompatTextView2.setText(String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(f5Var.read())}, 1)));
            appCompatTextView2.setTextColor(context.getColor(f5Var.write()));
        }
        appCompatTextView.setText(f5Var.MediaMetadataCompat());
        appCompatTextView.setTextColor(context.getColor(f5Var.MediaSessionCompatToken()));
        if (f5Var.MediaBrowserCompatMediaItem().length() > 0) {
            int i3 = ComponentActivity + 71;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                appCompatTextView3.setVisibility(0);
                appCompatTextView3.setText(f5Var.MediaBrowserCompatMediaItem());
                appCompatTextView3.setTextColor(context.getColor(f5Var.RatingCompat()));
            } else {
                appCompatTextView3.setVisibility(0);
                appCompatTextView3.setText(f5Var.MediaBrowserCompatMediaItem());
                appCompatTextView3.setTextColor(context.getColor(f5Var.RatingCompat()));
            }
        }
        int iWrite3 = setReferencedIds.write();
        int iWrite4 = setReferencedIds.write();
        if (((Integer) f5.write(setReferencedIds.write(), setReferencedIds.write(), -441067836, iWrite4, iWrite3, new Object[]{f5Var}, 441067837)).intValue() != 0) {
            int i4 = ComponentActivity + 107;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            AppCompatImageView appCompatImageView = (AppCompatImageView) getdefaultcapkaphkgwIconCompatParcelizer.read;
            int iWrite5 = setReferencedIds.write();
            int iWrite6 = setReferencedIds.write();
            appCompatImageView.setColorFilter(context.getColor(((Integer) f5.write(setReferencedIds.write(), setReferencedIds.write(), -441067836, iWrite6, iWrite5, new Object[]{f5Var}, 441067837)).intValue()), PorterDuff.Mode.ADD);
        }
        if (f5Var.IconCompatParcelizer() != 0) {
            int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 23;
            ComponentActivity = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                ((accessgetReuseDeactivationViaHostcp) getdefaultcapkaphkgwIconCompatParcelizer.MediaBrowserCompatMediaItem).setColorFilter(context.getColor(f5Var.IconCompatParcelizer()), PorterDuff.Mode.ADD);
                throw null;
            }
            ((accessgetReuseDeactivationViaHostcp) getdefaultcapkaphkgwIconCompatParcelizer.MediaBrowserCompatMediaItem).setColorFilter(context.getColor(f5Var.IconCompatParcelizer()), PorterDuff.Mode.ADD);
        }
        getdefaultcapkaphkgwIconCompatParcelizer.RemoteActionCompatParcelizer().setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ConstraintLayout constraintLayoutRemoteActionCompatParcelizer = getdefaultcapkaphkgwIconCompatParcelizer.RemoteActionCompatParcelizer();
        constraintLayoutRemoteActionCompatParcelizer.getClass();
        int iWrite7 = setReferencedIds.write();
        int iWrite8 = setReferencedIds.write();
        gh ghVar = new gh(constraintLayoutRemoteActionCompatParcelizer, (g1) f5.write(setReferencedIds.write(), setReferencedIds.write(), -2129248991, iWrite8, iWrite7, new Object[]{f5Var}, 2129248991));
        Point pointRemoteActionCompatParcelizer = AndroidUiDispatcherCompanioncurrentThread1.RemoteActionCompatParcelizer(f8Var);
        ViewAnnotationOptions.Builder builder = new ViewAnnotationOptions.Builder();
        ViewAnnotationOptionsKtxKt.geometry(builder, pointRemoteActionCompatParcelizer);
        Boolean bool = Boolean.TRUE;
        builder.allowOverlap(bool);
        builder.allowOverlapWithPuck(bool);
        builder.ignoreCameraPadding(bool);
        builder.visible(bool);
        ViewAnnotationOptionsKtxKt.annotationAnchors(builder, new NafathLogger$$ExternalSyntheticLambda0(3));
        ViewAnnotationOptions viewAnnotationOptionsBuild = builder.build();
        viewAnnotationOptionsBuild.getClass();
        int i7 = (int) (mapView.getContext().getResources().getDisplayMetrics().density * 100.0f);
        ghVar.write().setPadding(i7, 0, i7, 0);
        ghVar.write().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        mapView.getViewAnnotationManager().addViewAnnotation(ghVar.write(), viewAnnotationOptionsBuild);
        LinkedHashMap linkedHashMap = jeVar.read;
        String str = ffexternalsyntheticlambda2.read;
        linkedHashMap.put(str, new jeExternalSyntheticLambda0(str, ghVar, ffexternalsyntheticlambda2.RemoteActionCompatParcelizer, f8Var));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x030c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0323  */
    /* JADX WARN: Code duplicated, block: B:105:0x033f  */
    /* JADX WARN: Code duplicated, block: B:107:0x034b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0350  */
    /* JADX WARN: Code duplicated, block: B:110:0x0358  */
    /* JADX WARN: Code duplicated, block: B:113:0x035d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0369  */
    /* JADX WARN: Code duplicated, block: B:116:0x0370  */
    /* JADX WARN: Code duplicated, block: B:117:0x0373  */
    /* JADX WARN: Code duplicated, block: B:119:0x0376  */
    /* JADX WARN: Code duplicated, block: B:121:0x0394  */
    /* JADX WARN: Code duplicated, block: B:122:0x0398  */
    /* JADX WARN: Code duplicated, block: B:165:0x0548  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b6 A[PHI: r11
  0x02b6: PHI (r11v11 androidx.appcompat.widget.AppCompatImageView) = (r11v10 androidx.appcompat.widget.AppCompatImageView), (r11v15 androidx.appcompat.widget.AppCompatImageView) binds: [B:89:0x02b4, B:86:0x02ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:94:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f9  */
    @Override // o.g3
    public final void addMarker(gExternalSyntheticLambda0 gexternalsyntheticlambda0) {
        IconAnchor iconAnchor;
        CallTracer callTracer;
        Options.Companion companion;
        List list;
        IconAnchor iconAnchor2;
        LinkedHashMap linkedHashMap;
        Bitmap bitmapWrite;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        Drawable drawable;
        Drawable drawableMutate;
        GradientDrawable gradientDrawable;
        int i;
        int i2;
        int i3;
        LinkedHashMap linkedHashMap2;
        int i4;
        Bitmap bitmapRemoteActionCompatParcelizer;
        ConstraintLayout constraintLayoutRemoteActionCompatParcelizer;
        Double dValueOf;
        gExternalSyntheticLambda0 gexternalsyntheticlambda1 = gexternalsyntheticlambda0;
        int i5 = 2 % 2;
        CallTracer callTracer2 = this.serializer;
        if (callTracer2 != null) {
            MapView mapView = this.MediaMetadataCompat;
            if (mapView != null) {
                Context context = mapView.getContext();
                context.getClass();
                Options.Companion companion2 = gexternalsyntheticlambda1.IconCompatParcelizer;
                f6 f6VarL_ = companion2.L_();
                fc fcVar = f6VarL_.write;
                fcVar.getClass();
                switch (jh.IconCompatParcelizer[fcVar.ordinal()]) {
                    case 1:
                        iconAnchor = IconAnchor.CENTER;
                        break;
                    case 2:
                        iconAnchor = IconAnchor.LEFT;
                        break;
                    case 3:
                        iconAnchor = IconAnchor.RIGHT;
                        break;
                    case 4:
                        iconAnchor = IconAnchor.TOP;
                        break;
                    case 5:
                        iconAnchor = IconAnchor.BOTTOM;
                        break;
                    case 6:
                        iconAnchor = IconAnchor.TOP_LEFT;
                        break;
                    case 7:
                        iconAnchor = IconAnchor.TOP_RIGHT;
                        break;
                    case 8:
                        iconAnchor = IconAnchor.BOTTOM_LEFT;
                        break;
                    case 9:
                        iconAnchor = IconAnchor.BOTTOM_RIGHT;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                }
                List list2 = SQLite.read(Double.valueOf(f6VarL_.RemoteActionCompatParcelizer), Double.valueOf(f6VarL_.IconCompatParcelizer));
                LinkedHashMap linkedHashMap3 = this.MediaDescriptionCompat.read.serializer;
                Bitmap bitmap = (Bitmap) linkedHashMap3.get(companion2);
                if (bitmap != null) {
                    callTracer = callTracer2;
                    companion = companion2;
                    list = list2;
                    iconAnchor2 = iconAnchor;
                } else {
                    if (!(companion2 instanceof g0ExternalSyntheticLambda11)) {
                        if (companion2 instanceof g2) {
                            g2 g2Var = (g2) companion2;
                            isAdapterPositionOnScreen isadapterpositiononscreen = h2ExternalSyntheticLambda1.serializer;
                            int i6 = g2Var.MediaMetadataCompat;
                            int i7 = g2Var.write;
                            int i8 = g2Var.IconCompatParcelizer;
                            int i9 = g2Var.MediaDescriptionCompat;
                            int i10 = g2Var.MediaSessionCompatQueueItem;
                            int i11 = g2Var.serializer;
                            boolean z = g2Var.MediaBrowserCompatMediaItem == g1.CIRCLE;
                            boolean z2 = g2Var.RatingCompat;
                            accesssetDependencyp accesssetdependencyp = accesssetDependencyp.read(LayoutInflater.from(context));
                            list = list2;
                            accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp = (accessgetReuseDeactivationViaHostcp) accesssetdependencyp.write;
                            iconAnchor2 = iconAnchor;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) accesssetdependencyp.serializer;
                            callTracer = callTracer2;
                            accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp2 = (accessgetReuseDeactivationViaHostcp) accesssetdependencyp.IconCompatParcelizer;
                            LinearLayout linearLayout = (LinearLayout) accesssetdependencyp.read;
                            linkedHashMap = linkedHashMap3;
                            int i12 = z2 ? R.dimen.corner_radius_02 : R.dimen.corner_radius_03;
                            GradientDrawable gradientDrawable2 = new GradientDrawable();
                            if (z) {
                                gradientDrawable2.setShape(1);
                            } else {
                                gradientDrawable2.setShape(0);
                                gradientDrawable2.setCornerRadius(context.getResources().getDimension(i12));
                            }
                            gradientDrawable2.setColor(context.getColor(i7));
                            gradientDrawable2.setStroke(context.getResources().getDimensionPixelSize(R.dimen.border_02), context.getColor(R.color.neutral_00));
                            linearLayout.setBackground(gradientDrawable2);
                            accessgetreusedeactivationviahostcp2.setColorFilter(context.getColor(i8));
                            accessgetreusedeactivationviahostcp2.setImageResource(i6);
                            if (i11 > 0) {
                                appCompatTextView2.setVisibility(0);
                                appCompatTextView2.setText(String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1)));
                                appCompatTextView2.setTextColor(context.getColor(i8));
                            }
                            if (z2) {
                                int i13 = ComponentActivity + 29;
                                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i13 % Fields.SpotShadowColor;
                                if (i13 % 2 == 0) {
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                i4 = R.dimen.bubble_view_small_size;
                            } else {
                                i4 = R.dimen.bubble_view_normal_size;
                            }
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
                            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.width = i11 > 0 ? -2 : dimensionPixelSize;
                                layoutParams.height = dimensionPixelSize;
                            }
                            if (i11 > 0) {
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                linearLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                                int measuredWidth = linearLayout.getMeasuredWidth();
                                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                                if (layoutParams2 != null) {
                                    layoutParams2.width = measuredWidth;
                                    layoutParams2.height = measuredWidth;
                                }
                            }
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) accesssetdependencyp.MediaBrowserCompatMediaItem;
                            if (z2) {
                                appCompatImageView2.setVisibility(8);
                                accessgetreusedeactivationviahostcp.setVisibility(8);
                                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.icon_view_small_size);
                                ViewGroup.LayoutParams layoutParams3 = accessgetreusedeactivationviahostcp2.getLayoutParams();
                                if (layoutParams3 != null) {
                                    layoutParams3.width = dimensionPixelSize2;
                                    layoutParams3.height = dimensionPixelSize2;
                                }
                            } else {
                                int color = context.getColor(i10);
                                PorterDuff.Mode mode = PorterDuff.Mode.ADD;
                                appCompatImageView2.setColorFilter(color, mode);
                                accessgetreusedeactivationviahostcp.setColorFilter(context.getColor(i9), mode);
                            }
                            linearLayout.setGravity(17);
                            ConstraintLayout constraintLayout = accesssetdependencyp.read();
                            constraintLayout.getClass();
                            bitmapWrite = h2ExternalSyntheticLambda1.RemoteActionCompatParcelizer(constraintLayout);
                            companion = companion2;
                        } else {
                            callTracer = callTracer2;
                            companion = companion2;
                            list = list2;
                            iconAnchor2 = iconAnchor;
                            linkedHashMap = linkedHashMap3;
                            if (companion instanceof g0) {
                                g0 g0Var = (g0) companion;
                                isAdapterPositionOnScreen isadapterpositiononscreen2 = h2ExternalSyntheticLambda1.serializer;
                                String str = g0Var.RatingCompat;
                                int i14 = g0Var.MediaMetadataCompat;
                                int i15 = g0Var.IconCompatParcelizer;
                                int i16 = g0Var.serializer;
                                Integer num = g0Var.read;
                                int i17 = g0Var.MediaDescriptionCompat;
                                int i18 = g0Var.MediaBrowserCompatMediaItem;
                                int i19 = g0Var.RemoteActionCompatParcelizer;
                                View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_map_pill_pin, (ViewGroup) null, false);
                                int i20 = R.id.imageViewBadgeIcon;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.imageViewBadgeIcon, viewInflate);
                                if (appCompatImageView3 != null) {
                                    i20 = R.id.imageViewIcon;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.imageViewIcon, viewInflate);
                                    if (appCompatImageView4 != null) {
                                        i20 = R.id.imageViewIconBackground;
                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.imageViewIconBackground, viewInflate);
                                        if (appCompatImageView5 != null) {
                                            int i21 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 87;
                                            ComponentActivity = i21 % Fields.SpotShadowColor;
                                            if (i21 % 2 != 0) {
                                                appCompatImageView = (AppCompatImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.imageViewIconBackgroundBorder, viewInflate);
                                                int i22 = 79 / 0;
                                                if (appCompatImageView != null) {
                                                    appCompatTextView = (AppCompatTextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.textView, viewInflate);
                                                    if (appCompatTextView != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                        if (str.length() == 0) {
                                                            appCompatTextView.setVisibility(8);
                                                            appCompatImageView5.setImageResource(R.drawable.solid_circle);
                                                        } else {
                                                            appCompatTextView.setText(str);
                                                            appCompatTextView.setTextColor(context.getColor(i18));
                                                            appCompatImageView5.setImageResource(R.drawable.rounded_corner_rectangle);
                                                        }
                                                        if (num != null) {
                                                            appCompatImageView3.setVisibility(8);
                                                        } else {
                                                            i3 = ComponentActivity + 115;
                                                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
                                                            if (i3 % 2 != 0) {
                                                                appCompatImageView3.setImageResource(num.intValue());
                                                                appCompatImageView3.setBackgroundTintList(ColorStateList.valueOf(context.getColor(i19)));
                                                            } else {
                                                                appCompatImageView3.setImageResource(num.intValue());
                                                                appCompatImageView3.setBackgroundTintList(ColorStateList.valueOf(context.getColor(i19)));
                                                                Object obj2 = null;
                                                                obj2.hashCode();
                                                                throw null;
                                                            }
                                                        }
                                                        appCompatImageView5.setColorFilter(context.getColor(i16));
                                                        appCompatImageView4.setColorFilter(context.getColor(i17));
                                                        appCompatImageView4.setImageResource(i14);
                                                        drawable = appCompatImageView.getDrawable();
                                                        if (drawable != null) {
                                                            i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 51;
                                                            ComponentActivity = i2 % Fields.SpotShadowColor;
                                                            if (i2 % 2 == 0) {
                                                                drawableMutate = drawable.mutate();
                                                            } else {
                                                                drawable.mutate();
                                                                Object obj3 = null;
                                                                obj3.hashCode();
                                                                throw null;
                                                            }
                                                        } else {
                                                            drawableMutate = null;
                                                        }
                                                        if (drawableMutate instanceof GradientDrawable) {
                                                            i = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 7;
                                                            ComponentActivity = i % Fields.SpotShadowColor;
                                                            if (i % 2 != 0) {
                                                                gradientDrawable = (GradientDrawable) drawableMutate;
                                                                int i23 = 79 / 0;
                                                            } else {
                                                                gradientDrawable = (GradientDrawable) drawableMutate;
                                                            }
                                                        } else {
                                                            gradientDrawable = null;
                                                        }
                                                        if (gradientDrawable != null) {
                                                            gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(R.dimen.border_02), context.getColor(i15));
                                                        }
                                                        constraintLayout2.getClass();
                                                        bitmapWrite = h2ExternalSyntheticLambda1.write(constraintLayout2);
                                                        companion = companion;
                                                    } else {
                                                        i20 = R.id.textView;
                                                    }
                                                } else {
                                                    i20 = R.id.imageViewIconBackgroundBorder;
                                                }
                                            } else {
                                                appCompatImageView = (AppCompatImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.imageViewIconBackgroundBorder, viewInflate);
                                                if (appCompatImageView != null) {
                                                    appCompatTextView = (AppCompatTextView) ExtrasKt.RemoteActionCompatParcelizer(R.id.textView, viewInflate);
                                                    if (appCompatTextView != null) {
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                                        if (str.length() == 0) {
                                                            appCompatTextView.setVisibility(8);
                                                            appCompatImageView5.setImageResource(R.drawable.solid_circle);
                                                        } else {
                                                            appCompatTextView.setText(str);
                                                            appCompatTextView.setTextColor(context.getColor(i18));
                                                            appCompatImageView5.setImageResource(R.drawable.rounded_corner_rectangle);
                                                        }
                                                        if (num != null) {
                                                            appCompatImageView3.setVisibility(8);
                                                        } else {
                                                            i3 = ComponentActivity + 115;
                                                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
                                                            if (i3 % 2 != 0) {
                                                                appCompatImageView3.setImageResource(num.intValue());
                                                                appCompatImageView3.setBackgroundTintList(ColorStateList.valueOf(context.getColor(i19)));
                                                            } else {
                                                                appCompatImageView3.setImageResource(num.intValue());
                                                                appCompatImageView3.setBackgroundTintList(ColorStateList.valueOf(context.getColor(i19)));
                                                                Object obj4 = null;
                                                                obj4.hashCode();
                                                                throw null;
                                                            }
                                                        }
                                                        appCompatImageView5.setColorFilter(context.getColor(i16));
                                                        appCompatImageView4.setColorFilter(context.getColor(i17));
                                                        appCompatImageView4.setImageResource(i14);
                                                        drawable = appCompatImageView.getDrawable();
                                                        if (drawable != null) {
                                                            i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 51;
                                                            ComponentActivity = i2 % Fields.SpotShadowColor;
                                                            if (i2 % 2 == 0) {
                                                                drawableMutate = drawable.mutate();
                                                            } else {
                                                                drawable.mutate();
                                                                Object obj5 = null;
                                                                obj5.hashCode();
                                                                throw null;
                                                            }
                                                        } else {
                                                            drawableMutate = null;
                                                        }
                                                        if (drawableMutate instanceof GradientDrawable) {
                                                            i = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 7;
                                                            ComponentActivity = i % Fields.SpotShadowColor;
                                                            if (i % 2 != 0) {
                                                                gradientDrawable = (GradientDrawable) drawableMutate;
                                                                int i24 = 79 / 0;
                                                            } else {
                                                                gradientDrawable = (GradientDrawable) drawableMutate;
                                                            }
                                                        } else {
                                                            gradientDrawable = null;
                                                        }
                                                        if (gradientDrawable != null) {
                                                            gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(R.dimen.border_02), context.getColor(i15));
                                                        }
                                                        constraintLayout3.getClass();
                                                        bitmapWrite = h2ExternalSyntheticLambda1.write(constraintLayout3);
                                                        companion = companion;
                                                    } else {
                                                        i20 = R.id.textView;
                                                    }
                                                } else {
                                                    i20 = R.id.imageViewIconBackgroundBorder;
                                                }
                                            }
                                        }
                                    }
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i20)));
                                return;
                            }
                            if (companion instanceof g0ExternalSyntheticLambda28) {
                                isAdapterPositionOnScreen isadapterpositiononscreen3 = h2ExternalSyntheticLambda1.serializer;
                                getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8Write = getDefaultJoinLxFBmk8.write(LayoutInflater.from(context));
                                ((accessgetReuseDeactivationViaHostcp) getdefaultjoinlxfbmk8Write.read).setImageResource(R.drawable.rounded_box);
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) getdefaultjoinlxfbmk8Write.write;
                                appCompatImageView6.setColorFilter(context.getColor(R.color.neutral_00));
                                appCompatImageView6.setImageResource(R.drawable.ic_bold_large_logout_logout);
                                ConstraintLayout constraintLayoutWrite = getdefaultjoinlxfbmk8Write.write();
                                constraintLayoutWrite.getClass();
                                bitmapWrite = h2ExternalSyntheticLambda1.RemoteActionCompatParcelizer(constraintLayoutWrite);
                            } else if (companion instanceof g0ExternalSyntheticLambda8) {
                                g0ExternalSyntheticLambda8 g0externalsyntheticlambda8 = (g0ExternalSyntheticLambda8) companion;
                                isAdapterPositionOnScreen isadapterpositiononscreen4 = h2ExternalSyntheticLambda1.serializer;
                                String strMediaBrowserCompatMediaItem = g0externalsyntheticlambda8.MediaBrowserCompatMediaItem();
                                List<Integer> listIconCompatParcelizer = g0externalsyntheticlambda8.IconCompatParcelizer();
                                int iSerializer = g0externalsyntheticlambda8.serializer();
                                int iRatingCompat = g0externalsyntheticlambda8.RatingCompat();
                                int iWrite = g0externalsyntheticlambda8.write();
                                int iMediaMetadataCompat = g0externalsyntheticlambda8.MediaMetadataCompat();
                                getOnLoggedCallback getonloggedcallback = new getOnLoggedCallback(context);
                                getonloggedcallback.setAmountText(strMediaBrowserCompatMediaItem);
                                getonloggedcallback.setBonusIcons(listIconCompatParcelizer);
                                getonloggedcallback.setCircleColor(iSerializer);
                                getonloggedcallback.setPillTextColor(iRatingCompat);
                                getonloggedcallback.setPillBackgroundColor(iWrite);
                                getonloggedcallback.setPillBackgroundStrokeColor(iMediaMetadataCompat);
                                bitmapWrite = h2ExternalSyntheticLambda1.write(getonloggedcallback);
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return;
                            }
                        }
                        bitmap = bitmapWrite;
                        linkedHashMap2 = linkedHashMap;
                    } else {
                        int i25 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 31;
                        ComponentActivity = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        g0ExternalSyntheticLambda11 g0externalsyntheticlambda11 = (g0ExternalSyntheticLambda11) companion2;
                        int i27 = g0externalsyntheticlambda11.write;
                        int i28 = g0externalsyntheticlambda11.serializer;
                        int i29 = g0externalsyntheticlambda11.read;
                        if (g0externalsyntheticlambda11.IconCompatParcelizer) {
                            isAdapterPositionOnScreen isadapterpositiononscreen5 = h2ExternalSyntheticLambda1.serializer;
                            if (g0externalsyntheticlambda11.MediaDescriptionCompat) {
                                constraintLayoutRemoteActionCompatParcelizer = getDownimpl.write(context, i29, i28);
                            } else {
                                constraintLayoutRemoteActionCompatParcelizer = getDownimpl.RemoteActionCompatParcelizer(context, i29, i28, i27);
                            }
                            bitmapRemoteActionCompatParcelizer = h2ExternalSyntheticLambda1.RemoteActionCompatParcelizer(constraintLayoutRemoteActionCompatParcelizer);
                        } else {
                            isAdapterPositionOnScreen isadapterpositiononscreen6 = h2ExternalSyntheticLambda1.serializer;
                            LayoutTileBinding layoutTileBindingWrite = LayoutTileBinding.write(LayoutInflater.from(context));
                            ((accessgetReuseDeactivationViaHostcp) layoutTileBindingWrite.RemoteActionCompatParcelizer).setColorFilter(context.getColor(i28));
                            ((accessgetReuseDeactivationViaHostcp) layoutTileBindingWrite.serializer).setColorFilter(context.getColor(i27), PorterDuff.Mode.ADD);
                            AppCompatImageView appCompatImageView7 = (AppCompatImageView) layoutTileBindingWrite.read;
                            appCompatImageView7.setColorFilter(context.getColor(R.color.neutral_00));
                            appCompatImageView7.setImageResource(i29);
                            ((FrameLayout) layoutTileBindingWrite.write).setVisibility(8);
                            ConstraintLayout constraintLayoutSerializer = layoutTileBindingWrite.serializer();
                            constraintLayoutSerializer.getClass();
                            bitmapRemoteActionCompatParcelizer = h2ExternalSyntheticLambda1.RemoteActionCompatParcelizer(constraintLayoutSerializer);
                        }
                        bitmap = bitmapRemoteActionCompatParcelizer;
                        callTracer = callTracer2;
                        companion = companion2;
                        list = list2;
                        iconAnchor2 = iconAnchor;
                        linkedHashMap2 = linkedHashMap3;
                    }
                    linkedHashMap2.put(companion, bitmap);
                    gexternalsyntheticlambda1 = gexternalsyntheticlambda0;
                }
                Point pointRemoteActionCompatParcelizer = AndroidUiDispatcherCompanioncurrentThread1.RemoteActionCompatParcelizer(gexternalsyntheticlambda1.MediaDescriptionCompat);
                if (companion.RemoteActionCompatParcelizer()) {
                    int i30 = ComponentActivity + 13;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i30 % Fields.SpotShadowColor;
                    int i31 = i30 % 2;
                    dValueOf = Double.valueOf(1.0d);
                } else {
                    dValueOf = null;
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("clicked_marker_id_key", gexternalsyntheticlambda1.write);
                if (companion instanceof g0) {
                    int i32 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 119;
                    ComponentActivity = i32 % Fields.SpotShadowColor;
                    if (i32 % 2 == 0) {
                        jsonObject.addProperty("clicked_marker_type_key", ((g0) companion).PlaybackStateCompatCustomAction);
                    } else {
                        jsonObject.addProperty("clicked_marker_type_key", ((g0) companion).PlaybackStateCompatCustomAction);
                        throw null;
                    }
                }
                f7 f7Var = gexternalsyntheticlambda1.read;
                f7Var.getClass();
                CallTracer callTracer3 = callTracer;
                PointAnnotationManager pointAnnotationManager = (PointAnnotationManager) ((LinkedHashMap) callTracer3.IconCompatParcelizer).get(f7Var);
                if (pointAnnotationManager == null) {
                    pointAnnotationManager = (PointAnnotationManager) callTracer3.serializer;
                }
                pointAnnotationManager.getClass();
                String string = UUID.randomUUID().toString();
                string.getClass();
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("icon-anchor", iconAnchor2.value);
                JsonArray jsonArray = new JsonArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(Double.valueOf(Double.parseDouble(it.next().toString())));
                }
                jsonObject2.add("icon-offset", jsonArray);
                if (dValueOf != null) {
                    int i33 = ComponentActivity + 93;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i33 % Fields.SpotShadowColor;
                    int i34 = i33 % 2;
                    jsonObject2.addProperty("symbol-sort-key", Double.valueOf(dValueOf.doubleValue()));
                }
                PointAnnotation pointAnnotation = new PointAnnotation(string, pointAnnotationManager, jsonObject2, pointRemoteActionCompatParcelizer);
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{pointAnnotation.iconImageBitmap, bitmap}, getCieXyz.write())).booleanValue()) {
                    pointAnnotation.iconImageBitmap = bitmap;
                    if (pointAnnotation.getIconImageInternal$plugin_annotation_release() != null) {
                        int i35 = ComponentActivity + 53;
                        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i35 % Fields.SpotShadowColor;
                        if (i35 % 2 == 0) {
                            String iconImageInternal$plugin_annotation_release = pointAnnotation.getIconImageInternal$plugin_annotation_release();
                            iconImageInternal$plugin_annotation_release.getClass();
                            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(iconImageInternal$plugin_annotation_release, "icon_default_name_", false)) {
                                StringBuilder sb = new StringBuilder("icon_default_name_");
                                int iHashCode = pointAnnotationManager.hashCode();
                                TuplesKt.RemoteActionCompatParcelizer(16);
                                String string2 = Integer.toString(iHashCode, 16);
                                string2.getClass();
                                sb.append(string2);
                                sb.append('_');
                                sb.append(bitmap.hashCode());
                                jsonObject2.addProperty("icon-image", sb.toString());
                            }
                        } else {
                            String iconImageInternal$plugin_annotation_release2 = pointAnnotation.getIconImageInternal$plugin_annotation_release();
                            iconImageInternal$plugin_annotation_release2.getClass();
                            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(iconImageInternal$plugin_annotation_release2, "icon_default_name_", false)) {
                                StringBuilder sb2 = new StringBuilder("icon_default_name_");
                                int iHashCode2 = pointAnnotationManager.hashCode();
                                TuplesKt.RemoteActionCompatParcelizer(16);
                                String string3 = Integer.toString(iHashCode2, 16);
                                string3.getClass();
                                sb2.append(string3);
                                sb2.append('_');
                                sb2.append(bitmap.hashCode());
                                jsonObject2.addProperty("icon-image", sb2.toString());
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("icon_default_name_");
                        int iHashCode3 = pointAnnotationManager.hashCode();
                        TuplesKt.RemoteActionCompatParcelizer(16);
                        String string4 = Integer.toString(iHashCode3, 16);
                        string4.getClass();
                        sb3.append(string4);
                        sb3.append('_');
                        sb3.append(bitmap.hashCode());
                        jsonObject2.addProperty("icon-image", sb3.toString());
                    }
                }
                jsonObject2.add("custom_data", jsonObject);
                pointAnnotationManager.annotationMap.put(string, pointAnnotation);
                zzbv zzbvVar = pointAnnotationManager.styleImages;
                zzbvVar.getClass();
                String iconImageInternal$plugin_annotation_release3 = pointAnnotation.getIconImageInternal$plugin_annotation_release();
                if (iconImageInternal$plugin_annotation_release3 != null && setCarryoverInAppMessage.RemoteActionCompatParcelizer(iconImageInternal$plugin_annotation_release3, "icon_default_name_", false)) {
                    LinkedHashMap linkedHashMap4 = (LinkedHashMap) zzbvVar.write;
                    Integer num2 = (Integer) linkedHashMap4.get(iconImageInternal$plugin_annotation_release3);
                    linkedHashMap4.put(iconImageInternal$plugin_annotation_release3, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                }
                pointAnnotationManager.updateSource();
                return;
            }
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        removeNodeAtDepth.serializer("annotationManagers");
        throw null;
    }
}
