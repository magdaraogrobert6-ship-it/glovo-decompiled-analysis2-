package o;

import com.roadrunner.auth.api.data.ApiError;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomBrazeNotificationFactory {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final setTransactionSuccessful IconCompatParcelizer;

    public setCustomBrazeNotificationFactory(setTransactionSuccessful settransactionsuccessful) {
        settransactionsuccessful.getClass();
        this.IconCompatParcelizer = settransactionsuccessful;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    public final setApplicationContext RemoteActionCompatParcelizer(Throwable th) {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 83;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        Object obj = null;
        if (th instanceof ApiError.InvalidFlow) {
            int i6 = i4 + 75;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            i = com.logistics.rider.glovo.R.string.two_factor_auth_timeout_error;
        } else if (th instanceof com.data.error.TooManyRequestsException) {
            i = com.logistics.rider.glovo.R.string.two_factor_auth_too_many_attempts_error;
        } else {
            int i7 = i4 + 115;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (th instanceof ApiError.TooManyAttempts) {
                i = com.logistics.rider.glovo.R.string.two_factor_auth_too_many_attempts_error;
            } else {
                i = com.logistics.rider.glovo.R.string.two_factor_auth_account_verification_error;
            }
        }
        setApplicationContext setapplicationcontext = new setApplicationContext(this.IconCompatParcelizer.IconCompatParcelizer(i), null, null, 6);
        int i9 = read + 43;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return setapplicationcontext;
        }
        obj.hashCode();
        throw null;
    }
}
