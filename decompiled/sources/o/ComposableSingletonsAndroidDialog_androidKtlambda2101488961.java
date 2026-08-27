package o;

import com.roadrunner.delivery.state.TrackingEvent$$serializer;
import com.roadrunner.delivery.state.VehicleType;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;
import com.roadrunner.delivery.state.pudo.MessageBoxTypeToken;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import com.roadrunner.delivery.state.pudo.TagToken;
import com.roadrunner.delivery.state.pudo.TypographyToken;
import com.roadrunner.delivery.state.pudo.ValidationType;
import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ComposableSingletonsAndroidDialog_androidKtlambda2101488961 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ ComposableSingletonsAndroidDialog_androidKtlambda2101488961(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                return VehicleType.m4950$r8$lambda$Q3ahy9o9sl9bWmwiosmzDV3Rp4();
            case 1:
                return new EnumSerializer("com.roadrunner.delivery.state.UnknownComponent", Api33ImplExternalSyntheticLambda0.INSTANCE, new Annotation[0]);
            case 2:
                return new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, packFloats.read);
            case 3:
                return getWindowTitle.Companion.serializer();
            case 4:
                return new getFocusable(TrackingEvent$$serializer.write);
            case 5:
                return ButtonTypeToken.$r8$lambda$d4mLPL_hM31O8QEuJKl63xGutAI();
            case 6:
                return new EnumSerializer("chat", getWindowToken.INSTANCE, new Annotation[0]);
            case 7:
                return new EnumSerializer("chat_or_call", getWindowType.INSTANCE, new Annotation[0]);
            case 8:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.pudo.ComponentActionData", displayInAppMessagelambda1.serializer(getWindowTitle.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(getSecurePolicy.class), displayInAppMessagelambda1.serializer(getWindowToken.class), displayInAppMessagelambda1.serializer(getWindowType.class), displayInAppMessagelambda1.serializer(DialogWindowProvider.class), displayInAppMessagelambda1.serializer(r8lambdaDj_KSJwPa9A3r02U9qVyNCgJjqs.class), displayInAppMessagelambda1.serializer(getWindowBounds.class)}, new setGraphicModalMaxWidthDp[]{getDecorFitsSystemWindows.IconCompatParcelizer, new EnumSerializer("chat", getWindowToken.INSTANCE, new Annotation[0]), new EnumSerializer("chat_or_call", getWindowType.INSTANCE, new Annotation[0]), DialogWrapper.IconCompatParcelizer, setGestureExclusionRects.read, updateViewLayout.write}, new Annotation[0]);
            case 9:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.pudo.Instruction", displayInAppMessagelambda1.serializer(accessgetPropertiesp.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(accessgetOnDismissRequestp.class), displayInAppMessagelambda1.serializer(getDisplayBounds.class), displayInAppMessagelambda1.serializer(DialogWrapperWhenMappings.class), displayInAppMessagelambda1.serializer(getParamsui.class), displayInAppMessagelambda1.serializer(pollForLocationOnScreenChange.class)}, new setGraphicModalMaxWidthDp[]{applyWindowTypeAndToken.write, accessgetParentLayoutCoordinates.IconCompatParcelizer, getParamsuiannotations.RemoteActionCompatParcelizer, getPositionProvider.read, updatePosition.IconCompatParcelizer}, new Annotation[0]);
            case 10:
                return new setWasCloseMessageCalled(_init_disableClipping.Companion.serializer(), 0);
            case 11:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.pudo.Instruction.DeliveryNotes.DeliveryNotesComponent", displayInAppMessagelambda1.serializer(_init_disableClipping.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(setSecurePolicy.class), displayInAppMessagelambda1.serializer(DialogWrapper12.class), displayInAppMessagelambda1.serializer(DialogWrapper2.class)}, new setGraphicModalMaxWidthDp[]{onKeyUp.IconCompatParcelizer, onTouchEvent.RemoteActionCompatParcelizer, updateParameters.RemoteActionCompatParcelizer}, new Annotation[0]);
            case 12:
                return new setWasCloseMessageCalled(getPopupContentSizebOM6tXw.RemoteActionCompatParcelizer, 0);
            case 13:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 14:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 15:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 16:
                return TagToken.Companion.serializer();
            case 17:
                DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.pudo.ItemComponent", displayInAppMessagelambda1.serializer(updateParentLayoutCoordinates.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(setPositionProvider.class), displayInAppMessagelambda1.serializer(PopupLayout2.class)}, new setGraphicModalMaxWidthDp[]{updateParentBoundsui.write, PopupLayoutContent4.IconCompatParcelizer}, new Annotation[0]);
                int i4 = write + 23;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return defaultInAppMessageHtmlFullViewFactory;
                }
                throw null;
            case 18:
                return new setWasCloseMessageCalled(PopupLayoutCompanion.RemoteActionCompatParcelizer, 0);
            case 19:
                return MessageBoxTypeToken.$r8$lambda$wgQWawUTCI3OVapYWYbjsLPE5Dc();
            case 20:
                return TagColorToken.m4951$r8$lambda$t50hryx0z34JHelrsFZL1_Ahvk();
            case 21:
                return TagIconTokenV1.$r8$lambda$0JBRLIaHd_RHeK7avFrELzPriBw();
            case 22:
                return TagToken.m4952$r8$lambda$MvMg7oznS0YkH38CPyNk3zl2Go();
            case 23:
                return TypographyToken.$r8$lambda$Ve1VjMmbujOkBrihK5nMPJL8LsQ();
            case 24:
                return ValidationType.$r8$lambda$1ZRUXz2WQY_n0TEKhdsuIEEYqg0();
            case 25:
                getCameraProvider getcameraprovider = new getCameraProvider(2);
                getcameraprovider.serializer.IconCompatParcelizer(getImageFormatdefault.k_, applyToInternal.IconCompatParcelizer);
                return getcameraprovider.write();
            case 26:
                return new setWasCloseMessageCalled(PreferencesProtoPreferenceMap.serializer, 0);
            case 27:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.helpcenter.data.bridge.BridgeMessage", displayInAppMessagelambda1.serializer(getListParameter.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(forId.class), displayInAppMessagelambda1.serializer(getJavaType.class), displayInAppMessagelambda1.serializer(isMap.class), displayInAppMessagelambda1.serializer(isValidForField.class), displayInAppMessagelambda1.serializer(getDefaultDefault.class), displayInAppMessagelambda1.serializer(RxDataStore.class), displayInAppMessagelambda1.serializer(EmojiCompatInitializer.class), displayInAppMessagelambda1.serializer(reportImageLoadingTimeTrace.class)}, new setGraphicModalMaxWidthDp[]{CodedInputStreamReader.read, isValidForList.IconCompatParcelizer, InvalidProtocolBufferException.write, InvalidProtocolBufferExceptionInvalidWireTypeException.RemoteActionCompatParcelizer, isValidType.read, getWireType.RemoteActionCompatParcelizer, EmojiCompatInitializer1.read, EmojiInputFilterInitCallbackImpl.serializer}, new Annotation[0]);
            case 28:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            default:
                return HelpCenterActivity.serializer();
        }
    }
}
