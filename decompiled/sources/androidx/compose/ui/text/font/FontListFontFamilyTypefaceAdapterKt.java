package androidx.compose.ui.text.font;

import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.List;
import o.getQueryParameterslambda2;
import o.isItemDismissable;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final onViewAttachedToWindowlambda0 firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Object objInvoke;
        Object isitemdismissable;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Font font = list.get(i);
            int iMo3134getLoadingStrategyPKNRLFQ = font.mo3134getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m3177equalsimpl0(iMo3134getLoadingStrategyPKNRLFQ, companion.m3182getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                    if (asyncTypefaceResult == null) {
                        asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.MediaBrowserCompatMediaItem(key);
                    }
                    if (asyncTypefaceResult != null) {
                        objInvoke = asyncTypefaceResult.m3151unboximpl();
                    } else {
                        try {
                            objInvoke = platformFontLoader.loadBlocking(font);
                        } catch (Exception unused) {
                            objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(typefaceRequest);
                        }
                        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objInvoke, false, 8, null);
                    }
                }
                if (objInvoke == null) {
                    objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(typefaceRequest);
                }
                return new onViewAttachedToWindowlambda0(arrayList, FontSynthesis_androidKt.m3212synthesizeTypefaceFxwP2eA(typefaceRequest.m3238getFontSynthesisGVVA2EU(), objInvoke, font, typefaceRequest.getFontWeight(), typefaceRequest.m3237getFontStyle_LCdwA()));
            }
            if (FontLoadingStrategy.m3177equalsimpl0(iMo3134getLoadingStrategyPKNRLFQ, companion.m3183getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.MediaBrowserCompatMediaItem(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        isitemdismissable = asyncTypefaceResult2.m3151unboximpl();
                    } else {
                        try {
                            isitemdismissable = platformFontLoader.loadBlocking(font);
                        } catch (Throwable th) {
                            isitemdismissable = new isItemDismissable(th);
                        }
                        if (isitemdismissable instanceof isItemDismissable) {
                            isitemdismissable = null;
                        }
                        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, isitemdismissable, false, 8, null);
                    }
                }
                if (isitemdismissable != null) {
                    return new onViewAttachedToWindowlambda0(arrayList, FontSynthesis_androidKt.m3212synthesizeTypefaceFxwP2eA(typefaceRequest.m3238getFontSynthesisGVVA2EU(), isitemdismissable, font, typefaceRequest.getFontWeight(), typefaceRequest.m3237getFontStyle_LCdwA()));
                }
            } else if (FontLoadingStrategy.m3177equalsimpl0(iMo3134getLoadingStrategyPKNRLFQ, companion.m3181getAsyncPKNRLFQ())) {
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM3143get1ASDuI8 = asyncTypefaceCache.m3143get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM3143get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m3149isPermanentFailureimpl(asyncTypefaceResultM3143get1ASDuI8.m3151unboximpl()) && asyncTypefaceResultM3143get1ASDuI8.m3151unboximpl() != null) {
                        return new onViewAttachedToWindowlambda0(arrayList, FontSynthesis_androidKt.m3212synthesizeTypefaceFxwP2eA(typefaceRequest.m3238getFontSynthesisGVVA2EU(), asyncTypefaceResultM3143get1ASDuI8.m3151unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m3237getFontStyle_LCdwA()));
                    }
                } else if (arrayList == null) {
                    int iSerializer = getQueryParameterslambda2.serializer();
                    arrayList = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new Font[]{font}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer);
                } else {
                    arrayList.add(font);
                }
            } else {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(font, "Unknown font type ");
                return null;
            }
        }
        return new onViewAttachedToWindowlambda0(arrayList, r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(typefaceRequest));
    }
}
