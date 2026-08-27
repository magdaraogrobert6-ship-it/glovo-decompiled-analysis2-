package o;

import com.sentiance.sdk.Token;
import com.sentiance.sdk.TokenResultCallback;
import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public final class IBrazeImageLoader implements Runnable {
    final /* synthetic */ boolean IconCompatParcelizer;
    final /* synthetic */ TokenResultCallback read;
    final /* synthetic */ Optional serializer;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.IconCompatParcelizer;
        TokenResultCallback tokenResultCallback = this.read;
        if (z) {
            Optional optional = this.serializer;
            if (optional.IconCompatParcelizer()) {
                tokenResultCallback.onSuccess((Token) optional.write());
                return;
            }
        }
        tokenResultCallback.onFailure();
    }

    public IBrazeImageLoader(boolean z, Optional optional, TokenResultCallback tokenResultCallback) {
        this.IconCompatParcelizer = z;
        this.serializer = optional;
        this.read = tokenResultCallback;
    }
}
