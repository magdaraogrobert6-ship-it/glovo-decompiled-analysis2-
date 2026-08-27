package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.Protocol;
import com.sentiance.okhttp3.internal.connection.RouteException;
import com.sentiance.okhttp3.internal.http2.ErrorCode;
import com.sentiance.okhttp3.internal.http2.e$h;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE extends getContextandroid_sdk_base_release {
    public isFallbackFirebaseMessagingServiceEnabled IconCompatParcelizer;
    public readResourceValuelambda1 MediaBrowserCompatMediaItem;
    public Protocol MediaDescriptionCompat;
    public readResourceValuelambda2 MediaMetadataCompat;
    public getGenericEnumSetFromStringSet MediaSessionCompatQueueItem;
    public int ParcelableVolumeInfo;
    public boolean RatingCompat;
    public Socket RemoteActionCompatParcelizer;
    public Socket read;
    public final getVersionCode serializer;
    public final setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release write;
    public int PlaybackStateCompatCustomAction = 1;
    public final ArrayList MediaSessionCompatToken = new ArrayList();
    public long PlaybackStateCompat = Long.MAX_VALUE;

    public r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE(getVersionCode getversioncode, setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release) {
        this.serializer = getversioncode;
        this.write = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = this.write;
        sb.append(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read.RemoteActionCompatParcelizer.write);
        sb.append(":");
        sb.append(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read.RemoteActionCompatParcelizer.MediaMetadataCompat);
        sb.append(", proxy=");
        sb.append(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.write);
        sb.append(" hostAddress=");
        sb.append(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.RemoteActionCompatParcelizer);
        sb.append(" cipherSuite=");
        isFallbackFirebaseMessagingServiceEnabled isfallbackfirebasemessagingserviceenabled = this.IconCompatParcelizer;
        if (isfallbackfirebasemessagingserviceenabled != null) {
            obj = isfallbackfirebasemessagingserviceenabled.IconCompatParcelizer;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.MediaDescriptionCompat);
        sb.append('}');
        return sb.toString();
    }

    public final void write(int i, int i2, int i3, boolean z, setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds) throws Throwable {
        if (this.MediaDescriptionCompat != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("already connected");
            return;
        }
        setSmallNotificationIcon setsmallnotificationicon = this.write.read;
        List list = setsmallnotificationicon.RatingCompat;
        r8lambdaKeFC04eKmBbbj1Gm_PcebLXGOQY r8lambdakefc04ekmbbbj1gm_pceblxgoqy = new r8lambdaKeFC04eKmBbbj1Gm_PcebLXGOQY(list);
        if (setsmallnotificationicon.MediaSessionCompatQueueItem == null) {
            if (!list.contains(getTriggerActionMinimumTimeIntervalInSeconds.RemoteActionCompatParcelizer)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.write.read.RemoteActionCompatParcelizer.write;
            if (!getLoggerInitialLogLevel.RatingCompat.read(str)) {
                throw new RouteException(new UnknownServiceException(ff$$ExternalSyntheticOutline0.m("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (setsmallnotificationicon.write.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = this.write;
                if (settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read.MediaSessionCompatQueueItem != null && settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.write.type() == Proxy.Type.HTTP) {
                    serializer(i, i2, i3, settriggeractionminimumtimeintervalseconds);
                    if (this.read != null) {
                        break;
                    } else {
                        break;
                    }
                }
                IconCompatParcelizer(i, i2, settriggeractionminimumtimeintervalseconds);
                RemoteActionCompatParcelizer(r8lambdakefc04ekmbbbj1gm_pceblxgoqy, settriggeractionminimumtimeintervalseconds);
                InetSocketAddress inetSocketAddress = this.write.RemoteActionCompatParcelizer;
                settriggeractionminimumtimeintervalseconds.getClass();
                break;
            } catch (IOException e) {
                r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(this.RemoteActionCompatParcelizer);
                r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(this.read);
                this.RemoteActionCompatParcelizer = null;
                this.read = null;
                this.MediaBrowserCompatMediaItem = null;
                this.MediaMetadataCompat = null;
                this.IconCompatParcelizer = null;
                this.MediaDescriptionCompat = null;
                this.MediaSessionCompatQueueItem = null;
                InetSocketAddress inetSocketAddress2 = this.write.RemoteActionCompatParcelizer;
                settriggeractionminimumtimeintervalseconds.getClass();
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    routeException.IconCompatParcelizer(e);
                }
                if (!z) {
                    throw routeException;
                }
                r8lambdakefc04ekmbbbj1gm_pceblxgoqy.serializer = true;
                if (!r8lambdakefc04ekmbbbj1gm_pceblxgoqy.write) {
                    throw routeException;
                }
                if (e instanceof ProtocolException) {
                    throw routeException;
                }
                if (e instanceof InterruptedIOException) {
                    throw routeException;
                }
                boolean z2 = e instanceof SSLHandshakeException;
                if (z2 && (e.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
                if (!z2) {
                    if (e instanceof SSLProtocolException) {
                        continue;
                    } else if (!(e instanceof SSLException)) {
                        throw routeException;
                    }
                }
            }
        }
        setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2 = this.write;
        if (settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2.read.MediaSessionCompatQueueItem != null && settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2.write.type() == Proxy.Type.HTTP && this.read == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.MediaSessionCompatQueueItem != null) {
            synchronized (this.serializer) {
                this.PlaybackStateCompatCustomAction = this.MediaSessionCompatQueueItem.IconCompatParcelizer();
            }
        }
    }

    public final void IconCompatParcelizer(int i, int i2, setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds) throws IOException {
        Socket socketCreateSocket;
        setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = this.write;
        Proxy proxy = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.write;
        InetSocketAddress inetSocketAddress = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.RemoteActionCompatParcelizer;
        setSmallNotificationIcon setsmallnotificationicon = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP) {
            socketCreateSocket = new Socket(proxy);
        } else {
            socketCreateSocket = setsmallnotificationicon.IconCompatParcelizer.createSocket();
        }
        this.read = socketCreateSocket;
        settriggeractionminimumtimeintervalseconds.getClass();
        this.read.setSoTimeout(i2);
        try {
            getLoggerInitialLogLevel.RatingCompat.write(this.read, inetSocketAddress, i);
            try {
                this.MediaBrowserCompatMediaItem = new readResourceValuelambda1(getResourceIdentifier.serializer(this.read));
                this.MediaMetadataCompat = new readResourceValuelambda2(getResourceIdentifier.RemoteActionCompatParcelizer(this.read));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void RemoteActionCompatParcelizer(r8lambdaKeFC04eKmBbbj1Gm_PcebLXGOQY r8lambdakefc04ekmbbbj1gm_pceblxgoqy, setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds) throws Throwable {
        SSLSocket sSLSocket;
        Protocol protocol;
        setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = this.write;
        setSmallNotificationIcon setsmallnotificationicon = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read;
        if (setsmallnotificationicon.MediaSessionCompatQueueItem == null) {
            List list = setsmallnotificationicon.write;
            Protocol protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
            boolean zContains = list.contains(protocol2);
            Socket socket = this.read;
            if (zContains) {
                this.RemoteActionCompatParcelizer = socket;
                this.MediaDescriptionCompat = protocol2;
                serializer();
                return;
            } else {
                this.RemoteActionCompatParcelizer = socket;
                this.MediaDescriptionCompat = Protocol.HTTP_1_1;
                return;
            }
        }
        settriggeractionminimumtimeintervalseconds.getClass();
        setSmallNotificationIcon setsmallnotificationicon2 = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read;
        SSLSocketFactory sSLSocketFactory = setsmallnotificationicon2.MediaSessionCompatQueueItem;
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled = setsmallnotificationicon2.RemoteActionCompatParcelizer;
        try {
            try {
                Socket socket2 = this.read;
                String str = ishtmlinappmessageapplywindowinsetsenabled.write;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket2, str, ishtmlinappmessageapplywindowinsetsenabled.MediaMetadataCompat, true);
                try {
                    boolean z = r8lambdakefc04ekmbbbj1gm_pceblxgoqy.write(sSLSocket).serializer;
                    if (z) {
                        getLoggerInitialLogLevel.RatingCompat.RemoteActionCompatParcelizer(sSLSocket, str, setsmallnotificationicon2.write);
                    }
                    sSLSocket.startHandshake();
                    SSLSession session = sSLSocket.getSession();
                    isFallbackFirebaseMessagingServiceEnabled isfallbackfirebasemessagingserviceenabled = isFallbackFirebaseMessagingServiceEnabled.read(session);
                    List list2 = isfallbackfirebasemessagingserviceenabled.write;
                    if (!setsmallnotificationicon2.MediaMetadataCompat.verify(str, session)) {
                        if (!list2.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) list2.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + str + " not verified:\n    certificate: " + com.sentiance.okhttp3.g.RemoteActionCompatParcelizer(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + getShouldUseWindowFlagSecureInActivities.IconCompatParcelizer(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + str + " not verified (no certificates)");
                    }
                    setsmallnotificationicon2.MediaBrowserCompatMediaItem.write(str, list2);
                    String strIconCompatParcelizer = z ? getLoggerInitialLogLevel.RatingCompat.IconCompatParcelizer(sSLSocket) : null;
                    this.RemoteActionCompatParcelizer = sSLSocket;
                    this.MediaBrowserCompatMediaItem = new readResourceValuelambda1(getResourceIdentifier.serializer(sSLSocket));
                    this.MediaMetadataCompat = new readResourceValuelambda2(getResourceIdentifier.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer));
                    this.IconCompatParcelizer = isfallbackfirebasemessagingserviceenabled;
                    if (strIconCompatParcelizer != null) {
                        protocol = Protocol.get(strIconCompatParcelizer);
                    } else {
                        protocol = Protocol.HTTP_1_1;
                    }
                    this.MediaDescriptionCompat = protocol;
                    getLoggerInitialLogLevel.RatingCompat.write(sSLSocket);
                    if (this.MediaDescriptionCompat == Protocol.HTTP_2) {
                        serializer();
                    }
                } catch (AssertionError e) {
                    e = e;
                    if (!r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (sSLSocket != null) {
                        getLoggerInitialLogLevel.RatingCompat.write(sSLSocket);
                    }
                    r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(sSLSocket);
                    throw th;
                }
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    public final boolean RemoteActionCompatParcelizer(isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled) {
        int i = ishtmlinappmessageapplywindowinsetsenabled.MediaMetadataCompat;
        String str = ishtmlinappmessageapplywindowinsetsenabled.write;
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled2 = this.write.read.RemoteActionCompatParcelizer;
        if (i == ishtmlinappmessageapplywindowinsetsenabled2.MediaMetadataCompat) {
            if (str.equals(ishtmlinappmessageapplywindowinsetsenabled2.write)) {
                return true;
            }
            isFallbackFirebaseMessagingServiceEnabled isfallbackfirebasemessagingserviceenabled = this.IconCompatParcelizer;
            if (isfallbackfirebasemessagingserviceenabled != null && getShouldUseWindowFlagSecureInActivities.write((X509Certificate) isfallbackfirebasemessagingserviceenabled.write.get(0), str)) {
                return true;
            }
        }
        return false;
    }

    public final void serializer(int i, int i2, int i3, setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds) throws IOException {
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release = new setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release();
        setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = this.write;
        setSmallNotificationIcon setsmallnotificationicon = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read;
        setSmallNotificationIcon setsmallnotificationicon2 = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read;
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled = setsmallnotificationicon.RemoteActionCompatParcelizer;
        if (ishtmlinappmessageapplywindowinsetsenabled != null) {
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.RemoteActionCompatParcelizer = ishtmlinappmessageapplywindowinsetsenabled;
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer("CONNECT", null);
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.IconCompatParcelizer("Host", r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(setsmallnotificationicon2.RemoteActionCompatParcelizer, true));
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.IconCompatParcelizer("Proxy-Connection", "Keep-Alive");
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.IconCompatParcelizer(ConstantKt.USER_AGENT_HEADER, "okhttp/3.12.10");
            setSessionTimeout setsessiontimeoutWrite = setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.write();
            setShouldUseWindowFlagSecureInActivities setshouldusewindowflagsecureinactivities = new setShouldUseWindowFlagSecureInActivities();
            setshouldusewindowflagsecureinactivities.RemoteActionCompatParcelizer = setsessiontimeoutWrite;
            setshouldusewindowflagsecureinactivities.read = Protocol.HTTP_1_1;
            setshouldusewindowflagsecureinactivities.write = 407;
            setshouldusewindowflagsecureinactivities.IconCompatParcelizer = "Preemptive Authenticate";
            setshouldusewindowflagsecureinactivities.MediaSessionCompatQueueItem = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write;
            setshouldusewindowflagsecureinactivities.PlaybackStateCompat = -1L;
            setshouldusewindowflagsecureinactivities.MediaSessionCompatToken = -1L;
            setshouldusewindowflagsecureinactivities.MediaDescriptionCompat.IconCompatParcelizer("Proxy-Authenticate", "OkHttp-Preemptive");
            setshouldusewindowflagsecureinactivities.RemoteActionCompatParcelizer();
            setsmallnotificationicon2.serializer.getClass();
            isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled2 = setsessiontimeoutWrite.write;
            IconCompatParcelizer(i, i2, settriggeractionminimumtimeintervalseconds);
            String str = "CONNECT " + r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(ishtmlinappmessageapplywindowinsetsenabled2, true) + " HTTP/1.1";
            readResourceValuelambda1 readresourcevaluelambda1 = this.MediaBrowserCompatMediaItem;
            _get_brazeApiKey_lambda3 _get_brazeapikey_lambda3 = new _get_brazeApiKey_lambda3(null, null, readresourcevaluelambda1, this.MediaMetadataCompat);
            readresourcevaluelambda1.write.IconCompatParcelizer().read(i2);
            this.MediaMetadataCompat.serializer.IconCompatParcelizer().read(i3);
            _get_brazeapikey_lambda3.write(setsessiontimeoutWrite.read, str);
            _get_brazeapikey_lambda3.read();
            setShouldUseWindowFlagSecureInActivities setshouldusewindowflagsecureinactivities2 = _get_brazeapikey_lambda3.read(false);
            setshouldusewindowflagsecureinactivities2.RemoteActionCompatParcelizer = setsessiontimeoutWrite;
            setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingappRemoteActionCompatParcelizer = setshouldusewindowflagsecureinactivities2.RemoteActionCompatParcelizer();
            int i4 = setshouldpersistwebviewwhenbackgroundingappRemoteActionCompatParcelizer.serializer;
            long jRemoteActionCompatParcelizer = com.sentiance.okhttp3.internal.http.e.RemoteActionCompatParcelizer(setshouldpersistwebviewwhenbackgroundingappRemoteActionCompatParcelizer);
            if (jRemoteActionCompatParcelizer == -1) {
                jRemoteActionCompatParcelizer = 0;
            }
            _get_ephemeralEventKeys_lambda0 _get_ephemeraleventkeys_lambda0Write = _get_brazeapikey_lambda3.write(jRemoteActionCompatParcelizer);
            r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(_get_ephemeraleventkeys_lambda0Write, Integer.MAX_VALUE);
            _get_ephemeraleventkeys_lambda0Write.close();
            if (i4 == 200) {
                if (this.MediaBrowserCompatMediaItem.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper() && this.MediaMetadataCompat.read.MediaSessionCompatResultReceiverWrapper()) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("TLS tunnel buffered too many bytes!");
                return;
            }
            if (i4 == 407) {
                setsmallnotificationicon2.serializer.getClass();
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Failed to authenticate with proxy");
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(i4, "Unexpected response code for CONNECT: "));
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("url == null");
    }

    public final void serializer() throws SocketException {
        int i;
        this.RemoteActionCompatParcelizer.setSoTimeout(0);
        e$h e_h = new e$h();
        e_h.IconCompatParcelizer = getContextandroid_sdk_base_release.MediaSessionCompatResultReceiverWrapper;
        e_h.MediaSessionCompatQueueItem = true;
        Socket socket = this.RemoteActionCompatParcelizer;
        String str = this.write.read.RemoteActionCompatParcelizer.write;
        readResourceValuelambda1 readresourcevaluelambda1 = this.MediaBrowserCompatMediaItem;
        readResourceValuelambda2 readresourcevaluelambda2 = this.MediaMetadataCompat;
        e_h.write = socket;
        e_h.read = str;
        e_h.RemoteActionCompatParcelizer = readresourcevaluelambda1;
        e_h.serializer = readresourcevaluelambda2;
        e_h.IconCompatParcelizer = this;
        getGenericEnumSetFromStringSet getgenericenumsetfromstringset = new getGenericEnumSetFromStringSet(e_h);
        this.MediaSessionCompatQueueItem = getgenericenumsetfromstringset;
        com.sentiance.okhttp3.internal.http2.h hVar = getgenericenumsetfromstringset.write;
        synchronized (hVar) {
            if (!hVar.MediaSessionCompatQueueItem) {
                if (hVar.write) {
                    java.util.logging.Logger logger = com.sentiance.okhttp3.internal.http2.h.IconCompatParcelizer;
                    if (logger.isLoggable(Level.FINE)) {
                        String str2 = getContextandroid_sdk_base_releaseannotations.IconCompatParcelizer.read();
                        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
                        java.util.Locale locale = java.util.Locale.US;
                        logger.fine(">> CONNECTION " + str2);
                    }
                    hVar.RemoteActionCompatParcelizer.write(getContextandroid_sdk_base_releaseannotations.IconCompatParcelizer.MediaBrowserCompatMediaItem());
                    hVar.RemoteActionCompatParcelizer.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        com.sentiance.okhttp3.internal.http2.h hVar2 = getgenericenumsetfromstringset.write;
        onFling onfling = getgenericenumsetfromstringset.RemoteActionCompatParcelizer;
        synchronized (hVar2) {
            if (!hVar2.MediaSessionCompatQueueItem) {
                hVar2.RemoteActionCompatParcelizer(0, Integer.bitCount(onfling.read) * 6, (byte) 4, (byte) 0);
                int i2 = 0;
                while (i2 < 10) {
                    if (((1 << i2) & onfling.read) != 0) {
                        if (i2 == 4) {
                            i = 3;
                        } else {
                            i = i2 == 7 ? 4 : i2;
                        }
                        hVar2.RemoteActionCompatParcelizer.RatingCompat(i);
                        hVar2.RemoteActionCompatParcelizer.MediaMetadataCompat(onfling.write[i2]);
                    }
                    i2++;
                }
                hVar2.RemoteActionCompatParcelizer.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int iIconCompatParcelizer = getgenericenumsetfromstringset.RemoteActionCompatParcelizer.IconCompatParcelizer();
        if (iIconCompatParcelizer != 65535) {
            getgenericenumsetfromstringset.write.read(0, iIconCompatParcelizer - 65535);
        }
        new Thread(getgenericenumsetfromstringset.MediaDescriptionCompat).start();
    }

    public final boolean IconCompatParcelizer(setSmallNotificationIcon setsmallnotificationicon, setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release) {
        if (this.MediaSessionCompatToken.size() >= this.PlaybackStateCompatCustomAction || this.RatingCompat) {
            return false;
        }
        setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
        setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2 = this.write;
        setSmallNotificationIcon setsmallnotificationicon2 = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2.read;
        settriggeractionminimumtimeintervalseconds.getClass();
        boolean z = setsmallnotificationicon2.read(setsmallnotificationicon);
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled = setsmallnotificationicon.RemoteActionCompatParcelizer;
        if (!z) {
            return false;
        }
        if (ishtmlinappmessageapplywindowinsetsenabled.write.equals(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2.read.RemoteActionCompatParcelizer.write)) {
            return true;
        }
        if (this.MediaSessionCompatQueueItem == null || settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release == null) {
            return false;
        }
        Proxy.Type type = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.write.type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2.write.type() != type2 || !settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2.RemoteActionCompatParcelizer.equals(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.RemoteActionCompatParcelizer) || settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.read.MediaMetadataCompat != getShouldUseWindowFlagSecureInActivities.serializer || !RemoteActionCompatParcelizer(ishtmlinappmessageapplywindowinsetsenabled)) {
            return false;
        }
        try {
            setsmallnotificationicon.MediaBrowserCompatMediaItem.write(ishtmlinappmessageapplywindowinsetsenabled.write, this.IconCompatParcelizer.write);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final _get_applicationIconResourceId_lambda0 IconCompatParcelizer(isFirebaseCloudMessagingRegistrationEnabled isfirebasecloudmessagingregistrationenabled, _get_brazeApiKey_lambda1 _get_brazeapikey_lambda1, r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw) throws SocketException {
        int i = _get_brazeapikey_lambda1.MediaDescriptionCompat;
        if (this.MediaSessionCompatQueueItem != null) {
            return new com.sentiance.okhttp3.internal.http2.d(isfirebasecloudmessagingregistrationenabled, _get_brazeapikey_lambda1, r8lambdat8fev0yhsugjmgcolxj0pkxlpw, this.MediaSessionCompatQueueItem);
        }
        this.RemoteActionCompatParcelizer.setSoTimeout(i);
        this.MediaBrowserCompatMediaItem.write.IconCompatParcelizer().read(i);
        this.MediaMetadataCompat.serializer.IconCompatParcelizer().read(_get_brazeapikey_lambda1.PlaybackStateCompat);
        return new _get_brazeApiKey_lambda3(isfirebasecloudmessagingregistrationenabled, r8lambdat8fev0yhsugjmgcolxj0pkxlpw, this.MediaBrowserCompatMediaItem, this.MediaMetadataCompat);
    }

    @Override // o.getContextandroid_sdk_base_release
    public final void write(getDeviceObjectAllowlist getdeviceobjectallowlist) {
        getdeviceobjectallowlist.write(ErrorCode.REFUSED_STREAM);
    }

    @Override // o.getContextandroid_sdk_base_release
    public final void RemoteActionCompatParcelizer(getGenericEnumSetFromStringSet getgenericenumsetfromstringset) {
        synchronized (this.serializer) {
            this.PlaybackStateCompatCustomAction = getgenericenumsetfromstringset.IconCompatParcelizer();
        }
    }
}
