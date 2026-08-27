package io.sentry;

import bo.app.ff$$ExternalSyntheticOutline0;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.protocol.createFullyDrawnExecutor;
import io.sentry.util.write;
import io.sentry.vendor.IconCompatParcelizer;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.TuplesKt;
import o.BaseBrazeActionStep;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.ContentCardsActivity;
import o.getIntentArrayWithConfiguredBackStacklambda3;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SentryEnvelopeItem$$ExternalSyntheticLambda12 implements Callable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ long read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ BaseBrazeActionStep write;

    public /* synthetic */ SentryEnvelopeItem$$ExternalSyntheticLambda12(getIntentArrayWithConfiguredBackStacklambda3 getintentarraywithconfiguredbackstacklambda3, long j, BaseBrazeActionStep baseBrazeActionStep, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        this.serializer = getintentarraywithconfiguredbackstacklambda3;
        this.read = j;
        this.write = baseBrazeActionStep;
        this.IconCompatParcelizer = brazeActionParserExternalSyntheticLambda0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws SentryEnvelopeException {
        int i = this.RemoteActionCompatParcelizer;
        BaseBrazeActionStep baseBrazeActionStep = this.write;
        Object obj = this.IconCompatParcelizer;
        long j = this.read;
        Object obj2 = this.serializer;
        if (i != 0) {
            File file = (File) obj2;
            ContentCardsActivity contentCardsActivity = (ContentCardsActivity) obj;
            if (!file.exists()) {
                throw new SentryEnvelopeException(ff$$ExternalSyntheticOutline0.m("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
            }
            String strIconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer(TuplesKt.serializer(j, file.getPath()));
            if (strIconCompatParcelizer.isEmpty()) {
                throw new SentryEnvelopeException("Profiling trace file is empty");
            }
            contentCardsActivity.ComponentActivity = strIconCompatParcelizer;
            try {
                contentCardsActivity.write = (List) contentCardsActivity.read.call();
            } catch (Throwable unused) {
            }
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, SentryEnvelopeItem.serializer));
                        try {
                            baseBrazeActionStep.serializer(bufferedWriter, contentCardsActivity);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            file.delete();
                            return byteArray;
                        } catch (Throwable th) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    file.delete();
                    throw th5;
                }
            } catch (IOException e) {
                throw new SentryEnvelopeException("Failed to serialize profiling trace data\n" + e.getMessage());
            }
        }
        getIntentArrayWithConfiguredBackStacklambda3 getintentarraywithconfiguredbackstacklambda3 = (getIntentArrayWithConfiguredBackStacklambda3) obj2;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = (BrazeActionParserExternalSyntheticLambda0) obj;
        byte[] byteArray2 = getintentarraywithconfiguredbackstacklambda3.read;
        String str = getintentarraywithconfiguredbackstacklambda3.write;
        if (byteArray2 == null) {
            createFullyDrawnExecutor createfullydrawnexecutor = getintentarraywithconfiguredbackstacklambda3.MediaMetadataCompat;
            if (createfullydrawnexecutor == null) {
                SentryEnvelopeItem$$ExternalSyntheticLambda3 sentryEnvelopeItem$$ExternalSyntheticLambda3 = getintentarraywithconfiguredbackstacklambda3.serializer;
                if (sentryEnvelopeItem$$ExternalSyntheticLambda3 != null && (byteArray2 = (byte[]) sentryEnvelopeItem$$ExternalSyntheticLambda3.call()) != null) {
                    SentryEnvelopeItem.read(byteArray2.length, str, j);
                }
                throw new SentryEnvelopeException(ff$$ExternalSyntheticOutline0.m("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
            }
            Charset charset = write.serializer;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, write.serializer));
                    try {
                        baseBrazeActionStep.serializer(bufferedWriter2, createfullydrawnexecutor);
                        byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                    } catch (Throwable th6) {
                        try {
                            bufferedWriter2.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            } catch (Throwable th10) {
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Could not serialize serializable", th10);
                byteArray2 = null;
            }
            if (byteArray2 != null) {
                SentryEnvelopeItem.read(byteArray2.length, str, j);
            }
            throw new SentryEnvelopeException(ff$$ExternalSyntheticOutline0.m("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
        }
        SentryEnvelopeItem.read(byteArray2.length, str, j);
        return byteArray2;
    }

    public /* synthetic */ SentryEnvelopeItem$$ExternalSyntheticLambda12(File file, long j, ContentCardsActivity contentCardsActivity, BaseBrazeActionStep baseBrazeActionStep) {
        this.serializer = file;
        this.read = j;
        this.IconCompatParcelizer = contentCardsActivity;
        this.write = baseBrazeActionStep;
    }
}
