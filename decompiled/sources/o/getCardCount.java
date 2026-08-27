package o;

import com.sentiance.protobuf.WireFormat$FieldType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getCardCount {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[WireFormat$FieldType.values().length];
        read = iArr;
        try {
            iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[WireFormat$FieldType.FLOAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[WireFormat$FieldType.INT64.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[WireFormat$FieldType.UINT64.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            read[WireFormat$FieldType.INT32.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            read[WireFormat$FieldType.FIXED64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            read[WireFormat$FieldType.FIXED32.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            read[WireFormat$FieldType.BOOL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            read[WireFormat$FieldType.BYTES.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            read[WireFormat$FieldType.UINT32.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            read[WireFormat$FieldType.SFIXED32.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            read[WireFormat$FieldType.SFIXED64.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            read[WireFormat$FieldType.SINT32.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            read[WireFormat$FieldType.SINT64.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            read[WireFormat$FieldType.STRING.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            read[WireFormat$FieldType.GROUP.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            read[WireFormat$FieldType.MESSAGE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            read[WireFormat$FieldType.ENUM.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
    }
}
