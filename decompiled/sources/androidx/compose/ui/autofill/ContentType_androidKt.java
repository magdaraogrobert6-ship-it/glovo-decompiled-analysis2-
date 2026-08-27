package androidx.compose.ui.autofill;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class ContentType_androidKt {
    public static final ContentType ContentType(String str) {
        return new AndroidContentType(RangesKt.write((Object) str));
    }

    public static final String[] getContentHints(ContentType contentType) {
        contentType.getClass();
        return (String[]) ((AndroidContentType) contentType).getAndroidAutofillHints().toArray(new String[0]);
    }
}
