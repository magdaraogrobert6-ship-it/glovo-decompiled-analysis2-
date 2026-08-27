package com.roadrunner.delivery.pickupdropoff.bluetoothscanning;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter$launchJob$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.mapbox.navigator.R;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.sentry.util.UrlUtils;
import java.util.HashSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import o.ShortNewsContentCardView;
import o.TextMotionCompanion;
import o.accessgetEllipsiscp;
import o.accessgetVisiblecp;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.getClipgIe3tQ8;
import o.getClipgIe3tQ8annotations;
import o.getContentViewGroupParentLayout;
import o.getLinearity4e0Vf04ui_text;
import o.getNone4e0Vf04;
import o.getStartEllipsisgIe3tQ8annotations;
import o.getStatic;
import o.getSubpixelTextPositioningui_text;
import o.isOpenInternalroom_runtime;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toBitmapConfig1JJdX4A;
import o.toColorLong8_81llA;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class BleScanningLifecycleObserverImpl implements DefaultLifecycleObserver {
    private static int ResultReceiver = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final accessgetVisiblecp IconCompatParcelizer;
    public final isOpenInternalroom_runtime MediaBrowserCompatMediaItem;
    public final getClipgIe3tQ8annotations MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final getClipgIe3tQ8 MediaSessionCompatToken;
    public final getStartEllipsisgIe3tQ8annotations ParcelableVolumeInfo;
    public final ObservePuDoDeliveriesResponseImpl PlaybackStateCompat;
    public String PlaybackStateCompatCustomAction;
    public final accessgetEllipsiscp RatingCompat;
    public final getLinearity4e0Vf04ui_text RemoteActionCompatParcelizer;
    public final transferSessionPackageI r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final TextMotionCompanion r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final MainActivity read;
    public final HashSet serializer;
    public final getSubpixelTextPositioningui_text write;

    public BleScanningLifecycleObserverImpl(MainActivity mainActivity, transferSessionPackageI transfersessionpackagei, getClipgIe3tQ8annotations getclipgie3tq8annotations, getClipgIe3tQ8 getclipgie3tq8, getLinearity4e0Vf04ui_text getlinearity4e0vf04ui_text, TextMotionCompanion textMotionCompanion, accessgetEllipsiscp accessgetellipsiscp, getStartEllipsisgIe3tQ8annotations getstartellipsisgie3tq8annotations, accessgetVisiblecp accessgetvisiblecp, ObservePuDoDeliveriesResponseImpl observePuDoDeliveriesResponseImpl, getSubpixelTextPositioningui_text getsubpixeltextpositioningui_text, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        transfersessionpackagei.getClass();
        getclipgie3tq8annotations.getClass();
        getclipgie3tq8.getClass();
        getlinearity4e0vf04ui_text.getClass();
        textMotionCompanion.getClass();
        accessgetellipsiscp.getClass();
        getstartellipsisgie3tq8annotations.getClass();
        accessgetvisiblecp.getClass();
        observePuDoDeliveriesResponseImpl.getClass();
        getsubpixeltextpositioningui_text.getClass();
        isopeninternalroom_runtime.getClass();
        this.read = mainActivity;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = transfersessionpackagei;
        this.MediaDescriptionCompat = getclipgie3tq8annotations;
        this.MediaSessionCompatToken = getclipgie3tq8;
        this.RemoteActionCompatParcelizer = getlinearity4e0vf04ui_text;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = textMotionCompanion;
        this.RatingCompat = accessgetellipsiscp;
        this.ParcelableVolumeInfo = getstartellipsisgie3tq8annotations;
        this.IconCompatParcelizer = accessgetvisiblecp;
        this.PlaybackStateCompat = observePuDoDeliveriesResponseImpl;
        this.write = getsubpixeltextpositioningui_text;
        this.MediaBrowserCompatMediaItem = isopeninternalroom_runtime;
        this.serializer = new HashSet();
    }

    /* JADX INFO: renamed from: com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl$onCreate$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaMetadataCompat = 1;
        private static int serializer;
        public final /* synthetic */ accessisRenderNodeCompatiblecp IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
        public int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = accessisrendernodecompatiblecp;
            BleScanningLifecycleObserverImpl.this = bleScanningLifecycleObserverImpl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = accessisrendernodecompatiblecp;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = MediaMetadataCompat + 3;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.RemoteActionCompatParcelizer;
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = this.IconCompatParcelizer;
            BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl = BleScanningLifecycleObserverImpl.this;
            if (i4 == 0) {
                return new AnonymousClass1(accessisrendernodecompatiblecp, bleScanningLifecycleObserverImpl, shortNewsContentCardView);
            }
            AnonymousClass1 anonymousClass1 = bleScanningLifecycleObserverImpl.new AnonymousClass1(accessisrendernodecompatiblecp, shortNewsContentCardView);
            int i5 = serializer + 91;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = MediaMetadataCompat + 17;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 == 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = MediaMetadataCompat + 93;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Flow flowSerializer;
            int i = 2 % 2;
            int i2 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = this.IconCompatParcelizer;
            BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl = BleScanningLifecycleObserverImpl.this;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i2 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.write;
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.STARTED;
                    AnonymousClass1 anonymousClass1 = bleScanningLifecycleObserverImpl.new AnonymousClass1(accessisrendernodecompatiblecp, (ShortNewsContentCardView) null);
                    this.write = 1;
                    return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp, tocolorlong8_81lla, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                int i4 = serializer + 15;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = serializer + 29;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return null;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.write;
            if (i8 != 0) {
                if (i8 == 1) {
                    int i9 = MediaMetadataCompat + 77;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i11 = MediaMetadataCompat + 61;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getClipgIe3tQ8annotations getclipgie3tq8annotations = bleScanningLifecycleObserverImpl.MediaDescriptionCompat;
            getNone4e0Vf04 getnone4e0vf04RemoteActionCompatParcelizer = getclipgie3tq8annotations.write.RemoteActionCompatParcelizer();
            if (getnone4e0vf04RemoteActionCompatParcelizer == null) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.RemoteActionCompatParcelizer("IsRiderInEnabledDeliveryStateUseCase");
                forest.RemoteActionCompatParcelizer("BLE scanning config not found, skipping delivery state check", new Object[0]);
                flowSerializer = FlowKt.serializer();
            } else {
                flowSerializer = FlowKt.read(new AsyncImagePainter$launchJob$1(getclipgie3tq8annotations, getnone4e0vf04RemoteActionCompatParcelizer, shortNewsContentCardView, 18));
            }
            ChannelFlowTransformLatest channelFlowTransformLatestRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new SingleProcessDataStore$data$1.AnonymousClass1(bleScanningLifecycleObserverImpl, shortNewsContentCardView, 14), flowSerializer), new BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$$inlined$flatMapLatest$1(accessisrendernodecompatiblecp, bleScanningLifecycleObserverImpl, null));
            this.write = 1;
            return channelFlowTransformLatestRemoteActionCompatParcelizer.collect(getStatic.IconCompatParcelizer, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 15;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            accessisrendernodecompatiblecp.getClass();
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            firebaseRemoteConfigImpl.getClass();
            Object[] objArr = {firebaseRemoteConfigImpl, updateAdidI.IS_GODROID_BLE_SCANNING_ENABLED};
            int iSerializer = R.serializer();
            ((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), iSerializer, objArr)).booleanValue();
            obj.hashCode();
            throw null;
        }
        accessisrendernodecompatiblecp.getClass();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        firebaseRemoteConfigImpl2.getClass();
        Object[] objArr2 = {firebaseRemoteConfigImpl2, updateAdidI.IS_GODROID_BLE_SCANNING_ENABLED};
        int iSerializer2 = R.serializer();
        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), iSerializer2, objArr2)).booleanValue()) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new AnonymousClass1(accessisrendernodecompatiblecp, this, (ShortNewsContentCardView) null), 3);
            return;
        }
        int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 105;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        if (r1 == r9) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$showBluetoothReadinessDialog(com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl.access$showBluetoothReadinessDialog(com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
