package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getOperator extends _get_messageWebView_lambda3 {
    public final _get_messageWebView_lambda3 IconCompatParcelizer;
    public final GifDrawableTransformation read;
    public IOException serializer;

    @Override // o._get_messageWebView_lambda3
    public final RegistryNoSourceEncoderAvailableException read() {
        return this.read;
    }

    @Override // o._get_messageWebView_lambda3
    public final long IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o._get_messageWebView_lambda3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.IconCompatParcelizer.close();
    }

    @Override // o._get_messageWebView_lambda3
    public final InAppMessageHtmlBaseView write() {
        return this.IconCompatParcelizer.write();
    }

    public getOperator(_get_messageWebView_lambda3 _get_messagewebview_lambda3) {
        this.IconCompatParcelizer = _get_messagewebview_lambda3;
        this.read = new GifDrawableTransformation(new getMessageBackgroundObject(this, _get_messagewebview_lambda3.read()));
    }
}
