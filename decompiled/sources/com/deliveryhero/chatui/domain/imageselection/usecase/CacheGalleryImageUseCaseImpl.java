package com.deliveryhero.chatui.domain.imageselection.usecase;

import coil3.ExtrasKt;
import com.deliveryhero.chatui.data.datasource.ImageCacheResolverImpl;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.GraphicsLayerImpl;
import o.GraphicsLayerV23;
import o.ShortNewsContentCardView;
import o.calculateMatrix;
import o.drawLayer;
import o.getHasDisplayList;
import o.getTestFailCreateRenderNodeui_graphics;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setOutline;
import o.setTopLeftgyyYBs;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheGalleryImageUseCaseImpl implements drawLayer {
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;

    public CacheGalleryImageUseCaseImpl(calculateMatrix calculatematrix, setTopLeftgyyYBs settopleftgyyybs) {
        this.RemoteActionCompatParcelizer = settopleftgyyybs;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    @Override // o.drawLayer
    public final Object cacheGalleryImage(String str, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        getTestFailCreateRenderNodeui_graphics gettestfailcreaterendernodeui_graphics;
        int i = this.read;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            if (!new File(str).exists()) {
                return new setOutline(new Throwable());
            }
            ((GraphicsLayerImpl) ((setTopLeftgyyYBs) obj)).write = str;
            return new GraphicsLayerV23(str);
        }
        if (shortNewsContentCardView instanceof getTestFailCreateRenderNodeui_graphics) {
            gettestfailcreaterendernodeui_graphics = (getTestFailCreateRenderNodeui_graphics) shortNewsContentCardView;
            int i2 = gettestfailcreaterendernodeui_graphics.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gettestfailcreaterendernodeui_graphics.read = i2 - Integer.MIN_VALUE;
            } else {
                gettestfailcreaterendernodeui_graphics = new getTestFailCreateRenderNodeui_graphics(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            gettestfailcreaterendernodeui_graphics = new getTestFailCreateRenderNodeui_graphics(this, (ContinuationImpl) shortNewsContentCardView);
        }
        Object objCacheImageFile = gettestfailcreaterendernodeui_graphics.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = gettestfailcreaterendernodeui_graphics.read;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objCacheImageFile);
            String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("JPEG_GALLERY_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()));
            gettestfailcreaterendernodeui_graphics.read = 1;
            objCacheImageFile = ((ImageCacheResolverImpl) ((getHasDisplayList) obj)).cacheImageFile(strSerializer, str, gettestfailcreaterendernodeui_graphics);
            if (objCacheImageFile == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objCacheImageFile);
        }
        String str2 = (String) objCacheImageFile;
        return str2 == null ? new setOutline(new RuntimeException("Failed to cache image file.")) : new GraphicsLayerV23(str2);
    }

    public CacheGalleryImageUseCaseImpl(getHasDisplayList gethasdisplaylist) {
        this.RemoteActionCompatParcelizer = gethasdisplaylist;
    }
}
