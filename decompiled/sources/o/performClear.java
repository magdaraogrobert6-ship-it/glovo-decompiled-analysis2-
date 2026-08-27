package o;

import android.content.SharedPreferences;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class performClear implements SharedPreferences.Editor {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final SharedPreferences.Editor serializer;
    public final String write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | i4)) | i8;
        int i10 = ~i3;
        int i11 = ~i4;
        int i12 = i9 | (~(i10 | i11 | i2));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i2;
        int i15 = (~(i4 | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i2 + i3 + i6 + ((-327997910) * i5) + ((-604038433) * i);
        int i18 = i17 * i17;
        int i19 = ((i2 * 234895570) - 128974848) + (234895570 * i3) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i6) + (36700160 * i5) + ((-297271296) * i) + (1302134784 * i18);
        int i20 = (i2 * (-238133666)) + 182491156 + (i3 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i6 * (-238134313)) + (i5 * (-1022231738)) + (i * 4118089) + (i18 * (-35979264));
        if (i19 + (i20 * i20 * 1404239872) != 1) {
            return read(objArr);
        }
        performClear performclear = (performClear) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i21 = 2 % 2;
        int i22 = RemoteActionCompatParcelizer + 87;
        read = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i23 = i22 % 2;
        performclear.serializer.putBoolean(str, zBooleanValue);
        int i24 = read + 51;
        RemoteActionCompatParcelizer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i25 = i24 % 2;
        return performclear;
    }

    public performClear(SharedPreferences.Editor editor, String str, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = editor;
        this.write = str;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        int i = 2 % 2;
        int i2 = read + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer.clear();
        int i4 = read + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        int i = 2 % 2;
        int i2 = read + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer.putFloat(str, f);
        int i4 = RemoteActionCompatParcelizer + 111;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        int i2 = 2 % 2;
        int i3 = read + 53;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            this.serializer.putInt(str, i);
            int i4 = 64 / 0;
        } else {
            this.serializer.putInt(str, i);
        }
        int i5 = RemoteActionCompatParcelizer + 75;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        int i = 2 % 2;
        int i2 = read + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer.putLong(str, j);
        int i4 = read + 79;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer.putString(str, str2);
            int i3 = 32 / 0;
        } else {
            this.serializer.putString(str, str2);
        }
        int i4 = read + 95;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        int i = 2 % 2;
        int i2 = read + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer.putStringSet(str, set);
            throw null;
        }
        this.serializer.putStringSet(str, set);
        int i3 = read + 73;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer.remove(str);
        int i4 = read + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return this;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        performClear performclear = (performClear) objArr[0];
        int i = 2 % 2;
        int i2 = read + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zCommit = performclear.serializer.commit();
        int i4 = read + 105;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zCommit);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new MapLayersUiModel$1(this, null, 13), 3);
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        Object[] objArr = {this, str, Boolean.valueOf(z)};
        int iIconCompatParcelizer = getSelectionEndui_text.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getSelectionEndui_text.IconCompatParcelizer();
        return (SharedPreferences.Editor) RemoteActionCompatParcelizer(getSelectionEndui_text.IconCompatParcelizer(), objArr, -779309587, 779309588, iIconCompatParcelizer, getSelectionEndui_text.IconCompatParcelizer(), iIconCompatParcelizer2);
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        int iIconCompatParcelizer = getSelectionEndui_text.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getSelectionEndui_text.IconCompatParcelizer();
        int iIconCompatParcelizer3 = getSelectionEndui_text.IconCompatParcelizer();
        return ((Boolean) RemoteActionCompatParcelizer(getSelectionEndui_text.IconCompatParcelizer(), new Object[]{this}, 479150750, -479150750, iIconCompatParcelizer, iIconCompatParcelizer3, iIconCompatParcelizer2)).booleanValue();
    }
}
