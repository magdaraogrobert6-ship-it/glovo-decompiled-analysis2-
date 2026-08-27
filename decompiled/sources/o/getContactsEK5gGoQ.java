package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.RemoteException;
import android.util.Pair;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzcp;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.grpc.internal.DelayedClientCall$2;
import io.sentry.MovePreviousSession;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getContactsEK5gGoQ {
    public static final Pattern IconCompatParcelizer = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);
    public static volatile getContactsEK5gGoQ serializer;
    public final ExecutorService MediaBrowserCompatMediaItem;
    public final accesssetHasRetrievedMethodcp MediaDescriptionCompat;
    public final getCalendarEK5gGoQ MediaMetadataCompat;
    public String MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public final ScheduledExecutorService RatingCompat;
    public final getCutEK5gGoQ RemoteActionCompatParcelizer;
    public final setLastReportedResult read;
    public final Context write;
    public final Object MediaSessionCompatQueueItem = new Object();
    public int MediaSessionCompatResultReceiverWrapper = 1;
    public final LinkedList PlaybackStateCompat = new LinkedList();
    public volatile boolean PlaybackStateCompatCustomAction = false;
    public volatile boolean ResultReceiver = false;

    public final void write() {
        int i = 2;
        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        System.currentTimeMillis();
        synchronized (this.MediaSessionCompatQueueItem) {
            if (this.PlaybackStateCompatCustomAction) {
                return;
            }
            try {
                Context context = this.write;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentName = new ComponentName(context.getPackageName(), "com.google.android.gms.tagmanager.TagManagerService");
                    int i2 = 0;
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(componentName, 0);
                    if (serviceInfo != null && serviceInfo.enabled) {
                        Pair pairSerializer = serializer();
                        String str = (String) pairSerializer.first;
                        String str2 = (String) pairSerializer.second;
                        if (str == null || str2 == null) {
                            getButtonThumbLeftEK5gGoQ.serializer("Tag Manager's event handler WILL NOT be installed (no container loaded)");
                        } else {
                            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                            this.MediaBrowserCompatMediaItem.execute(new DelayedClientCall$2(this, str, str2, i));
                            this.RatingCompat.schedule(new MovePreviousSession(7, this), DeviceOrientationRequest.OUTPUT_PERIOD_FAST, TimeUnit.MILLISECONDS);
                            if (!this.ResultReceiver) {
                                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                                this.ResultReceiver = true;
                                try {
                                    this.read.read(new getChannelDownEK5gGoQ(this));
                                } catch (RemoteException e) {
                                    getButton5EK5gGoQ.IconCompatParcelizer("Error communicating with measurement proxy: ", e, this.write);
                                }
                                try {
                                    this.read.RemoteActionCompatParcelizer(new getCapsLockEK5gGoQ(this));
                                } catch (RemoteException e2) {
                                    getButton5EK5gGoQ.IconCompatParcelizer("Error communicating with measurement proxy: ", e2, this.write);
                                }
                                this.write.registerComponentCallbacks(new zzcp(i2, this));
                                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                            }
                        }
                        this.PlaybackStateCompatCustomAction = true;
                        System.currentTimeMillis();
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                getButtonThumbLeftEK5gGoQ.serializer("Tag Manager fails to initialize (TagManagerService not enabled in the manifest)");
                this.PlaybackStateCompatCustomAction = true;
            } catch (Throwable th) {
                this.PlaybackStateCompatCustomAction = true;
                throw th;
            }
        }
    }

    public final Pair serializer() {
        Pattern pattern;
        String str;
        String str2;
        String str3;
        String str4;
        accesssetHasRetrievedMethodcp accesssethasretrievedmethodcp = this.MediaDescriptionCompat;
        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        String str5 = this.ParcelableVolumeInfo;
        if (str5 != null && (str4 = this.MediaSessionCompatToken) != null) {
            return Pair.create(str5, str4);
        }
        try {
            String[] list = accesssethasretrievedmethodcp.serializer.getAssets().list("containers");
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (true) {
                int length = list.length;
                pattern = IconCompatParcelizer;
                str = "Asset found for container ";
                str2 = "Extra container asset found, will not be loaded: ";
                if (i2 >= length) {
                    break;
                }
                Matcher matcher = pattern.matcher(list[i2]);
                if (matcher.matches()) {
                    if (z) {
                        getButtonThumbLeftEK5gGoQ.serializer("Extra container asset found, will not be loaded: ".concat(String.valueOf(list[i2])));
                    } else {
                        this.ParcelableVolumeInfo = matcher.group(1);
                        this.MediaSessionCompatToken = ff$$ExternalSyntheticOutline0.m("containers", File.separator, list[i2]);
                        "Asset found for container ".concat(String.valueOf(this.ParcelableVolumeInfo));
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    }
                    z = true;
                } else {
                    getButtonThumbLeftEK5gGoQ.serializer("Ignoring container asset " + list[i2] + " (does not match " + pattern.pattern() + ")");
                }
                i2++;
            }
            if (!z) {
                getButtonThumbLeftEK5gGoQ.serializer("No container asset found in /assets/containers. Checking top level /assets directory for container assets.");
                try {
                    String[] list2 = accesssethasretrievedmethodcp.serializer.getAssets().list("");
                    boolean z2 = false;
                    while (i < list2.length) {
                        Matcher matcher2 = pattern.matcher(list2[i]);
                        if (!matcher2.matches()) {
                            str3 = str2;
                        } else if (z2) {
                            str3 = str2;
                            getButtonThumbLeftEK5gGoQ.serializer(str3.concat(String.valueOf(list2[i])));
                        } else {
                            String strGroup = matcher2.group(1);
                            this.ParcelableVolumeInfo = strGroup;
                            this.MediaSessionCompatToken = list2[i];
                            str.concat(String.valueOf(strGroup));
                            str3 = str2;
                            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                            getButtonThumbLeftEK5gGoQ.serializer("Loading container assets from top level /assets directory. Please move the container asset to /assets/containers");
                            z2 = true;
                        }
                        i++;
                        str = str;
                        str2 = str3;
                        pattern = pattern;
                    }
                } catch (IOException e) {
                    getButtonThumbLeftEK5gGoQ.IconCompatParcelizer("Failed to enumerate assets.", e);
                    return Pair.create(null, null);
                }
            }
            return Pair.create(this.ParcelableVolumeInfo, this.MediaSessionCompatToken);
        } catch (IOException e2) {
            getButtonThumbLeftEK5gGoQ.IconCompatParcelizer("Failed to enumerate assets in folder containers", e2);
            return Pair.create(null, null);
        }
    }

    public static getContactsEK5gGoQ IconCompatParcelizer(Context context, setLastReportedResult setlastreportedresult) {
        getContactsEK5gGoQ getcontactsek5ggoq;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        getContactsEK5gGoQ getcontactsek5ggoq2 = serializer;
        if (getcontactsek5ggoq2 != null) {
            return getcontactsek5ggoq2;
        }
        synchronized (getContactsEK5gGoQ.class) {
            getcontactsek5ggoq = serializer;
            if (getcontactsek5ggoq == null) {
                getcontactsek5ggoq = new getContactsEK5gGoQ(context, setlastreportedresult, new getCutEK5gGoQ(context, accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer()), coil3.util.IntPair.read(context), getDeleteEK5gGoQ.write, getCalendarEK5gGoQ.IconCompatParcelizer(), new accesssetHasRetrievedMethodcp(context, false));
                serializer = getcontactsek5ggoq;
            }
        }
        return getcontactsek5ggoq;
    }

    public getContactsEK5gGoQ(Context context, setLastReportedResult setlastreportedresult, getCutEK5gGoQ getcutek5ggoq, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, getCalendarEK5gGoQ getcalendarek5ggoq, accesssetHasRetrievedMethodcp accesssethasretrievedmethodcp) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(setlastreportedresult);
        this.write = context;
        this.read = setlastreportedresult;
        this.RemoteActionCompatParcelizer = getcutek5ggoq;
        this.MediaBrowserCompatMediaItem = executorService;
        this.RatingCompat = scheduledExecutorService;
        this.MediaMetadataCompat = getcalendarek5ggoq;
        this.MediaDescriptionCompat = accesssethasretrievedmethodcp;
    }
}
