package com.roadrunner.rrds.compose.component.stepper;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.AwaitFirstLayoutModifier;
import o.DefaultPagerNestedScrollConnection;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.UiMediaScopePointerPrecision;
import o.WrappedAnchor;
import o.accessgetBluntcp;
import o.buildMapping;
import o.fieldToDouble;
import o.fieldToLong;
import o.fieldToString;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.jsonArrayToArray;
import o.performMeasureDjhGOtQ;
import o.position;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TaskStatusIndicatorKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void write(fieldToDouble fieldtodouble, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        fieldtodouble.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(678944222);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 13;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode.read(fieldtodouble.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(modifier)) {
                int i7 = IconCompatParcelizer + 13;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i9 = 0;
        if ((i2 & 19) != 18) {
            int i10 = read + 59;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            CircleWithContent(fieldtodouble, modifier, ExtrasKt.write(430777512, new fieldToLong(i9, fieldtodouble), getpostalcode), getpostalcode, (i2 & 14) | 384 | (i2 & 112));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 9, fieldtodouble, modifier);
            int i12 = read + 23;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
    }

    public static final void IconCompatParcelizer(fieldToDouble fieldtodouble, int i, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6 = 2 % 2;
        fieldtodouble.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1719883578);
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode.read(fieldtodouble.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i7 = read + 111;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.read(i)) {
                i5 = 32;
            } else {
                int i9 = IconCompatParcelizer + 39;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i11 = read + 25;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            int i13 = read + 69;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            CircleWithContent(fieldtodouble, modifier, ExtrasKt.write(-313126852, new AndroidPathIterator_androidKtWhenMappings(i, fieldtodouble), getpostalcode), getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112));
            int i15 = IconCompatParcelizer + 89;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new WrappedAnchor(fieldtodouble, i, modifier, i2, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    public static final void write(float f, int i, long j, getBirthDateFull getbirthdatefull, Modifier modifier) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(488258393);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.serializer(f) ? 4 : 2) | i;
        } else {
            int i4 = read + 51;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 5 / 2;
            }
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = read + 21;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i8 = IconCompatParcelizer + 63;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            Object obj = null;
            if ((i & 1) != 0) {
                int i10 = IconCompatParcelizer + 5;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    getpostalcode.PlaybackStateCompat();
                    obj.hashCode();
                    throw null;
                }
                if (getpostalcode.PlaybackStateCompat()) {
                    j = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved();
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
            } else {
                j = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved();
            }
            int i11 = i2 & (-897);
            getpostalcode.RemoteActionCompatParcelizer();
            boolean zSerializer = getpostalcode.serializer(j);
            boolean z2 = (i2 & 14) == 4;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!zSerializer && !z2) {
                int i12 = read + 3;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new UiMediaScopePointerPrecision(j, f);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new UiMediaScopePointerPrecision(j, f);
                getpostalcode.write(objComponentActivity);
            }
            AwaitFirstLayoutModifier.serializer(modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, (i11 >> 3) & 14);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        long j2 = j;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetBluntcp(f, modifier, j2, i);
            int i13 = read + 101;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:69:0x0129  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0186  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:77:0x019c  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void TaskStatusIndicator(fieldToDouble fieldtodouble, Modifier modifier, Integer num, boolean z, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Integer num2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        Modifier modifier3;
        Integer num3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Integer num4;
        boolean z4;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i8;
        int i9 = 2 % 2;
        fieldtodouble.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1690062695);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.read(fieldtodouble.ordinal()) ? 4 : 2) | i;
        } else {
            int i10 = read + 107;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                int i13 = read + 3;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    int i15 = IconCompatParcelizer + 13;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    num2 = num;
                    if (getpostalcode.read(num2)) {
                        i5 = Fields.RotationX;
                    } else {
                        i5 = Fields.SpotShadowColor;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        int i17 = read + 73;
                        IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        z2 = z;
                        if (getpostalcode.write(z2)) {
                            i7 = Fields.CameraDistance;
                        } else {
                            i7 = Fields.RotationZ;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 1171) != 1170) {
                        int i19 = read + 47;
                        IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (getpostalcode.write(i3 & 1, z3)) {
                        if (i12 != 0) {
                            modifier3 = Modifier.Companion;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        Modifier modifierSerializer = SizeKt.serializer(modifier3, 1.0f);
                        modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
                        iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                        dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer);
                        companion = ComposeUiNode.Companion;
                        constructor = companion.getConstructor();
                        if (getpostalcode.read != null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            int i21 = read + 93;
                            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                            int i22 = i21 % 2;
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                        if (num4 == null) {
                            getpostalcode.serializer(-766146410);
                            write(fieldtodouble, Modifier.Companion, getpostalcode, (i3 & 14) | 48);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            getpostalcode.serializer(-766017264);
                            IconCompatParcelizer(fieldtodouble, num4.intValue(), Modifier.Companion, getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112));
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        if (z4) {
                            getpostalcode.serializer(-765823390);
                            write(Dimensions.write, 0, 0L, getpostalcode, SizeKt.serializer(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), 1.0f));
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            getpostalcode.serializer(-765593711);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        getpostalcode.IconCompatParcelizer(true);
                        num3 = num4;
                        z2 = z4;
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        modifier3 = modifier2;
                        num3 = num2;
                    }
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        gethandleruiannotationsMediaDescriptionCompat.serializer = new fieldToString(fieldtodouble, modifier3, num3, z2, i, i2);
                    }
                }
                i8 = IconCompatParcelizer + 119;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    i3 |= 19616;
                } else {
                    i3 |= 3072;
                }
                z2 = z;
                if ((i3 & 1171) != 1170) {
                    int i110 = read + 47;
                    IconCompatParcelizer = i110 % Fields.SpotShadowColor;
                    int i23 = i110 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode.write(i3 & 1, z3)) {
                    if (i12 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    Modifier modifierSerializer2 = SizeKt.serializer(modifier3, 1.0f);
                    modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer2);
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        int i24 = read + 93;
                        IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                        int i25 = i24 % 2;
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    if (num4 == null) {
                        getpostalcode.serializer(-766146410);
                        write(fieldtodouble, Modifier.Companion, getpostalcode, (i3 & 14) | 48);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-766017264);
                        IconCompatParcelizer(fieldtodouble, num4.intValue(), Modifier.Companion, getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112));
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    if (z4) {
                        getpostalcode.serializer(-765823390);
                        write(Dimensions.write, 0, 0L, getpostalcode, SizeKt.serializer(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), 1.0f));
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-765593711);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    num3 = num4;
                    z2 = z4;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier3 = modifier2;
                    num3 = num2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new fieldToString(fieldtodouble, modifier3, num3, z2, i, i2);
                }
            }
            i3 |= 384;
            num2 = num;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    int i111 = read + 73;
                    IconCompatParcelizer = i111 % Fields.SpotShadowColor;
                    int i112 = i111 % 2;
                    z2 = z;
                    if (getpostalcode.write(z2)) {
                        i7 = Fields.CameraDistance;
                    } else {
                        i7 = Fields.RotationZ;
                    }
                    i3 |= i7;
                }
                if ((i3 & 1171) != 1170) {
                    int i113 = read + 47;
                    IconCompatParcelizer = i113 % Fields.SpotShadowColor;
                    int i26 = i113 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode.write(i3 & 1, z3)) {
                    if (i12 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    Modifier modifierSerializer3 = SizeKt.serializer(modifier3, 1.0f);
                    modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer3);
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        int i27 = read + 93;
                        IconCompatParcelizer = i27 % Fields.SpotShadowColor;
                        int i28 = i27 % 2;
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    if (num4 == null) {
                        getpostalcode.serializer(-766146410);
                        write(fieldtodouble, Modifier.Companion, getpostalcode, (i3 & 14) | 48);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-766017264);
                        IconCompatParcelizer(fieldtodouble, num4.intValue(), Modifier.Companion, getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112));
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    if (z4) {
                        getpostalcode.serializer(-765823390);
                        write(Dimensions.write, 0, 0L, getpostalcode, SizeKt.serializer(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), 1.0f));
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-765593711);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    num3 = num4;
                    z2 = z4;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier3 = modifier2;
                    num3 = num2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new fieldToString(fieldtodouble, modifier3, num3, z2, i, i2);
                }
            }
            i8 = IconCompatParcelizer + 119;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                i3 |= 19616;
            } else {
                i3 |= 3072;
            }
            z2 = z;
            if ((i3 & 1171) != 1170) {
                int i114 = read + 47;
                IconCompatParcelizer = i114 % Fields.SpotShadowColor;
                int i29 = i114 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i3 & 1, z3)) {
                if (i12 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                Modifier modifierSerializer4 = SizeKt.serializer(modifier3, 1.0f);
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer4);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i210 = read + 93;
                    IconCompatParcelizer = i210 % Fields.SpotShadowColor;
                    int i211 = i210 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (num4 == null) {
                    getpostalcode.serializer(-766146410);
                    write(fieldtodouble, Modifier.Companion, getpostalcode, (i3 & 14) | 48);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-766017264);
                    IconCompatParcelizer(fieldtodouble, num4.intValue(), Modifier.Companion, getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112));
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (z4) {
                    getpostalcode.serializer(-765823390);
                    write(Dimensions.write, 0, 0L, getpostalcode, SizeKt.serializer(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), 1.0f));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-765593711);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
                num3 = num4;
                z2 = z4;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                num3 = num2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new fieldToString(fieldtodouble, modifier3, num3, z2, i, i2);
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                int i115 = IconCompatParcelizer + 13;
                read = i115 % Fields.SpotShadowColor;
                int i116 = i115 % 2;
                num2 = num;
                if (getpostalcode.read(num2)) {
                    i5 = Fields.RotationX;
                } else {
                    i5 = Fields.SpotShadowColor;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    int i117 = read + 73;
                    IconCompatParcelizer = i117 % Fields.SpotShadowColor;
                    int i118 = i117 % 2;
                    z2 = z;
                    if (getpostalcode.write(z2)) {
                        i7 = Fields.CameraDistance;
                    } else {
                        i7 = Fields.RotationZ;
                    }
                    i3 |= i7;
                }
                if ((i3 & 1171) != 1170) {
                    int i119 = read + 47;
                    IconCompatParcelizer = i119 % Fields.SpotShadowColor;
                    int i212 = i119 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode.write(i3 & 1, z3)) {
                    if (i12 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    Modifier modifierSerializer5 = SizeKt.serializer(modifier3, 1.0f);
                    modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer5);
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        int i213 = read + 93;
                        IconCompatParcelizer = i213 % Fields.SpotShadowColor;
                        int i214 = i213 % 2;
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    if (num4 == null) {
                        getpostalcode.serializer(-766146410);
                        write(fieldtodouble, Modifier.Companion, getpostalcode, (i3 & 14) | 48);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-766017264);
                        IconCompatParcelizer(fieldtodouble, num4.intValue(), Modifier.Companion, getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112));
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    if (z4) {
                        getpostalcode.serializer(-765823390);
                        write(Dimensions.write, 0, 0L, getpostalcode, SizeKt.serializer(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), 1.0f));
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-765593711);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    num3 = num4;
                    z2 = z4;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier3 = modifier2;
                    num3 = num2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new fieldToString(fieldtodouble, modifier3, num3, z2, i, i2);
                }
            }
            i8 = IconCompatParcelizer + 119;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                i3 |= 19616;
            } else {
                i3 |= 3072;
            }
            z2 = z;
            if ((i3 & 1171) != 1170) {
                int i1110 = read + 47;
                IconCompatParcelizer = i1110 % Fields.SpotShadowColor;
                int i215 = i1110 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i3 & 1, z3)) {
                if (i12 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                Modifier modifierSerializer6 = SizeKt.serializer(modifier3, 1.0f);
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer6);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i216 = read + 93;
                    IconCompatParcelizer = i216 % Fields.SpotShadowColor;
                    int i217 = i216 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (num4 == null) {
                    getpostalcode.serializer(-766146410);
                    write(fieldtodouble, Modifier.Companion, getpostalcode, (i3 & 14) | 48);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-766017264);
                    IconCompatParcelizer(fieldtodouble, num4.intValue(), Modifier.Companion, getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112));
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (z4) {
                    getpostalcode.serializer(-765823390);
                    write(Dimensions.write, 0, 0L, getpostalcode, SizeKt.serializer(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), 1.0f));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-765593711);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
                num3 = num4;
                z2 = z4;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                num3 = num2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new fieldToString(fieldtodouble, modifier3, num3, z2, i, i2);
            }
        }
        i3 |= 384;
        num2 = num;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                int i1111 = read + 73;
                IconCompatParcelizer = i1111 % Fields.SpotShadowColor;
                int i1112 = i1111 % 2;
                z2 = z;
                if (getpostalcode.write(z2)) {
                    i7 = Fields.CameraDistance;
                } else {
                    i7 = Fields.RotationZ;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) != 1170) {
                int i1113 = read + 47;
                IconCompatParcelizer = i1113 % Fields.SpotShadowColor;
                int i218 = i1113 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i3 & 1, z3)) {
                if (i12 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                Modifier modifierSerializer7 = SizeKt.serializer(modifier3, 1.0f);
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer7);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i219 = read + 93;
                    IconCompatParcelizer = i219 % Fields.SpotShadowColor;
                    int i2110 = i219 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (num4 == null) {
                    getpostalcode.serializer(-766146410);
                    write(fieldtodouble, Modifier.Companion, getpostalcode, (i3 & 14) | 48);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-766017264);
                    IconCompatParcelizer(fieldtodouble, num4.intValue(), Modifier.Companion, getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112));
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (z4) {
                    getpostalcode.serializer(-765823390);
                    write(Dimensions.write, 0, 0L, getpostalcode, SizeKt.serializer(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), 1.0f));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-765593711);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
                num3 = num4;
                z2 = z4;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                num3 = num2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new fieldToString(fieldtodouble, modifier3, num3, z2, i, i2);
            }
        }
        i8 = IconCompatParcelizer + 119;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            i3 |= 19616;
        } else {
            i3 |= 3072;
        }
        z2 = z;
        if ((i3 & 1171) != 1170) {
            int i1114 = read + 47;
            IconCompatParcelizer = i1114 % Fields.SpotShadowColor;
            int i2111 = i1114 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode.write(i3 & 1, z3)) {
            if (i12 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (i6 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            Modifier modifierSerializer8 = SizeKt.serializer(modifier3, 1.0f);
            modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer8);
            companion = ComposeUiNode.Companion;
            constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i2112 = read + 93;
                IconCompatParcelizer = i2112 % Fields.SpotShadowColor;
                int i2113 = i2112 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (num4 == null) {
                getpostalcode.serializer(-766146410);
                write(fieldtodouble, Modifier.Companion, getpostalcode, (i3 & 14) | 48);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-766017264);
                IconCompatParcelizer(fieldtodouble, num4.intValue(), Modifier.Companion, getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112));
                getpostalcode.IconCompatParcelizer(false);
            }
            if (z4) {
                getpostalcode.serializer(-765823390);
                write(Dimensions.write, 0, 0L, getpostalcode, SizeKt.serializer(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), 1.0f));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-765593711);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            num3 = num4;
            z2 = z4;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
            num3 = num2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new fieldToString(fieldtodouble, modifier3, num3, z2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    public static final void CircleWithContent(fieldToDouble fieldtodouble, Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        long dropDownBackgroundResource;
        Modifier modifierWrite;
        boolean z;
        long popupTheme;
        boolean z2;
        long supportBackgroundTintMode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        fieldtodouble.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(354521244);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i6 = read + 95;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (!getpostalcode.read(fieldtodouble.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.read(modifier)) {
                i4 = 16;
            } else {
                int i8 = IconCompatParcelizer + 79;
                read = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 != 0 ? 9 : 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i9 = read + 7;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 73 / 0;
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(modifier, Dimensions.setVisibility);
            int[] iArr = jsonArrayToArray.RemoteActionCompatParcelizer;
            int i11 = iArr[fieldtodouble.ordinal()];
            if (i11 == 1) {
                getpostalcode.serializer(-608818628);
                dropDownBackgroundResource = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setDropDownBackgroundResource();
                getpostalcode.IconCompatParcelizer(false);
            } else if (i11 != 2) {
                int i12 = read + 51;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (i11 != 3) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -608820209, false);
                }
                getpostalcode.serializer(-608815623);
                dropDownBackgroundResource = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-608817186);
                dropDownBackgroundResource = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setKeyListener();
                getpostalcode.IconCompatParcelizer(false);
            }
            getTopLeftannotations gettopleftannotations = RoundedCornerShapeKt.IconCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierM83size3ABfNKs, dropDownBackgroundResource, gettopleftannotations);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (fieldtodouble != fieldToDouble.Complete) {
                getpostalcode.serializer(-1223201479);
                Modifier.Companion companion3 = Modifier.Companion;
                float f = Dimensions.write;
                int i14 = iArr[fieldtodouble.ordinal()];
                if (i14 != 2) {
                    int i15 = IconCompatParcelizer + 27;
                    read = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0 ? i14 == 3 : i14 == 3) {
                        z2 = false;
                        getpostalcode.serializer(-655108134);
                        supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener();
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-655107206);
                        supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                        z2 = false;
                        getpostalcode.IconCompatParcelizer(false);
                    }
                } else {
                    z2 = false;
                    getpostalcode.serializer(-655109542);
                    supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
                    getpostalcode.IconCompatParcelizer(false);
                }
                position positionVarSerializer = DefaultPagerNestedScrollConnection.serializer(f, supportBackgroundTintMode);
                modifierWrite = BorderKt.write(companion3, positionVarSerializer.read, positionVarSerializer.IconCompatParcelizer, gettopleftannotations);
                getpostalcode.IconCompatParcelizer(z2);
            } else {
                getpostalcode.serializer(-1223084020);
                getpostalcode.IconCompatParcelizer(false);
                modifierWrite = Modifier.Companion;
            }
            Modifier modifierM83size3ABfNKs2 = SizeKt.m83size3ABfNKs(modifierWrite, Dimensions.getAnimatedVisibility);
            if (iArr[fieldtodouble.ordinal()] == 1) {
                int i16 = read + 11;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    getpostalcode.serializer(-702447866);
                    popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList();
                    getpostalcode.IconCompatParcelizer(true);
                    z = false;
                } else {
                    getpostalcode.serializer(-702447866);
                    popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList();
                    z = false;
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                z = false;
                getpostalcode.serializer(-702446876);
                popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                getpostalcode.IconCompatParcelizer(false);
            }
            Modifier modifierM20backgroundbw27NRU2 = BackgroundKt.m20backgroundbw27NRU(modifierM83size3ABfNKs2, popupTheme, gettopleftannotations);
            MeasurePolicy measurePolicy2 = BoxKt.read(companion.getCenter(), z);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i17 = IconCompatParcelizer + 29;
                read = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    getpostalcode.serializer(constructor2);
                    int i18 = 69 / 0;
                } else {
                    getpostalcode.serializer(constructor2);
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i2 >> 6) & 14));
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(fieldtodouble, modifier, dragAndDropTargetModifierNode, i, 16);
        }
    }
}
