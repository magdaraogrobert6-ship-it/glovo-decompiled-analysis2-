package com.braze.ui;

import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UserJavascriptInterfaceBase$$ExternalSyntheticLambda1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NotificationSubscriptionType f$0;

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda1(NotificationSubscriptionType notificationSubscriptionType, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationSubscriptionType;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        NotificationSubscriptionType notificationSubscriptionType = this.f$0;
        BrazeUser brazeUser = (BrazeUser) obj;
        if (i == 0) {
            return UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$1(notificationSubscriptionType, brazeUser);
        }
        if (i != 1) {
            return i != 2 ? SetPushNotificationSubscriptionStep.run$lambda$1(notificationSubscriptionType, brazeUser) : SetEmailSubscriptionStep.run$lambda$1(notificationSubscriptionType, brazeUser);
        }
        return UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$1(notificationSubscriptionType, brazeUser);
    }
}
