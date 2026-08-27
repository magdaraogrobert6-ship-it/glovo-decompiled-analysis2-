package androidx.lifecycle;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.logistics.rider.glovo.R;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appreview.AppReviewLifecycleObserverImpl;
import com.roadrunner.auth.logout.presentation.LogoutViewModel;
import com.roadrunner.bubble.presentation.BubbleFloatingItemUiModelImpl$1;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.deliverydetails.presentation.DeliveryDetailsUiModelImpl;
import com.roadrunner.delivery.accept.earnings.presentation.EarningsUiModelImpl;
import com.roadrunner.delivery.accept.earningsMessage.presentation.EarningsMessageUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl;
import com.roadrunner.delivery.accept.newordertitle.presentation.NewOrderTitleUiModelImpl;
import com.roadrunner.delivery.accept.orderitems.presentation.OrderItemsNavigationUiModelImpl;
import com.roadrunner.delivery.accept.tags.presentation.TagsUiModelImpl;
import com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator;
import com.roadrunner.delivery.ontheway.address.presentation.DestinationAddressUiModelImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore$setTooltipShown$2;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.AcknowledgementTaskUiModelImpl;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.N$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidFileDescriptorFont;
import o.AndroidGraphicsContext1;
import o.AndroidLayoutApi34ExternalSyntheticLambda0;
import o.BoringLayoutFactory;
import o.BrazeExternalSyntheticLambda28;
import o.CanvasCompatQ;
import o.CanvasCompatS;
import o.CharSequenceCharacterIterator;
import o.CompositionDataRecordCompanion;
import o.DeleteSurroundingTextInCodePointsCommand;
import o.FocusTargetPropertiesElement;
import o.InfiniteTransitionSearchInfo;
import o.KeyboardType;
import o.LayoutCompatHyphenationFrequency;
import o.LayoutCompatJustificationMode;
import o.LayoutIntrinsics;
import o.RelativeLayoutBounds;
import o.SaversKtColorSaver1;
import o.SaversKtExternalSyntheticLambda7;
import o.ShortNewsContentCardView;
import o.SimpleStack;
import o.TextInputServiceAndroidTextInputCommand;
import o.TextLayout_androidKt;
import o.ThrottledCallbacks;
import o.VerbatimTtsAnnotation;
import o.ViewFactoryHolderresetBlock1;
import o.accessgetAboveBaselinecp;
import o.accessgetGreencp;
import o.accessgetInstancedelegatecp;
import o.buildCompositionParentHierarchy;
import o.canTrackMeasurementConsentI;
import o.checkAdjustAdRevenue;
import o.computeMinIntrinsicWidth;
import o.copyGSF8kmgdefault;
import o.copyNcG25M8default;
import o.createDeeplinkIntentI;
import o.createFromParcel;
import o.ddefault;
import o.debounceEntryb8qMvQI;
import o.deleteEventMetadata;
import o.deleteGlobalCallbackParameters;
import o.deleteGlobalPartnerParameters;
import o.drawDoubleRoundRect;
import o.drawLine;
import o.drawRGB;
import o.drawTextOnPath;
import o.f0;
import o.f1;
import o.f2;
import o.findContainingItemView;
import o.fireWY9HvpM;
import o.forEachFocusableIntersection;
import o.fractionVisibleInRect;
import o.fractionVisibleInWindow;
import o.getAssetManager;
import o.getBottomPaddingui_textannotations;
import o.getCacheKey;
import o.getCharacterRightBounds;
import o.getCharactersIUNYP9k;
import o.getCieXyz;
import o.getClipBounds;
import o.getEndOffsetForRectWithinRun;
import o.getLineHeightPaddings;
import o.getLocalIsInPopupLayout;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getPlatformAndroidManager;
import o.getPositionInRootnOccac;
import o.getPositionInWindownOccac;
import o.getSceneString;
import o.getSharedTextAndroidCanvas;
import o.getStates;
import o.getTextLinkStylesSaver;
import o.getTypeface;
import o.getUnspecifiedIUNYP9k;
import o.hasSameNonLayoutAttributesui_text;
import o.instance_delegatelambda0;
import o.isOpaque;
import o.measurexDpz5zY;
import o.multiPut;
import o.notifyFocusedRect;
import o.onFocusStateChange;
import o.onHideTranslationui;
import o.onImeActionKlQnJC8;
import o.onPrimaryNavigationFragmentChanged;
import o.onRequestCursorAnchorInfo;
import o.onViewAdded;
import o.onViewCreated;
import o.packBytes;
import o.pauseWebviewIfNecessarylambda10;
import o.previousEndBoundary;
import o.previousStartBoundary;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.reenqueueInAppMessageandroid_sdk_base_release;
import o.removeNodeAtDepth;
import o.requestGeofences;
import o.requestImmediateDataFlush;
import o.restartInput;
import o.s0;
import o.s3;
import o.s8ExternalSyntheticLambda0;
import o.setContentDataType;
import o.setGravity;
import o.setInputTextSuggestionState;
import o.setProgressdefault;
import o.setRolekuIjeqM;
import o.setTransactionSuccessful;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class FlowLiveDataConversions$asLiveData$1$1 implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ FlowLiveDataConversions$asLiveData$1$1(int i, Object obj) {
        this.read = i;
        this.serializer = obj;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:156:0x0531  */
    /* JADX WARN: Code duplicated, block: B:158:0x055b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0560  */
    /* JADX WARN: Code duplicated, block: B:161:0x058a  */
    /* JADX WARN: Code duplicated, block: B:162:0x058e  */
    /* JADX WARN: Code duplicated, block: B:164:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:165:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:167:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:169:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:171:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:173:0x0628  */
    /* JADX WARN: Code duplicated, block: B:175:0x0654  */
    /* JADX WARN: Code duplicated, block: B:176:0x0656  */
    /* JADX WARN: Code duplicated, block: B:178:0x0659  */
    /* JADX WARN: Code duplicated, block: B:180:0x0683  */
    /* JADX WARN: Code duplicated, block: B:183:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:192:0x06ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        boolean z;
        boolean z2;
        CanvasCompatS canvasCompatS;
        CanvasCompatS canvasCompatS2;
        int i;
        int i2;
        int i3;
        int i4;
        ?? r32;
        getLocalIsInPopupLayout getlocalisinpopuplayout;
        ?? arrayList;
        List list;
        List list2;
        boolean z3;
        boolean z4;
        Object obj2;
        Object objRemoteActionCompatParcelizer;
        Object obj3;
        getBottomPaddingui_textannotations getbottompaddingui_textannotations;
        Object obj4;
        getBottomPaddingui_textannotations getbottompaddingui_textannotationsSerializer;
        int i5 = 2 % 2;
        int i6 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj5 = this.serializer;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        int i7 = 0;
        switch (i6) {
            case 0:
                AndroidGraphicsContext1 androidGraphicsContext1 = (AndroidGraphicsContext1) obj5;
                Object objWithContext = BuildersKt.withContext(androidGraphicsContext1.IconCompatParcelizer, new BlockRunner$maybeRun$1(androidGraphicsContext1, obj, (ShortNewsContentCardView) null), shortNewsContentCardView);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objWithContext != coroutineSingletons) {
                    objWithContext = createfromparcel;
                }
                return objWithContext == coroutineSingletons ? objWithContext : createfromparcel;
            case 1:
                accessgetGreencp accessgetgreencp = (accessgetGreencp) obj5;
                if (Build.VERSION.SDK_INT >= 34) {
                    setGravity.IconCompatParcelizer(accessgetgreencp.ParcelableVolumeInfo(), (View) accessgetgreencp.IconCompatParcelizer);
                }
                return createfromparcel;
            case 2:
                AppReviewLifecycleObserverImpl appReviewLifecycleObserverImpl = (AppReviewLifecycleObserverImpl) obj5;
                Object objLaunchAppReview = ((N$b) appReviewLifecycleObserverImpl.serializer).launchAppReview(appReviewLifecycleObserverImpl.IconCompatParcelizer, shortNewsContentCardView);
                return objLaunchAppReview == CoroutineSingletons.COROUTINE_SUSPENDED ? objLaunchAppReview : createfromparcel;
            case 3:
                return emit((setInputTextSuggestionState) obj, shortNewsContentCardView);
            case 4:
                forEachFocusableIntersection foreachfocusableintersection = (forEachFocusableIntersection) obj5;
                if (((findContainingItemView) obj) != null) {
                    BuildersKt.RemoteActionCompatParcelizer(foreachfocusableintersection.IconCompatParcelizer, null, null, new BubbleFloatingItemUiModelImpl$1(foreachfocusableintersection, null, 2), 3);
                } else {
                    foreachfocusableintersection.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.FALSE);
                }
                return createfromparcel;
            case 5:
                ThrottledCallbacks throttledCallbacks = (ThrottledCallbacks) obj;
                debounceEntryb8qMvQI debounceentryb8qmvqi = (debounceEntryb8qMvQI) obj5;
                MutableStateFlow mutableStateFlow = debounceentryb8qmvqi.serializer;
                if (throttledCallbacks instanceof getPositionInWindownOccac) {
                    BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = debounceentryb8qmvqi.IconCompatParcelizer;
                    List list3 = ((getPositionInWindownOccac) throttledCallbacks).read;
                    brazeExternalSyntheticLambda28.getClass();
                    list3.getClass();
                    List<RelativeLayoutBounds> list4 = list3;
                    ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                    for (RelativeLayoutBounds relativeLayoutBounds : list4) {
                        String str = relativeLayoutBounds.RemoteActionCompatParcelizer;
                        int i8 = relativeLayoutBounds.RatingCompat;
                        String str2 = relativeLayoutBounds.write;
                        String str3 = relativeLayoutBounds.serializer;
                        int i9 = fractionVisibleInWindow.RemoteActionCompatParcelizer[relativeLayoutBounds.MediaMetadataCompat.ordinal()];
                        setTransactionSuccessful settransactionsuccessful = brazeExternalSyntheticLambda28.read;
                        arrayList2.add(new fractionVisibleInRect(str, str2, str3, i9 == 1 ? settransactionsuccessful.IconCompatParcelizer(R.string.customer_chats_delivery_status_drop_off) : settransactionsuccessful.IconCompatParcelizer(R.string.customer_chats_delivery_status_pick_up), i8 > 99 ? "99+" : i8 == 0 ? "" : String.valueOf(i8), relativeLayoutBounds.IconCompatParcelizer, relativeLayoutBounds.read, i8 > 0));
                    }
                    mutableStateFlow.IconCompatParcelizer(new multiPut(arrayList2));
                } else {
                    if (!(throttledCallbacks instanceof getPositionInRootnOccac)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    mutableStateFlow.IconCompatParcelizer(new fireWY9HvpM(((getPositionInRootnOccac) throttledCallbacks).IconCompatParcelizer));
                }
                return createfromparcel;
            case 6:
                copyNcG25M8default copyncg25m8default = (copyNcG25M8default) obj;
                hasSameNonLayoutAttributesui_text hassamenonlayoutattributesui_text = (hasSameNonLayoutAttributesui_text) obj5;
                hassamenonlayoutattributesui_text.RemoteActionCompatParcelizer.IconCompatParcelizer(copyncg25m8default);
                hassamenonlayoutattributesui_text.serializer.IconCompatParcelizer(Boolean.valueOf(!(copyncg25m8default instanceof copyGSF8kmgdefault)));
                return createfromparcel;
            case 7:
                getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) obj;
                DeliveryAutoAcceptUiModelImpl deliveryAutoAcceptUiModelImpl = (DeliveryAutoAcceptUiModelImpl) obj5;
                if (getoptimizationlevel instanceof onViewAdded) {
                    deliveryAutoAcceptUiModelImpl.ParcelableVolumeInfo.serializer(new SaversKtExternalSyntheticLambda7(null));
                } else if (getoptimizationlevel instanceof getSceneString) {
                    deliveryAutoAcceptUiModelImpl.ParcelableVolumeInfo.serializer(new SaversKtColorSaver1(deliveryAutoAcceptUiModelImpl.PlaybackStateCompatCustomAction.IconCompatParcelizer(R.string.auto_accept_fallback), ddefault.serializer));
                } else {
                    if (!(getoptimizationlevel instanceof getMaxWidth)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    int i10 = write + 123;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    deliveryAutoAcceptUiModelImpl.ParcelableVolumeInfo.serializer(getTextLinkStylesSaver.RemoteActionCompatParcelizer);
                    DeliveryAutoAcceptUiModelImpl.IconCompatParcelizer(deliveryAutoAcceptUiModelImpl);
                }
                return createfromparcel;
            case 8:
                ((onHideTranslationui) ((getPlatformAndroidManager) obj5)).serializer(MathKt.write(((Number) obj).floatValue()));
                return createfromparcel;
            case 9:
                if (((Boolean) obj).booleanValue()) {
                    ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5).invoke();
                }
                return createfromparcel;
            case 10:
                ((Boolean) obj).getClass();
                N$b n$b = (N$b) obj5;
                measurexDpz5zY measurexdpz5zy = (measurexDpz5zY) n$b.serializer;
                if (measurexdpz5zy != null) {
                    r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = measurexdpz5zy.IconCompatParcelizer;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                        if (((Boolean) ((onViewCreated) obj6).IconCompatParcelizer().read()).booleanValue()) {
                            arrayList3.add(obj6);
                        }
                    }
                    ((MutableStateFlow) n$b.write).IconCompatParcelizer(removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList3));
                }
                return createfromparcel;
            case 11:
                VerbatimTtsAnnotation verbatimTtsAnnotation = (VerbatimTtsAnnotation) obj;
                BoringLayoutFactory boringLayoutFactory = (BoringLayoutFactory) obj5;
                MutableStateFlow mutableStateFlow2 = boringLayoutFactory.read;
                if (verbatimTtsAnnotation != null) {
                    int i12 = RemoteActionCompatParcelizer + 11;
                    write = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    z = true;
                } else {
                    z = false;
                }
                mutableStateFlow2.IconCompatParcelizer(Boolean.valueOf(z));
                boringLayoutFactory.write.IconCompatParcelizer(new AndroidLayoutApi34ExternalSyntheticLambda0(verbatimTtsAnnotation));
                return createfromparcel;
            case 12:
                onFocusStateChange onfocusstatechange = (onFocusStateChange) obj;
                DeliveryDetailsUiModelImpl deliveryDetailsUiModelImpl = (DeliveryDetailsUiModelImpl) obj5;
                if (onfocusstatechange == null || (list2 = onfocusstatechange.destinations) == null || !(!list2.isEmpty())) {
                    z2 = false;
                } else {
                    int i14 = write + 79;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    z2 = true;
                }
                MutableStateFlow mutableStateFlow3 = deliveryDetailsUiModelImpl.RemoteActionCompatParcelizer;
                MutableStateFlow mutableStateFlow4 = deliveryDetailsUiModelImpl.IconCompatParcelizer;
                mutableStateFlow3.IconCompatParcelizer(Boolean.valueOf(z2));
                if (!z2) {
                    mutableStateFlow4.IconCompatParcelizer(CanvasCompatQ.read);
                    return createfromparcel;
                }
                onfocusstatechange.getClass();
                List list5 = onfocusstatechange.destinations;
                List list6 = list5;
                ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                Iterator it = list6.iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (i16 < 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    FocusTargetPropertiesElement focusTargetPropertiesElement = (FocusTargetPropertiesElement) next;
                    int i17 = i16 != SQLite.write(list5) ? 1 : i7;
                    String str4 = focusTargetPropertiesElement.type;
                    String str5 = focusTargetPropertiesElement.type;
                    boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str4, "vendor"}, getCieXyz.write())).booleanValue();
                    String str6 = focusTargetPropertiesElement.name;
                    List list7 = list5;
                    if (zBooleanValue) {
                        canvasCompatS2 = CanvasCompatS.Vendor;
                    } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_vendor"}, getCieXyz.write())).booleanValue()) {
                        canvasCompatS2 = CanvasCompatS.NewVendor;
                    } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "picked_up"}, getCieXyz.write())).booleanValue()) {
                        canvasCompatS2 = CanvasCompatS.PickedUp;
                    } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_customer"}, getCieXyz.write())).booleanValue()) {
                        canvasCompatS2 = CanvasCompatS.NewCustomer;
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "customer"}, getCieXyz.write())).booleanValue()) {
                            canvasCompatS2 = CanvasCompatS.Customer;
                        } else {
                            Timber.RemoteActionCompatParcelizer.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unknown destination type: ", str5), new Object[0]);
                            canvasCompatS = CanvasCompatS.Customer;
                        }
                        if (str6 != null || str6.length() == 0) {
                            str6 = focusTargetPropertiesElement.title;
                        }
                        String str7 = focusTargetPropertiesElement.name;
                        String str8 = focusTargetPropertiesElement.address;
                        String str9 = focusTargetPropertiesElement.estimatedTimeDistance;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "vendor"}, getCieXyz.write())).booleanValue()) {
                            i = R.drawable.ic_bold_large_essentials_shop;
                            i2 = i;
                            i3 = 0;
                        } else {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_vendor"}, getCieXyz.write())).booleanValue()) {
                                i = R.drawable.ic_bold_large_essentials_shop_plus;
                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "picked_up"}, getCieXyz.write())).booleanValue()) {
                                i = R.drawable.ic_bold_large_essentials_shop;
                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_customer"}, getCieXyz.write())).booleanValue()) {
                                i = R.drawable.ic_bold_large_essentials_user_circle_plus;
                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "customer"}, getCieXyz.write())).booleanValue()) {
                                i = R.drawable.ic_bold_large_essentials_user_circle;
                            } else {
                                i3 = 0;
                                Timber.RemoteActionCompatParcelizer.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unknown destination type: ", str5), new Object[0]);
                                i2 = R.drawable.ic_bold_large_essentials_user_circle;
                            }
                            i2 = i;
                            i3 = 0;
                        }
                        if (i17 != 0) {
                            i4 = i3;
                        } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_vendor"}, getCieXyz.write())).booleanValue()) {
                            i4 = i3;
                        } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_customer"}, getCieXyz.write())).booleanValue()) {
                            i4 = 1;
                        } else {
                            i4 = i3;
                        }
                        if (i17 != 0) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_customer"}, getCieXyz.write())).booleanValue()) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_vendor"}, getCieXyz.write())).booleanValue()) {
                                    r32 = i3;
                                }
                            }
                            r32 = 1;
                        } else {
                            r32 = i3;
                        }
                        getlocalisinpopuplayout = focusTargetPropertiesElement.tags;
                        if (getlocalisinpopuplayout != null || (list = getlocalisinpopuplayout.items) == null) {
                            arrayList = instance_delegatelambda0.write;
                        } else {
                            List<SimpleStack> list8 = list;
                            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list8, 10));
                            for (SimpleStack simpleStack : list8) {
                                arrayList.add(new getTypeface(simpleStack.title, getCacheKey.write(simpleStack.style, new accessgetAboveBaselinecp(18))));
                            }
                        }
                        arrayList4.add(new CharSequenceCharacterIterator(canvasCompatS, str6, str7, str8, str9, i2, i4, r32, removeNodeAtDepth.RemoteActionCompatParcelizer((Iterable) arrayList)));
                        i16++;
                        i7 = i3;
                        it = it;
                        list5 = list7;
                        createfromparcel = createfromparcel;
                        mutableStateFlow4 = mutableStateFlow4;
                    }
                    canvasCompatS = canvasCompatS2;
                    if (str6 != null) {
                        str6 = focusTargetPropertiesElement.title;
                    } else {
                        str6 = focusTargetPropertiesElement.title;
                    }
                    String str10 = focusTargetPropertiesElement.name;
                    String str11 = focusTargetPropertiesElement.address;
                    String str12 = focusTargetPropertiesElement.estimatedTimeDistance;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "vendor"}, getCieXyz.write())).booleanValue()) {
                        i = R.drawable.ic_bold_large_essentials_shop;
                        i2 = i;
                        i3 = 0;
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_vendor"}, getCieXyz.write())).booleanValue()) {
                            i = R.drawable.ic_bold_large_essentials_shop_plus;
                        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "picked_up"}, getCieXyz.write())).booleanValue()) {
                            i = R.drawable.ic_bold_large_essentials_shop;
                        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_customer"}, getCieXyz.write())).booleanValue()) {
                            i = R.drawable.ic_bold_large_essentials_user_circle_plus;
                        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "customer"}, getCieXyz.write())).booleanValue()) {
                            i = R.drawable.ic_bold_large_essentials_user_circle;
                        } else {
                            i3 = 0;
                            Timber.RemoteActionCompatParcelizer.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unknown destination type: ", str5), new Object[0]);
                            i2 = R.drawable.ic_bold_large_essentials_user_circle;
                        }
                        i2 = i;
                        i3 = 0;
                    }
                    if (i17 != 0) {
                        i4 = i3;
                    } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_vendor"}, getCieXyz.write())).booleanValue()) {
                        i4 = i3;
                    } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_customer"}, getCieXyz.write())).booleanValue()) {
                        i4 = 1;
                    } else {
                        i4 = i3;
                    }
                    if (i17 != 0) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_customer"}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, "new_vendor"}, getCieXyz.write())).booleanValue()) {
                                r32 = i3;
                            }
                        }
                        r32 = 1;
                    } else {
                        r32 = i3;
                    }
                    getlocalisinpopuplayout = focusTargetPropertiesElement.tags;
                    if (getlocalisinpopuplayout != null) {
                        arrayList = instance_delegatelambda0.write;
                    } else {
                        arrayList = instance_delegatelambda0.write;
                    }
                    arrayList4.add(new CharSequenceCharacterIterator(canvasCompatS, str6, str10, str11, str12, i2, i4, r32, removeNodeAtDepth.RemoteActionCompatParcelizer((Iterable) arrayList)));
                    i16++;
                    i7 = i3;
                    it = it;
                    list5 = list7;
                    createfromparcel = createfromparcel;
                    mutableStateFlow4 = mutableStateFlow4;
                }
                createFromParcel createfromparcel2 = createfromparcel;
                mutableStateFlow4.IconCompatParcelizer(new drawDoubleRoundRect(arrayList4));
                return createfromparcel2;
            case 13:
                LayoutCompatJustificationMode layoutCompatJustificationMode = (LayoutCompatJustificationMode) obj;
                EarningsUiModelImpl earningsUiModelImpl = (EarningsUiModelImpl) obj5;
                MutableStateFlow mutableStateFlow5 = earningsUiModelImpl.RemoteActionCompatParcelizer;
                if (layoutCompatJustificationMode != null) {
                    int i18 = RemoteActionCompatParcelizer + 33;
                    write = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                mutableStateFlow5.IconCompatParcelizer(Boolean.valueOf(z3));
                MutableStateFlow mutableStateFlow6 = earningsUiModelImpl.read;
                if (layoutCompatJustificationMode != null) {
                    int i20 = RemoteActionCompatParcelizer + 67;
                    write = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 == 0) {
                        mutableStateFlow6.IconCompatParcelizer(layoutCompatJustificationMode);
                        int i21 = 93 / 0;
                    } else {
                        mutableStateFlow6.IconCompatParcelizer(layoutCompatJustificationMode);
                    }
                } else {
                    mutableStateFlow6.IconCompatParcelizer(LayoutCompatHyphenationFrequency.RemoteActionCompatParcelizer);
                }
                return createfromparcel;
            case 14:
                LayoutIntrinsics layoutIntrinsics = (LayoutIntrinsics) obj;
                EarningsMessageUiModelImpl earningsMessageUiModelImpl = (EarningsMessageUiModelImpl) obj5;
                earningsMessageUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(layoutIntrinsics instanceof computeMinIntrinsicWidth));
                earningsMessageUiModelImpl.read.IconCompatParcelizer(layoutIntrinsics);
                return createfromparcel;
            case 15:
                ((LastStopOptionUiModelImpl) obj5).serializer.IconCompatParcelizer((getClipBounds) obj);
                return createfromparcel;
            case 16:
                isOpaque isopaque = (isOpaque) obj;
                LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl = (LastStopSelectionBottomSheetUiModelImpl) obj5;
                lastStopSelectionBottomSheetUiModelImpl.write.IconCompatParcelizer(isopaque);
                lastStopSelectionBottomSheetUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(isopaque != null));
                return createfromparcel;
            case 17:
                drawRGB drawrgb = (drawRGB) obj;
                MutableStateFlow mutableStateFlow7 = ((getCharacterRightBounds) obj5).write;
                if (drawrgb == drawRGB.ACTIVE) {
                    int i22 = RemoteActionCompatParcelizer + 67;
                    write = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    z4 = true;
                } else {
                    z4 = false;
                }
                mutableStateFlow7.IconCompatParcelizer(Boolean.valueOf(z4));
                return createfromparcel;
            case 18:
                if (((f1) obj) instanceof f2) {
                    TextLayout_androidKt textLayout_androidKt = (TextLayout_androidKt) obj5;
                    if (!textLayout_androidKt.MediaDescriptionCompat) {
                        textLayout_androidKt.MediaDescriptionCompat = true;
                        MutableStateFlow mutableStateFlow8 = textLayout_androidKt.write.write;
                        do {
                            obj2 = mutableStateFlow8.read();
                            objRemoteActionCompatParcelizer = (drawLine) obj2;
                            if (objRemoteActionCompatParcelizer instanceof drawTextOnPath) {
                                int i24 = write + 19;
                                RemoteActionCompatParcelizer = i24 % Fields.SpotShadowColor;
                                int i25 = i24 % 2;
                                objRemoteActionCompatParcelizer = drawTextOnPath.RemoteActionCompatParcelizer((drawTextOnPath) objRemoteActionCompatParcelizer, null, null, false, true, 741);
                            }
                        } while (!mutableStateFlow8.RemoteActionCompatParcelizer(obj2, objRemoteActionCompatParcelizer));
                    }
                }
                return createfromparcel;
            case 19:
                f1 f1Var = (f1) obj;
                MutableStateFlow mutableStateFlow9 = ((getEndOffsetForRectWithinRun) obj5).write;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{f1Var, f2.serializer}, getCieXyz.write())).booleanValue()) {
                    do {
                        obj4 = mutableStateFlow9.read();
                        getBottomPaddingui_textannotations getbottompaddingui_textannotations2 = (getBottomPaddingui_textannotations) obj4;
                        if (getbottompaddingui_textannotations2 != null) {
                            int i26 = write + 83;
                            RemoteActionCompatParcelizer = i26 % Fields.SpotShadowColor;
                            int i27 = i26 % 2;
                            getbottompaddingui_textannotationsSerializer = getBottomPaddingui_textannotations.serializer(getbottompaddingui_textannotations2, null, true, false, 0, 9);
                        } else {
                            getbottompaddingui_textannotationsSerializer = null;
                        }
                    } while (!mutableStateFlow9.RemoteActionCompatParcelizer(obj4, getbottompaddingui_textannotationsSerializer));
                } else if (f1Var instanceof f0) {
                    do {
                        obj3 = mutableStateFlow9.read();
                        getbottompaddingui_textannotations = (getBottomPaddingui_textannotations) obj3;
                    } while (!mutableStateFlow9.RemoteActionCompatParcelizer(obj3, getbottompaddingui_textannotations != null ? getBottomPaddingui_textannotations.serializer(getbottompaddingui_textannotations, null, false, false, 0, 13) : null));
                }
                return createfromparcel;
            case 20:
                ViewFactoryHolderresetBlock1 viewFactoryHolderresetBlock1 = (ViewFactoryHolderresetBlock1) obj;
                NewOrderTitleUiModelImpl newOrderTitleUiModelImpl = (NewOrderTitleUiModelImpl) obj5;
                MutableStateFlow mutableStateFlow10 = newOrderTitleUiModelImpl.serializer;
                MutableStateFlow mutableStateFlow11 = newOrderTitleUiModelImpl.write;
                if (viewFactoryHolderresetBlock1 != null) {
                    mutableStateFlow11.IconCompatParcelizer(new getLineHeightPaddings(viewFactoryHolderresetBlock1.title));
                    mutableStateFlow10.IconCompatParcelizer(Boolean.TRUE);
                } else {
                    mutableStateFlow11.IconCompatParcelizer(getSharedTextAndroidCanvas.RemoteActionCompatParcelizer);
                    mutableStateFlow10.IconCompatParcelizer(Boolean.FALSE);
                }
                return createfromparcel;
            case 21:
                previousEndBoundary previousendboundary = (previousEndBoundary) obj;
                OrderItemsNavigationUiModelImpl orderItemsNavigationUiModelImpl = (OrderItemsNavigationUiModelImpl) obj5;
                orderItemsNavigationUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(previousendboundary == null ? previousStartBoundary.write : previousendboundary);
                orderItemsNavigationUiModelImpl.write.IconCompatParcelizer(Boolean.valueOf(previousendboundary != null));
                return createfromparcel;
            case 22:
                AndroidFileDescriptorFont androidFileDescriptorFont = (AndroidFileDescriptorFont) obj;
                TagsUiModelImpl tagsUiModelImpl = (TagsUiModelImpl) obj5;
                tagsUiModelImpl.read.IconCompatParcelizer(Boolean.valueOf(androidFileDescriptorFont instanceof getAssetManager));
                tagsUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(androidFileDescriptorFont);
                return createfromparcel;
            case 23:
                ProtobufEncoder protobufEncoder = ((MidShiftIdVerificationCoordinator) obj5).read;
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Mid-shift: ID verification interrupted by new order acceptance", new Object[0]);
                ((DeleteSurroundingTextInCodePointsCommand) protobufEncoder.write).write.logEvent("mid_shift_selfie_interrupted", null);
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) protobufEncoder.serializer;
                deleteGlobalPartnerParameters deleteglobalpartnerparameters = (deleteGlobalPartnerParameters) initializeAppStartupItemsImpl.IconCompatParcelizer;
                setTransactionSuccessful settransactionsuccessful2 = (setTransactionSuccessful) initializeAppStartupItemsImpl.serializer;
                ((s0) deleteglobalpartnerparameters).RemoteActionCompatParcelizer(new checkAdjustAdRevenue(new deleteGlobalCallbackParameters(109, settransactionsuccessful2.IconCompatParcelizer(R.string.om_racc_mid_shift_verification_interrupted_push_notification_title), settransactionsuccessful2.IconCompatParcelizer(R.string.om_racc_mid_shift_verification_interrupted_push_notification_description), createDeeplinkIntentI.OPEN_APP), canTrackMeasurementConsentI.IconCompatParcelizer, null, deleteEventMetadata.Local, 4), new NafathLogger$$ExternalSyntheticLambda0(15), null);
                requestGeofences requestgeofences = (requestGeofences) protobufEncoder.RemoteActionCompatParcelizer;
                requestImmediateDataFlush requestimmediatedataflush = requestImmediateDataFlush.ORDER_ACCEPTED;
                requestimmediatedataflush.getClass();
                ((reenqueueInAppMessageandroid_sdk_base_release) requestgeofences).read.write(requestimmediatedataflush);
                return createfromparcel;
            case 24:
                ((Boolean) obj).getClass();
                DestinationAddressUiModelImpl destinationAddressUiModelImpl = (DestinationAddressUiModelImpl) obj5;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(s3) destinationAddressUiModelImpl.RemoteActionCompatParcelizer.read(), s8ExternalSyntheticLambda0.serializer}, getCieXyz.write())).booleanValue()) {
                    int i28 = RemoteActionCompatParcelizer + 91;
                    write = i28 % Fields.SpotShadowColor;
                    int i29 = i28 % 2;
                    Object obj7 = destinationAddressUiModelImpl.IconCompatParcelizer.read.read();
                    onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = onPrimaryNavigationFragmentChanged.HALF_EXPANDED;
                    if (obj7 != onprimarynavigationfragmentchanged) {
                        destinationAddressUiModelImpl.MediaBrowserCompatMediaItem.IconCompatParcelizer(onprimarynavigationfragmentchanged);
                    }
                }
                return createfromparcel;
            case 25:
                onRequestCursorAnchorInfo onrequestcursoranchorinfo = (onRequestCursorAnchorInfo) obj;
                notifyFocusedRect notifyfocusedrect = (notifyFocusedRect) obj5;
                if (onrequestcursoranchorinfo instanceof restartInput) {
                    notifyfocusedrect.serializer.serializer(onImeActionKlQnJC8.RemoteActionCompatParcelizer);
                }
                notifyfocusedrect.IconCompatParcelizer.IconCompatParcelizer(onrequestcursoranchorinfo);
                return createfromparcel;
            case 26:
                String str13 = (String) obj;
                TextInputServiceAndroidTextInputCommand textInputServiceAndroidTextInputCommand = (TextInputServiceAndroidTextInputCommand) obj5;
                if (str13 != null) {
                    MutableStateFlow mutableStateFlow12 = textInputServiceAndroidTextInputCommand.write;
                    BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda29 = textInputServiceAndroidTextInputCommand.MediaDescriptionCompat;
                    brazeExternalSyntheticLambda29.getClass();
                    setTransactionSuccessful settransactionsuccessful3 = brazeExternalSyntheticLambda29.read;
                    String strIconCompatParcelizer = settransactionsuccessful3.IconCompatParcelizer(R.string.df_crowdsourcing_onboarding_guidelines_link);
                    mutableStateFlow12.IconCompatParcelizer(new KeyboardType(settransactionsuccessful3.IconCompatParcelizer(R.string.df_crowdsourcing_onboarding_header), settransactionsuccessful3.read(R.string.df_crowdsourcing_onboarding_description, strIconCompatParcelizer), strIconCompatParcelizer, str13, SQLite.read(settransactionsuccessful3.IconCompatParcelizer(R.string.df_crowdsourcing_onboarding_guidelines_no_faces), settransactionsuccessful3.IconCompatParcelizer(R.string.df_crowdsourcing_onboarding_guidelines_no_illegal_content), settransactionsuccessful3.IconCompatParcelizer(R.string.df_crowdsourcing_onboarding_guidelines_entrance_only)), SQLite.read(new getUnspecifiedIUNYP9k(2131232052, settransactionsuccessful3.IconCompatParcelizer(R.string.df_crowdsourcing_onboarding_image_entrance)), new getUnspecifiedIUNYP9k(2131232051, settransactionsuccessful3.IconCompatParcelizer(R.string.df_crowdsourcing_onboarding_image_building)), new getUnspecifiedIUNYP9k(2131232092, settransactionsuccessful3.IconCompatParcelizer(R.string.df_crowdsourcing_onboarding_image_parking_spot))), settransactionsuccessful3.IconCompatParcelizer(R.string.df_crowdsourcing_onboarding_btn_primary_accept), settransactionsuccessful3.IconCompatParcelizer(R.string.df_crowdsourcing_onboarding_btn_tertiary_back)));
                } else {
                    Timber.RemoteActionCompatParcelizer.read("Failed to open Crowdsourcing Terms and Conditions: url can't be empty", new Object[0]);
                    textInputServiceAndroidTextInputCommand.serializer.serializer(getCharactersIUNYP9k.RemoteActionCompatParcelizer);
                }
                return createfromparcel;
            case 27:
                SettingsOnboardingDataStore settingsOnboardingDataStore = ((packBytes) ((InitializeAppStartupItemsImpl) obj5).IconCompatParcelizer).RemoteActionCompatParcelizer;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(settingsOnboardingDataStore.IconCompatParcelizer, new SettingsOnboardingDataStore$setTooltipShown$2(settingsOnboardingDataStore, shortNewsContentCardView2, i7), shortNewsContentCardView);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objSerializer != coroutineSingletons2) {
                    objSerializer = createfromparcel;
                }
                if (objSerializer != coroutineSingletons2) {
                    objSerializer = createfromparcel;
                }
                return objSerializer == coroutineSingletons2 ? objSerializer : createfromparcel;
            case 28:
                ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl = (ConfirmButtonV1UiModelImpl) obj5;
                confirmButtonV1UiModelImpl.write.IconCompatParcelizer(new getStates((buildCompositionParentHierarchy) obj));
                confirmButtonV1UiModelImpl.serializer.IconCompatParcelizer(Boolean.TRUE);
                return createfromparcel;
            default:
                InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (InfiniteTransitionSearchInfo) obj;
                MutableStateFlow mutableStateFlow13 = ((AcknowledgementTaskUiModelImpl) obj5).read;
                if (infiniteTransitionSearchInfo == null) {
                    int i30 = RemoteActionCompatParcelizer + 97;
                    write = i30 % Fields.SpotShadowColor;
                    if (i30 % 2 == 0) {
                        mutableStateFlow13.IconCompatParcelizer(CompositionDataRecordCompanion.IconCompatParcelizer);
                        Object obj8 = null;
                        obj8.hashCode();
                        throw null;
                    }
                    mutableStateFlow13.IconCompatParcelizer(CompositionDataRecordCompanion.IconCompatParcelizer);
                } else {
                    mutableStateFlow13.IconCompatParcelizer(new r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw(infiniteTransitionSearchInfo));
                }
                return createfromparcel;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r1
  0x0025: PHI (r1v6 com.roadrunner.auth.logout.presentation.LogoutViewModel) = 
  (r1v5 com.roadrunner.auth.logout.presentation.LogoutViewModel)
  (r1v10 com.roadrunner.auth.logout.presentation.LogoutViewModel)
 binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public Object emit(setInputTextSuggestionState setinputtextsuggestionstate, ShortNewsContentCardView shortNewsContentCardView) {
        LogoutViewModel logoutViewModel;
        setContentDataType setcontentdatatype;
        int i;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 47;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            logoutViewModel = (LogoutViewModel) this.serializer;
            if (shortNewsContentCardView instanceof setContentDataType) {
                setcontentdatatype = (setContentDataType) shortNewsContentCardView;
                i = setcontentdatatype.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i5 = RemoteActionCompatParcelizer + 109;
                    write = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    setcontentdatatype.serializer = i - Integer.MIN_VALUE;
                }
            }
            obj = setcontentdatatype.RemoteActionCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = setcontentdatatype.serializer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setinputtextsuggestionstate, setProgressdefault.read}, getCieXyz.write())).booleanValue()) {
                    setcontentdatatype.IconCompatParcelizer = setinputtextsuggestionstate;
                    setcontentdatatype.serializer = 1;
                    if (LogoutViewModel.access$logoutUserProcess(logoutViewModel, setcontentdatatype) == coroutineSingletons) {
                        int i7 = write + 69;
                        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i9 = write + 13;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return null;
                }
                int i11 = RemoteActionCompatParcelizer + 53;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                setinputtextsuggestionstate = setcontentdatatype.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setinputtextsuggestionstate, setRolekuIjeqM.write}, getCieXyz.write())).booleanValue())) {
                LogoutViewModel.RemoteActionCompatParcelizer(logoutViewModel);
            }
            return createFromParcel.INSTANCE;
        }
        logoutViewModel = (LogoutViewModel) this.serializer;
        int i13 = 54 / 0;
        if (!(!(shortNewsContentCardView instanceof setContentDataType))) {
            setcontentdatatype = (setContentDataType) shortNewsContentCardView;
            i = setcontentdatatype.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i14 = RemoteActionCompatParcelizer + 109;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                setcontentdatatype.serializer = i - Integer.MIN_VALUE;
            }
        }
        obj = setcontentdatatype.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = setcontentdatatype.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setinputtextsuggestionstate, setProgressdefault.read}, getCieXyz.write())).booleanValue()) {
                setcontentdatatype.IconCompatParcelizer = setinputtextsuggestionstate;
                setcontentdatatype.serializer = 1;
                if (LogoutViewModel.access$logoutUserProcess(logoutViewModel, setcontentdatatype) == coroutineSingletons) {
                    int i16 = write + 69;
                    RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i18 = write + 13;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return null;
            }
            int i110 = RemoteActionCompatParcelizer + 53;
            write = i110 % Fields.SpotShadowColor;
            int i111 = i110 % 2;
            setinputtextsuggestionstate = setcontentdatatype.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setinputtextsuggestionstate, setRolekuIjeqM.write}, getCieXyz.write())).booleanValue())) {
            LogoutViewModel.RemoteActionCompatParcelizer(logoutViewModel);
        }
        return createFromParcel.INSTANCE;
        setcontentdatatype = new setContentDataType(this, shortNewsContentCardView);
        obj = setcontentdatatype.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = setcontentdatatype.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setinputtextsuggestionstate, setProgressdefault.read}, getCieXyz.write())).booleanValue()) {
                setcontentdatatype.IconCompatParcelizer = setinputtextsuggestionstate;
                setcontentdatatype.serializer = 1;
                if (LogoutViewModel.access$logoutUserProcess(logoutViewModel, setcontentdatatype) == coroutineSingletons) {
                    int i112 = write + 69;
                    RemoteActionCompatParcelizer = i112 % Fields.SpotShadowColor;
                    int i113 = i112 % 2;
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i114 = write + 13;
                RemoteActionCompatParcelizer = i114 % Fields.SpotShadowColor;
                int i115 = i114 % 2;
                return null;
            }
            int i116 = RemoteActionCompatParcelizer + 53;
            write = i116 % Fields.SpotShadowColor;
            int i117 = i116 % 2;
            setinputtextsuggestionstate = setcontentdatatype.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setinputtextsuggestionstate, setRolekuIjeqM.write}, getCieXyz.write())).booleanValue())) {
            LogoutViewModel.RemoteActionCompatParcelizer(logoutViewModel);
        }
        return createFromParcel.INSTANCE;
    }
}
