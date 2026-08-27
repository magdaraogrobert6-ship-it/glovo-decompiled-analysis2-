package o;

/* JADX INFO: loaded from: classes4.dex */
public final class ensureSubscribedToInAppMessageEventslambda7 extends getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations implements ensureSubscribedToInAppMessageEventslambda3 {
    public static final ensureSubscribedToInAppMessageEventslambda7 IconCompatParcelizer = new ensureSubscribedToInAppMessageEventslambda7(1, 0, 1);

    @Override // o.getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations
    public final String toString() {
        return this.write + ".." + this.read;
    }

    @Override // o.getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations, o.ensureSubscribedToInAppMessageEventslambda3
    public final boolean write() {
        return this.write > this.read;
    }

    @Override // o.getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations
    public final boolean equals(Object obj) {
        if (!(obj instanceof ensureSubscribedToInAppMessageEventslambda7)) {
            return false;
        }
        if (write() && ((ensureSubscribedToInAppMessageEventslambda7) obj).write()) {
            return true;
        }
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) obj;
        return this.write == ensuresubscribedtoinappmessageeventslambda7.write && this.read == ensuresubscribedtoinappmessageeventslambda7.read;
    }

    public final boolean serializer(int i) {
        return this.write <= i && i <= this.read;
    }

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final Comparable IconCompatParcelizer() {
        return Integer.valueOf(this.read);
    }

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final Comparable RemoteActionCompatParcelizer() {
        return Integer.valueOf(this.write);
    }

    @Override // o.getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations
    public final int hashCode() {
        if (write()) {
            return -1;
        }
        return (this.write * 31) + this.read;
    }

    public ensureSubscribedToInAppMessageEventslambda7(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
