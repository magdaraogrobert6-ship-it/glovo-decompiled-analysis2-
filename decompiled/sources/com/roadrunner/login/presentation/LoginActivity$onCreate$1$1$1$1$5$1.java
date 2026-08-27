package com.roadrunner.login.presentation;

import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2;
import com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1;
import com.roadrunner.liveness.failure.presentation.FailureViewModel;
import com.roadrunner.liveness.presentation.LivenessDetectionActivity;
import com.roadrunner.location.toggle.api.bottomsheet.EnableLocationUiModel;
import com.roadrunner.location.toggle.presentation.bottomsheet.EnableLocationUiModelImpl;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.checkemail.CheckEmailViewModel$startTimer$1;
import com.roadrunner.login.presentation.riderhiring.RiderHiringViewModel$logoutApplicant$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.N$b;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C0180k;
import o.ConnectionPoolImpl;
import o.ConstraintTrackingWorkerConstraintUnsatisfiedException;
import o.RoomDatabaseperformClear11;
import o.SchedulersExternalSyntheticLambda1;
import o.ShortNewsContentCardView;
import o.SparseArraySerializerSparseArraySurrogateCompanion;
import o.SqlDriverDefaultImpls;
import o.TextUnitTypeCompanion;
import o.Transacter;
import o.TriggerBasedInvalidationTracker;
import o.TriggerBasedInvalidationTrackercreateFlow12;
import o.TriggerBasedInvalidationTrackernotifyInvalidation2invalidatedTableIds1;
import o.TriggerBasedInvalidationTrackersyncTriggers2111;
import o.TurbineTimeoutCancellationException;
import o.UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1;
import o.WorkerKtExternalSyntheticLambda2;
import o.WorkerParameters;
import o.WorkerWrapperKt;
import o.accessstopTrackingTable;
import o.bc;
import o.compareTo0680j_4;
import o.createFromParcel;
import o.decode;
import o.emitcomroadrunnerdeliverycommondataChatAvailabilityManagerobserveChatConfigAvailabilityinlinedmap12;
import o.getAndClearParameters;
import o.getContentViewGroupParentLayout;
import o.getQueryContext;
import o.getUseEvaluationsCachefwf_client_release;
import o.offsetChildrenVertical;
import o.onBackPressed;
import o.onMove;
import o.onPostMigrate;
import o.onPreMigrate;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.toBitmapConfig1JJdX4A;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LoginActivity$onCreate$1$1$1$1$5$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$onCreate$1$1$1$1$5$1(LivenessDetectionActivity livenessDetectionActivity, int i) {
        super(0, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "onCancelLivenessDetection", "onCancelLivenessDetection()V");
        this.serializer = i;
        switch (i) {
            case 12:
                super(0, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "fallbackToOldFlow", "fallbackToOldFlow()V");
                break;
            case 13:
                super(0, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "cancelLivenessFlow", "cancelLivenessFlow()V");
                break;
            case 14:
                super(0, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "completeLivenessFlow", "completeLivenessFlow()V");
                break;
            case 15:
                super(0, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "navigateToRecordingScreen", "navigateToRecordingScreen()V");
                break;
            case 16:
            default:
                break;
            case 17:
                super(0, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "navigateToReviewScreen", "navigateToReviewScreen()V");
                break;
            case 18:
                super(0, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "navigateToInstruction", "navigateToInstruction()V");
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginActivity$onCreate$1$1$1$1$5$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.serializer = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$onCreate$1$1$1$1$5$1(LoginActivity loginActivity) {
        super(0, 0, LoginActivity.class, loginActivity, "navigateToMainAndFinish", "navigateToMainAndFinish()V");
        this.serializer = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$onCreate$1$1$1$1$5$1(bc bcVar, int i) {
        super(0, 0, bc.class, bcVar, "initiateRiderHiringLaunch", "initiateRiderHiringLaunch()V");
        this.serializer = i;
        if (i != 23) {
        } else {
            super(0, 0, bc.class, bcVar, "onRiderHiringFailed", "onRiderHiringFailed()V");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$onCreate$1$1$1$1$5$1(Object obj) {
        super(0, 0, SparseArraySerializerSparseArraySurrogateCompanion.class, obj, "checkForCameraPermission", "checkForCameraPermission()V");
        this.serializer = 16;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws Throwable {
        Object obj;
        Object obj2;
        int i = 2 % 2;
        int i2 = this.serializer;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = TriggerBasedInvalidationTracker.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 3;
        int i4 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i2) {
            case 0:
                LoginActivity.RemoteActionCompatParcelizer(1662806839, TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat(), -1662806826, new Object[]{(LoginActivity) this.MediaMetadataCompat});
                return createfromparcel;
            case 1:
                ((offsetChildrenVertical) this.MediaMetadataCompat).serializer();
                return createfromparcel;
            case 2:
                return ((offsetChildrenVertical) this.MediaMetadataCompat).IconCompatParcelizer.IconCompatParcelizer();
            case 3:
                offsetChildrenVertical offsetchildrenvertical = (offsetChildrenVertical) this.MediaMetadataCompat;
                offsetchildrenvertical.getClass();
                Timber.RemoteActionCompatParcelizer.getClass();
                N$b n$b = offsetchildrenvertical.MediaDescriptionCompat;
                if (n$b != null) {
                    BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) n$b.serializer, null, null, new InAppNotificationsLogger$logInAppMessageViewed$1(n$b, shortNewsContentCardView, i4), 3);
                }
                int i5 = IconCompatParcelizer + 125;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 10 / 0;
                }
                return createfromparcel;
            case 4:
                ((onPostMigrate) this.MediaMetadataCompat).read.IconCompatParcelizer(triggerBasedInvalidationTracker);
                return createfromparcel;
            case 5:
                onPostMigrate onpostmigrate = (onPostMigrate) this.MediaMetadataCompat;
                onpostmigrate.read.IconCompatParcelizer(triggerBasedInvalidationTracker);
                onpostmigrate.RemoteActionCompatParcelizer.serializer(onPreMigrate.RemoteActionCompatParcelizer);
                return createfromparcel;
            case 6:
                FailureViewModel failureViewModel = (FailureViewModel) this.MediaMetadataCompat;
                OtpLogger otpLogger = failureViewModel.MediaBrowserCompatMediaItem;
                getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_release = failureViewModel.RatingCompat;
                int i7 = getuseevaluationscachefwf_client_release.write;
                decode decodeVar = otpLogger.IconCompatParcelizer;
                Map mapSingletonMap = Collections.singletonMap("retry_count", String.valueOf(i7));
                mapSingletonMap.getClass();
                decodeVar.logEvent("liveness_fail_retry_clicked", mapSingletonMap);
                RoomDatabaseperformClear11 roomDatabaseperformClear11 = failureViewModel.read;
                RoomDatabaseperformClear11 roomDatabaseperformClear12 = RoomDatabaseperformClear11.MLKIT_ERROR;
                getQueryContext getquerycontext = failureViewModel.RemoteActionCompatParcelizer;
                if (roomDatabaseperformClear11 == roomDatabaseperformClear12) {
                    getquerycontext.serializer(TriggerBasedInvalidationTrackercreateFlow12.RemoteActionCompatParcelizer);
                } else {
                    getquerycontext.serializer(TriggerBasedInvalidationTrackernotifyInvalidation2invalidatedTableIds1.read);
                    getuseevaluationscachefwf_client_release.write++;
                }
                return createfromparcel;
            case 7:
                FailureViewModel failureViewModel2 = (FailureViewModel) this.MediaMetadataCompat;
                MutableStateFlow mutableStateFlow = failureViewModel2.write;
                mutableStateFlow.write(accessstopTrackingTable.IconCompatParcelizer((accessstopTrackingTable) mutableStateFlow.read(), failureViewModel2.MediaMetadataCompat, null, 191));
                return createfromparcel;
            case 8:
                MutableStateFlow mutableStateFlow2 = ((FailureViewModel) this.MediaMetadataCompat).write;
                do {
                    obj = mutableStateFlow2.read();
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj, accessstopTrackingTable.IconCompatParcelizer((accessstopTrackingTable) obj, null, null, 63)));
                int i8 = read + 125;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return createfromparcel;
            case 9:
                FailureViewModel failureViewModel3 = (FailureViewModel) this.MediaMetadataCompat;
                failureViewModel3.MediaBrowserCompatMediaItem.IconCompatParcelizer.logEvent("liveness_more_reasons_clicked", null);
                MutableStateFlow mutableStateFlow3 = failureViewModel3.write;
                do {
                    obj2 = mutableStateFlow3.read();
                } while (!mutableStateFlow3.RemoteActionCompatParcelizer(obj2, accessstopTrackingTable.IconCompatParcelizer((accessstopTrackingTable) obj2, null, failureViewModel3.IconCompatParcelizer, 127)));
                return createfromparcel;
            case 10:
                FailureViewModel failureViewModel4 = (FailureViewModel) this.MediaMetadataCompat;
                OtpLogger otpLogger2 = failureViewModel4.MediaBrowserCompatMediaItem;
                int i10 = failureViewModel4.RatingCompat.write;
                decode decodeVar2 = otpLogger2.IconCompatParcelizer;
                Map mapSingletonMap2 = Collections.singletonMap("retry_count", String.valueOf(i10));
                mapSingletonMap2.getClass();
                decodeVar2.logEvent("liveness_fail_proceed_clicked", mapSingletonMap2);
                getQueryContext getquerycontext2 = failureViewModel4.RemoteActionCompatParcelizer;
                getquerycontext2.serializer(TriggerBasedInvalidationTrackersyncTriggers2111.IconCompatParcelizer);
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(failureViewModel4, new TooltipStateImpl.AnonymousClass2(failureViewModel4, shortNewsContentCardView, 16));
                getquerycontext2.serializer(ConnectionPoolImpl.IconCompatParcelizer);
                return createfromparcel;
            case 11:
                LivenessDetectionActivity.MediaMetadataCompat((LivenessDetectionActivity) this.MediaMetadataCompat);
                return createfromparcel;
            case 12:
                LivenessDetectionActivity.write((LivenessDetectionActivity) this.MediaMetadataCompat);
                return createfromparcel;
            case 13:
                LivenessDetectionActivity.RemoteActionCompatParcelizer(-218475005, compareTo0680j_4.serializer(), 218475005, compareTo0680j_4.serializer(), new Object[]{(LivenessDetectionActivity) this.MediaMetadataCompat}, compareTo0680j_4.serializer(), compareTo0680j_4.serializer());
                return createfromparcel;
            case 14:
                LivenessDetectionActivity.IconCompatParcelizer((LivenessDetectionActivity) this.MediaMetadataCompat);
                return createfromparcel;
            case 15:
                LivenessDetectionActivity.MediaBrowserCompatMediaItem((LivenessDetectionActivity) this.MediaMetadataCompat);
                return createfromparcel;
            case 16:
                r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtu = ((SparseArraySerializerSparseArraySurrogateCompanion) this.MediaMetadataCompat).read;
                onBackPressed onbackpressed = r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtu.write;
                if (onbackpressed != null) {
                    onbackpressed.write(r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtu.IconCompatParcelizer);
                    return createfromparcel;
                }
                removeNodeAtDepth.serializer("activityResultLauncher");
                throw null;
            case 17:
                LivenessDetectionActivity.MediaSessionCompatQueueItem((LivenessDetectionActivity) this.MediaMetadataCompat);
                return createfromparcel;
            case 18:
                LivenessDetectionActivity.MediaDescriptionCompat((LivenessDetectionActivity) this.MediaMetadataCompat);
                return createfromparcel;
            case 19:
                WorkerWrapperKt workerWrapperKt = (WorkerWrapperKt) this.MediaMetadataCompat;
                int i11 = emitcomroadrunnerdeliverycommondataChatAvailabilityManagerobserveChatConfigAvailabilityinlinedmap12.IconCompatParcelizer[workerWrapperKt.MediaMetadataCompat.write().ordinal()];
                if (i11 == 1) {
                    WorkerParameters workerParameters = (WorkerParameters) workerWrapperKt.MediaBrowserCompatMediaItem.read();
                    if (workerParameters instanceof WorkerKtExternalSyntheticLambda2) {
                        boolean z = !((WorkerKtExternalSyntheticLambda2) workerParameters).write;
                        decode decodeVar3 = workerWrapperKt.IconCompatParcelizer.write;
                        Map mapSingletonMap3 = Collections.singletonMap("is_toggle_enabled", String.valueOf(z));
                        mapSingletonMap3.getClass();
                        decodeVar3.logEvent("location_sharing_icon_click", mapSingletonMap3);
                        workerWrapperKt.MediaSessionCompatQueueItem.IconCompatParcelizer(z);
                    }
                } else if (i11 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    createfromparcel = null;
                }
                int i12 = IconCompatParcelizer + 19;
                read = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    return createfromparcel;
                }
                shortNewsContentCardView.hashCode();
                throw null;
            case 20:
                ((WorkerWrapperKt) this.MediaMetadataCompat).RatingCompat.serializer.IconCompatParcelizer(Boolean.FALSE);
                return createfromparcel;
            case 21:
                EnableLocationUiModelImpl enableLocationUiModelImpl = (EnableLocationUiModelImpl) ((EnableLocationUiModel) this.MediaMetadataCompat);
                int i13 = ConstraintTrackingWorkerConstraintUnsatisfiedException.IconCompatParcelizer[enableLocationUiModelImpl.MediaBrowserCompatMediaItem.write().ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                if (!(((SchedulersExternalSyntheticLambda1) enableLocationUiModelImpl.MediaMetadataCompat.read()) instanceof UnfinishedWorkListenerKtmaybeLaunchUnfinishedWorkListener1)) {
                    return createfromparcel;
                }
                enableLocationUiModelImpl.serializer.write.logEvent("location_sharing_button_click", null);
                enableLocationUiModelImpl.MediaDescriptionCompat.IconCompatParcelizer(true);
                return createfromparcel;
            case 22:
                bc bcVar = (bc) this.MediaMetadataCompat;
                bcVar.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(bcVar), null, null, new RiderHiringViewModel$logoutApplicant$1(bcVar, shortNewsContentCardView, 4), 3);
                return createfromparcel;
            case 23:
                ((bc) this.MediaMetadataCompat).MediaMetadataCompat.serializer(SqlDriverDefaultImpls.Applicant, false, false);
                return createfromparcel;
            case 24:
                LoginActivityViewModel.MediaSessionCompatToken((LoginActivityViewModel) this.MediaMetadataCompat);
                return createfromparcel;
            case 25:
                TurbineTimeoutCancellationException turbineTimeoutCancellationException = (TurbineTimeoutCancellationException) this.MediaMetadataCompat;
                OtpLogger otpLogger3 = turbineTimeoutCancellationException.read;
                Transacter transacter = Transacter.EMAIL;
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) turbineTimeoutCancellationException.RatingCompat;
                firebaseRemoteConfigImpl.getClass();
                boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED);
                otpLogger3.getClass();
                transacter.getClass();
                otpLogger3.IconCompatParcelizer.logEvent("reset_password_request_again_clicked", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(transacter.getParamKey(), transacter.getType()), new onViewAttachedToWindowlambda0("isResetPasswordFlexibilityEnabled", String.valueOf(zIconCompatParcelizer))));
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(turbineTimeoutCancellationException, new CheckEmailViewModel$startTimer$1(turbineTimeoutCancellationException, shortNewsContentCardView, i4));
                return createfromparcel;
            case 26:
                ((TurbineTimeoutCancellationException) this.MediaMetadataCompat).MediaBrowserCompatMediaItem.serializer(getAndClearParameters.IconCompatParcelizer);
                return createfromparcel;
            case 27:
                C0180k c0180k = (C0180k) this.MediaMetadataCompat;
                c0180k.getClass();
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(c0180k, new ClearDatabaseUseCase$invoke$2(c0180k, shortNewsContentCardView, i3));
                return createfromparcel;
            case 28:
                ((C0180k) this.MediaMetadataCompat).read.IconCompatParcelizer.IconCompatParcelizer("Reset Password Screen", null);
                return createfromparcel;
            default:
                ((C0180k) this.MediaMetadataCompat).read.IconCompatParcelizer.logEvent("forgot_password_back", null);
                return createfromparcel;
        }
    }
}
