package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class ScannedItemsCartButtonKt$ScannedItemsCartButton$3$1$rotationJob$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Animatable MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public final /* synthetic */ Animatable write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannedItemsCartButtonKt$ScannedItemsCartButton$3$1$rotationJob$1(Animatable animatable, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ScannedItemsCartButtonKt$ScannedItemsCartButton$3$1$rotationJob$1 scannedItemsCartButtonKt$ScannedItemsCartButton$3$1$rotationJob$1 = new ScannedItemsCartButtonKt$ScannedItemsCartButton$3$1$rotationJob$1(this.write, shortNewsContentCardView);
        int i2 = RatingCompat + 19;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return scannedItemsCartButtonKt$ScannedItemsCartButton$3$1$rotationJob$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 75;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((ScannedItemsCartButtonKt$ScannedItemsCartButton$3$1$rotationJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaSessionCompatQueueItem + 97;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:30:0x011d  */
    /* JADX WARN: Path cross not found for [B:4:0x0018, B:8:0x0024], limit reached: 35 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x011d -> B:31:0x0120). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedItemsCartButtonKt$ScannedItemsCartButton$3$1$rotationJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
