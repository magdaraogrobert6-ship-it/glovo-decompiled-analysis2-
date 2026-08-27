package io.sentry.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import java.lang.reflect.Field;
import java.util.Map;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.setDefaultNotificationChannelNameandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer {
    public final Field IconCompatParcelizer;
    public final Field read;

    public final String serializer(Modifier modifier) {
        Field field;
        Field field2;
        modifier.getClass();
        String name = modifier.getClass().getName();
        try {
            if ("androidx.compose.ui.platform.TestTagElement".equals(name) && (field2 = this.read) != null) {
                return (String) field2.get(modifier);
            }
            if ("io.sentry.compose.SentryModifier$SentryTagModifierNodeElement".equals(name) && (field = this.IconCompatParcelizer) != null) {
                return (String) field.get(modifier);
            }
            if (!(modifier instanceof SemanticsModifier)) {
                return null;
            }
            for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : ((SemanticsModifier) modifier).getSemanticsConfiguration()) {
                SemanticsPropertyKey<?> key = entry.getKey();
                Object value = entry.getValue();
                String name2 = key.getName();
                if ("SentryTag".equals(name2) || "TestTag".equals(name2)) {
                    if (value instanceof String) {
                        return (String) value;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public serializer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        this.read = setDefaultNotificationChannelNameandroid_sdk_base_release.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, "androidx.compose.ui.platform.TestTagElement");
        this.IconCompatParcelizer = setDefaultNotificationChannelNameandroid_sdk_base_release.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, "io.sentry.compose.SentryModifier$SentryTagModifierNodeElement");
    }
}
