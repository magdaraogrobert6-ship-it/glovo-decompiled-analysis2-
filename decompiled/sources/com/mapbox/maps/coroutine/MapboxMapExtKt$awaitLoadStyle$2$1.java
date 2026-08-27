package com.mapbox.maps.coroutine;

import com.mapbox.maps.Style;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.ranges.RangesKt;
import o.ShortNewsContentCardView;
import o.getCieXyz;
import o.isInvalidIndex;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class MapboxMapExtKt$awaitLoadStyle$2$1 implements Style.OnStyleLoaded, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    final /* synthetic */ ShortNewsContentCardView<Style> $tmp0;

    /* JADX WARN: Multi-variable type inference failed */
    public MapboxMapExtKt$awaitLoadStyle$2$1(ShortNewsContentCardView<? super Style> shortNewsContentCardView) {
        this.$tmp0 = shortNewsContentCardView;
    }

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        return new FunctionReferenceImpl(1, 1, RangesKt.class, this.$tmp0, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V");
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style style) {
        style.getClass();
        this.$tmp0.resumeWith(style);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Style.OnStyleLoaded) || !(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
            return false;
        }
        Object[] objArr = {getFunctionDelegate(), ((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
