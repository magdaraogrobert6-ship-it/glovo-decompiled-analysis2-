package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageWebViewClientListenerCompanion implements r8lambda92M0P9sIT5Uf70mvjF4RwMruDA {
    public final DefaultInAppMessageModalViewFactory IconCompatParcelizer;
    public final String write;

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int IconCompatParcelizer() {
        return 0;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean MediaBrowserCompatMediaItem() {
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final RegexKt RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List read() {
        return instance_delegatelambda0.write;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String serializer() {
        return this.write;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write() {
        return false;
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }

    public DefaultInAppMessageWebViewClientListenerCompanion(String str, DefaultInAppMessageModalViewFactory defaultInAppMessageModalViewFactory) {
        defaultInAppMessageModalViewFactory.getClass();
        this.write = str;
        this.IconCompatParcelizer = defaultInAppMessageModalViewFactory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultInAppMessageWebViewClientListenerCompanion)) {
            return false;
        }
        DefaultInAppMessageWebViewClientListenerCompanion defaultInAppMessageWebViewClientListenerCompanion = (DefaultInAppMessageWebViewClientListenerCompanion) obj;
        if (!this.write.equals(defaultInAppMessageWebViewClientListenerCompanion.write)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, defaultInAppMessageWebViewClientListenerCompanion.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int read(String str) {
        str.getClass();
        MediaMetadataCompat();
        throw null;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String IconCompatParcelizer(int i) {
        MediaMetadataCompat();
        throw null;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer(int i) {
        MediaMetadataCompat();
        throw null;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List serializer(int i) {
        MediaMetadataCompat();
        throw null;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("PrimitiveDescriptor("), this.write, ')');
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write(int i) {
        MediaMetadataCompat();
        throw null;
    }

    public final void MediaMetadataCompat() {
        throw new IllegalStateException(ff$$ExternalSyntheticOutline0.m(new StringBuilder("Primitive descriptor "), this.write, " does not have elements"));
    }
}
