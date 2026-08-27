package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dd {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 21;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1563242389);
        if ((i & 6) == 0) {
            int i8 = read + 119;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                if (getpostalcode2.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            } else {
                int i9 = 60 / 0;
                if (getpostalcode2.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i10 = read + 37;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i10 % 2 != 0 ? 95 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if (getpostalcode2.write(i11 & 1, (i11 & 19) != 18)) {
            getpostalcode = getpostalcode2;
            androidx.compose.material3.TextKt.m131TextNvy7gAk(str, modifier, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, i11 & 126, 0, 131064);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 0);
        }
    }

    public static final void RemoteActionCompatParcelizer(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        annotatedString.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-2061897491);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 101;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode2.read(annotatedString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i7 = IconCompatParcelizer + 57;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i7 % 2 == 0 ? 123 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if (getpostalcode2.write(i8 & 1, (i8 & 19) != 18)) {
            int i9 = IconCompatParcelizer + 119;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            getpostalcode = getpostalcode2;
            androidx.compose.material3.TextKt.m132TextZ58ophY(annotatedString, modifier, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).WindowCallbackWrapper(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, performLayout.IconCompatParcelizer(), getpostalcode, i8 & 126, 0, 262136);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(annotatedString, modifier, i);
        }
    }
}
