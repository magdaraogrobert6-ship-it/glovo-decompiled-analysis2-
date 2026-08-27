package androidx.media;

import o.accessgetPositiveZerocp;
import o.ceilslo4al4;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(ceilslo4al4 ceilslo4al4Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        accessgetPositiveZerocp accessgetpositivezerocpSerializer = audioAttributesCompat.IconCompatParcelizer;
        if (ceilslo4al4Var.IconCompatParcelizer(1)) {
            accessgetpositivezerocpSerializer = ceilslo4al4Var.serializer();
        }
        audioAttributesCompat.IconCompatParcelizer = (AudioAttributesImpl) accessgetpositivezerocpSerializer;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, ceilslo4al4 ceilslo4al4Var) {
        ceilslo4al4Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.IconCompatParcelizer;
        ceilslo4al4Var.serializer(1);
        ceilslo4al4Var.write(audioAttributesImpl);
    }
}
