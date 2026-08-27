package com.roadrunner.customerchat.selfservice.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.BlockRunner;
import androidx.navigation.NavController$onBackPressedCallback$1;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.network.NetworkFetcher;
import coil3.util.UtilsKt;
import com.adjust.sdk.Constants;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.deliveryhero.chatui.view.util.DialogUtils$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.huawei.riemann.gnsslocation.core.bean.log.GpsRtiItem;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.auth.domain.token.GetAccessTokenUseCaseImpl;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.selfservice.data.cache.server.ChatAssetCacheLocalWebServer;
import com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData;
import com.roadrunner.customerchat.selfservice.presentation.screen.CustomerChatWebChatContainerKt;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.ui.common.base.BaseInjectionActivity;
import com.ui.common.extensions.ViewModelExtensionsKt$viewModelScoped$4$1;
import io.sentry.SentryUUID;
import io.sentry.util.UrlUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.net.ServerSocket;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.flow.Flow;
import o.ActualSweepGradientShader9KIMszo;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidSqliteDriverCallback;
import o.AnnotatedStringCompanion;
import o.AnnotatedStringRange;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.FocusListener;
import o.FocusManager;
import o.MultiParagraphKt;
import o.Paint29;
import o.PaintExtensions_androidKt;
import o.Paragraph;
import o.ParagraphDefaultImpls;
import o.ParagraphUdtVg6Adefault;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PreviewBlackScreenQuirk;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactory28;
import o.SweepGradientShader9KIMszodefault;
import o.accessanalyzeComponents58bKbWc;
import o.accessgetAboveBaselinecp;
import o.accessisSetgyyYBs;
import o.addSpans;
import o.copyElsmlbk;
import o.copyNH1kkwU;
import o.copyciSxzs0;
import o.copyxPh5V4g;
import o.copyykzQM6kdefault;
import o.createFromParcel;
import o.disableUseBoundsForWidth;
import o.displayInAppMessagelambda1;
import o.displayInAppMessagelambda10;
import o.extendWith;
import o.fastBinarySearch;
import o.fastZipWithNext;
import o.fillStringBounds;
import o.findParagraphByIndex;
import o.findParagraphByIndexlambda20;
import o.findParagraphByLineIndex;
import o.findParagraphByY;
import o.findParagraphsByRangeSbBc2M;
import o.fromHtml;
import o.getActiveFocusTargetNode;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getBitmapui_graphics;
import o.getBulletListSettingStackui_text;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getDefaultSizeXSAIIZE;
import o.getEndIndex;
import o.getEndLineIndex;
import o.getHasStaleResolvedFonts;
import o.getHyphensEaSxIns;
import o.getHyphensvmbZdU8;
import o.getInfoListui_text;
import o.getLineBreakLgCVezo;
import o.getParagraph;
import o.getPlaceholders;
import o.getPostalCode;
import o.getStartIndex;
import o.getStartLineIndex;
import o.getStripNonMetricAffectingCharSpansannotations;
import o.getTransaction;
import o.hasStringAnnotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.mapAnnotationsui_text;
import o.maxIntrinsicWidth_delegatelambda0;
import o.mergedefault;
import o.minIntrinsicWidth_delegatelambda0;
import o.onBackPressed;
import o.onMove;
import o.onPictureInPictureModeChanged;
import o.onViewAttachedToWindow;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE;
import o.registerInAppMessageManagerlambda0;
import o.registerOnChangedCallback;
import o.removeNodeAtDepth;
import o.removeScheduledCallback;
import o.setCarryoverInAppMessage;
import o.setEndLineIndex;
import o.setStartLineIndex;
import o.shouldIncreaseMaxIntrinsic;
import o.stripNonMetricAffectingCharacterStyleSpans;
import o.toAnnotatedStringdefault;
import o.toBitmapConfig1JJdX4A;
import o.toColorLong8_81llA;
import o.toGlobal;
import o.toGlobalIndex;
import o.toGlobalxdX6G0default;
import o.toLayoutLineBreakWordStylewPN0Rpw;
import o.updateAdidI;
import o.withBulletListo2QH7mI;
import org.tukaani.xz.delta.DeltaDecoder;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfServiceCustomerChatActivity extends BaseInjectionActivity {
    public static final findParagraphByLineIndex MediaBrowserCompatMediaItem = new findParagraphByLineIndex();
    private static int _init_lambda2 = 0;
    private static int _init_lambda3 = 1;
    private static int _init_lambda4 = 1;
    private static int accessensureViewModelStore;
    private static boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public minIntrinsicWidth_delegatelambda0 ComponentActivity;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public ChatAssetCacheManager MediaDescriptionCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public AnnotatedStringCompanion MediaSessionCompatQueueItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public toAnnotatedStringdefault MediaSessionCompatResultReceiverWrapper;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public shouldIncreaseMaxIntrinsic MediaSessionCompatToken;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public stripNonMetricAffectingCharacterStyleSpans ParcelableVolumeInfo;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public accessisSetgyyYBs PlaybackStateCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public registerOnChangedCallback PlaybackStateCompatCustomAction;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public getHasStaleResolvedFonts RatingCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public fastZipWithNext ResultReceiver;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public maxIntrinsicWidth_delegatelambda0 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public getHyphensEaSxIns r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public toGlobalIndex r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private ChatViewData r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private ValueCallback<Uri[]> r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public WebViewManager r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private final onViewDetachedFromWindowlambda1 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    private String r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private final onViewDetachedFromWindowlambda1 r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    private WebView r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    private final onViewDetachedFromWindowlambda1 r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new isAdapterPositionOnScreen(new accessgetAboveBaselinecp(6));
    private final onBackPressed r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = registerForActivityResult(new onPictureInPictureModeChanged(2), new RetryWithDelay$$ExternalSyntheticLambda1(5, this));

    /* JADX INFO: renamed from: com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity$onCreate$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes4.dex */
    public final class AnonymousClass3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int read = 1;
        private static int write;
        public final /* synthetic */ SelfServiceCustomerChatActivity IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public int serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = selfServiceCustomerChatActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = read + 87;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = this.RemoteActionCompatParcelizer;
            SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = this.IconCompatParcelizer;
            int i4 = 0;
            if (i3 == 0) {
                return new AnonymousClass3(selfServiceCustomerChatActivity, shortNewsContentCardView, i4);
            }
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(selfServiceCustomerChatActivity, shortNewsContentCardView, 1);
            int i5 = read + 21;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 41 / 0;
            }
            return anonymousClass3;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = read + 9;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 == 0) {
                return ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = read + 21;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = this.RemoteActionCompatParcelizer;
            Object obj2 = createFromParcel.INSTANCE;
            SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = this.IconCompatParcelizer;
            ShortNewsContentCardView shortNewsContentCardView = null;
            int i3 = 1;
            if (i2 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.serializer;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flow = ((WebChatViewModel) SelfServiceCustomerChatActivity.write(-197462709, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 197462724, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read())).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                ViewModelExtensionsKt$viewModelScoped$4$1 viewModelExtensionsKt$viewModelScoped$4$1 = new ViewModelExtensionsKt$viewModelScoped$4$1(i3, selfServiceCustomerChatActivity);
                this.serializer = 1;
                if (flow.collect(viewModelExtensionsKt$viewModelScoped$4$1, this) != coroutineSingletons) {
                    return obj2;
                }
                int i5 = write + 89;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 4;
                }
                return coroutineSingletons;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.serializer;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.CREATED;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(selfServiceCustomerChatActivity, shortNewsContentCardView, i3);
                this.serializer = 1;
                if (UrlUtils.repeatOnLifecycle(selfServiceCustomerChatActivity, tocolorlong8_81lla, anonymousClass3, this) == coroutineSingletons2) {
                    obj2 = coroutineSingletons2;
                }
            } else if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = write + 61;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 4 / 5;
                }
                obj2 = null;
            }
            int i10 = write + 61;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return obj2;
        }
    }

    public static /* synthetic */ Object write(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i | i2;
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = (~(i2 | i8)) | (~(i9 | i));
        int i12 = i + i4 + i5 + (1389894630 * i3) + ((-1243605516) * i6);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i) + 1335230464 + (862422157 * i4) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i5) + (1607991296 * i3) + ((-548405248) * i6) + ((-1553596416) * i13);
        int i15 = ((i * (-88671125)) - 261777699) + (i4 * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i5 * (-88671137)) + (i3 * (-349388198)) + (i6 * (-147040884)) + (i13 * 182059008);
        switch (i14 + (i15 * i15 * (-132513792))) {
            case 1:
                return RemoteActionCompatParcelizer(objArr);
            case 2:
                return write(objArr);
            case 3:
                return IconCompatParcelizer(objArr);
            case 4:
                SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
                Context context = (Context) objArr[1];
                int i16 = 2 % 2;
                int i17 = _init_lambda4 + 107;
                _init_lambda2 = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                FrameLayout frameLayoutRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(selfServiceCustomerChatActivity, context);
                int i19 = _init_lambda2 + 79;
                _init_lambda4 = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                return frameLayoutRemoteActionCompatParcelizer;
            case 5:
                return serializer(objArr);
            case 6:
                return read(objArr);
            case 7:
                return MediaSessionCompatQueueItem(objArr);
            case 8:
                return MediaBrowserCompatMediaItem(objArr);
            case 9:
                return RatingCompat(objArr);
            case 10:
                return MediaDescriptionCompat(objArr);
            case 11:
                return MediaMetadataCompat(objArr);
            case 12:
                return PlaybackStateCompatCustomAction(objArr);
            case 13:
                return ParcelableVolumeInfo(objArr);
            case 14:
                return MediaSessionCompatResultReceiverWrapper(objArr);
            case 15:
                return MediaSessionCompatToken(objArr);
            default:
                SelfServiceCustomerChatActivity selfServiceCustomerChatActivity2 = (SelfServiceCustomerChatActivity) objArr[0];
                int i21 = 2 % 2;
                int i22 = _init_lambda4 + 107;
                int i23 = i22 % Fields.SpotShadowColor;
                _init_lambda2 = i23;
                int i24 = i22 % 2;
                ValueCallback<Uri[]> valueCallback = selfServiceCustomerChatActivity2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                int i25 = i23 + 111;
                _init_lambda4 = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                return valueCallback;
        }
    }

    static {
        int i = accessensureViewModelStore + 15;
        _init_lambda3 = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = _init_lambda4;
        int i3 = i2 + 25;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int i4 = i2 + 41;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Boolean.valueOf(z);
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        ValueCallback<Uri[]> valueCallback = (ValueCallback) objArr[1];
        int i = 2 % 2;
        int i2 = _init_lambda2 + 79;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = valueCallback;
            return null;
        }
        selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = valueCallback;
        throw null;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = _init_lambda4 + 7;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            IconCompatParcelizer(selfServiceCustomerChatActivity, zBooleanValue);
            obj.hashCode();
            throw null;
        }
        IconCompatParcelizer(selfServiceCustomerChatActivity, zBooleanValue);
        int i3 = _init_lambda2 + 3;
        _init_lambda4 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object ParcelableVolumeInfo(Object[] objArr) {
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = _init_lambda2 + 41;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write(1724104963, new Object[]{selfServiceCustomerChatActivity, dialogInterface, Integer.valueOf(iIntValue)}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -1724104951, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
        int i4 = _init_lambda2 + 115;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void read(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, String str) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 13;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            selfServiceCustomerChatActivity.serializer(str);
        } else {
            selfServiceCustomerChatActivity.serializer(str);
            throw null;
        }
    }

    public static final /* synthetic */ void read(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, ParagraphDefaultImpls paragraphDefaultImpls) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 1;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            write(-1258078379, new Object[]{selfServiceCustomerChatActivity, paragraphDefaultImpls}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 1258078393, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
            int i3 = 16 / 0;
        } else {
            write(-1258078379, new Object[]{selfServiceCustomerChatActivity, paragraphDefaultImpls}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 1258078393, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
        }
        int i4 = _init_lambda4 + 43;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void serializer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, String str) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 83;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            selfServiceCustomerChatActivity.write(str);
        } else {
            selfServiceCustomerChatActivity.write(str);
            throw null;
        }
    }

    public static final /* synthetic */ void serializer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, copyxPh5V4g copyxph5v4g) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 75;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            write(2077310678, new Object[]{selfServiceCustomerChatActivity, copyxph5v4g}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -2077310670, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
            throw null;
        }
        write(2077310678, new Object[]{selfServiceCustomerChatActivity, copyxph5v4g}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -2077310670, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
        int i3 = _init_lambda2 + 75;
        _init_lambda4 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 105;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return MediaSessionCompatResultReceiverWrapper(selfServiceCustomerChatActivity);
        }
        int i3 = 56 / 0;
        return MediaSessionCompatResultReceiverWrapper(selfServiceCustomerChatActivity);
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, StaticLayoutFactory28 staticLayoutFactory28, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = _init_lambda4 + 35;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        createFromParcel createfromparcelOnCreate$lambda$0 = onCreate$lambda$0(selfServiceCustomerChatActivity, staticLayoutFactory28, dragAndDropTargetModifierNode, getbirthdatefull, i);
        int i5 = _init_lambda2 + 49;
        _init_lambda4 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcelOnCreate$lambda$0;
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, onViewAttachedToWindow onviewattachedtowindow) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 45;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            read(selfServiceCustomerChatActivity, onviewattachedtowindow);
            obj.hashCode();
            throw null;
        }
        createFromParcel createfromparcel = read(selfServiceCustomerChatActivity, onviewattachedtowindow);
        int i3 = _init_lambda4 + 77;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return createfromparcel;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Map MediaSessionCompatQueueItem(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 63;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        }
        int i3 = 35 / 0;
        return selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
    }

    private static /* synthetic */ Object MediaSessionCompatToken(Object[] objArr) {
        WebChatViewModel webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        int i = 2 % 2;
        int i2 = _init_lambda4 + 115;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            int i3 = 95 / 0;
        } else {
            webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
        int i4 = _init_lambda4 + 67;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        }
        throw null;
    }

    public static /* synthetic */ WebChatViewModel RemoteActionCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, getBitmapui_graphics getbitmapui_graphics) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 61;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return read(selfServiceCustomerChatActivity, getbitmapui_graphics);
        }
        read(selfServiceCustomerChatActivity, getbitmapui_graphics);
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        int i = 2 % 2;
        int i2 = _init_lambda4 + 89;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelPlaybackStateCompat = PlaybackStateCompat(selfServiceCustomerChatActivity);
        int i4 = _init_lambda2 + 33;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcelPlaybackStateCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Map RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 97;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Map mapComponentActivity = ComponentActivity();
        int i4 = _init_lambda2 + 83;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return mapComponentActivity;
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 57;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelMediaSessionCompatToken = MediaSessionCompatToken(selfServiceCustomerChatActivity);
        int i4 = _init_lambda4 + 123;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcelMediaSessionCompatToken;
    }

    public static /* synthetic */ copyykzQM6kdefault read(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 93;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        copyykzQM6kdefault copyykzqm6kdefaultMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(selfServiceCustomerChatActivity);
        int i4 = _init_lambda2 + 109;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return copyykzqm6kdefaultMediaBrowserCompatMediaItem;
    }

    public static /* synthetic */ createFromParcel serializer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 107;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            PlaybackStateCompatCustomAction(selfServiceCustomerChatActivity);
            throw null;
        }
        createFromParcel createfromparcelPlaybackStateCompatCustomAction = PlaybackStateCompatCustomAction(selfServiceCustomerChatActivity);
        int i3 = _init_lambda4 + 93;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return createfromparcelPlaybackStateCompatCustomAction;
    }

    public static /* synthetic */ createFromParcel serializer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, onViewAttachedToWindow onviewattachedtowindow, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = _init_lambda2 + 67;
        _init_lambda4 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        createFromParcel createfromparcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(selfServiceCustomerChatActivity, onviewattachedtowindow, getbirthdatefull, i);
        int i5 = _init_lambda4 + 121;
        _init_lambda2 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcelRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ createFromParcel write(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 43;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            ParcelableVolumeInfo(selfServiceCustomerChatActivity);
            obj.hashCode();
            throw null;
        }
        createFromParcel createfromparcelParcelableVolumeInfo = ParcelableVolumeInfo(selfServiceCustomerChatActivity);
        int i3 = _init_lambda2 + 85;
        _init_lambda4 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return createfromparcelParcelableVolumeInfo;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ createFromParcel write(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, getParagraph getparagraph) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 95;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcel = (createFromParcel) write(-1594423502, new Object[]{selfServiceCustomerChatActivity, getparagraph}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 1594423511, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
        int i4 = _init_lambda2 + 77;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public static /* synthetic */ createFromParcel write(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, onViewAttachedToWindow onviewattachedtowindow, FrameLayout frameLayout) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 89;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return RemoteActionCompatParcelizer(selfServiceCustomerChatActivity, onviewattachedtowindow, frameLayout);
        }
        createFromParcel createfromparcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(selfServiceCustomerChatActivity, onviewattachedtowindow, frameLayout);
        int i3 = 63 / 0;
        return createfromparcelRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ createFromParcel write(getStripNonMetricAffectingCharSpansannotations getstripnonmetricaffectingcharspansannotations, SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 89;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcel = (createFromParcel) write(-634525273, new Object[]{getstripnonmetricaffectingcharspansannotations, selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 634525275, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
        int i4 = _init_lambda4 + 97;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public SelfServiceCustomerChatActivity() {
        int i = 0;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(WebChatViewModel.class), new Paragraph(this, i), new AndroidSqliteDriverCallback(this, 3, new findParagraphsByRangeSbBc2M(this, i)), new Paragraph(this, 1));
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new isAdapterPositionOnScreen(new findParagraphByY(this, i));
    }

    private static final findParagraphByIndex IconCompatParcelizer(onViewAttachedToWindow onviewattachedtowindow) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 25;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        findParagraphByIndex findparagraphbyindex = (findParagraphByIndex) onviewattachedtowindow.getValue();
        int i4 = _init_lambda2 + 111;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return findparagraphbyindex;
    }

    private static final getParagraph read(onViewAttachedToWindow onviewattachedtowindow) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 45;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (getParagraph) onviewattachedtowindow.getValue();
        }
        int i3 = 45 / 0;
        return (getParagraph) onviewattachedtowindow.getValue();
    }

    private static final PaintExtensions_androidKt serializer(onViewAttachedToWindow onviewattachedtowindow) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 81;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PaintExtensions_androidKt paintExtensions_androidKt = (PaintExtensions_androidKt) onviewattachedtowindow.getValue();
        int i3 = _init_lambda4 + 73;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return paintExtensions_androidKt;
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        createFromParcel createfromparcel;
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        getParagraph getparagraph = (getParagraph) objArr[1];
        int i = 2 % 2;
        int i2 = _init_lambda2 + 101;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getparagraph.getClass();
            selfServiceCustomerChatActivity.read(getparagraph);
            createfromparcel = createFromParcel.INSTANCE;
            int i3 = 64 / 0;
        } else {
            getparagraph.getClass();
            selfServiceCustomerChatActivity.read(getparagraph);
            createfromparcel = createFromParcel.INSTANCE;
        }
        int i4 = _init_lambda2 + 53;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    private final copyykzQM6kdefault r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 73;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        copyykzQM6kdefault copyykzqm6kdefault = (copyykzQM6kdefault) this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatResultReceiverWrapper();
        int i4 = _init_lambda4 + 79;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return copyykzqm6kdefault;
    }

    private final WebChatViewModel r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        WebChatViewModel webChatViewModel;
        int i = 2 % 2;
        int i2 = _init_lambda2 + 37;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            webChatViewModel = (WebChatViewModel) this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaSessionCompatResultReceiverWrapper();
            int i3 = 9 / 0;
        } else {
            webChatViewModel = (WebChatViewModel) this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = _init_lambda4 + 41;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return webChatViewModel;
    }

    private final Map<String, String> r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 89;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Map<String, String> map = (Map) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatResultReceiverWrapper();
        int i3 = _init_lambda2 + 83;
        _init_lambda4 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return map;
        }
        throw null;
    }

    private static final copyykzQM6kdefault MediaBrowserCompatMediaItem(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        copyykzQM6kdefault copyykzqm6kdefault = new copyykzQM6kdefault(selfServiceCustomerChatActivity.getActivityResultRegistry());
        int i2 = _init_lambda2 + 95;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return copyykzqm6kdefault;
    }

    private static final createFromParcel MediaSessionCompatResultReceiverWrapper(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 119;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().serializer();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = _init_lambda2 + 75;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return createfromparcel;
    }

    private static final createFromParcel MediaSessionCompatToken(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 9;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().write();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = _init_lambda4 + 7;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final createFromParcel PlaybackStateCompatCustomAction(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 37;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            selfServiceCustomerChatActivity.getOnBackPressedDispatcher().IconCompatParcelizer();
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        selfServiceCustomerChatActivity.getOnBackPressedDispatcher().IconCompatParcelizer();
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i3 = _init_lambda4 + 9;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return createfromparcel2;
    }

    private static /* synthetic */ Object MediaSessionCompatQueueItem(Object[] objArr) {
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        int i = 2 % 2;
        int i2 = _init_lambda2 + 13;
        int i3 = i2 % Fields.SpotShadowColor;
        _init_lambda4 = i3;
        int i4 = i2 % 2;
        fastZipWithNext fastzipwithnext = selfServiceCustomerChatActivity.ResultReceiver;
        if (fastzipwithnext == null) {
            removeNodeAtDepth.serializer("glowBoxBannerUiModelFactory");
            throw null;
        }
        int i5 = i3 + 87;
        _init_lambda2 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return fastzipwithnext;
    }

    private static final FrameLayout RemoteActionCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, Context context) {
        int i = 2 % 2;
        context.getClass();
        FrameLayout frameLayout = new FrameLayout(context);
        selfServiceCustomerChatActivity.read(frameLayout);
        int i2 = _init_lambda4 + 81;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
        return frameLayout;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        int i = 2 % 2;
        int i2 = _init_lambda4;
        int i3 = i2 + 63;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getHyphensEaSxIns gethyphenseasxins = selfServiceCustomerChatActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (gethyphenseasxins == null) {
            removeNodeAtDepth.serializer("mapNavigator");
            throw null;
        }
        int i5 = i2 + 5;
        _init_lambda2 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return gethyphenseasxins;
    }

    private final void serializer(String str) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 71;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        toAnnotatedStringdefault.write(MediaSessionCompatQueueItem(), fromHtml.INFO, "WEB_PRELOADING", str);
        int i4 = _init_lambda4 + 9;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        o.removeNodeAtDepth.serializer("customerChatConfig");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = r2 + 89;
        com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda4 = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.registerOnChangedCallback MediaBrowserCompatMediaItem() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda4
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda2 = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L18
            o.registerOnChangedCallback r1 = r5.PlaybackStateCompatCustomAction
            r4 = 60
            int r4 = r4 / 0
            if (r1 == 0) goto L2a
            goto L1c
        L18:
            o.registerOnChangedCallback r1 = r5.PlaybackStateCompatCustomAction
            if (r1 == 0) goto L2a
        L1c:
            int r2 = r2 + 89
            int r4 = r2 % 128
            com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda4 = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L26
            return r1
        L26:
            r3.hashCode()
            throw r3
        L2a:
            java.lang.String r0 = "customerChatConfig"
            o.removeNodeAtDepth.serializer(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity.MediaBrowserCompatMediaItem():o.registerOnChangedCallback");
    }

    public final stripNonMetricAffectingCharacterStyleSpans MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = _init_lambda4;
        int i3 = i2 + 81;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        stripNonMetricAffectingCharacterStyleSpans stripnonmetricaffectingcharacterstylespans = this.ParcelableVolumeInfo;
        if (stripnonmetricaffectingcharacterstylespans == null) {
            removeNodeAtDepth.serializer("glowBoxBannerComposableFactory");
            throw null;
        }
        int i5 = i2 + 37;
        _init_lambda2 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stripnonmetricaffectingcharacterstylespans;
    }

    public final accessisSetgyyYBs MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 71;
        int i3 = i2 % Fields.SpotShadowColor;
        _init_lambda4 = i3;
        int i4 = i2 % 2;
        accessisSetgyyYBs accessissetgyyybs = this.PlaybackStateCompat;
        if (accessissetgyyybs == null) {
            removeNodeAtDepth.serializer("getChatPreloadingTestVariant");
            throw null;
        }
        int i5 = i3 + 69;
        _init_lambda2 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i3 + 109;
        _init_lambda2 = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return accessissetgyyybs;
    }

    public final toAnnotatedStringdefault MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = _init_lambda4;
        int i3 = i2 + 107;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        toAnnotatedStringdefault toannotatedstringdefault = this.MediaSessionCompatResultReceiverWrapper;
        if (toannotatedstringdefault == null) {
            removeNodeAtDepth.serializer("chatLogger");
            throw null;
        }
        int i5 = i2 + 115;
        _init_lambda2 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return toannotatedstringdefault;
    }

    public final minIntrinsicWidth_delegatelambda0 MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 41;
        int i3 = i2 % Fields.SpotShadowColor;
        _init_lambda2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        minIntrinsicWidth_delegatelambda0 minintrinsicwidth_delegatelambda0 = this.ComponentActivity;
        if (minintrinsicwidth_delegatelambda0 == null) {
            removeNodeAtDepth.serializer("performanceTracker");
            throw null;
        }
        int i4 = i3 + 39;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return minintrinsicwidth_delegatelambda0;
    }

    public final shouldIncreaseMaxIntrinsic MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = _init_lambda4;
        int i3 = i2 + 89;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        shouldIncreaseMaxIntrinsic shouldincreasemaxintrinsic = this.MediaSessionCompatToken;
        if (shouldincreasemaxintrinsic == null) {
            removeNodeAtDepth.serializer("glowBoxBannerContainerComposableFactory");
            throw null;
        }
        int i5 = i2 + 87;
        _init_lambda2 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return shouldincreasemaxintrinsic;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        o.removeNodeAtDepth.serializer("performanceLogger");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 93;
        com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda4 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.maxIntrinsicWidth_delegatelambda0 PlaybackStateCompat() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda2
            int r2 = r1 + 83
            int r3 = r2 % 128
            com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda4 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L18
            o.maxIntrinsicWidth_delegatelambda0 r2 = r5.r8lambda54BeH8ZsBru0CXI2CCSP2syNys
            r4 = 97
            int r4 = r4 / 0
            if (r2 == 0) goto L27
            goto L1c
        L18:
            o.maxIntrinsicWidth_delegatelambda0 r2 = r5.r8lambda54BeH8ZsBru0CXI2CCSP2syNys
            if (r2 == 0) goto L27
        L1c:
            int r1 = r1 + 93
            int r4 = r1 % 128
            com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda4 = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            return r2
        L26:
            throw r3
        L27:
            java.lang.String r0 = "performanceLogger"
            o.removeNodeAtDepth.serializer(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity.PlaybackStateCompat():o.maxIntrinsicWidth_delegatelambda0");
    }

    public final ChatAssetCacheManager RatingCompat() {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 103;
        int i3 = i2 % Fields.SpotShadowColor;
        _init_lambda2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ChatAssetCacheManager chatAssetCacheManager = this.MediaDescriptionCompat;
        if (chatAssetCacheManager == null) {
            removeNodeAtDepth.serializer("chatAssetCacheManager");
            throw null;
        }
        int i4 = i3 + 45;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return chatAssetCacheManager;
        }
        obj.hashCode();
        throw null;
    }

    public final getHasStaleResolvedFonts serializer() {
        int i = 2 % 2;
        getHasStaleResolvedFonts gethasstaleresolvedfonts = this.RatingCompat;
        if (gethasstaleresolvedfonts == null) {
            removeNodeAtDepth.serializer("bridgeManager");
            throw null;
        }
        int i2 = _init_lambda2 + 93;
        int i3 = i2 % Fields.SpotShadowColor;
        _init_lambda4 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 121;
        _init_lambda2 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return gethasstaleresolvedfonts;
    }

    public final AnnotatedStringCompanion write() {
        int i = 2 % 2;
        int i2 = _init_lambda4;
        int i3 = i2 + 79;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AnnotatedStringCompanion annotatedStringCompanion = this.MediaSessionCompatQueueItem;
        if (annotatedStringCompanion == null) {
            removeNodeAtDepth.serializer("cameraImageRepository");
            throw null;
        }
        int i4 = i2 + 75;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return annotatedStringCompanion;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        o.removeNodeAtDepth.serializer("webViewManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 23;
        com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda2 = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.roadrunner.customerchat.selfservice.presentation.WebViewManager ResultReceiver() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda2
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda4 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            com.roadrunner.customerchat.selfservice.presentation.WebViewManager r1 = r4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            r3 = 13
            int r3 = r3 / 0
            if (r1 == 0) goto L23
            goto L1b
        L17:
            com.roadrunner.customerchat.selfservice.presentation.WebViewManager r1 = r4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            if (r1 == 0) goto L23
        L1b:
            int r2 = r2 + 23
            int r3 = r2 % 128
            com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda2 = r3
            int r2 = r2 % r0
            return r1
        L23:
            java.lang.String r0 = "webViewManager"
            o.removeNodeAtDepth.serializer(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity.ResultReceiver():com.roadrunner.customerchat.selfservice.presentation.WebViewManager");
    }

    public final toGlobalIndex r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        int i = 2 % 2;
        int i2 = _init_lambda4;
        int i3 = i2 + 19;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        toGlobalIndex toglobalindex = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (toglobalindex == null) {
            removeNodeAtDepth.serializer("webChatViewModelFactory");
            throw null;
        }
        int i4 = i2 + 33;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return toglobalindex;
    }

    private final void r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
        int i = 2 % 2;
        getOnBackPressedDispatcher().read(new NavController$onBackPressedCallback$1(1, this), this);
        int i2 = _init_lambda2 + 13;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
    }

    private final boolean read(String str, String str2) {
        Boolean bool;
        int i = 2 % 2;
        int i2 = _init_lambda4 + 71;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            bool = (Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{IconCompatParcelizer(str), IconCompatParcelizer(str2)}, getCieXyz.write());
        } else {
            bool = (Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{IconCompatParcelizer(str), IconCompatParcelizer(str2)}, getCieXyz.write());
        }
        boolean z = !bool.booleanValue();
        int i3 = _init_lambda2 + 83;
        _init_lambda4 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return z;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        ValueCallback<Uri[]> valueCallback = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
            int i2 = _init_lambda2 + 121;
            _init_lambda4 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        int i4 = _init_lambda4 + 59;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private final boolean serializer(mergedefault mergedefaultVar) {
        int i = 2 % 2;
        if ((!(mergedefaultVar instanceof copyElsmlbk) && !(mergedefaultVar instanceof getLineBreakLgCVezo)) || FocusListener.write(this, "android.permission.CAMERA") == 0) {
            return false;
        }
        int i2 = _init_lambda4 + 11;
        int i3 = i2 % Fields.SpotShadowColor;
        _init_lambda2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        _init_lambda4 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static /* synthetic */ Object PlaybackStateCompatCustomAction(Object[] objArr) {
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        selfServiceCustomerChatActivity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", selfServiceCustomerChatActivity.getPackageName(), null)));
        int i2 = _init_lambda2 + 99;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
        return null;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 11;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            bundle.getClass();
            super.onSaveInstanceState(bundle);
            bundle.putString("KEY_CAMERA_IMAGE_PATH", ((AnnotatedStringRange) write()).serializer());
            int i3 = 36 / 0;
        } else {
            bundle.getClass();
            super.onSaveInstanceState(bundle);
            bundle.putString("KEY_CAMERA_IMAGE_PATH", ((AnnotatedStringRange) write()).serializer());
        }
        int i4 = _init_lambda4 + 17;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final WebChatViewModel read(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, getBitmapui_graphics getbitmapui_graphics) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 31;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getbitmapui_graphics.getClass();
        toGlobalIndex toglobalindexR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = selfServiceCustomerChatActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        ChatViewData chatViewData = selfServiceCustomerChatActivity.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (chatViewData == null) {
            removeNodeAtDepth.serializer("chatViewData");
            throw null;
        }
        WebChatViewModel webChatViewModel = ((ParagraphUdtVg6Adefault) toglobalindexR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).read(chatViewData);
        int i4 = _init_lambda4 + 33;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return webChatViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047 A[PHI: r1
  0x0047: PHI (r1v8 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel) = 
  (r1v5 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel)
  (r1v10 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel)
 binds: [B:8:0x0036, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0038 A[PHI: r1
  0x0038: PHI (r1v6 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel) = 
  (r1v5 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel)
  (r1v10 com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel)
 binds: [B:8:0x0036, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        WebChatViewModel webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = _init_lambda4 + 83;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            super.onStart();
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().PlaybackStateCompat();
            webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
                i = _init_lambda2 + 19;
                _init_lambda4 = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i4 = 3 / 2;
                }
                z = true;
            } else {
                int i5 = _init_lambda4 + 111;
                _init_lambda2 = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = false;
            }
        } else {
            super.onStart();
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().PlaybackStateCompat();
            webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
                i = _init_lambda2 + 19;
                _init_lambda4 = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i7 = 3 / 2;
                }
                z = true;
            } else {
                int i8 = _init_lambda4 + 111;
                _init_lambda2 = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                z = false;
            }
        }
        webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write(true, z);
    }

    private final void write(String str) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 123;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        WebView webView = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (webView != null) {
            webView.evaluateJavascript("window.sendBridgeMessageFromAndroid(" + str + ")", null);
        }
        int i3 = _init_lambda4 + 77;
        _init_lambda2 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final createFromParcel ParcelableVolumeInfo(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 97;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        WebChatViewModel webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        ChatViewData chatViewData = selfServiceCustomerChatActivity.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (chatViewData == null) {
            removeNodeAtDepth.serializer("chatViewData");
            throw null;
        }
        webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.serializer(chatViewData.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(), false);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = _init_lambda2 + 5;
        _init_lambda4 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return o.createFromParcel.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        o.removeNodeAtDepth.serializer("chatViewData");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r3 = com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda4 + 93;
        com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda2 = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
        r1.serializer(r5.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(), true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.createFromParcel PlaybackStateCompat(com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda2
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda4 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L1a
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel r1 = r5.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()
            com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData r5 = r5.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss
            int r3 = r2 / 0
            if (r5 == 0) goto L39
            goto L22
        L1a:
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel r1 = r5.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()
            com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData r5 = r5.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss
            if (r5 == 0) goto L39
        L22:
            int r3 = com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda4
            int r3 = r3 + 93
            int r4 = r3 % 128
            com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity._init_lambda2 = r4
            int r3 = r3 % r0
            com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData$Delivery r5 = r5.RemoteActionCompatParcelizer()
            java.lang.String r5 = r5.RemoteActionCompatParcelizer()
            r1.serializer(r5, r2)
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            return r5
        L39:
            java.lang.String r5 = "chatViewData"
            o.removeNodeAtDepth.serializer(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity.PlaybackStateCompat(com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity):o.createFromParcel");
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getStripNonMetricAffectingCharSpansannotations getstripnonmetricaffectingcharspansannotations = (getStripNonMetricAffectingCharSpansannotations) objArr[0];
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[1];
        int i = 2 % 2;
        StaticLayoutFactory28 staticLayoutFactory28 = (StaticLayoutFactory28) getstripnonmetricaffectingcharspansannotations;
        staticLayoutFactory28.MediaSessionCompatResultReceiverWrapper.serializer();
        staticLayoutFactory28.RemoteActionCompatParcelizer(extendWith.serializer);
        BuildersKt.RemoteActionCompatParcelizer(staticLayoutFactory28.read, null, null, new ClearDataUseCaseImpl$invoke$2(staticLayoutFactory28, (ShortNewsContentCardView) null, 21), 3);
        selfServiceCustomerChatActivity.finish();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = _init_lambda4 + 55;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
        return createfromparcel;
    }

    private final ChatViewData r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 37;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            ChatViewData chatViewData = (ChatViewData) FocusManager.serializer(getIntent(), "EXTRA_CHAT_VIEW_DATA", ChatViewData.class);
            int i4 = _init_lambda2 + 21;
            _init_lambda4 = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
            return chatViewData;
        } catch (Exception e) {
            ((addSpans) MediaSessionCompatQueueItem()).serializer(fromHtml.ERROR, "WEB_CHAT_OPEN_ERROR", "Failed to deserialize ChatViewData from intent extras.", e);
            return null;
        }
    }

    private final void read(Bundle bundle) {
        int i = 2 % 2;
        if (bundle != null) {
            int i2 = _init_lambda4 + 37;
            _init_lambda2 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (bundle.containsKey("KEY_CAMERA_IMAGE_PATH")) {
                int i4 = _init_lambda2 + 31;
                _init_lambda4 = i4 % Fields.SpotShadowColor;
                Object obj = null;
                if (i4 % 2 != 0) {
                    String string = bundle.getString("KEY_CAMERA_IMAGE_PATH");
                    if (string == null) {
                        string = "";
                    }
                    if (string.length() > 0) {
                        int i5 = _init_lambda4 + 91;
                        _init_lambda2 = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            ((AnnotatedStringRange) write()).serializer(string);
                            return;
                        } else {
                            ((AnnotatedStringRange) write()).serializer(string);
                            obj.hashCode();
                            throw null;
                        }
                    }
                    return;
                }
                bundle.getString("KEY_CAMERA_IMAGE_PATH");
                obj.hashCode();
                throw null;
            }
        }
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        int i = 2 % 2;
        int i2 = _init_lambda2 + 19;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            selfServiceCustomerChatActivity.ResultReceiver().RatingCompat.serializer();
            removeScheduledCallback removescheduledcallback = removeScheduledCallback.NO_PRELOADING;
            obj.hashCode();
            throw null;
        }
        WebViewManager webViewManagerResultReceiver = selfServiceCustomerChatActivity.ResultReceiver();
        if (webViewManagerResultReceiver.RatingCompat.serializer() != removeScheduledCallback.NO_PRELOADING && !webViewManagerResultReceiver.MediaDescriptionCompat) {
            int i3 = _init_lambda4 + 19;
            _init_lambda2 = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 96 / 0;
            }
            return null;
        }
        WebViewManager webViewManagerResultReceiver2 = selfServiceCustomerChatActivity.ResultReceiver();
        DeferredCoroutine deferredCoroutine = webViewManagerResultReceiver2.MediaMetadataCompat;
        if (deferredCoroutine != null) {
            deferredCoroutine.write((CancellationException) null);
        }
        webViewManagerResultReceiver2.MediaMetadataCompat = null;
        webViewManagerResultReceiver2.MediaDescriptionCompat = false;
        int i5 = _init_lambda4 + 111;
        _init_lambda2 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        boolean z;
        int i = 2 % 2;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().ParcelableVolumeInfo();
        WebChatViewModel webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
            int i2 = _init_lambda4 + 43;
            _init_lambda2 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = _init_lambda4 + 13;
            _init_lambda2 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = false;
        }
        webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write(false, z);
        ((getInfoListui_text) PlaybackStateCompat()).read();
        super.onStop();
    }

    private final void read(String str) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 55;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = str;
        ResultReceiver().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        ((getInfoListui_text) PlaybackStateCompat()).write("chat_native_before_load_url");
        ((getInfoListui_text) PlaybackStateCompat()).serializer("chat_native_after_load_url");
        WebView webView = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (webView != null) {
            int i4 = _init_lambda2 + 53;
            _init_lambda4 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            webView.loadUrl(str);
            int i6 = _init_lambda2 + 39;
            _init_lambda4 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    private static final void IconCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, boolean z) {
        int i = 2 % 2;
        Object obj = null;
        if (z) {
            mergedefault mergedefaultVar = selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().read();
            if (mergedefaultVar != null) {
                int i2 = _init_lambda2 + 41;
                _init_lambda4 = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    selfServiceCustomerChatActivity.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg().RemoteActionCompatParcelizer(selfServiceCustomerChatActivity, mergedefaultVar);
                    return;
                } else {
                    selfServiceCustomerChatActivity.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg().RemoteActionCompatParcelizer(selfServiceCustomerChatActivity, mergedefaultVar);
                    obj.hashCode();
                    throw null;
                }
            }
            return;
        }
        if (!selfServiceCustomerChatActivity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            int i3 = _init_lambda2 + 69;
            _init_lambda4 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            selfServiceCustomerChatActivity.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        }
        ValueCallback<Uri[]> valueCallback = selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (valueCallback != null) {
            int i5 = _init_lambda2 + 115;
            _init_lambda4 = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            valueCallback.onReceiveValue(null);
        }
        selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
    }

    private static final Map ComponentActivity() {
        int i = 2 % 2;
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("Access-Control-Allow-Origin", "*"), new onViewAttachedToWindowlambda0("Access-Control-Allow-Methods", "GET, OPTIONS"), new onViewAttachedToWindowlambda0("Access-Control-Allow-Headers", "*"), new onViewAttachedToWindowlambda0("Cache-Control", "public, max-age=31536000, immutable"));
        int i2 = _init_lambda2 + 75;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return mapRemoteActionCompatParcelizer;
        }
        throw null;
    }

    private static final createFromParcel RemoteActionCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, onViewAttachedToWindow onviewattachedtowindow, FrameLayout frameLayout) {
        boolean z;
        int i = 2 % 2;
        frameLayout.getClass();
        String strRemoteActionCompatParcelizer = read(onviewattachedtowindow).RemoteActionCompatParcelizer();
        int i2 = 4;
        if (strRemoteActionCompatParcelizer == null) {
            z = false;
        } else {
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strRemoteActionCompatParcelizer)) {
                int i3 = _init_lambda4 + 43;
                _init_lambda2 = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 2 / 4;
                }
            } else {
                z = true;
                if (!read(onviewattachedtowindow).serializer()) {
                    int i5 = _init_lambda4 + 73;
                    _init_lambda2 = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                    }
                }
            }
            z = false;
        }
        WebView webView = selfServiceCustomerChatActivity.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (webView != null) {
            if (z) {
                int i6 = _init_lambda4 + 93;
                _init_lambda2 = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 72 / 0;
                }
                i2 = 0;
            }
            webView.setVisibility(i2);
        }
        return createFromParcel.INSTANCE;
    }

    private final String IconCompatParcelizer(String str) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = _init_lambda2 + 53;
            _init_lambda4 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                try {
                    String encodedPath = Uri.parse(str).getEncodedPath();
                    if (encodedPath == null) {
                        int i4 = _init_lambda2 + 113;
                        _init_lambda4 = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        encodedPath = "/";
                    }
                    return (encodedPath.length() <= 1 || !hideCurrentlyDisplayingInAppMessage.write((CharSequence) encodedPath, '/')) ? encodedPath : encodedPath.substring(0, encodedPath.length() - 1);
                } catch (Throwable unused) {
                }
            }
        }
        int i6 = _init_lambda2 + 41;
        _init_lambda4 = i6 % Fields.SpotShadowColor;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void read(getParagraph getparagraph) {
        String url;
        int i = 2 % 2;
        removeScheduledCallback removescheduledcallbackSerializer = MediaMetadataCompat().serializer();
        WebView webView = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        Object obj = null;
        if (webView != null) {
            int i2 = _init_lambda4 + 3;
            _init_lambda2 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                webView.getUrl();
                obj.hashCode();
                throw null;
            }
            url = webView.getUrl();
        } else {
            url = null;
        }
        if (removescheduledcallbackSerializer != removeScheduledCallback.NO_PRELOADING) {
            int i3 = _init_lambda2 + 69;
            _init_lambda4 = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                write(getparagraph, url);
                return;
            } else {
                write(getparagraph, url);
                throw null;
            }
        }
        if (getparagraph.RemoteActionCompatParcelizer() != null) {
            int i4 = _init_lambda4 + 61;
            _init_lambda2 = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{url, getparagraph.RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue();
                obj.hashCode();
                throw null;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{url, getparagraph.RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                return;
            }
            read(getparagraph.RemoteActionCompatParcelizer());
            int i5 = _init_lambda2 + 33;
            _init_lambda4 = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    private final void r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
        int i = 2 % 2;
        DeltaDecoder deltaDecoder = new DeltaDecoder(this);
        deltaDecoder.write(getString(R.string.customer_chat_enable_camera_title));
        deltaDecoder.RemoteActionCompatParcelizer(getString(R.string.customer_chat_enable_camera_message));
        deltaDecoder.IconCompatParcelizer(getString(R.string.customer_chat_enable_camera_go_to_settings), new DialogUtils$$ExternalSyntheticLambda0(3, this));
        deltaDecoder.write(getString(R.string.customer_chat_enable_camera_dismiss), null);
        deltaDecoder.MediaMetadataCompat();
        int i2 = _init_lambda2 + 33;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    private final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int i = 2 % 2;
        int i2 = _init_lambda2 + 105;
        _init_lambda4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((getInfoListui_text) PlaybackStateCompat()).IconCompatParcelizer("chat_e2e_tap_to_page_loaded");
        ((getInfoListui_text) PlaybackStateCompat()).IconCompatParcelizer("chat_web_start_to_rendered");
        ((getInfoListui_text) PlaybackStateCompat()).IconCompatParcelizer("chat_native_tap_to_web_start");
        ((getInfoListui_text) PlaybackStateCompat()).IconCompatParcelizer("chat_native_before_load_url");
        ((getInfoListui_text) PlaybackStateCompat()).IconCompatParcelizer("chat_native_after_load_url");
        ((getInfoListui_text) PlaybackStateCompat()).read();
        int i4 = _init_lambda4 + 11;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private final void read(FrameLayout frameLayout) {
        int i = 2 % 2;
        if (!PreviewBlackScreenQuirk.RemoteActionCompatParcelizer(MediaMetadataCompat().serializer())) {
            WebView webView = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (webView != null) {
                frameLayout.addView(webView);
                return;
            }
            return;
        }
        WebViewManager webViewManagerResultReceiver = ResultReceiver();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        webViewManagerResultReceiver.getClass();
        frameLayout.getClass();
        WebView webView2 = webViewManagerResultReceiver.PlaybackStateCompat;
        if (webView2 == null) {
            return;
        }
        webViewManagerResultReceiver.read();
        ViewParent parent = webView2.getParent();
        ViewGroup viewGroup = null;
        if (parent instanceof ViewGroup) {
            int i2 = _init_lambda4 + 79;
            _init_lambda2 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                viewGroup.hashCode();
                throw null;
            }
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            int i3 = _init_lambda2 + 117;
            _init_lambda4 = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                viewGroup.removeView(webView2);
                int i4 = 37 / 0;
            } else {
                viewGroup.removeView(webView2);
            }
        }
        frameLayout.addView(webView2, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0048, please report this as an issue */
    private static final createFromParcel read(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, onViewAttachedToWindow onviewattachedtowindow) {
        Throwable th;
        int i = 2 % 2;
        selfServiceCustomerChatActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        toAnnotatedStringdefault toannotatedstringdefaultMediaSessionCompatQueueItem = selfServiceCustomerChatActivity.MediaSessionCompatQueueItem();
        fromHtml fromhtml = fromHtml.ERROR;
        String str = "Error opening web chat " + read(onviewattachedtowindow).read();
        toGlobal toglobal = read(onviewattachedtowindow).read();
        if (toglobal != null) {
            int i2 = _init_lambda2 + 1;
            _init_lambda4 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                th = toglobal.read();
                int i3 = 58 / 0;
                if (th == null) {
                    th = new Throwable("Error is " + read(onviewattachedtowindow).read());
                }
            } else {
                th = toglobal.read();
                if (th == null) {
                    th = new Throwable("Error is " + read(onviewattachedtowindow).read());
                }
            }
        } else {
            th = new Throwable("Error is " + read(onviewattachedtowindow).read());
        }
        ((addSpans) toannotatedstringdefaultMediaSessionCompatQueueItem).serializer(fromhtml, "WEB_CHAT_OPEN_ERROR", str, th);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = _init_lambda4 + 9;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        copyxPh5V4g copyxph5v4g = (copyxPh5V4g) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (true ^ (copyxph5v4g instanceof copyNH1kkwU)) {
            if (!(copyxph5v4g instanceof copyciSxzs0)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().MediaSessionCompatQueueItem();
            int i2 = _init_lambda2 + 121;
            _init_lambda4 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        Uri uriIconCompatParcelizer = ((copyNH1kkwU) copyxph5v4g).IconCompatParcelizer();
        if (uriIconCompatParcelizer != null) {
            int i3 = _init_lambda4 + 33;
            _init_lambda2 = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().RemoteActionCompatParcelizer(uriIconCompatParcelizer);
                return null;
            }
            selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().RemoteActionCompatParcelizer(uriIconCompatParcelizer);
            throw null;
        }
        mergedefault mergedefaultVar = selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().read();
        if (mergedefaultVar instanceof copyElsmlbk) {
            Object[] objArr2 = {selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8(), ((copyElsmlbk) mergedefaultVar).read()};
            int iWrite = GpsRtiItem.write();
            WebChatViewModel.IconCompatParcelizer(-718065053, objArr2, GpsRtiItem.write(), 718065057, GpsRtiItem.write(), iWrite, GpsRtiItem.write());
            int i4 = _init_lambda2 + 51;
            _init_lambda4 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
        if (!(mergedefaultVar instanceof getLineBreakLgCVezo)) {
            selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().MediaSessionCompatQueueItem();
            return null;
        }
        int i6 = _init_lambda2 + 95;
        _init_lambda4 = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        Object[] objArr3 = {selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8(), ((getLineBreakLgCVezo) mergedefaultVar).IconCompatParcelizer()};
        int iWrite2 = GpsRtiItem.write();
        WebChatViewModel.IconCompatParcelizer(-718065053, objArr3, GpsRtiItem.write(), 718065057, GpsRtiItem.write(), iWrite2, GpsRtiItem.write());
        return null;
    }

    private static final createFromParcel RemoteActionCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, onViewAttachedToWindow onviewattachedtowindow, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = 1;
        if ((i & 3) != 2) {
            int i4 = _init_lambda4 + 75;
            _init_lambda2 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(i & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i6 = _init_lambda2 + 79;
            _init_lambda4 = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                Modifier modifierThen = Modifier.Companion.then(SizeKt.read);
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new findParagraphsByRangeSbBc2M(selfServiceCustomerChatActivity, i3);
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                boolean z2 = getpostalcode.read(onviewattachedtowindow);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if ((z2 | zIconCompatParcelizer2) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new SessionDao_Impl$$ExternalSyntheticLambda1(selfServiceCustomerChatActivity, 13, onviewattachedtowindow);
                    getpostalcode.write(objComponentActivity2);
                }
                AndroidView_androidKt.AndroidView(r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifierThen, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 48, 0);
            } else {
                Modifier.Companion.then(SizeKt.read);
                getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
                getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return createFromParcel.INSTANCE;
    }

    private final void r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        int i = 2 % 2;
        if (!PreviewBlackScreenQuirk.RemoteActionCompatParcelizer(MediaMetadataCompat().serializer())) {
            try {
                WebView webView = new WebView(this);
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = webView;
                serializer(webView, false);
                return;
            } catch (Throwable th) {
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) MediaBrowserCompatMediaItem()).serializer;
                firebaseRemoteConfigImpl.getClass();
                if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ANDROID_16_WEBVIEW_CRASH_FIX_ENABLED)) {
                    throw th;
                }
                finish();
                int i2 = _init_lambda2 + 101;
                _init_lambda4 = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
        }
        int i4 = _init_lambda4 + 107;
        _init_lambda2 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        try {
            ResultReceiver().write(this);
            WebView webView2 = ResultReceiver().PlaybackStateCompat;
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = webView2;
            if (webView2 != null) {
                int i6 = _init_lambda4 + 117;
                _init_lambda2 = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                serializer(webView2, true);
            }
        } catch (Throwable th2) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) MediaBrowserCompatMediaItem()).serializer;
            firebaseRemoteConfigImpl2.getClass();
            if (!firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_ANDROID_16_WEBVIEW_CRASH_FIX_ENABLED)) {
                throw th2;
            }
            finish();
        }
    }

    @SuppressLint
    private final void serializer(WebView webView, boolean z) {
        int i = 2 % 2;
        if (!z) {
            int i2 = _init_lambda2 + 29;
            _init_lambda4 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if ((getApplicationInfo().flags & 2) != 0) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setBuiltInZoomControls(false);
            settings.setDomStorageEnabled(true);
        }
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity$setupViews$1$2
            private static int RemoteActionCompatParcelizer = 1;
            private static int serializer;

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                int i4 = 2 % 2;
                int i5 = RemoteActionCompatParcelizer + 99;
                int i6 = i5 % Fields.SpotShadowColor;
                serializer = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 45;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 24 / 0;
                }
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onShowFileChooser(WebView webView2, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                int i4 = 2 % 2;
                webView2.getClass();
                valueCallback.getClass();
                fileChooserParams.getClass();
                SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = this.IconCompatParcelizer;
                ValueCallback valueCallback2 = (ValueCallback) SelfServiceCustomerChatActivity.write(-235676831, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 235676831, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
                ShortNewsContentCardView shortNewsContentCardView = null;
                if (valueCallback2 != null) {
                    int i5 = RemoteActionCompatParcelizer + 21;
                    serializer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        valueCallback2.onReceiveValue(null);
                        throw null;
                    }
                    valueCallback2.onReceiveValue(null);
                    int i6 = serializer + 29;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        int i7 = 3 % 2;
                    }
                }
                SelfServiceCustomerChatActivity.write(-376987247, new Object[]{selfServiceCustomerChatActivity, valueCallback}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 376987252, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
                WebChatViewModel webChatViewModel = (WebChatViewModel) SelfServiceCustomerChatActivity.write(-197462709, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 197462724, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
                webChatViewModel.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewModel), new findParagraphByIndexlambda20(webChatViewModel, 1), null, new WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1(shortNewsContentCardView, webChatViewModel, 0), 2);
                int i8 = serializer + 21;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return true;
                }
                throw null;
            }
        });
        webView.setWebViewClient(new WebViewClient() { // from class: com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity$setupViews$1$3
            private static int IconCompatParcelizer = 0;
            private static int RemoteActionCompatParcelizer = 1;

            /* JADX WARN: Code duplicated, block: B:49:0x0137  */
            @Override // android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView2, WebResourceRequest webResourceRequest) {
                Uri url;
                Object next;
                WebResourceResponse webResourceResponse;
                mapAnnotationsui_text mapannotationsui_text;
                Integer num;
                String str;
                removeScheduledCallback removescheduledcallbackSerializer = this.serializer.MediaMetadataCompat().serializer();
                getDefaultSizeXSAIIZE getdefaultsizexsaiize = null;
                if (PreviewBlackScreenQuirk.read(removescheduledcallbackSerializer) && webResourceRequest != null) {
                    ChatAssetCacheManager chatAssetCacheManagerRatingCompat = this.serializer.RatingCompat();
                    chatAssetCacheManagerRatingCompat.getClass();
                    ProtobufEncoder protobufEncoder = chatAssetCacheManagerRatingCompat.MediaMetadataCompat;
                    protobufEncoder.getClass();
                    if (!webResourceRequest.isForMainFrame()) {
                        webResourceResponse = null;
                    } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{webResourceRequest.getUrl().getHost(), "127.0.0.1"}, getCieXyz.write())).booleanValue()) {
                        String path = webResourceRequest.getUrl().getPath();
                        if (path == null) {
                            path = "";
                        }
                        ChatAssetCacheLocalWebServer chatAssetCacheLocalWebServer = (ChatAssetCacheLocalWebServer) protobufEncoder.write;
                        synchronized (chatAssetCacheLocalWebServer.MediaSessionCompatResultReceiverWrapper) {
                            ServerSocket serverSocket = chatAssetCacheLocalWebServer.PlaybackStateCompatCustomAction;
                            if (serverSocket == null || serverSocket.isClosed() || (num = chatAssetCacheLocalWebServer.write) == null) {
                                mapannotationsui_text = null;
                            } else {
                                int iIntValue = num.intValue();
                                BlockRunner blockRunner = chatAssetCacheLocalWebServer.MediaSessionCompatQueueItem;
                                if (blockRunner == null || (str = chatAssetCacheLocalWebServer.MediaDescriptionCompat) == null) {
                                    mapannotationsui_text = null;
                                } else {
                                    mapannotationsui_text = new mapAnnotationsui_text(blockRunner, "http://127.0.0.1:" + iIntValue, str);
                                }
                            }
                        }
                        if (mapannotationsui_text == null) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("NOT intercepted (no active local server session): ".concat(path), new Object[0]);
                        } else {
                            getDefaultSizeXSAIIZE getdefaultsizexsaiizeIconCompatParcelizer = ((getBulletListSettingStackui_text) protobufEncoder.serializer).IconCompatParcelizer(mapannotationsui_text.IconCompatParcelizer, path, true);
                            if (getdefaultsizexsaiizeIconCompatParcelizer == null) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("NOT intercepted (no resolved asset): ".concat(path), new Object[0]);
                            } else if (getdefaultsizexsaiizeIconCompatParcelizer.serializer.equals("text/html") && getdefaultsizexsaiizeIconCompatParcelizer.RemoteActionCompatParcelizer.exists()) {
                                try {
                                    byte[] bArrWrite = ((withBulletListo2QH7mI) protobufEncoder.RemoteActionCompatParcelizer).write(getdefaultsizexsaiizeIconCompatParcelizer, mapannotationsui_text.IconCompatParcelizer, mapannotationsui_text.write);
                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("INTERCEPTED via shouldInterceptRequest: ".concat(path), new Object[0]);
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    mapSingletonMap.getClass();
                                    webResourceResponse = new WebResourceResponse("text/html", "utf-8", 200, "OK", mapSingletonMap, new ByteArrayInputStream(bArrWrite));
                                } catch (Exception e) {
                                    Timber.RemoteActionCompatParcelizer.serializer(e, "modifyEntryHtml failed, falling through to the local web server: ".concat(path), new Object[0]);
                                    webResourceResponse = null;
                                }
                            } else {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("NOT intercepted (not entry html, or file missing on disk): ".concat(path), new Object[0]);
                            }
                        }
                        webResourceResponse = null;
                    } else {
                        webResourceResponse = null;
                    }
                    if (webResourceResponse != null) {
                        return webResourceResponse;
                    }
                }
                if (removescheduledcallbackSerializer != removeScheduledCallback.WEB_ASSET_CACHE_LOADING) {
                    return super.shouldInterceptRequest(webView2, webResourceRequest);
                }
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                    return super.shouldInterceptRequest(webView2, webResourceRequest);
                }
                if (webResourceRequest.isForMainFrame() && setCarryoverInAppMessage.serializer(webResourceRequest.getMethod(), "GET", true) && setCarryoverInAppMessage.serializer(url.getScheme(), Constants.SCHEME, true)) {
                    ChatAssetCacheManager chatAssetCacheManagerRatingCompat2 = this.serializer.RatingCompat();
                    String path2 = url.getPath();
                    if (path2 == null) {
                        path2 = "";
                    }
                    chatAssetCacheManagerRatingCompat2.getClass();
                    BlockRunner blockRunner2 = chatAssetCacheManagerRatingCompat2.IconCompatParcelizer;
                    if (blockRunner2 != null) {
                        if (path2.length() == 0) {
                            path2 = "/";
                        }
                        removeScheduledCallback removescheduledcallbackSerializer2 = chatAssetCacheManagerRatingCompat2.serializer.serializer();
                        removescheduledcallbackSerializer2.getClass();
                        Iterator it = blockRunner2.IconCompatParcelizer(removescheduledcallbackSerializer2 == removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER_SSG).iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!((hasStringAnnotations) next).serializer.read(path2));
                        hasStringAnnotations hasstringannotations = (hasStringAnnotations) next;
                        if (hasstringannotations != null) {
                            getdefaultsizexsaiize = hasstringannotations.IconCompatParcelizer;
                        }
                    }
                } else {
                    ChatAssetCacheManager chatAssetCacheManagerRatingCompat3 = this.serializer.RatingCompat();
                    String host = url.getHost();
                    if (host == null) {
                        host = "";
                    }
                    String path3 = url.getPath();
                    if (path3 == null) {
                        path3 = "";
                    }
                    chatAssetCacheManagerRatingCompat3.getClass();
                    BlockRunner blockRunner3 = chatAssetCacheManagerRatingCompat3.IconCompatParcelizer;
                    if (blockRunner3 != null && ((String) blockRunner3.serializer).equals(host)) {
                        getdefaultsizexsaiize = (getDefaultSizeXSAIIZE) ((LinkedHashMap) blockRunner3.write).get(hideCurrentlyDisplayingInAppMessage.read(path3, '/'));
                    }
                }
                if (getdefaultsizexsaiize != null) {
                    try {
                        String str2 = getdefaultsizexsaiize.serializer;
                        String str3 = getdefaultsizexsaiize.IconCompatParcelizer;
                        Map mapMediaSessionCompatQueueItem = SelfServiceCustomerChatActivity.MediaSessionCompatQueueItem(this.serializer);
                        File file = getdefaultsizexsaiize.RemoteActionCompatParcelizer;
                        return new WebResourceResponse(str2, str3, 200, "OK", mapMediaSessionCompatQueueItem, getActiveFocusTargetNode.write(file, new FileInputStream(file)));
                    } catch (Exception e2) {
                        ((addSpans) this.serializer.MediaSessionCompatQueueItem()).serializer(fromHtml.ERROR, "WEB_PRELOADING", SweepGradientShader9KIMszodefault.IconCompatParcelizer(url, "Failed to open cached asset stream, falling back to network: "), e2);
                    }
                }
                return super.shouldInterceptRequest(webView2, webResourceRequest);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:12:0x0032  */
            /* JADX WARN: Code duplicated, block: B:13:0x0036  */
            /* JADX WARN: Code duplicated, block: B:9:0x0025 A[DONT_INVERT] */
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                int i4;
                int i5 = 2 % 2;
                int i6 = RemoteActionCompatParcelizer + 39;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    str.getClass();
                    if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "tel:", true)) {
                        if (webView2 != null) {
                            i4 = IconCompatParcelizer + 85;
                            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                webView2.loadUrl(str);
                                throw null;
                            }
                            webView2.loadUrl(str);
                        }
                    }
                } else {
                    str.getClass();
                    if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "tel:", false)) {
                        if (webView2 != null) {
                            i4 = IconCompatParcelizer + 85;
                            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                webView2.loadUrl(str);
                                throw null;
                            }
                            webView2.loadUrl(str);
                        }
                    }
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                String host;
                String path;
                Uri url;
                int i4 = 2 % 2;
                super.onReceivedError(webView2, webResourceRequest, webResourceError);
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                    int i5 = RemoteActionCompatParcelizer + 59;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    host = null;
                } else {
                    host = url.getHost();
                    int i7 = IconCompatParcelizer + 33;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{host, "127.0.0.1"}, getCieXyz.write())).booleanValue()) {
                    int i9 = IconCompatParcelizer + 45;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    WebChatViewModel webChatViewModel = (WebChatViewModel) SelfServiceCustomerChatActivity.write(-197462709, new Object[]{this.serializer}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 197462724, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
                    Uri url2 = webResourceRequest.getUrl();
                    if (url2 == null || (path = url2.getPath()) == null) {
                        path = "webview_network_error";
                    }
                    WebChatViewModel.IconCompatParcelizer(-1308807263, new Object[]{webChatViewModel, path}, GpsRtiItem.write(), 1308807265, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                int i4 = 2 % 2;
                int i5 = RemoteActionCompatParcelizer + 41;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = this.serializer;
                if (selfServiceCustomerChatActivity.ResultReceiver().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                    SelfServiceCustomerChatActivity.read(selfServiceCustomerChatActivity, "OnPageStarted called but trace already started in handleState");
                    int i7 = IconCompatParcelizer + 29;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    SelfServiceCustomerChatActivity.read(selfServiceCustomerChatActivity, "OnPageStarted called on Activity's client, starting trace (most accurate!)");
                    getInfoListui_text getinfolistui_text = (getInfoListui_text) selfServiceCustomerChatActivity.PlaybackStateCompat();
                    getinfolistui_text.write("chat_native_tap_to_web_start");
                    getinfolistui_text.write("chat_native_after_load_url");
                    getinfolistui_text.serializer("chat_web_start_to_rendered");
                    selfServiceCustomerChatActivity.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer();
                }
                super.onPageStarted(webView2, str, bitmap);
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                Boolean boolValueOf;
                int i4 = 2;
                int i5 = 2 % 2;
                int i6 = RemoteActionCompatParcelizer + 73;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = this.serializer;
                toAnnotatedStringdefault toannotatedstringdefaultMediaSessionCompatQueueItem = selfServiceCustomerChatActivity.MediaSessionCompatQueueItem();
                fromHtml fromhtml = fromHtml.ERROR;
                ShortNewsContentCardView shortNewsContentCardView = null;
                if (renderProcessGoneDetail != null) {
                    int i8 = RemoteActionCompatParcelizer + 91;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    boolValueOf = Boolean.valueOf(renderProcessGoneDetail.didCrash());
                } else {
                    boolValueOf = null;
                }
                ((addSpans) toannotatedstringdefaultMediaSessionCompatQueueItem).serializer(fromhtml, "WEB_PRELOADING", "Webview render process gone unexpectedly. " + boolValueOf, new Throwable("Webview render process gone " + (renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null)));
                if (!((FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) selfServiceCustomerChatActivity.MediaBrowserCompatMediaItem()).serializer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                    return super.onRenderProcessGone(webView2, renderProcessGoneDetail);
                }
                if (selfServiceCustomerChatActivity.MediaMetadataCompat().serializer() == removeScheduledCallback.FULL_PRELOAD) {
                    selfServiceCustomerChatActivity.serializer().MediaSessionCompatToken.set(true);
                }
                WebChatViewModel webChatViewModel = (WebChatViewModel) SelfServiceCustomerChatActivity.write(-197462709, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 197462724, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
                webChatViewModel.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewModel), new findParagraphByIndexlambda20(webChatViewModel, 1), null, new WebChatViewModel$onShareImage$$inlined$launchWithGenericExceptionHandler$default$1(shortNewsContentCardView, webChatViewModel, i4), 2);
                return true;
            }
        });
        if (MediaMetadataCompat().serializer() == removeScheduledCallback.FULL_PRELOAD) {
            getHasStaleResolvedFonts gethasstaleresolvedfontsSerializer = serializer();
            if (!gethasstaleresolvedfontsSerializer.MediaSessionCompatResultReceiverWrapper) {
                gethasstaleresolvedfontsSerializer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = webView;
                webView.addJavascriptInterface(new fastBinarySearch(gethasstaleresolvedfontsSerializer), "hcAndroidBridgeEntry");
                gethasstaleresolvedfontsSerializer.MediaSessionCompatResultReceiverWrapper = true;
                int i4 = _init_lambda4 + 81;
                _init_lambda2 = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            int i6 = _init_lambda4 + 39;
            _init_lambda2 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        ((getInfoListui_text) PlaybackStateCompat()).serializer("chat_native_add_webview_javascript_interface");
        webView.addJavascriptInterface(new MultiParagraphKt(new WeakReference(r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8())), "hcAndroidBridgeEntry");
        ((getInfoListui_text) PlaybackStateCompat()).write("chat_native_add_webview_javascript_interface");
    }

    private final void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        int i = 2 % 2;
        removeScheduledCallback removescheduledcallbackSerializer = MediaMetadataCompat().serializer();
        WebView webView = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (webView == null) {
            return;
        }
        Object obj = null;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = null;
        if (!PreviewBlackScreenQuirk.RemoteActionCompatParcelizer(removescheduledcallbackSerializer)) {
            int i2 = _init_lambda2 + 41;
            _init_lambda4 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            webView.removeJavascriptInterface("hcAndroidBridgeEntry");
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().MediaMetadataCompat();
            webView.destroy();
            return;
        }
        removeScheduledCallback removescheduledcallback = removeScheduledCallback.FULL_PRELOAD;
        if (removescheduledcallbackSerializer != removescheduledcallback) {
            webView.removeJavascriptInterface("hcAndroidBridgeEntry");
        }
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().MediaMetadataCompat();
        WebView webView2 = ResultReceiver().PlaybackStateCompat;
        if (webView2 != null) {
            int i4 = _init_lambda4 + 79;
            _init_lambda2 = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                boolean z = webView2.getParent() instanceof ViewGroup;
                obj.hashCode();
                throw null;
            }
            ViewParent parent = webView2.getParent();
            ViewGroup viewGroup = !((parent instanceof ViewGroup) ^ true) ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                int i5 = _init_lambda4 + 37;
                _init_lambda2 = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                viewGroup.removeView(webView2);
                int i7 = _init_lambda2 + 5;
                _init_lambda4 = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        }
        webView.stopLoading();
        webView.setWebChromeClient(null);
        if (removescheduledcallbackSerializer == removescheduledcallback) {
            WebViewManager webViewManagerResultReceiver = ResultReceiver();
            WebView webView3 = webViewManagerResultReceiver.PlaybackStateCompat;
            if (webView3 != null) {
                WebViewClient webViewClient = webViewManagerResultReceiver.ParcelableVolumeInfo;
                if (webViewClient == null) {
                    webViewClient = NoopWebViewClient.IconCompatParcelizer;
                }
                webView3.setWebViewClient(webViewClient);
            }
            webViewManagerResultReceiver.serializer("Re-attached preload WebViewClient");
            ResultReceiver().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        } else {
            webView.setWebViewClient(NoopWebViewClient.IconCompatParcelizer);
        }
        webView.clearFocus();
    }

    private static /* synthetic */ Object MediaSessionCompatResultReceiverWrapper(Object[] objArr) {
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = (SelfServiceCustomerChatActivity) objArr[0];
        ParagraphDefaultImpls paragraphDefaultImpls = (ParagraphDefaultImpls) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (paragraphDefaultImpls instanceof setStartLineIndex) {
            int i2 = _init_lambda2 + 37;
            _init_lambda4 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                selfServiceCustomerChatActivity.finish();
                return null;
            }
            selfServiceCustomerChatActivity.finish();
            obj.hashCode();
            throw null;
        }
        if (paragraphDefaultImpls instanceof getEndLineIndex) {
            selfServiceCustomerChatActivity.finish();
            int i3 = _init_lambda2 + 13;
            _init_lambda4 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return null;
        }
        if (paragraphDefaultImpls instanceof setEndLineIndex) {
            setEndLineIndex setendlineindex = (setEndLineIndex) paragraphDefaultImpls;
            getHyphensvmbZdU8.write((getHyphensEaSxIns) write(-598884792, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 598884798, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read()), setendlineindex.RemoteActionCompatParcelizer(), setendlineindex.write(), selfServiceCustomerChatActivity);
            return null;
        }
        if (paragraphDefaultImpls instanceof getStartIndex) {
            int i5 = _init_lambda2 + 123;
            _init_lambda4 = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            mergedefault mergedefaultVar = ((getStartIndex) paragraphDefaultImpls).read();
            if (mergedefaultVar == null) {
                ValueCallback<Uri[]> valueCallback = selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
                selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
                return null;
            }
            if (selfServiceCustomerChatActivity.serializer(mergedefaultVar)) {
                selfServiceCustomerChatActivity.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.write("android.permission.CAMERA");
                return null;
            }
            selfServiceCustomerChatActivity.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg().RemoteActionCompatParcelizer(selfServiceCustomerChatActivity, mergedefaultVar);
            return null;
        }
        if (paragraphDefaultImpls instanceof toGlobalxdX6G0default) {
            ValueCallback<Uri[]> valueCallback2 = selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(new Uri[]{((toGlobalxdX6G0default) paragraphDefaultImpls).IconCompatParcelizer()});
            }
            selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
            return null;
        }
        if (!(paragraphDefaultImpls instanceof getEndIndex)) {
            if (!(paragraphDefaultImpls instanceof getStartLineIndex)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            String strIconCompatParcelizer = ((getStartLineIndex) paragraphDefaultImpls).IconCompatParcelizer();
            if (strIconCompatParcelizer == null) {
                strIconCompatParcelizer = selfServiceCustomerChatActivity.getString(R.string.all_error_message);
                strIconCompatParcelizer.getClass();
            }
            Toast.makeText(selfServiceCustomerChatActivity, strIconCompatParcelizer, 0).show();
            return null;
        }
        int i7 = _init_lambda2 + 33;
        _init_lambda4 = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            ValueCallback<Uri[]> valueCallback3 = selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            throw null;
        }
        ValueCallback<Uri[]> valueCallback4 = selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (valueCallback4 != null) {
            valueCallback4.onReceiveValue(null);
        }
        selfServiceCustomerChatActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
        return null;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = _init_lambda2 + 115;
        _init_lambda4 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        ((getInfoListui_text) PlaybackStateCompat()).write("chat_native_activity_launch");
        ((getInfoListui_text) PlaybackStateCompat()).serializer("chat_native_activity_on_create");
        ChatViewData chatViewDataR8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        int i5 = 0;
        if (chatViewDataR8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == null) {
            int i6 = _init_lambda2 + 89;
            _init_lambda4 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            finish();
            int i8 = _init_lambda4 + 89;
            _init_lambda2 = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 5 / 0;
                return;
            }
            return;
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = chatViewDataR8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        read(bundle);
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().serializer();
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg().write().serializer(this, new ActualSweepGradientShader9KIMszo(new NetworkFetcher.AnonymousClass2(this, 22), i));
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(this, new NetworkFetcher.AnonymousClass2(this, 23));
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new AnonymousClass3(this, null, i5), 3);
        StaticLayoutFactory28 staticLayoutFactory28RemoteActionCompatParcelizer = ((disableUseBoundsForWidth) ((fastZipWithNext) write(166755931, new Object[]{this}, displayInAppMessagelambda10.read(), GetAccessTokenUseCaseImpl.serializer(), -166755924, displayInAppMessagelambda10.read(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 387704640))).RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()));
        DragAndDropTargetModifierNode dragAndDropTargetModifierNodeSerializer = ((fillStringBounds) MediaSessionCompatToken()).serializer(MediaDescriptionCompat());
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        UtilsKt.write(this, new DragAndDropTargetModifierNode(new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(this, staticLayoutFactory28RemoteActionCompatParcelizer, dragAndDropTargetModifierNodeSerializer, 6), true, 13251243));
        ((getInfoListui_text) PlaybackStateCompat()).write("chat_native_activity_on_create");
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0218  */
    private final void write(getParagraph getparagraph, String str) {
        int i = 2 % 2;
        int i2 = _init_lambda4 + 63;
        _init_lambda2 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            getparagraph.RemoteActionCompatParcelizer();
            throw null;
        }
        if (getparagraph.RemoteActionCompatParcelizer() == null) {
            return;
        }
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
            int i3 = _init_lambda2 + 5;
            _init_lambda4 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            WebChatViewModel webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            ChatViewData chatViewData = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if (chatViewData != null) {
                webChatViewModelR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.serializer(chatViewData.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer());
                return;
            } else {
                removeNodeAtDepth.serializer("chatViewData");
                throw null;
            }
        }
        String str2 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (str2 != null) {
            str = str2;
        }
        if (read(str, getparagraph.RemoteActionCompatParcelizer())) {
            write(251286291, new Object[]{this}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -251286280, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
            read(getparagraph.RemoteActionCompatParcelizer());
        } else if (!(!getparagraph.write())) {
            write(251286291, new Object[]{this}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -251286280, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
            if (MediaMetadataCompat().serializer() == removeScheduledCallback.FULL_PRELOAD) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{serializer().PlaybackStateCompatCustomAction.read(), getPlaceholders.read}, getCieXyz.write())).booleanValue() || serializer().MediaSessionCompatToken.get()) {
                    String string = Uri.parse(getparagraph.RemoteActionCompatParcelizer()).buildUpon().appendQueryParameter("ts", String.valueOf(System.currentTimeMillis())).build().toString();
                    string.getClass();
                    read(string);
                } else {
                    serializer("HandleState called, wasPageStartCalledDuringPreload=" + ResultReceiver().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + ", isPageLoading=" + ((Boolean) serializer().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read()).booleanValue());
                    if (ResultReceiver().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                        serializer("onPageStarted was called during preload, starting trace in handleState");
                        ((getInfoListui_text) PlaybackStateCompat()).write("chat_native_tap_to_web_start");
                        ((getInfoListui_text) PlaybackStateCompat()).write("chat_native_after_load_url");
                        ((getInfoListui_text) PlaybackStateCompat()).serializer("chat_web_start_to_rendered");
                        if (((Boolean) serializer().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read()).booleanValue()) {
                            int i5 = _init_lambda2 + 59;
                            _init_lambda4 = i5 % Fields.SpotShadowColor;
                            if (i5 % 2 == 0) {
                                MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer();
                                throw null;
                            }
                            MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer();
                        }
                    }
                    if (!((Boolean) serializer().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read()).booleanValue()) {
                        if (!ResultReceiver().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                            serializer("Page already loaded, subsequent open - stopping trace immediately for instant load");
                            ((getInfoListui_text) PlaybackStateCompat()).serializer("chat_web_start_to_rendered");
                            ((getInfoListui_text) PlaybackStateCompat()).write("chat_web_start_to_rendered");
                            ((getInfoListui_text) PlaybackStateCompat()).write("chat_e2e_tap_to_page_loaded");
                            getInfoListui_text getinfolistui_text = (getInfoListui_text) PlaybackStateCompat();
                            if (getinfolistui_text.serializer()) {
                                getTransaction gettransaction = getinfolistui_text.write;
                                if (gettransaction != null) {
                                    int i6 = _init_lambda2 + 65;
                                    _init_lambda4 = i6 % Fields.SpotShadowColor;
                                    if (i6 % 2 == 0) {
                                        gettransaction.RemoteActionCompatParcelizer();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    gettransaction.RemoteActionCompatParcelizer();
                                }
                                getinfolistui_text.MediaMetadataCompat.clear();
                                getinfolistui_text.write = null;
                            }
                        }
                        MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer();
                        MediaSessionCompatResultReceiverWrapper().RemoteActionCompatParcelizer();
                        toLayoutLineBreakWordStylewPN0Rpw tolayoutlinebreakwordstylewpn0rpwRemoteActionCompatParcelizer = MediaSessionCompatResultReceiverWrapper().RemoteActionCompatParcelizer(true);
                        if (tolayoutlinebreakwordstylewpn0rpwRemoteActionCompatParcelizer != null) {
                            serializer().IconCompatParcelizer(tolayoutlinebreakwordstylewpn0rpwRemoteActionCompatParcelizer);
                        }
                        WebChatViewModel.IconCompatParcelizer(416714492, new Object[]{r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()}, GpsRtiItem.write(), -416714491, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                    }
                }
            } else {
                String string2 = Uri.parse(getparagraph.RemoteActionCompatParcelizer()).buildUpon().appendQueryParameter("ts", String.valueOf(System.currentTimeMillis())).build().toString();
                string2.getClass();
                read(string2);
            }
        }
        if (getparagraph.write()) {
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().RatingCompat();
            int i7 = _init_lambda4 + 125;
            _init_lambda2 = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x0101  */
    /* JADX WARN: Code duplicated, block: B:60:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x0215  */
    /* JADX WARN: Code duplicated, block: B:69:0x022e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0251  */
    private static final createFromParcel onCreate$lambda$0(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, getStripNonMetricAffectingCharSpansannotations getstripnonmetricaffectingcharspansannotations, r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE r8lambdai4uhhuxi_lbaiwbhw2e2kanuhe, getBirthDateFull getbirthdatefull, int i) {
        Modifier.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        boolean zIconCompatParcelizer;
        boolean zIconCompatParcelizer2;
        Object objComponentActivity;
        boolean zIconCompatParcelizer3;
        Object objComponentActivity2;
        boolean zIconCompatParcelizer4;
        Object objComponentActivity3;
        int i2 = 2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        boolean zWrite = getpostalcode.write(i & 1, (i & 3) != 2);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if (zWrite) {
            int i4 = _init_lambda4 + 35;
            _init_lambda2 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().IconCompatParcelizer(), getpostalcode, 0);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(selfServiceCustomerChatActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().MediaBrowserCompatMediaItem(), getpostalcode, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            FillElement fillElement = SizeKt.read;
            Modifier modifierRemoteActionCompatParcelizer = AspectRatioKt.RemoteActionCompatParcelizer(AspectRatioKt.serializer(companion2.then(fillElement)));
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion3.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
            Object obj = null;
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i6 = _init_lambda2 + 71;
                _init_lambda4 = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    getpostalcode.serializer(constructor2);
                    throw null;
                }
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion4, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            findParagraphByIndex findparagraphbyindexIconCompatParcelizer = IconCompatParcelizer(populateViewStructure_androidKtpopulate7Write);
            getParagraph getparagraph = read(populateViewStructure_androidKtpopulate7Write2);
            boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            Object obj2 = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer5) {
                objComponentActivity4 = new findParagraphByY(selfServiceCustomerChatActivity, 5);
                getpostalcode.write(objComponentActivity4);
            } else {
                int i7 = _init_lambda4 + 103;
                _init_lambda2 = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (objComponentActivity4 == obj2) {
                    objComponentActivity4 = new findParagraphByY(selfServiceCustomerChatActivity, 5);
                    getpostalcode.write(objComponentActivity4);
                }
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4;
            boolean zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer6 || objComponentActivity5 == obj2) {
                objComponentActivity5 = new findParagraphsByRangeSbBc2M(selfServiceCustomerChatActivity, i2);
                getpostalcode.write(objComponentActivity5);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5;
            boolean zIconCompatParcelizer7 = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
            boolean z = getpostalcode.read(populateViewStructure_androidKtpopulate7Write2);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer7 && !z) {
                int i9 = _init_lambda4 + 93;
                _init_lambda2 = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 54 / 0;
                    if (objComponentActivity6 == obj2) {
                        objComponentActivity6 = new ViewUtils$$ExternalSyntheticLambda6(selfServiceCustomerChatActivity, 8, populateViewStructure_androidKtpopulate7Write2);
                        getpostalcode.write(objComponentActivity6);
                        int i11 = _init_lambda4 + 111;
                        _init_lambda2 = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                    }
                } else if (objComponentActivity6 == obj2) {
                    objComponentActivity6 = new ViewUtils$$ExternalSyntheticLambda6(selfServiceCustomerChatActivity, 8, populateViewStructure_androidKtpopulate7Write2);
                    getpostalcode.write(objComponentActivity6);
                    int i13 = _init_lambda4 + 111;
                    _init_lambda2 = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                }
            } else {
                objComponentActivity6 = new ViewUtils$$ExternalSyntheticLambda6(selfServiceCustomerChatActivity, 8, populateViewStructure_androidKtpopulate7Write2);
                getpostalcode.write(objComponentActivity6);
                int i15 = _init_lambda4 + 111;
                _init_lambda2 = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6;
            boolean zIconCompatParcelizer8 = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer8 || objComponentActivity7 == obj2) {
                objComponentActivity7 = new findParagraphByY(selfServiceCustomerChatActivity, 1);
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            boolean zIconCompatParcelizer9 = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer9 || objComponentActivity8 == obj2) {
                objComponentActivity8 = new findParagraphByY(selfServiceCustomerChatActivity, 2);
                getpostalcode.write(objComponentActivity8);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity8;
            boolean zIconCompatParcelizer10 = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
            Object objComponentActivity9 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer10 || objComponentActivity9 == obj2) {
                objComponentActivity9 = new findParagraphByY(selfServiceCustomerChatActivity, 3);
                getpostalcode.write(objComponentActivity9);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity9;
            boolean zIconCompatParcelizer11 = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
            Object objComponentActivity10 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer11) {
                companion = companion2;
            } else {
                int i17 = _init_lambda4 + 73;
                companion = companion2;
                _init_lambda2 = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity10 == obj2) {
                }
                CustomerChatWebChatContainerKt.CustomerChatWebChatContainer(findparagraphbyindexIconCompatParcelizer, getparagraph, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity10, ExtrasKt.write(-916400796, new GapComposerKt$$ExternalSyntheticLambda0(selfServiceCustomerChatActivity, 13, populateViewStructure_androidKtpopulate7Write2), getpostalcode), getpostalcode, 805306368);
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write3 = ExtrasKt.write(((StaticLayoutFactory28) getstripnonmetricaffectingcharspansannotations).ParcelableVolumeInfo, getpostalcode, 0);
                boolean z2 = serializer(populateViewStructure_androidKtpopulate7Write3) instanceof Paint29;
                Modifier modifierThen = companion.then(fillElement);
                MeasurePolicy measurePolicy2 = BoxKt.read(companion3.getTopCenter(), false);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                constructor = companion4.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion4, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                Object objSerializer = serializer(populateViewStructure_androidKtpopulate7Write3);
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getstripnonmetricaffectingcharspansannotations);
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == obj2) {
                    objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(getstripnonmetricaffectingcharspansannotations, 9, selfServiceCustomerChatActivity);
                    getpostalcode.write(objComponentActivity);
                }
                Object obj3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
                zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(getstripnonmetricaffectingcharspansannotations);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer3 || objComponentActivity2 == obj2) {
                    objComponentActivity2 = new MapboxNavigation.AnonymousClass15(getstripnonmetricaffectingcharspansannotations, 11);
                    getpostalcode.write(objComponentActivity2);
                    int i18 = _init_lambda2 + 113;
                    _init_lambda4 = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                }
                Object obj4 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(getstripnonmetricaffectingcharspansannotations);
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer4 || objComponentActivity3 == obj2) {
                    objComponentActivity3 = new MapboxNavigation.AnonymousClass15(getstripnonmetricaffectingcharspansannotations, 12);
                    getpostalcode.write(objComponentActivity3);
                }
                r8lambdai4uhhuxi_lbaiwbhw2e2kanuhe.RemoteActionCompatParcelizer(objSerializer, Boolean.valueOf(z2), obj3, obj4, (registerInAppMessageManagerlambda0) objComponentActivity3, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
            }
            objComponentActivity10 = new findParagraphByY(selfServiceCustomerChatActivity, 4);
            getpostalcode.write(objComponentActivity10);
            CustomerChatWebChatContainerKt.CustomerChatWebChatContainer(findparagraphbyindexIconCompatParcelizer, getparagraph, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity10, ExtrasKt.write(-916400796, new GapComposerKt$$ExternalSyntheticLambda0(selfServiceCustomerChatActivity, 13, populateViewStructure_androidKtpopulate7Write2), getpostalcode), getpostalcode, 805306368);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write4 = ExtrasKt.write(((StaticLayoutFactory28) getstripnonmetricaffectingcharspansannotations).ParcelableVolumeInfo, getpostalcode, 0);
            boolean z3 = serializer(populateViewStructure_androidKtpopulate7Write4) instanceof Paint29;
            Modifier modifierThen2 = companion.then(fillElement);
            MeasurePolicy measurePolicy3 = BoxKt.read(companion3.getTopCenter(), false);
            int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen2);
            constructor = companion4.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion4, getpostalcode, measurePolicy3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
            Object objSerializer2 = serializer(populateViewStructure_androidKtpopulate7Write4);
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getstripnonmetricaffectingcharspansannotations);
            zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(selfServiceCustomerChatActivity);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer && !zIconCompatParcelizer2) {
                objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(getstripnonmetricaffectingcharspansannotations, 9, selfServiceCustomerChatActivity);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(getstripnonmetricaffectingcharspansannotations, 9, selfServiceCustomerChatActivity);
                getpostalcode.write(objComponentActivity);
            }
            Object obj5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(getstripnonmetricaffectingcharspansannotations);
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3) {
                objComponentActivity2 = new MapboxNavigation.AnonymousClass15(getstripnonmetricaffectingcharspansannotations, 11);
                getpostalcode.write(objComponentActivity2);
                int i110 = _init_lambda2 + 113;
                _init_lambda4 = i110 % Fields.SpotShadowColor;
                int i111 = i110 % 2;
            } else {
                objComponentActivity2 = new MapboxNavigation.AnonymousClass15(getstripnonmetricaffectingcharspansannotations, 11);
                getpostalcode.write(objComponentActivity2);
                int i112 = _init_lambda2 + 113;
                _init_lambda4 = i112 % Fields.SpotShadowColor;
                int i113 = i112 % 2;
            }
            Object obj6 = (registerInAppMessageManagerlambda0) objComponentActivity2;
            zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(getstripnonmetricaffectingcharspansannotations);
            objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer4) {
                objComponentActivity3 = new MapboxNavigation.AnonymousClass15(getstripnonmetricaffectingcharspansannotations, 12);
                getpostalcode.write(objComponentActivity3);
            } else {
                objComponentActivity3 = new MapboxNavigation.AnonymousClass15(getstripnonmetricaffectingcharspansannotations, 12);
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdai4uhhuxi_lbaiwbhw2e2kanuhe.RemoteActionCompatParcelizer(objSerializer2, Boolean.valueOf(z3), obj5, obj6, (registerInAppMessageManagerlambda0) objComponentActivity3, getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final getHyphensEaSxIns PlaybackStateCompatCustomAction() {
        return (getHyphensEaSxIns) write(-598884792, new Object[]{this}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 598884798, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }

    public final fastZipWithNext ParcelableVolumeInfo() {
        return (fastZipWithNext) write(166755931, new Object[]{this}, displayInAppMessagelambda10.read(), GetAccessTokenUseCaseImpl.serializer(), -166755924, displayInAppMessagelambda10.read(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 387704640);
    }

    private static final void IconCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, DialogInterface dialogInterface, int i) {
        write(1724104963, new Object[]{selfServiceCustomerChatActivity, dialogInterface, Integer.valueOf(i)}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -1724104951, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }

    private static final createFromParcel read(getStripNonMetricAffectingCharSpansannotations getstripnonmetricaffectingcharspansannotations, SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        return (createFromParcel) write(-634525273, new Object[]{getstripnonmetricaffectingcharspansannotations, selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 634525275, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }

    private static final createFromParcel IconCompatParcelizer(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, getParagraph getparagraph) {
        return (createFromParcel) write(-1594423502, new Object[]{selfServiceCustomerChatActivity, getparagraph}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 1594423511, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }

    private final void serializer(ParagraphDefaultImpls paragraphDefaultImpls) {
        write(-1258078379, new Object[]{this, paragraphDefaultImpls}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 1258078393, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }

    private final void read(copyxPh5V4g copyxph5v4g) {
        write(2077310678, new Object[]{this, copyxph5v4g}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -2077310670, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }

    private final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        write(251286291, new Object[]{this}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -251286280, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }

    public static final /* synthetic */ WebChatViewModel MediaMetadataCompat(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        return (WebChatViewModel) write(-197462709, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 197462724, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }

    public static final /* synthetic */ ValueCallback RatingCompat(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        return (ValueCallback) write(-235676831, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 235676831, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }

    public static /* synthetic */ createFromParcel MediaDescriptionCompat(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity) {
        return (createFromParcel) write(2121259960, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -2121259959, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }

    public static /* synthetic */ FrameLayout write(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, Context context) {
        return (FrameLayout) write(-1125854288, new Object[]{selfServiceCustomerChatActivity, context}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 1125854292, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
    }
}
