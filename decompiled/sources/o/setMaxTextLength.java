package o;

/* JADX INFO: loaded from: classes.dex */
public final class setMaxTextLength implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ getOnFill write;

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Number) obj3).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 17) != 16)) {
            androidx.compose.animation.CrossfadeKt.serializer(Boolean.valueOf(this.IconCompatParcelizer), null, resolvePointerPrecision.serializer(AutofillTree.DefaultEffects, getpostalcode), null, coil3.ExtrasKt.write(-2064098104, new C0155contentType(this.RemoteActionCompatParcelizer, this.write), getpostalcode), getpostalcode, 24576, 10);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    public setMaxTextLength(boolean z, long j, getOnFill getonfill) {
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = j;
        this.write = getonfill;
    }
}
