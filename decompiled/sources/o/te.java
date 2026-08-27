package o;

import com.huawei.location.gwi.util.GwiErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class te implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.material3.SnackbarHostState RemoteActionCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 serializer;

    public /* synthetic */ te(androidx.compose.material3.SnackbarHostState snackbarHostState, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = snackbarHostState;
        this.serializer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.material3.SnackbarHostState snackbarHostState;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        androidx.compose.ui.Modifier modifier;
        int i;
        androidx.compose.material3.SnackbarHostState snackbarHostState2;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8;
        androidx.compose.ui.Modifier modifier2;
        int i2;
        int i3;
        androidx.compose.material3.SnackbarHostState snackbarHostState3;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9;
        androidx.compose.ui.Modifier modifier3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = write + 61;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean z = false;
        switch (i9) {
            case 0:
                if ((iIntValue & 3) != 2) {
                    int i10 = read + 117;
                    write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    z = true;
                }
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (!getpostalcode.write(iIntValue & 1, z)) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    int i12 = write + 63;
                    read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    AdjustBridgeInstance.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.serializer, null, getpostalcode, 54, 4);
                }
                break;
            case 1:
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
                if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    int i14 = read + 21;
                    write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        snackbarHostState = this.RemoteActionCompatParcelizer;
                        populateViewStructure_androidKtpopulate7 = this.serializer;
                        modifier = null;
                        i = 43;
                    } else {
                        snackbarHostState = this.RemoteActionCompatParcelizer;
                        populateViewStructure_androidKtpopulate7 = this.serializer;
                        modifier = null;
                        i = 54;
                    }
                    AdjustBridgeInstance.IconCompatParcelizer(snackbarHostState, populateViewStructure_androidKtpopulate7, modifier, getpostalcode2, i, 4);
                }
                break;
            case 2:
                if ((iIntValue & 3) != 2) {
                    int i15 = write + 71;
                    read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    z = true;
                }
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
                if (!getpostalcode3.write(iIntValue & 1, z)) {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    AdjustBridgeInstance.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.serializer, null, getpostalcode3, 54, 4);
                }
                break;
            case 3:
                if ((iIntValue & 3) != 2) {
                    int i17 = read + 95;
                    write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i17 % 2 != 0) {
                        z = true;
                    }
                }
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull;
                if (!getpostalcode4.write(iIntValue & 1, z)) {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    AdjustBridgeInstance.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.serializer, null, getpostalcode4, 54, 4);
                }
                break;
            case 4:
                if ((iIntValue & 3) != 2) {
                    int i18 = read + 55;
                    write = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    z = true;
                }
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull;
                if (!getpostalcode5.write(iIntValue & 1, z)) {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    AdjustBridgeInstance.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.serializer, null, getpostalcode5, 54, 4);
                }
                break;
            case 5:
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull;
                if (!getpostalcode6.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    int i20 = write + 33;
                    read = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i20 % 2 != 0) {
                        snackbarHostState2 = this.RemoteActionCompatParcelizer;
                        populateViewStructure_androidKtpopulate8 = this.serializer;
                        modifier2 = null;
                        i2 = 113;
                        i3 = 3;
                    } else {
                        snackbarHostState2 = this.RemoteActionCompatParcelizer;
                        populateViewStructure_androidKtpopulate8 = this.serializer;
                        modifier2 = null;
                        i2 = 54;
                        i3 = 4;
                    }
                    AdjustBridgeInstance.IconCompatParcelizer(snackbarHostState2, populateViewStructure_androidKtpopulate8, modifier2, getpostalcode6, i2, i3);
                }
                break;
            case 6:
                if ((iIntValue & 3) != 2) {
                    int i21 = write + 45;
                    read = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    z = true;
                }
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull;
                if (!getpostalcode7.write(iIntValue & 1, z)) {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    AdjustBridgeInstance.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.serializer, null, getpostalcode7, 54, 4);
                }
                break;
            default:
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull;
                if (!getpostalcode8.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    int i23 = write + 15;
                    read = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i23 % 2 != 0) {
                        snackbarHostState3 = this.RemoteActionCompatParcelizer;
                        populateViewStructure_androidKtpopulate9 = this.serializer;
                        modifier3 = null;
                        i4 = GwiErrorCode.ALG_LIBRARY_NOT_EXIST;
                        i5 = 5;
                    } else {
                        snackbarHostState3 = this.RemoteActionCompatParcelizer;
                        populateViewStructure_androidKtpopulate9 = this.serializer;
                        modifier3 = null;
                        i4 = 54;
                        i5 = 4;
                    }
                    AdjustBridgeInstance.IconCompatParcelizer(snackbarHostState3, populateViewStructure_androidKtpopulate9, modifier3, getpostalcode8, i4, i5);
                }
                break;
        }
        return createfromparcel;
    }
}
