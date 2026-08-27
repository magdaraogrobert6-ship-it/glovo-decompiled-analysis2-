package o;

import com.roadrunner.location.util.HmsTasksKt;

/* JADX INFO: loaded from: classes.dex */
public final class PaddingKt implements onPan {
    public TransformGestureDetectorKtdetectTransformGestures2 IconCompatParcelizer;
    public final requiredSizeInqDBjuR0default MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public TransformGestureDetectorKtdetectTransformGestures2 MediaSessionCompatQueueItem;
    public Object RatingCompat;
    public TransformGestureDetectorKtdetectTransformGestures2 RemoteActionCompatParcelizer;
    public final TransformGestureDetectorKtdetectTransformGestures2 read;
    public final size3ABfNKs serializer;
    public long write;

    @Override // o.onPan
    public final requiredSizeInqDBjuR0default IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.onPan
    public final Object read() {
        return this.MediaMetadataCompat;
    }

    @Override // o.onPan
    public final boolean RemoteActionCompatParcelizer() {
        return this.serializer.l_();
    }

    public final void read(Object obj) {
        Object[] objArr = {obj, this.RatingCompat};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.RatingCompat = obj;
        this.RemoteActionCompatParcelizer = (TransformGestureDetectorKtdetectTransformGestures2) this.MediaDescriptionCompat.serializer.invoke(obj);
        this.IconCompatParcelizer = null;
        this.write = -1L;
    }

    public final void serializer(Object obj) {
        Object[] objArr = {this.MediaMetadataCompat, obj};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.MediaMetadataCompat = obj;
        this.MediaSessionCompatQueueItem = (TransformGestureDetectorKtdetectTransformGestures2) this.MediaDescriptionCompat.serializer.invoke(obj);
        this.IconCompatParcelizer = null;
        this.write = -1L;
    }

    public PaddingKt(TrackpadScrollingLogic trackpadScrollingLogic, requiredSizeInqDBjuR0default requiredsizeinqdbjur0default, Object obj, Object obj2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2) {
        this.serializer = trackpadScrollingLogic.serializer(requiredsizeinqdbjur0default);
        this.MediaDescriptionCompat = requiredsizeinqdbjur0default;
        this.MediaMetadataCompat = obj2;
        this.RatingCompat = obj;
        this.RemoteActionCompatParcelizer = (TransformGestureDetectorKtdetectTransformGestures2) requiredsizeinqdbjur0default.serializer.invoke(obj);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = requiredsizeinqdbjur0default.serializer;
        this.MediaSessionCompatQueueItem = (TransformGestureDetectorKtdetectTransformGestures2) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj2);
        this.read = transformGestureDetectorKtdetectTransformGestures2 != null ? coil3.util.UtilsKt.serializer(transformGestureDetectorKtdetectTransformGestures2) : ((TransformGestureDetectorKtdetectTransformGestures2) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj)).RemoteActionCompatParcelizer();
        this.write = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.RatingCompat + " -> " + this.MediaMetadataCompat + ",initial velocity: " + this.read + ", duration: " + HmsTasksKt.serializer(this) + " ms,animationSpec: " + this.serializer;
    }

    @Override // o.onPan
    public final Object RemoteActionCompatParcelizer(long j) {
        if (IconCompatParcelizer(j)) {
            return this.MediaMetadataCompat;
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2Serializer = this.serializer.serializer(j, this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, this.read);
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2Serializer.IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            if (Float.isNaN(transformGestureDetectorKtdetectTransformGestures2Serializer.write(i))) {
                Box.RemoteActionCompatParcelizer("AnimationVector cannot contain a NaN. " + transformGestureDetectorKtdetectTransformGestures2Serializer + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.MediaDescriptionCompat.read.invoke(transformGestureDetectorKtdetectTransformGestures2Serializer);
    }

    @Override // o.onPan
    public final TransformGestureDetectorKtdetectTransformGestures2 write(long j) {
        if (!IconCompatParcelizer(j)) {
            return this.serializer.read(j, this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, this.read);
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2 = this.IconCompatParcelizer;
        if (transformGestureDetectorKtdetectTransformGestures2 != null) {
            return transformGestureDetectorKtdetectTransformGestures2;
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2Write = this.serializer.write(this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, this.read);
        this.IconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2Write;
        return transformGestureDetectorKtdetectTransformGestures2Write;
    }

    @Override // o.onPan
    public final long serializer() {
        if (this.write < 0) {
            this.write = this.serializer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, this.read);
        }
        return this.write;
    }
}
