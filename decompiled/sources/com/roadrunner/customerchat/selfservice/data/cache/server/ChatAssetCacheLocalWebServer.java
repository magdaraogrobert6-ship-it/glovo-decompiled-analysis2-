package com.roadrunner.customerchat.selfservice.data.cache.server;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import io.sentry.util.UrlUtils;
import java.io.IOException;
import java.net.BindException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.channels.IllegalBlockingModeException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.accesssetCachecp;
import o.createFromParcel;
import o.getCieXyz;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.pushStringAnnotation;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatAssetCacheLocalWebServer {
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final SharedFlowImpl IconCompatParcelizer;
    public final WebChatNativeCacheDataStore MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public BlockRunner MediaSessionCompatQueueItem;
    public final Object MediaSessionCompatResultReceiverWrapper;
    public final ContextScope MediaSessionCompatToken;
    public final ContextScope ParcelableVolumeInfo;
    public final SecureRandom PlaybackStateCompat;
    public ServerSocket PlaybackStateCompatCustomAction;
    public final InitializeAppStartupItemsImpl RatingCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RemoteActionCompatParcelizer;
    public final ConcurrentHashMap.KeySetView read;
    public final SharedFlowImpl serializer;
    public Integer write;

    public ChatAssetCacheLocalWebServer(isOpenInternalroom_runtime isopeninternalroom_runtime, WebChatNativeCacheDataStore webChatNativeCacheDataStore, InitializeAppStartupItemsImpl initializeAppStartupItemsImpl) {
        isopeninternalroom_runtime.getClass();
        webChatNativeCacheDataStore.getClass();
        initializeAppStartupItemsImpl.getClass();
        this.MediaBrowserCompatMediaItem = webChatNativeCacheDataStore;
        this.RatingCompat = initializeAppStartupItemsImpl;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
        this.ParcelableVolumeInfo = YieldKt.RemoteActionCompatParcelizer(defaultIoScheduler.plus(UrlUtils.serializer()));
        this.MediaSessionCompatToken = YieldKt.RemoteActionCompatParcelizer(CoroutineDispatcher.limitedParallelism$default(defaultIoScheduler, 8, null, 2, null).plus(UrlUtils.serializer()));
        this.PlaybackStateCompat = new SecureRandom();
        this.MediaSessionCompatResultReceiverWrapper = new Object();
        this.read = ConcurrentHashMap.newKeySet();
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, null, 5);
        this.IconCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        this.serializer = sharedFlowImplRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #0 {, blocks: (B:26:0x0063, B:28:0x0067, B:30:0x006d, B:33:0x009d, B:34:0x00c4, B:35:0x00e0, B:38:0x00ec), top: B:54:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00ec, please report this as an issue */
    public final Object start(BlockRunner blockRunner, ContinuationImpl continuationImpl) {
        pushStringAnnotation pushstringannotation;
        BlockRunner blockRunner2;
        ServerSocket serverSocketIconCompatParcelizer;
        accesssetCachecp accesssetcachecp;
        Integer num;
        if (continuationImpl instanceof pushStringAnnotation) {
            pushstringannotation = (pushStringAnnotation) continuationImpl;
            int i = pushstringannotation.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                pushstringannotation.write = i - Integer.MIN_VALUE;
            } else {
                pushstringannotation = new pushStringAnnotation(this, continuationImpl);
            }
        } else {
            pushstringannotation = new pushStringAnnotation(this, continuationImpl);
        }
        pushStringAnnotation pushstringannotation2 = pushstringannotation;
        Object objRemoteActionCompatParcelizer = pushstringannotation2.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pushstringannotation2.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            WebChatNativeCacheDataStore webChatNativeCacheDataStore = this.MediaBrowserCompatMediaItem;
            blockRunner2 = blockRunner;
            pushstringannotation2.IconCompatParcelizer = blockRunner2;
            pushstringannotation2.write = 1;
            objRemoteActionCompatParcelizer = webChatNativeCacheDataStore.RemoteActionCompatParcelizer(WebChatNativeCacheDataStore.serializer, pushstringannotation2);
            if (objRemoteActionCompatParcelizer == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    accesssetCachecp accesssetcachecp2 = pushstringannotation2.read;
                    ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                    return accesssetcachecp2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            blockRunner2 = pushstringannotation2.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        }
        BlockRunner blockRunner3 = blockRunner2;
        Integer num2 = (Integer) objRemoteActionCompatParcelizer;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            ServerSocket serverSocket = this.PlaybackStateCompatCustomAction;
            if (serverSocket != null && !serverSocket.isClosed()) {
                String str = this.MediaDescriptionCompat;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, blockRunner3.MediaMetadataCompat()}, getCieXyz.write())).booleanValue() && str != null) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Local web server already running for this release, ignoring duplicate start()", new Object[0]);
                    accesssetcachecp = new accesssetCachecp("http://127.0.0.1:" + this.write, str, blockRunner3.MediaMetadataCompat());
                    num = null;
                } else {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Local web server release changed, restarting for " + blockRunner3.MediaMetadataCompat(), new Object[0]);
                    write();
                    serverSocketIconCompatParcelizer = IconCompatParcelizer(iIntValue);
                    if (serverSocketIconCompatParcelizer == null) {
                        accesssetcachecp = null;
                        num = null;
                    } else {
                        String str2 = "http://127.0.0.1:" + serverSocketIconCompatParcelizer.getLocalPort();
                        byte[] bArr = new byte[32];
                        this.PlaybackStateCompat.nextBytes(bArr);
                        String strEncodeToString = Base64.getUrlEncoder().withoutPadding().encodeToString(bArr);
                        strEncodeToString.getClass();
                        this.MediaDescriptionCompat = strEncodeToString;
                        this.PlaybackStateCompatCustomAction = serverSocketIconCompatParcelizer;
                        this.write = new Integer(serverSocketIconCompatParcelizer.getLocalPort());
                        this.MediaMetadataCompat = blockRunner3.MediaMetadataCompat();
                        this.MediaSessionCompatQueueItem = blockRunner3;
                        Integer num3 = new Integer(serverSocketIconCompatParcelizer.getLocalPort());
                        this.RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(this.ParcelableVolumeInfo, null, null, new SideMenuCacheImpl.AnonymousClass2(this, serverSocketIconCompatParcelizer, blockRunner3, strEncodeToString, null, 6), 3);
                        accesssetcachecp = new accesssetCachecp(str2, strEncodeToString, blockRunner3.MediaMetadataCompat());
                        num = num3;
                    }
                }
            } else {
                serverSocketIconCompatParcelizer = IconCompatParcelizer(iIntValue);
                if (serverSocketIconCompatParcelizer == null) {
                    accesssetcachecp = null;
                    num = null;
                } else {
                    String str3 = "http://127.0.0.1:" + serverSocketIconCompatParcelizer.getLocalPort();
                    byte[] bArr2 = new byte[32];
                    this.PlaybackStateCompat.nextBytes(bArr2);
                    String strEncodeToString2 = Base64.getUrlEncoder().withoutPadding().encodeToString(bArr2);
                    strEncodeToString2.getClass();
                    this.MediaDescriptionCompat = strEncodeToString2;
                    this.PlaybackStateCompatCustomAction = serverSocketIconCompatParcelizer;
                    this.write = new Integer(serverSocketIconCompatParcelizer.getLocalPort());
                    this.MediaMetadataCompat = blockRunner3.MediaMetadataCompat();
                    this.MediaSessionCompatQueueItem = blockRunner3;
                    Integer num4 = new Integer(serverSocketIconCompatParcelizer.getLocalPort());
                    this.RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(this.ParcelableVolumeInfo, null, null, new SideMenuCacheImpl.AnonymousClass2(this, serverSocketIconCompatParcelizer, blockRunner3, strEncodeToString2, null, 6), 3);
                    accesssetcachecp = new accesssetCachecp(str3, strEncodeToString2, blockRunner3.MediaMetadataCompat());
                    num = num4;
                }
            }
        }
        if (accesssetcachecp == null) {
            return null;
        }
        if (num != null) {
            int iIntValue2 = num.intValue();
            WebChatNativeCacheDataStore webChatNativeCacheDataStore2 = this.MediaBrowserCompatMediaItem;
            pushstringannotation2.IconCompatParcelizer = null;
            pushstringannotation2.read = accesssetcachecp;
            pushstringannotation2.write = 2;
            webChatNativeCacheDataStore2.getClass();
            Object objUpdateValue = webChatNativeCacheDataStore2.updateValue(WebChatNativeCacheDataStore.serializer, new Integer(iIntValue2), pushstringannotation2);
            if (objUpdateValue != coroutineSingletons) {
                objUpdateValue = createFromParcel.INSTANCE;
            }
            if (objUpdateValue == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return accesssetcachecp;
    }

    public static void RemoteActionCompatParcelizer(ServerSocket serverSocket) {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 13;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                serverSocket.close();
                Object obj = null;
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            serverSocket.close();
            int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 67;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 93 / 0;
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Chat asset local web server failed to close its socket after setup failure", new Object[0]);
        }
    }

    public final void write() throws Exception {
        int i = 2 % 2;
        try {
            ServerSocket serverSocket = this.PlaybackStateCompatCustomAction;
            if (serverSocket != null) {
                int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 47;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    serverSocket.close();
                    int i3 = 32 / 0;
                } else {
                    serverSocket.close();
                }
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Chat asset local web server failed to close its socket", new Object[0]);
        }
        this.PlaybackStateCompatCustomAction = null;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.RemoteActionCompatParcelizer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 69;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                throw null;
            }
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.RemoteActionCompatParcelizer = null;
        ConcurrentHashMap.KeySetView<Socket> keySetView = this.read;
        keySetView.getClass();
        for (Socket socket : keySetView) {
            socket.getClass();
            try {
                socket.close();
            } catch (IOException e2) {
                Timber.RemoteActionCompatParcelizer.serializer(e2, "Chat asset local web server failed to close a connection during shutdown", new Object[0]);
            } catch (Exception e3) {
                throw e3;
            }
        }
        keySetView.clear();
        this.write = null;
        this.MediaMetadataCompat = null;
        this.MediaSessionCompatQueueItem = null;
        this.MediaDescriptionCompat = null;
    }

    public static ServerSocket IconCompatParcelizer(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = 0;
        while (i4 < 2) {
            int i5 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 71;
            int i6 = i5 % Fields.SpotShadowColor;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (i4 == 0) {
                i2 = i;
            } else {
                int i7 = i6 + 107;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i2 = 0;
            }
            try {
                ServerSocket serverSocket = new ServerSocket();
                try {
                    serverSocket.setReuseAddress(true);
                    serverSocket.bind(new InetSocketAddress(InetAddress.getByName("127.0.0.1"), i2));
                    return serverSocket;
                } catch (IOException e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to bind the local web server socket, not able to start the local web server.", new Object[0]);
                    RemoteActionCompatParcelizer(serverSocket);
                    return null;
                } catch (IllegalArgumentException e2) {
                    Timber.RemoteActionCompatParcelizer.write(e2);
                    RemoteActionCompatParcelizer(serverSocket);
                    return null;
                } catch (SecurityException e3) {
                    Timber.RemoteActionCompatParcelizer.write(e3);
                    RemoteActionCompatParcelizer(serverSocket);
                    return null;
                } catch (BindException e4) {
                    RemoteActionCompatParcelizer(serverSocket);
                    i4++;
                    Timber.RemoteActionCompatParcelizer.serializer(e4, af$$ExternalSyntheticOutline0.m(i2, i4, "Port ", " is occupied (attempt ", "/2), retrying with an ephemeral port"), new Object[0]);
                } catch (SocketException e5) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e5, d$$ExternalSyntheticOutline0.m(i4 + 1, "Socket error while setting up local web server (attempt ", "/2)"), new Object[0]);
                    RemoteActionCompatParcelizer(serverSocket);
                    int i9 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 79;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        int i10 = 32 / 0;
                    }
                    return null;
                }
            } catch (IOException e6) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e6, "Failed to create a server socket, not able to start the local web server.", new Object[0]);
                return null;
            }
        }
        Timber.RemoteActionCompatParcelizer.write(new Exception("Failed to bind the local web server socket after 2 attempts."));
        return null;
    }

    public static final void read(ChatAssetCacheLocalWebServer chatAssetCacheLocalWebServer, ServerSocket serverSocket, BlockRunner blockRunner, String str) {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 63;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            ConcurrentHashMap.KeySetView keySetView = chatAssetCacheLocalWebServer.read;
            obj.hashCode();
            throw null;
        }
        ConcurrentHashMap.KeySetView keySetView2 = chatAssetCacheLocalWebServer.read;
        while (!serverSocket.isClosed()) {
            try {
                Socket socketAccept = serverSocket.accept();
                if (serverSocket.isClosed()) {
                    socketAccept.getClass();
                    try {
                        socketAccept.close();
                        return;
                    } catch (IOException e) {
                        Timber.RemoteActionCompatParcelizer.serializer(e, "Chat asset local web server failed to close a connection during shutdown", new Object[0]);
                        return;
                    }
                }
                if (keySetView2.size() >= 8) {
                    int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 113;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Local web server at capacity (8), rejecting connection", new Object[0]);
                        socketAccept.getClass();
                    } else {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Local web server at capacity (8), rejecting connection", new Object[0]);
                        socketAccept.getClass();
                    }
                    try {
                        socketAccept.close();
                    } catch (IOException e2) {
                        Timber.RemoteActionCompatParcelizer.serializer(e2, "Chat asset local web server failed to close a connection during shutdown", new Object[0]);
                    }
                } else {
                    keySetView2.add(socketAccept);
                    BuildersKt.RemoteActionCompatParcelizer(chatAssetCacheLocalWebServer.MediaSessionCompatToken, null, null, new SideMenuCacheImpl.AnonymousClass2(chatAssetCacheLocalWebServer, socketAccept, blockRunner, str, null, 5), 3);
                }
            } catch (SecurityException e3) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e3, "Chat asset local web server denied permission to accept a connection, stopping", new Object[0]);
                return;
            } catch (SocketException unused) {
                return;
            } catch (IOException e4) {
                if (serverSocket.isClosed()) {
                    int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 51;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return;
                } else {
                    Timber.RemoteActionCompatParcelizer.serializer(e4, "Chat asset local web server failed to accept a connection, keep going", new Object[0]);
                    int i6 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 79;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
            } catch (IllegalBlockingModeException e5) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e5, "Chat asset local web server accept() failed due to an illegal blocking mode change, stopping", new Object[0]);
                return;
            } catch (Exception e6) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e6, "Chat asset local web server's accept loop terminated unexpectedly", new Object[0]);
                return;
            }
        }
    }
}
