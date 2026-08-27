package com.roadrunner.customerchat.selfservice.presentation;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.RemoteFunctionKt$onRemoteFunction$1;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.huawei.riemann.gnsslocation.core.bean.log.GpsRtiItem;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.customerchat.legacy.core.usecases.PhoneNumberUseCase;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.selfservice.data.cache.server.ChatAssetCacheLocalWebServer;
import com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl;
import com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.H$b;
import io.grpc.LoadBalancer$Helper;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AndroidParagraph;
import o.Bullet;
import o.Html_androidKt;
import o.IInAppMessageViewWrapper;
import o.MultiParagraph;
import o.NonNullValueClassSaver;
import o.ParagraphIntrinsicsKt;
import o.ParagraphKt;
import o.ParagraphStyle;
import o.Paragraph_EkL_Ydefault;
import o.Paragraphdefault;
import o.PreviewBlackScreenQuirk;
import o.ShortNewsContentCardView;
import o.SpannableExtensions_androidKt;
import o.TextUnitTypeCompanion;
import o.ToggleableState;
import o.accessanalyzeComponents58bKbWc;
import o.accessgetAllcp;
import o.accessgetDefaultIndentationcp;
import o.accessgetLocalPlaceholders;
import o.accessisSetgyyYBs;
import o.accessshouldAttachIndentationFixSpan;
import o.accesstoLayoutHyphenationFrequency3fSNIE;
import o.accesstoLayoutLineBreakWordStylewPN0Rpw;
import o.addSpans;
import o.asComposePaint;
import o.ceilToInt;
import o.copyElsmlbkdefault;
import o.copyNH1kkwUdefault;
import o.copyOhffZ5M;
import o.copyOhffZ5Mdefault;
import o.copyciSxzs0default;
import o.copyw_4Rhrwdefault;
import o.copyxPh5V4gdefault;
import o.createFromParcel;
import o.fillBoundingBoxes8ffj60Q;
import o.findParagraphByIndex;
import o.findParagraphByIndexlambda20;
import o.fire9b9wPM;
import o.fromHtml;
import o.getAll_3YsG6Y;
import o.getCharSequenceui_textannotations;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCursorRect;
import o.getEndLineIndex;
import o.getHasNonTranslationComponents;
import o.getHasStaleResolvedFonts;
import o.getHorizontalPosition;
import o.getInfoListui_text;
import o.getLastInvokeMillis;
import o.getLineEllipsisCountui_text;
import o.getLineEllipsisOffsetui_text;
import o.getLineHeight;
import o.getLineStart;
import o.getLineTop;
import o.getMinIntrinsicWidth;
import o.getOverflowgIe3tQ8;
import o.getParagraph;
import o.getParagraphIntrinsics;
import o.getPlaceholderRects;
import o.getPlatformStyle;
import o.getRangeForRect86BmAI;
import o.getRangeForRect_8_6BmAIlambda0;
import o.getShaderBrushSpans;
import o.getSpanStylesOrNullui_text;
import o.getTextAlignbuA522Uannotations;
import o.getTransaction;
import o.hasSpan;
import o.ignorableWhitespace;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.localeSpan;
import o.maxIntrinsicWidth_delegatelambda0;
import o.mergedefault;
import o.minIntrinsicWidth_delegatelambda0;
import o.numberOfLinesThatFitMaxHeight;
import o.paintRPmYEkkdefault;
import o.prepareForActivityTransitionCarryover;
import o.processingInstruction;
import o.pushTtsAnnotation;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdabLCwxSdGMc8HhOHdC5nKm2_zQzM;
import o.rectInfoForDg36KO4;
import o.registerOnChangedCallback;
import o.removeNodeAtDepth;
import o.removeScheduledCallback;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setCache;
import o.setEndLineIndex;
import o.setGuidelinePercent;
import o.setSizeuvyYCjk;
import o.setStartLineIndex;
import o.setWindowOffsetgyyYBs;
import o.setWindowSize;
import o.toAnnotatedStringdefault;
import o.toBitmapConfig1JJdX4A;
import o.toGlobalLineIndex;
import o.toLayoutAlignaXe7zB0;
import o.toLayoutLineBreakWordStylewPN0Rpw;
import o.toLocal;
import o.toLocalMKHz9U;
import o.toLocalYPosition;
import o.updateAdidI;
import o.updateOffsetsLDcG7Xg;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatViewModel extends ViewModel implements r8lambdabLCwxSdGMc8HhOHdC5nKm2_zQzM {
    private static int onBackPressedDispatcher_delegatelambda0 = 0;
    private static int onBackPressedDispatcher_delegatelambda010 = 1;
    public final ChatUrlProviderImpl ComponentActivity;
    public final StateFlow IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final ignorableWhitespace MediaDescriptionCompat;
    public final MediaBrowserCompatMediaItem MediaMetadataCompat;
    public final getHasStaleResolvedFonts MediaSessionCompatQueueItem;
    public final getHasNonTranslationComponents MediaSessionCompatResultReceiverWrapper;
    public accessgetDefaultIndentationcp MediaSessionCompatToken;
    public final ChatAssetCacheManager ParcelableVolumeInfo;
    public final getPlatformStyle PlaybackStateCompat;
    public final maxIntrinsicWidth_delegatelambda0 PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public final SharedResourcePool RemoteActionCompatParcelizer;
    public final registerOnChangedCallback ResultReceiver;
    public final AnalyticsServiceImpl _init_lambda1;
    public final pushTtsAnnotation _init_lambda2;
    public final copyw_4Rhrwdefault _init_lambda3;
    public final toAnnotatedStringdefault _init_lambda4;
    public final NonNullValueClassSaver accessensureViewModelStore;
    public final minIntrinsicWidth_delegatelambda0 addObserverForBackInvoker;
    public final PhoneNumberUseCase addObserverForBackInvokerlambda0;
    public final localeSpan createFullyDrawnExecutor;
    public final SelfServiceCustomerChatRepositoryImpl defaultViewModelProviderFactory_delegatelambda0;
    public final processingInstruction ensureViewModelStore;
    public final WebChatEventsTrackerImpl fullyDrawnReporter_delegatelambda0;
    public final H$b fullyDrawnReporter_delegatelambda00;
    public final StateFlow getOnBackPressedInput;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU getSavedStateRegistryControllerannotations;
    public final boolean menuHostHelperlambda0;
    public final WebViewManager onBackPressedInput_delegatelambda0;
    public final ChatViewData r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final ceilToInt r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final StateFlow r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final isOpenInternalroom_runtime r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public String r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final MultiParagraph r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final accessisSetgyyYBs r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final Flow r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final SpannableExtensions_androidKt r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public mergedefault r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final setCache r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final BufferedChannel write;

    public static /* synthetic */ Object IconCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = (~(i7 | i8 | i5)) | (~(i | i3 | i5));
        int i10 = ~i5;
        int i11 = (~(i8 | i)) | (~(i8 | i10));
        int i12 = (~(i5 | i3)) | (~(i7 | i10));
        int i13 = i + i3 + i4 + ((-564018846) * i2) + (483938512 * i6);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i) + 752877568 + ((-1516524009) * i3) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i4) + (1390411776 * i2) + (452984832 * i6) + ((-1135738880) * i14);
        int i16 = ((i * 1456092922) - 824780772) + (i3 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i4 * 1456093799) + (i2 * 578355822) + (i6 * 1098359728) + (i14 * 1868693504);
        int i17 = i15 + (i16 * i16 * 2110914560);
        if (i17 == 1) {
            return IconCompatParcelizer(objArr);
        }
        if (i17 == 2) {
            return serializer(objArr);
        }
        if (i17 != 3) {
            return i17 != 4 ? read(objArr) : RemoteActionCompatParcelizer(objArr);
        }
        return write(objArr);
    }

    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010;
        int i3 = i2 + 39;
        onBackPressedDispatcher_delegatelambda0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i5 = i2 + 67;
        onBackPressedDispatcher_delegatelambda0 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow MediaBrowserCompatMediaItem() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda0;
        int i3 = i2 + 39;
        onBackPressedDispatcher_delegatelambda010 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            stateFlow = this.getOnBackPressedInput;
            int i4 = 86 / 0;
        } else {
            stateFlow = this.getOnBackPressedInput;
        }
        int i5 = i2 + 31;
        onBackPressedDispatcher_delegatelambda010 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SharedResourcePool RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 17;
        int i3 = i2 % Fields.SpotShadowColor;
        onBackPressedDispatcher_delegatelambda0 = i3;
        int i4 = i2 % 2;
        SharedResourcePool sharedResourcePool = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 113;
        onBackPressedDispatcher_delegatelambda010 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return sharedResourcePool;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        ChatAssetCacheLocalWebServer chatAssetCacheLocalWebServer = this.ParcelableVolumeInfo.MediaDescriptionCompat;
        synchronized (chatAssetCacheLocalWebServer.MediaSessionCompatResultReceiverWrapper) {
            chatAssetCacheLocalWebServer.write();
        }
    }

    public final mergedefault read() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010;
        int i3 = i2 + 63;
        onBackPressedDispatcher_delegatelambda0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        mergedefault mergedefaultVar = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i5 = i2 + 111;
        onBackPressedDispatcher_delegatelambda0 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return mergedefaultVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public WebChatViewModel(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, H$b h$b, MultiParagraph multiParagraph, ceilToInt ceiltoint, ChatUrlProviderImpl chatUrlProviderImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, NonNullValueClassSaver nonNullValueClassSaver, toAnnotatedStringdefault toannotatedstringdefault, WebChatEventsTrackerImpl webChatEventsTrackerImpl, accessisSetgyyYBs accessissetgyyybs, registerOnChangedCallback registeronchangedcallback, processingInstruction processinginstruction, SharedResourcePool sharedResourcePool, WebViewManager webViewManager, setCache setcache, getHasStaleResolvedFonts gethasstaleresolvedfonts, ignorableWhitespace ignorablewhitespace, SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, maxIntrinsicWidth_delegatelambda0 maxintrinsicwidth_delegatelambda0, localeSpan localespan, getPlatformStyle getplatformstyle, getHasNonTranslationComponents gethasnontranslationcomponents, SpannableExtensions_androidKt spannableExtensions_androidKt, PhoneNumberUseCase phoneNumberUseCase, minIntrinsicWidth_delegatelambda0 minintrinsicwidth_delegatelambda0, ChatAssetCacheManager chatAssetCacheManager, pushTtsAnnotation pushttsannotation, copyw_4Rhrwdefault copyw_4rhrwdefault, ChatViewData chatViewData, paintRPmYEkkdefault paintrpmyekkdefault) {
        boolean z;
        mediaBrowserCompatMediaItem.getClass();
        h$b.getClass();
        multiParagraph.getClass();
        ceiltoint.getClass();
        chatUrlProviderImpl.getClass();
        isopeninternalroom_runtime.getClass();
        nonNullValueClassSaver.getClass();
        toannotatedstringdefault.getClass();
        webChatEventsTrackerImpl.getClass();
        accessissetgyyybs.getClass();
        registeronchangedcallback.getClass();
        processinginstruction.getClass();
        sharedResourcePool.getClass();
        webViewManager.getClass();
        setcache.getClass();
        gethasstaleresolvedfonts.getClass();
        ignorablewhitespace.getClass();
        selfServiceCustomerChatRepositoryImpl.getClass();
        maxintrinsicwidth_delegatelambda0.getClass();
        localespan.getClass();
        getplatformstyle.getClass();
        gethasnontranslationcomponents.getClass();
        spannableExtensions_androidKt.getClass();
        phoneNumberUseCase.getClass();
        minintrinsicwidth_delegatelambda0.getClass();
        chatAssetCacheManager.getClass();
        pushttsannotation.getClass();
        copyw_4rhrwdefault.getClass();
        chatViewData.getClass();
        paintrpmyekkdefault.getClass();
        this.MediaMetadataCompat = mediaBrowserCompatMediaItem;
        this.fullyDrawnReporter_delegatelambda00 = h$b;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = multiParagraph;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = ceiltoint;
        this.ComponentActivity = chatUrlProviderImpl;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = isopeninternalroom_runtime;
        this.accessensureViewModelStore = nonNullValueClassSaver;
        this._init_lambda4 = toannotatedstringdefault;
        this.fullyDrawnReporter_delegatelambda0 = webChatEventsTrackerImpl;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = accessissetgyyybs;
        this.ResultReceiver = registeronchangedcallback;
        this.ensureViewModelStore = processinginstruction;
        this.RemoteActionCompatParcelizer = sharedResourcePool;
        this.onBackPressedInput_delegatelambda0 = webViewManager;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = setcache;
        this.MediaSessionCompatQueueItem = gethasstaleresolvedfonts;
        this.MediaDescriptionCompat = ignorablewhitespace;
        this.defaultViewModelProviderFactory_delegatelambda0 = selfServiceCustomerChatRepositoryImpl;
        this.PlaybackStateCompatCustomAction = maxintrinsicwidth_delegatelambda0;
        this.createFullyDrawnExecutor = localespan;
        this.PlaybackStateCompat = getplatformstyle;
        this.MediaSessionCompatResultReceiverWrapper = gethasnontranslationcomponents;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = spannableExtensions_androidKt;
        this.addObserverForBackInvokerlambda0 = phoneNumberUseCase;
        this.addObserverForBackInvoker = minintrinsicwidth_delegatelambda0;
        this.ParcelableVolumeInfo = chatAssetCacheManager;
        this._init_lambda2 = pushttsannotation;
        this._init_lambda3 = copyw_4rhrwdefault;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = chatViewData;
        this._init_lambda1 = new AnalyticsServiceImpl(25);
        int i = 1;
        int i2 = 0;
        int i3 = 2;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{gethasstaleresolvedfonts.PlaybackStateCompatCustomAction.read(), accessgetLocalPlaceholders.serializer}, getCieXyz.write())).booleanValue() || ((Boolean) gethasstaleresolvedfonts.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read()).booleanValue()) {
            int i4 = onBackPressedDispatcher_delegatelambda0 + 97;
            onBackPressedDispatcher_delegatelambda010 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = false;
        } else {
            int i7 = onBackPressedDispatcher_delegatelambda010 + 7;
            onBackPressedDispatcher_delegatelambda0 = i7 % Fields.SpotShadowColor;
            z = i7 % 2 == 0;
            int i8 = 2 % 2;
        }
        this.menuHostHelperlambda0 = z;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new getParagraph(null, false, false, null, false, false));
        this.serializer = mutableStateFlow;
        this.getOnBackPressedInput = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(new findParagraphByIndex(false, false, null, null));
        this.read = mutableStateFlow2;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = mutableStateFlow2;
        BufferedChannel bufferedChannelIconCompatParcelizer = SQLite.IconCompatParcelizer(Fields.RotationX, 4, IInAppMessageViewWrapper.DROP_LATEST);
        this.write = bufferedChannelIconCompatParcelizer;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = FlowKt.write(bufferedChannelIconCompatParcelizer);
        this.IconCompatParcelizer = paintrpmyekkdefault.read;
        String str = chatViewData.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer.plus(new findParagraphByIndexlambda20(this, 2)), null, new WebChatViewModel$observeFullPreloadingState$1(this, shortNewsContentCardView, 3), 2);
        if (accessissetgyyybs.serializer() == removeScheduledCallback.FULL_PRELOAD) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new WebChatViewModel$observeFullPreloadingState$1(this, shortNewsContentCardView, i2), 3);
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new WebChatViewModel$observeFullPreloadingState$1(this, shortNewsContentCardView, i3), 3);
        }
        if (PreviewBlackScreenQuirk.read(accessissetgyyybs.serializer())) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new WebChatViewModel$observeFullPreloadingState$1(this, shortNewsContentCardView, i), 3);
        }
    }

    public final void ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 91;
        onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.getClass();
        int i4 = onBackPressedDispatcher_delegatelambda010 + 45;
        onBackPressedDispatcher_delegatelambda0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 63;
        onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.getClass();
        } else {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.getClass();
            throw null;
        }
    }

    public final boolean MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda0 + 117;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = ((FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) this.ResultReceiver).serializer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        int i4 = onBackPressedDispatcher_delegatelambda010 + 5;
        onBackPressedDispatcher_delegatelambda0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    }

    public final void serializer(String str) {
        int i = 2 % 2;
        str.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new BridgeManager$trackEvent$2(this, str, (ShortNewsContentCardView) null, 2), 3);
        int i2 = onBackPressedDispatcher_delegatelambda0 + 57;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        ChatViewData chatViewData = ((WebChatViewModel) objArr[0]).r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        String str = chatViewData.read;
        ChatViewData.Delivery delivery = chatViewData.RemoteActionCompatParcelizer;
        Bullet bullet = new Bullet(str, delivery.serializer, delivery.IconCompatParcelizer, chatViewData.write.RemoteActionCompatParcelizer);
        int i2 = onBackPressedDispatcher_delegatelambda010 + 115;
        onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return bullet;
        }
        throw null;
    }

    public final void MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), new findParagraphByIndexlambda20(this, 1), null, new WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1(null, this, 1), 2);
        int i2 = onBackPressedDispatcher_delegatelambda010 + 35;
        onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void RemoteActionCompatParcelizer(Uri uri) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), new findParagraphByIndexlambda20(this, 1), null, new PerseusLogger$w$1((ShortNewsContentCardView) null, this, uri), 2);
        int i2 = onBackPressedDispatcher_delegatelambda0 + 91;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
    }

    public final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 write() {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), new findParagraphByIndexlambda20(this, 1), null, new WebChatViewModel$fetchChatUrl$1.AnonymousClass2(shortNewsContentCardView, this, 1), 2);
        int i2 = onBackPressedDispatcher_delegatelambda0 + 47;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        WebChatViewModel webChatViewModel = (WebChatViewModel) objArr[0];
        Uri uri = (Uri) objArr[1];
        int i = 2 % 2;
        uri.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewModel), new findParagraphByIndexlambda20(webChatViewModel, 1), null, new SignInDataStore$set$2(null, webChatViewModel, uri), 2);
        int i2 = onBackPressedDispatcher_delegatelambda0 + 57;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        WebChatViewModel webChatViewModel = (WebChatViewModel) objArr[0];
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewModel), new Paragraphdefault(toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewModel), webChatViewModel, 0), null, new BridgeManager$trackEvent$2((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objArr[1], webChatViewModel, (ShortNewsContentCardView) null, 3), 2);
        int i2 = onBackPressedDispatcher_delegatelambda0 + 103;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return null;
    }

    public final void read(Paragraph_EkL_Ydefault paragraph_EkL_Ydefault) {
        int i = 2 % 2;
        long j = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
        getHasNonTranslationComponents gethasnontranslationcomponents = this.MediaSessionCompatResultReceiverWrapper;
        gethasnontranslationcomponents.getClass();
        BuildersKt.RemoteActionCompatParcelizer(gethasnontranslationcomponents.MediaDescriptionCompat, null, null, new NafathTimerManager$observeCountdown$1(gethasnontranslationcomponents, paragraph_EkL_Ydefault, j, (ShortNewsContentCardView) null, 7), 3);
        int i2 = onBackPressedDispatcher_delegatelambda0 + 13;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        WebChatViewModel webChatViewModel = (WebChatViewModel) objArr[0];
        int i = 2 % 2;
        do {
            mutableStateFlow = webChatViewModel.serializer;
            obj = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj, null, false, false, null, false, false, 59)));
        int i2 = onBackPressedDispatcher_delegatelambda010 + 3;
        onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public final void MediaMetadataCompat() {
        MutableStateFlow mutableStateFlow;
        Object obj;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.serializer;
            obj = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj, null, false, false, null, false, false, 61)));
        int i2 = onBackPressedDispatcher_delegatelambda0 + 29;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
    }

    public final void RatingCompat() {
        MutableStateFlow mutableStateFlow;
        Object obj;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.serializer;
            obj = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj, null, false, false, null, false, false, 47)));
        int i2 = onBackPressedDispatcher_delegatelambda0 + 95;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static TextUnitTypeCompanion serializer(ChatViewData.Delivery delivery) {
        int i = 2 % 2;
        long j = delivery.MediaSessionCompatQueueItem;
        copyOhffZ5Mdefault copyohffz5mdefault = copyOhffZ5M.Companion;
        String str = delivery.MediaDescriptionCompat;
        copyohffz5mdefault.getClass();
        TextUnitTypeCompanion textUnitTypeCompanion = new TextUnitTypeCompanion(j, copyOhffZ5Mdefault.RemoteActionCompatParcelizer(str), delivery.serializer, delivery.RatingCompat, delivery.MediaBrowserCompatMediaItem, delivery.IconCompatParcelizer, delivery.write, delivery.RemoteActionCompatParcelizer, delivery.read, delivery.MediaMetadataCompat);
        int i2 = onBackPressedDispatcher_delegatelambda010 + 93;
        onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return textUnitTypeCompanion;
        }
        throw null;
    }

    public final void IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda0 + 101;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.getSavedStateRegistryControllerannotations;
        Object obj = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.getSavedStateRegistryControllerannotations = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), new Paragraphdefault(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), this, 1), null, new WebChatViewModel$fetchChatUrl$1(this, str, null), 2);
        int i4 = onBackPressedDispatcher_delegatelambda010 + 119;
        onBackPressedDispatcher_delegatelambda0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final Object sendHostEncounteredErrorMessage$1(String str, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        Object objSendMessage = sendMessage(new accessshouldAttachIndentationFixSpan(af$$ExternalSyntheticOutline0.m(this.ensureViewModelStore.write.millis(), "HOST_ENCOUNTERED_ERROR_"), new accesstoLayoutLineBreakWordStylewPN0Rpw(new accesstoLayoutHyphenationFrequency3fSNIE(str))), continuationImpl);
        if (objSendMessage == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = onBackPressedDispatcher_delegatelambda0 + 79;
            onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objSendMessage;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = onBackPressedDispatcher_delegatelambda0 + 55;
        onBackPressedDispatcher_delegatelambda010 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public final void serializer() {
        MutableStateFlow mutableStateFlow;
        Object obj;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.read;
            obj = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, findParagraphByIndex.RemoteActionCompatParcelizer((findParagraphByIndex) obj, true, false, null, null, 8)));
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), new Paragraphdefault(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), this, 2), null, new WebChatViewModel$fetchRequiredInfoForChat$3(this, null), 2);
        int i2 = onBackPressedDispatcher_delegatelambda0 + 87;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        AtomicReference atomicReference;
        getTextAlignbuA522Uannotations gettextalignbua522uannotations;
        getTextAlignbuA522Uannotations gettextalignbua522uannotations2;
        WebChatViewModel webChatViewModel = (WebChatViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 65;
        onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            atomicReference = (AtomicReference) webChatViewModel._init_lambda1.locationProvider;
            gettextalignbua522uannotations = getTextAlignbuA522Uannotations.LOCAL_ACTIVE;
            gettextalignbua522uannotations2 = getTextAlignbuA522Uannotations.CDN_ACTIVE;
            int i3 = 1 / 0;
        } else {
            str.getClass();
            atomicReference = (AtomicReference) webChatViewModel._init_lambda1.locationProvider;
            gettextalignbua522uannotations = getTextAlignbuA522Uannotations.LOCAL_ACTIVE;
            gettextalignbua522uannotations2 = getTextAlignbuA522Uannotations.CDN_ACTIVE;
        }
        while (!atomicReference.compareAndSet(gettextalignbua522uannotations, gettextalignbua522uannotations2)) {
            if (atomicReference.get() != gettextalignbua522uannotations) {
                return null;
            }
        }
        webChatViewModel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = str;
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Local web server failover triggered (", str, "), reloading from the CDN"), new Object[0]);
        webChatViewModel.IconCompatParcelizer(webChatViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer.serializer);
        int i4 = onBackPressedDispatcher_delegatelambda0 + 41;
        onBackPressedDispatcher_delegatelambda010 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public static final Object access$fetchPhoneNumber(WebChatViewModel webChatViewModel, long j, String str, WebChatViewModel$handleMessage$3 webChatViewModel$handleMessage$3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onBackPressedDispatcher_delegatelambda010 + 81;
        onBackPressedDispatcher_delegatelambda0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) webChatViewModel.ResultReceiver).serializer;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.TWILIO_ENABLED)) {
            return str;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(webChatViewModel$handleMessage$3));
        cancellableContinuationImpl.read();
        webChatViewModel.addObserverForBackInvokerlambda0.serializer(j, new setGuidelinePercent(cancellableContinuationImpl, 1), new setGuidelinePercent(cancellableContinuationImpl, i));
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new setSizeuvyYCjk(4, webChatViewModel));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = onBackPressedDispatcher_delegatelambda010 + 73;
        onBackPressedDispatcher_delegatelambda0 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025 A[DONT_INVERT, PHI: r1 r3
  0x0025: PHI (r1v5 o.getHasStaleResolvedFonts) = (r1v4 o.getHasStaleResolvedFonts), (r1v10 o.getHasStaleResolvedFonts) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
  0x0025: PHI (r3v1 boolean) = (r3v0 boolean), (r3v8 boolean) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[LOOP:0: B:15:0x003d->B:17:0x0043, LOOP_END] */
    public final void write(boolean z, boolean z2) {
        getHasStaleResolvedFonts gethasstaleresolvedfonts;
        boolean z3;
        ArrayList arrayList;
        Iterator it;
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 105;
        onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            gethasstaleresolvedfonts = this.MediaSessionCompatQueueItem;
            z3 = gethasstaleresolvedfonts.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            gethasstaleresolvedfonts.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = z;
            int i3 = 52 / 0;
            if (z) {
                if (!z3) {
                    int i4 = onBackPressedDispatcher_delegatelambda010 + 121;
                    onBackPressedDispatcher_delegatelambda0 = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    arrayList = gethasstaleresolvedfonts.MediaMetadataCompat;
                    if (!arrayList.isEmpty()) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            gethasstaleresolvedfonts.RemoteActionCompatParcelizer.b_((updateOffsetsLDcG7Xg) it.next());
                        }
                        arrayList.clear();
                        int i6 = onBackPressedDispatcher_delegatelambda0 + 19;
                        onBackPressedDispatcher_delegatelambda010 = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    }
                }
            }
        } else {
            gethasstaleresolvedfonts = this.MediaSessionCompatQueueItem;
            z3 = gethasstaleresolvedfonts.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            gethasstaleresolvedfonts.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = z;
            if (z) {
                if (!z3) {
                    int i8 = onBackPressedDispatcher_delegatelambda010 + 121;
                    onBackPressedDispatcher_delegatelambda0 = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    arrayList = gethasstaleresolvedfonts.MediaMetadataCompat;
                    if (!arrayList.isEmpty()) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            gethasstaleresolvedfonts.RemoteActionCompatParcelizer.b_((updateOffsetsLDcG7Xg) it.next());
                        }
                        arrayList.clear();
                        int i10 = onBackPressedDispatcher_delegatelambda0 + 19;
                        onBackPressedDispatcher_delegatelambda010 = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    }
                }
            }
        }
        if (z2) {
            return;
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), new findParagraphByIndexlambda20(this, 1), null, new WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1(this, null, z), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object onCloseRequested(updateOffsetsLDcG7Xg updateoffsetsldcg7xg, ContinuationImpl continuationImpl) {
        toLocalYPosition tolocalyposition;
        int i = 2 % 2;
        if (continuationImpl instanceof toLocalYPosition) {
            tolocalyposition = (toLocalYPosition) continuationImpl;
            int i2 = tolocalyposition.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tolocalyposition.read = i2 - Integer.MIN_VALUE;
            } else {
                tolocalyposition = new toLocalYPosition(this, continuationImpl);
                int i3 = onBackPressedDispatcher_delegatelambda010 + 59;
                onBackPressedDispatcher_delegatelambda0 = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        } else {
            tolocalyposition = new toLocalYPosition(this, continuationImpl);
            int i5 = onBackPressedDispatcher_delegatelambda010 + 59;
            onBackPressedDispatcher_delegatelambda0 = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        Object obj = tolocalyposition.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = tolocalyposition.read;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getPlaceholderRects getplaceholderrectsWrite = updateoffsetsldcg7xg.write();
            tolocalyposition.read = 1;
            if (sendMessage(getplaceholderrectsWrite, tolocalyposition) == obj2) {
                int i8 = onBackPressedDispatcher_delegatelambda010 + 77;
                onBackPressedDispatcher_delegatelambda0 = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return obj2;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = onBackPressedDispatcher_delegatelambda0 + 85;
            onBackPressedDispatcher_delegatelambda010 = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        this.RemoteActionCompatParcelizer.serializer(getEndLineIndex.write);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final Object onHelpCenterWontHandleBackNavigation(updateOffsetsLDcG7Xg updateoffsetsldcg7xg, ContinuationImpl continuationImpl) {
        ParagraphKt paragraphKt;
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda010 + 47;
        onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof ParagraphKt) {
            paragraphKt = (ParagraphKt) continuationImpl;
            int i4 = paragraphKt.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onBackPressedDispatcher_delegatelambda010 + 69;
                onBackPressedDispatcher_delegatelambda0 = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                paragraphKt.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                paragraphKt = new ParagraphKt(this, continuationImpl);
            }
        } else {
            paragraphKt = new ParagraphKt(this, continuationImpl);
        }
        Object obj = paragraphKt.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = paragraphKt.IconCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getPlaceholderRects getplaceholderrectsWrite = updateoffsetsldcg7xg.write();
            paragraphKt.IconCompatParcelizer = 1;
            if (sendMessage(getplaceholderrectsWrite, paragraphKt) == obj2) {
                int i8 = onBackPressedDispatcher_delegatelambda0 + 93;
                onBackPressedDispatcher_delegatelambda010 = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return obj2;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        this.RemoteActionCompatParcelizer.serializer(setStartLineIndex.read);
        return createFromParcel.INSTANCE;
    }

    public final void serializer(String str, boolean z) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        Object obj2;
        int i = 2 % 2;
        str.getClass();
        do {
            mutableStateFlow = this.serializer;
            obj = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj, null, false, true, null, false, false, 32)));
        int i2 = onBackPressedDispatcher_delegatelambda010 + 57;
        onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ConnectivityManager connectivityManager = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            int i4 = onBackPressedDispatcher_delegatelambda0 + 67;
            onBackPressedDispatcher_delegatelambda010 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (networkCapabilities.hasCapability(12)) {
                int i6 = onBackPressedDispatcher_delegatelambda0 + 83;
                onBackPressedDispatcher_delegatelambda010 = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0 ? networkCapabilities.hasCapability(16) : networkCapabilities.hasCapability(127)) {
                    Object[] objArr = {this, new RoomDatabase.AnonymousClass1(this, null, z)};
                    int iWrite = GpsRtiItem.write();
                    IconCompatParcelizer(1681248497, objArr, GpsRtiItem.write(), -1681248494, GpsRtiItem.write(), iWrite, GpsRtiItem.write());
                    IconCompatParcelizer(str);
                    return;
                }
            }
        }
        do {
            obj2 = mutableStateFlow.read();
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj2, null, false, false, toGlobalLineIndex.IconCompatParcelizer, false, false, 51)));
        int i7 = onBackPressedDispatcher_delegatelambda0 + 61;
        onBackPressedDispatcher_delegatelambda010 = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Comparable access$cacheGalleryImage(WebChatViewModel webChatViewModel, Uri uri, ContinuationImpl continuationImpl) {
        toLocalMKHz9U tolocalmkhz9u;
        int i = 2 % 2;
        toAnnotatedStringdefault toannotatedstringdefault = webChatViewModel._init_lambda4;
        if (continuationImpl instanceof toLocalMKHz9U) {
            tolocalmkhz9u = (toLocalMKHz9U) continuationImpl;
            int i2 = tolocalmkhz9u.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tolocalmkhz9u.serializer = i2 - Integer.MIN_VALUE;
            } else {
                tolocalmkhz9u = new toLocalMKHz9U(webChatViewModel, continuationImpl);
            }
        } else {
            tolocalmkhz9u = new toLocalMKHz9U(webChatViewModel, continuationImpl);
        }
        Object objCacheGalleryImage = tolocalmkhz9u.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = tolocalmkhz9u.serializer;
        if (i3 != 0) {
            int i4 = onBackPressedDispatcher_delegatelambda0 + 67;
            onBackPressedDispatcher_delegatelambda010 = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri = tolocalmkhz9u.write;
            ExtrasKt.RemoteActionCompatParcelizer(objCacheGalleryImage);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objCacheGalleryImage);
            setCache setcache = webChatViewModel.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            String string = uri.toString();
            string.getClass();
            tolocalmkhz9u.write = uri;
            tolocalmkhz9u.serializer = 1;
            objCacheGalleryImage = setcache.RemoteActionCompatParcelizer.cacheGalleryImage(string, tolocalmkhz9u);
            if (objCacheGalleryImage == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        accessgetAllcp accessgetallcp = (accessgetAllcp) objCacheGalleryImage;
        if (accessgetallcp instanceof Html_androidKt) {
            try {
                return Uri.parse(((Html_androidKt) accessgetallcp).IconCompatParcelizer);
            } catch (Exception e) {
                ((addSpans) toannotatedstringdefault).serializer(fromHtml.ERROR, "selfServiceChat", "Failed to parse gallery image uri from string path.", e);
                return uri;
            }
        }
        if (accessgetallcp instanceof getAll_3YsG6Y) {
            ((addSpans) toannotatedstringdefault).serializer(fromHtml.ERROR, "selfServiceChat", "Failed to cache file from gallery.", ((getAll_3YsG6Y) accessgetallcp).read);
            return uri;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int i5 = onBackPressedDispatcher_delegatelambda010 + 121;
        onBackPressedDispatcher_delegatelambda0 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public final Object onInitStarted$1(ContinuationImpl continuationImpl) {
        ParagraphIntrinsicsKt paragraphIntrinsicsKt;
        int i = 2 % 2;
        if (continuationImpl instanceof ParagraphIntrinsicsKt) {
            int i2 = onBackPressedDispatcher_delegatelambda010 + 17;
            onBackPressedDispatcher_delegatelambda0 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            paragraphIntrinsicsKt = (ParagraphIntrinsicsKt) continuationImpl;
            int i4 = paragraphIntrinsicsKt.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onBackPressedDispatcher_delegatelambda010 + 73;
                onBackPressedDispatcher_delegatelambda0 = i5 % Fields.SpotShadowColor;
                paragraphIntrinsicsKt.serializer = i5 % 2 != 0 ? i4 * Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                paragraphIntrinsicsKt = new ParagraphIntrinsicsKt(this, continuationImpl);
            }
        } else {
            paragraphIntrinsicsKt = new ParagraphIntrinsicsKt(this, continuationImpl);
        }
        Object obj = paragraphIntrinsicsKt.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = paragraphIntrinsicsKt.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 != 0) {
            int i7 = onBackPressedDispatcher_delegatelambda010;
            int i8 = i7 + 21;
            onBackPressedDispatcher_delegatelambda0 = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = i7 + 77;
            onBackPressedDispatcher_delegatelambda0 = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.addObserverForBackInvoker.write();
            getPlaceholderRects numberoflinesthatfitmaxheight = new numberOfLinesThatFitMaxHeight(af$$ExternalSyntheticOutline0.m(this.ensureViewModelStore.write.millis(), "HOST_IS_READY_"), new toLayoutAlignaXe7zB0(getParagraphIntrinsics.IconCompatParcelizer));
            paragraphIntrinsicsKt.serializer = 1;
            if (sendMessage(numberoflinesthatfitmaxheight, paragraphIntrinsicsKt) == obj2) {
                return obj2;
            }
        }
        asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(this);
        ((inCompatibilityMode) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg).getClass();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer.plus(new findParagraphByIndexlambda20(this, 1)), null, new WebChatViewModel$fetchChatUrl$1.AnonymousClass2(shortNewsContentCardView, this, 7), 2);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (sendHostEncounteredErrorMessage$1("Verification token is invalid", r1) == r4) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendUpdatedVerificationToken$1(java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda0
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda010 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto La2
            boolean r1 = r11 instanceof o.ParagraphIntrinsicInfo
            r3 = 1
            if (r1 == r3) goto L15
            goto L24
        L15:
            r1 = r11
            o.ParagraphIntrinsicInfo r1 = (o.ParagraphIntrinsicInfo) r1
            int r4 = r1.read
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L24
            int r4 = r4 + r5
            r1.read = r4
            goto L32
        L24:
            o.ParagraphIntrinsicInfo r1 = new o.ParagraphIntrinsicInfo
            r1.<init>(r9, r11)
            int r11 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda0
            int r11 = r11 + 9
            int r4 = r11 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda010 = r4
            int r11 = r11 % r0
        L32:
            java.lang.Object r11 = r1.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r1.read
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            if (r5 == 0) goto L4e
            if (r5 == r3) goto L4a
            if (r5 != r0) goto L44
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L96
        L44:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r2
        L4a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            return r6
        L4e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            if (r10 == 0) goto L7c
            boolean r11 = o.hideCurrentlyDisplayingInAppMessage.serializer(r10)
            if (r11 == 0) goto L5a
            goto L7c
        L5a:
            o.processingInstruction r11 = r9.ensureViewModelStore
            java.time.Clock r11 = r11.write
            long r7 = r11.millis()
            java.lang.String r11 = "HOST_SENDS_NEW_ACCESS_TOKEN_"
            java.lang.String r11 = bo.app.af$$ExternalSyntheticOutline0.m(r7, r11)
            o.getTtsAnnotations r0 = new o.getTtsAnnotations
            r0.<init>(r10)
            o.getLinkAnnotations r10 = new o.getLinkAnnotations
            r10.<init>(r11, r0)
            r1.read = r3
            java.lang.Object r10 = r9.sendMessage(r10, r1)
            if (r10 != r4) goto L7b
            goto L95
        L7b:
            return r6
        L7c:
            boolean r10 = r9.MediaDescriptionCompat()
            if (r10 == 0) goto L96
            int r10 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda010
            int r10 = r10 + 97
            int r11 = r10 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda0 = r11
            int r10 = r10 % r0
            r1.read = r0
            java.lang.String r10 = "Verification token is invalid"
            java.lang.Object r10 = r9.sendHostEncounteredErrorMessage$1(r10, r1)
            if (r10 != r4) goto L96
        L95:
            return r4
        L96:
            o.SimpleItemTouchHelperCallback r10 = o.SimpleItemTouchHelperCallback.serializer
            o.toAnnotatedStringdefault r11 = r9._init_lambda4
            o.addSpans r11 = (o.addSpans) r11
            java.lang.String r0 = "WEB_CHAT_INVALID_VERIFICATION_TOKEN"
            r11.RemoteActionCompatParcelizer(r0, r10)
            return r6
        La2:
            boolean r10 = r11 instanceof o.ParagraphIntrinsicInfo
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.sendUpdatedVerificationToken$1(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final Object notifyBridgeMessageFailure(getPlaceholderRects getplaceholderrects, ContinuationImpl continuationImpl) {
        toLocal tolocal;
        int i = 2 % 2;
        int i2 = onBackPressedDispatcher_delegatelambda0 + 109;
        onBackPressedDispatcher_delegatelambda010 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!(!(continuationImpl instanceof toLocal))) {
            tolocal = (toLocal) continuationImpl;
            int i4 = tolocal.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tolocal.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                tolocal = new toLocal(this, continuationImpl);
            }
        } else {
            tolocal = new toLocal(this, continuationImpl);
        }
        Object obj = tolocal.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = tolocal.IconCompatParcelizer;
        try {
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessshouldAttachIndentationFixSpan accessshouldattachindentationfixspan = new accessshouldAttachIndentationFixSpan("HOST_ENCOUNTERED_ERROR_" + this.ensureViewModelStore.write.millis(), new accesstoLayoutLineBreakWordStylewPN0Rpw(new accesstoLayoutHyphenationFrequency3fSNIE("Failed to send bridge message: " + getplaceholderrects)));
                this.MediaMetadataCompat.getClass();
                String strRemoteActionCompatParcelizer = setWindowOffsetgyyYBs.write().RemoteActionCompatParcelizer(getSpanStylesOrNullui_text.RemoteActionCompatParcelizer, accessshouldattachindentationfixspan);
                BufferedChannel bufferedChannel = this.write;
                tolocal.IconCompatParcelizer = 1;
                if (bufferedChannel.serializer((Object) strRemoteActionCompatParcelizer, (ShortNewsContentCardView) tolocal) == coroutineSingletons) {
                    int i6 = onBackPressedDispatcher_delegatelambda0 + 51;
                    int i7 = i6 % Fields.SpotShadowColor;
                    onBackPressedDispatcher_delegatelambda010 = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 65;
                    onBackPressedDispatcher_delegatelambda0 = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        int i10 = 90 / 0;
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i11 = onBackPressedDispatcher_delegatelambda010 + 47;
                onBackPressedDispatcher_delegatelambda0 = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (Exception e) {
            ((addSpans) this._init_lambda4).serializer(fromHtml.ERROR, "selfServiceChat", "Failed to send error message for bridge failure", e);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (r4.serializer((java.lang.Object) r10, (o.ShortNewsContentCardView) r1) == r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (notifyBridgeMessageFailure(r9, r1) == r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendMessage(o.getPlaceholderRects r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r10 instanceof o.ParagraphIntrinsicsdefault
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L18
            r1 = r10
            o.ParagraphIntrinsicsdefault r1 = (o.ParagraphIntrinsicsdefault) r1
            int r3 = r1.serializer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 + r4
            r1.serializer = r3
            goto L26
        L18:
            o.ParagraphIntrinsicsdefault r1 = new o.ParagraphIntrinsicsdefault
            r1.<init>(r8, r10)
            int r10 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda0
            int r10 = r10 + 9
            int r3 = r10 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda010 = r3
            int r10 = r10 % r0
        L26:
            java.lang.Object r10 = r1.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.serializer
            r5 = 0
            if (r4 == 0) goto L4e
            if (r4 == r2) goto L47
            int r9 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda010
            int r9 = r9 + 85
            int r1 = r9 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda0 = r1
            int r9 = r9 % r0
            if (r4 != r0) goto L41
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto Lc5
        L41:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r5
        L47:
            o.getPlaceholderRects r9 = r1.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Exception -> L96
            goto Lc5
        L4e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            o.accessisSetgyyYBs r10 = r8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM     // Catch: java.lang.Exception -> L96
            o.removeScheduledCallback r10 = r10.serializer()     // Catch: java.lang.Exception -> L96
            o.removeScheduledCallback r4 = o.removeScheduledCallback.FULL_PRELOAD     // Catch: java.lang.Exception -> L96
            if (r10 != r4) goto L77
            int r10 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda010
            int r10 = r10 + 21
            int r2 = r10 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.onBackPressedDispatcher_delegatelambda0 = r2
            int r10 = r10 % r0
            if (r10 != 0) goto L6c
            o.getHasStaleResolvedFonts r10 = r8.MediaSessionCompatQueueItem     // Catch: java.lang.Exception -> L96
            r10.IconCompatParcelizer(r9)     // Catch: java.lang.Exception -> L96
            goto Lc5
        L6c:
            o.getHasStaleResolvedFonts r10 = r8.MediaSessionCompatQueueItem     // Catch: java.lang.Exception -> L96
            r10.IconCompatParcelizer(r9)     // Catch: java.lang.Exception -> L96
            r5.hashCode()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L96
            throw r5     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L96
        L75:
            r9 = move-exception
            throw r9
        L77:
            io.sentry.util.MediaBrowserCompatMediaItem r10 = r8.MediaMetadataCompat     // Catch: java.lang.Exception -> L96
            r10.getClass()     // Catch: java.lang.Exception -> L96
            r9.getClass()     // Catch: java.lang.Exception -> L96
            o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r10 = o.setWindowOffsetgyyYBs.write()     // Catch: java.lang.Exception -> L96
            o.getSpanStylesOrNullui_text r4 = o.getSpanStylesOrNullui_text.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> L96
            java.lang.String r10 = r10.RemoteActionCompatParcelizer(r4, r9)     // Catch: java.lang.Exception -> L96
            kotlinx.coroutines.channels.BufferedChannel r4 = r8.write     // Catch: java.lang.Exception -> L96
            r1.write = r9     // Catch: java.lang.Exception -> L96
            r1.serializer = r2     // Catch: java.lang.Exception -> L96
            java.lang.Object r9 = r4.serializer(r10, r1)     // Catch: java.lang.Exception -> L96
            if (r9 != r3) goto Lc5
            goto Lc4
        L96:
            r10 = move-exception
            o.fromHtml r2 = o.fromHtml.ERROR
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to send bridge message: "
            r4.<init>(r6)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            o.toAnnotatedStringdefault r6 = r8._init_lambda4
            o.addSpans r6 = (o.addSpans) r6
            java.lang.String r7 = "selfServiceChat"
            r6.serializer(r2, r7, r4, r10)
            boolean r10 = r8.MediaDescriptionCompat()
            if (r10 == 0) goto Lc5
            boolean r10 = r9 instanceof o.accessshouldAttachIndentationFixSpan
            if (r10 != 0) goto Lc5
            r1.write = r5
            r1.serializer = r0
            java.lang.Object r9 = r8.notifyBridgeMessageFailure(r9, r1)
            if (r9 != r3) goto Lc5
        Lc4:
            return r3
        Lc5:
            o.createFromParcel r9 = o.createFromParcel.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.sendMessage(o.getPlaceholderRects, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
    
        if (r12 == r3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$resolveLocalOrCdnUrl(com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.access$resolveLocalOrCdnUrl(com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01c3  */
    public static final Object access$handleMessage(WebChatViewModel webChatViewModel, updateOffsetsLDcG7Xg updateoffsetsldcg7xg, ContinuationImpl continuationImpl) {
        Object obj;
        boolean z;
        Object obj2;
        Object obj3;
        int i = 2 % 2;
        processingInstruction processinginstruction = webChatViewModel.ensureViewModelStore;
        ChatViewData chatViewData = webChatViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        MutableStateFlow mutableStateFlow = webChatViewModel.serializer;
        minIntrinsicWidth_delegatelambda0 minintrinsicwidth_delegatelambda0 = webChatViewModel.addObserverForBackInvoker;
        boolean z2 = updateoffsetsldcg7xg instanceof getOverflowgIe3tQ8;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (z2) {
            Object objOnInitStarted$1 = webChatViewModel.onInitStarted$1(continuationImpl);
            if (objOnInitStarted$1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objOnInitStarted$1;
            }
        } else {
            int i2 = 4;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (updateoffsetsldcg7xg instanceof getMinIntrinsicWidth) {
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = webChatViewModel.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    int i3 = onBackPressedDispatcher_delegatelambda0 + 73;
                    onBackPressedDispatcher_delegatelambda010 = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                IconCompatParcelizer(1681248497, new Object[]{webChatViewModel, new WebChatViewModel$fetchChatUrl$1.AnonymousClass2(webChatViewModel, shortNewsContentCardView, i2)}, GpsRtiItem.write(), -1681248494, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                minintrinsicwidth_delegatelambda0.read();
                asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewModel);
                ((inCompatibilityMode) webChatViewModel.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg).getClass();
                webChatViewModel.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer.plus(new findParagraphByIndexlambda20(webChatViewModel, 1)), null, new RemoteFunctionKt$onRemoteFunction$1(webChatViewModel, null), 2);
                do {
                    obj3 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj3, null, true, false, null, false, false, 53)));
            } else if (updateoffsetsldcg7xg instanceof getLineTop) {
                IconCompatParcelizer(1681248497, new Object[]{webChatViewModel, new WebChatViewModel$fetchChatUrl$1.AnonymousClass2(webChatViewModel, shortNewsContentCardView, 5)}, GpsRtiItem.write(), -1681248494, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                do {
                    obj2 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj2, null, false, false, toGlobalLineIndex.write, false, false, 48)));
            } else if (updateoffsetsldcg7xg instanceof getCursorRect) {
                int i5 = onBackPressedDispatcher_delegatelambda0 + 109;
                onBackPressedDispatcher_delegatelambda010 = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                Object objOnCloseRequested = webChatViewModel.onCloseRequested(updateoffsetsldcg7xg, continuationImpl);
                if (objOnCloseRequested == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objOnCloseRequested;
                }
            } else if (!(!(updateoffsetsldcg7xg instanceof getLineEllipsisOffsetui_text))) {
                Object objSendMessage = webChatViewModel.sendMessage(updateoffsetsldcg7xg.write(), continuationImpl);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objSendMessage != coroutineSingletons) {
                    objSendMessage = createfromparcel;
                }
                if (objSendMessage == coroutineSingletons) {
                    return objSendMessage;
                }
            } else {
                if (!(updateoffsetsldcg7xg instanceof getLineStart)) {
                    if (!(updateoffsetsldcg7xg instanceof getLastInvokeMillis) && !(updateoffsetsldcg7xg instanceof setWindowSize)) {
                        if (updateoffsetsldcg7xg instanceof fire9b9wPM) {
                            Object objSendMessage2 = webChatViewModel.sendMessage(webChatViewModel.accessensureViewModelStore.IconCompatParcelizer(serializer(chatViewData.RemoteActionCompatParcelizer)), continuationImpl);
                            if (objSendMessage2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                int i7 = onBackPressedDispatcher_delegatelambda0 + 95;
                                onBackPressedDispatcher_delegatelambda010 = i7 % Fields.SpotShadowColor;
                                int i8 = i7 % 2;
                                return objSendMessage2;
                            }
                        } else {
                            if (updateoffsetsldcg7xg instanceof rectInfoForDg36KO4) {
                                webChatViewModel.read(new copyxPh5V4gdefault(((rectInfoForDg36KO4) updateoffsetsldcg7xg).payload.translationEnabled));
                                return createfromparcel;
                            }
                            if (updateoffsetsldcg7xg instanceof AndroidParagraph) {
                                webChatViewModel.createFullyDrawnExecutor.RemoteActionCompatParcelizer.put(Long.valueOf(chatViewData.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem), Long.valueOf(processinginstruction.write.millis()));
                                webChatViewModel.read(new ParagraphStyle(((AndroidParagraph) updateoffsetsldcg7xg).payload.phoneNumber));
                                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewModel), new findParagraphByIndexlambda20(webChatViewModel, 1), null, new WebChatViewModel$handleMessage$3((ShortNewsContentCardView) null, webChatViewModel, updateoffsetsldcg7xg), 2);
                                return createfromparcel;
                            }
                            if (updateoffsetsldcg7xg instanceof getShaderBrushSpans) {
                                webChatViewModel.read(copyciSxzs0default.IconCompatParcelizer);
                                return createfromparcel;
                            }
                            if (updateoffsetsldcg7xg instanceof getCharSequenceui_textannotations) {
                                getHasNonTranslationComponents gethasnontranslationcomponents = webChatViewModel.MediaSessionCompatResultReceiverWrapper;
                                gethasnontranslationcomponents.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery Chat", null);
                                gethasnontranslationcomponents.MediaBrowserCompatMediaItem.getClass();
                                WebViewManager webViewManager = webChatViewModel.onBackPressedInput_delegatelambda0;
                                if (webViewManager.RatingCompat.serializer() != removeScheduledCallback.NO_PRELOADING) {
                                    int i9 = onBackPressedDispatcher_delegatelambda0 + 121;
                                    onBackPressedDispatcher_delegatelambda010 = i9 % Fields.SpotShadowColor;
                                    int i10 = i9 % 2;
                                    z = webViewManager.MediaDescriptionCompat ? false : true;
                                }
                                webChatViewModel.read(new copyElsmlbkdefault(z));
                                return createfromparcel;
                            }
                            if (updateoffsetsldcg7xg instanceof fillBoundingBoxes8ffj60Q) {
                                webChatViewModel.PlaybackStateCompat.RemoteActionCompatParcelizer.put(Long.valueOf(chatViewData.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem), Long.valueOf(processinginstruction.write.millis()));
                                webChatViewModel.read(copyciSxzs0default.RemoteActionCompatParcelizer);
                                return createfromparcel;
                            }
                            if (updateoffsetsldcg7xg instanceof getHorizontalPosition) {
                                webChatViewModel.read(new copyNH1kkwUdefault(((getHorizontalPosition) updateoffsetsldcg7xg).payload.selectedQuickReply));
                                return createfromparcel;
                            }
                            if (updateoffsetsldcg7xg instanceof getLineEllipsisCountui_text) {
                                IconCompatParcelizer(1681248497, new Object[]{webChatViewModel, new WebChatViewModel$handleMessage$3(updateoffsetsldcg7xg, webChatViewModel, (ShortNewsContentCardView) null)}, GpsRtiItem.write(), -1681248494, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                                return createfromparcel;
                            }
                            if (!(updateoffsetsldcg7xg instanceof getRangeForRect86BmAI)) {
                                int i11 = onBackPressedDispatcher_delegatelambda0 + 17;
                                int i12 = i11 % Fields.SpotShadowColor;
                                onBackPressedDispatcher_delegatelambda010 = i12;
                                int i13 = i11 % 2;
                                if (!(!(updateoffsetsldcg7xg instanceof ToggleableState))) {
                                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = webChatViewModel.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                                    }
                                    do {
                                        obj = mutableStateFlow.read();
                                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj, null, false, false, null, false, false, 59)));
                                    getInfoListui_text getinfolistui_text = (getInfoListui_text) webChatViewModel.PlaybackStateCompatCustomAction;
                                    getinfolistui_text.write("chat_e2e_tap_to_page_loaded");
                                    getinfolistui_text.write("chat_web_start_to_rendered");
                                    if (getinfolistui_text.serializer()) {
                                        getTransaction gettransaction = getinfolistui_text.write;
                                        if (gettransaction != null) {
                                            int i14 = onBackPressedDispatcher_delegatelambda0 + 125;
                                            onBackPressedDispatcher_delegatelambda010 = i14 % Fields.SpotShadowColor;
                                            if (i14 % 2 == 0) {
                                                gettransaction.RemoteActionCompatParcelizer();
                                                shortNewsContentCardView.hashCode();
                                                throw null;
                                            }
                                            gettransaction.RemoteActionCompatParcelizer();
                                        }
                                        getinfolistui_text.MediaMetadataCompat.clear();
                                        getinfolistui_text.write = null;
                                    }
                                    if (PreviewBlackScreenQuirk.read(webChatViewModel.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer())) {
                                        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewModel), new Paragraphdefault(toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewModel), webChatViewModel, 3), null, new BridgeManager$trackEvent$2(new WebChatViewModel$fetchChatUrl$1.AnonymousClass2(webChatViewModel, shortNewsContentCardView, 9), webChatViewModel, shortNewsContentCardView, i2), 2);
                                    }
                                    if (!webChatViewModel.menuHostHelperlambda0) {
                                        int i15 = onBackPressedDispatcher_delegatelambda010 + 3;
                                        onBackPressedDispatcher_delegatelambda0 = i15 % Fields.SpotShadowColor;
                                        int i16 = i15 % 2;
                                        minintrinsicwidth_delegatelambda0.RemoteActionCompatParcelizer();
                                        toLayoutLineBreakWordStylewPN0Rpw tolayoutlinebreakwordstylewpn0rpwRemoteActionCompatParcelizer = minintrinsicwidth_delegatelambda0.RemoteActionCompatParcelizer(false);
                                        if (tolayoutlinebreakwordstylewpn0rpwRemoteActionCompatParcelizer != null) {
                                            int i17 = onBackPressedDispatcher_delegatelambda0 + 111;
                                            onBackPressedDispatcher_delegatelambda010 = i17 % Fields.SpotShadowColor;
                                            int i18 = i17 % 2;
                                            Object objSendMessage3 = webChatViewModel.sendMessage(tolayoutlinebreakwordstylewpn0rpwRemoteActionCompatParcelizer, continuationImpl);
                                            if (objSendMessage3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                return objSendMessage3;
                                            }
                                        }
                                    }
                                } else {
                                    if (!(updateoffsetsldcg7xg instanceof getLineHeight)) {
                                        if (!(updateoffsetsldcg7xg instanceof getRangeForRect_8_6BmAIlambda0)) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            return null;
                                        }
                                        SharedResourcePool sharedResourcePool = webChatViewModel.RemoteActionCompatParcelizer;
                                        hasSpan hasspan = ((getRangeForRect_8_6BmAIlambda0) updateoffsetsldcg7xg).payload;
                                        sharedResourcePool.serializer(new setEndLineIndex(hasspan.latitude, hasspan.longitude));
                                        return createfromparcel;
                                    }
                                    int i19 = i12 + 73;
                                    onBackPressedDispatcher_delegatelambda0 = i19 % Fields.SpotShadowColor;
                                    if (i19 % 2 != 0) {
                                        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) webChatViewModel.ResultReceiver).serializer;
                                        firebaseRemoteConfigImpl.getClass();
                                        firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_CHAT_TOKEN_REFRESH_ENABLED);
                                        shortNewsContentCardView.hashCode();
                                        throw null;
                                    }
                                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) webChatViewModel.ResultReceiver).serializer;
                                    firebaseRemoteConfigImpl2.getClass();
                                    if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_CHAT_TOKEN_REFRESH_ENABLED)) {
                                        H$b h$b = webChatViewModel.fullyDrawnReporter_delegatelambda00;
                                        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) h$b.write, null, null, new DiskLruCache$launchCleanup$1(h$b, shortNewsContentCardView, 22), 3);
                                        return createfromparcel;
                                    }
                                    Object objSendUpdatedVerificationToken$1 = webChatViewModel.sendUpdatedVerificationToken$1((String) webChatViewModel.IconCompatParcelizer.read(), continuationImpl);
                                    if (objSendUpdatedVerificationToken$1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        return objSendUpdatedVerificationToken$1;
                                    }
                                }
                            }
                        }
                    }
                    return createfromparcel;
                }
                Object objOnHelpCenterWontHandleBackNavigation = webChatViewModel.onHelpCenterWontHandleBackNavigation(updateoffsetsldcg7xg, continuationImpl);
                if (objOnHelpCenterWontHandleBackNavigation == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    int i20 = onBackPressedDispatcher_delegatelambda0 + 75;
                    onBackPressedDispatcher_delegatelambda010 = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 != 0) {
                        return objOnHelpCenterWontHandleBackNavigation;
                    }
                    throw null;
                }
            }
        }
        return createfromparcel;
    }

    public final void serializer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int iWrite = GpsRtiItem.write();
        IconCompatParcelizer(1681248497, new Object[]{this, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0}, GpsRtiItem.write(), -1681248494, GpsRtiItem.write(), iWrite, GpsRtiItem.write());
    }

    public final void MediaSessionCompatResultReceiverWrapper() {
        int iWrite = GpsRtiItem.write();
        IconCompatParcelizer(416714492, new Object[]{this}, GpsRtiItem.write(), -416714491, GpsRtiItem.write(), iWrite, GpsRtiItem.write());
    }

    public final void write(String str) {
        int iWrite = GpsRtiItem.write();
        IconCompatParcelizer(-1308807263, new Object[]{this, str}, GpsRtiItem.write(), 1308807265, GpsRtiItem.write(), iWrite, GpsRtiItem.write());
    }

    public final void read(Uri uri) {
        int iWrite = GpsRtiItem.write();
        IconCompatParcelizer(-718065053, new Object[]{this, uri}, GpsRtiItem.write(), 718065057, GpsRtiItem.write(), iWrite, GpsRtiItem.write());
    }

    public static final Bullet serializer(WebChatViewModel webChatViewModel) {
        int iWrite = GpsRtiItem.write();
        return (Bullet) IconCompatParcelizer(-1484783990, new Object[]{webChatViewModel}, GpsRtiItem.write(), 1484783990, GpsRtiItem.write(), iWrite, GpsRtiItem.write());
    }
}
