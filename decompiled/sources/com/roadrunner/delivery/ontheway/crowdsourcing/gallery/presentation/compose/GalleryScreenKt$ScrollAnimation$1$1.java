package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class GalleryScreenKt$ScrollAnimation$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ boolean read;
    public int serializer;
    public final /* synthetic */ ScrollState write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GalleryScreenKt$ScrollAnimation$1$1(boolean z, ScrollState scrollState, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = z;
        this.write = scrollState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.IconCompatParcelizer == 0) {
            return new GalleryScreenKt$ScrollAnimation$1$1(this.read, this.write, shortNewsContentCardView, 0);
        }
        GalleryScreenKt$ScrollAnimation$1$1 galleryScreenKt$ScrollAnimation$1$1 = new GalleryScreenKt$ScrollAnimation$1$1(this.read, this.write, shortNewsContentCardView, 1);
        int i3 = RemoteActionCompatParcelizer + 5;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return galleryScreenKt$ScrollAnimation$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 != 0) {
            Object objInvokeSuspend = ((GalleryScreenKt$ScrollAnimation$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = MediaBrowserCompatMediaItem + 23;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        Object objInvokeSuspend2 = ((GalleryScreenKt$ScrollAnimation$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaBrowserCompatMediaItem + 87;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvokeSuspend2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r9 != 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r1 = com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt$ScrollAnimation$1$1.RemoteActionCompatParcelizer + 117;
        com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt$ScrollAnimation$1$1.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
        r11 = 36 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r11 = r6.read();
        r10.serializer = 1;
        r11 = androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(r6, r11 - r6.serializer(), new o.width(7, null), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r11 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r11 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r9 = r10.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r9 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r9 != 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        r1 = com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt$ScrollAnimation$1$1.RemoteActionCompatParcelizer + 9;
        com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt$ScrollAnimation$1$1.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if ((r1 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
        r11 = com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt$ScrollAnimation$1$1.MediaBrowserCompatMediaItem + 15;
        com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt$ScrollAnimation$1$1.RemoteActionCompatParcelizer = r11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r7 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        r11 = r6.read();
        r10.serializer = 1;
        r11 = androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(r6, r11 - r6.serializer(), new o.width(7, null), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        if (r11 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if (r11 != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        r11 = com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt$ScrollAnimation$1$1.MediaBrowserCompatMediaItem + 43;
        com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt$ScrollAnimation$1$1.RemoteActionCompatParcelizer = r11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r9 = r10.serializer;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt$ScrollAnimation$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
