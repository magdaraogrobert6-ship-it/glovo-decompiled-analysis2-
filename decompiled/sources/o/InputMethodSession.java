package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class InputMethodSession {
    public boolean IconCompatParcelizer;
    public final int MediaDescriptionCompat;
    public final onInfiniteOperation MediaMetadataCompat;
    public final InspectableModifier RatingCompat;
    public final int[] RemoteActionCompatParcelizer;
    public final int read;
    public boolean serializer;
    public int write;

    public final void IconCompatParcelizer(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.read)) {
            DrawableTransformation.read(c8$$ExternalSyntheticOutline0.m(i, "Group index out of bounds: "));
            return;
        }
        if (!this.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("perhaps no match attempted");
            return;
        }
        if (i == 0 || this.IconCompatParcelizer) {
            return;
        }
        int[] iArr = this.RemoteActionCompatParcelizer;
        int i3 = iArr[1] + 1;
        int i4 = this.MediaDescriptionCompat;
        if (this.RatingCompat.read.IconCompatParcelizer(this.MediaMetadataCompat, iArr[0], i3 > i4 ? i4 : i3, this.write, iArr, i2 + 1)) {
            this.IconCompatParcelizer = true;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("inconsistency in matching group data");
        }
    }

    public InputMethodSession(InspectableModifier inspectableModifier, String str) {
        this.RatingCompat = inspectableModifier;
        int i = inspectableModifier.read.RemoteActionCompatParcelizer;
        this.read = i;
        this.RemoteActionCompatParcelizer = new int[(i * 2) + 2];
        onInfiniteOperation oninfiniteoperation = new onInfiniteOperation();
        oninfiniteoperation.write = str;
        this.MediaMetadataCompat = oninfiniteoperation;
        this.MediaDescriptionCompat = str.length();
        this.serializer = false;
        this.IconCompatParcelizer = false;
    }

    public final String read(int i) {
        IconCompatParcelizer(i);
        int i2 = i * 2;
        int[] iArr = this.RemoteActionCompatParcelizer;
        int i3 = iArr[i2];
        IconCompatParcelizer(i);
        int i4 = iArr[i2 + 1];
        if (i3 < 0 && i4 < 0) {
            return null;
        }
        accessgetConnectionsp accessgetconnectionsp = accessgetConnectionsp.UTF_16;
        accessgetConnectionsp accessgetconnectionsp2 = accessgetConnectionsp.UTF_8;
        CharSequence charSequence = (CharSequence) this.MediaMetadataCompat.write;
        return accessgetconnectionsp == accessgetconnectionsp2 ? new String(charSequence.toString().getBytes(Charset.forName("UTF-16")), i3, i4 - i3) : charSequence.subSequence(i3, i4).toString();
    }
}
