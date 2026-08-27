package o;

import android.media.MediaCodec;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class getHasInitialValueAnimations {
    public final int IconCompatParcelizer;
    public final onDrawBehind MediaBrowserCompatMediaItem;
    public final onDrawWithContent MediaDescriptionCompat;
    public final /* synthetic */ androidx.camera.video.internal.encoder.EncoderImpl RatingCompat;
    public final MediaCodec serializer;
    public final ByteBuffer write;
    public final AtomicBoolean MediaSessionCompatQueueItem = new AtomicBoolean(false);
    public long RemoteActionCompatParcelizer = 0;
    public boolean read = false;

    public getHasInitialValueAnimations(androidx.camera.video.internal.encoder.EncoderImpl encoderImpl, MediaCodec mediaCodec, int i) {
        this.RatingCompat = encoderImpl;
        mediaCodec.getClass();
        this.serializer = mediaCodec;
        coil3.util.UtilsKt.read(i);
        this.IconCompatParcelizer = i;
        this.write = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            atomicReference.set(ondrawwithcontent);
            ondrawwithcontent.RemoteActionCompatParcelizer = "Terminate InputBuffer";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        this.MediaBrowserCompatMediaItem = ondrawbehind;
        onDrawWithContent ondrawwithcontent2 = (onDrawWithContent) atomicReference.get();
        ondrawwithcontent2.getClass();
        this.MediaDescriptionCompat = ondrawwithcontent2;
    }
}
