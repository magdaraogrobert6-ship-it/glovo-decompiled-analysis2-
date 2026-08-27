package com.roadrunner.freelancing.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.isRoot;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda4s7OvXv48SHY8g9QXR7tgugpjF8;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class GoAndStartDataStoreImpl$set$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoAndStartDataStoreImpl$set$2(r8lambda4s7OvXv48SHY8g9QXR7tgugpjF8 r8lambda4s7ovxv48shy8g9qxr7tgugpjf8, PushAnalyticsData pushAnalyticsData, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = r8lambda4s7ovxv48shy8g9qxr7tgugpjf8;
        this.RemoteActionCompatParcelizer = pushAnalyticsData;
        this.read = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoAndStartDataStoreImpl$set$2(isRoot isroot, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = isroot;
        this.read = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 95;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        boolean z = this.read;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            return new GoAndStartDataStoreImpl$set$2((r8lambda4s7OvXv48SHY8g9QXR7tgugpjF8) this.serializer, (PushAnalyticsData) obj3, z, shortNewsContentCardView);
        }
        GoAndStartDataStoreImpl$set$2 goAndStartDataStoreImpl$set$2 = new GoAndStartDataStoreImpl$set$2((isRoot) obj3, z, shortNewsContentCardView);
        goAndStartDataStoreImpl$set$2.serializer = obj;
        int i4 = write + 13;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return goAndStartDataStoreImpl$set$2;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        ((com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2) create((o.backwardFocusSearch) r5, (o.ShortNewsContentCardView) r6)).invokeSuspend(r2);
        r5 = com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2.MediaDescriptionCompat + 43;
        com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2.write = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        ((com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2) create((o.getContentViewGroupParentLayout) r5, (o.ShortNewsContentCardView) r6)).invokeSuspend(r2);
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2.write
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            int r1 = r4.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            r3 = 16
            int r3 = r3 / 0
            if (r1 == 0) goto L2d
            goto L1f
        L19:
            int r1 = r4.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            if (r1 == 0) goto L2d
        L1f:
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2 r5 = (com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2) r5
            r5.invokeSuspend(r2)
            return r2
        L2d:
            o.backwardFocusSearch r5 = (o.backwardFocusSearch) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2 r5 = (com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2) r5
            r5.invokeSuspend(r2)
            int r5 = com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2.MediaDescriptionCompat
            int r5 = r5 + 43
            int r6 = r5 % 128
            com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2.write = r6
            int r5 = r5 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 51;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        boolean z = this.read;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PushAnalyticsData pushAnalyticsData = (PushAnalyticsData) obj3;
            ((r8lambda4s7OvXv48SHY8g9QXR7tgugpjF8) this.serializer).IconCompatParcelizer.logEvent("push_notification_clicked", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("message_new_id", String.valueOf(pushAnalyticsData.write)), new onViewAttachedToWindowlambda0("notification_id", String.valueOf(pushAnalyticsData.RemoteActionCompatParcelizer)), new onViewAttachedToWindowlambda0("campaign_id", String.valueOf(pushAnalyticsData.read)), new onViewAttachedToWindowlambda0("execution_id", String.valueOf(pushAnalyticsData.serializer)), new onViewAttachedToWindowlambda0("template_name", String.valueOf(pushAnalyticsData.MediaMetadataCompat)), new onViewAttachedToWindowlambda0("is_app_in_foreground", String.valueOf(z))));
            int i4 = MediaDescriptionCompat + 83;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return createfromparcel2;
            }
            obj2.hashCode();
            throw null;
        }
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.serializer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        backwardfocussearch.write((isRoot) obj3, Boolean.valueOf(z));
        int i5 = MediaDescriptionCompat + 103;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return createfromparcel2;
        }
        obj2.hashCode();
        throw null;
    }
}
