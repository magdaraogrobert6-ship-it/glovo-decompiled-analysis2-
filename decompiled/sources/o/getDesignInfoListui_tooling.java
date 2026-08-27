package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.state.pudo.TypographyToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getDesignInfoListui_tooling {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[PHI: r1
  0x005d: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[PHI: r1
  0x0037: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(TypographyToken typographyToken, String str, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        androidx.compose.ui.text.TextStyle textStyleMediaSessionCompatQueueItem;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 49;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = true;
        if (i7 % 2 == 0) {
            typographyToken.getClass();
            str.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(2042735398);
            if ((i & 83) == 0) {
                i2 = read + 39;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    getpostalcode.read(typographyToken.ordinal());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!getpostalcode.read(typographyToken.ordinal())) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            typographyToken.getClass();
            str.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(2042735398);
            if ((i & 6) == 0) {
                i2 = read + 39;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    getpostalcode.read(typographyToken.ordinal());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!getpostalcode.read(typographyToken.ordinal())) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str)) {
                int i8 = read + 105;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i & 384) == 0) {
            i4 |= getpostalcode.read(modifier) ^ true ? androidx.compose.ui.graphics.Fields.SpotShadowColor : androidx.compose.ui.graphics.Fields.RotationX;
        }
        if ((i4 & 147) != 146) {
            int i10 = read + 69;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            switch (getClockui_tooling.write[typographyToken.ordinal()]) {
                case 1:
                    textStyleMediaSessionCompatQueueItem = performLayout.MediaSessionCompatQueueItem();
                    int i12 = read + 25;
                    IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    break;
                case 2:
                    textStyleMediaSessionCompatQueueItem = performLayout.MediaSessionCompatResultReceiverWrapper();
                    break;
                case 3:
                    textStyleMediaSessionCompatQueueItem = performLayout.MediaSessionCompatToken();
                    break;
                case 4:
                    textStyleMediaSessionCompatQueueItem = (androidx.compose.ui.text.TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    break;
                case 5:
                    textStyleMediaSessionCompatQueueItem = (androidx.compose.ui.text.TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    break;
                case 6:
                    textStyleMediaSessionCompatQueueItem = performLayout.serializer();
                    break;
                case 7:
                    textStyleMediaSessionCompatQueueItem = performLayout.IconCompatParcelizer();
                    break;
                case 8:
                case 9:
                    textStyleMediaSessionCompatQueueItem = performLayout.write();
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
            }
            androidx.compose.material3.TextKt.m131TextNvy7gAk(str, modifier, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatQueueItem, getpostalcode, (i4 >> 3) & 126, 0, 131064);
            int i14 = IconCompatParcelizer + 73;
            read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new FontScaleConverter(typographyToken, str, modifier, i, 1);
        }
    }
}
