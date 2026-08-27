package o;

/* JADX INFO: loaded from: classes4.dex */
public final class setHasAppliedWindowInsets extends _get_messageWebView_lambda3 {
    public final r8lambda0yxD5DkGhVMG1YCzKpa6a1a1ps0 IconCompatParcelizer;
    public final GifDrawableTransformation RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    @Override // o._get_messageWebView_lambda3
    public final RegistryNoSourceEncoderAvailableException read() {
        return this.RemoteActionCompatParcelizer;
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

    @Override // o._get_messageWebView_lambda3
    public final long IconCompatParcelizer() {
        String str = this.read;
        if (str != null) {
            byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public setHasAppliedWindowInsets(r8lambda0yxD5DkGhVMG1YCzKpa6a1a1ps0 r8lambda0yxd5dkghvmg1yczkpa6a1a1ps0, String str, String str2) {
        this.IconCompatParcelizer = r8lambda0yxd5dkghvmg1yczkpa6a1a1ps0;
        this.write = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = new GifDrawableTransformation(new getMessageBackgroundObject((ItemSingleChoiceBinding) r8lambda0yxd5dkghvmg1yczkpa6a1a1ps0.serializer.get(1), this));
    }
}
