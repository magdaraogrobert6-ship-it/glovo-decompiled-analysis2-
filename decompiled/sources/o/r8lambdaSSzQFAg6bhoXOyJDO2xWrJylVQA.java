package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.authentication.UserLinkingError;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaSSzQFAg6bhoXOyJDO2xWrJylVQA implements registerGeofencesWithGeofencingClientlambda32 {
    final /* synthetic */ Sentiance serializer;
    final /* synthetic */ BrazeNotificationUtilsExternalSyntheticLambda14 write;

    @Override // o.registerGeofencesWithGeofencingClientlambda32
    public final void serializer(int i, String str) {
        this.write.serializer(new UserLinkingError(this.serializer.toUserLinkingFailureReason(i), str));
    }

    public r8lambdaSSzQFAg6bhoXOyJDO2xWrJylVQA(Sentiance sentiance, BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        this.serializer = sentiance;
        this.write = brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // o.registerGeofencesWithGeofencingClientlambda32
    public final void serializer(r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty) {
        this.serializer.setUserLinkingOperationResult(this.write, r8lambdazcbg_e0hjusjy78mvgh54swzqty);
    }
}
