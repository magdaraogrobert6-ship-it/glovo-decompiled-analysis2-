package o;

import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetBookmarkcp {
    public static final void read(List list, AndroidColorSpace_androidKt androidColorSpace_androidKt, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1533427666);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && getpostalcode.MediaSessionCompatToken()) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_RESUME;
            getpostalcode.serializer(-67706430);
            boolean z = getpostalcode.read(list);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new invoke3ESFkO8(androidColorSpace_androidKt, 2, list);
                getpostalcode.write(objComponentActivity);
            }
            toAndroidColorSpace toandroidcolorspace = (toAndroidColorSpace) objComponentActivity;
            getpostalcode.IconCompatParcelizer(false);
            supportsColorMatrixQuery lifecycle = ((accessisRenderNodeCompatiblecp) getpostalcode.write((getNewPassword) setInternalPaintui_graphics.write)).getLifecycle();
            getpostalcode.serializer(-67685064);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(lifecycle);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(toandroidcolorspace);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new Navigator$$ExternalSyntheticLambda1(lifecycle, 29, toandroidcolorspace);
                getpostalcode.write(objComponentActivity2);
            }
            getpostalcode.IconCompatParcelizer(false);
            getPhoneNumberNational.IconCompatParcelizer(lifecycle, toandroidcolorspace, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(i, 9, list, androidColorSpace_androidKt);
        }
    }
}
