package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import androidx.compose.ui.graphics.Fields;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.logErrorui_tooling;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdatGneqyXrP1uOJD5LacwlDLETgw8;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadPictureUseCaseImpl$invoke$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int ComponentActivity = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public int IconCompatParcelizer;
    public UploadPictureUseCaseImpl MediaBrowserCompatMediaItem;
    public Iterator MediaDescriptionCompat;
    public logErrorui_tooling MediaMetadataCompat;
    public long MediaSessionCompatQueueItem;
    public r8lambdatGneqyXrP1uOJD5LacwlDLETgw8 MediaSessionCompatResultReceiverWrapper;
    public String MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public List PlaybackStateCompat;
    public createBrazeUserChangeEventSubscriberlambda01 PlaybackStateCompatCustomAction;
    public Iterator RatingCompat;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ UploadPictureUseCaseImpl r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int read;
    public int serializer;
    public final /* synthetic */ logErrorui_tooling write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadPictureUseCaseImpl$invoke$2(logErrorui_tooling logerrorui_tooling, UploadPictureUseCaseImpl uploadPictureUseCaseImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = logerrorui_tooling;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = uploadPictureUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        UploadPictureUseCaseImpl$invoke$2 uploadPictureUseCaseImpl$invoke$2 = new UploadPictureUseCaseImpl$invoke$2(this.write, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, shortNewsContentCardView);
        int i2 = ComponentActivity + 71;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return uploadPictureUseCaseImpl$invoke$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 71;
        ComponentActivity = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((UploadPictureUseCaseImpl$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        Object objInvokeSuspend = ((UploadPictureUseCaseImpl$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = 86 / 0;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0141  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String, java.util.Iterator, java.util.List, o.createBrazeUserChangeEventSubscriberlambda01] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01bd -> B:59:0x01cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x023a -> B:75:0x024d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.domain.UploadPictureUseCaseImpl$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
