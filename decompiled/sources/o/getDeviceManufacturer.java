package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getDeviceManufacturer {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static final void read(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-836008631);
        boolean z = false;
        if ((i & 6) != 0) {
            int i5 = IconCompatParcelizer + 3;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i;
        } else {
            int i7 = IconCompatParcelizer + 37;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                if (getpostalcode2.read(str)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            } else {
                int i8 = 16 / 0;
                if (getpostalcode2.read(str)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            i2 = i3 | i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            int i10 = write + 93;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        }
        if (!getpostalcode2.write(i9 & 1, z)) {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i12 = write + 63;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            modifier2 = modifier;
        } else {
            int i14 = write + 65;
            IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            getpostalcode = getpostalcode2;
            androidx.compose.material3.TextKt.m131TextNvy7gAk(str, companion, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaBrowserCompatMediaItem(), getpostalcode, i9 & 126, 0, 131064);
            modifier2 = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 19);
        }
    }

    public static final void write(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, String str) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        androidx.compose.ui.Modifier modifier2;
        int i3 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1864804261);
        if ((i & 6) == 0) {
            int i4 = IconCompatParcelizer + 45;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
            int i6 = IconCompatParcelizer + 61;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if ((i8 & 19) != 18) {
            int i9 = write + 65;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!getpostalcode2.write(i8 & 1, z))) {
            int i11 = IconCompatParcelizer + 75;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            getpostalcode = getpostalcode2;
            androidx.compose.material3.TextKt.m131TextNvy7gAk(str, companion, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setHideOnContentScrollEnabled(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaDescriptionCompat(), getpostalcode, i8 & 126, 0, 131064);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 20);
        }
    }
}
