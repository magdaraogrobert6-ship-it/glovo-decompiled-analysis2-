package com.roadrunner.rider.state.cashblock.presentation;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.EmailAndPhoneViewModel$callValidatePhoneApi$2;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.OtpVerificationViewModel$triggerOtp$1;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.PasswordCreationViewModel;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager$initializeInternal$1;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionViewModel$onNextClick$1;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportViewModel$1;
import com.roadrunner.rider.state.cashblock.api.presentation.CashBlockUiModel;
import com.roadrunner.rider.state.futureshift.api.presentation.FutureShiftUiModel;
import com.roadrunner.rider.state.futureshift.presentation.FutureShiftUiModelImpl;
import com.roadrunner.rider.state.offertowork.api.presentation.OfferToWorkUiModel;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkUiModelImpl;
import com.roadrunner.rider.state.ondemand.api.bonus.OnDemandWithBonusUiModel;
import com.roadrunner.rider.state.ondemand.bonus.OnDemandWithBonusUiModelImpl;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ActivityHandler2;
import o.ActivityHandler28;
import o.ActivityHandler34;
import o.ActivityHandler39;
import o.AdjustAdRevenue;
import o.AdjustInstance1;
import o.AdjustInstance10;
import o.AdjustInstance11;
import o.AdjustInstance13;
import o.AdjustInstanceExternalSyntheticLambda0;
import o.AttributionHandler3;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.doInBackground;
import o.generatePOSTBodyString;
import o.getABI;
import o.getContentViewGroupParentLayout;
import o.getDefaultTracker;
import o.getFbAppId;
import o.getGoogleAdId;
import o.getLogger;
import o.getOnAttributionReadListener;
import o.getOnDeeplinkResponseListener;
import o.getOnEventTrackingFailedListener;
import o.getOnSessionTrackingSucceededListener;
import o.getPartnerSharingSettings;
import o.getProcessName;
import o.inCompatibilityMode;
import o.isFbIdReadingEnabled;
import o.isPresent;
import o.onFail;
import o.onInstallReferrerRead;
import o.onMove;
import o.onPostExecute;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeGlobalCallbackParametersI;
import o.removeGlobalPartnerParameter;
import o.removeSingleSubscriptionlambda101;
import o.sendInstallReferrer;
import o.sendPreinstallReferrer;
import o.setEnabledI;
import o.setTransactionSuccessful;
import o.shouldProcessEventI;
import o.toBitmapConfig1JJdX4A;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CashBlockKt$CashBlock$1$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashBlockKt$CashBlock$1$1(OfferToWorkUiModel offerToWorkUiModel) {
        super(0, 0, OfferToWorkUiModel.class, offerToWorkUiModel, "onBecomeUnavailableClick", "onBecomeUnavailableClick()V");
        this.write = 23;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashBlockKt$CashBlock$1$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.write = i3;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object getoneventtrackingfailedlistener;
        String strValueOf;
        String str;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        onFail onfail = onFail.write;
        ActivityHandler34 activityHandler34 = ActivityHandler34.write;
        getOnAttributionReadListener getonattributionreadlistener = getOnAttributionReadListener.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = 1;
        int i5 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i3) {
            case 0:
                ((CashBlockUiModelImpl) ((CashBlockUiModel) this.MediaMetadataCompat)).IconCompatParcelizer.IconCompatParcelizer.logEvent("cashblock_displayed", null);
                return createfromparcel;
            case 1:
                shouldProcessEventI shouldprocesseventi = (shouldProcessEventI) this.MediaMetadataCompat;
                shouldprocesseventi.IconCompatParcelizer.IconCompatParcelizer(setEnabledI.serializer);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(shouldprocesseventi), null, null, new NafathModalUiModelImpl$1(shouldprocesseventi, shortNewsContentCardView, 8), 3);
                return createfromparcel;
            case 2:
                removeGlobalPartnerParameter removeglobalpartnerparameter = (removeGlobalPartnerParameter) this.MediaMetadataCompat;
                removeglobalpartnerparameter.IconCompatParcelizer.IconCompatParcelizer("");
                MutableStateFlow mutableStateFlow = removeglobalpartnerparameter.RemoteActionCompatParcelizer;
                do {
                    obj = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj, false, null, false, removeglobalpartnerparameter.serializer, "", 116735)));
                return createfromparcel;
            case 3:
                removeGlobalPartnerParameter removeglobalpartnerparameter2 = (removeGlobalPartnerParameter) this.MediaMetadataCompat;
                MutableStateFlow mutableStateFlow2 = removeglobalpartnerparameter2.RemoteActionCompatParcelizer;
                do {
                    obj2 = mutableStateFlow2.read();
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj2, true, null, false, null, null, 131070)));
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(removeglobalpartnerparameter2), null, null, new EmailAndPhoneViewModel$callValidatePhoneApi$2(removeglobalpartnerparameter2, shortNewsContentCardView, i5), 3);
                int i6 = serializer + 7;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createfromparcel;
            case 4:
                removeGlobalPartnerParameter removeglobalpartnerparameter3 = (removeGlobalPartnerParameter) this.MediaMetadataCompat;
                ff$$ExternalSyntheticOutline0.m("source", "email and phone screen", removeglobalpartnerparameter3.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer, "sign_in_btn_clicked");
                removeglobalpartnerparameter3.MediaBrowserCompatMediaItem.serializer(sendInstallReferrer.write);
                return createfromparcel;
            case 5:
                ((removeGlobalPartnerParameter) this.MediaMetadataCompat).MediaBrowserCompatMediaItem.serializer(sendPreinstallReferrer.IconCompatParcelizer);
                return createfromparcel;
            case 6:
                MutableStateFlow mutableStateFlow3 = ((removeGlobalPartnerParameter) this.MediaMetadataCompat).RemoteActionCompatParcelizer;
                if (((removeGlobalCallbackParametersI) mutableStateFlow3.read()).MediaSessionCompatToken) {
                    do {
                        obj3 = mutableStateFlow3.read();
                    } while (!mutableStateFlow3.RemoteActionCompatParcelizer(obj3, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj3, false, null, true, null, null, 129023)));
                } else {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Phone prefix tapped but picker is disabled for this login type", new Object[0]);
                }
                return createfromparcel;
            case 7:
                OtpVerificationViewModel otpVerificationViewModel = (OtpVerificationViewModel) this.MediaMetadataCompat;
                ((decode) otpVerificationViewModel.write.IconCompatParcelizer).logEvent("account_creation_otp_resend_clicked", null);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(otpVerificationViewModel), null, null, new OtpVerificationViewModel$triggerOtp$1(otpVerificationViewModel, null), 3);
                return createfromparcel;
            case 8:
                PasswordCreationViewModel passwordCreationViewModel = (PasswordCreationViewModel) this.MediaMetadataCompat;
                passwordCreationViewModel.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer.logEvent("try_again_btn_clicked", null);
                passwordCreationViewModel.MediaSessionCompatResultReceiverWrapper.serializer(onfail);
                return createfromparcel;
            case 9:
                PasswordCreationViewModel passwordCreationViewModel2 = (PasswordCreationViewModel) this.MediaMetadataCompat;
                ff$$ExternalSyntheticOutline0.m("source", "snackbar", passwordCreationViewModel2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer, "sign_in_btn_clicked");
                passwordCreationViewModel2.MediaSessionCompatResultReceiverWrapper.serializer(activityHandler34);
                return createfromparcel;
            case 10:
                PasswordCreationViewModel passwordCreationViewModel3 = (PasswordCreationViewModel) this.MediaMetadataCompat;
                passwordCreationViewModel3.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer.logEvent("try_again_btn_clicked", null);
                passwordCreationViewModel3.MediaSessionCompatResultReceiverWrapper.serializer(onfail);
                return createfromparcel;
            case 11:
                PasswordCreationViewModel passwordCreationViewModel4 = (PasswordCreationViewModel) this.MediaMetadataCompat;
                ff$$ExternalSyntheticOutline0.m("source", "snackbar", passwordCreationViewModel4.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer, "sign_in_btn_clicked");
                passwordCreationViewModel4.MediaSessionCompatResultReceiverWrapper.serializer(activityHandler34);
                return createfromparcel;
            case 12:
                PasswordCreationViewModel passwordCreationViewModel5 = (PasswordCreationViewModel) this.MediaMetadataCompat;
                MutableStateFlow mutableStateFlow4 = passwordCreationViewModel5.MediaMetadataCompat;
                do {
                    obj4 = mutableStateFlow4.read();
                } while (!mutableStateFlow4.RemoteActionCompatParcelizer(obj4, ActivityHandler39.write((ActivityHandler39) obj4, null, null, false, null, true, 131055)));
                passwordCreationViewModel5.RemoteActionCompatParcelizer.IconCompatParcelizer(new ActivityHandler28(((FirebaseRemoteConfigImpl) passwordCreationViewModel5.ParcelableVolumeInfo).IconCompatParcelizer.read("account_creation_captcha_web_view_url")));
                return createfromparcel;
            case 13:
                ((PasswordCreationViewModel) this.MediaMetadataCompat).MediaSessionCompatResultReceiverWrapper.serializer(onInstallReferrerRead.IconCompatParcelizer);
                return createfromparcel;
            case 14:
                ActivityHandler2 activityHandler2 = (ActivityHandler2) this.MediaMetadataCompat;
                activityHandler2.IconCompatParcelizer.IconCompatParcelizer(Boolean.TRUE);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(activityHandler2), null, null, new NafathModalUiModelImpl$1(activityHandler2, shortNewsContentCardView, 12), 3);
                return createfromparcel;
            case 15:
                RiderSafetyLifecycleManager riderSafetyLifecycleManager = (RiderSafetyLifecycleManager) this.MediaMetadataCompat;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = riderSafetyLifecycleManager.PlaybackStateCompat;
                ((inCompatibilityMode) riderSafetyLifecycleManager.write).getClass();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new RiderSafetyLifecycleManager$initializeInternal$1(riderSafetyLifecycleManager, shortNewsContentCardView, i4), 2);
                return createfromparcel;
            case 16:
                AdjustAdRevenue adjustAdRevenue = (AdjustAdRevenue) this.MediaMetadataCompat;
                adjustAdRevenue.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(adjustAdRevenue), null, null, new RiderSafetyPermissionViewModel$onNextClick$1(adjustAdRevenue, shortNewsContentCardView, i5), 3);
                return createfromparcel;
            case 17:
                ((AdjustAdRevenue) this.MediaMetadataCompat).IconCompatParcelizer.serializer(getGoogleAdId.read);
                return createfromparcel;
            case 18:
                ((getProcessName) this.MediaMetadataCompat).RatingCompat.serializer(getFbAppId.RemoteActionCompatParcelizer);
                return createfromparcel;
            case 19:
                getProcessName getprocessname = (getProcessName) this.MediaMetadataCompat;
                getprocessname.MediaDescriptionCompat.IconCompatParcelizer.logEvent("rider_safety_got_acquainted", null);
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(getprocessname), null, null, new RiderSafetyReportViewModel$1(getprocessname, shortNewsContentCardView, i), 3);
                return createfromparcel;
            case 20:
                getProcessName getprocessname2 = (getProcessName) this.MediaMetadataCompat;
                getprocessname2.MediaDescriptionCompat.IconCompatParcelizer.logEvent("rider_safety_safe_trip_rate_dismissed", null);
                getprocessname2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer = true;
                MutableStateFlow mutableStateFlow5 = getprocessname2.IconCompatParcelizer;
                do {
                    obj5 = mutableStateFlow5.read();
                    getoneventtrackingfailedlistener = (getOnDeeplinkResponseListener) obj5;
                    if (getoneventtrackingfailedlistener instanceof getOnEventTrackingFailedListener) {
                        getOnEventTrackingFailedListener getoneventtrackingfailedlistener2 = (getOnEventTrackingFailedListener) getoneventtrackingfailedlistener;
                        getDefaultTracker getdefaulttracker = getoneventtrackingfailedlistener2.RemoteActionCompatParcelizer;
                        isFbIdReadingEnabled isfbidreadingenabled = getoneventtrackingfailedlistener2.MediaMetadataCompat;
                        getLogger getlogger = getoneventtrackingfailedlistener2.write;
                        getOnSessionTrackingSucceededListener getonsessiontrackingsucceededlistener = getoneventtrackingfailedlistener2.serializer;
                        boolean z = getoneventtrackingfailedlistener2.RatingCompat;
                        List list = getoneventtrackingfailedlistener2.read;
                        getdefaulttracker.getClass();
                        getoneventtrackingfailedlistener = new getOnEventTrackingFailedListener(getdefaulttracker, false, isfbidreadingenabled, getlogger, getonsessiontrackingsucceededlistener, z, list);
                    }
                } while (!mutableStateFlow5.RemoteActionCompatParcelizer(obj5, getoneventtrackingfailedlistener));
                int i8 = IconCompatParcelizer + 95;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return createfromparcel;
            case 21:
                ((FutureShiftUiModelImpl) ((FutureShiftUiModel) this.MediaMetadataCompat)).RemoteActionCompatParcelizer.serializer(onPostExecute.serializer);
                return createfromparcel;
            case 22:
                FutureShiftUiModelImpl futureShiftUiModelImpl = (FutureShiftUiModelImpl) ((FutureShiftUiModel) this.MediaMetadataCompat);
                AdjustInstance10 adjustInstance10 = (AdjustInstance10) futureShiftUiModelImpl.serializer.read();
                if (!(adjustInstance10 instanceof doInBackground)) {
                    return createfromparcel;
                }
                AdjustInstance13 adjustInstance13 = ((doInBackground) adjustInstance10).RemoteActionCompatParcelizer;
                String str2 = adjustInstance13.read;
                String str3 = adjustInstance13.IconCompatParcelizer;
                removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101 = futureShiftUiModelImpl.MediaSessionCompatQueueItem;
                Long l = adjustInstance13.MediaSessionCompatQueueItem;
                if (l != null) {
                    int i10 = IconCompatParcelizer + 27;
                    serializer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        strValueOf = String.valueOf(l.longValue());
                        int i11 = 3 / 0;
                    } else {
                        strValueOf = String.valueOf(l.longValue());
                    }
                } else {
                    strValueOf = null;
                }
                String str4 = strValueOf != null ? strValueOf : "";
                AdjustInstance11 adjustInstance11 = adjustInstance13.MediaMetadataCompat;
                adjustInstance11.getClass();
                int i12 = AdjustInstanceExternalSyntheticLambda0.read[adjustInstance11.ordinal()];
                if (i12 != 1) {
                    int i13 = serializer;
                    int i14 = i13 + 61;
                    IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0 ? i12 != 2 : i12 != 5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    int i15 = i13 + 77;
                    IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                    str = "go_and_start";
                } else {
                    str = "existing_shift";
                }
                removesinglesubscriptionlambda101.RemoteActionCompatParcelizer.logEvent("start_session_clicked", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("start_session_type", str), new onViewAttachedToWindowlambda0("shiftId", str4)));
                futureShiftUiModelImpl.RemoteActionCompatParcelizer.serializer(new AdjustInstance1(new StartWorkingNavAction.StartExistingShift(str2, str3)));
                return createfromparcel;
            case 23:
                OfferToWorkUiModelImpl offerToWorkUiModelImpl = (OfferToWorkUiModelImpl) ((OfferToWorkUiModel) this.MediaMetadataCompat);
                offerToWorkUiModelImpl.MediaSessionCompatQueueItem.read.logEvent("become_unavailable", null);
                BuildersKt.RemoteActionCompatParcelizer(offerToWorkUiModelImpl.RemoteActionCompatParcelizer, null, null, new NafathModalUiModelImpl$1(offerToWorkUiModelImpl, shortNewsContentCardView, 19), 3);
                return createfromparcel;
            case 24:
                OnDemandWithBonusUiModelImpl onDemandWithBonusUiModelImpl = (OnDemandWithBonusUiModelImpl) ((OnDemandWithBonusUiModel) this.MediaMetadataCompat);
                onDemandWithBonusUiModelImpl.MediaBrowserCompatMediaItem.read();
                onDemandWithBonusUiModelImpl.RemoteActionCompatParcelizer.serializer(new isPresent());
                return createfromparcel;
            case 25:
                OnDemandWithBonusUiModelImpl onDemandWithBonusUiModelImpl2 = (OnDemandWithBonusUiModelImpl) ((OnDemandWithBonusUiModel) this.MediaMetadataCompat);
                BuildersKt.RemoteActionCompatParcelizer(onDemandWithBonusUiModelImpl2.IconCompatParcelizer, null, null, new NafathModalUiModelImpl$1(onDemandWithBonusUiModelImpl2, shortNewsContentCardView, 20), 3);
                return createfromparcel;
            case 26:
                AttributionHandler3 attributionHandler3 = (AttributionHandler3) this.MediaMetadataCompat;
                attributionHandler3.serializer.IconCompatParcelizer(getonattributionreadlistener);
                BuildersKt.RemoteActionCompatParcelizer(attributionHandler3.write, null, null, new NafathModalUiModelImpl$1(attributionHandler3, shortNewsContentCardView, 21), 3);
                return createfromparcel;
            case 27:
                ((AttributionHandler3) this.MediaMetadataCompat).serializer.IconCompatParcelizer(getonattributionreadlistener);
                return createfromparcel;
            case 28:
                ((AttributionHandler3) this.MediaMetadataCompat).serializer();
                return createfromparcel;
            default:
                getABI getabi = (getABI) this.MediaMetadataCompat;
                ff$$ExternalSyntheticOutline0.m("screen_name", "home_screen", getabi.RatingCompat.IconCompatParcelizer, "stop_working_clicked");
                AttributionHandler3 attributionHandler4 = (AttributionHandler3) getabi.write.MediaSessionCompatResultReceiverWrapper();
                MutableStateFlow mutableStateFlow6 = attributionHandler4.serializer;
                setTransactionSuccessful settransactionsuccessful = attributionHandler4.RemoteActionCompatParcelizer;
                mutableStateFlow6.IconCompatParcelizer(new getPartnerSharingSettings(new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.rid_ondemand_dialog_disclaimer_title), false, settransactionsuccessful.IconCompatParcelizer(R.string.rid_ondemand_dialog_disclaimer_description), null, null, settransactionsuccessful.IconCompatParcelizer(R.string.rid_ondemand_dialog_disclaimer_btn_secondary), 76, settransactionsuccessful.IconCompatParcelizer(R.string.rid_ondemand_dialog_disclaimer_btn_primary))));
                return createfromparcel;
        }
    }
}
