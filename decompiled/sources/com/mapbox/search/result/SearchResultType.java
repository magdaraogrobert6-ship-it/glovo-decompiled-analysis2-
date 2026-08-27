package com.mapbox.search.result;

import o.getPropsui;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v9 com.mapbox.search.result.SearchResultType, still in use, count: 1, list:
  (r0v9 com.mapbox.search.result.SearchResultType) from 0x007e: SPUT (r0v9 com.mapbox.search.result.SearchResultType) (LINE:126) com.mapbox.search.result.SearchResultType.DEFAULT com.mapbox.search.result.SearchResultType
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class SearchResultType {
    COUNTRY,
    REGION,
    POSTCODE,
    BLOCK,
    DISTRICT,
    PLACE,
    LOCALITY,
    NEIGHBORHOOD,
    STREET,
    ADDRESS,
    POI;

    private static final SearchResultType DEFAULT = new SearchResultType();
    public static final getPropsui Companion = new getPropsui();

    private SearchResultType() {
        super(str, i);
    }

    public static SearchResultType valueOf(String str) {
        return (SearchResultType) Enum.valueOf(SearchResultType.class, str);
    }

    public static SearchResultType[] values() {
        return (SearchResultType[]) $VALUES.clone();
    }

    static {
    }
}
