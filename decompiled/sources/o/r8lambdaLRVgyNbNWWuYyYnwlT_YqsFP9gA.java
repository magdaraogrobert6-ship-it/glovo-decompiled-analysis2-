package o;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaLRVgyNbNWWuYyYnwlT_YqsFP9gA extends JsonUtilsExternalSyntheticLambda1 {
    public final /* synthetic */ r8lambdaRFRfowALp5JU3r14umh5Sb3V5Jg RemoteActionCompatParcelizer;

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final void serializer(Status status) {
        UriAction uriAction = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        boolean zIconCompatParcelizer = status.IconCompatParcelizer();
        r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20 r8lambdapxfx9i9wwy9pn8nj6g6puqyz20 = uriAction.serializer;
        if (r8lambdapxfx9i9wwy9pn8nj6g6puqyz20.MediaDescriptionCompat == null && r8lambdapxfx9i9wwy9pn8nj6g6puqyz20.read == null) {
            return;
        }
        FormBody.Builder builder = uriAction.IconCompatParcelizer;
        if (zIconCompatParcelizer) {
            ((AtomicLong) builder.serializer).getAndIncrement();
        } else {
            ((AtomicLong) builder.RemoteActionCompatParcelizer).getAndIncrement();
        }
    }

    public r8lambdaLRVgyNbNWWuYyYnwlT_YqsFP9gA(r8lambdaRFRfowALp5JU3r14umh5Sb3V5Jg r8lambdarfrfowalp5ju3r14umh5sb3v5jg) {
        this.RemoteActionCompatParcelizer = r8lambdarfrfowalp5ju3r14umh5sb3v5jg;
    }
}
