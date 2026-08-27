package com.roadrunner.rrds.compose.component.forms;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.forms.DropdownKt;
import io.sentry.SentryUUID;
import kotlin.ranges.RangesKt;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultPagerNestedScrollConnection;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SwitchDefaults;
import o.TextFieldDefaults;
import o.buildMapping;
import o.extractAuthorizationHeader;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.position;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.sendActivityPackage;
import o.setContentSensitive;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;
import o.urlWithExtraPathByActivityKind;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DropdownKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final getTopLeftannotations write;

    static {
        float f = Dimensions.read;
        write = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        int i = serializer + 87;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    public static final void TitleAndRequiredText(String str, boolean z, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        getPostalCode getpostalcode;
        long jSupportShouldUpRecreateTask;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 5;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-881574314);
        Object obj = null;
        if ((i & 6) == 0) {
            int i8 = RemoteActionCompatParcelizer + 27;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
            } else {
                getpostalcode2.read(str);
                obj.hashCode();
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = read + 19;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                if (getpostalcode2.write(z)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            } else {
                int i10 = 86 / 0;
                if (!getpostalcode2.write(z)) {
                    i4 = 16;
                } else {
                    i4 = 32;
                }
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i11 = RemoteActionCompatParcelizer;
                int i12 = i11 + 69;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                int i14 = i11 + 7;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.write(false) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i16 = i2;
        if ((i16 & 1171) != 1170) {
            int i17 = RemoteActionCompatParcelizer + 43;
            read = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (getpostalcode2.write(i16 & 1, z2)) {
            int i18 = RemoteActionCompatParcelizer + 71;
            read = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            if (!(!z)) {
                getpostalcode2.serializer(-1084352289);
                jSupportShouldUpRecreateTask = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setBackgroundResource();
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(-1084350176);
                jSupportShouldUpRecreateTask = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).supportShouldUpRecreateTask();
                getpostalcode2.IconCompatParcelizer(false);
            }
            long j = jSupportShouldUpRecreateTask;
            if (z) {
                getpostalcode2.serializer(-1084346974);
                ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).startSupportActionMode();
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(-1084344765);
                ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).supportInvalidateOptionsMenu();
                getpostalcode2.IconCompatParcelizer(false);
            }
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                TextKt.m131TextNvy7gAk(str, d$$ExternalSyntheticOutline0.m(1.0f, true, Modifier.Companion), j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, i16 & 14, 0, 131064);
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(-1179756400);
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new sendActivityPackage(str, z, modifier, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x017c  */
    public static final void serializer(final String str, final ButtonColors buttonColors, final ColorFilter colorFilter, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final position positionVar, final Modifier modifier, final boolean z, extractAuthorizationHeader extractauthorizationheader, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final int i, final String str2, getBirthDateFull getbirthdatefull, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z2;
        final extractAuthorizationHeader extractauthorizationheader2;
        extractAuthorizationHeader extractauthorizationheader3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = read + 85;
        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        colorFilter.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1297503090);
        if ((i2 & 6) == 0) {
            int i13 = read + 79;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i4 = (getpostalcode.read(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode.read(buttonColors) ? 32 : 16;
        }
        Object obj = null;
        if ((i2 & 384) == 0) {
            int i15 = RemoteActionCompatParcelizer + 5;
            read = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                getpostalcode.read(colorFilter);
                obj.hashCode();
                throw null;
            }
            i4 |= getpostalcode.read(colorFilter) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i16 = read + 121;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                i9 = i16 % 2 == 0 ? 2076 : Fields.CameraDistance;
            } else {
                i9 = Fields.RotationZ;
            }
            i4 |= i9;
        }
        if ((i2 & 24576) == 0) {
            i4 |= getpostalcode.read(positionVar) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= getpostalcode.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= !(getpostalcode.write(z) ^ true) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i2) == 0) {
            i4 |= 4194304;
            int i17 = read + 93;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
        }
        if ((100663296 & i2) == 0) {
            if (!(!getpostalcode.read(mutableInteractionSourceImpl))) {
                int i19 = RemoteActionCompatParcelizer + 79;
                read = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    throw null;
                }
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i4 |= i8;
        }
        if ((805306368 & i2) == 0) {
            i4 |= getpostalcode.read(i) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            if (getpostalcode.read(str2)) {
                int i20 = read + 123;
                RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i3 | i7;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (!(!getpostalcode.write(false))) {
                int i22 = read + 23;
                RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                if (i22 % 2 == 0) {
                    int i23 = 53 / 0;
                }
                i6 = 32;
            } else {
                i6 = 16;
            }
            i5 |= i6;
        }
        if ((306783379 & i4) == 306783378) {
            int i24 = read + 7;
            RemoteActionCompatParcelizer = i24 % Fields.SpotShadowColor;
            int i25 = i24 % 2;
            if ((i5 & 19) != 18) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (getpostalcode.write(i4 & 1, z2)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i2 & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                extractauthorizationheader3 = new extractAuthorizationHeader();
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                extractauthorizationheader3 = extractauthorizationheader;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            ModuleDSLKt.IconCompatParcelizer(ExtrasKt.write(-993602661, new setContentSensitive(modifier, str2, z, extractauthorizationheader3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, positionVar, buttonColors, mutableInteractionSourceImpl, str, i, colorFilter), getpostalcode), getpostalcode, 6);
            extractauthorizationheader2 = extractauthorizationheader3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            extractauthorizationheader2 = extractauthorizationheader;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.sendActivityPackageSync
                private static int MediaSessionCompatResultReceiverWrapper = 0;
                private static int PlaybackStateCompatCustomAction = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i26 = 2 % 2;
                    int i27 = PlaybackStateCompatCustomAction + 125;
                    MediaSessionCompatResultReceiverWrapper = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i28 = i27 % 2;
                    ((Integer) obj3).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i3);
                    DropdownKt.serializer(str, buttonColors, colorFilter, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, positionVar, modifier, z, extractauthorizationheader2, mutableInteractionSourceImpl, i, str2, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i29 = PlaybackStateCompatCustomAction + 67;
                    MediaSessionCompatResultReceiverWrapper = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i30 = i29 % 2;
                    return createfromparcel;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x016a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x0252  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void read(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, boolean z, int i, String str2, getBirthDateFull getbirthdatefull, int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        String str3;
        Object objComponentActivity;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer;
        long jOnTrimMemory;
        long jOnBackPressedCallback;
        long menuInflater;
        int i8;
        String str4;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i9;
        int i10;
        int i11 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1129573166);
        if ((i2 & 6) == 0) {
            int i12 = RemoteActionCompatParcelizer + 115;
            read = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode.read(str);
                throw null;
            }
            i4 = (getpostalcode.read(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0))) {
                i10 = 32;
            } else {
                int i13 = read + 13;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i10 = 16;
            }
            i4 |= i10;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i15 = RemoteActionCompatParcelizer + 71;
                read = i15 % Fields.SpotShadowColor;
                i9 = i15 % 2 != 0 ? 30241 : Fields.RotationX;
            } else {
                i9 = Fields.SpotShadowColor;
            }
            i4 |= i9;
        }
        int i16 = i3 & 8;
        if (i16 == 0) {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= getpostalcode.write(z2) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i2 & 24576) == 0) {
                int i17 = RemoteActionCompatParcelizer + 117;
                read = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i4 |= 8192;
            }
            i5 = i4 | 1769472;
            if ((599187 & i5) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!getpostalcode.write(i5 & 1, z3)) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i8 = i;
                str4 = str2;
            } else {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i2 & 1) != 0 || getpostalcode.PlaybackStateCompat()) {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    i6 = i5 & (-57345);
                    i7 = R.drawable.ic_bold_large_arrow_down;
                    z4 = z2;
                    str3 = "";
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i7 = i;
                    str3 = str2;
                    i6 = i5 & (-57345);
                    z4 = z2;
                }
                getpostalcode.RemoteActionCompatParcelizer();
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
                    int i19 = RemoteActionCompatParcelizer + 49;
                    read = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity;
                populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(mutableInteractionSourceImpl, getpostalcode, 6);
                if (((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                    getpostalcode.serializer(-1106898923);
                    jOnTrimMemory = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onSaveInstanceState();
                    getpostalcode.IconCompatParcelizer(false);
                } else if (z4) {
                    int i21 = read + 103;
                    RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    getpostalcode.serializer(-1106897036);
                    jOnTrimMemory = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onUserLeaveHint();
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1106895274);
                    jOnTrimMemory = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onTrimMemory();
                    getpostalcode.IconCompatParcelizer(false);
                }
                ColorFilter.Companion companion = ColorFilter.Companion;
                if (z4) {
                    getpostalcode.serializer(46091640);
                    jOnBackPressedCallback = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onStart();
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(46157174);
                    jOnBackPressedCallback = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).OnBackPressedCallback();
                    getpostalcode.IconCompatParcelizer(false);
                }
                int i23 = read + 49;
                RemoteActionCompatParcelizer = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                ColorFilter colorFilterM763tintxETnrds$default = ColorFilter.Companion.m763tintxETnrds$default(companion, jOnBackPressedCallback, 0, 2, null);
                position positionVarSerializer = DefaultPagerNestedScrollConnection.serializer(Dimensions.serializer, jOnTrimMemory);
                if (!((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                    getpostalcode.serializer(46444544);
                    menuInflater = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).dispatchKeyEvent();
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(46386047);
                    menuInflater = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getMenuInflater();
                    getpostalcode.IconCompatParcelizer(false);
                }
                long j = menuInflater;
                SwitchDefaults switchDefaults = ButtonDefaults.serializer;
                long jM757getTransparent0d7_KjU = Color.Companion.m757getTransparent0d7_KjU();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                ButtonColors buttonColorsRemoteActionCompatParcelizer = ButtonDefaults.RemoteActionCompatParcelizer(jM757getTransparent0d7_KjU, j, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).MediaBrowserCompatMediaItem(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).performMenuItemShortcut(), getpostalcode, 0);
                int i25 = i6 << 9;
                serializer(str, buttonColorsRemoteActionCompatParcelizer, colorFilterM763tintxETnrds$default, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, positionVarSerializer, modifier, z4, null, mutableInteractionSourceImpl, i7, str3, getpostalcode, (i6 & 14) | 100663296 | ((i6 << 6) & 7168) | (458752 & i25) | (i25 & 3670016), (i6 >> 15) & 126);
                z2 = z4;
                i8 = i7;
                str4 = str3;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new urlWithExtraPathByActivityKind(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z2, i8, str4, i2, i3);
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i2 & 24576) == 0) {
            int i110 = RemoteActionCompatParcelizer + 117;
            read = i110 % Fields.SpotShadowColor;
            int i111 = i110 % 2;
            i4 |= 8192;
        }
        i5 = i4 | 1769472;
        if ((599187 & i5) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!getpostalcode.write(i5 & 1, z3)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i8 = i;
            str4 = str2;
        } else {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    z2 = true;
                }
                i6 = i5 & (-57345);
                i7 = R.drawable.ic_bold_large_arrow_down;
                z4 = z2;
                str3 = "";
            } else {
                if (i16 != 0) {
                    z2 = true;
                }
                i6 = i5 & (-57345);
                i7 = R.drawable.ic_bold_large_arrow_down;
                z4 = z2;
                str3 = "";
            }
            getpostalcode.RemoteActionCompatParcelizer();
            objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
                int i112 = RemoteActionCompatParcelizer + 49;
                read = i112 % Fields.SpotShadowColor;
                int i26 = i112 % 2;
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) objComponentActivity;
            populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(mutableInteractionSourceImpl2, getpostalcode, 6);
            if (((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                getpostalcode.serializer(-1106898923);
                jOnTrimMemory = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onSaveInstanceState();
                getpostalcode.IconCompatParcelizer(false);
            } else if (z4) {
                int i27 = read + 103;
                RemoteActionCompatParcelizer = i27 % Fields.SpotShadowColor;
                int i28 = i27 % 2;
                getpostalcode.serializer(-1106897036);
                jOnTrimMemory = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onUserLeaveHint();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1106895274);
                jOnTrimMemory = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onTrimMemory();
                getpostalcode.IconCompatParcelizer(false);
            }
            ColorFilter.Companion companion2 = ColorFilter.Companion;
            if (z4) {
                getpostalcode.serializer(46091640);
                jOnBackPressedCallback = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onStart();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(46157174);
                jOnBackPressedCallback = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).OnBackPressedCallback();
                getpostalcode.IconCompatParcelizer(false);
            }
            int i29 = read + 49;
            RemoteActionCompatParcelizer = i29 % Fields.SpotShadowColor;
            int i210 = i29 % 2;
            ColorFilter colorFilterM763tintxETnrds$default2 = ColorFilter.Companion.m763tintxETnrds$default(companion2, jOnBackPressedCallback, 0, 2, null);
            position positionVarSerializer2 = DefaultPagerNestedScrollConnection.serializer(Dimensions.serializer, jOnTrimMemory);
            if (!((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                getpostalcode.serializer(46444544);
                menuInflater = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).dispatchKeyEvent();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(46386047);
                menuInflater = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getMenuInflater();
                getpostalcode.IconCompatParcelizer(false);
            }
            long j2 = menuInflater;
            SwitchDefaults switchDefaults2 = ButtonDefaults.serializer;
            long jM757getTransparent0d7_KjU2 = Color.Companion.m757getTransparent0d7_KjU();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            ButtonColors buttonColorsRemoteActionCompatParcelizer2 = ButtonDefaults.RemoteActionCompatParcelizer(jM757getTransparent0d7_KjU2, j2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).MediaBrowserCompatMediaItem(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).performMenuItemShortcut(), getpostalcode, 0);
            int i211 = i6 << 9;
            serializer(str, buttonColorsRemoteActionCompatParcelizer2, colorFilterM763tintxETnrds$default2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, positionVarSerializer2, modifier, z4, null, mutableInteractionSourceImpl2, i7, str3, getpostalcode, (i6 & 14) | 100663296 | ((i6 << 6) & 7168) | (458752 & i211) | (i211 & 3670016), (i6 >> 15) & 126);
            z2 = z4;
            i8 = i7;
            str4 = str3;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new urlWithExtraPathByActivityKind(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z2, i8, str4, i2, i3);
        }
    }
}
