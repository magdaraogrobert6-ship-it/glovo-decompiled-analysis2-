package com.roadrunner.customerchat.selfservice.domain;

/* JADX INFO: loaded from: classes3.dex */
public final class UserNotRegisteredException extends IllegalStateException {
    public UserNotRegisteredException() {
        super("Call setConfiguration before accessing user information.");
    }
}
