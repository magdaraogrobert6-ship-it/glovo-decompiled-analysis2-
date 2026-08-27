package com.roadrunner.auth.data;

import android.app.Application;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Float16;
import androidx.sqlite.SQLite;
import bo.app.hg$$ExternalSyntheticLambda5;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.braze.Constants;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.google.android.play.core.review.model.ReviewErrorCode;
import com.google.re2j.Parser;
import com.huawei.hms.adapter.internal.BaseCode;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.riemann.location.common.utils.Constant;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.domain.entity.AuthEntity$Companion;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest$invoke$2;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheStatus;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.LastStopMapPinUiModelImpl$1$1$1$1;
import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.ontheway.address.presentation.DestinationAddressUiModelImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageButtonUiModelImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesLinkUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$AcceptData$BoostedEarningsIcons;
import com.roadrunner.delivery.state.StateV3$AcceptData$PromoBonusIcon;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import dagger.Lazy;
import io.sentry.SentryUUID;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.serialization.SerializationException;
import o.BringIntoViewNoderequester111;
import o.FocusTargetInteropNoderetrievePinnableContainer1;
import o.FocusTargetPropertiesNode;
import o.FontMuC2MFsdefault;
import o.InAppMessageHtmlBaseView;
import o.LayoutCompatJustificationMode;
import o.MathUtils;
import o.MathUtilsKt;
import o.NullableInputConnectionWrapperApi21;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PopupTestTag;
import o.SemanticsPropertiesAndroidAccessibilityClassName1;
import o.SemanticsPropertiesIsPopup1;
import o.SemanticsPropertiesRole1;
import o.SetComposingRegionCommand;
import o.ShadowSpan;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.TextInputServiceAndroidonImeActionPerformed1;
import o.TextInputServiceAndroidstopInput2;
import o.TextMotionLinearitySaverlambda0;
import o.ViewFactoryHolderregisterSaveStateProvider1;
import o.access500;
import o.accessgetCurrentlyFocusedRect;
import o.accessgetInstancedelegatecp;
import o.accessgetIntersectcp;
import o.accessunregisterSaveStateProvider;
import o.backwardFocusSearch;
import o.clearTextSubstitutiondefault;
import o.constrainedMap;
import o.copyCXVQc50default;
import o.copyHL5avdYdefault;
import o.copyNs73l9sdefault;
import o.copyYTHSh70;
import o.copyYTHSh70default;
import o.copyuxg59PA;
import o.createFromParcel;
import o.dashPathEffectdefault;
import o.displayInAppMessagelambda1;
import o.ensureSubscribedToInAppMessageEvents;
import o.getCardAtIndexlambda0;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getDEFAULT_LAYOUT_ALIGNMENTui_text;
import o.getEndOffsetForRectWithinRun;
import o.getHasStaleResolvedFonts;
import o.getHintLocales;
import o.getInAppMessageEventMap;
import o.getKeyboardTap5zf0vsI;
import o.getNoActiveChildannotations;
import o.getNoneIUNYP9kannotations;
import o.getParagraph;
import o.getParagraphStart;
import o.getParagraphStylesOrNullui_text;
import o.getPositionInRoot;
import o.getTextEntryKey;
import o.getTextSubstitution;
import o.getTraversalIndexdelegate;
import o.getUnspecifiedIUNYP9kannotations;
import o.getUriPjHm6EE;
import o.getUrlAnnotations;
import o.getVonKries;
import o.getWordDRrd7Zo;
import o.hasLinkAnnotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.inCompatibilityMode;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.isIncluded;
import o.isOpaque;
import o.isOpenInternalroom_runtime;
import o.isVerticalSwipeInAllowedDirection;
import o.lerpInv;
import o.lookupAndInterpolate;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onMove;
import o.onTouch;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.paintRPmYEkkdefault;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;
import o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.r8lambdamLxa7_TFGnM6hfQl7rqXrlU6VHg;
import o.r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE;
import o.rememberNestedScrollInteropConnection;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.s3;
import o.s8ExternalSyntheticLambda0;
import o.safeSetClipToOutline;
import o.sendSynthesizedKeyEvent;
import o.setExitSharedElementCallback;
import o.setFontSizeR2X_6o;
import o.setGraphicModalMaxWidthDp;
import o.setUpdateBlock;
import o.setWindowOffsetgyyYBs;
import o.sourceInformationContextOfdefault;
import o.subSequence5zctL8;
import o.updateAdidI;
import o.updateOffsetsLDcG7Xg;
import okhttp3.RequestBody;
import org.joda.time.DateTimeConstants;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
@getCardAtIndexlambda0
public final class LocalAuthDataSource {
    private static final byte[] $$a = {49, 55, -28, 33};
    private static final int $$b = 173;
    private static int MediaBrowserCompatMediaItem;
    private static char[] MediaDescriptionCompat;
    private static long MediaMetadataCompat;
    private static final byte[] ParcelableVolumeInfo;
    private static final int PlaybackStateCompat;
    private static int RatingCompat;
    private final isOpenInternalroom_runtime IconCompatParcelizer;
    private final Lazy MediaSessionCompatQueueItem;
    private final SemanticsPropertiesIsPopup1 RemoteActionCompatParcelizer;
    private final MutableStateFlow<getTraversalIndexdelegate> read;
    private final onViewDetachedFromWindowlambda1 serializer;
    private final ReentrantLock write;

    /* JADX INFO: renamed from: com.roadrunner.auth.data.LocalAuthDataSource$store$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 1;
        private static int write;
        public final /* synthetic */ Object RemoteActionCompatParcelizer;
        public /* synthetic */ Object read;
        public final /* synthetic */ int serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.read = obj;
            this.RemoteActionCompatParcelizer = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.RemoteActionCompatParcelizer = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer + 83;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = this.serializer;
            Object obj2 = this.RemoteActionCompatParcelizer;
            int i6 = 29;
            switch (i5) {
                case 0:
                    return new AnonymousClass2((LocalAuthDataSource) this.read, (getTraversalIndexdelegate) obj2, shortNewsContentCardView, 0);
                case 1:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 1);
                    anonymousClass2.read = obj;
                    int i7 = IconCompatParcelizer + 69;
                    write = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        return anonymousClass2;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                case 2:
                    return new AnonymousClass2((Parser.Pair) this.read, (InputStream) obj2, shortNewsContentCardView, i);
                case 3:
                    return new AnonymousClass2((Cipher) this.read, (byte[]) obj2, shortNewsContentCardView, 3);
                case 4:
                    return new AnonymousClass2((Cipher) this.read, (String) obj2, shortNewsContentCardView, 4);
                case 5:
                    return new AnonymousClass2((ChatAssetCacheManager) this.read, (String) obj2, shortNewsContentCardView, 5);
                case 6:
                    return new AnonymousClass2((ChatAssetCacheManager) this.read, (Set) obj2, shortNewsContentCardView, 6);
                case 7:
                    return new AnonymousClass2((SignInDataStore) this.read, (Uri) obj2, shortNewsContentCardView, 7);
                case 8:
                    AnonymousClass2 anonymousClass3 = new AnonymousClass2((paintRPmYEkkdefault) obj2, shortNewsContentCardView, 8);
                    anonymousClass3.read = obj;
                    return anonymousClass3;
                case 9:
                    return new AnonymousClass2((getHasStaleResolvedFonts) this.read, (String) obj2, shortNewsContentCardView, 9);
                case 10:
                    return new AnonymousClass2((WebChatViewModel) this.read, (String) obj2, shortNewsContentCardView, 10);
                case 11:
                    return new AnonymousClass2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read, (getParagraph) obj2, shortNewsContentCardView, 11);
                case 12:
                    return new AnonymousClass2((getParagraph) this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2, shortNewsContentCardView, 12);
                case 13:
                    return new AnonymousClass2((copyNs73l9sdefault) this.read, (TextMotionLinearitySaverlambda0) obj2, shortNewsContentCardView, 13);
                case 14:
                    return new AnonymousClass2((DeliveryAutoAcceptUiModelImpl) this.read, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 14);
                case 15:
                    return new AnonymousClass2((copyCXVQc50default) this.read, (isIncluded) obj2, shortNewsContentCardView, 15);
                case 16:
                    AnonymousClass2 anonymousClass4 = new AnonymousClass2((RecentLastStopsDatastoreImpl) obj2, shortNewsContentCardView, 16);
                    anonymousClass4.read = obj;
                    return anonymousClass4;
                case 17:
                    return new AnonymousClass2((LastStopSelectionBottomSheetUiModelImpl) this.read, (isOpaque) obj2, shortNewsContentCardView, 17);
                case 18:
                    AnonymousClass2 anonymousClass5 = new AnonymousClass2((getEndOffsetForRectWithinRun) obj2, shortNewsContentCardView, 18);
                    anonymousClass5.read = obj;
                    return anonymousClass5;
                case 19:
                    AnonymousClass2 anonymousClass6 = new AnonymousClass2((ShadowSpan) obj2, shortNewsContentCardView, 19);
                    anonymousClass6.read = obj;
                    return anonymousClass6;
                case 20:
                    return new AnonymousClass2((DeliveryAcceptanceLogger) this.read, (TrackingEvent) obj2, shortNewsContentCardView, 20);
                case 21:
                    return new AnonymousClass2((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read, (getVonKries) obj2, shortNewsContentCardView, 21);
                case 22:
                    AnonymousClass2 anonymousClass7 = new AnonymousClass2((DestinationAddressUiModelImpl) obj2, shortNewsContentCardView, 22);
                    anonymousClass7.read = obj;
                    return anonymousClass7;
                case 23:
                    AnonymousClass2 anonymousClass8 = new AnonymousClass2((CrowdSourcingDataStore) obj2, shortNewsContentCardView, 23);
                    anonymousClass8.read = obj;
                    return anonymousClass8;
                case 24:
                    AnonymousClass2 anonymousClass9 = new AnonymousClass2((CrowdSourcingFloatingImageButtonUiModelImpl) obj2, shortNewsContentCardView, 24);
                    anonymousClass9.read = obj;
                    return anonymousClass9;
                case 25:
                    AnonymousClass2 anonymousClass10 = new AnonymousClass2((CrowdSourcingFloatingImageCameraOnlyUiModelImpl) obj2, shortNewsContentCardView, 25);
                    anonymousClass10.read = obj;
                    return anonymousClass10;
                case 26:
                    return new AnonymousClass2((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 26);
                case 27:
                    AnonymousClass2 anonymousClass11 = new AnonymousClass2((sendSynthesizedKeyEvent) obj2, shortNewsContentCardView, 27);
                    anonymousClass11.read = obj;
                    int i8 = IconCompatParcelizer + 29;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return anonymousClass11;
                case 28:
                    return new AnonymousClass2((SetComposingRegionCommand) this.read, (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) obj2, shortNewsContentCardView, 28);
                default:
                    AnonymousClass2 anonymousClass12 = new AnonymousClass2((DeliveryNotesLinkUiModelImpl) obj2, shortNewsContentCardView, i6);
                    anonymousClass12.read = obj;
                    return anonymousClass12;
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            switch (i2) {
                case 0:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 1:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 2:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 3:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 4:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 5:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 6:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 7:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 8:
                    ((AnonymousClass2) create((getTextSubstitution) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 9:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 10:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 11:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 12:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 13:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 14:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 15:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 16:
                    ((AnonymousClass2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i3 = write + 117;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        int i4 = 15 / 0;
                    }
                    return createfromparcel;
                case 17:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 18:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 19:
                    return ((AnonymousClass2) create((getNoActiveChildannotations) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 20:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 21:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i5 = write + 41;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        int i6 = 70 / 0;
                    }
                    return createfromparcel;
                case 22:
                    ((AnonymousClass2) create((s3) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 23:
                    ((AnonymousClass2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 24:
                    ((AnonymousClass2) create((getUriPjHm6EE) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 25:
                    ((AnonymousClass2) create((copyYTHSh70default) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 26:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 27:
                    ((AnonymousClass2) create((getUnspecifiedIUNYP9kannotations) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 28:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                default:
                    ((AnonymousClass2) create((TextInputServiceAndroidonImeActionPerformed1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
            }
        }

        /* JADX WARN: Code duplicated, block: B:182:0x04cf  */
        /* JADX WARN: Code duplicated, block: B:192:0x04f1  */
        /* JADX WARN: Code duplicated, block: B:194:0x04f9  */
        /* JADX WARN: Code duplicated, block: B:195:0x04fc  */
        /* JADX WARN: Code duplicated, block: B:206:0x0524  */
        /* JADX WARN: Code duplicated, block: B:208:0x052c  */
        /* JADX WARN: Code duplicated, block: B:209:0x052f  */
        /* JADX WARN: Code duplicated, block: B:329:0x0813  */
        /* JADX WARN: Code duplicated, block: B:332:0x081d  */
        /* JADX WARN: Code duplicated, block: B:340:0x084a  */
        /* JADX WARN: Code duplicated, block: B:343:0x0854  */
        /* JADX WARN: Code duplicated, block: B:345:0x0867  */
        /* JADX WARN: Code duplicated, block: B:348:0x086e  */
        /* JADX WARN: Code duplicated, block: B:422:0x08a8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v136 */
        /* JADX WARN: Type inference failed for: r2v137 */
        /* JADX WARN: Type inference failed for: r2v147 */
        /* JADX WARN: Type inference failed for: r3v46 */
        /* JADX WARN: Type inference failed for: r3v47, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v67, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v68, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v20 */
        /* JADX WARN: Type inference failed for: r8v21, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v25 */
        /* JADX WARN: Type inference failed for: r8v26 */
        /* JADX WARN: Type inference failed for: r8v27, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v36 */
        /* JADX WARN: Type inference failed for: r8v37 */
        /* JADX WARN: Type inference failed for: r8v38 */
        /* JADX WARN: Type inference failed for: r8v39 */
        /* JADX WARN: Type inference failed for: r8v40 */
        /* JADX WARN: Type inference failed for: r8v41 */
        /* JADX WARN: Type inference failed for: r8v42 */
        /* JADX WARN: Type inference failed for: r8v43 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Iterator it;
            File file;
            ArrayList arrayListIconCompatParcelizer;
            Iterator it2;
            File file2;
            List list;
            LinkedHashMap linkedHashMap;
            String str;
            String str2;
            ?? RemoteActionCompatParcelizer;
            ?? arrayList;
            String str3;
            lerpInv lerpinv;
            String str4;
            lookupAndInterpolate lookupandinterpolate;
            String str5;
            int i;
            Object obj2;
            constrainedMap constrainedmap;
            List list2;
            int i2 = 2 % 2;
            int i3 = 3;
            int i4 = 0;
            int i5 = 1;
            LayoutCompatJustificationMode layoutCompatJustificationModeSerializer = null;
            ?? r8 = 0;
            ?? r9 = 0;
            ?? r10 = 0;
            ?? r11 = 0;
            switch (this.serializer) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    LocalAuthDataSource localAuthDataSource = (LocalAuthDataSource) this.read;
                    ReentrantLock reentrantLock = LocalAuthDataSource.read(localAuthDataSource);
                    getTraversalIndexdelegate gettraversalindexdelegate = (getTraversalIndexdelegate) this.RemoteActionCompatParcelizer;
                    reentrantLock.lock();
                    try {
                        LocalAuthDataSource.write(localAuthDataSource).IconCompatParcelizer(gettraversalindexdelegate);
                        Object objWrite = LocalAuthDataSource.IconCompatParcelizer(localAuthDataSource).write();
                        objWrite.getClass();
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) objWrite).edit();
                        resetTransientState resettransientstateRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(localAuthDataSource);
                        resettransientstateRemoteActionCompatParcelizer.getClass();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = getTraversalIndexdelegate.Companion.serializer();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                        editorEdit.putString("LOCAL_AUTH_SHARED_PREF_AUTH_DATA", resettransientstateRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(setgraphicmodalmaxwidthdpSerializer, gettraversalindexdelegate));
                        editorEdit.apply();
                        return createFromParcel.INSTANCE;
                    } finally {
                        reentrantLock.unlock();
                    }
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return BuildersKt.IconCompatParcelizer((getContentViewGroupParentLayout) this.read, null, null, new ExecuteDatabaseRequest$invoke$2(3, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.RemoteActionCompatParcelizer), 3);
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    File file3 = (File) ((Parser.Pair) this.read).RemoteActionCompatParcelizer;
                    file3.mkdirs();
                    StringBuilder sb = new StringBuilder();
                    int i6 = Parser.Pair.read + 1;
                    Parser.Pair.read = i6;
                    sb.append(String.valueOf(i6));
                    sb.append(".mp3");
                    File file4 = new File(file3, sb.toString());
                    InputStream inputStream = (InputStream) this.RemoteActionCompatParcelizer;
                    FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(file4), file4);
                    try {
                        SentryUUID.RemoteActionCompatParcelizer(inputStream, fileOutputStreamWrite);
                        fileOutputStreamWrite.close();
                        return file4;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStreamWrite, th}, sourceInformationContextOfdefault.read());
                            throw th2;
                        }
                    }
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return ((Cipher) this.read).doFinal((byte[]) this.RemoteActionCompatParcelizer);
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Cipher cipher = (Cipher) this.read;
                    byte[] bytes = ((String) this.RemoteActionCompatParcelizer).getBytes(ensureSubscribedToInAppMessageEvents.write);
                    bytes.getClass();
                    return cipher.doFinal(bytes);
                case 5:
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    File fileIconCompatParcelizer = ChatAssetCacheManager.IconCompatParcelizer((ChatAssetCacheManager) this.read, (String) this.RemoteActionCompatParcelizer);
                    File file5 = new File(fileIconCompatParcelizer, "_metadata.json");
                    if (file5.exists()) {
                        try {
                            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = ((ChatAssetCacheManager) this.read).MediaSessionCompatQueueItem;
                            String strWrite = r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(file5, ensureSubscribedToInAppMessageEvents.write);
                            r8lambda3kmch7yklpui_5smgazrgczhglc.getClass();
                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer2 = hasLinkAnnotations.Companion.serializer();
                            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpSerializer2;
                            hasLinkAnnotations haslinkannotations = (hasLinkAnnotations) r8lambda3kmch7yklpui_5smgazrgczhglc.serializer(strWrite, setgraphicmodalmaxwidthdpSerializer2);
                            if (haslinkannotations.status == ChatAssetCacheStatus.READY && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) haslinkannotations.assetsCdnPrefix) && !haslinkannotations.routes.isEmpty()) {
                                int i7 = IconCompatParcelizer + 5;
                                write = i7 % Fields.SpotShadowColor;
                                if (i7 % 2 != 0) {
                                    haslinkannotations.assets.isEmpty();
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                if (!haslinkannotations.assets.isEmpty()) {
                                    List list3 = haslinkannotations.assets;
                                    if (list3 instanceof Collection) {
                                        int i8 = write + 19;
                                        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                                        if (i8 % 2 == 0) {
                                            list3.isEmpty();
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        if (list3.isEmpty()) {
                                            arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(haslinkannotations.routesWithSsg, haslinkannotations.routes);
                                            if (arrayListIconCompatParcelizer.isEmpty()) {
                                                ChatAssetCacheManager chatAssetCacheManager = (ChatAssetCacheManager) this.read;
                                                chatAssetCacheManager.IconCompatParcelizer = ChatAssetCacheManager.read(chatAssetCacheManager, fileIconCompatParcelizer, haslinkannotations);
                                            } else {
                                                it2 = arrayListIconCompatParcelizer.iterator();
                                                while (it2.hasNext()) {
                                                    file2 = new File(fileIconCompatParcelizer, ((subSequence5zctL8) it2.next()).entryArtifactSha256);
                                                    if (file2.exists() || !file2.isFile()) {
                                                    }
                                                }
                                                ChatAssetCacheManager chatAssetCacheManager2 = (ChatAssetCacheManager) this.read;
                                                chatAssetCacheManager2.IconCompatParcelizer = ChatAssetCacheManager.read(chatAssetCacheManager2, fileIconCompatParcelizer, haslinkannotations);
                                            }
                                        } else {
                                            it = list3.iterator();
                                            while (it.hasNext()) {
                                                file = new File(fileIconCompatParcelizer, ((getUrlAnnotations) it.next()).localFileName);
                                                if (file.exists() || !file.isFile()) {
                                                }
                                            }
                                            arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(haslinkannotations.routesWithSsg, haslinkannotations.routes);
                                            if (arrayListIconCompatParcelizer.isEmpty()) {
                                                ChatAssetCacheManager chatAssetCacheManager3 = (ChatAssetCacheManager) this.read;
                                                chatAssetCacheManager3.IconCompatParcelizer = ChatAssetCacheManager.read(chatAssetCacheManager3, fileIconCompatParcelizer, haslinkannotations);
                                            } else {
                                                it2 = arrayListIconCompatParcelizer.iterator();
                                                while (it2.hasNext()) {
                                                    file2 = new File(fileIconCompatParcelizer, ((subSequence5zctL8) it2.next()).entryArtifactSha256);
                                                    if (file2.exists()) {
                                                    }
                                                }
                                                ChatAssetCacheManager chatAssetCacheManager4 = (ChatAssetCacheManager) this.read;
                                                chatAssetCacheManager4.IconCompatParcelizer = ChatAssetCacheManager.read(chatAssetCacheManager4, fileIconCompatParcelizer, haslinkannotations);
                                            }
                                        }
                                    } else {
                                        it = list3.iterator();
                                        while (it.hasNext()) {
                                            file = new File(fileIconCompatParcelizer, ((getUrlAnnotations) it.next()).localFileName);
                                            if (file.exists()) {
                                            }
                                        }
                                        arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(haslinkannotations.routesWithSsg, haslinkannotations.routes);
                                        if (arrayListIconCompatParcelizer.isEmpty()) {
                                            ChatAssetCacheManager chatAssetCacheManager5 = (ChatAssetCacheManager) this.read;
                                            chatAssetCacheManager5.IconCompatParcelizer = ChatAssetCacheManager.read(chatAssetCacheManager5, fileIconCompatParcelizer, haslinkannotations);
                                        } else {
                                            it2 = arrayListIconCompatParcelizer.iterator();
                                            while (it2.hasNext()) {
                                                file2 = new File(fileIconCompatParcelizer, ((subSequence5zctL8) it2.next()).entryArtifactSha256);
                                                if (file2.exists()) {
                                                }
                                            }
                                            ChatAssetCacheManager chatAssetCacheManager6 = (ChatAssetCacheManager) this.read;
                                            chatAssetCacheManager6.IconCompatParcelizer = ChatAssetCacheManager.read(chatAssetCacheManager6, fileIconCompatParcelizer, haslinkannotations);
                                        }
                                    }
                                }
                            }
                        } catch (IOException e) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to read chat asset cache metadata during activation", new Object[0]);
                        } catch (SerializationException e2) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Failed to parse chat asset cache metadata during activation", new Object[0]);
                        } catch (IllegalArgumentException e3) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e3, "Failed to parse chat asset cache metadata during activation", new Object[0]);
                        } catch (Exception e4) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e4, "Failed to parse chat asset cache metadata during activation", new Object[0]);
                        }
                    }
                    return createfromparcel;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    File[] fileArrListFiles = new File(((ChatAssetCacheManager) this.read).write.getFilesDir(), "customer-chat-assets").listFiles();
                    if (fileArrListFiles == null) {
                        return null;
                    }
                    Set set = (Set) this.RemoteActionCompatParcelizer;
                    ArrayList<File> arrayList2 = new ArrayList();
                    int length = fileArrListFiles.length;
                    while (i4 < length) {
                        File file6 = fileArrListFiles[i4];
                        if (file6.isDirectory() && !set.contains(file6.getName())) {
                            arrayList2.add(file6);
                        }
                        i4++;
                    }
                    for (File file7 : arrayList2) {
                        int i9 = write + 59;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        file7.getClass();
                        r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.IconCompatParcelizer(file7);
                    }
                    return createFromParcel.INSTANCE;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Cursor cursorQuery = ((Application) ((SignInDataStore) this.read).serializer).getContentResolver().query((Uri) this.RemoteActionCompatParcelizer, null, null, null, null);
                    if (cursorQuery == null) {
                        return null;
                    }
                    try {
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        Long l = (columnIndex == -1 || !cursorQuery.moveToFirst()) ? null : new Long(cursorQuery.getLong(columnIndex));
                        cursorQuery.close();
                        return l;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorQuery, th3}, sourceInformationContextOfdefault.read());
                            throw th4;
                        }
                    }
                case 8:
                    getTextSubstitution gettextsubstitution = (getTextSubstitution) this.read;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    boolean z = gettextsubstitution instanceof getTextEntryKey;
                    MutableStateFlow mutableStateFlow = ((paintRPmYEkkdefault) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
                    if (z) {
                        mutableStateFlow.IconCompatParcelizer(((getTextEntryKey) gettextsubstitution).read);
                    } else {
                        mutableStateFlow.IconCompatParcelizer(null);
                    }
                    return createFromParcel.INSTANCE;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    WebView webView = ((getHasStaleResolvedFonts) this.read).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    if (webView != null) {
                        webView.evaluateJavascript("window.sendBridgeMessageFromAndroid(" + ((String) this.RemoteActionCompatParcelizer) + ")", null);
                    }
                    return createFromParcel.INSTANCE;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = ((WebChatViewModel) this.read).MediaMetadataCompat;
                    String str6 = (String) this.RemoteActionCompatParcelizer;
                    mediaBrowserCompatMediaItem.getClass();
                    return (updateOffsetsLDcG7Xg) setWindowOffsetgyyYBs.write().serializer(str6, getParagraphStylesOrNullui_text.RemoteActionCompatParcelizer);
                case 11:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read).invoke((getParagraph) this.RemoteActionCompatParcelizer);
                    return createFromParcel.INSTANCE;
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (((getParagraph) this.read).RemoteActionCompatParcelizer != null) {
                        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.RemoteActionCompatParcelizer).invoke();
                    }
                    return createFromParcel.INSTANCE;
                case 13:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    copyNs73l9sdefault copyns73l9sdefault = (copyNs73l9sdefault) this.read;
                    if (copyns73l9sdefault == null || (list = copyns73l9sdefault.trackingEvents) == null) {
                        return null;
                    }
                    int i11 = write + 61;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    TextMotionLinearitySaverlambda0 textMotionLinearitySaverlambda0 = (TextMotionLinearitySaverlambda0) this.RemoteActionCompatParcelizer;
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        textMotionLinearitySaverlambda0.IconCompatParcelizer.serializer((TrackingEvent) it3.next());
                    }
                    return createFromParcel.INSTANCE;
                case 14:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (((Boolean) ((PopulateViewStructure_androidKtpopulate7) this.RemoteActionCompatParcelizer).getValue()).booleanValue()) {
                        DeliveryAutoAcceptUiModelImpl deliveryAutoAcceptUiModelImpl = (DeliveryAutoAcceptUiModelImpl) this.read;
                        getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi = deliveryAutoAcceptUiModelImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout = deliveryAutoAcceptUiModelImpl.write;
                        getkeyboardtap5zf0vsi.serializer();
                        ShortNewsContentCardView shortNewsContentCardView = null;
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new DiskLruCache$launchCleanup$1(deliveryAutoAcceptUiModelImpl, shortNewsContentCardView, 23), 3);
                        if (((FirebaseRemoteConfigImpl) deliveryAutoAcceptUiModelImpl.MediaSessionCompatQueueItem.write).IconCompatParcelizer(updateAdidI.IS_FOREGROUND_SOUND_AUTO_STOP_ENABLED)) {
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ClearDataUseCaseImpl$invoke$2(deliveryAutoAcceptUiModelImpl, shortNewsContentCardView, 14), 3).IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new BarcodeAnalyzer$$ExternalSyntheticLambda0(9, deliveryAutoAcceptUiModelImpl));
                        } else {
                            deliveryAutoAcceptUiModelImpl.PlaybackStateCompat.write();
                        }
                    }
                    return createFromParcel.INSTANCE;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    copyHL5avdYdefault copyhl5avdydefault = ((copyCXVQc50default) this.read).data;
                    if (copyhl5avdydefault == null || (list2 = copyhl5avdydefault.components) == null) {
                        linkedHashMap = null;
                    } else {
                        List list4 = list2;
                        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list4, 10));
                        if (iRemoteActionCompatParcelizer < 16) {
                            iRemoteActionCompatParcelizer = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                        for (Object obj5 : list4) {
                            linkedHashMap.put(displayInAppMessagelambda1.serializer(((accessgetCurrentlyFocusedRect) obj5).getClass()), obj5);
                        }
                    }
                    accessgetCurrentlyFocusedRect accessgetcurrentlyfocusedrect = linkedHashMap != null ? (accessgetCurrentlyFocusedRect) linkedHashMap.get(displayInAppMessagelambda1.serializer(BringIntoViewNoderequester111.class)) : null;
                    BringIntoViewNoderequester111 bringIntoViewNoderequester111 = accessgetcurrentlyfocusedrect instanceof BringIntoViewNoderequester111 ? (BringIntoViewNoderequester111) accessgetcurrentlyfocusedrect : null;
                    accessgetCurrentlyFocusedRect accessgetcurrentlyfocusedrect2 = linkedHashMap != null ? (accessgetCurrentlyFocusedRect) linkedHashMap.get(displayInAppMessagelambda1.serializer(FocusTargetPropertiesNode.class)) : null;
                    FocusTargetPropertiesNode focusTargetPropertiesNode = accessgetcurrentlyfocusedrect2 instanceof FocusTargetPropertiesNode ? (FocusTargetPropertiesNode) accessgetcurrentlyfocusedrect2 : null;
                    accessgetCurrentlyFocusedRect accessgetcurrentlyfocusedrect3 = linkedHashMap != null ? (accessgetCurrentlyFocusedRect) linkedHashMap.get(displayInAppMessagelambda1.serializer(ViewFactoryHolderregisterSaveStateProvider1.class)) : null;
                    ViewFactoryHolderregisterSaveStateProvider1 viewFactoryHolderregisterSaveStateProvider1 = accessgetcurrentlyfocusedrect3 instanceof ViewFactoryHolderregisterSaveStateProvider1 ? (ViewFactoryHolderregisterSaveStateProvider1) accessgetcurrentlyfocusedrect3 : null;
                    accessgetCurrentlyFocusedRect accessgetcurrentlyfocusedrect4 = linkedHashMap != null ? (accessgetCurrentlyFocusedRect) linkedHashMap.get(displayInAppMessagelambda1.serializer(setUpdateBlock.class)) : null;
                    setUpdateBlock setupdateblock = accessgetcurrentlyfocusedrect4 instanceof setUpdateBlock ? (setUpdateBlock) accessgetcurrentlyfocusedrect4 : null;
                    FocusTargetInteropNoderetrievePinnableContainer1 focusTargetInteropNoderetrievePinnableContainer1 = focusTargetPropertiesNode != null ? focusTargetPropertiesNode.overview : null;
                    isIncluded isincluded = (isIncluded) this.RemoteActionCompatParcelizer;
                    if (focusTargetInteropNoderetrievePinnableContainer1 != null) {
                        int i13 = IconCompatParcelizer + 117;
                        write = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        zzz zzzVar = isincluded.read;
                        FocusTargetInteropNoderetrievePinnableContainer1 focusTargetInteropNoderetrievePinnableContainer2 = focusTargetPropertiesNode.overview;
                        access500 access500Var = (access500) zzzVar.serializer;
                        constrainedMap constrainedmap2 = (constrainedMap) access500Var.RatingCompat;
                        constrainedMap constrainedmap3 = (constrainedMap) access500Var.serializer;
                        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                        focusTargetInteropNoderetrievePinnableContainer2.getClass();
                        accessunregisterSaveStateProvider accessunregistersavestateprovider = focusTargetInteropNoderetrievePinnableContainer2.secondary;
                        String str7 = focusTargetInteropNoderetrievePinnableContainer2.primary;
                        if (str7 != null || focusTargetInteropNoderetrievePinnableContainer2.paidDistance != null || accessunregistersavestateprovider != null || focusTargetInteropNoderetrievePinnableContainer2.title != null || setupdateblock != null) {
                            PopupTestTag popupTestTag = focusTargetInteropNoderetrievePinnableContainer2.promoBonus;
                            if (accessunregistersavestateprovider != null) {
                                List list5 = accessunregistersavestateprovider.icons;
                                if (list5 != null) {
                                    List list6 = list5;
                                    RemoteActionCompatParcelizer = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                                    Iterator it4 = list6.iterator();
                                    while (it4.hasNext()) {
                                        int i15 = getParagraphStart.read[((StateV3$AcceptData$BoostedEarningsIcons) it4.next()).ordinal()];
                                        if (i15 == 1) {
                                            constrainedmap = constrainedmap2;
                                        } else if (i15 == 2) {
                                            constrainedmap = constrainedmap3;
                                        } else if (i15 == i3) {
                                            constrainedmap = (constrainedMap) access500Var.IconCompatParcelizer;
                                        } else {
                                            if (i15 != 4) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                return null;
                                            }
                                            constrainedmap = (constrainedMap) access500Var.MediaDescriptionCompat;
                                        }
                                        RemoteActionCompatParcelizer.add(constrainedmap);
                                        i3 = 3;
                                    }
                                } else {
                                    Boolean bool = accessunregistersavestateprovider.includesBoost;
                                    Boolean bool2 = Boolean.TRUE;
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, bool2}, getCieXyz.write())).booleanValue()) {
                                        constrainedmap3 = null;
                                    }
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessunregistersavestateprovider.includesTip, bool2}, getCieXyz.write())).booleanValue()) {
                                        constrainedmap2 = null;
                                    }
                                    RemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new constrainedMap[]{constrainedmap3, constrainedmap2});
                                }
                            } else {
                                RemoteActionCompatParcelizer = instance_delegatelambda0Var;
                            }
                            if (popupTestTag == null) {
                                arrayList = instance_delegatelambda0Var;
                            } else {
                                List list7 = popupTestTag.icons;
                                if (list7 != null) {
                                    List list8 = list7;
                                    arrayList = new ArrayList(accessgetInstancedelegatecp.write(list8, 10));
                                    Iterator it5 = list8.iterator();
                                    while (it5.hasNext()) {
                                        int i16 = IconCompatParcelizer + 47;
                                        write = i16 % Fields.SpotShadowColor;
                                        if (i16 % 2 == 0 ? (i = getParagraphStart.IconCompatParcelizer[((StateV3$AcceptData$PromoBonusIcon) it5.next()).ordinal()]) == 1 : (i = getParagraphStart.IconCompatParcelizer[((StateV3$AcceptData$PromoBonusIcon) it5.next()).ordinal()]) == 1) {
                                            obj2 = access500Var.write;
                                        } else if (i == 2) {
                                            obj2 = access500Var.MediaSessionCompatQueueItem;
                                        } else if (i == 3) {
                                            obj2 = access500Var.read;
                                        } else if (i == 4) {
                                            obj2 = access500Var.MediaMetadataCompat;
                                        } else {
                                            if (i != 5) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                return null;
                                            }
                                            int i17 = IconCompatParcelizer + 111;
                                            write = i17 % Fields.SpotShadowColor;
                                            int i18 = i17 % 2;
                                            obj2 = access500Var.RemoteActionCompatParcelizer;
                                        }
                                        arrayList.add((constrainedMap) obj2);
                                    }
                                } else {
                                    arrayList = 0;
                                }
                                if (arrayList == 0) {
                                    arrayList = instance_delegatelambda0Var;
                                }
                            }
                            String str8 = focusTargetInteropNoderetrievePinnableContainer2.title;
                            String str9 = focusTargetInteropNoderetrievePinnableContainer2.paidDistance;
                            MathUtils mathUtils = new MathUtils(str7);
                            if (RemoteActionCompatParcelizer.isEmpty()) {
                                String str10 = accessunregistersavestateprovider != null ? accessunregistersavestateprovider.text : null;
                                if (str10 == null || str10.length() == 0) {
                                    lerpinv = null;
                                } else {
                                    r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq = removeNodeAtDepth.read((Iterable) RemoteActionCompatParcelizer);
                                    if (accessunregistersavestateprovider != null) {
                                        str3 = accessunregistersavestateprovider.text;
                                    } else {
                                        str3 = null;
                                    }
                                    lerpinv = new lerpInv(str3, r8lambdaiidsddyirtymdul5lt6pmt2zysq);
                                }
                            } else {
                                r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = removeNodeAtDepth.read((Iterable) RemoteActionCompatParcelizer);
                                if (accessunregistersavestateprovider != null) {
                                    str3 = accessunregistersavestateprovider.text;
                                } else {
                                    str3 = null;
                                }
                                lerpinv = new lerpInv(str3, r8lambdaiidsddyirtymdul5lt6pmt2zysq2);
                            }
                            if (arrayList.isEmpty()) {
                                if (popupTestTag != null) {
                                    int i19 = IconCompatParcelizer + 95;
                                    write = i19 % Fields.SpotShadowColor;
                                    int i20 = i19 % 2;
                                    str5 = popupTestTag.text;
                                } else {
                                    str5 = null;
                                }
                                if (str5 == null || str5.length() == 0) {
                                    lookupandinterpolate = null;
                                } else {
                                    r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq3 = removeNodeAtDepth.read((Iterable) arrayList);
                                    if (popupTestTag != null) {
                                        str4 = popupTestTag.text;
                                    } else {
                                        str4 = null;
                                    }
                                    lookupandinterpolate = new lookupAndInterpolate(str4, r8lambdaiidsddyirtymdul5lt6pmt2zysq3);
                                }
                            } else {
                                r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq4 = removeNodeAtDepth.read((Iterable) arrayList);
                                if (popupTestTag != null) {
                                    str4 = popupTestTag.text;
                                } else {
                                    str4 = null;
                                }
                                lookupandinterpolate = new lookupAndInterpolate(str4, r8lambdaiidsddyirtymdul5lt6pmt2zysq4);
                            }
                            layoutCompatJustificationModeSerializer = new LayoutCompatJustificationMode(str8, str9, mathUtils, lerpinv, lookupandinterpolate, setupdateblock != null ? new getDEFAULT_LAYOUT_ALIGNMENTui_text(setupdateblock.multiplier, setupdateblock.text) : null, instance_delegatelambda0Var, null, null, 768);
                        }
                    } else {
                        layoutCompatJustificationModeSerializer = isincluded.serializer.serializer(bringIntoViewNoderequester111, setupdateblock, null);
                    }
                    setExitSharedElementCallback setexitsharedelementcallback = (viewFactoryHolderregisterSaveStateProvider1 == null || (str2 = viewFactoryHolderregisterSaveStateProvider1.image) == null || !str2.equalsIgnoreCase("stacked")) ? new setExitSharedElementCallback(R.drawable.ic_single_order_illustration) : new setExitSharedElementCallback(R.drawable.ic_stacked_order_illustration);
                    if (viewFactoryHolderregisterSaveStateProvider1 == null || (str = viewFactoryHolderregisterSaveStateProvider1.title) == null) {
                        str = "";
                    }
                    return new getWordDRrd7Zo(setexitsharedelementcallback, str, layoutCompatJustificationModeSerializer);
                case 16:
                    backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.read;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch.read(((RecentLastStopsDatastoreImpl) this.RemoteActionCompatParcelizer).serializer);
                    return createFromParcel.INSTANCE;
                case 17:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl = (LastStopSelectionBottomSheetUiModelImpl) this.read;
                    isOpaque isopaque = (isOpaque) this.RemoteActionCompatParcelizer;
                    lastStopSelectionBottomSheetUiModelImpl.getClass();
                    r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = isopaque.MediaMetadataCompat;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                        Trigger.Companion companion = Trigger.Companion;
                        String str11 = ((TrackingEvent) obj6).trigger;
                        companion.getClass();
                        if (Trigger.Companion.write(str11) == Trigger.BUTTON_CLICK) {
                            arrayList3.add(obj6);
                        }
                    }
                    DeliveryAcceptanceLogger deliveryAcceptanceLogger = lastStopSelectionBottomSheetUiModelImpl.read;
                    Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        deliveryAcceptanceLogger.serializer((TrackingEvent) it6.next());
                    }
                    return createFromParcel.INSTANCE;
                case 18:
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) this.read;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getEndOffsetForRectWithinRun getendoffsetforrectwithinrun = (getEndOffsetForRectWithinRun) this.RemoteActionCompatParcelizer;
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new LastStopMapPinUiModelImpl$1$1$1$1(getendoffsetforrectwithinrun, r9 == true ? 1 : 0, i4), 3);
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new LastStopMapPinUiModelImpl$1$1$1$1(getendoffsetforrectwithinrun, r8 == true ? 1 : 0, i5), 3);
                    return createFromParcel.INSTANCE;
                case 19:
                    getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) this.read;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
                    backwardfocussearchIconCompatParcelizer.read(((ShadowSpan) this.RemoteActionCompatParcelizer).serializer);
                    return backwardfocussearchIconCompatParcelizer;
                case 20:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    DeliveryAcceptanceLogger deliveryAcceptanceLogger2 = (DeliveryAcceptanceLogger) this.read;
                    Map mapSerializer = ((StateV3AnalyticsProviderImpl) deliveryAcceptanceLogger2.MediaSessionCompatQueueItem).serializer();
                    TrackingEvent trackingEvent = (TrackingEvent) this.RemoteActionCompatParcelizer;
                    safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
                    safesetcliptooutline.putAll(onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0("is_device_locked", String.valueOf(deliveryAcceptanceLogger2.write.IconCompatParcelizer.isKeyguardLocked()))));
                    safesetcliptooutline.putAll(FontMuC2MFsdefault.RemoteActionCompatParcelizer(trackingEvent.parameters));
                    safesetcliptooutline.putAll(deliveryAcceptanceLogger2.read.read());
                    deliveryAcceptanceLogger2.serializer.logEvent(trackingEvent.name, onMove.RemoteActionCompatParcelizer(safesetcliptooutline.IconCompatParcelizer(), mapSerializer));
                    return createFromParcel.INSTANCE;
                case 21:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (((Number) ((getVonKries) this.RemoteActionCompatParcelizer).getValue()).floatValue() == 1.0f) {
                        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read).invoke();
                    }
                    return createFromParcel.INSTANCE;
                case 22:
                    s3 s3Var = (s3) this.read;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    DestinationAddressUiModelImpl destinationAddressUiModelImpl = (DestinationAddressUiModelImpl) this.RemoteActionCompatParcelizer;
                    destinationAddressUiModelImpl.read.IconCompatParcelizer(Boolean.valueOf(!(s3Var instanceof s8ExternalSyntheticLambda0)));
                    destinationAddressUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(s3Var);
                    return createFromParcel.INSTANCE;
                case 23:
                    backwardFocusSearch backwardfocussearch2 = (backwardFocusSearch) this.read;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch2.write(((CrowdSourcingDataStore) this.RemoteActionCompatParcelizer).MediaMetadataCompat, Boolean.TRUE);
                    return createFromParcel.INSTANCE;
                case 24:
                    getUriPjHm6EE geturipjhm6ee = (getUriPjHm6EE) this.read;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl = (CrowdSourcingFloatingImageButtonUiModelImpl) this.RemoteActionCompatParcelizer;
                    copyYTHSh70default copyythsh70default = (copyYTHSh70default) crowdSourcingFloatingImageButtonUiModelImpl.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read();
                    copyYTHSh70default copyythsh70defaultIconCompatParcelizer = geturipjhm6ee.IconCompatParcelizer();
                    ?? r2 = (geturipjhm6ee instanceof MathUtilsKt) && ((MathUtilsKt) geturipjhm6ee).RemoteActionCompatParcelizer && (copyythsh70default instanceof getHintLocales) && (copyythsh70defaultIconCompatParcelizer instanceof copyuxg59PA);
                    crowdSourcingFloatingImageButtonUiModelImpl.read.IconCompatParcelizer(Boolean.valueOf(copyythsh70defaultIconCompatParcelizer instanceof copyYTHSh70));
                    MutableStateFlow mutableStateFlow2 = crowdSourcingFloatingImageButtonUiModelImpl.IconCompatParcelizer;
                    if (r2 == true) {
                        mutableStateFlow2.IconCompatParcelizer(copyuxg59PA.write((copyuxg59PA) copyythsh70defaultIconCompatParcelizer, false, true, 127));
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = crowdSourcingFloatingImageButtonUiModelImpl.MediaMetadataCompat;
                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                            int i21 = IconCompatParcelizer + 79;
                            write = i21 % Fields.SpotShadowColor;
                            if (i21 % 2 != 0) {
                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                                (r11 == true ? 1 : 0).hashCode();
                                throw null;
                            }
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                        }
                        ContextScope contextScope = crowdSourcingFloatingImageButtonUiModelImpl.MediaBrowserCompatMediaItem;
                        ((inCompatibilityMode) crowdSourcingFloatingImageButtonUiModelImpl.ParcelableVolumeInfo).getClass();
                        crowdSourcingFloatingImageButtonUiModelImpl.MediaMetadataCompat = BuildersKt.RemoteActionCompatParcelizer(contextScope, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, null, new CrowdSourcingFloatingImageButtonUiModelImpl.AnonymousClass1(crowdSourcingFloatingImageButtonUiModelImpl, r10 == true ? 1 : 0, i3), 2);
                    } else {
                        mutableStateFlow2.IconCompatParcelizer(copyythsh70defaultIconCompatParcelizer);
                    }
                    crowdSourcingFloatingImageButtonUiModelImpl.write.IconCompatParcelizer(NullableInputConnectionWrapperApi21.RemoteActionCompatParcelizer);
                    return createFromParcel.INSTANCE;
                case 25:
                    copyYTHSh70default copyythsh70default2 = (copyYTHSh70default) this.read;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl = (CrowdSourcingFloatingImageCameraOnlyUiModelImpl) this.RemoteActionCompatParcelizer;
                    crowdSourcingFloatingImageCameraOnlyUiModelImpl.serializer.IconCompatParcelizer(Boolean.valueOf(copyythsh70default2 instanceof copyYTHSh70));
                    crowdSourcingFloatingImageCameraOnlyUiModelImpl.write.IconCompatParcelizer(copyythsh70default2);
                    return createFromParcel.INSTANCE;
                case 26:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (((dashPathEffectdefault) ((PopulateViewStructure_androidKtpopulate7) this.RemoteActionCompatParcelizer).getValue()) instanceof AsyncImagePainter$State$Error) {
                        int i22 = IconCompatParcelizer + 49;
                        write = i22 % Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read).invoke();
                    }
                    return createFromParcel.INSTANCE;
                case 27:
                    getUnspecifiedIUNYP9kannotations getunspecifiediunyp9kannotations = (getUnspecifiedIUNYP9kannotations) this.read;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    sendSynthesizedKeyEvent sendsynthesizedkeyevent = (sendSynthesizedKeyEvent) this.RemoteActionCompatParcelizer;
                    sendsynthesizedkeyevent.write.IconCompatParcelizer(getunspecifiediunyp9kannotations);
                    sendsynthesizedkeyevent.read.IconCompatParcelizer(Boolean.valueOf(!(getunspecifiediunyp9kannotations instanceof getNoneIUNYP9kannotations)));
                    return createFromParcel.INSTANCE;
                case 28:
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) this.read;
                    isverticalswipeinalloweddirection.getClass();
                    r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k = new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k(onMove.RemoteActionCompatParcelizer((r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) this.RemoteActionCompatParcelizer, (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) isverticalswipeinalloweddirection.IconCompatParcelizer(SetComposingRegionCommand.Companion.serializer(), setComposingRegionCommand)));
                    r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE r8lambdaz90zxc5cr3ctjy9kwemhzodg3le = RequestBody.Companion;
                    String strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k.Companion.serializer(), r8lambdaerwhggzq_gqgn8cultnvrcshm8k);
                    getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
                    InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = SQLite.write(ConstantKt.CONTENT_TYPE_JSON);
                    r8lambdaz90zxc5cr3ctjy9kwemhzodg3le.getClass();
                    return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(strRemoteActionCompatParcelizer, inAppMessageHtmlBaseViewWrite);
                default:
                    TextInputServiceAndroidonImeActionPerformed1 textInputServiceAndroidonImeActionPerformed1 = (TextInputServiceAndroidonImeActionPerformed1) this.read;
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    DeliveryNotesLinkUiModelImpl deliveryNotesLinkUiModelImpl = (DeliveryNotesLinkUiModelImpl) this.RemoteActionCompatParcelizer;
                    deliveryNotesLinkUiModelImpl.read.IconCompatParcelizer(textInputServiceAndroidonImeActionPerformed1);
                    deliveryNotesLinkUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(textInputServiceAndroidonImeActionPerformed1 instanceof TextInputServiceAndroidstopInput2));
                    return createFromParcel.INSTANCE;
            }
        }
    }

    private static String $$c(byte b, int i, byte b2) {
        int i2 = 4 - (b * 3);
        int i3 = (b2 * 2) + 98;
        int i4 = i * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (-i2) + i3;
            i2++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i3;
            i5 = i6;
            i3 = (-bArr[i2]) + i7;
            i2++;
        }
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i2 | i7;
        int i9 = ~i6;
        int i10 = ~((~i2) | i7);
        int i11 = i3 + i6 + i5 + (1977613057 * i) + (454551927 * i4);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i3) + 473956352 + (953991674 * i6) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i5) + ((-981467136) * i) + ((-830472192) * i4) + ((-499122176) * i12);
        int i14 = (i3 * (-1131120504)) + 246467939 + (i6 * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i5 * (-1131119791)) + (i * (-1039407535)) + (i4 * 1820920743) + (i12 * 1447034880);
        return i13 + ((i14 * i14) * 1170210816) != 1 ? RemoteActionCompatParcelizer(objArr) : serializer(objArr);
    }

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public LocalAuthDataSource(@r8lambdamLxa7_TFGnM6hfQl7rqXrlU6VHg Lazy lazy, SemanticsPropertiesIsPopup1 semanticsPropertiesIsPopup1, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        lazy.getClass();
        semanticsPropertiesIsPopup1.getClass();
        isopeninternalroom_runtime.getClass();
        this.MediaSessionCompatQueueItem = lazy;
        this.RemoteActionCompatParcelizer = semanticsPropertiesIsPopup1;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
        this.serializer = new isAdapterPositionOnScreen(new StateV3$$ExternalSyntheticLambda0(7));
        this.write = new ReentrantLock();
        this.read = StateFlowKt.read(null);
    }

    private static void b(int i, int i2, char c, Object[] objArr) throws Throwable {
        rememberNestedScrollInteropConnection remembernestedscrollinteropconnection = new rememberNestedScrollInteropConnection();
        long[] jArr = new long[i];
        remembernestedscrollinteropconnection.read = 0;
        while (remembernestedscrollinteropconnection.read < i) {
            int i3 = remembernestedscrollinteropconnection.read;
            try {
                Object[] objArr2 = {Integer.valueOf(MediaDescriptionCompat[i2 + i3])};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1215525465);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (Process.getGidForName("") + 50818), 2087 - (ViewConfiguration.getEdgeSlop() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13, -1734126664, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(MediaMetadataCompat), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2040246764);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ExpandableListView.getPackedPositionGroup(0L), View.resolveSize(0, 0) + 197, 14 - TextUtils.lastIndexOf("", '0', 0), 1454665717, false, "c", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (6915 - KeyEvent.normalizeMetaState(0)), 158 - TextUtils.lastIndexOf("", '0'), 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -677165021, false, Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        remembernestedscrollinteropconnection.read = 0;
        while (remembernestedscrollinteropconnection.read < i) {
            cArr[remembernestedscrollinteropconnection.read] = (char) jArr[remembernestedscrollinteropconnection.read];
            Object[] objArr5 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6915), Color.red(0) + 159, 17 - TextUtils.indexOf("", ""), -677165021, false, Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0665 A[Catch: all -> 0x06a5, TryCatch #1 {all -> 0x06a5, blocks: (B:95:0x0651, B:110:0x0681, B:103:0x065e, B:105:0x0665, B:106:0x0666, B:109:0x066d, B:111:0x068c), top: B:357:0x0651 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0666 A[Catch: all -> 0x06a5, TryCatch #1 {all -> 0x06a5, blocks: (B:95:0x0651, B:110:0x0681, B:103:0x065e, B:105:0x0665, B:106:0x0666, B:109:0x066d, B:111:0x068c), top: B:357:0x0651 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x0957 A[Catch: all -> 0x0cef, TryCatch #10 {all -> 0x0cef, blocks: (B:176:0x091d, B:177:0x0920, B:200:0x0950, B:202:0x0957, B:203:0x0958, B:206:0x0963, B:207:0x0985, B:212:0x09bf, B:214:0x09e4, B:215:0x0a07, B:220:0x0a41, B:221:0x0a64, B:222:0x0a78, B:227:0x0ab2, B:228:0x0ad5, B:234:0x0b20, B:235:0x0b32, B:238:0x0b3d, B:242:0x0b80, B:243:0x0bbf, B:244:0x0be0, B:247:0x0c26, B:251:0x0c42, B:252:0x0c55, B:253:0x0c71, B:258:0x0cad, B:259:0x0cc3, B:260:0x0cc4, B:263:0x0cdc), top: B:373:0x091d }] */
    /* JADX WARN: Code duplicated, block: B:203:0x0958 A[Catch: all -> 0x0cef, TryCatch #10 {all -> 0x0cef, blocks: (B:176:0x091d, B:177:0x0920, B:200:0x0950, B:202:0x0957, B:203:0x0958, B:206:0x0963, B:207:0x0985, B:212:0x09bf, B:214:0x09e4, B:215:0x0a07, B:220:0x0a41, B:221:0x0a64, B:222:0x0a78, B:227:0x0ab2, B:228:0x0ad5, B:234:0x0b20, B:235:0x0b32, B:238:0x0b3d, B:242:0x0b80, B:243:0x0bbf, B:244:0x0be0, B:247:0x0c26, B:251:0x0c42, B:252:0x0c55, B:253:0x0c71, B:258:0x0cad, B:259:0x0cc3, B:260:0x0cc4, B:263:0x0cdc), top: B:373:0x091d }] */
    /* JADX WARN: Code duplicated, block: B:339:0x0f5d  */
    /* JADX WARN: Code duplicated, block: B:343:0x0f65  */
    /* JADX WARN: Code duplicated, block: B:345:0x0f69  */
    /* JADX WARN: Code duplicated, block: B:347:0x0f6d  */
    /* JADX WARN: Code duplicated, block: B:518:0x0f79 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0f79 A[SYNTHETIC] */
    private static /* synthetic */ Object serializer(Object[] objArr) throws Throwable {
        Throwable th;
        int i;
        Object obj;
        Throwable th2;
        Throwable cause;
        int i2;
        int i3;
        Throwable th3;
        Throwable th4;
        Throwable cause2;
        int i4;
        int i5;
        int i6;
        char c = 0;
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault((LocalAuthDataSource) objArr[0]);
        try {
            byte[] bArr = ParcelableVolumeInfo;
            Object[] objArr2 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b = bArr[551];
            Object[] objArr3 = new Object[1];
            a(b, b, (short) 852, objArr3);
            int iIntValue = (((Integer) cls.getMethod((String) objArr3[0], null).invoke(null, null)).intValue() >> 16) + 1005;
            Object[] objArr4 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a(bArr[551], bArr[170], (short) 288, objArr5);
            int i7 = 1078 - (((Float) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1));
            Object[] objArr6 = new Object[1];
            a(bArr[108], bArr[78], bArr[100], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[33], bArr[235], (short) 532, objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, i7, (char) (61409 - (((Long) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = {0};
            Object[] objArr10 = new Object[1];
            a(bArr[108], bArr[20], (short) 304, objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[551], bArr[31], (short) 905, objArr11);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, objArr9)).intValue() + 1;
            Object[] objArr12 = new Object[1];
            a(bArr[108], bArr[78], bArr[14], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            byte b2 = bArr[551];
            byte b3 = bArr[48];
            Object[] objArr13 = new Object[1];
            a(b2, b3, (short) (b3 | 900), objArr13);
            String str2 = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr14);
            int iIntValue3 = ((Integer) cls5.getMethod(str2, Class.forName((String) objArr14[0]), Integer.TYPE).invoke(null, "", 0)).intValue() + 122;
            Object[] objArr15 = {0, 0};
            Object[] objArr16 = new Object[1];
            a(bArr[108], bArr[170], (short) 551, objArr16);
            Class<?> cls6 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(bArr[551], bArr[48], (short) 924, objArr17);
            Object[] objArr18 = new Object[1];
            b(iIntValue2, iIntValue3, (char) ((Integer) cls6.getMethod((String) objArr17[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr15)).intValue(), objArr18);
            Object[] objArr19 = {(String) objArr18[0]};
            byte b4 = bArr[792];
            char c2 = 271;
            byte b5 = bArr[271];
            Object[] objArr20 = new Object[1];
            a(b4, b5, (short) (b5 | 178), objArr20);
            Class<?> cls7 = Class.forName((String) objArr20[0]);
            byte b6 = (byte) PlaybackStateCompat;
            byte b7 = bArr[0];
            Object[] objArr21 = new Object[1];
            a(b6, b7, (short) (b7 | 204), objArr21);
            String str3 = (String) objArr21[0];
            byte b8 = bArr[792];
            byte b9 = bArr[271];
            Object[] objArr22 = new Object[1];
            a(b8, b9, (short) (b9 | 178), objArr22);
            Object[] objArr23 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr22[0])).invoke(str, objArr19);
            int[] iArr = new int[objArr23.length];
            int i8 = 0;
            while (i8 < objArr23.length) {
                Object[] objArr24 = {objArr23[i8]};
                byte[] bArr2 = ParcelableVolumeInfo;
                short s = (short) 210;
                Object[] objArr25 = new Object[1];
                a(bArr2[792], bArr2[170], s, objArr25);
                Class<?> cls8 = Class.forName((String) objArr25[c]);
                Object[] objArr26 = new Object[1];
                a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr26);
                String str4 = (String) objArr26[c];
                byte b10 = bArr2[792];
                byte b11 = bArr2[c2];
                Object[] objArr27 = new Object[1];
                a(b10, b11, (short) (b11 | 178), objArr27);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr27[0])).invoke(null, objArr24);
                Object[] objArr28 = new Object[1];
                a(bArr2[792], bArr2[170], s, objArr28);
                Class<?> cls9 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                a(bArr2[125], bArr2[5], (short) 232, objArr29);
                iArr[i8] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
                i8++;
                c = 0;
                c2 = 271;
            }
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                try {
                    switch (cleartextsubstitutiondefault.read(iArr[i9])) {
                        case -106:
                            i9 = 282;
                            break;
                        case -105:
                            cleartextsubstitutiondefault.read(21);
                            i10 = cleartextsubstitutiondefault.IconCompatParcelizer != 0 ? 180 : 58;
                            break;
                        case -104:
                            i9 = 277;
                            break;
                        case -103:
                            cleartextsubstitutiondefault.read(21);
                            i10 = cleartextsubstitutiondefault.IconCompatParcelizer != 47 ? 17 : 36;
                            break;
                        case -102:
                            i9 = 272;
                            break;
                        case -101:
                            cleartextsubstitutiondefault.read(21);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 41) {
                                i10 = 236;
                            } else {
                                i9 = 140;
                            }
                            break;
                        case ReviewErrorCode.INTERNAL_ERROR /* -100 */:
                            i9 = 267;
                            break;
                        case -99:
                            cleartextsubstitutiondefault.read(21);
                            i10 = cleartextsubstitutiondefault.IconCompatParcelizer != 1 ? 147 : 257;
                            break;
                        case -98:
                            i9 = 262;
                            break;
                        case -97:
                            try {
                                cleartextsubstitutiondefault.read(21);
                                int i11 = cleartextsubstitutiondefault.IconCompatParcelizer;
                                i10 = (i11 == 0 || i11 != 1) ? 42 : Constant.ERROR_ACC_INVALID;
                            } catch (Throwable th5) {
                                th = th5;
                                th = th;
                                if (i9 < 210) {
                                    if (i9 < 259) {
                                        throw th;
                                    }
                                    if (i9 >= 262) {
                                        throw th;
                                    }
                                    i = Fields.RotationX;
                                } else {
                                    if (i9 < 259) {
                                        throw th;
                                    }
                                    if (i9 >= 262) {
                                        throw th;
                                    }
                                    i = Fields.RotationX;
                                }
                                i9 = i;
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                            }
                            break;
                        case -96:
                            i9 = 268;
                            break;
                        case -95:
                            i9 = 270;
                            break;
                        case -94:
                            try {
                                cleartextsubstitutiondefault.read(31);
                                if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                    i10 = 255;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                if (i9 < 210) {
                                    if (i9 < 259) {
                                        throw th;
                                    }
                                    if (i9 >= 262) {
                                        throw th;
                                    }
                                    i = Fields.RotationX;
                                } else {
                                    if (i9 < 259) {
                                        throw th;
                                    }
                                    if (i9 >= 262) {
                                        throw th;
                                    }
                                    i = Fields.RotationX;
                                }
                                i9 = i;
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                            }
                            break;
                        case -93:
                            i9 = 137;
                            break;
                        case -92:
                            i9 = 246;
                            break;
                        case -91:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 245;
                            }
                            break;
                        case -90:
                            i9 = 1;
                            break;
                        case -89:
                            i9 = 235;
                            break;
                        case -88:
                            try {
                                cleartextsubstitutiondefault.read(14);
                                if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                    i10 = Constant.ERROR_LOCATION_INVALID;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                if (i9 < 210) {
                                    if (i9 < 259) {
                                        throw th;
                                    }
                                    if (i9 >= 262) {
                                        throw th;
                                    }
                                    i = Fields.RotationX;
                                } else {
                                    if (i9 < 259) {
                                        throw th;
                                    }
                                    if (i9 >= 262) {
                                        throw th;
                                    }
                                    i = Fields.RotationX;
                                }
                                i9 = i;
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                            }
                            break;
                        case -87:
                            i9 = 192;
                            break;
                        case -86:
                            i9 = 225;
                            break;
                        case -85:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = Constant.ERROR_WSS_INVALID;
                            }
                            break;
                        case -84:
                            try {
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                try {
                                    cleartextsubstitutiondefault.read(2);
                                    cleartextsubstitutiondefault.read(13);
                                    RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                                } catch (Throwable th8) {
                                    th = th8;
                                    th = th;
                                    if (i9 < 210) {
                                        if (i9 < 259) {
                                            throw th;
                                        }
                                        if (i9 >= 262) {
                                            throw th;
                                        }
                                        i = Fields.RotationX;
                                    } else {
                                        if (i9 < 259) {
                                            throw th;
                                        }
                                        if (i9 >= 262) {
                                            throw th;
                                        }
                                        i = Fields.RotationX;
                                    }
                                    i9 = i;
                                    cleartextsubstitutiondefault.serializer = th;
                                    cleartextsubstitutiondefault.read(24);
                                }
                            } catch (Throwable th9) {
                                th = th9;
                            }
                            break;
                        case -83:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                            cleartextsubstitutiondefault.read(10);
                            break;
                        case -82:
                            cleartextsubstitutiondefault.read(64);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 215;
                            }
                            break;
                        case -81:
                            cleartextsubstitutiondefault.read(8);
                            throw ((Throwable) cleartextsubstitutiondefault.write);
                        case -80:
                            i9 = 263;
                            break;
                        case -79:
                            i9 = 265;
                            break;
                        case -78:
                            cleartextsubstitutiondefault.read(14);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 202;
                            }
                            break;
                        case -77:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                            break;
                        case -76:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                            cleartextsubstitutiondefault.read(10);
                            break;
                        case -75:
                            i9 = 140;
                            break;
                        case -74:
                            cleartextsubstitutiondefault.read(8);
                            return (getTraversalIndexdelegate) cleartextsubstitutiondefault.write;
                        case -73:
                            i9 = Constant.ERROR_WSS_SPEED_JUMP;
                            break;
                        case -72:
                            i9 = 190;
                            break;
                        case -71:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 2;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            MutableStateFlow mutableStateFlow = (MutableStateFlow) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            mutableStateFlow.IconCompatParcelizer(cleartextsubstitutiondefault.write);
                            break;
                        case -70:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).read;
                            i2 = 4;
                            cleartextsubstitutiondefault.read(i2);
                            break;
                        case -69:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 11;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            getTraversalIndexdelegate gettraversalindexdelegate = (getTraversalIndexdelegate) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            String str5 = (String) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            String str6 = (String) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(99);
                            long j = cleartextsubstitutiondefault.read;
                            cleartextsubstitutiondefault.read(13);
                            boolean z = cleartextsubstitutiondefault.IconCompatParcelizer != 0;
                            cleartextsubstitutiondefault.read(3);
                            String str7 = (String) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            String str8 = (String) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            String str9 = (String) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            List list = (List) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            List list2 = (List) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(13);
                            cleartextsubstitutiondefault.serializer = getTraversalIndexdelegate.RemoteActionCompatParcelizer(gettraversalindexdelegate, str5, str6, j, z, str7, str8, str9, list, list2, cleartextsubstitutiondefault.IconCompatParcelizer);
                            i2 = 4;
                            cleartextsubstitutiondefault.read(i2);
                            break;
                        case -68:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 135167;
                            cleartextsubstitutiondefault.read(10);
                            break;
                        case -67:
                            i9 = 171;
                            break;
                        case -66:
                            i9 = 169;
                            break;
                        case -65:
                            i9 = DateTimeConstants.HOURS_PER_WEEK;
                            break;
                        case -64:
                            cleartextsubstitutiondefault.read(92);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 167;
                            }
                            break;
                        case -63:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((SemanticsPropertiesAndroidAccessibilityClassName1) cleartextsubstitutiondefault.write).IconCompatParcelizer();
                            i2 = 4;
                            cleartextsubstitutiondefault.read(i2);
                            break;
                        case -62:
                            i9 = 161;
                            break;
                        case -61:
                            i9 = 158;
                            break;
                        case -60:
                            cleartextsubstitutiondefault.read(92);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 157;
                            }
                            break;
                        case -59:
                            obj = null;
                            cleartextsubstitutiondefault.serializer = instance_delegatelambda0.write;
                            i2 = 4;
                            cleartextsubstitutiondefault.read(i2);
                            break;
                        case -58:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((SemanticsPropertiesAndroidAccessibilityClassName1) cleartextsubstitutiondefault.write).write();
                            i2 = 4;
                            cleartextsubstitutiondefault.read(i2);
                            break;
                        case -57:
                            i9 = 150;
                            break;
                        case -56:
                            i9 = 247;
                            break;
                        case -55:
                            cleartextsubstitutiondefault.read(92);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 146;
                            }
                            break;
                        case -54:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((SemanticsPropertiesAndroidAccessibilityClassName1) cleartextsubstitutiondefault.write).RemoteActionCompatParcelizer();
                            i2 = 4;
                            cleartextsubstitutiondefault.read(i2);
                            break;
                        case -53:
                            i9 = Constant.ERROR_GYRO_JUMP;
                            break;
                        case -52:
                            obj = null;
                            cleartextsubstitutiondefault.serializer = "";
                            i2 = 4;
                            cleartextsubstitutiondefault.read(i2);
                            break;
                        case -51:
                            i9 = 273;
                            break;
                        case -50:
                            i9 = 275;
                            break;
                        case -49:
                            cleartextsubstitutiondefault.read(92);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 136;
                            }
                            break;
                        case -48:
                            obj = null;
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((SemanticsPropertiesAndroidAccessibilityClassName1) cleartextsubstitutiondefault.write).serializer();
                            i2 = 4;
                            cleartextsubstitutiondefault.read(i2);
                            break;
                        case -47:
                            try {
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(3);
                                try {
                                    Object[] objArr30 = {cleartextsubstitutiondefault.write};
                                    byte[] bArr3 = ParcelableVolumeInfo;
                                    try {
                                        byte b12 = bArr3[792];
                                        try {
                                            byte b13 = bArr3[271];
                                            Object[] objArr31 = new Object[1];
                                            a(b12, b13, (short) (b13 | 178), objArr31);
                                            try {
                                                Class<?> cls10 = Class.forName((String) objArr31[0]);
                                                Object[] objArr32 = new Object[1];
                                                a(bArr3[301], bArr3[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr32);
                                                try {
                                                    String str10 = (String) objArr32[0];
                                                    Class<?>[] clsArr = new Class[1];
                                                    try {
                                                        try {
                                                            Object[] objArr33 = new Object[1];
                                                            a(bArr3[792], bArr3[271], (short) 1074, objArr33);
                                                            try {
                                                                clsArr[0] = Class.forName((String) objArr33[0]);
                                                                obj = null;
                                                                try {
                                                                    try {
                                                                        cleartextsubstitutiondefault.serializer = cls10.getMethod(str10, clsArr).invoke(null, objArr30);
                                                                        i2 = 4;
                                                                        cleartextsubstitutiondefault.read(i2);
                                                                    } catch (Throwable th10) {
                                                                        th = th10;
                                                                        th = th;
                                                                        if (i9 < 210) {
                                                                            if (i9 < 259) {
                                                                                throw th;
                                                                            }
                                                                            if (i9 >= 262) {
                                                                                throw th;
                                                                            }
                                                                            i = Fields.RotationX;
                                                                        } else {
                                                                            if (i9 < 259) {
                                                                                throw th;
                                                                            }
                                                                            if (i9 >= 262) {
                                                                                throw th;
                                                                            }
                                                                            i = Fields.RotationX;
                                                                        }
                                                                        i9 = i;
                                                                        cleartextsubstitutiondefault.serializer = th;
                                                                        cleartextsubstitutiondefault.read(24);
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    th2 = th;
                                                                    cause = th2.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th12) {
                                                                th = th12;
                                                            }
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                            th2 = th;
                                                            cause = th2.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        th2 = th;
                                                        cause = th2.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    th2 = th;
                                                    cause = th2.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                        }
                                    } catch (Throwable th18) {
                                        th = th18;
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                }
                            } catch (Throwable th20) {
                                th = th20;
                                obj = null;
                            }
                            break;
                        case -46:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((SemanticsPropertiesAndroidAccessibilityClassName1) cleartextsubstitutiondefault.write).read();
                            i3 = 4;
                            cleartextsubstitutiondefault.read(i3);
                            break;
                        case -45:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = (SemanticsPropertiesAndroidAccessibilityClassName1) cleartextsubstitutiondefault.write;
                            i3 = 4;
                            cleartextsubstitutiondefault.read(i3);
                            break;
                        case -44:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((TokenData$Companion) cleartextsubstitutiondefault.write).serializer();
                            i3 = 4;
                            cleartextsubstitutiondefault.read(i3);
                            break;
                        case -43:
                            cleartextsubstitutiondefault.serializer = SemanticsPropertiesAndroidAccessibilityClassName1.Companion;
                            i3 = 4;
                            cleartextsubstitutiondefault.read(i3);
                            break;
                        case -42:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = DelayKt.serializer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) cleartextsubstitutiondefault.write);
                            i3 = 4;
                            cleartextsubstitutiondefault.read(i3);
                            break;
                        case -41:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            cleartextsubstitutiondefault.serializer = new hg$$ExternalSyntheticLambda5(cleartextsubstitutiondefault.IconCompatParcelizer);
                            i3 = 4;
                            cleartextsubstitutiondefault.read(i3);
                            break;
                        case -40:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 2;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            byte[] bArr4 = (byte[]) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            try {
                                Object[] objArr34 = {bArr4, cleartextsubstitutiondefault.write};
                                byte[] bArr5 = ParcelableVolumeInfo;
                                byte b14 = bArr5[792];
                                byte b15 = bArr5[271];
                                Object[] objArr35 = new Object[1];
                                a(b14, b15, (short) (b15 | 178), objArr35);
                                Class<?> cls11 = Class.forName((String) objArr35[0]);
                                byte b16 = bArr5[792];
                                Object[] objArr36 = new Object[1];
                                a(b16, b16, (short) 1051, objArr36);
                                cleartextsubstitutiondefault.serializer = cls11.getDeclaredConstructor(byte[].class, Class.forName((String) objArr36[0])).newInstance(objArr34);
                                i3 = 4;
                                cleartextsubstitutiondefault.read(i3);
                            } catch (Throwable th21) {
                                Throwable cause3 = th21.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th21;
                            }
                            break;
                        case -39:
                            byte[] bArr6 = ParcelableVolumeInfo;
                            Object[] objArr37 = new Object[1];
                            a(bArr6[792], (byte) PlaybackStateCompat, (short) 1015, objArr37);
                            Class<?> cls12 = Class.forName((String) objArr37[0]);
                            byte b17 = bArr6[9];
                            byte b18 = bArr6[0];
                            Object[] objArr38 = new Object[1];
                            a(b17, b18, (short) (b18 | 1045), objArr38);
                            cleartextsubstitutiondefault.serializer = cls12.getField((String) objArr38[0]).get(null);
                            i3 = 4;
                            cleartextsubstitutiondefault.read(i3);
                            break;
                        case -38:
                            try {
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 2;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(3);
                                Object obj2 = cleartextsubstitutiondefault.write;
                                cleartextsubstitutiondefault.read(13);
                                try {
                                    Object[] objArr39 = {obj2, Integer.valueOf(cleartextsubstitutiondefault.IconCompatParcelizer)};
                                    byte[] bArr7 = ParcelableVolumeInfo;
                                    try {
                                        Object[] objArr40 = new Object[1];
                                        a(bArr7[108], bArr7[33], (short) 992, objArr40);
                                        Class<?> cls13 = Class.forName((String) objArr40[0]);
                                        Object[] objArr41 = new Object[1];
                                        a(bArr7[738], bArr7[77], (short) 1010, objArr41);
                                        String str11 = (String) objArr41[0];
                                        byte b19 = bArr7[792];
                                        byte b20 = bArr7[271];
                                        Object[] objArr42 = new Object[1];
                                        a(b19, b20, (short) (b20 | 178), objArr42);
                                        try {
                                            cleartextsubstitutiondefault.serializer = cls13.getMethod(str11, Class.forName((String) objArr42[0]), Integer.TYPE).invoke(null, objArr39);
                                            i3 = 4;
                                            cleartextsubstitutiondefault.read(i3);
                                        } catch (Throwable th22) {
                                            th3 = th22;
                                            th = th3;
                                            if (i9 < 210) {
                                                if (i9 < 259) {
                                                    throw th;
                                                }
                                                if (i9 >= 262) {
                                                    throw th;
                                                }
                                                i = Fields.RotationX;
                                            } else {
                                                if (i9 < 259) {
                                                    throw th;
                                                }
                                                if (i9 >= 262) {
                                                    throw th;
                                                }
                                                i = Fields.RotationX;
                                            }
                                            i9 = i;
                                            cleartextsubstitutiondefault.serializer = th;
                                            cleartextsubstitutiondefault.read(24);
                                        }
                                    } catch (Throwable th23) {
                                        th = th23;
                                        Throwable th24 = th;
                                        Throwable cause4 = th24.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th24;
                                    }
                                } catch (Throwable th25) {
                                    th = th25;
                                }
                            } catch (Throwable th26) {
                                th3 = th26;
                                th = th3;
                                if (i9 < 210) {
                                    if (i9 < 259) {
                                        throw th;
                                    }
                                    if (i9 >= 262) {
                                        throw th;
                                    }
                                    i = Fields.RotationX;
                                } else {
                                    if (i9 < 259) {
                                        throw th;
                                    }
                                    if (i9 >= 262) {
                                        throw th;
                                    }
                                    i = Fields.RotationX;
                                }
                                i9 = i;
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                            }
                            break;
                        case -37:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((SemanticsPropertiesIsPopup1) cleartextsubstitutiondefault.write).IconCompatParcelizer;
                            i4 = 4;
                            cleartextsubstitutiondefault.read(i4);
                            break;
                        case -36:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = cleartextsubstitutiondefault.write;
                            i4 = 4;
                            cleartextsubstitutiondefault.read(i4);
                            break;
                        case -35:
                            try {
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 2;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(3);
                                Object obj3 = cleartextsubstitutiondefault.write;
                                cleartextsubstitutiondefault.read(13);
                                try {
                                    Object[] objArr43 = {Integer.valueOf(cleartextsubstitutiondefault.IconCompatParcelizer)};
                                    byte[] bArr8 = ParcelableVolumeInfo;
                                    try {
                                        Object[] objArr44 = new Object[1];
                                        a(bArr8[792], bArr8[48], (short) 977, objArr44);
                                        Class<?> cls14 = Class.forName((String) objArr44[0]);
                                        try {
                                            byte b21 = bArr8[551];
                                            byte b22 = bArr8[9];
                                            Object[] objArr45 = new Object[1];
                                            a(b21, b22, (short) (b22 | 990), objArr45);
                                            try {
                                                cleartextsubstitutiondefault.serializer = cls14.getMethod((String) objArr45[0], Integer.TYPE).invoke(obj3, objArr43);
                                                i4 = 4;
                                                cleartextsubstitutiondefault.read(i4);
                                            } catch (Throwable th27) {
                                                th = th27;
                                                th = th;
                                                if (i9 < 210 && i9 < 216) {
                                                    i = 203;
                                                } else {
                                                    if (i9 < 259) {
                                                        throw th;
                                                    }
                                                    if (i9 >= 262) {
                                                        throw th;
                                                    }
                                                    i = Fields.RotationX;
                                                }
                                                i9 = i;
                                                cleartextsubstitutiondefault.serializer = th;
                                                cleartextsubstitutiondefault.read(24);
                                            }
                                        } catch (Throwable th28) {
                                            th = th28;
                                            th4 = th;
                                            cause2 = th4.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th4;
                                        }
                                    } catch (Throwable th29) {
                                        th = th29;
                                        th4 = th;
                                        cause2 = th4.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th4;
                                    }
                                } catch (Throwable th30) {
                                    th = th30;
                                }
                            } catch (Throwable th31) {
                                th = th31;
                            }
                            break;
                        case -34:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 3;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            CharSequence charSequence = (CharSequence) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            String[] strArr = (String[]) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(13);
                            cleartextsubstitutiondefault.serializer = hideCurrentlyDisplayingInAppMessage.serializer(charSequence, strArr, cleartextsubstitutiondefault.IconCompatParcelizer);
                            i6 = 4;
                            cleartextsubstitutiondefault.read(i6);
                            break;
                        case -33:
                            cleartextsubstitutiondefault.serializer = ".";
                            i6 = 4;
                            cleartextsubstitutiondefault.read(i6);
                            break;
                        case -32:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            int i12 = cleartextsubstitutiondefault.IconCompatParcelizer;
                            byte[] bArr9 = ParcelableVolumeInfo;
                            byte b23 = bArr9[792];
                            byte b24 = bArr9[271];
                            Object[] objArr46 = new Object[1];
                            a(b23, b24, (short) (b24 | 178), objArr46);
                            cleartextsubstitutiondefault.serializer = Array.newInstance(Class.forName((String) objArr46[0]), i12);
                            i6 = 4;
                            cleartextsubstitutiondefault.read(i6);
                            break;
                        case -31:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).RemoteActionCompatParcelizer;
                            i6 = 4;
                            cleartextsubstitutiondefault.read(i6);
                            break;
                        case -30:
                            i9 = 65;
                            break;
                        case -29:
                            cleartextsubstitutiondefault.read(78);
                            i9 = cleartextsubstitutiondefault.IconCompatParcelizer == 0 ? 64 : i10;
                            break;
                        case -28:
                            i9 = 283;
                            break;
                        case -27:
                            i9 = 285;
                            break;
                        case -26:
                            cleartextsubstitutiondefault.read(14);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 57;
                            }
                            break;
                        case -25:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            Object obj4 = cleartextsubstitutiondefault.write;
                            try {
                                byte[] bArr10 = ParcelableVolumeInfo;
                                byte b25 = bArr10[792];
                                byte b26 = bArr10[271];
                                Object[] objArr47 = new Object[1];
                                a(b25, b26, (short) (b26 | 178), objArr47);
                                Class<?> cls15 = Class.forName((String) objArr47[0]);
                                Object[] objArr48 = new Object[1];
                                a(bArr10[286], bArr10[77], (short) 426, objArr48);
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = ((Integer) cls15.getMethod((String) objArr48[0], null).invoke(obj4, null)).intValue();
                                cleartextsubstitutiondefault.read(10);
                            } catch (Throwable th32) {
                                Throwable cause5 = th32.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th32;
                            }
                            break;
                        case -24:
                            i9 = 51;
                            break;
                        case -23:
                            cleartextsubstitutiondefault.read(64);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 50;
                            }
                            break;
                        case -22:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((getTraversalIndexdelegate) cleartextsubstitutiondefault.write).userId;
                            i5 = 4;
                            cleartextsubstitutiondefault.read(i5);
                            break;
                        case -21:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((getTraversalIndexdelegate) cleartextsubstitutiondefault.write).accessToken;
                            i5 = 4;
                            cleartextsubstitutiondefault.read(i5);
                            break;
                        case -20:
                            i9 = 180;
                            break;
                        case -19:
                            i9 = 195;
                            break;
                        case -18:
                            cleartextsubstitutiondefault.read(64);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 41;
                            }
                            break;
                        case -17:
                            i9 = 36;
                            break;
                        case -16:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = (getTraversalIndexdelegate) cleartextsubstitutiondefault.write;
                            i5 = 4;
                            cleartextsubstitutiondefault.read(i5);
                            break;
                        case -15:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 3;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            resetTransientState resettransientstate = (resetTransientState) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            String str12 = (String) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = resettransientstate.serializer(str12, (setGraphicModalMaxWidthDp) cleartextsubstitutiondefault.write);
                            i5 = 4;
                            cleartextsubstitutiondefault.read(i5);
                            break;
                        case Float16.MinExponent /* -14 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = (setGraphicModalMaxWidthDp) cleartextsubstitutiondefault.write;
                            i5 = 4;
                            cleartextsubstitutiondefault.read(i5);
                            break;
                        case -13:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((AuthEntity$Companion) cleartextsubstitutiondefault.write).serializer();
                            i5 = 4;
                            cleartextsubstitutiondefault.read(i5);
                            break;
                        case -12:
                            cleartextsubstitutiondefault.serializer = getTraversalIndexdelegate.Companion;
                            i5 = 4;
                            cleartextsubstitutiondefault.read(i5);
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = cleartextsubstitutiondefault.write.getClass();
                            i5 = 4;
                            cleartextsubstitutiondefault.read(i5);
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).write();
                            i5 = 4;
                            cleartextsubstitutiondefault.read(i5);
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i9 = 278;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            i9 = 280;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            cleartextsubstitutiondefault.read(64);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i10 = 16;
                            }
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 3;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            Object obj5 = cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            Object obj6 = cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            try {
                                Object[] objArr49 = {obj6, cleartextsubstitutiondefault.write};
                                byte[] bArr11 = ParcelableVolumeInfo;
                                Object[] objArr50 = new Object[1];
                                a(bArr11[108], (byte) PlaybackStateCompat, (short) 937, objArr50);
                                Class<?> cls16 = Class.forName((String) objArr50[0]);
                                Object[] objArr51 = new Object[1];
                                a(bArr11[551], bArr11[22], (short) 969, objArr51);
                                String str13 = (String) objArr51[0];
                                byte b27 = bArr11[792];
                                byte b28 = bArr11[271];
                                Object[] objArr52 = new Object[1];
                                a(b27, b28, (short) (b28 | 178), objArr52);
                                byte b29 = bArr11[792];
                                byte b30 = bArr11[271];
                                Object[] objArr53 = new Object[1];
                                a(b29, b30, (short) (b30 | 178), objArr53);
                                cleartextsubstitutiondefault.serializer = cls16.getMethod(str13, Class.forName((String) objArr52[0]), Class.forName((String) objArr53[0])).invoke(obj5, objArr49);
                                i5 = 4;
                                cleartextsubstitutiondefault.read(i5);
                            } catch (Throwable th33) {
                                Throwable cause6 = th33.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th33;
                            }
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            cleartextsubstitutiondefault.serializer = "LOCAL_AUTH_SHARED_PREF_AUTH_DATA";
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -3:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((Lazy) cleartextsubstitutiondefault.write).write();
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -2:
                            try {
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(3);
                                cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).MediaSessionCompatQueueItem;
                                cleartextsubstitutiondefault.read(4);
                            } catch (Throwable th34) {
                                th = th34;
                                if (i9 < 210) {
                                    if (i9 < 259) {
                                        throw th;
                                    }
                                    if (i9 >= 262) {
                                        throw th;
                                    }
                                    i = Fields.RotationX;
                                } else {
                                    if (i9 < 259) {
                                        throw th;
                                    }
                                    if (i9 >= 262) {
                                        throw th;
                                    }
                                    i = Fields.RotationX;
                                }
                                i9 = i;
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                            }
                            break;
                        case -1:
                            i9 = 187;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th35) {
                    th = th35;
                }
            }
        } catch (Throwable th36) {
            Throwable cause7 = th36.getCause();
            if (cause7 != null) {
                throw cause7;
            }
            throw th36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x056d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0574  */
    /* JADX WARN: Code duplicated, block: B:109:0x0578  */
    /* JADX WARN: Code duplicated, block: B:113:0x0580  */
    /* JADX WARN: Code duplicated, block: B:115:0x0584  */
    /* JADX WARN: Code duplicated, block: B:120:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:125:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:127:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:134:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:194:0x0612 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0540  */
    /* JADX WARN: Code duplicated, block: B:97:0x0545  */
    /* JADX WARN: Code duplicated, block: B:99:0x054c A[ADDED_TO_REGION] */
    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) throws Throwable {
        byte[] bArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        int i;
        int i2;
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault((LocalAuthDataSource) objArr[0], (ShortNewsContentCardView) objArr[1]);
        try {
            byte[] bArr2 = ParcelableVolumeInfo;
            Object[] objArr7 = new Object[1];
            a(bArr2[108], bArr2[78], bArr2[14], objArr7);
            Class<?> cls = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(bArr2[551], bArr2[92], (short) 645, objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(bArr2[792], bArr2[78], bArr2[20], objArr9);
            int iIntValue = 303 - ((Integer) cls.getMethod(str, Class.forName((String) objArr9[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", 0, 0)).intValue();
            Object[] objArr10 = new Object[1];
            a(bArr2[108], bArr2[78], (short) 167, objArr10);
            Class<?> cls2 = Class.forName((String) objArr10[0]);
            byte b = bArr2[121];
            byte b2 = bArr2[9];
            Object[] objArr11 = new Object[1];
            a(b, b2, (short) (b2 | 1162), objArr11);
            int iIntValue2 = 2337 - ((Integer) cls2.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr12 = new Object[1];
            a(bArr2[108], bArr2[400], (short) (bArr2[325] + 1), objArr12);
            Class<?> cls3 = Class.forName((String) objArr12[0]);
            byte b3 = bArr2[551];
            byte b4 = bArr2[33];
            Object[] objArr13 = new Object[1];
            a(b3, b4, (short) (b4 | 585), objArr13);
            Object[] objArr14 = new Object[1];
            b(iIntValue, iIntValue2, (char) ((((Integer) cls3.getMethod((String) objArr13[0], null).invoke(null, null)).intValue() >> 16) + 49141), objArr14);
            String str2 = (String) objArr14[0];
            Object[] objArr15 = new Object[1];
            a(bArr2[108], bArr2[170], (short) 551, objArr15);
            Class<?> cls4 = Class.forName((String) objArr15[0]);
            byte b5 = bArr2[121];
            byte b6 = bArr2[33];
            Object[] objArr16 = new Object[1];
            a(b5, b6, (short) (b6 | 551), objArr16);
            int iIntValue3 = 1 - ((Integer) cls4.getMethod((String) objArr16[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0)).intValue();
            Object[] objArr17 = new Object[1];
            a(bArr2[108], bArr2[400], (short) (bArr2[325] + 1), objArr17);
            Class<?> cls5 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            a(bArr2[551], bArr2[125], (short) 1164, objArr18);
            int iIntValue4 = (((Integer) cls5.getMethod((String) objArr18[0], null).invoke(null, null)).intValue() >> 16) + 122;
            Object[] objArr19 = {"", "", 0};
            Object[] objArr20 = new Object[1];
            a(bArr2[108], bArr2[78], bArr2[14], objArr20);
            Class<?> cls6 = Class.forName((String) objArr20[0]);
            byte b7 = bArr2[125];
            Object[] objArr21 = new Object[1];
            a(b7, bArr2[31], b7, objArr21);
            String str3 = (String) objArr21[0];
            Object[] objArr22 = new Object[1];
            a(bArr2[792], bArr2[78], bArr2[20], objArr22);
            Object[] objArr23 = new Object[1];
            a(bArr2[792], bArr2[78], bArr2[20], objArr23);
            Object[] objArr24 = new Object[1];
            b(iIntValue3, iIntValue4, (char) ((Integer) cls6.getMethod(str3, Class.forName((String) objArr22[0]), Class.forName((String) objArr23[0]), Integer.TYPE).invoke(null, objArr19)).intValue(), objArr24);
            Object[] objArr25 = {(String) objArr24[0]};
            byte b8 = bArr2[792];
            char c = 271;
            byte b9 = bArr2[271];
            Object[] objArr26 = new Object[1];
            a(b8, b9, (short) (b9 | 178), objArr26);
            Class<?> cls7 = Class.forName((String) objArr26[0]);
            byte b10 = (byte) PlaybackStateCompat;
            byte b11 = bArr2[0];
            Object[] objArr27 = new Object[1];
            a(b10, b11, (short) (b11 | 204), objArr27);
            String str4 = (String) objArr27[0];
            byte b12 = bArr2[792];
            byte b13 = bArr2[271];
            Object[] objArr28 = new Object[1];
            a(b12, b13, (short) (b13 | 178), objArr28);
            Object[] objArr29 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr28[0])).invoke(str2, objArr25);
            int[] iArr = new int[objArr29.length];
            int i3 = 0;
            while (i3 < objArr29.length) {
                Object[] objArr30 = {objArr29[i3]};
                byte[] bArr3 = ParcelableVolumeInfo;
                short s = (short) 210;
                Object[] objArr31 = new Object[1];
                a(bArr3[792], bArr3[170], s, objArr31);
                Class<?> cls8 = Class.forName((String) objArr31[0]);
                Object[] objArr32 = new Object[1];
                a(bArr3[301], bArr3[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr32);
                String str5 = (String) objArr32[0];
                byte b14 = bArr3[792];
                byte b15 = bArr3[c];
                Object[] objArr33 = new Object[1];
                a(b14, b15, (short) (b15 | 178), objArr33);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr33[0])).invoke(null, objArr30);
                Object[] objArr34 = new Object[1];
                a(bArr3[792], bArr3[170], s, objArr34);
                Class<?> cls9 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                a(bArr3[125], bArr3[5], (short) 232, objArr35);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr35[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = 271;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                    switch (cleartextsubstitutiondefault.read(iArr[i4])) {
                        case -32:
                            i4 = 84;
                            break;
                        case -31:
                            cleartextsubstitutiondefault.read(21);
                            int i6 = cleartextsubstitutiondefault.IconCompatParcelizer;
                            if (i6 == 73 || i6 != 90) {
                                i2 = 65;
                                i4 = i2;
                            } else {
                                i4 = 1;
                            }
                            break;
                        case -30:
                            i4 = 79;
                            break;
                        case -29:
                            cleartextsubstitutiondefault.read(21);
                            int i7 = cleartextsubstitutiondefault.IconCompatParcelizer;
                            i2 = (i7 == 21 || i7 != 85) ? 38 : 50;
                            i4 = i2;
                            break;
                        case -28:
                            try {
                                cleartextsubstitutiondefault.read(92);
                                i4 = cleartextsubstitutiondefault.IconCompatParcelizer == 0 ? 78 : i5;
                            } catch (Throwable th) {
                                th = th;
                                bArr = ParcelableVolumeInfo;
                                byte b16 = bArr[792];
                                byte b17 = bArr[33];
                                objArr2 = new Object[1];
                                a(b16, b17, (short) (b17 | 322), objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    break;
                                }
                                byte b18 = bArr[792];
                                byte b19 = bArr[33];
                                objArr3 = new Object[1];
                                a(b18, b19, (short) (b19 | 322), objArr3);
                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                    if (i4 < 51) {
                                        if (i4 >= 74) {
                                            break;
                                        }
                                        byte b20 = bArr[792];
                                        byte b21 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b20, b21, (short) (b21 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            byte b22 = bArr[792];
                                            byte b23 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b22, b23, (short) (b23 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b24 = bArr[792];
                                            byte b25 = bArr[33];
                                            objArr6 = new Object[1];
                                            a(b24, b25, (short) (b25 | 322), objArr6);
                                            if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b26 = bArr[792];
                                        byte b27 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b26, b27, (short) (b27 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b28 = bArr[792];
                                        byte b29 = bArr[33];
                                        objArr6 = new Object[1];
                                        a(b28, b29, (short) (b29 | 322), objArr6);
                                        if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    if (i4 >= 74) {
                                        break;
                                    }
                                    byte b210 = bArr[792];
                                    byte b211 = bArr[33];
                                    objArr4 = new Object[1];
                                    a(b210, b211, (short) (b211 | 322), objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        byte b212 = bArr[792];
                                        byte b213 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b212, b213, (short) (b213 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b214 = bArr[792];
                                        byte b215 = bArr[33];
                                        objArr6 = new Object[1];
                                        a(b214, b215, (short) (b215 | 322), objArr6);
                                        if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b216 = bArr[792];
                                    byte b217 = bArr[33];
                                    objArr5 = new Object[1];
                                    a(b216, b217, (short) (b217 | 322), objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b218 = bArr[792];
                                    byte b219 = bArr[33];
                                    objArr6 = new Object[1];
                                    a(b218, b219, (short) (b219 | 322), objArr6);
                                    if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                if (i4 < 51) {
                                    if (i4 >= 74) {
                                        break;
                                    }
                                    byte b2110 = bArr[792];
                                    byte b2111 = bArr[33];
                                    objArr4 = new Object[1];
                                    a(b2110, b2111, (short) (b2111 | 322), objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        byte b2112 = bArr[792];
                                        byte b2113 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b2112, b2113, (short) (b2113 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b2114 = bArr[792];
                                        byte b2115 = bArr[33];
                                        objArr6 = new Object[1];
                                        a(b2114, b2115, (short) (b2115 | 322), objArr6);
                                        if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b2116 = bArr[792];
                                    byte b2117 = bArr[33];
                                    objArr5 = new Object[1];
                                    a(b2116, b2117, (short) (b2117 | 322), objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b2118 = bArr[792];
                                    byte b2119 = bArr[33];
                                    objArr6 = new Object[1];
                                    a(b2118, b2119, (short) (b2119 | 322), objArr6);
                                    if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                if (i4 >= 74) {
                                    break;
                                }
                                byte b21110 = bArr[792];
                                byte b21111 = bArr[33];
                                objArr4 = new Object[1];
                                a(b21110, b21111, (short) (b21111 | 322), objArr4);
                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                    byte b21112 = bArr[792];
                                    byte b21113 = bArr[33];
                                    objArr5 = new Object[1];
                                    a(b21112, b21113, (short) (b21113 | 322), objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b21114 = bArr[792];
                                    byte b21115 = bArr[33];
                                    objArr6 = new Object[1];
                                    a(b21114, b21115, (short) (b21115 | 322), objArr6);
                                    if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                byte b21116 = bArr[792];
                                byte b21117 = bArr[33];
                                objArr5 = new Object[1];
                                a(b21116, b21117, (short) (b21117 | 322), objArr5);
                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                    break;
                                }
                                byte b21118 = bArr[792];
                                byte b21119 = bArr[33];
                                objArr6 = new Object[1];
                                a(b21118, b21119, (short) (b21119 | 322), objArr6);
                                if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                }
                                throw th;
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                            }
                            break;
                        case -27:
                            i4 = 85;
                            break;
                        case -26:
                            i4 = 87;
                            break;
                        case -25:
                            try {
                                cleartextsubstitutiondefault.read(31);
                                if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                    i2 = 63;
                                    i4 = i2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bArr = ParcelableVolumeInfo;
                                byte b110 = bArr[792];
                                byte b111 = bArr[33];
                                objArr2 = new Object[1];
                                a(b110, b111, (short) (b111 | 322), objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    break;
                                }
                                byte b112 = bArr[792];
                                byte b113 = bArr[33];
                                objArr3 = new Object[1];
                                a(b112, b113, (short) (b113 | 322), objArr3);
                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                    if (i4 < 51) {
                                        if (i4 >= 74) {
                                            break;
                                        }
                                        byte b211110 = bArr[792];
                                        byte b211111 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b211110, b211111, (short) (b211111 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            byte b211112 = bArr[792];
                                            byte b211113 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b211112, b211113, (short) (b211113 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b211114 = bArr[792];
                                            byte b211115 = bArr[33];
                                            objArr6 = new Object[1];
                                            a(b211114, b211115, (short) (b211115 | 322), objArr6);
                                            if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b211116 = bArr[792];
                                        byte b211117 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b211116, b211117, (short) (b211117 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b211118 = bArr[792];
                                        byte b211119 = bArr[33];
                                        objArr6 = new Object[1];
                                        a(b211118, b211119, (short) (b211119 | 322), objArr6);
                                        if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    if (i4 >= 74) {
                                        break;
                                    }
                                    byte b2111110 = bArr[792];
                                    byte b2111111 = bArr[33];
                                    objArr4 = new Object[1];
                                    a(b2111110, b2111111, (short) (b2111111 | 322), objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        byte b2111112 = bArr[792];
                                        byte b2111113 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b2111112, b2111113, (short) (b2111113 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b2111114 = bArr[792];
                                        byte b2111115 = bArr[33];
                                        objArr6 = new Object[1];
                                        a(b2111114, b2111115, (short) (b2111115 | 322), objArr6);
                                        if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b2111116 = bArr[792];
                                    byte b2111117 = bArr[33];
                                    objArr5 = new Object[1];
                                    a(b2111116, b2111117, (short) (b2111117 | 322), objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b2111118 = bArr[792];
                                    byte b2111119 = bArr[33];
                                    objArr6 = new Object[1];
                                    a(b2111118, b2111119, (short) (b2111119 | 322), objArr6);
                                    if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                if (i4 < 51) {
                                    if (i4 >= 74) {
                                        break;
                                    }
                                    byte b21111110 = bArr[792];
                                    byte b21111111 = bArr[33];
                                    objArr4 = new Object[1];
                                    a(b21111110, b21111111, (short) (b21111111 | 322), objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        byte b21111112 = bArr[792];
                                        byte b21111113 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b21111112, b21111113, (short) (b21111113 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b21111114 = bArr[792];
                                        byte b21111115 = bArr[33];
                                        objArr6 = new Object[1];
                                        a(b21111114, b21111115, (short) (b21111115 | 322), objArr6);
                                        if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b21111116 = bArr[792];
                                    byte b21111117 = bArr[33];
                                    objArr5 = new Object[1];
                                    a(b21111116, b21111117, (short) (b21111117 | 322), objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b21111118 = bArr[792];
                                    byte b21111119 = bArr[33];
                                    objArr6 = new Object[1];
                                    a(b21111118, b21111119, (short) (b21111119 | 322), objArr6);
                                    if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                if (i4 >= 74) {
                                    break;
                                }
                                byte b211111110 = bArr[792];
                                byte b211111111 = bArr[33];
                                objArr4 = new Object[1];
                                a(b211111110, b211111111, (short) (b211111111 | 322), objArr4);
                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                    byte b211111112 = bArr[792];
                                    byte b211111113 = bArr[33];
                                    objArr5 = new Object[1];
                                    a(b211111112, b211111113, (short) (b211111113 | 322), objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b211111114 = bArr[792];
                                    byte b211111115 = bArr[33];
                                    objArr6 = new Object[1];
                                    a(b211111114, b211111115, (short) (b211111115 | 322), objArr6);
                                    if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                byte b211111116 = bArr[792];
                                byte b211111117 = bArr[33];
                                objArr5 = new Object[1];
                                a(b211111116, b211111117, (short) (b211111117 | 322), objArr5);
                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                    break;
                                }
                                byte b211111118 = bArr[792];
                                byte b211111119 = bArr[33];
                                objArr6 = new Object[1];
                                a(b211111118, b211111119, (short) (b211111119 | 322), objArr6);
                                if (Class.forName((String) objArr6[0]).isInstance(th)) {
                                }
                                throw th;
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                            }
                            break;
                        case -24:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            try {
                                cleartextsubstitutiondefault.read(3);
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = cleartextsubstitutiondefault.write.hashCode();
                                cleartextsubstitutiondefault.read(10);
                            } catch (Throwable th3) {
                                th = th3;
                                bArr = ParcelableVolumeInfo;
                                byte b114 = bArr[792];
                                byte b115 = bArr[33];
                                objArr2 = new Object[1];
                                a(b114, b115, (short) (b115 | 322), objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th) || i4 < 2 || i4 >= 13) {
                                    byte b116 = bArr[792];
                                    byte b117 = bArr[33];
                                    objArr3 = new Object[1];
                                    a(b116, b117, (short) (b117 | 322), objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th) || i4 < 5 || i4 >= 6) {
                                        if (i4 < 51 && i4 < 55) {
                                            i = 49;
                                        } else if (i4 >= 74 || i4 >= 79) {
                                            byte b2111111110 = bArr[792];
                                            byte b2111111111 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b2111111110, b2111111111, (short) (b2111111111 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th) || i4 < 66 || i4 >= 79) {
                                                byte b2111111112 = bArr[792];
                                                byte b2111111113 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b2111111112, b2111111113, (short) (b2111111113 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th) || i4 < 69 || i4 >= 70) {
                                                    byte b2111111114 = bArr[792];
                                                    byte b2111111115 = bArr[33];
                                                    objArr6 = new Object[1];
                                                    a(b2111111114, b2111111115, (short) (b2111111115 | 322), objArr6);
                                                    if (Class.forName((String) objArr6[0]).isInstance(th) || i4 < 71 || i4 >= 72) {
                                                        throw th;
                                                    }
                                                    i4 = 89;
                                                }
                                            }
                                            i4 = 90;
                                        } else {
                                            i = 64;
                                        }
                                        i4 = i;
                                    } else {
                                        i4 = 90;
                                    }
                                } else {
                                    i4 = 90;
                                }
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                            }
                            break;
                        case -23:
                            cleartextsubstitutiondefault.read(8);
                            throw ((Throwable) cleartextsubstitutiondefault.write);
                        case -22:
                            i4 = 80;
                            break;
                        case -21:
                            i4 = 82;
                            break;
                        case -20:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i2 = 48;
                                i4 = i2;
                            }
                            break;
                        case -19:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                            break;
                        case -18:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                            cleartextsubstitutiondefault.read(10);
                            break;
                        case -17:
                            i4 = 55;
                            break;
                        case -16:
                            i4 = 40;
                            break;
                        case -15:
                            cleartextsubstitutiondefault.read(8);
                            return cleartextsubstitutiondefault.write;
                        case Float16.MinExponent /* -14 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 3;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = BuildersKt.withContext(textAnnouncementContentCardView, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) cleartextsubstitutiondefault.write);
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -13:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 3;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            Object obj = cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(13);
                            cleartextsubstitutiondefault.serializer = new MapLayersUiModel$1(obj, shortNewsContentCardView, cleartextsubstitutiondefault.IconCompatParcelizer);
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -12:
                            cleartextsubstitutiondefault.serializer = DefaultIoScheduler.RemoteActionCompatParcelizer;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            cleartextsubstitutiondefault.serializer = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = cleartextsubstitutiondefault.write.getClass();
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = (inCompatibilityMode) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).IconCompatParcelizer;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            i4 = 31;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            i4 = 13;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            cleartextsubstitutiondefault.read(92);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i2 = 12;
                                i4 = i2;
                            }
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = (getTraversalIndexdelegate) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -3:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((MutableStateFlow) cleartextsubstitutiondefault.write).read();
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -2:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).read;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -1:
                            i4 = 33;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            Throwable cause = th5.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.roadrunner.auth.data.LocalAuthDataSource.ParcelableVolumeInfo
            int r1 = r7 + 3
            int r6 = r6 + 85
            byte[] r1 = new byte[r1]
            int r7 = r7 + 2
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-5)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.data.LocalAuthDataSource.a(byte, byte, int, java.lang.Object[]):void");
    }

    static void IconCompatParcelizer() {
        char[] cArr = new char[3895];
        ByteBuffer.wrap("\u0099¿\rx°\b'2ÊÒqøä\u0082\u0088C?\u007f¢\rI1üÈcú\u0016»ºD!pÔ\u000e{4îÀ\u0095ÿ8·¬ISmÆ\nm6\u0010Ü\u0087\u009a*§ÞWElè\u0014\u009f&\u0002À©\u0085\\©ÀTwr\u001a\u0004\u0081%4ãÛ\u0087N¹òP\u0099v\f\u000f³Á&åÍ\u0096p²äU\u008by>\u0002¥ßHéÿ\u0099b³\u0016K½g  ×Æz÷á\u008f\u0094´8@¯~R$ùÑlï\u0013\u0093\u0086£*\\Ñ\u001eD=ëÍ\u009eí\u0005\u0083¨º\\|Ã\u0011v+\u001dÐ\u0080é7\u0098Ú¾Nyõ\t\u00981\u000fÊ²öY\u009cÍ]pxç\n\u008a01É¤ãK\u009eÿDbu\t\u0016¼2#ØÖá}ºáF\u0094l;\r®-UÚø\u009foº\u0013K\u0086o-\bÐ#Gßê\u009c\u0091¶\u0005L¨r_\u000bÂ&\u0099¾\u0099¿\rx°\b'.ÊÌqùä\u0082\u0088Z?f¢\u0010I0üÖcå\u0016¡º^!kÔ\u0015{5îÙ\u0095ç8¢¬\\SlÆ\u0012m/\u0010Ý\u0087\u0081*½ÞJEoè\u000e\u009f;\u0002Ã©\u009b\\¨ÀNwi\u001a\u0019\u0081\"4øÛ\u0086N³òL\u0099w\f\u001b³Õ&äÍ\u008ap»äU\u008by>\u0002¥ÞHéÿ\u008db®\u0016J½} !×Úz÷á\u0091\u0094ª8O¯~R;ùÝlï\u0013\u008d\u0086¥*\\Ñ\u001eD3ëÍ\u009eî\u0005\u008b¨º\\`Ã\u0019v5\u001dÎ\u0080è7\u0081Ú¿Ncõ\u0014\u00983\u000fÓ²÷Y\u0080ÍXpgç\u000b\u008a,1Í¤ûK\u009fÿXbq\t\u000f¼3#ÄÖæ}£áG\u0094p;\n\u0099¿\rx°\b'2ÊÒqøä\u0082\u0088C?\u007f¢\rI1üÈcú\u0016»ºD!pÔ\u000e{4îÀ\u0095ÿ8·¬ISmÆ\nm6\u0010Ü\u0087\u009a*§ÞUEoè\u0014\u009f&\u0002Ê©\u0085\\·ÀPwr\u001a\u0018\u0081'4ãÛ\u009bN´òP\u0099v\f\u000e³Á&åÍ\u009ep®äT\u008be>\u0003¥ÂHèÿ\u0091b®\u0016V½h  ×Øzòá\u0091\u0094«8B¯~R:ùÒlï\u0013\u0089\u0086¹*]Ñ\u001aD&ëÌ\u009eí\u0005\u0089¨º\\~Ã\u001fv+\u001dÐ\u0080à7\u0098Ú¢N|õ\t\u0098-\u000fÎ²éY\u009dÍ^p|ç\n\u008a/1È¤ûK\u009fÿXbp\t\u000f¼3#ÄÖå}£áG\u0094p;\n®7UÛø\u009co¾\u0013K\u0086o-\bÐ#Gßê\u009d\u0091½\u0005L¨r_\u000bÂ)ià\u001c\u0098\u0083¿7QÚuA\u0006ô*\u009bå\u000e\u0089µ²YOÌys\u001dæÞ\u008dû\u007fSë\u0094VäÁÞ,>\u0097\u0014\u0002nn¯Ù\u0094Dø¯Ü\u001a&\u0085\u0016ðL\\·Ç\u00872ü\u009dÂ\b4s\rÞUJ¥µ\u0098 ã\u008bÚö0atÌK8³£\u009d\u000eùyÎä2Ohº^&£\u0091\u0086üègÐÒ\u0012=\u007f¨A\u0014¢\u007f\u0087êöU,À\u0013+g\u0096_\u0002 m\u0094ØòC:®\u0005\u0019a\u0084Jðº[\u0090ÆÑ17\u009c\u0006\u0007|rEÞ«I\u0092´È\u001f9\u008a\u001eõ~`MÌ®7ï¢Ò\r>x\u001cãeNJº\u008d%é\u0090Úû<f\u0019Ñj<H¨\u008e\u0013û~Üé?T\u001b¿l+³\u0096\u008b\u0001çlÀ× B\u0017\u00ads\u0019´\u0084\u009dïãZßÅ(0\t$\u009f°X\r(\u009a\u0012wòÌØY¢5c\u0082X\u001f4ô\u0010AêÞÚ«\u0080\u0007{\u009cKi0Æ\u000eSø(Á\u0085\u0099\u0011iîT{/Ð\u0016\u00adü:¸\u0097\u0087c\u007føQU5\"\u0002¿þ\u0014¤á\u0092}oÊJ§!<\u001c\u0089Üfºó\u008dOo$H±:\u000eà\u009bßp«Í\u0090Yn6X\u0083!\u0018þõÉB\u00adß\u0087«v\u0000\\\u009d\u0015jçÇË\\¬)\u0088\u0085{\u0012_ï\u0018DôÑÏ®³;\u0084\u0097al#ù\u001eVô#Ð¸ª\u0015\u008eáA~;Ë\u0014 î=Ô\u008a¥g\u0081óBH7%\u0017²ó\u000fÈä¡p`ÍFZ77\u000e\u008cô\u0019Úö£B}ßH´.\u0001\u000f\u009eàkÜÀ\u0082\\{)T\u00860\u0013\u0016èçE»Ò\u0084®j;S\u0090/4¤ c\u001d\u0013\u008a)gÉÜãI\u0099%X\u0092d\u000f\u0016ä*QÓÎá»¤\u0017D\u008cpy\u000bÖ5CÃ8ü\u0095¥\u0001Rþvk\u0010À-½Ó*\u009b\u0087½sHèjE\u000e2:¯Å\u0004\u0086ñ©mTÚw·\u0017,'\u0099çv\u0081ã¶_V4y¡\u0001\u001eÄ\u008bã`\u0090Ý´IU&c\u0093\u0019\bÀåòR\u0096Ï¼»M\u0010g\u008d.zÜ×ðL\u00979³\u0095@\u0002dÿ#TÎÁô¾\u009c+¢\u0087Z|\u0002é=F×3ö¨\u0092\u0005¡ñan\u001fÛ1°Ì-î\u009a\u0082w¾ãyX\n5,¢È\u001fòô\u009a`[ÝcJ\u000e'*\u009cÎ\tûæ\u0085RCÏj¤\u0014\u0011(\u008eß{øÐ¸L\\9k\u0096\u0013\u0003,øÀU\u0087Â¦¾P+t\u0080\u0013}:êÄG\u0098<¯¨M\u0005hò\u0013o9Äû±\u009d.¬\u009aQwoì\u001eY;6þ£\u0092\u0018©ôR\u0099¿\rx°\b'2ÊÒqøä\u0082\u0088C?~¢\u0019I0üÏcï\u0016¡ºE!tÔ\u000e{-îÌ\u0095ÿ8º¬\\SlÆ\u0012m.\u0010Ý\u0087\u0099*»ÞJEpè\r\u009f;\u0002Ä©\u0085\\³ÀOws\u001a\u0003\u0081<4öÛ\u0086N¬òK\u0099w\f\u001b³Õ&äÍ\u0092p³äU\u008be>\n¥ÂH÷ÿ\u0090b³\u0016W½h  ×Ùzñá\u0091\u0094ª8G¯~R$ùÕló\u0013\u0092\u0086¸*AÑ\u001eD&ëÌ\u009eí\u0005\u0089¨º\\`Ã\u0019v4\u001dÎ\u0080à7\u0098Ú¢Nxõ\t\u00985\u000fÍ²öY\u009cÍ[pgç\u000b\u008a,1Ì¤ûK\u0087ÿZbh\t\u0011¼'#ÙÖã}¿áF\u0094r;\u000f®7UÛø\u009co½\u0013K\u0086s-\fÐ8GÞê\u009f\u0091³\u0005L¨r_\u000bÂ&ià\u001c\u0086\u0083·7EÚtA\u001aô#\u009bñ\u000e\u0088µ®YOÌls\u001cæÝ\u008dù0\u008d§±KIþfe!\bÚ¿õ\"\u008eÉ´}Fàc\u0097\":È¡ñT\u008cû¶o\\\u0012\u001d¹8\u0099¿\rx°\b'6ÊÍqùä\u009d\u0088]?f¢\u0013I)ü×cç\u0016¡ºE!tÔ\u000e{+îÁ\u0095ÿ8¿¬ISmÆ\u000bm6\u0010Ç\u0087\u0080*¼ÞJEpè\r\u009f;\u0002Ë©\u0085\\©ÀUwr\u001a\u0018\u0081'4ãÛ\u009fNµòP\u0099n\f\u0003³Á&úÍ\u0097p®äT\u008bl>\u001f¥ÜHòÿ\u008cb\u00ad\u0016J½} !×Òzêá\u0090\u0094©8G¯~R$ùÕlò\u0013\u0092\u0086¸*AÑ\u001eD&ëÌ\u009eí\u0005\u0089¨º\\`Ã\u0019v5\u0099¿\rx°\b'2ÊÒqøä\u0082\u0088C?}¢\rI-ü×cä\u0016¾ºD!jÔ\u0011{5îÁ\u0095å8¢¬HStÆ\u0013m7\u0010Ä\u0087\u0080*¾ÞJEpè\u000e\u009f;\u0002Ä©\u0085\\³ÀOws\u001a\u0002\u0081<4öÛ\u0086N¬òD\u0099w\f\u001b³Ô&äÍ\u0095pºäU\u008b`>\u0000¥ÂH÷ÿ\u0090b³\u0016W½` <×Çz÷á\u0088\u0094´8Z¯cR8ùÈlî\u0013\u008f\u0086§*\\Ñ\u0002D;ëÒ\u009eð\u0005\u0096¨§\\~Ã\u0004v*\u001dÛ\u0080õ7\u0081Ú¤Nbõ\u0014\u00988\u000fÓ²ëY\u0088Í@pyç\u0016\u008a11Õ¤æK\u0082ÿEbu\t\u0016¼2#ØÖá}»áF\u0094l;\r®.UÚø\u0080o¹\u0013Q\u0086n-\u0014Ð%GÅê\u0082\u0091¨\u0005Q¨h_\u0016Â<iý\u001c\u009cv_â\u0098_èÈÒ%2\u009e\u0018\u000bbg£Ð\u009fMù¦Ð\u00136\u008c\u0005ùAU½Î\u009e;î\u0094Ï\u0001$z\u001f×CC±¼\u008c)é\u0082Ëÿ=hzÅY1ªª\u0090\u0007ípÛí#F\u007f³H/®\u0098\u0088õùnÆÛ\u001c4f¡L\u001d«v\u0097ãû\\5É\u0004\"j\u009f[\u000bµd\u0085ÑÿJ#§\u0014\u0010p\u008dSù¯R\u0088ÏÀ8=\u0095\u0016\u000eq{U×¦@\u0083½Å\u00163\u0083\u000füsiDÅ¢>ã«Ü\u00044q\u0010êvGG³\u009e,ä\u0099Ñò7o\u0015Øy5B¡\u009a\u001aéwÖà)]\u0016¶g\"»\u009f\u0087\bëeÌÞ-K\u001b¤g\u0010°\u008d\u0088æõSÎÌ99\u001d\u0092^\u000e¼{\u008dÔéAÂº:\u0017`\u0080Yü°i\u008eÂï?Ä¨?\u0005x~]ê¬G\u0089°ê-Ý\u0086\u0001ózl^Ø±5\u0095®æ\u001bËt\u0005áiZQ¶®#\u0099\u009cæ\t?b\u0006ßlHN¤ª\u0011\u009a\u008aÛç1P\u000bÍo&K\u0092¦\u000f\u009fxÙÕ5N\f»h\u0014K\u0080½ýáVÙÃ5<\u0011©u\u0002E~¦ëåDÉ±1*\u000e\u0087yðGl\u009dÙæ2Ì¯.\u0018\u000euzáºZ\u009b·ë Õ\u009d-ö\u0018c~ß¼H\u0093¥ì\u001eÒ\u008b(ä\u0006Q@Í¦&\u0094\u0093å\fÔy Ò\u0007OE»©\u0014\u0091\u0081ëúÙW'Ày=F©¶\u0002\u008b\u007f÷èÛE\u001f¾q+K\u0087¯ð\u008amäÆß3\u0003¬w\u0019Pu³î\u008b[ý´!!\u0018\u009aw÷Qc®Ü\u0084Iþ¢$\u001f\u0015\u0088råRQ¢Ê\u009c'Ø\u0090?\r\rfqÓJO§¸á\u0015ß\u008e>û\u000eTtÁG=¡\u0096â\u0003Ý|0é\u0013Bb¿@+\u0080\u0084æñÕj.Ç\u00140o\u00ad@\u0019\u0085rüïÐX2µ\u0018.c\u009a»÷\u0086`÷ÝÉ67£\u0004\u001c^\u0088¤å\u008a^ñËÌ$8\u0091\u0005\n[f©Ó\u008dLì¹Ì\u0012=\u008fzø]TªÁ\u0085:ì\u0097Û\u0000?}zÖSB¯¿\u0088(æ\u0085Üþ\u0002k{ÄP0°\u00ad\u0083\u0006ãs!ì\u0005Yv²S.µ\u009b\u008côåa\"Ú\b7s G\u001c¶\u0089\u0087âÔ_'È\u001e%i\u009eT\nºg\u0083ÐØM(¦\u0014\u0013r\u008cXø£UöÎÆ;7\u0094\n\u0001wzAÖ\u0098Cä¼Ê)3\u0082\bÿxhDÄ\u00821ýªÔ\u00073p\rídY ²\u0086/ò\u0098Íõ4n\u000fÛe7¥ \u0089\u001d÷vÏã9\\\u0006ÉZ%¦\u009e\u008c\u000bèdÉÑ:J{§^\u0013«\u008c\u008fùíRÇÏ?8v\u0095U\u0001¬z\u0088×è@Ý½\u0001\u0016\u007f\u0083Rÿ±h\u0080Åç>Þ«\u001e\u0004vqOí³F\u0084³ä,#\u0099\u0012òyoPÛ¬4\u0084¡Á\u001a%w\u0016àw]UÉ¢\"\u0080\u009fÂ\b(e\u0014ÞjKV§©\u0010õ\u008dÇæ?S\rÌt9Z\u0095¦\u000eÿ{ÈÔ5A\u0006ºy\u0017H\u0083\u009büæiÌÂ(?\f¨z\u0004´q\u0099êëGÛ°)-\u0018\u0086~òºo\u009dØì5É®\"\u001b\u001dtTà¿]\u008a¶ð#Ì\u009c.\t\u001ebDÞ±K\u0093¤ò\u0011Ø\u008a%ç~PFÌ¬9\u0089\u0092é\u000fÚx\u001bÕpNKº¯\u0017\u008c\u0080çýßV\u0017Ãu<L¨²\u0005\u008f~åë D\u001d±p*Q\u0086¯ó\u0082lþÙ$2\u0011¯v\u0018Rt¸á\u0085ZÙ·& \f\u009diöLbºßàHÝ¥5\u001e\u000e\u008boäBP¿Íã&Ð\u00937\f\u0013ycÒAN\u0080»æ\u0014Ó\u0081%ú\u0014WnÀA<\u0085©é\u0002Ö\u007f'è\u0019Ei±»*\u0086\u0087ìðÊm+Æ\u001a3@¯¾\u0018\u0096uîîÔ[\"´\u0001!B\u009d²ö\u0092cóÜÃI\"¢`\u001fF\u008b°ä\u008fQôÊÎ'\"\u0090e\rIyµÒ\u008dOù¸È\u0015\u0016\u008efûXW¬À\u0097=û\u0096;\u0003\u001c|kéOE¯¾\u0081+ÿ\u0084#ñ\u0013jvÇS3·¬\u0087\u0019Ûr'ï\u001fXhµT!º\u009a\u0084÷Þ`(Ý\u00156n£Y\u001f©\u0088ùåÆ^8Ë\u000b$w\u0091O\r\u0095fäÓÐL0¹\u0015\u0012y\u008fEû\u0096TéÁÍ:)\u0097\u0003\u0000}|ºé\u0093Bê¿Ð(*\u0085\u0007þ~j¸Ç\u00880î\u00adÉ\u0006%s\u001cìZX²µ\u008d.ä\u009bÏô:a`Ú_6¶£\u008e\u001cá\u0089Àâ?_cÈR$²\u0091\u0093\nìgÝÐ\u001bMg¦K\u0012ª\u008f\u008bøûUËÎ\u0005;i\u0094T\u0000ª}\u0099ÖáC?¼\u001a)m\u0082Hþ«k\u009aÄÀ1?ª\u0012\u0007npTì£Y\u0085²Â/4\u0098\u0010õnnVÚ 7þ Ç\u001d+v\não\\[È£%ü\u009eÈ\u000b.d\tÑmJ\\¦\u0082\u0013ý\u008cØù0R\u0016Ïn;½\u0094\u0084\u0001êzÚ×(@\u0018½e)¾\u0082\u0089ÿíhÍÅ+>\u001d«Z\u0007²p\u008aíðFÊ³%,\u001e\u0099^õ´n\u008fÛé4Ä¡<\u001a~w\\ã\u00ad\\\u008dÉë\"Ä\u009f\u0001\b\u007feKÑ¯J\u0081§æ\u0010ß\u008d\u0003æwSTÏ³8\u0097\u0095ã\u000e<{\u0007ÔkAE½«\u0016\u009b\u0083ãü9i\u0017Âo?M«¦\u0004\u009cqÂê2G\u0015°p-I\u0099¡òáoÚØ75\u000e®t\u001bLw¦àâ]È¶8#\t\u009cv\t\\e\u0094ÞüKÊ¤0\u0011\u0000\u008a`ç^S\u0084Ìó9Õ\u00922\u000f\u0004x`Ô»A\u0086ºõ\u0017Ï\u00807ý\u0004V]Â¤?\u008a¨õ\u0005Î~8ë\u0002D[°©-\u008d\u0086çóÂl=Ùa2S®¿\u001b\u0091tõáÎZ\"·e I\u009cº\t\u008ebùßÝH\u0017¥y\u001eM\u008a\u00adç\u008bPãÍ!&\u001c\u0093t\fNx«Õ\u0084Nÿ»#\u0014\u001d\u0081túSV¨Ã\u0086<À©9\u0002\u0016\u007fqèUD®±\u0083*Å\u0087)ð\u001amlÆY2½¯ö\u0018Ùu-î\u0011[b´E \u0081\u009dåößc1Ü\u0015Ie¢C\u001e\u0098\u008béäÓQ,Ê\u0016'|\u0093´\f\u009fyêÒÏO/¸\u001b\u0015`\u0081¹ú\u0088WîÀÇ=!\u0096\u001c\u0003B\u007f³è\u0094Eð¾Ö+/\u0084{ñDmªÆ\u009a3è¬Ø\u0019>r{ïW[¬´\u0089!ì\u009aÝ÷\u001d`}ÝJI¨¢\u008a\u001fû\u0088ßå\u001c^sËO'³\u0090\u008c\rçf#Ó\u0018Ls¹P\u0015¶\u008e\u008fûÕT$Á\u0015:q\u0097U\u0003¹|\u008aéÖB)¿\r(f\u0085Cñ½jýÇÛ01\u00ad\u0011\u0006usFï¢XùµÈ.2\u009b\u000eôma\\Ý\u00826û£Ñ\u001c,\u0089\u0017â{^¼Ë\u0098$ö\u0091Î\n(g\u0004ÐjL¢¹\u0088\u0012ñ\u008fÏø(U\u001dÎ]:º\u0097\u0096\u0000ñ}ÕÖ&C\u0002¼[(¨\u0085\u008eþïkÅÄ#1cª[\u0006°s\u008dì÷YÛ²\u001c/x\u0098Sô®a\u008aÚà7ß \u0003\u001dtvPâ«_\u0096Èü%=\u009e\u001b\u000bsdQÐªM\u0084¦þ\u0013$\u008c\u0015ùsRHÎ¹;\u0082\u0094Ý\u0001&z\f×m@K¼ \u0099¿\rx°\b'2ÊÒqøä\u0082\u0088C?\u007f¢\u0019I0üÖcå\u0016¡º]!~Ô\u000e{/îÄ\u0095ÿ8£¬QSlÆ\bm6\u0010Ü\u0087\u0099*§ÞSEdè\u0014\u009f:\u0002Ä©\u0085\\µÀRwl\u001a\u0019\u0081!4þÛ\u0099N\u00adòQ\u0099l\f\u001a³Û&ðÍ\u008bp³äH\u008b`>\u001f¥ÚHüÿ\u008cb²\u0016B½} 8×Ózêá\u0090\u0094¡8[¯gR0ùÈlò\u0013\u008f\u0086 *\\Ñ\u0002D;ëÑ\u009eð\u0005\u0096¨§\\|Ã\u0004v*\u001dÓ\u0080ë7\u0098Ú§Nwõ\t\u0098-\u000fÎ²éY\u009dÍApzç\u0012\u008a11Ì¤ïK\u009eÿ]b}\t\u000f¼3#ÄÖå}£áX\u0094v;\u0010®)UÁø\u0081o¼\u0013W\u0086n-\u0014Ð%GÅê\u0082\u0091¼\u0005L¨r_\u000bÂ\"ià\u001c\u0086\u0083·7JÚtA\u0006ô#\u009bþ\u000e\u0088µ°YNÌys\u0001æÖ\u008dæ0\u0093§¬KWþ{e<\bÐ¿ë\"\u0090É®}Xàa\u0097>:É¡íT\u008eû£o]\u0012\u0001¹9,ÖÓñF\u0095í¥\u0091C\u0004\u0005«)^ÑÅïh\u0099\u001f½\u0083~6\u001dÝ-@Í÷ê\u009a\u008e\u000eAµ{X\u0014Ï.rÔ\u0019å\u008c\u008b0B§tJ\u0015ñ3d×\u000bã¾¾\"GÉk|\u000fã+\u0096Û=ÿ »TPûon\u0013\u0015'¸Å/\u0083Ò³FMím\u0090\n\u0007/ªáQ\u0085Ä¶hQ\u001fu\u0082\u0019)!ÜøC\u0089ö±\u009aM\u0001j´\u001d[ÁÎùu\u0091\u0018±\u008cI3e¦\u0003MÅðég\u0091\n©¾Y%}È=\u007fÒâí\u0089\u008e<© ZW\u0000ú:aÞ\u0014î»\u008b.§Ò_y\u0003ì7\u0093Ù\u0006ó\u00ad\u0097P£Äyk\u0007\u001e+\u0085Ï(í&J²\u008d\u000fý\u0098Çu'Î\r[w7¶\u0080\u008a\u001díöÅC8Ü\u0013©T\u0005°\u009e\u0081kûÄÙQ8*\n\u0087M\u0013 ì\u0099yçÒÛ¯(8l\u0095Fa¿ú\u0085Wø Î½*\u0016jã]\u007f»È\u009c¥ì>Ô\u008b\u0016drñLM¥&\u009b³û\f4\u0099\u0010rkÏ[[¹4\u0099\u0081ê\u001a6÷\u0001@eÝF©¸\u0002\u0088\u009fÔh/Å\u0002^d+X\u0087»\u0010\u008bíÑF Ó\u0004¬g9U\u0095¼nöûÎT&!\u001bºb\u0017Nã\u0089|îÉÞ¢!?\u0014\u0088meWñ\u0089Jã'Ù°'\r\u001eæprµÏ\u008bXã5Ä\u008e \u001b\u0013ôr@°Ý\u0087¶æ\u0003Ç\u009c-i\u0014ÂL^³+\u0086\u0084þ\u0011Âê1GoÐQ¬ 9\u0087\u0092àoÖø*Uv.Aº¢\u0017\u0086àö}ÈÖ\u0014£o<F\u0088¤e\u0080þóKß$\u0010±`\nDæ¿s\u008cÌöY)2\u0013\u008fy\u0018Xô·A\u008fÚÊ·*\u0000\u001e\u009dev\\Â\u00ad_\u008b(É\u0085 \u001e\u0019ëgD]Ðµ\u00adõ\u0006Ó\u0093!l\u001aùaRO.µ»ï\u0014Ýá/z\u0007×q S<\u0096\u0089òbÆÿ=H\u0002%t±´\n\u0090çãpÂÍ ¦\f3w\u008f£\u0018\u009cõçNÒÛ#´\u0010\u0001J\u009d²v\u0081Ãø\\Á)/\u0082\u0016\u001fEë½D\u0087ÑþªÌ\u0007(\u0090hmJù¸R\u0084/ü¸Õ\u0015\u0014îp{@×  \u0080=ì\u0096Ôc\bü|ID%¦¾\u0082\u000böä5q\u000bÊj§D3»\u008c\u0092\u0019ëò1O\u0002Øzµ^\u0001¸\u009a\u0089w×À+]\u00186|\u0083W\u001f¯èîEÍÞ>«\u0006\u0004~\u0091TmªÆìSÜ,8¹\u0018\u0012wïH{\u0094Ôè¡ß:%\u0097\u001a`nýJI\u008e\"è¿Ú\b:å\u0012~sÊ¶§\u00920ç\u008dÙf\"ó\u0012LJØªµ\u009e\u000eú\u009bßt1Á\nZV6£\u0083\u0084\u001cæéÞB6ßa¨R\u0004¾\u0091\u009bjÿÇÎP6-n\u0086H\u0012ºï\u0086xóÕ×®\u0016;r\u0094F`ºý\u0082Vî#*¼\u000e\u001c\u001f\u0088Ø5¨¢\u0092OrôXa\"\rãºÞ'¹Ì\u0090yoæO\u0093\u0001?å¤ÔQ®þ\u008dkl\u0010_½\u001a)üÖÌC²è\u008e\u0095}\u00028¯\u0013[êÀÉm¡\u001a\u009b\u0087\u007f,<Ù\bEîòÈ\u009f¹\u0004\u009d±X^&Ë\u0010wð\u001cÖ\u0089®6a£]H7õ\u000eaô\u000eÍ»¿ \u007fÍIz-ç\u000e\u0093ê8Ý¥\u0099RrÿJd)\u0011\u0001½û*ß×\u0098|uéO\u0096(\u0003\u0005¯üT¢Á\u009bns\u001bP\u0080.-\u000fÙÁF¼ó\u009e\u0098n\u0005T²%_\u0002ËÂp³\u001d\u0090\u008as7WÜ HÿõÇb²\u000f\u0084´t!ZÎ#zýçÈ\u008c±9\u0089¦ySAø\u001cdú\u0011Í¾±+\u008aÐc}!ê\u0011\u0096ë\u0003Ï¨¨U\u0082Â\u007fo7\u0014\t\u0080í-ÎÚ¬G\u009dìA\u0099:\u0006\u0011²ñ_ÉÄ¤q\u0083\u001eE\u008b70\u0010ÜòIØö¡cw\bFµ3\"\u000bÎ÷{Äà\u009d\u008dd:J§3L\u0000øøeÞ\u0012\u009c¿u$LÑ2~\bêà\u0097 <\u0086©wVNÃ4h\u000e\u0014þ\u0081¸.\u0095Ûr@Rí$\u009a\u0003\u0006Ý³¦X\u0096ÅprV\u001f'\u008bû0ÄÝªJ\u0090÷k\u009cX\t\"µý\"ÖÏ¬t\u008eáb\u008e];\u001d§òLÊù¯f\u0088\u0013{¸_%\u001bÑ÷~Ïë¯\u0090\u0080=|ª\"W\u0018ÃõhÐ\u0015¶\u0082\u0084/XÔ$A\níð\u009aÏ\u0007¸¬\u009eY_Æ6s\f\u001fî\u0084Ö1¼ÞtKGð3\u009d\r\tô¶Ú#«ÈeuUâ/\u008f\u0013;ä ÀM\u0083ú\u007fgX\f0¹\u000f%ïÒ¡\u007f\u0085äv\u0091S>5«\u0002Wãü¢i\u0094\u0016v\u0083S(+Õ\u0001AÞî§\u009b\u0091\u0000q\u00adUZ&Ç\u0000sÅ\u0018©\u0085\u00912ißYD!ðü\u009dÞ\n\u00ad·\u0091\\iÉNv\u0001âû\u008fÓ4®¡\u0094NfûK`\u0002\fè¹Ò&¦Ó\u0096xcå?\u0092\u0007>ë«ÎP¨ý\u009bj`\u0017;¼\b(îÕÍB¥ï\u009c\u0094B\u0001;®\u0012ZðÇÖl§\u0019~\u0099¿\rx°\b'7ÊÇqùä\u009d\u0088]?f¢\u0010I/üÎcú\u0016 º[!kÔ\u000f{-îØ\u0095þ8»¬IStÆ\u0006m6\u0010Ü\u0087\u009a*§ÞPEkè\u0014\u009f \u0002Ç©\u0085\\©ÀTwr\u001a\u0004\u0081#4ùÛ\u0086N°òO\u0099l\f\u001a³À&ðÍ\u008bp³äJ\u008bl>\u001f¥ÃHüÿ\u008cb²\u0016K½a  ×Æzóá\u0091\u0094¯8B¯~R8ù×lô\u0013\u0092\u0086¸*HÑ\u0003D8ëØ\u009eð\u0005\u0096¨§\\|Ã\u0004v0\u001d×\u0080õ7\u0080Ú«Nbõ\b\u00981\u000fÍ²öY\u0080Í_prç\n\u008a01É¤äK\u009eÿ]b|\t\u000f¼3#ÄÖä}£á^\u0094x;\u0010®6UÇø\u0098o¤\u0013Q\u0086t-\u0015Ð9GÂê\u0098\u0091©\u0005X¨o_\u0016Â%iõ\u001c\u0087\u0083«7JÚtA\u0006ô&\u009bù\u000e\u0088µ®YOÌbs\u001cæÂ\u008dû0\u0099§°KVþge4\bÄ¿ö\"\u0096É«}Xà~\u0097<:Õ¡ìT\u0092û¨o@\u0012\u0000¹&,ÔÓïF\u0094í \u0091G\u0004\u0005«)^ÑÅíh\u0099\u001f¡\u0083{6\u0019Ý-@Ñ÷é\u009a\u0082\u000eAµeX\u0015Ï7rÕ\u0019ù\u008c\u00810X§iJ\u0011ñ)dÖ\u000bü¾¾\"\\Éj|\nã-\u0096Û=ÿ »TWûon\u000f\u00159¸Ý/\u009dÒ²FMíj\u0090\u000e\u0007:ªàQ\u009aÄ¾hN\u001fo\u0082\u0001)?ÜãC\u0096ö°\u009aS\u0001l´\u0007[ÀÎüu\u0093\u0018±\u008cU3d¦\u0003MÅðég\u0090\n¬¾Y%}È<\u007fÙâí\u0089\u008d<¯ BW\u0001ú%aÖ\u0014ó»\u0095.¥Ò_y\u001aì<\u0093Ì\u0006ò\u00ad\u0089P¥Ä`k\u001d\u001e3\u0085Ñ(éß\u0083B§öe\u009d\u0013\u00001·ÒZøÁ\u0083uZ\u0018f\u008f\f2/ÙÍLúó gZ\ns±\u000e$.ËÆ~ÿå£\u0089V<w£\u0013V.ýÈ`\u0080\u0017¦»U.mÕ\u0014x#ïÊ\u0092\u00859©\u00adPPfÇ\u0019j!\u0011ã\u0084\u0087+³ßDBwé\u0002\u009cÕ\u0003ä¶\u0093]»ÁUty\u001b\u0000\u008e×5éØ\u0092O¨óVfc\r;°Ç'òÊ\u008dq´åZ\u0088f?9¢ÈIúü\u0092c¸\u0017Bº\u0018!&ÔÐ{ìî\u008b\u0095º9\u007f¬\u0018S+ÆÕmõ\u0010\u0099\u0087¢+zÞ\tE9èÓ\u009f÷\u0002\u0083¶[]gÀ\u000bw)\u001aÉ\u0081û4\u0083Ø]Orò\u000f\u0099-\fÆ³ü&¢Ê^qsä\u0010\u008b*>Ã¥\u0081H¥üScq\u0016\u0015½9 Ç×\u009az©îM\u0095k8\u000f¯=Ráù\u009fl°\u0010Q\u0087a*\u001bÑ#Døë\u009d\u009e¯\u0002S©g\\\u0007ÃÃvç\u001d\u0095\u0080\u00ad4WÛgN9õß\u0098ë\u000f\u0096²ª&XÍap>çÉ\u008aí1\u008b¤¨H]ÿ\u001eb<\tÊ¼ï#\u0088Ö»z_á\u001d\u00943;Ï®óU\u0081ø¨lc\u0013\u0007\u00865-ÅÐ÷G\u0087ëY\u009ep\u0005\u000b¨/_ÌÂäi\u009f\u001dC\u0080w7\u0011Ú3A×ôã\u009b¾\u000fG²kY\bÌ)sÛæã\u008d½1]¤oK\u000fþ-eÜ\b\u009e¿³#MÖn}\u000bà:\u0097à:\u009d¡µUNøho\u0001\u0012?¹ã,\u0090Ó³GSêw\u0091\u0004\u0004Ø«ç^\u008bÅ¨iM\u001c{\u0083\u001f6ÜÝñ@\u008f÷³\u009bA\u000eaµ#XÛÏôr\u008c\u0019·\u008dG0\u0014§$JÕñòd\u0095\u000b¹¿G\"\u001cÉ)|Ñãê\u0096\u0096=¼¡yT\u001dû*nÐ\u0015í¸\u0080/¾ÓdF\u0011í;\u0090Ò\u0007äª\u0085^^Åfh\f\u001f$\u0082×)çÜ¸@Z÷k\u009a\u000f\u0001(´Å[ÿÎ¿rQ\u0019s\u008c\u001337¦ÀM\u009eð§dK\u000bh¾\t%;ÈÃ\u007f\u009câ·\u0096O=m \u0006W<úâa\u009f\u0014³¸P/iÒ\u0001yÁìú\u0093\u0097\u0006®ªTQaÄ\nkÂ\u001eè\u0085\u0096(¯ÜVC|ö:\u009dÚ\u0000ê·\u0090Z®ÎFu~\u0018$\u008fÐ2òÙ\u0092L¤ðEg\u001b\n&±Ò$ïË\u0097~»ây\u0089\u001a<+£ÓVìý\u0098`¾\u0014x»\u0017.,ÕÒxìï\u0082\u0093@\u0006f\u00ad\u0010P)ÇÔjú\u0011\u0084\u0085](hß\u000eB(éÀ\u009cü\u0003½·XZmÁ\u0011t-\u001bÀ\u008e\u00815ºÙTLnó\u0014f\"\rÅ°\u0082'¨ËV~hå\u0016\u0088#?ÿ¢\u0087I«ýK``\u0017\u001bº !ûÔ\u0088{®ïH\u0092mÜÓH\u0014õdb^\u008f¾4\u0094¡îÍ/z\u0010ç~\f\\¹º&\u0089SÍÿ2d\u0018\u0091b>X«¬Ð\u0093}Õé%\u0016\u0001\u0083f(ZU«ÂøoË\u009b'\u0000\u0007\u00adxÚMG¦ìé\u0019Ù\u0085#2\u0003_lÄIq\u008f\u009eô\u000bß·<Ü\u001aImö\u00adc\u0095\u0088þ5Ø¡9Î\t{nà·\r\u0085ºá'ËS:ø\teX\u0092«?\u0087¤èÑØ}*ê\u000b\u0017R¼¤)\u0099VâÃÕo1\u0094r\u0001V®¡Û\u009d@æíË\u0019\r\u0086i3ZX¼Å\u0099rì\u009fÆ\u000b\u000e°dÝ]J ÷\u009a\u001cð\u008815\u0013¢fÏDt¤á\u0097\u000eóº4'\u001dLcù@f®\u0093\u00908Ñ¤1Ñ\u0001~bëG\u0010¶½ö*ÈV&Ã\u001fhc\u0095T\u0002¦¯îÔÄ@=í\u0004\u001az\u0087D,\u008cYêÆÛr&\u009f\u0018\u0004v±OÞ\u009dKäðÞ\u001c'\u0089\u00016p£²È\u009euáâÁ\u000e.»\u0016 SM´ú\u0087gã\u008cÄ8!¥\u0013ÒP\u007f¾ä\u0080\u0011á¾Æ*1WmüUiº\u0096\u009d\u0003ù¨ÉÔ/AiîE\u001b½\u0080\u0080-õZÑÆ\u0011st\u0098A\u0005½²\u0086ßâK-ð\u0015\u001d~\u008aW7¹\\\u008bÉïu.â\u0018\u000fu´_!¤N\u008dûÌg*\u008c\u001b9h¦XÓªx\u008båÉ\u0011%¾\u001d+aPUý±jñ\u0097Ò\u0003!¨\u001dÕeBOï\u008d\u0014é\u0081Ù-8Z\u0019ÇalS\u0099\u0093\u0006ÿ³Àß>D\u0004ñj\u001e¬\u008b\u00900æ]ÜÉ%v\fãr\b¨µ\u009a\"÷OÞû(`\n\u008dS:ª§\u0098ÌåyÛå(\u0012q¿H$¦Q\u009cþìkÔ\u0097.<w©EÖ¡C\u0080èæ\u0015Ñ\u0081\r.t[[À½m\u0099\u009aè\u0007Ì³\tØeE\\ò \u001f\u0095\u0084ñ00]\u0015ÊawC\u009c£\t\u0096¶Ì\"7O\u001fôbaD\u008e®;\u008e ÎÌ$y\u001fæg\u0013Z¸°%óRÒþ&k\u0000\u0090b=Iª²×è|Ûè9\u0015\u001e\u0082k/DT\u008fÁënÞ\u009a&\u0007\u001b¬wÙ³F\u0092óç\u0018Ã\u0084'1\u000e".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 3895);
        MediaDescriptionCompat = cArr;
        MediaMetadataCompat = -2253667965514871479L;
    }

    static {
        byte[] bArr = new byte[1331];
        System.arraycopy("\u0002m¾jî\u0005íþ\u0001\u00001µ\nèÿAÕêèÿ\u001aÜ\u0006øôö\u0005úè$ä\u0004æ\u0010.½\u0006î\u00024æÖ\u0002ê\u001aéï÷\u000bò\u0006ùî\u0005íþ\u0001\u00001º÷@ÖÕ\u0001ú\nó%Òø\u0007ó\u0000÷\u0006÷\u0003\u0013ßøûþñî\u0005íþ\u0001\u00001³\bÿéDÓèÿé/Ïü\u0003øýíþ\fè\u0006õüýì)àøöö\u0002\u001dÜøý\u0014âò\u0002î\u0007î\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@à×\u0007õý\u001aÒø\u0000\u0007èýì-Ôðü\u001eæî\u001dâì\u000eôî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@æÏþøøê\u0006\u0000\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002þÿþð\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýî\u0010ðò\u000b\u0011äöõ\u0019ððò\u000bî\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíûï æ\u0000ýì*Üøý\râøúýì+Ðõ\u000eñ\u0002\fîì\u0017æ÷\u0003ñõüýì\u001cëìþþû!Ï\u0004\u0001ê\u0006õüî\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ýýì\"Ù\u0006ú\u0004æ\u0010.½\u0006î\u00024äÈ\u0010ùð÷\u0006õüñò\u000bð\bûòî\u0005íþ\u0001\u00001³\bÿéDÞáç/Ê\fòõýì+Úÿø\u001cÖ\u0002êýì\u001bàõ\rö\u0010âøúî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@ÙÜ\u0001öõ)\u0002ò\u0002î\u0007éþû\bòõ\u001bçñ\bÿø\u000bæ÷\u0003\u0013ßøûþñýì\u001fÙ\bíû\tü\fÚ\u000eè\n\u001cÊþ\fè\u0006õü\u0006éú&Ö\u0005úè$äýì\"Ù\u0006öþøÿî ãì\u000e\tÚ\u000eè\n\u0013çé\u0003ýì\"çä(áç1Ï\u0006úýì\u001bîì\u0017æ÷\u0003ñõüô\u0006ìø\tü\rèÿðó\u0006÷\u0003\u0012èîú÷î\u0005íþ\u0001\u00001³\bÿéDÓèÿé\bíÿþñ\f\råê\u0010\u001fÎ\u0005\fÚ\u000eè\nýì*Ô\u0006ìø\tü\u001cÎö\u001cæ÷\u0003ýì#Øü\u0002\u0012Ù\bíû\u001aæ÷\u0003ñõüð÷\u0003\u0002ýì\"ßö\u0000÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöýì,Ýìø!Ù\u0006úúø\u0000\u0007ðþê\u0010\u0013ãì\u000e\tÚ\u000eè\nýì\u001cëìþþû%Üê\u001aåê\u0010î\u0005íþ\u0001\u00001µ\nô\u0002ð\u0003ôüðFÆúò\u0007.æÚò\u0007\u0019Ùôû\u001bØ\u0007ýè\u0006õüïüó\fîù\u001e×\u000fêù\u001céý\nà&Úý\u001aÚùð\bûíî\u0005íþ\u0001\u00001¼\u0003üö\u0003.èÇ\föõ\u0016Ý\fùóýì\"ßö\u0013âþò\u0003\u0003ýì\u0015æûý%Ïüõýþþô\u001aæ÷\u0003ñõüî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@Åí\få\u0011úñ\u00022åÍ\få\u0011úñ\u0002\bíÿþñ\f\u0011Ú\nùõðöýì\u001cëìþþû#Úú\u0000ç\u0004ó+Úô\u0006ãýì$áç\"èð\u0006ÿè+Úô\u0006ãýì\u0018éö\u0005ðó\u001eàõ\rö\u0010âøúýì\u001cåê\u0010ýì äûî\tì.Öí\nîýì+Úú\u0000ç\u0004ó\u001cåê\u0010î\u0005íþ\u0001\u00001Æïüõ\nòõAÖæ\u0002ê\bü\u000fÙ\búüî\bò\u0006ùíýì\u001cÚý\u0004ö\u0002\u0004æ\u0010.´ü\u0006ø9ÝÞñúýìî\u0005íþ\u0001\u00001´ü\u0006ø9çÜé\t*ýúýï\u0006ú\u0004æ\u0010.»\u0000õ<Æö\u0002êú\tìAÖÚ\u000eî\u0005þê\t\u001cÖ\u0002êú\tìüü\tâ\"\u0004æ\u0010.»\u0000õ<Æö\u0002êú\tìAæÖ\u0002êú\tì\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýêî\u0005íþ\u0001\u00001²\t\u0000øýìAäÈ\u0003\nî\u0005þúñ\u0002\u0014Þñú\u0019èÿéýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü\u0015Ö\u0004\u0006ýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü&Öúø\u0003\büýì\"çä\n÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü#Òø*Öúø\u0003ýì\u001cëìþþû%Üê'àøú\u001cÊþ\fè\u0006õü\u0004æ\u0010.´ü\u0006ø9Æïü\u0006éþû\bòõA½ø\u0007óó@ÝØ\u0007óø\u0007ó\u0002ýø\u0007óïý\u0006ôö\u0004\u0013ãÿéùþ\bü\fÚ\u000eè\níô\u0006ìø\tü\rèÿðó\u0006÷\u0003ýì\"çä\u001dâþò\u0003\u0003\bíÿþñ\f\råê\u0010".getBytes("ISO-8859-1"), 0, bArr, 0, 1331);
        ParcelableVolumeInfo = bArr;
        PlaybackStateCompat = 30;
        IconCompatParcelizer();
        RatingCompat = 0;
        MediaBrowserCompatMediaItem = 1;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x053c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0541  */
    /* JADX WARN: Code duplicated, block: B:111:0x0548 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0568  */
    /* JADX WARN: Code duplicated, block: B:118:0x056e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0576 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0596  */
    /* JADX WARN: Code duplicated, block: B:128:0x05bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x05df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:213:0x05fb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final Object store(getTraversalIndexdelegate gettraversalindexdelegate, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        int i;
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(this, gettraversalindexdelegate, shortNewsContentCardView);
        try {
            byte[] bArr = ParcelableVolumeInfo;
            char c = 792;
            Object[] objArr6 = new Object[1];
            a(bArr[108], bArr[792], (short) 751, objArr6);
            char c2 = 0;
            Class<?> cls = Class.forName((String) objArr6[0]);
            byte b = bArr[551];
            byte b2 = bArr[465];
            Object[] objArr7 = new Object[1];
            a(b, b2, (short) (b2 | 1296), objArr7);
            int i2 = 308 - (((Float) cls.getMethod((String) objArr7[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls.getMethod((String) objArr7[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1));
            try {
                Object[] objArr8 = {"", "", 0, 0};
                Object[] objArr9 = new Object[1];
                a(bArr[108], bArr[78], bArr[14], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b3 = bArr[125];
                Object[] objArr10 = new Object[1];
                a(b3, bArr[31], b3, objArr10);
                String str = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                a(bArr[792], bArr[78], bArr[20], objArr11);
                Object[] objArr12 = new Object[1];
                a(bArr[792], bArr[78], bArr[20], objArr12);
                int iIntValue = 3588 - ((Integer) cls2.getMethod(str, Class.forName((String) objArr11[0]), Class.forName((String) objArr12[0]), Integer.TYPE, Integer.TYPE).invoke(null, objArr8)).intValue();
                try {
                    Object[] objArr13 = {0, 0};
                    Object[] objArr14 = new Object[1];
                    a(bArr[108], bArr[170], (short) 551, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    a(bArr[121], bArr[92], (short) 1316, objArr15);
                    Object[] objArr16 = new Object[1];
                    b(i2, iIntValue, (char) (((Integer) cls3.getMethod((String) objArr15[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr13)).intValue() + 17772), objArr16);
                    String str2 = (String) objArr16[0];
                    try {
                        Object[] objArr17 = new Object[1];
                        a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr17);
                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        a(bArr[551], bArr[125], (short) 1164, objArr18);
                        int iIntValue2 = 1 - (((Integer) cls4.getMethod((String) objArr18[0], null).invoke(null, null)).intValue() >> 16);
                        try {
                            Object[] objArr19 = {0L};
                            byte b4 = bArr[108];
                            int i3 = PlaybackStateCompat;
                            short s = (short) 1089;
                            Object[] objArr20 = new Object[1];
                            a(b4, (byte) i3, s, objArr20);
                            Class<?> cls5 = Class.forName((String) objArr20[0]);
                            Object[] objArr21 = new Object[1];
                            a(bArr[551], bArr[78], (short) 1141, objArr21);
                            int iIntValue3 = ((Integer) cls5.getMethod((String) objArr21[0], Long.TYPE).invoke(null, objArr19)).intValue() + 123;
                            try {
                                Object[] objArr22 = {0, 0};
                                Object[] objArr23 = new Object[1];
                                a(bArr[108], (byte) i3, s, objArr23);
                                Class<?> cls6 = Class.forName((String) objArr23[0]);
                                Object[] objArr24 = new Object[1];
                                a(bArr[551], bArr[774], (short) 1186, objArr24);
                                Object[] objArr25 = new Object[1];
                                b(iIntValue2, iIntValue3, (char) ((-1) - (((Long) cls6.getMethod((String) objArr24[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr22)).longValue() > 0L ? 1 : (((Long) cls6.getMethod((String) objArr24[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr22)).longValue() == 0L ? 0 : -1))), objArr25);
                                Object[] objArr26 = {(String) objArr25[0]};
                                byte b5 = bArr[792];
                                byte b6 = bArr[271];
                                Object[] objArr27 = new Object[1];
                                a(b5, b6, (short) (b6 | 178), objArr27);
                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                byte b7 = bArr[0];
                                Object[] objArr28 = new Object[1];
                                a((byte) i3, b7, (short) (b7 | 204), objArr28);
                                String str3 = (String) objArr28[0];
                                byte b8 = bArr[792];
                                byte b9 = bArr[271];
                                Object[] objArr29 = new Object[1];
                                a(b8, b9, (short) (b9 | 178), objArr29);
                                Object[] objArr30 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr29[0])).invoke(str2, objArr26);
                                int[] iArr = new int[objArr30.length];
                                int i4 = 0;
                                while (i4 < objArr30.length) {
                                    Object[] objArr31 = {objArr30[i4]};
                                    byte[] bArr2 = ParcelableVolumeInfo;
                                    short s2 = (short) 210;
                                    Object[] objArr32 = new Object[1];
                                    a(bArr2[c], bArr2[170], s2, objArr32);
                                    Class<?> cls8 = Class.forName((String) objArr32[c2]);
                                    Object[] objArr33 = new Object[1];
                                    a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr33);
                                    String str4 = (String) objArr33[c2];
                                    byte b10 = bArr2[c];
                                    byte b11 = bArr2[271];
                                    Object[] objArr34 = new Object[1];
                                    a(b10, b11, (short) (b11 | 178), objArr34);
                                    Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr34[0])).invoke(null, objArr31);
                                    Object[] objArr35 = new Object[1];
                                    a(bArr2[792], bArr2[170], s2, objArr35);
                                    Class<?> cls9 = Class.forName((String) objArr35[0]);
                                    Object[] objArr36 = new Object[1];
                                    a(bArr2[125], bArr2[5], (short) 232, objArr36);
                                    iArr[i4] = ((Integer) cls9.getMethod((String) objArr36[0], null).invoke(objInvoke, null)).intValue();
                                    i4++;
                                    c2 = 0;
                                    c = 792;
                                }
                                int i5 = 0;
                                while (true) {
                                    int i6 = i5 + 1;
                                    int i7 = 8;
                                    try {
                                        switch (cleartextsubstitutiondefault.read(iArr[i5])) {
                                            case -36:
                                                i5 = 83;
                                                break;
                                            case -35:
                                                cleartextsubstitutiondefault.read(21);
                                                i6 = cleartextsubstitutiondefault.IconCompatParcelizer != 6 ? 68 : 28;
                                                i5 = i6;
                                                break;
                                            case -34:
                                                i5 = 78;
                                                break;
                                            case -33:
                                                cleartextsubstitutiondefault.read(21);
                                                i6 = cleartextsubstitutiondefault.IconCompatParcelizer != 89 ? 38 : 63;
                                                i5 = i6;
                                                break;
                                            case -32:
                                                i5 = 26;
                                                break;
                                            case -31:
                                                i5 = 77;
                                                break;
                                            case -30:
                                                try {
                                                    cleartextsubstitutiondefault.read(31);
                                                    i7 = cleartextsubstitutiondefault.IconCompatParcelizer;
                                                    if (i7 == 0) {
                                                        i6 = 76;
                                                    }
                                                    i5 = i6;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    byte[] bArr3 = ParcelableVolumeInfo;
                                                    byte b12 = bArr3[792];
                                                    byte b13 = bArr3[33];
                                                    objArr = new Object[1];
                                                    a(b12, b13, (short) (b13 | 322), objArr);
                                                    if (Class.forName((String) objArr[0]).isInstance(th) || i5 < 2 || i5 >= 26) {
                                                        byte b14 = bArr3[792];
                                                        byte b15 = bArr3[33];
                                                        objArr2 = new Object[1];
                                                        a(b14, b15, (short) (b15 | 322), objArr2);
                                                        if (Class.forName((String) objArr2[0]).isInstance(th) || i5 < 4 || i5 >= 5) {
                                                            byte b16 = bArr3[792];
                                                            byte b17 = bArr3[33];
                                                            objArr3 = new Object[1];
                                                            a(b16, b17, (short) (b17 | 322), objArr3);
                                                            if (Class.forName((String) objArr3[0]).isInstance(th) || i5 < 6 || i5 >= 26) {
                                                                byte b18 = bArr3[792];
                                                                byte b19 = bArr3[33];
                                                                objArr4 = new Object[1];
                                                                a(b18, b19, (short) (b19 | 322), objArr4);
                                                                if (Class.forName((String) objArr4[0]).isInstance(th) || i5 < i7 || i5 >= 26) {
                                                                    byte b20 = bArr3[792];
                                                                    byte b21 = bArr3[33];
                                                                    objArr5 = new Object[1];
                                                                    a(b20, b21, (short) (b21 | 322), objArr5);
                                                                    if (Class.forName((String) objArr5[0]).isInstance(th) || i5 < 10 || i5 >= 11) {
                                                                        if (i5 >= 64 || i5 >= 68) {
                                                                            throw th;
                                                                        }
                                                                        i5 = 62;
                                                                    }
                                                                }
                                                                i5 = 88;
                                                            } else {
                                                                i5 = 89;
                                                            }
                                                        } else {
                                                            i5 = 89;
                                                        }
                                                    } else {
                                                        i5 = 88;
                                                    }
                                                    cleartextsubstitutiondefault.serializer = th;
                                                    cleartextsubstitutiondefault.read(24);
                                                }
                                                break;
                                            case -29:
                                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                                cleartextsubstitutiondefault.read(2);
                                                cleartextsubstitutiondefault.read(13);
                                                RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                                                i5 = i6;
                                                break;
                                            case -28:
                                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                                                cleartextsubstitutiondefault.read(10);
                                                i5 = i6;
                                                break;
                                            case -27:
                                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                                cleartextsubstitutiondefault.read(2);
                                                try {
                                                    cleartextsubstitutiondefault.read(3);
                                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = cleartextsubstitutiondefault.write.hashCode();
                                                    cleartextsubstitutiondefault.read(10);
                                                    i5 = i6;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    byte[] bArr4 = ParcelableVolumeInfo;
                                                    byte b110 = bArr4[792];
                                                    byte b111 = bArr4[33];
                                                    objArr = new Object[1];
                                                    a(b110, b111, (short) (b111 | 322), objArr);
                                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b112 = bArr4[792];
                                                    byte b113 = bArr4[33];
                                                    objArr2 = new Object[1];
                                                    a(b112, b113, (short) (b113 | 322), objArr2);
                                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b114 = bArr4[792];
                                                    byte b115 = bArr4[33];
                                                    objArr3 = new Object[1];
                                                    a(b114, b115, (short) (b115 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b116 = bArr4[792];
                                                    byte b117 = bArr4[33];
                                                    objArr4 = new Object[1];
                                                    a(b116, b117, (short) (b117 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    }
                                                    byte b22 = bArr4[792];
                                                    byte b23 = bArr4[33];
                                                    objArr5 = new Object[1];
                                                    a(b22, b23, (short) (b23 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    if (i5 >= 64) {
                                                    }
                                                    throw th;
                                                }
                                                break;
                                            case -26:
                                                cleartextsubstitutiondefault.read(8);
                                                throw ((Throwable) cleartextsubstitutiondefault.write);
                                            case -25:
                                                i5 = 79;
                                                break;
                                            case -24:
                                                i5 = 81;
                                                break;
                                            case -23:
                                                try {
                                                    cleartextsubstitutiondefault.read(14);
                                                    if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                                        i6 = 61;
                                                    }
                                                    i5 = i6;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    byte[] bArr5 = ParcelableVolumeInfo;
                                                    byte b118 = bArr5[792];
                                                    byte b119 = bArr5[33];
                                                    objArr = new Object[1];
                                                    a(b118, b119, (short) (b119 | 322), objArr);
                                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1110 = bArr5[792];
                                                    byte b1111 = bArr5[33];
                                                    objArr2 = new Object[1];
                                                    a(b1110, b1111, (short) (b1111 | 322), objArr2);
                                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1112 = bArr5[792];
                                                    byte b1113 = bArr5[33];
                                                    objArr3 = new Object[1];
                                                    a(b1112, b1113, (short) (b1113 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1114 = bArr5[792];
                                                    byte b1115 = bArr5[33];
                                                    objArr4 = new Object[1];
                                                    a(b1114, b1115, (short) (b1115 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    }
                                                    byte b24 = bArr5[792];
                                                    byte b25 = bArr5[33];
                                                    objArr5 = new Object[1];
                                                    a(b24, b25, (short) (b25 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    if (i5 >= 64) {
                                                    }
                                                    throw th;
                                                }
                                                break;
                                            case -22:
                                                i5 = 36;
                                                break;
                                            case -21:
                                                i5 = 51;
                                                break;
                                            case -20:
                                                cleartextsubstitutiondefault.read(14);
                                                if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                                    i6 = 50;
                                                }
                                                i5 = i6;
                                                break;
                                            case -19:
                                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                                cleartextsubstitutiondefault.read(2);
                                                cleartextsubstitutiondefault.read(13);
                                                MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                                                i5 = i6;
                                                break;
                                            case -18:
                                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                                                cleartextsubstitutiondefault.read(10);
                                                i5 = i6;
                                                break;
                                            case -17:
                                                cleartextsubstitutiondefault.read(8);
                                                return cleartextsubstitutiondefault.write;
                                            case -16:
                                                i5 = 1;
                                                break;
                                            case -15:
                                                i5 = 40;
                                                break;
                                            case Float16.MinExponent /* -14 */:
                                                cleartextsubstitutiondefault.serializer = createFromParcel.INSTANCE;
                                                i = 4;
                                                cleartextsubstitutiondefault.read(i);
                                                i5 = i6;
                                                break;
                                            case -13:
                                                i5 = 52;
                                                break;
                                            case -12:
                                                i5 = 84;
                                                break;
                                            case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                                i5 = 86;
                                                break;
                                            case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                                cleartextsubstitutiondefault.read(116);
                                                if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                                    i6 = 25;
                                                }
                                                i5 = i6;
                                                break;
                                            case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                                cleartextsubstitutiondefault.serializer = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = 4;
                                                cleartextsubstitutiondefault.read(i);
                                                i5 = i6;
                                                break;
                                            case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 3;
                                                cleartextsubstitutiondefault.read(2);
                                                cleartextsubstitutiondefault.read(3);
                                                TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) cleartextsubstitutiondefault.write;
                                                cleartextsubstitutiondefault.read(3);
                                                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) cleartextsubstitutiondefault.write;
                                                cleartextsubstitutiondefault.read(3);
                                                cleartextsubstitutiondefault.serializer = BuildersKt.withContext(textAnnouncementContentCardView, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) cleartextsubstitutiondefault.write);
                                                i = 4;
                                                cleartextsubstitutiondefault.read(i);
                                                i5 = i6;
                                                break;
                                            case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 4;
                                                cleartextsubstitutiondefault.read(2);
                                                cleartextsubstitutiondefault.read(3);
                                                Object obj = cleartextsubstitutiondefault.write;
                                                cleartextsubstitutiondefault.read(3);
                                                Object obj2 = cleartextsubstitutiondefault.write;
                                                cleartextsubstitutiondefault.read(3);
                                                ShortNewsContentCardView shortNewsContentCardView2 = (ShortNewsContentCardView) cleartextsubstitutiondefault.write;
                                                cleartextsubstitutiondefault.read(13);
                                                cleartextsubstitutiondefault.serializer = new AnonymousClass2(obj, obj2, shortNewsContentCardView2, cleartextsubstitutiondefault.IconCompatParcelizer);
                                                i = 4;
                                                cleartextsubstitutiondefault.read(i);
                                                i5 = i6;
                                                break;
                                            case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                                try {
                                                    cleartextsubstitutiondefault.serializer = DefaultIoScheduler.RemoteActionCompatParcelizer;
                                                    i = 4;
                                                    cleartextsubstitutiondefault.read(i);
                                                    i5 = i6;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    byte[] bArr6 = ParcelableVolumeInfo;
                                                    byte b1116 = bArr6[792];
                                                    byte b1117 = bArr6[33];
                                                    objArr = new Object[1];
                                                    a(b1116, b1117, (short) (b1117 | 322), objArr);
                                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1118 = bArr6[792];
                                                    byte b1119 = bArr6[33];
                                                    objArr2 = new Object[1];
                                                    a(b1118, b1119, (short) (b1119 | 322), objArr2);
                                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b11110 = bArr6[792];
                                                    byte b11111 = bArr6[33];
                                                    objArr3 = new Object[1];
                                                    a(b11110, b11111, (short) (b11111 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b11112 = bArr6[792];
                                                    byte b11113 = bArr6[33];
                                                    objArr4 = new Object[1];
                                                    a(b11112, b11113, (short) (b11113 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    }
                                                    byte b26 = bArr6[792];
                                                    byte b27 = bArr6[33];
                                                    objArr5 = new Object[1];
                                                    a(b26, b27, (short) (b27 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    if (i5 >= 64) {
                                                    }
                                                    throw th;
                                                }
                                                break;
                                            case BaseCode.URI_IS_NULL /* -5 */:
                                                cleartextsubstitutiondefault.serializer = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                                i = 4;
                                                cleartextsubstitutiondefault.read(i);
                                                i5 = i6;
                                                break;
                                            case BaseCode.NO_SOLUTION /* -4 */:
                                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                                cleartextsubstitutiondefault.read(2);
                                                cleartextsubstitutiondefault.read(3);
                                                cleartextsubstitutiondefault.serializer = cleartextsubstitutiondefault.write.getClass();
                                                i = 4;
                                                cleartextsubstitutiondefault.read(i);
                                                i5 = i6;
                                                break;
                                            case -3:
                                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                                cleartextsubstitutiondefault.read(2);
                                                cleartextsubstitutiondefault.read(3);
                                                cleartextsubstitutiondefault.serializer = (inCompatibilityMode) cleartextsubstitutiondefault.write;
                                                i = 4;
                                                cleartextsubstitutiondefault.read(i);
                                                i5 = i6;
                                                break;
                                            case -2:
                                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                                cleartextsubstitutiondefault.read(2);
                                                cleartextsubstitutiondefault.read(3);
                                                cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).IconCompatParcelizer;
                                                i = 4;
                                                cleartextsubstitutiondefault.read(i);
                                                i5 = i6;
                                                break;
                                            case -1:
                                                i5 = 31;
                                                break;
                                            default:
                                                i5 = i6;
                                                break;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            } catch (Throwable th6) {
                                Throwable cause = th6.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th6;
                            }
                        } catch (Throwable th7) {
                            Throwable cause2 = th7.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        Throwable cause3 = th8.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th8;
                    }
                } catch (Throwable th9) {
                    Throwable cause4 = th9.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th9;
                }
            } catch (Throwable th10) {
                Throwable cause5 = th10.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th10;
            }
        } catch (Throwable th11) {
            Throwable cause6 = th11.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x05ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x05f9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final Object getAuthDataObservable(ShortNewsContentCardView<? super StateFlow<getTraversalIndexdelegate>> shortNewsContentCardView) throws Throwable {
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(this, shortNewsContentCardView);
        try {
            int i = 0;
            byte[] bArr = ParcelableVolumeInfo;
            short s = (short) 551;
            Object[] objArr = new Object[1];
            a(bArr[108], bArr[170], s, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b = bArr[170];
            byte b2 = bArr[551];
            Object[] objArr2 = new Object[1];
            a(b, b2, (short) (b2 | 1253), objArr2);
            int iIntValue = 646 - ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr3 = new Object[1];
            a(bArr[108], bArr[170], s, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[551], bArr[48], (short) 924, objArr4);
            int iIntValue2 = ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue() + 2942;
            Object[] objArr5 = new Object[1];
            a(bArr[108], bArr[78], bArr[100], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[33], bArr[108], (short) 1291, objArr6);
            char c = (char) ((((Long) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1);
            Object[] objArr7 = new Object[1];
            b(iIntValue, iIntValue2, c, objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a(bArr[108], bArr[551], (short) 363, objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(bArr[551], bArr[792], (short) 485, objArr9);
            int i2 = -((byte) ((Integer) cls4.getMethod((String) objArr9[0], null).invoke(null, null)).intValue());
            Object[] objArr10 = new Object[1];
            a(bArr[108], bArr[78], bArr[14], objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            byte b3 = bArr[125];
            Object[] objArr11 = new Object[1];
            a(b3, bArr[31], b3, objArr11);
            String str2 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr12);
            int iIntValue3 = 121 - ((Integer) cls5.getMethod(str2, Class.forName((String) objArr12[0]), Character.TYPE).invoke(null, "", '0')).intValue();
            Object[] objArr13 = {0};
            Object[] objArr14 = new Object[1];
            a(bArr[108], bArr[20], (short) 304, objArr14);
            Class<?> cls6 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            a(bArr[551], bArr[31], (short) 905, objArr15);
            Object[] objArr16 = new Object[1];
            b(i2, iIntValue3, (char) ((Integer) cls6.getMethod((String) objArr15[0], Integer.TYPE).invoke(null, objArr13)).intValue(), objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            byte b4 = bArr[792];
            char c2 = 271;
            byte b5 = bArr[271];
            Object[] objArr18 = new Object[1];
            a(b4, b5, (short) (b5 | 178), objArr18);
            Class<?> cls7 = Class.forName((String) objArr18[0]);
            byte b6 = (byte) PlaybackStateCompat;
            byte b7 = bArr[0];
            Object[] objArr19 = new Object[1];
            a(b6, b7, (short) (b7 | 204), objArr19);
            String str3 = (String) objArr19[0];
            byte b8 = bArr[792];
            byte b9 = bArr[271];
            Object[] objArr20 = new Object[1];
            a(b8, b9, (short) (b9 | 178), objArr20);
            Object[] objArr21 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr20[0])).invoke(str, objArr17);
            int[] iArr = new int[objArr21.length];
            int i3 = 0;
            while (i3 < objArr21.length) {
                Object[] objArr22 = {objArr21[i3]};
                byte[] bArr2 = ParcelableVolumeInfo;
                short s2 = (short) 210;
                Object[] objArr23 = new Object[1];
                a(bArr2[792], bArr2[170], s2, objArr23);
                Class<?> cls8 = Class.forName((String) objArr23[i]);
                Object[] objArr24 = new Object[1];
                a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr24);
                String str4 = (String) objArr24[i];
                byte b10 = bArr2[792];
                byte b11 = bArr2[c2];
                Object[] objArr25 = new Object[1];
                a(b10, b11, (short) (b11 | 178), objArr25);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                Object[] objArr26 = new Object[1];
                a(bArr2[792], bArr2[170], s2, objArr26);
                Class<?> cls9 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a(bArr2[125], bArr2[5], (short) 232, objArr27);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                i = 0;
                c2 = 271;
            }
            while (true) {
                int i4 = i + 1;
                try {
                    switch (cleartextsubstitutiondefault.read(iArr[i])) {
                        case -68:
                            i = 177;
                            break;
                        case -67:
                            cleartextsubstitutiondefault.read(21);
                            i4 = cleartextsubstitutiondefault.IconCompatParcelizer != 0 ? 19 : 147;
                            break;
                        case -66:
                            i = 172;
                            break;
                        case -65:
                            cleartextsubstitutiondefault.read(21);
                            i4 = cleartextsubstitutiondefault.IconCompatParcelizer != 0 ? 67 : 84;
                            break;
                        case -64:
                            i = 1;
                            break;
                        case -63:
                            i = 171;
                            break;
                        case -62:
                            try {
                                cleartextsubstitutiondefault.read(31);
                                i = cleartextsubstitutiondefault.IconCompatParcelizer;
                                i = i == 0 ? 170 : i4;
                            } catch (Throwable th) {
                                th = th;
                                if (i >= 111 || i >= 113) {
                                    throw th;
                                }
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                                i = 109;
                            }
                            break;
                        case -61:
                            i = 78;
                            break;
                        case -60:
                            i = 162;
                            break;
                        case -59:
                            try {
                                cleartextsubstitutiondefault.read(14);
                                if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                    i4 = 161;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (i >= 111) {
                                }
                                throw th;
                            }
                            break;
                        case -58:
                            i = 178;
                            break;
                        case -57:
                            i = 180;
                            break;
                        case -56:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 146;
                            }
                            break;
                        case -55:
                            i = 95;
                            break;
                        case -54:
                            i = 137;
                            break;
                        case -53:
                            cleartextsubstitutiondefault.read(14);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 136;
                            }
                            break;
                        case -52:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            try {
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(13);
                                MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                            } catch (Throwable th3) {
                                th = th3;
                                if (i >= 111) {
                                }
                                throw th;
                            }
                            break;
                        case -51:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                            cleartextsubstitutiondefault.read(10);
                            break;
                        case -50:
                            cleartextsubstitutiondefault.read(141);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 126;
                            }
                            break;
                        case -49:
                            i = 42;
                            break;
                        case -48:
                            i = 123;
                            break;
                        case -47:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 122;
                            }
                            break;
                        case -46:
                            cleartextsubstitutiondefault.read(8);
                            throw ((Throwable) cleartextsubstitutiondefault.write);
                        case -45:
                            i = 93;
                            break;
                        case -44:
                            i = 110;
                            break;
                        case -43:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i = ActivityIdentificationData.RUNNING;
                            }
                            break;
                        case -42:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                            break;
                        case -41:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                            cleartextsubstitutiondefault.read(10);
                            break;
                        case -40:
                            i = 163;
                            break;
                        case -39:
                            i = 99;
                            break;
                        case -38:
                            i = 84;
                            break;
                        case -37:
                            i = 101;
                            break;
                        case -36:
                            i = 153;
                            break;
                        case -35:
                            cleartextsubstitutiondefault.read(116);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 77;
                            }
                            break;
                        case -34:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 2;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            LocalAuthDataSource localAuthDataSource = (LocalAuthDataSource) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{localAuthDataSource, (ShortNewsContentCardView) cleartextsubstitutiondefault.write}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
                            Object obj = objRemoteActionCompatParcelizer;
                            cleartextsubstitutiondefault.serializer = objRemoteActionCompatParcelizer;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -33:
                            i = 173;
                            break;
                        case -32:
                            i = 175;
                            break;
                        case -31:
                            cleartextsubstitutiondefault.read(92);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 66;
                            }
                            break;
                        case -30:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = (getTraversalIndexdelegate) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -29:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((MutableStateFlow) cleartextsubstitutiondefault.write).read();
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -28:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).read;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -27:
                            cleartextsubstitutiondefault.read(8);
                            return cleartextsubstitutiondefault.write;
                        case -26:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            ScreenStartObserver$$ExternalSyntheticLambda0.write((String) cleartextsubstitutiondefault.write);
                            break;
                        case -25:
                            cleartextsubstitutiondefault.serializer = "call to 'resume' before 'invoke' with coroutine";
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -24:
                            i = 80;
                            break;
                        case -23:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            ExtrasKt.RemoteActionCompatParcelizer(cleartextsubstitutiondefault.write);
                            break;
                        case -22:
                            i = 50;
                            break;
                        case -21:
                            i = 46;
                            break;
                        case -20:
                            cleartextsubstitutiondefault.read(141);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 45;
                            }
                            break;
                        case -19:
                            i = 54;
                            break;
                        case -18:
                            i = 113;
                            break;
                        case -17:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 41;
                            }
                            break;
                        case -16:
                            cleartextsubstitutiondefault.serializer = CoroutineSingletons.COROUTINE_SUSPENDED;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -15:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((SemanticsPropertiesRole1) cleartextsubstitutiondefault.write).write;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case Float16.MinExponent /* -14 */:
                            i = 31;
                            break;
                        case -13:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 2;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            LocalAuthDataSource localAuthDataSource2 = (LocalAuthDataSource) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = new SemanticsPropertiesRole1(localAuthDataSource2, (ShortNewsContentCardView) cleartextsubstitutiondefault.write);
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case -12:
                            i = 127;
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 2;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            SemanticsPropertiesRole1 semanticsPropertiesRole1 = (SemanticsPropertiesRole1) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(13);
                            semanticsPropertiesRole1.RemoteActionCompatParcelizer = cleartextsubstitutiondefault.IconCompatParcelizer;
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i = 138;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 18;
                            }
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = Integer.MIN_VALUE;
                            cleartextsubstitutiondefault.read(10);
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = ((SemanticsPropertiesRole1) cleartextsubstitutiondefault.write).RemoteActionCompatParcelizer;
                            cleartextsubstitutiondefault.read(10);
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = (SemanticsPropertiesRole1) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(4);
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            i = 27;
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            i = 7;
                            break;
                        case -3:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 6;
                            }
                            break;
                        case -2:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = cleartextsubstitutiondefault.write instanceof SemanticsPropertiesRole1 ? 1 : 0;
                            cleartextsubstitutiondefault.read(10);
                            break;
                        case -1:
                            i = 89;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            Throwable cause = th5.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x05b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:128:0x05c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:132:0x05ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:136:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:138:0x0616  */
    /* JADX WARN: Code duplicated, block: B:145:0x0623  */
    /* JADX WARN: Code duplicated, block: B:150:0x062c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0631  */
    /* JADX WARN: Code duplicated, block: B:154:0x0650  */
    /* JADX WARN: Code duplicated, block: B:158:0x065a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0679  */
    /* JADX WARN: Code duplicated, block: B:166:0x069f  */
    /* JADX WARN: Code duplicated, block: B:233:0x06b1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final getTraversalIndexdelegate RemoteActionCompatParcelizer() {
        byte[] bArr;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        int i;
        int i2;
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(this);
        try {
            byte[] bArr2 = ParcelableVolumeInfo;
            Object[] objArr6 = new Object[1];
            a(bArr2[108], bArr2[400], (short) (bArr2[325] + 1), objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            byte b = bArr2[551];
            Object[] objArr7 = new Object[1];
            a(b, b, (short) 852, objArr7);
            int iIntValue = 302 - (((Integer) cls.getMethod((String) objArr7[0], null).invoke(null, null)).intValue() >> 16);
            byte b2 = bArr2[108];
            int i3 = PlaybackStateCompat;
            Object[] objArr8 = new Object[1];
            a(b2, (byte) i3, (short) 1089, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(bArr2[551], bArr2[774], (short) 1186, objArr9);
            int i4 = 2639 - (((Long) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() == 0L ? 0 : -1));
            Object[] objArr10 = new Object[1];
            a(bArr2[108], bArr2[792], (short) 751, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr2[551], bArr2[465], (short) 774, objArr11);
            char c = (char) (34208 - (((Float) cls3.getMethod((String) objArr11[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls3.getMethod((String) objArr11[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1)));
            Object[] objArr12 = new Object[1];
            b(iIntValue, i4, c, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a(bArr2[108], bArr2[400], (short) (bArr2[325] + 1), objArr13);
            Class<?> cls4 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a(bArr2[551], bArr2[792], (short) 1210, objArr14);
            int iIntValue2 = (((Integer) cls4.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 16) + 1;
            Object[] objArr15 = new Object[1];
            a(bArr2[108], bArr2[400], (short) (bArr2[325] + 1), objArr15);
            Class<?> cls5 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr2[551], bArr2[738], (short) 888, objArr16);
            int iIntValue3 = (((Integer) cls5.getMethod((String) objArr16[0], null).invoke(null, null)).intValue() >> 8) + 122;
            Object[] objArr17 = {"", "", 0, 0};
            Object[] objArr18 = new Object[1];
            a(bArr2[108], bArr2[78], bArr2[14], objArr18);
            Class<?> cls6 = Class.forName((String) objArr18[0]);
            byte b3 = bArr2[125];
            Object[] objArr19 = new Object[1];
            a(b3, bArr2[31], b3, objArr19);
            String str2 = (String) objArr19[0];
            Object[] objArr20 = new Object[1];
            a(bArr2[792], bArr2[78], bArr2[20], objArr20);
            Object[] objArr21 = new Object[1];
            a(bArr2[792], bArr2[78], bArr2[20], objArr21);
            Class<?>[] clsArr = {Class.forName((String) objArr20[0]), Class.forName((String) objArr21[0]), Integer.TYPE, Integer.TYPE};
            Object[] objArr22 = new Object[1];
            b(iIntValue2, iIntValue3, (char) ((Integer) cls6.getMethod(str2, clsArr).invoke(null, objArr17)).intValue(), objArr22);
            Object[] objArr23 = {(String) objArr22[0]};
            byte b4 = bArr2[792];
            char c2 = 271;
            byte b5 = bArr2[271];
            Object[] objArr24 = new Object[1];
            a(b4, b5, (short) (b5 | 178), objArr24);
            Class<?> cls7 = Class.forName((String) objArr24[0]);
            byte b6 = bArr2[0];
            Object[] objArr25 = new Object[1];
            a((byte) i3, b6, (short) (b6 | 204), objArr25);
            String str3 = (String) objArr25[0];
            byte b7 = bArr2[792];
            byte b8 = bArr2[271];
            Object[] objArr26 = new Object[1];
            a(b7, b8, (short) (b8 | 178), objArr26);
            Object[] objArr27 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr26[0])).invoke(str, objArr23);
            int[] iArr = new int[objArr27.length];
            int i5 = 0;
            while (i5 < objArr27.length) {
                Object[] objArr28 = {objArr27[i5]};
                byte[] bArr3 = ParcelableVolumeInfo;
                short s = (short) 210;
                Object[] objArr29 = new Object[1];
                a(bArr3[792], bArr3[170], s, objArr29);
                Class<?> cls8 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                a(bArr3[301], bArr3[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr30);
                String str4 = (String) objArr30[0];
                byte b9 = bArr3[792];
                byte b10 = bArr3[c2];
                Object[] objArr31 = new Object[1];
                a(b9, b10, (short) (b10 | 178), objArr31);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr31[0])).invoke(null, objArr28);
                Object[] objArr32 = new Object[1];
                a(bArr3[792], bArr3[170], s, objArr32);
                Class<?> cls9 = Class.forName((String) objArr32[0]);
                Object[] objArr33 = new Object[1];
                a(bArr3[125], bArr3[5], (short) 232, objArr33);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr33[0], null).invoke(objInvoke, null)).intValue();
                i5++;
                c2 = 271;
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                int i8 = 54;
                try {
                    try {
                        switch (cleartextsubstitutiondefault.read(iArr[i6])) {
                            case -30:
                                i6 = 84;
                                break;
                            case -29:
                                cleartextsubstitutiondefault.read(21);
                                if (cleartextsubstitutiondefault.IconCompatParcelizer != 0) {
                                    i6 = 14;
                                } else {
                                    i7 = 65;
                                    i6 = i7;
                                }
                                break;
                            case -28:
                                i6 = 79;
                                break;
                            case -27:
                                cleartextsubstitutiondefault.read(21);
                                i7 = cleartextsubstitutiondefault.IconCompatParcelizer != 50 ? 49 : 35;
                                i6 = i7;
                                break;
                            case -26:
                                i6 = 85;
                                break;
                            case -25:
                                i6 = 87;
                                break;
                            case -24:
                                try {
                                    cleartextsubstitutiondefault.read(31);
                                    i8 = cleartextsubstitutiondefault.IconCompatParcelizer;
                                    if (i8 == 0) {
                                        i7 = 63;
                                    }
                                    i6 = i7;
                                } catch (Throwable th) {
                                    th = th;
                                    if (i6 >= 18) {
                                        if (i6 >= 50) {
                                            bArr = ParcelableVolumeInfo;
                                            byte b11 = bArr[792];
                                            byte b12 = bArr[33];
                                            objArr = new Object[1];
                                            a(b11, b12, (short) (b12 | 322), objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                byte b13 = bArr[792];
                                                byte b14 = bArr[33];
                                                objArr2 = new Object[1];
                                                a(b13, b14, (short) (b14 | 322), objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i6 < 69) {
                                                    break;
                                                }
                                                if (i6 >= 75) {
                                                    byte b15 = bArr[792];
                                                    byte b16 = bArr[33];
                                                    objArr3 = new Object[1];
                                                    a(b15, b16, (short) (b16 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        byte b17 = bArr[792];
                                                        byte b18 = bArr[33];
                                                        objArr4 = new Object[1];
                                                        a(b17, b18, (short) (b18 | 322), objArr4);
                                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                            break;
                                                        }
                                                        byte b19 = bArr[792];
                                                        byte b20 = bArr[33];
                                                        objArr5 = new Object[1];
                                                        a(b19, b20, (short) (b20 | 322), objArr5);
                                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                        }
                                                        throw th;
                                                    }
                                                    byte b110 = bArr[792];
                                                    byte b111 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b110, b111, (short) (b111 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b112 = bArr[792];
                                                    byte b21 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b112, b21, (short) (b21 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b113 = bArr[792];
                                                byte b114 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b113, b114, (short) (b114 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b115 = bArr[792];
                                                    byte b116 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b115, b116, (short) (b116 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b117 = bArr[792];
                                                    byte b22 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b117, b22, (short) (b22 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b118 = bArr[792];
                                                byte b119 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b118, b119, (short) (b119 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1110 = bArr[792];
                                                byte b23 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1110, b23, (short) (b23 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b120 = bArr[792];
                                            byte b121 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b120, b121, (short) (b121 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b1111 = bArr[792];
                                                byte b1112 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111, b1112, (short) (b1112 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b1113 = bArr[792];
                                                    byte b1114 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b1113, b1114, (short) (b1114 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1115 = bArr[792];
                                                    byte b24 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1115, b24, (short) (b24 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1116 = bArr[792];
                                                byte b1117 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1116, b1117, (short) (b1117 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1118 = bArr[792];
                                                byte b25 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1118, b25, (short) (b25 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1119 = bArr[792];
                                            byte b11110 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b1119, b11110, (short) (b11110 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111 = bArr[792];
                                                byte b11112 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111, b11112, (short) (b11112 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11113 = bArr[792];
                                                byte b26 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11113, b26, (short) (b26 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11114 = bArr[792];
                                            byte b11115 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11114, b11115, (short) (b11115 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11116 = bArr[792];
                                            byte b27 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11116, b27, (short) (b27 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        bArr = ParcelableVolumeInfo;
                                        byte b122 = bArr[792];
                                        byte b123 = bArr[33];
                                        objArr = new Object[1];
                                        a(b122, b123, (short) (b123 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b124 = bArr[792];
                                            byte b125 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b124, b125, (short) (b125 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b11117 = bArr[792];
                                                byte b11118 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b11117, b11118, (short) (b11118 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b11119 = bArr[792];
                                                    byte b111110 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b11119, b111110, (short) (b111110 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111 = bArr[792];
                                                    byte b28 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111, b28, (short) (b28 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b111112 = bArr[792];
                                                byte b111113 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111112, b111113, (short) (b111113 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111114 = bArr[792];
                                                byte b29 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111114, b29, (short) (b29 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b111115 = bArr[792];
                                            byte b111116 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b111115, b111116, (short) (b111116 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b111117 = bArr[792];
                                                byte b111118 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111117, b111118, (short) (b111118 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111119 = bArr[792];
                                                byte b210 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111119, b210, (short) (b210 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111110 = bArr[792];
                                            byte b1111111 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111110, b1111111, (short) (b1111111 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b1111112 = bArr[792];
                                            byte b211 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b1111112, b211, (short) (b211 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b126 = bArr[792];
                                        byte b127 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b126, b127, (short) (b127 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b1111113 = bArr[792];
                                            byte b1111114 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b1111113, b1111114, (short) (b1111114 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111115 = bArr[792];
                                                byte b1111116 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111115, b1111116, (short) (b1111116 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111117 = bArr[792];
                                                byte b212 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111117, b212, (short) (b212 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111118 = bArr[792];
                                            byte b1111119 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111118, b1111119, (short) (b1111119 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111110 = bArr[792];
                                            byte b213 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111110, b213, (short) (b213 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111 = bArr[792];
                                        byte b11111112 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b11111111, b11111112, (short) (b11111112 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b11111113 = bArr[792];
                                            byte b11111114 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111113, b11111114, (short) (b11111114 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111115 = bArr[792];
                                            byte b214 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111115, b214, (short) (b214 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111116 = bArr[792];
                                        byte b11111117 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b11111116, b11111117, (short) (b11111117 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b11111118 = bArr[792];
                                        byte b215 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b11111118, b215, (short) (b215 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    if (i6 >= 50) {
                                        bArr = ParcelableVolumeInfo;
                                        byte b128 = bArr[792];
                                        byte b129 = bArr[33];
                                        objArr = new Object[1];
                                        a(b128, b129, (short) (b129 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b1210 = bArr[792];
                                            byte b1211 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b1210, b1211, (short) (b1211 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b11111119 = bArr[792];
                                                byte b111111110 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b11111119, b111111110, (short) (b111111110 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b111111111 = bArr[792];
                                                    byte b111111112 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111, b111111112, (short) (b111111112 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111113 = bArr[792];
                                                    byte b216 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111113, b216, (short) (b216 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b111111114 = bArr[792];
                                                byte b111111115 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111111114, b111111115, (short) (b111111115 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111111116 = bArr[792];
                                                byte b217 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111111116, b217, (short) (b217 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b111111117 = bArr[792];
                                            byte b111111118 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b111111117, b111111118, (short) (b111111118 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b111111119 = bArr[792];
                                                byte b1111111110 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111111119, b1111111110, (short) (b1111111110 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111 = bArr[792];
                                                byte b218 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111, b218, (short) (b218 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111112 = bArr[792];
                                            byte b1111111113 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111112, b1111111113, (short) (b1111111113 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b1111111114 = bArr[792];
                                            byte b219 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b1111111114, b219, (short) (b219 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b1212 = bArr[792];
                                        byte b1213 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b1212, b1213, (short) (b1213 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b1111111115 = bArr[792];
                                            byte b1111111116 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b1111111115, b1111111116, (short) (b1111111116 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111111117 = bArr[792];
                                                byte b1111111118 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111117, b1111111118, (short) (b1111111118 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111119 = bArr[792];
                                                byte b2110 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111119, b2110, (short) (b2110 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111110 = bArr[792];
                                            byte b11111111111 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111110, b11111111111, (short) (b11111111111 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111112 = bArr[792];
                                            byte b2111 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111112, b2111, (short) (b2111 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111113 = bArr[792];
                                        byte b11111111114 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b11111111113, b11111111114, (short) (b11111111114 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b11111111115 = bArr[792];
                                            byte b11111111116 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111115, b11111111116, (short) (b11111111116 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111117 = bArr[792];
                                            byte b2112 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111117, b2112, (short) (b2112 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111118 = bArr[792];
                                        byte b11111111119 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b11111111118, b11111111119, (short) (b11111111119 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111110 = bArr[792];
                                        byte b2113 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111110, b2113, (short) (b2113 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    bArr = ParcelableVolumeInfo;
                                    byte b1214 = bArr[792];
                                    byte b1215 = bArr[33];
                                    objArr = new Object[1];
                                    a(b1214, b1215, (short) (b1215 | 322), objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        byte b1216 = bArr[792];
                                        byte b1217 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b1216, b1217, (short) (b1217 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b111111111111 = bArr[792];
                                            byte b111111111112 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b111111111111, b111111111112, (short) (b111111111112 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b111111111113 = bArr[792];
                                                byte b111111111114 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111111111113, b111111111114, (short) (b111111111114 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111111111115 = bArr[792];
                                                byte b2114 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111111111115, b2114, (short) (b2114 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b111111111116 = bArr[792];
                                            byte b111111111117 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111116, b111111111117, (short) (b111111111117 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111118 = bArr[792];
                                            byte b2115 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111118, b2115, (short) (b2115 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111119 = bArr[792];
                                        byte b1111111111110 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b111111111119, b1111111111110, (short) (b1111111111110 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b1111111111111 = bArr[792];
                                            byte b1111111111112 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111, b1111111111112, (short) (b1111111111112 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b1111111111113 = bArr[792];
                                            byte b2116 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b1111111111113, b2116, (short) (b2116 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b1111111111114 = bArr[792];
                                        byte b1111111111115 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b1111111111114, b1111111111115, (short) (b1111111111115 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b1111111111116 = bArr[792];
                                        byte b2117 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b1111111111116, b2117, (short) (b2117 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b1218 = bArr[792];
                                    byte b1219 = bArr[33];
                                    objArr2 = new Object[1];
                                    a(b1218, b1219, (short) (b1219 | 322), objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i6 < 69) {
                                        break;
                                    }
                                    if (i6 >= 75) {
                                        byte b1111111111117 = bArr[792];
                                        byte b1111111111118 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b1111111111117, b1111111111118, (short) (b1111111111118 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b1111111111119 = bArr[792];
                                            byte b11111111111110 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111119, b11111111111110, (short) (b11111111111110 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111 = bArr[792];
                                            byte b2118 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111, b2118, (short) (b2118 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111111112 = bArr[792];
                                        byte b11111111111113 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b11111111111112, b11111111111113, (short) (b11111111111113 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b11111111111114 = bArr[792];
                                        byte b2119 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b11111111111114, b2119, (short) (b2119 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b11111111111115 = bArr[792];
                                    byte b11111111111116 = bArr[33];
                                    objArr3 = new Object[1];
                                    a(b11111111111115, b11111111111116, (short) (b11111111111116 | 322), objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        byte b11111111111117 = bArr[792];
                                        byte b11111111111118 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b11111111111117, b11111111111118, (short) (b11111111111118 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b11111111111119 = bArr[792];
                                        byte b21110 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b11111111111119, b21110, (short) (b21110 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b111111111111110 = bArr[792];
                                    byte b111111111111111 = bArr[33];
                                    objArr4 = new Object[1];
                                    a(b111111111111110, b111111111111111, (short) (b111111111111111 | 322), objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b111111111111112 = bArr[792];
                                    byte b21111 = bArr[33];
                                    objArr5 = new Object[1];
                                    a(b111111111111112, b21111, (short) (b21111 | 322), objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                    }
                                    throw th;
                                    cleartextsubstitutiondefault.serializer = th;
                                    cleartextsubstitutiondefault.read(24);
                                }
                                break;
                            case -23:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                try {
                                    cleartextsubstitutiondefault.read(2);
                                    cleartextsubstitutiondefault.read(13);
                                    RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                                    i6 = i7;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (i6 >= 18) {
                                        if (i6 >= 50) {
                                            bArr = ParcelableVolumeInfo;
                                            byte b12110 = bArr[792];
                                            byte b12111 = bArr[33];
                                            objArr = new Object[1];
                                            a(b12110, b12111, (short) (b12111 | 322), objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                byte b12112 = bArr[792];
                                                byte b12113 = bArr[33];
                                                objArr2 = new Object[1];
                                                a(b12112, b12113, (short) (b12113 | 322), objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i6 < 69) {
                                                    break;
                                                }
                                                if (i6 >= 75) {
                                                    byte b111111111111113 = bArr[792];
                                                    byte b111111111111114 = bArr[33];
                                                    objArr3 = new Object[1];
                                                    a(b111111111111113, b111111111111114, (short) (b111111111111114 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        byte b111111111111115 = bArr[792];
                                                        byte b111111111111116 = bArr[33];
                                                        objArr4 = new Object[1];
                                                        a(b111111111111115, b111111111111116, (short) (b111111111111116 | 322), objArr4);
                                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                            break;
                                                        }
                                                        byte b111111111111117 = bArr[792];
                                                        byte b21112 = bArr[33];
                                                        objArr5 = new Object[1];
                                                        a(b111111111111117, b21112, (short) (b21112 | 322), objArr5);
                                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                        }
                                                        throw th;
                                                    }
                                                    byte b111111111111118 = bArr[792];
                                                    byte b111111111111119 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111118, b111111111111119, (short) (b111111111111119 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111110 = bArr[792];
                                                    byte b21113 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111110, b21113, (short) (b21113 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111 = bArr[792];
                                                byte b1111111111111112 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111111111111111, b1111111111111112, (short) (b1111111111111112 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b1111111111111113 = bArr[792];
                                                    byte b1111111111111114 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b1111111111111113, b1111111111111114, (short) (b1111111111111114 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111115 = bArr[792];
                                                    byte b21114 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111115, b21114, (short) (b21114 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111116 = bArr[792];
                                                byte b1111111111111117 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111116, b1111111111111117, (short) (b1111111111111117 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111118 = bArr[792];
                                                byte b21115 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111118, b21115, (short) (b21115 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b12114 = bArr[792];
                                            byte b12115 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b12114, b12115, (short) (b12115 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b1111111111111119 = bArr[792];
                                                byte b11111111111111110 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111111111111119, b11111111111111110, (short) (b11111111111111110 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b11111111111111111 = bArr[792];
                                                    byte b11111111111111112 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b11111111111111111, b11111111111111112, (short) (b11111111111111112 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b11111111111111113 = bArr[792];
                                                    byte b21116 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b11111111111111113, b21116, (short) (b21116 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b11111111111111114 = bArr[792];
                                                byte b11111111111111115 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111114, b11111111111111115, (short) (b11111111111111115 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111116 = bArr[792];
                                                byte b21117 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111116, b21117, (short) (b21117 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111117 = bArr[792];
                                            byte b11111111111111118 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111117, b11111111111111118, (short) (b11111111111111118 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111111111111119 = bArr[792];
                                                byte b111111111111111110 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111119, b111111111111111110, (short) (b111111111111111110 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111111111111111111 = bArr[792];
                                                byte b21118 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111111111111111111, b21118, (short) (b21118 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b111111111111111112 = bArr[792];
                                            byte b111111111111111113 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111111111112, b111111111111111113, (short) (b111111111111111113 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111114 = bArr[792];
                                            byte b21119 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111114, b21119, (short) (b21119 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        bArr = ParcelableVolumeInfo;
                                        byte b12116 = bArr[792];
                                        byte b12117 = bArr[33];
                                        objArr = new Object[1];
                                        a(b12116, b12117, (short) (b12117 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b12118 = bArr[792];
                                            byte b12119 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b12118, b12119, (short) (b12119 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b111111111111111115 = bArr[792];
                                                byte b111111111111111116 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b111111111111111115, b111111111111111116, (short) (b111111111111111116 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b111111111111111117 = bArr[792];
                                                    byte b111111111111111118 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111117, b111111111111111118, (short) (b111111111111111118 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111111111111119 = bArr[792];
                                                    byte b211110 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111111111111119, b211110, (short) (b211110 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111110 = bArr[792];
                                                byte b1111111111111111111 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111110, b1111111111111111111, (short) (b1111111111111111111 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111112 = bArr[792];
                                                byte b211111 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111112, b211111, (short) (b211111 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111113 = bArr[792];
                                            byte b1111111111111111114 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b1111111111111111113, b1111111111111111114, (short) (b1111111111111111114 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111111111111111115 = bArr[792];
                                                byte b1111111111111111116 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111115, b1111111111111111116, (short) (b1111111111111111116 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111117 = bArr[792];
                                                byte b211112 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111117, b211112, (short) (b211112 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111118 = bArr[792];
                                            byte b1111111111111111119 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111111118, b1111111111111111119, (short) (b1111111111111111119 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111110 = bArr[792];
                                            byte b211113 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111110, b211113, (short) (b211113 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b121110 = bArr[792];
                                        byte b121111 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b121110, b121111, (short) (b121111 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b11111111111111111111 = bArr[792];
                                            byte b11111111111111111112 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111111111, b11111111111111111112, (short) (b11111111111111111112 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111111111111111113 = bArr[792];
                                                byte b11111111111111111114 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111113, b11111111111111111114, (short) (b11111111111111111114 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111115 = bArr[792];
                                                byte b211114 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111115, b211114, (short) (b211114 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111116 = bArr[792];
                                            byte b11111111111111111117 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111116, b11111111111111111117, (short) (b11111111111111111117 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111118 = bArr[792];
                                            byte b211115 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111118, b211115, (short) (b211115 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111111111111119 = bArr[792];
                                        byte b111111111111111111110 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b11111111111111111119, b111111111111111111110, (short) (b111111111111111111110 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b111111111111111111111 = bArr[792];
                                            byte b111111111111111111112 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111111111111111, b111111111111111111112, (short) (b111111111111111111112 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111111113 = bArr[792];
                                            byte b211116 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111111113, b211116, (short) (b211116 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111114 = bArr[792];
                                        byte b111111111111111111115 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b111111111111111111114, b111111111111111111115, (short) (b111111111111111111115 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111111111111116 = bArr[792];
                                        byte b211117 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111111111111116, b211117, (short) (b211117 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    if (i6 >= 50) {
                                        bArr = ParcelableVolumeInfo;
                                        byte b121112 = bArr[792];
                                        byte b121113 = bArr[33];
                                        objArr = new Object[1];
                                        a(b121112, b121113, (short) (b121113 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b121114 = bArr[792];
                                            byte b121115 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b121114, b121115, (short) (b121115 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b111111111111111111117 = bArr[792];
                                                byte b111111111111111111118 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b111111111111111111117, b111111111111111111118, (short) (b111111111111111111118 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b111111111111111111119 = bArr[792];
                                                    byte b1111111111111111111110 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111111119, b1111111111111111111110, (short) (b1111111111111111111110 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111111111111 = bArr[792];
                                                    byte b211118 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111111111111, b211118, (short) (b211118 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111111112 = bArr[792];
                                                byte b1111111111111111111113 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111112, b1111111111111111111113, (short) (b1111111111111111111113 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111114 = bArr[792];
                                                byte b211119 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111114, b211119, (short) (b211119 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111111115 = bArr[792];
                                            byte b1111111111111111111116 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b1111111111111111111115, b1111111111111111111116, (short) (b1111111111111111111116 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111111111111111111117 = bArr[792];
                                                byte b1111111111111111111118 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111117, b1111111111111111111118, (short) (b1111111111111111111118 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111119 = bArr[792];
                                                byte b2111110 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111119, b2111110, (short) (b2111110 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111110 = bArr[792];
                                            byte b11111111111111111111111 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111110, b11111111111111111111111, (short) (b11111111111111111111111 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111112 = bArr[792];
                                            byte b2111111 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111112, b2111111, (short) (b2111111 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b121116 = bArr[792];
                                        byte b121117 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b121116, b121117, (short) (b121117 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b11111111111111111111113 = bArr[792];
                                            byte b11111111111111111111114 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111111111113, b11111111111111111111114, (short) (b11111111111111111111114 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111111111111111111115 = bArr[792];
                                                byte b11111111111111111111116 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111115, b11111111111111111111116, (short) (b11111111111111111111116 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111117 = bArr[792];
                                                byte b2111112 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111117, b2111112, (short) (b2111112 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111118 = bArr[792];
                                            byte b11111111111111111111119 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111118, b11111111111111111111119, (short) (b11111111111111111111119 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111111111110 = bArr[792];
                                            byte b2111113 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111111111110, b2111113, (short) (b2111113 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111111111 = bArr[792];
                                        byte b111111111111111111111112 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b111111111111111111111111, b111111111111111111111112, (short) (b111111111111111111111112 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b111111111111111111111113 = bArr[792];
                                            byte b111111111111111111111114 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111111111111111113, b111111111111111111111114, (short) (b111111111111111111111114 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111111111115 = bArr[792];
                                            byte b2111114 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111111111115, b2111114, (short) (b2111114 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111111116 = bArr[792];
                                        byte b111111111111111111111117 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b111111111111111111111116, b111111111111111111111117, (short) (b111111111111111111111117 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111111111111111118 = bArr[792];
                                        byte b2111115 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111111111111111118, b2111115, (short) (b2111115 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    bArr = ParcelableVolumeInfo;
                                    byte b121118 = bArr[792];
                                    byte b121119 = bArr[33];
                                    objArr = new Object[1];
                                    a(b121118, b121119, (short) (b121119 | 322), objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        byte b1211110 = bArr[792];
                                        byte b1211111 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b1211110, b1211111, (short) (b1211111 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b111111111111111111111119 = bArr[792];
                                            byte b1111111111111111111111110 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b111111111111111111111119, b1111111111111111111111110, (short) (b1111111111111111111111110 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111111111111111111111111 = bArr[792];
                                                byte b1111111111111111111111112 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111, b1111111111111111111111112, (short) (b1111111111111111111111112 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111113 = bArr[792];
                                                byte b2111116 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111113, b2111116, (short) (b2111116 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111111111114 = bArr[792];
                                            byte b1111111111111111111111115 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111111111111114, b1111111111111111111111115, (short) (b1111111111111111111111115 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b1111111111111111111111116 = bArr[792];
                                            byte b2111117 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b1111111111111111111111116, b2111117, (short) (b2111117 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b1111111111111111111111117 = bArr[792];
                                        byte b1111111111111111111111118 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b1111111111111111111111117, b1111111111111111111111118, (short) (b1111111111111111111111118 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b1111111111111111111111119 = bArr[792];
                                            byte b11111111111111111111111110 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111111111111119, b11111111111111111111111110, (short) (b11111111111111111111111110 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111 = bArr[792];
                                            byte b2111118 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111, b2111118, (short) (b2111118 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111111111111111111112 = bArr[792];
                                        byte b11111111111111111111111113 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b11111111111111111111111112, b11111111111111111111111113, (short) (b11111111111111111111111113 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b11111111111111111111111114 = bArr[792];
                                        byte b2111119 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b11111111111111111111111114, b2111119, (short) (b2111119 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b1211112 = bArr[792];
                                    byte b1211113 = bArr[33];
                                    objArr2 = new Object[1];
                                    a(b1211112, b1211113, (short) (b1211113 | 322), objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i6 < 69) {
                                        break;
                                    }
                                    if (i6 >= 75) {
                                        byte b11111111111111111111111115 = bArr[792];
                                        byte b11111111111111111111111116 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b11111111111111111111111115, b11111111111111111111111116, (short) (b11111111111111111111111116 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b11111111111111111111111117 = bArr[792];
                                            byte b11111111111111111111111118 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111117, b11111111111111111111111118, (short) (b11111111111111111111111118 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111119 = bArr[792];
                                            byte b21111110 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111119, b21111110, (short) (b21111110 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111111111110 = bArr[792];
                                        byte b111111111111111111111111111 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b111111111111111111111111110, b111111111111111111111111111, (short) (b111111111111111111111111111 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111111111111111111112 = bArr[792];
                                        byte b21111111 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111111111111111111112, b21111111, (short) (b21111111 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b111111111111111111111111113 = bArr[792];
                                    byte b111111111111111111111111114 = bArr[33];
                                    objArr3 = new Object[1];
                                    a(b111111111111111111111111113, b111111111111111111111111114, (short) (b111111111111111111111111114 | 322), objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        byte b111111111111111111111111115 = bArr[792];
                                        byte b111111111111111111111111116 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b111111111111111111111111115, b111111111111111111111111116, (short) (b111111111111111111111111116 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111111111111111111117 = bArr[792];
                                        byte b21111112 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111111111111111111117, b21111112, (short) (b21111112 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b111111111111111111111111118 = bArr[792];
                                    byte b111111111111111111111111119 = bArr[33];
                                    objArr4 = new Object[1];
                                    a(b111111111111111111111111118, b111111111111111111111111119, (short) (b111111111111111111111111119 | 322), objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b1111111111111111111111111110 = bArr[792];
                                    byte b21111113 = bArr[33];
                                    objArr5 = new Object[1];
                                    a(b1111111111111111111111111110, b21111113, (short) (b21111113 | 322), objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                    }
                                    throw th;
                                    cleartextsubstitutiondefault.serializer = th;
                                    cleartextsubstitutiondefault.read(24);
                                }
                                break;
                            case -22:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                                cleartextsubstitutiondefault.read(10);
                                i6 = i7;
                                break;
                            case -21:
                                i6 = 80;
                                break;
                            case -20:
                                i6 = 82;
                                break;
                            case -19:
                                try {
                                    cleartextsubstitutiondefault.read(14);
                                    i8 = cleartextsubstitutiondefault.IconCompatParcelizer;
                                    if (i8 == 0) {
                                        i7 = 47;
                                    }
                                    i6 = i7;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (i6 >= 18) {
                                        if (i6 >= 50) {
                                            bArr = ParcelableVolumeInfo;
                                            byte b1211114 = bArr[792];
                                            byte b1211115 = bArr[33];
                                            objArr = new Object[1];
                                            a(b1211114, b1211115, (short) (b1211115 | 322), objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                byte b1211116 = bArr[792];
                                                byte b1211117 = bArr[33];
                                                objArr2 = new Object[1];
                                                a(b1211116, b1211117, (short) (b1211117 | 322), objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i6 < 69) {
                                                    break;
                                                }
                                                if (i6 >= 75) {
                                                    byte b1111111111111111111111111111 = bArr[792];
                                                    byte b1111111111111111111111111112 = bArr[33];
                                                    objArr3 = new Object[1];
                                                    a(b1111111111111111111111111111, b1111111111111111111111111112, (short) (b1111111111111111111111111112 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        byte b1111111111111111111111111113 = bArr[792];
                                                        byte b1111111111111111111111111114 = bArr[33];
                                                        objArr4 = new Object[1];
                                                        a(b1111111111111111111111111113, b1111111111111111111111111114, (short) (b1111111111111111111111111114 | 322), objArr4);
                                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                            break;
                                                        }
                                                        byte b1111111111111111111111111115 = bArr[792];
                                                        byte b21111114 = bArr[33];
                                                        objArr5 = new Object[1];
                                                        a(b1111111111111111111111111115, b21111114, (short) (b21111114 | 322), objArr5);
                                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                        }
                                                        throw th;
                                                    }
                                                    byte b1111111111111111111111111116 = bArr[792];
                                                    byte b1111111111111111111111111117 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b1111111111111111111111111116, b1111111111111111111111111117, (short) (b1111111111111111111111111117 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111111111111111118 = bArr[792];
                                                    byte b21111115 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111111111111111118, b21111115, (short) (b21111115 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111111111111119 = bArr[792];
                                                byte b11111111111111111111111111110 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111111111111111111111111119, b11111111111111111111111111110, (short) (b11111111111111111111111111110 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b11111111111111111111111111111 = bArr[792];
                                                    byte b11111111111111111111111111112 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b11111111111111111111111111111, b11111111111111111111111111112, (short) (b11111111111111111111111111112 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b11111111111111111111111111113 = bArr[792];
                                                    byte b21111116 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b11111111111111111111111111113, b21111116, (short) (b21111116 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b11111111111111111111111111114 = bArr[792];
                                                byte b11111111111111111111111111115 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111114, b11111111111111111111111111115, (short) (b11111111111111111111111111115 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111116 = bArr[792];
                                                byte b21111117 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111116, b21111117, (short) (b21111117 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1211118 = bArr[792];
                                            byte b1211119 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b1211118, b1211119, (short) (b1211119 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b11111111111111111111111111117 = bArr[792];
                                                byte b11111111111111111111111111118 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b11111111111111111111111111117, b11111111111111111111111111118, (short) (b11111111111111111111111111118 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b11111111111111111111111111119 = bArr[792];
                                                    byte b111111111111111111111111111110 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b11111111111111111111111111119, b111111111111111111111111111110, (short) (b111111111111111111111111111110 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111111111111111111111111111 = bArr[792];
                                                    byte b21111118 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111111111111111111111111111, b21111118, (short) (b21111118 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b111111111111111111111111111112 = bArr[792];
                                                byte b111111111111111111111111111113 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111111111111111111111111111112, b111111111111111111111111111113, (short) (b111111111111111111111111111113 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111111111111111111111111111114 = bArr[792];
                                                byte b21111119 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111111111111111111111111111114, b21111119, (short) (b21111119 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b111111111111111111111111111115 = bArr[792];
                                            byte b111111111111111111111111111116 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b111111111111111111111111111115, b111111111111111111111111111116, (short) (b111111111111111111111111111116 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b111111111111111111111111111117 = bArr[792];
                                                byte b111111111111111111111111111118 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111111111111111111111111111117, b111111111111111111111111111118, (short) (b111111111111111111111111111118 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111111111111111111111111111119 = bArr[792];
                                                byte b211111110 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111111111111111111111111111119, b211111110, (short) (b211111110 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111111111111111110 = bArr[792];
                                            byte b1111111111111111111111111111111 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111111111111111111110, b1111111111111111111111111111111, (short) (b1111111111111111111111111111111 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b1111111111111111111111111111112 = bArr[792];
                                            byte b211111111 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b1111111111111111111111111111112, b211111111, (short) (b211111111 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        bArr = ParcelableVolumeInfo;
                                        byte b12111110 = bArr[792];
                                        byte b12111111 = bArr[33];
                                        objArr = new Object[1];
                                        a(b12111110, b12111111, (short) (b12111111 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b12111112 = bArr[792];
                                            byte b12111113 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b12111112, b12111113, (short) (b12111113 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b1111111111111111111111111111113 = bArr[792];
                                                byte b1111111111111111111111111111114 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111111111111111111111111111113, b1111111111111111111111111111114, (short) (b1111111111111111111111111111114 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b1111111111111111111111111111115 = bArr[792];
                                                    byte b1111111111111111111111111111116 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b1111111111111111111111111111115, b1111111111111111111111111111116, (short) (b1111111111111111111111111111116 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111111111111111111117 = bArr[792];
                                                    byte b211111112 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111111111111111111117, b211111112, (short) (b211111112 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111111111111111118 = bArr[792];
                                                byte b1111111111111111111111111111119 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111118, b1111111111111111111111111111119, (short) (b1111111111111111111111111111119 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111110 = bArr[792];
                                                byte b211111113 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111110, b211111113, (short) (b211111113 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111 = bArr[792];
                                            byte b11111111111111111111111111111112 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111111111111111111111, b11111111111111111111111111111112, (short) (b11111111111111111111111111111112 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111111111111111111111111111113 = bArr[792];
                                                byte b11111111111111111111111111111114 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111111113, b11111111111111111111111111111114, (short) (b11111111111111111111111111111114 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111115 = bArr[792];
                                                byte b211111114 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111115, b211111114, (short) (b211111114 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111116 = bArr[792];
                                            byte b11111111111111111111111111111117 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111116, b11111111111111111111111111111117, (short) (b11111111111111111111111111111117 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111118 = bArr[792];
                                            byte b211111115 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111118, b211111115, (short) (b211111115 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b12111114 = bArr[792];
                                        byte b12111115 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b12111114, b12111115, (short) (b12111115 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b11111111111111111111111111111119 = bArr[792];
                                            byte b111111111111111111111111111111110 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111111111111111111119, b111111111111111111111111111111110, (short) (b111111111111111111111111111111110 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b111111111111111111111111111111111 = bArr[792];
                                                byte b111111111111111111111111111111112 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111111111111111111111111111111111, b111111111111111111111111111111112, (short) (b111111111111111111111111111111112 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111111111111111111111111111111113 = bArr[792];
                                                byte b211111116 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111111111111111111111111111111113, b211111116, (short) (b211111116 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b111111111111111111111111111111114 = bArr[792];
                                            byte b111111111111111111111111111111115 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111111111111111111111111114, b111111111111111111111111111111115, (short) (b111111111111111111111111111111115 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111111111111111111116 = bArr[792];
                                            byte b211111117 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111111111111111111116, b211111117, (short) (b211111117 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111111111111111117 = bArr[792];
                                        byte b111111111111111111111111111111118 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b111111111111111111111111111111117, b111111111111111111111111111111118, (short) (b111111111111111111111111111111118 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b111111111111111111111111111111119 = bArr[792];
                                            byte b1111111111111111111111111111111110 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111111111111111111111111119, b1111111111111111111111111111111110, (short) (b1111111111111111111111111111111110 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b1111111111111111111111111111111111 = bArr[792];
                                            byte b211111118 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b1111111111111111111111111111111111, b211111118, (short) (b211111118 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b1111111111111111111111111111111112 = bArr[792];
                                        byte b1111111111111111111111111111111113 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b1111111111111111111111111111111112, b1111111111111111111111111111111113, (short) (b1111111111111111111111111111111113 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b1111111111111111111111111111111114 = bArr[792];
                                        byte b211111119 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b1111111111111111111111111111111114, b211111119, (short) (b211111119 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    if (i6 >= 50) {
                                        bArr = ParcelableVolumeInfo;
                                        byte b12111116 = bArr[792];
                                        byte b12111117 = bArr[33];
                                        objArr = new Object[1];
                                        a(b12111116, b12111117, (short) (b12111117 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b12111118 = bArr[792];
                                            byte b12111119 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b12111118, b12111119, (short) (b12111119 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b1111111111111111111111111111111115 = bArr[792];
                                                byte b1111111111111111111111111111111116 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111111111111111111111111111111115, b1111111111111111111111111111111116, (short) (b1111111111111111111111111111111116 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b1111111111111111111111111111111117 = bArr[792];
                                                    byte b1111111111111111111111111111111118 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b1111111111111111111111111111111117, b1111111111111111111111111111111118, (short) (b1111111111111111111111111111111118 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111111111111111111111119 = bArr[792];
                                                    byte b2111111110 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111111111111111111111119, b2111111110, (short) (b2111111110 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b11111111111111111111111111111111110 = bArr[792];
                                                byte b11111111111111111111111111111111111 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111111111110, b11111111111111111111111111111111111, (short) (b11111111111111111111111111111111111 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111112 = bArr[792];
                                                byte b2111111111 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111112, b2111111111, (short) (b2111111111 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111113 = bArr[792];
                                            byte b11111111111111111111111111111111114 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111111111111111111111113, b11111111111111111111111111111111114, (short) (b11111111111111111111111111111111114 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111111111111111111111111111111115 = bArr[792];
                                                byte b11111111111111111111111111111111116 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111111111115, b11111111111111111111111111111111116, (short) (b11111111111111111111111111111111116 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111117 = bArr[792];
                                                byte b2111111112 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111117, b2111111112, (short) (b2111111112 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111118 = bArr[792];
                                            byte b11111111111111111111111111111111119 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111111118, b11111111111111111111111111111111119, (short) (b11111111111111111111111111111111119 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111111111111111111111110 = bArr[792];
                                            byte b2111111113 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111111111111111111111110, b2111111113, (short) (b2111111113 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b121111110 = bArr[792];
                                        byte b121111111 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b121111110, b121111111, (short) (b121111111 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b111111111111111111111111111111111111 = bArr[792];
                                            byte b111111111111111111111111111111111112 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b111111111111111111111111111111111111, b111111111111111111111111111111111112, (short) (b111111111111111111111111111111111112 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b111111111111111111111111111111111113 = bArr[792];
                                                byte b111111111111111111111111111111111114 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111111111111111111111111111111111113, b111111111111111111111111111111111114, (short) (b111111111111111111111111111111111114 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111111111111111111111111111111111115 = bArr[792];
                                                byte b2111111114 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111111111111111111111111111111111115, b2111111114, (short) (b2111111114 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b111111111111111111111111111111111116 = bArr[792];
                                            byte b111111111111111111111111111111111117 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111111111111111111111111111116, b111111111111111111111111111111111117, (short) (b111111111111111111111111111111111117 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111111111111111111111118 = bArr[792];
                                            byte b2111111115 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111111111111111111111118, b2111111115, (short) (b2111111115 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111111111111111111119 = bArr[792];
                                        byte b1111111111111111111111111111111111110 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b111111111111111111111111111111111119, b1111111111111111111111111111111111110, (short) (b1111111111111111111111111111111111110 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b1111111111111111111111111111111111111 = bArr[792];
                                            byte b1111111111111111111111111111111111112 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111111111111111111111111111, b1111111111111111111111111111111111112, (short) (b1111111111111111111111111111111111112 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b1111111111111111111111111111111111113 = bArr[792];
                                            byte b2111111116 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b1111111111111111111111111111111111113, b2111111116, (short) (b2111111116 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b1111111111111111111111111111111111114 = bArr[792];
                                        byte b1111111111111111111111111111111111115 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b1111111111111111111111111111111111114, b1111111111111111111111111111111111115, (short) (b1111111111111111111111111111111111115 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b1111111111111111111111111111111111116 = bArr[792];
                                        byte b2111111117 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b1111111111111111111111111111111111116, b2111111117, (short) (b2111111117 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    bArr = ParcelableVolumeInfo;
                                    byte b121111112 = bArr[792];
                                    byte b121111113 = bArr[33];
                                    objArr = new Object[1];
                                    a(b121111112, b121111113, (short) (b121111113 | 322), objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        byte b121111114 = bArr[792];
                                        byte b121111115 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b121111114, b121111115, (short) (b121111115 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b1111111111111111111111111111111111117 = bArr[792];
                                            byte b1111111111111111111111111111111111118 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b1111111111111111111111111111111111117, b1111111111111111111111111111111111118, (short) (b1111111111111111111111111111111111118 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111111111111111111111111111111111119 = bArr[792];
                                                byte b11111111111111111111111111111111111110 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111119, b11111111111111111111111111111111111110, (short) (b11111111111111111111111111111111111110 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111111111 = bArr[792];
                                                byte b2111111118 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111111111, b2111111118, (short) (b2111111118 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111111112 = bArr[792];
                                            byte b11111111111111111111111111111111111113 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111111111112, b11111111111111111111111111111111111113, (short) (b11111111111111111111111111111111111113 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111114 = bArr[792];
                                            byte b2111111119 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111114, b2111111119, (short) (b2111111119 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111111111111111111111111111111115 = bArr[792];
                                        byte b11111111111111111111111111111111111116 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b11111111111111111111111111111111111115, b11111111111111111111111111111111111116, (short) (b11111111111111111111111111111111111116 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b11111111111111111111111111111111111117 = bArr[792];
                                            byte b11111111111111111111111111111111111118 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111111111117, b11111111111111111111111111111111111118, (short) (b11111111111111111111111111111111111118 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111119 = bArr[792];
                                            byte b21111111110 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111119, b21111111110, (short) (b21111111110 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111111111111111111111110 = bArr[792];
                                        byte b111111111111111111111111111111111111111 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b111111111111111111111111111111111111110, b111111111111111111111111111111111111111, (short) (b111111111111111111111111111111111111111 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111111111111111111111111111111112 = bArr[792];
                                        byte b21111111111 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111111111111111111111111111111112, b21111111111, (short) (b21111111111 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b121111116 = bArr[792];
                                    byte b121111117 = bArr[33];
                                    objArr2 = new Object[1];
                                    a(b121111116, b121111117, (short) (b121111117 | 322), objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i6 < 69) {
                                        break;
                                    }
                                    if (i6 >= 75) {
                                        byte b111111111111111111111111111111111111113 = bArr[792];
                                        byte b111111111111111111111111111111111111114 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b111111111111111111111111111111111111113, b111111111111111111111111111111111111114, (short) (b111111111111111111111111111111111111114 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b111111111111111111111111111111111111115 = bArr[792];
                                            byte b111111111111111111111111111111111111116 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111111111111111111111111111111115, b111111111111111111111111111111111111116, (short) (b111111111111111111111111111111111111116 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111111111111111111111111117 = bArr[792];
                                            byte b21111111112 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111111111111111111111111117, b21111111112, (short) (b21111111112 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111111111111111111111118 = bArr[792];
                                        byte b111111111111111111111111111111111111119 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b111111111111111111111111111111111111118, b111111111111111111111111111111111111119, (short) (b111111111111111111111111111111111111119 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b1111111111111111111111111111111111111110 = bArr[792];
                                        byte b21111111113 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b1111111111111111111111111111111111111110, b21111111113, (short) (b21111111113 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b1111111111111111111111111111111111111111 = bArr[792];
                                    byte b1111111111111111111111111111111111111112 = bArr[33];
                                    objArr3 = new Object[1];
                                    a(b1111111111111111111111111111111111111111, b1111111111111111111111111111111111111112, (short) (b1111111111111111111111111111111111111112 | 322), objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        byte b1111111111111111111111111111111111111113 = bArr[792];
                                        byte b1111111111111111111111111111111111111114 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b1111111111111111111111111111111111111113, b1111111111111111111111111111111111111114, (short) (b1111111111111111111111111111111111111114 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b1111111111111111111111111111111111111115 = bArr[792];
                                        byte b21111111114 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b1111111111111111111111111111111111111115, b21111111114, (short) (b21111111114 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b1111111111111111111111111111111111111116 = bArr[792];
                                    byte b1111111111111111111111111111111111111117 = bArr[33];
                                    objArr4 = new Object[1];
                                    a(b1111111111111111111111111111111111111116, b1111111111111111111111111111111111111117, (short) (b1111111111111111111111111111111111111117 | 322), objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b1111111111111111111111111111111111111118 = bArr[792];
                                    byte b21111111115 = bArr[33];
                                    objArr5 = new Object[1];
                                    a(b1111111111111111111111111111111111111118, b21111111115, (short) (b21111111115 | 322), objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                    }
                                    throw th;
                                    cleartextsubstitutiondefault.serializer = th;
                                    cleartextsubstitutiondefault.read(24);
                                }
                                break;
                            case -18:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(13);
                                MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                                i6 = i7;
                                break;
                            case -17:
                                try {
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                                    cleartextsubstitutiondefault.read(10);
                                    i6 = i7;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (i6 >= 18 || i6 >= 21) {
                                        if (i6 >= 50 || i6 >= i8) {
                                            bArr = ParcelableVolumeInfo;
                                            byte b121111118 = bArr[792];
                                            byte b121111119 = bArr[33];
                                            objArr = new Object[1];
                                            a(b121111118, b121111119, (short) (b121111119 | 322), objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th) || i6 < i8 || i6 >= 64) {
                                                byte b1211111110 = bArr[792];
                                                byte b1211111111 = bArr[33];
                                                objArr2 = new Object[1];
                                                a(b1211111110, b1211111111, (short) (b1211111111 | 322), objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th) && i6 >= 59 && i6 < 60) {
                                                    i = 90;
                                                } else if (i6 < 69 && i6 < 72) {
                                                    i = 25;
                                                } else if (i6 >= 75 || i6 >= 79) {
                                                    byte b1111111111111111111111111111111111111119 = bArr[792];
                                                    byte b11111111111111111111111111111111111111110 = bArr[33];
                                                    objArr3 = new Object[1];
                                                    a(b1111111111111111111111111111111111111119, b11111111111111111111111111111111111111110, (short) (b11111111111111111111111111111111111111110 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th) || i6 < 66 || i6 >= 79) {
                                                        byte b11111111111111111111111111111111111111111 = bArr[792];
                                                        byte b11111111111111111111111111111111111111112 = bArr[33];
                                                        objArr4 = new Object[1];
                                                        a(b11111111111111111111111111111111111111111, b11111111111111111111111111111111111111112, (short) (b11111111111111111111111111111111111111112 | 322), objArr4);
                                                        if (Class.forName((String) objArr4[0]).isInstance(th) || i6 < 68 || i6 >= 79) {
                                                            byte b11111111111111111111111111111111111111113 = bArr[792];
                                                            byte b21111111116 = bArr[33];
                                                            objArr5 = new Object[1];
                                                            a(b11111111111111111111111111111111111111113, b21111111116, (short) (b21111111116 | 322), objArr5);
                                                            if (Class.forName((String) objArr5[0]).isInstance(th) || i6 < 73 || i6 >= 79) {
                                                                throw th;
                                                            }
                                                            i6 = 90;
                                                        }
                                                    }
                                                    i = 89;
                                                } else {
                                                    i = 64;
                                                }
                                            } else {
                                                i = 90;
                                            }
                                        } else {
                                            i = 48;
                                        }
                                        i6 = i;
                                    } else {
                                        i = 25;
                                        i6 = i;
                                    }
                                    cleartextsubstitutiondefault.serializer = th;
                                    cleartextsubstitutiondefault.read(24);
                                }
                                break;
                            case -16:
                                cleartextsubstitutiondefault.read(8);
                                return (getTraversalIndexdelegate) cleartextsubstitutiondefault.write;
                            case -15:
                                i6 = 1;
                                break;
                            case Float16.MinExponent /* -14 */:
                                i6 = 39;
                                break;
                            case -13:
                                cleartextsubstitutiondefault.read(8);
                                throw ((Throwable) cleartextsubstitutiondefault.write);
                            case -12:
                                i6 = 37;
                                break;
                            case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                try {
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                    cleartextsubstitutiondefault.read(2);
                                    try {
                                        cleartextsubstitutiondefault.read(3);
                                        Object obj = cleartextsubstitutiondefault.write;
                                        try {
                                            byte[] bArr4 = ParcelableVolumeInfo;
                                            Object[] objArr34 = new Object[1];
                                            a(bArr4[792], bArr4[295], (short) 1233, objArr34);
                                            Class<?> cls10 = Class.forName((String) objArr34[0]);
                                            Object[] objArr35 = new Object[1];
                                            a(bArr4[262], bArr4[77], (short) 1266, objArr35);
                                            try {
                                                cls10.getMethod((String) objArr35[0], null).invoke(obj, null);
                                                i6 = i7;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        if (i6 >= 18) {
                                            if (i6 >= 50) {
                                                bArr = ParcelableVolumeInfo;
                                                byte b1211111112 = bArr[792];
                                                byte b1211111113 = bArr[33];
                                                objArr = new Object[1];
                                                a(b1211111112, b1211111113, (short) (b1211111113 | 322), objArr);
                                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                    byte b1211111114 = bArr[792];
                                                    byte b1211111115 = bArr[33];
                                                    objArr2 = new Object[1];
                                                    a(b1211111114, b1211111115, (short) (b1211111115 | 322), objArr2);
                                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    if (i6 < 69) {
                                                        break;
                                                    }
                                                    if (i6 >= 75) {
                                                        byte b11111111111111111111111111111111111111114 = bArr[792];
                                                        byte b11111111111111111111111111111111111111115 = bArr[33];
                                                        objArr3 = new Object[1];
                                                        a(b11111111111111111111111111111111111111114, b11111111111111111111111111111111111111115, (short) (b11111111111111111111111111111111111111115 | 322), objArr3);
                                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                            byte b11111111111111111111111111111111111111116 = bArr[792];
                                                            byte b11111111111111111111111111111111111111117 = bArr[33];
                                                            objArr4 = new Object[1];
                                                            a(b11111111111111111111111111111111111111116, b11111111111111111111111111111111111111117, (short) (b11111111111111111111111111111111111111117 | 322), objArr4);
                                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                                break;
                                                            }
                                                            byte b11111111111111111111111111111111111111118 = bArr[792];
                                                            byte b21111111117 = bArr[33];
                                                            objArr5 = new Object[1];
                                                            a(b11111111111111111111111111111111111111118, b21111111117, (short) (b21111111117 | 322), objArr5);
                                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                            }
                                                            throw th;
                                                        }
                                                        byte b11111111111111111111111111111111111111119 = bArr[792];
                                                        byte b111111111111111111111111111111111111111110 = bArr[33];
                                                        objArr4 = new Object[1];
                                                        a(b11111111111111111111111111111111111111119, b111111111111111111111111111111111111111110, (short) (b111111111111111111111111111111111111111110 | 322), objArr4);
                                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                            break;
                                                        }
                                                        byte b111111111111111111111111111111111111111111 = bArr[792];
                                                        byte b21111111118 = bArr[33];
                                                        objArr5 = new Object[1];
                                                        a(b111111111111111111111111111111111111111111, b21111111118, (short) (b21111111118 | 322), objArr5);
                                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                        }
                                                        throw th;
                                                    }
                                                    byte b111111111111111111111111111111111111111112 = bArr[792];
                                                    byte b111111111111111111111111111111111111111113 = bArr[33];
                                                    objArr3 = new Object[1];
                                                    a(b111111111111111111111111111111111111111112, b111111111111111111111111111111111111111113, (short) (b111111111111111111111111111111111111111113 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        byte b111111111111111111111111111111111111111114 = bArr[792];
                                                        byte b111111111111111111111111111111111111111115 = bArr[33];
                                                        objArr4 = new Object[1];
                                                        a(b111111111111111111111111111111111111111114, b111111111111111111111111111111111111111115, (short) (b111111111111111111111111111111111111111115 | 322), objArr4);
                                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                            break;
                                                        }
                                                        byte b111111111111111111111111111111111111111116 = bArr[792];
                                                        byte b21111111119 = bArr[33];
                                                        objArr5 = new Object[1];
                                                        a(b111111111111111111111111111111111111111116, b21111111119, (short) (b21111111119 | 322), objArr5);
                                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                        }
                                                        throw th;
                                                    }
                                                    byte b111111111111111111111111111111111111111117 = bArr[792];
                                                    byte b111111111111111111111111111111111111111118 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111111111111111111111111111117, b111111111111111111111111111111111111111118, (short) (b111111111111111111111111111111111111111118 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111111111111111111111111111111111111119 = bArr[792];
                                                    byte b211111111110 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111111111111111111111111111111111111119, b211111111110, (short) (b211111111110 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1211111116 = bArr[792];
                                                byte b1211111117 = bArr[33];
                                                objArr2 = new Object[1];
                                                a(b1211111116, b1211111117, (short) (b1211111117 | 322), objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i6 < 69) {
                                                    break;
                                                }
                                                if (i6 >= 75) {
                                                    byte b1111111111111111111111111111111111111111110 = bArr[792];
                                                    byte b1111111111111111111111111111111111111111111 = bArr[33];
                                                    objArr3 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111110, b1111111111111111111111111111111111111111111, (short) (b1111111111111111111111111111111111111111111 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        byte b1111111111111111111111111111111111111111112 = bArr[792];
                                                        byte b1111111111111111111111111111111111111111113 = bArr[33];
                                                        objArr4 = new Object[1];
                                                        a(b1111111111111111111111111111111111111111112, b1111111111111111111111111111111111111111113, (short) (b1111111111111111111111111111111111111111113 | 322), objArr4);
                                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                            break;
                                                        }
                                                        byte b1111111111111111111111111111111111111111114 = bArr[792];
                                                        byte b211111111111 = bArr[33];
                                                        objArr5 = new Object[1];
                                                        a(b1111111111111111111111111111111111111111114, b211111111111, (short) (b211111111111 | 322), objArr5);
                                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                        }
                                                        throw th;
                                                    }
                                                    byte b1111111111111111111111111111111111111111115 = bArr[792];
                                                    byte b1111111111111111111111111111111111111111116 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111115, b1111111111111111111111111111111111111111116, (short) (b1111111111111111111111111111111111111111116 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111111111111111111111111111111117 = bArr[792];
                                                    byte b211111111112 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111117, b211111111112, (short) (b211111111112 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111111111111111111111111111118 = bArr[792];
                                                byte b1111111111111111111111111111111111111111119 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111111111111111111111111111111111111111118, b1111111111111111111111111111111111111111119, (short) (b1111111111111111111111111111111111111111119 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b11111111111111111111111111111111111111111110 = bArr[792];
                                                    byte b11111111111111111111111111111111111111111111 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b11111111111111111111111111111111111111111110, b11111111111111111111111111111111111111111111, (short) (b11111111111111111111111111111111111111111111 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b11111111111111111111111111111111111111111112 = bArr[792];
                                                    byte b211111111113 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b11111111111111111111111111111111111111111112, b211111111113, (short) (b211111111113 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b11111111111111111111111111111111111111111113 = bArr[792];
                                                byte b11111111111111111111111111111111111111111114 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111111111111111111113, b11111111111111111111111111111111111111111114, (short) (b11111111111111111111111111111111111111111114 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111111111111115 = bArr[792];
                                                byte b211111111114 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111111111111115, b211111111114, (short) (b211111111114 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            bArr = ParcelableVolumeInfo;
                                            byte b1211111118 = bArr[792];
                                            byte b1211111119 = bArr[33];
                                            objArr = new Object[1];
                                            a(b1211111118, b1211111119, (short) (b1211111119 | 322), objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                byte b12111111110 = bArr[792];
                                                byte b12111111111 = bArr[33];
                                                objArr2 = new Object[1];
                                                a(b12111111110, b12111111111, (short) (b12111111111 | 322), objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i6 < 69) {
                                                    break;
                                                }
                                                if (i6 >= 75) {
                                                    byte b11111111111111111111111111111111111111111116 = bArr[792];
                                                    byte b11111111111111111111111111111111111111111117 = bArr[33];
                                                    objArr3 = new Object[1];
                                                    a(b11111111111111111111111111111111111111111116, b11111111111111111111111111111111111111111117, (short) (b11111111111111111111111111111111111111111117 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        byte b11111111111111111111111111111111111111111118 = bArr[792];
                                                        byte b11111111111111111111111111111111111111111119 = bArr[33];
                                                        objArr4 = new Object[1];
                                                        a(b11111111111111111111111111111111111111111118, b11111111111111111111111111111111111111111119, (short) (b11111111111111111111111111111111111111111119 | 322), objArr4);
                                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                            break;
                                                        }
                                                        byte b111111111111111111111111111111111111111111110 = bArr[792];
                                                        byte b211111111115 = bArr[33];
                                                        objArr5 = new Object[1];
                                                        a(b111111111111111111111111111111111111111111110, b211111111115, (short) (b211111111115 | 322), objArr5);
                                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                        }
                                                        throw th;
                                                    }
                                                    byte b111111111111111111111111111111111111111111111 = bArr[792];
                                                    byte b111111111111111111111111111111111111111111112 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111, b111111111111111111111111111111111111111111112, (short) (b111111111111111111111111111111111111111111112 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111111111111111111111111111111111111111113 = bArr[792];
                                                    byte b211111111116 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111113, b211111111116, (short) (b211111111116 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b111111111111111111111111111111111111111111114 = bArr[792];
                                                byte b111111111111111111111111111111111111111111115 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b111111111111111111111111111111111111111111114, b111111111111111111111111111111111111111111115, (short) (b111111111111111111111111111111111111111111115 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b111111111111111111111111111111111111111111116 = bArr[792];
                                                    byte b111111111111111111111111111111111111111111117 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111116, b111111111111111111111111111111111111111111117, (short) (b111111111111111111111111111111111111111111117 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111111111111111111111111111111111111111118 = bArr[792];
                                                    byte b211111111117 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111118, b211111111117, (short) (b211111111117 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b111111111111111111111111111111111111111111119 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111110 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111111111111111111111111111111111111111111119, b1111111111111111111111111111111111111111111110, (short) (b1111111111111111111111111111111111111111111110 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111111111111111111111111111 = bArr[792];
                                                byte b211111111118 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111, b211111111118, (short) (b211111111118 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b12111111112 = bArr[792];
                                            byte b12111111113 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b12111111112, b12111111113, (short) (b12111111113 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b1111111111111111111111111111111111111111111112 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111113 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111112, b1111111111111111111111111111111111111111111113, (short) (b1111111111111111111111111111111111111111111113 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b1111111111111111111111111111111111111111111114 = bArr[792];
                                                    byte b1111111111111111111111111111111111111111111115 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111111114, b1111111111111111111111111111111111111111111115, (short) (b1111111111111111111111111111111111111111111115 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111111111111111111111111111111111116 = bArr[792];
                                                    byte b211111111119 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111111116, b211111111119, (short) (b211111111119 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111111111111111111111111111111117 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111118 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111117, b1111111111111111111111111111111111111111111118, (short) (b1111111111111111111111111111111111111111111118 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111111111111111111111111119 = bArr[792];
                                                byte b2111111111110 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111119, b2111111111110, (short) (b2111111111110 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111111111111111110 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111110, b11111111111111111111111111111111111111111111111, (short) (b11111111111111111111111111111111111111111111111 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111111111111111111111111111111111111111111112 = bArr[792];
                                                byte b11111111111111111111111111111111111111111111113 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111112, b11111111111111111111111111111111111111111111113, (short) (b11111111111111111111111111111111111111111111113 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111111111111111114 = bArr[792];
                                                byte b2111111111111 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111114, b2111111111111, (short) (b2111111111111 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111111111111111115 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111116 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111115, b11111111111111111111111111111111111111111111116, (short) (b11111111111111111111111111111111111111111111116 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111111111111117 = bArr[792];
                                            byte b2111111111112 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111117, b2111111111112, (short) (b2111111111112 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        if (i6 >= 50) {
                                            bArr = ParcelableVolumeInfo;
                                            byte b12111111114 = bArr[792];
                                            byte b12111111115 = bArr[33];
                                            objArr = new Object[1];
                                            a(b12111111114, b12111111115, (short) (b12111111115 | 322), objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                byte b12111111116 = bArr[792];
                                                byte b12111111117 = bArr[33];
                                                objArr2 = new Object[1];
                                                a(b12111111116, b12111111117, (short) (b12111111117 | 322), objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i6 < 69) {
                                                    break;
                                                }
                                                if (i6 >= 75) {
                                                    byte b11111111111111111111111111111111111111111111118 = bArr[792];
                                                    byte b11111111111111111111111111111111111111111111119 = bArr[33];
                                                    objArr3 = new Object[1];
                                                    a(b11111111111111111111111111111111111111111111118, b11111111111111111111111111111111111111111111119, (short) (b11111111111111111111111111111111111111111111119 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        byte b111111111111111111111111111111111111111111111110 = bArr[792];
                                                        byte b111111111111111111111111111111111111111111111111 = bArr[33];
                                                        objArr4 = new Object[1];
                                                        a(b111111111111111111111111111111111111111111111110, b111111111111111111111111111111111111111111111111, (short) (b111111111111111111111111111111111111111111111111 | 322), objArr4);
                                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                            break;
                                                        }
                                                        byte b111111111111111111111111111111111111111111111112 = bArr[792];
                                                        byte b2111111111113 = bArr[33];
                                                        objArr5 = new Object[1];
                                                        a(b111111111111111111111111111111111111111111111112, b2111111111113, (short) (b2111111111113 | 322), objArr5);
                                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                        }
                                                        throw th;
                                                    }
                                                    byte b111111111111111111111111111111111111111111111113 = bArr[792];
                                                    byte b111111111111111111111111111111111111111111111114 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111113, b111111111111111111111111111111111111111111111114, (short) (b111111111111111111111111111111111111111111111114 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111111111111111111111111111111111111111111115 = bArr[792];
                                                    byte b2111111111114 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111115, b2111111111114, (short) (b2111111111114 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b111111111111111111111111111111111111111111111116 = bArr[792];
                                                byte b111111111111111111111111111111111111111111111117 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b111111111111111111111111111111111111111111111116, b111111111111111111111111111111111111111111111117, (short) (b111111111111111111111111111111111111111111111117 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b111111111111111111111111111111111111111111111118 = bArr[792];
                                                    byte b111111111111111111111111111111111111111111111119 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111118, b111111111111111111111111111111111111111111111119, (short) (b111111111111111111111111111111111111111111111119 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111111111111111111111111111111111111110 = bArr[792];
                                                    byte b2111111111115 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111111111110, b2111111111115, (short) (b2111111111115 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111112 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111, b1111111111111111111111111111111111111111111111112, (short) (b1111111111111111111111111111111111111111111111112 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111111111111111111111111111113 = bArr[792];
                                                byte b2111111111116 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111113, b2111111111116, (short) (b2111111111116 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b12111111118 = bArr[792];
                                            byte b12111111119 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b12111111118, b12111111119, (short) (b12111111119 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b1111111111111111111111111111111111111111111111114 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111115 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111114, b1111111111111111111111111111111111111111111111115, (short) (b1111111111111111111111111111111111111111111111115 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b1111111111111111111111111111111111111111111111116 = bArr[792];
                                                    byte b1111111111111111111111111111111111111111111111117 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111111111116, b1111111111111111111111111111111111111111111111117, (short) (b1111111111111111111111111111111111111111111111117 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111111111111111111111111111111111111118 = bArr[792];
                                                    byte b2111111111117 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111111111118, b2111111111117, (short) (b2111111111117 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111111111111111111111111111111111119 = bArr[792];
                                                byte b11111111111111111111111111111111111111111111111110 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111119, b11111111111111111111111111111111111111111111111110, (short) (b11111111111111111111111111111111111111111111111110 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111111111111111111111 = bArr[792];
                                                byte b2111111111118 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111111, b2111111111118, (short) (b2111111111118 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111111111111111111112 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111113 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111112, b11111111111111111111111111111111111111111111111113, (short) (b11111111111111111111111111111111111111111111111113 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111111111111111111111111111111111111111111111114 = bArr[792];
                                                byte b11111111111111111111111111111111111111111111111115 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111114, b11111111111111111111111111111111111111111111111115, (short) (b11111111111111111111111111111111111111111111111115 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111111111111111111116 = bArr[792];
                                                byte b2111111111119 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111116, b2111111111119, (short) (b2111111111119 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111111111111111111117 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111118 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111117, b11111111111111111111111111111111111111111111111118, (short) (b11111111111111111111111111111111111111111111111118 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111111111111111119 = bArr[792];
                                            byte b21111111111110 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111119, b21111111111110, (short) (b21111111111110 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        bArr = ParcelableVolumeInfo;
                                        byte b121111111110 = bArr[792];
                                        byte b121111111111 = bArr[33];
                                        objArr = new Object[1];
                                        a(b121111111110, b121111111111, (short) (b121111111111 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b121111111112 = bArr[792];
                                            byte b121111111113 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b121111111112, b121111111113, (short) (b121111111113 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b111111111111111111111111111111111111111111111111110 = bArr[792];
                                                byte b111111111111111111111111111111111111111111111111111 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b111111111111111111111111111111111111111111111111110, b111111111111111111111111111111111111111111111111111, (short) (b111111111111111111111111111111111111111111111111111 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b111111111111111111111111111111111111111111111111112 = bArr[792];
                                                    byte b111111111111111111111111111111111111111111111111113 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111111112, b111111111111111111111111111111111111111111111111113, (short) (b111111111111111111111111111111111111111111111111113 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111111111111111111111111111111111111111111111114 = bArr[792];
                                                    byte b21111111111111 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111111114, b21111111111111, (short) (b21111111111111 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b111111111111111111111111111111111111111111111111115 = bArr[792];
                                                byte b111111111111111111111111111111111111111111111111116 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111111111111111111111111111111111111111111111111115, b111111111111111111111111111111111111111111111111116, (short) (b111111111111111111111111111111111111111111111111116 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111111111111111111111111111111111111111111111111117 = bArr[792];
                                                byte b21111111111112 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111111111111111111111111111111111111111111111111117, b21111111111112, (short) (b21111111111112 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b111111111111111111111111111111111111111111111111118 = bArr[792];
                                            byte b111111111111111111111111111111111111111111111111119 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b111111111111111111111111111111111111111111111111118, b111111111111111111111111111111111111111111111111119, (short) (b111111111111111111111111111111111111111111111111119 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111111111111111111111111111111111111111111111111110 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111111111 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111110, b1111111111111111111111111111111111111111111111111111, (short) (b1111111111111111111111111111111111111111111111111111 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111112 = bArr[792];
                                                byte b21111111111113 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111112, b21111111111113, (short) (b21111111111113 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111111111111111111111111111111111111113 = bArr[792];
                                            byte b1111111111111111111111111111111111111111111111111114 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111113, b1111111111111111111111111111111111111111111111111114, (short) (b1111111111111111111111111111111111111111111111111114 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b1111111111111111111111111111111111111111111111111115 = bArr[792];
                                            byte b21111111111114 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111115, b21111111111114, (short) (b21111111111114 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b121111111114 = bArr[792];
                                        byte b121111111115 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b121111111114, b121111111115, (short) (b121111111115 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b1111111111111111111111111111111111111111111111111116 = bArr[792];
                                            byte b1111111111111111111111111111111111111111111111111117 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111116, b1111111111111111111111111111111111111111111111111117, (short) (b1111111111111111111111111111111111111111111111111117 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111111111111111111111111111111111111111111111111118 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111111119 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111118, b1111111111111111111111111111111111111111111111111119, (short) (b1111111111111111111111111111111111111111111111111119 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111111111111111111111110 = bArr[792];
                                                byte b21111111111115 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111111110, b21111111111115, (short) (b21111111111115 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111111 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111111112 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111, b11111111111111111111111111111111111111111111111111112, (short) (b11111111111111111111111111111111111111111111111111112 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111113 = bArr[792];
                                            byte b21111111111116 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111113, b21111111111116, (short) (b21111111111116 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111111111111111111111111111111111111111111111114 = bArr[792];
                                        byte b11111111111111111111111111111111111111111111111111115 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b11111111111111111111111111111111111111111111111111114, b11111111111111111111111111111111111111111111111111115, (short) (b11111111111111111111111111111111111111111111111111115 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b11111111111111111111111111111111111111111111111111116 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111111117 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111116, b11111111111111111111111111111111111111111111111111117, (short) (b11111111111111111111111111111111111111111111111111117 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111118 = bArr[792];
                                            byte b21111111111117 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111118, b21111111111117, (short) (b21111111111117 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111111111111111111111111111111111111111111111119 = bArr[792];
                                        byte b111111111111111111111111111111111111111111111111111110 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b11111111111111111111111111111111111111111111111111119, b111111111111111111111111111111111111111111111111111110, (short) (b111111111111111111111111111111111111111111111111111110 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111111111111111111111111111111111111111111111111 = bArr[792];
                                        byte b21111111111118 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111111111111111111111111111111111111111111111111, b21111111111118, (short) (b21111111111118 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                        cleartextsubstitutiondefault.serializer = th;
                                        cleartextsubstitutiondefault.read(24);
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                                break;
                            case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                try {
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                    cleartextsubstitutiondefault.read(2);
                                    cleartextsubstitutiondefault.read(3);
                                    cleartextsubstitutiondefault.serializer = (getTraversalIndexdelegate) RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1621247262, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{(LocalAuthDataSource) cleartextsubstitutiondefault.write}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1621247263);
                                    i2 = 4;
                                    cleartextsubstitutiondefault.read(i2);
                                    i6 = i7;
                                } catch (Throwable th9) {
                                    th = th9;
                                    if (i6 >= 18) {
                                        if (i6 >= 50) {
                                            bArr = ParcelableVolumeInfo;
                                            byte b121111111116 = bArr[792];
                                            byte b121111111117 = bArr[33];
                                            objArr = new Object[1];
                                            a(b121111111116, b121111111117, (short) (b121111111117 | 322), objArr);
                                            if (Class.forName((String) objArr[0]).isInstance(th)) {
                                                byte b121111111118 = bArr[792];
                                                byte b121111111119 = bArr[33];
                                                objArr2 = new Object[1];
                                                a(b121111111118, b121111111119, (short) (b121111111119 | 322), objArr2);
                                                if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                    break;
                                                }
                                                if (i6 < 69) {
                                                    break;
                                                }
                                                if (i6 >= 75) {
                                                    byte b111111111111111111111111111111111111111111111111111112 = bArr[792];
                                                    byte b111111111111111111111111111111111111111111111111111113 = bArr[33];
                                                    objArr3 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111111111112, b111111111111111111111111111111111111111111111111111113, (short) (b111111111111111111111111111111111111111111111111111113 | 322), objArr3);
                                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                        byte b111111111111111111111111111111111111111111111111111114 = bArr[792];
                                                        byte b111111111111111111111111111111111111111111111111111115 = bArr[33];
                                                        objArr4 = new Object[1];
                                                        a(b111111111111111111111111111111111111111111111111111114, b111111111111111111111111111111111111111111111111111115, (short) (b111111111111111111111111111111111111111111111111111115 | 322), objArr4);
                                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                            break;
                                                        }
                                                        byte b111111111111111111111111111111111111111111111111111116 = bArr[792];
                                                        byte b21111111111119 = bArr[33];
                                                        objArr5 = new Object[1];
                                                        a(b111111111111111111111111111111111111111111111111111116, b21111111111119, (short) (b21111111111119 | 322), objArr5);
                                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                        }
                                                        throw th;
                                                    }
                                                    byte b111111111111111111111111111111111111111111111111111117 = bArr[792];
                                                    byte b111111111111111111111111111111111111111111111111111118 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111111111117, b111111111111111111111111111111111111111111111111111118, (short) (b111111111111111111111111111111111111111111111111111118 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111111111111111111111111111111111111111111111111119 = bArr[792];
                                                    byte b211111111111110 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111111111119, b211111111111110, (short) (b211111111111110 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111111110 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111111111111 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111110, b1111111111111111111111111111111111111111111111111111111, (short) (b1111111111111111111111111111111111111111111111111111111 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b1111111111111111111111111111111111111111111111111111112 = bArr[792];
                                                    byte b1111111111111111111111111111111111111111111111111111113 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111111111111111112, b1111111111111111111111111111111111111111111111111111113, (short) (b1111111111111111111111111111111111111111111111111111113 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111111111111111111111111111111111111111111114 = bArr[792];
                                                    byte b211111111111111 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111111111111111114, b211111111111111, (short) (b211111111111111 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111111115 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111111111116 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111115, b1111111111111111111111111111111111111111111111111111116, (short) (b1111111111111111111111111111111111111111111111111111116 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111111117 = bArr[792];
                                                byte b211111111111112 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111117, b211111111111112, (short) (b211111111111112 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1211111111110 = bArr[792];
                                            byte b1211111111111 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b1211111111110, b1211111111111, (short) (b1211111111111 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b1111111111111111111111111111111111111111111111111111118 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111111111119 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111118, b1111111111111111111111111111111111111111111111111111119, (short) (b1111111111111111111111111111111111111111111111111111119 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b11111111111111111111111111111111111111111111111111111110 = bArr[792];
                                                    byte b11111111111111111111111111111111111111111111111111111111 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b11111111111111111111111111111111111111111111111111111110, b11111111111111111111111111111111111111111111111111111111, (short) (b11111111111111111111111111111111111111111111111111111111 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b11111111111111111111111111111111111111111111111111111112 = bArr[792];
                                                    byte b211111111111113 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b11111111111111111111111111111111111111111111111111111112, b211111111111113, (short) (b211111111111113 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b11111111111111111111111111111111111111111111111111111113 = bArr[792];
                                                byte b11111111111111111111111111111111111111111111111111111114 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111111111113, b11111111111111111111111111111111111111111111111111111114, (short) (b11111111111111111111111111111111111111111111111111111114 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111111111111111111111111115 = bArr[792];
                                                byte b211111111111114 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111111111115, b211111111111114, (short) (b211111111111114 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111111116 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111111111117 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111116, b11111111111111111111111111111111111111111111111111111117, (short) (b11111111111111111111111111111111111111111111111111111117 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111111111111111111111111111111111111111111111111111118 = bArr[792];
                                                byte b11111111111111111111111111111111111111111111111111111119 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111111111118, b11111111111111111111111111111111111111111111111111111119, (short) (b11111111111111111111111111111111111111111111111111111119 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b111111111111111111111111111111111111111111111111111111110 = bArr[792];
                                                byte b211111111111115 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b111111111111111111111111111111111111111111111111111111110, b211111111111115, (short) (b211111111111115 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b111111111111111111111111111111111111111111111111111111111 = bArr[792];
                                            byte b111111111111111111111111111111111111111111111111111111112 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111111111111111111111111111111111111111111111111111, b111111111111111111111111111111111111111111111111111111112, (short) (b111111111111111111111111111111111111111111111111111111112 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111111111111111111111111111111111111111111113 = bArr[792];
                                            byte b211111111111116 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111111111111111111111111111111111111111111113, b211111111111116, (short) (b211111111111116 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        bArr = ParcelableVolumeInfo;
                                        byte b1211111111112 = bArr[792];
                                        byte b1211111111113 = bArr[33];
                                        objArr = new Object[1];
                                        a(b1211111111112, b1211111111113, (short) (b1211111111113 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b1211111111114 = bArr[792];
                                            byte b1211111111115 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b1211111111114, b1211111111115, (short) (b1211111111115 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b111111111111111111111111111111111111111111111111111111114 = bArr[792];
                                                byte b111111111111111111111111111111111111111111111111111111115 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b111111111111111111111111111111111111111111111111111111114, b111111111111111111111111111111111111111111111111111111115, (short) (b111111111111111111111111111111111111111111111111111111115 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b111111111111111111111111111111111111111111111111111111116 = bArr[792];
                                                    byte b111111111111111111111111111111111111111111111111111111117 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111111111111116, b111111111111111111111111111111111111111111111111111111117, (short) (b111111111111111111111111111111111111111111111111111111117 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b111111111111111111111111111111111111111111111111111111118 = bArr[792];
                                                    byte b211111111111117 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111111111111118, b211111111111117, (short) (b211111111111117 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b111111111111111111111111111111111111111111111111111111119 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111111111111110 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b111111111111111111111111111111111111111111111111111111119, b1111111111111111111111111111111111111111111111111111111110, (short) (b1111111111111111111111111111111111111111111111111111111110 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111111111111 = bArr[792];
                                                byte b211111111111118 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111111111, b211111111111118, (short) (b211111111111118 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111111111111111111111111111111111111111111112 = bArr[792];
                                            byte b1111111111111111111111111111111111111111111111111111111113 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111111111112, b1111111111111111111111111111111111111111111111111111111113, (short) (b1111111111111111111111111111111111111111111111111111111113 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111111111111111111111111111111111111111111111111111111114 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111111111111115 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111111114, b1111111111111111111111111111111111111111111111111111111115, (short) (b1111111111111111111111111111111111111111111111111111111115 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111111111116 = bArr[792];
                                                byte b211111111111119 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111111116, b211111111111119, (short) (b211111111111119 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111111111111111111111111111111111111111111117 = bArr[792];
                                            byte b1111111111111111111111111111111111111111111111111111111118 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111111111117, b1111111111111111111111111111111111111111111111111111111118, (short) (b1111111111111111111111111111111111111111111111111111111118 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b1111111111111111111111111111111111111111111111111111111119 = bArr[792];
                                            byte b2111111111111110 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111111111119, b2111111111111110, (short) (b2111111111111110 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b1211111111116 = bArr[792];
                                        byte b1211111111117 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b1211111111116, b1211111111117, (short) (b1211111111117 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b11111111111111111111111111111111111111111111111111111111110 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111111111111111 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111111110, b11111111111111111111111111111111111111111111111111111111111, (short) (b11111111111111111111111111111111111111111111111111111111111 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111111111111111111111111111111111111111111111111111111112 = bArr[792];
                                                byte b11111111111111111111111111111111111111111111111111111111113 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111111111111112, b11111111111111111111111111111111111111111111111111111111113, (short) (b11111111111111111111111111111111111111111111111111111111113 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111111111111111111111111111114 = bArr[792];
                                                byte b2111111111111111 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111111111111114, b2111111111111111, (short) (b2111111111111111 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111111111115 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111111111111116 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111111115, b11111111111111111111111111111111111111111111111111111111116, (short) (b11111111111111111111111111111111111111111111111111111111116 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111111111117 = bArr[792];
                                            byte b2111111111111112 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111111117, b2111111111111112, (short) (b2111111111111112 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111111111111111111111111111111111111111111111111111118 = bArr[792];
                                        byte b11111111111111111111111111111111111111111111111111111111119 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b11111111111111111111111111111111111111111111111111111111118, b11111111111111111111111111111111111111111111111111111111119, (short) (b11111111111111111111111111111111111111111111111111111111119 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b111111111111111111111111111111111111111111111111111111111110 = bArr[792];
                                            byte b111111111111111111111111111111111111111111111111111111111111 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111111111111111111111111111111111111111111111111111110, b111111111111111111111111111111111111111111111111111111111111, (short) (b111111111111111111111111111111111111111111111111111111111111 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111111111111111111111111111111111111111111111112 = bArr[792];
                                            byte b2111111111111113 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111111111111111111111111111111111111111111111112, b2111111111111113, (short) (b2111111111111113 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111111111111111111111111111111111111111111113 = bArr[792];
                                        byte b111111111111111111111111111111111111111111111111111111111114 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b111111111111111111111111111111111111111111111111111111111113, b111111111111111111111111111111111111111111111111111111111114, (short) (b111111111111111111111111111111111111111111111111111111111114 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111111111111111111111111111111111111111111111111111115 = bArr[792];
                                        byte b2111111111111114 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111111111111111111111111111111111111111111111111111115, b2111111111111114, (short) (b2111111111111114 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    if (i6 >= 50) {
                                        bArr = ParcelableVolumeInfo;
                                        byte b1211111111118 = bArr[792];
                                        byte b1211111111119 = bArr[33];
                                        objArr = new Object[1];
                                        a(b1211111111118, b1211111111119, (short) (b1211111111119 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b12111111111110 = bArr[792];
                                            byte b12111111111111 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b12111111111110, b12111111111111, (short) (b12111111111111 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i6 < 69) {
                                                break;
                                            }
                                            if (i6 >= 75) {
                                                byte b111111111111111111111111111111111111111111111111111111111116 = bArr[792];
                                                byte b111111111111111111111111111111111111111111111111111111111117 = bArr[33];
                                                objArr3 = new Object[1];
                                                a(b111111111111111111111111111111111111111111111111111111111116, b111111111111111111111111111111111111111111111111111111111117, (short) (b111111111111111111111111111111111111111111111111111111111117 | 322), objArr3);
                                                if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                    byte b111111111111111111111111111111111111111111111111111111111118 = bArr[792];
                                                    byte b111111111111111111111111111111111111111111111111111111111119 = bArr[33];
                                                    objArr4 = new Object[1];
                                                    a(b111111111111111111111111111111111111111111111111111111111118, b111111111111111111111111111111111111111111111111111111111119, (short) (b111111111111111111111111111111111111111111111111111111111119 | 322), objArr4);
                                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                        break;
                                                    }
                                                    byte b1111111111111111111111111111111111111111111111111111111111110 = bArr[792];
                                                    byte b2111111111111115 = bArr[33];
                                                    objArr5 = new Object[1];
                                                    a(b1111111111111111111111111111111111111111111111111111111111110, b2111111111111115, (short) (b2111111111111115 | 322), objArr5);
                                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                    }
                                                    throw th;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111111111111111 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111111111111111112 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111111111111, b1111111111111111111111111111111111111111111111111111111111112, (short) (b1111111111111111111111111111111111111111111111111111111111112 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111111111111113 = bArr[792];
                                                byte b2111111111111116 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111111111113, b2111111111111116, (short) (b2111111111111116 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111111111111111111111111111111111111111111111114 = bArr[792];
                                            byte b1111111111111111111111111111111111111111111111111111111111115 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111111111111114, b1111111111111111111111111111111111111111111111111111111111115, (short) (b1111111111111111111111111111111111111111111111111111111111115 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111111111111111111111111111111111111111111111111111111111116 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111111111111111117 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111111111116, b1111111111111111111111111111111111111111111111111111111111117, (short) (b1111111111111111111111111111111111111111111111111111111111117 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111111111111118 = bArr[792];
                                                byte b2111111111111117 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111111111118, b2111111111111117, (short) (b2111111111111117 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111111111111111111111111111111111111111111111119 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111111111111111110 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111111111111119, b11111111111111111111111111111111111111111111111111111111111110, (short) (b11111111111111111111111111111111111111111111111111111111111110 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111111111111111 = bArr[792];
                                            byte b2111111111111118 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111111111111, b2111111111111118, (short) (b2111111111111118 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b12111111111112 = bArr[792];
                                        byte b12111111111113 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b12111111111112, b12111111111113, (short) (b12111111111113 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b11111111111111111111111111111111111111111111111111111111111112 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111111111111111113 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111111111112, b11111111111111111111111111111111111111111111111111111111111113, (short) (b11111111111111111111111111111111111111111111111111111111111113 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b11111111111111111111111111111111111111111111111111111111111114 = bArr[792];
                                                byte b11111111111111111111111111111111111111111111111111111111111115 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111111111111111114, b11111111111111111111111111111111111111111111111111111111111115, (short) (b11111111111111111111111111111111111111111111111111111111111115 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b11111111111111111111111111111111111111111111111111111111111116 = bArr[792];
                                                byte b2111111111111119 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b11111111111111111111111111111111111111111111111111111111111116, b2111111111111119, (short) (b2111111111111119 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111111111111117 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111111111111111118 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111111111117, b11111111111111111111111111111111111111111111111111111111111118, (short) (b11111111111111111111111111111111111111111111111111111111111118 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111111111111119 = bArr[792];
                                            byte b21111111111111110 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111111111119, b21111111111111110, (short) (b21111111111111110 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111111111111111111111111111111111111111111111110 = bArr[792];
                                        byte b111111111111111111111111111111111111111111111111111111111111111 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b111111111111111111111111111111111111111111111111111111111111110, b111111111111111111111111111111111111111111111111111111111111111, (short) (b111111111111111111111111111111111111111111111111111111111111111 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b111111111111111111111111111111111111111111111111111111111111112 = bArr[792];
                                            byte b111111111111111111111111111111111111111111111111111111111111113 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b111111111111111111111111111111111111111111111111111111111111112, b111111111111111111111111111111111111111111111111111111111111113, (short) (b111111111111111111111111111111111111111111111111111111111111113 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b111111111111111111111111111111111111111111111111111111111111114 = bArr[792];
                                            byte b21111111111111111 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b111111111111111111111111111111111111111111111111111111111111114, b21111111111111111, (short) (b21111111111111111 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b111111111111111111111111111111111111111111111111111111111111115 = bArr[792];
                                        byte b111111111111111111111111111111111111111111111111111111111111116 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b111111111111111111111111111111111111111111111111111111111111115, b111111111111111111111111111111111111111111111111111111111111116, (short) (b111111111111111111111111111111111111111111111111111111111111116 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111111111111111111111111111111111111111111111111111111117 = bArr[792];
                                        byte b21111111111111112 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111111111111111111111111111111111111111111111111111111117, b21111111111111112, (short) (b21111111111111112 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    bArr = ParcelableVolumeInfo;
                                    byte b12111111111114 = bArr[792];
                                    byte b12111111111115 = bArr[33];
                                    objArr = new Object[1];
                                    a(b12111111111114, b12111111111115, (short) (b12111111111115 | 322), objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        byte b12111111111116 = bArr[792];
                                        byte b12111111111117 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b12111111111116, b12111111111117, (short) (b12111111111117 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i6 < 69) {
                                            break;
                                        }
                                        if (i6 >= 75) {
                                            byte b111111111111111111111111111111111111111111111111111111111111118 = bArr[792];
                                            byte b111111111111111111111111111111111111111111111111111111111111119 = bArr[33];
                                            objArr3 = new Object[1];
                                            a(b111111111111111111111111111111111111111111111111111111111111118, b111111111111111111111111111111111111111111111111111111111111119, (short) (b111111111111111111111111111111111111111111111111111111111111119 | 322), objArr3);
                                            if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                                byte b1111111111111111111111111111111111111111111111111111111111111110 = bArr[792];
                                                byte b1111111111111111111111111111111111111111111111111111111111111111 = bArr[33];
                                                objArr4 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111111111111110, b1111111111111111111111111111111111111111111111111111111111111111, (short) (b1111111111111111111111111111111111111111111111111111111111111111 | 322), objArr4);
                                                if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                    break;
                                                }
                                                byte b1111111111111111111111111111111111111111111111111111111111111112 = bArr[792];
                                                byte b21111111111111113 = bArr[33];
                                                objArr5 = new Object[1];
                                                a(b1111111111111111111111111111111111111111111111111111111111111112, b21111111111111113, (short) (b21111111111111113 | 322), objArr5);
                                                if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                                }
                                                throw th;
                                            }
                                            byte b1111111111111111111111111111111111111111111111111111111111111113 = bArr[792];
                                            byte b1111111111111111111111111111111111111111111111111111111111111114 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111111111111111113, b1111111111111111111111111111111111111111111111111111111111111114, (short) (b1111111111111111111111111111111111111111111111111111111111111114 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b1111111111111111111111111111111111111111111111111111111111111115 = bArr[792];
                                            byte b21111111111111114 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111111111111111115, b21111111111111114, (short) (b21111111111111114 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b1111111111111111111111111111111111111111111111111111111111111116 = bArr[792];
                                        byte b1111111111111111111111111111111111111111111111111111111111111117 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b1111111111111111111111111111111111111111111111111111111111111116, b1111111111111111111111111111111111111111111111111111111111111117, (short) (b1111111111111111111111111111111111111111111111111111111111111117 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b1111111111111111111111111111111111111111111111111111111111111118 = bArr[792];
                                            byte b1111111111111111111111111111111111111111111111111111111111111119 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b1111111111111111111111111111111111111111111111111111111111111118, b1111111111111111111111111111111111111111111111111111111111111119, (short) (b1111111111111111111111111111111111111111111111111111111111111119 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111111111111111110 = bArr[792];
                                            byte b21111111111111115 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111111111111110, b21111111111111115, (short) (b21111111111111115 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111111111111111111111111111111111111111111111111111111111111 = bArr[792];
                                        byte b11111111111111111111111111111111111111111111111111111111111111112 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b11111111111111111111111111111111111111111111111111111111111111111, b11111111111111111111111111111111111111111111111111111111111111112, (short) (b11111111111111111111111111111111111111111111111111111111111111112 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b11111111111111111111111111111111111111111111111111111111111111113 = bArr[792];
                                        byte b21111111111111116 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b11111111111111111111111111111111111111111111111111111111111111113, b21111111111111116, (short) (b21111111111111116 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b12111111111118 = bArr[792];
                                    byte b12111111111119 = bArr[33];
                                    objArr2 = new Object[1];
                                    a(b12111111111118, b12111111111119, (short) (b12111111111119 | 322), objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i6 < 69) {
                                        break;
                                    }
                                    if (i6 >= 75) {
                                        byte b11111111111111111111111111111111111111111111111111111111111111114 = bArr[792];
                                        byte b11111111111111111111111111111111111111111111111111111111111111115 = bArr[33];
                                        objArr3 = new Object[1];
                                        a(b11111111111111111111111111111111111111111111111111111111111111114, b11111111111111111111111111111111111111111111111111111111111111115, (short) (b11111111111111111111111111111111111111111111111111111111111111115 | 322), objArr3);
                                        if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                            byte b11111111111111111111111111111111111111111111111111111111111111116 = bArr[792];
                                            byte b11111111111111111111111111111111111111111111111111111111111111117 = bArr[33];
                                            objArr4 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111111111111116, b11111111111111111111111111111111111111111111111111111111111111117, (short) (b11111111111111111111111111111111111111111111111111111111111111117 | 322), objArr4);
                                            if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                                break;
                                            }
                                            byte b11111111111111111111111111111111111111111111111111111111111111118 = bArr[792];
                                            byte b21111111111111117 = bArr[33];
                                            objArr5 = new Object[1];
                                            a(b11111111111111111111111111111111111111111111111111111111111111118, b21111111111111117, (short) (b21111111111111117 | 322), objArr5);
                                            if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        byte b11111111111111111111111111111111111111111111111111111111111111119 = bArr[792];
                                        byte b111111111111111111111111111111111111111111111111111111111111111110 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b11111111111111111111111111111111111111111111111111111111111111119, b111111111111111111111111111111111111111111111111111111111111111110, (short) (b111111111111111111111111111111111111111111111111111111111111111110 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111111111111111111111111111111111111111111111111111111111111 = bArr[792];
                                        byte b21111111111111118 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111111111111111111111111111111111111111111111111111111111111, b21111111111111118, (short) (b21111111111111118 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b111111111111111111111111111111111111111111111111111111111111111112 = bArr[792];
                                    byte b111111111111111111111111111111111111111111111111111111111111111113 = bArr[33];
                                    objArr3 = new Object[1];
                                    a(b111111111111111111111111111111111111111111111111111111111111111112, b111111111111111111111111111111111111111111111111111111111111111113, (short) (b111111111111111111111111111111111111111111111111111111111111111113 | 322), objArr3);
                                    if (Class.forName((String) objArr3[0]).isInstance(th)) {
                                        byte b111111111111111111111111111111111111111111111111111111111111111114 = bArr[792];
                                        byte b111111111111111111111111111111111111111111111111111111111111111115 = bArr[33];
                                        objArr4 = new Object[1];
                                        a(b111111111111111111111111111111111111111111111111111111111111111114, b111111111111111111111111111111111111111111111111111111111111111115, (short) (b111111111111111111111111111111111111111111111111111111111111111115 | 322), objArr4);
                                        if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                            break;
                                        }
                                        byte b111111111111111111111111111111111111111111111111111111111111111116 = bArr[792];
                                        byte b21111111111111119 = bArr[33];
                                        objArr5 = new Object[1];
                                        a(b111111111111111111111111111111111111111111111111111111111111111116, b21111111111111119, (short) (b21111111111111119 | 322), objArr5);
                                        if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    byte b111111111111111111111111111111111111111111111111111111111111111117 = bArr[792];
                                    byte b111111111111111111111111111111111111111111111111111111111111111118 = bArr[33];
                                    objArr4 = new Object[1];
                                    a(b111111111111111111111111111111111111111111111111111111111111111117, b111111111111111111111111111111111111111111111111111111111111111118, (short) (b111111111111111111111111111111111111111111111111111111111111111118 | 322), objArr4);
                                    if (Class.forName((String) objArr4[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b111111111111111111111111111111111111111111111111111111111111111119 = bArr[792];
                                    byte b211111111111111110 = bArr[33];
                                    objArr5 = new Object[1];
                                    a(b111111111111111111111111111111111111111111111111111111111111111119, b211111111111111110, (short) (b211111111111111110 | 322), objArr5);
                                    if (Class.forName((String) objArr5[0]).isInstance(th)) {
                                    }
                                    throw th;
                                    cleartextsubstitutiondefault.serializer = th;
                                    cleartextsubstitutiondefault.read(24);
                                }
                                break;
                            case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(3);
                                Object obj2 = cleartextsubstitutiondefault.write;
                                try {
                                    byte[] bArr5 = ParcelableVolumeInfo;
                                    Object[] objArr36 = new Object[1];
                                    a(bArr5[792], bArr5[295], (short) 1233, objArr36);
                                    Class<?> cls11 = Class.forName((String) objArr36[0]);
                                    byte b30 = bArr5[286];
                                    byte b31 = bArr5[8];
                                    Object[] objArr37 = new Object[1];
                                    a(b30, b31, (short) (b31 | 1262), objArr37);
                                    cls11.getMethod((String) objArr37[0], null).invoke(obj2, null);
                                    i6 = i7;
                                } catch (Throwable th10) {
                                    Throwable cause2 = th10.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th10;
                                }
                                break;
                            case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(3);
                                cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).write;
                                i2 = 4;
                                cleartextsubstitutiondefault.read(i2);
                                i6 = i7;
                                break;
                            case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                i6 = 30;
                                break;
                            case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                i6 = 54;
                                break;
                            case BaseCode.URI_IS_NULL /* -5 */:
                                cleartextsubstitutiondefault.read(92);
                                if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                    i7 = 13;
                                }
                                i6 = i7;
                                break;
                            case BaseCode.NO_SOLUTION /* -4 */:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(3);
                                cleartextsubstitutiondefault.serializer = (getTraversalIndexdelegate) cleartextsubstitutiondefault.write;
                                i2 = 4;
                                cleartextsubstitutiondefault.read(i2);
                                i6 = i7;
                                break;
                            case -3:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(3);
                                cleartextsubstitutiondefault.serializer = ((MutableStateFlow) cleartextsubstitutiondefault.write).read();
                                i2 = 4;
                                cleartextsubstitutiondefault.read(i2);
                                i6 = i7;
                                break;
                            case -2:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(3);
                                cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).read;
                                i2 = 4;
                                cleartextsubstitutiondefault.read(i2);
                                i6 = i7;
                                break;
                            case -1:
                                i6 = 32;
                                break;
                            default:
                                i6 = i7;
                                break;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                } catch (Throwable th12) {
                    th = th12;
                }
            }
        } catch (Throwable th13) {
            Throwable cause3 = th13.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th13;
        }
    }

    public final Object read(ShortNewsContentCardView<? super getTraversalIndexdelegate> shortNewsContentCardView) {
        int i = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i2 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        return RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), i, 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this, shortNewsContentCardView}, i2, -1809255448);
    }

    public final Object clear(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) throws Throwable {
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(this, shortNewsContentCardView);
        try {
            char c = 0;
            byte[] bArr = ParcelableVolumeInfo;
            byte b = bArr[108];
            int i = PlaybackStateCompat;
            short s = (short) 1089;
            Object[] objArr = new Object[1];
            a(b, (byte) i, s, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[551];
            Object[] objArr2 = new Object[1];
            a(b2, b2, (short) 1121, objArr2);
            int iIntValue = 255 - ((Integer) cls.getMethod((String) objArr2[0], Long.TYPE).invoke(null, 0L)).intValue();
            short s2 = (short) 167;
            Object[] objArr3 = new Object[1];
            a(bArr[108], bArr[78], s2, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[271], bArr[8], (short) 356, objArr4);
            int iIntValue2 = 2082 - ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr5 = {0};
            Object[] objArr6 = new Object[1];
            a(bArr[108], bArr[551], (short) 363, objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            byte b3 = bArr[239];
            byte b4 = bArr[738];
            Object[] objArr7 = new Object[1];
            a(b3, b4, (short) (b4 | 640), objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, iIntValue2, (char) ((Integer) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).intValue(), objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(bArr[108], (byte) i, s, objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr[551], bArr[78], (short) 1141, objArr10);
            int i2 = -((Integer) cls4.getMethod((String) objArr10[0], Long.TYPE).invoke(null, 0L)).intValue();
            Object[] objArr11 = new Object[1];
            a(bArr[108], bArr[78], s2, objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            byte b5 = bArr[551];
            byte b6 = bArr[0];
            Object[] objArr12 = new Object[1];
            a(b5, b6, (short) (b6 | 357), objArr12);
            int iIntValue3 = 122 - ((Integer) cls5.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr13 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            byte b7 = bArr[551];
            byte b8 = bArr[33];
            Object[] objArr14 = new Object[1];
            a(b7, b8, (short) (b8 | 585), objArr14);
            Object[] objArr15 = new Object[1];
            b(i2, iIntValue3, (char) (((Integer) cls6.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 16), objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            char c2 = 792;
            byte b9 = bArr[792];
            byte b10 = bArr[271];
            Object[] objArr17 = new Object[1];
            a(b9, b10, (short) (b10 | 178), objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            byte b11 = (byte) i;
            byte b12 = bArr[0];
            Object[] objArr18 = new Object[1];
            a(b11, b12, (short) (b12 | 204), objArr18);
            String str2 = (String) objArr18[0];
            byte b13 = bArr[792];
            byte b14 = bArr[271];
            Object[] objArr19 = new Object[1];
            a(b13, b14, (short) (b14 | 178), objArr19);
            Object[] objArr20 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr19[0])).invoke(str, objArr16);
            int[] iArr = new int[objArr20.length];
            int i3 = 0;
            while (i3 < objArr20.length) {
                Object[] objArr21 = {objArr20[i3]};
                byte[] bArr2 = ParcelableVolumeInfo;
                short s3 = (short) 210;
                Object[] objArr22 = new Object[1];
                a(bArr2[c2], bArr2[170], s3, objArr22);
                Class<?> cls8 = Class.forName((String) objArr22[c]);
                Object[] objArr23 = new Object[1];
                a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr23);
                String str3 = (String) objArr23[c];
                byte b15 = bArr2[c2];
                byte b16 = bArr2[271];
                Object[] objArr24 = new Object[1];
                a(b15, b16, (short) (b16 | 178), objArr24);
                Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                Object[] objArr25 = new Object[1];
                a(bArr2[792], bArr2[170], s3, objArr25);
                Class<?> cls9 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                a(bArr2[125], bArr2[5], (short) 232, objArr26);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c2 = 792;
                c = 0;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                    switch (cleartextsubstitutiondefault.read(iArr[i4])) {
                        case -29:
                            i4 = 67;
                            break;
                        case -28:
                            cleartextsubstitutiondefault.read(21);
                            int i6 = cleartextsubstitutiondefault.IconCompatParcelizer;
                            i5 = (i6 == 0 || i6 != 1) ? 36 : 59;
                            i4 = i5;
                            break;
                        case -27:
                            i4 = 62;
                            break;
                        case -26:
                            try {
                                cleartextsubstitutiondefault.read(21);
                                int i7 = cleartextsubstitutiondefault.IconCompatParcelizer;
                                if (i7 == 42 || i7 != 56) {
                                    i4 = 38;
                                } else {
                                    i5 = 28;
                                    i4 = i5;
                                }
                            } catch (Throwable th) {
                                th = th;
                                byte[] bArr3 = ParcelableVolumeInfo;
                                byte b17 = bArr3[792];
                                byte b18 = bArr3[33];
                                Object[] objArr27 = new Object[1];
                                a(b17, b18, (short) (b18 | 322), objArr27);
                                if (!Class.forName((String) objArr27[0]).isInstance(th) || i4 < 38 || i4 >= 49) {
                                    byte b19 = bArr3[792];
                                    byte b20 = bArr3[33];
                                    Object[] objArr28 = new Object[1];
                                    a(b19, b20, (short) (b20 | 322), objArr28);
                                    if (Class.forName((String) objArr28[0]).isInstance(th) && i4 >= 43 && i4 < 44) {
                                        i4 = 73;
                                    } else {
                                        if (i4 < 60 || i4 >= 62) {
                                            throw th;
                                        }
                                        i4 = 58;
                                    }
                                } else {
                                    i4 = 72;
                                }
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                            }
                            break;
                        case -25:
                            cleartextsubstitutiondefault.read(8);
                            throw ((Throwable) cleartextsubstitutiondefault.write);
                        case -24:
                            i4 = 68;
                            break;
                        case -23:
                            i4 = 70;
                            break;
                        case -22:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i5 = 57;
                            }
                            i4 = i5;
                            break;
                        case -21:
                            i4 = 26;
                            break;
                        case -20:
                            i4 = 49;
                            break;
                        case -19:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i5 = 48;
                            }
                            i4 = i5;
                            break;
                        case -18:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                            i4 = i5;
                            break;
                        case -17:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                            cleartextsubstitutiondefault.read(10);
                            i4 = i5;
                            break;
                        case -16:
                            i4 = 1;
                            break;
                        case -15:
                            i4 = 50;
                            break;
                        case Float16.MinExponent /* -14 */:
                            cleartextsubstitutiondefault.serializer = createFromParcel.INSTANCE;
                            cleartextsubstitutiondefault.read(4);
                            i4 = i5;
                            break;
                        case -13:
                            cleartextsubstitutiondefault.read(8);
                            return cleartextsubstitutiondefault.write;
                        case -12:
                            i4 = 63;
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            i4 = 65;
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            cleartextsubstitutiondefault.read(116);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i5 = 25;
                            }
                            i4 = i5;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            cleartextsubstitutiondefault.serializer = CoroutineSingletons.COROUTINE_SUSPENDED;
                            cleartextsubstitutiondefault.read(4);
                            i4 = i5;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 3;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = BuildersKt.withContext(textAnnouncementContentCardView, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) cleartextsubstitutiondefault.write);
                            cleartextsubstitutiondefault.read(4);
                            i4 = i5;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 3;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            Object obj = cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(3);
                            ShortNewsContentCardView shortNewsContentCardView2 = (ShortNewsContentCardView) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(13);
                            cleartextsubstitutiondefault.serializer = new DiskLruCache$launchCleanup$1(obj, shortNewsContentCardView2, cleartextsubstitutiondefault.IconCompatParcelizer);
                            cleartextsubstitutiondefault.read(4);
                            i4 = i5;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            cleartextsubstitutiondefault.serializer = DefaultIoScheduler.RemoteActionCompatParcelizer;
                            cleartextsubstitutiondefault.read(4);
                            i4 = i5;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            cleartextsubstitutiondefault.serializer = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                            cleartextsubstitutiondefault.read(4);
                            i4 = i5;
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = cleartextsubstitutiondefault.write.getClass();
                            cleartextsubstitutiondefault.read(4);
                            i4 = i5;
                            break;
                        case -3:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = (inCompatibilityMode) cleartextsubstitutiondefault.write;
                            cleartextsubstitutiondefault.read(4);
                            i4 = i5;
                            break;
                        case -2:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).IconCompatParcelizer;
                            cleartextsubstitutiondefault.read(4);
                            i4 = i5;
                            break;
                        case -1:
                            i4 = 32;
                            break;
                        default:
                            i4 = i5;
                            break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    private final getTraversalIndexdelegate MediaDescriptionCompat() {
        int i = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i2 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        return (getTraversalIndexdelegate) RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), i, -1621247262, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this}, i2, 1621247263);
    }

    private static final createFromParcel IconCompatParcelizer(onTouch ontouch) throws Throwable {
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(ontouch);
        try {
            byte[] bArr = ParcelableVolumeInfo;
            Object[] objArr = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b = bArr[551];
            Object[] objArr2 = new Object[1];
            a(b, b, (short) 852, objArr2);
            int iIntValue = 124 - (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 16);
            try {
                Object[] objArr3 = new Object[1];
                a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(bArr[551], bArr[170], (short) 872, objArr4);
                int iIntValue2 = (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16) + 953;
                try {
                    Object[] objArr5 = new Object[1];
                    a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr5);
                    Class<?> cls3 = Class.forName((String) objArr5[0]);
                    byte b2 = bArr[551];
                    byte b3 = bArr[33];
                    Object[] objArr6 = new Object[1];
                    a(b2, b3, (short) (b3 | 585), objArr6);
                    Object[] objArr7 = new Object[1];
                    b(iIntValue, iIntValue2, (char) (((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 16), objArr7);
                    String str = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr8);
                    Class<?> cls4 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    a(bArr[551], bArr[738], (short) 888, objArr9);
                    int iIntValue3 = (((Integer) cls4.getMethod((String) objArr9[0], null).invoke(null, null)).intValue() >> 8) + 1;
                    Object[] objArr10 = new Object[1];
                    a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr10);
                    Class<?> cls5 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    a(bArr[551], bArr[271], (short) 672, objArr11);
                    int iIntValue4 = (((Integer) cls5.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 8) + 122;
                    Object[] objArr12 = {"", '0', 0};
                    Object[] objArr13 = new Object[1];
                    a(bArr[108], bArr[78], bArr[14], objArr13);
                    Class<?> cls6 = Class.forName((String) objArr13[0]);
                    byte b4 = bArr[125];
                    Object[] objArr14 = new Object[1];
                    a(b4, bArr[31], b4, objArr14);
                    String str2 = (String) objArr14[0];
                    Object[] objArr15 = new Object[1];
                    a(bArr[792], bArr[78], bArr[20], objArr15);
                    Object[] objArr16 = new Object[1];
                    b(iIntValue3, iIntValue4, (char) ((-1) - ((Integer) cls6.getMethod(str2, Class.forName((String) objArr15[0]), Character.TYPE, Integer.TYPE).invoke(null, objArr12)).intValue()), objArr16);
                    Object[] objArr17 = {(String) objArr16[0]};
                    byte b5 = bArr[792];
                    byte b6 = bArr[271];
                    Object[] objArr18 = new Object[1];
                    a(b5, b6, (short) (b6 | 178), objArr18);
                    Class<?> cls7 = Class.forName((String) objArr18[0]);
                    byte b7 = (byte) PlaybackStateCompat;
                    byte b8 = bArr[0];
                    Object[] objArr19 = new Object[1];
                    a(b7, b8, (short) (b8 | 204), objArr19);
                    String str3 = (String) objArr19[0];
                    byte b9 = bArr[792];
                    byte b10 = bArr[271];
                    Object[] objArr20 = new Object[1];
                    a(b9, b10, (short) (b10 | 178), objArr20);
                    Object[] objArr21 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr20[0])).invoke(str, objArr17);
                    int[] iArr = new int[objArr21.length];
                    for (int i = 0; i < objArr21.length; i++) {
                        Object[] objArr22 = {objArr21[i]};
                        byte[] bArr2 = ParcelableVolumeInfo;
                        short s = (short) 210;
                        Object[] objArr23 = new Object[1];
                        a(bArr2[792], bArr2[170], s, objArr23);
                        Class<?> cls8 = Class.forName((String) objArr23[0]);
                        Object[] objArr24 = new Object[1];
                        a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr24);
                        String str4 = (String) objArr24[0];
                        byte b11 = bArr2[792];
                        byte b12 = bArr2[271];
                        Object[] objArr25 = new Object[1];
                        a(b11, b12, (short) (b12 | 178), objArr25);
                        Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                        Object[] objArr26 = new Object[1];
                        a(bArr2[792], bArr2[170], s, objArr26);
                        Class<?> cls9 = Class.forName((String) objArr26[0]);
                        Object[] objArr27 = new Object[1];
                        a(bArr2[125], bArr2[5], (short) 232, objArr27);
                        iArr[i] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
                    }
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        try {
                            switch (cleartextsubstitutiondefault.read(iArr[i2])) {
                                case -17:
                                    cleartextsubstitutiondefault.read(8);
                                    throw ((Throwable) cleartextsubstitutiondefault.write);
                                case -16:
                                    i2 = 1;
                                    break;
                                case -15:
                                    i2 = 37;
                                    break;
                                case Float16.MinExponent /* -14 */:
                                    try {
                                        cleartextsubstitutiondefault.read(31);
                                        if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                            i3 = 36;
                                        }
                                        i2 = i3;
                                    } catch (Throwable th) {
                                        th = th;
                                        byte[] bArr3 = ParcelableVolumeInfo;
                                        byte b13 = bArr3[792];
                                        byte b14 = bArr3[33];
                                        Object[] objArr28 = new Object[1];
                                        a(b13, b14, (short) (b14 | 322), objArr28);
                                        if (!Class.forName((String) objArr28[0]).isInstance(th) || i2 < 2 || i2 >= 3) {
                                            byte b15 = bArr3[792];
                                            byte b16 = bArr3[33];
                                            Object[] objArr29 = new Object[1];
                                            a(b15, b16, (short) (b16 | 322), objArr29);
                                            if (!Class.forName((String) objArr29[0]).isInstance(th) || i2 < 6 || i2 >= 12) {
                                                byte b17 = bArr3[792];
                                                byte b18 = bArr3[33];
                                                Object[] objArr30 = new Object[1];
                                                a(b17, b18, (short) (b18 | 322), objArr30);
                                                if (!Class.forName((String) objArr30[0]).isInstance(th) || i2 < 8 || i2 >= 12) {
                                                    byte b19 = bArr3[792];
                                                    byte b20 = bArr3[33];
                                                    Object[] objArr31 = new Object[1];
                                                    a(b19, b20, (short) (b20 | 322), objArr31);
                                                    if (!Class.forName((String) objArr31[0]).isInstance(th) || i2 < 9 || i2 >= 10) {
                                                        throw th;
                                                    }
                                                    i2 = 39;
                                                } else {
                                                    i2 = 38;
                                                }
                                            } else {
                                                i2 = 38;
                                            }
                                            cleartextsubstitutiondefault.serializer = th;
                                            cleartextsubstitutiondefault.read(24);
                                        } else {
                                            i2 = 39;
                                        }
                                        cleartextsubstitutiondefault.serializer = th;
                                        cleartextsubstitutiondefault.read(24);
                                    }
                                    break;
                                case -13:
                                    i2 = 15;
                                    break;
                                case -12:
                                    i2 = 26;
                                    break;
                                case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                    cleartextsubstitutiondefault.read(31);
                                    if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                        i3 = 25;
                                    }
                                    i2 = i3;
                                    break;
                                case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                    cleartextsubstitutiondefault.read(2);
                                    cleartextsubstitutiondefault.read(13);
                                    RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                                    i2 = i3;
                                    break;
                                case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                                    cleartextsubstitutiondefault.read(10);
                                    i2 = i3;
                                    break;
                                case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                    cleartextsubstitutiondefault.read(8);
                                    return (createFromParcel) cleartextsubstitutiondefault.write;
                                case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                    i2 = 27;
                                    break;
                                case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                    i2 = 17;
                                    break;
                                case BaseCode.URI_IS_NULL /* -5 */:
                                    cleartextsubstitutiondefault.serializer = createFromParcel.INSTANCE;
                                    cleartextsubstitutiondefault.read(4);
                                    i2 = i3;
                                    break;
                                case BaseCode.NO_SOLUTION /* -4 */:
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 2;
                                    cleartextsubstitutiondefault.read(2);
                                    cleartextsubstitutiondefault.read(3);
                                    onTouch ontouch2 = (onTouch) cleartextsubstitutiondefault.write;
                                    cleartextsubstitutiondefault.read(13);
                                    ontouch2.MediaSessionCompatQueueItem = cleartextsubstitutiondefault.IconCompatParcelizer != 0;
                                    i2 = i3;
                                    break;
                                case -3:
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 2;
                                    cleartextsubstitutiondefault.read(2);
                                    cleartextsubstitutiondefault.read(3);
                                    onTouch ontouch3 = (onTouch) cleartextsubstitutiondefault.write;
                                    cleartextsubstitutiondefault.read(13);
                                    ontouch3.MediaDescriptionCompat = cleartextsubstitutiondefault.IconCompatParcelizer != 0;
                                    i2 = i3;
                                    break;
                                case -2:
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                    cleartextsubstitutiondefault.read(2);
                                    cleartextsubstitutiondefault.read(3);
                                    cleartextsubstitutiondefault.serializer = cleartextsubstitutiondefault.write.getClass();
                                    cleartextsubstitutiondefault.read(4);
                                    i2 = i3;
                                    break;
                                case -1:
                                    i2 = 12;
                                    break;
                                default:
                                    i2 = i3;
                                    break;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                Throwable cause2 = th4.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th4;
            }
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x048f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x044d  */
    /* JADX WARN: Code duplicated, block: B:66:0x045b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x047b  */
    private static final resetTransientState read() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault();
        try {
            byte[] bArr = ParcelableVolumeInfo;
            Object[] objArr3 = new Object[1];
            a(bArr[108], bArr[78], bArr[14], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[286];
            byte b2 = bArr[92];
            Object[] objArr4 = new Object[1];
            a(b, b2, (short) (b2 | 467), objArr4);
            String str = (String) objArr4[0];
            Object[] objArr5 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr5);
            int iIntValue = 79 - ((Integer) cls.getMethod(str, Class.forName((String) objArr5[0]), Character.TYPE).invoke(null, "", '0')).intValue();
            Object[] objArr6 = {Float.valueOf(0.0f), Float.valueOf(0.0f)};
            byte b3 = bArr[108];
            byte b4 = bArr[125];
            Object[] objArr7 = new Object[1];
            a(b3, b4, (short) (b4 | 384), objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            short s = (short) 426;
            Object[] objArr8 = new Object[1];
            a(bArr[286], bArr[77], s, objArr8);
            int i = 873 - (((Float) cls2.getMethod((String) objArr8[0], Float.TYPE, Float.TYPE).invoke(null, objArr6)).floatValue() > 0.0f ? 1 : (((Float) cls2.getMethod((String) objArr8[0], Float.TYPE, Float.TYPE).invoke(null, objArr6)).floatValue() == 0.0f ? 0 : -1));
            Object[] objArr9 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr9);
            Class<?> cls3 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr[551], bArr[78], (short) 785, objArr10);
            Object[] objArr11 = new Object[1];
            b(iIntValue, i, (char) (1 - (((Long) cls3.getMethod((String) objArr10[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) objArr10[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr11);
            String str2 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            a(bArr[108], bArr[78], bArr[14], objArr12);
            Class<?> cls4 = Class.forName((String) objArr12[0]);
            byte b5 = bArr[125];
            Object[] objArr13 = new Object[1];
            a(b5, bArr[31], b5, objArr13);
            String str3 = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr14);
            Object[] objArr15 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr15);
            int iIntValue2 = 1 - ((Integer) cls4.getMethod(str3, Class.forName((String) objArr14[0]), Class.forName((String) objArr15[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", "", 0, 0)).intValue();
            Object[] objArr16 = new Object[1];
            a(bArr[108], bArr[460], (short) 806, objArr16);
            Class<?> cls5 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(bArr[121], bArr[48], (short) 839, objArr17);
            int iIntValue3 = ((Integer) cls5.getMethod((String) objArr17[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue() + 122;
            Object[] objArr18 = {Float.valueOf(0.0f), Float.valueOf(0.0f)};
            byte b6 = bArr[108];
            byte b7 = bArr[125];
            Object[] objArr19 = new Object[1];
            a(b6, b7, (short) (b7 | 384), objArr19);
            Class<?> cls6 = Class.forName((String) objArr19[0]);
            Object[] objArr20 = new Object[1];
            a(bArr[286], bArr[77], s, objArr20);
            Object[] objArr21 = new Object[1];
            b(iIntValue2, iIntValue3, (char) (((Float) cls6.getMethod((String) objArr20[0], Float.TYPE, Float.TYPE).invoke(null, objArr18)).floatValue() > 0.0f ? 1 : (((Float) cls6.getMethod((String) objArr20[0], Float.TYPE, Float.TYPE).invoke(null, objArr18)).floatValue() == 0.0f ? 0 : -1)), objArr21);
            Object[] objArr22 = {(String) objArr21[0]};
            byte b8 = bArr[792];
            char c = 271;
            byte b9 = bArr[271];
            Object[] objArr23 = new Object[1];
            a(b8, b9, (short) (b9 | 178), objArr23);
            Class<?> cls7 = Class.forName((String) objArr23[0]);
            byte b10 = (byte) PlaybackStateCompat;
            byte b11 = bArr[0];
            Object[] objArr24 = new Object[1];
            a(b10, b11, (short) (b11 | 204), objArr24);
            String str4 = (String) objArr24[0];
            byte b12 = bArr[792];
            byte b13 = bArr[271];
            Object[] objArr25 = new Object[1];
            a(b12, b13, (short) (b13 | 178), objArr25);
            Object[] objArr26 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr25[0])).invoke(str2, objArr22);
            int[] iArr = new int[objArr26.length];
            int i2 = 0;
            while (i2 < objArr26.length) {
                Object[] objArr27 = {objArr26[i2]};
                byte[] bArr2 = ParcelableVolumeInfo;
                short s2 = (short) 210;
                Object[] objArr28 = new Object[1];
                a(bArr2[792], bArr2[170], s2, objArr28);
                Class<?> cls8 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr29);
                String str5 = (String) objArr29[0];
                byte b14 = bArr2[792];
                byte b15 = bArr2[c];
                Object[] objArr30 = new Object[1];
                a(b14, b15, (short) (b15 | 178), objArr30);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr30[0])).invoke(null, objArr27);
                Object[] objArr31 = new Object[1];
                a(bArr2[792], bArr2[170], s2, objArr31);
                Class<?> cls9 = Class.forName((String) objArr31[0]);
                Object[] objArr32 = new Object[1];
                a(bArr2[125], bArr2[5], (short) 232, objArr32);
                iArr[i2] = ((Integer) cls9.getMethod((String) objArr32[0], null).invoke(objInvoke, null)).intValue();
                i2++;
                c = 271;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                    switch (cleartextsubstitutiondefault.read(iArr[i3])) {
                        case -12:
                            cleartextsubstitutiondefault.read(8);
                            throw ((Throwable) cleartextsubstitutiondefault.write);
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            i3 = 12;
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i3 = 24;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            try {
                                cleartextsubstitutiondefault.read(31);
                                if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                    i4 = 23;
                                }
                                i3 = i4;
                            } catch (Throwable th) {
                                th = th;
                                byte[] bArr3 = ParcelableVolumeInfo;
                                byte b16 = bArr3[792];
                                byte b17 = bArr3[33];
                                objArr = new Object[1];
                                a(b16, b17, (short) (b17 | 322), objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th) || i3 < 14 || i3 >= 15) {
                                    byte b18 = bArr3[792];
                                    byte b19 = bArr3[33];
                                    objArr2 = new Object[1];
                                    a(b18, b19, (short) (b19 | 322), objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th) || i3 < 18 || i3 >= 19) {
                                        throw th;
                                    }
                                    i3 = 25;
                                } else {
                                    i3 = 26;
                                }
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                            }
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            try {
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(13);
                                RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                                i3 = i4;
                            } catch (Throwable th2) {
                                th = th2;
                                byte[] bArr4 = ParcelableVolumeInfo;
                                byte b110 = bArr4[792];
                                byte b111 = bArr4[33];
                                objArr = new Object[1];
                                a(b110, b111, (short) (b111 | 322), objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    break;
                                }
                                byte b112 = bArr4[792];
                                byte b113 = bArr4[33];
                                objArr2 = new Object[1];
                                a(b112, b113, (short) (b113 | 322), objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                }
                                throw th;
                            }
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                            cleartextsubstitutiondefault.read(10);
                            i3 = i4;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            cleartextsubstitutiondefault.read(8);
                            return (resetTransientState) cleartextsubstitutiondefault.write;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            i3 = 1;
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            i3 = 14;
                            break;
                        case -3:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            try {
                                cleartextsubstitutiondefault.read(3);
                                cleartextsubstitutiondefault.serializer = DelayKt.serializer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) cleartextsubstitutiondefault.write);
                                try {
                                    cleartextsubstitutiondefault.read(4);
                                    i3 = i4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    byte[] bArr5 = ParcelableVolumeInfo;
                                    byte b114 = bArr5[792];
                                    byte b115 = bArr5[33];
                                    objArr = new Object[1];
                                    a(b114, b115, (short) (b115 | 322), objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        break;
                                    }
                                    byte b116 = bArr5[792];
                                    byte b117 = bArr5[33];
                                    objArr2 = new Object[1];
                                    a(b116, b117, (short) (b117 | 322), objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                byte[] bArr6 = ParcelableVolumeInfo;
                                byte b118 = bArr6[792];
                                byte b119 = bArr6[33];
                                objArr = new Object[1];
                                a(b118, b119, (short) (b119 | 322), objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    break;
                                }
                                byte b1110 = bArr6[792];
                                byte b1111 = bArr6[33];
                                objArr2 = new Object[1];
                                a(b1110, b1111, (short) (b1111 | 322), objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                }
                                throw th;
                            }
                            break;
                        case -2:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            cleartextsubstitutiondefault.serializer = new accessgetIntersectcp(cleartextsubstitutiondefault.IconCompatParcelizer);
                            cleartextsubstitutiondefault.read(4);
                            i3 = i4;
                            break;
                        case -1:
                            i3 = 9;
                            break;
                        default:
                            i3 = i4;
                            break;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            Throwable cause = th6.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x03d9  */
    private final resetTransientState write() throws Throwable {
        int i;
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(this);
        try {
            char c = 0;
            Object[] objArr = {0};
            byte[] bArr = ParcelableVolumeInfo;
            short s = (short) 363;
            Object[] objArr2 = new Object[1];
            a(bArr[108], bArr[551], s, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b = bArr[239];
            byte b2 = bArr[738];
            Object[] objArr3 = new Object[1];
            a(b, b2, (short) (b2 | 640), objArr3);
            int iIntValue = ((Integer) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, objArr)).intValue() + 156;
            try {
                Object[] objArr4 = new Object[1];
                a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a(bArr[551], bArr[271], (short) 672, objArr5);
                int iIntValue2 = 717 - (((Integer) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).intValue() >> 8);
                try {
                    Object[] objArr6 = new Object[1];
                    a(bArr[108], bArr[551], s, objArr6);
                    Class<?> cls3 = Class.forName((String) objArr6[0]);
                    Object[] objArr7 = new Object[1];
                    a(bArr[551], bArr[12], (short) 508, objArr7);
                    Object[] objArr8 = new Object[1];
                    b(iIntValue, iIntValue2, (char) (((Integer) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).intValue() >> 16), objArr8);
                    String str = (String) objArr8[0];
                    try {
                        byte b3 = bArr[108];
                        byte b4 = bArr[29];
                        Object[] objArr9 = new Object[1];
                        a(b3, b4, (short) (b4 | 651), objArr9);
                        Class<?> cls4 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        a(bArr[170], bArr[895], (short) 725, objArr10);
                        int i2 = 1 - (((Double) cls4.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, 0)).doubleValue() > 0.0d ? 1 : (((Double) cls4.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, 0)).doubleValue() == 0.0d ? 0 : -1));
                        Object[] objArr11 = new Object[1];
                        a(bArr[108], bArr[792], (short) 751, objArr11);
                        Class<?> cls5 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        a(bArr[551], bArr[465], (short) 774, objArr12);
                        int i3 = 122 - (((Float) cls5.getMethod((String) objArr12[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls5.getMethod((String) objArr12[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1));
                        Object[] objArr13 = {0, 0};
                        Object[] objArr14 = new Object[1];
                        a(bArr[108], bArr[551], s, objArr14);
                        Class<?> cls6 = Class.forName((String) objArr14[0]);
                        byte b5 = bArr[551];
                        byte b6 = bArr[92];
                        Object[] objArr15 = new Object[1];
                        a(b5, b6, (short) (b6 | 375), objArr15);
                        Object[] objArr16 = new Object[1];
                        b(i2, i3, (char) ((Integer) cls6.getMethod((String) objArr15[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr13)).intValue(), objArr16);
                        Object[] objArr17 = {(String) objArr16[0]};
                        byte b7 = bArr[792];
                        byte b8 = bArr[271];
                        Object[] objArr18 = new Object[1];
                        a(b7, b8, (short) (b8 | 178), objArr18);
                        Class<?> cls7 = Class.forName((String) objArr18[0]);
                        byte b9 = (byte) PlaybackStateCompat;
                        byte b10 = bArr[0];
                        Object[] objArr19 = new Object[1];
                        a(b9, b10, (short) (b10 | 204), objArr19);
                        String str2 = (String) objArr19[0];
                        byte b11 = bArr[792];
                        byte b12 = bArr[271];
                        Object[] objArr20 = new Object[1];
                        a(b11, b12, (short) (b12 | 178), objArr20);
                        Object[] objArr21 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr20[0])).invoke(str, objArr17);
                        int[] iArr = new int[objArr21.length];
                        int i4 = 0;
                        while (i4 < objArr21.length) {
                            try {
                                Object[] objArr22 = {objArr21[i4]};
                                byte[] bArr2 = ParcelableVolumeInfo;
                                short s2 = (short) 210;
                                Object[] objArr23 = new Object[1];
                                a(bArr2[792], bArr2[170], s2, objArr23);
                                Class<?> cls8 = Class.forName((String) objArr23[c]);
                                Object[] objArr24 = new Object[1];
                                a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr24);
                                String str3 = (String) objArr24[c];
                                byte b13 = bArr2[792];
                                byte b14 = bArr2[271];
                                Object[] objArr25 = new Object[1];
                                a(b13, b14, (short) (b14 | 178), objArr25);
                                Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                                try {
                                    Object[] objArr26 = new Object[1];
                                    a(bArr2[792], bArr2[170], s2, objArr26);
                                    Class<?> cls9 = Class.forName((String) objArr26[0]);
                                    Object[] objArr27 = new Object[1];
                                    a(bArr2[125], bArr2[5], (short) 232, objArr27);
                                    iArr[i4] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
                                    i4++;
                                    c = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        }
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            try {
                                switch (cleartextsubstitutiondefault.read(iArr[i5])) {
                                    case -20:
                                        i5 = 42;
                                        break;
                                    case -19:
                                        cleartextsubstitutiondefault.read(21);
                                        if (cleartextsubstitutiondefault.IconCompatParcelizer != 0) {
                                            i5 = 14;
                                        } else {
                                            i6 = 27;
                                            i5 = i6;
                                        }
                                        break;
                                    case -18:
                                        i5 = 1;
                                        break;
                                    case -17:
                                        i5 = 41;
                                        break;
                                    case -16:
                                        cleartextsubstitutiondefault.read(31);
                                        if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                            i6 = 40;
                                        }
                                        i5 = i6;
                                        break;
                                    case -15:
                                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                        cleartextsubstitutiondefault.read(2);
                                        cleartextsubstitutiondefault.read(13);
                                        RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                                        i5 = i6;
                                        break;
                                    case Float16.MinExponent /* -14 */:
                                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                                        cleartextsubstitutiondefault.read(10);
                                        i5 = i6;
                                        break;
                                    case -13:
                                        cleartextsubstitutiondefault.read(8);
                                        throw ((Throwable) cleartextsubstitutiondefault.write);
                                    case -12:
                                        i5 = 43;
                                        break;
                                    case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                        i5 = 45;
                                        break;
                                    case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                        cleartextsubstitutiondefault.read(14);
                                        if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                            i6 = 25;
                                        }
                                        i5 = i6;
                                        break;
                                    case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                        cleartextsubstitutiondefault.read(2);
                                        cleartextsubstitutiondefault.read(13);
                                        MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                                        i5 = i6;
                                        break;
                                    case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                                        cleartextsubstitutiondefault.read(10);
                                        i5 = i6;
                                        break;
                                    case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                        cleartextsubstitutiondefault.read(8);
                                        return (resetTransientState) cleartextsubstitutiondefault.write;
                                    case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                        i5 = 31;
                                        break;
                                    case BaseCode.URI_IS_NULL /* -5 */:
                                        i5 = 16;
                                        break;
                                    case BaseCode.NO_SOLUTION /* -4 */:
                                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                        cleartextsubstitutiondefault.read(2);
                                        cleartextsubstitutiondefault.read(3);
                                        cleartextsubstitutiondefault.serializer = (resetTransientState) cleartextsubstitutiondefault.write;
                                        cleartextsubstitutiondefault.read(4);
                                        i5 = i6;
                                        break;
                                    case -3:
                                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                        cleartextsubstitutiondefault.read(2);
                                        cleartextsubstitutiondefault.read(3);
                                        cleartextsubstitutiondefault.serializer = ((onViewDetachedFromWindowlambda1) cleartextsubstitutiondefault.write).MediaSessionCompatResultReceiverWrapper();
                                        cleartextsubstitutiondefault.read(4);
                                        i5 = i6;
                                        break;
                                    case -2:
                                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                        cleartextsubstitutiondefault.read(2);
                                        cleartextsubstitutiondefault.read(3);
                                        cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).serializer;
                                        cleartextsubstitutiondefault.read(4);
                                        i5 = i6;
                                        break;
                                    case -1:
                                        i5 = 11;
                                        break;
                                    default:
                                        i5 = i6;
                                        break;
                                }
                            } catch (Throwable th3) {
                                byte[] bArr3 = ParcelableVolumeInfo;
                                byte b15 = bArr3[792];
                                byte b16 = bArr3[33];
                                Object[] objArr28 = new Object[1];
                                a(b15, b16, (short) (b16 | 322), objArr28);
                                if (!Class.forName((String) objArr28[0]).isInstance(th3) || i5 < 2 || i5 >= 11) {
                                    byte b17 = bArr3[792];
                                    byte b18 = bArr3[33];
                                    Object[] objArr29 = new Object[1];
                                    a(b17, b18, (short) (b18 | 322), objArr29);
                                    if (!Class.forName((String) objArr29[0]).isInstance(th3) || i5 < 5 || i5 >= 6) {
                                        byte b19 = bArr3[792];
                                        byte b20 = bArr3[33];
                                        Object[] objArr30 = new Object[1];
                                        a(b19, b20, (short) (b20 | 322), objArr30);
                                        if (Class.forName((String) objArr30[0]).isInstance(th3) && i5 >= 8 && i5 < 11) {
                                            i = 48;
                                        } else if (i5 < 28 || i5 >= 31) {
                                            byte b21 = bArr3[792];
                                            byte b22 = bArr3[33];
                                            Object[] objArr31 = new Object[1];
                                            a(b21, b22, (short) (b22 | 322), objArr31);
                                            if (!Class.forName((String) objArr31[0]).isInstance(th3) || i5 < 31 || i5 >= 41) {
                                                byte b23 = bArr3[792];
                                                byte b24 = bArr3[33];
                                                Object[] objArr32 = new Object[1];
                                                a(b23, b24, (short) (b24 | 322), objArr32);
                                                if (!Class.forName((String) objArr32[0]).isInstance(th3) || i5 < 36 || i5 >= 41) {
                                                    throw th3;
                                                }
                                                i5 = 48;
                                            } else {
                                                i5 = 47;
                                            }
                                        } else {
                                            i = 26;
                                        }
                                        i5 = i;
                                    } else {
                                        i5 = 47;
                                    }
                                } else {
                                    i5 = 47;
                                }
                                cleartextsubstitutiondefault.serializer = th3;
                                cleartextsubstitutiondefault.read(24);
                            }
                        }
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    Throwable cause4 = th5.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th5;
                }
            } catch (Throwable th6) {
                Throwable cause5 = th6.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th6;
            }
        } catch (Throwable th7) {
            Throwable cause6 = th7.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x03bf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static final /* synthetic */ Lazy IconCompatParcelizer(LocalAuthDataSource localAuthDataSource) throws Throwable {
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(localAuthDataSource);
        try {
            byte[] bArr = ParcelableVolumeInfo;
            byte b = bArr[108];
            byte b2 = bArr[738];
            Object[] objArr = new Object[1];
            a(b, b2, (short) (b2 | 224), objArr);
            int i = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[551], bArr[170], (short) 585, objArr2);
            int i2 = 134 - (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1));
            Object[] objArr3 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b3 = bArr[551];
            byte b4 = bArr[33];
            Object[] objArr4 = new Object[1];
            a(b3, b4, (short) (b4 | 585), objArr4);
            int iIntValue = (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16) + 584;
            Object[] objArr5 = {0};
            Object[] objArr6 = new Object[1];
            a(bArr[108], bArr[78], (short) 167, objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            byte b5 = bArr[108];
            byte b6 = bArr[0];
            Object[] objArr7 = new Object[1];
            a(b5, b6, (short) (b6 | 617), objArr7);
            char cIntValue = (char) (44315 - ((Integer) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).intValue());
            Object[] objArr8 = new Object[1];
            b(i2, iIntValue, cIntValue, objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(bArr[108], bArr[78], bArr[100], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr[33], bArr[235], (short) 532, objArr10);
            int i3 = (((Long) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1));
            Object[] objArr11 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a(bArr[551], bArr[125], (short) 623, objArr12);
            int iIntValue2 = 122 - (((Integer) cls5.getMethod((String) objArr12[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr13 = {"", 0, 0};
            Object[] objArr14 = new Object[1];
            a(bArr[108], bArr[78], bArr[14], objArr14);
            Class<?> cls6 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            a(bArr[551], bArr[92], (short) 645, objArr15);
            String str2 = (String) objArr15[0];
            Object[] objArr16 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr16);
            Object[] objArr17 = new Object[1];
            b(i3, iIntValue2, (char) ((Integer) cls6.getMethod(str2, Class.forName((String) objArr16[0]), Integer.TYPE, Integer.TYPE).invoke(null, objArr13)).intValue(), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            byte b7 = bArr[792];
            char c = 271;
            byte b8 = bArr[271];
            Object[] objArr19 = new Object[1];
            a(b7, b8, (short) (b8 | 178), objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            byte b9 = (byte) PlaybackStateCompat;
            byte b10 = bArr[0];
            Object[] objArr20 = new Object[1];
            a(b9, b10, (short) (b10 | 204), objArr20);
            String str3 = (String) objArr20[0];
            byte b11 = bArr[792];
            byte b12 = bArr[271];
            Object[] objArr21 = new Object[1];
            a(b11, b12, (short) (b12 | 178), objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str, objArr18);
            int[] iArr = new int[objArr22.length];
            int i4 = 0;
            while (i4 < objArr22.length) {
                Object[] objArr23 = {objArr22[i4]};
                byte[] bArr2 = ParcelableVolumeInfo;
                short s = (short) 210;
                Object[] objArr24 = new Object[1];
                a(bArr2[792], bArr2[170], s, objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr25);
                String str4 = (String) objArr25[0];
                byte b13 = bArr2[792];
                byte b14 = bArr2[c];
                Object[] objArr26 = new Object[1];
                a(b13, b14, (short) (b14 | 178), objArr26);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a(bArr2[792], bArr2[170], s, objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a(bArr2[125], bArr2[5], (short) 232, objArr28);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i4++;
                c = 271;
            }
            while (true) {
                int i5 = i + 1;
                try {
                    switch (cleartextsubstitutiondefault.read(iArr[i])) {
                        case -17:
                            i = 38;
                            break;
                        case -16:
                            cleartextsubstitutiondefault.read(21);
                            i5 = cleartextsubstitutiondefault.IconCompatParcelizer != 0 ? 9 : 23;
                            i = i5;
                            break;
                        case -15:
                            i = 1;
                            break;
                        case Float16.MinExponent /* -14 */:
                            i = 37;
                            break;
                        case -13:
                            try {
                                cleartextsubstitutiondefault.read(14);
                                i = cleartextsubstitutiondefault.IconCompatParcelizer;
                                if (i == 0) {
                                    i5 = 36;
                                }
                                i = i5;
                            } catch (Throwable th) {
                                th = th;
                                if (i >= 24) {
                                }
                                throw th;
                            }
                            break;
                        case -12:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            try {
                                cleartextsubstitutiondefault.read(2);
                                try {
                                    cleartextsubstitutiondefault.read(3);
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = cleartextsubstitutiondefault.write.hashCode();
                                    cleartextsubstitutiondefault.read(10);
                                    i = i5;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (i >= 24) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (i >= 24 || i >= 28) {
                                    throw th;
                                }
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                                i = 22;
                                break;
                            }
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            cleartextsubstitutiondefault.read(8);
                            throw ((Throwable) cleartextsubstitutiondefault.write);
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i = 39;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i = 41;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            cleartextsubstitutiondefault.read(14);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i5 = 21;
                            }
                            i = i5;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                            i = i5;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                            cleartextsubstitutiondefault.read(10);
                            i = i5;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            cleartextsubstitutiondefault.read(8);
                            return (Lazy) cleartextsubstitutiondefault.write;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            i = 28;
                            break;
                        case -3:
                            i = 11;
                            break;
                        case -2:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).MediaSessionCompatQueueItem;
                            cleartextsubstitutiondefault.read(4);
                            i = i5;
                            break;
                        case -1:
                            i = 5;
                            break;
                        default:
                            i = i5;
                            break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            Throwable cause = th5.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th5;
        }
    }

    public static final /* synthetic */ ReentrantLock read(LocalAuthDataSource localAuthDataSource) throws Throwable {
        Object[] objArr;
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(localAuthDataSource);
        try {
            byte[] bArr = ParcelableVolumeInfo;
            Object[] objArr2 = new Object[1];
            a(bArr[108], bArr[78], (short) 167, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a(bArr[108], bArr[8], (short) 188, objArr3);
            int iIntValue = 114 - ((Integer) cls.getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0, 0)).intValue();
            short s = (short) 363;
            Object[] objArr4 = new Object[1];
            a(bArr[108], bArr[551], s, objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a(bArr[551], bArr[792], (short) 485, objArr5);
            int iIntValue2 = 469 - ((byte) ((Integer) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).intValue());
            Object[] objArr6 = new Object[1];
            a(bArr[108], bArr[551], s, objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[551], bArr[12], (short) 508, objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, iIntValue2, (char) ((((Integer) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).intValue() >> 16) + 48416), objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr[551], bArr[12], (short) 520, objArr10);
            int iIntValue3 = 1 - (((Integer) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr11 = new Object[1];
            a(bArr[108], bArr[78], bArr[100], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a(bArr[33], bArr[235], (short) 532, objArr12);
            int i = (((Long) cls5.getMethod((String) objArr12[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls5.getMethod((String) objArr12[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 121;
            Object[] objArr13 = {0, 0, 0};
            char c = 170;
            Object[] objArr14 = new Object[1];
            a(bArr[108], bArr[170], (short) 551, objArr14);
            Class<?> cls6 = Class.forName((String) objArr14[0]);
            byte b = bArr[121];
            byte b2 = bArr[33];
            Object[] objArr15 = new Object[1];
            a(b, b2, (short) (b2 | 551), objArr15);
            Object[] objArr16 = new Object[1];
            b(iIntValue3, i, (char) ((Integer) cls6.getMethod((String) objArr15[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13)).intValue(), objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            byte b3 = bArr[792];
            char c2 = 271;
            byte b4 = bArr[271];
            Object[] objArr18 = new Object[1];
            a(b3, b4, (short) (b4 | 178), objArr18);
            Class<?> cls7 = Class.forName((String) objArr18[0]);
            byte b5 = (byte) PlaybackStateCompat;
            byte b6 = bArr[0];
            Object[] objArr19 = new Object[1];
            a(b5, b6, (short) (b6 | 204), objArr19);
            String str2 = (String) objArr19[0];
            byte b7 = bArr[792];
            byte b8 = bArr[271];
            Object[] objArr20 = new Object[1];
            a(b7, b8, (short) (b8 | 178), objArr20);
            Object[] objArr21 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr20[0])).invoke(str, objArr17);
            int[] iArr = new int[objArr21.length];
            int i2 = 0;
            while (i2 < objArr21.length) {
                Object[] objArr22 = {objArr21[i2]};
                byte[] bArr2 = ParcelableVolumeInfo;
                short s2 = (short) 210;
                Object[] objArr23 = new Object[1];
                a(bArr2[792], bArr2[c], s2, objArr23);
                Class<?> cls8 = Class.forName((String) objArr23[0]);
                Object[] objArr24 = new Object[1];
                a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr24);
                String str3 = (String) objArr24[0];
                byte b9 = bArr2[792];
                byte b10 = bArr2[c2];
                Object[] objArr25 = new Object[1];
                a(b9, b10, (short) (b10 | 178), objArr25);
                Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                Object[] objArr26 = new Object[1];
                a(bArr2[792], bArr2[170], s2, objArr26);
                Class<?> cls9 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a(bArr2[125], bArr2[5], (short) 232, objArr27);
                iArr[i2] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
                i2++;
                c = 170;
                c2 = 271;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                    switch (cleartextsubstitutiondefault.read(iArr[i3])) {
                        case -16:
                            try {
                                cleartextsubstitutiondefault.read(8);
                                throw ((Throwable) cleartextsubstitutiondefault.write);
                            } catch (Throwable th) {
                                th = th;
                                byte[] bArr3 = ParcelableVolumeInfo;
                                byte b11 = bArr3[792];
                                byte b12 = bArr3[33];
                                objArr = new Object[1];
                                a(b11, b12, (short) (b12 | 322), objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th) || i3 < 2 || i3 >= 3) {
                                    throw th;
                                }
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(24);
                                i3 = 34;
                            }
                            break;
                        case -15:
                            i3 = 1;
                            break;
                        case Float16.MinExponent /* -14 */:
                            i3 = 33;
                            break;
                        case -13:
                            cleartextsubstitutiondefault.read(14);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 32;
                            }
                            i3 = i4;
                            break;
                        case -12:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                            i3 = i4;
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                            cleartextsubstitutiondefault.read(10);
                            i3 = i4;
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i3 = 10;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i3 = 22;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            cleartextsubstitutiondefault.read(31);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i4 = 21;
                            }
                            i3 = i4;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                            i3 = i4;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                            cleartextsubstitutiondefault.read(10);
                            i3 = i4;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            cleartextsubstitutiondefault.read(8);
                            return (ReentrantLock) cleartextsubstitutiondefault.write;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            i3 = 23;
                            break;
                        case -3:
                            i3 = 12;
                            break;
                        case -2:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).write;
                            try {
                                cleartextsubstitutiondefault.read(4);
                                i3 = i4;
                            } catch (Throwable th2) {
                                th = th2;
                                byte[] bArr4 = ParcelableVolumeInfo;
                                byte b13 = bArr4[792];
                                byte b14 = bArr4[33];
                                objArr = new Object[1];
                                a(b13, b14, (short) (b14 | 322), objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                }
                                throw th;
                            }
                            break;
                        case -1:
                            i3 = 6;
                            break;
                        default:
                            i3 = i4;
                            break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0330. Please report as an issue. */
    public static final /* synthetic */ resetTransientState RemoteActionCompatParcelizer(LocalAuthDataSource localAuthDataSource) throws Throwable {
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(localAuthDataSource);
        try {
            byte[] bArr = ParcelableVolumeInfo;
            Object[] objArr = new Object[1];
            a(bArr[108], bArr[78], bArr[100], objArr);
            int i = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[170], bArr[125], (short) 431, objArr2);
            int i2 = 104 - (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() > (-1L) ? 1 : (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() == (-1L) ? 0 : -1));
            Object[] objArr3 = new Object[1];
            a(bArr[108], bArr[78], bArr[14], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b = bArr[125];
            Object[] objArr4 = new Object[1];
            a(b, bArr[31], b, objArr4);
            String str = (String) objArr4[0];
            Object[] objArr5 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr5);
            int iIntValue = ((Integer) cls2.getMethod(str, Class.forName((String) objArr5[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue() + 368;
            Object[] objArr6 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[551], bArr[125], (short) 453, objArr7);
            Object[] objArr8 = new Object[1];
            b(i2, iIntValue, (char) ((((Integer) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).intValue() >> 16) + 59116), objArr8);
            String str2 = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(bArr[108], bArr[78], bArr[14], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            byte b2 = bArr[286];
            byte b3 = bArr[92];
            Object[] objArr10 = new Object[1];
            a(b2, b3, (short) (b3 | 467), objArr10);
            String str3 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr11);
            int i3 = -((Integer) cls4.getMethod(str3, Class.forName((String) objArr11[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue();
            Object[] objArr12 = new Object[1];
            a(bArr[108], bArr[551], (short) 363, objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a(bArr[551], bArr[792], (short) 485, objArr13);
            int iIntValue2 = 121 - ((byte) ((Integer) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).intValue());
            Object[] objArr14 = {0};
            Object[] objArr15 = new Object[1];
            a(bArr[108], bArr[78], (short) 167, objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            char c = 271;
            Object[] objArr16 = new Object[1];
            a(bArr[271], bArr[8], (short) 356, objArr16);
            Object[] objArr17 = new Object[1];
            b(i3, iIntValue2, (char) ((Integer) cls6.getMethod((String) objArr16[0], Integer.TYPE).invoke(null, objArr14)).intValue(), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            byte b4 = bArr[792];
            byte b5 = bArr[271];
            Object[] objArr19 = new Object[1];
            a(b4, b5, (short) (b5 | 178), objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            byte b6 = (byte) PlaybackStateCompat;
            byte b7 = bArr[0];
            Object[] objArr20 = new Object[1];
            a(b6, b7, (short) (b7 | 204), objArr20);
            String str4 = (String) objArr20[0];
            byte b8 = bArr[792];
            byte b9 = bArr[271];
            Object[] objArr21 = new Object[1];
            a(b8, b9, (short) (b9 | 178), objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            int i4 = 0;
            while (i4 < objArr22.length) {
                Object[] objArr23 = {objArr22[i4]};
                byte[] bArr2 = ParcelableVolumeInfo;
                short s = (short) 210;
                Object[] objArr24 = new Object[1];
                a(bArr2[792], bArr2[170], s, objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr25);
                String str5 = (String) objArr25[0];
                byte b10 = bArr2[792];
                byte b11 = bArr2[c];
                Object[] objArr26 = new Object[1];
                a(b10, b11, (short) (b11 | 178), objArr26);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a(bArr2[792], bArr2[170], s, objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a(bArr2[125], bArr2[5], (short) 232, objArr28);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i4++;
                c = 271;
            }
            while (true) {
                int i5 = i + 1;
                switch (cleartextsubstitutiondefault.read(iArr[i])) {
                    case -15:
                        i = 10;
                        break;
                    case Float16.MinExponent /* -14 */:
                        i5 = 32;
                        break;
                    case -13:
                        cleartextsubstitutiondefault.read(14);
                        if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                            i5 = 31;
                        }
                        break;
                    case -12:
                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                        cleartextsubstitutiondefault.read(2);
                        cleartextsubstitutiondefault.read(13);
                        MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                        break;
                    case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                        cleartextsubstitutiondefault.read(10);
                        break;
                    case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                        i = 1;
                        break;
                    case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                        i = 21;
                        break;
                    case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                        cleartextsubstitutiondefault.read(31);
                        i = cleartextsubstitutiondefault.IconCompatParcelizer == 0 ? 20 : i5;
                        break;
                    case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                        cleartextsubstitutiondefault.read(2);
                        cleartextsubstitutiondefault.read(13);
                        RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                        break;
                    case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                        cleartextsubstitutiondefault.read(10);
                        break;
                    case BaseCode.URI_IS_NULL /* -5 */:
                        break;
                    case BaseCode.NO_SOLUTION /* -4 */:
                        i = 12;
                        break;
                    case -3:
                        i = 22;
                        break;
                    case -2:
                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                        cleartextsubstitutiondefault.read(2);
                        cleartextsubstitutiondefault.read(3);
                        cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).write();
                        cleartextsubstitutiondefault.read(4);
                        break;
                    case -1:
                        i = 6;
                        break;
                    default:
                        break;
                }
                cleartextsubstitutiondefault.read(8);
                return (resetTransientState) cleartextsubstitutiondefault.write;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x046b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x042d  */
    /* JADX WARN: Code duplicated, block: B:74:0x044b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0456 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x045c  */
    public static final /* synthetic */ MutableStateFlow write(LocalAuthDataSource localAuthDataSource) throws Throwable {
        byte[] bArr;
        Object[] objArr;
        Object[] objArr2;
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(localAuthDataSource);
        try {
            byte[] bArr2 = ParcelableVolumeInfo;
            short s = (short) 167;
            Object[] objArr3 = new Object[1];
            a(bArr2[108], bArr2[78], s, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr2[271], bArr2[8], (short) 356, objArr4);
            int iIntValue = ((Integer) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).intValue() + 137;
            Object[] objArr5 = new Object[1];
            a(bArr2[108], bArr2[78], s, objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            byte b = bArr2[551];
            byte b2 = bArr2[0];
            Object[] objArr6 = new Object[1];
            a(b, b2, (short) (b2 | 357), objArr6);
            int iIntValue2 = 230 - ((Integer) cls2.getMethod((String) objArr6[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr7 = {0, 0};
            Object[] objArr8 = new Object[1];
            a(bArr2[108], bArr2[551], (short) 363, objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            byte b3 = bArr2[551];
            byte b4 = bArr2[92];
            Object[] objArr9 = new Object[1];
            a(b3, b4, (short) (b4 | 375), objArr9);
            Object[] objArr10 = new Object[1];
            b(iIntValue, iIntValue2, (char) ((Integer) cls3.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr7)).intValue(), objArr10);
            String str = (String) objArr10[0];
            try {
                Object[] objArr11 = new Object[1];
                a(bArr2[108], bArr2[78], bArr2[14], objArr11);
                Class<?> cls4 = Class.forName((String) objArr11[0]);
                byte b5 = bArr2[125];
                Object[] objArr12 = new Object[1];
                a(b5, bArr2[31], b5, objArr12);
                String str2 = (String) objArr12[0];
                char c = 792;
                Object[] objArr13 = new Object[1];
                a(bArr2[792], bArr2[78], bArr2[20], objArr13);
                Object[] objArr14 = new Object[1];
                a(bArr2[792], bArr2[78], bArr2[20], objArr14);
                int iIntValue3 = 1 - ((Integer) cls4.getMethod(str2, Class.forName((String) objArr13[0]), Class.forName((String) objArr14[0])).invoke(null, "", "")).intValue();
                Object[] objArr15 = new Object[1];
                a(bArr2[108], bArr2[400], (short) (bArr2[325] + 1), objArr15);
                Class<?> cls5 = Class.forName((String) objArr15[0]);
                byte b6 = bArr2[551];
                byte b7 = bArr2[465];
                Object[] objArr16 = new Object[1];
                a(b6, b7, (short) (b7 | 384), objArr16);
                int iIntValue4 = (((Integer) cls5.getMethod((String) objArr16[0], null).invoke(null, null)).intValue() >> 8) + 122;
                Object[] objArr17 = {Float.valueOf(0.0f), Float.valueOf(0.0f)};
                byte b8 = bArr2[108];
                byte b9 = bArr2[125];
                Object[] objArr18 = new Object[1];
                a(b8, b9, (short) (b9 | 384), objArr18);
                Class<?> cls6 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                a(bArr2[286], bArr2[77], (short) 426, objArr19);
                Object[] objArr20 = new Object[1];
                b(iIntValue3, iIntValue4, (char) (((Float) cls6.getMethod((String) objArr19[0], Float.TYPE, Float.TYPE).invoke(null, objArr17)).floatValue() > 0.0f ? 1 : (((Float) cls6.getMethod((String) objArr19[0], Float.TYPE, Float.TYPE).invoke(null, objArr17)).floatValue() == 0.0f ? 0 : -1)), objArr20);
                try {
                    Object[] objArr21 = {(String) objArr20[0]};
                    byte b10 = bArr2[792];
                    byte b11 = bArr2[271];
                    Object[] objArr22 = new Object[1];
                    a(b10, b11, (short) (b11 | 178), objArr22);
                    Class<?> cls7 = Class.forName((String) objArr22[0]);
                    byte b12 = (byte) PlaybackStateCompat;
                    byte b13 = bArr2[0];
                    Object[] objArr23 = new Object[1];
                    a(b12, b13, (short) (b13 | 204), objArr23);
                    String str3 = (String) objArr23[0];
                    byte b14 = bArr2[792];
                    byte b15 = bArr2[271];
                    Object[] objArr24 = new Object[1];
                    a(b14, b15, (short) (b15 | 178), objArr24);
                    Object[] objArr25 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr24[0])).invoke(str, objArr21);
                    int[] iArr = new int[objArr25.length];
                    int i = 0;
                    while (i < objArr25.length) {
                        Object[] objArr26 = {objArr25[i]};
                        byte[] bArr3 = ParcelableVolumeInfo;
                        short s2 = (short) 210;
                        Object[] objArr27 = new Object[1];
                        a(bArr3[c], bArr3[170], s2, objArr27);
                        Class<?> cls8 = Class.forName((String) objArr27[0]);
                        Object[] objArr28 = new Object[1];
                        a(bArr3[301], bArr3[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr28);
                        String str4 = (String) objArr28[0];
                        byte b16 = bArr3[c];
                        byte b17 = bArr3[271];
                        Object[] objArr29 = new Object[1];
                        a(b16, b17, (short) (b17 | 178), objArr29);
                        Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr29[0])).invoke(null, objArr26);
                        Object[] objArr30 = new Object[1];
                        a(bArr3[792], bArr3[170], s2, objArr30);
                        Class<?> cls9 = Class.forName((String) objArr30[0]);
                        Object[] objArr31 = new Object[1];
                        a(bArr3[125], bArr3[5], (short) 232, objArr31);
                        iArr[i] = ((Integer) cls9.getMethod((String) objArr31[0], null).invoke(objInvoke, null)).intValue();
                        i++;
                        c = 792;
                    }
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        try {
                            switch (cleartextsubstitutiondefault.read(iArr[i2])) {
                                case -18:
                                    i2 = 37;
                                    break;
                                case -17:
                                    cleartextsubstitutiondefault.read(21);
                                    i2 = cleartextsubstitutiondefault.IconCompatParcelizer != 28 ? 20 : 8;
                                    break;
                                case -16:
                                    i2 = 1;
                                    break;
                                case -15:
                                    i2 = 36;
                                    break;
                                case Float16.MinExponent /* -14 */:
                                    cleartextsubstitutiondefault.read(14);
                                    if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                        i3 = 35;
                                    }
                                    i2 = i3;
                                    break;
                                case -13:
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                    try {
                                        cleartextsubstitutiondefault.read(2);
                                        cleartextsubstitutiondefault.read(13);
                                        MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                                        i2 = i3;
                                    } catch (Throwable th) {
                                        th = th;
                                        bArr = ParcelableVolumeInfo;
                                        byte b18 = bArr[792];
                                        byte b19 = bArr[33];
                                        objArr = new Object[1];
                                        a(b18, b19, (short) (b19 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b20 = bArr[792];
                                            byte b21 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b20, b21, (short) (b21 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i2 >= 21) {
                                            }
                                            throw th;
                                        }
                                        byte b22 = bArr[792];
                                        byte b23 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b22, b23, (short) (b23 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i2 >= 21) {
                                        }
                                        throw th;
                                        cleartextsubstitutiondefault.serializer = th;
                                        cleartextsubstitutiondefault.read(24);
                                    }
                                    break;
                                case -12:
                                    try {
                                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                                        cleartextsubstitutiondefault.read(10);
                                        i2 = i3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bArr = ParcelableVolumeInfo;
                                        byte b110 = bArr[792];
                                        byte b111 = bArr[33];
                                        objArr = new Object[1];
                                        a(b110, b111, (short) (b111 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th) || i2 < 10 || i2 >= 19) {
                                            byte b24 = bArr[792];
                                            byte b25 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b24, b25, (short) (b25 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th) && i2 >= 14 && i2 < 15) {
                                                i2 = 43;
                                            } else {
                                                if (i2 >= 21 || i2 >= 26) {
                                                    throw th;
                                                }
                                                i2 = 19;
                                            }
                                        } else {
                                            i2 = 43;
                                        }
                                        cleartextsubstitutiondefault.serializer = th;
                                        cleartextsubstitutiondefault.read(24);
                                    }
                                    break;
                                case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                    cleartextsubstitutiondefault.read(8);
                                    throw ((Throwable) cleartextsubstitutiondefault.write);
                                case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                    i2 = 38;
                                    break;
                                case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                    i2 = 40;
                                    break;
                                case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                    try {
                                        cleartextsubstitutiondefault.read(31);
                                        if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                            i3 = 18;
                                        }
                                        i2 = i3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bArr = ParcelableVolumeInfo;
                                        byte b112 = bArr[792];
                                        byte b113 = bArr[33];
                                        objArr = new Object[1];
                                        a(b112, b113, (short) (b113 | 322), objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b26 = bArr[792];
                                            byte b27 = bArr[33];
                                            objArr2 = new Object[1];
                                            a(b26, b27, (short) (b27 | 322), objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i2 >= 21) {
                                            }
                                            throw th;
                                        }
                                        byte b28 = bArr[792];
                                        byte b29 = bArr[33];
                                        objArr2 = new Object[1];
                                        a(b28, b29, (short) (b29 | 322), objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i2 >= 21) {
                                        }
                                        throw th;
                                        cleartextsubstitutiondefault.serializer = th;
                                        cleartextsubstitutiondefault.read(24);
                                    }
                                    break;
                                case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                    cleartextsubstitutiondefault.read(2);
                                    cleartextsubstitutiondefault.read(13);
                                    RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                                    i2 = i3;
                                    break;
                                case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                                    cleartextsubstitutiondefault.read(10);
                                    i2 = i3;
                                    break;
                                case BaseCode.URI_IS_NULL /* -5 */:
                                    cleartextsubstitutiondefault.read(8);
                                    return (MutableStateFlow) cleartextsubstitutiondefault.write;
                                case BaseCode.NO_SOLUTION /* -4 */:
                                    i2 = 26;
                                    break;
                                case -3:
                                    i2 = 10;
                                    break;
                                case -2:
                                    cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                    cleartextsubstitutiondefault.read(2);
                                    cleartextsubstitutiondefault.read(3);
                                    cleartextsubstitutiondefault.serializer = ((LocalAuthDataSource) cleartextsubstitutiondefault.write).read;
                                    cleartextsubstitutiondefault.read(4);
                                    i2 = i3;
                                    break;
                                case -1:
                                    i2 = 5;
                                    break;
                                default:
                                    i2 = i3;
                                    break;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (Throwable th5) {
                    Throwable cause = th5.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th5;
                }
            } catch (Throwable th6) {
                Throwable cause2 = th6.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th6;
            }
        } catch (Throwable th7) {
            Throwable cause3 = th7.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th7;
        }
    }

    public static /* synthetic */ resetTransientState serializer() throws Throwable {
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault();
        try {
            byte[] bArr = ParcelableVolumeInfo;
            byte b = bArr[108];
            byte b2 = bArr[738];
            Object[] objArr = new Object[1];
            a(b, b2, (short) (b2 | 224), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[895], bArr[0], (short) Fields.RotationX, objArr2);
            int iIntValue = (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 22) + 107;
            Object[] objArr3 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[551], bArr[92], (short) 260, objArr4);
            int iIntValue2 = 123 - (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr5 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[551], bArr[33], (short) 270, objArr6);
            Object[] objArr7 = new Object[1];
            b(iIntValue, iIntValue2, (char) (((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 16), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(bArr[551], bArr[170], (short) 288, objArr9);
            int i = (((Float) cls4.getMethod((String) objArr9[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls4.getMethod((String) objArr9[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1));
            Object[] objArr10 = new Object[1];
            a(bArr[108], bArr[20], (short) 304, objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            byte b3 = bArr[551];
            byte b4 = bArr[31];
            Object[] objArr11 = new Object[1];
            a(b3, b4, (short) (b4 | 328), objArr11);
            int iIntValue3 = 122 - ((Integer) cls5.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr12 = {"", "", 0};
            Object[] objArr13 = new Object[1];
            a(bArr[108], bArr[78], bArr[14], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            byte b5 = bArr[125];
            Object[] objArr14 = new Object[1];
            a(b5, bArr[31], b5, objArr14);
            String str2 = (String) objArr14[0];
            char c = 792;
            Object[] objArr15 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr15);
            Object[] objArr16 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr16);
            Class<?>[] clsArr = {Class.forName((String) objArr15[0]), Class.forName((String) objArr16[0]), Integer.TYPE};
            Object[] objArr17 = new Object[1];
            b(i, iIntValue3, (char) ((Integer) cls6.getMethod(str2, clsArr).invoke(null, objArr12)).intValue(), objArr17);
            try {
                Object[] objArr18 = {(String) objArr17[0]};
                byte b6 = bArr[792];
                char c2 = 271;
                byte b7 = bArr[271];
                Object[] objArr19 = new Object[1];
                a(b6, b7, (short) (b7 | 178), objArr19);
                Class<?> cls7 = Class.forName((String) objArr19[0]);
                byte b8 = (byte) PlaybackStateCompat;
                byte b9 = bArr[0];
                Object[] objArr20 = new Object[1];
                a(b8, b9, (short) (b9 | 204), objArr20);
                String str3 = (String) objArr20[0];
                byte b10 = bArr[792];
                byte b11 = bArr[271];
                Object[] objArr21 = new Object[1];
                a(b10, b11, (short) (b11 | 178), objArr21);
                Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str, objArr18);
                int[] iArr = new int[objArr22.length];
                int i2 = 0;
                while (i2 < objArr22.length) {
                    Object[] objArr23 = {objArr22[i2]};
                    byte[] bArr2 = ParcelableVolumeInfo;
                    short s = (short) 210;
                    Object[] objArr24 = new Object[1];
                    a(bArr2[c], bArr2[170], s, objArr24);
                    Class<?> cls8 = Class.forName((String) objArr24[0]);
                    Object[] objArr25 = new Object[1];
                    a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr25);
                    String str4 = (String) objArr25[0];
                    byte b12 = bArr2[c];
                    byte b13 = bArr2[c2];
                    Object[] objArr26 = new Object[1];
                    a(b12, b13, (short) (b13 | 178), objArr26);
                    Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                    Object[] objArr27 = new Object[1];
                    a(bArr2[792], bArr2[170], s, objArr27);
                    Class<?> cls9 = Class.forName((String) objArr27[0]);
                    Object[] objArr28 = new Object[1];
                    a(bArr2[125], bArr2[5], (short) 232, objArr28);
                    iArr[i2] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                    i2++;
                    c2 = 271;
                    c = 792;
                }
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    try {
                        switch (cleartextsubstitutiondefault.read(iArr[i3])) {
                            case -16:
                                cleartextsubstitutiondefault.read(8);
                                throw ((Throwable) cleartextsubstitutiondefault.write);
                            case -15:
                                i3 = 1;
                                break;
                            case Float16.MinExponent /* -14 */:
                                i3 = 31;
                                break;
                            case -13:
                                cleartextsubstitutiondefault.read(31);
                                if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                    i4 = 30;
                                }
                                i3 = i4;
                                break;
                            case -12:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                try {
                                    cleartextsubstitutiondefault.read(2);
                                    cleartextsubstitutiondefault.read(13);
                                    RatingCompat = cleartextsubstitutiondefault.IconCompatParcelizer;
                                    i3 = i4;
                                } catch (Throwable th) {
                                    th = th;
                                    byte[] bArr3 = ParcelableVolumeInfo;
                                    byte b14 = bArr3[792];
                                    byte b15 = bArr3[33];
                                    Object[] objArr29 = new Object[1];
                                    a(b14, b15, (short) (b15 | 322), objArr29);
                                    if (Class.forName((String) objArr29[0]).isInstance(th) && i3 >= 1) {
                                        i3 = i3 < 5 ? 33 : 32;
                                        cleartextsubstitutiondefault.serializer = th;
                                        cleartextsubstitutiondefault.read(24);
                                    }
                                    byte b16 = bArr3[792];
                                    byte b17 = bArr3[33];
                                    Object[] objArr30 = new Object[1];
                                    a(b16, b17, (short) (b17 | 322), objArr30);
                                    if (!Class.forName((String) objArr30[0]).isInstance(th) || i3 < 20 || i3 >= 21) {
                                        byte b18 = bArr3[792];
                                        byte b19 = bArr3[33];
                                        Object[] objArr31 = new Object[1];
                                        a(b18, b19, (short) (b19 | 322), objArr31);
                                        if (!Class.forName((String) objArr31[0]).isInstance(th) || i3 < 26 || i3 >= 31) {
                                            throw th;
                                        }
                                        i3 = 32;
                                    }
                                    cleartextsubstitutiondefault.serializer = th;
                                    cleartextsubstitutiondefault.read(24);
                                }
                                break;
                            case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem;
                                cleartextsubstitutiondefault.read(10);
                                i3 = i4;
                                break;
                            case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                i3 = 8;
                                break;
                            case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                i3 = 19;
                                break;
                            case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                cleartextsubstitutiondefault.read(14);
                                if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                    i4 = 18;
                                }
                                i3 = i4;
                                break;
                            case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                cleartextsubstitutiondefault.read(2);
                                cleartextsubstitutiondefault.read(13);
                                MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                                i3 = i4;
                                break;
                            case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                                cleartextsubstitutiondefault.read(10);
                                i3 = i4;
                                break;
                            case BaseCode.URI_IS_NULL /* -5 */:
                                cleartextsubstitutiondefault.read(8);
                                return (resetTransientState) cleartextsubstitutiondefault.write;
                            case BaseCode.NO_SOLUTION /* -4 */:
                                i3 = 20;
                                break;
                            case -3:
                                i3 = 10;
                                break;
                            case -2:
                                cleartextsubstitutiondefault.serializer = read();
                                cleartextsubstitutiondefault.read(4);
                                i3 = i4;
                                break;
                            case -1:
                                i3 = 5;
                                break;
                            default:
                                i3 = i4;
                                break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            Throwable cause2 = th4.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x046b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0460 A[ADDED_TO_REGION] */
    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(onTouch ontouch) throws Throwable {
        clearTextSubstitutiondefault cleartextsubstitutiondefault = new clearTextSubstitutiondefault(ontouch);
        try {
            int i = 0;
            byte[] bArr = ParcelableVolumeInfo;
            Object[] objArr = new Object[1];
            a(bArr[108], bArr[78], bArr[14], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b = bArr[125];
            Object[] objArr2 = new Object[1];
            a(b, bArr[31], b, objArr2);
            String str = (String) objArr2[0];
            Object[] objArr3 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr3);
            Object[] objArr4 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr4);
            int iIntValue = ((Integer) cls.getMethod(str, Class.forName((String) objArr3[0]), Class.forName((String) objArr4[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", "", 0, 0)).intValue() + 122;
            Object[] objArr5 = new Object[1];
            a(bArr[108], bArr[78], bArr[100], objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[262], bArr[465], bArr[95], objArr6);
            int i2 = 1 - (((Long) cls2.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1));
            Object[] objArr7 = new Object[1];
            a(bArr[108], bArr[400], (short) (bArr[325] + 1), objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(bArr[551], bArr[33], (short) (bArr[1] - 1), objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue, i2, (char) (((Integer) cls3.getMethod((String) objArr8[0], null).invoke(null, null)).intValue() >> 16), objArr9);
            String str2 = (String) objArr9[0];
            byte b2 = bArr[108];
            byte b3 = bArr[239];
            int i3 = PlaybackStateCompat;
            Object[] objArr10 = new Object[1];
            a(b2, b3, (short) (i3 | 96), objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[551], bArr[108], (short) 153, objArr11);
            int i4 = -((Integer) cls4.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr12 = new Object[1];
            a(bArr[108], bArr[78], (short) 167, objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a(bArr[108], bArr[8], (short) 188, objArr13);
            int iIntValue2 = 122 - ((Integer) cls5.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0, 0)).intValue();
            Object[] objArr14 = {"", '0'};
            Object[] objArr15 = new Object[1];
            a(bArr[108], bArr[78], bArr[14], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            byte b4 = bArr[125];
            Object[] objArr16 = new Object[1];
            a(b4, bArr[31], b4, objArr16);
            String str3 = (String) objArr16[0];
            Object[] objArr17 = new Object[1];
            a(bArr[792], bArr[78], bArr[20], objArr17);
            Object[] objArr18 = new Object[1];
            b(i4, iIntValue2, (char) (((Integer) cls6.getMethod(str3, Class.forName((String) objArr17[0]), Character.TYPE).invoke(null, objArr14)).intValue() + 1), objArr18);
            Object[] objArr19 = {(String) objArr18[0]};
            byte b5 = bArr[792];
            char c = 271;
            byte b6 = bArr[271];
            Object[] objArr20 = new Object[1];
            a(b5, b6, (short) (b6 | 178), objArr20);
            Class<?> cls7 = Class.forName((String) objArr20[0]);
            byte b7 = bArr[0];
            Object[] objArr21 = new Object[1];
            a((byte) i3, b7, (short) (b7 | 204), objArr21);
            String str4 = (String) objArr21[0];
            byte b8 = bArr[792];
            byte b9 = bArr[271];
            Object[] objArr22 = new Object[1];
            a(b8, b9, (short) (b9 | 178), objArr22);
            Object[] objArr23 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr22[0])).invoke(str2, objArr19);
            int[] iArr = new int[objArr23.length];
            int i5 = 0;
            while (i5 < objArr23.length) {
                Object[] objArr24 = {objArr23[i5]};
                byte[] bArr2 = ParcelableVolumeInfo;
                short s = (short) 210;
                Object[] objArr25 = new Object[1];
                a(bArr2[792], bArr2[170], s, objArr25);
                Class<?> cls8 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                a(bArr2[301], bArr2[31], (short) Constant.ERROR_WSS_SPEED_JUMP, objArr26);
                String str5 = (String) objArr26[0];
                byte b10 = bArr2[792];
                byte b11 = bArr2[c];
                Object[] objArr27 = new Object[1];
                a(b10, b11, (short) (b11 | 178), objArr27);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr27[0])).invoke(null, objArr24);
                Object[] objArr28 = new Object[1];
                a(bArr2[792], bArr2[170], s, objArr28);
                Class<?> cls9 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                a(bArr2[125], bArr2[5], (short) 232, objArr29);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
                i5++;
                c = 271;
            }
            while (true) {
                int i6 = i + 1;
                int i7 = 24;
                try {
                    switch (cleartextsubstitutiondefault.read(iArr[i])) {
                        case -17:
                            i = 35;
                            break;
                        case -16:
                            cleartextsubstitutiondefault.read(21);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer != 0) {
                                i6 = 19;
                            } else {
                                i = 8;
                            }
                            break;
                        case -15:
                            i = 1;
                            break;
                        case Float16.MinExponent /* -14 */:
                            i = 34;
                            break;
                        case -13:
                            try {
                                cleartextsubstitutiondefault.read(14);
                                i7 = cleartextsubstitutiondefault.IconCompatParcelizer;
                                i = i7 == 0 ? 33 : i6;
                            } catch (Throwable th) {
                                th = th;
                                if (i >= 20 || i >= i7) {
                                    throw th;
                                }
                                cleartextsubstitutiondefault.serializer = th;
                                cleartextsubstitutiondefault.read(i7);
                                i = 18;
                            }
                            break;
                        case -12:
                            try {
                                cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                                try {
                                    cleartextsubstitutiondefault.read(2);
                                    try {
                                        cleartextsubstitutiondefault.read(3);
                                        cleartextsubstitutiondefault.RemoteActionCompatParcelizer = cleartextsubstitutiondefault.write.hashCode();
                                        cleartextsubstitutiondefault.read(10);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (i >= 20) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (i >= 20) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            try {
                                cleartextsubstitutiondefault.read(8);
                                throw ((Throwable) cleartextsubstitutiondefault.write);
                            } catch (Throwable th5) {
                                th = th5;
                                if (i >= 20) {
                                }
                                throw th;
                            }
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i = 36;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i = 38;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            cleartextsubstitutiondefault.read(14);
                            if (cleartextsubstitutiondefault.IconCompatParcelizer == 0) {
                                i6 = 17;
                            }
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(13);
                            MediaBrowserCompatMediaItem = cleartextsubstitutiondefault.IconCompatParcelizer;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = RatingCompat;
                            cleartextsubstitutiondefault.read(10);
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            cleartextsubstitutiondefault.read(8);
                            return (createFromParcel) cleartextsubstitutiondefault.write;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            i = 24;
                            break;
                        case -3:
                            i = 10;
                            break;
                        case -2:
                            cleartextsubstitutiondefault.RemoteActionCompatParcelizer = 1;
                            cleartextsubstitutiondefault.read(2);
                            cleartextsubstitutiondefault.read(3);
                            cleartextsubstitutiondefault.serializer = IconCompatParcelizer((onTouch) cleartextsubstitutiondefault.write);
                            try {
                                cleartextsubstitutiondefault.read(4);
                            } catch (Throwable th6) {
                                th = th6;
                                if (i >= 20) {
                                }
                                throw th;
                            }
                            break;
                        case -1:
                            i = 5;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
        } catch (Throwable th8) {
            Throwable cause = th8.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th8;
        }
    }
}
