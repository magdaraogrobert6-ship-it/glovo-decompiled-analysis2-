package androidx.compose.ui.graphics;

import java.util.regex.Pattern;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m834constructorimpl((short) 5120);
    private static final short LowestValue = m834constructorimpl((short) -1025);
    private static final short MaxValue = m834constructorimpl((short) 31743);
    private static final short MinNormal = m834constructorimpl((short) 1024);
    private static final short MinValue = m834constructorimpl((short) 1);
    private static final short NaN = m834constructorimpl((short) 32256);
    private static final short NegativeInfinity = m834constructorimpl((short) -1024);
    private static final short NegativeZero = m834constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m834constructorimpl((short) 31744);
    private static final short PositiveZero = m834constructorimpl((short) 0);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m834constructorimpl(short s) {
        return s;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m836equalsimpl0(short s, short s2) {
        return s == s2;
    }

    /* JADX INFO: renamed from: getExponent-impl, reason: not valid java name */
    public static final int m838getExponentimpl(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* JADX INFO: renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m840getSignificandimpl(short s) {
        return s & 1023;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m841hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m842isFiniteimpl(short s) {
        return (s & Short.MAX_VALUE) != 31744;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m843isInfiniteimpl(short s) {
        return (s & Short.MAX_VALUE) == 31744;
    }

    /* JADX INFO: renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m844isNaNimpl(short s) {
        return (s & Short.MAX_VALUE) > 31744;
    }

    /* JADX INFO: renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m845isNormalizedimpl(short s) {
        int i = s & 31744;
        return (i != 0) & (i != 31744);
    }

    /* JADX INFO: renamed from: toBits-impl, reason: not valid java name */
    public static final int m847toBitsimpl(short s) {
        if (m844isNaNimpl(s)) {
            return 32256;
        }
        return s & 65535;
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    public static final byte m848toByteimpl(short s) {
        return (byte) m850toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m849toDoubleimpl(short s) {
        return m850toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m852toIntimpl(short s) {
        return (int) m850toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m853toLongimpl(short s) {
        return (long) m850toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m854toRawBitsimpl(short s) {
        return s & 65535;
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    public static final short m855toShortimpl(short s) {
        return (short) m850toFloatimpl(s);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m860unboximpl() {
        return this.halfValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m829boximpl(short s) {
        return new Float16(s);
    }

    /* JADX INFO: renamed from: toHexString-impl, reason: not valid java name */
    public static final String m851toHexStringimpl(short s) {
        StringBuilder sb = new StringBuilder();
        int i = 65535 & s;
        int i2 = i >>> 15;
        int i3 = (i >>> 10) & 31;
        int i4 = s & 1023;
        if (i3 != 31) {
            if (i2 == 1) {
                sb.append('-');
            }
            if (i3 != 0) {
                sb.append("0x1.");
                TuplesKt.RemoteActionCompatParcelizer(16);
                String string = Integer.toString(i4, 16);
                string.getClass();
                Pattern patternCompile = Pattern.compile("0{2,}$");
                patternCompile.getClass();
                String strReplaceFirst = patternCompile.matcher(string).replaceFirst("");
                strReplaceFirst.getClass();
                sb.append(strReplaceFirst);
                sb.append('p');
                sb.append(String.valueOf(i3 - 15));
            } else if (i4 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                TuplesKt.RemoteActionCompatParcelizer(16);
                String string2 = Integer.toString(i4, 16);
                string2.getClass();
                Pattern patternCompile2 = Pattern.compile("0{2,}$");
                patternCompile2.getClass();
                String strReplaceFirst2 = patternCompile2.matcher(string2).replaceFirst("");
                strReplaceFirst2.getClass();
                sb.append(strReplaceFirst2);
                sb.append("p-14");
            }
        } else if (i4 == 0) {
            if (i2 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Float16 float16) {
        return m859compareTo41bOqos(float16.m860unboximpl());
    }

    public boolean equals(Object obj) {
        return m835equalsimpl(this.halfValue, obj);
    }

    public int hashCode() {
        return m841hashCodeimpl(this.halfValue);
    }

    public String toString() {
        return m856toStringimpl(this.halfValue);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m861getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* JADX INFO: renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m862getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* JADX INFO: renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m863getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* JADX INFO: renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m864getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* JADX INFO: renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m865getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* JADX INFO: renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m866getNaNslo4al4() {
            return Float16.NaN;
        }

        /* JADX INFO: renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m867getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* JADX INFO: renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m868getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* JADX INFO: renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m869getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* JADX INFO: renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m870getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Float16(short s) {
        this.halfValue = s;
    }

    /* JADX INFO: renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m828absoluteValueslo4al4(short s) {
        return m834constructorimpl((short) (s & Short.MAX_VALUE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m831compareTo41bOqos(short s, short s2) {
        if (m844isNaNimpl(s)) {
            return !m844isNaNimpl(s2) ? 1 : 0;
        }
        if (m844isNaNimpl(s2)) {
            return -1;
        }
        return removeNodeAtDepth.serializer((s & Short.MIN_VALUE) != 0 ? Fields.CompositingStrategy - (s & 65535) : s & 65535, (s2 & Short.MIN_VALUE) != 0 ? Fields.CompositingStrategy - (s2 & 65535) : s2 & 65535);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m835equalsimpl(short s, Object obj) {
        return (obj instanceof Float16) && s == ((Float16) obj).m860unboximpl();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m856toStringimpl(short s) {
        return String.valueOf(m850toFloatimpl(s));
    }

    /* JADX INFO: renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m858withSignqCeQghg(short s, short s2) {
        return m834constructorimpl((short) ((s & Short.MAX_VALUE) | (s2 & Short.MIN_VALUE)));
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    public static final float m850toFloatimpl(short s) {
        int i;
        int i2;
        int i3;
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m839getSignslo4al4(short s) {
        int i = s & Short.MAX_VALUE;
        if (!((i > 31744) | (i == 0))) {
            i = (s & Short.MIN_VALUE) | 15360;
        }
        return m834constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m857truncslo4al4(short s) {
        int i = 65535 & s;
        int i2 = s & Short.MAX_VALUE;
        if (i2 < 15360) {
            i = Short.MIN_VALUE & s;
        } else if (i2 < 25600) {
            i &= ~((1 << (25 - (i2 >> 10))) - 1);
        }
        return m834constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m837floorslo4al4(short s) {
        int i = s & 65535;
        int i2 = s & Short.MAX_VALUE;
        if (i2 < 15360) {
            i = (s & Short.MIN_VALUE) | ((i <= 32768 ? 0 : 65535) & 15360);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + ((-(i >> 15)) & i3)) & (~i3);
        }
        return m834constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: round-slo4al4, reason: not valid java name */
    public static final short m846roundslo4al4(short s) {
        int i = s & 65535;
        int i2 = s & Short.MAX_VALUE;
        if (i2 < 15360) {
            i = (s & Short.MIN_VALUE) | ((i2 < 14336 ? 0 : 65535) & 15360);
        } else if (i2 < 25600) {
            int i3 = i2 >> 10;
            i = (i + (1 << (24 - i3))) & (~((1 << (25 - i3)) - 1));
        }
        return m834constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m830ceilslo4al4(short s) {
        int i = 65535 & s;
        int i2 = s & Short.MAX_VALUE;
        if (i2 < 15360) {
            i = ((-((~(i >> 15)) & (i2 == 0 ? 0 : 1))) & 15360) | (s & Short.MIN_VALUE);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + (((i >> 15) - 1) & i3)) & (~i3);
        }
        return m834constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m859compareTo41bOqos(short s) {
        return m831compareTo41bOqos(this.halfValue, s);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m833constructorimpl(float f) {
        int i;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = iFloatToRawIntBits >>> 31;
        int i3 = (iFloatToRawIntBits >>> 23) & 255;
        int i4 = 8388607 & iFloatToRawIntBits;
        int i5 = 31;
        int i6 = 0;
        if (i3 != 255) {
            int i7 = i3 - 112;
            if (i7 >= 31) {
                i5 = 49;
            } else {
                if (i7 > 0) {
                    i6 = i4 >> 13;
                    if ((iFloatToRawIntBits & Fields.TransformOrigin) != 0) {
                        i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                    } else {
                        i5 = i7;
                    }
                    return m834constructorimpl((short) i);
                }
                if (i7 >= -10) {
                    int i8 = (8388608 | i4) >> (1 - i7);
                    if ((i8 & Fields.TransformOrigin) != 0) {
                        i8 += 8192;
                    }
                    i5 = 0;
                    i6 = i8 >> 13;
                } else {
                    i5 = 0;
                }
            }
        } else if (i4 != 0) {
            i6 = Fields.RotationY;
        }
        i = (i2 << 15) | (i5 << 10) | i6;
        return m834constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m832constructorimpl(double d) {
        return m833constructorimpl((float) d);
    }
}
