package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ModalBottomSheetKtModalBottomSheet311 {
    public static final ModalBottomSheetYbuCTN8 write = new ModalBottomSheetYbuCTN8(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, androidx.compose.ui.Alignment.Companion.getStart());

    public static final ModalBottomSheetYbuCTN8 serializer(androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, getBirthDateFull getbirthdatefull, int i) {
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{vertical, androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{horizontal, androidx.compose.ui.Alignment.Companion.getStart()}, getCieXyz.write())).booleanValue()) {
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                getpostalcode.serializer(-1446604504);
                getpostalcode.IconCompatParcelizer(false);
                return write;
            }
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.serializer(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && getpostalcode2.read(vertical)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !getpostalcode2.read(horizontal)) && (i & 48) != 32) {
            z = false;
        }
        Object objComponentActivity = getpostalcode2.ComponentActivity();
        if ((z2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new ModalBottomSheetYbuCTN8(vertical, horizontal);
            getpostalcode2.write(objComponentActivity);
        }
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8 = (ModalBottomSheetYbuCTN8) objComponentActivity;
        getpostalcode2.IconCompatParcelizer(false);
        return modalBottomSheetYbuCTN8;
    }
}
