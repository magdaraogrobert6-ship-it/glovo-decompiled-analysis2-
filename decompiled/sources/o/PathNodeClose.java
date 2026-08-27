package o;

import com.deliveryhero.selfServiceChat.data.chat.GetChatIDEndpointResponse;
import com.deliveryhero.selfServiceChat.data.model.HelpCenterChatEventsSendMessageRequest;

/* JADX INFO: loaded from: classes2.dex */
public interface PathNodeClose {
    @getEvalNonAuth
    Object IconCompatParcelizer(@ProtoRolloutMsg String str, @getClauses(serializer = "x-helpcenter-gei") String str2, @getClauses(serializer = "x-service-type") String str3, ShortNewsContentCardView<? super getHoldoutVariationName<com.deliveryhero.chatsdk.domain.model.messages.UnreadCountDetails>> shortNewsContentCardView);

    @ProtoParserKtdecodeProtoAndCachedecodedResponse1
    Object serializer(@ProtoRolloutMsg String str, @getClauses(serializer = "x-helpcenter-gei") String str2, @getClauses(serializer = "x-service-type") String str3, @getClauses(serializer = "x-helpcenter-chat-id") String str4, @ProtoFeaturesMsgCompanion HelpCenterChatEventsSendMessageRequest helpCenterChatEventsSendMessageRequest, ShortNewsContentCardView<? super getHoldoutVariationName<Object>> shortNewsContentCardView);

    @getEvalNonAuth
    Object serializer(@ProtoRolloutMsg String str, @getClauses(serializer = "x-helpcenter-gei") String str2, @getClauses(serializer = "x-service-type") String str3, ShortNewsContentCardView<? super getHoldoutVariationName<GetChatIDEndpointResponse>> shortNewsContentCardView);
}
