package o;

import com.sentiance.sdk.TokenResultCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdal_awVTFE12STYFaoAFGTfNdTTsU implements Runnable {
    final /* synthetic */ TokenResultCallback write;

    @Override // java.lang.Runnable
    public final void run() {
        this.write.onFailure();
    }

    public r8lambdal_awVTFE12STYFaoAFGTfNdTTsU(TokenResultCallback tokenResultCallback) {
        this.write = tokenResultCallback;
    }
}
