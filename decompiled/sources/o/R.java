package o;

/* JADX INFO: loaded from: classes.dex */
public final class R implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ float IconCompatParcelizer;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            drawTextJFhB2K4default.read.invoke(androidx.compose.foundation.layout.PaddingKt.m72PaddingValuesa9UjIt4$default(7, 0.0f, 0.0f, this.IconCompatParcelizer), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    public R(float f) {
        this.IconCompatParcelizer = f;
    }
}
