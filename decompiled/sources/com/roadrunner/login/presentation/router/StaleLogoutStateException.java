package com.roadrunner.login.presentation.router;

/* JADX INFO: loaded from: classes3.dex */
public final class StaleLogoutStateException extends RuntimeException {
    public StaleLogoutStateException() {
        super("startAuthentication called with stale logout state in progress", null);
    }
}
