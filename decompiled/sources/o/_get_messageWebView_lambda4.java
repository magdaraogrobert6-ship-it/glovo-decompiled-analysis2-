package o;

/* JADX INFO: loaded from: classes4.dex */
public final class _get_messageWebView_lambda4 extends _get_messageWebView_lambda3 {
    public final /* synthetic */ long $contentLength;
    public final /* synthetic */ InAppMessageHtmlBaseView $contentType;
    public final /* synthetic */ RegistryNoSourceEncoderAvailableException $this_asResponseBody;

    @Override // o._get_messageWebView_lambda3
    public final long IconCompatParcelizer() {
        return this.$contentLength;
    }

    @Override // o._get_messageWebView_lambda3
    public final RegistryNoSourceEncoderAvailableException read() {
        return this.$this_asResponseBody;
    }

    @Override // o._get_messageWebView_lambda3
    public final InAppMessageHtmlBaseView write() {
        return this.$contentType;
    }

    public _get_messageWebView_lambda4(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, long j, RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException) {
        this.$contentType = inAppMessageHtmlBaseView;
        this.$contentLength = j;
        this.$this_asResponseBody = registryNoSourceEncoderAvailableException;
    }
}
