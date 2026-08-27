package com.roadrunner.delivery.accept.acceptbutton.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.bubble.presentation.GetBubbleUiState;
import com.roadrunner.delivery.accept.acknowledgment.implementation.data.TimestampRepositoryImpl;
import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.delivery.accept.backToBackOrder.domain.GetBackToBackOrdersDataImpl;
import com.roadrunner.delivery.accept.domain.AcceptDeliveriesUseCaseImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.rider.state.domain.GetRiderStateImpl$invoke$1;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import java.time.Clock;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import o.AndroidView_androidKtAndroidView4;
import o.FontSynthesisSaverlambda1;
import o.FontVariationSettingTextUnit;
import o.FontWeightSaverlambda0;
import o.FontWeightSaverlambda1;
import o.LineHeightStyleAlignmentSaverlambda0;
import o.LineHeightStyleAlignmentSaverlambda1;
import o.LineHeightStyleSaverlambda1;
import o.LinkSaverlambda1;
import o.LocaleSaverlambda0;
import o.ShadowSaverlambda0;
import o.ShortNewsContentCardView;
import o.TextDirectionSaverlambda0;
import o.TextDirectionSaverlambda1;
import o.TextGeometricTransformSaverlambda0;
import o.TextGeometricTransformSaverlambda1;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.addSubLayer;
import o.clearTmpDetachFlag;
import o.coerceIn8ffj60Q;
import o.copyNOaFTUodefault;
import o.copyO0kMr_c;
import o.createFromParcel;
import o.createGraphemeClusterSegmentFinder;
import o.getActionViewIntentlambda0;
import o.getContentViewGroupParentLayout;
import o.getKeyboardTap5zf0vsI;
import o.getNeedsDensity;
import o.getQueryContext;
import o.isOpenInternalroom_runtime;
import o.jumpToPositionForSmoothScroller;
import o.onItemDismiss;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAcceptButtonUiModelImpl implements jumpToPositionForSmoothScroller {
    private static int _init_lambda3 = 0;
    private static int _init_lambda4 = 1;
    public final clearTmpDetachFlag ComponentActivity;
    public final MutableStateFlow IconCompatParcelizer;
    public final DeliveryAcceptanceLogger MediaBrowserCompatMediaItem;
    public final BackToBackOrdersDataRepositoryImpl MediaDescriptionCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaMetadataCompat;
    public final Clock MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final ComponentRegistry$Builder MediaSessionCompatToken;
    public final FontVariationSettingTextUnit ParcelableVolumeInfo;
    public final DeliveryErrorProviderImpl PlaybackStateCompat;
    public final transferSessionPackageI PlaybackStateCompatCustomAction;
    public final getContentViewGroupParentLayout RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final LocaleSaverlambda0 ResultReceiver;
    public final getKeyboardTap5zf0vsI accessensureViewModelStore;
    public final GetBackToBackOrdersDataImpl r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final ShadowSaverlambda0 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final GetAcceptDetails r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final copyO0kMr_c r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final createGraphemeClusterSegmentFinder r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final StateFlow r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final getQueryContext r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final StateFlow r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final DefaultForegroundSoundManager r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final UpdateStateUseCaseImpl r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final setTransactionSuccessful r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final getNeedsDensity r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final MutableStateFlow read;
    public final AcceptDeliveriesUseCaseImpl serializer;
    public final LineHeightStyleSaverlambda1 write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;
        public int IconCompatParcelizer;
        public final /* synthetic */ int read;
        public final /* synthetic */ DeliveryAcceptButtonUiModelImpl write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.read = i;
            this.write = deliveryAcceptButtonUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = serializer + 35;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i3 = this.read;
            DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl = this.write;
            if (i3 == 0) {
                return new AnonymousClass1(deliveryAcceptButtonUiModelImpl, shortNewsContentCardView, 0);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(deliveryAcceptButtonUiModelImpl, shortNewsContentCardView, 1);
            int i4 = serializer + 37;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 13;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 == 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = serializer + 57;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 53 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl = this.write;
            int i4 = 3;
            ShortNewsContentCardView shortNewsContentCardView = null;
            int i5 = 1;
            if (i3 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.IconCompatParcelizer;
                if (i6 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    LocaleSaverlambda0 localeSaverlambda0 = deliveryAcceptButtonUiModelImpl.ResultReceiver;
                    Flow flowSerializer = FlowKt.serializer(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new WorkSpecDaoKt$dedup$$inlined$map$1(i4, new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) localeSaverlambda0.RemoteActionCompatParcelizer)).MediaBrowserCompatMediaItem, 6)), new StateProviderImpl$special$$inlined$map$2(((TimestampRepositoryImpl) localeSaverlambda0.serializer).RemoteActionCompatParcelizer.serializer(), 8), new GetBubbleUiState.AnonymousClass2(localeSaverlambda0, shortNewsContentCardView, i5)));
                    TextDirectionSaverlambda0 textDirectionSaverlambda0 = new TextDirectionSaverlambda0(deliveryAcceptButtonUiModelImpl, i5);
                    this.IconCompatParcelizer = 1;
                    return flowSerializer.collect(textDirectionSaverlambda0, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = serializer + 1;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.IconCompatParcelizer;
            if (i9 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ShadowSaverlambda0 shadowSaverlambda0 = deliveryAcceptButtonUiModelImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                accessrequireViewFactoryHolder accessrequireviewfactoryholder = shadowSaverlambda0.IconCompatParcelizer;
                Flow flowSerializer2 = FlowKt.serializer(new HeatmapDataStore$get$$inlined$map$1(FlowKt.serializer(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) accessrequireviewfactoryholder)).MediaBrowserCompatMediaItem, 7), ((StateProviderImpl) ((AndroidView_androidKtAndroidView4) accessrequireviewfactoryholder)).MediaDescriptionCompat, new GetRiderStateImpl$invoke$1(i4, i, shortNewsContentCardView))), shadowSaverlambda0, 5));
                TextDirectionSaverlambda0 textDirectionSaverlambda1 = new TextDirectionSaverlambda0(deliveryAcceptButtonUiModelImpl, 0);
                this.IconCompatParcelizer = 1;
                return flowSerializer2.collect(textDirectionSaverlambda1, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
            }
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = serializer + 9;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
    }

    @Override // o.jumpToPositionForSmoothScroller
    public final StateFlow write() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = _init_lambda4 + 79;
        int i3 = i2 % Fields.SpotShadowColor;
        _init_lambda3 = i3;
        if (i2 % 2 != 0) {
            stateFlow = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            int i4 = 53 / 0;
        } else {
            stateFlow = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        }
        int i5 = i3 + 75;
        _init_lambda4 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DeliveryAcceptButtonUiModelImpl(getContentViewGroupParentLayout getcontentviewgroupparentlayout, boolean z, ShadowSaverlambda0 shadowSaverlambda0, LocaleSaverlambda0 localeSaverlambda0, LineHeightStyleSaverlambda1 lineHeightStyleSaverlambda1, GetAcceptDetails getAcceptDetails, AcceptDeliveriesUseCaseImpl acceptDeliveriesUseCaseImpl, UpdateStateUseCaseImpl updateStateUseCaseImpl, FontVariationSettingTextUnit fontVariationSettingTextUnit, setTransactionSuccessful settransactionsuccessful, getQueryContext getquerycontext, DeliveryAcceptanceLogger deliveryAcceptanceLogger, DefaultForegroundSoundManager defaultForegroundSoundManager, getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi, getNeedsDensity getneedsdensity, ComponentRegistry$Builder componentRegistry$Builder, transferSessionPackageI transfersessionpackagei, isOpenInternalroom_runtime isopeninternalroom_runtime, getActionViewIntentlambda0 getactionviewintentlambda0, clearTmpDetachFlag cleartmpdetachflag, BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl, GetBackToBackOrdersDataImpl getBackToBackOrdersDataImpl, copyO0kMr_c copyo0kmr_c, createGraphemeClusterSegmentFinder creategraphemeclustersegmentfinder, DeliveryErrorProviderImpl deliveryErrorProviderImpl, Clock clock) {
        getcontentviewgroupparentlayout.getClass();
        this.RatingCompat = getcontentviewgroupparentlayout;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = z;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = shadowSaverlambda0;
        this.ResultReceiver = localeSaverlambda0;
        this.write = lineHeightStyleSaverlambda1;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getAcceptDetails;
        this.serializer = acceptDeliveriesUseCaseImpl;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = updateStateUseCaseImpl;
        this.ParcelableVolumeInfo = fontVariationSettingTextUnit;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = settransactionsuccessful;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getquerycontext;
        this.MediaBrowserCompatMediaItem = deliveryAcceptanceLogger;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = defaultForegroundSoundManager;
        this.accessensureViewModelStore = getkeyboardtap5zf0vsi;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = getneedsdensity;
        this.MediaSessionCompatToken = componentRegistry$Builder;
        this.PlaybackStateCompatCustomAction = transfersessionpackagei;
        this.ComponentActivity = cleartmpdetachflag;
        this.MediaDescriptionCompat = backToBackOrdersDataRepositoryImpl;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getBackToBackOrdersDataImpl;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = copyo0kmr_c;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = creategraphemeclustersegmentfinder;
        this.PlaybackStateCompat = deliveryErrorProviderImpl;
        this.MediaSessionCompatQueueItem = clock;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(LineHeightStyleAlignmentSaverlambda0.serializer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = mutableStateFlow2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow3 = StateFlowKt.read(null);
        this.read = mutableStateFlow3;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow3;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
    }

    public final Object updateState(ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        Object objCollect = ((ChannelFlow) TuplesKt.write(UpdateStateUseCaseImpl.write(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw))).collect(new TextGeometricTransformSaverlambda0(this, 0), continuationImpl);
        if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createFromParcel.INSTANCE;
        }
        int i2 = _init_lambda3 + 115;
        int i3 = i2 % Fields.SpotShadowColor;
        _init_lambda4 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 123;
        _init_lambda3 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objCollect;
    }

    public final void read(String str) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 125;
        _init_lambda3 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        ShortNewsContentCardView shortNewsContentCardView = null;
        this.read.IconCompatParcelizer(null);
        if (str.equals("state_api_error_dialog")) {
            BuildersKt.RemoteActionCompatParcelizer(this.RatingCompat, null, null, new DeliveryAcceptButtonUiModelImpl$startCountdown$1$1$1(this, shortNewsContentCardView, 1), 3);
            int i4 = _init_lambda4 + 87;
            _init_lambda3 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        MutableStateFlow mutableStateFlow = this.RemoteActionCompatParcelizer;
        Object objSerializer = (FontWeightSaverlambda0) mutableStateFlow.read();
        if (objSerializer instanceof FontWeightSaverlambda1) {
            objSerializer = FontWeightSaverlambda1.RemoteActionCompatParcelizer((FontWeightSaverlambda1) objSerializer, false);
            int i2 = _init_lambda3 + 7;
            _init_lambda4 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else if (objSerializer instanceof FontSynthesisSaverlambda1) {
            int i4 = _init_lambda3 + 41;
            _init_lambda4 = i4 % Fields.SpotShadowColor;
            objSerializer = i4 % 2 == 0 ? FontSynthesisSaverlambda1.IconCompatParcelizer((FontSynthesisSaverlambda1) objSerializer, true, null, 82) : FontSynthesisSaverlambda1.IconCompatParcelizer((FontSynthesisSaverlambda1) objSerializer, false, null, 55);
        } else if (objSerializer instanceof LineHeightStyleAlignmentSaverlambda1) {
            int i5 = _init_lambda4 + 75;
            _init_lambda3 = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            objSerializer = LineHeightStyleAlignmentSaverlambda1.serializer((LineHeightStyleAlignmentSaverlambda1) objSerializer, false);
        }
        mutableStateFlow.IconCompatParcelizer(objSerializer);
    }

    public final void RemoteActionCompatParcelizer() {
        int i;
        int i2 = 2 % 2;
        MutableStateFlow mutableStateFlow = this.RemoteActionCompatParcelizer;
        Object objSerializer = (FontWeightSaverlambda0) mutableStateFlow.read();
        if (!(objSerializer instanceof FontWeightSaverlambda1)) {
            if (objSerializer instanceof FontSynthesisSaverlambda1) {
                int i3 = _init_lambda3 + 95;
                _init_lambda4 = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                objSerializer = FontSynthesisSaverlambda1.IconCompatParcelizer((FontSynthesisSaverlambda1) objSerializer, true, null, 55);
                i = _init_lambda4 + 107;
                _init_lambda3 = i % Fields.SpotShadowColor;
            } else if (objSerializer instanceof LineHeightStyleAlignmentSaverlambda1) {
                objSerializer = LineHeightStyleAlignmentSaverlambda1.serializer((LineHeightStyleAlignmentSaverlambda1) objSerializer, true);
            }
            mutableStateFlow.IconCompatParcelizer(objSerializer);
        }
        int i5 = _init_lambda3 + 19;
        _init_lambda4 = i5 % Fields.SpotShadowColor;
        objSerializer = i5 % 2 == 0 ? FontWeightSaverlambda1.RemoteActionCompatParcelizer((FontWeightSaverlambda1) objSerializer, false) : FontWeightSaverlambda1.RemoteActionCompatParcelizer((FontWeightSaverlambda1) objSerializer, true);
        i = _init_lambda3 + 37;
        _init_lambda4 = i % Fields.SpotShadowColor;
        int i6 = i % 2;
        mutableStateFlow.IconCompatParcelizer(objSerializer);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public static final Object access$acceptDelivery(DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl, List list, ContinuationImpl continuationImpl) {
        TextDirectionSaverlambda1 textDirectionSaverlambda1;
        Object objM4898invokegIAlus;
        Throwable thSerializer;
        Throwable th;
        Throwable th2;
        int i;
        int i2 = 2 % 2;
        int i3 = _init_lambda3 + 21;
        _init_lambda4 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        FontVariationSettingTextUnit fontVariationSettingTextUnit = deliveryAcceptButtonUiModelImpl.ParcelableVolumeInfo;
        if (continuationImpl instanceof TextDirectionSaverlambda1) {
            textDirectionSaverlambda1 = (TextDirectionSaverlambda1) continuationImpl;
            int i5 = textDirectionSaverlambda1.IconCompatParcelizer;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                textDirectionSaverlambda1.IconCompatParcelizer = i5 - Integer.MIN_VALUE;
            } else {
                textDirectionSaverlambda1 = new TextDirectionSaverlambda1(deliveryAcceptButtonUiModelImpl, continuationImpl);
            }
        } else {
            textDirectionSaverlambda1 = new TextDirectionSaverlambda1(deliveryAcceptButtonUiModelImpl, continuationImpl);
        }
        Object obj = textDirectionSaverlambda1.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = textDirectionSaverlambda1.IconCompatParcelizer;
        Object obj3 = createFromParcel.INSTANCE;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            deliveryAcceptButtonUiModelImpl.RemoteActionCompatParcelizer();
            AcceptDeliveriesUseCaseImpl acceptDeliveriesUseCaseImpl = deliveryAcceptButtonUiModelImpl.serializer;
            coerceIn8ffj60Q coercein8ffj60q = new coerceIn8ffj60Q(list);
            textDirectionSaverlambda1.IconCompatParcelizer = 1;
            objM4898invokegIAlus = acceptDeliveriesUseCaseImpl.m4898invokegIAlus(coercein8ffj60q, textDirectionSaverlambda1);
            if (objM4898invokegIAlus != obj2) {
            }
            return obj2;
        }
        if (i6 != 1) {
            int i7 = _init_lambda3 + 5;
            int i8 = i7 % Fields.SpotShadowColor;
            _init_lambda4 = i8;
            int i9 = i7 % 2;
            if (i6 == 2) {
                i = textDirectionSaverlambda1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                textDirectionSaverlambda1.read = null;
                textDirectionSaverlambda1.serializer = i;
                textDirectionSaverlambda1.IconCompatParcelizer = 3;
                if (deliveryAcceptButtonUiModelImpl.updateState(textDirectionSaverlambda1) == obj2) {
                    int i10 = _init_lambda4 + 25;
                    _init_lambda3 = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    return obj2;
                }
            } else if (i6 != 3) {
                int i12 = i8 + 11;
                _init_lambda3 = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (i6 == 4) {
                    th2 = textDirectionSaverlambda1.read;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    deliveryAcceptButtonUiModelImpl.IconCompatParcelizer();
                    thSerializer = th2;
                    Timber.RemoteActionCompatParcelizer.write(new TextGeometricTransformSaverlambda1(thSerializer));
                } else {
                    if (i6 != 5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i14 = i8 + 55;
                    _init_lambda3 = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        Throwable th3 = textDirectionSaverlambda1.read;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        throw null;
                    }
                    th = textDirectionSaverlambda1.read;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    thSerializer = th;
                    Timber.RemoteActionCompatParcelizer.write(new TextGeometricTransformSaverlambda1(thSerializer));
                }
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i15 = _init_lambda3 + 59;
                _init_lambda4 = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4898invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        return obj3;
        thSerializer = onItemDismiss.serializer(objM4898invokegIAlus);
        if (thSerializer == null) {
            BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl = deliveryAcceptButtonUiModelImpl.MediaDescriptionCompat;
            textDirectionSaverlambda1.read = null;
            textDirectionSaverlambda1.serializer = 0;
            textDirectionSaverlambda1.IconCompatParcelizer = 2;
            if (backToBackOrdersDataRepositoryImpl.optOutOfBackToBackOrders(textDirectionSaverlambda1) != obj2) {
                i = 0;
                textDirectionSaverlambda1.read = null;
                textDirectionSaverlambda1.serializer = i;
                textDirectionSaverlambda1.IconCompatParcelizer = 3;
                if (deliveryAcceptButtonUiModelImpl.updateState(textDirectionSaverlambda1) == obj2) {
                    int i17 = _init_lambda4 + 25;
                    _init_lambda3 = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                }
                return obj3;
            }
        } else {
            if (!(thSerializer instanceof addSubLayer)) {
                boolean z = thSerializer instanceof copyNOaFTUodefault;
                getQueryContext getquerycontext = deliveryAcceptButtonUiModelImpl.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                if (z) {
                    getquerycontext.serializer(new LinkSaverlambda1(fontVariationSettingTextUnit.write(thSerializer)));
                    textDirectionSaverlambda1.read = thSerializer;
                    textDirectionSaverlambda1.serializer = 0;
                    textDirectionSaverlambda1.IconCompatParcelizer = 5;
                    if (deliveryAcceptButtonUiModelImpl.updateState(textDirectionSaverlambda1) != obj2) {
                        th = thSerializer;
                        thSerializer = th;
                    }
                } else {
                    getquerycontext.serializer(new LinkSaverlambda1(fontVariationSettingTextUnit.write(thSerializer)));
                    deliveryAcceptButtonUiModelImpl.IconCompatParcelizer();
                }
                Timber.RemoteActionCompatParcelizer.write(new TextGeometricTransformSaverlambda1(thSerializer));
                return obj3;
            }
            int i19 = _init_lambda4 + 123;
            _init_lambda3 = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            DeliveryErrorProviderImpl deliveryErrorProviderImpl = deliveryAcceptButtonUiModelImpl.PlaybackStateCompat;
            textDirectionSaverlambda1.read = thSerializer;
            textDirectionSaverlambda1.serializer = 0;
            textDirectionSaverlambda1.IconCompatParcelizer = 4;
            deliveryErrorProviderImpl.emitError(thSerializer, textDirectionSaverlambda1);
            if (obj3 != obj2) {
                th2 = thSerializer;
                deliveryAcceptButtonUiModelImpl.IconCompatParcelizer();
                thSerializer = th2;
                Timber.RemoteActionCompatParcelizer.write(new TextGeometricTransformSaverlambda1(thSerializer));
                return obj3;
            }
        }
        return obj2;
    }
}
