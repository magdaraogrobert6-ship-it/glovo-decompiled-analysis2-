package com.roadrunner.delivery.accept.autoaccept.notification;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptNotificationMapperImpl;
import com.roadrunner.notifications.PendingIntentBuilderImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.accessgetTextCentercp;
import o.checkAdjustAdRevenue;
import o.copyNs73l9sdefault;
import o.createFromParcel;
import o.deleteGlobalPartnerParameters;
import o.emojiSupportMatchSaverlambda1;
import o.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class ShowNotification {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final PendingIntentBuilderImpl IconCompatParcelizer;
    public final AutoAcceptNotificationMapperImpl serializer;
    public final deleteGlobalPartnerParameters write;

    public ShowNotification(deleteGlobalPartnerParameters deleteglobalpartnerparameters, PendingIntentBuilderImpl pendingIntentBuilderImpl, AutoAcceptNotificationMapperImpl autoAcceptNotificationMapperImpl) {
        deleteglobalpartnerparameters.getClass();
        this.write = deleteglobalpartnerparameters;
        this.IconCompatParcelizer = pendingIntentBuilderImpl;
        this.serializer = autoAcceptNotificationMapperImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object invoke(copyNs73l9sdefault copyns73l9sdefault, checkAdjustAdRevenue checkadjustadrevenue, ContinuationImpl continuationImpl, boolean z) {
        emojiSupportMatchSaverlambda1 emojisupportmatchsaverlambda1;
        int i = 2 % 2;
        if (continuationImpl instanceof emojiSupportMatchSaverlambda1) {
            emojisupportmatchsaverlambda1 = (emojiSupportMatchSaverlambda1) continuationImpl;
            int i2 = emojisupportmatchsaverlambda1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                emojisupportmatchsaverlambda1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                emojisupportmatchsaverlambda1 = new emojiSupportMatchSaverlambda1(this, continuationImpl);
            }
        } else {
            emojisupportmatchsaverlambda1 = new emojiSupportMatchSaverlambda1(this, continuationImpl);
        }
        Object objInvoke = emojisupportmatchsaverlambda1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = emojisupportmatchsaverlambda1.IconCompatParcelizer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            emojisupportmatchsaverlambda1.IconCompatParcelizer = 1;
            objInvoke = this.serializer.invoke(copyns73l9sdefault, checkadjustadrevenue, emojisupportmatchsaverlambda1, z);
            if (objInvoke == coroutineSingletons) {
                int i4 = read + 19;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = read + 7;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        }
        checkAdjustAdRevenue checkadjustadrevenue2 = (checkAdjustAdRevenue) objInvoke;
        ((s0) this.write).RemoteActionCompatParcelizer(checkadjustadrevenue2, new accessgetTextCentercp(15, this), this.IconCompatParcelizer.IconCompatParcelizer(checkadjustadrevenue2, false));
        return createFromParcel.INSTANCE;
    }
}
