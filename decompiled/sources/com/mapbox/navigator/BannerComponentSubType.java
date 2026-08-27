package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum BannerComponentSubType {
    JCT("JCT"),
    SIGNBOARD("Signboard"),
    SAPAGUIDEMAP("Sapaguidemap"),
    SAPA("Sapa"),
    AFTERTOLL("Aftertoll"),
    CITYREAL("Cityreal"),
    ENT("Ent"),
    EXIT("Exit"),
    TOLLBRANCH("Tollbranch"),
    DIRECTIONBOARD("Directionboard");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    BannerComponentSubType(String str) {
        this.str = str;
    }
}
