package o;

/* JADX INFO: loaded from: classes2.dex */
public enum accessgetValueOverridejd {
    NO_MATCH,
    EMPTY_MATCH,
    LITERAL,
    CHAR_CLASS,
    ANY_CHAR_NOT_NL,
    ANY_CHAR,
    BEGIN_LINE,
    END_LINE,
    BEGIN_TEXT,
    END_TEXT,
    WORD_BOUNDARY,
    NO_WORD_BOUNDARY,
    CAPTURE,
    STAR,
    PLUS,
    QUEST,
    REPEAT,
    CONCAT,
    ALTERNATE,
    LEFT_PAREN,
    VERTICAL_BAR;

    public boolean isPseudo() {
        return ordinal() >= LEFT_PAREN.ordinal();
    }
}
