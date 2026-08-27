package bo.app;

import com.mapbox.bindgen.RecordUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import o.decode;
import o.getExposureHandlerfwf_client_release;
import o.getSerializerfwf_client_release;
import o.setSemanticsInvalidatedui;
import o.syncClientfwf_client_release;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ff$$ExternalSyntheticOutline0 {
    public static String m(boolean z, StringBuilder sb, String str) {
        sb.append(RecordUtils.fieldToString(Boolean.valueOf(z)));
        sb.append(str);
        return sb.toString();
    }

    public static int m(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static ClassCastException m(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String m(double d, String str, StringBuilder sb) {
        sb.append(d);
        sb.append(str);
        return sb.toString();
    }

    public static String m(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(StringBuilder sb, double d, char c) {
        sb.append(d);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String m(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static int m(int i, int i2, int i3) {
        return setSemanticsInvalidatedui.serializer(i) + i2 + i3;
    }

    public static StringBuilder m(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void m(String str, String str2, decode decodeVar, String str3) {
        Map mapSingletonMap = Collections.singletonMap(str, str2);
        mapSingletonMap.getClass();
        decodeVar.logEvent(str3, mapSingletonMap);
    }

    public static void m(getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release, syncClientfwf_client_release syncclientfwf_client_release) {
        syncclientfwf_client_release.read(new getSerializerfwf_client_release(getexposurehandlerfwf_client_release));
    }
}
