package o;

import com.google.firebase.sessions.settings.SessionConfigs$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class accessscheduleScrollEventIfNeeded {
    public static final SessionConfigs$Companion Companion = new SessionConfigs$Companion();
    public final Integer cacheDurationSeconds;
    public final Long cacheUpdatedTimeSeconds;
    public final Double sessionSamplingRate;
    public final Integer sessionTimeoutSeconds;
    public final Boolean sessionsEnabled;

    public final int hashCode() {
        Boolean bool = this.sessionsEnabled;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Double d = this.sessionSamplingRate;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        Integer num = this.sessionTimeoutSeconds;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.cacheDurationSeconds;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Long l = this.cacheUpdatedTimeSeconds;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (l != null ? l.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessscheduleScrollEventIfNeeded)) {
            return false;
        }
        accessscheduleScrollEventIfNeeded accessschedulescrolleventifneeded = (accessscheduleScrollEventIfNeeded) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionsEnabled, accessschedulescrolleventifneeded.sessionsEnabled}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionSamplingRate, accessschedulescrolleventifneeded.sessionSamplingRate}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionTimeoutSeconds, accessschedulescrolleventifneeded.sessionTimeoutSeconds}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cacheDurationSeconds, accessschedulescrolleventifneeded.cacheDurationSeconds}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cacheUpdatedTimeSeconds, accessschedulescrolleventifneeded.cacheUpdatedTimeSeconds}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.sessionsEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionTimeoutSeconds=" + this.sessionTimeoutSeconds + ", cacheDurationSeconds=" + this.cacheDurationSeconds + ", cacheUpdatedTimeSeconds=" + this.cacheUpdatedTimeSeconds + ')';
    }

    public /* synthetic */ accessscheduleScrollEventIfNeeded(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 == (i & 31)) {
            this.sessionsEnabled = bool;
            this.sessionSamplingRate = d;
            this.sessionTimeoutSeconds = num;
            this.cacheDurationSeconds = num2;
            this.cacheUpdatedTimeSeconds = l;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, accesssetCurrentlyFocusedANIp.read.getDescriptor());
        throw null;
    }

    public accessscheduleScrollEventIfNeeded(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l;
    }
}
