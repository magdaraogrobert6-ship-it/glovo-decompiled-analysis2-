package com.roadrunner.delivery.pickupdropoff.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.ConfirmButtonV1UiModel;
import com.roadrunner.delivery.pickupdropoff.details.api.PickUpDropOffDetailsUiModel;
import com.roadrunner.delivery.pickupdropoff.tasks.api.PickUpDropOffTasksUiModelV2;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextIndent;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.defaultParamCount;
import o.findComposableMethod;
import o.getActionViewIntentlambda0;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getPostalCode;
import o.i2;
import o.onDrawlambda0;
import o.onViewCreated;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SingleDeliveryPageKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:92:0x023c  */
    /* JADX WARN: Code duplicated, block: B:93:0x025c  */
    public static final void SingleDeliveryPage(TextIndent textIndent, getActionViewIntentlambda0 getactionviewintentlambda0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i2 i2Var, defaultParamCount defaultparamcount, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z2;
        getPostalCode getpostalcode2;
        int i3;
        int i4 = 2 % 2;
        textIndent.getClass();
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = textIndent.serializer;
        String str = textIndent.write;
        long j = textIndent.read;
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(-407507956);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode3.read(textIndent) : getpostalcode3.IconCompatParcelizer(textIndent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = IconCompatParcelizer + 61;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode3.IconCompatParcelizer(getactionviewintentlambda0);
                throw null;
            }
            i2 |= getpostalcode3.IconCompatParcelizer(getactionviewintentlambda0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode3.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i6 = RemoteActionCompatParcelizer + 57;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode3.IconCompatParcelizer(i2Var) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode3.IconCompatParcelizer(defaultparamcount) ? Fields.Clip : 8192;
        }
        int i8 = i2 | 196608;
        if ((i8 & 74899) != 74898) {
            int i9 = RemoteActionCompatParcelizer + 47;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode3.write(i8 & 1, z)) {
            int i10 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierThen = companion.then(SizeKt.read);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode3, 0);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode3.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                getpostalcode3.serializer(constructor);
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            boolean z3 = true;
            DividerKt.read(0.0f, 0, 7, 0L, getpostalcode3, null);
            int iWrite = SQLite.write((List) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            getPostalCode getpostalcode4 = getpostalcode3;
            getpostalcode4.serializer(-1414112204);
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 10));
            Iterator it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
            int i12 = 0;
            while (it.hasNext() == z3) {
                Object next = it.next();
                if (i12 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                onViewCreated onviewcreated = (onViewCreated) next;
                boolean z4 = onviewcreated instanceof PickUpDropOffDetailsUiModel;
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z4) {
                    getpostalcode4.serializer(-1600418258);
                    boolean zSerializer = getpostalcode4.serializer(j);
                    boolean z5 = getpostalcode4.read(str);
                    Object objComponentActivity = getpostalcode4.ComponentActivity();
                    if ((zSerializer | z5) || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = onDrawlambda0.write;
                        getpostalcode4.write(objComponentActivity);
                    }
                    ((r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity).invoke(onviewcreated, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode4, Integer.valueOf((i8 >> 3) & 112));
                    getpostalcode4.IconCompatParcelizer(false);
                } else {
                    if (onviewcreated instanceof PickUpDropOffTasksUiModelV2) {
                        int i13 = IconCompatParcelizer + 13;
                        RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        getpostalcode4.serializer(-1600153828);
                        boolean zSerializer2 = getpostalcode4.serializer(j);
                        boolean z6 = getpostalcode4.read(str);
                        Object objComponentActivity2 = getpostalcode4.ComponentActivity();
                        if ((zSerializer2 | z6) || objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(11, i2Var), true, -1884542345);
                            getpostalcode4.write(objComponentActivity2);
                        }
                        ((r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity2).invoke(onviewcreated, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode4, Integer.valueOf((i8 >> 3) & 112));
                        getpostalcode4.IconCompatParcelizer(false);
                    } else {
                        it = it;
                        if (onviewcreated instanceof ConfirmButtonV1UiModel) {
                            int i15 = IconCompatParcelizer + 63;
                            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            getpostalcode4.serializer(-1599876440);
                            boolean zSerializer3 = getpostalcode4.serializer(j);
                            boolean z7 = getpostalcode4.read(str);
                            Object objComponentActivity3 = getpostalcode4.ComponentActivity();
                            if ((zSerializer3 || z7) || objComponentActivity3 == androidContentCaptureManager) {
                                z2 = true;
                                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(7, (findComposableMethod) defaultparamcount), true, 1280458994);
                                getpostalcode4.write(dragAndDropTargetModifierNode);
                                objComponentActivity3 = dragAndDropTargetModifierNode;
                            } else {
                                z2 = true;
                            }
                            ((r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity3).invoke(onviewcreated, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode4, Integer.valueOf((i8 >> 3) & 112));
                            getpostalcode4.IconCompatParcelizer(false);
                        } else {
                            z2 = true;
                            getpostalcode4.serializer(-1599620380);
                            getpostalcode4.IconCompatParcelizer(false);
                        }
                    }
                    if (i12 < iWrite) {
                        getpostalcode4.serializer(-1599582963);
                        getpostalcode2 = getpostalcode4;
                        DividerKt.read(0.0f, 0, 7, 0L, getpostalcode2, null);
                        getpostalcode2.IconCompatParcelizer(false);
                    } else {
                        getpostalcode2 = getpostalcode4;
                        getpostalcode2.serializer(-1599530108);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(createFromParcel.INSTANCE);
                    i12++;
                    getpostalcode4 = getpostalcode2;
                    arrayList = arrayList2;
                    it = it;
                    z3 = z2;
                }
                z2 = true;
                if (i12 < iWrite) {
                    getpostalcode4.serializer(-1599582963);
                    getpostalcode2 = getpostalcode4;
                    DividerKt.read(0.0f, 0, 7, 0L, getpostalcode2, null);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2 = getpostalcode4;
                    getpostalcode2.serializer(-1599530108);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                ArrayList arrayList3 = arrayList;
                arrayList3.add(createFromParcel.INSTANCE);
                i12++;
                getpostalcode4 = getpostalcode2;
                arrayList = arrayList3;
                it = it;
                z3 = z2;
            }
            getpostalcode4.IconCompatParcelizer(false);
            getpostalcode4.IconCompatParcelizer(z3);
            modifier2 = companion;
            getpostalcode = getpostalcode4;
        } else {
            getpostalcode = getpostalcode3;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) textIndent, (Object) getactionviewintentlambda0, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, (Object) i2Var, (Object) defaultparamcount, modifier2, i, 7);
        }
    }
}
