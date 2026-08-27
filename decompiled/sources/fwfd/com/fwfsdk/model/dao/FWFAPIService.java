package fwfd.com.fwfsdk.model.dao;

import fwfd.com.fwfsdk.model.api.FWFPut;
import fwfd.com.fwfsdk.model.api.FlagKeysContainer;
import fwfd.com.fwfsdk.model.api.requestbody.FWFGetFeaturesRequest;
import fwfd.com.fwfsdk.model.api.requestbody.FWFGetFlagRequest;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.util.LinkedHashMap;
import o.ProtoFeaturesMsgCompanion;
import o.ProtoParserKtdecodeProtoAndCache1;
import o.decodeProtoAndCache;
import o.getClauses;
import o.getEvalNonAuth;
import o.syncCustomerProfile;

/* JADX INFO: loaded from: classes5.dex */
public interface FWFAPIService {
    @ProtoParserKtdecodeProtoAndCache1(IconCompatParcelizer = "features/{key}")
    syncCustomerProfile<FWFPut> getFWFFeature(@decodeProtoAndCache(IconCompatParcelizer = "key") String str, @ProtoFeaturesMsgCompanion FWFGetFlagRequest fWFGetFlagRequest, @getClauses(serializer = "Authorization") String str2, @getClauses(serializer = "Isdebug") String str3);

    @ProtoParserKtdecodeProtoAndCache1(IconCompatParcelizer = FWFHelper.ENDPOINT_FEATURES)
    syncCustomerProfile<LinkedHashMap<String, FWFPut>> getFWFFeatures(@ProtoFeaturesMsgCompanion FWFGetFeaturesRequest fWFGetFeaturesRequest, @getClauses(serializer = "Authorization") String str, @getClauses(serializer = "Isdebug") String str2);

    @getEvalNonAuth(IconCompatParcelizer = FWFHelper.ENDPOINT_FLAG_KEYS)
    syncCustomerProfile<FlagKeysContainer> getFlagKeys(@getClauses(serializer = "Authorization") String str);

    @ProtoParserKtdecodeProtoAndCache1(IconCompatParcelizer = FWFHelper.ENDPOINT_FEATURES)
    syncCustomerProfile<LinkedHashMap<String, FWFPut>> getFlags(@ProtoFeaturesMsgCompanion FWFGetFlagRequest fWFGetFlagRequest, @getClauses(serializer = "Authorization") String str, @getClauses(serializer = "Isdebug") String str2);
}
