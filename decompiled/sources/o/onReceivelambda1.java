package o;

import com.sentiance.sdk.Token;
import com.sentiance.sdk.TokenResultCallback;
import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public final class onReceivelambda1 implements Runnable {
    final /* synthetic */ TokenResultCallback IconCompatParcelizer;
    final /* synthetic */ Optional read;

    @Override // java.lang.Runnable
    public final void run() {
        Optional optional = this.read;
        boolean zIconCompatParcelizer = optional.IconCompatParcelizer();
        TokenResultCallback tokenResultCallback = this.IconCompatParcelizer;
        if (zIconCompatParcelizer) {
            tokenResultCallback.onSuccess((Token) optional.write());
        } else {
            tokenResultCallback.onFailure();
        }
    }

    public onReceivelambda1(Optional optional, TokenResultCallback tokenResultCallback) {
        this.read = optional;
        this.IconCompatParcelizer = tokenResultCallback;
    }
}
