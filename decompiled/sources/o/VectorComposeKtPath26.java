package o;

import com.deliveryhero.selfServiceChat.data.chat.url.ChatUrlProviderImpl;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComposeKtPath26 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ ChatUrlProviderImpl read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorComposeKtPath26(ChatUrlProviderImpl chatUrlProviderImpl, int i) {
        super(0);
        this.write = i;
        this.read = chatUrlProviderImpl;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.write;
        ChatUrlProviderImpl chatUrlProviderImpl = this.read;
        return i != 0 ? ((AndroidShadowContext) chatUrlProviderImpl.IconCompatParcelizer).write() : ((AndroidShadowContext) chatUrlProviderImpl.IconCompatParcelizer).write();
    }
}
