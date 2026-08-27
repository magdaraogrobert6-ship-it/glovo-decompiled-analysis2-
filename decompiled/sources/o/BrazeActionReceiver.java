package o;

import com.sentiance.sdk.Token;
import com.sentiance.sdk.TokenResultCallback;
import com.sentiance.sdk.UserAccessTokenError;
import com.sentiance.sdk.UserAccessTokenFailureReason;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeActionReceiver implements TokenResultCallback {
    final /* synthetic */ BrazeNotificationUtilsExternalSyntheticLambda14 read;

    @Override // com.sentiance.sdk.TokenResultCallback
    public final void onFailure() {
        this.read.serializer(new UserAccessTokenError(UserAccessTokenFailureReason.NETWORK_ERROR));
    }

    @Override // com.sentiance.sdk.TokenResultCallback
    public final void onSuccess(Token token) {
        this.read.write(token);
    }

    public BrazeActionReceiver(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        this.read = brazeNotificationUtilsExternalSyntheticLambda14;
    }
}
