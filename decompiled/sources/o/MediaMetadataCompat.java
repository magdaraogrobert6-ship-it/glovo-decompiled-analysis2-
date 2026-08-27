package o;

import bo.app.b8$$ExternalSyntheticLambda4;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.huawei.hms.framework.common.BundleUtil;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaMetadataCompat {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public static void read() {
        int i = 2 % 2;
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[0];
        new StackTraceElement("_COROUTINE._BOUNDARY", BundleUtil.UNDERLINE_TAG, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        int i2 = serializer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0158  */
    public static final void IconCompatParcelizer(DeliveryAutoAcceptUiModelImpl deliveryAutoAcceptUiModelImpl, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4 = 2 % 2;
        deliveryAutoAcceptUiModelImpl.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1095012140);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(deliveryAutoAcceptUiModelImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i5 = serializer + 83;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 256 : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i7 = RemoteActionCompatParcelizer + 107;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 2048 : androidx.compose.ui.graphics.Fields.RotationZ;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
        }
        int i8 = i2;
        int i9 = 1;
        if ((i8 & 1171) != 1170) {
            int i10 = RemoteActionCompatParcelizer + 113;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i8 & 1, z)) {
            getQueryContext getquerycontext = deliveryAutoAcceptUiModelImpl.ParcelableVolumeInfo;
            boolean z4 = (i8 & 896) == 256;
            boolean z5 = (i8 & 7168) == 2048;
            boolean z6 = (i8 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z4 | z5 | z6) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new SharedPreferencesManager(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i9);
                getpostalcode.write(objComponentActivity);
            }
            androidx.sqlite.SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = coil3.ExtrasKt.write(deliveryAutoAcceptUiModelImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, getpostalcode, 0);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = coil3.ExtrasKt.write(deliveryAutoAcceptUiModelImpl.RatingCompat, getpostalcode, 0);
            SaversKtColorSaver2 saversKtColorSaver2 = (SaversKtColorSaver2) populateViewStructure_androidKtpopulate7Write.getValue();
            invoke4WTKRHQ invoke4wtkrhq = saversKtColorSaver2 != null ? saversKtColorSaver2.read : null;
            if (invoke4wtkrhq == null) {
                getpostalcode.serializer(1230926766);
                getpostalcode.IconCompatParcelizer(false);
                z2 = true;
                z3 = false;
            } else {
                getpostalcode.serializer(1230926767);
                generatePOSTBodyString generatepostbodystring = new generatePOSTBodyString(invoke4wtkrhq.RemoteActionCompatParcelizer, false, invoke4wtkrhq.write, invoke4wtkrhq.IconCompatParcelizer, null, null, 120, null);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new b8$$ExternalSyntheticLambda4(1);
                    getpostalcode.write(objComponentActivity2);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
                boolean z7 = (i8 & 14) == 4;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(invoke4wtkrhq);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!(z7 | zIconCompatParcelizer)) {
                    int i12 = RemoteActionCompatParcelizer + 79;
                    serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        int i13 = 57 / 0;
                        if (objComponentActivity3 == androidContentCaptureManager) {
                            objComponentActivity3 = new ViewUtils$$ExternalSyntheticLambda6(deliveryAutoAcceptUiModelImpl, 11, invoke4wtkrhq);
                            getpostalcode.write(objComponentActivity3);
                        }
                    } else if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new ViewUtils$$ExternalSyntheticLambda6(deliveryAutoAcceptUiModelImpl, 11, invoke4wtkrhq);
                        getpostalcode.write(objComponentActivity3);
                    }
                } else {
                    objComponentActivity3 = new ViewUtils$$ExternalSyntheticLambda6(deliveryAutoAcceptUiModelImpl, 11, invoke4wtkrhq);
                    getpostalcode.write(objComponentActivity3);
                }
                z2 = true;
                MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, null, null, null, getpostalcode, 48, 476);
                z3 = false;
                getpostalcode.IconCompatParcelizer(false);
            }
            Boolean bool = (Boolean) populateViewStructure_androidKtpopulate7Write2.getValue();
            bool.booleanValue();
            boolean z8 = getpostalcode.read(populateViewStructure_androidKtpopulate7Write2);
            int i14 = 14;
            boolean z9 = (i8 & 14) == 4 ? z2 : z3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if ((z8 | z9) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new LocalAuthDataSource.AnonymousClass2(deliveryAutoAcceptUiModelImpl, populateViewStructure_androidKtpopulate7Write2, null, i14);
                getpostalcode.write(objComponentActivity4);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, bool, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i15 = RemoteActionCompatParcelizer + 35;
            serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(i, 6, deliveryAutoAcceptUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
