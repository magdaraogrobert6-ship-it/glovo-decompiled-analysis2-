package com.roadrunner.rider.recruitment.accountcreation.analytics;

import androidx.compose.ui.graphics.Fields;
import com.data.error.TooManyRequestsException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ErrorBodyParseException;
import com.roadrunner.rider.recruitment.accountcreation.data.ApiErrorResponse;
import o.ActivityHandler17;
import o.ActivityHandler23;
import o.decode;
import o.getAdjustConfig;
import o.getThirdPartySharingSettingsWithTimeout;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.safeSetClipToOutline;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountCreationLogger {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final decode RemoteActionCompatParcelizer;
    public final getAdjustConfig serializer;

    public AccountCreationLogger(decode decodeVar, getAdjustConfig getadjustconfig) {
        decodeVar.getClass();
        getadjustconfig.getClass();
        this.RemoteActionCompatParcelizer = decodeVar;
        this.serializer = getadjustconfig;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[PHI: r8
  0x005c: PHI (r8v23 java.lang.String) = (r8v22 java.lang.String), (r8v24 java.lang.String) binds: [B:19:0x0059, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    public final safeSetClipToOutline write(Throwable th) {
        String strValueOf;
        String message;
        getThirdPartySharingSettingsWithTimeout getthirdpartysharingsettingswithtimeout;
        getThirdPartySharingSettingsWithTimeout getthirdpartysharingsettingswithtimeout2;
        String strName;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer.getClass();
        int i4 = 4;
        String str = null;
        if (th instanceof ApiErrorResponse) {
            ApiErrorResponse apiErrorResponse = (ApiErrorResponse) th;
            String str2 = "";
            if (apiErrorResponse instanceof ApiErrorResponse.AccountCreationFailureResponse) {
                int i5 = IconCompatParcelizer + 89;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                ApiErrorResponse.AccountCreationFailureResponse accountCreationFailureResponse = (ApiErrorResponse.AccountCreationFailureResponse) apiErrorResponse;
                ActivityHandler17 activityHandler17 = accountCreationFailureResponse.write;
                int i7 = accountCreationFailureResponse.IconCompatParcelizer;
                String message2 = activityHandler17.message;
                if (message2 == null && (message2 = accountCreationFailureResponse.read.getMessage()) == null) {
                    message2 = "";
                }
                ActivityHandler23 activityHandler23 = activityHandler17.accountStatus;
                if (activityHandler23 != null) {
                    int i8 = write + 77;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        strName = activityHandler23.name();
                        int i9 = 49 / 0;
                        if (strName != null) {
                            str2 = strName;
                        }
                    } else {
                        strName = activityHandler23.name();
                        if (strName != null) {
                            str2 = strName;
                        }
                    }
                }
                getthirdpartysharingsettingswithtimeout2 = new getThirdPartySharingSettingsWithTimeout(String.valueOf(i7), message2, str2);
            } else {
                if (!(apiErrorResponse instanceof ApiErrorResponse.PhoneValidationFailureResponse)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                ApiErrorResponse.PhoneValidationFailureResponse phoneValidationFailureResponse = (ApiErrorResponse.PhoneValidationFailureResponse) apiErrorResponse;
                int i10 = phoneValidationFailureResponse.IconCompatParcelizer;
                String message3 = phoneValidationFailureResponse.serializer.getMessage();
                getthirdpartysharingsettingswithtimeout2 = new getThirdPartySharingSettingsWithTimeout(String.valueOf(i10), message3 != null ? message3 : "", i4);
            }
        } else if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
            getthirdpartysharingsettingswithtimeout2 = new getThirdPartySharingSettingsWithTimeout(str, "No internet connection", 5);
        } else if (th instanceof TooManyRequestsException) {
            getthirdpartysharingsettingswithtimeout2 = new getThirdPartySharingSettingsWithTimeout("429", "Too many requests", i4);
        } else {
            if (th instanceof ErrorBodyParseException) {
                ErrorBodyParseException errorBodyParseException = (ErrorBodyParseException) th;
                getthirdpartysharingsettingswithtimeout = new getThirdPartySharingSettingsWithTimeout(String.valueOf(errorBodyParseException.read.read), "error parsing body: " + errorBodyParseException.RemoteActionCompatParcelizer, i4);
            } else {
                Throwable cause = th.getCause();
                HttpException httpException = cause instanceof HttpException ? (HttpException) cause : null;
                if (httpException != null) {
                    int i11 = write + 75;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    strValueOf = String.valueOf(httpException.read);
                } else {
                    strValueOf = null;
                }
                Throwable cause2 = th.getCause();
                HttpException httpException2 = cause2 instanceof HttpException ? (HttpException) cause2 : null;
                if (httpException2 == null || (message = httpException2.RemoteActionCompatParcelizer) == null) {
                    message = th.getMessage();
                }
                getthirdpartysharingsettingswithtimeout = new getThirdPartySharingSettingsWithTimeout(strValueOf, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("unknown exception type with message: ", message), i4);
            }
            getthirdpartysharingsettingswithtimeout2 = getthirdpartysharingsettingswithtimeout;
        }
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.put("errorMsg", getthirdpartysharingsettingswithtimeout2.IconCompatParcelizer);
        String str3 = getthirdpartysharingsettingswithtimeout2.serializer;
        if (str3 != null) {
            int i13 = write + 67;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                str.hashCode();
                throw null;
            }
        }
        String str4 = getthirdpartysharingsettingswithtimeout2.RemoteActionCompatParcelizer;
        if (str4 != null) {
            safesetcliptooutline.put("accountStatus", str4);
        }
        return safesetcliptooutline.IconCompatParcelizer();
    }
}
