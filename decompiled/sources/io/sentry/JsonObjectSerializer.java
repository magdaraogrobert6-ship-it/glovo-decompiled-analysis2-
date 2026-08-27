package io.sentry;

import android.media.AudioAttributes;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import io.sentry.android.core.ParcelableVolumeInfo;
import io.sentry.featureflags.write;
import io.sentry.protocol.MediaBrowserCompatMediaItem;
import io.sentry.transport.ResultReceiver;
import io.sentry.util.RemoteActionCompatParcelizer;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AddToCustomAttributeArrayStep;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.CSSParseException;
import o.InAppMessageHtmlBaseViewmessageWebView6;
import o.RequestPushPermissionStep;
import o.accessgetDefaultHandlercp;
import o.configureWebView;
import o.dismissBannerlambda1;
import o.enableSdk;
import o.executelambda2;
import o.getCieXyz;
import o.getFeatureFlaglambda0;
import o.getProvidedCachefwf_client_release;
import o.hasTooManyZipEntrieslambda0;
import o.inCompatibilityMode;
import o.isArgOptionalJsonObject;
import o.loadHtmlData;
import o.logPushDeliverylambda1;
import o.logPushMaxCampaignlambda0;
import o.logPushNotificationActionClickedlambda0;
import o.logPushNotificationActionClickedlambda1;
import o.logPushNotificationActionClickedlambda10;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4;
import o.removeNodeAtDepth;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonObjectSerializer implements accessgetDefaultHandlercp, configureWebView, write {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int $r8$classId;
    public Object jsonReflectionObjectSerializer;

    public void serializer(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, byte[] bArr) {
        executelambda2.serializer();
        try {
            String str = "/" + ((String) ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this.jsonReflectionObjectSerializer).PlaybackStateCompatCustomAction.MediaBrowserCompatMediaItem);
            if (bArr != null) {
                ((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this.jsonReflectionObjectSerializer).PlaybackStateCompat = true;
                str = str + "?" + BaseEncoding$StandardBaseEncoding.IconCompatParcelizer.serializer(bArr);
            }
            synchronized (((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this.jsonReflectionObjectSerializer).ParcelableVolumeInfo.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4.write(((r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) this.jsonReflectionObjectSerializer).ParcelableVolumeInfo, r8lambdaqn1du6uas6agx4srbugfttxtpwa, str);
            }
            executelambda2.serializer.getClass();
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public JsonObjectSerializer(byte b, int i) {
        this.$r8$classId = i;
        if (i == 7) {
            this.jsonReflectionObjectSerializer = new AtomicLong();
            return;
        }
        if (i != 15) {
            if (i == 12) {
                this.jsonReflectionObjectSerializer = new RemoteActionCompatParcelizer();
            } else if (i != 13) {
                this.jsonReflectionObjectSerializer = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
            } else {
                this.jsonReflectionObjectSerializer = new ResultReceiver();
            }
        }
    }

    public void serializer(getProvidedCachefwf_client_release getprovidedcachefwf_client_release, String str) {
        int i = 2 % 2;
        int i2 = read + 101;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getprovidedcachefwf_client_release.getClass();
        write(getprovidedcachefwf_client_release);
        int i4 = read + 37;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    public void RemoteActionCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = read + 47;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = (hasTooManyZipEntrieslambda0) this.jsonReflectionObjectSerializer;
            hastoomanyzipentrieslambda0.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(hastoomanyzipentrieslambda0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda1 = (hasTooManyZipEntrieslambda0) this.jsonReflectionObjectSerializer;
        hastoomanyzipentrieslambda1.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(hastoomanyzipentrieslambda1.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, z);
        int i3 = read + 113;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // io.sentry.featureflags.write
    public MediaBrowserCompatMediaItem write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((RemoteActionCompatParcelizer) this.jsonReflectionObjectSerializer).serializer().close();
        int i4 = IconCompatParcelizer + 117;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public boolean write(getProvidedCachefwf_client_release getprovidedcachefwf_client_release) {
        int i = 2 % 2;
        getprovidedcachefwf_client_release.getClass();
        if (((getProvidedCachefwf_client_release) this.jsonReflectionObjectSerializer).compareTo(getprovidedcachefwf_client_release) <= 0) {
            int i2 = IconCompatParcelizer + 3;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IconCompatParcelizer + 97;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r1 = new io.sentry.JsonObjectSerializer((byte) 0, 12);
        r2 = io.sentry.JsonObjectSerializer.IconCompatParcelizer + 19;
        io.sentry.JsonObjectSerializer.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5.$r8$classId != 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r5.$r8$classId != 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = super.clone();
        r2 = io.sentry.JsonObjectSerializer.read + 35;
        io.sentry.JsonObjectSerializer.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = io.sentry.JsonObjectSerializer.read
            int r1 = r1 + 41
            int r2 = r1 % 128
            io.sentry.JsonObjectSerializer.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 12
            if (r1 != 0) goto L19
            int r1 = r5.$r8$classId
            r4 = 27
            int r4 = r4 / r2
            if (r1 == r3) goto L2b
            goto L1d
        L19:
            int r1 = r5.$r8$classId
            if (r1 == r3) goto L2b
        L1d:
            java.lang.Object r1 = super.clone()
            int r2 = io.sentry.JsonObjectSerializer.read
            int r2 = r2 + 35
            int r3 = r2 % 128
            io.sentry.JsonObjectSerializer.IconCompatParcelizer = r3
            int r2 = r2 % r0
            return r1
        L2b:
            io.sentry.JsonObjectSerializer r1 = new io.sentry.JsonObjectSerializer
            r1.<init>(r2, r3)
            int r2 = io.sentry.JsonObjectSerializer.IconCompatParcelizer
            int r2 = r2 + 19
            int r3 = r2 % 128
            io.sentry.JsonObjectSerializer.read = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.JsonObjectSerializer.clone():java.lang.Object");
    }

    @Override // io.sentry.featureflags.write
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public write clone() {
        int i = 2 % 2;
        JsonObjectSerializer jsonObjectSerializer = new JsonObjectSerializer((byte) 0, 12);
        int i2 = read + 97;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return jsonObjectSerializer;
    }

    public void serializer(OkHttpCall$1 okHttpCall$1, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, Map map) throws IOException {
        Iterator it;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            okHttpCall$1.write();
            it = map.keySet().iterator();
            int i3 = 89 / 0;
        } else {
            okHttpCall$1.write();
            it = map.keySet().iterator();
        }
        while (it.hasNext()) {
            int i4 = IconCompatParcelizer + 85;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object next = it.next();
            if (next instanceof String) {
                okHttpCall$1.write((String) next);
                read(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, map.get(next));
            }
        }
        okHttpCall$1.RatingCompat();
        int i6 = IconCompatParcelizer + 121;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void IconCompatParcelizer(OkHttpCall$1 okHttpCall$1, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, Collection collection) throws IOException {
        int i = 2 % 2;
        int i2 = read + 117;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        io.sentry.vendor.gson.stream.write writeVar = (io.sentry.vendor.gson.stream.write) okHttpCall$1.write;
        writeVar.IconCompatParcelizer();
        writeVar.serializer();
        int i4 = writeVar.MediaDescriptionCompat;
        int[] iArr = writeVar.MediaMetadataCompat;
        if (i4 == iArr.length) {
            int i5 = read + 33;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            writeVar.MediaMetadataCompat = Arrays.copyOf(iArr, i4 * 2);
            int i7 = read + 23;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        int[] iArr2 = writeVar.MediaMetadataCompat;
        int i9 = writeVar.MediaDescriptionCompat;
        writeVar.MediaDescriptionCompat = i9 + 1;
        iArr2[i9] = 1;
        writeVar.serializer.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            read(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, it.next());
        }
        writeVar.IconCompatParcelizer(1, 2, ']');
    }

    public /* synthetic */ JsonObjectSerializer(int i, Object obj) {
        this.$r8$classId = i;
        this.jsonReflectionObjectSerializer = obj;
    }

    public JsonObjectSerializer(logPushDeliverylambda1 logpushdeliverylambda1) {
        this.$r8$classId = 1;
        logpushdeliverylambda1.getClass();
        this.jsonReflectionObjectSerializer = logpushdeliverylambda1;
    }

    public JsonObjectSerializer(int i) {
        this.$r8$classId = 0;
        this.jsonReflectionObjectSerializer = new CSSParseException(i);
    }

    public JsonObjectSerializer(InAppMessageHtmlBaseViewmessageWebView6 inAppMessageHtmlBaseViewmessageWebView6) {
        this.$r8$classId = 14;
        this.jsonReflectionObjectSerializer = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), inAppMessageHtmlBaseViewmessageWebView6);
    }

    @Override // o.configureWebView
    public loadHtmlData IconCompatParcelizer(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, SentryOptions sentryOptions) {
        int i = 2 % 2;
        int i2 = read + 41;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setNativeShader.read(addToCustomAttributeArrayStep, "Scopes are required");
        setNativeShader.read(sentryOptions, "SentryOptions is required");
        String outboxPath = ((ParcelableVolumeInfo) this.jsonReflectionObjectSerializer).RemoteActionCompatParcelizer.getOutboxPath();
        if (outboxPath != null) {
            int i4 = IconCompatParcelizer + 43;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (configureWebView.IconCompatParcelizer(sentryOptions.getLogger(), outboxPath)) {
                return new loadHtmlData(sentryOptions.getLogger(), outboxPath, new isArgOptionalJsonObject(addToCustomAttributeArrayStep, sentryOptions.getEnvelopeReader(), sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis(), sentryOptions.getMaxQueueSize()), new File(outboxPath));
            }
        }
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    }

    public static enableSdk RemoteActionCompatParcelizer(dismissBannerlambda1 dismissbannerlambda1, String str) {
        enableSdk enablesdk;
        Object next;
        Object obj;
        int i = 2 % 2;
        List listWrite = dismissbannerlambda1.write();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listWrite) {
            if (!(!(obj2 instanceof getFeatureFlaglambda0))) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            enablesdk = null;
            obj = null;
            enablesdk = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i2 = read + 105;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            next = it.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getFeatureFlaglambda0) next).serializer(), str}, getCieXyz.write())).booleanValue());
        getFeatureFlaglambda0 getfeatureflaglambda0 = (getFeatureFlaglambda0) next;
        if (getfeatureflaglambda0 != null) {
            int i4 = read + 99;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            List listRemoteActionCompatParcelizer = getfeatureflaglambda0.RemoteActionCompatParcelizer();
            if (listRemoteActionCompatParcelizer != null) {
                Iterator it2 = listRemoteActionCompatParcelizer.iterator();
                while (it2.hasNext()) {
                    int i6 = read + 93;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        ((enableSdk) it2.next()).write();
                        enablesdk.hashCode();
                        throw null;
                    }
                    Object next2 = it2.next();
                    Boolean boolWrite = ((enableSdk) next2).write();
                    if (boolWrite != null && boolWrite.booleanValue()) {
                        obj = next2;
                        break;
                    }
                }
                enablesdk = (enableSdk) obj;
            }
        }
        int i7 = read + 81;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 48 / 0;
        }
        return enablesdk;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public Object invoke(ContinuationImpl continuationImpl) {
        logPushNotificationActionClickedlambda0 logpushnotificationactionclickedlambda0;
        int i = 2 % 2;
        if (continuationImpl instanceof logPushNotificationActionClickedlambda0) {
            int i2 = IconCompatParcelizer + 9;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            logpushnotificationactionclickedlambda0 = (logPushNotificationActionClickedlambda0) continuationImpl;
            int i4 = logpushnotificationactionclickedlambda0.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                logpushnotificationactionclickedlambda0.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
                int i5 = IconCompatParcelizer + 49;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                logpushnotificationactionclickedlambda0 = new logPushNotificationActionClickedlambda0(this, continuationImpl);
            }
        } else {
            logpushnotificationactionclickedlambda0 = new logPushNotificationActionClickedlambda0(this, continuationImpl);
        }
        Object objFirst = logpushnotificationactionclickedlambda0.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = logpushnotificationactionclickedlambda0.RemoteActionCompatParcelizer;
        if (i7 != 0) {
            int i8 = read;
            int i9 = i8 + 73;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = i8 + 73;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            logPushDeliverylambda1 logpushdeliverylambda1 = (logPushDeliverylambda1) this.jsonReflectionObjectSerializer;
            SettingsViewModel$special$$inlined$map$1 settingsViewModel$special$$inlined$map$1 = new SettingsViewModel$special$$inlined$map$1(logpushdeliverylambda1.IconCompatParcelizer.write().serializer(), 18, logpushdeliverylambda1);
            ((inCompatibilityMode) logpushdeliverylambda1.RemoteActionCompatParcelizer).getClass();
            Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(settingsViewModel$special$$inlined$map$1, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
            logpushnotificationactionclickedlambda0.RemoteActionCompatParcelizer = 1;
            objFirst = FlowKt.first(flowRemoteActionCompatParcelizer, logpushnotificationactionclickedlambda0);
            if (objFirst == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        dismissBannerlambda1 dismissbannerlambda1 = (dismissBannerlambda1) objFirst;
        if (dismissbannerlambda1 == null) {
            int i13 = read + 107;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return logPushNotificationActionClickedlambda1.IconCompatParcelizer;
        }
        enableSdk enablesdkRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(dismissbannerlambda1, "vehicle");
        enableSdk enablesdkRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(dismissbannerlambda1, "bag");
        if (enablesdkRemoteActionCompatParcelizer != null) {
            int i15 = read + 35;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            if (enablesdkRemoteActionCompatParcelizer2 != null) {
                return logPushMaxCampaignlambda0.write;
            }
        }
        return logPushNotificationActionClickedlambda10.RemoteActionCompatParcelizer;
    }

    public void read(OkHttpCall$1 okHttpCall$1, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, Object obj) throws IOException {
        int i = 2 % 2;
        io.sentry.vendor.gson.stream.write writeVar = (io.sentry.vendor.gson.stream.write) okHttpCall$1.write;
        if (obj == null) {
            writeVar.RemoteActionCompatParcelizer();
            return;
        }
        if (obj instanceof Character) {
            okHttpCall$1.IconCompatParcelizer(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            okHttpCall$1.IconCompatParcelizer((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            okHttpCall$1.write(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            okHttpCall$1.RemoteActionCompatParcelizer((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                okHttpCall$1.IconCompatParcelizer(setNativeShader.serializer((Date) obj));
                return;
            } catch (Exception e) {
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error when serializing Date", e);
                writeVar.RemoteActionCompatParcelizer();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                okHttpCall$1.IconCompatParcelizer(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error when serializing TimeZone", e2);
                writeVar.RemoteActionCompatParcelizer();
                return;
            }
        }
        if (obj instanceof RequestPushPermissionStep) {
            ((RequestPushPermissionStep) obj).serialize(okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
            return;
        }
        if (obj instanceof Collection) {
            int i2 = read + 91;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, (Collection) obj);
            return;
        }
        int i4 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i4 < length) {
                arrayList.add(Boolean.valueOf(zArr[i4]));
                i4++;
            }
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i4 < length2) {
                arrayList2.add(Byte.valueOf(bArr[i4]));
                i4++;
            }
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i4 < length3) {
                arrayList3.add(Short.valueOf(sArr[i4]));
                i4++;
            }
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i4 < length4) {
                arrayList4.add(Character.valueOf(cArr[i4]));
                i4++;
            }
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i4 < length5) {
                int i5 = read + 111;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                arrayList5.add(Integer.valueOf(iArr[i4]));
                i4++;
            }
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i4 < length6) {
                arrayList6.add(Long.valueOf(jArr[i4]));
                i4++;
            }
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i4 < length7) {
                arrayList7.add(Float.valueOf(fArr[i4]));
                i4++;
            }
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i4 < length8) {
                arrayList8.add(Double.valueOf(dArr[i4]));
                i4++;
            }
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            int i7 = IconCompatParcelizer + 93;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            int i9 = read + 49;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            serializer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            okHttpCall$1.IconCompatParcelizer(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            int i11 = IconCompatParcelizer + 35;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            IconCompatParcelizer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, io.sentry.util.write.write((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            okHttpCall$1.write(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            okHttpCall$1.IconCompatParcelizer(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            okHttpCall$1.IconCompatParcelizer(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            int i13 = read + 25;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            okHttpCall$1.IconCompatParcelizer(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            okHttpCall$1.IconCompatParcelizer(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            serializer(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, io.sentry.util.write.serializer((Calendar) obj));
            return;
        }
        if (!(!obj.getClass().isEnum())) {
            okHttpCall$1.IconCompatParcelizer(obj.toString());
            return;
        }
        try {
            read(okHttpCall$1, brazeActionParserExternalSyntheticLambda0, ((CSSParseException) this.jsonReflectionObjectSerializer).read(brazeActionParserExternalSyntheticLambda0, obj));
        } catch (Exception e3) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed serializing unknown object.", e3);
            okHttpCall$1.IconCompatParcelizer("[OBJECT]");
        }
    }
}
