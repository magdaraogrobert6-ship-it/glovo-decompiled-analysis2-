package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class accessgetClearConfigSentinelcp {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:42:0x013c  */
    /* JADX WARN: Code duplicated, block: B:44:0x014c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0159  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void write(String str, androidx.compose.ui.Modifier modifier, String str2, Integer num, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Integer num2;
        int i4;
        boolean z;
        getPostalCode getpostalcode;
        Integer num3;
        androidx.compose.ui.Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        androidx.compose.ui.Modifier.Companion companion;
        Integer num4;
        int i5;
        int i6 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1722859413);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            int i7 = RemoteActionCompatParcelizer + 19;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i3 = i;
        }
        int i9 = i3 | 48;
        if ((i & 384) == 0) {
            if (getpostalcode2.read(str2)) {
                int i10 = IconCompatParcelizer + 123;
                RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i5 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i9 |= i5;
        }
        int i12 = i2 & 8;
        if (i12 == 0) {
            if ((i & 3072) == 0) {
                num2 = num;
                if (getpostalcode2.read(num2)) {
                    int i13 = IconCompatParcelizer + 47;
                    int i14 = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i14;
                    int i15 = i13 % 2;
                    int i16 = i14 + 113;
                    IconCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    i4 = androidx.compose.ui.graphics.Fields.CameraDistance;
                } else {
                    i4 = androidx.compose.ui.graphics.Fields.RotationZ;
                }
                i9 |= i4;
            }
            if ((i9 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode2.write(i9 & 1, z)) {
                companion = androidx.compose.ui.Modifier.Companion;
                if (i12 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (str2 != null) {
                    getpostalcode2.serializer(845772291);
                    reverse.RemoteActionCompatParcelizer(str2, str, androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(companion, Dimensions.removeOnPictureInPictureUiStateChangedListener), accessgetDelayedInitializationProvidercp.read, androidx.compose.ui.graphics.ColorFilter.Companion.m763tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.Companion, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0, 2, null), getpostalcode2, ((i9 >> 6) & 14) | 24576 | ((i9 << 3) & 112));
                    getpostalcode2.IconCompatParcelizer(false);
                    int i18 = RemoteActionCompatParcelizer + 85;
                    IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    getpostalcode = getpostalcode2;
                } else if (num4 != null) {
                    getpostalcode2.serializer(846143020);
                    int i20 = (i9 >> 9) & 14;
                    int i21 = i9 << 3;
                    getpostalcode = getpostalcode2;
                    getNonZeroRgk1Os.write(num4, str, companion, Okio.RemoteActionCompatParcelizer(num4.intValue(), getpostalcode2, i20), null, null, null, null, androidx.compose.ui.layout.ContentScale.Companion.getNone(), androidx.compose.ui.graphics.ColorFilter.Companion.m763tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.Companion, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0, 2, null), getpostalcode, (i21 & 112) | i20 | (i21 & 896) | (androidx.compose.ui.graphics.painter.Painter.$stable << 9), 6, 27632);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.serializer(846426701);
                    getpostalcode.IconCompatParcelizer(false);
                }
                modifier2 = companion;
                num3 = num4;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                num3 = num2;
                modifier2 = modifier;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(str, modifier2, str2, num3, i, i2, 3);
            }
        }
        i9 |= 3072;
        num2 = num;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i9 & 1, z)) {
            companion = androidx.compose.ui.Modifier.Companion;
            if (i12 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (str2 != null) {
                getpostalcode2.serializer(845772291);
                reverse.RemoteActionCompatParcelizer(str2, str, androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(companion, Dimensions.removeOnPictureInPictureUiStateChangedListener), accessgetDelayedInitializationProvidercp.read, androidx.compose.ui.graphics.ColorFilter.Companion.m763tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.Companion, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0, 2, null), getpostalcode2, ((i9 >> 6) & 14) | 24576 | ((i9 << 3) & 112));
                getpostalcode2.IconCompatParcelizer(false);
                int i110 = RemoteActionCompatParcelizer + 85;
                IconCompatParcelizer = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i111 = i110 % 2;
                getpostalcode = getpostalcode2;
            } else if (num4 != null) {
                getpostalcode2.serializer(846143020);
                int i22 = (i9 >> 9) & 14;
                int i23 = i9 << 3;
                getpostalcode = getpostalcode2;
                getNonZeroRgk1Os.write(num4, str, companion, Okio.RemoteActionCompatParcelizer(num4.intValue(), getpostalcode2, i22), null, null, null, null, androidx.compose.ui.layout.ContentScale.Companion.getNone(), androidx.compose.ui.graphics.ColorFilter.Companion.m763tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.Companion, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0, 2, null), getpostalcode, (i23 & 112) | i22 | (i23 & 896) | (androidx.compose.ui.graphics.painter.Painter.$stable << 9), 6, 27632);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(846426701);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
            num3 = num4;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            num3 = num2;
            modifier2 = modifier;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(str, modifier2, str2, num3, i, i2, 3);
        }
    }
}
