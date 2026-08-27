package o;

import io.sentry.JsonObjectSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda7SO9YQUZYURvt62dLcNBEZIcKbA implements getColorIntegerOrNulllambda0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;

    public r8lambda7SO9YQUZYURvt62dLcNBEZIcKbA(com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory) {
        dataModule_ProvideSchedulerFactory.getClass();
        this.RemoteActionCompatParcelizer = dataModule_ProvideSchedulerFactory;
    }

    public r8lambda7SO9YQUZYURvt62dLcNBEZIcKbA(r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq) {
        r8lambdagjlqvkshrnmp25jfhdbcpsguwkq.getClass();
        this.RemoteActionCompatParcelizer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite.getClass();
            return new r8lambda7N09UYmlXn1od8eOh6S1lYPo8aE((boundingRectInRoot) objWrite);
        }
        Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        objWrite2.getClass();
        JsonObjectSerializer jsonObjectSerializer = new JsonObjectSerializer(4, (BrazeExternalSyntheticLambda26) objWrite2);
        int i4 = serializer + 71;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return jsonObjectSerializer;
        }
        throw null;
    }
}
