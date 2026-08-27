package androidx.media;

import android.media.AudioAttributes;
import o.accessgetNegativeZerocp;
import o.ceilslo4al4;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(ceilslo4al4 ceilslo4al4Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.serializer = -1;
        audioAttributesImplApi21.IconCompatParcelizer = (AudioAttributes) ceilslo4al4Var.read(audioAttributesImplApi21.IconCompatParcelizer, 1);
        audioAttributesImplApi21.serializer = ceilslo4al4Var.serializer(audioAttributesImplApi21.serializer, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, ceilslo4al4 ceilslo4al4Var) {
        ceilslo4al4Var.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.IconCompatParcelizer;
        ceilslo4al4Var.serializer(1);
        ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat.writeParcelable(audioAttributes, 0);
        ceilslo4al4Var.write(audioAttributesImplApi21.serializer, 2);
    }
}
