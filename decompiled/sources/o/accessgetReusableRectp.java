package o;

import com.roadrunner.appmigration.presentation.compose.AppMigrationBannerKt;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.legacy.chatlist.presentation.compose.CustomerChatItemKt;
import com.roadrunner.delivery.accept.acceptbutton.presentation.AcceptButtonComposableKt;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.compose.AutoAcceptPreferencesToggleSectionKt;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose.OverlayHeaderKt;
import com.roadrunner.delivery.accept.earningsMessage.presentation.compose.EarningsMessageContentKt;
import com.roadrunner.delivery.accept.individualEarnings.presentation.composable.EarningsComposableKt;
import com.roadrunner.delivery.accept.individualEarnings.presentation.composable.IndividualEarningsContentKt;
import com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt;
import com.roadrunner.delivery.accept.laststop.presentation.compose.LastStopOptionKt;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose.LastStopSelectionLocationContentKt;
import com.roadrunner.delivery.accept.orderitems.api.OrderItemsNavigationUiModel;
import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsNavigationKt;
import com.roadrunner.delivery.accept.payatpickup.implementation.presentation.compose.PayAtPickupWithPaymentOptionsKt;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.TagOverlayKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessgetReusableRectp implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ accessgetReusableRectp(int i, int i2, androidx.compose.ui.Modifier modifier, Object obj, Object obj2) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.write = modifier;
        this.serializer = i;
    }

    public /* synthetic */ accessgetReusableRectp(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
        this.read = obj3;
        this.serializer = i;
    }

    public /* synthetic */ accessgetReusableRectp(androidx.compose.ui.Modifier modifier, Object obj, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.write = modifier;
        this.RemoteActionCompatParcelizer = obj;
        this.read = dragAndDropTargetModifierNode;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.serializer;
        Object obj3 = this.read;
        Object obj4 = this.write;
        Object obj5 = this.RemoteActionCompatParcelizer;
        Object obj6 = null;
        switch (i4) {
            case 0:
                ((Integer) obj2).getClass();
                androidx.compose.material3.SnackbarHostKt.FadeInFadeOutWithScale((setRootAutofillId) obj5, (androidx.compose.ui.Modifier) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i6 = RatingCompat + 53;
                MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createfromparcel;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.contextmenu.ContextMenuUiKt.ContextMenuColumn((BasicTextFieldKt) obj5, (androidx.compose.ui.Modifier) obj4, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i8 = MediaBrowserCompatMediaItem + 25;
                RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return createfromparcel;
                }
                obj6.hashCode();
                throw null;
            case 2:
                ((Integer) obj2).getClass();
                ((getCurrent) obj5).read(obj4, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 3:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.text.CoreTextFieldKt.CoreTextFieldRootBox((androidx.compose.ui.Modifier) obj4, (androidx.compose.foundation.text.selection.TextFieldSelectionManager) obj5, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 4:
                ((Integer) obj2).getClass();
                ((androidx.compose.foundation.text.TextLinkScope) obj5).IconCompatParcelizer((Object[]) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 5:
                ((Integer) obj2).intValue();
                materialize.RemoteActionCompatParcelizer((ComposedModifierKt) obj5, (hashCodeimpl) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 6:
                ((Integer) obj2).getClass();
                getDefaultNSsRyOo.write((androidx.compose.ui.Modifier) obj4, (androidx.compose.runtime.ProvidableCompositionLocal) obj5, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 7:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.HandlePopup((accessthenjd) obj5, (androidx.compose.ui.Alignment) obj4, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 8:
                ((Integer) obj2).getClass();
                ((BlockDropShadowNode) obj5).read(obj4, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 9:
                ((Integer) obj2).getClass();
                Object[] objArr = {obj5, (accessisRenderNodeCompatiblecp) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, Integer.valueOf(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1))};
                int iWrite = BackspaceCommand.write();
                RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -980236935, iWrite);
                return createfromparcel;
            case 10:
                ((Integer) obj2).intValue();
                RangesKt.write((accessisRenderNodeCompatiblecp) obj5, (getStyleTiuSbCo) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 11:
                ((Integer) obj2).getClass();
                getTangenttuRUvjQ.serializer((cubicTo) obj5, (AlphaKt) obj4, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 12:
                ((Integer) obj2).getClass();
                AppMigrationBannerKt.read((accessgetIdjd) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 13:
                ((Integer) obj2).getClass();
                setContainer.IconCompatParcelizer((setContentType) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 14:
                ((Integer) obj2).getClass();
                setContainer.read((generatePOSTBodyString) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 15:
                ((Integer) obj2).getClass();
                CustomerChatItemKt.CustomerChatItem((fractionVisibleInRect) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 16:
                ((Integer) obj2).getClass();
                AcceptButtonComposableKt.AvailableAcceptButton((HyphensSaverlambda0) obj5, (DeliveryAcceptButtonUiModelImpl) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i9 = RatingCompat + 97;
                MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            case 17:
                ((Integer) obj2).getClass();
                AutoAcceptPreferencesToggleSectionKt.write((SpanStyle) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 18:
                ((Integer) obj2).getClass();
                StringKt.write((hasSameNonLayoutAttributesui_text) obj5, (ImageHeaderParserImageType) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 19:
                ((Integer) obj2).getClass();
                OverlayHeaderKt.OverlayHeader((SignInDataStore) obj5, (com.huawei.wisesecurity.ucs_credential.p0) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 20:
                ((Integer) obj2).getClass();
                EarningsMessageContentKt.EarningsMessageContent((StateFlow) obj5, (accessgetIntRangeComparatorp) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 21:
                ((Integer) obj2).getClass();
                EarningsComposableKt.serializer((StaticLayoutFactory33) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 22:
                ((Integer) obj2).getClass();
                IndividualEarningsContentKt.IndividualEarningsContent((accessgetStaticLayoutConstructorcp) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 23:
                ((Integer) obj2).getClass();
                SingleEarningsContentKt.serializer((lookupAndInterpolate) obj5, (accessisInitializedcp) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 24:
                ((Integer) obj2).getClass();
                LastStopOptionKt.LastStopOptionContent((getClipBounds) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 25:
                ((Integer) obj2).getClass();
                LastStopSelectionLocationContentKt.read((setMatrix) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 26:
                ((Integer) obj2).getClass();
                OrderItemsNavigationKt.RemoteActionCompatParcelizer((OrderItemsNavigationUiModel) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            case 27:
                ((Integer) obj2).getClass();
                PayAtPickupWithPaymentOptionsKt.PayAtPickupWithPaymentOptions((chooseHeight) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            default:
                ((Integer) obj2).getClass();
                TagOverlayKt.TagOverlay((InAppCameraOverlay.Tags) obj5, (androidx.compose.ui.Modifier) obj4, (androidx.compose.animation.core.Animatable) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
        }
    }
}
