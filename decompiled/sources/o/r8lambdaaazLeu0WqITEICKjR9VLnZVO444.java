package o;

import io.grpc.Status;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaaazLeu0WqITEICKjR9VLnZVO444 extends hasPermission {
    public final r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8 serializer;

    @Override // o.hasPermission
    public final r8lambda1MNczrzuv4oWduWgKg6cjtSWs RemoteActionCompatParcelizer() {
        Status status = Status.RatingCompat;
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
        TextStreamsKt.serializer(status, "status");
        r8lambda1mnczrzuv4owduwgkg6cjtsws.write = status;
        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = this.serializer;
        return r8lambda1mnczrzuv4owduwgkg6cjtsws;
    }

    public r8lambdaaazLeu0WqITEICKjR9VLnZVO444(r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8 r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8) {
        this.serializer = r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8;
    }
}
