package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class setDuringMeasureLayoutui extends MergedViewAdapter {
    public final String IconCompatParcelizer;
    public final String read;
    public final boolean serializer;
    public final int write;

    public setDuringMeasureLayoutui(int i, String str, String str2, boolean z) {
        this.write = i;
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.serializer = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MergedViewAdapter)) {
            return false;
        }
        setDuringMeasureLayoutui setduringmeasurelayoutui = (setDuringMeasureLayoutui) ((MergedViewAdapter) obj);
        return this.write == setduringmeasurelayoutui.write && this.IconCompatParcelizer.equals(setduringmeasurelayoutui.IconCompatParcelizer) && this.read.equals(setduringmeasurelayoutui.read) && this.serializer == setduringmeasurelayoutui.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.write);
        sb.append(", version=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", buildVersion=");
        sb.append(this.read);
        sb.append(", jailbroken=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, "}");
    }

    public final int hashCode() {
        int i = this.write;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return ((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ this.read.hashCode()) * 1000003) ^ (this.serializer ? 1231 : 1237);
    }
}
