package com.roadrunner.custom.password.presentation.compose;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.forms.PasswordFieldKt;
import com.roadrunner.rrds.compose.component.message.password.PasswordRuleContentKt;
import io.sentry.SentryUUID;
import java.util.Iterator;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidSystemCallbacksActivityCallbacks;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.NullRequestDataException;
import o.PagerWrapperFlingBehavior;
import o.awaitStarted;
import o.buildMapping;
import o.computeVerticalScrollExtent;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getOutputTransform;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.invalidateCallbacksFor;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomPasswordContentKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:100:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:101:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:106:0x0302 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0305  */
    /* JADX WARN: Code duplicated, block: B:109:0x0306  */
    /* JADX WARN: Code duplicated, block: B:113:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:115:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:117:0x03eb A[LOOP:0: B:111:0x03d3->B:117:0x03eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x04de  */
    /* JADX WARN: Code duplicated, block: B:132:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x019c  */
    /* JADX WARN: Code duplicated, block: B:76:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0208  */
    /* JADX WARN: Code duplicated, block: B:87:0x020d  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:97:0x02dc  */
    public static final void ScrollableContentWithFixedButton(invalidateCallbacksFor invalidatecallbacksfor, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        String str4;
        String str5;
        String str6;
        String str7;
        String strStringResource;
        String strStringResource2;
        int i3;
        Modifier modifier3;
        float f;
        FillElement fillElement;
        FlingCancellationException flingCancellationException;
        Alignment.Companion companion;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        Modifier modifier4;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        Object obj;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3;
        getOutputTransform getoutputtransform;
        boolean z2;
        String str8;
        boolean z3;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        int i4;
        boolean z4;
        Object objComponentActivity2;
        Iterator it;
        int i5;
        int i6;
        Object next;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        invalidatecallbacksfor.getClass();
        AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks = invalidatecallbacksfor.serializer;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-964973317);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(invalidatecallbacksfor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i11 = serializer + 51;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                i9 = i11 % 2 != 0 ? 71 : 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i12 = i2 | 3072;
        if ((i & 24576) == 0) {
            int i13 = serializer + 125;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            i12 = i13 % 2 != 0 ? i2 | 28960 : i2 | 11264;
        }
        if ((196608 & i) == 0) {
            i12 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i12 |= Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i12 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 8388608 : 4194304;
        }
        if ((4793491 & i12) != 4793490) {
            int i14 = IconCompatParcelizer + 45;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i12 & 1, z)) {
            int i15 = serializer + 21;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            } else {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    str7 = str;
                    strStringResource = str2;
                    strStringResource2 = str3;
                    i3 = i12 & (-4186113);
                    modifier3 = modifier;
                }
                getpostalcode.RemoteActionCompatParcelizer();
                f = Dimensions.getAnimatedVisibility;
                Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifier3, f, 0.0f, 2);
                fillElement = SizeKt.read;
                Modifier modifierThen = modifierM73paddingVpY3zN4$default.then(fillElement);
                flingCancellationException = Arrangement.MediaDescriptionCompat;
                companion = Alignment.Companion;
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                modifier4 = modifier3;
                companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                obj = null;
                if (getaddresscountry != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierWrite = SizeKt.write(PagerWrapperFlingBehavior.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(1.0f, true, companion3), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14), 1.0f);
                MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
                constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    i8 = serializer + 65;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        getpostalcode.serializer(constructor2);
                        throw null;
                    }
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                Modifier modifierThen2 = companion3.then(fillElement);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen2);
                constructor3 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor3);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                getoutputtransform = androidSystemCallbacksActivityCallbacks.serializer;
                z2 = getoutputtransform instanceof awaitStarted;
                if (z2) {
                    str8 = ((awaitStarted) getoutputtransform).write;
                } else {
                    str8 = "";
                }
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13)});
                TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str7, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode, 0, 0, 131066);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f, 0.0f, 0.0f, 13)});
                getpostalcode.serializer(-1934639645);
                String str9 = androidSystemCallbacksActivityCallbacks.RemoteActionCompatParcelizer;
                String str10 = androidSystemCallbacksActivityCallbacks.read;
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z3 || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 5);
                    getpostalcode.write(objComponentActivity);
                    i4 = IconCompatParcelizer + 13;
                    serializer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        int i16 = 3 % 2;
                    }
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                if ((i3 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!z4) {
                    i7 = IconCompatParcelizer + 29;
                    serializer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                        getpostalcode.write(objComponentActivity2);
                    }
                } else {
                    objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    getpostalcode.write(objComponentActivity2);
                }
                PasswordFieldKt.PasswordField(str9, null, "input_password", false, str10, z2, str8, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, null, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 384, 0, 1562);
                getpostalcode.IconCompatParcelizer(false);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f, 0.0f, 0.0f, 13)});
                TextKt.m131TextNvy7gAk(strStringResource, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onMenuItemSelected(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.write.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 0, 131066);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13)});
                getpostalcode.serializer(-1934604383);
                it = invalidatecallbacksfor.write.iterator();
                i5 = 0;
                while (it.hasNext()) {
                    i6 = serializer + 79;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        it.next();
                        obj.hashCode();
                        throw null;
                    }
                    next = it.next();
                    if (i5 >= 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    NullRequestDataException nullRequestDataException = (NullRequestDataException) next;
                    getpostalcode.serializer(-1934602789);
                    Modifier.Companion companion4 = Modifier.Companion;
                    companion4.getClass();
                    String str11 = nullRequestDataException.IconCompatParcelizer;
                    boolean z5 = nullRequestDataException.read;
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_tick_thick, getpostalcode, 0);
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_essentials_dot, getpostalcode, 0);
                    long jWindowCallbackWrapper = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).WindowCallbackWrapper();
                    int i17 = Painter.$stable;
                    PasswordRuleContentKt.m5060PasswordRuleContent69PAOm4(str11, z5, companion4, null, painterPainterResource, painterPainterResource2, 0L, jWindowCallbackWrapper, 0L, null, 0.0f, getpostalcode, (i17 << 12) | (i17 << 15), 0, 1864);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion4, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13)});
                    getpostalcode.IconCompatParcelizer(false);
                    i5++;
                }
                getpostalcode.IconCompatParcelizer(false);
                Modifier.Companion companion5 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion5, 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13)});
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                PrimaryKt.write(strStringResource2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(PaddingKt.m74paddingqDBjuR0$default(companion5, 0.0f, 0.0f, 0.0f, Dimensions.getAnimatedVisibility, 7), 1.0f), invalidatecallbacksfor.IconCompatParcelizer, false, null, null, null, null, null, getpostalcode, (i3 >> 3) & 112, 0, 2032);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = modifier4;
                str4 = str7;
                str5 = strStringResource;
                str6 = strStringResource2;
            }
            modifier3 = Modifier.Companion;
            String strStringResource3 = StringResources_androidKt.stringResource(R.string.custom_password_title, getpostalcode, 0);
            strStringResource = StringResources_androidKt.stringResource(R.string.custom_password_requirement_sub_title, getpostalcode, 0);
            i3 = i12 & (-4186113);
            strStringResource2 = StringResources_androidKt.stringResource(R.string.custom_password_button, getpostalcode, 0);
            str7 = strStringResource3;
            getpostalcode.RemoteActionCompatParcelizer();
            f = Dimensions.getAnimatedVisibility;
            Modifier modifierM73paddingVpY3zN4$default2 = PaddingKt.m73paddingVpY3zN4$default(modifier3, f, 0.0f, 2);
            fillElement = SizeKt.read;
            Modifier modifierThen3 = modifierM73paddingVpY3zN4$default2.then(fillElement);
            flingCancellationException = Arrangement.MediaDescriptionCompat;
            companion = Alignment.Companion;
            modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen3);
            modifier4 = modifier3;
            companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            obj = null;
            if (getaddresscountry != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier.Companion companion6 = Modifier.Companion;
            Modifier modifierWrite2 = SizeKt.write(PagerWrapperFlingBehavior.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(1.0f, true, companion6), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14), 1.0f);
            MeasurePolicy measurePolicy2 = BoxKt.read(companion.getTopStart(), false);
            int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                i8 = serializer + 65;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    getpostalcode.serializer(constructor2);
                    throw null;
                }
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
            Modifier modifierThen4 = companion6.then(fillElement);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen4);
            constructor3 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor3);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
            getoutputtransform = androidSystemCallbacksActivityCallbacks.serializer;
            z2 = getoutputtransform instanceof awaitStarted;
            if (z2) {
                str8 = ((awaitStarted) getoutputtransform).write;
            } else {
                str8 = "";
            }
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion6, 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13)});
            TextStyle textStyleMediaSessionCompatResultReceiverWrapper2 = performLayout.MediaSessionCompatResultReceiverWrapper();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str7, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper2, getpostalcode, 0, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion6, 0.0f, f, 0.0f, 0.0f, 13)});
            getpostalcode.serializer(-1934639645);
            String str12 = androidSystemCallbacksActivityCallbacks.RemoteActionCompatParcelizer;
            String str13 = androidSystemCallbacksActivityCallbacks.read;
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objComponentActivity = getpostalcode.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z3) {
                objComponentActivity = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 5);
                getpostalcode.write(objComponentActivity);
                i4 = IconCompatParcelizer + 13;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i18 = 3 % 2;
                }
            } else {
                objComponentActivity = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 5);
                getpostalcode.write(objComponentActivity);
                i4 = IconCompatParcelizer + 13;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i19 = 3 % 2;
                }
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            if ((i3 & 29360128) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!z4) {
                i7 = IconCompatParcelizer + 29;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    getpostalcode.write(objComponentActivity2);
                }
            } else {
                objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode.write(objComponentActivity2);
            }
            PasswordFieldKt.PasswordField(str12, null, "input_password", false, str13, z2, str8, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, null, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 384, 0, 1562);
            getpostalcode.IconCompatParcelizer(false);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion6, 0.0f, f, 0.0f, 0.0f, 13)});
            TextKt.m131TextNvy7gAk(strStringResource, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).onMenuItemSelected(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.write.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion6, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13)});
            getpostalcode.serializer(-1934604383);
            it = invalidatecallbacksfor.write.iterator();
            i5 = 0;
            while (it.hasNext()) {
                i6 = serializer + 79;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    it.next();
                    obj.hashCode();
                    throw null;
                }
                next = it.next();
                if (i5 >= 0) {
                    SQLite.serializer();
                    throw null;
                }
                NullRequestDataException nullRequestDataException2 = (NullRequestDataException) next;
                getpostalcode.serializer(-1934602789);
                Modifier.Companion companion7 = Modifier.Companion;
                companion7.getClass();
                String str14 = nullRequestDataException2.IconCompatParcelizer;
                boolean z6 = nullRequestDataException2.read;
                Painter painterPainterResource3 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_tick_thick, getpostalcode, 0);
                Painter painterPainterResource4 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_essentials_dot, getpostalcode, 0);
                long jWindowCallbackWrapper2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).WindowCallbackWrapper();
                int i110 = Painter.$stable;
                PasswordRuleContentKt.m5060PasswordRuleContent69PAOm4(str14, z6, companion7, null, painterPainterResource3, painterPainterResource4, 0L, jWindowCallbackWrapper2, 0L, null, 0.0f, getpostalcode, (i110 << 12) | (i110 << 15), 0, 1864);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion7, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13)});
                getpostalcode.IconCompatParcelizer(false);
                i5++;
            }
            getpostalcode.IconCompatParcelizer(false);
            Modifier.Companion companion8 = Modifier.Companion;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion8, 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13)});
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            PrimaryKt.write(strStringResource2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(PaddingKt.m74paddingqDBjuR0$default(companion8, 0.0f, 0.0f, 0.0f, Dimensions.getAnimatedVisibility, 7), 1.0f), invalidatecallbacksfor.IconCompatParcelizer, false, null, null, null, null, null, getpostalcode, (i3 >> 3) & 112, 0, 2032);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = modifier4;
            str4 = str7;
            str5 = strStringResource;
            str6 = strStringResource2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            str4 = str;
            str5 = str2;
            str6 = str3;
        }
        int i20 = serializer + 79;
        IconCompatParcelizer = i20 % Fields.SpotShadowColor;
        int i21 = i20 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent(invalidatecallbacksfor, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, str4, str5, str6, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, i);
        }
        int i22 = serializer + 123;
        IconCompatParcelizer = i22 % Fields.SpotShadowColor;
        int i23 = i22 % 2;
    }
}
