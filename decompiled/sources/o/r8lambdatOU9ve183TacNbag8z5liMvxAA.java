package o;

import com.sentiance.sdk.quota.BandwidthQuotaMonitor;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdatOU9ve183TacNbag8z5liMvxAA {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[BandwidthQuotaMonitor.NetworkType.values().length];
        write = iArr;
        try {
            iArr[BandwidthQuotaMonitor.NetworkType.MOBILE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[BandwidthQuotaMonitor.NetworkType.WIFI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
