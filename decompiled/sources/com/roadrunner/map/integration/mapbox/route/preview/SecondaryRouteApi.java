package com.roadrunner.map.integration.mapbox.route.preview;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.utils.PolylineUtils;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.map.integration.mapbox.route.FetchMapboxRouteUseCase;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DeferredCoroutine;
import o.ShortNewsContentCardView;
import o.accessgetGocp;
import o.accessgetInstancedelegatecp;
import o.f8;
import o.fd;
import o.fg;
import o.fromColorLong;
import o.g5;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.getSimplefcGXIks;
import o.getUnspecifiedrAG3T2kannotations;
import o.h3;
import o.j4;
import o.lf;
import o.m1ExternalSyntheticLambda22;
import o.m1ExternalSyntheticLambda28;
import o.m1ExternalSyntheticLambda7;
import o.m9;
import o.ma;
import o.mg;
import o.nExternalSyntheticLambda0;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;
import o.setLastHorizontalStyle;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SecondaryRouteApi {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final FetchMapboxRouteUseCase IconCompatParcelizer;
    public final mg MediaBrowserCompatMediaItem;
    public getUnspecifiedrAG3T2kannotations RemoteActionCompatParcelizer;
    public fromColorLong read;
    public final SaveHeatmapUrlImpl serializer;
    public DeferredCoroutine write;

    public SecondaryRouteApi(mg mgVar, ma maVar, FetchMapboxRouteUseCase fetchMapboxRouteUseCase, m9 m9Var, SaveHeatmapUrlImpl saveHeatmapUrlImpl) {
        this.MediaBrowserCompatMediaItem = mgVar;
        this.IconCompatParcelizer = fetchMapboxRouteUseCase;
        this.serializer = saveHeatmapUrlImpl;
    }

    public final void write(boolean z) {
        fromColorLong fromcolorlong;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 1;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!z) {
            int i5 = i2 + 123;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.MediaBrowserCompatMediaItem.read.write(null);
            int i7 = MediaMetadataCompat + 101;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        DeferredCoroutine deferredCoroutine = this.write;
        if (deferredCoroutine == null || (fromcolorlong = this.read) == null) {
            return;
        }
        BuildersKt.RemoteActionCompatParcelizer(fromcolorlong, null, null, new PushEventPublisherImpl$emit$1(deferredCoroutine, this, shortNewsContentCardView, 23), 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x013a A[LOOP:1: B:34:0x0134->B:36:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x016c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0179  */
    /* JADX WARN: Code duplicated, block: B:45:0x0180  */
    /* JADX WARN: Code duplicated, block: B:47:0x018c  */
    /* JADX WARN: Code duplicated, block: B:50:0x019f  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:79:0x028a  */
    /* JADX WARN: Code duplicated, block: B:81:0x028e  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x028e, please report this as an issue */
    public static final Object access$requestSecondaryRoute(SecondaryRouteApi secondaryRouteApi, getUnspecifiedrAG3T2kannotations getunspecifiedrag3t2kannotations, MapboxNavigation mapboxNavigation, ContinuationImpl continuationImpl) {
        nExternalSyntheticLambda0 nexternalsyntheticlambda0;
        int i;
        int i2;
        int i3;
        Object objRequestRoutes;
        CoroutineSingletons coroutineSingletons;
        int i4;
        String str;
        int i5;
        String str2;
        ArrayList arrayList;
        int i6;
        m1ExternalSyntheticLambda7 m1externalsyntheticlambda7;
        int i7;
        NavigationRoute navigationRoute;
        DirectionsRoute directionsRoute;
        String strGeometry;
        ArrayList arrayList2;
        int i8 = 2 % 2;
        int i9 = MediaMetadataCompat + 43;
        MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            if (continuationImpl instanceof nExternalSyntheticLambda0) {
                nexternalsyntheticlambda0 = (nExternalSyntheticLambda0) continuationImpl;
                i = nexternalsyntheticlambda0.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    i2 = MediaSessionCompatQueueItem + 63;
                    MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        i3 = i / Integer.MIN_VALUE;
                    } else {
                        i3 = i - Integer.MIN_VALUE;
                    }
                    nexternalsyntheticlambda0.write = i3;
                }
            }
            objRequestRoutes = nexternalsyntheticlambda0.IconCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i4 = nexternalsyntheticlambda0.write;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objRequestRoutes);
                FetchMapboxRouteUseCase fetchMapboxRouteUseCase = secondaryRouteApi.IconCompatParcelizer;
                getSimplefcGXIks getsimplefcgxiks = getunspecifiedrag3t2kannotations.read;
                List list = getunspecifiedrag3t2kannotations.serializer;
                getsimplefcgxiks.getClass();
                list.getClass();
                str = getsimplefcgxiks.read();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "b"}, getCieXyz.write())).booleanValue()) {
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "w"}, getCieXyz.write())).booleanValue())) {
                        str2 = "walking";
                    } else {
                        str2 = "driving-traffic";
                    }
                } else {
                    i5 = MediaMetadataCompat + 59;
                    MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        int i10 = 90 / 0;
                    }
                    str2 = "cycling";
                }
                RouteOptions.Builder builderSteps = RouteOptions.builder().profile(str2).excludeObject(lf.serializer(str2, getsimplefcgxiks.RemoteActionCompatParcelizer(), getsimplefcgxiks.write())).steps(Boolean.TRUE);
                List list2 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{Point.fromLngLat(getsimplefcgxiks.serializer().IconCompatParcelizer, getsimplefcgxiks.serializer().serializer)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                List<accessgetGocp> list3 = list;
                arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                for (accessgetGocp accessgetgocp : list3) {
                    arrayList.add(Point.fromLngLat(accessgetgocp.IconCompatParcelizer, accessgetgocp.serializer));
                    nexternalsyntheticlambda0 = nexternalsyntheticlambda0;
                }
                RouteOptions routeOptionsBuild = builderSteps.coordinatesList(onContentCardDismissed.IconCompatParcelizer(arrayList, list2)).build();
                routeOptionsBuild.getClass();
                nexternalsyntheticlambda0.write = 1;
                objRequestRoutes = fetchMapboxRouteUseCase.requestRoutes(mapboxNavigation, routeOptionsBuild, nexternalsyntheticlambda0);
                if (objRequestRoutes == coroutineSingletons) {
                    i6 = MediaMetadataCompat + 97;
                    MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
            } else if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(objRequestRoutes);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m1externalsyntheticlambda7 = (m1ExternalSyntheticLambda7) objRequestRoutes;
            if (m1externalsyntheticlambda7 instanceof m1ExternalSyntheticLambda22) {
                i7 = MediaMetadataCompat + 5;
                MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(((m1ExternalSyntheticLambda22) m1externalsyntheticlambda7).serializer());
                    int i11 = 35 / 0;
                    if (navigationRoute == null) {
                        return null;
                    }
                } else {
                    navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(((m1ExternalSyntheticLambda22) m1externalsyntheticlambda7).serializer());
                    if (navigationRoute == null) {
                        return null;
                    }
                }
                directionsRoute = navigationRoute.getDirectionsRoute();
                if (directionsRoute != null) {
                    return null;
                }
                return null;
            }
            if (m1externalsyntheticlambda7 instanceof m1ExternalSyntheticLambda28) {
                Timber.RemoteActionCompatParcelizer.write(new Exception("Secondary route fetch failed: " + ((m1ExternalSyntheticLambda28) m1externalsyntheticlambda7).read()));
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i12 = 51 / 0;
        if (continuationImpl instanceof nExternalSyntheticLambda0) {
            nexternalsyntheticlambda0 = (nExternalSyntheticLambda0) continuationImpl;
            i = nexternalsyntheticlambda0.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                i2 = MediaSessionCompatQueueItem + 63;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    i3 = i / Integer.MIN_VALUE;
                } else {
                    i3 = i - Integer.MIN_VALUE;
                }
                nexternalsyntheticlambda0.write = i3;
            }
        }
        objRequestRoutes = nexternalsyntheticlambda0.IconCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = nexternalsyntheticlambda0.write;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objRequestRoutes);
            FetchMapboxRouteUseCase fetchMapboxRouteUseCase2 = secondaryRouteApi.IconCompatParcelizer;
            getSimplefcGXIks getsimplefcgxiks2 = getunspecifiedrag3t2kannotations.read;
            List list4 = getunspecifiedrag3t2kannotations.serializer;
            getsimplefcgxiks2.getClass();
            list4.getClass();
            str = getsimplefcgxiks2.read();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "b"}, getCieXyz.write())).booleanValue()) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "w"}, getCieXyz.write())).booleanValue())) {
                    str2 = "walking";
                } else {
                    str2 = "driving-traffic";
                }
            } else {
                i5 = MediaMetadataCompat + 59;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i13 = 90 / 0;
                }
                str2 = "cycling";
            }
            RouteOptions.Builder builderSteps2 = RouteOptions.builder().profile(str2).excludeObject(lf.serializer(str2, getsimplefcgxiks2.RemoteActionCompatParcelizer(), getsimplefcgxiks2.write())).steps(Boolean.TRUE);
            List list5 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{Point.fromLngLat(getsimplefcgxiks2.serializer().IconCompatParcelizer, getsimplefcgxiks2.serializer().serializer)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            List<accessgetGocp> list6 = list4;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
            while (r1.hasNext()) {
                arrayList.add(Point.fromLngLat(accessgetgocp.IconCompatParcelizer, accessgetgocp.serializer));
                nexternalsyntheticlambda0 = nexternalsyntheticlambda0;
            }
            RouteOptions routeOptionsBuild2 = builderSteps2.coordinatesList(onContentCardDismissed.IconCompatParcelizer(arrayList, list5)).build();
            routeOptionsBuild2.getClass();
            nexternalsyntheticlambda0.write = 1;
            objRequestRoutes = fetchMapboxRouteUseCase2.requestRoutes(mapboxNavigation, routeOptionsBuild2, nexternalsyntheticlambda0);
            if (objRequestRoutes == coroutineSingletons) {
                i6 = MediaMetadataCompat + 97;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else if (i4 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objRequestRoutes);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m1externalsyntheticlambda7 = (m1ExternalSyntheticLambda7) objRequestRoutes;
        if (m1externalsyntheticlambda7 instanceof m1ExternalSyntheticLambda22) {
            i7 = MediaMetadataCompat + 5;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(((m1ExternalSyntheticLambda22) m1externalsyntheticlambda7).serializer());
                int i14 = 35 / 0;
                if (navigationRoute == null) {
                    return null;
                }
            } else {
                navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(((m1ExternalSyntheticLambda22) m1externalsyntheticlambda7).serializer());
                if (navigationRoute == null) {
                    return null;
                }
            }
            directionsRoute = navigationRoute.getDirectionsRoute();
            if (directionsRoute != null || (strGeometry = directionsRoute.geometry()) == null) {
                return null;
            }
            SaveHeatmapUrlImpl saveHeatmapUrlImpl = secondaryRouteApi.serializer;
            try {
                List<Point> listDecode = PolylineUtils.decode(strGeometry, 6);
                listDecode.getClass();
                List<Point> list7 = listDecode;
                arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
                for (Point point : list7) {
                    arrayList2.add(new f8(point.latitude(), point.longitude()));
                }
            } catch (Exception e) {
                SaveHeatmapUrlImpl.serializer(strGeometry, e.getMessage());
                int i15 = MediaMetadataCompat + 63;
                MediaSessionCompatQueueItem = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                arrayList2 = null;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                h3 h3Var = (h3) saveHeatmapUrlImpl.serializer;
                String strConcat = "LAYER_TYPE_ROAD_".concat(j4.read());
                setLastHorizontalStyle setlasthorizontalstyle = h3Var.read;
                int iM776toArgb8_81llA = ColorKt.m776toArgb8_81llA(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer());
                g5 g5Var = g5.NEVER;
                ArrayList arrayList3 = arrayList2;
                return SQLite.read(new fg(strConcat, arrayList3, 10.0d, null, null, iM776toArgb8_81llA, g5Var, 440), new fg("LAYER_TYPE_ROAD_".concat(j4.read()), arrayList3, 4.0d, null, new fd(2.0d, 1.0d), ColorKt.m776toArgb8_81llA(setlasthorizontalstyle.IconCompatParcelizer().setOverflowReserved()), g5Var, 408));
            }
            if (arrayList2 == null) {
                return null;
            }
            int i17 = MediaSessionCompatQueueItem + 39;
            MediaMetadataCompat = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                if (!arrayList2.isEmpty()) {
                    return null;
                }
            } else if (!arrayList2.isEmpty()) {
                return null;
            }
            SaveHeatmapUrlImpl.serializer(strGeometry, null);
            return null;
        }
        if (m1externalsyntheticlambda7 instanceof m1ExternalSyntheticLambda28) {
            Timber.RemoteActionCompatParcelizer.write(new Exception("Secondary route fetch failed: " + ((m1ExternalSyntheticLambda28) m1externalsyntheticlambda7).read()));
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
        nexternalsyntheticlambda0 = new nExternalSyntheticLambda0(secondaryRouteApi, continuationImpl);
        objRequestRoutes = nexternalsyntheticlambda0.IconCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = nexternalsyntheticlambda0.write;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objRequestRoutes);
            FetchMapboxRouteUseCase fetchMapboxRouteUseCase3 = secondaryRouteApi.IconCompatParcelizer;
            getSimplefcGXIks getsimplefcgxiks3 = getunspecifiedrag3t2kannotations.read;
            List list8 = getunspecifiedrag3t2kannotations.serializer;
            getsimplefcgxiks3.getClass();
            list8.getClass();
            str = getsimplefcgxiks3.read();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "b"}, getCieXyz.write())).booleanValue()) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "w"}, getCieXyz.write())).booleanValue())) {
                    str2 = "walking";
                } else {
                    str2 = "driving-traffic";
                }
            } else {
                i5 = MediaMetadataCompat + 59;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i18 = 90 / 0;
                }
                str2 = "cycling";
            }
            RouteOptions.Builder builderSteps3 = RouteOptions.builder().profile(str2).excludeObject(lf.serializer(str2, getsimplefcgxiks3.RemoteActionCompatParcelizer(), getsimplefcgxiks3.write())).steps(Boolean.TRUE);
            List list9 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{Point.fromLngLat(getsimplefcgxiks3.serializer().IconCompatParcelizer, getsimplefcgxiks3.serializer().serializer)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            List<accessgetGocp> list10 = list8;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list10, 10));
            while (r1.hasNext()) {
                arrayList.add(Point.fromLngLat(accessgetgocp.IconCompatParcelizer, accessgetgocp.serializer));
                nexternalsyntheticlambda0 = nexternalsyntheticlambda0;
            }
            RouteOptions routeOptionsBuild3 = builderSteps3.coordinatesList(onContentCardDismissed.IconCompatParcelizer(arrayList, list9)).build();
            routeOptionsBuild3.getClass();
            nexternalsyntheticlambda0.write = 1;
            objRequestRoutes = fetchMapboxRouteUseCase3.requestRoutes(mapboxNavigation, routeOptionsBuild3, nexternalsyntheticlambda0);
            if (objRequestRoutes == coroutineSingletons) {
                i6 = MediaMetadataCompat + 97;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else if (i4 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objRequestRoutes);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m1externalsyntheticlambda7 = (m1ExternalSyntheticLambda7) objRequestRoutes;
        if (m1externalsyntheticlambda7 instanceof m1ExternalSyntheticLambda22) {
            i7 = MediaMetadataCompat + 5;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(((m1ExternalSyntheticLambda22) m1externalsyntheticlambda7).serializer());
                int i19 = 35 / 0;
                if (navigationRoute == null) {
                    return null;
                }
            } else {
                navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(((m1ExternalSyntheticLambda22) m1externalsyntheticlambda7).serializer());
                if (navigationRoute == null) {
                    return null;
                }
            }
            directionsRoute = navigationRoute.getDirectionsRoute();
            if (directionsRoute != null) {
                return null;
            }
            return null;
        }
        if (m1externalsyntheticlambda7 instanceof m1ExternalSyntheticLambda28) {
            Timber.RemoteActionCompatParcelizer.write(new Exception("Secondary route fetch failed: " + ((m1ExternalSyntheticLambda28) m1externalsyntheticlambda7).read()));
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
