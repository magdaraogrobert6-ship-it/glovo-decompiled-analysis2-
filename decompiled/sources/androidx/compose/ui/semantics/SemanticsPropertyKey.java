package androidx.compose.ui.semantics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.registerInAppMessageManagerlambda2;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private String accessibilityExtraKey;
    private boolean isImportantForAccessibility;
    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 mergePolicy;
    private final String name;

    public final String getAccessibilityExtraKey$ui() {
        return this.accessibilityExtraKey;
    }

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getMergePolicy$ui() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue(SemanticsPropertyReceiver semanticsPropertyReceiver, registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2) {
        return (T) SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public final boolean isImportantForAccessibility$ui() {
        return this.isImportantForAccessibility;
    }

    public final void setAccessibilityExtraKey$ui(String str) {
        this.accessibilityExtraKey = str;
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, T t) {
        semanticsPropertyReceiver.set(this, t);
    }

    public final T merge(T t, T t2) {
        return (T) this.mergePolicy.invoke(t, t2);
    }

    public /* synthetic */ SemanticsPropertyKey(String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final T invoke(T t, T t2) {
                return t == null ? t2 : t;
            }
        } : r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public SemanticsPropertyKey(String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.name = str;
        this.mergePolicy = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, boolean z) {
        this(str, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.isImportantForAccessibility = z;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (i & 8) != 0 ? null : str2);
    }

    public SemanticsPropertyKey(String str, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, String str2) {
        this(str, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        this.isImportantForAccessibility = z;
        this.accessibilityExtraKey = str2;
    }
}
