package o;

/* JADX INFO: loaded from: classes.dex */
public final class fold implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ float read;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.m84sizeVpY3zN4(androidx.compose.ui.Modifier.Companion, this.RemoteActionCompatParcelizer, this.read), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    public fold(float f, float f2) {
        this.RemoteActionCompatParcelizer = f;
        this.read = f2;
    }
}
