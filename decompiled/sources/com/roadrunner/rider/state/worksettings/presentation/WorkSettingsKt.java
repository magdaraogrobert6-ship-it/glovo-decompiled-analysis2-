package com.roadrunner.rider.state.worksettings.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ImageHeaderParserImageType;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PlaceholderSpanCompanion;
import o.SystemLifecycle;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getOffsetX;
import o.getPostalCode;
import o.getStoreInfoFromClient;
import o.hasSameLayoutAffectingAttributesui_text;
import o.hasSameNonLayoutAttributesui_text;
import o.invokeMethod;
import o.invokeStaticMethod;
import o.isMainThread;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.saveControlParams;
import o.saveThirdPartySharingResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WorkSettingsKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void WorkSettingsColumn(getStoreInfoFromClient getstoreinfofromclient, ImageHeaderParserImageType imageHeaderParserImageType, zzz zzzVar, isMainThread ismainthread, hasSameLayoutAffectingAttributesui_text hassamelayoutaffectingattributesui_text, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, boolean z, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        Modifier modifier2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = IconCompatParcelizer + 19;
        read = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        getstoreinfofromclient.getClass();
        imageHeaderParserImageType.getClass();
        zzzVar.getClass();
        ismainthread.getClass();
        hassamelayoutaffectingattributesui_text.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-929661183);
        if ((i & 6) == 0) {
            int i10 = IconCompatParcelizer + 33;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(getstoreinfofromclient);
                throw null;
            }
            if (getpostalcode.IconCompatParcelizer(getstoreinfofromclient)) {
                int i11 = IconCompatParcelizer + 97;
                read = i11 % Fields.SpotShadowColor;
                i6 = i11 % 2 != 0 ? 3 : 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i12 = read + 5;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(imageHeaderParserImageType);
                throw null;
            }
            if (getpostalcode.IconCompatParcelizer(imageHeaderParserImageType)) {
                int i13 = read + 13;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                i5 = i13 % 2 == 0 ? 96 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(zzzVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (!getpostalcode.IconCompatParcelizer(ismainthread)) {
                i4 = 1024;
            } else {
                int i14 = IconCompatParcelizer + 101;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = Fields.CameraDistance;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(hassamelayoutaffectingattributesui_text)) {
                int i16 = read + 81;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = Fields.Clip;
            } else {
                int i18 = read + 93;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.write(z) ? 1048576 : Fields.BlendMode;
        }
        int i20 = i2 | 12582912;
        if ((i20 & 4793491) != 4793490) {
            int i21 = read + 21;
            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i20 & 1, z2)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = PlaceholderSpanCompanion.write;
                getpostalcode.write(objComponentActivity);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(3, zzzVar), true, 1870870044);
                getpostalcode.write(dragAndDropTargetModifierNode);
                objComponentActivity2 = dragAndDropTargetModifierNode;
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = invokeStaticMethod.serializer;
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(5, hassamelayoutaffectingattributesui_text), true, 1648259417);
                getpostalcode.write(objComponentActivity4);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity4;
            if (((saveThirdPartySharingResult) ExtrasKt.write(getstoreinfofromclient.MediaSessionCompatResultReceiverWrapper, getpostalcode, 0).getValue()) instanceof saveControlParams) {
                getpostalcode.serializer(-1586184934);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
                int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                if (getpostalcode.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                int i23 = read + 75;
                IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (z) {
                    getpostalcode.serializer(1075984705);
                    modifier2 = companion;
                    DividerKt.read(0.0f, 0, 6, 0L, getpostalcode, PaddingKt.m74paddingqDBjuR0$default(modifier2, 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13));
                    z3 = false;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    modifier2 = companion;
                    z3 = false;
                    getpostalcode.serializer(1076122128);
                    getpostalcode.IconCompatParcelizer(false);
                }
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke((invokeMethod) getstoreinfofromclient.ParcelableVolumeInfo.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((getOffsetX) getstoreinfofromclient.write.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4.invoke((hasSameNonLayoutAttributesui_text) getstoreinfofromclient.serializer.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke((LastStopOptionUiModelImpl) getstoreinfofromclient.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf(((i20 >> 12) & 112) | 384));
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(z3);
            } else {
                modifier2 = companion;
                getpostalcode.serializer(-1585655423);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SystemLifecycle(getstoreinfofromclient, imageHeaderParserImageType, zzzVar, ismainthread, hassamelayoutaffectingattributesui_text, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, z, modifier2, i);
        }
    }
}
