package o;

import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg {
    public final Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public final ArrayList MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public final Object write;

    public void RemoteActionCompatParcelizer(setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release, IOException iOException) {
        setSmallNotificationIcon setsmallnotificationicon;
        ProxySelector proxySelector;
        if (settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.write.type() != Proxy.Type.DIRECT && (proxySelector = (setsmallnotificationicon = (setSmallNotificationIcon) this.write).MediaDescriptionCompat) != null) {
            proxySelector.connectFailed(setsmallnotificationicon.RemoteActionCompatParcelizer.MediaMetadataCompat(), settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release.write.address(), iOException);
        }
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) this.serializer;
        synchronized (sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release) {
            ((LinkedHashSet) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write).add(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release);
        }
    }

    public r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg(setSmallNotificationIcon setsmallnotificationicon, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release, setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds) {
        List list = Collections.EMPTY_LIST;
        this.read = list;
        this.MediaBrowserCompatMediaItem = list;
        this.MediaSessionCompatQueueItem = new ArrayList();
        this.write = setsmallnotificationicon;
        this.serializer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        this.IconCompatParcelizer = settriggeractionminimumtimeintervalseconds;
        List<Proxy> listSelect = setsmallnotificationicon.MediaDescriptionCompat.select(setsmallnotificationicon.RemoteActionCompatParcelizer.MediaMetadataCompat());
        this.read = (listSelect == null || listSelect.isEmpty()) ? r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(Proxy.NO_PROXY) : Collections.unmodifiableList(new ArrayList(listSelect));
        this.RemoteActionCompatParcelizer = 0;
    }

    public relativeCubicTo serializer(String str) {
        getFillTypeRgk1Os getfilltypergk1os;
        str.getClass();
        isAdapterPositionOnScreen isadapterpositiononscreen = (isAdapterPositionOnScreen) this.MediaBrowserCompatMediaItem;
        if (isadapterpositiononscreen == null || (getfilltypergk1os = (getFillTypeRgk1Os) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()) == null) {
            return null;
        }
        int i = opN5in7k0.write;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleRemoteActionCompatParcelizer = getfilltypergk1os.RemoteActionCompatParcelizer(uri, (LinkedHashMap) this.IconCompatParcelizer);
        if (bundleRemoteActionCompatParcelizer == null) {
            return null;
        }
        return new relativeCubicTo((opN5in7k0) this.write, bundleRemoteActionCompatParcelizer, getfilltypergk1os.PlaybackStateCompat, getfilltypergk1os.serializer(uri), false, -1);
    }

    public r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg(opN5in7k0 opn5in7k0) {
        this.write = opn5in7k0;
        this.MediaSessionCompatQueueItem = new ArrayList();
        this.IconCompatParcelizer = new LinkedHashMap();
    }
}
