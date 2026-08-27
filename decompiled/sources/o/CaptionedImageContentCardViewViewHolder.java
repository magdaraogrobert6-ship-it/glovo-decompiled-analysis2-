package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class CaptionedImageContentCardViewViewHolder implements Iterator, displayInAppMessagelambda121 {
    public int IconCompatParcelizer;
    public final safeSetClipToOutline RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public final /* synthetic */ int write;

    public CaptionedImageContentCardViewViewHolder(safeSetClipToOutline safesetcliptooutline, int i) {
        this.write = i;
        safesetcliptooutline.getClass();
        this.RemoteActionCompatParcelizer = safesetcliptooutline;
        this.serializer = -1;
        this.IconCompatParcelizer = safesetcliptooutline.MediaDescriptionCompat;
        serializer();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.read < this.RemoteActionCompatParcelizer.MediaMetadataCompat;
    }

    public final void serializer() {
        while (true) {
            int i = this.read;
            safeSetClipToOutline safesetcliptooutline = this.RemoteActionCompatParcelizer;
            if (i >= safesetcliptooutline.MediaMetadataCompat || safesetcliptooutline.MediaSessionCompatResultReceiverWrapper[i] >= 0) {
                return;
            } else {
                this.read = i + 1;
            }
        }
    }

    public final void write() {
        if (this.RemoteActionCompatParcelizer.MediaDescriptionCompat == this.IconCompatParcelizer) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.write;
        safeSetClipToOutline safesetcliptooutline = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            write();
            int i2 = this.read;
            if (i2 >= safesetcliptooutline.MediaMetadataCompat) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            this.read = i2 + 1;
            this.serializer = i2;
            Object obj = safesetcliptooutline.MediaBrowserCompatMediaItem[i2];
            serializer();
            return obj;
        }
        if (i == 1) {
            write();
            int i3 = this.read;
            if (i3 >= safesetcliptooutline.MediaMetadataCompat) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            this.read = i3 + 1;
            this.serializer = i3;
            isClickHandled isclickhandled = new isClickHandled(safesetcliptooutline, i3);
            serializer();
            return isclickhandled;
        }
        write();
        int i4 = this.read;
        if (i4 >= safesetcliptooutline.MediaMetadataCompat) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.read = i4 + 1;
        this.serializer = i4;
        Object[] objArr = safesetcliptooutline.ParcelableVolumeInfo;
        objArr.getClass();
        Object obj2 = objArr[this.serializer];
        serializer();
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        write();
        if (this.serializer == -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Call next() before removing element from the iterator.");
            return;
        }
        safeSetClipToOutline safesetcliptooutline = this.RemoteActionCompatParcelizer;
        safesetcliptooutline.read();
        safesetcliptooutline.IconCompatParcelizer(this.serializer);
        this.serializer = -1;
        this.IconCompatParcelizer = safesetcliptooutline.MediaDescriptionCompat;
    }
}
