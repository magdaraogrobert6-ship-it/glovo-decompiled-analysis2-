package com.roadrunner.delivery.pickupdropoff.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.pickupdropoff.presentation.compose.SingleDeliveryPageKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.liveness.recording.presentation.compose.RecordingRouteKt$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AdjustBridgeInstance5;
import o.AndroidContentCaptureManagerCompanion;
import o.ComposeViewAdapterprocessViewInfos2;
import o.CompositionDataRecord;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ForgottenCoroutineScopeException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextIndent;
import o.accessgetInstancedelegatecp;
import o.defaultParamCount;
import o.getActionViewIntentlambda0;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.i2;
import o.onContentCardDismissed;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PickUpDropOffComposableFactoryImplKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final /* synthetic */ void read(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getActionViewIntentlambda0 getactionviewintentlambda0, i2 i2Var, defaultParamCount defaultparamcount, getPostalCode getpostalcode, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        DeliveryPages(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getactionviewintentlambda0, i2Var, defaultparamcount, getpostalcode, i);
        int i5 = RemoteActionCompatParcelizer + 49;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public static final void RemoteActionCompatParcelizer(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, getActionViewIntentlambda0 getactionviewintentlambda0, i2 i2Var, defaultParamCount defaultparamcount, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        boolean zIconCompatParcelizer2;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 49;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1063073479);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer2 = getpostalcode2.read(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
            } else {
                zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
                int i8 = RemoteActionCompatParcelizer + 45;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
            i2 = (zIconCompatParcelizer2 ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            }
            if (zIconCompatParcelizer) {
                int i10 = RemoteActionCompatParcelizer + 79;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 == 0 ? 7 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(getactionviewintentlambda0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i11 = RemoteActionCompatParcelizer + 27;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode2.IconCompatParcelizer(i2Var)) {
                int i13 = IconCompatParcelizer + 75;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                i3 = i13 % 2 != 0 ? 10017 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(defaultparamcount) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.RenderEffect : 65536;
        }
        boolean z = true;
        if (getpostalcode2.write(i2 & 1, (74899 & i2) != 74898)) {
            int i14 = RemoteActionCompatParcelizer + 19;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0 ? (i2 & 14) != 4 : (i2 & 23) != 4) {
                if ((i2 & 8) == 0 || !getpostalcode2.IconCompatParcelizer(r8lambdaiidsddyirtymdul5lt6pmt2zysq)) {
                    z = false;
                }
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(9, r8lambdaiidsddyirtymdul5lt6pmt2zysq);
                getpostalcode2.write(objComponentActivity);
                int i15 = IconCompatParcelizer + 37;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    int i16 = 5 / 2;
                }
            }
            ForgottenCoroutineScopeException forgottenCoroutineScopeException = PagerStateKt.read(0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode2, 6);
            CompositionDataRecord.write(new ComposeViewAdapterprocessViewInfos2(r8lambdaiidsddyirtymdul5lt6pmt2zysq), forgottenCoroutineScopeException, null, getpostalcode2, 0);
            getpostalcode = getpostalcode2;
            PagerKt.m95HorizontalPager8jOkeI(forgottenCoroutineScopeException, null, null, null, 0.0f, null, null, false, null, null, null, null, ExtrasKt.write(175994534, new RecordingRouteKt$$ExternalSyntheticLambda0(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, getactionviewintentlambda0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i2Var, defaultparamcount), getpostalcode2), getpostalcode, 0, 24576, 16382);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY(r8lambdaiidsddyirtymdul5lt6pmt2zysq, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, getactionviewintentlambda0, i2Var, defaultparamcount, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0156 A[LOOP:0: B:67:0x0150->B:69:0x0156, LOOP_END] */
    public static final void DeliveryPages(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getActionViewIntentlambda0 getactionviewintentlambda0, i2 i2Var, defaultParamCount defaultparamcount, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        Iterator<E> it;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1247833137);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode2.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) : getpostalcode2.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                int i5 = IconCompatParcelizer + 113;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i7 = IconCompatParcelizer + 39;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = RemoteActionCompatParcelizer + 49;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= !getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i11 = IconCompatParcelizer + 3;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(getactionviewintentlambda0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i13 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(i2Var) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(defaultparamcount) ? Fields.Clip : 8192;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 9363) != 9362)) {
            int i15 = RemoteActionCompatParcelizer + 81;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion.then(SizeKt.read), 0.0f, Dimensions.getNestedScrollAxes, 0.0f, Dimensions.getActionBarHideOffset, 5);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            int size = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size();
            if (size != 0) {
                int i17 = IconCompatParcelizer + 51;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    z2 = true;
                    if (size != 1) {
                        getpostalcode2.serializer(-1317704575);
                        arrayList = new ArrayList(accessgetInstancedelegatecp.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 10));
                        it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new AdjustBridgeInstance5(((TextIndent) it.next()).RemoteActionCompatParcelizer));
                        }
                        RemoteActionCompatParcelizer(removeNodeAtDepth.read(arrayList), r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, getactionviewintentlambda0, i2Var, defaultparamcount, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode2, ((i2 << 12) & 458752) | (57344 & i2) | (i2 & 7168) | ((i2 << 3) & 112) | (i2 & 896));
                        getpostalcode2.IconCompatParcelizer(false);
                        z = z2;
                        getpostalcode = getpostalcode2;
                    } else {
                        z3 = false;
                        getpostalcode2.serializer(2100534250);
                        int i18 = ((i2 >> 3) & 112) | ((i2 << 3) & 896) | (i2 & 7168) | (57344 & i2);
                        z = z2;
                        getpostalcode = getpostalcode2;
                        SingleDeliveryPageKt.SingleDeliveryPage((TextIndent) onContentCardDismissed.read((List) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk), getactionviewintentlambda0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i2Var, defaultparamcount, null, getpostalcode, i18);
                        getpostalcode.IconCompatParcelizer(z3);
                    }
                } else if (size != 0) {
                    z2 = true;
                    getpostalcode2.serializer(-1317704575);
                    arrayList = new ArrayList(accessgetInstancedelegatecp.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 10));
                    it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new AdjustBridgeInstance5(((TextIndent) it.next()).RemoteActionCompatParcelizer));
                    }
                    RemoteActionCompatParcelizer(removeNodeAtDepth.read(arrayList), r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, getactionviewintentlambda0, i2Var, defaultparamcount, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode2, ((i2 << 12) & 458752) | (57344 & i2) | (i2 & 7168) | ((i2 << 3) & 112) | (i2 & 896));
                    getpostalcode2.IconCompatParcelizer(false);
                    z = z2;
                    getpostalcode = getpostalcode2;
                } else {
                    z3 = false;
                    z2 = true;
                    getpostalcode2.serializer(2100534250);
                    int i19 = ((i2 >> 3) & 112) | ((i2 << 3) & 896) | (i2 & 7168) | (57344 & i2);
                    z = z2;
                    getpostalcode = getpostalcode2;
                    SingleDeliveryPageKt.SingleDeliveryPage((TextIndent) onContentCardDismissed.read((List) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk), getactionviewintentlambda0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i2Var, defaultparamcount, null, getpostalcode, i19);
                    getpostalcode.IconCompatParcelizer(z3);
                }
            } else {
                getpostalcode = getpostalcode2;
                z = true;
                getpostalcode.serializer(-1317715127);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(z);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getactionviewintentlambda0, i2Var, defaultparamcount, i, 19);
        }
    }
}
