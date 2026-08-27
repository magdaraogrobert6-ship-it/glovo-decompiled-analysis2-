package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.MediaQueryKt;
import androidx.compose.ui.R;
import androidx.compose.ui.adaptive.MediaQuery_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.IntSize;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.util.UrlUtils;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidContentCaptureManagersendContentCaptureAppearEvents1;
import o.CacheDrawModifierNodeImpl;
import o.ContentType_androidKt;
import o.FillableData_androidKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessisRenderNodeCompatiblecp;
import o.asFrameworkPaint;
import o.createFromParcel;
import o.displayInAppMessagelambda11;
import o.displayInAppMessagelambda121;
import o.getBirthDateFull;
import o.getBirthDateYear;
import o.getBlock;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPersonMiddleInitial;
import o.getPersonNamePrefix;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getTransparent0d7_KjU;
import o.getType;
import o.getUnspecified0d7_KjU;
import o.hideTranslatedText;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setInternalPaintui_graphics;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeViewContextApi
public final class ComposeViewContext {
    public static final int $stable = 8;
    private final AndroidAccessibilityManager accessibilityManager;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 calculateWindowSizeLambda;
    private final ComposeViewContext$callback$1 callback;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboard clipboard;
    private final AndroidClipboardManager clipboardManager;
    private final getBirthDateYear compositionContext;
    private final PopulateViewStructure_androidKtpopulate7 configuration;
    private final Configuration currentConfiguration;
    private final PopulateViewStructure_androidKtpopulate7 fontFamilyResolver;
    private final Font.ResourceLoader fontLoader;
    private final HapticFeedback hapticFeedback;
    private final ImageVectorCache imageVectorCache;
    private final accessisRenderNodeCompatiblecp lifecycleOwner;
    private final ResourceIdCache resourceIdCache;
    private final getTransparent0d7_KjU savedStateRegistryOwner;
    private final LayoutNodeDrawScope sharedDrawScope;
    private long testWindowSize;
    private final AndroidUriHandler uriHandler;
    private final View view;
    private final AndroidViewConfiguration viewConfiguration;
    private int viewCount;
    private final asFrameworkPaint viewModelStoreOwner;
    private final LazyWindowInfo windowInfo;

    public static /* synthetic */ void getFontLoader$ui$annotations() {
    }

    public final AndroidAccessibilityManager getAccessibilityManager$ui() {
        return this.accessibilityManager;
    }

    public final CanvasHolder getCanvasHolder$ui() {
        return this.canvasHolder;
    }

    public final AndroidClipboard getClipboard$ui() {
        return this.clipboard;
    }

    public final AndroidClipboardManager getClipboardManager$ui() {
        return this.clipboardManager;
    }

    public final getBirthDateYear getCompositionContext$ui() {
        return this.compositionContext;
    }

    public final PopulateViewStructure_androidKtpopulate7 getConfiguration$ui() {
        return this.configuration;
    }

    public final PopulateViewStructure_androidKtpopulate7 getFontFamilyResolver$ui() {
        return this.fontFamilyResolver;
    }

    public final Font.ResourceLoader getFontLoader$ui() {
        return this.fontLoader;
    }

    public final HapticFeedback getHapticFeedback$ui() {
        return this.hapticFeedback;
    }

    public final ImageVectorCache getImageVectorCache$ui() {
        return this.imageVectorCache;
    }

    public final accessisRenderNodeCompatiblecp getLifecycleOwner$ui() {
        return this.lifecycleOwner;
    }

    public final ResourceIdCache getResourceIdCache$ui() {
        return this.resourceIdCache;
    }

    public final getTransparent0d7_KjU getSavedStateRegistryOwner$ui() {
        return this.savedStateRegistryOwner;
    }

    public final LayoutNodeDrawScope getSharedDrawScope$ui() {
        return this.sharedDrawScope;
    }

    /* JADX INFO: renamed from: getTestWindowSize-YbymL2g$ui, reason: not valid java name */
    public final long m2710getTestWindowSizeYbymL2g$ui() {
        return this.testWindowSize;
    }

    public final AndroidUriHandler getUriHandler$ui() {
        return this.uriHandler;
    }

    public final View getView$ui() {
        return this.view;
    }

    public final AndroidViewConfiguration getViewConfiguration$ui() {
        return this.viewConfiguration;
    }

    public final int getViewCount$ui() {
        return this.viewCount;
    }

