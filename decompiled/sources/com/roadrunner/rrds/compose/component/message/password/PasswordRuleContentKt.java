package com.roadrunner.rrds.compose.component.message.password;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.message.password.PasswordRuleContentKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetDialogsW7UJKQ;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PasswordRuleContentKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:104:0x0152  */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x015b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0170  */
    /* JADX WARN: Code duplicated, block: B:118:0x0179  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:151:0x020a  */
    /* JADX WARN: Code duplicated, block: B:152:0x021a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0234  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:161:0x0265  */
    /* JADX WARN: Code duplicated, block: B:163:0x0269  */
    /* JADX WARN: Code duplicated, block: B:165:0x0277  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0284  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:170:0x0287  */
    /* JADX WARN: Code duplicated, block: B:173:0x029b  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:178:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:180:0x0373  */
    /* JADX WARN: Code duplicated, block: B:182:0x0378  */
    /* JADX WARN: Code duplicated, block: B:184:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:187:0x03af  */
    /* JADX WARN: Code duplicated, block: B:190:0x043b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0440  */
    /* JADX WARN: Code duplicated, block: B:195:0x0456  */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:6:0x002d A[PHI: r5 r8
  0x002d: PHI (r5v10 o.getPostalCode) = (r5v5 o.getPostalCode), (r5v12 o.getPostalCode) binds: [B:9:0x0041, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r8v7 o.getAddressCountry) = (r8v1 o.getAddressCountry), (r8v8 o.getAddressCountry) binds: [B:9:0x0041, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0030 A[PHI: r5 r8
  0x0030: PHI (r5v6 o.getPostalCode) = (r5v5 o.getPostalCode), (r5v12 o.getPostalCode) binds: [B:9:0x0041, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r8v2 o.getAddressCountry) = (r8v1 o.getAddressCountry), (r8v8 o.getAddressCountry) binds: [B:9:0x0041, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0118  */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX INFO: renamed from: PasswordRuleContent-69PAOm4, reason: not valid java name */
    public static final void m5060PasswordRuleContent69PAOm4(final String str, final boolean z, final Modifier modifier, Modifier modifier2, Painter painter, Painter painter2, long j, long j2, long j3, TextStyle textStyle, float f, getBirthDateFull getbirthdatefull, final int i, final int i2, final int i3) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i4;
        Modifier modifier3;
        long overflowReserved;
        TextStyle textStyle2;
        int i5;
        boolean z2;
        long j4;
        float f2;
        final TextStyle textStyle3;
        final long j5;
        final Modifier modifier4;
        Painter painter3;
        Painter painterPainterResource;
        final long j6;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        final Modifier modifier5;
        Painter painterPainterResource2;
        setCurrentSemanticsNodesui setcurrentsemanticsnodesui;
        int i6;
        int i7;
        TextStyle textStyle4;
        long j7;
        int i8;
        long j8;
        float f3;
        int i9;
        final Painter painter4;
        long j9;
        final long j10;
        long j11;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite;
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2;
        int iHashCode2;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2;
        Modifier modifierMaterializeModifier2;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean zIconCompatParcelizer;
        int i14;
        boolean zIconCompatParcelizer2;
        int i15;
        int i16;
        int i17;
        int i18 = 2 % 2;
        int i19 = IconCompatParcelizer + 81;
        write = i19 % Fields.SpotShadowColor;
        if (i19 % 2 == 0) {
            str.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(86419411);
            getaddresscountry = getpostalcode.read;
            if ((i & 118) == 0) {
                if (getpostalcode.read(str)) {
                    i17 = IconCompatParcelizer + 37;
                    write = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 == 0) {
                        i16 = 3;
                    } else {
                        i16 = 4;
                    }
                } else {
                    i16 = 2;
                }
                i4 = i16 | i;
            } else {
                i4 = i;
            }
        } else {
            str.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(86419411);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i17 = IconCompatParcelizer + 37;
                    write = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 == 0) {
                        i16 = 3;
                    } else {
                        i16 = 4;
                    }
                } else {
                    i16 = 2;
                }
                i4 = i16 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            i4 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i20 = IconCompatParcelizer + 7;
                write = i20 % Fields.SpotShadowColor;
                i15 = i20 % 2 == 0 ? 11423 : Fields.RotationX;
            } else {
                i15 = Fields.SpotShadowColor;
            }
            i4 |= i15;
        }
        int i21 = i3 & 8;
        if (i21 == 0) {
            if ((i & 3072) == 0) {
                modifier3 = modifier2;
                i4 |= getpostalcode.read(modifier3) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) != 0) {
                    i14 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zIconCompatParcelizer2 = getpostalcode.read(painter);
                    } else {
                        zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(painter);
                    }
                    if (!zIconCompatParcelizer2) {
                        i14 = 8192;
                    } else {
                        i14 = Fields.Clip;
                    }
                }
                i4 |= i14;
                int i22 = write + 9;
                IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
            }
            if ((196608 & i) == 0) {
                int i24 = write + 65;
                IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                if ((i3 & 32) != 0) {
                    i13 = 65536;
                } else {
                    if ((262144 & i) == 0) {
                        zIconCompatParcelizer = getpostalcode.read(painter2);
                    } else {
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(painter2);
                    }
                    if (zIconCompatParcelizer) {
                        i13 = Fields.RenderEffect;
                    } else {
                        i13 = 65536;
                    }
                }
                i4 |= i13;
            }
            if ((1572864 & i) == 0) {
                i4 |= Fields.BlendMode;
            }
            if ((12582912 & i) == 0) {
                overflowReserved = j2;
                if ((i3 & Fields.SpotShadowColor) == 0 || (!getpostalcode.serializer(overflowReserved))) {
                    i12 = 4194304;
                } else {
                    i12 = 8388608;
                }
                i4 |= i12;
            } else {
                overflowReserved = j2;
            }
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                i11 = IconCompatParcelizer + 59;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0 ? (i3 & Fields.RotationY) != 0 : (i3 & 31368) != 0) {
                    textStyle2 = textStyle;
                } else {
                    textStyle2 = textStyle;
                    int i26 = getpostalcode.read(textStyle2) ? 536870912 : 268435456;
                    i4 |= i26;
                }
                i4 |= i26;
            } else {
                textStyle2 = textStyle;
            }
            if ((i2 & 6) == 0) {
                i5 = i2 | 2;
            } else {
                i5 = i2;
            }
            if ((i4 & 306783379) == 306783378 || (3 & i5) != 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i4 & 1, z2)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) != 0 || getpostalcode.PlaybackStateCompat()) {
                    if (i21 != 0) {
                        modifier5 = Modifier.Companion;
                    } else {
                        modifier5 = modifier3;
                    }
                    if ((i3 & 16) != 0) {
                        painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_tick_circle_filled, getpostalcode, 0);
                        i4 &= -57345;
                    } else {
                        painterPainterResource2 = painter;
                    }
                    if ((i3 & 32) != 0) {
                        painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_tick_circle_filled, getpostalcode, 0);
                        i4 &= -458753;
                    } else {
                        painterPainterResource = painter2;
                    }
                    setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    long supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintList();
                    i6 = i4 & (-3670017);
                    if ((i3 & Fields.SpotShadowColor) != 0) {
                        i9 = IconCompatParcelizer + 87;
                        write = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 == 0) {
                            overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowReserved();
                            i6 = i4 & (-33030145);
                            int i27 = 27 / 0;
                        } else {
                            overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowReserved();
                            i6 = i4 & (-33030145);
                        }
                    }
                    long jWindowCallbackWrapper = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).WindowCallbackWrapper();
                    if ((i3 & Fields.RotationY) != 0) {
                        textStyle4 = (TextStyle) performLayout.write.MediaSessionCompatResultReceiverWrapper();
                        i7 = i6 & (-2113929217);
                    } else {
                        i7 = i6 & (-234881025);
                        textStyle4 = textStyle2;
                    }
                    j7 = overflowReserved;
                    i8 = i7;
                    j8 = supportBackgroundTintList;
                    j4 = jWindowCallbackWrapper;
                    f3 = Dimensions.setPrimaryBackground;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    int i28 = i4 & (-3670017);
                    if ((i3 & Fields.SpotShadowColor) != 0) {
                        i28 = i4 & (-33030145);
                    }
                    int i29 = i28 & (-234881025);
                    if ((i3 & Fields.RotationY) != 0) {
                        i29 = i28 & (-2113929217);
                    }
                    painterPainterResource2 = painter;
                    j4 = j3;
                    textStyle4 = textStyle2;
                    j7 = overflowReserved;
                    i8 = i29;
                    modifier5 = modifier3;
                    painterPainterResource = painter2;
                    j8 = j;
                    f3 = f;
                }
                getpostalcode.RemoteActionCompatParcelizer();
                if (z) {
                    int i30 = IconCompatParcelizer + 101;
                    write = i30 % Fields.SpotShadowColor;
                    int i31 = i30 % 2;
                    painter4 = painterPainterResource2;
                } else {
                    painter4 = painterPainterResource;
                }
                if (z) {
                    i10 = write + 39;
                    j9 = j8;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        int i32 = 87 / 0;
                    }
                    j10 = j9;
                } else {
                    j9 = j8;
                    j10 = j7;
                }
                if (z) {
                    j11 = j9;
                } else {
                    j11 = j4;
                }
                dragAndDropTargetModifierNodeWrite = ExtrasKt.write(831592539, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.requestBridgeToken
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i33 = 2 % 2;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            int i34 = write + 19;
                            serializer = i34 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i35 = i34 % 2;
                        } else {
                            int i36 = serializer + 7;
                            write = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i37 = i36 % 2;
                            androidx.compose.material3.IconKt.m116Iconww6aTOc(painter4, (String) null, modifier5, j10, getpostalcode2, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 0);
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode);
                if (z) {
                    getpostalcode.serializer(1836319961);
                    supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 48);
                    iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
                    companion2 = ComposeUiNode.Companion;
                    constructor2 = companion2.getConstructor();
                    if (getaddresscountry != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                    AndroidContentCaptureManagerCompanion.read(CompositionLocalsKt.getLocalLayoutDirection().write(LayoutDirection.Ltr), ExtrasKt.write(528267282, new ModalBottomSheetDialogsW7UJKQ(dragAndDropTargetModifierNodeWrite, 4), getpostalcode), getpostalcode, 56);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, f3, 0.0f, 0.0f, 0.0f, 14)});
                    TextKt.m131TextNvy7gAk(str, null, j11, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle4, getpostalcode, i8 & 14, (i8 >> 6) & 29360128, 131066);
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                    int i33 = IconCompatParcelizer + 109;
                    write = i33 % Fields.SpotShadowColor;
                    int i34 = i33 % 2;
                } else {
                    getpostalcode.serializer(1836788805);
                    supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 48);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getaddresscountry != 0) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    dragAndDropTargetModifierNodeWrite.invoke(getpostalcode, 6);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, f3, 0.0f, 0.0f, 0.0f, 14)});
                    TextKt.m131TextNvy7gAk(str, null, j11, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle4, getpostalcode, i8 & 14, (i8 >> 6) & 29360128, 131066);
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                }
                j6 = j9;
                painter3 = painterPainterResource2;
                textStyle3 = textStyle4;
                f2 = f3;
                j5 = j7;
                modifier4 = modifier5;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                j4 = j3;
                f2 = f;
                textStyle3 = textStyle2;
                j5 = overflowReserved;
                modifier4 = modifier3;
                painter3 = painter;
                painterPainterResource = painter2;
                j6 = j;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final Painter painter5 = painter3;
                final Painter painter6 = painterPainterResource;
                final long j12 = j4;
                final float f4 = f2;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isBridgeAuthorized
                    private static int ComponentActivity = 1;
                    private static int MediaSessionCompatResultReceiverWrapper;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i35 = 2 % 2;
                        int i36 = ComponentActivity + 3;
                        MediaSessionCompatResultReceiverWrapper = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i37 = i36 % 2;
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                        PasswordRuleContentKt.m5060PasswordRuleContent69PAOm4(str, z, modifier, modifier4, painter5, painter6, j6, j5, j12, textStyle3, f4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i3);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i38 = ComponentActivity + 37;
                        MediaSessionCompatResultReceiverWrapper = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i38 % 2 == 0) {
                            return createfromparcel;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                };
            }
        }
        i4 |= 3072;
        modifier3 = modifier2;
        if ((i & 24576) == 0) {
            if ((i3 & 16) != 0) {
                i14 = 8192;
            } else {
                if ((32768 & i) == 0) {
                    zIconCompatParcelizer2 = getpostalcode.read(painter);
                } else {
                    zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(painter);
                }
                if (!zIconCompatParcelizer2) {
                    i14 = 8192;
                } else {
                    i14 = Fields.Clip;
                }
            }
            i4 |= i14;
            int i210 = write + 9;
            IconCompatParcelizer = i210 % Fields.SpotShadowColor;
            int i211 = i210 % 2;
        }
        if ((196608 & i) == 0) {
            int i212 = write + 65;
            IconCompatParcelizer = i212 % Fields.SpotShadowColor;
            int i213 = i212 % 2;
            if ((i3 & 32) != 0) {
                i13 = 65536;
            } else {
                if ((262144 & i) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(painter2);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(painter2);
                }
                if (zIconCompatParcelizer) {
                    i13 = Fields.RenderEffect;
                } else {
                    i13 = 65536;
                }
            }
            i4 |= i13;
        }
        if ((1572864 & i) == 0) {
            i4 |= Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            overflowReserved = j2;
            if ((i3 & Fields.SpotShadowColor) == 0) {
                i12 = 4194304;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        } else {
            overflowReserved = j2;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i11 = IconCompatParcelizer + 59;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                textStyle2 = textStyle;
                i4 |= i26;
            } else {
                textStyle2 = textStyle;
                i4 |= i26;
            }
        } else {
            textStyle2 = textStyle;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | 2;
        } else {
            i5 = i2;
        }
        if ((i4 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (getpostalcode.write(i4 & 1, z2)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0) {
                if (i21 != 0) {
                    modifier5 = Modifier.Companion;
                } else {
                    modifier5 = modifier3;
                }
                if ((i3 & 16) != 0) {
                    painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_tick_circle_filled, getpostalcode, 0);
                    i4 &= -57345;
                } else {
                    painterPainterResource2 = painter;
                }
                if ((i3 & 32) != 0) {
                    painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_tick_circle_filled, getpostalcode, 0);
                    i4 &= -458753;
                } else {
                    painterPainterResource = painter2;
                }
                setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long supportBackgroundTintList2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintList();
                i6 = i4 & (-3670017);
                if ((i3 & Fields.SpotShadowColor) != 0) {
                    i9 = IconCompatParcelizer + 87;
                    write = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowReserved();
                        i6 = i4 & (-33030145);
                        int i214 = 27 / 0;
                    } else {
                        overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowReserved();
                        i6 = i4 & (-33030145);
                    }
                }
                long jWindowCallbackWrapper2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).WindowCallbackWrapper();
                if ((i3 & Fields.RotationY) != 0) {
                    textStyle4 = (TextStyle) performLayout.write.MediaSessionCompatResultReceiverWrapper();
                    i7 = i6 & (-2113929217);
                } else {
                    i7 = i6 & (-234881025);
                    textStyle4 = textStyle2;
                }
                j7 = overflowReserved;
                i8 = i7;
                j8 = supportBackgroundTintList2;
                j4 = jWindowCallbackWrapper2;
                f3 = Dimensions.setPrimaryBackground;
            } else {
                if (i21 != 0) {
                    modifier5 = Modifier.Companion;
                } else {
                    modifier5 = modifier3;
                }
                if ((i3 & 16) != 0) {
                    painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_tick_circle_filled, getpostalcode, 0);
                    i4 &= -57345;
                } else {
                    painterPainterResource2 = painter;
                }
                if ((i3 & 32) != 0) {
                    painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_tick_circle_filled, getpostalcode, 0);
                    i4 &= -458753;
                } else {
                    painterPainterResource = painter2;
                }
                setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long supportBackgroundTintList3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintList();
                i6 = i4 & (-3670017);
                if ((i3 & Fields.SpotShadowColor) != 0) {
                    i9 = IconCompatParcelizer + 87;
                    write = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowReserved();
                        i6 = i4 & (-33030145);
                        int i215 = 27 / 0;
                    } else {
                        overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowReserved();
                        i6 = i4 & (-33030145);
                    }
                }
                long jWindowCallbackWrapper3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).WindowCallbackWrapper();
                if ((i3 & Fields.RotationY) != 0) {
                    textStyle4 = (TextStyle) performLayout.write.MediaSessionCompatResultReceiverWrapper();
                    i7 = i6 & (-2113929217);
                } else {
                    i7 = i6 & (-234881025);
                    textStyle4 = textStyle2;
                }
                j7 = overflowReserved;
                i8 = i7;
                j8 = supportBackgroundTintList3;
                j4 = jWindowCallbackWrapper3;
                f3 = Dimensions.setPrimaryBackground;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            if (z) {
                int i35 = IconCompatParcelizer + 101;
                write = i35 % Fields.SpotShadowColor;
                int i36 = i35 % 2;
                painter4 = painterPainterResource2;
            } else {
                painter4 = painterPainterResource;
            }
            if (z) {
                i10 = write + 39;
                j9 = j8;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i37 = 87 / 0;
                }
                j10 = j9;
            } else {
                j9 = j8;
                j10 = j7;
            }
            if (z) {
                j11 = j9;
            } else {
                j11 = j4;
            }
            dragAndDropTargetModifierNodeWrite = ExtrasKt.write(831592539, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.requestBridgeToken
                private static int serializer = 1;
                private static int write;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i38 = 2 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        int i39 = write + 19;
                        serializer = i39 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i310 = i39 % 2;
                    } else {
                        int i311 = serializer + 7;
                        write = i311 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i312 = i311 % 2;
                        androidx.compose.material3.IconKt.m116Iconww6aTOc(painter4, (String) null, modifier5, j10, getpostalcode2, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 0);
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode);
            if (z) {
                getpostalcode.serializer(1836319961);
                supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 48);
                iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
                companion2 = ComposeUiNode.Companion;
                constructor2 = companion2.getConstructor();
                if (getaddresscountry != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                AndroidContentCaptureManagerCompanion.read(CompositionLocalsKt.getLocalLayoutDirection().write(LayoutDirection.Ltr), ExtrasKt.write(528267282, new ModalBottomSheetDialogsW7UJKQ(dragAndDropTargetModifierNodeWrite, 4), getpostalcode), getpostalcode, 56);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, f3, 0.0f, 0.0f, 0.0f, 14)});
                TextKt.m131TextNvy7gAk(str, null, j11, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle4, getpostalcode, i8 & 14, (i8 >> 6) & 29360128, 131066);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
                int i38 = IconCompatParcelizer + 109;
                write = i38 % Fields.SpotShadowColor;
                int i39 = i38 % 2;
            } else {
                getpostalcode.serializer(1836788805);
                supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 48);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getaddresscountry != 0) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                dragAndDropTargetModifierNodeWrite.invoke(getpostalcode, 6);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, f3, 0.0f, 0.0f, 0.0f, 14)});
                TextKt.m131TextNvy7gAk(str, null, j11, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle4, getpostalcode, i8 & 14, (i8 >> 6) & 29360128, 131066);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            }
            j6 = j9;
            painter3 = painterPainterResource2;
            textStyle3 = textStyle4;
            f2 = f3;
            j5 = j7;
            modifier4 = modifier5;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            j4 = j3;
            f2 = f;
            textStyle3 = textStyle2;
            j5 = overflowReserved;
            modifier4 = modifier3;
            painter3 = painter;
            painterPainterResource = painter2;
            j6 = j;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final Painter painter7 = painter3;
            final Painter painter8 = painterPainterResource;
            final long j13 = j4;
            final float f5 = f2;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isBridgeAuthorized
                private static int ComponentActivity = 1;
                private static int MediaSessionCompatResultReceiverWrapper;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i310 = 2 % 2;
                    int i311 = ComponentActivity + 3;
                    MediaSessionCompatResultReceiverWrapper = i311 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i312 = i311 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    PasswordRuleContentKt.m5060PasswordRuleContent69PAOm4(str, z, modifier, modifier4, painter7, painter8, j6, j5, j13, textStyle3, f5, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i3);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i313 = ComponentActivity + 37;
                    MediaSessionCompatResultReceiverWrapper = i313 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i313 % 2 == 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
    }
}
