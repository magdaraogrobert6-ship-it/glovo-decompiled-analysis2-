package androidx.media;

import android.util.SparseIntArray;
import o.accessgetPositiveZerocp;

/* JADX INFO: loaded from: classes4.dex */
public class AudioAttributesCompat implements accessgetPositiveZerocp {
    public static final /* synthetic */ int serializer = 0;
    public AudioAttributesImpl IconCompatParcelizer;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        return this.IconCompatParcelizer.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.IconCompatParcelizer;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).IconCompatParcelizer;
        if (audioAttributesImpl == null) {
            return audioAttributesImpl2 == null;
        }
        return audioAttributesImpl.equals(audioAttributesImpl2);
    }
}
