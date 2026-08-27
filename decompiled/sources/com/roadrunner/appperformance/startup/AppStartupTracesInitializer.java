package com.roadrunner.appperformance.startup;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.room.Room;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import coil3.disk.DiskLruCache$Editor;
import com.deliveryhero.performance.core.aqs.AppQualityScore;
import com.deliveryhero.performance.core.aqs.AppQualityScore$enableScreenMetrics$1$1;
import com.deliveryhero.performance.core.screenmetric.ActivityMetricsLifecycleCallback;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screentracker.ActivityLifecyclePerformanceTrackerApi29;
import com.foodora.courier.app.application.CourierApplication;
import com.foodora.courier.app.application.MediaSessionCrashGuardActivityCallbacks;
import com.google.android.gms.internal.gtm.zzcp;
import com.google.android.gms.internal.measurement.zzfa;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.home.HomeFragment;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import io.sentry.util.UrlUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.BlurFilter;
import o.SuspendingTransactionWithoutReturn;
import o.accesstransactionWithWrapper;
import o.copyColorMatrixgBh15pIdefault;
import o.createFromParcel;
import o.createInnerPathShadowBrushLjSzlW0;
import o.createOuterShadowBitmapD_oqF2M;
import o.drawCachedImageFqjB98A;
import o.drawIntodefault;
import o.drawShadowerFMhIw;
import o.getAdjustedBounds;
import o.getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent;
import o.getAllUncoveredSemanticsNodesToIntObjectMaplambda0findAllSemanticNodesRecursive;
import o.getFloatValue;
import o.getMantissa64;
import o.getQueryParameterslambda2;
import o.getRole;
import o.instance_delegatelambda0;
import o.onBackInvokedlambda0;
import o.onContentCardClicked;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.removeNodeAtDepth;
import o.transactionWithWrapper;
import o.truncslo4al4;

