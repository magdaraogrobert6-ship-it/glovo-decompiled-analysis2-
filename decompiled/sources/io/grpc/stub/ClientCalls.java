package io.grpc.stub;

import com.braze.Constants;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.io.TextStreamsKt;
import o.JsonUtilsa;
import o.mergeJsonObjectslambda00;
import o.parseStringArrayFromJsonString;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.setCustomLocationAttribute;
import o.visitSubtreeIfYYKmho;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ClientCalls {
    public static final boolean IconCompatParcelizer;
    public static final mergeJsonObjectslambda00 RemoteActionCompatParcelizer;
    public static final Logger read = Logger.getLogger(ClientCalls.class.getName());

    public static void IconCompatParcelizer(JsonUtilsa jsonUtilsa, Throwable th) {
        try {
            jsonUtilsa.read((String) null, th);
        } catch (Error | RuntimeException e) {
            read.log(Level.SEVERE, "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    static {
        int i = 0;
        IconCompatParcelizer = !visitSubtreeIfYYKmho.write(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        RemoteActionCompatParcelizer = new mergeJsonObjectslambda00("internal-stub-type", i);
    }

    public static parseStringArrayFromJsonString IconCompatParcelizer(JsonUtilsa jsonUtilsa, FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        parseStringArrayFromJsonString parsestringarrayfromjsonstring = new parseStringArrayFromJsonString(jsonUtilsa);
        jsonUtilsa.read(new setCustomLocationAttribute(parsestringarrayfromjsonstring), new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA());
        jsonUtilsa.serializer(2);
        try {
            jsonUtilsa.read(fetchEligibleCampaignsRequest);
            jsonUtilsa.read();
            return parsestringarrayfromjsonstring;
        } catch (Error | RuntimeException e) {
            IconCompatParcelizer(jsonUtilsa, e);
            throw null;
        }
    }

    public static Object IconCompatParcelizer(parseStringArrayFromJsonString parsestringarrayfromjsonstring) {
        try {
            return parsestringarrayfromjsonstring.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw Status.RemoteActionCompatParcelizer.IconCompatParcelizer("Thread interrupted").RemoteActionCompatParcelizer(e).RemoteActionCompatParcelizer();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            TextStreamsKt.serializer(cause, Constants.BRAZE_PUSH_TITLE_KEY);
            for (Throwable cause2 = cause; cause2 != null; cause2 = cause2.getCause()) {
                if (cause2 instanceof StatusException) {
                    throw new StatusRuntimeException(((StatusException) cause2).RemoteActionCompatParcelizer, null);
                }
                if (cause2 instanceof StatusRuntimeException) {
                    StatusRuntimeException statusRuntimeException = (StatusRuntimeException) cause2;
                    throw new StatusRuntimeException(statusRuntimeException.RemoteActionCompatParcelizer, statusRuntimeException.IconCompatParcelizer);
                }
            }
            throw Status.ParcelableVolumeInfo.IconCompatParcelizer("unexpected exception").RemoteActionCompatParcelizer(cause).RemoteActionCompatParcelizer();
        }
    }
}
