package androidx.compose.ui.text;

import androidx.collection.LruCache;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TextLayoutCache {
    public static final int $stable = 8;
    private final LruCache cache;
    private CacheTextLayoutInput singleSizeCacheInput;
    private TextLayoutResult singleSizeCacheResult;

    public final TextLayoutResult get(TextLayoutInput textLayoutInput) {
        TextLayoutResult textLayoutResult;
        CacheTextLayoutInput cacheTextLayoutInput = new CacheTextLayoutInput(textLayoutInput);
        LruCache lruCache = this.cache;
        if (lruCache != null) {
            textLayoutResult = (TextLayoutResult) lruCache.get(cacheTextLayoutInput);
        } else {
            Object[] objArr = {this.singleSizeCacheInput, cacheTextLayoutInput};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return null;
            }
            textLayoutResult = this.singleSizeCacheResult;
        }
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    public final void put(TextLayoutInput textLayoutInput, TextLayoutResult textLayoutResult) {
        LruCache lruCache = this.cache;
        if (lruCache != null) {
            lruCache.put(new CacheTextLayoutInput(textLayoutInput), textLayoutResult);
        } else {
            this.singleSizeCacheInput = new CacheTextLayoutInput(textLayoutInput);
            this.singleSizeCacheResult = textLayoutResult;
        }
    }

    public TextLayoutCache(int i) {
        this.cache = i != 1 ? new LruCache(i) : null;
    }

    public TextLayoutCache() {
        this(0, 1, null);
    }

    public /* synthetic */ TextLayoutCache(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
