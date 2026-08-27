package o;

import android.app.Activity;
import android.content.IntentSender;
import com.huawei.hms.common.ResolvableApiException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onDeviceStateChanged implements getContainer {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ Activity IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ onDeviceStateChanged(Activity activity, getPresentationContext getpresentationcontext, int i) {
        this.write = i;
        this.IconCompatParcelizer = activity;
    }

    @Override // o.getContainer
    public final void onFailure(Exception exc) {
        com.huawei.hms.common.ApiException apiException;
        Integer numValueOf;
        Integer numValueOf2;
        int i = 2 % 2;
        int i2 = this.write;
        Activity activity = this.IconCompatParcelizer;
        ResolvableApiException resolvableApiException = null;
        if (i2 != 0) {
            com.huawei.hms.common.ApiException apiException2 = exc instanceof com.huawei.hms.common.ApiException ? (com.huawei.hms.common.ApiException) exc : null;
            if (apiException2 != null) {
                numValueOf2 = Integer.valueOf(apiException2.getStatusCode());
                int i3 = serializer + 71;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 == null || numValueOf2.intValue() != 6 || activity == null) {
                return;
            }
            int i5 = serializer + 49;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            try {
                if (i5 % 2 == 0) {
                    boolean z = exc instanceof ResolvableApiException;
                    resolvableApiException.hashCode();
                    throw null;
                }
                resolvableApiException = exc instanceof ResolvableApiException ? (ResolvableApiException) exc : null;
                if (resolvableApiException != null) {
                    resolvableApiException.startResolutionForResult(activity, 0);
                    return;
                }
                return;
            } catch (IntentSender.SendIntentException e) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                e.getLocalizedMessage();
                forest.getClass();
                return;
            }
        }
        if (exc instanceof com.huawei.hms.common.ApiException) {
            apiException = (com.huawei.hms.common.ApiException) exc;
        } else {
            int i6 = read + 57;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 4 % 5;
            }
            apiException = null;
        }
        if (apiException != null) {
            int i8 = serializer + 71;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                numValueOf = Integer.valueOf(apiException.getStatusCode());
                int i9 = 66 / 0;
            } else {
                numValueOf = Integer.valueOf(apiException.getStatusCode());
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() != 6 || activity == null) {
            return;
        }
        int i10 = serializer + 61;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i10 % 2 == 0) {
                boolean z2 = exc instanceof ResolvableApiException;
                throw null;
            }
            resolvableApiException = exc instanceof ResolvableApiException ? (ResolvableApiException) exc : null;
            if (resolvableApiException != null) {
                resolvableApiException.startResolutionForResult(activity, 0);
            }
        } catch (IntentSender.SendIntentException e2) {
            Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
            e2.getLocalizedMessage();
            forest2.getClass();
        }
    }
}
