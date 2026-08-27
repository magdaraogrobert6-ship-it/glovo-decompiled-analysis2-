package androidx.compose.ui.autofill;

import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import o.onRemeasuredozmzZPI;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidAutofillManager_androidKt {
    private static final String logTag = "ComposeAutofillManager";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutofillable(SemanticsConfiguration semanticsConfiguration) {
        onRemeasuredozmzZPI props$ui = semanticsConfiguration.getProps$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        return props$ui.serializer(semanticsActions.getOnAutofillText()) || semanticsConfiguration.getProps$ui().serializer(semanticsActions.getOnFillData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutoCommit(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui().serializer(SemanticsProperties.INSTANCE.getContentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutofill(SemanticsConfiguration semanticsConfiguration) {
        onRemeasuredozmzZPI props$ui = semanticsConfiguration.getProps$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (props$ui.serializer(semanticsActions.getOnAutofillText()) || semanticsConfiguration.getProps$ui().serializer(semanticsActions.getOnFillData())) {
            return true;
        }
        onRemeasuredozmzZPI props$ui2 = semanticsConfiguration.getProps$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return props$ui2.serializer(semanticsProperties.getContentType()) || semanticsConfiguration.getProps$ui().serializer(semanticsProperties.getContentDataType());
    }
}
