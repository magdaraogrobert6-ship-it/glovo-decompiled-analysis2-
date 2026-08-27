package fwfd.com.fwfsdk.model.dao;

import fwfd.com.fwfsdk.FunWithFlags;
import fwfd.com.fwfsdk.model.api.FWFPut;
import fwfd.com.fwfsdk.model.api.FlagKeysContainer;
import fwfd.com.fwfsdk.model.api.requestbody.FWFGetFeaturesRequest;
import fwfd.com.fwfsdk.model.api.requestbody.FWFGetFlagRequest;
import fwfd.com.fwfsdk.util.FWFHelper;
import fwfd.com.fwfsdk.util.FWFResultCallback;
import java.util.Arrays;
import java.util.LinkedHashMap;
import o.FwFClientExtensionKtgetVariationsevalResults1;
import o._get_messageWebView_lambda1;
import o.getHoldoutVariationName;
import o.syncCustomerProfile;

/* JADX INFO: loaded from: classes5.dex */
public class FWFAPIDAO extends FWFAPIClient {
    private final FWFAPIService service;

    private FWFGetFeaturesRequest createGetFlagsRequest(String[] strArr) {
        return new FWFGetFeaturesRequest(FunWithFlags.getInstance().getUser().getAttributes(), strArr);
    }

    public void getFWFFlagKeys(final String str, final FWFResultCallback<FlagKeysContainer> fWFResultCallback) {
        this.service.getFlagKeys(str).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: fwfd.com.fwfsdk.model.dao.FWFAPIDAO.4
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<FlagKeysContainer> synccustomerprofile, Throwable th) {
                fWFResultCallback.onError(FWFHelper.fwfErrorFlagKeysAPIResponse(str, th.getMessage()));
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<FlagKeysContainer> synccustomerprofile, getHoldoutVariationName<FlagKeysContainer> getholdoutvariationname) {
                Object obj;
                _get_messageWebView_lambda1 _get_messagewebview_lambda1 = getholdoutvariationname.rawResponse;
                if (!_get_messagewebview_lambda1.isSuccessful || (obj = getholdoutvariationname.body) == null) {
                    fWFResultCallback.onError(FWFHelper.fwfErrorFlagKeysAPIResponse(str, Integer.valueOf(_get_messagewebview_lambda1.code)));
                } else {
                    fWFResultCallback.onResponse((FlagKeysContainer) obj);
                }
            }
        });
    }

    public FWFAPIDAO(String str) {
        super(str, FunWithFlags.getInstance().getFwfConfig().getCustomInterceptors());
        this.service = (FWFAPIService) this.retrofit.write(FWFAPIService.class);
    }

    public void getFWFFeature(final String str, String str2, final FWFResultCallback<FWFPut> fWFResultCallback) {
        this.service.getFWFFeature(str, new FWFGetFlagRequest(FunWithFlags.getInstance().getUser().getAttributes()), str2, String.valueOf(FunWithFlags.getInstance().getFwfConfig().isDebugMode())).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: fwfd.com.fwfsdk.model.dao.FWFAPIDAO.1
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<FWFPut> synccustomerprofile, Throwable th) {
                fWFResultCallback.onError(FWFHelper.fwfErrorAPIResponse(str, th.getMessage()));
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<FWFPut> synccustomerprofile, getHoldoutVariationName<FWFPut> getholdoutvariationname) {
                Object obj;
                _get_messageWebView_lambda1 _get_messagewebview_lambda1 = getholdoutvariationname.rawResponse;
                if (!_get_messagewebview_lambda1.isSuccessful || (obj = getholdoutvariationname.body) == null) {
                    fWFResultCallback.onError(FWFHelper.fwfErrorAPIResponse(str, Integer.valueOf(_get_messagewebview_lambda1.code)));
                } else {
                    fWFResultCallback.onResponse((FWFPut) obj);
                }
            }
        });
    }

    public void getFWFFeatures(final String str, final FWFResultCallback<LinkedHashMap<String, FWFPut>> fWFResultCallback) {
        this.service.getFlags(new FWFGetFlagRequest(FunWithFlags.getInstance().getUser().getAttributes()), str, String.valueOf(FunWithFlags.getInstance().getFwfConfig().isDebugMode())).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: fwfd.com.fwfsdk.model.dao.FWFAPIDAO.3
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<LinkedHashMap<String, FWFPut>> synccustomerprofile, Throwable th) {
                fWFResultCallback.onError(FWFHelper.fwfErrorAllFlagsAPIResponse(str, th.getMessage()));
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<LinkedHashMap<String, FWFPut>> synccustomerprofile, getHoldoutVariationName<LinkedHashMap<String, FWFPut>> getholdoutvariationname) {
                Object obj;
                _get_messageWebView_lambda1 _get_messagewebview_lambda1 = getholdoutvariationname.rawResponse;
                if (!_get_messagewebview_lambda1.isSuccessful || (obj = getholdoutvariationname.body) == null) {
                    fWFResultCallback.onError(FWFHelper.fwfErrorAllFlagsAPIResponse(str, Integer.valueOf(_get_messagewebview_lambda1.code)));
                } else {
                    fWFResultCallback.onResponse((LinkedHashMap) obj);
                }
            }
        });
    }

    public void getFWFFeatures(final String[] strArr, String str, final FWFResultCallback<LinkedHashMap<String, FWFPut>> fWFResultCallback) {
        this.service.getFWFFeatures(createGetFlagsRequest(strArr), str, String.valueOf(FunWithFlags.getInstance().getFwfConfig().isDebugMode())).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: fwfd.com.fwfsdk.model.dao.FWFAPIDAO.2
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<LinkedHashMap<String, FWFPut>> synccustomerprofile, Throwable th) {
                fWFResultCallback.onError(FWFHelper.fwfErrorAPIResponse(Arrays.toString(strArr), th.getMessage()));
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<LinkedHashMap<String, FWFPut>> synccustomerprofile, getHoldoutVariationName<LinkedHashMap<String, FWFPut>> getholdoutvariationname) {
                Object obj;
                if (!getholdoutvariationname.rawResponse.isSuccessful || (obj = getholdoutvariationname.body) == null) {
                    fWFResultCallback.onError(FWFHelper.fwfErrorAPIResponse(Arrays.toString(strArr), Integer.valueOf(getholdoutvariationname.rawResponse.code)));
                } else {
                    fWFResultCallback.onResponse((LinkedHashMap) obj);
                }
            }
        });
    }
}
