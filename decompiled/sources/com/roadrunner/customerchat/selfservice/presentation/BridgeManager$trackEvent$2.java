package com.roadrunner.customerchat.selfservice.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl;
import com.roadrunner.delivery.accept.orderitems.presentation.OrderItemsNavigationUiModelImpl;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraArgs;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsViewModel;
import com.roadrunner.delivery.ontheway.address.presentation.DestinationAddressUiModelImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageButtonUiModelImpl;
import com.sentiance.core.model.events.N$b;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.BoringLayoutFactory33ExternalSyntheticApiModelOutline0;
import o.FontWeightSaverlambda0;
import o.LetterSpacingSpanEm;
import o.ParagraphStyleSaverlambda1;
import o.PlatformParagraphStyleSaverlambda0;
import o.ShadowSpan;
import o.ShortNewsContentCardView;
import o.TextLayout_androidKt;
import o.copyYTHSh70;
import o.createFromParcel;
import o.executeRequestimpl;
import o.f0;
import o.gapLength;
import o.getContentViewGroupParentLayout;
import o.getDrawFilter;
import o.getHasStaleResolvedFonts;
import o.getHeightPx;
import o.getLayoutannotations;
import o.getLengthimpl;
import o.getPlaceholderRects;
import o.getPlatformAndroidManager;
import o.hasSameLayoutAffectingAttributes;
import o.isHiraganaKatakanaBoundary;
import o.isOpaque;
import o.measurewNUYSr0;
import o.onViewCreated;
import o.packWithCheck;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.sensitiveContentdefault;

