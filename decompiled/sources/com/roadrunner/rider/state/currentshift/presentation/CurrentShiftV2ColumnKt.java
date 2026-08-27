package com.roadrunner.rider.state.currentshift.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import kotlinx.coroutines.BuildersKt;
import o.AdjustBridgeUtil;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.setConnectionOptions;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;
import o.t3;
import o.u6;
import o.u9;
import o.xb;
import o.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CurrentShiftV2ColumnKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:114:0x042b  */
    public static final void CurrentShiftV2Column(setConnectionOptions setconnectionoptions, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, xb xbVar, u6 u6Var, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier.Companion companion;
        getPostalCode getpostalcode2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4 = 2 % 2;
        String str = setconnectionoptions.serializer;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(701449312);
        getAddressCountry getaddresscountry = getpostalcode3.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode3.read(setconnectionoptions) : getpostalcode3.IconCompatParcelizer(setconnectionoptions) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode3.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode3.IconCompatParcelizer(xbVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode3.IconCompatParcelizer(u6Var) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode3.read(modifier)) {
                int i5 = read + 15;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if (getpostalcode3.write(i7 & 1, (i7 & 9363) != 9362)) {
            Object objComponentActivity = getpostalcode3.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            Object obj = null;
            if (objComponentActivity == androidContentCaptureManager) {
                int i8 = read + 49;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    getpostalcode3.write(y0.read);
                    obj.hashCode();
                    throw null;
                }
                objComponentActivity = y0.read;
                getpostalcode3.write(objComponentActivity);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            Object objComponentActivity2 = getpostalcode3.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = u9.RemoteActionCompatParcelizer;
                getpostalcode3.write(objComponentActivity2);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity2;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(SizeKt.write(modifier, 1.0f), BuildersKt.write(getpostalcode3), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.setTabContainer;
            float f2 = Dimensions.getAnimatedVisibility;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierM20backgroundbw27NRU, f2, f, f2, 0.0f, 8);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode3, 0);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i9 = RemoteActionCompatParcelizer + 29;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                getpostalcode3.serializer(constructor);
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            String str2 = setconnectionoptions.MediaBrowserCompatMediaItem;
            TextStyle textStyleMediaDescriptionCompat = performLayout.MediaDescriptionCompat();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setHideOnContentScrollEnabled(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaDescriptionCompat, getpostalcode3, 0, 0, 131066);
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier modifier2 = PaddingKt.read(BackgroundKt.m20backgroundbw27NRU(af$$ExternalSyntheticOutline1.m(companion4, f, getpostalcode3, companion4, 1.0f), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).addOnPictureInPictureUiStateChangedListener(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.getSavedStateRegistryControllerannotations)), Dimensions.onLocalesChanged, Dimensions.onPostCreate, Dimensions.onNightModeChanged, Dimensions.onKeyDown);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode3, 0);
            int iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode3, modifier2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                int i11 = RemoteActionCompatParcelizer + 105;
                read = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    getpostalcode3.serializer(constructor2);
                    int i12 = 39 / 0;
                } else {
                    getpostalcode3.serializer(constructor2);
                }
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, modalBottomSheetYbuCTN8Serializer2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
            if (str.length() > 0) {
                int i13 = RemoteActionCompatParcelizer + 91;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode3.serializer(1025676943);
                TextStyle textStyle = (TextStyle) performLayout._init_lambda2.MediaSessionCompatResultReceiverWrapper();
                long icon = ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setIcon();
                companion = companion4;
                TextKt.m131TextNvy7gAk(str, null, icon, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode3, 0, 0, 131066);
                getpostalcode2 = getpostalcode3;
                IconCompatParcelizer.IconCompatParcelizer(companion, Dimensions.setPrimaryBackground, getpostalcode2, false);
            } else {
                companion = companion4;
                getpostalcode2 = getpostalcode3;
                getpostalcode2.serializer(1025983502);
                getpostalcode2.IconCompatParcelizer(false);
            }
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getCenterVertically(), getpostalcode2, 48);
            int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = r11.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode2.ComponentActivity)) {
                int i15 = read + 7;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    getpostalcode2.serializer(constructor3);
                    obj.hashCode();
                    throw null;
                }
                getpostalcode2.serializer(constructor3);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(r11, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m((ComposeUiNode.Companion) r11, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
            getpostalcode = getpostalcode2;
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_map_location_on, getpostalcode2, 0), setconnectionoptions.RemoteActionCompatParcelizer, PaddingKt.m74paddingqDBjuR0$default(SizeKt.m83size3ABfNKs(companion, Dimensions.setMenu), 0.0f, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 11), BuildersKt.MediaMetadataCompat(getpostalcode2), getpostalcode2, Painter.$stable, 0);
            TextKt.m131TextNvy7gAk(setconnectionoptions.RemoteActionCompatParcelizer, null, BuildersKt.MediaMetadataCompat(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            t3 t3Var = setconnectionoptions.IconCompatParcelizer;
            if (t3Var == null) {
                getpostalcode.serializer(1026682892);
                getpostalcode.IconCompatParcelizer(false);
                z2 = true;
            } else {
                getpostalcode.serializer(1026682893);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion, Dimensions.setSplitBackground)});
                Modifier modifierWrite = SizeKt.write(companion, 1.0f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.read, companion2.getCenterVertically(), getpostalcode, 54);
                int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = r11.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    getpostalcode.serializer(constructor4);
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(r11, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(t3Var, getpostalcode, 48);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, companion});
                if (setconnectionoptions.write.equals(Boolean.TRUE)) {
                    getpostalcode.serializer(8184294);
                    Integer num = setconnectionoptions.MediaDescriptionCompat;
                    if (num == null) {
                        int i16 = RemoteActionCompatParcelizer + 11;
                        read = i16 % Fields.SpotShadowColor;
                        if (i16 % 2 != 0) {
                            getpostalcode.serializer(253713115);
                            getpostalcode.IconCompatParcelizer(true);
                            z = false;
                        } else {
                            getpostalcode.serializer(253713115);
                            z = false;
                            getpostalcode.IconCompatParcelizer(false);
                        }
                    } else {
                        getpostalcode.serializer(253713116);
                        int iIntValue = num.intValue();
                        boolean z4 = (i7 & 112) == 32;
                        boolean z5 = getpostalcode.read(iIntValue);
                        if ((i7 & 14) != 4) {
                            if ((i7 & 8) != 0) {
                                int i17 = RemoteActionCompatParcelizer + 91;
                                read = i17 % Fields.SpotShadowColor;
                                int i18 = i17 % 2;
                                z3 = getpostalcode.IconCompatParcelizer(setconnectionoptions);
                            }
                            int i19 = read + 23;
                            RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                            if (i19 % 2 == 0) {
                                int i20 = 4 / 4;
                            }
                        }
                        Object objComponentActivity3 = getpostalcode.ComponentActivity();
                        if ((z4 | z5 | z3) || objComponentActivity3 == androidContentCaptureManager) {
                            objComponentActivity3 = new AdjustBridgeUtil(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, iIntValue, setconnectionoptions);
                            getpostalcode.write(objComponentActivity3);
                        }
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, 48);
                        z = false;
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(z);
                } else {
                    z = false;
                    getpostalcode.serializer(253874285);
                    getpostalcode.IconCompatParcelizer(false);
                }
                z2 = true;
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(z);
            }
            getpostalcode.IconCompatParcelizer(z2);
            getpostalcode.IconCompatParcelizer(z2);
        } else {
            getpostalcode = getpostalcode3;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(setconnectionoptions, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, xbVar, u6Var, modifier, i, 13);
        }
    }
}
