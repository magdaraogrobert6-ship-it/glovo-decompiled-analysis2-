package com.roadrunner.rider.recruitment.accountcreation.otp_verification;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.data.error.TooManyRequestsException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.common.data.api.ErrorBodyParseException;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpApiError;
import io.sentry.util.network.NetworkBody;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ActivityHandler44;
import o.ActivityHandlerExternalSyntheticLambda6;
import o.BrazeExternalSyntheticLambda28;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.getQueryContext;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.safeSetClipToOutline;
import o.setApplicationContext;
import o.teardown;
import o.trackAdRevenue;
import o.trackEvent;
import o.trackMeasurementConsent;
import o.trackPlayStoreSubscription;
import o.trackThirdPartySharing;
import o.tryTrackMeasurementConsentI;
import okhttp3.FormBody;
import retrofit2.HttpException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpVerificationViewModel$onPinChanged$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final /* synthetic */ OtpVerificationViewModel IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtpVerificationViewModel$onPinChanged$2(OtpVerificationViewModel otpVerificationViewModel, String str, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = otpVerificationViewModel;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 33;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        String str = this.RemoteActionCompatParcelizer;
        OtpVerificationViewModel otpVerificationViewModel = this.IconCompatParcelizer;
        if (i4 != 0) {
            return new OtpVerificationViewModel$onPinChanged$2(otpVerificationViewModel, str, shortNewsContentCardView, 1);
        }
        OtpVerificationViewModel$onPinChanged$2 otpVerificationViewModel$onPinChanged$2 = new OtpVerificationViewModel$onPinChanged$2(otpVerificationViewModel, str, shortNewsContentCardView, 0);
        int i5 = serializer + 87;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return otpVerificationViewModel$onPinChanged$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 57;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((OtpVerificationViewModel$onPinChanged$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((OtpVerificationViewModel$onPinChanged$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 13;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM5160validateOtpBWLJW6A$implementation;
        String strValueOf;
        String message;
        tryTrackMeasurementConsentI trytrackmeasurementconsenti;
        Object obj2;
        Object obj3;
        Object obj4;
        OtpVerificationViewModel$onPinChanged$2 otpVerificationViewModel$onPinChanged$2 = this;
        int i = 2 % 2;
        int i2 = otpVerificationViewModel$onPinChanged$2.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        String str = otpVerificationViewModel$onPinChanged$2.RemoteActionCompatParcelizer;
        OtpVerificationViewModel otpVerificationViewModel = otpVerificationViewModel$onPinChanged$2.IconCompatParcelizer;
        ?? r8 = 1;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = otpVerificationViewModel$onPinChanged$2.read;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DropShadowEffect dropShadowEffect = otpVerificationViewModel.PlaybackStateCompatCustomAction;
                otpVerificationViewModel$onPinChanged$2.read = 1;
                return dropShadowEffect.startOrResume(str, otpVerificationViewModel$onPinChanged$2) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            int i4 = serializer + 29;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        NetworkBody networkBody = otpVerificationViewModel.write;
        getQueryContext getquerycontext = otpVerificationViewModel.MediaMetadataCompat;
        MutableStateFlow mutableStateFlow = otpVerificationViewModel.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = otpVerificationViewModel$onPinChanged$2.read;
        if (i6 != 0) {
            if (i6 == 1) {
                int i7 = serializer + 113;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM5160validateOtpBWLJW6A$implementation = ((onItemDismiss) obj).IconCompatParcelizer;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            }
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        while (true) {
            Object obj5 = mutableStateFlow.read();
            if (mutableStateFlow.RemoteActionCompatParcelizer(obj5, trackThirdPartySharing.write((trackThirdPartySharing) obj5, null, null, null, null, null, false, null, true, 255))) {
                break;
            }
            otpVerificationViewModel$onPinChanged$2 = this;
            r8 = r8 == true ? 1 : 0;
        }
        getquerycontext.serializer(new trackAdRevenue(r8));
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Validating OTP", new Object[0]);
        trackThirdPartySharing trackthirdpartysharing = (trackThirdPartySharing) mutableStateFlow.read();
        FormBody.Builder builder = otpVerificationViewModel.MediaBrowserCompatMediaItem;
        String str2 = trackthirdpartysharing.MediaDescriptionCompat;
        String str3 = trackthirdpartysharing.MediaMetadataCompat;
        otpVerificationViewModel$onPinChanged$2.read = r8;
        objM5160validateOtpBWLJW6A$implementation = builder.m5160validateOtpBWLJW6A$implementation(str2, str, str3, otpVerificationViewModel$onPinChanged$2);
        if (objM5160validateOtpBWLJW6A$implementation == coroutineSingletons2) {
            return coroutineSingletons2;
        }
        if (!(objM5160validateOtpBWLJW6A$implementation instanceof isItemDismissable)) {
            ActivityHandlerExternalSyntheticLambda6 activityHandlerExternalSyntheticLambda6 = (ActivityHandlerExternalSyntheticLambda6) objM5160validateOtpBWLJW6A$implementation;
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OTP validation successful", new Object[0]);
            do {
                obj3 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, trackThirdPartySharing.write((trackThirdPartySharing) obj3, null, null, null, null, null, false, null, false, 255)));
            getquerycontext.serializer(new trackAdRevenue(false));
            if (activityHandlerExternalSyntheticLambda6.verified) {
                Timber.RemoteActionCompatParcelizer.getClass();
                otpVerificationViewModel.serializer = 0;
                decode decodeVar = (decode) networkBody.IconCompatParcelizer;
                Map mapSingletonMap = Collections.singletonMap("status", "success");
                mapSingletonMap.getClass();
                decodeVar.logEvent("account_creation_otp_verification", mapSingletonMap);
                getquerycontext.serializer(new teardown(new ActivityHandler44(((trackThirdPartySharing) mutableStateFlow.read()).write, ((trackThirdPartySharing) mutableStateFlow.read()).MediaDescriptionCompat)));
            } else {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OTP validation is not verified", new Object[0]);
                ((decode) networkBody.IconCompatParcelizer).logEvent("account_creation_otp_verification", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("status", "failed"), new onViewAttachedToWindowlambda0("errorMsg", "invalid_code")));
                int i9 = otpVerificationViewModel.serializer + 1;
                otpVerificationViewModel.serializer = i9;
                if (i9 >= 3) {
                    getquerycontext.serializer(trackEvent.serializer);
                    int i10 = MediaDescriptionCompat + 111;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                } else {
                    do {
                        obj4 = mutableStateFlow.read();
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj4, trackThirdPartySharing.write((trackThirdPartySharing) obj4, null, null, null, null, otpVerificationViewModel.RatingCompat.IconCompatParcelizer(R.string.two_factor_auth_invalid_code_error), true, null, false, 415)));
                }
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5160validateOtpBWLJW6A$implementation);
        if (thSerializer == null) {
            return createfromparcel;
        }
        Timber.RemoteActionCompatParcelizer.read(thSerializer, "Failed to validate OTP", new Object[0]);
        networkBody.getClass();
        ((trackPlayStoreSubscription) networkBody.RemoteActionCompatParcelizer).getClass();
        if (!(!(thSerializer instanceof OtpApiError))) {
            OtpApiError otpApiError = (OtpApiError) thSerializer;
            if (otpApiError instanceof OtpApiError.ValidationError) {
                OtpApiError.ValidationError validationError = (OtpApiError.ValidationError) otpApiError;
                trytrackmeasurementconsenti = new tryTrackMeasurementConsentI(String.valueOf(validationError.read), validationError.write.message);
            } else {
                if (!(otpApiError instanceof OtpApiError.InvalidRequestId)) {
                    int i12 = serializer + 97;
                    MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    if (!(otpApiError instanceof OtpApiError.TooEarly) && !(otpApiError instanceof OtpApiError.ServerError)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                }
                String strValueOf2 = String.valueOf(otpApiError.IconCompatParcelizer());
                String message2 = otpApiError.getMessage();
                if (message2 == null) {
                    int i14 = serializer + 31;
                    MediaDescriptionCompat = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        int i15 = 72 / 0;
                    }
                    message2 = "";
                }
                trytrackmeasurementconsenti = new tryTrackMeasurementConsentI(strValueOf2, message2);
            }
        } else if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer(thSerializer)) {
            trytrackmeasurementconsenti = new tryTrackMeasurementConsentI(null, "No internet connection");
        } else if (thSerializer instanceof TooManyRequestsException) {
            trytrackmeasurementconsenti = new tryTrackMeasurementConsentI("429", "Too many requests");
        } else if (thSerializer instanceof ErrorBodyParseException) {
            ErrorBodyParseException errorBodyParseException = (ErrorBodyParseException) thSerializer;
            trytrackmeasurementconsenti = new tryTrackMeasurementConsentI(String.valueOf(errorBodyParseException.read.read), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("error parsing body: ", errorBodyParseException.RemoteActionCompatParcelizer.getMessage()));
        } else {
            Throwable cause = thSerializer.getCause();
            HttpException httpException = !(cause instanceof HttpException) ? null : (HttpException) cause;
            if (httpException != null) {
                strValueOf = String.valueOf(httpException.read);
                int i16 = serializer + 9;
                MediaDescriptionCompat = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
            } else {
                strValueOf = null;
            }
            Throwable cause2 = thSerializer.getCause();
            HttpException httpException2 = cause2 instanceof HttpException ? (HttpException) cause2 : null;
            if (httpException2 == null || (message = httpException2.RemoteActionCompatParcelizer) == null) {
                message = thSerializer.getMessage();
            }
            trytrackmeasurementconsenti = new tryTrackMeasurementConsentI(strValueOf, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("unknown exception type with message: ", message));
        }
        decode decodeVar2 = (decode) networkBody.IconCompatParcelizer;
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.put("status", "failed");
        safesetcliptooutline.put("errorMsg", trytrackmeasurementconsenti.write);
        String str4 = trytrackmeasurementconsenti.IconCompatParcelizer;
        if (str4 != null) {
            safesetcliptooutline.put("errorCode", str4);
        }
        decodeVar2.logEvent("account_creation_otp_verification", safesetcliptooutline.IconCompatParcelizer());
        do {
            obj2 = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, trackThirdPartySharing.write((trackThirdPartySharing) obj2, null, null, null, null, null, false, null, false, 255)));
        int i18 = MediaDescriptionCompat + 121;
        serializer = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
        BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = otpVerificationViewModel.MediaDescriptionCompat;
        brazeExternalSyntheticLambda28.getClass();
        getquerycontext.serializer(new trackMeasurementConsent(new setApplicationContext(brazeExternalSyntheticLambda28.read.IconCompatParcelizer(thSerializer instanceof TooManyRequestsException ? R.string.otp_error_too_many_attempts : R.string.otp_error_generic), null, null, 6)));
        getquerycontext.serializer(new trackAdRevenue(false));
        return createfromparcel;
    }
}