/* JADX INFO: loaded from: classes3.dex */
public final class BridgeManager$trackEvent$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public int IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BridgeManager$trackEvent$2(int i, isOpaque isopaque, LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = 20;
        this.RemoteActionCompatParcelizer = isopaque;
        this.IconCompatParcelizer = i;
        this.serializer = lastStopSelectionBottomSheetUiModelImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BridgeManager$trackEvent$2(getHasStaleResolvedFonts gethasstaleresolvedfonts, getPlaceholderRects getplaceholderrects, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = 1;
        this.serializer = gethasstaleresolvedfonts;
        this.RemoteActionCompatParcelizer = getplaceholderrects;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BridgeManager$trackEvent$2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BridgeManager$trackEvent$2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.serializer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 79;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        Object obj2 = this.serializer;
        switch (i5) {
            case 0:
                return new BridgeManager$trackEvent$2((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.RemoteActionCompatParcelizer, (getHasStaleResolvedFonts) obj2, shortNewsContentCardView, 0);
            case 1:
                return new BridgeManager$trackEvent$2((getHasStaleResolvedFonts) obj2, (getPlaceholderRects) this.RemoteActionCompatParcelizer, shortNewsContentCardView);
            case 2:
                return new BridgeManager$trackEvent$2((WebChatViewModel) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, i);
            case 3:
                return new BridgeManager$trackEvent$2((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.RemoteActionCompatParcelizer, (WebChatViewModel) obj2, shortNewsContentCardView, 3);
            case 4:
                return new BridgeManager$trackEvent$2((WebChatViewModel$fetchChatUrl$1.AnonymousClass2) this.RemoteActionCompatParcelizer, (WebChatViewModel) obj2, shortNewsContentCardView, 4);
            case 5:
                return new BridgeManager$trackEvent$2((ComponentRegistry$Builder) obj2, shortNewsContentCardView, 5);
            case 6:
                return new BridgeManager$trackEvent$2((DeliveryAcceptButtonUiModelImpl) this.RemoteActionCompatParcelizer, (FontWeightSaverlambda0) obj2, shortNewsContentCardView, 6);
            case 7:
                return new BridgeManager$trackEvent$2((DeliveryAcceptButtonUiModelImpl) this.RemoteActionCompatParcelizer, (ParagraphStyleSaverlambda1) obj2, shortNewsContentCardView, 7);
            case 8:
                return new BridgeManager$trackEvent$2((PlatformParagraphStyleSaverlambda0) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 8);
            case 9:
                return new BridgeManager$trackEvent$2((Throwable) this.RemoteActionCompatParcelizer, (DeliveryAutoAcceptUiModelImpl) obj2, shortNewsContentCardView, 9);
            case 10:
                return new BridgeManager$trackEvent$2((String) this.RemoteActionCompatParcelizer, (DeliveryAutoAcceptUiModelImpl) obj2, shortNewsContentCardView, 10);
            case 11:
                return new BridgeManager$trackEvent$2((sensitiveContentdefault) this.RemoteActionCompatParcelizer, (getPlatformAndroidManager) obj2, shortNewsContentCardView, 11);
            case 12:
                return new BridgeManager$trackEvent$2((sensitiveContentdefault) this.RemoteActionCompatParcelizer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2, shortNewsContentCardView, 12);
            case 13:
                return new BridgeManager$trackEvent$2((SignInDataStore) this.RemoteActionCompatParcelizer, (getContentViewGroupParentLayout) obj2, shortNewsContentCardView, 13);
            case 14:
                return new BridgeManager$trackEvent$2((onViewCreated) this.RemoteActionCompatParcelizer, (N$b) obj2, shortNewsContentCardView, 14);
            case 15:
                return new BridgeManager$trackEvent$2((measurewNUYSr0) this.RemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 15);
            case 16:
                BridgeManager$trackEvent$2 bridgeManager$trackEvent$2 = new BridgeManager$trackEvent$2((packWithCheck) this.RemoteActionCompatParcelizer, (getLengthimpl) obj2, shortNewsContentCardView, 16);
                int i6 = read + 89;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return bridgeManager$trackEvent$2;
                }
                throw null;
            case 17:
                return new BridgeManager$trackEvent$2((hasSameLayoutAffectingAttributes) this.RemoteActionCompatParcelizer, (BoringLayoutFactory33ExternalSyntheticApiModelOutline0) obj2, shortNewsContentCardView, 17);
            case 18:
                return new BridgeManager$trackEvent$2((getLayoutannotations) this.RemoteActionCompatParcelizer, (getDrawFilter) obj2, shortNewsContentCardView, 18);
            case 19:
                return new BridgeManager$trackEvent$2((RecentLastStopsDatastoreImpl) this.RemoteActionCompatParcelizer, (List) obj2, shortNewsContentCardView, 19);
            case 20:
                return new BridgeManager$trackEvent$2(this.IconCompatParcelizer, (isOpaque) this.RemoteActionCompatParcelizer, (LastStopSelectionBottomSheetUiModelImpl) obj2, shortNewsContentCardView);
            case 21:
                BridgeManager$trackEvent$2 bridgeManager$trackEvent$3 = new BridgeManager$trackEvent$2((TextLayout_androidKt) obj2, shortNewsContentCardView, 21);
                bridgeManager$trackEvent$3.RemoteActionCompatParcelizer = obj;
                return bridgeManager$trackEvent$3;
            case 22:
                return new BridgeManager$trackEvent$2((isHiraganaKatakanaBoundary) this.RemoteActionCompatParcelizer, (OrderItemsNavigationUiModelImpl) obj2, shortNewsContentCardView, 22);
            case 23:
                return new BridgeManager$trackEvent$2((LetterSpacingSpanEm) this.RemoteActionCompatParcelizer, (executeRequestimpl) obj2, shortNewsContentCardView, 23);
            case 24:
                return new BridgeManager$trackEvent$2((getHeightPx) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 24);
            case 25:
                return new BridgeManager$trackEvent$2((ShadowSpan) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 25);
            case 26:
                return new BridgeManager$trackEvent$2((ShadowSpan) this.RemoteActionCompatParcelizer, (List) obj2, shortNewsContentCardView, 26);
            case 27:
                return new BridgeManager$trackEvent$2((InAppCameraWithTagsViewModel) this.RemoteActionCompatParcelizer, (InAppCameraArgs) obj2, shortNewsContentCardView, 27);
            case 28:
                return new BridgeManager$trackEvent$2((gapLength) this.RemoteActionCompatParcelizer, (DestinationAddressUiModelImpl) obj2, shortNewsContentCardView, 28);
            default:
                return new BridgeManager$trackEvent$2((CrowdSourcingFloatingImageButtonUiModelImpl) this.RemoteActionCompatParcelizer, (copyYTHSh70) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 25;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i4) {
            case 0:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                Object objInvokeSuspend = ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = MediaBrowserCompatMediaItem + 27;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            case 5:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                Object objInvokeSuspend2 = ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i6 = read + 85;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 40 / 0;
                }
                return objInvokeSuspend2;
            case 15:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 21:
                return ((BridgeManager$trackEvent$2) create((f0) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 26:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 27:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((BridgeManager$trackEvent$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:376:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:534:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0973, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(com.google.android.gms.location.DeviceOrientationRequest.OUTPUT_PERIOD_FAST, r38) == r1) goto L443;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
