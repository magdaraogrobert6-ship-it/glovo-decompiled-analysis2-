package com.huawei.location.mdc;

import android.location.Location;
import android.os.SystemClock;
import com.huawei.adsdataservice.Entity;
import com.huawei.adsdataservice.Receiver;
import com.huawei.adsdataservice.ResultListener;
import com.huawei.hmiuikitsdk.adsdata.agent.AdsLocationAgent;
import com.huawei.hmiuikitsdk.adsdata.agent.IAdsLocationListener;
import com.huawei.hmiuikitsdk.adsdata.receiver.EgoTfSd;
import com.huawei.hmiuikitsdk.comm.AdsDataServiceSdk;
import o.WindowInfoImplCompanion;
import o.WrappedCompositionsetContent1211;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes2.dex */
public class AdsLocationManager {
    private static final long MDC_TIME_THRESHOLD = 990;
    private static final String TAG = "AdsLocationManager";
    private static volatile AdsLocationManager instance;
    private Entity adsEntity;
    AdsLocationAgent adsLocationAgent;
    IAdsLocationListener iAdsLocationListener;
    private volatile long lastMdcReportTime = 0;
    private volatile int mdcReportCount = 0;
    private static final byte[] VDR_SYNC_LOCK = new byte[0];
    private static final byte[] ENTITY_LOCK = new byte[0];

    /* JADX INFO: Access modifiers changed from: private */
    public void registerAdsLocation() {
        synchronized (ENTITY_LOCK) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "registerAdsLocation");
            try {
                if (this.iAdsLocationListener == null) {
                    this.iAdsLocationListener = new IAdsLocationListener() { // from class: com.huawei.location.mdc.AdsLocationManager.2
                        public void onEgoTfSd(EgoTfSd egoTfSd) {
                            AdsLocationManager.this.dealAdsLocation(egoTfSd);
                        }
                    };
                }
                AdsLocationAgent adsLocationAgent = new AdsLocationAgent(this.adsEntity, this.iAdsLocationListener);
                this.adsLocationAgent = adsLocationAgent;
                adsLocationAgent.subscribe();
            } catch (Exception unused) {
                WrappedCompositionsetContent1211.read(TAG, "registerAdsLocation exception");
            }
        }
    }

    private boolean checkShouldReport() {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (jElapsedRealtimeNanos - this.lastMdcReportTime < 990000000) {
            return false;
        }
        this.lastMdcReportTime = jElapsedRealtimeNanos;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealAdsLocation(EgoTfSd egoTfSd) {
        this.mdcReportCount++;
        if (!checkShouldReport()) {
            WrappedCompositionsetContent1211.read();
            return;
        }
        WindowInfoImplCompanion.serializer(this.mdcReportCount, TAG, new StringBuilder("dealAdsLocation for 1hz, receive mdc report count: "));
        this.mdcReportCount = 0;
        try {
            Location location = AdsLocationHelper.getLocation(egoTfSd);
            if (location == null) {
                return;
            }
            AdsLocationCallbackManager.getInstance().onAdsLocationChanged(location);
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read(TAG, "dealAdsLocation exception.");
        }
    }

    public static AdsLocationManager getInstance() {
        if (instance == null) {
            synchronized (VDR_SYNC_LOCK) {
                if (instance == null) {
                    instance = new AdsLocationManager();
                }
            }
        }
        return instance;
    }

    private void unregisterAdsLocation() {
        try {
            AdsLocationAgent adsLocationAgent = this.adsLocationAgent;
            if (adsLocationAgent != null) {
                adsLocationAgent.unsubscribe();
            }
            Entity entity = this.adsEntity;
            if (entity != null) {
                AdsDataServiceSdk.destroy(entity);
            }
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read(TAG, "unregisterAdsLocation exception");
        }
    }

    public boolean isAdsStart() {
        Entity entity = this.adsEntity;
        return entity != null && entity.isStarted();
    }

    private AdsLocationManager() {
    }

    public void removeLocationUpdates(String str) {
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "removeLocationUpdates");
            AdsLocationCallbackManager.getInstance().removeAdsLocationListener(str);
        }
    }

    public boolean requestLocationUpdates(IMdcLocationListener iMdcLocationListener) {
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "requestLocationUpdates");
            AdsLocationCallbackManager.getInstance().addAdsLocationListener(iMdcLocationListener);
            if (isAdsStart()) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "adsEntity has been init, return here");
                return true;
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "adsEntity not init, init here");
            return initAdsEntity();
        }
    }

    private boolean initAdsEntity() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "initAdsEntity");
        boolean z = true;
        if (isAdsStart()) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "adsEntity has been started, return here");
            return true;
        }
        synchronized (ENTITY_LOCK) {
            try {
                this.adsEntity = AdsDataServiceSdk.create(placeAtf8xVGno.read(), new ResultListener() { // from class: com.huawei.location.mdc.AdsLocationManager.1
                    public void onFailure(String str) {
                        WrappedCompositionsetContent1211.read(AdsLocationManager.TAG, "bindToAdsService on fail: " + str);
                    }

                    public void onSuccess(Receiver receiver) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(AdsLocationManager.TAG, "bindToAdsService onSuccess");
                        AdsLocationManager.this.registerAdsLocation();
                    }
                });
            } catch (Exception e) {
                WrappedCompositionsetContent1211.read(TAG, "initAdsEntity exception: " + e.getMessage());
            }
            if (this.adsEntity == null) {
                z = false;
            }
        }
        return z;
    }
}
