package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final char mask;

    public final char getMask() {
        return this.mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasswordVisualTransformation) && this.mask == ((PasswordVisualTransformation) obj).mask;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        return new TransformedText(new AnnotatedString(setCarryoverInAppMessage.RemoteActionCompatParcelizer(annotatedString.getText().length(), String.valueOf(this.mask)), null, 2, null), OffsetMapping.Companion.getIdentity());
    }

    public /* synthetic */ PasswordVisualTransformation(char c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (char) 8226 : c);
    }

    public PasswordVisualTransformation(char c) {
        this.mask = c;
    }

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }
}
