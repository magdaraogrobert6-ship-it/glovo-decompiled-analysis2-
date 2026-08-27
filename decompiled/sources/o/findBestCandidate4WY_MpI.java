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
/* JADX INFO: loaded from: classes.dex */
public final class findBestCandidate4WY_MpI {
    private static final /* synthetic */ findBestCandidate4WY_MpI[] $VALUES;
    public static final findBestCandidate4WY_MpI BOOL;
    public static final findBestCandidate4WY_MpI BOOL_LIST;
    public static final findBestCandidate4WY_MpI BOOL_LIST_PACKED;
    public static final findBestCandidate4WY_MpI BYTES;
    public static final findBestCandidate4WY_MpI BYTES_LIST;
    public static final findBestCandidate4WY_MpI DOUBLE;
    public static final findBestCandidate4WY_MpI DOUBLE_LIST;
    public static final findBestCandidate4WY_MpI DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final findBestCandidate4WY_MpI ENUM;
    public static final findBestCandidate4WY_MpI ENUM_LIST;
    public static final findBestCandidate4WY_MpI ENUM_LIST_PACKED;
    public static final findBestCandidate4WY_MpI FIXED32;
    public static final findBestCandidate4WY_MpI FIXED32_LIST;
    public static final findBestCandidate4WY_MpI FIXED32_LIST_PACKED;
    public static final findBestCandidate4WY_MpI FIXED64;
    public static final findBestCandidate4WY_MpI FIXED64_LIST;
    public static final findBestCandidate4WY_MpI FIXED64_LIST_PACKED;
    public static final findBestCandidate4WY_MpI FLOAT;
    public static final findBestCandidate4WY_MpI FLOAT_LIST;
    public static final findBestCandidate4WY_MpI FLOAT_LIST_PACKED;
    public static final findBestCandidate4WY_MpI GROUP;
    public static final findBestCandidate4WY_MpI GROUP_LIST;
    public static final findBestCandidate4WY_MpI INT32;
    public static final findBestCandidate4WY_MpI INT32_LIST;
    public static final findBestCandidate4WY_MpI INT32_LIST_PACKED;
    public static final findBestCandidate4WY_MpI INT64;
    public static final findBestCandidate4WY_MpI INT64_LIST;
    public static final findBestCandidate4WY_MpI INT64_LIST_PACKED;
    public static final findBestCandidate4WY_MpI MAP;
    public static final findBestCandidate4WY_MpI MESSAGE;
    public static final findBestCandidate4WY_MpI MESSAGE_LIST;
    public static final findBestCandidate4WY_MpI SFIXED32;
    public static final findBestCandidate4WY_MpI SFIXED32_LIST;
    public static final findBestCandidate4WY_MpI SFIXED32_LIST_PACKED;
    public static final findBestCandidate4WY_MpI SFIXED64;
    public static final findBestCandidate4WY_MpI SFIXED64_LIST;
    public static final findBestCandidate4WY_MpI SFIXED64_LIST_PACKED;
    public static final findBestCandidate4WY_MpI SINT32;
    public static final findBestCandidate4WY_MpI SINT32_LIST;
    public static final findBestCandidate4WY_MpI SINT32_LIST_PACKED;
    public static final findBestCandidate4WY_MpI SINT64;
    public static final findBestCandidate4WY_MpI SINT64_LIST;
    public static final findBestCandidate4WY_MpI SINT64_LIST_PACKED;
    public static final findBestCandidate4WY_MpI STRING;
    public static final findBestCandidate4WY_MpI STRING_LIST;
    public static final findBestCandidate4WY_MpI UINT32;
    public static final findBestCandidate4WY_MpI UINT32_LIST;
    public static final findBestCandidate4WY_MpI UINT32_LIST_PACKED;
    public static final findBestCandidate4WY_MpI UINT64;
    public static final findBestCandidate4WY_MpI UINT64_LIST;
    public static final findBestCandidate4WY_MpI UINT64_LIST_PACKED;
    private static final findBestCandidate4WY_MpI[] VALUES;
    private final read collection;
    private final Class<?> elementType;
    private final int id;
    private final TwoDimensionalFocusSearchKtWhenMappings javaType;
    private final boolean primitiveScalar;

