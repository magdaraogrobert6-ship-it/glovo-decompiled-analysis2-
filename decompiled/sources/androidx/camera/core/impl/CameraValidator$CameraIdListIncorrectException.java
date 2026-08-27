package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public class CameraValidator$CameraIdListIncorrectException extends Exception {
    public final int serializer;

    public CameraValidator$CameraIdListIncorrectException(int i, IllegalArgumentException illegalArgumentException) {
        super("Expected camera missing from device.", illegalArgumentException);
        this.serializer = i;
    }
}
