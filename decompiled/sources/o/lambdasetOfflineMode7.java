package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.realtime.configuration.ReconnectConfiguration$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class lambdasetOfflineMode7 {
    public static final ReconnectConfiguration$Companion Companion = new ReconnectConfiguration$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final double backoffMultiplier;
    public final long foregroundReconnectDelay;
    public final long initialBackoffDelayInSeconds;
    public final long maxBackoffDelayInSeconds;
    public final int maxReconnectAttempts;
    public final long offlinePollInterval;

    static {
        int i = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ lambdasetOfflineMode7(int i, long j, long j2, double d, long j3, int i2, long j4) {
        this.foregroundReconnectDelay = (i & 1) == 0 ? 10L : j;
        if ((i & 2) == 0) {
            int i3 = read + 21;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                this.offlinePollInterval = 2L;
                int i4 = 60 / 0;
            } else {
                this.offlinePollInterval = 2L;
            }
            int i5 = 2 % 2;
        } else {
            this.offlinePollInterval = j2;
        }
        if ((i & 4) == 0) {
            int i6 = serializer + 99;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            this.backoffMultiplier = 2.0d;
        } else {
            this.backoffMultiplier = d;
        }
        if ((i & 8) == 0) {
            this.maxBackoffDelayInSeconds = 32L;
        } else {
            this.maxBackoffDelayInSeconds = j3;
            int i8 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.maxReconnectAttempts = 6;
        } else {
            this.maxReconnectAttempts = i2;
            int i9 = 2 % 2;
        }
        if ((i & 32) == 0) {
            this.initialBackoffDelayInSeconds = 1L;
        } else {
            this.initialBackoffDelayInSeconds = j4;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.initialBackoffDelayInSeconds) + af$$ExternalSyntheticOutline0.m(this.maxReconnectAttempts, d$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.backoffMultiplier, d$$ExternalSyntheticOutline0.m(Long.hashCode(this.foregroundReconnectDelay) * 31, 31, this.offlinePollInterval), 31), 31, this.maxBackoffDelayInSeconds), 31);
        int i4 = serializer + 101;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(this.foregroundReconnectDelay, "ReconnectConfiguration(foregroundReconnectDelay=", ", offlinePollInterval=");
        sbM.append(this.offlinePollInterval);
        sbM.append(", backoffMultiplier=");
        sbM.append(this.backoffMultiplier);
        sbM.append(", maxBackoffDelayInSeconds=");
        sbM.append(this.maxBackoffDelayInSeconds);
        sbM.append(", maxReconnectAttempts=");
        sbM.append(this.maxReconnectAttempts);
        sbM.append(", initialBackoffDelayInSeconds=");
        sbM.append(this.initialBackoffDelayInSeconds);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 43;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public lambdasetOfflineMode7() {
        this.foregroundReconnectDelay = 10L;
        this.offlinePollInterval = 2L;
        this.backoffMultiplier = 2.0d;
        this.maxBackoffDelayInSeconds = 32L;
        this.maxReconnectAttempts = 6;
        this.initialBackoffDelayInSeconds = 1L;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdasetOfflineMode7)) {
            return false;
        }
        lambdasetOfflineMode7 lambdasetofflinemode7 = (lambdasetOfflineMode7) obj;
        if (this.foregroundReconnectDelay != lambdasetofflinemode7.foregroundReconnectDelay) {
            int i2 = read + 15;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (this.offlinePollInterval != lambdasetofflinemode7.offlinePollInterval) {
            int i4 = read + 29;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (Double.compare(this.backoffMultiplier, lambdasetofflinemode7.backoffMultiplier) != 0 || this.maxBackoffDelayInSeconds != lambdasetofflinemode7.maxBackoffDelayInSeconds || this.maxReconnectAttempts != lambdasetofflinemode7.maxReconnectAttempts) {
            return false;
        }
        if (this.initialBackoffDelayInSeconds == lambdasetofflinemode7.initialBackoffDelayInSeconds) {
            return true;
        }
        int i6 = serializer + 59;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 != 0;
    }
}
