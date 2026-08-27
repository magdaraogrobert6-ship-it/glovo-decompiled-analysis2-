package com.airbnb.lottie.compose;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import o.DefaultInAppMessageViewWrappercreateTouchAwareListener1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.StrokeJoinCompanion;
import o.TextAnnouncementContentCardView;
import o.accessgetRgbcp;
import o.createFromParcel;
import o.getBradford;
import o.getContentViewGroupParentLayout;
import o.getVonKries;
import o.onShowTranslationui;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class LottieAnimatableImpl$animate$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ StrokeJoinCompanion IconCompatParcelizer;
    public final /* synthetic */ float MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final /* synthetic */ getVonKries MediaMetadataCompat;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ float read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ accessgetRgbcp write;

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ getVonKries MediaMetadataCompat;
        public final /* synthetic */ accessgetRgbcp RemoteActionCompatParcelizer;
        public int read;
        public final /* synthetic */ int serializer;
        public final /* synthetic */ setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(accessgetRgbcp accessgetrgbcp, setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0, int i, int i2, getVonKries getvonkries, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = accessgetrgbcp;
            this.write = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
            this.serializer = i;
            this.IconCompatParcelizer = i2;
            this.MediaMetadataCompat = getvonkries;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            return new AnonymousClass1(this.RemoteActionCompatParcelizer, this.write, this.serializer, this.IconCompatParcelizer, this.MediaMetadataCompat, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX WARN: Code duplicated, block: B:17:0x003c  */
        /* JADX WARN: Code duplicated, block: B:18:0x0047  */
        /* JADX WARN: Code duplicated, block: B:20:0x005a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0063  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r5.read
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
                goto L5b
            Ld:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r6)
                r6 = 0
                return r6
            L14:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            L17:
                int[] r6 = o.AdaptationCompanionBradford1.IconCompatParcelizer
                o.accessgetRgbcp r1 = r5.RemoteActionCompatParcelizer
                int r1 = r1.ordinal()
                r6 = r6[r1]
                int r1 = r5.serializer
                if (r6 != r2) goto L30
                o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 r6 = r5.write
                boolean r6 = r6.I_()
                if (r6 == 0) goto L2e
                goto L30
            L2e:
                int r1 = r5.IconCompatParcelizer
            L30:
                r5.read = r2
                o.getVonKries r6 = r5.MediaMetadataCompat
                r6.getClass()
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r1 != r3) goto L47
                o.getCiecat02 r3 = new o.getCiecat02
                r4 = 0
                r3.<init>(r6, r1, r4)
                java.lang.Object r6 = o.placeCenterfoundation_layout.RemoteActionCompatParcelizer(r3, r5)
                goto L58
            L47:
                o.getCiecat02 r3 = new o.getCiecat02
                r3.<init>(r6, r1, r2)
                o.TextAnnouncementContentCardView r6 = r5.getContext()
                o.notifyViewEntered r6 = kotlin.io.TextStreamsKt.read(r6)
                java.lang.Object r6 = r6.withFrameNanos(r3, r5)
            L58:
                if (r6 != r0) goto L5b
                return r0
            L5b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L17
                o.createFromParcel r6 = o.createFromParcel.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$animate$2(getVonKries getvonkries, int i, int i2, boolean z, float f, StrokeJoinCompanion strokeJoinCompanion, float f2, accessgetRgbcp accessgetrgbcp, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaMetadataCompat = getvonkries;
        this.serializer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.RatingCompat = z;
        this.MediaBrowserCompatMediaItem = f;
        this.IconCompatParcelizer = strokeJoinCompanion;
        this.read = f2;
        this.write = accessgetrgbcp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        return new LottieAnimatableImpl$animate$2(this.MediaMetadataCompat, this.serializer, this.RemoteActionCompatParcelizer, this.RatingCompat, this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer, this.read, this.write, shortNewsContentCardView);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return ((LottieAnimatableImpl$animate$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextAnnouncementContentCardView textAnnouncementContentCardView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.MediaDescriptionCompat;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getVonKries getvonkries = this.MediaMetadataCompat;
        try {
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getvonkries.IconCompatParcelizer(this.serializer);
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = getvonkries.MediaSessionCompatQueueItem;
                int i2 = this.RemoteActionCompatParcelizer;
                ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(Integer.valueOf(i2));
                ((onShowTranslationui) getvonkries.MediaSessionCompatToken).setValue(Boolean.valueOf(this.RatingCompat));
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = getvonkries.MediaSessionCompatResultReceiverWrapper;
                float f = this.MediaBrowserCompatMediaItem;
                ((onShowTranslationui) populateViewStructure_androidKtpopulate8).setValue(Float.valueOf(f));
                ((onShowTranslationui) getvonkries.IconCompatParcelizer).setValue(null);
                onShowTranslationui onshowtranslationui = (onShowTranslationui) getvonkries.write;
                StrokeJoinCompanion strokeJoinCompanion = this.IconCompatParcelizer;
                onshowtranslationui.setValue(strokeJoinCompanion);
                getvonkries.serializer(this.read);
                ((onShowTranslationui) getvonkries.ParcelableVolumeInfo).setValue(Boolean.FALSE);
                ((onShowTranslationui) getvonkries.MediaBrowserCompatMediaItem).setValue(Long.MIN_VALUE);
                if (strokeJoinCompanion == null) {
                    getVonKries.serializer(getvonkries, false);
                    return createfromparcel;
                }
                if (Float.isInfinite(f)) {
                    getvonkries.serializer(getvonkries.IconCompatParcelizer());
                    getVonKries.serializer(getvonkries, false);
                    getvonkries.IconCompatParcelizer(i2);
                    return createfromparcel;
                }
                getVonKries.serializer(getvonkries, true);
                int i3 = getBradford.IconCompatParcelizer[this.write.ordinal()];
                if (i3 == 1) {
                    textAnnouncementContentCardView = DefaultInAppMessageViewWrappercreateTouchAwareListener1.serializer;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textAnnouncementContentCardView = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.write, JobKt.IconCompatParcelizer(getContext()), this.RemoteActionCompatParcelizer, this.serializer, this.MediaMetadataCompat, null);
                this.MediaDescriptionCompat = 1;
                if (BuildersKt.withContext(textAnnouncementContentCardView, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            JobKt.RemoteActionCompatParcelizer(getContext());
            getVonKries.serializer(getvonkries, false);
            return createfromparcel;
        } catch (Throwable th) {
            getVonKries.serializer(getvonkries, false);
            throw th;
        }
    }
}
