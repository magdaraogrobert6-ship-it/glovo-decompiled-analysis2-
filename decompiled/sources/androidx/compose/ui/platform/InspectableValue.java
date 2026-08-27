package androidx.compose.ui.platform;

import o.requestDisplayInAppMessagelambda8;
import o.resumeWebviewIfNecessarylambda0;

/* JADX INFO: loaded from: classes.dex */
public interface InspectableValue {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static resumeWebviewIfNecessarylambda0 getInspectableElements(InspectableValue inspectableValue) {
            return InspectableValue.super.getInspectableElements();
        }

        @Deprecated
        public static String getNameFallback(InspectableValue inspectableValue) {
            return InspectableValue.super.getNameFallback();
        }

        @Deprecated
        public static Object getValueOverride(InspectableValue inspectableValue) {
            return InspectableValue.super.getValueOverride();
        }
    }

    default resumeWebviewIfNecessarylambda0 getInspectableElements() {
        return requestDisplayInAppMessagelambda8.IconCompatParcelizer;
    }

    default String getNameFallback() {
        return null;
    }

    default Object getValueOverride() {
        return null;
    }
}
