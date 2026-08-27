package kotlinx.coroutines.rx2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.webkit.WebView;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.room.Room;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.UriKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.data.error.TooManyRequestsException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.logistics.rider.glovo.R;
import com.roadrunner.common.data.api.ErrorBodyParseException;
import com.roadrunner.common.data.api.MissingErrorBodyException;
import com.roadrunner.common.data.api.MissingErrorResponseException;
import com.roadrunner.common.data.api.UniqueHttpException;
import com.roadrunner.common.data.api.UniqueHttpExceptionKt;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.countdowntimer.CountDownTimerUiModel$observeTimerState$$inlined$map$1;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.accountcreation.data.AccountCreationParseException;
import com.roadrunner.rider.recruitment.accountcreation.data.ApiErrorResponse;
import com.roadrunner.rider.recruitment.accountcreation.data.ExecuteAccountCreationApiRequest;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpParseException;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.GetRemainingOtpVerificationTimerIfRunning;
import com.roadrunner.rider.recruitment.applicant.domain.GetApplicantAccessTokenUseCaseImpl;
import com.roadrunner.rider.recruitment.applicant.domain.IsApplicantSessionAvailableUseCaseImpl;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager$initializeInternal$1;
import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import com.roadrunner.rider.state.realtime.RealtimeStatusUpdateManagerImpl;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import com.roadrunner.twofa.presentation.TwoFaViewModel;
import com.roadrunner.util.sound.DefaultBackgroundSoundManager;
import com.roadrunner.web.presentation.authWebView.AuthWebViewModel;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import com.sentiance.core.model.thrift.O$b;
import com.ui.common.extensions.ViewModelExtensionsKt$viewModelScoped$4$1;
import dagger.Lazy;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.JsonObjectSerializer;
import io.sentry.util.UrlUtils;
import io.socket.parser.IOParser$Decoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializationException;
import o.ActivityHandler17;
import o.ActivityHandler41;
import o.ActivityHandlerExternalSyntheticLambda11;
import o.ActivityHandlerExternalSyntheticLambda13;
import o.AdjustAdRevenue;
import o.AnchoredDraggableStatedraggableState1drag2;
import o.BrazeExternalSyntheticLambda29;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.SemanticsOwner;
import o.ShortNewsContentCardView;
import o._get_messageWebView_lambda3;
import o.accessgetInstancedelegatecp;
import o.accessgetSdkEnablementProvidercp;
import o.accessisInstanceStoppedp;
import o.accessisRenderNodeCompatiblecp;
import o.backwardFocusSearch;
import o.closeSession;
import o.createFromParcel;
import o.deleteRegisteredGeofenceCachelambda0;
import o.deleteRegisteredGeofenceCachelambda1;
import o.deserializeInAppMessageString;
import o.disableCoppaComplianceInDelay;
import o.dismissBannerlambda1;
import o.displayInAppMessagelambda1;
import o.enablePlayStoreKidsComplianceInDelay;
import o.getBitmapui_graphics;
import o.getCieXyz;
import o.getConfigurationProviderSafeandroid_sdk_base_release;
import o.getContentCardUnviewedCount;
import o.getContentCardsLastUpdatedInSecondsFromEpoch;
import o.getContentViewGroupParentLayout;
import o.getGoogleAdId;
import o.getGooglePlayInstant;
import o.getHoldoutVariationName;
import o.getLastDeeplink;
import o.getOnEventTrackingFailedListener;
import o.getProcessName;
import o.getQueryContext;
import o.getRootInfoui;
import o.getSdkVersion;
import o.inCompatibilityMode;
import o.initSdk;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.isRoot;
import o.lambda39;
import o.lambdaremoveGlobalPartnerParameters31;
import o.lambdasendPreinstallReferrer19;
import o.lambdasetEnabled5;
import o.logBannerClicklambda0;
import o.logFeatureFlagImpression;
import o.logPushDeliverylambda1;
import o.logPushMaxCampaignlambda0;
import o.logPushMaxCampaignlambda1;
import o.logPushNotificationActionClicked;
import o.logPushNotificationActionClickedlambda1;
import o.logPushNotificationActionClickedlambda10;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.onPauseI;
import o.pageDowndefault;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.processDeeplink;
import o.r8lambdaFoHda6PPUndXPqLntLIGE0Xto;
import o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao;
import o.r8lambdaP1frYJQmg54QrMLKfwUvXZE4A5U;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.requestBannersRefresh;
import o.requestSingleLocationUpdatelambda0;
import o.resetTransientState;
import o.safeCallFlushDelayedInitPushAnalyticsQueue;
import o.schedulePushDeliverylambda1;
import o.setCarryoverInAppMessage;
import o.setEventDeduplicationIdsMaxSize;
import o.setGoogleAdvertisingIdlambda0;
import o.setGraphicModalMaxWidthDp;
import o.setReferrer;
import o.setSdkAuthenticationSignaturelambda10;
import o.setSdkAuthenticationSignaturelambda11;
import o.setUnregisteredInAppMessage;
import o.subscribeToChangeUserEventslambda31;
import o.subscribeToContentCardsUpdates;
import o.subscribeToSdkAuthenticationFailures;
import o.toBitmapConfig1JJdX4A;
import o.toColorLong8_81llA;
import o.unregisterInAppMessageManager;
import o.updateAdidI;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;
import okio.Okio;
import okio.Path$Companion;
import retrofit2.HttpException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class RxConvertKt$asFlow$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxConvertKt$asFlow$1(ActivityHandler41 activityHandler41, String str, int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 5;
        this.write = activityHandler41;
        this.read = str;
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxConvertKt$asFlow$1(int i, isRoot isroot, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 9;
        this.read = isroot;
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RxConvertKt$asFlow$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.read = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RxConvertKt$asFlow$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (r10 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$com$roadrunner$web$presentation$authWebView$AuthWebViewModel$setWebData$1(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object r1 = r9.write
            com.roadrunner.web.presentation.authWebView.AuthWebViewModel r1 = (com.roadrunner.web.presentation.authWebView.AuthWebViewModel) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r9.IconCompatParcelizer
            r4 = 1
            if (r3 == 0) goto L42
            int r5 = kotlinx.coroutines.rx2.RxConvertKt$asFlow$1.MediaMetadataCompat
            int r6 = r5 + 97
            int r7 = r6 % 128
            kotlinx.coroutines.rx2.RxConvertKt$asFlow$1.serializer = r7
            int r6 = r6 % r0
            if (r3 == r4) goto L3a
            int r2 = r5 + 121
            int r4 = r2 % 128
            kotlinx.coroutines.rx2.RxConvertKt$asFlow$1.serializer = r4
            int r2 = r2 % r0
            r2 = 0
            if (r3 != r0) goto L34
            int r5 = r5 + 19
            int r3 = r5 % 128
            kotlinx.coroutines.rx2.RxConvertKt$asFlow$1.serializer = r3
            int r5 = r5 % r0
            if (r5 != 0) goto L30
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L8f
        L30:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            throw r2
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r2
        L3a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            o.onItemDismiss r10 = (o.onItemDismiss) r10
            java.lang.Object r10 = r10.IconCompatParcelizer
            goto L50
        L42:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            com.roadrunner.auth.domain.token.GetAccessTokenUseCaseImpl r10 = r1.MediaDescriptionCompat
            r9.IconCompatParcelizer = r4
            java.io.Serializable r10 = r10.m4873invokeIoAF18A(r9)
            if (r10 != r2) goto L50
            goto L8e
        L50:
            java.lang.Throwable r3 = o.onItemDismiss.serializer(r10)
            if (r3 == 0) goto L60
            timber.log.Timber$Forest r4 = timber.log.Timber.RemoteActionCompatParcelizer
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "User was not signed in while opening authorized web app"
            r4.RemoteActionCompatParcelizer(r3, r6, r5)
        L60:
            boolean r3 = r10 instanceof o.isItemDismissable
            if (r3 == 0) goto L66
            java.lang.String r10 = ""
        L66:
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            androidx.lifecycle.BlockRunner r4 = r1.serializer
            java.lang.Object r10 = r9.read
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5
            r9.IconCompatParcelizer = r0
            java.lang.Object r10 = r4.serializer
            o.isOpenInternalroom_runtime r10 = (o.isOpenInternalroom_runtime) r10
            o.inCompatibilityMode r10 = (o.inCompatibilityMode) r10
            r10.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r10 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer
            kotlinx.coroutines.scheduling.DefaultIoScheduler r10 = kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer
            com.roadrunner.nafath.data.NafathTimerDataStore$set$2 r0 = new com.roadrunner.nafath.data.NafathTimerDataStore$set$2
            r7 = 0
            r8 = 23
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r0, r9)
            if (r10 != r2) goto L8f
        L8e:
            return r2
        L8f:
            o.BrazeExternalSyntheticLambda11 r10 = (o.BrazeExternalSyntheticLambda11) r10
            io.reactivex.subjects.BehaviorSubject r0 = r1.ParcelableVolumeInfo
            r0.onNext(r10)
            o.createFromParcel r10 = o.createFromParcel.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1.invokeSuspend$com$roadrunner$web$presentation$authWebView$AuthWebViewModel$setWebData$1(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 111;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.read;
        switch (i4) {
            case 0:
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1((BehaviorSubject) obj2, shortNewsContentCardView, 0);
                rxConvertKt$asFlow$1.write = obj;
                return rxConvertKt$asFlow$1;
            case 1:
                return new RxConvertKt$asFlow$1((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.write, (ExecuteAccountCreationApiRequest) obj2, shortNewsContentCardView, 1);
            case 2:
                return new RxConvertKt$asFlow$1((LazyListState) this.write, (FocusManager) obj2, shortNewsContentCardView, i);
            case 3:
                return new RxConvertKt$asFlow$1((DropShadowEffect) this.write, (String) obj2, shortNewsContentCardView, 3);
            case 4:
                return new RxConvertKt$asFlow$1((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.write, (H$b) obj2, shortNewsContentCardView, 4);
            case 5:
                return new RxConvertKt$asFlow$1((ActivityHandler41) this.write, (String) obj2, this.IconCompatParcelizer, shortNewsContentCardView);
            case 6:
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$2 = new RxConvertKt$asFlow$1((AdjustAdRevenue) obj2, shortNewsContentCardView, 6);
                rxConvertKt$asFlow$2.write = obj;
                int i5 = MediaMetadataCompat + 39;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return rxConvertKt$asFlow$2;
            case 7:
                return new RxConvertKt$asFlow$1((AdjustAdRevenue) this.write, (setReferrer) obj2, shortNewsContentCardView, 7);
            case 8:
                return new RxConvertKt$asFlow$1((AdjustAdRevenue) this.write, (getSdkVersion) obj2, shortNewsContentCardView, 8);
            case 9:
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$3 = new RxConvertKt$asFlow$1(this.IconCompatParcelizer, (isRoot) obj2, shortNewsContentCardView);
                rxConvertKt$asFlow$3.write = obj;
                return rxConvertKt$asFlow$3;
            case 10:
                return new RxConvertKt$asFlow$1((getProcessName) this.write, (getOnEventTrackingFailedListener) obj2, shortNewsContentCardView, 10);
            case 11:
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$4 = new RxConvertKt$asFlow$1((RealtimeStatusUpdateManagerImpl) obj2, shortNewsContentCardView, 11);
                rxConvertKt$asFlow$4.write = obj;
                return rxConvertKt$asFlow$4;
            case 12:
                return new RxConvertKt$asFlow$1((ZoomableNode) this.write, (Offset) obj2, shortNewsContentCardView, 12);
            case 13:
                return new RxConvertKt$asFlow$1((N$b) obj2, shortNewsContentCardView, 13);
            case 14:
                return new RxConvertKt$asFlow$1((r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI) this.write, (SheetState) obj2, shortNewsContentCardView, 14);
            case 15:
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$5 = new RxConvertKt$asFlow$1((accessgetSdkEnablementProvidercp) obj2, shortNewsContentCardView, 15);
                rxConvertKt$asFlow$5.write = obj;
                int i7 = MediaMetadataCompat + 117;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return rxConvertKt$asFlow$5;
                }
                throw null;
            case 16:
                return new RxConvertKt$asFlow$1((lambda39) this.write, (logBannerClicklambda0) obj2, shortNewsContentCardView, 16);
            case 17:
                return new RxConvertKt$asFlow$1((accessisRenderNodeCompatiblecp) this.write, (OneClickStartWorkingViewModel) obj2, shortNewsContentCardView, 17);
            case 18:
                return new RxConvertKt$asFlow$1((logPushDeliverylambda1) this.write, (dismissBannerlambda1) obj2, shortNewsContentCardView, 18);
            case 19:
                return new RxConvertKt$asFlow$1((StartWorkingNavigationUiModelImpl) this.write, (StartWorkingNavAction) obj2, shortNewsContentCardView, 19);
            case 20:
                return new RxConvertKt$asFlow$1((TwoFaViewModel) this.write, (String) obj2, shortNewsContentCardView, 20);
            case 21:
                return new RxConvertKt$asFlow$1((DefaultBackgroundSoundManager) this.write, (Uri) obj2, shortNewsContentCardView, 21);
            case 22:
                return new RxConvertKt$asFlow$1((getConfigurationProviderSafeandroid_sdk_base_release) this.write, (getContentCardUnviewedCount) obj2, shortNewsContentCardView, 22);
            case 23:
                return new RxConvertKt$asFlow$1((O$b) this.write, (WebView) obj2, shortNewsContentCardView, 23);
            case 24:
                return new RxConvertKt$asFlow$1((accessisRenderNodeCompatiblecp) this.write, (BrazeExternalSyntheticLambda29) obj2, shortNewsContentCardView, 24);
            case 25:
                return new RxConvertKt$asFlow$1((AuthWebViewModel) this.write, (String) obj2, shortNewsContentCardView, 25);
            default:
                return new RxConvertKt$asFlow$1((CountDownTimerUiModel$observeTimerState$$inlined$map$1) this.write, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 26);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 37;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i4) {
            case 0:
                return ((RxConvertKt$asFlow$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 6:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                ((RxConvertKt$asFlow$1) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 10:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((RxConvertKt$asFlow$1) create((lambdaremoveGlobalPartnerParameters31) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                Object objInvokeSuspend = ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = serializer + 93;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            case 22:
                Object objInvokeSuspend2 = ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i6 = MediaMetadataCompat + 83;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return objInvokeSuspend2;
            case 23:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((RxConvertKt$asFlow$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:355:0x0751  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:579:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0171 A[PHI: r0 r3
  0x0171: PHI (r0v171 java.util.List) = (r0v165 java.util.List), (r0v174 java.util.List) binds: [B:75:0x016e, B:72:0x015a] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r3v87 int) = (r3v85 int), (r3v90 int) binds: [B:75:0x016e, B:72:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v157 */
    /* JADX WARN: Type inference failed for: r2v158 */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20, types: [o.isItemDismissable] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [o.isItemDismissable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v50 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objSerializer;
        Object remainingCountTimeDuration;
        Object objLogRiderSafetyPermissionGranted;
        Object objM5142getSettingsIoAF18A;
        Object obj2;
        long jLongValue;
        Long lValueOf;
        Object objInvoke;
        Object objM5072triggerFaCode0E7RQCE$implementation;
        long jLongValue2;
        Ringtone ringtone;
        long jLongValue3;
        Long lParcelableVolumeInfo;
        Object objFetchVendorReviewConfig;
        List<closeSession> list;
        int iRemoteActionCompatParcelizer;
        Object objInvoke2;
        Object objInvoke3;
        String str;
        ?? isitemdismissable = 2;
        ?? isitemdismissable2 = 2;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.read;
        String str2 = "disable_battery_optimization";
        int i3 = 0;
        ?? r5 = 0;
        Object objSerializer2 = null;
        int i4 = 1;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.IconCompatParcelizer;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.write;
                AtomicReference atomicReference = new AtomicReference();
                ((BehaviorSubject) obj3).subscribe(new r8lambdaFoHda6PPUndXPqLntLIGE0Xto(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, atomicReference));
                RealWebSocket$$ExternalSyntheticLambda0 realWebSocket$$ExternalSyntheticLambda0 = new RealWebSocket$$ExternalSyntheticLambda0(19, atomicReference);
                this.IconCompatParcelizer = 1;
                return Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, realWebSocket$$ExternalSyntheticLambda0, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.IconCompatParcelizer;
                try {
                    if (i6 != 0) {
                        int i7 = MediaMetadataCompat;
                        int i8 = i7 + 51;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (i6 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i10 = i7 + 111;
                        serializer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        isitemdismissable = obj;
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.write;
                        this.IconCompatParcelizer = 1;
                        Object objInvoke4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
                        if (objInvoke4 == coroutineSingletons2) {
                            int i12 = serializer + 53;
                            MediaMetadataCompat = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            return coroutineSingletons2;
                        }
                        isitemdismissable = objInvoke4;
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    e = e2;
                    onPauseI onpausei = ((ExecuteAccountCreationApiRequest) obj3).write;
                    onpausei.getClass();
                    isAdapterPositionOnScreen isadapterpositiononscreen = onpausei.RemoteActionCompatParcelizer;
                    if (e instanceof HttpException) {
                        int i14 = MediaMetadataCompat + 9;
                        serializer = i14 % Fields.SpotShadowColor;
                        ?? r4 = i14 % isitemdismissable;
                        UniqueHttpException uniqueHttpExceptionWrite = UniqueHttpExceptionKt.write((HttpException) e);
                        getHoldoutVariationName getholdoutvariationname = uniqueHttpExceptionWrite.write;
                        int i15 = uniqueHttpExceptionWrite.read;
                        if (getholdoutvariationname == null) {
                            e = new MissingErrorResponseException(null, uniqueHttpExceptionWrite);
                        } else {
                            _get_messageWebView_lambda3 _get_messagewebview_lambda3 = getholdoutvariationname.errorBody;
                            if (_get_messagewebview_lambda3 == null) {
                                e = new MissingErrorBodyException(null, uniqueHttpExceptionWrite);
                            } else if (i15 == 429) {
                                e = new TooManyRequestsException(null, uniqueHttpExceptionWrite);
                            } else {
                                String strMediaMetadataCompat = _get_messagewebview_lambda3.MediaMetadataCompat();
                                try {
                                    resetTransientState resettransientstate = (resetTransientState) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                                    resettransientstate.getClass();
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = processDeeplink.Companion.serializer();
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                                    objSerializer = resettransientstate.serializer(strMediaMetadataCompat, setgraphicmodalmaxwidthdpSerializer);
                                } catch (SerializationException e3) {
                                    Timber.RemoteActionCompatParcelizer.write(new AccountCreationParseException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse ", displayInAppMessagelambda1.serializer(processDeeplink.class).IconCompatParcelizer()), e3));
                                    objSerializer = null;
                                }
                                Object objSerializer3 = (processDeeplink) objSerializer;
                                if (objSerializer3 == null) {
                                    try {
                                        resetTransientState resettransientstate2 = (resetTransientState) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                                        resettransientstate2.getClass();
                                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer2 = ActivityHandler17.Companion.serializer();
                                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpSerializer2;
                                        objSerializer3 = resettransientstate2.serializer(strMediaMetadataCompat, setgraphicmodalmaxwidthdpSerializer2);
                                    } catch (SerializationException e4) {
                                        Timber.RemoteActionCompatParcelizer.write(new AccountCreationParseException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse ", displayInAppMessagelambda1.serializer(ActivityHandler17.class).IconCompatParcelizer()), e4));
                                        objSerializer3 = null;
                                    }
                                }
                                e = objSerializer3 instanceof processDeeplink ? new ApiErrorResponse.PhoneValidationFailureResponse(uniqueHttpExceptionWrite, i15) : objSerializer3 instanceof ActivityHandler17 ? new ApiErrorResponse.AccountCreationFailureResponse((ActivityHandler17) objSerializer3, uniqueHttpExceptionWrite, i15) : new ErrorBodyParseException(new SerializationException(), uniqueHttpExceptionWrite, null);
                            }
                        }
                    }
                    isitemdismissable = new isItemDismissable(e);
                    break;
                }
                return new onItemDismiss(isitemdismissable);
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.IconCompatParcelizer;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowIconCompatParcelizer = CompositionKt.IconCompatParcelizer(new AnchoredDraggableStatedraggableState1drag2((LazyListState) this.write, i4));
                RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(7, (FocusManager) obj3);
                this.IconCompatParcelizer = 1;
                return ((AbstractFlow) flowIconCompatParcelizer).collect(anonymousClass1, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
            case 3:
                DropShadowEffect dropShadowEffect = (DropShadowEffect) this.write;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.IconCompatParcelizer;
                try {
                    if (i17 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        CountDownTimerUiModel countDownTimerUiModel = (CountDownTimerUiModel) dropShadowEffect.read;
                        this.IconCompatParcelizer = 1;
                        remainingCountTimeDuration = countDownTimerUiModel.getRemainingCountTimeDuration(this);
                        if (remainingCountTimeDuration == coroutineSingletons4) {
                        }
                        return coroutineSingletons4;
                    }
                    if (i17 != 1) {
                        if (i17 == 2) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    remainingCountTimeDuration = obj;
                    Long l = (Long) remainingCountTimeDuration;
                    if (l == null) {
                        return createfromparcel;
                    }
                    long jLongValue4 = l.longValue();
                    GetRemainingOtpVerificationTimerIfRunning getRemainingOtpVerificationTimerIfRunning = (GetRemainingOtpVerificationTimerIfRunning) dropShadowEffect.write;
                    this.IconCompatParcelizer = 2;
                    if (getRemainingOtpVerificationTimerIfRunning.invoke(jLongValue4, (String) obj3, this) != coroutineSingletons4) {
                        return createfromparcel;
                    }
                    return coroutineSingletons4;
                } catch (Exception e5) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e5, "failed to save otp verification timer", new Object[0]);
                    return createfromparcel;
                }
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.IconCompatParcelizer;
                try {
                    if (i18 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.write;
                        this.IconCompatParcelizer = 1;
                        Object objInvoke5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(this);
                        isitemdismissable2 = objInvoke5;
                        if (objInvoke5 == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i18 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        isitemdismissable2 = obj;
                    }
                    break;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Exception e7) {
                    ActivityHandlerExternalSyntheticLambda13 activityHandlerExternalSyntheticLambda13 = (ActivityHandlerExternalSyntheticLambda13) ((H$b) obj3).serializer;
                    activityHandlerExternalSyntheticLambda13.getClass();
                    boolean z = e7 instanceof HttpException;
                    Throwable validationError = e7;
                    if (z) {
                        UniqueHttpException uniqueHttpExceptionWrite2 = UniqueHttpExceptionKt.write((HttpException) e7);
                        getHoldoutVariationName getholdoutvariationname2 = uniqueHttpExceptionWrite2.write;
                        int i19 = uniqueHttpExceptionWrite2.read;
                        if (getholdoutvariationname2 == null) {
                            validationError = new MissingErrorResponseException(null, uniqueHttpExceptionWrite2);
                        } else if (i19 == 400) {
                            _get_messageWebView_lambda3 _get_messagewebview_lambda4 = getholdoutvariationname2.errorBody;
                            if (_get_messagewebview_lambda4 == null) {
                                validationError = new MissingErrorBodyException(null, uniqueHttpExceptionWrite2);
                            } else {
                                String strMediaMetadataCompat2 = _get_messagewebview_lambda4.MediaMetadataCompat();
                                try {
                                    resetTransientState resettransientstate3 = (resetTransientState) activityHandlerExternalSyntheticLambda13.serializer.MediaSessionCompatResultReceiverWrapper();
                                    resettransientstate3.getClass();
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer3 = ActivityHandlerExternalSyntheticLambda11.Companion.serializer();
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = setgraphicmodalmaxwidthdpSerializer3;
                                    objSerializer2 = resettransientstate3.serializer(strMediaMetadataCompat2, setgraphicmodalmaxwidthdpSerializer3);
                                } catch (SerializationException e8) {
                                    Timber.RemoteActionCompatParcelizer.write(new OtpParseException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse ", displayInAppMessagelambda1.serializer(ActivityHandlerExternalSyntheticLambda11.class).IconCompatParcelizer()), e8));
                                }
                                ActivityHandlerExternalSyntheticLambda11 activityHandlerExternalSyntheticLambda11 = (ActivityHandlerExternalSyntheticLambda11) objSerializer2;
                                validationError = activityHandlerExternalSyntheticLambda11 != null ? new OtpApiError.ValidationError(activityHandlerExternalSyntheticLambda11, uniqueHttpExceptionWrite2) : new ErrorBodyParseException(new SerializationException("Failed to parse OtpErrorResponse"), uniqueHttpExceptionWrite2, strMediaMetadataCompat2);
                            }
                            break;
                        } else if (i19 != 401) {
                            int i20 = serializer + 101;
                            MediaMetadataCompat = i20 % Fields.SpotShadowColor;
                            ?? r0 = i20 % isitemdismissable2;
                            if (i19 == 425) {
                                validationError = new OtpApiError.TooEarly(uniqueHttpExceptionWrite2);
                            } else if (i19 != 429) {
                                validationError = (i19 == 500 || i19 == 502) ? new OtpApiError.ServerError(uniqueHttpExceptionWrite2, i19) : uniqueHttpExceptionWrite2;
                            } else {
                                validationError = new TooManyRequestsException(null, uniqueHttpExceptionWrite2);
                            }
                        } else {
                            validationError = new OtpApiError.InvalidRequestId(uniqueHttpExceptionWrite2);
                        }
                    }
                    isitemdismissable2 = new isItemDismissable(validationError);
                }
                return new onItemDismiss(isitemdismissable2);
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((ActivityHandler41) this.write).write(this.IconCompatParcelizer, (String) obj3);
                return createfromparcel;
            case 6:
                AdjustAdRevenue adjustAdRevenue = (AdjustAdRevenue) obj3;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.write;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.IconCompatParcelizer;
                if (i21 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    PermissionHistoryRepository permissionHistoryRepository = adjustAdRevenue.MediaDescriptionCompat;
                    this.write = getcontentviewgroupparentlayout;
                    this.IconCompatParcelizer = 1;
                    if (permissionHistoryRepository.invalidate(this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i21 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                YieldKt.IconCompatParcelizer(getcontentviewgroupparentlayout);
                getLastDeeplink getlastdeeplink = (getLastDeeplink) adjustAdRevenue.MediaMetadataCompat.read();
                if (getlastdeeplink instanceof getSdkVersion) {
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(adjustAdRevenue), null, null, new RxConvertKt$asFlow$1(adjustAdRevenue, (getSdkVersion) getlastdeeplink, (ShortNewsContentCardView) r5, 8), 3);
                }
                getLastDeeplink getlastdeeplinkIconCompatParcelizer = adjustAdRevenue.RemoteActionCompatParcelizer.IconCompatParcelizer(adjustAdRevenue.RatingCompat);
                if (!getlastdeeplinkIconCompatParcelizer.equals(initSdk.read)) {
                    adjustAdRevenue.write.IconCompatParcelizer(getlastdeeplinkIconCompatParcelizer);
                    return createfromparcel;
                }
                r8lambdaP1frYJQmg54QrMLKfwUvXZE4A5U r8lambdap1fryjqmg54qrmlkfwuvxze4a5u = adjustAdRevenue.serializer;
                r8lambdap1fryjqmg54qrmlkfwuvxze4a5u.serializer.IconCompatParcelizer(r8lambdap1fryjqmg54qrmlkfwuvxze4a5u.RemoteActionCompatParcelizer.IconCompatParcelizer(R.string.preference_safety_tracking), true);
                RiderSafetyLifecycleManager riderSafetyLifecycleManager = adjustAdRevenue.MediaSessionCompatQueueItem;
                if (riderSafetyLifecycleManager.IconCompatParcelizer) {
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = riderSafetyLifecycleManager.PlaybackStateCompat;
                    ((inCompatibilityMode) riderSafetyLifecycleManager.write).getClass();
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new RiderSafetyLifecycleManager$initializeInternal$1(riderSafetyLifecycleManager, r5, i4), 2);
                }
                adjustAdRevenue.IconCompatParcelizer.serializer(getGoogleAdId.read);
                return createfromparcel;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.IconCompatParcelizer;
                if (i22 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    DropShadowEffect dropShadowEffect2 = ((AdjustAdRevenue) this.write).MediaBrowserCompatMediaItem;
                    this.IconCompatParcelizer = 1;
                    dropShadowEffect2.getClass();
                    int i23 = getGooglePlayInstant.write[((setReferrer) obj3).ordinal()];
                    if (i23 == 1) {
                        str2 = "background_location";
                    } else if (i23 == 2) {
                        str2 = "activity_recognition";
                    } else if (i23 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    }
                    Map mapSingletonMap = Collections.singletonMap("name", str2);
                    mapSingletonMap.getClass();
                    Object objLogEvent = dropShadowEffect2.logEvent("rider_safety_permission_requested", mapSingletonMap, this);
                    if (objLogEvent != coroutineSingletons8) {
                        objLogEvent = createfromparcel;
                    }
                    if (objLogEvent != coroutineSingletons8) {
                        objLogEvent = createfromparcel;
                    }
                    if (objLogEvent != coroutineSingletons8) {
                        return createfromparcel;
                    }
                    int i24 = serializer + 17;
                    MediaMetadataCompat = i24 % Fields.SpotShadowColor;
                    if (i24 % 2 != 0) {
                        return coroutineSingletons8;
                    }
                    r5.hashCode();
                    throw null;
                }
                int i25 = MediaMetadataCompat + 33;
                serializer = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                if (i22 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.IconCompatParcelizer;
                if (i27 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    AdjustAdRevenue adjustAdRevenue2 = (AdjustAdRevenue) this.write;
                    DropShadowEffect dropShadowEffect3 = adjustAdRevenue2.MediaBrowserCompatMediaItem;
                    setReferrer setreferrer = ((getSdkVersion) obj3).serializer;
                    GetAppStateImpl getAppStateImpl = adjustAdRevenue2.RatingCompat;
                    this.IconCompatParcelizer = 1;
                    dropShadowEffect3.getClass();
                    int i28 = getGooglePlayInstant.write[setreferrer.ordinal()];
                    if (i28 == 1) {
                        Boolean bool = (Boolean) ((getBitmapui_graphics) getAppStateImpl.serializer).write("BACKGROUND_LOCATION_REQUESTED");
                        if (bool == null || !bool.booleanValue() || (!((disableCoppaComplianceInDelay) dropShadowEffect3.write).IconCompatParcelizer() ? (objLogRiderSafetyPermissionGranted = dropShadowEffect3.logRiderSafetyPermissionGranted("background_location", this)) != coroutineSingletons9 : (objLogRiderSafetyPermissionGranted = dropShadowEffect3.logRiderSafetyPermissionDenied("background_location", this)) != coroutineSingletons9)) {
                            objLogRiderSafetyPermissionGranted = createfromparcel;
                        }
                        if (objLogRiderSafetyPermissionGranted != coroutineSingletons9) {
                            objLogRiderSafetyPermissionGranted = createfromparcel;
                        }
                    } else if (i28 == 2) {
                        Boolean bool2 = (Boolean) ((getBitmapui_graphics) getAppStateImpl.serializer).write("ACTIVITY_RECOGNITION_REQUESTED");
                        if (bool2 == null || !bool2.booleanValue() || (!((setEventDeduplicationIdsMaxSize) dropShadowEffect3.serializer).write() ? (objLogRiderSafetyPermissionGranted = dropShadowEffect3.logRiderSafetyPermissionGranted("activity_recognition", this)) != coroutineSingletons9 : (objLogRiderSafetyPermissionGranted = dropShadowEffect3.logRiderSafetyPermissionDenied("activity_recognition", this)) != coroutineSingletons9)) {
                            objLogRiderSafetyPermissionGranted = createfromparcel;
                        }
                        if (objLogRiderSafetyPermissionGranted != coroutineSingletons9) {
                            objLogRiderSafetyPermissionGranted = createfromparcel;
                        }
                    } else if (i28 == 3) {
                        Boolean bool3 = (Boolean) ((getBitmapui_graphics) getAppStateImpl.serializer).write("DISABLE_BATTERY_OPTIMIZATION_REQUESTED");
                        if (bool3 == null || !bool3.booleanValue() || (!((enablePlayStoreKidsComplianceInDelay) dropShadowEffect3.MediaDescriptionCompat).IconCompatParcelizer() ? (objLogRiderSafetyPermissionGranted = dropShadowEffect3.logRiderSafetyPermissionGranted("disable_battery_optimization", this)) != coroutineSingletons9 : (objLogRiderSafetyPermissionGranted = dropShadowEffect3.logRiderSafetyPermissionDenied("disable_battery_optimization", this)) != coroutineSingletons9)) {
                            objLogRiderSafetyPermissionGranted = createfromparcel;
                        }
                        if (objLogRiderSafetyPermissionGranted != coroutineSingletons9) {
                            objLogRiderSafetyPermissionGranted = createfromparcel;
                        }
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    }
                    return objLogRiderSafetyPermissionGranted == coroutineSingletons9 ? coroutineSingletons9 : createfromparcel;
                }
                if (i27 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.write;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch.write((isRoot) obj3, new Integer(this.IconCompatParcelizer));
                return createfromparcel;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.IconCompatParcelizer;
                if (i29 != 0) {
                    if (i29 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                GetAppStateImpl getAppStateImpl2 = ((getProcessName) this.write).MediaMetadataCompat;
                List list2 = ((getOnEventTrackingFailedListener) obj3).read;
                this.IconCompatParcelizer = 1;
                return getAppStateImpl2.invoke$implementation(list2, this) == coroutineSingletons11 ? coroutineSingletons11 : createfromparcel;
            case 11:
                lambdaremoveGlobalPartnerParameters31 lambdaremoveglobalpartnerparameters31 = (lambdaremoveGlobalPartnerParameters31) this.write;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.IconCompatParcelizer;
                if (i30 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (lambdaremoveglobalpartnerparameters31 instanceof lambdasendPreinstallReferrer19) {
                        this.write = null;
                        this.IconCompatParcelizer = 1;
                        return RealtimeStatusUpdateManagerImpl.access$updateState((RealtimeStatusUpdateManagerImpl) obj3, (lambdasendPreinstallReferrer19) lambdaremoveglobalpartnerparameters31, this) == coroutineSingletons12 ? coroutineSingletons12 : createfromparcel;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lambdaremoveglobalpartnerparameters31, lambdasetEnabled5.serializer}, getCieXyz.write())).booleanValue()) {
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                } else {
                    if (i30 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.IconCompatParcelizer;
                if (i31 != 0) {
                    if (i31 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = ((ZoomableNode) this.write).read;
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 == null) {
                    return createfromparcel;
                }
                this.IconCompatParcelizer = 1;
                return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke((Offset) obj3, this) == coroutineSingletons13 ? coroutineSingletons13 : createfromparcel;
            case 13:
                N$b n$b = (N$b) obj3;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.IconCompatParcelizer;
                if (i32 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    IOParser$Decoder iOParser$Decoder = (IOParser$Decoder) n$b.read;
                    this.IconCompatParcelizer = 1;
                    objM5142getSettingsIoAF18A = iOParser$Decoder.m5142getSettingsIoAF18A(this);
                    if (objM5142getSettingsIoAF18A != coroutineSingletons14) {
                    }
                    return coroutineSingletons14;
                }
                int i33 = serializer + 123;
                MediaMetadataCompat = i33 % Fields.SpotShadowColor;
                if (i33 % 2 != 0 ? i32 == 1 : i32 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objM5142getSettingsIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
                } else {
                    if (i32 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.write;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                objM5142getSettingsIoAF18A = obj2;
                return new onItemDismiss(objM5142getSettingsIoAF18A);
                if (!(objM5142getSettingsIoAF18A instanceof isItemDismissable)) {
                    this.write = objM5142getSettingsIoAF18A;
                    this.IconCompatParcelizer = 2;
                    if (N$b.access$updateCache(n$b, (r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) objM5142getSettingsIoAF18A, this) != coroutineSingletons14) {
                        obj2 = objM5142getSettingsIoAF18A;
                        objM5142getSettingsIoAF18A = obj2;
                    }
                    return coroutineSingletons14;
                }
                return new onItemDismiss(objM5142getSettingsIoAF18A);
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.IconCompatParcelizer;
                if (i34 != 0) {
                    if (i34 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (((r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI) this.write).write) {
                    return createfromparcel;
                }
                this.IconCompatParcelizer = 1;
                return ((SheetState) obj3).hide(this) == coroutineSingletons15 ? coroutineSingletons15 : createfromparcel;
            case 15:
                accessgetSdkEnablementProvidercp accessgetsdkenablementprovidercp = (accessgetSdkEnablementProvidercp) obj3;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = (getContentViewGroupParentLayout) this.write;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.IconCompatParcelizer;
                if (i35 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                    long jWrite = ((FirebaseRemoteConfigImpl) accessgetsdkenablementprovidercp.read).IconCompatParcelizer.write("home_host_loading_timeout_in_seconds");
                    if (jWrite > 0) {
                        lValueOf = Long.valueOf(jWrite);
                    }
                    if (r5 != 0) {
                        r5 = lValueOf;
                        jLongValue = r5.longValue();
                    } else {
                        r5 = lValueOf;
                        jLongValue = 40;
                    }
                    long jIconCompatParcelizer = UriKt.IconCompatParcelizer(jLongValue, setUnregisteredInAppMessage.SECONDS);
                    this.write = getcontentviewgroupparentlayout3;
                    this.IconCompatParcelizer = 1;
                    if (DelayKt.m5145delayVtjQ1oo(jIconCompatParcelizer, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i35 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                YieldKt.IconCompatParcelizer(getcontentviewgroupparentlayout3);
                accessgetsdkenablementprovidercp.serializer.IconCompatParcelizer(accessisInstanceStoppedp.Unavailable);
                return createfromparcel;
            case 16:
                lambda39 lambda39Var = (lambda39) this.write;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.IconCompatParcelizer;
                if (i36 != 0) {
                    if (i36 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0Write = lambda39Var.write.write();
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$2 = new NafathTimerDataStore$set$2(lambda39Var, (logBannerClicklambda0) obj3, r5, 19);
                this.IconCompatParcelizer = 1;
                Object objUpdateData = performcustomexitmxy_nc0Write.updateData(nafathTimerDataStore$set$2, this);
                return objUpdateData == coroutineSingletons17 ? coroutineSingletons17 : objUpdateData;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.IconCompatParcelizer;
                if (i37 != 0) {
                    if (i37 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) this.write;
                toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.CREATED;
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$1 = new PhotoIdUiModelImpl$1$1((OneClickStartWorkingViewModel) obj3, accessisrendernodecompatiblecp, r5, 23);
                this.IconCompatParcelizer = 1;
                return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp, tocolorlong8_81lla, photoIdUiModelImpl$1$1, this) == coroutineSingletons18 ? coroutineSingletons18 : createfromparcel;
            case 18:
                logPushDeliverylambda1 logpushdeliverylambda1 = (logPushDeliverylambda1) this.write;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.IconCompatParcelizer;
                if (i38 != 0) {
                    if (i38 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0Write2 = logpushdeliverylambda1.IconCompatParcelizer.write();
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$3 = new NafathTimerDataStore$set$2(logpushdeliverylambda1, (dismissBannerlambda1) obj3, r5, 20);
                this.IconCompatParcelizer = 1;
                Object objSerializer4 = pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0Write2, nafathTimerDataStore$set$3, this);
                return objSerializer4 == coroutineSingletons19 ? coroutineSingletons19 : objSerializer4;
            case 19:
                StartWorkingNavAction startWorkingNavAction = (StartWorkingNavAction) obj3;
                StartWorkingNavigationUiModelImpl startWorkingNavigationUiModelImpl = (StartWorkingNavigationUiModelImpl) this.write;
                getQueryContext getquerycontext = startWorkingNavigationUiModelImpl.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.IconCompatParcelizer;
                if (i39 != 0) {
                    if (i39 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        objInvoke = obj;
                    } else {
                        if (i39 == 2) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) startWorkingNavigationUiModelImpl.MediaSessionCompatQueueItem;
                firebaseRemoteConfigImpl.getClass();
                if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.WEB_VIEW_TNC_CONSENT_FLOW_ENABLED)) {
                    ((getRootInfoui) ((SemanticsOwner) startWorkingNavigationUiModelImpl.MediaDescriptionCompat.IconCompatParcelizer)).serializer("start_working_time_to_interactive");
                }
                JsonObjectSerializer jsonObjectSerializer = startWorkingNavigationUiModelImpl.read;
                this.IconCompatParcelizer = 1;
                objInvoke = jsonObjectSerializer.invoke(this);
                if (objInvoke != coroutineSingletons20) {
                }
                return coroutineSingletons20;
                logPushMaxCampaignlambda1 logpushmaxcampaignlambda1 = (logPushMaxCampaignlambda1) objInvoke;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{logpushmaxcampaignlambda1, logPushNotificationActionClickedlambda10.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    getquerycontext.serializer(new deleteRegisteredGeofenceCachelambda1(startWorkingNavAction));
                    return createfromparcel;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{logpushmaxcampaignlambda1, logPushMaxCampaignlambda0.write}, getCieXyz.write())).booleanValue()) {
                    getquerycontext.serializer(new deleteRegisteredGeofenceCachelambda0(startWorkingNavAction));
                    return createfromparcel;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{logpushmaxcampaignlambda1, logPushNotificationActionClickedlambda1.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                this.IconCompatParcelizer = 2;
                if (StartWorkingNavigationUiModelImpl.access$fetchAndNavigate(startWorkingNavigationUiModelImpl, startWorkingNavAction, this) != coroutineSingletons20) {
                    return createfromparcel;
                }
                return coroutineSingletons20;
            case 20:
                TwoFaViewModel twoFaViewModel = (TwoFaViewModel) this.write;
                requestSingleLocationUpdatelambda0 requestsinglelocationupdatelambda0 = twoFaViewModel.PlaybackStateCompat;
                getQueryContext getquerycontext2 = twoFaViewModel.MediaDescriptionCompat;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.IconCompatParcelizer;
                if (i40 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getquerycontext2.serializer(new schedulePushDeliverylambda1(true));
                    String str3 = ((setSdkAuthenticationSignaturelambda11) twoFaViewModel.ParcelableVolumeInfo.read()).IconCompatParcelizer;
                    this.IconCompatParcelizer = 1;
                    objM5072triggerFaCode0E7RQCE$implementation = twoFaViewModel.MediaBrowserCompatMediaItem.m5072triggerFaCode0E7RQCE$implementation((String) obj3, str3, this);
                    if (objM5072triggerFaCode0E7RQCE$implementation == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i40 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objM5072triggerFaCode0E7RQCE$implementation = ((onItemDismiss) obj).IconCompatParcelizer;
                }
                if (!(objM5072triggerFaCode0E7RQCE$implementation instanceof isItemDismissable)) {
                    twoFaViewModel.serializer = ((setSdkAuthenticationSignaturelambda10) objM5072triggerFaCode0E7RQCE$implementation).IconCompatParcelizer;
                    requestsinglelocationupdatelambda0.RemoteActionCompatParcelizer.logEvent("2fa_request_code_succeeded", null);
                    getquerycontext2.serializer(safeCallFlushDelayedInitPushAnalyticsQueue.IconCompatParcelizer);
                }
                Throwable thSerializer = onItemDismiss.serializer(objM5072triggerFaCode0E7RQCE$implementation);
                if (thSerializer != null) {
                    requestsinglelocationupdatelambda0.getClass();
                    requestsinglelocationupdatelambda0.IconCompatParcelizer.getClass();
                    requestsinglelocationupdatelambda0.RemoteActionCompatParcelizer.logEvent("2fa_request_code_failed", Path$Companion.RemoteActionCompatParcelizer(thSerializer));
                    getquerycontext2.serializer(new setGoogleAdvertisingIdlambda0(thSerializer));
                }
                getquerycontext2.serializer(new schedulePushDeliverylambda1(false));
                return createfromparcel;
            case 21:
                Uri uri = (Uri) obj3;
                DefaultBackgroundSoundManager defaultBackgroundSoundManager = (DefaultBackgroundSoundManager) this.write;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.IconCompatParcelizer;
                if (i41 != 0) {
                    if (i41 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.IconCompatParcelizer("Playing New delivery sound from new sound manager", new Object[0]);
                if (defaultBackgroundSoundManager.RatingCompat == null) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(defaultBackgroundSoundManager.read.write, uri);
                    ringtone2.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
                    defaultBackgroundSoundManager.RatingCompat = ringtone2;
                }
                if (defaultBackgroundSoundManager.RatingCompat == null) {
                    forest.IconCompatParcelizer("Ringtone is null. Cannot play New delivery sound from new sound manager", new Object[0]);
                }
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) defaultBackgroundSoundManager.write.serializer;
                String str4 = firebaseRemoteConfigImpl2.read.read();
                if (str4 == null) {
                    jLongValue2 = 0;
                } else if (m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_AUDIO_DUCKING_ENABLED, firebaseRemoteConfigImpl2.IconCompatParcelizer, str4, firebaseRemoteConfigImpl2)) {
                    subscribeToChangeUserEventslambda31 subscribetochangeusereventslambda31 = defaultBackgroundSoundManager.serializer;
                    if (((AudioManager) subscribetochangeusereventslambda31.write.MediaSessionCompatResultReceiverWrapper()).requestAudioFocus(subscribetochangeusereventslambda31.IconCompatParcelizer) == 1) {
                        Context applicationContext = defaultBackgroundSoundManager.IconCompatParcelizer.getApplicationContext();
                        applicationContext.getClass();
                        Long l2 = (Long) defaultBackgroundSoundManager.MediaDescriptionCompat.serializer.get(uri);
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                        } else {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            try {
                                MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
                                try {
                                    mediaMetadataRetriever2.setDataSource(applicationContext, uri);
                                    String strExtractMetadata = mediaMetadataRetriever2.extractMetadata(9);
                                    jLongValue3 = (strExtractMetadata != null && (lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(strExtractMetadata)) != null) ? lParcelableVolumeInfo.longValue() : 0L;
                                } catch (Exception e9) {
                                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e9, "Failed to calculate ringtone length", new Object[0]);
                                }
                                Okio.RemoteActionCompatParcelizer(mediaMetadataRetriever, null);
                                jLongValue2 = jLongValue3;
                                break;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    Okio.RemoteActionCompatParcelizer(mediaMetadataRetriever, th);
                                    throw th2;
                                }
                            }
                        }
                    } else {
                        jLongValue2 = 0;
                    }
                } else {
                    jLongValue2 = 0;
                }
                if ((((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) defaultBackgroundSoundManager.MediaMetadataCompat, updateAdidI.IS_OVERRIDE_SILENT_MODE_ENABLED})).booleanValue() || ((AudioManager) defaultBackgroundSoundManager.RemoteActionCompatParcelizer.write()).getRingerMode() != 0) && (ringtone = defaultBackgroundSoundManager.RatingCompat) != null) {
                    ringtone.play();
                }
                if (jLongValue2 <= 0) {
                    return createfromparcel;
                }
                this.IconCompatParcelizer = 1;
                return DefaultBackgroundSoundManager.access$scheduleAudioFocusAbandonment(defaultBackgroundSoundManager, jLongValue2, this) == coroutineSingletons22 ? coroutineSingletons22 : createfromparcel;
            case 22:
                getConfigurationProviderSafeandroid_sdk_base_release getconfigurationprovidersafeandroid_sdk_base_release = (getConfigurationProviderSafeandroid_sdk_base_release) this.write;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = this.IconCompatParcelizer;
                if (i42 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.IconCompatParcelizer = 1;
                    objFetchVendorReviewConfig = getconfigurationprovidersafeandroid_sdk_base_release.RemoteActionCompatParcelizer.fetchVendorReviewConfig((getContentCardUnviewedCount) obj3, this);
                    if (objFetchVendorReviewConfig == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i42 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objFetchVendorReviewConfig = obj;
                }
                getContentCardsLastUpdatedInSecondsFromEpoch getcontentcardslastupdatedinsecondsfromepoch = (getContentCardsLastUpdatedInSecondsFromEpoch) objFetchVendorReviewConfig;
                if (getcontentcardslastupdatedinsecondsfromepoch == null) {
                    return null;
                }
                int i43 = serializer + 97;
                MediaMetadataCompat = i43 % Fields.SpotShadowColor;
                int i44 = 16;
                if (i43 % 2 == 0) {
                    getconfigurationprovidersafeandroid_sdk_base_release.write.getClass();
                    list = getcontentcardslastupdatedinsecondsfromepoch.scores;
                    iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list, 75));
                    if (iRemoteActionCompatParcelizer >= 26) {
                        i44 = iRemoteActionCompatParcelizer;
                    }
                } else {
                    getconfigurationprovidersafeandroid_sdk_base_release.write.getClass();
                    list = getcontentcardslastupdatedinsecondsfromepoch.scores;
                    iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list, 10));
                    if (iRemoteActionCompatParcelizer >= 16) {
                        i44 = iRemoteActionCompatParcelizer;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(i44);
                for (closeSession closesession : list) {
                    linkedHashMap.put(Integer.valueOf(closesession.value), new logFeatureFlagImpression(closesession.value, closesession.label, closesession.question, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(closesession.tags)));
                }
                List<deserializeInAppMessageString> list3 = getcontentcardslastupdatedinsecondsfromepoch.tags;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                for (deserializeInAppMessageString deserializeinappmessagestring : list3) {
                    arrayList.add(new requestBannersRefresh(deserializeinappmessagestring.key, deserializeinappmessagestring.text, false, false));
                }
                return new logPushNotificationActionClicked(arrayList, linkedHashMap);
            case 23:
                WebView webView = (WebView) obj3;
                O$b o$b = (O$b) this.write;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i45 = this.IconCompatParcelizer;
                if (i45 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i46 = subscribeToContentCardsUpdates.IconCompatParcelizer[((subscribeToSdkAuthenticationFailures) o$b.IconCompatParcelizer).read.serializer.ordinal()];
                    if (i46 != 1) {
                        if (i46 != 2) {
                            return createfromparcel;
                        }
                        IsApplicantSessionAvailableUseCaseImpl isApplicantSessionAvailableUseCaseImpl = (IsApplicantSessionAvailableUseCaseImpl) ((Lazy) o$b.read).write();
                        this.IconCompatParcelizer = 2;
                        objInvoke2 = isApplicantSessionAvailableUseCaseImpl.invoke(this);
                        if (objInvoke2 != coroutineSingletons24) {
                        }
                    } else {
                        if (((pageDowndefault) o$b.serializer).RemoteActionCompatParcelizer.serializer.RemoteActionCompatParcelizer() == null) {
                            return createfromparcel;
                        }
                        String strIconCompatParcelizer = ((zzz) o$b.RemoteActionCompatParcelizer).IconCompatParcelizer();
                        this.IconCompatParcelizer = 1;
                        if (O$b.access$proceedWithJsInject(o$b, webView, strIconCompatParcelizer, this) != coroutineSingletons24) {
                            return createfromparcel;
                        }
                    }
                    return coroutineSingletons24;
                }
                if (i45 != 1) {
                    if (i45 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        objInvoke2 = obj;
                    } else if (i45 != 3) {
                        int i47 = MediaMetadataCompat + 15;
                        serializer = i47 % Fields.SpotShadowColor;
                        if (i47 % 2 == 0 ? i45 != 4 : i45 != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        objInvoke3 = obj;
                    }
                    str = (String) objInvoke3;
                    if (str == null) {
                        return createfromparcel;
                    }
                    this.IconCompatParcelizer = 4;
                    if (O$b.access$proceedWithJsInject(o$b, webView, str, this) != coroutineSingletons24) {
                        return createfromparcel;
                    }
                    return coroutineSingletons24;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
                if (!((Boolean) objInvoke2).booleanValue()) {
                    return createfromparcel;
                }
                GetApplicantAccessTokenUseCaseImpl getApplicantAccessTokenUseCaseImpl = (GetApplicantAccessTokenUseCaseImpl) o$b.write;
                this.IconCompatParcelizer = 3;
                objInvoke3 = getApplicantAccessTokenUseCaseImpl.invoke(this);
                if (objInvoke3 != coroutineSingletons24) {
                    str = (String) objInvoke3;
                    if (str == null) {
                        return createfromparcel;
                    }
                    this.IconCompatParcelizer = 4;
                    if (O$b.access$proceedWithJsInject(o$b, webView, str, this) != coroutineSingletons24) {
                        return createfromparcel;
                    }
                }
                return coroutineSingletons24;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i48 = this.IconCompatParcelizer;
                if (i48 != 0) {
                    if (i48 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2 = (accessisRenderNodeCompatiblecp) this.write;
                toColorLong8_81llA tocolorlong8_81lla2 = toColorLong8_81llA.STARTED;
                RxConvertKt$asSingle$1 rxConvertKt$asSingle$1 = new RxConvertKt$asSingle$1((BrazeExternalSyntheticLambda29) obj3, r5, 14);
                this.IconCompatParcelizer = 1;
                return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp2, tocolorlong8_81lla2, rxConvertKt$asSingle$1, this) == coroutineSingletons25 ? coroutineSingletons25 : createfromparcel;
            case 25:
                return invokeSuspend$com$roadrunner$web$presentation$authWebView$AuthWebViewModel$setWebData$1(obj);
            default:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i49 = this.IconCompatParcelizer;
                if (i49 != 0) {
                    if (i49 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CountDownTimerUiModel$observeTimerState$$inlined$map$1 countDownTimerUiModel$observeTimerState$$inlined$map$1 = (CountDownTimerUiModel$observeTimerState$$inlined$map$1) this.write;
                ViewModelExtensionsKt$viewModelScoped$4$1 viewModelExtensionsKt$viewModelScoped$4$1 = new ViewModelExtensionsKt$viewModelScoped$4$1(i3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3);
                this.IconCompatParcelizer = 1;
                return countDownTimerUiModel$observeTimerState$$inlined$map$1.collect(viewModelExtensionsKt$viewModelScoped$4$1, this) == coroutineSingletons26 ? coroutineSingletons26 : createfromparcel;
        }
    }
}
