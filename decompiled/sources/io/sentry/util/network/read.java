package io.sentry.util.network;

/* JADX INFO: loaded from: classes4.dex */
public enum read {
    JSON_TRUNCATED("JSON_TRUNCATED"),
    TEXT_TRUNCATED("TEXT_TRUNCATED"),
    INVALID_JSON("INVALID_JSON"),
    BODY_PARSE_ERROR("BODY_PARSE_ERROR");

    private final String value;

    public String getValue() {
        return this.value;
    }

    read(String str) {
        this.value = str;
    }
}
