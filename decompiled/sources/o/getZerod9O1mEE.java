package o;

import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getZerod9O1mEE {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    public static final void serializer(packWithCheck packwithcheck, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        androidx.compose.ui.Modifier modifier2;
        boolean z2;
        int i3 = 2 % 2;
        packwithcheck.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1386480667);
        if ((i & 6) == 0) {
            int i4 = IconCompatParcelizer + 47;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = (getpostalcode.read(packwithcheck) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i6 = IconCompatParcelizer + 115;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            modifier2 = androidx.compose.ui.Modifier.Companion;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = coil3.ExtrasKt.write(packwithcheck.MediaDescriptionCompat, getpostalcode, 0);
            TextRange textRange = (TextRange) populateViewStructure_androidKtpopulate7Write.getValue();
            TextRange textRange2 = (TextRange) populateViewStructure_androidKtpopulate7Write.getValue();
            Float fValueOf = textRange2 != null ? Float.valueOf(textRange2.IconCompatParcelizer) : null;
            if (textRange != null) {
                z2 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), -531493232, 531493233, getCieXyz.write(), getCieXyz.write(), new Object[]{fValueOf, Float.valueOf(0.0f)}, getCieXyz.write())).booleanValue() ? false : true;
            }
            androidx.compose.animation.AnimatedVisibilityKt.RemoteActionCompatParcelizer(z2, null, null, onKeyEventZmokQxo.write((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{0, 550, null, 5}), 2), null, coil3.ExtrasKt.write(2095989949, new PagerDefaults$$ExternalSyntheticLambda0(fValueOf, 6, textRange), getpostalcode), getpostalcode, 199680, 22);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(packwithcheck, modifier2, i, 14);
        }
    }
}
