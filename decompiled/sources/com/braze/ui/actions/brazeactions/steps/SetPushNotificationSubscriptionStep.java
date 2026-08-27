package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda1;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class SetPushNotificationSubscriptionStep extends BaseBrazeActionStep {
    public static final SetPushNotificationSubscriptionStep INSTANCE;
    private static final String TAG;

    private SetPushNotificationSubscriptionStep() {
        super(null);
    }

    public final String getTAG() {
        return TAG;
    }

    static {
        SetPushNotificationSubscriptionStep setPushNotificationSubscriptionStep = new SetPushNotificationSubscriptionStep();
        INSTANCE = setPushNotificationSubscriptionStep;
        TAG = BrazeLogger.INSTANCE.brazeLogTag(setPushNotificationSubscriptionStep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel run$lambda$1(NotificationSubscriptionType notificationSubscriptionType, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setPushNotificationSubscriptionType(notificationSubscriptionType);
        return createFromParcel.INSTANCE;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        NotificationSubscriptionType notificationSubscriptionTypeFromValue = NotificationSubscriptionType.Companion.fromValue(String.valueOf(stepData.getFirstArg()));
        int i = 3;
        if (notificationSubscriptionTypeFromValue == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new StepData$$ExternalSyntheticLambda1(i, stepData), 7, (Object) null);
        } else {
            BaseBrazeActionStep.Companion.runOnUser$android_sdk_ui_release(Braze.Companion.getInstance(context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda1(notificationSubscriptionTypeFromValue, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String run$lambda$0(StepData stepData) {
        return "Could not parse subscription type from data " + stepData;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return StepData.isArgCountInBounds$default(stepData, 1, null, 2, null) && stepData.isArgString(0);
    }
}
