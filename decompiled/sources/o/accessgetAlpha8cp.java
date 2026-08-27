package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.cardview.widget.CardView$1;
import androidx.work.impl.WorkerWrapper$launch$1;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.mapbox.common.LifecycleMonitorAndroid;
import com.mapbox.common.LifecycleMonitoringState;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import org.json.JSONObject;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessgetAlpha8cp implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ accessgetAlpha8cp(Object obj, Object obj2, Object obj3, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
        this.IconCompatParcelizer = obj3;
    }

    private final void write() {
        JSONObject jSONObjectOptJSONObject;
        requestFocusViewFocusFix requestfocusviewfocusfix = (requestFocusViewFocusFix) this.RemoteActionCompatParcelizer;
        String str = (String) this.serializer;
        setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui = (setPrimaryDirectionalMotionAxisOverrider2epLt8ui) this.IconCompatParcelizer;
        zzbv zzbvVar = requestfocusviewfocusfix.IconCompatParcelizer;
        logTree logtree = (logTree) ((AbstractComposeViewExternalSyntheticLambda0) zzbvVar.write).write();
        if (logtree == null) {
            return;
        }
        JSONObject jSONObject = setprimarydirectionalmotionaxisoverrider2eplt8ui.MediaMetadataCompat;
        if (jSONObject.length() < 1) {
            return;
        }
        JSONObject jSONObject2 = setprimarydirectionalmotionaxisoverrider2eplt8ui.write;
        if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (((Map) zzbvVar.RemoteActionCompatParcelizer)) {
                if (strOptString.equals(((Map) zzbvVar.RemoteActionCompatParcelizer).get(str))) {
                    return;
                }
                ((Map) zzbvVar.RemoteActionCompatParcelizer).put(str, strOptString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", jSONObject2.optString(str));
                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                logtree.serializer("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", strOptString);
                logtree.serializer("fp", "_fpc", bundle2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i2 = 0;
        boolean zBooleanValue = true;
        switch (this.write) {
            case 0:
                getDefaultShadowColor getdefaultshadowcolor = (getDefaultShadowColor) this.RemoteActionCompatParcelizer;
                onDrawBehind ondrawbehind = (onDrawBehind) this.serializer;
                androidx.work.impl.WorkerWrapper workerWrapper = (androidx.work.impl.WorkerWrapper) this.IconCompatParcelizer;
                getdefaultshadowcolor.getClass();
                try {
                    zBooleanValue = ((Boolean) ondrawbehind.serializer.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (getdefaultshadowcolor.MediaMetadataCompat) {
                    Object[] objArr = {workerWrapper.MediaSessionCompatQueueItem};
                    mapMKHz9U mapmkhz9u = (mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), objArr, MaybeObserveOn.write());
                    String str = mapmkhz9u.RemoteActionCompatParcelizer;
                    if (getdefaultshadowcolor.write(str) == workerWrapper) {
                        getdefaultshadowcolor.read(str);
                    }
                    setRotationX.read().getClass();
                    Iterator it = getdefaultshadowcolor.MediaDescriptionCompat.iterator();
                    while (it.hasNext()) {
                        ((rememberGraphicsLayer) it.next()).write(mapmkhz9u, zBooleanValue);
                    }
                    break;
                }
                return;
            case 1:
                accesssetHasRetrievedMethodcp accesssethasretrievedmethodcp = (accesssetHasRetrievedMethodcp) this.RemoteActionCompatParcelizer;
                DefaultContentCardsUpdateHandlerCompanionCREATOR1 defaultContentCardsUpdateHandlerCompanionCREATOR1 = (DefaultContentCardsUpdateHandlerCompanionCREATOR1) this.serializer;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.IconCompatParcelizer;
                try {
                    getDistanceSquaredimpl getdistancesquaredimplIconCompatParcelizer = coil3.util.UtilsKt.IconCompatParcelizer(accesssethasretrievedmethodcp.serializer);
                    if (getdistancesquaredimplIconCompatParcelizer == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    minusMKHz9U minusmkhz9u = (minusMKHz9U) getdistancesquaredimplIconCompatParcelizer.IconCompatParcelizer;
                    synchronized (minusmkhz9u.RemoteActionCompatParcelizer) {
                        minusmkhz9u.IconCompatParcelizer = threadPoolExecutor;
                        break;
                    }
                    getdistancesquaredimplIconCompatParcelizer.IconCompatParcelizer.write(new copydBAh8RU(defaultContentCardsUpdateHandlerCompanionCREATOR1, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    defaultContentCardsUpdateHandlerCompanionCREATOR1.write(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                truncslo4al4 truncslo4al4Var = (truncslo4al4) this.RemoteActionCompatParcelizer;
                SentryTracer$$ExternalSyntheticLambda1 sentryTracer$$ExternalSyntheticLambda1 = (SentryTracer$$ExternalSyntheticLambda1) this.serializer;
                Context context = (Context) this.IconCompatParcelizer;
                WebView.getWebViewClassLoader();
                if (getNegativeInfinityslo4al4.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
                    getNegativeZeroslo4al4.IconCompatParcelizer.write(truncslo4al4Var, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(i, sentryTracer$$ExternalSyntheticLambda1));
                    return;
                }
                if (truncslo4al4Var.read) {
                    WebSettings.getDefaultUserAgent(context.getApplicationContext());
                }
                new Handler(Looper.getMainLooper()).post(new Sentry$$ExternalSyntheticLambda5(4, sentryTracer$$ExternalSyntheticLambda1));
                return;
            case 3:
                CardView$1 cardView$1 = (CardView$1) this.RemoteActionCompatParcelizer;
                accessgetRgb565cp accessgetrgb565cp = (accessgetRgb565cp) this.serializer;
                final getDefaultShadowColor getdefaultshadowcolor2 = (getDefaultShadowColor) cardView$1.RemoteActionCompatParcelizer;
                getdefaultshadowcolor2.getClass();
                mapMKHz9U mapmkhz9u2 = accessgetrgb565cp.RemoteActionCompatParcelizer;
                final String str2 = mapmkhz9u2.RemoteActionCompatParcelizer;
                final ArrayList arrayList = new ArrayList();
                setFrom58bKbWc setfrom58bkbwc = (setFrom58bKbWc) getdefaultshadowcolor2.MediaBrowserCompatMediaItem.runInTransaction(new Callable() { // from class: o.accessgetArgb8888cp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        androidx.work.impl.WorkDatabase workDatabase = getdefaultshadowcolor2.MediaBrowserCompatMediaItem;
                        OutlineRectangle outlineRectangle = (OutlineRectangle) workDatabase.RatingCompat();
                        outlineRectangle.getClass();
                        String str3 = str2;
                        str3.getClass();
                        arrayList.addAll((List) TuplesKt.write(outlineRectangle.IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str3, 14)));
                        return ((translateimpldefault) workDatabase.MediaMetadataCompat()).write(str3);
                    }
                });
                if (setfrom58bkbwc == null) {
                    setRotationX.read().IconCompatParcelizer(getDefaultShadowColor.write, "Didn't find WorkSpec for id " + mapmkhz9u2);
                    getdefaultshadowcolor2.write(mapmkhz9u2);
                    return;
                }
                synchronized (getdefaultshadowcolor2.MediaMetadataCompat) {
                    try {
                        try {
                            synchronized (getdefaultshadowcolor2.MediaMetadataCompat) {
                                try {
                                    if (getdefaultshadowcolor2.write(str2) == null) {
                                        zBooleanValue = false;
                                    }
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                }
                            }
                            if (zBooleanValue) {
                                Set set = (Set) getdefaultshadowcolor2.MediaSessionCompatResultReceiverWrapper.get(str2);
                                if (((accessgetRgb565cp) set.iterator().next()).RemoteActionCompatParcelizer.serializer == mapmkhz9u2.serializer) {
                                    set.add(accessgetrgb565cp);
                                    setRotationX setrotationx = setRotationX.read();
                                    mapmkhz9u2.toString();
                                    setrotationx.getClass();
                                } else {
                                    getdefaultshadowcolor2.write(mapmkhz9u2);
                                }
                                return;
                            }
                            if (setfrom58bkbwc.MediaDescriptionCompat != mapmkhz9u2.serializer) {
                                getdefaultshadowcolor2.write(mapmkhz9u2);
                                return;
                            }
                            androidx.work.impl.WorkerWrapper workerWrapper2 = new androidx.work.impl.WorkerWrapper(new androidx.work.impl.WorkerWrapper.Builder(getdefaultshadowcolor2.IconCompatParcelizer, getdefaultshadowcolor2.RemoteActionCompatParcelizer, getdefaultshadowcolor2.PlaybackStateCompat, getdefaultshadowcolor2, getdefaultshadowcolor2.MediaBrowserCompatMediaItem, setfrom58bkbwc, arrayList));
                            onDrawBehind ondrawbehind2 = (onDrawBehind) BuildersKt.IconCompatParcelizer(775282581, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -775282577, new Object[]{workerWrapper2.PlaybackStateCompatCustomAction.serializer.plus(JobKt.RemoteActionCompatParcelizer()), new WorkerWrapper$launch$1(workerWrapper2, shortNewsContentCardView, i2)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
                            ondrawbehind2.serializer.RemoteActionCompatParcelizer(new accessgetAlpha8cp(getdefaultshadowcolor2, ondrawbehind2, workerWrapper2, i2), getdefaultshadowcolor2.PlaybackStateCompat.write);
                            getdefaultshadowcolor2.read.put(str2, workerWrapper2);
                            HashSet hashSet = new HashSet();
                            hashSet.add(accessgetrgb565cp);
                            getdefaultshadowcolor2.MediaSessionCompatResultReceiverWrapper.put(str2, hashSet);
                            setRotationX setrotationx2 = setRotationX.read();
                            mapmkhz9u2.toString();
                            setrotationx2.getClass();
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
            case 4:
                androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) this.RemoteActionCompatParcelizer;
                String str3 = (String) this.serializer;
                androidx.work.impl.WorkManagerImpl workManagerImpl = (androidx.work.impl.WorkManagerImpl) this.IconCompatParcelizer;
                translateimpldefault translateimpldefaultVar = (translateimpldefault) workDatabase.MediaMetadataCompat();
                translateimpldefaultVar.getClass();
                str3.getClass();
                Iterator it2 = ((List) TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str3, 11))).iterator();
                while (it2.hasNext()) {
                    LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 676120041, -676120040, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{workManagerImpl, (String) it2.next()});
                }
                return;
            case 5:
                CrashlyticsCore crashlyticsCore = (CrashlyticsCore) this.RemoteActionCompatParcelizer;
                String str4 = (String) this.serializer;
                String str5 = (String) this.IconCompatParcelizer;
                checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates = crashlyticsCore.RemoteActionCompatParcelizer;
                checkchildrenplaceorderforupdates.getClass();
                try {
                    ((r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) checkchildrenplaceorderforupdates.ComponentActivity.MediaBrowserCompatMediaItem).IconCompatParcelizer(str4, str5);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context2 = checkchildrenplaceorderforupdates.serializer;
                    if (context2 != null && (2 & context2.getApplicationInfo().flags) != 0) {
                        throw e;
                    }
                    SentryLogcatAdapter.read("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 6:
                ((SessionManager) this.RemoteActionCompatParcelizer).lambda$setApplicationContext$0((Context) this.serializer, (PerfSession) this.IconCompatParcelizer);
                return;
            case 7:
                ((GaugeManager) this.RemoteActionCompatParcelizer).lambda$stopCollectingGauges$3((String) this.serializer, (EnumC0151autofill) this.IconCompatParcelizer);
                return;
            case 8:
                moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8 = (moveFocusInChildrenViewFocusFix3ESFkO8) this.RemoteActionCompatParcelizer;
                TraceMetric traceMetric = (TraceMetric) this.serializer;
                EnumC0151autofill enumC0151autofill = (EnumC0151autofill) this.IconCompatParcelizer;
                getLastMatrixRecalculationAnimationTimeui getlastmatrixrecalculationanimationtimeuiNewBuilder = PerfMetric.newBuilder();
                getlastmatrixrecalculationanimationtimeuiNewBuilder.RemoteActionCompatParcelizer();
                ((PerfMetric) getlastmatrixrecalculationanimationtimeuiNewBuilder.RemoteActionCompatParcelizer).setTraceMetric(traceMetric);
                movefocusinchildrenviewfocusfix3esfko8.write(getlastmatrixrecalculationanimationtimeuiNewBuilder, enumC0151autofill);
                return;
            case 9:
                write();
                return;
            case 10:
                LifecycleMonitorAndroid.notifyObservers$lambda$3$lambda$1$lambda$0((Map.Entry) this.RemoteActionCompatParcelizer, (LifecycleMonitoringState) this.serializer, (String) this.IconCompatParcelizer);
                return;
            default:
                io.sentry.cache.MediaMetadataCompat mediaMetadataCompat = (io.sentry.cache.MediaMetadataCompat) this.RemoteActionCompatParcelizer;
                r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = (r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0) this.serializer;
                BannerView bannerView = (BannerView) this.IconCompatParcelizer;
                if (r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 != null) {
                    mediaMetadataCompat.write(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0, "trace.json");
                    return;
                }
                _get_messageWebView_lambda0 _get_messagewebview_lambda0 = bannerView.MediaSessionCompatResultReceiverWrapper;
                r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp1 = new r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0((io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) _get_messagewebview_lambda0.write, (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) _get_messagewebview_lambda0.RemoteActionCompatParcelizer, "default", null);
                r8lambdasv8cpfy2ryceslm1ayxpdavyzp1.RatingCompat = "auto";
                mediaMetadataCompat.write(r8lambdasv8cpfy2ryceslm1ayxpdavyzp1, "trace.json");
                return;
        }
    }
}
