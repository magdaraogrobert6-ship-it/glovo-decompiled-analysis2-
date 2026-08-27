package com.roadrunner.login.presentation.router;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.Updater$$ExternalSyntheticLambda1;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import androidx.work.impl.WorkerWrapper;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.logistics.rider.glovo.R;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.sentiance.sdk.drivinginsights.api.DrivingInsights;
import dagger.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidContentCaptureManager;
import o.BlurFilter;
import o.CloseableKt;
import o.DragAndDropTargetModifierNode;
import o.DropShadowRendererProviderCompanion;
import o.DropShadowRendererProviderCompanionDefault1;
import o.ImageHeaderParserImageType;
import o.SemanticsInfoKt;
import o.SemanticsOwner;
import o.SemanticsOwnerKt;
import o.ShortNewsContentCardView;
import o.SystemLifecycleSystemLifecycleCallback;
import o.TransacterDefaultImpls;
import o.access1000;
import o.accessisMainThread;
import o.c6;
import o.c8ExternalSyntheticLambda4;
import o.c8ExternalSyntheticOutline0;
import o.c9;
import o.cb;
import o.cc;
import o.cd;
import o.cdExternalSyntheticLambda0;
import o.ce;
import o.cf;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.createFromParcel;
import o.createImageBitmap;
import o.displayInAppMessagelambda1;
import o.executedefault;
import o.fromColorLong;
import o.getAllSemanticsNodesToMap;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.getRootInfoui;
import o.getUnmergedRootSemanticsNode;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.logParameters;
import o.onDrawShadowMLmccfk;
import o.onItemDismisslambda0;
import o.onViewDetachedFromWindowlambda1;
import o.prepareForActivityTransitionCarryover;
import o.q4ExternalSyntheticLambda9;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.requestSingleLocationUpdateandroid_sdk_base_release;
import o.runGuardedAsyncandroid_sdk_base_release;
import o.schedulePushDeliveryandroid_sdk_base_release;
import o.setImageLoader;
import o.setRegistrationDataProviderandroid_sdk_base_release;
import o.sourceInformationContextOfdefault;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import okio.Path$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RouterActivity extends ComponentActivity implements convertStringJsonArrayToList {
    private static int ResultReceiver = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    private final onViewDetachedFromWindowlambda1 ComponentActivity;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public SemanticsOwnerKt IconCompatParcelizer;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public runGuardedAsyncandroid_sdk_base_release MediaBrowserCompatMediaItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaDescriptionCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public requestSingleLocationUpdateandroid_sdk_base_release MediaMetadataCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public TransacterDefaultImpls MediaSessionCompatQueueItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public q4ExternalSyntheticLambda9 MediaSessionCompatResultReceiverWrapper;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public executedefault MediaSessionCompatToken;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY ParcelableVolumeInfo;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public getAllSemanticsNodesToMap PlaybackStateCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public Lazy PlaybackStateCompatCustomAction;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public c6 RatingCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public transferSessionPackageI RemoteActionCompatParcelizer;
    private final onViewDetachedFromWindowlambda1 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY read;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public isOpenInternalroom_runtime serializer;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public constructJsonArray write;

    public static /* synthetic */ Object write(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i4 | i5);
        int i8 = ~(i5 | i);
        int i9 = i7 | i8;
        int i10 = ~i4;
        int i11 = ~i5;
        int i12 = (~(i10 | i)) | (~(i10 | i11)) | (~(i11 | i));
        int i13 = ~i;
        int i14 = i12 | (~(i13 | i4 | i5));
        int i15 = (~(i13 | i11)) | i4 | i8;
        int i16 = i4 + i5 + i6 + (1962400304 * i2) + (1167700406 * i3);
        int i17 = i16 * i16;
        int i18 = ((i4 * (-1019457937)) - 559939584) + ((-1019457937) * i5) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i6) + ((-1660944384) * i2) + ((-325058560) * i3) + (867827712 * i17);
        int i19 = ((i4 * (-1629562239)) - 1134582380) + (i5 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i6 * (-1629561329)) + (i2 * (-1621399344)) + (i3 * (-873382486)) + (i17 * 1407582208);
        switch (i18 + (i19 * i19 * (-1895432192))) {
            case 1:
                return RemoteActionCompatParcelizer(objArr);
            case 2:
                return write(objArr);
            case 3:
                return read(objArr);
            case 4:
                return IconCompatParcelizer(objArr);
            case 5:
                return serializer(objArr);
            case 6:
                return MediaDescriptionCompat(objArr);
            default:
                RouterActivity routerActivity = (RouterActivity) objArr[0];
                cc ccVar = (cc) objArr[1];
                int i20 = 2 % 2;
                int i21 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 35;
                ResultReceiver = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                routerActivity.RemoteActionCompatParcelizer(ccVar);
                int i23 = ResultReceiver + 73;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                return null;
        }
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        RouterActivity routerActivity = (RouterActivity) objArr[0];
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 103;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            routerActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            return null;
        }
        routerActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        throw null;
    }

    public static final /* synthetic */ void write(RouterActivity routerActivity, cb cbVar) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 85;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        routerActivity.RemoteActionCompatParcelizer(cbVar);
        int i4 = ResultReceiver + 11;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        RouterActivity routerActivity = (RouterActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ResultReceiver + 97;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return routerActivity.write();
        }
        routerActivity.write();
        throw null;
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 57;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelWrite = write(onBackPressedCallback);
        int i4 = ResultReceiver + 63;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcelWrite;
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(RouterActivity routerActivity, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = ResultReceiver + 57;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            read(routerActivity, getbirthdatefull, i);
            throw null;
        }
        createFromParcel createfromparcel = read(routerActivity, getbirthdatefull, i);
        int i4 = ResultReceiver + 5;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public static /* synthetic */ createImageBitmap IconCompatParcelizer(RouterActivity routerActivity) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 41;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createImageBitmap createimagebitmap = (createImageBitmap) write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{routerActivity}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), -1024118044, 1024118048, BottomSheetBehavior.IconCompatParcelizer());
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 57;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createimagebitmap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ createImageBitmap read(RouterActivity routerActivity) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 81;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createImageBitmap createimagebitmap = (createImageBitmap) write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{routerActivity}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), 325908236, -325908234, BottomSheetBehavior.IconCompatParcelizer());
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 67;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createimagebitmap;
    }

    public static final /* synthetic */ GetAuthStateViewModel serializer(RouterActivity routerActivity) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 119;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        GetAuthStateViewModel getAuthStateViewModelResultReceiver = routerActivity.ResultReceiver();
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 47;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getAuthStateViewModelResultReceiver;
    }

    public static final /* synthetic */ RouterViewModel write(RouterActivity routerActivity) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 97;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RouterViewModel routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = routerActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 23;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        RouterActivity routerActivity = (RouterActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ResultReceiver + 37;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{routerActivity}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), -398511390, 398511396, BottomSheetBehavior.IconCompatParcelizer());
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 17;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }

    @Override // o.convertStringJsonArrayToList
    public r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 37;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        constructJsonArray constructjsonarray = read();
        int i4 = ResultReceiver + 107;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return constructjsonarray;
    }

    private static final createFromParcel write(OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 123;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            onBackPressedCallback.getClass();
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onBackPressedCallback.getClass();
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i3 = ResultReceiver + 17;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return createfromparcel2;
    }

    public RouterActivity() {
        final int i = 0;
        final int i2 = 1;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(RouterViewModel.class), new c8ExternalSyntheticLambda4(this, i), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.c4
            private static int read = 0;
            private static int serializer = 1;
            public final /* synthetic */ RouterActivity IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = read + 13;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i;
                RouterActivity routerActivity = this.IconCompatParcelizer;
                if (i5 == 0) {
                    return RouterActivity.read(routerActivity);
                }
                createImageBitmap createimagebitmapIconCompatParcelizer = RouterActivity.IconCompatParcelizer(routerActivity);
                int i6 = read + 23;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createimagebitmapIconCompatParcelizer;
            }
        }, new c8ExternalSyntheticLambda4(this, i2));
        this.ComponentActivity = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(GetAuthStateViewModel.class), new c8ExternalSyntheticLambda4(this, 2), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.c4
            private static int read = 0;
            private static int serializer = 1;
            public final /* synthetic */ RouterActivity IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = read + 13;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i2;
                RouterActivity routerActivity = this.IconCompatParcelizer;
                if (i5 == 0) {
                    return RouterActivity.read(routerActivity);
                }
                createImageBitmap createimagebitmapIconCompatParcelizer = RouterActivity.IconCompatParcelizer(routerActivity);
                int i6 = read + 23;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createimagebitmapIconCompatParcelizer;
            }
        }, new c8ExternalSyntheticLambda4(this, 3));
    }

    private final GetAuthStateViewModel ResultReceiver() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 55;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (GetAuthStateViewModel) this.ComponentActivity.MediaSessionCompatResultReceiverWrapper();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final RouterViewModel r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        RouterViewModel routerViewModel;
        int i = 2 % 2;
        int i2 = ResultReceiver + 123;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            routerViewModel = (RouterViewModel) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper();
            int i3 = 34 / 0;
        } else {
            routerViewModel = (RouterViewModel) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 13;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return routerViewModel;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        RouterActivity routerActivity = (RouterActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ResultReceiver + 61;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
        int i4 = i2 % 2;
        isOpenInternalroom_runtime isopeninternalroom_runtime = routerActivity.serializer;
        if (isopeninternalroom_runtime == null) {
            removeNodeAtDepth.serializer("dispatcherProvider");
            throw null;
        }
        int i5 = i3 + 35;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return isopeninternalroom_runtime;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        runGuardedAsyncandroid_sdk_base_release runguardedasyncandroid_sdk_base_release = ((RouterActivity) objArr[0]).MediaBrowserCompatMediaItem;
        if (runguardedasyncandroid_sdk_base_release == null) {
            removeNodeAtDepth.serializer("idVerificationEntryPointComposableFactory");
            throw null;
        }
        int i2 = ResultReceiver;
        int i3 = i2 + 53;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 113;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return runguardedasyncandroid_sdk_base_release;
    }

    public final requestSingleLocationUpdateandroid_sdk_base_release MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = ResultReceiver;
        int i3 = i2 + 35;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        requestSingleLocationUpdateandroid_sdk_base_release requestsinglelocationupdateandroid_sdk_base_release = this.MediaMetadataCompat;
        if (requestsinglelocationupdateandroid_sdk_base_release == null) {
            removeNodeAtDepth.serializer("idVerificationEntryPoint");
            throw null;
        }
        int i4 = i2 + 103;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return requestsinglelocationupdateandroid_sdk_base_release;
    }

    public final c6 MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = ResultReceiver;
        int i3 = i2 + 89;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        c6 c6Var = this.RatingCompat;
        if (c6Var == null) {
            removeNodeAtDepth.serializer("getAuthViewModelCoroutineScope");
            throw null;
        }
        int i4 = i2 + 103;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return c6Var;
    }

    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat() {
        int i = 2 % 2;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.MediaDescriptionCompat;
        if (r8lambdaktwlyipskq3tfa9ey3gatonixfq == null) {
            removeNodeAtDepth.serializer("getRoadrunnerDownloadUrl");
            throw null;
        }
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 113;
        int i3 = i2 % Fields.SpotShadowColor;
        ResultReceiver = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public final TransacterDefaultImpls MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 19;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
        int i4 = i2 % 2;
        TransacterDefaultImpls transacterDefaultImpls = this.MediaSessionCompatQueueItem;
        if (transacterDefaultImpls == null) {
            removeNodeAtDepth.serializer("loginNavigator");
            throw null;
        }
        int i5 = i3 + 71;
        int i6 = i5 % Fields.SpotShadowColor;
        ResultReceiver = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 19;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return transacterDefaultImpls;
    }

    public final q4ExternalSyntheticLambda9 MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i3 = i2 + 105;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        q4ExternalSyntheticLambda9 q4externalsyntheticlambda9 = this.MediaSessionCompatResultReceiverWrapper;
        if (q4externalsyntheticlambda9 == null) {
            removeNodeAtDepth.serializer("mainNavigator");
            throw null;
        }
        int i5 = i2 + 113;
        int i6 = i5 % Fields.SpotShadowColor;
        ResultReceiver = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 77;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return q4externalsyntheticlambda9;
    }

    public final executedefault ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 117;
        int i3 = i2 % Fields.SpotShadowColor;
        ResultReceiver = i3;
        int i4 = i2 % 2;
        executedefault executedefaultVar = this.MediaSessionCompatToken;
        if (executedefaultVar == null) {
            removeNodeAtDepth.serializer("loginPerformanceTracer");
            throw null;
        }
        int i5 = i3 + 57;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i3 + 97;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return executedefaultVar;
    }

    public final SemanticsOwnerKt RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        SemanticsOwnerKt semanticsOwnerKt = this.IconCompatParcelizer;
        if (semanticsOwnerKt == null) {
            removeNodeAtDepth.serializer("appStartToInteractiveCoordinator");
            throw null;
        }
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 29;
        int i3 = i2 % Fields.SpotShadowColor;
        ResultReceiver = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 95;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return semanticsOwnerKt;
    }

    public final constructJsonArray read() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i3 = i2 + 83;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        constructJsonArray constructjsonarray = this.write;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i5 = i2 + 103;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return constructjsonarray;
    }

    public final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY write() {
        int i = 2 % 2;
        int i2 = ResultReceiver;
        int i3 = i2 + 99;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = this.read;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("authViewModelFactory");
            throw null;
        }
        int i5 = i2 + 117;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdaudhhxliolpu0hpccqh6voskpny;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        o.removeNodeAtDepth.serializer("routerViewModelFactory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r2 = r2 + 21;
        com.roadrunner.login.presentation.router.RouterActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object MediaDescriptionCompat(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            com.roadrunner.login.presentation.router.RouterActivity r5 = (com.roadrunner.login.presentation.router.RouterActivity) r5
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.roadrunner.login.presentation.router.RouterActivity.ResultReceiver
            int r3 = r2 + 63
            int r4 = r3 % 128
            com.roadrunner.login.presentation.router.RouterActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r4
            int r3 = r3 % r1
            r4 = 0
            if (r3 != 0) goto L1c
            o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r5 = r5.ParcelableVolumeInfo
            r3 = 38
            int r3 = r3 / r0
            if (r5 == 0) goto L2e
            goto L20
        L1c:
            o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r5 = r5.ParcelableVolumeInfo
            if (r5 == 0) goto L2e
        L20:
            int r2 = r2 + 21
            int r0 = r2 % 128
            com.roadrunner.login.presentation.router.RouterActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r0
            int r2 = r2 % r1
            if (r2 == 0) goto L2a
            return r5
        L2a:
            r4.hashCode()
            throw r4
        L2e:
            java.lang.String r5 = "routerViewModelFactory"
            o.removeNodeAtDepth.serializer(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.router.RouterActivity.MediaDescriptionCompat(java.lang.Object[]):java.lang.Object");
    }

    public final getAllSemanticsNodesToMap MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = ResultReceiver;
        int i3 = i2 + 75;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getAllSemanticsNodesToMap getallsemanticsnodestomap = this.PlaybackStateCompat;
        if (getallsemanticsnodestomap == null) {
            removeNodeAtDepth.serializer("traceTimeMeasure");
            throw null;
        }
        int i5 = i2 + 93;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i2 + 33;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return getallsemanticsnodestomap;
    }

    public final Lazy PlaybackStateCompat() {
        int i = 2 % 2;
        Lazy lazy = this.PlaybackStateCompatCustomAction;
        if (lazy == null) {
            removeNodeAtDepth.serializer("usercentricsBannerDialog");
            throw null;
        }
        int i2 = ResultReceiver;
        int i3 = i2 + 73;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return lazy;
    }

    private final Uri ComponentActivity() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 55;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            getIntent().getExtras();
            obj.hashCode();
            throw null;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i3 = ResultReceiver + 75;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return (Uri) ((Parcelable) SQLite.read(extras, "deeplinkUri", Uri.class));
        }
        int i5 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 75;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return null;
    }

    private final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        int i = 2 % 2;
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((SemanticsInfoKt) MediaMetadataCompat().write()).IconCompatParcelizer())));
        int i2 = ResultReceiver + 85;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint
    @onItemDismisslambda0
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 19;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            super.onActivityResult(i, i2, intent);
            if (i != 2) {
                return;
            }
        } else {
            super.onActivityResult(i, i2, intent);
            if (i != 3) {
                return;
            }
        }
        int i5 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 83;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (i2 == -1) {
            ResultReceiver().RemoteActionCompatParcelizer();
            int i7 = ResultReceiver + 123;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return;
        }
        RouterViewModel routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY), null, null, new DividerUiModelImpl$1(routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY, null, 26), 3);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        removeNodeAtDepth.write(this);
        TraceTimeMeasurementWithPerformanceKit traceTimeMeasurementWithPerformanceKit = (TraceTimeMeasurementWithPerformanceKit) MediaSessionCompatToken();
        traceTimeMeasurementWithPerformanceKit.getClass();
        SemanticsOwner semanticsOwner = traceTimeMeasurementWithPerformanceKit.serializer;
        boolean zBooleanValue = ((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue();
        if (zBooleanValue) {
            int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 91;
            ResultReceiver = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("asti_router_activity_on_create");
        }
        try {
            try {
                getRootInfoui getrootinfoui = (getRootInfoui) semanticsOwner;
                getrootinfoui.serializer("asti_router_activity_on_create");
                read(this, bundle);
                getrootinfoui.write("asti_router_activity_on_create");
                if (zBooleanValue) {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                ((getRootInfoui) semanticsOwner).write("asti_router_activity_on_create");
                throw th;
            }
        } catch (Throwable th2) {
            if (!(!zBooleanValue)) {
                Trace.endSection();
                int i4 = ResultReceiver + 33;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e A[PHI: r1 r3 r7
  0x003e: PHI (r1v7 o.SystemLifecycleSystemLifecycleCallback) = (r1v4 o.SystemLifecycleSystemLifecycleCallback), (r1v8 o.SystemLifecycleSystemLifecycleCallback) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r3v4 timber.log.Timber$Forest) = (r3v0 timber.log.Timber$Forest), (r3v5 timber.log.Timber$Forest) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r7v5 com.roadrunner.login.presentation.router.RouterViewModel) = 
  (r7v1 com.roadrunner.login.presentation.router.RouterViewModel)
  (r7v6 com.roadrunner.login.presentation.router.RouterViewModel)
 binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r1 r3 r7
  0x002b: PHI (r1v5 o.SystemLifecycleSystemLifecycleCallback) = (r1v4 o.SystemLifecycleSystemLifecycleCallback), (r1v8 o.SystemLifecycleSystemLifecycleCallback) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r3v1 timber.log.Timber$Forest) = (r3v0 timber.log.Timber$Forest), (r3v5 timber.log.Timber$Forest) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r7v2 com.roadrunner.login.presentation.router.RouterViewModel) = 
  (r7v1 com.roadrunner.login.presentation.router.RouterViewModel)
  (r7v6 com.roadrunner.login.presentation.router.RouterViewModel)
 binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    private static final createFromParcel RatingCompat(RouterActivity routerActivity) {
        RouterViewModel routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback;
        Timber.Forest forest;
        String str;
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 17;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        int i3 = 0;
        if (i2 % 2 != 0) {
            routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = routerActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            systemLifecycleSystemLifecycleCallback = routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            forest = Timber.RemoteActionCompatParcelizer;
            int i4 = 80 / 0;
            if (routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY.PlaybackStateCompatCustomAction != null) {
                int i5 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                int i6 = i5 + 13;
                ResultReceiver = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                str = "already running";
                int i8 = i5 + 111;
                ResultReceiver = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                str = "starting";
            }
        } else {
            routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = routerActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            systemLifecycleSystemLifecycleCallback = routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            forest = Timber.RemoteActionCompatParcelizer;
            if (routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY.PlaybackStateCompatCustomAction != null) {
                int i10 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                int i11 = i10 + 13;
                ResultReceiver = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                str = "already running";
                int i13 = i10 + 111;
                ResultReceiver = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else {
                str = "starting";
            }
        }
        forest.IconCompatParcelizer("RouterViewModel.init: job=".concat(str), new Object[0]);
        systemLifecycleSystemLifecycleCallback.MediaDescriptionCompat();
        if (routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY.PlaybackStateCompatCustomAction == null) {
            routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY.PlaybackStateCompatCustomAction = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY), null, null, new RouterViewModel$init$1(routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY, null, i3), 3);
            systemLifecycleSystemLifecycleCallback.write();
            systemLifecycleSystemLifecycleCallback.serializer();
        }
        return createFromParcel.INSTANCE;
    }

    @SuppressLint
    private final void RemoteActionCompatParcelizer(cb cbVar) {
        int i = 2 % 2;
        Object[] objArr = {cbVar, c8ExternalSyntheticOutline0.IconCompatParcelizer};
        Object obj = null;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {cbVar, c9.IconCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 33;
            ResultReceiver = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            q4ExternalSyntheticLambda9.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(), this, null, ComponentActivity(), 16);
            finish();
            return;
        }
        int i4 = ResultReceiver + 9;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            ((getRootInfoui) ParcelableVolumeInfo().write).serializer("asti_router_to_login_transition");
            MediaSessionCompatQueueItem().IconCompatParcelizer(this, ComponentActivity());
            finish();
            obj.hashCode();
            throw null;
        }
        ((getRootInfoui) ParcelableVolumeInfo().write).serializer("asti_router_to_login_transition");
        MediaSessionCompatQueueItem().IconCompatParcelizer(this, ComponentActivity());
        finish();
        int i5 = ResultReceiver + 9;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    private final void read(Intent intent) {
        DropShadowRendererProviderCompanionDefault1 dropShadowRendererProviderCompanionDefault1;
        int i = 2 % 2;
        if (!intent.hasExtra("notification_id")) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                if (intent.getData() != null) {
                    dropShadowRendererProviderCompanionDefault1 = DropShadowRendererProviderCompanion.read;
                } else {
                    dropShadowRendererProviderCompanionDefault1 = onDrawShadowMLmccfk.read;
                }
            } else {
                int i2 = ResultReceiver + 93;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                if (!extras.containsKey("deeplinkUri")) {
                    if (intent.getData() != null) {
                        dropShadowRendererProviderCompanionDefault1 = DropShadowRendererProviderCompanion.read;
                    } else {
                        dropShadowRendererProviderCompanionDefault1 = onDrawShadowMLmccfk.read;
                    }
                } else {
                    dropShadowRendererProviderCompanionDefault1 = DropShadowRendererProviderCompanion.read;
                }
            }
        } else {
            int i4 = ResultReceiver + 83;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            dropShadowRendererProviderCompanionDefault1 = DropShadowRendererProviderCompanion.RemoteActionCompatParcelizer;
        }
        getUnmergedRootSemanticsNode getunmergedrootsemanticsnode = (getUnmergedRootSemanticsNode) RemoteActionCompatParcelizer();
        BlurFilter blurFilter = getunmergedrootsemanticsnode.write.ParcelableVolumeInfo;
        String str = dropShadowRendererProviderCompanionDefault1.write;
        blurFilter.RemoteActionCompatParcelizer("app_start_to_interactive", "entryPoint", str);
        ((getRootInfoui) getunmergedrootsemanticsnode.IconCompatParcelizer.write).RemoteActionCompatParcelizer("app_start_to_interactive_sentry", "entryPoint", str);
    }

    private final void RemoteActionCompatParcelizer(cc ccVar) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 77;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            boolean z = ccVar instanceof ce;
            throw null;
        }
        if (ccVar instanceof ce) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new PushEventPublisherImpl$emit$1(this, (ce) ccVar, shortNewsContentCardView, 17), 3);
            return;
        }
        Object[] objArr = {ccVar, cf.read};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            ResultReceiver().RemoteActionCompatParcelizer();
            return;
        }
        if (!(ccVar instanceof cd)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 37;
            ResultReceiver = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        ((getRootInfoui) ParcelableVolumeInfo().write).serializer("asti_router_to_login_transition");
        TransacterDefaultImpls transacterDefaultImplsMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        Uri uriComponentActivity = ComponentActivity();
        if (uriComponentActivity == null) {
            int i5 = ResultReceiver + 87;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            uriComponentActivity = ((cd) ccVar).serializer();
        }
        transacterDefaultImplsMediaSessionCompatQueueItem.IconCompatParcelizer(this, uriComponentActivity);
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    private final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int i = 2 % 2;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 109;
            ResultReceiver = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                RouterViewModel routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY.getClass();
                routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getClass();
                extras.containsKey(PushNotificationParserObj.TITLE_KEY);
                throw null;
            }
            RouterViewModel routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY2.getClass();
            routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getClass();
            if (!extras.containsKey(PushNotificationParserObj.TITLE_KEY) && !extras.containsKey("message") && !extras.containsKey("category") && !extras.containsKey("syncState")) {
                int i3 = ResultReceiver + 41;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 77 / 0;
                    if (!extras.containsKey("newDeliveryId")) {
                        if (!extras.containsKey("messageId")) {
                            return;
                        }
                    }
                } else if (!extras.containsKey("newDeliveryId")) {
                    if (!extras.containsKey("messageId")) {
                        return;
                    }
                }
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Handling Push notification", new Object[0]);
            routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY2.MediaSessionCompatToken.getClass();
            CloseableKt closeableKtSerializer = logParameters.serializer(extras);
            access1000 access1000Var = routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            access1000Var.IconCompatParcelizer.logEvent("push_notification_clicked", access1000Var.IconCompatParcelizer(closeableKtSerializer.serializer()));
            routerViewModelR8lambda7IJBVrN0sHyidCAZufWEJFc7yY2.PlaybackStateCompat.serializer(closeableKtSerializer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b9  */
    private static final createFromParcel read(RouterActivity routerActivity, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = ResultReceiver + 111;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, z)) {
            runGuardedAsyncandroid_sdk_base_release runguardedasyncandroid_sdk_base_release = (runGuardedAsyncandroid_sdk_base_release) write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{routerActivity}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), -1464230215, 1464230218, BottomSheetBehavior.IconCompatParcelizer());
            schedulePushDeliveryandroid_sdk_base_release schedulepushdeliveryandroid_sdk_base_release = (schedulePushDeliveryandroid_sdk_base_release) routerActivity.ResultReceiver().MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper();
            GetAuthStateViewModel getAuthStateViewModelResultReceiver = routerActivity.ResultReceiver();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getAuthStateViewModelResultReceiver);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new NafathModalContentKt$NafathModal$1$1(getAuthStateViewModelResultReceiver, 4);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
            GetAuthStateViewModel getAuthStateViewModelResultReceiver2 = routerActivity.ResultReceiver();
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(getAuthStateViewModelResultReceiver2);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new NafathModalContentKt$NafathModal$1$1(getAuthStateViewModelResultReceiver2, 5);
                getpostalcode.write(objComponentActivity2);
            }
            ((ImageHeaderParserImageType) runguardedasyncandroid_sdk_base_release).RemoteActionCompatParcelizer(schedulepushdeliveryandroid_sdk_base_release, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2)).invoke(getpostalcode, 0);
            cdExternalSyntheticLambda0 cdexternalsyntheticlambda0 = (cdExternalSyntheticLambda0) ExtrasKt.write(routerActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, getpostalcode, 0).getValue();
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(routerActivity);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3) {
                objComponentActivity3 = new NafathModalContentKt$NafathModal$1$1(routerActivity);
                getpostalcode.write(objComponentActivity3);
            } else {
                int i5 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 23;
                ResultReceiver = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new NafathModalContentKt$NafathModal$1$1(routerActivity);
                    getpostalcode.write(objComponentActivity3);
                }
            }
            RouterScreenKt.write(cdexternalsyntheticlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    private static final createFromParcel read(RouterActivity routerActivity, Bundle bundle) throws NoSuchMethodException {
        int i = 2;
        int i2 = 2 % 2;
        super.onCreate(bundle);
        LazyKt__LazyJVMKt.serializer(routerActivity.getOnBackPressedDispatcher(), routerActivity, new MapApiError$$ExternalSyntheticLambda1(17));
        Intent intent = routerActivity.getIntent();
        intent.getClass();
        routerActivity.read(intent);
        routerActivity.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        int i3 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (routerActivity.MediaDescriptionCompat().write()) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(routerActivity.getLifecycle()), null, null, new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, i3), 3);
            fromColorLong fromcolorlong = toBitmapConfig1JJdX4A.read(routerActivity.getLifecycle());
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) write(DrivingInsights.serializer(), new Object[]{routerActivity}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 143472746, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mapbox_callout_slower).substring(0, 3).length() + 1503246910, -2090718568, 2090718569, BottomSheetBehavior.IconCompatParcelizer()))).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            BuildersKt.IconCompatParcelizer(fromcolorlong, defaultIoScheduler, coroutineStart, new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, 4));
            fromColorLong fromcolorlong2 = toBitmapConfig1JJdX4A.read(routerActivity.getLifecycle());
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) write(DrivingInsights.serializer(), new Object[]{routerActivity}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 143472746, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mapbox_callout_slower).substring(0, 3).length() + 1503246910, -2090718568, 2090718569, BottomSheetBehavior.IconCompatParcelizer()))).getClass();
            int i4 = 5;
            BuildersKt.IconCompatParcelizer(fromcolorlong2, defaultIoScheduler, coroutineStart, new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, i4));
            requestSingleLocationUpdateandroid_sdk_base_release requestsinglelocationupdateandroid_sdk_base_releaseMediaBrowserCompatMediaItem = routerActivity.MediaBrowserCompatMediaItem();
            schedulePushDeliveryandroid_sdk_base_release schedulepushdeliveryandroid_sdk_base_release = (schedulePushDeliveryandroid_sdk_base_release) routerActivity.ResultReceiver().MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper();
            RouterActivity$onCreate$1$5 routerActivity$onCreate$1$5 = new RouterActivity$onCreate$1$5(routerActivity.ResultReceiver());
            RouterActivity$onCreate$1$6 routerActivity$onCreate$1$6 = new RouterActivity$onCreate$1$6(routerActivity.ResultReceiver());
            ((setImageLoader) requestsinglelocationupdateandroid_sdk_base_releaseMediaBrowserCompatMediaItem).getClass();
            ((setRegistrationDataProviderandroid_sdk_base_release) schedulepushdeliveryandroid_sdk_base_release).read.IconCompatParcelizer(routerActivity, new r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(i4, new WorkerWrapper.Builder(routerActivity, schedulepushdeliveryandroid_sdk_base_release, routerActivity$onCreate$1$5, routerActivity$onCreate$1$6, new Path$Companion(), new accessisMainThread())));
        } else {
            UtilsKt.write(routerActivity, new DragAndDropTargetModifierNode(new Updater$$ExternalSyntheticLambda1(13, routerActivity), true, 1217548704));
            routerActivity.ResultReceiver().MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(routerActivity, new NestFragment.AnonymousClass1(routerActivity, 25));
            routerActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().ResultReceiver.IconCompatParcelizer(routerActivity, new NestFragment.AnonymousClass1(routerActivity, 26));
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(routerActivity.getLifecycle()), null, null, new RouterActivity$onCreate$1$2(routerActivity, shortNewsContentCardView, i), 3);
        TraceTimeMeasurementWithPerformanceKit traceTimeMeasurementWithPerformanceKit = (TraceTimeMeasurementWithPerformanceKit) routerActivity.MediaSessionCompatToken();
        traceTimeMeasurementWithPerformanceKit.getClass();
        SemanticsOwner semanticsOwner = traceTimeMeasurementWithPerformanceKit.serializer;
        boolean zBooleanValue = ((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue();
        if (zBooleanValue) {
            int i5 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 29;
            ResultReceiver = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("asti_router_viewmodel_init");
                shortNewsContentCardView.hashCode();
                throw null;
            }
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("asti_router_viewmodel_init");
        }
        try {
            try {
                getRootInfoui getrootinfoui = (getRootInfoui) semanticsOwner;
                getrootinfoui.serializer("asti_router_viewmodel_init");
                RatingCompat(routerActivity);
                getrootinfoui.write("asti_router_viewmodel_init");
                if (zBooleanValue) {
                    Trace.endSection();
                }
                return createFromParcel.INSTANCE;
            } catch (Throwable th) {
                ((getRootInfoui) semanticsOwner).write("asti_router_viewmodel_init");
                throw th;
            }
        } catch (Throwable th2) {
            if (zBooleanValue) {
                int i6 = ResultReceiver + 85;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                Trace.endSection();
                int i8 = ResultReceiver + 93;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
            throw th2;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY PlaybackStateCompatCustomAction() {
        return (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{this}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), -398511390, 398511396, BottomSheetBehavior.IconCompatParcelizer());
    }

    public final runGuardedAsyncandroid_sdk_base_release RatingCompat() {
        return (runGuardedAsyncandroid_sdk_base_release) write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{this}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), -1464230215, 1464230218, BottomSheetBehavior.IconCompatParcelizer());
    }

    public final isOpenInternalroom_runtime serializer() {
        return (isOpenInternalroom_runtime) write(DrivingInsights.serializer(), new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 143472746, 1503246910 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mapbox_callout_slower).substring(0, 3).length(), -2090718568, 2090718569, BottomSheetBehavior.IconCompatParcelizer());
    }

    private static final createImageBitmap MediaMetadataCompat(RouterActivity routerActivity) {
        return (createImageBitmap) write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{routerActivity}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), 325908236, -325908234, BottomSheetBehavior.IconCompatParcelizer());
    }

    private static final createImageBitmap MediaSessionCompatQueueItem(RouterActivity routerActivity) {
        return (createImageBitmap) write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{routerActivity}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), -1024118044, 1024118048, BottomSheetBehavior.IconCompatParcelizer());
    }
}
