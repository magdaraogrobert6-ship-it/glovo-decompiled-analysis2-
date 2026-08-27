package com.roadrunner.notifications.sounds.domain;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationSoundNotFoundException extends Exception {
    public NotificationSoundNotFoundException(String str) {
        super(ff$$ExternalSyntheticOutline0.m("Sound file ", str, " not found"));
    }
}
