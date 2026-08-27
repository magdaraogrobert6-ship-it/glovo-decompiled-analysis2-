package com.qualtrics.digital;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.gson.JsonObject;
import com.huawei.hms.framework.common.BundleUtil;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.FwFClientExtensionKtgetVariationsevalResults1;
import o.getHoldoutVariationName;
import o.syncCustomerProfile;

/* JADX INFO: loaded from: classes3.dex */
public class ClientSideInterceptUtils {
    private static final String DISTRIBUTION_ID_PREFIX = "DXD_";
    private static ClientSideInterceptUtils mInstance;
    IHydratedDCFRequest contactFrequencyRequest;
    Set<String> cstInterceptsWithDCFEnabled;
    ClientCallbackUtils mClientCallbackUtils;
    private ArrayList<ClientSideIntercept> mInitializedClientSideIntercepts;
    Map<String, InterceptDefinition> mInterceptDefinitions;
    Map<String, ActionSet> mPassingActionSets;
    Map<String, CSTActionSet> mPassingCSTActionSets;
    Properties mProperties;
    SDKUtils mSDKUtils;
    String mSurveyBaseUrl;
    Map<String, XmdAttributes> passingActionSetXmdAttributes;
    Map<String, TargetingResult> targetingResults;

    public void setContactFrequencyRequest(IHydratedDCFRequest iHydratedDCFRequest) {
        this.contactFrequencyRequest = iHydratedDCFRequest;
    }

    public void setInitializedClientSideIntercepts(ArrayList<ClientSideIntercept> arrayList) {
        this.mInitializedClientSideIntercepts = arrayList;
    }

    public void setSurveyBaseUrl(String str) {
        this.mSurveyBaseUrl = str;
    }

    public boolean shouldPreventRepeatedDisplay(String str, String str2) {
        try {
            double d = Double.parseDouble(str);
            long lastDisplayTimeForIntercept = this.mProperties.getLastDisplayTimeForIntercept(str2);
            return lastDisplayTimeForIntercept != Long.MAX_VALUE && lastDisplayTimeForIntercept + ((long) ((((d * 24.0d) * 60.0d) * 60.0d) * 1000.0d)) > System.currentTimeMillis();
        } catch (Exception e) {
            postErrorLog(af$$ExternalSyntheticOutline0.m("Encountered error while parsing PRD: ", str, " intercept:", str2), str2, e);
            return true;
        }
    }

    private /* synthetic */ void lambda$evaluateClientSideInterceptLogic$2(String str, TargetingResult targetingResult) {
        this.targetingResults.put(str, targetingResult);
        this.mClientCallbackUtils.callMasterEvaluateCallback(this.targetingResults);
    }

    public boolean displayAllPassingIntercepts(Context context, int i, boolean z) {
        String str;
        if (new HashSet(this.mPassingActionSets.keySet()).isEmpty()) {
            return false;
        }
        boolean zDisplayNotificationIntercepts = displayNotificationIntercepts(context, i, z);
        Map<String, ActionSet> nonNotificationActionSets = getNonNotificationActionSets();
        Iterator<ClientSideIntercept> it = this.mInitializedClientSideIntercepts.iterator();
        do {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = it.next().InterceptID;
        } while (!nonNotificationActionSets.containsKey(str));
        boolean zDisplayIntercept = str != null ? displayIntercept(context, str, i, z) : false;
        this.mPassingActionSets.clear();
        return zDisplayNotificationIntercepts || zDisplayIntercept;
    }

    public boolean displayIntercept(Context context, String str, int i, boolean z) {
        ActionSet actionSet = this.mPassingActionSets.get(str);
        if (actionSet == null) {
            return false;
        }
        boolean zDisplay = actionSet.display(context, i, z);
        this.mPassingActionSets.remove(str);
        Qualtrics.instance().properties.setLastDisplayTimeForIntercept(str);
        return zDisplay;
    }

    public boolean doAnyInterceptsHaveDCFEnabled() {
        return !this.cstInterceptsWithDCFEnabled.isEmpty();
    }

