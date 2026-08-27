package androidx.work.impl;

import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.common.MapboxTracing;
import com.mapbox.maps.GeoJSONSourceData;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorType;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import io.sentry.android.core.internal.util.MediaSessionCompatQueueItem;
import io.sentry.android.core.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import o.ImageBitmapCompanion;
import o.ImageBitmapDefaultImpls;
import o.accessgetButton12cp;
import o.accessgetButton13cp;
import o.accessgetDvrcp;
import o.accessgetEightcp;
import o.accessgetForwardcp;
import o.accessgetHelpcp;
import o.graphicsLayerpANQ8Wgdefault;
import o.mapMKHz9U;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Schedulers$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ Schedulers$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.serializer = i;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = obj3;
        this.IconCompatParcelizer = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        Throwable th;
        Expected<String, None> styleGeoJSONSourceData;
        String error;
        int i = this.serializer;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.read;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.write;
        if (i == 0) {
            List list = (List) obj4;
            mapMKHz9U mapmkhz9u = (mapMKHz9U) obj3;
            graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault = (graphicsLayerpANQ8Wgdefault) obj2;
            WorkDatabase workDatabase = (WorkDatabase) obj;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ImageBitmapCompanion) it.next()).RemoteActionCompatParcelizer(mapmkhz9u.RemoteActionCompatParcelizer);
            }
            ImageBitmapDefaultImpls.RemoteActionCompatParcelizer(graphicslayerpanq8wgdefault, workDatabase, list);
            return;
        }
        String message = null;
        if (i == 1) {
            accessgetHelpcp accessgethelpcp = (accessgetHelpcp) obj4;
            accessgetEightcp accessgeteightcp = (accessgetEightcp) obj3;
            String str = accessgeteightcp.serializer;
            accessgetButton12cp accessgetbutton12cp = (accessgetButton12cp) obj2;
            accessgetDvrcp accessgetdvrcp = (accessgetDvrcp) obj;
            accessgethelpcp.getClass();
            Logger logger = accessgetHelpcp.RemoteActionCompatParcelizer;
            try {
                accessgetForwardcp accessgetforwardcpIconCompatParcelizer = accessgethelpcp.IconCompatParcelizer.IconCompatParcelizer(str);
                if (accessgetforwardcpIconCompatParcelizer == null) {
                    String str2 = "Transport backend '" + str + "' is not registered";
                    logger.warning(str2);
                    accessgetbutton12cp.write(new IllegalArgumentException(str2));
                } else {
                    accessgethelpcp.write.serializer(new PreviewView$1$$ExternalSyntheticLambda2(accessgethelpcp, accessgeteightcp, ((accessgetButton13cp) accessgetforwardcpIconCompatParcelizer).read(accessgetdvrcp), 8));
                    accessgetbutton12cp.write(null);
                }
                return;
            } catch (Exception e) {
                logger.warning("Error scheduling event " + e.getMessage());
                accessgetbutton12cp.write(e);
                return;
            }
        }
        if (i != 2) {
            if (i == 3) {
                MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) obj4;
                mapboxStyleManager.getClass();
                mapboxStyleManager.getMapLoadingErrorDelegate().sendMapLoadingError(new MapLoadingError(MapLoadingErrorType.SOURCE, (String) obj3, ((GeoJsonSource) obj2).sourceId, null, (Date) obj));
                return;
            }
            Window window = (Window) obj4;
            Window.Callback callback = (Window.Callback) obj3;
            Runnable runnable = (Runnable) obj2;
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = (r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) obj;
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                window.setCallback(callback);
                MediaSessionCompatQueueItem mediaSessionCompatQueueItem = new MediaSessionCompatQueueItem(viewPeekDecorView, runnable);
                r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.getClass();
                viewPeekDecorView.getViewTreeObserver().addOnDrawListener(mediaSessionCompatQueueItem);
                return;
            }
            return;
        }
        MapboxStyleManager mapboxStyleManager2 = (MapboxStyleManager) obj4;
        GeoJsonSource geoJsonSource = (GeoJsonSource) obj3;
        String str3 = (String) obj2;
        GeoJSONSourceData geoJSONSourceData = (GeoJSONSourceData) obj;
        mapboxStyleManager2.getClass();
        str3.getClass();
        boolean platformTracingEnabled = MapboxTracing.INSTANCE.getPlatformTracingEnabled();
        if (platformTracingEnabled) {
            Trace.beginSection("mbx: GeoJSONSource#setSourceData");
        }
        try {
            styleGeoJSONSourceData = mapboxStyleManager2.setStyleGeoJSONSourceData(geoJsonSource.sourceId, str3, geoJSONSourceData);
            if (platformTracingEnabled) {
                Trace.endSection();
            }
            th = null;
        } catch (Throwable th2) {
            if (platformTracingEnabled) {
                Trace.endSection();
            }
            th = th2;
            styleGeoJSONSourceData = null;
        }
        if ((styleGeoJSONSourceData == null || !styleGeoJSONSourceData.isError()) && th == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dataId", str3);
        StringBuilder sb = new StringBuilder("setStyleGeoJSONSourceData error: ");
        if (styleGeoJSONSourceData != null && (error = styleGeoJSONSourceData.getError()) != null) {
            message = error;
        } else if (th != null) {
            message = th.getMessage();
        }
        sb.append(message);
        jSONObject.put("message", sb.toString());
        String string = jSONObject.toString();
        string.getClass();
        Date date = new Date();
        MapboxLogger.logW("GeoJsonSource", "set GeoJSON data error: ".concat(string));
        ((Handler) geoJsonSource.mainHandler$delegate.MediaSessionCompatResultReceiverWrapper()).post(new Schedulers$$ExternalSyntheticLambda1(mapboxStyleManager2, string, geoJsonSource, date, 3));
    }
}
