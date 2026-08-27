package o;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaKeFC04eKmBbbj1Gm_PcebLXGOQY {
    public int RemoteActionCompatParcelizer = 0;
    public final List read;
    public boolean serializer;
    public boolean write;

    public final getTriggerActionMinimumTimeIntervalInSeconds write(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z;
        getTriggerActionMinimumTimeIntervalInSeconds gettriggeractionminimumtimeintervalinseconds;
        int i = this.RemoteActionCompatParcelizer;
        List list = this.read;
        int size = list.size();
        while (true) {
            z = true;
            if (i >= size) {
                gettriggeractionminimumtimeintervalinseconds = null;
                break;
            }
            gettriggeractionminimumtimeintervalinseconds = (getTriggerActionMinimumTimeIntervalInSeconds) list.get(i);
            if (gettriggeractionminimumtimeintervalinseconds.RemoteActionCompatParcelizer(sSLSocket)) {
                this.RemoteActionCompatParcelizer = i + 1;
                break;
            }
            i++;
        }
        if (gettriggeractionminimumtimeintervalinseconds == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.serializer);
            sb.append(", modes=");
            sb.append(list);
            String string = Arrays.toString(sSLSocket.getEnabledProtocols());
            sb.append(", supported protocols=");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i2 = this.RemoteActionCompatParcelizer;
        while (true) {
            if (i2 >= list.size()) {
                z = false;
                break;
            }
            if (((getTriggerActionMinimumTimeIntervalInSeconds) list.get(i2)).RemoteActionCompatParcelizer(sSLSocket)) {
                break;
            }
            i2++;
        }
        this.write = z;
        setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
        boolean z2 = this.serializer;
        settriggeractionminimumtimeintervalseconds.getClass();
        String[] strArr = gettriggeractionminimumtimeintervalinseconds.MediaDescriptionCompat;
        String[] strArr2 = gettriggeractionminimumtimeintervalinseconds.read;
        String[] strArrRemoteActionCompatParcelizer = strArr2 != null ? r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer(BrazeConfigurationProvider.MediaSessionCompatQueueItem, sSLSocket.getEnabledCipherSuites(), strArr2) : sSLSocket.getEnabledCipherSuites();
        String[] strArrRemoteActionCompatParcelizer2 = strArr != null ? r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer(r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.PlaybackStateCompat, sSLSocket.getEnabledProtocols(), strArr) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        r8lambda7qAOSffsXxbqKGCxSAjEY5JvRo r8lambda7qaosffsxxbqkgcxsajey5jvro = BrazeConfigurationProvider.MediaSessionCompatQueueItem;
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        int length = supportedCipherSuites.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (r8lambda7qaosffsxxbqkgcxsajey5jvro.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
        }
        if (z2 && i3 != -1) {
            String str = supportedCipherSuites[i3];
            int length2 = strArrRemoteActionCompatParcelizer.length;
            String[] strArr3 = new String[length2 + 1];
            System.arraycopy(strArrRemoteActionCompatParcelizer, 0, strArr3, 0, strArrRemoteActionCompatParcelizer.length);
            strArr3[length2] = str;
            strArrRemoteActionCompatParcelizer = strArr3;
        }
        getSmallNotificationIconResourceId getsmallnotificationiconresourceid = new getSmallNotificationIconResourceId();
        getsmallnotificationiconresourceid.write = gettriggeractionminimumtimeintervalinseconds.IconCompatParcelizer;
        getsmallnotificationiconresourceid.read = strArr2;
        getsmallnotificationiconresourceid.RemoteActionCompatParcelizer = strArr;
        getsmallnotificationiconresourceid.serializer = gettriggeractionminimumtimeintervalinseconds.serializer;
        getsmallnotificationiconresourceid.read(strArrRemoteActionCompatParcelizer);
        getsmallnotificationiconresourceid.write(strArrRemoteActionCompatParcelizer2);
        getTriggerActionMinimumTimeIntervalInSeconds gettriggeractionminimumtimeintervalinseconds2 = new getTriggerActionMinimumTimeIntervalInSeconds(getsmallnotificationiconresourceid);
        String[] strArr4 = gettriggeractionminimumtimeintervalinseconds2.MediaDescriptionCompat;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        String[] strArr5 = gettriggeractionminimumtimeintervalinseconds2.read;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
        return gettriggeractionminimumtimeintervalinseconds;
    }

    public r8lambdaKeFC04eKmBbbj1Gm_PcebLXGOQY(List list) {
        this.read = list;
    }
}