    public boolean evaluateAllClientSideIntercepts(IMakeDCFRequestCallback iMakeDCFRequestCallback) {
        this.mPassingActionSets.clear();
        this.mPassingCSTActionSets.clear();
        this.targetingResults.clear();
        if (this.mInitializedClientSideIntercepts.isEmpty()) {
            this.targetingResults.put("Error", new TargetingResult(TargetingResultStatus.error, null, new Exception("Cannot evaluate logic, no initialized intercept found")));
            this.mClientCallbackUtils.callEvaluateProjectCallback(this.targetingResults);
            return false;
        }
        Iterator<ClientSideIntercept> it = this.mInitializedClientSideIntercepts.iterator();
        while (it.hasNext()) {
            evaluateClientSideInterceptLogic(it.next().InterceptID);
        }
        int i = 1;
        if (!this.mPassingCSTActionSets.isEmpty()) {
            if (iMakeDCFRequestCallback != null) {
                HashMap map = new HashMap();
                for (String str : this.mPassingCSTActionSets.keySet()) {
                    map.put(str, this.mPassingCSTActionSets.get(str).ActionSetID);
                }
                setContactFrequencyRequest(new ClientSideInterceptUtils$$ExternalSyntheticLambda0(iMakeDCFRequestCallback, map, i));
                iMakeDCFRequestCallback.run(map);
                return true;
            }
            HashMap map2 = new HashMap();
            for (String str2 : this.mPassingCSTActionSets.keySet()) {
                map2.put(str2, Boolean.TRUE);
                fetchCreativeDefinition(str2);
            }
        }
        return true;
    }

    public boolean evaluateClientSideIntercept(String str, IMakeDCFRequestCallback iMakeDCFRequestCallback) {
        this.mPassingActionSets.clear();
        this.mPassingCSTActionSets.clear();
        this.targetingResults.clear();
        int i = 0;
        if (this.mInitializedClientSideIntercepts.isEmpty()) {
            this.mClientCallbackUtils.callEvaluateInterceptCallback(new TargetingResult(TargetingResultStatus.error, null, new Exception("Cannot evaluate logic, no initialized intercept found")));
            return false;
        }
        evaluateClientSideInterceptLogic(str);
        if (!this.mPassingCSTActionSets.containsKey(str)) {
            return true;
        }
        if (iMakeDCFRequestCallback == null) {
            fetchCreativeDefinition(str);
            return true;
        }
        HashMap map = new HashMap();
        map.put(str, this.mPassingCSTActionSets.get(str).ActionSetID);
        setContactFrequencyRequest(new ClientSideInterceptUtils$$ExternalSyntheticLambda0(iMakeDCFRequestCallback, map, i));
        iMakeDCFRequestCallback.run(map);
        return true;
    }

    public void fetchAllInterceptDefinitions() {
        this.mInterceptDefinitions.clear();
        final HashMap map = new HashMap();
        this.mClientCallbackUtils.setTotalNumIntercepts(this.mInitializedClientSideIntercepts.size());
        for (final ClientSideIntercept clientSideIntercept : this.mInitializedClientSideIntercepts) {
            fetchIntercept(clientSideIntercept, new IQualtricsInitializationCallback() { // from class: com.qualtrics.digital.ClientSideInterceptUtils.1
                @Override // com.qualtrics.digital.IQualtricsInitializationCallback
                public void run(InitializationResult initializationResult) {
                    map.put(clientSideIntercept.InterceptID, initializationResult);
                    ClientSideInterceptUtils clientSideInterceptUtils = ClientSideInterceptUtils.this;
                    clientSideInterceptUtils.mClientCallbackUtils.runLoadProjectCallbackIfAllInterceptsFetched(map, clientSideInterceptUtils.mInterceptDefinitions);
                }
            });
        }
    }

