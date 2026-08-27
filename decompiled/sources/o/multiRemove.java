package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.legacy.chatlist.presentation.compose.CustomerChatsScreenKt$CustomerChatsScreen$1$1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class multiRemove {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    public static final void IconCompatParcelizer(accessmultiRemove accessmultiremove, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        androidx.compose.ui.Modifier modifier2;
        int i3;
        List list;
        List list2;
        boolean z;
        String strStringResource;
        int i4 = 2 % 2;
        accessmultiremove.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-149233348);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(accessmultiremove) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        int i5 = i2 | 24576;
        if (getpostalcode2.write(i5 & 1, (i5 & 9363) != 9362)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new androidx.compose.material3.SnackbarHostState();
                getpostalcode2.write(objComponentActivity);
            }
            androidx.compose.material3.SnackbarHostState snackbarHostState = (androidx.compose.material3.SnackbarHostState) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(null);
                getpostalcode2.write(objComponentActivity2);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(instance_delegatelambda0.write);
                getpostalcode2.write(objComponentActivity3);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            boolean z2 = accessmultiremove instanceof multiPut;
            if (z2) {
                populateViewStructure_androidKtpopulate8.setValue(((multiPut) accessmultiremove).read);
            }
            boolean z3 = accessmultiremove instanceof fireWY9HvpM;
            if (z3) {
                getpostalcode2.serializer(-518853460);
                Throwable th = ((fireWY9HvpM) accessmultiremove).write;
                String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    int i6 = RemoteActionCompatParcelizer + 35;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    localizedMessage = th.getMessage();
                }
                if (localizedMessage == null) {
                    getpostalcode2.serializer(-1679301902);
                    z = false;
                    strStringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.all_error_message, getpostalcode2, 0);
                } else {
                    z = false;
                    getpostalcode2.serializer(-1679304475);
                    strStringResource = localizedMessage;
                }
                getpostalcode2.IconCompatParcelizer(z);
                boolean z4 = getpostalcode2.read(strStringResource);
                Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (z4) {
                    objComponentActivity4 = new CustomerChatsScreenKt$CustomerChatsScreen$1$1(populateViewStructure_androidKtpopulate7, strStringResource, snackbarHostState, null, 0);
                    getpostalcode2.write(objComponentActivity4);
                } else {
                    int i8 = RemoteActionCompatParcelizer + 7;
                    serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new CustomerChatsScreenKt$CustomerChatsScreen$1$1(populateViewStructure_androidKtpopulate7, strStringResource, snackbarHostState, null, 0);
                        getpostalcode2.write(objComponentActivity4);
                    }
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, th, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(-518520954);
                getpostalcode2.IconCompatParcelizer(false);
            }
            boolean z5 = accessmultiremove instanceof multiForEach;
            if (z2) {
                int i10 = RemoteActionCompatParcelizer + 89;
                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                list2 = ((multiPut) accessmultiremove).read;
            } else {
                if (z5) {
                    list2 = (List) populateViewStructure_androidKtpopulate8.getValue();
                } else {
                    i3 = 1;
                    if (!z3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    list = (List) populateViewStructure_androidKtpopulate8.getValue();
                }
                getpostalcode = getpostalcode2;
                androidx.compose.material3.ScaffoldKt.serializer(companion.then(androidx.compose.foundation.layout.SizeKt.read), coil3.ExtrasKt.write(-930080256, new trigger(i3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode2), null, coil3.ExtrasKt.write(1397082114, new te(snackbarHostState, populateViewStructure_androidKtpopulate7, 2), getpostalcode2), null, 0, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), 0L, null, coil3.ExtrasKt.write(-749986869, new p9(z5, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, list, r8lambdaunavo3sxub_pc9xroryotnrlvsm, accessmultiremove), getpostalcode2), getpostalcode, 805309488, 436);
                modifier2 = companion;
            }
            list = list2;
            i3 = 1;
            getpostalcode = getpostalcode2;
            androidx.compose.material3.ScaffoldKt.serializer(companion.then(androidx.compose.foundation.layout.SizeKt.read), coil3.ExtrasKt.write(-930080256, new trigger(i3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode2), null, coil3.ExtrasKt.write(1397082114, new te(snackbarHostState, populateViewStructure_androidKtpopulate7, 2), getpostalcode2), null, 0, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), 0L, null, coil3.ExtrasKt.write(-749986869, new p9(z5, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, list, r8lambdaunavo3sxub_pc9xroryotnrlvsm, accessmultiremove), getpostalcode2), getpostalcode, 805309488, 436);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) accessmultiremove, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 6);
        }
    }
}
