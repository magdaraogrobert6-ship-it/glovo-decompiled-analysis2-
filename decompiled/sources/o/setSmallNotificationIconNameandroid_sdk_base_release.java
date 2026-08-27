package o;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class setSmallNotificationIconNameandroid_sdk_base_release implements Closeable {
    public final r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final long read;
    public final /* synthetic */ int write;

    public /* synthetic */ setSmallNotificationIconNameandroid_sdk_base_release(Object obj, long j, r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = j;
        this.IconCompatParcelizer = r8lambdaoorzolqoybc_uxebbkbnmvlvm7k;
    }

    public final r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k IconCompatParcelizer() {
        int i = this.write;
        r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k = this.IconCompatParcelizer;
        return i != 0 ? (readResourceValuelambda1) r8lambdaoorzolqoybc_uxebbkbnmvlvm7k : (r8lambdaBEyrNr8p6809BwlBoRO_sTaNs) r8lambdaoorzolqoybc_uxebbkbnmvlvm7k;
    }

    public final isHtmlInAppMessageHtmlLinkTargetEnabled RemoteActionCompatParcelizer() {
        int i = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return (isHtmlInAppMessageHtmlLinkTargetEnabled) obj;
        }
        String str = (String) obj;
        if (str != null) {
            try {
                return isHtmlInAppMessageHtmlLinkTargetEnabled.IconCompatParcelizer(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(IconCompatParcelizer());
    }

    public final String serializer() {
        Charset charsetForName;
        r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7kIconCompatParcelizer = IconCompatParcelizer();
        try {
            isHtmlInAppMessageHtmlLinkTargetEnabled ishtmlinappmessagehtmllinktargetenabledRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (ishtmlinappmessagehtmllinktargetenabledRemoteActionCompatParcelizer != null) {
                charsetForName = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.MediaMetadataCompat;
                try {
                    String str = ishtmlinappmessagehtmllinktargetenabledRemoteActionCompatParcelizer.read;
                    if (str != null) {
                        charsetForName = Charset.forName(str);
                    }
                } catch (IllegalArgumentException unused) {
                }
            } else {
                charsetForName = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.MediaMetadataCompat;
            }
            return r8lambdaoorzolqoybc_uxebbkbnmvlvm7kIconCompatParcelizer.write(r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(r8lambdaoorzolqoybc_uxebbkbnmvlvm7kIconCompatParcelizer, charsetForName));
        } finally {
            r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(r8lambdaoorzolqoybc_uxebbkbnmvlvm7kIconCompatParcelizer);
        }
    }

    public final InputStream write() {
        return IconCompatParcelizer().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
    }

    public final long read() {
        return this.write != 0 ? this.read : this.read;
    }
}
