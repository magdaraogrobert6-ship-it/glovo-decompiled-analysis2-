package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getStrokeTiuSbCo implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ PathOperation RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getStrokeTiuSbCo(PathOperation pathOperation, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = pathOperation;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.write;
        PathOperation pathOperation = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{pathOperation}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        }
        Object[] objArr = {pathOperation};
        int iSerializer3 = getQueryParameterslambda2.serializer();
        return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer3);
    }
}
