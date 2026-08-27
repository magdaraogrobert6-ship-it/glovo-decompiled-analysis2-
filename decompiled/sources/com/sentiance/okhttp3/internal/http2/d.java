package com.sentiance.okhttp3.internal.http2;

import com.deliveryhero.fwf_http.ConstantKt;
import com.huawei.location.logic.zp;
import com.sentiance.okhttp3.Protocol;
import com.sentiance.okhttp3.internal.http.e;
import com.sentiance.okhttp3.u$a;
import com.sentiance.okio.ByteString;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import o._get_applicationIconResourceId_lambda0;
import o._get_brazeApiKey_lambda1;
import o._get_defaultNotificationAccentColor_lambda0;
import o.getConfigurationValue;
import o.getDeviceObjectAllowlist;
import o.getGenericEnumSetFromStringSet;
import o.getResourceIdentifier;
import o.getServerTarget;
import o.isEphemeralEventsEnabled;
import o.isFirebaseCloudMessagingRegistrationEnabled;
import o.isHtmlInAppMessageApplyWindowInsetsEnabled;
import o.r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08;
import o.r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw;
import o.readResourceValuelambda1;
import o.setSessionTimeout;
import o.setShouldPersistWebViewWhenBackgroundingApp;
import o.setShouldUseWindowFlagSecureInActivities;
import o.setSmallNotificationIconNameandroid_sdk_base_release;
import o.setTriggerActionMinimumTimeIntervalSeconds;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements _get_applicationIconResourceId_lambda0 {
    public static final List serializer = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List write = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final _get_brazeApiKey_lambda1 IconCompatParcelizer;
    public getDeviceObjectAllowlist MediaBrowserCompatMediaItem;
    public final Protocol MediaMetadataCompat;
    public final r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw RemoteActionCompatParcelizer;
    public final getGenericEnumSetFromStringSet read;

    @Override // o._get_applicationIconResourceId_lambda0
    public final void IconCompatParcelizer() {
        this.read.read();
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final void read() throws IOException {
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer().close();
    }

    public d(isFirebaseCloudMessagingRegistrationEnabled isfirebasecloudmessagingregistrationenabled, _get_brazeApiKey_lambda1 _get_brazeapikey_lambda1, r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw, getGenericEnumSetFromStringSet getgenericenumsetfromstringset) {
        this.IconCompatParcelizer = _get_brazeapikey_lambda1;
        this.RemoteActionCompatParcelizer = r8lambdat8fev0yhsugjmgcolxj0pkxlpw;
        this.read = getgenericenumsetfromstringset;
        List list = isfirebasecloudmessagingregistrationenabled.serializer;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.MediaMetadataCompat = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final void read(setSessionTimeout setsessiontimeout) {
        int i;
        getDeviceObjectAllowlist getdeviceobjectallowlist;
        boolean z;
        if (this.MediaBrowserCompatMediaItem != null) {
            return;
        }
        boolean z2 = setsessiontimeout.RemoteActionCompatParcelizer != null;
        isEphemeralEventsEnabled isephemeraleventsenabled = setsessiontimeout.read;
        ArrayList arrayList = new ArrayList(isephemeraleventsenabled.IconCompatParcelizer() + 4);
        arrayList.add(new _get_defaultNotificationAccentColor_lambda0(_get_defaultNotificationAccentColor_lambda0.read, setsessiontimeout.serializer));
        ByteString byteString = _get_defaultNotificationAccentColor_lambda0.serializer;
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled = setsessiontimeout.write;
        String strIconCompatParcelizer = ishtmlinappmessageapplywindowinsetsenabled.IconCompatParcelizer();
        String strWrite = ishtmlinappmessageapplywindowinsetsenabled.write();
        if (strWrite != null) {
            strIconCompatParcelizer = strIconCompatParcelizer + '?' + strWrite;
        }
        arrayList.add(new _get_defaultNotificationAccentColor_lambda0(byteString, strIconCompatParcelizer));
        String strRemoteActionCompatParcelizer = setsessiontimeout.read.RemoteActionCompatParcelizer("Host");
        if (strRemoteActionCompatParcelizer != null) {
            arrayList.add(new _get_defaultNotificationAccentColor_lambda0(_get_defaultNotificationAccentColor_lambda0.MediaSessionCompatQueueItem, strRemoteActionCompatParcelizer));
        }
        arrayList.add(new _get_defaultNotificationAccentColor_lambda0(_get_defaultNotificationAccentColor_lambda0.RemoteActionCompatParcelizer, ishtmlinappmessageapplywindowinsetsenabled.serializer));
        int iIconCompatParcelizer = isephemeraleventsenabled.IconCompatParcelizer();
        for (int i2 = 0; i2 < iIconCompatParcelizer; i2++) {
            ByteString byteStringIconCompatParcelizer = ByteString.IconCompatParcelizer(isephemeraleventsenabled.read(i2).toLowerCase(Locale.US));
            if (!serializer.contains(byteStringIconCompatParcelizer.RatingCompat())) {
                arrayList.add(new _get_defaultNotificationAccentColor_lambda0(byteStringIconCompatParcelizer, isephemeraleventsenabled.write(i2)));
            }
        }
        getGenericEnumSetFromStringSet getgenericenumsetfromstringset = this.read;
        boolean z3 = !z2;
        synchronized (getgenericenumsetfromstringset.write) {
            synchronized (getgenericenumsetfromstringset) {
                if (getgenericenumsetfromstringset.MediaSessionCompatToken > 1073741823) {
                    getgenericenumsetfromstringset.RemoteActionCompatParcelizer(ErrorCode.REFUSED_STREAM);
                }
                if (getgenericenumsetfromstringset.PlaybackStateCompatCustomAction) {
                    throw new ConnectionShutdownException();
                }
                i = getgenericenumsetfromstringset.MediaSessionCompatToken;
                getgenericenumsetfromstringset.MediaSessionCompatToken = i + 2;
                getdeviceobjectallowlist = new getDeviceObjectAllowlist(i, getgenericenumsetfromstringset, z3, false, null);
                z = !z2 || getgenericenumsetfromstringset.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == 0 || getdeviceobjectallowlist.write == 0;
                if (getdeviceobjectallowlist.write()) {
                    getgenericenumsetfromstringset.MediaMetadataCompat.put(Integer.valueOf(i), getdeviceobjectallowlist);
                }
            }
            h hVar = getgenericenumsetfromstringset.write;
            synchronized (hVar) {
                if (hVar.MediaSessionCompatQueueItem) {
                    throw new IOException("closed");
                }
                hVar.serializer(z3, i, arrayList);
            }
        }
        if (z) {
            getgenericenumsetfromstringset.write.read();
        }
        this.MediaBrowserCompatMediaItem = getdeviceobjectallowlist;
        getdeviceobjectallowlist.MediaBrowserCompatMediaItem.read(this.IconCompatParcelizer.MediaDescriptionCompat);
        this.MediaBrowserCompatMediaItem.MediaDescriptionCompat.read(this.IconCompatParcelizer.PlaybackStateCompat);
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final getConfigurationValue RemoteActionCompatParcelizer(setSessionTimeout setsessiontimeout, long j) {
        return this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final setShouldUseWindowFlagSecureInActivities read(boolean z) throws ProtocolException {
        isEphemeralEventsEnabled isephemeraleventsenabled;
        getDeviceObjectAllowlist getdeviceobjectallowlist = this.MediaBrowserCompatMediaItem;
        synchronized (getdeviceobjectallowlist) {
            getdeviceobjectallowlist.MediaBrowserCompatMediaItem.MediaMetadataCompat();
            while (getdeviceobjectallowlist.serializer.isEmpty() && getdeviceobjectallowlist.ParcelableVolumeInfo == null) {
                try {
                    try {
                        getdeviceobjectallowlist.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    getdeviceobjectallowlist.MediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem();
                    throw th;
                }
            }
            getdeviceobjectallowlist.MediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem();
            if (!getdeviceobjectallowlist.serializer.isEmpty()) {
                isephemeraleventsenabled = (isEphemeralEventsEnabled) getdeviceobjectallowlist.serializer.removeFirst();
            } else {
                throw new StreamResetException(getdeviceobjectallowlist.ParcelableVolumeInfo);
            }
        }
        Protocol protocol = this.MediaMetadataCompat;
        ArrayList arrayList = new ArrayList(20);
        int iIconCompatParcelizer = isephemeraleventsenabled.IconCompatParcelizer();
        zp zpVarWrite = null;
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            String str = isephemeraleventsenabled.read(i);
            String strWrite = isephemeraleventsenabled.write(i);
            if (str.equals(":status")) {
                zpVarWrite = zp.write("HTTP/1.1 " + strWrite);
            } else if (!write.contains(str)) {
                setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer.getClass();
                arrayList.add(str);
                arrayList.add(strWrite.trim());
            }
        }
        if (zpVarWrite != null) {
            setShouldUseWindowFlagSecureInActivities setshouldusewindowflagsecureinactivities = new setShouldUseWindowFlagSecureInActivities();
            setshouldusewindowflagsecureinactivities.read = protocol;
            setshouldusewindowflagsecureinactivities.write = zpVarWrite.write;
            setshouldusewindowflagsecureinactivities.IconCompatParcelizer = (String) zpVarWrite.IconCompatParcelizer;
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            u$a u_a = new u$a(0);
            Collections.addAll(u_a.IconCompatParcelizer, strArr);
            setshouldusewindowflagsecureinactivities.MediaDescriptionCompat = u_a;
            if (z) {
                setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer.getClass();
                if (setshouldusewindowflagsecureinactivities.write == 100) {
                    return null;
                }
            }
            return setshouldusewindowflagsecureinactivities;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final setSmallNotificationIconNameandroid_sdk_base_release read(setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp) {
        this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem.getClass();
        String str = setshouldpersistwebviewwhenbackgroundingapp.read(ConstantKt.CONTENT_TYPE_HEADER, null);
        long jRemoteActionCompatParcelizer = e.RemoteActionCompatParcelizer(setshouldpersistwebviewwhenbackgroundingapp);
        getServerTarget getservertarget = new getServerTarget(this, this.MediaBrowserCompatMediaItem.MediaSessionCompatQueueItem);
        Logger logger = getResourceIdentifier.read;
        return new setSmallNotificationIconNameandroid_sdk_base_release(str, jRemoteActionCompatParcelizer, new readResourceValuelambda1(getservertarget), 1);
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final void RemoteActionCompatParcelizer() {
        getDeviceObjectAllowlist getdeviceobjectallowlist = this.MediaBrowserCompatMediaItem;
        if (getdeviceobjectallowlist != null) {
            ErrorCode errorCode = ErrorCode.CANCEL;
            if (getdeviceobjectallowlist.RemoteActionCompatParcelizer(errorCode)) {
                getdeviceobjectallowlist.IconCompatParcelizer.serializer(getdeviceobjectallowlist.read, errorCode);
            }
        }
    }
}
