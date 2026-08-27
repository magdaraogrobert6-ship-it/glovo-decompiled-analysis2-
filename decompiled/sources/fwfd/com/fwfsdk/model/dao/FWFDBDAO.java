package fwfd.com.fwfsdk.model.dao;

import fwfd.com.fwfsdk.model.db.FWFFeature;
import fwfd.com.fwfsdk.model.db.FWFFlagId;
import fwfd.com.fwfsdk.model.db.FWFFlagKey;
import fwfd.com.fwfsdk.model.db.FWFSDKInfo;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class FWFDBDAO {
    public abstract void deleteAllFlagKeys(String str);

    public abstract void deleteAllFlagRecords();

    public abstract void deleteAllFlagsFromEnvironment(String str);

    public abstract List<FWFFeature> getAllExperiments();

    public abstract List<FWFFlagId> getAllFlagKeysByRelevantContext(String str);

    public abstract List<FWFFeature> getAllFlags();

    public abstract List<FWFFeature> getAllFlagsFromEnvironment(String str);

    public abstract FWFFeature getFlagById(String str, String str2);

    public abstract List<FWFFlagKey> getFlagKeys(String str);

    public abstract List<FWFFeature> getFlagsById(List<String> list, String str);

    public abstract FWFSDKInfo getLastSDKInfo();

    public abstract FWFFlagId getOldestUpdatedFlagFromEnvironment(String str);

    public abstract List<FWFFlagId> getSubscribedFlagIds();

    public abstract void insertFlag(FWFFeature fWFFeature);

    public abstract void insertFlagKeys(List<FWFFlagKey> list);

    public abstract void insertFlags(List<FWFFeature> list);

    public abstract void insertSDKInfo(FWFSDKInfo fWFSDKInfo);

    public void deleteAndInsertNewFlagKeys(List<FWFFlagKey> list, String str) {
        deleteAllFlagKeys(str);
        insertFlagKeys(list);
    }
}
