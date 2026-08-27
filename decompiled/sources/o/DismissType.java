package o;

import com.sentiance.protobuf.WireFormat$FieldType;
import com.sentiance.protobuf.WireFormat$JavaType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class DismissType {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[WireFormat$FieldType.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.FLOAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.INT64.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.UINT64.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.INT32.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.FIXED64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.FIXED32.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.BOOL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.GROUP.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.MESSAGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.STRING.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.BYTES.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.UINT32.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.SFIXED32.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.SFIXED64.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.SINT32.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.SINT64.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            IconCompatParcelizer[WireFormat$FieldType.ENUM.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        int[] iArr2 = new int[WireFormat$JavaType.values().length];
        write = iArr2;
        try {
            iArr2[WireFormat$JavaType.INT.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            write[WireFormat$JavaType.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            write[WireFormat$JavaType.FLOAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            write[WireFormat$JavaType.DOUBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            write[WireFormat$JavaType.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            write[WireFormat$JavaType.STRING.ordinal()] = 6;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            write[WireFormat$JavaType.BYTE_STRING.ordinal()] = 7;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            write[WireFormat$JavaType.ENUM.ordinal()] = 8;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            write[WireFormat$JavaType.MESSAGE.ordinal()] = 9;
        } catch (NoSuchFieldError unused27) {
        }
    }
}
