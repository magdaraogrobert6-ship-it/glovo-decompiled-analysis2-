package com.roadrunner.map.integration.mapbox.domain;

import android.os.HandlerThread;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.LineString;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.f8;
import o.fa;
import o.fb;
import o.fd;
import o.fg;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.j0;
import o.j3;
import o.j4;
import o.prepareForActivityTransitionCarryover;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class GetLineLayer {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final j4 write;

    public GetLineLayer(j4 j4Var, AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, j4 j4Var2) {
        this.write = j4Var2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031 A[PHI: r4 r6
  0x0031: PHI (r4v29 o.j3) = (r4v28 o.j3), (r4v31 o.j3) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r6v8 int) = (r6v7 int), (r6v10 int) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    public final Object invoke(fg fgVar, ContinuationImpl continuationImpl) {
        j3 j3Var;
        GeoJsonSource geoJsonSourceBuild;
        Object objFromLngLats;
        String str;
        List list;
        int i;
        fg fgVar2 = fgVar;
        int i2 = 2;
        int i3 = 2 % 2;
        if (continuationImpl instanceof j3) {
            int i4 = RemoteActionCompatParcelizer + 111;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                j3Var = (j3) continuationImpl;
                i = j3Var.IconCompatParcelizer;
                int i5 = 52 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    j3Var.IconCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    j3Var = new j3(this, continuationImpl);
                }
            } else {
                j3Var = (j3) continuationImpl;
                i = j3Var.IconCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    j3Var.IconCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    j3Var = new j3(this, continuationImpl);
                }
            }
        } else {
            j3Var = new j3(this, continuationImpl);
        }
        Object obj = j3Var.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = j3Var.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str2 = j4.read();
            String str3 = fgVar2.write;
            if (str3 == null) {
                str3 = j4.read();
            }
            geoJsonSourceBuild = new GeoJsonSource.Builder(str2).build();
            j3Var.write = fgVar2;
            j3Var.read = str3;
            j3Var.RemoteActionCompatParcelizer = geoJsonSourceBuild;
            j3Var.IconCompatParcelizer = 1;
            if (fgVar2.MediaMetadataCompat == fb.ARC) {
                objFromLngLats = BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new PhotoIdUiModelImpl$1$1(this.write, fgVar2, shortNewsContentCardView, i2), j3Var);
            } else {
                List list2 = fgVar2.IconCompatParcelizer;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                Iterator it = list2.iterator();
                int i7 = serializer + 9;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 2;
                }
                while (it.hasNext()) {
                    arrayList.add(AndroidUiDispatcherCompanioncurrentThread1.RemoteActionCompatParcelizer((f8) it.next()));
                }
                objFromLngLats = LineString.fromLngLats(arrayList);
                objFromLngLats.getClass();
            }
            if (objFromLngLats == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str3;
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = RemoteActionCompatParcelizer + 115;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                GeoJsonSource geoJsonSource = j3Var.RemoteActionCompatParcelizer;
                String str4 = j3Var.read;
                fg fgVar3 = j3Var.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            }
            GeoJsonSource geoJsonSource2 = j3Var.RemoteActionCompatParcelizer;
            str = j3Var.read;
            fg fgVar4 = j3Var.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            geoJsonSourceBuild = geoJsonSource2;
            fgVar2 = fgVar4;
            objFromLngLats = obj;
        }
        LineString lineString = (LineString) objFromLngLats;
        HandlerThread handlerThread = GeoJsonSource.workerThread;
        geoJsonSourceBuild.getClass();
        lineString.getClass();
        geoJsonSourceBuild.setGeoJson(lineString, "");
        LineLayer lineLayer = new LineLayer(str, geoJsonSourceBuild.sourceId);
        lineLayer.lineWidth(fgVar2.MediaDescriptionCompat);
        lineLayer.lineColor(fgVar2.MediaBrowserCompatMediaItem);
        lineLayer.lineBlur(fgVar2.RatingCompat);
        LoadBalancer$Helper loadBalancer$Helper = fgVar2.read;
        if (loadBalancer$Helper instanceof fd) {
            fd fdVar = (fd) loadBalancer$Helper;
            list = SQLite.read(new Double(fdVar.RemoteActionCompatParcelizer), new Double(fdVar.IconCompatParcelizer));
            int i10 = RemoteActionCompatParcelizer + 53;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{loadBalancer$Helper, fa.serializer}, getCieXyz.write())).booleanValue()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            list = instance_delegatelambda0.write;
        }
        lineLayer.lineDasharray(list);
        int iSerializer = getQueryParameterslambda2.serializer();
        return new j0(geoJsonSourceBuild, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{lineLayer}, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
