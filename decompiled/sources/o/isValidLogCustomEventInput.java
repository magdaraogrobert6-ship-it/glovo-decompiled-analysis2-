package o;

import io.sentry.JsonObjectSerializer;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidLogCustomEventInput implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ JsonObjectSerializer write;

    public /* synthetic */ isValidLogCustomEventInput(JsonObjectSerializer jsonObjectSerializer, int i) {
        this.IconCompatParcelizer = i;
        this.write = jsonObjectSerializer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        JsonObjectSerializer jsonObjectSerializer = this.write;
        if (i == 0) {
            jsonObjectSerializer.RemoteActionCompatParcelizer(true);
            return;
        }
        if (i == 1) {
            jsonObjectSerializer.RemoteActionCompatParcelizer(false);
            return;
        }
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = (hasTooManyZipEntrieslambda0) jsonObjectSerializer.jsonReflectionObjectSerializer;
        TextStreamsKt.RemoteActionCompatParcelizer("Channel must have been shut down", hastoomanyzipentrieslambda0.addContentView.get());
        hastoomanyzipentrieslambda0.addOnTrimMemoryListener = true;
        hastoomanyzipentrieslambda0.read(false);
        hasTooManyZipEntrieslambda0.write(hastoomanyzipentrieslambda0);
        hasTooManyZipEntrieslambda0.serializer(hastoomanyzipentrieslambda0);
    }
}