    public TwoDimensionalFocusSearchKtWhenMappings getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public enum read {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        public boolean isList() {
            return this.isList;
        }

        read(boolean z) {
            this.isList = z;
        }
    }

    static {
        read readVar = read.SCALAR;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings = TwoDimensionalFocusSearchKtWhenMappings.DOUBLE;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi = new findBestCandidate4WY_MpI("DOUBLE", 0, 0, readVar, twoDimensionalFocusSearchKtWhenMappings);
        DOUBLE = findbestcandidate4wy_mpi;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings2 = TwoDimensionalFocusSearchKtWhenMappings.FLOAT;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi2 = new findBestCandidate4WY_MpI("FLOAT", 1, 1, readVar, twoDimensionalFocusSearchKtWhenMappings2);
        FLOAT = findbestcandidate4wy_mpi2;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings3 = TwoDimensionalFocusSearchKtWhenMappings.LONG;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi3 = new findBestCandidate4WY_MpI("INT64", 2, 2, readVar, twoDimensionalFocusSearchKtWhenMappings3);
        INT64 = findbestcandidate4wy_mpi3;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi4 = new findBestCandidate4WY_MpI("UINT64", 3, 3, readVar, twoDimensionalFocusSearchKtWhenMappings3);
        UINT64 = findbestcandidate4wy_mpi4;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings4 = TwoDimensionalFocusSearchKtWhenMappings.INT;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi5 = new findBestCandidate4WY_MpI("INT32", 4, 4, readVar, twoDimensionalFocusSearchKtWhenMappings4);
        INT32 = findbestcandidate4wy_mpi5;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi6 = new findBestCandidate4WY_MpI("FIXED64", 5, 5, readVar, twoDimensionalFocusSearchKtWhenMappings3);
        FIXED64 = findbestcandidate4wy_mpi6;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi7 = new findBestCandidate4WY_MpI("FIXED32", 6, 6, readVar, twoDimensionalFocusSearchKtWhenMappings4);
        FIXED32 = findbestcandidate4wy_mpi7;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings5 = TwoDimensionalFocusSearchKtWhenMappings.BOOLEAN;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi8 = new findBestCandidate4WY_MpI("BOOL", 7, 7, readVar, twoDimensionalFocusSearchKtWhenMappings5);
        BOOL = findbestcandidate4wy_mpi8;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings6 = TwoDimensionalFocusSearchKtWhenMappings.STRING;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi9 = new findBestCandidate4WY_MpI("STRING", 8, 8, readVar, twoDimensionalFocusSearchKtWhenMappings6);
        STRING = findbestcandidate4wy_mpi9;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings7 = TwoDimensionalFocusSearchKtWhenMappings.MESSAGE;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi10 = new findBestCandidate4WY_MpI("MESSAGE", 9, 9, readVar, twoDimensionalFocusSearchKtWhenMappings7);
        MESSAGE = findbestcandidate4wy_mpi10;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings8 = TwoDimensionalFocusSearchKtWhenMappings.BYTE_STRING;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi11 = new findBestCandidate4WY_MpI("BYTES", 10, 10, readVar, twoDimensionalFocusSearchKtWhenMappings8);
        BYTES = findbestcandidate4wy_mpi11;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi12 = new findBestCandidate4WY_MpI("UINT32", 11, 11, readVar, twoDimensionalFocusSearchKtWhenMappings4);
        UINT32 = findbestcandidate4wy_mpi12;
        TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings9 = TwoDimensionalFocusSearchKtWhenMappings.ENUM;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi13 = new findBestCandidate4WY_MpI("ENUM", 12, 12, readVar, twoDimensionalFocusSearchKtWhenMappings9);
        ENUM = findbestcandidate4wy_mpi13;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi14 = new findBestCandidate4WY_MpI("SFIXED32", 13, 13, readVar, twoDimensionalFocusSearchKtWhenMappings4);
        SFIXED32 = findbestcandidate4wy_mpi14;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi15 = new findBestCandidate4WY_MpI("SFIXED64", 14, 14, readVar, twoDimensionalFocusSearchKtWhenMappings3);
        SFIXED64 = findbestcandidate4wy_mpi15;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi16 = new findBestCandidate4WY_MpI("SINT32", 15, 15, readVar, twoDimensionalFocusSearchKtWhenMappings4);
        SINT32 = findbestcandidate4wy_mpi16;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi17 = new findBestCandidate4WY_MpI("SINT64", 16, 16, readVar, twoDimensionalFocusSearchKtWhenMappings3);
        SINT64 = findbestcandidate4wy_mpi17;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi18 = new findBestCandidate4WY_MpI("GROUP", 17, 17, readVar, twoDimensionalFocusSearchKtWhenMappings7);
        GROUP = findbestcandidate4wy_mpi18;
        read readVar2 = read.VECTOR;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi19 = new findBestCandidate4WY_MpI("DOUBLE_LIST", 18, 18, readVar2, twoDimensionalFocusSearchKtWhenMappings);
        DOUBLE_LIST = findbestcandidate4wy_mpi19;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi20 = new findBestCandidate4WY_MpI("FLOAT_LIST", 19, 19, readVar2, twoDimensionalFocusSearchKtWhenMappings2);
        FLOAT_LIST = findbestcandidate4wy_mpi20;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi21 = new findBestCandidate4WY_MpI("INT64_LIST", 20, 20, readVar2, twoDimensionalFocusSearchKtWhenMappings3);
        INT64_LIST = findbestcandidate4wy_mpi21;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi22 = new findBestCandidate4WY_MpI("UINT64_LIST", 21, 21, readVar2, twoDimensionalFocusSearchKtWhenMappings3);
        UINT64_LIST = findbestcandidate4wy_mpi22;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi23 = new findBestCandidate4WY_MpI("INT32_LIST", 22, 22, readVar2, twoDimensionalFocusSearchKtWhenMappings4);
        INT32_LIST = findbestcandidate4wy_mpi23;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi24 = new findBestCandidate4WY_MpI("FIXED64_LIST", 23, 23, readVar2, twoDimensionalFocusSearchKtWhenMappings3);
        FIXED64_LIST = findbestcandidate4wy_mpi24;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi25 = new findBestCandidate4WY_MpI("FIXED32_LIST", 24, 24, readVar2, twoDimensionalFocusSearchKtWhenMappings4);
        FIXED32_LIST = findbestcandidate4wy_mpi25;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi26 = new findBestCandidate4WY_MpI("BOOL_LIST", 25, 25, readVar2, twoDimensionalFocusSearchKtWhenMappings5);
        BOOL_LIST = findbestcandidate4wy_mpi26;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi27 = new findBestCandidate4WY_MpI("STRING_LIST", 26, 26, readVar2, twoDimensionalFocusSearchKtWhenMappings6);
        STRING_LIST = findbestcandidate4wy_mpi27;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi28 = new findBestCandidate4WY_MpI("MESSAGE_LIST", 27, 27, readVar2, twoDimensionalFocusSearchKtWhenMappings7);
        MESSAGE_LIST = findbestcandidate4wy_mpi28;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi29 = new findBestCandidate4WY_MpI("BYTES_LIST", 28, 28, readVar2, twoDimensionalFocusSearchKtWhenMappings8);
        BYTES_LIST = findbestcandidate4wy_mpi29;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi30 = new findBestCandidate4WY_MpI("UINT32_LIST", 29, 29, readVar2, twoDimensionalFocusSearchKtWhenMappings4);
        UINT32_LIST = findbestcandidate4wy_mpi30;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi31 = new findBestCandidate4WY_MpI("ENUM_LIST", 30, 30, readVar2, twoDimensionalFocusSearchKtWhenMappings9);
        ENUM_LIST = findbestcandidate4wy_mpi31;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi32 = new findBestCandidate4WY_MpI("SFIXED32_LIST", 31, 31, readVar2, twoDimensionalFocusSearchKtWhenMappings4);
        SFIXED32_LIST = findbestcandidate4wy_mpi32;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi33 = new findBestCandidate4WY_MpI("SFIXED64_LIST", 32, 32, readVar2, twoDimensionalFocusSearchKtWhenMappings3);
        SFIXED64_LIST = findbestcandidate4wy_mpi33;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi34 = new findBestCandidate4WY_MpI("SINT32_LIST", 33, 33, readVar2, twoDimensionalFocusSearchKtWhenMappings4);
        SINT32_LIST = findbestcandidate4wy_mpi34;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi35 = new findBestCandidate4WY_MpI("SINT64_LIST", 34, 34, readVar2, twoDimensionalFocusSearchKtWhenMappings3);
        SINT64_LIST = findbestcandidate4wy_mpi35;
        read readVar3 = read.PACKED_VECTOR;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi36 = new findBestCandidate4WY_MpI("DOUBLE_LIST_PACKED", 35, 35, readVar3, twoDimensionalFocusSearchKtWhenMappings);
        DOUBLE_LIST_PACKED = findbestcandidate4wy_mpi36;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi37 = new findBestCandidate4WY_MpI("FLOAT_LIST_PACKED", 36, 36, readVar3, twoDimensionalFocusSearchKtWhenMappings2);
        FLOAT_LIST_PACKED = findbestcandidate4wy_mpi37;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi38 = new findBestCandidate4WY_MpI("INT64_LIST_PACKED", 37, 37, readVar3, twoDimensionalFocusSearchKtWhenMappings3);
        INT64_LIST_PACKED = findbestcandidate4wy_mpi38;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi39 = new findBestCandidate4WY_MpI("UINT64_LIST_PACKED", 38, 38, readVar3, twoDimensionalFocusSearchKtWhenMappings3);
        UINT64_LIST_PACKED = findbestcandidate4wy_mpi39;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi40 = new findBestCandidate4WY_MpI("INT32_LIST_PACKED", 39, 39, readVar3, twoDimensionalFocusSearchKtWhenMappings4);
        INT32_LIST_PACKED = findbestcandidate4wy_mpi40;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi41 = new findBestCandidate4WY_MpI("FIXED64_LIST_PACKED", 40, 40, readVar3, twoDimensionalFocusSearchKtWhenMappings3);
        FIXED64_LIST_PACKED = findbestcandidate4wy_mpi41;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi42 = new findBestCandidate4WY_MpI("FIXED32_LIST_PACKED", 41, 41, readVar3, twoDimensionalFocusSearchKtWhenMappings4);
        FIXED32_LIST_PACKED = findbestcandidate4wy_mpi42;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi43 = new findBestCandidate4WY_MpI("BOOL_LIST_PACKED", 42, 42, readVar3, twoDimensionalFocusSearchKtWhenMappings5);
        BOOL_LIST_PACKED = findbestcandidate4wy_mpi43;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi44 = new findBestCandidate4WY_MpI("UINT32_LIST_PACKED", 43, 43, readVar3, twoDimensionalFocusSearchKtWhenMappings4);
        UINT32_LIST_PACKED = findbestcandidate4wy_mpi44;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi45 = new findBestCandidate4WY_MpI("ENUM_LIST_PACKED", 44, 44, readVar3, twoDimensionalFocusSearchKtWhenMappings9);
        ENUM_LIST_PACKED = findbestcandidate4wy_mpi45;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi46 = new findBestCandidate4WY_MpI("SFIXED32_LIST_PACKED", 45, 45, readVar3, twoDimensionalFocusSearchKtWhenMappings4);
        SFIXED32_LIST_PACKED = findbestcandidate4wy_mpi46;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi47 = new findBestCandidate4WY_MpI("SFIXED64_LIST_PACKED", 46, 46, readVar3, twoDimensionalFocusSearchKtWhenMappings3);
        SFIXED64_LIST_PACKED = findbestcandidate4wy_mpi47;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi48 = new findBestCandidate4WY_MpI("SINT32_LIST_PACKED", 47, 47, readVar3, twoDimensionalFocusSearchKtWhenMappings4);
        SINT32_LIST_PACKED = findbestcandidate4wy_mpi48;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi49 = new findBestCandidate4WY_MpI("SINT64_LIST_PACKED", 48, 48, readVar3, twoDimensionalFocusSearchKtWhenMappings3);
        SINT64_LIST_PACKED = findbestcandidate4wy_mpi49;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi50 = new findBestCandidate4WY_MpI("GROUP_LIST", 49, 49, readVar2, twoDimensionalFocusSearchKtWhenMappings7);
        GROUP_LIST = findbestcandidate4wy_mpi50;
        findBestCandidate4WY_MpI findbestcandidate4wy_mpi51 = new findBestCandidate4WY_MpI("MAP", 50, 50, read.MAP, TwoDimensionalFocusSearchKtWhenMappings.VOID);
        MAP = findbestcandidate4wy_mpi51;
        $VALUES = new findBestCandidate4WY_MpI[]{findbestcandidate4wy_mpi, findbestcandidate4wy_mpi2, findbestcandidate4wy_mpi3, findbestcandidate4wy_mpi4, findbestcandidate4wy_mpi5, findbestcandidate4wy_mpi6, findbestcandidate4wy_mpi7, findbestcandidate4wy_mpi8, findbestcandidate4wy_mpi9, findbestcandidate4wy_mpi10, findbestcandidate4wy_mpi11, findbestcandidate4wy_mpi12, findbestcandidate4wy_mpi13, findbestcandidate4wy_mpi14, findbestcandidate4wy_mpi15, findbestcandidate4wy_mpi16, findbestcandidate4wy_mpi17, findbestcandidate4wy_mpi18, findbestcandidate4wy_mpi19, findbestcandidate4wy_mpi20, findbestcandidate4wy_mpi21, findbestcandidate4wy_mpi22, findbestcandidate4wy_mpi23, findbestcandidate4wy_mpi24, findbestcandidate4wy_mpi25, findbestcandidate4wy_mpi26, findbestcandidate4wy_mpi27, findbestcandidate4wy_mpi28, findbestcandidate4wy_mpi29, findbestcandidate4wy_mpi30, findbestcandidate4wy_mpi31, findbestcandidate4wy_mpi32, findbestcandidate4wy_mpi33, findbestcandidate4wy_mpi34, findbestcandidate4wy_mpi35, findbestcandidate4wy_mpi36, findbestcandidate4wy_mpi37, findbestcandidate4wy_mpi38, findbestcandidate4wy_mpi39, findbestcandidate4wy_mpi40, findbestcandidate4wy_mpi41, findbestcandidate4wy_mpi42, findbestcandidate4wy_mpi43, findbestcandidate4wy_mpi44, findbestcandidate4wy_mpi45, findbestcandidate4wy_mpi46, findbestcandidate4wy_mpi47, findbestcandidate4wy_mpi48, findbestcandidate4wy_mpi49, findbestcandidate4wy_mpi50, findbestcandidate4wy_mpi51};
        EMPTY_TYPES = new Type[0];
        findBestCandidate4WY_MpI[] findbestcandidate4wy_mpiArrValues = values();
        VALUES = new findBestCandidate4WY_MpI[findbestcandidate4wy_mpiArrValues.length];
        for (findBestCandidate4WY_MpI findbestcandidate4wy_mpi52 : findbestcandidate4wy_mpiArrValues) {
            VALUES[findbestcandidate4wy_mpi52.id] = findbestcandidate4wy_mpi52;
        }
    }

