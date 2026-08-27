package o;

/* JADX INFO: loaded from: classes.dex */
public final class setOpaque implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;

    public /* synthetic */ setOpaque(long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = j;
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.serializer;
        long j = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Number) obj2).intValue();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                androidx.compose.material3.internal.TextFieldImplKt.IconCompatParcelizer(j, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
        int iIntValue2 = ((Number) obj2).intValue();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
            androidx.compose.material3.internal.TextFieldImplKt.IconCompatParcelizer(j, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode2, 0);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
