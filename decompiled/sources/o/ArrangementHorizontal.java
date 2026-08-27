package o;

import androidx.navigation.compose.NavHostKt$NavHost$29$1;

/* JADX INFO: loaded from: classes.dex */
public final class ArrangementHorizontal {
    public final String read;
    public final onCreateVirtualViewTranslationRequests IconCompatParcelizer = new onCreateVirtualViewTranslationRequests(new placeSpaceBetweenfoundation_layout[16]);
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
    public long serializer = Long.MIN_VALUE;
    public final PopulateViewStructure_androidKtpopulate7 write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.TRUE);

    public ArrangementHorizontal(String str) {
        this.read = str;
    }

    public final void write(getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-318043801);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 1;
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(null);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            if (((Boolean) ((onShowTranslationui) this.write).getValue()).booleanValue() || ((Boolean) ((onShowTranslationui) this.RemoteActionCompatParcelizer).getValue()).booleanValue()) {
                getpostalcode.serializer(-144841960);
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(this);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new NavHostKt$NavHost$29$1(populateViewStructure_androidKtpopulate7, this, shortNewsContentCardView, i3);
                    getpostalcode.write(objComponentActivity2);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, this, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-143455237);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(this, i, i4);
        }
    }
}
