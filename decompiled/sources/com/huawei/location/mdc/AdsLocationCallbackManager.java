package com.huawei.location.mdc;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public class AdsLocationCallbackManager {
    private static final byte[] SYNC_LOCK = new byte[0];
    private static final String TAG = "AdsLocationCallbackManager";
    private static volatile AdsLocationCallbackManager instance;
    private List<IMdcLocationListener> adsLocationListenerList = new ArrayList(10);

    private void addOrReplaceMdcLocationListener(IMdcLocationListener iMdcLocationListener) {
        String str;
        synchronized (SYNC_LOCK) {
            if (!isAdsLocationListenerEmpty()) {
                int i = 0;
                while (true) {
                    int size = this.adsLocationListenerList.size();
                    List<IMdcLocationListener> list = this.adsLocationListenerList;
                    if (i >= size) {
                        list.add(iMdcLocationListener);
                        str = "new add uuid here, uuid is: " + iMdcLocationListener.getUuid();
                        break;
                    }
                    if (list.get(i).getUuid().equals(iMdcLocationListener.getUuid())) {
                        this.adsLocationListenerList.set(i, iMdcLocationListener);
                        str = "replace uuid here, uuid is: " + iMdcLocationListener.getUuid();
                        break;
                    }
                    i++;
                }
            } else {
                this.adsLocationListenerList.add(iMdcLocationListener);
                str = "adsLocationListenerList is empty, add uuid here, uuid is: " + iMdcLocationListener.getUuid();
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, str);
        }
    }

    public void addAdsLocationListener(IMdcLocationListener iMdcLocationListener) {
        synchronized (SYNC_LOCK) {
            if (iMdcLocationListener != null) {
                if (this.adsLocationListenerList == null) {
                    this.adsLocationListenerList = new ArrayList();
                }
                addOrReplaceMdcLocationListener(iMdcLocationListener);
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "add iMdcLocationListener to adsLocationListenerList, size is : " + this.adsLocationListenerList.size());
            }
        }
    }

    public boolean isAdsLocationListenerEmpty() {
        boolean z;
        synchronized (SYNC_LOCK) {
            List<IMdcLocationListener> list = this.adsLocationListenerList;
            z = list == null || list.size() == 0;
        }
        return z;
    }

    public void onAdsLocationChanged(Location location) {
        synchronized (SYNC_LOCK) {
            List<IMdcLocationListener> list = this.adsLocationListenerList;
            if (list != null && list.size() != 0) {
                for (int i = 0; i < this.adsLocationListenerList.size(); i++) {
                    if (this.adsLocationListenerList.get(i) != null) {
                        this.adsLocationListenerList.get(i).onMdcLocationChanged(location);
                    }
                }
            }
        }
    }

    public boolean removeAdsLocationListener(String str) {
        synchronized (SYNC_LOCK) {
            if (str != null) {
                List<IMdcLocationListener> list = this.adsLocationListenerList;
                if (list != null && list.size() != 0) {
                    for (IMdcLocationListener iMdcLocationListener : this.adsLocationListenerList) {
                        if (str.equals(iMdcLocationListener.getUuid())) {
                            this.adsLocationListenerList.remove(iMdcLocationListener);
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "remove iMdcLocationListener from adsLocationListenerList, size is : " + this.adsLocationListenerList.size());
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static AdsLocationCallbackManager getInstance() {
        if (instance == null) {
            synchronized (SYNC_LOCK) {
                if (instance == null) {
                    instance = new AdsLocationCallbackManager();
                }
            }
        }
        return instance;
    }
}
