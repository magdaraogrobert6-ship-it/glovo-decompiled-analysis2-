package com.qualtrics.digital;

import android.graphics.Color;
import com.adjust.sdk.Constants;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes4.dex */
class SizeAndStyle implements Cloneable {
    String BackgroundScreen;
    int BorderRadius;
    String ContentSpacing;
    String DropShadow;
    String InterceptColor;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SizeAndStyle m4854clone() {
        try {
            return (SizeAndStyle) super.clone();
        } catch (CloneNotSupportedException unused) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    public int getContentSpacing() {
        byte b;
        String str = this.ContentSpacing;
        if (str == null) {
            return 7;
        }
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != -1078030475) {
            if (iHashCode != 950483747) {
                if (iHashCode == 2047584771 && str.equals("spacious")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("compact")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals(Constants.MEDIUM)) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return 10;
        }
        if (b != 1) {
            return b != 2 ? 10 : 15;
        }
        return 3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    public float getDropShadow() {
        byte b;
        String str = this.DropShadow;
        if (str == null) {
            return 0.0f;
        }
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != -618857213) {
            if (iHashCode != 99152071) {
                if (iHashCode == 102970646 && str.equals("light")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("heavy")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("moderate")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return 12.0f;
        }
        if (b != 1) {
            return b != 2 ? 0.0f : 8.0f;
        }
        return 16.0f;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    public int getShadowBoxColor() {
        byte b;
        String str = this.BackgroundScreen;
        if (str == null) {
            return 0;
        }
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != -1078030475) {
            if (iHashCode != 3075958) {
                if (iHashCode == 102970646 && str.equals("light")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("dark")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals(Constants.MEDIUM)) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return Color.argb(64, 0, 0, 0);
        }
        if (b == 1) {
            return Color.argb(153, 0, 0, 0);
        }
        if (b != 2) {
            return 0;
        }
        return Color.argb(26, 0, 0, 0);
    }
}
