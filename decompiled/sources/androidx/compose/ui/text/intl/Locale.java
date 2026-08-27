package androidx.compose.ui.text.intl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class Locale {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final java.util.Locale platformLocale;

    public final java.util.Locale getPlatformLocale() {
        return this.platformLocale;
    }

    public String toString() {
        return toLanguageTag();
    }

    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    public final String getRegion() {
        return this.platformLocale.getCountry();
    }

    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }
    }

    public Locale(String str) {
        this(Locale_jvmAndAndroidKt.parseLanguageTag(str));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Object[] objArr = {toLanguageTag(), ((Locale) obj).toLanguageTag()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    public Locale(java.util.Locale locale) {
        this.platformLocale = locale;
    }
}
