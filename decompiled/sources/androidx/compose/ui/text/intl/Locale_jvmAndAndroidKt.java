package androidx.compose.ui.text.intl;

import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class Locale_jvmAndAndroidKt {
    @onItemDismisslambda0
    public static /* synthetic */ void PlatformLocale$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Locale parseLanguageTag(String str) {
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{localeForLanguageTag.toLanguageTag(), "und"}, getCieXyz.write())).booleanValue()) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
