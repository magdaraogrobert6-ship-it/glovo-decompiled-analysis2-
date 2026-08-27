package o;

import io.grpc.CallOptions$Builder;
import io.grpc.Status;
import io.sentry.SentryClient;
import java.util.concurrent.Executor;
import kotlin.io.TextStreamsKt;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class unpackZipEntry extends r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU {
    public final hasPermission IconCompatParcelizer;
    public JsonUtilsa MediaBrowserCompatMediaItem;
    public final SentryClient MediaMetadataCompat;
    public final setResourcePackageName RemoteActionCompatParcelizer;
    public final Executor read;
    public mergeJsonObjectslambda10 serializer;
    public final parseJsonObjectIntoBundlelambda0 write;

    @Override // o.r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU
    public final JsonUtilsa RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public unpackZipEntry(hasPermission haspermission, getMaxUnpackedZipSizeBytesandroid_sdk_base_release getmaxunpackedzipsizebytesandroid_sdk_base_release, Executor executor, SentryClient sentryClient, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        this.IconCompatParcelizer = haspermission;
        this.write = getmaxunpackedzipsizebytesandroid_sdk_base_release;
        this.MediaMetadataCompat = sentryClient;
        Executor executor2 = mergejsonobjectslambda10.write;
        executor = executor2 != null ? executor2 : executor;
        this.read = executor;
        CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda10);
        callOptions$BuilderRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = executor;
        this.serializer = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = setResourcePackageName.read();
    }

    @Override // o.r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU, o.JsonUtilsa
    public final void read(String str, Throwable th) {
        JsonUtilsa jsonUtilsa = this.MediaBrowserCompatMediaItem;
        if (jsonUtilsa != null) {
            jsonUtilsa.read(str, th);
        }
    }

    @Override // o.r8lambdadZXrqy_dOAYS9PGDcFpPsyq2mFU, o.JsonUtilsa
    public final void read(MathKt mathKt, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        mergeJsonObjectslambda10 mergejsonobjectslambda10 = this.serializer;
        SentryClient sentryClient = this.MediaMetadataCompat;
        TextStreamsKt.serializer(sentryClient, "method");
        TextStreamsKt.serializer(mergejsonobjectslambda10, "callOptions");
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtswsRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        Status status = (Status) r8lambda1mnczrzuv4owduwgkg6cjtswsRemoteActionCompatParcelizer.write;
        if (!status.IconCompatParcelizer()) {
            this.read.execute(new isValidLineId(this, mathKt, r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.RemoteActionCompatParcelizer(status)));
            this.MediaBrowserCompatMediaItem = hasTooManyZipEntrieslambda0.serializer;
            return;
        }
        r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8 r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8 = (r8lambdaiZpYvcRXwzT4q0CEuK5Mc_MF8) r8lambda1mnczrzuv4owduwgkg6cjtswsRemoteActionCompatParcelizer.IconCompatParcelizer;
        iExternalSyntheticLambda0 iexternalsyntheticlambda0 = (iExternalSyntheticLambda0) r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.MediaMetadataCompat.get((String) sentryClient.MediaBrowserCompatMediaItem);
        if (iexternalsyntheticlambda0 == null) {
            iexternalsyntheticlambda0 = (iExternalSyntheticLambda0) r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.read.get((String) sentryClient.MediaDescriptionCompat);
        }
        if (iexternalsyntheticlambda0 == null) {
            iexternalsyntheticlambda0 = r8lambdaizpyvcrxwzt4q0ceuk5mc_mf8.serializer;
        }
        if (iexternalsyntheticlambda0 != null) {
            this.serializer = this.serializer.IconCompatParcelizer(iExternalSyntheticLambda0.IconCompatParcelizer, iexternalsyntheticlambda0);
        }
        JsonUtilsa jsonUtilsa = this.write.read(sentryClient, this.serializer);
        this.MediaBrowserCompatMediaItem = jsonUtilsa;
        jsonUtilsa.read(mathKt, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
    }
}
