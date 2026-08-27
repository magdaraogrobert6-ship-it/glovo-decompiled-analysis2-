package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class AudioEncoderIgnoresInputTimestampQuirk implements Comparator {
    public final boolean read;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        android.util.Size size = (android.util.Size) obj;
        android.util.Size size2 = (android.util.Size) obj2;
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.read ? iSignum * (-1) : iSignum;
    }

    public AudioEncoderIgnoresInputTimestampQuirk(boolean z) {
        this.read = z;
    }
}
