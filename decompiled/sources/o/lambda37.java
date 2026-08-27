package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.pcn;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lambda37 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static final void IconCompatParcelizer(lambda310 lambda310Var, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        androidx.compose.ui.text.TextStyle textStyleMediaSessionCompatResultReceiverWrapper;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-880729602);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(lambda310Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = RemoteActionCompatParcelizer + 107;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        int i6 = i2;
        if ((i6 & 19) != 18) {
            int i7 = RemoteActionCompatParcelizer + 73;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i6 & 1, z)) {
            int i9 = lambda35.IconCompatParcelizer[lambda310Var.read.ordinal()];
            if (i9 != 1) {
                int i10 = RemoteActionCompatParcelizer + 125;
                read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (i9 == 2) {
                    textStyleMediaSessionCompatResultReceiverWrapper = (androidx.compose.ui.text.TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                } else if (i9 == 3) {
                    textStyleMediaSessionCompatResultReceiverWrapper = performLayout.serializer();
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
            } else {
                textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
            }
            getpostalcode = getpostalcode2;
            androidx.compose.material3.TextKt.m131TextNvy7gAk(lambda310Var.IconCompatParcelizer, modifier, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode, i6 & 112, 0, 131064);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 15, lambda310Var, modifier);
        }
    }
}
