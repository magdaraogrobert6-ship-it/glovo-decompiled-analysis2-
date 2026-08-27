package com.roadrunner.push.presentation;

import android.R;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.res.StringResources_androidKt;
import com.roadrunner.push.event.PushDeepLink;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import o.AndroidContentCaptureManager;
import o.generatePOSTBodyString;
import o.getActivityResultRegistry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getDefaultViewModelCreationExtras;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.lambdaisEnabled11;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NotificationDialogKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static final void RemoteActionCompatParcelizer(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1818896922);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
            int i4 = read + 65;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = read + 15;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            getDefaultViewModelCreationExtras.IconCompatParcelizer(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, i2 & 126);
        } else if (getpostalcode.MediaSessionCompatToken()) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i7 = read + 11;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            getDefaultViewModelCreationExtras.IconCompatParcelizer(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, i2 & 126);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getActivityResultRegistry(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x0137  */
    public static final void RemoteActionCompatParcelizer(MessageDialogData messageDialogData, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, lambdaisEnabled11 lambdaisenabled11, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        String str;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-521227360);
        if ((i & 6) == 0) {
            int i6 = read + 57;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 36 / 0;
                if (getpostalcode2.IconCompatParcelizer(messageDialogData)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            } else if (getpostalcode2.IconCompatParcelizer(messageDialogData)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = IconCompatParcelizer + 79;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = IconCompatParcelizer + 93;
                read = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 == 0 ? 55 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= !(((i & Fields.RotationY) == 0 ? getpostalcode2.read(lambdaisenabled11) : getpostalcode2.IconCompatParcelizer(lambdaisenabled11)) ^ true) ? 256 : Fields.SpotShadowColor;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 147) != 146)) {
            String str2 = messageDialogData.MediaMetadataCompat;
            String str3 = messageDialogData.read;
            PushDeepLink pushDeepLink = messageDialogData.RemoteActionCompatParcelizer;
            if (pushDeepLink != null) {
                int i11 = read + 1;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                str = pushDeepLink.read;
            } else {
                str = null;
            }
            generatePOSTBodyString generatepostbodystring = new generatePOSTBodyString(str2, messageDialogData.serializer, str3, str, StringResources_androidKt.stringResource(R.string.ok, getpostalcode2, 6), null, 48, null);
            int i13 = i2 & 112;
            boolean z3 = i13 == 32;
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(messageDialogData);
            int i14 = i2 & 896;
            if (i14 != 256) {
                int i15 = IconCompatParcelizer + 125;
                read = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0 ? (i2 & Fields.RotationY) != 0 : (i2 & 19557) != 0) {
                    z = getpostalcode2.IconCompatParcelizer(lambdaisenabled11);
                }
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z | z3 | zIconCompatParcelizer) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new NotificationDialogKt$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, messageDialogData, lambdaisenabled11);
                getpostalcode2.write(objComponentActivity);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            boolean z4 = i13 == 32;
            if (i14 != 256) {
                int i16 = IconCompatParcelizer + 11;
                int i17 = i16 % Fields.SpotShadowColor;
                read = i17;
                if (i16 % 2 != 0 ? (i2 & Fields.RotationY) != 0 : (i2 & 5183) != 0) {
                    int i18 = i17 + 51;
                    IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    if (getpostalcode2.IconCompatParcelizer(lambdaisenabled11)) {
                        int i20 = read + 23;
                        IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                        int i21 = i20 % 2;
                        z2 = true;
                    }
                }
                z2 = false;
            } else {
                int i22 = read + 23;
                IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                z2 = true;
            }
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(messageDialogData);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if ((zIconCompatParcelizer2 | z4 | z2) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new NotificationDialogKt$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, lambdaisenabled11, messageDialogData);
                getpostalcode2.write(objComponentActivity2);
            }
            getpostalcode = getpostalcode2;
            MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, null, null, getpostalcode2, i13, 412);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 3, messageDialogData, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, lambdaisenabled11);
        }
    }
}
