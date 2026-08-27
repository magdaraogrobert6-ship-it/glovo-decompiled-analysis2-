package okhttp3;

import o.InAppMessageHtmlBaseView;
import o.RegistryNoImageHeaderParserException;
import o.RequestBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    public final /* synthetic */ InAppMessageHtmlBaseView IconCompatParcelizer;
    public final /* synthetic */ RequestBuilder serializer;

    @Override // okhttp3.RequestBody
    public final InAppMessageHtmlBaseView contentType() {
        return this.IconCompatParcelizer;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.serializer.serializer();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
        registryNoImageHeaderParserException.IconCompatParcelizer(this.serializer);
    }

    public RequestBody$Companion$toRequestBody$1(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, RequestBuilder requestBuilder) {
        this.IconCompatParcelizer = inAppMessageHtmlBaseView;
        this.serializer = requestBuilder;
    }
}
