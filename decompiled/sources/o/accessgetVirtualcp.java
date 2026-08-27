package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetVirtualcp implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public static final accessgetVirtualcp IconCompatParcelizer = new accessgetVirtualcp(1);
    public static final accessgetVirtualcp write = new accessgetVirtualcp(0);
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ accessgetVirtualcp(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i != 0) {
            androidx.compose.material3.SnackbarHostState snackbarHostState = (androidx.compose.material3.SnackbarHostState) obj;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Number) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= ((getPostalCode) getbirthdatefull).read(snackbarHostState) ? 4 : 2;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                androidx.compose.material3.SnackbarHostKt.read(snackbarHostState, null, null, getpostalcode, iIntValue & 14, 6);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        setRootAutofillId setrootautofillid = (setRootAutofillId) obj;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= ((getPostalCode) getbirthdatefull2).read(setrootautofillid) ? 4 : 2;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            androidx.compose.material3.SnackbarKt.m125SnackbarsDKtq54(setrootautofillid, null, null, 0L, 0L, 0L, 0L, 0L, getpostalcode2, iIntValue2 & 14);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
