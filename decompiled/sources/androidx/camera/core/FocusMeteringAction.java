package androidx.camera.core;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.google.android.gms.internal.mlkit_vision_face.zzmk;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.route.RouteRefreshMetadata;
import com.mapbox.navigation.core.internal.RouteProgressData;
import com.mapbox.navigation.core.routerefresh.ExpiringDataRemover$removeExpiringDataFromRoute$1;
import com.mapbox.navigation.core.routerefresh.ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1;
import com.mapbox.navigation.core.routerefresh.RouteRefresherResult;
import com.mapbox.navigation.core.routerefresh.RoutesRefresherResult;
import com.roadrunner.domain.util.IsFixableByRetry;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.LayoutNodeSubcompositionsStatecreateMeasurePolicy1;
import o.LookaheadScopeKtLookaheadScope221;
import o._get_messageWebView_lambda1;
import o.accessgetInstancedelegatecp;
import o.clipCanvasToPath;
import o.getLookaheadDelegate;
import o.getMessageTextView;
import o.getTvSatelliteBsEK5gGoQ;
import o.getTvSatelliteServiceEK5gGoQ;
import o.getTvTerrestrialDigitalEK5gGoQ;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.registerOnGlobalLayoutListener;
import o.setContent;
import o.setInAppMessageImageViewAttributes;
import o.setLayoutResource;
import o.setMessageImageView;

/* JADX INFO: loaded from: classes.dex */
public final class FocusMeteringAction implements setMessageImageView {
    public Object IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final Object serializer;
    public Object write;

    public FocusMeteringAction(FocusMeteringAction focusMeteringAction) {
        this.read = 0;
        this.IconCompatParcelizer = Collections.unmodifiableList((ArrayList) focusMeteringAction.IconCompatParcelizer);
        this.write = Collections.unmodifiableList((ArrayList) focusMeteringAction.write);
        this.serializer = Collections.unmodifiableList((ArrayList) focusMeteringAction.serializer);
        this.RemoteActionCompatParcelizer = focusMeteringAction.RemoteActionCompatParcelizer;
    }

    @Override // o.setMessageImageView
    public void onFailure(getMessageTextView getmessagetextview, IOException iOException) {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = (NetworkRequestMetricBuilder) this.write;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = ((clipCanvasToPath) getmessagetextview).originalRequest;
        if (r8lambday113fdftsr5e4pzj6xssxltpl60 != null) {
            setInAppMessageImageViewAttributes setinappmessageimageviewattributes = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
            if (setinappmessageimageviewattributes != null) {
                networkRequestMetricBuilder.RemoteActionCompatParcelizer(setinappmessageimageviewattributes.MediaMetadataCompat().toString());
            }
            String str = r8lambday113fdftsr5e4pzj6xssxltpl60.method;
            if (str != null) {
                networkRequestMetricBuilder.serializer(str);
            }
        }
        networkRequestMetricBuilder.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        af$$ExternalSyntheticOutline1.m((Timer) this.serializer, networkRequestMetricBuilder, networkRequestMetricBuilder);
        ((setMessageImageView) this.IconCompatParcelizer).onFailure(getmessagetextview, iOException);
    }

