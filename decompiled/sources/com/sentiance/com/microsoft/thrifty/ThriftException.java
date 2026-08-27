package com.sentiance.com.microsoft.thrifty;

/* JADX INFO: loaded from: classes3.dex */
public class ThriftException extends RuntimeException {
    public final Kind kind;

    public enum Kind {
        UNKNOWN(0),
        UNKNOWN_METHOD(1),
        INVALID_MESSAGE_TYPE(2),
        WRONG_METHOD_NAME(3),
        BAD_SEQUENCE_ID(4),
        MISSING_RESULT(5),
        INTERNAL_ERROR(6),
        PROTOCOL_ERROR(7),
        INVALID_TRANSFORM(8),
        INVALID_PROTOCOL(9),
        UNSUPPORTED_CLIENT_TYPE(10);

        final int value;

        Kind(int i) {
            this.value = i;
        }

        public static Kind findByValue(int i) {
            for (Kind kind : values()) {
                if (kind.value == i) {
                    return kind;
                }
            }
            return UNKNOWN;
        }
    }

    public ThriftException(Kind kind, String str) {
        super(str);
        this.kind = kind;
    }
}
