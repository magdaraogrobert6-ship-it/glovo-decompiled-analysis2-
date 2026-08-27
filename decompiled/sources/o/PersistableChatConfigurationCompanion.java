package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class PersistableChatConfigurationCompanion extends TokenRefreshAuthenticator {
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PersistableChatConfigurationCompanion(byte[] bArr, int i) {
        super(bArr, i);
        this.IconCompatParcelizer = 1;
    }

    @Override // o.TokenRefreshAuthenticator, o.provideRequest
    public final provideRequest MediaSessionCompatQueueItem() {
        return this;
    }

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        int i = this.IconCompatParcelizer;
        byte[] bArr = this.write;
        if (i == 0) {
            userAgentHeaderInterceptorKt.read(z, 3, bArr);
            return;
        }
        byte b = bArr[0];
        int length = bArr.length;
        int i2 = length - 1;
        byte b2 = bArr[i2];
        byte b3 = (byte) ((255 << (b & 255)) & b2);
        if (b2 == b3) {
            userAgentHeaderInterceptorKt.read(z, 3, bArr);
            return;
        }
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(3, z);
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(length);
        userAgentHeaderInterceptorKt.IconCompatParcelizer(bArr, 0, i2);
        userAgentHeaderInterceptorKt.write(b3);
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return this.IconCompatParcelizer != 0 ? UserAgentHeaderInterceptorKt.write(this.write.length, z) : UserAgentHeaderInterceptorKt.write(this.write.length, z);
    }

    @Override // o.TokenRefreshAuthenticator, o.provideRequest
    public provideRequest toDERObject() {
        return this.IconCompatParcelizer != 1 ? super.toDERObject() : this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PersistableChatConfigurationCompanion(byte[] bArr, int i, byte b) {
        super(bArr);
        this.IconCompatParcelizer = i;
    }
}
