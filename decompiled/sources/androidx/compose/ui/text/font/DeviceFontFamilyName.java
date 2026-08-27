package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import bo.app.m1$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class DeviceFontFamilyName {
    private final String name;

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3155equalsimpl0(String str, String str2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, str2}, iWrite3)).booleanValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3156hashCodeimpl(String str) {
        return str.hashCode();
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3158unboximpl() {
        return this.name;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m3152boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    public boolean equals(Object obj) {
        return m3154equalsimpl(this.name, obj);
    }

    public int hashCode() {
        return m3156hashCodeimpl(this.name);
    }

    public String toString() {
        return m3157toStringimpl(this.name);
    }

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3157toStringimpl(String str) {
        return m1$$ExternalSyntheticOutline0.m(')', "DeviceFontFamilyName(name=", str);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3154equalsimpl(String str, Object obj) {
        if (!(obj instanceof DeviceFontFamilyName)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ((DeviceFontFamilyName) obj).m3158unboximpl()}, getCieXyz.write())).booleanValue();
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m3153constructorimpl(String str) {
        if (str.length() <= 0) {
            InlineClassHelperKt.throwIllegalArgumentException("name may not be empty");
        }
        return str;
    }
}
