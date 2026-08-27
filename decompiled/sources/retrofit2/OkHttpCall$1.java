package retrofit2;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_tracking.model.FwFTrackingCallback;
import com.deliveryhero.fwf_tracking.model.TrackingEvent;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.onpause.data.EndBreakRepository$endBreak$1;
import com.roadrunner.startworking.data.stopworking.AvailabilityRepository$stopWorking$1;
import io.grpc.internal.SharedResourcePool;
import io.sentry.JsonObjectSerializer;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryOptions;
import io.sentry.clientreport.IconCompatParcelizer;
import io.sentry.clientreport.RemoteActionCompatParcelizer;
import io.sentry.clientreport.serializer;
import io.sentry.internal.debugmeta.read;
import io.sentry.protocol.accessensureViewModelStore;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import io.sentry.util.MediaMetadataCompat;
import io.sentry.vendor.gson.stream.write;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.TextStreamsKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.FwFClientExtensionKtgetVariationsevalResults1;
import o.RegistryMissingComponentException;
import o.RequestBuilder;
import o.ShortNewsContentCardView;
import o._get_messageWebView_lambda1;
import o.accessgetRepeatAfterp;
import o.decode;
import o.defaultCardHandling;
import o.executelambda4;
import o.getCieXyz;
import o.getDateMillisOrDefault;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.getKind;
import o.getMessageTextView;
import o.getPrettyPrintedStringlambda0;
import o.getUnregisteredInAppMessageannotations;
import o.isArgString;
import o.isEqualTo;
import o.mergeJsonObjects;
import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;
import o.openUriWithActionViewFromPush;
import o.parseJsonObjectIntoBundle;
import o.prepareInAppMessageWithZippedAssetHtmllambda3;
import o.r8lambda1DLeNeBWPKsDsvf_XikspXtDEU;
import o.r8lambda7VEfmhucObW6FHAh05Peqg_b3XM;
import o.r8lambdaB2EfoRxiN347_5B93fxdQV0g;
import o.r8lambdaHL53mOUbuVah5vCttVWeQAIo3no;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I;
import o.r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8;
import o.r8lambdatmTe9dbjpRe9qF6mggphoyHct6s;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeNodeAtDepth;
import o.setBannerHeightlambda1;
import o.setGraphicModalMaxWidthDp;
import o.setMessageImageView;
import o.setNativeShader;
import o.setOnDismissCallback;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.useEvaluationsCache;
import o.writeSelffwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class OkHttpCall$1 implements FwFTrackingCallback, BrazeActionParserExternalSyntheticLambda0, isArgString, read, setBannerHeightlambda1, IconCompatParcelizer, useEvaluationsCache, setMessageImageView {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public Object serializer;
    public Object write;

    public OkHttpCall$1() {
        Level level = Level.FINE;
        Logger logger = Logger.getLogger(r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.class.getName());
        TextStreamsKt.serializer(level, "level");
        this.serializer = level;
        TextStreamsKt.serializer(logger, "logger");
        this.write = logger;
    }

    @Override // o.useEvaluationsCache
    public Type RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 49;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Type type = (Type) this.write;
        int i5 = i2 + 53;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = read + 121;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((SentryOptions) this.serializer).getOnDiscard();
            throw null;
        }
        ((SentryOptions) this.serializer).getOnDiscard();
        int i3 = read + 77;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public void read(mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        int i2 = read + 109;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((List) this.serializer).add(mergejsonobjects);
        int i4 = read + 7;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void write(mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        int i2 = read + 121;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((List) this.write).add(mergejsonobjects);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ((List) this.write).add(mergejsonobjects);
        int i3 = read + 99;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public OkHttpCall$1 RatingCompat() {
        int i = 2 % 2;
        int i2 = read + 17;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((write) this.write).IconCompatParcelizer(2, 4, (char) 1);
        } else {
            ((write) this.write).IconCompatParcelizer(3, 5, '}');
        }
        int i3 = IconCompatParcelizer + 125;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.useEvaluationsCache
    public Object write(writeSelffwf_client_release writeselffwf_client_release) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Executor executor = (Executor) this.serializer;
        if (executor == null) {
            return writeselffwf_client_release;
        }
        accessgetRepeatAfterp accessgetrepeatafterp = new accessgetRepeatAfterp(executor, writeselffwf_client_release);
        int i4 = read + 107;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return accessgetrepeatafterp;
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public void IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, String str, Object... objArr) {
        int i = 2 % 2;
        int i2 = read + 15;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = (BrazeActionParserExternalSyntheticLambda0) this.serializer;
        if (brazeActionParserExternalSyntheticLambda0 != null && RemoteActionCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco)) {
            int i3 = read + 81;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, str, objArr);
                int i4 = 11 / 0;
            } else {
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, str, objArr);
            }
        }
        int i5 = read + 109;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void read(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        int i = 2 % 2;
        setgraphicmodalmaxwidthdp.getClass();
        ((ArrayList) this.serializer).add(new onViewAttachedToWindowlambda0(r8lambdaucgighn8fiyv_vccodeafjfpedk, setgraphicmodalmaxwidthdp));
        int i2 = IconCompatParcelizer + 119;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public void serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 41;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = (BrazeActionParserExternalSyntheticLambda0) this.serializer;
        if (brazeActionParserExternalSyntheticLambda0 != null) {
            int i5 = i2 + 45;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (!(!RemoteActionCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco))) {
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdal32xcezw71g2xzeh1nm3nimxco, str, th);
            }
        }
        int i7 = read + 89;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setMessageImageView
    public void onFailure(getMessageTextView getmessagetextview, IOException iOException) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            ((FwFClientExtensionKtgetVariationsevalResults1) this.write).onFailure((writeSelffwf_client_release) this.serializer, iOException);
            int i4 = IconCompatParcelizer + 89;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
        } catch (Throwable th) {
            getKind.read(th);
            th.printStackTrace();
        }
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public void serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, Throwable th, String str, Object... objArr) {
        int i = 2 % 2;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = (BrazeActionParserExternalSyntheticLambda0) this.serializer;
        if (brazeActionParserExternalSyntheticLambda0 != null) {
            int i2 = read + 9;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                RemoteActionCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco);
                throw null;
            }
            if (RemoteActionCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco)) {
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdal32xcezw71g2xzeh1nm3nimxco, th, str, objArr);
            }
        }
        int i3 = IconCompatParcelizer + 121;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public void write(parseJsonObjectIntoBundle parsejsonobjectintobundle, Object obj) {
        int i = 2 % 2;
        if (((IdentityHashMap) this.serializer) == null) {
            this.serializer = new IdentityHashMap(1);
            int i2 = read + 71;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        ((IdentityHashMap) this.serializer).put(parsejsonobjectintobundle, obj);
        int i4 = read + 125;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public byte[] MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        if (((byte[]) this.write) == null) {
            int i2 = read + 43;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                this.write = (byte[]) ((Callable) this.serializer).call();
                int i3 = 71 / 0;
            } else {
                this.write = (byte[]) ((Callable) this.serializer).call();
            }
        }
        byte[] bArr = (byte[]) this.write;
        if (bArr != null) {
            int i4 = IconCompatParcelizer + 1;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return bArr;
        }
        byte[] bArr2 = new byte[0];
        int i6 = read + 87;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    public /* synthetic */ OkHttpCall$1(Object obj, Object obj2, boolean z) {
        this.serializer = obj;
        this.write = obj2;
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public boolean RemoteActionCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco) {
        int i = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.write;
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco diagnosticLevel = sentryOptions.getDiagnosticLevel();
        if (r8lambdal32xcezw71g2xzeh1nm3nimxco != null && sentryOptions.isDebug()) {
            int i2 = read + 109;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (r8lambdal32xcezw71g2xzeh1nm3nimxco.ordinal() >= diagnosticLevel.ordinal()) {
                int i4 = read + 71;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return false;
    }

    public void read(String str) {
        int i = 2 % 2;
        int i2 = read + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write writeVar = (write) this.write;
        writeVar.getClass();
        if (str != null) {
            int i4 = IconCompatParcelizer + 59;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (str.length() != 0) {
                writeVar.read = str;
                writeVar.MediaBrowserCompatMediaItem = ": ";
                return;
            }
        }
        writeVar.read = null;
        writeVar.MediaBrowserCompatMediaItem = ":";
    }

    public OkHttpCall$1(Writer writer, int i) {
        this.write = new write(writer);
        this.serializer = new JsonObjectSerializer(i);
    }

    public void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        int i = 2 % 2;
        int i2 = read + 93;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (remoteActionCompatParcelizer == null) {
            return;
        }
        Iterator it = remoteActionCompatParcelizer.read.iterator();
        while (!(!it.hasNext())) {
            int i4 = read + 93;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                io.sentry.clientreport.write writeVar = (io.sentry.clientreport.write) it.next();
                serializer(writeVar.read, writeVar.serializer, writeVar.IconCompatParcelizer);
                int i5 = 58 / 0;
            } else {
                io.sentry.clientreport.write writeVar2 = (io.sentry.clientreport.write) it.next();
                serializer(writeVar2.read, writeVar2.serializer, writeVar2.IconCompatParcelizer);
            }
        }
    }

    public boolean MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = read + 5;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Logger logger = (Logger) this.write;
        if (i3 != 0) {
            return logger.isLoggable((Level) this.serializer);
        }
        logger.isLoggable((Level) this.serializer);
        throw null;
    }

    public OkHttpCall$1(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk) {
        this.write = r8lambdaucgighn8fiyv_vccodeafjfpedk;
        this.serializer = new ArrayList();
    }

    public void serializer(String str, String str2, Long l) {
        int i = 2 % 2;
        AtomicLong atomicLong = (AtomicLong) ((Map) ((MediaMetadataCompat) ((SharedResourcePool) this.write).IconCompatParcelizer).IconCompatParcelizer()).get(new serializer(str, str2));
        if (atomicLong != null) {
            int i2 = read + 7;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                atomicLong.addAndGet(l.longValue());
                int i3 = 99 / 0;
            } else {
                atomicLong.addAndGet(l.longValue());
            }
            int i4 = read + 121;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    public OkHttpCall$1(SentryOptions sentryOptions) {
        this.serializer = sentryOptions;
        this.write = new SharedResourcePool(29);
    }

    public void RemoteActionCompatParcelizer(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm, long j) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (MediaBrowserCompatMediaItem()) {
            ((Logger) this.write).log((Level) this.serializer, r8lambda7vefmhucobw6fhah05peqg_b3xm + " PING: ack=false bytes=" + j);
            int i4 = read + 57;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    public OkHttpCall$1 write(String str) {
        int i = 2 % 2;
        write writeVar = (write) this.write;
        if (str == null) {
            writeVar.getClass();
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("name == null");
            return null;
        }
        if (writeVar.write != null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return null;
        }
        int i2 = read + 113;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (writeVar.MediaDescriptionCompat == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonWriter is closed.");
            return null;
        }
        int i4 = read + 105;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        writeVar.write = str;
        int i6 = IconCompatParcelizer + 21;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // io.sentry.clientreport.IconCompatParcelizer
    public void read(io.sentry.clientreport.read readVar, openUriWithActionViewFromPush openuriwithactionviewfrompush, long j) {
        int i = 2 % 2;
        int i2 = read + 27;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                serializer(readVar.getReason(), openuriwithactionviewfrompush.getCategory(), Long.valueOf(j));
                MediaMetadataCompat();
                int i3 = 31 / 0;
            } else {
                serializer(readVar.getReason(), openuriwithactionviewfrompush.getCategory(), Long.valueOf(j));
                MediaMetadataCompat();
            }
        } catch (Throwable th) {
            ((SentryOptions) this.serializer).getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.IconCompatParcelizer
    public void IconCompatParcelizer(io.sentry.clientreport.read readVar, openUriWithActionViewFromPush openuriwithactionviewfrompush) {
        int i = 2 % 2;
        int i2 = read + 27;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        read(readVar, openuriwithactionviewfrompush, i2 % 2 == 0 ? 0L : 1L);
    }

    @Override // com.deliveryhero.fwf_tracking.model.FwFTrackingCallback
    public void onEventReadyForTracking(TrackingEvent trackingEvent) {
        int i = 2 % 2;
        int i2 = read + 25;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        trackingEvent.getClass();
        if (((FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.serializer)).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.LRTMI_ANDROID_FWF_PERSEUS_TRACKING_ENABLED.getFirebaseFlagName())) {
            ((decode) this.write).logEvent(trackingEvent.getEventAction(), trackingEvent.getParams());
            int i4 = read + 25;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 31 / 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.FwFClientExtensionKtgetVariationsevalResults1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.syncCustomerProfile] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // o.setMessageImageView
    public void onResponse(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        ?? r1 = i2 % Fields.SpotShadowColor;
        read = r1;
        ?? r0 = i2 % 2;
        try {
            try {
                if (r0 != 0) {
                    FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1 = (FwFClientExtensionKtgetVariationsevalResults1) this.write;
                    writeSelffwf_client_release writeselffwf_client_release = (writeSelffwf_client_release) this.serializer;
                    fwFClientExtensionKtgetVariationsevalResults1.onResponse(writeselffwf_client_release, writeselffwf_client_release.read(_get_messagewebview_lambda1));
                    int i3 = 16 / 0;
                    r1 = writeselffwf_client_release;
                } else {
                    FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults2 = (FwFClientExtensionKtgetVariationsevalResults1) this.write;
                    writeSelffwf_client_release writeselffwf_client_release2 = (writeSelffwf_client_release) this.serializer;
                    fwFClientExtensionKtgetVariationsevalResults2.onResponse(writeselffwf_client_release2, writeselffwf_client_release2.read(_get_messagewebview_lambda1));
                    r1 = writeselffwf_client_release2;
                }
                int i4 = IconCompatParcelizer + 37;
                r0 = i4 % Fields.SpotShadowColor;
                read = r0;
                if (i4 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th) {
                getKind.read(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            getKind.read(th2);
            try {
                r0.onFailure(r1, th2);
            } catch (Throwable th3) {
                getKind.read(th3);
                th3.printStackTrace();
            }
        }
    }

    public OkHttpCall$1(setOnDismissCallback setondismisscallback, List list) {
        setNativeShader.read(setondismisscallback, "SentryEnvelopeHeader is required.");
        this.write = setondismisscallback;
        setNativeShader.read(list, "SentryEnvelope items are required.");
        this.serializer = list;
    }

    public void write(prepareInAppMessageWithZippedAssetHtmllambda3 prepareinappmessagewithzippedassethtmllambda3) {
        Iterator it;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            it = ((ArrayList) this.serializer).iterator();
            int i3 = 84 / 0;
        } else {
            it = ((ArrayList) this.serializer).iterator();
        }
        while (it.hasNext()) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) it.next();
            getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations = (getUnregisteredInAppMessageannotations) onviewattachedtowindowlambda0.serializer;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) onviewattachedtowindowlambda0.write;
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = (r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) this.write;
            getunregisteredinappmessageannotations.getClass();
            setgraphicmodalmaxwidthdp.getClass();
            prepareInAppMessageWithZippedAssetHtmllambda3.read(prepareinappmessagewithzippedassethtmllambda3, r8lambdaucgighn8fiyv_vccodeafjfpedk, getunregisteredinappmessageannotations, setgraphicmodalmaxwidthdp);
        }
        int i4 = IconCompatParcelizer + 7;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public OkHttpCall$1(defaultCardHandling defaultcardhandling, Double d) {
        this.write = defaultcardhandling;
        this.serializer = d;
        Map map = Collections.EMPTY_MAP;
    }

    public OkHttpCall$1 write() throws IOException {
        int i = 2 % 2;
        int i2 = read + 3;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write writeVar = (write) this.write;
        writeVar.IconCompatParcelizer();
        writeVar.serializer();
        int i4 = writeVar.MediaDescriptionCompat;
        int[] iArr = writeVar.MediaMetadataCompat;
        if (i4 == iArr.length) {
            int i5 = read + 15;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            writeVar.MediaMetadataCompat = Arrays.copyOf(iArr, i4 * 2);
            int i7 = read + 55;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        int[] iArr2 = writeVar.MediaMetadataCompat;
        int i9 = writeVar.MediaDescriptionCompat;
        writeVar.MediaDescriptionCompat = i9 + 1;
        iArr2[i9] = 3;
        writeVar.serializer.write(123);
        return this;
    }

    public void IconCompatParcelizer(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm, int i, long j) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 7;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (MediaBrowserCompatMediaItem()) {
            ((Logger) this.write).log((Level) this.serializer, r8lambda7vefmhucobw6fhah05peqg_b3xm + " WINDOW_UPDATE: streamId=" + i + " windowSizeIncrement=" + j);
            int i5 = read + 13;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    public void read(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm, int i, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6s) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 67;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (MediaBrowserCompatMediaItem()) {
            ((Logger) this.write).log((Level) this.serializer, r8lambda7vefmhucobw6fhah05peqg_b3xm + " RST_STREAM: streamId=" + i + " errorCode=" + r8lambdatmte9dbjpre9qf6mggphoyhct6s);
        }
        int i5 = read + 77;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public /* synthetic */ OkHttpCall$1(Object obj, Object obj2) {
        this.write = obj;
        this.serializer = obj2;
    }

    public static String RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException) {
        int i = 2 % 2;
        int i2 = read + 49;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j = registryMissingComponentException.size;
        if (j <= 64) {
            int i4 = read + 99;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return registryMissingComponentException.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg().IconCompatParcelizer();
            }
            registryMissingComponentException.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg().IconCompatParcelizer();
            throw null;
        }
        String str = registryMissingComponentException.write((int) Math.min(j, 64L)).IconCompatParcelizer() + "...";
        int i5 = read + 45;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public OkHttpCall$1(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4, SentryEnvelopeItem sentryEnvelopeItem) {
        this.write = new setOnDismissCallback(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaxj9c8vip9dfevatmzt0ejauc4a4, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(sentryEnvelopeItem);
        this.serializer = arrayList;
    }

    @Override // io.sentry.clientreport.IconCompatParcelizer
    public void IconCompatParcelizer(io.sentry.clientreport.read readVar, OkHttpCall$1 okHttpCall$1) {
        int i = 2 % 2;
        if (okHttpCall$1 == null) {
            int i2 = IconCompatParcelizer + 31;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            try {
                Iterator it = ((Iterable) okHttpCall$1.serializer).iterator();
                while (!(!it.hasNext())) {
                    int i4 = IconCompatParcelizer + 53;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        RemoteActionCompatParcelizer(readVar, (SentryEnvelopeItem) it.next());
                    } else {
                        RemoteActionCompatParcelizer(readVar, (SentryEnvelopeItem) it.next());
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            } catch (Throwable th) {
                ((SentryOptions) this.serializer).getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Unable to record lost envelope.", new Object[0]);
                return;
            }
        }
        int i5 = IconCompatParcelizer + 21;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public OkHttpCall$1(getPrettyPrintedStringlambda0 getprettyprintedstringlambda0) {
        this.write = getprettyprintedstringlambda0;
    }

    public OkHttpCall$1(Callable callable) {
        this.serializer = callable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r2.equals("NaN") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public retrofit2.OkHttpCall$1 RemoteActionCompatParcelizer(java.lang.Number r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = retrofit2.OkHttpCall$1.read
            int r1 = r1 + 31
            int r2 = r1 % 128
            retrofit2.OkHttpCall$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            java.lang.Object r1 = r5.write
            io.sentry.vendor.gson.stream.write r1 = (io.sentry.vendor.gson.stream.write) r1
            if (r6 != 0) goto L16
            r1.RemoteActionCompatParcelizer()
            return r5
        L16:
            r1.IconCompatParcelizer()
            java.lang.String r2 = r6.toString()
            boolean r3 = r1.RemoteActionCompatParcelizer
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == r4) goto L24
            goto L4f
        L24:
            int r3 = retrofit2.OkHttpCall$1.IconCompatParcelizer
            int r3 = r3 + 61
            int r4 = r3 % 128
            retrofit2.OkHttpCall$1.read = r4
            int r3 = r3 % r0
            java.lang.String r3 = "-Infinity"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L36
            goto L58
        L36:
            java.lang.String r3 = "Infinity"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L58
            int r3 = retrofit2.OkHttpCall$1.read
            int r3 = r3 + 91
            int r4 = r3 % 128
            retrofit2.OkHttpCall$1.IconCompatParcelizer = r4
            int r3 = r3 % r0
            java.lang.String r0 = "NaN"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L58
        L4f:
            r1.serializer()
            java.io.Writer r6 = r1.serializer
            r6.append(r2)
            return r5
        L58:
            java.lang.String r0 = "Numeric values must be finite, but was "
            com.google.gson.Gson$$ExternalSyntheticBUOutline0.m(r6, r0)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.OkHttpCall$1.RemoteActionCompatParcelizer(java.lang.Number):retrofit2.OkHttpCall$1");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b6  */
    public getIntentArrayWithConfiguredBackStacklambda1 read(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1, executelambda4 executelambda4Var) {
        Object obj;
        io.sentry.util.network.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        int i = 2 % 2;
        getintentarraywithconfiguredbackstacklambda1.getClass();
        setBannerHeightlambda1 setbannerheightlambda1 = (setBannerHeightlambda1) this.write;
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda2 = setbannerheightlambda1 != null ? ((OkHttpCall$1) setbannerheightlambda1).read(getintentarraywithconfiguredbackstacklambda1, executelambda4Var) : getintentarraywithconfiguredbackstacklambda1;
        if (getintentarraywithconfiguredbackstacklambda2 != null) {
            io.sentry.android.replay.serializer serializerVar = (io.sentry.android.replay.serializer) this.serializer;
            Object obj2 = null;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda2.MediaSessionCompatQueueItem, "http"}, getCieXyz.write())).booleanValue()) {
                int i2 = read + 77;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda2.write, "http"}, getCieXyz.write())).booleanValue();
                    obj2.hashCode();
                    throw null;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda2.write, "http"}, getCieXyz.write())).booleanValue()) {
                    obj = executelambda4Var.read("sentry:replayNetworkDetails");
                    if (obj instanceof io.sentry.util.network.RemoteActionCompatParcelizer) {
                        remoteActionCompatParcelizer = (io.sentry.util.network.RemoteActionCompatParcelizer) obj;
                    }
                } else {
                    int i3 = read + 93;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                }
                remoteActionCompatParcelizer = null;
            } else {
                obj = executelambda4Var.read("sentry:replayNetworkDetails");
                if (obj instanceof io.sentry.util.network.RemoteActionCompatParcelizer) {
                    remoteActionCompatParcelizer = (io.sentry.util.network.RemoteActionCompatParcelizer) obj;
                } else {
                    remoteActionCompatParcelizer = null;
                }
            }
            if (remoteActionCompatParcelizer != null) {
                int i5 = IconCompatParcelizer + 23;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    Map map = serializerVar.IconCompatParcelizer;
                    map.getClass();
                    map.put(getintentarraywithconfiguredbackstacklambda2, remoteActionCompatParcelizer);
                    obj2.hashCode();
                    throw null;
                }
                Map map2 = serializerVar.IconCompatParcelizer;
                map2.getClass();
                map2.put(getintentarraywithconfiguredbackstacklambda2, remoteActionCompatParcelizer);
            }
        }
        return getintentarraywithconfiguredbackstacklambda2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033 A[PHI: r1
  0x0033: PHI (r1v7 java.io.Writer) = (r1v6 java.io.Writer), (r1v12 java.io.Writer) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r1
  0x0030: PHI (r1v9 java.io.Writer) = (r1v6 java.io.Writer), (r1v12 java.io.Writer) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public OkHttpCall$1 write(boolean z) throws IOException {
        Writer writer;
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            write writeVar = (write) this.write;
            writeVar.IconCompatParcelizer();
            writeVar.serializer();
            writer = writeVar.serializer;
            int i3 = 81 / 0;
            if (z) {
                int i4 = IconCompatParcelizer + 61;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                str = "true";
            } else {
                str = "false";
            }
        } else {
            write writeVar2 = (write) this.write;
            writeVar2.IconCompatParcelizer();
            writeVar2.serializer();
            writer = writeVar2.serializer;
            if (!z) {
                str = "false";
            } else {
                int i6 = IconCompatParcelizer + 61;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                str = "true";
            }
        }
        writer.write(str);
        return this;
    }

    public void write(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm, int i, RegistryMissingComponentException registryMissingComponentException, int i2, boolean z) {
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 55;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (MediaBrowserCompatMediaItem()) {
            ((Logger) this.write).log((Level) this.serializer, r8lambda7vefmhucobw6fhah05peqg_b3xm + " DATA: streamId=" + i + " endStream=" + z + " length=" + i2 + " bytes=" + RemoteActionCompatParcelizer(registryMissingComponentException));
            int i6 = IconCompatParcelizer + 111;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    public OkHttpCall$1 serializer(Boolean bool) throws IOException {
        String str;
        int i = 2 % 2;
        int i2 = read + 75;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write writeVar = (write) this.write;
        if (bool == null) {
            writeVar.RemoteActionCompatParcelizer();
            int i4 = read + 61;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 91 / 0;
            }
            return this;
        }
        writeVar.IconCompatParcelizer();
        writeVar.serializer();
        Writer writer = writeVar.serializer;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            int i6 = read + 107;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            str = "false";
        }
        writer.write(str);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r3
  0x002b: PHI (r1v12 com.roadrunner.rider.state.onpause.data.EndBreakRepository$endBreak$1) = 
  (r1v11 com.roadrunner.rider.state.onpause.data.EndBreakRepository$endBreak$1)
  (r1v14 com.roadrunner.rider.state.onpause.data.EndBreakRepository$endBreak$1)
 binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r3v3 int) = (r3v2 int), (r3v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX INFO: renamed from: endBreak-IoAF18A, reason: not valid java name */
    public Object m5199endBreakIoAF18A(ContinuationImpl continuationImpl) {
        EndBreakRepository$endBreak$1 endBreakRepository$endBreak$1;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof EndBreakRepository$endBreak$1) {
            int i3 = IconCompatParcelizer + 115;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                endBreakRepository$endBreak$1 = (EndBreakRepository$endBreak$1) continuationImpl;
                i = endBreakRepository$endBreak$1.read;
                int i4 = 40 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i5 = read + 115;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    endBreakRepository$endBreak$1.read = i - Integer.MIN_VALUE;
                } else {
                    endBreakRepository$endBreak$1 = new EndBreakRepository$endBreak$1(this, continuationImpl);
                    int i7 = IconCompatParcelizer + 65;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
            } else {
                endBreakRepository$endBreak$1 = (EndBreakRepository$endBreak$1) continuationImpl;
                i = endBreakRepository$endBreak$1.read;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i9 = read + 115;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    endBreakRepository$endBreak$1.read = i - Integer.MIN_VALUE;
                } else {
                    endBreakRepository$endBreak$1 = new EndBreakRepository$endBreak$1(this, continuationImpl);
                    int i11 = IconCompatParcelizer + 65;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                }
            }
        } else {
            endBreakRepository$endBreak$1 = new EndBreakRepository$endBreak$1(this, continuationImpl);
            int i13 = IconCompatParcelizer + 65;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        Object obj = endBreakRepository$endBreak$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = endBreakRepository$endBreak$1.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i15 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.serializer;
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 22);
            endBreakRepository$endBreak$1.read = 1;
            Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(mapboxNavigation$parsing$2, endBreakRepository$endBreak$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        if (i15 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i16 = IconCompatParcelizer + 53;
        read = i16 % Fields.SpotShadowColor;
        int i17 = i16 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return ((onItemDismiss) obj).IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX INFO: renamed from: stopWorking-IoAF18A, reason: not valid java name */
    public Object m5200stopWorkingIoAF18A(ContinuationImpl continuationImpl) {
        AvailabilityRepository$stopWorking$1 availabilityRepository$stopWorking$1;
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!(continuationImpl instanceof AvailabilityRepository$stopWorking$1)) {
            availabilityRepository$stopWorking$1 = new AvailabilityRepository$stopWorking$1(this, continuationImpl);
        } else {
            int i2 = read + 113;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((AvailabilityRepository$stopWorking$1) continuationImpl).IconCompatParcelizer;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            availabilityRepository$stopWorking$1 = (AvailabilityRepository$stopWorking$1) continuationImpl;
            int i4 = availabilityRepository$stopWorking$1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 55;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                availabilityRepository$stopWorking$1.IconCompatParcelizer = i5 % 2 == 0 ? i4 * Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                availabilityRepository$stopWorking$1 = new AvailabilityRepository$stopWorking$1(this, continuationImpl);
            }
        }
        Object obj = availabilityRepository$stopWorking$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = availabilityRepository$stopWorking$1.IconCompatParcelizer;
        if (i6 != 0) {
            int i7 = read + 65;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? i6 != 1 : i6 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.serializer;
        MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 27);
        availabilityRepository$stopWorking$1.IconCompatParcelizer = 1;
        Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(mapboxNavigation$parsing$2, availabilityRepository$stopWorking$1);
        if (objM4875invokegIAlus != coroutineSingletons) {
            return objM4875invokegIAlus;
        }
        int i8 = IconCompatParcelizer + 69;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return coroutineSingletons;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (java.lang.Double.isInfinite(r5) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public retrofit2.OkHttpCall$1 write(double r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = retrofit2.OkHttpCall$1.read
            int r1 = r1 + 33
            int r2 = r1 % 128
            retrofit2.OkHttpCall$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            java.lang.Object r1 = r4.write
            io.sentry.vendor.gson.stream.write r1 = (io.sentry.vendor.gson.stream.write) r1
            r1.IconCompatParcelizer()
            boolean r2 = r1.RemoteActionCompatParcelizer
            if (r2 != 0) goto L34
            boolean r2 = java.lang.Double.isNaN(r5)
            if (r2 != 0) goto L2d
            int r2 = retrofit2.OkHttpCall$1.read
            int r2 = r2 + 35
            int r3 = r2 % 128
            retrofit2.OkHttpCall$1.IconCompatParcelizer = r3
            int r2 = r2 % r0
            boolean r0 = java.lang.Double.isInfinite(r5)
            if (r0 != 0) goto L2d
            goto L34
        L2d:
            java.lang.String r0 = "Numeric values must be finite, but was "
            io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1.read(r0, r5)
            r5 = 0
            return r5
        L34:
            r1.serializer()
            java.io.Writer r0 = r1.serializer
            java.lang.String r5 = java.lang.Double.toString(r5)
            r0.append(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.OkHttpCall$1.write(double):retrofit2.OkHttpCall$1");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public void serializer(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm, int i, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6s, RequestBuilder requestBuilder) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 7;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
            if (MediaBrowserCompatMediaItem()) {
                Logger logger = (Logger) this.write;
                Level level = (Level) this.serializer;
                StringBuilder sb = new StringBuilder();
                sb.append(r8lambda7vefmhucobw6fhah05peqg_b3xm);
                sb.append(" GO_AWAY: lastStreamId=");
                sb.append(i);
                sb.append(" errorCode=");
                sb.append(r8lambdatmte9dbjpre9qf6mggphoyhct6s);
                sb.append(" length=");
                sb.append(requestBuilder.serializer());
                sb.append(" bytes=");
                RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                registryMissingComponentException.serializer(requestBuilder);
                sb.append(RemoteActionCompatParcelizer(registryMissingComponentException));
                logger.log(level, sb.toString());
            }
        } else if (MediaBrowserCompatMediaItem()) {
            Logger logger2 = (Logger) this.write;
            Level level2 = (Level) this.serializer;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(r8lambda7vefmhucobw6fhah05peqg_b3xm);
            sb2.append(" GO_AWAY: lastStreamId=");
            sb2.append(i);
            sb2.append(" errorCode=");
            sb2.append(r8lambdatmte9dbjpre9qf6mggphoyhct6s);
            sb2.append(" length=");
            sb2.append(requestBuilder.serializer());
            sb2.append(" bytes=");
            RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
            registryMissingComponentException2.serializer(requestBuilder);
            sb2.append(RemoteActionCompatParcelizer(registryMissingComponentException2));
            logger2.log(level2, sb2.toString());
        }
        int i5 = read + 113;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
    }

    public OkHttpCall$1 IconCompatParcelizer(long j) throws IOException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write writeVar = (write) this.write;
        writeVar.IconCompatParcelizer();
        writeVar.serializer();
        writeVar.serializer.write(Long.toString(j));
        int i4 = read + 53;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getPrettyPrintedStringlambda0 read() {
        int i = 2 % 2;
        if (((IdentityHashMap) this.serializer) != null) {
            int i2 = IconCompatParcelizer + 103;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Iterator it = ((getPrettyPrintedStringlambda0) this.write).read.entrySet().iterator();
            int i4 = IconCompatParcelizer + 121;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            while (!(!it.hasNext())) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!((IdentityHashMap) this.serializer).containsKey(entry.getKey())) {
                    int i6 = read + 121;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    ((IdentityHashMap) this.serializer).put((parseJsonObjectIntoBundle) entry.getKey(), entry.getValue());
                }
            }
            this.write = new getPrettyPrintedStringlambda0((IdentityHashMap) this.serializer);
            this.serializer = null;
        }
        return (getPrettyPrintedStringlambda0) this.write;
    }

    public isEqualTo serializer() {
        int i = 2 % 2;
        isEqualTo isequalto = new isEqualTo((List) this.write, (List) this.serializer);
        int i2 = IconCompatParcelizer + 107;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return isequalto;
    }

    public OkHttpCall$1 IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = read + 87;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write writeVar = (write) this.write;
        if (str == null) {
            writeVar.RemoteActionCompatParcelizer();
            int i4 = IconCompatParcelizer + 61;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return this;
        }
        writeVar.IconCompatParcelizer();
        writeVar.serializer();
        writeVar.RemoteActionCompatParcelizer(str);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    @Override // io.sentry.internal.debugmeta.read
    public List IconCompatParcelizer() {
        int i;
        int i2 = 2 % 2;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = (BrazeActionParserExternalSyntheticLambda0) this.serializer;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.write).getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "%s file was not found.", "sentry-debug-meta.properties");
            i = read + 49;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i3 = 0 / 0;
            }
            return null;
        } catch (IOException e) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting Proguard UUIDs.", e);
            i = read + 49;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i4 = 0 / 0;
            }
            return null;
        } catch (RuntimeException e2) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e2, "%s file is malformed.", "sentry-debug-meta.properties");
            i = read + 49;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i5 = 0 / 0;
            }
            return null;
        }
    }

    public void read(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm, getDateMillisOrDefault getdatemillisordefault) {
        int i = 2 % 2;
        int i2 = read + 101;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            MediaBrowserCompatMediaItem();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (MediaBrowserCompatMediaItem()) {
            Logger logger = (Logger) this.write;
            Level level = (Level) this.serializer;
            StringBuilder sb = new StringBuilder();
            sb.append(r8lambda7vefmhucobw6fhah05peqg_b3xm);
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(r8lambdaHL53mOUbuVah5vCttVWeQAIo3no.class);
            r8lambdaHL53mOUbuVah5vCttVWeQAIo3no[] r8lambdahl53moubuvah5vcttvweqaio3noArrValues = r8lambdaHL53mOUbuVah5vCttVWeQAIo3no.values();
            int length = r8lambdahl53moubuvah5vcttvweqaio3noArrValues.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = IconCompatParcelizer + 95;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                r8lambdaHL53mOUbuVah5vCttVWeQAIo3no r8lambdahl53moubuvah5vcttvweqaio3no = r8lambdahl53moubuvah5vcttvweqaio3noArrValues[i3];
                if (!(!getdatemillisordefault.write(r8lambdahl53moubuvah5vcttvweqaio3no.getBit()))) {
                    int i6 = read + 109;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        enumMap.put(r8lambdahl53moubuvah5vcttvweqaio3no, Integer.valueOf(getdatemillisordefault.read[r8lambdahl53moubuvah5vcttvweqaio3no.getBit()]));
                        int i7 = 7 / 0;
                    } else {
                        enumMap.put(r8lambdahl53moubuvah5vcttvweqaio3no, Integer.valueOf(getdatemillisordefault.read[r8lambdahl53moubuvah5vcttvweqaio3no.getBit()]));
                    }
                }
                i3++;
                int i8 = IconCompatParcelizer + 125;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
            sb.append(enumMap.toString());
            logger.log(level, sb.toString());
        }
    }

    public OkHttpCall$1 serializer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, Object obj) {
        int i = 2 % 2;
        int i2 = read + 119;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((JsonObjectSerializer) this.serializer).read(this, brazeActionParserExternalSyntheticLambda0, obj);
        int i4 = read + 11;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d A[PHI: r1 r4
  0x002d: PHI (r1v13 o.r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo) = (r1v12 o.r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo), (r1v15 o.r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo) binds: [B:10:0x002b, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:10:0x002b, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r10.invoke(r1) == r3) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r10 instanceof o.r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L31
            int r1 = retrofit2.OkHttpCall$1.read
            int r1 = r1 + 113
            int r3 = r1 % 128
            retrofit2.OkHttpCall$1.IconCompatParcelizer = r3
            int r1 = r1 % r0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L24
            r1 = r10
            o.r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo r1 = (o.r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo) r1
            int r4 = r1.read
            r5 = r4 & r3
            r6 = 65
            int r6 = r6 / 0
            if (r5 == 0) goto L31
            goto L2d
        L24:
            r1 = r10
            o.r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo r1 = (o.r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo) r1
            int r4 = r1.read
            r5 = r4 & r3
            if (r5 == 0) goto L31
        L2d:
            int r4 = r4 + r3
            r1.read = r4
            goto L3f
        L31:
            o.r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo r1 = new o.r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo
            r1.<init>(r9, r10)
            int r10 = retrofit2.OkHttpCall$1.IconCompatParcelizer
            int r10 = r10 + 81
            int r3 = r10 % 128
            retrofit2.OkHttpCall$1.read = r3
            int r10 = r10 % r0
        L3f:
            java.lang.Object r10 = r1.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.read
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            if (r4 == 0) goto L6c
            int r6 = retrofit2.OkHttpCall$1.read
            int r7 = r6 + 67
            int r8 = r7 % 128
            retrofit2.OkHttpCall$1.IconCompatParcelizer = r8
            int r7 = r7 % r0
            if (r4 == r2) goto L68
            int r6 = r6 + 15
            int r1 = r6 % 128
            retrofit2.OkHttpCall$1.IconCompatParcelizer = r1
            int r6 = r6 % r0
            if (r4 != r0) goto L61
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            return r5
        L61:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            r10 = 0
            return r10
        L68:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L89
        L6c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            java.lang.Object r10 = r9.write
            com.roadrunner.sidemenu.data.SideMenuRepository r10 = (com.roadrunner.sidemenu.data.SideMenuRepository) r10
            kotlinx.coroutines.flow.Flow r10 = r10.read()
            r1.read = r2
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r10, r1)
            if (r10 != r3) goto L89
            int r10 = retrofit2.OkHttpCall$1.IconCompatParcelizer
            int r10 = r10 + 107
            int r1 = r10 % 128
            retrofit2.OkHttpCall$1.read = r1
            int r10 = r10 % r0
            goto L97
        L89:
            if (r10 != 0) goto La1
            java.lang.Object r10 = r9.serializer
            com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl r10 = (com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl) r10
            r1.read = r0
            java.lang.Object r10 = r10.invoke(r1)
            if (r10 != r3) goto La1
        L97:
            int r10 = retrofit2.OkHttpCall$1.read
            int r10 = r10 + 43
            int r1 = r10 % 128
            retrofit2.OkHttpCall$1.IconCompatParcelizer = r1
            int r10 = r10 % r0
            return r3
        La1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.OkHttpCall$1.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static openUriWithActionViewFromPush read(r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g) {
        int i = 2 % 2;
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.Event.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            return openUriWithActionViewFromPush.Error;
        }
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.Session.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            return openUriWithActionViewFromPush.Session;
        }
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.Transaction.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            int i2 = IconCompatParcelizer + 41;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return openUriWithActionViewFromPush.Transaction;
        }
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.UserFeedback.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            return openUriWithActionViewFromPush.UserReport;
        }
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.Feedback.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            int i4 = read + 93;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return openUriWithActionViewFromPush.Feedback;
        }
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.Profile.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            return openUriWithActionViewFromPush.Profile;
        }
        Object obj = null;
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.ProfileChunk.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            int i6 = read + 103;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return openUriWithActionViewFromPush.ProfileChunkUi;
            }
            openUriWithActionViewFromPush openuriwithactionviewfrompush = openUriWithActionViewFromPush.ProfileChunkUi;
            obj.hashCode();
            throw null;
        }
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.Attachment.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            int i7 = IconCompatParcelizer + 89;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return openUriWithActionViewFromPush.Attachment;
            }
            openUriWithActionViewFromPush openuriwithactionviewfrompush2 = openUriWithActionViewFromPush.Attachment;
            throw null;
        }
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.CheckIn.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            openUriWithActionViewFromPush openuriwithactionviewfrompush3 = openUriWithActionViewFromPush.Monitor;
            int i8 = IconCompatParcelizer + 97;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return openuriwithactionviewfrompush3;
        }
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.ReplayVideo.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            return openUriWithActionViewFromPush.Replay;
        }
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.Log.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            return openUriWithActionViewFromPush.LogItem;
        }
        if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.Span.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
            return openUriWithActionViewFromPush.Span;
        }
        return r8lambdaB2EfoRxiN347_5B93fxdQV0g.TraceMetric.equals(r8lambdab2eforxin347_5b93fxdqv0g) ? openUriWithActionViewFromPush.TraceMetric : openUriWithActionViewFromPush.Default;
    }

    @Override // io.sentry.clientreport.IconCompatParcelizer
    public OkHttpCall$1 write(OkHttpCall$1 okHttpCall$1) {
        int i = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.serializer;
        Date dateSerializer = setNativeShader.serializer();
        SharedResourcePool sharedResourcePool = (SharedResourcePool) this.write;
        sharedResourcePool.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((MediaMetadataCompat) sharedResourcePool.IconCompatParcelizer).IconCompatParcelizer()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            if (andSet > 0) {
                arrayList.add(new io.sentry.clientreport.write(((serializer) entry.getKey()).RemoteActionCompatParcelizer, ((serializer) entry.getKey()).IconCompatParcelizer, Long.valueOf(andSet)));
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = arrayList.isEmpty() ? null : new RemoteActionCompatParcelizer(dateSerializer, arrayList);
        if (remoteActionCompatParcelizer == null) {
            int i2 = IconCompatParcelizer + 25;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return okHttpCall$1;
            }
            throw null;
        }
        try {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) okHttpCall$1.serializer).iterator();
            while (it.hasNext()) {
                int i3 = read + 75;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                arrayList2.add((SentryEnvelopeItem) it.next());
            }
            arrayList2.add(SentryEnvelopeItem.IconCompatParcelizer(sentryOptions.getSerializer(), remoteActionCompatParcelizer));
            return new OkHttpCall$1((setOnDismissCallback) okHttpCall$1.write, (List) arrayList2);
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return okHttpCall$1;
        }
    }

    @Override // io.sentry.clientreport.IconCompatParcelizer
    public void RemoteActionCompatParcelizer(io.sentry.clientreport.read readVar, SentryEnvelopeItem sentryEnvelopeItem) {
        int i = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.serializer;
        if (sentryEnvelopeItem == null) {
            return;
        }
        try {
            r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g = sentryEnvelopeItem.RemoteActionCompatParcelizer.MediaMetadataCompat;
            Object obj = null;
            if (r8lambdaB2EfoRxiN347_5B93fxdQV0g.ClientReport.equals(r8lambdab2eforxin347_5b93fxdqv0g)) {
                int i2 = IconCompatParcelizer + 21;
                read = i2 % Fields.SpotShadowColor;
                try {
                    if (i2 % 2 == 0) {
                        IconCompatParcelizer(sentryEnvelopeItem.read(sentryOptions.getSerializer()));
                        return;
                    } else {
                        IconCompatParcelizer(sentryEnvelopeItem.read(sentryOptions.getSerializer()));
                        obj.hashCode();
                        throw null;
                    }
                } catch (Exception unused) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            openUriWithActionViewFromPush openuriwithactionviewfrompush = read(r8lambdab2eforxin347_5b93fxdqv0g);
            if (openuriwithactionviewfrompush.equals(openUriWithActionViewFromPush.Transaction)) {
                accessensureViewModelStore accessensureviewmodelstoreRemoteActionCompatParcelizer = sentryEnvelopeItem.RemoteActionCompatParcelizer(sentryOptions.getSerializer());
                if (accessensureviewmodelstoreRemoteActionCompatParcelizer != null) {
                    ArrayList arrayList = accessensureviewmodelstoreRemoteActionCompatParcelizer.ComponentActivity;
                    serializer(readVar.getReason(), openUriWithActionViewFromPush.Span.getCategory(), Long.valueOf(((long) arrayList.size()) + 1));
                    arrayList.size();
                    MediaMetadataCompat();
                }
                serializer(readVar.getReason(), openuriwithactionviewfrompush.getCategory(), (Long) 1L);
                MediaMetadataCompat();
                return;
            }
            if (openuriwithactionviewfrompush.equals(openUriWithActionViewFromPush.LogItem)) {
                r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I r8lambdapr0zohngrdffbcgpp9owzbum0iWrite = sentryEnvelopeItem.write(sentryOptions.getSerializer());
                if (r8lambdapr0zohngrdffbcgpp9owzbum0iWrite == null) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                int i3 = read + 47;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                serializer(readVar.getReason(), openuriwithactionviewfrompush.getCategory(), Long.valueOf(r8lambdapr0zohngrdffbcgpp9owzbum0iWrite.IconCompatParcelizer.size()));
                serializer(readVar.getReason(), openUriWithActionViewFromPush.LogByte.getCategory(), Long.valueOf(sentryEnvelopeItem.IconCompatParcelizer().length));
                MediaMetadataCompat();
                return;
            }
            if (!openuriwithactionviewfrompush.equals(openUriWithActionViewFromPush.TraceMetric)) {
                serializer(readVar.getReason(), openuriwithactionviewfrompush.getCategory(), (Long) 1L);
                MediaMetadataCompat();
                return;
            }
            int i5 = read + 89;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                sentryEnvelopeItem.serializer(sentryOptions.getSerializer());
                obj.hashCode();
                throw null;
            }
            r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8 r8lambdaezx9vf3n2mjvwrdqvqgqjgg8Serializer = sentryEnvelopeItem.serializer(sentryOptions.getSerializer());
            if (r8lambdaezx9vf3n2mjvwrdqvqgqjgg8Serializer == null) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            serializer(readVar.getReason(), openuriwithactionviewfrompush.getCategory(), Long.valueOf(r8lambdaezx9vf3n2mjvwrdqvqgqjgg8Serializer.serializer.size()));
            MediaMetadataCompat();
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    public OkHttpCall$1(int i) {
    }
}
