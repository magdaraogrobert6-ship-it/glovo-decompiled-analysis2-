package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class endTransaction extends createOpenDelegate {
    private static int ResultReceiver = 1;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final int ComponentActivity;

    @Override // o.createOpenDelegate
    public final int write() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ResultReceiver = i3;
        int i4 = i2 % 2;
        int i5 = this.ComponentActivity;
        int i6 = i3 + 117;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public endTransaction(int i) {
        this.ComponentActivity = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 5;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.ComponentActivity) * 31;
        int i4 = ResultReceiver + 87;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 21;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(this.ComponentActivity, "StringValue(key=", ", value=null)");
        int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 39;
        ResultReceiver = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = ResultReceiver;
        int i3 = i2 + 97;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            return (obj instanceof endTransaction) && this.ComponentActivity == ((endTransaction) obj).ComponentActivity;
        }
        int i5 = i2 + 31;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
