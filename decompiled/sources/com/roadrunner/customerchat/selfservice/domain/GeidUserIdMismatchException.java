package com.roadrunner.customerchat.selfservice.domain;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class GeidUserIdMismatchException extends IllegalStateException {
    public GeidUserIdMismatchException(String str, String str2) {
        super(af$$ExternalSyntheticOutline0.m("Customer chat request country mismatch: userIdCountry=", str, " does not match geid=", str2));
    }
}
