package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.adjust.implementation.AdjustException;
import fwfd.com.fwfsdk.constant.FWFConstants;
import org.json.JSONException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SemanticsConfigurationKt implements com.adjust.sdk.OnEventTrackingFailedListener, com.adjust.sdk.OnSessionTrackingFailedListener, com.adjust.sdk.OnSessionTrackingSucceededListener {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ zzz serializer;

    public /* synthetic */ SemanticsConfigurationKt(zzz zzzVar) {
        this.serializer = zzzVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    @Override // com.adjust.sdk.OnSessionTrackingSucceededListener
    public void onSessionTrackingSucceeded(com.adjust.sdk.AdjustSessionSuccess adjustSessionSuccess) {
        int i;
        String str;
        int i2 = 2 % 2;
        removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101 = (removeSingleSubscriptionlambda101) this.serializer.serializer;
        if (adjustSessionSuccess != null) {
            int i3 = write + 81;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                String str2 = adjustSessionSuccess.message;
                throw null;
            }
            str = adjustSessionSuccess.message;
            if (str == null) {
                i = read + 1;
                write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i4 = 4 / 2;
                }
                str = "";
            }
        } else {
            i = read + 1;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i5 = 4 / 2;
            }
            str = "";
        }
        ff$$ExternalSyntheticOutline0.m("message", str, removesinglesubscriptionlambda101.RemoteActionCompatParcelizer, "adjust_session_tracking_succeeded");
    }

    @Override // com.adjust.sdk.OnEventTrackingFailedListener
    public void onEventTrackingFailed(com.adjust.sdk.AdjustEventFailure adjustEventFailure) {
        String message;
        String str;
        String strSerializer;
        int i = 2 % 2;
        try {
            strSerializer = adjustEventFailure.jsonResponse.getString(FWFConstants.EXPLANATION_TYPE_ERROR);
        } catch (NullPointerException e) {
            Timber.RemoteActionCompatParcelizer.write(new AdjustException(e.getMessage(), e));
            message = e.getMessage();
            str = "NullPointerException=";
            strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(str, message);
            int i2 = read + 53;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } catch (JSONException e2) {
            Timber.RemoteActionCompatParcelizer.write(new AdjustException(e2.getMessage(), e2));
            message = e2.getMessage();
            str = "JSONException=";
            strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(str, message);
            int i4 = read + 53;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101 = (removeSingleSubscriptionlambda101) this.serializer.serializer;
        strSerializer.getClass();
        ff$$ExternalSyntheticOutline0.m("errorMessage", strSerializer, removesinglesubscriptionlambda101.RemoteActionCompatParcelizer, "adjust_event_tracking_failed");
        int i6 = write + 83;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.adjust.sdk.OnSessionTrackingFailedListener
    public void onSessionTrackingFailed(com.adjust.sdk.AdjustSessionFailure adjustSessionFailure) {
        String strM;
        int i = 2 % 2;
        int i2 = write + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                strM = adjustSessionFailure.jsonResponse.getString(FWFConstants.EXPLANATION_TYPE_ERROR);
                int i3 = 17 / 0;
            } else {
                strM = adjustSessionFailure.jsonResponse.getString(FWFConstants.EXPLANATION_TYPE_ERROR);
            }
        } catch (NullPointerException e) {
            Timber.RemoteActionCompatParcelizer.write(new AdjustException(e.getMessage(), e));
            strM = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("NullPointerException=", e.getMessage());
        } catch (JSONException e2) {
            Timber.RemoteActionCompatParcelizer.write(new AdjustException(e2.getMessage(), e2));
            strM = ff$$ExternalSyntheticOutline0.m("JSONException=`", e2.getMessage(), "`");
            int i4 = write + 57;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 4 % 2;
            }
        }
        removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101 = (removeSingleSubscriptionlambda101) this.serializer.serializer;
        strM.getClass();
        ff$$ExternalSyntheticOutline0.m("errorMessage", strM, removesinglesubscriptionlambda101.RemoteActionCompatParcelizer, "adjust_session_tracking_failed");
        int i6 = write + 87;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
