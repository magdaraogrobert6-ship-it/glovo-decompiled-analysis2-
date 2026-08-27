package com.foodora.courier.app.application;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.multidex.MultiDex;
import androidx.work.CoroutineWorker$startWork$1;
import androidx.work.impl.WorkerWrapper;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.compose.AsyncImagePainter$launchJob$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screentracker.ActivityLifecyclePerformanceTrackerApi29;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.logistics.rider.glovo.R;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appperformance.AppPerformanceAttributesValueProvider;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.appperformance.tracker.AppStartToInteractiveTraceStopper;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.logger.forceclose.LogIfAppWasForceClosed$invoke$1;
import com.roadrunner.map.container.initialisation.InitialiseMapBox$initializeWithYield$1;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.uber.rxdogtag.RxDogTag;
import dagger.Lazy;
import io.sentry.CombinedScopeView;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.metrics.MetricsBatchProcessor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.io.TextStreamsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AbstractC0197query;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.BlurFilter;
import o.ColumnAdapter;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.FocusListener;
import o.InputMethodManagerImpl;
import o.SemanticsInfo;
import o.SemanticsNodeWithAdjustedBounds;
import o.SemanticsNode_androidKt;
import o.SemanticsOwner;
import o.ShortNewsContentCardView;
import o.SuspendingTransacterImpl;
import o.SystemLifecycleSystemLifecycleCallback;
import o._get_messageWebView_lambda0;
import o.accessgetRelayoutTimep;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.accessroleFakeNodeId;
import o.accesstoComposeOffset;
import o.composeToViewOffset;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.createQuery;
import o.createVerticalAnimation;
import o.drawShadowerFMhIw;
import o.e2;
import o.getAllSemanticsNodesToMap;
import o.getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent;
import o.getAllUncoveredSemanticsNodesToIntObjectMaplambda0virtualViewId;
import o.getContentViewGroupParentLayout;
import o.getListenersui;
import o.getRootInfoui;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.hb;
import o.igExternalSyntheticLambda2;
import o.igExternalSyntheticLambda7;
import o.inCompatibilityMode;
import o.isAdapterPositionOnScreen;
import o.isConsumed;
import o.isMainThreadroom_runtime;
import o.isOpenInternalroom_runtime;
import o.iteratordefault;
import o.notifySemanticsChangeui;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaGsxfkYxRefLxpEZ6flYq5eiAOLo;
import o.r8lambdaYKFlaLPXCe5fWUKXLfXeRFbkt8Q;
import o.r8lambdacj1MEPsdBAzy84SfpNJAlW40JlY;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.removeNodeAtDepth;
import o.removeOnPictureInPictureModeChangedListener;
import o.runlambda4notifyCallbackIfNeeded;
import o.setFirstHorizontalStyle;
import o.setFontSizeR2X_6o;
import o.setLastHorizontalBias;
import o.setMaxElementsWrap;
import o.setPaddingLeft;
import o.setPresentationView;
import o.sourceInformationContextOfdefault;
import o.transferSessionPackageI;
import o.updateAdidI;
import retrofit2.OkHttpCall$1;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public class CourierApplication extends Application implements Application.ActivityLifecycleCallbacks, iteratordefault, SemanticsNode_androidKt, convertStringJsonArrayToList {
    public static CourierApplication write;
    public ShouldShowHeatmap_Factory ComponentActivity;
    public InitializeAppStartupItemsImpl IconCompatParcelizer;
    public setMaxElementsWrap MediaDescriptionCompat;
    public SemanticsOwner MediaMetadataCompat;
    public _get_messageWebView_lambda0 MediaSessionCompatResultReceiverWrapper;
    public EmojiProcessor MediaSessionCompatToken;
    public Lazy ParcelableVolumeInfo;
    public setPresentationView PlaybackStateCompat;
    public accessgetRelayoutTimep PlaybackStateCompatCustomAction;
    public setLastHorizontalBias RatingCompat;
    public r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ ResultReceiver;
    public CombinedScopeView _init_lambda1;
    public WorkerWrapper.Builder _init_lambda2;
    public AndroidUiDispatcherCompanioncurrentThread1 _init_lambda3;
    public SystemLifecycleSystemLifecycleCallback accessensureViewModelStore;
    public TraceTimeMeasurementWithPerformanceKit addObserverForBackInvoker;
    public OkHttpCall$1 addObserverForBackInvokerlambda0;
    public getAllUncoveredSemanticsNodesToIntObjectMaplambda0virtualViewId createFullyDrawnExecutor;
    public WeakReference defaultViewModelProviderFactory_delegatelambda0;
    public Lazy ensureViewModelStore;
    public Lazy fullyDrawnReporter_delegatelambda0;
    public isConsumed fullyDrawnReporter_delegatelambda00;
    public accessgetRelayoutTimep r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public CombinedScopeView r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public InitializeAppStartupItemsImpl r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public SuspendingTransacterImpl r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public Lazy r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public Lazy r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public r8lambdaGsxfkYxRefLxpEZ6flYq5eiAOLo r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public SaveHeatmapUrlImpl r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public runlambda4notifyCallbackIfNeeded r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public Lazy r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public volatile constructJsonArray read;
    public CreateHomeScope serializer;
    private static final byte[] $$c = {82, 90, 113, -1};
    private static final int $$d = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {65, 77, -54, 89, -14, 13, -9, -8, 11, -3, 17, -21, 13, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, -13, -4, 3};
    private static final int $$b = 38;
    private static int onBackPressedInput_delegatelambda0 = 0;
    private static int onBackPressedDispatcher_delegatelambda010 = 1;
    private static char menuHostHelperlambda0 = 32936;
    private static char getOnBackPressedInput = 27114;
    private static char getSavedStateRegistryControllerannotations = 44749;
    private static char addContentView = 1582;
    public final /* synthetic */ SemanticsNodeWithAdjustedBounds RemoteActionCompatParcelizer = new SemanticsNodeWithAdjustedBounds();
    public final isAdapterPositionOnScreen r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new isAdapterPositionOnScreen(new StateV3$$ExternalSyntheticLambda0(2));
    public final isAdapterPositionOnScreen MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new CourierApplication$$ExternalSyntheticLambda2(this, 0));
    public final ArrayList _init_lambda4 = new ArrayList();
    public String MediaSessionCompatQueueItem = "";

    private static String $$e(byte b, short s, int i) {
        byte[] bArr = $$c;
        int i2 = 109 - (i * 2);
        int i3 = (b * 3) + 4;
        int i4 = s * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i2 = (-i2) + i4;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = bArr[i3];
            i3++;
            i2 = (-i7) + i2;
            i5 = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.foodora.courier.app.application.CourierApplication.$$a
            int r7 = 115 - r7
            int r6 = r6 * 2
            int r1 = r6 + 4
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r0[r5]
        L28:
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foodora.courier.app.application.CourierApplication.b(int, byte, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i2) | i7);
        int i9 = (~i3) | (~(i7 | i2));
        int i10 = i2 | i3 | i7;
        int i11 = i3 + i6 + i + (1635157569 * i4) + ((-1141649966) * i5);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i3) - 711983104) + (488484398 * i6) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i) + (1462763520 * i4) + (1566572544 * i5) + (1631846400 * i12);
        int i14 = (i3 * 1521345644) + 2088555610 + (i6 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i * 1521345871) + (i4 * (-1382509809)) + (i5 * 37969358) + (i12 * (-671350784));
        int i15 = i13 + (i14 * i14 * (-1069809664));
        if (i15 != 1) {
            return i15 != 2 ? read(objArr) : RemoteActionCompatParcelizer(objArr);
        }
        return serializer(objArr);
    }

    public final void RatingCompat() {
        if (this.read == null) {
            synchronized (this) {
                if (this.read == null) {
                    read().inject(this);
                    if (this.read == null) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    @Override // o.SemanticsNode_androidKt
    public final long serializer() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 55;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j = this.RemoteActionCompatParcelizer.IconCompatParcelizer;
        int i4 = onBackPressedInput_delegatelambda0 + 51;
        onBackPressedDispatcher_delegatelambda010 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return j;
    }

    public CourierApplication() {
        write();
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 27;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            RatingCompat();
            return this.read;
        }
        RatingCompat();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        CourierApplication courierApplication = (CourierApplication) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 87;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = super.getSharedPreferences(str, iIntValue);
        sharedPreferences.getClass();
        int i4 = onBackPressedDispatcher_delegatelambda010 + 111;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return sharedPreferences;
        }
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        CourierApplication courierApplication = (CourierApplication) objArr[0];
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 117;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            courierApplication.MediaSessionCompatQueueItem.length();
            throw null;
        }
        if (courierApplication.MediaSessionCompatQueueItem.length() <= 0) {
            return false;
        }
        int i3 = onBackPressedDispatcher_delegatelambda010 + 19;
        onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }

    public final getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION read() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 83;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object objMediaSessionCompatResultReceiverWrapper = this.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
            objMediaSessionCompatResultReceiverWrapper.getClass();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objMediaSessionCompatResultReceiverWrapper2 = this.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper2.getClass();
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) objMediaSessionCompatResultReceiverWrapper2;
        int i3 = onBackPressedDispatcher_delegatelambda010 + 75;
        onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 61 / 0;
        }
        return getstyleable_vector_drawable_group_rotation;
    }

    public final getAllSemanticsNodesToMap RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010;
        int i3 = i2 + 31;
        onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        TraceTimeMeasurementWithPerformanceKit traceTimeMeasurementWithPerformanceKit = this.addObserverForBackInvoker;
        if (traceTimeMeasurementWithPerformanceKit == null) {
            removeNodeAtDepth.serializer("traceTimeMeasurement");
            throw null;
        }
        int i4 = i2 + 49;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return traceTimeMeasurementWithPerformanceKit;
        }
        obj.hashCode();
        throw null;
    }

    public static void write() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 13;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            SemanticsOwner.read.getClass();
            getListenersui.serializer();
            throw null;
        }
        SemanticsOwner.read.getClass();
        if (getListenersui.serializer()) {
            System.exit(0);
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("System.exit returned normally, while it was supposed to halt JVM.");
        } else {
            int i3 = onBackPressedInput_delegatelambda0 + 109;
            onBackPressedDispatcher_delegatelambda010 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
    }

    @Override // android.app.Application
    public final void onCreate() throws Throwable {
        int i;
        Application.ActivityLifecycleCallbacks mediaSessionCrashGuardActivityCallbacks;
        int i2 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i3 = 1;
        int i4 = 16;
        Object[] objArr = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.abc_menu_sym_shortcut_label).substring(0, 1).codePointAt(0) - 67, new char[]{26874, 58215, 57702, 31499, 15946, 27296, 35668, 32414, 48427, 38362, 59763, 7505, 28066, 32245, 43509, 12776}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(13 - View.getDefaultSize(0, 0), new char[]{19244, 31479, 43413, 43166, 34509, 21811, 54967, 18362, 44558, 51416, 11617, 61056, 50319, 52568}, objArr2);
        Thread thread = (Thread) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0]);
        Object[] objArr3 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9, new char[]{26874, 58215, 57702, 31499, 15946, 27296, 35668, 32414, 48427, 38362, 59763, 7505, 28066, 32245, 43509, 12776}, objArr3);
        Class<?> cls2 = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.abc_menu_function_shortcut_label).substring(0, 1).length() + 12, new char[]{9617, 18959, 48905, 6142, 6677, 31452, 21529, 9778, 29690, 19603, 27429, 41310, 45247, 23868}, objArr4);
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(thread, new Object[0]);
        try {
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1004846139);
            if (objRemoteActionCompatParcelizer == null) {
                char packedPositionGroup = (char) (56289 - ExpandableListView.getPackedPositionGroup(0L));
                int iBlue = Color.blue(0) + 578;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 33;
                byte[] bArr = $$a;
                byte b = bArr[15];
                byte b2 = bArr[19];
                Object[] objArr5 = new Object[1];
                b(b, b2, (byte) (b2 - 3), objArr5);
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionGroup, iBlue, absoluteGravity, 348873252, false, (String) objArr5[0], new Class[0]);
            }
            String[] strArr = (String[]) ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
            Object[] objArr6 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 9, new char[]{26874, 58215, 57702, 31499, 15946, 27296, 35668, 32414, 48427, 38362, 60997, 14717, 27429, 41310, 61289, 8963, 29256, 47897, 56304, 27319, 38185, 35027, 3842, 45499, 34509, 21811, 19753, 44749}, objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.joda_time_android_relative_time).substring(0, 4).length() + 8, new char[]{9617, 18959, 38432, 7246, 52825, 17381, 61318, 55642, 45284, 44689, 22240, 37639}, objArr7);
            Method method = cls3.getMethod((String) objArr7[0], new Class[0]);
            Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-219743933);
            if (objRemoteActionCompatParcelizer2 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int iLastIndexOf = 422 - TextUtils.lastIndexOf("", '0');
                int doubleTapTimeout = 30 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b3 = (byte) (-$$a[7]);
                byte b4 = b3;
                Object[] objArr8 = new Object[1];
                b(b3, b4, (byte) (b4 | 34), objArr8);
                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(capsMode, iLastIndexOf, doubleTapTimeout, 574019746, false, (String) objArr8[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer2).setInt(null, 0);
            loop0: for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                for (String str : strArr) {
                    if (str.equals((String) method.invoke(stackTraceElement, new Object[0]))) {
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-219743933);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int trimmedLength = 423 - TextUtils.getTrimmedLength("");
                            int iAlpha = Color.alpha(0) + 30;
                            byte b5 = (byte) (-$$a[7]);
                            byte b6 = b5;
                            Object[] objArr9 = new Object[1];
                            b(b5, b6, (byte) (b6 | 34), objArr9);
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollDefaultDelay, trimmedLength, iAlpha, 574019746, false, (String) objArr9[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer3).setInt(null, 1);
                        break loop0;
                    }
                }
            }
            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2110493678);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cGreen = (char) (Color.green(0) + 56289);
                int iAxisFromString = MotionEvent.axisFromString("") + 579;
                int iGreen = 33 - Color.green(0);
                byte[] bArr2 = $$a;
                byte b7 = (byte) (bArr2[13] + 1);
                byte b8 = bArr2[15];
                Object[] objArr10 = new Object[1];
                b(b7, (byte) (b8 + 1), (byte) (-b8), objArr10);
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cGreen, iAxisFromString, iGreen, -1390693873, false, (String) objArr10[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer4).set(null, -1L);
            write();
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid && runningAppProcessInfo.processName.endsWith(":phoenix")) {
                        return;
                    }
                }
            }
            FirebasePerformance.read().getClass();
            Trace traceIconCompatParcelizer = Trace.IconCompatParcelizer("app_application_onCreate");
            traceIconCompatParcelizer.start();
            MediaMetadataCompat();
            this.RemoteActionCompatParcelizer.IconCompatParcelizer = SystemClock.uptimeMillis();
            write = this;
            int i5 = 3;
            ((TraceTimeMeasurementWithPerformanceKit) RemoteActionCompatParcelizer()).read("asti_app_oncreate_init_logger_init", new CourierApplication$$ExternalSyntheticLambda2(this, i5));
            runlambda4notifyCallbackIfNeeded runlambda4notifycallbackifneeded = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (runlambda4notifycallbackifneeded != null) {
                runlambda4notifycallbackifneeded.IconCompatParcelizer();
                SemanticsOwner semanticsOwner = this.MediaMetadataCompat;
                if (semanticsOwner != null) {
                    ((getRootInfoui) semanticsOwner).serializer("asti_app_application_on_create");
                    CreateHomeScope createHomeScope = this.serializer;
                    if (createHomeScope != null) {
                        accessroleFakeNodeId.write = (AppPerformanceAttributesValueProvider) createHomeScope.read;
                        WorkerWrapper.Builder builder = this._init_lambda2;
                        if (builder != null) {
                            Application application = (Application) builder.write;
                            if (((FirebaseRemoteConfigImpl) ((transferSessionPackageI) builder.MediaMetadataCompat)).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_TRACKING_SCREEN_TIME_TO_INTERACTIVE_ENABLED.getFirebaseFlagName())) {
                                BlurFilter blurFilterRemoteActionCompatParcelizer = getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent.RemoteActionCompatParcelizer();
                                notifySemanticsChangeui notifysemanticschangeui = (notifySemanticsChangeui) builder.RemoteActionCompatParcelizer;
                                TextStreamsKt.RemoteActionCompatParcelizer = blurFilterRemoteActionCompatParcelizer;
                                TextStreamsKt.read = notifysemanticschangeui;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    mediaSessionCrashGuardActivityCallbacks = new ActivityLifecyclePerformanceTrackerApi29();
                                } else {
                                    mediaSessionCrashGuardActivityCallbacks = new MediaSessionCrashGuardActivityCallbacks(i3);
                                }
                                application.registerActivityLifecycleCallbacks(mediaSessionCrashGuardActivityCallbacks);
                            } else {
                                Timber.RemoteActionCompatParcelizer.getClass();
                            }
                            ((accessisRenderNodeCompatiblecp) builder.MediaBrowserCompatMediaItem).getLifecycle().IconCompatParcelizer((drawShadowerFMhIw) builder.IconCompatParcelizer);
                            application.registerActivityLifecycleCallbacks((AppStartToInteractiveTraceStopper) builder.read);
                            Lazy lazy = this.ensureViewModelStore;
                            if (lazy != null) {
                                setFirstHorizontalStyle setfirsthorizontalstyle = (setFirstHorizontalStyle) lazy.write();
                                boolean zRemoteActionCompatParcelizer = setfirsthorizontalstyle.serializer.RemoteActionCompatParcelizer();
                                getAllSemanticsNodesToMap getallsemanticsnodestomap = setfirsthorizontalstyle.IconCompatParcelizer;
                                if (zRemoteActionCompatParcelizer) {
                                    ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).read("asti_app_oncreate_apply_design_system_mode", new ImageLoader$Builder$$ExternalSyntheticLambda1(22, setfirsthorizontalstyle));
                                } else {
                                    SemanticsOwner semanticsOwner2 = ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).serializer;
                                    boolean zBooleanValue = ((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue();
                                    if (zBooleanValue) {
                                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("asti_app_oncreate_force_light_mode");
                                    }
                                    try {
                                        try {
                                            getRootInfoui getrootinfoui = (getRootInfoui) semanticsOwner2;
                                            getrootinfoui.serializer("asti_app_oncreate_force_light_mode");
                                            removeOnPictureInPictureModeChangedListener.IconCompatParcelizer(1);
                                            getrootinfoui.write("asti_app_oncreate_force_light_mode");
                                            if (zBooleanValue) {
                                                android.os.Trace.endSection();
                                            }
                                        } catch (Throwable th) {
                                            if (zBooleanValue) {
                                                android.os.Trace.endSection();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        ((getRootInfoui) semanticsOwner2).write("asti_app_oncreate_force_light_mode");
                                        throw th2;
                                    }
                                }
                                if (this._init_lambda3 != null) {
                                    RxDogTag.install();
                                    setMaxElementsWrap setmaxelementswrap = this.MediaDescriptionCompat;
                                    if (setmaxelementswrap != null) {
                                        setPaddingLeft setpaddingleft = setmaxelementswrap.write;
                                        if (!setpaddingleft.IconCompatParcelizer.contains((String) setpaddingleft.read.MediaSessionCompatResultReceiverWrapper())) {
                                            synchronized (setmaxelementswrap) {
                                            }
                                        } else {
                                            setPaddingLeft setpaddingleft2 = setmaxelementswrap.write;
                                            setpaddingleft2.IconCompatParcelizer.getString((String) setpaddingleft2.read.MediaSessionCompatResultReceiverWrapper(), null);
                                        }
                                        accessregisterComponentCallback accessregistercomponentcallback = ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat;
                                        setLastHorizontalBias setlasthorizontalbias = this.RatingCompat;
                                        if (setlasthorizontalbias != null) {
                                            accessregistercomponentcallback.IconCompatParcelizer(setlasthorizontalbias);
                                            ((TraceTimeMeasurementWithPerformanceKit) RemoteActionCompatParcelizer()).read("asti_app_oncreate_setup_fun_with_flag", new CourierApplication$$ExternalSyntheticLambda2(this, 4));
                                            ((TraceTimeMeasurementWithPerformanceKit) RemoteActionCompatParcelizer()).read("asti_app_oncreate_init_work_manager", new CourierApplication$$ExternalSyntheticLambda2(this, 5));
                                            ((TraceTimeMeasurementWithPerformanceKit) RemoteActionCompatParcelizer()).read("asti_app_oncreate_init_user_analytics", new CourierApplication$$ExternalSyntheticLambda2(this, 6));
                                            ((TraceTimeMeasurementWithPerformanceKit) RemoteActionCompatParcelizer()).read("asti_app_oncreate_init_user_attributes", new CourierApplication$$ExternalSyntheticLambda2(this, 7));
                                            EmojiProcessor emojiProcessor = this.MediaSessionCompatToken;
                                            if (emojiProcessor != null) {
                                                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) emojiProcessor.serializer, null, null, new AsyncImagePainter$launchJob$1(emojiProcessor, shortNewsContentCardView, i4), 3);
                                                CombinedScopeView combinedScopeView = this._init_lambda1;
                                                if (combinedScopeView != null) {
                                                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer = combinedScopeView;
                                                    SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback = this.accessensureViewModelStore;
                                                    if (systemLifecycleSystemLifecycleCallback != null) {
                                                        systemLifecycleSystemLifecycleCallback.MediaDescriptionCompat();
                                                        SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback2 = this.accessensureViewModelStore;
                                                        if (systemLifecycleSystemLifecycleCallback2 != null) {
                                                            systemLifecycleSystemLifecycleCallback2.IconCompatParcelizer();
                                                            ShouldShowHeatmap_Factory shouldShowHeatmap_Factory = this.ComponentActivity;
                                                            if (shouldShowHeatmap_Factory != null) {
                                                                CombinedScopeView combinedScopeView2 = (CombinedScopeView) shouldShowHeatmap_Factory.write();
                                                                if (Build.VERSION.SDK_INT >= 30) {
                                                                    BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) combinedScopeView2.write, null, null, new LogIfAppWasForceClosed$invoke$1(combinedScopeView2, null), 3);
                                                                }
                                                                ((TraceTimeMeasurementWithPerformanceKit) RemoteActionCompatParcelizer()).read("asti_adjust_sdk_initialization_time_performance", new CourierApplication$$ExternalSyntheticLambda2(this, 8));
                                                                ((TraceTimeMeasurementWithPerformanceKit) RemoteActionCompatParcelizer()).read("asti_app_oncreate_init_smart_polling", new CourierApplication$$ExternalSyntheticLambda2(this, 9));
                                                                ((TraceTimeMeasurementWithPerformanceKit) RemoteActionCompatParcelizer()).read("asti_app_oncreate_init_rider_safety", new CourierApplication$$ExternalSyntheticLambda2(this, i3));
                                                                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                                                if (initializeAppStartupItemsImpl != null) {
                                                                    Iterator it = ((Set) initializeAppStartupItemsImpl.IconCompatParcelizer).iterator();
                                                                    while (true) {
                                                                        i = 2;
                                                                        if (!it.hasNext()) {
                                                                            break;
                                                                        }
                                                                        SemanticsInfo semanticsInfo = (SemanticsInfo) it.next();
                                                                        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) initializeAppStartupItemsImpl.serializer;
                                                                        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new CoroutineWorker$startWork$1(semanticsInfo, shortNewsContentCardView, 10), 2);
                                                                    }
                                                                    accessgetRelayoutTimep accessgetrelayouttimep = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                                                                    if (accessgetrelayouttimep != null) {
                                                                        WorkerWrapper.Builder builder2 = (WorkerWrapper.Builder) accessgetrelayouttimep.write();
                                                                        isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) builder2.MediaMetadataCompat;
                                                                        igExternalSyntheticLambda2 igexternalsyntheticlambda2 = (igExternalSyntheticLambda2) builder2.MediaBrowserCompatMediaItem;
                                                                        int i6 = e2.read[((createQuery) builder2.IconCompatParcelizer).write().ordinal()];
                                                                        if (i6 == 1) {
                                                                            igexternalsyntheticlambda2.IconCompatParcelizer(igExternalSyntheticLambda7.ENABLED);
                                                                            getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) builder2.RemoteActionCompatParcelizer;
                                                                            ((inCompatibilityMode) isopeninternalroom_runtime).getClass();
                                                                            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, MainDispatcherLoader.read, null, new InitialiseMapBox$initializeWithYield$1(builder2, shortNewsContentCardView, i2), 2);
                                                                        } else if (i6 == 2) {
                                                                            igexternalsyntheticlambda2.IconCompatParcelizer(igExternalSyntheticLambda7.ENABLED);
                                                                            getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = (getContentViewGroupParentLayout) builder2.RemoteActionCompatParcelizer;
                                                                            ((inCompatibilityMode) isopeninternalroom_runtime).getClass();
                                                                            DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new ShiftZoneMapLayerUiModelImpl$1(builder2, shortNewsContentCardView, i5), 2);
                                                                        } else if (i6 == 3) {
                                                                            igexternalsyntheticlambda2.IconCompatParcelizer(igExternalSyntheticLambda7.ENABLED);
                                                                            getContentViewGroupParentLayout getcontentviewgroupparentlayout4 = (getContentViewGroupParentLayout) builder2.RemoteActionCompatParcelizer;
                                                                            ((inCompatibilityMode) isopeninternalroom_runtime).getClass();
                                                                            DefaultScheduler defaultScheduler4 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout4, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new InitialiseMapBox$initializeWithYield$1(builder2, shortNewsContentCardView, i), 2);
                                                                        } else if (i6 == 4) {
                                                                            igexternalsyntheticlambda2.IconCompatParcelizer(igExternalSyntheticLambda7.ENABLED);
                                                                            getContentViewGroupParentLayout getcontentviewgroupparentlayout5 = (getContentViewGroupParentLayout) builder2.RemoteActionCompatParcelizer;
                                                                            ((inCompatibilityMode) isopeninternalroom_runtime).getClass();
                                                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout5, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, null, new InitialiseMapBox$initializeWithYield$1(builder2, shortNewsContentCardView, i3), 2);
                                                                        } else if (i6 == 5) {
                                                                            ((TraceTimeMeasurementWithPerformanceKit) ((getAllSemanticsNodesToMap) builder2.read)).read("asti_init_mapbox", new NetworkingCoreModule$$ExternalSyntheticLambda2(8, builder2));
                                                                        } else {
                                                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                                            return;
                                                                        }
                                                                        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.ResultReceiver;
                                                                        if (r8lambdaktwlyipskq3tfa9ey3gatonixfq != null) {
                                                                            if (!((Boolean) ((hb) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write()).write.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                                                                                accessgetRelayoutTimep accessgetrelayouttimep2 = this.PlaybackStateCompatCustomAction;
                                                                                if (accessgetrelayouttimep2 != null) {
                                                                                    ((MetricsBatchProcessor) accessgetrelayouttimep2.write()).read();
                                                                                } else {
                                                                                    removeNodeAtDepth.serializer("initialiseMapNavigationProvider");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            registerActivityLifecycleCallbacks(this);
                                                                            r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                                                                            if (r8lambdaktwlyipskq3tfa9ey3gatonixfq2 != null) {
                                                                                registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write());
                                                                                if (Build.VERSION.SDK_INT < 31) {
                                                                                    Lazy lazy2 = this.ParcelableVolumeInfo;
                                                                                    if (lazy2 != null) {
                                                                                        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) lazy2.write());
                                                                                        firebaseRemoteConfigImpl.getClass();
                                                                                        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_MEDIA_SESSION_CRASH_GUARD_ENABLED)) {
                                                                                            registerActivityLifecycleCallbacks(new MediaSessionCrashGuardActivityCallbacks(i2));
                                                                                        }
                                                                                    } else {
                                                                                        removeNodeAtDepth.serializer("firebaseRemoteConfig");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                getAllUncoveredSemanticsNodesToIntObjectMaplambda0virtualViewId getalluncoveredsemanticsnodestointobjectmaplambda0virtualviewid = this.createFullyDrawnExecutor;
                                                                                if (getalluncoveredsemanticsnodestointobjectmaplambda0virtualviewid != null) {
                                                                                    if (((FirebaseRemoteConfigImpl) getalluncoveredsemanticsnodestointobjectmaplambda0virtualviewid.RemoteActionCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_SENTRY_CORE_TTI_ENABLED.getFirebaseFlagName())) {
                                                                                        LazyKt__LazyJVMKt.RemoteActionCompatParcelizer = getalluncoveredsemanticsnodestointobjectmaplambda0virtualviewid.IconCompatParcelizer;
                                                                                        getalluncoveredsemanticsnodestointobjectmaplambda0virtualviewid.serializer.registerActivityLifecycleCallbacks(getalluncoveredsemanticsnodestointobjectmaplambda0virtualviewid.IconCompatParcelizer);
                                                                                    }
                                                                                    Lazy lazy3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                                                                                    if (lazy3 != null) {
                                                                                        ColumnAdapter columnAdapter = (ColumnAdapter) lazy3.write();
                                                                                        BuildersKt.RemoteActionCompatParcelizer(columnAdapter.serializer, null, null, new RiderStateRepositoryImpl.AnonymousClass1(columnAdapter, shortNewsContentCardView, 27), 3);
                                                                                        r8lambdaGsxfkYxRefLxpEZ6flYq5eiAOLo r8lambdagsxfkyxreflxpez6flyq5eiaolo = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                                                                                        if (r8lambdagsxfkyxreflxpez6flyq5eiaolo != null) {
                                                                                            r8lambdagsxfkyxreflxpez6flyq5eiaolo.read();
                                                                                            SaveHeatmapUrlImpl saveHeatmapUrlImpl = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                                                                                            if (saveHeatmapUrlImpl != null) {
                                                                                                Context applicationContext = getApplicationContext();
                                                                                                applicationContext.getClass();
                                                                                                r8lambdacj1MEPsdBAzy84SfpNJAlW40JlY r8lambdacj1mepsdbazy84sfpnjalw40jly = (r8lambdacj1MEPsdBAzy84SfpNJAlW40JlY) saveHeatmapUrlImpl.serializer;
                                                                                                IntentFilter intentFilter = new IntentFilter();
                                                                                                intentFilter.addAction("android.location.MODE_CHANGED");
                                                                                                intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
                                                                                                FocusListener.read(applicationContext, r8lambdacj1mepsdbazy84sfpnjalw40jly, intentFilter, null, 4);
                                                                                                Lazy lazy4 = this.fullyDrawnReporter_delegatelambda0;
                                                                                                if (lazy4 != null) {
                                                                                                    r8lambdaYKFlaLPXCe5fWUKXLfXeRFbkt8Q r8lambdaykflalpxce5fwukxlfxerfbkt8q = (r8lambdaYKFlaLPXCe5fWUKXLfXeRFbkt8Q) lazy4.write();
                                                                                                    Set setRemoteActionCompatParcelizer = ((FirebaseRemoteConfigImpl) r8lambdaykflalpxce5fwukxlfxerfbkt8q.serializer).IconCompatParcelizer.RemoteActionCompatParcelizer("tracked_unknown_ui_errors");
                                                                                                    if (!setRemoteActionCompatParcelizer.isEmpty()) {
                                                                                                        Map map = r8lambdaykflalpxce5fwukxlfxerfbkt8q.write;
                                                                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                                                        for (Map.Entry entry : map.entrySet()) {
                                                                                                            if (setRemoteActionCompatParcelizer.contains(entry.getKey())) {
                                                                                                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                                                                                            }
                                                                                                        }
                                                                                                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                                                                                            String str2 = (String) entry2.getKey();
                                                                                                            String strIconCompatParcelizer = r8lambdaykflalpxce5fwukxlfxerfbkt8q.IconCompatParcelizer.IconCompatParcelizer(((Number) entry2.getValue()).intValue());
                                                                                                            LinkedHashMap linkedHashMap2 = r8lambdaykflalpxce5fwukxlfxerfbkt8q.RemoteActionCompatParcelizer;
                                                                                                            Object arrayList = linkedHashMap2.get(strIconCompatParcelizer);
                                                                                                            if (arrayList == null) {
                                                                                                                arrayList = new ArrayList();
                                                                                                                linkedHashMap2.put(strIconCompatParcelizer, arrayList);
                                                                                                            }
                                                                                                            ((List) arrayList).add(str2);
                                                                                                        }
                                                                                                    }
                                                                                                    SemanticsOwner semanticsOwner3 = this.MediaMetadataCompat;
                                                                                                    if (semanticsOwner3 != null) {
                                                                                                        ((getRootInfoui) semanticsOwner3).write("asti_app_application_on_create");
                                                                                                        traceIconCompatParcelizer.stop();
                                                                                                        return;
                                                                                                    } else {
                                                                                                        removeNodeAtDepth.serializer("appPerformanceTrackingManager");
                                                                                                        throw null;
                                                                                                    }
                                                                                                }
                                                                                                removeNodeAtDepth.serializer("unknownUiErrorLogger");
                                                                                                throw null;
                                                                                            }
                                                                                            removeNodeAtDepth.serializer("registerGpsChangedReceiver");
                                                                                            throw null;
                                                                                        }
                                                                                        removeNodeAtDepth.serializer("refreshDeviceStatusUseCase");
                                                                                        throw null;
                                                                                    }
                                                                                    removeNodeAtDepth.serializer("observerRiderStateForLocationUpdates");
                                                                                    throw null;
                                                                                }
                                                                                removeNodeAtDepth.serializer("sentryScreenPerformanceInitializer");
                                                                                throw null;
                                                                            }
                                                                            removeNodeAtDepth.serializer("logoutLifecycleCallbacks");
                                                                            throw null;
                                                                        }
                                                                        removeNodeAtDepth.serializer("isDeferredNavigationSdkInitEnabled");
                                                                        throw null;
                                                                    }
                                                                    removeNodeAtDepth.serializer("initialiseMapProvider");
                                                                    throw null;
                                                                }
                                                                removeNodeAtDepth.serializer("initializeAppStartupItems");
                                                                throw null;
                                                            }
                                                            removeNodeAtDepth.serializer("logIfAppWasForceClosed");
                                                            throw null;
                                                        }
                                                        removeNodeAtDepth.serializer("riderSupportFeatures");
                                                        throw null;
                                                    }
                                                    removeNodeAtDepth.serializer("riderSupportFeatures");
                                                    throw null;
                                                }
                                                removeNodeAtDepth.serializer("sentryLoggerInitializer");
                                                throw null;
                                            }
                                            removeNodeAtDepth.serializer("deviceRootInfoPropertySetter");
                                            throw null;
                                        }
                                        removeNodeAtDepth.serializer("deviceIdLifecycleObserver");
                                        throw null;
                                    }
                                    removeNodeAtDepth.serializer("deviceIdProvider");
                                    throw null;
                                }
                                removeNodeAtDepth.serializer("rxDogTagInitializer");
                                throw null;
                            }
                            removeNodeAtDepth.serializer("setApplicationUiMode");
                            throw null;
                        }
                        removeNodeAtDepth.serializer("screenTimePerformanceInitializer");
                        throw null;
                    }
                    removeNodeAtDepth.serializer("appPerformanceAttributeProviderInitializer");
                    throw null;
                }
                removeNodeAtDepth.serializer("appPerformanceTrackingManager");
                throw null;
            }
            removeNodeAtDepth.serializer("prewarmCertificateHash");
            throw null;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 29;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            activity.getClass();
            int i3 = onBackPressedInput_delegatelambda0 + 105;
            onBackPressedDispatcher_delegatelambda010 = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        activity.getClass();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 73;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = onBackPressedDispatcher_delegatelambda010 + 69;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 5;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activity.getClass();
            bundle.getClass();
            int i3 = onBackPressedInput_delegatelambda0 + 91;
            onBackPressedDispatcher_delegatelambda010 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        activity.getClass();
        bundle.getClass();
        throw null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        CourierApplication courierApplication = (CourierApplication) objArr[0];
        Activity activity = (Activity) objArr[1];
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 9;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        courierApplication.MediaSessionCompatQueueItem = "";
        courierApplication.defaultViewModelProviderFactory_delegatelambda0 = null;
        int i4 = onBackPressedDispatcher_delegatelambda010 + 89;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return null;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        composeToViewOffset composetoviewoffset = new composeToViewOffset();
        char[] cArr2 = new char[cArr.length];
        composetoviewoffset.RemoteActionCompatParcelizer = 0;
        char[] cArr3 = new char[2];
        while (composetoviewoffset.RemoteActionCompatParcelizer < cArr.length) {
            int i3 = $11 + 69;
            $10 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            cArr3[0] = cArr[composetoviewoffset.RemoteActionCompatParcelizer];
            cArr3[1] = cArr[composetoviewoffset.RemoteActionCompatParcelizer + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) getSavedStateRegistryControllerannotations) ^ 7962313315467514595L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(addContentView)};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 65450);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1244;
                        int gidForName = 32 - Process.getGidForName("");
                        byte b = (byte) ($$c[3] + 1);
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollDefaultDelay, offsetAfter, gidForName, 402902884, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) menuHostHelperlambda0) ^ 7962313315467514595L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getOnBackPressedInput)};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 65450);
                        int iAlpha = 1244 - Color.alpha(0);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 33;
                        byte b3 = (byte) ($$c[3] + 1);
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c3, iAlpha, longPressTimeout, 402902884, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer] = cArr3[0];
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer + 1] = cArr3[1];
            Object[] objArr4 = {composetoviewoffset, composetoviewoffset};
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(547433723);
            if (objRemoteActionCompatParcelizer3 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iIndexOf = TextUtils.indexOf("", "") + 2546;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 30;
                byte b5 = $$c[3];
                byte b6 = (byte) (b5 + 1);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarFadeDuration, iIndexOf, packedPositionType, -261026534, false, $$e(b6, b6, (byte) (-b5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i7 = $10 + 47;
            $11 = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 37;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        write();
        super.attachBaseContext(context);
        Object[] objArr = new Object[1];
        a(16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{26874, 58215, 57702, 31499, 15946, 27296, 35668, 32414, 48427, 38362, 59763, 7505, 28066, 32245, 43509, 12776}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777229, new char[]{19244, 31479, 43413, 43166, 34509, 21811, 54967, 18362, 44558, 51416, 11617, 61056, 50319, 52568}, objArr2);
        Thread thread = (Thread) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0]);
        Object[] objArr3 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, new char[]{26874, 58215, 57702, 31499, 15946, 27296, 35668, 32414, 48427, 38362, 59763, 7505, 28066, 32245, 43509, 12776}, objArr3);
        Class<?> cls2 = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(13 - Color.green(0), new char[]{9617, 18959, 48905, 6142, 6677, 31452, 21529, 9778, 29690, 19603, 27429, 41310, 45247, 23868}, objArr4);
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(thread, new Object[0]);
        try {
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1004846139);
            if (objRemoteActionCompatParcelizer == null) {
                char mode = (char) (View.MeasureSpec.getMode(0) + 56289);
                int defaultSize = View.getDefaultSize(0, 0) + 578;
                int doubleTapTimeout = 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr = $$a;
                byte b = bArr[15];
                byte b2 = bArr[19];
                Object[] objArr5 = new Object[1];
                b(b, b2, (byte) (b2 - 3), objArr5);
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(mode, defaultSize, doubleTapTimeout, 348873252, false, (String) objArr5[0], new Class[0]);
            }
            String[] strArr = (String[]) ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
            Object[] objArr6 = new Object[1];
            a((KeyEvent.getMaxKeyCode() >> 16) + 27, new char[]{26874, 58215, 57702, 31499, 15946, 27296, 35668, 32414, 48427, 38362, 60997, 14717, 27429, 41310, 61289, 8963, 29256, 47897, 56304, 27319, 38185, 35027, 3842, 45499, 34509, 21811, 19753, 44749}, objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a((ViewConfiguration.getTapTimeout() >> 16) + 12, new char[]{9617, 18959, 38432, 7246, 52825, 17381, 61318, 55642, 45284, 44689, 22240, 37639}, objArr7);
            Method method = cls3.getMethod((String) objArr7[0], new Class[0]);
            Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-219743933);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iMyPid = 423 - (Process.myPid() >> 22);
                int iBlue = 30 - Color.blue(0);
                byte b3 = (byte) (-$$a[7]);
                byte b4 = b3;
                Object[] objArr8 = new Object[1];
                b(b3, b4, (byte) (b4 | 34), objArr8);
                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cCombineMeasuredStates, iMyPid, iBlue, 574019746, false, (String) objArr8[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer2).setInt(null, 0);
            int i4 = onBackPressedDispatcher_delegatelambda010 + 55;
            onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            loop0: for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                int i6 = onBackPressedInput_delegatelambda0 + 77;
                onBackPressedDispatcher_delegatelambda010 = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                for (String str : strArr) {
                    if (str.equals((String) method.invoke(stackTraceElement, new Object[0]))) {
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-219743933);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                            int iLastIndexOf = 422 - TextUtils.lastIndexOf("", '0');
                            int iIndexOf = 30 - TextUtils.indexOf("", "", 0);
                            byte b5 = (byte) (-$$a[7]);
                            byte b6 = b5;
                            Object[] objArr9 = new Object[1];
                            b(b5, b6, (byte) (b6 | 34), objArr9);
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter, iLastIndexOf, iIndexOf, 574019746, false, (String) objArr9[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer3).setInt(null, 1);
                        break loop0;
                    }
                }
            }
            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2110493678);
            if (objRemoteActionCompatParcelizer4 == null) {
                char gidForName = (char) (Process.getGidForName("") + 56290);
                int edgeSlop = 578 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i8 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32;
                byte[] bArr2 = $$a;
                byte b7 = (byte) (bArr2[13] + 1);
                byte b8 = bArr2[15];
                Object[] objArr10 = new Object[1];
                b(b7, (byte) (b8 + 1), (byte) (-b8), objArr10);
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(gidForName, edgeSlop, i8, -1390693873, false, (String) objArr10[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer4).set(null, -1L);
            MultiDex.install(this);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        activity.getClass();
        String localClassName = activity.getLocalClassName();
        localClassName.getClass();
        this.MediaSessionCompatQueueItem = localClassName;
        this.defaultViewModelProviderFactory_delegatelambda0 = new WeakReference(activity);
        int i2 = onBackPressedDispatcher_delegatelambda010 + 73;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        activity.getClass();
        String simpleName = activity.getClass().getSimpleName();
        ArrayList arrayList = this._init_lambda4;
        if (!arrayList.contains(simpleName)) {
            int i2 = onBackPressedInput_delegatelambda0 + 69;
            onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            arrayList.add(simpleName);
        }
        int i4 = onBackPressedDispatcher_delegatelambda010 + 77;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 101;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            activity.getClass();
            String simpleName = activity.getClass().getSimpleName();
            ArrayList arrayList = this._init_lambda4;
            if (arrayList.contains(simpleName)) {
                int i3 = onBackPressedDispatcher_delegatelambda010 + 95;
                onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    arrayList.remove(simpleName);
                    return;
                } else {
                    arrayList.remove(simpleName);
                    obj.hashCode();
                    throw null;
                }
            }
            return;
        }
        activity.getClass();
        this._init_lambda4.contains(activity.getClass().getSimpleName());
        obj.hashCode();
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        isMainThreadroom_runtime ismainthreadroom_runtime;
        int i2 = 2 % 2;
        str.getClass();
        createVerticalAnimation createverticalanimation = new createVerticalAnimation(this, str, i);
        ConcurrentHashMap concurrentHashMap = AbstractC0197query.RemoteActionCompatParcelizer;
        Object objPutIfAbsent = concurrentHashMap.get(str);
        if (objPutIfAbsent == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (ismainthreadroom_runtime = new isMainThreadroom_runtime(createverticalanimation, str, AbstractC0197query.IconCompatParcelizer)))) == null) {
            objPutIfAbsent = ismainthreadroom_runtime;
        }
        SharedPreferences sharedPreferences = (SharedPreferences) objPutIfAbsent;
        int i3 = onBackPressedDispatcher_delegatelambda010 + 117;
        onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return sharedPreferences;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009b, code lost:
    
        if (r18.PlaybackStateCompat != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009d, code lost:
    
        r4 = com.foodora.courier.app.application.CourierApplication.onBackPressedInput_delegatelambda0 + 59;
        com.foodora.courier.app.application.CourierApplication.onBackPressedDispatcher_delegatelambda010 = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
        r2.IconCompatParcelizer = o.ImageShaderF49vj9sdefault.serializer(r6, null, r3, null, 16375);
        r3 = org.koin.dsl.ModuleDSLKt.RemoteActionCompatParcelizer(r18);
        r4 = o.LinearGradientShaderVjE6UOU.MediaDescriptionCompat;
        r4 = (o.accessorjd) r2.serializer;
        r4.serializer.put(o.LinearGradientShaderVjE6UOU.read, java.lang.Boolean.valueOf(r3));
        r2 = r2.IconCompatParcelizer();
        r3 = com.foodora.courier.app.application.CourierApplication.onBackPressedInput_delegatelambda0 + 5;
        com.foodora.courier.app.application.CourierApplication.onBackPressedDispatcher_delegatelambda010 = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d0, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d2, code lost:
    
        r1 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d6, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d7, code lost:
    
        o.removeNodeAtDepth.serializer("dispatcherProvider");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0086, code lost:
    
        if (r18.PlaybackStateCompat != null) goto L11;
     */
    @Override // o.iteratordefault
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final coil3.RealImageLoader write(android.content.Context r19) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foodora.courier.app.application.CourierApplication.write(android.content.Context):coil3.RealImageLoader");
    }

    public final void MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 35;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onCreate();
            RatingCompat();
        } else {
            super.onCreate();
            RatingCompat();
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int iSerializer = accesstoComposeOffset.serializer();
        read(accesstoComposeOffset.serializer(), iSerializer, 1459906209, new Object[]{this, activity}, InputMethodManagerImpl.RemoteActionCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.COURIER_AND_DELIVERIES_CURRENCY_PATTERN).substring(0, 4).length() + 865933841, -1459906208);
    }

    public final boolean MediaBrowserCompatMediaItem() {
        int iRemoteActionCompatParcelizer = InputMethodManagerImpl.RemoteActionCompatParcelizer();
        return ((Boolean) read(InputMethodManagerImpl.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, -1696115683, new Object[]{this}, InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), 1696115685)).booleanValue();
    }

    public static SharedPreferences read(CourierApplication courierApplication, String str, int i) {
        Object[] objArr = {courierApplication, str, Integer.valueOf(i)};
        return (SharedPreferences) read(InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), 1227617496, objArr, InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), -1227617496);
    }
}
