package coil3.network;

import android.net.Uri;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$Editor;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.base.presentation.BaseActivity;
import com.foodora.courier.base.presentation.view.presenter.BasePresenter;
import com.google.firestore.v1.Value;
import com.logistics.rider.glovo.R;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.directions.session.DirectionsSessionKt;
import com.mapbox.navigation.core.directions.session.MapboxDirectionsSession;
import com.mapbox.navigation.core.routealternatives.UpdateRouteSuggestion;
import com.roadrunner.adjust.ui.AdjustTrueLinkBrowsableActivity;
import com.roadrunner.auth.logout.presentation.LogoutActivity;
import com.roadrunner.biometrics.presentation.BiometricsActivity;
import com.roadrunner.custom.password.presentation.CustomPasswordActivity;
import com.roadrunner.custom.password.presentation.CustomPasswordViewModel;
import com.roadrunner.customerchat.legacy.chatlist.presentation.CustomerChatsActivity;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.AutoAcceptPreferencesViewModel;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.AutoAcceptPreferencesViewModel$onEndShiftToggle$1;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineComposeBottomSheet;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import com.roadrunner.util.sound.DefaultForegroundSoundManager$play$1;
import io.reactivex.SingleEmitter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidSystemCallbacksActivityCallbacks;
import o.BiasAlignmentVertical;
import o.BlurEffect3YTHUZsdefault;
import o.DateTimeConverter;
import o.ExperimentalComposeUiApi;
import o.ExperimentalMediaQueryApi;
import o.GifDrawableTransformation;
import o.GraphicsLayer;
import o.HttpUrlFetcher;
import o.ImageHeaderParserImageType;
import o.LifecycleRequestDelegate;
import o.NodeCoordinatorCompaniononCommitAffectingLayer1;
import o.NullRequestDataException;
import o.ParagraphDefaultImpls;
import o.RecyclableBufferedInputStream;
import o.RegistryMissingComponentException;
import o.RegistryNoSourceEncoderAvailableException;
import o.RenderEffect;
import o.RenderEffectVerificationHelper;
import o.RequestBuilder;
import o.ReusableGraphicsLayerScope;
import o.ShortNewsContentCardView;
import o.SingleRequest;
import o.StrokeJoin;
import o.TextStyleKt;
import o.UrlAnnotation;
import o.access900;
import o.accesscontainsDescendant;
import o.accesssetDependencyp;
import o.awaitStarted;
import o.cancelPendingWebViewPause;
import o.clipOutRect;
import o.copyxPh5V4g;
import o.createBlurEffect8A3gB4;
import o.createFromParcel;
import o.createOffsetEffectUv8p0NA;
import o.drawTextLVfH_YU;
import o.fractionVisibleInWindowWithInsetsE1MhUcY;
import o.getBlurRadiusannotations;
import o.getBottom;
import o.getBottomCenterannotations;
import o.getBuffer;
import o.getCenterStartannotations;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getExponentimpl;
import o.getGraphicsDensityui;
import o.getHighNSsRyOo;
import o.getIntersect;
import o.getLayoutDirectionui;
import o.getOutlineui;
import o.getOutputTransform;
import o.getPoints;
import o.getQueryParameterslambda2;
import o.getRectangleShape;
import o.getRectangleShapeannotations;
import o.getReverseDifferenceannotations;
import o.getSUPPRESSannotations;
import o.getSdkEnablementProviderandroid_sdk_base_release;
import o.getSquareKaPHkGw;
import o.getStartannotations;
import o.getTopannotations;
import o.getUnionannotations;
import o.getUnionb3I0S0c;
import o.getVerticalBias;
import o.getWeight;
import o.getXorannotations;
import o.getXorb3I0S0c;
import o.hideCurrentlyDisplayingInAppMessage;
import o.invalidateCallbacksFor;
import o.isAdapterPositionOnScreen;
import o.isAppSetIdReadingEnabled;
import o.isValidTimeZone;
import o.markOnScreenCardsAsReadlambda1;
import o.markOnScreenCardsAsReadlambda2;
import o.nowInMilliseconds;
import o.nowInMillisecondsSystemClock;
import o.nowInMillisecondslambda0;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewDetachedFromWindowlambda1;
import o.plus;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeNodeAtDepth;
import o.requestFocusdefault;
import o.resolveSpanStyleDefaults;
import o.runAttachLifecycleui;
import o.setCarryoverInAppMessage;
import o.setOutlineui;
import o.shareWithSiblings;
import o.sortByGeometryGroupingsdefault;
import o.toAndroidRectF;
import o.toBitmapConfig1JJdX4A;
import o.toComposeIntRect;
import o.toSvgdefault;
import o.unboximpl;
import okio.Okio;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkFetcher implements toSvgdefault {
    public final onViewDetachedFromWindowlambda1 IconCompatParcelizer;
    public final getBlurRadiusannotations MediaBrowserCompatMediaItem;
    public final String RatingCompat;
    public final onViewDetachedFromWindowlambda1 RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final onViewDetachedFromWindowlambda1 serializer;
    public final markOnScreenCardsAsReadlambda2 write;

    public final createBlurEffect8A3gB4 read(getPoints getpoints) throws Throwable {
        Throwable th;
        createBlurEffect8A3gB4 createblureffect8a3gb4;
        try {
            HttpUrlFetcher httpUrlFetcherWrite = write();
            getXorannotations getxorannotations = getpoints.RemoteActionCompatParcelizer;
            if (getxorannotations.write) {
                throw new IllegalStateException("snapshot is closed");
            }
            GifDrawableTransformation gifDrawableTransformationRemoteActionCompatParcelizer = Okio.RemoteActionCompatParcelizer(httpUrlFetcherWrite.MediaSessionCompatToken((RecyclableBufferedInputStream) getxorannotations.RemoteActionCompatParcelizer.serializer.get(0)));
            try {
                createblureffect8a3gb4 = toAndroidRectF.read(gifDrawableTransformationRemoteActionCompatParcelizer);
                try {
                    gifDrawableTransformationRemoteActionCompatParcelizer.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    gifDrawableTransformationRemoteActionCompatParcelizer.close();
                } catch (Throwable th4) {
                    markOnScreenCardsAsReadlambda1.read(th3, th4);
                }
                th = th3;
                createblureffect8a3gb4 = null;
            }
            if (th == null) {
                return createblureffect8a3gb4;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // o.toSvgdefault
    public final Object fetch(getBuffer getbuffer) {
        createOffsetEffectUv8p0NA createoffseteffectuv8p0na = (createOffsetEffectUv8p0NA) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        String str = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(1, this, NetworkFetcher.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
        createoffseteffectuv8p0na.getClass();
        return anonymousClass2.invoke(getbuffer);
    }

    public final ReusableGraphicsLayerScope read() {
        Extras$Key extras$Key = getRectangleShape.serializer;
        getBlurRadiusannotations getblurradiusannotations = this.MediaBrowserCompatMediaItem;
        getGraphicsDensityui getgraphicsdensityui = (getGraphicsDensityui) ExtrasKt.read(getblurradiusannotations, extras$Key);
        getgraphicsdensityui.getClass();
        NetworkHeaders$Builder networkHeaders$Builder = new NetworkHeaders$Builder(getgraphicsdensityui);
        setOutlineui setoutlineui = getblurradiusannotations.serializer;
        boolean readEnabled = setoutlineui.getReadEnabled();
        boolean z = getblurradiusannotations.MediaMetadataCompat.getReadEnabled() && ((RenderEffect) this.write.RemoteActionCompatParcelizer).write();
        if (!z && readEnabled) {
            networkHeaders$Builder.IconCompatParcelizer("only-if-cached, max-stale=2147483647");
        } else if (!z || readEnabled) {
            if (!z && !readEnabled) {
                networkHeaders$Builder.IconCompatParcelizer("no-cache, only-if-cached");
            }
        } else if (setoutlineui.getWriteEnabled()) {
            networkHeaders$Builder.IconCompatParcelizer("no-cache");
        } else {
            networkHeaders$Builder.IconCompatParcelizer("no-cache, no-store");
        }
        String str = (String) ExtrasKt.read(getblurradiusannotations, getRectangleShape.write);
        getGraphicsDensityui getgraphicsdensityui2 = new getGraphicsDensityui(onMove.serializer(networkHeaders$Builder.serializer));
        if (ExtrasKt.read(getblurradiusannotations, getRectangleShape.read) == null) {
            return new ReusableGraphicsLayerScope(this.RatingCompat, str, getgraphicsdensityui2, getblurradiusannotations.read);
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
        return null;
    }

    public final getXorb3I0S0c serializer(getPoints getpoints) {
        getXorannotations getxorannotations = getpoints.RemoteActionCompatParcelizer;
        if (getxorannotations.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("snapshot is closed");
            return null;
        }
        RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) getxorannotations.RemoteActionCompatParcelizer.serializer.get(1);
        HttpUrlFetcher httpUrlFetcherWrite = write();
        String str = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
        if (str == null) {
            str = this.RatingCompat;
        }
        return getUnionb3I0S0c.RemoteActionCompatParcelizer(recyclableBufferedInputStream, httpUrlFetcherWrite, str, getpoints, 16);
    }

    public final HttpUrlFetcher write() {
        HttpUrlFetcher httpUrlFetcher;
        getWeight getweight = (getWeight) this.read.MediaSessionCompatResultReceiverWrapper();
        return (getweight == null || (httpUrlFetcher = getweight.RemoteActionCompatParcelizer) == null) ? this.MediaBrowserCompatMediaItem.IconCompatParcelizer : httpUrlFetcher;
    }

    public NetworkFetcher(String str, getBlurRadiusannotations getblurradiusannotations, isAdapterPositionOnScreen isadapterpositiononscreen, isAdapterPositionOnScreen isadapterpositiononscreen2, isAdapterPositionOnScreen isadapterpositiononscreen3, markOnScreenCardsAsReadlambda2 markonscreencardsasreadlambda2, isAdapterPositionOnScreen isadapterpositiononscreen4) {
        this.RatingCompat = str;
        this.MediaBrowserCompatMediaItem = getblurradiusannotations;
        this.serializer = isadapterpositiononscreen;
        this.read = isadapterpositiononscreen2;
        this.IconCompatParcelizer = isadapterpositiononscreen3;
        this.write = markonscreencardsasreadlambda2;
        this.RemoteActionCompatParcelizer = isadapterpositiononscreen4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$toImageSource(NetworkFetcher networkFetcher, getLayoutDirectionui getlayoutdirectionui, ContinuationImpl continuationImpl) {
        BlurEffect3YTHUZsdefault blurEffect3YTHUZsdefault;
        RegistryMissingComponentException registryMissingComponentException;
        networkFetcher.getClass();
        if (continuationImpl instanceof BlurEffect3YTHUZsdefault) {
            blurEffect3YTHUZsdefault = (BlurEffect3YTHUZsdefault) continuationImpl;
            int i = blurEffect3YTHUZsdefault.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                blurEffect3YTHUZsdefault.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                blurEffect3YTHUZsdefault = new BlurEffect3YTHUZsdefault(networkFetcher, continuationImpl);
            }
        } else {
            blurEffect3YTHUZsdefault = new BlurEffect3YTHUZsdefault(networkFetcher, continuationImpl);
        }
        Object obj = blurEffect3YTHUZsdefault.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = blurEffect3YTHUZsdefault.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
            blurEffect3YTHUZsdefault.read = registryMissingComponentException2;
            blurEffect3YTHUZsdefault.IconCompatParcelizer = 1;
            getlayoutdirectionui.serializer.RemoteActionCompatParcelizer(registryMissingComponentException2);
            if (createFromParcel.INSTANCE == coroutineSingletons) {
                return coroutineSingletons;
            }
            registryMissingComponentException = registryMissingComponentException2;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            registryMissingComponentException = blurEffect3YTHUZsdefault.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return new getIntersect(registryMissingComponentException, networkFetcher.write(), null);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149 A[Catch: Exception -> 0x01cd, TryCatch #1 {Exception -> 0x01cd, blocks: (B:65:0x0141, B:67:0x0149, B:70:0x0178, B:71:0x017d, B:72:0x017e), top: B:97:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:70:0x0178 A[Catch: Exception -> 0x01cd, TryCatch #1 {Exception -> 0x01cd, blocks: (B:65:0x0141, B:67:0x0149, B:70:0x0178, B:71:0x017d, B:72:0x017e), top: B:97:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ac A[Catch: Exception -> 0x0049, TryCatch #2 {Exception -> 0x0049, blocks: (B:14:0x0037, B:81:0x01ca, B:19:0x0044, B:76:0x01a8, B:78:0x01ac), top: B:98:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c7, code lost:
    
        if (r1 == r9) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v13, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r5v10, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$doFetch(coil3.network.NetworkFetcher r22, o.ShortNewsContentCardView r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.access$doFetch(coil3.network.NetworkFetcher, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    public static String RemoteActionCompatParcelizer(String str, String str2) {
        String strSerializer;
        if (str2 == null || setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, "text/plain", false)) {
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                strSerializer = null;
            } else {
                String strRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str, '#'), '?');
                String strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('/', strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer), "");
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer)) {
                    strSerializer = null;
                } else {
                    String lowerCase = strIconCompatParcelizer.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    strSerializer = (String) getSquareKaPHkGw.serializer.get(lowerCase);
                    if (strSerializer == null) {
                        strSerializer = StrokeJoin.serializer(lowerCase);
                    }
                }
            }
            if (strSerializer != null) {
                return strSerializer;
            }
        }
        if (str2 != null) {
            return hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0236 A[Catch: Exception -> 0x0241, TryCatch #17 {Exception -> 0x0241, blocks: (B:111:0x021b, B:112:0x0225, B:114:0x0233, B:116:0x0236, B:120:0x023f, B:121:0x0240, B:113:0x0226), top: B:167:0x021b, inners: #16 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x023c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0264  */
    /* JADX WARN: Code duplicated, block: B:165:0x0226 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final Object access$writeToDiskCache(NetworkFetcher networkFetcher, getPoints getpoints, createBlurEffect8A3gB4 createblureffect8a3gb4, createBlurEffect8A3gB4 createblureffect8a3gb5, ContinuationImpl continuationImpl) throws Exception {
        RenderEffectVerificationHelper renderEffectVerificationHelper;
        createBlurEffect8A3gB4 createblureffect8a3gb6;
        getExponentimpl getexponentimpl;
        Throwable th;
        getExponentimpl getexponentimpl2;
        Throwable th2;
        DiskLruCache$Editor diskLruCache$EditorWrite;
        getLayoutDirectionui getlayoutdirectionui;
        getLayoutDirectionui getlayoutdirectionui2;
        DiskLruCache$Editor diskLruCache$Editor;
        getReverseDifferenceannotations getreversedifferenceannotations;
        getXorannotations getxorannotationsSerializer;
        getPoints getpoints2 = getpoints;
        createBlurEffect8A3gB4 createblureffect8a3gb7 = createblureffect8a3gb5;
        networkFetcher.getClass();
        if (continuationImpl instanceof RenderEffectVerificationHelper) {
            renderEffectVerificationHelper = (RenderEffectVerificationHelper) continuationImpl;
            int i = renderEffectVerificationHelper.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                renderEffectVerificationHelper.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                renderEffectVerificationHelper = new RenderEffectVerificationHelper(networkFetcher, continuationImpl);
            }
        } else {
            renderEffectVerificationHelper = new RenderEffectVerificationHelper(networkFetcher, continuationImpl);
        }
        Object getrectangleshapeannotations = renderEffectVerificationHelper.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = renderEffectVerificationHelper.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(getrectangleshapeannotations);
            if (networkFetcher.MediaBrowserCompatMediaItem.serializer.getWriteEnabled()) {
                toComposeIntRect tocomposeintrect = (toComposeIntRect) networkFetcher.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                renderEffectVerificationHelper.write = getpoints2;
                renderEffectVerificationHelper.IconCompatParcelizer = createblureffect8a3gb7;
                renderEffectVerificationHelper.RemoteActionCompatParcelizer = 1;
                ((getOutlineui) tocomposeintrect).getClass();
                int i3 = createblureffect8a3gb7.write;
                if (i3 == 304 && createblureffect8a3gb4 != null) {
                    getGraphicsDensityui getgraphicsdensityui = createblureffect8a3gb4.IconCompatParcelizer;
                    getGraphicsDensityui getgraphicsdensityui2 = createblureffect8a3gb7.IconCompatParcelizer;
                    getgraphicsdensityui.getClass();
                    Map map = getgraphicsdensityui.serializer;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), onContentCardDismissed.IconCompatParcelizer((Collection) entry.getValue()));
                    }
                    for (Map.Entry entry2 : getgraphicsdensityui2.serializer.entrySet()) {
                        String str = (String) entry2.getKey();
                        List list = (List) entry2.getValue();
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        linkedHashMap.put(lowerCase, onContentCardDismissed.IconCompatParcelizer((Collection) list));
                    }
                    getrectangleshapeannotations = new getRectangleShapeannotations(new createBlurEffect8A3gB4(createblureffect8a3gb7.write, createblureffect8a3gb7.read, createblureffect8a3gb7.MediaDescriptionCompat, new getGraphicsDensityui(onMove.serializer(linkedHashMap)), null, createblureffect8a3gb7.serializer));
                } else if ((200 <= i3 && i3 < 300) || getOutlineui.serializer.contains(new Integer(i3))) {
                    getrectangleshapeannotations = new getRectangleShapeannotations(createblureffect8a3gb7);
                } else {
                    getrectangleshapeannotations = getRectangleShapeannotations.serializer;
                }
                if (getrectangleshapeannotations == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (getpoints2 != null) {
                try {
                    af$$ExternalSyntheticOutline0.m(getpoints);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return null;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                getexponentimpl2 = renderEffectVerificationHelper.serializer;
                createBlurEffect8A3gB4 createblureffect8a3gb8 = renderEffectVerificationHelper.IconCompatParcelizer;
                createblureffect8a3gb7 = (createBlurEffect8A3gB4) renderEffectVerificationHelper.write;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(getrectangleshapeannotations);
                    createblureffect8a3gb6 = createblureffect8a3gb8;
                    try {
                        diskLruCache$Editor = (DiskLruCache$Editor) getexponentimpl2.read;
                        getreversedifferenceannotations = (getReverseDifferenceannotations) diskLruCache$Editor.serializer;
                        synchronized (getreversedifferenceannotations.PlaybackStateCompat) {
                            diskLruCache$Editor.serializer(true);
                            getxorannotationsSerializer = getreversedifferenceannotations.serializer(((getUnionannotations) diskLruCache$Editor.write).IconCompatParcelizer);
                        }
                        if (getxorannotationsSerializer != null) {
                            return new getPoints(getxorannotationsSerializer);
                        }
                        return null;
                    } catch (Exception e2) {
                        e = e2;
                        getexponentimpl = getexponentimpl2;
                        try {
                            ((DiskLruCache$Editor) getexponentimpl.read).serializer(false);
                        } catch (Exception unused2) {
                        }
                        getlayoutdirectionui = createblureffect8a3gb7.RemoteActionCompatParcelizer;
                        if (getlayoutdirectionui != null) {
                            try {
                                af$$ExternalSyntheticOutline0.m(getlayoutdirectionui);
                            } catch (RuntimeException e3) {
                                throw e3;
                            } catch (Exception unused3) {
                            }
                        }
                        getlayoutdirectionui2 = createblureffect8a3gb6.RemoteActionCompatParcelizer;
                        if (getlayoutdirectionui2 != null) {
                            try {
                                af$$ExternalSyntheticOutline0.m(getlayoutdirectionui2);
                                throw e;
                            } catch (RuntimeException e4) {
                                throw e4;
                            } catch (Exception unused4) {
                                throw e;
                            }
                        }
                        throw e;
                    }
                } catch (Exception e5) {
                    e = e5;
                    createblureffect8a3gb6 = createblureffect8a3gb8;
                    getexponentimpl = getexponentimpl2;
                    ((DiskLruCache$Editor) getexponentimpl.read).serializer(false);
                    getlayoutdirectionui = createblureffect8a3gb7.RemoteActionCompatParcelizer;
                    if (getlayoutdirectionui != null) {
                        af$$ExternalSyntheticOutline0.m(getlayoutdirectionui);
                    }
                    getlayoutdirectionui2 = createblureffect8a3gb6.RemoteActionCompatParcelizer;
                    if (getlayoutdirectionui2 != null) {
                        af$$ExternalSyntheticOutline0.m(getlayoutdirectionui2);
                        throw e;
                    }
                    throw e;
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        createBlurEffect8A3gB4 createblureffect8a3gb9 = renderEffectVerificationHelper.IconCompatParcelizer;
        getPoints getpoints3 = (getPoints) renderEffectVerificationHelper.write;
        ExtrasKt.RemoteActionCompatParcelizer(getrectangleshapeannotations);
        createblureffect8a3gb7 = createblureffect8a3gb9;
        getpoints2 = getpoints3;
        createblureffect8a3gb6 = ((getRectangleShapeannotations) getrectangleshapeannotations).read;
        if (createblureffect8a3gb6 != null) {
            int i4 = 8;
            if (getpoints2 != null) {
                getXorannotations getxorannotations = getpoints2.RemoteActionCompatParcelizer;
                getReverseDifferenceannotations getreversedifferenceannotations2 = getxorannotations.serializer;
                synchronized (getreversedifferenceannotations2.PlaybackStateCompat) {
                    getxorannotations.close();
                    diskLruCache$EditorWrite = getreversedifferenceannotations2.write(getxorannotations.RemoteActionCompatParcelizer.IconCompatParcelizer);
                }
                if (diskLruCache$EditorWrite != null) {
                    getexponentimpl = new getExponentimpl(i4, diskLruCache$EditorWrite);
                } else {
                    getexponentimpl = null;
                }
            } else {
                getWeight getweight = (getWeight) networkFetcher.read.MediaSessionCompatResultReceiverWrapper();
                if (getweight == null) {
                    getexponentimpl = null;
                } else {
                    String str2 = networkFetcher.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    if (str2 == null) {
                        str2 = networkFetcher.RatingCompat;
                    }
                    getReverseDifferenceannotations getreversedifferenceannotations3 = getweight.serializer;
                    RequestBuilder requestBuilder = RequestBuilder.EMPTY;
                    DiskLruCache$Editor diskLruCache$EditorWrite2 = getreversedifferenceannotations3.write(ImageHeaderParserImageType.serializer(str2).read("SHA-256").IconCompatParcelizer());
                    if (diskLruCache$EditorWrite2 != null) {
                        getexponentimpl = new getExponentimpl(i4, diskLruCache$EditorWrite2);
                    } else {
                        getexponentimpl = null;
                    }
                }
            }
            if (getexponentimpl != null) {
                try {
                    DateTimeConverter dateTimeConverterWrite = networkFetcher.write().write(((DiskLruCache$Editor) getexponentimpl.read).serializer(0), false);
                    dateTimeConverterWrite.getClass();
                    SingleRequest singleRequest = new SingleRequest(dateTimeConverterWrite);
                    try {
                        toAndroidRectF.write(createblureffect8a3gb6, singleRequest);
                        try {
                            singleRequest.close();
                            th = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            singleRequest.close();
                        } catch (Throwable th5) {
                            markOnScreenCardsAsReadlambda1.read(th, th5);
                        }
                    }
                    if (th == null) {
                        getLayoutDirectionui getlayoutdirectionui3 = createblureffect8a3gb6.RemoteActionCompatParcelizer;
                        if (getlayoutdirectionui3 != null) {
                            HttpUrlFetcher httpUrlFetcherWrite = networkFetcher.write();
                            RecyclableBufferedInputStream recyclableBufferedInputStreamSerializer = ((DiskLruCache$Editor) getexponentimpl.read).serializer(1);
                            renderEffectVerificationHelper.write = createblureffect8a3gb7;
                            renderEffectVerificationHelper.IconCompatParcelizer = createblureffect8a3gb6;
                            renderEffectVerificationHelper.serializer = getexponentimpl;
                            renderEffectVerificationHelper.RemoteActionCompatParcelizer = 2;
                            RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = getlayoutdirectionui3.serializer;
                            DateTimeConverter dateTimeConverterWrite2 = httpUrlFetcherWrite.write(recyclableBufferedInputStreamSerializer, false);
                            dateTimeConverterWrite2.getClass();
                            SingleRequest singleRequest2 = new SingleRequest(dateTimeConverterWrite2);
                            try {
                                new Long(registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer(singleRequest2));
                                try {
                                    singleRequest2.close();
                                    th2 = null;
                                } catch (Throwable th6) {
                                    th2 = th6;
                                }
                            } catch (Throwable th7) {
                                th2 = th7;
                                try {
                                    singleRequest2.close();
                                } catch (Throwable th8) {
                                    markOnScreenCardsAsReadlambda1.read(th2, th8);
                                }
                            }
                            if (th2 == null) {
                                if (createFromParcel.INSTANCE == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                throw th2;
                            }
                        }
                        getexponentimpl2 = getexponentimpl;
                        diskLruCache$Editor = (DiskLruCache$Editor) getexponentimpl2.read;
                        getreversedifferenceannotations = (getReverseDifferenceannotations) diskLruCache$Editor.serializer;
                        synchronized (getreversedifferenceannotations.PlaybackStateCompat) {
                            diskLruCache$Editor.serializer(true);
                            getxorannotationsSerializer = getreversedifferenceannotations.serializer(((getUnionannotations) diskLruCache$Editor.write).IconCompatParcelizer);
                            if (getxorannotationsSerializer != null) {
                                return new getPoints(getxorannotationsSerializer);
                            }
                            return null;
                        }
                    }
                    throw th;
                } catch (Exception e6) {
                    e = e6;
                    ((DiskLruCache$Editor) getexponentimpl.read).serializer(false);
                    getlayoutdirectionui = createblureffect8a3gb7.RemoteActionCompatParcelizer;
                    if (getlayoutdirectionui != null) {
                        af$$ExternalSyntheticOutline0.m(getlayoutdirectionui);
                    }
                    getlayoutdirectionui2 = createblureffect8a3gb6.RemoteActionCompatParcelizer;
                    if (getlayoutdirectionui2 != null) {
                        af$$ExternalSyntheticOutline0.m(getlayoutdirectionui2);
                        throw e;
                    }
                    throw e;
                }
            }
        }
        return null;
    }

    public static void IconCompatParcelizer(createBlurEffect8A3gB4 createblureffect8a3gb4) {
        int i = createblureffect8a3gb4.write;
        if ((200 > i || i >= 300) && i != 304) {
            throw new HttpException(c8$$ExternalSyntheticOutline0.m(i, "HTTP "));
        }
    }

    /* JADX INFO: renamed from: coil3.network.NetworkFetcher$fetch$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int IconCompatParcelizer = 0;
        private static int write = 1;
        public final /* synthetic */ int serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Object obj) {
            super(1, 0, Timber.Forest.class, obj, "e", "e(Ljava/lang/Throwable;)V");
            this.serializer = i;
            switch (i) {
                case 18:
                    super(1, 0, Timber.Forest.class, obj, "e", "e(Ljava/lang/Throwable;)V");
                    break;
                case 19:
                    super(1, 0, Timber.Forest.class, obj, "e", "e(Ljava/lang/Throwable;)V");
                    break;
                case 20:
                    super(1, 0, Timber.Forest.class, obj, "e", "e(Ljava/lang/Throwable;)V");
                    break;
                default:
                    break;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
            super(i, i2, cls, obj, str, str2);
            this.serializer = i3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BasePresenter basePresenter) {
            super(1, 0, BasePresenter.class, basePresenter, "onDialogMessageRequestEvent", "onDialogMessageRequestEvent(Lcom/roadrunner/push/event/DialogMessageRequestEvent;)V");
            this.serializer = 4;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LogoutActivity logoutActivity) {
            super(1, 0, LogoutActivity.class, logoutActivity, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/auth/logout/presentation/LogoutAction;)V");
            this.serializer = 12;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BiometricsActivity biometricsActivity) {
            super(1, 0, BiometricsActivity.class, biometricsActivity, "proceedWithBiometricResult", "proceedWithBiometricResult(Lcom/roadrunner/biometrics/presentation/BiometricResult;)V");
            this.serializer = 13;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CustomPasswordActivity customPasswordActivity) {
            super(1, 0, CustomPasswordActivity.class, customPasswordActivity, "goToMain", "goToMain(Ljava/lang/String;)V");
            this.serializer = 15;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CustomPasswordViewModel customPasswordViewModel) {
            super(1, 0, CustomPasswordViewModel.class, customPasswordViewModel, "onPasswordUpdated", "onPasswordUpdated(Ljava/lang/String;)V");
            this.serializer = 14;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CustomerChatsActivity customerChatsActivity) {
            super(1, 0, CustomerChatsActivity.class, customerChatsActivity, "handleAction", "handleAction(Lcom/roadrunner/customerchat/legacy/chatlist/presentation/CustomerChatsAction;)V");
            this.serializer = 17;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, int i) {
            super(1, 0, SelfServiceCustomerChatActivity.class, selfServiceCustomerChatActivity, "handleImageSharingResult", "handleImageSharingResult(Lcom/roadrunner/customerchat/selfservice/presentation/navigator/ImageSelectionResult;)V");
            this.serializer = i;
            if (i != 23) {
            } else {
                super(1, 0, SelfServiceCustomerChatActivity.class, selfServiceCustomerChatActivity, "handleUiEvent", "handleUiEvent(Lcom/roadrunner/customerchat/selfservice/presentation/WebChatUiEvent;)V");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet, int i) {
            super(1, 0, LasagnaDeclineBottomSheet.class, lasagnaDeclineBottomSheet, "updateUi", "updateUi(Lcom/roadrunner/delivery/accept/declinebutton/presentation/LasagnaDeclineBottomSheetViewState;)V");
            this.serializer = i;
            if (i != 28) {
            } else {
                super(1, 0, LasagnaDeclineBottomSheet.class, lasagnaDeclineBottomSheet, "handleMessageDialogAction", "handleMessageDialogAction(Lcom/ui/common/widget/message_dialog/MessageDialogViewModel$ResultAction;)V");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LasagnaDeclineComposeBottomSheet lasagnaDeclineComposeBottomSheet) {
            super(1, 0, LasagnaDeclineComposeBottomSheet.class, lasagnaDeclineComposeBottomSheet, "handleMessageDialogAction", "handleMessageDialogAction(Lcom/ui/common/widget/message_dialog/MessageDialogViewModel$ResultAction;)V");
            this.serializer = 29;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SingleEmitter singleEmitter) {
            super(1, 0, SingleEmitter.class, singleEmitter, "onSuccess", "onSuccess(Ljava/lang/Object;)V");
            this.serializer = 21;
        }

        /* JADX WARN: Code duplicated, block: B:142:0x046e  */
        /* JADX WARN: Code duplicated, block: B:148:0x04ab  */
        /* JADX WARN: Code duplicated, block: B:184:0x0554  */
        /* JADX WARN: Code duplicated, block: B:299:0x071c  */
        /* JADX WARN: Code duplicated, block: B:385:0x08a0  */
        /* JADX WARN: Code duplicated, block: B:388:0x08ac  */
        /* JADX WARN: Code duplicated, block: B:465:0x0a12  */
        /* JADX WARN: Code duplicated, block: B:466:0x0a16  */
        /* JADX WARN: Code duplicated, block: B:473:0x0a32  */
        /* JADX WARN: Code duplicated, block: B:486:0x0aa4  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v3, types: [com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            CommitTextCommand commitTextCommand;
            boolean z;
            getTopannotations gettopannotations;
            runAttachLifecycleui runattachlifecycleui;
            boolean z2;
            getTopannotations gettopannotations2;
            getTopannotations gettopannotations3;
            Integer numValueOf;
            int i;
            Object obj2;
            invalidateCallbacksFor invalidatecallbacksfor;
            int i2 = 2 % 2;
            int i3 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i4 = 0;
            int i5 = 1;
            ?? r7 = 0;
            switch (i3) {
                case 0:
                    return NetworkFetcher.access$doFetch((NetworkFetcher) this.MediaMetadataCompat, (ShortNewsContentCardView) obj);
                case 1:
                    KeyEvent keyEventM1890unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m1890unboximpl();
                    plus plusVar = (plus) this.MediaMetadataCompat;
                    runAttachLifecycleui runattachlifecycleui2 = plusVar.MediaDescriptionCompat;
                    boolean z3 = plusVar.IconCompatParcelizer;
                    if (keyEventM1890unboximpl.getAction() != 0 || Character.isISOControl(keyEventM1890unboximpl.getUnicodeChar())) {
                        commitTextCommand = null;
                    } else {
                        getBottomCenterannotations getbottomcenterannotations = plusVar.read;
                        getbottomcenterannotations.getClass();
                        int iM1903getUtf16CodePointZmokQxo = KeyEvent_androidKt.m1903getUtf16CodePointZmokQxo(keyEventM1890unboximpl);
                        if ((Integer.MIN_VALUE & iM1903getUtf16CodePointZmokQxo) != 0) {
                            getbottomcenterannotations.write = Integer.valueOf(iM1903getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
                            numValueOf = null;
                        } else {
                            Integer num = getbottomcenterannotations.write;
                            if (num != null) {
                                getbottomcenterannotations.write = null;
                                int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), iM1903getUtf16CodePointZmokQxo);
                                Integer numValueOf2 = Integer.valueOf(deadChar);
                                if (deadChar == 0) {
                                    numValueOf2 = null;
                                }
                                if (numValueOf2 != null) {
                                    iM1903getUtf16CodePointZmokQxo = numValueOf2.intValue();
                                }
                                numValueOf = Integer.valueOf(iM1903getUtf16CodePointZmokQxo);
                            } else {
                                numValueOf = Integer.valueOf(iM1903getUtf16CodePointZmokQxo);
                            }
                        }
                        if (numValueOf != null) {
                            commitTextCommand = new CommitTextCommand(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                        } else {
                            commitTextCommand = null;
                        }
                    }
                    if (commitTextCommand == null) {
                        if (KeyEventType.m1894equalsimpl0(KeyEvent_androidKt.m1902getTypeZmokQxo(keyEventM1890unboximpl), KeyEventType.Companion.m1898getKeyDownCS__XNY())) {
                            plusVar.RemoteActionCompatParcelizer.getClass();
                            int iRemoteActionCompatParcelizer = getBottom.RemoteActionCompatParcelizer(keyEventM1890unboximpl);
                            if (iRemoteActionCompatParcelizer == 9) {
                                long jM1901getKeyZmokQxo = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl);
                                Key.Companion companion = Key.Companion;
                                if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1658getDirectionLeftEK5gGoQ())) {
                                    gettopannotations = getTopannotations.SELECT_LINE_LEFT;
                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1659getDirectionRightEK5gGoQ())) {
                                    gettopannotations = getTopannotations.SELECT_LINE_RIGHT;
                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1660getDirectionUpEK5gGoQ())) {
                                    gettopannotations = getTopannotations.SELECT_HOME;
                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1655getDirectionDownEK5gGoQ())) {
                                    gettopannotations = getTopannotations.SELECT_END;
                                } else {
                                    z = false;
                                    gettopannotations = null;
                                }
                                z = false;
                            } else if (iRemoteActionCompatParcelizer == 1) {
                                long jM1901getKeyZmokQxo2 = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl);
                                Key.Companion companion2 = Key.Companion;
                                if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo2, companion2.m1658getDirectionLeftEK5gGoQ())) {
                                    gettopannotations = getTopannotations.LINE_LEFT;
                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo2, companion2.m1659getDirectionRightEK5gGoQ())) {
                                    gettopannotations = getTopannotations.LINE_RIGHT;
                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo2, companion2.m1660getDirectionUpEK5gGoQ())) {
                                    gettopannotations = getTopannotations.HOME;
                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo2, companion2.m1655getDirectionDownEK5gGoQ())) {
                                    gettopannotations = getTopannotations.END;
                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo2, companion2.m1599getBackspaceEK5gGoQ())) {
                                    int i6 = IconCompatParcelizer + 91;
                                    write = i6 % Fields.SpotShadowColor;
                                    if (i6 % 2 == 0) {
                                        gettopannotations = getTopannotations.DELETE_FROM_LINE_START;
                                        z = false;
                                        int i7 = 13 / 0;
                                    } else {
                                        z = false;
                                        gettopannotations = getTopannotations.DELETE_FROM_LINE_START;
                                    }
                                } else {
                                    z = false;
                                    gettopannotations = null;
                                }
                                z = false;
                            } else {
                                z = false;
                                gettopannotations = null;
                            }
                            int i8 = 8;
                            if (gettopannotations == null) {
                                int iRemoteActionCompatParcelizer2 = getBottom.RemoteActionCompatParcelizer(keyEventM1890unboximpl);
                                long jM1901getKeyZmokQxo3 = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl);
                                Key.Companion companion3 = Key.Companion;
                                if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo3, companion3.m1599getBackspaceEK5gGoQ())) {
                                    if (iRemoteActionCompatParcelizer2 == 0 || iRemoteActionCompatParcelizer2 == 8 || iRemoteActionCompatParcelizer2 == 12) {
                                        gettopannotations = getTopannotations.DELETE_PREV_CHAR;
                                    } else if (iRemoteActionCompatParcelizer2 == 2 || iRemoteActionCompatParcelizer2 == 10) {
                                        gettopannotations = getTopannotations.DELETE_PREV_WORD;
                                    } else {
                                        runattachlifecycleui = runattachlifecycleui2;
                                    }
                                    runattachlifecycleui = runattachlifecycleui2;
                                } else {
                                    runattachlifecycleui = runattachlifecycleui2;
                                    gettopannotations = ((Key.m1581equalsimpl0(jM1901getKeyZmokQxo3, companion3.m1668getEnterEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo3, companion3.m1765getNumPadEnterEK5gGoQ())) && (iRemoteActionCompatParcelizer2 == 0 || iRemoteActionCompatParcelizer2 == 8 || iRemoteActionCompatParcelizer2 == 2 || iRemoteActionCompatParcelizer2 == 10)) ? getTopannotations.NEW_LINE : null;
                                }
                                if (gettopannotations == null) {
                                    int iRemoteActionCompatParcelizer3 = getBottom.RemoteActionCompatParcelizer(keyEventM1890unboximpl);
                                    if (iRemoteActionCompatParcelizer3 == 10) {
                                        long jM1901getKeyZmokQxo4 = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl);
                                        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo4, companion3.m1658getDirectionLeftEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo4, companion3.m1760getNumPadDirectionLeftEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.SELECT_LEFT_WORD;
                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo4, companion3.m1659getDirectionRightEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo4, companion3.m1761getNumPadDirectionRightEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.SELECT_RIGHT_WORD;
                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo4, companion3.m1660getDirectionUpEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo4, companion3.m1762getNumPadDirectionUpEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.SELECT_PREV_PARAGRAPH;
                                        } else {
                                            if (!Key.m1581equalsimpl0(jM1901getKeyZmokQxo4, companion3.m1655getDirectionDownEK5gGoQ())) {
                                                int i9 = IconCompatParcelizer + 3;
                                                write = i9 % Fields.SpotShadowColor;
                                                if (i9 % 2 == 0) {
                                                    Key.m1581equalsimpl0(jM1901getKeyZmokQxo4, companion3.m1759getNumPadDirectionDownEK5gGoQ());
                                                    r7.hashCode();
                                                    throw null;
                                                }
                                                if (!Key.m1581equalsimpl0(jM1901getKeyZmokQxo4, companion3.m1759getNumPadDirectionDownEK5gGoQ())) {
                                                    gettopannotations = null;
                                                }
                                            }
                                            gettopannotations2 = getTopannotations.SELECT_NEXT_PARAGRAPH;
                                        }
                                        gettopannotations = gettopannotations2;
                                    } else if (iRemoteActionCompatParcelizer3 == 2) {
                                        int i10 = write + 63;
                                        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                                        int i11 = i10 % 2;
                                        long jM1901getKeyZmokQxo5 = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl);
                                        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1658getDirectionLeftEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1760getNumPadDirectionLeftEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.LEFT_WORD;
                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1659getDirectionRightEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1761getNumPadDirectionRightEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.RIGHT_WORD;
                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1660getDirectionUpEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1762getNumPadDirectionUpEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.PREV_PARAGRAPH;
                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1655getDirectionDownEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1759getNumPadDirectionDownEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.NEXT_PARAGRAPH;
                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1693getHEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.DELETE_PREV_CHAR;
                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1653getDeleteEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.DELETE_NEXT_WORD;
                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo5, companion3.m1598getBackslashEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.DESELECT;
                                        } else {
                                            gettopannotations = null;
                                        }
                                        gettopannotations = gettopannotations2;
                                    } else if (iRemoteActionCompatParcelizer3 == 8) {
                                        long jM1901getKeyZmokQxo6 = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl);
                                        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo6, companion3.m1734getMoveHomeEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo6, companion3.m1770getNumPadMoveHomeEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.SELECT_LINE_START;
                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo6, companion3.m1733getMoveEndEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo6, companion3.m1769getNumPadMoveEndEK5gGoQ())) {
                                            gettopannotations2 = getTopannotations.SELECT_LINE_END;
                                        } else {
                                            gettopannotations = null;
                                        }
                                        gettopannotations = gettopannotations2;
                                    } else if (iRemoteActionCompatParcelizer3 == 1 && Key.m1581equalsimpl0(KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl), companion3.m1653getDeleteEK5gGoQ())) {
                                        gettopannotations2 = getTopannotations.DELETE_TO_LINE_END;
                                        gettopannotations = gettopannotations2;
                                    } else {
                                        gettopannotations = null;
                                    }
                                    if (gettopannotations == null) {
                                        getStartannotations getstartannotations = getCenterStartannotations.RemoteActionCompatParcelizer.IconCompatParcelizer;
                                        int iRemoteActionCompatParcelizer4 = getBottom.RemoteActionCompatParcelizer(keyEventM1890unboximpl);
                                        if (iRemoteActionCompatParcelizer4 == 10) {
                                            if (Key.m1581equalsimpl0(KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl), Key.Companion.m1879getZEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.REDO;
                                                gettopannotations = gettopannotations3;
                                            } else {
                                                gettopannotations = null;
                                            }
                                        } else if (iRemoteActionCompatParcelizer4 == 2) {
                                            long jM1901getKeyZmokQxo7 = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl);
                                            Key.Companion companion4 = Key.Companion;
                                            if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo7, companion4.m1636getCEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo7, companion4.m1700getInsertEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo7, companion4.m1767getNumPadInsertEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.COPY;
                                            } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo7, companion4.m1868getVEK5gGoQ())) {
                                                int i12 = write + 55;
                                                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                                                if (i12 % 2 != 0) {
                                                    getTopannotations gettopannotations4 = getTopannotations.PASTE;
                                                    throw null;
                                                }
                                                gettopannotations3 = getTopannotations.PASTE;
                                            } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo7, companion4.m1876getXEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.CUT;
                                            } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo7, companion4.m1586getAEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.SELECT_ALL;
                                            } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo7, companion4.m1877getYEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.REDO;
                                            } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo7, companion4.m1879getZEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.UNDO;
                                            } else {
                                                gettopannotations = null;
                                            }
                                            gettopannotations = gettopannotations3;
                                        } else if (iRemoteActionCompatParcelizer4 == 8) {
                                            long jM1901getKeyZmokQxo8 = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl);
                                            Key.Companion companion5 = Key.Companion;
                                            if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1658getDirectionLeftEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1760getNumPadDirectionLeftEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.SELECT_LEFT_CHAR;
                                            } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1659getDirectionRightEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1761getNumPadDirectionRightEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.SELECT_RIGHT_CHAR;
                                            } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1660getDirectionUpEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1762getNumPadDirectionUpEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.SELECT_UP;
                                            } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1655getDirectionDownEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1759getNumPadDirectionDownEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.SELECT_DOWN;
                                            } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1781getPageUpEK5gGoQ())) {
                                                gettopannotations3 = getTopannotations.SELECT_PAGE_UP;
                                            } else {
                                                int i13 = write + 23;
                                                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                                                if (i13 % 2 != 0) {
                                                    Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1773getNumPadPageUpEK5gGoQ());
                                                    throw null;
                                                }
                                                if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1773getNumPadPageUpEK5gGoQ())) {
                                                    gettopannotations3 = getTopannotations.SELECT_PAGE_UP;
                                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1780getPageDownEK5gGoQ())) {
                                                    gettopannotations3 = getTopannotations.SELECT_PAGE_DOWN;
                                                } else {
                                                    int i14 = IconCompatParcelizer + 5;
                                                    write = i14 % Fields.SpotShadowColor;
                                                    int i15 = i14 % 2;
                                                    if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1772getNumPadPageDownEK5gGoQ())) {
                                                        gettopannotations3 = getTopannotations.SELECT_PAGE_DOWN;
                                                    } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1734getMoveHomeEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1770getNumPadMoveHomeEK5gGoQ())) {
                                                        gettopannotations3 = getTopannotations.SELECT_LINE_START;
                                                    } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1733getMoveEndEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1769getNumPadMoveEndEK5gGoQ())) {
                                                        gettopannotations3 = getTopannotations.SELECT_LINE_END;
                                                    } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1700getInsertEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo8, companion5.m1767getNumPadInsertEK5gGoQ())) {
                                                        gettopannotations3 = getTopannotations.PASTE;
                                                    } else {
                                                        gettopannotations = null;
                                                    }
                                                }
                                            }
                                            gettopannotations = gettopannotations3;
                                        } else {
                                            if (iRemoteActionCompatParcelizer4 == 0) {
                                                long jM1901getKeyZmokQxo9 = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEventM1890unboximpl);
                                                Key.Companion companion6 = Key.Companion;
                                                if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1658getDirectionLeftEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1760getNumPadDirectionLeftEK5gGoQ())) {
                                                    gettopannotations3 = getTopannotations.LEFT_CHAR;
                                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1659getDirectionRightEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1761getNumPadDirectionRightEK5gGoQ())) {
                                                    gettopannotations3 = getTopannotations.RIGHT_CHAR;
                                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1660getDirectionUpEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1762getNumPadDirectionUpEK5gGoQ())) {
                                                    gettopannotations3 = getTopannotations.UP;
                                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1655getDirectionDownEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1759getNumPadDirectionDownEK5gGoQ())) {
                                                    gettopannotations3 = getTopannotations.DOWN;
                                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1654getDirectionCenterEK5gGoQ())) {
                                                    gettopannotations3 = getTopannotations.CENTER;
                                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1781getPageUpEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1773getNumPadPageUpEK5gGoQ())) {
                                                    gettopannotations3 = getTopannotations.PAGE_UP;
                                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1780getPageDownEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1772getNumPadPageDownEK5gGoQ())) {
                                                    gettopannotations3 = getTopannotations.PAGE_DOWN;
                                                } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1734getMoveHomeEK5gGoQ())) {
                                                    gettopannotations3 = getTopannotations.LINE_START;
                                                } else {
                                                    int i16 = IconCompatParcelizer + 25;
                                                    write = i16 % Fields.SpotShadowColor;
                                                    int i17 = i16 % 2;
                                                    if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1770getNumPadMoveHomeEK5gGoQ())) {
                                                        gettopannotations3 = getTopannotations.LINE_START;
                                                    } else if (!Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1733getMoveEndEK5gGoQ())) {
                                                        int i18 = write + 109;
                                                        IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                                                        if (i18 % 2 != 0) {
                                                            Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1769getNumPadMoveEndEK5gGoQ());
                                                            throw null;
                                                        }
                                                        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1769getNumPadMoveEndEK5gGoQ())) {
                                                            gettopannotations3 = getTopannotations.LINE_END;
                                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1668getEnterEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1765getNumPadEnterEK5gGoQ())) {
                                                            gettopannotations3 = getTopannotations.NEW_LINE;
                                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1599getBackspaceEK5gGoQ())) {
                                                            gettopannotations3 = getTopannotations.DELETE_PREV_CHAR;
                                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1653getDeleteEK5gGoQ())) {
                                                            gettopannotations3 = getTopannotations.DELETE_NEXT_CHAR;
                                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1783getPasteEK5gGoQ())) {
                                                            gettopannotations3 = getTopannotations.PASTE;
                                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1651getCutEK5gGoQ())) {
                                                            gettopannotations3 = getTopannotations.CUT;
                                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1648getCopyEK5gGoQ())) {
                                                            gettopannotations3 = getTopannotations.COPY;
                                                        } else if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo9, companion6.m1829getTabEK5gGoQ())) {
                                                            gettopannotations3 = getTopannotations.TAB;
                                                        }
                                                    } else {
                                                        gettopannotations3 = getTopannotations.LINE_END;
                                                    }
                                                }
                                                gettopannotations = gettopannotations3;
                                            }
                                            gettopannotations = null;
                                        }
                                    }
                                }
                            } else {
                                runattachlifecycleui = runattachlifecycleui2;
                            }
                            if (gettopannotations != null) {
                                int i19 = IconCompatParcelizer + 79;
                                write = i19 % Fields.SpotShadowColor;
                                if (i19 % 2 == 0) {
                                    gettopannotations.getEditsText();
                                    r7.hashCode();
                                    throw null;
                                }
                                if (!gettopannotations.getEditsText() || z3) {
                                    cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
                                    cancelpendingwebviewpause.IconCompatParcelizer = true;
                                    ?? userJavascriptInterfaceBase$$ExternalSyntheticLambda12 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(gettopannotations, plusVar, cancelpendingwebviewpause, i8);
                                    TextFieldValue textFieldValue = plusVar.PlaybackStateCompatCustomAction;
                                    TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(textFieldValue, plusVar.serializer, plusVar.RatingCompat.serializer(), runattachlifecycleui);
                                    userJavascriptInterfaceBase$$ExternalSyntheticLambda12.invoke(textFieldPreparedSelection);
                                    if (TextRange.m3069equalsimpl0(textFieldPreparedSelection.MediaDescriptionCompat, textFieldValue.m3330getSelectiond9O1mEE())) {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textFieldPreparedSelection.IconCompatParcelizer, textFieldValue.getAnnotatedString()}, getCieXyz.write())).booleanValue()) {
                                            plusVar.MediaMetadataCompat.invoke(TextFieldValue.m3325copy3r_uNRQ$default(textFieldPreparedSelection.MediaMetadataCompat, textFieldPreparedSelection.IconCompatParcelizer, textFieldPreparedSelection.MediaDescriptionCompat, (TextRange) null, 4, (Object) null));
                                        }
                                    } else {
                                        plusVar.MediaMetadataCompat.invoke(TextFieldValue.m3325copy3r_uNRQ$default(textFieldPreparedSelection.MediaMetadataCompat, textFieldPreparedSelection.IconCompatParcelizer, textFieldPreparedSelection.MediaDescriptionCompat, (TextRange) null, 4, (Object) null));
                                    }
                                    getVerticalBias getverticalbias = plusVar.ParcelableVolumeInfo;
                                    if (getverticalbias != null) {
                                        int i20 = IconCompatParcelizer + 95;
                                        write = i20 % Fields.SpotShadowColor;
                                        int i21 = i20 % 2;
                                        getverticalbias.write = true;
                                    }
                                    z2 = cancelpendingwebviewpause.IconCompatParcelizer;
                                }
                            }
                        } else {
                            z = false;
                        }
                        z2 = z;
                    } else if (z3) {
                        plusVar.serializer((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{commitTextCommand}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
                        runattachlifecycleui2.serializer = null;
                        z2 = true;
                    } else {
                        z = false;
                        z2 = z;
                    }
                    return Boolean.valueOf(z2);
                case 2:
                    long jM487unboximpl = ((Offset) obj).m487unboximpl();
                    ExperimentalComposeUiApi experimentalComposeUiApi = (ExperimentalComposeUiApi) this.MediaMetadataCompat;
                    experimentalComposeUiApi.getClass();
                    getHighNSsRyOo gethighnssryoo = (getHighNSsRyOo) CompositionLocalConsumerModifierNodeKt.currentValueOf(experimentalComposeUiApi, unboximpl.write);
                    if (gethighnssryoo != null) {
                        BuildersKt.RemoteActionCompatParcelizer(experimentalComposeUiApi.getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(experimentalComposeUiApi, jM487unboximpl, gethighnssryoo, new ExperimentalMediaQueryApi(experimentalComposeUiApi, jM487unboximpl), (ShortNewsContentCardView) null), 3);
                    }
                    return createfromparcel;
                case 3:
                    ((BiasAlignmentVertical) this.MediaMetadataCompat).read.read((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
                    return createfromparcel;
                case 4:
                    access900 access900Var = (access900) obj;
                    access900Var.getClass();
                    BasePresenter basePresenter = (BasePresenter) this.MediaMetadataCompat;
                    WeakReference weakReference = basePresenter.read;
                    basePresenter.IconCompatParcelizer.write.onNext(new GraphicsLayer());
                    if (!access900Var.RemoteActionCompatParcelizer) {
                        if (access900Var.write) {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Receive payment done push notification", new Object[0]);
                        } else if (access900Var.serializer) {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Hide push dialog for back to back orders", new Object[0]);
                        } else {
                            DefaultForegroundSoundManager defaultForegroundSoundManager = basePresenter.serializer;
                            try {
                                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = defaultForegroundSoundManager.MediaSessionCompatResultReceiverWrapper;
                                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu == null || !r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = defaultForegroundSoundManager.PlaybackStateCompatCustomAction;
                                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                    defaultForegroundSoundManager.MediaSessionCompatResultReceiverWrapper = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new DefaultForegroundSoundManager$play$1(defaultForegroundSoundManager, r7, 0), 2);
                                } else {
                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Notification job is already running. Skipping play request", new Object[0]);
                                }
                            } catch (Exception e) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "An error occurred while playing notification from new sound manager", new Object[0]);
                            }
                            basePresenter.write.serializer();
                            MessageDialogData messageDialogData = new MessageDialogData(access900Var.PlaybackStateCompatCustomAction, access900Var.RatingCompat, access900Var.MediaMetadataCompat, false, access900Var.read, access900Var.MediaDescriptionCompat, access900Var.IconCompatParcelizer, access900Var.PlaybackStateCompat, access900Var.ParcelableVolumeInfo);
                            BaseActivity baseActivity = (BaseActivity) weakReference.get();
                            if (baseActivity != null) {
                                baseActivity.write(messageDialogData);
                            }
                        }
                        break;
                    } else {
                        BaseActivity baseActivity2 = (BaseActivity) weakReference.get();
                        if (baseActivity2 != null) {
                            baseActivity2.RemoteActionCompatParcelizer(access900Var.MediaDescriptionCompat, access900Var.ParcelableVolumeInfo);
                        }
                    }
                    return createfromparcel;
                case 5:
                    ((Timber.Forest) this.MediaMetadataCompat).write((Throwable) obj);
                    return createfromparcel;
                case 6:
                    ((Timber.Forest) this.MediaMetadataCompat).write((Throwable) obj);
                    return createfromparcel;
                case 7:
                    shareWithSiblings sharewithsiblings = (shareWithSiblings) obj;
                    sharewithsiblings.getClass();
                    NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
                    accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
                    accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer("/".concat(sharewithsiblings.write()));
                    return (Value) accesscontainsdescendantNewBuilder.serializer();
                case 8:
                    String str = (String) obj;
                    str.getClass();
                    MapboxDirectionsSession mapboxDirectionsSession = (MapboxDirectionsSession) this.MediaMetadataCompat;
                    mapboxDirectionsSession.getClass();
                    for (Object obj3 : DirectionsSessionKt.getRoutesPlusIgnored(mapboxDirectionsSession)) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((NavigationRoute) obj3).id, str}, getCieXyz.write())).booleanValue()) {
                            r7 = obj3;
                            return (NavigationRoute) r7;
                        }
                    }
                    return (NavigationRoute) r7;
                case 9:
                    UpdateRouteSuggestion updateRouteSuggestion = (UpdateRouteSuggestion) obj;
                    updateRouteSuggestion.getClass();
                    MapboxNavigation mapboxNavigation = (MapboxNavigation) this.MediaMetadataCompat;
                    mapboxNavigation.getClass();
                    mapboxNavigation.setNavigationRoutes(updateRouteSuggestion.newRoutes, 0, null);
                    return createfromparcel;
                case 10:
                    Expected expected = (Expected) obj;
                    expected.getClass();
                    ((ShortNewsContentCardView) this.MediaMetadataCompat).resumeWith(expected);
                    return createfromparcel;
                case 11:
                    Uri uri = (Uri) obj;
                    uri.getClass();
                    AdjustTrueLinkBrowsableActivity.write((AdjustTrueLinkBrowsableActivity) this.MediaMetadataCompat, uri);
                    return createfromparcel;
                case 12:
                    requestFocusdefault requestfocusdefault = (requestFocusdefault) obj;
                    requestfocusdefault.getClass();
                    LogoutActivity.IconCompatParcelizer((LogoutActivity) this.MediaMetadataCompat, requestfocusdefault);
                    return createfromparcel;
                case 13:
                    sortByGeometryGroupingsdefault sortbygeometrygroupingsdefault = (sortByGeometryGroupingsdefault) obj;
                    sortbygeometrygroupingsdefault.getClass();
                    BiometricsActivity.write((BiometricsActivity) this.MediaMetadataCompat, sortbygeometrygroupingsdefault);
                    return createfromparcel;
                case 14:
                    String str2 = (String) obj;
                    str2.getClass();
                    CustomPasswordViewModel customPasswordViewModel = (CustomPasswordViewModel) this.MediaMetadataCompat;
                    customPasswordViewModel.getClass();
                    MutableStateFlow mutableStateFlow = customPasswordViewModel.IconCompatParcelizer;
                    while (true) {
                        Object obj4 = mutableStateFlow.read();
                        invalidateCallbacksFor invalidatecallbacksfor2 = (invalidateCallbacksFor) obj4;
                        getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release = customPasswordViewModel.MediaBrowserCompatMediaItem;
                        List list = invalidatecallbacksfor2.write;
                        getsdkenablementproviderandroid_sdk_base_release.getClass();
                        ArrayList arrayList = getSdkEnablementProviderandroid_sdk_base_release.read(str2, list);
                        if (arrayList.isEmpty()) {
                            i = i5;
                        } else {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i = i5;
                                } else if (!((NullRequestDataException) it.next()).read) {
                                    i = i4;
                                }
                            }
                        }
                        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{customPasswordViewModel.write.read, str2}, getCieXyz.write())).booleanValue();
                        getOutputTransform awaitstarted = zBooleanValue ? new awaitStarted(customPasswordViewModel.MediaMetadataCompat.IconCompatParcelizer(R.string.custom_password_password_match_error)) : LifecycleRequestDelegate.write;
                        do {
                            obj2 = mutableStateFlow.read();
                            invalidatecallbacksfor = (invalidateCallbacksFor) obj2;
                        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, invalidateCallbacksFor.read(invalidatecallbacksfor, AndroidSystemCallbacksActivityCallbacks.write(invalidatecallbacksfor.serializer, null, awaitstarted, 3), false, null, false, 14)));
                        if (mutableStateFlow.RemoteActionCompatParcelizer(obj4, invalidateCallbacksFor.read(invalidatecallbacksfor2, AndroidSystemCallbacksActivityCallbacks.write(invalidatecallbacksfor2.serializer, str2, null, 6), (i == 0 || zBooleanValue) ? false : true, arrayList, false, 8))) {
                            return createfromparcel;
                        }
                        i4 = 0;
                        i5 = 1;
                    }
                    break;
                case 15:
                    String str3 = (String) obj;
                    str3.getClass();
                    CustomPasswordActivity.serializer((CustomPasswordActivity) this.MediaMetadataCompat, str3);
                    return createfromparcel;
                case 16:
                    ((Timber.Forest) this.MediaMetadataCompat).write((Throwable) obj);
                    return createfromparcel;
                case 17:
                    fractionVisibleInWindowWithInsetsE1MhUcY fractionvisibleinwindowwithinsetse1mhucy = (fractionVisibleInWindowWithInsetsE1MhUcY) obj;
                    fractionvisibleinwindowwithinsetse1mhucy.getClass();
                    CustomerChatsActivity.serializer((CustomerChatsActivity) this.MediaMetadataCompat, fractionvisibleinwindowwithinsetse1mhucy);
                    return createfromparcel;
                case 18:
                    ((Timber.Forest) this.MediaMetadataCompat).write((Throwable) obj);
                    return createfromparcel;
                case 19:
                    ((Timber.Forest) this.MediaMetadataCompat).write((Throwable) obj);
                    return createfromparcel;
                case 20:
                    ((Timber.Forest) this.MediaMetadataCompat).write((Throwable) obj);
                    return createfromparcel;
                case 21:
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    ((SingleEmitter) this.MediaMetadataCompat).IconCompatParcelizer(bool);
                    return createfromparcel;
                case 22:
                    copyxPh5V4g copyxph5v4g = (copyxPh5V4g) obj;
                    copyxph5v4g.getClass();
                    SelfServiceCustomerChatActivity.serializer((SelfServiceCustomerChatActivity) this.MediaMetadataCompat, copyxph5v4g);
                    return createfromparcel;
                case 23:
                    ParagraphDefaultImpls paragraphDefaultImpls = (ParagraphDefaultImpls) obj;
                    paragraphDefaultImpls.getClass();
                    SelfServiceCustomerChatActivity.read((SelfServiceCustomerChatActivity) this.MediaMetadataCompat, paragraphDefaultImpls);
                    return createfromparcel;
                case 24:
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    AutoAcceptPreferencesViewModel autoAcceptPreferencesViewModel = (AutoAcceptPreferencesViewModel) ((resolveSpanStyleDefaults) this.MediaMetadataCompat);
                    autoAcceptPreferencesViewModel.getClass();
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(autoAcceptPreferencesViewModel), null, null, new AutoAcceptPreferencesViewModel$onEndShiftToggle$1(autoAcceptPreferencesViewModel, zBooleanValue2, r7, i5), 3);
                    return createfromparcel;
                case 25:
                    boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                    AutoAcceptPreferencesViewModel autoAcceptPreferencesViewModel2 = (AutoAcceptPreferencesViewModel) ((resolveSpanStyleDefaults) this.MediaMetadataCompat);
                    autoAcceptPreferencesViewModel2.getClass();
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(autoAcceptPreferencesViewModel2), null, null, new AutoAcceptPreferencesViewModel$onEndShiftToggle$1(autoAcceptPreferencesViewModel2, zBooleanValue3, r7, i4), 3);
                    return createfromparcel;
                case 26:
                    String str4 = (String) obj;
                    str4.getClass();
                    drawTextLVfH_YU drawtextlvfh_yu = (drawTextLVfH_YU) this.MediaMetadataCompat;
                    drawtextlvfh_yu.getClass();
                    ((DeliveryAcceptButtonUiModelImpl) drawtextlvfh_yu.serializer.serializer.MediaSessionCompatResultReceiverWrapper()).read(str4);
                    return createfromparcel;
                case 27:
                    clipOutRect clipoutrect = (clipOutRect) obj;
                    clipoutrect.getClass();
                    LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet = (LasagnaDeclineBottomSheet) this.MediaMetadataCompat;
                    lasagnaDeclineBottomSheet.getClass();
                    TextStyleKt textStyleKt = clipoutrect.write;
                    UrlAnnotation urlAnnotation = textStyleKt instanceof UrlAnnotation ? (UrlAnnotation) textStyleKt : null;
                    if (urlAnnotation != null) {
                        accesssetDependencyp accesssetdependencyp = lasagnaDeclineBottomSheet.getNavigationEventDispatcher;
                        accesssetdependencyp.getClass();
                        ((TextView) accesssetdependencyp.write).setText(urlAnnotation.write);
                        accesssetDependencyp accesssetdependencyp2 = lasagnaDeclineBottomSheet.getNavigationEventDispatcher;
                        accesssetdependencyp2.getClass();
                        ((TextView) accesssetdependencyp2.MediaBrowserCompatMediaItem).setText(urlAnnotation.IconCompatParcelizer);
                        accesssetDependencyp accesssetdependencyp3 = lasagnaDeclineBottomSheet.getNavigationEventDispatcher;
                        accesssetdependencyp3.getClass();
                        ((getSUPPRESSannotations) accesssetdependencyp3.serializer).setText(urlAnnotation.read);
                        accesssetDependencyp accesssetdependencyp4 = lasagnaDeclineBottomSheet.getNavigationEventDispatcher;
                        accesssetdependencyp4.getClass();
                        ((getSUPPRESSannotations) accesssetdependencyp4.IconCompatParcelizer).setText(urlAnnotation.serializer);
                        accesssetDependencyp accesssetdependencyp5 = lasagnaDeclineBottomSheet.getNavigationEventDispatcher;
                        accesssetdependencyp5.getClass();
                        ((getSUPPRESSannotations) accesssetdependencyp5.read).setText(urlAnnotation.RemoteActionCompatParcelizer);
                    }
                    return createfromparcel;
                case 28:
                    nowInMillisecondslambda0 nowinmillisecondslambda0 = (nowInMillisecondslambda0) obj;
                    nowinmillisecondslambda0.getClass();
                    LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet2 = (LasagnaDeclineBottomSheet) this.MediaMetadataCompat;
                    if (nowinmillisecondslambda0 instanceof isValidTimeZone) {
                        lasagnaDeclineBottomSheet2.serializer().MediaDescriptionCompat();
                    } else {
                        lasagnaDeclineBottomSheet2.getClass();
                    }
                    return createfromparcel;
                default:
                    nowInMillisecondslambda0 nowinmillisecondslambda1 = (nowInMillisecondslambda0) obj;
                    nowinmillisecondslambda1.getClass();
                    LasagnaDeclineComposeBottomSheet lasagnaDeclineComposeBottomSheet = (LasagnaDeclineComposeBottomSheet) this.MediaMetadataCompat;
                    if (nowinmillisecondslambda1 instanceof isValidTimeZone) {
                        lasagnaDeclineComposeBottomSheet.serializer().MediaDescriptionCompat();
                        return createfromparcel;
                    }
                    lasagnaDeclineComposeBottomSheet.getClass();
                    if ((nowinmillisecondslambda1 instanceof nowInMillisecondsSystemClock) || (nowinmillisecondslambda1 instanceof nowInMilliseconds)) {
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
            }
        }
    }
}
