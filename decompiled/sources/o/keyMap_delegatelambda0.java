package o;

import com.sentiance.protobuf.WireFormat$FieldType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class keyMap_delegatelambda0 {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[WireFormat$FieldType.values().length];
        write = iArr;
        try {
            iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[WireFormat$FieldType.FLOAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[WireFormat$FieldType.INT64.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[WireFormat$FieldType.UINT64.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            write[WireFormat$FieldType.INT32.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            write[WireFormat$FieldType.FIXED64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            write[WireFormat$FieldType.FIXED32.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            write[WireFormat$FieldType.BOOL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            write[WireFormat$FieldType.UINT32.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            write[WireFormat$FieldType.SFIXED32.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            write[WireFormat$FieldType.SFIXED64.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            write[WireFormat$FieldType.SINT32.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            write[WireFormat$FieldType.SINT64.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            write[WireFormat$FieldType.ENUM.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            write[WireFormat$FieldType.BYTES.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            write[WireFormat$FieldType.STRING.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            write[WireFormat$FieldType.GROUP.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            write[WireFormat$FieldType.MESSAGE.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
    }
}
