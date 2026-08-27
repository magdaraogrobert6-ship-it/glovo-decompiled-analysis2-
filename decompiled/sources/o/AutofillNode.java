package o;

/* JADX INFO: loaded from: classes.dex */
public final class AutofillNode implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ getOnFill RemoteActionCompatParcelizer;

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        IconButtonKt iconButtonKt = (IconButtonKt) obj;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((getPostalCode) getbirthdatefull).read(iconButtonKt) ? 4 : 2;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 19) != 18)) {
            androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IconCompatParcelizer.write(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, iconButtonKt.align(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.Alignment.Companion.getTopCenter()), 0L, 0L, 0.0f, getpostalcode, 1572864);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    public AutofillNode(getOnFill getonfill, boolean z) {
        this.RemoteActionCompatParcelizer = getonfill;
        this.IconCompatParcelizer = z;
    }
}
