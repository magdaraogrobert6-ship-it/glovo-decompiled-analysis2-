package com.mapbox.navigation.utils.internal;

import com.mapbox.common.NetworkStatus;
import com.mapbox.common.ReachabilityChanged;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectivityHandler implements ReachabilityChanged {
    public final BufferedChannel networkStatusChannel;

    /* JADX INFO: loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkStatus.values().length];
            try {
                iArr[NetworkStatus.NOT_REACHABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkStatus.REACHABLE_VIA_WI_FI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkStatus.REACHABLE_VIA_ETHERNET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkStatus.REACHABLE_VIA_WWAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConnectivityHandler(BufferedChannel bufferedChannel) {
        this.networkStatusChannel = bufferedChannel;
    }

    @Override // com.mapbox.common.ReachabilityChanged
    public final void run(NetworkStatus networkStatus) {
        networkStatus.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[networkStatus.ordinal()];
        BufferedChannel bufferedChannel = this.networkStatusChannel;
        if (i == 1) {
            LoggerProviderKt.logD("NetworkStatus=" + networkStatus, "ConnectivityHandler");
            bufferedChannel.b_(Boolean.FALSE);
            return;
        }
        if (i == 2 || i == 3 || i == 4) {
            LoggerProviderKt.logD("NetworkStatus=" + networkStatus, "ConnectivityHandler");
            bufferedChannel.b_(Boolean.TRUE);
        }
    }
}
