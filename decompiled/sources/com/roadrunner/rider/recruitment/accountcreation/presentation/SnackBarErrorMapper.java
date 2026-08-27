package com.roadrunner.rider.recruitment.accountcreation.presentation;

import androidx.compose.ui.graphics.Fields;
import bo.app.b8$$ExternalSyntheticLambda4;
import com.data.error.TooManyRequestsException;
import com.logistics.rider.glovo.R;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.rider.recruitment.accountcreation.data.ApiErrorResponse;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.execSessionSuccessCallbackCommand;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setApplicationContext;
import o.setCarryoverInAppMessage;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class SnackBarErrorMapper {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final NetworkErrorMapperImpl read;
    public final setTransactionSuccessful serializer;

    public SnackBarErrorMapper(setTransactionSuccessful settransactionsuccessful, NetworkErrorMapperImpl networkErrorMapperImpl) {
        settransactionsuccessful.getClass();
        networkErrorMapperImpl.getClass();
        this.serializer = settransactionsuccessful;
        this.read = networkErrorMapperImpl;
    }

    public final setApplicationContext IconCompatParcelizer(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Integer num) {
        execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 13;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        setTransactionSuccessful settransactionsuccessful = this.serializer;
        if (num != null) {
            String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(num.intValue());
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new b8$$ExternalSyntheticLambda4(1);
                int i4 = write + 45;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            execsessionsuccesscallbackcommand = new execSessionSuccessCallbackCommand(strIconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        } else {
            execsessionsuccesscallbackcommand = null;
        }
        return new setApplicationContext(settransactionsuccessful.IconCompatParcelizer(i), null, execsessionsuccesscallbackcommand, 2);
    }

    public final setApplicationContext read(Throwable th, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        int i = 2 % 2;
        Integer numValueOf = Integer.valueOf(R.string.account_creation_try_again_label);
        Integer num = null;
        if (th instanceof ApiErrorResponse.AccountCreationFailureResponse) {
            String str = ((ApiErrorResponse.AccountCreationFailureResponse) th).write.code;
            if (onContentCardDismissed.write(onContentCardClicked.MediaSessionCompatQueueItem(new Integer[]{1101, 1102, 1203, 1302}), str != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str) : null)) {
                return IconCompatParcelizer(R.string.account_creation_account_exists_error_message, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Integer.valueOf(R.string.account_creation_account_exists_label));
            }
            return IconCompatParcelizer(R.string.account_creation_try_again_error_message, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, numValueOf);
        }
        if (th instanceof ApiErrorResponse.PhoneValidationFailureResponse) {
            if (new ensureSubscribedToInAppMessageEventslambda7(400, 499, 1).serializer(((ApiErrorResponse.PhoneValidationFailureResponse) th).IconCompatParcelizer)) {
                int i2 = IconCompatParcelizer + 63;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return IconCompatParcelizer(R.string.login_invalid_phone_message, null, null);
                }
                IconCompatParcelizer(R.string.login_invalid_phone_message, null, null);
                num.hashCode();
                throw null;
            }
        }
        if (th instanceof TooManyRequestsException) {
            return IconCompatParcelizer(R.string.too_many_requests_error, null, null);
        }
        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
            return IconCompatParcelizer(R.string.network_connection_error_message, null, null);
        }
        if (!(th instanceof DecodingFailException)) {
            return new setApplicationContext(this.read.read(th), null, null, 6);
        }
        int i3 = write + 37;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return IconCompatParcelizer(R.string.account_creation_try_again_error_message, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, numValueOf);
        }
        int i4 = 36 / 0;
        return IconCompatParcelizer(R.string.account_creation_try_again_error_message, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, numValueOf);
    }
}
