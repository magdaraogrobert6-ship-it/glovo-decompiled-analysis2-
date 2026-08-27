package com.roadrunner.nafath;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextRange;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.mapbox.navigator.R;
import com.mapbox.search.base.location.LocationEngineAdapter;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateRepositoryImpl$getState$$inlined$map$1;
import com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateRepositoryImpl$getState$2;
import com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1;
import com.roadrunner.map.integration.search.InitialiseMapboxSearch;
import com.roadrunner.opportunities.calendar.BonusCalendarViewModel;
import com.roadrunner.overlay.bubble.banner.presentation.OverlayVisibilityBannerUiModelImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionFragment;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockUiModelImpl;
import com.roadrunner.rider.state.finishedshift.presentation.FinishedShiftUiModelImpl;
import com.roadrunner.rider.state.noorders.presentation.HomeNoOrdersUiModelImpl;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkUiModelImpl;
import com.roadrunner.rider.state.ondemand.bonus.OnDemandWithBonusUiModelImpl;
import com.roadrunner.rider.state.ondemand.presentation.OnDemandUiModelImpl;
import com.roadrunner.rider.state.onpause.presentation.OnPauseUiModelImpl;
import com.roadrunner.rider.state.quests.presentation.list.QuestListUiModelImpl;
import com.roadrunner.rider.state.realtime.RealtimeStatusUpdateManagerImpl;
import com.roadrunner.rider.state.refresh.presentation.StateRefreshFloatingItemUiModelImpl;
import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import o.ActivityHandler2;
import o.AdjustInstanceExternalSyntheticLambda1;
import o.AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1;
import o.AsyncFontListLoaderloadWithTimeoutOrNull2;
import o.AttributionHandler3;
import o.IActivityHandler;
import o.Modifier;
import o.ShortNewsContentCardView;
import o.StaticImageDecoder;
import o.asBinder;
import o.createFromParcel;
import o.endFirstSessionDelay;
import o.getAdidWithTimeout;
import o.getContentViewGroupParentLayout;
import o.invokeMethod;
import o.na;
import o.onViewAttachedToWindowlambda0;
import o.pb;
import o.r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setHttpsURLConnectionProvider;
import o.shouldProcessEventI;
import o.updateAdidI;
import o.width;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class NafathModalUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NafathModalUiModelImpl$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.serializer = obj;
    }

    /* JADX INFO: renamed from: com.roadrunner.nafath.NafathModalUiModelImpl$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaDescriptionCompat = 1;
        private static int read;
        public final /* synthetic */ Object IconCompatParcelizer;
        public /* synthetic */ long RemoteActionCompatParcelizer;
        public int serializer;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, LocationEngineAdapter locationEngineAdapter, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.write = 4;
            this.RemoteActionCompatParcelizer = j;
            this.IconCompatParcelizer = locationEngineAdapter;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer = j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.IconCompatParcelizer = obj;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006f  */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        
            if (r1 != 5) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        
            if (r1 != 5) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        
            r10 = new com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2((com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository) r7, r9.RemoteActionCompatParcelizer, r11, 6);
            r11 = com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2.MediaDescriptionCompat + 61;
            com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2.read = r11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        
            return new com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2((com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl) r7, r9.RemoteActionCompatParcelizer, r11, 5);
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.ShortNewsContentCardView create(java.lang.Object r10, o.ShortNewsContentCardView r11) {
            /*
                r9 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2.read
                int r1 = r1 + 69
                int r2 = r1 % 128
                com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2.MediaDescriptionCompat = r2
                int r1 = r1 % r0
                r2 = 4
                r3 = 3
                r4 = 1
                r5 = 0
                r6 = 5
                if (r1 != 0) goto L27
                int r1 = r9.write
                java.lang.Object r7 = r9.IconCompatParcelizer
                r8 = 52
                int r8 = r8 / r5
                if (r1 == 0) goto L9f
                if (r1 == r4) goto L91
                if (r1 == r0) goto L81
                if (r1 == r3) goto L73
                if (r1 == r2) goto L5c
                if (r1 == r6) goto L4e
                goto L37
            L27:
                int r1 = r9.write
                java.lang.Object r7 = r9.IconCompatParcelizer
                if (r1 == 0) goto L9f
                if (r1 == r4) goto L91
                if (r1 == r0) goto L81
                if (r1 == r3) goto L73
                if (r1 == r2) goto L5c
                if (r1 == r6) goto L4e
            L37:
                r2 = r7
                com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository r2 = (com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository) r2
                long r3 = r9.RemoteActionCompatParcelizer
                com.roadrunner.nafath.NafathModalUiModelImpl$1$2 r10 = new com.roadrunner.nafath.NafathModalUiModelImpl$1$2
                r6 = 6
                r1 = r10
                r5 = r11
                r1.<init>(r2, r3, r5, r6)
                int r11 = com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2.MediaDescriptionCompat
                int r11 = r11 + 61
                int r1 = r11 % 128
                com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2.read = r1
                int r11 = r11 % r0
                return r10
            L4e:
                r1 = r7
                com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl r1 = (com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl) r1
                long r2 = r9.RemoteActionCompatParcelizer
                com.roadrunner.nafath.NafathModalUiModelImpl$1$2 r10 = new com.roadrunner.nafath.NafathModalUiModelImpl$1$2
                r5 = 5
                r0 = r10
                r4 = r11
                r0.<init>(r1, r2, r4, r5)
                return r10
            L5c:
                long r1 = r9.RemoteActionCompatParcelizer
                com.mapbox.search.base.location.LocationEngineAdapter r7 = (com.mapbox.search.base.location.LocationEngineAdapter) r7
                com.roadrunner.nafath.NafathModalUiModelImpl$1$2 r10 = new com.roadrunner.nafath.NafathModalUiModelImpl$1$2
                r10.<init>(r1, r7, r11)
                int r11 = com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2.read
                int r11 = r11 + r6
                int r1 = r11 % 128
                com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2.MediaDescriptionCompat = r1
                int r11 = r11 % r0
                if (r11 != 0) goto L72
                r11 = 47
                int r11 = r11 / r5
            L72:
                return r10
            L73:
                r1 = r7
                com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl r1 = (com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl) r1
                long r2 = r9.RemoteActionCompatParcelizer
                com.roadrunner.nafath.NafathModalUiModelImpl$1$2 r10 = new com.roadrunner.nafath.NafathModalUiModelImpl$1$2
                r5 = 3
                r0 = r10
                r4 = r11
                r0.<init>(r1, r2, r4, r5)
                return r10
            L81:
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r7 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) r7
                com.roadrunner.nafath.NafathModalUiModelImpl$1$2 r1 = new com.roadrunner.nafath.NafathModalUiModelImpl$1$2
                r1.<init>(r7, r11, r0)
                androidx.compose.ui.geometry.Offset r10 = (androidx.compose.ui.geometry.Offset) r10
                long r10 = r10.m487unboximpl()
                r1.RemoteActionCompatParcelizer = r10
                return r1
            L91:
                r1 = r7
                androidx.compose.animation.core.Animatable r1 = (androidx.compose.animation.core.Animatable) r1
                long r2 = r9.RemoteActionCompatParcelizer
                com.roadrunner.nafath.NafathModalUiModelImpl$1$2 r10 = new com.roadrunner.nafath.NafathModalUiModelImpl$1$2
                r5 = 1
                r0 = r10
                r4 = r11
                r0.<init>(r1, r2, r4, r5)
                return r10
            L9f:
                o.pb r7 = (o.pb) r7
                com.roadrunner.nafath.NafathModalUiModelImpl$1$2 r0 = new com.roadrunner.nafath.NafathModalUiModelImpl$1$2
                r0.<init>(r7, r11, r5)
                java.lang.Number r10 = (java.lang.Number) r10
                long r10 = r10.longValue()
                r0.RemoteActionCompatParcelizer = r10
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.nafath.NafathModalUiModelImpl$1.AnonymousClass2.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 119;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i4 == 0) {
                return ((AnonymousClass2) create(Long.valueOf(((Number) obj).longValue()), (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            if (i4 == 1) {
                return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            if (i4 == 2) {
                return ((AnonymousClass2) create(Offset.m466boximpl(((Offset) obj).m487unboximpl()), (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            if (i4 == 3) {
                return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            if (i4 != 4) {
                return i4 != 5 ? ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i5 = MediaDescriptionCompat + 23;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j;
            Object objWithContext;
            Object objFirstOrNull;
            int i = 2 % 2;
            int i2 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = this.IconCompatParcelizer;
            int i3 = 0;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i2 == 0) {
                long j2 = this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.serializer;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                pb pbVar = (pb) obj2;
                this.RemoteActionCompatParcelizer = j2;
                this.serializer = 1;
                long jWrite = ((FirebaseRemoteConfigImpl) pbVar.MediaMetadataCompat).IconCompatParcelizer.write("nafath_manual_verify_delay");
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Countdown started for expiresAt: %d, confirmation button delay: %ds", new Long(j2), new Long(jWrite));
                H$b h$b = pbVar.MediaBrowserCompatMediaItem;
                h$b.getClass();
                Object objCollect = ((AbstractFlow) FlowKt.read(new NafathTimerManager$observeCountdown$1(h$b, j2, null, 0))).collect(new NafathModalUiModelImpl$startCountDown$2(jWrite, i3, pbVar), this);
                if (objCollect != coroutineSingletons) {
                    objCollect = createfromparcel;
                }
                if (objCollect != coroutineSingletons) {
                    return createfromparcel;
                }
                int i5 = MediaDescriptionCompat + 17;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return coroutineSingletons;
            }
            if (i2 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.serializer;
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Offset offsetM466boximpl = Offset.m466boximpl(this.RemoteActionCompatParcelizer);
                    width widthVar = SelectionMagnifierKt.read;
                    this.serializer = 1;
                    return Animatable.IconCompatParcelizer((Animatable) obj2, offsetM466boximpl, widthVar, this, 12) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                }
                int i8 = read + 89;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (i2 == 2) {
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.serializer;
                if (i10 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    j = this.RemoteActionCompatParcelizer;
                    this.RemoteActionCompatParcelizer = j;
                    this.serializer = 1;
                    if (textFieldSelectionManager.updateClipboardEntry$foundation(this) != coroutineSingletons3) {
                    }
                    return coroutineSingletons3;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i11 = read + 117;
                    MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                j = this.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = TextFieldSelectionManager.read(textFieldSelectionManager);
                if (onviewattachedtowindowlambda0 == null) {
                    return createfromparcel;
                }
                String str = (String) onviewattachedtowindowlambda0.serializer;
                long jM3080unboximpl = ((TextRange) onviewattachedtowindowlambda0.write).m3080unboximpl();
                Modifier modifier = textFieldSelectionManager.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                if (modifier == null) {
                    return createfromparcel;
                }
                Offset.m466boximpl(j);
                this.serializer = 2;
                PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) modifier;
                if (str.length() == 0 || TextRange.m3070getCollapsedimpl(jM3080unboximpl)) {
                    objWithContext = createfromparcel;
                } else {
                    objWithContext = BuildersKt.withContext(platformSelectionBehaviorsImpl.serializer, new NavHostKt$NavHost$29$1(platformSelectionBehaviorsImpl, new AbstractClickableNode$handlePressInteractionRelease$1$1(jM3080unboximpl, platformSelectionBehaviorsImpl, str, null), shortNewsContentCardView, 6), this);
                }
                if (objWithContext != coroutineSingletons3) {
                    objWithContext = createfromparcel;
                }
                if (objWithContext != coroutineSingletons3) {
                    return createfromparcel;
                }
                return coroutineSingletons3;
            }
            if (i2 == 3) {
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.serializer;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SharedFlowImpl sharedFlowImpl = ((PerseusUserLocalDataStoreImpl) obj2).IconCompatParcelizer;
                Long l = new Long(this.RemoteActionCompatParcelizer);
                this.serializer = 1;
                if (sharedFlowImpl.emit(l, this) != coroutineSingletons4) {
                    return createfromparcel;
                }
                int i14 = read + 93;
                MediaDescriptionCompat = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return coroutineSingletons4;
            }
            if (i2 == 4) {
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.serializer;
                if (i16 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    long j3 = this.RemoteActionCompatParcelizer;
                    this.serializer = 1;
                    if (DelayKt.delay(j3, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i16 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                ((LocationEngineAdapter) obj2).stopLocationListener();
                return createfromparcel;
            }
            if (i2 == 5) {
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.serializer;
                if (i17 != 0) {
                    int i18 = read + 113;
                    MediaDescriptionCompat = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 != 0 ? i17 != 1 : i17 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ComponentRegistry$Builder componentRegistry$Builder = ((DeliveryAcceptButtonUiModelImpl) obj2).MediaSessionCompatToken;
                long j4 = this.RemoteActionCompatParcelizer;
                this.serializer = 1;
                if (componentRegistry$Builder.invoke(j4, this) != coroutineSingletons6) {
                    return createfromparcel;
                }
                int i19 = read + 91;
                MediaDescriptionCompat = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                return coroutineSingletons6;
            }
            long j5 = this.RemoteActionCompatParcelizer;
            ConfirmationRepository confirmationRepository = (ConfirmationRepository) obj2;
            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i21 = this.serializer;
            if (i21 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object[] objArr = {(FirebaseRemoteConfigImpl) confirmationRepository.MediaBrowserCompatMediaItem, updateAdidI.IS_DELIVERY_TASKS_DATA_STORE_CACHING_ENABLED};
                if (!((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), R.serializer(), objArr)).booleanValue()) {
                    return (AsyncFontListLoaderloadWithTimeoutOrNull2) confirmationRepository.write.get(new Long(j5));
                }
                AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 = confirmationRepository.serializer;
                FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new DeliveryTasksStateRepositoryImpl$getState$$inlined$map$1(new HeatmapDataStore$getBoolean$$inlined$map$1(animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1.read.IconCompatParcelizer.serializer(), AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1.read(j5), 2), i3), new DeliveryTasksStateRepositoryImpl$getState$2(j5, animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1, null));
                this.serializer = 1;
                objFirstOrNull = FlowKt.firstOrNull(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, this);
                if (objFirstOrNull == coroutineSingletons7) {
                    return coroutineSingletons7;
                }
            } else {
                if (i21 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i22 = MediaDescriptionCompat + 85;
                read = i22 % Fields.SpotShadowColor;
                if (i22 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objFirstOrNull = obj;
            }
            return (AsyncFontListLoaderloadWithTimeoutOrNull2) objFirstOrNull;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        Object obj2 = this.serializer;
        int i4 = 13;
        int i5 = 7;
        Object obj3 = null;
        switch (i3) {
            case 0:
                return new NafathModalUiModelImpl$1((pb) obj2, shortNewsContentCardView, 0);
            case 1:
                return new NafathModalUiModelImpl$1((na) obj2, shortNewsContentCardView, 1);
            case 2:
                return new NafathModalUiModelImpl$1((InitialiseMapboxSearch) obj2, shortNewsContentCardView, i);
            case 3:
                return new NafathModalUiModelImpl$1((VerificationStatusLifecycleObserverImpl) obj2, shortNewsContentCardView, 3);
            case 4:
                return new NafathModalUiModelImpl$1((BonusCalendarViewModel) obj2, shortNewsContentCardView, 4);
            case 5:
                return new NafathModalUiModelImpl$1((OverlayVisibilityBannerUiModelImpl) obj2, shortNewsContentCardView, 5);
            case 6:
                NafathModalUiModelImpl$1 nafathModalUiModelImpl$1 = new NafathModalUiModelImpl$1((StaticImageDecoder) obj2, shortNewsContentCardView, 6);
                int i6 = IconCompatParcelizer + 33;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return nafathModalUiModelImpl$1;
            case 7:
                return new NafathModalUiModelImpl$1((r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I) obj2, shortNewsContentCardView, i5);
            case 8:
                return new NafathModalUiModelImpl$1((shouldProcessEventI) obj2, shortNewsContentCardView, 8);
            case 9:
                return new NafathModalUiModelImpl$1((FirebaseRemoteConfigProvider) obj2, shortNewsContentCardView, 9);
            case 10:
                return new NafathModalUiModelImpl$1((endFirstSessionDelay) obj2, shortNewsContentCardView, 10);
            case 11:
                return new NafathModalUiModelImpl$1((getAdidWithTimeout) obj2, shortNewsContentCardView, 11);
            case 12:
                return new NafathModalUiModelImpl$1((ActivityHandler2) obj2, shortNewsContentCardView, 12);
            case 13:
                return new NafathModalUiModelImpl$1((RiderSafetyPermissionFragment) obj2, shortNewsContentCardView, i4);
            case 14:
                return new NafathModalUiModelImpl$1((CashBlockUiModelImpl) obj2, shortNewsContentCardView, 14);
            case 15:
                return new NafathModalUiModelImpl$1((setHttpsURLConnectionProvider) obj2, shortNewsContentCardView, 15);
            case 16:
                return new NafathModalUiModelImpl$1((FinishedShiftUiModelImpl) obj2, shortNewsContentCardView, 16);
            case 17:
                NafathModalUiModelImpl$1 nafathModalUiModelImpl$2 = new NafathModalUiModelImpl$1((AdjustInstanceExternalSyntheticLambda1) obj2, shortNewsContentCardView, 17);
                int i8 = IconCompatParcelizer + 31;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return nafathModalUiModelImpl$2;
            case 18:
                return new NafathModalUiModelImpl$1((HomeNoOrdersUiModelImpl) obj2, shortNewsContentCardView, 18);
            case 19:
                return new NafathModalUiModelImpl$1((OfferToWorkUiModelImpl) obj2, shortNewsContentCardView, 19);
            case 20:
                NafathModalUiModelImpl$1 nafathModalUiModelImpl$3 = new NafathModalUiModelImpl$1((OnDemandWithBonusUiModelImpl) obj2, shortNewsContentCardView, 20);
                int i10 = IconCompatParcelizer + 13;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    return nafathModalUiModelImpl$3;
                }
                throw null;
            case 21:
                return new NafathModalUiModelImpl$1((AttributionHandler3) obj2, shortNewsContentCardView, 21);
            case 22:
                return new NafathModalUiModelImpl$1((OnDemandUiModelImpl) obj2, shortNewsContentCardView, 22);
            case 23:
                return new NafathModalUiModelImpl$1((OnPauseUiModelImpl) obj2, shortNewsContentCardView, 23);
            case 24:
                return new NafathModalUiModelImpl$1((asBinder) obj2, shortNewsContentCardView, 24);
            case 25:
                return new NafathModalUiModelImpl$1((IActivityHandler) obj2, shortNewsContentCardView, 25);
            case 26:
                return new NafathModalUiModelImpl$1((QuestListUiModelImpl) obj2, shortNewsContentCardView, 26);
            case 27:
                NafathModalUiModelImpl$1 nafathModalUiModelImpl$4 = new NafathModalUiModelImpl$1((RealtimeStatusUpdateManagerImpl) obj2, shortNewsContentCardView, 27);
                int i11 = IconCompatParcelizer + 7;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return nafathModalUiModelImpl$4;
                }
                obj3.hashCode();
                throw null;
            case 28:
                return new NafathModalUiModelImpl$1((StateRefreshFloatingItemUiModelImpl) obj2, shortNewsContentCardView, 28);
            default:
                return new NafathModalUiModelImpl$1((invokeMethod) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i3) {
            case 0:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 1:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 2:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 3:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 4:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 5:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 6:
                Object objInvokeSuspend = ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                int i4 = RemoteActionCompatParcelizer + 109;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            case 7:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 8:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 9:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 10:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 11:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 12:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 13:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 14:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 15:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 16:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 17:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 18:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 19:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 20:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 21:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 22:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 23:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 24:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 25:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 26:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 27:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 28:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            default:
                return ((NafathModalUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x0667, code lost:
    
        if (kotlin.ranges.RangesKt.await(r0, r16) == r5) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0684, code lost:
    
        if (kotlin.ranges.RangesKt.await(r0, r16) == r5) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.nafath.NafathModalUiModelImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
