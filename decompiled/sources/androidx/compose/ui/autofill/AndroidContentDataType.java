package androidx.compose.ui.autofill;

import bo.app.m1$$ExternalSyntheticOutline0;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
final class AndroidContentDataType implements ContentDataType {
    private final int androidAutofillType;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m214constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m216equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m217hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m219unboximpl() {
        return this.androidAutofillType;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidContentDataType m213boximpl(int i) {
        return new AndroidContentDataType(i);
    }

    public boolean equals(Object obj) {
        return m215equalsimpl(this.androidAutofillType, obj);
    }

    public int hashCode() {
        return m217hashCodeimpl(this.androidAutofillType);
    }

    public String toString() {
        return m218toStringimpl(this.androidAutofillType);
    }

    private /* synthetic */ AndroidContentDataType(int i) {
        this.androidAutofillType = i;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m218toStringimpl(int i) {
        return m1$$ExternalSyntheticOutline0.m("AndroidContentDataType(androidAutofillType=", i, ')');
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m215equalsimpl(int i, Object obj) {
        return (obj instanceof AndroidContentDataType) && i == ((AndroidContentDataType) obj).m219unboximpl();
    }
}
