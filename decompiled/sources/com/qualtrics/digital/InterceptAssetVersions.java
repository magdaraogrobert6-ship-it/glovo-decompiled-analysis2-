package com.qualtrics.digital;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class InterceptAssetVersions {
    boolean Active;
    ArrayList<CreativeAsset> Creatives;
    int Version;

    public ArrayList<CreativeAsset> getCreatives() {
        return this.Creatives;
    }

    public int getVersion() {
        return this.Version;
    }

    public int getCreativeVersion(String str) {
        ArrayList<CreativeAsset> arrayList = this.Creatives;
        if (arrayList == null) {
            return -1;
        }
        for (CreativeAsset creativeAsset : arrayList) {
            if (creativeAsset.getID().equals(str)) {
                return creativeAsset.getVersion();
            }
        }
        return -1;
    }
}
