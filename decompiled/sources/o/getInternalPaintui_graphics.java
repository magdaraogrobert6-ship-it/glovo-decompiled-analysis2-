package o;

import com.roadrunner.bubble.presentation.BubbleContentKt;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl;
import com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorKt;
import com.roadrunner.helpcenter.floating.HelpCenterEntryPointKt;
import com.roadrunner.home.expandedbubblelayer.presentation.ExpandedBubbleUiModelImpl;
import com.roadrunner.home.expandedbubblelayer.presentation.compose.ExpandedBubbleLayerContentKt;
import com.roadrunner.instant.shifts.presentation.InstantShiftsKt;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkKt;
import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsNoZoneSelectedKt;
import com.roadrunner.rrds.compose.component.indicators.BadgeKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getInternalPaintui_graphics implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getInternalPaintui_graphics(DeliveryAutoAcceptMessageUiModelImpl deliveryAutoAcceptMessageUiModelImpl, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, int i) {
        this.serializer = 3;
        this.RemoteActionCompatParcelizer = deliveryAutoAcceptMessageUiModelImpl;
        this.IconCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.read = accessisrendernodecompatiblecp;
        this.write = i;
    }

    public /* synthetic */ getInternalPaintui_graphics(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.serializer = i2;
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.IconCompatParcelizer = obj3;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 125;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.write;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.RemoteActionCompatParcelizer;
        Object obj5 = this.read;
        switch (i4) {
            case 0:
                ((Integer) obj2).intValue();
                RangesKt.serializer((accessisRenderNodeCompatiblecp) obj5, (getStrokeWidth) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((DragAndDropTargetModifierNode) obj5).serializer(obj4, obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5) | 1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                BubbleContentKt.BubbleButtonWithIndicatorBox((allocateItemsIndex) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                int i6 = MediaSessionCompatQueueItem + 97;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                break;
            case 3:
                ((Integer) obj2).getClass();
                androidx.sqlite.SQLite.RemoteActionCompatParcelizer((DeliveryAutoAcceptMessageUiModelImpl) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3, (accessisRenderNodeCompatiblecp) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                WorkOpportunityTypeSelectorKt.SelectorSegment((createNotificationChannelGroupsCompat) obj5, (androidx.compose.ui.Modifier) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                WorkOpportunityTypeSelectorKt.WorkOpportunityTypeSelectorContent((createNotificationChannel) obj5, (androidx.compose.ui.Modifier) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                HelpCenterEntryPointKt.read((SingleProcessDataStorefile2) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ExpandedBubbleLayerContentKt.ExpandedBubbleLayerContent((ExpandedBubbleUiModelImpl) obj5, (setSharedElementEnterTransition) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                InstantShiftsKt.NoBookableShiftsColumn((NestRiderStateSummary) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                OfferToWorkKt.BecomeAvailableContent((AdjustPlayStoreSubscription) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                SearchShiftsNoZoneSelectedKt.SearchShiftsNoZoneSelected((getPayloadsFromContentProviderIntentAction) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                break;
            default:
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
                BadgeKt.BadgedBox(iRemoteActionCompatParcelizer, getbirthdatefull, (DragAndDropTargetModifierNode) obj5, (DragAndDropTargetModifierNode) obj3, (androidx.compose.ui.Modifier) obj4);
                break;
        }
        return createfromparcel;
    }
}
