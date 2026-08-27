package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hashObject {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    public static final void serializer(final int i, final long j, final androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1080884533);
        if ((i2 & 6) == 0) {
            int i7 = write + 105;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i3 = (!(getpostalcode.read(i) ^ true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i9 = write + 125;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 15 / 0;
                if (getpostalcode.serializer(j)) {
                    i5 = 32;
                } else {
                    i5 = 16;
                }
            } else if (getpostalcode.serializer(j)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            int i11 = write + 33;
            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 94 / 0;
                if (!(!getpostalcode.read(modifier))) {
                    i4 = androidx.compose.ui.graphics.Fields.RotationX;
                } else {
                    i4 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
            } else if (getpostalcode.read(modifier)) {
                i4 = androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        int i13 = i3 | 3072;
        if (!getpostalcode.write(i13 & 1, !((i13 & 1171) == 1170))) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i14 = RemoteActionCompatParcelizer + 53;
            write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
        } else {
            androidx.compose.ui.graphics.painter.Painter painterPainterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(i, getpostalcode, i13 & 14);
            getpostalcode.serializer(1261610028);
            getpostalcode.IconCompatParcelizer(false);
            androidx.compose.material3.IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, modifier, j, getpostalcode, androidx.compose.ui.graphics.painter.Painter.$stable | (i13 & 896) | ((i13 << 6) & 7168), 0);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isEqualMetaReferrerDetails
                private static int MediaDescriptionCompat = 1;
                private static int read;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = read + 125;
                    MediaDescriptionCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    ((Integer) obj2).getClass();
                    hashObject.serializer(i, j, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i19 = read + 35;
                    MediaDescriptionCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i19 % 2 == 0) {
                        int i20 = 92 / 0;
                    }
                    return createfromparcel;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void read(final int i, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        final androidx.compose.ui.Modifier modifier3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        androidx.compose.ui.Modifier modifier4;
        int i6;
        int i7 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1112793947);
        if ((i2 & 6) == 0) {
            i4 = (getpostalcode.read(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        Object obj = null;
        if ((i2 & 48) == 0) {
            int i8 = write + 53;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
            i4 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                if (getpostalcode.read(modifier2)) {
                    int i10 = write + 19;
                    RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i5 = androidx.compose.ui.graphics.Fields.RotationX;
                } else {
                    i5 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
                i4 |= i5;
            }
            if (getpostalcode.write(i4 & 1, (i4 & 147) != 146)) {
                if (i9 != 0) {
                    i6 = RemoteActionCompatParcelizer + 91;
                    write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                        obj.hashCode();
                        throw null;
                    }
                    modifier4 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                IconCompatParcelizer(i, androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Dimensions.getAnimatedVisibility, Dimensions.setMenu, Dimensions.write, androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(modifier4, Dimensions.getSubtitle), null, getpostalcode, (i4 & 14) | ((i4 << 3) & 896));
                modifier3 = modifier4;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.hashLong
                    private static int MediaMetadataCompat = 1;
                    private static int MediaSessionCompatQueueItem;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj2, Object obj3) {
                        int i12 = 2 % 2;
                        int i13 = MediaMetadataCompat + 9;
                        MediaSessionCompatQueueItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        ((Integer) obj3).getClass();
                        hashObject.read(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1), i3);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i15 = MediaMetadataCompat + 7;
                        MediaSessionCompatQueueItem = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i15 % 2 == 0) {
                            return createfromparcel;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                };
            }
        }
        int i12 = write + 111;
        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        i4 = i12 % 2 != 0 ? i4 | 27736 : i4 | 384;
        modifier2 = modifier;
        if (getpostalcode.write(i4 & 1, (i4 & 147) != 146)) {
            if (i9 != 0) {
                i6 = RemoteActionCompatParcelizer + 91;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
                    obj.hashCode();
                    throw null;
                }
                modifier4 = androidx.compose.ui.Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            IconCompatParcelizer(i, androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Dimensions.getAnimatedVisibility, Dimensions.setMenu, Dimensions.write, androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(modifier4, Dimensions.getSubtitle), null, getpostalcode, (i4 & 14) | ((i4 << 3) & 896));
            modifier3 = modifier4;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.hashLong
                private static int MediaMetadataCompat = 1;
                private static int MediaSessionCompatQueueItem;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = MediaMetadataCompat + 9;
                    MediaSessionCompatQueueItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    ((Integer) obj3).getClass();
                    hashObject.read(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1), i3);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i16 = MediaMetadataCompat + 7;
                    MediaSessionCompatQueueItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        return createfromparcel;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[PHI: r16
  0x00c5: PHI (r16v4 boolean) = (r16v3 boolean), (r16v7 boolean) binds: [B:51:0x00c3, B:48:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1 A[PHI: r16
  0x00d1: PHI (r16v6 boolean) = (r16v3 boolean), (r16v7 boolean) binds: [B:51:0x00c3, B:48:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final float f, final long j, final long j2, final androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, final androidx.compose.ui.graphics.Shape shape, final androidx.compose.ui.Modifier modifier, boolean z, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z2;
        getPostalCode getpostalcode;
        final boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1533214160);
        Object obj = null;
        if ((i & 6) == 0) {
            int i8 = write + 67;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i9 = RemoteActionCompatParcelizer + 61;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.serializer(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.serializer(j) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.serializer(j2) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.read(mutableInteractionSourceImpl)) {
                int i11 = write + 63;
                RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i5 = androidx.compose.ui.graphics.Fields.Clip;
            } else {
                int i13 = write + 125;
                RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            int i15 = RemoteActionCompatParcelizer + 95;
            write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                z2 = false;
                int i16 = 93 / 0;
                if (getpostalcode2.read(shape)) {
                    int i17 = write + 23;
                    RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    i4 = androidx.compose.ui.graphics.Fields.RenderEffect;
                } else {
                    i4 = 65536;
                }
            } else {
                z2 = false;
                if (getpostalcode2.read(shape)) {
                    int i19 = write + 23;
                    RemoteActionCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                    i4 = androidx.compose.ui.graphics.Fields.RenderEffect;
                } else {
                    i4 = 65536;
                }
            }
            i2 |= i4;
        } else {
            z2 = false;
        }
        if ((1572864 & i) == 0) {
            int i20 = RemoteActionCompatParcelizer + 87;
            write = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i20 % 2 == 0) {
                getpostalcode2.read(modifier);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i2 |= !(getpostalcode2.read(modifier) ^ true) ? 1048576 : androidx.compose.ui.graphics.Fields.BlendMode;
        }
        int i21 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                int i22 = write + 97;
                RemoteActionCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i23 = i22 % 2;
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i21 |= i3;
        }
        if (getpostalcode2.write(i21 & 1, (38347923 & i21) != 38347922 ? true : z2)) {
            int i24 = i21 >> 15;
            getpostalcode = getpostalcode2;
            androidx.compose.material3.SurfaceKt.m127Surfaceo_FOJdg(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, true, shape, j2, 0L, 0.0f, 0.0f, DefaultPagerNestedScrollConnection.serializer(f, j), mutableInteractionSourceImpl, coil3.ExtrasKt.write(1751567963, new ModalBottomSheetDialogsW7UJKQ(dragAndDropTargetModifierNode, 3), getpostalcode2), getpostalcode, (i24 & 896) | (i21 & 14) | (i24 & 112) | ((i21 >> 6) & 7168) | ((i21 << 3) & 57344) | ((i21 << 15) & 1879048192), Constant.ERROR_WSS_INVALID);
            z3 = true;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            z3 = z;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.hashEnum
                private static int ParcelableVolumeInfo = 1;
                private static int PlaybackStateCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj3, Object obj4) {
                    int i25 = 2 % 2;
                    int i26 = PlaybackStateCompat + 11;
                    ParcelableVolumeInfo = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    ((Integer) obj4).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    hashObject.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, f, j, j2, mutableInteractionSourceImpl, shape, modifier, z3, dragAndDropTargetModifierNode, (getBirthDateFull) obj3, iRemoteActionCompatParcelizer);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i28 = PlaybackStateCompat + 7;
                    ParcelableVolumeInfo = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i28 % 2 != 0) {
                        return createfromparcel;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3  */
    public static final void IconCompatParcelizer(final int i, final androidx.compose.ui.graphics.Shape shape, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final float f, final float f2, final float f3, final androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, getBirthDateFull getbirthdatefull, final int i2) {
        int i3;
        final androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        boolean z;
        long jPlaybackStateCompatCustomAction;
        long jOnRetainCustomNonConfigurationInstance;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-156504591);
        if ((i2 & 6) == 0) {
            if (getpostalcode.read(i)) {
                int i10 = write + 17;
                RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(shape) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= getpostalcode.serializer(f) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            if (getpostalcode.serializer(f2)) {
                int i12 = RemoteActionCompatParcelizer + 109;
                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i7 = i12 % 2 == 0 ? 31917 : androidx.compose.ui.graphics.Fields.Clip;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i2) == 0) {
            if (getpostalcode.serializer(f3)) {
                int i13 = write + 93;
                RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i6 = androidx.compose.ui.graphics.Fields.RenderEffect;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i2) == 0) {
            int i15 = write + 41;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                int i16 = 3 / 0;
                if (getpostalcode.read(modifier)) {
                    i4 = RemoteActionCompatParcelizer + 45;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    i5 = 1048576;
                } else {
                    i5 = androidx.compose.ui.graphics.Fields.BlendMode;
                }
            } else if (getpostalcode.read(modifier)) {
                i4 = RemoteActionCompatParcelizer + 45;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    throw null;
                }
                i5 = 1048576;
            } else {
                i5 = androidx.compose.ui.graphics.Fields.BlendMode;
            }
            i3 |= i5;
        }
        int i17 = i3 | 12582912;
        if (getpostalcode.write(i17 & 1, (4793491 & i17) != 4793490)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                int i18 = RemoteActionCompatParcelizer + 107;
                write = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i19 = i18 % 2;
                objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
            }
            androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl3 = (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) objComponentActivity;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(mutableInteractionSourceImpl3, getpostalcode, (i17 >> 21) & 14);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            final long compoundDrawablesRelative = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setCompoundDrawablesRelative();
            if (((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                int i20 = write + 53;
                RemoteActionCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i21 = i20 % 2;
                getpostalcode.serializer(-77042023);
                jPlaybackStateCompatCustomAction = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                z = false;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                z = false;
                getpostalcode.serializer(-77039976);
                jPlaybackStateCompatCustomAction = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).PlaybackStateCompatCustomAction();
                getpostalcode.IconCompatParcelizer(false);
            }
            if (((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                getpostalcode.serializer(-77036651);
                jOnRetainCustomNonConfigurationInstance = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onRetainNonConfigurationInstance();
                getpostalcode.IconCompatParcelizer(z);
            } else {
                getpostalcode.serializer(-77034732);
                jOnRetainCustomNonConfigurationInstance = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onRetainCustomNonConfigurationInstance();
                getpostalcode.IconCompatParcelizer(z);
            }
            write(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, f3, jOnRetainCustomNonConfigurationInstance, jPlaybackStateCompatCustomAction, mutableInteractionSourceImpl3, shape, modifier, false, coil3.ExtrasKt.write(-1933158576, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.hashDouble
                private static int MediaDescriptionCompat = 1;
                private static int serializer;

                /* JADX WARN: Code duplicated, block: B:10:0x002b A[PHI: r11 r12
  0x002b: PHI (r11v12 o.getBirthDateFull) = (r11v1 o.getBirthDateFull), (r11v13 o.getBirthDateFull) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r12v8 int) = (r12v2 int), (r12v10 int) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r11 r12
  0x0029: PHI (r11v2 o.getBirthDateFull) = (r11v1 o.getBirthDateFull), (r11v13 o.getBirthDateFull) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r12v3 int) = (r12v2 int), (r12v10 int) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2;
                    int iIntValue;
                    boolean z2;
                    int i22 = 2 % 2;
                    int i23 = MediaDescriptionCompat + 111;
                    serializer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i23 % 2 != 0) {
                        getbirthdatefull2 = (getBirthDateFull) obj;
                        iIntValue = ((Integer) obj2).intValue();
                        if ((iIntValue & 4) != 5) {
                            z2 = true;
                        } else {
                            int i24 = MediaDescriptionCompat + 5;
                            serializer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i25 = i24 % 2;
                            z2 = false;
                        }
                    } else {
                        getbirthdatefull2 = (getBirthDateFull) obj;
                        iIntValue = ((Integer) obj2).intValue();
                        if ((iIntValue & 3) != 2) {
                            z2 = true;
                        } else {
                            int i26 = MediaDescriptionCompat + 5;
                            serializer = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i27 = i26 % 2;
                            z2 = false;
                        }
                    }
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, z2)) {
                        int i28 = MediaDescriptionCompat + 45;
                        serializer = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i29 = i28 % 2;
                        hashObject.serializer(i, compoundDrawablesRelative, androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(androidx.compose.ui.Modifier.Companion, f), f2), getpostalcode2, 0);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, ((i17 >> 6) & 14) | 100663296 | ((i17 >> 12) & 112) | ((i17 >> 9) & 57344) | (458752 & (i17 << 12)) | (i17 & 3670016));
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.hashString
                private static int MediaSessionCompatQueueItem = 0;
                private static int ParcelableVolumeInfo = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i22 = 2 % 2;
                    int i23 = MediaSessionCompatQueueItem + 15;
                    ParcelableVolumeInfo = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    ((Integer) obj2).getClass();
                    hashObject.IconCompatParcelizer(i, shape, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, f, f2, f3, modifier, mutableInteractionSourceImpl2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i25 = ParcelableVolumeInfo + 21;
                    MediaSessionCompatQueueItem = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    return createfromparcel;
                }
            };
        }
    }
}
