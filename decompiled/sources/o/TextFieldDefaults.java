package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class TextFieldDefaults {
    public static final supportingTextPaddinga9UjIt4material3default serializer = new supportingTextPaddinga9UjIt4material3default(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, androidx.compose.ui.Alignment.Companion.getTop());

    public static final supportingTextPaddinga9UjIt4material3default serializer(androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, getBirthDateFull getbirthdatefull, int i) {
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{horizontal, androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{vertical, androidx.compose.ui.Alignment.Companion.getTop()}, getCieXyz.write())).booleanValue()) {
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                getpostalcode.serializer(-1073830487);
                getpostalcode.IconCompatParcelizer(false);
                return serializer;
            }
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.serializer(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && getpostalcode2.read(horizontal)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !getpostalcode2.read(vertical)) && (i & 48) != 32) {
            z = false;
        }
        Object objComponentActivity = getpostalcode2.ComponentActivity();
        if ((z2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new supportingTextPaddinga9UjIt4material3default(horizontal, vertical);
            getpostalcode2.write(objComponentActivity);
        }
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3default = (supportingTextPaddinga9UjIt4material3default) objComponentActivity;
        getpostalcode2.IconCompatParcelizer(false);
        return supportingtextpaddinga9ujit4material3default;
    }
}
