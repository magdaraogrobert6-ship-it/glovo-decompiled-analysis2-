package o;

/* JADX INFO: loaded from: classes2.dex */
public enum onDown {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(getClipMetadata.serializer),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    onDown(Object obj) {
        this.defaultDefault = obj;
    }
}
