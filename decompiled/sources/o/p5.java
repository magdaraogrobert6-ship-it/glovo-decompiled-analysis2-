package o;

import com.roadrunner.nafath.NafathModalContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p5 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ p5(com.huawei.wisesecurity.ucs_credential.p0 p0Var, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    public /* synthetic */ p5(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 125;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i5 == 0) {
            pb pbVar = (pb) obj;
            int iIntValue = ((Integer) obj3).intValue();
            pbVar.getClass();
            getQueryContext getquerycontext = pbVar.MediaDescriptionCompat;
            getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.RemoteActionCompatParcelizer;
            boolean z = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = this.write;
            boolean z2 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new p3(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 0);
                getpostalcode.write(objComponentActivity);
            }
            androidx.sqlite.SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
            NafathModalContentKt.NafathModal(pbVar, null, getpostalcode, iIntValue & 14);
            return createfromparcel;
        }
        PaintExtensions_androidKt paintExtensions_androidKt = (PaintExtensions_androidKt) obj;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        paintExtensions_androidKt.getClass();
        if ((iIntValue2 & 6) == 0) {
            if ((iIntValue2 & 8) == 0 ? ((getPostalCode) getbirthdatefull).read(paintExtensions_androidKt) : ((getPostalCode) getbirthdatefull).IconCompatParcelizer(paintExtensions_androidKt)) {
                int i6 = serializer + 63;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i = i6 % 2 != 0 ? 5 : 4;
            } else {
                i = 2;
            }
            iIntValue2 |= i;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        if (!getpostalcode2.write(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (paintExtensions_androidKt instanceof Paint29) {
            int i7 = IconCompatParcelizer + 25;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            getpostalcode2.serializer(-1175603786);
            Paint29 paint29 = (Paint29) paintExtensions_androidKt;
            measurewNUYSr0default.IconCompatParcelizer.RemoteActionCompatParcelizer(paint29.IconCompatParcelizer, paint29.read, Integer.valueOf(paint29.RemoteActionCompatParcelizer), this.RemoteActionCompatParcelizer, this.write, getpostalcode2, 0);
            getpostalcode2.IconCompatParcelizer(false);
        } else {
            getpostalcode2.serializer(-1175596227);
            getpostalcode2.IconCompatParcelizer(false);
        }
        return createfromparcel;
    }
}
