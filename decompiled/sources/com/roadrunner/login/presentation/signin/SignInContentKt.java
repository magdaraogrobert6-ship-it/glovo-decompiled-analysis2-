package com.roadrunner.login.presentation.signin;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.nest.NestScreenKt$$ExternalSyntheticLambda0;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.forms.PasswordFieldKt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import java.util.WeakHashMap;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.QueryResultDefaultImpls;
import o.SmallPersistentVector;
import o.TooltipKt;
import o.UiMediaScopeImpl;
import o.buildMapping;
import o.ch;
import o.currentTransaction;
import o.d4ExternalSyntheticLambda2;
import o.d9;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getBoolean;
import o.getCenterHorizontally;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getDriver;
import o.getHandleruiannotations;
import o.getInvalidationTracker;
import o.getLong;
import o.getNewPassword;
import o.getPersonLastName;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.setRoundRectOutlineTNW_H78default;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SignInContentKt {
    private static int IconCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:126:0x030f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0314  */
    /* JADX WARN: Code duplicated, block: B:132:0x032f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0336  */
    /* JADX WARN: Code duplicated, block: B:173:0x0481  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    public static final void SignInContent(final d4ExternalSyntheticLambda2 d4externalsyntheticlambda2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, Modifier modifier, getInvalidationTracker getinvalidationtracker, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        int i3;
        Object obj;
        ?? r5;
        ?? r14;
        Object obj2;
        boolean z2;
        final d4ExternalSyntheticLambda2 d4externalsyntheticlambda3;
        boolean z3;
        Object obj3;
        boolean zIconCompatParcelizer;
        boolean zIconCompatParcelizer2;
        boolean z4;
        Object obj4;
        boolean zIconCompatParcelizer3;
        boolean zIconCompatParcelizer4;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 61;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPersonLastName getpersonlastname = d4externalsyntheticlambda2.write;
        getDriver getdriver = getDriver.RemoteActionCompatParcelizer;
        QueryResultDefaultImpls queryResultDefaultImpls = d4externalsyntheticlambda2.MediaSessionCompatQueueItem;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(2084628267);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i7 = IconCompatParcelizer + 61;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0 ? (i & 8) == 0 : (i & 66) == 0) {
                zIconCompatParcelizer4 = getpostalcode2.read(d4externalsyntheticlambda2);
            } else {
                zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(d4externalsyntheticlambda2);
            }
            i2 = (zIconCompatParcelizer4 ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i8 = write + 107;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= !getpostalcode2.read(modifier) ? 65536 : Fields.RenderEffect;
        }
        if ((1572864 & i) == 0) {
            int i10 = write + 91;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 55 / 0;
                if ((i & 2097152) == 0) {
                    zIconCompatParcelizer3 = getpostalcode2.read(getinvalidationtracker);
                } else {
                    zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getinvalidationtracker);
                }
            } else if ((i & 2097152) == 0) {
                zIconCompatParcelizer3 = getpostalcode2.read(getinvalidationtracker);
            } else {
                zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getinvalidationtracker);
            }
            i2 |= zIconCompatParcelizer3 ^ true ? Fields.BlendMode : 1048576;
        }
        int i12 = i2;
        if (getpostalcode2.write(i12 & 1, (599187 & i12) != 599186)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode2.PlaybackStateCompat()) {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            Modifier modifierThen = modifier.then(SizeKt.read);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierThen, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                HeaderKt.m5063HeaderbbrV0mI(null, null, null, 0L, 0.0f, ExtrasKt.write(1647025590, new trigger(7, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode2), null, null, null, getpostalcode2, 196608, 479);
                getPostalCode getpostalcode3 = getpostalcode2;
                ScrollState scrollState = PagerWrapperFlingBehavior.read(0, getpostalcode3, 1);
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierM = d$$ExternalSyntheticOutline0.m(1.0f, true, companion3);
                float f = Dimensions.getAnimatedVisibility;
                Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(PaddingKt.write(modifierM, f), scrollState, false, 14);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode3, 0);
                int iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierIconCompatParcelizer);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode3.ComponentActivity) {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i13 = IconCompatParcelizer + 37;
                    write = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        getpostalcode3.serializer(constructor2);
                    } else {
                        getpostalcode3.serializer(constructor2);
                        throw null;
                    }
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
                Object objComponentActivity = getpostalcode3.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                Object obj5 = objComponentActivity;
                if (objComponentActivity == androidContentCaptureManager) {
                    getContentViewGroupParentLayout getcontentviewgroupparentlayoutRemoteActionCompatParcelizer = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3);
                    getpostalcode3.write(getcontentviewgroupparentlayoutRemoteActionCompatParcelizer);
                    obj5 = getcontentviewgroupparentlayoutRemoteActionCompatParcelizer;
                }
                final getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj5;
                Object objComponentActivity2 = getpostalcode3.ComponentActivity();
                Object obj6 = objComponentActivity2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    BringIntoViewRequesterImpl bringIntoViewRequesterImpl = new BringIntoViewRequesterImpl();
                    getpostalcode3.write(bringIntoViewRequesterImpl);
                    obj6 = bringIntoViewRequesterImpl;
                }
                final BringIntoViewRequesterImpl bringIntoViewRequesterImpl2 = (BringIntoViewRequesterImpl) obj6;
                Object objComponentActivity3 = getpostalcode3.ComponentActivity();
                Object obj7 = objComponentActivity3;
                if (objComponentActivity3 == androidContentCaptureManager) {
                    BringIntoViewRequesterImpl bringIntoViewRequesterImpl3 = new BringIntoViewRequesterImpl();
                    getpostalcode3.write(bringIntoViewRequesterImpl3);
                    obj7 = bringIntoViewRequesterImpl3;
                }
                BringIntoViewRequesterImpl bringIntoViewRequesterImpl4 = (BringIntoViewRequesterImpl) obj7;
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.login_sign_in_title, getpostalcode3, 0), companion3, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode3, 48, 0, 131064);
                if (queryResultDefaultImpls instanceof currentTransaction) {
                    getpostalcode3.serializer(908613430);
                    getBoolean getboolean = ((currentTransaction) queryResultDefaultImpls).write;
                    String strWrite = getboolean.write();
                    String str = getboolean.IconCompatParcelizer;
                    boolean zBooleanValue = ((Boolean) getpersonlastname.getValue()).booleanValue();
                    String str2 = (String) getboolean.serializer.getValue();
                    getCenterHorizontally getcenterhorizontally = new getCenterHorizontally(getboolean.MediaSessionCompatQueueItem, 0, 123);
                    Modifier modifierWrite = SmallPersistentVector.write(PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f, 0.0f, 0.0f, 13), bringIntoViewRequesterImpl2);
                    if ((i12 & 14) != 4) {
                        int i14 = write + 95;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 != 0 ? (i12 & 8) == 0 : (i12 & 103) == 0) {
                            d4externalsyntheticlambda3 = d4externalsyntheticlambda2;
                        } else {
                            d4externalsyntheticlambda3 = d4externalsyntheticlambda2;
                            if (getpostalcode3.IconCompatParcelizer(d4externalsyntheticlambda3)) {
                            }
                            Object objComponentActivity4 = getpostalcode3.ComponentActivity();
                            if (!z3 || objComponentActivity4 == androidContentCaptureManager) {
                                final int i15 = 0;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d2
                                    private static int read = 0;
                                    private static int serializer = 1;

                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                    public final Object invoke(Object obj8) {
                                        int i16 = 2 % 2;
                                        int i17 = serializer + 69;
                                        read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i18 = i17 % 2;
                                        int i19 = i15;
                                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                        d4ExternalSyntheticLambda2 d4externalsyntheticlambda4 = d4externalsyntheticlambda3;
                                        String str3 = (String) obj8;
                                        if (i19 != 0) {
                                            str3.getClass();
                                            getBoolean getboolean2 = d4externalsyntheticlambda4.MediaDescriptionCompat;
                                            getboolean2.read(str3);
                                            getboolean2.read();
                                            return createfromparcel;
                                        }
                                        str3.getClass();
                                        QueryResultDefaultImpls queryResultDefaultImpls2 = d4externalsyntheticlambda4.MediaSessionCompatQueueItem;
                                        ((currentTransaction) queryResultDefaultImpls2).write.read(str3);
                                        ((currentTransaction) queryResultDefaultImpls2).write.read();
                                        int i20 = read + 63;
                                        serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i20 % 2 != 0) {
                                            return createfromparcel;
                                        }
                                        Object obj9 = null;
                                        obj9.hashCode();
                                        throw null;
                                    }
                                };
                                getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                                obj3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            } else {
                                obj3 = objComponentActivity4;
                            }
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                            zIconCompatParcelizer = getpostalcode3.IconCompatParcelizer(getcontentviewgroupparentlayout);
                            zIconCompatParcelizer2 = getpostalcode3.IconCompatParcelizer(bringIntoViewRequesterImpl2);
                            Object objComponentActivity5 = getpostalcode3.ComponentActivity();
                            if ((!zIconCompatParcelizer && !zIconCompatParcelizer2) || objComponentActivity5 == androidContentCaptureManager) {
                                z4 = false;
                                final boolean z5 = false ? 1 : 0;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d1
                                    private static int IconCompatParcelizer = 0;
                                    private static int read = 1;

                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                    public final Object invoke(Object obj8) {
                                        int i16 = 2 % 2;
                                        int i17 = z5;
                                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                        androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl5 = bringIntoViewRequesterImpl2;
                                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                        androidx.compose.ui.focus.FocusState focusState = (androidx.compose.ui.focus.FocusState) obj8;
                                        if (i17 != 0) {
                                            focusState.getClass();
                                            if (focusState.getHasFocus()) {
                                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 2), 3);
                                                int i18 = IconCompatParcelizer + 13;
                                                read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                int i19 = i18 % 2;
                                            }
                                            return createfromparcel;
                                        }
                                        focusState.getClass();
                                        if (focusState.getHasFocus()) {
                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 1), 3);
                                            int i20 = read + 45;
                                            IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i21 = i20 % 2;
                                        }
                                        return createfromparcel;
                                    }
                                };
                                getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm3);
                                obj4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                            } else {
                                z4 = false;
                                obj4 = objComponentActivity5;
                            }
                            TextInputBigV2Kt.TextInputBigV2(strWrite, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifierWrite, false, null, str, null, null, zBooleanValue, str2, null, true, 0, getcenterhorizontally, null, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, "input_username_field", null, getpostalcode3, 0, 3072, 48, 5198776);
                            getpostalcode3.IconCompatParcelizer(z4);
                            r5 = z4;
                            i3 = i12;
                        }
                        z3 = false;
                        Object objComponentActivity6 = getpostalcode3.ComponentActivity();
                        if (z3) {
                            final int i16 = 0;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d2
                                private static int read = 0;
                                private static int serializer = 1;

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj8) {
                                    int i17 = 2 % 2;
                                    int i18 = serializer + 69;
                                    read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i19 = i18 % 2;
                                    int i110 = i16;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    d4ExternalSyntheticLambda2 d4externalsyntheticlambda4 = d4externalsyntheticlambda3;
                                    String str3 = (String) obj8;
                                    if (i110 != 0) {
                                        str3.getClass();
                                        getBoolean getboolean2 = d4externalsyntheticlambda4.MediaDescriptionCompat;
                                        getboolean2.read(str3);
                                        getboolean2.read();
                                        return createfromparcel;
                                    }
                                    str3.getClass();
                                    QueryResultDefaultImpls queryResultDefaultImpls2 = d4externalsyntheticlambda4.MediaSessionCompatQueueItem;
                                    ((currentTransaction) queryResultDefaultImpls2).write.read(str3);
                                    ((currentTransaction) queryResultDefaultImpls2).write.read();
                                    int i20 = read + 63;
                                    serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i20 % 2 != 0) {
                                        return createfromparcel;
                                    }
                                    Object obj9 = null;
                                    obj9.hashCode();
                                    throw null;
                                }
                            };
                            getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm4);
                            obj3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                        } else {
                            final int i17 = 0;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d2
                                private static int read = 0;
                                private static int serializer = 1;

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj8) {
                                    int i18 = 2 % 2;
                                    int i19 = serializer + 69;
                                    read = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i110 = i19 % 2;
                                    int i111 = i17;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    d4ExternalSyntheticLambda2 d4externalsyntheticlambda4 = d4externalsyntheticlambda3;
                                    String str3 = (String) obj8;
                                    if (i111 != 0) {
                                        str3.getClass();
                                        getBoolean getboolean2 = d4externalsyntheticlambda4.MediaDescriptionCompat;
                                        getboolean2.read(str3);
                                        getboolean2.read();
                                        return createfromparcel;
                                    }
                                    str3.getClass();
                                    QueryResultDefaultImpls queryResultDefaultImpls2 = d4externalsyntheticlambda4.MediaSessionCompatQueueItem;
                                    ((currentTransaction) queryResultDefaultImpls2).write.read(str3);
                                    ((currentTransaction) queryResultDefaultImpls2).write.read();
                                    int i20 = read + 63;
                                    serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i20 % 2 != 0) {
                                        return createfromparcel;
                                    }
                                    Object obj9 = null;
                                    obj9.hashCode();
                                    throw null;
                                }
                            };
                            getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm5);
                            obj3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
                        }
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                        zIconCompatParcelizer = getpostalcode3.IconCompatParcelizer(getcontentviewgroupparentlayout);
                        zIconCompatParcelizer2 = getpostalcode3.IconCompatParcelizer(bringIntoViewRequesterImpl2);
                        Object objComponentActivity7 = getpostalcode3.ComponentActivity();
                        if (!(zIconCompatParcelizer | zIconCompatParcelizer2)) {
                            z4 = false;
                            final int z6 = false ? 1 : 0;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d1
                                private static int IconCompatParcelizer = 0;
                                private static int read = 1;

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj8) {
                                    int i18 = 2 % 2;
                                    int i19 = z6;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl5 = bringIntoViewRequesterImpl2;
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                    androidx.compose.ui.focus.FocusState focusState = (androidx.compose.ui.focus.FocusState) obj8;
                                    if (i19 != 0) {
                                        focusState.getClass();
                                        if (focusState.getHasFocus()) {
                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 2), 3);
                                            int i110 = IconCompatParcelizer + 13;
                                            read = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i111 = i110 % 2;
                                        }
                                        return createfromparcel;
                                    }
                                    focusState.getClass();
                                    if (focusState.getHasFocus()) {
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 1), 3);
                                        int i20 = read + 45;
                                        IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i21 = i20 % 2;
                                    }
                                    return createfromparcel;
                                }
                            };
                            getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm7);
                            obj4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                        } else {
                            z4 = false;
                            final int z7 = false ? 1 : 0;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d1
                                private static int IconCompatParcelizer = 0;
                                private static int read = 1;

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj8) {
                                    int i18 = 2 % 2;
                                    int i19 = z7;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl5 = bringIntoViewRequesterImpl2;
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                    androidx.compose.ui.focus.FocusState focusState = (androidx.compose.ui.focus.FocusState) obj8;
                                    if (i19 != 0) {
                                        focusState.getClass();
                                        if (focusState.getHasFocus()) {
                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 2), 3);
                                            int i110 = IconCompatParcelizer + 13;
                                            read = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i111 = i110 % 2;
                                        }
                                        return createfromparcel;
                                    }
                                    focusState.getClass();
                                    if (focusState.getHasFocus()) {
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 1), 3);
                                        int i20 = read + 45;
                                        IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i21 = i20 % 2;
                                    }
                                    return createfromparcel;
                                }
                            };
                            getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm8);
                            obj4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm8;
                        }
                        TextInputBigV2Kt.TextInputBigV2(strWrite, r8lambdaunavo3sxub_pc9xroryotnrlvsm6, modifierWrite, false, null, str, null, null, zBooleanValue, str2, null, true, 0, getcenterhorizontally, null, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, "input_username_field", null, getpostalcode3, 0, 3072, 48, 5198776);
                        getpostalcode3.IconCompatParcelizer(z4);
                        r5 = z4;
                        i3 = i12;
                    } else {
                        d4externalsyntheticlambda3 = d4externalsyntheticlambda2;
                    }
                    z3 = true;
                    Object objComponentActivity8 = getpostalcode3.ComponentActivity();
                    if (z3) {
                        final int i18 = 0;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d2
                            private static int read = 0;
                            private static int serializer = 1;

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj8) {
                                int i19 = 2 % 2;
                                int i110 = serializer + 69;
                                read = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i111 = i110 % 2;
                                int i112 = i18;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                d4ExternalSyntheticLambda2 d4externalsyntheticlambda4 = d4externalsyntheticlambda3;
                                String str3 = (String) obj8;
                                if (i112 != 0) {
                                    str3.getClass();
                                    getBoolean getboolean2 = d4externalsyntheticlambda4.MediaDescriptionCompat;
                                    getboolean2.read(str3);
                                    getboolean2.read();
                                    return createfromparcel;
                                }
                                str3.getClass();
                                QueryResultDefaultImpls queryResultDefaultImpls2 = d4externalsyntheticlambda4.MediaSessionCompatQueueItem;
                                ((currentTransaction) queryResultDefaultImpls2).write.read(str3);
                                ((currentTransaction) queryResultDefaultImpls2).write.read();
                                int i20 = read + 63;
                                serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i20 % 2 != 0) {
                                    return createfromparcel;
                                }
                                Object obj9 = null;
                                obj9.hashCode();
                                throw null;
                            }
                        };
                        getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm9);
                        obj3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm9;
                    } else {
                        final int i19 = 0;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d2
                            private static int read = 0;
                            private static int serializer = 1;

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj8) {
                                int i110 = 2 % 2;
                                int i111 = serializer + 69;
                                read = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i112 = i111 % 2;
                                int i113 = i19;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                d4ExternalSyntheticLambda2 d4externalsyntheticlambda4 = d4externalsyntheticlambda3;
                                String str3 = (String) obj8;
                                if (i113 != 0) {
                                    str3.getClass();
                                    getBoolean getboolean2 = d4externalsyntheticlambda4.MediaDescriptionCompat;
                                    getboolean2.read(str3);
                                    getboolean2.read();
                                    return createfromparcel;
                                }
                                str3.getClass();
                                QueryResultDefaultImpls queryResultDefaultImpls2 = d4externalsyntheticlambda4.MediaSessionCompatQueueItem;
                                ((currentTransaction) queryResultDefaultImpls2).write.read(str3);
                                ((currentTransaction) queryResultDefaultImpls2).write.read();
                                int i20 = read + 63;
                                serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i20 % 2 != 0) {
                                    return createfromparcel;
                                }
                                Object obj9 = null;
                                obj9.hashCode();
                                throw null;
                            }
                        };
                        getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm10);
                        obj3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm10;
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                    zIconCompatParcelizer = getpostalcode3.IconCompatParcelizer(getcontentviewgroupparentlayout);
                    zIconCompatParcelizer2 = getpostalcode3.IconCompatParcelizer(bringIntoViewRequesterImpl2);
                    Object objComponentActivity9 = getpostalcode3.ComponentActivity();
                    if (!(zIconCompatParcelizer | zIconCompatParcelizer2)) {
                        z4 = false;
                        final int z8 = false ? 1 : 0;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d1
                            private static int IconCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj8) {
                                int i110 = 2 % 2;
                                int i111 = z8;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl5 = bringIntoViewRequesterImpl2;
                                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                androidx.compose.ui.focus.FocusState focusState = (androidx.compose.ui.focus.FocusState) obj8;
                                if (i111 != 0) {
                                    focusState.getClass();
                                    if (focusState.getHasFocus()) {
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 2), 3);
                                        int i112 = IconCompatParcelizer + 13;
                                        read = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i113 = i112 % 2;
                                    }
                                    return createfromparcel;
                                }
                                focusState.getClass();
                                if (focusState.getHasFocus()) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 1), 3);
                                    int i20 = read + 45;
                                    IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i21 = i20 % 2;
                                }
                                return createfromparcel;
                            }
                        };
                        getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm12);
                        obj4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm12;
                    } else {
                        z4 = false;
                        final int z9 = false ? 1 : 0;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d1
                            private static int IconCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj8) {
                                int i110 = 2 % 2;
                                int i111 = z9;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl5 = bringIntoViewRequesterImpl2;
                                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                androidx.compose.ui.focus.FocusState focusState = (androidx.compose.ui.focus.FocusState) obj8;
                                if (i111 != 0) {
                                    focusState.getClass();
                                    if (focusState.getHasFocus()) {
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 2), 3);
                                        int i112 = IconCompatParcelizer + 13;
                                        read = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i113 = i112 % 2;
                                    }
                                    return createfromparcel;
                                }
                                focusState.getClass();
                                if (focusState.getHasFocus()) {
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 1), 3);
                                    int i20 = read + 45;
                                    IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i21 = i20 % 2;
                                }
                                return createfromparcel;
                            }
                        };
                        getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm13);
                        obj4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm13;
                    }
                    TextInputBigV2Kt.TextInputBigV2(strWrite, r8lambdaunavo3sxub_pc9xroryotnrlvsm11, modifierWrite, false, null, str, null, null, zBooleanValue, str2, null, true, 0, getcenterhorizontally, null, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, "input_username_field", null, getpostalcode3, 0, 3072, 48, 5198776);
                    getpostalcode3.IconCompatParcelizer(z4);
                    r5 = z4;
                    i3 = i12;
                } else {
                    if (queryResultDefaultImpls instanceof getLong) {
                        getpostalcode3.serializer(910081032);
                        getLong getlong = (getLong) queryResultDefaultImpls;
                        getBoolean getboolean2 = getlong.write;
                        String str3 = getlong.RatingCompat;
                        String str4 = (String) getboolean2.serializer.getValue();
                        Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f, 0.0f, 0.0f, 13);
                        modifierM74paddingqDBjuR0$default.getClass();
                        boolean zBooleanValue2 = ((Boolean) getpersonlastname.getValue()).booleanValue();
                        boolean zIconCompatParcelizer5 = getpostalcode3.IconCompatParcelizer(getcontentviewgroupparentlayout);
                        boolean zIconCompatParcelizer6 = getpostalcode3.IconCompatParcelizer(bringIntoViewRequesterImpl2);
                        Object objComponentActivity10 = getpostalcode3.ComponentActivity();
                        if ((zIconCompatParcelizer5 | zIconCompatParcelizer6) || objComponentActivity10 == androidContentCaptureManager) {
                            obj = objComponentActivity10;
                            final int i20 = 1;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d1
                                private static int IconCompatParcelizer = 0;
                                private static int read = 1;

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj8) {
                                    int i110 = 2 % 2;
                                    int i111 = i20;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl5 = bringIntoViewRequesterImpl2;
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                    androidx.compose.ui.focus.FocusState focusState = (androidx.compose.ui.focus.FocusState) obj8;
                                    if (i111 != 0) {
                                        focusState.getClass();
                                        if (focusState.getHasFocus()) {
                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 2), 3);
                                            int i112 = IconCompatParcelizer + 13;
                                            read = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i113 = i112 % 2;
                                        }
                                        return createfromparcel;
                                    }
                                    focusState.getClass();
                                    if (focusState.getHasFocus()) {
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl5, null, 1), 3);
                                        int i21 = read + 45;
                                        IconCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i22 = i21 % 2;
                                    }
                                    return createfromparcel;
                                }
                            };
                            getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm14);
                            obj = r8lambdaunavo3sxub_pc9xroryotnrlvsm14;
                        }
                        z = false;
                        ch.read(getboolean2, str3, modifierM74paddingqDBjuR0$default, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj, zBooleanValue2, str4, null, getpostalcode3, 8);
                        getpostalcode3.IconCompatParcelizer(false);
                        i3 = i12;
                    } else {
                        z = false;
                        i3 = i12;
                        if (queryResultDefaultImpls == null) {
                            getpostalcode3.serializer(1553406563);
                            getpostalcode3.IconCompatParcelizer(false);
                        } else {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode3, 1553328457, false);
                        }
                    }
                    r5 = z;
                }
                String strWrite2 = d4externalsyntheticlambda2.MediaDescriptionCompat.write();
                String strStringResource = StringResources_androidKt.stringResource(R.string.COURIER_AND_PASSWORD, getpostalcode3, r5);
                boolean z10 = d4externalsyntheticlambda2.read;
                float f2 = Dimensions.setTabContainer;
                Modifier modifierWrite2 = SmallPersistentVector.write(PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f2, 0.0f, 0.0f, 13), bringIntoViewRequesterImpl4);
                ?? r15 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && getpostalcode3.IconCompatParcelizer(d4externalsyntheticlambda2))) ? 1 : r5;
                Object objComponentActivity11 = getpostalcode3.ComponentActivity();
                Object obj8 = objComponentActivity11;
                if (r15 != 0 || objComponentActivity11 == androidContentCaptureManager) {
                    final int i21 = 1;
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.d2
                        private static int read = 0;
                        private static int serializer = 1;

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj9) {
                            int i110 = 2 % 2;
                            int i111 = serializer + 69;
                            read = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i112 = i111 % 2;
                            int i113 = i21;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            d4ExternalSyntheticLambda2 d4externalsyntheticlambda4 = d4externalsyntheticlambda2;
                            String str5 = (String) obj9;
                            if (i113 != 0) {
                                str5.getClass();
                                getBoolean getboolean3 = d4externalsyntheticlambda4.MediaDescriptionCompat;
                                getboolean3.read(str5);
                                getboolean3.read();
                                return createfromparcel;
                            }
                            str5.getClass();
                            QueryResultDefaultImpls queryResultDefaultImpls2 = d4externalsyntheticlambda4.MediaSessionCompatQueueItem;
                            ((currentTransaction) queryResultDefaultImpls2).write.read(str5);
                            ((currentTransaction) queryResultDefaultImpls2).write.read();
                            int i22 = read + 63;
                            serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i22 % 2 != 0) {
                                return createfromparcel;
                            }
                            Object obj10 = null;
                            obj10.hashCode();
                            throw null;
                        }
                    };
                    getpostalcode3.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm15);
                    obj8 = r8lambdaunavo3sxub_pc9xroryotnrlvsm15;
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm16 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8;
                if ((i3 & 7168) == 2048) {
                    int i22 = write + 81;
                    IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    r14 = 1;
                } else {
                    r14 = r5;
                }
                boolean zIconCompatParcelizer7 = getpostalcode3.IconCompatParcelizer(getcontentviewgroupparentlayout);
                boolean zIconCompatParcelizer8 = getpostalcode3.IconCompatParcelizer(bringIntoViewRequesterImpl4);
                Object objComponentActivity12 = getpostalcode3.ComponentActivity();
                if (!((((zIconCompatParcelizer7 ? 1 : 0) | r14) == true ? 1 : 0) | (zIconCompatParcelizer8 ? 1 : 0))) {
                    int i24 = IconCompatParcelizer + 43;
                    write = i24 % Fields.SpotShadowColor;
                    if (i24 % 2 != 0) {
                        int i25 = 68 / 0;
                        if (objComponentActivity12 == androidContentCaptureManager) {
                            obj2 = objComponentActivity12;
                            obj2 = objComponentActivity12;
                            NestScreenKt$$ExternalSyntheticLambda0 nestScreenKt$$ExternalSyntheticLambda0 = new NestScreenKt$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (Object) getcontentviewgroupparentlayout, (Object) bringIntoViewRequesterImpl4, 9);
                            getpostalcode3.write(nestScreenKt$$ExternalSyntheticLambda0);
                            int i26 = write + 45;
                            IconCompatParcelizer = i26 % Fields.SpotShadowColor;
                            int i27 = i26 % 2;
                            obj2 = nestScreenKt$$ExternalSyntheticLambda0;
                        }
                    } else if (objComponentActivity12 == androidContentCaptureManager) {
                        obj2 = objComponentActivity12;
                        obj2 = objComponentActivity12;
                        NestScreenKt$$ExternalSyntheticLambda0 nestScreenKt$$ExternalSyntheticLambda1 = new NestScreenKt$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (Object) getcontentviewgroupparentlayout, (Object) bringIntoViewRequesterImpl4, 9);
                        getpostalcode3.write(nestScreenKt$$ExternalSyntheticLambda1);
                        int i28 = write + 45;
                        IconCompatParcelizer = i28 % Fields.SpotShadowColor;
                        int i29 = i28 % 2;
                        obj2 = nestScreenKt$$ExternalSyntheticLambda1;
                    }
                } else {
                    obj2 = objComponentActivity12;
                    obj2 = objComponentActivity12;
                    NestScreenKt$$ExternalSyntheticLambda0 nestScreenKt$$ExternalSyntheticLambda2 = new NestScreenKt$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (Object) getcontentviewgroupparentlayout, (Object) bringIntoViewRequesterImpl4, 9);
                    getpostalcode3.write(nestScreenKt$$ExternalSyntheticLambda2);
                    int i210 = write + 45;
                    IconCompatParcelizer = i210 % Fields.SpotShadowColor;
                    int i211 = i210 % 2;
                    obj2 = nestScreenKt$$ExternalSyntheticLambda2;
                }
                obj2 = objComponentActivity12;
                obj2 = objComponentActivity12;
                PasswordFieldKt.PasswordField(strWrite2, modifierWrite2, "input_password_input", false, strStringResource, z10, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm16, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, null, getpostalcode3, 384, 0, 2712);
                TertiaryKt.IconCompatParcelizer(StringResources_androidKt.stringResource(R.string.signin_button_forgot, getpostalcode3, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k1, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f2, 0.0f, 0.0f, 13), false, 0, null, null, null, getpostalcode3, (i3 >> 3) & 112, 248);
                getpostalcode3.IconCompatParcelizer(true);
                Modifier modifierWrite3 = SizeKt.write(companion3, 1.0f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode3, 0);
                int iHashCode3 = Long.hashCode(getpostalcode3.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode3.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierWrite3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor3);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer3, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode3), getpostalcode3));
                String strStringResource2 = StringResources_androidKt.stringResource(R.string.login_sign_in_button_text, getpostalcode3, 0);
                boolean zBooleanValue3 = ((Boolean) d4externalsyntheticlambda2.IconCompatParcelizer.getValue()).booleanValue();
                Modifier modifierWrite4 = SizeKt.write(PaddingKt.m73paddingVpY3zN4$default(companion3, f, 0.0f, 2), 1.0f);
                WeakHashMap weakHashMap = TooltipKt.serializer;
                Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(modifierWrite4, setRoundRectOutlineTNW_H78default.read(getpostalcode3).MediaBrowserCompatMediaItem);
                modifierWindowInsetsPadding.getClass();
                PrimaryKt.write(strStringResource2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, modifierWindowInsetsPadding, zBooleanValue3, false, null, null, null, null, null, getpostalcode3, (i3 >> 9) & 112, 0, 2032);
                getpostalcode3.IconCompatParcelizer(true);
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getinvalidationtracker, getDriver.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    int i30 = write + 101;
                    IconCompatParcelizer = i30 % Fields.SpotShadowColor;
                    if (i30 % 2 == 0) {
                        getpostalcode3.serializer(1567967216);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode3, PaddingKt.m74paddingqDBjuR0$default(companion3, 2.0f, 0.0f, 0.0f, f, 44)});
                        z2 = true;
                        getpostalcode3.IconCompatParcelizer(true);
                    } else {
                        getpostalcode3.serializer(1567967216);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode3, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, f, 7)});
                        getpostalcode3.IconCompatParcelizer(false);
                        z2 = true;
                    }
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getinvalidationtracker, getdriver}, getCieXyz.write())).booleanValue()) {
                        getpostalcode3.serializer(1568097168);
                        Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, Dimensions.setVisibility, 0.0f, 0.0f, 13);
                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer4 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getCenterHorizontally(), getpostalcode3, 48);
                        int iHashCode4 = Long.hashCode(getpostalcode3.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode3.serializer();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierM74paddingqDBjuR0$default2);
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                        getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode3.ComponentActivity) {
                            getpostalcode3.serializer(constructor4);
                        } else {
                            getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer4, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode4), getpostalcode3));
                        d9.read(0, getpostalcode3, PaddingKt.m74paddingqDBjuR0$default(SizeKt.read(companion3), 0.0f, 0.0f, 0.0f, f, 7), d4externalsyntheticlambda2.ParcelableVolumeInfo);
                        z2 = true;
                        getpostalcode3.IconCompatParcelizer(true);
                        getpostalcode3.IconCompatParcelizer(false);
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode3, -1611989156, false);
                    }
                }
                getpostalcode3.IconCompatParcelizer(z2);
                getpostalcode = getpostalcode3;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getPostalCode getpostalcode4 = getpostalcode2;
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode = getpostalcode4;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(d4externalsyntheticlambda2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, modifier, getinvalidationtracker, i, 15);
        }
    }
}
