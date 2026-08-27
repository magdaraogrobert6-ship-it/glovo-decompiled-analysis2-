package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import o.seekAnimationsanimation_core;

/* JADX INFO: loaded from: classes.dex */
public interface VisualTransformation {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final VisualTransformation None = new seekAnimationsanimation_core(20);

        private Companion() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public final VisualTransformation getNone() {
            return None;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText None$lambda$0(AnnotatedString annotatedString) {
            return new TransformedText(annotatedString, OffsetMapping.Companion.getIdentity());
        }
    }

    TransformedText filter(AnnotatedString annotatedString);
}
