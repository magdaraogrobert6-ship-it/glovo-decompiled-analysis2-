package bo.app;

import androidx.compose.foundation.ScrollState;
import com.braze.configuration.BrazeConfig;
import com.braze.enums.Month;
import com.braze.location.BrazeActionReceiver;
import com.braze.location.GooglePlayLocationUtils;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.BrazePushReceiver;
import com.braze.support.PermissionUtils;
import com.braze.support.ValidationUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ n$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return n.a(this.f$0);
            case 1:
                return new ScrollState(this.f$0);
            case 2:
                return b2.b(this.f$0);
            case 3:
                return b2.a(this.f$0);
            case 4:
                return o8.a(this.f$0);
            case 5:
                return sg.a(this.f$0);
            case 6:
                return BrazeConfig.Builder.setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$lambda$0(this.f$0);
            case 7:
                return Month.Companion.getMonth$lambda$1$0(this.f$0);
            case 8:
                return BrazeActionReceiver.ActionReceiver.Companion.handleGeofenceEvent$lambda$0(this.f$0);
            case 9:
                return BrazeActionReceiver.ActionReceiver.Companion.handleGeofenceEvent$lambda$3(this.f$0);
            case 10:
                return GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$0(this.f$0);
            case 11:
                return GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$1(this.f$0);
            case 12:
                return GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$0(this.f$0);
            case 13:
                return GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$1(this.f$0);
            case 14:
                return GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$2(this.f$0);
            case 15:
                return GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$4(this.f$0);
            case 16:
                return GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$2(this.f$0);
            case 17:
                return GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$4(this.f$0);
            case 18:
                return InAppMessageBase._set_durationInMilliseconds_$lambda$0(this.f$0);
            case 19:
                return InAppMessageBase._set_durationInMilliseconds_$lambda$1(this.f$0);
            case 20:
                return BrazeNotificationUtils.getNotificationId$lambda$3(this.f$0);
            case 21:
                return BrazeNotificationUtils.setNotificationDurationAlarm$lambda$0(this.f$0);
            case 22:
                return BrazeNotificationUtils.cancelNotification$lambda$0(this.f$0);
            case 23:
                return BrazeNotificationUtils.handleCancelNotificationAction$lambda$0(this.f$0);
            case 24:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$1(this.f$0);
            case 25:
                return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$4(this.f$0);
            case 26:
                return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$2(this.f$0);
            case 27:
                return ValidationUtils.isValidLogPurchaseInput$lambda$5(this.f$0);
            case 28:
                return ValidationUtils.isValidLogPurchaseInput$lambda$6(this.f$0);
            default:
                return com.braze.support.g.a(this.f$0);
        }
    }
}
