package com.roadrunner.networking.errormapper;

import androidx.compose.ui.graphics.Fields;
import com.data.error.ApiException;
import com.data.error.TooManyRequestsException;
import com.logistics.rider.glovo.R;
import com.roadrunner.common.data.api.ErrorBodyParseException;
import o.hideCurrentlyDisplayingInAppMessage;
import o.pauseWebviewIfNecessarylambda10;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkErrorMapperImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final setTransactionSuccessful serializer;

    public NetworkErrorMapperImpl(setTransactionSuccessful settransactionsuccessful) {
        this.serializer = settransactionsuccessful;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00e2 A[PHI: r8
  0x00e2: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v8 java.lang.String) binds: [B:59:0x00e0, B:56:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec A[RETURN] */
    public final String read(Throwable th) {
        String str;
        int i = 2 % 2;
        th.getClass();
        boolean z = th instanceof ApiException;
        setTransactionSuccessful settransactionsuccessful = this.serializer;
        String str2 = null;
        if (!z) {
            if (!(!(th instanceof TooManyRequestsException))) {
                return settransactionsuccessful.IconCompatParcelizer(R.string.too_many_requests_error);
            }
            if (!(th instanceof ErrorBodyParseException)) {
                if (!pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
                    return settransactionsuccessful.IconCompatParcelizer(R.string.all_error_message);
                }
                int i2 = write + 3;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return settransactionsuccessful.IconCompatParcelizer(R.string.network_connection_error_message);
                }
                int i3 = 83 / 0;
                return settransactionsuccessful.IconCompatParcelizer(R.string.network_connection_error_message);
            }
            int i4 = write + 57;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                str = ((ErrorBodyParseException) th).IconCompatParcelizer;
                int i5 = 18 / 0;
                if (str != null) {
                    str2 = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? null : str;
                    if (str2 != null) {
                        return str2;
                    }
                }
            } else {
                str = ((ErrorBodyParseException) th).IconCompatParcelizer;
                if (str != null) {
                    if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    }
                    if (str2 != null) {
                        return str2;
                    }
                }
            }
            return settransactionsuccessful.IconCompatParcelizer(R.string.all_error_message);
        }
        ApiException apiException = (ApiException) th;
        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) apiException.getMessage())) {
            int i6 = write + 65;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return apiException.getMessage();
            }
            int i7 = 55 / 0;
            return apiException.getMessage();
        }
        String str3 = apiException.read().localizeKey;
        if (str3 == null) {
            int i8 = RemoteActionCompatParcelizer + 47;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                str2.hashCode();
                throw null;
            }
            str3 = "";
        }
        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
            int i9 = write + 91;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                String str4 = apiException.read().localizeKey;
                str2.hashCode();
                throw null;
            }
            String str5 = apiException.read().localizeKey;
            String str6 = settransactionsuccessful.read(str5 != null ? str5 : "");
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str6)) {
                int i10 = RemoteActionCompatParcelizer + 101;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    return str6;
                }
                str2.hashCode();
                throw null;
            }
        }
        return settransactionsuccessful.IconCompatParcelizer(R.string.all_error_message);
    }
}
