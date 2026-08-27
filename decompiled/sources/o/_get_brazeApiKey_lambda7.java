package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.location.LocationRequest;
import com.huawei.location.base.activity.constant.ActivityRecognitionConstants;
import com.sentiance.okhttp3.internal.connection.RouteException;
import com.sentiance.okhttp3.internal.http2.ConnectionShutdownException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_brazeApiKey_lambda7 implements isFirebaseMessagingServiceOnNewTokenRegistrationEnabled {
    public volatile boolean IconCompatParcelizer;
    public volatile r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw RemoteActionCompatParcelizer;
    public final isFirebaseCloudMessagingRegistrationEnabled read;
    public Object serializer;

    /* JADX WARN: Code duplicated, block: B:48:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0111  */
    public final setSessionTimeout serializer(setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release) throws ProtocolException {
        String str;
        isGeofencesEnabled isgeofencesenabled;
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled;
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer;
        boolean zEquals;
        String str2;
        String str3;
        setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp2 = setshouldpersistwebviewwhenbackgroundingapp.MediaDescriptionCompat;
        setSessionTimeout setsessiontimeout = setshouldpersistwebviewwhenbackgroundingapp.write;
        int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
        String str4 = setsessiontimeout.serializer;
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled2 = setsessiontimeout.write;
        isFirebaseCloudMessagingRegistrationEnabled isfirebasecloudmessagingregistrationenabled = this.read;
        if (i == 307 || i == 308) {
            if (str4.equals("GET") || str4.equals("HEAD")) {
                if (isfirebasecloudmessagingregistrationenabled.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss && (str = setshouldpersistwebviewwhenbackgroundingapp.read(ActivityRecognitionConstants.LOCATION_MODULE, null)) != null) {
                    ishtmlinappmessageapplywindowinsetsenabled2.getClass();
                    try {
                        isgeofencesenabled = new isGeofencesEnabled();
                        isgeofencesenabled.write(ishtmlinappmessageapplywindowinsetsenabled2, str);
                    } catch (IllegalArgumentException unused) {
                        isgeofencesenabled = null;
                    }
                    if (isgeofencesenabled != null) {
                        ishtmlinappmessageapplywindowinsetsenabled = isgeofencesenabled.read();
                    } else {
                        ishtmlinappmessageapplywindowinsetsenabled = null;
                    }
                    if (ishtmlinappmessageapplywindowinsetsenabled != null && (ishtmlinappmessageapplywindowinsetsenabled.serializer.equals(ishtmlinappmessageapplywindowinsetsenabled2.serializer) || isfirebasecloudmessagingregistrationenabled.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8)) {
                        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer = setsessiontimeout.serializer();
                        if (r8lambdatq6ACLpcPQ5kM_9Qo1nOx0ZDGDM.serializer(str4)) {
                            zEquals = str4.equals("PROPFIND");
                            if (str4.equals("PROPFIND")) {
                                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer(str4, zEquals ? setsessiontimeout.RemoteActionCompatParcelizer : null);
                            } else {
                                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer("GET", null);
                            }
                            if (!zEquals) {
                                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.IconCompatParcelizer("Transfer-Encoding");
                                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.IconCompatParcelizer("Content-Length");
                                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.IconCompatParcelizer(ConstantKt.CONTENT_TYPE_HEADER);
                            }
                        }
                        if (!IconCompatParcelizer(setshouldpersistwebviewwhenbackgroundingapp, ishtmlinappmessageapplywindowinsetsenabled)) {
                            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.IconCompatParcelizer("Authorization");
                        }
                        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.RemoteActionCompatParcelizer = ishtmlinappmessageapplywindowinsetsenabled;
                        return setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.write();
                    }
                }
            }
        } else {
            if (i == 401) {
                isfirebasecloudmessagingregistrationenabled.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getClass();
                return null;
            }
            if (i != 503) {
                if (i == 407) {
                    if (settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.write.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    isfirebasecloudmessagingregistrationenabled.ResultReceiver.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case LocationRequest.PRIORITY_INDOOR /* 300 */:
                        case LocationRequest.PRIORITY_MAG_POSITION /* 301 */:
                        case 302:
                        case 303:
                            if (isfirebasecloudmessagingregistrationenabled.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                                ishtmlinappmessageapplywindowinsetsenabled2.getClass();
                                isgeofencesenabled = new isGeofencesEnabled();
                                isgeofencesenabled.write(ishtmlinappmessageapplywindowinsetsenabled2, str);
                                if (isgeofencesenabled != null) {
                                    ishtmlinappmessageapplywindowinsetsenabled = isgeofencesenabled.read();
                                } else {
                                    ishtmlinappmessageapplywindowinsetsenabled = null;
                                }
                                if (ishtmlinappmessageapplywindowinsetsenabled != null) {
                                    setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer = setsessiontimeout.serializer();
                                    if (r8lambdatq6ACLpcPQ5kM_9Qo1nOx0ZDGDM.serializer(str4)) {
                                        zEquals = str4.equals("PROPFIND");
                                        if (str4.equals("PROPFIND")) {
                                            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer("GET", null);
                                        } else {
                                            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer(str4, zEquals ? setsessiontimeout.RemoteActionCompatParcelizer : null);
                                        }
                                        if (!zEquals) {
                                            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.IconCompatParcelizer("Transfer-Encoding");
                                            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.IconCompatParcelizer("Content-Length");
                                            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.IconCompatParcelizer(ConstantKt.CONTENT_TYPE_HEADER);
                                        }
                                    }
                                    if (!IconCompatParcelizer(setshouldpersistwebviewwhenbackgroundingapp, ishtmlinappmessageapplywindowinsetsenabled)) {
                                        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.IconCompatParcelizer("Authorization");
                                    }
                                    setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.RemoteActionCompatParcelizer = ishtmlinappmessageapplywindowinsetsenabled;
                                    return setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.write();
                                }
                            }
                        default:
                            return null;
                    }
                } else if (isfirebasecloudmessagingregistrationenabled.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg && ((setshouldpersistwebviewwhenbackgroundingapp2 == null || setshouldpersistwebviewwhenbackgroundingapp2.serializer != 408) && ((str3 = setshouldpersistwebviewwhenbackgroundingapp.read("Retry-After", null)) == null || (str3.matches("\\d+") && Integer.valueOf(str3).intValue() <= 0)))) {
                    return setsessiontimeout;
                }
            } else if ((setshouldpersistwebviewwhenbackgroundingapp2 == null || setshouldpersistwebviewwhenbackgroundingapp2.serializer != 503) && (str2 = setshouldpersistwebviewwhenbackgroundingapp.read("Retry-After", null)) != null && str2.matches("\\d+") && Integer.valueOf(str2).intValue() == 0) {
                return setsessiontimeout;
            }
        }
        return null;
    }

    public _get_brazeApiKey_lambda7(isFirebaseCloudMessagingRegistrationEnabled isfirebasecloudmessagingregistrationenabled) {
        this.read = isfirebasecloudmessagingregistrationenabled;
    }

    public final setSmallNotificationIcon RemoteActionCompatParcelizer(isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled) {
        SSLSocketFactory sSLSocketFactory;
        getShouldUseWindowFlagSecureInActivities getshouldusewindowflagsecureinactivities;
        com.sentiance.okhttp3.g gVar;
        boolean zEquals = ishtmlinappmessageapplywindowinsetsenabled.serializer.equals(com.adjust.sdk.Constants.SCHEME);
        isFirebaseCloudMessagingRegistrationEnabled isfirebasecloudmessagingregistrationenabled = this.read;
        if (zEquals) {
            sSLSocketFactory = isfirebasecloudmessagingregistrationenabled.MediaSessionCompatResultReceiverWrapper;
            getshouldusewindowflagsecureinactivities = isfirebasecloudmessagingregistrationenabled.ParcelableVolumeInfo;
            gVar = isfirebasecloudmessagingregistrationenabled.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        } else {
            sSLSocketFactory = null;
            getshouldusewindowflagsecureinactivities = null;
            gVar = null;
        }
        return new setSmallNotificationIcon(ishtmlinappmessageapplywindowinsetsenabled.write, ishtmlinappmessageapplywindowinsetsenabled.MediaMetadataCompat, isfirebasecloudmessagingregistrationenabled.ComponentActivity, isfirebasecloudmessagingregistrationenabled.MediaSessionCompatToken, sSLSocketFactory, getshouldusewindowflagsecureinactivities, gVar, isfirebasecloudmessagingregistrationenabled.ResultReceiver, isfirebasecloudmessagingregistrationenabled.serializer, isfirebasecloudmessagingregistrationenabled.MediaMetadataCompat, isfirebasecloudmessagingregistrationenabled.RatingCompat);
    }

    public static boolean IconCompatParcelizer(setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled) {
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled2 = setshouldpersistwebviewwhenbackgroundingapp.write.write;
        return ishtmlinappmessageapplywindowinsetsenabled2.write.equals(ishtmlinappmessageapplywindowinsetsenabled.write) && ishtmlinappmessageapplywindowinsetsenabled2.MediaMetadataCompat == ishtmlinappmessageapplywindowinsetsenabled.MediaMetadataCompat && ishtmlinappmessageapplywindowinsetsenabled2.serializer.equals(ishtmlinappmessageapplywindowinsetsenabled.serializer);
    }

    @Override // o.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled
    public final setShouldPersistWebViewWhenBackgroundingApp serializer(_get_brazeApiKey_lambda1 _get_brazeapikey_lambda1) throws IOException {
        _get_applicationIconResourceId_lambda0 _get_applicationiconresourceid_lambda0;
        setSessionTimeout setsessiontimeout = _get_brazeapikey_lambda1.RatingCompat;
        setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release = _get_brazeapikey_lambda1.MediaSessionCompatQueueItem;
        setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds = _get_brazeapikey_lambda1.MediaMetadataCompat;
        r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw = new r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw(this.read.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, RemoteActionCompatParcelizer(setsessiontimeout.write), setsessiontimeoutandroid_sdk_base_release, settriggeractionminimumtimeintervalseconds, this.serializer);
        this.RemoteActionCompatParcelizer = r8lambdat8fev0yhsugjmgcolxj0pkxlpw;
        int i = 0;
        setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp = null;
        while (!this.IconCompatParcelizer) {
            try {
                try {
                    setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingappWrite = _get_brazeapikey_lambda1.write(setsessiontimeout, r8lambdat8fev0yhsugjmgcolxj0pkxlpw, null, null);
                    if (setshouldpersistwebviewwhenbackgroundingapp != null) {
                        setShouldUseWindowFlagSecureInActivities setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer = setshouldpersistwebviewwhenbackgroundingappWrite.RemoteActionCompatParcelizer();
                        setShouldUseWindowFlagSecureInActivities setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer2 = setshouldpersistwebviewwhenbackgroundingapp.RemoteActionCompatParcelizer();
                        setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem = null;
                        setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingappRemoteActionCompatParcelizer = setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer();
                        if (setshouldpersistwebviewwhenbackgroundingappRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem == null) {
                            setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer.MediaMetadataCompat = setshouldpersistwebviewwhenbackgroundingappRemoteActionCompatParcelizer;
                            setshouldpersistwebviewwhenbackgroundingappWrite = setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("priorResponse.body != null");
                            return null;
                        }
                    }
                    try {
                        setSessionTimeout setsessiontimeoutSerializer = serializer(setshouldpersistwebviewwhenbackgroundingappWrite, r8lambdat8fev0yhsugjmgcolxj0pkxlpw.read);
                        if (setsessiontimeoutSerializer == null) {
                            r8lambdat8fev0yhsugjmgcolxj0pkxlpw.IconCompatParcelizer();
                            return setshouldpersistwebviewwhenbackgroundingappWrite;
                        }
                        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(setshouldpersistwebviewwhenbackgroundingappWrite.MediaBrowserCompatMediaItem);
                        int i2 = i + 1;
                        if (i2 <= 20) {
                            if (!IconCompatParcelizer(setshouldpersistwebviewwhenbackgroundingappWrite, setsessiontimeoutSerializer.write)) {
                                r8lambdat8fev0yhsugjmgcolxj0pkxlpw.IconCompatParcelizer();
                                r8lambdat8fev0yhsugjmgcolxj0pkxlpw = new r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw(this.read.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, RemoteActionCompatParcelizer(setsessiontimeoutSerializer.write), setsessiontimeoutandroid_sdk_base_release, settriggeractionminimumtimeintervalseconds, this.serializer);
                                this.RemoteActionCompatParcelizer = r8lambdat8fev0yhsugjmgcolxj0pkxlpw;
                            } else {
                                synchronized (r8lambdat8fev0yhsugjmgcolxj0pkxlpw.write) {
                                    _get_applicationiconresourceid_lambda0 = r8lambdat8fev0yhsugjmgcolxj0pkxlpw.PlaybackStateCompatCustomAction;
                                }
                                if (_get_applicationiconresourceid_lambda0 != null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Closing the body of ", setshouldpersistwebviewwhenbackgroundingappWrite, " didn't close its backing stream. Bad interceptor?");
                                    return null;
                                }
                            }
                            setshouldpersistwebviewwhenbackgroundingapp = setshouldpersistwebviewwhenbackgroundingappWrite;
                            setsessiontimeout = setsessiontimeoutSerializer;
                            i = i2;
                        } else {
                            r8lambdat8fev0yhsugjmgcolxj0pkxlpw.IconCompatParcelizer();
                            throw new ProtocolException(c8$$ExternalSyntheticOutline0.m(i2, "Too many follow-up requests: "));
                        }
                    } catch (IOException e) {
                        r8lambdat8fev0yhsugjmgcolxj0pkxlpw.IconCompatParcelizer();
                        throw e;
                    }
                } catch (RouteException e2) {
                    if (!serializer(e2.read(), r8lambdat8fev0yhsugjmgcolxj0pkxlpw, false, setsessiontimeout)) {
                        throw e2.write();
                    }
                } catch (IOException e3) {
                    if (!serializer(e3, r8lambdat8fev0yhsugjmgcolxj0pkxlpw, !(e3 instanceof ConnectionShutdownException), setsessiontimeout)) {
                        throw e3;
                    }
                }
            } catch (Throwable th) {
                r8lambdat8fev0yhsugjmgcolxj0pkxlpw.serializer(null);
                r8lambdat8fev0yhsugjmgcolxj0pkxlpw.IconCompatParcelizer();
                throw th;
            }
        }
        r8lambdat8fev0yhsugjmgcolxj0pkxlpw.IconCompatParcelizer();
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Canceled");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
    
        if (r4 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean serializer(java.io.IOException r2, o.r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r3, boolean r4, o.setSessionTimeout r5) {
        /*
            r1 = this;
            r3.serializer(r2)
            o.isFirebaseCloudMessagingRegistrationEnabled r5 = r1.read
            boolean r5 = r5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg
            r0 = 0
            if (r5 != 0) goto Lb
            goto L2e
        Lb:
            if (r4 == 0) goto L12
            boolean r5 = r2 instanceof java.io.FileNotFoundException
            if (r5 == 0) goto L12
            return r0
        L12:
            boolean r5 = r2 instanceof java.net.ProtocolException
            if (r5 == 0) goto L17
            return r0
        L17:
            boolean r5 = r2 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L22
            boolean r2 = r2 instanceof java.net.SocketTimeoutException
            if (r2 == 0) goto L2e
            if (r4 != 0) goto L2e
            goto L34
        L22:
            boolean r4 = r2 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 == 0) goto L2f
            java.lang.Throwable r4 = r2.getCause()
            boolean r4 = r4 instanceof java.security.cert.CertificateException
            if (r4 == 0) goto L2f
        L2e:
            return r0
        L2f:
            boolean r2 = r2 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r2 == 0) goto L34
            return r0
        L34:
            o.setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release r2 = r3.read
            if (r2 != 0) goto L60
            o.r8lambdad078OwOGj07HuIusaTc6uXst__s r2 = r3.IconCompatParcelizer
            if (r2 == 0) goto L47
            int r4 = r2.write
            java.util.ArrayList r2 = r2.RemoteActionCompatParcelizer
            int r2 = r2.size()
            if (r4 >= r2) goto L47
            goto L60
        L47:
            o.r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r2 = r3.MediaMetadataCompat
            int r3 = r2.RemoteActionCompatParcelizer
            java.lang.Object r4 = r2.read
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            if (r3 >= r4) goto L56
            goto L60
        L56:
            java.util.ArrayList r2 = r2.MediaSessionCompatQueueItem
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5f
            goto L60
        L5f:
            return r0
        L60:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o._get_brazeApiKey_lambda7.serializer(java.io.IOException, o.r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw, boolean, o.setSessionTimeout):boolean");
    }
}
