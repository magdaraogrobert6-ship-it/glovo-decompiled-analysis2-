package o;

import android.content.SharedPreferences;
import com.huawei.location.nlp.network.request.wifi.WifiExtraInfo;
import java.util.Map;
import java.util.Set;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class isMainThreadroom_runtime implements SharedPreferences {
    private static int MediaSessionCompatQueueItem = 1;
    private static int read;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final SharedPreferences serializer;
    public final isAdapterPositionOnScreen write;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~((~i3) | i7 | i6);
        int i9 = ~i6;
        int i10 = (~(i7 | i3)) | (~(i7 | i9)) | (~(i9 | i3));
        int i11 = (~(i9 | i)) | i3;
        int i12 = i + i3 + i5 + ((-946781377) * i2) + ((-59450693) * i4);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i) - 346488832) + (357422218 * i3) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i5) + ((-1205993472) * i2) + ((-1651113984) * i4) + ((-884408320) * i13);
        int i15 = ((i * 358501064) - 1042343473) + (i3 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i5 * 358500791) + (i2 * (-249165559)) + (i4 * 1905372845) + (i13 * 573505536);
        return i14 + ((i15 * i15) * (-553189376)) != 1 ? write(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    public isMainThreadroom_runtime(createVerticalAnimation createverticalanimation, String str, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.serializer = (SharedPreferences) createverticalanimation.invoke();
        this.write = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(2, this));
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 23;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        int i4 = MediaSessionCompatQueueItem + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        int i4 = read + 61;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        performClear performclear = (performClear) this.write.MediaSessionCompatResultReceiverWrapper();
        int i4 = read + 31;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return performclear;
        }
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        isMainThreadroom_runtime ismainthreadroom_runtime = (isMainThreadroom_runtime) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        long j = ismainthreadroom_runtime.serializer.getLong(str, jLongValue);
        int i4 = MediaSessionCompatQueueItem + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Long.valueOf(j);
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        isMainThreadroom_runtime ismainthreadroom_runtime = (isMainThreadroom_runtime) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            ismainthreadroom_runtime.serializer.getFloat(str, fFloatValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        str.getClass();
        float f = ismainthreadroom_runtime.serializer.getFloat(str, fFloatValue);
        int i3 = MediaSessionCompatQueueItem + 45;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return Float.valueOf(f);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            return this.serializer.contains(str);
        }
        str.getClass();
        int i3 = 22 / 0;
        return this.serializer.contains(str);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        Map<String, ?> all;
        int i = 2 % 2;
        int i2 = read + 67;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            all = this.serializer.getAll();
            all.getClass();
            int i3 = 81 / 0;
        } else {
            all = this.serializer.getAll();
            all.getClass();
        }
        int i4 = read + 7;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return all;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        boolean z2 = this.serializer.getBoolean(str, z);
        int i4 = MediaSessionCompatQueueItem + 77;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z2;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 57;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str.getClass();
            return this.serializer.getInt(str, i);
        }
        str.getClass();
        int i4 = this.serializer.getInt(str, i);
        int i5 = 18 / 0;
        return i4;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            return this.serializer.getString(str, str2);
        }
        str.getClass();
        String string = this.serializer.getString(str, str2);
        int i3 = 60 / 0;
        return string;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        int i = 2 % 2;
        int i2 = read + 103;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            return this.serializer.getStringSet(str, set);
        }
        str.getClass();
        Set<String> stringSet = this.serializer.getStringSet(str, set);
        int i3 = 9 / 0;
        return stringSet;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object[] objArr = {this, str, Long.valueOf(j)};
        int i = WifiExtraInfo.read();
        return ((Long) write(1552889562, WifiExtraInfo.read(), -1552889561, WifiExtraInfo.read(), WifiExtraInfo.read(), objArr, i)).longValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object[] objArr = {this, str, Float.valueOf(f)};
        int i = WifiExtraInfo.read();
        return ((Float) write(1235675908, WifiExtraInfo.read(), -1235675908, WifiExtraInfo.read(), WifiExtraInfo.read(), objArr, i)).floatValue();
    }
}
