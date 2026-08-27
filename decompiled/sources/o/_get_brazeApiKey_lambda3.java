package o;

import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.logic.zp;
import com.sentiance.okhttp3.Protocol;
import com.sentiance.okhttp3.u$a;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_brazeApiKey_lambda3 implements _get_applicationIconResourceId_lambda0 {
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE IconCompatParcelizer;
    public final r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw RemoteActionCompatParcelizer;
    public final r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k serializer;
    public final isFirebaseCloudMessagingRegistrationEnabled write;
    public int read = 0;
    public long MediaMetadataCompat = 262144;

    @Override // o._get_applicationIconResourceId_lambda0
    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.flush();
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final setSmallNotificationIconNameandroid_sdk_base_release read(setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp) {
        r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw = this.RemoteActionCompatParcelizer;
        r8lambdat8fev0yhsugjmgcolxj0pkxlpw.MediaSessionCompatQueueItem.getClass();
        String str = setshouldpersistwebviewwhenbackgroundingapp.read(ConstantKt.CONTENT_TYPE_HEADER, null);
        if (!com.sentiance.okhttp3.internal.http.e.write(setshouldpersistwebviewwhenbackgroundingapp)) {
            _get_ephemeralEventKeys_lambda0 _get_ephemeraleventkeys_lambda0Write = write(0L);
            java.util.logging.Logger logger = getResourceIdentifier.read;
            return new setSmallNotificationIconNameandroid_sdk_base_release(str, 0L, new readResourceValuelambda1(_get_ephemeraleventkeys_lambda0Write), 1);
        }
        if ("chunked".equalsIgnoreCase(setshouldpersistwebviewwhenbackgroundingapp.read("Transfer-Encoding", null))) {
            isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled = setshouldpersistwebviewwhenbackgroundingapp.write.write;
            int i = this.read;
            if (i != 4) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i, "state: ");
                return null;
            }
            this.read = 5;
            _get_brazeApiKey_lambda5 _get_brazeapikey_lambda5 = new _get_brazeApiKey_lambda5(this, ishtmlinappmessageapplywindowinsetsenabled);
            java.util.logging.Logger logger2 = getResourceIdentifier.read;
            return new setSmallNotificationIconNameandroid_sdk_base_release(str, -1L, new readResourceValuelambda1(_get_brazeapikey_lambda5), 1);
        }
        long jRemoteActionCompatParcelizer = com.sentiance.okhttp3.internal.http.e.RemoteActionCompatParcelizer(setshouldpersistwebviewwhenbackgroundingapp);
        if (jRemoteActionCompatParcelizer != -1) {
            _get_ephemeralEventKeys_lambda0 _get_ephemeraleventkeys_lambda0Write2 = write(jRemoteActionCompatParcelizer);
            java.util.logging.Logger logger3 = getResourceIdentifier.read;
            return new setSmallNotificationIconNameandroid_sdk_base_release(str, jRemoteActionCompatParcelizer, new readResourceValuelambda1(_get_ephemeraleventkeys_lambda0Write2), 1);
        }
        int i2 = this.read;
        if (i2 != 4) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i2, "state: ");
            return null;
        }
        this.read = 5;
        r8lambdat8fev0yhsugjmgcolxj0pkxlpw.write();
        _get_brazeApiKey_lambda9 _get_brazeapikey_lambda9 = new _get_brazeApiKey_lambda9(this);
        java.util.logging.Logger logger4 = getResourceIdentifier.read;
        return new setSmallNotificationIconNameandroid_sdk_base_release(str, -1L, new readResourceValuelambda1(_get_brazeapikey_lambda9), 1);
    }

    public final isEphemeralEventsEnabled write() {
        u$a u_a = new u$a(0);
        while (true) {
            String strRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(this.MediaMetadataCompat);
            this.MediaMetadataCompat -= (long) strRemoteActionCompatParcelizer.length();
            if (strRemoteActionCompatParcelizer.length() != 0) {
                setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer.getClass();
                int iIndexOf = strRemoteActionCompatParcelizer.indexOf(":", 1);
                if (iIndexOf != -1) {
                    u_a.serializer(strRemoteActionCompatParcelizer.substring(0, iIndexOf), strRemoteActionCompatParcelizer.substring(iIndexOf + 1));
                } else if (strRemoteActionCompatParcelizer.startsWith(":")) {
                    u_a.serializer("", strRemoteActionCompatParcelizer.substring(1));
                } else {
                    u_a.serializer("", strRemoteActionCompatParcelizer);
                }
            } else {
                return new isEphemeralEventsEnabled(u_a);
            }
        }
    }

    public _get_brazeApiKey_lambda3(isFirebaseCloudMessagingRegistrationEnabled isfirebasecloudmessagingregistrationenabled, r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw, readResourceValuelambda1 readresourcevaluelambda1, readResourceValuelambda2 readresourcevaluelambda2) {
        this.write = isfirebasecloudmessagingregistrationenabled;
        this.RemoteActionCompatParcelizer = r8lambdat8fev0yhsugjmgcolxj0pkxlpw;
        this.serializer = readresourcevaluelambda1;
        this.IconCompatParcelizer = readresourcevaluelambda2;
    }

    public final _get_ephemeralEventKeys_lambda0 write(long j) {
        int i = this.read;
        if (i != 4) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i, "state: ");
            return null;
        }
        this.read = 5;
        _get_ephemeralEventKeys_lambda0 _get_ephemeraleventkeys_lambda0 = new _get_ephemeralEventKeys_lambda0(this);
        _get_ephemeraleventkeys_lambda0.read = j;
        if (j == 0) {
            _get_ephemeraleventkeys_lambda0.read(true, (IOException) null);
        }
        return _get_ephemeraleventkeys_lambda0;
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final void read() {
        this.IconCompatParcelizer.flush();
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final void RemoteActionCompatParcelizer() {
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer != null) {
            r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.read);
        }
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final void read(setSessionTimeout setsessiontimeout) {
        Proxy.Type type = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().write.write.type();
        StringBuilder sb = new StringBuilder();
        sb.append(setsessiontimeout.serializer);
        sb.append(' ');
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled = setsessiontimeout.write;
        if (!ishtmlinappmessageapplywindowinsetsenabled.serializer.equals(com.adjust.sdk.Constants.SCHEME) && type == Proxy.Type.HTTP) {
            sb.append(ishtmlinappmessageapplywindowinsetsenabled);
        } else {
            String strIconCompatParcelizer = ishtmlinappmessageapplywindowinsetsenabled.IconCompatParcelizer();
            String strWrite = ishtmlinappmessageapplywindowinsetsenabled.write();
            if (strWrite != null) {
                strIconCompatParcelizer = strIconCompatParcelizer + '?' + strWrite;
            }
            sb.append(strIconCompatParcelizer);
        }
        sb.append(" HTTP/1.1");
        write(setsessiontimeout.read, sb.toString());
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final getConfigurationValue RemoteActionCompatParcelizer(setSessionTimeout setsessiontimeout, long j) {
        if ("chunked".equalsIgnoreCase(setsessiontimeout.read.RemoteActionCompatParcelizer("Transfer-Encoding"))) {
            int i = this.read;
            if (i == 1) {
                this.read = 2;
                return new _get_brazeApiKey_lambda4(this);
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i, "state: ");
            return null;
        }
        if (j != -1) {
            int i2 = this.read;
            if (i2 == 1) {
                this.read = 2;
                return new _get_brazeApiKey_lambda8(this, j);
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i2, "state: ");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    public final void write(isEphemeralEventsEnabled isephemeraleventsenabled, String str) {
        int i = this.read;
        if (i == 0) {
            r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe = this.IconCompatParcelizer;
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.serializer(str).serializer("\r\n");
            int iIconCompatParcelizer = isephemeraleventsenabled.IconCompatParcelizer();
            for (int i2 = 0; i2 < iIconCompatParcelizer; i2++) {
                r8lambdamiqxxozlmuuicx7gg348aw6pqe.serializer(isephemeraleventsenabled.read(i2)).serializer(": ").serializer(isephemeraleventsenabled.write(i2)).serializer("\r\n");
            }
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.serializer("\r\n");
            this.read = 1;
            return;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i, "state: ");
    }

    @Override // o._get_applicationIconResourceId_lambda0
    public final setShouldUseWindowFlagSecureInActivities read(boolean z) {
        int i = this.read;
        if (i != 1 && i != 3) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i, "state: ");
            return null;
        }
        try {
            String strRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(this.MediaMetadataCompat);
            this.MediaMetadataCompat -= (long) strRemoteActionCompatParcelizer.length();
            zp zpVarWrite = zp.write(strRemoteActionCompatParcelizer);
            int i2 = zpVarWrite.write;
            setShouldUseWindowFlagSecureInActivities setshouldusewindowflagsecureinactivities = new setShouldUseWindowFlagSecureInActivities();
            setshouldusewindowflagsecureinactivities.read = (Protocol) zpVarWrite.serializer;
            setshouldusewindowflagsecureinactivities.write = i2;
            setshouldusewindowflagsecureinactivities.IconCompatParcelizer = (String) zpVarWrite.IconCompatParcelizer;
            setshouldusewindowflagsecureinactivities.MediaDescriptionCompat = write().read();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.read = 3;
                return setshouldusewindowflagsecureinactivities;
            }
            this.read = 4;
            return setshouldusewindowflagsecureinactivities;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.RemoteActionCompatParcelizer);
            iOException.initCause(e);
            throw iOException;
        }
    }
}
