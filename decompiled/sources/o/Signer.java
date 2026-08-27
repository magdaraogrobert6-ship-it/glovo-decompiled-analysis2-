package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Signer {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void IconCompatParcelizer(androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-726606217);
        if ((i & 6) == 0) {
            int i4 = IconCompatParcelizer + 15;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i6 = read + 105;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            int i8 = read + 105;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(modifier.then(androidx.compose.foundation.layout.SizeKt.read), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onBackPressed(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 28);
        }
    }
}
