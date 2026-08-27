package o;

/* JADX INFO: loaded from: classes.dex */
public final class onFocusChanged implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ onFocusChanged(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.IconCompatParcelizer;
        if (i != 0) {
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Number) obj2).intValue();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                androidx.compose.material3.TextKt.m131TextNvy7gAk((String) obj3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, getpostalcode, 0, 0, 262142);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
        int iIntValue2 = ((Number) obj2).intValue();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
            androidx.compose.material3.TextKt.m131TextNvy7gAk(((setRootAutofillId) obj3).write.read, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, getpostalcode2, 0, 0, 262142);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
