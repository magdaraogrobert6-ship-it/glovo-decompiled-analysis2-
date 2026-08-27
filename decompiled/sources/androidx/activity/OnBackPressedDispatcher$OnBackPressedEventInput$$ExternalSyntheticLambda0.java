package androidx.activity;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import androidx.work.impl.WorkerWrapper;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry$Builder;
import coil3.ImageLoader$Builder;
import coil3.network.NetworkFetcher;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.foodora.courier.push.tokenregistery.data.GMSPushTokenProvider;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonValueObjectEncoderContext;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingRegistrar;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplayRegistrar;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.huawei.location.base.activity.constant.ActivityRecognitionConstants;
import com.huawei.riemann.location.common.utils.Constant;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.HomeFragment;
import io.grpc.CallOptions$Builder;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.sentry.SentryClient$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.metrics.MetricsBatchProcessor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ranges.RangesKt;
import o.AbstractComposeView;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AccessibilityIteratorsAbstractTextSegmentIterator;
import o.MotionReferencePlacementDelegate;
import o.OuterPlacementScope;
import o.ParentDataModifierDefaultImpls;
import o.access500;
import o.accessgetAccessibilityFocusedVirtualViewIdp;
import o.accessgetBackspacecp;
import o.accessgetButton13cp;
import o.accessgetButtonL2cp;
import o.accessgetButtonYcp;
import o.accessgetCurrentlyAccessibilityFocusedANIp;
import o.accessgetF3cp;
import o.accessgetInstancedelegatecp;
import o.accessgetIntersectcp;
import o.accessgetLastPositionp;
import o.accessgetLayoutNodeLayoutDelegatep;
import o.accessgetMediaFastForwardcp;
import o.accessgetOuterCoordinator;
import o.accessgetWcp;
import o.accessremoveNotificationForSysPropsChange;
import o.accesssetInstancecp;
import o.checkChildrenPlaceOrderForUpdates;
import o.colorResource;
import o.detachAndRemoveNode;
import o.disposeComposition;
import o.getAdapters;
import o.getAlignmentLinesMap;
import o.getCachedAlignmentLinesMap;
import o.getCieXyz;
import o.getCompositingStrategyke2Ky5w;
import o.getConstraintsmsEJaDkui;
import o.getDetachedFromParentLookaheadPlacement;
import o.getHasComposition;
import o.getInspectableElements;
import o.getMeasurePending;
import o.getNameFallback;
import o.getOffsetF1C5BW0;
import o.getPlacedOnceui;
import o.getPlacementScope;
import o.getReject5zf0vsI;
import o.getShowLayoutBoundsannotations;
import o.internalOnMeasureui;
import o.isEndBoundary;
import o.logTree;
import o.markNodeAndSubtreeAsPlaced;
import o.mergeJsonObjectslambda00;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setContentCaptureManagerui;
import o.setLayoutPendingForAlignment;
import o.setOnReadyForComposition;
import o.setPositiongyyYBs;
import o.setRoundRectOutlineTNW_H78default;
import o.set_measureResult;
import o.shouldDelayChildPressedState;
import o.speculativeHit;
import o.translatek4lQ0M;
import o.updatePlacedUnderMotionFrameOfReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 implements Function, Consumer, Predicate, SingleOnSubscribe, OnSuccessListener, accessgetMediaFastForwardcp, getPlacementScope, AccessibilityIteratorsAbstractTextSegmentIterator, OuterPlacementScope {
    private static int IconCompatParcelizer = 1;
    private static byte read = -112;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
    }

    public void IconCompatParcelizer() {
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.serializer;
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            List list = getOffsetF1C5BW0.write;
            list.getClass();
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0}, getCieXyz.write())).booleanValue()) {
                        z = true;
                        z2 = false;
                    }
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            getOffsetF1C5BW0.write = arrayList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x040f  */
    @Override // o.getPlacementScope
    public Object create(MetricsBatchProcessor metricsBatchProcessor) {
        String str;
        CrashlyticsWorkers crashlyticsWorkers;
        set_measureResult set_measureresult;
        String string;
        zzw zzwVar;
        Task taskOnSuccessTask;
        boolean z;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        getAdapters getadaptersRemoteActionCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i != 21) {
            if (i != 26) {
                return ((FirebaseInAppMessagingDisplayRegistrar) obj).buildFirebaseInAppMessagingUI(metricsBatchProcessor);
            }
            return ((FirebaseInAppMessagingRegistrar) obj).providesFirebaseInAppMessaging(metricsBatchProcessor);
        }
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) obj;
        int i2 = CrashlyticsRegistrar.write;
        long jCurrentTimeMillis = System.currentTimeMillis();
        FirebaseApp firebaseApp = (FirebaseApp) metricsBatchProcessor.read(FirebaseApp.class);
        accesssetInstancecp accesssetinstancecp = (accesssetInstancecp) metricsBatchProcessor.read(accesssetInstancecp.class);
        updatePlacedUnderMotionFrameOfReference updateplacedundermotionframeofreferenceSerializer = metricsBatchProcessor.serializer(getCachedAlignmentLinesMap.class);
        updatePlacedUnderMotionFrameOfReference updateplacedundermotionframeofreferenceSerializer2 = metricsBatchProcessor.serializer(logTree.class);
        updatePlacedUnderMotionFrameOfReference updateplacedundermotionframeofreferenceSerializer3 = metricsBatchProcessor.serializer(accessremoveNotificationForSysPropsChange.class);
        ExecutorService executorService = (ExecutorService) metricsBatchProcessor.write(crashlyticsRegistrar.RemoteActionCompatParcelizer);
        ExecutorService executorService2 = (ExecutorService) metricsBatchProcessor.write(crashlyticsRegistrar.serializer);
        ExecutorService executorService3 = (ExecutorService) metricsBatchProcessor.write(crashlyticsRegistrar.IconCompatParcelizer);
        firebaseApp.IconCompatParcelizer();
        Context context = firebaseApp.read;
        String packageName = context.getPackageName();
        CrashlyticsWorkers crashlyticsWorkers2 = new CrashlyticsWorkers(executorService, executorService2);
        WorkerWrapper.Builder builder = new WorkerWrapper.Builder(context);
        ComponentRegistry$Builder componentRegistry$Builder = new ComponentRegistry$Builder(firebaseApp);
        IdManager idManager = new IdManager(context, packageName, accesssetinstancecp, componentRegistry$Builder);
        getCachedAlignmentLinesMap getcachedalignmentlinesmap = new getCachedAlignmentLinesMap(updateplacedundermotionframeofreferenceSerializer);
        translatek4lQ0M translatek4lq0m = new translatek4lQ0M(updateplacedundermotionframeofreferenceSerializer2);
        getDetachedFromParentLookaheadPlacement getdetachedfromparentlookaheadplacement = new getDetachedFromParentLookaheadPlacement(componentRegistry$Builder, builder);
        FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.read;
        accessgetCurrentlyAccessibilityFocusedANIp accessgetcurrentlyaccessibilityfocusedanip = accessgetCurrentlyAccessibilityFocusedANIp.CRASHLYTICS;
        FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.read;
        accessgetAccessibilityFocusedVirtualViewIdp accessgetaccessibilityfocusedvirtualviewidpIconCompatParcelizer = FirebaseSessionsDependencies.IconCompatParcelizer(accessgetcurrentlyaccessibilityfocusedanip);
        if (accessgetaccessibilityfocusedvirtualviewidpIconCompatParcelizer.write != null) {
            Objects.toString(accessgetcurrentlyaccessibilityfocusedanip);
        } else {
            accessgetaccessibilityfocusedvirtualviewidpIconCompatParcelizer.write = getdetachedfromparentlookaheadplacement;
            Objects.toString(accessgetcurrentlyaccessibilityfocusedanip);
            accessgetaccessibilityfocusedvirtualviewidpIconCompatParcelizer.IconCompatParcelizer.write(null);
        }
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, getcachedalignmentlinesmap, componentRegistry$Builder, new getConstraintsmsEJaDkui(translatek4lq0m), new getConstraintsmsEJaDkui(translatek4lq0m), builder, getdetachedfromparentlookaheadplacement, new zzz(updateplacedundermotionframeofreferenceSerializer3), crashlyticsWorkers2);
        CrashlyticsWorkers crashlyticsWorkers3 = crashlyticsCore.RatingCompat;
        firebaseApp.IconCompatParcelizer();
        String str2 = firebaseApp.PlaybackStateCompatCustomAction.IconCompatParcelizer;
        int iWrite = accessgetOuterCoordinator.write(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iWrite == 0) {
            iWrite = accessgetOuterCoordinator.write(context, "com.crashlytics.android.build_id", "string");
        }
        int i3 = 3;
        if (iWrite != 0) {
            String string2 = context.getResources().getString(iWrite);
            if (string2.startsWith("%('")) {
                Object[] objArr = new Object[1];
                a(string2.substring(3), objArr);
                string2 = ((String) objArr[0]).intern();
            }
            str = string2;
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        int iWrite2 = accessgetOuterCoordinator.write(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iWrite3 = accessgetOuterCoordinator.write(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iWrite4 = accessgetOuterCoordinator.write(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iWrite2 != 0 && iWrite3 != 0 && iWrite4 != 0) {
            String[] stringArray = context.getResources().getStringArray(iWrite2);
            String[] stringArray2 = context.getResources().getStringArray(iWrite3);
            String[] stringArray3 = context.getResources().getStringArray(iWrite4);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i4 = 0;
                while (i4 < stringArray3.length) {
                    arrayList.add(new accessgetLastPositionp(stringArray[i4], stringArray2[i4], stringArray3[i4]));
                    i4++;
                    crashlyticsWorkers3 = crashlyticsWorkers3;
                    i3 = 3;
                }
                crashlyticsWorkers = crashlyticsWorkers3;
            } else {
                crashlyticsWorkers = crashlyticsWorkers3;
                String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                i3 = 3;
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
        } else {
            crashlyticsWorkers = crashlyticsWorkers3;
            String.format("Could not find resources: %d %d %d", Integer.valueOf(iWrite2), Integer.valueOf(iWrite3), Integer.valueOf(iWrite4));
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
        Log.isLoggable("FirebaseCrashlytics", i3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((accessgetLastPositionp) it.next()).getClass();
            Log.isLoggable("FirebaseCrashlytics", i3);
        }
        zzbv zzbvVar = new zzbv(17, context);
        try {
            String packageName2 = context.getPackageName();
            String strIconCompatParcelizer = idManager.IconCompatParcelizer();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
            String string3 = Long.toString(packageInfo.getLongVersionCode());
            String str3 = packageInfo.versionName;
            if (str3 == null) {
                str3 = "0.0";
            }
            int i5 = i3;
            CallOptions$Builder callOptions$Builder = new CallOptions$Builder(str2, str, arrayList, strIconCompatParcelizer, packageName2, string3, str3, zzbvVar);
            Log.isLoggable("FirebaseCrashlytics", 2);
            int i6 = 27;
            accessgetWcp accessgetwcp = new accessgetWcp(i6);
            String strIconCompatParcelizer2 = idManager.IconCompatParcelizer();
            speculativeHit speculativehit = new speculativeHit(i6);
            zzz zzzVar = new zzz(speculativehit);
            zzz zzzVar2 = new zzz();
            zzzVar2.serializer = new File((File) builder.read, "com.crashlytics.settings.json");
            Locale locale = Locale.US;
            mergeJsonObjectslambda00 mergejsonobjectslambda00 = new mergeJsonObjectslambda00(ff$$ExternalSyntheticOutline0.m("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str2, "/settings"), accessgetwcp);
            String str4 = Build.MANUFACTURER;
            String str5 = IdManager.IconCompatParcelizer;
            String strM = af$$ExternalSyntheticOutline0.m(str4.replaceAll(str5, ""), "/", Build.MODEL.replaceAll(str5, ""));
            String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str5, "");
            String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str5, "");
            int iWrite5 = accessgetOuterCoordinator.write(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (iWrite5 == 0) {
                iWrite5 = accessgetOuterCoordinator.write(context, "com.crashlytics.android.build_id", "string");
            }
            if (iWrite5 != 0) {
                string = context.getResources().getString(iWrite5);
                if (string.startsWith("%('")) {
                    Object[] objArr2 = new Object[1];
                    a(string.substring(i5), objArr2);
                    string = ((String) objArr2[0]).intern();
                }
            } else {
                string = null;
            }
            String[] strArr = {string, str2, str3, r24};
            ArrayList arrayList2 = new ArrayList();
            int i7 = 0;
            while (i7 < 4) {
                String str6 = strArr[i7];
                if (str6 != null) {
                    arrayList2.add(str6.replace("-", "").toLowerCase(Locale.US));
                }
                i7++;
                strArr = strArr;
            }
            Collections.sort(arrayList2);
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
            }
            String string4 = sb.toString();
            access500 access500Var = new access500(context, new getInspectableElements(str2, strM, strReplaceAll, strReplaceAll2, idManager, string4.length() > 0 ? accessgetOuterCoordinator.RemoteActionCompatParcelizer(string4) : null, str3, string3, getMeasurePending.determineFrom(strIconCompatParcelizer2).getId()), speculativehit, zzzVar, zzzVar2, mergejsonobjectslambda00, componentRegistry$Builder);
            getNameFallback getnamefallback = getNameFallback.USE_CACHE;
            AtomicReference atomicReference = (AtomicReference) access500Var.RemoteActionCompatParcelizer;
            AtomicReference atomicReference2 = (AtomicReference) access500Var.MediaMetadataCompat;
            int i8 = 28;
            if (((Context) access500Var.RatingCompat).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((getInspectableElements) access500Var.serializer).MediaSessionCompatQueueItem) && (getadaptersRemoteActionCompatParcelizer = access500Var.RemoteActionCompatParcelizer(getnamefallback)) != null) {
                atomicReference2.set(getadaptersRemoteActionCompatParcelizer);
                ((ParentDataModifierDefaultImpls) atomicReference.get()).write(getadaptersRemoteActionCompatParcelizer);
                taskOnSuccessTask = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
            } else {
                getAdapters getadaptersRemoteActionCompatParcelizer2 = access500Var.RemoteActionCompatParcelizer(getNameFallback.IGNORE_CACHE_EXPIRATION);
                if (getadaptersRemoteActionCompatParcelizer2 != null) {
                    atomicReference2.set(getadaptersRemoteActionCompatParcelizer2);
                    ((ParentDataModifierDefaultImpls) atomicReference.get()).write(getadaptersRemoteActionCompatParcelizer2);
                }
                ComponentRegistry$Builder componentRegistry$Builder2 = (ComponentRegistry$Builder) access500Var.read;
                zzw zzwVar2 = ((ParentDataModifierDefaultImpls) componentRegistry$Builder2.serializer).RemoteActionCompatParcelizer;
                synchronized (componentRegistry$Builder2.read) {
                    zzwVar = ((ParentDataModifierDefaultImpls) componentRegistry$Builder2.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
                }
                taskOnSuccessTask = setLayoutPendingForAlignment.RemoteActionCompatParcelizer(zzwVar2, zzwVar).onSuccessTask(crashlyticsWorkers2.read, new colorResource(access500Var, i8, crashlyticsWorkers2));
            }
            taskOnSuccessTask.addOnFailureListener(executorService3, new getAlignmentLinesMap(29));
            WorkerWrapper.Builder builder2 = crashlyticsCore.MediaBrowserCompatMediaItem;
            Context context2 = crashlyticsCore.serializer;
            if (context2 == null || (resources = context2.getResources()) == null) {
                z = true;
            } else {
                int iWrite6 = accessgetOuterCoordinator.write(context2, "com.crashlytics.RequireBuildId", "bool");
                if (iWrite6 > 0) {
                    z = resources.getBoolean(iWrite6);
                } else {
                    int iWrite7 = accessgetOuterCoordinator.write(context2, "com.crashlytics.RequireBuildId", "string");
                    if (iWrite7 > 0) {
                        String string5 = context2.getString(iWrite7);
                        if (string5.startsWith("%('")) {
                            Object[] objArr3 = new Object[1];
                            a(string5.substring(3), objArr3);
                            string5 = ((String) objArr3[0]).intern();
                        }
                        z = Boolean.parseBoolean(string5);
                    } else {
                        z = true;
                    }
                }
            }
            String str7 = (String) r42.RemoteActionCompatParcelizer;
            if (!z) {
                Log.isLoggable("FirebaseCrashlytics", 2);
            } else if (TextUtils.isEmpty(str7)) {
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".     |  | ");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".     |  |");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".     |  |");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".   \\ |  | /");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".    \\    /");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".     \\  /");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".      \\/");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".      /\\");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".     /  \\");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".    /    \\");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".   / |  | \\");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".     |  |");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".     |  |");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".     |  |");
                SentryLogcatAdapter.serializer("FirebaseCrashlytics", ".");
                ScreenStartObserver$$ExternalSyntheticLambda0.write("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                return null;
            }
            String str8 = new accessgetLayoutNodeLayoutDelegatep().RemoteActionCompatParcelizer;
            try {
                int i9 = 19;
                crashlyticsCore.IconCompatParcelizer = new zzbv("crash_marker", i9, builder2);
                crashlyticsCore.PlaybackStateCompat = new zzbv("initialization_marker", i9, builder2);
                CrashlyticsWorkers crashlyticsWorkers4 = crashlyticsWorkers;
                WorkerWrapper.Builder builder3 = new WorkerWrapper.Builder(str8, builder2, crashlyticsWorkers4);
                getPlacedOnceui getplacedonceui = new getPlacedOnceui(builder2);
                zzbv zzbvVar2 = new zzbv(new MotionReferencePlacementDelegate[]{new setRoundRectOutlineTNW_H78default(i8)});
                zzz zzzVar3 = crashlyticsCore.MediaSessionCompatToken;
                zzzVar3.getClass();
                ((updatePlacedUnderMotionFrameOfReference) zzzVar3.serializer).IconCompatParcelizer(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(23, new setPositiongyyYBs(builder3)));
                crashlyticsCore.RemoteActionCompatParcelizer = new checkChildrenPlaceOrderForUpdates(crashlyticsCore.serializer, crashlyticsCore.MediaDescriptionCompat, crashlyticsCore.MediaMetadataCompat, crashlyticsCore.MediaBrowserCompatMediaItem, crashlyticsCore.IconCompatParcelizer, callOptions$Builder, builder3, getplacedonceui, WorkerWrapper.Builder.write(crashlyticsCore.serializer, crashlyticsCore.MediaDescriptionCompat, crashlyticsCore.MediaBrowserCompatMediaItem, r42, getplacedonceui, builder3, zzbvVar2, access500Var, crashlyticsCore.MediaSessionCompatResultReceiverWrapper, crashlyticsCore.ParcelableVolumeInfo, crashlyticsCore.RatingCompat), crashlyticsCore.PlaybackStateCompatCustomAction, crashlyticsCore.read, crashlyticsCore.ParcelableVolumeInfo, crashlyticsCore.RatingCompat);
                zzbv zzbvVar3 = crashlyticsCore.PlaybackStateCompat;
                WorkerWrapper.Builder builder4 = (WorkerWrapper.Builder) zzbvVar3.RemoteActionCompatParcelizer;
                String str9 = (String) zzbvVar3.write;
                builder4.getClass();
                boolean zExists = new File((File) builder4.read, str9).exists();
                try {
                    crashlyticsCore.MediaSessionCompatQueueItem = Boolean.TRUE.equals((Boolean) crashlyticsWorkers4.read.read.submit(new setContentCaptureManagerui(1, crashlyticsCore)).get(3L, TimeUnit.SECONDS));
                } catch (Exception unused) {
                    crashlyticsCore.MediaSessionCompatQueueItem = false;
                }
                checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates = crashlyticsCore.RemoteActionCompatParcelizer;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                checkchildrenplaceorderforupdates.MediaDescriptionCompat.read.serializer(new ND$$ExternalSyntheticLambda0(checkchildrenplaceorderforupdates, 12, str8));
                markNodeAndSubtreeAsPlaced marknodeandsubtreeasplaced = new markNodeAndSubtreeAsPlaced(new CreateHomeScope(checkchildrenplaceorderforupdates), access500Var, defaultUncaughtExceptionHandler, checkchildrenplaceorderforupdates.PlaybackStateCompatCustomAction);
                checkchildrenplaceorderforupdates.MediaBrowserCompatMediaItem = marknodeandsubtreeasplaced;
                Thread.setDefaultUncaughtExceptionHandler(marknodeandsubtreeasplaced);
                if (zExists && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    crashlyticsCore.read(access500Var);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    crashlyticsWorkers4.read.serializer(new ND$$ExternalSyntheticLambda0(crashlyticsCore, 13, access500Var));
                }
            } catch (Exception e) {
                SentryLogcatAdapter.read("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", e);
                crashlyticsCore.RemoteActionCompatParcelizer = null;
            }
            set_measureresult = new set_measureResult(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException e2) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Error retrieving app package info.", e2);
            set_measureresult = null;
        }
        if (System.currentTimeMillis() - jCurrentTimeMillis <= 16) {
            return set_measureresult;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return set_measureresult;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = write + 115;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((Recomposer$$ExternalSyntheticLambda4) this.serializer).invoke(obj);
        int i4 = write + 63;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        int i = 2 % 2;
        int i2 = write + 21;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((Runnable) this.serializer).run();
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
            throw null;
        }
        ((Runnable) this.serializer).run();
        zzw zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        int i3 = IconCompatParcelizer + 3;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return zzwVarRemoteActionCompatParcelizer;
    }

    public void RemoteActionCompatParcelizer(byte[] bArr) {
        int i = 2 % 2;
        ((accessgetF3cp) this.serializer).read(accessgetBackspacecp.RemoteActionCompatParcelizer(bArr), new getAlignmentLinesMap(2));
        int i2 = write + 75;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // io.reactivex.functions.Predicate
    public boolean read(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getReject5zf0vsI getreject5zf0vsi = (getReject5zf0vsI) this.serializer;
            obj.getClass();
            ((Boolean) getreject5zf0vsi.invoke(obj)).booleanValue();
            throw null;
        }
        getReject5zf0vsI getreject5zf0vsi2 = (getReject5zf0vsI) this.serializer;
        obj.getClass();
        boolean zBooleanValue = ((Boolean) getreject5zf0vsi2.invoke(obj)).booleanValue();
        int i3 = IconCompatParcelizer + 87;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // io.reactivex.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        int i = 2 % 2;
        GMSPushTokenProvider gMSPushTokenProvider = (GMSPushTokenProvider) this.serializer;
        singleEmitter.getClass();
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        firebaseMessaging.getClass();
        Task token = firebaseMessaging.getToken();
        token.getClass();
        token.addOnSuccessListener(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(17, new Recomposer$$ExternalSyntheticLambda4(gMSPushTokenProvider, 23, singleEmitter))).addOnFailureListener(new JankStatsFrameTracker$$ExternalSyntheticLambda3(gMSPushTokenProvider, 1, singleEmitter));
        int i2 = IconCompatParcelizer + 23;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.AccessibilityIteratorsAbstractTextSegmentIterator
    public void RemoteActionCompatParcelizer(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i4 == 22) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            ((getCachedAlignmentLinesMap) obj).RemoteActionCompatParcelizer.set((getCachedAlignmentLinesMap) abstractComposeViewExternalSyntheticLambda0.write());
            return;
        }
        if (i4 != 23) {
            ((AbstractComposeView) obj).serializer = abstractComposeViewExternalSyntheticLambda0.write();
            int i5 = write + 43;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        setPositiongyyYBs setpositiongyyybs = (setPositiongyyYBs) obj;
        ImageLoader$Builder imageLoader$Builder = ((RemoteConfigComponent) ((accessremoveNotificationForSysPropsChange) abstractComposeViewExternalSyntheticLambda0.write())).write("firebase").PlaybackStateCompat;
        ((Set) imageLoader$Builder.serializer).add(setpositiongyyybs);
        Task task = ((setOnReadyForComposition) imageLoader$Builder.RemoteActionCompatParcelizer).read();
        task.addOnSuccessListener((Executor) imageLoader$Builder.read, new SentryClient$$ExternalSyntheticLambda1(imageLoader$Builder, task, setpositiongyyybs, 5));
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        switch (i4) {
            case 7:
                ((NetworkFetcher.AnonymousClass2) obj2).invoke(obj);
                return;
            case 8:
                ((NetworkFetcher.AnonymousClass2) obj2).invoke(obj);
                return;
            case 9:
                ((HomeFragment.AnonymousClass1) obj2).invoke(obj);
                return;
            case 10:
            case 13:
            default:
                FirebaseInAppMessaging firebaseInAppMessaging = (FirebaseInAppMessaging) obj2;
                shouldDelayChildPressedState shoulddelaychildpressedstate = (shouldDelayChildPressedState) obj;
                JankStatsFrameTracker$$ExternalSyntheticLambda3 jankStatsFrameTracker$$ExternalSyntheticLambda3 = firebaseInAppMessaging.IconCompatParcelizer;
                if (jankStatsFrameTracker$$ExternalSyntheticLambda3 != null) {
                    internalOnMeasureui internalonmeasureuiWrite = shoulddelaychildpressedstate.write();
                    WorkerWrapper.Builder builder = firebaseInAppMessaging.write;
                    jankStatsFrameTracker$$ExternalSyntheticLambda3.displayMessage(internalonmeasureuiWrite, new DisplayCallbacksImpl((ImpressionStorageClient) builder.write, (disposeComposition) builder.MediaSessionCompatQueueItem, (getShowLayoutBoundsannotations) builder.read, (RateLimiterClient) builder.MediaBrowserCompatMediaItem, (getHasComposition) builder.MediaMetadataCompat, (MetricsLoggerClient) builder.IconCompatParcelizer, (zzbv) builder.RemoteActionCompatParcelizer, shoulddelaychildpressedstate.write(), shoulddelaychildpressedstate.IconCompatParcelizer()));
                    return;
                }
                return;
            case 11:
                ((getReject5zf0vsI) obj2).invoke(obj);
                return;
            case 12:
                ((accessgetIntersectcp) obj2).invoke(obj);
                return;
            case 14:
                ((getReject5zf0vsI) obj2).invoke(obj);
                int i5 = IconCompatParcelizer + 37;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    throw null;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r2.compileStatement("DELETE FROM log_event_dropped").execute();
        r2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + r1.MediaMetadataCompat.IconCompatParcelizer()).execute();
        r2.setTransactionSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r2.endTransaction();
        r1 = androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.IconCompatParcelizer + 21;
        androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        r5 = (com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore) r5;
        r5.getClass();
        r0 = o.accessgetGravecp.IconCompatParcelizer;
        r0 = new coil3.ImageLoader$Builder();
        r0.RemoteActionCompatParcelizer = null;
        r0.IconCompatParcelizer = new java.util.ArrayList();
        r0.read = null;
        r0.serializer = "";
        r1 = new java.util.HashMap();
        r2 = r5.IconCompatParcelizer();
        r2.beginTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        r0 = (o.accessgetGravecp) com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.write(r2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new java.lang.String[0]), new androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2(r5, r1, r0, 9));
        r2.setTransactionSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != 19) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1 != 19) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r1 = (com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore) ((o.access500) r5).RemoteActionCompatParcelizer;
        r2 = r1.IconCompatParcelizer();
        r2.beginTransaction();
     */
    @Override // o.accessgetMediaFastForwardcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object read() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.write
            r2 = 19
            int r1 = r1 + r2
            int r3 = r1 % 128
            androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.IconCompatParcelizer = r3
            int r1 = r1 % r0
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L1b
            int r1 = r7.RemoteActionCompatParcelizer
            java.lang.Object r5 = r7.serializer
            r6 = 65
            int r6 = r6 / r3
            if (r1 == r2) goto L6a
            goto L21
        L1b:
            int r1 = r7.RemoteActionCompatParcelizer
            java.lang.Object r5 = r7.serializer
            if (r1 == r2) goto L6a
        L21:
            o.access500 r5 = (o.access500) r5
            java.lang.Object r1 = r5.RemoteActionCompatParcelizer
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r1 = (com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore) r1
            android.database.sqlite.SQLiteDatabase r2 = r1.IconCompatParcelizer()
            r2.beginTransaction()
            java.lang.String r3 = "DELETE FROM log_event_dropped"
            android.database.sqlite.SQLiteStatement r3 = r2.compileStatement(r3)     // Catch: java.lang.Throwable -> L65
            r3.execute()     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "UPDATE global_log_event_state SET last_metrics_upload_ms="
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L65
            o.accessgetMediaPlaycp r1 = r1.MediaMetadataCompat     // Catch: java.lang.Throwable -> L65
            long r5 = r1.IconCompatParcelizer()     // Catch: java.lang.Throwable -> L65
            r3.append(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L65
            android.database.sqlite.SQLiteStatement r1 = r2.compileStatement(r1)     // Catch: java.lang.Throwable -> L65
            r1.execute()     // Catch: java.lang.Throwable -> L65
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L65
            r2.endTransaction()
            int r1 = androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.IconCompatParcelizer
            int r1 = r1 + 21
            int r2 = r1 % 128
            androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.write = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L64
            return r4
        L64:
            throw r4
        L65:
            r0 = move-exception
            r2.endTransaction()
            throw r0
        L6a:
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r5 = (com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore) r5
            r5.getClass()
            int r0 = o.accessgetGravecp.IconCompatParcelizer
            coil3.ImageLoader$Builder r0 = new coil3.ImageLoader$Builder
            r0.<init>()
            r0.RemoteActionCompatParcelizer = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.IconCompatParcelizer = r1
            r0.read = r4
            java.lang.String r1 = ""
            r0.serializer = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r5.IconCompatParcelizer()
            r2.beginTransaction()
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped"
            android.database.Cursor r3 = r2.rawQuery(r4, r3)     // Catch: java.lang.Throwable -> Lad
            androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2 r4 = new androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> Lad
            r6 = 9
            r4.<init>(r5, r1, r0, r6)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.write(r3, r4)     // Catch: java.lang.Throwable -> Lad
            o.accessgetGravecp r0 = (o.accessgetGravecp) r0     // Catch: java.lang.Throwable -> Lad
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> Lad
            r2.endTransaction()
            return r0
        Lad:
            r0 = move-exception
            r2.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.read():java.lang.Object");
    }

    public isEndBoundary IconCompatParcelizer(EmojiProcessor emojiProcessor) throws IOException {
        InputStream gZIPInputStream;
        int i = 2 % 2;
        accessgetButton13cp accessgetbutton13cp = (accessgetButton13cp) this.serializer;
        URL url = (URL) emojiProcessor.serializer;
        if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(accessgetbutton13cp.read);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(ConstantKt.USER_AGENT_HEADER, "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(ConstantKt.CONTENT_TYPE_HEADER, ConstantKt.CONTENT_TYPE_JSON);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) emojiProcessor.IconCompatParcelizer;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
            int i2 = write + 65;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    CreateHomeScope createHomeScope = accessgetbutton13cp.write;
                    accessgetButtonL2cp accessgetbuttonl2cp = (accessgetButtonL2cp) emojiProcessor.read;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    detachAndRemoveNode detachandremovenode = (detachAndRemoveNode) createHomeScope.read;
                    JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(bufferedWriter, detachandremovenode.MediaBrowserCompatMediaItem, detachandremovenode.MediaMetadataCompat, detachandremovenode.RemoteActionCompatParcelizer, detachandremovenode.RatingCompat);
                    jsonValueObjectEncoderContext.RemoteActionCompatParcelizer(accessgetbuttonl2cp);
                    jsonValueObjectEncoderContext.IconCompatParcelizer();
                    jsonValueObjectEncoderContext.IconCompatParcelizer.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", Integer.valueOf(responseCode));
                    }
                    RangesKt.serializer(httpURLConnection.getHeaderField(ConstantKt.CONTENT_TYPE_HEADER), "CctTransportBackend", "Content-Type: %s");
                    RangesKt.serializer(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new isEndBoundary(responseCode, new URL(httpURLConnection.getHeaderField(ActivityRecognitionConstants.LOCATION_MODULE)), 0L);
                    }
                    if (responseCode != 200) {
                        return new isEndBoundary(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            gZIPInputStream = new GZIPInputStream(inputStream);
                            int i4 = IconCompatParcelizer + 73;
                            write = i4 % Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                        } else {
                            gZIPInputStream = inputStream;
                        }
                        try {
                            isEndBoundary isendboundary = new isEndBoundary(responseCode, null, accessgetButtonYcp.write(new BufferedReader(new InputStreamReader(gZIPInputStream))).IconCompatParcelizer);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                int i6 = write + 111;
                                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                                inputStream.close();
                            }
                            return isendboundary;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        int i8 = IconCompatParcelizer + 113;
                        write = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    int i10 = write + 39;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    try {
                        if (i10 % 2 == 0) {
                            gZIPOutputStream.close();
                            int i11 = 1 / 0;
                        } else {
                            gZIPOutputStream.close();
                        }
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (EncodingException e) {
            e = e;
            RangesKt.serializer("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new isEndBoundary(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            int i12 = IconCompatParcelizer + 85;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            RangesKt.serializer("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new isEndBoundary(Constant.ERROR_UNKNOWN, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            int i14 = IconCompatParcelizer + 85;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            RangesKt.serializer("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new isEndBoundary(Constant.ERROR_UNKNOWN, null, 0L);
        } catch (IOException e4) {
            e = e4;
            RangesKt.serializer("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new isEndBoundary(400, null, 0L);
        }
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        write = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.serializer;
        if (i3 == 3) {
            obj.getClass();
            return (Scheduler) ((getCompositingStrategyke2Ky5w) obj3).invoke(obj);
        }
        if (i3 == 4) {
            obj.getClass();
            return (Scheduler) ((getCompositingStrategyke2Ky5w) obj3).invoke(obj);
        }
        if (i3 != 5) {
            if (i3 != 6) {
                obj.getClass();
                return (ObservableSource) ((getReject5zf0vsI) obj3).invoke(obj);
            }
            obj.getClass();
            return (Scheduler) ((getCompositingStrategyke2Ky5w) obj3).invoke(obj);
        }
        obj.getClass();
        Scheduler scheduler = (Scheduler) ((getCompositingStrategyke2Ky5w) obj3).invoke(obj);
        int i4 = write + 119;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return scheduler;
        }
        obj2.hashCode();
        throw null;
    }
}
