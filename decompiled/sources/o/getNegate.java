package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getNegate extends _get_messageWebView_lambda3 {
    public final long read;
    public final InAppMessageHtmlBaseView write;

    @Override // o._get_messageWebView_lambda3
    public final long IconCompatParcelizer() {
        return this.read;
    }

    @Override // o._get_messageWebView_lambda3
    public final InAppMessageHtmlBaseView write() {
        return this.write;
    }

    public getNegate(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, long j) {
        this.write = inAppMessageHtmlBaseView;
        this.read = j;
    }

    @Override // o._get_messageWebView_lambda3
    public final RegistryNoSourceEncoderAvailableException read() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
