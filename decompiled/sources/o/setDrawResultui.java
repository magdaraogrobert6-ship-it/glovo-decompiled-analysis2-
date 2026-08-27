package o;

import androidx.camera.video.Recorder$3;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
public final class setDrawResultui {
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] serializer;
    public final i$d IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public final Recorder$3 MediaSessionCompatQueueItem;
    public final i$d RatingCompat;
    public final Recorder$3 RemoteActionCompatParcelizer;
    public final accesstoPxR2X_6ojd read;
    public final androidx.camera.view.PendingValue write;
    public final ClipKt MediaMetadataCompat = new ClipKt("parent");
    public final setGraphicsContextProviderui MediaSessionCompatToken = new setGraphicsContextProviderui(this, new DrawModifierKt(null, "wrap"));
    public final setGraphicsContextProviderui MediaDescriptionCompat = new setGraphicsContextProviderui(this, new DrawModifierKt(null, "wrap"));

    public static void read(setDrawResultui setdrawresultui, clip clipVar, clip clipVar2, float f, int i) {
        float fM3673constructorimpl = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        if ((i & 8) != 0) {
            f = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        }
        float fM3673constructorimpl2 = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        float fM3673constructorimpl3 = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        float f2 = (i & 64) != 0 ? 0.5f : 1.0f;
        setdrawresultui.RatingCompat.serializer(clipVar, fM3673constructorimpl, fM3673constructorimpl2);
        setdrawresultui.IconCompatParcelizer.serializer(clipVar2, f, fM3673constructorimpl3);
        setdrawresultui.read.IconCompatParcelizer(f2, "hRtlBias");
    }

    public setDrawResultui(Object obj, accesstoPxR2X_6ojd accesstopxr2x_6ojd) {
        this.MediaBrowserCompatMediaItem = obj;
        this.read = accesstopxr2x_6ojd;
        this.RatingCompat = new i$d(-2, accesstopxr2x_6ojd);
        this.MediaSessionCompatQueueItem = new Recorder$3(0, accesstopxr2x_6ojd);
        this.IconCompatParcelizer = new i$d(-1, accesstopxr2x_6ojd);
        this.RemoteActionCompatParcelizer = new Recorder$3(1, accesstopxr2x_6ojd);
        this.write = new androidx.camera.view.PendingValue(21, accesstopxr2x_6ojd);
        new setCacheParamsui(this, 1.0f, null);
        new setCacheParamsui(this, 1.0f, null);
        new setCacheParamsui(this, 0.0f, null);
        new setCacheParamsui(this, 0.0f, null);
        new setCacheParamsui(this, 0.0f, null);
        new setGraphicsContextProviderui(this, androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f));
        new setGraphicsContextProviderui(this, androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f));
        new setGraphicsContextProviderui(this, androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f));
        new setCacheParamsui(this, 0.5f, null);
        new setCacheParamsui(this, 0.5f, null);
        new setCacheParamsui(this, Float.NaN, "hWeight");
        new setCacheParamsui(this, Float.NaN, "vWeight");
    }

    public static void write(setDrawResultui setdrawresultui, ClipKt clipKt) {
        setdrawresultui.getClass();
        CacheDrawScopeonDrawBehind1 cacheDrawScopeonDrawBehind1 = clipKt.MediaDescriptionCompat;
        CacheDrawScopeonDrawBehind1 cacheDrawScopeonDrawBehind2 = clipKt.write;
        float fM3673constructorimpl = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        float fM3673constructorimpl2 = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        float fM3673constructorimpl3 = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        float fM3673constructorimpl4 = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        setdrawresultui.MediaSessionCompatQueueItem.IconCompatParcelizer(cacheDrawScopeonDrawBehind1, fM3673constructorimpl, fM3673constructorimpl3);
        setdrawresultui.RemoteActionCompatParcelizer.IconCompatParcelizer(cacheDrawScopeonDrawBehind2, fM3673constructorimpl2, fM3673constructorimpl4);
        setdrawresultui.read.IconCompatParcelizer(0.5f, "vBias");
    }

    public final void IconCompatParcelizer(DrawModifierKt drawModifierKt) {
        this.MediaDescriptionCompat.setValue(this, serializer[1], drawModifierKt);
    }

    public final void serializer(DrawModifierKt drawModifierKt) {
        this.MediaSessionCompatToken.setValue(this, serializer[0], drawModifierKt);
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(setDrawResultui.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        serializer = new registerInAppMessageManagerlambda2[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(setDrawResultui.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0), new MutablePropertyReference1Impl(setDrawResultui.class, RemoteMessageConst.Notification.VISIBILITY, "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "scaleX", "getScaleX()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "scaleY", "getScaleY()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "rotationX", "getRotationX()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "rotationY", "getRotationY()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "rotationZ", "getRotationZ()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "pivotX", "getPivotX()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "pivotY", "getPivotY()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0), new MutablePropertyReference1Impl(setDrawResultui.class, "verticalChainWeight", "getVerticalChainWeight()F", 0)};
    }
}
