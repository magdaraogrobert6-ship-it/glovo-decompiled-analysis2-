package o;

import io.sentry.JsonObjectSerializer;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryOptions;
import io.sentry.protocol.DebugImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaH5l_ymlFq0FHUQBKDVU4UffieY implements BaseBrazeActionStep {
    public static final Charset RemoteActionCompatParcelizer = Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public final HashMap serializer;
    public final SentryOptions write;

    public r8lambdaH5l_ymlFq0FHUQBKDVU4UffieY(SentryOptions sentryOptions) {
        this.write = sentryOptions;
        HashMap map = new HashMap();
        this.serializer = map;
        int i = 0;
        map.put(io.sentry.protocol.read.class, new io.sentry.protocol.serializer(i));
        map.put(getIntentArrayWithConfiguredBackStacklambda1.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(1));
        int i2 = 4;
        map.put(io.sentry.protocol.write.class, new io.sentry.protocol.serializer(i2));
        int i3 = 5;
        map.put(io.sentry.protocol.IconCompatParcelizer.class, new io.sentry.protocol.serializer(i3));
        int i4 = 6;
        map.put(DebugImage.class, new io.sentry.protocol.serializer(i4));
        int i5 = 7;
        map.put(io.sentry.protocol.RemoteActionCompatParcelizer.class, new io.sentry.protocol.serializer(i5));
        int i6 = 8;
        map.put(io.sentry.protocol.MediaMetadataCompat.class, new io.sentry.protocol.serializer(i6));
        int i7 = 9;
        map.put(io.sentry.protocol.RatingCompat.class, new io.sentry.protocol.serializer(i7));
        int i8 = 10;
        map.put(io.sentry.protocol.MediaSessionCompatResultReceiverWrapper.class, new io.sentry.protocol.serializer(i8));
        int i9 = 12;
        map.put(io.sentry.protocol.PlaybackStateCompatCustomAction.class, new io.sentry.protocol.serializer(i9));
        map.put(io.sentry.protocol._init_lambda3.class, new io.sentry.protocol.serializer(26));
        int i10 = 13;
        map.put(io.sentry.protocol.PlaybackStateCompat.class, new io.sentry.protocol.serializer(i10));
        map.put(io.sentry.protocol.ParcelableVolumeInfo.class, new io.sentry.protocol.serializer(14));
        map.put(io.sentry.protocol.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.class, new io.sentry.protocol.serializer(15));
        map.put(io.sentry.protocol.ComponentActivity.class, new io.sentry.protocol.serializer(16));
        int i11 = 2;
        map.put(StepDataargs_delegatelambda0inlinediterator2.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i11));
        int i12 = 3;
        map.put(StepDataCompanion.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i12));
        map.put(ContentCardsActivity.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i2));
        map.put(BannerDismissSnapshotCompanion.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i3));
        map.put(io.sentry.profilemeasurements.RemoteActionCompatParcelizer.class, new io.sentry.protocol.serializer(i11));
        map.put(io.sentry.profilemeasurements.IconCompatParcelizer.class, new io.sentry.protocol.serializer(i12));
        int i13 = 17;
        map.put(io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.class, new io.sentry.protocol.serializer(i13));
        map.put(BannerDismissSnapshot.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i4));
        map.put(io.sentry.rrweb.serializer.class, new io.sentry.rrweb.RatingCompat(3));
        map.put(io.sentry.rrweb.RemoteActionCompatParcelizer.class, new io.sentry.rrweb.RatingCompat(0));
        map.put(io.sentry.rrweb.MediaBrowserCompatMediaItem.class, new io.sentry.rrweb.RatingCompat(4));
        map.put(io.sentry.rrweb.MediaSessionCompatToken.class, new io.sentry.rrweb.RatingCompat(5));
        map.put(io.sentry.rrweb.MediaSessionCompatResultReceiverWrapper.class, new io.sentry.rrweb.RatingCompat(6));
        map.put(io.sentry.rrweb.PlaybackStateCompatCustomAction.class, new io.sentry.rrweb.RatingCompat(7));
        map.put(io.sentry.rrweb.ComponentActivity.class, new io.sentry.rrweb.RatingCompat(8));
        int i14 = 18;
        map.put(io.sentry.protocol.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.class, new io.sentry.protocol.serializer(i14));
        int i15 = 19;
        map.put(io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.class, new io.sentry.protocol.serializer(i15));
        map.put(setOnDismissCallback.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i6));
        map.put(BannerViewExternalSyntheticLambda0.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i7));
        map.put(BannerViewExternalSyntheticLambda2.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i8));
        int i16 = 20;
        map.put(io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.class, new io.sentry.protocol.serializer(i16));
        int i17 = 11;
        map.put(r8lambdaB2EfoRxiN347_5B93fxdQV0g.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i17));
        map.put(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i9));
        map.put(r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i10));
        map.put(r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(14));
        map.put(r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(15));
        map.put(io.sentry.protocol.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.class, new io.sentry.protocol.serializer(21));
        map.put(io.sentry.protocol.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.class, new io.sentry.protocol.serializer(22));
        map.put(onCustomEventAction.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(16));
        map.put(io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.class, new io.sentry.protocol.serializer(23));
        map.put(io.sentry.protocol.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.class, new io.sentry.protocol.serializer(24));
        map.put(io.sentry.protocol.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.class, new io.sentry.protocol.serializer(25));
        map.put(initBannerlambda1.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i5));
        map.put(io.sentry.protocol._init_lambda2.class, new io.sentry.protocol.serializer(27));
        map.put(io.sentry.protocol.accessensureViewModelStore.class, new io.sentry.protocol.serializer(28));
        map.put(logHtmlClicklambda0.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i13));
        map.put(r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i14));
        map.put(r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i));
        map.put(defaultCardHandlinglambda0.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i15));
        map.put(io.sentry.protocol.addObserverForBackInvoker.class, new io.sentry.protocol.serializer(29));
        map.put(io.sentry.protocol.MediaSessionCompatToken.class, new io.sentry.protocol.serializer(i17));
        map.put(handleCardClicklambda2.class, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i16));
        map.put(io.sentry.clientreport.RemoteActionCompatParcelizer.class, new io.sentry.protocol.serializer(1));
        map.put(io.sentry.protocol.fullyDrawnReporter_delegatelambda00.class, new io.sentry.rrweb.RatingCompat(2));
        map.put(io.sentry.protocol.createFullyDrawnExecutor.class, new io.sentry.rrweb.RatingCompat(1));
    }

    @Override // o.BaseBrazeActionStep
    public final OkHttpCall$1 read(BufferedInputStream bufferedInputStream) {
        SentryOptions sentryOptions = this.write;
        try {
            return sentryOptions.getEnvelopeReader().write(bufferedInputStream);
        } catch (IOException e) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    public final String serializer(Object obj, boolean z) throws IOException {
        StringWriter stringWriter = new StringWriter();
        SentryOptions sentryOptions = this.write;
        OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(stringWriter, sentryOptions.getMaxDepth());
        if (z) {
            okHttpCall$1.read("\t");
        }
        ((JsonObjectSerializer) okHttpCall$1.serializer).read(okHttpCall$1, sentryOptions.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // o.BaseBrazeActionStep
    public final void write(OkHttpCall$1 okHttpCall$1, OutputStream outputStream) throws IOException {
        SentryOptions sentryOptions = this.write;
        setNativeShader.read(okHttpCall$1, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), RemoteActionCompatParcelizer));
        try {
            ((setOnDismissCallback) okHttpCall$1.write).serialize(new OkHttpCall$1(bufferedWriter, sentryOptions.getMaxDepth()), sentryOptions.getLogger());
            bufferedWriter.write("\n");
            for (SentryEnvelopeItem sentryEnvelopeItem : (Iterable) okHttpCall$1.serializer) {
                try {
                    byte[] bArrIconCompatParcelizer = sentryEnvelopeItem.IconCompatParcelizer();
                    sentryEnvelopeItem.RemoteActionCompatParcelizer.serialize(new OkHttpCall$1(bufferedWriter, sentryOptions.getMaxDepth()), sentryOptions.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrIconCompatParcelizer);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th) {
            bufferedWriter.flush();
            throw th;
        }
    }

    @Override // o.BaseBrazeActionStep
    public final Object write(Reader reader, Class cls) {
        Object objR8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        SentryOptions sentryOptions = this.write;
        try {
            SetCustomUserAttributeStep setCustomUserAttributeStep = new SetCustomUserAttributeStep(reader);
            try {
                IBrazeActionStep iBrazeActionStep = (IBrazeActionStep) this.serializer.get(cls);
                if (iBrazeActionStep != null) {
                    objR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = cls.cast(iBrazeActionStep.write(setCustomUserAttributeStep, sentryOptions.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        setCustomUserAttributeStep.close();
                        return null;
                    }
                    objR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = setCustomUserAttributeStep.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                }
                setCustomUserAttributeStep.close();
                return objR8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            } catch (Throwable th) {
                try {
                    setCustomUserAttributeStep.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // o.BaseBrazeActionStep
    public final void serializer(Writer writer, Object obj) throws IOException {
        setNativeShader.read(obj, "The entity is required.");
        SentryOptions sentryOptions = this.write;
        BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        if (logger.RemoteActionCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco)) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Serializing object: %s", serializer(obj, sentryOptions.isEnablePrettySerializationOutput()));
        }
        OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(writer, sentryOptions.getMaxDepth());
        ((JsonObjectSerializer) okHttpCall$1.serializer).read(okHttpCall$1, sentryOptions.getLogger(), obj);
        writer.flush();
    }

    @Override // o.BaseBrazeActionStep
    public final String serializer(ConcurrentHashMap concurrentHashMap) {
        return serializer((Object) concurrentHashMap, false);
    }
}
