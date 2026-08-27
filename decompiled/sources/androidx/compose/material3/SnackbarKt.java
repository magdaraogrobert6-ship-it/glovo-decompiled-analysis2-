package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.ListUtilsKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.DrawableTransformation;
import o.UiMediaScopeKeyboardKindCompanion;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getChildren;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getWindowPosturem18o9QQ;
import o.hideTranslatedText;
import o.onFocusChanged;
import o.onLayoutNodeDeactivatedui;
import o.onPostLayoutNodeReusedui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setImeVisible;
import o.setRootAutofillId;

/* JADX INFO: loaded from: classes.dex */
public abstract class SnackbarKt {
    public static final float RatingCompat;
    public static final float read;
    public static final float write = Dp.m3673constructorimpl(600.0f);
    public static final float serializer = Dp.m3673constructorimpl(30.0f);
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(16.0f);
    public static final float IconCompatParcelizer = Dp.m3673constructorimpl(8.0f);

    static {
        Dp.m3673constructorimpl(2.0f);
        read = Dp.m3673constructorimpl(6.0f);
        RatingCompat = Dp.m3673constructorimpl(8.0f);
        Dp.m3673constructorimpl(12.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX INFO: renamed from: Snackbar-sDKtq54, reason: not valid java name */
    public static final void m125SnackbarsDKtq54(final setRootAutofillId setrootautofillid, Modifier modifier, Shape shape, long j, long j2, long j3, long j4, long j5, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final Modifier modifier2;
        final Shape shape2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        Modifier modifier3;
        Shape shape3;
        long jWrite;
        long jWrite2;
        long jWrite3;
        int i3;
        long j11;
        long jWrite4;
        ?? r15;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(274621471);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(setrootautofillid) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if (getpostalcode.write(i4 & 1, (38347923 & i4) != 38347922)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                int i5 = i4 & (-268434433);
                shape3 = shape;
                jWrite = j;
                jWrite2 = j2;
                jWrite3 = j3;
                j11 = j4;
                jWrite4 = j5;
                i3 = i5;
                modifier3 = modifier;
            } else {
                modifier3 = Modifier.Companion;
                shape3 = setImeVisible.read(SnackbarTokens.RemoteActionCompatParcelizer, getpostalcode);
                jWrite = getWindowPosturem18o9QQ.write(SnackbarTokens.IconCompatParcelizer, getpostalcode);
                jWrite2 = getWindowPosturem18o9QQ.write(SnackbarTokens.MediaMetadataCompat, getpostalcode);
                getChildren getchildren = SnackbarTokens.write;
                jWrite3 = getWindowPosturem18o9QQ.write(getchildren, getpostalcode);
                long jWrite5 = getWindowPosturem18o9QQ.write(getchildren, getpostalcode);
                i3 = i4 & (-268434433);
                j11 = jWrite5;
                jWrite4 = getWindowPosturem18o9QQ.write(SnackbarTokens.MediaBrowserCompatMediaItem, getpostalcode);
            }
            getpostalcode.RemoteActionCompatParcelizer();
            String str = setrootautofillid.write.IconCompatParcelizer;
            if (str != null) {
                getpostalcode.serializer(-663815981);
                dragAndDropTargetModifierNodeWrite = ExtrasKt.write(-1378313599, new onLayoutNodeDeactivatedui(jWrite3, setrootautofillid, str), getpostalcode);
                r15 = 0;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                r15 = 0;
                getpostalcode.serializer(-663517017);
                getpostalcode.IconCompatParcelizer(false);
                dragAndDropTargetModifierNodeWrite = null;
            }
            setrootautofillid.write.getClass();
            getpostalcode.serializer(-662974393);
            getpostalcode.IconCompatParcelizer((boolean) r15);
            serializer(PaddingKt.write(modifier3, Dp.m3673constructorimpl(12.0f)), dragAndDropTargetModifierNodeWrite, null, shape3, jWrite, jWrite2, j11, jWrite4, ExtrasKt.write(-1266389126, new onFocusChanged(r15, setrootautofillid), getpostalcode), getpostalcode, ((i3 << 3) & 7168) | 805306368, 0);
            modifier2 = modifier3;
            long j12 = j11;
            shape2 = shape3;
            j6 = jWrite;
            j7 = jWrite2;
            j8 = jWrite3;
            j10 = jWrite4;
            j9 = j12;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            shape2 = shape;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getPlatformAutofillManager
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    androidx.compose.material3.SnackbarKt.m125SnackbarsDKtq54(setrootautofillid, modifier2, shape2, j6, j7, j8, j9, j10, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0132  */
    /* JADX WARN: Code duplicated, block: B:113:0x013e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:117:0x0198  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    public static final void serializer(final Modifier modifier, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, final Shape shape, final long j, final long j2, long j3, long j4, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        long jWrite;
        boolean z;
        final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2;
        final long j5;
        final long j6;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
        long jWrite2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1218779924);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (getpostalcode.write(false)) {
                    i4 = Fields.CameraDistance;
                } else {
                    i4 = Fields.RotationZ;
                }
                i3 |= i4;
            }
            if ((i & 24576) == 0) {
                if (getpostalcode.read(shape)) {
                    i9 = Fields.Clip;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if (getpostalcode.serializer(j)) {
                    i8 = Fields.RenderEffect;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((1572864 & i) == 0) {
                if (getpostalcode.serializer(j2)) {
                    i7 = 1048576;
                } else {
                    i7 = Fields.BlendMode;
                }
                i3 |= i7;
            }
            if ((12582912 & i) == 0) {
                jWrite = j3;
                if ((i2 & Fields.SpotShadowColor) == 0 || !getpostalcode.serializer(jWrite)) {
                    i6 = 4194304;
                } else {
                    i6 = 8388608;
                }
                i3 |= i6;
            } else {
                jWrite = j3;
            }
            if ((100663296 & i) != 0) {
                i3 |= ((i2 & Fields.RotationX) == 0 || !getpostalcode.serializer(j4)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i5 = 536870912;
                } else {
                    i5 = 268435456;
                }
                i3 |= i5;
            }
            if ((i3 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i3 & 1, z)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) != 0 || getpostalcode.PlaybackStateCompat()) {
                    if (i10 != 0) {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = null;
                    } else {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                    }
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                        jWrite = getWindowPosturem18o9QQ.write(SnackbarTokens.write, getpostalcode);
                        i3 &= -29360129;
                    }
                    if ((i2 & Fields.RotationX) != 0) {
                        i3 &= -234881025;
                        jWrite2 = getWindowPosturem18o9QQ.write(SnackbarTokens.MediaBrowserCompatMediaItem, getpostalcode);
                    } else {
                        jWrite2 = j4;
                    }
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                        i3 &= -29360129;
                    }
                    if ((i2 & Fields.RotationX) != 0) {
                        i3 &= -234881025;
                    }
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                    jWrite2 = j4;
                }
                long j7 = jWrite;
                getpostalcode.RemoteActionCompatParcelizer();
                int i11 = i3 >> 9;
                SurfaceKt.m126SurfaceT9BRK9s(modifier, shape, j, j2, 0.0f, SnackbarTokens.read, null, ExtrasKt.write(-1343524879, new onPostLayoutNodeReusedui(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, dragAndDropTargetModifierNode, r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, j7, jWrite2), getpostalcode), getpostalcode, (i11 & 7168) | (i3 & 14) | 12779520 | (i11 & 112) | (i11 & 896), 80);
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
                j6 = j7;
                j5 = jWrite2;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                j5 = j4;
                j6 = jWrite;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.commit
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                        androidx.compose.material3.SnackbarKt.serializer(modifier, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, shape, j, j2, j6, j5, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, i2);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (getpostalcode.write(false)) {
                i4 = Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i3 |= i4;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.read(shape)) {
                i9 = Fields.Clip;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.serializer(j)) {
                i8 = Fields.RenderEffect;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode.serializer(j2)) {
                i7 = 1048576;
            } else {
                i7 = Fields.BlendMode;
            }
            i3 |= i7;
        }
        if ((12582912 & i) == 0) {
            jWrite = j3;
            if ((i2 & Fields.SpotShadowColor) == 0) {
                i6 = 4194304;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        } else {
            jWrite = j3;
        }
        if ((100663296 & i) != 0) {
            i3 |= ((i2 & Fields.RotationX) == 0 || !getpostalcode.serializer(j4)) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i3 |= i5;
        }
        if ((i3 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = null;
                } else {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    jWrite = getWindowPosturem18o9QQ.write(SnackbarTokens.write, getpostalcode);
                    i3 &= -29360129;
                }
                if ((i2 & Fields.RotationX) != 0) {
                    i3 &= -234881025;
                    jWrite2 = getWindowPosturem18o9QQ.write(SnackbarTokens.MediaBrowserCompatMediaItem, getpostalcode);
                } else {
                    jWrite2 = j4;
                }
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
            } else {
                if (i10 != 0) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = null;
                } else {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    jWrite = getWindowPosturem18o9QQ.write(SnackbarTokens.write, getpostalcode);
                    i3 &= -29360129;
                }
                if ((i2 & Fields.RotationX) != 0) {
                    i3 &= -234881025;
                    jWrite2 = getWindowPosturem18o9QQ.write(SnackbarTokens.MediaBrowserCompatMediaItem, getpostalcode);
                } else {
                    jWrite2 = j4;
                }
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
            }
            long j8 = jWrite;
            getpostalcode.RemoteActionCompatParcelizer();
            int i12 = i3 >> 9;
            SurfaceKt.m126SurfaceT9BRK9s(modifier, shape, j, j2, 0.0f, SnackbarTokens.read, null, ExtrasKt.write(-1343524879, new onPostLayoutNodeReusedui(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, dragAndDropTargetModifierNode, r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, j8, jWrite2), getpostalcode), getpostalcode, (i12 & 7168) | (i3 & 14) | 12779520 | (i12 & 112) | (i12 & 896), 80);
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
            j6 = j8;
            j5 = jWrite2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
            j5 = j4;
            j6 = jWrite;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.commit
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    androidx.compose.material3.SnackbarKt.serializer(modifier, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, shape, j, j2, j6, j5, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, i2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x0214  */
    /* JADX INFO: renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m124OneRowSnackbarkKq0p4A(final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, final TextStyle textStyle, final long j, final long j2, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        float fM3673constructorimpl;
        boolean z;
        boolean z2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-931325388);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(textStyle) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.serializer(j) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.serializer(j2) ? Fields.RenderEffect : 65536;
        }
        if (getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            Modifier.Companion companion = Modifier.Companion;
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 == null) {
                fM3673constructorimpl = IconCompatParcelizer;
            } else {
                fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
            }
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, RemoteActionCompatParcelizer, 0.0f, fM3673constructorimpl, 0.0f, 10);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1
                    /* JADX WARN: Code duplicated, block: B:67:0x01aa A[PHI: r5 r6
  0x01aa: PHI (r5v12 int) = (r5v11 int), (r5v20 int), (r5v20 int) binds: [B:64:0x019c, B:59:0x0176, B:61:0x0180] A[DONT_GENERATE, DONT_INLINE]
  0x01aa: PHI (r6v14 int) = (r6v13 int), (r6v21 int), (r6v21 int) binds: [B:64:0x019c, B:59:0x0176, B:61:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List list, long j3) {
                        Object obj;
                        Object obj2;
                        int iMo42roundToPx0680j_4;
                        int iMax;
                        int height;
                        int i3;
                        final int i4;
                        int i5;
                        int i6;
                        List list2 = list;
                        int iMin = Math.min(Constraints.m3626getMaxWidthimpl(j3), measureScope.mo42roundToPx0680j_4(SnackbarKt.write));
                        List list3 = list2;
                        int size = list3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                obj = null;
                                break;
                            }
                            obj = list2.get(i7);
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj), "action"}, getCieXyz.write())).booleanValue()) {
                                break;
                            }
                            i7++;
                        }
                        Measurable measurable = (Measurable) obj;
                        Placeable placeableMo2209measureBRTryo0 = measurable != null ? measurable.mo2209measureBRTryo0(j3) : null;
                        int size2 = list3.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list2.get(i8);
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj2), "dismissAction"}, getCieXyz.write())).booleanValue()) {
                                break;
                            }
                            i8++;
                        }
                        Measurable measurable2 = (Measurable) obj2;
                        final Placeable placeableMo2209measureBRTryo1 = measurable2 != null ? measurable2.mo2209measureBRTryo0(j3) : null;
                        int width = placeableMo2209measureBRTryo0 != null ? placeableMo2209measureBRTryo0.getWidth() : 0;
                        int height2 = placeableMo2209measureBRTryo0 != null ? placeableMo2209measureBRTryo0.getHeight() : 0;
                        int width2 = placeableMo2209measureBRTryo1 != null ? placeableMo2209measureBRTryo1.getWidth() : 0;
                        int height3 = placeableMo2209measureBRTryo1 != null ? placeableMo2209measureBRTryo1.getHeight() : 0;
                        int iMo42roundToPx0680j_5 = ((iMin - width) - width2) - (width2 == 0 ? measureScope.mo42roundToPx0680j_4(SnackbarKt.RatingCompat) : 0);
                        int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j3);
                        if (iMo42roundToPx0680j_5 >= iM3628getMinWidthimpl) {
                            iM3628getMinWidthimpl = iMo42roundToPx0680j_5;
                        }
                        int size3 = list3.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            Measurable measurable3 = (Measurable) list2.get(i9);
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId(measurable3), "text"}, getCieXyz.write())).booleanValue()) {
                                int i10 = width;
                                int i11 = height3;
                                final Placeable placeableMo2209measureBRTryo2 = measurable3.mo2209measureBRTryo0(Constraints.m3616copyZbe2FdA$default(j3, 0, iM3628getMinWidthimpl, 0, 0, 9, null));
                                int i12 = placeableMo2209measureBRTryo2.get(AlignmentLineKt.getFirstBaseline());
                                int i13 = placeableMo2209measureBRTryo2.get(AlignmentLineKt.getLastBaseline());
                                boolean z3 = true;
                                boolean z4 = (i12 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE) ? false : true;
                                if (i12 != i13 && z4) {
                                    z3 = false;
                                }
                                final int i14 = iMin - width2;
                                if (z3) {
                                    iMax = Math.max(measureScope.mo42roundToPx0680j_4(SnackbarTokens.MediaDescriptionCompat), Math.max(height2, i11));
                                    iMo42roundToPx0680j_4 = (iMax - placeableMo2209measureBRTryo2.getHeight()) / 2;
                                    if (placeableMo2209measureBRTryo0 == null || (i6 = placeableMo2209measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) == Integer.MIN_VALUE) {
                                        i3 = iMax;
                                        i4 = iMo42roundToPx0680j_4;
                                        i5 = 0;
                                    } else {
                                        height = (i12 + iMo42roundToPx0680j_4) - i6;
                                        i5 = height;
                                        i3 = iMax;
                                        i4 = iMo42roundToPx0680j_4;
                                    }
                                } else {
                                    iMo42roundToPx0680j_4 = measureScope.mo42roundToPx0680j_4(SnackbarKt.serializer) - i12;
                                    iMax = Math.max(measureScope.mo42roundToPx0680j_4(SnackbarTokens.MediaSessionCompatQueueItem), placeableMo2209measureBRTryo2.getHeight() + iMo42roundToPx0680j_4);
                                    if (placeableMo2209measureBRTryo0 != null) {
                                        height = (iMax - placeableMo2209measureBRTryo0.getHeight()) / 2;
                                        i5 = height;
                                        i3 = iMax;
                                        i4 = iMo42roundToPx0680j_4;
                                    } else {
                                        i3 = iMax;
                                        i4 = iMo42roundToPx0680j_4;
                                        i5 = 0;
                                    }
                                }
                                final int height4 = placeableMo2209measureBRTryo1 != null ? (i3 - placeableMo2209measureBRTryo1.getHeight()) / 2 : 0;
                                final int i15 = i14 - i10;
                                final Placeable placeable = placeableMo2209measureBRTryo0;
                                final int i16 = i5;
                                return MeasureScope.layout$default(measureScope, iMin, i3, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.onDetachui
                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                    public final Object invoke(Object obj3) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj3;
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2209measureBRTryo2, 0, i4, 0.0f, 4, null);
                                        androidx.compose.ui.layout.Placeable placeable2 = placeableMo2209measureBRTryo1;
                                        if (placeable2 != null) {
                                            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i14, height4, 0.0f, 4, null);
                                        }
                                        androidx.compose.ui.layout.Placeable placeable3 = placeable;
                                        if (placeable3 != null) {
                                            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i15, i16, 0.0f, 4, null);
                                        }
                                        return createFromParcel.INSTANCE;
                                    }
                                }, 4, null);
                            }
                            i9++;
                            list2 = list;
                            width = width;
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        DrawableTransformation.read();
                        return null;
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity;
            int iSerializer = SentryUUID.serializer(getpostalcode);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                if (!getpostalcode.ComponentActivity) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                } else {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion2.getSetModifier());
                Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, read, 1);
                Alignment.Companion companion3 = Alignment.Companion;
                MeasurePolicy measurePolicy2 = BoxKt.read(companion3.getTopStart(), false);
                int iSerializer2 = SentryUUID.serializer(getpostalcode);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2 = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                if (!getpostalcode.ComponentActivity) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer2)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode, iSerializer2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2);
                    }
                } else {
                    c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode, iSerializer2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2);
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, companion2.getSetModifier());
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf(i2 & 14));
                getpostalcode.IconCompatParcelizer(true);
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 != null) {
                    getpostalcode.serializer(-1014168049);
                    Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "action");
                    MeasurePolicy measurePolicy3 = BoxKt.read(companion3.getTopStart(), false);
                    int iSerializer3 = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierLayoutId);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor3);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M3 = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    if (!getpostalcode.ComponentActivity) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer3)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer3, getpostalcode, iSerializer3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M3);
                        }
                    } else {
                        c8$$ExternalSyntheticOutline0.m(iSerializer3, getpostalcode, iSerializer3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M3);
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, companion2.getSetModifier());
                    AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{UiMediaScopeKeyboardKindCompanion.read.write(Color.m712boximpl(j)), TextKt.IconCompatParcelizer.write(textStyle)}, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, (i2 & 112) | 8);
                    getpostalcode.IconCompatParcelizer(true);
                    z = false;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    z = false;
                    getpostalcode.serializer(-1013852841);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 != null) {
                    getpostalcode.serializer(-1013804481);
                    Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, "dismissAction");
                    MeasurePolicy measurePolicy4 = BoxKt.read(companion3.getTopStart(), z);
                    int iSerializer4 = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierLayoutId2);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor4);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M4 = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy4, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                    if (!getpostalcode.ComponentActivity) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer4)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer4, getpostalcode, iSerializer4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M4);
                        }
                    } else {
                        c8$$ExternalSyntheticOutline0.m(iSerializer4, getpostalcode, iSerializer4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M4);
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, companion2.getSetModifier());
                    AndroidContentCaptureManagerCompanion.read(UiMediaScopeKeyboardKindCompanion.read.write(Color.m712boximpl(j2)), r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getpostalcode, ((i2 >> 3) & 112) | 8);
                    z2 = true;
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    boolean z3 = z;
                    z2 = true;
                    getpostalcode.serializer(-1013535401);
                    getpostalcode.IconCompatParcelizer(z3);
                }
                getpostalcode.IconCompatParcelizer(z2);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.cancel
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    androidx.compose.material3.SnackbarKt.m124OneRowSnackbarkKq0p4A(dragAndDropTargetModifierNode, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, textStyle, j, j2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
