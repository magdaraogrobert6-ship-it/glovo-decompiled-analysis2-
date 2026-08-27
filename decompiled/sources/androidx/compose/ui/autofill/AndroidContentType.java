package androidx.compose.ui.autofill;

import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
final class AndroidContentType implements ContentType {
    private final Set<String> androidAutofillHints;

    public final Set<String> getAndroidAutofillHints() {
        return this.androidAutofillHints;
    }

    public AndroidContentType(Set<String> set) {
        this.androidAutofillHints = set;
    }

    @Override // androidx.compose.ui.autofill.ContentType
    public ContentType plus(ContentType contentType) {
        contentType.getClass();
        return new AndroidContentType(RangesKt.read(this.androidAutofillHints, ((AndroidContentType) contentType).androidAutofillHints));
    }
}
