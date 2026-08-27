package com.braze.push;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$2(str);
            case 1:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$4(str);
            case 2:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$5(str);
            case 3:
                return BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$0(str);
            case 4:
                return BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$1(str);
            case 5:
                return BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$2(str);
            case 6:
                return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$1(str);
            case 7:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$0(str);
            case 8:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$1(str);
            case 9:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$2(str);
            case 10:
                return BrazeNotificationActionUtils.addNotificationAction$lambda$1(str);
            case 11:
                return BrazeNotificationActionUtils.addNotificationAction$lambda$2(str);
            case 12:
                return BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$0(str);
            case 13:
                return BrazeNotificationUtils.logBaiduNotificationClick$lambda$2(str);
            case 14:
                return BrazeNotificationUtils.getValidNotificationChannel$lambda$1(str);
            case 15:
                return BrazeNotificationUtils.getValidNotificationChannel$lambda$2(str);
            case 16:
                return BrazeNotificationUtils.handlePushStoryPageClicked$lambda$0(str);
            case 17:
                return BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush$lambda$1$0(str);
            case 18:
                return BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$0(str);
            case 19:
                return BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$1(str);
            case 20:
                return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$1(str);
            case 21:
                return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$2(str);
            default:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$4$0(str);
        }
    }
}
