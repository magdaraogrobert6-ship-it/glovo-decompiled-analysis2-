package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$createConnectionManager$3;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.common.data.api.MapApiError;
import com.roadrunner.delivery.domain.ValidateAndSaveStateResponseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.heatmap.domain.ValidateAndSaveHeatmapResponseImpl;
import com.roadrunner.home.state.RetryExecuteApiRequest;
import com.roadrunner.home.state.domain.Phase2FallbackReason;
import com.roadrunner.home.state.logger.HomeItemValidationException;
import com.roadrunner.instant.shifts.data.InstantShiftRepository;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.nafath.data.VerificationStatusRepository;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.provider.domain.ValidateAndSaveStatusResponseImpl;
import com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository;
import java.time.Clock;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.SerializationException;
import o.EnumColumnAdapter;
import o.EventMetadata;
import o.FontVariationSetting;
import o.SemanticsNodedefault;
import o.ShortNewsContentCardView;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.TextPaintExtensions_androidKt;
import o._get_messageWebView_lambda3;
import o._get_messageWebView_lambda4;
import o.accessstartTrackingTable;
import o.considerReleasingGlowsOnScroll;
import o.copyGSF8kmg;
import o.createFromParcel;
import o.dispatchChildDetached;
import o.executeAsList;
import o.findCoordinatorToGetBoundsui;
import o.forEachUnmergedChild;
import o.getContentViewGroupParentLayout;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getHoldoutVariationName;
import o.getItemDecorInsetsForChild;
import o.getLongEdge;
import o.getMaxFlingVelocity;
import o.getMinFlingVelocity;
import o.getOnFlingListener;
import o.getPayloadFromSystemProperty;
import o.getRecycledViewPool;
import o.hasPendingAdapterUpdates;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.isRemoved;
import o.onContentCardClicked;
import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;
import o.performCustomExitMxy_nc0;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.requestBannersRefreshlambda121;
import o.requestBannersRefreshlambda13;
import o.requestDisallowParentIntercept;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setVerboseLoggingEnabled;
import o.setWasCloseMessageCalled;
import o.slant;
import o.transferSessionPackageI;
import o.updateAdidI;
import retrofit2.HttpException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl {
    private static int r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = 0;
    private static int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = 1;
    public final getRecycledViewPool ComponentActivity;
    public final ConfirmationRepository IconCompatParcelizer;
    public final InstantShiftRepository MediaBrowserCompatMediaItem;
    public final hasPendingAdapterUpdates MediaDescriptionCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaMetadataCompat;
    public final slant MediaSessionCompatQueueItem;
    public final OpportunitiesRepository MediaSessionCompatResultReceiverWrapper;
    public onItemDismiss MediaSessionCompatToken;
    public final AtomicLong ParcelableVolumeInfo;
    public final MapApiError PlaybackStateCompat;
    public final getContentViewGroupParentLayout PlaybackStateCompatCustomAction;
    public final resetTransientState RatingCompat;
    public final FontVariationSetting RemoteActionCompatParcelizer;
    public final dispatchChildDetached ResultReceiver;
    public final transferSessionPackageI r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final RetryExecuteApiRequest r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final QuickSessionsRepository r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final EventMetadata r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final forEachUnmergedChild r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final ValidateAndSaveHeatmapResponseImpl r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final ValidateAndSaveStateResponseImpl r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final ValidateAndSaveStatusResponseImpl r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final MutexImpl r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final requestBannersRefreshlambda121 r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final VerificationStatusRepository r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final copyGSF8kmg read;
    public final Clock serializer;
    public final TextPaintExtensions_androidKt write;

    public HomeRepositoryImpl(ExecuteApiRequest executeApiRequest, hasPendingAdapterUpdates haspendingadapterupdates, transferSessionPackageI transfersessionpackagei, getContentViewGroupParentLayout getcontentviewgroupparentlayout, OpportunitiesRepository opportunitiesRepository, VerificationStatusRepository verificationStatusRepository, InstantShiftRepository instantShiftRepository, ValidateAndSaveStateResponseImpl validateAndSaveStateResponseImpl, ValidateAndSaveStatusResponseImpl validateAndSaveStatusResponseImpl, ValidateAndSaveHeatmapResponseImpl validateAndSaveHeatmapResponseImpl, requestBannersRefreshlambda121 requestbannersrefreshlambda121, forEachUnmergedChild foreachunmergedchild, ConfirmationRepository confirmationRepository, EventMetadata eventMetadata, dispatchChildDetached dispatchchilddetached, QuickSessionsRepository quickSessionsRepository, resetTransientState resettransientstate, getRecycledViewPool getrecycledviewpool, Clock clock, MapApiError mapApiError, FontVariationSetting fontVariationSetting, copyGSF8kmg copygsf8kmg, slant slantVar, TextPaintExtensions_androidKt textPaintExtensions_androidKt) {
        executeApiRequest.getClass();
        haspendingadapterupdates.getClass();
        transfersessionpackagei.getClass();
        getcontentviewgroupparentlayout.getClass();
        opportunitiesRepository.getClass();
        verificationStatusRepository.getClass();
        instantShiftRepository.getClass();
        validateAndSaveStateResponseImpl.getClass();
        validateAndSaveStatusResponseImpl.getClass();
        validateAndSaveHeatmapResponseImpl.getClass();
        requestbannersrefreshlambda121.getClass();
        foreachunmergedchild.getClass();
        confirmationRepository.getClass();
        eventMetadata.getClass();
        dispatchchilddetached.getClass();
        quickSessionsRepository.getClass();
        resettransientstate.getClass();
        getrecycledviewpool.getClass();
        clock.getClass();
        mapApiError.getClass();
        fontVariationSetting.getClass();
        copygsf8kmg.getClass();
        slantVar.getClass();
        textPaintExtensions_androidKt.getClass();
        this.MediaDescriptionCompat = haspendingadapterupdates;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = transfersessionpackagei;
        this.PlaybackStateCompatCustomAction = getcontentviewgroupparentlayout;
        this.MediaSessionCompatResultReceiverWrapper = opportunitiesRepository;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = verificationStatusRepository;
        this.MediaBrowserCompatMediaItem = instantShiftRepository;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = validateAndSaveStateResponseImpl;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = validateAndSaveStatusResponseImpl;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = validateAndSaveHeatmapResponseImpl;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = requestbannersrefreshlambda121;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = foreachunmergedchild;
        this.IconCompatParcelizer = confirmationRepository;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = eventMetadata;
        this.ResultReceiver = dispatchchilddetached;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = quickSessionsRepository;
        this.RatingCompat = resettransientstate;
        this.ComponentActivity = getrecycledviewpool;
        this.serializer = clock;
        this.PlaybackStateCompat = mapApiError;
        this.RemoteActionCompatParcelizer = fontVariationSetting;
        this.read = copygsf8kmg;
        this.MediaSessionCompatQueueItem = slantVar;
        this.write = textPaintExtensions_androidKt;
        this.ParcelableVolumeInfo = new AtomicLong(0L);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new RetryExecuteApiRequest(executeApiRequest, getrecycledviewpool, new RoomDatabase$createConnectionManager$3(2, this, HomeRepositoryImpl.class, "validateAndSaveResponseLock", "validateAndSaveResponseLock-gIAlu-s(Lcom/roadrunner/home/state/entity/HomeResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2));
    }

    public final void IconCompatParcelizer(getMaxFlingVelocity getmaxflingvelocity, String str) {
        int i = 2 % 2;
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        int i2 = getmaxflingvelocity.statusCode;
        _get_messageWebView_lambda4 _get_messagewebview_lambda4 = _get_messageWebView_lambda3.EMPTY;
        forest.write(new HomeItemValidationException(str, this.PlaybackStateCompat.RemoteActionCompatParcelizer(new HttpException(getHoldoutVariationName.IconCompatParcelizer(i2, getLongEdge.RemoteActionCompatParcelizer(getmaxflingvelocity.jsonBody.toString()))))));
        int i3 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 39;
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: processHeatmaps-gIAlu-s, reason: not valid java name */
    public final Object m4974processHeatmapsgIAlus(getMaxFlingVelocity getmaxflingvelocity, ContinuationImpl continuationImpl) {
        HomeRepositoryImpl$processHeatmaps$1 homeRepositoryImpl$processHeatmaps$1;
        int i = 2 % 2;
        if (continuationImpl instanceof HomeRepositoryImpl$processHeatmaps$1) {
            int i2 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 13;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            homeRepositoryImpl$processHeatmaps$1 = (HomeRepositoryImpl$processHeatmaps$1) continuationImpl;
            int i4 = homeRepositoryImpl$processHeatmaps$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                homeRepositoryImpl$processHeatmaps$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                homeRepositoryImpl$processHeatmaps$1 = new HomeRepositoryImpl$processHeatmaps$1(this, continuationImpl);
            }
        } else {
            homeRepositoryImpl$processHeatmaps$1 = new HomeRepositoryImpl$processHeatmaps$1(this, continuationImpl);
        }
        Object obj = homeRepositoryImpl$processHeatmaps$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = homeRepositoryImpl$processHeatmaps$1.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i5 != 0) {
            int i6 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            int i7 = i6 + 35;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i6 + 89;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
            obj2.hashCode();
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (getmaxflingvelocity == null || !getmaxflingvelocity.IconCompatParcelizer()) {
            homeRepositoryImpl$processHeatmaps$1.RemoteActionCompatParcelizer = 1;
            Object objM4965invokegIAlus = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.m4965invokegIAlus(getmaxflingvelocity, homeRepositoryImpl$processHeatmaps$1);
            if (objM4965invokegIAlus != coroutineSingletons) {
                return objM4965invokegIAlus;
            }
            int i10 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 93;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return coroutineSingletons;
        }
        int i12 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 73;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            IconCompatParcelizer(getmaxflingvelocity, "heatmaps");
            return createFromParcel.INSTANCE;
        }
        IconCompatParcelizer(getmaxflingvelocity, "heatmaps");
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX INFO: renamed from: processVerificationStatus-gIAlu-s, reason: not valid java name */
    public final Object m4977processVerificationStatusgIAlus(getMaxFlingVelocity getmaxflingvelocity, ContinuationImpl continuationImpl) {
        HomeRepositoryImpl$processVerificationStatus$1 homeRepositoryImpl$processVerificationStatus$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj2;
        Object objM4992setgIAlus;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 35;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            if (continuationImpl instanceof HomeRepositoryImpl$processVerificationStatus$1) {
                homeRepositoryImpl$processVerificationStatus$1 = (HomeRepositoryImpl$processVerificationStatus$1) continuationImpl;
                i4 = homeRepositoryImpl$processVerificationStatus$1.read;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    homeRepositoryImpl$processVerificationStatus$1.read = i4 - Integer.MIN_VALUE;
                }
            }
            obj = homeRepositoryImpl$processVerificationStatus$1.RemoteActionCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = homeRepositoryImpl$processVerificationStatus$1.read;
            obj2 = null;
            if (i != 0) {
                if (i == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return ((onItemDismiss) obj).IconCompatParcelizer;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (getmaxflingvelocity != null) {
                int i7 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 111;
                r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (getmaxflingvelocity.IconCompatParcelizer()) {
                    IconCompatParcelizer(getmaxflingvelocity, "verification_status");
                    return createFromParcel.INSTANCE;
                }
            }
            homeRepositoryImpl$processVerificationStatus$1.read = 1;
            objM4992setgIAlus = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.m4992setgIAlus(getmaxflingvelocity, homeRepositoryImpl$processVerificationStatus$1);
            if (objM4992setgIAlus != coroutineSingletons) {
                return objM4992setgIAlus;
            }
            i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            i3 = i2 + 9;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            int i9 = i2 + 101;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return coroutineSingletons;
        }
        int i11 = 61 / 0;
        if (!(!(continuationImpl instanceof HomeRepositoryImpl$processVerificationStatus$1))) {
            homeRepositoryImpl$processVerificationStatus$1 = (HomeRepositoryImpl$processVerificationStatus$1) continuationImpl;
            i4 = homeRepositoryImpl$processVerificationStatus$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                homeRepositoryImpl$processVerificationStatus$1.read = i4 - Integer.MIN_VALUE;
            }
        }
        obj = homeRepositoryImpl$processVerificationStatus$1.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = homeRepositoryImpl$processVerificationStatus$1.read;
        obj2 = null;
        if (i != 0) {
            if (i == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (getmaxflingvelocity != null) {
            int i12 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 111;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (getmaxflingvelocity.IconCompatParcelizer()) {
                IconCompatParcelizer(getmaxflingvelocity, "verification_status");
                return createFromParcel.INSTANCE;
            }
        }
        homeRepositoryImpl$processVerificationStatus$1.read = 1;
        objM4992setgIAlus = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.m4992setgIAlus(getmaxflingvelocity, homeRepositoryImpl$processVerificationStatus$1);
        if (objM4992setgIAlus != coroutineSingletons) {
            return objM4992setgIAlus;
        }
        i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        i3 = i2 + 9;
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i14 = i2 + 101;
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return coroutineSingletons;
        homeRepositoryImpl$processVerificationStatus$1 = new HomeRepositoryImpl$processVerificationStatus$1(this, continuationImpl);
        obj = homeRepositoryImpl$processVerificationStatus$1.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = homeRepositoryImpl$processVerificationStatus$1.read;
        obj2 = null;
        if (i != 0) {
            if (i == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (getmaxflingvelocity != null) {
            int i16 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 111;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            if (getmaxflingvelocity.IconCompatParcelizer()) {
                IconCompatParcelizer(getmaxflingvelocity, "verification_status");
                return createFromParcel.INSTANCE;
            }
        }
        homeRepositoryImpl$processVerificationStatus$1.read = 1;
        objM4992setgIAlus = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.m4992setgIAlus(getmaxflingvelocity, homeRepositoryImpl$processVerificationStatus$1);
        if (objM4992setgIAlus != coroutineSingletons) {
            return objM4992setgIAlus;
        }
        i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        i3 = i2 + 9;
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i18 = i2 + 101;
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: processWorkOpportunities-gIAlu-s, reason: not valid java name */
    public final Object m4978processWorkOpportunitiesgIAlus(getMaxFlingVelocity getmaxflingvelocity, ContinuationImpl continuationImpl) {
        HomeRepositoryImpl$processWorkOpportunities$1 homeRepositoryImpl$processWorkOpportunities$1;
        int i = 2 % 2;
        int i2 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 41;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i3;
        int i4 = i2 % 2;
        if (continuationImpl instanceof HomeRepositoryImpl$processWorkOpportunities$1) {
            int i5 = i3 + 9;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            homeRepositoryImpl$processWorkOpportunities$1 = (HomeRepositoryImpl$processWorkOpportunities$1) continuationImpl;
            int i7 = homeRepositoryImpl$processWorkOpportunities$1.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 57;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                homeRepositoryImpl$processWorkOpportunities$1.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
            } else {
                homeRepositoryImpl$processWorkOpportunities$1 = new HomeRepositoryImpl$processWorkOpportunities$1(this, continuationImpl);
            }
        } else {
            homeRepositoryImpl$processWorkOpportunities$1 = new HomeRepositoryImpl$processWorkOpportunities$1(this, continuationImpl);
        }
        Object obj = homeRepositoryImpl$processWorkOpportunities$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = homeRepositoryImpl$processWorkOpportunities$1.RemoteActionCompatParcelizer;
        if (i10 != 0) {
            int i11 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 71;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0 ? i10 != 1 : i10 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (getmaxflingvelocity != null) {
            int i12 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 85;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0 ? getmaxflingvelocity.IconCompatParcelizer() : getmaxflingvelocity.IconCompatParcelizer()) {
                IconCompatParcelizer(getmaxflingvelocity, "work_opportunities");
                return createFromParcel.INSTANCE;
            }
        }
        homeRepositoryImpl$processWorkOpportunities$1.RemoteActionCompatParcelizer = 1;
        Object objM4994setgIAlus = this.MediaSessionCompatResultReceiverWrapper.m4994setgIAlus(getmaxflingvelocity, homeRepositoryImpl$processWorkOpportunities$1);
        if (objM4994setgIAlus != coroutineSingletons) {
            return objM4994setgIAlus;
        }
        int i13 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 75;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i13 % Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            int i14 = 24 / 0;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    /* JADX INFO: renamed from: processDeliveryTasks-gIAlu-s, reason: not valid java name */
    public final Object m4972processDeliveryTasksgIAlus(Map map, ContinuationImpl continuationImpl) {
        HomeRepositoryImpl$processDeliveryTasks$1 homeRepositoryImpl$processDeliveryTasks$1;
        Iterator it;
        int i = 2 % 2;
        if (!(continuationImpl instanceof HomeRepositoryImpl$processDeliveryTasks$1)) {
            homeRepositoryImpl$processDeliveryTasks$1 = new HomeRepositoryImpl$processDeliveryTasks$1(this, continuationImpl);
        } else {
            int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 47;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            homeRepositoryImpl$processDeliveryTasks$1 = (HomeRepositoryImpl$processDeliveryTasks$1) continuationImpl;
            int i4 = homeRepositoryImpl$processDeliveryTasks$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 31;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                homeRepositoryImpl$processDeliveryTasks$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                homeRepositoryImpl$processDeliveryTasks$1 = new HomeRepositoryImpl$processDeliveryTasks$1(this, continuationImpl);
            }
        }
        Object obj = homeRepositoryImpl$processDeliveryTasks$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = homeRepositoryImpl$processDeliveryTasks$1.RemoteActionCompatParcelizer;
        if (i7 != 0) {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 37;
                r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
            int i10 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 55;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return obj2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (map != null) {
            int i12 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 97;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                it = map.entrySet().iterator();
                int i13 = 33 / 0;
            } else {
                it = map.entrySet().iterator();
            }
            while (it.hasNext()) {
                getMaxFlingVelocity getmaxflingvelocity = (getMaxFlingVelocity) ((Map.Entry) it.next()).getValue();
                if (getmaxflingvelocity.IconCompatParcelizer()) {
                    IconCompatParcelizer(getmaxflingvelocity, "delivery_tasks");
                    int i14 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 101;
                    r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                }
            }
        }
        homeRepositoryImpl$processDeliveryTasks$1.RemoteActionCompatParcelizer = 1;
        Object objM4927validateAndSaveDeliveryConfirmationgIAlus = this.IconCompatParcelizer.m4927validateAndSaveDeliveryConfirmationgIAlus(map, homeRepositoryImpl$processDeliveryTasks$1);
        return objM4927validateAndSaveDeliveryConfirmationgIAlus == coroutineSingletons ? coroutineSingletons : objM4927validateAndSaveDeliveryConfirmationgIAlus;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: waitForRiderHomeToComplete-IoAF18A, reason: not valid java name */
    public final Object m4980waitForRiderHomeToCompleteIoAF18A(ContinuationImpl continuationImpl) {
        HomeRepositoryImpl$waitForRiderHomeToComplete$1 homeRepositoryImpl$waitForRiderHomeToComplete$1;
        int i = 2 % 2;
        if (continuationImpl instanceof HomeRepositoryImpl$waitForRiderHomeToComplete$1) {
            int i2 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 57;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            homeRepositoryImpl$waitForRiderHomeToComplete$1 = (HomeRepositoryImpl$waitForRiderHomeToComplete$1) continuationImpl;
            int i4 = homeRepositoryImpl$waitForRiderHomeToComplete$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                homeRepositoryImpl$waitForRiderHomeToComplete$1.read = i4 - Integer.MIN_VALUE;
            } else {
                homeRepositoryImpl$waitForRiderHomeToComplete$1 = new HomeRepositoryImpl$waitForRiderHomeToComplete$1(this, continuationImpl);
            }
        } else {
            homeRepositoryImpl$waitForRiderHomeToComplete$1 = new HomeRepositoryImpl$waitForRiderHomeToComplete$1(this, continuationImpl);
        }
        Object obj = homeRepositoryImpl$waitForRiderHomeToComplete$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = homeRepositoryImpl$waitForRiderHomeToComplete$1.read;
        if (i5 != 0) {
            int i6 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 69;
            int i7 = i6 % Fields.SpotShadowColor;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i7;
            int i8 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i7 + 39;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i10 = 62 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            int i11 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 81;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = 5 % 4;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.IconCompatParcelizer("Waiting for RiderHome job to complete", new Object[0]);
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaMetadataCompat;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null && r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
                forest.IconCompatParcelizer("RiderHome job is active, waiting for it to finish", new Object[0]);
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = this.MediaMetadataCompat;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                    homeRepositoryImpl$waitForRiderHomeToComplete$1.read = 1;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.join(homeRepositoryImpl$waitForRiderHomeToComplete$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        }
        onItemDismiss onitemdismiss = this.MediaSessionCompatToken;
        if (onitemdismiss == null) {
            return new isItemDismissable(new accessstartTrackingTable(7));
        }
        int i13 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 49;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i13 % Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return onitemdismiss.IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: processRiderState-gIAlu-s, reason: not valid java name */
    public final Object m4975processRiderStategIAlus(String str, ContinuationImpl continuationImpl) {
        HomeRepositoryImpl$processRiderState$1 homeRepositoryImpl$processRiderState$1;
        Object objUpdateData;
        int i;
        int i2;
        int i3 = 2 % 2;
        if (continuationImpl instanceof HomeRepositoryImpl$processRiderState$1) {
            homeRepositoryImpl$processRiderState$1 = (HomeRepositoryImpl$processRiderState$1) continuationImpl;
            int i4 = homeRepositoryImpl$processRiderState$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                homeRepositoryImpl$processRiderState$1.serializer = i4 - Integer.MIN_VALUE;
            } else {
                homeRepositoryImpl$processRiderState$1 = new HomeRepositoryImpl$processRiderState$1(this, continuationImpl);
            }
        } else {
            homeRepositoryImpl$processRiderState$1 = new HomeRepositoryImpl$processRiderState$1(this, continuationImpl);
        }
        Object obj = homeRepositoryImpl$processRiderState$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = homeRepositoryImpl$processRiderState$1.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 != 0) {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i6 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 37;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        homeRepositoryImpl$processRiderState$1.serializer = 1;
        RiderStateRepositoryImpl riderStateRepositoryImpl = (RiderStateRepositoryImpl) this.ResultReceiver;
        if (riderStateRepositoryImpl.write()) {
            int i8 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 15;
            int i9 = i8 % Fields.SpotShadowColor;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i9;
            if (i8 % 2 != 0) {
                int i10 = 7 / 0;
                if (str != null) {
                    i = i9 + 109;
                    r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                        throw null;
                    }
                    if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                        considerReleasingGlowsOnScroll considerreleasingglowsonscroll = riderStateRepositoryImpl.MediaMetadataCompat;
                        objUpdateData = ((performCustomExitMxy_nc0) considerreleasingglowsonscroll.read.MediaSessionCompatResultReceiverWrapper()).updateData(new NafathTimerDataStore$set$2(considerreleasingglowsonscroll, str, shortNewsContentCardView, 6), homeRepositoryImpl$processRiderState$1);
                        if (objUpdateData != coroutineSingletons) {
                            i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 123;
                            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i2 % Fields.SpotShadowColor;
                            if (i2 % 2 != 0) {
                                int i11 = 2 / 3;
                            }
                            objUpdateData = createfromparcel;
                        }
                        if (objUpdateData != coroutineSingletons) {
                        }
                    }
                    objUpdateData = createfromparcel;
                }
            } else if (str != null) {
                i = i9 + 109;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                    throw null;
                }
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    considerReleasingGlowsOnScroll considerreleasingglowsonscroll2 = riderStateRepositoryImpl.MediaMetadataCompat;
                    objUpdateData = ((performCustomExitMxy_nc0) considerreleasingglowsonscroll2.read.MediaSessionCompatResultReceiverWrapper()).updateData(new NafathTimerDataStore$set$2(considerreleasingglowsonscroll2, str, shortNewsContentCardView, 6), homeRepositoryImpl$processRiderState$1);
                    if (objUpdateData != coroutineSingletons) {
                        i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 123;
                        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i12 = 2 / 3;
                        }
                        objUpdateData = createfromparcel;
                    }
                    if (objUpdateData != coroutineSingletons) {
                    }
                }
                objUpdateData = createfromparcel;
            }
            riderStateRepositoryImpl.read(Phase2FallbackReason.RiderStateNullOrEmpty.read);
            objUpdateData = createfromparcel;
        } else {
            objUpdateData = createfromparcel;
        }
        if (objUpdateData == coroutineSingletons) {
            return coroutineSingletons;
        }
        int i13 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 107;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i13 % Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            return createfromparcel;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: processTnc-gIAlu-s, reason: not valid java name */
    public final Object m4976processTncgIAlus(getMaxFlingVelocity getmaxflingvelocity, ContinuationImpl continuationImpl) {
        HomeRepositoryImpl$processTnc$1 homeRepositoryImpl$processTnc$1;
        int i = 2 % 2;
        int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 85;
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!(!(continuationImpl instanceof HomeRepositoryImpl$processTnc$1))) {
            homeRepositoryImpl$processTnc$1 = (HomeRepositoryImpl$processTnc$1) continuationImpl;
            int i4 = homeRepositoryImpl$processTnc$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                homeRepositoryImpl$processTnc$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                homeRepositoryImpl$processTnc$1 = new HomeRepositoryImpl$processTnc$1(this, continuationImpl);
            }
        } else {
            homeRepositoryImpl$processTnc$1 = new HomeRepositoryImpl$processTnc$1(this, continuationImpl);
        }
        Object obj = homeRepositoryImpl$processTnc$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = homeRepositoryImpl$processTnc$1.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i6 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 67;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 43 / 0;
            }
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object isitemdismissable = createFromParcel.INSTANCE;
        if (getmaxflingvelocity != null) {
            int i8 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 119;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getmaxflingvelocity.IconCompatParcelizer()) {
                IconCompatParcelizer(getmaxflingvelocity, "terms_and_conditions");
                return isitemdismissable;
            }
        }
        homeRepositoryImpl$processTnc$1.RemoteActionCompatParcelizer = 1;
        requestBannersRefreshlambda121 requestbannersrefreshlambda121 = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        MutableStateFlow mutableStateFlow = requestbannersrefreshlambda121.IconCompatParcelizer.read;
        if (getmaxflingvelocity != null) {
            try {
                resetTransientState resettransientstate = requestbannersrefreshlambda121.read;
                String string = getmaxflingvelocity.jsonBody.toString();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = requestBannersRefreshlambda13.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                requestBannersRefreshlambda13 requestbannersrefreshlambda13 = (requestBannersRefreshlambda13) resettransientstate.serializer(string, setgraphicmodalmaxwidthdpSerializer);
                requestbannersrefreshlambda13.getClass();
                mutableStateFlow.IconCompatParcelizer(requestbannersrefreshlambda13);
            } catch (Exception e) {
                isitemdismissable = new isItemDismissable(e);
            }
        } else {
            mutableStateFlow.IconCompatParcelizer(null);
        }
        if (isitemdismissable != coroutineSingletons) {
            return isitemdismissable;
        }
        int i10 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 33;
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: fetchHomeResponseAsync-BWLJW6A, reason: not valid java name */
    public final Object m4971fetchHomeResponseAsyncBWLJW6A(String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        HomeRepositoryImpl$fetchHomeResponseAsync$1 homeRepositoryImpl$fetchHomeResponseAsync$1;
        Object objM4969invoke0E7RQCE;
        int i = 2 % 2;
        if (continuationImpl instanceof HomeRepositoryImpl$fetchHomeResponseAsync$1) {
            int i2 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 55;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((HomeRepositoryImpl$fetchHomeResponseAsync$1) continuationImpl).read;
                throw null;
            }
            homeRepositoryImpl$fetchHomeResponseAsync$1 = (HomeRepositoryImpl$fetchHomeResponseAsync$1) continuationImpl;
            int i4 = homeRepositoryImpl$fetchHomeResponseAsync$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                homeRepositoryImpl$fetchHomeResponseAsync$1.read = i4 - Integer.MIN_VALUE;
            } else {
                homeRepositoryImpl$fetchHomeResponseAsync$1 = new HomeRepositoryImpl$fetchHomeResponseAsync$1(this, continuationImpl);
            }
        } else {
            homeRepositoryImpl$fetchHomeResponseAsync$1 = new HomeRepositoryImpl$fetchHomeResponseAsync$1(this, continuationImpl);
        }
        HomeRepositoryImpl$fetchHomeResponseAsync$1 homeRepositoryImpl$fetchHomeResponseAsync$2 = homeRepositoryImpl$fetchHomeResponseAsync$1;
        Object obj = homeRepositoryImpl$fetchHomeResponseAsync$2.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = homeRepositoryImpl$fetchHomeResponseAsync$2.read;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            HomeRepositoryImpl$fetchHomeResponseAsync$2 homeRepositoryImpl$fetchHomeResponseAsync$3 = new HomeRepositoryImpl$fetchHomeResponseAsync$2(this, z, str, str2, null);
            homeRepositoryImpl$fetchHomeResponseAsync$2.read = 1;
            objM4969invoke0E7RQCE = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.m4969invoke0E7RQCE(3, homeRepositoryImpl$fetchHomeResponseAsync$3, homeRepositoryImpl$fetchHomeResponseAsync$2);
            if (objM4969invoke0E7RQCE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 49;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4969invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4969invoke0E7RQCE instanceof isItemDismissable)) {
            this.ParcelableVolumeInfo.set(this.serializer.millis());
            this.MediaSessionCompatToken = new onItemDismiss(createFromParcel.INSTANCE);
            int i7 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 117;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4969invoke0E7RQCE);
        if (thSerializer != null) {
            this.MediaSessionCompatToken = new onItemDismiss(new isItemDismissable(thSerializer));
            if (thSerializer instanceof setVerboseLoggingEnabled) {
                EnumColumnAdapter.serializer(this.ComponentActivity.write, "rider_home_not_received_after_retries", executeAsList.RXP, "RiderHome Response, not received after retries");
            }
        }
        return objM4969invoke0E7RQCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: processGarnet-gIAlu-s, reason: not valid java name */
    public final Object m4973processGarnetgIAlus(getMaxFlingVelocity getmaxflingvelocity, ContinuationImpl continuationImpl) {
        HomeRepositoryImpl$processGarnet$1 homeRepositoryImpl$processGarnet$1;
        int i = 2 % 2;
        int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 15;
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof HomeRepositoryImpl$processGarnet$1) {
            homeRepositoryImpl$processGarnet$1 = (HomeRepositoryImpl$processGarnet$1) continuationImpl;
            int i4 = homeRepositoryImpl$processGarnet$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                homeRepositoryImpl$processGarnet$1.write = i4 - Integer.MIN_VALUE;
                int i5 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 75;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                homeRepositoryImpl$processGarnet$1 = new HomeRepositoryImpl$processGarnet$1(this, continuationImpl);
            }
        } else {
            homeRepositoryImpl$processGarnet$1 = new HomeRepositoryImpl$processGarnet$1(this, continuationImpl);
        }
        Object obj = homeRepositoryImpl$processGarnet$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = homeRepositoryImpl$processGarnet$1.write;
        if (i7 != 0) {
            if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object isitemdismissable = createFromParcel.INSTANCE;
        if (getmaxflingvelocity != null) {
            int i8 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 53;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getmaxflingvelocity.IconCompatParcelizer()) {
                int i10 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 5;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                IconCompatParcelizer(getmaxflingvelocity, "garnet");
                return isitemdismissable;
            }
        }
        homeRepositoryImpl$processGarnet$1.write = 1;
        forEachUnmergedChild foreachunmergedchild = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        SemanticsNodedefault semanticsNodedefault = foreachunmergedchild.read;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) foreachunmergedchild.serializer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_GARNET_MIGRATION_ENABLED) && getmaxflingvelocity != null) {
            try {
                resetTransientState resettransientstate = foreachunmergedchild.RemoteActionCompatParcelizer;
                SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = getmaxflingvelocity.jsonBody;
                resettransientstate.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = findCoordinatorToGetBoundsui.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                findCoordinatorToGetBoundsui findcoordinatortogetboundsui = (findCoordinatorToGetBoundsui) resettransientstate.IconCompatParcelizer(setgraphicmodalmaxwidthdpSerializer, swipeDismissTouchListenerVerticalDismissDirection);
                semanticsNodedefault.getClass();
                findcoordinatortogetboundsui.getClass();
                semanticsNodedefault.serializer.IconCompatParcelizer(findcoordinatortogetboundsui);
                int i12 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 73;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } catch (Exception e) {
                isitemdismissable = new isItemDismissable(e);
            }
        } else {
            semanticsNodedefault.serializer.IconCompatParcelizer(null);
        }
        return isitemdismissable == coroutineSingletons ? coroutineSingletons : isitemdismissable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r9.lock(r1) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (r9.lock(r1) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        r5 = r8;
        r8 = 0;
     */
    /* JADX INFO: renamed from: access$validateAndSaveResponseLock-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4970access$validateAndSaveResponseLockgIAlus(com.roadrunner.home.state.data.HomeRepositoryImpl r7, o.getItemDecorInsetsForChild r8, o.ShortNewsContentCardView r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.state.data.HomeRepositoryImpl.m4970access$validateAndSaveResponseLockgIAlus(com.roadrunner.home.state.data.HomeRepositoryImpl, o.getItemDecorInsetsForChild, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:107:0x03da  */
    /* JADX WARN: Code duplicated, block: B:113:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:115:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:118:0x040a  */
    /* JADX WARN: Code duplicated, block: B:120:0x040d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0413 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0415  */
    /* JADX WARN: Code duplicated, block: B:124:0x0437  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0390 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0194  */
    /* JADX WARN: Code duplicated, block: B:39:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0228  */
    /* JADX WARN: Code duplicated, block: B:61:0x0255  */
    /* JADX WARN: Code duplicated, block: B:65:0x0282  */
    /* JADX WARN: Code duplicated, block: B:69:0x02af  */
    /* JADX WARN: Code duplicated, block: B:73:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0313  */
    /* JADX WARN: Code duplicated, block: B:77:0x031d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0335  */
    /* JADX WARN: Code duplicated, block: B:83:0x033e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0356  */
    /* JADX WARN: Code duplicated, block: B:90:0x0373  */
    /* JADX WARN: Code duplicated, block: B:97:0x038e A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x0415, please report this as an issue */
    /* JADX INFO: renamed from: validateAndSaveResponse-gIAlu-s, reason: not valid java name */
    public final Object m4979validateAndSaveResponsegIAlus(getItemDecorInsetsForChild getitemdecorinsetsforchild, ContinuationImpl continuationImpl) {
        HomeRepositoryImpl$validateAndSaveResponse$1 homeRepositoryImpl$validateAndSaveResponse$1;
        getMinFlingVelocity getminflingvelocity;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr;
        Object objM4972processDeliveryTasksgIAlus;
        getItemDecorInsetsForChild getitemdecorinsetsforchild2;
        int i;
        int i2;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr2;
        Object objM5031invokegIAlus;
        int i3;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr3;
        getMaxFlingVelocity getmaxflingvelocity;
        InstantShiftRepository instantShiftRepository;
        AtomicReference atomicReference;
        Object isitemdismissable;
        Object objM4978processWorkOpportunitiesgIAlus;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr4;
        Object obj;
        int i4;
        Object objM4977processVerificationStatusgIAlus;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr5;
        Object obj2;
        int i5;
        Object objM4974processHeatmapsgIAlus;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr6;
        Object obj3;
        int i6;
        Object objM4976processTncgIAlus;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr7;
        Object obj4;
        int i7;
        Object objM4973processGarnetgIAlus;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr8;
        Object obj5;
        int i8;
        Object objM4911invokegIAlus;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr9;
        Object obj6;
        int i9;
        getOnFlingListener getonflinglistener;
        String string;
        Object objM4975processRiderStategIAlus;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr10;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr11;
        getMinFlingVelocity getminflingvelocity2;
        getItemDecorInsetsForChild getitemdecorinsetsforchild3;
        Object obj7;
        int i10;
        requestDisallowParentIntercept requestdisallowparentintercept;
        getMaxFlingVelocity getmaxflingvelocity2;
        getPayloadFromSystemProperty getpayloadfromsystemproperty;
        Iterator it;
        Object next;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        Integer num;
        EventMetadata eventMetadata;
        Long lValueOf;
        long jIntValue;
        int i11 = 2 % 2;
        if (continuationImpl instanceof HomeRepositoryImpl$validateAndSaveResponse$1) {
            homeRepositoryImpl$validateAndSaveResponse$1 = (HomeRepositoryImpl$validateAndSaveResponse$1) continuationImpl;
            int i12 = homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = i12 - Integer.MIN_VALUE;
            } else {
                homeRepositoryImpl$validateAndSaveResponse$1 = new HomeRepositoryImpl$validateAndSaveResponse$1(this, continuationImpl);
            }
        } else {
            homeRepositoryImpl$validateAndSaveResponse$1 = new HomeRepositoryImpl$validateAndSaveResponse$1(this, continuationImpl);
        }
        Object obj8 = homeRepositoryImpl$validateAndSaveResponse$1.MediaMetadataCompat;
        Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj10 = null;
        switch (i13) {
            case 0:
                ExtrasKt.RemoteActionCompatParcelizer(obj8);
                getminflingvelocity = getitemdecorinsetsforchild.raw;
                getMaxFlingVelocity getmaxflingvelocity3 = getminflingvelocity.riderStatus;
                getMaxFlingVelocity getmaxflingvelocity4 = getminflingvelocity.deliveryState;
                boolean zIconCompatParcelizer = getmaxflingvelocity3.IconCompatParcelizer();
                MapApiError mapApiError = this.PlaybackStateCompat;
                if (zIconCompatParcelizer) {
                    getMaxFlingVelocity getmaxflingvelocity5 = getminflingvelocity.riderStatus;
                    int i14 = getmaxflingvelocity5.statusCode;
                    _get_messageWebView_lambda4 _get_messagewebview_lambda4 = _get_messageWebView_lambda3.EMPTY;
                    return new isItemDismissable(mapApiError.RemoteActionCompatParcelizer(new HttpException(getHoldoutVariationName.IconCompatParcelizer(i14, getLongEdge.RemoteActionCompatParcelizer(getmaxflingvelocity5.jsonBody.toString())))));
                }
                if (getmaxflingvelocity4.IconCompatParcelizer()) {
                    int i15 = getmaxflingvelocity4.statusCode;
                    _get_messageWebView_lambda4 _get_messagewebview_lambda5 = _get_messageWebView_lambda3.EMPTY;
                    return new isItemDismissable(mapApiError.RemoteActionCompatParcelizer(new HttpException(getHoldoutVariationName.IconCompatParcelizer(i15, getLongEdge.RemoteActionCompatParcelizer(getmaxflingvelocity4.jsonBody.toString())))));
                }
                onviewattachedtowindowlambda0Arr = new onViewAttachedToWindowlambda0[11];
                Map map = getminflingvelocity.deliveryTasks;
                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild;
                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr;
                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr;
                homeRepositoryImpl$validateAndSaveResponse$1.read = 0;
                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 0;
                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 1;
                objM4972processDeliveryTasksgIAlus = m4972processDeliveryTasksgIAlus(map, homeRepositoryImpl$validateAndSaveResponse$1);
                if (objM4972processDeliveryTasksgIAlus != obj9) {
                    getitemdecorinsetsforchild2 = getitemdecorinsetsforchild;
                    i = 0;
                    i2 = 0;
                    onviewattachedtowindowlambda0Arr2 = onviewattachedtowindowlambda0Arr;
                    onviewattachedtowindowlambda0Arr[i] = new onViewAttachedToWindowlambda0(new onItemDismiss(objM4972processDeliveryTasksgIAlus), "delivery_tasks");
                    getMaxFlingVelocity getmaxflingvelocity6 = getminflingvelocity.riderStatus;
                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 1;
                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 2;
                    objM5031invokegIAlus = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.m5031invokegIAlus(getmaxflingvelocity6, homeRepositoryImpl$validateAndSaveResponse$1);
                    if (objM5031invokegIAlus != obj9) {
                        i3 = 1;
                        onviewattachedtowindowlambda0Arr3 = onviewattachedtowindowlambda0Arr2;
                        onviewattachedtowindowlambda0Arr3[i3] = new onViewAttachedToWindowlambda0(new onItemDismiss(objM5031invokegIAlus), "rider_status");
                        getmaxflingvelocity = getminflingvelocity.instantShifts;
                        if (getmaxflingvelocity != null || !getmaxflingvelocity.IconCompatParcelizer()) {
                            instantShiftRepository = this.MediaBrowserCompatMediaItem;
                            atomicReference = instantShiftRepository.RemoteActionCompatParcelizer;
                            if (getmaxflingvelocity != null) {
                                try {
                                    resetTransientState resettransientstate = instantShiftRepository.IconCompatParcelizer;
                                    String string2 = getmaxflingvelocity.jsonBody.toString();
                                    resettransientstate.getClass();
                                    atomicReference.set((List) resettransientstate.serializer(string2, new setWasCloseMessageCalled(isRemoved.Companion.serializer(), 0)));
                                } catch (Throwable th) {
                                    isitemdismissable = new isItemDismissable(th);
                                }
                            } else {
                                atomicReference.set(instance_delegatelambda0.write);
                            }
                            break;
                        } else {
                            int i16 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 37;
                            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i16 % Fields.SpotShadowColor;
                            if (i16 % 2 != 0) {
                                IconCompatParcelizer(getmaxflingvelocity, "instant_shifts");
                                int i17 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 69;
                                r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i17 % Fields.SpotShadowColor;
                                int i18 = i17 % 2;
                            } else {
                                IconCompatParcelizer(getmaxflingvelocity, "instant_shifts");
                                obj10.hashCode();
                                throw null;
                            }
                        }
                        isitemdismissable = createfromparcel;
                        onviewattachedtowindowlambda0Arr2[2] = new onViewAttachedToWindowlambda0(new onItemDismiss(isitemdismissable), "instant_shifts");
                        getMaxFlingVelocity getmaxflingvelocity7 = getminflingvelocity.workOpportunities;
                        homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                        homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                        homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                        homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 3;
                        homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 3;
                        objM4978processWorkOpportunitiesgIAlus = m4978processWorkOpportunitiesgIAlus(getmaxflingvelocity7, homeRepositoryImpl$validateAndSaveResponse$1);
                        if (objM4978processWorkOpportunitiesgIAlus != obj9) {
                            onviewattachedtowindowlambda0Arr4 = onviewattachedtowindowlambda0Arr2;
                            obj = objM4978processWorkOpportunitiesgIAlus;
                            i4 = 3;
                            onviewattachedtowindowlambda0Arr4[i4] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj), "work_opportunities");
                            getMaxFlingVelocity getmaxflingvelocity8 = getminflingvelocity.verificationStatus;
                            homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                            homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                            homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                            homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 4;
                            homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 4;
                            objM4977processVerificationStatusgIAlus = m4977processVerificationStatusgIAlus(getmaxflingvelocity8, homeRepositoryImpl$validateAndSaveResponse$1);
                            if (objM4977processVerificationStatusgIAlus != obj9) {
                                onviewattachedtowindowlambda0Arr5 = onviewattachedtowindowlambda0Arr2;
                                obj2 = objM4977processVerificationStatusgIAlus;
                                i5 = 4;
                                onviewattachedtowindowlambda0Arr5[i5] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj2), "verification_status");
                                getMaxFlingVelocity getmaxflingvelocity9 = getminflingvelocity.heatmaps;
                                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 5;
                                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 5;
                                objM4974processHeatmapsgIAlus = m4974processHeatmapsgIAlus(getmaxflingvelocity9, homeRepositoryImpl$validateAndSaveResponse$1);
                                if (objM4974processHeatmapsgIAlus != obj9) {
                                    onviewattachedtowindowlambda0Arr6 = onviewattachedtowindowlambda0Arr2;
                                    obj3 = objM4974processHeatmapsgIAlus;
                                    i6 = 5;
                                    onviewattachedtowindowlambda0Arr6[i6] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj3), "heatmaps");
                                    getMaxFlingVelocity getmaxflingvelocity10 = getminflingvelocity.tnc;
                                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 6;
                                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 6;
                                    objM4976processTncgIAlus = m4976processTncgIAlus(getmaxflingvelocity10, homeRepositoryImpl$validateAndSaveResponse$1);
                                    if (objM4976processTncgIAlus != obj9) {
                                        int i19 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 57;
                                        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i19 % Fields.SpotShadowColor;
                                        int i20 = i19 % 2;
                                        onviewattachedtowindowlambda0Arr7 = onviewattachedtowindowlambda0Arr2;
                                        obj4 = objM4976processTncgIAlus;
                                        i7 = 6;
                                        onviewattachedtowindowlambda0Arr7[i7] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj4), "terms_and_conditions");
                                        getMaxFlingVelocity getmaxflingvelocity11 = getminflingvelocity.garnet;
                                        homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                        homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 7;
                                        homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 7;
                                        objM4973processGarnetgIAlus = m4973processGarnetgIAlus(getmaxflingvelocity11, homeRepositoryImpl$validateAndSaveResponse$1);
                                        if (objM4973processGarnetgIAlus != obj9) {
                                            onviewattachedtowindowlambda0Arr8 = onviewattachedtowindowlambda0Arr2;
                                            obj5 = objM4973processGarnetgIAlus;
                                            i8 = 7;
                                            onviewattachedtowindowlambda0Arr8[i8] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj5), "garnet");
                                            getMaxFlingVelocity getmaxflingvelocity12 = getminflingvelocity.deliveryState;
                                            homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                            homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                            homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                            homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                            homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                            homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 8;
                                            homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 8;
                                            objM4911invokegIAlus = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.m4911invokegIAlus(getmaxflingvelocity12, homeRepositoryImpl$validateAndSaveResponse$1);
                                            if (objM4911invokegIAlus == obj9) {
                                                onviewattachedtowindowlambda0Arr9 = onviewattachedtowindowlambda0Arr2;
                                                obj6 = objM4911invokegIAlus;
                                                i9 = 8;
                                                onviewattachedtowindowlambda0Arr9[i9] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj6), "delivery_state");
                                                getonflinglistener = getminflingvelocity.riderState;
                                                if (getonflinglistener != null || (requestdisallowparentintercept = getonflinglistener.components) == null) {
                                                    string = null;
                                                } else {
                                                    string = requestdisallowparentintercept.toString();
                                                }
                                                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 9;
                                                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 9;
                                                objM4975processRiderStategIAlus = m4975processRiderStategIAlus(string, homeRepositoryImpl$validateAndSaveResponse$1);
                                                if (objM4975processRiderStategIAlus != obj9) {
                                                    onviewattachedtowindowlambda0Arr10 = onviewattachedtowindowlambda0Arr2;
                                                    onviewattachedtowindowlambda0Arr11 = onviewattachedtowindowlambda0Arr10;
                                                    getminflingvelocity2 = getminflingvelocity;
                                                    getitemdecorinsetsforchild3 = getitemdecorinsetsforchild2;
                                                    obj7 = objM4975processRiderStategIAlus;
                                                    i10 = 9;
                                                    onviewattachedtowindowlambda0Arr10[i10] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj7), "rider_state");
                                                    getmaxflingvelocity2 = getminflingvelocity2.quickSessions;
                                                    if (getmaxflingvelocity2 != null || !getmaxflingvelocity2.IconCompatParcelizer()) {
                                                        if (getmaxflingvelocity2 != null) {
                                                            try {
                                                                resetTransientState resettransientstate2 = this.RatingCompat;
                                                                String string3 = getmaxflingvelocity2.jsonBody.toString();
                                                                resettransientstate2.getClass();
                                                                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = getPayloadFromSystemProperty.Companion.serializer();
                                                                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                                                                getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate2.serializer(string3, setgraphicmodalmaxwidthdpSerializer);
                                                            } catch (SerializationException e) {
                                                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to decode quick_sessions", new Object[0]);
                                                                getpayloadfromsystemproperty = null;
                                                            }
                                                        } else {
                                                            getpayloadfromsystemproperty = null;
                                                        }
                                                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                                        break;
                                                    } else {
                                                        int i21 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 33;
                                                        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i21 % Fields.SpotShadowColor;
                                                        if (i21 % 2 == 0) {
                                                            IconCompatParcelizer(getmaxflingvelocity2, "quick_sessions");
                                                            throw null;
                                                        }
                                                        IconCompatParcelizer(getmaxflingvelocity2, "quick_sessions");
                                                    }
                                                    onviewattachedtowindowlambda0Arr11[10] = new onViewAttachedToWindowlambda0(new onItemDismiss(createfromparcel), "quick_sessions");
                                                    it = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) onviewattachedtowindowlambda0Arr11).iterator();
                                                    do {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                        } else {
                                                            next = null;
                                                        }
                                                        onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                                        if (onviewattachedtowindowlambda0 == null) {
                                                            num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                                            eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                            eventMetadata.getClass();
                                                            if (num != null) {
                                                                jIntValue = num.intValue();
                                                                lValueOf = Long.valueOf(jIntValue);
                                                                if (jIntValue < 15) {
                                                                    lValueOf = null;
                                                                }
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            if (lValueOf != null) {
                                                                eventMetadata.serializer.set(lValueOf);
                                                            } else if (num != null) {
                                                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                                            }
                                                            eventMetadata.IconCompatParcelizer.set(null);
                                                            return createfromparcel;
                                                        }
                                                        return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                                    } while (!(((onItemDismiss) ((onViewAttachedToWindowlambda0) next).serializer).IconCompatParcelizer instanceof isItemDismissable));
                                                    onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                                    if (onviewattachedtowindowlambda0 == null) {
                                                        num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                                        eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                        eventMetadata.getClass();
                                                        if (num != null) {
                                                            jIntValue = num.intValue();
                                                            lValueOf = Long.valueOf(jIntValue);
                                                            if (jIntValue < 15) {
                                                                lValueOf = null;
                                                            }
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        if (lValueOf != null) {
                                                            eventMetadata.serializer.set(lValueOf);
                                                        } else if (num != null) {
                                                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                                        }
                                                        eventMetadata.IconCompatParcelizer.set(null);
                                                        return createfromparcel;
                                                    }
                                                    return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                                }
                                            } else {
                                                int i22 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 19;
                                                r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i22 % Fields.SpotShadowColor;
                                                int i23 = i22 % 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj9;
            case 1:
                i = homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer;
                i2 = homeRepositoryImpl$validateAndSaveResponse$1.read;
                onviewattachedtowindowlambda0Arr = homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat;
                onviewattachedtowindowlambda0Arr2 = homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer;
                getminflingvelocity = homeRepositoryImpl$validateAndSaveResponse$1.write;
                getitemdecorinsetsforchild2 = homeRepositoryImpl$validateAndSaveResponse$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj8);
                objM4972processDeliveryTasksgIAlus = ((onItemDismiss) obj8).IconCompatParcelizer;
                onviewattachedtowindowlambda0Arr[i] = new onViewAttachedToWindowlambda0(new onItemDismiss(objM4972processDeliveryTasksgIAlus), "delivery_tasks");
                getMaxFlingVelocity getmaxflingvelocity13 = getminflingvelocity.riderStatus;
                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 1;
                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 2;
                objM5031invokegIAlus = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.m5031invokegIAlus(getmaxflingvelocity13, homeRepositoryImpl$validateAndSaveResponse$1);
                if (objM5031invokegIAlus != obj9) {
                    i3 = 1;
                    onviewattachedtowindowlambda0Arr3 = onviewattachedtowindowlambda0Arr2;
                    onviewattachedtowindowlambda0Arr3[i3] = new onViewAttachedToWindowlambda0(new onItemDismiss(objM5031invokegIAlus), "rider_status");
                    getmaxflingvelocity = getminflingvelocity.instantShifts;
                    if (getmaxflingvelocity != null) {
                        instantShiftRepository = this.MediaBrowserCompatMediaItem;
                        atomicReference = instantShiftRepository.RemoteActionCompatParcelizer;
                        if (getmaxflingvelocity != null) {
                            resetTransientState resettransientstate3 = instantShiftRepository.IconCompatParcelizer;
                            String string4 = getmaxflingvelocity.jsonBody.toString();
                            resettransientstate3.getClass();
                            atomicReference.set((List) resettransientstate3.serializer(string4, new setWasCloseMessageCalled(isRemoved.Companion.serializer(), 0)));
                        } else {
                            atomicReference.set(instance_delegatelambda0.write);
                        }
                        isitemdismissable = createfromparcel;
                    } else {
                        instantShiftRepository = this.MediaBrowserCompatMediaItem;
                        atomicReference = instantShiftRepository.RemoteActionCompatParcelizer;
                        if (getmaxflingvelocity != null) {
                            resetTransientState resettransientstate4 = instantShiftRepository.IconCompatParcelizer;
                            String string5 = getmaxflingvelocity.jsonBody.toString();
                            resettransientstate4.getClass();
                            atomicReference.set((List) resettransientstate4.serializer(string5, new setWasCloseMessageCalled(isRemoved.Companion.serializer(), 0)));
                        } else {
                            atomicReference.set(instance_delegatelambda0.write);
                        }
                        isitemdismissable = createfromparcel;
                    }
                    onviewattachedtowindowlambda0Arr2[2] = new onViewAttachedToWindowlambda0(new onItemDismiss(isitemdismissable), "instant_shifts");
                    getMaxFlingVelocity getmaxflingvelocity14 = getminflingvelocity.workOpportunities;
                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 3;
                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 3;
                    objM4978processWorkOpportunitiesgIAlus = m4978processWorkOpportunitiesgIAlus(getmaxflingvelocity14, homeRepositoryImpl$validateAndSaveResponse$1);
                    if (objM4978processWorkOpportunitiesgIAlus != obj9) {
                        onviewattachedtowindowlambda0Arr4 = onviewattachedtowindowlambda0Arr2;
                        obj = objM4978processWorkOpportunitiesgIAlus;
                        i4 = 3;
                        onviewattachedtowindowlambda0Arr4[i4] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj), "work_opportunities");
                        getMaxFlingVelocity getmaxflingvelocity15 = getminflingvelocity.verificationStatus;
                        homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                        homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                        homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                        homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 4;
                        homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 4;
                        objM4977processVerificationStatusgIAlus = m4977processVerificationStatusgIAlus(getmaxflingvelocity15, homeRepositoryImpl$validateAndSaveResponse$1);
                        if (objM4977processVerificationStatusgIAlus != obj9) {
                            onviewattachedtowindowlambda0Arr5 = onviewattachedtowindowlambda0Arr2;
                            obj2 = objM4977processVerificationStatusgIAlus;
                            i5 = 4;
                            onviewattachedtowindowlambda0Arr5[i5] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj2), "verification_status");
                            getMaxFlingVelocity getmaxflingvelocity16 = getminflingvelocity.heatmaps;
                            homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                            homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                            homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                            homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 5;
                            homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 5;
                            objM4974processHeatmapsgIAlus = m4974processHeatmapsgIAlus(getmaxflingvelocity16, homeRepositoryImpl$validateAndSaveResponse$1);
                            if (objM4974processHeatmapsgIAlus != obj9) {
                                onviewattachedtowindowlambda0Arr6 = onviewattachedtowindowlambda0Arr2;
                                obj3 = objM4974processHeatmapsgIAlus;
                                i6 = 5;
                                onviewattachedtowindowlambda0Arr6[i6] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj3), "heatmaps");
                                getMaxFlingVelocity getmaxflingvelocity17 = getminflingvelocity.tnc;
                                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 6;
                                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 6;
                                objM4976processTncgIAlus = m4976processTncgIAlus(getmaxflingvelocity17, homeRepositoryImpl$validateAndSaveResponse$1);
                                if (objM4976processTncgIAlus != obj9) {
                                    int i110 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 57;
                                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i110 % Fields.SpotShadowColor;
                                    int i24 = i110 % 2;
                                    onviewattachedtowindowlambda0Arr7 = onviewattachedtowindowlambda0Arr2;
                                    obj4 = objM4976processTncgIAlus;
                                    i7 = 6;
                                    onviewattachedtowindowlambda0Arr7[i7] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj4), "terms_and_conditions");
                                    getMaxFlingVelocity getmaxflingvelocity18 = getminflingvelocity.garnet;
                                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 7;
                                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 7;
                                    objM4973processGarnetgIAlus = m4973processGarnetgIAlus(getmaxflingvelocity18, homeRepositoryImpl$validateAndSaveResponse$1);
                                    if (objM4973processGarnetgIAlus != obj9) {
                                        onviewattachedtowindowlambda0Arr8 = onviewattachedtowindowlambda0Arr2;
                                        obj5 = objM4973processGarnetgIAlus;
                                        i8 = 7;
                                        onviewattachedtowindowlambda0Arr8[i8] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj5), "garnet");
                                        getMaxFlingVelocity getmaxflingvelocity19 = getminflingvelocity.deliveryState;
                                        homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                        homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 8;
                                        homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 8;
                                        objM4911invokegIAlus = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.m4911invokegIAlus(getmaxflingvelocity19, homeRepositoryImpl$validateAndSaveResponse$1);
                                        if (objM4911invokegIAlus == obj9) {
                                            onviewattachedtowindowlambda0Arr9 = onviewattachedtowindowlambda0Arr2;
                                            obj6 = objM4911invokegIAlus;
                                            i9 = 8;
                                            onviewattachedtowindowlambda0Arr9[i9] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj6), "delivery_state");
                                            getonflinglistener = getminflingvelocity.riderState;
                                            if (getonflinglistener != null) {
                                                string = null;
                                            } else {
                                                string = null;
                                            }
                                            homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                            homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                            homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                            homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                            homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                            homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 9;
                                            homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 9;
                                            objM4975processRiderStategIAlus = m4975processRiderStategIAlus(string, homeRepositoryImpl$validateAndSaveResponse$1);
                                            if (objM4975processRiderStategIAlus != obj9) {
                                                onviewattachedtowindowlambda0Arr10 = onviewattachedtowindowlambda0Arr2;
                                                onviewattachedtowindowlambda0Arr11 = onviewattachedtowindowlambda0Arr10;
                                                getminflingvelocity2 = getminflingvelocity;
                                                getitemdecorinsetsforchild3 = getitemdecorinsetsforchild2;
                                                obj7 = objM4975processRiderStategIAlus;
                                                i10 = 9;
                                                onviewattachedtowindowlambda0Arr10[i10] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj7), "rider_state");
                                                getmaxflingvelocity2 = getminflingvelocity2.quickSessions;
                                                if (getmaxflingvelocity2 != null) {
                                                    if (getmaxflingvelocity2 != null) {
                                                        resetTransientState resettransientstate5 = this.RatingCompat;
                                                        String string6 = getmaxflingvelocity2.jsonBody.toString();
                                                        resettransientstate5.getClass();
                                                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer2 = getPayloadFromSystemProperty.Companion.serializer();
                                                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpSerializer2;
                                                        getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate5.serializer(string6, setgraphicmodalmaxwidthdpSerializer2);
                                                    } else {
                                                        getpayloadfromsystemproperty = null;
                                                    }
                                                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                                    break;
                                                } else {
                                                    if (getmaxflingvelocity2 != null) {
                                                        resetTransientState resettransientstate6 = this.RatingCompat;
                                                        String string7 = getmaxflingvelocity2.jsonBody.toString();
                                                        resettransientstate6.getClass();
                                                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer3 = getPayloadFromSystemProperty.Companion.serializer();
                                                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = setgraphicmodalmaxwidthdpSerializer3;
                                                        getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate6.serializer(string7, setgraphicmodalmaxwidthdpSerializer3);
                                                    } else {
                                                        getpayloadfromsystemproperty = null;
                                                    }
                                                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                                    break;
                                                }
                                                onviewattachedtowindowlambda0Arr11[10] = new onViewAttachedToWindowlambda0(new onItemDismiss(createfromparcel), "quick_sessions");
                                                it = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) onviewattachedtowindowlambda0Arr11).iterator();
                                                do {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                    } else {
                                                        next = null;
                                                    }
                                                    onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                                    if (onviewattachedtowindowlambda0 == null) {
                                                        num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                                        eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                        eventMetadata.getClass();
                                                        if (num != null) {
                                                            jIntValue = num.intValue();
                                                            lValueOf = Long.valueOf(jIntValue);
                                                            if (jIntValue < 15) {
                                                                lValueOf = null;
                                                            }
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        if (lValueOf != null) {
                                                            eventMetadata.serializer.set(lValueOf);
                                                        } else if (num != null) {
                                                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                                        }
                                                        eventMetadata.IconCompatParcelizer.set(null);
                                                        return createfromparcel;
                                                    }
                                                    return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                                } while (!(((onItemDismiss) ((onViewAttachedToWindowlambda0) next).serializer).IconCompatParcelizer instanceof isItemDismissable));
                                                onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                                if (onviewattachedtowindowlambda0 == null) {
                                                    num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                                    eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                    eventMetadata.getClass();
                                                    if (num != null) {
                                                        jIntValue = num.intValue();
                                                        lValueOf = Long.valueOf(jIntValue);
                                                        if (jIntValue < 15) {
                                                            lValueOf = null;
                                                        }
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    if (lValueOf != null) {
                                                        eventMetadata.serializer.set(lValueOf);
                                                    } else if (num != null) {
                                                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                                    }
                                                    eventMetadata.IconCompatParcelizer.set(null);
                                                    return createfromparcel;
                                                }
                                                return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                            }
                                        } else {
                                            int i25 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 19;
                                            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i25 % Fields.SpotShadowColor;
                                            int i26 = i25 % 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return obj9;
            case 2:
                i3 = homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer;
                i2 = homeRepositoryImpl$validateAndSaveResponse$1.read;
                onviewattachedtowindowlambda0Arr3 = homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat;
                onviewattachedtowindowlambda0Arr2 = homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer;
                getminflingvelocity = homeRepositoryImpl$validateAndSaveResponse$1.write;
                getitemdecorinsetsforchild2 = homeRepositoryImpl$validateAndSaveResponse$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj8);
                objM5031invokegIAlus = ((onItemDismiss) obj8).IconCompatParcelizer;
                onviewattachedtowindowlambda0Arr3[i3] = new onViewAttachedToWindowlambda0(new onItemDismiss(objM5031invokegIAlus), "rider_status");
                getmaxflingvelocity = getminflingvelocity.instantShifts;
                if (getmaxflingvelocity != null) {
                    instantShiftRepository = this.MediaBrowserCompatMediaItem;
                    atomicReference = instantShiftRepository.RemoteActionCompatParcelizer;
                    if (getmaxflingvelocity != null) {
                        resetTransientState resettransientstate7 = instantShiftRepository.IconCompatParcelizer;
                        String string8 = getmaxflingvelocity.jsonBody.toString();
                        resettransientstate7.getClass();
                        atomicReference.set((List) resettransientstate7.serializer(string8, new setWasCloseMessageCalled(isRemoved.Companion.serializer(), 0)));
                    } else {
                        atomicReference.set(instance_delegatelambda0.write);
                    }
                    isitemdismissable = createfromparcel;
                    break;
                } else {
                    instantShiftRepository = this.MediaBrowserCompatMediaItem;
                    atomicReference = instantShiftRepository.RemoteActionCompatParcelizer;
                    if (getmaxflingvelocity != null) {
                        resetTransientState resettransientstate8 = instantShiftRepository.IconCompatParcelizer;
                        String string9 = getmaxflingvelocity.jsonBody.toString();
                        resettransientstate8.getClass();
                        atomicReference.set((List) resettransientstate8.serializer(string9, new setWasCloseMessageCalled(isRemoved.Companion.serializer(), 0)));
                    } else {
                        atomicReference.set(instance_delegatelambda0.write);
                    }
                    isitemdismissable = createfromparcel;
                    break;
                }
                onviewattachedtowindowlambda0Arr2[2] = new onViewAttachedToWindowlambda0(new onItemDismiss(isitemdismissable), "instant_shifts");
                getMaxFlingVelocity getmaxflingvelocity110 = getminflingvelocity.workOpportunities;
                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 3;
                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 3;
                objM4978processWorkOpportunitiesgIAlus = m4978processWorkOpportunitiesgIAlus(getmaxflingvelocity110, homeRepositoryImpl$validateAndSaveResponse$1);
                if (objM4978processWorkOpportunitiesgIAlus != obj9) {
                    onviewattachedtowindowlambda0Arr4 = onviewattachedtowindowlambda0Arr2;
                    obj = objM4978processWorkOpportunitiesgIAlus;
                    i4 = 3;
                    onviewattachedtowindowlambda0Arr4[i4] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj), "work_opportunities");
                    getMaxFlingVelocity getmaxflingvelocity111 = getminflingvelocity.verificationStatus;
                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 4;
                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 4;
                    objM4977processVerificationStatusgIAlus = m4977processVerificationStatusgIAlus(getmaxflingvelocity111, homeRepositoryImpl$validateAndSaveResponse$1);
                    if (objM4977processVerificationStatusgIAlus != obj9) {
                        onviewattachedtowindowlambda0Arr5 = onviewattachedtowindowlambda0Arr2;
                        obj2 = objM4977processVerificationStatusgIAlus;
                        i5 = 4;
                        onviewattachedtowindowlambda0Arr5[i5] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj2), "verification_status");
                        getMaxFlingVelocity getmaxflingvelocity112 = getminflingvelocity.heatmaps;
                        homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                        homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                        homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                        homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 5;
                        homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 5;
                        objM4974processHeatmapsgIAlus = m4974processHeatmapsgIAlus(getmaxflingvelocity112, homeRepositoryImpl$validateAndSaveResponse$1);
                        if (objM4974processHeatmapsgIAlus != obj9) {
                            onviewattachedtowindowlambda0Arr6 = onviewattachedtowindowlambda0Arr2;
                            obj3 = objM4974processHeatmapsgIAlus;
                            i6 = 5;
                            onviewattachedtowindowlambda0Arr6[i6] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj3), "heatmaps");
                            getMaxFlingVelocity getmaxflingvelocity113 = getminflingvelocity.tnc;
                            homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                            homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                            homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                            homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 6;
                            homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 6;
                            objM4976processTncgIAlus = m4976processTncgIAlus(getmaxflingvelocity113, homeRepositoryImpl$validateAndSaveResponse$1);
                            if (objM4976processTncgIAlus != obj9) {
                                int i111 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 57;
                                r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i111 % Fields.SpotShadowColor;
                                int i27 = i111 % 2;
                                onviewattachedtowindowlambda0Arr7 = onviewattachedtowindowlambda0Arr2;
                                obj4 = objM4976processTncgIAlus;
                                i7 = 6;
                                onviewattachedtowindowlambda0Arr7[i7] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj4), "terms_and_conditions");
                                getMaxFlingVelocity getmaxflingvelocity114 = getminflingvelocity.garnet;
                                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 7;
                                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 7;
                                objM4973processGarnetgIAlus = m4973processGarnetgIAlus(getmaxflingvelocity114, homeRepositoryImpl$validateAndSaveResponse$1);
                                if (objM4973processGarnetgIAlus != obj9) {
                                    onviewattachedtowindowlambda0Arr8 = onviewattachedtowindowlambda0Arr2;
                                    obj5 = objM4973processGarnetgIAlus;
                                    i8 = 7;
                                    onviewattachedtowindowlambda0Arr8[i8] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj5), "garnet");
                                    getMaxFlingVelocity getmaxflingvelocity115 = getminflingvelocity.deliveryState;
                                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 8;
                                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 8;
                                    objM4911invokegIAlus = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.m4911invokegIAlus(getmaxflingvelocity115, homeRepositoryImpl$validateAndSaveResponse$1);
                                    if (objM4911invokegIAlus == obj9) {
                                        onviewattachedtowindowlambda0Arr9 = onviewattachedtowindowlambda0Arr2;
                                        obj6 = objM4911invokegIAlus;
                                        i9 = 8;
                                        onviewattachedtowindowlambda0Arr9[i9] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj6), "delivery_state");
                                        getonflinglistener = getminflingvelocity.riderState;
                                        if (getonflinglistener != null) {
                                            string = null;
                                        } else {
                                            string = null;
                                        }
                                        homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                        homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                        homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 9;
                                        homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 9;
                                        objM4975processRiderStategIAlus = m4975processRiderStategIAlus(string, homeRepositoryImpl$validateAndSaveResponse$1);
                                        if (objM4975processRiderStategIAlus != obj9) {
                                            onviewattachedtowindowlambda0Arr10 = onviewattachedtowindowlambda0Arr2;
                                            onviewattachedtowindowlambda0Arr11 = onviewattachedtowindowlambda0Arr10;
                                            getminflingvelocity2 = getminflingvelocity;
                                            getitemdecorinsetsforchild3 = getitemdecorinsetsforchild2;
                                            obj7 = objM4975processRiderStategIAlus;
                                            i10 = 9;
                                            onviewattachedtowindowlambda0Arr10[i10] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj7), "rider_state");
                                            getmaxflingvelocity2 = getminflingvelocity2.quickSessions;
                                            if (getmaxflingvelocity2 != null) {
                                                if (getmaxflingvelocity2 != null) {
                                                    resetTransientState resettransientstate9 = this.RatingCompat;
                                                    String string10 = getmaxflingvelocity2.jsonBody.toString();
                                                    resettransientstate9.getClass();
                                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer4 = getPayloadFromSystemProperty.Companion.serializer();
                                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp4 = setgraphicmodalmaxwidthdpSerializer4;
                                                    getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate9.serializer(string10, setgraphicmodalmaxwidthdpSerializer4);
                                                } else {
                                                    getpayloadfromsystemproperty = null;
                                                }
                                                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                                break;
                                            } else {
                                                if (getmaxflingvelocity2 != null) {
                                                    resetTransientState resettransientstate10 = this.RatingCompat;
                                                    String string11 = getmaxflingvelocity2.jsonBody.toString();
                                                    resettransientstate10.getClass();
                                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer5 = getPayloadFromSystemProperty.Companion.serializer();
                                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp5 = setgraphicmodalmaxwidthdpSerializer5;
                                                    getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate10.serializer(string11, setgraphicmodalmaxwidthdpSerializer5);
                                                } else {
                                                    getpayloadfromsystemproperty = null;
                                                }
                                                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                                break;
                                            }
                                            onviewattachedtowindowlambda0Arr11[10] = new onViewAttachedToWindowlambda0(new onItemDismiss(createfromparcel), "quick_sessions");
                                            it = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) onviewattachedtowindowlambda0Arr11).iterator();
                                            do {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                } else {
                                                    next = null;
                                                }
                                                onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                                if (onviewattachedtowindowlambda0 == null) {
                                                    num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                                    eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                    eventMetadata.getClass();
                                                    if (num != null) {
                                                        jIntValue = num.intValue();
                                                        lValueOf = Long.valueOf(jIntValue);
                                                        if (jIntValue < 15) {
                                                            lValueOf = null;
                                                        }
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    if (lValueOf != null) {
                                                        eventMetadata.serializer.set(lValueOf);
                                                    } else if (num != null) {
                                                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                                    }
                                                    eventMetadata.IconCompatParcelizer.set(null);
                                                    return createfromparcel;
                                                }
                                                return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                            } while (!(((onItemDismiss) ((onViewAttachedToWindowlambda0) next).serializer).IconCompatParcelizer instanceof isItemDismissable));
                                            onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                            if (onviewattachedtowindowlambda0 == null) {
                                                num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                                eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                eventMetadata.getClass();
                                                if (num != null) {
                                                    jIntValue = num.intValue();
                                                    lValueOf = Long.valueOf(jIntValue);
                                                    if (jIntValue < 15) {
                                                        lValueOf = null;
                                                    }
                                                } else {
                                                    lValueOf = null;
                                                }
                                                if (lValueOf != null) {
                                                    eventMetadata.serializer.set(lValueOf);
                                                } else if (num != null) {
                                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                                }
                                                eventMetadata.IconCompatParcelizer.set(null);
                                                return createfromparcel;
                                            }
                                            return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                        }
                                    } else {
                                        int i28 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 19;
                                        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i28 % Fields.SpotShadowColor;
                                        int i29 = i28 % 2;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj9;
            case 3:
                i4 = homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer;
                i2 = homeRepositoryImpl$validateAndSaveResponse$1.read;
                onviewattachedtowindowlambda0Arr4 = homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat;
                onviewattachedtowindowlambda0Arr2 = homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer;
                getminflingvelocity = homeRepositoryImpl$validateAndSaveResponse$1.write;
                getitemdecorinsetsforchild2 = homeRepositoryImpl$validateAndSaveResponse$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj8);
                obj = ((onItemDismiss) obj8).IconCompatParcelizer;
                onviewattachedtowindowlambda0Arr4[i4] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj), "work_opportunities");
                getMaxFlingVelocity getmaxflingvelocity116 = getminflingvelocity.verificationStatus;
                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 4;
                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 4;
                objM4977processVerificationStatusgIAlus = m4977processVerificationStatusgIAlus(getmaxflingvelocity116, homeRepositoryImpl$validateAndSaveResponse$1);
                if (objM4977processVerificationStatusgIAlus != obj9) {
                    onviewattachedtowindowlambda0Arr5 = onviewattachedtowindowlambda0Arr2;
                    obj2 = objM4977processVerificationStatusgIAlus;
                    i5 = 4;
                    onviewattachedtowindowlambda0Arr5[i5] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj2), "verification_status");
                    getMaxFlingVelocity getmaxflingvelocity117 = getminflingvelocity.heatmaps;
                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 5;
                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 5;
                    objM4974processHeatmapsgIAlus = m4974processHeatmapsgIAlus(getmaxflingvelocity117, homeRepositoryImpl$validateAndSaveResponse$1);
                    if (objM4974processHeatmapsgIAlus != obj9) {
                        onviewattachedtowindowlambda0Arr6 = onviewattachedtowindowlambda0Arr2;
                        obj3 = objM4974processHeatmapsgIAlus;
                        i6 = 5;
                        onviewattachedtowindowlambda0Arr6[i6] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj3), "heatmaps");
                        getMaxFlingVelocity getmaxflingvelocity118 = getminflingvelocity.tnc;
                        homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                        homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                        homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                        homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 6;
                        homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 6;
                        objM4976processTncgIAlus = m4976processTncgIAlus(getmaxflingvelocity118, homeRepositoryImpl$validateAndSaveResponse$1);
                        if (objM4976processTncgIAlus != obj9) {
                            int i112 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 57;
                            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i112 % Fields.SpotShadowColor;
                            int i210 = i112 % 2;
                            onviewattachedtowindowlambda0Arr7 = onviewattachedtowindowlambda0Arr2;
                            obj4 = objM4976processTncgIAlus;
                            i7 = 6;
                            onviewattachedtowindowlambda0Arr7[i7] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj4), "terms_and_conditions");
                            getMaxFlingVelocity getmaxflingvelocity119 = getminflingvelocity.garnet;
                            homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                            homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                            homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                            homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 7;
                            homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 7;
                            objM4973processGarnetgIAlus = m4973processGarnetgIAlus(getmaxflingvelocity119, homeRepositoryImpl$validateAndSaveResponse$1);
                            if (objM4973processGarnetgIAlus != obj9) {
                                onviewattachedtowindowlambda0Arr8 = onviewattachedtowindowlambda0Arr2;
                                obj5 = objM4973processGarnetgIAlus;
                                i8 = 7;
                                onviewattachedtowindowlambda0Arr8[i8] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj5), "garnet");
                                getMaxFlingVelocity getmaxflingvelocity1110 = getminflingvelocity.deliveryState;
                                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 8;
                                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 8;
                                objM4911invokegIAlus = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.m4911invokegIAlus(getmaxflingvelocity1110, homeRepositoryImpl$validateAndSaveResponse$1);
                                if (objM4911invokegIAlus == obj9) {
                                    onviewattachedtowindowlambda0Arr9 = onviewattachedtowindowlambda0Arr2;
                                    obj6 = objM4911invokegIAlus;
                                    i9 = 8;
                                    onviewattachedtowindowlambda0Arr9[i9] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj6), "delivery_state");
                                    getonflinglistener = getminflingvelocity.riderState;
                                    if (getonflinglistener != null) {
                                        string = null;
                                    } else {
                                        string = null;
                                    }
                                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 9;
                                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 9;
                                    objM4975processRiderStategIAlus = m4975processRiderStategIAlus(string, homeRepositoryImpl$validateAndSaveResponse$1);
                                    if (objM4975processRiderStategIAlus != obj9) {
                                        onviewattachedtowindowlambda0Arr10 = onviewattachedtowindowlambda0Arr2;
                                        onviewattachedtowindowlambda0Arr11 = onviewattachedtowindowlambda0Arr10;
                                        getminflingvelocity2 = getminflingvelocity;
                                        getitemdecorinsetsforchild3 = getitemdecorinsetsforchild2;
                                        obj7 = objM4975processRiderStategIAlus;
                                        i10 = 9;
                                        onviewattachedtowindowlambda0Arr10[i10] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj7), "rider_state");
                                        getmaxflingvelocity2 = getminflingvelocity2.quickSessions;
                                        if (getmaxflingvelocity2 != null) {
                                            if (getmaxflingvelocity2 != null) {
                                                resetTransientState resettransientstate11 = this.RatingCompat;
                                                String string12 = getmaxflingvelocity2.jsonBody.toString();
                                                resettransientstate11.getClass();
                                                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer6 = getPayloadFromSystemProperty.Companion.serializer();
                                                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp6 = setgraphicmodalmaxwidthdpSerializer6;
                                                getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate11.serializer(string12, setgraphicmodalmaxwidthdpSerializer6);
                                            } else {
                                                getpayloadfromsystemproperty = null;
                                            }
                                            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                            break;
                                        } else {
                                            if (getmaxflingvelocity2 != null) {
                                                resetTransientState resettransientstate12 = this.RatingCompat;
                                                String string13 = getmaxflingvelocity2.jsonBody.toString();
                                                resettransientstate12.getClass();
                                                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer7 = getPayloadFromSystemProperty.Companion.serializer();
                                                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp7 = setgraphicmodalmaxwidthdpSerializer7;
                                                getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate12.serializer(string13, setgraphicmodalmaxwidthdpSerializer7);
                                            } else {
                                                getpayloadfromsystemproperty = null;
                                            }
                                            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                            break;
                                        }
                                        onviewattachedtowindowlambda0Arr11[10] = new onViewAttachedToWindowlambda0(new onItemDismiss(createfromparcel), "quick_sessions");
                                        it = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) onviewattachedtowindowlambda0Arr11).iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                            if (onviewattachedtowindowlambda0 == null) {
                                                num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                                eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                eventMetadata.getClass();
                                                if (num != null) {
                                                    jIntValue = num.intValue();
                                                    lValueOf = Long.valueOf(jIntValue);
                                                    if (jIntValue < 15) {
                                                        lValueOf = null;
                                                    }
                                                } else {
                                                    lValueOf = null;
                                                }
                                                if (lValueOf != null) {
                                                    eventMetadata.serializer.set(lValueOf);
                                                } else if (num != null) {
                                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                                }
                                                eventMetadata.IconCompatParcelizer.set(null);
                                                return createfromparcel;
                                            }
                                            return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                        } while (!(((onItemDismiss) ((onViewAttachedToWindowlambda0) next).serializer).IconCompatParcelizer instanceof isItemDismissable));
                                        onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                        if (onviewattachedtowindowlambda0 == null) {
                                            num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                            eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                            eventMetadata.getClass();
                                            if (num != null) {
                                                jIntValue = num.intValue();
                                                lValueOf = Long.valueOf(jIntValue);
                                                if (jIntValue < 15) {
                                                    lValueOf = null;
                                                }
                                            } else {
                                                lValueOf = null;
                                            }
                                            if (lValueOf != null) {
                                                eventMetadata.serializer.set(lValueOf);
                                            } else if (num != null) {
                                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                            }
                                            eventMetadata.IconCompatParcelizer.set(null);
                                            return createfromparcel;
                                        }
                                        return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                    }
                                } else {
                                    int i211 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 19;
                                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i211 % Fields.SpotShadowColor;
                                    int i212 = i211 % 2;
                                }
                            }
                        }
                    }
                }
                return obj9;
            case 4:
                i5 = homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer;
                i2 = homeRepositoryImpl$validateAndSaveResponse$1.read;
                onviewattachedtowindowlambda0Arr5 = homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat;
                onviewattachedtowindowlambda0Arr2 = homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer;
                getminflingvelocity = homeRepositoryImpl$validateAndSaveResponse$1.write;
                getitemdecorinsetsforchild2 = homeRepositoryImpl$validateAndSaveResponse$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj8);
                obj2 = ((onItemDismiss) obj8).IconCompatParcelizer;
                onviewattachedtowindowlambda0Arr5[i5] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj2), "verification_status");
                getMaxFlingVelocity getmaxflingvelocity1111 = getminflingvelocity.heatmaps;
                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 5;
                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 5;
                objM4974processHeatmapsgIAlus = m4974processHeatmapsgIAlus(getmaxflingvelocity1111, homeRepositoryImpl$validateAndSaveResponse$1);
                if (objM4974processHeatmapsgIAlus != obj9) {
                    onviewattachedtowindowlambda0Arr6 = onviewattachedtowindowlambda0Arr2;
                    obj3 = objM4974processHeatmapsgIAlus;
                    i6 = 5;
                    onviewattachedtowindowlambda0Arr6[i6] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj3), "heatmaps");
                    getMaxFlingVelocity getmaxflingvelocity1112 = getminflingvelocity.tnc;
                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 6;
                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 6;
                    objM4976processTncgIAlus = m4976processTncgIAlus(getmaxflingvelocity1112, homeRepositoryImpl$validateAndSaveResponse$1);
                    if (objM4976processTncgIAlus != obj9) {
                        int i113 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 57;
                        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i113 % Fields.SpotShadowColor;
                        int i213 = i113 % 2;
                        onviewattachedtowindowlambda0Arr7 = onviewattachedtowindowlambda0Arr2;
                        obj4 = objM4976processTncgIAlus;
                        i7 = 6;
                        onviewattachedtowindowlambda0Arr7[i7] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj4), "terms_and_conditions");
                        getMaxFlingVelocity getmaxflingvelocity1113 = getminflingvelocity.garnet;
                        homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                        homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                        homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                        homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 7;
                        homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 7;
                        objM4973processGarnetgIAlus = m4973processGarnetgIAlus(getmaxflingvelocity1113, homeRepositoryImpl$validateAndSaveResponse$1);
                        if (objM4973processGarnetgIAlus != obj9) {
                            onviewattachedtowindowlambda0Arr8 = onviewattachedtowindowlambda0Arr2;
                            obj5 = objM4973processGarnetgIAlus;
                            i8 = 7;
                            onviewattachedtowindowlambda0Arr8[i8] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj5), "garnet");
                            getMaxFlingVelocity getmaxflingvelocity1114 = getminflingvelocity.deliveryState;
                            homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                            homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                            homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                            homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 8;
                            homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 8;
                            objM4911invokegIAlus = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.m4911invokegIAlus(getmaxflingvelocity1114, homeRepositoryImpl$validateAndSaveResponse$1);
                            if (objM4911invokegIAlus == obj9) {
                                onviewattachedtowindowlambda0Arr9 = onviewattachedtowindowlambda0Arr2;
                                obj6 = objM4911invokegIAlus;
                                i9 = 8;
                                onviewattachedtowindowlambda0Arr9[i9] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj6), "delivery_state");
                                getonflinglistener = getminflingvelocity.riderState;
                                if (getonflinglistener != null) {
                                    string = null;
                                } else {
                                    string = null;
                                }
                                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 9;
                                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 9;
                                objM4975processRiderStategIAlus = m4975processRiderStategIAlus(string, homeRepositoryImpl$validateAndSaveResponse$1);
                                if (objM4975processRiderStategIAlus != obj9) {
                                    onviewattachedtowindowlambda0Arr10 = onviewattachedtowindowlambda0Arr2;
                                    onviewattachedtowindowlambda0Arr11 = onviewattachedtowindowlambda0Arr10;
                                    getminflingvelocity2 = getminflingvelocity;
                                    getitemdecorinsetsforchild3 = getitemdecorinsetsforchild2;
                                    obj7 = objM4975processRiderStategIAlus;
                                    i10 = 9;
                                    onviewattachedtowindowlambda0Arr10[i10] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj7), "rider_state");
                                    getmaxflingvelocity2 = getminflingvelocity2.quickSessions;
                                    if (getmaxflingvelocity2 != null) {
                                        if (getmaxflingvelocity2 != null) {
                                            resetTransientState resettransientstate13 = this.RatingCompat;
                                            String string14 = getmaxflingvelocity2.jsonBody.toString();
                                            resettransientstate13.getClass();
                                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer8 = getPayloadFromSystemProperty.Companion.serializer();
                                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp8 = setgraphicmodalmaxwidthdpSerializer8;
                                            getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate13.serializer(string14, setgraphicmodalmaxwidthdpSerializer8);
                                        } else {
                                            getpayloadfromsystemproperty = null;
                                        }
                                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                        break;
                                    } else {
                                        if (getmaxflingvelocity2 != null) {
                                            resetTransientState resettransientstate14 = this.RatingCompat;
                                            String string15 = getmaxflingvelocity2.jsonBody.toString();
                                            resettransientstate14.getClass();
                                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer9 = getPayloadFromSystemProperty.Companion.serializer();
                                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp9 = setgraphicmodalmaxwidthdpSerializer9;
                                            getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate14.serializer(string15, setgraphicmodalmaxwidthdpSerializer9);
                                        } else {
                                            getpayloadfromsystemproperty = null;
                                        }
                                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                        break;
                                    }
                                    onviewattachedtowindowlambda0Arr11[10] = new onViewAttachedToWindowlambda0(new onItemDismiss(createfromparcel), "quick_sessions");
                                    it = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) onviewattachedtowindowlambda0Arr11).iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                        if (onviewattachedtowindowlambda0 == null) {
                                            num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                            eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                            eventMetadata.getClass();
                                            if (num != null) {
                                                jIntValue = num.intValue();
                                                lValueOf = Long.valueOf(jIntValue);
                                                if (jIntValue < 15) {
                                                    lValueOf = null;
                                                }
                                            } else {
                                                lValueOf = null;
                                            }
                                            if (lValueOf != null) {
                                                eventMetadata.serializer.set(lValueOf);
                                            } else if (num != null) {
                                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                            }
                                            eventMetadata.IconCompatParcelizer.set(null);
                                            return createfromparcel;
                                        }
                                        return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                    } while (!(((onItemDismiss) ((onViewAttachedToWindowlambda0) next).serializer).IconCompatParcelizer instanceof isItemDismissable));
                                    onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                    if (onviewattachedtowindowlambda0 == null) {
                                        num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                        eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                        eventMetadata.getClass();
                                        if (num != null) {
                                            jIntValue = num.intValue();
                                            lValueOf = Long.valueOf(jIntValue);
                                            if (jIntValue < 15) {
                                                lValueOf = null;
                                            }
                                        } else {
                                            lValueOf = null;
                                        }
                                        if (lValueOf != null) {
                                            eventMetadata.serializer.set(lValueOf);
                                        } else if (num != null) {
                                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                        }
                                        eventMetadata.IconCompatParcelizer.set(null);
                                        return createfromparcel;
                                    }
                                    return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                }
                            } else {
                                int i214 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 19;
                                r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i214 % Fields.SpotShadowColor;
                                int i215 = i214 % 2;
                            }
                        }
                    }
                }
                return obj9;
            case 5:
                i6 = homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer;
                i2 = homeRepositoryImpl$validateAndSaveResponse$1.read;
                onviewattachedtowindowlambda0Arr6 = homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat;
                onviewattachedtowindowlambda0Arr2 = homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer;
                getminflingvelocity = homeRepositoryImpl$validateAndSaveResponse$1.write;
                getitemdecorinsetsforchild2 = homeRepositoryImpl$validateAndSaveResponse$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj8);
                obj3 = ((onItemDismiss) obj8).IconCompatParcelizer;
                onviewattachedtowindowlambda0Arr6[i6] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj3), "heatmaps");
                getMaxFlingVelocity getmaxflingvelocity1115 = getminflingvelocity.tnc;
                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 6;
                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 6;
                objM4976processTncgIAlus = m4976processTncgIAlus(getmaxflingvelocity1115, homeRepositoryImpl$validateAndSaveResponse$1);
                if (objM4976processTncgIAlus != obj9) {
                    int i114 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 57;
                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i114 % Fields.SpotShadowColor;
                    int i216 = i114 % 2;
                    onviewattachedtowindowlambda0Arr7 = onviewattachedtowindowlambda0Arr2;
                    obj4 = objM4976processTncgIAlus;
                    i7 = 6;
                    onviewattachedtowindowlambda0Arr7[i7] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj4), "terms_and_conditions");
                    getMaxFlingVelocity getmaxflingvelocity1116 = getminflingvelocity.garnet;
                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 7;
                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 7;
                    objM4973processGarnetgIAlus = m4973processGarnetgIAlus(getmaxflingvelocity1116, homeRepositoryImpl$validateAndSaveResponse$1);
                    if (objM4973processGarnetgIAlus != obj9) {
                        onviewattachedtowindowlambda0Arr8 = onviewattachedtowindowlambda0Arr2;
                        obj5 = objM4973processGarnetgIAlus;
                        i8 = 7;
                        onviewattachedtowindowlambda0Arr8[i8] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj5), "garnet");
                        getMaxFlingVelocity getmaxflingvelocity1117 = getminflingvelocity.deliveryState;
                        homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                        homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                        homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                        homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 8;
                        homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 8;
                        objM4911invokegIAlus = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.m4911invokegIAlus(getmaxflingvelocity1117, homeRepositoryImpl$validateAndSaveResponse$1);
                        if (objM4911invokegIAlus == obj9) {
                            onviewattachedtowindowlambda0Arr9 = onviewattachedtowindowlambda0Arr2;
                            obj6 = objM4911invokegIAlus;
                            i9 = 8;
                            onviewattachedtowindowlambda0Arr9[i9] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj6), "delivery_state");
                            getonflinglistener = getminflingvelocity.riderState;
                            if (getonflinglistener != null) {
                                string = null;
                            } else {
                                string = null;
                            }
                            homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                            homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                            homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                            homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                            homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 9;
                            homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 9;
                            objM4975processRiderStategIAlus = m4975processRiderStategIAlus(string, homeRepositoryImpl$validateAndSaveResponse$1);
                            if (objM4975processRiderStategIAlus != obj9) {
                                onviewattachedtowindowlambda0Arr10 = onviewattachedtowindowlambda0Arr2;
                                onviewattachedtowindowlambda0Arr11 = onviewattachedtowindowlambda0Arr10;
                                getminflingvelocity2 = getminflingvelocity;
                                getitemdecorinsetsforchild3 = getitemdecorinsetsforchild2;
                                obj7 = objM4975processRiderStategIAlus;
                                i10 = 9;
                                onviewattachedtowindowlambda0Arr10[i10] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj7), "rider_state");
                                getmaxflingvelocity2 = getminflingvelocity2.quickSessions;
                                if (getmaxflingvelocity2 != null) {
                                    if (getmaxflingvelocity2 != null) {
                                        resetTransientState resettransientstate15 = this.RatingCompat;
                                        String string16 = getmaxflingvelocity2.jsonBody.toString();
                                        resettransientstate15.getClass();
                                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer10 = getPayloadFromSystemProperty.Companion.serializer();
                                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp10 = setgraphicmodalmaxwidthdpSerializer10;
                                        getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate15.serializer(string16, setgraphicmodalmaxwidthdpSerializer10);
                                    } else {
                                        getpayloadfromsystemproperty = null;
                                    }
                                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                    break;
                                } else {
                                    if (getmaxflingvelocity2 != null) {
                                        resetTransientState resettransientstate16 = this.RatingCompat;
                                        String string17 = getmaxflingvelocity2.jsonBody.toString();
                                        resettransientstate16.getClass();
                                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer11 = getPayloadFromSystemProperty.Companion.serializer();
                                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp11 = setgraphicmodalmaxwidthdpSerializer11;
                                        getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate16.serializer(string17, setgraphicmodalmaxwidthdpSerializer11);
                                    } else {
                                        getpayloadfromsystemproperty = null;
                                    }
                                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                    break;
                                }
                                onviewattachedtowindowlambda0Arr11[10] = new onViewAttachedToWindowlambda0(new onItemDismiss(createfromparcel), "quick_sessions");
                                it = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) onviewattachedtowindowlambda0Arr11).iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = null;
                                    }
                                    onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                    if (onviewattachedtowindowlambda0 == null) {
                                        num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                        eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                        eventMetadata.getClass();
                                        if (num != null) {
                                            jIntValue = num.intValue();
                                            lValueOf = Long.valueOf(jIntValue);
                                            if (jIntValue < 15) {
                                                lValueOf = null;
                                            }
                                        } else {
                                            lValueOf = null;
                                        }
                                        if (lValueOf != null) {
                                            eventMetadata.serializer.set(lValueOf);
                                        } else if (num != null) {
                                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                        }
                                        eventMetadata.IconCompatParcelizer.set(null);
                                        return createfromparcel;
                                    }
                                    return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                                } while (!(((onItemDismiss) ((onViewAttachedToWindowlambda0) next).serializer).IconCompatParcelizer instanceof isItemDismissable));
                                onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                if (onviewattachedtowindowlambda0 == null) {
                                    num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                    eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                    eventMetadata.getClass();
                                    if (num != null) {
                                        jIntValue = num.intValue();
                                        lValueOf = Long.valueOf(jIntValue);
                                        if (jIntValue < 15) {
                                            lValueOf = null;
                                        }
                                    } else {
                                        lValueOf = null;
                                    }
                                    if (lValueOf != null) {
                                        eventMetadata.serializer.set(lValueOf);
                                    } else if (num != null) {
                                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                    }
                                    eventMetadata.IconCompatParcelizer.set(null);
                                    return createfromparcel;
                                }
                                return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                            }
                        } else {
                            int i217 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 19;
                            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i217 % Fields.SpotShadowColor;
                            int i218 = i217 % 2;
                        }
                    }
                }
                return obj9;
            case 6:
                i7 = homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer;
                i2 = homeRepositoryImpl$validateAndSaveResponse$1.read;
                onviewattachedtowindowlambda0Arr7 = homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat;
                onviewattachedtowindowlambda0Arr2 = homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer;
                getminflingvelocity = homeRepositoryImpl$validateAndSaveResponse$1.write;
                getitemdecorinsetsforchild2 = homeRepositoryImpl$validateAndSaveResponse$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj8);
                obj4 = ((onItemDismiss) obj8).IconCompatParcelizer;
                onviewattachedtowindowlambda0Arr7[i7] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj4), "terms_and_conditions");
                getMaxFlingVelocity getmaxflingvelocity1118 = getminflingvelocity.garnet;
                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 7;
                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 7;
                objM4973processGarnetgIAlus = m4973processGarnetgIAlus(getmaxflingvelocity1118, homeRepositoryImpl$validateAndSaveResponse$1);
                if (objM4973processGarnetgIAlus != obj9) {
                    onviewattachedtowindowlambda0Arr8 = onviewattachedtowindowlambda0Arr2;
                    obj5 = objM4973processGarnetgIAlus;
                    i8 = 7;
                    onviewattachedtowindowlambda0Arr8[i8] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj5), "garnet");
                    getMaxFlingVelocity getmaxflingvelocity1119 = getminflingvelocity.deliveryState;
                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 8;
                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 8;
                    objM4911invokegIAlus = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.m4911invokegIAlus(getmaxflingvelocity1119, homeRepositoryImpl$validateAndSaveResponse$1);
                    if (objM4911invokegIAlus == obj9) {
                        onviewattachedtowindowlambda0Arr9 = onviewattachedtowindowlambda0Arr2;
                        obj6 = objM4911invokegIAlus;
                        i9 = 8;
                        onviewattachedtowindowlambda0Arr9[i9] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj6), "delivery_state");
                        getonflinglistener = getminflingvelocity.riderState;
                        if (getonflinglistener != null) {
                            string = null;
                        } else {
                            string = null;
                        }
                        homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                        homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                        homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                        homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                        homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 9;
                        homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 9;
                        objM4975processRiderStategIAlus = m4975processRiderStategIAlus(string, homeRepositoryImpl$validateAndSaveResponse$1);
                        if (objM4975processRiderStategIAlus != obj9) {
                            onviewattachedtowindowlambda0Arr10 = onviewattachedtowindowlambda0Arr2;
                            onviewattachedtowindowlambda0Arr11 = onviewattachedtowindowlambda0Arr10;
                            getminflingvelocity2 = getminflingvelocity;
                            getitemdecorinsetsforchild3 = getitemdecorinsetsforchild2;
                            obj7 = objM4975processRiderStategIAlus;
                            i10 = 9;
                            onviewattachedtowindowlambda0Arr10[i10] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj7), "rider_state");
                            getmaxflingvelocity2 = getminflingvelocity2.quickSessions;
                            if (getmaxflingvelocity2 != null) {
                                if (getmaxflingvelocity2 != null) {
                                    resetTransientState resettransientstate17 = this.RatingCompat;
                                    String string18 = getmaxflingvelocity2.jsonBody.toString();
                                    resettransientstate17.getClass();
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer12 = getPayloadFromSystemProperty.Companion.serializer();
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp12 = setgraphicmodalmaxwidthdpSerializer12;
                                    getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate17.serializer(string18, setgraphicmodalmaxwidthdpSerializer12);
                                } else {
                                    getpayloadfromsystemproperty = null;
                                }
                                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                break;
                            } else {
                                if (getmaxflingvelocity2 != null) {
                                    resetTransientState resettransientstate18 = this.RatingCompat;
                                    String string19 = getmaxflingvelocity2.jsonBody.toString();
                                    resettransientstate18.getClass();
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer13 = getPayloadFromSystemProperty.Companion.serializer();
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp13 = setgraphicmodalmaxwidthdpSerializer13;
                                    getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate18.serializer(string19, setgraphicmodalmaxwidthdpSerializer13);
                                } else {
                                    getpayloadfromsystemproperty = null;
                                }
                                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                                break;
                            }
                            onviewattachedtowindowlambda0Arr11[10] = new onViewAttachedToWindowlambda0(new onItemDismiss(createfromparcel), "quick_sessions");
                            it = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) onviewattachedtowindowlambda0Arr11).iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                                if (onviewattachedtowindowlambda0 == null) {
                                    num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                    eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                    eventMetadata.getClass();
                                    if (num != null) {
                                        jIntValue = num.intValue();
                                        lValueOf = Long.valueOf(jIntValue);
                                        if (jIntValue < 15) {
                                            lValueOf = null;
                                        }
                                    } else {
                                        lValueOf = null;
                                    }
                                    if (lValueOf != null) {
                                        eventMetadata.serializer.set(lValueOf);
                                    } else if (num != null) {
                                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                    }
                                    eventMetadata.IconCompatParcelizer.set(null);
                                    return createfromparcel;
                                }
                                return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                            } while (!(((onItemDismiss) ((onViewAttachedToWindowlambda0) next).serializer).IconCompatParcelizer instanceof isItemDismissable));
                            onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                            if (onviewattachedtowindowlambda0 == null) {
                                num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                eventMetadata.getClass();
                                if (num != null) {
                                    jIntValue = num.intValue();
                                    lValueOf = Long.valueOf(jIntValue);
                                    if (jIntValue < 15) {
                                        lValueOf = null;
                                    }
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf != null) {
                                    eventMetadata.serializer.set(lValueOf);
                                } else if (num != null) {
                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                }
                                eventMetadata.IconCompatParcelizer.set(null);
                                return createfromparcel;
                            }
                            return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                        }
                    } else {
                        int i219 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 19;
                        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i219 % Fields.SpotShadowColor;
                        int i2110 = i219 % 2;
                    }
                }
                return obj9;
            case 7:
                i8 = homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer;
                i2 = homeRepositoryImpl$validateAndSaveResponse$1.read;
                onviewattachedtowindowlambda0Arr8 = homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat;
                onviewattachedtowindowlambda0Arr2 = homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer;
                getminflingvelocity = homeRepositoryImpl$validateAndSaveResponse$1.write;
                getitemdecorinsetsforchild2 = homeRepositoryImpl$validateAndSaveResponse$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj8);
                obj5 = ((onItemDismiss) obj8).IconCompatParcelizer;
                onviewattachedtowindowlambda0Arr8[i8] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj5), "garnet");
                getMaxFlingVelocity getmaxflingvelocity11110 = getminflingvelocity.deliveryState;
                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 8;
                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 8;
                objM4911invokegIAlus = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.m4911invokegIAlus(getmaxflingvelocity11110, homeRepositoryImpl$validateAndSaveResponse$1);
                if (objM4911invokegIAlus == obj9) {
                    onviewattachedtowindowlambda0Arr9 = onviewattachedtowindowlambda0Arr2;
                    obj6 = objM4911invokegIAlus;
                    i9 = 8;
                    onviewattachedtowindowlambda0Arr9[i9] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj6), "delivery_state");
                    getonflinglistener = getminflingvelocity.riderState;
                    if (getonflinglistener != null) {
                        string = null;
                    } else {
                        string = null;
                    }
                    homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                    homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                    homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                    homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                    homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 9;
                    homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 9;
                    objM4975processRiderStategIAlus = m4975processRiderStategIAlus(string, homeRepositoryImpl$validateAndSaveResponse$1);
                    if (objM4975processRiderStategIAlus != obj9) {
                        onviewattachedtowindowlambda0Arr10 = onviewattachedtowindowlambda0Arr2;
                        onviewattachedtowindowlambda0Arr11 = onviewattachedtowindowlambda0Arr10;
                        getminflingvelocity2 = getminflingvelocity;
                        getitemdecorinsetsforchild3 = getitemdecorinsetsforchild2;
                        obj7 = objM4975processRiderStategIAlus;
                        i10 = 9;
                        onviewattachedtowindowlambda0Arr10[i10] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj7), "rider_state");
                        getmaxflingvelocity2 = getminflingvelocity2.quickSessions;
                        if (getmaxflingvelocity2 != null) {
                            if (getmaxflingvelocity2 != null) {
                                resetTransientState resettransientstate19 = this.RatingCompat;
                                String string110 = getmaxflingvelocity2.jsonBody.toString();
                                resettransientstate19.getClass();
                                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer14 = getPayloadFromSystemProperty.Companion.serializer();
                                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp14 = setgraphicmodalmaxwidthdpSerializer14;
                                getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate19.serializer(string110, setgraphicmodalmaxwidthdpSerializer14);
                            } else {
                                getpayloadfromsystemproperty = null;
                            }
                            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                            break;
                        } else {
                            if (getmaxflingvelocity2 != null) {
                                resetTransientState resettransientstate110 = this.RatingCompat;
                                String string111 = getmaxflingvelocity2.jsonBody.toString();
                                resettransientstate110.getClass();
                                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer15 = getPayloadFromSystemProperty.Companion.serializer();
                                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp15 = setgraphicmodalmaxwidthdpSerializer15;
                                getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate110.serializer(string111, setgraphicmodalmaxwidthdpSerializer15);
                            } else {
                                getpayloadfromsystemproperty = null;
                            }
                            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                            break;
                        }
                        onviewattachedtowindowlambda0Arr11[10] = new onViewAttachedToWindowlambda0(new onItemDismiss(createfromparcel), "quick_sessions");
                        it = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) onviewattachedtowindowlambda0Arr11).iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                            if (onviewattachedtowindowlambda0 == null) {
                                num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                                eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                eventMetadata.getClass();
                                if (num != null) {
                                    jIntValue = num.intValue();
                                    lValueOf = Long.valueOf(jIntValue);
                                    if (jIntValue < 15) {
                                        lValueOf = null;
                                    }
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf != null) {
                                    eventMetadata.serializer.set(lValueOf);
                                } else if (num != null) {
                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                                }
                                eventMetadata.IconCompatParcelizer.set(null);
                                return createfromparcel;
                            }
                            return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                        } while (!(((onItemDismiss) ((onViewAttachedToWindowlambda0) next).serializer).IconCompatParcelizer instanceof isItemDismissable));
                        onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                        if (onviewattachedtowindowlambda0 == null) {
                            num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                            eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                            eventMetadata.getClass();
                            if (num != null) {
                                jIntValue = num.intValue();
                                lValueOf = Long.valueOf(jIntValue);
                                if (jIntValue < 15) {
                                    lValueOf = null;
                                }
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                eventMetadata.serializer.set(lValueOf);
                            } else if (num != null) {
                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                            }
                            eventMetadata.IconCompatParcelizer.set(null);
                            return createfromparcel;
                        }
                        return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                    }
                } else {
                    int i2111 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 19;
                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i2111 % Fields.SpotShadowColor;
                    int i2112 = i2111 % 2;
                }
                return obj9;
            case 8:
                i9 = homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer;
                i2 = homeRepositoryImpl$validateAndSaveResponse$1.read;
                onviewattachedtowindowlambda0Arr9 = homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat;
                onviewattachedtowindowlambda0Arr2 = homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer;
                getminflingvelocity = homeRepositoryImpl$validateAndSaveResponse$1.write;
                getitemdecorinsetsforchild2 = homeRepositoryImpl$validateAndSaveResponse$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj8);
                obj6 = ((onItemDismiss) obj8).IconCompatParcelizer;
                onviewattachedtowindowlambda0Arr9[i9] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj6), "delivery_state");
                getonflinglistener = getminflingvelocity.riderState;
                if (getonflinglistener != null) {
                    string = null;
                } else {
                    string = null;
                }
                homeRepositoryImpl$validateAndSaveResponse$1.serializer = getitemdecorinsetsforchild2;
                homeRepositoryImpl$validateAndSaveResponse$1.write = getminflingvelocity;
                homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat = onviewattachedtowindowlambda0Arr2;
                homeRepositoryImpl$validateAndSaveResponse$1.read = i2;
                homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer = 9;
                homeRepositoryImpl$validateAndSaveResponse$1.MediaDescriptionCompat = 9;
                objM4975processRiderStategIAlus = m4975processRiderStategIAlus(string, homeRepositoryImpl$validateAndSaveResponse$1);
                if (objM4975processRiderStategIAlus != obj9) {
                    onviewattachedtowindowlambda0Arr10 = onviewattachedtowindowlambda0Arr2;
                    onviewattachedtowindowlambda0Arr11 = onviewattachedtowindowlambda0Arr10;
                    getminflingvelocity2 = getminflingvelocity;
                    getitemdecorinsetsforchild3 = getitemdecorinsetsforchild2;
                    obj7 = objM4975processRiderStategIAlus;
                    i10 = 9;
                    onviewattachedtowindowlambda0Arr10[i10] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj7), "rider_state");
                    getmaxflingvelocity2 = getminflingvelocity2.quickSessions;
                    if (getmaxflingvelocity2 != null) {
                        if (getmaxflingvelocity2 != null) {
                            resetTransientState resettransientstate111 = this.RatingCompat;
                            String string112 = getmaxflingvelocity2.jsonBody.toString();
                            resettransientstate111.getClass();
                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer16 = getPayloadFromSystemProperty.Companion.serializer();
                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp16 = setgraphicmodalmaxwidthdpSerializer16;
                            getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate111.serializer(string112, setgraphicmodalmaxwidthdpSerializer16);
                        } else {
                            getpayloadfromsystemproperty = null;
                        }
                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                        break;
                    } else {
                        if (getmaxflingvelocity2 != null) {
                            resetTransientState resettransientstate112 = this.RatingCompat;
                            String string113 = getmaxflingvelocity2.jsonBody.toString();
                            resettransientstate112.getClass();
                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer17 = getPayloadFromSystemProperty.Companion.serializer();
                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp17 = setgraphicmodalmaxwidthdpSerializer17;
                            getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate112.serializer(string113, setgraphicmodalmaxwidthdpSerializer17);
                        } else {
                            getpayloadfromsystemproperty = null;
                        }
                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                        break;
                    }
                    onviewattachedtowindowlambda0Arr11[10] = new onViewAttachedToWindowlambda0(new onItemDismiss(createfromparcel), "quick_sessions");
                    it = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) onviewattachedtowindowlambda0Arr11).iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                        if (onviewattachedtowindowlambda0 == null) {
                            num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                            eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                            eventMetadata.getClass();
                            if (num != null) {
                                jIntValue = num.intValue();
                                lValueOf = Long.valueOf(jIntValue);
                                if (jIntValue < 15) {
                                    lValueOf = null;
                                }
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                eventMetadata.serializer.set(lValueOf);
                            } else if (num != null) {
                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                            }
                            eventMetadata.IconCompatParcelizer.set(null);
                            return createfromparcel;
                        }
                        return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                    } while (!(((onItemDismiss) ((onViewAttachedToWindowlambda0) next).serializer).IconCompatParcelizer instanceof isItemDismissable));
                    onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                    if (onviewattachedtowindowlambda0 == null) {
                        num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                        eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                        eventMetadata.getClass();
                        if (num != null) {
                            jIntValue = num.intValue();
                            lValueOf = Long.valueOf(jIntValue);
                            if (jIntValue < 15) {
                                lValueOf = null;
                            }
                        } else {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            eventMetadata.serializer.set(lValueOf);
                        } else if (num != null) {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                        }
                        eventMetadata.IconCompatParcelizer.set(null);
                        return createfromparcel;
                    }
                    return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                }
                return obj9;
            case 9:
                i10 = homeRepositoryImpl$validateAndSaveResponse$1.IconCompatParcelizer;
                onviewattachedtowindowlambda0Arr10 = homeRepositoryImpl$validateAndSaveResponse$1.RatingCompat;
                onviewattachedtowindowlambda0Arr11 = homeRepositoryImpl$validateAndSaveResponse$1.RemoteActionCompatParcelizer;
                getminflingvelocity2 = homeRepositoryImpl$validateAndSaveResponse$1.write;
                getitemdecorinsetsforchild3 = homeRepositoryImpl$validateAndSaveResponse$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj8);
                obj7 = ((onItemDismiss) obj8).IconCompatParcelizer;
                onviewattachedtowindowlambda0Arr10[i10] = new onViewAttachedToWindowlambda0(new onItemDismiss(obj7), "rider_state");
                getmaxflingvelocity2 = getminflingvelocity2.quickSessions;
                if (getmaxflingvelocity2 != null) {
                    if (getmaxflingvelocity2 != null) {
                        resetTransientState resettransientstate113 = this.RatingCompat;
                        String string114 = getmaxflingvelocity2.jsonBody.toString();
                        resettransientstate113.getClass();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer18 = getPayloadFromSystemProperty.Companion.serializer();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp18 = setgraphicmodalmaxwidthdpSerializer18;
                        getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate113.serializer(string114, setgraphicmodalmaxwidthdpSerializer18);
                    } else {
                        getpayloadfromsystemproperty = null;
                    }
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                    break;
                } else {
                    if (getmaxflingvelocity2 != null) {
                        resetTransientState resettransientstate114 = this.RatingCompat;
                        String string115 = getmaxflingvelocity2.jsonBody.toString();
                        resettransientstate114.getClass();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer19 = getPayloadFromSystemProperty.Companion.serializer();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp19 = setgraphicmodalmaxwidthdpSerializer19;
                        getpayloadfromsystemproperty = (getPayloadFromSystemProperty) resettransientstate114.serializer(string115, setgraphicmodalmaxwidthdpSerializer19);
                    } else {
                        getpayloadfromsystemproperty = null;
                    }
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer.IconCompatParcelizer(getpayloadfromsystemproperty);
                    break;
                }
                onviewattachedtowindowlambda0Arr11[10] = new onViewAttachedToWindowlambda0(new onItemDismiss(createfromparcel), "quick_sessions");
                it = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) onviewattachedtowindowlambda0Arr11).iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                    if (onviewattachedtowindowlambda0 == null) {
                        num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                        eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                        eventMetadata.getClass();
                        if (num != null) {
                            jIntValue = num.intValue();
                            lValueOf = Long.valueOf(jIntValue);
                            if (jIntValue < 15) {
                                lValueOf = null;
                            }
                        } else {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            eventMetadata.serializer.set(lValueOf);
                        } else if (num != null) {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                        }
                        eventMetadata.IconCompatParcelizer.set(null);
                        return createfromparcel;
                    }
                    return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
                } while (!(((onItemDismiss) ((onViewAttachedToWindowlambda0) next).serializer).IconCompatParcelizer instanceof isItemDismissable));
                onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
                if (onviewattachedtowindowlambda0 == null) {
                    num = getitemdecorinsetsforchild3.nextRefreshInSeconds;
                    eventMetadata = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    eventMetadata.getClass();
                    if (num != null) {
                        jIntValue = num.intValue();
                        lValueOf = Long.valueOf(jIntValue);
                        if (jIntValue < 15) {
                            lValueOf = null;
                        }
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        eventMetadata.serializer.set(lValueOf);
                    } else if (num != null) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SmartPolling: server interval " + num + "s rejected (below minimum 15s)", new Object[0]);
                    }
                    eventMetadata.IconCompatParcelizer.set(null);
                    return createfromparcel;
                }
                return new isItemDismissable(new HomeItemValidationException((String) onviewattachedtowindowlambda0.write, onItemDismiss.serializer(((onItemDismiss) onviewattachedtowindowlambda0.serializer).IconCompatParcelizer)));
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
