package com.huawei.location.sdm;

import android.location.GnssMeasurement;
import android.location.GnssMeasurementsEvent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.api.location.common.CollectionsUtil;
import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import com.huawei.riemann.common.api.location.SdmLocationClient;
import com.huawei.riemann.location.bean.DeviceInfo;
import com.huawei.riemann.location.bean.obs.GnssClock;
import com.huawei.riemann.location.bean.obs.GnssRawObservation;
import com.huawei.riemann.location.bean.obs.Pvt;
import com.huawei.riemann.location.bean.obs.SatelliteMeasurement;
import java.util.Collection;
import java.util.Iterator;
import o.BringIntoViewModifierNode;
import o.BringIntoViewModifierNodeKt;
import o.BringIntoViewModifierNodeKtbringIntoView2;
import o.ColorResources_androidKt;
import o.ImageResources_androidKt;
import o.PrimaryTextActionModeCallback;
import o.ViewCompatShimsApi29Impl;
import o.ViewStructureCompat;
import o.ViewStructureCompatApi23Impl;
import o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1;
import o.WrappedCompositionsetContent1211;
import o.colorResource;
import o.createLifecycleAwareWindowRecomposer;
import o.findViewTreeCompositionContext;
import o.getClipEntry;
import o.isAutomaticGeofenceRequestsEnabled;
import o.onCreateActionMode;
import o.placeAtf8xVGno;
import o.pluralStringResource;
import o.toAutofillIdCompat;
import o.toViewStructureCompat;

/* JADX INFO: loaded from: classes2.dex */
public class Sdm {
    public HandlerThread IconCompatParcelizer;
    public LocationManager MediaBrowserCompatMediaItem;
    public colorResource MediaDescriptionCompat;
    public DeviceInfo MediaMetadataCompat;
    public ImageResources_androidKt MediaSessionCompatQueueItem;
    public HandlerThread MediaSessionCompatResultReceiverWrapper;
    public Location PlaybackStateCompatCustomAction;
    public createLifecycleAwareWindowRecomposer RatingCompat;
    public ViewCompatShimsApi29Impl RemoteActionCompatParcelizer;
    public ViewStructureCompat ResultReceiver;
    public final toViewStructureCompat r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public SdmLocationClient r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public BringIntoViewModifierNodeKtbringIntoView2 read;
    public findViewTreeCompositionContext write;
    public long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
    public int serializer = 1;
    public Boolean PlaybackStateCompat = Boolean.FALSE;
    public long MediaSessionCompatToken = 0;
    public long ParcelableVolumeInfo = 0;
    public final BringIntoViewModifierNode ComponentActivity = new BringIntoViewModifierNode(0, this);

