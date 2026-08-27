package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d9 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static final void read(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 101;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-191294086);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(str)) {
                i4 = 4;
            } else {
                int i8 = read + 113;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i10 = RemoteActionCompatParcelizer + 37;
                read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i10 % 2 == 0 ? 76 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if (getpostalcode2.write(i11 & 1, (i11 & 19) != 18)) {
            int i12 = read + 63;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            getpostalcode = getpostalcode2;
            androidx.compose.material3.TextKt.m131TextNvy7gAk(str, modifier, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).generateLayoutParams(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, i11 & 126, 0, 131064);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 16);
        }
    }
}
