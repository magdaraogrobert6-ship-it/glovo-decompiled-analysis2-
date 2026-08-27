package o;

import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class CompositionLocalsKtLocalClipboardManager1 {
    private static final /* synthetic */ CompositionLocalsKtLocalClipboardManager1[] $VALUES;
    public static final CompositionLocalsKtLocalClipboardManager1 BOOL;
    public static final CompositionLocalsKtLocalClipboardManager1 BOOL_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 BOOL_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 BYTES;
    public static final CompositionLocalsKtLocalClipboardManager1 BYTES_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 DOUBLE;
    public static final CompositionLocalsKtLocalClipboardManager1 DOUBLE_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final CompositionLocalsKtLocalClipboardManager1 ENUM;
    public static final CompositionLocalsKtLocalClipboardManager1 ENUM_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 ENUM_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 FIXED32;
    public static final CompositionLocalsKtLocalClipboardManager1 FIXED32_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 FIXED32_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 FIXED64;
    public static final CompositionLocalsKtLocalClipboardManager1 FIXED64_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 FIXED64_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 FLOAT;
    public static final CompositionLocalsKtLocalClipboardManager1 FLOAT_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 FLOAT_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 GROUP;
    public static final CompositionLocalsKtLocalClipboardManager1 GROUP_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 INT32;
    public static final CompositionLocalsKtLocalClipboardManager1 INT32_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 INT32_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 INT64;
    public static final CompositionLocalsKtLocalClipboardManager1 INT64_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 INT64_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 MAP;
    public static final CompositionLocalsKtLocalClipboardManager1 MESSAGE;
    public static final CompositionLocalsKtLocalClipboardManager1 MESSAGE_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 SFIXED32;
    public static final CompositionLocalsKtLocalClipboardManager1 SFIXED32_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 SFIXED32_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 SFIXED64;
    public static final CompositionLocalsKtLocalClipboardManager1 SFIXED64_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 SFIXED64_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 SINT32;
    public static final CompositionLocalsKtLocalClipboardManager1 SINT32_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 SINT32_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 SINT64;
    public static final CompositionLocalsKtLocalClipboardManager1 SINT64_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 SINT64_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 STRING;
    public static final CompositionLocalsKtLocalClipboardManager1 STRING_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 UINT32;
    public static final CompositionLocalsKtLocalClipboardManager1 UINT32_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 UINT32_LIST_PACKED;
    public static final CompositionLocalsKtLocalClipboardManager1 UINT64;
    public static final CompositionLocalsKtLocalClipboardManager1 UINT64_LIST;
    public static final CompositionLocalsKtLocalClipboardManager1 UINT64_LIST_PACKED;
    private static final CompositionLocalsKtLocalClipboardManager1[] VALUES;
    private final RemoteActionCompatParcelizer collection;
    private final Class<?> elementType;
    private final int id;
    private final decodeTextGeometricTransform javaType;
    private final boolean primitiveScalar;

    public decodeTextGeometricTransform getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public enum RemoteActionCompatParcelizer {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        public boolean isList() {
            return this.isList;
        }

        RemoteActionCompatParcelizer(boolean z) {
            this.isList = z;
        }
    }

    static {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.SCALAR;
        decodeTextGeometricTransform decodetextgeometrictransform = decodeTextGeometricTransform.DOUBLE;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager1 = new CompositionLocalsKtLocalClipboardManager1("DOUBLE", 0, 0, remoteActionCompatParcelizer, decodetextgeometrictransform);
        DOUBLE = compositionLocalsKtLocalClipboardManager1;
        decodeTextGeometricTransform decodetextgeometrictransform2 = decodeTextGeometricTransform.FLOAT;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager2 = new CompositionLocalsKtLocalClipboardManager1("FLOAT", 1, 1, remoteActionCompatParcelizer, decodetextgeometrictransform2);
        FLOAT = compositionLocalsKtLocalClipboardManager2;
        decodeTextGeometricTransform decodetextgeometrictransform3 = decodeTextGeometricTransform.LONG;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager3 = new CompositionLocalsKtLocalClipboardManager1("INT64", 2, 2, remoteActionCompatParcelizer, decodetextgeometrictransform3);
        INT64 = compositionLocalsKtLocalClipboardManager3;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager4 = new CompositionLocalsKtLocalClipboardManager1("UINT64", 3, 3, remoteActionCompatParcelizer, decodetextgeometrictransform3);
        UINT64 = compositionLocalsKtLocalClipboardManager4;
        decodeTextGeometricTransform decodetextgeometrictransform4 = decodeTextGeometricTransform.INT;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager5 = new CompositionLocalsKtLocalClipboardManager1("INT32", 4, 4, remoteActionCompatParcelizer, decodetextgeometrictransform4);
        INT32 = compositionLocalsKtLocalClipboardManager5;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager6 = new CompositionLocalsKtLocalClipboardManager1("FIXED64", 5, 5, remoteActionCompatParcelizer, decodetextgeometrictransform3);
        FIXED64 = compositionLocalsKtLocalClipboardManager6;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager7 = new CompositionLocalsKtLocalClipboardManager1("FIXED32", 6, 6, remoteActionCompatParcelizer, decodetextgeometrictransform4);
        FIXED32 = compositionLocalsKtLocalClipboardManager7;
        decodeTextGeometricTransform decodetextgeometrictransform5 = decodeTextGeometricTransform.BOOLEAN;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager8 = new CompositionLocalsKtLocalClipboardManager1("BOOL", 7, 7, remoteActionCompatParcelizer, decodetextgeometrictransform5);
        BOOL = compositionLocalsKtLocalClipboardManager8;
        decodeTextGeometricTransform decodetextgeometrictransform6 = decodeTextGeometricTransform.STRING;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager9 = new CompositionLocalsKtLocalClipboardManager1("STRING", 8, 8, remoteActionCompatParcelizer, decodetextgeometrictransform6);
        STRING = compositionLocalsKtLocalClipboardManager9;
        decodeTextGeometricTransform decodetextgeometrictransform7 = decodeTextGeometricTransform.MESSAGE;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager10 = new CompositionLocalsKtLocalClipboardManager1("MESSAGE", 9, 9, remoteActionCompatParcelizer, decodetextgeometrictransform7);
        MESSAGE = compositionLocalsKtLocalClipboardManager10;
        decodeTextGeometricTransform decodetextgeometrictransform8 = decodeTextGeometricTransform.BYTE_STRING;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager11 = new CompositionLocalsKtLocalClipboardManager1("BYTES", 10, 10, remoteActionCompatParcelizer, decodetextgeometrictransform8);
        BYTES = compositionLocalsKtLocalClipboardManager11;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager12 = new CompositionLocalsKtLocalClipboardManager1("UINT32", 11, 11, remoteActionCompatParcelizer, decodetextgeometrictransform4);
        UINT32 = compositionLocalsKtLocalClipboardManager12;
        decodeTextGeometricTransform decodetextgeometrictransform9 = decodeTextGeometricTransform.ENUM;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager13 = new CompositionLocalsKtLocalClipboardManager1("ENUM", 12, 12, remoteActionCompatParcelizer, decodetextgeometrictransform9);
        ENUM = compositionLocalsKtLocalClipboardManager13;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager14 = new CompositionLocalsKtLocalClipboardManager1("SFIXED32", 13, 13, remoteActionCompatParcelizer, decodetextgeometrictransform4);
        SFIXED32 = compositionLocalsKtLocalClipboardManager14;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager15 = new CompositionLocalsKtLocalClipboardManager1("SFIXED64", 14, 14, remoteActionCompatParcelizer, decodetextgeometrictransform3);
        SFIXED64 = compositionLocalsKtLocalClipboardManager15;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager16 = new CompositionLocalsKtLocalClipboardManager1("SINT32", 15, 15, remoteActionCompatParcelizer, decodetextgeometrictransform4);
        SINT32 = compositionLocalsKtLocalClipboardManager16;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager17 = new CompositionLocalsKtLocalClipboardManager1("SINT64", 16, 16, remoteActionCompatParcelizer, decodetextgeometrictransform3);
        SINT64 = compositionLocalsKtLocalClipboardManager17;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager18 = new CompositionLocalsKtLocalClipboardManager1("GROUP", 17, 17, remoteActionCompatParcelizer, decodetextgeometrictransform7);
        GROUP = compositionLocalsKtLocalClipboardManager18;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = RemoteActionCompatParcelizer.VECTOR;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager19 = new CompositionLocalsKtLocalClipboardManager1("DOUBLE_LIST", 18, 18, remoteActionCompatParcelizer2, decodetextgeometrictransform);
        DOUBLE_LIST = compositionLocalsKtLocalClipboardManager19;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager20 = new CompositionLocalsKtLocalClipboardManager1("FLOAT_LIST", 19, 19, remoteActionCompatParcelizer2, decodetextgeometrictransform2);
        FLOAT_LIST = compositionLocalsKtLocalClipboardManager20;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager21 = new CompositionLocalsKtLocalClipboardManager1("INT64_LIST", 20, 20, remoteActionCompatParcelizer2, decodetextgeometrictransform3);
        INT64_LIST = compositionLocalsKtLocalClipboardManager21;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager22 = new CompositionLocalsKtLocalClipboardManager1("UINT64_LIST", 21, 21, remoteActionCompatParcelizer2, decodetextgeometrictransform3);
        UINT64_LIST = compositionLocalsKtLocalClipboardManager22;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager23 = new CompositionLocalsKtLocalClipboardManager1("INT32_LIST", 22, 22, remoteActionCompatParcelizer2, decodetextgeometrictransform4);
        INT32_LIST = compositionLocalsKtLocalClipboardManager23;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager24 = new CompositionLocalsKtLocalClipboardManager1("FIXED64_LIST", 23, 23, remoteActionCompatParcelizer2, decodetextgeometrictransform3);
        FIXED64_LIST = compositionLocalsKtLocalClipboardManager24;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager25 = new CompositionLocalsKtLocalClipboardManager1("FIXED32_LIST", 24, 24, remoteActionCompatParcelizer2, decodetextgeometrictransform4);
        FIXED32_LIST = compositionLocalsKtLocalClipboardManager25;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager26 = new CompositionLocalsKtLocalClipboardManager1("BOOL_LIST", 25, 25, remoteActionCompatParcelizer2, decodetextgeometrictransform5);
        BOOL_LIST = compositionLocalsKtLocalClipboardManager26;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager27 = new CompositionLocalsKtLocalClipboardManager1("STRING_LIST", 26, 26, remoteActionCompatParcelizer2, decodetextgeometrictransform6);
        STRING_LIST = compositionLocalsKtLocalClipboardManager27;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager28 = new CompositionLocalsKtLocalClipboardManager1("MESSAGE_LIST", 27, 27, remoteActionCompatParcelizer2, decodetextgeometrictransform7);
        MESSAGE_LIST = compositionLocalsKtLocalClipboardManager28;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager29 = new CompositionLocalsKtLocalClipboardManager1("BYTES_LIST", 28, 28, remoteActionCompatParcelizer2, decodetextgeometrictransform8);
        BYTES_LIST = compositionLocalsKtLocalClipboardManager29;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager30 = new CompositionLocalsKtLocalClipboardManager1("UINT32_LIST", 29, 29, remoteActionCompatParcelizer2, decodetextgeometrictransform4);
        UINT32_LIST = compositionLocalsKtLocalClipboardManager30;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager31 = new CompositionLocalsKtLocalClipboardManager1("ENUM_LIST", 30, 30, remoteActionCompatParcelizer2, decodetextgeometrictransform9);
        ENUM_LIST = compositionLocalsKtLocalClipboardManager31;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager32 = new CompositionLocalsKtLocalClipboardManager1("SFIXED32_LIST", 31, 31, remoteActionCompatParcelizer2, decodetextgeometrictransform4);
        SFIXED32_LIST = compositionLocalsKtLocalClipboardManager32;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager33 = new CompositionLocalsKtLocalClipboardManager1("SFIXED64_LIST", 32, 32, remoteActionCompatParcelizer2, decodetextgeometrictransform3);
        SFIXED64_LIST = compositionLocalsKtLocalClipboardManager33;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager34 = new CompositionLocalsKtLocalClipboardManager1("SINT32_LIST", 33, 33, remoteActionCompatParcelizer2, decodetextgeometrictransform4);
        SINT32_LIST = compositionLocalsKtLocalClipboardManager34;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager35 = new CompositionLocalsKtLocalClipboardManager1("SINT64_LIST", 34, 34, remoteActionCompatParcelizer2, decodetextgeometrictransform3);
        SINT64_LIST = compositionLocalsKtLocalClipboardManager35;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = RemoteActionCompatParcelizer.PACKED_VECTOR;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager36 = new CompositionLocalsKtLocalClipboardManager1("DOUBLE_LIST_PACKED", 35, 35, remoteActionCompatParcelizer3, decodetextgeometrictransform);
        DOUBLE_LIST_PACKED = compositionLocalsKtLocalClipboardManager36;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager37 = new CompositionLocalsKtLocalClipboardManager1("FLOAT_LIST_PACKED", 36, 36, remoteActionCompatParcelizer3, decodetextgeometrictransform2);
        FLOAT_LIST_PACKED = compositionLocalsKtLocalClipboardManager37;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager38 = new CompositionLocalsKtLocalClipboardManager1("INT64_LIST_PACKED", 37, 37, remoteActionCompatParcelizer3, decodetextgeometrictransform3);
        INT64_LIST_PACKED = compositionLocalsKtLocalClipboardManager38;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager39 = new CompositionLocalsKtLocalClipboardManager1("UINT64_LIST_PACKED", 38, 38, remoteActionCompatParcelizer3, decodetextgeometrictransform3);
        UINT64_LIST_PACKED = compositionLocalsKtLocalClipboardManager39;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager40 = new CompositionLocalsKtLocalClipboardManager1("INT32_LIST_PACKED", 39, 39, remoteActionCompatParcelizer3, decodetextgeometrictransform4);
        INT32_LIST_PACKED = compositionLocalsKtLocalClipboardManager40;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager41 = new CompositionLocalsKtLocalClipboardManager1("FIXED64_LIST_PACKED", 40, 40, remoteActionCompatParcelizer3, decodetextgeometrictransform3);
        FIXED64_LIST_PACKED = compositionLocalsKtLocalClipboardManager41;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager42 = new CompositionLocalsKtLocalClipboardManager1("FIXED32_LIST_PACKED", 41, 41, remoteActionCompatParcelizer3, decodetextgeometrictransform4);
        FIXED32_LIST_PACKED = compositionLocalsKtLocalClipboardManager42;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager43 = new CompositionLocalsKtLocalClipboardManager1("BOOL_LIST_PACKED", 42, 42, remoteActionCompatParcelizer3, decodetextgeometrictransform5);
        BOOL_LIST_PACKED = compositionLocalsKtLocalClipboardManager43;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager44 = new CompositionLocalsKtLocalClipboardManager1("UINT32_LIST_PACKED", 43, 43, remoteActionCompatParcelizer3, decodetextgeometrictransform4);
        UINT32_LIST_PACKED = compositionLocalsKtLocalClipboardManager44;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager45 = new CompositionLocalsKtLocalClipboardManager1("ENUM_LIST_PACKED", 44, 44, remoteActionCompatParcelizer3, decodetextgeometrictransform9);
        ENUM_LIST_PACKED = compositionLocalsKtLocalClipboardManager45;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager46 = new CompositionLocalsKtLocalClipboardManager1("SFIXED32_LIST_PACKED", 45, 45, remoteActionCompatParcelizer3, decodetextgeometrictransform4);
        SFIXED32_LIST_PACKED = compositionLocalsKtLocalClipboardManager46;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager47 = new CompositionLocalsKtLocalClipboardManager1("SFIXED64_LIST_PACKED", 46, 46, remoteActionCompatParcelizer3, decodetextgeometrictransform3);
        SFIXED64_LIST_PACKED = compositionLocalsKtLocalClipboardManager47;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager48 = new CompositionLocalsKtLocalClipboardManager1("SINT32_LIST_PACKED", 47, 47, remoteActionCompatParcelizer3, decodetextgeometrictransform4);
        SINT32_LIST_PACKED = compositionLocalsKtLocalClipboardManager48;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager49 = new CompositionLocalsKtLocalClipboardManager1("SINT64_LIST_PACKED", 48, 48, remoteActionCompatParcelizer3, decodetextgeometrictransform3);
        SINT64_LIST_PACKED = compositionLocalsKtLocalClipboardManager49;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager50 = new CompositionLocalsKtLocalClipboardManager1("GROUP_LIST", 49, 49, remoteActionCompatParcelizer2, decodetextgeometrictransform7);
        GROUP_LIST = compositionLocalsKtLocalClipboardManager50;
        CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager51 = new CompositionLocalsKtLocalClipboardManager1("MAP", 50, 50, RemoteActionCompatParcelizer.MAP, decodeTextGeometricTransform.VOID);
        MAP = compositionLocalsKtLocalClipboardManager51;
        $VALUES = new CompositionLocalsKtLocalClipboardManager1[]{compositionLocalsKtLocalClipboardManager1, compositionLocalsKtLocalClipboardManager2, compositionLocalsKtLocalClipboardManager3, compositionLocalsKtLocalClipboardManager4, compositionLocalsKtLocalClipboardManager5, compositionLocalsKtLocalClipboardManager6, compositionLocalsKtLocalClipboardManager7, compositionLocalsKtLocalClipboardManager8, compositionLocalsKtLocalClipboardManager9, compositionLocalsKtLocalClipboardManager10, compositionLocalsKtLocalClipboardManager11, compositionLocalsKtLocalClipboardManager12, compositionLocalsKtLocalClipboardManager13, compositionLocalsKtLocalClipboardManager14, compositionLocalsKtLocalClipboardManager15, compositionLocalsKtLocalClipboardManager16, compositionLocalsKtLocalClipboardManager17, compositionLocalsKtLocalClipboardManager18, compositionLocalsKtLocalClipboardManager19, compositionLocalsKtLocalClipboardManager20, compositionLocalsKtLocalClipboardManager21, compositionLocalsKtLocalClipboardManager22, compositionLocalsKtLocalClipboardManager23, compositionLocalsKtLocalClipboardManager24, compositionLocalsKtLocalClipboardManager25, compositionLocalsKtLocalClipboardManager26, compositionLocalsKtLocalClipboardManager27, compositionLocalsKtLocalClipboardManager28, compositionLocalsKtLocalClipboardManager29, compositionLocalsKtLocalClipboardManager30, compositionLocalsKtLocalClipboardManager31, compositionLocalsKtLocalClipboardManager32, compositionLocalsKtLocalClipboardManager33, compositionLocalsKtLocalClipboardManager34, compositionLocalsKtLocalClipboardManager35, compositionLocalsKtLocalClipboardManager36, compositionLocalsKtLocalClipboardManager37, compositionLocalsKtLocalClipboardManager38, compositionLocalsKtLocalClipboardManager39, compositionLocalsKtLocalClipboardManager40, compositionLocalsKtLocalClipboardManager41, compositionLocalsKtLocalClipboardManager42, compositionLocalsKtLocalClipboardManager43, compositionLocalsKtLocalClipboardManager44, compositionLocalsKtLocalClipboardManager45, compositionLocalsKtLocalClipboardManager46, compositionLocalsKtLocalClipboardManager47, compositionLocalsKtLocalClipboardManager48, compositionLocalsKtLocalClipboardManager49, compositionLocalsKtLocalClipboardManager50, compositionLocalsKtLocalClipboardManager51};
        EMPTY_TYPES = new Type[0];
        CompositionLocalsKtLocalClipboardManager1[] compositionLocalsKtLocalClipboardManager1ArrValues = values();
        VALUES = new CompositionLocalsKtLocalClipboardManager1[compositionLocalsKtLocalClipboardManager1ArrValues.length];
        for (CompositionLocalsKtLocalClipboardManager1 compositionLocalsKtLocalClipboardManager52 : compositionLocalsKtLocalClipboardManager1ArrValues) {
            VALUES[compositionLocalsKtLocalClipboardManager52.id] = compositionLocalsKtLocalClipboardManager52;
        }
    }

    public static CompositionLocalsKtLocalClipboardManager1 forId(int i) {
        if (i < 0) {
            return null;
        }
        CompositionLocalsKtLocalClipboardManager1[] compositionLocalsKtLocalClipboardManager1Arr = VALUES;
        if (i >= compositionLocalsKtLocalClipboardManager1Arr.length) {
            return null;
        }
        return compositionLocalsKtLocalClipboardManager1Arr[i];
    }

    public static CompositionLocalsKtLocalClipboardManager1 valueOf(String str) {
        return (CompositionLocalsKtLocalClipboardManager1) Enum.valueOf(CompositionLocalsKtLocalClipboardManager1.class, str);
    }

    public static CompositionLocalsKtLocalClipboardManager1[] values() {
        return (CompositionLocalsKtLocalClipboardManager1[]) $VALUES.clone();
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == RemoteActionCompatParcelizer.MAP;
    }

    public boolean isPacked() {
        return RemoteActionCompatParcelizer.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isScalar() {
        return this.collection == RemoteActionCompatParcelizer.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return RemoteActionCompatParcelizer.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }

    private CompositionLocalsKtLocalClipboardManager1(String str, int i, int i2, RemoteActionCompatParcelizer remoteActionCompatParcelizer, decodeTextGeometricTransform decodetextgeometrictransform) {
        int i3;
        super(str, i);
        this.id = i2;
        this.collection = remoteActionCompatParcelizer;
        this.javaType = decodetextgeometrictransform;
        int i4 = CompositionLocalsKtLocalDensity1.write[remoteActionCompatParcelizer.ordinal()];
        if (i4 == 1 || i4 == 2) {
            this.elementType = decodetextgeometrictransform.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (remoteActionCompatParcelizer != RemoteActionCompatParcelizer.SCALAR || (i3 = CompositionLocalsKtLocalDensity1.serializer[decodetextgeometrictransform.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i = 0;
            if (cls != List.class) {
                Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length != typeParameters.length) {
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Type array mismatch");
                                return null;
                            }
                            int i3 = 0;
                            while (true) {
                                if (i3 < typeParameters.length) {
                                    if (type == typeParameters[i3]) {
                                        actualTypeArguments[i2] = typeArr[i3];
                                        break;
                                    }
                                    i3++;
                                } else {
                                    FieldType$$ExternalSyntheticBUOutline0.IconCompatParcelizer(type, "Unable to find replacement for ");
                                    return null;
                                }
                            }
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i < length) {
                            Class<?> cls2 = interfaces[i];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Unable to identify parameter type for List<T>");
                return null;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }
}
