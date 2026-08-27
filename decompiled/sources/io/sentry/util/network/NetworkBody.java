package io.sentry.util.network;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.re2j.Parser;
import com.huawei.hms.aaid.HmsInstanceId;
import com.mapbox.maps.MapboxMapRecorder$$ExternalSyntheticLambda0;
import com.roadrunner.push.core.data.MessagingServiceException;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.recruitment.accountcreation.data.ExecuteAccountCreationApiRequest;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.data.AccountCreationRepository$createAccount$1;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.data.AccountCreationRepository$createAccount$2;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import com.sentiance.core.model.events.ThriftBool;
import com.sentiance.okhttp3.u$a;
import com.sentiance.sdk.SdkStatus;
import com.sentiance.sdk.SdkStatusUpdateListener;
import io.grpc.LoadBalancer$Helper;
import io.socket.parser.IOParser$Decoder;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.BrazeExternalSyntheticLambda28;
import o.DiskLruCacheEditor;
import o.EnumColumnAdapter;
import o.EventJsonAdapter;
import o.IBrazeEndpointProvider;
import o.IBrazeExternalSyntheticBUOutline0;
import o.IInAppMessageManagerListener;
import o.InAppMessageUserJavascriptInterface;
import o.InternalPlatformTextApi;
import o.access1200;
import o.access1400;
import o.access1900;
import o.accessbootstrapIfNeeded;
import o.brazeloglambda0;
import o.decode;
import o.disable;
import o.executeAsList;
import o.getLooseusljTpc;
import o.getUnregisteredInAppMessageannotations;
import o.incrementCustomUserAttributedefault;
import o.invokeSuspendlambda0;
import o.isItemDismissable;
import o.isMainThread;
import o.onItemDismiss;
import o.onResumeI;
import o.r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaWZ71l2NRLkts1q9P778W4nK0FKY;
import o.r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU;
import o.r8lambdazY6FrfYmpvd_923yIbo0dPcgKo;
import o.reenqueueInAppMessage;
import o.registerOnApplicationlambda0;
import o.setBadNetworkIntervalandroid_sdk_base_release;
import o.setCountrylambda0;
import o.setCustomEndpoint;
import o.setDefaultNotificationAccentColor;
import o.setDefaultNotificationAccentColorandroid_sdk_base_release;
import o.setGenderlambda1;
import o.setGraphicModalMaxWidthDp;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.trackPlayStoreSubscription;
import o.u6;
import o.xb;
import okio.Options;
import org.bouncycastle.crypto.engines.AESEngine;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class NetworkBody implements SdkStatusUpdateListener, brazeloglambda0, IInAppMessageManagerListener {
    private static int read = 0;
    private static int serializer = 1;
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public NetworkBody(IOParser$Decoder iOParser$Decoder) {
        this.write = 27;
        this.IconCompatParcelizer = (setGenderlambda1) iOParser$Decoder.RemoteActionCompatParcelizer;
        u$a u_a = (u$a) iOParser$Decoder.read;
        u_a.getClass();
        this.RemoteActionCompatParcelizer = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(u_a);
    }

    public Object MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 93;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object obj = this.IconCompatParcelizer;
        int i5 = i2 + 119;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return obj;
    }

    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 77;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) this.RemoteActionCompatParcelizer;
        int i5 = i2 + 13;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (List) this.RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setGenderlambda1 RatingCompat() {
        int i = 2 % 2;
        int i2 = read + 37;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        setGenderlambda1 setgenderlambda1 = (setGenderlambda1) this.IconCompatParcelizer;
        int i4 = i3 + 81;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return setgenderlambda1;
    }

    @Override // com.sentiance.sdk.SdkStatusUpdateListener
    public void onSdkStatusUpdate(SdkStatus sdkStatus) {
        int i = 2 % 2;
        int i2 = read + 37;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            sdkStatus.getClass();
            ((GetAppStateImpl) this.IconCompatParcelizer).onSdkStatusUpdate(sdkStatus);
            throw null;
        }
        sdkStatus.getClass();
        ((GetAppStateImpl) this.IconCompatParcelizer).onSdkStatusUpdate(sdkStatus);
        MapboxMapRecorder$$ExternalSyntheticLambda0 mapboxMapRecorder$$ExternalSyntheticLambda0 = (MapboxMapRecorder$$ExternalSyntheticLambda0) this.RemoteActionCompatParcelizer;
        if (mapboxMapRecorder$$ExternalSyntheticLambda0 != null) {
            int i3 = serializer + 25;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                mapboxMapRecorder$$ExternalSyntheticLambda0.onSdkStatusUpdate(sdkStatus);
            } else {
                mapboxMapRecorder$$ExternalSyntheticLambda0.onSdkStatusUpdate(sdkStatus);
                throw null;
            }
        }
    }

    public /* synthetic */ NetworkBody(Object obj, int i, Object obj2) {
        this.write = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    public NetworkBody(BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, DiskLruCacheEditor diskLruCacheEditor) {
        this.write = 1;
        brazeExternalSyntheticLambda28.getClass();
        diskLruCacheEditor.getClass();
        this.IconCompatParcelizer = brazeExternalSyntheticLambda28;
        this.RemoteActionCompatParcelizer = diskLruCacheEditor;
    }

    public registerOnApplicationlambda0 serializer() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((ThriftBool) this.IconCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_low' is missing");
            return null;
        }
        if (((Byte) this.RemoteActionCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'percent_threshold' is missing");
            return null;
        }
        registerOnApplicationlambda0 registeronapplicationlambda0 = new registerOnApplicationlambda0(this);
        int i4 = serializer + 39;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return registeronapplicationlambda0;
    }

    public NetworkBody(GetAppStateImpl getAppStateImpl) {
        this.write = 5;
        getAppStateImpl.getClass();
        this.IconCompatParcelizer = getAppStateImpl;
    }

    public NetworkBody(ExecuteAccountCreationApiRequest executeAccountCreationApiRequest, onResumeI onresumei) {
        this.write = 4;
        executeAccountCreationApiRequest.getClass();
        onresumei.getClass();
        this.IconCompatParcelizer = executeAccountCreationApiRequest;
        this.RemoteActionCompatParcelizer = onresumei;
    }

    public invokeSuspendlambda0 write() {
        int i = 2 % 2;
        if (((Byte) this.IconCompatParcelizer) != null) {
            int i2 = serializer + 119;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (((Boolean) this.RemoteActionCompatParcelizer) != null) {
                return new invokeSuspendlambda0(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'enabled' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'reason' is missing");
        int i4 = read + 97;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public NetworkBody(GetCourierShiftInfoImpl getCourierShiftInfoImpl, InternalPlatformTextApi internalPlatformTextApi) {
        this.write = 7;
        getCourierShiftInfoImpl.getClass();
        internalPlatformTextApi.getClass();
        this.IconCompatParcelizer = getCourierShiftInfoImpl;
        this.RemoteActionCompatParcelizer = internalPlatformTextApi;
    }

    public NetworkBody(decode decodeVar, getLooseusljTpc getlooseusljtpc) {
        this.write = 8;
        decodeVar.getClass();
        getlooseusljtpc.getClass();
        this.IconCompatParcelizer = decodeVar;
        this.RemoteActionCompatParcelizer = getlooseusljtpc;
    }

    public reenqueueInAppMessage read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 35;
        read = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (((String) this.IconCompatParcelizer) != null) {
                int i4 = i2 + 93;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (((Byte) this.RemoteActionCompatParcelizer) != null) {
                    reenqueueInAppMessage reenqueueinappmessage = new reenqueueInAppMessage(this);
                    int i6 = read + 65;
                    serializer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        int i7 = 47 / 0;
                    }
                    return reenqueueinappmessage;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'state' is missing");
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'id' is missing");
            }
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public NetworkBody(xb xbVar, u6 u6Var, isMainThread ismainthread) {
        this.write = 6;
        this.IconCompatParcelizer = xbVar;
        this.RemoteActionCompatParcelizer = u6Var;
    }

    public incrementCustomUserAttributedefault RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 1;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (((setBadNetworkIntervalandroid_sdk_base_release) this.IconCompatParcelizer) != null) {
            if (((setCountrylambda0) this.RemoteActionCompatParcelizer) != null) {
                return new incrementCustomUserAttributedefault(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'dataunit' is missing");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'pedigree' is missing");
            int i3 = read + 1;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 4 % 4;
            }
        }
        return null;
    }

    public NetworkBody(decode decodeVar, trackPlayStoreSubscription trackplaystoresubscription) {
        this.write = 3;
        decodeVar.getClass();
        trackplaystoresubscription.getClass();
        this.IconCompatParcelizer = decodeVar;
        this.RemoteActionCompatParcelizer = trackplaystoresubscription;
    }

    public NetworkBody(decode decodeVar, disable disableVar) {
        this.write = 9;
        decodeVar.getClass();
        disableVar.getClass();
        this.IconCompatParcelizer = decodeVar;
        this.RemoteActionCompatParcelizer = disableVar;
    }

    public IBrazeExternalSyntheticBUOutline0 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 29;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (((String) this.IconCompatParcelizer) != null) {
            if (((IBrazeEndpointProvider) this.RemoteActionCompatParcelizer) != null) {
                return new IBrazeExternalSyntheticBUOutline0(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'property' is missing");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'offthegrid_id' is missing");
            int i3 = read + 79;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        return null;
    }

    public /* synthetic */ NetworkBody(int i) {
        this.write = i;
    }

    public NetworkBody(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.write = 28;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
    }

    public setDefaultNotificationAccentColor MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = read + 71;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            if (((setCustomEndpoint) this.IconCompatParcelizer) == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'id' is missing");
            } else {
                if (((setDefaultNotificationAccentColorandroid_sdk_base_release) this.RemoteActionCompatParcelizer) != null) {
                    return new setDefaultNotificationAccentColor(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'property' is missing");
                int i3 = read + 57;
                serializer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 4 / 5;
                }
            }
            int i5 = serializer + 87;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1 != 27) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return super.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r1 = "Request{url=" + ((o.setGenderlambda1) r5.IconCompatParcelizer) + '}';
        r2 = io.sentry.util.network.NetworkBody.read + 77;
        io.sentry.util.network.NetworkBody.serializer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1 != 27) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = io.sentry.util.network.NetworkBody.read
            int r1 = r1 + 119
            int r2 = r1 % 128
            io.sentry.util.network.NetworkBody.serializer = r2
            int r1 = r1 % r0
            r2 = 125(0x7d, float:1.75E-43)
            r3 = 27
            if (r1 != 0) goto L1d
            int r1 = r5.write
            r4 = 31
            int r4 = r4 / 0
            if (r1 == 0) goto L47
            if (r1 == r3) goto L28
            goto L23
        L1d:
            int r1 = r5.write
            if (r1 == 0) goto L47
            if (r1 == r3) goto L28
        L23:
            java.lang.String r0 = super.toString()
            return r0
        L28:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Request{url="
            r1.<init>(r3)
            java.lang.Object r3 = r5.IconCompatParcelizer
            o.setGenderlambda1 r3 = (o.setGenderlambda1) r3
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = io.sentry.util.network.NetworkBody.read
            int r2 = r2 + 77
            int r3 = r2 % 128
            io.sentry.util.network.NetworkBody.serializer = r3
            int r2 = r2 % r0
            return r1
        L47:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NetworkBody{body="
            r0.<init>(r1)
            java.lang.Object r1 = r5.IconCompatParcelizer
            r0.append(r1)
            java.lang.String r1 = ", warnings="
            r0.append(r1)
            java.lang.Object r1 = r5.RemoteActionCompatParcelizer
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = o.SweepGradientShader9KIMszodefault.IconCompatParcelizer(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.util.network.NetworkBody.toString():java.lang.String");
    }

    public EventJsonAdapter read(setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release) {
        int i = 2 % 2;
        AESEngine aESEngine = (AESEngine) this.IconCompatParcelizer;
        byte[] bArr = (byte[]) this.RemoteActionCompatParcelizer;
        EventJsonAdapter eventJsonAdapter = new EventJsonAdapter();
        eventJsonAdapter.RatingCompat = 0L;
        eventJsonAdapter.MediaBrowserCompatMediaItem = false;
        eventJsonAdapter.serializer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        eventJsonAdapter.IconCompatParcelizer = aESEngine;
        eventJsonAdapter.MediaSessionCompatQueueItem = 384;
        eventJsonAdapter.MediaBrowserCompatMediaItem = false;
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        byte[] bArrSerializer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.serializer();
        if (bArrSerializer.length < 32) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Insufficient entropy provided by entropy source");
            int i2 = read + 25;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i3 = serializer + 27;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        byte[] bArrWrite = eventJsonAdapter.write(384, accessbootstrapIfNeeded.read(bArrSerializer, bArr));
        byte[] bArr2 = new byte[32];
        eventJsonAdapter.RemoteActionCompatParcelizer = bArr2;
        byte[] bArr3 = new byte[16];
        eventJsonAdapter.write = bArr3;
        eventJsonAdapter.serializer(bArrWrite, bArr2, bArr3);
        eventJsonAdapter.RatingCompat = 1L;
        int i5 = serializer + 71;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return eventJsonAdapter;
        }
        throw null;
    }

    public void write(r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U r8lambda7pyt14uieahlprgfczvsqchol6u, boolean z) {
        String str;
        int i = 2 % 2;
        r8lambda7pyt14uieahlprgfczvsqchol6u.getClass();
        int i2 = r8lambdaWZ71l2NRLkts1q9P778W4nK0FKY.read[r8lambda7pyt14uieahlprgfczvsqchol6u.ordinal()];
        if (i2 != 1) {
            int i3 = serializer + 117;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                if (i2 != 5) {
                    return;
                }
            } else if (i2 != 2) {
                return;
            }
            str = "settings_avoid_tolls";
        } else {
            int i4 = read + 107;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str = "settings_avoid_highways";
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("avoidance toggle changed: key=" + r8lambda7pyt14uieahlprgfczvsqchol6u + ", isEnabled=" + z, new Object[0]);
        decode decodeVar = (decode) this.IconCompatParcelizer;
        Map mapSingletonMap = Collections.singletonMap("is_enabled", String.valueOf(z));
        mapSingletonMap.getClass();
        decodeVar.logEvent(str, mapSingletonMap);
    }

    @Override // o.IInAppMessageManagerListener
    public setGraphicModalMaxWidthDp write(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        Object objPutIfAbsent;
        int i = 2 % 2;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.RemoteActionCompatParcelizer;
        Class cls = Options.Companion.read(getunregisteredinappmessageannotations);
        Object inAppMessageUserJavascriptInterface = concurrentHashMap.get(cls);
        if (inAppMessageUserJavascriptInterface == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (inAppMessageUserJavascriptInterface = new InAppMessageUserJavascriptInterface((setGraphicModalMaxWidthDp) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.IconCompatParcelizer).invoke(getunregisteredinappmessageannotations))))) != null) {
            int i2 = read + 33;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 4 % 5;
            }
            inAppMessageUserJavascriptInterface = objPutIfAbsent;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = ((InAppMessageUserJavascriptInterface) inAppMessageUserJavascriptInterface).read;
        int i4 = read + 41;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX INFO: renamed from: createAccount-bMdYcbs$implementation, reason: not valid java name */
    public Object m5141createAccountbMdYcbs$implementation(String str, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        AccountCreationRepository$createAccount$1 accountCreationRepository$createAccount$1;
        int i = 2 % 2;
        int i2 = serializer + 41;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (!(continuationImpl instanceof AccountCreationRepository$createAccount$1)) {
            accountCreationRepository$createAccount$1 = new AccountCreationRepository$createAccount$1(this, continuationImpl);
        } else {
            int i5 = i3 + 91;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = ((AccountCreationRepository$createAccount$1) continuationImpl).read;
                throw null;
            }
            accountCreationRepository$createAccount$1 = (AccountCreationRepository$createAccount$1) continuationImpl;
            int i7 = accountCreationRepository$createAccount$1.read;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                accountCreationRepository$createAccount$1.read = i7 - Integer.MIN_VALUE;
            } else {
                accountCreationRepository$createAccount$1 = new AccountCreationRepository$createAccount$1(this, continuationImpl);
            }
        }
        AccountCreationRepository$createAccount$1 accountCreationRepository$createAccount$2 = accountCreationRepository$createAccount$1;
        int i8 = read + 49;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            Object obj2 = accountCreationRepository$createAccount$2.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = accountCreationRepository$createAccount$2.read;
            obj.hashCode();
            throw null;
        }
        Object obj3 = accountCreationRepository$createAccount$2.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = accountCreationRepository$createAccount$2.read;
        if (i10 != 0) {
            if (i10 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                return ((onItemDismiss) obj3).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj3);
        ExecuteAccountCreationApiRequest executeAccountCreationApiRequest = (ExecuteAccountCreationApiRequest) this.IconCompatParcelizer;
        AccountCreationRepository$createAccount$2 accountCreationRepository$createAccount$3 = new AccountCreationRepository$createAccount$2(this, str4, str, str2, str3, str5, str6, null);
        accountCreationRepository$createAccount$2.read = 1;
        Object objM5016invokegIAlus = executeAccountCreationApiRequest.m5016invokegIAlus(accountCreationRepository$createAccount$3, accountCreationRepository$createAccount$2);
        if (objM5016invokegIAlus != coroutineSingletons2) {
            return objM5016invokegIAlus;
        }
        int i11 = serializer + 71;
        read = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return coroutineSingletons2;
    }

    public Object invoke(access1900 access1900Var) {
        int i = 2 % 2;
        r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU r8lambdaxxjw7p_avkptnfi9ykz8umnanku = (r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU) this.IconCompatParcelizer;
        int i2 = access1400.IconCompatParcelizer[((access1200) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer().ordinal()];
        if (i2 == 1) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(access1900Var));
            cancellableContinuationImpl.read();
            ((FirebaseMessaging) r8lambdaxxjw7p_avkptnfi9ykz8umnanku.write.write()).getToken().addOnCompleteListener(new Parser.Pair(cancellableContinuationImpl, 27, r8lambdaxxjw7p_avkptnfi9ykz8umnanku));
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        }
        if (i2 != 2) {
            Object obj = null;
            if (i2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i3 = read + 97;
            int i4 = i3 % Fields.SpotShadowColor;
            serializer = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 57;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(access1900Var));
        cancellableContinuationImpl2.read();
        try {
            cancellableContinuationImpl2.resumeWith(((HmsInstanceId) r8lambdaxxjw7p_avkptnfi9ykz8umnanku.read.write()).getToken("hms_applicant_token"));
        } catch (Exception e) {
            EnumColumnAdapter enumColumnAdapter = ((r8lambdazY6FrfYmpvd_923yIbo0dPcgKo) r8lambdaxxjw7p_avkptnfi9ykz8umnanku.IconCompatParcelizer.write()).IconCompatParcelizer;
            executeAsList executeaslist = executeAsList.INFRA;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            EnumColumnAdapter.serializer(enumColumnAdapter, "push_huawei_token_provider_failed", executeaslist, message);
            Timber.RemoteActionCompatParcelizer.write(new MessagingServiceException("Unable to fetch the hms token", e));
            cancellableContinuationImpl2.resumeWith(new isItemDismissable(e));
        }
        Object result2 = cancellableContinuationImpl2.getResult();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result2;
    }
}
