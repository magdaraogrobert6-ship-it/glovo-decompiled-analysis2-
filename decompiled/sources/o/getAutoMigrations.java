package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getAutoMigrations extends createOpenDelegate {
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final int ComponentActivity;

    @Override // o.createOpenDelegate
    public final int write() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i3 = i2 + 123;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.ComponentActivity;
        int i5 = i2 + 71;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public getAutoMigrations(int i) {
        this.ComponentActivity = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 63;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i2 % 2 != 0 ? Integer.hashCode(this.ComponentActivity) % 124 : Integer.hashCode(this.ComponentActivity) * 31;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 119;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = d$$ExternalSyntheticOutline0.m(this.ComponentActivity, "BooleanValue(key=", ", value=null)");
            int i3 = 62 / 0;
        } else {
            strM = d$$ExternalSyntheticOutline0.m(this.ComponentActivity, "BooleanValue(key=", ", value=null)");
        }
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 49;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = i2 + 107;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj || ((obj instanceof getAutoMigrations) && this.ComponentActivity == ((getAutoMigrations) obj).ComponentActivity)) {
            return true;
        }
        int i5 = i2 + 1;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
