package o;

import java.util.List;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageHtmlViewFactory implements r8lambda92M0P9sIT5Uf70mvjF4RwMruDA {
    public final getAppropriateModalView IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final getUnregisteredInAppMessageannotations read;

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean MediaBrowserCompatMediaItem() {
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write() {
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer.MediaSessionCompatQueueItem;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String IconCompatParcelizer(int i) {
        return this.IconCompatParcelizer.serializer[i];
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final RegexKt RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.MediaMetadataCompat;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer(int i) {
        return this.IconCompatParcelizer.write[i];
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) this.read).hashCode() * 31);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List read() {
        return this.IconCompatParcelizer.IconCompatParcelizer;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List serializer(int i) {
        return this.IconCompatParcelizer.read[i];
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write(int i) {
        return this.IconCompatParcelizer.RatingCompat[i];
    }

    public DefaultInAppMessageHtmlViewFactory(getAppropriateModalView getappropriatemodalview, getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        getunregisteredinappmessageannotations.getClass();
        this.IconCompatParcelizer = getappropriatemodalview;
        this.read = getunregisteredinappmessageannotations;
        this.RemoteActionCompatParcelizer = getappropriatemodalview.MediaBrowserCompatMediaItem + '<' + ((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations).IconCompatParcelizer() + '>';
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int read(String str) {
        str.getClass();
        return this.IconCompatParcelizer.read(str);
    }

    public final boolean equals(Object obj) {
        DefaultInAppMessageHtmlViewFactory defaultInAppMessageHtmlViewFactory = obj instanceof DefaultInAppMessageHtmlViewFactory ? (DefaultInAppMessageHtmlViewFactory) obj : null;
        if (defaultInAppMessageHtmlViewFactory == null || !this.IconCompatParcelizer.equals(defaultInAppMessageHtmlViewFactory.IconCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{defaultInAppMessageHtmlViewFactory.read, this.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.read + ", original: " + this.IconCompatParcelizer + ')';
    }
}
