package io.sentry.transport;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import java.io.IOException;
import kotlin.io.TextStreamsKt;
import o.executelambda4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;
import o.setOnDismissCallback;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements Runnable {
    public final /* synthetic */ RemoteActionCompatParcelizer IconCompatParcelizer;
    public final OkHttpCall$1 RemoteActionCompatParcelizer;
    public final r8lambda7IJBVrN0sHyidCAZufWEJFc7yY read = new r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(-1);
    public final io.sentry.cache.serializer serializer;
    public final executelambda4 write;

    public static /* synthetic */ void serializer(serializer serializerVar, TextStreamsKt textStreamsKt, io.sentry.hints.MediaSessionCompatToken mediaSessionCompatToken) {
        serializerVar.IconCompatParcelizer.serializer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(textStreamsKt.RemoteActionCompatParcelizer()));
        mediaSessionCompatToken.write(textStreamsKt.RemoteActionCompatParcelizer());
    }

    public serializer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, OkHttpCall$1 okHttpCall$1, executelambda4 executelambda4Var, io.sentry.cache.serializer serializerVar) {
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        setNativeShader.read(okHttpCall$1, "Envelope is required.");
        this.RemoteActionCompatParcelizer = okHttpCall$1;
        this.write = executelambda4Var;
        setNativeShader.read(serializerVar, "EnvelopeCache is required.");
        this.serializer = serializerVar;
    }

    public final TextStreamsKt serializer() {
        OkHttpCall$1 okHttpCall$1 = this.RemoteActionCompatParcelizer;
        ((setOnDismissCallback) okHttpCall$1.write).serializer = null;
        io.sentry.cache.serializer serializerVar = this.serializer;
        executelambda4 executelambda4Var = this.write;
        boolean zWrite = serializerVar.write(okHttpCall$1, executelambda4Var);
        Object obj = executelambda4Var.read("sentry:typeCheckHint");
        boolean zIsInstance = io.sentry.hints.read.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"));
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        if (zIsInstance && obj != null) {
            io.sentry.hints.read readVar = (io.sentry.hints.read) obj;
            SentryOptions sentryOptions = remoteActionCompatParcelizer.serializer;
            if (readVar.serializer(((setOnDismissCallback) okHttpCall$1.write).write)) {
                readVar.RatingCompat.countDown();
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        SentryOptions sentryOptions2 = remoteActionCompatParcelizer.serializer;
        if (remoteActionCompatParcelizer.MediaMetadataCompat.read()) {
            OkHttpCall$1 okHttpCall$1Write = sentryOptions2.getClientReportRecorder().write(okHttpCall$1);
            try {
                ((setOnDismissCallback) okHttpCall$1Write.write).serializer = setNativeShader.IconCompatParcelizer(Double.valueOf(sentryOptions2.getDateProvider().RemoteActionCompatParcelizer().read() / 1000000.0d).longValue());
                TextStreamsKt textStreamsKtWrite = remoteActionCompatParcelizer.RemoteActionCompatParcelizer.write(okHttpCall$1Write);
                if (textStreamsKtWrite.RemoteActionCompatParcelizer()) {
                    serializerVar.IconCompatParcelizer(okHttpCall$1);
                    return textStreamsKtWrite;
                }
                String str = "The transport failed to send the envelope with response code " + textStreamsKtWrite.serializer();
                sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, str, new Object[0]);
                if (textStreamsKtWrite.serializer() >= 400) {
                    serializerVar.IconCompatParcelizer(okHttpCall$1);
                    if (textStreamsKtWrite.serializer() != 429) {
                        sentryOptions2.getClientReportRecorder().IconCompatParcelizer(io.sentry.clientreport.read.NETWORK_ERROR, okHttpCall$1Write);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e) {
                Object obj2 = executelambda4Var.read("sentry:typeCheckHint");
                if (io.sentry.hints.MediaDescriptionCompat.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) && obj2 != null) {
                    ((io.sentry.hints.MediaDescriptionCompat) obj2).read(true);
                } else if (!zWrite) {
                    io.sentry.util.RatingCompat.serializer(io.sentry.hints.MediaDescriptionCompat.class, obj2, sentryOptions2.getLogger());
                    sentryOptions2.getClientReportRecorder().IconCompatParcelizer(io.sentry.clientreport.read.NETWORK_ERROR, okHttpCall$1Write);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Sending the event failed.", e);
                return null;
            }
        }
        Object obj3 = executelambda4Var.read("sentry:typeCheckHint");
        boolean zIsInstance2 = io.sentry.hints.MediaDescriptionCompat.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"));
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = this.read;
        if (zIsInstance2 && obj3 != null) {
            ((io.sentry.hints.MediaDescriptionCompat) obj3).read(true);
            return r8lambda7ijbvrn0shyidcazufwejfc7yy;
        }
        if (!zWrite) {
            io.sentry.util.RatingCompat.serializer(io.sentry.hints.MediaDescriptionCompat.class, obj3, sentryOptions2.getLogger());
            sentryOptions2.getClientReportRecorder().IconCompatParcelizer(io.sentry.clientreport.read.NETWORK_ERROR, okHttpCall$1);
        }
        return r8lambda7ijbvrn0shyidcazufwejfc7yy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.IconCompatParcelizer.read = this;
        TextStreamsKt textStreamsKtSerializer = this.read;
        try {
            textStreamsKtSerializer = serializer();
            this.IconCompatParcelizer.serializer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Envelope flushed", new Object[0]);
            executelambda4 executelambda4Var = this.write;
            Object obj = executelambda4Var.read("sentry:typeCheckHint");
            if (io.sentry.hints.MediaSessionCompatToken.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) && obj != null) {
                serializer(this, textStreamsKtSerializer, (io.sentry.hints.MediaSessionCompatToken) obj);
            }
            this.IconCompatParcelizer.read = null;
        } catch (Throwable th) {
            try {
                this.IconCompatParcelizer.serializer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Envelope submission failed", new Object[0]);
                throw th;
            } catch (Throwable th2) {
                executelambda4 executelambda4Var2 = this.write;
                Object obj2 = executelambda4Var2.read("sentry:typeCheckHint");
                if (io.sentry.hints.MediaSessionCompatToken.class.isInstance(executelambda4Var2.read("sentry:typeCheckHint")) && obj2 != null) {
                    serializer(this, textStreamsKtSerializer, (io.sentry.hints.MediaSessionCompatToken) obj2);
                }
                this.IconCompatParcelizer.read = null;
                throw th2;
            }
        }
    }
}
