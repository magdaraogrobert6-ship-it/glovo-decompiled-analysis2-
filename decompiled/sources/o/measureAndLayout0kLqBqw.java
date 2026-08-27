package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class measureAndLayout0kLqBqw extends MeasurePassDelegatelayoutChildrenBlock1 {
    public final Double IconCompatParcelizer;
    public final long MediaSessionCompatQueueItem;
    public final boolean RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final long write;

    public measureAndLayout0kLqBqw(Double d, int i, boolean z, int i2, long j, long j2) {
        this.IconCompatParcelizer = d;
        this.read = i;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = i2;
        this.MediaSessionCompatQueueItem = j;
        this.write = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeasurePassDelegatelayoutChildrenBlock1)) {
            return false;
        }
        MeasurePassDelegatelayoutChildrenBlock1 measurePassDelegatelayoutChildrenBlock1 = (MeasurePassDelegatelayoutChildrenBlock1) obj;
        Double d = this.IconCompatParcelizer;
        if (d == null) {
            if (((measureAndLayout0kLqBqw) measurePassDelegatelayoutChildrenBlock1).IconCompatParcelizer != null) {
                return false;
            }
        } else if (!d.equals(((measureAndLayout0kLqBqw) measurePassDelegatelayoutChildrenBlock1).IconCompatParcelizer)) {
            return false;
        }
        measureAndLayout0kLqBqw measureandlayout0klqbqw = (measureAndLayout0kLqBqw) measurePassDelegatelayoutChildrenBlock1;
        return this.read == measureandlayout0klqbqw.read && this.RemoteActionCompatParcelizer == measureandlayout0klqbqw.RemoteActionCompatParcelizer && this.serializer == measureandlayout0klqbqw.serializer && this.MediaSessionCompatQueueItem == measureandlayout0klqbqw.MediaSessionCompatQueueItem && this.write == measureandlayout0klqbqw.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", batteryVelocity=");
        sb.append(this.read);
        sb.append(", proximityOn=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", orientation=");
        sb.append(this.serializer);
        sb.append(", ramUsed=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", diskUsed=");
        return c8$$ExternalSyntheticOutline0.m(this.write, "}", sb);
    }

    public final int hashCode() {
        Double d = this.IconCompatParcelizer;
        int iHashCode = d == null ? 0 : d.hashCode();
        int i = this.read;
        int i2 = this.RemoteActionCompatParcelizer ? 1231 : 1237;
        int i3 = this.serializer;
        long j = this.MediaSessionCompatQueueItem;
        long j2 = this.write;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }
}
