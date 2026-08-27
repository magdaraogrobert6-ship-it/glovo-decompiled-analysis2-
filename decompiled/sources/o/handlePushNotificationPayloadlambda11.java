package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class handlePushNotificationPayloadlambda11 extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I {
    final /* synthetic */ handlePushperformWorklambda2 IconCompatParcelizer;

    public handlePushNotificationPayloadlambda11(handlePushperformWorklambda2 handlepushperformworklambda2) {
        this.IconCompatParcelizer = handlepushperformworklambda2;
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) {
        if (setshouldpersistwebviewwhenbackgroundingapp.write() && setshouldpersistwebviewwhenbackgroundingapp.RatingCompat.write().contains("_rs")) {
            return;
        }
        this.IconCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer("Failed to submit reset payload. Response: %s", setshouldpersistwebviewwhenbackgroundingapp.toString());
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        this.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer(false, iOException, "Failed to submit reset payload.", new Object[0]);
    }
}
