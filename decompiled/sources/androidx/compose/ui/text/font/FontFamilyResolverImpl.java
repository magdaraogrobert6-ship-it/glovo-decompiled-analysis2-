package androidx.compose.ui.text.font;

import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.InlineChildren;
import o.ShortNewsContentCardView;
import o.UiMediaScopeViewingDistance;
import o.createFromParcel;
import o.onViewAttachedToWindow;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    public static final int $stable = 8;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM createDefaultTypeface;
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final PlatformFontLoader platformFontLoader;
    private final PlatformResolveInterceptor platformResolveInterceptor;
    private final TypefaceRequestCache typefaceRequestCache;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FontFamilyResolverImpl.this.preload(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel preload$lambda$1$0(TypefaceResult.Immutable immutable) {
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel preload$lambda$1$1(TypefaceResult.Immutable immutable) {
        return createFromParcel.INSTANCE;
    }

    public final PlatformFontLoader getPlatformFontLoader$ui_text() {
        return this.platformFontLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypefaceResult preload$lambda$1(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        TypefaceResult typefaceResultResolve = fontFamilyResolverImpl.fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, fontFamilyResolverImpl.platformFontLoader, new UiMediaScopeViewingDistance(26), fontFamilyResolverImpl.createDefaultTypeface);
        if (typefaceResultResolve != null) {
            return typefaceResultResolve;
        }
        TypefaceResult typefaceResultResolve2 = fontFamilyResolverImpl.platformFamilyTypefaceAdapter.resolve(typefaceRequest, fontFamilyResolverImpl.platformFontLoader, new UiMediaScopeViewingDistance(27), fontFamilyResolverImpl.createDefaultTypeface);
        if (typefaceResultResolve2 != null) {
            return typefaceResultResolve2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not load font");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypefaceResult resolve$lambda$0(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        TypefaceResult typefaceResultResolve = fontFamilyResolverImpl.fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, fontFamilyResolverImpl.platformFontLoader, r8lambdaunavo3sxub_pc9xroryotnrlvsm, fontFamilyResolverImpl.createDefaultTypeface);
        if (typefaceResultResolve != null) {
            return typefaceResultResolve;
        }
        TypefaceResult typefaceResultResolve2 = fontFamilyResolverImpl.platformFamilyTypefaceAdapter.resolve(typefaceRequest, fontFamilyResolverImpl.platformFontLoader, r8lambdaunavo3sxub_pc9xroryotnrlvsm, fontFamilyResolverImpl.createDefaultTypeface);
        if (typefaceResultResolve2 != null) {
            return typefaceResultResolve2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not load font");
        return null;
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /* JADX INFO: renamed from: resolve-DPcqOEQ */
    public onViewAttachedToWindow mo3162resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.m3217interceptFontStyleT2F_aPo(i), this.platformResolveInterceptor.m3218interceptFontSynthesisMscr08Y(i2), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(platformFontLoader, (i & 2) != 0 ? PlatformResolveInterceptor.Companion.getDefault$ui_text() : platformResolveInterceptor, (i & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    public Object preload(FontFamily fontFamily, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!(fontFamily instanceof FontListFontFamily)) {
                return createfromparcel;
            }
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.fontListFontFamilyTypefaceAdapter;
            PlatformFontLoader platformFontLoader = this.platformFontLoader;
            anonymousClass1.L$0 = fontFamily;
            anonymousClass1.label = 1;
            if (fontListFontFamilyTypefaceAdapter.preload(fontFamily, platformFontLoader, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fontFamily = (FontFamily) anonymousClass1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        List<Font> fonts = ((FontListFontFamily) fontFamily).getFonts();
        ArrayList arrayList = new ArrayList(fonts.size());
        int size = fonts.size();
        for (int i3 = 0; i3 < size; i3++) {
            Font font = fonts.get(i3);
            arrayList.add(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(font.getWeight()), this.platformResolveInterceptor.m3217interceptFontStyleT2F_aPo(font.mo3142getStyle_LCdwA()), FontSynthesis.Companion.m3207getAllGVVA2EU(), this.platformFontLoader.getCacheKey(), null));
        }
        this.typefaceRequestCache.preWarmCache(arrayList, new InlineChildren(28, this));
        return createfromparcel;
    }

    private final onViewAttachedToWindow resolve(TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new Recomposer$$ExternalSyntheticLambda4(this, 10, typefaceRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createDefaultTypeface$lambda$0(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        return fontFamilyResolverImpl.resolve(TypefaceRequest.m3233copye1PVR60$default(typefaceRequest, null, null, 0, 0, null, 30, null)).getValue();
    }

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFontFamilyTypefaceAdapter;
        this.createDefaultTypeface = new RoomDatabase$$ExternalSyntheticLambda2(10, this);
    }
}
