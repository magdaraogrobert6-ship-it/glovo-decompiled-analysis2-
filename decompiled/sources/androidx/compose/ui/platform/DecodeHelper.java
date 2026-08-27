package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidColor_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

/* JADX INFO: loaded from: classes4.dex */
public final class DecodeHelper {
    public static final int $stable = 8;
    private final Parcel parcel;

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        long jM2714decodeColor0d7_KjU = m2714decodeColor0d7_KjU();
        float fDecodeFloat = decodeFloat();
        float fDecodeFloat2 = decodeFloat();
        return new Shadow(jM2714decodeColor0d7_KjU, Offset.m469constructorimpl((Float.floatToRawIntBits(fDecodeFloat) << 32) | (((long) Float.floatToRawIntBits(fDecodeFloat2)) & 4294967295L)), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        return TextDecoration.Companion.valueOf(decodeInt());
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* JADX INFO: renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m2713decodeULongsVKNKU() {
        return this.parcel.readLong();
    }

    /* JADX INFO: renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m2714decodeColor0d7_KjU() {
        return AndroidColor_androidKt.fromColorLong(Color.Companion, this.parcel.readLong());
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    public DecodeHelper(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    /* JADX INFO: renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m2712decodeBaselineShifty9eOQZs() {
        return BaselineShift.m3374constructorimpl(decodeFloat());
    }

    /* JADX INFO: renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m2715decodeFontStyle_LCdwA() {
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 0) {
            return FontStyle.Companion.m3197getNormal_LCdwA();
        }
        return bDecodeByte == 1 ? FontStyle.Companion.m3196getItalic_LCdwA() : FontStyle.Companion.m3197getNormal_LCdwA();
    }

    /* JADX INFO: renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m2716decodeFontSynthesisGVVA2EU() {
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 0) {
            return FontSynthesis.Companion.m3208getNoneGVVA2EU();
        }
        if (bDecodeByte == 1) {
            return FontSynthesis.Companion.m3207getAllGVVA2EU();
        }
        if (bDecodeByte == 3) {
            return FontSynthesis.Companion.m3209getStyleGVVA2EU();
        }
        return bDecodeByte == 2 ? FontSynthesis.Companion.m3210getWeightGVVA2EU() : FontSynthesis.Companion.m3208getNoneGVVA2EU();
    }

    /* JADX INFO: renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m2717decodeTextUnitXSAIIZE() {
        long jM3899getEmUIouoOA;
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 1) {
            jM3899getEmUIouoOA = TextUnitType.Companion.m3900getSpUIouoOA();
        } else {
            jM3899getEmUIouoOA = bDecodeByte == 2 ? TextUnitType.Companion.m3899getEmUIouoOA() : TextUnitType.Companion.m3901getUnspecifiedUIouoOA();
        }
        return TextUnitType.m3895equalsimpl0(jM3899getEmUIouoOA, TextUnitType.Companion.m3901getUnspecifiedUIouoOA()) ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : TextUnitKt.m3879TextUnitanM5pPY(decodeFloat(), jM3899getEmUIouoOA);
    }

    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle;
        MutableSpanStyle mutableSpanStyle2 = mutableSpanStyle;
        MutableSpanStyle mutableSpanStyle3 = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bDecodeByte = decodeByte();
            if (bDecodeByte != 1) {
                mutableSpanStyle = mutableSpanStyle2;
                if (bDecodeByte == 2) {
                    if (dataAvailable() >= 5) {
                        mutableSpanStyle.m2767setFontSizeR2X_6o(m2717decodeTextUnitXSAIIZE());
                        mutableSpanStyle2 = mutableSpanStyle;
                    } else {
                        return mutableSpanStyle.toSpanStyle();
                    }
                } else if (bDecodeByte == 3) {
                    if (dataAvailable() >= 4) {
                        mutableSpanStyle.setFontWeight(decodeFontWeight());
                        mutableSpanStyle2 = mutableSpanStyle;
                    } else {
                        return mutableSpanStyle.toSpanStyle();
                    }
                } else if (bDecodeByte == 4) {
                    if (dataAvailable() >= 1) {
                        mutableSpanStyle.m2768setFontStylemLjRB2g(FontStyle.m3187boximpl(m2715decodeFontStyle_LCdwA()));
                        mutableSpanStyle2 = mutableSpanStyle;
                    } else {
                        return mutableSpanStyle.toSpanStyle();
                    }
                } else if (bDecodeByte != 5) {
                    if (bDecodeByte == 6) {
                        mutableSpanStyle.setFontFeatureSettings(decodeString());
                    } else if (bDecodeByte == 7) {
                        if (dataAvailable() >= 5) {
                            mutableSpanStyle.m2770setLetterSpacingR2X_6o(m2717decodeTextUnitXSAIIZE());
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    } else if (bDecodeByte == 8) {
                        if (dataAvailable() >= 4) {
                            mutableSpanStyle.m2765setBaselineShift_isdbwI(BaselineShift.m3373boximpl(m2712decodeBaselineShifty9eOQZs()));
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    } else if (bDecodeByte == 9) {
                        if (dataAvailable() >= 8) {
                            mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    } else if (bDecodeByte == 10) {
                        if (dataAvailable() >= 8) {
                            mutableSpanStyle.m2764setBackground8_81llA(m2714decodeColor0d7_KjU());
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    } else if (bDecodeByte == 11) {
                        if (dataAvailable() >= 4) {
                            mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    } else if (bDecodeByte == 12) {
                        if (dataAvailable() >= 20) {
                            mutableSpanStyle.setShadow(decodeShadow());
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    }
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (dataAvailable() >= 1) {
                    mutableSpanStyle.m2769setFontSynthesistDdu0R4(FontSynthesis.m3198boximpl(m2716decodeFontSynthesisGVVA2EU()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else {
                    return mutableSpanStyle.toSpanStyle();
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle2.m2766setColor8_81llA(m2714decodeColor0d7_KjU());
            }
        }
        mutableSpanStyle = mutableSpanStyle2;
        return mutableSpanStyle.toSpanStyle();
    }
}
