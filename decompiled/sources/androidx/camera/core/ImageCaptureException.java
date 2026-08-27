package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureException extends Exception {
    public final int serializer;

    public ImageCaptureException(int i, String str, Throwable th) {
        super(str, th);
        this.serializer = i;
    }
}
