package androidx.compose.ui.semantics;

import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class SemanticsPropertiesAndroid {
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        public final Boolean invoke(Boolean bool, boolean z) {
            return bool;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Boolean) obj, ((Boolean) obj2).booleanValue());
        }
    }, null, 8, null);
    private static final SemanticsPropertyKey<String> AccessibilityClassName = new SemanticsPropertyKey<>("AccessibilityClassName", true, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$AccessibilityClassName$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final String invoke(String str, String str2) {
            return str;
        }
    }, null, 8, null);
    public static final int $stable = 8;

    private SemanticsPropertiesAndroid() {
    }

    public final SemanticsPropertyKey<String> getAccessibilityClassName() {
        return AccessibilityClassName;
    }

    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }
}
