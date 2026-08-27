package com.roadrunner.rider.state.offertowork.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockKt$CashBlock$1$1;
import com.roadrunner.rider.state.offertowork.api.presentation.OfferToWorkUiModel;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import io.sentry.SentryUUID;
import o.AdjustPlayStorePurchase;
import o.AdjustPlayStoreSubscription;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInternalPaintui_graphics;
import o.getNewPassword;
import o.getPostalCode;
import o.getPrice;
import o.getQueryContext;
import o.getSku;
import o.getStrokeJoinLxFBmk8;
import o.handleUrlOverridelambda1;
import o.isValidParameter;
import o.logPushStoryPageClickedlambda11;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OfferToWorkKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void BecomeUnavailableContent(getPrice getprice, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(766084632);
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getprice);
            } else {
                int i7 = RemoteActionCompatParcelizer + 121;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode.read(getprice);
                    int i8 = 3 / 0;
                } else {
                    zIconCompatParcelizer = getpostalcode.read(getprice);
                }
            }
            if (zIconCompatParcelizer) {
                int i9 = serializer + 33;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                i5 = i9 % 2 != 0 ? 5 : 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = RemoteActionCompatParcelizer + 23;
                serializer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 == 0 ? 64 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i11 = serializer + 39;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                if (getpostalcode.read(modifier)) {
                    int i12 = RemoteActionCompatParcelizer + 17;
                    serializer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
                i2 |= i3;
            } else {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
        }
        if (!(!getpostalcode.write(i2 & 1, (i2 & 147) != 146))) {
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierM20backgroundbw27NRU, f, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                TextKt.m131TextNvy7gAk(getprice.read(), null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setActionBarVisibilityCallback(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.getDefaultViewModelProviderFactory.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 0, 131066);
                Modifier.Companion companion2 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setPrimaryBackground)});
                TextKt.m131TextNvy7gAk(getprice.serializer(), null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setTabContainer)});
                isValidParameter.RemoteActionCompatParcelizer(getprice.write(), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion2, 1.0f), false, false, null, null, null, null, getpostalcode, (i2 & 112) | 384, 1016);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 10, getprice, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
            int i14 = serializer + 105;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
    }

    public static final void BecomeAvailableContent(AdjustPlayStoreSubscription adjustPlayStoreSubscription, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(600979192);
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(adjustPlayStoreSubscription);
            } else {
                int i4 = serializer + 51;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode.read(adjustPlayStoreSubscription);
                } else {
                    getpostalcode.read(adjustPlayStoreSubscription);
                    throw null;
                }
            }
            i2 = (!(zIconCompatParcelizer ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            int i5 = RemoteActionCompatParcelizer + 61;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierM20backgroundbw27NRU, f, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i7 = RemoteActionCompatParcelizer + 39;
                    serializer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        getpostalcode.serializer(constructor);
                        int i8 = 81 / 0;
                    } else {
                        getpostalcode.serializer(constructor);
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                TextKt.m131TextNvy7gAk(adjustPlayStoreSubscription.read, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setActionBarVisibilityCallback(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.getDefaultViewModelProviderFactory.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 0, 131066);
                Modifier.Companion companion2 = Modifier.Companion;
                Object[] objArr = {getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setPrimaryBackground)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                TextKt.m131TextNvy7gAk(adjustPlayStoreSubscription.serializer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
                Object[] objArr2 = {getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setTabContainer)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
                String str = adjustPlayStoreSubscription.IconCompatParcelizer;
                Modifier modifierWrite = SizeKt.write(companion2, 1.0f);
                modifierWrite.getClass();
                PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierWrite, false, false, null, null, null, null, null, getpostalcode, (i2 & 112) | 384, 0, 2040);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 9, adjustPlayStoreSubscription, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x018b  */
    public static final void OfferToWork(OfferToWorkUiModel offerToWorkUiModel, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, logPushStoryPageClickedlambda11 logpushstorypageclickedlambda11, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = 2 % 2;
        offerToWorkUiModel.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1203733531);
        if ((i & 6) == 0) {
            int i4 = serializer + 43;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = (getpostalcode.read(offerToWorkUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(logpushstorypageclickedlambda11) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i6 = i2 | 3072;
        if (getpostalcode.write(i6 & 1, (i6 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = logpushstorypageclickedlambda11.read();
                getpostalcode.write(objComponentActivity);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity;
            OfferToWorkUiModelImpl offerToWorkUiModelImpl = (OfferToWorkUiModelImpl) offerToWorkUiModel;
            AdjustPlayStorePurchase adjustPlayStorePurchase = (AdjustPlayStorePurchase) ExtrasKt.write(offerToWorkUiModelImpl.MediaBrowserCompatMediaItem, getpostalcode, 0).getValue();
            if (!(adjustPlayStorePurchase instanceof AdjustPlayStoreSubscription)) {
                offerToWorkUiModelImpl = offerToWorkUiModelImpl;
                androidContentCaptureManager = androidContentCaptureManager;
                companion = companion;
                i6 = i6;
                z = false;
                if (adjustPlayStorePurchase instanceof getPrice) {
                    getpostalcode.serializer(1441747639);
                    getPrice getprice = (getPrice) adjustPlayStorePurchase;
                    boolean z4 = (i6 & 14) == 4;
                    Object objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (z4 || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new CashBlockKt$CashBlock$1$1(offerToWorkUiModel);
                        getpostalcode.write(objComponentActivity2);
                    }
                    BecomeUnavailableContent(getprice, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), SizeKt.write(companion, 1.0f), getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (!(adjustPlayStorePurchase instanceof getSku)) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1441732354, false);
                    }
                    int i7 = serializer + 101;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        getpostalcode.serializer(1441755071);
                        getpostalcode.IconCompatParcelizer(false);
                        int i8 = 24 / 0;
                    } else {
                        getpostalcode.serializer(1441755071);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
            } else {
                int i9 = serializer + 63;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode.serializer(1744139849);
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke((StartWorkingNavigationUiModelImpl) offerToWorkUiModelImpl.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf((i6 & 112) | 384));
                AdjustPlayStoreSubscription adjustPlayStoreSubscription = (AdjustPlayStoreSubscription) adjustPlayStorePurchase;
                if ((i6 & 14) == 4) {
                    int i11 = RemoteActionCompatParcelizer + 79;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity3 == androidContentCaptureManager) {
                    RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, offerToWorkUiModel, OfferToWorkUiModel.class, "onBecomeAvailableClick", "onBecomeAvailableClick()V", 0, 16);
                    getpostalcode.write(roomDatabase$closeBarrier$1);
                    objComponentActivity3 = roomDatabase$closeBarrier$1;
                }
                z = false;
                BecomeAvailableContent(adjustPlayStoreSubscription, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), SizeKt.write(companion, 1.0f), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
            getQueryContext getquerycontext = offerToWorkUiModelImpl.serializer;
            if ((i6 & 14) == 4) {
                int i13 = RemoteActionCompatParcelizer + 93;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    z2 = z;
                } else {
                    z2 = true;
                }
            } else {
                z2 = z;
            }
            if ((i6 & 112) == 32) {
                int i14 = serializer + 29;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                z = true;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (!(!(z2 | z)) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new Recomposer$$ExternalSyntheticLambda4(offerToWorkUiModel, 27, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
                getpostalcode.write(objComponentActivity4);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode, 8);
            obj = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            obj = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStrokeJoinLxFBmk8(offerToWorkUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, logpushstorypageclickedlambda11, obj, i, 3);
        }
    }
}
