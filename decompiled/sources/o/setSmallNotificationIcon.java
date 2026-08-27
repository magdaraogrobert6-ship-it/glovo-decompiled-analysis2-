package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class setSmallNotificationIcon {
    public final SocketFactory IconCompatParcelizer;
    public final com.sentiance.okhttp3.g MediaBrowserCompatMediaItem;
    public final ProxySelector MediaDescriptionCompat;
    public final HostnameVerifier MediaMetadataCompat;
    public final SSLSocketFactory MediaSessionCompatQueueItem;
    public final List RatingCompat;
    public final isHtmlInAppMessageApplyWindowInsetsEnabled RemoteActionCompatParcelizer;
    public final setTriggerActionMinimumTimeIntervalSeconds read;
    public final setTriggerActionMinimumTimeIntervalSeconds serializer;
    public final List write;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(527, 31, this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem);
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = this.write.hashCode();
        int iHashCode4 = this.RatingCompat.hashCode();
        int iHashCode5 = this.MediaDescriptionCompat.hashCode();
        SSLSocketFactory sSLSocketFactory = this.MediaSessionCompatQueueItem;
        int iHashCode6 = sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0;
        HostnameVerifier hostnameVerifier = this.MediaMetadataCompat;
        int iHashCode7 = hostnameVerifier != null ? hostnameVerifier.hashCode() : 0;
        com.sentiance.okhttp3.g gVar = this.MediaBrowserCompatMediaItem;
        return ((((((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + ((iHashCode + iM) * 31)) * 31)) * 31)) * 31)) * 961) + iHashCode6) * 31) + iHashCode7) * 31) + (gVar != null ? gVar.hashCode() : 0);
    }

    public final boolean read(setSmallNotificationIcon setsmallnotificationicon) {
        return this.read.equals(setsmallnotificationicon.read) && this.serializer.equals(setsmallnotificationicon.serializer) && this.write.equals(setsmallnotificationicon.write) && this.RatingCompat.equals(setsmallnotificationicon.RatingCompat) && this.MediaDescriptionCompat.equals(setsmallnotificationicon.MediaDescriptionCompat) && r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(null, null) && r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(this.MediaSessionCompatQueueItem, setsmallnotificationicon.MediaSessionCompatQueueItem) && r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(this.MediaMetadataCompat, setsmallnotificationicon.MediaMetadataCompat) && r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, setsmallnotificationicon.MediaBrowserCompatMediaItem) && this.RemoteActionCompatParcelizer.MediaMetadataCompat == setsmallnotificationicon.RemoteActionCompatParcelizer.MediaMetadataCompat;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setSmallNotificationIcon)) {
            return false;
        }
        setSmallNotificationIcon setsmallnotificationicon = (setSmallNotificationIcon) obj;
        return this.RemoteActionCompatParcelizer.equals(setsmallnotificationicon.RemoteActionCompatParcelizer) && read(setsmallnotificationicon);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled = this.RemoteActionCompatParcelizer;
        sb.append(ishtmlinappmessageapplywindowinsetsenabled.write);
        sb.append(":");
        sb.append(ishtmlinappmessageapplywindowinsetsenabled.MediaMetadataCompat);
        sb.append(", proxySelector=");
        sb.append(this.MediaDescriptionCompat);
        sb.append("}");
        return sb.toString();
    }

    public setSmallNotificationIcon(String str, int i, setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, getShouldUseWindowFlagSecureInActivities getshouldusewindowflagsecureinactivities, com.sentiance.okhttp3.g gVar, setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds2, List list, List list2, ProxySelector proxySelector) {
        isGeofencesEnabled isgeofencesenabled = new isGeofencesEnabled();
        String str2 = sSLSocketFactory != null ? com.adjust.sdk.Constants.SCHEME : "http";
        if (str2.equalsIgnoreCase("http")) {
            isgeofencesenabled.IconCompatParcelizer = "http";
        } else if (str2.equalsIgnoreCase(com.adjust.sdk.Constants.SCHEME)) {
            isgeofencesenabled.IconCompatParcelizer = com.adjust.sdk.Constants.SCHEME;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unexpected scheme: ".concat(str2));
            throw null;
        }
        if (str != null) {
            String str3 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(isHtmlInAppMessageApplyWindowInsetsEnabled.read(str, false, 0, str.length()));
            if (str3 != null) {
                isgeofencesenabled.read = str3;
                if (i > 0 && i <= 65535) {
                    isgeofencesenabled.RemoteActionCompatParcelizer = i;
                    this.RemoteActionCompatParcelizer = isgeofencesenabled.read();
                    if (settriggeractionminimumtimeintervalseconds != null) {
                        this.read = settriggeractionminimumtimeintervalseconds;
                        if (socketFactory != null) {
                            this.IconCompatParcelizer = socketFactory;
                            if (settriggeractionminimumtimeintervalseconds2 != null) {
                                this.serializer = settriggeractionminimumtimeintervalseconds2;
                                if (list != null) {
                                    this.write = Collections.unmodifiableList(new ArrayList(list));
                                    if (list2 != null) {
                                        this.RatingCompat = Collections.unmodifiableList(new ArrayList(list2));
                                        if (proxySelector != null) {
                                            this.MediaDescriptionCompat = proxySelector;
                                            this.MediaSessionCompatQueueItem = sSLSocketFactory;
                                            this.MediaMetadataCompat = getshouldusewindowflagsecureinactivities;
                                            this.MediaBrowserCompatMediaItem = gVar;
                                            return;
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("proxySelector == null");
                                        throw null;
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("connectionSpecs == null");
                                    throw null;
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("protocols == null");
                                throw null;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("proxyAuthenticator == null");
                            throw null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("socketFactory == null");
                        throw null;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("dns == null");
                    throw null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "unexpected port: "));
                throw null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unexpected host: ".concat(str));
            throw null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("host == null");
        throw null;
    }
}
