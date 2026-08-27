package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi
class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes IconCompatParcelizer;
    public int serializer;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.IconCompatParcelizer.equals(((AudioAttributesImplApi21) obj).IconCompatParcelizer);
        }
        return false;
    }
}
