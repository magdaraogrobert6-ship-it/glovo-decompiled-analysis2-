package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ClipboardExtensions_androidKt extends getClipMetadata {
    public final byte[] MediaSessionCompatQueueItem;

    @Override // o.getClipMetadata
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public int MediaBrowserCompatMediaItem() {
        return 0;
    }

    @Override // o.getClipMetadata
    public final int RemoteActionCompatParcelizer() {
        return 0;
    }

    @Override // o.getClipMetadata
    public int RatingCompat() {
        return this.MediaSessionCompatQueueItem.length;
    }

    @Override // o.getClipMetadata
    public byte RemoteActionCompatParcelizer(int i) {
        return this.MediaSessionCompatQueueItem[i];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Clipboard(this);
    }

    @Override // o.getClipMetadata
    public final String read(Charset charset) {
        return new String(this.MediaSessionCompatQueueItem, MediaBrowserCompatMediaItem(), RatingCompat(), charset);
    }

    @Override // o.getClipMetadata
    public byte serializer(int i) {
        return this.MediaSessionCompatQueueItem[i];
    }

    @Override // o.getClipMetadata
    public void serializer(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.MediaSessionCompatQueueItem, i, bArr, i2, i3);
    }

    public ClipboardExtensions_androidKt(byte[] bArr) {
        bArr.getClass();
        this.MediaSessionCompatQueueItem = bArr;
    }

    @Override // o.getClipMetadata
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof getClipMetadata) && RatingCompat() == ((getClipMetadata) obj).RatingCompat()) {
            if (RatingCompat() == 0) {
                return true;
            }
            if (obj instanceof ClipboardExtensions_androidKt) {
                ClipboardExtensions_androidKt clipboardExtensions_androidKt = (ClipboardExtensions_androidKt) obj;
                int i = this.RemoteActionCompatParcelizer;
                int i2 = clipboardExtensions_androidKt.RemoteActionCompatParcelizer;
                if (i == 0 || i2 == 0 || i == i2) {
                    return write(clipboardExtensions_androidKt, 0, RatingCompat());
                }
            } else {
                return obj.equals(this);
            }
        }
        return false;
    }

    @Override // o.getClipMetadata
    public final CodedInputStream MediaSessionCompatQueueItem() {
        return CodedInputStream.serializer(this.MediaSessionCompatQueueItem, MediaBrowserCompatMediaItem(), RatingCompat(), true);
    }

    @Override // o.getClipMetadata
    public final void read(ComposeView composeView) {
        composeView.serializer(this.MediaSessionCompatQueueItem, MediaBrowserCompatMediaItem(), RatingCompat());
    }

    @Override // o.getClipMetadata
    public final boolean read() {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        return IndirectPointerNavigationGestureDetector.write.read(this.MediaSessionCompatQueueItem, iMediaBrowserCompatMediaItem, RatingCompat() + iMediaBrowserCompatMediaItem);
    }

    @Override // o.getClipMetadata
    public final ByteBuffer write() {
        return ByteBuffer.wrap(this.MediaSessionCompatQueueItem, MediaBrowserCompatMediaItem(), RatingCompat()).asReadOnlyBuffer();
    }

    @Override // o.getClipMetadata
    public final getClipMetadata write(int i, int i2) {
        int iSerializer = getClipMetadata.serializer(i, i2, RatingCompat());
        if (iSerializer == 0) {
            return getClipMetadata.serializer;
        }
        return new getClipDescription(this.MediaSessionCompatQueueItem, MediaBrowserCompatMediaItem() + i, iSerializer);
    }

    @Override // o.getClipMetadata
    public final int write(int i, int i2, int i3) {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem() + i2;
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
        for (int i4 = iMediaBrowserCompatMediaItem; i4 < iMediaBrowserCompatMediaItem + i3; i4++) {
            i = (i * 31) + this.MediaSessionCompatQueueItem[i4];
        }
        return i;
    }

    @Override // o.getClipMetadata
    public final int read(int i, int i2, int i3) {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem() + i2;
        return IndirectPointerNavigationGestureDetector.write.read(this.MediaSessionCompatQueueItem, i, iMediaBrowserCompatMediaItem, i3 + iMediaBrowserCompatMediaItem);
    }

    public final boolean write(ClipboardExtensions_androidKt clipboardExtensions_androidKt, int i, int i2) {
        if (i2 > clipboardExtensions_androidKt.RatingCompat()) {
            FieldType$$ExternalSyntheticBUOutline0.RemoteActionCompatParcelizer(i2, RatingCompat());
            return false;
        }
        int i3 = i + i2;
        if (i3 > clipboardExtensions_androidKt.RatingCompat()) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(clipboardExtensions_androidKt.RatingCompat(), m1$$ExternalSyntheticOutline0.m(i, i2, "Ran off end of other: ", ", ", ", "));
            return false;
        }
        if (!(clipboardExtensions_androidKt instanceof ClipboardExtensions_androidKt)) {
            return clipboardExtensions_androidKt.write(i, i3).equals(write(0, i2));
        }
        byte[] bArr = clipboardExtensions_androidKt.MediaSessionCompatQueueItem;
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        int iMediaBrowserCompatMediaItem2 = MediaBrowserCompatMediaItem();
        int iMediaBrowserCompatMediaItem3 = clipboardExtensions_androidKt.MediaBrowserCompatMediaItem() + i;
        while (iMediaBrowserCompatMediaItem2 < iMediaBrowserCompatMediaItem + i2) {
            if (this.MediaSessionCompatQueueItem[iMediaBrowserCompatMediaItem2] != bArr[iMediaBrowserCompatMediaItem3]) {
                return false;
            }
            iMediaBrowserCompatMediaItem2++;
            iMediaBrowserCompatMediaItem3++;
        }
        return true;
    }
}
