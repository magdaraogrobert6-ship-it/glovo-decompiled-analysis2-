package o;

import android.graphics.drawable.Drawable;
import com.roadrunner.appmigration.presentation.compose.AppMigrationBodyKt;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.compose.AutoAcceptPreferencesItemsContentKt;
import com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt;
import com.roadrunner.delivery.accept.declinebutton.presentation.DeclineButtonContentKt;
import com.roadrunner.delivery.accept.deliverydetails.api.DeliveryDetailsUiModel;
import com.roadrunner.delivery.accept.deliverydetails.presentation.compose.DeliveryDetailsContentKt;
import com.roadrunner.delivery.accept.earnings.api.EarningsUiModel;
import com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt;
import com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt;
import com.roadrunner.delivery.accept.laststop.api.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModel;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.compose.LastStopAddressManageBottomSheetKt;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose.LastStopSelectionBottomSheetContentKt;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.composable.LastStopMapPinKt;
import com.roadrunner.delivery.accept.newordertitle.api.NewOrderTitleUiModel;
import com.roadrunner.delivery.accept.newordertitle.presentation.compose.NewOrderTitleContentKt;
import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsBottomSheetKt;
import com.roadrunner.delivery.accept.payatpickup.implementation.presentation.compose.PayAtPickupContentKt;
import com.roadrunner.delivery.accept.payatpickup.implementation.presentation.compose.PayAtPickupKt;
import com.roadrunner.delivery.accept.tags.presentation.compose.TagsContentKt;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.ASN1Util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidPrefetchScheduler implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ AndroidPrefetchScheduler(int i, onRelease onrelease, Object obj) {
        this.RemoteActionCompatParcelizer = 2;
        this.IconCompatParcelizer = onrelease;
        this.serializer = i;
        this.write = obj;
    }

    public /* synthetic */ AndroidPrefetchScheduler(int i, int i2, Object obj, Object obj2) {
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = i;
    }

    public /* synthetic */ AndroidPrefetchScheduler(Object obj, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.write = obj;
        this.IconCompatParcelizer = modifier;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.serializer;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.write;
        switch (i2) {
            case 0:
                ((Integer) obj2).intValue();
                AwaitFirstLayoutModifier.serializer((androidx.compose.ui.Modifier) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 1:
                ((Integer) obj2).getClass();
                ((androidx.compose.foundation.contextmenu.ContextMenuScope) obj3).Content$foundation((BasicTextFieldKt) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 2:
                onRelease onrelease = (onRelease) obj3;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    onrelease.RemoteActionCompatParcelizer(i3, obj4, getpostalcode, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 3:
                ((Integer) obj2).intValue();
                materialize.serializer((ComposedModifierKt) obj3, (any) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 4:
                ((Integer) obj2).getClass();
                ((CompositionLocalMapInjectionElement) obj3).read((Drawable) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 5:
                return androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview$lambda$1((androidx.compose.ui.tooling.ComposeViewAdapter) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, i3, (getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 6:
                return androidx.compose.ui.tooling.InspectableKt.Inspectable$lambda$0((androidx.compose.ui.tooling.CompositionDataRecord) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, i3, (getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 7:
                ((Integer) obj2).intValue();
                ASN1Util.write((List) obj3, (Collection) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 8:
                ((Integer) obj2).getClass();
                getTangenttuRUvjQ.IconCompatParcelizer((AlphaKt) obj3, (DragAndDropTargetModifierNode) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 9:
                ((Integer) obj2).getClass();
                accessgetBookmarkcp.read((List) obj3, (AndroidColorSpace_androidKt) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 10:
                ((Integer) obj2).getClass();
                AppMigrationBodyKt.AppMigrationBody((clearAndSetSemantics) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 11:
                ((Integer) obj2).getClass();
                AutoAcceptPreferencesItemsContentKt.AutoAcceptPreferencesItemsContent((resolveSpanStyleDefaults) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i4 = MediaBrowserCompatMediaItem + 13;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return createfromparcel;
            case 12:
                ((Integer) obj2).getClass();
                EarningsComposableKt.read((LayoutCompatJustificationMode) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 13:
                ((Integer) obj2).intValue();
                containsimpl.IconCompatParcelizer((measurewNUYSr0) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i6 = MediaBrowserCompatMediaItem + 81;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createfromparcel;
            case 14:
                ((Integer) obj2).getClass();
                getZerod9O1mEE.serializer((packWithCheck) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 15:
                ((Integer) obj2).intValue();
                DeclineButtonContentKt.DeclineButtonContent((getVerbatim) obj3, (accesscreatePlatformTextStyleInternal) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 16:
                ((Integer) obj2).getClass();
                DeliveryDetailsContentKt.RemoteActionCompatParcelizer((DeliveryDetailsUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 17:
                ((Integer) obj2).getClass();
                DeliveryDetailsContentKt.DeliveryDetails((drawDoubleRoundRect) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 18:
                ((Integer) obj2).getClass();
                EarningsContentKt.EarningsContent((EarningsUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i8 = MediaBrowserCompatMediaItem + 35;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return createfromparcel;
                }
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            case 19:
                ((Integer) obj2).getClass();
                SingleEarningsContentKt.Multiplier((accessisInitializedcp) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 20:
                ((Integer) obj2).getClass();
                LastStopAddressManageBottomSheetKt.LastStopAddressManageBottomSheet((LastStopOptionUiModelImpl) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 21:
                ((Integer) obj2).getClass();
                LastStopSelectionBottomSheetContentKt.read((LastStopSelectionBottomSheetUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 22:
                ((Integer) obj2).getClass();
                LastStopMapPinKt.LastStopMapPin((getEndOffsetForRectWithinRun) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 23:
                ((Integer) obj2).getClass();
                NewOrderTitleContentKt.serializer((NewOrderTitleUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 24:
                ((Integer) obj2).getClass();
                OrderItemsBottomSheetKt.OrderItemContent((toAndroidSegmentFinderui_text) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 25:
                ((Integer) obj2).getClass();
                OrderItemsBottomSheetKt.OrderItemProductContent((nextEndBoundary) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 26:
                ((Integer) obj2).getClass();
                OrderItemsBottomSheetKt.OrderItemExtraProductContent((GraphemeClusterSegmentFinderUnderApi29) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 27:
                ((Integer) obj2).getClass();
                PayAtPickupContentKt.PayAtPickupContent((getHeightPx) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 28:
                ((Integer) obj2).getClass();
                PayAtPickupKt.PayAtPickup((LineHeightSpan) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            default:
                ((Integer) obj2).getClass();
                TagsContentKt.IconCompatParcelizer((StateFlow) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
        }
    }
}
