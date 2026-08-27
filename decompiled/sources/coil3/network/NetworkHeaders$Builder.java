package coil3.network;

import androidx.sqlite.SQLite;
import com.mapbox.navigation.ui.maps.route.line.api.RouteRenderCallbackHolder;
import com.mapbox.navigation.ui.maps.route.line.api.RoutesRenderedResult;
import com.mapbox.navigation.ui.maps.route.line.api.SourceIdAndDataId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.ranges.RangesKt;
import o.AndroidPaint_androidKt;
import o.DrawableTransformation;
import o.ImageUtilCodecFailedException;
import o.SmallDisplaySizeQuirk;
import o.SurfaceOrderQuirk;
import o.getCieXyz;
import o.getGraphicsDensityui;
import o.getQueryParameterslambda2;
import o.mapToBase;
import o.nativeGetSurfaceInfo;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.setInflatedId;
import o.setStylek9PVt8s;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkHeaders$Builder {
    public final LinkedHashMap serializer;

    public Collection IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.serializer.entrySet()) {
            if (((SurfaceOrderQuirk) entry.getValue()).serializer) {
                arrayList.add(((SurfaceOrderQuirk) entry.getValue()).IconCompatParcelizer);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public Collection MediaMetadataCompat() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.serializer.entrySet()) {
            if (((SurfaceOrderQuirk) entry.getValue()).serializer) {
                arrayList.add(((SurfaceOrderQuirk) entry.getValue()).MediaMetadataCompat);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public nativeGetSurfaceInfo RemoteActionCompatParcelizer() {
        nativeGetSurfaceInfo nativegetsurfaceinfo = new nativeGetSurfaceInfo();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.serializer.entrySet()) {
            SurfaceOrderQuirk surfaceOrderQuirk = (SurfaceOrderQuirk) entry.getValue();
            if (surfaceOrderQuirk.RemoteActionCompatParcelizer && surfaceOrderQuirk.serializer) {
                String str = (String) entry.getKey();
                nativegetsurfaceinfo.read(surfaceOrderQuirk.IconCompatParcelizer);
                arrayList.add(str);
            }
        }
        arrayList.toString();
        setInflatedId.IconCompatParcelizer(3, "UseCaseAttachState");
        return nativegetsurfaceinfo;
    }

    public void maybeFinish(RouteRenderCallbackHolder routeRenderCallbackHolder) {
        LinkedHashSet linkedHashSet = routeRenderCallbackHolder.allRouteIds;
        LinkedHashSet linkedHashSet2 = routeRenderCallbackHolder.successfulRouteIds;
        LinkedHashSet linkedHashSet3 = routeRenderCallbackHolder.renderingCancelledRouteIds;
        LinkedHashSet linkedHashSet4 = RangesKt.read(linkedHashSet2, linkedHashSet3);
        LinkedHashSet linkedHashSet5 = routeRenderCallbackHolder.clearingCancelledRouteIds;
        Object[] objArr = {linkedHashSet, RangesKt.read(linkedHashSet4, linkedHashSet5)};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = this.serializer;
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                Object[] objArr2 = {entry.getValue(), routeRenderCallbackHolder};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                linkedHashMap2.remove((SourceIdAndDataId) it.next());
            }
            routeRenderCallbackHolder.subscription.cancel();
            routeRenderCallbackHolder.callback.onRoutesRendered(new RoutesRenderedResult(RangesKt.RemoteActionCompatParcelizer(routeRenderCallbackHolder.renderedRouteIdsToNotify, (Iterable) linkedHashSet3), linkedHashSet3, RangesKt.RemoteActionCompatParcelizer(routeRenderCallbackHolder.clearedRouteIdsToNotify, (Iterable) linkedHashSet5), linkedHashSet5));
        }
    }

    public nativeGetSurfaceInfo serializer() {
        nativeGetSurfaceInfo nativegetsurfaceinfo = new nativeGetSurfaceInfo();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.serializer.entrySet()) {
            SurfaceOrderQuirk surfaceOrderQuirk = (SurfaceOrderQuirk) entry.getValue();
            if (surfaceOrderQuirk.serializer) {
                nativegetsurfaceinfo.read(surfaceOrderQuirk.IconCompatParcelizer);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        setInflatedId.IconCompatParcelizer(3, "UseCaseAttachState");
        return nativegetsurfaceinfo;
    }

    public void serializer(String str, mapToBase maptobase, ImageUtilCodecFailedException imageUtilCodecFailedException, SmallDisplaySizeQuirk smallDisplaySizeQuirk, List list) {
        LinkedHashMap linkedHashMap = this.serializer;
        if (linkedHashMap.containsKey(str)) {
            SurfaceOrderQuirk surfaceOrderQuirk = new SurfaceOrderQuirk(maptobase, imageUtilCodecFailedException, smallDisplaySizeQuirk, list);
            SurfaceOrderQuirk surfaceOrderQuirk2 = (SurfaceOrderQuirk) linkedHashMap.get(str);
            surfaceOrderQuirk.serializer = surfaceOrderQuirk2.serializer;
            surfaceOrderQuirk.RemoteActionCompatParcelizer = surfaceOrderQuirk2.RemoteActionCompatParcelizer;
            linkedHashMap.put(str, surfaceOrderQuirk);
        }
    }

    public boolean serializer(String str) {
        LinkedHashMap linkedHashMap = this.serializer;
        if (linkedHashMap.containsKey(str)) {
            return ((SurfaceOrderQuirk) linkedHashMap.get(str)).serializer;
        }
        return false;
    }

    public AndroidPaint_androidKt write() {
        Collection collectionValues = this.serializer.values();
        collectionValues.getClass();
        setStylek9PVt8s[] setstylek9pvt8sArr = (setStylek9PVt8s[]) collectionValues.toArray(new setStylek9PVt8s[0]);
        return new AndroidPaint_androidKt(0, (setStylek9PVt8s[]) Arrays.copyOf(setstylek9pvt8sArr, setstylek9pvt8sArr.length));
    }

    public NetworkHeaders$Builder(int i) {
        if (i == 3) {
            this.serializer = new LinkedHashMap();
            return;
        }
        if (i == 4) {
            this.serializer = new LinkedHashMap();
        } else if (i != 5) {
            this.serializer = new LinkedHashMap();
        } else {
            this.serializer = new LinkedHashMap();
        }
    }

    public void RemoteActionCompatParcelizer(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        LinkedHashMap linkedHashMap = this.serializer;
        if (linkedHashMap.containsKey(r8lambdaucgighn8fiyv_vccodeafjfpedk)) {
            DrawableTransformation.serializer(46, "A `initializer` with the same `clazz` has already been added: ", r8lambdaucgighn8fiyv_vccodeafjfpedk.RemoteActionCompatParcelizer());
        } else {
            linkedHashMap.put(r8lambdaucgighn8fiyv_vccodeafjfpedk, new setStylek9PVt8s(r8lambdaucgighn8fiyv_vccodeafjfpedk, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        }
    }

    public int incrementDataId(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.serializer;
        Integer num = (Integer) linkedHashMap.get(str);
        int iIntValue = (num != null ? num.intValue() : 0) + 1;
        linkedHashMap.put(str, Integer.valueOf(iIntValue));
        return iIntValue;
    }

    public void IconCompatParcelizer(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        this.serializer.put(lowerCase, (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new String[]{str}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer));
    }

    public r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k read() {
        return new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k(this.serializer);
    }

    public NetworkHeaders$Builder(getGraphicsDensityui getgraphicsdensityui) {
        Map map = getgraphicsdensityui.serializer;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), onContentCardDismissed.IconCompatParcelizer((Collection) entry.getValue()));
        }
        this.serializer = linkedHashMap;
    }

    public NetworkHeaders$Builder(String str) {
        this.serializer = new LinkedHashMap();
    }
}
