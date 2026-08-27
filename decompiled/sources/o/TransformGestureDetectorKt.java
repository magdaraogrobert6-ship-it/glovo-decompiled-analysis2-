package o;

/* JADX INFO: loaded from: classes.dex */
public final class TransformGestureDetectorKt {
    public final PopulateViewStructure_androidKtpopulate7 MediaBrowserCompatMediaItem;
    public final Object MediaMetadataCompat;
    public TransformGestureDetectorKtdetectTransformGestures2 MediaSessionCompatQueueItem;
    public final requiredSizeInqDBjuR0default RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public long read;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public long IconCompatParcelizer = Long.MIN_VALUE;
    public final PopulateViewStructure_androidKtpopulate7 write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.TRUE);

    public final long IconCompatParcelizer() {
        return this.read;
    }

    public final void IconCompatParcelizer(long j) {
        this.read = j;
    }

    public final TransformGestureDetectorKtdetectTransformGestures2 MediaDescriptionCompat() {
        return this.MediaSessionCompatQueueItem;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.IconCompatParcelizer = j;
    }

    public final void read(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2) {
        this.MediaSessionCompatQueueItem = transformGestureDetectorKtdetectTransformGestures2;
    }

    public final long serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return ((Boolean) this.write.getValue()).booleanValue();
    }

    public final Object MediaMetadataCompat() {
        return this.RatingCompat.read.invoke(this.MediaSessionCompatQueueItem);
    }

    public final void MediaSessionCompatQueueItem() {
        ((onShowTranslationui) this.write).setValue(Boolean.FALSE);
    }

    public final Object read() {
        return this.MediaBrowserCompatMediaItem.getValue();
    }

    public final void write(Object obj) {
        ((onShowTranslationui) this.MediaBrowserCompatMediaItem).setValue(obj);
    }

    public TransformGestureDetectorKt(Object obj, requiredSizeInqDBjuR0default requiredsizeinqdbjur0default, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, long j, Object obj2, long j2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.RatingCompat = requiredsizeinqdbjur0default;
        this.MediaMetadataCompat = obj2;
        this.RemoteActionCompatParcelizer = j2;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaBrowserCompatMediaItem = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(obj);
        this.MediaSessionCompatQueueItem = coil3.util.UtilsKt.serializer(transformGestureDetectorKtdetectTransformGestures2);
        this.read = j;
    }

    public final void write() {
        MediaSessionCompatQueueItem();
        this.serializer.invoke();
    }
}