/* JADX INFO: loaded from: classes5.dex */
public final class AppStartupTracesInitializer implements copyColorMatrixgBh15pIdefault {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public SuspendingTransactionWithoutReturn read;
    public AppQualityScore write;

    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        int i4 = serializer + 15;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return instance_delegatelambda0Var;
        }
        throw null;
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final Object create(Context context) {
        Application application;
        CourierApplication courierApplication;
        SuspendingTransactionWithoutReturn suspendingTransactionWithoutReturn;
        int i = 2 % 2;
        int i2 = serializer + 25;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            int i4 = RemoteActionCompatParcelizer + 83;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            application = (Application) applicationContext;
        } else {
            application = null;
        }
        if (application != null) {
            if (application instanceof CourierApplication) {
                int i5 = RemoteActionCompatParcelizer + 77;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                courierApplication = (CourierApplication) application;
            } else {
                courierApplication = null;
            }
            if (courierApplication == null || (suspendingTransactionWithoutReturn = (SuspendingTransactionWithoutReturn) courierApplication.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.MediaSessionCompatResultReceiverWrapper()) == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Application class must implement PerseusInitToolsProviderAccessor");
                return null;
            }
            this.read = suspendingTransactionWithoutReturn;
            BlurFilter blurFilterRemoteActionCompatParcelizer = getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent.RemoteActionCompatParcelizer();
            createOuterShadowBitmapD_oqF2M createoutershadowbitmapd_oqf2m = new createOuterShadowBitmapD_oqF2M((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{"app_start_to_interactive_sentry"}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), false);
            onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            ((CopyOnWriteArrayList) ((ComponentRegistry$Builder) blurFilterRemoteActionCompatParcelizer).RemoteActionCompatParcelizer).add(new getAllUncoveredSemanticsNodesToIntObjectMaplambda0findAllSemanticNodesRecursive(createoutershadowbitmapd_oqf2m, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, DefaultIoScheduler.RemoteActionCompatParcelizer))));
            this.write = getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent.serializer(application);
            ((ComponentRegistry$Builder) getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent.RemoteActionCompatParcelizer()).read(new getRole());
            BlurFilter blurFilterRemoteActionCompatParcelizer2 = getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent.RemoteActionCompatParcelizer();
            String[] strArr = {"app_cold_start"};
            if (Build.VERSION.SDK_INT < 35) {
                new DiskLruCache$Editor(application, blurFilterRemoteActionCompatParcelizer2, onContentCardClicked.RatingCompat(strArr), 3).v_();
            } else {
                List listRatingCompat = onContentCardClicked.RatingCompat(strArr);
                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(application, blurFilterRemoteActionCompatParcelizer2, listRatingCompat);
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (runningAppProcessInfo.importance == 100) {
                    Iterator it = listRatingCompat.iterator();
                    while (it.hasNext()) {
                        int i7 = RemoteActionCompatParcelizer + 95;
                        serializer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        ((BlurFilter) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).serializer((String) it.next());
                    }
                    application.registerActivityLifecycleCallbacks(new zzfa(1, r8lambdalmkbrrgswwtv97obrsj7trj7ai));
                    application.registerComponentCallbacks(new zzcp(2, r8lambdalmkbrrgswwtv97obrsj7trj7ai));
                } else {
                    r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer();
                    r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer = true;
                }
            }
            AppQualityScore appQualityScore = this.write;
            if (appQualityScore == null) {
                removeNodeAtDepth.serializer("appQualityScore");
                throw null;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo2);
            boolean z = runningAppProcessInfo2.importance == 100;
            BlurFilter blurFilter = appQualityScore.ParcelableVolumeInfo;
            if (z) {
                int i9 = serializer + 33;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                blurFilter.serializer("app_start_to_interactive");
            } else {
                blurFilter.RemoteActionCompatParcelizer("app_start_to_interactive");
                appQualityScore.write = true;
            }
            drawCachedImageFqjB98A drawcachedimagefqjb98a = (drawCachedImageFqjB98A) appQualityScore.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper();
            Application application2 = drawcachedimagefqjb98a.read;
            if (drawcachedimagefqjb98a.MediaBrowserCompatMediaItem.compareAndSet(false, true)) {
                drawcachedimagefqjb98a.MediaSessionCompatResultReceiverWrapper.read(new getFloatValue(drawcachedimagefqjb98a.ParcelableVolumeInfo, new HomeFragment.AnonymousClass1(1, drawcachedimagefqjb98a, drawCachedImageFqjB98A.class, "onScreenEventStop", "onScreenEventStop(Lcom/deliveryhero/performance/core/screenmetric/ScreenPerformanceEvent;)V", 0, 5)));
                application2.registerComponentCallbacks(new zzcp(3, drawcachedimagefqjb98a));
                Iterator it2 = onContentCardClicked.MediaSessionCompatQueueItem(new Application.ActivityLifecycleCallbacks[]{(ActivityMetricsLifecycleCallback) drawcachedimagefqjb98a.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), Build.VERSION.SDK_INT >= 29 ? new ActivityLifecyclePerformanceTrackerApi29() : new MediaSessionCrashGuardActivityCallbacks(1)}).iterator();
                while (it2.hasNext()) {
                    application2.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) it2.next());
                }
                FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new SingleProcessDataStore$data$1.AnonymousClass1(drawcachedimagefqjb98a, null, 5), drawIntodefault.serializer), drawcachedimagefqjb98a.PlaybackStateCompatCustomAction);
                ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat.IconCompatParcelizer(new drawShadowerFMhIw(0, new getMantissa64(drawcachedimagefqjb98a)));
            }
            drawcachedimagefqjb98a.MediaMetadataCompat = new AppQualityScore$enableScreenMetrics$1$1(appQualityScore);
            createInnerPathShadowBrushLjSzlW0 createinnerpathshadowbrushljszlw0 = new createInnerPathShadowBrushLjSzlW0(new HomeFragment.AnonymousClass1(1, appQualityScore, AppQualityScore.class, "onScreenEventReady", "onScreenEventReady(Lcom/deliveryhero/performance/core/aqs/ScreenEvent;)V", 0, 4), appQualityScore.MediaMetadataCompat);
            CopyOnWriteArrayList copyOnWriteArrayList = drawcachedimagefqjb98a.MediaSessionCompatToken;
            if (!copyOnWriteArrayList.contains(createinnerpathshadowbrushljszlw0)) {
                copyOnWriteArrayList.add(createinnerpathshadowbrushljszlw0);
            }
            if (this.read == null) {
                removeNodeAtDepth.serializer("perseusInitToolsProvider");
                throw null;
            }
            int i11 = serializer + 87;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            accesstransactionWithWrapper accesstransactionwithwrapper = (accesstransactionWithWrapper) SuspendingTransactionWithoutReturn.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
            if (this.read == null) {
                removeNodeAtDepth.serializer("perseusInitToolsProvider");
                throw null;
            }
            ((CopyOnWriteArraySet) appQualityScore.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper()).add(new getAdjustedBounds(new InitializeAppStartupItemsImpl(accesstransactionwithwrapper, (transactionWithWrapper) SuspendingTransactionWithoutReturn.write.MediaSessionCompatResultReceiverWrapper())));
            truncslo4al4 truncslo4al4Var = new truncslo4al4(application);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo3 = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo3);
            if (runningAppProcessInfo3.importance == 100) {
                new Handler(Looper.getMainLooper()).post(new Sentry$$ExternalSyntheticLambda5(13, truncslo4al4Var));
                application.registerActivityLifecycleCallbacks(new zzfa(4, truncslo4al4Var));
            }
        }
        return createFromParcel.INSTANCE;
    }
}
