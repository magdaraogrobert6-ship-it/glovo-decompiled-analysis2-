package com.huawei.agconnect.config.impl;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.Image;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.util.Log;
import android.util.LruCache;
import androidx.compose.ui.graphics.Fields;
import androidx.room.Room;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.appupdate.zzz;
import com.google.re2j.Parser;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.ut;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BillingService;
import com.mapbox.common.BillingServiceFactory;
import com.mapbox.common.TelemetrySystemUtils;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.navigation.core.telemetry.ApplicationLifecycleMonitor;
import com.mapbox.navigation.tripdata.shield.RoadShieldContentManagerContainer;
import com.mapbox.navigation.ui.maps.util.CacheResultUtils$CacheResultCall;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.mapbox.navigation.voice.api.MapboxVoiceApi$retrieveVoiceFile$1;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.model.VoiceState$VoiceError;
import com.mapbox.navigation.voice.model.VoiceState$VoiceFile;
import com.mapbox.navigator.AudioType;
import com.mapbox.navigator.EventsMetadata;
import com.mapbox.navigator.EventsMetadataInterface;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannerScreenKt;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.helpcenter.data.help_center_url.HelpCenterUrlRepository$fetchHelpCenterUrl$1;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.liveness.data.LivenessRepository$uploadImage$1;
import com.roadrunner.liveness.data.LivenessRepository$uploadImage$2;
import com.roadrunner.map.container.initialisation.InitialiseMapBox$initializeWithYield$1;
import com.roadrunner.opportunities.calendar.data.BonusCalendarRepository$fetchBonusMultipliers$1;
import io.sentry.util.UrlUtils;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import leakcanary.ViewLocationHolderLeakFix$applyFix$2;
import o.AndroidFontResourceLoader;
import o.AndroidWindowInfo_androidKt;
import o.BackStackState;
import o.DragAndDropTargetModifierNode;
import o.FeatureCombinationQueryImplExternalSyntheticLambda2;
import o.Owner;
import o.Placeable;
import o.RoomDatabaseExternalSyntheticLambda2;
import o.RoomDatabaseperformClear11;
import o.SelectionMagnifierKt;
import o.SemanticsPropertyKeydefault;
import o.ShortNewsContentCardView;
import o.WrappedCompositionsetContent1211;
import o.accessgetHasRetrievedMethodcp;
import o.accessgetInstancedelegatecp;
import o.accessgetMinimumTouchTargetSizeMYxV2XQjd;
import o.accessgetOldDependencyp;
import o.accessgetOutlineProvidercp;
import o.accessgetParentLayoutDirection;
import o.accessgetRecreateDisplayListcp;
import o.accessgetShouldUseDispatchDrawcp;
import o.accessminIntrinsicWidthjd;
import o.bitOffsetToIndex;
import o.copyw_4Rhrw;
import o.countOccurrences;
import o.createNewStatement;
import o.createViewHolder;
import o.ensureAnimationInfo;
import o.findOverlaps;
import o.fixedJhjzzOo;
import o.forceMeasureTheSubtreedefault;
import o.getItemViewType;
import o.getLocalSavedStateRegistryOwnerannotations;
import o.getPageRight;
import o.getPasteText;
import o.getRectManager;
import o.getRequestFocus;
import o.getSetProgress;
import o.getStartEllipsisgIe3tQ8;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.isShowingLayoutBounds;
import o.load;
import o.n6;
import o.notifyDataSetChanged;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.onDestroyActionMode;
import o.onEndApplyChanges;
import o.onItemDismiss;
import o.onPostAttach;
import o.prepareForActivityTransitionCarryover;
import o.processDataSetCompletelyChanged;
import o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI;
import o.removeNodeAtDepth;
import o.safeSetClipToOutline;
import o.setContentInsetEndWithActions;
import o.setOnEventTrackingSucceededListener;
import o.setRequestedFrameRate;
import o.setTransactionSuccessful;
import o.toContentCaptureSession;
import o.toExtractedText;
import o.unpackInt2;
import o.visitNodesaLcG6gQ;
import o.w5;
import o.wa;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements load, accessgetHasRetrievedMethodcp, EventsMetadataInterface, SemanticsPropertyKeydefault, toExtractedText, setContentInsetEndWithActions {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ int write;

    public void read(boolean z) {
        synchronized (((ArrayList) this.read)) {
            Iterator it = ((ArrayList) this.read).iterator();
            while (it.hasNext()) {
                ((onPostAttach) it.next()).IconCompatParcelizer(z ? Owner.REACHABLE : Owner.UNREACHABLE);
            }
        }
    }

    public m(int i) {
        this.write = i;
        int i2 = 2;
        if (i == 2) {
            this.RemoteActionCompatParcelizer = new Rect();
            this.read = new Rect();
            return;
        }
        if (i == 10) {
            this.RemoteActionCompatParcelizer = RoadShieldContentManagerContainer.INSTANCE;
            onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            this.read = new JobControl(onbackinvokedlambda0Serializer, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read)));
            return;
        }
        if (i == 28) {
            this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new wa(3));
            this.read = new RetryWithDelay$$ExternalSyntheticLambda0(23, this);
            return;
        }
        if (i != 7) {
            if (i != 8) {
                return;
            }
            n0 n0Var = new n0(0);
            BillingService billingServiceFactory = BillingServiceFactory.getInstance();
            billingServiceFactory.getClass();
            AnalyticsServiceImpl analyticsServiceImpl = new AnalyticsServiceImpl(i2, billingServiceFactory);
            this.RemoteActionCompatParcelizer = n0Var;
            this.read = analyticsServiceImpl;
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        onDestroyActionMode ondestroyactionmode = new onDestroyActionMode("Location-Task");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 100, 60L, timeUnit, linkedBlockingQueue, ondestroyactionmode);
        this.RemoteActionCompatParcelizer = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10, new onDestroyActionMode("Loc-Task-Delay"));
        this.read = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, timeUnit);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public void serializer(getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((ConcurrentHashMap) this.RemoteActionCompatParcelizer).put(((AndroidFontResourceLoader) this.read).write(getlocalsavedstateregistryownerannotations), getlocalsavedstateregistryownerannotations);
            throw null;
        }
        ((ConcurrentHashMap) this.RemoteActionCompatParcelizer).put(((AndroidFontResourceLoader) this.read).write(getlocalsavedstateregistryownerannotations), getlocalsavedstateregistryownerannotations);
        int i3 = IconCompatParcelizer + 101;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public DragAndDropTargetModifierNode serializer() {
        int i = 2 % 2;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(14, this), true, -1728229082);
        int i2 = IconCompatParcelizer + 91;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return dragAndDropTargetModifierNode;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            onEndApplyChanges.read("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
            if (read()) {
                read(true);
            }
        } else {
            onEndApplyChanges.read("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
            if (read()) {
                read(true);
            }
        }
        int i3 = serializer + 59;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void IconCompatParcelizer(FutureTask futureTask) {
        int i = 2 % 2;
        try {
            Thread thread = new Thread(futureTask);
            thread.setName(Thread.currentThread().getName());
            thread.start();
            int i2 = IconCompatParcelizer + 123;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable unused) {
            WrappedCompositionsetContent1211.serializer("ExecutorUtil", "ExecutorUtil futureTask error");
        }
    }

    public boolean read() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) this.RemoteActionCompatParcelizer).getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        int i4 = serializer + 33;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            activeNetworkInfo.isConnected();
            throw null;
        }
        if (!activeNetworkInfo.isConnected()) {
            return false;
        }
        int i5 = serializer + 43;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    public void IconCompatParcelizer(Runnable runnable) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            ((ThreadPoolExecutor) this.RemoteActionCompatParcelizer).execute(runnable);
            int i4 = IconCompatParcelizer + 81;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable unused) {
            WrappedCompositionsetContent1211.serializer("ExecutorUtil", "ExecutorUtil fatal error");
        }
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        if (i4 == 0) {
            return "SecurityResourcesReader{mKey=, encrypt=true}";
        }
        Object obj = null;
        if (i4 != 3) {
            String string = super.toString();
            int i5 = IconCompatParcelizer + 71;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        }
        String str = "DatabaseInfo(databaseId:" + ((visitNodesaLcG6gQ) this.RemoteActionCompatParcelizer) + " host:firestore.googleapis.com)";
        int i6 = IconCompatParcelizer + 125;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public copyw_4Rhrw serializer(String str, Map map) {
        int i = 2 % 2;
        ((zzz) this.RemoteActionCompatParcelizer).getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.put("event_version", "1");
        safesetcliptooutline.putAll(map);
        copyw_4Rhrw copyw_4rhrw = new copyw_4Rhrw(string, str, safesetcliptooutline.IconCompatParcelizer());
        int i2 = IconCompatParcelizer + 125;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return copyw_4rhrw;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX INFO: renamed from: fetchBonusMultipliers-0E7RQCE, reason: not valid java name */
    public Object m4503fetchBonusMultipliers0E7RQCE(int i, String str, ContinuationImpl continuationImpl) {
        BonusCalendarRepository$fetchBonusMultipliers$1 bonusCalendarRepository$fetchBonusMultipliers$1;
        int i2;
        int i3 = 2 % 2;
        if (!(continuationImpl instanceof BonusCalendarRepository$fetchBonusMultipliers$1)) {
            bonusCalendarRepository$fetchBonusMultipliers$1 = new BonusCalendarRepository$fetchBonusMultipliers$1(this, continuationImpl);
            i2 = IconCompatParcelizer + 123;
        } else {
            int i4 = serializer + 41;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            bonusCalendarRepository$fetchBonusMultipliers$1 = (BonusCalendarRepository$fetchBonusMultipliers$1) continuationImpl;
            int i6 = bonusCalendarRepository$fetchBonusMultipliers$1.write;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bonusCalendarRepository$fetchBonusMultipliers$1.write = i6 - Integer.MIN_VALUE;
                i2 = IconCompatParcelizer + 17;
            } else {
                bonusCalendarRepository$fetchBonusMultipliers$1 = new BonusCalendarRepository$fetchBonusMultipliers$1(this, continuationImpl);
                i2 = IconCompatParcelizer + 123;
            }
        }
        serializer = i2 % Fields.SpotShadowColor;
        int i7 = i2 % 2;
        Object obj = bonusCalendarRepository$fetchBonusMultipliers$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = bonusCalendarRepository$fetchBonusMultipliers$1.write;
        if (i8 != 0) {
            if (i8 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.read;
        InitialiseMapBox$initializeWithYield$1.AnonymousClass1 anonymousClass1 = new InitialiseMapBox$initializeWithYield$1.AnonymousClass1(this, i, str, null);
        bonusCalendarRepository$fetchBonusMultipliers$1.write = 1;
        Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(anonymousClass1, bonusCalendarRepository$fetchBonusMultipliers$1);
        return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX INFO: renamed from: fetchHelpCenterUrl-gIAlu-s, reason: not valid java name */
    public Object m4504fetchHelpCenterUrlgIAlus(ensureAnimationInfo ensureanimationinfo, ContinuationImpl continuationImpl) {
        HelpCenterUrlRepository$fetchHelpCenterUrl$1 helpCenterUrlRepository$fetchHelpCenterUrl$1;
        int i = 2 % 2;
        int i2 = serializer + 81;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (continuationImpl instanceof HelpCenterUrlRepository$fetchHelpCenterUrl$1) {
            int i5 = i3 + 105;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            helpCenterUrlRepository$fetchHelpCenterUrl$1 = (HelpCenterUrlRepository$fetchHelpCenterUrl$1) continuationImpl;
            int i7 = helpCenterUrlRepository$fetchHelpCenterUrl$1.write;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = serializer + 23;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    helpCenterUrlRepository$fetchHelpCenterUrl$1.write = i7 >> Integer.MIN_VALUE;
                } else {
                    helpCenterUrlRepository$fetchHelpCenterUrl$1.write = i7 - Integer.MIN_VALUE;
                }
            } else {
                helpCenterUrlRepository$fetchHelpCenterUrl$1 = new HelpCenterUrlRepository$fetchHelpCenterUrl$1(this, continuationImpl);
                int i9 = IconCompatParcelizer + 61;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
        } else {
            helpCenterUrlRepository$fetchHelpCenterUrl$1 = new HelpCenterUrlRepository$fetchHelpCenterUrl$1(this, continuationImpl);
            int i11 = IconCompatParcelizer + 61;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        Object obj = helpCenterUrlRepository$fetchHelpCenterUrl$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = helpCenterUrlRepository$fetchHelpCenterUrl$1.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i13 != 0) {
            if (i13 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.read;
        AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, ensureanimationinfo, shortNewsContentCardView, 17);
        helpCenterUrlRepository$fetchHelpCenterUrl$1.write = 1;
        Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(authRepository$logoutUser$2, helpCenterUrlRepository$fetchHelpCenterUrl$1);
        return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
    }

    @Override // o.setContentInsetEndWithActions
    public void serializer(FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Image imageRemoteActionCompatParcelizer = featureCombinationQueryImplExternalSyntheticLambda2.IconCompatParcelizer.RemoteActionCompatParcelizer();
        Object obj = null;
        if (imageRemoteActionCompatParcelizer == null) {
            int i4 = IconCompatParcelizer + 17;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                featureCombinationQueryImplExternalSyntheticLambda2.close();
                return;
            } else {
                featureCombinationQueryImplExternalSyntheticLambda2.close();
                obj.hashCode();
                throw null;
            }
        }
        setRequestedFrameRate setrequestedframerateRemoteActionCompatParcelizer = setRequestedFrameRate.RemoteActionCompatParcelizer(imageRemoteActionCompatParcelizer, featureCombinationQueryImplExternalSyntheticLambda2.write.read());
        isShowingLayoutBounds isshowinglayoutbounds = (isShowingLayoutBounds) this.read;
        Task taskOnSuccessTask = isshowinglayoutbounds.serializer(setrequestedframerateRemoteActionCompatParcelizer).onSuccessTask(new toContentCaptureSession(isshowinglayoutbounds, setrequestedframerateRemoteActionCompatParcelizer.read, setrequestedframerateRemoteActionCompatParcelizer.IconCompatParcelizer));
        int i5 = 0;
        RetryWithDelay$$ExternalSyntheticLambda1 retryWithDelay$$ExternalSyntheticLambda1 = new RetryWithDelay$$ExternalSyntheticLambda1(10, new BarcodeAnalyzer$$ExternalSyntheticLambda0(i5, this));
        zzw zzwVar = (zzw) taskOnSuccessTask;
        accessgetParentLayoutDirection accessgetparentlayoutdirection = Placeable.RemoteActionCompatParcelizer;
        zzwVar.addOnSuccessListener(accessgetparentlayoutdirection, retryWithDelay$$ExternalSyntheticLambda1);
        zzwVar.addOnFailureListener(accessgetparentlayoutdirection, new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(4));
        zzwVar.addOnCompleteListener(new getStartEllipsisgIe3tQ8(featureCombinationQueryImplExternalSyntheticLambda2, i5));
        int i6 = IconCompatParcelizer + 7;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public String IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = serializer + 119;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        if (str.length() < 2) {
            return "";
        }
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        int iCodePointAt = Character.codePointAt(upperCase, 0);
        int iCodePointAt2 = Character.codePointAt(upperCase, 1);
        char[] chars = Character.toChars(iCodePointAt + 127397);
        chars.getClass();
        String str2 = new String(chars);
        char[] chars2 = Character.toChars(iCodePointAt2 + 127397);
        chars2.getClass();
        String strConcat = str2.concat(new String(chars2));
        if (!((Boolean) ((RetryWithDelay$$ExternalSyntheticLambda0) this.read).invoke(strConcat)).booleanValue()) {
            return "";
        }
        int i4 = serializer + 3;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strConcat;
    }

    public Object invoke(CacheResultUtils$CacheResultCall cacheResultUtils$CacheResultCall) {
        Object objInvoke;
        synchronized (((LruCache) this.read)) {
            objInvoke = ((LruCache) this.read).get(cacheResultUtils$CacheResultCall);
            if (objInvoke == null) {
                objInvoke = cacheResultUtils$CacheResultCall.invoke((Lambda) this.RemoteActionCompatParcelizer);
                ((LruCache) this.read).put(cacheResultUtils$CacheResultCall, objInvoke);
            }
        }
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX INFO: renamed from: uploadImage-bMdYcbs, reason: not valid java name */
    public Object m4505uploadImagebMdYcbs(r8lambdaCTegLFIY2N5eeYL50pY32CICZRI r8lambdacteglfiy2n5eeyl50py32ciczri, String str, String str2, boolean z, RoomDatabaseperformClear11 roomDatabaseperformClear11, RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2, ContinuationImpl continuationImpl) {
        LivenessRepository$uploadImage$1 livenessRepository$uploadImage$1;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof LivenessRepository$uploadImage$1) {
            livenessRepository$uploadImage$1 = (LivenessRepository$uploadImage$1) continuationImpl;
            int i4 = livenessRepository$uploadImage$1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = serializer + 101;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                livenessRepository$uploadImage$1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                livenessRepository$uploadImage$1 = new LivenessRepository$uploadImage$1(this, continuationImpl);
            }
        } else {
            livenessRepository$uploadImage$1 = new LivenessRepository$uploadImage$1(this, continuationImpl);
        }
        LivenessRepository$uploadImage$1 livenessRepository$uploadImage$2 = livenessRepository$uploadImage$1;
        Object obj = livenessRepository$uploadImage$2.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = livenessRepository$uploadImage$2.IconCompatParcelizer;
        if (i7 != 0) {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = IconCompatParcelizer + 91;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.read;
        LivenessRepository$uploadImage$2 livenessRepository$uploadImage$3 = new LivenessRepository$uploadImage$2(this, r8lambdacteglfiy2n5eeyl50py32ciczri, str, str2, z, roomDatabaseperformClear11, roomDatabaseExternalSyntheticLambda2, null);
        livenessRepository$uploadImage$2.IconCompatParcelizer = 1;
        Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(livenessRepository$uploadImage$3, livenessRepository$uploadImage$2);
        if (objM4875invokegIAlus != coroutineSingletons) {
            return objM4875invokegIAlus;
        }
        int i10 = serializer + 33;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return coroutineSingletons;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    public getItemViewType write(processDataSetCompletelyChanged processdatasetcompletelychanged) {
        notifyDataSetChanged notifydatasetchanged;
        int i = 2 % 2;
        String str = processdatasetcompletelychanged.text;
        g0 g0Var = (g0) this.RemoteActionCompatParcelizer;
        String str2 = processdatasetcompletelychanged.style;
        g0Var.getClass();
        str2.getClass();
        switch (str2) {
            case "button.primary.big":
                notifydatasetchanged = notifyDataSetChanged.PRIMARY_BIG;
                break;
            case "button.primary.small":
                notifydatasetchanged = notifyDataSetChanged.PRIMARY_SMALL;
                break;
            case "button.secondary.small":
                notifyDataSetChanged notifydatasetchanged2 = notifyDataSetChanged.SECONDARY_SMALL;
                int i2 = serializer + 91;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                notifydatasetchanged = notifydatasetchanged2;
                break;
            case "button.secondary.big":
                notifydatasetchanged = notifyDataSetChanged.SECONDARY_BIG;
                break;
            default:
                notifydatasetchanged = notifyDataSetChanged.PRIMARY_BIG;
                break;
        }
        g0 g0Var2 = (g0) this.read;
        Float f = processdatasetcompletelychanged.weight;
        g0Var2.getClass();
        return new getItemViewType(str, notifydatasetchanged, g0.write(f), new createViewHolder(processdatasetcompletelychanged.action, processdatasetcompletelychanged.id));
    }

    public /* synthetic */ m(Object obj, int i, Object obj2) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
    }

    public m(BackStackState backStackState, ExecuteApiRequest executeApiRequest) {
        this.write = 24;
        backStackState.getClass();
        executeApiRequest.getClass();
        this.RemoteActionCompatParcelizer = backStackState;
        this.read = executeApiRequest;
    }

    public m(w5 w5Var, ExecuteApiRequest executeApiRequest) {
        this.write = 29;
        w5Var.getClass();
        executeApiRequest.getClass();
        this.RemoteActionCompatParcelizer = w5Var;
        this.read = executeApiRequest;
    }

    public m(g0 g0Var, g0 g0Var2) {
        this.write = 26;
        g0Var.getClass();
        g0Var2.getClass();
        this.RemoteActionCompatParcelizer = g0Var;
        this.read = g0Var2;
    }

    public m(setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.write = 23;
        setoneventtrackingsucceededlistener.getClass();
        isopeninternalroom_runtime.getClass();
        this.RemoteActionCompatParcelizer = setoneventtrackingsucceededlistener;
        this.read = isopeninternalroom_runtime;
    }

    public m(n6 n6Var, unpackInt2 unpackint2) {
        this.write = 20;
        n6Var.getClass();
        unpackint2.getClass();
        this.RemoteActionCompatParcelizer = n6Var;
        this.read = unpackint2;
    }

    public m(IsFixableByRetry isFixableByRetry, g0 g0Var) {
        this.write = 22;
        isFixableByRetry.getClass();
        g0Var.getClass();
        this.RemoteActionCompatParcelizer = isFixableByRetry;
        this.read = g0Var;
    }

    public m(setTransactionSuccessful settransactionsuccessful, AnalyticsServiceImpl analyticsServiceImpl) {
        this.write = 15;
        settransactionsuccessful.getClass();
        analyticsServiceImpl.getClass();
        this.RemoteActionCompatParcelizer = settransactionsuccessful;
        this.read = analyticsServiceImpl;
    }

    public m(SelectionMagnifierKt selectionMagnifierKt) {
        this.write = 21;
        this.RemoteActionCompatParcelizer = selectionMagnifierKt;
        this.read = AndroidWindowInfo_androidKt.read(ScannerScreenKt.RemoteActionCompatParcelizer);
    }

    public m(Context context, String str) {
        this.write = 0;
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
        this.read = new i$d.a(context, str);
    }

    public m(n0 n0Var, p0 p0Var) {
        this.write = 19;
        n0Var.getClass();
        p0Var.getClass();
        this.RemoteActionCompatParcelizer = n0Var;
        this.read = p0Var;
    }

    public static Set write(List list) {
        Object next;
        int i = 2 % 2;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i2 = serializer + 89;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                boolean z = it.next() instanceof fixedJhjzzOo;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next2 = it.next();
            if (next2 instanceof fixedJhjzzOo) {
                arrayList.add(next2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((fixedJhjzzOo) obj2).currentStateType.isDone()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((fixedJhjzzOo) it2.next()).id);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (!(!it3.hasNext())) {
            int i3 = serializer + 37;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                next = it3.next();
                int i4 = 37 / 0;
                if (!(!(next instanceof bitOffsetToIndex))) {
                    arrayList4.add(next);
                }
            } else {
                next = it3.next();
                if (next instanceof bitOffsetToIndex) {
                    arrayList4.add(next);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((bitOffsetToIndex) obj3).currentStateType.isDone()) {
                arrayList5.add(obj3);
                int i5 = IconCompatParcelizer + 69;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(arrayList5, 10));
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            int i7 = IconCompatParcelizer + 61;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            arrayList6.add(((bitOffsetToIndex) it4.next()).id);
        }
        return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(onContentCardDismissed.IconCompatParcelizer(arrayList6, arrayList3));
    }

    public m(NestComponentRepositoryImpl nestComponentRepositoryImpl, p0 p0Var) {
        this.write = 25;
        nestComponentRepositoryImpl.getClass();
        p0Var.getClass();
        this.RemoteActionCompatParcelizer = nestComponentRepositoryImpl;
        this.read = p0Var;
    }

    public m(createNewStatement createnewstatement, ExecuteApiRequest executeApiRequest) {
        this.write = 27;
        createnewstatement.getClass();
        executeApiRequest.getClass();
        this.RemoteActionCompatParcelizer = createnewstatement;
        this.read = executeApiRequest;
    }

    public m(MapboxMap mapboxMap, CameraAnimationsPlugin cameraAnimationsPlugin) {
        this.write = 11;
        x xVar = new x(mapboxMap, cameraAnimationsPlugin);
        this.RemoteActionCompatParcelizer = mapboxMap;
        this.read = xVar;
    }

    public m(Context context, ApplicationLifecycleMonitor applicationLifecycleMonitor) {
        this.write = 9;
        applicationLifecycleMonitor.getClass();
        this.RemoteActionCompatParcelizer = context;
        this.read = applicationLifecycleMonitor;
    }

    public m(zzz zzzVar, accessgetOldDependencyp accessgetolddependencyp) {
        this.write = 17;
        zzzVar.getClass();
        accessgetolddependencyp.getClass();
        this.RemoteActionCompatParcelizer = zzzVar;
        this.read = accessgetolddependencyp;
    }

    public m(AndroidFontResourceLoader androidFontResourceLoader) {
        this.write = 6;
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
        this.read = androidFontResourceLoader;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #2 {all -> 0x00d9, blocks: (B:41:0x00a2, B:43:0x00ab, B:45:0x00b4, B:47:0x00c2, B:55:0x00db, B:56:0x00e4), top: B:76:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db A[Catch: all -> 0x00d9, TRY_ENTER, TryCatch #2 {all -> 0x00d9, blocks: (B:41:0x00a2, B:43:0x00ab, B:45:0x00b4, B:47:0x00c2, B:55:0x00db, B:56:0x00e4), top: B:76:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0109, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [com.huawei.wisesecurity.ucs_credential.x] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.mapbox.navigation.voice.api.MapboxVoiceApi$retrieveVoiceFile$1, kotlin.coroutines.jvm.internal.ContinuationImpl, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public Object retrieveVoiceFile(VoiceInstructions voiceInstructions, ContinuationImpl continuationImpl) {
        MapboxVoiceApi$retrieveVoiceFile$1 mapboxVoiceApi$retrieveVoiceFile$1;
        int i;
        ?? r1;
        Object objWithContext;
        CoroutineSingletons coroutineSingletons;
        int i2;
        ShortNewsContentCardView shortNewsContentCardView;
        Object isitemdismissable;
        ?? r2;
        Throwable thSerializer;
        String localizedMessage;
        Object objLoad;
        m mVar;
        m mVar2;
        Object obj;
        m mVar3;
        Throwable th;
        VoiceInstructions voiceInstructions2;
        Expected expected;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = serializer + 23;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        try {
            try {
                try {
                    if (i6 % 2 != 0) {
                        if (!(!(continuationImpl instanceof MapboxVoiceApi$retrieveVoiceFile$1))) {
                            mapboxVoiceApi$retrieveVoiceFile$1 = (MapboxVoiceApi$retrieveVoiceFile$1) continuationImpl;
                            i = mapboxVoiceApi$retrieveVoiceFile$1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                mapboxVoiceApi$retrieveVoiceFile$1.label = i - Integer.MIN_VALUE;
                                r1 = mapboxVoiceApi$retrieveVoiceFile$1;
                            }
                        }
                        objWithContext = r1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = r1.label;
                        shortNewsContentCardView = null;
                        if (i2 != 0) {
                            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                            ?? r11 = (x) this.RemoteActionCompatParcelizer;
                            r1.L$0 = this;
                            r1.L$1 = voiceInstructions;
                            r1.L$2 = this;
                            r1.L$3 = this;
                            r1.label = 1;
                            objLoad = r11.load(voiceInstructions, r1);
                            if (objLoad != coroutineSingletons) {
                                mVar = this;
                                mVar2 = mVar;
                                obj = objLoad;
                                mVar3 = mVar2;
                            }
                            return coroutineSingletons;
                        }
                        if (i2 == 1) {
                            m mVar4 = r1.L$3;
                            m mVar5 = r1.L$2;
                            voiceInstructions2 = r1.L$1;
                            mVar2 = r1.L$0;
                            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                            mVar3 = mVar4;
                            voiceInstructions = voiceInstructions2;
                            mVar = mVar5;
                            obj = objWithContext;
                        } else {
                            if (i2 != 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = serializer + 27;
                            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                voiceInstructions = r1.L$1;
                                m mVar6 = r1.L$0;
                                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                                int i7 = 39 / 0;
                                r1 = mVar6;
                            } else {
                                voiceInstructions = r1.L$1;
                                m mVar7 = r1.L$0;
                                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                                r1 = mVar7;
                            }
                        }
                        isitemdismissable = new VoiceState$VoiceFile((File) objWithContext);
                        r2 = r1;
                        thSerializer = onItemDismiss.serializer(isitemdismissable);
                        if (thSerializer == null) {
                            return isitemdismissable;
                        }
                        localizedMessage = thSerializer.getLocalizedMessage();
                        if (localizedMessage == null) {
                            r2.getClass();
                            localizedMessage = "Cannot load voice instructions " + voiceInstructions;
                        }
                        return new VoiceState$VoiceError(localizedMessage);
                        expected = (Expected) obj;
                        mVar3.getClass();
                        if (expected.isError()) {
                            Object error = expected.getError();
                            error.getClass();
                            throw ((Throwable) error);
                        }
                        Object value = expected.getValue();
                        value.getClass();
                        InputStream inputStream = (InputStream) value;
                        Parser.Pair pair = (Parser.Pair) mVar.read;
                        r1.L$0 = mVar2;
                        r1.L$1 = voiceInstructions;
                        r1.L$2 = null;
                        r1.L$3 = null;
                        r1.label = 2;
                        objWithContext = BuildersKt.withContext(ThreadController.IODispatcher, new LocalAuthDataSource.AnonymousClass2(pair, inputStream, shortNewsContentCardView, i4), r1);
                        if (objWithContext != coroutineSingletons) {
                            r1 = mVar2;
                            isitemdismissable = new VoiceState$VoiceFile((File) objWithContext);
                            r2 = r1;
                            thSerializer = onItemDismiss.serializer(isitemdismissable);
                            if (thSerializer == null) {
                                return isitemdismissable;
                            }
                            localizedMessage = thSerializer.getLocalizedMessage();
                            if (localizedMessage == null) {
                                r2.getClass();
                                localizedMessage = "Cannot load voice instructions " + voiceInstructions;
                            }
                            return new VoiceState$VoiceError(localizedMessage);
                        }
                        return coroutineSingletons;
                    }
                    int i8 = 74 / 0;
                    if (continuationImpl instanceof MapboxVoiceApi$retrieveVoiceFile$1) {
                        mapboxVoiceApi$retrieveVoiceFile$1 = (MapboxVoiceApi$retrieveVoiceFile$1) continuationImpl;
                        i = mapboxVoiceApi$retrieveVoiceFile$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            mapboxVoiceApi$retrieveVoiceFile$1.label = i - Integer.MIN_VALUE;
                            r1 = mapboxVoiceApi$retrieveVoiceFile$1;
                        }
                    }
                    objWithContext = r1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = r1.label;
                    shortNewsContentCardView = null;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            m mVar8 = r1.L$3;
                            m mVar9 = r1.L$2;
                            voiceInstructions2 = r1.L$1;
                            mVar2 = r1.L$0;
                            try {
                                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                                mVar3 = mVar8;
                                voiceInstructions = voiceInstructions2;
                                mVar = mVar9;
                                obj = objWithContext;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                voiceInstructions = voiceInstructions2;
                                r1 = mVar2;
                                isitemdismissable = new isItemDismissable(th);
                                int i9 = serializer + 63;
                                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                                int i10 = i9 % 2;
                                r2 = r1;
                                thSerializer = onItemDismiss.serializer(isitemdismissable);
                                if (thSerializer == null) {
                                    return isitemdismissable;
                                }
                                localizedMessage = thSerializer.getLocalizedMessage();
                                if (localizedMessage == null) {
                                    r2.getClass();
                                    localizedMessage = "Cannot load voice instructions " + voiceInstructions;
                                }
                                return new VoiceState$VoiceError(localizedMessage);
                            }
                        } else {
                            if (i2 != 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = serializer + 27;
                            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                voiceInstructions = r1.L$1;
                                m mVar10 = r1.L$0;
                                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                                int i11 = 39 / 0;
                                r1 = mVar10;
                            } else {
                                voiceInstructions = r1.L$1;
                                m mVar11 = r1.L$0;
                                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                                r1 = mVar11;
                            }
                        }
                        isitemdismissable = new VoiceState$VoiceFile((File) objWithContext);
                        r2 = r1;
                        thSerializer = onItemDismiss.serializer(isitemdismissable);
                        if (thSerializer == null) {
                            return isitemdismissable;
                        }
                        localizedMessage = thSerializer.getLocalizedMessage();
                        if (localizedMessage == null) {
                            r2.getClass();
                            localizedMessage = "Cannot load voice instructions " + voiceInstructions;
                        }
                        return new VoiceState$VoiceError(localizedMessage);
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                    try {
                        ?? r12 = (x) this.RemoteActionCompatParcelizer;
                        r1.L$0 = this;
                        r1.L$1 = voiceInstructions;
                        r1.L$2 = this;
                        r1.L$3 = this;
                        r1.label = 1;
                        objLoad = r12.load(voiceInstructions, r1);
                        if (objLoad != coroutineSingletons) {
                            mVar = this;
                            mVar2 = mVar;
                            obj = objLoad;
                            mVar3 = mVar2;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        r1 = this;
                        isitemdismissable = new isItemDismissable(th);
                        int i12 = serializer + 63;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        r2 = r1;
                    }
                    expected = (Expected) obj;
                    mVar3.getClass();
                    if (expected.isError()) {
                        Object error2 = expected.getError();
                        error2.getClass();
                        throw ((Throwable) error2);
                    }
                    Object value2 = expected.getValue();
                    value2.getClass();
                    InputStream inputStream2 = (InputStream) value2;
                    Parser.Pair pair2 = (Parser.Pair) mVar.read;
                    r1.L$0 = mVar2;
                    r1.L$1 = voiceInstructions;
                    r1.L$2 = null;
                    r1.L$3 = null;
                    r1.label = 2;
                    objWithContext = BuildersKt.withContext(ThreadController.IODispatcher, new LocalAuthDataSource.AnonymousClass2(pair2, inputStream2, shortNewsContentCardView, i4), r1);
                    if (objWithContext != coroutineSingletons) {
                        r1 = mVar2;
                        isitemdismissable = new VoiceState$VoiceFile((File) objWithContext);
                        r2 = r1;
                        thSerializer = onItemDismiss.serializer(isitemdismissable);
                        if (thSerializer == null) {
                            return isitemdismissable;
                        }
                        localizedMessage = thSerializer.getLocalizedMessage();
                        if (localizedMessage == null) {
                            r2.getClass();
                            localizedMessage = "Cannot load voice instructions " + voiceInstructions;
                        }
                        return new VoiceState$VoiceError(localizedMessage);
                    }
                    return coroutineSingletons;
                    if (i2 != 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                        ?? r13 = (x) this.RemoteActionCompatParcelizer;
                        r1.L$0 = this;
                        r1.L$1 = voiceInstructions;
                        r1.L$2 = this;
                        r1.L$3 = this;
                        r1.label = 1;
                        objLoad = r13.load(voiceInstructions, r1);
                        if (objLoad != coroutineSingletons) {
                            mVar = this;
                            mVar2 = mVar;
                            obj = objLoad;
                            mVar3 = mVar2;
                        }
                        return coroutineSingletons;
                    }
                    if (i2 == 1) {
                        m mVar12 = r1.L$3;
                        m mVar13 = r1.L$2;
                        voiceInstructions2 = r1.L$1;
                        mVar2 = r1.L$0;
                        ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                        mVar3 = mVar12;
                        voiceInstructions = voiceInstructions2;
                        mVar = mVar13;
                        obj = objWithContext;
                    } else {
                        if (i2 != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = serializer + 27;
                        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            voiceInstructions = r1.L$1;
                            m mVar14 = r1.L$0;
                            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                            int i14 = 39 / 0;
                            r1 = mVar14;
                        } else {
                            voiceInstructions = r1.L$1;
                            m mVar15 = r1.L$0;
                            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                            r1 = mVar15;
                        }
                    }
                    isitemdismissable = new VoiceState$VoiceFile((File) objWithContext);
                    r2 = r1;
                    thSerializer = onItemDismiss.serializer(isitemdismissable);
                    if (thSerializer == null) {
                        return isitemdismissable;
                    }
                    localizedMessage = thSerializer.getLocalizedMessage();
                    if (localizedMessage == null) {
                        r2.getClass();
                        localizedMessage = "Cannot load voice instructions " + voiceInstructions;
                    }
                    return new VoiceState$VoiceError(localizedMessage);
                    mVar3.getClass();
                    if (expected.isError()) {
                        Object error3 = expected.getError();
                        error3.getClass();
                        throw ((Throwable) error3);
                    }
                    Object value3 = expected.getValue();
                    value3.getClass();
                    InputStream inputStream3 = (InputStream) value3;
                    Parser.Pair pair3 = (Parser.Pair) mVar.read;
                    r1.L$0 = mVar2;
                    r1.L$1 = voiceInstructions;
                    r1.L$2 = null;
                    r1.L$3 = null;
                    r1.label = 2;
                    objWithContext = BuildersKt.withContext(ThreadController.IODispatcher, new LocalAuthDataSource.AnonymousClass2(pair3, inputStream3, shortNewsContentCardView, i4), r1);
                    if (objWithContext != coroutineSingletons) {
                        r1 = mVar2;
                        isitemdismissable = new VoiceState$VoiceFile((File) objWithContext);
                        r2 = r1;
                        thSerializer = onItemDismiss.serializer(isitemdismissable);
                        if (thSerializer == null) {
                            return isitemdismissable;
                        }
                        localizedMessage = thSerializer.getLocalizedMessage();
                        if (localizedMessage == null) {
                            r2.getClass();
                            localizedMessage = "Cannot load voice instructions " + voiceInstructions;
                        }
                        return new VoiceState$VoiceError(localizedMessage);
                    }
                    return coroutineSingletons;
                } catch (Throwable th4) {
                    th = th4;
                    r1 = mVar2;
                    isitemdismissable = new isItemDismissable(th);
                    int i15 = serializer + 63;
                    IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    r2 = r1;
                }
                expected = (Expected) obj;
            } catch (Throwable th5) {
                voiceInstructions2 = voiceInstructions;
                th = th5;
                th = th;
                voiceInstructions = voiceInstructions2;
            }
            r1 = mVar2;
        } catch (Throwable th6) {
            th = th6;
        }
        MapboxVoiceApi$retrieveVoiceFile$1 mapboxVoiceApi$retrieveVoiceFile$2 = new MapboxVoiceApi$retrieveVoiceFile$1(this, continuationImpl);
        int i17 = serializer + 1;
        IconCompatParcelizer = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        r1 = mapboxVoiceApi$retrieveVoiceFile$2;
        objWithContext = r1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = r1.label;
        shortNewsContentCardView = null;
        isitemdismissable = new isItemDismissable(th);
        int i19 = serializer + 63;
        IconCompatParcelizer = i19 % Fields.SpotShadowColor;
        int i110 = i19 % 2;
        r2 = r1;
        thSerializer = onItemDismiss.serializer(isitemdismissable);
        if (thSerializer == null) {
            return isitemdismissable;
        }
        localizedMessage = thSerializer.getLocalizedMessage();
        if (localizedMessage == null) {
            r2.getClass();
            localizedMessage = "Cannot load voice instructions " + voiceInstructions;
        }
        return new VoiceState$VoiceError(localizedMessage);
    }

    public m(Context context) {
        this.write = 5;
        this.read = new ArrayList();
        getRectManager.RemoteActionCompatParcelizer(context != null, "Context must be non-null", new Object[0]);
        this.RemoteActionCompatParcelizer = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Application application = (Application) context.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new ViewLocationHolderLeakFix$applyFix$2(this, atomicBoolean));
        application.registerComponentCallbacks(new forceMeasureTheSubtreedefault(atomicBoolean));
        int i = 2;
        if (connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback(new findOverlaps(i, this));
            int i2 = IconCompatParcelizer + 111;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
            }
            int i3 = serializer + 49;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        context.registerReceiver(new countOccurrences(1, this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        int i5 = IconCompatParcelizer + 87;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = 2 % 2;
        int i8 = serializer + 49;
        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00bb  */
    @Override // o.accessgetHasRetrievedMethodcp
    public String RemoteActionCompatParcelizer(String str, String str2) {
        String strSerializer;
        ut utVar;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 35;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.RemoteActionCompatParcelizer;
        String str3 = (String) concurrentHashMap.get(str);
        if (str3 != null) {
            return str3;
        }
        accessgetOutlineProvidercp accessgetoutlineprovidercp = (accessgetOutlineProvidercp) ((i$d.a) this.read).read;
        if (accessgetoutlineprovidercp.read != 0) {
            String str4 = accessgetoutlineprovidercp.write;
            Context context = accessgetoutlineprovidercp.IconCompatParcelizer;
            if (accessgetoutlineprovidercp.RemoteActionCompatParcelizer == null) {
                int i5 = IconCompatParcelizer + 107;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    String strSerializer2 = accessgetShouldUseDispatchDrawcp.serializer(context, str4, "agc_plugin_", "crypto_component");
                    if (strSerializer2 != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(accessgetMinimumTouchTargetSizeMYxV2XQjd.IconCompatParcelizer(strSerializer2), "utf-8"));
                            utVar = new ut(new accessgetRecreateDisplayListcp(jSONObject.getInt("iterationCount"), jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm")));
                        } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e) {
                            Log.e("AGC_FlexibleDecrypt", "FlexibleDecrypt exception: " + e.getMessage());
                            i = IconCompatParcelizer + 87;
                            serializer = i % Fields.SpotShadowColor;
                            if (i % 2 != 0) {
                                int i6 = 4 / 5;
                            }
                            utVar = null;
                        }
                    } else {
                        i = IconCompatParcelizer + 87;
                        serializer = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            int i7 = 4 / 5;
                        }
                        utVar = null;
                    }
                    accessgetoutlineprovidercp.RemoteActionCompatParcelizer = utVar;
                } else {
                    accessgetShouldUseDispatchDrawcp.serializer(context, str4, "agc_plugin_", "crypto_component");
                    throw null;
                }
            }
            if (accessgetoutlineprovidercp.RemoteActionCompatParcelizer == null) {
                Log.w("AGC_FlexibleDecrypt", "decrypt Flexible Decrypt error, use old instead");
                accessgetoutlineprovidercp.RemoteActionCompatParcelizer = new ut(new accessgetRecreateDisplayListcp(5000, accessgetShouldUseDispatchDrawcp.serializer(context, str4, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), accessgetShouldUseDispatchDrawcp.serializer(context, str4, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), accessgetShouldUseDispatchDrawcp.serializer(context, str4, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), accessgetShouldUseDispatchDrawcp.serializer(context, str4, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1"));
            }
            strSerializer = accessgetoutlineprovidercp.RemoteActionCompatParcelizer.serializer(accessgetShouldUseDispatchDrawcp.serializer(context, str4, "agc_plugin_", str));
        } else {
            String str5 = accessgetoutlineprovidercp.write;
            Context context2 = accessgetoutlineprovidercp.IconCompatParcelizer;
            if (accessgetoutlineprovidercp.RemoteActionCompatParcelizer == null) {
                accessgetoutlineprovidercp.RemoteActionCompatParcelizer = new ut(new accessgetRecreateDisplayListcp(5000, accessgetShouldUseDispatchDrawcp.serializer(context2, str5, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), accessgetShouldUseDispatchDrawcp.serializer(context2, str5, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), accessgetShouldUseDispatchDrawcp.serializer(context2, str5, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), accessgetShouldUseDispatchDrawcp.serializer(context2, str5, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1"));
            }
            strSerializer = accessgetoutlineprovidercp.RemoteActionCompatParcelizer.serializer(accessgetShouldUseDispatchDrawcp.serializer(context2, str5, "agc_", str));
        }
        if (strSerializer == null) {
            return null;
        }
        concurrentHashMap.put(str, strSerializer);
        return strSerializer;
    }

    @Override // com.mapbox.navigator.EventsMetadataInterface
    public EventsMetadata provideEventsMetadata() {
        accessminIntrinsicWidthjd getpastetext;
        AudioType audioType;
        int iFloor;
        int iDoubleValue;
        int i = 2 % 2;
        ApplicationLifecycleMonitor applicationLifecycleMonitor = (ApplicationLifecycleMonitor) this.read;
        Context context = (Context) this.RemoteActionCompatParcelizer;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        byte bFloor = (byte) Math.floor((((double) audioManager.getStreamVolume(3)) * 100.0d) / ((double) audioManager.getStreamMaxVolume(3)));
        accessminIntrinsicWidthjd getsetprogress = new getSetProgress();
        AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
        if (audioManager2 == null || !audioManager2.isBluetoothScoOn()) {
            AudioManager audioManager3 = (AudioManager) context.getSystemService("audio");
            if (audioManager3 == null) {
                getpastetext = new getSetProgress();
            } else {
                AudioDeviceInfo[] devices = audioManager3.getDevices(2);
                devices.getClass();
                if (devices.length == 0) {
                    AudioManager audioManager4 = (AudioManager) context.getSystemService("audio");
                    if (audioManager4 != null) {
                        int i2 = serializer + 117;
                        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        if (audioManager4.isSpeakerphoneOn()) {
                            getsetprogress = new getRequestFocus();
                        }
                    }
                    getpastetext = getsetprogress;
                } else {
                    getpastetext = new getPasteText();
                }
            }
        } else {
            getpastetext = new getPageRight();
        }
        if (getpastetext instanceof getPageRight) {
            audioType = AudioType.BLUETOOTH;
        } else if (!(!(getpastetext instanceof getRequestFocus))) {
            int i4 = serializer + 31;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            audioType = AudioType.SPEAKER;
        } else if (getpastetext instanceof getPasteText) {
            audioType = AudioType.HEADPHONES;
        } else {
            if (!(getpastetext instanceof getSetProgress)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            audioType = AudioType.UNKNOWN;
        }
        AudioType audioType2 = audioType;
        try {
            iFloor = (int) Math.floor((((double) Settings.System.getInt(context.getContentResolver(), "screen_brightness")) * 100.0d) / 255.0d);
        } catch (Settings.SettingNotFoundException unused) {
            iFloor = -1;
        }
        byte b = (byte) iFloor;
        applicationLifecycleMonitor.getClass();
        long j = applicationLifecycleMonitor.startSessionTime;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(applicationLifecycleMonitor.resumes);
        int size = arrayList.size();
        ArrayList arrayList2 = applicationLifecycleMonitor.pauses;
        if (size < arrayList2.size()) {
            arrayList.add(Long.valueOf(jCurrentTimeMillis));
        }
        int size2 = arrayList.size();
        int i6 = serializer + 7;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        long jLongValue = 0;
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = serializer + 67;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                arrayList2.size();
                throw null;
            }
            if (i8 < arrayList2.size()) {
                long jLongValue2 = ((Number) arrayList.get(i8)).longValue();
                Object obj = arrayList2.get(i8);
                obj.getClass();
                jLongValue = (jLongValue2 - ((Number) obj).longValue()) + jLongValue;
            }
        }
        byte b2 = (byte) ((((jCurrentTimeMillis - jLongValue) - j) / (jCurrentTimeMillis - j)) * 100.0d);
        AtomicReference atomicReference = applicationLifecycleMonitor.portraitTimeInMillis;
        if (applicationLifecycleMonitor.currentOrientation.get() == 1 && removeNodeAtDepth.read((Double) atomicReference.get(), 0.0d)) {
            int i10 = serializer + 15;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            iDoubleValue = 100;
        } else {
            iDoubleValue = (int) ((((Number) atomicReference.get()).doubleValue() / (System.currentTimeMillis() - j)) * 100.0d);
        }
        return new EventsMetadata(Byte.valueOf(bFloor), audioType2, Byte.valueOf(b), Byte.valueOf(b2), Byte.valueOf((byte) iDoubleValue), Boolean.valueOf(TelemetrySystemUtils.isPluggedIn(context)), Byte.valueOf((byte) TelemetrySystemUtils.obtainBatteryLevel(context)), TelemetrySystemUtils.obtainCellularNetworkType(context), null);
    }
}
