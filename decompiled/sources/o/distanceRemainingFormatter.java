package o;

import android.content.SharedPreferences;
import com.mapbox.navigator.RoutesDataNative;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class distanceRemainingFormatter implements SharedPreferences {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final SharedPreferences IconCompatParcelizer;
    public final ColorFilter read;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i4);
        int i9 = ~i5;
        int i10 = ~i4;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i3 | i4)) | (~(i7 | i9 | i10));
        int i13 = i5 + i4 + i6 + ((-1136091917) * i2) + (376669458 * i);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i5) + 1718550528 + ((-1748215485) * i4) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i6) + ((-2044854272) * i2) + (41156608 * i) + (1721171968 * i14);
        int i16 = ((i5 * (-924404593)) - 1636593565) + (i4 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i6 * (-924404175)) + (i2 * (-2083730301)) + (i * 182666354) + (i14 * (-51970048));
        return i15 + ((i16 * i16) * (-653721600)) != 1 ? write(objArr) : read(objArr);
    }

    public distanceRemainingFormatter(SharedPreferences sharedPreferences, ColorFilter colorFilter) {
        this.IconCompatParcelizer = sharedPreferences;
        this.read = colorFilter;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        distanceRemainingFormatter distanceremainingformatter = (distanceRemainingFormatter) objArr[0];
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            distanceremainingformatter.read.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            obj.hashCode();
            throw null;
        }
        distanceremainingformatter.read.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        int i3 = write + 107;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        int i = 2 % 2;
        setLastUpdate setlastupdate = new setLastUpdate(this);
        int i2 = write + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return setlastupdate;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = 2 % 2;
        int i2 = write + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        int i4 = RemoteActionCompatParcelizer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        int i = 2 % 2;
        int i2 = write + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            str.getClass();
            throw null;
        }
        str.getClass();
        String str3 = (String) RemoteActionCompatParcelizer(str, str2, JsonEncodingException.IconCompatParcelizer, Braze.write);
        int i3 = write + 41;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return str3;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        int i = 2 % 2;
        int i2 = write + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            return (Set) RemoteActionCompatParcelizer(str, set, r8lambda0dEmXvKMtdJKKTV5R0Yx3HGc0w.IconCompatParcelizer, r8lambdaWeVcFtwQQOcydNhy2H_OeTkpIs.IconCompatParcelizer);
        }
        str.getClass();
        Set set2 = (Set) RemoteActionCompatParcelizer(str, set, r8lambda0dEmXvKMtdJKKTV5R0Yx3HGc0w.IconCompatParcelizer, r8lambdaWeVcFtwQQOcydNhy2H_OeTkpIs.IconCompatParcelizer);
        int i3 = 19 / 0;
        return set2;
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Map<String, ?> all = this.IconCompatParcelizer.getAll();
        all.getClass();
        LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(all, this.read.getAll());
        int i4 = write + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return linkedHashMapRemoteActionCompatParcelizer;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        distanceRemainingFormatter distanceremainingformatter = (distanceRemainingFormatter) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            ((Boolean) distanceremainingformatter.RemoteActionCompatParcelizer(str, Boolean.valueOf(zBooleanValue), logRiderSafetyPermissionDenied.write, startOrResume.read)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        str.getClass();
        boolean zBooleanValue2 = ((Boolean) distanceremainingformatter.RemoteActionCompatParcelizer(str, Boolean.valueOf(zBooleanValue), logRiderSafetyPermissionDenied.write, startOrResume.read)).booleanValue();
        int i3 = RemoteActionCompatParcelizer + 67;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return Boolean.valueOf(zBooleanValue2);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        int i = 2 % 2;
        int i2 = write + 63;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        float fFloatValue = ((Number) RemoteActionCompatParcelizer(str, Float.valueOf(f), percentRouteTraveledFormatter.IconCompatParcelizer, logRiderSafetyPermissionGranted.serializer)).floatValue();
        int i4 = write + 73;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return fFloatValue;
        }
        throw null;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        int i2 = 2 % 2;
        int i3 = write + 63;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str.getClass();
            ((Number) RemoteActionCompatParcelizer(str, Integer.valueOf(i), JsonReader.read, timeRemainingFormatter.read)).intValue();
            throw null;
        }
        str.getClass();
        int iIntValue = ((Number) RemoteActionCompatParcelizer(str, Integer.valueOf(i), JsonReader.read, timeRemainingFormatter.read)).intValue();
        int i4 = write + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return iIntValue;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        int i = 2 % 2;
        int i2 = write + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        long jLongValue = ((Number) RemoteActionCompatParcelizer(str, Long.valueOf(j), JsonUtf8Reader.RemoteActionCompatParcelizer, JsonDataException.RemoteActionCompatParcelizer)).longValue();
        int i4 = RemoteActionCompatParcelizer + 17;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return jLongValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r3.IconCompatParcelizer.contains(r4) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r3.IconCompatParcelizer.contains(r4) != false) goto L12;
     */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.distanceRemainingFormatter.write
            int r1 = r1 + 125
            int r2 = r1 % 128
            o.distanceRemainingFormatter.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r4.getClass()
            o.ColorFilter r1 = r3.read
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L18
            goto L38
        L18:
            int r1 = o.distanceRemainingFormatter.write
            int r1 = r1 + 7
            int r2 = r1 % 128
            o.distanceRemainingFormatter.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L30
            android.content.SharedPreferences r1 = r3.IconCompatParcelizer
            boolean r4 = r1.contains(r4)
            r1 = 13
            int r1 = r1 / r2
            if (r4 == 0) goto L4a
            goto L38
        L30:
            android.content.SharedPreferences r1 = r3.IconCompatParcelizer
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L4a
        L38:
            int r4 = o.distanceRemainingFormatter.RemoteActionCompatParcelizer
            int r4 = r4 + 83
            int r1 = r4 % 128
            o.distanceRemainingFormatter.write = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L45
            r4 = 1
            return r4
        L45:
            r4 = 0
            r4.hashCode()
            throw r4
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.distanceRemainingFormatter.contains(java.lang.String):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object RemoteActionCompatParcelizer(String str, Object obj, FunctionReferenceImpl functionReferenceImpl, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        SharedPreferences.Editor editorRemove;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read.contains(str);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ColorFilter colorFilter = this.read;
        boolean zContains = colorFilter.contains(str);
        SharedPreferences sharedPreferences = this.IconCompatParcelizer;
        if (zContains) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null && (editorRemove = editorEdit.remove(str)) != null) {
                editorRemove.apply();
            }
            return ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) functionReferenceImpl).invoke(colorFilter, str, obj);
        }
        if (sharedPreferences.contains(str)) {
            Object objInvoke = ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) functionReferenceImpl).invoke(sharedPreferences, str, obj);
            ((SharedPreferences.Editor) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(colorFilter.edit(), str, objInvoke)).apply();
            sharedPreferences.edit().remove(str).apply();
            return objInvoke;
        }
        int i3 = write + 37;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return obj;
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = RoutesDataNative.RoutesDataPeerCleaner.read();
        int i2 = RoutesDataNative.RoutesDataPeerCleaner.read();
        int i3 = RoutesDataNative.RoutesDataPeerCleaner.read();
        write(RoutesDataNative.RoutesDataPeerCleaner.read(), i3, i, 1950341987, new Object[]{this, onSharedPreferenceChangeListener}, -1950341986, i2);
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object[] objArr = {this, str, Boolean.valueOf(z)};
        int i = RoutesDataNative.RoutesDataPeerCleaner.read();
        int i2 = RoutesDataNative.RoutesDataPeerCleaner.read();
        return ((Boolean) write(RoutesDataNative.RoutesDataPeerCleaner.read(), RoutesDataNative.RoutesDataPeerCleaner.read(), i, 694667832, objArr, -694667832, i2)).booleanValue();
    }
}
