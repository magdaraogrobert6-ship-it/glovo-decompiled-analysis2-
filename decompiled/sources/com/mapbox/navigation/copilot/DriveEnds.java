package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class DriveEnds {
    private final long realDuration;
    private final String type;

    public final String component1() {
        return this.type;
    }

    public final long component2() {
        return this.realDuration;
    }

    public final long getRealDuration() {
        return this.realDuration;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Long.hashCode(this.realDuration) + (this.type.hashCode() * 31);
    }

    public DriveEnds(String str, long j) {
        str.getClass();
        this.type = str;
        this.realDuration = j;
    }

    public static /* synthetic */ DriveEnds copy$default(DriveEnds driveEnds, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = driveEnds.type;
        }
        if ((i & 2) != 0) {
            j = driveEnds.realDuration;
        }
        return driveEnds.copy(str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveEnds)) {
            return false;
        }
        DriveEnds driveEnds = (DriveEnds) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, driveEnds.type}, getCieXyz.write())).booleanValue() && this.realDuration == driveEnds.realDuration;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DriveEnds(type=");
        sb.append(this.type);
        sb.append(", realDuration=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.realDuration, ')');
    }

    public final DriveEnds copy(String str, long j) {
        str.getClass();
        return new DriveEnds(str, j);
    }
}