    public static findBestCandidate4WY_MpI forId(int i) {
        if (i < 0) {
            return null;
        }
        findBestCandidate4WY_MpI[] findbestcandidate4wy_mpiArr = VALUES;
        if (i >= findbestcandidate4wy_mpiArr.length) {
            return null;
        }
        return findbestcandidate4wy_mpiArr[i];
    }

    public static findBestCandidate4WY_MpI valueOf(String str) {
        return (findBestCandidate4WY_MpI) Enum.valueOf(findBestCandidate4WY_MpI.class, str);
    }

    public static findBestCandidate4WY_MpI[] values() {
        return (findBestCandidate4WY_MpI[]) $VALUES.clone();
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == read.MAP;
    }

    public boolean isPacked() {
        return read.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isScalar() {
        return this.collection == read.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return read.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }

    private findBestCandidate4WY_MpI(String str, int i, int i2, read readVar, TwoDimensionalFocusSearchKtWhenMappings twoDimensionalFocusSearchKtWhenMappings) {
        int i3;
        super(str, i);
        this.id = i2;
        this.collection = readVar;
        this.javaType = twoDimensionalFocusSearchKtWhenMappings;
        int i4 = findChildCorrespondingToFocusEnterOMvw8.read[readVar.ordinal()];
        if (i4 == 1 || i4 == 2) {
            this.elementType = twoDimensionalFocusSearchKtWhenMappings.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (readVar != read.SCALAR || (i3 = findChildCorrespondingToFocusEnterOMvw8.serializer[twoDimensionalFocusSearchKtWhenMappings.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
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
