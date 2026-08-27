package o;

import io.grpc.Status;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hasPermissionlambda0 {
    public int read;
    public static final parseJsonObjectIntoBundle IconCompatParcelizer = new parseJsonObjectIntoBundle("internal:health-checking-config");
    public static final r8lambdakcTilwmporjFCAWe8ASdQv1Ks write = new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(5);
    public static final parseJsonObjectIntoBundle serializer = new parseJsonObjectIntoBundle("internal:has-health-check-producer-listener");
    public static final parseJsonObjectIntoBundle RemoteActionCompatParcelizer = new parseJsonObjectIntoBundle("io.grpc.IS_PETIOLE_POLICY");

    public boolean IconCompatParcelizer() {
        return false;
    }

    public void RemoteActionCompatParcelizer() {
    }

    public abstract void read();

    public abstract void serializer(Status status);

    public Status RemoteActionCompatParcelizer(requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda1) {
        List list = requestpushpermissionpromptlambda1.read;
        if (!list.isEmpty() || IconCompatParcelizer()) {
            int i = this.read;
            this.read = i + 1;
            if (i == 0) {
                write(requestpushpermissionpromptlambda1);
            }
            this.read = 0;
            return Status.RatingCompat;
        }
        Status statusIconCompatParcelizer = Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("NameResolver returned no usable address. addrs=" + list + ", attrs=" + requestpushpermissionpromptlambda1.serializer);
        serializer(statusIconCompatParcelizer);
        return statusIconCompatParcelizer;
    }

    public void write(requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda1) {
        int i = this.read;
        this.read = i + 1;
        if (i == 0) {
            RemoteActionCompatParcelizer(requestpushpermissionpromptlambda1);
        }
        this.read = 0;
    }
}
