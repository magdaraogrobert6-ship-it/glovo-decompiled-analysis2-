package o;

import com.sentiance.sdk.Sentiance;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class renderUrlIntoViewlambda0 implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ BrazeNotificationUtilsExternalSyntheticLambda14 read;
    public final /* synthetic */ Sentiance serializer;

    public /* synthetic */ renderUrlIntoViewlambda0(Sentiance sentiance, BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = sentiance;
        this.read = brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = this.read;
        Sentiance sentiance = this.serializer;
        if (i == 0) {
            sentiance.lambda$disableDetections$13(brazeNotificationUtilsExternalSyntheticLambda14);
        } else if (i != 1) {
            sentiance.lambda$requestUserAccessToken$40(brazeNotificationUtilsExternalSyntheticLambda14);
        } else {
            sentiance.lambda$stopTrip$30(brazeNotificationUtilsExternalSyntheticLambda14);
        }
    }
}
