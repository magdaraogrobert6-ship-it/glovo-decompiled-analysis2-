package com.roadrunner.map.integration.mapbox.route;

import android.location.Location;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzme;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import o.ShortNewsContentCardView;
import o.displayInAppMessagelambda1;
import o.getAllSemanticsNodesToMap;
import o.getCieXyz;
import o.getRearDisplayMetrics;
import o.getSimplefcGXIks;
import o.l2;
import o.l2ExternalSyntheticLambda7;
import o.l5;
import o.lExternalSyntheticLambda2;
import o.lf;
import o.lg;
import o.lh;
import o.m0;
import o.m1ExternalSyntheticLambda16;
import o.m1ExternalSyntheticLambda18;
import o.m1ExternalSyntheticLambda20;
import o.m1ExternalSyntheticLambda22;
import o.m1ExternalSyntheticLambda25;
import o.m1ExternalSyntheticLambda28;
import o.m3;
import o.ma;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchMapboxRouteUseCase {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final getRearDisplayMetrics serializer;
    public final getAllSemanticsNodesToMap write;

    public FetchMapboxRouteUseCase(getRearDisplayMetrics getreardisplaymetrics, ma maVar, getAllSemanticsNodesToMap getallsemanticsnodestomap, m3 m3Var) {
        this.serializer = getreardisplaymetrics;
        this.write = getallsemanticsnodestomap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public final Object requestRoutes(MapboxNavigation mapboxNavigation, RouteOptions routeOptions, ContinuationImpl continuationImpl) {
        m1ExternalSyntheticLambda16 m1externalsyntheticlambda16;
        String strIconCompatParcelizer;
        int i = 2 % 2;
        if (continuationImpl instanceof m1ExternalSyntheticLambda16) {
            int i2 = read + 51;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            m1externalsyntheticlambda16 = (m1ExternalSyntheticLambda16) continuationImpl;
            int i4 = m1externalsyntheticlambda16.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                m1externalsyntheticlambda16.serializer = i4 - Integer.MIN_VALUE;
            } else {
                m1externalsyntheticlambda16 = new m1ExternalSyntheticLambda16(this, continuationImpl);
            }
        } else {
            m1externalsyntheticlambda16 = new m1ExternalSyntheticLambda16(this, continuationImpl);
        }
        m1ExternalSyntheticLambda16 m1externalsyntheticlambda17 = m1externalsyntheticlambda16;
        Object objOfSuspend = m1externalsyntheticlambda17.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = m1externalsyntheticlambda17.serializer;
        if (i5 != 0) {
            int i6 = read + 3;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = read + 39;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.IconCompatParcelizer("FetchMapboxRouteUseCase requestRoutes", new Object[0]);
            String strProfile = routeOptions.profile();
            String strExclude = routeOptions.exclude();
            Boolean boolAlternatives = routeOptions.alternatives();
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("mapbox route request: profile=", strProfile, ", exclude=", strExclude, ", alternatives=");
            sbM.append(boolAlternatives);
            forest.IconCompatParcelizer(sbM.toString(), new Object[0]);
            TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, mapboxNavigation, routeOptions, null, 18);
            m1externalsyntheticlambda17.serializer = 1;
            objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) this.write).ofSuspend("tbt_mapNavigation_mapboxRequestRoutes", anonymousClass2, m1externalsyntheticlambda17);
            if (objOfSuspend == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        lExternalSyntheticLambda2 lexternalsyntheticlambda2 = (lExternalSyntheticLambda2) objOfSuspend;
        Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
        if (lexternalsyntheticlambda2 == null || (strIconCompatParcelizer = displayInAppMessagelambda1.serializer(lexternalsyntheticlambda2.getClass()).IconCompatParcelizer()) == null) {
            strIconCompatParcelizer = "timeout";
        }
        forest2.IconCompatParcelizer("FetchMapboxRouteUseCase requestRoutes done. Result: ".concat(strIconCompatParcelizer), new Object[0]);
        if (lexternalsyntheticlambda2 == null) {
            return new m1ExternalSyntheticLambda28(m1ExternalSyntheticLambda25.IconCompatParcelizer);
        }
        if (lexternalsyntheticlambda2 instanceof l5) {
            return new m1ExternalSyntheticLambda22(((l5) lexternalsyntheticlambda2).write());
        }
        if (lexternalsyntheticlambda2 instanceof l2) {
            return new m1ExternalSyntheticLambda28(new lg(onContentCardDismissed.IconCompatParcelizer(((l2) lexternalsyntheticlambda2).serializer(), null, null, null, new NafathLogger$$ExternalSyntheticLambda0(4), 31)));
        }
        if (lexternalsyntheticlambda2 instanceof l2ExternalSyntheticLambda7) {
            return new m1ExternalSyntheticLambda28(lh.RemoteActionCompatParcelizer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    /* JADX WARN: Code duplicated, block: B:50:0x018e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x019a  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final Object invoke(MapboxNavigation mapboxNavigation, getSimplefcGXIks getsimplefcgxiks, ContinuationImpl continuationImpl) {
        m0 m0Var;
        int i;
        int i2;
        int i3;
        Object objWithTimeout;
        Object obj;
        int i4;
        ShortNewsContentCardView shortNewsContentCardView;
        MapboxNavigation mapboxNavigation2;
        getSimplefcGXIks getsimplefcgxiks2;
        Location location;
        String str;
        String str2;
        Object objRequestRoutes;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = RemoteActionCompatParcelizer + 21;
        read = i8 % Fields.SpotShadowColor;
        try {
            if (i8 % 2 == 0) {
                if (continuationImpl instanceof m0) {
                    m0Var = (m0) continuationImpl;
                    i = m0Var.write;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        i2 = RemoteActionCompatParcelizer + 123;
                        read = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            i3 = i * Integer.MIN_VALUE;
                        } else {
                            i3 = i - Integer.MIN_VALUE;
                        }
                        m0Var.write = i3;
                    }
                }
                objWithTimeout = m0Var.RemoteActionCompatParcelizer;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = m0Var.write;
                shortNewsContentCardView = null;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FetchMapboxRouteUseCase getLastLocation", new Object[0]);
                    DividerUiModelImpl$1 dividerUiModelImpl$1 = new DividerUiModelImpl$1(this, shortNewsContentCardView, 29);
                    mapboxNavigation2 = mapboxNavigation;
                    m0Var.read = mapboxNavigation2;
                    getsimplefcgxiks2 = getsimplefcgxiks;
                    m0Var.serializer = getsimplefcgxiks2;
                    m0Var.write = 1;
                    objWithTimeout = TimeoutKt.withTimeout(ConstantsKt.DEFAULT_REQUEST_TIMEOUT, dividerUiModelImpl$1, m0Var);
                    if (objWithTimeout == obj) {
                    }
                    int i9 = read + 55;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return obj;
                }
                int i11 = RemoteActionCompatParcelizer + 95;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (i4 != 1) {
                    if (i4 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
                        return objWithTimeout;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                getSimplefcGXIks getsimplefcgxiks3 = m0Var.serializer;
                MapboxNavigation mapboxNavigation3 = m0Var.read;
                ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
                getsimplefcgxiks2 = getsimplefcgxiks3;
                mapboxNavigation2 = mapboxNavigation3;
                location = (Location) objWithTimeout;
                if (location == null) {
                    return new m1ExternalSyntheticLambda28(m1ExternalSyntheticLambda20.IconCompatParcelizer);
                }
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FetchMapboxRouteUseCase getLastLocation done", new Object[0]);
                getsimplefcgxiks2.getClass();
                str = getsimplefcgxiks2.read();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "b"}, getCieXyz.write())).booleanValue()) {
                    i6 = RemoteActionCompatParcelizer + 125;
                    read = i6 % Fields.SpotShadowColor;
                    str2 = "cycling";
                    if (i6 % 2 != 0) {
                        int i13 = 89 / 0;
                    }
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "w"}, getCieXyz.write())).booleanValue()) {
                        str2 = "walking";
                    } else {
                        str2 = "driving-traffic";
                    }
                }
                RouteOptions.Builder builder = RouteOptions.builder();
                builder.getClass();
                zzme.applyDefaultNavigationOptions(builder, str2);
                RouteOptions routeOptionsBuild = builder.excludeObject(lf.serializer(str2, getsimplefcgxiks2.RemoteActionCompatParcelizer(), getsimplefcgxiks2.write())).coordinatesList(SQLite.read(Point.fromLngLat(location.getLongitude(), location.getLatitude()), Point.fromLngLat(getsimplefcgxiks2.serializer().IconCompatParcelizer, getsimplefcgxiks2.serializer().serializer))).alternatives(Boolean.TRUE).language(Locale.getDefault().toLanguageTag()).voiceUnits("metric").build();
                routeOptionsBuild.getClass();
                m0Var.read = null;
                m0Var.serializer = null;
                m0Var.write = 2;
                objRequestRoutes = requestRoutes(mapboxNavigation2, routeOptionsBuild, m0Var);
                if (objRequestRoutes != obj) {
                    i5 = RemoteActionCompatParcelizer + 11;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        return objRequestRoutes;
                    }
                    throw null;
                }
                int i14 = read + 55;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return obj;
            }
            int i16 = 27 / 0;
            if (continuationImpl instanceof m0) {
                m0Var = (m0) continuationImpl;
                i = m0Var.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    i2 = RemoteActionCompatParcelizer + 123;
                    read = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        i3 = i * Integer.MIN_VALUE;
                    } else {
                        i3 = i - Integer.MIN_VALUE;
                    }
                    m0Var.write = i3;
                }
            }
            objWithTimeout = m0Var.RemoteActionCompatParcelizer;
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
            i4 = m0Var.write;
            shortNewsContentCardView = null;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FetchMapboxRouteUseCase getLastLocation", new Object[0]);
                DividerUiModelImpl$1 dividerUiModelImpl$2 = new DividerUiModelImpl$1(this, shortNewsContentCardView, 29);
                mapboxNavigation2 = mapboxNavigation;
                m0Var.read = mapboxNavigation2;
                getsimplefcgxiks2 = getsimplefcgxiks;
                m0Var.serializer = getsimplefcgxiks2;
                m0Var.write = 1;
                objWithTimeout = TimeoutKt.withTimeout(ConstantsKt.DEFAULT_REQUEST_TIMEOUT, dividerUiModelImpl$2, m0Var);
                if (objWithTimeout == obj) {
                }
                int i17 = read + 55;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                return obj;
            }
            int i19 = RemoteActionCompatParcelizer + 95;
            read = i19 % Fields.SpotShadowColor;
            int i110 = i19 % 2;
            if (i4 != 1) {
                if (i4 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
                    return objWithTimeout;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            getSimplefcGXIks getsimplefcgxiks4 = m0Var.serializer;
            MapboxNavigation mapboxNavigation4 = m0Var.read;
            ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
            getsimplefcgxiks2 = getsimplefcgxiks4;
            mapboxNavigation2 = mapboxNavigation4;
            location = (Location) objWithTimeout;
            if (location == null) {
                return new m1ExternalSyntheticLambda28(m1ExternalSyntheticLambda20.IconCompatParcelizer);
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FetchMapboxRouteUseCase getLastLocation done", new Object[0]);
            getsimplefcgxiks2.getClass();
            str = getsimplefcgxiks2.read();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "b"}, getCieXyz.write())).booleanValue()) {
                i6 = RemoteActionCompatParcelizer + 125;
                read = i6 % Fields.SpotShadowColor;
                str2 = "cycling";
                if (i6 % 2 != 0) {
                    int i111 = 89 / 0;
                }
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "w"}, getCieXyz.write())).booleanValue()) {
                    str2 = "walking";
                } else {
                    str2 = "driving-traffic";
                }
            }
            RouteOptions.Builder builder2 = RouteOptions.builder();
            builder2.getClass();
            zzme.applyDefaultNavigationOptions(builder2, str2);
            RouteOptions routeOptionsBuild2 = builder2.excludeObject(lf.serializer(str2, getsimplefcgxiks2.RemoteActionCompatParcelizer(), getsimplefcgxiks2.write())).coordinatesList(SQLite.read(Point.fromLngLat(location.getLongitude(), location.getLatitude()), Point.fromLngLat(getsimplefcgxiks2.serializer().IconCompatParcelizer, getsimplefcgxiks2.serializer().serializer))).alternatives(Boolean.TRUE).language(Locale.getDefault().toLanguageTag()).voiceUnits("metric").build();
            routeOptionsBuild2.getClass();
            m0Var.read = null;
            m0Var.serializer = null;
            m0Var.write = 2;
            objRequestRoutes = requestRoutes(mapboxNavigation2, routeOptionsBuild2, m0Var);
            if (objRequestRoutes != obj) {
                i5 = RemoteActionCompatParcelizer + 11;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return objRequestRoutes;
                }
                throw null;
            }
            int i112 = read + 55;
            RemoteActionCompatParcelizer = i112 % Fields.SpotShadowColor;
            int i113 = i112 % 2;
            return obj;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FetchMapboxRouteUseCase getLastLocation", new Object[0]);
                DividerUiModelImpl$1 dividerUiModelImpl$3 = new DividerUiModelImpl$1(this, shortNewsContentCardView, 29);
                mapboxNavigation2 = mapboxNavigation;
                m0Var.read = mapboxNavigation2;
                getsimplefcgxiks2 = getsimplefcgxiks;
                m0Var.serializer = getsimplefcgxiks2;
                m0Var.write = 1;
                objWithTimeout = TimeoutKt.withTimeout(ConstantsKt.DEFAULT_REQUEST_TIMEOUT, dividerUiModelImpl$3, m0Var);
                if (objWithTimeout == obj) {
                }
                int i114 = read + 55;
                RemoteActionCompatParcelizer = i114 % Fields.SpotShadowColor;
                int i115 = i114 % 2;
                return obj;
            }
            int i116 = RemoteActionCompatParcelizer + 95;
            read = i116 % Fields.SpotShadowColor;
            int i117 = i116 % 2;
            if (i4 != 1) {
                if (i4 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
                    return objWithTimeout;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            getSimplefcGXIks getsimplefcgxiks5 = m0Var.serializer;
            MapboxNavigation mapboxNavigation5 = m0Var.read;
            ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
            getsimplefcgxiks2 = getsimplefcgxiks5;
            mapboxNavigation2 = mapboxNavigation5;
            location = (Location) objWithTimeout;
            if (location == null) {
                return new m1ExternalSyntheticLambda28(m1ExternalSyntheticLambda20.IconCompatParcelizer);
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FetchMapboxRouteUseCase getLastLocation done", new Object[0]);
            getsimplefcgxiks2.getClass();
            str = getsimplefcgxiks2.read();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "b"}, getCieXyz.write())).booleanValue()) {
                i6 = RemoteActionCompatParcelizer + 125;
                read = i6 % Fields.SpotShadowColor;
                str2 = "cycling";
                if (i6 % 2 != 0) {
                    int i118 = 89 / 0;
                }
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "w"}, getCieXyz.write())).booleanValue()) {
                    str2 = "walking";
                } else {
                    str2 = "driving-traffic";
                }
            }
            RouteOptions.Builder builder3 = RouteOptions.builder();
            builder3.getClass();
            zzme.applyDefaultNavigationOptions(builder3, str2);
            RouteOptions routeOptionsBuild3 = builder3.excludeObject(lf.serializer(str2, getsimplefcgxiks2.RemoteActionCompatParcelizer(), getsimplefcgxiks2.write())).coordinatesList(SQLite.read(Point.fromLngLat(location.getLongitude(), location.getLatitude()), Point.fromLngLat(getsimplefcgxiks2.serializer().IconCompatParcelizer, getsimplefcgxiks2.serializer().serializer))).alternatives(Boolean.TRUE).language(Locale.getDefault().toLanguageTag()).voiceUnits("metric").build();
            routeOptionsBuild3.getClass();
            m0Var.read = null;
            m0Var.serializer = null;
            m0Var.write = 2;
            objRequestRoutes = requestRoutes(mapboxNavigation2, routeOptionsBuild3, m0Var);
            if (objRequestRoutes != obj) {
                i5 = RemoteActionCompatParcelizer + 11;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return objRequestRoutes;
                }
                throw null;
            }
            int i119 = read + 55;
            RemoteActionCompatParcelizer = i119 % Fields.SpotShadowColor;
            int i1110 = i119 % 2;
            return obj;
        } catch (TimeoutCancellationException unused) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FetchMapboxRouteUseCase failed: getLastLocation timed out", new Object[0]);
            return new m1ExternalSyntheticLambda28(m1ExternalSyntheticLambda18.read);
        }
        m0Var = new m0(this, continuationImpl);
        objWithTimeout = m0Var.RemoteActionCompatParcelizer;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = m0Var.write;
        shortNewsContentCardView = null;
    }
}
