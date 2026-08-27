package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.internal.http2.ConnectionShutdownException;
import com.sentiance.okhttp3.internal.http2.ErrorCode;
import com.sentiance.okhttp3.internal.http2.StreamResetException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw {
    public r8lambdad078OwOGj07HuIusaTc6uXst__s IconCompatParcelizer;
    public r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE MediaBrowserCompatMediaItem;
    public final Object MediaDescriptionCompat;
    public final r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg MediaMetadataCompat;
    public final setTriggerActionMinimumTimeIntervalSeconds MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public _get_applicationIconResourceId_lambda0 PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public final setSmallNotificationIcon RemoteActionCompatParcelizer;
    public setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release read;
    public final setSessionTimeoutandroid_sdk_base_release serializer;
    public final getVersionCode write;

    public final r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE RemoteActionCompatParcelizer() {
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve;
        synchronized (this) {
            r8lambdaik1pft6kfq5yrxiftoy3aewpve = this.MediaBrowserCompatMediaItem;
        }
        return r8lambdaik1pft6kfq5yrxiftoy3aewpve;
    }

    public final void IconCompatParcelizer() {
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve;
        Socket socket;
        synchronized (this.write) {
            r8lambdaik1pft6kfq5yrxiftoy3aewpve = this.MediaBrowserCompatMediaItem;
            socket = read(false, true, false);
            if (this.MediaBrowserCompatMediaItem != null) {
                r8lambdaik1pft6kfq5yrxiftoy3aewpve = null;
            }
        }
        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(socket);
        if (r8lambdaik1pft6kfq5yrxiftoy3aewpve != null) {
            setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
            setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release = this.serializer;
            settriggeractionminimumtimeintervalseconds.getClass();
            setsessiontimeoutandroid_sdk_base_release.IconCompatParcelizer(null);
            this.MediaSessionCompatQueueItem.getClass();
            this.MediaSessionCompatQueueItem.getClass();
        }
    }

    public final r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE RemoteActionCompatParcelizer(int i, int i2, int i3, boolean z) throws Throwable {
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve;
        Socket socket;
        int i4;
        Socket socket2;
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve2;
        boolean z2;
        setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release;
        boolean z3;
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve3;
        r8lambdad078OwOGj07HuIusaTc6uXst__s r8lambdad078owogj07huiusatc6uxst__s;
        String hostName;
        int port;
        boolean zContains;
        synchronized (this.write) {
            if (this.ParcelableVolumeInfo) {
                throw new IllegalStateException("released");
            }
            if (this.PlaybackStateCompatCustomAction != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.MediaSessionCompatToken) {
                throw new IOException("Canceled");
            }
            r8lambdaik1pft6kfq5yrxiftoy3aewpve = this.MediaBrowserCompatMediaItem;
            socket = null;
            i4 = 1;
            socket2 = (r8lambdaik1pft6kfq5yrxiftoy3aewpve == null || !r8lambdaik1pft6kfq5yrxiftoy3aewpve.RatingCompat) ? null : read(false, false, true);
            r8lambdaik1pft6kfq5yrxiftoy3aewpve2 = this.MediaBrowserCompatMediaItem;
            if (r8lambdaik1pft6kfq5yrxiftoy3aewpve2 != null) {
                r8lambdaik1pft6kfq5yrxiftoy3aewpve = null;
            } else {
                r8lambdaik1pft6kfq5yrxiftoy3aewpve2 = null;
            }
            if (!this.MediaSessionCompatResultReceiverWrapper) {
                r8lambdaik1pft6kfq5yrxiftoy3aewpve = null;
            }
            if (r8lambdaik1pft6kfq5yrxiftoy3aewpve2 == null) {
                setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
                getVersionCode getversioncode = this.write;
                setSmallNotificationIcon setsmallnotificationicon = this.RemoteActionCompatParcelizer;
                settriggeractionminimumtimeintervalseconds.getClass();
                setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer(getversioncode, setsmallnotificationicon, this, null);
                r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve4 = this.MediaBrowserCompatMediaItem;
                if (r8lambdaik1pft6kfq5yrxiftoy3aewpve4 != null) {
                    r8lambdaik1pft6kfq5yrxiftoy3aewpve2 = r8lambdaik1pft6kfq5yrxiftoy3aewpve4;
                    z2 = true;
                } else {
                    settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = this.read;
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = null;
        }
        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(socket2);
        if (r8lambdaik1pft6kfq5yrxiftoy3aewpve != null) {
            this.MediaSessionCompatQueueItem.getClass();
        }
        if (z2) {
            this.MediaSessionCompatQueueItem.getClass();
        }
        if (r8lambdaik1pft6kfq5yrxiftoy3aewpve2 != null) {
            this.read = this.MediaBrowserCompatMediaItem.write;
            return r8lambdaik1pft6kfq5yrxiftoy3aewpve2;
        }
        if (settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release != null || ((r8lambdad078owogj07huiusatc6uxst__s = this.IconCompatParcelizer) != null && r8lambdad078owogj07huiusatc6uxst__s.write < r8lambdad078owogj07huiusatc6uxst__s.RemoteActionCompatParcelizer.size())) {
            z3 = false;
        } else {
            r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = this.MediaMetadataCompat;
            if (r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer >= ((List) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read).size() && r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaSessionCompatQueueItem.isEmpty()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer < ((List) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read).size()) {
                setSmallNotificationIcon setsmallnotificationicon2 = (setSmallNotificationIcon) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write;
                if (r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer >= ((List) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read).size()) {
                    throw new SocketException("No route to " + setsmallnotificationicon2.RemoteActionCompatParcelizer.write + "; exhausted proxy configurations: " + ((List) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read));
                }
                List list = (List) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read;
                int i5 = r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer;
                r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer = i5 + 1;
                Proxy proxy = (Proxy) list.get(i5);
                setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds2 = (setTriggerActionMinimumTimeIntervalSeconds) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.IconCompatParcelizer;
                r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaBrowserCompatMediaItem = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled = setsmallnotificationicon2.RemoteActionCompatParcelizer;
                    hostName = ishtmlinappmessageapplywindowinsetsenabled.write;
                    port = ishtmlinappmessageapplywindowinsetsenabled.MediaMetadataCompat;
                } else {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (!(socketAddressAddress instanceof InetSocketAddress)) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                        return null;
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    InetAddress address = inetSocketAddress.getAddress();
                    hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                    port = inetSocketAddress.getPort();
                }
                if (port < i4 || port > 65535) {
                    throw new SocketException("No route to " + hostName + ":" + port + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    ((List) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaBrowserCompatMediaItem).add(InetSocketAddress.createUnresolved(hostName, port));
                } else {
                    settriggeractionminimumtimeintervalseconds2.getClass();
                    setsmallnotificationicon2.read.getClass();
                    if (hostName == null) {
                        throw new UnknownHostException("hostname == null");
                    }
                    try {
                        List listAsList = Arrays.asList(InetAddress.getAllByName(hostName));
                        if (listAsList.isEmpty()) {
                            throw new UnknownHostException(setsmallnotificationicon2.read + " returned no addresses for " + hostName);
                        }
                        int size = listAsList.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((List) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaBrowserCompatMediaItem).add(new InetSocketAddress((InetAddress) listAsList.get(i6), port));
                        }
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                int size2 = ((List) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaBrowserCompatMediaItem).size();
                for (int i7 = 0; i7 < size2; i7++) {
                    setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2 = new setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release((setSmallNotificationIcon) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.write, proxy, (InetSocketAddress) ((List) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaBrowserCompatMediaItem).get(i7));
                    setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.serializer;
                    synchronized (sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release) {
                        zContains = ((LinkedHashSet) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write).contains(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2);
                    }
                    if (zContains) {
                        r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaSessionCompatQueueItem.add(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2);
                    } else {
                        arrayList.add(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
                i4 = 1;
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaSessionCompatQueueItem);
                r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.MediaSessionCompatQueueItem.clear();
            }
            r8lambdad078OwOGj07HuIusaTc6uXst__s r8lambdad078owogj07huiusatc6uxst__s2 = new r8lambdad078OwOGj07HuIusaTc6uXst__s();
            r8lambdad078owogj07huiusatc6uxst__s2.write = 0;
            r8lambdad078owogj07huiusatc6uxst__s2.RemoteActionCompatParcelizer = arrayList;
            this.IconCompatParcelizer = r8lambdad078owogj07huiusatc6uxst__s2;
            z3 = true;
        }
        synchronized (this.write) {
            if (this.MediaSessionCompatToken) {
                throw new IOException("Canceled");
            }
            if (z3) {
                r8lambdad078OwOGj07HuIusaTc6uXst__s r8lambdad078owogj07huiusatc6uxst__s3 = this.IconCompatParcelizer;
                r8lambdad078owogj07huiusatc6uxst__s3.getClass();
                ArrayList arrayList2 = new ArrayList(r8lambdad078owogj07huiusatc6uxst__s3.RemoteActionCompatParcelizer);
                int size3 = arrayList2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release3 = (setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release) arrayList2.get(i8);
                    setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds3 = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
                    getVersionCode getversioncode2 = this.write;
                    setSmallNotificationIcon setsmallnotificationicon3 = this.RemoteActionCompatParcelizer;
                    settriggeractionminimumtimeintervalseconds3.getClass();
                    setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer(getversioncode2, setsmallnotificationicon3, this, settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release3);
                    r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve5 = this.MediaBrowserCompatMediaItem;
                    if (r8lambdaik1pft6kfq5yrxiftoy3aewpve5 != null) {
                        this.read = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release3;
                        r8lambdaik1pft6kfq5yrxiftoy3aewpve2 = r8lambdaik1pft6kfq5yrxiftoy3aewpve5;
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                if (settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release == null) {
                    r8lambdad078OwOGj07HuIusaTc6uXst__s r8lambdad078owogj07huiusatc6uxst__s4 = this.IconCompatParcelizer;
                    if (r8lambdad078owogj07huiusatc6uxst__s4.write >= r8lambdad078owogj07huiusatc6uxst__s4.RemoteActionCompatParcelizer.size()) {
                        throw new NoSuchElementException();
                    }
                    ArrayList arrayList3 = r8lambdad078owogj07huiusatc6uxst__s4.RemoteActionCompatParcelizer;
                    int i9 = r8lambdad078owogj07huiusatc6uxst__s4.write;
                    r8lambdad078owogj07huiusatc6uxst__s4.write = i9 + 1;
                    settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = (setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release) arrayList3.get(i9);
                }
                this.read = settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release;
                this.RatingCompat = 0;
                r8lambdaik1pft6kfq5yrxiftoy3aewpve2 = new r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE(this.write, settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release);
                if (this.MediaBrowserCompatMediaItem != null) {
                    throw new IllegalStateException();
                }
                this.MediaBrowserCompatMediaItem = r8lambdaik1pft6kfq5yrxiftoy3aewpve2;
                this.MediaSessionCompatResultReceiverWrapper = false;
                r8lambdaik1pft6kfq5yrxiftoy3aewpve2.MediaSessionCompatToken.add(new r8lambda_rBBbfSaSmW9ZaqWlktZwFDxzPQ(this, this.MediaDescriptionCompat));
            }
            r8lambdaik1pft6kfq5yrxiftoy3aewpve3 = r8lambdaik1pft6kfq5yrxiftoy3aewpve2;
        }
        if (z2) {
            this.MediaSessionCompatQueueItem.getClass();
            return r8lambdaik1pft6kfq5yrxiftoy3aewpve3;
        }
        r8lambdaik1pft6kfq5yrxiftoy3aewpve3.write(i, i2, i3, z, this.MediaSessionCompatQueueItem);
        setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds4 = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
        getVersionCode getversioncode3 = this.write;
        settriggeractionminimumtimeintervalseconds4.getClass();
        getversioncode3.MediaDescriptionCompat.read(r8lambdaik1pft6kfq5yrxiftoy3aewpve3.write);
        synchronized (this.write) {
            this.MediaSessionCompatResultReceiverWrapper = true;
            setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds5 = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
            getVersionCode getversioncode4 = this.write;
            settriggeractionminimumtimeintervalseconds5.getClass();
            if (!getversioncode4.MediaSessionCompatQueueItem) {
                getversioncode4.MediaSessionCompatQueueItem = true;
                getVersionCode.write.execute(getversioncode4.serializer);
            }
            getversioncode4.read.add(r8lambdaik1pft6kfq5yrxiftoy3aewpve3);
            if (r8lambdaik1pft6kfq5yrxiftoy3aewpve3.MediaSessionCompatQueueItem != null) {
                setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds6 = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
                getVersionCode getversioncode5 = this.write;
                setSmallNotificationIcon setsmallnotificationicon4 = this.RemoteActionCompatParcelizer;
                settriggeractionminimumtimeintervalseconds6.getClass();
                socket = setTriggerActionMinimumTimeIntervalSeconds.read(getversioncode5, setsmallnotificationicon4, this);
                r8lambdaik1pft6kfq5yrxiftoy3aewpve3 = this.MediaBrowserCompatMediaItem;
            }
        }
        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(socket);
        this.MediaSessionCompatQueueItem.getClass();
        return r8lambdaik1pft6kfq5yrxiftoy3aewpve3;
    }

    public final void write() {
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve;
        Socket socket;
        synchronized (this.write) {
            r8lambdaik1pft6kfq5yrxiftoy3aewpve = this.MediaBrowserCompatMediaItem;
            socket = read(true, false, false);
            if (this.MediaBrowserCompatMediaItem != null) {
                r8lambdaik1pft6kfq5yrxiftoy3aewpve = null;
            }
        }
        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(socket);
        if (r8lambdaik1pft6kfq5yrxiftoy3aewpve != null) {
            this.MediaSessionCompatQueueItem.getClass();
        }
    }

    public r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw(getVersionCode getversioncode, setSmallNotificationIcon setsmallnotificationicon, setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release, setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds, Object obj) {
        this.write = getversioncode;
        this.RemoteActionCompatParcelizer = setsmallnotificationicon;
        this.serializer = setsessiontimeoutandroid_sdk_base_release;
        this.MediaSessionCompatQueueItem = settriggeractionminimumtimeintervalseconds;
        setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer.getClass();
        this.MediaMetadataCompat = new r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg(setsmallnotificationicon, getversioncode.MediaDescriptionCompat, setsessiontimeoutandroid_sdk_base_release, settriggeractionminimumtimeintervalseconds);
        this.MediaDescriptionCompat = obj;
    }

    public final String toString() {
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        return r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer != null ? r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.toString() : this.RemoteActionCompatParcelizer.toString();
    }

    public final r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE IconCompatParcelizer(boolean z, int i, boolean z2, int i2, int i3) throws Throwable {
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer;
        while (true) {
            r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, i2, i3, z);
            synchronized (this.write) {
                if (r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.ParcelableVolumeInfo == 0 && r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.MediaSessionCompatQueueItem == null) {
                    break;
                }
                if (!r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.isClosed() && !r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.isInputShutdown() && !r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.isOutputShutdown()) {
                    getGenericEnumSetFromStringSet getgenericenumsetfromstringset = r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
                    if (getgenericenumsetfromstringset == null) {
                        if (!z2) {
                            break;
                        }
                        try {
                            int soTimeout = r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.getSoTimeout();
                            try {
                                r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.setSoTimeout(1);
                                boolean zRemoteActionCompatParcelizer = r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
                                Socket socket = r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                                if (!zRemoteActionCompatParcelizer) {
                                    break;
                                }
                                socket.setSoTimeout(soTimeout);
                            } finally {
                                r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.setSoTimeout(soTimeout);
                            }
                        } catch (SocketTimeoutException unused) {
                        } catch (IOException unused2) {
                            continue;
                        }
                    } else {
                        long jNanoTime = System.nanoTime();
                        synchronized (getgenericenumsetfromstringset) {
                            if (!getgenericenumsetfromstringset.PlaybackStateCompatCustomAction) {
                                if (getgenericenumsetfromstringset.r8lambda54BeH8ZsBru0CXI2CCSP2syNys >= getgenericenumsetfromstringset.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY || jNanoTime < getgenericenumsetfromstringset.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                                }
                            }
                        }
                        break;
                    }
                }
                write();
            }
        }
        return r8lambdaik1pft6kfq5yrxiftoy3aewpveRemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(boolean z, _get_applicationIconResourceId_lambda0 _get_applicationiconresourceid_lambda0, IOException iOException) {
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve;
        Socket socket;
        boolean z2;
        this.MediaSessionCompatQueueItem.getClass();
        synchronized (this.write) {
            if (_get_applicationiconresourceid_lambda0 == this.PlaybackStateCompatCustomAction) {
                if (!z) {
                    this.MediaBrowserCompatMediaItem.ParcelableVolumeInfo++;
                }
                r8lambdaik1pft6kfq5yrxiftoy3aewpve = this.MediaBrowserCompatMediaItem;
                socket = read(z, false, true);
                if (this.MediaBrowserCompatMediaItem != null) {
                    r8lambdaik1pft6kfq5yrxiftoy3aewpve = null;
                }
                z2 = this.ParcelableVolumeInfo;
            } else {
                throw new IllegalStateException("expected " + this.PlaybackStateCompatCustomAction + " but was " + _get_applicationiconresourceid_lambda0);
            }
        }
        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(socket);
        if (r8lambdaik1pft6kfq5yrxiftoy3aewpve != null) {
            this.MediaSessionCompatQueueItem.getClass();
        }
        if (iOException != null) {
            setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
            setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release = this.serializer;
            settriggeractionminimumtimeintervalseconds.getClass();
            setsessiontimeoutandroid_sdk_base_release.IconCompatParcelizer(iOException);
            this.MediaSessionCompatQueueItem.getClass();
            return;
        }
        if (z2) {
            setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds2 = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
            setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release2 = this.serializer;
            settriggeractionminimumtimeintervalseconds2.getClass();
            setsessiontimeoutandroid_sdk_base_release2.IconCompatParcelizer(null);
            this.MediaSessionCompatQueueItem.getClass();
        }
    }

    public final Socket read(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.PlaybackStateCompatCustomAction = null;
        }
        if (z2) {
            this.ParcelableVolumeInfo = true;
        }
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve = this.MediaBrowserCompatMediaItem;
        if (r8lambdaik1pft6kfq5yrxiftoy3aewpve != null) {
            if (z) {
                r8lambdaik1pft6kfq5yrxiftoy3aewpve.RatingCompat = true;
            }
            if (this.PlaybackStateCompatCustomAction == null && (this.ParcelableVolumeInfo || r8lambdaik1pft6kfq5yrxiftoy3aewpve.RatingCompat)) {
                ArrayList arrayList = r8lambdaik1pft6kfq5yrxiftoy3aewpve.MediaSessionCompatToken;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Reference) arrayList.get(i)).get() == this) {
                        arrayList.remove(i);
                        if (this.MediaBrowserCompatMediaItem.MediaSessionCompatToken.isEmpty()) {
                            this.MediaBrowserCompatMediaItem.PlaybackStateCompat = System.nanoTime();
                            setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
                            r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve2 = this.MediaBrowserCompatMediaItem;
                            settriggeractionminimumtimeintervalseconds.getClass();
                            getVersionCode getversioncode = this.write;
                            getversioncode.getClass();
                            if (!r8lambdaik1pft6kfq5yrxiftoy3aewpve2.RatingCompat && getversioncode.IconCompatParcelizer != 0) {
                                getversioncode.notifyAll();
                                socket = null;
                            } else {
                                getversioncode.read.remove(r8lambdaik1pft6kfq5yrxiftoy3aewpve2);
                                socket = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                            }
                        } else {
                            socket = null;
                        }
                        this.MediaBrowserCompatMediaItem = null;
                        return socket;
                    }
                }
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    public final void serializer(IOException iOException) {
        r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve;
        boolean z;
        Socket socket;
        synchronized (this.write) {
            r8lambdaik1pft6kfq5yrxiftoy3aewpve = null;
            if (iOException instanceof StreamResetException) {
                ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                if (errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.RatingCompat + 1;
                    this.RatingCompat = i;
                    if (i > 1) {
                        this.read = null;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (errorCode != ErrorCode.CANCEL) {
                    this.read = null;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve2 = this.MediaBrowserCompatMediaItem;
                if (r8lambdaik1pft6kfq5yrxiftoy3aewpve2 == null || !(r8lambdaik1pft6kfq5yrxiftoy3aewpve2.MediaSessionCompatQueueItem == null || (iOException instanceof ConnectionShutdownException))) {
                    z = false;
                } else {
                    if (r8lambdaik1pft6kfq5yrxiftoy3aewpve2.ParcelableVolumeInfo == 0) {
                        setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release = this.read;
                        if (settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release != null && iOException != null) {
                            this.MediaMetadataCompat.RemoteActionCompatParcelizer(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release, iOException);
                        }
                        this.read = null;
                    }
                    z = true;
                }
            }
            r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve3 = this.MediaBrowserCompatMediaItem;
            socket = read(z, false, true);
            if (this.MediaBrowserCompatMediaItem == null && this.MediaSessionCompatResultReceiverWrapper) {
                r8lambdaik1pft6kfq5yrxiftoy3aewpve = r8lambdaik1pft6kfq5yrxiftoy3aewpve3;
            }
        }
        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write(socket);
        if (r8lambdaik1pft6kfq5yrxiftoy3aewpve != null) {
            this.MediaSessionCompatQueueItem.getClass();
        }
    }
}
