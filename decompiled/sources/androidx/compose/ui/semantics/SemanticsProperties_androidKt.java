package androidx.compose.ui.semantics;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.registerInAppMessageManagerlambda2;

/* JADX INFO: loaded from: classes4.dex */
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ registerInAppMessageManagerlambda2[] $$delegatedProperties = {new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "accessibilityClassName", "getAccessibilityClassName(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)};

    public static final String getAccessibilityClassName(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final boolean getTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]).booleanValue();
    }

    public static final void setAccessibilityClassName(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], str);
    }

    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public static final <T> SemanticsPropertyKey<T> SemanticsPropertyKey(String str, String str2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return new SemanticsPropertyKey<>(str, false, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, str2);
    }

    public static /* synthetic */ SemanticsPropertyKey SemanticsPropertyKey$default(String str, String str2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties_androidKt.SemanticsPropertyKey.1
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    return obj2;
                }
            };
        }
        return SemanticsPropertyKey(str, str2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    static {
        SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
        semanticsPropertiesAndroid.getTestTagsAsResourceId();
        semanticsPropertiesAndroid.getAccessibilityClassName();
    }
}
