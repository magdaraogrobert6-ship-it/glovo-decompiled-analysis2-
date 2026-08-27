package com.google.protobuf;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.Vw$Vw;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.ClipboardExtensions_androidKt;
import o.ComposeView;
import o.CompositionLocalsKtLocalClipboard1;
import o.CompositionLocalsKtLocalClipboardManager1;
import o.CompositionLocalsKtLocalLocale1;
import o.CompositionLocalsKtLocalProvidableScrollCaptureInProgress1;
import o.CompositionLocalsKtLocalWindowInfo1;
import o.DefaultHapticFeedback;
import o.DisposableSaveableStateRegistrylambda0;
import o.DrawableTransformation;
import o.GlobalSnapshotManagerensureStarted2;
import o.GraphicsLayerOwnerLayer;
import o.GraphicsLayerOwnerLayerrecordLambda1;
import o.IndirectPointerNavigationGestureDetector;
import o.ProvideCompositionLocalsui;
import o.canBeSaved;
import o.component250nO6VwU;
import o.component26;
import o.decodeByte;
import o.decodeFontSynthesisGVVA2EU;
import o.decodeSpanStyle;
import o.decodeString;
import o.fromDpSizeitqla9I;
import o.fromPxSizeviCIZxY;
import o.getClipMetadata;
import o.getElevation;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getLocalSoftwareKeyboardController;
import o.getPxSizeYbymL2g;
import o.isAppSetIdReadingEnabled;
import o.onDown;
import o.onLongPress;
import o.onScroll;
import o.performSave;
import o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY;
import o.r8lambdavXWQ89TxHQ24MnxQcigE5jRzS1E;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.registerProvider;
import o.setClipToBounds;
import o.setDirty;
import o.setHasOverlappingRendering;
import o.transformMatrixToWindowEL8BTi8;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageSchema implements DisposableSaveableStateRegistrylambda0 {
    public static final int[] RemoteActionCompatParcelizer = new int[0];
    public static final Unsafe read = setDirty.serializer();
    public final int ComponentActivity;
    public final getElevation IconCompatParcelizer;
    public final int[] MediaBrowserCompatMediaItem;
    public final getLocalSoftwareKeyboardController MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final Object[] MediaSessionCompatResultReceiverWrapper;
    public final setHasOverlappingRendering MediaSessionCompatToken;
    public final getPxSizeYbymL2g ParcelableVolumeInfo;
    public final int PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public final decodeSpanStyle RatingCompat;
    public final UnknownFieldSchema r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int serializer;
    public final int[] write;

    public static int IconCompatParcelizer(int i) {
        return (i & 267386880) >>> 20;
    }

    public static long read(int i) {
        return i & 1048575;
    }

    public static long IconCompatParcelizer(long j, Object obj) {
        return ((Long) setDirty.RatingCompat.RatingCompat(j, obj)).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0250  */
    /* JADX WARN: Code duplicated, block: B:123:0x0253  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:127:0x026c  */
    public static MessageSchema RemoteActionCompatParcelizer(canBeSaved canbesaved, setHasOverlappingRendering sethasoverlappingrendering, decodeSpanStyle decodespanstyle, UnknownFieldSchema unknownFieldSchema, getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller, getPxSizeYbymL2g getpxsizeybyml2g) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
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
        int[] iArr2;
        char c;
        int iObjectFieldOffset;
        int i17;
        int i18;
        int iObjectFieldOffset2;
        java.lang.reflect.Field fieldSerializer;
        int i19;
        char cCharAt9;
        int i20;
        int i21;
        int i22;
        Object obj;
        java.lang.reflect.Field fieldSerializer2;
        int i23;
        Object obj2;
        java.lang.reflect.Field fieldSerializer3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        canBeSaved canbesaved2 = canbesaved;
        String str = canbesaved2.write;
        int length = str.length();
        char c2 = 55296;
        if (str.charAt(0) >= 55296) {
            int i28 = 1;
            while (true) {
                i = i28 + 1;
                if (str.charAt(i28) < 55296) {
                    break;
                }
                i28 = i;
            }
        } else {
            i = 1;
        }
        int i29 = i + 1;
        int iCharAt4 = str.charAt(i);
        if (iCharAt4 >= 55296) {
            int i30 = iCharAt4 & 8191;
            int i31 = 13;
            while (true) {
                i27 = i29 + 1;
                cCharAt13 = str.charAt(i29);
                if (cCharAt13 < 55296) {
                    break;
                }
                i30 |= (cCharAt13 & 8191) << i31;
                i31 += 13;
                i29 = i27;
            }
            iCharAt4 = i30 | (cCharAt13 << i31);
            i29 = i27;
        }
        if (iCharAt4 == 0) {
            iCharAt2 = 0;
            iCharAt3 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i2 = i29;
            iArr = RemoteActionCompatParcelizer;
            iCharAt = 0;
        } else {
            int i32 = i29 + 1;
            iCharAt = str.charAt(i29);
            if (iCharAt >= 55296) {
                int i33 = iCharAt & 8191;
                int i34 = 13;
                while (true) {
                    i14 = i32 + 1;
                    cCharAt8 = str.charAt(i32);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt8 & 8191) << i34;
                    i34 += 13;
                    i32 = i14;
                }
                iCharAt = i33 | (cCharAt8 << i34);
                i32 = i14;
            }
            int i35 = i32 + 1;
            int iCharAt5 = str.charAt(i32);
            if (iCharAt5 >= 55296) {
                int i36 = iCharAt5 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    cCharAt7 = str.charAt(i35);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt7 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                iCharAt5 = i36 | (cCharAt7 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int iCharAt6 = str.charAt(i35);
            if (iCharAt6 >= 55296) {
                int i39 = iCharAt6 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    cCharAt6 = str.charAt(i38);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt6 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                iCharAt6 = i39 | (cCharAt6 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            int iCharAt7 = str.charAt(i38);
            if (iCharAt7 >= 55296) {
                int i42 = iCharAt7 & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    cCharAt5 = str.charAt(i41);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt5 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                iCharAt7 = i42 | (cCharAt5 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            iCharAt2 = str.charAt(i41);
            if (iCharAt2 >= 55296) {
                int i45 = iCharAt2 & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    cCharAt4 = str.charAt(i44);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt4 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                iCharAt2 = i45 | (cCharAt4 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            iCharAt3 = str.charAt(i44);
            if (iCharAt3 >= 55296) {
                int i48 = iCharAt3 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    cCharAt3 = str.charAt(i47);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt3 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                iCharAt3 = i48 | (cCharAt3 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int iCharAt8 = str.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    cCharAt2 = str.charAt(i50);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt2 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                iCharAt8 = i51 | (cCharAt2 << i52);
                i50 = i8;
            }
            i2 = i50 + 1;
            int iCharAt9 = str.charAt(i50);
            if (iCharAt9 >= 55296) {
                int i53 = iCharAt9 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i2 + 1;
                    cCharAt = str.charAt(i2);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i53 |= (cCharAt & 8191) << i54;
                    i54 += 13;
                    i2 = i7;
                }
                iCharAt9 = i53 | (cCharAt << i54);
                i2 = i7;
            }
            i3 = (iCharAt * 2) + iCharAt5;
            i4 = iCharAt6;
            i5 = iCharAt7;
            iArr = new int[iCharAt9 + iCharAt3 + iCharAt8];
            i6 = iCharAt9;
        }
        Unsafe unsafe = read;
        Object[] objArr = canbesaved2.IconCompatParcelizer;
        Class<?> cls = canbesaved2.serializer.getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 * 2];
        int i55 = i6 + iCharAt3;
        int i56 = 0;
        int i57 = 0;
        int i58 = i6;
        int i59 = i55;
        while (i2 < length) {
            int i60 = i2 + 1;
            int iCharAt10 = str.charAt(i2);
            if (iCharAt10 >= c2) {
                int i61 = iCharAt10 & 8191;
                int i62 = i60;
                int i63 = 13;
                while (true) {
                    i26 = i62 + 1;
                    cCharAt12 = str.charAt(i62);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i61 |= (cCharAt12 & 8191) << i63;
                    i63 += 13;
                    i62 = i26;
                }
                iCharAt10 = i61 | (cCharAt12 << i63);
                i15 = i26;
            } else {
                i15 = i60;
            }
            int i64 = i15 + 1;
            int iCharAt11 = str.charAt(i15);
            if (iCharAt11 >= c2) {
                int i65 = iCharAt11 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i25 = i66 + 1;
                    cCharAt11 = str.charAt(i66);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i65 |= (cCharAt11 & 8191) << i67;
                    i67 += 13;
                    i66 = i25;
                }
                iCharAt11 = i65 | (cCharAt11 << i67);
                i16 = i25;
            } else {
                i16 = i64;
            }
            int i68 = iCharAt11 & 255;
            if ((iCharAt11 & Fields.RotationZ) != 0) {
                iArr[i57] = i56;
                i57++;
            }
            if (i68 >= 51) {
                int i69 = i16 + 1;
                int iCharAt12 = str.charAt(i16);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i70 = iCharAt12 & 8191;
                    int i71 = 13;
                    while (true) {
                        i24 = i69 + 1;
                        cCharAt10 = str.charAt(i69);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i70 |= (cCharAt10 & 8191) << i71;
                        i71 += 13;
                        i69 = i24;
                        c3 = 55296;
                    }
                    iCharAt12 = i70 | (cCharAt10 << i71);
                    i69 = i24;
                }
                int i72 = i68 - 51;
                if (i72 == 9 || i72 == 17) {
                    i21 = 2;
                    objArr2[ff$$ExternalSyntheticOutline0.m(i56, 3, 2, 1)] = objArr[i3];
                } else {
                    if (i72 != 12 || (!canbesaved.IconCompatParcelizer().equals(component250nO6VwU.PROTO2) && (iCharAt11 & Fields.CameraDistance) == 0)) {
                        i69 = i69;
                        i21 = 2;
                    } else {
                        i21 = 2;
                        objArr2[ff$$ExternalSyntheticOutline0.m(i56, 3, 2, 1)] = objArr[i3];
                    }
                    i22 = iCharAt12 * i21;
                    obj = objArr[i22];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldSerializer2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldSerializer2 = serializer(cls, (String) obj);
                        objArr[i22] = fieldSerializer2;
                    }
                    int[] iArr4 = iArr3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldSerializer2);
                    i23 = i22 + 1;
                    obj2 = objArr[i23];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldSerializer3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldSerializer3 = serializer(cls, (String) obj2);
                        objArr[i23] = fieldSerializer3;
                    }
                    str = str;
                    iArr2 = iArr4;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldSerializer3);
                    i17 = i69;
                    i18 = 0;
                    c = 2;
                }
                i3++;
                i22 = iCharAt12 * i21;
                obj = objArr[i22];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldSerializer2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldSerializer2 = serializer(cls, (String) obj);
                    objArr[i22] = fieldSerializer2;
                }
                int[] iArr5 = iArr3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldSerializer2);
                i23 = i22 + 1;
                obj2 = objArr[i23];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldSerializer3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldSerializer3 = serializer(cls, (String) obj2);
                    objArr[i23] = fieldSerializer3;
                }
                str = str;
                iArr2 = iArr5;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldSerializer3);
                i17 = i69;
                i18 = 0;
                c = 2;
            } else {
                iArr2 = iArr3;
                i3++;
                java.lang.reflect.Field fieldSerializer4 = serializer(cls, (String) objArr[i3]);
                if (i68 == 9 || i68 == 17) {
                    iArr2 = iArr2;
                    objArr2[ff$$ExternalSyntheticOutline0.m(i56, 3, 2, 1)] = fieldSerializer4.getType();
                } else {
                    if (i68 == 27 || i68 == 49) {
                        i20 = i3 + 2;
                        objArr2[ff$$ExternalSyntheticOutline0.m(i56, 3, 2, 1)] = objArr[i3];
                    } else if (i68 == 12 || i68 == 30 || i68 == 44) {
                        if (canbesaved.IconCompatParcelizer() == component250nO6VwU.PROTO2 || (iCharAt11 & Fields.CameraDistance) != 0) {
                            i20 = i3 + 2;
                            objArr2[ff$$ExternalSyntheticOutline0.m(i56, 3, 2, 1)] = objArr[i3];
                        }
                    } else if (i68 == 50) {
                        int i73 = i58 + 1;
                        iArr[i58] = i56;
                        int i74 = (i56 / 3) * 2;
                        int i75 = i3 + 2;
                        objArr2[i74] = objArr[i3];
                        if ((iCharAt11 & Fields.CameraDistance) != 0) {
                            i3 += 3;
                            objArr2[i74 + 1] = objArr[i75];
                            i58 = i73;
                        } else {
                            i58 = i73;
                            i3 = i75;
                        }
                    }
                    i3 = i20;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldSerializer4);
                if ((iCharAt11 & Fields.TransformOrigin) == 0 || i68 > 17) {
                    c = 2;
                    iObjectFieldOffset = 1048575;
                    i17 = i16;
                    i18 = 0;
                } else {
                    i17 = i16 + 1;
                    int iCharAt13 = str.charAt(i16);
                    if (iCharAt13 >= 55296) {
                        int i76 = iCharAt13 & 8191;
                        int i77 = 13;
                        while (true) {
                            i19 = i17 + 1;
                            cCharAt9 = str.charAt(i17);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i76 |= (cCharAt9 & 8191) << i77;
                            i77 += 13;
                            i17 = i19;
                        }
                        iCharAt13 = i76 | (cCharAt9 << i77);
                        i17 = i19;
                    }
                    c = 2;
                    int i78 = (iCharAt13 / 32) + (iCharAt * 2);
                    Object obj3 = objArr[i78];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        fieldSerializer = (java.lang.reflect.Field) obj3;
                    } else {
                        fieldSerializer = serializer(cls, (String) obj3);
                        objArr[i78] = fieldSerializer;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldSerializer);
                    i18 = iCharAt13 % 32;
                }
                if (i68 >= 18 && i68 <= 49) {
                    iArr[i59] = iObjectFieldOffset3;
                    i59++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            iArr2[i56] = iCharAt10;
            iArr2[i56 + 1] = ((iCharAt11 & Fields.RotationY) != 0 ? 536870912 : 0) | ((iCharAt11 & Fields.RotationX) != 0 ? 268435456 : 0) | ((iCharAt11 & Fields.CameraDistance) != 0 ? Integer.MIN_VALUE : 0) | (i68 << 20) | iObjectFieldOffset2;
            iArr2[i56 + 2] = iObjectFieldOffset | (i18 << 20);
            i56 += 3;
            i2 = i17;
            str = str;
            iArr3 = iArr2;
            length = length;
            c2 = 55296;
            canbesaved2 = canbesaved;
        }
        getElevation getelevation = canbesaved2.serializer;
        canbesaved.IconCompatParcelizer();
        return new MessageSchema(iArr3, objArr2, i4, i5, getelevation, iArr, i6, i55, sethasoverlappingrendering, decodespanstyle, unknownFieldSchema, getlocalsoftwarekeyboardcontroller, getpxsizeybyml2g);
    }

    public static GraphicsLayerOwnerLayer RemoteActionCompatParcelizer(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = generatedMessageLite.RemoteActionCompatParcelizer;
        if (graphicsLayerOwnerLayer != GraphicsLayerOwnerLayer.serializer) {
            return graphicsLayerOwnerLayer;
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer2 = new GraphicsLayerOwnerLayer();
        generatedMessageLite.RemoteActionCompatParcelizer = graphicsLayerOwnerLayer2;
        return graphicsLayerOwnerLayer2;
    }

    public static int read(byte[] bArr, int i, int i2, onScroll onscroll, Class cls, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        switch (setClipToBounds.RemoteActionCompatParcelizer[onscroll.ordinal()]) {
            case 1:
                int iIconCompatParcelizer = ArrayDecoders.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Boolean.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0);
                return iIconCompatParcelizer;
            case 2:
                return ArrayDecoders.serializer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
            case 3:
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Double.valueOf(ArrayDecoders.IconCompatParcelizer(i, bArr));
                return i + 8;
            case 4:
            case 5:
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Integer.valueOf(ArrayDecoders.serializer(i, bArr));
                return i + 4;
            case 6:
            case 7:
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Long.valueOf(ArrayDecoders.read(i, bArr));
                return i + 8;
            case 8:
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Float.valueOf(ArrayDecoders.write(i, bArr));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iRemoteActionCompatParcelizer = ArrayDecoders.RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Integer.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer);
                return iRemoteActionCompatParcelizer;
            case 12:
            case 13:
                int iIconCompatParcelizer2 = ArrayDecoders.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Long.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer);
                return iIconCompatParcelizer2;
            case 14:
                return ArrayDecoders.write(component26.IconCompatParcelizer.read(cls), bArr, i, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            case 15:
                int iRemoteActionCompatParcelizer2 = ArrayDecoders.RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Integer.valueOf(CodedInputStream.write(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
                return iRemoteActionCompatParcelizer2;
            case 16:
                int iIconCompatParcelizer3 = ArrayDecoders.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Long.valueOf(CodedInputStream.read(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
                return iIconCompatParcelizer3;
            case 17:
                return ArrayDecoders.write(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
            default:
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("unsupported field type.");
                return 0;
        }
    }

    public static int serializer(long j, Object obj) {
        return ((Integer) setDirty.RatingCompat.RatingCompat(j, obj)).intValue();
    }

    public final int IconCompatParcelizer(int i, int i2) {
        int[] iArr = this.write;
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

    public final void IconCompatParcelizer(Object obj, long j, CodedInputStreamReader codedInputStreamReader, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        List listIconCompatParcelizer = this.RatingCompat.IconCompatParcelizer(j, obj);
        CodedInputStream codedInputStream = codedInputStreamReader.serializer;
        int i = codedInputStreamReader.IconCompatParcelizer;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.serializer();
        }
        do {
            Object obj2 = disposableSaveableStateRegistrylambda0.read();
            codedInputStreamReader.read(obj2, disposableSaveableStateRegistrylambda0, getlocalprovidablescrollcaptureinprogress);
            disposableSaveableStateRegistrylambda0.read(obj2);
            listIconCompatParcelizer.add(obj2);
            if (codedInputStream.IconCompatParcelizer() || codedInputStreamReader.RemoteActionCompatParcelizer != 0) {
                return;
            } else {
                iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            }
        } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == i);
        codedInputStreamReader.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final boolean IconCompatParcelizer(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        boolean z;
        int[] iArr = this.write;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i);
            long j = iMediaSessionCompatQueueItem & 1048575;
            switch (IconCompatParcelizer(iMediaSessionCompatQueueItem)) {
                case 0:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
                        if (Double.doubleToLongBits(graphicsLayerOwnerLayerrecordLambda1.RemoteActionCompatParcelizer(j, generatedMessageLite)) == Double.doubleToLongBits(graphicsLayerOwnerLayerrecordLambda1.RemoteActionCompatParcelizer(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda2 = setDirty.RatingCompat;
                        if (Float.floatToIntBits(graphicsLayerOwnerLayerrecordLambda2.read(j, generatedMessageLite)) == Float.floatToIntBits(graphicsLayerOwnerLayerrecordLambda2.read(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda3 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda3.MediaDescriptionCompat(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda3.MediaDescriptionCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 3:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda4 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda4.MediaDescriptionCompat(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda4.MediaDescriptionCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 4:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda5 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda5.IconCompatParcelizer(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda5.IconCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 5:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda6 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda6.MediaDescriptionCompat(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda6.MediaDescriptionCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 6:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda7 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda7.IconCompatParcelizer(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda7.IconCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 7:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda8 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda8.write(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda8.write(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 8:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda9 = setDirty.RatingCompat;
                        if (registerProvider.read(graphicsLayerOwnerLayerrecordLambda9.RatingCompat(j, generatedMessageLite), graphicsLayerOwnerLayerrecordLambda9.RatingCompat(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 9:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda10 = setDirty.RatingCompat;
                        if (registerProvider.read(graphicsLayerOwnerLayerrecordLambda10.RatingCompat(j, generatedMessageLite), graphicsLayerOwnerLayerrecordLambda10.RatingCompat(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 10:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda11 = setDirty.RatingCompat;
                        if (registerProvider.read(graphicsLayerOwnerLayerrecordLambda11.RatingCompat(j, generatedMessageLite), graphicsLayerOwnerLayerrecordLambda11.RatingCompat(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 11:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda12 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda12.IconCompatParcelizer(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda12.IconCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 12:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda13 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda13.IconCompatParcelizer(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda13.IconCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 13:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda14 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda14.IconCompatParcelizer(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda14.IconCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 14:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda15 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda15.MediaDescriptionCompat(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda15.MediaDescriptionCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 15:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda16 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda16.IconCompatParcelizer(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda16.IconCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 16:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda17 = setDirty.RatingCompat;
                        if (graphicsLayerOwnerLayerrecordLambda17.MediaDescriptionCompat(j, generatedMessageLite) == graphicsLayerOwnerLayerrecordLambda17.MediaDescriptionCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 17:
                    if (write(generatedMessageLite, generatedMessageLite2, i)) {
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda18 = setDirty.RatingCompat;
                        if (registerProvider.read(graphicsLayerOwnerLayerrecordLambda18.RatingCompat(j, generatedMessageLite), graphicsLayerOwnerLayerrecordLambda18.RatingCompat(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
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
                case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                case 49:
                    GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda19 = setDirty.RatingCompat;
                    z = registerProvider.read(graphicsLayerOwnerLayerrecordLambda19.RatingCompat(j, generatedMessageLite), graphicsLayerOwnerLayerrecordLambda19.RatingCompat(j, generatedMessageLite2));
                    break;
                case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda20 = setDirty.RatingCompat;
                    z = registerProvider.read(graphicsLayerOwnerLayerrecordLambda20.RatingCompat(j, generatedMessageLite), graphicsLayerOwnerLayerrecordLambda20.RatingCompat(j, generatedMessageLite2));
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
                case RectListKt.BitOffsetForFocusable /* 61 */:
                case RectListKt.BitOffsetForGesturable /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = iArr[i + 2] & 1048575;
                    GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda21 = setDirty.RatingCompat;
                    if (graphicsLayerOwnerLayerrecordLambda21.IconCompatParcelizer(j2, generatedMessageLite) != graphicsLayerOwnerLayerrecordLambda21.IconCompatParcelizer(j2, generatedMessageLite2) || !registerProvider.read(graphicsLayerOwnerLayerrecordLambda21.RatingCompat(j, generatedMessageLite), graphicsLayerOwnerLayerrecordLambda21.RatingCompat(j, generatedMessageLite2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!z) {
                return false;
            }
        }
        GlobalSnapshotManagerensureStarted2 globalSnapshotManagerensureStarted2 = (GlobalSnapshotManagerensureStarted2) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        globalSnapshotManagerensureStarted2.getClass();
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = generatedMessageLite.RemoteActionCompatParcelizer;
        globalSnapshotManagerensureStarted2.getClass();
        if (graphicsLayerOwnerLayer.equals(generatedMessageLite2.RemoteActionCompatParcelizer)) {
            if (!this.MediaSessionCompatQueueItem) {
                return true;
            }
            this.MediaDescriptionCompat.getClass();
            return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
        }
        return false;
    }

    public final int MediaSessionCompatQueueItem(int i) {
        return this.write[i + 1];
    }

    public final void RemoteActionCompatParcelizer(Object obj, int i, Object obj2) {
        read.putObject(obj, MediaSessionCompatQueueItem(i) & 1048575, obj2);
        write(i, obj);
    }

    public final boolean RemoteActionCompatParcelizer(int i, int i2, Object obj) {
        return setDirty.RatingCompat.IconCompatParcelizer((long) (this.write[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0219 A[PHI: r3
  0x0219: PHI (r3v30 int) = (r3v10 int), (r3v33 int) binds: [B:82:0x0217, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.DisposableSaveableStateRegistrylambda0
    public final int read(GeneratedMessageLite generatedMessageLite) {
        int i;
        int iIconCompatParcelizer;
        int i2;
        int iHashCode;
        int[] iArr = this.write;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iMediaSessionCompatQueueItem;
            int i6 = 1237;
            switch (IconCompatParcelizer(iMediaSessionCompatQueueItem)) {
                case 0:
                    i = i3 * 53;
                    iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(Double.doubleToLongBits(setDirty.RatingCompat.RemoteActionCompatParcelizer(j, generatedMessageLite)));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iIconCompatParcelizer = Float.floatToIntBits(setDirty.RatingCompat.read(j, generatedMessageLite));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(setDirty.RatingCompat.MediaDescriptionCompat(j, generatedMessageLite));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(setDirty.RatingCompat.MediaDescriptionCompat(j, generatedMessageLite));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iIconCompatParcelizer = setDirty.RatingCompat.IconCompatParcelizer(j, generatedMessageLite);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(setDirty.RatingCompat.MediaDescriptionCompat(j, generatedMessageLite));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iIconCompatParcelizer = setDirty.RatingCompat.IconCompatParcelizer(j, generatedMessageLite);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zWrite = setDirty.RatingCompat.write(j, generatedMessageLite);
                    Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
                    if (zWrite) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iIconCompatParcelizer = ((String) setDirty.RatingCompat.RatingCompat(j, generatedMessageLite)).hashCode();
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 9:
                    Object objRatingCompat = setDirty.RatingCompat.RatingCompat(j, generatedMessageLite);
                    if (objRatingCompat != null) {
                        iHashCode = objRatingCompat.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iIconCompatParcelizer = setDirty.RatingCompat.RatingCompat(j, generatedMessageLite).hashCode();
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iIconCompatParcelizer = setDirty.RatingCompat.IconCompatParcelizer(j, generatedMessageLite);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iIconCompatParcelizer = setDirty.RatingCompat.IconCompatParcelizer(j, generatedMessageLite);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iIconCompatParcelizer = setDirty.RatingCompat.IconCompatParcelizer(j, generatedMessageLite);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(setDirty.RatingCompat.MediaDescriptionCompat(j, generatedMessageLite));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iIconCompatParcelizer = setDirty.RatingCompat.IconCompatParcelizer(j, generatedMessageLite);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(setDirty.RatingCompat.MediaDescriptionCompat(j, generatedMessageLite));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 17:
                    Object objRatingCompat2 = setDirty.RatingCompat.RatingCompat(j, generatedMessageLite);
                    if (objRatingCompat2 != null) {
                        iHashCode = objRatingCompat2.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i3 = (i3 * 53) + iHashCode;
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
                case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                case 49:
                    i = i3 * 53;
                    iIconCompatParcelizer = setDirty.RatingCompat.RatingCompat(j, generatedMessageLite).hashCode();
                    i3 = iIconCompatParcelizer + i;
                    break;
                case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    i = i3 * 53;
                    iIconCompatParcelizer = setDirty.RatingCompat.RatingCompat(j, generatedMessageLite).hashCode();
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 51:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(Double.doubleToLongBits(((Double) setDirty.RatingCompat.RatingCompat(j, generatedMessageLite)).doubleValue()));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = Float.floatToIntBits(((Float) setDirty.RatingCompat.RatingCompat(j, generatedMessageLite)).floatValue());
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 53:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(IconCompatParcelizer(j, generatedMessageLite));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 54:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(IconCompatParcelizer(j, generatedMessageLite));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 55:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 56:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(IconCompatParcelizer(j, generatedMessageLite));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 57:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 58:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) setDirty.RatingCompat.RatingCompat(j, generatedMessageLite)).booleanValue();
                        Charset charset2 = CompositionLocalsKtLocalWindowInfo1.serializer;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = ((String) setDirty.RatingCompat.RatingCompat(j, generatedMessageLite)).hashCode();
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 60:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = setDirty.RatingCompat.RatingCompat(j, generatedMessageLite).hashCode();
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case RectListKt.BitOffsetForFocusable /* 61 */:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = setDirty.RatingCompat.RatingCompat(j, generatedMessageLite).hashCode();
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case RectListKt.BitOffsetForGesturable /* 62 */:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 63:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 64:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 65:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(IconCompatParcelizer(j, generatedMessageLite));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 66:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 67:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer(IconCompatParcelizer(j, generatedMessageLite));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 68:
                    if (RemoteActionCompatParcelizer(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = setDirty.RatingCompat.RatingCompat(j, generatedMessageLite).hashCode();
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
            }
        }
        ((GlobalSnapshotManagerensureStarted2) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        int iHashCode2 = generatedMessageLite.RemoteActionCompatParcelizer.hashCode() + (i3 * 53);
        if (!this.MediaSessionCompatQueueItem) {
            return iHashCode2;
        }
        this.MediaDescriptionCompat.getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.RemoteActionCompatParcelizer.hashCode() + (iHashCode2 * 53);
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final Object read() {
        this.MediaSessionCompatToken.getClass();
        return ((GeneratedMessageLite) this.IconCompatParcelizer).newMutableInstance();
    }

    public final Object read(Object obj, int i, Object obj2, UnknownFieldSchema unknownFieldSchema, Object obj3) {
        decodeByte decodebyteWrite;
        int i2 = this.write[i];
        Object objRatingCompat = setDirty.RatingCompat.RatingCompat(MediaSessionCompatQueueItem(i) & 1048575, obj);
        if (objRatingCompat == null || (decodebyteWrite = write(i)) == null) {
            return obj2;
        }
        this.ParcelableVolumeInfo.getClass();
        ImageLoader$Builder imageLoader$Builder = ((fromPxSizeviCIZxY) RemoteActionCompatParcelizer(i)).RemoteActionCompatParcelizer;
        Iterator it = ((fromDpSizeitqla9I) objRatingCompat).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!decodebyteWrite.write(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = unknownFieldSchema.IconCompatParcelizer(obj3);
                }
                Vw$Vw vw$Vw = new Vw$Vw(fromPxSizeviCIZxY.serializer(imageLoader$Builder, entry.getKey(), entry.getValue()), 9);
                ProvideCompositionLocalsui provideCompositionLocalsui = vw$Vw.read();
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    CompositionLocalsKtLocalClipboard1.serializer(provideCompositionLocalsui, (onScroll) imageLoader$Builder.RemoteActionCompatParcelizer, 1, key);
                    CompositionLocalsKtLocalClipboard1.serializer(provideCompositionLocalsui, (onScroll) imageLoader$Builder.read, 2, value);
                    ClipboardExtensions_androidKt clipboardExtensions_androidKtSerializer = vw$Vw.serializer();
                    ((GlobalSnapshotManagerensureStarted2) unknownFieldSchema).getClass();
                    ((GraphicsLayerOwnerLayer) obj2).serializer((i2 << 3) | 2, clipboardExtensions_androidKtSerializer);
                    it.remove();
                } catch (IOException e) {
                    DrawableTransformation.read((Throwable) e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void read(int i, int i2, Object obj, Object obj2) {
        read.putObject(obj, MediaSessionCompatQueueItem(i2) & 1048575, obj2);
        serializer(i, i2, obj);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    public final boolean read(int i, Object obj) {
        int i2 = this.write[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if ((setDirty.RatingCompat.IconCompatParcelizer(j, obj) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
        int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i);
        long j2 = iMediaSessionCompatQueueItem & 1048575;
        switch (IconCompatParcelizer(iMediaSessionCompatQueueItem)) {
            case 0:
                if (Double.doubleToRawLongBits(setDirty.RatingCompat.RemoteActionCompatParcelizer(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(setDirty.RatingCompat.read(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (setDirty.RatingCompat.MediaDescriptionCompat(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (setDirty.RatingCompat.MediaDescriptionCompat(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (setDirty.RatingCompat.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (setDirty.RatingCompat.MediaDescriptionCompat(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (setDirty.RatingCompat.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return setDirty.RatingCompat.write(j2, obj);
            case 8:
                Object objRatingCompat = setDirty.RatingCompat.RatingCompat(j2, obj);
                if (objRatingCompat instanceof String) {
                    return !((String) objRatingCompat).isEmpty();
                }
                if (objRatingCompat instanceof getClipMetadata) {
                    return !getClipMetadata.serializer.equals(objRatingCompat);
                }
                DrawableTransformation.write();
                return false;
            case 9:
                if (setDirty.RatingCompat.RatingCompat(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !getClipMetadata.serializer.equals(setDirty.RatingCompat.RatingCompat(j2, obj));
            case 11:
                if (setDirty.RatingCompat.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (setDirty.RatingCompat.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (setDirty.RatingCompat.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (setDirty.RatingCompat.MediaDescriptionCompat(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (setDirty.RatingCompat.IconCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (setDirty.RatingCompat.MediaDescriptionCompat(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (setDirty.RatingCompat.RatingCompat(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                DrawableTransformation.write();
                return false;
        }
    }

    public final void serializer(int i, int i2, Object obj) {
        setDirty.IconCompatParcelizer(this.write[i2 + 2] & 1048575, i, obj);
    }

    public final void serializer(Object obj, int i, Object obj2) {
        int[] iArr = this.write;
        int i2 = iArr[i];
        if (RemoteActionCompatParcelizer(i2, i, obj2)) {
            long jMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i) & 1048575;
            Unsafe unsafe = read;
            Object object = unsafe.getObject(obj2, jMediaSessionCompatQueueItem);
            if (object == null) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(iArr[i], obj2);
                return;
            }
            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer = serializer(i);
            if (!RemoteActionCompatParcelizer(i2, i, obj)) {
                if (write(object)) {
                    Object obj3 = disposableSaveableStateRegistrylambda0Serializer.read();
                    disposableSaveableStateRegistrylambda0Serializer.read(obj3, object);
                    unsafe.putObject(obj, jMediaSessionCompatQueueItem, obj3);
                } else {
                    unsafe.putObject(obj, jMediaSessionCompatQueueItem, object);
                }
                serializer(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jMediaSessionCompatQueueItem);
            if (!write(object2)) {
                Object obj4 = disposableSaveableStateRegistrylambda0Serializer.read();
                disposableSaveableStateRegistrylambda0Serializer.read(obj4, object2);
                unsafe.putObject(obj, jMediaSessionCompatQueueItem, obj4);
                object2 = obj4;
            }
            disposableSaveableStateRegistrylambda0Serializer.read(object2, object);
        }
    }

    public final void write(int i, Object obj) {
        int i2 = this.write[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        setDirty.IconCompatParcelizer(j, (1 << (i2 >>> 20)) | setDirty.RatingCompat.IconCompatParcelizer(j, obj), obj);
    }

    public final void write(DefaultHapticFeedback defaultHapticFeedback, int i, Object obj, int i2) {
        if (obj != null) {
            Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
            this.ParcelableVolumeInfo.getClass();
            ImageLoader$Builder imageLoader$Builder = ((fromPxSizeviCIZxY) objRemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
            ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
            composeView.getClass();
            for (Map.Entry entry : ((fromDpSizeitqla9I) obj).entrySet()) {
                composeView.RemoteActionCompatParcelizer(i, 2);
                composeView.MediaBrowserCompatMediaItem(fromPxSizeviCIZxY.serializer(imageLoader$Builder, entry.getKey(), entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                CompositionLocalsKtLocalClipboard1.serializer(composeView, (onScroll) imageLoader$Builder.RemoteActionCompatParcelizer, 1, key);
                CompositionLocalsKtLocalClipboard1.serializer(composeView, (onScroll) imageLoader$Builder.read, 2, value);
            }
        }
    }

    public MessageSchema(int[] iArr, Object[] objArr, int i, int i2, getElevation getelevation, int[] iArr2, int i3, int i4, setHasOverlappingRendering sethasoverlappingrendering, decodeSpanStyle decodespanstyle, UnknownFieldSchema unknownFieldSchema, getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller, getPxSizeYbymL2g getpxsizeybyml2g) {
        this.write = iArr;
        this.MediaSessionCompatResultReceiverWrapper = objArr;
        this.PlaybackStateCompat = i;
        this.PlaybackStateCompatCustomAction = i2;
        this.MediaMetadataCompat = getelevation instanceof GeneratedMessageLite;
        this.MediaSessionCompatQueueItem = getlocalsoftwarekeyboardcontroller != null && (getelevation instanceof GeneratedMessageLite.ExtendableMessage);
        this.MediaBrowserCompatMediaItem = iArr2;
        this.serializer = i3;
        this.ComponentActivity = i4;
        this.MediaSessionCompatToken = sethasoverlappingrendering;
        this.RatingCompat = decodespanstyle;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = unknownFieldSchema;
        this.MediaDescriptionCompat = getlocalsoftwarekeyboardcontroller;
        this.IconCompatParcelizer = getelevation;
        this.ParcelableVolumeInfo = getpxsizeybyml2g;
    }

    public final decodeByte write(int i) {
        return (decodeByte) this.MediaSessionCompatResultReceiverWrapper[ff$$ExternalSyntheticOutline0.m(i, 3, 2, 1)];
    }

    public static void IconCompatParcelizer(int i, Object obj, DefaultHapticFeedback defaultHapticFeedback) {
        if (!(obj instanceof String)) {
            defaultHapticFeedback.IconCompatParcelizer(i, (getClipMetadata) obj);
        } else {
            ((ComposeView) defaultHapticFeedback.write).write(i, (String) obj);
        }
    }

    public static MessageSchema serializer(canBeSaved canbesaved, setHasOverlappingRendering sethasoverlappingrendering, decodeSpanStyle decodespanstyle, UnknownFieldSchema unknownFieldSchema, getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller, getPxSizeYbymL2g getpxsizeybyml2g) {
        if (canbesaved instanceof canBeSaved) {
            return RemoteActionCompatParcelizer(canbesaved, sethasoverlappingrendering, decodespanstyle, unknownFieldSchema, getlocalsoftwarekeyboardcontroller, getpxsizeybyml2g);
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
        return null;
    }

    public static boolean write(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int IconCompatParcelizer(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iParcelableVolumeInfo;
        Unsafe unsafe = read;
        decodeString decodestring = (decodeString) unsafe.getObject(obj, j2);
        if (!((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            int size = decodestring.size();
            decodestring = decodestring.read(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, decodestring);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return ArrayDecoders.RemoteActionCompatParcelizer(bArr, i, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 1) {
                    return ArrayDecoders.IconCompatParcelizer(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 19:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    return ArrayDecoders.serializer(bArr, i, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 5) {
                    return ArrayDecoders.MediaSessionCompatQueueItem(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return ArrayDecoders.MediaBrowserCompatMediaItem(bArr, i, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 0) {
                    return ArrayDecoders.PlaybackStateCompatCustomAction(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 22:
            case 29:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i5 == 2) {
                    return ArrayDecoders.MediaMetadataCompat(bArr, i, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 0) {
                    return ArrayDecoders.ParcelableVolumeInfo(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return ArrayDecoders.read(bArr, i, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 1) {
                    return ArrayDecoders.RemoteActionCompatParcelizer(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 24:
            case 31:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i5 == 2) {
                    return ArrayDecoders.IconCompatParcelizer(bArr, i, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 5) {
                    return ArrayDecoders.read(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 25:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (i5 == 2) {
                    return ArrayDecoders.write(bArr, i, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 0) {
                    return ArrayDecoders.write(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return ArrayDecoders.MediaBrowserCompatMediaItem(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    }
                    return ArrayDecoders.MediaMetadataCompat(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return ArrayDecoders.serializer(serializer(i6), i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return ArrayDecoders.serializer(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iParcelableVolumeInfo = ArrayDecoders.ParcelableVolumeInfo(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    }
                    return i;
                }
                iParcelableVolumeInfo = ArrayDecoders.MediaMetadataCompat(bArr, i, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                registerProvider.IconCompatParcelizer(obj, i4, decodestring, write(i6), null, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                return iParcelableVolumeInfo;
            case 33:
            case 47:
                if (i5 == 2) {
                    return ArrayDecoders.MediaSessionCompatQueueItem(bArr, i, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 0) {
                    return ArrayDecoders.RatingCompat(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                if (i5 == 2) {
                    return ArrayDecoders.RatingCompat(bArr, i, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 0) {
                    return ArrayDecoders.MediaDescriptionCompat(i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return ArrayDecoders.write(serializer(i6), i3, bArr, i, i2, decodestring, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return i;
            default:
                return i;
        }
    }

    public final Object RemoteActionCompatParcelizer(int i) {
        return this.MediaSessionCompatResultReceiverWrapper[(i / 3) * 2];
    }

    public final Object serializer(int i, Object obj) {
        DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer = serializer(i);
        long jMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i) & 1048575;
        if (!read(i, obj)) {
            return disposableSaveableStateRegistrylambda0Serializer.read();
        }
        Object object = read.getObject(obj, jMediaSessionCompatQueueItem);
        if (write(object)) {
            return object;
        }
        Object obj2 = disposableSaveableStateRegistrylambda0Serializer.read();
        if (object != null) {
            disposableSaveableStateRegistrylambda0Serializer.read(obj2, object);
        }
        return obj2;
    }

    public final DisposableSaveableStateRegistrylambda0 serializer(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.MediaSessionCompatResultReceiverWrapper;
        DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0 = (DisposableSaveableStateRegistrylambda0) objArr[i2];
        if (disposableSaveableStateRegistrylambda0 != null) {
            return disposableSaveableStateRegistrylambda0;
        }
        DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda1 = component26.IconCompatParcelizer.read((Class) objArr[i2 + 1]);
        objArr[i2] = disposableSaveableStateRegistrylambda1;
        return disposableSaveableStateRegistrylambda1;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x06ae A[Catch: all -> 0x06a4, TryCatch #2 {all -> 0x06a4, blocks: (B:179:0x0683, B:190:0x06a9, B:192:0x06ae, B:193:0x06b3), top: B:221:0x0683 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x06bf A[LOOP:3: B:196:0x06bd->B:197:0x06bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:210:0x06e7 A[LOOP:2: B:209:0x06e5->B:210:0x06e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:246:0x06ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:? A[RETURN, SYNTHETIC] */
    @Override // o.DisposableSaveableStateRegistrylambda0
    public final void serializer(Object obj, CodedInputStreamReader codedInputStreamReader, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws Throwable {
        int i;
        Object obj2;
        int i2;
        CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer;
        Object obj3;
        Object obj4;
        int i3;
        Object objRemoteActionCompatParcelizer;
        boolean z;
        getlocalprovidablescrollcaptureinprogress.getClass();
        serializer(obj);
        UnknownFieldSchema unknownFieldSchema = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int[] iArr = this.MediaBrowserCompatMediaItem;
        int i4 = this.ComponentActivity;
        int i5 = this.serializer;
        Object objSerializer = null;
        CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1EnsureExtensionsAreMutable = null;
        while (true) {
            try {
                int iSerializer = codedInputStreamReader.serializer();
                try {
                    int iIconCompatParcelizer = (iSerializer < this.PlaybackStateCompat || iSerializer > this.PlaybackStateCompatCustomAction) ? -1 : IconCompatParcelizer(iSerializer, 0);
                    if (iIconCompatParcelizer < 0) {
                        if (iSerializer == Integer.MAX_VALUE) {
                            Object obj5 = objSerializer;
                            while (i5 < i4) {
                                obj5 = read(obj, iArr[i5], obj5, unknownFieldSchema, obj);
                                i5++;
                            }
                            if (obj5 != null) {
                                unknownFieldSchema.RemoteActionCompatParcelizer(obj, obj5);
                                return;
                            }
                            return;
                        }
                        try {
                            boolean z2 = this.MediaSessionCompatQueueItem;
                            getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller = this.MediaDescriptionCompat;
                            if (z2) {
                                getElevation getelevation = this.IconCompatParcelizer;
                                getlocalsoftwarekeyboardcontroller.getClass();
                                compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer = getlocalprovidablescrollcaptureinprogress.RemoteActionCompatParcelizer(iSerializer, getelevation);
                            } else {
                                compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer = null;
                            }
                            if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer != null) {
                                if (compositionLocalsKtLocalClipboard1EnsureExtensionsAreMutable == null) {
                                    getlocalsoftwarekeyboardcontroller.getClass();
                                    compositionLocalsKtLocalClipboard1EnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
                                }
                                getlocalsoftwarekeyboardcontroller.getClass();
                                try {
                                    objSerializer = getLocalSoftwareKeyboardController.serializer(obj, codedInputStreamReader, compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer, getlocalprovidablescrollcaptureinprogress, compositionLocalsKtLocalClipboard1EnsureExtensionsAreMutable, objSerializer, unknownFieldSchema);
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } else {
                                Object obj6 = objSerializer;
                                unknownFieldSchema.getClass();
                                objSerializer = obj6 == null ? unknownFieldSchema.IconCompatParcelizer(obj) : obj6;
                                try {
                                    if (!unknownFieldSchema.write(objSerializer, codedInputStreamReader, 0)) {
                                        obj3 = objSerializer;
                                        while (i5 < i4) {
                                            obj3 = read(obj, iArr[i5], obj3, unknownFieldSchema, obj);
                                            i5++;
                                        }
                                        if (obj3 == null) {
                                            return;
                                        }
                                        unknownFieldSchema.RemoteActionCompatParcelizer(obj, obj3);
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    i = i5;
                                    obj2 = objSerializer;
                                    for (i2 = i; i2 < i4; i2++) {
                                        obj2 = read(obj, iArr[i2], obj2, unknownFieldSchema, obj);
                                    }
                                    if (obj2 != null) {
                                        unknownFieldSchema.RemoteActionCompatParcelizer(obj, obj2);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            i = i5;
                            objSerializer = objSerializer;
                        }
                        i = i5;
                        obj2 = objSerializer;
                    } else {
                        objSerializer = objSerializer;
                        int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(iIconCompatParcelizer);
                        try {
                            int iIconCompatParcelizer2 = IconCompatParcelizer(iMediaSessionCompatQueueItem);
                            decodeSpanStyle decodespanstyle = this.RatingCompat;
                            switch (iIconCompatParcelizer2) {
                                case 0:
                                    i = i5;
                                    long j = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(1);
                                    setDirty.RatingCompat.read(obj, j, codedInputStreamReader.serializer.MediaMetadataCompat());
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 1:
                                    i = i5;
                                    long j2 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(5);
                                    setDirty.RatingCompat.IconCompatParcelizer(obj, j2, codedInputStreamReader.serializer.MediaSessionCompatResultReceiverWrapper());
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 2:
                                    i = i5;
                                    long j3 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.write(obj, j3, codedInputStreamReader.serializer.PlaybackStateCompatCustomAction());
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 3:
                                    i = i5;
                                    long j4 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.write(obj, j4, codedInputStreamReader.serializer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 4:
                                    i = i5;
                                    long j5 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.IconCompatParcelizer(j5, codedInputStreamReader.serializer.ParcelableVolumeInfo(), obj);
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 5:
                                    i = i5;
                                    long j6 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(1);
                                    setDirty.write(obj, j6, codedInputStreamReader.serializer.MediaDescriptionCompat());
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 6:
                                    i = i5;
                                    long j7 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(5);
                                    setDirty.IconCompatParcelizer(j7, codedInputStreamReader.serializer.RatingCompat(), obj);
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 7:
                                    i = i5;
                                    long j8 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.RatingCompat.read(obj, j8, codedInputStreamReader.serializer.serializer());
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 8:
                                    i = i5;
                                    read(obj, iMediaSessionCompatQueueItem, codedInputStreamReader);
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 9:
                                    i = i5;
                                    getElevation getelevation2 = (getElevation) serializer(iIconCompatParcelizer, obj);
                                    DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer = serializer(iIconCompatParcelizer);
                                    codedInputStreamReader.IconCompatParcelizer(2);
                                    codedInputStreamReader.IconCompatParcelizer(getelevation2, disposableSaveableStateRegistrylambda0Serializer, getlocalprovidablescrollcaptureinprogress);
                                    RemoteActionCompatParcelizer(obj, iIconCompatParcelizer, getelevation2);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 10:
                                    i = i5;
                                    setDirty.write(read(iMediaSessionCompatQueueItem), obj, codedInputStreamReader.write());
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 11:
                                    i = i5;
                                    long j9 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.IconCompatParcelizer(j9, codedInputStreamReader.serializer.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8(), obj);
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 12:
                                    i = i5;
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    int iMediaSessionCompatQueueItem2 = codedInputStreamReader.serializer.MediaSessionCompatQueueItem();
                                    decodeByte decodebyteWrite = write(iIconCompatParcelizer);
                                    if (decodebyteWrite != null && !decodebyteWrite.write(iMediaSessionCompatQueueItem2)) {
                                        objRemoteActionCompatParcelizer = registerProvider.RemoteActionCompatParcelizer(obj, iSerializer, iMediaSessionCompatQueueItem2, objSerializer, unknownFieldSchema);
                                        objSerializer = objRemoteActionCompatParcelizer;
                                        i5 = i;
                                    }
                                    setDirty.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), iMediaSessionCompatQueueItem2, obj);
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 13:
                                    i = i5;
                                    long j10 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(5);
                                    setDirty.IconCompatParcelizer(j10, codedInputStreamReader.serializer.PlaybackStateCompat(), obj);
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 14:
                                    i = i5;
                                    long j11 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(1);
                                    setDirty.write(obj, j11, codedInputStreamReader.serializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 15:
                                    i = i5;
                                    long j12 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.IconCompatParcelizer(j12, codedInputStreamReader.serializer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), obj);
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 16:
                                    i = i5;
                                    long j13 = read(iMediaSessionCompatQueueItem);
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.write(obj, j13, codedInputStreamReader.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                                    write(iIconCompatParcelizer, obj);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 17:
                                    i = i5;
                                    getElevation getelevation3 = (getElevation) serializer(iIconCompatParcelizer, obj);
                                    DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer2 = serializer(iIconCompatParcelizer);
                                    codedInputStreamReader.IconCompatParcelizer(3);
                                    codedInputStreamReader.read(getelevation3, disposableSaveableStateRegistrylambda0Serializer2, getlocalprovidablescrollcaptureinprogress);
                                    RemoteActionCompatParcelizer(obj, iIconCompatParcelizer, getelevation3);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 18:
                                    i = i5;
                                    codedInputStreamReader.IconCompatParcelizer(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 19:
                                    i = i5;
                                    codedInputStreamReader.MediaBrowserCompatMediaItem(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 20:
                                    i = i5;
                                    codedInputStreamReader.MediaMetadataCompat(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 21:
                                    i = i5;
                                    codedInputStreamReader.MediaSessionCompatToken(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 22:
                                    i = i5;
                                    codedInputStreamReader.MediaSessionCompatQueueItem(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 23:
                                    i = i5;
                                    codedInputStreamReader.MediaDescriptionCompat(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 24:
                                    i = i5;
                                    codedInputStreamReader.read(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 25:
                                    i = i5;
                                    codedInputStreamReader.RemoteActionCompatParcelizer(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 26:
                                    i = i5;
                                    IconCompatParcelizer(obj, iMediaSessionCompatQueueItem, codedInputStreamReader);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 27:
                                    i = i5;
                                    RemoteActionCompatParcelizer(obj, iMediaSessionCompatQueueItem, codedInputStreamReader, serializer(iIconCompatParcelizer), getlocalprovidablescrollcaptureinprogress);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 28:
                                    i = i5;
                                    codedInputStreamReader.serializer(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 29:
                                    i = i5;
                                    codedInputStreamReader.PlaybackStateCompatCustomAction(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 30:
                                    i = i5;
                                    List listIconCompatParcelizer = decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj);
                                    codedInputStreamReader.write(listIconCompatParcelizer);
                                    objRemoteActionCompatParcelizer = registerProvider.IconCompatParcelizer(obj, iSerializer, listIconCompatParcelizer, write(iIconCompatParcelizer), objSerializer, unknownFieldSchema);
                                    objSerializer = objRemoteActionCompatParcelizer;
                                    i5 = i;
                                    break;
                                case 31:
                                    i = i5;
                                    codedInputStreamReader.RatingCompat(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 32:
                                    i = i5;
                                    codedInputStreamReader.ParcelableVolumeInfo(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 33:
                                    i = i5;
                                    codedInputStreamReader.PlaybackStateCompat(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    i = i5;
                                    codedInputStreamReader.MediaSessionCompatResultReceiverWrapper(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 35:
                                    i = i5;
                                    codedInputStreamReader.IconCompatParcelizer(decodespanstyle.IconCompatParcelizer(read(iMediaSessionCompatQueueItem), obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                    i = i5;
                                    codedInputStreamReader.MediaBrowserCompatMediaItem(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 37:
                                    i = i5;
                                    codedInputStreamReader.MediaMetadataCompat(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 38:
                                    i = i5;
                                    codedInputStreamReader.MediaSessionCompatToken(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    i = i5;
                                    codedInputStreamReader.MediaSessionCompatQueueItem(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 40:
                                    i = i5;
                                    codedInputStreamReader.MediaDescriptionCompat(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                    i = i5;
                                    codedInputStreamReader.read(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                    i = i5;
                                    codedInputStreamReader.RemoteActionCompatParcelizer(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 43:
                                    i = i5;
                                    codedInputStreamReader.PlaybackStateCompatCustomAction(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 44:
                                    i = i5;
                                    List listIconCompatParcelizer2 = decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj);
                                    codedInputStreamReader.write(listIconCompatParcelizer2);
                                    objRemoteActionCompatParcelizer = registerProvider.IconCompatParcelizer(obj, iSerializer, listIconCompatParcelizer2, write(iIconCompatParcelizer), objSerializer, unknownFieldSchema);
                                    objSerializer = objRemoteActionCompatParcelizer;
                                    i5 = i;
                                    break;
                                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    i = i5;
                                    codedInputStreamReader.RatingCompat(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 46:
                                    i = i5;
                                    codedInputStreamReader.ParcelableVolumeInfo(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 47:
                                    i = i5;
                                    codedInputStreamReader.PlaybackStateCompat(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                                    i = i5;
                                    codedInputStreamReader.MediaSessionCompatResultReceiverWrapper(decodespanstyle.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 49:
                                    i = i5;
                                    IconCompatParcelizer(obj, iMediaSessionCompatQueueItem & 1048575, codedInputStreamReader, serializer(iIconCompatParcelizer), getlocalprovidablescrollcaptureinprogress);
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                                    write(obj, iIconCompatParcelizer, RemoteActionCompatParcelizer(iIconCompatParcelizer), getlocalprovidablescrollcaptureinprogress, codedInputStreamReader);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 51:
                                    codedInputStreamReader.IconCompatParcelizer(1);
                                    setDirty.write(iMediaSessionCompatQueueItem & 1048575, obj, Double.valueOf(codedInputStreamReader.serializer.MediaMetadataCompat()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                                    codedInputStreamReader.IconCompatParcelizer(5);
                                    setDirty.write(iMediaSessionCompatQueueItem & 1048575, obj, Float.valueOf(codedInputStreamReader.serializer.MediaSessionCompatResultReceiverWrapper()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 53:
                                    long j14 = iMediaSessionCompatQueueItem & 1048575;
                                    z = false;
                                    try {
                                        codedInputStreamReader.IconCompatParcelizer(0);
                                        setDirty.write(j14, obj, Long.valueOf(codedInputStreamReader.serializer.PlaybackStateCompatCustomAction()));
                                        serializer(iSerializer, iIconCompatParcelizer, obj);
                                        i = i5;
                                        objSerializer = objSerializer;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                        i = i5;
                                        objSerializer = objSerializer;
                                        unknownFieldSchema.getClass();
                                        if (objSerializer == null) {
                                            objSerializer = unknownFieldSchema.IconCompatParcelizer(obj);
                                        }
                                        if (!unknownFieldSchema.write(objSerializer, codedInputStreamReader, 0)) {
                                            obj4 = objSerializer;
                                            for (i3 = i; i3 < i4; i3++) {
                                                obj4 = read(obj, iArr[i3], obj4, unknownFieldSchema, obj);
                                            }
                                            if (obj4 != null) {
                                                unknownFieldSchema.RemoteActionCompatParcelizer(obj, obj4);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    i5 = i;
                                    break;
                                case 54:
                                    long j15 = iMediaSessionCompatQueueItem & 1048575;
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.write(j15, obj, Long.valueOf(codedInputStreamReader.serializer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 55:
                                    long j16 = iMediaSessionCompatQueueItem & 1048575;
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.write(j16, obj, Integer.valueOf(codedInputStreamReader.serializer.ParcelableVolumeInfo()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 56:
                                    codedInputStreamReader.IconCompatParcelizer(1);
                                    setDirty.write(iMediaSessionCompatQueueItem & 1048575, obj, Long.valueOf(codedInputStreamReader.serializer.MediaDescriptionCompat()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 57:
                                    codedInputStreamReader.IconCompatParcelizer(5);
                                    setDirty.write(iMediaSessionCompatQueueItem & 1048575, obj, Integer.valueOf(codedInputStreamReader.serializer.RatingCompat()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 58:
                                    long j17 = iMediaSessionCompatQueueItem & 1048575;
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.write(j17, obj, Boolean.valueOf(codedInputStreamReader.serializer.serializer()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 59:
                                    read(obj, iMediaSessionCompatQueueItem, codedInputStreamReader);
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 60:
                                    getElevation getelevation4 = (getElevation) write(iSerializer, iIconCompatParcelizer, obj);
                                    DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer3 = serializer(iIconCompatParcelizer);
                                    codedInputStreamReader.IconCompatParcelizer(2);
                                    codedInputStreamReader.IconCompatParcelizer(getelevation4, disposableSaveableStateRegistrylambda0Serializer3, getlocalprovidablescrollcaptureinprogress);
                                    read(iSerializer, iIconCompatParcelizer, obj, getelevation4);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case RectListKt.BitOffsetForFocusable /* 61 */:
                                    setDirty.write(iMediaSessionCompatQueueItem & 1048575, obj, codedInputStreamReader.write());
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case RectListKt.BitOffsetForGesturable /* 62 */:
                                    long j18 = iMediaSessionCompatQueueItem & 1048575;
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.write(j18, obj, Integer.valueOf(codedInputStreamReader.serializer.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 63:
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    int iMediaSessionCompatQueueItem3 = codedInputStreamReader.serializer.MediaSessionCompatQueueItem();
                                    decodeByte decodebyteWrite2 = write(iIconCompatParcelizer);
                                    if (decodebyteWrite2 != null && !decodebyteWrite2.write(iMediaSessionCompatQueueItem3)) {
                                        objSerializer = registerProvider.RemoteActionCompatParcelizer(obj, iSerializer, iMediaSessionCompatQueueItem3, objSerializer, unknownFieldSchema);
                                        i = i5;
                                    } else {
                                        setDirty.write(iMediaSessionCompatQueueItem & 1048575, obj, Integer.valueOf(iMediaSessionCompatQueueItem3));
                                        serializer(iSerializer, iIconCompatParcelizer, obj);
                                        i = i5;
                                        objSerializer = objSerializer;
                                    }
                                    i5 = i;
                                    break;
                                case 64:
                                    codedInputStreamReader.IconCompatParcelizer(5);
                                    setDirty.write(iMediaSessionCompatQueueItem & 1048575, obj, Integer.valueOf(codedInputStreamReader.serializer.PlaybackStateCompat()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 65:
                                    codedInputStreamReader.IconCompatParcelizer(1);
                                    setDirty.write(iMediaSessionCompatQueueItem & 1048575, obj, Long.valueOf(codedInputStreamReader.serializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 66:
                                    long j19 = iMediaSessionCompatQueueItem & 1048575;
                                    codedInputStreamReader.IconCompatParcelizer(0);
                                    setDirty.write(j19, obj, Integer.valueOf(codedInputStreamReader.serializer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                                    serializer(iSerializer, iIconCompatParcelizer, obj);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                case 67:
                                    long j20 = iMediaSessionCompatQueueItem & 1048575;
                                    try {
                                        codedInputStreamReader.IconCompatParcelizer(0);
                                        try {
                                            setDirty.write(j20, obj, Long.valueOf(codedInputStreamReader.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
                                            serializer(iSerializer, iIconCompatParcelizer, obj);
                                            i = i5;
                                            objSerializer = objSerializer;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                            z = false;
                                            i = i5;
                                            objSerializer = objSerializer;
                                            unknownFieldSchema.getClass();
                                            if (objSerializer == null) {
                                                objSerializer = unknownFieldSchema.IconCompatParcelizer(obj);
                                            }
                                            if (!unknownFieldSchema.write(objSerializer, codedInputStreamReader, 0)) {
                                                obj4 = objSerializer;
                                                while (i3 < i4) {
                                                    obj4 = read(obj, iArr[i3], obj4, unknownFieldSchema, obj);
                                                }
                                                if (obj4 != null) {
                                                    unknownFieldSchema.RemoteActionCompatParcelizer(obj, obj4);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        z = false;
                                    }
                                    i5 = i;
                                    break;
                                case 68:
                                    getElevation getelevation5 = (getElevation) write(iSerializer, iIconCompatParcelizer, obj);
                                    DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer4 = serializer(iIconCompatParcelizer);
                                    codedInputStreamReader.IconCompatParcelizer(3);
                                    codedInputStreamReader.read(getelevation5, disposableSaveableStateRegistrylambda0Serializer4, getlocalprovidablescrollcaptureinprogress);
                                    read(iSerializer, iIconCompatParcelizer, obj, getelevation5);
                                    i = i5;
                                    objSerializer = objSerializer;
                                    i5 = i;
                                    break;
                                default:
                                    i = i5;
                                    if (objSerializer == null) {
                                        try {
                                            objSerializer = unknownFieldSchema.IconCompatParcelizer(obj);
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            objSerializer = objSerializer;
                                            unknownFieldSchema.getClass();
                                            if (objSerializer == null) {
                                                objSerializer = unknownFieldSchema.IconCompatParcelizer(obj);
                                            }
                                            if (!unknownFieldSchema.write(objSerializer, codedInputStreamReader, 0)) {
                                                obj4 = objSerializer;
                                                while (i3 < i4) {
                                                    obj4 = read(obj, iArr[i3], obj4, unknownFieldSchema, obj);
                                                }
                                                if (obj4 != null) {
                                                    unknownFieldSchema.RemoteActionCompatParcelizer(obj, obj4);
                                                    return;
                                                }
                                                return;
                                            }
                                            i5 = i;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } else {
                                        objSerializer = objSerializer;
                                    }
                                    try {
                                        try {
                                            if (!unknownFieldSchema.write(objSerializer, codedInputStreamReader, 0)) {
                                                obj3 = objSerializer;
                                                for (int i6 = i; i6 < i4; i6++) {
                                                    obj3 = read(obj, iArr[i6], obj3, unknownFieldSchema, obj);
                                                }
                                                if (obj3 == null) {
                                                    return;
                                                }
                                                unknownFieldSchema.RemoteActionCompatParcelizer(obj, obj3);
                                                return;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj2 = objSerializer;
                                            while (i2 < i4) {
                                                obj2 = read(obj, iArr[i2], obj2, unknownFieldSchema, obj);
                                            }
                                            if (obj2 != null) {
                                                unknownFieldSchema.RemoteActionCompatParcelizer(obj, obj2);
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        unknownFieldSchema.getClass();
                                        if (objSerializer == null) {
                                            objSerializer = unknownFieldSchema.IconCompatParcelizer(obj);
                                        }
                                        if (!unknownFieldSchema.write(objSerializer, codedInputStreamReader, 0)) {
                                            obj4 = objSerializer;
                                            while (i3 < i4) {
                                                obj4 = read(obj, iArr[i3], obj4, unknownFieldSchema, obj);
                                            }
                                            if (obj4 != null) {
                                                unknownFieldSchema.RemoteActionCompatParcelizer(obj, obj4);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    i5 = i;
                                    break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                            i = i5;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
            while (i2 < i4) {
                obj2 = read(obj, iArr[i2], obj2, unknownFieldSchema, obj);
            }
            if (obj2 != null) {
                unknownFieldSchema.RemoteActionCompatParcelizer(obj, obj2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:205:0x0545  */
    @Override // o.DisposableSaveableStateRegistrylambda0
    public final int write(GeneratedMessageLite generatedMessageLite) {
        int i;
        int i2;
        int i3;
        int iSerializer;
        int iSerializer2;
        int iSerializer3;
        int iSerializer4;
        int iSerializer5;
        int iRemoteActionCompatParcelizer;
        int iSerializer6;
        int iSerializer7;
        int iWrite;
        int iM$1;
        int iSerializer8;
        int iSerializer9;
        int size;
        int iMediaSessionCompatQueueItem;
        int iSerializer10;
        int serializedSize;
        Unsafe unsafe = read;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iM$2 = 0;
        while (true) {
            int[] iArr = this.write;
            if (i7 < iArr.length) {
                int iMediaSessionCompatQueueItem2 = MediaSessionCompatQueueItem(i7);
                int iIconCompatParcelizer = IconCompatParcelizer(iMediaSessionCompatQueueItem2);
                int i8 = iArr[i7];
                int i9 = iArr[i7 + 2];
                int i10 = i9 & i4;
                if (iIconCompatParcelizer <= 17) {
                    if (i10 != i5) {
                        i6 = i10 == i4 ? 0 : unsafe.getInt(generatedMessageLite, i10);
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
                long j = iMediaSessionCompatQueueItem2 & i4;
                if (iIconCompatParcelizer >= CompositionLocalsKtLocalClipboardManager1.DOUBLE_LIST_PACKED.id()) {
                    CompositionLocalsKtLocalClipboardManager1.SINT64_LIST_PACKED.id();
                }
                switch (iIconCompatParcelizer) {
                    case 0:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            iSerializer = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer + 8;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 1:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            iSerializer2 = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer2 + 4;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 2:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            long j2 = unsafe.getLong(generatedMessageLite, j);
                            iSerializer3 = ComposeView.serializer(i8);
                            iSerializer4 = ComposeView.serializer(j2);
                            iSerializer8 = iSerializer4 + iSerializer3;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 3:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            long j3 = unsafe.getLong(generatedMessageLite, j);
                            iSerializer3 = ComposeView.serializer(i8);
                            iSerializer4 = ComposeView.serializer(j3);
                            iSerializer8 = iSerializer4 + iSerializer3;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 4:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            int i11 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer5 = ComposeView.serializer(i8);
                            iRemoteActionCompatParcelizer = ComposeView.read(i11);
                            iSerializer8 = iRemoteActionCompatParcelizer + iSerializer5;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 5:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            iSerializer = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer + 8;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 6:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            iSerializer2 = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer2 + 4;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 7:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            iSerializer6 = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer6 + 1;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 8:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            Object object = unsafe.getObject(generatedMessageLite, j);
                            if (object instanceof getClipMetadata) {
                                int iSerializer11 = ComposeView.serializer(i8);
                                int iRatingCompat = ((getClipMetadata) object).RatingCompat();
                                iM$1 = af$$ExternalSyntheticOutline0.m$1(iRatingCompat, iRatingCompat, iSerializer11, iM$2);
                            } else {
                                iSerializer7 = ComposeView.serializer(i8);
                                iWrite = ComposeView.write((String) object);
                                iM$1 = iWrite + iSerializer7 + iM$2;
                            }
                            iM$2 = iM$1;
                        }
                        break;
                    case 9:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            Object object2 = unsafe.getObject(generatedMessageLite, j);
                            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer = serializer(i7);
                            Class cls = registerProvider.read;
                            int iSerializer12 = ComposeView.serializer(i8);
                            int serializedSize2 = ((AbstractMessageLite) ((getElevation) object2)).getSerializedSize(disposableSaveableStateRegistrylambda0Serializer);
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(serializedSize2, serializedSize2, iSerializer12, iM$2);
                        }
                        break;
                    case 10:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            getClipMetadata getclipmetadata = (getClipMetadata) unsafe.getObject(generatedMessageLite, j);
                            int iSerializer13 = ComposeView.serializer(i8);
                            int iRatingCompat2 = getclipmetadata.RatingCompat();
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(iRatingCompat2, iRatingCompat2, iSerializer13, iM$2);
                        }
                        break;
                    case 11:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            int i12 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer5 = ComposeView.serializer(i8);
                            iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer(i12);
                            iSerializer8 = iRemoteActionCompatParcelizer + iSerializer5;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 12:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            int i13 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer5 = ComposeView.serializer(i8);
                            iRemoteActionCompatParcelizer = ComposeView.read(i13);
                            iSerializer8 = iRemoteActionCompatParcelizer + iSerializer5;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 13:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            iSerializer2 = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer2 + 4;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 14:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            iSerializer = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer + 8;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 15:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            int i14 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer5 = ComposeView.serializer(i8);
                            iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer((i14 << 1) ^ (i14 >> 31));
                            iSerializer8 = iRemoteActionCompatParcelizer + iSerializer5;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 16:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            long j4 = unsafe.getLong(generatedMessageLite, j);
                            iSerializer3 = ComposeView.serializer(i8);
                            iSerializer4 = ComposeView.serializer((j4 >> 63) ^ (j4 << 1));
                            iSerializer8 = iSerializer4 + iSerializer3;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 17:
                        if (serializer(generatedMessageLite, i7, i2, i, i3)) {
                            getElevation getelevation = (getElevation) unsafe.getObject(generatedMessageLite, j);
                            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer2 = serializer(i7);
                            int iSerializer14 = ComposeView.serializer(i8) * 2;
                            iRemoteActionCompatParcelizer = ((AbstractMessageLite) getelevation).getSerializedSize(disposableSaveableStateRegistrylambda0Serializer2);
                            iSerializer5 = iSerializer14;
                            iSerializer8 = iRemoteActionCompatParcelizer + iSerializer5;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 18:
                        iSerializer8 = registerProvider.serializer(i8, (List) unsafe.getObject(generatedMessageLite, j));
                        iM$2 += iSerializer8;
                        break;
                    case 19:
                        iSerializer8 = registerProvider.RemoteActionCompatParcelizer(i8, (List) unsafe.getObject(generatedMessageLite, j));
                        iM$2 += iSerializer8;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls2 = registerProvider.read;
                        if (list.size() == 0) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer9 = (ComposeView.serializer(i8) * list.size()) + registerProvider.write(list);
                        }
                        iM$2 += iSerializer9;
                        break;
                    case 21:
                        List list2 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls3 = registerProvider.read;
                        size = list2.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = registerProvider.MediaSessionCompatQueueItem(list2);
                            iSerializer10 = ComposeView.serializer(i8);
                            iSerializer9 = (iSerializer10 * size) + iMediaSessionCompatQueueItem;
                        }
                        iM$2 += iSerializer9;
                        break;
                    case 22:
                        List list3 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls4 = registerProvider.read;
                        size = list3.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = registerProvider.read(list3);
                            iSerializer10 = ComposeView.serializer(i8);
                            iSerializer9 = (iSerializer10 * size) + iMediaSessionCompatQueueItem;
                        }
                        iM$2 += iSerializer9;
                        break;
                    case 23:
                        iSerializer8 = registerProvider.serializer(i8, (List) unsafe.getObject(generatedMessageLite, j));
                        iM$2 += iSerializer8;
                        break;
                    case 24:
                        iSerializer8 = registerProvider.RemoteActionCompatParcelizer(i8, (List) unsafe.getObject(generatedMessageLite, j));
                        iM$2 += iSerializer8;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls5 = registerProvider.read;
                        int size2 = list4.size();
                        iM$2 += size2 == 0 ? 0 : (ComposeView.serializer(i8) + 1) * size2;
                        break;
                    case 26:
                        List list5 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls6 = registerProvider.read;
                        int size3 = list5.size();
                        if (size3 == 0) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer9 = ComposeView.serializer(i8) * size3;
                            if (list5 instanceof decodeFontSynthesisGVVA2EU) {
                                decodeFontSynthesisGVVA2EU decodefontsynthesisgvva2eu = (decodeFontSynthesisGVVA2EU) list5;
                                for (int i15 = 0; i15 < size3; i15++) {
                                    Object objIconCompatParcelizer = decodefontsynthesisgvva2eu.IconCompatParcelizer(i15);
                                    if (objIconCompatParcelizer instanceof getClipMetadata) {
                                        int iRatingCompat3 = ((getClipMetadata) objIconCompatParcelizer).RatingCompat();
                                        iSerializer9 = ComposeView.RemoteActionCompatParcelizer(iRatingCompat3) + iRatingCompat3 + iSerializer9;
                                    } else {
                                        iSerializer9 = ComposeView.write((String) objIconCompatParcelizer) + iSerializer9;
                                    }
                                }
                            } else {
                                for (int i16 = 0; i16 < size3; i16++) {
                                    Object obj = list5.get(i16);
                                    if (obj instanceof getClipMetadata) {
                                        int iRatingCompat4 = ((getClipMetadata) obj).RatingCompat();
                                        iSerializer9 = ComposeView.RemoteActionCompatParcelizer(iRatingCompat4) + iRatingCompat4 + iSerializer9;
                                    } else {
                                        iSerializer9 = ComposeView.write((String) obj) + iSerializer9;
                                    }
                                }
                            }
                        }
                        iM$2 += iSerializer9;
                        break;
                    case 27:
                        List list6 = (List) unsafe.getObject(generatedMessageLite, j);
                        DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer3 = serializer(i7);
                        Class cls7 = registerProvider.read;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            iSerializer9 = 0;
                        } else {
                            int iSerializer15 = ComposeView.serializer(i8) * size4;
                            for (int i17 = 0; i17 < size4; i17++) {
                                int serializedSize3 = ((AbstractMessageLite) ((getElevation) list6.get(i17))).getSerializedSize(disposableSaveableStateRegistrylambda0Serializer3);
                                iSerializer15 += ComposeView.RemoteActionCompatParcelizer(serializedSize3) + serializedSize3;
                            }
                            iSerializer9 = iSerializer15;
                        }
                        iM$2 += iSerializer9;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls8 = registerProvider.read;
                        int size5 = list7.size();
                        if (size5 == 0) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer9 = ComposeView.serializer(i8) * size5;
                            for (int i18 = 0; i18 < list7.size(); i18++) {
                                int iRatingCompat5 = ((getClipMetadata) list7.get(i18)).RatingCompat();
                                iSerializer9 += ComposeView.RemoteActionCompatParcelizer(iRatingCompat5) + iRatingCompat5;
                            }
                        }
                        iM$2 += iSerializer9;
                        break;
                    case 29:
                        List list8 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls9 = registerProvider.read;
                        size = list8.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = registerProvider.MediaDescriptionCompat(list8);
                            iSerializer10 = ComposeView.serializer(i8);
                            iSerializer9 = (iSerializer10 * size) + iMediaSessionCompatQueueItem;
                        }
                        iM$2 += iSerializer9;
                        break;
                    case 30:
                        List list9 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls10 = registerProvider.read;
                        size = list9.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = registerProvider.RemoteActionCompatParcelizer(list9);
                            iSerializer10 = ComposeView.serializer(i8);
                            iSerializer9 = (iSerializer10 * size) + iMediaSessionCompatQueueItem;
                        }
                        iM$2 += iSerializer9;
                        break;
                    case 31:
                        iSerializer8 = registerProvider.RemoteActionCompatParcelizer(i8, (List) unsafe.getObject(generatedMessageLite, j));
                        iM$2 += iSerializer8;
                        break;
                    case 32:
                        iSerializer8 = registerProvider.serializer(i8, (List) unsafe.getObject(generatedMessageLite, j));
                        iM$2 += iSerializer8;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls11 = registerProvider.read;
                        size = list10.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = registerProvider.serializer(list10);
                            iSerializer10 = ComposeView.serializer(i8);
                            iSerializer9 = (iSerializer10 * size) + iMediaSessionCompatQueueItem;
                        }
                        iM$2 += iSerializer9;
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        List list11 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls12 = registerProvider.read;
                        size = list11.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = registerProvider.IconCompatParcelizer(list11);
                            iSerializer10 = ComposeView.serializer(i8);
                            iSerializer9 = (iSerializer10 * size) + iMediaSessionCompatQueueItem;
                        }
                        iM$2 += iSerializer9;
                        break;
                    case 35:
                        List list12 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls13 = registerProvider.read;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(size6, ComposeView.serializer(i8), size6, iM$2);
                        }
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        List list13 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls14 = registerProvider.read;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(size7, ComposeView.serializer(i8), size7, iM$2);
                        }
                        break;
                    case 37:
                        int iWrite2 = registerProvider.write((List) unsafe.getObject(generatedMessageLite, j));
                        if (iWrite2 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(iWrite2, ComposeView.serializer(i8), iWrite2, iM$2);
                        }
                        break;
                    case 38:
                        int iMediaSessionCompatQueueItem3 = registerProvider.MediaSessionCompatQueueItem((List) unsafe.getObject(generatedMessageLite, j));
                        if (iMediaSessionCompatQueueItem3 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(iMediaSessionCompatQueueItem3, ComposeView.serializer(i8), iMediaSessionCompatQueueItem3, iM$2);
                        }
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        int i19 = registerProvider.read((List) unsafe.getObject(generatedMessageLite, j));
                        if (i19 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(i19, ComposeView.serializer(i8), i19, iM$2);
                        }
                        break;
                    case 40:
                        List list14 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls15 = registerProvider.read;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(size8, ComposeView.serializer(i8), size8, iM$2);
                        }
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        List list15 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls16 = registerProvider.read;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(size9, ComposeView.serializer(i8), size9, iM$2);
                        }
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        List list16 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls17 = registerProvider.read;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(size10, ComposeView.serializer(i8), size10, iM$2);
                        }
                        break;
                    case 43:
                        int iMediaDescriptionCompat = registerProvider.MediaDescriptionCompat((List) unsafe.getObject(generatedMessageLite, j));
                        if (iMediaDescriptionCompat > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(iMediaDescriptionCompat, ComposeView.serializer(i8), iMediaDescriptionCompat, iM$2);
                        }
                        break;
                    case 44:
                        int iRemoteActionCompatParcelizer2 = registerProvider.RemoteActionCompatParcelizer((List) unsafe.getObject(generatedMessageLite, j));
                        if (iRemoteActionCompatParcelizer2 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(iRemoteActionCompatParcelizer2, ComposeView.serializer(i8), iRemoteActionCompatParcelizer2, iM$2);
                        }
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        List list17 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls18 = registerProvider.read;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(size11, ComposeView.serializer(i8), size11, iM$2);
                        }
                        break;
                    case 46:
                        List list18 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls19 = registerProvider.read;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(size12, ComposeView.serializer(i8), size12, iM$2);
                        }
                        break;
                    case 47:
                        int iSerializer16 = registerProvider.serializer((List) unsafe.getObject(generatedMessageLite, j));
                        if (iSerializer16 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(iSerializer16, ComposeView.serializer(i8), iSerializer16, iM$2);
                        }
                        break;
                    case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        int iIconCompatParcelizer2 = registerProvider.IconCompatParcelizer((List) unsafe.getObject(generatedMessageLite, j));
                        if (iIconCompatParcelizer2 > 0) {
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(iIconCompatParcelizer2, ComposeView.serializer(i8), iIconCompatParcelizer2, iM$2);
                        }
                        break;
                    case 49:
                        List list19 = (List) unsafe.getObject(generatedMessageLite, j);
                        DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer4 = serializer(i7);
                        Class cls20 = registerProvider.read;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            serializedSize = 0;
                        } else {
                            serializedSize = 0;
                            for (int i20 = 0; i20 < size13; i20++) {
                                serializedSize += ((AbstractMessageLite) ((getElevation) list19.get(i20))).getSerializedSize(disposableSaveableStateRegistrylambda0Serializer4) + (ComposeView.serializer(i8) * 2);
                            }
                        }
                        iM$2 += serializedSize;
                        break;
                    case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        Object object3 = unsafe.getObject(generatedMessageLite, j);
                        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i7);
                        this.ParcelableVolumeInfo.getClass();
                        fromDpSizeitqla9I fromdpsizeitqla9i = (fromDpSizeitqla9I) object3;
                        fromPxSizeviCIZxY frompxsizevicizxy = (fromPxSizeviCIZxY) objRemoteActionCompatParcelizer;
                        if (fromdpsizeitqla9i.isEmpty()) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer9 = 0;
                            for (Map.Entry entry : fromdpsizeitqla9i.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                frompxsizevicizxy.getClass();
                                int iSerializer17 = ComposeView.serializer(i8);
                                int iSerializer18 = fromPxSizeviCIZxY.serializer(frompxsizevicizxy.RemoteActionCompatParcelizer, key, value);
                                iSerializer9 = af$$ExternalSyntheticOutline0.m$1(iSerializer18, iSerializer18, iSerializer17, iSerializer9);
                            }
                        }
                        iM$2 += iSerializer9;
                        break;
                    case 51:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            iSerializer = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer + 8;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            iSerializer2 = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer2 + 4;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 53:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            long jIconCompatParcelizer = IconCompatParcelizer(j, generatedMessageLite);
                            iSerializer3 = ComposeView.serializer(i8);
                            iSerializer4 = ComposeView.serializer(jIconCompatParcelizer);
                            iSerializer8 = iSerializer4 + iSerializer3;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 54:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            long jIconCompatParcelizer2 = IconCompatParcelizer(j, generatedMessageLite);
                            iSerializer3 = ComposeView.serializer(i8);
                            iSerializer4 = ComposeView.serializer(jIconCompatParcelizer2);
                            iSerializer8 = iSerializer4 + iSerializer3;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 55:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            int iSerializer19 = serializer(j, generatedMessageLite);
                            iSerializer5 = ComposeView.serializer(i8);
                            iRemoteActionCompatParcelizer = ComposeView.read(iSerializer19);
                            iSerializer8 = iRemoteActionCompatParcelizer + iSerializer5;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 56:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            iSerializer = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer + 8;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 57:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            iSerializer2 = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer2 + 4;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 58:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            iSerializer6 = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer6 + 1;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 59:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            Object object4 = unsafe.getObject(generatedMessageLite, j);
                            if (object4 instanceof getClipMetadata) {
                                int iSerializer20 = ComposeView.serializer(i8);
                                int iRatingCompat6 = ((getClipMetadata) object4).RatingCompat();
                                iM$1 = af$$ExternalSyntheticOutline0.m$1(iRatingCompat6, iRatingCompat6, iSerializer20, iM$2);
                            } else {
                                iSerializer7 = ComposeView.serializer(i8);
                                iWrite = ComposeView.write((String) object4);
                                iM$1 = iWrite + iSerializer7 + iM$2;
                            }
                            iM$2 = iM$1;
                        }
                        break;
                    case 60:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            Object object5 = unsafe.getObject(generatedMessageLite, j);
                            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer5 = serializer(i7);
                            Class cls21 = registerProvider.read;
                            int iSerializer21 = ComposeView.serializer(i8);
                            int serializedSize4 = ((AbstractMessageLite) ((getElevation) object5)).getSerializedSize(disposableSaveableStateRegistrylambda0Serializer5);
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(serializedSize4, serializedSize4, iSerializer21, iM$2);
                        }
                        break;
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            getClipMetadata getclipmetadata2 = (getClipMetadata) unsafe.getObject(generatedMessageLite, j);
                            int iSerializer22 = ComposeView.serializer(i8);
                            int iRatingCompat7 = getclipmetadata2.RatingCompat();
                            iM$2 = af$$ExternalSyntheticOutline0.m$1(iRatingCompat7, iRatingCompat7, iSerializer22, iM$2);
                        }
                        break;
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            int iSerializer23 = serializer(j, generatedMessageLite);
                            iSerializer5 = ComposeView.serializer(i8);
                            iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer(iSerializer23);
                            iSerializer8 = iRemoteActionCompatParcelizer + iSerializer5;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 63:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            int iSerializer24 = serializer(j, generatedMessageLite);
                            iSerializer5 = ComposeView.serializer(i8);
                            iRemoteActionCompatParcelizer = ComposeView.read(iSerializer24);
                            iSerializer8 = iRemoteActionCompatParcelizer + iSerializer5;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 64:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            iSerializer2 = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer2 + 4;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 65:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            iSerializer = ComposeView.serializer(i8);
                            iSerializer8 = iSerializer + 8;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 66:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            int iSerializer25 = serializer(j, generatedMessageLite);
                            iSerializer5 = ComposeView.serializer(i8);
                            iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer((iSerializer25 << 1) ^ (iSerializer25 >> 31));
                            iSerializer8 = iRemoteActionCompatParcelizer + iSerializer5;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 67:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            long jIconCompatParcelizer3 = IconCompatParcelizer(j, generatedMessageLite);
                            iSerializer3 = ComposeView.serializer(i8);
                            iSerializer4 = ComposeView.serializer((jIconCompatParcelizer3 >> 63) ^ (jIconCompatParcelizer3 << 1));
                            iSerializer8 = iSerializer4 + iSerializer3;
                            iM$2 += iSerializer8;
                        }
                        break;
                    case 68:
                        if (RemoteActionCompatParcelizer(i8, i7, generatedMessageLite)) {
                            getElevation getelevation2 = (getElevation) unsafe.getObject(generatedMessageLite, j);
                            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer6 = serializer(i7);
                            int iSerializer26 = ComposeView.serializer(i8);
                            iSerializer4 = ((AbstractMessageLite) getelevation2).getSerializedSize(disposableSaveableStateRegistrylambda0Serializer6);
                            iSerializer3 = iSerializer26 * 2;
                            iSerializer8 = iSerializer4 + iSerializer3;
                            iM$2 += iSerializer8;
                        }
                        break;
                }
                i7 += 3;
                i6 = i;
                i5 = i2;
                i4 = 1048575;
            } else {
                ((GlobalSnapshotManagerensureStarted2) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
                int iWrite3 = generatedMessageLite.RemoteActionCompatParcelizer.write() + iM$2;
                if (!this.MediaSessionCompatQueueItem) {
                    return iWrite3;
                }
                this.MediaDescriptionCompat.getClass();
                return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.RemoteActionCompatParcelizer() + iWrite3;
            }
        }
    }

    public final int write(Object obj, byte[] bArr, int i, int i2, int i3, long j, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        Unsafe unsafe = read;
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i3);
        Object object = unsafe.getObject(obj, j);
        this.ParcelableVolumeInfo.getClass();
        if (!((fromDpSizeitqla9I) object).RemoteActionCompatParcelizer) {
            fromDpSizeitqla9I fromdpsizeitqla9iSerializer = fromDpSizeitqla9I.serializer.serializer();
            getPxSizeYbymL2g.serializer(fromdpsizeitqla9iSerializer, object);
            unsafe.putObject(obj, j, fromdpsizeitqla9iSerializer);
            object = fromdpsizeitqla9iSerializer;
        }
        ImageLoader$Builder imageLoader$Builder = ((fromPxSizeviCIZxY) objRemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
        fromDpSizeitqla9I fromdpsizeitqla9i = (fromDpSizeitqla9I) object;
        int iRemoteActionCompatParcelizer = ArrayDecoders.RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i4 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        if (i4 >= 0 && i4 <= i2 - iRemoteActionCompatParcelizer) {
            int i5 = iRemoteActionCompatParcelizer + i4;
            Object obj2 = imageLoader$Builder.IconCompatParcelizer;
            Object obj3 = imageLoader$Builder.serializer;
            Object obj4 = obj2;
            Object obj5 = obj3;
            while (iRemoteActionCompatParcelizer < i5) {
                int iRemoteActionCompatParcelizer2 = iRemoteActionCompatParcelizer + 1;
                int i6 = bArr[iRemoteActionCompatParcelizer];
                if (i6 < 0) {
                    iRemoteActionCompatParcelizer2 = ArrayDecoders.RemoteActionCompatParcelizer(i6, bArr, iRemoteActionCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    i6 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                }
                int i7 = i6 >>> 3;
                int i8 = i6 & 7;
                if (i7 != 1) {
                    if (i7 == 2 && i8 == ((onScroll) imageLoader$Builder.read).getWireType()) {
                        iRemoteActionCompatParcelizer = read(bArr, iRemoteActionCompatParcelizer2, i2, (onScroll) imageLoader$Builder.read, obj3.getClass(), r8lambdacyuxafptvn7drfel1dgtevxcy);
                        obj5 = r8lambdacyuxafptvn7drfel1dgtevxcy.read;
                    } else {
                        iRemoteActionCompatParcelizer = ArrayDecoders.write(i6, bArr, iRemoteActionCompatParcelizer2, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    }
                } else if (i8 == ((onScroll) imageLoader$Builder.RemoteActionCompatParcelizer).getWireType()) {
                    iRemoteActionCompatParcelizer = read(bArr, iRemoteActionCompatParcelizer2, i2, (onScroll) imageLoader$Builder.RemoteActionCompatParcelizer, null, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    obj4 = r8lambdacyuxafptvn7drfel1dgtevxcy.read;
                } else {
                    iRemoteActionCompatParcelizer = ArrayDecoders.write(i6, bArr, iRemoteActionCompatParcelizer2, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
            }
            if (iRemoteActionCompatParcelizer == i5) {
                fromdpsizeitqla9i.put(obj4, obj5);
                return i5;
            }
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        throw InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    public final Object write(int i, int i2, Object obj) {
        DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer = serializer(i2);
        if (!RemoteActionCompatParcelizer(i, i2, obj)) {
            return disposableSaveableStateRegistrylambda0Serializer.read();
        }
        Object object = read.getObject(obj, MediaSessionCompatQueueItem(i2) & 1048575);
        if (write(object)) {
            return object;
        }
        Object obj2 = disposableSaveableStateRegistrylambda0Serializer.read();
        if (object != null) {
            disposableSaveableStateRegistrylambda0Serializer.read(obj2, object);
        }
        return obj2;
    }

    public final boolean write(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return read(i, generatedMessageLite) == read(i, generatedMessageLite2);
    }

    public static java.lang.reflect.Field serializer(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Field ", str, " for ");
            sbM.append(cls.getName());
            sbM.append(" not found. Known fields are ");
            sbM.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM.toString());
        }
    }

    public final void RemoteActionCompatParcelizer(Object obj, int i, CodedInputStreamReader codedInputStreamReader, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        List listIconCompatParcelizer = this.RatingCompat.IconCompatParcelizer(i & 1048575, obj);
        CodedInputStream codedInputStream = codedInputStreamReader.serializer;
        int i2 = codedInputStreamReader.IconCompatParcelizer;
        if ((i2 & 7) == 2) {
            do {
                Object obj2 = disposableSaveableStateRegistrylambda0.read();
                codedInputStreamReader.IconCompatParcelizer(obj2, disposableSaveableStateRegistrylambda0, getlocalprovidablescrollcaptureinprogress);
                disposableSaveableStateRegistrylambda0.read(obj2);
                listIconCompatParcelizer.add(obj2);
                if (codedInputStream.IconCompatParcelizer() || codedInputStreamReader.RemoteActionCompatParcelizer != 0) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == i2);
            codedInputStreamReader.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            return;
        }
        throw InvalidProtocolBufferException.serializer();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03da  */
    /* JADX WARN: Code duplicated, block: B:101:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:102:0x0402  */
    /* JADX WARN: Code duplicated, block: B:103:0x0416  */
    /* JADX WARN: Code duplicated, block: B:104:0x042a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0442  */
    /* JADX WARN: Code duplicated, block: B:106:0x0456  */
    /* JADX WARN: Code duplicated, block: B:107:0x046a  */
    /* JADX WARN: Code duplicated, block: B:108:0x047e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0492  */
    /* JADX WARN: Code duplicated, block: B:110:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:112:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:113:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:114:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:116:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:117:0x0510  */
    /* JADX WARN: Code duplicated, block: B:119:0x0518  */
    /* JADX WARN: Code duplicated, block: B:120:0x052e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0536  */
    /* JADX WARN: Code duplicated, block: B:123:0x054c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0554  */
    /* JADX WARN: Code duplicated, block: B:126:0x0566  */
    /* JADX WARN: Code duplicated, block: B:128:0x056e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0580  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:131:0x0588  */
    /* JADX WARN: Code duplicated, block: B:132:0x059a  */
    /* JADX WARN: Code duplicated, block: B:134:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:137:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:138:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:140:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:141:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:143:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:144:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:146:0x0604  */
    /* JADX WARN: Code duplicated, block: B:147:0x0616  */
    /* JADX WARN: Code duplicated, block: B:149:0x061e  */
    /* JADX WARN: Code duplicated, block: B:150:0x062c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0634  */
    /* JADX WARN: Code duplicated, block: B:153:0x0642  */
    /* JADX WARN: Code duplicated, block: B:155:0x064a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0657  */
    /* JADX WARN: Code duplicated, block: B:158:0x065f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0670  */
    /* JADX WARN: Code duplicated, block: B:161:0x0678  */
    /* JADX WARN: Code duplicated, block: B:162:0x0685  */
    /* JADX WARN: Code duplicated, block: B:164:0x068d  */
    /* JADX WARN: Code duplicated, block: B:165:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:167:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:181:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:270:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x0110  */
    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:47:0x0130  */
    /* JADX WARN: Code duplicated, block: B:48:0x0140  */
    /* JADX WARN: Code duplicated, block: B:50:0x0148  */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:53:0x0160  */
    /* JADX WARN: Code duplicated, block: B:54:0x0172  */
    /* JADX WARN: Code duplicated, block: B:56:0x017a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0188  */
    /* JADX WARN: Code duplicated, block: B:59:0x0190  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0204  */
    /* JADX WARN: Code duplicated, block: B:75:0x0210  */
    /* JADX WARN: Code duplicated, block: B:77:0x0218  */
    /* JADX WARN: Code duplicated, block: B:78:0x0237  */
    /* JADX WARN: Code duplicated, block: B:80:0x023f  */
    /* JADX WARN: Code duplicated, block: B:81:0x025e  */
    /* JADX WARN: Code duplicated, block: B:82:0x026e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0286  */
    /* JADX WARN: Code duplicated, block: B:84:0x029a  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0312  */
    /* JADX WARN: Code duplicated, block: B:91:0x0326  */
    /* JADX WARN: Code duplicated, block: B:92:0x033a  */
    /* JADX WARN: Code duplicated, block: B:93:0x034e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0362  */
    /* JADX WARN: Code duplicated, block: B:95:0x0376  */
    /* JADX WARN: Code duplicated, block: B:96:0x038a  */
    /* JADX WARN: Code duplicated, block: B:97:0x039e  */
    /* JADX WARN: Code duplicated, block: B:98:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:99:0x03c6  */
    @Override // o.DisposableSaveableStateRegistrylambda0
    public final void IconCompatParcelizer(Object obj, DefaultHapticFeedback defaultHapticFeedback) {
        Iterator it;
        Map.Entry entry;
        Map.Entry entry2;
        defaultHapticFeedback.getClass();
        if (onLongPress.ASCENDING == onLongPress.DESCENDING) {
            getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller = this.MediaDescriptionCompat;
            int[] iArr = this.write;
            ((GlobalSnapshotManagerensureStarted2) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
            ((GeneratedMessageLite) obj).RemoteActionCompatParcelizer.serializer(defaultHapticFeedback);
            if (this.MediaSessionCompatQueueItem) {
                getlocalsoftwarekeyboardcontroller.getClass();
                CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
                if (compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.isEmpty()) {
                    it = null;
                    entry = null;
                } else {
                    performSave performsave = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer;
                    if (performsave.serializer == null) {
                        performsave.serializer = new r8lambdavXWQ89TxHQ24MnxQcigE5jRzS1E(performsave);
                    }
                    it = performsave.serializer.iterator();
                    entry = (Map.Entry) it.next();
                }
            } else {
                it = null;
                entry = null;
            }
            int length = iArr.length - 3;
            while (length >= 0) {
                int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(length);
                int i = iArr[length];
                while (entry != null) {
                    getlocalsoftwarekeyboardcontroller.getClass();
                    if (((CompositionLocalsKtLocalLocale1) entry.getKey()).write() > i) {
                        getLocalSoftwareKeyboardController.IconCompatParcelizer(defaultHapticFeedback, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    } else {
                        switch (IconCompatParcelizer(iMediaSessionCompatQueueItem)) {
                            case 0:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    double dRemoteActionCompatParcelizer = setDirty.RatingCompat.RemoteActionCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj);
                                    ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
                                    composeView.getClass();
                                    composeView.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dRemoteActionCompatParcelizer));
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 1:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    float f = setDirty.RatingCompat.read(iMediaSessionCompatQueueItem & 1048575, obj);
                                    ComposeView composeView2 = (ComposeView) defaultHapticFeedback.write;
                                    composeView2.getClass();
                                    composeView2.read(i, Float.floatToRawIntBits(f));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 2:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    defaultHapticFeedback.IconCompatParcelizer(i, setDirty.RatingCompat.MediaDescriptionCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 3:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).write(i, setDirty.RatingCompat.MediaDescriptionCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 4:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    defaultHapticFeedback.serializer(i, setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 5:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    defaultHapticFeedback.serializer(i, setDirty.RatingCompat.MediaDescriptionCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 6:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    defaultHapticFeedback.read(i, setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 7:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).RemoteActionCompatParcelizer(i, setDirty.RatingCompat.write(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 8:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    IconCompatParcelizer(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback);
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 9:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    defaultHapticFeedback.read(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), serializer(length));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 10:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    defaultHapticFeedback.IconCompatParcelizer(i, (getClipMetadata) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 11:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).IconCompatParcelizer(i, setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 12:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).write(i, setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 13:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).read(i, setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 14:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).RemoteActionCompatParcelizer(i, setDirty.RatingCompat.MediaDescriptionCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 15:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    int iIconCompatParcelizer = setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj);
                                    ((ComposeView) defaultHapticFeedback.write).IconCompatParcelizer(i, (iIconCompatParcelizer << 1) ^ (iIconCompatParcelizer >> 31));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 16:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    long jMediaDescriptionCompat = setDirty.RatingCompat.MediaDescriptionCompat(iMediaSessionCompatQueueItem & 1048575, obj);
                                    ((ComposeView) defaultHapticFeedback.write).write(i, (jMediaDescriptionCompat >> 63) ^ (jMediaDescriptionCompat << 1));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 17:
                                entry2 = entry;
                                if (read(length, obj)) {
                                    defaultHapticFeedback.write(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), serializer(length));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 18:
                                entry2 = entry;
                                registerProvider.serializer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 19:
                                entry2 = entry;
                                registerProvider.RatingCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 20:
                                entry2 = entry;
                                registerProvider.MediaSessionCompatQueueItem(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 21:
                                entry2 = entry;
                                registerProvider.PlaybackStateCompatCustomAction(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 22:
                                entry2 = entry;
                                registerProvider.MediaMetadataCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 23:
                                entry2 = entry;
                                registerProvider.read(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 24:
                                entry2 = entry;
                                registerProvider.write(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 25:
                                entry2 = entry;
                                registerProvider.RemoteActionCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 26:
                                entry2 = entry;
                                registerProvider.RemoteActionCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 27:
                                entry2 = entry;
                                registerProvider.RemoteActionCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, serializer(length));
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 28:
                                entry2 = entry;
                                registerProvider.write(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 29:
                                entry2 = entry;
                                registerProvider.MediaSessionCompatToken(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 30:
                                entry2 = entry;
                                registerProvider.IconCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 31:
                                entry2 = entry;
                                registerProvider.MediaDescriptionCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 32:
                                entry2 = entry;
                                registerProvider.MediaBrowserCompatMediaItem(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 33:
                                entry2 = entry;
                                registerProvider.ParcelableVolumeInfo(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                entry2 = entry;
                                registerProvider.MediaSessionCompatResultReceiverWrapper(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 35:
                                entry2 = entry;
                                registerProvider.serializer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                entry2 = entry;
                                registerProvider.RatingCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 37:
                                entry2 = entry;
                                registerProvider.MediaSessionCompatQueueItem(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 38:
                                entry2 = entry;
                                registerProvider.PlaybackStateCompatCustomAction(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                entry2 = entry;
                                registerProvider.MediaMetadataCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 40:
                                entry2 = entry;
                                registerProvider.read(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                entry2 = entry;
                                registerProvider.write(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                entry2 = entry;
                                registerProvider.RemoteActionCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 43:
                                entry2 = entry;
                                registerProvider.MediaSessionCompatToken(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 44:
                                entry2 = entry;
                                registerProvider.IconCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                entry2 = entry;
                                registerProvider.MediaDescriptionCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 46:
                                entry2 = entry;
                                registerProvider.MediaBrowserCompatMediaItem(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 47:
                                entry2 = entry;
                                registerProvider.ParcelableVolumeInfo(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                                entry2 = entry;
                                registerProvider.MediaSessionCompatResultReceiverWrapper(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 49:
                                entry2 = entry;
                                registerProvider.IconCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, serializer(length));
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                                entry2 = entry;
                                write(defaultHapticFeedback, i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), length);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 51:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    double dDoubleValue = ((Double) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj)).doubleValue();
                                    ComposeView composeView3 = (ComposeView) defaultHapticFeedback.write;
                                    composeView3.getClass();
                                    composeView3.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dDoubleValue));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    float fFloatValue = ((Float) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj)).floatValue();
                                    ComposeView composeView4 = (ComposeView) defaultHapticFeedback.write;
                                    composeView4.getClass();
                                    composeView4.read(i, Float.floatToRawIntBits(fFloatValue));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 53:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    defaultHapticFeedback.IconCompatParcelizer(i, IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 54:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).write(i, IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 55:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    defaultHapticFeedback.serializer(i, serializer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 56:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    defaultHapticFeedback.serializer(i, IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 57:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    defaultHapticFeedback.read(i, serializer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 58:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).RemoteActionCompatParcelizer(i, ((Boolean) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj)).booleanValue());
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 59:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    IconCompatParcelizer(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback);
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 60:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    defaultHapticFeedback.read(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), serializer(length));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case RectListKt.BitOffsetForFocusable /* 61 */:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    defaultHapticFeedback.IconCompatParcelizer(i, (getClipMetadata) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case RectListKt.BitOffsetForGesturable /* 62 */:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).IconCompatParcelizer(i, serializer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 63:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).write(i, serializer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 64:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).read(i, serializer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 65:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    ((ComposeView) defaultHapticFeedback.write).RemoteActionCompatParcelizer(i, IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 66:
                                entry2 = entry;
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    int iSerializer = serializer(iMediaSessionCompatQueueItem & 1048575, obj);
                                    ((ComposeView) defaultHapticFeedback.write).IconCompatParcelizer(i, (iSerializer << 1) ^ (iSerializer >> 31));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 67:
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    entry2 = entry;
                                    long jIconCompatParcelizer = IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj);
                                    ((ComposeView) defaultHapticFeedback.write).write(i, (jIconCompatParcelizer >> 63) ^ (jIconCompatParcelizer << 1));
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 68:
                                if (RemoteActionCompatParcelizer(i, length, obj)) {
                                    defaultHapticFeedback.write(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), serializer(length));
                                }
                                break;
                        }
                        entry2 = entry;
                        length -= 3;
                        entry = entry2;
                    }
                }
                switch (IconCompatParcelizer(iMediaSessionCompatQueueItem)) {
                    case 0:
                        entry2 = entry;
                        if (read(length, obj)) {
                            double dRemoteActionCompatParcelizer2 = setDirty.RatingCompat.RemoteActionCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj);
                            ComposeView composeView5 = (ComposeView) defaultHapticFeedback.write;
                            composeView5.getClass();
                            composeView5.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dRemoteActionCompatParcelizer2));
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 1:
                        entry2 = entry;
                        if (read(length, obj)) {
                            float f2 = setDirty.RatingCompat.read(iMediaSessionCompatQueueItem & 1048575, obj);
                            ComposeView composeView6 = (ComposeView) defaultHapticFeedback.write;
                            composeView6.getClass();
                            composeView6.read(i, Float.floatToRawIntBits(f2));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 2:
                        entry2 = entry;
                        if (read(length, obj)) {
                            defaultHapticFeedback.IconCompatParcelizer(i, setDirty.RatingCompat.MediaDescriptionCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 3:
                        entry2 = entry;
                        if (read(length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).write(i, setDirty.RatingCompat.MediaDescriptionCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 4:
                        entry2 = entry;
                        if (read(length, obj)) {
                            defaultHapticFeedback.serializer(i, setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 5:
                        entry2 = entry;
                        if (read(length, obj)) {
                            defaultHapticFeedback.serializer(i, setDirty.RatingCompat.MediaDescriptionCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 6:
                        entry2 = entry;
                        if (read(length, obj)) {
                            defaultHapticFeedback.read(i, setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 7:
                        entry2 = entry;
                        if (read(length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).RemoteActionCompatParcelizer(i, setDirty.RatingCompat.write(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 8:
                        entry2 = entry;
                        if (read(length, obj)) {
                            IconCompatParcelizer(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback);
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 9:
                        entry2 = entry;
                        if (read(length, obj)) {
                            defaultHapticFeedback.read(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), serializer(length));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 10:
                        entry2 = entry;
                        if (read(length, obj)) {
                            defaultHapticFeedback.IconCompatParcelizer(i, (getClipMetadata) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 11:
                        entry2 = entry;
                        if (read(length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).IconCompatParcelizer(i, setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 12:
                        entry2 = entry;
                        if (read(length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).write(i, setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 13:
                        entry2 = entry;
                        if (read(length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).read(i, setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 14:
                        entry2 = entry;
                        if (read(length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).RemoteActionCompatParcelizer(i, setDirty.RatingCompat.MediaDescriptionCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 15:
                        entry2 = entry;
                        if (read(length, obj)) {
                            int iIconCompatParcelizer2 = setDirty.RatingCompat.IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj);
                            ((ComposeView) defaultHapticFeedback.write).IconCompatParcelizer(i, (iIconCompatParcelizer2 << 1) ^ (iIconCompatParcelizer2 >> 31));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 16:
                        entry2 = entry;
                        if (read(length, obj)) {
                            long jMediaDescriptionCompat2 = setDirty.RatingCompat.MediaDescriptionCompat(iMediaSessionCompatQueueItem & 1048575, obj);
                            ((ComposeView) defaultHapticFeedback.write).write(i, (jMediaDescriptionCompat2 >> 63) ^ (jMediaDescriptionCompat2 << 1));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 17:
                        entry2 = entry;
                        if (read(length, obj)) {
                            defaultHapticFeedback.write(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), serializer(length));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 18:
                        entry2 = entry;
                        registerProvider.serializer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 19:
                        entry2 = entry;
                        registerProvider.RatingCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 20:
                        entry2 = entry;
                        registerProvider.MediaSessionCompatQueueItem(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 21:
                        entry2 = entry;
                        registerProvider.PlaybackStateCompatCustomAction(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 22:
                        entry2 = entry;
                        registerProvider.MediaMetadataCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 23:
                        entry2 = entry;
                        registerProvider.read(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 24:
                        entry2 = entry;
                        registerProvider.write(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 25:
                        entry2 = entry;
                        registerProvider.RemoteActionCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 26:
                        entry2 = entry;
                        registerProvider.RemoteActionCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 27:
                        entry2 = entry;
                        registerProvider.RemoteActionCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, serializer(length));
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 28:
                        entry2 = entry;
                        registerProvider.write(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 29:
                        entry2 = entry;
                        registerProvider.MediaSessionCompatToken(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 30:
                        entry2 = entry;
                        registerProvider.IconCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 31:
                        entry2 = entry;
                        registerProvider.MediaDescriptionCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 32:
                        entry2 = entry;
                        registerProvider.MediaBrowserCompatMediaItem(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 33:
                        entry2 = entry;
                        registerProvider.ParcelableVolumeInfo(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        entry2 = entry;
                        registerProvider.MediaSessionCompatResultReceiverWrapper(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 35:
                        entry2 = entry;
                        registerProvider.serializer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        entry2 = entry;
                        registerProvider.RatingCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 37:
                        entry2 = entry;
                        registerProvider.MediaSessionCompatQueueItem(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 38:
                        entry2 = entry;
                        registerProvider.PlaybackStateCompatCustomAction(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        entry2 = entry;
                        registerProvider.MediaMetadataCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 40:
                        entry2 = entry;
                        registerProvider.read(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        entry2 = entry;
                        registerProvider.write(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        entry2 = entry;
                        registerProvider.RemoteActionCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 43:
                        entry2 = entry;
                        registerProvider.MediaSessionCompatToken(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 44:
                        entry2 = entry;
                        registerProvider.IconCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        entry2 = entry;
                        registerProvider.MediaDescriptionCompat(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 46:
                        entry2 = entry;
                        registerProvider.MediaBrowserCompatMediaItem(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 47:
                        entry2 = entry;
                        registerProvider.ParcelableVolumeInfo(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        entry2 = entry;
                        registerProvider.MediaSessionCompatResultReceiverWrapper(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 49:
                        entry2 = entry;
                        registerProvider.IconCompatParcelizer(iArr[length], (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback, serializer(length));
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        entry2 = entry;
                        write(defaultHapticFeedback, i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), length);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 51:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            double dDoubleValue2 = ((Double) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj)).doubleValue();
                            ComposeView composeView7 = (ComposeView) defaultHapticFeedback.write;
                            composeView7.getClass();
                            composeView7.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dDoubleValue2));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            float fFloatValue2 = ((Float) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj)).floatValue();
                            ComposeView composeView8 = (ComposeView) defaultHapticFeedback.write;
                            composeView8.getClass();
                            composeView8.read(i, Float.floatToRawIntBits(fFloatValue2));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 53:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            defaultHapticFeedback.IconCompatParcelizer(i, IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 54:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).write(i, IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 55:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            defaultHapticFeedback.serializer(i, serializer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 56:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            defaultHapticFeedback.serializer(i, IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 57:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            defaultHapticFeedback.read(i, serializer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 58:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).RemoteActionCompatParcelizer(i, ((Boolean) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj)).booleanValue());
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 59:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            IconCompatParcelizer(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), defaultHapticFeedback);
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 60:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            defaultHapticFeedback.read(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), serializer(length));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            defaultHapticFeedback.IconCompatParcelizer(i, (getClipMetadata) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).IconCompatParcelizer(i, serializer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 63:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).write(i, serializer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 64:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).read(i, serializer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 65:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            ((ComposeView) defaultHapticFeedback.write).RemoteActionCompatParcelizer(i, IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 66:
                        entry2 = entry;
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            int iSerializer2 = serializer(iMediaSessionCompatQueueItem & 1048575, obj);
                            ((ComposeView) defaultHapticFeedback.write).IconCompatParcelizer(i, (iSerializer2 << 1) ^ (iSerializer2 >> 31));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 67:
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            entry2 = entry;
                            long jIconCompatParcelizer2 = IconCompatParcelizer(iMediaSessionCompatQueueItem & 1048575, obj);
                            ((ComposeView) defaultHapticFeedback.write).write(i, (jIconCompatParcelizer2 >> 63) ^ (jIconCompatParcelizer2 << 1));
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 68:
                        if (RemoteActionCompatParcelizer(i, length, obj)) {
                            defaultHapticFeedback.write(i, setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj), serializer(length));
                        }
                        break;
                }
                entry2 = entry;
                length -= 3;
                entry = entry2;
            }
            while (entry != null) {
                getlocalsoftwarekeyboardcontroller.getClass();
                getLocalSoftwareKeyboardController.IconCompatParcelizer(defaultHapticFeedback, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            return;
        }
        RemoteActionCompatParcelizer(obj, defaultHapticFeedback);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:101:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:102:0x0301  */
    /* JADX WARN: Code duplicated, block: B:103:0x030f  */
    /* JADX WARN: Code duplicated, block: B:104:0x031d  */
    /* JADX WARN: Code duplicated, block: B:105:0x032b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0339  */
    /* JADX WARN: Code duplicated, block: B:107:0x0347  */
    /* JADX WARN: Code duplicated, block: B:108:0x0355  */
    /* JADX WARN: Code duplicated, block: B:109:0x0362  */
    /* JADX WARN: Code duplicated, block: B:110:0x0373  */
    /* JADX WARN: Code duplicated, block: B:111:0x0380  */
    /* JADX WARN: Code duplicated, block: B:112:0x038d  */
    /* JADX WARN: Code duplicated, block: B:113:0x039a  */
    /* JADX WARN: Code duplicated, block: B:114:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:116:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:117:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:118:0x03db  */
    /* JADX WARN: Code duplicated, block: B:120:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:122:0x040a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0418  */
    /* JADX WARN: Code duplicated, block: B:125:0x041f  */
    /* JADX WARN: Code duplicated, block: B:127:0x043a  */
    /* JADX WARN: Code duplicated, block: B:128:0x044d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0468  */
    /* JADX WARN: Code duplicated, block: B:131:0x047a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0495  */
    /* JADX WARN: Code duplicated, block: B:134:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:139:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:140:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:142:0x050d  */
    /* JADX WARN: Code duplicated, block: B:143:0x051a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0535  */
    /* JADX WARN: Code duplicated, block: B:146:0x0540  */
    /* JADX WARN: Code duplicated, block: B:148:0x055b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0568  */
    /* JADX WARN: Code duplicated, block: B:151:0x0583  */
    /* JADX WARN: Code duplicated, block: B:152:0x058c  */
    /* JADX WARN: Code duplicated, block: B:154:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:155:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:157:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:158:0x05da  */
    /* JADX WARN: Code duplicated, block: B:160:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:161:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:163:0x0619  */
    /* JADX WARN: Code duplicated, block: B:164:0x0622  */
    /* JADX WARN: Code duplicated, block: B:166:0x063d  */
    /* JADX WARN: Code duplicated, block: B:167:0x064a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0665  */
    /* JADX WARN: Code duplicated, block: B:170:0x066e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0689  */
    /* JADX WARN: Code duplicated, block: B:173:0x069e  */
    /* JADX WARN: Code duplicated, block: B:175:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:189:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x0142  */
    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:56:0x0153  */
    /* JADX WARN: Code duplicated, block: B:58:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x0166  */
    /* JADX WARN: Code duplicated, block: B:61:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0175  */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0190  */
    /* JADX WARN: Code duplicated, block: B:67:0x0196  */
    /* JADX WARN: Code duplicated, block: B:68:0x019f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x0201  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207  */
    /* JADX WARN: Code duplicated, block: B:86:0x0223  */
    /* JADX WARN: Code duplicated, block: B:87:0x022c  */
    /* JADX WARN: Code duplicated, block: B:88:0x023d  */
    /* JADX WARN: Code duplicated, block: B:89:0x024b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0259  */
    /* JADX WARN: Code duplicated, block: B:91:0x0267  */
    /* JADX WARN: Code duplicated, block: B:92:0x0275  */
    /* JADX WARN: Code duplicated, block: B:93:0x0283  */
    /* JADX WARN: Code duplicated, block: B:94:0x0291  */
    /* JADX WARN: Code duplicated, block: B:95:0x029f  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:97:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:99:0x02d7  */
    public final void RemoteActionCompatParcelizer(Object obj, DefaultHapticFeedback defaultHapticFeedback) {
        Map.Entry entry;
        Iterator it;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        long j;
        int i4;
        boolean z;
        DefaultHapticFeedback defaultHapticFeedback2 = defaultHapticFeedback;
        boolean z2 = this.MediaSessionCompatQueueItem;
        getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller = this.MediaDescriptionCompat;
        if (z2) {
            getlocalsoftwarekeyboardcontroller.getClass();
            CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
            if (compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itWrite = compositionLocalsKtLocalClipboard1.write();
                entry = (Map.Entry) itWrite.next();
                it = itWrite;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = this.write;
        int length = iArr.length;
        Unsafe unsafe = read;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < length) {
            int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i7);
            int i8 = iArr[i7];
            int iIconCompatParcelizer = IconCompatParcelizer(iMediaSessionCompatQueueItem);
            int i9 = length;
            if (iIconCompatParcelizer <= 17) {
                int i10 = iArr[i7 + 2];
                Map.Entry entry3 = entry;
                int i11 = i10 & 1048575;
                if (i11 != i5) {
                    i6 = i11 == 1048575 ? 0 : unsafe.getInt(obj, i11);
                    i5 = i11;
                } else {
                    iArr = iArr;
                }
                int i12 = 1 << (i10 >>> 20);
                i = i5;
                i2 = i6;
                entry2 = entry3;
                i3 = i12;
            } else {
                iArr = iArr;
                i = i5;
                i2 = i6;
                entry2 = entry;
                i3 = 0;
            }
            while (entry2 != null) {
                getlocalsoftwarekeyboardcontroller.getClass();
                if (((CompositionLocalsKtLocalLocale1) entry2.getKey()).write() <= i8) {
                    getLocalSoftwareKeyboardController.IconCompatParcelizer(defaultHapticFeedback2, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                } else {
                    j = iMediaSessionCompatQueueItem & 1048575;
                    switch (iIconCompatParcelizer) {
                        case 0:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                double dRemoteActionCompatParcelizer = setDirty.RatingCompat.RemoteActionCompatParcelizer(j, obj);
                                ComposeView composeView = (ComposeView) defaultHapticFeedback2.write;
                                composeView.getClass();
                                composeView.RemoteActionCompatParcelizer(i8, Double.doubleToRawLongBits(dRemoteActionCompatParcelizer));
                            }
                            break;
                        case 1:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                float f = setDirty.RatingCompat.read(j, obj);
                                ComposeView composeView2 = (ComposeView) defaultHapticFeedback2.write;
                                composeView2.getClass();
                                composeView2.read(i8, Float.floatToRawIntBits(f));
                            }
                            break;
                        case 2:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                defaultHapticFeedback2.IconCompatParcelizer(i8, unsafe.getLong(obj, j));
                            }
                            break;
                        case 3:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                ((ComposeView) defaultHapticFeedback2.write).write(i8, unsafe.getLong(obj, j));
                            }
                            break;
                        case 4:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                defaultHapticFeedback2.serializer(i8, unsafe.getInt(obj, j));
                            }
                            break;
                        case 5:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                defaultHapticFeedback2.serializer(i8, unsafe.getLong(obj, j));
                            }
                            break;
                        case 6:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                defaultHapticFeedback2.read(i8, unsafe.getInt(obj, j));
                            }
                            break;
                        case 7:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                ((ComposeView) defaultHapticFeedback2.write).RemoteActionCompatParcelizer(i8, setDirty.RatingCompat.write(j, obj));
                            }
                            break;
                        case 8:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                IconCompatParcelizer(i8, unsafe.getObject(obj, j), defaultHapticFeedback2);
                            }
                            break;
                        case 9:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                defaultHapticFeedback2.read(i8, unsafe.getObject(obj, j), serializer(i4));
                            }
                            break;
                        case 10:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                defaultHapticFeedback2.IconCompatParcelizer(i8, (getClipMetadata) unsafe.getObject(obj, j));
                            }
                            break;
                        case 11:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                ((ComposeView) defaultHapticFeedback2.write).IconCompatParcelizer(i8, unsafe.getInt(obj, j));
                            }
                            break;
                        case 12:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                ((ComposeView) defaultHapticFeedback2.write).write(i8, unsafe.getInt(obj, j));
                            }
                            break;
                        case 13:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                ((ComposeView) defaultHapticFeedback2.write).read(i8, unsafe.getInt(obj, j));
                            }
                            break;
                        case 14:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                ((ComposeView) defaultHapticFeedback2.write).RemoteActionCompatParcelizer(i8, unsafe.getLong(obj, j));
                            }
                            break;
                        case 15:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i4, i, i2, i3)) {
                                int i13 = unsafe.getInt(obj, j);
                                ((ComposeView) defaultHapticFeedback2.write).IconCompatParcelizer(i8, (i13 << 1) ^ (i13 >> 31));
                            }
                            break;
                        case 16:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            entry2 = entry2;
                            i4 = i7;
                            it = it;
                            i = i;
                            if (serializer(obj, i4, i, i2, i3)) {
                                long j2 = unsafe.getLong(obj, j);
                                ((ComposeView) defaultHapticFeedback2.write).write(i8, (j2 >> 63) ^ (j2 << 1));
                            }
                            break;
                        case 17:
                            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                            entry2 = entry2;
                            i4 = i7;
                            if (serializer(obj, i7, i, i2, i3)) {
                                defaultHapticFeedback2 = defaultHapticFeedback;
                                defaultHapticFeedback2.write(i8, unsafe.getObject(obj, j), serializer(i4));
                            } else {
                                defaultHapticFeedback2 = defaultHapticFeedback;
                            }
                            it = it;
                            i = i;
                            break;
                        case 18:
                            z = false;
                            registerProvider.serializer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 19:
                            z = false;
                            registerProvider.RatingCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 20:
                            z = false;
                            registerProvider.MediaSessionCompatQueueItem(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 21:
                            z = false;
                            registerProvider.PlaybackStateCompatCustomAction(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 22:
                            z = false;
                            registerProvider.MediaMetadataCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 23:
                            z = false;
                            registerProvider.read(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 24:
                            z = false;
                            registerProvider.write(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 25:
                            z = false;
                            registerProvider.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 26:
                            registerProvider.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2);
                            i4 = i7;
                            break;
                        case 27:
                            registerProvider.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, serializer(i7));
                            i4 = i7;
                            break;
                        case 28:
                            registerProvider.write(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2);
                            i4 = i7;
                            break;
                        case 29:
                            registerProvider.MediaSessionCompatToken(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 30:
                            registerProvider.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 31:
                            registerProvider.MediaDescriptionCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 32:
                            registerProvider.MediaBrowserCompatMediaItem(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 33:
                            registerProvider.ParcelableVolumeInfo(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            registerProvider.MediaSessionCompatResultReceiverWrapper(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                            i4 = i7;
                            break;
                        case 35:
                            registerProvider.serializer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            registerProvider.RatingCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case 37:
                            registerProvider.MediaSessionCompatQueueItem(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case 38:
                            registerProvider.PlaybackStateCompatCustomAction(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            registerProvider.MediaMetadataCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case 40:
                            registerProvider.read(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            registerProvider.write(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            registerProvider.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case 43:
                            registerProvider.MediaSessionCompatToken(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case 44:
                            registerProvider.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            registerProvider.MediaDescriptionCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case 46:
                            registerProvider.MediaBrowserCompatMediaItem(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case 47:
                            registerProvider.ParcelableVolumeInfo(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                            registerProvider.MediaSessionCompatResultReceiverWrapper(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                            i4 = i7;
                            break;
                        case 49:
                            registerProvider.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, serializer(i7));
                            i4 = i7;
                            break;
                        case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                            write(defaultHapticFeedback2, i8, unsafe.getObject(obj, j), i7);
                            i4 = i7;
                            break;
                        case 51:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                double dDoubleValue = ((Double) setDirty.RatingCompat.RatingCompat(j, obj)).doubleValue();
                                ComposeView composeView3 = (ComposeView) defaultHapticFeedback2.write;
                                composeView3.getClass();
                                composeView3.RemoteActionCompatParcelizer(i8, Double.doubleToRawLongBits(dDoubleValue));
                            }
                            i4 = i7;
                            break;
                        case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                float fFloatValue = ((Float) setDirty.RatingCompat.RatingCompat(j, obj)).floatValue();
                                ComposeView composeView4 = (ComposeView) defaultHapticFeedback2.write;
                                composeView4.getClass();
                                composeView4.read(i8, Float.floatToRawIntBits(fFloatValue));
                            }
                            i4 = i7;
                            break;
                        case 53:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                defaultHapticFeedback2.IconCompatParcelizer(i8, IconCompatParcelizer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 54:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                ((ComposeView) defaultHapticFeedback2.write).write(i8, IconCompatParcelizer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 55:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                defaultHapticFeedback2.serializer(i8, serializer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 56:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                defaultHapticFeedback2.serializer(i8, IconCompatParcelizer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 57:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                defaultHapticFeedback2.read(i8, serializer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 58:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                ((ComposeView) defaultHapticFeedback2.write).RemoteActionCompatParcelizer(i8, ((Boolean) setDirty.RatingCompat.RatingCompat(j, obj)).booleanValue());
                            }
                            i4 = i7;
                            break;
                        case 59:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                IconCompatParcelizer(i8, unsafe.getObject(obj, j), defaultHapticFeedback2);
                            }
                            i4 = i7;
                            break;
                        case 60:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                defaultHapticFeedback2.read(i8, unsafe.getObject(obj, j), serializer(i7));
                            }
                            i4 = i7;
                            break;
                        case RectListKt.BitOffsetForFocusable /* 61 */:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                defaultHapticFeedback2.IconCompatParcelizer(i8, (getClipMetadata) unsafe.getObject(obj, j));
                            }
                            i4 = i7;
                            break;
                        case RectListKt.BitOffsetForGesturable /* 62 */:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                ((ComposeView) defaultHapticFeedback2.write).IconCompatParcelizer(i8, serializer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 63:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                ((ComposeView) defaultHapticFeedback2.write).write(i8, serializer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 64:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                ((ComposeView) defaultHapticFeedback2.write).read(i8, serializer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 65:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                ((ComposeView) defaultHapticFeedback2.write).RemoteActionCompatParcelizer(i8, IconCompatParcelizer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 66:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                int iSerializer = serializer(j, obj);
                                ((ComposeView) defaultHapticFeedback2.write).IconCompatParcelizer(i8, (iSerializer << 1) ^ (iSerializer >> 31));
                            }
                            i4 = i7;
                            break;
                        case 67:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                long jIconCompatParcelizer = IconCompatParcelizer(j, obj);
                                ((ComposeView) defaultHapticFeedback2.write).write(i8, (jIconCompatParcelizer << 1) ^ (jIconCompatParcelizer >> 63));
                            }
                            i4 = i7;
                            break;
                        case 68:
                            if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                                defaultHapticFeedback2.write(i8, unsafe.getObject(obj, j), serializer(i7));
                            }
                            i4 = i7;
                            break;
                        default:
                            i4 = i7;
                            break;
                    }
                    i7 = i4 + 3;
                    it = it;
                    i6 = i2;
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    length = i9;
                    iArr = iArr;
                    entry = entry2;
                    i5 = i;
                }
            }
            j = iMediaSessionCompatQueueItem & 1048575;
            switch (iIconCompatParcelizer) {
                case 0:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        double dRemoteActionCompatParcelizer2 = setDirty.RatingCompat.RemoteActionCompatParcelizer(j, obj);
                        ComposeView composeView5 = (ComposeView) defaultHapticFeedback2.write;
                        composeView5.getClass();
                        composeView5.RemoteActionCompatParcelizer(i8, Double.doubleToRawLongBits(dRemoteActionCompatParcelizer2));
                    }
                    break;
                case 1:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        float f2 = setDirty.RatingCompat.read(j, obj);
                        ComposeView composeView6 = (ComposeView) defaultHapticFeedback2.write;
                        composeView6.getClass();
                        composeView6.read(i8, Float.floatToRawIntBits(f2));
                    }
                    break;
                case 2:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        defaultHapticFeedback2.IconCompatParcelizer(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        ((ComposeView) defaultHapticFeedback2.write).write(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        defaultHapticFeedback2.serializer(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        defaultHapticFeedback2.serializer(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        defaultHapticFeedback2.read(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        ((ComposeView) defaultHapticFeedback2.write).RemoteActionCompatParcelizer(i8, setDirty.RatingCompat.write(j, obj));
                    }
                    break;
                case 8:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        IconCompatParcelizer(i8, unsafe.getObject(obj, j), defaultHapticFeedback2);
                    }
                    break;
                case 9:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        defaultHapticFeedback2.read(i8, unsafe.getObject(obj, j), serializer(i4));
                    }
                    break;
                case 10:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        defaultHapticFeedback2.IconCompatParcelizer(i8, (getClipMetadata) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        ((ComposeView) defaultHapticFeedback2.write).IconCompatParcelizer(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        ((ComposeView) defaultHapticFeedback2.write).write(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        ((ComposeView) defaultHapticFeedback2.write).read(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        ((ComposeView) defaultHapticFeedback2.write).RemoteActionCompatParcelizer(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i4, i, i2, i3)) {
                        int i14 = unsafe.getInt(obj, j);
                        ((ComposeView) defaultHapticFeedback2.write).IconCompatParcelizer(i8, (i14 << 1) ^ (i14 >> 31));
                    }
                    break;
                case 16:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    entry2 = entry2;
                    i4 = i7;
                    it = it;
                    i = i;
                    if (serializer(obj, i4, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        ((ComposeView) defaultHapticFeedback2.write).write(i8, (j3 >> 63) ^ (j3 << 1));
                    }
                    break;
                case 17:
                    getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
                    entry2 = entry2;
                    i4 = i7;
                    if (serializer(obj, i7, i, i2, i3)) {
                        defaultHapticFeedback2 = defaultHapticFeedback;
                        defaultHapticFeedback2.write(i8, unsafe.getObject(obj, j), serializer(i4));
                    } else {
                        defaultHapticFeedback2 = defaultHapticFeedback;
                    }
                    it = it;
                    i = i;
                    break;
                case 18:
                    z = false;
                    registerProvider.serializer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 19:
                    z = false;
                    registerProvider.RatingCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 20:
                    z = false;
                    registerProvider.MediaSessionCompatQueueItem(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 21:
                    z = false;
                    registerProvider.PlaybackStateCompatCustomAction(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 22:
                    z = false;
                    registerProvider.MediaMetadataCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 23:
                    z = false;
                    registerProvider.read(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 24:
                    z = false;
                    registerProvider.write(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 25:
                    z = false;
                    registerProvider.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 26:
                    registerProvider.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2);
                    i4 = i7;
                    break;
                case 27:
                    registerProvider.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, serializer(i7));
                    i4 = i7;
                    break;
                case 28:
                    registerProvider.write(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2);
                    i4 = i7;
                    break;
                case 29:
                    registerProvider.MediaSessionCompatToken(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 30:
                    registerProvider.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 31:
                    registerProvider.MediaDescriptionCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 32:
                    registerProvider.MediaBrowserCompatMediaItem(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 33:
                    registerProvider.ParcelableVolumeInfo(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    registerProvider.MediaSessionCompatResultReceiverWrapper(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, false);
                    i4 = i7;
                    break;
                case 35:
                    registerProvider.serializer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    registerProvider.RatingCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case 37:
                    registerProvider.MediaSessionCompatQueueItem(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case 38:
                    registerProvider.PlaybackStateCompatCustomAction(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    registerProvider.MediaMetadataCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case 40:
                    registerProvider.read(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    registerProvider.write(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    registerProvider.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case 43:
                    registerProvider.MediaSessionCompatToken(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case 44:
                    registerProvider.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    registerProvider.MediaDescriptionCompat(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case 46:
                    registerProvider.MediaBrowserCompatMediaItem(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case 47:
                    registerProvider.ParcelableVolumeInfo(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                    registerProvider.MediaSessionCompatResultReceiverWrapper(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, true);
                    i4 = i7;
                    break;
                case 49:
                    registerProvider.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), defaultHapticFeedback2, serializer(i7));
                    i4 = i7;
                    break;
                case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    write(defaultHapticFeedback2, i8, unsafe.getObject(obj, j), i7);
                    i4 = i7;
                    break;
                case 51:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        double dDoubleValue2 = ((Double) setDirty.RatingCompat.RatingCompat(j, obj)).doubleValue();
                        ComposeView composeView7 = (ComposeView) defaultHapticFeedback2.write;
                        composeView7.getClass();
                        composeView7.RemoteActionCompatParcelizer(i8, Double.doubleToRawLongBits(dDoubleValue2));
                    }
                    i4 = i7;
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        float fFloatValue2 = ((Float) setDirty.RatingCompat.RatingCompat(j, obj)).floatValue();
                        ComposeView composeView8 = (ComposeView) defaultHapticFeedback2.write;
                        composeView8.getClass();
                        composeView8.read(i8, Float.floatToRawIntBits(fFloatValue2));
                    }
                    i4 = i7;
                    break;
                case 53:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        defaultHapticFeedback2.IconCompatParcelizer(i8, IconCompatParcelizer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 54:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        ((ComposeView) defaultHapticFeedback2.write).write(i8, IconCompatParcelizer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 55:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        defaultHapticFeedback2.serializer(i8, serializer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 56:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        defaultHapticFeedback2.serializer(i8, IconCompatParcelizer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 57:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        defaultHapticFeedback2.read(i8, serializer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 58:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        ((ComposeView) defaultHapticFeedback2.write).RemoteActionCompatParcelizer(i8, ((Boolean) setDirty.RatingCompat.RatingCompat(j, obj)).booleanValue());
                    }
                    i4 = i7;
                    break;
                case 59:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        IconCompatParcelizer(i8, unsafe.getObject(obj, j), defaultHapticFeedback2);
                    }
                    i4 = i7;
                    break;
                case 60:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        defaultHapticFeedback2.read(i8, unsafe.getObject(obj, j), serializer(i7));
                    }
                    i4 = i7;
                    break;
                case RectListKt.BitOffsetForFocusable /* 61 */:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        defaultHapticFeedback2.IconCompatParcelizer(i8, (getClipMetadata) unsafe.getObject(obj, j));
                    }
                    i4 = i7;
                    break;
                case RectListKt.BitOffsetForGesturable /* 62 */:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        ((ComposeView) defaultHapticFeedback2.write).IconCompatParcelizer(i8, serializer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 63:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        ((ComposeView) defaultHapticFeedback2.write).write(i8, serializer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 64:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        ((ComposeView) defaultHapticFeedback2.write).read(i8, serializer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 65:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        ((ComposeView) defaultHapticFeedback2.write).RemoteActionCompatParcelizer(i8, IconCompatParcelizer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 66:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        int iSerializer2 = serializer(j, obj);
                        ((ComposeView) defaultHapticFeedback2.write).IconCompatParcelizer(i8, (iSerializer2 << 1) ^ (iSerializer2 >> 31));
                    }
                    i4 = i7;
                    break;
                case 67:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        long jIconCompatParcelizer2 = IconCompatParcelizer(j, obj);
                        ((ComposeView) defaultHapticFeedback2.write).write(i8, (jIconCompatParcelizer2 << 1) ^ (jIconCompatParcelizer2 >> 63));
                    }
                    i4 = i7;
                    break;
                case 68:
                    if (RemoteActionCompatParcelizer(i8, i7, obj)) {
                        defaultHapticFeedback2.write(i8, unsafe.getObject(obj, j), serializer(i7));
                    }
                    i4 = i7;
                    break;
                default:
                    i4 = i7;
                    break;
            }
            i7 = i4 + 3;
            it = it;
            i6 = i2;
            getlocalsoftwarekeyboardcontroller = getlocalsoftwarekeyboardcontroller;
            length = i9;
            iArr = iArr;
            entry = entry2;
            i5 = i;
        }
        getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller2 = getlocalsoftwarekeyboardcontroller;
        Iterator it2 = it;
        while (entry != null) {
            getlocalsoftwarekeyboardcontroller2.getClass();
            getLocalSoftwareKeyboardController.IconCompatParcelizer(defaultHapticFeedback2, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        ((GlobalSnapshotManagerensureStarted2) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        ((GeneratedMessageLite) obj).RemoteActionCompatParcelizer.serializer(defaultHapticFeedback2);
    }

    public final void read(Object obj, int i, Object obj2) {
        if (read(i, obj2)) {
            long jMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i) & 1048575;
            Unsafe unsafe = read;
            Object object = unsafe.getObject(obj2, jMediaSessionCompatQueueItem);
            if (object == null) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(this.write[i], obj2);
                return;
            }
            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer = serializer(i);
            if (!read(i, obj)) {
                if (write(object)) {
                    Object obj3 = disposableSaveableStateRegistrylambda0Serializer.read();
                    disposableSaveableStateRegistrylambda0Serializer.read(obj3, object);
                    unsafe.putObject(obj, jMediaSessionCompatQueueItem, obj3);
                } else {
                    unsafe.putObject(obj, jMediaSessionCompatQueueItem, object);
                }
                write(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jMediaSessionCompatQueueItem);
            if (!write(object2)) {
                Object obj4 = disposableSaveableStateRegistrylambda0Serializer.read();
                disposableSaveableStateRegistrylambda0Serializer.read(obj4, object2);
                unsafe.putObject(obj, jMediaSessionCompatQueueItem, obj4);
                object2 = obj4;
            }
            disposableSaveableStateRegistrylambda0Serializer.read(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int read(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        Unsafe unsafe = read;
        long j2 = this.write[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(ArrayDecoders.IconCompatParcelizer(i, bArr)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                return i;
            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(ArrayDecoders.write(i, bArr)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    int iIconCompatParcelizer = ArrayDecoders.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, Long.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
                    unsafe.putInt(obj, j2, i4);
                    return iIconCompatParcelizer;
                }
                return i;
            case 55:
            case RectListKt.BitOffsetForGesturable /* 62 */:
                if (i5 == 0) {
                    int iRemoteActionCompatParcelizer = ArrayDecoders.RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, Integer.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
                    unsafe.putInt(obj, j2, i4);
                    return iRemoteActionCompatParcelizer;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(ArrayDecoders.read(i, bArr)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(ArrayDecoders.serializer(i, bArr)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    int iIconCompatParcelizer2 = ArrayDecoders.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, Boolean.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iIconCompatParcelizer2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int iRemoteActionCompatParcelizer2 = ArrayDecoders.RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    int i9 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !IndirectPointerNavigationGestureDetector.write.read(bArr, iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer2 + i9)) {
                            throw InvalidProtocolBufferException.IconCompatParcelizer();
                        }
                        unsafe.putObject(obj, j, new String(bArr, iRemoteActionCompatParcelizer2, i9, CompositionLocalsKtLocalWindowInfo1.serializer));
                        iRemoteActionCompatParcelizer2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iRemoteActionCompatParcelizer2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    Object objWrite = write(i4, i8, obj);
                    int iIconCompatParcelizer3 = ArrayDecoders.IconCompatParcelizer(objWrite, serializer(i8), bArr, i, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    read(i4, i8, obj, objWrite);
                    return iIconCompatParcelizer3;
                }
                return i;
            case RectListKt.BitOffsetForFocusable /* 61 */:
                if (i5 == 2) {
                    int iSerializer = ArrayDecoders.serializer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, r8lambdacyuxafptvn7drfel1dgtevxcy.read);
                    unsafe.putInt(obj, j2, i4);
                    return iSerializer;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int iRemoteActionCompatParcelizer3 = ArrayDecoders.RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    int i10 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                    decodeByte decodebyteWrite = write(i8);
                    if (decodebyteWrite != null && !decodebyteWrite.write(i10)) {
                        RemoteActionCompatParcelizer(obj).serializer(i3, Long.valueOf(i10));
                        return iRemoteActionCompatParcelizer3;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    unsafe.putInt(obj, j2, i4);
                    return iRemoteActionCompatParcelizer3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    int iRemoteActionCompatParcelizer4 = ArrayDecoders.RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, Integer.valueOf(CodedInputStream.write(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer)));
                    unsafe.putInt(obj, j2, i4);
                    return iRemoteActionCompatParcelizer4;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    int iIconCompatParcelizer4 = ArrayDecoders.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, Long.valueOf(CodedInputStream.read(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer)));
                    unsafe.putInt(obj, j2, i4);
                    return iIconCompatParcelizer4;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    Object objWrite2 = write(i4, i8, obj);
                    int iRemoteActionCompatParcelizer5 = ArrayDecoders.RemoteActionCompatParcelizer(objWrite2, serializer(i8), bArr, i, i2, (i3 & (-8)) | 4, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    read(i4, i8, obj, objWrite2);
                    return iRemoteActionCompatParcelizer5;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081 A[SYNTHETIC] */
    @Override // o.DisposableSaveableStateRegistrylambda0
    public final void read(Object obj) {
        if (write(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.write;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i);
                long j = 1048575 & iMediaSessionCompatQueueItem;
                int iIconCompatParcelizer = IconCompatParcelizer(iMediaSessionCompatQueueItem);
                if (iIconCompatParcelizer != 9) {
                    if (iIconCompatParcelizer != 60 && iIconCompatParcelizer != 68) {
                        switch (iIconCompatParcelizer) {
                            case 17:
                                if (read(i, obj)) {
                                    serializer(i).read(read.getObject(obj, j));
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
                            case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                            case 49:
                                this.RatingCompat.RemoteActionCompatParcelizer(j, obj);
                                break;
                            case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                                Unsafe unsafe = read;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.ParcelableVolumeInfo.getClass();
                                    ((fromDpSizeitqla9I) object).RemoteActionCompatParcelizer = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (RemoteActionCompatParcelizer(iArr[i], i, obj)) {
                        serializer(i).read(read.getObject(obj, j));
                    }
                } else if (read(i, obj)) {
                    serializer(i).read(read.getObject(obj, j));
                }
            }
            ((GlobalSnapshotManagerensureStarted2) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = ((GeneratedMessageLite) obj).RemoteActionCompatParcelizer;
            if (graphicsLayerOwnerLayer.write) {
                graphicsLayerOwnerLayer.write = false;
            }
            if (this.MediaSessionCompatQueueItem) {
                this.MediaDescriptionCompat.getClass();
                ((GeneratedMessageLite.ExtendableMessage) obj).extensions.MediaSessionCompatQueueItem();
            }
        }
    }

    public static void serializer(Object obj) {
        if (write(obj)) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj, "Mutating immutable message: "));
    }

    public final void write(Object obj, int i, Object obj2, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress, CodedInputStreamReader codedInputStreamReader) throws InvalidProtocolBufferException.InvalidWireTypeException {
        long jMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i) & 1048575;
        Object objRatingCompat = setDirty.RatingCompat.RatingCompat(jMediaSessionCompatQueueItem, obj);
        getPxSizeYbymL2g getpxsizeybyml2g = this.ParcelableVolumeInfo;
        if (objRatingCompat == null) {
            getpxsizeybyml2g.getClass();
            objRatingCompat = fromDpSizeitqla9I.serializer.serializer();
            setDirty.write(jMediaSessionCompatQueueItem, obj, objRatingCompat);
        } else {
            getpxsizeybyml2g.getClass();
            if (!((fromDpSizeitqla9I) objRatingCompat).RemoteActionCompatParcelizer) {
                fromDpSizeitqla9I fromdpsizeitqla9iSerializer = fromDpSizeitqla9I.serializer.serializer();
                getPxSizeYbymL2g.serializer(fromdpsizeitqla9iSerializer, objRatingCompat);
                setDirty.write(jMediaSessionCompatQueueItem, obj, fromdpsizeitqla9iSerializer);
                objRatingCompat = fromdpsizeitqla9iSerializer;
            }
        }
        getpxsizeybyml2g.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9i = (fromDpSizeitqla9I) objRatingCompat;
        ImageLoader$Builder imageLoader$Builder = ((fromPxSizeviCIZxY) obj2).RemoteActionCompatParcelizer;
        codedInputStreamReader.IconCompatParcelizer(2);
        CodedInputStream codedInputStream = codedInputStreamReader.serializer;
        int i2 = codedInputStream.read(codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
        Object objWrite = imageLoader$Builder.IconCompatParcelizer;
        Object obj3 = imageLoader$Builder.serializer;
        Object objWrite2 = obj3;
        while (true) {
            try {
                int iSerializer = codedInputStreamReader.serializer();
                if (iSerializer == Integer.MAX_VALUE || codedInputStream.IconCompatParcelizer()) {
                    break;
                }
                if (iSerializer == 1) {
                    objWrite = codedInputStreamReader.write((onScroll) imageLoader$Builder.RemoteActionCompatParcelizer, null, null);
                } else if (iSerializer != 2) {
                    try {
                        if (!codedInputStreamReader.IconCompatParcelizer()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!codedInputStreamReader.IconCompatParcelizer()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objWrite2 = codedInputStreamReader.write((onScroll) imageLoader$Builder.read, obj3.getClass(), getlocalprovidablescrollcaptureinprogress);
                }
            } catch (Throwable th) {
                codedInputStream.serializer(i2);
                throw th;
            }
        }
        fromdpsizeitqla9i.put(objWrite, objWrite2);
        codedInputStream.serializer(i2);
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final boolean IconCompatParcelizer(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.serializer) {
            int i6 = this.MediaBrowserCompatMediaItem[i5];
            int[] iArr = this.write;
            int i7 = iArr[i6];
            int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = read.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & iMediaSessionCompatQueueItem) == 0 || serializer(obj, i6, i, i2, i10)) {
                int iIconCompatParcelizer = IconCompatParcelizer(iMediaSessionCompatQueueItem);
                if (iIconCompatParcelizer != 9 && iIconCompatParcelizer != 17) {
                    if (iIconCompatParcelizer != 27) {
                        if (iIconCompatParcelizer == 60 || iIconCompatParcelizer == 68) {
                            if (RemoteActionCompatParcelizer(i7, i6, obj)) {
                                if (!serializer(i6).IconCompatParcelizer(setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iIconCompatParcelizer != 49) {
                            if (iIconCompatParcelizer != 50) {
                                continue;
                            } else {
                                Object objRatingCompat = setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj);
                                this.ParcelableVolumeInfo.getClass();
                                fromDpSizeitqla9I fromdpsizeitqla9i = (fromDpSizeitqla9I) objRatingCompat;
                                if (!fromdpsizeitqla9i.isEmpty() && ((onScroll) ((fromPxSizeviCIZxY) RemoteActionCompatParcelizer(i6)).RemoteActionCompatParcelizer.read).getJavaType() == onDown.MESSAGE) {
                                    DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0 = null;
                                    for (Object obj2 : fromdpsizeitqla9i.values()) {
                                        if (disposableSaveableStateRegistrylambda0 == null) {
                                            disposableSaveableStateRegistrylambda0 = component26.IconCompatParcelizer.read(obj2.getClass());
                                        }
                                        if (!disposableSaveableStateRegistrylambda0.IconCompatParcelizer(obj2)) {
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0Serializer = serializer(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (disposableSaveableStateRegistrylambda0Serializer.IconCompatParcelizer(list.get(i11))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (serializer(obj, i6, i, i2, i10)) {
                        if (!serializer(i6).IconCompatParcelizer(setDirty.RatingCompat.RatingCompat(iMediaSessionCompatQueueItem & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        if (this.MediaSessionCompatQueueItem) {
            this.MediaDescriptionCompat.getClass();
            if (!((GeneratedMessageLite.ExtendableMessage) obj).extensions.read()) {
                return false;
            }
        }
        return true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int RemoteActionCompatParcelizer(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r34) {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.RemoteActionCompatParcelizer(java.lang.Object, byte[], int, int, int, o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY):int");
    }

    public final void read(Object obj, int i, CodedInputStreamReader codedInputStreamReader) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i) != 0) {
            codedInputStreamReader.IconCompatParcelizer(2);
            setDirty.write(i & 1048575, obj, codedInputStreamReader.serializer.ResultReceiver());
        } else if (this.MediaMetadataCompat) {
            codedInputStreamReader.IconCompatParcelizer(2);
            setDirty.write(i & 1048575, obj, codedInputStreamReader.serializer.ComponentActivity());
        } else {
            setDirty.write(i & 1048575, obj, codedInputStreamReader.write());
        }
    }

    public final void IconCompatParcelizer(Object obj, int i, CodedInputStreamReader codedInputStreamReader) throws InvalidProtocolBufferException.InvalidWireTypeException {
        boolean z = (536870912 & i) != 0;
        decodeSpanStyle decodespanstyle = this.RatingCompat;
        if (z) {
            codedInputStreamReader.read(decodespanstyle.IconCompatParcelizer(i & 1048575, obj), true);
        } else {
            codedInputStreamReader.read(decodespanstyle.IconCompatParcelizer(i & 1048575, obj), false);
        }
    }

    public final boolean serializer(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return read(i, obj);
        }
        return (i3 & i4) != 0;
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final void read(Object obj, Object obj2) {
        serializer(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.write;
            if (i < iArr.length) {
                int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i);
                long j = 1048575 & iMediaSessionCompatQueueItem;
                int i2 = iArr[i];
                switch (IconCompatParcelizer(iMediaSessionCompatQueueItem)) {
                    case 0:
                        if (read(i, obj2)) {
                            GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
                            graphicsLayerOwnerLayerrecordLambda1.read(obj, j, graphicsLayerOwnerLayerrecordLambda1.RemoteActionCompatParcelizer(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 1:
                        if (read(i, obj2)) {
                            GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda2 = setDirty.RatingCompat;
                            graphicsLayerOwnerLayerrecordLambda2.IconCompatParcelizer(obj, j, graphicsLayerOwnerLayerrecordLambda2.read(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 2:
                        if (read(i, obj2)) {
                            setDirty.write(obj, j, setDirty.RatingCompat.MediaDescriptionCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 3:
                        if (read(i, obj2)) {
                            setDirty.write(obj, j, setDirty.RatingCompat.MediaDescriptionCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 4:
                        if (read(i, obj2)) {
                            setDirty.IconCompatParcelizer(j, setDirty.RatingCompat.IconCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 5:
                        if (read(i, obj2)) {
                            setDirty.write(obj, j, setDirty.RatingCompat.MediaDescriptionCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 6:
                        if (read(i, obj2)) {
                            setDirty.IconCompatParcelizer(j, setDirty.RatingCompat.IconCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 7:
                        if (read(i, obj2)) {
                            GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda3 = setDirty.RatingCompat;
                            graphicsLayerOwnerLayerrecordLambda3.read(obj, j, graphicsLayerOwnerLayerrecordLambda3.write(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 8:
                        if (read(i, obj2)) {
                            setDirty.write(j, obj, setDirty.RatingCompat.RatingCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 9:
                        read(obj, i, obj2);
                        break;
                    case 10:
                        if (read(i, obj2)) {
                            setDirty.write(j, obj, setDirty.RatingCompat.RatingCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 11:
                        if (read(i, obj2)) {
                            setDirty.IconCompatParcelizer(j, setDirty.RatingCompat.IconCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 12:
                        if (read(i, obj2)) {
                            setDirty.IconCompatParcelizer(j, setDirty.RatingCompat.IconCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 13:
                        if (read(i, obj2)) {
                            setDirty.IconCompatParcelizer(j, setDirty.RatingCompat.IconCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 14:
                        if (read(i, obj2)) {
                            setDirty.write(obj, j, setDirty.RatingCompat.MediaDescriptionCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 15:
                        if (read(i, obj2)) {
                            setDirty.IconCompatParcelizer(j, setDirty.RatingCompat.IconCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 16:
                        if (read(i, obj2)) {
                            setDirty.write(obj, j, setDirty.RatingCompat.MediaDescriptionCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 17:
                        read(obj, i, obj2);
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
                    case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                    case 49:
                        this.RatingCompat.RemoteActionCompatParcelizer(j, obj, obj2);
                        break;
                    case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        Class cls = registerProvider.read;
                        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda4 = setDirty.RatingCompat;
                        Object objRatingCompat = graphicsLayerOwnerLayerrecordLambda4.RatingCompat(j, obj);
                        Object objRatingCompat2 = graphicsLayerOwnerLayerrecordLambda4.RatingCompat(j, obj2);
                        this.ParcelableVolumeInfo.getClass();
                        setDirty.write(j, obj, getPxSizeYbymL2g.serializer(objRatingCompat, objRatingCompat2));
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
                        if (RemoteActionCompatParcelizer(i2, i, obj2)) {
                            setDirty.write(j, obj, setDirty.RatingCompat.RatingCompat(j, obj2));
                            serializer(i2, i, obj);
                        }
                        break;
                    case 60:
                        serializer(obj, i, obj2);
                        break;
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (RemoteActionCompatParcelizer(i2, i, obj2)) {
                            setDirty.write(j, obj, setDirty.RatingCompat.RatingCompat(j, obj2));
                            serializer(i2, i, obj);
                        }
                        break;
                    case 68:
                        serializer(obj, i, obj2);
                        break;
                }
                i += 3;
            } else {
                registerProvider.write(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, obj, obj2);
                if (this.MediaSessionCompatQueueItem) {
                    this.MediaDescriptionCompat.getClass();
                    CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
                    if (compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable().IconCompatParcelizer(compositionLocalsKtLocalClipboard1);
                    return;
                }
                return;
            }
        }
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final void read(Object obj, byte[] bArr, int i, int i2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        RemoteActionCompatParcelizer(obj, bArr, i, i2, 0, r8lambdacyuxafptvn7drfel1dgtevxcy);
    }
}
