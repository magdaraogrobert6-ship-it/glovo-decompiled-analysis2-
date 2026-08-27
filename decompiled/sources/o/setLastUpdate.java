package o;

import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class setLastUpdate implements SharedPreferences.Editor {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ SharedPreferences.Editor read;
    public final /* synthetic */ distanceRemainingFormatter serializer;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i);
        int i11 = (~i) | i7;
        int i12 = i10 | (~(i11 | i4));
        int i13 = (~(i | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i2));
        int i15 = i2 + i4 + i3 + (783392123 * i5) + ((-786872706) * i6);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i2) + 1729888256 + (218870266 * i4) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i3) + ((-1731985408) * i5) + ((-471334912) * i6) + ((-600899584) * i16);
        int i18 = (i2 * 375823119) + 1642083618 + (i4 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i3 * 375824245) + (i5 * (-117547465)) + (i6 * 763984278) + (i16 * (-763691008));
        return i17 + ((i18 * i18) * 1830354944) != 1 ? RemoteActionCompatParcelizer(objArr) : write(objArr);
    }

    public setLastUpdate(distanceRemainingFormatter distanceremainingformatter) {
        this.serializer = distanceremainingformatter;
        this.read = distanceremainingformatter.read.edit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read.apply();
        int i4 = write + 101;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        setLastUpdate setlastupdate = (setLastUpdate) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = write + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences.Editor editorPutFloat = setlastupdate.read.putFloat(str, fFloatValue);
        int i4 = RemoteActionCompatParcelizer + 113;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return editorPutFloat;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zCommit = this.read.commit();
        int i4 = write + 73;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zCommit;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        int i = 2 % 2;
        int i2 = write + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences.Editor editorPutBoolean = this.read.putBoolean(str, z);
        int i4 = write + 61;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return editorPutBoolean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 117;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SharedPreferences.Editor editorPutInt = this.read.putInt(str, i);
        int i5 = write + 49;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return editorPutInt;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences.Editor editorPutLong = this.read.putLong(str, j);
        int i4 = RemoteActionCompatParcelizer + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return editorPutLong;
        }
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        SharedPreferences.Editor editorPutString;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            editorPutString = this.read.putString(str, str2);
            int i3 = 66 / 0;
        } else {
            editorPutString = this.read.putString(str, str2);
        }
        int i4 = write + 99;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return editorPutString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences.Editor editorPutStringSet = this.read.putStringSet(str, set);
        int i4 = write + 49;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return editorPutStringSet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        setLastUpdate setlastupdate = (setLastUpdate) objArr[0];
        int i = 2 % 2;
        int i2 = write + 57;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        distanceRemainingFormatter distanceremainingformatter = setlastupdate.serializer;
        distanceremainingformatter.IconCompatParcelizer.edit().clear().apply();
        hslJlNiLsg hsljlnilsg = (hslJlNiLsg) distanceremainingformatter.read.edit();
        hsljlnilsg.clear();
        hsljlnilsg.apply();
        int i4 = write + 11;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setlastupdate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        int i = 2 % 2;
        int i2 = write + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        distanceRemainingFormatter distanceremainingformatter = this.serializer;
        distanceremainingformatter.IconCompatParcelizer.edit().remove(str).apply();
        hslJlNiLsg hsljlnilsg = (hslJlNiLsg) distanceremainingformatter.read.edit();
        hsljlnilsg.remove(str);
        hsljlnilsg.apply();
        int i4 = RemoteActionCompatParcelizer + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        return (SharedPreferences.Editor) IconCompatParcelizer(trackEventI.IconCompatParcelizer(), -2131533673, trackEventI.IconCompatParcelizer(), 2131533674, new Object[]{this, str, Float.valueOf(f)}, trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer());
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        return (SharedPreferences.Editor) IconCompatParcelizer(trackEventI.IconCompatParcelizer(), 1241564420, trackEventI.IconCompatParcelizer(), -1241564420, new Object[]{this}, trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer());
    }
}
