package o;

/* JADX INFO: loaded from: classes4.dex */
public final class setWebViewContentlambda0 extends _get_messageWebView_lambda3 implements ItemSingleChoiceBinding {
    public final InAppMessageHtmlBaseView RemoteActionCompatParcelizer;
    public final long serializer;

    @Override // o._get_messageWebView_lambda3
    public final long IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return ApiErrorResponseCompanion.PlaybackStateCompat;
    }

    @Override // o._get_messageWebView_lambda3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o._get_messageWebView_lambda3
    public final InAppMessageHtmlBaseView write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o._get_messageWebView_lambda3
    public final RegistryNoSourceEncoderAvailableException read() {
        return new GifDrawableTransformation(this);
    }

    public setWebViewContentlambda0(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, long j) {
        this.RemoteActionCompatParcelizer = inAppMessageHtmlBaseView;
        this.serializer = j;
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) {
        registryMissingComponentException.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }
}
