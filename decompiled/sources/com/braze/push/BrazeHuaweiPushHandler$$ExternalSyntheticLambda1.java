package com.braze.push;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeHuaweiPushHandler$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return BrazeHuaweiPushHandler.handleHmsRemoteMessageData$lambda$1();
            case 1:
                return NotificationTrampolineActivity.AnonymousClass7.invokeSuspend$lambda$0();
            case 2:
                return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$2();
            case 3:
                return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$3();
            case 4:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$3();
            case 5:
                return BrazeHuaweiPushHandler.handleHmsRemoteMessageData$lambda$2();
            case 6:
                return BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$0();
            case 7:
                return BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$1();
            case 8:
                return BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$2();
            case 9:
                return BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$3();
            case 10:
                return BrazeNotificationActionUtils.addNotificationActions$lambda$0();
            case 11:
                return BrazeNotificationActionUtils.addNotificationActions$lambda$1();
            case 12:
                return BrazeNotificationActionUtils.addNotificationAction$lambda$0();
            case 13:
                return BrazeNotificationFactory.createNotification$lambda$0();
            case 14:
                return BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$1();
            case 15:
                return BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$2();
            case 16:
                return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$4();
            case 17:
                return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$0();
            case 18:
                return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$1();
            case 19:
                return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$2();
            case 20:
                return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$4();
            case 21:
                return BrazeNotificationStyleFactory.Companion.setStyleIfSupported$lambda$0();
            case 22:
                return BrazeNotificationStyleFactory.Companion.getStoryStyle$lambda$0();
            case 23:
                return BrazeNotificationStyleFactory.Companion.getStoryStyle$lambda$1();
            case 24:
                return BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$0();
            case 25:
                return BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$1();
            case 26:
                return BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$1();
            case 27:
                return BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$2();
            case 28:
                return BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$2();
            default:
                return BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$0();
        }
    }
}
