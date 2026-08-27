package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AnimateXAsStateClock {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0100  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void IconCompatParcelizer(String str, androidx.compose.ui.Modifier modifier, boolean z, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        boolean z2;
        getPostalCode getpostalcode;
        androidx.compose.ui.Modifier modifier3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i6;
        androidx.compose.ui.Modifier modifier4;
        long onMenuItemClickListener;
        long j;
        int i7;
        int i8 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1766030465);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                if (getpostalcode2.read(modifier2)) {
                    int i10 = read + 15;
                    RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if ((i & 384) == 0) {
                if (getpostalcode2.write(z)) {
                    i7 = androidx.compose.ui.graphics.Fields.RotationX;
                } else {
                    i7 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
                i3 |= i7;
            }
            i5 = i3;
            if ((i5 & 147) != 146) {
                int i12 = RemoteActionCompatParcelizer + 77;
                read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode2.write(i5 & 1, z2)) {
                i6 = read + 11;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i14 = 76 / 0;
                    if (i9 != 0) {
                        modifier4 = androidx.compose.ui.Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                } else if (i9 != 0) {
                    modifier4 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (z) {
                    getpostalcode2.serializer(643203307);
                    onMenuItemClickListener = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                } else {
                    getpostalcode2.serializer(643204042);
                    onMenuItemClickListener = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener();
                }
                j = onMenuItemClickListener;
                getpostalcode2.IconCompatParcelizer(false);
                if (str == null) {
                    getpostalcode2.serializer(-1535482626);
                    getpostalcode2.IconCompatParcelizer(false);
                    getpostalcode = getpostalcode2;
                } else {
                    getpostalcode2.serializer(-1535482625);
                    androidx.compose.material3.TextKt.m131TextNvy7gAk(str, modifier4, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, i5 & 112, 0, 131064);
                    getpostalcode = getpostalcode2;
                    getpostalcode.IconCompatParcelizer(false);
                }
                modifier3 = modifier4;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new baseUrlChoices(str, modifier3, z, i, i2, 1);
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            if (getpostalcode2.write(z)) {
                i7 = androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i7 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i3 |= i7;
        }
        i5 = i3;
        if ((i5 & 147) != 146) {
            int i15 = RemoteActionCompatParcelizer + 77;
            read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode2.write(i5 & 1, z2)) {
            i6 = read + 11;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i17 = 76 / 0;
                if (i9 != 0) {
                    modifier4 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
            } else if (i9 != 0) {
                modifier4 = androidx.compose.ui.Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (z) {
                getpostalcode2.serializer(643203307);
                onMenuItemClickListener = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
            } else {
                getpostalcode2.serializer(643204042);
                onMenuItemClickListener = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener();
            }
            j = onMenuItemClickListener;
            getpostalcode2.IconCompatParcelizer(false);
            if (str == null) {
                getpostalcode2.serializer(-1535482626);
                getpostalcode2.IconCompatParcelizer(false);
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(-1535482625);
                androidx.compose.material3.TextKt.m131TextNvy7gAk(str, modifier4, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, i5 & 112, 0, 131064);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier3 = modifier4;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new baseUrlChoices(str, modifier3, z, i, i2, 1);
        }
    }
}
