package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.Token;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public final class performWorklambda6 extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ Sentiance serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public performWorklambda6(Sentiance sentiance) {
        super(sentiance.getSerialExecutor(), "sentiance");
        this.serializer = sentiance;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        synchronized (this.serializer.mTokenRefreshLock) {
            if (obj instanceof Boolean) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Optional<Token> optionalSerializer = ((r8lambdaw447glWJfoun4bg91upXnaDQEZs) setPushUniqueId.read(r8lambdaw447glWJfoun4bg91upXnaDQEZs.class)).serializer();
                boolean zIconCompatParcelizer = optionalSerializer.IconCompatParcelizer();
                Sentiance sentiance = this.serializer;
                if (zIconCompatParcelizer) {
                    sentiance.log("Refresh token finished with result %s. Token: %s", String.valueOf(zBooleanValue), optionalSerializer.write());
                } else {
                    sentiance.log("Refresh token finished with result %s. Token is absent.", String.valueOf(zBooleanValue));
                }
                this.serializer.callUserAccessTokenResultCallbacks(zBooleanValue);
            }
        }
    }
}
