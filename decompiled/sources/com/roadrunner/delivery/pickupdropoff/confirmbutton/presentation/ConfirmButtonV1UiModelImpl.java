package com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.huawei.location.Vw$Vw;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.ConfirmButtonV1UiModel;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.domain.ConfirmButtonV1MapperImpl;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.domain.ConfirmDeliveryUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.logger.MultipleCodeScanEventLoggerImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ComposableInvoker;
import o.FontVariationSettingTextUnit;
import o.PreviewLightDark;
import o.PreviewLogger;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.Wallpapers;
import o.accessgetLOREM_IPSUM_SOURCEp;
import o.attach;
import o.clearTmpDetachFlag;
import o.createAnimation;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.dup;
import o.fastFilterNotNull;
import o.findRememberedData;
import o.generateLoremIpsum;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getLoaderKey;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getPositionannotations;
import o.getQueryContext;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.invokeComposableMethod;
import o.isItemDismissable;
import o.onItemDismiss;
import o.parseParametersToValueparametersHasTheSameType;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdarxu5TkcdeCzvGy6bhxSB2jxv4Lw;
import o.removeNodeAtDepth;
import o.uiMode;
import o.wrapper;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmButtonV1UiModelImpl implements ConfirmButtonV1UiModel {
    private static int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = 0;
    private static int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 1;
    public final Vw$Vw ComponentActivity;
    public final MutableStateFlow IconCompatParcelizer;
    public final ContextScope MediaBrowserCompatMediaItem;
    public final parseParametersToValueparametersHasTheSameType MediaDescriptionCompat;
    public final fastFilterNotNull MediaMetadataCompat;
    public final ConfirmDeliveryUseCaseImpl MediaSessionCompatQueueItem;
    public final FontVariationSettingTextUnit MediaSessionCompatResultReceiverWrapper;
    public final long MediaSessionCompatToken;
    public final DeliveryConfirmationLoggerImpl ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final GetDeliveryAnalyticsUseCaseImpl PlaybackStateCompatCustomAction;
    public final findRememberedData RatingCompat;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final clearTmpDetachFlag ResultReceiver;
    public final MultipleCodeScanEventLoggerImpl r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final ConfirmButtonV1MapperImpl r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final StateFlow r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final createAnimation r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final StateFlow r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final UpdateTaskUseCaseImpl r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public List r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final UpdateStateUseCaseImpl r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public getPositionannotations read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;
        public final /* synthetic */ int read;
        public int serializer;
        public final /* synthetic */ ConfirmButtonV1UiModelImpl write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.read = i;
            this.write = confirmButtonV1UiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 69;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.read;
            ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl = this.write;
            int i5 = 1;
            if (i4 != 0) {
                return new AnonymousClass2(confirmButtonV1UiModelImpl, shortNewsContentCardView, i5);
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(confirmButtonV1UiModelImpl, shortNewsContentCardView, 0);
            int i6 = RemoteActionCompatParcelizer + 1;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return anonymousClass2;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 25;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 != 0) {
                return ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = RemoteActionCompatParcelizer + 77;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 81;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl = this.write;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i5 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.serializer;
                if (i6 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    return ConfirmButtonV1UiModelImpl.access$loadAnalytics(confirmButtonV1UiModelImpl, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = IconCompatParcelizer + 53;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.serializer;
            if (i9 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowWrite = TuplesKt.write(UpdateStateUseCaseImpl.write(confirmButtonV1UiModelImpl.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM));
                SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(i, 5, shortNewsContentCardView);
                this.serializer = 1;
                obj = FlowKt.first(flowWrite, signInDataStore$clear$2, this);
                if (obj == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i9 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i10 = RemoteActionCompatParcelizer + 37;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    return null;
                }
                int i12 = RemoteActionCompatParcelizer + 125;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) obj;
            if (!(getoptimizationlevel instanceof getMaxWidth)) {
                return createfromparcel;
            }
            confirmButtonV1UiModelImpl.RemoteActionCompatParcelizer.serializer(new ComposableInvoker(((getMaxWidth) getoptimizationlevel).write()));
            return createfromparcel;
        }
    }

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 55;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i5 = i3 + 119;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public ConfirmButtonV1UiModelImpl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, findRememberedData findremembereddata, parseParametersToValueparametersHasTheSameType parseparameterstovalueparametershasthesametype, FontVariationSettingTextUnit fontVariationSettingTextUnit, ConfirmButtonV1MapperImpl confirmButtonV1MapperImpl, attach attachVar, createAnimation createanimation, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, UpdateStateUseCaseImpl updateStateUseCaseImpl, ConfirmDeliveryUseCaseImpl confirmDeliveryUseCaseImpl, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, Vw$Vw vw$Vw, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl, clearTmpDetachFlag cleartmpdetachflag, MultipleCodeScanEventLoggerImpl multipleCodeScanEventLoggerImpl, getQueryContext getquerycontext) {
        findremembereddata.getClass();
        parseparameterstovalueparametershasthesametype.getClass();
        fontVariationSettingTextUnit.getClass();
        confirmButtonV1MapperImpl.getClass();
        attachVar.getClass();
        createanimation.getClass();
        updateTaskUseCaseImpl.getClass();
        updateStateUseCaseImpl.getClass();
        confirmDeliveryUseCaseImpl.getClass();
        getDeliveryAnalyticsUseCaseImpl.getClass();
        vw$Vw.getClass();
        deliveryConfirmationLoggerImpl.getClass();
        cleartmpdetachflag.getClass();
        multipleCodeScanEventLoggerImpl.getClass();
        getquerycontext.getClass();
        this.MediaMetadataCompat = fastfilternotnull;
        this.MediaBrowserCompatMediaItem = contextScope;
        this.RatingCompat = findremembereddata;
        this.MediaDescriptionCompat = parseparameterstovalueparametershasthesametype;
        this.MediaSessionCompatResultReceiverWrapper = fontVariationSettingTextUnit;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = confirmButtonV1MapperImpl;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = createanimation;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = updateTaskUseCaseImpl;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = updateStateUseCaseImpl;
        this.MediaSessionCompatQueueItem = confirmDeliveryUseCaseImpl;
        this.PlaybackStateCompatCustomAction = getDeliveryAnalyticsUseCaseImpl;
        this.ComponentActivity = vw$Vw;
        this.ParcelableVolumeInfo = deliveryConfirmationLoggerImpl;
        this.ResultReceiver = cleartmpdetachflag;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = multipleCodeScanEventLoggerImpl;
        this.RemoteActionCompatParcelizer = getquerycontext;
        this.MediaSessionCompatToken = fastfilternotnull.deliveryId;
        this.PlaybackStateCompat = fastfilternotnull.action;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = instance_delegatelambda0.write;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(dup.read);
        this.write = mutableStateFlow;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = mutableStateFlow;
        this.IconCompatParcelizer = StateFlowKt.read(SmallPersistentVector.RemoteActionCompatParcelizer);
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow2;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = mutableStateFlow2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new PerseusLogger$w$1(this, attachVar, shortNewsContentCardView, 27), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass2(this, shortNewsContentCardView, 0), 3);
    }

    public final void IconCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 23;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(z);
            int i3 = 55 / 0;
        } else {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(z);
        }
        int i4 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 107;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 31;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!((Boolean) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.serializer.read()).booleanValue()) {
            IconCompatParcelizer(true);
            BuildersKt.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, null, null, new ConfirmButtonV1UiModelImpl$confirm$1(this, null), 3);
            int i4 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 105;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        int i6 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 53;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("ConfirmButtonV1UiModelImpl: The delivery is being confirmed, it is not possible to confirm it again!", new Object[1]);
        } else {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("ConfirmButtonV1UiModelImpl: The delivery is being confirmed, it is not possible to confirm it again!", new Object[0]);
        }
    }

    public final Object updatePinValidationWithError(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str, ContinuationImpl continuationImpl) {
        PreviewLightDark previewLightDark;
        Object next;
        int i = 2 % 2;
        Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
        do {
            previewLightDark = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((uiMode) next) instanceof PreviewLightDark));
        if (next instanceof PreviewLightDark) {
            previewLightDark = (PreviewLightDark) next;
            int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 47;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        PreviewLightDark previewLightDark2 = previewLightDark;
        if (previewLightDark2 != null) {
            int i4 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 37;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object objInvoke = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.invoke(this.MediaSessionCompatToken, this.PlaybackStateCompat, PreviewLightDark.read(previewLightDark2, null, str, null, null, 1919), displayInAppMessagelambda1.serializer(PreviewLightDark.class), continuationImpl);
            if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objInvoke;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    public static final Object access$loadAnalytics(ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl, ContinuationImpl continuationImpl) {
        r8lambdarxu5TkcdeCzvGy6bhxSB2jxv4Lw r8lambdarxu5tkcdeczvgy6bhxsb2jxv4lw;
        Object objM4939invoke0E7RQCE;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof r8lambdarxu5TkcdeCzvGy6bhxSB2jxv4Lw) {
            int i2 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 123;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((r8lambdarxu5TkcdeCzvGy6bhxSB2jxv4Lw) continuationImpl).serializer;
                obj.hashCode();
                throw null;
            }
            r8lambdarxu5tkcdeczvgy6bhxsb2jxv4lw = (r8lambdarxu5TkcdeCzvGy6bhxSB2jxv4Lw) continuationImpl;
            int i4 = r8lambdarxu5tkcdeczvgy6bhxsb2jxv4lw.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 85;
                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i5 % Fields.SpotShadowColor;
                r8lambdarxu5tkcdeczvgy6bhxsb2jxv4lw.serializer = i5 % 2 == 0 ? i4 - Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                r8lambdarxu5tkcdeczvgy6bhxsb2jxv4lw = new r8lambdarxu5TkcdeCzvGy6bhxSB2jxv4Lw(confirmButtonV1UiModelImpl, continuationImpl);
            }
        } else {
            r8lambdarxu5tkcdeczvgy6bhxsb2jxv4lw = new r8lambdarxu5TkcdeCzvGy6bhxSB2jxv4Lw(confirmButtonV1UiModelImpl, continuationImpl);
        }
        Object obj2 = r8lambdarxu5tkcdeczvgy6bhxsb2jxv4lw.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = r8lambdarxu5tkcdeczvgy6bhxsb2jxv4lw.serializer;
        if (i6 != 0) {
            int i7 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 13;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            objM4939invoke0E7RQCE = ((onItemDismiss) obj2).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = confirmButtonV1UiModelImpl.PlaybackStateCompatCustomAction;
            long j = confirmButtonV1UiModelImpl.MediaSessionCompatToken;
            String str = confirmButtonV1UiModelImpl.PlaybackStateCompat;
            r8lambdarxu5tkcdeczvgy6bhxsb2jxv4lw.serializer = 1;
            objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl.m4939invoke0E7RQCE(j, str, r8lambdarxu5tkcdeczvgy6bhxsb2jxv4lw);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            PreviewLogger previewLogger = (PreviewLogger) objM4939invoke0E7RQCE;
            getPositionannotations getpositionannotations = previewLogger.serializer;
            confirmButtonV1UiModelImpl.read = getpositionannotations;
            confirmButtonV1UiModelImpl.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = previewLogger.IconCompatParcelizer;
            if (getpositionannotations == null) {
                int i9 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 51;
                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("ConfirmButtonV1UiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
                } else {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("ConfirmButtonV1UiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
                }
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            int i10 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 53;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "ConfirmButtonV1UiModelImpl: Analytics failed to load.", new Object[0]);
            int i12 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 79;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe A[SYNTHETIC] */
    public static final void read(ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, getPositionannotations getpositionannotations, Throwable th) {
        Object next;
        int i;
        accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep;
        String str;
        int i2 = 2 % 2;
        DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl = confirmButtonV1UiModelImpl.ParcelableVolumeInfo;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                int i3 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 11;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                while (it2.hasNext()) {
                    int i5 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 117;
                    r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        accessgetlorem_ipsum_sourcep = (accessgetLOREM_IPSUM_SOURCEp) it2.next();
                        List list = accessgetlorem_ipsum_sourcep.images;
                        str = accessgetlorem_ipsum_sourcep.taskId;
                        int i6 = 24 / 0;
                        if (!list.isEmpty()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{th, new getLoaderKey(str, 14)}, getCieXyz.write())).booleanValue()) {
                                deliveryConfirmationLoggerImpl.serializer(getpositionannotations, str, !accessgetlorem_ipsum_sourcep.isOptional);
                            }
                        }
                    } else {
                        accessgetlorem_ipsum_sourcep = (accessgetLOREM_IPSUM_SOURCEp) it2.next();
                        List list2 = accessgetlorem_ipsum_sourcep.images;
                        str = accessgetlorem_ipsum_sourcep.taskId;
                        if (!list2.isEmpty()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{th, new getLoaderKey(str, 14)}, getCieXyz.write())).booleanValue()) {
                                deliveryConfirmationLoggerImpl.serializer(getpositionannotations, str, !accessgetlorem_ipsum_sourcep.isOptional);
                            }
                        }
                    }
                }
                ArrayList<wrapper> arrayList2 = new ArrayList();
                Iterator<E> it3 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                while (it3.hasNext()) {
                    int i7 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 43;
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        next = it3.next();
                        int i8 = 7 / 0;
                        if (!(next instanceof wrapper)) {
                            continue;
                        } else {
                            i = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 7;
                            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i % Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                arrayList2.add(next);
                                throw null;
                            }
                            arrayList2.add(next);
                        }
                    } else {
                        next = it3.next();
                        if (next instanceof wrapper) {
                            i = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 7;
                            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i % Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                arrayList2.add(next);
                                throw null;
                            }
                            arrayList2.add(next);
                        } else {
                            continue;
                        }
                    }
                }
                for (wrapper wrapperVar : arrayList2) {
                    Wallpapers wallpapers = wrapperVar.state;
                    String str2 = wrapperVar.taskId;
                    if (wallpapers instanceof generateLoremIpsum) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{th, new getLoaderKey(str2, 14)}, getCieXyz.write())).booleanValue()) {
                            deliveryConfirmationLoggerImpl.serializer(getpositionannotations, str2, !wrapperVar.isOptional);
                        }
                    }
                }
                if (th != null) {
                    int i9 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 119;
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
                            return;
                        }
                    } else if (!pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
                        return;
                    }
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    final String message = th.getMessage();
                    forest.RemoteActionCompatParcelizer(new Exception(message) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PuDoExceptions$PuDoPictureUploadFailedNetworkException
                    }, "ConfirmButtonV1UiModelImpl: Failed to upload pictures.", new Object[0]);
                    return;
                }
                return;
            }
            int i10 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 29;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                boolean z = it.next() instanceof accessgetLOREM_IPSUM_SOURCEp;
                obj.hashCode();
                throw null;
            }
            Object next2 = it.next();
            if (next2 instanceof accessgetLOREM_IPSUM_SOURCEp) {
                int i11 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 85;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                arrayList.add(next2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Object access$onConfirmFailure(ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl, Object obj, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, ContinuationImpl continuationImpl) {
        invokeComposableMethod invokecomposablemethod;
        Throwable thSerializer;
        Object next;
        Map map;
        String str;
        Throwable th;
        Object next2;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof invokeComposableMethod) {
            int i3 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 65;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            invokecomposablemethod = (invokeComposableMethod) continuationImpl;
            int i5 = invokecomposablemethod.read;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                invokecomposablemethod.read = i5 - Integer.MIN_VALUE;
            } else {
                invokecomposablemethod = new invokeComposableMethod(confirmButtonV1UiModelImpl, continuationImpl);
            }
        } else {
            invokecomposablemethod = new invokeComposableMethod(confirmButtonV1UiModelImpl, continuationImpl);
        }
        Object obj2 = invokecomposablemethod.IconCompatParcelizer;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = invokecomposablemethod.read;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            thSerializer = onItemDismiss.serializer(obj);
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "ConfirmButtonV1UiModelImpl: Delivery confirmation failed.", new Object[0]);
            String message = thSerializer != null ? thSerializer.getMessage() : null;
            Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof PreviewLightDark));
            PreviewLightDark previewLightDark = (PreviewLightDark) next;
            if (previewLightDark == null || (map = previewLightDark.errors) == null) {
                map = SimpleItemTouchHelperCallback.serializer;
            }
            Set setKeySet = map.keySet();
            if (setKeySet.isEmpty() || message == null) {
                str = null;
            } else {
                Iterator it2 = setKeySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    int i7 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 113;
                    r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        next2 = it2.next();
                        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) message, (CharSequence) next2, true)) {
                            break;
                        }
                    } else {
                        next2 = it2.next();
                        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) message, (CharSequence) next2, false)) {
                            break;
                        }
                    }
                    if (thSerializer != null) {
                        i = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 17;
                        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i % Fields.SpotShadowColor;
                        if (i % 2 == 0 ? pauseWebviewIfNecessarylambda10.IconCompatParcelizer(thSerializer) : pauseWebviewIfNecessarylambda10.IconCompatParcelizer(thSerializer)) {
                            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                            final String message2 = thSerializer.getMessage();
                            forest.RemoteActionCompatParcelizer(new Exception(message2) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PuDoExceptions$PuDoConfirmationTaskFailedNetworkException
                            }, "ConfirmButtonV1UiModelImpl: Failed to confirm delivery.", new Object[0]);
                            int i8 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 79;
                            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                        }
                    }
                    return createFromParcel.INSTANCE;
                }
                String str2 = (String) next2;
                if (str2 != null) {
                    int i10 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 39;
                    r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    str = (String) map.get(str2);
                } else {
                    str = null;
                }
            }
            if (str != null) {
                invokecomposablemethod.RemoteActionCompatParcelizer = thSerializer;
                invokecomposablemethod.read = 1;
                if (confirmButtonV1UiModelImpl.updatePinValidationWithError(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, invokecomposablemethod) == obj3) {
                    return obj3;
                }
                th = thSerializer;
            } else {
                Throwable thSerializer2 = onItemDismiss.serializer(obj);
                String strWrite = thSerializer2 != null ? confirmButtonV1UiModelImpl.MediaSessionCompatResultReceiverWrapper.write(thSerializer2) : null;
                if (strWrite != null) {
                    confirmButtonV1UiModelImpl.RemoteActionCompatParcelizer.serializer(new ComposableInvoker(strWrite));
                }
            }
            if (thSerializer != null) {
                i = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 17;
                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                    final String message3 = thSerializer.getMessage();
                    forest2.RemoteActionCompatParcelizer(new Exception(message3) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PuDoExceptions$PuDoConfirmationTaskFailedNetworkException
                    }, "ConfirmButtonV1UiModelImpl: Failed to confirm delivery.", new Object[0]);
                    int i12 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 79;
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                } else {
                    Timber.Forest forest3 = Timber.RemoteActionCompatParcelizer;
                    final String message4 = thSerializer.getMessage();
                    forest3.RemoteActionCompatParcelizer(new Exception(message4) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PuDoExceptions$PuDoConfirmationTaskFailedNetworkException
                    }, "ConfirmButtonV1UiModelImpl: Failed to confirm delivery.", new Object[0]);
                    int i14 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 79;
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                }
            }
            return createFromParcel.INSTANCE;
        }
        int i16 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 77;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i16 % Fields.SpotShadowColor;
        if (i16 % 2 == 0 ? i6 != 1 : i6 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        th = invokecomposablemethod.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        thSerializer = th;
        if (thSerializer != null) {
            i = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 17;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                Timber.Forest forest4 = Timber.RemoteActionCompatParcelizer;
                final String message5 = thSerializer.getMessage();
                forest4.RemoteActionCompatParcelizer(new Exception(message5) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PuDoExceptions$PuDoConfirmationTaskFailedNetworkException
                }, "ConfirmButtonV1UiModelImpl: Failed to confirm delivery.", new Object[0]);
                int i17 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 79;
                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
            } else {
                Timber.Forest forest5 = Timber.RemoteActionCompatParcelizer;
                final String message6 = thSerializer.getMessage();
                forest5.RemoteActionCompatParcelizer(new Exception(message6) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.PuDoExceptions$PuDoConfirmationTaskFailedNetworkException
                }, "ConfirmButtonV1UiModelImpl: Failed to confirm delivery.", new Object[0]);
                int i19 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 79;
                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i19 % Fields.SpotShadowColor;
                int i110 = i19 % 2;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02af A[LOOP:7: B:101:0x02a9->B:103:0x02af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f2 A[LOOP:9: B:111:0x02ec->B:113:0x02f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0331  */
    /* JADX WARN: Code duplicated, block: B:120:0x0335  */
    /* JADX WARN: Code duplicated, block: B:123:0x0339  */
    /* JADX WARN: Code duplicated, block: B:126:0x033d A[PHI: r15 r18
  0x033d: PHI (r15v6 ??) = (r15v5 ??), (r15v9 ??) binds: [B:124:0x033a, B:19:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x033d: PHI (r18v5 long) = (r18v4 long), (r18v8 long) binds: [B:124:0x033a, B:19:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x0357  */
    /* JADX WARN: Code duplicated, block: B:132:0x035b  */
    /* JADX WARN: Code duplicated, block: B:135:0x035f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:0x018e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[LOOP:10: B:37:0x012b->B:175:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0127  */
    /* JADX WARN: Code duplicated, block: B:39:0x0131  */
    /* JADX WARN: Code duplicated, block: B:43:0x0149  */
    /* JADX WARN: Code duplicated, block: B:46:0x0155  */
    /* JADX WARN: Code duplicated, block: B:53:0x0173  */
    /* JADX WARN: Code duplicated, block: B:55:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x019c A[LOOP:1: B:65:0x0196->B:67:0x019c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0208  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214  */
    /* JADX WARN: Code duplicated, block: B:93:0x0246  */
    /* JADX WARN: Code duplicated, block: B:96:0x0263  */
    /* JADX WARN: Code duplicated, block: B:98:0x0298  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0151, code lost:
    
        if (r27.updatePinValidationWithError(r4, "", r1) == r12) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015d, code lost:
    
        if (r27.updatePinValidationWithError(r4, "", r1) == r12) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, java.lang.Throwable, o.ShortNewsContentCardView, o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk] */
    /* JADX WARN: Type inference failed for: r15v6, types: [o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$onConfirmSuccess(com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl r27, o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl.access$onConfirmSuccess(com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl, o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
