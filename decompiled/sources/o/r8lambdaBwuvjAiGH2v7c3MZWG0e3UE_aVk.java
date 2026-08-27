package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaBwuvjAiGH2v7c3MZWG0e3UE_aVk extends _get_messageWebView_lambda3 {
    public final long RemoteActionCompatParcelizer;
    public final GifDrawableTransformation read;
    public final String write;

    @Override // o._get_messageWebView_lambda3
    public final long IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o._get_messageWebView_lambda3
    public final RegistryNoSourceEncoderAvailableException read() {
        return this.read;
    }

    @Override // o._get_messageWebView_lambda3
    public final InAppMessageHtmlBaseView write() {
        String str = this.write;
        if (str == null) {
            return null;
        }
        getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
        try {
            return androidx.sqlite.SQLite.write(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public r8lambdaBwuvjAiGH2v7c3MZWG0e3UE_aVk(String str, long j, GifDrawableTransformation gifDrawableTransformation) {
        this.write = str;
        this.RemoteActionCompatParcelizer = j;
        this.read = gifDrawableTransformation;
    }
}
