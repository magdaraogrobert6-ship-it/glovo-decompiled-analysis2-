package o;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getcachedSerializer extends InputStream {
    public final InputStream MediaDescriptionCompat;
    public final int RatingCompat;

    public final void serializer() {
        InputStream inputStream = this.MediaDescriptionCompat;
        if (inputStream instanceof PhoneCallTypeMasked) {
            PhoneCallTypeMasked phoneCallTypeMasked = (PhoneCallTypeMasked) inputStream;
            phoneCallTypeMasked.read = true;
            phoneCallTypeMasked.write();
        }
    }

    public getcachedSerializer(int i, InputStream inputStream) {
        this.MediaDescriptionCompat = inputStream;
        this.RatingCompat = i;
    }
}
