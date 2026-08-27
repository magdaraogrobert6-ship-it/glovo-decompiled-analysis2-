package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import kotlin.TuplesKt;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeKt implements getCoordinatesAccessedDuringPlacement {
    public static final int[] IconCompatParcelizer = new int[0];
    public static final Unsafe write = getLastLookaheadConstraintsDWUhwKw.IconCompatParcelizer();
    public final LayoutNodeUsageByParent MediaBrowserCompatMediaItem;
    public final drawDirecteZhPAX0ui MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final accessgetDefaultDensityp MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final int ParcelableVolumeInfo;
    public final Object[] PlaybackStateCompat;
    public final boolean PlaybackStateCompatCustomAction;
    public final int[] RatingCompat;
    public final setInteropViewFactoryHolderui RemoteActionCompatParcelizer;
    public final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int read;
    public final int[] serializer;

    public static int IconCompatParcelizer(int i) {
        return (i & 267386880) >>> 20;
    }

    public static long write(int i) {
        return i & 1048575;
    }

    public static long read(long j, Object obj) {
        return ((Long) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj)).longValue();
    }

    public static List read(GeneratedMessageLite generatedMessageLite, long j) {
        return (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite);
    }

    public static int serializer(long j, Object obj) {
        return ((Integer) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj)).intValue();
    }

    public static getCoordinatesAccessedDuringModifierPlacement serializer(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacement = generatedMessageLite.IconCompatParcelizer;
        if (getcoordinatesaccessedduringmodifierplacement != getCoordinatesAccessedDuringModifierPlacement.write) {
            return getcoordinatesaccessedduringmodifierplacement;
        }
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacementWrite = getCoordinatesAccessedDuringModifierPlacement.write();
        generatedMessageLite.IconCompatParcelizer = getcoordinatesaccessedduringmodifierplacementWrite;
        return getcoordinatesaccessedduringmodifierplacementWrite;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0271  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028a  */
    /* JADX WARN: Code duplicated, block: B:132:0x028d  */
    public static LayoutNodeKt write(getDetachedFromParentLookaheadPlacementui getdetachedfromparentlookaheadplacementui, accessgetDefaultDensityp accessgetdefaultdensityp, LayoutNodeUsageByParent layoutNodeUsageByParent, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema unknownFieldSchema, LayoutNodeExternalSyntheticLambda1 layoutNodeExternalSyntheticLambda1, drawDirecteZhPAX0ui drawdirectezhpax0ui) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        Field fieldIconCompatParcelizer;
        int i19;
        char cCharAt9;
        int i20;
        int i21;
        int i22;
        Object obj;
        Field fieldIconCompatParcelizer2;
        int i23;
        Object obj2;
        Field fieldIconCompatParcelizer3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        getDetachedFromParentLookaheadPlacementui getdetachedfromparentlookaheadplacementui2 = getdetachedfromparentlookaheadplacementui;
        int i28 = 0;
        boolean z = ((getdetachedfromparentlookaheadplacementui2.write & 1) == 1 ? getChildrenAccessingCoordinatesDuringPlacement.PROTO2 : getChildrenAccessingCoordinatesDuringPlacement.PROTO3) == getChildrenAccessingCoordinatesDuringPlacement.PROTO3;
        String str = getdetachedfromparentlookaheadplacementui2.IconCompatParcelizer;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (str.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt5 = str.charAt(i);
        if (iCharAt5 >= 55296) {
            int i31 = iCharAt5 & 8191;
            int i32 = 13;
            while (true) {
                i27 = i30 + 1;
                cCharAt13 = str.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i27;
            }
            iCharAt5 = i31 | (cCharAt13 << i32);
            i30 = i27;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i2 = 0;
            iCharAt4 = 0;
            iArr = IconCompatParcelizer;
            i3 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt6 = str.charAt(i30);
            if (iCharAt6 >= 55296) {
                int i34 = iCharAt6 & 8191;
                int i35 = 13;
                while (true) {
                    i11 = i33 + 1;
                    cCharAt8 = str.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i11;
                }
                iCharAt6 = i34 | (cCharAt8 << i35);
                i33 = i11;
            }
            int i36 = i33 + 1;
            int iCharAt7 = str.charAt(i33);
            if (iCharAt7 >= 55296) {
                int i37 = iCharAt7 & 8191;
                int i38 = 13;
                while (true) {
                    i10 = i36 + 1;
                    cCharAt7 = str.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i10;
                }
                iCharAt7 = i37 | (cCharAt7 << i38);
                i36 = i10;
            }
            int i39 = i36 + 1;
            iCharAt = str.charAt(i36);
            if (iCharAt >= 55296) {
                int i40 = iCharAt & 8191;
                int i41 = 13;
                while (true) {
                    i9 = i39 + 1;
                    cCharAt6 = str.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i9;
                }
                iCharAt = i40 | (cCharAt6 << i41);
                i39 = i9;
            }
            int i42 = i39 + 1;
            iCharAt2 = str.charAt(i39);
            if (iCharAt2 >= 55296) {
                int i43 = iCharAt2 & 8191;
                int i44 = 13;
                while (true) {
                    i8 = i42 + 1;
                    cCharAt5 = str.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i8;
                }
                iCharAt2 = i43 | (cCharAt5 << i44);
                i42 = i8;
            }
            int i45 = i42 + 1;
            iCharAt3 = str.charAt(i42);
            if (iCharAt3 >= 55296) {
                int i46 = iCharAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i7 = i45 + 1;
                    cCharAt4 = str.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i7;
                }
                iCharAt3 = i46 | (cCharAt4 << i47);
                i45 = i7;
            }
            int i48 = i45 + 1;
            int iCharAt8 = str.charAt(i45);
            if (iCharAt8 >= 55296) {
                int i49 = iCharAt8 & 8191;
                int i50 = 13;
                while (true) {
                    i6 = i48 + 1;
                    cCharAt3 = str.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i6;
                }
                iCharAt8 = i49 | (cCharAt3 << i50);
                i48 = i6;
            }
            int i51 = i48 + 1;
            int iCharAt9 = str.charAt(i48);
            if (iCharAt9 >= 55296) {
                int i52 = iCharAt9 & 8191;
                int i53 = 13;
                while (true) {
                    i5 = i51 + 1;
                    cCharAt2 = str.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i5;
                }
                iCharAt9 = i52 | (cCharAt2 << i53);
                i51 = i5;
            }
            int i54 = i51 + 1;
            iCharAt4 = str.charAt(i51);
            if (iCharAt4 >= 55296) {
                int i55 = iCharAt4 & 8191;
                int i56 = i54;
                int i57 = 13;
                while (true) {
                    i4 = i56 + 1;
                    cCharAt = str.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i56 = i4;
                }
                iCharAt4 = i55 | (cCharAt << i57);
                i54 = i4;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i2 = (iCharAt6 * 2) + iCharAt7;
            i3 = iCharAt8;
            iArr = iArr2;
            i28 = iCharAt6;
            i30 = i54;
        }
        Unsafe unsafe = write;
        Object[] objArr = getdetachedfromparentlookaheadplacementui2.serializer;
        Class<?> cls = getdetachedfromparentlookaheadplacementui2.RemoteActionCompatParcelizer.getClass();
        int i58 = i30;
        int[] iArr3 = new int[iCharAt3 * 3];
        int i59 = i2;
        Object[] objArr2 = new Object[iCharAt3 * 2];
        int i60 = i3 + iCharAt4;
        int i61 = iCharAt4;
        int i62 = i58;
        int i63 = i60;
        int i64 = 0;
        int i65 = 0;
        while (i62 < length) {
            int i66 = i62 + 1;
            int iCharAt10 = str.charAt(i62);
            int i67 = length;
            if (iCharAt10 >= 55296) {
                int i68 = iCharAt10 & 8191;
                int i69 = i66;
                int i70 = 13;
                while (true) {
                    i26 = i69 + 1;
                    cCharAt12 = str.charAt(i69);
                    i12 = iCharAt4;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i26;
                    iCharAt4 = i12;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i13 = i26;
            } else {
                i12 = iCharAt4;
                i13 = i66;
            }
            int i71 = i13 + 1;
            int iCharAt11 = str.charAt(i13);
            if (iCharAt11 >= 55296) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i25 = i73 + 1;
                    cCharAt11 = str.charAt(i73);
                    i14 = iCharAt2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i25;
                    iCharAt2 = i14;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i15 = i25;
            } else {
                i14 = iCharAt2;
                i15 = i71;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt;
            if ((iCharAt11 & androidx.compose.ui.graphics.Fields.RotationZ) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            if (i75 >= 51) {
                int i77 = i15 + 1;
                int iCharAt12 = str.charAt(i15);
                char c = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = 13;
                    while (true) {
                        i24 = i77 + 1;
                        cCharAt10 = str.charAt(i77);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i79;
                        i79 += 13;
                        i77 = i24;
                        c = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i79);
                    i77 = i24;
                }
                int i80 = i75 - 51;
                int i81 = i77;
                if (i80 == 9 || i80 == 17) {
                    i21 = 2;
                    objArr2[ff$$ExternalSyntheticOutline0.m(i64, 3, 2, 1)] = objArr[i59];
                } else {
                    if (i80 != 12 || z) {
                        iArr3 = iArr3;
                        i21 = 2;
                    } else {
                        i21 = 2;
                        objArr2[ff$$ExternalSyntheticOutline0.m(i64, 3, 2, 1)] = objArr[i59];
                    }
                    i22 = iCharAt12 * i21;
                    obj = objArr[i22];
                    if (obj instanceof Field) {
                        fieldIconCompatParcelizer2 = (Field) obj;
                    } else {
                        fieldIconCompatParcelizer2 = IconCompatParcelizer(cls, (String) obj);
                        objArr[i22] = fieldIconCompatParcelizer2;
                    }
                    i16 = i28;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldIconCompatParcelizer2);
                    i23 = i22 + 1;
                    obj2 = objArr[i23];
                    if (obj2 instanceof Field) {
                        fieldIconCompatParcelizer3 = (Field) obj2;
                    } else {
                        fieldIconCompatParcelizer3 = IconCompatParcelizer(cls, (String) obj2);
                        objArr[i23] = fieldIconCompatParcelizer3;
                    }
                    str = str;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldIconCompatParcelizer3);
                    iCharAt10 = iCharAt10;
                    z = z;
                    i17 = i59;
                    i62 = i81;
                    i18 = 0;
                    iObjectFieldOffset = iObjectFieldOffset3;
                }
                i59++;
                i22 = iCharAt12 * i21;
                obj = objArr[i22];
                if (obj instanceof Field) {
                    fieldIconCompatParcelizer2 = (Field) obj;
                } else {
                    fieldIconCompatParcelizer2 = IconCompatParcelizer(cls, (String) obj);
                    objArr[i22] = fieldIconCompatParcelizer2;
                }
                i16 = i28;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldIconCompatParcelizer2);
                i23 = i22 + 1;
                obj2 = objArr[i23];
                if (obj2 instanceof Field) {
                    fieldIconCompatParcelizer3 = (Field) obj2;
                } else {
                    fieldIconCompatParcelizer3 = IconCompatParcelizer(cls, (String) obj2);
                    objArr[i23] = fieldIconCompatParcelizer3;
                }
                str = str;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldIconCompatParcelizer3);
                iCharAt10 = iCharAt10;
                z = z;
                i17 = i59;
                i62 = i81;
                i18 = 0;
                iObjectFieldOffset = iObjectFieldOffset4;
            } else {
                i16 = i28;
                iArr3 = iArr3;
                i17 = i59 + 1;
                Field fieldIconCompatParcelizer4 = IconCompatParcelizer(cls, (String) objArr[i59]);
                if (i75 == 9 || i75 == 17) {
                    iCharAt10 = iCharAt10;
                    z = z;
                    objArr2[ff$$ExternalSyntheticOutline0.m(i64, 3, 2, 1)] = fieldIconCompatParcelizer4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i20 = i59 + 2;
                        objArr2[ff$$ExternalSyntheticOutline0.m(i64, 3, 2, 1)] = objArr[i17];
                    } else {
                        if (i75 == 12 || i75 == 30 || i75 == 44) {
                            if (!z) {
                                i20 = i59 + 2;
                                objArr2[ff$$ExternalSyntheticOutline0.m(i64, 3, 2, 1)] = objArr[i17];
                            }
                        } else if (i75 == 50) {
                            int i82 = i61 + 1;
                            iArr[i61] = i64;
                            int i83 = (i64 / 3) * 2;
                            int i84 = i59 + 2;
                            objArr2[i83] = objArr[i17];
                            if ((iCharAt11 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0) {
                                objArr2[i83 + 1] = objArr[i84];
                                i17 = i59 + 3;
                            } else {
                                i17 = i84;
                            }
                            i61 = i82;
                            iCharAt10 = iCharAt10;
                            z = z;
                        }
                        iCharAt10 = iCharAt10;
                        z = z;
                    }
                    i17 = i20;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldIconCompatParcelizer4);
                if ((iCharAt11 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 4096 || i75 > 17) {
                    iObjectFieldOffset2 = 1048575;
                    i18 = 0;
                } else {
                    int i85 = i15 + 1;
                    int iCharAt13 = str.charAt(i15);
                    if (iCharAt13 >= 55296) {
                        int i86 = iCharAt13 & 8191;
                        int i87 = 13;
                        while (true) {
                            i19 = i85 + 1;
                            cCharAt9 = str.charAt(i85);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i86 |= (cCharAt9 & 8191) << i87;
                            i87 += 13;
                            i85 = i19;
                        }
                        iCharAt13 = i86 | (cCharAt9 << i87);
                        i85 = i19;
                    }
                    int i88 = (iCharAt13 / 32) + (i16 * 2);
                    Object obj3 = objArr[i88];
                    if (obj3 instanceof Field) {
                        fieldIconCompatParcelizer = (Field) obj3;
                    } else {
                        fieldIconCompatParcelizer = IconCompatParcelizer(cls, (String) obj3);
                        objArr[i88] = fieldIconCompatParcelizer;
                    }
                    i18 = iCharAt13 % 32;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldIconCompatParcelizer);
                    i15 = i85;
                }
                if (i75 >= 18 && i75 <= 49) {
                    iArr[i63] = iObjectFieldOffset;
                    i63++;
                }
                i62 = i15;
            }
            iArr3[i64] = iCharAt10;
            iArr3[i64 + 1] = ((iCharAt11 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? 268435456 : 0) | ((iCharAt11 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? 536870912 : 0) | (i75 << 20) | iObjectFieldOffset;
            iArr3[i64 + 2] = iObjectFieldOffset2 | (i18 << 20);
            i64 += 3;
            getdetachedfromparentlookaheadplacementui2 = getdetachedfromparentlookaheadplacementui;
            i28 = i16;
            z = z;
            str = str;
            iCharAt = i76;
            length = i67;
            iCharAt4 = i12;
            iCharAt2 = i14;
            i59 = i17;
            iArr3 = iArr3;
        }
        return new LayoutNodeKt(iArr3, objArr2, iCharAt, iCharAt2, getdetachedfromparentlookaheadplacementui2.RemoteActionCompatParcelizer, z, iArr, iCharAt4, i60, accessgetdefaultdensityp, layoutNodeUsageByParent, unknownFieldSchema, layoutNodeExternalSyntheticLambda1, drawdirectezhpax0ui);
    }

    public final void IconCompatParcelizer(Object obj, int i, Object obj2) {
        int[] iArr = this.serializer;
        int i2 = iArr[i];
        if (read(i2, i, obj2)) {
            long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i) & 1048575;
            Unsafe unsafe = write;
            Object object = unsafe.getObject(obj2, jMediaBrowserCompatMediaItem);
            if (object == null) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(iArr[i], obj2);
                return;
            }
            getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            if (!read(i2, i, obj)) {
                if (RemoteActionCompatParcelizer(object)) {
                    Object objSerializer = getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer();
                    getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer(objSerializer, object);
                    unsafe.putObject(obj, jMediaBrowserCompatMediaItem, objSerializer);
                } else {
                    unsafe.putObject(obj, jMediaBrowserCompatMediaItem, object);
                }
                write(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jMediaBrowserCompatMediaItem);
            if (!RemoteActionCompatParcelizer(object2)) {
                Object objSerializer2 = getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer();
                getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer(objSerializer2, object2);
                unsafe.putObject(obj, jMediaBrowserCompatMediaItem, objSerializer2);
                object2 = objSerializer2;
            }
            getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    public final boolean IconCompatParcelizer(int i, Object obj) {
        int i2 = this.serializer[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if ((getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, obj) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
        long j2 = iMediaBrowserCompatMediaItem & 1048575;
        switch (IconCompatParcelizer(iMediaBrowserCompatMediaItem)) {
            case 0:
                if (Double.doubleToRawLongBits(getLastLookaheadConstraintsDWUhwKw.read.serializer(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(getLastLookaheadConstraintsDWUhwKw.read.write(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return getLastLookaheadConstraintsDWUhwKw.read.read(j2, obj);
            case 8:
                Object objMediaSessionCompatQueueItem = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j2, obj);
                if (objMediaSessionCompatQueueItem instanceof String) {
                    return !((String) objMediaSessionCompatQueueItem).isEmpty();
                }
                if (objMediaSessionCompatQueueItem instanceof setOnAttachui) {
                    return !setOnAttachui.IconCompatParcelizer.equals(objMediaSessionCompatQueueItem);
                }
                DrawableTransformation.write();
                return false;
            case 9:
                if (getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !setOnAttachui.IconCompatParcelizer.equals(getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j2, obj));
            case 11:
                if (getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                DrawableTransformation.write();
                return false;
        }
    }

    @Override // o.getCoordinatesAccessedDuringPlacement
    public final boolean IconCompatParcelizer(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        boolean zIconCompatParcelizer;
        int[] iArr = this.serializer;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
            long j = iMediaBrowserCompatMediaItem & 1048575;
            switch (IconCompatParcelizer(iMediaBrowserCompatMediaItem)) {
                case 0:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement = getLastLookaheadConstraintsDWUhwKw.read;
                        if (Double.doubleToLongBits(getlookaheadcoordinatesaccessedduringmodifierplacement.serializer(j, generatedMessageLite)) == Double.doubleToLongBits(getlookaheadcoordinatesaccessedduringmodifierplacement.serializer(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                case 1:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement2 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (Float.floatToIntBits(getlookaheadcoordinatesaccessedduringmodifierplacement2.write(j, generatedMessageLite)) == Float.floatToIntBits(getlookaheadcoordinatesaccessedduringmodifierplacement2.write(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                case 2:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement3 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement3.MediaMetadataCompat(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement3.MediaMetadataCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 3:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement4 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement4.MediaMetadataCompat(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement4.MediaMetadataCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 4:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement5 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement5.RemoteActionCompatParcelizer(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement5.RemoteActionCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 5:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement6 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement6.MediaMetadataCompat(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement6.MediaMetadataCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 6:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement7 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement7.RemoteActionCompatParcelizer(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement7.RemoteActionCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 7:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement8 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement8.read(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement8.read(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 8:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement9 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(getlookaheadcoordinatesaccessedduringmodifierplacement9.MediaSessionCompatQueueItem(j, generatedMessageLite), getlookaheadcoordinatesaccessedduringmodifierplacement9.MediaSessionCompatQueueItem(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                case 9:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement10 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(getlookaheadcoordinatesaccessedduringmodifierplacement10.MediaSessionCompatQueueItem(j, generatedMessageLite), getlookaheadcoordinatesaccessedduringmodifierplacement10.MediaSessionCompatQueueItem(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                case 10:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement11 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(getlookaheadcoordinatesaccessedduringmodifierplacement11.MediaSessionCompatQueueItem(j, generatedMessageLite), getlookaheadcoordinatesaccessedduringmodifierplacement11.MediaSessionCompatQueueItem(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                case 11:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement12 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement12.RemoteActionCompatParcelizer(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement12.RemoteActionCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 12:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement13 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement13.RemoteActionCompatParcelizer(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement13.RemoteActionCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 13:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement14 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement14.RemoteActionCompatParcelizer(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement14.RemoteActionCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 14:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement15 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement15.MediaMetadataCompat(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement15.MediaMetadataCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 15:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement16 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement16.RemoteActionCompatParcelizer(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement16.RemoteActionCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 16:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement17 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getlookaheadcoordinatesaccessedduringmodifierplacement17.MediaMetadataCompat(j, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement17.MediaMetadataCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                case 17:
                    if (IconCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement18 = getLastLookaheadConstraintsDWUhwKw.read;
                        if (getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(getlookaheadcoordinatesaccessedduringmodifierplacement18.MediaSessionCompatQueueItem(j, generatedMessageLite), getlookaheadcoordinatesaccessedduringmodifierplacement18.MediaSessionCompatQueueItem(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
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
                    getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement19 = getLastLookaheadConstraintsDWUhwKw.read;
                    zIconCompatParcelizer = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(getlookaheadcoordinatesaccessedduringmodifierplacement19.MediaSessionCompatQueueItem(j, generatedMessageLite), getlookaheadcoordinatesaccessedduringmodifierplacement19.MediaSessionCompatQueueItem(j, generatedMessageLite2));
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement20 = getLastLookaheadConstraintsDWUhwKw.read;
                    zIconCompatParcelizer = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(getlookaheadcoordinatesaccessedduringmodifierplacement20.MediaSessionCompatQueueItem(j, generatedMessageLite), getlookaheadcoordinatesaccessedduringmodifierplacement20.MediaSessionCompatQueueItem(j, generatedMessageLite2));
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
                    getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement21 = getLastLookaheadConstraintsDWUhwKw.read;
                    if (getlookaheadcoordinatesaccessedduringmodifierplacement21.RemoteActionCompatParcelizer(j2, generatedMessageLite) == getlookaheadcoordinatesaccessedduringmodifierplacement21.RemoteActionCompatParcelizer(j2, generatedMessageLite2) && getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(getlookaheadcoordinatesaccessedduringmodifierplacement21.MediaSessionCompatQueueItem(j, generatedMessageLite), getlookaheadcoordinatesaccessedduringmodifierplacement21.MediaSessionCompatQueueItem(j, generatedMessageLite2))) {
                        continue;
                        break;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            if (zIconCompatParcelizer) {
            }
        }
        getHeightui getheightui = (getHeightui) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getheightui.getClass();
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacement = generatedMessageLite.IconCompatParcelizer;
        getheightui.getClass();
        return getcoordinatesaccessedduringmodifierplacement.equals(generatedMessageLite2.IconCompatParcelizer);
    }

    public final int MediaBrowserCompatMediaItem(int i) {
        return this.serializer[i + 1];
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0219 A[PHI: r3
  0x0219: PHI (r3v30 int) = (r3v10 int), (r3v33 int) binds: [B:82:0x0217, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.getCoordinatesAccessedDuringPlacement
    public final int RemoteActionCompatParcelizer(GeneratedMessageLite generatedMessageLite) {
        int i;
        int iRemoteActionCompatParcelizer;
        int i2;
        int iHashCode;
        int[] iArr = this.serializer;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iMediaBrowserCompatMediaItem;
            int i6 = 1237;
            switch (IconCompatParcelizer(iMediaBrowserCompatMediaItem)) {
                case 0:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(Double.doubleToLongBits(getLastLookaheadConstraintsDWUhwKw.read.serializer(j, generatedMessageLite)));
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = Float.floatToIntBits(getLastLookaheadConstraintsDWUhwKw.read.write(j, generatedMessageLite));
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, generatedMessageLite));
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, generatedMessageLite));
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, generatedMessageLite);
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, generatedMessageLite));
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, generatedMessageLite);
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean z = getLastLookaheadConstraintsDWUhwKw.read.read(j, generatedMessageLite);
                    Charset charset = getMinimumTouchTargetSizeMYxV2XQ.write;
                    if (z) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = ((String) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite)).hashCode();
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 9:
                    Object objMediaSessionCompatQueueItem = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite);
                    if (objMediaSessionCompatQueueItem != null) {
                        iHashCode = objMediaSessionCompatQueueItem.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite).hashCode();
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, generatedMessageLite);
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, generatedMessageLite);
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, generatedMessageLite);
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, generatedMessageLite));
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, generatedMessageLite);
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, generatedMessageLite));
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 17:
                    Object objMediaSessionCompatQueueItem2 = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite);
                    if (objMediaSessionCompatQueueItem2 != null) {
                        iHashCode = objMediaSessionCompatQueueItem2.hashCode();
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
                case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                case 49:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite).hashCode();
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    i = i3 * 53;
                    iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite).hashCode();
                    i3 = iRemoteActionCompatParcelizer + i;
                    break;
                case 51:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(Double.doubleToLongBits(((Double) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite)).doubleValue()));
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = Float.floatToIntBits(((Float) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite)).floatValue());
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 53:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(read(j, generatedMessageLite));
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 54:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(read(j, generatedMessageLite));
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 55:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 56:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(read(j, generatedMessageLite));
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 57:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 58:
                    if (read(i5, i4, generatedMessageLite)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite)).booleanValue();
                        Charset charset2 = getMinimumTouchTargetSizeMYxV2XQ.write;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = ((String) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite)).hashCode();
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 60:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite).hashCode();
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite).hashCode();
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 63:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 64:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 65:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(read(j, generatedMessageLite));
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 66:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = serializer(j, generatedMessageLite);
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 67:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(read(j, generatedMessageLite));
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
                case 68:
                    if (read(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        iRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite).hashCode();
                        i3 = iRemoteActionCompatParcelizer + i;
                    }
                    break;
            }
        }
        ((getHeightui) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        return generatedMessageLite.IconCompatParcelizer.hashCode() + (i3 * 53);
    }

    public final void RemoteActionCompatParcelizer(Object obj, int i, Object obj2) {
        int i2 = this.serializer[i];
        Object objMediaSessionCompatQueueItem = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(MediaBrowserCompatMediaItem(i) & 1048575, obj);
        if (objMediaSessionCompatQueueItem == null || serializer(i) == null) {
            return;
        }
        this.MediaDescriptionCompat.getClass();
        m1$$ExternalSyntheticOutline0.m(read(i));
        throw null;
    }

    public final void read(Object obj, int i, Object obj2) {
        write.putObject(obj, MediaBrowserCompatMediaItem(i) & 1048575, obj2);
        write(i, obj);
    }

    public final void read(Object obj, long j, com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader codedInputStreamReader, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        List listRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(j, obj);
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = codedInputStreamReader.read;
        int i = codedInputStreamReader.serializer;
        if ((i & 7) != 3) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.serializer();
        }
        do {
            Object objSerializer = getcoordinatesaccessedduringplacement.serializer();
            codedInputStreamReader.write(objSerializer, getcoordinatesaccessedduringplacement, getnotplacedplaceorderuiannotations);
            getcoordinatesaccessedduringplacement.write(objSerializer);
            listRemoteActionCompatParcelizer.add(objSerializer);
            if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer() || codedInputStreamReader.IconCompatParcelizer != 0) {
                return;
            } else {
                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            }
        } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == i);
        codedInputStreamReader.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public final boolean read(int i, int i2, Object obj) {
        return getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer((long) (this.serializer[i2 + 2] & 1048575), obj) == i;
    }

    @Override // o.getCoordinatesAccessedDuringPlacement
    public final Object serializer() {
        this.MediaSessionCompatResultReceiverWrapper.getClass();
        return ((GeneratedMessageLite) this.RemoteActionCompatParcelizer).ResultReceiver();
    }

    public final void serializer(int i, int i2, Object obj, Object obj2) {
        write.putObject(obj, MediaBrowserCompatMediaItem(i2) & 1048575, obj2);
        write(i, i2, obj);
    }

    public final int write(int i, int i2) {
        int[] iArr = this.serializer;
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

    public final void write(int i, int i2, Object obj) {
        getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(this.serializer[i2 + 2] & 1048575, i, obj);
    }

    public final void write(int i, Object obj) {
        int i2 = this.serializer[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j, (1 << (i2 >>> 20)) | getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, obj), obj);
    }

    public final void write(long j, int i, Object obj) {
        Unsafe unsafe = write;
        Object obj2 = read(i);
        Object object = unsafe.getObject(obj, j);
        this.MediaDescriptionCompat.getClass();
        if (!((draweZhPAX0ui) object).write()) {
            draweZhPAX0ui drawezhpax0uiRemoteActionCompatParcelizer = draweZhPAX0ui.serializer().RemoteActionCompatParcelizer();
            drawDirecteZhPAX0ui.RemoteActionCompatParcelizer(drawezhpax0uiRemoteActionCompatParcelizer, object);
            unsafe.putObject(obj, j, drawezhpax0uiRemoteActionCompatParcelizer);
        }
        m1$$ExternalSyntheticOutline0.m(obj2);
        throw null;
    }

    public LayoutNodeKt(int[] iArr, Object[] objArr, int i, int i2, setInteropViewFactoryHolderui setinteropviewfactoryholderui, boolean z, int[] iArr2, int i3, int i4, accessgetDefaultDensityp accessgetdefaultdensityp, LayoutNodeUsageByParent layoutNodeUsageByParent, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema unknownFieldSchema, LayoutNodeExternalSyntheticLambda1 layoutNodeExternalSyntheticLambda1, drawDirecteZhPAX0ui drawdirectezhpax0ui) {
        this.serializer = iArr;
        this.PlaybackStateCompat = objArr;
        this.ParcelableVolumeInfo = i;
        this.MediaMetadataCompat = i2;
        this.MediaSessionCompatQueueItem = setinteropviewfactoryholderui instanceof GeneratedMessageLite;
        this.PlaybackStateCompatCustomAction = z;
        this.RatingCompat = iArr2;
        this.read = i3;
        this.MediaSessionCompatToken = i4;
        this.MediaSessionCompatResultReceiverWrapper = accessgetdefaultdensityp;
        this.MediaBrowserCompatMediaItem = layoutNodeUsageByParent;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = unknownFieldSchema;
        this.RemoteActionCompatParcelizer = setinteropviewfactoryholderui;
        this.MediaDescriptionCompat = drawdirectezhpax0ui;
    }

    @Override // o.getCoordinatesAccessedDuringPlacement
    public final void RemoteActionCompatParcelizer(Object obj, LayoutNode_foldedChildren1 layoutNode_foldedChildren1) throws CodedOutputStream$OutOfSpaceException {
        layoutNode_foldedChildren1.getClass();
        markChildrenDirty markchildrendirty = markChildrenDirty.ASCENDING;
        markChildrenDirty markchildrendirty2 = markChildrenDirty.DESCENDING;
        drawDirecteZhPAX0ui drawdirectezhpax0ui = this.MediaDescriptionCompat;
        int[] iArr = this.serializer;
        com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema unknownFieldSchema = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (markchildrendirty != markchildrendirty2) {
            if (!this.PlaybackStateCompatCustomAction) {
                serializer(obj, layoutNode_foldedChildren1);
                return;
            }
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
                int i2 = iArr[i];
                switch (IconCompatParcelizer(iMediaBrowserCompatMediaItem)) {
                    case 0:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.write(getLastLookaheadConstraintsDWUhwKw.read.serializer(iMediaBrowserCompatMediaItem & 1048575, obj), i2);
                        }
                        break;
                    case 1:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.serializer(getLastLookaheadConstraintsDWUhwKw.read.write(iMediaBrowserCompatMediaItem & 1048575, obj), i2);
                        }
                        break;
                    case 2:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.serializer(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 3:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.write(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 4:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i2, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 5:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 6:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.serializer(i2, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 7:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.write(i2, getLastLookaheadConstraintsDWUhwKw.read.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 8:
                        if (IconCompatParcelizer(i, obj)) {
                            write(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1);
                        }
                        break;
                    case 9:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), RemoteActionCompatParcelizer(i));
                        }
                        break;
                    case 10:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i2, (setOnAttachui) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 11:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.MediaMetadataCompat(i2, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 12:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.write(i2, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 13:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i2, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 14:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.read(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 15:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.read(i2, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 16:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 17:
                        if (IconCompatParcelizer(i, obj)) {
                            layoutNode_foldedChildren1.read(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), RemoteActionCompatParcelizer(i));
                        }
                        break;
                    case 18:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 19:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaDescriptionCompat(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 20:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatQueueItem(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 21:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompatCustomAction(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 22:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.RatingCompat(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 23:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 24:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.read(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 25:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 26:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1);
                        break;
                    case 27:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, RemoteActionCompatParcelizer(i));
                        break;
                    case 28:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1);
                        break;
                    case 29:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatToken(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 30:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 31:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaMetadataCompat(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 32:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaBrowserCompatMediaItem(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 33:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompat(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.ParcelableVolumeInfo(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 35:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaDescriptionCompat(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 37:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatQueueItem(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 38:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompatCustomAction(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.RatingCompat(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 40:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.read(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 43:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatToken(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 44:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaMetadataCompat(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 46:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaBrowserCompatMediaItem(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 47:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompat(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.ParcelableVolumeInfo(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 49:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[i], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1, RemoteActionCompatParcelizer(i));
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        if (getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj) != null) {
                            Object obj2 = read(i);
                            drawdirectezhpax0ui.getClass();
                            m1$$ExternalSyntheticOutline0.m(obj2);
                            throw null;
                        }
                        break;
                        break;
                    case 51:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.write(((Double) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj)).doubleValue(), i2);
                        }
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.serializer(((Float) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj)).floatValue(), i2);
                        }
                        break;
                    case 53:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.serializer(i2, read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 54:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.write(i2, read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 55:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i2, serializer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 56:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i2, read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 57:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.serializer(i2, serializer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 58:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.write(i2, ((Boolean) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj)).booleanValue());
                        }
                        break;
                    case 59:
                        if (read(i2, i, obj)) {
                            write(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), layoutNode_foldedChildren1);
                        }
                        break;
                    case 60:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), RemoteActionCompatParcelizer(i));
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i2, (setOnAttachui) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.MediaMetadataCompat(i2, serializer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 63:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.write(i2, serializer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 64:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i2, serializer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 65:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.read(i2, read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 66:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.read(i2, serializer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 67:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i2, read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        }
                        break;
                    case 68:
                        if (read(i2, i, obj)) {
                            layoutNode_foldedChildren1.read(i2, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj), RemoteActionCompatParcelizer(i));
                        }
                        break;
                }
            }
            ((getHeightui) unknownFieldSchema).getClass();
            ((GeneratedMessageLite) obj).IconCompatParcelizer.write(layoutNode_foldedChildren1);
            return;
        }
        ((getHeightui) unknownFieldSchema).getClass();
        ((GeneratedMessageLite) obj).IconCompatParcelizer.write(layoutNode_foldedChildren1);
        int length2 = iArr.length;
        while (true) {
            length2 -= 3;
            if (length2 >= 0) {
                int iMediaBrowserCompatMediaItem2 = MediaBrowserCompatMediaItem(length2);
                int i3 = iArr[length2];
                switch (IconCompatParcelizer(iMediaBrowserCompatMediaItem2)) {
                    case 0:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.write(getLastLookaheadConstraintsDWUhwKw.read.serializer(iMediaBrowserCompatMediaItem2 & 1048575, obj), i3);
                        }
                        break;
                    case 1:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.serializer(getLastLookaheadConstraintsDWUhwKw.read.write(iMediaBrowserCompatMediaItem2 & 1048575, obj), i3);
                        }
                        break;
                    case 2:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.serializer(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 3:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.write(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 4:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i3, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 5:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 6:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.serializer(i3, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 7:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.write(i3, getLastLookaheadConstraintsDWUhwKw.read.read(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 8:
                        if (IconCompatParcelizer(length2, obj)) {
                            write(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1);
                        }
                        break;
                    case 9:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), RemoteActionCompatParcelizer(length2));
                        }
                        break;
                    case 10:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i3, (setOnAttachui) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 11:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.MediaMetadataCompat(i3, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 12:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.write(i3, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 13:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i3, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 14:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.read(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 15:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.read(i3, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 16:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 17:
                        if (IconCompatParcelizer(length2, obj)) {
                            layoutNode_foldedChildren1.read(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), RemoteActionCompatParcelizer(length2));
                        }
                        break;
                    case 18:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 19:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaDescriptionCompat(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 20:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatQueueItem(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 21:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompatCustomAction(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 22:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.RatingCompat(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 23:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 24:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.read(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 25:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 26:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1);
                        break;
                    case 27:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, RemoteActionCompatParcelizer(length2));
                        break;
                    case 28:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1);
                        break;
                    case 29:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatToken(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 30:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 31:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaMetadataCompat(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 32:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaBrowserCompatMediaItem(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 33:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompat(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.ParcelableVolumeInfo(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, false);
                        break;
                    case 35:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaDescriptionCompat(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 37:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatQueueItem(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 38:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompatCustomAction(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.RatingCompat(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 40:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.read(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 43:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatToken(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 44:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaMetadataCompat(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 46:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaBrowserCompatMediaItem(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 47:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompat(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.ParcelableVolumeInfo(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, true);
                        break;
                    case 49:
                        getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[length2], (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1, RemoteActionCompatParcelizer(length2));
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        if (getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj) != null) {
                            Object obj3 = read(length2);
                            drawdirectezhpax0ui.getClass();
                            m1$$ExternalSyntheticOutline0.m(obj3);
                            throw null;
                        }
                        break;
                        break;
                    case 51:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.write(((Double) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj)).doubleValue(), i3);
                        }
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.serializer(((Float) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj)).floatValue(), i3);
                        }
                        break;
                    case 53:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.serializer(i3, read(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 54:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.write(i3, read(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 55:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i3, serializer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 56:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i3, read(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 57:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.serializer(i3, serializer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 58:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.write(i3, ((Boolean) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj)).booleanValue());
                        }
                        break;
                    case 59:
                        if (read(i3, length2, obj)) {
                            write(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), layoutNode_foldedChildren1);
                        }
                        break;
                    case 60:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), RemoteActionCompatParcelizer(length2));
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i3, (setOnAttachui) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.MediaMetadataCompat(i3, serializer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 63:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.write(i3, serializer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 64:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i3, serializer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 65:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.read(i3, read(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 66:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.read(i3, serializer(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 67:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.IconCompatParcelizer(i3, read(iMediaBrowserCompatMediaItem2 & 1048575, obj));
                        }
                        break;
                    case 68:
                        if (read(i3, length2, obj)) {
                            layoutNode_foldedChildren1.read(i3, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem2 & 1048575, obj), RemoteActionCompatParcelizer(length2));
                        }
                        break;
                }
            } else {
                return;
            }
        }
    }

    public final getDoubleTapTimeoutMillis serializer(int i) {
        return (getDoubleTapTimeoutMillis) this.PlaybackStateCompat[ff$$ExternalSyntheticOutline0.m(i, 3, 2, 1)];
    }

    public static boolean RemoteActionCompatParcelizer(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).PlaybackStateCompatCustomAction();
        }
        return true;
    }

    public static LayoutNodeKt read(getDetachedFromParentLookaheadPlacementui getdetachedfromparentlookaheadplacementui, accessgetDefaultDensityp accessgetdefaultdensityp, LayoutNodeUsageByParent layoutNodeUsageByParent, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema unknownFieldSchema, LayoutNodeExternalSyntheticLambda1 layoutNodeExternalSyntheticLambda1, drawDirecteZhPAX0ui drawdirectezhpax0ui) {
        if (getdetachedfromparentlookaheadplacementui instanceof getDetachedFromParentLookaheadPlacementui) {
            return write(getdetachedfromparentlookaheadplacementui, accessgetdefaultdensityp, layoutNodeUsageByParent, unknownFieldSchema, layoutNodeExternalSyntheticLambda1, drawdirectezhpax0ui);
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
        return null;
    }

    public static void write(int i, Object obj, LayoutNode_foldedChildren1 layoutNode_foldedChildren1) throws CodedOutputStream$OutOfSpaceException {
        if (!(obj instanceof String)) {
            layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i, (setOnAttachui) obj);
            return;
        }
        String str = (String) obj;
        setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
        setsemanticsinvalidatedui.write(i, 2);
        int i2 = setsemanticsinvalidatedui.write;
        byte[] bArr = setsemanticsinvalidatedui.IconCompatParcelizer;
        int i3 = setsemanticsinvalidatedui.RemoteActionCompatParcelizer;
        try {
            int i4 = setSemanticsInvalidatedui.read(str.length() * 3);
            int i5 = setSemanticsInvalidatedui.read(str.length());
            if (i5 != i4) {
                setsemanticsinvalidatedui.RatingCompat(getNextChildPlaceOrderui.RemoteActionCompatParcelizer(str));
                int i6 = setsemanticsinvalidatedui.RemoteActionCompatParcelizer;
                setsemanticsinvalidatedui.RemoteActionCompatParcelizer = getNextChildPlaceOrderui.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, bArr, i6, i2 - i6);
            } else {
                int i7 = i3 + i5;
                setsemanticsinvalidatedui.RemoteActionCompatParcelizer = i7;
                int iRemoteActionCompatParcelizer = getNextChildPlaceOrderui.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, bArr, i7, i2 - i7);
                setsemanticsinvalidatedui.RemoteActionCompatParcelizer = i3;
                setsemanticsinvalidatedui.RatingCompat((iRemoteActionCompatParcelizer - i3) - i5);
                setsemanticsinvalidatedui.RemoteActionCompatParcelizer = iRemoteActionCompatParcelizer;
            }
        } catch (Utf8$UnpairedSurrogateException e) {
            setsemanticsinvalidatedui.RemoteActionCompatParcelizer = i3;
            setSemanticsInvalidatedui.read.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(getMinimumTouchTargetSizeMYxV2XQ.write);
            try {
                setsemanticsinvalidatedui.RatingCompat(bytes.length);
                setsemanticsinvalidatedui.read(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(e3);
        }
    }

    @Override // o.getCoordinatesAccessedDuringPlacement
    public final int IconCompatParcelizer(GeneratedMessageLite generatedMessageLite) {
        return this.PlaybackStateCompatCustomAction ? read(generatedMessageLite) : write(generatedMessageLite);
    }

    public final boolean IconCompatParcelizer(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return IconCompatParcelizer(i, generatedMessageLite) == IconCompatParcelizer(i, generatedMessageLite2);
    }

    public final getCoordinatesAccessedDuringPlacement RemoteActionCompatParcelizer(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.PlaybackStateCompat;
        getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement = (getCoordinatesAccessedDuringPlacement) objArr[i2];
        if (getcoordinatesaccessedduringplacement != null) {
            return getcoordinatesaccessedduringplacement;
        }
        getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = withComposeStackTrace.write.RemoteActionCompatParcelizer((Class) objArr[i2 + 1]);
        objArr[i2] = getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer;
        return getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer;
    }

    public final Object read(int i) {
        return this.PlaybackStateCompat[(i / 3) * 2];
    }

    public final Object serializer(int i, int i2, Object obj) {
        getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
        if (!read(i, i2, obj)) {
            return getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer();
        }
        Object object = write.getObject(obj, MediaBrowserCompatMediaItem(i2) & 1048575);
        if (RemoteActionCompatParcelizer(object)) {
            return object;
        }
        Object objSerializer = getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer();
        if (object != null) {
            getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer(objSerializer, object);
        }
        return objSerializer;
    }

    public final Object serializer(int i, Object obj) {
        getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i) & 1048575;
        if (!IconCompatParcelizer(i, obj)) {
            return getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer();
        }
        Object object = write.getObject(obj, jMediaBrowserCompatMediaItem);
        if (RemoteActionCompatParcelizer(object)) {
            return object;
        }
        Object objSerializer = getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer();
        if (object != null) {
            getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer(objSerializer, object);
        }
        return objSerializer;
    }

    public final int write(GeneratedMessageLite generatedMessageLite) {
        int i;
        int iSerializer;
        int iIconCompatParcelizer;
        int iSerializer2;
        int iIconCompatParcelizer2;
        int iWrite;
        int iSerializer3;
        int iSerializer4;
        int iM;
        int iRemoteActionCompatParcelizer;
        Unsafe unsafe = write;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int iM2 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.serializer;
            if (i4 < iArr.length) {
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i4);
                int i6 = iArr[i4];
                int iIconCompatParcelizer3 = IconCompatParcelizer(iMediaBrowserCompatMediaItem);
                if (iIconCompatParcelizer3 <= 17) {
                    int i7 = iArr[i4 + 2];
                    int i8 = i7 & i2;
                    i = 1 << (i7 >>> 20);
                    if (i8 != i3) {
                        i5 = unsafe.getInt(generatedMessageLite, i8);
                        i3 = i8;
                    }
                } else {
                    i = 0;
                }
                long j = iMediaBrowserCompatMediaItem & i2;
                switch (iIconCompatParcelizer3) {
                    case 0:
                        if ((i5 & i) != 0) {
                            iM2 = ff$$ExternalSyntheticOutline0.m(i6, 8, iM2);
                        }
                        break;
                    case 1:
                        if ((i5 & i) != 0) {
                            iM2 = ff$$ExternalSyntheticOutline0.m(i6, 4, iM2);
                        }
                        break;
                    case 2:
                        if ((i & i5) != 0) {
                            long j2 = unsafe.getLong(generatedMessageLite, j);
                            iSerializer = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer(j2);
                            iWrite = iIconCompatParcelizer + iSerializer;
                            iM2 += iWrite;
                        }
                        break;
                    case 3:
                        if ((i & i5) != 0) {
                            long j3 = unsafe.getLong(generatedMessageLite, j);
                            iSerializer = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer(j3);
                            iWrite = iIconCompatParcelizer + iSerializer;
                            iM2 += iWrite;
                        }
                        break;
                    case 4:
                        if ((i & i5) != 0) {
                            int i9 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer2 = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer2 = setSemanticsInvalidatedui.IconCompatParcelizer(i9);
                            iWrite = iIconCompatParcelizer2 + iSerializer2;
                            iM2 += iWrite;
                        }
                        break;
                    case 5:
                        if ((i5 & i) != 0) {
                            iWrite = setSemanticsInvalidatedui.write(i6);
                            iM2 += iWrite;
                        }
                        break;
                    case 6:
                        if ((i5 & i) != 0) {
                            iWrite = setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i6);
                            iM2 += iWrite;
                        }
                        break;
                    case 7:
                        if ((i5 & i) != 0) {
                            iM2 = ff$$ExternalSyntheticOutline0.m(i6, 1, iM2);
                        }
                        break;
                    case 8:
                        if ((i & i5) != 0) {
                            Object object = unsafe.getObject(generatedMessageLite, j);
                            if (object instanceof setOnAttachui) {
                                int iSerializer5 = setSemanticsInvalidatedui.serializer(i6);
                                int iIconCompatParcelizer4 = ((setOnAttachui) object).IconCompatParcelizer();
                                iM = af$$ExternalSyntheticOutline0.m(iIconCompatParcelizer4, iIconCompatParcelizer4, iSerializer5, iM2);
                            } else {
                                iSerializer3 = setSemanticsInvalidatedui.serializer(i6);
                                iSerializer4 = setSemanticsInvalidatedui.serializer((String) object);
                                iM = iSerializer4 + iSerializer3 + iM2;
                            }
                            iM2 = iM;
                        }
                        break;
                    case 9:
                        if ((i & i5) != 0) {
                            Object object2 = unsafe.getObject(generatedMessageLite, j);
                            getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i4);
                            Class cls = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                            int iSerializer6 = setSemanticsInvalidatedui.serializer(i6);
                            int iWrite2 = ((setInteropViewFactoryHolderui) object2).write(getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer);
                            iM2 = af$$ExternalSyntheticOutline0.m(iWrite2, iWrite2, iSerializer6, iM2);
                        }
                        break;
                    case 10:
                        if ((i & i5) != 0) {
                            iWrite = setSemanticsInvalidatedui.write(i6, (setOnAttachui) unsafe.getObject(generatedMessageLite, j));
                            iM2 += iWrite;
                        }
                        break;
                    case 11:
                        if ((i & i5) != 0) {
                            int i10 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer2 = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer2 = setSemanticsInvalidatedui.read(i10);
                            iWrite = iIconCompatParcelizer2 + iSerializer2;
                            iM2 += iWrite;
                        }
                        break;
                    case 12:
                        if ((i & i5) != 0) {
                            int i11 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer2 = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer2 = setSemanticsInvalidatedui.IconCompatParcelizer(i11);
                            iWrite = iIconCompatParcelizer2 + iSerializer2;
                            iM2 += iWrite;
                        }
                        break;
                    case 13:
                        if ((i5 & i) != 0) {
                            iM2 = ff$$ExternalSyntheticOutline0.m(i6, 4, iM2);
                        }
                        break;
                    case 14:
                        if ((i5 & i) != 0) {
                            iM2 = ff$$ExternalSyntheticOutline0.m(i6, 8, iM2);
                        }
                        break;
                    case 15:
                        if ((i & i5) != 0) {
                            int i12 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer2 = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer2 = setSemanticsInvalidatedui.read((i12 << 1) ^ (i12 >> 31));
                            iWrite = iIconCompatParcelizer2 + iSerializer2;
                            iM2 += iWrite;
                        }
                        break;
                    case 16:
                        if ((i & i5) != 0) {
                            long j4 = unsafe.getLong(generatedMessageLite, j);
                            iSerializer = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer((j4 << 1) ^ (j4 >> 63));
                            iWrite = iIconCompatParcelizer + iSerializer;
                            iM2 += iWrite;
                        }
                        break;
                    case 17:
                        if ((i & i5) != 0) {
                            iWrite = setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i6, (setInteropViewFactoryHolderui) unsafe.getObject(generatedMessageLite, j), RemoteActionCompatParcelizer(i4));
                            iM2 += iWrite;
                        }
                        break;
                    case 18:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 19:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 20:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaDescriptionCompat(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 21:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatResultReceiverWrapper(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 22:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.read(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 23:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 24:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 25:
                        List list = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls2 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                        int size = list.size();
                        iM2 += size == 0 ? 0 : (setSemanticsInvalidatedui.serializer(i6) + 1) * size;
                        break;
                    case 26:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaBrowserCompatMediaItem(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 27:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(i6, (List) unsafe.getObject(generatedMessageLite, j), RemoteActionCompatParcelizer(i4));
                        iM2 += iWrite;
                        break;
                    case 28:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 29:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.RatingCompat(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 30:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 31:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 32:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 33:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatQueueItem(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaMetadataCompat(i6, (List) unsafe.getObject(generatedMessageLite, j));
                        iM2 += iWrite;
                        break;
                    case 35:
                        int i13 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.read((List) unsafe.getObject(generatedMessageLite, j));
                        if (i13 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(i13, setSemanticsInvalidatedui.serializer(i6), i13, iM2);
                        }
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        int iWrite3 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write((List) unsafe.getObject(generatedMessageLite, j));
                        if (iWrite3 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(iWrite3, setSemanticsInvalidatedui.serializer(i6), iWrite3, iM2);
                        }
                        break;
                    case 37:
                        int iRemoteActionCompatParcelizer2 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer((List) unsafe.getObject(generatedMessageLite, j));
                        if (iRemoteActionCompatParcelizer2 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer2, setSemanticsInvalidatedui.serializer(i6), iRemoteActionCompatParcelizer2, iM2);
                        }
                        break;
                    case 38:
                        int iMediaSessionCompatQueueItem = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatQueueItem((List) unsafe.getObject(generatedMessageLite, j));
                        if (iMediaSessionCompatQueueItem > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(iMediaSessionCompatQueueItem, setSemanticsInvalidatedui.serializer(i6), iMediaSessionCompatQueueItem, iM2);
                        }
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        int iIconCompatParcelizer5 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer((List) unsafe.getObject(generatedMessageLite, j));
                        if (iIconCompatParcelizer5 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(iIconCompatParcelizer5, setSemanticsInvalidatedui.serializer(i6), iIconCompatParcelizer5, iM2);
                        }
                        break;
                    case 40:
                        int i14 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.read((List) unsafe.getObject(generatedMessageLite, j));
                        if (i14 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(i14, setSemanticsInvalidatedui.serializer(i6), i14, iM2);
                        }
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        int iWrite4 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write((List) unsafe.getObject(generatedMessageLite, j));
                        if (iWrite4 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(iWrite4, setSemanticsInvalidatedui.serializer(i6), iWrite4, iM2);
                        }
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        List list2 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls3 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                        int size2 = list2.size();
                        if (size2 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(size2, setSemanticsInvalidatedui.serializer(i6), size2, iM2);
                        }
                        break;
                    case 43:
                        int iMediaBrowserCompatMediaItem2 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaBrowserCompatMediaItem((List) unsafe.getObject(generatedMessageLite, j));
                        if (iMediaBrowserCompatMediaItem2 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(iMediaBrowserCompatMediaItem2, setSemanticsInvalidatedui.serializer(i6), iMediaBrowserCompatMediaItem2, iM2);
                        }
                        break;
                    case 44:
                        int iSerializer7 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer((List) unsafe.getObject(generatedMessageLite, j));
                        if (iSerializer7 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(iSerializer7, setSemanticsInvalidatedui.serializer(i6), iSerializer7, iM2);
                        }
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        int iWrite5 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write((List) unsafe.getObject(generatedMessageLite, j));
                        if (iWrite5 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(iWrite5, setSemanticsInvalidatedui.serializer(i6), iWrite5, iM2);
                        }
                        break;
                    case 46:
                        int i15 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.read((List) unsafe.getObject(generatedMessageLite, j));
                        if (i15 > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(i15, setSemanticsInvalidatedui.serializer(i6), i15, iM2);
                        }
                        break;
                    case 47:
                        int iMediaDescriptionCompat = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaDescriptionCompat((List) unsafe.getObject(generatedMessageLite, j));
                        if (iMediaDescriptionCompat > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(iMediaDescriptionCompat, setSemanticsInvalidatedui.serializer(i6), iMediaDescriptionCompat, iM2);
                        }
                        break;
                    case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        int iRatingCompat = getChildrenAccessingLookaheadCoordinatesDuringPlacement.RatingCompat((List) unsafe.getObject(generatedMessageLite, j));
                        if (iRatingCompat > 0) {
                            iM2 = af$$ExternalSyntheticOutline0.m(iRatingCompat, setSemanticsInvalidatedui.serializer(i6), iRatingCompat, iM2);
                        }
                        break;
                    case 49:
                        List list3 = (List) unsafe.getObject(generatedMessageLite, j);
                        getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i4);
                        Class cls4 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                        int size3 = list3.size();
                        if (size3 == 0) {
                            iRemoteActionCompatParcelizer = 0;
                        } else {
                            iRemoteActionCompatParcelizer = 0;
                            for (int i16 = 0; i16 < size3; i16++) {
                                iRemoteActionCompatParcelizer += setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i6, (setInteropViewFactoryHolderui) list3.get(i16), getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer2);
                            }
                        }
                        iM2 += iRemoteActionCompatParcelizer;
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        Object object3 = unsafe.getObject(generatedMessageLite, j);
                        Object obj = read(i4);
                        this.MediaDescriptionCompat.getClass();
                        drawDirecteZhPAX0ui.read(object3, obj);
                        break;
                    case 51:
                        if (read(i6, i4, generatedMessageLite)) {
                            iM2 = ff$$ExternalSyntheticOutline0.m(i6, 8, iM2);
                        }
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        if (read(i6, i4, generatedMessageLite)) {
                            iM2 = ff$$ExternalSyntheticOutline0.m(i6, 4, iM2);
                        }
                        break;
                    case 53:
                        if (read(i6, i4, generatedMessageLite)) {
                            long j5 = read(j, generatedMessageLite);
                            iSerializer = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer(j5);
                            iWrite = iIconCompatParcelizer + iSerializer;
                            iM2 += iWrite;
                        }
                        break;
                    case 54:
                        if (read(i6, i4, generatedMessageLite)) {
                            long j6 = read(j, generatedMessageLite);
                            iSerializer = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer(j6);
                            iWrite = iIconCompatParcelizer + iSerializer;
                            iM2 += iWrite;
                        }
                        break;
                    case 55:
                        if (read(i6, i4, generatedMessageLite)) {
                            int iSerializer8 = serializer(j, generatedMessageLite);
                            iSerializer2 = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer2 = setSemanticsInvalidatedui.IconCompatParcelizer(iSerializer8);
                            iWrite = iIconCompatParcelizer2 + iSerializer2;
                            iM2 += iWrite;
                        }
                        break;
                    case 56:
                        if (read(i6, i4, generatedMessageLite)) {
                            iWrite = setSemanticsInvalidatedui.write(i6);
                            iM2 += iWrite;
                        }
                        break;
                    case 57:
                        if (read(i6, i4, generatedMessageLite)) {
                            iWrite = setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i6);
                            iM2 += iWrite;
                        }
                        break;
                    case 58:
                        if (read(i6, i4, generatedMessageLite)) {
                            iM2 = ff$$ExternalSyntheticOutline0.m(i6, 1, iM2);
                        }
                        break;
                    case 59:
                        if (read(i6, i4, generatedMessageLite)) {
                            Object object4 = unsafe.getObject(generatedMessageLite, j);
                            if (object4 instanceof setOnAttachui) {
                                int iSerializer9 = setSemanticsInvalidatedui.serializer(i6);
                                int iIconCompatParcelizer6 = ((setOnAttachui) object4).IconCompatParcelizer();
                                iM = af$$ExternalSyntheticOutline0.m(iIconCompatParcelizer6, iIconCompatParcelizer6, iSerializer9, iM2);
                            } else {
                                iSerializer3 = setSemanticsInvalidatedui.serializer(i6);
                                iSerializer4 = setSemanticsInvalidatedui.serializer((String) object4);
                                iM = iSerializer4 + iSerializer3 + iM2;
                            }
                            iM2 = iM;
                        }
                        break;
                    case 60:
                        if (read(i6, i4, generatedMessageLite)) {
                            Object object5 = unsafe.getObject(generatedMessageLite, j);
                            getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(i4);
                            Class cls5 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                            int iSerializer10 = setSemanticsInvalidatedui.serializer(i6);
                            int iWrite6 = ((setInteropViewFactoryHolderui) object5).write(getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer3);
                            iM2 = af$$ExternalSyntheticOutline0.m(iWrite6, iWrite6, iSerializer10, iM2);
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                        if (read(i6, i4, generatedMessageLite)) {
                            iWrite = setSemanticsInvalidatedui.write(i6, (setOnAttachui) unsafe.getObject(generatedMessageLite, j));
                            iM2 += iWrite;
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                        if (read(i6, i4, generatedMessageLite)) {
                            int iSerializer11 = serializer(j, generatedMessageLite);
                            iSerializer2 = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer2 = setSemanticsInvalidatedui.read(iSerializer11);
                            iWrite = iIconCompatParcelizer2 + iSerializer2;
                            iM2 += iWrite;
                        }
                        break;
                    case 63:
                        if (read(i6, i4, generatedMessageLite)) {
                            int iSerializer12 = serializer(j, generatedMessageLite);
                            iSerializer2 = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer2 = setSemanticsInvalidatedui.IconCompatParcelizer(iSerializer12);
                            iWrite = iIconCompatParcelizer2 + iSerializer2;
                            iM2 += iWrite;
                        }
                        break;
                    case 64:
                        if (read(i6, i4, generatedMessageLite)) {
                            iM2 = ff$$ExternalSyntheticOutline0.m(i6, 4, iM2);
                        }
                        break;
                    case 65:
                        if (read(i6, i4, generatedMessageLite)) {
                            iM2 = ff$$ExternalSyntheticOutline0.m(i6, 8, iM2);
                        }
                        break;
                    case 66:
                        if (read(i6, i4, generatedMessageLite)) {
                            int iSerializer13 = serializer(j, generatedMessageLite);
                            iSerializer2 = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer2 = setSemanticsInvalidatedui.read((iSerializer13 << 1) ^ (iSerializer13 >> 31));
                            iWrite = iIconCompatParcelizer2 + iSerializer2;
                            iM2 += iWrite;
                        }
                        break;
                    case 67:
                        if (read(i6, i4, generatedMessageLite)) {
                            long j7 = read(j, generatedMessageLite);
                            iSerializer = setSemanticsInvalidatedui.serializer(i6);
                            iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer((j7 << 1) ^ (j7 >> 63));
                            iWrite = iIconCompatParcelizer + iSerializer;
                            iM2 += iWrite;
                        }
                        break;
                    case 68:
                        if (read(i6, i4, generatedMessageLite)) {
                            iWrite = setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i6, (setInteropViewFactoryHolderui) unsafe.getObject(generatedMessageLite, j), RemoteActionCompatParcelizer(i4));
                            iM2 += iWrite;
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
            } else {
                ((getHeightui) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
                return generatedMessageLite.IconCompatParcelizer.IconCompatParcelizer() + iM2;
            }
        }
    }

    public static Field IconCompatParcelizer(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
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

    public final int read(GeneratedMessageLite generatedMessageLite) {
        int iSerializer;
        int iIconCompatParcelizer;
        int iSerializer2;
        int iIconCompatParcelizer2;
        int iWrite;
        int iSerializer3;
        int iSerializer4;
        int iSerializer5;
        int iIconCompatParcelizer3;
        int iRemoteActionCompatParcelizer;
        Unsafe unsafe = write;
        int i = 0;
        int iM = 0;
        while (true) {
            int[] iArr = this.serializer;
            if (i >= iArr.length) {
                ((getHeightui) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
                return generatedMessageLite.IconCompatParcelizer.IconCompatParcelizer() + iM;
            }
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
            int iIconCompatParcelizer4 = IconCompatParcelizer(iMediaBrowserCompatMediaItem);
            int i2 = iArr[i];
            long j = iMediaBrowserCompatMediaItem & 1048575;
            if (iIconCompatParcelizer4 >= LayoutNodeCompanion.DOUBLE_LIST_PACKED.id() && iIconCompatParcelizer4 <= LayoutNodeCompanion.SINT64_LIST_PACKED.id()) {
                int i3 = iArr[i + 2];
            }
            switch (iIconCompatParcelizer4) {
                case 0:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        iM = ff$$ExternalSyntheticOutline0.m(i2, 8, iM);
                    }
                    break;
                case 1:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        iM = ff$$ExternalSyntheticOutline0.m(i2, 4, iM);
                    }
                    break;
                case 2:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        long jMediaMetadataCompat = getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, generatedMessageLite);
                        iSerializer = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer(jMediaMetadataCompat);
                        iWrite = iIconCompatParcelizer + iSerializer;
                        iM += iWrite;
                    }
                    break;
                case 3:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        long jMediaMetadataCompat2 = getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, generatedMessageLite);
                        iSerializer = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer(jMediaMetadataCompat2);
                        iWrite = iIconCompatParcelizer + iSerializer;
                        iM += iWrite;
                    }
                    break;
                case 4:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        int iRemoteActionCompatParcelizer2 = getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, generatedMessageLite);
                        iSerializer2 = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer2 = setSemanticsInvalidatedui.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iWrite = iIconCompatParcelizer2 + iSerializer2;
                        iM += iWrite;
                    }
                    break;
                case 5:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        iWrite = setSemanticsInvalidatedui.write(i2);
                        iM += iWrite;
                    }
                    break;
                case 6:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        iWrite = setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i2);
                        iM += iWrite;
                    }
                    break;
                case 7:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        iM = ff$$ExternalSyntheticOutline0.m(i2, 1, iM);
                    }
                    break;
                case 8:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        Object objMediaSessionCompatQueueItem = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite);
                        if (objMediaSessionCompatQueueItem instanceof setOnAttachui) {
                            int iSerializer6 = setSemanticsInvalidatedui.serializer(i2);
                            int iIconCompatParcelizer5 = ((setOnAttachui) objMediaSessionCompatQueueItem).IconCompatParcelizer();
                            iM = af$$ExternalSyntheticOutline0.m(iIconCompatParcelizer5, iIconCompatParcelizer5, iSerializer6, iM);
                        } else {
                            iSerializer3 = setSemanticsInvalidatedui.serializer(i2);
                            iSerializer4 = setSemanticsInvalidatedui.serializer((String) objMediaSessionCompatQueueItem);
                            iM += iSerializer4 + iSerializer3;
                        }
                    }
                    break;
                case 9:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        Object objMediaSessionCompatQueueItem2 = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite);
                        getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
                        Class cls = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                        int iSerializer7 = setSemanticsInvalidatedui.serializer(i2);
                        int iWrite2 = ((setInteropViewFactoryHolderui) objMediaSessionCompatQueueItem2).write(getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer);
                        iM = af$$ExternalSyntheticOutline0.m(iWrite2, iWrite2, iSerializer7, iM);
                    }
                    break;
                case 10:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        iWrite = setSemanticsInvalidatedui.write(i2, (setOnAttachui) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite));
                        iM += iWrite;
                    }
                    break;
                case 11:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        int iRemoteActionCompatParcelizer3 = getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, generatedMessageLite);
                        iSerializer2 = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer2 = setSemanticsInvalidatedui.read(iRemoteActionCompatParcelizer3);
                        iWrite = iIconCompatParcelizer2 + iSerializer2;
                        iM += iWrite;
                    }
                    break;
                case 12:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        int iRemoteActionCompatParcelizer4 = getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, generatedMessageLite);
                        iSerializer2 = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer2 = setSemanticsInvalidatedui.IconCompatParcelizer(iRemoteActionCompatParcelizer4);
                        iWrite = iIconCompatParcelizer2 + iSerializer2;
                        iM += iWrite;
                    }
                    break;
                case 13:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        iM = ff$$ExternalSyntheticOutline0.m(i2, 4, iM);
                    }
                    break;
                case 14:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        iM = ff$$ExternalSyntheticOutline0.m(i2, 8, iM);
                    }
                    break;
                case 15:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        int iRemoteActionCompatParcelizer5 = getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, generatedMessageLite);
                        iSerializer2 = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer2 = setSemanticsInvalidatedui.read((iRemoteActionCompatParcelizer5 << 1) ^ (iRemoteActionCompatParcelizer5 >> 31));
                        iWrite = iIconCompatParcelizer2 + iSerializer2;
                        iM += iWrite;
                    }
                    break;
                case 16:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        long jMediaMetadataCompat3 = getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, generatedMessageLite);
                        iSerializer5 = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer3 = setSemanticsInvalidatedui.IconCompatParcelizer((jMediaMetadataCompat3 << 1) ^ (jMediaMetadataCompat3 >> 63));
                        iWrite = iIconCompatParcelizer3 + iSerializer5;
                        iM += iWrite;
                    }
                    break;
                case 17:
                    if (IconCompatParcelizer(i, generatedMessageLite)) {
                        iWrite = setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i2, (setInteropViewFactoryHolderui) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite), RemoteActionCompatParcelizer(i));
                        iM += iWrite;
                    }
                    break;
                case 18:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 19:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 20:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaDescriptionCompat(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 21:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatResultReceiverWrapper(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 22:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.read(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 23:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 24:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 25:
                    List list = read(generatedMessageLite, j);
                    Class cls2 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                    int size = list.size();
                    iM += size == 0 ? 0 : (setSemanticsInvalidatedui.serializer(i2) + 1) * size;
                    break;
                case 26:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaBrowserCompatMediaItem(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 27:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(i2, read(generatedMessageLite, j), RemoteActionCompatParcelizer(i));
                    iM += iWrite;
                    break;
                case 28:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 29:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.RatingCompat(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 30:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 31:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 32:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 33:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatQueueItem(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    iWrite = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaMetadataCompat(i2, read(generatedMessageLite, j));
                    iM += iWrite;
                    break;
                case 35:
                    int i4 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.read((List) unsafe.getObject(generatedMessageLite, j));
                    if (i4 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(i4, setSemanticsInvalidatedui.serializer(i2), i4, iM);
                    }
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int iWrite3 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write((List) unsafe.getObject(generatedMessageLite, j));
                    if (iWrite3 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(iWrite3, setSemanticsInvalidatedui.serializer(i2), iWrite3, iM);
                    }
                    break;
                case 37:
                    int iRemoteActionCompatParcelizer6 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer((List) unsafe.getObject(generatedMessageLite, j));
                    if (iRemoteActionCompatParcelizer6 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer6, setSemanticsInvalidatedui.serializer(i2), iRemoteActionCompatParcelizer6, iM);
                    }
                    break;
                case 38:
                    int iMediaSessionCompatQueueItem = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatQueueItem((List) unsafe.getObject(generatedMessageLite, j));
                    if (iMediaSessionCompatQueueItem > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(iMediaSessionCompatQueueItem, setSemanticsInvalidatedui.serializer(i2), iMediaSessionCompatQueueItem, iM);
                    }
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int iIconCompatParcelizer6 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer((List) unsafe.getObject(generatedMessageLite, j));
                    if (iIconCompatParcelizer6 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(iIconCompatParcelizer6, setSemanticsInvalidatedui.serializer(i2), iIconCompatParcelizer6, iM);
                    }
                    break;
                case 40:
                    int i5 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.read((List) unsafe.getObject(generatedMessageLite, j));
                    if (i5 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(i5, setSemanticsInvalidatedui.serializer(i2), i5, iM);
                    }
                    break;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    int iWrite4 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write((List) unsafe.getObject(generatedMessageLite, j));
                    if (iWrite4 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(iWrite4, setSemanticsInvalidatedui.serializer(i2), iWrite4, iM);
                    }
                    break;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list2 = (List) unsafe.getObject(generatedMessageLite, j);
                    Class cls3 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                    int size2 = list2.size();
                    if (size2 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(size2, setSemanticsInvalidatedui.serializer(i2), size2, iM);
                    }
                    break;
                case 43:
                    int iMediaBrowserCompatMediaItem2 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaBrowserCompatMediaItem((List) unsafe.getObject(generatedMessageLite, j));
                    if (iMediaBrowserCompatMediaItem2 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(iMediaBrowserCompatMediaItem2, setSemanticsInvalidatedui.serializer(i2), iMediaBrowserCompatMediaItem2, iM);
                    }
                    break;
                case 44:
                    int iSerializer8 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer((List) unsafe.getObject(generatedMessageLite, j));
                    if (iSerializer8 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(iSerializer8, setSemanticsInvalidatedui.serializer(i2), iSerializer8, iM);
                    }
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int iWrite5 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.write((List) unsafe.getObject(generatedMessageLite, j));
                    if (iWrite5 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(iWrite5, setSemanticsInvalidatedui.serializer(i2), iWrite5, iM);
                    }
                    break;
                case 46:
                    int i6 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.read((List) unsafe.getObject(generatedMessageLite, j));
                    if (i6 > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(i6, setSemanticsInvalidatedui.serializer(i2), i6, iM);
                    }
                    break;
                case 47:
                    int iMediaDescriptionCompat = getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaDescriptionCompat((List) unsafe.getObject(generatedMessageLite, j));
                    if (iMediaDescriptionCompat > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(iMediaDescriptionCompat, setSemanticsInvalidatedui.serializer(i2), iMediaDescriptionCompat, iM);
                    }
                    break;
                case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                    int iRatingCompat = getChildrenAccessingLookaheadCoordinatesDuringPlacement.RatingCompat((List) unsafe.getObject(generatedMessageLite, j));
                    if (iRatingCompat > 0) {
                        iM = af$$ExternalSyntheticOutline0.m(iRatingCompat, setSemanticsInvalidatedui.serializer(i2), iRatingCompat, iM);
                    }
                    break;
                case 49:
                    List list3 = read(generatedMessageLite, j);
                    getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i);
                    Class cls4 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                    int size3 = list3.size();
                    if (size3 == 0) {
                        iRemoteActionCompatParcelizer = 0;
                    } else {
                        iRemoteActionCompatParcelizer = 0;
                        for (int i7 = 0; i7 < size3; i7++) {
                            iRemoteActionCompatParcelizer += setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i2, (setInteropViewFactoryHolderui) list3.get(i7), getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer2);
                        }
                    }
                    iM += iRemoteActionCompatParcelizer;
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    Object objMediaSessionCompatQueueItem3 = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite);
                    Object obj = read(i);
                    this.MediaDescriptionCompat.getClass();
                    drawDirecteZhPAX0ui.read(objMediaSessionCompatQueueItem3, obj);
                    break;
                case 51:
                    if (read(i2, i, generatedMessageLite)) {
                        iM = ff$$ExternalSyntheticOutline0.m(i2, 8, iM);
                    }
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (read(i2, i, generatedMessageLite)) {
                        iM = ff$$ExternalSyntheticOutline0.m(i2, 4, iM);
                    }
                    break;
                case 53:
                    if (read(i2, i, generatedMessageLite)) {
                        long j2 = read(j, generatedMessageLite);
                        iSerializer = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer(j2);
                        iWrite = iIconCompatParcelizer + iSerializer;
                        iM += iWrite;
                    }
                    break;
                case 54:
                    if (read(i2, i, generatedMessageLite)) {
                        long j3 = read(j, generatedMessageLite);
                        iSerializer = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer(j3);
                        iWrite = iIconCompatParcelizer + iSerializer;
                        iM += iWrite;
                    }
                    break;
                case 55:
                    if (read(i2, i, generatedMessageLite)) {
                        int iSerializer9 = serializer(j, generatedMessageLite);
                        iSerializer2 = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer2 = setSemanticsInvalidatedui.IconCompatParcelizer(iSerializer9);
                        iWrite = iIconCompatParcelizer2 + iSerializer2;
                        iM += iWrite;
                    }
                    break;
                case 56:
                    if (read(i2, i, generatedMessageLite)) {
                        iWrite = setSemanticsInvalidatedui.write(i2);
                        iM += iWrite;
                    }
                    break;
                case 57:
                    if (read(i2, i, generatedMessageLite)) {
                        iWrite = setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i2);
                        iM += iWrite;
                    }
                    break;
                case 58:
                    if (read(i2, i, generatedMessageLite)) {
                        iM = ff$$ExternalSyntheticOutline0.m(i2, 1, iM);
                    }
                    break;
                case 59:
                    if (read(i2, i, generatedMessageLite)) {
                        Object objMediaSessionCompatQueueItem4 = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite);
                        if (objMediaSessionCompatQueueItem4 instanceof setOnAttachui) {
                            int iSerializer10 = setSemanticsInvalidatedui.serializer(i2);
                            int iIconCompatParcelizer7 = ((setOnAttachui) objMediaSessionCompatQueueItem4).IconCompatParcelizer();
                            iM = af$$ExternalSyntheticOutline0.m(iIconCompatParcelizer7, iIconCompatParcelizer7, iSerializer10, iM);
                        } else {
                            iSerializer3 = setSemanticsInvalidatedui.serializer(i2);
                            iSerializer4 = setSemanticsInvalidatedui.serializer((String) objMediaSessionCompatQueueItem4);
                            iM += iSerializer4 + iSerializer3;
                        }
                    }
                    break;
                case 60:
                    if (read(i2, i, generatedMessageLite)) {
                        Object objMediaSessionCompatQueueItem5 = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite);
                        getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(i);
                        Class cls5 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                        int iSerializer11 = setSemanticsInvalidatedui.serializer(i2);
                        int iWrite6 = ((setInteropViewFactoryHolderui) objMediaSessionCompatQueueItem5).write(getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer3);
                        iM = af$$ExternalSyntheticOutline0.m(iWrite6, iWrite6, iSerializer11, iM);
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                    if (read(i2, i, generatedMessageLite)) {
                        iWrite = setSemanticsInvalidatedui.write(i2, (setOnAttachui) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite));
                        iM += iWrite;
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                    if (read(i2, i, generatedMessageLite)) {
                        int iSerializer12 = serializer(j, generatedMessageLite);
                        iSerializer2 = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer2 = setSemanticsInvalidatedui.read(iSerializer12);
                        iWrite = iIconCompatParcelizer2 + iSerializer2;
                        iM += iWrite;
                    }
                    break;
                case 63:
                    if (read(i2, i, generatedMessageLite)) {
                        int iSerializer13 = serializer(j, generatedMessageLite);
                        iSerializer2 = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer2 = setSemanticsInvalidatedui.IconCompatParcelizer(iSerializer13);
                        iWrite = iIconCompatParcelizer2 + iSerializer2;
                        iM += iWrite;
                    }
                    break;
                case 64:
                    if (read(i2, i, generatedMessageLite)) {
                        iM = ff$$ExternalSyntheticOutline0.m(i2, 4, iM);
                    }
                    break;
                case 65:
                    if (read(i2, i, generatedMessageLite)) {
                        iM = ff$$ExternalSyntheticOutline0.m(i2, 8, iM);
                    }
                    break;
                case 66:
                    if (read(i2, i, generatedMessageLite)) {
                        int iSerializer14 = serializer(j, generatedMessageLite);
                        iSerializer2 = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer2 = setSemanticsInvalidatedui.read((iSerializer14 << 1) ^ (iSerializer14 >> 31));
                        iWrite = iIconCompatParcelizer2 + iSerializer2;
                        iM += iWrite;
                    }
                    break;
                case 67:
                    if (read(i2, i, generatedMessageLite)) {
                        long j4 = read(j, generatedMessageLite);
                        iSerializer5 = setSemanticsInvalidatedui.serializer(i2);
                        iIconCompatParcelizer3 = setSemanticsInvalidatedui.IconCompatParcelizer((j4 << 1) ^ (j4 >> 63));
                        iWrite = iIconCompatParcelizer3 + iSerializer5;
                        iM += iWrite;
                    }
                    break;
                case 68:
                    if (read(i2, i, generatedMessageLite)) {
                        iWrite = setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i2, (setInteropViewFactoryHolderui) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, generatedMessageLite), RemoteActionCompatParcelizer(i));
                        iM += iWrite;
                    }
                    break;
            }
            i += 3;
        }
    }

    public final void read(Object obj, int i, com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader codedInputStreamReader, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        List listRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i & 1048575, obj);
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = codedInputStreamReader.read;
        int i2 = codedInputStreamReader.serializer;
        if ((i2 & 7) == 2) {
            do {
                Object objSerializer = getcoordinatesaccessedduringplacement.serializer();
                codedInputStreamReader.IconCompatParcelizer(objSerializer, getcoordinatesaccessedduringplacement, getnotplacedplaceorderuiannotations);
                getcoordinatesaccessedduringplacement.write(objSerializer);
                listRemoteActionCompatParcelizer.add(objSerializer);
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer() || codedInputStreamReader.IconCompatParcelizer != 0) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == i2);
            codedInputStreamReader.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.serializer();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void serializer(Object obj, LayoutNode_foldedChildren1 layoutNode_foldedChildren1) throws CodedOutputStream$OutOfSpaceException {
        int i;
        boolean z;
        int[] iArr = this.serializer;
        int length = iArr.length;
        Unsafe unsafe = write;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i4);
            int i6 = iArr[i4];
            int iIconCompatParcelizer = IconCompatParcelizer(iMediaBrowserCompatMediaItem);
            if (iIconCompatParcelizer <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = i;
            long j = iMediaBrowserCompatMediaItem & i2;
            switch (iIconCompatParcelizer) {
                case 0:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.write(getLastLookaheadConstraintsDWUhwKw.read.serializer(j, obj), i6);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.serializer(getLastLookaheadConstraintsDWUhwKw.read.write(j, obj), i6);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.serializer(i6, unsafe.getLong(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.write(i6, unsafe.getLong(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.IconCompatParcelizer(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i6, unsafe.getLong(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.serializer(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.write(i6, getLastLookaheadConstraintsDWUhwKw.read.read(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i9 & i5) != 0) {
                        write(i6, unsafe.getObject(obj, j), layoutNode_foldedChildren1);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.IconCompatParcelizer(i6, unsafe.getObject(obj, j), RemoteActionCompatParcelizer(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i6, (setOnAttachui) unsafe.getObject(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.MediaMetadataCompat(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.write(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.read(i6, unsafe.getLong(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.read(i6, unsafe.getInt(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.IconCompatParcelizer(i6, unsafe.getLong(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i9 & i5) != 0) {
                        layoutNode_foldedChildren1.read(i6, unsafe.getObject(obj, j), RemoteActionCompatParcelizer(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaDescriptionCompat(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatQueueItem(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompatCustomAction(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.RatingCompat(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.read(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 27:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, RemoteActionCompatParcelizer(i4));
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 28:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 29:
                    z = false;
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatToken(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    z = false;
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    z = false;
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaMetadataCompat(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    z = false;
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaBrowserCompatMediaItem(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    z = false;
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompat(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z = false;
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.ParcelableVolumeInfo(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaDescriptionCompat(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 37:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatQueueItem(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 38:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompatCustomAction(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.RatingCompat(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 40:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.RemoteActionCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.read(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 43:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaSessionCompatToken(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 44:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaMetadataCompat(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 46:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.MediaBrowserCompatMediaItem(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 47:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.PlaybackStateCompat(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.ParcelableVolumeInfo(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 49:
                    getChildrenAccessingLookaheadCoordinatesDuringPlacement.write(iArr[i4], (List) unsafe.getObject(obj, j), layoutNode_foldedChildren1, RemoteActionCompatParcelizer(i4));
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        Object obj2 = read(i4);
                        this.MediaDescriptionCompat.getClass();
                        m1$$ExternalSyntheticOutline0.m(obj2);
                        throw null;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 51:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.write(((Double) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj)).doubleValue(), i6);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.serializer(((Float) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj)).floatValue(), i6);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 53:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.serializer(i6, read(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 54:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.write(i6, read(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 55:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.IconCompatParcelizer(i6, serializer(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 56:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i6, read(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 57:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.serializer(i6, serializer(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 58:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.write(i6, ((Boolean) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj)).booleanValue());
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 59:
                    if (read(i6, i4, obj)) {
                        write(i6, unsafe.getObject(obj, j), layoutNode_foldedChildren1);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 60:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.IconCompatParcelizer(i6, unsafe.getObject(obj, j), RemoteActionCompatParcelizer(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i6, (setOnAttachui) unsafe.getObject(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.MediaMetadataCompat(i6, serializer(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 63:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.write(i6, serializer(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 64:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i6, serializer(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 65:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.read(i6, read(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 66:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.read(i6, serializer(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 67:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.IconCompatParcelizer(i6, read(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 68:
                    if (read(i6, i4, obj)) {
                        layoutNode_foldedChildren1.read(i6, unsafe.getObject(obj, j), RemoteActionCompatParcelizer(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                default:
                    i4 += 3;
                    i2 = 1048575;
                    break;
            }
        }
        ((getHeightui) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        ((GeneratedMessageLite) obj).IconCompatParcelizer.write(layoutNode_foldedChildren1);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8 A[SYNTHETIC] */
    @Override // o.getCoordinatesAccessedDuringPlacement
    public final boolean IconCompatParcelizer(Object obj) {
        int iIconCompatParcelizer;
        int i = 1048575;
        int i2 = 0;
        for (int i3 = 0; i3 < this.read; i3++) {
            int i4 = this.RatingCompat[i3];
            int[] iArr = this.serializer;
            int i5 = iArr[i4];
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i2 = write.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & iMediaBrowserCompatMediaItem) == 0) {
                iIconCompatParcelizer = IconCompatParcelizer(iMediaBrowserCompatMediaItem);
                if (iIconCompatParcelizer != 9 || iIconCompatParcelizer == 17) {
                    if (i == 1048575) {
                        if (IconCompatParcelizer(i4, obj)) {
                            if (!RemoteActionCompatParcelizer(i4).IconCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj))) {
                            }
                        } else {
                            continue;
                        }
                    } else if ((i8 & i2) != 0) {
                        if (!RemoteActionCompatParcelizer(i4).IconCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (iIconCompatParcelizer != 27) {
                        if (iIconCompatParcelizer == 60 || iIconCompatParcelizer == 68) {
                            if (read(i5, i4, obj)) {
                                if (!RemoteActionCompatParcelizer(i4).IconCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iIconCompatParcelizer != 49) {
                            if (iIconCompatParcelizer != 50) {
                                continue;
                            } else {
                                Object objMediaSessionCompatQueueItem = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj);
                                this.MediaDescriptionCompat.getClass();
                                if (!((draweZhPAX0ui) objMediaSessionCompatQueueItem).isEmpty()) {
                                    m1$$ExternalSyntheticOutline0.m(read(i4));
                                    throw null;
                                }
                            }
                        }
                    }
                    List list = (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.IconCompatParcelizer(list.get(i9))) {
                            }
                        }
                    }
                }
            } else if (i == 1048575) {
                if (IconCompatParcelizer(i4, obj)) {
                    iIconCompatParcelizer = IconCompatParcelizer(iMediaBrowserCompatMediaItem);
                    if (iIconCompatParcelizer != 9) {
                    }
                    if (i == 1048575) {
                        if (IconCompatParcelizer(i4, obj)) {
                            if (!RemoteActionCompatParcelizer(i4).IconCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj))) {
                            }
                        } else {
                            continue;
                        }
                    } else if ((i8 & i2) != 0) {
                        if (!RemoteActionCompatParcelizer(i4).IconCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                }
            } else if ((i2 & i8) != 0) {
                iIconCompatParcelizer = IconCompatParcelizer(iMediaBrowserCompatMediaItem);
                if (iIconCompatParcelizer != 9) {
                }
                if (i == 1048575) {
                    if (IconCompatParcelizer(i4, obj)) {
                        if (!RemoteActionCompatParcelizer(i4).IconCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                } else if ((i8 & i2) != 0) {
                    if (!RemoteActionCompatParcelizer(i4).IconCompatParcelizer(getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(iMediaBrowserCompatMediaItem & 1048575, obj))) {
                    }
                } else {
                    continue;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[SYNTHETIC] */
    @Override // o.getCoordinatesAccessedDuringPlacement
    public final void write(Object obj) {
        if (RemoteActionCompatParcelizer(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.serializer(Integer.MAX_VALUE);
                generatedMessageLite.serializer = 0;
                generatedMessageLite.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            }
            int length = this.serializer.length;
            for (int i = 0; i < length; i += 3) {
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
                long j = 1048575 & iMediaBrowserCompatMediaItem;
                int iIconCompatParcelizer = IconCompatParcelizer(iMediaBrowserCompatMediaItem);
                if (iIconCompatParcelizer != 9) {
                    switch (iIconCompatParcelizer) {
                        case 17:
                            if (IconCompatParcelizer(i, obj)) {
                                RemoteActionCompatParcelizer(i).write(write.getObject(obj, j));
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
                            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(j, obj);
                            break;
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                            Unsafe unsafe = write;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                this.MediaDescriptionCompat.getClass();
                                ((draweZhPAX0ui) object).read();
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (IconCompatParcelizer(i, obj)) {
                    RemoteActionCompatParcelizer(i).write(write.getObject(obj, j));
                }
            }
            ((getHeightui) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
            ((GeneratedMessageLite) obj).IconCompatParcelizer.serializer = false;
        }
    }

    public final void write(Object obj, int i, Object obj2) {
        if (IconCompatParcelizer(i, obj2)) {
            long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i) & 1048575;
            Unsafe unsafe = write;
            Object object = unsafe.getObject(obj2, jMediaBrowserCompatMediaItem);
            if (object == null) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(this.serializer[i], obj2);
                return;
            }
            getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            if (!IconCompatParcelizer(i, obj)) {
                if (RemoteActionCompatParcelizer(object)) {
                    Object objSerializer = getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer();
                    getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer(objSerializer, object);
                    unsafe.putObject(obj, jMediaBrowserCompatMediaItem, objSerializer);
                } else {
                    unsafe.putObject(obj, jMediaBrowserCompatMediaItem, object);
                }
                write(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jMediaBrowserCompatMediaItem);
            if (!RemoteActionCompatParcelizer(object2)) {
                Object objSerializer2 = getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer();
                getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer(objSerializer2, object2);
                unsafe.putObject(obj, jMediaBrowserCompatMediaItem, objSerializer2);
                object2 = objSerializer2;
            }
            getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int IconCompatParcelizer(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, isEndBoundary isendboundary) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iIntValue;
        int iIntValue2 = i;
        Unsafe unsafe = write;
        LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1 = (LayoutNodeCompanionErrorMeasurePolicy1) unsafe.getObject(obj, j2);
        if (!((setGloballyPositionedObservers) layoutNodeCompanionErrorMeasurePolicy1).IconCompatParcelizer) {
            int size = layoutNodeCompanionErrorMeasurePolicy1.size();
            layoutNodeCompanionErrorMeasurePolicy1 = layoutNodeCompanionErrorMeasurePolicy1.read(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, layoutNodeCompanionErrorMeasurePolicy1);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    setRectInParentDirtyui setrectinparentdirtyui = (setRectInParentDirtyui) layoutNodeCompanionErrorMeasurePolicy1;
                    int iIntValue3 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i12 = isendboundary.IconCompatParcelizer + iIntValue3;
                    while (iIntValue3 < i12) {
                        setrectinparentdirtyui.serializer(Double.longBitsToDouble(TuplesKt.RemoteActionCompatParcelizer(iIntValue3, bArr)));
                        iIntValue3 += 8;
                    }
                    if (iIntValue3 == i12) {
                        return iIntValue3;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (i5 == 1) {
                    setRectInParentDirtyui setrectinparentdirtyui2 = (setRectInParentDirtyui) layoutNodeCompanionErrorMeasurePolicy1;
                    setrectinparentdirtyui2.serializer(Double.longBitsToDouble(TuplesKt.RemoteActionCompatParcelizer(iIntValue2, bArr)));
                    while (true) {
                        i8 = iIntValue2 + 8;
                        if (i8 < i2) {
                            iIntValue2 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i8), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                            if (i3 == isendboundary.IconCompatParcelizer) {
                                setrectinparentdirtyui2.serializer(Double.longBitsToDouble(TuplesKt.RemoteActionCompatParcelizer(iIntValue2, bArr)));
                            }
                        }
                    }
                    return i8;
                }
                return iIntValue2;
            case 19:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    LayoutNodeCompanionConstructor1 layoutNodeCompanionConstructor1 = (LayoutNodeCompanionConstructor1) layoutNodeCompanionErrorMeasurePolicy1;
                    int iIntValue4 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i13 = isendboundary.IconCompatParcelizer + iIntValue4;
                    while (iIntValue4 < i13) {
                        layoutNodeCompanionConstructor1.write(Float.intBitsToFloat(TuplesKt.serializer(iIntValue4, bArr)));
                        iIntValue4 += 4;
                    }
                    if (iIntValue4 == i13) {
                        return iIntValue4;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (i5 == 5) {
                    LayoutNodeCompanionConstructor1 layoutNodeCompanionConstructor2 = (LayoutNodeCompanionConstructor1) layoutNodeCompanionErrorMeasurePolicy1;
                    layoutNodeCompanionConstructor2.write(Float.intBitsToFloat(TuplesKt.serializer(iIntValue2, bArr)));
                    while (true) {
                        i9 = iIntValue2 + 4;
                        if (i9 < i2) {
                            iIntValue2 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i9), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                            if (i3 == isendboundary.IconCompatParcelizer) {
                                layoutNodeCompanionConstructor2.write(Float.intBitsToFloat(TuplesKt.serializer(iIntValue2, bArr)));
                            }
                        }
                    }
                    return i9;
                }
                return iIntValue2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    accessgetDrawNodep accessgetdrawnodep = (accessgetDrawNodep) layoutNodeCompanionErrorMeasurePolicy1;
                    int iIntValue5 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i14 = isendboundary.IconCompatParcelizer + iIntValue5;
                    while (iIntValue5 < i14) {
                        iIntValue5 = TuplesKt.write(bArr, iIntValue5, isendboundary);
                        accessgetdrawnodep.serializer(isendboundary.read);
                    }
                    if (iIntValue5 == i14) {
                        return iIntValue5;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (i5 == 0) {
                    accessgetDrawNodep accessgetdrawnodep2 = (accessgetDrawNodep) layoutNodeCompanionErrorMeasurePolicy1;
                    int iWrite = TuplesKt.write(bArr, iIntValue2, isendboundary);
                    accessgetdrawnodep2.serializer(isendboundary.read);
                    while (iWrite < i2) {
                        int iIntValue6 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iWrite), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                        if (i3 != isendboundary.IconCompatParcelizer) {
                            return iWrite;
                        }
                        iWrite = TuplesKt.write(bArr, iIntValue6, isendboundary);
                        accessgetdrawnodep2.serializer(isendboundary.read);
                    }
                    return iWrite;
                }
                return iIntValue2;
            case 22:
            case 29:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return ((Integer) TuplesKt.RemoteActionCompatParcelizer(276612930, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{Integer.valueOf(i3), bArr, Integer.valueOf(i), Integer.valueOf(i2), layoutNodeCompanionErrorMeasurePolicy1, isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -276612922)).intValue();
                    }
                    return iIntValue2;
                }
                getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) layoutNodeCompanionErrorMeasurePolicy1;
                int iIntValue7 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                int i15 = isendboundary.IconCompatParcelizer + iIntValue7;
                while (iIntValue7 < i15) {
                    iIntValue7 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue7), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    getlongpresstimeoutmillis.serializer(isendboundary.IconCompatParcelizer);
                }
                if (iIntValue7 == i15) {
                    return iIntValue7;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    accessgetDrawNodep accessgetdrawnodep3 = (accessgetDrawNodep) layoutNodeCompanionErrorMeasurePolicy1;
                    int iIntValue8 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i16 = isendboundary.IconCompatParcelizer + iIntValue8;
                    while (iIntValue8 < i16) {
                        accessgetdrawnodep3.serializer(TuplesKt.RemoteActionCompatParcelizer(iIntValue8, bArr));
                        iIntValue8 += 8;
                    }
                    if (iIntValue8 == i16) {
                        return iIntValue8;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (i5 == 1) {
                    accessgetDrawNodep accessgetdrawnodep4 = (accessgetDrawNodep) layoutNodeCompanionErrorMeasurePolicy1;
                    accessgetdrawnodep4.serializer(TuplesKt.RemoteActionCompatParcelizer(iIntValue2, bArr));
                    while (true) {
                        i10 = iIntValue2 + 8;
                        if (i10 < i2) {
                            iIntValue2 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i10), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                            if (i3 == isendboundary.IconCompatParcelizer) {
                                accessgetdrawnodep4.serializer(TuplesKt.RemoteActionCompatParcelizer(iIntValue2, bArr));
                            }
                        }
                    }
                    return i10;
                }
                return iIntValue2;
            case 24:
            case 31:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i5 == 2) {
                    getLongPressTimeoutMillis getlongpresstimeoutmillis2 = (getLongPressTimeoutMillis) layoutNodeCompanionErrorMeasurePolicy1;
                    int iIntValue9 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i17 = isendboundary.IconCompatParcelizer + iIntValue9;
                    while (iIntValue9 < i17) {
                        getlongpresstimeoutmillis2.serializer(TuplesKt.serializer(iIntValue9, bArr));
                        iIntValue9 += 4;
                    }
                    if (iIntValue9 == i17) {
                        return iIntValue9;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (i5 == 5) {
                    getLongPressTimeoutMillis getlongpresstimeoutmillis3 = (getLongPressTimeoutMillis) layoutNodeCompanionErrorMeasurePolicy1;
                    getlongpresstimeoutmillis3.serializer(TuplesKt.serializer(iIntValue2, bArr));
                    while (true) {
                        i11 = iIntValue2 + 4;
                        if (i11 < i2) {
                            iIntValue2 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i11), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                            if (i3 == isendboundary.IconCompatParcelizer) {
                                getlongpresstimeoutmillis3.serializer(TuplesKt.serializer(iIntValue2, bArr));
                            }
                        }
                    }
                    return i11;
                }
                return iIntValue2;
            case 25:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (i5 == 2) {
                    setOuterToInnerOffsetgyyYBsui setoutertoinneroffsetgyyybsui = (setOuterToInnerOffsetgyyYBsui) layoutNodeCompanionErrorMeasurePolicy1;
                    int iIntValue10 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i18 = isendboundary.IconCompatParcelizer + iIntValue10;
                    while (iIntValue10 < i18) {
                        iIntValue10 = TuplesKt.write(bArr, iIntValue10, isendboundary);
                        setoutertoinneroffsetgyyybsui.serializer(isendboundary.read != 0);
                    }
                    if (iIntValue10 == i18) {
                        return iIntValue10;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (i5 == 0) {
                    setOuterToInnerOffsetgyyYBsui setoutertoinneroffsetgyyybsui2 = (setOuterToInnerOffsetgyyYBsui) layoutNodeCompanionErrorMeasurePolicy1;
                    int iWrite2 = TuplesKt.write(bArr, iIntValue2, isendboundary);
                    setoutertoinneroffsetgyyybsui2.serializer(isendboundary.read != 0);
                    while (iWrite2 < i2) {
                        int iIntValue11 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iWrite2), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                        if (i3 != isendboundary.IconCompatParcelizer) {
                            return iWrite2;
                        }
                        iWrite2 = TuplesKt.write(bArr, iIntValue11, isendboundary);
                        setoutertoinneroffsetgyyybsui2.serializer(isendboundary.read != 0);
                    }
                    return iWrite2;
                }
                return iIntValue2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iIntValue12 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                        int i19 = isendboundary.IconCompatParcelizer;
                        if (i19 < 0) {
                            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.write();
                        }
                        if (i19 == 0) {
                            layoutNodeCompanionErrorMeasurePolicy1.add("");
                        } else {
                            layoutNodeCompanionErrorMeasurePolicy1.add(new String(bArr, iIntValue12, i19, getMinimumTouchTargetSizeMYxV2XQ.write));
                            iIntValue12 += i19;
                        }
                        while (iIntValue12 < i2) {
                            int iIntValue13 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue12), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                            if (i3 != isendboundary.IconCompatParcelizer) {
                                return iIntValue12;
                            }
                            iIntValue12 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue13), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                            int i20 = isendboundary.IconCompatParcelizer;
                            if (i20 < 0) {
                                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.write();
                            }
                            if (i20 == 0) {
                                layoutNodeCompanionErrorMeasurePolicy1.add("");
                            } else {
                                layoutNodeCompanionErrorMeasurePolicy1.add(new String(bArr, iIntValue12, i20, getMinimumTouchTargetSizeMYxV2XQ.write));
                                iIntValue12 += i20;
                            }
                        }
                        return iIntValue12;
                    }
                    int iIntValue14 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i21 = isendboundary.IconCompatParcelizer;
                    if (i21 < 0) {
                        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.write();
                    }
                    if (i21 == 0) {
                        layoutNodeCompanionErrorMeasurePolicy1.add("");
                    } else {
                        int i22 = iIntValue14 + i21;
                        if (getNextChildPlaceOrderui.RemoteActionCompatParcelizer.write(bArr, iIntValue14, i22)) {
                            layoutNodeCompanionErrorMeasurePolicy1.add(new String(bArr, iIntValue14, i21, getMinimumTouchTargetSizeMYxV2XQ.write));
                            iIntValue14 = i22;
                        } else {
                            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                        }
                    }
                    while (iIntValue14 < i2) {
                        int iIntValue15 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue14), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                        if (i3 != isendboundary.IconCompatParcelizer) {
                            return iIntValue14;
                        }
                        iIntValue14 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue15), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                        int i23 = isendboundary.IconCompatParcelizer;
                        if (i23 < 0) {
                            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.write();
                        }
                        if (i23 == 0) {
                            layoutNodeCompanionErrorMeasurePolicy1.add("");
                        } else {
                            int i24 = iIntValue14 + i23;
                            if (getNextChildPlaceOrderui.RemoteActionCompatParcelizer.write(bArr, iIntValue14, i24)) {
                                layoutNodeCompanionErrorMeasurePolicy1.add(new String(bArr, iIntValue14, i23, getMinimumTouchTargetSizeMYxV2XQ.write));
                                iIntValue14 = i24;
                            } else {
                                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                            }
                        }
                    }
                    return iIntValue14;
                }
                return iIntValue2;
            case 27:
                if (i5 == 2) {
                    return TuplesKt.serializer(RemoteActionCompatParcelizer(i6), i3, bArr, i, i2, layoutNodeCompanionErrorMeasurePolicy1, isendboundary);
                }
                return iIntValue2;
            case 28:
                if (i5 == 2) {
                    int iIntValue16 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i25 = isendboundary.IconCompatParcelizer;
                    if (i25 >= 0) {
                        if (i25 > bArr.length - iIntValue16) {
                            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                        }
                        if (i25 == 0) {
                            layoutNodeCompanionErrorMeasurePolicy1.add(setOnAttachui.IconCompatParcelizer);
                        } else {
                            layoutNodeCompanionErrorMeasurePolicy1.add(setOnAttachui.RemoteActionCompatParcelizer(bArr, iIntValue16, i25));
                            iIntValue16 += i25;
                        }
                        while (iIntValue16 < i2) {
                            int iIntValue17 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue16), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                            if (i3 != isendboundary.IconCompatParcelizer) {
                                return iIntValue16;
                            }
                            iIntValue16 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue17), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                            int i26 = isendboundary.IconCompatParcelizer;
                            if (i26 >= 0) {
                                if (i26 > bArr.length - iIntValue16) {
                                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                                }
                                if (i26 == 0) {
                                    layoutNodeCompanionErrorMeasurePolicy1.add(setOnAttachui.IconCompatParcelizer);
                                } else {
                                    layoutNodeCompanionErrorMeasurePolicy1.add(setOnAttachui.RemoteActionCompatParcelizer(bArr, iIntValue16, i26));
                                    iIntValue16 += i26;
                                }
                            } else {
                                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.write();
                            }
                        }
                        return iIntValue16;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.write();
                }
                return iIntValue2;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iIntValue = ((Integer) TuplesKt.RemoteActionCompatParcelizer(276612930, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{Integer.valueOf(i3), bArr, Integer.valueOf(i), Integer.valueOf(i2), layoutNodeCompanionErrorMeasurePolicy1, isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -276612922)).intValue();
                    }
                    return iIntValue2;
                }
                getLongPressTimeoutMillis getlongpresstimeoutmillis4 = (getLongPressTimeoutMillis) layoutNodeCompanionErrorMeasurePolicy1;
                iIntValue = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                int i27 = isendboundary.IconCompatParcelizer + iIntValue;
                while (iIntValue < i27) {
                    iIntValue = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    getlongpresstimeoutmillis4.serializer(isendboundary.IconCompatParcelizer);
                }
                if (iIntValue != i27) {
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(obj, i4, layoutNodeCompanionErrorMeasurePolicy1, serializer(i6), null, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                return iIntValue;
            case 33:
            case 47:
                if (i5 == 2) {
                    getLongPressTimeoutMillis getlongpresstimeoutmillis5 = (getLongPressTimeoutMillis) layoutNodeCompanionErrorMeasurePolicy1;
                    int iIntValue18 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i28 = isendboundary.IconCompatParcelizer + iIntValue18;
                    while (iIntValue18 < i28) {
                        iIntValue18 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue18), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                        getlongpresstimeoutmillis5.serializer(setOuterToInnerOffsetDirtyui.read(isendboundary.IconCompatParcelizer));
                    }
                    if (iIntValue18 == i28) {
                        return iIntValue18;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (i5 == 0) {
                    getLongPressTimeoutMillis getlongpresstimeoutmillis6 = (getLongPressTimeoutMillis) layoutNodeCompanionErrorMeasurePolicy1;
                    int iIntValue19 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    getlongpresstimeoutmillis6.serializer(setOuterToInnerOffsetDirtyui.read(isendboundary.IconCompatParcelizer));
                    while (iIntValue19 < i2) {
                        int iIntValue20 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue19), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                        if (i3 != isendboundary.IconCompatParcelizer) {
                            return iIntValue19;
                        }
                        iIntValue19 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iIntValue20), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                        getlongpresstimeoutmillis6.serializer(setOuterToInnerOffsetDirtyui.read(isendboundary.IconCompatParcelizer));
                    }
                    return iIntValue19;
                }
                return iIntValue2;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                if (i5 == 2) {
                    accessgetDrawNodep accessgetdrawnodep5 = (accessgetDrawNodep) layoutNodeCompanionErrorMeasurePolicy1;
                    int iIntValue21 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i29 = isendboundary.IconCompatParcelizer + iIntValue21;
                    while (iIntValue21 < i29) {
                        iIntValue21 = TuplesKt.write(bArr, iIntValue21, isendboundary);
                        accessgetdrawnodep5.serializer(setOuterToInnerOffsetDirtyui.IconCompatParcelizer(isendboundary.read));
                    }
                    if (iIntValue21 == i29) {
                        return iIntValue21;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (i5 == 0) {
                    accessgetDrawNodep accessgetdrawnodep6 = (accessgetDrawNodep) layoutNodeCompanionErrorMeasurePolicy1;
                    int iWrite3 = TuplesKt.write(bArr, iIntValue2, isendboundary);
                    accessgetdrawnodep6.serializer(setOuterToInnerOffsetDirtyui.IconCompatParcelizer(isendboundary.read));
                    while (iWrite3 < i2) {
                        int iIntValue22 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iWrite3), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                        if (i3 != isendboundary.IconCompatParcelizer) {
                            return iWrite3;
                        }
                        iWrite3 = TuplesKt.write(bArr, iIntValue22, isendboundary);
                        accessgetdrawnodep6.serializer(setOuterToInnerOffsetDirtyui.IconCompatParcelizer(isendboundary.read));
                    }
                    return iWrite3;
                }
                return iIntValue2;
            case 49:
                if (i5 == 3) {
                    getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i6);
                    int i30 = (i3 & (-8)) | 4;
                    Object objSerializer = getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer();
                    LayoutNodeKt layoutNodeKt = (LayoutNodeKt) getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer;
                    int iRemoteActionCompatParcelizer = layoutNodeKt.RemoteActionCompatParcelizer(objSerializer, bArr, i, i2, i30, isendboundary);
                    isendboundary.write = objSerializer;
                    getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.write(objSerializer);
                    isendboundary.write = objSerializer;
                    layoutNodeCompanionErrorMeasurePolicy1.add(objSerializer);
                    while (iRemoteActionCompatParcelizer < i2) {
                        int iIntValue23 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iRemoteActionCompatParcelizer), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                        if (i3 != isendboundary.IconCompatParcelizer) {
                            return iRemoteActionCompatParcelizer;
                        }
                        Object objSerializer2 = getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.serializer();
                        int iRemoteActionCompatParcelizer2 = layoutNodeKt.RemoteActionCompatParcelizer(objSerializer2, bArr, iIntValue23, i2, i30, isendboundary);
                        isendboundary.write = objSerializer2;
                        getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.write(objSerializer2);
                        isendboundary.write = objSerializer2;
                        layoutNodeCompanionErrorMeasurePolicy1.add(objSerializer2);
                        iRemoteActionCompatParcelizer = iRemoteActionCompatParcelizer2;
                    }
                    return iRemoteActionCompatParcelizer;
                }
                return iIntValue2;
            default:
                return iIntValue2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x067d A[Catch: all -> 0x065c, TryCatch #8 {all -> 0x065c, blocks: (B:34:0x007a, B:143:0x065e, B:150:0x0678, B:152:0x067d, B:153:0x0682, B:42:0x00d0, B:43:0x00e5, B:44:0x0100, B:46:0x0112, B:49:0x0119, B:50:0x011f, B:51:0x012e, B:52:0x0149, B:53:0x015a, B:54:0x0172, B:55:0x017c, B:56:0x0197, B:57:0x01b2, B:58:0x01cc, B:59:0x01e6, B:60:0x0200, B:61:0x021a, B:62:0x0234, B:64:0x024f, B:66:0x0259, B:117:0x0497, B:118:0x04ac, B:119:0x04c5, B:120:0x04de, B:121:0x04f6, B:122:0x050f, B:124:0x0522, B:127:0x0529, B:128:0x052f, B:129:0x053b, B:130:0x0554, B:131:0x0567, B:132:0x0580, B:133:0x058b, B:134:0x05a6, B:135:0x05bf, B:136:0x05d7, B:137:0x05f0, B:138:0x0609, B:139:0x0622, B:140:0x063d), top: B:179:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:157:0x068c A[LOOP:2: B:156:0x068a->B:157:0x068c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x0696  */
    /* JADX WARN: Code duplicated, block: B:167:0x06a9 A[LOOP:3: B:166:0x06a7->B:167:0x06a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:194:0x0688 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    @Override // o.getCoordinatesAccessedDuringPlacement
    public final void write(Object obj, com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader codedInputStreamReader, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) throws Throwable {
        int i;
        int i2;
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacement;
        GeneratedMessageLite generatedMessageLite;
        int i3;
        Object obj2;
        getnotplacedplaceorderuiannotations.getClass();
        read(obj);
        com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema unknownFieldSchema = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int[] iArr = this.RatingCompat;
        int i4 = this.MediaSessionCompatToken;
        int i5 = this.read;
        Object objIconCompatParcelizer = null;
        while (true) {
            try {
                int i6 = codedInputStreamReader.read();
                int iWrite = (i6 < this.ParcelableVolumeInfo || i6 > this.MediaMetadataCompat) ? -1 : write(i6, 0);
                if (iWrite >= 0) {
                    int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(iWrite);
                    try {
                        int iIconCompatParcelizer = IconCompatParcelizer(iMediaBrowserCompatMediaItem);
                        LayoutNodeUsageByParent layoutNodeUsageByParent = this.MediaBrowserCompatMediaItem;
                        switch (iIconCompatParcelizer) {
                            case 0:
                                i = i5;
                                long jWrite = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(1);
                                getLastLookaheadConstraintsDWUhwKw.read.write(obj, jWrite, codedInputStreamReader.read.IconCompatParcelizer());
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 1:
                                i = i5;
                                long jWrite2 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(5);
                                getLastLookaheadConstraintsDWUhwKw.read.serializer(obj, jWrite2, codedInputStreamReader.read.MediaMetadataCompat());
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 2:
                                i = i5;
                                long jWrite3 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(obj, jWrite3, codedInputStreamReader.read.ParcelableVolumeInfo());
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 3:
                                i = i5;
                                long jWrite4 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(obj, jWrite4, codedInputStreamReader.read.ResultReceiver());
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 4:
                                i = i5;
                                long jWrite5 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(jWrite5, codedInputStreamReader.read.MediaDescriptionCompat(), obj);
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 5:
                                i = i5;
                                long jWrite6 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(1);
                                getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(obj, jWrite6, codedInputStreamReader.read.MediaSessionCompatQueueItem());
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 6:
                                i = i5;
                                long jWrite7 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(5);
                                getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(jWrite7, codedInputStreamReader.read.RatingCompat(), obj);
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 7:
                                i = i5;
                                long jWrite8 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.read.IconCompatParcelizer(obj, jWrite8, codedInputStreamReader.read.read());
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 8:
                                i = i5;
                                serializer(obj, iMediaBrowserCompatMediaItem, codedInputStreamReader);
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 9:
                                i = i5;
                                setInteropViewFactoryHolderui setinteropviewfactoryholderui = (setInteropViewFactoryHolderui) serializer(iWrite, obj);
                                getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iWrite);
                                codedInputStreamReader.IconCompatParcelizer(2);
                                codedInputStreamReader.IconCompatParcelizer(setinteropviewfactoryholderui, getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer, getnotplacedplaceorderuiannotations);
                                read(obj, iWrite, setinteropviewfactoryholderui);
                                i5 = i;
                                break;
                            case 10:
                                i = i5;
                                getLastLookaheadConstraintsDWUhwKw.write(write(iMediaBrowserCompatMediaItem), obj, codedInputStreamReader.IconCompatParcelizer());
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 11:
                                i = i5;
                                long jWrite9 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(jWrite9, codedInputStreamReader.read.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), obj);
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 12:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(0);
                                int iMediaBrowserCompatMediaItem2 = codedInputStreamReader.read.MediaBrowserCompatMediaItem();
                                getDoubleTapTimeoutMillis getdoubletaptimeoutmillisSerializer = serializer(iWrite);
                                if (getdoubletaptimeoutmillisSerializer != null && !getdoubletaptimeoutmillisSerializer.read(iMediaBrowserCompatMediaItem2)) {
                                    objIconCompatParcelizer = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(obj, i6, iMediaBrowserCompatMediaItem2, objIconCompatParcelizer, unknownFieldSchema);
                                } else {
                                    getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), iMediaBrowserCompatMediaItem2, obj);
                                    write(iWrite, obj);
                                }
                                i5 = i;
                                break;
                            case 13:
                                i = i5;
                                long jWrite10 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(5);
                                getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(jWrite10, codedInputStreamReader.read.PlaybackStateCompatCustomAction(), obj);
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 14:
                                i = i5;
                                long jWrite11 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(1);
                                getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(obj, jWrite11, codedInputStreamReader.read.PlaybackStateCompat());
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 15:
                                i = i5;
                                long jWrite12 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(jWrite12, codedInputStreamReader.read.MediaSessionCompatToken(), obj);
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 16:
                                i = i5;
                                long jWrite13 = write(iMediaBrowserCompatMediaItem);
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(obj, jWrite13, codedInputStreamReader.read.MediaSessionCompatResultReceiverWrapper());
                                write(iWrite, obj);
                                i5 = i;
                                break;
                            case 17:
                                i = i5;
                                setInteropViewFactoryHolderui setinteropviewfactoryholderui2 = (setInteropViewFactoryHolderui) serializer(iWrite, obj);
                                getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(iWrite);
                                codedInputStreamReader.IconCompatParcelizer(3);
                                codedInputStreamReader.write(setinteropviewfactoryholderui2, getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer2, getnotplacedplaceorderuiannotations);
                                read(obj, iWrite, setinteropviewfactoryholderui2);
                                i5 = i;
                                break;
                            case 18:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.write(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 19:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaSessionCompatQueueItem(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 20:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaDescriptionCompat(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 21:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaSessionCompatResultReceiverWrapper(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 22:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaMetadataCompat(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 23:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaBrowserCompatMediaItem(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 24:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.RemoteActionCompatParcelizer(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 25:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.serializer(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 26:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                read(obj, iMediaBrowserCompatMediaItem, codedInputStreamReader);
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 27:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                try {
                                    read(obj, iMediaBrowserCompatMediaItem, codedInputStreamReader, RemoteActionCompatParcelizer(iWrite), getnotplacedplaceorderuiannotations);
                                    objIconCompatParcelizer = obj2;
                                    i5 = i;
                                } catch (Throwable th) {
                                    th = th;
                                    objIconCompatParcelizer = obj2;
                                    for (i2 = i; i2 < i4; i2++) {
                                        RemoteActionCompatParcelizer(obj, iArr[i2], objIconCompatParcelizer);
                                    }
                                    if (objIconCompatParcelizer != null) {
                                        ((getHeightui) unknownFieldSchema).getClass();
                                        ((GeneratedMessageLite) obj).IconCompatParcelizer = (getCoordinatesAccessedDuringModifierPlacement) objIconCompatParcelizer;
                                    }
                                    throw th;
                                }
                                break;
                            case 28:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 29:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.PlaybackStateCompat(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 30:
                                i = i5;
                                List listRemoteActionCompatParcelizer = layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj);
                                codedInputStreamReader.read(listRemoteActionCompatParcelizer);
                                objIconCompatParcelizer = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(obj, i6, listRemoteActionCompatParcelizer, serializer(iWrite), objIconCompatParcelizer, unknownFieldSchema);
                                i5 = i;
                                break;
                            case 31:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.RatingCompat(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 32:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaSessionCompatToken(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 33:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.PlaybackStateCompatCustomAction(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.ParcelableVolumeInfo(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 35:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.write(layoutNodeUsageByParent.RemoteActionCompatParcelizer(write(iMediaBrowserCompatMediaItem), obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaSessionCompatQueueItem(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 37:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaDescriptionCompat(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 38:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaSessionCompatResultReceiverWrapper(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaMetadataCompat(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 40:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaBrowserCompatMediaItem(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.RemoteActionCompatParcelizer(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.serializer(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 43:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.PlaybackStateCompat(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 44:
                                i = i5;
                                List listRemoteActionCompatParcelizer2 = layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj);
                                codedInputStreamReader.read(listRemoteActionCompatParcelizer2);
                                objIconCompatParcelizer = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(obj, i6, listRemoteActionCompatParcelizer2, serializer(iWrite), objIconCompatParcelizer, unknownFieldSchema);
                                i5 = i;
                                break;
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.RatingCompat(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 46:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.MediaSessionCompatToken(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 47:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.PlaybackStateCompatCustomAction(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                                obj2 = objIconCompatParcelizer;
                                i = i5;
                                codedInputStreamReader.ParcelableVolumeInfo(layoutNodeUsageByParent.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                objIconCompatParcelizer = obj2;
                                i5 = i;
                                break;
                            case 49:
                                i = i5;
                                try {
                                    obj2 = objIconCompatParcelizer;
                                    try {
                                        try {
                                            read(obj, iMediaBrowserCompatMediaItem & 1048575, codedInputStreamReader, RemoteActionCompatParcelizer(iWrite), getnotplacedplaceorderuiannotations);
                                            objIconCompatParcelizer = obj2;
                                        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                            objIconCompatParcelizer = obj2;
                                            unknownFieldSchema.getClass();
                                            if (objIconCompatParcelizer == null) {
                                                objIconCompatParcelizer = unknownFieldSchema.read(obj);
                                            }
                                            if (!unknownFieldSchema.read(objIconCompatParcelizer, codedInputStreamReader)) {
                                                for (i3 = i; i3 < i4; i3++) {
                                                    RemoteActionCompatParcelizer(obj, iArr[i3], objIconCompatParcelizer);
                                                }
                                                if (objIconCompatParcelizer != null) {
                                                    getcoordinatesaccessedduringmodifierplacement = (getCoordinatesAccessedDuringModifierPlacement) objIconCompatParcelizer;
                                                    generatedMessageLite = (GeneratedMessageLite) obj;
                                                    generatedMessageLite.IconCompatParcelizer = getcoordinatesaccessedduringmodifierplacement;
                                                }
                                                return;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        objIconCompatParcelizer = obj2;
                                        while (i2 < i4) {
                                            RemoteActionCompatParcelizer(obj, iArr[i2], objIconCompatParcelizer);
                                        }
                                        if (objIconCompatParcelizer != null) {
                                            ((getHeightui) unknownFieldSchema).getClass();
                                            ((GeneratedMessageLite) obj).IconCompatParcelizer = (getCoordinatesAccessedDuringModifierPlacement) objIconCompatParcelizer;
                                        }
                                        throw th;
                                    }
                                } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = objIconCompatParcelizer;
                                }
                                i5 = i;
                                break;
                            case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                                i = i5;
                                serializer(obj, iWrite, read(iWrite));
                                throw null;
                            case 51:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(1);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Double.valueOf(codedInputStreamReader.read.IconCompatParcelizer()));
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(5);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Float.valueOf(codedInputStreamReader.read.MediaMetadataCompat()));
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case 53:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Long.valueOf(codedInputStreamReader.read.ParcelableVolumeInfo()));
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case 54:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Long.valueOf(codedInputStreamReader.read.ResultReceiver()));
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case 55:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Integer.valueOf(codedInputStreamReader.read.MediaDescriptionCompat()));
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case 56:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(1);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Long.valueOf(codedInputStreamReader.read.MediaSessionCompatQueueItem()));
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case 57:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(5);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Integer.valueOf(codedInputStreamReader.read.RatingCompat()));
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case 58:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Boolean.valueOf(codedInputStreamReader.read.read()));
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case 59:
                                i = i5;
                                serializer(obj, iMediaBrowserCompatMediaItem, codedInputStreamReader);
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case 60:
                                i = i5;
                                setInteropViewFactoryHolderui setinteropviewfactoryholderui3 = (setInteropViewFactoryHolderui) serializer(i6, iWrite, obj);
                                getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(iWrite);
                                codedInputStreamReader.IconCompatParcelizer(2);
                                codedInputStreamReader.IconCompatParcelizer(setinteropviewfactoryholderui3, getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer3, getnotplacedplaceorderuiannotations);
                                serializer(i6, iWrite, obj, setinteropviewfactoryholderui3);
                                i5 = i;
                                break;
                            case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                                i = i5;
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, codedInputStreamReader.IconCompatParcelizer());
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Integer.valueOf(codedInputStreamReader.read.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case 63:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(0);
                                int iMediaBrowserCompatMediaItem3 = codedInputStreamReader.read.MediaBrowserCompatMediaItem();
                                getDoubleTapTimeoutMillis getdoubletaptimeoutmillisSerializer2 = serializer(iWrite);
                                if (getdoubletaptimeoutmillisSerializer2 != null && !getdoubletaptimeoutmillisSerializer2.read(iMediaBrowserCompatMediaItem3)) {
                                    objIconCompatParcelizer = getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer(obj, i6, iMediaBrowserCompatMediaItem3, objIconCompatParcelizer, unknownFieldSchema);
                                } else {
                                    getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Integer.valueOf(iMediaBrowserCompatMediaItem3));
                                    write(i6, iWrite, obj);
                                }
                                i5 = i;
                                break;
                            case 64:
                                i = i5;
                                codedInputStreamReader.IconCompatParcelizer(5);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Integer.valueOf(codedInputStreamReader.read.PlaybackStateCompatCustomAction()));
                                write(i6, iWrite, obj);
                                i5 = i;
                                break;
                            case 65:
                                i = i5;
                                long j = iMediaBrowserCompatMediaItem & 1048575;
                                try {
                                    codedInputStreamReader.IconCompatParcelizer(1);
                                    getLastLookaheadConstraintsDWUhwKw.write(j, obj, Long.valueOf(codedInputStreamReader.read.PlaybackStateCompat()));
                                    write(i6, iWrite, obj);
                                } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    unknownFieldSchema.getClass();
                                    if (objIconCompatParcelizer == null) {
                                        objIconCompatParcelizer = unknownFieldSchema.read(obj);
                                    }
                                    if (!unknownFieldSchema.read(objIconCompatParcelizer, codedInputStreamReader)) {
                                        while (i3 < i4) {
                                            RemoteActionCompatParcelizer(obj, iArr[i3], objIconCompatParcelizer);
                                        }
                                        if (objIconCompatParcelizer != null) {
                                            getcoordinatesaccessedduringmodifierplacement = (getCoordinatesAccessedDuringModifierPlacement) objIconCompatParcelizer;
                                            generatedMessageLite = (GeneratedMessageLite) obj;
                                            generatedMessageLite.IconCompatParcelizer = getcoordinatesaccessedduringmodifierplacement;
                                        }
                                        return;
                                    }
                                }
                                i5 = i;
                                break;
                            case 66:
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Integer.valueOf(codedInputStreamReader.read.MediaSessionCompatToken()));
                                write(i6, iWrite, obj);
                                i = i5;
                                i5 = i;
                                break;
                            case 67:
                                codedInputStreamReader.IconCompatParcelizer(0);
                                getLastLookaheadConstraintsDWUhwKw.write(iMediaBrowserCompatMediaItem & 1048575, obj, Long.valueOf(codedInputStreamReader.read.MediaSessionCompatResultReceiverWrapper()));
                                write(i6, iWrite, obj);
                                i = i5;
                                i5 = i;
                                break;
                            case 68:
                                setInteropViewFactoryHolderui setinteropviewfactoryholderui4 = (setInteropViewFactoryHolderui) serializer(i6, iWrite, obj);
                                getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(iWrite);
                                codedInputStreamReader.IconCompatParcelizer(3);
                                codedInputStreamReader.write(setinteropviewfactoryholderui4, getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer4, getnotplacedplaceorderuiannotations);
                                serializer(i6, iWrite, obj, setinteropviewfactoryholderui4);
                                i = i5;
                                i5 = i;
                                break;
                            default:
                                i = i5;
                                if (objIconCompatParcelizer == null) {
                                    try {
                                        try {
                                            objIconCompatParcelizer = unknownFieldSchema.read(obj);
                                        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            unknownFieldSchema.getClass();
                                            if (objIconCompatParcelizer == null) {
                                                objIconCompatParcelizer = unknownFieldSchema.read(obj);
                                            }
                                            if (!unknownFieldSchema.read(objIconCompatParcelizer, codedInputStreamReader)) {
                                                while (i3 < i4) {
                                                    RemoteActionCompatParcelizer(obj, iArr[i3], objIconCompatParcelizer);
                                                }
                                                if (objIconCompatParcelizer != null) {
                                                    getcoordinatesaccessedduringmodifierplacement = (getCoordinatesAccessedDuringModifierPlacement) objIconCompatParcelizer;
                                                    generatedMessageLite = (GeneratedMessageLite) obj;
                                                    generatedMessageLite.IconCompatParcelizer = getcoordinatesaccessedduringmodifierplacement;
                                                }
                                                return;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        while (i2 < i4) {
                                            RemoteActionCompatParcelizer(obj, iArr[i2], objIconCompatParcelizer);
                                        }
                                        if (objIconCompatParcelizer != null) {
                                            ((getHeightui) unknownFieldSchema).getClass();
                                            ((GeneratedMessageLite) obj).IconCompatParcelizer = (getCoordinatesAccessedDuringModifierPlacement) objIconCompatParcelizer;
                                        }
                                        throw th;
                                    }
                                }
                                if (!unknownFieldSchema.read(objIconCompatParcelizer, codedInputStreamReader)) {
                                    for (int i7 = i; i7 < i4; i7++) {
                                        RemoteActionCompatParcelizer(obj, iArr[i7], objIconCompatParcelizer);
                                    }
                                    if (objIconCompatParcelizer == null) {
                                        return;
                                    }
                                }
                                i5 = i;
                                break;
                        }
                    } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                        i = i5;
                    }
                } else if (i6 == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        RemoteActionCompatParcelizer(obj, iArr[i5], objIconCompatParcelizer);
                        i5++;
                    }
                    if (objIconCompatParcelizer == null) {
                        return;
                    } else {
                        ((getHeightui) unknownFieldSchema).getClass();
                    }
                } else {
                    unknownFieldSchema.getClass();
                    if (objIconCompatParcelizer == null) {
                        objIconCompatParcelizer = unknownFieldSchema.read(obj);
                    }
                    if (!unknownFieldSchema.read(objIconCompatParcelizer, codedInputStreamReader)) {
                        while (i5 < i4) {
                            RemoteActionCompatParcelizer(obj, iArr[i5], objIconCompatParcelizer);
                            i5++;
                        }
                        if (objIconCompatParcelizer == null) {
                            return;
                        }
                    }
                }
                generatedMessageLite.IconCompatParcelizer = getcoordinatesaccessedduringmodifierplacement;
            } catch (Throwable th5) {
                th = th5;
                i = i5;
            }
        }
        getcoordinatesaccessedduringmodifierplacement = (getCoordinatesAccessedDuringModifierPlacement) objIconCompatParcelizer;
        generatedMessageLite = (GeneratedMessageLite) obj;
        generatedMessageLite.IconCompatParcelizer = getcoordinatesaccessedduringmodifierplacement;
    }

    public static void read(Object obj) {
        if (RemoteActionCompatParcelizer(obj)) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj, "Mutating immutable message: "));
    }

    public final void serializer(Object obj, int i, Object obj2) {
        long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i) & 1048575;
        Object objMediaSessionCompatQueueItem = getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(jMediaBrowserCompatMediaItem, obj);
        drawDirecteZhPAX0ui drawdirectezhpax0ui = this.MediaDescriptionCompat;
        if (objMediaSessionCompatQueueItem != null) {
            drawdirectezhpax0ui.getClass();
            if (!((draweZhPAX0ui) objMediaSessionCompatQueueItem).write()) {
                draweZhPAX0ui drawezhpax0uiRemoteActionCompatParcelizer = draweZhPAX0ui.serializer().RemoteActionCompatParcelizer();
                drawDirecteZhPAX0ui.RemoteActionCompatParcelizer(drawezhpax0uiRemoteActionCompatParcelizer, objMediaSessionCompatQueueItem);
                getLastLookaheadConstraintsDWUhwKw.write(jMediaBrowserCompatMediaItem, obj, drawezhpax0uiRemoteActionCompatParcelizer);
                objMediaSessionCompatQueueItem = drawezhpax0uiRemoteActionCompatParcelizer;
            }
        } else {
            drawdirectezhpax0ui.getClass();
            objMediaSessionCompatQueueItem = draweZhPAX0ui.serializer().RemoteActionCompatParcelizer();
            getLastLookaheadConstraintsDWUhwKw.write(jMediaBrowserCompatMediaItem, obj, objMediaSessionCompatQueueItem);
        }
        drawdirectezhpax0ui.getClass();
        m1$$ExternalSyntheticOutline0.m(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x04cd A[ADDED_TO_REGION] */
    public final int RemoteActionCompatParcelizer(Object obj, byte[] bArr, int i, int i2, int i3, isEndBoundary isendboundary) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        int i5;
        int iWrite;
        int i6;
        int i7;
        int iWrite2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        byte b;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        LayoutNodeKt layoutNodeKt = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        i2 = i2;
        i3 = i3;
        isEndBoundary isendboundary2 = isendboundary;
        read(obj);
        Unsafe unsafe2 = write;
        int iIconCompatParcelizer = i;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1048575;
        while (true) {
            if (iIconCompatParcelizer < i2) {
                int i29 = iIconCompatParcelizer + 1;
                byte b2 = bArr2[iIconCompatParcelizer];
                if (b2 < 0) {
                    iWrite = TuplesKt.write(b2, bArr2, i29, isendboundary2);
                    i5 = isendboundary2.IconCompatParcelizer;
                } else {
                    i5 = b2;
                    iWrite = i29;
                }
                i24 = i5 >>> 3;
                int i30 = i5 & 7;
                int i31 = layoutNodeKt.MediaMetadataCompat;
                int i32 = iWrite;
                int i33 = layoutNodeKt.ParcelableVolumeInfo;
                int i34 = i5;
                if (i24 > i24) {
                    int i35 = i25 / 3;
                    if (i24 < i33 || i24 > i31) {
                        i7 = -1;
                        iWrite2 = -1;
                    } else {
                        iWrite2 = layoutNodeKt.write(i24, i35);
                        i7 = -1;
                    }
                    i6 = 0;
                } else if (i24 < i33 || i24 > i31) {
                    i6 = 0;
                    i7 = -1;
                    iWrite2 = -1;
                } else {
                    i6 = 0;
                    iWrite2 = layoutNodeKt.write(i24, 0);
                    i7 = -1;
                }
                if (iWrite2 == i7) {
                    i8 = i27;
                    i9 = i28;
                    i10 = i6;
                    i11 = i24;
                    unsafe = unsafe2;
                    i4 = i3;
                    obj2 = obj3;
                    i12 = i32;
                } else {
                    int[] iArr = layoutNodeKt.serializer;
                    int i36 = iArr[iWrite2 + 1];
                    int iIconCompatParcelizer2 = IconCompatParcelizer(i36);
                    long j = i36 & 1048575;
                    if (iIconCompatParcelizer2 <= 17) {
                        int i37 = iArr[iWrite2 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i28) {
                            if (i28 != 1048575) {
                                unsafe2.putInt(obj3, i28, i27);
                            }
                            i9 = i39;
                            i8 = unsafe2.getInt(obj3, i39);
                        } else {
                            i8 = i27;
                            i9 = i28;
                        }
                        switch (iIconCompatParcelizer2) {
                            case 0:
                                i18 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 1) {
                                    getLastLookaheadConstraintsDWUhwKw.read.write(obj, j, Double.longBitsToDouble(TuplesKt.RemoteActionCompatParcelizer(i15, bArr2)));
                                    iIconCompatParcelizer = i15 + 8;
                                    i27 = i8 | i38;
                                    i3 = i3;
                                    i25 = i18;
                                    i26 = i16;
                                    i28 = i9;
                                } else {
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4 || i4 == 0) {
                                        iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                        i25 = i10;
                                        i27 = i8;
                                        i28 = i9;
                                        bArr2 = bArr;
                                        isendboundary2 = isendboundary;
                                        i3 = i4;
                                        i26 = i13;
                                        obj3 = obj2;
                                        i24 = i11;
                                        unsafe2 = unsafe;
                                        layoutNodeKt = this;
                                    } else {
                                        iIconCompatParcelizer = i12;
                                        i26 = i13;
                                        i27 = i8;
                                        i28 = i9;
                                    }
                                }
                                break;
                            case 1:
                                i18 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 5) {
                                    getLastLookaheadConstraintsDWUhwKw.read.serializer(obj3, j, Float.intBitsToFloat(TuplesKt.serializer(i15, bArr2)));
                                    iIconCompatParcelizer = i15 + 4;
                                    i19 = i8 | i38;
                                    i27 = i19;
                                    i3 = i3;
                                    i25 = i18;
                                    i26 = i16;
                                    i28 = i9;
                                } else {
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 2:
                            case 3:
                                i18 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 0) {
                                    int iWrite3 = TuplesKt.write(bArr2, i15, isendboundary2);
                                    unsafe2.putLong(obj, j, isendboundary2.read);
                                    i19 = i8 | i38;
                                    iIconCompatParcelizer = iWrite3;
                                    i27 = i19;
                                    i3 = i3;
                                    i25 = i18;
                                    i26 = i16;
                                    i28 = i9;
                                } else {
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 4:
                            case 11:
                                i18 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 0) {
                                    iIconCompatParcelizer = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr2, Integer.valueOf(i15), isendboundary2}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                                    unsafe2.putInt(obj3, j, isendboundary2.IconCompatParcelizer);
                                    i19 = i8 | i38;
                                    i27 = i19;
                                    i3 = i3;
                                    i25 = i18;
                                    i26 = i16;
                                    i28 = i9;
                                } else {
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 5:
                            case 14:
                                i14 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 1) {
                                    unsafe2.putLong(obj, j, TuplesKt.RemoteActionCompatParcelizer(i15, bArr2));
                                    iIconCompatParcelizer = i15 + 8;
                                    i18 = i14;
                                    i19 = i8 | i38;
                                    i27 = i19;
                                    i3 = i3;
                                    i25 = i18;
                                    i26 = i16;
                                    i28 = i9;
                                } else {
                                    i18 = i14;
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 6:
                            case 13:
                                i14 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 5) {
                                    unsafe2.putInt(obj3, j, TuplesKt.serializer(i15, bArr2));
                                    iIconCompatParcelizer = i15 + 4;
                                    i19 = i8 | i38;
                                    i18 = i14;
                                    i27 = i19;
                                    i3 = i3;
                                    i25 = i18;
                                    i26 = i16;
                                    i28 = i9;
                                } else {
                                    i18 = i14;
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 7:
                                i14 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 0) {
                                    iIconCompatParcelizer = TuplesKt.write(bArr2, i15, isendboundary2);
                                    getLastLookaheadConstraintsDWUhwKw.read.IconCompatParcelizer(obj3, j, isendboundary2.read != 0);
                                    i17 = i8 | i38;
                                    i3 = i3;
                                    i25 = i14;
                                    i26 = i16;
                                    i28 = i9;
                                    i27 = i17;
                                    i24 = i24;
                                } else {
                                    i18 = i14;
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 8:
                                i14 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 2) {
                                    if ((536870912 & i36) == 0) {
                                        iIconCompatParcelizer = TuplesKt.serializer(bArr2, i15, isendboundary2);
                                    } else {
                                        iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(bArr2, i15, isendboundary2);
                                    }
                                    unsafe2.putObject(obj3, j, isendboundary2.write);
                                    i17 = i8 | i38;
                                    i3 = i3;
                                    i25 = i14;
                                    i26 = i16;
                                    i28 = i9;
                                    i27 = i17;
                                    i24 = i24;
                                } else {
                                    i18 = i14;
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i20 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                if (i30 == 2) {
                                    Object objSerializer = layoutNodeKt.serializer(i20, obj3);
                                    iIconCompatParcelizer = TuplesKt.RemoteActionCompatParcelizer(objSerializer, layoutNodeKt.RemoteActionCompatParcelizer(i20), bArr, i15, i2, isendboundary);
                                    layoutNodeKt.read(obj3, i20, objSerializer);
                                    i27 = i8 | i38;
                                    i18 = i20;
                                    i3 = i3;
                                    i25 = i18;
                                    i26 = i16;
                                    i28 = i9;
                                } else {
                                    i14 = i20;
                                    i18 = i14;
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 10:
                                i20 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 2) {
                                    iIconCompatParcelizer = ((Integer) TuplesKt.RemoteActionCompatParcelizer(622484807, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr2, Integer.valueOf(i15), isendboundary2}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -622484800)).intValue();
                                    unsafe2.putObject(obj3, j, isendboundary2.write);
                                    i27 = i8 | i38;
                                    i18 = i20;
                                    i3 = i3;
                                    i25 = i18;
                                    i26 = i16;
                                    i28 = i9;
                                } else {
                                    i14 = i20;
                                    i18 = i14;
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 12:
                                i20 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 0) {
                                    iIconCompatParcelizer = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr2, Integer.valueOf(i15), isendboundary2}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                                    int i40 = isendboundary2.IconCompatParcelizer;
                                    getDoubleTapTimeoutMillis getdoubletaptimeoutmillisSerializer = layoutNodeKt.serializer(i20);
                                    if (getdoubletaptimeoutmillisSerializer != null && !getdoubletaptimeoutmillisSerializer.read(i40)) {
                                        serializer(obj).serializer(i16, Long.valueOf(i40));
                                        i25 = i20;
                                        i26 = i16;
                                        i27 = i8;
                                        i28 = i9;
                                    } else {
                                        unsafe2.putInt(obj3, j, i40);
                                        i27 = i8 | i38;
                                        i18 = i20;
                                        i3 = i3;
                                        i25 = i18;
                                        i26 = i16;
                                        i28 = i9;
                                    }
                                } else {
                                    i14 = i20;
                                    i18 = i14;
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 15:
                                i20 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                bArr2 = bArr;
                                if (i30 == 0) {
                                    iIconCompatParcelizer = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr2, Integer.valueOf(i15), isendboundary2}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                                    unsafe2.putInt(obj3, j, setOuterToInnerOffsetDirtyui.read(isendboundary2.IconCompatParcelizer));
                                    i27 = i8 | i38;
                                    i18 = i20;
                                    i3 = i3;
                                    i25 = i18;
                                    i26 = i16;
                                    i28 = i9;
                                } else {
                                    i14 = i20;
                                    i18 = i14;
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 16:
                                i20 = iWrite2;
                                i15 = i32;
                                b = -1;
                                if (i30 == 0) {
                                    bArr2 = bArr;
                                    int iWrite4 = TuplesKt.write(bArr2, i15, isendboundary2);
                                    unsafe2.putLong(obj, j, setOuterToInnerOffsetDirtyui.IconCompatParcelizer(isendboundary2.read));
                                    i27 = i8 | i38;
                                    iIconCompatParcelizer = iWrite4;
                                    i24 = i24;
                                    i25 = i20;
                                    i26 = i34;
                                    i28 = i9;
                                    i3 = i3;
                                } else {
                                    i16 = i34;
                                    i14 = i20;
                                    i18 = i14;
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            case 17:
                                if (i30 == 3) {
                                    int i41 = iWrite2;
                                    Object objSerializer2 = layoutNodeKt.serializer(i41, obj3);
                                    i16 = i34;
                                    iIconCompatParcelizer = ((LayoutNodeKt) layoutNodeKt.RemoteActionCompatParcelizer(i41)).RemoteActionCompatParcelizer(objSerializer2, bArr, i32, i2, (i24 << 3) | 4, isendboundary);
                                    isendboundary2.write = objSerializer2;
                                    layoutNodeKt.read(obj3, i41, objSerializer2);
                                    i17 = i8 | i38;
                                    i14 = i41;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    i25 = i14;
                                    i26 = i16;
                                    i28 = i9;
                                    i27 = i17;
                                    i24 = i24;
                                } else {
                                    i15 = i32;
                                    b = -1;
                                    i18 = iWrite2;
                                    i16 = i34;
                                    i10 = i18;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    obj2 = obj3;
                                    i4 = i3;
                                    i11 = i24;
                                    i13 = i16;
                                    if (i13 == i4) {
                                    }
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                    i25 = i10;
                                    i27 = i8;
                                    i28 = i9;
                                    bArr2 = bArr;
                                    isendboundary2 = isendboundary;
                                    i3 = i4;
                                    i26 = i13;
                                    obj3 = obj2;
                                    i24 = i11;
                                    unsafe2 = unsafe;
                                    layoutNodeKt = this;
                                }
                                break;
                            default:
                                i18 = iWrite2;
                                i15 = i32;
                                i16 = i34;
                                b = -1;
                                i10 = i18;
                                unsafe = unsafe2;
                                i12 = i15;
                                obj2 = obj3;
                                i4 = i3;
                                i11 = i24;
                                i13 = i16;
                                if (i13 == i4) {
                                }
                                iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                                i25 = i10;
                                i27 = i8;
                                i28 = i9;
                                bArr2 = bArr;
                                isendboundary2 = isendboundary;
                                i3 = i4;
                                i26 = i13;
                                obj3 = obj2;
                                i24 = i11;
                                unsafe2 = unsafe;
                                layoutNodeKt = this;
                                break;
                        }
                    } else {
                        int i42 = iWrite2;
                        i16 = i34;
                        bArr2 = bArr;
                        if (iIconCompatParcelizer2 != 27) {
                            i8 = i27;
                            i9 = i28;
                            if (iIconCompatParcelizer2 <= 49) {
                                i11 = i24;
                                unsafe = unsafe2;
                                i34 = i16;
                                iIconCompatParcelizer = IconCompatParcelizer(obj, bArr, i32, i2, i16, i24, i30, i42, i36, iIconCompatParcelizer2, j, isendboundary);
                                if (iIconCompatParcelizer != i32) {
                                    layoutNodeKt = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    i3 = i3;
                                    isendboundary2 = isendboundary;
                                    i24 = i11;
                                    i26 = i34;
                                    i25 = i42;
                                    i27 = i8;
                                    i28 = i9;
                                    unsafe2 = unsafe;
                                } else {
                                    obj2 = obj;
                                    i23 = i42;
                                }
                            } else {
                                i21 = i42;
                                i22 = i32;
                                unsafe = unsafe2;
                                i34 = i16;
                                i11 = i24;
                                if (iIconCompatParcelizer2 != 50) {
                                    obj2 = obj;
                                    i23 = i21;
                                    iIconCompatParcelizer = read(obj, bArr, i22, i2, i34, i11, i30, i36, iIconCompatParcelizer2, j, i21, isendboundary);
                                    if (iIconCompatParcelizer != i22) {
                                        i4 = i3;
                                        i25 = i23;
                                        i13 = i34;
                                    }
                                } else if (i30 == 2) {
                                    write(j, i21, obj);
                                    throw null;
                                }
                                i27 = i8;
                                i28 = i9;
                                bArr2 = bArr;
                                isendboundary2 = isendboundary;
                                i3 = i4;
                                i26 = i13;
                                obj3 = obj2;
                                i24 = i11;
                                unsafe2 = unsafe;
                                layoutNodeKt = this;
                            }
                            i4 = i3;
                            i12 = iIconCompatParcelizer;
                            i10 = i23;
                        } else if (i30 == 2) {
                            LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1 = (LayoutNodeCompanionErrorMeasurePolicy1) unsafe2.getObject(obj3, j);
                            if (!((setGloballyPositionedObservers) layoutNodeCompanionErrorMeasurePolicy1).IconCompatParcelizer) {
                                int size = layoutNodeCompanionErrorMeasurePolicy1.size();
                                layoutNodeCompanionErrorMeasurePolicy1 = layoutNodeCompanionErrorMeasurePolicy1.read(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, j, layoutNodeCompanionErrorMeasurePolicy1);
                            }
                            i8 = i27;
                            i9 = i28;
                            iIconCompatParcelizer = TuplesKt.serializer(layoutNodeKt.RemoteActionCompatParcelizer(i42), i16, bArr, i32, i2, layoutNodeCompanionErrorMeasurePolicy1, isendboundary);
                            i25 = i42;
                            i26 = i16;
                            i27 = i8;
                            i28 = i9;
                        } else {
                            i8 = i27;
                            i9 = i28;
                            i21 = i42;
                            unsafe = unsafe2;
                            i34 = i16;
                            i22 = i32;
                            i11 = i24;
                        }
                        iIconCompatParcelizer = i22;
                        i23 = i21;
                        obj2 = obj;
                        i4 = i3;
                        i12 = iIconCompatParcelizer;
                        i10 = i23;
                    }
                }
                i13 = i34;
                if (i13 == i4) {
                }
                iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i13, bArr, i12, i2, serializer(obj), isendboundary);
                i25 = i10;
                i27 = i8;
                i28 = i9;
                bArr2 = bArr;
                isendboundary2 = isendboundary;
                i3 = i4;
                i26 = i13;
                obj3 = obj2;
                i24 = i11;
                unsafe2 = unsafe;
                layoutNodeKt = this;
            } else {
                unsafe = unsafe2;
                i4 = i3;
                obj2 = obj3;
            }
        }
        if (i28 != 1048575) {
            unsafe.putInt(obj2, i28, i27);
        }
        for (int i43 = this.read; i43 < this.MediaSessionCompatToken; i43++) {
            RemoteActionCompatParcelizer(obj2, this.RatingCompat[i43], null);
        }
        if (i4 == 0) {
            if (iIconCompatParcelizer != i2) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RatingCompat();
            }
        } else if (iIconCompatParcelizer > i2 || i26 != i4) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RatingCompat();
        }
        return iIconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00a2. Please report as an issue. */
    public final void RemoteActionCompatParcelizer(Object obj, byte[] bArr, int i, int i2, isEndBoundary isendboundary) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        int i3;
        int iWrite;
        int iWrite2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Unsafe unsafe;
        Object obj2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iIntValue;
        int iWrite3;
        LayoutNodeKt layoutNodeKt = this;
        Object obj3 = obj;
        bArr = bArr;
        i2 = i2;
        isendboundary = isendboundary;
        read(obj);
        Unsafe unsafe2 = write;
        int i18 = 0;
        int iIconCompatParcelizer = i;
        int i19 = 0;
        int i20 = 0;
        int i21 = -1;
        int i22 = 1048575;
        while (iIconCompatParcelizer < i2) {
            int i23 = iIconCompatParcelizer + 1;
            byte b = bArr[iIconCompatParcelizer];
            if (b < 0) {
                iWrite = TuplesKt.write(b, bArr, i23, isendboundary);
                i3 = isendboundary.IconCompatParcelizer;
            } else {
                i3 = b;
                iWrite = i23;
            }
            int i24 = i3 >>> 3;
            int i25 = i3 & 7;
            int i26 = layoutNodeKt.MediaMetadataCompat;
            int i27 = layoutNodeKt.ParcelableVolumeInfo;
            if (i24 > i21) {
                int i28 = i19 / 3;
                if (i24 < i27 || i24 > i26) {
                    i4 = -1;
                    i5 = -1;
                } else {
                    iWrite2 = layoutNodeKt.write(i24, i28);
                    i5 = iWrite2;
                    i4 = -1;
                }
            } else if (i24 < i27 || i24 > i26) {
                i4 = -1;
                i5 = -1;
            } else {
                iWrite2 = layoutNodeKt.write(i24, i18);
                i5 = iWrite2;
                i4 = -1;
            }
            if (i5 == i4) {
                i6 = i24;
                i7 = iWrite;
                i8 = i20;
                i5 = i18;
                i9 = i5;
                unsafe = unsafe2;
                obj2 = obj3;
            } else {
                int[] iArr = layoutNodeKt.serializer;
                int i29 = iArr[i5 + 1];
                int iIconCompatParcelizer2 = IconCompatParcelizer(i29);
                long j = i29 & 1048575;
                if (iIconCompatParcelizer2 <= 17) {
                    int i30 = iArr[i5 + 2];
                    int i31 = 1 << (i30 >>> 20);
                    int i32 = i30 & 1048575;
                    if (i32 != i22) {
                        if (i22 != 1048575) {
                            unsafe2.putInt(obj3, i22, i20);
                            i15 = 1048575;
                        } else {
                            i15 = 1048575;
                        }
                        if (i32 != i15) {
                            i20 = unsafe2.getInt(obj3, i32);
                        }
                        i16 = i32;
                    } else {
                        i15 = 1048575;
                        i16 = i22;
                    }
                    int i33 = i20;
                    switch (iIconCompatParcelizer2) {
                        case 0:
                            i6 = i24;
                            i17 = iWrite;
                            if (i25 != 1) {
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                getLastLookaheadConstraintsDWUhwKw.read.write(obj, j, Double.longBitsToDouble(TuplesKt.RemoteActionCompatParcelizer(i17, bArr)));
                                iIntValue = i17 + 8;
                                i20 = i33 | i31;
                                iIconCompatParcelizer = iIntValue;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 1:
                            i6 = i24;
                            i17 = iWrite;
                            if (i25 != 5) {
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                getLastLookaheadConstraintsDWUhwKw.read.serializer(obj3, j, Float.intBitsToFloat(TuplesKt.serializer(i17, bArr)));
                                iIntValue = i17 + 4;
                                i20 = i33 | i31;
                                iIconCompatParcelizer = iIntValue;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 2:
                        case 3:
                            i6 = i24;
                            i17 = iWrite;
                            if (i25 != 0) {
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                iWrite3 = TuplesKt.write(bArr, i17, isendboundary);
                                unsafe2.putLong(obj, j, isendboundary.read);
                                i20 = i33 | i31;
                                iIconCompatParcelizer = iWrite3;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 4:
                        case 11:
                            i6 = i24;
                            i17 = iWrite;
                            if (i25 != 0) {
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                iIntValue = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i17), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                                unsafe2.putInt(obj3, j, isendboundary.IconCompatParcelizer);
                                i20 = i33 | i31;
                                iIconCompatParcelizer = iIntValue;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 5:
                        case 14:
                            i6 = i24;
                            if (i25 != 1) {
                                i17 = iWrite;
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                unsafe2.putLong(obj, j, TuplesKt.RemoteActionCompatParcelizer(iWrite, bArr));
                                iIntValue = iWrite + 8;
                                i20 = i33 | i31;
                                iIconCompatParcelizer = iIntValue;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 6:
                        case 13:
                            i6 = i24;
                            if (i25 != 5) {
                                i17 = iWrite;
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                unsafe2.putInt(obj3, j, TuplesKt.serializer(iWrite, bArr));
                                iIconCompatParcelizer = iWrite + 4;
                                i20 = i33 | i31;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 7:
                            i6 = i24;
                            if (i25 != 0) {
                                i17 = iWrite;
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                iIconCompatParcelizer = TuplesKt.write(bArr, iWrite, isendboundary);
                                getLastLookaheadConstraintsDWUhwKw.read.IconCompatParcelizer(obj3, j, isendboundary.read != 0);
                                i20 = i33 | i31;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 8:
                            i6 = i24;
                            if (i25 != 2) {
                                i17 = iWrite;
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                if ((i29 & 536870912) == 0) {
                                    iIconCompatParcelizer = TuplesKt.serializer(bArr, iWrite, isendboundary);
                                } else {
                                    iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(bArr, iWrite, isendboundary);
                                }
                                unsafe2.putObject(obj3, j, isendboundary.write);
                                i20 = i33 | i31;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 9:
                            i6 = i24;
                            if (i25 != 2) {
                                i17 = iWrite;
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                Object objSerializer = layoutNodeKt.serializer(i5, obj3);
                                iIconCompatParcelizer = TuplesKt.RemoteActionCompatParcelizer(objSerializer, layoutNodeKt.RemoteActionCompatParcelizer(i5), bArr, iWrite, i2, isendboundary);
                                layoutNodeKt.read(obj3, i5, objSerializer);
                                i20 = i33 | i31;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 10:
                            i6 = i24;
                            if (i25 != 2) {
                                i17 = iWrite;
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                iIconCompatParcelizer = ((Integer) TuplesKt.RemoteActionCompatParcelizer(622484807, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iWrite), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -622484800)).intValue();
                                unsafe2.putObject(obj3, j, isendboundary.write);
                                i20 = i33 | i31;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 12:
                            i6 = i24;
                            if (i25 != 0) {
                                i17 = iWrite;
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                iIconCompatParcelizer = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iWrite), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                                unsafe2.putInt(obj3, j, isendboundary.IconCompatParcelizer);
                                i20 = i33 | i31;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 15:
                            i6 = i24;
                            if (i25 != 0) {
                                i17 = iWrite;
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                iIconCompatParcelizer = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(iWrite), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                                unsafe2.putInt(obj3, j, setOuterToInnerOffsetDirtyui.read(isendboundary.IconCompatParcelizer));
                                i20 = i33 | i31;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        case 16:
                            if (i25 != 0) {
                                i6 = i24;
                                i17 = iWrite;
                                i8 = i33;
                                unsafe = unsafe2;
                                i7 = i17;
                                obj2 = obj3;
                                i22 = i16;
                                i9 = 0;
                            } else {
                                iWrite3 = TuplesKt.write(bArr, iWrite, isendboundary);
                                i6 = i24;
                                unsafe2.putLong(obj, j, setOuterToInnerOffsetDirtyui.IconCompatParcelizer(isendboundary.read));
                                i20 = i33 | i31;
                                iIconCompatParcelizer = iWrite3;
                                i2 = i2;
                                i19 = i5;
                                i22 = i16;
                                i21 = i6;
                                i18 = 0;
                            }
                            break;
                        default:
                            i6 = i24;
                            i17 = iWrite;
                            i8 = i33;
                            unsafe = unsafe2;
                            i7 = i17;
                            obj2 = obj3;
                            i22 = i16;
                            i9 = 0;
                            break;
                    }
                } else {
                    i6 = i24;
                    if (iIconCompatParcelizer2 == 27) {
                        if (i25 == 2) {
                            LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1 = (LayoutNodeCompanionErrorMeasurePolicy1) unsafe2.getObject(obj3, j);
                            if (!((setGloballyPositionedObservers) layoutNodeCompanionErrorMeasurePolicy1).IconCompatParcelizer) {
                                int size = layoutNodeCompanionErrorMeasurePolicy1.size();
                                layoutNodeCompanionErrorMeasurePolicy1 = layoutNodeCompanionErrorMeasurePolicy1.read(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, j, layoutNodeCompanionErrorMeasurePolicy1);
                            }
                            iIconCompatParcelizer = TuplesKt.serializer(layoutNodeKt.RemoteActionCompatParcelizer(i5), i3, bArr, iWrite, i2, layoutNodeCompanionErrorMeasurePolicy1, isendboundary);
                            i11 = i22;
                            i8 = i20;
                            unsafe = unsafe2;
                            i13 = i5;
                            obj2 = obj3;
                            i9 = 0;
                            obj3 = obj2;
                            i18 = i9;
                            i19 = i13;
                            i21 = i6;
                            i20 = i8;
                            i22 = i11;
                        } else {
                            i10 = iWrite;
                            i8 = i20;
                            i11 = i22;
                            unsafe = unsafe2;
                            i12 = i5;
                            i9 = 0;
                            i14 = i10;
                            i13 = i12;
                            obj2 = obj;
                            i7 = i14;
                            i5 = i13;
                            i22 = i11;
                        }
                    } else if (iIconCompatParcelizer2 <= 49) {
                        int i34 = iWrite;
                        i8 = i20;
                        i11 = i22;
                        i9 = 0;
                        unsafe = unsafe2;
                        int i35 = i5;
                        iIconCompatParcelizer = IconCompatParcelizer(obj, bArr, iWrite, i2, i3, i6, i25, i5, i29, iIconCompatParcelizer2, j, isendboundary);
                        if (iIconCompatParcelizer != i34) {
                            obj2 = obj;
                            i13 = i35;
                            obj3 = obj2;
                            i18 = i9;
                            i19 = i13;
                            i21 = i6;
                            i20 = i8;
                            i22 = i11;
                        } else {
                            obj2 = obj;
                            i14 = iIconCompatParcelizer;
                            i13 = i35;
                            i7 = i14;
                            i5 = i13;
                            i22 = i11;
                        }
                    } else {
                        i10 = iWrite;
                        i8 = i20;
                        i11 = i22;
                        unsafe = unsafe2;
                        i12 = i5;
                        i9 = 0;
                        if (iIconCompatParcelizer2 == 50) {
                            if (i25 == 2) {
                                write(j, i12, obj);
                                throw null;
                            }
                            i14 = i10;
                            i13 = i12;
                            obj2 = obj;
                        } else {
                            obj2 = obj;
                            i13 = i12;
                            iIconCompatParcelizer = read(obj, bArr, i10, i2, i3, i6, i25, i29, iIconCompatParcelizer2, j, i12, isendboundary);
                            if (iIconCompatParcelizer != i10) {
                                obj3 = obj2;
                                i18 = i9;
                                i19 = i13;
                                i21 = i6;
                                i20 = i8;
                                i22 = i11;
                            } else {
                                i14 = iIconCompatParcelizer;
                            }
                        }
                        i7 = i14;
                        i5 = i13;
                        i22 = i11;
                    }
                    unsafe2 = unsafe;
                    layoutNodeKt = this;
                }
            }
            iIconCompatParcelizer = TuplesKt.IconCompatParcelizer(i3, bArr, i7, i2, serializer(obj), isendboundary);
            i19 = i5;
            obj3 = obj2;
            i18 = i9;
            i21 = i6;
            i20 = i8;
            unsafe2 = unsafe;
            layoutNodeKt = this;
        }
        int i36 = i20;
        Unsafe unsafe3 = unsafe2;
        Object obj4 = obj3;
        if (i22 != 1048575) {
            unsafe3.putInt(obj4, i22, i36);
        }
        if (iIconCompatParcelizer != i2) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RatingCompat();
        }
    }

    public final int read(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, isEndBoundary isendboundary) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        Unsafe unsafe = write;
        long j2 = this.serializer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(TuplesKt.RemoteActionCompatParcelizer(i, bArr))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(TuplesKt.serializer(i, bArr))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iWrite = TuplesKt.write(bArr, i, isendboundary);
                unsafe.putObject(obj, j, Long.valueOf(isendboundary.read));
                unsafe.putInt(obj, j2, i4);
                return iWrite;
            case 55:
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                int iIntValue = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                unsafe.putObject(obj, j, Integer.valueOf(isendboundary.IconCompatParcelizer));
                unsafe.putInt(obj, j2, i4);
                return iIntValue;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(TuplesKt.RemoteActionCompatParcelizer(i, bArr)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(TuplesKt.serializer(i, bArr)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iWrite2 = TuplesKt.write(bArr, i, isendboundary);
                unsafe.putObject(obj, j, Boolean.valueOf(isendboundary.read != 0));
                unsafe.putInt(obj, j2, i4);
                return iWrite2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iIntValue2 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                int i10 = isendboundary.IconCompatParcelizer;
                if (i10 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !getNextChildPlaceOrderui.RemoteActionCompatParcelizer.write(bArr, iIntValue2, iIntValue2 + i10)) {
                        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iIntValue2, i10, getMinimumTouchTargetSizeMYxV2XQ.write));
                    iIntValue2 += i10;
                }
                unsafe.putInt(obj, j2, i4);
                return iIntValue2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objSerializer = serializer(i4, i8, obj);
                int iRemoteActionCompatParcelizer = TuplesKt.RemoteActionCompatParcelizer(objSerializer, RemoteActionCompatParcelizer(i8), bArr, i, i2, isendboundary);
                serializer(i4, i8, obj, objSerializer);
                return iRemoteActionCompatParcelizer;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                int iIntValue3 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(622484807, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -622484800)).intValue();
                unsafe.putObject(obj, j, isendboundary.write);
                unsafe.putInt(obj, j2, i4);
                return iIntValue3;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iIntValue4 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                int i11 = isendboundary.IconCompatParcelizer;
                getDoubleTapTimeoutMillis getdoubletaptimeoutmillisSerializer = serializer(i8);
                if (getdoubletaptimeoutmillisSerializer != null && !getdoubletaptimeoutmillisSerializer.read(i11)) {
                    serializer(obj).serializer(i3, Long.valueOf(i11));
                    return iIntValue4;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i11));
                unsafe.putInt(obj, j2, i4);
                return iIntValue4;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iIntValue5 = ((Integer) TuplesKt.RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{bArr, Integer.valueOf(i), isendboundary}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                unsafe.putObject(obj, j, Integer.valueOf(setOuterToInnerOffsetDirtyui.read(isendboundary.IconCompatParcelizer)));
                unsafe.putInt(obj, j2, i4);
                return iIntValue5;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iWrite3 = TuplesKt.write(bArr, i, isendboundary);
                unsafe.putObject(obj, j, Long.valueOf(setOuterToInnerOffsetDirtyui.IconCompatParcelizer(isendboundary.read)));
                unsafe.putInt(obj, j2, i4);
                return iWrite3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                Object objSerializer2 = serializer(i4, i8, obj);
                int iRemoteActionCompatParcelizer2 = ((LayoutNodeKt) RemoteActionCompatParcelizer(i8)).RemoteActionCompatParcelizer(objSerializer2, bArr, i, i2, (i3 & (-8)) | 4, isendboundary);
                isendboundary.write = objSerializer2;
                serializer(i4, i8, obj, objSerializer2);
                return iRemoteActionCompatParcelizer2;
            default:
                return i;
        }
    }

    public final void serializer(Object obj, int i, com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader codedInputStreamReader) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i) != 0) {
            codedInputStreamReader.IconCompatParcelizer(2);
            getLastLookaheadConstraintsDWUhwKw.write(i & 1048575, obj, codedInputStreamReader.read.ComponentActivity());
        } else if (this.MediaSessionCompatQueueItem) {
            codedInputStreamReader.IconCompatParcelizer(2);
            getLastLookaheadConstraintsDWUhwKw.write(i & 1048575, obj, codedInputStreamReader.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
        } else {
            getLastLookaheadConstraintsDWUhwKw.write(i & 1048575, obj, codedInputStreamReader.IconCompatParcelizer());
        }
    }

    public final void read(Object obj, int i, com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader codedInputStreamReader) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        boolean z = (536870912 & i) != 0;
        LayoutNodeUsageByParent layoutNodeUsageByParent = this.MediaBrowserCompatMediaItem;
        if (z) {
            codedInputStreamReader.write(layoutNodeUsageByParent.RemoteActionCompatParcelizer(i & 1048575, obj), true);
        } else {
            codedInputStreamReader.write(layoutNodeUsageByParent.RemoteActionCompatParcelizer(i & 1048575, obj), false);
        }
    }

    @Override // o.getCoordinatesAccessedDuringPlacement
    public final void serializer(Object obj, Object obj2) {
        read(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.serializer;
            if (i < iArr.length) {
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
                long j = 1048575 & iMediaBrowserCompatMediaItem;
                int i2 = iArr[i];
                switch (IconCompatParcelizer(iMediaBrowserCompatMediaItem)) {
                    case 0:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement = getLastLookaheadConstraintsDWUhwKw.read;
                            getlookaheadcoordinatesaccessedduringmodifierplacement.write(obj, j, getlookaheadcoordinatesaccessedduringmodifierplacement.serializer(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 1:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement2 = getLastLookaheadConstraintsDWUhwKw.read;
                            getlookaheadcoordinatesaccessedduringmodifierplacement2.serializer(obj, j, getlookaheadcoordinatesaccessedduringmodifierplacement2.write(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 2:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(obj, j, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 3:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(obj, j, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 4:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 5:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(obj, j, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 6:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 7:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement3 = getLastLookaheadConstraintsDWUhwKw.read;
                            getlookaheadcoordinatesaccessedduringmodifierplacement3.IconCompatParcelizer(obj, j, getlookaheadcoordinatesaccessedduringmodifierplacement3.read(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 8:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.write(j, obj, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 9:
                        write(obj, i, obj2);
                        break;
                    case 10:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.write(j, obj, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 11:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 12:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 13:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 14:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(obj, j, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, obj2));
                            write(i, obj);
                        }
                        break;
                    case 15:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j, getLastLookaheadConstraintsDWUhwKw.read.RemoteActionCompatParcelizer(j, obj2), obj);
                            write(i, obj);
                        }
                        break;
                    case 16:
                        if (IconCompatParcelizer(i, obj2)) {
                            getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(obj, j, getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(j, obj2));
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
                        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(j, obj, obj2);
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        Class cls = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
                        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement4 = getLastLookaheadConstraintsDWUhwKw.read;
                        Object objMediaSessionCompatQueueItem = getlookaheadcoordinatesaccessedduringmodifierplacement4.MediaSessionCompatQueueItem(j, obj);
                        Object objMediaSessionCompatQueueItem2 = getlookaheadcoordinatesaccessedduringmodifierplacement4.MediaSessionCompatQueueItem(j, obj2);
                        this.MediaDescriptionCompat.getClass();
                        getLastLookaheadConstraintsDWUhwKw.write(j, obj, drawDirecteZhPAX0ui.RemoteActionCompatParcelizer(objMediaSessionCompatQueueItem, objMediaSessionCompatQueueItem2));
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
                            getLastLookaheadConstraintsDWUhwKw.write(j, obj, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj2));
                            write(i2, i, obj);
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
                            getLastLookaheadConstraintsDWUhwKw.write(j, obj, getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj2));
                            write(i2, i, obj);
                        }
                        break;
                    case 68:
                        IconCompatParcelizer(obj, i, obj2);
                        break;
                }
                i += 3;
            } else {
                getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, obj, obj2);
                return;
            }
        }
    }

    @Override // o.getCoordinatesAccessedDuringPlacement
    public final void IconCompatParcelizer(Object obj, byte[] bArr, int i, int i2, isEndBoundary isendboundary) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        if (this.PlaybackStateCompatCustomAction) {
            RemoteActionCompatParcelizer(obj, bArr, i, i2, isendboundary);
        } else {
            RemoteActionCompatParcelizer(obj, bArr, i, i2, 0, isendboundary);
        }
    }
}
