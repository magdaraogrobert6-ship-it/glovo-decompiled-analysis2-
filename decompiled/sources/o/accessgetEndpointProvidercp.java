package o;

import com.roadrunner.sidemenu.presentation.SideMenuViewModel;
import com.roadrunner.sidemenu.presentation.components.SideMenuContentKt;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class accessgetEndpointProvidercp {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e A[PHI: r3
  0x004e: PHI (r3v35 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v37 o.getPostalCode) binds: [B:8:0x0040, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:9:0x0042 A[PHI: r3
  0x0042: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v37 o.getPostalCode) binds: [B:8:0x0040, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RemoteActionCompatParcelizer(SideMenuViewModel sideMenuViewModel, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, N$b n$b, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        boolean z;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 55;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            sideMenuViewModel.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            n$b.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1077144048);
            if ((i & 25) == 0) {
                if (getpostalcode.IconCompatParcelizer(sideMenuViewModel)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            sideMenuViewModel.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            n$b.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1077144048);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(sideMenuViewModel)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i7 = read + 93;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i7 % 2 != 0 ? 9 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            int i8 = IconCompatParcelizer + 55;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(n$b);
                throw null;
            }
            i3 |= getpostalcode2.IconCompatParcelizer(n$b) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i9 = i3 | 3072;
        boolean z2 = false;
        if ((i9 & 1171) != 1170) {
            int i10 = IconCompatParcelizer + 71;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!getpostalcode2.write(i9 & 1, z))) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            androidx.sqlite.SQLite.write(sideMenuViewModel.MediaDescriptionCompat, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode2, (i9 & 112) | 8);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = coil3.ExtrasKt.write(sideMenuViewModel.ParcelableVolumeInfo, getpostalcode2, 0);
            SideMenuContentKt.SideMenuContent((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) coil3.ExtrasKt.write(sideMenuViewModel.MediaSessionCompatToken, getpostalcode2, 0).getValue(), sideMenuViewModel.MediaBrowserCompatMediaItem, n$b, companion, getpostalcode2, i9 & 8064);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode2.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            if (!((r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4) populateViewStructure_androidKtpopulate7Write.getValue()).read.isEmpty() && (!((r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4) populateViewStructure_androidKtpopulate7Write.getValue()).write)) {
                int i12 = read + 11;
                IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z2 = true;
            }
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(sideMenuViewModel);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            int i14 = 19;
            if (zIconCompatParcelizer) {
                objComponentActivity2 = new TncContentKt$$ExternalSyntheticLambda1(sideMenuViewModel, i14, populateViewStructure_androidKtpopulate7);
                getpostalcode2.write(objComponentActivity2);
                int i15 = read + 105;
                IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
            } else {
                int i17 = read + 19;
                IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i18 = i17 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new TncContentKt$$ExternalSyntheticLambda1(sideMenuViewModel, i14, populateViewStructure_androidKtpopulate7);
                    getpostalcode2.write(objComponentActivity2);
                    int i19 = read + 105;
                    IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                }
            }
            getPhoneNumberNational.serializer(Boolean.valueOf(z2), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode2);
            modifier2 = companion;
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdatwlPMTrSrus3A7UmaCID8_1F1M(sideMenuViewModel, r8lambdaunavo3sxub_pc9xroryotnrlvsm, n$b, modifier2, i, 2);
        }
    }
}
