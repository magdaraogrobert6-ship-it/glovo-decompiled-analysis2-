package com.huawei.location.nlp.network.request.cell;

/* JADX INFO: loaded from: classes4.dex */
public class HwCellInfo extends CurrentCell {
    private static final int DEFAULT = -1;
    private int channelNumber = -1;

    public int getChannelNumber() {
        return this.channelNumber;
    }

    public void setChannelNumber(int i) {
        this.channelNumber = i;
    }
}
