package com.roadrunner.delivery.ontheway.chatfloating.presentation;

import androidx.compose.material3.ThumbNode$onAttach$1$1;
import androidx.compose.ui.graphics.Fields;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import com.roadrunner.delivery.ontheway.chatfloating.data.DefaultChatViewStateRepository$fetchChatState$1;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.reactive.PublisherAsFlow;
import o.AndroidFontUtils_androidKt;
import o.IInAppMessageViewWrapper;
import o.ImeActionCompanion;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getDoneeUduSuoannotations;
import o.getNoneeUduSuo;
import o.onBackStartedlambda1;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4;
import o.toVariationValue;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerChatFloatingButtonUiModel implements getDoneeUduSuoannotations {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final CustomerChatCommunicatorImpl IconCompatParcelizer;
    public final StateFlow MediaDescriptionCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final ContextScope RemoteActionCompatParcelizer;
    public final ProtobufEncoder read;
    public final AndroidFontUtils_androidKt serializer;
    public final StateFlow write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 57;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.write;
        int i5 = i2 + 17;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public CustomerChatFloatingButtonUiModel(final getNoneeUduSuo getnoneeudusuo, ImeActionCompanion imeActionCompanion, ContextScope contextScope, AndroidFontUtils_androidKt androidFontUtils_androidKt, CustomerChatCommunicatorImpl customerChatCommunicatorImpl, ProtobufEncoder protobufEncoder) {
        this.RemoteActionCompatParcelizer = contextScope;
        this.serializer = androidFontUtils_androidKt;
        this.IconCompatParcelizer = customerChatCommunicatorImpl;
        this.read = protobufEncoder;
        FlowableDoFinally flowableDoFinallyRemoteActionCompatParcelizer = ((LegacyCustomerChatCommunicatorImpl) imeActionCompanion.serializer.write.write()).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4[] r8lambdaxxy0icvbkqrejyjmjwchaqi7z4Arr = onBackStartedlambda1.serializer;
        final StateFlow stateFlowWrite = FlowKt.write(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new PublisherAsFlow(flowableDoFinallyRemoteActionCompatParcelizer, r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, -2, IInAppMessageViewWrapper.SUSPEND), new StateProviderImpl$special$$inlined$map$2(((ChatDeliveryRepositoryImpl) imeActionCompanion.RemoteActionCompatParcelizer.serializer).RemoteActionCompatParcelizer, 16), new DefaultChatViewStateRepository$fetchChatState$1(imeActionCompanion, null)), contextScope, SharingStarted.Companion.read(2), toVariationValue.IconCompatParcelizer);
        this.MediaDescriptionCompat = stateFlowWrite;
        final int i = 0;
        Flow flow = new Flow() { // from class: com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatFloatingButtonUiModel$special$$inlined$map$1
            private static int IconCompatParcelizer = 1;
            private static int RemoteActionCompatParcelizer;

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
                int i2 = 2 % 2;
                int i3 = i;
                Object obj = createFromParcel.INSTANCE;
                getNoneeUduSuo getnoneeudusuo2 = getnoneeudusuo;
                Flow flow2 = stateFlowWrite;
                Object obj2 = null;
                if (i3 == 0) {
                    Object objCollect = flow2.collect(new HeatmapDataStore$get$$inlined$map$1.AnonymousClass2(flowCollector, 15, getnoneeudusuo2), shortNewsContentCardView);
                    if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return obj;
                    }
                    int i4 = IconCompatParcelizer + 117;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return objCollect;
                    }
                    obj2.hashCode();
                    throw null;
                }
                Object objCollect2 = flow2.collect(new ThumbNode$onAttach$1$1(flowCollector, 21, getnoneeudusuo2), shortNewsContentCardView);
                if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    int i5 = IconCompatParcelizer + 7;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    obj = objCollect2;
                }
                int i6 = IconCompatParcelizer + 31;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return obj;
            }
        };
        SharingStarted sharingStarted = SharingStarted.Companion.read(2);
        Boolean bool = Boolean.FALSE;
        this.write = FlowKt.write(flow, contextScope, sharingStarted, bool);
        final int i2 = 1;
        this.MediaSessionCompatQueueItem = FlowKt.write(new Flow() { // from class: com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatFloatingButtonUiModel$special$$inlined$map$1
            private static int IconCompatParcelizer = 1;
            private static int RemoteActionCompatParcelizer;

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
                int i3 = 2 % 2;
                int i4 = i2;
                Object obj = createFromParcel.INSTANCE;
                getNoneeUduSuo getnoneeudusuo2 = getnoneeudusuo;
                Flow flow2 = stateFlowWrite;
                Object obj2 = null;
                if (i4 == 0) {
                    Object objCollect = flow2.collect(new HeatmapDataStore$get$$inlined$map$1.AnonymousClass2(flowCollector, 15, getnoneeudusuo2), shortNewsContentCardView);
                    if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return obj;
                    }
                    int i5 = IconCompatParcelizer + 117;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        return objCollect;
                    }
                    obj2.hashCode();
                    throw null;
                }
                Object objCollect2 = flow2.collect(new ThumbNode$onAttach$1$1(flowCollector, 21, getnoneeudusuo2), shortNewsContentCardView);
                if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    int i6 = IconCompatParcelizer + 7;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    obj = objCollect2;
                }
                int i7 = IconCompatParcelizer + 31;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return obj;
            }
        }, contextScope, SharingStarted.Companion.read(2), bool);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 4), 3);
    }
}
