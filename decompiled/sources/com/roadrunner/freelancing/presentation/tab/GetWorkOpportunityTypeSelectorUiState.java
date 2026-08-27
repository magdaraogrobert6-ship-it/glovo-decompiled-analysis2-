package com.roadrunner.freelancing.presentation.tab;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextStyle;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.freelancing.domain.FlowTimeoutExtensionsKt$withInitialTimeout$1;
import com.roadrunner.freelancing.domain.HasWorkNowOpportunityImpl$invoke$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.IconCompat;
import o.ShortNewsContentCardView;
import o.WindowInsetsCompatImpl34;
import o.createFromParcel;
import o.createNotificationChannel;
import o.createNotificationChannelGroup;
import o.createNotificationChannelGroupsCompat;
import o.performLayout;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.sc;
import o.setTransactionSuccessful;
import o.vg;

/* JADX INFO: loaded from: classes3.dex */
public final class GetWorkOpportunityTypeSelectorUiState {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final setTransactionSuccessful IconCompatParcelizer;
    public final IconCompat read;
    public final vg serializer;
    public final ShouldShowTabs write;

    /* JADX INFO: renamed from: com.roadrunner.freelancing.presentation.tab.GetWorkOpportunityTypeSelectorUiState$invoke$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
        private static int MediaSessionCompatQueueItem = 1;
        private static int serializer;
        public /* synthetic */ boolean IconCompatParcelizer;
        public /* synthetic */ boolean read;
        public /* synthetic */ sc write;

        public AnonymousClass2(ShortNewsContentCardView shortNewsContentCardView) {
            super(4, shortNewsContentCardView);
        }

        @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
            AnonymousClass2 anonymousClass2 = GetWorkOpportunityTypeSelectorUiState.this.new AnonymousClass2((ShortNewsContentCardView) obj4);
            anonymousClass2.write = (sc) obj;
            anonymousClass2.read = zBooleanValue;
            anonymousClass2.IconCompatParcelizer = zBooleanValue2;
            Object objInvokeSuspend = anonymousClass2.invokeSuspend(createFromParcel.INSTANCE);
            int i2 = serializer + 39;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            TextStyle textStyleIconCompatParcelizer;
            int i2;
            TextStyle textStyleIconCompatParcelizer2;
            int i3 = 2 % 2;
            int i4 = MediaSessionCompatQueueItem + 69;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            sc scVar = this.write;
            boolean z = this.read;
            boolean z2 = this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!z || scVar == null) {
                return createNotificationChannelGroup.serializer;
            }
            setTransactionSuccessful settransactionsuccessful = GetWorkOpportunityTypeSelectorUiState.this.IconCompatParcelizer;
            String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.on_going_session_start_now_tab);
            sc scVar2 = sc.START_NOW;
            int i6 = scVar == scVar2 ? R.color.primary_light_04 : R.color.neutral_00;
            if (scVar == scVar2) {
                int i7 = MediaSessionCompatQueueItem + 41;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    throw null;
                }
                i = R.color.primary_main;
            } else {
                i = R.color.neutral_80;
            }
            if (scVar == scVar2) {
                int i8 = serializer + 69;
                MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    textStyleIconCompatParcelizer = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    int i9 = 27 / 0;
                } else {
                    textStyleIconCompatParcelizer = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                }
            } else {
                textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            }
            TextStyle textStyle = textStyleIconCompatParcelizer;
            sc scVar3 = sc.SCHEDULE;
            createNotificationChannelGroupsCompat createnotificationchannelgroupscompat = new createNotificationChannelGroupsCompat(R.drawable.ic_bold_medium_essentials_flash, strIconCompatParcelizer, i6, i, scVar2, textStyle, scVar == scVar3 && z2);
            String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.on_going_session_schedule_tab);
            if (scVar == scVar3) {
                int i10 = MediaSessionCompatQueueItem + 117;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i2 = R.color.primary_light_04;
            } else {
                i2 = R.color.neutral_00;
            }
            int i12 = scVar == scVar3 ? R.color.primary_main : R.color.neutral_80;
            if (scVar == scVar3) {
                int i13 = serializer + 95;
                MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    throw null;
                }
                textStyleIconCompatParcelizer2 = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            } else {
                textStyleIconCompatParcelizer2 = performLayout.IconCompatParcelizer();
            }
            return new createNotificationChannel(SQLite.read(createnotificationchannelgroupscompat, new createNotificationChannelGroupsCompat(R.drawable.ic_bold_medium_calendar_default, strIconCompatParcelizer2, i2, i12, scVar3, textStyleIconCompatParcelizer2, false)));
        }
    }

    public GetWorkOpportunityTypeSelectorUiState(setTransactionSuccessful settransactionsuccessful, vg vgVar, ShouldShowTabs shouldShowTabs, IconCompat iconCompat) {
        this.IconCompatParcelizer = settransactionsuccessful;
        this.serializer = vgVar;
        this.write = shouldShowTabs;
        this.read = iconCompat;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        WindowInsetsCompatImpl34 windowInsetsCompatImpl34;
        Flow flow;
        int i = 2 % 2;
        if (continuationImpl instanceof WindowInsetsCompatImpl34) {
            windowInsetsCompatImpl34 = (WindowInsetsCompatImpl34) continuationImpl;
            int i2 = windowInsetsCompatImpl34.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaMetadataCompat + 1;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                windowInsetsCompatImpl34.write = i2 - Integer.MIN_VALUE;
            } else {
                windowInsetsCompatImpl34 = new WindowInsetsCompatImpl34(this, continuationImpl);
            }
        } else {
            windowInsetsCompatImpl34 = new WindowInsetsCompatImpl34(this, continuationImpl);
        }
        Object obj = windowInsetsCompatImpl34.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = windowInsetsCompatImpl34.write;
        int i6 = 0;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow = this.serializer.write;
            windowInsetsCompatImpl34.IconCompatParcelizer = mutableStateFlow;
            windowInsetsCompatImpl34.write = 1;
            Object objInvoke = this.write.invoke(windowInsetsCompatImpl34);
            if (objInvoke == coroutineSingletons) {
                int i7 = MediaMetadataCompat + 47;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
            flow = mutableStateFlow;
            obj = objInvoke;
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = MediaMetadataCompat + 45;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                flow = (Flow) windowInsetsCompatImpl34.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i9 = 33 / 0;
            } else {
                flow = (Flow) windowInsetsCompatImpl34.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            int i10 = MediaMetadataCompat + 107;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        return FlowKt.read(flow, (Flow) obj, FlowKt.read(new FlowTimeoutExtensionsKt$withInitialTimeout$1(new HasWorkNowOpportunityImpl$invoke$$inlined$map$1(this.read.IconCompatParcelizer.IconCompatParcelizer(), i6), 200L, Boolean.FALSE, (ShortNewsContentCardView) null)), new AnonymousClass2(null));
    }
}
