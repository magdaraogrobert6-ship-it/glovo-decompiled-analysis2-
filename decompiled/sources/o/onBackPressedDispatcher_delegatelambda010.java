package o;

import android.content.Context;
import android.content.ContextWrapper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public abstract class onBackPressedDispatcher_delegatelambda010 {
    private static int serializer = 1;
    private static int write;

    public static accessgetAmbientShadowColor0d7_KjUjd read(long j) {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("delivery_id", Long.valueOf(j));
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = new accessgetAmbientShadowColor0d7_KjUjd(linkedHashMap);
        Okio.serializer(accessgetambientshadowcolor0d7_kjujd);
        int i2 = write + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return accessgetambientshadowcolor0d7_kjujd;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a A[PHI: r1 r3 r5 r14 r15
  0x003a: PHI (r1v5 o.PopulateViewStructure_androidKtpopulate7) = (r1v4 o.PopulateViewStructure_androidKtpopulate7), (r1v19 o.PopulateViewStructure_androidKtpopulate7) binds: [B:9:0x0038, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r3v1 java.lang.Object[]) = (r3v0 java.lang.Object[]), (r3v27 java.lang.Object[]) binds: [B:9:0x0038, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r5v1 o.AndroidContentCaptureManager) = (r5v0 o.AndroidContentCaptureManager), (r5v3 o.AndroidContentCaptureManager) binds: [B:9:0x0038, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r14v2 o.PopulateViewStructure_androidKtpopulate7) = (r14v1 o.PopulateViewStructure_androidKtpopulate7), (r14v9 o.PopulateViewStructure_androidKtpopulate7) binds: [B:9:0x0038, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r15v2 o.getPostalCode) = (r15v1 o.getPostalCode), (r15v4 o.getPostalCode) binds: [B:9:0x0038, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    public static final addOnPictureInPictureUiStateChangedListener write(onNewIntent onnewintent, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull) {
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer2;
        Object[] objArr;
        getPostalCode getpostalcode;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 51;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            populateViewStructure_androidKtpopulate7Serializer = androidx.compose.runtime.CompositionKt.serializer(onnewintent, getbirthdatefull);
            populateViewStructure_androidKtpopulate7Serializer2 = androidx.compose.runtime.CompositionKt.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getbirthdatefull);
            objArr = new Object[0];
            getpostalcode = (getPostalCode) getbirthdatefull;
            objComponentActivity = getpostalcode.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new RemoteActionCompatParcelizer(i);
                getpostalcode.write(objComponentActivity);
            }
        } else {
            populateViewStructure_androidKtpopulate7Serializer = androidx.compose.runtime.CompositionKt.serializer(onnewintent, getbirthdatefull);
            populateViewStructure_androidKtpopulate7Serializer2 = androidx.compose.runtime.CompositionKt.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getbirthdatefull);
            objArr = new Object[0];
            getpostalcode = (getPostalCode) getbirthdatefull;
            objComponentActivity = getpostalcode.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new RemoteActionCompatParcelizer(i);
                getpostalcode.write(objComponentActivity);
            }
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate7Serializer2;
        String str = (String) getEventType.IconCompatParcelizer(objArr, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48);
        onMultiWindowModeChanged onmultiwindowmodechanged = (onMultiWindowModeChanged) getpostalcode.write((getNewPassword) addOnTrimMemoryListener.serializer);
        if (onmultiwindowmodechanged == null) {
            int i4 = write + 117;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            getpostalcode.serializer(1213380307);
            Object baseContext = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof onMultiWindowModeChanged) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            onmultiwindowmodechanged = (onMultiWindowModeChanged) baseContext;
        } else {
            getpostalcode.serializer(1213379439);
        }
        getpostalcode.IconCompatParcelizer(false);
        if (onmultiwindowmodechanged == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        androidx.activity.result.ActivityResultRegistry activityResultRegistry = onmultiwindowmodechanged.getActivityResultRegistry();
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new onBackPressedDispatcher_delegatelambda0();
            getpostalcode.write(objComponentActivity2);
        }
        onBackPressedDispatcher_delegatelambda0 onbackpresseddispatcher_delegatelambda0 = (onBackPressedDispatcher_delegatelambda0) objComponentActivity2;
        Object objComponentActivity3 = getpostalcode.ComponentActivity();
        if (objComponentActivity3 == androidContentCaptureManager) {
            objComponentActivity3 = new addOnPictureInPictureUiStateChangedListener(onbackpresseddispatcher_delegatelambda0, populateViewStructure_androidKtpopulate7Serializer);
            getpostalcode.write(objComponentActivity3);
        }
        addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistener = (addOnPictureInPictureUiStateChangedListener) objComponentActivity3;
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(onbackpresseddispatcher_delegatelambda0);
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(activityResultRegistry);
        boolean z = getpostalcode.read(str);
        boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(onnewintent);
        boolean z2 = getpostalcode.read(populateViewStructure_androidKtpopulate7);
        Object objComponentActivity4 = getpostalcode.ComponentActivity();
        if (!(zIconCompatParcelizer | zIconCompatParcelizer2 | z | zIconCompatParcelizer3) && !z2) {
            int i6 = serializer + 61;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (objComponentActivity4 == androidContentCaptureManager) {
                toAndroidVertexModeJOOmi9M toandroidvertexmodejoomi9m = new toAndroidVertexModeJOOmi9M(onbackpresseddispatcher_delegatelambda0, activityResultRegistry, str, onnewintent, populateViewStructure_androidKtpopulate7, 1);
                getpostalcode.write(toandroidvertexmodejoomi9m);
                objComponentActivity4 = toandroidvertexmodejoomi9m;
            }
        } else {
            toAndroidVertexModeJOOmi9M toandroidvertexmodejoomi9m2 = new toAndroidVertexModeJOOmi9M(onbackpresseddispatcher_delegatelambda0, activityResultRegistry, str, onnewintent, populateViewStructure_androidKtpopulate7, 1);
            getpostalcode.write(toandroidvertexmodejoomi9m2);
            objComponentActivity4 = toandroidvertexmodejoomi9m2;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
        boolean z3 = getpostalcode.read(activityResultRegistry);
        boolean z4 = getpostalcode.read(str);
        boolean z5 = getpostalcode.read(onnewintent);
        Object objComponentActivity5 = getpostalcode.ComponentActivity();
        if ((z5 | z4 | z3) || objComponentActivity5 == androidContentCaptureManager) {
            objComponentActivity5 = new getPhoneCountryCode(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
            getpostalcode.write(objComponentActivity5);
        }
        return addonpictureinpictureuistatechangedlistener;
    }
}
