package o;

/* JADX INFO: loaded from: classes.dex */
public interface SizeNode extends widthInVpY3zN4default {
    int IconCompatParcelizer();

    int serializer();

    @Override // o.size3ABfNKs
    default long RemoteActionCompatParcelizer(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return ((long) (serializer() + IconCompatParcelizer())) * 1000000;
    }
}
