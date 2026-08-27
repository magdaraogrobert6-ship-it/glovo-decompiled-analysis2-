package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class isZeroimpl implements toStringAsFixed {
    public final int IconCompatParcelizer;
    public final getYimpl MediaBrowserCompatMediaItem;
    public final int[] MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final accessgetZerocp MediaSessionCompatQueueItem;
    public final getZerokKHJgLsannotations MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final Object[] ParcelableVolumeInfo;
    public final int PlaybackStateCompat;
    public final boolean PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public final androidx.datastore.preferences.protobuf.UnknownFieldSchema r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final PlatformFocusOwner serializer;
    public final int[] write;
    public static final int[] read = new int[0];
    public static final Unsafe RemoteActionCompatParcelizer = getUint64Low32annotations.serializer();

    public static int IconCompatParcelizer(int i) {
        return (i & 267386880) >>> 20;
    }

    public static long write(int i) {
        return i & 1048575;
    }

    public static int IconCompatParcelizer(long j, Object obj) {
        return ((Integer) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj)).intValue();
    }

    public static List RemoteActionCompatParcelizer(long j, Object obj) {
        return (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x028e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0291  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x02aa  */
    public static isZeroimpl serializer(lerp3Ry4LBc lerp3ry4lbc, getZerokKHJgLsannotations getzerokkhjglsannotations, accessgetZerocp accessgetzerocp, androidx.datastore.preferences.protobuf.UnknownFieldSchema unknownFieldSchema, activeNode activenode, getYimpl getyimpl) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        char cCharAt;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        char cCharAt8;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        String str;
        int i22;
        int[] iArr2;
        int i23;
        int i24;
        int iObjectFieldOffset;
        int i25;
        int i26;
        int i27;
        int i28;
        Field fieldWrite;
        int i29;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldWrite2;
        int i33;
        Object obj2;
        Field fieldWrite3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        char cCharAt14;
        lerp3Ry4LBc lerp3ry4lbc2 = lerp3ry4lbc;
        int i38 = 0;
        boolean z = ((lerp3ry4lbc2.IconCompatParcelizer & 1) == 1 ? getPackedValue.PROTO2 : getPackedValue.PROTO3) == getPackedValue.PROTO3;
        String str2 = lerp3ry4lbc2.read;
        int length = str2.length();
        int iCharAt2 = str2.charAt(0);
        if (iCharAt2 >= 55296) {
            int i39 = iCharAt2 & 8191;
            int i40 = 1;
            int i41 = 13;
            while (true) {
                i = i40 + 1;
                cCharAt14 = str2.charAt(i40);
                if (cCharAt14 < 55296) {
                    break;
                }
                i39 |= (cCharAt14 & 8191) << i41;
                i41 += 13;
                i40 = i;
            }
            iCharAt2 = i39 | (cCharAt14 << i41);
        } else {
            i = 1;
        }
        int i42 = i + 1;
        int iCharAt3 = str2.charAt(i);
        if (iCharAt3 >= 55296) {
            int i43 = iCharAt3 & 8191;
            int i44 = 13;
            while (true) {
                i37 = i42 + 1;
                cCharAt13 = str2.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i37;
            }
            iCharAt3 = i43 | (cCharAt13 << i44);
            i42 = i37;
        }
        if (iCharAt3 == 0) {
            i6 = 0;
            iCharAt = 0;
            i7 = 0;
            i4 = 0;
            i3 = i42;
            iArr = read;
            i8 = 0;
            i5 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt4 = str2.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i16 = i45 + 1;
                    cCharAt8 = str2.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i16;
                }
                iCharAt4 = i46 | (cCharAt8 << i47);
                i45 = i16;
            }
            int i48 = i45 + 1;
            int iCharAt5 = str2.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i15 = i48 + 1;
                    cCharAt7 = str2.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i15;
                }
                iCharAt5 = i49 | (cCharAt7 << i50);
                i48 = i15;
            }
            int i51 = i48 + 1;
            int iCharAt6 = str2.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i14 = i51 + 1;
                    cCharAt6 = str2.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i14;
                }
                iCharAt6 = i52 | (cCharAt6 << i53);
                i51 = i14;
            }
            int i54 = i51 + 1;
            int iCharAt7 = str2.charAt(i51);
            if (iCharAt7 >= 55296) {
                int i55 = iCharAt7 & 8191;
                int i56 = 13;
                while (true) {
                    i13 = i54 + 1;
                    cCharAt5 = str2.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i13;
                }
                iCharAt7 = i55 | (cCharAt5 << i56);
                i54 = i13;
            }
            int i57 = i54 + 1;
            iCharAt = str2.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i12 = i57 + 1;
                    cCharAt4 = str2.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i12;
                }
                iCharAt = i58 | (cCharAt4 << i59);
                i57 = i12;
            }
            int i60 = i57 + 1;
            int iCharAt8 = str2.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i11 = i60 + 1;
                    cCharAt3 = str2.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i11;
                }
                iCharAt8 = i61 | (cCharAt3 << i62);
                i60 = i11;
            }
            int i63 = i60 + 1;
            int iCharAt9 = str2.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i10 = i65 + 1;
                    cCharAt2 = str2.charAt(i65);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i66;
                    i66 += 13;
                    i65 = i10;
                }
                iCharAt9 = i64 | (cCharAt2 << i66);
                i2 = i10;
            } else {
                i2 = i63;
            }
            i3 = i2 + 1;
            int iCharAt10 = str2.charAt(i2);
            if (iCharAt10 >= 55296) {
                int i67 = iCharAt10 & 8191;
                int i68 = i3;
                int i69 = 13;
                while (true) {
                    i9 = i68 + 1;
                    cCharAt = str2.charAt(i68);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i69;
                    i69 += 13;
                    i68 = i9;
                }
                iCharAt10 = i67 | (cCharAt << i69);
                i3 = i9;
            }
            int[] iArr3 = new int[iCharAt10 + iCharAt8 + iCharAt9];
            i4 = (iCharAt4 * 2) + iCharAt5;
            i5 = iCharAt7;
            iArr = iArr3;
            i6 = iCharAt8;
            i7 = iCharAt10;
            i38 = iCharAt4;
            i8 = iCharAt6;
        }
        Unsafe unsafe = RemoteActionCompatParcelizer;
        Object[] objArr = lerp3ry4lbc2.write;
        Class<?> cls = lerp3ry4lbc2.serializer.getClass();
        int i70 = i4;
        int[] iArr4 = new int[iCharAt * 3];
        boolean z2 = z;
        Object[] objArr2 = new Object[iCharAt * 2];
        int i71 = i6 + i7;
        int i72 = i7;
        int i73 = i3;
        int i74 = i71;
        int i75 = 0;
        int i76 = 0;
        while (i73 < length) {
            int i77 = i73 + 1;
            int iCharAt11 = str2.charAt(i73);
            int i78 = length;
            if (iCharAt11 >= 55296) {
                int i79 = iCharAt11 & 8191;
                int i80 = i77;
                int i81 = 13;
                while (true) {
                    i36 = i80 + 1;
                    cCharAt12 = str2.charAt(i80);
                    i17 = i7;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt12 & 8191) << i81;
                    i81 += 13;
                    i80 = i36;
                    i7 = i17;
                }
                iCharAt11 = i79 | (cCharAt12 << i81);
                i18 = i36;
            } else {
                i17 = i7;
                i18 = i77;
            }
            int i82 = i18 + 1;
            int iCharAt12 = str2.charAt(i18);
            if (iCharAt12 >= 55296) {
                int i83 = iCharAt12 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i35 = i84 + 1;
                    cCharAt11 = str2.charAt(i84);
                    i19 = i5;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i83 |= (cCharAt11 & 8191) << i85;
                    i85 += 13;
                    i84 = i35;
                    i5 = i19;
                }
                iCharAt12 = i83 | (cCharAt11 << i85);
                i20 = i35;
            } else {
                i19 = i5;
                i20 = i82;
            }
            int i86 = iCharAt12 & 255;
            int i87 = i8;
            if ((iCharAt12 & androidx.compose.ui.graphics.Fields.RotationZ) != 0) {
                iArr[i76] = i75;
                i76++;
            }
            if (i86 >= 51) {
                int i88 = i20 + 1;
                int iCharAt13 = str2.charAt(i20);
                char c = 55296;
                if (iCharAt13 >= 55296) {
                    int i89 = iCharAt13 & 8191;
                    int i90 = 13;
                    while (true) {
                        i34 = i88 + 1;
                        cCharAt10 = str2.charAt(i88);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i89 |= (cCharAt10 & 8191) << i90;
                        i90 += 13;
                        i88 = i34;
                        c = 55296;
                    }
                    iCharAt13 = i89 | (cCharAt10 << i90);
                    i88 = i34;
                }
                int i91 = i86 - 51;
                i26 = i88;
                if (i91 == 9 || i91 == 17) {
                    i21 = iCharAt11;
                    i31 = 2;
                    objArr2[ff$$ExternalSyntheticOutline0.m(i75, 3, 2, 1)] = objArr[i70];
                } else {
                    if (i91 == 12) {
                        i21 = iCharAt11;
                        if ((iCharAt2 & 1) == 1) {
                            i31 = 2;
                            objArr2[ff$$ExternalSyntheticOutline0.m(i75, 3, 2, 1)] = objArr[i70];
                        } else {
                            i31 = 2;
                        }
                    } else {
                        i21 = iCharAt11;
                        i31 = 2;
                    }
                    i32 = iCharAt13 * i31;
                    obj = objArr[i32];
                    if (obj instanceof Field) {
                        fieldWrite2 = (Field) obj;
                    } else {
                        fieldWrite2 = write(cls, (String) obj);
                        objArr[i32] = fieldWrite2;
                    }
                    str = str2;
                    int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldWrite2);
                    i33 = i32 + 1;
                    obj2 = objArr[i33];
                    if (obj2 instanceof Field) {
                        fieldWrite3 = (Field) obj2;
                    } else {
                        fieldWrite3 = write(cls, (String) obj2);
                        objArr[i33] = fieldWrite3;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldWrite3);
                    i22 = iCharAt12;
                    iArr2 = iArr4;
                    i27 = i70;
                    i25 = 0;
                    objArr = objArr;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i28 = iObjectFieldOffset2;
                    i23 = i38;
                }
                i70++;
                i32 = iCharAt13 * i31;
                obj = objArr[i32];
                if (obj instanceof Field) {
                    fieldWrite2 = (Field) obj;
                } else {
                    fieldWrite2 = write(cls, (String) obj);
                    objArr[i32] = fieldWrite2;
                }
                str = str2;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldWrite2);
                i33 = i32 + 1;
                obj2 = objArr[i33];
                if (obj2 instanceof Field) {
                    fieldWrite3 = (Field) obj2;
                } else {
                    fieldWrite3 = write(cls, (String) obj2);
                    objArr[i33] = fieldWrite3;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldWrite3);
                i22 = iCharAt12;
                iArr2 = iArr4;
                i27 = i70;
                i25 = 0;
                objArr = objArr;
                iObjectFieldOffset = iObjectFieldOffset5;
                i28 = iObjectFieldOffset4;
                i23 = i38;
            } else {
                i21 = iCharAt11;
                str = str2;
                int i92 = i70 + 1;
                Field fieldWrite4 = write(cls, (String) objArr[i70]);
                if (i86 == 9 || i86 == 17) {
                    i22 = iCharAt12;
                    iArr2 = iArr4;
                    objArr2[ff$$ExternalSyntheticOutline0.m(i75, 3, 2, 1)] = fieldWrite4.getType();
                } else {
                    if (i86 == 27 || i86 == 49) {
                        i22 = iCharAt12;
                        iArr2 = iArr4;
                        i30 = i70 + 2;
                        objArr2[ff$$ExternalSyntheticOutline0.m(i75, 3, 2, 1)] = objArr[i92];
                    } else if (i86 == 12 || i86 == 30 || i86 == 44) {
                        i22 = iCharAt12;
                        iArr2 = iArr4;
                        if ((iCharAt2 & 1) == 1) {
                            i30 = i70 + 2;
                            objArr2[ff$$ExternalSyntheticOutline0.m(i75, 3, 2, 1)] = objArr[i92];
                        }
                    } else if (i86 == 50) {
                        int i93 = i72 + 1;
                        iArr[i72] = i75;
                        int i94 = (i75 / 3) * 2;
                        int i95 = i70 + 2;
                        objArr2[i94] = objArr[i92];
                        if ((iCharAt12 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0) {
                            i92 = i70 + 3;
                            objArr2[i94 + 1] = objArr[i95];
                            i22 = iCharAt12;
                            i72 = i93;
                            iArr2 = iArr4;
                        } else {
                            i72 = i93;
                            iArr2 = iArr4;
                            i92 = i95;
                            i22 = iCharAt12;
                        }
                    } else {
                        i22 = iCharAt12;
                        iArr2 = iArr4;
                    }
                    i92 = i30;
                }
                i23 = i38;
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldWrite4);
                if ((iCharAt2 & 1) != 1 || i86 > 17) {
                    i24 = i20;
                    iObjectFieldOffset = 0;
                    i25 = 0;
                } else {
                    int i96 = i20 + 1;
                    int iCharAt14 = str.charAt(i20);
                    if (iCharAt14 >= 55296) {
                        int i97 = iCharAt14 & 8191;
                        int i98 = 13;
                        while (true) {
                            i29 = i96 + 1;
                            cCharAt9 = str.charAt(i96);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i97 |= (cCharAt9 & 8191) << i98;
                            i98 += 13;
                            i96 = i29;
                        }
                        iCharAt14 = i97 | (cCharAt9 << i98);
                        i96 = i29;
                    }
                    int i99 = (iCharAt14 / 32) + (i23 * 2);
                    Object obj3 = objArr[i99];
                    if (obj3 instanceof Field) {
                        fieldWrite = (Field) obj3;
                    } else {
                        fieldWrite = write(cls, (String) obj3);
                        objArr[i99] = fieldWrite;
                    }
                    i24 = i96;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldWrite);
                    i25 = iCharAt14 % 32;
                }
                if (i86 >= 18 && i86 <= 49) {
                    iArr[i74] = iObjectFieldOffset6;
                    i74++;
                }
                i26 = i24;
                i27 = i92;
                i28 = iObjectFieldOffset6;
            }
            iArr2[i75] = i21;
            int i100 = i22;
            iArr2[i75 + 1] = i28 | ((i100 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? 268435456 : 0) | ((i100 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? 536870912 : 0) | (i86 << 20);
            iArr2[i75 + 2] = iObjectFieldOffset | (i25 << 20);
            i75 += 3;
            lerp3ry4lbc2 = lerp3ry4lbc;
            i70 = i27;
            str2 = str;
            i38 = i23;
            objArr = objArr;
            iArr4 = iArr2;
            i8 = i87;
            length = i78;
            i7 = i17;
            i5 = i19;
            i73 = i26;
        }
        return new isZeroimpl(iArr4, objArr2, i8, i5, lerp3ry4lbc2.serializer, z2, iArr, i7, i71, getzerokkhjglsannotations, accessgetzerocp, unknownFieldSchema, activenode, getyimpl);
    }

    public static long write(long j, Object obj) {
        return ((Long) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj)).longValue();
    }

    public final int RatingCompat(int i) {
        return this.write[i + 1];
    }

    public final void RemoteActionCompatParcelizer(Object obj, int i, Object obj2) {
        int i2 = this.write[i];
        if (getUint64Low32annotations.read.MediaBrowserCompatMediaItem(RatingCompat(i) & 1048575, obj) == null) {
            return;
        }
        RemoteActionCompatParcelizer(i);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0219 A[PHI: r3
  0x0219: PHI (r3v30 int) = (r3v10 int), (r3v33 int) binds: [B:82:0x0217, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.toStringAsFixed
    public final int read(isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance) {
        int i;
        int iIconCompatParcelizer;
        int i2;
        int iHashCode;
        int[] iArr = this.write;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iRatingCompat = RatingCompat(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iRatingCompat;
            int i6 = 1237;
            switch (IconCompatParcelizer(iRatingCompat)) {
                case 0:
                    i = i3 * 53;
                    iIconCompatParcelizer = topLeft.IconCompatParcelizer(Double.doubleToLongBits(getUint64Low32annotations.read.IconCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance)));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iIconCompatParcelizer = Float.floatToIntBits(getUint64Low32annotations.read.RemoteActionCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iIconCompatParcelizer = topLeft.IconCompatParcelizer(getUint64Low32annotations.read.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iIconCompatParcelizer = topLeft.IconCompatParcelizer(getUint64Low32annotations.read.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iIconCompatParcelizer = getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iIconCompatParcelizer = topLeft.IconCompatParcelizer(getUint64Low32annotations.read.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iIconCompatParcelizer = getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zWrite = getUint64Low32annotations.read.write(j, isbettercandidate_i7lrpngminoraxisdistance);
                    Charset charset = topLeft.serializer;
                    if (zWrite) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iIconCompatParcelizer = ((String) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance)).hashCode();
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 9:
                    Object objMediaBrowserCompatMediaItem = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance);
                    if (objMediaBrowserCompatMediaItem != null) {
                        iHashCode = objMediaBrowserCompatMediaItem.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iIconCompatParcelizer = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance).hashCode();
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iIconCompatParcelizer = getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iIconCompatParcelizer = getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iIconCompatParcelizer = getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iIconCompatParcelizer = topLeft.IconCompatParcelizer(getUint64Low32annotations.read.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iIconCompatParcelizer = getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance);
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iIconCompatParcelizer = topLeft.IconCompatParcelizer(getUint64Low32annotations.read.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance));
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 17:
                    Object objMediaBrowserCompatMediaItem2 = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance);
                    if (objMediaBrowserCompatMediaItem2 != null) {
                        iHashCode = objMediaBrowserCompatMediaItem2.hashCode();
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
                    iIconCompatParcelizer = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance).hashCode();
                    i3 = iIconCompatParcelizer + i;
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    i = i3 * 53;
                    iIconCompatParcelizer = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance).hashCode();
                    i3 = iIconCompatParcelizer + i;
                    break;
                case 51:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = topLeft.IconCompatParcelizer(Double.doubleToLongBits(((Double) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance)).doubleValue()));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = Float.floatToIntBits(((Float) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance)).floatValue());
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 53:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = topLeft.IconCompatParcelizer(write(j, isbettercandidate_i7lrpngminoraxisdistance));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 54:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = topLeft.IconCompatParcelizer(write(j, isbettercandidate_i7lrpngminoraxisdistance));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 55:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = IconCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 56:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = topLeft.IconCompatParcelizer(write(j, isbettercandidate_i7lrpngminoraxisdistance));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 57:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = IconCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 58:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance)).booleanValue();
                        Charset charset2 = topLeft.serializer;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = ((String) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance)).hashCode();
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 60:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance).hashCode();
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance).hashCode();
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = IconCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 63:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = IconCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 64:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = IconCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 65:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = topLeft.IconCompatParcelizer(write(j, isbettercandidate_i7lrpngminoraxisdistance));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 66:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = IconCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance);
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 67:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = topLeft.IconCompatParcelizer(write(j, isbettercandidate_i7lrpngminoraxisdistance));
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
                case 68:
                    if (serializer(i5, i4, isbettercandidate_i7lrpngminoraxisdistance)) {
                        i = i3 * 53;
                        iIconCompatParcelizer = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance).hashCode();
                        i3 = iIconCompatParcelizer + i;
                    }
                    break;
            }
        }
        ((getDualUnsignedFloatMaskannotations) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).getClass();
        return isbettercandidate_i7lrpngminoraxisdistance.serializer.hashCode() + (i3 * 53);
    }

    @Override // o.toStringAsFixed
    public final Object read() {
        this.MediaSessionCompatResultReceiverWrapper.getClass();
        return ((isBetterCandidate_I7lrPNgminorAxisDistance) this.serializer).IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.NEW_MUTABLE_INSTANCE);
    }

    public final void read(int i, int i2, Object obj) {
        getUint64Low32annotations.IconCompatParcelizer(this.write[i2 + 2] & 1048575, i, obj);
    }

    @Override // o.toStringAsFixed
    public final boolean read(isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance, isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance2) {
        boolean zWrite;
        int[] iArr = this.write;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iRatingCompat = RatingCompat(i);
            long j = iRatingCompat & 1048575;
            switch (IconCompatParcelizer(iRatingCompat)) {
                case 0:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar = getUint64Low32annotations.read;
                        if (Double.doubleToLongBits(deflateVar.IconCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance)) == Double.doubleToLongBits(deflateVar.IconCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance2))) {
                            continue;
                            break;
                        }
                    }
                case 1:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar2 = getUint64Low32annotations.read;
                        if (Float.floatToIntBits(deflateVar2.RemoteActionCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance)) == Float.floatToIntBits(deflateVar2.RemoteActionCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance2))) {
                            continue;
                            break;
                        }
                    }
                case 2:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar3 = getUint64Low32annotations.read;
                        if (deflateVar3.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar3.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 3:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar4 = getUint64Low32annotations.read;
                        if (deflateVar4.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar4.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 4:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar5 = getUint64Low32annotations.read;
                        if (deflateVar5.serializer(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar5.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 5:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar6 = getUint64Low32annotations.read;
                        if (deflateVar6.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar6.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 6:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar7 = getUint64Low32annotations.read;
                        if (deflateVar7.serializer(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar7.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 7:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar8 = getUint64Low32annotations.read;
                        if (deflateVar8.write(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar8.write(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 8:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar9 = getUint64Low32annotations.read;
                        if (getDualLoadedSignificandannotations.write(deflateVar9.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance), deflateVar9.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2))) {
                            continue;
                            break;
                        }
                    }
                case 9:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar10 = getUint64Low32annotations.read;
                        if (getDualLoadedSignificandannotations.write(deflateVar10.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance), deflateVar10.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2))) {
                            continue;
                            break;
                        }
                    }
                case 10:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar11 = getUint64Low32annotations.read;
                        if (getDualLoadedSignificandannotations.write(deflateVar11.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance), deflateVar11.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2))) {
                            continue;
                            break;
                        }
                    }
                case 11:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar12 = getUint64Low32annotations.read;
                        if (deflateVar12.serializer(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar12.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 12:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar13 = getUint64Low32annotations.read;
                        if (deflateVar13.serializer(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar13.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 13:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar14 = getUint64Low32annotations.read;
                        if (deflateVar14.serializer(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar14.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 14:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar15 = getUint64Low32annotations.read;
                        if (deflateVar15.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar15.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 15:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar16 = getUint64Low32annotations.read;
                        if (deflateVar16.serializer(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar16.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 16:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar17 = getUint64Low32annotations.read;
                        if (deflateVar17.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar17.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            continue;
                            break;
                        }
                    }
                case 17:
                    if (IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2, i)) {
                        deflate deflateVar18 = getUint64Low32annotations.read;
                        if (getDualLoadedSignificandannotations.write(deflateVar18.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance), deflateVar18.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2))) {
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
                    deflate deflateVar19 = getUint64Low32annotations.read;
                    zWrite = getDualLoadedSignificandannotations.write(deflateVar19.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance), deflateVar19.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2));
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    deflate deflateVar20 = getUint64Low32annotations.read;
                    zWrite = getDualLoadedSignificandannotations.write(deflateVar20.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance), deflateVar20.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2));
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
                    deflate deflateVar21 = getUint64Low32annotations.read;
                    if (deflateVar21.serializer(j2, isbettercandidate_i7lrpngminoraxisdistance) == deflateVar21.serializer(j2, isbettercandidate_i7lrpngminoraxisdistance2) && getDualLoadedSignificandannotations.write(deflateVar21.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance), deflateVar21.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2))) {
                        continue;
                        break;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            if (zWrite) {
            }
        }
        getDualUnsignedFloatMaskannotations getdualunsignedfloatmaskannotations = (getDualUnsignedFloatMaskannotations) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getdualunsignedfloatmaskannotations.getClass();
        getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotations = isbettercandidate_i7lrpngminoraxisdistance.serializer;
        getdualunsignedfloatmaskannotations.getClass();
        return getunspecifiedpackedfloatsannotations.equals(isbettercandidate_i7lrpngminoraxisdistance2.serializer);
    }

    public final boolean serializer(int i, int i2, Object obj) {
        return getUint64Low32annotations.read.serializer((long) (this.write[i2 + 2] & 1048575), obj) == i;
    }

    public isZeroimpl(int[] iArr, Object[] objArr, int i, int i2, PlatformFocusOwner platformFocusOwner, boolean z, int[] iArr2, int i3, int i4, getZerokKHJgLsannotations getzerokkhjglsannotations, accessgetZerocp accessgetzerocp, androidx.datastore.preferences.protobuf.UnknownFieldSchema unknownFieldSchema, activeNode activenode, getYimpl getyimpl) {
        this.write = iArr;
        this.ParcelableVolumeInfo = objArr;
        this.MediaSessionCompatToken = i;
        this.RatingCompat = i2;
        this.MediaMetadataCompat = platformFocusOwner instanceof isBetterCandidate_I7lrPNgminorAxisDistance;
        this.PlaybackStateCompatCustomAction = z;
        this.MediaDescriptionCompat = iArr2;
        this.IconCompatParcelizer = i3;
        this.PlaybackStateCompat = i4;
        this.MediaSessionCompatResultReceiverWrapper = getzerokkhjglsannotations;
        this.MediaSessionCompatQueueItem = accessgetzerocp;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = unknownFieldSchema;
        this.serializer = platformFocusOwner;
        this.MediaBrowserCompatMediaItem = getyimpl;
    }

    @Override // o.toStringAsFixed
    public final void IconCompatParcelizer(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.IconCompatParcelizer;
        while (true) {
            iArr = this.MediaDescriptionCompat;
            i = this.PlaybackStateCompat;
            if (i2 >= i) {
                break;
            }
            long jRatingCompat = RatingCompat(iArr[i2]) & 1048575;
            Object objMediaBrowserCompatMediaItem = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(jRatingCompat, obj);
            if (objMediaBrowserCompatMediaItem != null) {
                this.MediaBrowserCompatMediaItem.getClass();
                ((getYannotations) objMediaBrowserCompatMediaItem).write = false;
                getUint64Low32annotations.serializer(jRatingCompat, obj, objMediaBrowserCompatMediaItem);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.MediaSessionCompatQueueItem.write(iArr[i], obj);
            i++;
        }
        ((getDualUnsignedFloatMaskannotations) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).getClass();
        ((isBetterCandidate_I7lrPNgminorAxisDistance) obj).serializer.IconCompatParcelizer = false;
    }

    @Override // o.toStringAsFixed
    public final void IconCompatParcelizer(Object obj, copyOHQCggkdefault copyohqcggkdefault) throws IOException {
        copyohqcggkdefault.getClass();
        getMaxDimension getmaxdimension = getMaxDimension.ASCENDING;
        getMaxDimension getmaxdimension2 = getMaxDimension.DESCENDING;
        int[] iArr = this.write;
        androidx.datastore.preferences.protobuf.UnknownFieldSchema unknownFieldSchema = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (getmaxdimension != getmaxdimension2) {
            if (!this.PlaybackStateCompatCustomAction) {
                serializer(obj, copyohqcggkdefault);
                return;
            }
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iRatingCompat = RatingCompat(i);
                int i2 = iArr[i];
                switch (IconCompatParcelizer(iRatingCompat)) {
                    case 0:
                        if (write(i, obj)) {
                            copyohqcggkdefault.read(getUint64Low32annotations.read.IconCompatParcelizer(iRatingCompat & 1048575, obj), i2);
                        }
                        break;
                    case 1:
                        if (write(i, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(getUint64Low32annotations.read.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj), i2);
                        }
                        break;
                    case 2:
                        if (write(i, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i2, getUint64Low32annotations.read.MediaDescriptionCompat(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 3:
                        if (write(i, obj)) {
                            copyohqcggkdefault.serializer(i2, getUint64Low32annotations.read.MediaDescriptionCompat(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 4:
                        if (write(i, obj)) {
                            copyohqcggkdefault.read(i2, getUint64Low32annotations.read.serializer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 5:
                        if (write(i, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(i2, getUint64Low32annotations.read.MediaDescriptionCompat(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 6:
                        if (write(i, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(i2, getUint64Low32annotations.read.serializer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 7:
                        if (write(i, obj)) {
                            copyohqcggkdefault.write(i2, getUint64Low32annotations.read.write(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 8:
                        if (write(i, obj)) {
                            write(i2, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault);
                        }
                        break;
                    case 9:
                        if (write(i, obj)) {
                            copyohqcggkdefault.serializer(i2, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), serializer(i));
                        }
                        break;
                    case 10:
                        if (write(i, obj)) {
                            copyohqcggkdefault.read(i2, (moveFocusInChildren3ESFkO8) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 11:
                        if (write(i, obj)) {
                            copyohqcggkdefault.MediaSessionCompatQueueItem(i2, getUint64Low32annotations.read.serializer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 12:
                        if (write(i, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i2, getUint64Low32annotations.read.serializer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 13:
                        if (write(i, obj)) {
                            copyohqcggkdefault.serializer(i2, getUint64Low32annotations.read.serializer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 14:
                        if (write(i, obj)) {
                            copyohqcggkdefault.read(i2, getUint64Low32annotations.read.MediaDescriptionCompat(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 15:
                        if (write(i, obj)) {
                            copyohqcggkdefault.write(i2, getUint64Low32annotations.read.serializer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 16:
                        if (write(i, obj)) {
                            copyohqcggkdefault.write(i2, getUint64Low32annotations.read.MediaDescriptionCompat(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 17:
                        if (write(i, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i2, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), serializer(i));
                        }
                        break;
                    case 18:
                        getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 19:
                        getDualLoadedSignificandannotations.RatingCompat(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 20:
                        getDualLoadedSignificandannotations.MediaDescriptionCompat(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 21:
                        getDualLoadedSignificandannotations.PlaybackStateCompat(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 22:
                        getDualLoadedSignificandannotations.MediaMetadataCompat(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 23:
                        getDualLoadedSignificandannotations.serializer(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 24:
                        getDualLoadedSignificandannotations.write(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 25:
                        getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 26:
                        getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault);
                        break;
                    case 27:
                        getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, serializer(i));
                        break;
                    case 28:
                        getDualLoadedSignificandannotations.serializer(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault);
                        break;
                    case 29:
                        getDualLoadedSignificandannotations.PlaybackStateCompatCustomAction(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 30:
                        getDualLoadedSignificandannotations.read(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 31:
                        getDualLoadedSignificandannotations.MediaBrowserCompatMediaItem(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 32:
                        getDualLoadedSignificandannotations.MediaSessionCompatQueueItem(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 33:
                        getDualLoadedSignificandannotations.MediaSessionCompatToken(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        getDualLoadedSignificandannotations.MediaSessionCompatResultReceiverWrapper(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 35:
                        getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        getDualLoadedSignificandannotations.RatingCompat(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 37:
                        getDualLoadedSignificandannotations.MediaDescriptionCompat(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 38:
                        getDualLoadedSignificandannotations.PlaybackStateCompat(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        getDualLoadedSignificandannotations.MediaMetadataCompat(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 40:
                        getDualLoadedSignificandannotations.serializer(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        getDualLoadedSignificandannotations.write(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 43:
                        getDualLoadedSignificandannotations.PlaybackStateCompatCustomAction(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 44:
                        getDualLoadedSignificandannotations.read(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        getDualLoadedSignificandannotations.MediaBrowserCompatMediaItem(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 46:
                        getDualLoadedSignificandannotations.MediaSessionCompatQueueItem(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 47:
                        getDualLoadedSignificandannotations.MediaSessionCompatToken(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        getDualLoadedSignificandannotations.MediaSessionCompatResultReceiverWrapper(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 49:
                        getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(iArr[i], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault, serializer(i));
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        IconCompatParcelizer(copyohqcggkdefault, i2, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), i);
                        break;
                    case 51:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.read(((Double) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj)).doubleValue(), i2);
                        }
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(((Float) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj)).floatValue(), i2);
                        }
                        break;
                    case 53:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i2, write(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 54:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.serializer(i2, write(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 55:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.read(i2, IconCompatParcelizer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 56:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(i2, write(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 57:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(i2, IconCompatParcelizer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 58:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.write(i2, ((Boolean) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj)).booleanValue());
                        }
                        break;
                    case 59:
                        if (serializer(i2, i, obj)) {
                            write(i2, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), copyohqcggkdefault);
                        }
                        break;
                    case 60:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.serializer(i2, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), serializer(i));
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.read(i2, (moveFocusInChildren3ESFkO8) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.MediaSessionCompatQueueItem(i2, IconCompatParcelizer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 63:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i2, IconCompatParcelizer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 64:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.serializer(i2, IconCompatParcelizer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 65:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.read(i2, write(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 66:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.write(i2, IconCompatParcelizer(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 67:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.write(i2, write(iRatingCompat & 1048575, obj));
                        }
                        break;
                    case 68:
                        if (serializer(i2, i, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i2, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj), serializer(i));
                        }
                        break;
                }
            }
            ((getDualUnsignedFloatMaskannotations) unknownFieldSchema).getClass();
            ((isBetterCandidate_I7lrPNgminorAxisDistance) obj).serializer.serializer(copyohqcggkdefault);
            return;
        }
        ((getDualUnsignedFloatMaskannotations) unknownFieldSchema).getClass();
        ((isBetterCandidate_I7lrPNgminorAxisDistance) obj).serializer.serializer(copyohqcggkdefault);
        int length2 = iArr.length;
        while (true) {
            length2 -= 3;
            if (length2 >= 0) {
                int iRatingCompat2 = RatingCompat(length2);
                int i3 = iArr[length2];
                switch (IconCompatParcelizer(iRatingCompat2)) {
                    case 0:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.read(getUint64Low32annotations.read.IconCompatParcelizer(iRatingCompat2 & 1048575, obj), i3);
                        }
                        break;
                    case 1:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(getUint64Low32annotations.read.RemoteActionCompatParcelizer(iRatingCompat2 & 1048575, obj), i3);
                        }
                        break;
                    case 2:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i3, getUint64Low32annotations.read.MediaDescriptionCompat(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 3:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.serializer(i3, getUint64Low32annotations.read.MediaDescriptionCompat(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 4:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.read(i3, getUint64Low32annotations.read.serializer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 5:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(i3, getUint64Low32annotations.read.MediaDescriptionCompat(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 6:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(i3, getUint64Low32annotations.read.serializer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 7:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.write(i3, getUint64Low32annotations.read.write(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 8:
                        if (write(length2, obj)) {
                            write(i3, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault);
                        }
                        break;
                    case 9:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.serializer(i3, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), serializer(length2));
                        }
                        break;
                    case 10:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.read(i3, (moveFocusInChildren3ESFkO8) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 11:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.MediaSessionCompatQueueItem(i3, getUint64Low32annotations.read.serializer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 12:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i3, getUint64Low32annotations.read.serializer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 13:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.serializer(i3, getUint64Low32annotations.read.serializer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 14:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.read(i3, getUint64Low32annotations.read.MediaDescriptionCompat(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 15:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.write(i3, getUint64Low32annotations.read.serializer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 16:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.write(i3, getUint64Low32annotations.read.MediaDescriptionCompat(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 17:
                        if (write(length2, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i3, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), serializer(length2));
                        }
                        break;
                    case 18:
                        getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 19:
                        getDualLoadedSignificandannotations.RatingCompat(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 20:
                        getDualLoadedSignificandannotations.MediaDescriptionCompat(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 21:
                        getDualLoadedSignificandannotations.PlaybackStateCompat(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 22:
                        getDualLoadedSignificandannotations.MediaMetadataCompat(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 23:
                        getDualLoadedSignificandannotations.serializer(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 24:
                        getDualLoadedSignificandannotations.write(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 25:
                        getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 26:
                        getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault);
                        break;
                    case 27:
                        getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, serializer(length2));
                        break;
                    case 28:
                        getDualLoadedSignificandannotations.serializer(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault);
                        break;
                    case 29:
                        getDualLoadedSignificandannotations.PlaybackStateCompatCustomAction(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 30:
                        getDualLoadedSignificandannotations.read(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 31:
                        getDualLoadedSignificandannotations.MediaBrowserCompatMediaItem(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 32:
                        getDualLoadedSignificandannotations.MediaSessionCompatQueueItem(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 33:
                        getDualLoadedSignificandannotations.MediaSessionCompatToken(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        getDualLoadedSignificandannotations.MediaSessionCompatResultReceiverWrapper(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, false);
                        break;
                    case 35:
                        getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        getDualLoadedSignificandannotations.RatingCompat(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 37:
                        getDualLoadedSignificandannotations.MediaDescriptionCompat(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 38:
                        getDualLoadedSignificandannotations.PlaybackStateCompat(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        getDualLoadedSignificandannotations.MediaMetadataCompat(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 40:
                        getDualLoadedSignificandannotations.serializer(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        getDualLoadedSignificandannotations.write(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 43:
                        getDualLoadedSignificandannotations.PlaybackStateCompatCustomAction(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 44:
                        getDualLoadedSignificandannotations.read(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        getDualLoadedSignificandannotations.MediaBrowserCompatMediaItem(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 46:
                        getDualLoadedSignificandannotations.MediaSessionCompatQueueItem(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 47:
                        getDualLoadedSignificandannotations.MediaSessionCompatToken(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        getDualLoadedSignificandannotations.MediaSessionCompatResultReceiverWrapper(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, true);
                        break;
                    case 49:
                        getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(iArr[length2], (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault, serializer(length2));
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        IconCompatParcelizer(copyohqcggkdefault, i3, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), length2);
                        break;
                    case 51:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.read(((Double) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj)).doubleValue(), i3);
                        }
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(((Float) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj)).floatValue(), i3);
                        }
                        break;
                    case 53:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i3, write(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 54:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.serializer(i3, write(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 55:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.read(i3, IconCompatParcelizer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 56:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(i3, write(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 57:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.IconCompatParcelizer(i3, IconCompatParcelizer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 58:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.write(i3, ((Boolean) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj)).booleanValue());
                        }
                        break;
                    case 59:
                        if (serializer(i3, length2, obj)) {
                            write(i3, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), copyohqcggkdefault);
                        }
                        break;
                    case 60:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.serializer(i3, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), serializer(length2));
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.read(i3, (moveFocusInChildren3ESFkO8) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.MediaSessionCompatQueueItem(i3, IconCompatParcelizer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 63:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i3, IconCompatParcelizer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 64:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.serializer(i3, IconCompatParcelizer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 65:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.read(i3, write(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 66:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.write(i3, IconCompatParcelizer(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 67:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.write(i3, write(iRatingCompat2 & 1048575, obj));
                        }
                        break;
                    case 68:
                        if (serializer(i3, length2, obj)) {
                            copyohqcggkdefault.RemoteActionCompatParcelizer(i3, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat2 & 1048575, obj), serializer(length2));
                        }
                        break;
                }
            } else {
                return;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (this.ParcelableVolumeInfo[ff$$ExternalSyntheticOutline0.m(i, 3, 2, 1)] == null) {
            return;
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }

    public static isZeroimpl write(lerp3Ry4LBc lerp3ry4lbc, getZerokKHJgLsannotations getzerokkhjglsannotations, accessgetZerocp accessgetzerocp, androidx.datastore.preferences.protobuf.UnknownFieldSchema unknownFieldSchema, activeNode activenode, getYimpl getyimpl) {
        if (lerp3ry4lbc instanceof lerp3Ry4LBc) {
            return serializer(lerp3ry4lbc, getzerokkhjglsannotations, accessgetzerocp, unknownFieldSchema, activenode, getyimpl);
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
        return null;
    }

    public static void write(int i, Object obj, copyOHQCggkdefault copyohqcggkdefault) throws IOException {
        if (!(obj instanceof String)) {
            copyohqcggkdefault.read(i, (moveFocusInChildren3ESFkO8) obj);
        } else {
            ((RequestChildFocusKt) copyohqcggkdefault.read).write(i, (String) obj);
        }
    }

    public final boolean IconCompatParcelizer(isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance, Object obj, int i) {
        return write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance) == write(i, obj);
    }

    @Override // o.toStringAsFixed
    public final int RemoteActionCompatParcelizer(PlatformFocusOwner platformFocusOwner) {
        return this.PlaybackStateCompatCustomAction ? RemoteActionCompatParcelizer((Object) platformFocusOwner) : write(platformFocusOwner);
    }

    public final Object read(int i) {
        return this.ParcelableVolumeInfo[(i / 3) * 2];
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x010b  */
    /* JADX WARN: Code duplicated, block: B:81:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x011f A[SYNTHETIC] */
    @Override // o.toStringAsFixed
    public final boolean read(Object obj) {
        int i;
        int iIconCompatParcelizer;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.IconCompatParcelizer; i4++) {
            int i5 = this.MediaDescriptionCompat[i4];
            int[] iArr = this.write;
            int i6 = iArr[i5];
            int iRatingCompat = RatingCompat(i5);
            boolean z = this.PlaybackStateCompatCustomAction;
            if (z) {
                i = 0;
            } else {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i3 = RemoteActionCompatParcelizer.getInt(obj, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & iRatingCompat) == 0) {
                iIconCompatParcelizer = IconCompatParcelizer(iRatingCompat);
                if (iIconCompatParcelizer != 9 || iIconCompatParcelizer == 17) {
                    if (z) {
                        if (write(i5, obj)) {
                            if (!serializer(i5).read(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj))) {
                            }
                        } else {
                            continue;
                        }
                    } else if ((i & i3) != 0) {
                        if (!serializer(i5).read(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (iIconCompatParcelizer != 27) {
                        if (iIconCompatParcelizer == 60 || iIconCompatParcelizer == 68) {
                            if (serializer(i6, i5, obj)) {
                                if (!serializer(i5).read(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iIconCompatParcelizer != 49) {
                            if (iIconCompatParcelizer != 50) {
                                continue;
                            } else {
                                Object objMediaBrowserCompatMediaItem = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj);
                                this.MediaBrowserCompatMediaItem.getClass();
                                getYannotations getyannotations = (getYannotations) objMediaBrowserCompatMediaItem;
                                if (!getyannotations.isEmpty() && ((getHeight) ((getXimpl) read(i5)).IconCompatParcelizer.read).getJavaType() == getCenterLeftF1C5BW0.MESSAGE) {
                                    toStringAsFixed tostringasfixedRemoteActionCompatParcelizer = null;
                                    for (Object obj2 : getyannotations.values()) {
                                        if (tostringasfixedRemoteActionCompatParcelizer == null) {
                                            tostringasfixedRemoteActionCompatParcelizer = CornerRadiusdefault.write.RemoteActionCompatParcelizer(obj2.getClass());
                                        }
                                        if (!tostringasfixedRemoteActionCompatParcelizer.read(obj2)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    List list = (List) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        toStringAsFixed tostringasfixedSerializer = serializer(i5);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (tostringasfixedSerializer.read(list.get(i9))) {
                            }
                        }
                    }
                }
            } else if (z) {
                if (write(i5, obj)) {
                    iIconCompatParcelizer = IconCompatParcelizer(iRatingCompat);
                    if (iIconCompatParcelizer != 9) {
                    }
                    if (z) {
                        if (write(i5, obj)) {
                            if (!serializer(i5).read(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj))) {
                            }
                        } else {
                            continue;
                        }
                    } else if ((i & i3) != 0) {
                        if (!serializer(i5).read(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                }
            } else if ((i3 & i) != 0) {
                iIconCompatParcelizer = IconCompatParcelizer(iRatingCompat);
                if (iIconCompatParcelizer != 9) {
                }
                if (z) {
                    if (write(i5, obj)) {
                        if (!serializer(i5).read(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                } else if ((i & i3) != 0) {
                    if (!serializer(i5).read(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(iRatingCompat & 1048575, obj))) {
                    }
                } else {
                    continue;
                }
            }
            return false;
        }
        return true;
    }

    public final toStringAsFixed serializer(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.ParcelableVolumeInfo;
        toStringAsFixed tostringasfixed = (toStringAsFixed) objArr[i2];
        if (tostringasfixed != null) {
            return tostringasfixed;
        }
        toStringAsFixed tostringasfixedRemoteActionCompatParcelizer = CornerRadiusdefault.write.RemoteActionCompatParcelizer((Class) objArr[i2 + 1]);
        objArr[i2] = tostringasfixedRemoteActionCompatParcelizer;
        return tostringasfixedRemoteActionCompatParcelizer;
    }

    public final int write(Object obj) {
        int i;
        int iSerializer;
        int iIconCompatParcelizer;
        int iSerializer2;
        int iRemoteActionCompatParcelizer;
        int iIconCompatParcelizer2;
        int iSerializer3;
        int iRemoteActionCompatParcelizer2;
        int iSerializer4;
        int iSerializer5;
        int iSerializer6;
        Unsafe unsafe = RemoteActionCompatParcelizer;
        int i2 = -1;
        int i3 = 0;
        int iSerializer7 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.write;
            if (i3 < iArr.length) {
                int iRatingCompat = RatingCompat(i3);
                int i5 = iArr[i3];
                int iIconCompatParcelizer3 = IconCompatParcelizer(iRatingCompat);
                if (iIconCompatParcelizer3 <= 17) {
                    int i6 = iArr[i3 + 2];
                    int i7 = i6 & 1048575;
                    i = 1 << (i6 >>> 20);
                    if (i7 != i2) {
                        i4 = unsafe.getInt(obj, i7);
                        i2 = i7;
                    }
                } else {
                    i = 0;
                }
                long j = iRatingCompat & 1048575;
                switch (iIconCompatParcelizer3) {
                    case 0:
                        if ((i & i4) != 0) {
                            iSerializer7 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i5, 8, iSerializer7);
                        }
                        break;
                    case 1:
                        if ((i & i4) != 0) {
                            iSerializer7 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i5, 4, iSerializer7);
                        }
                        break;
                    case 2:
                        if ((i & i4) != 0) {
                            long j2 = unsafe.getLong(obj, j);
                            iSerializer = RequestChildFocusKt.serializer(i5);
                            iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(j2);
                            iSerializer4 = iSerializer;
                            iSerializer5 = iIconCompatParcelizer + iSerializer4;
                            iSerializer7 += iSerializer5;
                        }
                        break;
                    case 3:
                        if ((i & i4) != 0) {
                            long j3 = unsafe.getLong(obj, j);
                            iSerializer = RequestChildFocusKt.serializer(i5);
                            iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(j3);
                            iSerializer4 = iSerializer;
                            iSerializer5 = iIconCompatParcelizer + iSerializer4;
                            iSerializer7 += iSerializer5;
                        }
                        break;
                    case 4:
                        if ((i & i4) != 0) {
                            int i8 = unsafe.getInt(obj, j);
                            iSerializer2 = RequestChildFocusKt.serializer(i5);
                            iRemoteActionCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(i8);
                            iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 5:
                        if ((i & i4) != 0) {
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(i5);
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 6:
                        if ((i & i4) != 0) {
                            iIconCompatParcelizer2 = RequestChildFocusKt.read(i5);
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 7:
                        if ((i & i4) != 0) {
                            iSerializer7 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i5, 1, iSerializer7);
                        }
                        break;
                    case 8:
                        if ((i & i4) != 0) {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof moveFocusInChildren3ESFkO8) {
                                int iSerializer8 = RequestChildFocusKt.serializer(i5);
                                int iWrite = ((moveFocusInChildren3ESFkO8) object).write();
                                iSerializer7 = c8$$ExternalSyntheticOutline0.m(iWrite, iWrite, iSerializer8, iSerializer7);
                            } else {
                                iSerializer3 = RequestChildFocusKt.serializer(i5);
                                iRemoteActionCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) object);
                                iSerializer7 = iRemoteActionCompatParcelizer2 + iSerializer3 + iSerializer7;
                            }
                        }
                        break;
                    case 9:
                        if ((i & i4) != 0) {
                            Object object2 = unsafe.getObject(obj, j);
                            toStringAsFixed tostringasfixedSerializer = serializer(i3);
                            Class cls = getDualLoadedSignificandannotations.write;
                            int iSerializer9 = RequestChildFocusKt.serializer(i5);
                            int iRemoteActionCompatParcelizer3 = ((PlatformFocusOwner) object2).RemoteActionCompatParcelizer(tostringasfixedSerializer);
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer3, iSerializer9, iSerializer7);
                        }
                        break;
                    case 10:
                        if ((i & i4) != 0) {
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(i5, (moveFocusInChildren3ESFkO8) unsafe.getObject(obj, j));
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 11:
                        if ((i & i4) != 0) {
                            int i9 = unsafe.getInt(obj, j);
                            iSerializer2 = RequestChildFocusKt.serializer(i5);
                            iRemoteActionCompatParcelizer = RequestChildFocusKt.write(i9);
                            iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 12:
                        if ((i & i4) != 0) {
                            int i10 = unsafe.getInt(obj, j);
                            iSerializer2 = RequestChildFocusKt.serializer(i5);
                            iRemoteActionCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(i10);
                            iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 13:
                        if ((i & i4) != 0) {
                            iSerializer7 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i5, 4, iSerializer7);
                        }
                        break;
                    case 14:
                        if ((i & i4) != 0) {
                            iSerializer7 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i5, 8, iSerializer7);
                        }
                        break;
                    case 15:
                        if ((i & i4) != 0) {
                            int i11 = unsafe.getInt(obj, j);
                            iSerializer2 = RequestChildFocusKt.serializer(i5);
                            iRemoteActionCompatParcelizer = RequestChildFocusKt.write((i11 << 1) ^ (i11 >> 31));
                            iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 16:
                        if ((i & i4) != 0) {
                            long j4 = unsafe.getLong(obj, j);
                            iSerializer4 = RequestChildFocusKt.serializer(i5);
                            iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer((j4 >> 63) ^ (j4 << 1));
                            iSerializer5 = iIconCompatParcelizer + iSerializer4;
                            iSerializer7 += iSerializer5;
                        }
                        break;
                    case 17:
                        if ((i & i4) != 0) {
                            iIconCompatParcelizer2 = RequestChildFocusKt.serializer(i5, (PlatformFocusOwner) unsafe.getObject(obj, j), serializer(i3));
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 18:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.write(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 19:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.read(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 20:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.RatingCompat(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 21:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.ParcelableVolumeInfo(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 22:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.serializer(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 23:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.write(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 24:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.read(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 25:
                        List list = (List) unsafe.getObject(obj, j);
                        Class cls2 = getDualLoadedSignificandannotations.write;
                        int size = list.size();
                        iSerializer5 = size == 0 ? 0 : (RequestChildFocusKt.serializer(i5) + 1) * size;
                        iSerializer7 += iSerializer5;
                        break;
                    case 26:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.MediaMetadataCompat(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 27:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.serializer(i5, (List) unsafe.getObject(obj, j), serializer(i3));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 28:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 29:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.MediaSessionCompatQueueItem(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 30:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.IconCompatParcelizer(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 31:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.read(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 32:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.write(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 33:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.MediaDescriptionCompat(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        iIconCompatParcelizer2 = getDualLoadedSignificandannotations.MediaBrowserCompatMediaItem(i5, (List) unsafe.getObject(obj, j));
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 35:
                        int iWrite2 = getDualLoadedSignificandannotations.write((List) unsafe.getObject(obj, j));
                        if (iWrite2 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iWrite2, RequestChildFocusKt.serializer(i5), iWrite2, iSerializer7);
                        }
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        int i12 = getDualLoadedSignificandannotations.read((List) unsafe.getObject(obj, j));
                        if (i12 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(i12, RequestChildFocusKt.serializer(i5), i12, iSerializer7);
                        }
                        break;
                    case 37:
                        int iRemoteActionCompatParcelizer4 = getDualLoadedSignificandannotations.RemoteActionCompatParcelizer((List) unsafe.getObject(obj, j));
                        if (iRemoteActionCompatParcelizer4 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer4, RequestChildFocusKt.serializer(i5), iRemoteActionCompatParcelizer4, iSerializer7);
                        }
                        break;
                    case 38:
                        int iMediaBrowserCompatMediaItem = getDualLoadedSignificandannotations.MediaBrowserCompatMediaItem((List) unsafe.getObject(obj, j));
                        if (iMediaBrowserCompatMediaItem > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iMediaBrowserCompatMediaItem, RequestChildFocusKt.serializer(i5), iMediaBrowserCompatMediaItem, iSerializer7);
                        }
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        int iIconCompatParcelizer4 = getDualLoadedSignificandannotations.IconCompatParcelizer((List) unsafe.getObject(obj, j));
                        if (iIconCompatParcelizer4 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iIconCompatParcelizer4, RequestChildFocusKt.serializer(i5), iIconCompatParcelizer4, iSerializer7);
                        }
                        break;
                    case 40:
                        int iWrite3 = getDualLoadedSignificandannotations.write((List) unsafe.getObject(obj, j));
                        if (iWrite3 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iWrite3, RequestChildFocusKt.serializer(i5), iWrite3, iSerializer7);
                        }
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        int i13 = getDualLoadedSignificandannotations.read((List) unsafe.getObject(obj, j));
                        if (i13 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(i13, RequestChildFocusKt.serializer(i5), i13, iSerializer7);
                        }
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        List list2 = (List) unsafe.getObject(obj, j);
                        Class cls3 = getDualLoadedSignificandannotations.write;
                        int size2 = list2.size();
                        if (size2 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(size2, RequestChildFocusKt.serializer(i5), size2, iSerializer7);
                        }
                        break;
                    case 43:
                        int iRatingCompat2 = getDualLoadedSignificandannotations.RatingCompat((List) unsafe.getObject(obj, j));
                        if (iRatingCompat2 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iRatingCompat2, RequestChildFocusKt.serializer(i5), iRatingCompat2, iSerializer7);
                        }
                        break;
                    case 44:
                        int iSerializer10 = getDualLoadedSignificandannotations.serializer((List) unsafe.getObject(obj, j));
                        if (iSerializer10 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iSerializer10, RequestChildFocusKt.serializer(i5), iSerializer10, iSerializer7);
                        }
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        int i14 = getDualLoadedSignificandannotations.read((List) unsafe.getObject(obj, j));
                        if (i14 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(i14, RequestChildFocusKt.serializer(i5), i14, iSerializer7);
                        }
                        break;
                    case 46:
                        int iWrite4 = getDualLoadedSignificandannotations.write((List) unsafe.getObject(obj, j));
                        if (iWrite4 > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iWrite4, RequestChildFocusKt.serializer(i5), iWrite4, iSerializer7);
                        }
                        break;
                    case 47:
                        int iMediaSessionCompatQueueItem = getDualLoadedSignificandannotations.MediaSessionCompatQueueItem((List) unsafe.getObject(obj, j));
                        if (iMediaSessionCompatQueueItem > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatQueueItem, RequestChildFocusKt.serializer(i5), iMediaSessionCompatQueueItem, iSerializer7);
                        }
                        break;
                    case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        int iMediaDescriptionCompat = getDualLoadedSignificandannotations.MediaDescriptionCompat((List) unsafe.getObject(obj, j));
                        if (iMediaDescriptionCompat > 0) {
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iMediaDescriptionCompat, RequestChildFocusKt.serializer(i5), iMediaDescriptionCompat, iSerializer7);
                        }
                        break;
                    case 49:
                        List list3 = (List) unsafe.getObject(obj, j);
                        toStringAsFixed tostringasfixedSerializer2 = serializer(i3);
                        Class cls4 = getDualLoadedSignificandannotations.write;
                        int size3 = list3.size();
                        if (size3 == 0) {
                            iSerializer6 = 0;
                        } else {
                            iSerializer6 = 0;
                            for (int i15 = 0; i15 < size3; i15++) {
                                iSerializer6 += RequestChildFocusKt.serializer(i5, (PlatformFocusOwner) list3.get(i15), tostringasfixedSerializer2);
                            }
                        }
                        iSerializer7 += iSerializer6;
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        Object object3 = unsafe.getObject(obj, j);
                        Object obj2 = read(i3);
                        this.MediaBrowserCompatMediaItem.getClass();
                        iIconCompatParcelizer2 = getYimpl.read(object3, i5, obj2);
                        iSerializer7 += iIconCompatParcelizer2;
                        break;
                    case 51:
                        if (serializer(i5, i3, obj)) {
                            iSerializer7 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i5, 8, iSerializer7);
                        }
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        if (serializer(i5, i3, obj)) {
                            iSerializer7 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i5, 4, iSerializer7);
                        }
                        break;
                    case 53:
                        if (serializer(i5, i3, obj)) {
                            long jWrite = write(j, obj);
                            iSerializer = RequestChildFocusKt.serializer(i5);
                            iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(jWrite);
                            iSerializer4 = iSerializer;
                            iSerializer5 = iIconCompatParcelizer + iSerializer4;
                            iSerializer7 += iSerializer5;
                        }
                        break;
                    case 54:
                        if (serializer(i5, i3, obj)) {
                            long jWrite2 = write(j, obj);
                            iSerializer = RequestChildFocusKt.serializer(i5);
                            iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(jWrite2);
                            iSerializer4 = iSerializer;
                            iSerializer5 = iIconCompatParcelizer + iSerializer4;
                            iSerializer7 += iSerializer5;
                        }
                        break;
                    case 55:
                        if (serializer(i5, i3, obj)) {
                            int iIconCompatParcelizer5 = IconCompatParcelizer(j, obj);
                            iSerializer2 = RequestChildFocusKt.serializer(i5);
                            iRemoteActionCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(iIconCompatParcelizer5);
                            iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 56:
                        if (serializer(i5, i3, obj)) {
                            iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(i5);
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 57:
                        if (serializer(i5, i3, obj)) {
                            iIconCompatParcelizer2 = RequestChildFocusKt.read(i5);
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 58:
                        if (serializer(i5, i3, obj)) {
                            iSerializer7 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i5, 1, iSerializer7);
                        }
                        break;
                    case 59:
                        if (serializer(i5, i3, obj)) {
                            Object object4 = unsafe.getObject(obj, j);
                            if (object4 instanceof moveFocusInChildren3ESFkO8) {
                                int iSerializer11 = RequestChildFocusKt.serializer(i5);
                                int iWrite5 = ((moveFocusInChildren3ESFkO8) object4).write();
                                iSerializer7 = c8$$ExternalSyntheticOutline0.m(iWrite5, iWrite5, iSerializer11, iSerializer7);
                            } else {
                                iSerializer3 = RequestChildFocusKt.serializer(i5);
                                iRemoteActionCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) object4);
                                iSerializer7 = iRemoteActionCompatParcelizer2 + iSerializer3 + iSerializer7;
                            }
                        }
                        break;
                    case 60:
                        if (serializer(i5, i3, obj)) {
                            Object object5 = unsafe.getObject(obj, j);
                            toStringAsFixed tostringasfixedSerializer3 = serializer(i3);
                            Class cls5 = getDualLoadedSignificandannotations.write;
                            int iSerializer12 = RequestChildFocusKt.serializer(i5);
                            int iRemoteActionCompatParcelizer5 = ((PlatformFocusOwner) object5).RemoteActionCompatParcelizer(tostringasfixedSerializer3);
                            iSerializer7 = c8$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer5, iRemoteActionCompatParcelizer5, iSerializer12, iSerializer7);
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                        if (serializer(i5, i3, obj)) {
                            iIconCompatParcelizer2 = RequestChildFocusKt.write(i5, (moveFocusInChildren3ESFkO8) unsafe.getObject(obj, j));
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                        if (serializer(i5, i3, obj)) {
                            int iIconCompatParcelizer6 = IconCompatParcelizer(j, obj);
                            iSerializer2 = RequestChildFocusKt.serializer(i5);
                            iRemoteActionCompatParcelizer = RequestChildFocusKt.write(iIconCompatParcelizer6);
                            iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 63:
                        if (serializer(i5, i3, obj)) {
                            int iIconCompatParcelizer7 = IconCompatParcelizer(j, obj);
                            iSerializer2 = RequestChildFocusKt.serializer(i5);
                            iRemoteActionCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(iIconCompatParcelizer7);
                            iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 64:
                        if (serializer(i5, i3, obj)) {
                            iSerializer7 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i5, 4, iSerializer7);
                        }
                        break;
                    case 65:
                        if (serializer(i5, i3, obj)) {
                            iSerializer7 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i5, 8, iSerializer7);
                        }
                        break;
                    case 66:
                        if (serializer(i5, i3, obj)) {
                            int iIconCompatParcelizer8 = IconCompatParcelizer(j, obj);
                            iSerializer2 = RequestChildFocusKt.serializer(i5);
                            iRemoteActionCompatParcelizer = RequestChildFocusKt.write((iIconCompatParcelizer8 << 1) ^ (iIconCompatParcelizer8 >> 31));
                            iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                    case 67:
                        if (serializer(i5, i3, obj)) {
                            long jWrite3 = write(j, obj);
                            iSerializer4 = RequestChildFocusKt.serializer(i5);
                            iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer((jWrite3 >> 63) ^ (jWrite3 << 1));
                            iSerializer5 = iIconCompatParcelizer + iSerializer4;
                            iSerializer7 += iSerializer5;
                        }
                        break;
                    case 68:
                        if (serializer(i5, i3, obj)) {
                            iIconCompatParcelizer2 = RequestChildFocusKt.serializer(i5, (PlatformFocusOwner) unsafe.getObject(obj, j), serializer(i3));
                            iSerializer7 += iIconCompatParcelizer2;
                        }
                        break;
                }
                i3 += 3;
            } else {
                ((getDualUnsignedFloatMaskannotations) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).getClass();
                return ((isBetterCandidate_I7lrPNgminorAxisDistance) obj).serializer.serializer() + iSerializer7;
            }
        }
    }

    public final void write(Object obj, int i, Object obj2) {
        int iRatingCompat = RatingCompat(i);
        int i2 = this.write[i];
        long j = iRatingCompat & 1048575;
        if (serializer(i2, i, obj2)) {
            deflate deflateVar = getUint64Low32annotations.read;
            Object objMediaBrowserCompatMediaItem = deflateVar.MediaBrowserCompatMediaItem(j, obj);
            Object objMediaBrowserCompatMediaItem2 = deflateVar.MediaBrowserCompatMediaItem(j, obj2);
            if (objMediaBrowserCompatMediaItem != null && objMediaBrowserCompatMediaItem2 != null) {
                getUint64Low32annotations.serializer(j, obj, topLeft.read(objMediaBrowserCompatMediaItem, objMediaBrowserCompatMediaItem2));
                read(i2, i, obj);
            } else if (objMediaBrowserCompatMediaItem2 != null) {
                getUint64Low32annotations.serializer(j, obj, objMediaBrowserCompatMediaItem2);
                read(i2, i, obj);
            }
        }
    }

    public static Field write(Class cls, String str) {
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

    public final int RemoteActionCompatParcelizer(Object obj) {
        int iSerializer;
        int iIconCompatParcelizer;
        int iSerializer2;
        int iRemoteActionCompatParcelizer;
        int iIconCompatParcelizer2;
        int iSerializer3;
        int iRemoteActionCompatParcelizer2;
        int iSerializer4;
        int iIconCompatParcelizer3;
        int iSerializer5;
        Unsafe unsafe = RemoteActionCompatParcelizer;
        int i = 0;
        int iSerializer6 = 0;
        while (true) {
            int[] iArr = this.write;
            if (i >= iArr.length) {
                ((getDualUnsignedFloatMaskannotations) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).getClass();
                return ((isBetterCandidate_I7lrPNgminorAxisDistance) obj).serializer.serializer() + iSerializer6;
            }
            int iRatingCompat = RatingCompat(i);
            int iIconCompatParcelizer4 = IconCompatParcelizer(iRatingCompat);
            int i2 = iArr[i];
            long j = iRatingCompat & 1048575;
            if (iIconCompatParcelizer4 >= findBestCandidate4WY_MpI.DOUBLE_LIST_PACKED.id() && iIconCompatParcelizer4 <= findBestCandidate4WY_MpI.SINT64_LIST_PACKED.id()) {
                int i3 = iArr[i + 2];
            }
            switch (iIconCompatParcelizer4) {
                case 0:
                    if (write(i, obj)) {
                        iSerializer6 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i2, 8, iSerializer6);
                    }
                    break;
                case 1:
                    if (write(i, obj)) {
                        iSerializer6 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i2, 4, iSerializer6);
                    }
                    break;
                case 2:
                    if (write(i, obj)) {
                        long jMediaDescriptionCompat = getUint64Low32annotations.read.MediaDescriptionCompat(j, obj);
                        iSerializer = RequestChildFocusKt.serializer(i2);
                        iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(jMediaDescriptionCompat);
                        iIconCompatParcelizer2 = iIconCompatParcelizer + iSerializer;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 3:
                    if (write(i, obj)) {
                        long jMediaDescriptionCompat2 = getUint64Low32annotations.read.MediaDescriptionCompat(j, obj);
                        iSerializer = RequestChildFocusKt.serializer(i2);
                        iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(jMediaDescriptionCompat2);
                        iIconCompatParcelizer2 = iIconCompatParcelizer + iSerializer;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 4:
                    if (write(i, obj)) {
                        int iSerializer7 = getUint64Low32annotations.read.serializer(j, obj);
                        iSerializer2 = RequestChildFocusKt.serializer(i2);
                        iRemoteActionCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(iSerializer7);
                        iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 5:
                    if (write(i, obj)) {
                        iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(i2);
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 6:
                    if (write(i, obj)) {
                        iIconCompatParcelizer2 = RequestChildFocusKt.read(i2);
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 7:
                    if (write(i, obj)) {
                        iSerializer6 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i2, 1, iSerializer6);
                    }
                    break;
                case 8:
                    if (write(i, obj)) {
                        Object objMediaBrowserCompatMediaItem = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj);
                        if (objMediaBrowserCompatMediaItem instanceof moveFocusInChildren3ESFkO8) {
                            int iSerializer8 = RequestChildFocusKt.serializer(i2);
                            int iWrite = ((moveFocusInChildren3ESFkO8) objMediaBrowserCompatMediaItem).write();
                            iSerializer6 = c8$$ExternalSyntheticOutline0.m(iWrite, iWrite, iSerializer8, iSerializer6);
                        } else {
                            iSerializer3 = RequestChildFocusKt.serializer(i2);
                            iRemoteActionCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) objMediaBrowserCompatMediaItem);
                            iSerializer6 += iRemoteActionCompatParcelizer2 + iSerializer3;
                        }
                    }
                    break;
                case 9:
                    if (write(i, obj)) {
                        Object objMediaBrowserCompatMediaItem2 = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj);
                        toStringAsFixed tostringasfixedSerializer = serializer(i);
                        Class cls = getDualLoadedSignificandannotations.write;
                        int iSerializer9 = RequestChildFocusKt.serializer(i2);
                        int iRemoteActionCompatParcelizer3 = ((PlatformFocusOwner) objMediaBrowserCompatMediaItem2).RemoteActionCompatParcelizer(tostringasfixedSerializer);
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer3, iSerializer9, iSerializer6);
                    }
                    break;
                case 10:
                    if (write(i, obj)) {
                        iIconCompatParcelizer2 = RequestChildFocusKt.write(i2, (moveFocusInChildren3ESFkO8) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj));
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 11:
                    if (write(i, obj)) {
                        int iSerializer10 = getUint64Low32annotations.read.serializer(j, obj);
                        iSerializer2 = RequestChildFocusKt.serializer(i2);
                        iRemoteActionCompatParcelizer = RequestChildFocusKt.write(iSerializer10);
                        iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 12:
                    if (write(i, obj)) {
                        int iSerializer11 = getUint64Low32annotations.read.serializer(j, obj);
                        iSerializer2 = RequestChildFocusKt.serializer(i2);
                        iRemoteActionCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(iSerializer11);
                        iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 13:
                    if (write(i, obj)) {
                        iSerializer6 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i2, 4, iSerializer6);
                    }
                    break;
                case 14:
                    if (write(i, obj)) {
                        iSerializer6 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i2, 8, iSerializer6);
                    }
                    break;
                case 15:
                    if (write(i, obj)) {
                        int iSerializer12 = getUint64Low32annotations.read.serializer(j, obj);
                        iSerializer2 = RequestChildFocusKt.serializer(i2);
                        iRemoteActionCompatParcelizer = RequestChildFocusKt.write((iSerializer12 << 1) ^ (iSerializer12 >> 31));
                        iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 16:
                    if (write(i, obj)) {
                        long jMediaDescriptionCompat3 = getUint64Low32annotations.read.MediaDescriptionCompat(j, obj);
                        iSerializer4 = RequestChildFocusKt.serializer(i2);
                        iIconCompatParcelizer3 = RequestChildFocusKt.IconCompatParcelizer((jMediaDescriptionCompat3 << 1) ^ (jMediaDescriptionCompat3 >> 63));
                        iIconCompatParcelizer2 = iIconCompatParcelizer3 + iSerializer4;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 17:
                    if (write(i, obj)) {
                        iIconCompatParcelizer2 = RequestChildFocusKt.serializer(i2, (PlatformFocusOwner) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj), serializer(i));
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 18:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.write(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 19:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.read(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 20:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.RatingCompat(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 21:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.ParcelableVolumeInfo(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 22:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.serializer(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 23:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.write(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 24:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.read(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 25:
                    List listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j, obj);
                    Class cls2 = getDualLoadedSignificandannotations.write;
                    int size = listRemoteActionCompatParcelizer.size();
                    iSerializer6 += size == 0 ? 0 : (RequestChildFocusKt.serializer(i2) + 1) * size;
                    break;
                case 26:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.MediaMetadataCompat(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 27:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.serializer(i2, RemoteActionCompatParcelizer(j, obj), serializer(i));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 28:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 29:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.MediaSessionCompatQueueItem(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 30:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.IconCompatParcelizer(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 31:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.read(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 32:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.write(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 33:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.MediaDescriptionCompat(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    iIconCompatParcelizer2 = getDualLoadedSignificandannotations.MediaBrowserCompatMediaItem(i2, RemoteActionCompatParcelizer(j, obj));
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 35:
                    int iWrite2 = getDualLoadedSignificandannotations.write((List) unsafe.getObject(obj, j));
                    if (iWrite2 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iWrite2, RequestChildFocusKt.serializer(i2), iWrite2, iSerializer6);
                    }
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int i4 = getDualLoadedSignificandannotations.read((List) unsafe.getObject(obj, j));
                    if (i4 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(i4, RequestChildFocusKt.serializer(i2), i4, iSerializer6);
                    }
                    break;
                case 37:
                    int iRemoteActionCompatParcelizer4 = getDualLoadedSignificandannotations.RemoteActionCompatParcelizer((List) unsafe.getObject(obj, j));
                    if (iRemoteActionCompatParcelizer4 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer4, RequestChildFocusKt.serializer(i2), iRemoteActionCompatParcelizer4, iSerializer6);
                    }
                    break;
                case 38:
                    int iMediaBrowserCompatMediaItem = getDualLoadedSignificandannotations.MediaBrowserCompatMediaItem((List) unsafe.getObject(obj, j));
                    if (iMediaBrowserCompatMediaItem > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iMediaBrowserCompatMediaItem, RequestChildFocusKt.serializer(i2), iMediaBrowserCompatMediaItem, iSerializer6);
                    }
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int iIconCompatParcelizer5 = getDualLoadedSignificandannotations.IconCompatParcelizer((List) unsafe.getObject(obj, j));
                    if (iIconCompatParcelizer5 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iIconCompatParcelizer5, RequestChildFocusKt.serializer(i2), iIconCompatParcelizer5, iSerializer6);
                    }
                    break;
                case 40:
                    int iWrite3 = getDualLoadedSignificandannotations.write((List) unsafe.getObject(obj, j));
                    if (iWrite3 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iWrite3, RequestChildFocusKt.serializer(i2), iWrite3, iSerializer6);
                    }
                    break;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    int i5 = getDualLoadedSignificandannotations.read((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(i5, RequestChildFocusKt.serializer(i2), i5, iSerializer6);
                    }
                    break;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls3 = getDualLoadedSignificandannotations.write;
                    int size2 = list.size();
                    if (size2 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(size2, RequestChildFocusKt.serializer(i2), size2, iSerializer6);
                    }
                    break;
                case 43:
                    int iRatingCompat2 = getDualLoadedSignificandannotations.RatingCompat((List) unsafe.getObject(obj, j));
                    if (iRatingCompat2 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iRatingCompat2, RequestChildFocusKt.serializer(i2), iRatingCompat2, iSerializer6);
                    }
                    break;
                case 44:
                    int iSerializer13 = getDualLoadedSignificandannotations.serializer((List) unsafe.getObject(obj, j));
                    if (iSerializer13 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iSerializer13, RequestChildFocusKt.serializer(i2), iSerializer13, iSerializer6);
                    }
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int i6 = getDualLoadedSignificandannotations.read((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(i6, RequestChildFocusKt.serializer(i2), i6, iSerializer6);
                    }
                    break;
                case 46:
                    int iWrite4 = getDualLoadedSignificandannotations.write((List) unsafe.getObject(obj, j));
                    if (iWrite4 > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iWrite4, RequestChildFocusKt.serializer(i2), iWrite4, iSerializer6);
                    }
                    break;
                case 47:
                    int iMediaSessionCompatQueueItem = getDualLoadedSignificandannotations.MediaSessionCompatQueueItem((List) unsafe.getObject(obj, j));
                    if (iMediaSessionCompatQueueItem > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatQueueItem, RequestChildFocusKt.serializer(i2), iMediaSessionCompatQueueItem, iSerializer6);
                    }
                    break;
                case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                    int iMediaDescriptionCompat = getDualLoadedSignificandannotations.MediaDescriptionCompat((List) unsafe.getObject(obj, j));
                    if (iMediaDescriptionCompat > 0) {
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iMediaDescriptionCompat, RequestChildFocusKt.serializer(i2), iMediaDescriptionCompat, iSerializer6);
                    }
                    break;
                case 49:
                    List listRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(j, obj);
                    toStringAsFixed tostringasfixedSerializer2 = serializer(i);
                    Class cls4 = getDualLoadedSignificandannotations.write;
                    int size3 = listRemoteActionCompatParcelizer2.size();
                    if (size3 == 0) {
                        iSerializer5 = 0;
                    } else {
                        iSerializer5 = 0;
                        for (int i7 = 0; i7 < size3; i7++) {
                            iSerializer5 += RequestChildFocusKt.serializer(i2, (PlatformFocusOwner) listRemoteActionCompatParcelizer2.get(i7), tostringasfixedSerializer2);
                        }
                    }
                    iSerializer6 += iSerializer5;
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    Object objMediaBrowserCompatMediaItem3 = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj);
                    Object obj2 = read(i);
                    this.MediaBrowserCompatMediaItem.getClass();
                    iIconCompatParcelizer2 = getYimpl.read(objMediaBrowserCompatMediaItem3, i2, obj2);
                    iSerializer6 += iIconCompatParcelizer2;
                    break;
                case 51:
                    if (serializer(i2, i, obj)) {
                        iSerializer6 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i2, 8, iSerializer6);
                    }
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (serializer(i2, i, obj)) {
                        iSerializer6 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i2, 4, iSerializer6);
                    }
                    break;
                case 53:
                    if (serializer(i2, i, obj)) {
                        long jWrite = write(j, obj);
                        iSerializer = RequestChildFocusKt.serializer(i2);
                        iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(jWrite);
                        iIconCompatParcelizer2 = iIconCompatParcelizer + iSerializer;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 54:
                    if (serializer(i2, i, obj)) {
                        long jWrite2 = write(j, obj);
                        iSerializer = RequestChildFocusKt.serializer(i2);
                        iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(jWrite2);
                        iIconCompatParcelizer2 = iIconCompatParcelizer + iSerializer;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 55:
                    if (serializer(i2, i, obj)) {
                        int iIconCompatParcelizer6 = IconCompatParcelizer(j, obj);
                        iSerializer2 = RequestChildFocusKt.serializer(i2);
                        iRemoteActionCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(iIconCompatParcelizer6);
                        iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 56:
                    if (serializer(i2, i, obj)) {
                        iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(i2);
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 57:
                    if (serializer(i2, i, obj)) {
                        iIconCompatParcelizer2 = RequestChildFocusKt.read(i2);
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 58:
                    if (serializer(i2, i, obj)) {
                        iSerializer6 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i2, 1, iSerializer6);
                    }
                    break;
                case 59:
                    if (serializer(i2, i, obj)) {
                        Object objMediaBrowserCompatMediaItem4 = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj);
                        if (objMediaBrowserCompatMediaItem4 instanceof moveFocusInChildren3ESFkO8) {
                            int iSerializer14 = RequestChildFocusKt.serializer(i2);
                            int iWrite5 = ((moveFocusInChildren3ESFkO8) objMediaBrowserCompatMediaItem4).write();
                            iSerializer6 = c8$$ExternalSyntheticOutline0.m(iWrite5, iWrite5, iSerializer14, iSerializer6);
                        } else {
                            iSerializer3 = RequestChildFocusKt.serializer(i2);
                            iRemoteActionCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) objMediaBrowserCompatMediaItem4);
                            iSerializer6 += iRemoteActionCompatParcelizer2 + iSerializer3;
                        }
                    }
                    break;
                case 60:
                    if (serializer(i2, i, obj)) {
                        Object objMediaBrowserCompatMediaItem5 = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj);
                        toStringAsFixed tostringasfixedSerializer3 = serializer(i);
                        Class cls5 = getDualLoadedSignificandannotations.write;
                        int iSerializer15 = RequestChildFocusKt.serializer(i2);
                        int iRemoteActionCompatParcelizer5 = ((PlatformFocusOwner) objMediaBrowserCompatMediaItem5).RemoteActionCompatParcelizer(tostringasfixedSerializer3);
                        iSerializer6 = c8$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer5, iRemoteActionCompatParcelizer5, iSerializer15, iSerializer6);
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                    if (serializer(i2, i, obj)) {
                        iIconCompatParcelizer2 = RequestChildFocusKt.write(i2, (moveFocusInChildren3ESFkO8) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj));
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                    if (serializer(i2, i, obj)) {
                        int iIconCompatParcelizer7 = IconCompatParcelizer(j, obj);
                        iSerializer2 = RequestChildFocusKt.serializer(i2);
                        iRemoteActionCompatParcelizer = RequestChildFocusKt.write(iIconCompatParcelizer7);
                        iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 63:
                    if (serializer(i2, i, obj)) {
                        int iIconCompatParcelizer8 = IconCompatParcelizer(j, obj);
                        iSerializer2 = RequestChildFocusKt.serializer(i2);
                        iRemoteActionCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(iIconCompatParcelizer8);
                        iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 64:
                    if (serializer(i2, i, obj)) {
                        iSerializer6 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i2, 4, iSerializer6);
                    }
                    break;
                case 65:
                    if (serializer(i2, i, obj)) {
                        iSerializer6 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(i2, 8, iSerializer6);
                    }
                    break;
                case 66:
                    if (serializer(i2, i, obj)) {
                        int iIconCompatParcelizer9 = IconCompatParcelizer(j, obj);
                        iSerializer2 = RequestChildFocusKt.serializer(i2);
                        iRemoteActionCompatParcelizer = RequestChildFocusKt.write((iIconCompatParcelizer9 << 1) ^ (iIconCompatParcelizer9 >> 31));
                        iIconCompatParcelizer2 = iRemoteActionCompatParcelizer + iSerializer2;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 67:
                    if (serializer(i2, i, obj)) {
                        long jWrite3 = write(j, obj);
                        iSerializer4 = RequestChildFocusKt.serializer(i2);
                        iIconCompatParcelizer3 = RequestChildFocusKt.IconCompatParcelizer((jWrite3 << 1) ^ (jWrite3 >> 63));
                        iIconCompatParcelizer2 = iIconCompatParcelizer3 + iSerializer4;
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
                case 68:
                    if (serializer(i2, i, obj)) {
                        iIconCompatParcelizer2 = RequestChildFocusKt.serializer(i2, (PlatformFocusOwner) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj), serializer(i));
                        iSerializer6 += iIconCompatParcelizer2;
                    }
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013d  */
    /* JADX WARN: Code duplicated, block: B:48:0x014c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0158  */
    /* JADX WARN: Code duplicated, block: B:50:0x0168  */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:52:0x017f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0186  */
    /* JADX WARN: Code duplicated, block: B:54:0x0192  */
    /* JADX WARN: Code duplicated, block: B:56:0x0196  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01da  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0207  */
    /* JADX WARN: Code duplicated, block: B:72:0x020d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0148 A[SYNTHETIC] */
    public final void IconCompatParcelizer(copyOHQCggkdefault copyohqcggkdefault, int i, Object obj, int i2) throws IOException {
        int iIconCompatParcelizer;
        int iMediaSessionCompatToken;
        int iWrite;
        int iSerializer;
        int iMediaSessionCompatToken2;
        int iWrite2;
        if (obj != null) {
            Object obj2 = read(i2);
            this.MediaBrowserCompatMediaItem.getClass();
            androidx.emoji2.text.EmojiProcessor emojiProcessor = ((getXimpl) obj2).IconCompatParcelizer;
            getHeight getheight = (getHeight) emojiProcessor.read;
            getHeight getheight2 = (getHeight) emojiProcessor.serializer;
            RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
            requestChildFocusKt.getClass();
            for (Map.Entry entry : ((getYannotations) obj).entrySet()) {
                requestChildFocusKt.RemoteActionCompatParcelizer(i, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i3 = beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.write;
                int iSerializer2 = RequestChildFocusKt.serializer(1);
                getHeight getheight3 = getHeight.GROUP;
                if (getheight2 == getheight3) {
                    iSerializer2 *= 2;
                }
                int[] iArr = bottomRight.read;
                int iIconCompatParcelizer2 = 4;
                switch (iArr[getheight2.ordinal()]) {
                    case 1:
                        ((Double) key).getClass();
                        iIconCompatParcelizer = 8;
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key2);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value2);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key3 = entry.getKey();
                                Object value3 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key3);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value3);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key4 = entry.getKey();
                                Object value4 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key4);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value4);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key5 = entry.getKey();
                                Object value5 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key5);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value5);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key6 = entry.getKey();
                                Object value6 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key6);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value6);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key7 = entry.getKey();
                                Object value7 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key7);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value7);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key8 = entry.getKey();
                                Object value8 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key8);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value8);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key9 = entry.getKey();
                                Object value9 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key9);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value9);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key10 = entry.getKey();
                                Object value10 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key10);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value10);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11 = entry.getKey();
                                Object value11 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key12 = entry.getKey();
                                Object value12 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key12);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value12);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key13 = entry.getKey();
                                Object value13 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key13);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value13);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key14 = entry.getKey();
                                Object value14 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key14);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value14);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key15 = entry.getKey();
                                Object value15 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key15);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value15);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key16 = entry.getKey();
                                Object value16 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key16);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value16);
                                break;
                            case 16:
                                int iIntValue = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue << 1) ^ (iIntValue >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key17 = entry.getKey();
                                Object value17 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key17);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value17);
                                break;
                            case 17:
                                long jLongValue = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue << 1) ^ (jLongValue >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key18 = entry.getKey();
                                Object value18 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key18);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value18);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key19 = entry.getKey();
                                Object value19 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key19);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value19);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 2:
                        ((Float) key).getClass();
                        iIconCompatParcelizer = 4;
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key110 = entry.getKey();
                                Object value110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111 = entry.getKey();
                                Object value111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key112 = entry.getKey();
                                Object value112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value112);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key113 = entry.getKey();
                                Object value113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value113);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key114 = entry.getKey();
                                Object value114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key115 = entry.getKey();
                                Object value115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key116 = entry.getKey();
                                Object value116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key117 = entry.getKey();
                                Object value117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value117);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key118 = entry.getKey();
                                Object value118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value118);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key119 = entry.getKey();
                                Object value119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value119);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1110 = entry.getKey();
                                Object value1110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1110);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111 = entry.getKey();
                                Object value1111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1112 = entry.getKey();
                                Object value1112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1113 = entry.getKey();
                                Object value1113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1114 = entry.getKey();
                                Object value1114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1114);
                                break;
                            case 16:
                                int iIntValue2 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue2 << 1) ^ (iIntValue2 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1115 = entry.getKey();
                                Object value1115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1115);
                                break;
                            case 17:
                                long jLongValue2 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue2 << 1) ^ (jLongValue2 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1116 = entry.getKey();
                                Object value1116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1116);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1117 = entry.getKey();
                                Object value1117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1117);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 3:
                        iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(((Long) key).longValue());
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1118 = entry.getKey();
                                Object value1118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1119 = entry.getKey();
                                Object value1119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1119);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11110 = entry.getKey();
                                Object value11110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11110);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111 = entry.getKey();
                                Object value11111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11112 = entry.getKey();
                                Object value11112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11113 = entry.getKey();
                                Object value11113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11114 = entry.getKey();
                                Object value11114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11115 = entry.getKey();
                                Object value11115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11115);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11116 = entry.getKey();
                                Object value11116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11116);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11117 = entry.getKey();
                                Object value11117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11117);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11118 = entry.getKey();
                                Object value11118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11118);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11119 = entry.getKey();
                                Object value11119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11119);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111110 = entry.getKey();
                                Object value111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111 = entry.getKey();
                                Object value111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111112 = entry.getKey();
                                Object value111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111112);
                                break;
                            case 16:
                                int iIntValue3 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue3 << 1) ^ (iIntValue3 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111113 = entry.getKey();
                                Object value111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111113);
                                break;
                            case 17:
                                long jLongValue3 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111114 = entry.getKey();
                                Object value111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111114);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111115 = entry.getKey();
                                Object value111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111115);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 4:
                        iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(((Long) key).longValue());
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111116 = entry.getKey();
                                Object value111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111116);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111117 = entry.getKey();
                                Object value111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111117);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111118 = entry.getKey();
                                Object value111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111118);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111119 = entry.getKey();
                                Object value111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111119);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111110 = entry.getKey();
                                Object value1111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111110);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111 = entry.getKey();
                                Object value1111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111112 = entry.getKey();
                                Object value1111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111112);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111113 = entry.getKey();
                                Object value1111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111113);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111114 = entry.getKey();
                                Object value1111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111114);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111115 = entry.getKey();
                                Object value1111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111115);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111116 = entry.getKey();
                                Object value1111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111116);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111117 = entry.getKey();
                                Object value1111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111117);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111118 = entry.getKey();
                                Object value1111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111118);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111119 = entry.getKey();
                                Object value1111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111119);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111110 = entry.getKey();
                                Object value11111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111110);
                                break;
                            case 16:
                                int iIntValue4 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue4 << 1) ^ (iIntValue4 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111 = entry.getKey();
                                Object value11111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111);
                                break;
                            case 17:
                                long jLongValue4 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue4 << 1) ^ (jLongValue4 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111112 = entry.getKey();
                                Object value11111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111112);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111113 = entry.getKey();
                                Object value11111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111113);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 5:
                        iIconCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) key).intValue());
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111114 = entry.getKey();
                                Object value11111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111114);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111115 = entry.getKey();
                                Object value11111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111115);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111116 = entry.getKey();
                                Object value11111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111116);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111117 = entry.getKey();
                                Object value11111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111117);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111118 = entry.getKey();
                                Object value11111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111118);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111119 = entry.getKey();
                                Object value11111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111119);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111110 = entry.getKey();
                                Object value111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111110);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111 = entry.getKey();
                                Object value111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111112 = entry.getKey();
                                Object value111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111112);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111113 = entry.getKey();
                                Object value111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111113);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111114 = entry.getKey();
                                Object value111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111114);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111115 = entry.getKey();
                                Object value111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111115);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111116 = entry.getKey();
                                Object value111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111116);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111117 = entry.getKey();
                                Object value111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111117);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111118 = entry.getKey();
                                Object value111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111118);
                                break;
                            case 16:
                                int iIntValue5 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue5 << 1) ^ (iIntValue5 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111119 = entry.getKey();
                                Object value111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111119);
                                break;
                            case 17:
                                long jLongValue5 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue5 << 1) ^ (jLongValue5 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111110 = entry.getKey();
                                Object value1111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111110);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111 = entry.getKey();
                                Object value1111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 6:
                        ((Long) key).getClass();
                        iIconCompatParcelizer = 8;
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111112 = entry.getKey();
                                Object value1111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111112);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111113 = entry.getKey();
                                Object value1111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111113);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111114 = entry.getKey();
                                Object value1111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111114);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111115 = entry.getKey();
                                Object value1111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111115);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111116 = entry.getKey();
                                Object value1111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111116);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111117 = entry.getKey();
                                Object value1111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111117);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111118 = entry.getKey();
                                Object value1111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111118);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111119 = entry.getKey();
                                Object value1111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111119);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111110 = entry.getKey();
                                Object value11111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111110);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111 = entry.getKey();
                                Object value11111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111112 = entry.getKey();
                                Object value11111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111112);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111113 = entry.getKey();
                                Object value11111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111113);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111114 = entry.getKey();
                                Object value11111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111114);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111115 = entry.getKey();
                                Object value11111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111115);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111116 = entry.getKey();
                                Object value11111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111116);
                                break;
                            case 16:
                                int iIntValue6 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue6 << 1) ^ (iIntValue6 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111117 = entry.getKey();
                                Object value11111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111117);
                                break;
                            case 17:
                                long jLongValue6 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue6 << 1) ^ (jLongValue6 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111118 = entry.getKey();
                                Object value11111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111118);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111119 = entry.getKey();
                                Object value11111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111119);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 7:
                        ((Integer) key).getClass();
                        iIconCompatParcelizer = 4;
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111110 = entry.getKey();
                                Object value111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111 = entry.getKey();
                                Object value111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111112 = entry.getKey();
                                Object value111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111112);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111113 = entry.getKey();
                                Object value111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111113);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111114 = entry.getKey();
                                Object value111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111115 = entry.getKey();
                                Object value111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111116 = entry.getKey();
                                Object value111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111117 = entry.getKey();
                                Object value111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111117);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111118 = entry.getKey();
                                Object value111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111118);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111119 = entry.getKey();
                                Object value111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111119);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111110 = entry.getKey();
                                Object value1111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111110);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111 = entry.getKey();
                                Object value1111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111112 = entry.getKey();
                                Object value1111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111113 = entry.getKey();
                                Object value1111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111114 = entry.getKey();
                                Object value1111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111114);
                                break;
                            case 16:
                                int iIntValue7 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue7 << 1) ^ (iIntValue7 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111115 = entry.getKey();
                                Object value1111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111115);
                                break;
                            case 17:
                                long jLongValue7 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue7 << 1) ^ (jLongValue7 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111116 = entry.getKey();
                                Object value1111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111116);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111117 = entry.getKey();
                                Object value1111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111117);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 8:
                        ((Boolean) key).getClass();
                        iIconCompatParcelizer = 1;
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111118 = entry.getKey();
                                Object value1111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111119 = entry.getKey();
                                Object value1111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111119);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111110 = entry.getKey();
                                Object value11111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111110);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111 = entry.getKey();
                                Object value11111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111112 = entry.getKey();
                                Object value11111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111113 = entry.getKey();
                                Object value11111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111114 = entry.getKey();
                                Object value11111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111115 = entry.getKey();
                                Object value11111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111115);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111116 = entry.getKey();
                                Object value11111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111116);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111117 = entry.getKey();
                                Object value11111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111117);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111118 = entry.getKey();
                                Object value11111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111118);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111119 = entry.getKey();
                                Object value11111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111119);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111110 = entry.getKey();
                                Object value111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111 = entry.getKey();
                                Object value111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111112 = entry.getKey();
                                Object value111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111112);
                                break;
                            case 16:
                                int iIntValue8 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue8 << 1) ^ (iIntValue8 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111113 = entry.getKey();
                                Object value111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111113);
                                break;
                            case 17:
                                long jLongValue8 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue8 << 1) ^ (jLongValue8 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111114 = entry.getKey();
                                Object value111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111114);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111115 = entry.getKey();
                                Object value111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111115);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 9:
                        iIconCompatParcelizer = ((PlatformFocusOwner) key).MediaSessionCompatToken();
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111116 = entry.getKey();
                                Object value111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111116);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111117 = entry.getKey();
                                Object value111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111117);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111118 = entry.getKey();
                                Object value111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111118);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111119 = entry.getKey();
                                Object value111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111119);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111110 = entry.getKey();
                                Object value1111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111110);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111 = entry.getKey();
                                Object value1111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111112 = entry.getKey();
                                Object value1111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111112);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111113 = entry.getKey();
                                Object value1111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111113);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111114 = entry.getKey();
                                Object value1111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111114);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111115 = entry.getKey();
                                Object value1111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111115);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111116 = entry.getKey();
                                Object value1111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111116);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111117 = entry.getKey();
                                Object value1111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111117);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111118 = entry.getKey();
                                Object value1111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111118);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111119 = entry.getKey();
                                Object value1111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111119);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111110 = entry.getKey();
                                Object value11111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111110);
                                break;
                            case 16:
                                int iIntValue9 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue9 << 1) ^ (iIntValue9 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111 = entry.getKey();
                                Object value11111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111);
                                break;
                            case 17:
                                long jLongValue9 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue9 << 1) ^ (jLongValue9 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111112 = entry.getKey();
                                Object value11111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111112);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111113 = entry.getKey();
                                Object value11111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111113);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 10:
                        iMediaSessionCompatToken = ((PlatformFocusOwner) key).MediaSessionCompatToken();
                        iWrite = RequestChildFocusKt.write(iMediaSessionCompatToken);
                        iIconCompatParcelizer = iMediaSessionCompatToken + iWrite;
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111114 = entry.getKey();
                                Object value11111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111114);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111115 = entry.getKey();
                                Object value11111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111115);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111116 = entry.getKey();
                                Object value11111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111116);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111117 = entry.getKey();
                                Object value11111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111117);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111118 = entry.getKey();
                                Object value11111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111118);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111119 = entry.getKey();
                                Object value11111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111119);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111110 = entry.getKey();
                                Object value111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111110);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111 = entry.getKey();
                                Object value111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111112 = entry.getKey();
                                Object value111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111112);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111113 = entry.getKey();
                                Object value111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111113);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111114 = entry.getKey();
                                Object value111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111114);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111115 = entry.getKey();
                                Object value111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111115);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111116 = entry.getKey();
                                Object value111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111116);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111117 = entry.getKey();
                                Object value111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111117);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111118 = entry.getKey();
                                Object value111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111118);
                                break;
                            case 16:
                                int iIntValue10 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue10 << 1) ^ (iIntValue10 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111119 = entry.getKey();
                                Object value111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111119);
                                break;
                            case 17:
                                long jLongValue10 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue10 << 1) ^ (jLongValue10 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111110 = entry.getKey();
                                Object value1111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111110);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111 = entry.getKey();
                                Object value1111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 11:
                        if (key instanceof moveFocusInChildren3ESFkO8) {
                            iMediaSessionCompatToken = ((moveFocusInChildren3ESFkO8) key).write();
                            iWrite = RequestChildFocusKt.write(iMediaSessionCompatToken);
                            iIconCompatParcelizer = iMediaSessionCompatToken + iWrite;
                        } else {
                            iIconCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer((String) key);
                        }
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111112 = entry.getKey();
                                Object value1111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111112);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111113 = entry.getKey();
                                Object value1111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111113);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111114 = entry.getKey();
                                Object value1111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111114);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111115 = entry.getKey();
                                Object value1111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111115);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111116 = entry.getKey();
                                Object value1111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111116);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111117 = entry.getKey();
                                Object value1111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111117);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111118 = entry.getKey();
                                Object value1111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111118);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111119 = entry.getKey();
                                Object value1111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111119);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111110 = entry.getKey();
                                Object value11111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111110);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111 = entry.getKey();
                                Object value11111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111112 = entry.getKey();
                                Object value11111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111112);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111113 = entry.getKey();
                                Object value11111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111113);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111114 = entry.getKey();
                                Object value11111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111114);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111115 = entry.getKey();
                                Object value11111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111115);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111116 = entry.getKey();
                                Object value11111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111116);
                                break;
                            case 16:
                                int iIntValue11 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue11 << 1) ^ (iIntValue11 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111117 = entry.getKey();
                                Object value11111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111117);
                                break;
                            case 17:
                                long jLongValue11 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue11 << 1) ^ (jLongValue11 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111118 = entry.getKey();
                                Object value11111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111118);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111119 = entry.getKey();
                                Object value11111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111119);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 12:
                        if (key instanceof moveFocusInChildren3ESFkO8) {
                            iMediaSessionCompatToken = ((moveFocusInChildren3ESFkO8) key).write();
                            iWrite = RequestChildFocusKt.write(iMediaSessionCompatToken);
                        } else {
                            iMediaSessionCompatToken = ((byte[]) key).length;
                            iWrite = RequestChildFocusKt.write(iMediaSessionCompatToken);
                        }
                        iIconCompatParcelizer = iMediaSessionCompatToken + iWrite;
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111110 = entry.getKey();
                                Object value111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111 = entry.getKey();
                                Object value111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111112 = entry.getKey();
                                Object value111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111112);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111113 = entry.getKey();
                                Object value111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111113);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111114 = entry.getKey();
                                Object value111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111115 = entry.getKey();
                                Object value111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111116 = entry.getKey();
                                Object value111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111117 = entry.getKey();
                                Object value111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111117);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111118 = entry.getKey();
                                Object value111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111118);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111119 = entry.getKey();
                                Object value111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111119);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111110 = entry.getKey();
                                Object value1111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111110);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111112 = entry.getKey();
                                Object value1111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111113 = entry.getKey();
                                Object value1111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111114 = entry.getKey();
                                Object value1111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111114);
                                break;
                            case 16:
                                int iIntValue12 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue12 << 1) ^ (iIntValue12 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111115 = entry.getKey();
                                Object value1111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111115);
                                break;
                            case 17:
                                long jLongValue12 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue12 << 1) ^ (jLongValue12 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111116 = entry.getKey();
                                Object value1111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111116);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111117 = entry.getKey();
                                Object value1111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111117);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 13:
                        iIconCompatParcelizer = RequestChildFocusKt.write(((Integer) key).intValue());
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111118 = entry.getKey();
                                Object value1111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111119 = entry.getKey();
                                Object value1111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111119);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111110 = entry.getKey();
                                Object value11111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111110);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111112 = entry.getKey();
                                Object value11111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111113 = entry.getKey();
                                Object value11111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111114 = entry.getKey();
                                Object value11111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111115 = entry.getKey();
                                Object value11111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111115);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111116 = entry.getKey();
                                Object value11111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111116);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111117 = entry.getKey();
                                Object value11111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111117);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111118 = entry.getKey();
                                Object value11111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111118);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111119 = entry.getKey();
                                Object value11111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111119);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111112);
                                break;
                            case 16:
                                int iIntValue13 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue13 << 1) ^ (iIntValue13 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111113);
                                break;
                            case 17:
                                long jLongValue13 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue13 << 1) ^ (jLongValue13 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111114);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111115);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 14:
                        ((Integer) key).getClass();
                        iIconCompatParcelizer = 4;
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111116);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111117);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111118);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111119);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111110);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111112);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111113);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111114);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111115);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111116);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111117);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111118);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111119);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111110);
                                break;
                            case 16:
                                int iIntValue14 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue14 << 1) ^ (iIntValue14 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111);
                                break;
                            case 17:
                                long jLongValue14 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue14 << 1) ^ (jLongValue14 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111112);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111113);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 15:
                        ((Long) key).getClass();
                        iIconCompatParcelizer = 8;
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111114);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111115);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111116);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111117);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111118);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111119);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111110);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111112);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111113);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111114);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111115);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111116);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111117);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111118);
                                break;
                            case 16:
                                int iIntValue15 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue15 << 1) ^ (iIntValue15 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111119);
                                break;
                            case 17:
                                long jLongValue15 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue15 << 1) ^ (jLongValue15 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111110);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 16:
                        int iIntValue16 = ((Integer) key).intValue();
                        iIconCompatParcelizer = RequestChildFocusKt.write((iIntValue16 << 1) ^ (iIntValue16 >> 31));
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111112);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111113);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111114);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111115);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111116);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111117);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111118);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111119);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111110);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111112);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111113);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111114);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111115);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111116);
                                break;
                            case 16:
                                int iIntValue17 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue17 << 1) ^ (iIntValue17 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111117);
                                break;
                            case 17:
                                long jLongValue16 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue16 << 1) ^ (jLongValue16 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111118);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111119);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 17:
                        long jLongValue17 = ((Long) key).longValue();
                        iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer((jLongValue17 << 1) ^ (jLongValue17 >> 63));
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111111);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111112);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111113);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111117);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111118);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111119);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111110);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111111);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111114);
                                break;
                            case 16:
                                int iIntValue18 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue18 << 1) ^ (iIntValue18 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111115);
                                break;
                            case 17:
                                long jLongValue18 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111116);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111117);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 18:
                        iIconCompatParcelizer = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) key).intValue());
                        iSerializer = RequestChildFocusKt.serializer(2);
                        if (getheight == getheight3) {
                            iSerializer *= 2;
                        }
                        switch (iArr[getheight.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key1111111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key1111111111111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value1111111111111111111111111111119);
                                break;
                            case 3:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111110);
                                break;
                            case 4:
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(((Long) value).longValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111111);
                                break;
                            case 5:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iIconCompatParcelizer2 = 1;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111115);
                                break;
                            case 9:
                                iIconCompatParcelizer2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111111116 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111116);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111116);
                                break;
                            case 10:
                                iMediaSessionCompatToken2 = ((PlatformFocusOwner) value).MediaSessionCompatToken();
                                iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111111117 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111117);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111117);
                                break;
                            case 11:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                    iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                } else {
                                    iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer((String) value);
                                }
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111111118 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111118);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111118);
                                break;
                            case 12:
                                if (value instanceof moveFocusInChildren3ESFkO8) {
                                    iMediaSessionCompatToken2 = ((moveFocusInChildren3ESFkO8) value).write();
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                } else {
                                    iMediaSessionCompatToken2 = ((byte[]) value).length;
                                    iWrite2 = RequestChildFocusKt.write(iMediaSessionCompatToken2);
                                }
                                iIconCompatParcelizer2 = iWrite2 + iMediaSessionCompatToken2;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key11111111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111111119 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key11111111111111111111111111111119);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value11111111111111111111111111111119);
                                break;
                            case 13:
                                iIconCompatParcelizer2 = RequestChildFocusKt.write(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111111110 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111111110);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111111 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111111111);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iIconCompatParcelizer2 = 8;
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111111112 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111111112);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111111112);
                                break;
                            case 16:
                                int iIntValue19 = ((Integer) value).intValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.write((iIntValue19 << 1) ^ (iIntValue19 >> 31));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111111113 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111111113);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111111113);
                                break;
                            case 17:
                                long jLongValue19 = ((Long) value).longValue();
                                iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer((jLongValue19 << 1) ^ (jLongValue19 >> 63));
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111111114 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111111114);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111111114);
                                break;
                            case 18:
                                iIconCompatParcelizer2 = RequestChildFocusKt.RemoteActionCompatParcelizer(((Integer) value).intValue());
                                requestChildFocusKt.ParcelableVolumeInfo(iIconCompatParcelizer2 + iSerializer + iIconCompatParcelizer + iSerializer2);
                                Object key111111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111111115 = entry.getValue();
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight2, 1, key111111111111111111111111111111115);
                                beamBeats_I7lrPNgmajorAxisDistanceToFarEdge.RemoteActionCompatParcelizer(requestChildFocusKt, getheight, 2, value111111111111111111111111111111115);
                                break;
                            default:
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        break;
                }
                return;
            }
        }
    }

    public final void serializer(Object obj, copyOHQCggkdefault copyohqcggkdefault) throws IOException {
        int i;
        int[] iArr = this.write;
        int length = iArr.length;
        Unsafe unsafe = RemoteActionCompatParcelizer;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iRatingCompat = RatingCompat(i4);
            int i5 = iArr[i4];
            int iIconCompatParcelizer = IconCompatParcelizer(iRatingCompat);
            if (this.PlaybackStateCompatCustomAction || iIconCompatParcelizer > 17) {
                i = 0;
            } else {
                int i6 = iArr[i4 + 2];
                int i7 = i6 & 1048575;
                if (i7 != i2) {
                    i3 = unsafe.getInt(obj, i7);
                    i2 = i7;
                }
                i = 1 << (i6 >>> 20);
            }
            long j = iRatingCompat & 1048575;
            switch (iIconCompatParcelizer) {
                case 0:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.read(getUint64Low32annotations.read.IconCompatParcelizer(j, obj), i5);
                        continue;
                    }
                    break;
                case 1:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.IconCompatParcelizer(getUint64Low32annotations.read.RemoteActionCompatParcelizer(j, obj), i5);
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.RemoteActionCompatParcelizer(i5, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.serializer(i5, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.read(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.IconCompatParcelizer(i5, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.IconCompatParcelizer(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 7:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.write(i5, getUint64Low32annotations.read.write(j, obj));
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    if ((i & i3) != 0) {
                        write(i5, unsafe.getObject(obj, j), copyohqcggkdefault);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.serializer(i5, unsafe.getObject(obj, j), serializer(i4));
                    } else {
                        continue;
                    }
                    break;
                case 10:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.read(i5, (moveFocusInChildren3ESFkO8) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.MediaSessionCompatQueueItem(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 12:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.RemoteActionCompatParcelizer(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 13:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.serializer(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.read(i5, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 15:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.write(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 16:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.write(i5, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 17:
                    if ((i & i3) != 0) {
                        copyohqcggkdefault.RemoteActionCompatParcelizer(i5, unsafe.getObject(obj, j), serializer(i4));
                    } else {
                        continue;
                    }
                    break;
                case 18:
                    getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    continue;
                    break;
                case 19:
                    getDualLoadedSignificandannotations.RatingCompat(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    continue;
                    break;
                case 20:
                    getDualLoadedSignificandannotations.MediaDescriptionCompat(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    continue;
                    break;
                case 21:
                    getDualLoadedSignificandannotations.PlaybackStateCompat(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    continue;
                    break;
                case 22:
                    getDualLoadedSignificandannotations.MediaMetadataCompat(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    continue;
                    break;
                case 23:
                    getDualLoadedSignificandannotations.serializer(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    continue;
                    break;
                case 24:
                    getDualLoadedSignificandannotations.write(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    continue;
                    break;
                case 25:
                    getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    continue;
                    break;
                case 26:
                    getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault);
                    break;
                case 27:
                    getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, serializer(i4));
                    break;
                case 28:
                    getDualLoadedSignificandannotations.serializer(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault);
                    break;
                case 29:
                    getDualLoadedSignificandannotations.PlaybackStateCompatCustomAction(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    break;
                case 30:
                    getDualLoadedSignificandannotations.read(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    break;
                case 31:
                    getDualLoadedSignificandannotations.MediaBrowserCompatMediaItem(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    break;
                case 32:
                    getDualLoadedSignificandannotations.MediaSessionCompatQueueItem(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    break;
                case 33:
                    getDualLoadedSignificandannotations.MediaSessionCompatToken(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    break;
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    getDualLoadedSignificandannotations.MediaSessionCompatResultReceiverWrapper(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, false);
                    break;
                case 35:
                    getDualLoadedSignificandannotations.IconCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    getDualLoadedSignificandannotations.RatingCompat(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case 37:
                    getDualLoadedSignificandannotations.MediaDescriptionCompat(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case 38:
                    getDualLoadedSignificandannotations.PlaybackStateCompat(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    getDualLoadedSignificandannotations.MediaMetadataCompat(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case 40:
                    getDualLoadedSignificandannotations.serializer(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    getDualLoadedSignificandannotations.write(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case 43:
                    getDualLoadedSignificandannotations.PlaybackStateCompatCustomAction(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case 44:
                    getDualLoadedSignificandannotations.read(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    getDualLoadedSignificandannotations.MediaBrowserCompatMediaItem(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case 46:
                    getDualLoadedSignificandannotations.MediaSessionCompatQueueItem(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case 47:
                    getDualLoadedSignificandannotations.MediaSessionCompatToken(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                    getDualLoadedSignificandannotations.MediaSessionCompatResultReceiverWrapper(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, true);
                    break;
                case 49:
                    getDualLoadedSignificandannotations.RemoteActionCompatParcelizer(iArr[i4], (List) unsafe.getObject(obj, j), copyohqcggkdefault, serializer(i4));
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    IconCompatParcelizer(copyohqcggkdefault, i5, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.read(((Double) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj)).doubleValue(), i5);
                    }
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.IconCompatParcelizer(((Float) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj)).floatValue(), i5);
                    }
                    break;
                case 53:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.RemoteActionCompatParcelizer(i5, write(j, obj));
                    }
                    break;
                case 54:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.serializer(i5, write(j, obj));
                    }
                    break;
                case 55:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.read(i5, IconCompatParcelizer(j, obj));
                    }
                    break;
                case 56:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.IconCompatParcelizer(i5, write(j, obj));
                    }
                    break;
                case 57:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.IconCompatParcelizer(i5, IconCompatParcelizer(j, obj));
                    }
                    break;
                case 58:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.write(i5, ((Boolean) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (serializer(i5, i4, obj)) {
                        write(i5, unsafe.getObject(obj, j), copyohqcggkdefault);
                    }
                    break;
                case 60:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.serializer(i5, unsafe.getObject(obj, j), serializer(i4));
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.read(i5, (moveFocusInChildren3ESFkO8) unsafe.getObject(obj, j));
                    }
                    break;
                case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.MediaSessionCompatQueueItem(i5, IconCompatParcelizer(j, obj));
                    }
                    break;
                case 63:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.RemoteActionCompatParcelizer(i5, IconCompatParcelizer(j, obj));
                    }
                    break;
                case 64:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.serializer(i5, IconCompatParcelizer(j, obj));
                    }
                    break;
                case 65:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.read(i5, write(j, obj));
                    }
                    break;
                case 66:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.write(i5, IconCompatParcelizer(j, obj));
                    }
                    break;
                case 67:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.write(i5, write(j, obj));
                    }
                    break;
                case 68:
                    if (serializer(i5, i4, obj)) {
                        copyohqcggkdefault.RemoteActionCompatParcelizer(i5, unsafe.getObject(obj, j), serializer(i4));
                    }
                    break;
            }
        }
        ((getDualUnsignedFloatMaskannotations) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).getClass();
        ((isBetterCandidate_I7lrPNgminorAxisDistance) obj).serializer.serializer(copyohqcggkdefault);
    }

    public final void IconCompatParcelizer(int i, Object obj) {
        if (this.PlaybackStateCompatCustomAction) {
            return;
        }
        int i2 = this.write[i + 2];
        long j = 1048575 & i2;
        getUint64Low32annotations.IconCompatParcelizer(j, (1 << (i2 >>> 20)) | getUint64Low32annotations.read.serializer(j, obj), obj);
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0553 A[Catch: all -> 0x03bb, TryCatch #4 {all -> 0x03bb, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x0021, B:9:0x002b, B:24:0x005d, B:26:0x0062, B:28:0x0069, B:30:0x0070, B:37:0x0085, B:38:0x0089, B:43:0x0098, B:140:0x0537, B:141:0x053e, B:145:0x054e, B:147:0x0553, B:149:0x055a, B:151:0x0561, B:46:0x009f, B:47:0x00af, B:48:0x00c1, B:49:0x00d3, B:50:0x00e5, B:51:0x00f7, B:52:0x010c, B:53:0x011e, B:54:0x012c, B:56:0x0132, B:58:0x015a, B:57:0x014a, B:59:0x015f, B:60:0x0167, B:61:0x0179, B:62:0x018b, B:63:0x019d, B:64:0x01af, B:65:0x01c1, B:66:0x01d3, B:67:0x01e5, B:69:0x01f7, B:71:0x0205, B:76:0x0211, B:77:0x021e, B:78:0x022a, B:79:0x0236, B:80:0x0242, B:81:0x024e, B:82:0x025f, B:83:0x026b, B:84:0x0277, B:85:0x0283, B:86:0x028f, B:87:0x029b, B:88:0x02a7, B:89:0x02b3, B:90:0x02bf, B:91:0x02cb, B:92:0x02d7, B:93:0x02e3, B:94:0x02ef, B:95:0x02fb, B:96:0x030d, B:97:0x031a, B:98:0x0327, B:99:0x0336, B:101:0x033b, B:102:0x0347, B:103:0x0353, B:104:0x0360, B:105:0x036d, B:106:0x037a, B:107:0x0387, B:108:0x0394, B:109:0x03a1, B:110:0x03ae, B:113:0x03be, B:115:0x03c4, B:116:0x03e3, B:118:0x03fa, B:119:0x040a, B:120:0x041a, B:121:0x042a, B:122:0x043a, B:123:0x044d, B:124:0x045d, B:125:0x046d, B:127:0x0473, B:128:0x0492, B:129:0x04a6, B:130:0x04ae, B:131:0x04c0, B:132:0x04d0, B:133:0x04e0, B:134:0x04f0, B:135:0x0500, B:136:0x0510, B:137:0x0521, B:139:0x0530), top: B:175:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x055a A[Catch: all -> 0x03bb, TryCatch #4 {all -> 0x03bb, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x0021, B:9:0x002b, B:24:0x005d, B:26:0x0062, B:28:0x0069, B:30:0x0070, B:37:0x0085, B:38:0x0089, B:43:0x0098, B:140:0x0537, B:141:0x053e, B:145:0x054e, B:147:0x0553, B:149:0x055a, B:151:0x0561, B:46:0x009f, B:47:0x00af, B:48:0x00c1, B:49:0x00d3, B:50:0x00e5, B:51:0x00f7, B:52:0x010c, B:53:0x011e, B:54:0x012c, B:56:0x0132, B:58:0x015a, B:57:0x014a, B:59:0x015f, B:60:0x0167, B:61:0x0179, B:62:0x018b, B:63:0x019d, B:64:0x01af, B:65:0x01c1, B:66:0x01d3, B:67:0x01e5, B:69:0x01f7, B:71:0x0205, B:76:0x0211, B:77:0x021e, B:78:0x022a, B:79:0x0236, B:80:0x0242, B:81:0x024e, B:82:0x025f, B:83:0x026b, B:84:0x0277, B:85:0x0283, B:86:0x028f, B:87:0x029b, B:88:0x02a7, B:89:0x02b3, B:90:0x02bf, B:91:0x02cb, B:92:0x02d7, B:93:0x02e3, B:94:0x02ef, B:95:0x02fb, B:96:0x030d, B:97:0x031a, B:98:0x0327, B:99:0x0336, B:101:0x033b, B:102:0x0347, B:103:0x0353, B:104:0x0360, B:105:0x036d, B:106:0x037a, B:107:0x0387, B:108:0x0394, B:109:0x03a1, B:110:0x03ae, B:113:0x03be, B:115:0x03c4, B:116:0x03e3, B:118:0x03fa, B:119:0x040a, B:120:0x041a, B:121:0x042a, B:122:0x043a, B:123:0x044d, B:124:0x045d, B:125:0x046d, B:127:0x0473, B:128:0x0492, B:129:0x04a6, B:130:0x04ae, B:131:0x04c0, B:132:0x04d0, B:133:0x04e0, B:134:0x04f0, B:135:0x0500, B:136:0x0510, B:137:0x0521, B:139:0x0530), top: B:175:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0569 A[LOOP:3: B:153:0x0567->B:154:0x0569, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x0567 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    @Override // o.toStringAsFixed
    public final void write(Object obj, CornerRadiusKt cornerRadiusKt, beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch) {
        int i;
        getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotations;
        isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance;
        getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer;
        beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
        beambeats_i7lrpngisindirectionofsearch.getClass();
        androidx.datastore.preferences.protobuf.UnknownFieldSchema unknownFieldSchema = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int[] iArr = this.MediaDescriptionCompat;
        int i2 = this.PlaybackStateCompat;
        int i3 = this.IconCompatParcelizer;
        getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 = null;
        while (true) {
            try {
                int iIconCompatParcelizer = cornerRadiusKt.IconCompatParcelizer();
                if (iIconCompatParcelizer < this.MediaSessionCompatToken || iIconCompatParcelizer > this.RatingCompat) {
                    i = -1;
                } else {
                    int[] iArr2 = this.write;
                    int length = (iArr2.length / 3) - 1;
                    int i4 = 0;
                    while (true) {
                        if (i4 > length) {
                            i = -1;
                        } else {
                            int i5 = (length + i4) >>> 1;
                            int i6 = i5 * 3;
                            int i7 = iArr2[i6];
                            if (iIconCompatParcelizer == i7) {
                                i = i6;
                            } else if (iIconCompatParcelizer < i7) {
                                length = i5 - 1;
                            } else {
                                i4 = i5 + 1;
                            }
                        }
                    }
                }
                getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotations2 = getUnspecifiedPackedFloatsannotations.RemoteActionCompatParcelizer;
                if (i >= 0) {
                    int iRatingCompat = RatingCompat(i);
                    try {
                        int iIconCompatParcelizer2 = IconCompatParcelizer(iRatingCompat);
                        accessgetZerocp accessgetzerocp = this.MediaSessionCompatQueueItem;
                        switch (iIconCompatParcelizer2) {
                            case 0:
                                getUint64Low32annotations.read.write(obj, write(iRatingCompat), cornerRadiusKt.serializer());
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 1:
                                getUint64Low32annotations.read.read(obj, write(iRatingCompat), cornerRadiusKt.MediaDescriptionCompat());
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 2:
                                getUint64Low32annotations.serializer(obj, write(iRatingCompat), cornerRadiusKt.MediaSessionCompatResultReceiverWrapper());
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 3:
                                getUint64Low32annotations.serializer(obj, write(iRatingCompat), cornerRadiusKt.ResultReceiver());
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 4:
                                getUint64Low32annotations.IconCompatParcelizer(write(iRatingCompat), cornerRadiusKt.MediaMetadataCompat(), obj);
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 5:
                                getUint64Low32annotations.serializer(obj, write(iRatingCompat), cornerRadiusKt.MediaSessionCompatQueueItem());
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 6:
                                getUint64Low32annotations.IconCompatParcelizer(write(iRatingCompat), cornerRadiusKt.RatingCompat(), obj);
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 7:
                                getUint64Low32annotations.read.write(obj, write(iRatingCompat), cornerRadiusKt.write());
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 8:
                                serializer(obj, iRatingCompat, cornerRadiusKt);
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 9:
                                if (write(i, obj)) {
                                    getUint64Low32annotations.serializer(write(iRatingCompat), obj, topLeft.read(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(write(iRatingCompat), obj), cornerRadiusKt.read(serializer(i), beambeats_i7lrpngisindirectionofsearch2)));
                                } else {
                                    getUint64Low32annotations.serializer(write(iRatingCompat), obj, cornerRadiusKt.read(serializer(i), beambeats_i7lrpngisindirectionofsearch2));
                                    IconCompatParcelizer(i, obj);
                                }
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 10:
                                getUint64Low32annotations.serializer(write(iRatingCompat), obj, cornerRadiusKt.read());
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 11:
                                getUint64Low32annotations.IconCompatParcelizer(write(iRatingCompat), cornerRadiusKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), obj);
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 12:
                                int iMediaBrowserCompatMediaItem = cornerRadiusKt.MediaBrowserCompatMediaItem();
                                RemoteActionCompatParcelizer(i);
                                getUint64Low32annotations.IconCompatParcelizer(write(iRatingCompat), iMediaBrowserCompatMediaItem, obj);
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 13:
                                getUint64Low32annotations.IconCompatParcelizer(write(iRatingCompat), cornerRadiusKt.ParcelableVolumeInfo(), obj);
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 14:
                                getUint64Low32annotations.serializer(obj, write(iRatingCompat), cornerRadiusKt.MediaSessionCompatToken());
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 15:
                                getUint64Low32annotations.IconCompatParcelizer(write(iRatingCompat), cornerRadiusKt.PlaybackStateCompatCustomAction(), obj);
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 16:
                                getUint64Low32annotations.serializer(obj, write(iRatingCompat), cornerRadiusKt.PlaybackStateCompat());
                                IconCompatParcelizer(i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 17:
                                if (write(i, obj)) {
                                    getUint64Low32annotations.serializer(write(iRatingCompat), obj, topLeft.read(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(write(iRatingCompat), obj), cornerRadiusKt.write(serializer(i), beambeats_i7lrpngisindirectionofsearch2)));
                                } else {
                                    getUint64Low32annotations.serializer(write(iRatingCompat), obj, cornerRadiusKt.write(serializer(i), beambeats_i7lrpngisindirectionofsearch2));
                                    IconCompatParcelizer(i, obj);
                                }
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 18:
                                cornerRadiusKt.serializer(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 19:
                                cornerRadiusKt.MediaDescriptionCompat(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 20:
                                cornerRadiusKt.MediaSessionCompatQueueItem(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 21:
                                cornerRadiusKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 22:
                                cornerRadiusKt.MediaBrowserCompatMediaItem(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 23:
                                cornerRadiusKt.RatingCompat(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 24:
                                cornerRadiusKt.write(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 25:
                                cornerRadiusKt.read(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 26:
                                if ((536870912 & iRatingCompat) != 0) {
                                    cornerRadiusKt.PlaybackStateCompat(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                } else {
                                    cornerRadiusKt.MediaSessionCompatResultReceiverWrapper(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                }
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 27:
                                cornerRadiusKt.IconCompatParcelizer(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj), serializer(i), beambeats_i7lrpngisindirectionofsearch2);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 28:
                                cornerRadiusKt.RemoteActionCompatParcelizer(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 29:
                                cornerRadiusKt.ComponentActivity(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 30:
                                cornerRadiusKt.IconCompatParcelizer(accessgetzerocp.RemoteActionCompatParcelizer(write(iRatingCompat), obj));
                                RemoteActionCompatParcelizer(i);
                                Class cls = getDualLoadedSignificandannotations.write;
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 31:
                                cornerRadiusKt.MediaMetadataCompat(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 32:
                                cornerRadiusKt.MediaSessionCompatToken(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 33:
                                cornerRadiusKt.PlaybackStateCompatCustomAction(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                cornerRadiusKt.ParcelableVolumeInfo(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 35:
                                cornerRadiusKt.serializer(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                cornerRadiusKt.MediaDescriptionCompat(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 37:
                                cornerRadiusKt.MediaSessionCompatQueueItem(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 38:
                                cornerRadiusKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                cornerRadiusKt.MediaBrowserCompatMediaItem(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 40:
                                cornerRadiusKt.RatingCompat(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                cornerRadiusKt.write(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                cornerRadiusKt.read(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 43:
                                cornerRadiusKt.ComponentActivity(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 44:
                                cornerRadiusKt.IconCompatParcelizer(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                RemoteActionCompatParcelizer(i);
                                Class cls2 = getDualLoadedSignificandannotations.write;
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                cornerRadiusKt.MediaMetadataCompat(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 46:
                                cornerRadiusKt.MediaSessionCompatToken(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 47:
                                cornerRadiusKt.PlaybackStateCompatCustomAction(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                                cornerRadiusKt.ParcelableVolumeInfo(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj));
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 49:
                                cornerRadiusKt.RemoteActionCompatParcelizer(accessgetzerocp.RemoteActionCompatParcelizer(iRatingCompat & 1048575, obj), serializer(i), beambeats_i7lrpngisindirectionofsearch2);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                                try {
                                    try {
                                        write(obj, i, read(i), beambeats_i7lrpngisindirectionofsearch, cornerRadiusKt);
                                    } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                        getunspecifiedpackedfloatsannotations2 = getunspecifiedpackedfloatsannotations2;
                                        getunspecifiedpackedfloatsannotations = getunspecifiedpackedfloatsannotations2;
                                        unknownFieldSchema.getClass();
                                        if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 == null) {
                                            isbettercandidate_i7lrpngminoraxisdistance = (isBetterCandidate_I7lrPNgminorAxisDistance) obj;
                                            getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer = isbettercandidate_i7lrpngminoraxisdistance.serializer;
                                            if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer == getunspecifiedpackedfloatsannotations) {
                                                getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer = getUnspecifiedPackedFloatsannotations.RemoteActionCompatParcelizer();
                                                isbettercandidate_i7lrpngminoraxisdistance.serializer = getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer;
                                            }
                                            getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 = getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer;
                                        }
                                        if (!unknownFieldSchema.IconCompatParcelizer(getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2, cornerRadiusKt)) {
                                            while (i3 < i2) {
                                                RemoteActionCompatParcelizer(obj, iArr[i3], getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2);
                                                i3++;
                                            }
                                            if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 == null) {
                                                return;
                                            }
                                            ((isBetterCandidate_I7lrPNgminorAxisDistance) obj).serializer = getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2;
                                        }
                                    }
                                    break;
                                } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                }
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 51:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Double.valueOf(cornerRadiusKt.serializer()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Float.valueOf(cornerRadiusKt.MediaDescriptionCompat()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 53:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Long.valueOf(cornerRadiusKt.MediaSessionCompatResultReceiverWrapper()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 54:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Long.valueOf(cornerRadiusKt.ResultReceiver()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 55:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Integer.valueOf(cornerRadiusKt.MediaMetadataCompat()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 56:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Long.valueOf(cornerRadiusKt.MediaSessionCompatQueueItem()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 57:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Integer.valueOf(cornerRadiusKt.RatingCompat()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 58:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Boolean.valueOf(cornerRadiusKt.write()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 59:
                                serializer(obj, iRatingCompat, cornerRadiusKt);
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 60:
                                if (serializer(iIconCompatParcelizer, i, obj)) {
                                    long j = iRatingCompat & 1048575;
                                    getUint64Low32annotations.serializer(j, obj, topLeft.read(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj), cornerRadiusKt.read(serializer(i), beambeats_i7lrpngisindirectionofsearch2)));
                                } else {
                                    getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, cornerRadiusKt.read(serializer(i), beambeats_i7lrpngisindirectionofsearch2));
                                    IconCompatParcelizer(i, obj);
                                }
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, cornerRadiusKt.read());
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Integer.valueOf(cornerRadiusKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 63:
                                int iMediaBrowserCompatMediaItem2 = cornerRadiusKt.MediaBrowserCompatMediaItem();
                                RemoteActionCompatParcelizer(i);
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Integer.valueOf(iMediaBrowserCompatMediaItem2));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 64:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Integer.valueOf(cornerRadiusKt.ParcelableVolumeInfo()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 65:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Long.valueOf(cornerRadiusKt.MediaSessionCompatToken()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 66:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Integer.valueOf(cornerRadiusKt.PlaybackStateCompatCustomAction()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 67:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, Long.valueOf(cornerRadiusKt.PlaybackStateCompat()));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            case 68:
                                getUint64Low32annotations.serializer(iRatingCompat & 1048575, obj, cornerRadiusKt.write(serializer(i), beambeats_i7lrpngisindirectionofsearch2));
                                read(iIconCompatParcelizer, i, obj);
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                            default:
                                getunspecifiedpackedfloatsannotations = getunspecifiedpackedfloatsannotations2;
                                if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 == null) {
                                    try {
                                        ((getDualUnsignedFloatMaskannotations) unknownFieldSchema).getClass();
                                        getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 = getUnspecifiedPackedFloatsannotations.RemoteActionCompatParcelizer();
                                    } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        unknownFieldSchema.getClass();
                                        if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 == null) {
                                            isbettercandidate_i7lrpngminoraxisdistance = (isBetterCandidate_I7lrPNgminorAxisDistance) obj;
                                            getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer = isbettercandidate_i7lrpngminoraxisdistance.serializer;
                                            if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer == getunspecifiedpackedfloatsannotations) {
                                                getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer = getUnspecifiedPackedFloatsannotations.RemoteActionCompatParcelizer();
                                                isbettercandidate_i7lrpngminoraxisdistance.serializer = getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer;
                                            }
                                            getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 = getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer;
                                        }
                                        if (!unknownFieldSchema.IconCompatParcelizer(getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2, cornerRadiusKt)) {
                                            while (i3 < i2) {
                                                RemoteActionCompatParcelizer(obj, iArr[i3], getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2);
                                                i3++;
                                            }
                                            if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 == null) {
                                                return;
                                            }
                                            ((isBetterCandidate_I7lrPNgminorAxisDistance) obj).serializer = getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2;
                                        }
                                    }
                                }
                                if (!unknownFieldSchema.IconCompatParcelizer(getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2, cornerRadiusKt)) {
                                    while (i3 < i2) {
                                        RemoteActionCompatParcelizer(obj, iArr[i3], getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2);
                                        i3++;
                                    }
                                }
                                beambeats_i7lrpngisindirectionofsearch2 = beambeats_i7lrpngisindirectionofsearch;
                                break;
                        }
                    } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                    }
                } else if (iIconCompatParcelizer == Integer.MAX_VALUE) {
                    while (i3 < i2) {
                        RemoteActionCompatParcelizer(obj, iArr[i3], getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2);
                        i3++;
                    }
                    if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 == null) {
                        return;
                    } else {
                        ((getDualUnsignedFloatMaskannotations) unknownFieldSchema).getClass();
                    }
                } else {
                    unknownFieldSchema.getClass();
                    if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 == null) {
                        isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance2 = (isBetterCandidate_I7lrPNgminorAxisDistance) obj;
                        getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer3 = isbettercandidate_i7lrpngminoraxisdistance2.serializer;
                        if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer3 == getunspecifiedpackedfloatsannotations2) {
                            getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer3 = getUnspecifiedPackedFloatsannotations.RemoteActionCompatParcelizer();
                            isbettercandidate_i7lrpngminoraxisdistance2.serializer = getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer3;
                        }
                        getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 = getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer3;
                    }
                    if (!unknownFieldSchema.IconCompatParcelizer(getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2, cornerRadiusKt)) {
                        while (i3 < i2) {
                            RemoteActionCompatParcelizer(obj, iArr[i3], getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2);
                            i3++;
                        }
                        if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i3 < i2) {
                    RemoteActionCompatParcelizer(obj, iArr[i3], getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2);
                    i3++;
                }
                if (getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2 != null) {
                    ((getDualUnsignedFloatMaskannotations) unknownFieldSchema).getClass();
                    ((isBetterCandidate_I7lrPNgminorAxisDistance) obj).serializer = getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2;
                }
                throw th;
            }
        }
        ((isBetterCandidate_I7lrPNgminorAxisDistance) obj).serializer = getunspecifiedpackedfloatsannotationsRemoteActionCompatParcelizer2;
    }

    public final void IconCompatParcelizer(Object obj, int i, Object obj2) {
        long jRatingCompat = RatingCompat(i) & 1048575;
        if (write(i, obj2)) {
            deflate deflateVar = getUint64Low32annotations.read;
            Object objMediaBrowserCompatMediaItem = deflateVar.MediaBrowserCompatMediaItem(jRatingCompat, obj);
            Object objMediaBrowserCompatMediaItem2 = deflateVar.MediaBrowserCompatMediaItem(jRatingCompat, obj2);
            if (objMediaBrowserCompatMediaItem != null && objMediaBrowserCompatMediaItem2 != null) {
                getUint64Low32annotations.serializer(jRatingCompat, obj, topLeft.read(objMediaBrowserCompatMediaItem, objMediaBrowserCompatMediaItem2));
                IconCompatParcelizer(i, obj);
            } else if (objMediaBrowserCompatMediaItem2 != null) {
                getUint64Low32annotations.serializer(jRatingCompat, obj, objMediaBrowserCompatMediaItem2);
                IconCompatParcelizer(i, obj);
            }
        }
    }

    public final void write(Object obj, int i, Object obj2, beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch, CornerRadiusKt cornerRadiusKt) {
        long jRatingCompat = RatingCompat(i) & 1048575;
        Object objMediaBrowserCompatMediaItem = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(jRatingCompat, obj);
        getYimpl getyimpl = this.MediaBrowserCompatMediaItem;
        if (objMediaBrowserCompatMediaItem == null) {
            getyimpl.getClass();
            objMediaBrowserCompatMediaItem = getYannotations.IconCompatParcelizer.read();
            getUint64Low32annotations.serializer(jRatingCompat, obj, objMediaBrowserCompatMediaItem);
        } else {
            getyimpl.getClass();
            if (!((getYannotations) objMediaBrowserCompatMediaItem).write) {
                getYannotations getyannotations = getYannotations.IconCompatParcelizer.read();
                getYimpl.serializer(getyannotations, objMediaBrowserCompatMediaItem);
                getUint64Low32annotations.serializer(jRatingCompat, obj, getyannotations);
                objMediaBrowserCompatMediaItem = getyannotations;
            }
        }
        getyimpl.getClass();
        cornerRadiusKt.IconCompatParcelizer((getYannotations) objMediaBrowserCompatMediaItem, ((getXimpl) obj2).IconCompatParcelizer, beambeats_i7lrpngisindirectionofsearch);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x010b A[RETURN] */
    public final boolean write(int i, Object obj) {
        if (!this.PlaybackStateCompatCustomAction) {
            int i2 = this.write[i + 2];
            if (((1 << (i2 >>> 20)) & getUint64Low32annotations.read.serializer(i2 & 1048575, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iRatingCompat = RatingCompat(i);
        long j = iRatingCompat & 1048575;
        switch (IconCompatParcelizer(iRatingCompat)) {
            case 0:
                if (getUint64Low32annotations.read.IconCompatParcelizer(j, obj) != 0.0d) {
                    return true;
                }
                return false;
            case 1:
                if (getUint64Low32annotations.read.RemoteActionCompatParcelizer(j, obj) != 0.0f) {
                    return true;
                }
                return false;
            case 2:
                if (getUint64Low32annotations.read.MediaDescriptionCompat(j, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (getUint64Low32annotations.read.MediaDescriptionCompat(j, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (getUint64Low32annotations.read.serializer(j, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (getUint64Low32annotations.read.MediaDescriptionCompat(j, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (getUint64Low32annotations.read.serializer(j, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return getUint64Low32annotations.read.write(j, obj);
            case 8:
                Object objMediaBrowserCompatMediaItem = getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj);
                if (objMediaBrowserCompatMediaItem instanceof String) {
                    return !((String) objMediaBrowserCompatMediaItem).isEmpty();
                }
                if (objMediaBrowserCompatMediaItem instanceof moveFocusInChildren3ESFkO8) {
                    return !moveFocusInChildren3ESFkO8.IconCompatParcelizer.equals(objMediaBrowserCompatMediaItem);
                }
                DrawableTransformation.write();
                return false;
            case 9:
                if (getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !moveFocusInChildren3ESFkO8.IconCompatParcelizer.equals(getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj));
            case 11:
                if (getUint64Low32annotations.read.serializer(j, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (getUint64Low32annotations.read.serializer(j, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (getUint64Low32annotations.read.serializer(j, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (getUint64Low32annotations.read.MediaDescriptionCompat(j, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (getUint64Low32annotations.read.serializer(j, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (getUint64Low32annotations.read.MediaDescriptionCompat(j, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj) != null) {
                    return true;
                }
                return false;
            default:
                DrawableTransformation.write();
                return false;
        }
    }

    public final void serializer(Object obj, int i, CornerRadiusKt cornerRadiusKt) {
        if ((536870912 & i) != 0) {
            getUint64Low32annotations.serializer(i & 1048575, obj, cornerRadiusKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
        } else if (this.MediaMetadataCompat) {
            getUint64Low32annotations.serializer(i & 1048575, obj, cornerRadiusKt.ComponentActivity());
        } else {
            getUint64Low32annotations.serializer(i & 1048575, obj, cornerRadiusKt.read());
        }
    }

    @Override // o.toStringAsFixed
    public final void RemoteActionCompatParcelizer(isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance, isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance2) {
        isbettercandidate_i7lrpngminoraxisdistance2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.write;
            if (i < iArr.length) {
                int iRatingCompat = RatingCompat(i);
                long j = 1048575 & iRatingCompat;
                int i2 = iArr[i];
                switch (IconCompatParcelizer(iRatingCompat)) {
                    case 0:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            deflate deflateVar = getUint64Low32annotations.read;
                            deflateVar.write(isbettercandidate_i7lrpngminoraxisdistance, j, deflateVar.IconCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 1:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            deflate deflateVar2 = getUint64Low32annotations.read;
                            deflateVar2.read(isbettercandidate_i7lrpngminoraxisdistance, j, deflateVar2.RemoteActionCompatParcelizer(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 2:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.serializer(isbettercandidate_i7lrpngminoraxisdistance, j, getUint64Low32annotations.read.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 3:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.serializer(isbettercandidate_i7lrpngminoraxisdistance, j, getUint64Low32annotations.read.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 4:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.IconCompatParcelizer(j, getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2), isbettercandidate_i7lrpngminoraxisdistance);
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 5:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.serializer(isbettercandidate_i7lrpngminoraxisdistance, j, getUint64Low32annotations.read.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 6:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.IconCompatParcelizer(j, getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2), isbettercandidate_i7lrpngminoraxisdistance);
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 7:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            deflate deflateVar3 = getUint64Low32annotations.read;
                            deflateVar3.write(isbettercandidate_i7lrpngminoraxisdistance, j, deflateVar3.write(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 8:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.serializer(j, isbettercandidate_i7lrpngminoraxisdistance, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 9:
                        IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, i, isbettercandidate_i7lrpngminoraxisdistance2);
                        break;
                    case 10:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.serializer(j, isbettercandidate_i7lrpngminoraxisdistance, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 11:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.IconCompatParcelizer(j, getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2), isbettercandidate_i7lrpngminoraxisdistance);
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 12:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.IconCompatParcelizer(j, getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2), isbettercandidate_i7lrpngminoraxisdistance);
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 13:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.IconCompatParcelizer(j, getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2), isbettercandidate_i7lrpngminoraxisdistance);
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 14:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.serializer(isbettercandidate_i7lrpngminoraxisdistance, j, getUint64Low32annotations.read.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 15:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.IconCompatParcelizer(j, getUint64Low32annotations.read.serializer(j, isbettercandidate_i7lrpngminoraxisdistance2), isbettercandidate_i7lrpngminoraxisdistance);
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 16:
                        if (write(i, (Object) isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.serializer(isbettercandidate_i7lrpngminoraxisdistance, j, getUint64Low32annotations.read.MediaDescriptionCompat(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            IconCompatParcelizer(i, (Object) isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 17:
                        IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance, i, isbettercandidate_i7lrpngminoraxisdistance2);
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
                        this.MediaSessionCompatQueueItem.read(j, isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2);
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        Class cls = getDualLoadedSignificandannotations.write;
                        deflate deflateVar4 = getUint64Low32annotations.read;
                        Object objMediaBrowserCompatMediaItem = deflateVar4.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance);
                        Object objMediaBrowserCompatMediaItem2 = deflateVar4.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2);
                        this.MediaBrowserCompatMediaItem.getClass();
                        getUint64Low32annotations.serializer(j, isbettercandidate_i7lrpngminoraxisdistance, getYimpl.serializer(objMediaBrowserCompatMediaItem, objMediaBrowserCompatMediaItem2));
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
                        if (serializer(i2, i, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.serializer(j, isbettercandidate_i7lrpngminoraxisdistance, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            read(i2, i, isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 60:
                        write(isbettercandidate_i7lrpngminoraxisdistance, i, isbettercandidate_i7lrpngminoraxisdistance2);
                        break;
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                    case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (serializer(i2, i, isbettercandidate_i7lrpngminoraxisdistance2)) {
                            getUint64Low32annotations.serializer(j, isbettercandidate_i7lrpngminoraxisdistance, getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, isbettercandidate_i7lrpngminoraxisdistance2));
                            read(i2, i, isbettercandidate_i7lrpngminoraxisdistance);
                        }
                        break;
                    case 68:
                        write(isbettercandidate_i7lrpngminoraxisdistance, i, isbettercandidate_i7lrpngminoraxisdistance2);
                        break;
                }
                i += 3;
            } else {
                if (this.PlaybackStateCompatCustomAction) {
                    return;
                }
                getDualLoadedSignificandannotations.IconCompatParcelizer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, isbettercandidate_i7lrpngminoraxisdistance, isbettercandidate_i7lrpngminoraxisdistance2);
                return;
            }
        }
    }
}
