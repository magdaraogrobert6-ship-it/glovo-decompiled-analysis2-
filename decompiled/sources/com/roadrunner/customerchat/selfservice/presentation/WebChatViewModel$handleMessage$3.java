package com.roadrunner.customerchat.selfservice.presentation;

import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.gnsslocation.core.bean.log.GpsRtiItem;
import com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl;
import io.grpc.internal.SharedResourcePool;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidParagraph;
import o.Bullet;
import o.ShortNewsContentCardView;
import o.addSpans;
import o.createFromParcel;
import o.fromHtml;
import o.getLineCount;
import o.getLineEllipsisCountui_text;
import o.getParagraph;
import o.getStartLineIndex;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toAnnotatedStringdefault;
import o.updateOffsetsLDcG7Xg;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatViewModel$handleMessage$3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ updateOffsetsLDcG7Xg IconCompatParcelizer;
    public final /* synthetic */ WebChatViewModel RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ int serializer = 1;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatViewModel$handleMessage$3(updateOffsetsLDcG7Xg updateoffsetsldcg7xg, WebChatViewModel webChatViewModel, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = updateoffsetsldcg7xg;
        this.RemoteActionCompatParcelizer = webChatViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatViewModel$handleMessage$3(ShortNewsContentCardView shortNewsContentCardView, WebChatViewModel webChatViewModel, updateOffsetsLDcG7Xg updateoffsetsldcg7xg) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = webChatViewModel;
        this.IconCompatParcelizer = updateoffsetsldcg7xg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r0 = new com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3(r2, r3, r7);
        r0.write = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = new com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3(r7, r3, r2);
        r1.write = r6;
        r6 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.RatingCompat + 47;
        com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.MediaDescriptionCompat = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r6, o.ShortNewsContentCardView r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.RatingCompat
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            int r1 = r5.serializer
            o.updateOffsetsLDcG7Xg r2 = r5.IconCompatParcelizer
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel r3 = r5.RemoteActionCompatParcelizer
            r4 = 26
            int r4 = r4 / 0
            if (r1 == 0) goto L34
            goto L23
        L1b:
            int r1 = r5.serializer
            o.updateOffsetsLDcG7Xg r2 = r5.IconCompatParcelizer
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel r3 = r5.RemoteActionCompatParcelizer
            if (r1 == 0) goto L34
        L23:
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3 r1 = new com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3
            r1.<init>(r7, r3, r2)
            r1.write = r6
            int r6 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.RatingCompat
            int r6 = r6 + 47
            int r7 = r6 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.MediaDescriptionCompat = r7
            int r6 = r6 % r0
            return r1
        L34:
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3 r0 = new com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3
            r0.<init>(r2, r3, r7)
            r0.write = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return ((com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3) create((o.getContentViewGroupParentLayout) r5, (o.ShortNewsContentCardView) r6)).invokeSuspend(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r5 = ((com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3) create((com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl) r5, (o.ShortNewsContentCardView) r6)).invokeSuspend(r2);
        r6 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.RatingCompat + 27;
        com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.MediaDescriptionCompat = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != 0) goto L9;
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
            int r1 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.RatingCompat
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            int r1 = r4.serializer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            r3 = 59
            int r3 = r3 / 0
            if (r1 == 0) goto L2e
            goto L1f
        L19:
            int r1 = r4.serializer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            if (r1 == 0) goto L2e
        L1f:
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3 r5 = (com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            return r5
        L2e:
            com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl r5 = (com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3 r5 = (com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            int r6 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.RatingCompat
            int r6 = r6 + 27
            int r1 = r6 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.MediaDescriptionCompat = r1
            int r6 = r6 % r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$handleMessage$3.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0089 A[Catch: all -> 0x002d, Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:7:0x0027, B:20:0x007b, B:22:0x0089, B:17:0x005a), top: B:55:0x0023, outer: #1 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        Object objAccess$fetchPhoneNumber;
        Throwable thSerializer;
        Object obj5;
        int i = 2 % 2;
        int i2 = this.serializer;
        Object obj6 = createFromParcel.INSTANCE;
        updateOffsetsLDcG7Xg updateoffsetsldcg7xg = this.IconCompatParcelizer;
        WebChatViewModel webChatViewModel = this.RemoteActionCompatParcelizer;
        Object obj7 = null;
        if (i2 == 0) {
            WebChatEventsTrackerImpl webChatEventsTrackerImpl = (WebChatEventsTrackerImpl) this.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.read;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj6;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getLineCount getlinecount = ((getLineEllipsisCountui_text) updateoffsetsldcg7xg).payload.error;
            if (getlinecount != null) {
                int i4 = MediaDescriptionCompat + 13;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    String str2 = getlinecount.type;
                    obj7.hashCode();
                    throw null;
                }
                str = getlinecount.type;
            } else {
                str = null;
            }
            String strValueOf = String.valueOf(str);
            Bullet bullet = (Bullet) WebChatViewModel.IconCompatParcelizer(-1484783990, new Object[]{webChatViewModel}, GpsRtiItem.write(), 1484783990, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
            this.write = null;
            this.read = 1;
            webChatEventsTrackerImpl.getClass();
            Object objIfTrackingEnabled = webChatEventsTrackerImpl.ifTrackingEnabled(new TooltipStateImpl.AnonymousClass2(webChatEventsTrackerImpl, bullet, strValueOf, null, 11), this);
            if (objIfTrackingEnabled != coroutineSingletons) {
                objIfTrackingEnabled = obj6;
            }
            if (objIfTrackingEnabled != coroutineSingletons) {
                return obj6;
            }
            int i5 = RatingCompat + 63;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return coroutineSingletons;
        }
        SharedResourcePool sharedResourcePool = webChatViewModel.RemoteActionCompatParcelizer;
        toAnnotatedStringdefault toannotatedstringdefault = webChatViewModel._init_lambda4;
        MutableStateFlow mutableStateFlow = webChatViewModel.serializer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.read;
        try {
            try {
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    do {
                        obj4 = mutableStateFlow.read();
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj4, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj4, null, false, false, null, false, true, 31)));
                    long j = webChatViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
                    String str3 = ((AndroidParagraph) updateoffsetsldcg7xg).payload.phoneNumber;
                    this.write = null;
                    this.read = 1;
                    objAccess$fetchPhoneNumber = WebChatViewModel.access$fetchPhoneNumber(webChatViewModel, j, str3, this);
                    if (objAccess$fetchPhoneNumber == coroutineSingletons2) {
                        int i8 = RatingCompat + 67;
                        MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        obj6 = coroutineSingletons2;
                    } else {
                        thSerializer = onItemDismiss.serializer(webChatViewModel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read((String) objAccess$fetchPhoneNumber));
                        if (thSerializer != null) {
                            ((addSpans) toannotatedstringdefault).serializer(fromHtml.ERROR, "selfServiceChat", "Failed to initiate phone call", thSerializer);
                            sharedResourcePool.serializer(new getStartLineIndex(thSerializer.getMessage()));
                        }
                        do {
                            obj5 = mutableStateFlow.read();
                        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj5, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj5, null, false, false, null, false, false, 31)));
                    }
                } else if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objAccess$fetchPhoneNumber = obj;
                    thSerializer = onItemDismiss.serializer(webChatViewModel.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.read((String) objAccess$fetchPhoneNumber));
                    if (thSerializer != null) {
                        ((addSpans) toannotatedstringdefault).serializer(fromHtml.ERROR, "selfServiceChat", "Failed to initiate phone call", thSerializer);
                        sharedResourcePool.serializer(new getStartLineIndex(thSerializer.getMessage()));
                    }
                    do {
                        obj5 = mutableStateFlow.read();
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj5, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj5, null, false, false, null, false, false, 31)));
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    obj6 = null;
                }
            } catch (Exception e) {
                ((addSpans) toannotatedstringdefault).serializer(fromHtml.ERROR, "selfServiceChat", "Failed to fetch phone number", e);
                sharedResourcePool.serializer(new getStartLineIndex(e.getMessage()));
                do {
                    obj3 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj3, null, false, false, null, false, false, 31)));
            }
            int i10 = RatingCompat + 61;
            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return obj6;
        } catch (Throwable th) {
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj2, null, false, false, null, false, false, 31)));
            throw th;
        }
    }
}
