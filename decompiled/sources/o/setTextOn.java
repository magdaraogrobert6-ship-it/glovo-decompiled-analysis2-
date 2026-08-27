package o;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class setTextOn {
    public final OutputConfiguration read;
    public long write = 1;

    public final int hashCode() {
        int iHashCode = this.read.hashCode() ^ 31;
        return Long.hashCode(this.write) ^ ((iHashCode << 5) - iHashCode);
    }

    public setTextOn(OutputConfiguration outputConfiguration) {
        this.read = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setTextOn)) {
            return false;
        }
        setTextOn settexton = (setTextOn) obj;
        return this.read.equals(settexton.read) && this.write == settexton.write;
    }
}
