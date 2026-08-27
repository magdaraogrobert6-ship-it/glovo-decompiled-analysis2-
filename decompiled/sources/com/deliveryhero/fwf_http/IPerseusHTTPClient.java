package com.deliveryhero.fwf_http;

import com.deliveryhero.fwf_tracking.model.PerseusBrand;
import com.deliveryhero.fwf_tracking.model.PerseusDataRequestApi;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public interface IPerseusHTTPClient {
    Object insertHits(String str, PerseusBrand perseusBrand, long j, PerseusDataRequestApi perseusDataRequestApi, ShortNewsContentCardView<? super String> shortNewsContentCardView);

    Object insertHitsEcon(String str, long j, PerseusDataRequestApi perseusDataRequestApi, ShortNewsContentCardView<? super String> shortNewsContentCardView);
}