    public final asFrameworkPaint getViewModelStoreOwner$ui() {
        return this.viewModelStoreOwner;
    }

    public final LazyWindowInfo getWindowInfo$ui() {
        return this.windowInfo;
    }

    /* JADX INFO: renamed from: setTestWindowSize-ozmzZPI$ui, reason: not valid java name */
    public final void m2711setTestWindowSizeozmzZPI$ui(long j) {
        this.testWindowSize = j;
    }

    private final void startObserving() {
        this.view.getContext().registerComponentCallbacks(this.callback);
        onConfigurationChanged$ui(this.view.getResources().getConfiguration());
        this.windowInfo.setWindowFocused(this.view.hasWindowFocus());
        this.windowInfo.setOnInitializeContainerSize(this.calculateWindowSizeLambda);
        LazyWindowInfo lazyWindowInfo = this.windowInfo;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.calculateWindowSizeLambda;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = lazyWindowInfo._containerSize;
        if (populateViewStructure_androidKtpopulate7 != null) {
            populateViewStructure_androidKtpopulate7.setValue(r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
        }
        this.view.getViewTreeObserver().addOnWindowFocusChangeListener(this.callback);
    }

    private final void stopObserving() {
        this.view.getContext().unregisterComponentCallbacks(this.callback);
        this.windowInfo.setOnInitializeContainerSize(null);
        this.view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.callback);
    }

