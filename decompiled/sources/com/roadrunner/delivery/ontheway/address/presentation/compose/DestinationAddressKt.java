package com.roadrunner.delivery.ontheway.address.presentation.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.address.presentation.DestinationAddressUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.details.api.domain.TagColorTokenMapperKt;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.ontheway.address.DestinationAddressUiModel;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.Nonelambda0;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.getStore;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.s3;
import o.s4;
import o.s5;
import o.s8ExternalSyntheticLambda0;
import o.s9;
import o.setCurrentSemanticsNodesui;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DestinationAddressKt {
    private static int read = 0;
    private static int write = 1;

    public static final void RemoteActionCompatParcelizer(s5 s5Var, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(682903111);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(s5Var);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(s5Var);
                int i5 = read + 113;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            if (zIconCompatParcelizer) {
                int i7 = write + 23;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = read + 29;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
            int i10 = read + 99;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if (getpostalcode.write(i2 & 1, !((i2 & 147) == 146))) {
            SurfaceKt.m126SurfaceT9BRK9s(SizeKt.write(modifier, 1.0f), null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(662982156, new GapComposerKt$$ExternalSyntheticLambda0(s5Var, 19, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), getpostalcode, 12582912, 122);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 3, modifier, (Object) s5Var, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    public static final void RemoteActionCompatParcelizer(DestinationAddressUiModel destinationAddressUiModel, Nonelambda0 nonelambda0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3 = 2 % 2;
        destinationAddressUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1057015180);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(destinationAddressUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = read + 45;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(nonelambda0);
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(nonelambda0) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if ((i5 & 147) != 146) {
            int i6 = write + 113;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i5 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            modifier2 = Modifier.Companion;
            s3 s3Var = (s3) ExtrasKt.write(((DestinationAddressUiModelImpl) destinationAddressUiModel).RatingCompat, getpostalcode, 0).getValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{s3Var, s8ExternalSyntheticLambda0.serializer}, getCieXyz.write())).booleanValue()) {
                getpostalcode.serializer(1161275721);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!(true ^ (s3Var instanceof s5))) {
                    getpostalcode.serializer(1161376936);
                    s5 s5Var = (s5) s3Var;
                    boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(nonelambda0);
                    boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(s3Var);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if (!zIconCompatParcelizer2 && !zIconCompatParcelizer) {
                        int i8 = write + 85;
                        read = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                        if (objComponentActivity == androidContentCaptureManager) {
                            objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(nonelambda0, 17, s5Var);
                            getpostalcode.write(objComponentActivity);
                        }
                    } else {
                        objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(nonelambda0, 17, s5Var);
                        getpostalcode.write(objComponentActivity);
                    }
                    RemoteActionCompatParcelizer(s5Var, modifier2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, (i5 >> 3) & 112);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (!(s3Var instanceof s9)) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 2115667154, false);
                    }
                    int i9 = write + 65;
                    read = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    getpostalcode.serializer(1161614210);
                    s9 s9Var = (s9) s3Var;
                    boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(nonelambda0);
                    boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(s3Var);
                    Object objComponentActivity2 = getpostalcode.ComponentActivity();
                    if ((zIconCompatParcelizer4 | zIconCompatParcelizer3) || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new ViewUtils$$ExternalSyntheticLambda6(nonelambda0, 18, s9Var);
                        getpostalcode.write(objComponentActivity2);
                    }
                    DestinationSecondaryAddressKt.RemoteActionCompatParcelizer((i5 >> 3) & 112, getpostalcode, modifier2, s9Var, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
        }
        int i11 = read + 85;
        write = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 4, destinationAddressUiModel, nonelambda0, modifier2);
        }
    }

    public static final void Address(String str, s4 s4Var, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        boolean z2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(720285305);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i5 = write + 15;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                zIconCompatParcelizer = getpostalcode.read(s4Var);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(s4Var);
            }
            if (zIconCompatParcelizer) {
                int i7 = read + 105;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                int i9 = read + 11;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        int i11 = i2 | 384;
        if ((i & 3072) == 0) {
            i11 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i12 = i11;
        if ((i12 & 1171) != 1170) {
            int i13 = read + 107;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i12 & 1, z)) {
            int i15 = read + 67;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            Modifier.Companion companion = Modifier.Companion;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.setMenu);
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, companion2.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            Object obj = null;
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = read + 53;
            write = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z3 = getpostalcode.ComponentActivity;
                obj.hashCode();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_map_marker_outline, getpostalcode, 0);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            modifier2 = companion;
            IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode, Painter.$stable | 48, 4);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset), companion2.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                z2 = true;
                objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode.write(objComponentActivity);
            } else {
                z2 = true;
            }
            TextKt.m131TextNvy7gAk(str, ClickableKt.serializer(modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity), supportBackgroundTintMode, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode, i12 & 14, 0, 131064);
            if (s4Var == null) {
                getpostalcode.serializer(705735840);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(705735841);
                TagColorToken tagColorToken = s4Var.serializer;
                String str2 = s4Var.read;
                Integer num = s4Var.RemoteActionCompatParcelizer;
                TagColorTokenMapperKt.RemoteActionCompatParcelizer(tagColorToken, str2, null, num != null ? num.intValue() : 0, getpostalcode, 0, 20);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(str, s4Var, modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i);
        }
    }
}
