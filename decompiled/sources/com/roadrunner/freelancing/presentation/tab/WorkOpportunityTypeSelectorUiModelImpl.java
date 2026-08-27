package com.roadrunner.freelancing.presentation.tab;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.sessions.SharedSessionRepositoryImpl;
import com.roadrunner.freelancing.api.presentation.tab.WorkOpportunityTypeSelectorUiModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.internal.ContextScope;
import o.AccessibilityNodeProviderCompat;
import o.CoreComponentFactory;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createNotificationChannelGroup;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.vg;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkOpportunityTypeSelectorUiModelImpl implements WorkOpportunityTypeSelectorUiModel {
    private static int MediaDescriptionCompat = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final GetWorkOpportunityTypeSelectorUiState IconCompatParcelizer;
    public final vg MediaBrowserCompatMediaItem;
    public final CoreComponentFactory MediaMetadataCompat;
    public final ShouldShowTabs MediaSessionCompatQueueItem;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final ProtobufEncoder serializer;
    public final MutableStateFlow write;

    /* JADX INFO: renamed from: com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 1;
        private static int serializer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public int read;
        public final /* synthetic */ WorkOpportunityTypeSelectorUiModelImpl write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(WorkOpportunityTypeSelectorUiModelImpl workOpportunityTypeSelectorUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.write = workOpportunityTypeSelectorUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 121;
            serializer = i2 % Fields.SpotShadowColor;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = this.RemoteActionCompatParcelizer;
            WorkOpportunityTypeSelectorUiModelImpl workOpportunityTypeSelectorUiModelImpl = this.write;
            if (i3 != 0) {
                return new AnonymousClass1(workOpportunityTypeSelectorUiModelImpl, shortNewsContentCardView, 1);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(workOpportunityTypeSelectorUiModelImpl, shortNewsContentCardView, 0);
            int i4 = serializer + 63;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return anonymousClass1;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            return ((com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1) create(r5, r6)).invokeSuspend(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            r5 = ((com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1) create(r5, r6)).invokeSuspend(r2);
            r6 = com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1.IconCompatParcelizer + 3;
            com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1.serializer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r6 = r6 % 2;
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
                int r1 = com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1.serializer
                int r1 = r1 + 35
                int r2 = r1 % 128
                com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1.IconCompatParcelizer = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L1d
                int r1 = r4.RemoteActionCompatParcelizer
                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
                o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
                r3 = 56
                int r3 = r3 / 0
                if (r1 == 0) goto L3b
                goto L27
            L1d:
                int r1 = r4.RemoteActionCompatParcelizer
                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
                o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
                if (r1 == 0) goto L3b
            L27:
                o.ShortNewsContentCardView r5 = r4.create(r5, r6)
                com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl$1 r5 = (com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1) r5
                java.lang.Object r5 = r5.invokeSuspend(r2)
                int r6 = com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1.IconCompatParcelizer
                int r6 = r6 + 3
                int r1 = r6 % 128
                com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1.serializer = r1
                int r6 = r6 % r0
                return r5
            L3b:
                o.ShortNewsContentCardView r5 = r4.create(r5, r6)
                com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl$1 r5 = (com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1) r5
                java.lang.Object r5 = r5.invokeSuspend(r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            WorkOpportunityTypeSelectorUiModelImpl workOpportunityTypeSelectorUiModelImpl = this.write;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i2 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.read;
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    GetWorkOpportunityTypeSelectorUiState getWorkOpportunityTypeSelectorUiState = workOpportunityTypeSelectorUiModelImpl.IconCompatParcelizer;
                    this.read = 1;
                    obj = getWorkOpportunityTypeSelectorUiState.invoke(this);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                int i4 = IconCompatParcelizer + 75;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                    if (i3 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2 anonymousClass2 = new SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2(25, workOpportunityTypeSelectorUiModelImpl);
                this.read = 2;
                if (((Flow) obj).collect(anonymousClass2, this) != coroutineSingletons) {
                    return createfromparcel;
                }
                return coroutineSingletons;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.read;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ShouldShowTabs shouldShowTabs = workOpportunityTypeSelectorUiModelImpl.MediaSessionCompatQueueItem;
                this.read = 1;
                obj = shouldShowTabs.invoke(this);
                if (obj != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            }
            int i6 = IconCompatParcelizer;
            int i7 = i6 + 15;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i5 != 1) {
                int i9 = i6 + 119;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i5 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i11 = i6 + 63;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ChannelFlowTransformLatest channelFlowTransformLatestRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer((Flow) obj, new SharedSessionRepositoryImpl.AnonymousClass1.C00161(shortNewsContentCardView, workOpportunityTypeSelectorUiModelImpl, 4));
            this.read = 2;
            if (channelFlowTransformLatestRemoteActionCompatParcelizer.collect(AccessibilityNodeProviderCompat.read, this) != coroutineSingletons2) {
                return createfromparcel;
            }
            return coroutineSingletons2;
        }
    }

    @Override // o.onViewCreated
    public final boolean x_() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 21;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return false;
    }

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 77;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            stateFlow = this.read;
            int i4 = 61 / 0;
        } else {
            stateFlow = this.read;
        }
        int i5 = i2 + 123;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public WorkOpportunityTypeSelectorUiModelImpl(GetWorkOpportunityTypeSelectorUiState getWorkOpportunityTypeSelectorUiState, ContextScope contextScope, vg vgVar, ProtobufEncoder protobufEncoder, CoreComponentFactory coreComponentFactory, ShouldShowTabs shouldShowTabs) {
        this.IconCompatParcelizer = getWorkOpportunityTypeSelectorUiState;
        this.MediaBrowserCompatMediaItem = vgVar;
        this.serializer = protobufEncoder;
        this.MediaMetadataCompat = coreComponentFactory;
        this.MediaSessionCompatQueueItem = shouldShowTabs;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(createNotificationChannelGroup.serializer);
        this.write = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.read = mutableStateFlow2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
    }
}