    public boolean support(long j, float f) {
        boolean z;
        toViewStructureCompat toviewstructurecompat = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (toviewstructurecompat == null) {
            WrappedCompositionsetContent1211.write("Sdm", "no config");
            return false;
        }
        if (j <= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && f <= 10.0f) {
            String str = (String) ViewStructureCompatApi23Impl.RemoteActionCompatParcelizer.getOrDefault(SystemPropertiesUtil.serializer(), "");
            if (!"".equals(str)) {
                String str2 = (String) BringIntoViewModifierNodeKt.RemoteActionCompatParcelizer.get(Integer.valueOf(Build.VERSION.SDK_INT));
                toviewstructurecompat.getClass();
                String str3 = str + BundleUtil.UNDERLINE_TAG + str2;
                Iterator it = toviewstructurecompat.IconCompatParcelizer.deviceList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((String) it.next()).equals(str3)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            boolean z2 = PrimaryTextActionModeCallback.serializer() != 3 ? z : false;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("Sdm", "SDM support:" + z2 + ",The phone ChipType:" + str + ",The phone OsVersion:" + ((String) BringIntoViewModifierNodeKt.RemoteActionCompatParcelizer.get(Integer.valueOf(Build.VERSION.SDK_INT))));
            return z2;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("Sdm", "not support sdm, minTime:" + j + ",minDistance:" + f);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void read(createLifecycleAwareWindowRecomposer createlifecycleawarewindowrecomposer) {
        HandlerThread handlerThread;
        if (this.RatingCompat == null) {
            ImageResources_androidKt imageResources_androidKt = this.MediaSessionCompatQueueItem;
            toViewStructureCompat toviewstructurecompat = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            int i = 0;
            Object[] objArr = 0;
            if (imageResources_androidKt == null) {
                int i2 = toviewstructurecompat.IconCompatParcelizer.tileDailyMaxNum;
                int i3 = toviewstructurecompat.IconCompatParcelizer.tileMaxNum;
                ImageResources_androidKt imageResources_androidKt2 = new ImageResources_androidKt(0);
                imageResources_androidKt2.RemoteActionCompatParcelizer = i2;
                imageResources_androidKt2.serializer = i3;
                imageResources_androidKt2.read = new ColorResources_androidKt(i2, i3);
                this.MediaSessionCompatQueueItem = imageResources_androidKt2;
            }
            Object systemService = placeAtf8xVGno.read().getSystemService("location");
            if (systemService instanceof LocationManager) {
                this.MediaBrowserCompatMediaItem = (LocationManager) systemService;
            }
            if (this.write == null) {
                findViewTreeCompositionContext findviewtreecompositioncontext = new findViewTreeCompositionContext();
                findviewtreecompositioncontext.read = new pluralStringResource();
                this.write = findviewtreecompositioncontext;
            }
            if (this.read == null) {
                BringIntoViewModifierNodeKtbringIntoView2 bringIntoViewModifierNodeKtbringIntoView2 = new BringIntoViewModifierNodeKtbringIntoView2();
                bringIntoViewModifierNodeKtbringIntoView2.MediaSessionCompatToken = -1;
                bringIntoViewModifierNodeKtbringIntoView2.MediaBrowserCompatMediaItem = 0L;
                bringIntoViewModifierNodeKtbringIntoView2.MediaSessionCompatQueueItem = new i$d.a(23, bringIntoViewModifierNodeKtbringIntoView2);
                this.read = bringIntoViewModifierNodeKtbringIntoView2;
            }
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = new colorResource(i, (boolean) (objArr == true ? 1 : 0));
            }
            if (this.MediaMetadataCompat == null) {
                DeviceInfo.Builder builderADeviceInfo = DeviceInfo.Builder.aDeviceInfo();
                builderADeviceInfo.withChipName((String) ViewStructureCompatApi23Impl.IconCompatParcelizer.getOrDefault(SystemPropertiesUtil.serializer(), ""));
                builderADeviceInfo.withManufacturer(Build.MANUFACTURER);
                builderADeviceInfo.withSdkLevel(Build.VERSION.SDK_INT);
                this.MediaMetadataCompat = builderADeviceInfo.build();
            }
            colorResource colorresource = this.MediaDescriptionCompat;
            colorresource.getClass();
            onCreateActionMode.write.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(2, colorresource));
            HandlerThread handlerThread2 = this.IconCompatParcelizer;
            if (handlerThread2 == null || !handlerThread2.isAlive()) {
                HandlerThread handlerThread3 = new HandlerThread("Location-SDM-SUPPORT");
                this.IconCompatParcelizer = handlerThread3;
                handlerThread3.start();
            }
            BringIntoViewModifierNodeKtbringIntoView2 bringIntoViewModifierNodeKtbringIntoView3 = this.read;
            Looper looper = this.IconCompatParcelizer.getLooper();
            findViewTreeCompositionContext findviewtreecompositioncontext2 = this.write;
            bringIntoViewModifierNodeKtbringIntoView3.read = toviewstructurecompat;
            bringIntoViewModifierNodeKtbringIntoView3.PlaybackStateCompatCustomAction = findviewtreecompositioncontext2;
            if (bringIntoViewModifierNodeKtbringIntoView3.MediaDescriptionCompat == null) {
                bringIntoViewModifierNodeKtbringIntoView3.MediaDescriptionCompat = new toAutofillIdCompat(bringIntoViewModifierNodeKtbringIntoView3, looper, 8);
            }
            if (bringIntoViewModifierNodeKtbringIntoView3.MediaDescriptionCompat.hasMessages(11)) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SDMSupportManager", "init failed,caz has msg");
            } else {
                bringIntoViewModifierNodeKtbringIntoView3.MediaDescriptionCompat.sendEmptyMessage(11);
            }
            if (this.RemoteActionCompatParcelizer == null || (handlerThread = this.MediaSessionCompatResultReceiverWrapper) == null || !handlerThread.isAlive()) {
                HandlerThread handlerThread4 = new HandlerThread("Sdm");
                this.MediaSessionCompatResultReceiverWrapper = handlerThread4;
                handlerThread4.start();
                this.RemoteActionCompatParcelizer = new ViewCompatShimsApi29Impl(this, this.MediaSessionCompatResultReceiverWrapper.getLooper());
            }
            this.RemoteActionCompatParcelizer.obtainMessage(4, createlifecycleawarewindowrecomposer).sendToTarget();
        }
    }

