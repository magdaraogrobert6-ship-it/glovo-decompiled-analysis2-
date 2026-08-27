package o;

import com.braze.Braze$$ExternalSyntheticLambda9;

/* JADX INFO: loaded from: classes.dex */
public abstract class ArrangementCenter1 {
    public static final placeSpaceBetweenfoundation_layout IconCompatParcelizer(ArrangementHorizontal arrangementHorizontal, float f, float f2, placeSpaceEvenlyfoundation_layout placespaceevenlyfoundation_layout, String str, getBirthDateFull getbirthdatefull, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        return IconCompatParcelizer(arrangementHorizontal, Float.valueOf(f), Float.valueOf(f2), placespaceevenlyfoundation_layout, str, getbirthdatefull, (i & 1022) | androidx.compose.ui.graphics.Fields.CompositingStrategy | ((i << 3) & 458752));
    }

    public static final placeSpaceBetweenfoundation_layout IconCompatParcelizer(ArrangementHorizontal arrangementHorizontal, Float f, Float f2, placeSpaceEvenlyfoundation_layout placespaceevenlyfoundation_layout, String str, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = new placeSpaceBetweenfoundation_layout(arrangementHorizontal, f, f2, placespaceevenlyfoundation_layout, str);
            getpostalcode.write(objComponentActivity);
        }
        placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layout = (placeSpaceBetweenfoundation_layout) objComponentActivity;
        boolean z = (((i & 112) ^ 48) > 32 && getpostalcode.IconCompatParcelizer(f)) || (i & 48) == 32;
        boolean z2 = (((i & 896) ^ 384) > 256 && getpostalcode.IconCompatParcelizer(f2)) || (i & 384) == 256;
        boolean z3 = (((57344 & i) ^ 24576) > 16384 && getpostalcode.IconCompatParcelizer(placespaceevenlyfoundation_layout)) || (i & 24576) == 16384;
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if ((z | z2 | z3) || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new Braze$$ExternalSyntheticLambda9(f, placespacebetweenfoundation_layout, f2, placespaceevenlyfoundation_layout, 1);
            getpostalcode.write(objComponentActivity2);
        }
        getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, getpostalcode);
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(arrangementHorizontal);
        Object objComponentActivity3 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer || objComponentActivity3 == androidContentCaptureManager) {
            objComponentActivity3 = new waitForFirstLayout(arrangementHorizontal, 2, placespacebetweenfoundation_layout);
            getpostalcode.write(objComponentActivity3);
        }
        getPhoneNumberNational.serializer(placespacebetweenfoundation_layout, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
        return placespacebetweenfoundation_layout;
    }

    public static final ArrangementHorizontal read(String str, getBirthDateFull getbirthdatefull, int i) {
        if ((i & 1) != 0) {
            str = "InfiniteTransition";
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new ArrangementHorizontal(str);
            getpostalcode.write(objComponentActivity);
        }
        ArrangementHorizontal arrangementHorizontal = (ArrangementHorizontal) objComponentActivity;
        arrangementHorizontal.write(getpostalcode, 0);
        return arrangementHorizontal;
    }
}
