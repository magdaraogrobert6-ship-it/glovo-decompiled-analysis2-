package o;

import com.deliveryhero.fwf_http.ConstantKt;
import com.sentiance.okhttp3.internal.connection.RouteException;
import com.sentiance.okhttp3.u$a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdajllygiqtJolqdrx5PckZtwvWXHs implements isFirebaseMessagingServiceOnNewTokenRegistrationEnabled {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object write;

    public /* synthetic */ r8lambdajllygiqtJolqdrx5PckZtwvWXHs(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled
    public final setShouldPersistWebViewWhenBackgroundingApp serializer(_get_brazeApiKey_lambda1 _get_brazeapikey_lambda1) throws IOException {
        boolean z = true;
        if (this.IconCompatParcelizer != 0) {
            setSessionTimeout setsessiontimeout = _get_brazeapikey_lambda1.RatingCompat;
            r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw = _get_brazeapikey_lambda1.write;
            boolean zEquals = setsessiontimeout.serializer.equals("GET");
            isFirebaseCloudMessagingRegistrationEnabled isfirebasecloudmessagingregistrationenabled = (isFirebaseCloudMessagingRegistrationEnabled) this.write;
            r8lambdat8fev0yhsugjmgcolxj0pkxlpw.getClass();
            int i = _get_brazeapikey_lambda1.MediaBrowserCompatMediaItem;
            int i2 = _get_brazeapikey_lambda1.MediaDescriptionCompat;
            int i3 = _get_brazeapikey_lambda1.PlaybackStateCompat;
            isfirebasecloudmessagingregistrationenabled.getClass();
            try {
                _get_applicationIconResourceId_lambda0 _get_applicationiconresourceid_lambda0IconCompatParcelizer = r8lambdat8fev0yhsugjmgcolxj0pkxlpw.IconCompatParcelizer(isfirebasecloudmessagingregistrationenabled.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, i, !zEquals, i2, i3).IconCompatParcelizer(isfirebasecloudmessagingregistrationenabled, _get_brazeapikey_lambda1, r8lambdat8fev0yhsugjmgcolxj0pkxlpw);
                synchronized (r8lambdat8fev0yhsugjmgcolxj0pkxlpw.write) {
                    r8lambdat8fev0yhsugjmgcolxj0pkxlpw.PlaybackStateCompatCustomAction = _get_applicationiconresourceid_lambda0IconCompatParcelizer;
                }
                return _get_brazeapikey_lambda1.write(setsessiontimeout, r8lambdat8fev0yhsugjmgcolxj0pkxlpw, _get_applicationiconresourceid_lambda0IconCompatParcelizer, r8lambdat8fev0yhsugjmgcolxj0pkxlpw.RemoteActionCompatParcelizer());
            } catch (IOException e) {
                throw new RouteException(e);
            }
        }
        setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds = (setTriggerActionMinimumTimeIntervalSeconds) this.write;
        setSessionTimeout setsessiontimeout2 = _get_brazeapikey_lambda1.RatingCompat;
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer = setsessiontimeout2.serializer();
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled = setsessiontimeout2.write;
        isEphemeralEventsEnabled isephemeraleventsenabled = setsessiontimeout2.read;
        setShouldOptInWhenPushAuthorizedandroid_sdk_base_release setshouldoptinwhenpushauthorizedandroid_sdk_base_release = setsessiontimeout2.RemoteActionCompatParcelizer;
        if (setshouldoptinwhenpushauthorizedandroid_sdk_base_release != null) {
            isHtmlInAppMessageHtmlLinkTargetEnabled ishtmlinappmessagehtmllinktargetenabledSerializer = setshouldoptinwhenpushauthorizedandroid_sdk_base_release.serializer();
            if (ishtmlinappmessagehtmllinktargetenabledSerializer != null) {
                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer.IconCompatParcelizer(ConstantKt.CONTENT_TYPE_HEADER, ishtmlinappmessagehtmllinktargetenabledSerializer.write);
            }
            long jWrite = setshouldoptinwhenpushauthorizedandroid_sdk_base_release.write();
            if (jWrite != -1) {
                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer.IconCompatParcelizer("Content-Length", Long.toString(jWrite));
                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.IconCompatParcelizer("Transfer-Encoding");
            } else {
                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer.IconCompatParcelizer("Transfer-Encoding", "chunked");
                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.IconCompatParcelizer("Content-Length");
            }
        }
        if (isephemeraleventsenabled.RemoteActionCompatParcelizer("Host") == null) {
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer.IconCompatParcelizer("Host", r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(ishtmlinappmessageapplywindowinsetsenabled, false));
        }
        if (isephemeraleventsenabled.RemoteActionCompatParcelizer("Connection") == null) {
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer.IconCompatParcelizer("Connection", "Keep-Alive");
        }
        if (isephemeraleventsenabled.RemoteActionCompatParcelizer("Accept-Encoding") == null && isephemeraleventsenabled.RemoteActionCompatParcelizer("Range") == null) {
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer.IconCompatParcelizer("Accept-Encoding", "gzip");
        } else {
            z = false;
        }
        settriggeractionminimumtimeintervalseconds.getClass();
        List list = Collections.EMPTY_LIST;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (i4 > 0) {
                    sb.append("; ");
                }
                isAutomaticLocationCollectionEnabled isautomaticlocationcollectionenabled = (isAutomaticLocationCollectionEnabled) list.get(i4);
                sb.append(isautomaticlocationcollectionenabled.read);
                sb.append('=');
                sb.append(isautomaticlocationcollectionenabled.MediaDescriptionCompat);
            }
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer.IconCompatParcelizer("Cookie", sb.toString());
        }
        if (isephemeraleventsenabled.RemoteActionCompatParcelizer(ConstantKt.USER_AGENT_HEADER) == null) {
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.serializer.IconCompatParcelizer(ConstantKt.USER_AGENT_HEADER, "okhttp/3.12.10");
        }
        setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingappSerializer = _get_brazeapikey_lambda1.serializer(setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseSerializer.write());
        com.sentiance.okhttp3.internal.http.e.write(settriggeractionminimumtimeintervalseconds, ishtmlinappmessageapplywindowinsetsenabled, setshouldpersistwebviewwhenbackgroundingappSerializer.RatingCompat);
        setShouldUseWindowFlagSecureInActivities setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer = setshouldpersistwebviewwhenbackgroundingappSerializer.RemoteActionCompatParcelizer();
        setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = setsessiontimeout2;
        if (z && "gzip".equalsIgnoreCase(setshouldpersistwebviewwhenbackgroundingappSerializer.read("Content-Encoding", null)) && com.sentiance.okhttp3.internal.http.e.write(setshouldpersistwebviewwhenbackgroundingappSerializer)) {
            getFallbackConfigKey getfallbackconfigkey = new getFallbackConfigKey(setshouldpersistwebviewwhenbackgroundingappSerializer.MediaBrowserCompatMediaItem.IconCompatParcelizer());
            u$a u_a = setshouldpersistwebviewwhenbackgroundingappSerializer.RatingCompat.read();
            u_a.read("Content-Encoding");
            u_a.read("Content-Length");
            ArrayList arrayList = u_a.IconCompatParcelizer;
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            u$a u_a2 = new u$a(0);
            Collections.addAll(u_a2.IconCompatParcelizer, strArr);
            setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer.MediaDescriptionCompat = u_a2;
            String str = setshouldpersistwebviewwhenbackgroundingappSerializer.read(ConstantKt.CONTENT_TYPE_HEADER, null);
            java.util.logging.Logger logger = getResourceIdentifier.read;
            setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer.MediaSessionCompatQueueItem = new setSmallNotificationIconNameandroid_sdk_base_release(str, -1L, new readResourceValuelambda1(getfallbackconfigkey), 1);
        }
        return setshouldusewindowflagsecureinactivitiesRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }
}
