package com.sentiance.sdk.authentication;

import o.r8lambdaj_gGYyv3uIgip9phQGNOIt4IRtU;

/* JADX INFO: loaded from: classes3.dex */
public enum UserCreationType {
    FULL,
    HARD,
    LEGACY_INIT;

    public String toApiHeaderType() {
        int i = r8lambdaj_gGYyv3uIgip9phQGNOIt4IRtU.IconCompatParcelizer[ordinal()];
        if (i == 1) {
            return "full";
        }
        if (i != 2) {
            return null;
        }
        return "hard";
    }
}