    @Override // o.setMessageImageView
    public void onResponse(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        FirebasePerfOkHttpClient.write(_get_messagewebview_lambda1, (NetworkRequestMetricBuilder) this.write, this.RemoteActionCompatParcelizer, ((Timer) this.serializer).read());
        ((setMessageImageView) this.IconCompatParcelizer).onResponse(getmessagetextview, _get_messagewebview_lambda1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRoutesRefreshed(RoutesRefresherResult routesRefresherResult) {
        ExpiringDataRemover$removeExpiringDataFromRoute$1 expiringDataRemover$removeExpiringDataFromRoute$1 = ExpiringDataRemover$removeExpiringDataFromRoute$1.INSTANCE;
        Vw$Vw vw$Vw = (Vw$Vw) this.write;
        routesRefresherResult.getClass();
        RouteRefresherResult routeRefresherResult = routesRefresherResult.primaryRouteRefresherResult;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (routesRefresherResult.anySuccess()) {
            this.RemoteActionCompatParcelizer = jElapsedRealtime;
            vw$Vw.onRoutesRefreshed(routesRefresherResult);
            return;
        }
        if (jElapsedRealtime >= this.RemoteActionCompatParcelizer + 900000) {
            this.RemoteActionCompatParcelizer = jElapsedRealtime;
            IsFixableByRetry isFixableByRetry = (IsFixableByRetry) this.serializer;
            NavigationRoute navigationRoute = routeRefresherResult.route;
            boolean z = false;
            NavigationRoute navigationRouteUpdate$default = zzmk.update$default(navigationRoute, new ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1(navigationRoute.directionsRoute.legs(), ((RouteProgressData) routeRefresherResult.routeProgressData).legIndex, isFixableByRetry), expiringDataRemover$removeExpiringDataFromRoute$1, null, new RouteRefreshMetadata(null, false), 4);
            ArrayList<RouteRefresherResult> arrayList = routesRefresherResult.alternativesRouteRefresherResults;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            for (RouteRefresherResult routeRefresherResult2 : arrayList) {
                NavigationRoute navigationRoute2 = routeRefresherResult2.route;
                RouteProgressData routeProgressData = (RouteProgressData) routeRefresherResult2.routeProgressData;
                arrayList2.add(RouteRefresherResult.copy$default(routeRefresherResult2, zzmk.update$default(navigationRoute2, new ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1(navigationRoute2.directionsRoute.legs(), routeProgressData != null ? routeProgressData.legIndex : z, isFixableByRetry), expiringDataRemover$removeExpiringDataFromRoute$1, null, new RouteRefreshMetadata(null, z), 4)));
                z = false;
            }
            RoutesRefresherResult routesRefresherResult2 = new RoutesRefresherResult(RouteRefresherResult.copy$default(routeRefresherResult, navigationRouteUpdate$default), arrayList2);
            ((x) this.IconCompatParcelizer).onNewState("CLEARED_EXPIRED", null);
            if (routesRefresherResult.equals(routesRefresherResult2)) {
                return;
            }
            vw$Vw.onRoutesRefreshed(routesRefresherResult2);
        }
    }

    public String toString() {
        if (this.read != 2) {
            return super.toString();
        }
        String str = (String) this.write;
        String string = ((Bundle) this.serializer).toString();
        int length = String.valueOf(str).length();
        String str2 = (String) this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        c8$$ExternalSyntheticOutline0.m(sb, "origin=", str, ",name=", str2);
        return ff$$ExternalSyntheticOutline0.m(sb, ",params=", string);
    }

    public zzbg RemoteActionCompatParcelizer() {
        return new zzbg((String) this.IconCompatParcelizer, new zzbe(new Bundle((Bundle) this.serializer)), (String) this.write, this.RemoteActionCompatParcelizer);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    public getTvTerrestrialDigitalEK5gGoQ serializer(getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq, String str) throws Throwable {
        ?? r6;
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strIconCompatParcelizer = gettvterrestrialdigitalek5ggoq.IconCompatParcelizer();
        List listSerializer = gettvterrestrialdigitalek5ggoq.serializer();
        registerOnGlobalLayoutListener registerongloballayoutlistener = (registerOnGlobalLayoutListener) this.serializer;
        zzpg zzpgVar = registerongloballayoutlistener.MediaSessionCompatToken;
        zzpg zzpgVar2 = registerongloballayoutlistener.MediaSessionCompatToken;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) registerongloballayoutlistener.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        zzpgVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoqWrite = zzgz.write(gettvterrestrialdigitalek5ggoq, "_eid");
        Long l = (Long) (gettvsatelliteserviceek5ggoqWrite == null ? null : zzgz.RemoteActionCompatParcelizer(gettvsatelliteserviceek5ggoqWrite));
        if (l != null) {
            ?? Equals = strIconCompatParcelizer.equals("_ep");
            if (Equals != 0) {
                zzpgVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoqWrite2 = zzgz.write(gettvterrestrialdigitalek5ggoq, "_en");
                String str2 = (String) (gettvsatelliteserviceek5ggoqWrite2 == null ? null : zzgz.RemoteActionCompatParcelizer(gettvsatelliteserviceek5ggoqWrite2));
                if (TextUtils.isEmpty(str2)) {
                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.write.serializer(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((getTvTerrestrialDigitalEK5gGoQ) this.IconCompatParcelizer) == null || ((Long) this.write) == null || l.longValue() != ((Long) this.write).longValue()) {
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken();
                    layoutNodeSubcompositionsStatecreateMeasurePolicy1.ComponentActivity();
                    try {
                        try {
                            cursorRawQuery = layoutNodeSubcompositionsStatecreateMeasurePolicy1.ResultReceiver().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (!cursorRawQuery.moveToFirst()) {
                                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                    getlookaheaddelegate2.PlaybackStateCompat.RemoteActionCompatParcelizer("Main event not found");
                                    cursorRawQuery.close();
                                    pairCreate = null;
                                } else {
                                    try {
                                        pairCreate = Pair.create((getTvTerrestrialDigitalEK5gGoQ) ((getTvSatelliteBsEK5gGoQ) zzgz.write(getTvTerrestrialDigitalEK5gGoQ.read(), cursorRawQuery.getBlob(0))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e) {
                                        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                        getlookaheaddelegate3.serializer.IconCompatParcelizer("Failed to merge main event. appId, eventId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), l, e);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                getlookaheaddelegate4.serializer.serializer(e, "Error selecting main event");
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                pairCreate = null;
                                if (pairCreate == null) {
                                }
                                getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                                getlookaheaddelegate5.write.serializer("Extra parameter without existing main event. eventName, eventId", str2, l);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r6 = Equals;
                            if (r6 != 0) {
                                r6.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r6 = 0;
                        if (r6 != 0) {
                            r6.close();
                        }
                        throw th;
                    }
                    if (pairCreate == null && (obj = pairCreate.first) != null) {
                        this.IconCompatParcelizer = (getTvTerrestrialDigitalEK5gGoQ) obj;
                        this.RemoteActionCompatParcelizer = ((Long) pairCreate.second).longValue();
                        zzpgVar2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                        this.write = (Long) zzgz.read((getTvTerrestrialDigitalEK5gGoQ) this.IconCompatParcelizer, "_eid");
                    } else {
                        getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                        getlookaheaddelegate6.write.serializer("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                }
                long j = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = j;
                if (j <= 0) {
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy2 = zzpgVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy2);
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    layoutNodeSubcompositionsStatecreateMeasurePolicy2.MediaSessionCompatToken();
                    getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                    getlookaheaddelegate7.PlaybackStateCompat.serializer(str, "Clearing complex main event info. appId");
                    try {
                        layoutNodeSubcompositionsStatecreateMeasurePolicy2.ResultReceiver().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        getLookaheadDelegate getlookaheaddelegate8 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate8);
                        getlookaheaddelegate8.serializer.serializer(e4, "Error clearing complex main event");
                    }
                } else {
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy3 = zzpgVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy3);
                    layoutNodeSubcompositionsStatecreateMeasurePolicy3.serializer(str, l, this.RemoteActionCompatParcelizer, (getTvTerrestrialDigitalEK5gGoQ) this.IconCompatParcelizer);
                }
                ArrayList arrayList = new ArrayList();
                for (getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq : ((getTvTerrestrialDigitalEK5gGoQ) this.IconCompatParcelizer).serializer()) {
                    zzpgVar2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    if (zzgz.write(gettvterrestrialdigitalek5ggoq, gettvsatelliteserviceek5ggoq.read()) == null) {
                        arrayList.add(gettvsatelliteserviceek5ggoq);
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.addAll(listSerializer);
                    listSerializer = arrayList;
                } else {
                    getLookaheadDelegate getlookaheaddelegate9 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate9);
                    getlookaheaddelegate9.write.serializer(str2, "No unique parameters in main event. eventName");
                }
                strIconCompatParcelizer = str2;
            } else {
                this.write = l;
                this.IconCompatParcelizer = gettvterrestrialdigitalek5ggoq;
                zzpgVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoqWrite3 = zzgz.write(gettvterrestrialdigitalek5ggoq, "_epc");
                Serializable serializableRemoteActionCompatParcelizer = gettvsatelliteserviceek5ggoqWrite3 == null ? null : zzgz.RemoteActionCompatParcelizer(gettvsatelliteserviceek5ggoqWrite3);
                long jLongValue = ((Long) (serializableRemoteActionCompatParcelizer != null ? serializableRemoteActionCompatParcelizer : 0L)).longValue();
                this.RemoteActionCompatParcelizer = jLongValue;
                if (jLongValue <= 0) {
                    getLookaheadDelegate getlookaheaddelegate10 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate10);
                    getlookaheaddelegate10.write.serializer(strIconCompatParcelizer, "Complex event with zero extra param count. eventName");
                } else {
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy4 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy4);
                    layoutNodeSubcompositionsStatecreateMeasurePolicy4.serializer(str, l, this.RemoteActionCompatParcelizer, gettvterrestrialdigitalek5ggoq);
                }
            }
        }
        getTvSatelliteBsEK5gGoQ gettvsatellitebsek5ggoq = (getTvSatelliteBsEK5gGoQ) gettvterrestrialdigitalek5ggoq.getOnBackPressedDispatcherannotations();
        gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
        ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).IconCompatParcelizer(strIconCompatParcelizer);
        gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
        ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).PlaybackStateCompatCustomAction();
        gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
        ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).write(listSerializer);
        return (getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
    }

    public void IconCompatParcelizer(setLayoutResource setlayoutresource, int i) {
        UtilsKt.IconCompatParcelizer("Invalid metering mode " + i, i >= 1 && i <= 7);
        if ((i & 1) != 0) {
            ((ArrayList) this.IconCompatParcelizer).add(setlayoutresource);
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.write).add(setlayoutresource);
        }
    }

    public /* synthetic */ FocusMeteringAction(setContent setcontent) {
        this.read = 3;
        this.serializer = setcontent;
    }

    public FocusMeteringAction(x xVar, Vw$Vw vw$Vw, IsFixableByRetry isFixableByRetry) {
        this.read = 5;
        this.IconCompatParcelizer = xVar;
        this.write = vw$Vw;
        this.serializer = isFixableByRetry;
    }

    public FocusMeteringAction(setMessageImageView setmessageimageview, moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8, Timer timer, long j) {
        this.read = 4;
        this.IconCompatParcelizer = setmessageimageview;
        this.write = new NetworkRequestMetricBuilder(movefocusinchildrenviewfocusfix3esfko8);
        this.RemoteActionCompatParcelizer = j;
        this.serializer = timer;
    }

    public FocusMeteringAction(long j, Bundle bundle, String str, String str2) {
        this.read = 2;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.serializer = bundle;
        this.RemoteActionCompatParcelizer = j;
    }

    public FocusMeteringAction(setLayoutResource setlayoutresource) {
        this.read = 1;
        this.IconCompatParcelizer = new ArrayList();
        this.write = new ArrayList();
        this.serializer = new ArrayList();
        this.RemoteActionCompatParcelizer = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        IconCompatParcelizer(setlayoutresource, 1);
    }

    public static FocusMeteringAction IconCompatParcelizer(zzbg zzbgVar) {
        String str = zzbgVar.IconCompatParcelizer;
        String str2 = zzbgVar.write;
        return new FocusMeteringAction(zzbgVar.serializer, zzbgVar.read.write(), str, str2);
    }
}
