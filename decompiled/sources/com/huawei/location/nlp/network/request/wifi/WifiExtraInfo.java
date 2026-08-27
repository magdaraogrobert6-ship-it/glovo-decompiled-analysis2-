package com.huawei.location.nlp.network.request.wifi;

import com.huawei.location.nlp.network.request.BaseExtraInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WifiExtraInfo extends BaseExtraInfo {
    public static int RemoteActionCompatParcelizer;
    public static int read;
    private List<Integer> macDetails;

    public List<Integer> getMacDetails() {
        return this.macDetails;
    }

    public void setMacDetails(List<Integer> list) {
        this.macDetails = list;
    }

    public static int read() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 7317804;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        read = i3;
        return i3;
    }
}
