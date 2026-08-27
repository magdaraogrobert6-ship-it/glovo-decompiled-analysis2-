package o;

import android.media.MediaCodec;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class animate implements AutoCloseable {
    public final AtomicBoolean IconCompatParcelizer = new AtomicBoolean(false);
    public final MediaCodec MediaMetadataCompat;
    public final MediaCodec.BufferInfo RemoteActionCompatParcelizer;
    public final int read;
    public final onDrawBehind serializer;
    public final onDrawWithContent write;

    public animate(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.MediaMetadataCompat = mediaCodec;
        this.read = i;
        mediaCodec.getOutputBuffer(i);
        this.RemoteActionCompatParcelizer = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            atomicReference.set(ondrawwithcontent);
            ondrawwithcontent.RemoteActionCompatParcelizer = "Data closed";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        this.serializer = ondrawbehind;
        onDrawWithContent ondrawwithcontent2 = (onDrawWithContent) atomicReference.get();
        ondrawwithcontent2.getClass();
        this.write = ondrawwithcontent2;
    }

    public final long IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.size;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        onDrawWithContent ondrawwithcontent = this.write;
        if (this.IconCompatParcelizer.getAndSet(true)) {
            return;
        }
        try {
            this.MediaMetadataCompat.releaseOutputBuffer(this.read, false);
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
        } catch (IllegalStateException e) {
            ondrawwithcontent.serializer(e);
        }
    }
}
