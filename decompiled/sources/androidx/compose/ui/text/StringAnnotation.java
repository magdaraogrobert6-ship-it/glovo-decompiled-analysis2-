package androidx.compose.ui.text;

import bo.app.m1$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class StringAnnotation implements AnnotatedString.Annotation {
    private final String value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m3024constructorimpl(String str) {
        return str;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3026equalsimpl0(String str, String str2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, str2}, iWrite3)).booleanValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3027hashCodeimpl(String str) {
        return str.hashCode();
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3029unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StringAnnotation m3023boximpl(String str) {
        return new StringAnnotation(str);
    }

    public boolean equals(Object obj) {
        return m3025equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3027hashCodeimpl(this.value);
    }

    public String toString() {
        return m3028toStringimpl(this.value);
    }

    private /* synthetic */ StringAnnotation(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3028toStringimpl(String str) {
        return m1$$ExternalSyntheticOutline0.m(')', "StringAnnotation(value=", str);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3025equalsimpl(String str, Object obj) {
        if (!(obj instanceof StringAnnotation)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ((StringAnnotation) obj).m3029unboximpl()}, getCieXyz.write())).booleanValue();
    }
}
