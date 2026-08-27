package o;

/* JADX INFO: loaded from: classes.dex */
public final class UpdatableAnimationState implements onViewAttachedToWindow {
    public long IconCompatParcelizer;
    public TransformGestureDetectorKtdetectTransformGestures2 MediaSessionCompatQueueItem;
    public long RemoteActionCompatParcelizer;
    public boolean read;
    public final requiredSizeInqDBjuR0default serializer;
    public final PopulateViewStructure_androidKtpopulate7 write;

    @Override // o.onViewAttachedToWindow
    public final Object getValue() {
        return this.write.getValue();
    }

    public final Object serializer() {
        return this.serializer.read.invoke(this.MediaSessionCompatQueueItem);
    }

    public UpdatableAnimationState(requiredSizeInqDBjuR0default requiredsizeinqdbjur0default, Object obj, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, long j, long j2, boolean z) {
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2Serializer;
        this.serializer = requiredsizeinqdbjur0default;
        this.write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(obj);
        if (transformGestureDetectorKtdetectTransformGestures2 != null) {
            transformGestureDetectorKtdetectTransformGestures2Serializer = coil3.util.UtilsKt.serializer(transformGestureDetectorKtdetectTransformGestures2);
        } else {
            transformGestureDetectorKtdetectTransformGestures2Serializer = (TransformGestureDetectorKtdetectTransformGestures2) requiredsizeinqdbjur0default.serializer.invoke(obj);
            transformGestureDetectorKtdetectTransformGestures2Serializer.read();
        }
        this.MediaSessionCompatQueueItem = transformGestureDetectorKtdetectTransformGestures2Serializer;
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = j2;
        this.read = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(((onShowTranslationui) this.write).getValue());
        sb.append(", velocity=");
        sb.append(serializer());
        sb.append(", isRunning=");
        sb.append(this.read);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", finishedTimeNanos=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.IconCompatParcelizer, ')');
    }

    public /* synthetic */ UpdatableAnimationState(requiredSizeInqDBjuR0default requiredsizeinqdbjur0default, Object obj, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, int i) {
        this(requiredsizeinqdbjur0default, obj, (i & 4) != 0 ? null : transformGestureDetectorKtdetectTransformGestures2, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
