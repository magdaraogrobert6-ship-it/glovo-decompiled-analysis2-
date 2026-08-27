package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getHasPendingMeasureOrLayout extends requestLayoutIfCoordinatesAreUsedAndNotifyChildren {
    public final List IconCompatParcelizer;
    public final String read;
    public final int serializer;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.serializer) * 1000003) ^ this.IconCompatParcelizer.hashCode();
    }

    public getHasPendingMeasureOrLayout(List list, int i, String str) {
        this.read = str;
        this.serializer = i;
        this.IconCompatParcelizer = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof requestLayoutIfCoordinatesAreUsedAndNotifyChildren)) {
            return false;
        }
        getHasPendingMeasureOrLayout gethaspendingmeasureorlayout = (getHasPendingMeasureOrLayout) ((requestLayoutIfCoordinatesAreUsedAndNotifyChildren) obj);
        return this.read.equals(gethaspendingmeasureorlayout.read) && this.serializer == gethaspendingmeasureorlayout.serializer && this.IconCompatParcelizer.equals(gethaspendingmeasureorlayout.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.read);
        sb.append(", importance=");
        sb.append(this.serializer);
        sb.append(", frames=");
        return MediaSessionCompatQueueItem.read(sb, this.IconCompatParcelizer, "}");
    }
}
