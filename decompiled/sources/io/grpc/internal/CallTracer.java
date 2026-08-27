package io.grpc.internal;

import android.app.Application;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.telephony.TelephonyManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$createConnectionManager$3;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpc;
import com.google.android.play.core.appupdate.zzz;
import com.incognia.internal.xr$$ExternalSyntheticLambda1;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationPluginImpl;
import com.mapbox.maps.plugin.annotation.AnnotationSourceOptions;
import com.mapbox.maps.plugin.annotation.ClusterOptions;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import com.roadrunner.nafath.data.VerificationStatusRepository;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.startworking.data.StartWorkingRepository;
import com.roadrunner.startworking.oneclick.domain.FetchOneClickStartWorkingComponents$invoke$1;
import io.grpc.Status;
import io.sentry.JsonObjectSerializer;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import io.sentry.SentryOptions;
import io.sentry.util.RemoteActionCompatParcelizer;
import java.time.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.BannerViewCompanion;
import o.BannerViewExternalSyntheticLambda3;
import o.BrazeActionUtilsWhenMappings;
import o.BrazeExternalSyntheticLambda102;
import o.BrazeExternalSyntheticLambda206;
import o.ImageHeaderParserImageType;
import o.LayoutCompat;
import o.RecyclerViewViewHolder;
import o.ShortNewsContentCardView;
import o.TextMotion;
import o.UriActionExternalSyntheticLambda4;
import o.WebContentUtils;
import o.addChangePayload;
import o.backgroundTimerFiredI;
import o.buildEventPackage;
import o.buildMapping;
import o.clearOldPosition;
import o.createFromParcel;
import o.decode;
import o.dismissBannerlambda1;
import o.enableSdk;
import o.f7;
import o.f8ExternalSyntheticLambda2;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getFeatureFlaglambda0;
import o.getIterationDuration;
import o.getQueryParameterslambda2;
import o.getRestLineXSAIIZE;
import o.h2ExternalSyntheticLambda8;
import o.h3;
import o.hasTooManyZipEntrieslambda0;
import o.inCompatibilityMode;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.jc;
import o.lambda39;
import o.lambdaverifyPlayStorePurchase45;
import o.logPurchaseWithJSONlambda0;
import o.logPushDeliverylambda1;
import o.metaMarkUpdatedAndHasCallbacks;
import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.publishErrorlambda1;
import o.qExternalSyntheticLambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.removeNodeAtDepth;
import o.requestBannersRefreshlambda1;
import o.requestGeofencesInitializationlambda1;
import o.setCarryoverInAppMessage;
import o.setLastHorizontalStyle;
import o.setLayoutState;
import o.setTransacterruntime;
import o.setUseTempTrackingTableroom_runtime;
import o.subscribeToNetworkFailureslambda0;
import o.transferSessionPackageI;
import o.unpackZipIntoDirectory;
import o.updateAdidI;
import o.vd;
import o.wouldPushPermissionPromptDisplaylambda1;
import o.wouldPushPermissionPromptDisplaylambda3;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class CallTracer implements getRestLineXSAIIZE, qExternalSyntheticLambda1, BrazeActionUtilsWhenMappings {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public Object serializer;
    public Object write;

    public void serializer(Status status) {
        synchronized (this.RemoteActionCompatParcelizer) {
            if (((Status) this.serializer) != null) {
                return;
            }
            this.serializer = status;
            boolean zIsEmpty = ((HashSet) this.write).isEmpty();
            if (zIsEmpty) {
                ((hasTooManyZipEntrieslambda0) this.IconCompatParcelizer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer(status);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00da  */
    public CallTracer(transferSessionPackageI transfersessionpackagei, setLayoutState setlayoutstate, AnnotationPluginImpl annotationPluginImpl, RoomDatabase$createConnectionManager$3 roomDatabase$createConnectionManager$3, h3 h3Var) {
        f8ExternalSyntheticLambda2 f8externalsyntheticlambda2;
        String str;
        this.RemoteActionCompatParcelizer = roomDatabase$createConnectionManager$3;
        this.write = h3Var;
        PointAnnotationManager pointAnnotationManagerCreatePointAnnotationManager = RangesKt.createPointAnnotationManager(annotationPluginImpl, new AnnotationConfig("annotation-layer", null, 29));
        pointAnnotationManagerCreatePointAnnotationManager.clickListeners.add(new jc(this));
        this.serializer = pointAnnotationManagerCreatePointAnnotationManager;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null) {
            int i = 2 % 2;
        } else {
            boolean zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_MAP_CLUSTERING_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl);
            int i2 = 2 % 2;
            if (zM) {
                r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U entries = f7.getEntries();
                ArrayList<f7> arrayList = new ArrayList();
                for (Object obj : entries) {
                    int i3 = read + 85;
                    MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    if (((f7) obj) != f7.NONE) {
                        arrayList.add(obj);
                    }
                }
                for (f7 f7Var : arrayList) {
                    int i5 = MediaDescriptionCompat + 37;
                    read = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    h3 h3Var2 = (h3) this.write;
                    f7Var.getClass();
                    buildMapping buildmappingIconCompatParcelizer = h3Var2.read.IconCompatParcelizer();
                    int i7 = h2ExternalSyntheticLambda8.read[f7Var.ordinal()];
                    if (i7 != 1) {
                        int i8 = MediaDescriptionCompat + 59;
                        read = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 == 0 ? i7 == 2 : i7 == 4) {
                            f8externalsyntheticlambda2 = new f8ExternalSyntheticLambda2(ColorKt.m776toArgb8_81llA(buildmappingIconCompatParcelizer.setPresenter()), ColorKt.m776toArgb8_81llA(buildmappingIconCompatParcelizer.getPopupTheme()));
                        } else if (i7 == 3) {
                            f8externalsyntheticlambda2 = new f8ExternalSyntheticLambda2(ColorKt.m776toArgb8_81llA(buildmappingIconCompatParcelizer.setPresenter()), ColorKt.m776toArgb8_81llA(buildmappingIconCompatParcelizer.getPopupTheme()));
                        } else {
                            if (i7 != 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                throw null;
                            }
                            f8externalsyntheticlambda2 = new f8ExternalSyntheticLambda2(ColorKt.m776toArgb8_81llA(buildmappingIconCompatParcelizer.getPopupTheme()), ColorKt.m776toArgb8_81llA(buildmappingIconCompatParcelizer.setPresenter()));
                            int i9 = 2 % 2;
                        }
                    } else {
                        f8externalsyntheticlambda2 = new f8ExternalSyntheticLambda2(ColorKt.m776toArgb8_81llA(buildmappingIconCompatParcelizer.setPresenter()), ColorKt.m776toArgb8_81llA(buildmappingIconCompatParcelizer.getPopupTheme()));
                    }
                    if (f7Var == f7.THREE) {
                        str = "shadow-";
                    } else {
                        int i10 = 2 % 2;
                        str = "";
                    }
                    PointAnnotationManager pointAnnotationManagerCreatePointAnnotationManager2 = RangesKt.createPointAnnotationManager(annotationPluginImpl, new AnnotationConfig("cluster-annotation-layer-id-" + str + setlayoutstate.RemoteActionCompatParcelizer.incrementAndGet(), new AnnotationSourceOptions(new ClusterOptions(f8externalsyntheticlambda2.read, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new onViewAttachedToWindowlambda0(0, Integer.valueOf(f8externalsyntheticlambda2.IconCompatParcelizer))}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()))), 21));
                    pointAnnotationManagerCreatePointAnnotationManager2.clickListeners.add(new jc(this));
                    linkedHashMap.put(f7Var, pointAnnotationManagerCreatePointAnnotationManager2);
                    int i11 = MediaDescriptionCompat + 113;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    int i13 = 2 % 2;
                }
                f7 f7Var2 = f7.NONE;
                PointAnnotationManager pointAnnotationManagerCreatePointAnnotationManager3 = RangesKt.createPointAnnotationManager(annotationPluginImpl, new AnnotationConfig(c8$$ExternalSyntheticOutline0.m(setlayoutstate.serializer.incrementAndGet(), "non-cluster-annotation-layer-id-"), null, 29));
                pointAnnotationManagerCreatePointAnnotationManager3.clickListeners.add(new jc(this));
                linkedHashMap.put(f7Var2, pointAnnotationManagerCreatePointAnnotationManager3);
            }
        }
        this.IconCompatParcelizer = linkedHashMap;
    }

    @Override // o.BrazeActionUtilsWhenMappings
    public Future IconCompatParcelizer(Runnable runnable, long j) {
        int i = 2 % 2;
        int i2 = read + 43;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ScheduledFuture<?> scheduledFutureSchedule = ((ScheduledThreadPoolExecutor) this.RemoteActionCompatParcelizer).schedule(runnable, j, TimeUnit.MILLISECONDS);
        int i4 = MediaDescriptionCompat + 55;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return scheduledFutureSchedule;
    }

    public VerificationStatusLifecycleObserverImpl serializer(AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        VerificationStatusLifecycleObserverImpl verificationStatusLifecycleObserverImpl = new VerificationStatusLifecycleObserverImpl((TextMotion) this.RemoteActionCompatParcelizer, (ImageHeaderParserImageType) this.write, (GetRiderStatusImpl) this.serializer, appCompatActivity, (RouterLogger) this.IconCompatParcelizer);
        int i2 = MediaDescriptionCompat + 99;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return verificationStatusLifecycleObserverImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.BrazeActionUtilsWhenMappings
    public boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 53;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = ((RemoteActionCompatParcelizer) this.write).serializer();
        try {
            boolean zIsShutdown = ((ScheduledThreadPoolExecutor) this.RemoteActionCompatParcelizer).isShutdown();
            uriActionExternalSyntheticLambda4Serializer.close();
            int i4 = read + 117;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 37 / 0;
            }
            return zIsShutdown;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.BrazeActionUtilsWhenMappings
    public void serializer() {
        int i = 2 % 2;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.RemoteActionCompatParcelizer;
        try {
            scheduledThreadPoolExecutor.submit(new Sentry$$ExternalSyntheticLambda5(16, this));
        } catch (RejectedExecutionException e) {
            SentryOptions sentryOptions = (SentryOptions) this.IconCompatParcelizer;
            if (sentryOptions != null) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Prewarm task rejected from " + scheduledThreadPoolExecutor, e);
                int i2 = read + 53;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
        }
    }

    @Override // o.BrazeActionUtilsWhenMappings
    public void RemoteActionCompatParcelizer(long j) {
        int i = 2 % 2;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.RemoteActionCompatParcelizer;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = ((RemoteActionCompatParcelizer) this.write).serializer();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                int i2 = MediaDescriptionCompat + 69;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            uriActionExternalSyntheticLambda4Serializer.close();
            int i4 = read + 11;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.BrazeActionUtilsWhenMappings
    public Future RemoteActionCompatParcelizer(Runnable runnable) {
        int i = 2 % 2;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.RemoteActionCompatParcelizer;
        if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
            int i2 = read + 47;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            scheduledThreadPoolExecutor.purge();
        }
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        SentryOptions sentryOptions = (SentryOptions) this.IconCompatParcelizer;
        if (sentryOptions != null) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
            int i4 = read + 71;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return new BannerViewCompanion();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object matchIsoCodeToCountryCode(String str, ContinuationImpl continuationImpl) {
        clearOldPosition clearoldposition;
        Object next;
        int i = 2 % 2;
        if (continuationImpl instanceof clearOldPosition) {
            clearoldposition = (clearOldPosition) continuationImpl;
            int i2 = clearoldposition.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaDescriptionCompat + 49;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                clearoldposition.serializer = i2 - Integer.MIN_VALUE;
            } else {
                clearoldposition = new clearOldPosition(this, continuationImpl);
            }
        } else {
            clearoldposition = new clearOldPosition(this, continuationImpl);
        }
        Object countryConfigs = clearoldposition.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = clearoldposition.serializer;
        if (i5 != 0) {
            int i6 = read + 47;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = clearoldposition.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(countryConfigs);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(countryConfigs);
            zzz zzzVar = (zzz) this.serializer;
            clearoldposition.IconCompatParcelizer = str;
            clearoldposition.serializer = 1;
            countryConfigs = zzzVar.getCountryConfigs(clearoldposition);
            if (countryConfigs == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Iterator it = ((List) countryConfigs).iterator();
        int i7 = MediaDescriptionCompat + 21;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!setCarryoverInAppMessage.serializer(((metaMarkUpdatedAndHasCallbacks) next).countryIsoCode, str, true));
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks = (metaMarkUpdatedAndHasCallbacks) next;
        if (metamarkupdatedandhascallbacks != null) {
            return metamarkupdatedandhascallbacks.countryCode;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a A[Catch: Exception -> 0x00ae, TRY_ENTER, TryCatch #0 {Exception -> 0x00ae, blocks: (B:29:0x0074, B:33:0x008a, B:41:0x0098, B:43:0x009e, B:34:0x008d, B:35:0x008f, B:36:0x0092), top: B:77:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[Catch: Exception -> 0x00ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ae, blocks: (B:29:0x0074, B:33:0x008a, B:41:0x0098, B:43:0x009e, B:34:0x008d, B:35:0x008f, B:36:0x0092), top: B:77:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    /* JADX WARN: Code duplicated, block: B:64:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public Object invoke(ContinuationImpl continuationImpl) {
        RecyclerViewViewHolder recyclerViewViewHolder;
        String lowerCase;
        Object systemService;
        TelephonyManager telephonyManager;
        String networkCountryIso;
        int i;
        int i2 = 2 % 2;
        Object objMatchIsoCodeToCountryCode = null;
        if (continuationImpl instanceof RecyclerViewViewHolder) {
            int i3 = read + 103;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = ((RecyclerViewViewHolder) continuationImpl).read;
                throw null;
            }
            recyclerViewViewHolder = (RecyclerViewViewHolder) continuationImpl;
            int i5 = recyclerViewViewHolder.read;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                recyclerViewViewHolder.read = i5 - Integer.MIN_VALUE;
            } else {
                recyclerViewViewHolder = new RecyclerViewViewHolder(this, continuationImpl);
            }
        } else {
            recyclerViewViewHolder = new RecyclerViewViewHolder(this, continuationImpl);
        }
        Object obj = recyclerViewViewHolder.IconCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = recyclerViewViewHolder.read;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            recyclerViewViewHolder.read = 1;
            String str = ((setTransacterruntime) this.RemoteActionCompatParcelizer).read();
            if (str != null) {
                int i7 = read + 21;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    str.length();
                    throw null;
                }
                if (str.length() == 0) {
                    addChangePayload addchangepayload = (addChangePayload) this.write;
                    addchangepayload.getClass();
                    try {
                        systemService = addchangepayload.serializer.getSystemService("phone");
                        if (systemService instanceof TelephonyManager) {
                            i = read + 41;
                            MediaDescriptionCompat = i % Fields.SpotShadowColor;
                            if (i % 2 != 0) {
                                objMatchIsoCodeToCountryCode.hashCode();
                                throw null;
                            }
                            telephonyManager = (TelephonyManager) systemService;
                        } else {
                            telephonyManager = null;
                        }
                        if (telephonyManager != null || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                            lowerCase = null;
                        } else {
                            lowerCase = networkCountryIso.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (lowerCase.length() <= 0) {
                                lowerCase = null;
                            }
                        }
                    } catch (Exception e) {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to read network country code", new Object[0]);
                    }
                    if (lowerCase != null) {
                        int i8 = read + 43;
                        MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (lowerCase.length() == 0) {
                            try {
                                String country = Locale.getDefault().getCountry();
                                country.getClass();
                                lowerCase = country.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                if (lowerCase.length() <= 0) {
                                    lowerCase = null;
                                }
                            } catch (Exception e2) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Failed to read Locale country code", new Object[0]);
                            }
                            if (lowerCase != null) {
                                int i10 = MediaDescriptionCompat + 45;
                                read = i10 % Fields.SpotShadowColor;
                                int i11 = i10 % 2;
                                if (lowerCase.length() == 0) {
                                    lowerCase = null;
                                }
                            } else {
                                lowerCase = null;
                            }
                        }
                    } else {
                        String country2 = Locale.getDefault().getCountry();
                        country2.getClass();
                        lowerCase = country2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.length() <= 0) {
                            lowerCase = null;
                        }
                        if (lowerCase != null) {
                            int i12 = MediaDescriptionCompat + 45;
                            read = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            if (lowerCase.length() == 0) {
                                lowerCase = null;
                            }
                        } else {
                            lowerCase = null;
                        }
                    }
                    if (lowerCase != null) {
                        objMatchIsoCodeToCountryCode = matchIsoCodeToCountryCode(lowerCase, recyclerViewViewHolder);
                    }
                } else {
                    objMatchIsoCodeToCountryCode = str;
                }
            } else {
                addChangePayload addchangepayload2 = (addChangePayload) this.write;
                addchangepayload2.getClass();
                systemService = addchangepayload2.serializer.getSystemService("phone");
                if (systemService instanceof TelephonyManager) {
                    i = read + 41;
                    MediaDescriptionCompat = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        objMatchIsoCodeToCountryCode.hashCode();
                        throw null;
                    }
                    telephonyManager = (TelephonyManager) systemService;
                } else {
                    telephonyManager = null;
                }
                if (telephonyManager != null) {
                    lowerCase = null;
                } else {
                    lowerCase = null;
                }
                if (lowerCase != null) {
                    int i14 = read + 43;
                    MediaDescriptionCompat = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    if (lowerCase.length() == 0) {
                        String country3 = Locale.getDefault().getCountry();
                        country3.getClass();
                        lowerCase = country3.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.length() <= 0) {
                            lowerCase = null;
                        }
                        if (lowerCase != null) {
                            int i16 = MediaDescriptionCompat + 45;
                            read = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            if (lowerCase.length() == 0) {
                                lowerCase = null;
                            }
                        } else {
                            lowerCase = null;
                        }
                    }
                } else {
                    String country4 = Locale.getDefault().getCountry();
                    country4.getClass();
                    lowerCase = country4.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (lowerCase.length() <= 0) {
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i18 = MediaDescriptionCompat + 45;
                        read = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        if (lowerCase.length() == 0) {
                            lowerCase = null;
                        }
                    } else {
                        lowerCase = null;
                    }
                }
                if (lowerCase != null) {
                    objMatchIsoCodeToCountryCode = matchIsoCodeToCountryCode(lowerCase, recyclerViewViewHolder);
                }
            }
            if (objMatchIsoCodeToCountryCode == obj2) {
                int i20 = read + 81;
                MediaDescriptionCompat = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                return obj2;
            }
            obj = objMatchIsoCodeToCountryCode;
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return Boolean.FALSE;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.IconCompatParcelizer);
        firebaseRemoteConfigImpl.getClass();
        Boolean boolValueOf = Boolean.valueOf(firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_INCOGNIA_SDK_ENABLED, str2));
        int i22 = MediaDescriptionCompat + 3;
        read = i22 % Fields.SpotShadowColor;
        if (i22 % 2 != 0) {
            int i23 = 41 / 0;
        }
        return boolValueOf;
    }

    public Ringtone serializer(boolean z) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        Application application = (Application) this.RemoteActionCompatParcelizer;
        boolean z2 = !z;
        int iSerializer = R.raw.low_prio;
        if (!z2) {
            int i5 = i3 + 5;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                zzpc.serializer(R.raw.low_prio, ((FirebaseRemoteConfigImpl) ((BrazeExternalSyntheticLambda206) this.write).RemoteActionCompatParcelizer).IconCompatParcelizer.read("new_delivery_foreground_sound"));
                throw null;
            }
            iSerializer = zzpc.serializer(R.raw.low_prio, ((FirebaseRemoteConfigImpl) ((BrazeExternalSyntheticLambda206) this.write).RemoteActionCompatParcelizer).IconCompatParcelizer.read("new_delivery_foreground_sound"));
        }
        Ringtone ringtone = RingtoneManager.getRingtone(application, Uri.parse("android.resource://" + application.getPackageName() + "/" + iSerializer));
        if (ringtone == null) {
            return null;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((subscribeToNetworkFailureslambda0) this.IconCompatParcelizer).IconCompatParcelizer;
        String str = firebaseRemoteConfigImpl.read.read();
        if (str == null) {
            int i6 = read + 17;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            boolean zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_MEDIA_AUDIO_ATTRIBUTES_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, str, firebaseRemoteConfigImpl);
            int i8 = MediaDescriptionCompat + 59;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (zM && z) {
                AudioAttributes audioAttributes = (AudioAttributes) ((JsonObjectSerializer) this.serializer).jsonReflectionObjectSerializer;
                audioAttributes.getClass();
                ringtone.setAudioAttributes(audioAttributes);
            }
        }
        return ringtone;
    }

    public CallTracer(VerificationStatusRepository verificationStatusRepository, ImageHeaderParserImageType imageHeaderParserImageType, transferSessionPackageI transfersessionpackagei, Clock clock) {
        verificationStatusRepository.getClass();
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = verificationStatusRepository;
        this.write = imageHeaderParserImageType;
        this.serializer = transfersessionpackagei;
        this.IconCompatParcelizer = clock;
    }

    public CallTracer(decode decodeVar, QualtricsManagerImpl qualtricsManagerImpl, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        decodeVar.getClass();
        qualtricsManagerImpl.getClass();
        getcontentviewgroupparentlayout.getClass();
        isopeninternalroom_runtime.getClass();
        this.RemoteActionCompatParcelizer = decodeVar;
        this.write = qualtricsManagerImpl;
        this.serializer = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
    }

    public CallTracer(lambda39 lambda39Var, logPushDeliverylambda1 logpushdeliverylambda1, StartWorkingRepository startWorkingRepository, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        lambda39Var.getClass();
        logpushdeliverylambda1.getClass();
        startWorkingRepository.getClass();
        isopeninternalroom_runtime.getClass();
        this.RemoteActionCompatParcelizer = lambda39Var;
        this.write = logpushdeliverylambda1;
        this.serializer = startWorkingRepository;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
    }

    public /* synthetic */ CallTracer(Object obj, Object obj2, Object obj3, Object obj4) {
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = obj3;
        this.IconCompatParcelizer = obj4;
    }

    public CallTracer(setTransacterruntime settransacterruntime, addChangePayload addchangepayload, zzz zzzVar, transferSessionPackageI transfersessionpackagei) {
        settransacterruntime.getClass();
        addchangepayload.getClass();
        zzzVar.getClass();
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = settransacterruntime;
        this.write = addchangepayload;
        this.serializer = zzzVar;
        this.IconCompatParcelizer = transfersessionpackagei;
    }

    public CallTracer(buildEventPackage buildeventpackage, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, requestBannersRefreshlambda1 requestbannersrefreshlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        requestbannersrefreshlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.RemoteActionCompatParcelizer = buildeventpackage;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = requestbannersrefreshlambda1;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public CallTracer(requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        requestgeofencesinitializationlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.RemoteActionCompatParcelizer = requestgeofencesinitializationlambda1;
        this.write = lambdaverifyplaystorepurchase45;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public CallTracer(BrazeExternalSyntheticLambda102 brazeExternalSyntheticLambda102, publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, requestBannersRefreshlambda1 requestbannersrefreshlambda1) {
        brazeExternalSyntheticLambda102.getClass();
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = brazeExternalSyntheticLambda102;
        this.write = publisherrorlambda1;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = requestbannersrefreshlambda1;
    }

    public CallTracer(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, LayoutCompat layoutCompat, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        layoutCompat.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = setusetemptrackingtableroom_runtime;
        this.serializer = layoutCompat;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public CallTracer(getIterationDuration getiterationduration, getIterationDuration getiterationduration2, getIterationDuration getiterationduration3, getIterationDuration getiterationduration4, int i) {
        if (i != 4) {
            getiterationduration3.getClass();
            getiterationduration4.getClass();
            this.RemoteActionCompatParcelizer = getiterationduration;
            this.write = getiterationduration2;
            this.serializer = getiterationduration3;
            this.IconCompatParcelizer = getiterationduration4;
            return;
        }
        getiterationduration.getClass();
        getiterationduration2.getClass();
        getiterationduration3.getClass();
        getiterationduration4.getClass();
        this.RemoteActionCompatParcelizer = getiterationduration;
        this.write = getiterationduration2;
        this.serializer = getiterationduration3;
        this.IconCompatParcelizer = getiterationduration4;
    }

    public CallTracer(OpportunitiesRepository opportunitiesRepository, vd vdVar, setLastHorizontalStyle setlasthorizontalstyle, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl) {
        opportunitiesRepository.getClass();
        vdVar.getClass();
        setlasthorizontalstyle.getClass();
        canRequestLocationUpdatesImpl.getClass();
        this.RemoteActionCompatParcelizer = opportunitiesRepository;
        this.write = vdVar;
        this.serializer = setlasthorizontalstyle;
        this.IconCompatParcelizer = canRequestLocationUpdatesImpl;
    }

    public CallTracer(requestBannersRefreshlambda1 requestbannersrefreshlambda1, requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        requestbannersrefreshlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.RemoteActionCompatParcelizer = requestbannersrefreshlambda1;
        this.write = requestgeofencesinitializationlambda1;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public CallTracer(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, backgroundTimerFiredI backgroundtimerfiredi) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        backgroundtimerfiredi.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = publisherrorlambda1;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = backgroundtimerfiredi;
    }

    public CallTracer() {
        this.write = ExtrasKt.IconCompatParcelizer();
        this.serializer = ExtrasKt.IconCompatParcelizer();
        this.IconCompatParcelizer = ExtrasKt.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = WebContentUtils.write;
    }

    public CallTracer(SentryOptions sentryOptions) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new BannerViewExternalSyntheticLambda3(0));
        this.write = new RemoteActionCompatParcelizer();
        this.serializer = new xr$$ExternalSyntheticLambda1(1);
        this.RemoteActionCompatParcelizer = scheduledThreadPoolExecutor;
        this.IconCompatParcelizer = sentryOptions;
    }

    public CallTracer(logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0, unpackZipIntoDirectory unpackzipintodirectory) {
        this.IconCompatParcelizer = logpurchasewithjsonlambda0;
        this.RemoteActionCompatParcelizer = unpackzipintodirectory;
        wouldPushPermissionPromptDisplaylambda1 wouldpushpermissionpromptdisplaylambda1 = (wouldPushPermissionPromptDisplaylambda1) logpurchasewithjsonlambda0.serializer;
        String str = (String) logpurchasewithjsonlambda0.write;
        wouldPushPermissionPromptDisplaylambda3 wouldpushpermissionpromptdisplaylambda3 = wouldpushpermissionpromptdisplaylambda1.read(str);
        this.serializer = wouldpushpermissionpromptdisplaylambda3;
        if (wouldpushpermissionpromptdisplaylambda3 != null) {
            this.write = wouldpushpermissionpromptdisplaylambda3.RemoteActionCompatParcelizer(unpackzipintodirectory);
            int i = MediaDescriptionCompat + 105;
            read = i % Fields.SpotShadowColor;
            int i2 = i % 2;
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
        throw null;
    }

    public CallTracer(hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0) {
        this.IconCompatParcelizer = hastoomanyzipentrieslambda0;
        this.RemoteActionCompatParcelizer = new Object();
        this.write = new HashSet();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0266  */
    /* JADX WARN: Code duplicated, block: B:116:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0161  */
    /* JADX WARN: Code duplicated, block: B:71:0x0180  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01de  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0202  */
    /* JADX WARN: Code duplicated, block: B:95:0x020e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0226  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public Object m5138invokeIoAF18A(ContinuationImpl continuationImpl) throws Throwable {
        FetchOneClickStartWorkingComponents$invoke$1 fetchOneClickStartWorkingComponents$invoke$1;
        Object objM5069fetchComponentsIoAF18A;
        Object obj;
        dismissBannerlambda1 dismissbannerlambda1;
        int i;
        ArrayList arrayList;
        Iterator it;
        Object next;
        getFeatureFlaglambda0 getfeatureflaglambda0;
        enableSdk enablesdk;
        ArrayList arrayList2;
        Iterator it2;
        Object next2;
        getFeatureFlaglambda0 getfeatureflaglambda1;
        List listRemoteActionCompatParcelizer;
        int i2;
        Iterator it3;
        Object next3;
        Boolean boolWrite;
        int i3;
        int i4;
        List listRemoteActionCompatParcelizer2;
        Object next4;
        int i5;
        int i6 = 2 % 2;
        if (continuationImpl instanceof FetchOneClickStartWorkingComponents$invoke$1) {
            fetchOneClickStartWorkingComponents$invoke$1 = (FetchOneClickStartWorkingComponents$invoke$1) continuationImpl;
            int i7 = fetchOneClickStartWorkingComponents$invoke$1.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                fetchOneClickStartWorkingComponents$invoke$1.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
            } else {
                fetchOneClickStartWorkingComponents$invoke$1 = new FetchOneClickStartWorkingComponents$invoke$1(this, continuationImpl);
            }
        } else {
            fetchOneClickStartWorkingComponents$invoke$1 = new FetchOneClickStartWorkingComponents$invoke$1(this, continuationImpl);
        }
        FetchOneClickStartWorkingComponents$invoke$1 fetchOneClickStartWorkingComponents$invoke$2 = fetchOneClickStartWorkingComponents$invoke$1;
        Object obj2 = fetchOneClickStartWorkingComponents$invoke$2.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = fetchOneClickStartWorkingComponents$invoke$2.RemoteActionCompatParcelizer;
        Object obj3 = createFromParcel.INSTANCE;
        ?? r5 = 0;
        Object obj4 = null;
        r5 = 0;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            StartWorkingRepository startWorkingRepository = (StartWorkingRepository) this.serializer;
            fetchOneClickStartWorkingComponents$invoke$2.RemoteActionCompatParcelizer = 1;
            objM5069fetchComponentsIoAF18A = startWorkingRepository.m5069fetchComponentsIoAF18A(fetchOneClickStartWorkingComponents$invoke$2);
            if (objM5069fetchComponentsIoAF18A != coroutineSingletons) {
            }
        }
        if (i8 != 1) {
            int i9 = MediaDescriptionCompat + 47;
            int i10 = i9 % Fields.SpotShadowColor;
            read = i10;
            int i11 = i9 % 2;
            if (i8 != 2) {
                if (i8 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i12 = i10 + 37;
                MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    Object obj5 = fetchOneClickStartWorkingComponents$invoke$2.write;
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    return obj5;
                }
                Object obj6 = fetchOneClickStartWorkingComponents$invoke$2.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                int i13 = 60 / 0;
                return obj6;
            }
            i = fetchOneClickStartWorkingComponents$invoke$2.read;
            dismissbannerlambda1 = fetchOneClickStartWorkingComponents$invoke$2.IconCompatParcelizer;
            obj = fetchOneClickStartWorkingComponents$invoke$2.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            objM5069fetchComponentsIoAF18A = ((onItemDismiss) obj2).IconCompatParcelizer;
        }
        fetchOneClickStartWorkingComponents$invoke$2.write = obj;
        fetchOneClickStartWorkingComponents$invoke$2.IconCompatParcelizer = null;
        fetchOneClickStartWorkingComponents$invoke$2.read = i;
        fetchOneClickStartWorkingComponents$invoke$2.RemoteActionCompatParcelizer = 3;
        List listWrite = dismissbannerlambda1.write();
        arrayList = new ArrayList();
        int i14 = MediaDescriptionCompat + 117;
        read = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        for (Object obj7 : listWrite) {
            if (obj7 instanceof getFeatureFlaglambda0) {
                i5 = MediaDescriptionCompat + 81;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    arrayList.add(obj7);
                    throw null;
                }
                arrayList.add(obj7);
            }
        }
        it = arrayList.iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getFeatureFlaglambda0) next).serializer(), "vehicle"}, getCieXyz.write())).booleanValue());
        getfeatureflaglambda0 = (getFeatureFlaglambda0) next;
        if (getfeatureflaglambda0 != null || (listRemoteActionCompatParcelizer2 = getfeatureflaglambda0.RemoteActionCompatParcelizer()) == null) {
            int i16 = read + 45;
            MediaDescriptionCompat = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            enablesdk = null;
        } else {
            Iterator it4 = listRemoteActionCompatParcelizer2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it4.next();
                Boolean boolWrite2 = ((enableSdk) next4).write();
                if (boolWrite2 != null && boolWrite2.booleanValue()) {
                    break;
                }
            }
            enablesdk = (enableSdk) next4;
        }
        List listWrite2 = dismissbannerlambda1.write();
        arrayList2 = new ArrayList();
        for (Object obj8 : listWrite2) {
            if (obj8 instanceof getFeatureFlaglambda0) {
                i4 = MediaDescriptionCompat + 15;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    arrayList2.add(obj8);
                    throw null;
                }
                arrayList2.add(obj8);
            }
        }
        it2 = arrayList2.iterator();
        do {
            if (it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getFeatureFlaglambda0) next2).serializer(), "bag"}, getCieXyz.write())).booleanValue());
        getfeatureflaglambda1 = (getFeatureFlaglambda0) next2;
        if (getfeatureflaglambda1 != null) {
            int i18 = read + 77;
            MediaDescriptionCompat = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            listRemoteActionCompatParcelizer = getfeatureflaglambda1.RemoteActionCompatParcelizer();
            if (listRemoteActionCompatParcelizer != null) {
                i2 = MediaDescriptionCompat + 103;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    it3 = listRemoteActionCompatParcelizer.iterator();
                    int i20 = 54 / 0;
                } else {
                    it3 = listRemoteActionCompatParcelizer.iterator();
                }
                while (it3.hasNext()) {
                    next3 = it3.next();
                    boolWrite = ((enableSdk) next3).write();
                    if (boolWrite != null) {
                        i3 = MediaDescriptionCompat + 109;
                        read = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            boolWrite.booleanValue();
                            r5.hashCode();
                            throw null;
                        }
                        if (boolWrite.booleanValue()) {
                            obj4 = next3;
                            break;
                        }
                    }
                }
                r5 = (enableSdk) obj4;
            }
        }
        ?? r3 = r5;
        if (enablesdk != null || r3 == 0) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Equipment is null in response. Not clearing local selection", new Object[0]);
        } else {
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.IconCompatParcelizer)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RxConvertKt$asObservable$1$job$1(this, enablesdk, r3, null, 4), fetchOneClickStartWorkingComponents$invoke$2);
            if (objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED) {
                int i21 = MediaDescriptionCompat + 69;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                obj3 = objWithContext;
            }
        }
        return obj3 == coroutineSingletons ? coroutineSingletons : obj;
        obj = objM5069fetchComponentsIoAF18A;
        if (!(obj instanceof isItemDismissable)) {
            dismissbannerlambda1 = (dismissBannerlambda1) obj;
            logPushDeliverylambda1 logpushdeliverylambda1 = (logPushDeliverylambda1) this.write;
            fetchOneClickStartWorkingComponents$invoke$2.write = obj;
            fetchOneClickStartWorkingComponents$invoke$2.IconCompatParcelizer = dismissbannerlambda1;
            fetchOneClickStartWorkingComponents$invoke$2.read = 0;
            fetchOneClickStartWorkingComponents$invoke$2.RemoteActionCompatParcelizer = 2;
            ((inCompatibilityMode) logpushdeliverylambda1.RemoteActionCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RxConvertKt$asFlow$1(logpushdeliverylambda1, dismissbannerlambda1, (ShortNewsContentCardView) r5, 18), fetchOneClickStartWorkingComponents$invoke$2);
            if (objWithContext2 != coroutineSingletons) {
                objWithContext2 = obj3;
            }
            if (objWithContext2 != coroutineSingletons) {
                i = 0;
                fetchOneClickStartWorkingComponents$invoke$2.write = obj;
                fetchOneClickStartWorkingComponents$invoke$2.IconCompatParcelizer = null;
                fetchOneClickStartWorkingComponents$invoke$2.read = i;
                fetchOneClickStartWorkingComponents$invoke$2.RemoteActionCompatParcelizer = 3;
                List listWrite3 = dismissbannerlambda1.write();
                arrayList = new ArrayList();
                int i110 = MediaDescriptionCompat + 117;
                read = i110 % Fields.SpotShadowColor;
                int i111 = i110 % 2;
                while (r0.hasNext()) {
                    if (obj7 instanceof getFeatureFlaglambda0) {
                        i5 = MediaDescriptionCompat + 81;
                        read = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            arrayList.add(obj7);
                            throw null;
                        }
                        arrayList.add(obj7);
                    }
                }
                it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getFeatureFlaglambda0) next).serializer(), "vehicle"}, getCieXyz.write())).booleanValue());
                getfeatureflaglambda0 = (getFeatureFlaglambda0) next;
                if (getfeatureflaglambda0 != null) {
                    int i112 = read + 45;
                    MediaDescriptionCompat = i112 % Fields.SpotShadowColor;
                    int i113 = i112 % 2;
                    enablesdk = null;
                } else {
                    int i114 = read + 45;
                    MediaDescriptionCompat = i114 % Fields.SpotShadowColor;
                    int i115 = i114 % 2;
                    enablesdk = null;
                }
                List listWrite4 = dismissbannerlambda1.write();
                arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                    if (obj8 instanceof getFeatureFlaglambda0) {
                        i4 = MediaDescriptionCompat + 15;
                        read = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            arrayList2.add(obj8);
                            throw null;
                        }
                        arrayList2.add(obj8);
                    }
                }
                it2 = arrayList2.iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getFeatureFlaglambda0) next2).serializer(), "bag"}, getCieXyz.write())).booleanValue());
                getfeatureflaglambda1 = (getFeatureFlaglambda0) next2;
                if (getfeatureflaglambda1 != null) {
                    int i116 = read + 77;
                    MediaDescriptionCompat = i116 % Fields.SpotShadowColor;
                    int i117 = i116 % 2;
                    listRemoteActionCompatParcelizer = getfeatureflaglambda1.RemoteActionCompatParcelizer();
                    if (listRemoteActionCompatParcelizer != null) {
                        i2 = MediaDescriptionCompat + 103;
                        read = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            it3 = listRemoteActionCompatParcelizer.iterator();
                            int i23 = 54 / 0;
                        } else {
                            it3 = listRemoteActionCompatParcelizer.iterator();
                        }
                        while (it3.hasNext()) {
                            next3 = it3.next();
                            boolWrite = ((enableSdk) next3).write();
                            if (boolWrite != null) {
                                i3 = MediaDescriptionCompat + 109;
                                read = i3 % Fields.SpotShadowColor;
                                if (i3 % 2 == 0) {
                                    boolWrite.booleanValue();
                                    r5.hashCode();
                                    throw null;
                                }
                                if (boolWrite.booleanValue()) {
                                    obj4 = next3;
                                    break;
                                }
                            }
                        }
                        r5 = (enableSdk) obj4;
                    }
                }
                ?? r4 = r5;
                if (enablesdk != null) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Equipment is null in response. Not clearing local selection", new Object[0]);
                } else {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Equipment is null in response. Not clearing local selection", new Object[0]);
                }
                if (obj3 == coroutineSingletons) {
                }
            }
        }
    }
}
