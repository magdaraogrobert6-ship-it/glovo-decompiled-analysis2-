package o;

import android.content.Context;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.devicestate.LocationPermissionLevel;
import com.sentiance.sdk.devicestate.LocationSetting;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "DeviceState")
public class isGeofencesEnabledFromEnvironmentlambda1 {
    private final Context IconCompatParcelizer;
    private final TelephonyManager MediaMetadataCompat;
    private final onLocationRequestCompletelambda1 MediaSessionCompatQueueItem;
    private final isGeofencesEnabledFromEnvironmentlambda4 RemoteActionCompatParcelizer;
    private final BannersDataStoreProviderCompanionExternalSyntheticLambda2 read;
    private final LocationManager serializer;
    private final ConfigurationManager write;

    public final boolean MediaSessionCompatQueueItem() {
        try {
            return Settings.Global.getInt(this.IconCompatParcelizer.getContentResolver(), "airplane_mode_on") == 1;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    public final LocationSetting IconCompatParcelizer() {
        LocationManager locationManager = this.serializer;
        return new LocationSetting(locationManager.isProviderEnabled("gps"), locationManager.isProviderEnabled("network"));
    }

    public final boolean MediaBrowserCompatMediaItem() {
        LocationPermissionLevel locationPermissionLevelWrite = this.MediaSessionCompatQueueItem.write();
        return MediaMetadataCompat() && ((locationPermissionLevelWrite == LocationPermissionLevel.ALWAYS) || ((locationPermissionLevelWrite != LocationPermissionLevel.NEVER && this.read.IconCompatParcelizer()) && this.write.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ()));
    }

    public final boolean MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer.serializer();
    }

    public final boolean ParcelableVolumeInfo() {
        return this.RemoteActionCompatParcelizer.serializer.isScanAlwaysAvailable();
    }

    public final boolean RatingCompat() {
        return this.RemoteActionCompatParcelizer.read();
    }

    public final WifiInfo RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.serializer.getConnectionInfo();
    }

    public final int read() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public final int serializer() {
        return this.RemoteActionCompatParcelizer.serializer.getWifiState();
    }

    public final boolean write() {
        String networkOperator = this.MediaMetadataCompat.getNetworkOperator();
        return networkOperator != null && networkOperator.length() > 0;
    }

    public isGeofencesEnabledFromEnvironmentlambda1(Context context, LocationManager locationManager, isGeofencesEnabledFromEnvironmentlambda4 isgeofencesenabledfromenvironmentlambda4, ConfigurationManager configurationManager, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, BannersDataStoreProviderCompanionExternalSyntheticLambda2 bannersDataStoreProviderCompanionExternalSyntheticLambda2, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, TelephonyManager telephonyManager) {
        this.IconCompatParcelizer = context;
        this.serializer = locationManager;
        this.write = configurationManager;
        this.RemoteActionCompatParcelizer = isgeofencesenabledfromenvironmentlambda4;
        this.read = bannersDataStoreProviderCompanionExternalSyntheticLambda2;
        this.MediaSessionCompatQueueItem = onlocationrequestcompletelambda1;
        this.MediaMetadataCompat = telephonyManager;
    }

    public final boolean MediaMetadataCompat() {
        LocationSetting locationSettingIconCompatParcelizer = IconCompatParcelizer();
        ConfigurationManager configurationManager = this.write;
        boolean z = (configurationManager.IconCompatParcelizer("gps") && locationSettingIconCompatParcelizer.IconCompatParcelizer()) || (configurationManager.IconCompatParcelizer("network") && locationSettingIconCompatParcelizer.write());
        LocationPermissionLevel locationPermissionLevelWrite = this.MediaSessionCompatQueueItem.write();
        return !MediaSessionCompatQueueItem() && z && ((locationPermissionLevelWrite == LocationPermissionLevel.ALWAYS) || (locationPermissionLevelWrite != LocationPermissionLevel.NEVER && this.read.IconCompatParcelizer()));
    }
}
