package o;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class setInAppMessageImageView extends applyInAppMessageParameters {
    public final /* synthetic */ getInAppMessageImageView MediaBrowserCompatMediaItem;
    public boolean MediaSessionCompatQueueItem;
    public long read;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r11.MediaSessionCompatQueueItem == false) goto L31;
     */
    @Override // o.applyInAppMessageParameters, o.ItemSingleChoiceBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long RemoteActionCompatParcelizer(o.RegistryMissingComponentException r12, long r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInAppMessageImageView.RemoteActionCompatParcelizer(o.RegistryMissingComponentException, long):long");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setInAppMessageImageView(getInAppMessageImageView getinappmessageimageview, setInAppMessageImageViewAttributes setinappmessageimageviewattributes) {
        super(getinappmessageimageview, setinappmessageimageviewattributes);
        setinappmessageimageviewattributes.getClass();
        this.MediaBrowserCompatMediaItem = getinappmessageimageview;
        this.read = -1L;
        this.MediaSessionCompatQueueItem = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        if (this.MediaSessionCompatQueueItem) {
            TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
            TimeUnit.MILLISECONDS.getClass();
            try {
                if (!setWebViewContent.RemoteActionCompatParcelizer(this, 100)) {
                    this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer.RatingCompat();
                    write(getInAppMessageImageView.read);
                }
            } catch (IOException unused) {
            }
        }
        this.RemoteActionCompatParcelizer = true;
    }
}
