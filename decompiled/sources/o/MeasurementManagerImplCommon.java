package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MeasurementManagerImplCommon {
    private static int read = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public static final void IconCompatParcelizer(androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i3 = 2 % 2;
        int i4 = serializer + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = false;
        if (i4 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1801694464);
            i2 = i | 6;
            if ((i2 & 3) != 2) {
            }
            if (!(!getpostalcode.write(i2 & 1, z))) {
                modifier = androidx.compose.ui.Modifier.Companion;
                DividerKt.read(0.0f, 0, 6, 0L, getpostalcode, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(modifier, 0.0f, Dimensions.getAnimatedVisibility, 0.0f, 0.0f, 13));
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 19);
            }
        }
        getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1801694464);
        i2 = i | 125;
        int i5 = read + 7;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            z = true;
        }
        if (!(!getpostalcode.write(i2 & 1, z))) {
            modifier = androidx.compose.ui.Modifier.Companion;
            DividerKt.read(0.0f, 0, 6, 0L, getpostalcode, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(modifier, 0.0f, Dimensions.getAnimatedVisibility, 0.0f, 0.0f, 13));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 19);
        }
    }
}
