package com.qualtrics.digital.utils;

import androidx.sqlite.SQLite;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes5.dex */
public final class TranslationUtils {
    private static final String LANG_ENABLED_KEY = "A";
    public static final Companion Companion = new Companion(null);
    private static final Map<String, List<String>> TARGETING_LANGUAGE_CODES_MAP = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("ZH-S", SQLite.read("ZH-CN", "ZH-HANS")), new onViewAttachedToWindowlambda0("ZH-T", SQLite.read("ZH-TW", "ZH-HANT")));
    private static final Map<String, String> LOCAL_LANGUAGE_CODES_MAP = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("ES", "ES-419"), new onViewAttachedToWindowlambda0("ZH-S", "ZH-HANS"), new onViewAttachedToWindowlambda0("ZH-T", "ZH-HANT"), new onViewAttachedToWindowlambda0("ZH-CN", "ZH-HANS"), new onViewAttachedToWindowlambda0("ZH-TW", "ZH-HANT"));

    private final String mapToSupportedLangKey(String str) {
        return getValueWithKeyOrDefault(LOCAL_LANGUAGE_CODES_MAP, str, str);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final String getTranslationFromMapOrDefault(Map<String, String> map, String str, String str2) {
        map.getClass();
        return getValueWithKeyOrDefault(map, mapToSupportedLangKey(str), str2);
    }

    public final Map<String, String> getTranslationsInSupportedLang(Map<String, ? extends Map<String, String>> map, String str) {
        map.getClass();
        List<String> list = TARGETING_LANGUAGE_CODES_MAP.get(str);
        if (list == null) {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            list = (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{str}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map<String, String> map2 = map.get((String) it.next());
            if (isLanguageCodePresentAndEnabled(map2)) {
                return map2;
            }
        }
        return null;
    }

    public final boolean isLanguageCodePresentAndEnabled(Map<String, String> map) {
        String str;
        Boolean boolWrite;
        if (map == null || (str = map.get(LANG_ENABLED_KEY)) == null || (boolWrite = hideCurrentlyDisplayingInAppMessage.write(str)) == null) {
            return false;
        }
        return boolWrite.booleanValue();
    }

    private final String getValueWithKeyOrDefault(Map<String, String> map, String str, String str2) {
        return map.containsKey(str) ? map.get(str) : str2;
    }
}