    public final void serializer(GnssMeasurementsEvent gnssMeasurementsEvent, Location location) {
        GnssRawObservation[] gnssRawObservationArr;
        Pvt.Builder.aPvt();
        Pvt pvtBuild = Pvt.Builder.aPvt().withAccuracy(location.getAccuracy()).withAltitude(location.getAltitude()).withLatitude(location.getLatitude()).withBearing(location.getBearing()).withLongitude(location.getLongitude()).withSpeed(location.getSpeed()).withTime(location.getTime()).build();
        Collection<GnssMeasurement> measurements = gnssMeasurementsEvent.getMeasurements();
        int i = 0;
        if (measurements != null && !measurements.isEmpty() && gnssMeasurementsEvent.getClock() != null) {
            GnssClock gnssClockBuild = GnssClock.Builder.aGnssClock().withBiasNanos(gnssMeasurementsEvent.getClock().hasBiasNanos() ? gnssMeasurementsEvent.getClock().getBiasNanos() : 0.0d).withBiasUncertaintyNanos(gnssMeasurementsEvent.getClock().hasBiasUncertaintyNanos() ? gnssMeasurementsEvent.getClock().getBiasUncertaintyNanos() : 0.0d).withDriftNanosPerSecond(gnssMeasurementsEvent.getClock().hasDriftNanosPerSecond() ? gnssMeasurementsEvent.getClock().getDriftNanosPerSecond() : 0.0d).withDriftUncertaintyNanosPerSecond(gnssMeasurementsEvent.getClock().hasDriftUncertaintyNanosPerSecond() ? gnssMeasurementsEvent.getClock().getDriftUncertaintyNanosPerSecond() : 0.0d).withFullBiasNanos(gnssMeasurementsEvent.getClock().getFullBiasNanos()).withHardwareClockDiscontinuityCount(gnssMeasurementsEvent.getClock().getHardwareClockDiscontinuityCount()).withLeapSecond(gnssMeasurementsEvent.getClock().hasLeapSecond() ? gnssMeasurementsEvent.getClock().getLeapSecond() : 0).withTimeNanos(gnssMeasurementsEvent.getClock().getTimeNanos()).withTimeUncertaintyNanos(gnssMeasurementsEvent.getClock().hasTimeUncertaintyNanos() ? gnssMeasurementsEvent.getClock().getTimeUncertaintyNanos() : 0.0d).withElapsedRealtimeMillis(Build.VERSION.SDK_INT >= 29 ? gnssMeasurementsEvent.getClock().getElapsedRealtimeNanos() : 0L).build();
            int size = gnssMeasurementsEvent.getMeasurements().size();
            gnssRawObservationArr = new GnssRawObservation[size];
            for (GnssMeasurement gnssMeasurement : gnssMeasurementsEvent.getMeasurements()) {
                SatelliteMeasurement.Builder builderWithSvid = SatelliteMeasurement.Builder.aSatelliteMeasurement().withAccumulatedDeltaRangeMeters(gnssMeasurement.getAccumulatedDeltaRangeMeters()).withAccumulatedDeltaRangeState(gnssMeasurement.getAccumulatedDeltaRangeState()).withAccumulatedDeltaRangeUncertaintyMeters(gnssMeasurement.getAccumulatedDeltaRangeUncertaintyMeters()).withCarrierCycles(gnssMeasurement.hasCarrierCycles() ? gnssMeasurement.getCarrierCycles() : 0L).withCarrierFrequencyHz(gnssMeasurement.hasCarrierFrequencyHz() ? gnssMeasurement.getCarrierFrequencyHz() : 0.0f).withCarrierPhase(gnssMeasurement.hasCarrierPhase() ? gnssMeasurement.getCarrierPhase() : 0.0d).withCarrierPhaseUncertainty(gnssMeasurement.hasCarrierPhaseUncertainty() ? gnssMeasurement.getCarrierPhaseUncertainty() : 0.0d).withCn0DbHz(gnssMeasurement.getCn0DbHz()).withConstellationType(gnssMeasurement.getConstellationType()).withSnrInDb(gnssMeasurement.hasSnrInDb() ? gnssMeasurement.getSnrInDb() : 0.0d).withMultipathIndicator(gnssMeasurement.getMultipathIndicator()).withTimeOffsetNanos(gnssMeasurement.getTimeOffsetNanos()).withPseudorangeRateMetersPerSecond(gnssMeasurement.getPseudorangeRateMetersPerSecond()).withPseudorangeRateUncertaintyMetersPerSecond(gnssMeasurement.getPseudorangeRateUncertaintyMetersPerSecond()).withReceivedSvTimeNanos(gnssMeasurement.getReceivedSvTimeNanos()).withReceivedSvTimeUncertaintyNanos(gnssMeasurement.getReceivedSvTimeUncertaintyNanos()).withState(gnssMeasurement.getState()).withSvid(gnssMeasurement.getSvid());
                int i2 = Build.VERSION.SDK_INT;
                builderWithSvid.withAutomaticGainControlLevelInDb(gnssMeasurement.hasAutomaticGainControlLevelDb() ? gnssMeasurement.getAutomaticGainControlLevelDb() : 0.0d);
                if (i2 >= 30) {
                    builderWithSvid.withFullInterSignalBiasNanos(gnssMeasurement.hasFullInterSignalBiasNanos() ? gnssMeasurement.getFullInterSignalBiasNanos() : 0.0d);
                    builderWithSvid.withFullInterSignalBiasUncertaintyNanos(gnssMeasurement.hasFullInterSignalBiasUncertaintyNanos() ? gnssMeasurement.getFullInterSignalBiasUncertaintyNanos() : 0.0d);
                    builderWithSvid.withSatelliteInterSignalBiasNanos(gnssMeasurement.hasSatelliteInterSignalBiasNanos() ? gnssMeasurement.getSatelliteInterSignalBiasNanos() : 0.0d);
                    builderWithSvid.withSatelliteInterSignalBiasUncertaintyNanos(gnssMeasurement.hasSatelliteInterSignalBiasUncertaintyNanos() ? gnssMeasurement.getSatelliteInterSignalBiasUncertaintyNanos() : 0.0d);
                } else {
                    builderWithSvid.withFullInterSignalBiasNanos(0.0d);
                    builderWithSvid.withFullInterSignalBiasUncertaintyNanos(0.0d);
                    builderWithSvid.withSatelliteInterSignalBiasNanos(0.0d);
                    builderWithSvid.withSatelliteInterSignalBiasUncertaintyNanos(0.0d);
                }
                SatelliteMeasurement satelliteMeasurementBuild = builderWithSvid.build();
                if (i >= 0 && i < size) {
                    gnssRawObservationArr[i] = GnssRawObservation.Builder.aGnssRawObservation().withSatelliteMeasurement(satelliteMeasurementBuild).withGnssClock(gnssClockBuild).build();
                    i++;
                }
            }
        } else {
            gnssRawObservationArr = new GnssRawObservation[0];
        }
        if (CollectionsUtil.isEmpty(gnssRawObservationArr) || gnssRawObservationArr.length < 10) {
            return;
        }
        Pvt pvtProcess = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.process(pvtBuild, gnssRawObservationArr);
        if (pvtProcess.getErrCode() != 0) {
            this.PlaybackStateCompat = Boolean.FALSE;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("Sdm", "pvt handle error,errorCode is :" + pvtProcess.getErrCode());
            return;
        }
        this.PlaybackStateCompat = Boolean.TRUE;
        location.setLongitude(pvtProcess.getLongitude());
        location.setLatitude(pvtProcess.getLatitude());
        location.setAccuracy(pvtProcess.getAccuracy());
        location.setBearing(pvtProcess.getBearing());
        location.setAltitude(pvtProcess.getAltitude());
        location.setSpeed(pvtProcess.getSpeed());
        Bundle extras = location.getExtras();
        getClipEntry getclipentry = new getClipEntry(extras, 1);
        if (getclipentry.IconCompatParcelizer("LocationSource")) {
            getclipentry.write(extras.getInt("LocationSource") | 1);
        } else {
            getclipentry.write(1);
        }
        location.setExtras(getclipentry.serializer);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("Sdm", "processLocation success here, the location has been deflected");
    }

    public Sdm() {
        String str;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        toViewStructureCompat toviewstructurecompat = new toViewStructureCompat();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = toviewstructurecompat;
        Config$Configurations config$Configurations = (Config$Configurations) WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1.serializer.serializer(Config$Configurations.class, "sdm");
        toviewstructurecompat.IconCompatParcelizer = config$Configurations;
        if (config$Configurations == null) {
            str = "failed to get config";
        } else {
            if (config$Configurations.valid()) {
                toviewstructurecompat.IconCompatParcelizer.toString();
                WrappedCompositionsetContent1211.read();
                long unused = toviewstructurecompat.IconCompatParcelizer.ephemerisValidTime;
                return;
            }
            str = "config not valid";
        }
        WrappedCompositionsetContent1211.read("Config", str);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
    }
}
