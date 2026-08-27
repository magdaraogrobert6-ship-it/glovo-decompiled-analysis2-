package com.sentiance.sdk.quota;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.EnumMap;
import java.util.Map;
import o.getAnalyticsEnabledEnterannotations;
import o.handleAdmRegistrationEventIfEnabledlambda0;
import o.isGeofencesEnabledFromEnvironmentlambda1;
import o.parseLonglambda0;
import o.r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k;
import o.r8lambdatOU9ve183TacNbag8z5liMvxAA;
import o.removeGeofencesRegisteredWithGeofencingClientlambda2;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "BandwidthQuotaMonitor")
public class BandwidthQuotaMonitor implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final EnumMap RatingCompat = new EnumMap(NetworkType.class);
    private final handleAdmRegistrationEventIfEnabledlambda0 RemoteActionCompatParcelizer;
    private final isGeofencesEnabledFromEnvironmentlambda1 read;
    private final parseLonglambda0 serializer;
    private final ConfigurationManager write;

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface IconCompatParcelizer {
    }

    public enum NetworkType {
        MOBILE,
        WIFI,
        NONE
    }

    private void read() {
        synchronized (this) {
            for (NetworkType networkType : NetworkType.values()) {
                if (networkType != NetworkType.NONE) {
                    long jSerializer = this.RemoteActionCompatParcelizer.serializer(networkType);
                    int i = jSerializer >= serializer(networkType) ? 2 : ((float) jSerializer) >= ((float) serializer(networkType)) * 0.9f ? 1 : 0;
                    Integer num = (Integer) this.RatingCompat.put(networkType, Integer.valueOf(i));
                    if (num != null && !num.equals(Integer.valueOf(i))) {
                        this.IconCompatParcelizer.IconCompatParcelizer(ControlMessage.BANDWIDTH_QUOTA_STATUS_UPDATED, (Object) null);
                    }
                }
            }
        }
    }

    public final int IconCompatParcelizer(NetworkType networkType) {
        synchronized (this) {
            if (networkType == NetworkType.NONE) {
                return 2;
            }
            Integer num = (Integer) this.RatingCompat.get(networkType);
            return num != null ? num.intValue() : 0;
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.RatingCompat.clear();
            this.RemoteActionCompatParcelizer.clearData();
            read();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    public final long read(NetworkType networkType) {
        return this.RemoteActionCompatParcelizer.serializer(networkType);
    }

    public final void read(long j) {
        NetworkType networkType;
        int i = this.read.read();
        if (i != 1) {
            networkType = i != 2 ? NetworkType.NONE : NetworkType.MOBILE;
        } else {
            networkType = NetworkType.WIFI;
        }
        handleAdmRegistrationEventIfEnabledlambda0 handleadmregistrationeventifenabledlambda0 = this.RemoteActionCompatParcelizer;
        long jSerializer = handleadmregistrationeventifenabledlambda0.serializer(networkType);
        this.serializer.IconCompatParcelizer("Adding %,d bytes to %,d = %,d, limit=%,d, network=%s", Long.valueOf(j), Long.valueOf(jSerializer), Long.valueOf(jSerializer + j), Long.valueOf(serializer(networkType)), networkType.name());
        handleadmregistrationeventifenabledlambda0.serializer(j, networkType);
        read();
    }

    public BandwidthQuotaMonitor(parseLonglambda0 parselonglambda0, handleAdmRegistrationEventIfEnabledlambda0 handleadmregistrationeventifenabledlambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, ConfigurationManager configurationManager, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1) {
        this.serializer = parselonglambda0;
        this.RemoteActionCompatParcelizer = handleadmregistrationeventifenabledlambda0;
        this.read = isgeofencesenabledfromenvironmentlambda1;
        this.write = configurationManager;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        read();
    }

    public final boolean serializer() {
        NetworkType networkType;
        int i = this.read.read();
        if (i == 1) {
            networkType = NetworkType.WIFI;
        } else if (i != 2) {
            networkType = NetworkType.NONE;
        } else {
            networkType = NetworkType.MOBILE;
        }
        return IconCompatParcelizer(networkType) == 2;
    }

    public final long serializer(NetworkType networkType) {
        int i = r8lambdatOU9ve183TacNbag8z5liMvxAA.write[networkType.ordinal()];
        ConfigurationManager configurationManager = this.write;
        if (i == 1) {
            return configurationManager.MediaBrowserCompatMediaItem();
        }
        if (i != 2) {
            return -1L;
        }
        return configurationManager.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }
}
