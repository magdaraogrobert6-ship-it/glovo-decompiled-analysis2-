package com.qualtrics.digital;

import o.ProtoFeaturesMsgCompanion;
import o.ProtoParserKtdecodeProtoAndCachedecodedResponse1;
import o.syncCustomerProfile;

/* JADX INFO: loaded from: classes3.dex */
interface ILatencyReportingService {
    @ProtoParserKtdecodeProtoAndCachedecodedResponse1(RemoteActionCompatParcelizer = "/rum/global")
    syncCustomerProfile<Void> recordLatency(@ProtoFeaturesMsgCompanion LatencyReportBody latencyReportBody);
}
