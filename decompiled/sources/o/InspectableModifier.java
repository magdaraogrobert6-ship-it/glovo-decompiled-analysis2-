package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.re2j.Parser;
import com.google.re2j.PatternSyntaxException;
import com.huawei.riemann.location.common.utils.Constant;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class InspectableModifier implements Serializable {
    public final transient InspectableModifierEnd read;
    public final String serializer;

    public final String toString() {
        return this.serializer;
    }

    public final boolean RemoteActionCompatParcelizer(String str) {
        InspectableModifierEnd inspectableModifierEnd = this.read;
        int[] iArr = new int[(inspectableModifierEnd.RemoteActionCompatParcelizer * 2) + 2];
        onInfiniteOperation oninfiniteoperation = new onInfiniteOperation();
        oninfiniteoperation.write = str;
        return inspectableModifierEnd.IconCompatParcelizer(oninfiniteoperation, 0, str.length(), 2, iArr, 1);
    }

    public final int hashCode() {
        return this.serializer.hashCode() * 31;
    }

    public InspectableModifier(String str, InspectableModifierEnd inspectableModifierEnd) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("pattern is null");
            throw null;
        }
        this.serializer = str;
        this.read = inspectableModifierEnd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && InspectableModifier.class == obj.getClass() && this.serializer.equals(((InspectableModifier) obj).serializer);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0261  */
    /* JADX WARN: Code duplicated, block: B:186:0x0324  */
    /* JADX WARN: Code duplicated, block: B:188:0x032f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0339  */
    /* JADX WARN: Code duplicated, block: B:191:0x0344  */
    /* JADX WARN: Code duplicated, block: B:192:0x034e  */
    /* JADX WARN: Code duplicated, block: B:277:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:281:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:282:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:290:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:292:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:294:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:296:0x0503  */
    /* JADX WARN: Code duplicated, block: B:297:0x0505  */
    /* JADX WARN: Code duplicated, block: B:298:0x0508  */
    /* JADX WARN: Code duplicated, block: B:299:0x050b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static InspectableModifier serializer(String str) {
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11;
        int i;
        prune pruneVar;
        int iSerializer;
        accessgetValueOverridejd accessgetvalueoverridejd;
        accessgetValueOverridejd accessgetvalueoverridejd2;
        int i2;
        int i3;
        int iSerializer2;
        int iSerializer3;
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write;
        onFling onfling;
        onFling onfling2;
        int i4;
        int i5;
        boolean z;
        int iSerializer4;
        Parser parser = new Parser(str, Constant.ERROR_GYRO_LOW_FREQ);
        int i6 = parser.read;
        String str2 = parser.MediaSessionCompatQueueItem;
        int i7 = 5;
        int i8 = 2;
        if ((i6 & 2) != 0) {
            inputMethodSessioncreateInputConnection11 = new InputMethodSessioncreateInputConnection11(accessgetValueOverridejd.LITERAL);
            inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer = i6;
            int length = str2.length();
            int[] iArr = new int[str2.codePointCount(0, length)];
            int iCharCount = 0;
            int i9 = 0;
            while (iCharCount < length) {
                int iCodePointAt = str2.codePointAt(iCharCount);
                iArr[i9] = iCodePointAt;
                iCharCount += Character.charCount(iCodePointAt);
                i9++;
            }
            inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = iArr;
        } else {
            prune pruneVar2 = new prune(str2);
            int i10 = -1;
            int i11 = -1;
            short s = -1;
            int i12 = -1;
            while (true) {
                boolean zRemoteActionCompatParcelizer = pruneVar2.RemoteActionCompatParcelizer();
                HashMap map = parser.write;
                accessgetOnAllConnectionsClosedp accessgetonallconnectionsclosedp = parser.RatingCompat;
                if (zRemoteActionCompatParcelizer) {
                    int iWrite = pruneVar2.write();
                    if (iWrite == 36) {
                        i = i10;
                        pruneVar = pruneVar2;
                        if ((parser.read & 16) != 0) {
                            parser.serializer(accessgetValueOverridejd.END_TEXT).RemoteActionCompatParcelizer |= androidx.compose.ui.graphics.Fields.RotationX;
                        } else {
                            parser.serializer(accessgetValueOverridejd.END_LINE);
                        }
                        pruneVar.write(1);
                    } else if (iWrite != 46) {
                        if (iWrite == 63) {
                            int i13 = i10;
                            pruneVar = pruneVar2;
                            int i14 = pruneVar.IconCompatParcelizer;
                            iSerializer = pruneVar.serializer();
                            if (iSerializer != 42) {
                                accessgetvalueoverridejd = accessgetValueOverridejd.STAR;
                            } else if (iSerializer != 43) {
                                accessgetvalueoverridejd = accessgetValueOverridejd.PLUS;
                            } else {
                                if (iSerializer != 63) {
                                    accessgetvalueoverridejd2 = null;
                                } else {
                                    accessgetvalueoverridejd = accessgetValueOverridejd.QUEST;
                                }
                                i = i13;
                                parser.RemoteActionCompatParcelizer(accessgetvalueoverridejd2, i12, s, i14, pruneVar, i11);
                                i11 = i14;
                                continue;
                            }
                            accessgetvalueoverridejd2 = accessgetvalueoverridejd;
                            i = i13;
                            parser.RemoteActionCompatParcelizer(accessgetvalueoverridejd2, i12, s, i14, pruneVar, i11);
                            i11 = i14;
                            continue;
                        } else {
                            if (iWrite == 94) {
                                i2 = i10;
                                pruneVar = pruneVar2;
                                if ((parser.read & 16) != 0) {
                                    parser.serializer(accessgetValueOverridejd.BEGIN_TEXT);
                                } else {
                                    parser.serializer(accessgetValueOverridejd.BEGIN_LINE);
                                }
                                pruneVar.write(1);
                            } else if (iWrite == 91) {
                                pruneVar = pruneVar2;
                                int i15 = i8;
                                i2 = i10;
                                int i16 = pruneVar.IconCompatParcelizer;
                                pruneVar.write(1);
                                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write2 = parser.write(accessgetValueOverridejd.CHAR_CLASS);
                                inputMethodSessioncreateInputConnection11Write2.RemoteActionCompatParcelizer = parser.read;
                                onFling onfling3 = new onFling(0);
                                if (pruneVar.RemoteActionCompatParcelizer() && pruneVar.write('^')) {
                                    pruneVar.write(1);
                                    if ((parser.read & 4) == 0) {
                                        onfling3.RemoteActionCompatParcelizer(10, 10);
                                    }
                                    i3 = i2;
                                } else {
                                    i3 = 1;
                                }
                                boolean z2 = true;
                                while (true) {
                                    if (pruneVar.RemoteActionCompatParcelizer() && pruneVar.write() == 93 && !z2) {
                                        pruneVar.write(1);
                                        onfling3.write();
                                        if (i3 < 0) {
                                            int i17 = 0;
                                            int i18 = 0;
                                            for (int i19 = 0; i19 < onfling3.read; i19 += 2) {
                                                int[] iArr2 = onfling3.write;
                                                int i20 = iArr2[i19];
                                                int i21 = iArr2[i19 + 1];
                                                int i22 = i20 - 1;
                                                if (i18 <= i22) {
                                                    iArr2[i17] = i18;
                                                    iArr2[i17 + 1] = i22;
                                                    i17 += 2;
                                                }
                                                i18 = i21 + 1;
                                            }
                                            onfling3.read = i17;
                                            if (i18 <= 1114111) {
                                                int i23 = i17 + 2;
                                                int[] iArr3 = onfling3.write;
                                                if (iArr3.length < i23) {
                                                    int i24 = i17 * 2;
                                                    if (i23 < i24) {
                                                        i23 = i24;
                                                    }
                                                    int[] iArr4 = new int[i23];
                                                    System.arraycopy(iArr3, 0, iArr4, 0, i17);
                                                    onfling3.write = iArr4;
                                                }
                                                int[] iArr5 = onfling3.write;
                                                int i25 = onfling3.read;
                                                int i26 = i25 + 1;
                                                onfling3.read = i26;
                                                iArr5[i25] = i18;
                                                onfling3.read = i25 + i15;
                                                iArr5[i26] = 1114111;
                                            }
                                        }
                                        inputMethodSessioncreateInputConnection11Write2.MediaSessionCompatQueueItem = onfling3.RemoteActionCompatParcelizer();
                                        parser.serializer(inputMethodSessioncreateInputConnection11Write2);
                                    } else {
                                        if (pruneVar.RemoteActionCompatParcelizer() && pruneVar.write('-') && (parser.read & 64) == 0 && !z2) {
                                            String strMediaMetadataCompat = pruneVar.MediaMetadataCompat();
                                            if (strMediaMetadataCompat.equals("-") || !strMediaMetadataCompat.startsWith("-]")) {
                                                pruneVar.IconCompatParcelizer = i16;
                                                throw new PatternSyntaxException("invalid character class range", pruneVar.MediaMetadataCompat());
                                            }
                                        }
                                        int i27 = pruneVar.IconCompatParcelizer;
                                        if (pruneVar.write("[:")) {
                                            String strMediaMetadataCompat2 = pruneVar.MediaMetadataCompat();
                                            int iIndexOf = strMediaMetadataCompat2.indexOf(":]");
                                            if (iIndexOf < 0) {
                                                pruneVar.IconCompatParcelizer = i27;
                                                if (parser.IconCompatParcelizer(pruneVar, onfling3)) {
                                                    pruneVar.IconCompatParcelizer = i27;
                                                    iSerializer2 = Parser.serializer(pruneVar, i16);
                                                    if (pruneVar.RemoteActionCompatParcelizer()) {
                                                        i2 = -1;
                                                        iSerializer3 = iSerializer2;
                                                    } else {
                                                        i2 = -1;
                                                        iSerializer3 = iSerializer2;
                                                    }
                                                    if ((parser.read & 1) == 0) {
                                                        onfling3.RemoteActionCompatParcelizer(iSerializer2, iSerializer3);
                                                    } else {
                                                        onfling3.read(iSerializer2, iSerializer3);
                                                    }
                                                }
                                            } else {
                                                String strSubstring = strMediaMetadataCompat2.substring(0, iIndexOf + 2);
                                                pruneVar.IconCompatParcelizer = strSubstring.length() + pruneVar.IconCompatParcelizer;
                                                InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) InfiniteAnimationPolicy.read.get(strSubstring);
                                                if (infiniteAnimationPolicy != null) {
                                                    onfling3.RemoteActionCompatParcelizer(infiniteAnimationPolicy, (parser.read & 1) != 0);
                                                } else {
                                                    throw new PatternSyntaxException("invalid character class range", strSubstring);
                                                }
                                            }
                                            i2 = -1;
                                        } else if (parser.IconCompatParcelizer(pruneVar, onfling3) || parser.read(pruneVar, onfling3)) {
                                            i2 = -1;
                                        } else {
                                            pruneVar.IconCompatParcelizer = i27;
                                            iSerializer2 = Parser.serializer(pruneVar, i16);
                                            if (pruneVar.RemoteActionCompatParcelizer() || !pruneVar.write('-')) {
                                                i2 = -1;
                                            } else {
                                                pruneVar.write(1);
                                                if (pruneVar.RemoteActionCompatParcelizer() && pruneVar.write(']')) {
                                                    i2 = -1;
                                                    pruneVar.write(-1);
                                                } else {
                                                    i2 = -1;
                                                    iSerializer3 = Parser.serializer(pruneVar, i16);
                                                    if (iSerializer3 < iSerializer2) {
                                                        throw new PatternSyntaxException("invalid character class range", pruneVar.IconCompatParcelizer(i27));
                                                    }
                                                }
                                                if ((parser.read & 1) == 0) {
                                                    onfling3.RemoteActionCompatParcelizer(iSerializer2, iSerializer3);
                                                } else {
                                                    onfling3.read(iSerializer2, iSerializer3);
                                                }
                                            }
                                            iSerializer3 = iSerializer2;
                                            if ((parser.read & 1) == 0) {
                                                onfling3.RemoteActionCompatParcelizer(iSerializer2, iSerializer3);
                                            } else {
                                                onfling3.read(iSerializer2, iSerializer3);
                                            }
                                        }
                                        z2 = false;
                                        i15 = 2;
                                    }
                                }
                            } else if (iWrite == 92) {
                                int i28 = i10;
                                pruneVar = pruneVar2;
                                int i29 = i8;
                                int i30 = pruneVar.IconCompatParcelizer;
                                pruneVar.write(1);
                                if ((parser.read & 64) != 0 && pruneVar.RemoteActionCompatParcelizer()) {
                                    int iSerializer5 = pruneVar.serializer();
                                    if (iSerializer5 == 81) {
                                        String strMediaMetadataCompat3 = pruneVar.MediaMetadataCompat();
                                        int iIndexOf2 = strMediaMetadataCompat3.indexOf("\\E");
                                        if (iIndexOf2 >= 0) {
                                            strMediaMetadataCompat3 = strMediaMetadataCompat3.substring(0, iIndexOf2);
                                        }
                                        pruneVar.IconCompatParcelizer = strMediaMetadataCompat3.length() + pruneVar.IconCompatParcelizer + i29;
                                        for (int i31 = 0; i31 < strMediaMetadataCompat3.length(); i31++) {
                                            parser.read(strMediaMetadataCompat3.charAt(i31));
                                        }
                                    } else if (iSerializer5 == 98) {
                                        parser.serializer(accessgetValueOverridejd.WORD_BOUNDARY);
                                    } else if (iSerializer5 != 122) {
                                        switch (iSerializer5) {
                                            case 65:
                                                parser.serializer(accessgetValueOverridejd.BEGIN_TEXT);
                                                break;
                                            case 66:
                                                parser.serializer(accessgetValueOverridejd.NO_WORD_BOUNDARY);
                                                break;
                                            case 67:
                                                throw new PatternSyntaxException("invalid escape sequence", "\\C");
                                            default:
                                                pruneVar.IconCompatParcelizer = i30;
                                                inputMethodSessioncreateInputConnection11Write = parser.write(accessgetValueOverridejd.CHAR_CLASS);
                                                inputMethodSessioncreateInputConnection11Write.RemoteActionCompatParcelizer = parser.read;
                                                if (!pruneVar.write("\\p")) {
                                                    onfling = new onFling(0);
                                                    if (parser.IconCompatParcelizer(pruneVar, onfling)) {
                                                        inputMethodSessioncreateInputConnection11Write.MediaSessionCompatQueueItem = onfling.RemoteActionCompatParcelizer();
                                                        parser.serializer(inputMethodSessioncreateInputConnection11Write);
                                                    } else {
                                                        onfling2 = new onFling(0);
                                                        if (parser.read(pruneVar, onfling2)) {
                                                            inputMethodSessioncreateInputConnection11Write.MediaSessionCompatQueueItem = onfling2.RemoteActionCompatParcelizer();
                                                            parser.serializer(inputMethodSessioncreateInputConnection11Write);
                                                        } else {
                                                            pruneVar.IconCompatParcelizer = i30;
                                                            parser.write(inputMethodSessioncreateInputConnection11Write);
                                                            parser.read(Parser.IconCompatParcelizer(pruneVar));
                                                        }
                                                    }
                                                } else {
                                                    onfling = new onFling(0);
                                                    if (parser.IconCompatParcelizer(pruneVar, onfling)) {
                                                        inputMethodSessioncreateInputConnection11Write.MediaSessionCompatQueueItem = onfling.RemoteActionCompatParcelizer();
                                                        parser.serializer(inputMethodSessioncreateInputConnection11Write);
                                                    } else {
                                                        onfling2 = new onFling(0);
                                                        if (parser.read(pruneVar, onfling2)) {
                                                            inputMethodSessioncreateInputConnection11Write.MediaSessionCompatQueueItem = onfling2.RemoteActionCompatParcelizer();
                                                            parser.serializer(inputMethodSessioncreateInputConnection11Write);
                                                        } else {
                                                            pruneVar.IconCompatParcelizer = i30;
                                                            parser.write(inputMethodSessioncreateInputConnection11Write);
                                                            parser.read(Parser.IconCompatParcelizer(pruneVar));
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    } else {
                                        parser.serializer(accessgetValueOverridejd.END_TEXT);
                                    }
                                } else {
                                    inputMethodSessioncreateInputConnection11Write = parser.write(accessgetValueOverridejd.CHAR_CLASS);
                                    inputMethodSessioncreateInputConnection11Write.RemoteActionCompatParcelizer = parser.read;
                                    if (!pruneVar.write("\\p") || pruneVar.write("\\P")) {
                                        onfling = new onFling(0);
                                        if (parser.IconCompatParcelizer(pruneVar, onfling)) {
                                            inputMethodSessioncreateInputConnection11Write.MediaSessionCompatQueueItem = onfling.RemoteActionCompatParcelizer();
                                            parser.serializer(inputMethodSessioncreateInputConnection11Write);
                                        } else {
                                            onfling2 = new onFling(0);
                                            if (parser.read(pruneVar, onfling2)) {
                                                inputMethodSessioncreateInputConnection11Write.MediaSessionCompatQueueItem = onfling2.RemoteActionCompatParcelizer();
                                                parser.serializer(inputMethodSessioncreateInputConnection11Write);
                                            } else {
                                                pruneVar.IconCompatParcelizer = i30;
                                                parser.write(inputMethodSessioncreateInputConnection11Write);
                                                parser.read(Parser.IconCompatParcelizer(pruneVar));
                                            }
                                        }
                                    } else {
                                        onfling2 = new onFling(0);
                                        if (parser.read(pruneVar, onfling2)) {
                                            inputMethodSessioncreateInputConnection11Write.MediaSessionCompatQueueItem = onfling2.RemoteActionCompatParcelizer();
                                            parser.serializer(inputMethodSessioncreateInputConnection11Write);
                                        } else {
                                            pruneVar.IconCompatParcelizer = i30;
                                            parser.write(inputMethodSessioncreateInputConnection11Write);
                                            parser.read(Parser.IconCompatParcelizer(pruneVar));
                                        }
                                    }
                                }
                                i2 = i28;
                            } else if (iWrite != 123) {
                                if (iWrite != 124) {
                                    switch (iWrite) {
                                        case 40:
                                            if ((parser.read & 64) != 0 && pruneVar2.write("(?")) {
                                                int i32 = pruneVar2.IconCompatParcelizer;
                                                String strMediaMetadataCompat4 = pruneVar2.MediaMetadataCompat();
                                                if (strMediaMetadataCompat4.startsWith("(?P<")) {
                                                    int iIndexOf3 = strMediaMetadataCompat4.indexOf(62);
                                                    if (iIndexOf3 >= 0) {
                                                        String strSubstring2 = strMediaMetadataCompat4.substring(4, iIndexOf3);
                                                        pruneVar2.IconCompatParcelizer = strSubstring2.length() + pruneVar2.IconCompatParcelizer;
                                                        pruneVar2.write(i7);
                                                        if (!strSubstring2.isEmpty()) {
                                                            for (int i33 = 0; i33 < strSubstring2.length(); i33++) {
                                                                char cCharAt = strSubstring2.charAt(i33);
                                                                if (cCharAt == '_' || debugInspectorInfo.write(cCharAt)) {
                                                                }
                                                            }
                                                            InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Serializer = parser.serializer(accessgetValueOverridejd.LEFT_PAREN);
                                                            int i34 = parser.serializer + 1;
                                                            parser.serializer = i34;
                                                            inputMethodSessioncreateInputConnection11Serializer.read = i34;
                                                            if (map.put(strSubstring2, Integer.valueOf(i34)) == null) {
                                                                inputMethodSessioncreateInputConnection11Serializer.RatingCompat = strSubstring2;
                                                            } else {
                                                                throw new PatternSyntaxException("duplicate capture group name", strSubstring2);
                                                            }
                                                            break;
                                                        }
                                                        throw new PatternSyntaxException("invalid named capture", strMediaMetadataCompat4.substring(0, iIndexOf3));
                                                    }
                                                    throw new PatternSyntaxException("invalid named capture", strMediaMetadataCompat4);
                                                }
                                                pruneVar2.write(i8);
                                                int i35 = parser.read;
                                                int i36 = 1;
                                                while (true) {
                                                    z = false;
                                                    while (true) {
                                                        if (pruneVar2.RemoteActionCompatParcelizer()) {
                                                            iSerializer4 = pruneVar2.serializer();
                                                            if (iSerializer4 != 41) {
                                                                if (iSerializer4 != 45) {
                                                                    if (iSerializer4 != 58) {
                                                                        if (iSerializer4 == 85) {
                                                                            i35 |= 32;
                                                                        } else if (iSerializer4 == 105) {
                                                                            i35 |= 1;
                                                                        } else if (iSerializer4 == 109) {
                                                                            i35 &= -17;
                                                                        } else if (iSerializer4 == 115) {
                                                                            i35 |= 8;
                                                                        }
                                                                        z = true;
                                                                    }
                                                                } else if (i36 >= 0) {
                                                                    i35 = ~i35;
                                                                    i36 = i10;
                                                                }
                                                            }
                                                        }
                                                        throw new PatternSyntaxException("invalid or unsupported Perl syntax", pruneVar2.IconCompatParcelizer(i32));
                                                    }
                                                }
                                                if (i36 < 0) {
                                                    if (!z) {
                                                        throw new PatternSyntaxException("invalid or unsupported Perl syntax", pruneVar2.IconCompatParcelizer(i32));
                                                    }
                                                    i35 = ~i35;
                                                }
                                                if (iSerializer4 == 58) {
                                                    parser.serializer(accessgetValueOverridejd.LEFT_PAREN);
                                                }
                                                parser.read = i35;
                                            } else {
                                                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Serializer2 = parser.serializer(accessgetValueOverridejd.LEFT_PAREN);
                                                int i37 = parser.serializer + 1;
                                                parser.serializer = i37;
                                                inputMethodSessioncreateInputConnection11Serializer2.read = i37;
                                                pruneVar2.write(1);
                                            }
                                            break;
                                        case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                            parser.RemoteActionCompatParcelizer();
                                            if (parser.IconCompatParcelizer()) {
                                                parser.serializer();
                                            }
                                            parser.write();
                                            if (accessgetonallconnectionsclosedp.size() >= i8) {
                                                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Serializer3 = parser.serializer();
                                                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Serializer4 = parser.serializer();
                                                if (inputMethodSessioncreateInputConnection11Serializer4.MediaMetadataCompat == accessgetValueOverridejd.LEFT_PAREN) {
                                                    parser.read = inputMethodSessioncreateInputConnection11Serializer4.RemoteActionCompatParcelizer;
                                                    if (inputMethodSessioncreateInputConnection11Serializer4.read == 0) {
                                                        parser.serializer(inputMethodSessioncreateInputConnection11Serializer3);
                                                    } else {
                                                        inputMethodSessioncreateInputConnection11Serializer4.MediaMetadataCompat = accessgetValueOverridejd.CAPTURE;
                                                        inputMethodSessioncreateInputConnection11Serializer4.MediaBrowserCompatMediaItem = new InputMethodSessioncreateInputConnection11[]{inputMethodSessioncreateInputConnection11Serializer3};
                                                        parser.serializer(inputMethodSessioncreateInputConnection11Serializer4);
                                                    }
                                                    pruneVar2.write(1);
                                                } else {
                                                    throw new PatternSyntaxException("missing closing )", str2);
                                                }
                                            } else {
                                                throw new PatternSyntaxException("regexp/syntax: internal error", "stack underflow");
                                            }
                                            break;
                                        case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        case 43:
                                            int i110 = i10;
                                            pruneVar = pruneVar2;
                                            int i111 = pruneVar.IconCompatParcelizer;
                                            iSerializer = pruneVar.serializer();
                                            if (iSerializer != 42) {
                                                accessgetvalueoverridejd = accessgetValueOverridejd.STAR;
                                            } else if (iSerializer != 43) {
                                                accessgetvalueoverridejd = accessgetValueOverridejd.PLUS;
                                            } else {
                                                if (iSerializer != 63) {
                                                    accessgetvalueoverridejd2 = null;
                                                } else {
                                                    accessgetvalueoverridejd = accessgetValueOverridejd.QUEST;
                                                }
                                                i = i110;
                                                parser.RemoteActionCompatParcelizer(accessgetvalueoverridejd2, i12, s, i111, pruneVar, i11);
                                                i11 = i111;
                                                continue;
                                            }
                                            accessgetvalueoverridejd2 = accessgetvalueoverridejd;
                                            i = i110;
                                            parser.RemoteActionCompatParcelizer(accessgetvalueoverridejd2, i12, s, i111, pruneVar, i11);
                                            i11 = i111;
                                            continue;
                                        default:
                                            parser.read(pruneVar2.serializer());
                                            break;
                                    }
                                } else {
                                    parser.RemoteActionCompatParcelizer();
                                    if (!parser.IconCompatParcelizer()) {
                                        parser.serializer(accessgetValueOverridejd.VERTICAL_BAR);
                                    }
                                    pruneVar2.write(1);
                                }
                                i = i10;
                                i11 = i;
                                pruneVar = pruneVar2;
                            } else {
                                int i38 = pruneVar2.IconCompatParcelizer;
                                if (pruneVar2.RemoteActionCompatParcelizer() && pruneVar2.write('{')) {
                                    pruneVar2.write(1);
                                    int i39 = Parser.read(pruneVar2);
                                    if (i39 != i10 && pruneVar2.RemoteActionCompatParcelizer()) {
                                        if (pruneVar2.write(',')) {
                                            pruneVar2.write(1);
                                            if (pruneVar2.RemoteActionCompatParcelizer()) {
                                                if (pruneVar2.write('}')) {
                                                    i5 = i10;
                                                } else {
                                                    i5 = Parser.read(pruneVar2);
                                                    if (i5 == i10) {
                                                    }
                                                }
                                            }
                                            i4 = i10;
                                        } else {
                                            i5 = i39;
                                        }
                                        if (pruneVar2.RemoteActionCompatParcelizer() && pruneVar2.write('}')) {
                                            pruneVar2.write(1);
                                            if (i39 < 0 || i39 > 1000 || i5 == -2 || i5 > 1000 || (i5 >= 0 && i39 > i5)) {
                                                throw new PatternSyntaxException("invalid repeat count", pruneVar2.IconCompatParcelizer(i38));
                                            }
                                            i4 = (i39 << 16) | (i5 & 65535);
                                        } else {
                                            i4 = i10;
                                        }
                                    } else {
                                        i4 = i10;
                                    }
                                } else {
                                    i4 = i10;
                                }
                                if (i4 < 0) {
                                    pruneVar2.IconCompatParcelizer = i38;
                                    parser.read(pruneVar2.serializer());
                                } else {
                                    i12 = i4 >> 16;
                                    short s2 = (short) (i4 & 65535);
                                    parser.RemoteActionCompatParcelizer(accessgetValueOverridejd.REPEAT, i12, s2, i38, pruneVar2, i11);
                                    s = s2;
                                }
                                i11 = i38;
                                i = i10;
                                pruneVar = pruneVar2;
                            }
                            i = i2;
                        }
                        pruneVar2 = pruneVar;
                        i10 = i;
                        i8 = 2;
                        i7 = 5;
                    } else {
                        i = i10;
                        pruneVar = pruneVar2;
                        if ((parser.read & 8) != 0) {
                            parser.serializer(accessgetValueOverridejd.ANY_CHAR);
                        } else {
                            parser.serializer(accessgetValueOverridejd.ANY_CHAR_NOT_NL);
                        }
                        pruneVar.write(1);
                    }
                    i11 = i;
                    pruneVar2 = pruneVar;
                    i10 = i;
                    i8 = 2;
                    i7 = 5;
                } else {
                    parser.RemoteActionCompatParcelizer();
                    if (parser.IconCompatParcelizer()) {
                        parser.serializer();
                    }
                    parser.write();
                    if (accessgetonallconnectionsclosedp.size() == 1) {
                        ((InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(0)).MediaDescriptionCompat = map;
                        inputMethodSessioncreateInputConnection11 = (InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(0);
                    } else {
                        throw new PatternSyntaxException("missing closing )", str2);
                    }
                }
            }
        }
        int i40 = inputMethodSessioncreateInputConnection11.read();
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write3 = accessgetNameFallbackjd.write(inputMethodSessioncreateInputConnection11);
        onInfiniteOperation oninfiniteoperation = new onInfiniteOperation();
        isActive isactive = new isActive(0);
        isactive.RemoteActionCompatParcelizer = new onSingleTapUp[10];
        isactive.write = 0;
        isactive.read = 2;
        oninfiniteoperation.write = isactive;
        oninfiniteoperation.write(5);
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsSerializer = oninfiniteoperation.serializer(inputMethodSessioncreateInputConnection11Write3);
        isActive isactive2 = (isActive) oninfiniteoperation.write;
        isactive2.serializer(infiniteAnimationPolicyDefaultImplsSerializer.RemoteActionCompatParcelizer, oninfiniteoperation.write(6).serializer);
        isactive2.serializer = infiniteAnimationPolicyDefaultImplsSerializer.serializer;
        InspectableModifierEnd inspectableModifierEnd = new InspectableModifierEnd(str, isactive2, i40, false);
        StringBuilder sb = new StringBuilder();
        int i41 = isactive2.serializer;
        onSingleTapUp onsingletapup = ((onSingleTapUp[]) isactive2.RemoteActionCompatParcelizer)[i41];
        while (true) {
            int i42 = onsingletapup.IconCompatParcelizer;
            if (i42 != 7 && i42 != 3) {
                if (8 <= i42 && i42 <= 11 && onsingletapup.read.length == 1) {
                    while (true) {
                        int i43 = onsingletapup.IconCompatParcelizer;
                        if (8 <= i43 && i43 <= 11) {
                            int[] iArr6 = onsingletapup.read;
                            if (iArr6.length == 1 && (onsingletapup.write & 1) == 0) {
                                sb.appendCodePoint(iArr6[0]);
                                int i44 = onsingletapup.RemoteActionCompatParcelizer;
                                int i45 = i44;
                                onsingletapup = ((onSingleTapUp[]) isactive2.RemoteActionCompatParcelizer)[i44];
                                while (true) {
                                    int i46 = onsingletapup.IconCompatParcelizer;
                                    if (i46 == 7 || i46 == 3) {
                                        onsingletapup = ((onSingleTapUp[]) isactive2.RemoteActionCompatParcelizer)[i45];
                                        i45 = onsingletapup.RemoteActionCompatParcelizer;
                                    }
                                }
                            }
                        }
                    }
                }
                String string = sb.toString();
                inspectableModifierEnd.MediaDescriptionCompat = string;
                try {
                    string.getBytes(com.adjust.sdk.Constants.ENCODING);
                    if (!inspectableModifierEnd.MediaDescriptionCompat.isEmpty()) {
                        inspectableModifierEnd.RatingCompat = inspectableModifierEnd.MediaDescriptionCompat.codePointAt(0);
                    }
                    return new InspectableModifier(str, inspectableModifierEnd);
                } catch (UnsupportedEncodingException unused) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("can't happen");
                    return null;
                }
            }
            onsingletapup = ((onSingleTapUp[]) isactive2.RemoteActionCompatParcelizer)[i41];
            i41 = onsingletapup.RemoteActionCompatParcelizer;
        }
    }
}
