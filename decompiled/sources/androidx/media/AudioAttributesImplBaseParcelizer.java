package androidx.media;

import o.ceilslo4al4;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(ceilslo4al4 ceilslo4al4Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.RemoteActionCompatParcelizer = 0;
        audioAttributesImplBase.write = 0;
        audioAttributesImplBase.serializer = 0;
        audioAttributesImplBase.read = -1;
        audioAttributesImplBase.RemoteActionCompatParcelizer = ceilslo4al4Var.serializer(0, 1);
        audioAttributesImplBase.write = ceilslo4al4Var.serializer(audioAttributesImplBase.write, 2);
        audioAttributesImplBase.serializer = ceilslo4al4Var.serializer(audioAttributesImplBase.serializer, 3);
        audioAttributesImplBase.read = ceilslo4al4Var.serializer(audioAttributesImplBase.read, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, ceilslo4al4 ceilslo4al4Var) {
        ceilslo4al4Var.getClass();
        ceilslo4al4Var.write(audioAttributesImplBase.RemoteActionCompatParcelizer, 1);
        ceilslo4al4Var.write(audioAttributesImplBase.write, 2);
        ceilslo4al4Var.write(audioAttributesImplBase.serializer, 3);
        ceilslo4al4Var.write(audioAttributesImplBase.read, 4);
    }
}
