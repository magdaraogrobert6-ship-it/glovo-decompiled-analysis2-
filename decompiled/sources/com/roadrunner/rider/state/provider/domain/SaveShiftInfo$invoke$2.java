package com.roadrunner.rider.state.provider.domain;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appreview.AppReviewLifecycleObserverImpl;
import com.roadrunner.bubble.presentation.GetBubbleUiState;
import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import com.roadrunner.opportunities.map.OpportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.permission.location.permission.LocationPermissionLifecycleHandler;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.domain.GetRiderStateImpl$invoke$1;
import com.roadrunner.rider.state.futureshift.presentation.FutureShiftUiModelImpl;
import com.roadrunner.rider.state.futureshift.presentation.GetFutureShiftUiState;
import com.roadrunner.rider.state.offertowork.presentation.GetOfferToWorkUiState;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkUiModelImpl;
import com.roadrunner.rider.state.ondemand.presentation.GetOnDemandUiState;
import com.roadrunner.rider.state.ondemand.presentation.OnDemandUiModelImpl;
import com.roadrunner.rider.state.provider.database.dao.ShiftInfoDao;
import com.roadrunner.rider.state.provider.database.dao.WorkOpportunityDao;
import com.roadrunner.sidemenu.data.SideMenuRepository;
import io.sentry.CombinedScopeView;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.reactive.FlowSubscription$consumeFlow$2;
import o.C;
import o.DrawableTransformation;
import o.GooglePlayServicesClientGooglePlayServicesInterface;
import o.IActivityHandler;
import o.IRunActivityHandler;
import o.InstallReferrer;
import o.Logger;
import o.OnAdidReadListener;
import o.OnAttributionChangedListener;
import o.OnEventTrackingSucceededListener;
import o.OnGoogleAdIdReadListener;
import o.OnGooglePlayInstallReferrerReadListener;
import o.OnIsEnabledListener;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessisRenderNodeCompatiblecp;
import o.addGlobalCallbackParameterI;
import o.asBinder;
import o.createFromParcel;
import o.debug;
import o.dh;
import o.e5;
import o.ec;
import o.endFirstSessionDelay;
import o.extractAuthorizationHeader;
import o.f5ExternalSyntheticLambda4;
import o.f8;
import o.g6;
import o.getAndroidLogLevel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getInstallBeginTimestampSeconds;
import o.getSignedData;
import o.isVerticalSwipeInAllowedDirection;
import o.lockLogLevel;
import o.onThirdPartySharingSettingsRead;
import o.pauseWebviewIfNecessarylambda10;
import o.pickChildForBackwardSearch;
import o.qdExternalSyntheticLambda8;
import o.r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U;
import o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.resolveClass;
import o.runInTransaction;
import o.sendPreinstallPayload;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;
import o.updateAdidI;
import o.vg;
import o.warn;
import o.x1;
import o.x5;
import o.x7;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SaveShiftInfo$invoke$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveShiftInfo$invoke$2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.read = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveShiftInfo$invoke$2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024 A[PHI: r3
  0x0024: PHI (r3v39 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0030 A[PHI: r3
  0x0030: PHI (r3v37 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b A[PHI: r3
  0x004b: PHI (r3v35 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[PHI: r3
  0x0057: PHI (r3v33 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[PHI: r3
  0x0063: PHI (r3v31 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0071 A[PHI: r3
  0x0071: PHI (r3v29 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[PHI: r3
  0x007f: PHI (r3v27 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x008d A[PHI: r3
  0x008d: PHI (r3v25 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009b A[PHI: r3
  0x009b: PHI (r3v23 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9 A[PHI: r3
  0x00a9: PHI (r3v21 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5 A[PHI: r3
  0x00b5: PHI (r3v19 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3 A[PHI: r3
  0x00c3: PHI (r3v17 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0 A[PHI: r3
  0x00d0: PHI (r3v15 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd A[PHI: r3
  0x00dd: PHI (r3v13 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea A[PHI: r3
  0x00ea: PHI (r3v11 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7 A[PHI: r3
  0x00f7: PHI (r3v9 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0102 A[PHI: r3
  0x0102: PHI (r3v7 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x010e A[PHI: r3
  0x010e: PHI (r3v5 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x011b A[PHI: r3
  0x011b: PHI (r3v3 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0127 A[PHI: r3
  0x0127: PHI (r3v1 java.lang.Object) = (r3v0 java.lang.Object), (r3v41 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object obj2;
        SaveShiftInfo$invoke$2 saveShiftInfo$invoke$2;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = RatingCompat + 73;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = 0;
        if (i4 % 2 == 0) {
            int i6 = this.RemoteActionCompatParcelizer;
            obj2 = this.read;
            switch (i6) {
                case 0:
                    return new SaveShiftInfo$invoke$2((onThirdPartySharingSettingsRead) this.write, (warn) obj2, shortNewsContentCardView, i5);
                case 1:
                    return new SaveShiftInfo$invoke$2((C) this.write, (f8) obj2, shortNewsContentCardView, 1);
                case 2:
                    return new SaveShiftInfo$invoke$2((ec) this.write, (dh) obj2, shortNewsContentCardView, i2);
                case 3:
                    SaveShiftInfo$invoke$2 saveShiftInfo$invoke$3 = new SaveShiftInfo$invoke$2((SafeAreaPublisherImpl) obj2, shortNewsContentCardView, 3);
                    saveShiftInfo$invoke$3.write = obj;
                    return saveShiftInfo$invoke$3;
                case 4:
                    return new SaveShiftInfo$invoke$2((qdExternalSyntheticLambda8) this.write, (Network) obj2, shortNewsContentCardView, 4);
                case 5:
                    return new SaveShiftInfo$invoke$2((CombinedScopeView) this.write, (x5) obj2, shortNewsContentCardView, 5);
                case 6:
                    return new SaveShiftInfo$invoke$2((AppReviewLifecycleObserverImpl) this.write, (getContentViewGroupParentLayout) obj2, shortNewsContentCardView, 6);
                case 7:
                    return new SaveShiftInfo$invoke$2((accessisRenderNodeCompatiblecp) this.write, (VerificationStatusLifecycleObserverImpl) obj2, shortNewsContentCardView, 7);
                case 8:
                    return new SaveShiftInfo$invoke$2((accessisRenderNodeCompatiblecp) this.write, (LocationPermissionLifecycleHandler) obj2, shortNewsContentCardView, 8);
                case 9:
                    SaveShiftInfo$invoke$2 saveShiftInfo$invoke$4 = new SaveShiftInfo$invoke$2((addGlobalCallbackParameterI) obj2, shortNewsContentCardView, 9);
                    saveShiftInfo$invoke$4.write = obj;
                    return saveShiftInfo$invoke$4;
                case 10:
                    return new SaveShiftInfo$invoke$2((endFirstSessionDelay) this.write, (Map) obj2, shortNewsContentCardView, 10);
                case 11:
                    return new SaveShiftInfo$invoke$2((GetFutureShiftUiState) this.write, (FutureShiftUiModelImpl) obj2, shortNewsContentCardView, 11);
                case 12:
                    return new SaveShiftInfo$invoke$2((GetOfferToWorkUiState) this.write, (OfferToWorkUiModelImpl) obj2, shortNewsContentCardView, 12);
                case 13:
                    return new SaveShiftInfo$invoke$2((GetOnDemandUiState) this.write, (OnDemandUiModelImpl) obj2, shortNewsContentCardView, 13);
                case 14:
                    return new SaveShiftInfo$invoke$2((asBinder) this.write, (OnIsEnabledListener) obj2, shortNewsContentCardView, 14);
                case 15:
                    SaveShiftInfo$invoke$2 saveShiftInfo$invoke$5 = new SaveShiftInfo$invoke$2((asBinder) obj2, shortNewsContentCardView, 15);
                    saveShiftInfo$invoke$5.write = obj;
                    return saveShiftInfo$invoke$5;
                case 16:
                    SaveShiftInfo$invoke$2 saveShiftInfo$invoke$6 = new SaveShiftInfo$invoke$2((IActivityHandler) obj2, shortNewsContentCardView, 16);
                    saveShiftInfo$invoke$6.write = obj;
                    return saveShiftInfo$invoke$6;
                case 17:
                    saveShiftInfo$invoke$2 = new SaveShiftInfo$invoke$2((IActivityHandler) this.write, (List) obj2, shortNewsContentCardView, 17);
                    i = IconCompatParcelizer + 45;
                    RatingCompat = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        return saveShiftInfo$invoke$2;
                    }
                    throw null;
                case 18:
                    SaveShiftInfo$invoke$2 saveShiftInfo$invoke$7 = new SaveShiftInfo$invoke$2((GetShiftInfoImpl) obj2, shortNewsContentCardView, 18);
                    saveShiftInfo$invoke$7.write = obj;
                    return saveShiftInfo$invoke$7;
                default:
                    SaveShiftInfo$invoke$2 saveShiftInfo$invoke$8 = new SaveShiftInfo$invoke$2((SideMenuRepository) obj2, shortNewsContentCardView, 19);
                    saveShiftInfo$invoke$8.write = obj;
                    return saveShiftInfo$invoke$8;
            }
        }
        int i7 = this.RemoteActionCompatParcelizer;
        obj2 = this.read;
        int i8 = 21 / 0;
        switch (i7) {
            case 0:
                return new SaveShiftInfo$invoke$2((onThirdPartySharingSettingsRead) this.write, (warn) obj2, shortNewsContentCardView, i5);
            case 1:
                return new SaveShiftInfo$invoke$2((C) this.write, (f8) obj2, shortNewsContentCardView, 1);
            case 2:
                return new SaveShiftInfo$invoke$2((ec) this.write, (dh) obj2, shortNewsContentCardView, i2);
            case 3:
                SaveShiftInfo$invoke$2 saveShiftInfo$invoke$9 = new SaveShiftInfo$invoke$2((SafeAreaPublisherImpl) obj2, shortNewsContentCardView, 3);
                saveShiftInfo$invoke$9.write = obj;
                return saveShiftInfo$invoke$9;
            case 4:
                return new SaveShiftInfo$invoke$2((qdExternalSyntheticLambda8) this.write, (Network) obj2, shortNewsContentCardView, 4);
            case 5:
                return new SaveShiftInfo$invoke$2((CombinedScopeView) this.write, (x5) obj2, shortNewsContentCardView, 5);
            case 6:
                return new SaveShiftInfo$invoke$2((AppReviewLifecycleObserverImpl) this.write, (getContentViewGroupParentLayout) obj2, shortNewsContentCardView, 6);
            case 7:
                return new SaveShiftInfo$invoke$2((accessisRenderNodeCompatiblecp) this.write, (VerificationStatusLifecycleObserverImpl) obj2, shortNewsContentCardView, 7);
            case 8:
                return new SaveShiftInfo$invoke$2((accessisRenderNodeCompatiblecp) this.write, (LocationPermissionLifecycleHandler) obj2, shortNewsContentCardView, 8);
            case 9:
                SaveShiftInfo$invoke$2 saveShiftInfo$invoke$10 = new SaveShiftInfo$invoke$2((addGlobalCallbackParameterI) obj2, shortNewsContentCardView, 9);
                saveShiftInfo$invoke$10.write = obj;
                return saveShiftInfo$invoke$10;
            case 10:
                return new SaveShiftInfo$invoke$2((endFirstSessionDelay) this.write, (Map) obj2, shortNewsContentCardView, 10);
            case 11:
                return new SaveShiftInfo$invoke$2((GetFutureShiftUiState) this.write, (FutureShiftUiModelImpl) obj2, shortNewsContentCardView, 11);
            case 12:
                return new SaveShiftInfo$invoke$2((GetOfferToWorkUiState) this.write, (OfferToWorkUiModelImpl) obj2, shortNewsContentCardView, 12);
            case 13:
                return new SaveShiftInfo$invoke$2((GetOnDemandUiState) this.write, (OnDemandUiModelImpl) obj2, shortNewsContentCardView, 13);
            case 14:
                return new SaveShiftInfo$invoke$2((asBinder) this.write, (OnIsEnabledListener) obj2, shortNewsContentCardView, 14);
            case 15:
                SaveShiftInfo$invoke$2 saveShiftInfo$invoke$11 = new SaveShiftInfo$invoke$2((asBinder) obj2, shortNewsContentCardView, 15);
                saveShiftInfo$invoke$11.write = obj;
                return saveShiftInfo$invoke$11;
            case 16:
                SaveShiftInfo$invoke$2 saveShiftInfo$invoke$12 = new SaveShiftInfo$invoke$2((IActivityHandler) obj2, shortNewsContentCardView, 16);
                saveShiftInfo$invoke$12.write = obj;
                return saveShiftInfo$invoke$12;
            case 17:
                saveShiftInfo$invoke$2 = new SaveShiftInfo$invoke$2((IActivityHandler) this.write, (List) obj2, shortNewsContentCardView, 17);
                i = IconCompatParcelizer + 45;
                RatingCompat = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    return saveShiftInfo$invoke$2;
                }
                throw null;
            case 18:
                SaveShiftInfo$invoke$2 saveShiftInfo$invoke$13 = new SaveShiftInfo$invoke$2((GetShiftInfoImpl) obj2, shortNewsContentCardView, 18);
                saveShiftInfo$invoke$13.write = obj;
                return saveShiftInfo$invoke$13;
            default:
                SaveShiftInfo$invoke$2 saveShiftInfo$invoke$14 = new SaveShiftInfo$invoke$2((SideMenuRepository) obj2, shortNewsContentCardView, 19);
                saveShiftInfo$invoke$14.write = obj;
                return saveShiftInfo$invoke$14;
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        switch (i3) {
            case 0:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 1:
                Object objInvokeSuspend = ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                int i4 = RatingCompat + 79;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            case 2:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 3:
                return ((SaveShiftInfo$invoke$2) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 4:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 5:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 6:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 7:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 8:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 9:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 10:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 11:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 12:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 13:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 14:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 15:
                return ((SaveShiftInfo$invoke$2) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 16:
                return ((SaveShiftInfo$invoke$2) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 17:
                return ((SaveShiftInfo$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 18:
                return ((SaveShiftInfo$invoke$2) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            default:
                return ((SaveShiftInfo$invoke$2) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        createFromParcel createfromparcel;
        ArrayList arrayList;
        onThirdPartySharingSettingsRead onthirdpartysharingsettingsread;
        OnGoogleAdIdReadListener onGoogleAdIdReadListener;
        String strRemoteActionCompatParcelizer;
        Flow getMapScope$invoke$$inlined$map$1;
        Object objInvoke$implementation;
        Object objInvoke;
        Object objInvoke2;
        Object obj2;
        Object objValueOf;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj3 = this.read;
        int i4 = 8;
        int i5 = 4;
        int i6 = 9;
        int i7 = 3;
        int i8 = 10;
        Object[] objArr = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i3) {
            case 0:
                onThirdPartySharingSettingsRead onthirdpartysharingsettingsread2 = (onThirdPartySharingSettingsRead) this.write;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.serializer;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                lockLogLevel lockloglevel = ((warn) obj3).courier;
                lockloglevel.getClass();
                long j = lockloglevel.id;
                String str = lockloglevel.status;
                String str2 = lockloglevel.zone;
                String str3 = lockloglevel.city;
                int i10 = lockloglevel.cityId;
                String str4 = lockloglevel.contractType;
                String str5 = lockloglevel.statusEndingTime;
                GregorianCalendar gregorianCalendarWrite = str5 != null ? runInTransaction.write(str5) : null;
                Boolean bool = lockloglevel.isEndBreakAllowed;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = lockloglevel.isBreakScheduled;
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool3 = lockloglevel.canExtendShift;
                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = lockloglevel.agreedToExtendCurrentShift;
                boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                List list = lockloglevel.shifts;
                if (list != null) {
                    List<InstallReferrer> list2 = list;
                    ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                    for (InstallReferrer installReferrer : list2) {
                        int i11 = RatingCompat + 101;
                        createFromParcel createfromparcel3 = createfromparcel2;
                        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % i;
                        long jMediaBrowserCompatMediaItem = installReferrer.MediaBrowserCompatMediaItem();
                        long j2 = installReferrer.MediaDescriptionCompat().read();
                        long jMediaSessionCompatQueueItem = installReferrer.MediaSessionCompatQueueItem();
                        String strIconCompatParcelizer = installReferrer.MediaDescriptionCompat().RemoteActionCompatParcelizer().IconCompatParcelizer();
                        GregorianCalendar gregorianCalendarWrite2 = runInTransaction.write((String) InstallReferrer.RemoteActionCompatParcelizer(835465541, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), new Object[]{installReferrer}, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), -835465540));
                        GregorianCalendar gregorianCalendarWrite3 = runInTransaction.write(installReferrer.write());
                        String str6 = (String) InstallReferrer.RemoteActionCompatParcelizer(589302202, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), new Object[]{installReferrer}, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), -589302202);
                        List listIconCompatParcelizer = installReferrer.IconCompatParcelizer();
                        Boolean bool5 = installReferrer.read();
                        IRunActivityHandler iRunActivityHandlerMediaMetadataCompat = installReferrer.MediaMetadataCompat();
                        boolean zBooleanValue5 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{iRunActivityHandlerMediaMetadataCompat != null ? iRunActivityHandlerMediaMetadataCompat.serializer() : null, "go_and_start"}, getCieXyz.write())).booleanValue();
                        debug debugVarIconCompatParcelizer = installReferrer.MediaDescriptionCompat().IconCompatParcelizer();
                        if (debugVarIconCompatParcelizer != null) {
                            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                            isverticalswipeinalloweddirection.getClass();
                            strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(debug.Companion.serializer(), debugVarIconCompatParcelizer);
                        } else {
                            strRemoteActionCompatParcelizer = null;
                        }
                        arrayList2.add(new OnGooglePlayInstallReferrerReadListener(Long.valueOf(jMediaBrowserCompatMediaItem), Long.valueOf(j2), Long.valueOf(jMediaSessionCompatQueueItem), strIconCompatParcelizer, gregorianCalendarWrite2, gregorianCalendarWrite3, str6, listIconCompatParcelizer, bool5, zBooleanValue5, strRemoteActionCompatParcelizer));
                        createfromparcel2 = createfromparcel3;
                        i = 2;
                    }
                    createfromparcel = createfromparcel2;
                    arrayList = arrayList2;
                } else {
                    createfromparcel = createfromparcel2;
                    arrayList = null;
                }
                getInstallBeginTimestampSeconds getinstallbegintimestampseconds = lockloglevel.startingArea;
                if ((getinstallbegintimestampseconds != null ? getinstallbegintimestampseconds.coordinates : null) == null) {
                    onthirdpartysharingsettingsread = onthirdpartysharingsettingsread2;
                    onGoogleAdIdReadListener = null;
                } else {
                    List list3 = getinstallbegintimestampseconds.coordinates;
                    ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        sendPreinstallPayload sendpreinstallpayload = (sendPreinstallPayload) it.next();
                        arrayList3.add(new OnAttributionChangedListener(sendpreinstallpayload.IconCompatParcelizer(), sendpreinstallpayload.write()));
                        it = it;
                        onthirdpartysharingsettingsread2 = onthirdpartysharingsettingsread2;
                    }
                    onthirdpartysharingsettingsread = onthirdpartysharingsettingsread2;
                    onGoogleAdIdReadListener = new OnGoogleAdIdReadListener(arrayList3);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                GooglePlayServicesClientGooglePlayServicesInterface googlePlayServicesClientGooglePlayServicesInterface = lockloglevel.balanceLimit;
                OnEventTrackingSucceededListener onEventTrackingSucceededListener = new OnEventTrackingSucceededListener(j, str2, str3, i10, str4, str, gregorianCalendarWrite, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, arrayList, onGoogleAdIdReadListener, jCurrentTimeMillis, googlePlayServicesClientGooglePlayServicesInterface != null ? new OnAdidReadListener(googlePlayServicesClientGooglePlayServicesInterface.link, googlePlayServicesClientGooglePlayServicesInterface.linkLabel, googlePlayServicesClientGooglePlayServicesInterface.title, googlePlayServicesClientGooglePlayServicesInterface.subTitle) : null);
                ShiftInfoDao shiftInfoDao = (ShiftInfoDao) onthirdpartysharingsettingsread.serializer.write();
                this.serializer = 1;
                getAndroidLogLevel getandroidloglevel = (getAndroidLogLevel) shiftInfoDao;
                Object objPerformInTransactionSuspending = TuplesKt.performInTransactionSuspending(getandroidloglevel.write, new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(getandroidloglevel, onEventTrackingSucceededListener, null, 3), this);
                if (objPerformInTransactionSuspending != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objPerformInTransactionSuspending = createfromparcel;
                }
                return objPerformInTransactionSuspending == coroutineSingletons ? coroutineSingletons : createfromparcel;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.serializer;
                if (i13 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    if (DelayKt.delay(350L, this) == coroutineSingletons2) {
                        int i14 = IconCompatParcelizer + 11;
                        RatingCompat = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        return coroutineSingletons2;
                    }
                } else {
                    if (i13 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                C c = (C) this.write;
                c.serializer = f5ExternalSyntheticLambda4.RemoteActionCompatParcelizer(c.serializer, 0.0d, (f8) obj3, null, 5);
                return createfromparcel2;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.serializer;
                if (i16 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    StateFlow stateFlowIconCompatParcelizer = ((ec) this.write).IconCompatParcelizer();
                    e5 e5Var = new e5((dh) obj3, 1);
                    this.serializer = 1;
                    if (stateFlowIconCompatParcelizer.collect(e5Var, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i16 != 1) {
                        int i17 = IconCompatParcelizer + 97;
                        RatingCompat = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                DrawableTransformation.read();
                return null;
            case 3:
                FlowCollector flowCollector = (FlowCollector) this.write;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.serializer;
                if (i19 != 0) {
                    if (i19 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                g6 g6Var = (g6) ((SafeAreaPublisherImpl) obj3).serializer.serializer.MediaSessionCompatResultReceiverWrapper();
                this.write = null;
                this.serializer = 1;
                return flowCollector.emit(g6Var, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel2;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.serializer;
                if (i20 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    if (DelayKt.delay(1000L, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i20 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                qdExternalSyntheticLambda8 qdexternalsyntheticlambda8 = (qdExternalSyntheticLambda8) this.write;
                MutableStateFlow mutableStateFlow = qdexternalsyntheticlambda8.write;
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) qdexternalsyntheticlambda8.serializer.MediaSessionCompatResultReceiverWrapper()).getNetworkCapabilities((Network) obj3);
                mutableStateFlow.IconCompatParcelizer(Boolean.valueOf(networkCapabilities != null ? networkCapabilities.hasCapability(16) : false));
                return createfromparcel2;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.serializer;
                if (i21 != 0) {
                    if (i21 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CombinedScopeView combinedScopeView = (CombinedScopeView) this.write;
                MutableStateFlow mutableStateFlow2 = ((vg) combinedScopeView.read).write;
                x1 x1Var = (x1) combinedScopeView.RemoteActionCompatParcelizer;
                if (x1Var.MediaSessionCompatToken.serializer() || x1Var.PlaybackStateCompatCustomAction.read()) {
                    Flow flowSerializer = FlowKt.serializer(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(x1Var.ParcelableVolumeInfo.read(), x1Var.RatingCompat.IconCompatParcelizer(), new GetRiderStateImpl$invoke$1(i7, 7, shortNewsContentCardView)));
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{x1Var.read.read(), "ON_DEMAND"}, getCieXyz.write())).booleanValue() && x1Var.MediaSessionCompatQueueItem.IconCompatParcelizer()) {
                        flowSerializer = FlowKt.serializer(FlowKt.read(new ReconnectScheduler$schedule$1(FlowKt.RemoteActionCompatParcelizer(flowSerializer, x1Var.write.serializer(), x1Var.IconCompatParcelizer.serializer(), x1Var.MediaSessionCompatResultReceiverWrapper.serializer, new OpportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1()), x1Var, shortNewsContentCardView, 24)));
                    }
                    getMapScope$invoke$$inlined$map$1 = new GetMapScope$invoke$$inlined$map$1(flowSerializer, x1Var, i5);
                } else {
                    getMapScope$invoke$$inlined$map$1 = FlowKt.serializer();
                }
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mutableStateFlow2, getMapScope$invoke$$inlined$map$1, new GetBubbleUiState.AnonymousClass2(combinedScopeView, shortNewsContentCardView, i4));
                x7 x7Var = new x7((x5) obj3, objArr == true ? 1 : 0);
                this.serializer = 1;
                return flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(x7Var, this) == coroutineSingletons6 ? coroutineSingletons6 : createfromparcel2;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.serializer;
                if (i22 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    AppReviewLifecycleObserverImpl appReviewLifecycleObserverImpl = (AppReviewLifecycleObserverImpl) this.write;
                    SharedFlowImpl sharedFlowImpl = (SharedFlowImpl) appReviewLifecycleObserverImpl.serializer;
                    HomeStickyFooterUiModelImpl$1$1$1$1$1 homeStickyFooterUiModelImpl$1$1$1$1$1 = new HomeStickyFooterUiModelImpl$1$1$1$1$1(appReviewLifecycleObserverImpl, i6, (getContentViewGroupParentLayout) obj3);
                    this.serializer = 1;
                    sharedFlowImpl.getClass();
                    if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, homeStickyFooterUiModelImpl$1$1$1$1$1, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i22 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                DrawableTransformation.read();
                return null;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.serializer;
                if (i23 != 0) {
                    if (i23 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                supportsColorMatrixQuery lifecycle = ((accessisRenderNodeCompatiblecp) this.write).getLifecycle();
                toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.RESUMED;
                ShiftZoneMapLayerUiModelImpl$1 shiftZoneMapLayerUiModelImpl$1 = new ShiftZoneMapLayerUiModelImpl$1((VerificationStatusLifecycleObserverImpl) obj3, shortNewsContentCardView, i6);
                this.serializer = 1;
                return UrlUtils.repeatOnLifecycle(lifecycle, tocolorlong8_81lla, shiftZoneMapLayerUiModelImpl$1, this) == coroutineSingletons8 ? coroutineSingletons8 : createfromparcel2;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.serializer;
                if (i24 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) this.write;
                    toColorLong8_81llA tocolorlong8_81lla2 = toColorLong8_81llA.STARTED;
                    ShiftZoneMapLayerUiModelImpl$1 shiftZoneMapLayerUiModelImpl$2 = new ShiftZoneMapLayerUiModelImpl$1((LocationPermissionLifecycleHandler) obj3, shortNewsContentCardView, i8);
                    this.serializer = 1;
                    return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp, tocolorlong8_81lla2, shiftZoneMapLayerUiModelImpl$2, this) == coroutineSingletons9 ? coroutineSingletons9 : createfromparcel2;
                }
                if (i24 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i25 = IconCompatParcelizer + 53;
                RatingCompat = i25 % Fields.SpotShadowColor;
                if (i25 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel2;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            case 9:
                addGlobalCallbackParameterI addglobalcallbackparameteri = (addGlobalCallbackParameterI) obj3;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.write;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.serializer;
                if (i26 != 0) {
                    if (i26 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Set setRemoteActionCompatParcelizer = ((FirebaseRemoteConfigImpl) addglobalcallbackparameteri.IconCompatParcelizer).IconCompatParcelizer.RemoteActionCompatParcelizer("tracked_firebase_flags");
                r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U entries = updateAdidI.getEntries();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : entries) {
                    if (setRemoteActionCompatParcelizer.contains(((updateAdidI) obj4).getFirebaseFlagName())) {
                        arrayList4.add(obj4);
                    }
                }
                ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, null, null, new SingleProcessDataStore$data$1.AnonymousClass1(addglobalcallbackparameteri, (updateAdidI) it2.next(), shortNewsContentCardView, 28), 3));
                }
                this.write = null;
                this.serializer = 1;
                return JobKt.awaitAll(arrayList5, this) == coroutineSingletons10 ? coroutineSingletons10 : createfromparcel2;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.serializer;
                try {
                    if (i27 != 0) {
                        if (i27 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i28 = IconCompatParcelizer + 99;
                        RatingCompat = i28 % Fields.SpotShadowColor;
                        if (i28 % 2 == 0) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            int i29 = 18 / 0;
                            break;
                        } else {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                        }
                        return obj;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    endFirstSessionDelay endfirstsessiondelay = (endFirstSessionDelay) this.write;
                    pickChildForBackwardSearch pickchildforbackwardsearch = endfirstsessiondelay.read;
                    HeatmapDataStore$set$2 heatmapDataStore$set$2 = new HeatmapDataStore$set$2(endfirstsessiondelay, (Map) obj3, shortNewsContentCardView, i4);
                    this.serializer = 1;
                    Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(pickchildforbackwardsearch, heatmapDataStore$set$2, this);
                    if (objSerializer != coroutineSingletons11) {
                        return objSerializer;
                    }
                    int i30 = IconCompatParcelizer + 27;
                    RatingCompat = i30 % Fields.SpotShadowColor;
                    if (i30 % 2 != 0) {
                        return coroutineSingletons11;
                    }
                    throw null;
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "FwF Gen II: failed to write eval cache to disk", new Object[0]);
                    return createfromparcel2;
                }
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.serializer;
                if (i31 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    GetFutureShiftUiState getFutureShiftUiState = (GetFutureShiftUiState) this.write;
                    this.serializer = 1;
                    objInvoke$implementation = getFutureShiftUiState.invoke$implementation(this);
                    if (objInvoke$implementation != coroutineSingletons12) {
                    }
                    return coroutineSingletons12;
                }
                if (i31 != 1) {
                    int i32 = RatingCompat + 79;
                    IconCompatParcelizer = i32 % Fields.SpotShadowColor;
                    if (i32 % 2 == 0 ? i31 != 2 : i31 != 5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel2;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objInvoke$implementation = obj;
                FlowSubscription$consumeFlow$2 flowSubscription$consumeFlow$2 = new FlowSubscription$consumeFlow$2(13, (FutureShiftUiModelImpl) obj3);
                this.serializer = 2;
                if (((Flow) objInvoke$implementation).collect(flowSubscription$consumeFlow$2, this) != coroutineSingletons12) {
                    return createfromparcel2;
                }
                return coroutineSingletons12;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.serializer;
                if (i33 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    GetOfferToWorkUiState getOfferToWorkUiState = (GetOfferToWorkUiState) this.write;
                    this.serializer = 1;
                    objInvoke = getOfferToWorkUiState.invoke(this);
                    if (objInvoke != coroutineSingletons13) {
                    }
                    return coroutineSingletons13;
                }
                if (i33 != 1) {
                    if (i33 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objInvoke = obj;
                FlowSubscription$consumeFlow$2 flowSubscription$consumeFlow$3 = new FlowSubscription$consumeFlow$2(14, (OfferToWorkUiModelImpl) obj3);
                this.serializer = 2;
                if (((Flow) objInvoke).collect(flowSubscription$consumeFlow$3, this) != coroutineSingletons13) {
                    return createfromparcel2;
                }
                return coroutineSingletons13;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.serializer;
                if (i34 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    GetOnDemandUiState getOnDemandUiState = (GetOnDemandUiState) this.write;
                    this.serializer = 1;
                    objInvoke2 = getOnDemandUiState.invoke(this);
                    if (objInvoke2 != coroutineSingletons14) {
                    }
                    return coroutineSingletons14;
                }
                if (i34 != 1) {
                    if (i34 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objInvoke2 = obj;
                FlowSubscription$consumeFlow$2 flowSubscription$consumeFlow$4 = new FlowSubscription$consumeFlow$2(18, (OnDemandUiModelImpl) obj3);
                this.serializer = 2;
                if (((Flow) objInvoke2).collect(flowSubscription$consumeFlow$4, this) != coroutineSingletons14) {
                    return createfromparcel2;
                }
                return coroutineSingletons14;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.serializer;
                if (i35 != 0) {
                    if (i35 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Logger logger = (Logger) ((asBinder) this.write).IconCompatParcelizer.write();
                this.serializer = 1;
                getSignedData getsigneddata = (getSignedData) logger;
                Object objPerformSuspending = TuplesKt.performSuspending(getsigneddata.read, false, true, new Recomposer$$ExternalSyntheticLambda4(getsigneddata, 29, (OnIsEnabledListener) obj3), this);
                if (objPerformSuspending != coroutineSingletons15) {
                    objPerformSuspending = createfromparcel2;
                }
                return objPerformSuspending == coroutineSingletons15 ? coroutineSingletons15 : createfromparcel2;
            case 15:
                FlowCollector flowCollector2 = (FlowCollector) this.write;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.serializer;
                if (i36 != 0) {
                    if (i36 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object objWrite = ((asBinder) obj3).IconCompatParcelizer.write();
                this.write = null;
                this.serializer = 1;
                return flowCollector2.emit(objWrite, this) == coroutineSingletons16 ? coroutineSingletons16 : createfromparcel2;
            case 16:
                FlowCollector flowCollector3 = (FlowCollector) this.write;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.serializer;
                if (i37 != 0) {
                    if (i37 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object objWrite2 = ((IActivityHandler) obj3).serializer.write();
                this.write = null;
                this.serializer = 1;
                return flowCollector3.emit(objWrite2, this) == coroutineSingletons17 ? coroutineSingletons17 : createfromparcel2;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.serializer;
                if (i38 != 0) {
                    if (i38 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i39 = IconCompatParcelizer + 99;
                    RatingCompat = i39 % Fields.SpotShadowColor;
                    int i40 = i39 % 2;
                    return createfromparcel2;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                WorkOpportunityDao workOpportunityDao = (WorkOpportunityDao) ((IActivityHandler) this.write).serializer.write();
                this.serializer = 1;
                resolveClass resolveclass = (resolveClass) workOpportunityDao;
                Object objPerformInTransactionSuspending2 = TuplesKt.performInTransactionSuspending(resolveclass.serializer, new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(resolveclass, (List) obj3, shortNewsContentCardView, i5), this);
                if (objPerformInTransactionSuspending2 != coroutineSingletons18) {
                    objPerformInTransactionSuspending2 = createfromparcel2;
                }
                if (objPerformInTransactionSuspending2 != coroutineSingletons18) {
                    return createfromparcel2;
                }
                int i41 = RatingCompat + 103;
                IconCompatParcelizer = i41 % Fields.SpotShadowColor;
                int i42 = i41 % 2;
                return coroutineSingletons18;
            case 18:
                FlowCollector flowCollector4 = (FlowCollector) this.write;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i43 = this.serializer;
                if (i43 != 0) {
                    if (i43 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object objWrite3 = ((GetShiftInfoImpl) obj3).RemoteActionCompatParcelizer.write();
                this.write = null;
                this.serializer = 1;
                if (flowCollector4.emit(objWrite3, this) != coroutineSingletons19) {
                    return createfromparcel2;
                }
                int i44 = RatingCompat + 95;
                IconCompatParcelizer = i44 % Fields.SpotShadowColor;
                int i45 = i44 % 2;
                return coroutineSingletons19;
            default:
                FlowCollector flowCollector5 = (FlowCollector) this.write;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i46 = this.serializer;
                if (i46 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) ((SideMenuRepository) obj3).serializer).RemoteActionCompatParcelizer.serializer();
                    if (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null) {
                        objValueOf = Long.valueOf(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read);
                        obj2 = null;
                    } else {
                        obj2 = null;
                        objValueOf = null;
                    }
                    this.write = obj2;
                    this.serializer = 1;
                    if (flowCollector5.emit(objValueOf, this) == obj5) {
                        return obj5;
                    }
                } else {
                    if (i46 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createfromparcel2;
        }
    }
}
