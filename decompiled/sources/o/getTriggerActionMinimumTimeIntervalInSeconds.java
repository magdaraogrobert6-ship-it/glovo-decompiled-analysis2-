package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.okhttp3.TlsVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class getTriggerActionMinimumTimeIntervalInSeconds {
    public static final getTriggerActionMinimumTimeIntervalInSeconds RemoteActionCompatParcelizer;
    public static final getTriggerActionMinimumTimeIntervalInSeconds write;
    public final boolean IconCompatParcelizer;
    public final String[] MediaDescriptionCompat;
    public final String[] read;
    public final boolean serializer;

    static {
        BrazeConfigurationProvider brazeConfigurationProvider = BrazeConfigurationProvider.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        BrazeConfigurationProvider brazeConfigurationProvider2 = BrazeConfigurationProvider.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        BrazeConfigurationProvider brazeConfigurationProvider3 = BrazeConfigurationProvider.ResultReceiver;
        BrazeConfigurationProvider brazeConfigurationProvider4 = BrazeConfigurationProvider.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        BrazeConfigurationProvider brazeConfigurationProvider5 = BrazeConfigurationProvider.ComponentActivity;
        BrazeConfigurationProvider brazeConfigurationProvider6 = BrazeConfigurationProvider.RemoteActionCompatParcelizer;
        BrazeConfigurationProvider brazeConfigurationProvider7 = BrazeConfigurationProvider.RatingCompat;
        BrazeConfigurationProvider brazeConfigurationProvider8 = BrazeConfigurationProvider.MediaMetadataCompat;
        BrazeConfigurationProvider brazeConfigurationProvider9 = BrazeConfigurationProvider.MediaBrowserCompatMediaItem;
        BrazeConfigurationProvider brazeConfigurationProvider10 = BrazeConfigurationProvider.PlaybackStateCompatCustomAction;
        BrazeConfigurationProvider brazeConfigurationProvider11 = BrazeConfigurationProvider.ParcelableVolumeInfo;
        BrazeConfigurationProvider[] brazeConfigurationProviderArr = {brazeConfigurationProvider, brazeConfigurationProvider2, brazeConfigurationProvider3, brazeConfigurationProvider4, brazeConfigurationProvider5, brazeConfigurationProvider6, brazeConfigurationProvider7, brazeConfigurationProvider8, brazeConfigurationProvider9, brazeConfigurationProvider10, brazeConfigurationProvider11};
        BrazeConfigurationProvider[] brazeConfigurationProviderArr2 = {brazeConfigurationProvider, brazeConfigurationProvider2, brazeConfigurationProvider3, brazeConfigurationProvider4, brazeConfigurationProvider5, brazeConfigurationProvider6, brazeConfigurationProvider7, brazeConfigurationProvider8, brazeConfigurationProvider9, brazeConfigurationProvider10, brazeConfigurationProvider11, BrazeConfigurationProvider.serializer, BrazeConfigurationProvider.IconCompatParcelizer, BrazeConfigurationProvider.MediaSessionCompatToken, BrazeConfigurationProvider.MediaSessionCompatResultReceiverWrapper, BrazeConfigurationProvider.read, BrazeConfigurationProvider.write, BrazeConfigurationProvider.PlaybackStateCompat};
        getSmallNotificationIconResourceId getsmallnotificationiconresourceid = new getSmallNotificationIconResourceId(true);
        getsmallnotificationiconresourceid.IconCompatParcelizer(brazeConfigurationProviderArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        getsmallnotificationiconresourceid.serializer(tlsVersion, tlsVersion2);
        getsmallnotificationiconresourceid.serializer = true;
        getSmallNotificationIconResourceId getsmallnotificationiconresourceid2 = new getSmallNotificationIconResourceId(true);
        getsmallnotificationiconresourceid2.IconCompatParcelizer(brazeConfigurationProviderArr2);
        TlsVersion tlsVersion3 = TlsVersion.TLS_1_0;
        getsmallnotificationiconresourceid2.serializer(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, tlsVersion3);
        getsmallnotificationiconresourceid2.serializer = true;
        write = new getTriggerActionMinimumTimeIntervalInSeconds(getsmallnotificationiconresourceid2);
        getSmallNotificationIconResourceId getsmallnotificationiconresourceid3 = new getSmallNotificationIconResourceId(true);
        getsmallnotificationiconresourceid3.IconCompatParcelizer(brazeConfigurationProviderArr2);
        getsmallnotificationiconresourceid3.serializer(tlsVersion3);
        getsmallnotificationiconresourceid3.serializer = true;
        RemoteActionCompatParcelizer = new getTriggerActionMinimumTimeIntervalInSeconds(new getSmallNotificationIconResourceId(false));
    }

    public getTriggerActionMinimumTimeIntervalInSeconds(getSmallNotificationIconResourceId getsmallnotificationiconresourceid) {
        this.IconCompatParcelizer = getsmallnotificationiconresourceid.write;
        this.read = getsmallnotificationiconresourceid.read;
        this.MediaDescriptionCompat = getsmallnotificationiconresourceid.RemoteActionCompatParcelizer;
        this.serializer = getsmallnotificationiconresourceid.serializer;
    }

    public final int hashCode() {
        if (!this.IconCompatParcelizer) {
            return 17;
        }
        int iHashCode = Arrays.hashCode(this.read);
        return ((((iHashCode + 527) * 31) + Arrays.hashCode(this.MediaDescriptionCompat)) * 31) + (!this.serializer ? 1 : 0);
    }

    public final boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket) {
        if (!this.IconCompatParcelizer) {
            return false;
        }
        String[] strArr = this.MediaDescriptionCompat;
        if (strArr != null && !r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.PlaybackStateCompat, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.read;
        return strArr2 == null || r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(BrazeConfigurationProvider.MediaSessionCompatQueueItem, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final String toString() {
        String string;
        if (!this.IconCompatParcelizer) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.read;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(BrazeConfigurationProvider.read(str));
            }
            string = Collections.unmodifiableList(arrayList).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.MediaDescriptionCompat;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ConnectionSpec(cipherSuites=", string, ", tlsVersions=", strArr2 != null ? TlsVersion.forJavaNames(strArr2).toString() : "[all enabled]", ", supportsTlsExtensions="), this.serializer, ")");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getTriggerActionMinimumTimeIntervalInSeconds)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        getTriggerActionMinimumTimeIntervalInSeconds gettriggeractionminimumtimeintervalinseconds = (getTriggerActionMinimumTimeIntervalInSeconds) obj;
        boolean z = gettriggeractionminimumtimeintervalinseconds.IconCompatParcelizer;
        boolean z2 = this.IconCompatParcelizer;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.read, gettriggeractionminimumtimeintervalinseconds.read) && Arrays.equals(this.MediaDescriptionCompat, gettriggeractionminimumtimeintervalinseconds.MediaDescriptionCompat) && this.serializer == gettriggeractionminimumtimeintervalinseconds.serializer;
        }
        return true;
    }
}
