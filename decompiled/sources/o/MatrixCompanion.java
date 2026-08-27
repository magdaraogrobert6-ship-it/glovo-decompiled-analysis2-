package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MatrixCompanion implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ MatrixCompanion(int i, String str) {
        this.read = 0;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str;
    }

    public /* synthetic */ MatrixCompanion(Object obj, int i, int i2) {
        this.read = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = this.read;
        int i3 = this.IconCompatParcelizer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Matrix matrix = null;
        if (i2 == 0) {
            String str = (String) obj2;
            tintxETnrds tintxetnrds = (tintxETnrds) obj;
            tintxetnrds.getClass();
            UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("UPDATE workspec SET stop_reason=? WHERE id=?");
            try {
                uncheckedColordefaultRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1, i3);
                uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(2, str);
                uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                uncheckedColordefaultRemoteActionCompatParcelizer.close();
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                int i4 = serializer + 19;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return createfromparcel;
                }
                matrix.hashCode();
                throw null;
            } catch (Throwable th) {
                uncheckedColordefaultRemoteActionCompatParcelizer.close();
                throw th;
            }
        }
        if (i2 != 1) {
            ((getPersonNamePrefix) obj).getClass();
            ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(Integer.valueOf(i3));
            return new requiredSizeVpY3zN4(1);
        }
        String str2 = (String) obj2;
        tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
        tintxetnrds2.getClass();
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds2.RemoteActionCompatParcelizer("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        try {
            uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer(1, str2);
            uncheckedColordefaultRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(2, i3);
            int iWrite = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "work_spec_id");
            int iWrite2 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "generation");
            int iWrite3 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "system_id");
            if (uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                matrix = new Matrix(uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite), (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite2), (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite3));
                int i5 = serializer + 3;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            return matrix;
        } finally {
            uncheckedColordefaultRemoteActionCompatParcelizer2.close();
        }
    }
}
