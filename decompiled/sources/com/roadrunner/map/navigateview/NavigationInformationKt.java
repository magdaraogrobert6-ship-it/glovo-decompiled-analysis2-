package com.roadrunner.map.navigateview;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.map.navigateview.api.NavigateViewUiModel;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.startingarea.presentation.StartingAreaNavigateViewUiModelImpl;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.internalPathIteratorPeek;
import o.o8ExternalSyntheticLambda0;
import o.o8ExternalSyntheticLambda1;
import o.o8ExternalSyntheticLambda11;
import o.o8ExternalSyntheticLambda6;
import o.o9;
import o.od;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NavigationInformationKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static final void DestinationDetails(int i, int i2, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i3;
        getPostalCode getpostalcode;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-935716242);
        if ((i2 & 6) == 0) {
            if (getpostalcode2.read(str)) {
                int i8 = read + 103;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (getpostalcode2.read(i)) {
                int i10 = RemoteActionCompatParcelizer + 43;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        boolean z = true;
        if ((i2 & 384) == 0) {
            if (!(!getpostalcode2.read(modifier))) {
                int i12 = RemoteActionCompatParcelizer + 99;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        int i14 = i3;
        if ((i14 & 147) != 146) {
            int i15 = read + 91;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i14 & 1, z)) {
            int i17 = i14 >> 3;
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str, modifier, ColorResources_androidKt.colorResource(i, getpostalcode2, i17 & 14), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, (i14 & 14) | (i17 & 112), 0, 131064);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new o8ExternalSyntheticLambda6(str, i, modifier, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[PHI: r1
  0x0056: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0037, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0039 A[PHI: r1
  0x0039: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0037, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void NavigationInformation(NavigateViewUiModel navigateViewUiModel, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        Modifier modifier2;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 15;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            navigateViewUiModel.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1800425695);
            if ((i & 127) == 0) {
                i2 = read + 45;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    getpostalcode.read(navigateViewUiModel);
                    throw null;
                }
                if (!(!getpostalcode.read(navigateViewUiModel))) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            navigateViewUiModel.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1800425695);
            if ((i & 6) == 0) {
                i2 = read + 45;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    getpostalcode.read(navigateViewUiModel);
                    throw null;
                }
                if (!(!getpostalcode.read(navigateViewUiModel))) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i7 = i4 | 384;
        if (getpostalcode.write(i7 & 1, (i7 & 147) != 146)) {
            int i8 = RemoteActionCompatParcelizer + 93;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            Modifier.Companion companion = Modifier.Companion;
            o8ExternalSyntheticLambda0 o8externalsyntheticlambda0 = (o8ExternalSyntheticLambda0) ExtrasKt.write(((StartingAreaNavigateViewUiModelImpl) navigateViewUiModel).MediaSessionCompatToken, getpostalcode, 0).getValue();
            if (o8externalsyntheticlambda0 instanceof o9) {
                getpostalcode.serializer(-930045991);
                NavigationInformationContent((o9) o8externalsyntheticlambda0, SizeKt.write(companion, 1.0f), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, (i7 << 3) & 896);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{o8externalsyntheticlambda0, od.write}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 662732144, false);
                }
                int i10 = read + 113;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.serializer(662741221);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        int i12 = read + 67;
        RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 27, navigateViewUiModel, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2);
        }
    }

    public static final void NavigationDestination(o9 o9Var, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1982361237);
        Object obj = null;
        if ((i & 6) == 0) {
            int i5 = read + 49;
            int i6 = i5 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i6;
            int i7 = i5 % 2;
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(o9Var);
            } else {
                int i8 = i6 + 1;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    zIconCompatParcelizer = getpostalcode.read(o9Var);
                } else {
                    getpostalcode.read(o9Var);
                    obj.hashCode();
                    throw null;
                }
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = RemoteActionCompatParcelizer + 85;
                read = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 == 0 ? 15813 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i9 |= i3;
        }
        if ((i9 & 147) != 146) {
            int i11 = read + 91;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, Alignment.Companion.getCenterVertically(), getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i13 = RemoteActionCompatParcelizer + 103;
            read = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i14 = RemoteActionCompatParcelizer + 71;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                DestinationTitle(0, getpostalcode, companion.then(new show(1.0f, true)), Integer.valueOf(R.drawable.ic_bold_medium_essentials_flag), o9Var.write);
                modifier2 = companion;
                TertiaryKt.IconCompatParcelizer(o9Var.RemoteActionCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, 0, null, null, null, getpostalcode, (i9 >> 3) & 112, 252);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode.ComponentActivity;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new o8ExternalSyntheticLambda11(o9Var, modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    public static final void NavigationInformationContent(o9 o9Var, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(250875448);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i5 = read + 7;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                zIconCompatParcelizer = getpostalcode.read(o9Var);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(o9Var);
                int i7 = read + 61;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            if (!zIconCompatParcelizer) {
                i3 = 2;
            } else {
                int i9 = read + 69;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = read + 45;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
            int i12 = read + 119;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        if (!getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility, Dimensions.setTabContainer);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            NavigationDestination(o9Var, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, i2 & 910);
            DestinationDetails(o9Var.read, 0, getpostalcode, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13), o9Var.serializer);
            getpostalcode.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new o8ExternalSyntheticLambda11(o9Var, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b A[PHI: r5
  0x003b: PHI (r5v42 o.getPostalCode) = (r5v5 o.getPostalCode), (r5v44 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r5
  0x0030: PHI (r5v6 o.getPostalCode) = (r5v5 o.getPostalCode), (r5v44 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void DestinationTitle(int i, getBirthDateFull getbirthdatefull, Modifier modifier, Integer num, String str) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 125;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1101799026);
            if ((i & 21) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1101799026);
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        getPostalCode getpostalcode3 = getpostalcode;
        if ((i & 48) == 0) {
            i3 |= getpostalcode3.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode3.read(num)) {
                int i7 = RemoteActionCompatParcelizer + 31;
                read = i7 % Fields.SpotShadowColor;
                i4 = i7 % 2 == 0 ? 32232 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        int i8 = i3;
        if (!getpostalcode3.write(i8 & 1, (i8 & 147) != 146)) {
            getpostalcode2 = getpostalcode3;
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i9 = read + 7;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode3, 48);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode3.read != null) {
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                if (num != null) {
                    getpostalcode3.serializer(2047801167);
                    Modifier.Companion companion2 = Modifier.Companion;
                    IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(num.intValue(), getpostalcode3, (i8 >> 6) & 14), (String) null, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode3.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), getpostalcode3, Painter.$stable | 48, 0);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode3, SizeKt.m83size3ABfNKs(companion2, Dimensions.getNestedScrollAxes)});
                    getpostalcode3.IconCompatParcelizer(false);
                } else {
                    getpostalcode3.serializer(2048105804);
                    getpostalcode3.IconCompatParcelizer(false);
                }
                TextKt.m131TextNvy7gAk(str, null, 0L, 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode3, i8 & 14, 24960, 110590);
                getpostalcode2 = getpostalcode3;
                getpostalcode2.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new o8ExternalSyntheticLambda1(str, modifier, num, i);
        }
    }
}
