package o;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class copy8_81llAdefault {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final performViewCreated RemoteActionCompatParcelizer;
    public final copy8_81llA serializer;

    public copy8_81llAdefault(copy8_81llA copy8_81lla, performViewCreated performviewcreated) {
        performviewcreated.getClass();
        this.serializer = copy8_81lla;
        this.RemoteActionCompatParcelizer = performviewcreated;
    }

    public final boolean RemoteActionCompatParcelizer() {
        getUnspecifiedfcGXIks getunspecifiedfcgxiks;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            copy8_81llA copy8_81lla = this.serializer;
            SharedPreferences sharedPreferences = copy8_81lla.IconCompatParcelizer;
            String str = copy8_81lla.RemoteActionCompatParcelizer;
            String str2 = copy8_81lla.write;
            Object[] objArr = {sharedPreferences.getString(str, str2), str2};
            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
            throw null;
        }
        copy8_81llA copy8_81lla2 = this.serializer;
        SharedPreferences sharedPreferences2 = copy8_81lla2.IconCompatParcelizer;
        String str3 = copy8_81lla2.RemoteActionCompatParcelizer;
        String str4 = copy8_81lla2.write;
        Object[] objArr2 = {sharedPreferences2.getString(str3, str4), str4};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 39;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            getunspecifiedfcgxiks = getUnspecifiedfcGXIks.IN_APP;
        } else {
            getunspecifiedfcgxiks = getUnspecifiedfcGXIks.EXTERNAL_APP;
        }
        if (getunspecifiedfcgxiks != getUnspecifiedfcGXIks.IN_APP || !this.RemoteActionCompatParcelizer.serializer()) {
            return false;
        }
        int i5 = write + 103;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
