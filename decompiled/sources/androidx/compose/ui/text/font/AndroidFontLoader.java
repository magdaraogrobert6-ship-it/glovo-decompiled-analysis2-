package androidx.compose.ui.text.font;

import android.content.Context;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.isItemDismissable;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey;
    private final Context context;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1, reason: invalid class name */
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
            return AndroidFontLoader.this.awaitLoad(null, this);
        }
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }

    public AndroidFontLoader(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public android.graphics.Typeface loadBlocking(Font font) {
        Object isitemdismissable;
        android.graphics.Typeface typefaceLoad;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        if (font instanceof ResourceFont) {
            ResourceFont resourceFont = (ResourceFont) font;
            int iMo3134getLoadingStrategyPKNRLFQ = resourceFont.mo3134getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m3177equalsimpl0(iMo3134getLoadingStrategyPKNRLFQ, companion.m3182getBlockingPKNRLFQ())) {
                typefaceLoad = AndroidFontLoader_androidKt.load(resourceFont, this.context);
            } else if (FontLoadingStrategy.m3177equalsimpl0(iMo3134getLoadingStrategyPKNRLFQ, companion.m3183getOptionalLocalPKNRLFQ())) {
                try {
                    isitemdismissable = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
                } catch (Throwable th) {
                    isitemdismissable = new isItemDismissable(th);
                }
                typefaceLoad = (android.graphics.Typeface) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
            } else {
                if (FontLoadingStrategy.m3177equalsimpl0(iMo3134getLoadingStrategyPKNRLFQ, companion.m3181getAsyncPKNRLFQ())) {
                    IBraze$$ExternalSyntheticBUOutline0.m("Unsupported Async font load path");
                    return null;
                }
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(FontLoadingStrategy.m3179toStringimpl(resourceFont.mo3134getLoadingStrategyPKNRLFQ()), "Unknown loading type ");
            }
            return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceLoad, resourceFont.getVariationSettings(), this.context);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r8 == r1) goto L27;
     */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitLoad(androidx.compose.ui.text.font.Font r7, o.ShortNewsContentCardView<? super android.graphics.Typeface> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.AndroidFontLoader.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.ui.text.font.Font) r7
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L66
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r3
        L35:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            return r8
        L39:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            boolean r8 = r7 instanceof androidx.compose.ui.text.font.AndroidFont
            if (r8 == 0) goto L52
            androidx.compose.ui.text.font.AndroidFont r7 = (androidx.compose.ui.text.font.AndroidFont) r7
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r8 = r7.getTypefaceLoader()
            android.content.Context r2 = r6.context
            r0.label = r5
            java.lang.Object r7 = r8.awaitLoad(r2, r7, r0)
            if (r7 != r1) goto L51
            goto L65
        L51:
            return r7
        L52:
            boolean r8 = r7 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r8 == 0) goto L75
            r8 = r7
            androidx.compose.ui.text.font.ResourceFont r8 = (androidx.compose.ui.text.font.ResourceFont) r8
            android.content.Context r2 = r6.context
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.access$loadAsync(r8, r2, r0)
            if (r8 != r1) goto L66
        L65:
            return r1
        L66:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            androidx.compose.ui.text.font.ResourceFont r7 = (androidx.compose.ui.text.font.ResourceFont) r7
            androidx.compose.ui.text.font.FontVariation$Settings r7 = r7.getVariationSettings()
            android.content.Context r0 = r6.context
            android.graphics.Typeface r7 = androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(r8, r7, r0)
            return r7
        L75:
            java.lang.String r8 = "Unknown font type: "
            com.google.gson.Gson$$ExternalSyntheticBUOutline0.m(r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.awaitLoad(androidx.compose.ui.text.font.Font, o.ShortNewsContentCardView):java.lang.Object");
    }
}
