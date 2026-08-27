package com.roadrunner.realtime.data;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hmf.tasks.a.d$a;
import com.roadrunner.realtime.data.SocketIoGuard;
import io.grpc.internal.SharedResourcePool;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.BrazeCompanionExternalSyntheticLambda21;
import o.DrawableTransformation;
import o.IInAppMessageViewWrapper;
import o.contentCardsUpdatelambda2;
import o.decode;
import o.getCieXyz;
import o.getContentCardsViewBindingHandler;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.lambdaremoveGlobalCallbackParameter24;
import o.lambdaremoveGlobalPartnerParameter26;
import o.lambdasendReftagReferrer17;
import o.lambdasetExternalDeviceIdInDelay51;
import o.lambdasetPushToken32;
import o.lambdatrackAdRevenue41;
import o.lambdatrackEvent3;
import o.lambdatrackEvent4;
import o.networkUnavailablelambda0;
import o.r8lambda9ZY36wGhLruV8pSk7W6zmogPxg;
import o.r8lambdaH4El2AuEYS7SZhBdBoHhFTah6iY;
import o.r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw;
import o.removeNodeAtDepth;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SocketIoGuard {
    private static int MediaDescriptionCompat = 0;
    private static int PlaybackStateCompat = 1;
    public String IconCompatParcelizer;
    public networkUnavailablelambda0 MediaBrowserCompatMediaItem;
    public final lambdasetPushToken32 MediaMetadataCompat;
    public final SharedFlowImpl MediaSessionCompatQueueItem;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final lambdaremoveGlobalCallbackParameter24 read;
    public final SharedFlowImpl serializer;
    public final lambdasendReftagReferrer17 write;

    public SocketIoGuard(BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21, lambdasetPushToken32 lambdasetpushtoken32, lambdasendReftagReferrer17 lambdasendreftagreferrer17, lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24, SharedResourcePool sharedResourcePool) {
        this.MediaMetadataCompat = lambdasetpushtoken32;
        this.write = lambdasendreftagreferrer17;
        this.read = lambdaremoveglobalcallbackparameter24;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(lambdaremoveGlobalPartnerParameter26.IDLE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 16, IInAppMessageViewWrapper.DROP_OLDEST);
        this.serializer = sharedFlowImplRemoteActionCompatParcelizer;
        this.MediaSessionCompatQueueItem = sharedFlowImplRemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 87;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(str, new Object[0]);
        } else {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(str, new Object[0]);
        }
    }

    public final void IconCompatParcelizer(networkUnavailablelambda0 networkunavailablelambda0) {
        final int i = 2;
        int i2 = 2 % 2;
        final int i3 = 0;
        networkunavailablelambda0.read("connect", new getContentCardsViewBindingHandler(this) { // from class: o.lambdatrackAdRevenue40
            private static int RemoteActionCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ SocketIoGuard serializer;

            {
                this.serializer = this;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
            @Override // o.getContentCardsViewBindingHandler
            public final void RemoteActionCompatParcelizer(Object[] objArr) {
                String string;
                String string2;
                int i4 = 2 % 2;
                int i5 = RemoteActionCompatParcelizer + 93;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                SocketIoGuard socketIoGuard = this.serializer;
                if (i7 == 0) {
                    socketIoGuard.IconCompatParcelizer("Socket connected");
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.CONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter24.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter24.serializer.logEvent("rtc_state_connected", null);
                        return;
                    }
                    return;
                }
                if (i7 == 1) {
                    objArr.getClass();
                    Object objWrite = onContentCardClicked.write(objArr);
                    if (objWrite == null || (string = objWrite.toString()) == null) {
                        string = "Unknown";
                    }
                    socketIoGuard.IconCompatParcelizer("Socket disconnected: ".concat(string));
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.DISCONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter25 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter25.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter25.serializer.logEvent("rtc_state_disconnected", null);
                        return;
                    }
                    return;
                }
                if (i7 == 2) {
                    objArr.getClass();
                    Object objWrite2 = onContentCardClicked.write(objArr);
                    if (objWrite2 != null) {
                        int i8 = RemoteActionCompatParcelizer + 9;
                        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        string2 = objWrite2.toString();
                        if (string2 == null) {
                            string2 = "Unknown error";
                        }
                    } else {
                        string2 = "Unknown error";
                    }
                    Timber.RemoteActionCompatParcelizer.read("Socket connection error: ".concat(string2), new Object[0]);
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.DISCONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter26 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter26.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter26.serializer.logEvent("rtc_state_disconnected", null);
                        return;
                    }
                    return;
                }
                objArr.getClass();
                for (Object obj : objArr) {
                    if (obj instanceof JSONObject) {
                        String string3 = ((JSONObject) obj).toString();
                        string3.getClass();
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery update message received: ".concat(string3), new Object[0]);
                        if (socketIoGuard.write.write().read) {
                            socketIoGuard.MediaMetadataCompat.RemoteActionCompatParcelizer();
                            lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter27 = socketIoGuard.read;
                            if (lambdaremoveglobalcallbackparameter27.RemoteActionCompatParcelizer()) {
                                ff$$ExternalSyntheticOutline0.m("name", "server:delivery_updated", lambdaremoveglobalcallbackparameter27.serializer, "rtc_message");
                            }
                            socketIoGuard.serializer.write(new lambdasetOfflineMode8(string3));
                        } else {
                            int i10 = read + 23;
                            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i10 % 2 == 0) {
                                socketIoGuard.IconCompatParcelizer("Realtime connection disabled by config; ignoring message and disconnecting");
                                socketIoGuard.IconCompatParcelizer();
                                int i11 = 32 / 0;
                            } else {
                                socketIoGuard.IconCompatParcelizer("Realtime connection disabled by config; ignoring message and disconnecting");
                                socketIoGuard.IconCompatParcelizer();
                            }
                        }
                    } else if (obj instanceof getContentCardsRecyclerView) {
                        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a((getContentCardsRecyclerView) obj, 19, new Object[]{new JSONObject().put("ok", true)}));
                    }
                }
            }
        });
        final int i4 = 1;
        networkunavailablelambda0.read("disconnect", new getContentCardsViewBindingHandler(this) { // from class: o.lambdatrackAdRevenue40
            private static int RemoteActionCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ SocketIoGuard serializer;

            {
                this.serializer = this;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
            @Override // o.getContentCardsViewBindingHandler
            public final void RemoteActionCompatParcelizer(Object[] objArr) {
                String string;
                String string2;
                int i5 = 2 % 2;
                int i6 = RemoteActionCompatParcelizer + 93;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                int i8 = i4;
                SocketIoGuard socketIoGuard = this.serializer;
                if (i8 == 0) {
                    socketIoGuard.IconCompatParcelizer("Socket connected");
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.CONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter24.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter24.serializer.logEvent("rtc_state_connected", null);
                        return;
                    }
                    return;
                }
                if (i8 == 1) {
                    objArr.getClass();
                    Object objWrite = onContentCardClicked.write(objArr);
                    if (objWrite == null || (string = objWrite.toString()) == null) {
                        string = "Unknown";
                    }
                    socketIoGuard.IconCompatParcelizer("Socket disconnected: ".concat(string));
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.DISCONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter25 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter25.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter25.serializer.logEvent("rtc_state_disconnected", null);
                        return;
                    }
                    return;
                }
                if (i8 == 2) {
                    objArr.getClass();
                    Object objWrite2 = onContentCardClicked.write(objArr);
                    if (objWrite2 != null) {
                        int i9 = RemoteActionCompatParcelizer + 9;
                        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        string2 = objWrite2.toString();
                        if (string2 == null) {
                            string2 = "Unknown error";
                        }
                    } else {
                        string2 = "Unknown error";
                    }
                    Timber.RemoteActionCompatParcelizer.read("Socket connection error: ".concat(string2), new Object[0]);
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.DISCONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter26 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter26.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter26.serializer.logEvent("rtc_state_disconnected", null);
                        return;
                    }
                    return;
                }
                objArr.getClass();
                for (Object obj : objArr) {
                    if (obj instanceof JSONObject) {
                        String string3 = ((JSONObject) obj).toString();
                        string3.getClass();
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery update message received: ".concat(string3), new Object[0]);
                        if (socketIoGuard.write.write().read) {
                            socketIoGuard.MediaMetadataCompat.RemoteActionCompatParcelizer();
                            lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter27 = socketIoGuard.read;
                            if (lambdaremoveglobalcallbackparameter27.RemoteActionCompatParcelizer()) {
                                ff$$ExternalSyntheticOutline0.m("name", "server:delivery_updated", lambdaremoveglobalcallbackparameter27.serializer, "rtc_message");
                            }
                            socketIoGuard.serializer.write(new lambdasetOfflineMode8(string3));
                        } else {
                            int i11 = read + 23;
                            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i11 % 2 == 0) {
                                socketIoGuard.IconCompatParcelizer("Realtime connection disabled by config; ignoring message and disconnecting");
                                socketIoGuard.IconCompatParcelizer();
                                int i12 = 32 / 0;
                            } else {
                                socketIoGuard.IconCompatParcelizer("Realtime connection disabled by config; ignoring message and disconnecting");
                                socketIoGuard.IconCompatParcelizer();
                            }
                        }
                    } else if (obj instanceof getContentCardsRecyclerView) {
                        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a((getContentCardsRecyclerView) obj, 19, new Object[]{new JSONObject().put("ok", true)}));
                    }
                }
            }
        });
        networkunavailablelambda0.read("connect_error", new getContentCardsViewBindingHandler(this) { // from class: o.lambdatrackAdRevenue40
            private static int RemoteActionCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ SocketIoGuard serializer;

            {
                this.serializer = this;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
            @Override // o.getContentCardsViewBindingHandler
            public final void RemoteActionCompatParcelizer(Object[] objArr) {
                String string;
                String string2;
                int i5 = 2 % 2;
                int i6 = RemoteActionCompatParcelizer + 93;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                int i8 = i;
                SocketIoGuard socketIoGuard = this.serializer;
                if (i8 == 0) {
                    socketIoGuard.IconCompatParcelizer("Socket connected");
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.CONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter24.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter24.serializer.logEvent("rtc_state_connected", null);
                        return;
                    }
                    return;
                }
                if (i8 == 1) {
                    objArr.getClass();
                    Object objWrite = onContentCardClicked.write(objArr);
                    if (objWrite == null || (string = objWrite.toString()) == null) {
                        string = "Unknown";
                    }
                    socketIoGuard.IconCompatParcelizer("Socket disconnected: ".concat(string));
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.DISCONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter25 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter25.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter25.serializer.logEvent("rtc_state_disconnected", null);
                        return;
                    }
                    return;
                }
                if (i8 == 2) {
                    objArr.getClass();
                    Object objWrite2 = onContentCardClicked.write(objArr);
                    if (objWrite2 != null) {
                        int i9 = RemoteActionCompatParcelizer + 9;
                        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        string2 = objWrite2.toString();
                        if (string2 == null) {
                            string2 = "Unknown error";
                        }
                    } else {
                        string2 = "Unknown error";
                    }
                    Timber.RemoteActionCompatParcelizer.read("Socket connection error: ".concat(string2), new Object[0]);
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.DISCONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter26 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter26.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter26.serializer.logEvent("rtc_state_disconnected", null);
                        return;
                    }
                    return;
                }
                objArr.getClass();
                for (Object obj : objArr) {
                    if (obj instanceof JSONObject) {
                        String string3 = ((JSONObject) obj).toString();
                        string3.getClass();
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery update message received: ".concat(string3), new Object[0]);
                        if (socketIoGuard.write.write().read) {
                            socketIoGuard.MediaMetadataCompat.RemoteActionCompatParcelizer();
                            lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter27 = socketIoGuard.read;
                            if (lambdaremoveglobalcallbackparameter27.RemoteActionCompatParcelizer()) {
                                ff$$ExternalSyntheticOutline0.m("name", "server:delivery_updated", lambdaremoveglobalcallbackparameter27.serializer, "rtc_message");
                            }
                            socketIoGuard.serializer.write(new lambdasetOfflineMode8(string3));
                        } else {
                            int i11 = read + 23;
                            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i11 % 2 == 0) {
                                socketIoGuard.IconCompatParcelizer("Realtime connection disabled by config; ignoring message and disconnecting");
                                socketIoGuard.IconCompatParcelizer();
                                int i12 = 32 / 0;
                            } else {
                                socketIoGuard.IconCompatParcelizer("Realtime connection disabled by config; ignoring message and disconnecting");
                                socketIoGuard.IconCompatParcelizer();
                            }
                        }
                    } else if (obj instanceof getContentCardsRecyclerView) {
                        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a((getContentCardsRecyclerView) obj, 19, new Object[]{new JSONObject().put("ok", true)}));
                    }
                }
            }
        });
        final int i5 = 3;
        networkunavailablelambda0.read("server:delivery_updated", new getContentCardsViewBindingHandler(this) { // from class: o.lambdatrackAdRevenue40
            private static int RemoteActionCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ SocketIoGuard serializer;

            {
                this.serializer = this;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
            @Override // o.getContentCardsViewBindingHandler
            public final void RemoteActionCompatParcelizer(Object[] objArr) {
                String string;
                String string2;
                int i6 = 2 % 2;
                int i7 = RemoteActionCompatParcelizer + 93;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = i5;
                SocketIoGuard socketIoGuard = this.serializer;
                if (i9 == 0) {
                    socketIoGuard.IconCompatParcelizer("Socket connected");
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.CONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter24.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter24.serializer.logEvent("rtc_state_connected", null);
                        return;
                    }
                    return;
                }
                if (i9 == 1) {
                    objArr.getClass();
                    Object objWrite = onContentCardClicked.write(objArr);
                    if (objWrite == null || (string = objWrite.toString()) == null) {
                        string = "Unknown";
                    }
                    socketIoGuard.IconCompatParcelizer("Socket disconnected: ".concat(string));
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.DISCONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter25 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter25.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter25.serializer.logEvent("rtc_state_disconnected", null);
                        return;
                    }
                    return;
                }
                if (i9 == 2) {
                    objArr.getClass();
                    Object objWrite2 = onContentCardClicked.write(objArr);
                    if (objWrite2 != null) {
                        int i10 = RemoteActionCompatParcelizer + 9;
                        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        string2 = objWrite2.toString();
                        if (string2 == null) {
                            string2 = "Unknown error";
                        }
                    } else {
                        string2 = "Unknown error";
                    }
                    Timber.RemoteActionCompatParcelizer.read("Socket connection error: ".concat(string2), new Object[0]);
                    socketIoGuard.RemoteActionCompatParcelizer.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.DISCONNECTED);
                    lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter26 = socketIoGuard.read;
                    if (lambdaremoveglobalcallbackparameter26.RemoteActionCompatParcelizer()) {
                        lambdaremoveglobalcallbackparameter26.serializer.logEvent("rtc_state_disconnected", null);
                        return;
                    }
                    return;
                }
                objArr.getClass();
                for (Object obj : objArr) {
                    if (obj instanceof JSONObject) {
                        String string3 = ((JSONObject) obj).toString();
                        string3.getClass();
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery update message received: ".concat(string3), new Object[0]);
                        if (socketIoGuard.write.write().read) {
                            socketIoGuard.MediaMetadataCompat.RemoteActionCompatParcelizer();
                            lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter27 = socketIoGuard.read;
                            if (lambdaremoveglobalcallbackparameter27.RemoteActionCompatParcelizer()) {
                                ff$$ExternalSyntheticOutline0.m("name", "server:delivery_updated", lambdaremoveglobalcallbackparameter27.serializer, "rtc_message");
                            }
                            socketIoGuard.serializer.write(new lambdasetOfflineMode8(string3));
                        } else {
                            int i12 = read + 23;
                            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i12 % 2 == 0) {
                                socketIoGuard.IconCompatParcelizer("Realtime connection disabled by config; ignoring message and disconnecting");
                                socketIoGuard.IconCompatParcelizer();
                                int i13 = 32 / 0;
                            } else {
                                socketIoGuard.IconCompatParcelizer("Realtime connection disabled by config; ignoring message and disconnecting");
                                socketIoGuard.IconCompatParcelizer();
                            }
                        }
                    } else if (obj instanceof getContentCardsRecyclerView) {
                        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a((getContentCardsRecyclerView) obj, 19, new Object[]{new JSONObject().put("ok", true)}));
                    }
                }
            }
        });
        int i6 = PlaybackStateCompat + 11;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        MutableStateFlow mutableStateFlow = this.RemoteActionCompatParcelizer;
        if (mutableStateFlow.read() == lambdaremoveGlobalPartnerParameter26.CONNECTING || mutableStateFlow.read() == lambdaremoveGlobalPartnerParameter26.CONNECTED) {
            networkUnavailablelambda0 networkunavailablelambda0 = this.MediaBrowserCompatMediaItem;
            if (networkunavailablelambda0 != null) {
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new contentCardsUpdatelambda2(networkunavailablelambda0, 1));
                int i2 = PlaybackStateCompat + 97;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            networkUnavailablelambda0 networkunavailablelambda1 = this.MediaBrowserCompatMediaItem;
            if (networkunavailablelambda1 != null) {
                int i4 = MediaDescriptionCompat + 9;
                PlaybackStateCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    ((ConcurrentHashMap) networkunavailablelambda1.ComponentActivity).clear();
                    throw null;
                }
                ((ConcurrentHashMap) networkunavailablelambda1.ComponentActivity).clear();
            }
            this.MediaBrowserCompatMediaItem = null;
            mutableStateFlow.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.IDLE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final CoroutineSingletons access$observeDisconnectedStateAndScheduleReconnect(SocketIoGuard socketIoGuard, ContinuationImpl continuationImpl) {
        lambdatrackAdRevenue41 lambdatrackadrevenue41;
        int i = 2 % 2;
        if (continuationImpl instanceof lambdatrackAdRevenue41) {
            lambdatrackadrevenue41 = (lambdatrackAdRevenue41) continuationImpl;
            int i2 = lambdatrackadrevenue41.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = PlaybackStateCompat + 89;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                lambdatrackadrevenue41.read = i2 - Integer.MIN_VALUE;
            } else {
                lambdatrackadrevenue41 = new lambdatrackAdRevenue41(socketIoGuard, continuationImpl);
                int i5 = PlaybackStateCompat + 63;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            lambdatrackadrevenue41 = new lambdatrackAdRevenue41(socketIoGuard, continuationImpl);
            int i7 = PlaybackStateCompat + 63;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Object obj = lambdatrackadrevenue41.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = lambdatrackadrevenue41.read;
        int i10 = 1;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StateFlow stateFlow = socketIoGuard.RatingCompat;
            lambdatrackEvent3 lambdatrackevent3 = new lambdatrackEvent3(socketIoGuard, i10);
            lambdatrackadrevenue41.read = 1;
            if (stateFlow.collect(lambdatrackevent3, lambdatrackadrevenue41) == coroutineSingletons) {
                int i11 = PlaybackStateCompat + 65;
                MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i12 = 79 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        DrawableTransformation.read();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final CoroutineSingletons access$observeReconnectionTrigger(SocketIoGuard socketIoGuard, ContinuationImpl continuationImpl) {
        lambdatrackEvent4 lambdatrackevent4;
        int i = 2 % 2;
        if (continuationImpl instanceof lambdatrackEvent4) {
            lambdatrackevent4 = (lambdatrackEvent4) continuationImpl;
            int i2 = lambdatrackevent4.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lambdatrackevent4.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
                int i3 = MediaDescriptionCompat + 63;
                PlaybackStateCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                lambdatrackevent4 = new lambdatrackEvent4(socketIoGuard, continuationImpl);
            }
        } else {
            lambdatrackevent4 = new lambdatrackEvent4(socketIoGuard, continuationImpl);
        }
        Object obj = lambdatrackevent4.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = lambdatrackevent4.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            int i6 = MediaDescriptionCompat + 113;
            PlaybackStateCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SharedFlowImpl sharedFlowImpl = socketIoGuard.MediaMetadataCompat.MediaBrowserCompatMediaItem;
            lambdatrackEvent3 lambdatrackevent3 = new lambdatrackEvent3(socketIoGuard, 0);
            lambdatrackevent4.RemoteActionCompatParcelizer = 1;
            sharedFlowImpl.getClass();
            if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, lambdatrackevent3, lambdatrackevent4) == coroutineSingletons) {
                int i7 = PlaybackStateCompat + 53;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons;
            }
        }
        DrawableTransformation.read();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    public final void IconCompatParcelizer(String str, boolean z) {
        boolean z2;
        int i = 2 % 2;
        lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24 = this.read;
        decode decodeVar = lambdaremoveglobalcallbackparameter24.serializer;
        str.getClass();
        lambdasetExternalDeviceIdInDelay51 lambdasetexternaldeviceidindelay51Write = this.write.write();
        if (!lambdasetexternaldeviceidindelay51Write.read) {
            Timber.RemoteActionCompatParcelizer.getClass();
            IconCompatParcelizer();
            return;
        }
        MutableStateFlow mutableStateFlow = this.RemoteActionCompatParcelizer;
        Object obj = mutableStateFlow.read();
        lambdaremoveGlobalPartnerParameter26 lambdaremoveglobalpartnerparameter26 = lambdaremoveGlobalPartnerParameter26.CONNECTING;
        int i2 = 0;
        if (obj != lambdaremoveglobalpartnerparameter26) {
            int i3 = MediaDescriptionCompat + 95;
            PlaybackStateCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (mutableStateFlow.read() == lambdaremoveGlobalPartnerParameter26.CONNECTED) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, str}, getCieXyz.write())).booleanValue() && z2) {
            Timber.RemoteActionCompatParcelizer.getClass();
            return;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, str}, getCieXyz.write())).booleanValue() && z2) {
            int i5 = PlaybackStateCompat + 85;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (!lambdasetexternaldeviceidindelay51Write.RemoteActionCompatParcelizer) {
                int i7 = MediaDescriptionCompat + 27;
                PlaybackStateCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    IconCompatParcelizer("Token refreshed but reconnect disabled by configuration; keeping current connection");
                    return;
                } else {
                    IconCompatParcelizer("Token refreshed but reconnect disabled by configuration; keeping current connection");
                    throw null;
                }
            }
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, str}, getCieXyz.write())).booleanValue() && z2 && lambdaremoveglobalcallbackparameter24.RemoteActionCompatParcelizer()) {
            decodeVar.logEvent("rtc_token_update_reconnect", null);
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            str2.equals(str);
            int i8 = PlaybackStateCompat + 113;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        if (z) {
            int i10 = MediaDescriptionCompat + 3;
            PlaybackStateCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        }
        IconCompatParcelizer();
        this.IconCompatParcelizer = str;
        mutableStateFlow.IconCompatParcelizer(lambdaremoveglobalpartnerparameter26);
        if (lambdaremoveglobalcallbackparameter24.RemoteActionCompatParcelizer()) {
            decodeVar.logEvent("rtc_state_connecting", null);
        }
        r8lambdaH4El2AuEYS7SZhBdBoHhFTah6iY r8lambdah4el2aueys7szhbdbohhftah6iy = new r8lambdaH4El2AuEYS7SZhBdBoHhFTah6iY();
        r8lambdah4el2aueys7szhbdbohhftah6iy.serializer = true;
        r8lambdah4el2aueys7szhbdbohhftah6iy.write = new String[]{"websocket"};
        r8lambdah4el2aueys7szhbdbohhftah6iy.serializer = false;
        r8lambdah4el2aueys7szhbdbohhftah6iy.PlaybackStateCompat = true;
        Map mapSingletonMap = Collections.singletonMap("Authorization", (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{"Bearer ".concat(str)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
        mapSingletonMap.getClass();
        r8lambdah4el2aueys7szhbdbohhftah6iy.MediaSessionCompatQueueItem = mapSingletonMap;
        try {
            networkUnavailablelambda0 networkunavailablelambda0IconCompatParcelizer = r8lambda9ZY36wGhLruV8pSk7W6zmogPxg.IconCompatParcelizer(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(lambdasetexternaldeviceidindelay51Write.write, '/') + "/rider-app", r8lambdah4el2aueys7szhbdbohhftah6iy);
            IconCompatParcelizer(networkunavailablelambda0IconCompatParcelizer);
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new contentCardsUpdatelambda2(networkunavailablelambda0IconCompatParcelizer, i2));
            this.MediaBrowserCompatMediaItem = networkunavailablelambda0IconCompatParcelizer;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to create Socket.IO connection", new Object[0]);
            e.getMessage();
            mutableStateFlow.IconCompatParcelizer(lambdaremoveGlobalPartnerParameter26.DISCONNECTED);
        }
    }
}
