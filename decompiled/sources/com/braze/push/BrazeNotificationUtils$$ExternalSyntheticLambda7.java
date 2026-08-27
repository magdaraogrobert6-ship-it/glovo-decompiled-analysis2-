package com.braze.push;

import android.app.NotificationChannel;
import androidx.core.app.NotificationManagerCompat;
import com.braze.models.push.BrazeNotificationPayload;
import com.google.firebase.messaging.RemoteMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda7(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$3((NotificationChannel) obj);
        }
        if (i == 1) {
            return BrazeNotificationUtils.sendPushActionIntent$lambda$0((BrazeNotificationUtils.BrazeNotificationBroadcastType) obj);
        }
        if (i == 2) {
            return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$0((RemoteMessage) obj);
        }
        if (i != 3) {
            return i != 4 ? BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$11((NotificationManagerCompat) obj) : BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$1((BrazeNotificationPayload.ConversationMessage) obj);
        }
        return BrazeNotificationActionUtils.addNotificationActions$lambda$2((BrazeNotificationPayload.ActionButton) obj);
    }
}
