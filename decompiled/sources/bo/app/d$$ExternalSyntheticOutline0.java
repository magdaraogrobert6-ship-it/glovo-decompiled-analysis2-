package bo.app;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import java.util.HashMap;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import o.getPostalCode;
import o.show;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d$$ExternalSyntheticOutline0 {
    public static StringBuilder m(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static int m(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int m(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static long m(Placeable.PlacementScope placementScope, Placeable placeable, Placeable placeable2, long j) {
        placementScope.handleMotionFrameOfReferencePlacement(placeable);
        return IntOffset.m3805plusqkQi6aY(j, placeable2.apparentToRealOffset);
    }

    public static Modifier m(float f, boolean z, Modifier.Companion companion) {
        return companion.then(new show(f, z));
    }

    public static String m() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public static String m(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String m(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String m(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    public static String m(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder m(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static float m(float f, float f2, float f3, float f4) {
        Dp.m3673constructorimpl(f);
        Dp.m3673constructorimpl(f2);
        Dp.m3673constructorimpl(f3);
        return Dp.m3673constructorimpl(f4);
    }

    public static StringBuilder m(String str, String str2, long j, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }

    public static NoWhenBranchMatchedException m(getPostalCode getpostalcode, int i, boolean z) {
        getpostalcode.serializer(i);
        getpostalcode.IconCompatParcelizer(z);
        return new NoWhenBranchMatchedException();
    }

    public static void m(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void m(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }
}
