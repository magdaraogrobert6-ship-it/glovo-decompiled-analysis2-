package o;

import com.huawei.hms.location.ActivityIdentificationData;

/* JADX INFO: loaded from: classes3.dex */
public final class showTextSubstitutiondefault {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final setTextSelectionRangeFDrldGo read;
    public final String write;

    public showTextSubstitutiondefault(setTextSelectionRangeFDrldGo settextselectionrangefdrldgo, String str) {
        settextselectionrangefdrldgo.getClass();
        this.read = settextselectionrangefdrldgo;
        this.write = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.write.hashCode() << (this.read.hashCode() % ActivityIdentificationData.RUNNING);
        } else {
            iHashCode = (this.read.hashCode() * 31) + this.write.hashCode();
        }
        int i3 = IconCompatParcelizer + 31;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 103;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 4 % 4;
            }
        } else {
            if (!(obj instanceof showTextSubstitutiondefault)) {
                return false;
            }
            showTextSubstitutiondefault showtextsubstitutiondefault = (showTextSubstitutiondefault) obj;
            if (this.read != showtextsubstitutiondefault.read || (!this.write.equals(showtextsubstitutiondefault.write))) {
                return false;
            }
        }
        int i4 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BiometricBaselineEvent(biometricStatus=" + this.read + ", biometricDetails=" + this.write + ")";
        int i2 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
