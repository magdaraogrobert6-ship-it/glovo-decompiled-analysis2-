package com.roadrunner.map.container.maplayer;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.provider.Settings;
import androidx.compose.ui.graphics.Fields;
import androidx.core.widget.NestedScrollView;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.mapbox.navigation.base.formatter.DistanceFormatterOptions;
import com.mapbox.navigation.tripdata.maneuver.api.MapboxManeuverApi;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.map.integration.mapbox.maneuver.ManeuverApi;
import com.roadrunner.map.integration.mapbox.tripprogress.TripProgressApi;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.scottyab.rootbeer.RootBeerNative;
import io.grpc.internal.CallTracer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import o.InnerShadowRendererProviderCompanion;
import o.L;
import o.LayerSnapshotV28;
import o.O;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShadowSpan;
import o.ShortNewsContentCardView;
import o.accesssetHasRetrievedMethodcp;
import o.applyAlpha;
import o.createFromParcel;
import o.defaultCardHandlinglambda0;
import o.dh;
import o.getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode;
import o.getContentViewGroupParentLayout;
import o.getPathFillTypeRgk1Os;
import o.pauseWebviewIfNecessarylambda10;
import o.performClear;
import o.performDestroy;
import o.performDestroyView;
import o.performPause;
import o.r8lambdaNT8L1_Fcnjr9pKZ3qUchXpitvQY;
import o.r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.requireHost;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class MapLayersUiModel$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapLayersUiModel$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 111;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        switch (i5) {
            case 0:
                return new MapLayersUiModel$1((dh) obj2, shortNewsContentCardView, 0);
            case 1:
                return new MapLayersUiModel$1((LayerSnapshotV28) obj2, shortNewsContentCardView, 1);
            case 2:
                return new MapLayersUiModel$1((applyAlpha) obj2, shortNewsContentCardView, i);
            case 3:
                MapLayersUiModel$1 mapLayersUiModel$1 = new MapLayersUiModel$1((InnerShadowRendererProviderCompanion) obj2, shortNewsContentCardView, 3);
                int i6 = IconCompatParcelizer + 75;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return mapLayersUiModel$1;
            case 4:
                return new MapLayersUiModel$1((Application) obj2, shortNewsContentCardView, 4);
            case 5:
                return new MapLayersUiModel$1((getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) obj2, shortNewsContentCardView, 5);
            case 6:
                return new MapLayersUiModel$1((LocalAuthDataSource) obj2, shortNewsContentCardView, 6);
            case 7:
                return new MapLayersUiModel$1((ShadowSpan) obj2, shortNewsContentCardView, 7);
            case 8:
                return new MapLayersUiModel$1((AtomicBoolean) obj2, shortNewsContentCardView, 8);
            case 9:
                return new MapLayersUiModel$1((HomeFragment) obj2, shortNewsContentCardView, 9);
            case 10:
                return new MapLayersUiModel$1((CallTracer) obj2, shortNewsContentCardView, 10);
            case 11:
                return new MapLayersUiModel$1((performPause) obj2, shortNewsContentCardView, 11);
            case 12:
                return new MapLayersUiModel$1((PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 12);
            case 13:
                return new MapLayersUiModel$1((performClear) obj2, shortNewsContentCardView, 13);
            case 14:
                return new MapLayersUiModel$1((RouterLogger) obj2, shortNewsContentCardView, 14);
            case 15:
                return new MapLayersUiModel$1((ManeuverApi) obj2, shortNewsContentCardView, 15);
            case 16:
                return new MapLayersUiModel$1((TripProgressApi) obj2, shortNewsContentCardView, 16);
            default:
                return new MapLayersUiModel$1((SaveHeatmapUrlImpl) obj2, shortNewsContentCardView, 17);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 1:
                return ((MapLayersUiModel$1) create((LayerSnapshotV28) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((MapLayersUiModel$1) create((applyAlpha) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                return ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 5:
                ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 6:
                return ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                ((MapLayersUiModel$1) create(obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 9:
                ((MapLayersUiModel$1) create((createFromParcel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 10:
                ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 11:
                ((MapLayersUiModel$1) create((performDestroyView) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 12:
                ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 13:
                ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 14:
                ((MapLayersUiModel$1) create((L) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = IconCompatParcelizer + 59;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return createfromparcel;
            case 15:
                return ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                return ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                Object objInvokeSuspend = ((MapLayersUiModel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = IconCompatParcelizer + 61;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objInvokeSuspend;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e5 A[Catch: NoSuchElementException -> 0x02f7, IOException | NoSuchElementException -> 0x02f9, TRY_LEAVE, TryCatch #9 {IOException | NoSuchElementException -> 0x02f9, blocks: (B:106:0x02d4, B:109:0x02e5), top: B:192:0x02d4 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0300  */
    /* JADX WARN: Code duplicated, block: B:118:0x030c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0311  */
    /* JADX WARN: Code duplicated, block: B:122:0x031d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0327  */
    /* JADX WARN: Code duplicated, block: B:126:0x0331  */
    /* JADX WARN: Code duplicated, block: B:128:0x033b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0353  */
    /* JADX WARN: Code duplicated, block: B:133:0x0376 A[LOOP:5: B:129:0x0351->B:133:0x0376, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:148:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:158:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:160:0x03db A[PHI: r4
  0x03db: PHI (r4v8 int) = (r4v7 int), (r4v7 int), (r4v11 int) binds: [B:154:0x03c4, B:157:0x03d2, B:150:0x03bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:163:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:165:0x03f2 A[LOOP:2: B:164:0x03f0->B:165:0x03f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x0411  */
    /* JADX WARN: Code duplicated, block: B:173:0x042c  */
    /* JADX WARN: Code duplicated, block: B:174:0x042e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0430  */
    /* JADX WARN: Code duplicated, block: B:182:0x0392 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x037a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x035d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:118:0x030c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x033b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ActivityManager activityManager;
        int memoryClass;
        boolean z;
        boolean z2;
        String[] strArrSplit;
        String[] strArrSplit2;
        boolean z3;
        int i;
        String[] strArrSplit3;
        String str;
        String strReplace;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        Process processExec;
        int i5;
        String[] strArrSerializer;
        int length;
        String[] strArr;
        int i6;
        RootBeerNative rootBeerNative;
        boolean z4;
        InputStream inputStream;
        int i7 = 2;
        int i8 = 2 % 2;
        int i9 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.RemoteActionCompatParcelizer;
        int i10 = 1;
        int i11 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i9) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                dh dhVar = (dh) obj2;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = dhVar.RatingCompat;
                if (dhVar.ParcelableVolumeInfo.IconCompatParcelizer()) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new MapLayersUiModel$initMapScope$1(dhVar, shortNewsContentCardView, i11), 3);
                } else {
                    dhVar.MediaSessionCompatResultReceiverWrapper = dhVar.PlaybackStateCompatCustomAction.write(getcontentviewgroupparentlayout, L.DEFAULT);
                    dh.RemoteActionCompatParcelizer(dhVar, getcontentviewgroupparentlayout);
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new MapLayersUiModel$initMapScope$1(dhVar, shortNewsContentCardView, i10), 3);
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new MapLayersUiModel$initMapScope$1(dhVar, shortNewsContentCardView, i7), 3);
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) dhVar.MediaSessionCompatQueueItem;
                    firebaseRemoteConfigImpl.getClass();
                    if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_INTUITIVE_ZOOM_ENABLED)) {
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new MapLayersUiModel$observeCenterButtonVisibility$1(dhVar, shortNewsContentCardView, i11), 3);
                    }
                    dh.read(dhVar, getcontentviewgroupparentlayout);
                }
                return createfromparcel;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return (LayerSnapshotV28) obj2;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return (applyAlpha) obj2;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object systemService = ((InnerShadowRendererProviderCompanion) obj2).write.getSystemService("activity");
                if (systemService instanceof ActivityManager) {
                    int i12 = IconCompatParcelizer + 117;
                    write = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    activityManager = (ActivityManager) systemService;
                } else {
                    activityManager = null;
                }
                if (activityManager != null) {
                    int i14 = IconCompatParcelizer + 97;
                    write = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        activityManager.getMemoryClass();
                        throw null;
                    }
                    memoryClass = activityManager.getMemoryClass();
                } else {
                    memoryClass = -1;
                }
                return new Integer(memoryClass);
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                try {
                    String string = Settings.Secure.getString(((Application) obj2).getContentResolver(), "android_id");
                    string.getClass();
                    pauseWebviewIfNecessarylambda10.serializer = string;
                    break;
                } catch (RuntimeException e) {
                    getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("issue happened when getting android id ", e);
                }
                return createfromparcel;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((getAllUncoveredSemanticsNodesToIntObjectMaplambda0addFakeNode) obj2).serializer.write(defaultCardHandlinglambda0.OK);
                return createfromparcel;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((LocalAuthDataSource) obj2).RemoteActionCompatParcelizer();
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ShadowSpan shadowSpan = (ShadowSpan) obj2;
                return new HeatmapDataStore$get$$inlined$map$1(shadowSpan.RemoteActionCompatParcelizer.read().serializer(), shadowSpan, 10);
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((AtomicBoolean) obj2).set(true);
                return createfromparcel;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                requireHost requirehost = ((HomeFragment) obj2).RemoteActionCompatParcelizer;
                requirehost.getClass();
                NestedScrollView nestedScrollView = requirehost.read.RemoteActionCompatParcelizer;
                nestedScrollView.serializer(0 - nestedScrollView.getScrollX(), 0 - nestedScrollView.getScrollY(), false);
                return createfromparcel;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((QualtricsManagerImpl) ((CallTracer) obj2).write).getClass();
                return createfromparcel;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performDestroy performdestroy = ((performPause) obj2).read;
                if (performdestroy != null) {
                    YieldKt.write(performdestroy.serializer, (CancellationException) null);
                }
                return createfromparcel;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((PopulateViewStructure_androidKtpopulate7) obj2).setValue(Boolean.TRUE);
                return createfromparcel;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performClear performclear = (performClear) obj2;
                if (!performclear.serializer.commit()) {
                    Timber.RemoteActionCompatParcelizer.write(new Exception(ff$$ExternalSyntheticOutline0.m("Failed to commit change for ", performclear.write, " to shared preference")));
                }
                return createfromparcel;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                O o2 = (O) ((RouterLogger) obj2).serializer;
                if (o2 != null) {
                    int i15 = IconCompatParcelizer + 11;
                    write = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        YieldKt.write(o2.read, (CancellationException) null);
                        throw null;
                    }
                    YieldKt.write(o2.read, (CancellationException) null);
                }
                return createfromparcel;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return new MapboxManeuverApi(new AnalyticsServiceImpl((DistanceFormatterOptions) ((ManeuverApi) obj2).serializer.read.MediaSessionCompatResultReceiverWrapper(), 4));
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((TripProgressApi) obj2).write();
            default:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accesssetHasRetrievedMethodcp accesssethasretrievedmethodcp = (accesssetHasRetrievedMethodcp) ((SaveHeatmapUrlImpl) obj2).serializer;
                if (!accesssethasretrievedmethodcp.read(new ArrayList(Arrays.asList(r8lambdaNT8L1_Fcnjr9pKZ3qUchXpitvQY.serializer)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(Arrays.asList(r8lambdaNT8L1_Fcnjr9pKZ3qUchXpitvQY.write));
                    if (accesssethasretrievedmethodcp.read(arrayList) || accesssetHasRetrievedMethodcp.IconCompatParcelizer("su")) {
                        z = true;
                    } else {
                        HashMap map = new HashMap();
                        map.put("ro.debuggable", "1");
                        map.put("ro.secure", "0");
                        try {
                            InputStream inputStream2 = Runtime.getRuntime().exec("getprop").getInputStream();
                            strArrSplit = inputStream2 != null ? new Scanner(inputStream2).useDelimiter("\\A").next().split("\n") : null;
                        } catch (IOException | NoSuchElementException e2) {
                            r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.IconCompatParcelizer(e2);
                        }
                        if (strArrSplit == null) {
                            try {
                                inputStream = Runtime.getRuntime().exec("mount").getInputStream();
                                if (inputStream == null) {
                                    strArrSplit2 = new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
                                } else {
                                    strArrSplit2 = null;
                                }
                            } catch (IOException | NoSuchElementException e3) {
                                r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.IconCompatParcelizer(e3);
                            }
                            if (strArrSplit2 == null) {
                                int i16 = IconCompatParcelizer + 49;
                                write = i16 % Fields.SpotShadowColor;
                                int i17 = i16 % 2;
                            } else {
                                z3 = false;
                                for (String str4 : strArrSplit2) {
                                    strArrSplit3 = str4.split(" ");
                                    if (strArrSplit3.length < 6) {
                                        r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.read("Error formatting mount line: ".concat(str4));
                                    } else {
                                        str = strArrSplit3[2];
                                        strReplace = strArrSplit3[5];
                                        for (i2 = 0; i2 < 7; i2++) {
                                            str2 = r8lambdaNT8L1_Fcnjr9pKZ3qUchXpitvQY.RemoteActionCompatParcelizer[i2];
                                            if (str.equalsIgnoreCase(str2)) {
                                                strReplace = strReplace.replace("(", "").replace(")", "");
                                                for (String str5 : strReplace.split(",")) {
                                                    if (str5.equalsIgnoreCase("rw")) {
                                                        r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.IconCompatParcelizer(str2 + " path is mounted with rw permissions! " + str4);
                                                        z3 = true;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!z3) {
                                    z = true;
                                }
                            }
                            str3 = Build.TAGS;
                            if (str3 == null && str3.contains("test-keys")) {
                                z = true;
                            } else {
                                try {
                                    Runtime runtime = Runtime.getRuntime();
                                    String[] strArr2 = new String[2];
                                    i4 = 0;
                                    try {
                                        strArr2[0] = "which";
                                        strArr2[1] = "su";
                                        processExec = runtime.exec(strArr2);
                                        try {
                                            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            processExec.destroy();
                                            if (z4) {
                                                z = true;
                                            } else {
                                                if (!RootBeerNative.RemoteActionCompatParcelizer) {
                                                    strArrSerializer = r8lambdaNT8L1_Fcnjr9pKZ3qUchXpitvQY.serializer();
                                                    length = strArrSerializer.length;
                                                    strArr = new String[length];
                                                    for (i6 = i4; i6 < length; i6++) {
                                                        strArr[i6] = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), strArrSerializer[i6], "su");
                                                    }
                                                    rootBeerNative = new RootBeerNative();
                                                    z = true;
                                                    try {
                                                        rootBeerNative.setLogDebugMessages(true);
                                                        if (rootBeerNative.checkForRoot(strArr) > 0) {
                                                            int i18 = write;
                                                            int i19 = i18 + 79;
                                                            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                                                            int i20 = i19 % 2;
                                                            int i21 = i18 + 17;
                                                            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                                                            int i22 = i21 % 2;
                                                        }
                                                    } catch (UnsatisfiedLinkError unused) {
                                                    }
                                                } else {
                                                    r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.read("We could not load the native library to test for root");
                                                    z = true;
                                                }
                                                if (accesssetHasRetrievedMethodcp.IconCompatParcelizer("magisk")) {
                                                    z2 = i4;
                                                }
                                            }
                                        } catch (Throwable unused2) {
                                            if (processExec != null) {
                                                i5 = write + 81;
                                                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                                                if (i5 % 2 == 0) {
                                                    processExec.destroy();
                                                    throw null;
                                                }
                                                processExec.destroy();
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                        processExec = null;
                                        if (processExec != null) {
                                            i5 = write + 81;
                                            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                                            if (i5 % 2 == 0) {
                                                processExec.destroy();
                                                throw null;
                                            }
                                            processExec.destroy();
                                        }
                                        if (!RootBeerNative.RemoteActionCompatParcelizer) {
                                            strArrSerializer = r8lambdaNT8L1_Fcnjr9pKZ3qUchXpitvQY.serializer();
                                            length = strArrSerializer.length;
                                            strArr = new String[length];
                                            while (i6 < length) {
                                                strArr[i6] = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), strArrSerializer[i6], "su");
                                            }
                                            rootBeerNative = new RootBeerNative();
                                            z = true;
                                            rootBeerNative.setLogDebugMessages(true);
                                            if (rootBeerNative.checkForRoot(strArr) > 0) {
                                                int i110 = write;
                                                int i111 = i110 + 79;
                                                IconCompatParcelizer = i111 % Fields.SpotShadowColor;
                                                int i23 = i111 % 2;
                                                int i24 = i110 + 17;
                                                IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                                                int i25 = i24 % 2;
                                            }
                                            z2 = z;
                                            return Boolean.valueOf(z2);
                                        }
                                        r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.read("We could not load the native library to test for root");
                                        z = true;
                                        if (accesssetHasRetrievedMethodcp.IconCompatParcelizer("magisk")) {
                                            z2 = i4;
                                        } else {
                                            z2 = z;
                                        }
                                        return Boolean.valueOf(z2);
                                    }
                                } catch (Throwable unused4) {
                                    i4 = 0;
                                }
                            }
                        } else {
                            int length2 = strArrSplit.length;
                            int i26 = IconCompatParcelizer + 93;
                            write = i26 % Fields.SpotShadowColor;
                            int i27 = i26 % 2;
                            boolean z5 = false;
                            int i28 = 0;
                            while (i28 < length2) {
                                int i29 = write + 33;
                                IconCompatParcelizer = i29 % Fields.SpotShadowColor;
                                if (i29 % i7 != 0) {
                                    String str6 = strArrSplit[i28];
                                    map.keySet().iterator();
                                    throw null;
                                }
                                String str7 = strArrSplit[i28];
                                for (String str8 : map.keySet()) {
                                    if (str7.contains(str8)) {
                                        String strM = ff$$ExternalSyntheticOutline0.m("[", (String) map.get(str8), "]");
                                        if (str7.contains(strM)) {
                                            r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.IconCompatParcelizer(str8 + " = " + strM + " detected!");
                                            z5 = true;
                                        }
                                    }
                                }
                                i28++;
                                i7 = 2;
                            }
                            if (z5) {
                                z = true;
                            } else {
                                inputStream = Runtime.getRuntime().exec("mount").getInputStream();
                                if (inputStream == null) {
                                    strArrSplit2 = new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
                                } else {
                                    strArrSplit2 = null;
                                }
                                if (strArrSplit2 == null) {
                                    int i112 = IconCompatParcelizer + 49;
                                    write = i112 % Fields.SpotShadowColor;
                                    int i113 = i112 % 2;
                                } else {
                                    z3 = false;
                                    while (i < r2) {
                                        strArrSplit3 = str4.split(" ");
                                        if (strArrSplit3.length < 6) {
                                            r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.read("Error formatting mount line: ".concat(str4));
                                        } else {
                                            str = strArrSplit3[2];
                                            strReplace = strArrSplit3[5];
                                            while (i2 < 7) {
                                                str2 = r8lambdaNT8L1_Fcnjr9pKZ3qUchXpitvQY.RemoteActionCompatParcelizer[i2];
                                                if (str.equalsIgnoreCase(str2)) {
                                                    strReplace = strReplace.replace("(", "").replace(")", "");
                                                    while (i3 < r13) {
                                                        if (str5.equalsIgnoreCase("rw")) {
                                                            r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.IconCompatParcelizer(str2 + " path is mounted with rw permissions! " + str4);
                                                            z3 = true;
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        z = true;
                                    }
                                }
                                str3 = Build.TAGS;
                                if (str3 == null) {
                                    Runtime runtime2 = Runtime.getRuntime();
                                    String[] strArr3 = new String[2];
                                    i4 = 0;
                                    strArr3[0] = "which";
                                    strArr3[1] = "su";
                                    processExec = runtime2.exec(strArr3);
                                    if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    processExec.destroy();
                                    if (z4) {
                                        if (!RootBeerNative.RemoteActionCompatParcelizer) {
                                            r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.read("We could not load the native library to test for root");
                                            z = true;
                                        } else {
                                            strArrSerializer = r8lambdaNT8L1_Fcnjr9pKZ3qUchXpitvQY.serializer();
                                            length = strArrSerializer.length;
                                            strArr = new String[length];
                                            while (i6 < length) {
                                                strArr[i6] = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), strArrSerializer[i6], "su");
                                            }
                                            rootBeerNative = new RootBeerNative();
                                            z = true;
                                            rootBeerNative.setLogDebugMessages(true);
                                            if (rootBeerNative.checkForRoot(strArr) > 0) {
                                                int i114 = write;
                                                int i115 = i114 + 79;
                                                IconCompatParcelizer = i115 % Fields.SpotShadowColor;
                                                int i210 = i115 % 2;
                                                int i211 = i114 + 17;
                                                IconCompatParcelizer = i211 % Fields.SpotShadowColor;
                                                int i212 = i211 % 2;
                                            }
                                        }
                                        if (accesssetHasRetrievedMethodcp.IconCompatParcelizer("magisk")) {
                                            z2 = i4;
                                        }
                                    } else {
                                        z = true;
                                    }
                                } else {
                                    Runtime runtime3 = Runtime.getRuntime();
                                    String[] strArr4 = new String[2];
                                    i4 = 0;
                                    strArr4[0] = "which";
                                    strArr4[1] = "su";
                                    processExec = runtime3.exec(strArr4);
                                    if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    processExec.destroy();
                                    if (z4) {
                                        if (!RootBeerNative.RemoteActionCompatParcelizer) {
                                            r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.read("We could not load the native library to test for root");
                                            z = true;
                                        } else {
                                            strArrSerializer = r8lambdaNT8L1_Fcnjr9pKZ3qUchXpitvQY.serializer();
                                            length = strArrSerializer.length;
                                            strArr = new String[length];
                                            while (i6 < length) {
                                                strArr[i6] = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), strArrSerializer[i6], "su");
                                            }
                                            rootBeerNative = new RootBeerNative();
                                            z = true;
                                            rootBeerNative.setLogDebugMessages(true);
                                            if (rootBeerNative.checkForRoot(strArr) > 0) {
                                                int i116 = write;
                                                int i117 = i116 + 79;
                                                IconCompatParcelizer = i117 % Fields.SpotShadowColor;
                                                int i213 = i117 % 2;
                                                int i214 = i116 + 17;
                                                IconCompatParcelizer = i214 % Fields.SpotShadowColor;
                                                int i215 = i214 % 2;
                                            }
                                        }
                                        if (accesssetHasRetrievedMethodcp.IconCompatParcelizer("magisk")) {
                                            z2 = i4;
                                        }
                                    } else {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    z2 = z;
                    break;
                } else {
                    z = true;
                    z2 = z;
                }
                return Boolean.valueOf(z2);
        }
    }
}
