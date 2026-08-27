package com.roadrunner.rider.recruitment.accountcreation.otp_verification;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.data.error.TooManyRequestsException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.GetOtpVerificationRequestId;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.GetRemainingOtpVerificationTimerIfRunning;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ActivityHandlerExternalSyntheticLambda15;
import o.BrazeExternalSyntheticLambda28;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getQueryContext;
import o.isItemDismissable;
import o.onItemDismiss;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setApplicationContext;
import o.setPushToken;
import o.trackAdRevenue;
import o.trackMeasurementConsent;
import o.trackThirdPartySharing;
import o.transferSessionPackageI;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpVerificationViewModel$triggerOtp$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public int IconCompatParcelizer;
    public final /* synthetic */ OtpVerificationViewModel MediaDescriptionCompat;
    public ActivityHandlerExternalSyntheticLambda15 RemoteActionCompatParcelizer;
    public OtpVerificationViewModel read;
    public Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpVerificationViewModel$triggerOtp$1(OtpVerificationViewModel otpVerificationViewModel, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaDescriptionCompat = otpVerificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        OtpVerificationViewModel$triggerOtp$1 otpVerificationViewModel$triggerOtp$1 = new OtpVerificationViewModel$triggerOtp$1(this.MediaDescriptionCompat, shortNewsContentCardView);
        int i2 = MediaBrowserCompatMediaItem + 51;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return otpVerificationViewModel$triggerOtp$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 25;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((OtpVerificationViewModel$triggerOtp$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = ((OtpVerificationViewModel$triggerOtp$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = MediaMetadataCompat + 89;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    /* JADX WARN: Code duplicated, block: B:34:0x0114  */
    /* JADX WARN: Code duplicated, block: B:36:0x0122  */
    /* JADX WARN: Code duplicated, block: B:40:0x0137  */
    /* JADX WARN: Code duplicated, block: B:42:0x013a  */
    /* JADX WARN: Code duplicated, block: B:43:0x013f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0155  */
    /* JADX WARN: Code duplicated, block: B:50:0x0159  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x01af  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x0205  */
    /* JADX WARN: Code duplicated, block: B:75:0x0211  */
    /* JADX WARN: Code duplicated, block: B:76:0x0216  */
    /* JADX WARN: Code duplicated, block: B:78:0x021b  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [o.execSessionSuccessCallbackCommand, o.getAutofillManager] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objHasTimeRemaining;
        Object obj2;
        Object objM5159sendOtpgIAlus$implementation;
        ActivityHandlerExternalSyntheticLambda15 activityHandlerExternalSyntheticLambda15;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        String str;
        Object obj3;
        Long l;
        long jLongValue;
        Long l2;
        long jLongValue2;
        Object objInvoke;
        Object obj4;
        int i;
        ActivityHandlerExternalSyntheticLambda15 activityHandlerExternalSyntheticLambda16;
        OtpVerificationViewModel otpVerificationViewModel;
        MutableStateFlow mutableStateFlow;
        Object obj5;
        Object objSerializer;
        CoroutineSingletons coroutineSingletons;
        Object obj6;
        Throwable thSerializer;
        Object obj7;
        ?? r13;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = MediaBrowserCompatMediaItem + 1;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        OtpVerificationViewModel otpVerificationViewModel2 = this.MediaDescriptionCompat;
        getQueryContext getquerycontext = otpVerificationViewModel2.MediaMetadataCompat;
        DropShadowEffect dropShadowEffect = otpVerificationViewModel2.PlaybackStateCompatCustomAction;
        MutableStateFlow mutableStateFlow2 = otpVerificationViewModel2.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str2 = ((trackThirdPartySharing) mutableStateFlow2.read()).MediaDescriptionCompat;
            this.IconCompatParcelizer = 1;
            objHasTimeRemaining = dropShadowEffect.hasTimeRemaining(str2, this);
            if (objHasTimeRemaining != coroutineSingletons2) {
            }
            return coroutineSingletons2;
        }
        if (i7 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objHasTimeRemaining = obj;
        } else {
            if (i7 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM5159sendOtpgIAlus$implementation = ((onItemDismiss) obj).IconCompatParcelizer;
                if (!(objM5159sendOtpgIAlus$implementation instanceof isItemDismissable)) {
                    activityHandlerExternalSyntheticLambda15 = (ActivityHandlerExternalSyntheticLambda15) objM5159sendOtpgIAlus$implementation;
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OTP sent successfully", new Object[0]);
                    String str3 = ((trackThirdPartySharing) mutableStateFlow2.read()).MediaDescriptionCompat;
                    this.serializer = objM5159sendOtpgIAlus$implementation;
                    this.read = otpVerificationViewModel2;
                    this.RemoteActionCompatParcelizer = activityHandlerExternalSyntheticLambda15;
                    this.write = 0;
                    this.IconCompatParcelizer = 3;
                    firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) dropShadowEffect.serializer);
                    str = firebaseRemoteConfigImpl.read.read();
                    if (str == null) {
                        jLongValue = 0;
                    } else {
                        obj3 = firebaseRemoteConfigImpl.IconCompatParcelizer.IconCompatParcelizer("request_again_timeout_config_in_seconds", str).get("reset_password_by_otp");
                        if (true ^ (obj3 instanceof Long)) {
                            l = null;
                        } else {
                            int i8 = MediaBrowserCompatMediaItem + 9;
                            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                            l = (Long) obj3;
                        }
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                    }
                    l2 = new Long(jLongValue);
                    if (l2.longValue() <= 0) {
                        l2 = null;
                    }
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    } else {
                        jLongValue2 = 60;
                    }
                    ((CountDownTimerUiModel) dropShadowEffect.read).write(jLongValue2);
                    objInvoke = ((GetRemainingOtpVerificationTimerIfRunning) dropShadowEffect.write).invoke(jLongValue2, str3, this);
                    if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objInvoke = createfromparcel;
                    }
                    if (objInvoke != coroutineSingletons2) {
                        obj4 = objM5159sendOtpgIAlus$implementation;
                        i = 0;
                        activityHandlerExternalSyntheticLambda16 = activityHandlerExternalSyntheticLambda15;
                        otpVerificationViewModel = otpVerificationViewModel2;
                        mutableStateFlow = otpVerificationViewModel.IconCompatParcelizer;
                        do {
                            obj5 = mutableStateFlow.read();
                        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj5, trackThirdPartySharing.write((trackThirdPartySharing) obj5, null, null, null, activityHandlerExternalSyntheticLambda16.requestId, null, false, null, false, 239)));
                        GetOtpVerificationRequestId getOtpVerificationRequestId = otpVerificationViewModel.MediaSessionCompatQueueItem;
                        String str4 = activityHandlerExternalSyntheticLambda16.requestId;
                        this.serializer = obj4;
                        this.read = otpVerificationViewModel;
                        this.RemoteActionCompatParcelizer = null;
                        this.write = i;
                        this.IconCompatParcelizer = 4;
                        DropShadowEffect dropShadowEffect2 = getOtpVerificationRequestId.RemoteActionCompatParcelizer;
                        objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) dropShadowEffect2.read, new NafathTimerDataStore$set$2(dropShadowEffect2, str4, null, 12), this);
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (objSerializer != coroutineSingletons) {
                            objSerializer = createfromparcel;
                        }
                        if (objSerializer != coroutineSingletons) {
                            objSerializer = createfromparcel;
                        }
                        if (objSerializer != coroutineSingletons2) {
                            obj6 = obj4;
                        }
                    }
                    return coroutineSingletons2;
                }
                otpVerificationViewModel2 = otpVerificationViewModel2;
                thSerializer = onItemDismiss.serializer(objM5159sendOtpgIAlus$implementation);
                if (thSerializer != null) {
                    Timber.RemoteActionCompatParcelizer.read(thSerializer, "Failed to send OTP", new Object[0]);
                    do {
                        obj7 = mutableStateFlow2.read();
                    } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj7, trackThirdPartySharing.write((trackThirdPartySharing) obj7, null, null, null, null, null, false, null, false, 255)));
                    BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = otpVerificationViewModel2.MediaDescriptionCompat;
                    brazeExternalSyntheticLambda28.getClass();
                    if (thSerializer instanceof TooManyRequestsException) {
                        i3 = MediaBrowserCompatMediaItem + 65;
                        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        i2 = R.string.otp_error_too_many_requests;
                        r13 = 0;
                    } else {
                        r13 = 0;
                        i2 = R.string.otp_error_failed_to_send;
                    }
                    getquerycontext.serializer(new trackMeasurementConsent(new setApplicationContext(brazeExternalSyntheticLambda28.read.IconCompatParcelizer(i2), r13, r13, 6)));
                    getquerycontext.serializer(new trackAdRevenue(false));
                }
                return createfromparcel;
            }
            int i10 = MediaBrowserCompatMediaItem + 103;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (i7 == 3) {
                int i12 = this.write;
                activityHandlerExternalSyntheticLambda16 = this.RemoteActionCompatParcelizer;
                OtpVerificationViewModel otpVerificationViewModel3 = this.read;
                obj4 = this.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                otpVerificationViewModel2 = otpVerificationViewModel2;
                i = i12;
                otpVerificationViewModel = otpVerificationViewModel3;
                mutableStateFlow = otpVerificationViewModel.IconCompatParcelizer;
                do {
                    obj5 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj5, trackThirdPartySharing.write((trackThirdPartySharing) obj5, null, null, null, activityHandlerExternalSyntheticLambda16.requestId, null, false, null, false, 239)));
                GetOtpVerificationRequestId getOtpVerificationRequestId2 = otpVerificationViewModel.MediaSessionCompatQueueItem;
                String str5 = activityHandlerExternalSyntheticLambda16.requestId;
                this.serializer = obj4;
                this.read = otpVerificationViewModel;
                this.RemoteActionCompatParcelizer = null;
                this.write = i;
                this.IconCompatParcelizer = 4;
                DropShadowEffect dropShadowEffect3 = getOtpVerificationRequestId2.RemoteActionCompatParcelizer;
                objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) dropShadowEffect3.read, new NafathTimerDataStore$set$2(dropShadowEffect3, str5, null, 12), this);
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objSerializer != coroutineSingletons) {
                    objSerializer = createfromparcel;
                }
                if (objSerializer != coroutineSingletons) {
                    objSerializer = createfromparcel;
                }
                if (objSerializer != coroutineSingletons2) {
                    obj6 = obj4;
                }
                return coroutineSingletons2;
            }
            if (i7 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            otpVerificationViewModel = this.read;
            obj6 = this.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            otpVerificationViewModel2 = otpVerificationViewModel2;
        }
        otpVerificationViewModel.MediaMetadataCompat.serializer(setPushToken.read);
        otpVerificationViewModel.MediaMetadataCompat.serializer(new trackAdRevenue(false));
        objM5159sendOtpgIAlus$implementation = obj6;
        thSerializer = onItemDismiss.serializer(objM5159sendOtpgIAlus$implementation);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.read(thSerializer, "Failed to send OTP", new Object[0]);
            do {
                obj7 = mutableStateFlow2.read();
            } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj7, trackThirdPartySharing.write((trackThirdPartySharing) obj7, null, null, null, null, null, false, null, false, 255)));
            BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda29 = otpVerificationViewModel2.MediaDescriptionCompat;
            brazeExternalSyntheticLambda29.getClass();
            if (thSerializer instanceof TooManyRequestsException) {
                i3 = MediaBrowserCompatMediaItem + 65;
                MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    Object obj9 = null;
                    obj9.hashCode();
                    throw null;
                }
                i2 = R.string.otp_error_too_many_requests;
                r13 = 0;
            } else {
                r13 = 0;
                i2 = R.string.otp_error_failed_to_send;
            }
            getquerycontext.serializer(new trackMeasurementConsent(new setApplicationContext(brazeExternalSyntheticLambda29.read.IconCompatParcelizer(i2), r13, r13, 6)));
            getquerycontext.serializer(new trackAdRevenue(false));
        }
        return createfromparcel;
        if (!((Boolean) objHasTimeRemaining).booleanValue()) {
            do {
                obj2 = mutableStateFlow2.read();
            } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, trackThirdPartySharing.write((trackThirdPartySharing) obj2, null, null, null, null, null, false, null, true, 255)));
            getquerycontext.serializer(new trackAdRevenue(true));
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Sending OTP", new Object[0]);
            FormBody.Builder builder = otpVerificationViewModel2.MediaBrowserCompatMediaItem;
            String str6 = ((trackThirdPartySharing) mutableStateFlow2.read()).MediaDescriptionCompat;
            this.IconCompatParcelizer = 2;
            objM5159sendOtpgIAlus$implementation = builder.m5159sendOtpgIAlus$implementation(str6, this);
            if (objM5159sendOtpgIAlus$implementation != coroutineSingletons2) {
                if (!(objM5159sendOtpgIAlus$implementation instanceof isItemDismissable)) {
                    activityHandlerExternalSyntheticLambda15 = (ActivityHandlerExternalSyntheticLambda15) objM5159sendOtpgIAlus$implementation;
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OTP sent successfully", new Object[0]);
                    String str7 = ((trackThirdPartySharing) mutableStateFlow2.read()).MediaDescriptionCompat;
                    this.serializer = objM5159sendOtpgIAlus$implementation;
                    this.read = otpVerificationViewModel2;
                    this.RemoteActionCompatParcelizer = activityHandlerExternalSyntheticLambda15;
                    this.write = 0;
                    this.IconCompatParcelizer = 3;
                    firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) dropShadowEffect.serializer);
                    str = firebaseRemoteConfigImpl.read.read();
                    if (str == null) {
                        jLongValue = 0;
                    } else {
                        obj3 = firebaseRemoteConfigImpl.IconCompatParcelizer.IconCompatParcelizer("request_again_timeout_config_in_seconds", str).get("reset_password_by_otp");
                        if (true ^ (obj3 instanceof Long)) {
                            l = null;
                        } else {
                            int i13 = MediaBrowserCompatMediaItem + 9;
                            MediaMetadataCompat = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            l = (Long) obj3;
                        }
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                    }
                    l2 = new Long(jLongValue);
                    if (l2.longValue() <= 0) {
                        l2 = null;
                    }
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    } else {
                        jLongValue2 = 60;
                    }
                    ((CountDownTimerUiModel) dropShadowEffect.read).write(jLongValue2);
                    objInvoke = ((GetRemainingOtpVerificationTimerIfRunning) dropShadowEffect.write).invoke(jLongValue2, str7, this);
                    if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objInvoke = createfromparcel;
                    }
                    if (objInvoke != coroutineSingletons2) {
                        obj4 = objM5159sendOtpgIAlus$implementation;
                        i = 0;
                        activityHandlerExternalSyntheticLambda16 = activityHandlerExternalSyntheticLambda15;
                        otpVerificationViewModel = otpVerificationViewModel2;
                        mutableStateFlow = otpVerificationViewModel.IconCompatParcelizer;
                        do {
                            obj5 = mutableStateFlow.read();
                        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj5, trackThirdPartySharing.write((trackThirdPartySharing) obj5, null, null, null, activityHandlerExternalSyntheticLambda16.requestId, null, false, null, false, 239)));
                        GetOtpVerificationRequestId getOtpVerificationRequestId3 = otpVerificationViewModel.MediaSessionCompatQueueItem;
                        String str8 = activityHandlerExternalSyntheticLambda16.requestId;
                        this.serializer = obj4;
                        this.read = otpVerificationViewModel;
                        this.RemoteActionCompatParcelizer = null;
                        this.write = i;
                        this.IconCompatParcelizer = 4;
                        DropShadowEffect dropShadowEffect4 = getOtpVerificationRequestId3.RemoteActionCompatParcelizer;
                        objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) dropShadowEffect4.read, new NafathTimerDataStore$set$2(dropShadowEffect4, str8, null, 12), this);
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (objSerializer != coroutineSingletons) {
                            objSerializer = createfromparcel;
                        }
                        if (objSerializer != coroutineSingletons) {
                            objSerializer = createfromparcel;
                        }
                        if (objSerializer != coroutineSingletons2) {
                            obj6 = obj4;
                            otpVerificationViewModel.MediaMetadataCompat.serializer(setPushToken.read);
                            otpVerificationViewModel.MediaMetadataCompat.serializer(new trackAdRevenue(false));
                            objM5159sendOtpgIAlus$implementation = obj6;
                        }
                    }
                } else {
                    otpVerificationViewModel2 = otpVerificationViewModel2;
                }
                thSerializer = onItemDismiss.serializer(objM5159sendOtpgIAlus$implementation);
                if (thSerializer != null) {
                    Timber.RemoteActionCompatParcelizer.read(thSerializer, "Failed to send OTP", new Object[0]);
                    do {
                        obj7 = mutableStateFlow2.read();
                    } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj7, trackThirdPartySharing.write((trackThirdPartySharing) obj7, null, null, null, null, null, false, null, false, 255)));
                    BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda210 = otpVerificationViewModel2.MediaDescriptionCompat;
                    brazeExternalSyntheticLambda210.getClass();
                    if (thSerializer instanceof TooManyRequestsException) {
                        i3 = MediaBrowserCompatMediaItem + 65;
                        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            Object obj10 = null;
                            obj10.hashCode();
                            throw null;
                        }
                        i2 = R.string.otp_error_too_many_requests;
                        r13 = 0;
                    } else {
                        r13 = 0;
                        i2 = R.string.otp_error_failed_to_send;
                    }
                    getquerycontext.serializer(new trackMeasurementConsent(new setApplicationContext(brazeExternalSyntheticLambda210.read.IconCompatParcelizer(i2), r13, r13, 6)));
                    getquerycontext.serializer(new trackAdRevenue(false));
                }
            }
            return coroutineSingletons2;
        }
        return createfromparcel;
    }
}
