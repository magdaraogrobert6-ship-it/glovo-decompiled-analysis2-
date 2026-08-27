package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getDuringMeasureLayoutui extends setPlacedui {
    public final String IconCompatParcelizer;
    public final long serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        long j = this.serializer;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public getDuringMeasureLayoutui(String str, String str2, long j) {
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.serializer = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setPlacedui)) {
            return false;
        }
        getDuringMeasureLayoutui getduringmeasurelayoutui = (getDuringMeasureLayoutui) ((setPlacedui) obj);
        return this.write.equals(getduringmeasurelayoutui.write) && this.IconCompatParcelizer.equals(getduringmeasurelayoutui.IconCompatParcelizer) && this.serializer == getduringmeasurelayoutui.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.write);
        sb.append(", code=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", address=");
        return c8$$ExternalSyntheticOutline0.m(this.serializer, "}", sb);
    }
}
