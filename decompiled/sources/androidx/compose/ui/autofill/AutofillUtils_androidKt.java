package androidx.compose.ui.autofill;

import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public final class AutofillUtils_androidKt {
    public static final int MAX_AUTOFILL_TEXT_LENGTH = 5000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trimToSafeLength(String str) {
        if (str.length() < 5000) {
            return str;
        }
        return (Character.isHighSurrogate(str.charAt(4999)) && Character.isLowSurrogate(str.charAt(5000))) ? hideCurrentlyDisplayingInAppMessage.write(4999, str) : hideCurrentlyDisplayingInAppMessage.write(5000, str);
    }
}
