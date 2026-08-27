package o;

/* JADX INFO: loaded from: classes.dex */
public interface onPan {
    requiredSizeInqDBjuR0default IconCompatParcelizer();

    default boolean IconCompatParcelizer(long j) {
        return j >= serializer();
    }

    Object RemoteActionCompatParcelizer(long j);

    boolean RemoteActionCompatParcelizer();

    Object read();

    long serializer();

    TransformGestureDetectorKtdetectTransformGestures2 write(long j);
}