    public final void onConfigurationChanged$ui(Configuration configuration) {
        int iUpdateFrom = this.currentConfiguration.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            this.imageVectorCache.prune(iUpdateFrom);
            this.configuration.setValue(new Configuration(configuration));
            this.resourceIdCache.clear();
            if ((268435456 & iUpdateFrom) != 0) {
                this.fontFamilyResolver.setValue(FontFamilyResolver_androidKt.createFontFamilyResolver(this.view.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                LazyWindowInfo lazyWindowInfo = this.windowInfo;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.calculateWindowSizeLambda;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = lazyWindowInfo._containerSize;
                if (populateViewStructure_androidKtpopulate7 != null) {
                    populateViewStructure_androidKtpopulate7.setValue(r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ComposeViewContext(ComposeViewContext composeViewContext, View view, getBirthDateYear getbirthdateyear, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getTransparent0d7_KjU gettransparent0d7_kju, asFrameworkPaint asframeworkpaint, boolean z) {
        ImageVectorCache imageVectorCache;
        Configuration configuration;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer;
        AndroidAccessibilityManager androidAccessibilityManager;
        AndroidUriHandler androidUriHandler;
        AndroidClipboardManager androidClipboardManager;
        AndroidClipboard androidClipboard;
        Font.ResourceLoader androidFontResourceLoader;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer;
        AndroidViewConfiguration androidViewConfiguration;
        CanvasHolder canvasHolder;
        LayoutNodeDrawScope layoutNodeDrawScope;
        ResourceIdCache resourceIdCache;
        this.view = view;
        this.compositionContext = getbirthdateyear;
        this.lifecycleOwner = accessisrendernodecompatiblecp;
        this.savedStateRegistryOwner = gettransparent0d7_kju;
        this.viewModelStoreOwner = asframeworkpaint;
        if (z) {
            composeViewContext.getClass();
            imageVectorCache = composeViewContext.imageVectorCache;
        } else {
            imageVectorCache = new ImageVectorCache();
        }
        this.imageVectorCache = imageVectorCache;
        this.resourceIdCache = (composeViewContext == null || (resourceIdCache = composeViewContext.resourceIdCache) == null) ? new ResourceIdCache() : resourceIdCache;
        if (z) {
            composeViewContext.getClass();
            configuration = composeViewContext.currentConfiguration;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.currentConfiguration = configuration;
        if (z) {
            composeViewContext.getClass();
            populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = composeViewContext.configuration;
        } else {
            populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(new Configuration(configuration));
        }
        this.configuration = populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer;
        if (z) {
            composeViewContext.getClass();
            androidAccessibilityManager = composeViewContext.accessibilityManager;
        } else {
            androidAccessibilityManager = new AndroidAccessibilityManager(view.getContext());
        }
        this.accessibilityManager = androidAccessibilityManager;
        if (z) {
            composeViewContext.getClass();
            androidUriHandler = composeViewContext.uriHandler;
        } else {
            androidUriHandler = new AndroidUriHandler(view.getContext());
        }
        this.uriHandler = androidUriHandler;
        if (z) {
            composeViewContext.getClass();
            androidClipboardManager = composeViewContext.clipboardManager;
        } else {
            androidClipboardManager = new AndroidClipboardManager(view.getContext());
        }
        this.clipboardManager = androidClipboardManager;
        if (z) {
            composeViewContext.getClass();
            androidClipboard = composeViewContext.clipboard;
        } else {
            androidClipboard = new AndroidClipboard(androidClipboardManager);
        }
        this.clipboard = androidClipboard;
        if (z) {
            composeViewContext.getClass();
            androidFontResourceLoader = composeViewContext.fontLoader;
        } else {
            androidFontResourceLoader = new AndroidFontResourceLoader(view.getContext());
        }
        this.fontLoader = androidFontResourceLoader;
        if (z) {
            composeViewContext.getClass();
            populateViewStructure_androidKtpopulate7Serializer = composeViewContext.fontFamilyResolver;
        } else {
            populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(FontFamilyResolver_androidKt.createFontFamilyResolver(view.getContext()), AndroidContentCaptureManager.read);
        }
        this.fontFamilyResolver = populateViewStructure_androidKtpopulate7Serializer;
        CanvasDrawScope canvasDrawScope = null;
        Object[] objArr = 0;
        this.hapticFeedback = view == (composeViewContext != null ? composeViewContext.view : null) ? composeViewContext.hapticFeedback : new PlatformHapticFeedback(view);
        if (z) {
            composeViewContext.getClass();
            androidViewConfiguration = composeViewContext.viewConfiguration;
        } else {
            androidViewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(view.getContext()));
        }
        this.viewConfiguration = androidViewConfiguration;
        this.sharedDrawScope = (composeViewContext == null || (layoutNodeDrawScope = composeViewContext.sharedDrawScope) == null) ? new LayoutNodeDrawScope(canvasDrawScope, 1, objArr == true ? 1 : 0) : layoutNodeDrawScope;
        this.windowInfo = new LazyWindowInfo();
        this.canvasHolder = (composeViewContext == null || (canvasHolder = composeViewContext.canvasHolder) == null) ? new CanvasHolder() : canvasHolder;
        this.testWindowSize = IntSize.Companion.m3849getZeroYbymL2g();
        this.calculateWindowSizeLambda = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.ComposeViewContext$calculateWindowSizeLambda$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final DerivedSize invoke() {
                return IntSize.m3842equalsimpl0(this.this$0.m2710getTestWindowSizeYbymL2g$ui(), IntSize.Companion.m3849getZeroYbymL2g()) ? AndroidWindowInfo_androidKt.calculateWindowSize(this.this$0.getView$ui()) : DerivedSize.Companion.m2721fromPxSizeviCIZxY(this.this$0.m2710getTestWindowSizeYbymL2g$ui(), AndroidDensity_androidKt.Density(this.this$0.getView$ui().getContext()));
            }

            {
                super(0);
            }
        };
        this.callback = new ComposeViewContext$callback$1(this);
    }

    public static /* synthetic */ ComposeViewContext copy$default(ComposeViewContext composeViewContext, View view, getBirthDateYear getbirthdateyear, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getTransparent0d7_KjU gettransparent0d7_kju, asFrameworkPaint asframeworkpaint, int i, Object obj) {
        if ((i & 1) != 0) {
            view = composeViewContext.view;
        }
        if ((i & 2) != 0) {
            getbirthdateyear = composeViewContext.compositionContext;
        }
        getBirthDateYear getbirthdateyear2 = getbirthdateyear;
        if ((i & 4) != 0) {
            accessisrendernodecompatiblecp = composeViewContext.lifecycleOwner;
        }
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2 = accessisrendernodecompatiblecp;
        if ((i & 8) != 0) {
            gettransparent0d7_kju = composeViewContext.savedStateRegistryOwner;
        }
        getTransparent0d7_KjU gettransparent0d7_kju2 = gettransparent0d7_kju;
        if ((i & 16) != 0) {
            asframeworkpaint = composeViewContext.viewModelStoreOwner;
        }
        return composeViewContext.copy(view, getbirthdateyear2, accessisrendernodecompatiblecp2, gettransparent0d7_kju2, asframeworkpaint);
    }

    public final void decrementViewCount$ui() {
        int i = this.viewCount - 1;
        this.viewCount = i;
        if (i < 0) {
            SentryLogcatAdapter.serializer("ComposeViewContext", "View count has dropped below 0");
            this.viewCount = 0;
        }
        if (this.viewCount == 0) {
            stopObserving();
        }
    }

    public final void incrementViewCount$ui() {
        int i = this.viewCount + 1;
        this.viewCount = i;
        if (i == 1) {
            startObserving();
        }
    }

    public final void ProvideCompositionLocals$ui(final AndroidComposeView androidComposeView, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(123858079);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(androidComposeView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(this) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof displayInAppMessagelambda121) && !(tag instanceof displayInAppMessagelambda11))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof displayInAppMessagelambda121) || (tag2 instanceof displayInAppMessagelambda11))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(getpostalcode.RatingCompat());
                getpostalcode.MediaSessionCompatResultReceiverWrapper = true;
                getpostalcode.fullyDrawnReporter_delegatelambda00 = true;
                getpostalcode.menuHostHelperlambda0.read();
                getpostalcode.ResultReceiver.read();
                getType gettype = getpostalcode.onBackPressedDispatcher_delegatelambda00;
                AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = gettype.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                gettype.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaBrowserCompatMediaItem;
                gettype.RemoteActionCompatParcelizer = androidContentCaptureManagersendContentCaptureAppearEvents1.write;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView, this.savedStateRegistryOwner);
                getpostalcode.write(objComponentActivity);
            }
            final DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) objComponentActivity;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(disposableSaveableStateRegistry);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$1$1
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                        final DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = disposableSaveableStateRegistry;
                        return new getPersonMiddleInitial() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$1$1$invoke$$inlined$onDispose$1
                            @Override // o.getPersonMiddleInitial
                            public void dispose() {
                                disposableSaveableStateRegistry2.dispose();
                            }
                        };
                    }
                };
                getpostalcode.write(objComponentActivity2);
            }
            getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode);
            boolean zBooleanValue = ((Boolean) getpostalcode.write(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue();
            boolean scrollCaptureInProgress$ui = androidComposeView.getScrollCaptureInProgress$ui();
            boolean z = getpostalcode.read(androidComposeView.getView());
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new ViewTreeHostDefaultProvider(androidComposeView.getView());
                getpostalcode.write(objComponentActivity3);
            }
            AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{setInternalPaintui_graphics.write.write(this.lifecycleOwner), getUnspecified0d7_KjU.IconCompatParcelizer.write(this.savedStateRegistryOwner), AndroidCompositionLocals_androidKt.getLocalImageVectorCache().write(this.imageVectorCache), AndroidCompositionLocals_androidKt.getLocalResourceIdCache().write(this.resourceIdCache), AndroidCompositionLocals_androidKt.getLocalContext().write(androidComposeView.getContext()), CacheDrawModifierNodeImpl.read.write(set), AndroidCompositionLocals_androidKt.getLocalConfiguration().write(androidComposeView.getConfiguration()), getBlock.read.write(disposableSaveableStateRegistry), AndroidCompositionLocals_androidKt.getLocalView().write(androidComposeView.getView()), CompositionLocalsKt.getLocalProvidableScrollCaptureInProgress().write(Boolean.valueOf(zBooleanValue | scrollCaptureInProgress$ui)), CompositionLocalsKt.getLocalViewConfiguration().write(androidComposeView.getViewConfiguration()), FillableData_androidKt.serializer.write((ViewTreeHostDefaultProvider) objComponentActivity3)}, ExtrasKt.write(1317454175, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i3) {
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(i3 & 1, (i3 & 3) != 2)) {
                        if (ComposeUiFlags.isMediaQueryIntegrationEnabled) {
                            getpostalcode2.serializer(866239106);
                            hideTranslatedText hidetranslatedtextWrite = MediaQueryKt.getLocalUiMediaScope().write(MediaQuery_androidKt.obtainUiMediaScope(androidComposeView.getContext(), androidComposeView.getView(), androidComposeView.getWindowInfo(), getpostalcode2, 0));
                            final AndroidComposeView androidComposeView2 = androidComposeView;
                            final ComposeViewContext composeViewContext = this;
                            final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                            AndroidContentCaptureManagerCompanion.read(hidetranslatedtextWrite, ExtrasKt.write(-1423844166, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void invoke(getBirthDateFull getbirthdatefull3, int i4) {
                                    getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                                    if (getpostalcode3.write(i4 & 1, (i4 & 3) != 2)) {
                                        CompositionLocalsKt.ProvideCommonCompositionLocals(androidComposeView2, composeViewContext.getUriHandler$ui(), r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getpostalcode3, 0);
                                    } else {
                                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }
                                }

                                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                                    return createFromParcel.INSTANCE;
                                }
                            }, getpostalcode2), getpostalcode2, 56);
                            getpostalcode2.IconCompatParcelizer(false);
                            return;
                        }
                        getpostalcode2.serializer(866651995);
                        CompositionLocalsKt.ProvideCommonCompositionLocals(androidComposeView, this.getUriHandler$ui(), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode2, 0);
                        getpostalcode2.IconCompatParcelizer(false);
                        return;
                    }
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i3) {
                    this.$tmp4_rcvr.ProvideCompositionLocals$ui(androidComposeView, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public final ComposeViewContext copy(View view, getBirthDateYear getbirthdateyear, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getTransparent0d7_KjU gettransparent0d7_kju, asFrameworkPaint asframeworkpaint) {
        return new ComposeViewContext(this, view, getbirthdateyear, accessisrendernodecompatiblecp, gettransparent0d7_kju, asframeworkpaint, false, 64, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComposeViewContext(ComposeViewContext composeViewContext, View view, getBirthDateYear getbirthdateyear, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getTransparent0d7_KjU gettransparent0d7_kju, asFrameworkPaint asframeworkpaint, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean zBooleanValue;
        View view2;
        if ((i & 64) != 0) {
            zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(composeViewContext == null || (view2 = composeViewContext.view) == null) ? null : view2.getContext(), view.getContext()}, getCieXyz.write())).booleanValue();
        } else {
            zBooleanValue = z;
        }
        this(composeViewContext, view, getbirthdateyear, accessisrendernodecompatiblecp, gettransparent0d7_kju, asframeworkpaint, zBooleanValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComposeViewContext(View view, getBirthDateYear getbirthdateyear, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getTransparent0d7_KjU gettransparent0d7_kju, asFrameworkPaint asframeworkpaint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        getBirthDateYear getbirthdateyearFindViewTreeCompositionContext;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2;
        getTransparent0d7_KjU gettransparent0d7_kjuRemoteActionCompatParcelizer;
        asFrameworkPaint asframeworkpaint2;
        if ((i & 2) != 0) {
            getbirthdateyearFindViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(view);
            if (getbirthdateyearFindViewTreeCompositionContext == null) {
                getbirthdateyearFindViewTreeCompositionContext = WindowRecomposer_androidKt.getWindowRecomposer(view);
            }
        } else {
            getbirthdateyearFindViewTreeCompositionContext = getbirthdateyear;
        }
        if ((i & 4) != 0) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            accessisrendernodecompatiblecp2 = (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1819368283, -1819368281, getCieXyz.write(), iWrite2, new Object[]{view}, iWrite3);
            if (accessisrendernodecompatiblecp2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                throw null;
            }
        } else {
            accessisrendernodecompatiblecp2 = accessisrendernodecompatiblecp;
        }
        if ((i & 8) != 0) {
            gettransparent0d7_kjuRemoteActionCompatParcelizer = UrlUtils.RemoteActionCompatParcelizer(view);
            if (gettransparent0d7_kjuRemoteActionCompatParcelizer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                throw null;
            }
        } else {
            gettransparent0d7_kjuRemoteActionCompatParcelizer = gettransparent0d7_kju;
        }
        if ((i & 16) != 0) {
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            asframeworkpaint2 = (asFrameworkPaint) BuildersKt.IconCompatParcelizer(-1340292176, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, 1340292178, new Object[]{view}, iRemoteActionCompatParcelizer);
        } else {
            asframeworkpaint2 = asframeworkpaint;
        }
        this(view, getbirthdateyearFindViewTreeCompositionContext, accessisrendernodecompatiblecp2, gettransparent0d7_kjuRemoteActionCompatParcelizer, asframeworkpaint2);
    }

    public ComposeViewContext(View view, getBirthDateYear getbirthdateyear, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getTransparent0d7_KjU gettransparent0d7_kju, asFrameworkPaint asframeworkpaint) {
        this(ComposeView_androidKt.findViewTreeComposeViewContext(view), view, getbirthdateyear, accessisrendernodecompatiblecp, gettransparent0d7_kju, asframeworkpaint, false, 64, null);
    }
}
