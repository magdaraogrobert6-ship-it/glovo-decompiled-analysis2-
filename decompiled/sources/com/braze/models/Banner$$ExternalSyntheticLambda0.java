package com.braze.models;

import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageHtmlBase;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Banner$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Banner$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return Banner.forJsonPut$lambda$1();
            case 1:
                return BrazeGeofenceManager.unregisterGeofences$lambda$0();
            case 2:
                return BrazeGeofenceManager.unregisterGeofences$lambda$1();
            case 3:
                return BrazeGeofenceManager.tearDownGeofences$lambda$2$0();
            case 4:
                return BrazeGeofenceManager.postGeofenceReport$lambda$0();
            case 5:
                return BrazeGeofenceManager.requestGeofenceRefresh$lambda$0();
            case 6:
                return BrazeGeofenceManager.initializeGeofences$lambda$0();
            case 7:
                return BrazeGeofenceManager.initializeGeofences$lambda$1();
            case 8:
                return FeatureFlag.forJsonPut$lambda$0();
            case 9:
                return Card._set_isIndicatorHighlighted_$lambda$0();
            case 10:
                return Card.isValidCard$lambda$0();
            case 11:
                return Card._set_isDismissed_$lambda$0();
            case 12:
                return Card._set_isDismissed_$lambda$2();
            case 13:
                return InAppMessageBase.forJsonPut$lambda$1();
            case 14:
                return InAppMessageBase.setClickBehavior$lambda$0();
            case 15:
                return InAppMessageBase.logImpression$lambda$1();
            case 16:
                return InAppMessageBase.logImpression$lambda$2();
            case 17:
                return InAppMessageBase.logImpression$lambda$0();
            case 18:
                return InAppMessageBase.enableDarkTheme$lambda$0();
            case 19:
                return InAppMessageBase.handleLogClick$lambda$1();
            case 20:
                return InAppMessageBase.handleLogClick$lambda$2();
            case 21:
                return InAppMessageBase.handleLogClick$lambda$0();
            case 22:
                return InAppMessageControl.logImpression$lambda$0();
            case 23:
                return InAppMessageControl.logImpression$lambda$2();
            case 24:
                return InAppMessageControl.logImpression$lambda$3();
            case 25:
                return InAppMessageControl.logImpression$lambda$1();
            case 26:
                return InAppMessageHtmlBase.logButtonClick$lambda$1();
            case 27:
                return InAppMessageHtmlBase.logButtonClick$lambda$2();
            case 28:
                return InAppMessageHtmlBase.logButtonClick$lambda$3();
            default:
                return InAppMessageImmersiveBase.enableDarkTheme$lambda$0();
        }
    }
}
