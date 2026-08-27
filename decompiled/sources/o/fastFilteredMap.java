package o;

import com.roadrunner.delivery.state.TrackingEvent$$serializer;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fastFilteredMap implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ fastFilteredMap(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                return new getFocusable(fastFilter.IconCompatParcelizer);
            case 1:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 2:
                bitsNeedForSizeUnchecked[] bitsneedforsizeuncheckedArrValues = bitsNeedForSizeUnchecked.values();
                bitsneedforsizeuncheckedArrValues.getClass();
                return new beforeOpened(new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem.TimerCardUiItem.TimerStateType", (Enum[]) bitsneedforsizeuncheckedArrValues), constrain4WqzIAM.IconCompatParcelizer);
            case 3:
                return getNoopState.Companion.serializer();
            case 4:
                return new getCameraProvider(2).write();
            case 5:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 6:
                return new PopupLayoutHelperImpl29(fastRoundToInt.Companion.serializer());
            case 7:
                return new PopupLayoutHelperImpl29(obtainAndroidOutline.Companion.serializer());
            case 8:
                return new PopupLayoutHelperImpl29(TrackingEvent$$serializer.write);
            case 9:
                setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(onDismissed.write, 0);
                int i4 = IconCompatParcelizer + 95;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return setwasclosemessagecalled;
            case 10:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.AutoAcceptV2Data.Component", displayInAppMessagelambda1.serializer(fastRoundToInt.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(unpackAbsFloat1.class), displayInAppMessagelambda1.serializer(unpackAbsFloat2.class), displayInAppMessagelambda1.serializer(InlineClassHelper_jvmKt.class), displayInAppMessagelambda1.serializer(unpackFloat1.class), displayInAppMessagelambda1.serializer(appendElement.class)}, new setGraphicModalMaxWidthDp[]{AndroidTrace_androidKt.serializer, doubleFromBits.read, unpackFloat2.IconCompatParcelizer, floatFromBits.write, ListUtilsKt.read}, new Annotation[0]);
            case 11:
                return new getFocusable(fastAny.Companion.serializer());
            case 12:
                return new getFocusable(updateParentLayoutCoordinates.Companion.serializer());
            case 13:
                return new getFocusable(fastLastOrNull.RemoteActionCompatParcelizer);
            case 14:
                return new getFocusable(TrackingEvent$$serializer.write);
            case 15:
                return new getFocusable(accessgetPropertiesp.Companion.serializer());
            case 16:
                return new getFocusable(PopupLayoutcanCalculatePosition2.write);
            case 17:
                return new EnumSerializer("vendor_review", fastCoerceAtLeast.INSTANCE, new Annotation[0]);
            case 18:
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = fastCoerceIn.Companion.serializer();
                setgraphicmodalmaxwidthdpSerializer.getClass();
                executeAsList executeaslist = executeAsList.DF;
                ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
                return new PopupProperties(setgraphicmodalmaxwidthdpSerializer, executeaslist, itemTouchHelperAdapter, itemTouchHelperAdapter);
            case 19:
                return new setWasCloseMessageCalled(fastFilter.IconCompatParcelizer, 0);
            case 20:
                return new setWasCloseMessageCalled(r8lambda60ReDuah29FRmTb04OdFlVn5oXo.RemoteActionCompatParcelizer, 0);
            case 21:
                return new getFocusable(r8lambda60ReDuah29FRmTb04OdFlVn5oXo.RemoteActionCompatParcelizer);
            case 22:
                return new getFocusable(fastMinOf.Companion.serializer());
            case 23:
                return new getFocusable(r8lambdabRGQK48UTPqS0xHr9mjHNZpmho.serializer);
            case 24:
                return new getFocusable(TrackingEvent$$serializer.write);
            case 25:
                return new getFocusable(PopupLayoutcanCalculatePosition2.write);
            case 26:
                getInheritSecurePolicyui getinheritsecurepolicyui = new getInheritSecurePolicyui(AndroidViewBindinglambda80.Companion.serializer());
                int i6 = read + 11;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 76 / 0;
                }
                return getinheritsecurepolicyui;
            case 27:
                return new getInheritSecurePolicyui(AndroidViewBindingKtExternalSyntheticLambda4.Companion.serializer());
            case 28:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.DestinationInfo.ScrollableComponent.Instructions.Item", displayInAppMessagelambda1.serializer(AndroidViewBindingKtExternalSyntheticLambda4.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(getBinding.class)}, new setGraphicModalMaxWidthDp[]{accessgetInsetsp.RemoteActionCompatParcelizer}, new Annotation[0]);
            default:
                return new getInheritSecurePolicyui(AndroidViewHolder.Companion.serializer());
        }
    }
}
