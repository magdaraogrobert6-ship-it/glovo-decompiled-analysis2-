package com.roadrunner.auth.domain.logout;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi;
import com.mapbox.navigation.voice.api.VoiceInstructionsTextPlayer;
import com.roadrunner.appreview.AppReviewLifecycleObserverImpl;
import com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.delivery.accept.acknowledgment.implementation.data.AckNewOrderSeenWorker;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.deliverydetails.presentation.DeliveryDetailsUiModelImpl;
import com.roadrunner.delivery.accept.earnings.presentation.EarningsUiModelImpl;
import com.roadrunner.delivery.accept.earningsMessage.presentation.EarningsMessageUiModelImpl;
import com.roadrunner.delivery.accept.individualEarnings.presentation.IndividualEarningsUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.delivery.accept.newordertitle.presentation.NewOrderTitleUiModelImpl;
import com.roadrunner.delivery.accept.tags.presentation.TagsUiModelImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.SemanticsSortKtsortByGeometryGroupings1;
import o.ShadowSpan;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactory28;
import o.TextLayout_androidKt;
import o.TextRangeKt;
import o.createFromParcel;
import o.debounceEntryb8qMvQI;
import o.getAnyOverlap;
import o.getCharacterRightBounds;
import o.getContentViewGroupParentLayout;
import o.getHasStaleResolvedFonts;
import o.getOffsetX;
import o.getTextSelectionRangedelegate;
import o.hasSameNonLayoutAttributesui_text;
import o.measurexDpz5zYdefault;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setMinDebounceDeadline;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearDataUseCaseImpl$invoke$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearDataUseCaseImpl$invoke$2(MapboxRouteLineApi mapboxRouteLineApi, int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 1;
        this.write = mapboxRouteLineApi;
        this.read = i;
    }

    /* JADX WARN: Code duplicated, block: B:417:0x0938  */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0974, code lost:
    
        if (r4.invoke(r20) == r3) goto L419;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClearDataUseCaseImpl$invoke$2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.write;
        switch (i3) {
            case 0:
                return new ClearDataUseCaseImpl$invoke$2((getTextSelectionRangedelegate) obj2, shortNewsContentCardView, 0);
            case 1:
                return new ClearDataUseCaseImpl$invoke$2((MapboxRouteLineApi) obj2, this.read, shortNewsContentCardView);
            case 2:
                return new ClearDataUseCaseImpl$invoke$2((VoiceInstructionsTextPlayer) obj2, shortNewsContentCardView, i);
            case 3:
                return new ClearDataUseCaseImpl$invoke$2((AppReviewLifecycleObserverImpl) obj2, shortNewsContentCardView, 3);
            case 4:
                return new ClearDataUseCaseImpl$invoke$2((RefreshAccessTokenUseCaseImpl) obj2, shortNewsContentCardView, 4);
            case 5:
                return new ClearDataUseCaseImpl$invoke$2((ClearServicesUseCase) obj2, shortNewsContentCardView, 5);
            case 6:
                ClearDataUseCaseImpl$invoke$2 clearDataUseCaseImpl$invoke$2 = new ClearDataUseCaseImpl$invoke$2((SemanticsSortKtsortByGeometryGroupings1) obj2, shortNewsContentCardView, 6);
                int i4 = IconCompatParcelizer + 111;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return clearDataUseCaseImpl$invoke$2;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            case 7:
                return new ClearDataUseCaseImpl$invoke$2((debounceEntryb8qMvQI) obj2, shortNewsContentCardView, 7);
            case 8:
                return new ClearDataUseCaseImpl$invoke$2((setMinDebounceDeadline) obj2, shortNewsContentCardView, 8);
            case 9:
                return new ClearDataUseCaseImpl$invoke$2((ChatAssetCacheManager) obj2, shortNewsContentCardView, 9);
            case 10:
                ClearDataUseCaseImpl$invoke$2 clearDataUseCaseImpl$invoke$3 = new ClearDataUseCaseImpl$invoke$2((getHasStaleResolvedFonts) obj2, shortNewsContentCardView, 10);
                int i5 = IconCompatParcelizer + 115;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return clearDataUseCaseImpl$invoke$3;
            case 11:
                return new ClearDataUseCaseImpl$invoke$2((AckNewOrderSeenWorker) obj2, shortNewsContentCardView, 11);
            case 12:
                return new ClearDataUseCaseImpl$invoke$2((hasSameNonLayoutAttributesui_text) obj2, shortNewsContentCardView, 12);
            case 13:
                return new ClearDataUseCaseImpl$invoke$2((DeliveryAutoAcceptMessageUiModelImpl) obj2, shortNewsContentCardView, 13);
            case 14:
                return new ClearDataUseCaseImpl$invoke$2((DeliveryAutoAcceptUiModelImpl) obj2, shortNewsContentCardView, 14);
            case 15:
                return new ClearDataUseCaseImpl$invoke$2((getAnyOverlap) obj2, shortNewsContentCardView, 15);
            case 16:
                return new ClearDataUseCaseImpl$invoke$2((measurexDpz5zYdefault) obj2, shortNewsContentCardView, 16);
            case 17:
                return new ClearDataUseCaseImpl$invoke$2((TextRangeKt) obj2, shortNewsContentCardView, 17);
            case 18:
                return new ClearDataUseCaseImpl$invoke$2((DeliveryDetailsUiModelImpl) obj2, shortNewsContentCardView, 18);
            case 19:
                return new ClearDataUseCaseImpl$invoke$2((EarningsUiModelImpl) obj2, shortNewsContentCardView, 19);
            case 20:
                return new ClearDataUseCaseImpl$invoke$2((EarningsMessageUiModelImpl) obj2, shortNewsContentCardView, 20);
            case 21:
                return new ClearDataUseCaseImpl$invoke$2((StaticLayoutFactory28) obj2, shortNewsContentCardView, 21);
            case 22:
                return new ClearDataUseCaseImpl$invoke$2((IndividualEarningsUiModelImpl) obj2, shortNewsContentCardView, 22);
            case 23:
                return new ClearDataUseCaseImpl$invoke$2((LastStopOptionUiModelImpl) obj2, shortNewsContentCardView, 23);
            case 24:
                return new ClearDataUseCaseImpl$invoke$2((getCharacterRightBounds) obj2, shortNewsContentCardView, 24);
            case 25:
                return new ClearDataUseCaseImpl$invoke$2((TextLayout_androidKt) obj2, shortNewsContentCardView, 25);
            case 26:
                return new ClearDataUseCaseImpl$invoke$2((NewOrderTitleUiModelImpl) obj2, shortNewsContentCardView, 26);
            case 27:
                return new ClearDataUseCaseImpl$invoke$2((getOffsetX) obj2, shortNewsContentCardView, 27);
            case 28:
                return new ClearDataUseCaseImpl$invoke$2((ShadowSpan) obj2, shortNewsContentCardView, 28);
            default:
                return new ClearDataUseCaseImpl$invoke$2((TagsUiModelImpl) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i2) {
            case 0:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 1:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 2:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 3:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 4:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 5:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 6:
                Object objInvokeSuspend = ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i3 = IconCompatParcelizer + 47;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            case 7:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 8:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 9:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 10:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 11:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 12:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 13:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 14:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 15:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 16:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 17:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 18:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 19:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 20:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 21:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 22:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 23:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 24:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 25:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 26:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 27:
                Object objInvokeSuspend2 = ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i5 = serializer + 41;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objInvokeSuspend2;
            case 28:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            default:
                return ((ClearDataUseCaseImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
    }
}
