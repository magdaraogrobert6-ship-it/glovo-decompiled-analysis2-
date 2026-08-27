package o;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds {
    private static int read = 1;
    private static int write;
    public final SharedPreferences IconCompatParcelizer;

    public r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.IconCompatParcelizer = sharedPreferences;
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        int i = 2 % 2;
        int i2 = read + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences.Editor editorEdit = this.IconCompatParcelizer.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
        int i4 = write + 1;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean IconCompatParcelizer(String str) {
        int i = 2 % 2;
        SharedPreferences sharedPreferences = this.IconCompatParcelizer;
        if (!sharedPreferences.contains(str)) {
            int i2 = read + 115;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 92 / 0;
            }
            return null;
        }
        int i4 = read + 97;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        Boolean boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
        int i6 = write + 107;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }
}
