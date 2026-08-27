package androidx.compose.ui.semantics;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class InputTextSuggestionState {
    public static final int $stable = 0;
    private final boolean isCommittedByInputMethodEditor;

    public final boolean isCommittedByInputMethodEditor() {
        return this.isCommittedByInputMethodEditor;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCommittedByInputMethodEditor) * 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTextSuggestionState) && this.isCommittedByInputMethodEditor == ((InputTextSuggestionState) obj).isCommittedByInputMethodEditor;
    }

    public String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.isCommittedByInputMethodEditor;
    }

    public /* synthetic */ InputTextSuggestionState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public InputTextSuggestionState(boolean z) {
        this.isCommittedByInputMethodEditor = z;
    }

    public InputTextSuggestionState() {
        this(false, 1, null);
    }
}
