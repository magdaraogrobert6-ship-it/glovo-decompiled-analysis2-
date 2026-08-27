package o;

import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public final class getScaleType {
    public final Rational IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;

    public final android.util.Size serializer(getImageFormatdefault getimageformatdefault) {
        int iWrite = getimageformatdefault.write(0);
        android.util.Size size = (android.util.Size) getimageformatdefault.read(getImageFormatdefault.k_, null);
        if (size != null) {
            int iWrite2 = copyWithMergingEnabledui.write(copyWithMergingEnabledui.serializer(iWrite), this.read, 1 == this.serializer);
            if (iWrite2 == 90 || iWrite2 == 270) {
                return new android.util.Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    public getScaleType(FocusMeteringAction focusMeteringAction, Rational rational) {
        this.read = focusMeteringAction.MediaDescriptionCompat();
        this.serializer = focusMeteringAction.MediaBrowserCompatMediaItem();
        this.IconCompatParcelizer = rational;
        this.RemoteActionCompatParcelizer = rational == null || rational.getNumerator() >= rational.getDenominator();
    }
}
