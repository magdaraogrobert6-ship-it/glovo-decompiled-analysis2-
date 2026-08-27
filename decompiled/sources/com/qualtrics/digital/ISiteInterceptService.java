package com.qualtrics.digital;

import com.google.gson.JsonObject;
import o.ProtoFeaturesMsgCompanion;
import o.ProtoHoldoutMsg;
import o.ProtoHoldoutMsgCompanion;
import o.ProtoListValueCompanion;
import o.ProtoParserKtdecodeProtoAndCachedecodedResponse1;
import o.ProtoRolloutMsg;
import o._get_messageWebView_lambda3;
import o.getEvalNonAuth;
import o.getFeatureKey;
import o.syncCustomerProfile;

/* JADX INFO: loaded from: classes3.dex */
interface ISiteInterceptService {
    @getEvalNonAuth(IconCompatParcelizer = "WRSiteInterceptEngine/AssetVersions.php")
    syncCustomerProfile<ProjectAssetVersions> getAssetVersions(@getFeatureKey(RemoteActionCompatParcelizer = "Q_InterceptID") String str, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTTYPE") String str2, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTVERSION") String str3, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICEOS") String str4, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICETYPE") String str5);

    @getEvalNonAuth(IconCompatParcelizer = "WRSiteInterceptEngine/Asset.php")
    syncCustomerProfile<JsonObject> getCreativeDefinition(@getFeatureKey(RemoteActionCompatParcelizer = "Module") String str, @getFeatureKey(RemoteActionCompatParcelizer = "Version") int i, @getFeatureKey(RemoteActionCompatParcelizer = "Q_InterceptID") String str2, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTTYPE") String str3, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTVERSION") String str4, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICEOS") String str5, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICETYPE") String str6);

    @getEvalNonAuth(IconCompatParcelizer = "WRSiteInterceptEngine/Asset.php")
    syncCustomerProfile<Intercept> getInterceptDefinition(@getFeatureKey(RemoteActionCompatParcelizer = "Module") String str, @getFeatureKey(RemoteActionCompatParcelizer = "Version") int i, @getFeatureKey(RemoteActionCompatParcelizer = "Q_FULL_DEFINITION") boolean z, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTTYPE") String str2, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTVERSION") String str3, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICEOS") String str4, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICETYPE") String str5);

    @ProtoHoldoutMsgCompanion
    @ProtoListValueCompanion(serializer = {"Content-Type: application/x-www-form-urlencoded"})
    @ProtoParserKtdecodeProtoAndCachedecodedResponse1(RemoteActionCompatParcelizer = "WRSiteInterceptEngine/MobileTargeting")
    syncCustomerProfile<TargetingResponse> getMobileTargeting(@getFeatureKey(RemoteActionCompatParcelizer = "Q_ZoneID") String str, @ProtoHoldoutMsg(write = "extRef") String str2, @getFeatureKey(RemoteActionCompatParcelizer = "extRef") String str3, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTTYPE") String str4, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTVERSION") String str5, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICEOS") String str6, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICETYPE") String str7);

    @ProtoHoldoutMsgCompanion
    @ProtoParserKtdecodeProtoAndCachedecodedResponse1(RemoteActionCompatParcelizer = "WRSiteInterceptEngine/")
    syncCustomerProfile<Void> interceptRecordPageView(@getFeatureKey(RemoteActionCompatParcelizer = "Q_PageView") int i, @getFeatureKey(RemoteActionCompatParcelizer = "Q_SIID") String str, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CID") String str2, @getFeatureKey(RemoteActionCompatParcelizer = "Q_ASID") String str3, @getFeatureKey(RemoteActionCompatParcelizer = "Q_LOC") String str4, @getFeatureKey(RemoteActionCompatParcelizer = "r") String str5, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTTYPE") String str6, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTVERSION") String str7, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICEOS") String str8, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICETYPE") String str9, @ProtoHoldoutMsg(write = "BrandID") String str10, @ProtoHoldoutMsg(write = "ZoneID") String str11);

    @ProtoHoldoutMsgCompanion
    @ProtoListValueCompanion(serializer = {"Content-Type: application/x-www-form-urlencoded"})
    @ProtoParserKtdecodeProtoAndCachedecodedResponse1(RemoteActionCompatParcelizer = "WRSiteInterceptEngine/Ajax.php")
    syncCustomerProfile<Void> postErrorLog(@ProtoHoldoutMsg(write = "LevelName") String str, @ProtoHoldoutMsg(write = "Message") String str2, @getFeatureKey(RemoteActionCompatParcelizer = "action") String str3, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTTYPE") String str4, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTVERSION") String str5, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICEOS") String str6, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICETYPE") String str7);

    @ProtoHoldoutMsgCompanion
    @ProtoListValueCompanion(serializer = {"Content-Type: application/x-www-form-urlencoded"})
    @ProtoParserKtdecodeProtoAndCachedecodedResponse1
    syncCustomerProfile<_get_messageWebView_lambda3> postSurveyResponse(@ProtoRolloutMsg String str, @getFeatureKey(RemoteActionCompatParcelizer = "SurveyId") String str2, @getFeatureKey(RemoteActionCompatParcelizer = "InterceptId") String str3, @ProtoHoldoutMsg(write = "Q_PostResponse") String str4, @ProtoHoldoutMsg(write = "ED") String str5);

    @ProtoHoldoutMsgCompanion
    @ProtoListValueCompanion(serializer = {"Content-Type: application/x-www-form-urlencoded"})
    @ProtoParserKtdecodeProtoAndCachedecodedResponse1(RemoteActionCompatParcelizer = "WRSiteInterceptEngine/")
    syncCustomerProfile<Void> recordClick(@getFeatureKey(RemoteActionCompatParcelizer = "Q_Click") int i, @getFeatureKey(RemoteActionCompatParcelizer = "Q_SIID") String str, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CID") String str2, @getFeatureKey(RemoteActionCompatParcelizer = "Q_ASID") String str3, @getFeatureKey(RemoteActionCompatParcelizer = "Q_LOC") String str4, @getFeatureKey(RemoteActionCompatParcelizer = "r") String str5, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTTYPE") String str6, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTVERSION") String str7, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICEOS") String str8, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICETYPE") String str9, @ProtoHoldoutMsg(write = "ZoneID") String str10, @ProtoHoldoutMsg(write = "BrandID") String str11);

    @ProtoHoldoutMsgCompanion
    @ProtoListValueCompanion(serializer = {"Content-Type: application/x-www-form-urlencoded"})
    @ProtoParserKtdecodeProtoAndCachedecodedResponse1(RemoteActionCompatParcelizer = "WRSiteInterceptEngine/")
    syncCustomerProfile<Void> recordImpression(@getFeatureKey(RemoteActionCompatParcelizer = "Q_Impress") int i, @getFeatureKey(RemoteActionCompatParcelizer = "Q_SIID") String str, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CID") String str2, @getFeatureKey(RemoteActionCompatParcelizer = "Q_ASID") String str3, @getFeatureKey(RemoteActionCompatParcelizer = "Q_LOC") String str4, @getFeatureKey(RemoteActionCompatParcelizer = "r") String str5, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTTYPE") String str6, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTVERSION") String str7, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICEOS") String str8, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICETYPE") String str9, @ProtoHoldoutMsg(write = "BrandDC") String str10, @ProtoHoldoutMsg(write = "ExtRef") String str11, @ProtoHoldoutMsg(write = "DistributionID") String str12, @ProtoHoldoutMsg(write = "ContactID") String str13, @ProtoHoldoutMsg(write = "DirectoryID") String str14, @ProtoHoldoutMsg(write = "SurveyID") String str15, @ProtoHoldoutMsg(write = "ZoneID") String str16, @ProtoHoldoutMsg(write = "BrandID") String str17);

    @ProtoHoldoutMsgCompanion
    @ProtoListValueCompanion(serializer = {"Content-Type: application/x-www-form-urlencoded"})
    @ProtoParserKtdecodeProtoAndCachedecodedResponse1(RemoteActionCompatParcelizer = "WRSiteInterceptEngine/MobileXmdDcfEval")
    syncCustomerProfile<ContactFrequencyResponse> requestXMDContactFrequency(@getFeatureKey(RemoteActionCompatParcelizer = "Q_ZoneID") String str, @ProtoHoldoutMsg(write = "extRef") String str2, @ProtoHoldoutMsg(write = "ContactFrequencyDebugIntercepts") String str3, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTTYPE") String str4, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTVERSION") String str5, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICEOS") String str6, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICETYPE") String str7);

    @ProtoParserKtdecodeProtoAndCachedecodedResponse1
    syncCustomerProfile<JsonObject> startSurveySession(@ProtoRolloutMsg String str, @ProtoFeaturesMsgCompanion JsonObject jsonObject);

    @ProtoListValueCompanion(serializer = {"Content-Type: application/json"})
    @ProtoParserKtdecodeProtoAndCachedecodedResponse1
    syncCustomerProfile<_get_messageWebView_lambda3> updateSurveySession(@ProtoRolloutMsg String str, @ProtoFeaturesMsgCompanion JsonObject jsonObject);

    @ProtoHoldoutMsgCompanion
    @ProtoParserKtdecodeProtoAndCachedecodedResponse1(RemoteActionCompatParcelizer = "WRSiteInterceptEngine/")
    syncCustomerProfile<Void> zoneRecordPageView(@getFeatureKey(RemoteActionCompatParcelizer = "Q_PageView") int i, @getFeatureKey(RemoteActionCompatParcelizer = "Q_ZID") String str, @getFeatureKey(RemoteActionCompatParcelizer = "Q_LOC") String str2, @getFeatureKey(RemoteActionCompatParcelizer = "r") String str3, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTTYPE") String str4, @getFeatureKey(RemoteActionCompatParcelizer = "Q_CLIENTVERSION") String str5, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICEOS") String str6, @getFeatureKey(RemoteActionCompatParcelizer = "Q_DEVICETYPE") String str7, @ProtoHoldoutMsg(write = "BrandID") String str8, @ProtoHoldoutMsg(write = "ZoneID") String str9);
}
