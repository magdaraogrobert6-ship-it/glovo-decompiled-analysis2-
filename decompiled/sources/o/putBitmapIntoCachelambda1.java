package o;

import com.sentiance.sdk.Sentiance;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class putBitmapIntoCachelambda1 implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ Sentiance RemoteActionCompatParcelizer;
    public final /* synthetic */ BrazeNotificationUtilsExternalSyntheticLambda14 read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ putBitmapIntoCachelambda1(Sentiance sentiance, BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, String str, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = sentiance;
        this.read = brazeNotificationUtilsExternalSyntheticLambda14;
        this.write = str;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.serializer;
        String str = this.write;
        BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14 = this.read;
        Sentiance sentiance = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            sentiance.lambda$createLinkedUser$2(brazeNotificationUtilsExternalSyntheticLambda14, str);
        } else {
            sentiance.lambda$linkUser$3(brazeNotificationUtilsExternalSyntheticLambda14, str);
        }
    }
}
