package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.internal.measurement.zzz;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class getNestedScrollNodeui implements getDispatcher {
    public final int[] IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final getOnPreKeyEvent MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final int[] MediaSessionCompatQueueItem;
    public final onInterceptKeyBeforeSoftKeyboard MediaSessionCompatResultReceiverWrapper;
    public final int RatingCompat;
    public final Object[] read;
    public final int write;
    public static final int[] serializer = new int[0];
    public static final Unsafe RemoteActionCompatParcelizer = resetDispatcherFields.serializer();

    public static int IconCompatParcelizer(int i) {
        return (i >>> 20) & 255;
    }

    public static final int serializer(byte[] bArr, int i, int i2, getNestedCoroutineScope getnestedcoroutinescope, Class cls, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        getNestedCoroutineScope getnestedcoroutinescope2 = getNestedCoroutineScope.zza;
        switch (getnestedcoroutinescope.ordinal()) {
            case 0:
                ismetapressedzmokqxo.read = Double.valueOf(Double.longBitsToDouble(getOnKeyEvent.read(i, bArr)));
                return i + 8;
            case 1:
                ismetapressedzmokqxo.read = Float.valueOf(Float.intBitsToFloat(getOnKeyEvent.RemoteActionCompatParcelizer(i, bArr)));
                return i + 4;
            case 2:
            case 3:
                int iSerializer = getOnKeyEvent.serializer(bArr, i, ismetapressedzmokqxo);
                ismetapressedzmokqxo.read = Long.valueOf(ismetapressedzmokqxo.write);
                return iSerializer;
            case 4:
            case 12:
            case 13:
                int iWrite = getOnKeyEvent.write(bArr, i, ismetapressedzmokqxo);
                ismetapressedzmokqxo.read = Integer.valueOf(ismetapressedzmokqxo.serializer);
                return iWrite;
            case 5:
            case 15:
                ismetapressedzmokqxo.read = Long.valueOf(getOnKeyEvent.read(i, bArr));
                return i + 8;
            case 6:
            case 14:
                ismetapressedzmokqxo.read = Integer.valueOf(getOnKeyEvent.RemoteActionCompatParcelizer(i, bArr));
                return i + 4;
            case 7:
                int iSerializer2 = getOnKeyEvent.serializer(bArr, i, ismetapressedzmokqxo);
                ismetapressedzmokqxo.read = Boolean.valueOf(ismetapressedzmokqxo.write != 0);
                return iSerializer2;
            case 8:
                return getOnKeyEvent.read(bArr, i, ismetapressedzmokqxo);
            case 9:
            default:
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("unsupported field type.");
                return 0;
            case 10:
                getDispatcher getdispatcherIconCompatParcelizer = setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(cls);
                SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer = getdispatcherIconCompatParcelizer.RemoteActionCompatParcelizer();
                int iSerializer3 = getOnKeyEvent.serializer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer, getdispatcherIconCompatParcelizer, bArr, i, i2, ismetapressedzmokqxo);
                getdispatcherIconCompatParcelizer.IconCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer);
                ismetapressedzmokqxo.read = softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer;
                return iSerializer3;
            case 11:
                return getOnKeyEvent.RemoteActionCompatParcelizer(bArr, i, ismetapressedzmokqxo);
            case 16:
                int iWrite2 = getOnKeyEvent.write(bArr, i, ismetapressedzmokqxo);
                ismetapressedzmokqxo.read = Integer.valueOf(getGraphicModalMaxHeightDpannotations.IconCompatParcelizer(ismetapressedzmokqxo.serializer));
                return iWrite2;
            case 17:
                int iSerializer4 = getOnKeyEvent.serializer(bArr, i, ismetapressedzmokqxo);
                ismetapressedzmokqxo.read = Long.valueOf(getGraphicModalMaxHeightDpannotations.read(ismetapressedzmokqxo.write));
                return iSerializer4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x0257  */
    /* JADX WARN: Code duplicated, block: B:128:0x026e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0271  */
    public static getNestedScrollNodeui write(NestedScrollDispatcherdispatchPostFling1 nestedScrollDispatcherdispatchPostFling1, onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard, onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard2) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int i20;
        int i21;
        int iObjectFieldOffset2;
        Field field;
        int i22;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field field2;
        int i27;
        Object obj2;
        Field field3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        NestedScrollDispatcherdispatchPostFling1 nestedScrollDispatcherdispatchPostFling2 = nestedScrollDispatcherdispatchPostFling1;
        if (!(nestedScrollDispatcherdispatchPostFling2 instanceof NestedScrollDispatcherdispatchPostFling1)) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
            return null;
        }
        String str = nestedScrollDispatcherdispatchPostFling2.IconCompatParcelizer;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt3 = str.charAt(i);
        if (iCharAt3 >= 55296) {
            int i34 = iCharAt3 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = str.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt3 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt3 == 0) {
            i4 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            i6 = 0;
            i5 = 0;
            iArr = serializer;
            i2 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt4 = str.charAt(i33);
            if (iCharAt4 >= 55296) {
                int i37 = iCharAt4 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    cCharAt8 = str.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                iCharAt4 = i37 | (cCharAt8 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int iCharAt5 = str.charAt(i36);
            if (iCharAt5 >= 55296) {
                int i40 = iCharAt5 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    cCharAt7 = str.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                iCharAt5 = i40 | (cCharAt7 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int iCharAt6 = str.charAt(i39);
            if (iCharAt6 >= 55296) {
                int i43 = iCharAt6 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    cCharAt6 = str.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                iCharAt6 = i43 | (cCharAt6 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int iCharAt7 = str.charAt(i42);
            if (iCharAt7 >= 55296) {
                int i46 = iCharAt7 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    cCharAt5 = str.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                iCharAt7 = i46 | (cCharAt5 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            iCharAt = str.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    cCharAt4 = str.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            iCharAt2 = str.charAt(i48);
            if (iCharAt2 >= 55296) {
                int i52 = iCharAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    cCharAt3 = str.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                iCharAt2 = i52 | (cCharAt3 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int iCharAt8 = str.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i8 = i54 + 1;
                    cCharAt2 = str.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i8;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i8;
            }
            int i57 = i54 + 1;
            int iCharAt9 = str.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i7 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i7;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i7;
            }
            int i60 = iCharAt4 + iCharAt4 + iCharAt5;
            i2 = iCharAt4;
            i33 = i57;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i3 = iCharAt6;
            i4 = i60;
            i5 = iCharAt9;
            i6 = iCharAt7;
        }
        Unsafe unsafe = RemoteActionCompatParcelizer;
        Object[] objArr = nestedScrollDispatcherdispatchPostFling2.write;
        Class<?> cls = nestedScrollDispatcherdispatchPostFling2.serializer.getClass();
        int i61 = i5 + iCharAt2;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt + iCharAt];
        int i62 = i5;
        int i63 = i61;
        int i64 = 0;
        int i65 = 0;
        while (i33 < length) {
            int i66 = i33 + 1;
            int iCharAt10 = str.charAt(i33);
            if (iCharAt10 >= c) {
                int i67 = iCharAt10 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i30 = i68 + 1;
                    cCharAt12 = str.charAt(i68);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i67 |= (cCharAt12 & 8191) << i69;
                    i69 += 13;
                    i68 = i30;
                }
                iCharAt10 = i67 | (cCharAt12 << i69);
                i15 = i30;
            } else {
                i15 = i66;
            }
            int i70 = i15 + 1;
            int iCharAt11 = str.charAt(i15);
            if (iCharAt11 >= c) {
                int i71 = iCharAt11 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i29 = i72 + 1;
                    cCharAt11 = str.charAt(i72);
                    i16 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i73;
                    i73 += 13;
                    i72 = i29;
                    length = i16;
                }
                iCharAt11 = i71 | (cCharAt11 << i73);
                i17 = i29;
            } else {
                i16 = length;
                i17 = i70;
            }
            if ((iCharAt11 & androidx.compose.ui.graphics.Fields.RotationZ) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            int i74 = iCharAt11 & 255;
            int i75 = i6;
            int i76 = iCharAt11 & androidx.compose.ui.graphics.Fields.CameraDistance;
            int i77 = i3;
            if (i74 >= 51) {
                int i78 = i17 + 1;
                int iCharAt12 = str.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = 13;
                    while (true) {
                        i28 = i78 + 1;
                        cCharAt10 = str.charAt(i78);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i80;
                        i80 += 13;
                        i78 = i28;
                        c2 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i80);
                    i78 = i28;
                }
                int i81 = i74 - 51;
                int i82 = i78;
                if (i81 == 9 || i81 == 17) {
                    i25 = i4 + 1;
                    int i83 = i64 / 3;
                    objArr2[i83 + i83 + 1] = objArr[i4];
                } else {
                    if (i81 == 12) {
                        if (nestedScrollDispatcherdispatchPostFling1.serializer() == 1 || i76 != 0) {
                            i25 = i4 + 1;
                            int i84 = i64 / 3;
                            objArr2[i84 + i84 + 1] = objArr[i4];
                        } else {
                            i76 = 0;
                        }
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArr[i26];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = read(cls, (String) obj);
                        objArr[i26] = field2;
                    }
                    int i85 = i76;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(field2);
                    i27 = i26 + 1;
                    obj2 = objArr[i27];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = read(cls, (String) obj2);
                        objArr[i27] = field3;
                    }
                    i18 = i4;
                    i76 = i85;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(field3);
                    iArr2 = iArr2;
                    i21 = 0;
                    i20 = i82;
                }
                i4 = i25;
                i26 = iCharAt12 + iCharAt12;
                obj = objArr[i26];
                if (obj instanceof Field) {
                    field2 = (Field) obj;
                } else {
                    field2 = read(cls, (String) obj);
                    objArr[i26] = field2;
                }
                int i86 = i76;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(field2);
                i27 = i26 + 1;
                obj2 = objArr[i27];
                if (obj2 instanceof Field) {
                    field3 = (Field) obj2;
                } else {
                    field3 = read(cls, (String) obj2);
                    objArr[i27] = field3;
                }
                i18 = i4;
                i76 = i86;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(field3);
                iArr2 = iArr2;
                i21 = 0;
                i20 = i82;
            } else {
                i18 = i4 + 1;
                Field field4 = read(cls, (String) objArr[i4]);
                if (i74 == 9 || i74 == 17) {
                    iArr2 = iArr2;
                    int i87 = i64 / 3;
                    objArr2[i87 + i87 + 1] = field4.getType();
                } else {
                    if (i74 == 27) {
                        i23 = 1;
                        i24 = i4 + 2;
                    } else if (i74 == 49) {
                        i24 = i4 + 2;
                        i23 = 1;
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        iArr2 = iArr2;
                        if (nestedScrollDispatcherdispatchPostFling1.serializer() == 1 || i76 != 0) {
                            i24 = i4 + 2;
                            int i88 = i64 / 3;
                            objArr2[i88 + i88 + 1] = objArr[i18];
                            i18 = i24;
                        } else {
                            i76 = 0;
                        }
                    } else if (i74 == 50) {
                        int i89 = i4 + 2;
                        int i90 = i62 + 1;
                        iArr[i62] = i64;
                        int i91 = i64 / 3;
                        int i92 = i91 + i91;
                        objArr2[i92] = objArr[i18];
                        if (i76 != 0) {
                            objArr2[i92 + 1] = objArr[i89];
                            i18 = i4 + 3;
                        } else {
                            i18 = i89;
                            i76 = 0;
                        }
                        i62 = i90;
                        iArr2 = iArr2;
                    } else {
                        iArr2 = iArr2;
                    }
                    int i93 = i64 / 3;
                    objArr2[i93 + i93 + i23] = objArr[i18];
                    i18 = i24;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(field4);
                if ((iCharAt11 & androidx.compose.ui.graphics.Fields.TransformOrigin) == 0 || i74 > 17) {
                    iObjectFieldOffset = 1048575;
                    i19 = 0;
                } else {
                    int i94 = i17 + 1;
                    int iCharAt13 = str.charAt(i17);
                    if (iCharAt13 >= 55296) {
                        int i95 = iCharAt13 & 8191;
                        int i96 = 13;
                        while (true) {
                            i22 = i94 + 1;
                            cCharAt9 = str.charAt(i94);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i95 |= (cCharAt9 & 8191) << i96;
                            i96 += 13;
                            i94 = i22;
                        }
                        iCharAt13 = i95 | (cCharAt9 << i96);
                        i94 = i22;
                    }
                    int i97 = (iCharAt13 / 32) + i2 + i2;
                    Object obj3 = objArr[i97];
                    if (obj3 instanceof Field) {
                        field = (Field) obj3;
                    } else {
                        field = read(cls, (String) obj3);
                        objArr[i97] = field;
                    }
                    int i98 = i94;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(field);
                    i19 = iCharAt13 % 32;
                    i17 = i98;
                }
                if (i74 >= 18 && i74 <= 49) {
                    iArr[i63] = iObjectFieldOffset3;
                    i63++;
                }
                i20 = i17;
                i21 = i19;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            i33 = i20;
            iArr2[i64] = iCharAt10;
            iArr2[i64 + 1] = iObjectFieldOffset2 | (i74 << 20) | ((iCharAt11 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? 268435456 : 0) | ((iCharAt11 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? 536870912 : 0) | (i76 != 0 ? Integer.MIN_VALUE : 0);
            iArr2[i64 + 2] = (i21 << 20) | iObjectFieldOffset;
            i64 += 3;
            i6 = i75;
            i3 = i77;
            length = i16;
            iArr2 = iArr2;
            i4 = i18;
            c = 55296;
            nestedScrollDispatcherdispatchPostFling2 = nestedScrollDispatcherdispatchPostFling1;
        }
        return new getNestedScrollNodeui(iArr2, objArr2, i3, i6, nestedScrollDispatcherdispatchPostFling2.serializer, iArr, i5, i61, oninterceptkeybeforesoftkeyboard, oninterceptkeybeforesoftkeyboard2);
    }

    public final int IconCompatParcelizer(int i, int i2) {
        int[] iArr = this.IconCompatParcelizer;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void IconCompatParcelizer(Object obj, int i, Object obj2) {
        int[] iArr = this.IconCompatParcelizer;
        int i2 = iArr[i];
        if (read(i2, i, obj2)) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            Unsafe unsafe = RemoteActionCompatParcelizer;
            long j = iRemoteActionCompatParcelizer & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            getDispatcher getdispatcher = read(i);
            if (!read(i2, i, obj)) {
                if (write(object)) {
                    SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer = getdispatcher.RemoteActionCompatParcelizer();
                    getdispatcher.RemoteActionCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer, object);
                    unsafe.putObject(obj, j, softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                resetDispatcherFields.read(iArr[i + 2] & 1048575, i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!write(object2)) {
                SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2 = getdispatcher.RemoteActionCompatParcelizer();
                getdispatcher.RemoteActionCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2, object2);
                unsafe.putObject(obj, j, softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2);
                object2 = softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2;
            }
            getdispatcher.RemoteActionCompatParcelizer(object2, object);
        }
    }

    public final int RemoteActionCompatParcelizer(int i) {
        return this.IconCompatParcelizer[i + 1];
    }

    @Override // o.getDispatcher
    public final SoftwareKeyboardInterceptionModifierKt RemoteActionCompatParcelizer() {
        return (SoftwareKeyboardInterceptionModifierKt) ((SoftwareKeyboardInterceptionModifierKt) this.MediaDescriptionCompat).RemoteActionCompatParcelizer(4);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5 A[RETURN] */
    public final boolean RemoteActionCompatParcelizer(int i, Object obj) {
        int i2 = this.IconCompatParcelizer[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if ((resetDispatcherFields.IconCompatParcelizer(j, obj) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        long j2 = iRemoteActionCompatParcelizer & 1048575;
        switch (IconCompatParcelizer(iRemoteActionCompatParcelizer)) {
            case 0:
                if (Double.doubleToRawLongBits(resetDispatcherFields.serializer.serializer(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(resetDispatcherFields.serializer.write(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (resetDispatcherFields.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (resetDispatcherFields.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (resetDispatcherFields.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (resetDispatcherFields.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (resetDispatcherFields.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return resetDispatcherFields.serializer.read(j2, obj);
            case 8:
                Object objWrite = resetDispatcherFields.write(j2, obj);
                if (objWrite instanceof String) {
                    if (((String) objWrite).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objWrite instanceof onPreviewKeyEvent)) {
                    DrawableTransformation.write();
                    return false;
                }
                if (onPreviewKeyEvent.IconCompatParcelizer.equals(objWrite)) {
                    return false;
                }
                return true;
            case 9:
                if (resetDispatcherFields.write(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (onPreviewKeyEvent.IconCompatParcelizer.equals(resetDispatcherFields.write(j2, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (resetDispatcherFields.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (resetDispatcherFields.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (resetDispatcherFields.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (resetDispatcherFields.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (resetDispatcherFields.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (resetDispatcherFields.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (resetDispatcherFields.write(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                DrawableTransformation.write();
                return false;
        }
    }

    public final void read(Object obj, int i, Object obj2) {
        RemoteActionCompatParcelizer.putObject(obj, RemoteActionCompatParcelizer(i) & 1048575, obj2);
        write(i, obj);
    }

    public final boolean read(int i, int i2, Object obj) {
        return resetDispatcherFields.IconCompatParcelizer((long) (this.IconCompatParcelizer[i2 + 2] & 1048575), obj) == i;
    }

    @Override // o.getDispatcher
    public final boolean read(SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt, SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt2) {
        boolean zRemoteActionCompatParcelizer;
        int i = 0;
        while (true) {
            int[] iArr = this.IconCompatParcelizer;
            if (i < iArr.length) {
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
                long j = iRemoteActionCompatParcelizer & 1048575;
                switch (IconCompatParcelizer(iRemoteActionCompatParcelizer)) {
                    case 0:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i)) {
                            getNestedCoroutineScopeannotations getnestedcoroutinescopeannotations = resetDispatcherFields.serializer;
                            if (Double.doubleToLongBits(getnestedcoroutinescopeannotations.serializer(j, softwareKeyboardInterceptionModifierKt)) == Double.doubleToLongBits(getnestedcoroutinescopeannotations.serializer(j, softwareKeyboardInterceptionModifierKt2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i)) {
                            getNestedCoroutineScopeannotations getnestedcoroutinescopeannotations2 = resetDispatcherFields.serializer;
                            if (Float.floatToIntBits(getnestedcoroutinescopeannotations2.write(j, softwareKeyboardInterceptionModifierKt)) == Float.floatToIntBits(getnestedcoroutinescopeannotations2.write(j, softwareKeyboardInterceptionModifierKt2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i)) {
                            getNestedCoroutineScopeannotations getnestedcoroutinescopeannotations3 = resetDispatcherFields.serializer;
                            if (getnestedcoroutinescopeannotations3.read(j, softwareKeyboardInterceptionModifierKt) == getnestedcoroutinescopeannotations3.read(j, softwareKeyboardInterceptionModifierKt2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && getConnection.RemoteActionCompatParcelizer(resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt), resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && getConnection.RemoteActionCompatParcelizer(resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt), resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && getConnection.RemoteActionCompatParcelizer(resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt), resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (write(softwareKeyboardInterceptionModifierKt, softwareKeyboardInterceptionModifierKt2, i) && getConnection.RemoteActionCompatParcelizer(resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt), resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    case 35:
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case 37:
                    case 38:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case 40:
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    case 43:
                    case 44:
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                    case 47:
                    case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                    case 49:
                        zRemoteActionCompatParcelizer = getConnection.RemoteActionCompatParcelizer(resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt), resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt2));
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        zRemoteActionCompatParcelizer = getConnection.RemoteActionCompatParcelizer(resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt), resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt2));
                        break;
                    case 51:
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (resetDispatcherFields.IconCompatParcelizer(j2, softwareKeyboardInterceptionModifierKt) == resetDispatcherFields.IconCompatParcelizer(j2, softwareKeyboardInterceptionModifierKt2) && getConnection.RemoteActionCompatParcelizer(resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt), resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zRemoteActionCompatParcelizer) {
                    i += 3;
                }
            } else if (softwareKeyboardInterceptionModifierKt.read.equals(softwareKeyboardInterceptionModifierKt2.read)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01e3 A[PHI: r1
  0x01e3: PHI (r1v32 int) = (r1v10 int), (r1v35 int) binds: [B:82:0x01e1, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.getDispatcher
    public final int serializer(SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.IconCompatParcelizer;
            if (i5 >= iArr.length) {
                return softwareKeyboardInterceptionModifierKt.read.hashCode() + (i6 * 53);
            }
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i5);
            int iIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
            int i7 = iArr[i5];
            long j = iRemoteActionCompatParcelizer & 1048575;
            int i8 = 1237;
            int iHashCode = 37;
            switch (iIconCompatParcelizer) {
                case 0:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(resetDispatcherFields.serializer.serializer(j, softwareKeyboardInterceptionModifierKt));
                    Charset charset = accessonPreScrollOzD1aCkjd.write;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(resetDispatcherFields.serializer.write(j, softwareKeyboardInterceptionModifierKt));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    Charset charset2 = accessonPreScrollOzD1aCkjd.write;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    Charset charset3 = accessonPreScrollOzD1aCkjd.write;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    Charset charset4 = accessonPreScrollOzD1aCkjd.write;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean z = resetDispatcherFields.serializer.read(j, softwareKeyboardInterceptionModifierKt);
                    Charset charset5 = accessonPreScrollOzD1aCkjd.write;
                    if (z) {
                        i8 = 1231;
                    }
                    i6 = i8 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objWrite = resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt);
                    if (objWrite != null) {
                        iHashCode = objWrite.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    iFloatToIntBits = resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iFloatToIntBits = resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    Charset charset6 = accessonPreScrollOzD1aCkjd.write;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = resetDispatcherFields.IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = resetDispatcherFields.RemoteActionCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                    Charset charset7 = accessonPreScrollOzD1aCkjd.write;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objWrite2 = resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt);
                    if (objWrite2 != null) {
                        iHashCode = objWrite2.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case 44:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                case 49:
                    i2 = i6 * 53;
                    iFloatToIntBits = resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt)).doubleValue());
                        Charset charset8 = accessonPreScrollOzD1aCkjd.write;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i = i6 * 53;
                        jDoubleToLongBits = IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                        Charset charset9 = accessonPreScrollOzD1aCkjd.write;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i = i6 * 53;
                        jDoubleToLongBits = IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                        Charset charset10 = accessonPreScrollOzD1aCkjd.write;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = serializer(j, softwareKeyboardInterceptionModifierKt);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i = i6 * 53;
                        jDoubleToLongBits = IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                        Charset charset11 = accessonPreScrollOzD1aCkjd.write;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = serializer(j, softwareKeyboardInterceptionModifierKt);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt)).booleanValue();
                        Charset charset12 = accessonPreScrollOzD1aCkjd.write;
                        if (zBooleanValue) {
                            i8 = 1231;
                        }
                        i6 = i8 + i3;
                    }
                    break;
                case 59:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = serializer(j, softwareKeyboardInterceptionModifierKt);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = serializer(j, softwareKeyboardInterceptionModifierKt);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 64:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = serializer(j, softwareKeyboardInterceptionModifierKt);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i = i6 * 53;
                        jDoubleToLongBits = IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                        Charset charset13 = accessonPreScrollOzD1aCkjd.write;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = serializer(j, softwareKeyboardInterceptionModifierKt);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i = i6 * 53;
                        jDoubleToLongBits = IconCompatParcelizer(j, softwareKeyboardInterceptionModifierKt);
                        Charset charset14 = accessonPreScrollOzD1aCkjd.write;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (read(i7, i5, softwareKeyboardInterceptionModifierKt)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = resetDispatcherFields.write(j, softwareKeyboardInterceptionModifierKt).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    public final void serializer(int i, int i2, Object obj, Object obj2) {
        RemoteActionCompatParcelizer.putObject(obj, RemoteActionCompatParcelizer(i2) & 1048575, obj2);
        resetDispatcherFields.read(this.IconCompatParcelizer[i2 + 2] & 1048575, i, obj);
    }

    public final void write(int i, Object obj) {
        int i2 = this.IconCompatParcelizer[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        resetDispatcherFields.read(j, (1 << (i2 >>> 20)) | resetDispatcherFields.IconCompatParcelizer(j, obj), obj);
    }

    public getNestedScrollNodeui(int[] iArr, Object[] objArr, int i, int i2, getOnPreKeyEvent getonprekeyevent, int[] iArr2, int i3, int i4, onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard, onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard2) {
        this.IconCompatParcelizer = iArr;
        this.read = objArr;
        this.write = i;
        this.MediaMetadataCompat = i2;
        this.MediaSessionCompatQueueItem = iArr2;
        this.RatingCompat = i3;
        this.MediaBrowserCompatMediaItem = i4;
        this.MediaSessionCompatResultReceiverWrapper = oninterceptkeybeforesoftkeyboard;
        this.MediaDescriptionCompat = getonprekeyevent;
    }

    public final getDispatcher read(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.read;
        getDispatcher getdispatcher = (getDispatcher) objArr[i3];
        if (getdispatcher != null) {
            return getdispatcher;
        }
        getDispatcher getdispatcherIconCompatParcelizer = setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer((Class) objArr[i3 + 1]);
        objArr[i3] = getdispatcherIconCompatParcelizer;
        return getdispatcherIconCompatParcelizer;
    }

    public static long IconCompatParcelizer(long j, Object obj) {
        return ((Long) resetDispatcherFields.write(j, obj)).longValue();
    }

    public static int serializer(long j, Object obj) {
        return ((Integer) resetDispatcherFields.write(j, obj)).intValue();
    }

    public static boolean write(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof SoftwareKeyboardInterceptionModifierKt) {
            return ((SoftwareKeyboardInterceptionModifierKt) obj).startActivityForResult();
        }
        return true;
    }

    public final Object IconCompatParcelizer(int i, Object obj) {
        getDispatcher getdispatcher = read(i);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        if (!RemoteActionCompatParcelizer(i, obj)) {
            return getdispatcher.RemoteActionCompatParcelizer();
        }
        Object object = RemoteActionCompatParcelizer.getObject(obj, 1048575 & iRemoteActionCompatParcelizer);
        if (write(object)) {
            return object;
        }
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer = getdispatcher.RemoteActionCompatParcelizer();
        if (object != null) {
            getdispatcher.RemoteActionCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer, object);
        }
        return softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0485  */
    /* JADX WARN: Code duplicated, block: B:196:0x055d  */
    /* JADX WARN: Code duplicated, block: B:202:0x057c  */
    @Override // o.getDispatcher
    public final int serializer(getOnPreKeyEvent getonprekeyevent) {
        int i;
        int i2;
        int i3;
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        int iRemoteActionCompatParcelizer;
        int iWrite;
        int size;
        int iRemoteActionCompatParcelizer2;
        int iIconCompatParcelizer3;
        int iIconCompatParcelizer4;
        int iIconCompatParcelizer5;
        Unsafe unsafe = RemoteActionCompatParcelizer;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iRemoteActionCompatParcelizer3 = 0;
        while (true) {
            int[] iArr = this.IconCompatParcelizer;
            if (i7 < iArr.length) {
                int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(i7);
                int iIconCompatParcelizer6 = IconCompatParcelizer(iRemoteActionCompatParcelizer4);
                int i8 = iArr[i7];
                int i9 = iArr[i7 + 2];
                int i10 = i9 & i4;
                if (iIconCompatParcelizer6 <= 17) {
                    if (i10 != i5) {
                        i6 = i10 == i4 ? 0 : unsafe.getInt(getonprekeyevent, i10);
                        i5 = i10;
                    }
                    i = i6;
                    i2 = i5;
                    i3 = 1 << (i9 >>> 20);
                } else {
                    i = i6;
                    i2 = i5;
                    i3 = 0;
                }
                if (iIconCompatParcelizer6 >= Key_androidKt.zzJ.zza()) {
                    Key_androidKt.zzW.zza();
                }
                long j = iRemoteActionCompatParcelizer4 & i4;
                switch (iIconCompatParcelizer6) {
                    case 0:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 8, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 1:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 4, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 2:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            long j2 = unsafe.getLong(getonprekeyevent, j);
                            iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(j2);
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 3:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            long j3 = unsafe.getLong(getonprekeyevent, j);
                            iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(j3);
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 4:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            long j4 = unsafe.getInt(getonprekeyevent, j);
                            iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(j4);
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 5:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 8, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 6:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 4, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 7:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 1, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 8:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            int i11 = i8 << 3;
                            Object object = unsafe.getObject(getonprekeyevent, j);
                            if (object instanceof onPreviewKeyEvent) {
                                int iIconCompatParcelizer7 = KeyInputModifierKt.IconCompatParcelizer(i11);
                                int iRemoteActionCompatParcelizer5 = ((onPreviewKeyEvent) object).RemoteActionCompatParcelizer();
                                iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer5, iRemoteActionCompatParcelizer5, iIconCompatParcelizer7, iRemoteActionCompatParcelizer3);
                            } else {
                                iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i11);
                                iIconCompatParcelizer2 = KeyInputModifierKt.write((String) object);
                                iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                                iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                            }
                        }
                        break;
                    case 9:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            Object object2 = unsafe.getObject(getonprekeyevent, j);
                            getDispatcher getdispatcher = read(i7);
                            onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard = getConnection.write;
                            int iIconCompatParcelizer8 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            int iIconCompatParcelizer9 = ((getOnPreKeyEvent) object2).IconCompatParcelizer(getdispatcher);
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iIconCompatParcelizer9, iIconCompatParcelizer9, iIconCompatParcelizer8, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 10:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            onPreviewKeyEvent onpreviewkeyevent = (onPreviewKeyEvent) unsafe.getObject(getonprekeyevent, j);
                            int iIconCompatParcelizer10 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            int iRemoteActionCompatParcelizer6 = onpreviewkeyevent.RemoteActionCompatParcelizer();
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer6, iRemoteActionCompatParcelizer6, iIconCompatParcelizer10, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 11:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(unsafe.getInt(getonprekeyevent, j), KeyInputModifierKt.IconCompatParcelizer(i8 << 3), iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 12:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            long j5 = unsafe.getInt(getonprekeyevent, j);
                            iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(j5);
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 13:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 4, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 14:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 8, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 15:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            int i12 = unsafe.getInt(getonprekeyevent, j);
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer((i12 + i12) ^ (i12 >> 31), KeyInputModifierKt.IconCompatParcelizer(i8 << 3), iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 16:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            long j6 = unsafe.getLong(getonprekeyevent, j);
                            iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer((j6 + j6) ^ (j6 >> 63));
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 17:
                        if (read(getonprekeyevent, i7, i2, i, i3)) {
                            getOnPreKeyEvent getonprekeyevent2 = (getOnPreKeyEvent) unsafe.getObject(getonprekeyevent, j);
                            getDispatcher getdispatcher2 = read(i7);
                            int iIconCompatParcelizer11 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer = iIconCompatParcelizer11 + iIconCompatParcelizer11;
                            iIconCompatParcelizer2 = getonprekeyevent2.IconCompatParcelizer(getdispatcher2);
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 18:
                        iRemoteActionCompatParcelizer = getConnection.RemoteActionCompatParcelizer(i8, (List) unsafe.getObject(getonprekeyevent, j));
                        iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        break;
                    case 19:
                        iRemoteActionCompatParcelizer = getConnection.read(i8, (List) unsafe.getObject(getonprekeyevent, j));
                        iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard2 = getConnection.write;
                        if (list.size() == 0) {
                            iWrite = 0;
                        } else {
                            iWrite = getConnection.write(list) + (KeyInputModifierKt.IconCompatParcelizer(i8 << 3) * list.size());
                        }
                        iRemoteActionCompatParcelizer3 += iWrite;
                        break;
                    case 21:
                        List list2 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard3 = getConnection.write;
                        size = list2.size();
                        if (size == 0) {
                            iIconCompatParcelizer4 = 0;
                        } else {
                            iRemoteActionCompatParcelizer2 = getConnection.RemoteActionCompatParcelizer(list2);
                            iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer4 = (iIconCompatParcelizer3 * size) + iRemoteActionCompatParcelizer2;
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer4;
                        break;
                    case 22:
                        List list3 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard4 = getConnection.write;
                        size = list3.size();
                        if (size == 0) {
                            iIconCompatParcelizer4 = 0;
                        } else {
                            iRemoteActionCompatParcelizer2 = getConnection.read(list3);
                            iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer4 = (iIconCompatParcelizer3 * size) + iRemoteActionCompatParcelizer2;
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer4;
                        break;
                    case 23:
                        iRemoteActionCompatParcelizer = getConnection.RemoteActionCompatParcelizer(i8, (List) unsafe.getObject(getonprekeyevent, j));
                        iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        break;
                    case 24:
                        iRemoteActionCompatParcelizer = getConnection.read(i8, (List) unsafe.getObject(getonprekeyevent, j));
                        iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard5 = getConnection.write;
                        int size2 = list4.size();
                        if (size2 == 0) {
                            iWrite = 0;
                        } else {
                            iWrite = (KeyInputModifierKt.IconCompatParcelizer(i8 << 3) + 1) * size2;
                        }
                        iRemoteActionCompatParcelizer3 += iWrite;
                        break;
                    case 26:
                        List list5 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard6 = getConnection.write;
                        int size3 = list5.size();
                        if (size3 == 0) {
                            iIconCompatParcelizer4 = 0;
                        } else {
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3) * size3;
                            if (list5 instanceof NestedScrollDispatcher) {
                                NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) list5;
                                for (int i13 = 0; i13 < size3; i13++) {
                                    Object objIconCompatParcelizer = nestedScrollDispatcher.IconCompatParcelizer();
                                    if (objIconCompatParcelizer instanceof onPreviewKeyEvent) {
                                        int iRemoteActionCompatParcelizer7 = ((onPreviewKeyEvent) objIconCompatParcelizer).RemoteActionCompatParcelizer();
                                        iIconCompatParcelizer4 = IconCompatParcelizer.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer7, iRemoteActionCompatParcelizer7, iIconCompatParcelizer4);
                                    } else {
                                        iIconCompatParcelizer4 = KeyInputModifierKt.write((String) objIconCompatParcelizer) + iIconCompatParcelizer4;
                                    }
                                }
                            } else {
                                for (int i14 = 0; i14 < size3; i14++) {
                                    Object obj = list5.get(i14);
                                    if (obj instanceof onPreviewKeyEvent) {
                                        int iRemoteActionCompatParcelizer8 = ((onPreviewKeyEvent) obj).RemoteActionCompatParcelizer();
                                        iIconCompatParcelizer4 = IconCompatParcelizer.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer8, iRemoteActionCompatParcelizer8, iIconCompatParcelizer4);
                                    } else {
                                        iIconCompatParcelizer4 = KeyInputModifierKt.write((String) obj) + iIconCompatParcelizer4;
                                    }
                                }
                            }
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer4;
                        break;
                    case 27:
                        List list6 = (List) unsafe.getObject(getonprekeyevent, j);
                        getDispatcher getdispatcher3 = read(i7);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard7 = getConnection.write;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            iIconCompatParcelizer5 = 0;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3) * size4;
                            for (int i15 = 0; i15 < size4; i15++) {
                                int iIconCompatParcelizer12 = ((getOnPreKeyEvent) list6.get(i15)).IconCompatParcelizer(getdispatcher3);
                                iIconCompatParcelizer5 = IconCompatParcelizer.RemoteActionCompatParcelizer(iIconCompatParcelizer12, iIconCompatParcelizer12, iIconCompatParcelizer5);
                            }
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer5;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard8 = getConnection.write;
                        int size5 = list7.size();
                        if (size5 == 0) {
                            iIconCompatParcelizer4 = 0;
                        } else {
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3) * size5;
                            for (int i16 = 0; i16 < list7.size(); i16++) {
                                int iRemoteActionCompatParcelizer9 = ((onPreviewKeyEvent) list7.get(i16)).RemoteActionCompatParcelizer();
                                iIconCompatParcelizer4 = IconCompatParcelizer.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer9, iRemoteActionCompatParcelizer9, iIconCompatParcelizer4);
                            }
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer4;
                        break;
                    case 29:
                        List list8 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard9 = getConnection.write;
                        size = list8.size();
                        if (size == 0) {
                            iIconCompatParcelizer4 = 0;
                        } else {
                            iRemoteActionCompatParcelizer2 = getConnection.RatingCompat(list8);
                            iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer4 = (iIconCompatParcelizer3 * size) + iRemoteActionCompatParcelizer2;
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer4;
                        break;
                    case 30:
                        List list9 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard10 = getConnection.write;
                        size = list9.size();
                        if (size == 0) {
                            iIconCompatParcelizer4 = 0;
                        } else {
                            iRemoteActionCompatParcelizer2 = getConnection.IconCompatParcelizer(list9);
                            iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer4 = (iIconCompatParcelizer3 * size) + iRemoteActionCompatParcelizer2;
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer4;
                        break;
                    case 31:
                        iRemoteActionCompatParcelizer = getConnection.read(i8, (List) unsafe.getObject(getonprekeyevent, j));
                        iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        break;
                    case 32:
                        iRemoteActionCompatParcelizer = getConnection.RemoteActionCompatParcelizer(i8, (List) unsafe.getObject(getonprekeyevent, j));
                        iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard11 = getConnection.write;
                        size = list10.size();
                        if (size == 0) {
                            iIconCompatParcelizer4 = 0;
                        } else {
                            iRemoteActionCompatParcelizer2 = getConnection.MediaBrowserCompatMediaItem(list10);
                            iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer4 = (iIconCompatParcelizer3 * size) + iRemoteActionCompatParcelizer2;
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer4;
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        List list11 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard12 = getConnection.write;
                        size = list11.size();
                        if (size == 0) {
                            iIconCompatParcelizer4 = 0;
                        } else {
                            iRemoteActionCompatParcelizer2 = getConnection.serializer(list11);
                            iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer4 = (iIconCompatParcelizer3 * size) + iRemoteActionCompatParcelizer2;
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer4;
                        break;
                    case 35:
                        List list12 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard13 = getConnection.write;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(size6, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), size6, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        List list13 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard14 = getConnection.write;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(size7, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), size7, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 37:
                        int iWrite2 = getConnection.write((List) unsafe.getObject(getonprekeyevent, j));
                        if (iWrite2 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iWrite2, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), iWrite2, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 38:
                        int iRemoteActionCompatParcelizer10 = getConnection.RemoteActionCompatParcelizer((List) unsafe.getObject(getonprekeyevent, j));
                        if (iRemoteActionCompatParcelizer10 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer10, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), iRemoteActionCompatParcelizer10, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        int i17 = getConnection.read((List) unsafe.getObject(getonprekeyevent, j));
                        if (i17 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(i17, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), i17, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 40:
                        List list14 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard15 = getConnection.write;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(size8, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), size8, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        List list15 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard16 = getConnection.write;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(size9, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), size9, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        List list16 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard17 = getConnection.write;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(size10, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), size10, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 43:
                        int iRatingCompat = getConnection.RatingCompat((List) unsafe.getObject(getonprekeyevent, j));
                        if (iRatingCompat > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iRatingCompat, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), iRatingCompat, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 44:
                        int iIconCompatParcelizer13 = getConnection.IconCompatParcelizer((List) unsafe.getObject(getonprekeyevent, j));
                        if (iIconCompatParcelizer13 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iIconCompatParcelizer13, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), iIconCompatParcelizer13, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        List list17 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard18 = getConnection.write;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(size11, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), size11, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 46:
                        List list18 = (List) unsafe.getObject(getonprekeyevent, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard19 = getConnection.write;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(size12, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), size12, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 47:
                        int iMediaBrowserCompatMediaItem = getConnection.MediaBrowserCompatMediaItem((List) unsafe.getObject(getonprekeyevent, j));
                        if (iMediaBrowserCompatMediaItem > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), iMediaBrowserCompatMediaItem, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        int iSerializer = getConnection.serializer((List) unsafe.getObject(getonprekeyevent, j));
                        if (iSerializer > 0) {
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iSerializer, KeyInputModifierKt.IconCompatParcelizer(i8 << 3), iSerializer, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 49:
                        List list19 = (List) unsafe.getObject(getonprekeyevent, j);
                        getDispatcher getdispatcher4 = read(i7);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard20 = getConnection.write;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            iIconCompatParcelizer5 = 0;
                        } else {
                            iIconCompatParcelizer5 = 0;
                            for (int i18 = 0; i18 < size13; i18++) {
                                getOnPreKeyEvent getonprekeyevent3 = (getOnPreKeyEvent) list19.get(i18);
                                int iIconCompatParcelizer14 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                                iIconCompatParcelizer5 += getonprekeyevent3.IconCompatParcelizer(getdispatcher4) + iIconCompatParcelizer14 + iIconCompatParcelizer14;
                            }
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer5;
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        int i19 = i7 / 3;
                        getScopeui getscopeui = (getScopeui) unsafe.getObject(getonprekeyevent, j);
                        NestedScrollConnectionDefaultImpls nestedScrollConnectionDefaultImpls = (NestedScrollConnectionDefaultImpls) this.read[i19 + i19];
                        if (getscopeui.isEmpty()) {
                            iIconCompatParcelizer4 = 0;
                        } else {
                            iIconCompatParcelizer4 = 0;
                            for (Map.Entry entry : getscopeui.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                zzz zzzVar = nestedScrollConnectionDefaultImpls.RemoteActionCompatParcelizer;
                                int iIconCompatParcelizer15 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                                int i20 = NestedScrollConnectionDefaultImpls.read(zzzVar, key, value);
                                iIconCompatParcelizer4 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(i20, i20, iIconCompatParcelizer15, iIconCompatParcelizer4);
                            }
                        }
                        iRemoteActionCompatParcelizer3 += iIconCompatParcelizer4;
                        break;
                    case 51:
                        if (read(i8, i7, getonprekeyevent)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 8, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        if (read(i8, i7, getonprekeyevent)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 4, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 53:
                        if (read(i8, i7, getonprekeyevent)) {
                            long jIconCompatParcelizer = IconCompatParcelizer(j, getonprekeyevent);
                            iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(jIconCompatParcelizer);
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 54:
                        if (read(i8, i7, getonprekeyevent)) {
                            long jIconCompatParcelizer2 = IconCompatParcelizer(j, getonprekeyevent);
                            iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(jIconCompatParcelizer2);
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 55:
                        if (read(i8, i7, getonprekeyevent)) {
                            long jSerializer = serializer(j, getonprekeyevent);
                            iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(jSerializer);
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 56:
                        if (read(i8, i7, getonprekeyevent)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 8, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 57:
                        if (read(i8, i7, getonprekeyevent)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 4, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 58:
                        if (read(i8, i7, getonprekeyevent)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 1, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 59:
                        if (read(i8, i7, getonprekeyevent)) {
                            int i21 = i8 << 3;
                            Object object3 = unsafe.getObject(getonprekeyevent, j);
                            if (object3 instanceof onPreviewKeyEvent) {
                                int iIconCompatParcelizer16 = KeyInputModifierKt.IconCompatParcelizer(i21);
                                int iRemoteActionCompatParcelizer11 = ((onPreviewKeyEvent) object3).RemoteActionCompatParcelizer();
                                iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer11, iRemoteActionCompatParcelizer11, iIconCompatParcelizer16, iRemoteActionCompatParcelizer3);
                            } else {
                                iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i21);
                                iIconCompatParcelizer2 = KeyInputModifierKt.write((String) object3);
                                iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                                iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                            }
                        }
                        break;
                    case 60:
                        if (read(i8, i7, getonprekeyevent)) {
                            Object object4 = unsafe.getObject(getonprekeyevent, j);
                            getDispatcher getdispatcher5 = read(i7);
                            onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard21 = getConnection.write;
                            int iIconCompatParcelizer17 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            int iIconCompatParcelizer18 = ((getOnPreKeyEvent) object4).IconCompatParcelizer(getdispatcher5);
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iIconCompatParcelizer18, iIconCompatParcelizer18, iIconCompatParcelizer17, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                        if (read(i8, i7, getonprekeyevent)) {
                            onPreviewKeyEvent onpreviewkeyevent2 = (onPreviewKeyEvent) unsafe.getObject(getonprekeyevent, j);
                            int iIconCompatParcelizer19 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            int iRemoteActionCompatParcelizer12 = onpreviewkeyevent2.RemoteActionCompatParcelizer();
                            iRemoteActionCompatParcelizer3 = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer12, iRemoteActionCompatParcelizer12, iIconCompatParcelizer19, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                        if (read(i8, i7, getonprekeyevent)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(serializer(j, getonprekeyevent), KeyInputModifierKt.IconCompatParcelizer(i8 << 3), iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 63:
                        if (read(i8, i7, getonprekeyevent)) {
                            long jSerializer2 = serializer(j, getonprekeyevent);
                            iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(jSerializer2);
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 64:
                        if (read(i8, i7, getonprekeyevent)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 4, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 65:
                        if (read(i8, i7, getonprekeyevent)) {
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer(i8 << 3, 8, iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 66:
                        if (read(i8, i7, getonprekeyevent)) {
                            int iSerializer2 = serializer(j, getonprekeyevent);
                            iRemoteActionCompatParcelizer3 = IconCompatParcelizer.RemoteActionCompatParcelizer((iSerializer2 + iSerializer2) ^ (iSerializer2 >> 31), KeyInputModifierKt.IconCompatParcelizer(i8 << 3), iRemoteActionCompatParcelizer3);
                        }
                        break;
                    case 67:
                        if (read(i8, i7, getonprekeyevent)) {
                            long jIconCompatParcelizer3 = IconCompatParcelizer(j, getonprekeyevent);
                            iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer((jIconCompatParcelizer3 + jIconCompatParcelizer3) ^ (jIconCompatParcelizer3 >> 63));
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                    case 68:
                        if (read(i8, i7, getonprekeyevent)) {
                            getOnPreKeyEvent getonprekeyevent4 = (getOnPreKeyEvent) unsafe.getObject(getonprekeyevent, j);
                            getDispatcher getdispatcher6 = read(i7);
                            int iIconCompatParcelizer20 = KeyInputModifierKt.IconCompatParcelizer(i8 << 3);
                            iIconCompatParcelizer = iIconCompatParcelizer20 + iIconCompatParcelizer20;
                            iIconCompatParcelizer2 = getonprekeyevent4.IconCompatParcelizer(getdispatcher6);
                            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer;
                            iRemoteActionCompatParcelizer3 += iRemoteActionCompatParcelizer;
                        }
                        break;
                }
                i7 += 3;
                i6 = i;
                i5 = i2;
                i4 = 1048575;
            } else {
                return ((SoftwareKeyboardInterceptionModifierKt) getonprekeyevent).read.write() + iRemoteActionCompatParcelizer3;
            }
        }
    }

    public final Object serializer(int i, int i2, Object obj) {
        getDispatcher getdispatcher = read(i2);
        if (!read(i, i2, obj)) {
            return getdispatcher.RemoteActionCompatParcelizer();
        }
        Object object = RemoteActionCompatParcelizer.getObject(obj, RemoteActionCompatParcelizer(i2) & 1048575);
        if (write(object)) {
            return object;
        }
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer = getdispatcher.RemoteActionCompatParcelizer();
        if (object != null) {
            getdispatcher.RemoteActionCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer, object);
        }
        return softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer;
    }

    public final boolean write(SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt, SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt2, int i) {
        return RemoteActionCompatParcelizer(i, softwareKeyboardInterceptionModifierKt) == RemoteActionCompatParcelizer(i, softwareKeyboardInterceptionModifierKt2);
    }

    public final boolean read(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return RemoteActionCompatParcelizer(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final getSwitchCharsetEK5gGoQ write(int i) {
        int i2 = i / 3;
        return (getSwitchCharsetEK5gGoQ) this.read[i2 + i2 + 1];
    }

    public static Field read(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            c8$$ExternalSyntheticOutline0.m(sb, "Field ", str, " for ", name);
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(ff$$ExternalSyntheticOutline0.m(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    @Override // o.getDispatcher
    public final void RemoteActionCompatParcelizer(Object obj, Object obj2) {
        if (!write(obj)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.IconCompatParcelizer;
            if (i >= iArr.length) {
                getConnection.write(obj, obj2);
                return;
            }
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            int iIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
            int i2 = iArr[i];
            long j = iRemoteActionCompatParcelizer & 1048575;
            switch (iIconCompatParcelizer) {
                case 0:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        getNestedCoroutineScopeannotations getnestedcoroutinescopeannotations = resetDispatcherFields.serializer;
                        getnestedcoroutinescopeannotations.read(obj, j, getnestedcoroutinescopeannotations.serializer(j, obj2));
                        write(i, obj);
                    }
                    break;
                case 1:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        getNestedCoroutineScopeannotations getnestedcoroutinescopeannotations2 = resetDispatcherFields.serializer;
                        getnestedcoroutinescopeannotations2.RemoteActionCompatParcelizer(obj, j, getnestedcoroutinescopeannotations2.write(j, obj2));
                        write(i, obj);
                    }
                    break;
                case 2:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.RemoteActionCompatParcelizer(obj, j, resetDispatcherFields.RemoteActionCompatParcelizer(j, obj2));
                        write(i, obj);
                    }
                    break;
                case 3:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.RemoteActionCompatParcelizer(obj, j, resetDispatcherFields.RemoteActionCompatParcelizer(j, obj2));
                        write(i, obj);
                    }
                    break;
                case 4:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.read(j, resetDispatcherFields.IconCompatParcelizer(j, obj2), obj);
                        write(i, obj);
                    }
                    break;
                case 5:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.RemoteActionCompatParcelizer(obj, j, resetDispatcherFields.RemoteActionCompatParcelizer(j, obj2));
                        write(i, obj);
                    }
                    break;
                case 6:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.read(j, resetDispatcherFields.IconCompatParcelizer(j, obj2), obj);
                        write(i, obj);
                    }
                    break;
                case 7:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        getNestedCoroutineScopeannotations getnestedcoroutinescopeannotations3 = resetDispatcherFields.serializer;
                        getnestedcoroutinescopeannotations3.read(obj, j, getnestedcoroutinescopeannotations3.read(j, obj2));
                        write(i, obj);
                    }
                    break;
                case 8:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.RemoteActionCompatParcelizer(j, obj, resetDispatcherFields.write(j, obj2));
                        write(i, obj);
                    }
                    break;
                case 9:
                    write(obj, i, obj2);
                    break;
                case 10:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.RemoteActionCompatParcelizer(j, obj, resetDispatcherFields.write(j, obj2));
                        write(i, obj);
                    }
                    break;
                case 11:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.read(j, resetDispatcherFields.IconCompatParcelizer(j, obj2), obj);
                        write(i, obj);
                    }
                    break;
                case 12:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.read(j, resetDispatcherFields.IconCompatParcelizer(j, obj2), obj);
                        write(i, obj);
                    }
                    break;
                case 13:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.read(j, resetDispatcherFields.IconCompatParcelizer(j, obj2), obj);
                        write(i, obj);
                    }
                    break;
                case 14:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.RemoteActionCompatParcelizer(obj, j, resetDispatcherFields.RemoteActionCompatParcelizer(j, obj2));
                        write(i, obj);
                    }
                    break;
                case 15:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.read(j, resetDispatcherFields.IconCompatParcelizer(j, obj2), obj);
                        write(i, obj);
                    }
                    break;
                case 16:
                    if (RemoteActionCompatParcelizer(i, obj2)) {
                        resetDispatcherFields.RemoteActionCompatParcelizer(obj, j, resetDispatcherFields.RemoteActionCompatParcelizer(j, obj2));
                        write(i, obj);
                    }
                    break;
                case 17:
                    write(obj, i, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case 44:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                case 49:
                    onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer = (onPostFlingRZ2iAVYsuspendImpl) resetDispatcherFields.write(j, obj);
                    onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = (onPostFlingRZ2iAVYsuspendImpl) resetDispatcherFields.write(j, obj2);
                    int size = onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer.size();
                    int size2 = onpostflingrz2iavysuspendimpl.size();
                    if (size > 0 && size2 > 0) {
                        if (!((KeyInputElement) onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer).write) {
                            onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer = onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(size2 + size);
                        }
                        onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer.addAll(onpostflingrz2iavysuspendimpl);
                    }
                    if (size > 0) {
                        onpostflingrz2iavysuspendimpl = onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer;
                    }
                    resetDispatcherFields.RemoteActionCompatParcelizer(j, obj, onpostflingrz2iavysuspendimpl);
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard = getConnection.write;
                    resetDispatcherFields.RemoteActionCompatParcelizer(j, obj, onInterceptKeyBeforeSoftKeyboard.write(resetDispatcherFields.write(j, obj), resetDispatcherFields.write(j, obj2)));
                    break;
                case 51:
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (read(i2, i, obj2)) {
                        resetDispatcherFields.RemoteActionCompatParcelizer(j, obj, resetDispatcherFields.write(j, obj2));
                        resetDispatcherFields.read(iArr[i + 2] & 1048575, i2, obj);
                    }
                    break;
                case 60:
                    IconCompatParcelizer(obj, i, obj2);
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (read(i2, i, obj2)) {
                        resetDispatcherFields.RemoteActionCompatParcelizer(j, obj, resetDispatcherFields.write(j, obj2));
                        resetDispatcherFields.read(iArr[i + 2] & 1048575, i2, obj);
                    }
                    break;
                case 68:
                    IconCompatParcelizer(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v136, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v178 */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r18v0, types: [o.getNestedScrollNodeui] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53, types: [int] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    @Override // o.getDispatcher
    public final void serializer(Object obj, getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq) throws zzll {
        int i;
        ?? r16;
        ?? r5;
        ?? r1;
        Unsafe unsafe = RemoteActionCompatParcelizer;
        boolean z = false;
        int i2 = 1048575;
        ?? r2 = 0;
        int i3 = 0;
        int i4 = 1048575;
        while (true) {
            int[] iArr = this.IconCompatParcelizer;
            if (i3 < iArr.length) {
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i3);
                int iIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
                int i5 = iArr[i3];
                if (iIconCompatParcelizer <= 17) {
                    int i6 = iArr[i3 + 2];
                    int i7 = i6 & i2;
                    if (i7 != i4) {
                        r1 = i7 == i2 ? z : unsafe.getInt(obj, i7);
                        i4 = i7;
                    }
                    r1 = r2;
                    i = i4;
                    r16 = r1;
                    r5 = 1 << (i6 >>> 20);
                } else {
                    i = i4;
                    r16 = r2 == true ? 1 : 0;
                    r5 = z;
                }
                long j = iRemoteActionCompatParcelizer & i2;
                switch (iIconCompatParcelizer) {
                    case 0:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, Double.doubleToRawLongBits(resetDispatcherFields.serializer.serializer(j, obj)));
                        }
                        break;
                    case 1:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, Float.floatToRawIntBits(resetDispatcherFields.serializer.write(j, obj)));
                        }
                        break;
                    case 2:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 3:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 4:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 5:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 6:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 7:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            boolean z2 = resetDispatcherFields.serializer.read(j, obj);
                            KeyInputModifierKt keyInputModifierKt = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
                            keyInputModifierKt.serializer(i5 << 3);
                            keyInputModifierKt.read(z2 ? (byte) 1 : (byte) 0);
                        }
                        break;
                    case 8:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof String) {
                                KeyInputModifierKt keyInputModifierKt2 = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
                                keyInputModifierKt2.serializer((i5 << 3) | 2);
                                keyInputModifierKt2.RemoteActionCompatParcelizer((String) object);
                            } else {
                                ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).RemoteActionCompatParcelizer(i5, (onPreviewKeyEvent) object);
                            }
                        }
                        break;
                    case 9:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            getzenkakuhankaruek5ggoq.read(i5, unsafe.getObject(obj, j), read(i3));
                        }
                        break;
                    case 10:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).RemoteActionCompatParcelizer(i5, (onPreviewKeyEvent) unsafe.getObject(obj, j));
                        }
                        break;
                    case 11:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).serializer(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 12:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 13:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 14:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 15:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            int i8 = unsafe.getInt(obj, j);
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).serializer(i5, (i8 + i8) ^ (i8 >> 31));
                        }
                        break;
                    case 16:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            long j2 = unsafe.getLong(obj, j);
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i5, (j2 + j2) ^ (j2 >> 63));
                        }
                        break;
                    case 17:
                        if (read(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                            getzenkakuhankaruek5ggoq.write(i5, unsafe.getObject(obj, j), read(i3));
                        }
                        break;
                    case 18:
                        getConnection.serializer(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 19:
                        getConnection.read(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 20:
                        getConnection.write(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 21:
                        getConnection.RemoteActionCompatParcelizer(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 22:
                        getConnection.MediaSessionCompatQueueItem(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 23:
                        getConnection.MediaMetadataCompat(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 24:
                        getConnection.PlaybackStateCompatCustomAction(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 25:
                        getConnection.PlaybackStateCompat(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 26:
                        int i9 = iArr[i3];
                        ?? r0 = (List) unsafe.getObject(obj, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard = getConnection.write;
                        if (r0 != 0 && !r0.isEmpty()) {
                            KeyInputModifierKt keyInputModifierKt3 = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
                            if (r0 instanceof NestedScrollDispatcher) {
                                NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) r0;
                                for (?? r6 = z; r6 < r0.size(); r6++) {
                                    Object objIconCompatParcelizer = nestedScrollDispatcher.IconCompatParcelizer();
                                    if (objIconCompatParcelizer instanceof String) {
                                        keyInputModifierKt3.serializer((i9 << 3) | 2);
                                        keyInputModifierKt3.RemoteActionCompatParcelizer((String) objIconCompatParcelizer);
                                    } else {
                                        keyInputModifierKt3.RemoteActionCompatParcelizer(i9, (onPreviewKeyEvent) objIconCompatParcelizer);
                                    }
                                }
                            } else {
                                for (?? r4 = z; r4 < r0.size(); r4++) {
                                    String str = (String) r0.get(r4);
                                    keyInputModifierKt3.serializer((i9 << 3) | 2);
                                    keyInputModifierKt3.RemoteActionCompatParcelizer(str);
                                }
                            }
                        }
                        break;
                    case 27:
                        int i10 = iArr[i3];
                        ?? r3 = (List) unsafe.getObject(obj, j);
                        getDispatcher getdispatcher = read(i3);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard2 = getConnection.write;
                        if (r3 != 0 && !r3.isEmpty()) {
                            for (?? r7 = z; r7 < r3.size(); r7++) {
                                getzenkakuhankaruek5ggoq.read(i10, r3.get(r7), getdispatcher);
                            }
                        }
                        break;
                    case 28:
                        int i11 = iArr[i3];
                        ?? r8 = (List) unsafe.getObject(obj, j);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard3 = getConnection.write;
                        if (r8 != 0 && !r8.isEmpty()) {
                            getzenkakuhankaruek5ggoq.getClass();
                            for (?? r9 = z; r9 < r8.size(); r9++) {
                                ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).RemoteActionCompatParcelizer(i11, (onPreviewKeyEvent) r8.get(r9));
                            }
                        }
                        break;
                    case 29:
                        getConnection.MediaDescriptionCompat(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 30:
                        getConnection.ParcelableVolumeInfo(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 31:
                        getConnection.MediaSessionCompatToken(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 32:
                        getConnection.RatingCompat(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 33:
                        getConnection.MediaBrowserCompatMediaItem(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        getConnection.IconCompatParcelizer(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, z);
                        break;
                    case 35:
                        getConnection.serializer(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        getConnection.read(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case 37:
                        getConnection.write(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case 38:
                        getConnection.RemoteActionCompatParcelizer(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        getConnection.MediaSessionCompatQueueItem(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case 40:
                        getConnection.MediaMetadataCompat(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        getConnection.PlaybackStateCompatCustomAction(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        getConnection.PlaybackStateCompat(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case 43:
                        getConnection.MediaDescriptionCompat(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case 44:
                        getConnection.ParcelableVolumeInfo(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        getConnection.MediaSessionCompatToken(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case 46:
                        getConnection.RatingCompat(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case 47:
                        getConnection.MediaBrowserCompatMediaItem(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        getConnection.IconCompatParcelizer(iArr[i3], (List) unsafe.getObject(obj, j), getzenkakuhankaruek5ggoq, true);
                        break;
                    case 49:
                        int i12 = iArr[i3];
                        ?? r10 = (List) unsafe.getObject(obj, j);
                        getDispatcher getdispatcher2 = read(i3);
                        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard4 = getConnection.write;
                        if (r10 != 0 && !r10.isEmpty()) {
                            for (?? r11 = z; r11 < r10.size(); r11++) {
                                getzenkakuhankaruek5ggoq.write(i12, r10.get(r11), getdispatcher2);
                            }
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 != null) {
                            int i13 = i3 / 3;
                            zzz zzzVar = ((NestedScrollConnectionDefaultImpls) this.read[i13 + i13]).RemoteActionCompatParcelizer;
                            getzenkakuhankaruek5ggoq.getClass();
                            for (Map.Entry entry : ((getScopeui) object2).entrySet()) {
                                KeyInputModifierKt keyInputModifierKt4 = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
                                keyInputModifierKt4.read(i5, 2);
                                keyInputModifierKt4.serializer(NestedScrollConnectionDefaultImpls.read(zzzVar, entry.getKey(), entry.getValue()));
                                NestedScrollConnectionDefaultImpls.RemoteActionCompatParcelizer(keyInputModifierKt4, zzzVar, entry.getKey(), entry.getValue());
                            }
                        }
                        break;
                    case 51:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, Double.doubleToRawLongBits(((Double) resetDispatcherFields.write(j, obj)).doubleValue()));
                        }
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, Float.floatToRawIntBits(((Float) resetDispatcherFields.write(j, obj)).floatValue()));
                        }
                        break;
                    case 53:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i5, IconCompatParcelizer(j, obj));
                        }
                        break;
                    case 54:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i5, IconCompatParcelizer(j, obj));
                        }
                        break;
                    case 55:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i5, serializer(j, obj));
                        }
                        break;
                    case 56:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, IconCompatParcelizer(j, obj));
                        }
                        break;
                    case 57:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, serializer(j, obj));
                        }
                        break;
                    case 58:
                        if (read(i5, i3, obj)) {
                            boolean zBooleanValue = ((Boolean) resetDispatcherFields.write(j, obj)).booleanValue();
                            KeyInputModifierKt keyInputModifierKt5 = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
                            keyInputModifierKt5.serializer(i5 << 3);
                            keyInputModifierKt5.read(zBooleanValue ? (byte) 1 : (byte) 0);
                        }
                        break;
                    case 59:
                        if (read(i5, i3, obj)) {
                            Object object3 = unsafe.getObject(obj, j);
                            if (object3 instanceof String) {
                                KeyInputModifierKt keyInputModifierKt6 = (KeyInputModifierKt) getzenkakuhankaruek5ggoq.write;
                                keyInputModifierKt6.serializer((i5 << 3) | 2);
                                keyInputModifierKt6.RemoteActionCompatParcelizer((String) object3);
                            } else {
                                ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).RemoteActionCompatParcelizer(i5, (onPreviewKeyEvent) object3);
                            }
                        }
                        break;
                    case 60:
                        if (read(i5, i3, obj)) {
                            getzenkakuhankaruek5ggoq.read(i5, unsafe.getObject(obj, j), read(i3));
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).RemoteActionCompatParcelizer(i5, (onPreviewKeyEvent) unsafe.getObject(obj, j));
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).serializer(i5, serializer(j, obj));
                        }
                        break;
                    case 63:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i5, serializer(j, obj));
                        }
                        break;
                    case 64:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, serializer(j, obj));
                        }
                        break;
                    case 65:
                        if (read(i5, i3, obj)) {
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i5, IconCompatParcelizer(j, obj));
                        }
                        break;
                    case 66:
                        if (read(i5, i3, obj)) {
                            int iSerializer = serializer(j, obj);
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).serializer(i5, (iSerializer + iSerializer) ^ (iSerializer >> 31));
                        }
                        break;
                    case 67:
                        if (read(i5, i3, obj)) {
                            long jIconCompatParcelizer = IconCompatParcelizer(j, obj);
                            ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i5, (jIconCompatParcelizer + jIconCompatParcelizer) ^ (jIconCompatParcelizer >> 63));
                        }
                        break;
                    case 68:
                        if (read(i5, i3, obj)) {
                            getzenkakuhankaruek5ggoq.write(i5, unsafe.getObject(obj, j), read(i3));
                        }
                        break;
                }
                i3 += 3;
                i4 = i;
                r2 = r16;
                z = false;
                i2 = 1048575;
            } else {
                ((SoftwareKeyboardInterceptionModifierKt) obj).read.IconCompatParcelizer(getzenkakuhankaruek5ggoq);
                return;
            }
        }
    }

    @Override // o.getDispatcher
    public final void read(Object obj, byte[] bArr, int i, int i2, isMetaPressedZmokQxo ismetapressedzmokqxo) throws zzmr {
        write(obj, bArr, i, i2, 0, ismetapressedzmokqxo);
    }

    @Override // o.getDispatcher
    public final boolean serializer(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.RatingCompat) {
            int i6 = this.MediaSessionCompatQueueItem[i4];
            int[] iArr = this.IconCompatParcelizer;
            int i7 = iArr[i6];
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = RemoteActionCompatParcelizer.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & iRemoteActionCompatParcelizer) == 0 || read(obj, i6, i, i2, i10)) {
                int iIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
                if (iIconCompatParcelizer != 9 && iIconCompatParcelizer != 17) {
                    if (iIconCompatParcelizer != 27) {
                        if (iIconCompatParcelizer == 60 || iIconCompatParcelizer == 68) {
                            if (!read(i7, i6, obj) || read(i6).serializer(resetDispatcherFields.write(iRemoteActionCompatParcelizer & 1048575, obj))) {
                                i4++;
                                i5 = i;
                                i3 = i2;
                            }
                        } else if (iIconCompatParcelizer != 49) {
                            if (iIconCompatParcelizer != 50) {
                                continue;
                            } else {
                                getScopeui getscopeui = (getScopeui) resetDispatcherFields.write(iRemoteActionCompatParcelizer & 1048575, obj);
                                if (getscopeui.isEmpty()) {
                                    continue;
                                } else {
                                    int i11 = i6 / 3;
                                    if (((getNestedCoroutineScope) ((NestedScrollConnectionDefaultImpls) this.read[i11 + i11]).RemoteActionCompatParcelizer.write).zza() == getParentConnection.MESSAGE) {
                                        getDispatcher getdispatcherIconCompatParcelizer = null;
                                        for (Object obj2 : getscopeui.values()) {
                                            if (getdispatcherIconCompatParcelizer == null) {
                                                getdispatcherIconCompatParcelizer = setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(obj2.getClass());
                                            }
                                            if (!getdispatcherIconCompatParcelizer.serializer(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i4++;
                            i5 = i;
                            i3 = i2;
                        }
                    }
                    List list = (List) resetDispatcherFields.write(iRemoteActionCompatParcelizer & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        getDispatcher getdispatcher = read(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (getdispatcher.serializer(list.get(i12))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!read(obj, i6, i, i2, i10) || read(i6).serializer(resetDispatcherFields.write(iRemoteActionCompatParcelizer & 1048575, obj))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        return true;
    }

    public final void write(Object obj, int i, Object obj2) {
        if (RemoteActionCompatParcelizer(i, obj2)) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            Unsafe unsafe = RemoteActionCompatParcelizer;
            long j = iRemoteActionCompatParcelizer & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.IconCompatParcelizer[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            getDispatcher getdispatcher = read(i);
            if (!RemoteActionCompatParcelizer(i, obj)) {
                if (write(object)) {
                    SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer = getdispatcher.RemoteActionCompatParcelizer();
                    getdispatcher.RemoteActionCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer, object);
                    unsafe.putObject(obj, j, softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                write(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!write(object2)) {
                SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2 = getdispatcher.RemoteActionCompatParcelizer();
                getdispatcher.RemoteActionCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2, object2);
                unsafe.putObject(obj, j, softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2);
                object2 = softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2;
            }
            getdispatcher.RemoteActionCompatParcelizer(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // o.getDispatcher
    public final void IconCompatParcelizer(Object obj) {
        if (!write(obj)) {
            return;
        }
        if (obj instanceof SoftwareKeyboardInterceptionModifierKt) {
            SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = (SoftwareKeyboardInterceptionModifierKt) obj;
            softwareKeyboardInterceptionModifierKt.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ();
            softwareKeyboardInterceptionModifierKt.IconCompatParcelizer = 0;
            softwareKeyboardInterceptionModifierKt.reportFullyDrawn();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.IconCompatParcelizer;
            if (i >= iArr.length) {
                this.MediaSessionCompatResultReceiverWrapper.getClass();
                NestedScrollNode nestedScrollNode = ((SoftwareKeyboardInterceptionModifierKt) obj).read;
                if (nestedScrollNode.MediaSessionCompatQueueItem) {
                    nestedScrollNode.MediaSessionCompatQueueItem = false;
                    return;
                }
                return;
            }
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            int iIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
            long j = iRemoteActionCompatParcelizer & 1048575;
            if (iIconCompatParcelizer != 9) {
                if (iIconCompatParcelizer != 60 && iIconCompatParcelizer != 68) {
                    switch (iIconCompatParcelizer) {
                        case 17:
                            if (RemoteActionCompatParcelizer(i, obj)) {
                                read(i).IconCompatParcelizer(RemoteActionCompatParcelizer.getObject(obj, j));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case 35:
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case 37:
                        case 38:
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case 40:
                        case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        case 43:
                        case 44:
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        case 46:
                        case 47:
                        case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        case 49:
                            KeyInputElement keyInputElement = (KeyInputElement) ((onPostFlingRZ2iAVYsuspendImpl) resetDispatcherFields.write(j, obj));
                            if (keyInputElement.write) {
                                keyInputElement.write = false;
                            }
                            break;
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                            Unsafe unsafe = RemoteActionCompatParcelizer;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((getScopeui) object).serializer = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (read(iArr[i], i, obj)) {
                    read(i).IconCompatParcelizer(RemoteActionCompatParcelizer.getObject(obj, j));
                }
            } else if (RemoteActionCompatParcelizer(i, obj)) {
                read(i).IconCompatParcelizer(RemoteActionCompatParcelizer.getObject(obj, j));
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:403:0x0995  */
    /* JADX WARN: Code duplicated, block: B:404:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:527:0x0d49 A[PHI: r8 r13 r14 r15 r19 r34
  0x0d49: PHI (r8v42 o.NestedScrollNode) = 
  (r8v19 o.NestedScrollNode)
  (r8v20 o.NestedScrollNode)
  (r8v21 o.NestedScrollNode)
  (r8v22 o.NestedScrollNode)
  (r8v23 o.NestedScrollNode)
  (r8v24 o.NestedScrollNode)
  (r8v25 o.NestedScrollNode)
  (r8v35 o.NestedScrollNode)
  (r8v43 o.NestedScrollNode)
 binds: [B:525:0x0d32, B:522:0x0d11, B:519:0x0cf4, B:516:0x0cd8, B:513:0x0cbb, B:510:0x0c9d, B:503:0x0c76, B:501:0x0c69, B:454:0x0b20] A[DONT_GENERATE, DONT_INLINE]
  0x0d49: PHI (r13v31 'this' o.getNestedScrollNodeui) = 
  (r13v8 'this' o.getNestedScrollNodeui)
  (r13v9 'this' o.getNestedScrollNodeui)
  (r13v10 'this' o.getNestedScrollNodeui)
  (r13v11 'this' o.getNestedScrollNodeui)
  (r13v12 'this' o.getNestedScrollNodeui)
  (r13v13 'this' o.getNestedScrollNodeui)
  (r13v14 'this' o.getNestedScrollNodeui)
  (r13v22 'this' o.getNestedScrollNodeui)
  (r13v32 'this' o.getNestedScrollNodeui)
 binds: [B:525:0x0d32, B:522:0x0d11, B:519:0x0cf4, B:516:0x0cd8, B:513:0x0cbb, B:510:0x0c9d, B:503:0x0c76, B:501:0x0c69, B:454:0x0b20] A[DONT_GENERATE, DONT_INLINE]
  0x0d49: PHI (r14v32 java.lang.Object) = 
  (r14v10 java.lang.Object)
  (r14v11 java.lang.Object)
  (r14v12 java.lang.Object)
  (r14v13 java.lang.Object)
  (r14v14 java.lang.Object)
  (r14v15 java.lang.Object)
  (r14v16 java.lang.Object)
  (r14v24 java.lang.Object)
  (r14v33 java.lang.Object)
 binds: [B:525:0x0d32, B:522:0x0d11, B:519:0x0cf4, B:516:0x0cd8, B:513:0x0cbb, B:510:0x0c9d, B:503:0x0c76, B:501:0x0c69, B:454:0x0b20] A[DONT_GENERATE, DONT_INLINE]
  0x0d49: PHI (r15v38 int) = 
  (r15v16 int)
  (r15v17 int)
  (r15v18 int)
  (r15v19 int)
  (r15v20 int)
  (r15v21 int)
  (r15v22 int)
  (r15v30 int)
  (r15v39 int)
 binds: [B:525:0x0d32, B:522:0x0d11, B:519:0x0cf4, B:516:0x0cd8, B:513:0x0cbb, B:510:0x0c9d, B:503:0x0c76, B:501:0x0c69, B:454:0x0b20] A[DONT_GENERATE, DONT_INLINE]
  0x0d49: PHI (r19v15 int) = (r19v1 int), (r19v2 int), (r19v3 int), (r19v4 int), (r19v5 int), (r19v6 int), (r19v7 int), (r19v11 int), (r19v16 int) binds: [B:525:0x0d32, B:522:0x0d11, B:519:0x0cf4, B:516:0x0cd8, B:513:0x0cbb, B:510:0x0c9d, B:503:0x0c76, B:501:0x0c69, B:454:0x0b20] A[DONT_GENERATE, DONT_INLINE]
  0x0d49: PHI (r34v7 int) = (r34v0 int), (r34v0 int), (r34v0 int), (r34v0 int), (r34v0 int), (r34v0 int), (r34v0 int), (r34v3 int), (r34v0 int) binds: [B:525:0x0d32, B:522:0x0d11, B:519:0x0cf4, B:516:0x0cd8, B:513:0x0cbb, B:510:0x0c9d, B:503:0x0c76, B:501:0x0c69, B:454:0x0b20] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:529:0x0d4c  */
    /* JADX WARN: Code duplicated, block: B:532:0x0d5d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final int write(Object obj, byte[] bArr, int i, int i2, int i3, isMetaPressedZmokQxo ismetapressedzmokqxo) throws zzmr {
        int i4;
        int i5;
        Object[] objArr;
        int[] iArr;
        NestedScrollNode nestedScrollNode;
        onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard;
        Unsafe unsafe;
        Object obj2;
        getSwitchCharsetEK5gGoQ getswitchcharsetek5ggoqWrite;
        int i6;
        int iWrite;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iSerializer;
        int i12;
        int i13;
        Object obj3;
        int i14;
        Unsafe unsafe2;
        Object obj4;
        Object[] objArr2;
        int i15;
        getScopeui getscopeui;
        Unsafe unsafe3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Object[] objArr3;
        int i23;
        int i24;
        int i25;
        int iRemoteActionCompatParcelizer;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        isMetaPressedZmokQxo ismetapressedzmokqxo2;
        int i33;
        int i34;
        int iRemoteActionCompatParcelizer2;
        int iSerializer2;
        int i35;
        int iWrite2;
        int i36;
        getNestedScrollNodeui getnestedscrollnodeui = this;
        Object obj5 = obj;
        isMetaPressedZmokQxo ismetapressedzmokqxo3 = ismetapressedzmokqxo;
        if (write(obj)) {
            Unsafe unsafe4 = RemoteActionCompatParcelizer;
            int iWrite3 = i;
            int i37 = 1048575;
            int i38 = 0;
            int i39 = 0;
            int i40 = -1;
            int i41 = 0;
            while (true) {
                int i42 = i41;
                i4 = i37;
                int i43 = i40;
                i5 = i38;
                int iIconCompatParcelizer = i42;
                while (true) {
                    Object[] objArr4 = getnestedscrollnodeui.read;
                    onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard2 = getnestedscrollnodeui.MediaSessionCompatResultReceiverWrapper;
                    NestedScrollNode nestedScrollNode2 = NestedScrollNode.RemoteActionCompatParcelizer;
                    int[] iArr2 = getnestedscrollnodeui.IconCompatParcelizer;
                    Object[] objArr5 = objArr4;
                    if (iWrite3 < i2) {
                        int i44 = iWrite3 + 1;
                        int i45 = bArr[iWrite3];
                        if (i45 < 0) {
                            iWrite = getOnKeyEvent.write(i45, bArr, i44, ismetapressedzmokqxo3);
                            i6 = ismetapressedzmokqxo3.serializer;
                        } else {
                            i6 = i45;
                            iWrite = i44;
                        }
                        int i46 = i6 >>> 3;
                        oninterceptkeybeforesoftkeyboard = oninterceptkeybeforesoftkeyboard2;
                        int i47 = getnestedscrollnodeui.MediaMetadataCompat;
                        int i48 = getnestedscrollnodeui.write;
                        if (i46 > i43) {
                            int i49 = iIconCompatParcelizer / 3;
                            if (i46 < i48 || i46 > i47) {
                                iIconCompatParcelizer = -1;
                            } else {
                                iIconCompatParcelizer = getnestedscrollnodeui.IconCompatParcelizer(i46, i49);
                            }
                        } else if (i46 < i48 || i46 > i47) {
                            iIconCompatParcelizer = -1;
                        } else {
                            iIconCompatParcelizer = getnestedscrollnodeui.IconCompatParcelizer(i46, 0);
                        }
                        if (iIconCompatParcelizer == -1) {
                            objArr = objArr5;
                            i7 = iWrite;
                            i5 = i5;
                            i8 = i4;
                            i43 = i46;
                            iArr = iArr2;
                            nestedScrollNode = nestedScrollNode2;
                            iIconCompatParcelizer = 0;
                            this = getnestedscrollnodeui;
                            i9 = i6;
                            unsafe = unsafe4;
                            obj2 = obj5;
                            i3 = i3;
                        } else {
                            int i50 = i6 & 7;
                            int i51 = iArr2[iIconCompatParcelizer + 1];
                            int iIconCompatParcelizer2 = IconCompatParcelizer(i51);
                            int i52 = i6;
                            long j = i51 & 1048575;
                            i43 = i46;
                            if (iIconCompatParcelizer2 <= 17) {
                                int i53 = iArr2[iIconCompatParcelizer + 2];
                                int i54 = 1 << (i53 >>> 20);
                                int i55 = 1048575;
                                int i56 = i53 & 1048575;
                                if (i56 != i4) {
                                    if (i4 != 1048575) {
                                        unsafe4.putInt(obj5, i4, i5);
                                        i55 = 1048575;
                                    }
                                    i32 = i56;
                                    i31 = i56 == i55 ? 0 : unsafe4.getInt(obj5, i56);
                                } else {
                                    i31 = i5;
                                    i32 = i4;
                                }
                                switch (iIconCompatParcelizer2) {
                                    case 0:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i33 = iWrite;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 != 1) {
                                            i35 = i33;
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo4 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo4;
                                        } else {
                                            resetDispatcherFields.serializer.read(obj, j, Double.longBitsToDouble(getOnKeyEvent.read(i33, bArr)));
                                            iWrite3 = i33 + 8;
                                            i5 = i31 | i54;
                                            i39 = i9;
                                            i4 = i32;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i2 = i2;
                                        }
                                        break;
                                    case 1:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i33 = iWrite;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 != 5) {
                                            i35 = i33;
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo5 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo5;
                                        } else {
                                            iWrite2 = i33 + 4;
                                            i36 = i31 | i54;
                                            resetDispatcherFields.serializer.RemoteActionCompatParcelizer(obj5, j, Float.intBitsToFloat(getOnKeyEvent.RemoteActionCompatParcelizer(i33, bArr)));
                                            i5 = i36;
                                            iWrite3 = iWrite2;
                                            i39 = i9;
                                            i4 = i32;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i2 = i2;
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i33 = iWrite;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 != 0) {
                                            i35 = i33;
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo6 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo6;
                                        } else {
                                            int iSerializer3 = getOnKeyEvent.serializer(bArr, i33, ismetapressedzmokqxo2);
                                            unsafe4.putLong(obj, j, ismetapressedzmokqxo2.write);
                                            i5 = i31 | i54;
                                            iWrite3 = iSerializer3;
                                            i39 = i9;
                                            i4 = i32;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i2 = i2;
                                        }
                                        break;
                                    case 4:
                                    case 11:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i33 = iWrite;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 != 0) {
                                            i35 = i33;
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo7 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo7;
                                        } else {
                                            i36 = i31 | i54;
                                            iWrite2 = getOnKeyEvent.write(bArr, i33, ismetapressedzmokqxo2);
                                            unsafe4.putInt(obj5, j, ismetapressedzmokqxo2.serializer);
                                            i5 = i36;
                                            iWrite3 = iWrite2;
                                            i39 = i9;
                                            i4 = i32;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i2 = i2;
                                        }
                                        break;
                                    case 5:
                                    case 14:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i33 = iWrite;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 != 1) {
                                            i35 = i33;
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo8 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo8;
                                        } else {
                                            unsafe4.putLong(obj, j, getOnKeyEvent.read(i33, bArr));
                                            iWrite3 = i33 + 8;
                                            i5 = i31 | i54;
                                            i39 = i9;
                                            i4 = i32;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i2 = i2;
                                        }
                                        break;
                                    case 6:
                                    case 13:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i33 = iWrite;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 != 5) {
                                            i35 = i33;
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo9 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo9;
                                        } else {
                                            unsafe4.putInt(obj5, j, getOnKeyEvent.RemoteActionCompatParcelizer(i33, bArr));
                                            iWrite3 = i33 + 4;
                                            i5 = i31 | i54;
                                            i39 = i9;
                                            i4 = i32;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i2 = i2;
                                        }
                                        break;
                                    case 7:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i33 = iWrite;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 != 0) {
                                            i35 = i33;
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo10 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo10;
                                        } else {
                                            iWrite3 = getOnKeyEvent.serializer(bArr, i33, ismetapressedzmokqxo2);
                                            resetDispatcherFields.serializer.read(obj5, j, ismetapressedzmokqxo2.write != 0);
                                            i5 = i31 | i54;
                                            i39 = i9;
                                            i4 = i32;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i2 = i2;
                                        }
                                        break;
                                    case 8:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i33 = iWrite;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 == 2) {
                                            if ((i51 & 536870912) != 0) {
                                                iWrite3 = getOnKeyEvent.read(bArr, i33, ismetapressedzmokqxo2);
                                                i34 = i31 | i54;
                                            } else {
                                                iWrite3 = getOnKeyEvent.write(bArr, i33, ismetapressedzmokqxo2);
                                                int i57 = ismetapressedzmokqxo2.serializer;
                                                if (i57 < 0) {
                                                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                int i58 = i31 | i54;
                                                if (i57 == 0) {
                                                    ismetapressedzmokqxo2.read = "";
                                                } else {
                                                    ismetapressedzmokqxo2.read = new String(bArr, iWrite3, i57, accessonPreScrollOzD1aCkjd.write);
                                                    iWrite3 += i57;
                                                }
                                                i34 = i58;
                                            }
                                            unsafe4.putObject(obj5, j, ismetapressedzmokqxo2.read);
                                            i38 = i34;
                                            i32 = i32;
                                            i43 = i43;
                                            i41 = iIconCompatParcelizer;
                                            i39 = i9;
                                            i40 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i37 = i32;
                                        }
                                        i35 = i33;
                                        objArr = objArr5;
                                        i7 = i35;
                                        i5 = i31;
                                        nestedScrollNode = nestedScrollNode2;
                                        i8 = i32;
                                        iArr = iArr2;
                                        this = getnestedscrollnodeui;
                                        unsafe = unsafe4;
                                        obj2 = obj5;
                                        i3 = i3;
                                        isMetaPressedZmokQxo ismetapressedzmokqxo11 = ismetapressedzmokqxo2;
                                        i43 = i43;
                                        ismetapressedzmokqxo3 = ismetapressedzmokqxo11;
                                        break;
                                    case 9:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 != 2) {
                                            i33 = iWrite;
                                            i35 = i33;
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo12 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo12;
                                        } else {
                                            i34 = i31 | i54;
                                            Object objIconCompatParcelizer = getnestedscrollnodeui.IconCompatParcelizer(iIconCompatParcelizer, obj5);
                                            iWrite3 = getOnKeyEvent.serializer(objIconCompatParcelizer, getnestedscrollnodeui.read(iIconCompatParcelizer), bArr, iWrite, i2, ismetapressedzmokqxo);
                                            getnestedscrollnodeui.read(obj5, iIconCompatParcelizer, objIconCompatParcelizer);
                                            i38 = i34;
                                            i32 = i32;
                                            i43 = i43;
                                            i41 = iIconCompatParcelizer;
                                            i39 = i9;
                                            i40 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i37 = i32;
                                        }
                                        break;
                                    case 10:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 == 2) {
                                            i31 |= i54;
                                            iRemoteActionCompatParcelizer2 = getOnKeyEvent.RemoteActionCompatParcelizer(bArr, iWrite, ismetapressedzmokqxo2);
                                            unsafe4.putObject(obj5, j, ismetapressedzmokqxo2.read);
                                            iSerializer2 = iRemoteActionCompatParcelizer2;
                                            i38 = i31;
                                            iWrite3 = iSerializer2;
                                            i41 = iIconCompatParcelizer;
                                            i39 = i9;
                                            i40 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i37 = i32;
                                        }
                                        i35 = iWrite;
                                        objArr = objArr5;
                                        i7 = i35;
                                        i5 = i31;
                                        nestedScrollNode = nestedScrollNode2;
                                        i8 = i32;
                                        iArr = iArr2;
                                        this = getnestedscrollnodeui;
                                        unsafe = unsafe4;
                                        obj2 = obj5;
                                        i3 = i3;
                                        isMetaPressedZmokQxo ismetapressedzmokqxo13 = ismetapressedzmokqxo2;
                                        i43 = i43;
                                        ismetapressedzmokqxo3 = ismetapressedzmokqxo13;
                                        break;
                                    case 12:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 != 0) {
                                            i35 = iWrite;
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo14 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo14;
                                        } else {
                                            iRemoteActionCompatParcelizer2 = getOnKeyEvent.write(bArr, iWrite, ismetapressedzmokqxo2);
                                            int i59 = ismetapressedzmokqxo2.serializer;
                                            getSwitchCharsetEK5gGoQ getswitchcharsetek5ggoqWrite2 = getnestedscrollnodeui.write(iIconCompatParcelizer);
                                            if ((i51 & Integer.MIN_VALUE) != 0 && getswitchcharsetek5ggoqWrite2 != null && !getswitchcharsetek5ggoqWrite2.IconCompatParcelizer(i59)) {
                                                SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = (SoftwareKeyboardInterceptionModifierKt) obj5;
                                                NestedScrollNode nestedScrollNode3 = softwareKeyboardInterceptionModifierKt.read;
                                                if (nestedScrollNode3 == nestedScrollNode2) {
                                                    nestedScrollNode3 = NestedScrollNode.read();
                                                    softwareKeyboardInterceptionModifierKt.read = nestedScrollNode3;
                                                }
                                                nestedScrollNode3.IconCompatParcelizer(i9 == true ? 1 : 0, Long.valueOf(i59));
                                            } else {
                                                i31 |= i54;
                                                unsafe4.putInt(obj5, j, i59);
                                            }
                                            iSerializer2 = iRemoteActionCompatParcelizer2;
                                            i38 = i31;
                                            iWrite3 = iSerializer2;
                                            i41 = iIconCompatParcelizer;
                                            i39 = i9;
                                            i40 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i37 = i32;
                                        }
                                        break;
                                    case 15:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 == 0) {
                                            int iWrite4 = getOnKeyEvent.write(bArr, iWrite, ismetapressedzmokqxo2);
                                            unsafe4.putInt(obj5, j, getGraphicModalMaxHeightDpannotations.IconCompatParcelizer(ismetapressedzmokqxo2.serializer));
                                            iSerializer2 = iWrite4;
                                            i31 |= i54;
                                            i38 = i31;
                                            iWrite3 = iSerializer2;
                                            i41 = iIconCompatParcelizer;
                                            i39 = i9;
                                            i40 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i37 = i32;
                                        }
                                        i35 = iWrite;
                                        objArr = objArr5;
                                        i7 = i35;
                                        i5 = i31;
                                        nestedScrollNode = nestedScrollNode2;
                                        i8 = i32;
                                        iArr = iArr2;
                                        this = getnestedscrollnodeui;
                                        unsafe = unsafe4;
                                        obj2 = obj5;
                                        i3 = i3;
                                        isMetaPressedZmokQxo ismetapressedzmokqxo15 = ismetapressedzmokqxo2;
                                        i43 = i43;
                                        ismetapressedzmokqxo3 = ismetapressedzmokqxo15;
                                        break;
                                    case 16:
                                        if (i50 != 0) {
                                            ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                            i9 = i52 == true ? 1 : 0;
                                            i35 = iWrite;
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo16 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo16;
                                        } else {
                                            i31 |= i54;
                                            ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                            iSerializer2 = getOnKeyEvent.serializer(bArr, iWrite, ismetapressedzmokqxo2);
                                            long j2 = getGraphicModalMaxHeightDpannotations.read(ismetapressedzmokqxo2.write);
                                            i9 = i52 == true ? 1 : 0;
                                            unsafe4.putLong(obj, j, j2);
                                            i38 = i31;
                                            iWrite3 = iSerializer2;
                                            i41 = iIconCompatParcelizer;
                                            i39 = i9;
                                            i40 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i37 = i32;
                                        }
                                        break;
                                    default:
                                        ismetapressedzmokqxo2 = ismetapressedzmokqxo;
                                        i35 = iWrite;
                                        i9 = i52 == true ? 1 : 0;
                                        if (i50 != 3) {
                                            objArr = objArr5;
                                            i7 = i35;
                                            i5 = i31;
                                            nestedScrollNode = nestedScrollNode2;
                                            i8 = i32;
                                            iArr = iArr2;
                                            this = getnestedscrollnodeui;
                                            unsafe = unsafe4;
                                            obj2 = obj5;
                                            i3 = i3;
                                            isMetaPressedZmokQxo ismetapressedzmokqxo17 = ismetapressedzmokqxo2;
                                            i43 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo17;
                                        } else {
                                            int i60 = i31 | i54;
                                            Object objIconCompatParcelizer2 = getnestedscrollnodeui.IconCompatParcelizer(iIconCompatParcelizer, obj5);
                                            int iSerializer4 = getOnKeyEvent.serializer(objIconCompatParcelizer2, getnestedscrollnodeui.read(iIconCompatParcelizer), bArr, i35, i2, (i43 << 3) | 4, ismetapressedzmokqxo);
                                            getnestedscrollnodeui.read(obj5, iIconCompatParcelizer, objIconCompatParcelizer2);
                                            i31 = i60;
                                            iSerializer2 = iSerializer4;
                                            i38 = i31;
                                            iWrite3 = iSerializer2;
                                            i41 = iIconCompatParcelizer;
                                            i39 = i9;
                                            i40 = i43;
                                            ismetapressedzmokqxo3 = ismetapressedzmokqxo2;
                                            i37 = i32;
                                        }
                                        break;
                                }
                            } else {
                                int i61 = iWrite;
                                iArr = iArr2;
                                int i62 = i52 == true ? 1 : 0;
                                i5 = i5;
                                if (iIconCompatParcelizer2 != 27) {
                                    i8 = i4;
                                    if (iIconCompatParcelizer2 <= 49) {
                                        long j3 = i51;
                                        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer = (onPostFlingRZ2iAVYsuspendImpl) unsafe4.getObject(obj5, j);
                                        if (!((KeyInputElement) onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer).write) {
                                            int size = onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer.size();
                                            onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer = onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(size + size);
                                            unsafe4.putObject(obj5, j, onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer);
                                        }
                                        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer;
                                        switch (iIconCompatParcelizer2) {
                                            case 18:
                                            case 35:
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                i18 = i62 == true ? 1 : 0;
                                                if (i50 == 2) {
                                                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                                                    return 0;
                                                }
                                                if (i50 == 1) {
                                                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                                                    return 0;
                                                }
                                                i29 = i17;
                                                i39 = i18;
                                                iWrite3 = i29;
                                                i17 = iWrite3;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                                break;
                                            case 19:
                                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                i18 = i62 == true ? 1 : 0;
                                                if (i50 == 2) {
                                                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                                                    return 0;
                                                }
                                                if (i50 == 5) {
                                                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                                                    return 0;
                                                }
                                                i29 = i17;
                                                i39 = i18;
                                                iWrite3 = i29;
                                                i17 = iWrite3;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case 38:
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                i18 = i62 == true ? 1 : 0;
                                                if (i50 != 2) {
                                                    if (i50 == 0) {
                                                        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = (dispatchPostScrollDzOQY0M) onpostflingrz2iavysuspendimpl;
                                                        iWrite3 = getOnKeyEvent.serializer(bArr, i17, ismetapressedzmokqxo3);
                                                        dispatchpostscrolldzoqy0m.write(ismetapressedzmokqxo3.write);
                                                        while (iWrite3 < i2) {
                                                            int iWrite5 = getOnKeyEvent.write(bArr, iWrite3, ismetapressedzmokqxo3);
                                                            if (i18 == ismetapressedzmokqxo3.serializer) {
                                                                iWrite3 = getOnKeyEvent.serializer(bArr, iWrite5, ismetapressedzmokqxo3);
                                                                dispatchpostscrolldzoqy0m.write(ismetapressedzmokqxo3.write);
                                                            }
                                                        }
                                                    }
                                                    i29 = i17;
                                                    i39 = i18;
                                                    iWrite3 = i29;
                                                    i17 = iWrite3;
                                                    i22 = i8;
                                                    if (iWrite3 != i17) {
                                                        obj3 = obj;
                                                        objArr = objArr5;
                                                        unsafe2 = unsafe4;
                                                        i7 = iWrite3;
                                                        i9 = i39;
                                                        i5 = i5;
                                                        i8 = i22;
                                                        obj2 = obj3;
                                                        unsafe = unsafe2;
                                                        nestedScrollNode = nestedScrollNode2;
                                                    } else {
                                                        this = this;
                                                        obj2 = obj;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        unsafe = unsafe4;
                                                        i43 = i43;
                                                        i4 = i8;
                                                    }
                                                } else {
                                                    dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m2 = (dispatchPostScrollDzOQY0M) onpostflingrz2iavysuspendimpl;
                                                    iWrite3 = getOnKeyEvent.write(bArr, i17, ismetapressedzmokqxo3);
                                                    int i63 = ismetapressedzmokqxo3.serializer + iWrite3;
                                                    while (iWrite3 < i63) {
                                                        iWrite3 = getOnKeyEvent.serializer(bArr, iWrite3, ismetapressedzmokqxo3);
                                                        dispatchpostscrolldzoqy0m2.write(ismetapressedzmokqxo3.write);
                                                    }
                                                    if (iWrite3 != i63) {
                                                        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                }
                                                i39 = i18;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                            case 43:
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                i18 = i62 == true ? 1 : 0;
                                                if (i50 != 2) {
                                                    if (i50 == 0) {
                                                        iWrite3 = getOnKeyEvent.RemoteActionCompatParcelizer(i18 == true ? 1 : 0, bArr, i17, i2, onpostflingrz2iavysuspendimpl, ismetapressedzmokqxo);
                                                    }
                                                    i29 = i17;
                                                    i39 = i18;
                                                    iWrite3 = i29;
                                                    i17 = iWrite3;
                                                    i22 = i8;
                                                    if (iWrite3 != i17) {
                                                        obj3 = obj;
                                                        objArr = objArr5;
                                                        unsafe2 = unsafe4;
                                                        i7 = iWrite3;
                                                        i9 = i39;
                                                        i5 = i5;
                                                        i8 = i22;
                                                        obj2 = obj3;
                                                        unsafe = unsafe2;
                                                        nestedScrollNode = nestedScrollNode2;
                                                    } else {
                                                        this = this;
                                                        obj2 = obj;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        unsafe = unsafe4;
                                                        i43 = i43;
                                                        i4 = i8;
                                                    }
                                                } else {
                                                    iWrite3 = getOnKeyEvent.IconCompatParcelizer(bArr, i17, onpostflingrz2iavysuspendimpl, ismetapressedzmokqxo3);
                                                }
                                                i39 = i18;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case 40:
                                            case 46:
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                i18 = i62 == true ? 1 : 0;
                                                if (i50 != 2) {
                                                    if (i50 == 1) {
                                                        iWrite3 = i17 + 8;
                                                        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m3 = (dispatchPostScrollDzOQY0M) onpostflingrz2iavysuspendimpl;
                                                        dispatchpostscrolldzoqy0m3.write(getOnKeyEvent.read(i17, bArr));
                                                        while (iWrite3 < i2) {
                                                            int iWrite6 = getOnKeyEvent.write(bArr, iWrite3, ismetapressedzmokqxo3);
                                                            if (i18 == ismetapressedzmokqxo3.serializer) {
                                                                dispatchpostscrolldzoqy0m3.write(getOnKeyEvent.read(iWrite6, bArr));
                                                                iWrite3 = iWrite6 + 8;
                                                            }
                                                        }
                                                    }
                                                    i29 = i17;
                                                    i39 = i18;
                                                    iWrite3 = i29;
                                                    i17 = iWrite3;
                                                    i22 = i8;
                                                    if (iWrite3 != i17) {
                                                        obj3 = obj;
                                                        objArr = objArr5;
                                                        unsafe2 = unsafe4;
                                                        i7 = iWrite3;
                                                        i9 = i39;
                                                        i5 = i5;
                                                        i8 = i22;
                                                        obj2 = obj3;
                                                        unsafe = unsafe2;
                                                        nestedScrollNode = nestedScrollNode2;
                                                    } else {
                                                        this = this;
                                                        obj2 = obj;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        unsafe = unsafe4;
                                                        i43 = i43;
                                                        i4 = i8;
                                                    }
                                                    break;
                                                } else {
                                                    dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m4 = (dispatchPostScrollDzOQY0M) onpostflingrz2iavysuspendimpl;
                                                    iWrite3 = getOnKeyEvent.write(bArr, i17, ismetapressedzmokqxo3);
                                                    int i64 = ismetapressedzmokqxo3.serializer;
                                                    int i65 = iWrite3 + i64;
                                                    if (i65 <= bArr.length) {
                                                        int i66 = (i64 / 8) + dispatchpostscrolldzoqy0m4.IconCompatParcelizer;
                                                        int length = dispatchpostscrolldzoqy0m4.RemoteActionCompatParcelizer.length;
                                                        if (i66 > length) {
                                                            if (length != 0) {
                                                                while (length < i66) {
                                                                    length = Math.max(((length * 3) / 2) + 1, 10);
                                                                }
                                                                dispatchpostscrolldzoqy0m4.RemoteActionCompatParcelizer = Arrays.copyOf(dispatchpostscrolldzoqy0m4.RemoteActionCompatParcelizer, length);
                                                            } else {
                                                                dispatchpostscrolldzoqy0m4.RemoteActionCompatParcelizer = new long[Math.max(i66, 10)];
                                                            }
                                                        }
                                                        while (iWrite3 < i65) {
                                                            dispatchpostscrolldzoqy0m4.write(getOnKeyEvent.read(iWrite3, bArr));
                                                            iWrite3 += 8;
                                                        }
                                                        if (iWrite3 != i65) {
                                                            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                    } else {
                                                        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                }
                                                i39 = i18;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                i18 = i62 == true ? 1 : 0;
                                                if (i50 != 2) {
                                                    if (i50 == 5) {
                                                        iWrite3 = i17 + 4;
                                                        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) onpostflingrz2iavysuspendimpl;
                                                        nestedScrollConnection.write(getOnKeyEvent.RemoteActionCompatParcelizer(i17, bArr));
                                                        while (iWrite3 < i2) {
                                                            int iWrite7 = getOnKeyEvent.write(bArr, iWrite3, ismetapressedzmokqxo3);
                                                            if (i18 == ismetapressedzmokqxo3.serializer) {
                                                                nestedScrollConnection.write(getOnKeyEvent.RemoteActionCompatParcelizer(iWrite7, bArr));
                                                                iWrite3 = iWrite7 + 4;
                                                            }
                                                        }
                                                    }
                                                    i29 = i17;
                                                    i39 = i18;
                                                    iWrite3 = i29;
                                                    i17 = iWrite3;
                                                    i22 = i8;
                                                    if (iWrite3 != i17) {
                                                        obj3 = obj;
                                                        objArr = objArr5;
                                                        unsafe2 = unsafe4;
                                                        i7 = iWrite3;
                                                        i9 = i39;
                                                        i5 = i5;
                                                        i8 = i22;
                                                        obj2 = obj3;
                                                        unsafe = unsafe2;
                                                        nestedScrollNode = nestedScrollNode2;
                                                    } else {
                                                        this = this;
                                                        obj2 = obj;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        unsafe = unsafe4;
                                                        i43 = i43;
                                                        i4 = i8;
                                                    }
                                                    break;
                                                } else {
                                                    NestedScrollConnection nestedScrollConnection2 = (NestedScrollConnection) onpostflingrz2iavysuspendimpl;
                                                    iWrite3 = getOnKeyEvent.write(bArr, i17, ismetapressedzmokqxo3);
                                                    int i67 = ismetapressedzmokqxo3.serializer;
                                                    int i68 = iWrite3 + i67;
                                                    if (i68 <= bArr.length) {
                                                        int i69 = (i67 / 4) + nestedScrollConnection2.read;
                                                        int length2 = nestedScrollConnection2.serializer.length;
                                                        if (i69 > length2) {
                                                            if (length2 != 0) {
                                                                while (length2 < i69) {
                                                                    length2 = Math.max(((length2 * 3) / 2) + 1, 10);
                                                                }
                                                                nestedScrollConnection2.serializer = Arrays.copyOf(nestedScrollConnection2.serializer, length2);
                                                            } else {
                                                                nestedScrollConnection2.serializer = new int[Math.max(i69, 10)];
                                                            }
                                                        }
                                                        while (iWrite3 < i68) {
                                                            nestedScrollConnection2.write(getOnKeyEvent.RemoteActionCompatParcelizer(iWrite3, bArr));
                                                            iWrite3 += 4;
                                                        }
                                                        if (iWrite3 != i68) {
                                                            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                    } else {
                                                        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                }
                                                i39 = i18;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                            case 25:
                                            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                i18 = i62 == true ? 1 : 0;
                                                if (i50 == 2) {
                                                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                                                    return 0;
                                                }
                                                if (i50 == 0) {
                                                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                                                    return 0;
                                                }
                                                i29 = i17;
                                                i39 = i18;
                                                iWrite3 = i29;
                                                i17 = iWrite3;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                                break;
                                            case 26:
                                                int i70 = i62 == true ? 1 : 0;
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                if (i50 == 2) {
                                                    if ((536870912 & j3) == 0) {
                                                        int iWrite8 = getOnKeyEvent.write(bArr, i17, ismetapressedzmokqxo3);
                                                        int i71 = ismetapressedzmokqxo3.serializer;
                                                        if (i71 < 0) {
                                                            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i71 == 0) {
                                                            objArr3 = "";
                                                            onpostflingrz2iavysuspendimpl.add(objArr3);
                                                            i23 = i70 == true ? 1 : 0;
                                                            i39 = i23 == true ? 1 : 0;
                                                        } else {
                                                            objArr3 = "";
                                                            onpostflingrz2iavysuspendimpl.add(new String(bArr, iWrite8, i71, accessonPreScrollOzD1aCkjd.write));
                                                            i39 = i70 == true ? 1 : 0;
                                                            iWrite8 += i71;
                                                            i23 = i70 == true ? 1 : 0;
                                                        }
                                                        while (iWrite8 < i2) {
                                                            int iWrite9 = getOnKeyEvent.write(bArr, iWrite8, ismetapressedzmokqxo3);
                                                            if (i23 == ismetapressedzmokqxo3.serializer) {
                                                                iWrite8 = getOnKeyEvent.write(bArr, iWrite9, ismetapressedzmokqxo3);
                                                                int i72 = ismetapressedzmokqxo3.serializer;
                                                                if (i72 < 0) {
                                                                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                    return 0;
                                                                }
                                                                if (i72 == 0) {
                                                                    onpostflingrz2iavysuspendimpl.add(objArr3);
                                                                } else {
                                                                    Object[] objArr6 = i23 == true ? 1 : 0;
                                                                    onpostflingrz2iavysuspendimpl.add(new String(bArr, iWrite8, i72, accessonPreScrollOzD1aCkjd.write));
                                                                    i8 = i8;
                                                                    iWrite8 += i72;
                                                                    i23 = objArr6 == true ? 1 : 0;
                                                                }
                                                            } else {
                                                                i21 = i8;
                                                                iWrite3 = iWrite8;
                                                                i20 = i8;
                                                            }
                                                        }
                                                        i21 = i8;
                                                        iWrite3 = iWrite8;
                                                        i20 = i8;
                                                    } else {
                                                        iWrite3 = getOnKeyEvent.write(bArr, i17, ismetapressedzmokqxo3);
                                                        int i73 = ismetapressedzmokqxo3.serializer;
                                                        if (i73 < 0) {
                                                            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i73 == 0) {
                                                            onpostflingrz2iavysuspendimpl.add("");
                                                        } else {
                                                            int i74 = iWrite3 + i73;
                                                            if (updateDispatcher.serializer(bArr, iWrite3, i74)) {
                                                                onpostflingrz2iavysuspendimpl.add(new String(bArr, iWrite3, i73, accessonPreScrollOzD1aCkjd.write));
                                                                iWrite3 = i74;
                                                            } else {
                                                                GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                        }
                                                        while (true) {
                                                            if (iWrite3 < i2) {
                                                                int iWrite10 = getOnKeyEvent.write(bArr, iWrite3, ismetapressedzmokqxo3);
                                                                i19 = i70;
                                                                if (i19 == ismetapressedzmokqxo3.serializer) {
                                                                    iWrite3 = getOnKeyEvent.write(bArr, iWrite10, ismetapressedzmokqxo3);
                                                                    int i75 = ismetapressedzmokqxo3.serializer;
                                                                    if (i75 < 0) {
                                                                        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                        return 0;
                                                                    }
                                                                    if (i75 == 0) {
                                                                        onpostflingrz2iavysuspendimpl.add("");
                                                                    } else {
                                                                        int i76 = iWrite3 + i75;
                                                                        if (updateDispatcher.serializer(bArr, iWrite3, i76)) {
                                                                            onpostflingrz2iavysuspendimpl.add(new String(bArr, iWrite3, i75, accessonPreScrollOzD1aCkjd.write));
                                                                            iWrite3 = i76;
                                                                        } else {
                                                                            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had invalid UTF-8.");
                                                                            return 0;
                                                                        }
                                                                    }
                                                                    i70 = i19 == true ? 1 : 0;
                                                                }
                                                            } else {
                                                                i19 = i70;
                                                            }
                                                        }
                                                        i39 = i19;
                                                        i5 = i5;
                                                        i20 = i8;
                                                        i21 = i20;
                                                    }
                                                    i8 = i20;
                                                    i22 = i21;
                                                } else {
                                                    i18 = i70 == true ? 1 : 0;
                                                    i29 = i17;
                                                    i39 = i18;
                                                    iWrite3 = i29;
                                                    i17 = iWrite3;
                                                    i22 = i8;
                                                }
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                            case 27:
                                                i24 = i62 == true ? 1 : 0;
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                if (i50 != 2) {
                                                    i18 = i24;
                                                    i29 = i17;
                                                    i39 = i18;
                                                    iWrite3 = i29;
                                                    i17 = iWrite3;
                                                    i22 = i8;
                                                    if (iWrite3 != i17) {
                                                        obj3 = obj;
                                                        objArr = objArr5;
                                                        unsafe2 = unsafe4;
                                                        i7 = iWrite3;
                                                        i9 = i39;
                                                        i5 = i5;
                                                        i8 = i22;
                                                        obj2 = obj3;
                                                        unsafe = unsafe2;
                                                        nestedScrollNode = nestedScrollNode2;
                                                    } else {
                                                        this = this;
                                                        obj2 = obj;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        unsafe = unsafe4;
                                                        i43 = i43;
                                                        i4 = i8;
                                                    }
                                                } else {
                                                    iWrite3 = getOnKeyEvent.RemoteActionCompatParcelizer(getnestedscrollnodeui.read(iIconCompatParcelizer), i24 == true ? 1 : 0, bArr, i17, i2, onpostflingrz2iavysuspendimpl, ismetapressedzmokqxo);
                                                    i18 = i24;
                                                    i39 = i18;
                                                    i22 = i8;
                                                    if (iWrite3 != i17) {
                                                        obj3 = obj;
                                                        objArr = objArr5;
                                                        unsafe2 = unsafe4;
                                                        i7 = iWrite3;
                                                        i9 = i39;
                                                        i5 = i5;
                                                        i8 = i22;
                                                        obj2 = obj3;
                                                        unsafe = unsafe2;
                                                        nestedScrollNode = nestedScrollNode2;
                                                    } else {
                                                        this = this;
                                                        obj2 = obj;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        unsafe = unsafe4;
                                                        i43 = i43;
                                                        i4 = i8;
                                                    }
                                                }
                                                break;
                                            case 28:
                                                i24 = i62 == true ? 1 : 0;
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                if (i50 == 2) {
                                                    iWrite3 = getOnKeyEvent.write(bArr, i17, ismetapressedzmokqxo3);
                                                    int i77 = ismetapressedzmokqxo3.serializer;
                                                    if (i77 >= 0) {
                                                        if (i77 > bArr.length - iWrite3) {
                                                            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                        if (i77 == 0) {
                                                            onpostflingrz2iavysuspendimpl.add(onPreviewKeyEvent.IconCompatParcelizer);
                                                            i25 = i24 == true ? 1 : 0;
                                                            i39 = i25 == true ? 1 : 0;
                                                        } else {
                                                            onpostflingrz2iavysuspendimpl.add(onPreviewKeyEvent.IconCompatParcelizer(bArr, iWrite3, i77));
                                                            i39 = i24 == true ? 1 : 0;
                                                            iWrite3 += i77;
                                                            i25 = i24 == true ? 1 : 0;
                                                        }
                                                        while (iWrite3 < i2) {
                                                            int iWrite11 = getOnKeyEvent.write(bArr, iWrite3, ismetapressedzmokqxo3);
                                                            if (i25 == ismetapressedzmokqxo3.serializer) {
                                                                iWrite3 = getOnKeyEvent.write(bArr, iWrite11, ismetapressedzmokqxo3);
                                                                int i78 = ismetapressedzmokqxo3.serializer;
                                                                if (i78 >= 0) {
                                                                    if (i78 > bArr.length - iWrite3) {
                                                                        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                        return 0;
                                                                    }
                                                                    if (i78 == 0) {
                                                                        onpostflingrz2iavysuspendimpl.add(onPreviewKeyEvent.IconCompatParcelizer);
                                                                    } else {
                                                                        onpostflingrz2iavysuspendimpl.add(onPreviewKeyEvent.IconCompatParcelizer(bArr, iWrite3, i78));
                                                                        iWrite3 += i78;
                                                                        i25 = (i25 == true ? 1 : 0) == true ? 1 : 0;
                                                                    }
                                                                } else {
                                                                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                    return 0;
                                                                }
                                                            } else {
                                                                objArr5 = objArr5;
                                                                nestedScrollNode2 = nestedScrollNode2;
                                                                i8 = i8;
                                                                i22 = i8;
                                                            }
                                                        }
                                                        objArr5 = objArr5;
                                                        nestedScrollNode2 = nestedScrollNode2;
                                                        i8 = i8;
                                                        i22 = i8;
                                                    } else {
                                                        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                } else {
                                                    i18 = i24;
                                                    i29 = i17;
                                                    i39 = i18;
                                                    iWrite3 = i29;
                                                    i17 = iWrite3;
                                                    i22 = i8;
                                                }
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                i17 = i61;
                                                if (i50 == 2) {
                                                    iRemoteActionCompatParcelizer = getOnKeyEvent.IconCompatParcelizer(bArr, i17, onpostflingrz2iavysuspendimpl, ismetapressedzmokqxo3);
                                                } else if (i50 != 0) {
                                                    i24 = i62 == true ? 1 : 0;
                                                    unsafe4 = unsafe4;
                                                    i18 = i24;
                                                    i29 = i17;
                                                    i39 = i18;
                                                    iWrite3 = i29;
                                                    i17 = iWrite3;
                                                    i22 = i8;
                                                    if (iWrite3 != i17) {
                                                        obj3 = obj;
                                                        objArr = objArr5;
                                                        unsafe2 = unsafe4;
                                                        i7 = iWrite3;
                                                        i9 = i39;
                                                        i5 = i5;
                                                        i8 = i22;
                                                        obj2 = obj3;
                                                        unsafe = unsafe2;
                                                        nestedScrollNode = nestedScrollNode2;
                                                    } else {
                                                        this = this;
                                                        obj2 = obj;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        unsafe = unsafe4;
                                                        i43 = i43;
                                                        i4 = i8;
                                                    }
                                                } else {
                                                    iRemoteActionCompatParcelizer = getOnKeyEvent.RemoteActionCompatParcelizer(i62 == true ? 1 : 0, bArr, i17, i2, onpostflingrz2iavysuspendimpl, ismetapressedzmokqxo);
                                                }
                                                getSwitchCharsetEK5gGoQ getswitchcharsetek5ggoqWrite3 = getnestedscrollnodeui.write(iIconCompatParcelizer);
                                                onInterceptKeyBeforeSoftKeyboard oninterceptkeybeforesoftkeyboard3 = getConnection.write;
                                                if (getswitchcharsetek5ggoqWrite3 != null) {
                                                    int size2 = onpostflingrz2iavysuspendimpl.size();
                                                    NestedScrollNode nestedScrollNode4 = null;
                                                    int i79 = 0;
                                                    int i80 = 0;
                                                    while (i79 < size2) {
                                                        int i81 = iRemoteActionCompatParcelizer;
                                                        Integer num = (Integer) onpostflingrz2iavysuspendimpl.get(i79);
                                                        int i82 = i62;
                                                        int iIntValue = num.intValue();
                                                        if (getswitchcharsetek5ggoqWrite3.IconCompatParcelizer(iIntValue)) {
                                                            if (i79 != i80) {
                                                                onpostflingrz2iavysuspendimpl.set(i80, num);
                                                            }
                                                            i80++;
                                                        } else {
                                                            if (nestedScrollNode4 == null) {
                                                                oninterceptkeybeforesoftkeyboard.getClass();
                                                                SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt2 = (SoftwareKeyboardInterceptionModifierKt) obj5;
                                                                nestedScrollNode4 = softwareKeyboardInterceptionModifierKt2.read;
                                                                if (nestedScrollNode4 == nestedScrollNode2) {
                                                                    nestedScrollNode4 = NestedScrollNode.read();
                                                                    softwareKeyboardInterceptionModifierKt2.read = nestedScrollNode4;
                                                                }
                                                            }
                                                            nestedScrollNode4.IconCompatParcelizer(i43 << 3, Long.valueOf(iIntValue));
                                                        }
                                                        i79++;
                                                        getswitchcharsetek5ggoqWrite3 = getswitchcharsetek5ggoqWrite3;
                                                        iRemoteActionCompatParcelizer = i81;
                                                        i62 = i82 == true ? 1 : 0;
                                                    }
                                                    i26 = iRemoteActionCompatParcelizer;
                                                    i24 = i62;
                                                    if (i80 != size2) {
                                                        onpostflingrz2iavysuspendimpl.subList(i80, size2).clear();
                                                    }
                                                } else {
                                                    i26 = iRemoteActionCompatParcelizer;
                                                    i24 = i62 == true ? 1 : 0;
                                                }
                                                iWrite3 = i26;
                                                i18 = i24;
                                                i39 = i18;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                            case 33:
                                            case 47:
                                                i27 = i2;
                                                i28 = i61;
                                                if (i50 != 2) {
                                                    if (i50 == 0) {
                                                        NestedScrollConnection nestedScrollConnection3 = (NestedScrollConnection) onpostflingrz2iavysuspendimpl;
                                                        iWrite3 = getOnKeyEvent.write(bArr, i28, ismetapressedzmokqxo3);
                                                        nestedScrollConnection3.write(getGraphicModalMaxHeightDpannotations.IconCompatParcelizer(ismetapressedzmokqxo3.serializer));
                                                        while (iWrite3 < i27) {
                                                            int iWrite12 = getOnKeyEvent.write(bArr, iWrite3, ismetapressedzmokqxo3);
                                                            if (i62 == ismetapressedzmokqxo3.serializer) {
                                                                iWrite3 = getOnKeyEvent.write(bArr, iWrite12, ismetapressedzmokqxo3);
                                                                nestedScrollConnection3.write(getGraphicModalMaxHeightDpannotations.IconCompatParcelizer(ismetapressedzmokqxo3.serializer));
                                                            }
                                                        }
                                                    }
                                                    unsafe4 = unsafe4;
                                                    i29 = i28;
                                                    objArr5 = objArr5;
                                                    nestedScrollNode2 = nestedScrollNode2;
                                                    i18 = i62 == true ? 1 : 0;
                                                    i39 = i18;
                                                    iWrite3 = i29;
                                                    i17 = iWrite3;
                                                    i22 = i8;
                                                    if (iWrite3 != i17) {
                                                        obj3 = obj;
                                                        objArr = objArr5;
                                                        unsafe2 = unsafe4;
                                                        i7 = iWrite3;
                                                        i9 = i39;
                                                        i5 = i5;
                                                        i8 = i22;
                                                        obj2 = obj3;
                                                        unsafe = unsafe2;
                                                        nestedScrollNode = nestedScrollNode2;
                                                    } else {
                                                        this = this;
                                                        obj2 = obj;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        unsafe = unsafe4;
                                                        i43 = i43;
                                                        i4 = i8;
                                                    }
                                                } else {
                                                    NestedScrollConnection nestedScrollConnection4 = (NestedScrollConnection) onpostflingrz2iavysuspendimpl;
                                                    iWrite3 = getOnKeyEvent.write(bArr, i28, ismetapressedzmokqxo3);
                                                    int i83 = ismetapressedzmokqxo3.serializer + iWrite3;
                                                    while (iWrite3 < i83) {
                                                        iWrite3 = getOnKeyEvent.write(bArr, iWrite3, ismetapressedzmokqxo3);
                                                        nestedScrollConnection4.write(getGraphicModalMaxHeightDpannotations.IconCompatParcelizer(ismetapressedzmokqxo3.serializer));
                                                    }
                                                    if (iWrite3 != i83) {
                                                        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                }
                                                unsafe4 = unsafe4;
                                                i30 = i28;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                i18 = i62 == true ? 1 : 0;
                                                i39 = i18;
                                                i17 = i30;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                                                if (i50 != 2) {
                                                    i28 = i61;
                                                    if (i50 != 0) {
                                                        i27 = i2;
                                                        unsafe4 = unsafe4;
                                                        i29 = i28;
                                                        objArr5 = objArr5;
                                                        nestedScrollNode2 = nestedScrollNode2;
                                                        i18 = i62 == true ? 1 : 0;
                                                        i39 = i18;
                                                        iWrite3 = i29;
                                                        i17 = iWrite3;
                                                        i22 = i8;
                                                        if (iWrite3 != i17) {
                                                            obj3 = obj;
                                                            objArr = objArr5;
                                                            unsafe2 = unsafe4;
                                                            i7 = iWrite3;
                                                            i9 = i39;
                                                            i5 = i5;
                                                            i8 = i22;
                                                            obj2 = obj3;
                                                            unsafe = unsafe2;
                                                            nestedScrollNode = nestedScrollNode2;
                                                        } else {
                                                            this = this;
                                                            obj2 = obj;
                                                            iIconCompatParcelizer = iIconCompatParcelizer;
                                                            unsafe = unsafe4;
                                                            i43 = i43;
                                                            i4 = i8;
                                                        }
                                                        break;
                                                    } else {
                                                        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m5 = (dispatchPostScrollDzOQY0M) onpostflingrz2iavysuspendimpl;
                                                        iWrite3 = getOnKeyEvent.serializer(bArr, i28, ismetapressedzmokqxo3);
                                                        dispatchpostscrolldzoqy0m5.write(getGraphicModalMaxHeightDpannotations.read(ismetapressedzmokqxo3.write));
                                                        i27 = i2;
                                                        while (iWrite3 < i27) {
                                                            int iWrite13 = getOnKeyEvent.write(bArr, iWrite3, ismetapressedzmokqxo3);
                                                            if (i62 == ismetapressedzmokqxo3.serializer) {
                                                                iWrite3 = getOnKeyEvent.serializer(bArr, iWrite13, ismetapressedzmokqxo3);
                                                                dispatchpostscrolldzoqy0m5.write(getGraphicModalMaxHeightDpannotations.read(ismetapressedzmokqxo3.write));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m6 = (dispatchPostScrollDzOQY0M) onpostflingrz2iavysuspendimpl;
                                                    i28 = i61;
                                                    iWrite3 = getOnKeyEvent.write(bArr, i28, ismetapressedzmokqxo3);
                                                    int i84 = ismetapressedzmokqxo3.serializer + iWrite3;
                                                    while (iWrite3 < i84) {
                                                        iWrite3 = getOnKeyEvent.serializer(bArr, iWrite3, ismetapressedzmokqxo3);
                                                        dispatchpostscrolldzoqy0m6.write(getGraphicModalMaxHeightDpannotations.read(ismetapressedzmokqxo3.write));
                                                    }
                                                    if (iWrite3 != i84) {
                                                        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    i27 = i2;
                                                }
                                                unsafe4 = unsafe4;
                                                i30 = i28;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                i18 = i62 == true ? 1 : 0;
                                                i39 = i18;
                                                i17 = i30;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                            default:
                                                unsafe4 = unsafe4;
                                                i17 = i61;
                                                objArr5 = objArr5;
                                                nestedScrollNode2 = nestedScrollNode2;
                                                i18 = i62 == true ? 1 : 0;
                                                if (i50 == 3) {
                                                    int i85 = ((i18 == true ? 1 : 0) & (-8)) | 4;
                                                    getDispatcher getdispatcher = getnestedscrollnodeui.read(iIconCompatParcelizer);
                                                    SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer = getdispatcher.RemoteActionCompatParcelizer();
                                                    i30 = i17;
                                                    iWrite3 = getOnKeyEvent.serializer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer, getdispatcher, bArr, i17, i2, i85, ismetapressedzmokqxo);
                                                    getdispatcher.IconCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer);
                                                    ismetapressedzmokqxo3.read = softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer;
                                                    onpostflingrz2iavysuspendimpl.add(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer);
                                                    while (iWrite3 < i2) {
                                                        int iWrite14 = getOnKeyEvent.write(bArr, iWrite3, ismetapressedzmokqxo3);
                                                        if (i18 != ismetapressedzmokqxo3.serializer) {
                                                            i39 = i18;
                                                            i17 = i30;
                                                            i22 = i8;
                                                            if (iWrite3 != i17) {
                                                                obj3 = obj;
                                                                objArr = objArr5;
                                                                unsafe2 = unsafe4;
                                                                i7 = iWrite3;
                                                                i9 = i39;
                                                                i5 = i5;
                                                                i8 = i22;
                                                                obj2 = obj3;
                                                                unsafe = unsafe2;
                                                                nestedScrollNode = nestedScrollNode2;
                                                            } else {
                                                                this = this;
                                                                obj2 = obj;
                                                                iIconCompatParcelizer = iIconCompatParcelizer;
                                                                unsafe = unsafe4;
                                                                i43 = i43;
                                                                i4 = i8;
                                                            }
                                                        } else {
                                                            SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2 = getdispatcher.RemoteActionCompatParcelizer();
                                                            iWrite3 = getOnKeyEvent.serializer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2, getdispatcher, bArr, iWrite14, i2, i85, ismetapressedzmokqxo);
                                                            getdispatcher.IconCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2);
                                                            ismetapressedzmokqxo3.read = softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2;
                                                            onpostflingrz2iavysuspendimpl.add(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2);
                                                        }
                                                        break;
                                                    }
                                                    i39 = i18;
                                                    i17 = i30;
                                                    i22 = i8;
                                                    if (iWrite3 != i17) {
                                                        obj3 = obj;
                                                        objArr = objArr5;
                                                        unsafe2 = unsafe4;
                                                        i7 = iWrite3;
                                                        i9 = i39;
                                                        i5 = i5;
                                                        i8 = i22;
                                                        obj2 = obj3;
                                                        unsafe = unsafe2;
                                                        nestedScrollNode = nestedScrollNode2;
                                                    } else {
                                                        this = this;
                                                        obj2 = obj;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        unsafe = unsafe4;
                                                        i43 = i43;
                                                        i4 = i8;
                                                    }
                                                }
                                                i29 = i17;
                                                i39 = i18;
                                                iWrite3 = i29;
                                                i17 = iWrite3;
                                                i22 = i8;
                                                if (iWrite3 != i17) {
                                                    obj3 = obj;
                                                    objArr = objArr5;
                                                    unsafe2 = unsafe4;
                                                    i7 = iWrite3;
                                                    i9 = i39;
                                                    i5 = i5;
                                                    i8 = i22;
                                                    obj2 = obj3;
                                                    unsafe = unsafe2;
                                                    nestedScrollNode = nestedScrollNode2;
                                                } else {
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    unsafe = unsafe4;
                                                    i43 = i43;
                                                    i4 = i8;
                                                }
                                                break;
                                        }
                                    } else {
                                        Object obj6 = "";
                                        Unsafe unsafe5 = unsafe4;
                                        i10 = i61;
                                        Object[] objArr7 = objArr5;
                                        nestedScrollNode2 = nestedScrollNode2;
                                        int i86 = i62 == true ? 1 : 0;
                                        if (iIconCompatParcelizer2 != 50) {
                                            objArr = objArr7;
                                            i11 = i86 == true ? 1 : 0;
                                            unsafe = unsafe5;
                                            long j4 = iArr[iIconCompatParcelizer + 2] & 1048575;
                                            switch (iIconCompatParcelizer2) {
                                                case 51:
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    i43 = i43;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    if (i50 == 1) {
                                                        iSerializer = i10 + 8;
                                                        unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(getOnKeyEvent.read(i10, bArr))));
                                                        unsafe.putInt(obj2, j4, i43);
                                                    } else {
                                                        iSerializer = i10;
                                                    }
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    i43 = i43;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    if (i50 == 5) {
                                                        iSerializer = i10 + 4;
                                                        unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(getOnKeyEvent.RemoteActionCompatParcelizer(i10, bArr))));
                                                        unsafe.putInt(obj2, j4, i43);
                                                    } else {
                                                        iSerializer = i10;
                                                    }
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 53:
                                                case 54:
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    i43 = i43;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    if (i50 == 0) {
                                                        iSerializer = getOnKeyEvent.serializer(bArr, i10, ismetapressedzmokqxo3);
                                                        unsafe.putObject(obj2, j, Long.valueOf(ismetapressedzmokqxo3.write));
                                                        unsafe.putInt(obj2, j4, i43);
                                                    } else {
                                                        iSerializer = i10;
                                                    }
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 55:
                                                case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    i43 = i43;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    if (i50 == 0) {
                                                        iSerializer = getOnKeyEvent.write(bArr, i10, ismetapressedzmokqxo3);
                                                        unsafe.putObject(obj2, j, Integer.valueOf(ismetapressedzmokqxo3.serializer));
                                                        unsafe.putInt(obj2, j4, i43);
                                                    } else {
                                                        iSerializer = i10;
                                                    }
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    i43 = i43;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    if (i50 == 1) {
                                                        iSerializer = i10 + 8;
                                                        unsafe.putObject(obj2, j, Long.valueOf(getOnKeyEvent.read(i10, bArr)));
                                                        unsafe.putInt(obj2, j4, i43);
                                                    } else {
                                                        iSerializer = i10;
                                                    }
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    i43 = i43;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    if (i50 == 5) {
                                                        iSerializer = i10 + 4;
                                                        unsafe.putObject(obj2, j, Integer.valueOf(getOnKeyEvent.RemoteActionCompatParcelizer(i10, bArr)));
                                                        unsafe.putInt(obj2, j4, i43);
                                                    } else {
                                                        iSerializer = i10;
                                                    }
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 58:
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    i43 = i43;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    if (i50 == 0) {
                                                        iSerializer = getOnKeyEvent.serializer(bArr, i10, ismetapressedzmokqxo3);
                                                        unsafe.putObject(obj2, j, Boolean.valueOf(ismetapressedzmokqxo3.write != 0));
                                                        unsafe.putInt(obj2, j4, i43);
                                                    } else {
                                                        iSerializer = i10;
                                                    }
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 59:
                                                    this = this;
                                                    obj2 = obj;
                                                    i43 = i43;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    if (i50 == 2) {
                                                        int iWrite15 = getOnKeyEvent.write(bArr, i10, ismetapressedzmokqxo3);
                                                        int i87 = ismetapressedzmokqxo3.serializer;
                                                        if (i87 == 0) {
                                                            unsafe.putObject(obj2, j, obj6);
                                                            iSerializer = iWrite15;
                                                        } else {
                                                            int i88 = iWrite15 + i87;
                                                            if ((i51 & 536870912) != 0 && !updateDispatcher.serializer(bArr, iWrite15, i88)) {
                                                                GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            unsafe.putObject(obj2, j, new String(bArr, iWrite15, i87, accessonPreScrollOzD1aCkjd.write));
                                                            iSerializer = i88;
                                                        }
                                                        unsafe.putInt(obj2, j4, i43);
                                                    } else {
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iSerializer = i10;
                                                    }
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 60:
                                                    this = this;
                                                    obj2 = obj;
                                                    i43 = i43;
                                                    i12 = i11 == true ? 1 : 0;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    if (i50 == 2) {
                                                        Object objSerializer = this.serializer(i43, iIconCompatParcelizer, obj2);
                                                        getDispatcher getdispatcher2 = this.read(iIconCompatParcelizer);
                                                        i11 = i12 == true ? 1 : 0;
                                                        iSerializer = getOnKeyEvent.serializer(objSerializer, getdispatcher2, bArr, i10, i2, ismetapressedzmokqxo);
                                                        this.serializer(i43, iIconCompatParcelizer, obj2, objSerializer);
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        if (iSerializer == i10) {
                                                            i3 = i3;
                                                            i7 = iSerializer;
                                                            iIconCompatParcelizer = iIconCompatParcelizer;
                                                            iArr = iArr;
                                                            i9 = i11 == true ? 1 : 0;
                                                        } else {
                                                            i13 = iSerializer;
                                                        }
                                                    }
                                                    i11 = i12;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    iSerializer = i10;
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                                                    this = this;
                                                    obj2 = obj;
                                                    i43 = i43;
                                                    i12 = i11 == true ? 1 : 0;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    if (i50 == 2) {
                                                        int iRemoteActionCompatParcelizer3 = getOnKeyEvent.RemoteActionCompatParcelizer(bArr, i10, ismetapressedzmokqxo3);
                                                        unsafe.putObject(obj2, j, ismetapressedzmokqxo3.read);
                                                        unsafe.putInt(obj2, j4, i43);
                                                        iSerializer = iRemoteActionCompatParcelizer3;
                                                        i11 = i12;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        if (iSerializer == i10) {
                                                            i3 = i3;
                                                            i7 = iSerializer;
                                                            iIconCompatParcelizer = iIconCompatParcelizer;
                                                            iArr = iArr;
                                                            i9 = i11 == true ? 1 : 0;
                                                        } else {
                                                            i13 = iSerializer;
                                                        }
                                                    }
                                                    i11 = i12;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    iSerializer = i10;
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 63:
                                                    this = this;
                                                    obj2 = obj;
                                                    i43 = i43;
                                                    if (i50 == 0) {
                                                        iSerializer = getOnKeyEvent.write(bArr, i10, ismetapressedzmokqxo3);
                                                        int i89 = ismetapressedzmokqxo3.serializer;
                                                        getSwitchCharsetEK5gGoQ getswitchcharsetek5ggoqWrite4 = this.write(iIconCompatParcelizer);
                                                        if (getswitchcharsetek5ggoqWrite4 != null && !getswitchcharsetek5ggoqWrite4.IconCompatParcelizer(i89)) {
                                                            SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt3 = (SoftwareKeyboardInterceptionModifierKt) obj2;
                                                            NestedScrollNode nestedScrollNode5 = softwareKeyboardInterceptionModifierKt3.read;
                                                            nestedScrollNode = nestedScrollNode2;
                                                            if (nestedScrollNode5 == nestedScrollNode) {
                                                                nestedScrollNode5 = NestedScrollNode.read();
                                                                softwareKeyboardInterceptionModifierKt3.read = nestedScrollNode5;
                                                            }
                                                            Long lValueOf = Long.valueOf(i89);
                                                            i12 = i11 == true ? 1 : 0;
                                                            nestedScrollNode5.IconCompatParcelizer(i12 == true ? 1 : 0, lValueOf);
                                                        } else {
                                                            nestedScrollNode = nestedScrollNode2;
                                                            i12 = i11 == true ? 1 : 0;
                                                            unsafe.putObject(obj2, j, Integer.valueOf(i89));
                                                            unsafe.putInt(obj2, j4, i43);
                                                        }
                                                        i11 = i12;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        if (iSerializer == i10) {
                                                            i3 = i3;
                                                            i7 = iSerializer;
                                                            iIconCompatParcelizer = iIconCompatParcelizer;
                                                            iArr = iArr;
                                                            i9 = i11 == true ? 1 : 0;
                                                        } else {
                                                            i13 = iSerializer;
                                                        }
                                                    }
                                                    nestedScrollNode = nestedScrollNode2;
                                                    i12 = i11 == true ? 1 : 0;
                                                    i11 = i12;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    iSerializer = i10;
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 66:
                                                    this = this;
                                                    obj2 = obj;
                                                    i43 = i43;
                                                    if (i50 == 0) {
                                                        iSerializer = getOnKeyEvent.write(bArr, i10, ismetapressedzmokqxo3);
                                                        unsafe.putObject(obj2, j, Integer.valueOf(getGraphicModalMaxHeightDpannotations.IconCompatParcelizer(ismetapressedzmokqxo3.serializer)));
                                                        unsafe.putInt(obj2, j4, i43);
                                                        nestedScrollNode = nestedScrollNode2;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        if (iSerializer == i10) {
                                                            i3 = i3;
                                                            i7 = iSerializer;
                                                            iIconCompatParcelizer = iIconCompatParcelizer;
                                                            iArr = iArr;
                                                            i9 = i11 == true ? 1 : 0;
                                                        } else {
                                                            i13 = iSerializer;
                                                        }
                                                    }
                                                    nestedScrollNode = nestedScrollNode2;
                                                    i12 = i11 == true ? 1 : 0;
                                                    i11 = i12;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    iSerializer = i10;
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 67:
                                                    this = this;
                                                    obj2 = obj;
                                                    i43 = i43;
                                                    if (i50 == 0) {
                                                        int iSerializer5 = getOnKeyEvent.serializer(bArr, i10, ismetapressedzmokqxo3);
                                                        unsafe.putObject(obj2, j, Long.valueOf(getGraphicModalMaxHeightDpannotations.read(ismetapressedzmokqxo3.write)));
                                                        unsafe.putInt(obj2, j4, i43);
                                                        iSerializer = iSerializer5;
                                                        nestedScrollNode = nestedScrollNode2;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        if (iSerializer == i10) {
                                                            i3 = i3;
                                                            i7 = iSerializer;
                                                            iIconCompatParcelizer = iIconCompatParcelizer;
                                                            iArr = iArr;
                                                            i9 = i11 == true ? 1 : 0;
                                                        } else {
                                                            i13 = iSerializer;
                                                        }
                                                    }
                                                    nestedScrollNode = nestedScrollNode2;
                                                    i12 = i11 == true ? 1 : 0;
                                                    i11 = i12;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    iSerializer = i10;
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                                case 68:
                                                    if (i50 != 3) {
                                                        this = this;
                                                        obj2 = obj;
                                                        i43 = i43;
                                                        nestedScrollNode = nestedScrollNode2;
                                                        i12 = i11 == true ? 1 : 0;
                                                        i11 = i12;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iSerializer = i10;
                                                        if (iSerializer == i10) {
                                                            i3 = i3;
                                                            i7 = iSerializer;
                                                            iIconCompatParcelizer = iIconCompatParcelizer;
                                                            iArr = iArr;
                                                            i9 = i11 == true ? 1 : 0;
                                                        } else {
                                                            i13 = iSerializer;
                                                        }
                                                    } else {
                                                        this = this;
                                                        i43 = i43;
                                                        Object objSerializer2 = this.serializer(i43, iIconCompatParcelizer, obj);
                                                        obj2 = obj;
                                                        iSerializer = getOnKeyEvent.serializer(objSerializer2, this.read(iIconCompatParcelizer), bArr, i10, i2, ((i11 == true ? 1 : 0) & (-8)) | 4, ismetapressedzmokqxo);
                                                        this.serializer(i43, iIconCompatParcelizer, obj2, objSerializer2);
                                                        nestedScrollNode = nestedScrollNode2;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        if (iSerializer == i10) {
                                                            i3 = i3;
                                                            i7 = iSerializer;
                                                            iIconCompatParcelizer = iIconCompatParcelizer;
                                                            iArr = iArr;
                                                            i9 = i11 == true ? 1 : 0;
                                                        } else {
                                                            i13 = iSerializer;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    this = this;
                                                    obj2 = obj;
                                                    iIconCompatParcelizer = iIconCompatParcelizer;
                                                    i43 = i43;
                                                    nestedScrollNode = nestedScrollNode2;
                                                    iSerializer = i10;
                                                    if (iSerializer == i10) {
                                                        i3 = i3;
                                                        i7 = iSerializer;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        iArr = iArr;
                                                        i9 = i11 == true ? 1 : 0;
                                                    } else {
                                                        i13 = iSerializer;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            if (i50 == 2) {
                                                int i90 = iIconCompatParcelizer / 3;
                                                Object obj7 = objArr7[i90 + i90];
                                                Unsafe unsafe6 = unsafe5;
                                                Object object = unsafe6.getObject(obj, j);
                                                if (!((getScopeui) object).serializer) {
                                                    getScopeui getscopeuiSerializer = getScopeui.read.serializer();
                                                    onInterceptKeyBeforeSoftKeyboard.write(getscopeuiSerializer, object);
                                                    unsafe6.putObject(obj, j, getscopeuiSerializer);
                                                    object = getscopeuiSerializer;
                                                }
                                                zzz zzzVar = ((NestedScrollConnectionDefaultImpls) obj7).RemoteActionCompatParcelizer;
                                                getScopeui getscopeui2 = (getScopeui) object;
                                                int iWrite16 = getOnKeyEvent.write(bArr, i10, ismetapressedzmokqxo3);
                                                int i91 = ismetapressedzmokqxo3.serializer;
                                                if (i91 < 0 || i91 > i2 - iWrite16) {
                                                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                int i92 = i91 + iWrite16;
                                                Object obj8 = obj6;
                                                Object obj9 = obj8;
                                                while (iWrite16 < i92) {
                                                    Object obj10 = obj8;
                                                    int iWrite17 = iWrite16 + 1;
                                                    int i93 = bArr[iWrite16];
                                                    if (i93 < 0) {
                                                        iWrite17 = getOnKeyEvent.write(i93, bArr, iWrite17, ismetapressedzmokqxo3);
                                                        i93 = ismetapressedzmokqxo3.serializer;
                                                    }
                                                    Object obj11 = obj9;
                                                    int i94 = i93 >>> 3;
                                                    int i95 = i92;
                                                    int i96 = i93 & 7;
                                                    getScopeui getscopeui3 = getscopeui2;
                                                    if (i94 != 1) {
                                                        if (i94 == 2) {
                                                            getNestedCoroutineScope getnestedcoroutinescope = (getNestedCoroutineScope) zzzVar.write;
                                                            if (i96 == getnestedcoroutinescope.zzb()) {
                                                                objArr2 = objArr7;
                                                                unsafe3 = unsafe6;
                                                                i16 = i95;
                                                                obj11 = obj11;
                                                                i15 = i86;
                                                                getscopeui = getscopeui3;
                                                                obj4 = obj6;
                                                                iWrite16 = serializer(bArr, iWrite17, i2, getnestedcoroutinescope, obj6.getClass(), ismetapressedzmokqxo);
                                                                obj8 = ismetapressedzmokqxo3.read;
                                                            } else {
                                                                obj4 = obj6;
                                                                objArr2 = objArr7;
                                                                i15 = i86;
                                                                getscopeui = getscopeui3;
                                                                unsafe3 = unsafe6;
                                                                i16 = i95;
                                                            }
                                                        } else {
                                                            obj4 = obj6;
                                                            objArr2 = objArr7;
                                                            i15 = i86;
                                                            obj11 = obj11;
                                                            getscopeui = getscopeui3;
                                                            unsafe3 = unsafe6;
                                                            i16 = i95;
                                                            iWrite16 = getOnKeyEvent.IconCompatParcelizer(i93, bArr, iWrite17, i2, ismetapressedzmokqxo3);
                                                            obj8 = obj10;
                                                        }
                                                        obj9 = obj11;
                                                        getscopeui2 = getscopeui;
                                                        i92 = i16;
                                                        unsafe6 = unsafe3;
                                                        objArr7 = objArr2;
                                                        i86 = i15;
                                                        obj6 = obj4;
                                                    } else {
                                                        obj4 = obj6;
                                                        objArr2 = objArr7;
                                                        i15 = i86;
                                                        getscopeui = getscopeui3;
                                                        unsafe3 = unsafe6;
                                                        i16 = i95;
                                                        getNestedCoroutineScope getnestedcoroutinescope2 = (getNestedCoroutineScope) zzzVar.IconCompatParcelizer;
                                                        if (i96 == getnestedcoroutinescope2.zzb()) {
                                                            iWrite16 = serializer(bArr, iWrite17, i2, getnestedcoroutinescope2, null, ismetapressedzmokqxo);
                                                            obj9 = ismetapressedzmokqxo3.read;
                                                            obj8 = obj10;
                                                        }
                                                        getscopeui2 = getscopeui;
                                                        i92 = i16;
                                                        unsafe6 = unsafe3;
                                                        objArr7 = objArr2;
                                                        i86 = i15;
                                                        obj6 = obj4;
                                                    }
                                                    iWrite16 = getOnKeyEvent.IconCompatParcelizer(i93, bArr, iWrite17, i2, ismetapressedzmokqxo3);
                                                    obj8 = obj10;
                                                    obj9 = obj11;
                                                    getscopeui2 = getscopeui;
                                                    i92 = i16;
                                                    unsafe6 = unsafe3;
                                                    objArr7 = objArr2;
                                                    i86 = i15;
                                                    obj6 = obj4;
                                                }
                                                Object obj12 = obj8;
                                                objArr = objArr7;
                                                i11 = i86;
                                                Unsafe unsafe7 = unsafe6;
                                                Object obj13 = obj9;
                                                int i97 = i92;
                                                getScopeui getscopeui4 = getscopeui2;
                                                if (iWrite16 == i97) {
                                                    getscopeui4.put(obj13, obj12);
                                                    if (i97 != i10) {
                                                        this = this;
                                                        obj2 = obj;
                                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                                        i13 = i97;
                                                        unsafe = unsafe7;
                                                        i43 = i43;
                                                    } else {
                                                        obj2 = obj;
                                                        i7 = i97;
                                                        unsafe = unsafe7;
                                                        i9 = i11 == true ? 1 : 0;
                                                    }
                                                } else {
                                                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Failed to parse the message.");
                                                    return 0;
                                                }
                                            } else {
                                                obj3 = obj;
                                                objArr = objArr7;
                                                i14 = i86 == true ? 1 : 0;
                                                unsafe2 = unsafe5;
                                            }
                                            nestedScrollNode = nestedScrollNode2;
                                        }
                                        iWrite3 = i13;
                                        iIconCompatParcelizer = iIconCompatParcelizer;
                                        i5 = i5;
                                        i4 = i8;
                                        i39 = i11;
                                    }
                                    obj5 = obj2;
                                    i43 = i43;
                                    unsafe4 = unsafe;
                                    getnestedscrollnodeui = this;
                                } else if (i50 == 2) {
                                    onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer2 = (onPostFlingRZ2iAVYsuspendImpl) unsafe4.getObject(obj5, j);
                                    if (!((KeyInputElement) onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer2).write) {
                                        int size3 = onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer2.size();
                                        onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer2 = onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(size3 == 0 ? 10 : size3 + size3);
                                        unsafe4.putObject(obj5, j, onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer2);
                                    }
                                    iWrite3 = getOnKeyEvent.RemoteActionCompatParcelizer(getnestedscrollnodeui.read(iIconCompatParcelizer), i62 == true ? 1 : 0, bArr, i61, i2, onpostflingrz2iavysuspendimplRemoteActionCompatParcelizer2, ismetapressedzmokqxo);
                                    i39 = i62 == true ? 1 : 0;
                                    i5 = i5;
                                    i4 = i4;
                                    i2 = i2;
                                } else {
                                    i8 = i4;
                                    objArr = objArr5;
                                    obj3 = obj5;
                                    i14 = i62 == true ? 1 : 0;
                                    nestedScrollNode2 = nestedScrollNode2;
                                    unsafe2 = unsafe4;
                                    i10 = i61;
                                }
                                iWrite3 = i10;
                                i5 = i5;
                                i22 = i8;
                                i39 = i14;
                                i7 = iWrite3;
                                i9 = i39;
                                i5 = i5;
                                i8 = i22;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                nestedScrollNode = nestedScrollNode2;
                            }
                        }
                        if (i9 != i3 || i3 == 0) {
                            SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt4 = (SoftwareKeyboardInterceptionModifierKt) obj2;
                            NestedScrollNode nestedScrollNode6 = softwareKeyboardInterceptionModifierKt4.read;
                            if (nestedScrollNode6 == nestedScrollNode) {
                                nestedScrollNode6 = NestedScrollNode.read();
                                softwareKeyboardInterceptionModifierKt4.read = nestedScrollNode6;
                            }
                            iWrite3 = getOnKeyEvent.write(i9 == true ? 1 : 0, bArr, i7, i2, nestedScrollNode6, ismetapressedzmokqxo);
                            iIconCompatParcelizer = iIconCompatParcelizer;
                            i39 = i9;
                            i43 = i43;
                            i5 = i5;
                            i4 = i8;
                            obj5 = obj2;
                            unsafe4 = unsafe;
                            getnestedscrollnodeui = this;
                        } else {
                            iWrite3 = i7;
                            i39 = i9;
                            i5 = i5;
                            i4 = i8;
                        }
                    } else {
                        objArr = objArr5;
                        iArr = iArr2;
                        nestedScrollNode = nestedScrollNode2;
                        oninterceptkeybeforesoftkeyboard = oninterceptkeybeforesoftkeyboard2;
                        this = getnestedscrollnodeui;
                        unsafe = unsafe4;
                        obj2 = obj5;
                        i3 = i3;
                    }
                }
            }
            if (i4 != 1048575) {
                unsafe.putInt(obj2, i4, i5);
            }
            int i98 = this.RatingCompat;
            NestedScrollNode nestedScrollNode7 = null;
            while (i98 < this.MediaBrowserCompatMediaItem) {
                int i99 = this.MediaSessionCompatQueueItem[i98];
                int i100 = iArr[i99];
                Object objWrite = resetDispatcherFields.write(this.RemoteActionCompatParcelizer(i99) & 1048575, obj2);
                if (objWrite != null && (getswitchcharsetek5ggoqWrite = this.write(i99)) != null) {
                    int i101 = i99 / 3;
                    zzz zzzVar2 = ((NestedScrollConnectionDefaultImpls) objArr[i101 + i101]).RemoteActionCompatParcelizer;
                    Iterator it = ((getScopeui) objWrite).entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!getswitchcharsetek5ggoqWrite.IconCompatParcelizer(((Integer) entry.getValue()).intValue())) {
                            if (nestedScrollNode7 == null) {
                                oninterceptkeybeforesoftkeyboard.getClass();
                                SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt5 = (SoftwareKeyboardInterceptionModifierKt) obj2;
                                NestedScrollNode nestedScrollNode8 = softwareKeyboardInterceptionModifierKt5.read;
                                if (nestedScrollNode8 == nestedScrollNode) {
                                    nestedScrollNode8 = NestedScrollNode.read();
                                    softwareKeyboardInterceptionModifierKt5.read = nestedScrollNode8;
                                }
                                nestedScrollNode7 = nestedScrollNode8;
                            }
                            int i102 = NestedScrollConnectionDefaultImpls.read(zzzVar2, entry.getKey(), entry.getValue());
                            onPreviewKeyEvent onpreviewkeyevent = onPreviewKeyEvent.IconCompatParcelizer;
                            byte[] bArr2 = new byte[i102];
                            KeyInputModifierKt keyInputModifierKt = new KeyInputModifierKt(bArr2, i102);
                            try {
                                NestedScrollConnectionDefaultImpls.RemoteActionCompatParcelizer(keyInputModifierKt, zzzVar2, entry.getKey(), entry.getValue());
                                if (i102 - keyInputModifierKt.MediaMetadataCompat == 0) {
                                    nestedScrollNode7.IconCompatParcelizer((i100 << 3) | 2, new onPreviewKeyEvent(bArr2));
                                    it.remove();
                                } else {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Did not write as much data as expected.");
                                    return 0;
                                }
                            } catch (IOException e) {
                                DrawableTransformation.read((Throwable) e);
                                return 0;
                            }
                        }
                        nestedScrollNode = nestedScrollNode;
                        iArr = iArr;
                    }
                }
                i98++;
                nestedScrollNode = nestedScrollNode;
                iArr = iArr;
            }
            if (nestedScrollNode7 != null) {
                ((SoftwareKeyboardInterceptionModifierKt) obj2).read = nestedScrollNode7;
            }
            if (i3 == 0) {
                if (iWrite3 != i2) {
                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Failed to parse the message.");
                    return 0;
                }
            } else if (iWrite3 > i2 || i39 != i3) {
                GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Failed to parse the message.");
                return 0;
            }
            return iWrite3;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Mutating immutable message: ".concat(String.valueOf(obj)));
        return 0;
    }
}
