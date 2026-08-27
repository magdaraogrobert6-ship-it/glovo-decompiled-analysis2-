package io.sentry;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.adjust.sdk.Constants;
import com.deliveryhero.fwf_http.ConstantKt;
import io.sentry.clientreport.RemoteActionCompatParcelizer;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.protocol.accessensureViewModelStore;
import io.sentry.protocol.profiling.write;
import io.sentry.vendor.IconCompatParcelizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.TuplesKt;
import o.BannerViewExternalSyntheticLambda0;
import o.BaseBrazeActionStep;
import o.StepDataargs_delegatelambda0inlinediterator2;
import o.doAnyTypesMatch;
import o.firstArg_delegatelambda0;
import o.getHeightCallback;
import o.logHtmlClicklambda0;
import o.r8lambdaB2EfoRxiN347_5B93fxdQV0g;
import o.r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I;
import o.r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8;
import o.setHeightCallback;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryEnvelopeItem {
    public static final Charset serializer = Charset.forName(Constants.ENCODING);
    public byte[] IconCompatParcelizer;
    public final BannerViewExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public final Callable read;

    public static SentryEnvelopeItem IconCompatParcelizer(BaseBrazeActionStep baseBrazeActionStep, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        setNativeShader.read(baseBrazeActionStep, "ISerializer is required.");
        OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(new SentryEnvelopeItem$$ExternalSyntheticLambda3(baseBrazeActionStep, 8, remoteActionCompatParcelizer));
        return new SentryEnvelopeItem(new BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g.resolve(remoteActionCompatParcelizer), new getHeightCallback(okHttpCall$1, 3), ConstantKt.CONTENT_TYPE_JSON, null, null), new getHeightCallback(okHttpCall$1, 4));
    }

    public static SentryEnvelopeItem IconCompatParcelizer(BaseBrazeActionStep baseBrazeActionStep, logHtmlClicklambda0 loghtmlclicklambda0) {
        setNativeShader.read(baseBrazeActionStep, "ISerializer is required.");
        setNativeShader.read(loghtmlclicklambda0, "Session is required.");
        int i = 0;
        OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(new SentryEnvelopeItem$$ExternalSyntheticLambda3(baseBrazeActionStep, i, loghtmlclicklambda0));
        return new SentryEnvelopeItem(new BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g.Session, new getHeightCallback(okHttpCall$1, i), ConstantKt.CONTENT_TYPE_JSON, null, null), new getHeightCallback(okHttpCall$1, 5));
    }

    public static byte[] write(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | Fields.SpotShadowColor));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(serializer);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SentryEnvelopeItem(BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda0, byte[] bArr) {
        this.RemoteActionCompatParcelizer = bannerViewExternalSyntheticLambda0;
        this.IconCompatParcelizer = bArr;
        this.read = null;
    }

    public final byte[] IconCompatParcelizer() {
        Callable callable;
        if (this.IconCompatParcelizer == null && (callable = this.read) != null) {
            this.IconCompatParcelizer = (byte[]) callable.call();
        }
        return this.IconCompatParcelizer;
    }

    public final accessensureViewModelStore RemoteActionCompatParcelizer(BaseBrazeActionStep baseBrazeActionStep) throws IOException {
        BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        if (bannerViewExternalSyntheticLambda0 == null || bannerViewExternalSyntheticLambda0.MediaMetadataCompat != r8lambdaB2EfoRxiN347_5B93fxdQV0g.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(IconCompatParcelizer()), serializer));
        try {
            accessensureViewModelStore accessensureviewmodelstore = (accessensureViewModelStore) baseBrazeActionStep.write(bufferedReader, accessensureViewModelStore.class);
            bufferedReader.close();
            return accessensureviewmodelstore;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final RemoteActionCompatParcelizer read(BaseBrazeActionStep baseBrazeActionStep) throws IOException {
        BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        if (bannerViewExternalSyntheticLambda0 == null || bannerViewExternalSyntheticLambda0.MediaMetadataCompat != r8lambdaB2EfoRxiN347_5B93fxdQV0g.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(IconCompatParcelizer()), serializer));
        try {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) baseBrazeActionStep.write(bufferedReader, RemoteActionCompatParcelizer.class);
            bufferedReader.close();
            return remoteActionCompatParcelizer;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8 serializer(BaseBrazeActionStep baseBrazeActionStep) throws IOException {
        BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        if (bannerViewExternalSyntheticLambda0 == null || bannerViewExternalSyntheticLambda0.MediaMetadataCompat != r8lambdaB2EfoRxiN347_5B93fxdQV0g.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(IconCompatParcelizer()), serializer));
        try {
            r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8 r8lambdaezx9vf3n2mjvwrdqvqgqjgg8 = (r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8) baseBrazeActionStep.write(bufferedReader, r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8.class);
            bufferedReader.close();
            return r8lambdaezx9vf3n2mjvwrdqvqgqjgg8;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I write(BaseBrazeActionStep baseBrazeActionStep) throws IOException {
        BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        if (bannerViewExternalSyntheticLambda0 == null || bannerViewExternalSyntheticLambda0.MediaMetadataCompat != r8lambdaB2EfoRxiN347_5B93fxdQV0g.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(IconCompatParcelizer()), serializer));
        try {
            r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I r8lambdapr0zohngrdffbcgpp9owzbum0i = (r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I) baseBrazeActionStep.write(bufferedReader, r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I.class);
            bufferedReader.close();
            return r8lambdapr0zohngrdffbcgpp9owzbum0i;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static SentryEnvelopeItem read(final StepDataargs_delegatelambda0inlinediterator2 stepDataargs_delegatelambda0inlinediterator2, final BaseBrazeActionStep baseBrazeActionStep, final doAnyTypesMatch doanytypesmatch) {
        final File file = stepDataargs_delegatelambda0inlinediterator2.MediaSessionCompatResultReceiverWrapper;
        OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(new Callable() { // from class: io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() throws SentryEnvelopeException {
                BaseBrazeActionStep baseBrazeActionStep2 = baseBrazeActionStep;
                File file2 = file;
                if (!file2.exists()) {
                    throw new SentryEnvelopeException(ff$$ExternalSyntheticOutline0.m("Dropping profile chunk, because the file '", file2.getName(), "' doesn't exists"));
                }
                StepDataargs_delegatelambda0inlinediterator2 stepDataargs_delegatelambda0inlinediterator3 = stepDataargs_delegatelambda0inlinediterator2;
                if ("java".equals(stepDataargs_delegatelambda0inlinediterator3.MediaSessionCompatQueueItem)) {
                    firstArg_delegatelambda0 firstarg_delegatelambda0 = firstArg_delegatelambda0.serializer;
                    doAnyTypesMatch doanytypesmatch2 = doanytypesmatch;
                    if (firstarg_delegatelambda0 == doanytypesmatch2) {
                        throw new SentryEnvelopeException("No ProfileConverter available, dropping chunk.");
                    }
                    try {
                        file2.getAbsolutePath();
                        ((firstArg_delegatelambda0) doanytypesmatch2).getClass();
                        stepDataargs_delegatelambda0inlinediterator3.MediaMetadataCompat = new write();
                    } catch (Exception e) {
                        throw new SentryEnvelopeException("Profile conversion failed", e);
                    }
                } else {
                    String strIconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer(TuplesKt.serializer(52428800L, file2.getPath()));
                    if (strIconCompatParcelizer.isEmpty()) {
                        throw new SentryEnvelopeException("Profiling trace file is empty");
                    }
                    stepDataargs_delegatelambda0inlinediterator3.RatingCompat = strIconCompatParcelizer;
                }
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, SentryEnvelopeItem.serializer));
                            try {
                                baseBrazeActionStep2.serializer(bufferedWriter, stepDataargs_delegatelambda0inlinediterator3);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                file2.delete();
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
                        file2.delete();
                        throw th5;
                    }
                } catch (IOException e2) {
                    throw new SentryEnvelopeException("Failed to serialize profile chunk\n" + e2.getMessage());
                }
            }
        });
        return new SentryEnvelopeItem(new BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g.ProfileChunk, new setHeightCallback(okHttpCall$1, 0), "application-json", file.getName(), (String) null, stepDataargs_delegatelambda0inlinediterator2.MediaSessionCompatQueueItem, (Integer) null), new setHeightCallback(okHttpCall$1, 9));
    }

    public SentryEnvelopeItem(BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda0, Callable callable) {
        this.RemoteActionCompatParcelizer = bannerViewExternalSyntheticLambda0;
        this.read = callable;
        this.IconCompatParcelizer = null;
    }

    public static void read(long j, String str, long j2) throws SentryEnvelopeException {
        if (j > j2) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }
}
