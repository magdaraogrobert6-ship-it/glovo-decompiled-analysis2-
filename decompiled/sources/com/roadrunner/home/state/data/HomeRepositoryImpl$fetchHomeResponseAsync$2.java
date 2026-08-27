package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.hasPendingAdapterUpdates;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$fetchHomeResponseAsync$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final /* synthetic */ HomeRepositoryImpl MediaMetadataCompat;
    public boolean RatingCompat;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public hasPendingAdapterUpdates read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$fetchHomeResponseAsync$2(HomeRepositoryImpl homeRepositoryImpl, boolean z, String str, String str2, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaMetadataCompat = homeRepositoryImpl;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        HomeRepositoryImpl$fetchHomeResponseAsync$2 homeRepositoryImpl$fetchHomeResponseAsync$2 = new HomeRepositoryImpl$fetchHomeResponseAsync$2(this.MediaMetadataCompat, this.serializer, this.RemoteActionCompatParcelizer, this.write, shortNewsContentCardView);
        int i2 = MediaSessionCompatQueueItem + 29;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return homeRepositoryImpl$fetchHomeResponseAsync$2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 25;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((HomeRepositoryImpl$fetchHomeResponseAsync$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }
        ((HomeRepositoryImpl$fetchHomeResponseAsync$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb A[PHI: r1 r7
  0x00cb: PHI (r1v14 boolean) = (r1v12 boolean), (r1v17 boolean) binds: [B:24:0x00ac, B:29:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r7v1 o.hasPendingAdapterUpdates) = (r7v0 o.hasPendingAdapterUpdates), (r7v5 o.hasPendingAdapterUpdates) binds: [B:24:0x00ac, B:29:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x010c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:46:0x0123  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r8 == r10) goto L55;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponseAsync$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
