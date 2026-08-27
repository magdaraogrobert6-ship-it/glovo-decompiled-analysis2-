package o;

import android.media.ImageWriter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getThumbTintMode implements ImageWriter.OnImageReleasedListener {
    public final /* synthetic */ getInflatedId read;

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) throws Exception {
        this.read.close();
    }
}
