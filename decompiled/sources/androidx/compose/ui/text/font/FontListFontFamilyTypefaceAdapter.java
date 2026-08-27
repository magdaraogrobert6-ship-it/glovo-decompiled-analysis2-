package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.DispatcherKt;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.UiMediaScopeViewingDistance;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getOnBackInvokedCallback;
import o.onAnimationEndlambda1;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relocationOffsetfbGrOKE;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    private getContentViewGroupParentLayout asyncLoadScope;
    private final AsyncTypefaceCache asyncTypefaceCache;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();
    private static final CoroutineExceptionHandler DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(getOnBackInvokedCallback.RemoteActionCompatParcelizer);

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes4.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ List<Font> $asyncLoads;
        final /* synthetic */ PlatformFontLoader $resourceLoader;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List<Font> list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontLoader platformFontLoader, ShortNewsContentCardView<? super AnonymousClass3> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$asyncLoads = list;
            this.this$0 = fontListFontFamilyTypefaceAdapter;
            this.$resourceLoader = platformFontLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$asyncLoads, this.this$0, this.$resourceLoader, shortNewsContentCardView);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.L$0;
                List<Font> list = this.$asyncLoads;
                relocationOffsetfbGrOKE relocationoffsetfbgroke = new relocationOffsetfbGrOKE(list.size());
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Font font = list.get(i2);
                    if (relocationoffsetfbgroke.serializer(font)) {
                        arrayList.add(font);
                    }
                }
                FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.this$0;
                PlatformFontLoader platformFontLoader = this.$resourceLoader;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, null, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (Font) arrayList.get(i3), platformFontLoader, null), 3));
                }
                this.label = 1;
                if (JobKt.joinAll(arrayList2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ AsyncFontListLoader $asyncLoader;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass1(this.$asyncLoader, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                AsyncFontListLoader asyncFontListLoader = this.$asyncLoader;
                this.label = 1;
                if (asyncFontListLoader.load(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AsyncFontListLoader asyncFontListLoader, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$asyncLoader = asyncFontListLoader;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel preload$lambda$3$0(TypefaceRequest typefaceRequest) {
        return createFromParcel.INSTANCE;
    }

    public final Object preload(FontFamily fontFamily, PlatformFontLoader platformFontLoader, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        if (fontFamily instanceof FontListFontFamily) {
            FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily;
            List<Font> fonts = fontListFontFamily.getFonts();
            List<Font> fonts2 = fontListFontFamily.getFonts();
            ArrayList arrayList = new ArrayList(fonts2.size());
            int size = fonts2.size();
            for (int i = 0; i < size; i++) {
                Font font = fonts2.get(i);
                if (FontLoadingStrategy.m3177equalsimpl0(font.mo3134getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m3181getAsyncPKNRLFQ())) {
                    arrayList.add(new onViewAttachedToWindowlambda0(font.getWeight(), FontStyle.m3187boximpl(font.mo3142getStyle_LCdwA())));
                }
            }
            relocationOffsetfbGrOKE relocationoffsetfbgroke = new relocationOffsetfbGrOKE(arrayList.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj = arrayList.get(i2);
                if (relocationoffsetfbgroke.serializer((onViewAttachedToWindowlambda0) obj)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) arrayList2.get(i3);
                FontWeight fontWeight = (FontWeight) onviewattachedtowindowlambda0.serializer;
                int iM3193unboximpl = ((FontStyle) onviewattachedtowindowlambda0.write).m3193unboximpl();
                List list = (List) FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m3186matchFontRetOiIg(fonts, fontWeight, iM3193unboximpl), new TypefaceRequest(fontFamily, fontWeight, iM3193unboximpl, FontSynthesis.Companion.m3207getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, new UiMediaScopeViewingDistance(28)).serializer;
                if (list != null) {
                    arrayList3.add(onContentCardDismissed.read(list));
                }
            }
            Object objCoroutineScope = YieldKt.coroutineScope(new AnonymousClass3(arrayList3, this, platformFontLoader, null), shortNewsContentCardView);
            if (objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objCoroutineScope;
            }
        }
        return createFromParcel.INSTANCE;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineExceptionHandler getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.fontMatcher;
        }

        private Companion() {
        }
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = YieldKt.RemoteActionCompatParcelizer(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(textAnnouncementContentCardView).plus(new onBackInvokedlambda0((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer))));
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0FirstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m3186matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m3237getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        List list = (List) onviewattachedtowindowlambda0FirstImmediatelyAvailable.serializer;
        Object obj = onviewattachedtowindowlambda0FirstImmediatelyAvailable.write;
        if (list == null) {
            return new TypefaceResult.Immutable(obj, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, obj, typefaceRequest, this.asyncTypefaceCache, r8lambdaunavo3sxub_pc9xroryotnrlvsm, platformFontLoader);
        BuildersKt.RemoteActionCompatParcelizer(this.asyncLoadScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(asyncFontListLoader, null), 1);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, TextAnnouncementContentCardView textAnnouncementContentCardView, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i & 2) != 0 ? r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write : textAnnouncementContentCardView);
    }
}
