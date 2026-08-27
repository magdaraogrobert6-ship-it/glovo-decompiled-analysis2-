package o;

import io.grpc.LoadBalancer$Helper;
import io.grpc.internal.CallTracer;
import io.grpc.internal.DelayedClientCall$2;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class unpackZipIntoDirectory extends LoadBalancer$Helper {
    public CallTracer RemoteActionCompatParcelizer;
    public final /* synthetic */ hasTooManyZipEntrieslambda0 serializer;

    @Override // io.grpc.LoadBalancer$Helper
    public final r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc IconCompatParcelizer() {
        return this.serializer.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // io.grpc.LoadBalancer$Helper
    public final void RemoteActionCompatParcelizer() {
        getMethodQuietlylambda1 getmethodquietlylambda1 = this.serializer.addOnNewIntentListener;
        getmethodquietlylambda1.write();
        getmethodquietlylambda1.execute(new isAutomaticGeofenceRequestsEnabled(10, this));
    }

    @Override // io.grpc.LoadBalancer$Helper
    public final ScheduledExecutorService read() {
        return this.serializer.onBackPressedInput_delegatelambda0;
    }

    @Override // io.grpc.LoadBalancer$Helper
    public final JsonUtilsExternalSyntheticLambda1 read(requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2) {
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = this.serializer;
        hastoomanyzipentrieslambda0.addOnNewIntentListener.write();
        TextStreamsKt.RemoteActionCompatParcelizer("Channel is being terminated", !hastoomanyzipentrieslambda0.addOnTrimMemoryListener);
        return new cExternalSyntheticLambda7(hastoomanyzipentrieslambda0, requestpushpermissionpromptlambda2);
    }

    @Override // io.grpc.LoadBalancer$Helper
    public final getMethodQuietlylambda1 write() {
        return this.serializer.addOnNewIntentListener;
    }

    @Override // io.grpc.LoadBalancer$Helper
    public final void write(setResourcePackageNamelambda0 setresourcepackagenamelambda0, requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3) {
        getMethodQuietlylambda1 getmethodquietlylambda1 = this.serializer.addOnNewIntentListener;
        getmethodquietlylambda1.write();
        TextStreamsKt.serializer(setresourcepackagenamelambda0, "newState");
        TextStreamsKt.serializer(requestpushpermissionpromptlambda3, "newPicker");
        getmethodquietlylambda1.execute(new DelayedClientCall$2(this, requestpushpermissionpromptlambda3, setresourcepackagenamelambda0, 7));
    }

    public unpackZipIntoDirectory(hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0) {
        this.serializer = hastoomanyzipentrieslambda0;
    }
}