    public void fetchCreativeDefinition(final String str) {
        final CSTActionSet cSTActionSet = this.mPassingCSTActionSets.get(str);
        FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1 = new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.ClientSideInterceptUtils.3
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<JsonObject> synccustomerprofile, Throwable th) {
                ClientSideInterceptUtils.this.targetingResults.put(str, new TargetingResult(TargetingResultStatus.error, null, new Exception("Failed to load creative definition, network request failed"), str, null, null, null));
                ClientSideInterceptUtils clientSideInterceptUtils = ClientSideInterceptUtils.this;
                clientSideInterceptUtils.mClientCallbackUtils.callMasterEvaluateCallback(clientSideInterceptUtils.targetingResults);
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<JsonObject> synccustomerprofile, getHoldoutVariationName<JsonObject> getholdoutvariationname) {
                Creative decodedCreativeDefinition = DecoderUtils.getDecodedCreativeDefinition(getholdoutvariationname);
                if (decodedCreativeDefinition == null) {
                    Exception exc = new Exception("Failed to load creative definition, creative JSON contains invalid type");
                    ClientSideInterceptUtils.this.postErrorLog("Failed to load creative definition, creative JSON contains invalid type", str, exc);
                    ClientSideInterceptUtils.this.targetingResults.put(str, new TargetingResult(TargetingResultStatus.error, null, exc, str, null, null, null));
                    return;
                }
                ClientSideInterceptUtils.this.populateTriggeredActionSet(str, cSTActionSet.ActionSetID, decodedCreativeDefinition);
                if (ClientSideInterceptUtils.this.mPassingActionSets.get(str) == null) {
                    Exception exc2 = new Exception("Evaluation was called on intercept before intercept was done loading");
                    ClientSideInterceptUtils.this.postErrorLog("Evaluation was called on intercept before intercept was done loading", str, exc2);
                    ClientSideInterceptUtils.this.targetingResults.put(str, new TargetingResult(TargetingResultStatus.error, null, exc2, str, null, null, null));
                    return;
                }
                TargetingResultStatus targetingResultStatus = TargetingResultStatus.passed;
                String targetUrl = ClientSideInterceptUtils.this.mPassingActionSets.get(str).getTargetUrl();
                String str2 = str;
                CSTActionSet cSTActionSet2 = cSTActionSet;
                CSTCreative cSTCreative = cSTActionSet2.Creative;
                ClientSideInterceptUtils.this.targetingResults.put(str, new TargetingResult(targetingResultStatus, targetUrl, null, str2, cSTCreative.ID, cSTActionSet2.ActionSetID, CreativeTypes.getCreativeTypeFromName(cSTCreative.Type)));
                ClientSideInterceptUtils clientSideInterceptUtils = ClientSideInterceptUtils.this;
                clientSideInterceptUtils.mClientCallbackUtils.callMasterEvaluateCallback(clientSideInterceptUtils.targetingResults);
            }
        };
        try {
            this.mSDKUtils.getCreativeDefinition(cSTActionSet.Creative.ID, Integer.parseInt(cSTActionSet.Creative.Revision), str, fwFClientExtensionKtgetVariationsevalResults1);
        } catch (Exception unused) {
            Exception exc = new Exception("Action set revision not parsable");
            postErrorLog("Action set revision not parsable", str, exc);
            this.targetingResults.put(str, new TargetingResult(TargetingResultStatus.error, null, exc, str, null, null, null));
        }
    }

    public void fetchIntercept(final ClientSideIntercept clientSideIntercept, final IQualtricsInitializationCallback iQualtricsInitializationCallback) {
        if (!clientSideIntercept.Active.booleanValue()) {
            iQualtricsInitializationCallback.run(new InitializationResult(Boolean.FALSE, "Qualtrics: Intercept is inactive"));
            return;
        }
        try {
            int i = Integer.parseInt(clientSideIntercept.InterceptRevision);
            this.mSDKUtils.getInterceptDefinition(clientSideIntercept.InterceptID, i, new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.ClientSideInterceptUtils.2
                @Override // o.FwFClientExtensionKtgetVariationsevalResults1
                public void onResponse(syncCustomerProfile<Intercept> synccustomerprofile, getHoldoutVariationName<Intercept> getholdoutvariationname) {
                    try {
                        InterceptDefinition interceptDefinition = ((Intercept) getholdoutvariationname.body).getInterceptDefinition();
                        interceptDefinition.setSurveyBaseUrl(ClientSideInterceptUtils.this.mSurveyBaseUrl);
                        ClientSideInterceptUtils.this.mInterceptDefinitions.put(clientSideIntercept.InterceptID, interceptDefinition);
                        iQualtricsInitializationCallback.run(new InitializationResult(Boolean.TRUE, "Qualtrics: Intercept has been loaded"));
                    } catch (Exception e) {
                        ClientSideInterceptUtils.this.postErrorLog("Unable to decode intercept definition", clientSideIntercept.InterceptID, e);
                        iQualtricsInitializationCallback.run(new InitializationResult(Boolean.FALSE, "Qualtrics: Error loading intercept"));
                    }
                }

                @Override // o.FwFClientExtensionKtgetVariationsevalResults1
                public void onFailure(syncCustomerProfile<Intercept> synccustomerprofile, Throwable th) {
                    iQualtricsInitializationCallback.run(new InitializationResult(Boolean.FALSE, "Qualtrics: Error loading intercept"));
                }
            });
        } catch (Exception e) {
            postErrorLog("Unable to parse intercept revision", clientSideIntercept.InterceptID, e);
            iQualtricsInitializationCallback.run(new InitializationResult(Boolean.FALSE, "Qualtrics: Error parsing revision for intercept"));
        }
    }

    public void findClientSideInterceptsWithDCF() {
        this.cstInterceptsWithDCFEnabled.clear();
        for (ClientSideIntercept clientSideIntercept : this.mInitializedClientSideIntercepts) {
            if (clientSideIntercept.ContactFrequencyRulesEnabled.booleanValue()) {
                this.cstInterceptsWithDCFEnabled.add(clientSideIntercept.InterceptID);
            }
        }
    }

    public CSTActionSet findFirstPassingActionSet(ClientSideIntercept clientSideIntercept) {
        ArrayList<CSTActionSet> arrayList = clientSideIntercept.ActionSets;
        if (clientSideIntercept.RandomizedActionSets.booleanValue()) {
            Collections.shuffle(arrayList);
        }
        if (arrayList == null) {
            return null;
        }
        for (CSTActionSet cSTActionSet : arrayList) {
            if (cSTActionSet.LogicTree.evaluate()) {
                return cSTActionSet;
            }
        }
        return null;
    }

    public ClientSideIntercept findMatchingIntercept(String str) {
        for (ClientSideIntercept clientSideIntercept : this.mInitializedClientSideIntercepts) {
            if (clientSideIntercept.InterceptID.equals(str)) {
                return clientSideIntercept;
            }
        }
        return null;
    }

    public Map<String, ActionSet> getNonNotificationActionSets() {
        HashMap map = new HashMap();
        for (String str : this.mPassingActionSets.keySet()) {
            ActionSet actionSet = this.mPassingActionSets.get(str);
            if (actionSet.mCreative.getCreativeType() != CreativeType.MobileNotification) {
                map.put(str, actionSet);
            }
        }
        return map;
    }

    public Map<String, ActionSet> getNotificationActionSets() {
        HashMap map = new HashMap();
        for (String str : this.mPassingActionSets.keySet()) {
            ActionSet actionSet = this.mPassingActionSets.get(str);
            if (actionSet.mCreative.getCreativeType() == CreativeType.MobileNotification) {
                map.put(str, actionSet);
            }
        }
        return map;
    }

    public String getQTouchpoint(String str) {
        XmdAttributes xmdAttributes = this.passingActionSetXmdAttributes.get(str);
        if (xmdAttributes == null) {
            return null;
        }
        return xmdAttributes.DistributionId + BundleUtil.UNDERLINE_TAG + xmdAttributes.ContactId + BundleUtil.UNDERLINE_TAG + xmdAttributes.DirectoryId;
    }

    public void populateTriggeredActionSet(String str, String str2, Creative creative) {
        InterceptDefinition interceptDefinition = this.mInterceptDefinitions.get(str);
        if (interceptDefinition == null) {
            return;
        }
        for (ActionSet actionSet : interceptDefinition.ActionSets) {
            if (actionSet.ID.equals(str2)) {
                actionSet.InterceptID = str;
                actionSet.mCreative = creative;
                actionSet.mSurveyBaseUrl = interceptDefinition.getSurveyBaseUrl();
                this.mPassingActionSets.put(str, actionSet);
                return;
            }
        }
    }

    public ClientSideInterceptUtils() {
        this.mProperties = Qualtrics.instance().properties;
        this.mSDKUtils = SDKUtils.instance();
        this.mClientCallbackUtils = ClientCallbackUtils.instance();
        this.mInitializedClientSideIntercepts = new ArrayList<>();
        this.mInterceptDefinitions = new HashMap();
        this.cstInterceptsWithDCFEnabled = new HashSet();
        this.mPassingActionSets = new HashMap();
        this.mPassingCSTActionSets = new HashMap();
        this.targetingResults = new HashMap();
        this.passingActionSetXmdAttributes = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postErrorLog(String str, String str2, Throwable th) {
        this.mSDKUtils.postErrorLog(str + " interceptId:" + str2, th);
    }

    public boolean displayNotificationIntercepts(Context context, int i, boolean z) {
        Map<String, ActionSet> notificationActionSets = getNotificationActionSets();
        boolean z2 = false;
        if (!notificationActionSets.isEmpty()) {
            Iterator<ClientSideIntercept> it = this.mInitializedClientSideIntercepts.iterator();
            while (it.hasNext()) {
                String str = it.next().InterceptID;
                if (notificationActionSets.containsKey(str) && displayIntercept(context, str, i, z)) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public static ClientSideInterceptUtils instance() {
        if (mInstance == null) {
            mInstance = new ClientSideInterceptUtils();
        }
        return mInstance;
    }

    public void evaluateClientSideInterceptLogic(String str) {
        ClientSideIntercept clientSideInterceptFindMatchingIntercept = findMatchingIntercept(str);
        if (clientSideInterceptFindMatchingIntercept == null) {
            lambda$evaluateClientSideInterceptLogic$2(str, new TargetingResult(TargetingResultStatus.error, null, new Exception("Cannot evaluate logic, intercept does not exist or has not been loaded yet"), str, null, null, null));
            return;
        }
        if (!clientSideInterceptFindMatchingIntercept.Active.booleanValue()) {
            lambda$evaluateClientSideInterceptLogic$2(str, new TargetingResult(TargetingResultStatus.inactive, null, null, str, null, null, null));
            return;
        }
        if (shouldPreventRepeatedDisplay(clientSideInterceptFindMatchingIntercept.PreventRepeatedDisplay, clientSideInterceptFindMatchingIntercept.InterceptID)) {
            lambda$evaluateClientSideInterceptLogic$2(str, new TargetingResult(TargetingResultStatus.multipleDisplayPrevented, null, null, str, null, null, null));
            return;
        }
        if (!clientSideInterceptFindMatchingIntercept.LogicTree.evaluate()) {
            lambda$evaluateClientSideInterceptLogic$2(str, new TargetingResult(TargetingResultStatus.failedLogic, null, null, str, null, null, null));
            return;
        }
        CSTActionSet cSTActionSetFindFirstPassingActionSet = findFirstPassingActionSet(clientSideInterceptFindMatchingIntercept);
        if (cSTActionSetFindFirstPassingActionSet == null) {
            lambda$evaluateClientSideInterceptLogic$2(str, new TargetingResult(TargetingResultStatus.failedLogic, null, null, str, null, null, null));
            return;
        }
        this.mPassingCSTActionSets.put(str, cSTActionSetFindFirstPassingActionSet);
        if (clientSideInterceptFindMatchingIntercept.ContactID == null || clientSideInterceptFindMatchingIntercept.DirectoryID == null) {
            return;
        }
        XmdAttributes xmdAttributes = new XmdAttributes();
        try {
            xmdAttributes.DistributionId = HashingUtils.getGuid(DISTRIBUTION_ID_PREFIX);
            xmdAttributes.ContactId = clientSideInterceptFindMatchingIntercept.ContactID;
            xmdAttributes.DirectoryId = clientSideInterceptFindMatchingIntercept.DirectoryID;
            xmdAttributes.SurveyId = cSTActionSetFindFirstPassingActionSet.SurveyID;
            this.passingActionSetXmdAttributes.put(str, xmdAttributes);
        } catch (NoSuchAlgorithmException unused) {
            QualtricsLog.logError("XMD Error - no such hashing algorithm");
        }
    }

    public ClientSideInterceptUtils(Properties properties, SDKUtils sDKUtils, ClientCallbackUtils clientCallbackUtils) {
        this.mProperties = properties;
        this.mSDKUtils = sDKUtils;
        this.mClientCallbackUtils = clientCallbackUtils;
        this.mInitializedClientSideIntercepts = new ArrayList<>();
        this.mInterceptDefinitions = new HashMap();
        this.cstInterceptsWithDCFEnabled = new HashSet();
        this.mPassingActionSets = new HashMap();
        this.mPassingCSTActionSets = new HashMap();
        this.targetingResults = new HashMap();
        this.passingActionSetXmdAttributes = new HashMap();
    }
}
