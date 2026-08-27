package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class setOnEnter {
    public final setExit read;

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        return this.read.toString();
    }

    public static setOnEnter serializer(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String string;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i8, i7, "M0,", " A", ",");
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i8, i, " 0 1,1 ", ",", sbM);
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i8, i7, " A", ",", sbM);
            sbM.append(i8);
            sbM.append(" 0 1,1 0,");
            sbM.append(i8);
            sbM.append(" Z");
            string = sbM.toString();
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i / 2, i2 / 2);
            int iMin2 = Math.min(iMin, i3);
            int iMin3 = Math.min(iMin, i4);
            int iMin4 = Math.min(iMin, i5);
            int iMin5 = Math.min(iMin, i6);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                c8$$ExternalSyntheticOutline0.m(iMin3, iMin3, " A ", ",", sb);
                c8$$ExternalSyntheticOutline0.m(i, iMin3, " 0 0,1 ", ",", sb);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(",");
            sb.append(i2 - iMin4);
            if (iMin4 > 0) {
                c8$$ExternalSyntheticOutline0.m(iMin4, iMin4, " A ", ",", sb);
                sb.append(" 0 0,1 ");
                sb.append(i - iMin4);
                sb.append(",");
                sb.append(i2);
            }
            c8$$ExternalSyntheticOutline0.m(iMin5, i2, " L ", ",", sb);
            if (iMin5 > 0) {
                c8$$ExternalSyntheticOutline0.m(iMin5, iMin5, " A ", ",", sb);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - iMin5);
            }
            if (iMin2 > 0) {
                c8$$ExternalSyntheticOutline0.m(iMin2, iMin2, " L 0,", " A ", sb);
                c8$$ExternalSyntheticOutline0.m(iMin2, iMin2, ",", " 0 0,1 ", sb);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new setOnEnter(string, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setOnEnter) {
            return this.read.equals(((setOnEnter) obj).read);
        }
        return false;
    }

    static {
        new setOnEnter("", 0, 0);
    }

    public setOnEnter(String str, int i, int i2) {
        this.read = new setExit(str, i, i2);
    }
}
