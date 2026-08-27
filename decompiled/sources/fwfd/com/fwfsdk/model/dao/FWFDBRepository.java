package fwfd.com.fwfsdk.model.dao;

import android.content.Context;
import fwfd.com.fwfsdk.model.db.FWFFeature;
import fwfd.com.fwfsdk.model.db.FWFFlagId;
import fwfd.com.fwfsdk.model.db.FWFFlagKey;
import fwfd.com.fwfsdk.model.db.FWFSDKInfo;
import fwfd.com.fwfsdk.util.FWFDBRoom;
import fwfd.com.fwfsdk.util.FWFResultCallback;
import fwfd.com.fwfsdk.util.GenericAsyncTask;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class FWFDBRepository {
    private static final Integer SELECT_LIMIT = 998;
    private FWFDBDAO dao;

    public FWFDBRepository(Context context) {
        this.dao = FWFDBRoom.getDatabase(context).dao();
    }

    public void deleteAllFlagRecords() {
        new GenericAsyncTask<Void>(null) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.29
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public Void doAsync() {
                FWFDBRepository.this.dao.deleteAllFlagRecords();
                return null;
            }
        }.start();
    }

    public void deleteAllFlagsFromEnvironment(final String str) {
        new GenericAsyncTask<Void>(null) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.10
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public Void doAsync() {
                FWFDBRepository.this.dao.deleteAllFlagsFromEnvironment(str);
                return null;
            }
        }.start();
    }

    public void deleteAndInsertNewFlagKeys(final List<FWFFlagKey> list, final String str) {
        new GenericAsyncTask<Void>(null) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.25
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public Void doAsync() {
                FWFDBRepository.this.dao.deleteAndInsertNewFlagKeys(list, str);
                return null;
            }
        }.start();
    }

    public void insertFlag(final FWFFeature fWFFeature) {
        new GenericAsyncTask<Void>(null) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.3
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public Void doAsync() {
                FWFDBRepository.this.dao.insertFlag(fWFFeature);
                return null;
            }
        }.start();
    }

    public void insertFlagCheckingSubscribe(final FWFFeature fWFFeature) {
        new GenericAsyncTask<Void>(null) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.1
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public Void doAsync() {
                FWFFeature flagById = FWFDBRepository.this.dao.getFlagById(fWFFeature.getKey(), fWFFeature.getAccessToken());
                if (flagById != null && flagById.getSubscribe() == 1) {
                    fWFFeature.setSubscribe(1);
                }
                FWFDBRepository.this.dao.insertFlag(fWFFeature);
                return null;
            }
        }.start();
    }

    public void insertFlags(final List<FWFFeature> list) {
        new GenericAsyncTask<Void>(null) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.2
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public Void doAsync() {
                FWFDBRepository.this.dao.insertFlags(list);
                return null;
            }
        }.start();
    }

    public void insertSDKInfo(final FWFSDKInfo fWFSDKInfo) {
        new GenericAsyncTask<Void>(null) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.28
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public Void doAsync() {
                FWFDBRepository.this.dao.insertSDKInfo(fWFSDKInfo);
                return null;
            }
        }.start();
    }

    public void getAllExperiments(final FWFResultCallback<List<FWFFeature>> fWFResultCallback) {
        new GenericAsyncTask<List<FWFFeature>>(new GenericAsyncTask.GenericAsyncTaskCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.19
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(List<FWFFeature> list) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (list != null) {
                    fWFResultCallback2.onResponse(list);
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.20
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public List<FWFFeature> doAsync() {
                return FWFDBRepository.this.dao.getAllExperiments();
            }
        }.start();
    }

    public void getAllFlagKeysByRelevantContext(final String str, final FWFResultCallback<List<FWFFlagId>> fWFResultCallback) {
        new GenericAsyncTask<List<FWFFlagId>>(new GenericAsyncTask.GenericAsyncTaskCallback<List<FWFFlagId>>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.15
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(List<FWFFlagId> list) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (list != null) {
                    fWFResultCallback2.onResponse(list);
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.16
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public List<FWFFlagId> doAsync() {
                return FWFDBRepository.this.dao.getAllFlagKeysByRelevantContext("%" + str + "%");
            }
        }.start();
    }

    public void getAllFlags(final FWFResultCallback<List<FWFFeature>> fWFResultCallback) {
        new GenericAsyncTask<List<FWFFeature>>(new GenericAsyncTask.GenericAsyncTaskCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.21
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(List<FWFFeature> list) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (list != null) {
                    fWFResultCallback2.onResponse(list);
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.22
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public List<FWFFeature> doAsync() {
                return FWFDBRepository.this.dao.getAllFlags();
            }
        }.start();
    }

    public void getAllFlagsFromEnvironment(final String str, final FWFResultCallback<List<FWFFeature>> fWFResultCallback) {
        new GenericAsyncTask<List<FWFFeature>>(new GenericAsyncTask.GenericAsyncTaskCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.13
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(List<FWFFeature> list) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (list != null) {
                    fWFResultCallback2.onResponse(list);
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.14
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public List<FWFFeature> doAsync() {
                return FWFDBRepository.this.dao.getAllFlagsFromEnvironment(str);
            }
        }.start();
    }

    public void getFlagById(final String str, final String str2, final FWFResultCallback<FWFFeature> fWFResultCallback) {
        new GenericAsyncTask<FWFFeature>(new GenericAsyncTask.GenericAsyncTaskCallback<FWFFeature>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.4
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(FWFFeature fWFFeature) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (fWFFeature != null) {
                    fWFResultCallback2.onResponse(fWFFeature);
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public FWFFeature doAsync() {
                return FWFDBRepository.this.dao.getFlagById(str, str2);
            }
        }.start();
    }

    public void getFlagKeys(final String str, final FWFResultCallback<List<FWFFlagKey>> fWFResultCallback) {
        new GenericAsyncTask<List<FWFFlagKey>>(new GenericAsyncTask.GenericAsyncTaskCallback<List<FWFFlagKey>>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.23
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(List<FWFFlagKey> list) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (list != null) {
                    fWFResultCallback2.onResponse(list);
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.24
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public List<FWFFlagKey> doAsync() {
                return FWFDBRepository.this.dao.getFlagKeys(str);
            }
        }.start();
    }

    public void getFlagsById(final List<String> list, final String str, final FWFResultCallback<List<FWFFeature>> fWFResultCallback) {
        new GenericAsyncTask<List<FWFFeature>>(new GenericAsyncTask.GenericAsyncTaskCallback<List<FWFFeature>>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.8
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(List<FWFFeature> list2) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (list2 != null) {
                    fWFResultCallback2.onResponse(list2);
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.9
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public List<FWFFeature> doAsync() {
                if (list.size() <= FWFDBRepository.SELECT_LIMIT.intValue()) {
                    return FWFDBRepository.this.dao.getFlagsById(list, str);
                }
                int size = list.size() / FWFDBRepository.SELECT_LIMIT.intValue();
                int size2 = list.size() % FWFDBRepository.SELECT_LIMIT.intValue();
                if (size2 > 0) {
                    size++;
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    int iIntValue = (i != size + (-1) || size2 <= 0) ? FWFDBRepository.SELECT_LIMIT.intValue() + i2 : i2 + size2;
                    arrayList.addAll(FWFDBRepository.this.dao.getFlagsById(list.subList(i2, iIntValue), str));
                    i++;
                    i2 = iIntValue;
                }
                return arrayList;
            }
        }.start();
    }

    public void getLastSDKInfo(final FWFResultCallback<FWFSDKInfo> fWFResultCallback) {
        new GenericAsyncTask<FWFSDKInfo>(new GenericAsyncTask.GenericAsyncTaskCallback<FWFSDKInfo>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.26
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(FWFSDKInfo fWFSDKInfo) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (fWFSDKInfo != null) {
                    fWFResultCallback2.onResponse(fWFSDKInfo);
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.27
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public FWFSDKInfo doAsync() {
                return FWFDBRepository.this.dao.getLastSDKInfo();
            }
        }.start();
    }

    public void getOldestUpdatedFlagFromEnvironment(final String str, final FWFResultCallback<Boolean> fWFResultCallback) {
        new GenericAsyncTask<FWFFlagId>(new GenericAsyncTask.GenericAsyncTaskCallback<FWFFlagId>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.11
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(FWFFlagId fWFFlagId) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (fWFFlagId != null) {
                    fWFResultCallback2.onResponse(Boolean.valueOf(!fWFFlagId.requiresUpdate().booleanValue()));
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public FWFFlagId doAsync() {
                return FWFDBRepository.this.dao.getOldestUpdatedFlagFromEnvironment(str);
            }
        }.start();
    }

    public void getSubscribedFlagIds(final FWFResultCallback<List<FWFFlagId>> fWFResultCallback) {
        new GenericAsyncTask<List<FWFFlagId>>(new GenericAsyncTask.GenericAsyncTaskCallback<List<FWFFlagId>>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.6
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(List<FWFFlagId> list) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (list != null) {
                    fWFResultCallback2.onResponse(list);
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.7
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public List<FWFFlagId> doAsync() {
                return FWFDBRepository.this.dao.getSubscribedFlagIds();
            }
        }.start();
    }

    public void getAllFlagKeysByRelevantContext(final List<String> list, final FWFResultCallback<Set<FWFFlagId>> fWFResultCallback) {
        new GenericAsyncTask<Set<FWFFlagId>>(new GenericAsyncTask.GenericAsyncTaskCallback<Set<FWFFlagId>>() { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.17
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask.GenericAsyncTaskCallback
            public void onResult(Set<FWFFlagId> set) {
                FWFResultCallback fWFResultCallback2 = fWFResultCallback;
                if (set != null) {
                    fWFResultCallback2.onResponse(set);
                } else {
                    fWFResultCallback2.onError("FunWithFlags: DB Error");
                }
            }
        }) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBRepository.18
            @Override // fwfd.com.fwfsdk.util.GenericAsyncTask
            public Set<FWFFlagId> doAsync() {
                HashSet hashSet = new HashSet();
                for (String str : list) {
                    List<FWFFlagId> allFlagKeysByRelevantContext = FWFDBRepository.this.dao.getAllFlagKeysByRelevantContext("%" + str + "%");
                    if (allFlagKeysByRelevantContext != null && !allFlagKeysByRelevantContext.isEmpty()) {
                        hashSet.addAll(allFlagKeysByRelevantContext);
                    }
                }
                return hashSet;
            }
        }.start();
    }
}
