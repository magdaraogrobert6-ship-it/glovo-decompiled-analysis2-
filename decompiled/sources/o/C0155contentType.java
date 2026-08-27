package o;

/* JADX INFO: renamed from: o.contentType, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0155contentType implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ getOnFill read;
    public final /* synthetic */ long serializer;

    public C0155contentType(long j, getOnFill getonfill) {
        this.serializer = j;
        this.read = getonfill;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((getPostalCode) getbirthdatefull).write(zBooleanValue) ? 4 : 2;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(iIntValue & 1, (iIntValue & 19) != 18)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (zBooleanValue) {
            getpostalcode.serializer(-499784343);
            androidx.compose.material3.ProgressIndicatorKt.write(androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.material3.pulltorefresh.PullToRefreshKt.read), this.serializer, androidx.compose.material3.pulltorefresh.PullToRefreshKt.MediaBrowserCompatMediaItem, 0L, 0, 0.0f, getpostalcode, 390);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.serializer(-499540745);
            final getOnFill getonfill = this.read;
            boolean z = getpostalcode.read(getonfill);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new isText() { // from class: o.AutofillManager
                    @Override // o.isText
                    public final float IconCompatParcelizer() {
                        return ((Number) getonfill.write.write()).floatValue();
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            androidx.compose.material3.pulltorefresh.PullToRefreshKt.IconCompatParcelizer((isText) objComponentActivity, this.serializer, getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(false);
        }
        return createFromParcel.INSTANCE;
    }
}
