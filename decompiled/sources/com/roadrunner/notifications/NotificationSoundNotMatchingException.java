package com.roadrunner.notifications;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationSoundNotMatchingException extends Exception {
    public NotificationSoundNotMatchingException(String str, Boolean bool, boolean z) {
        super("Notification sound for channel " + str + " does not match, the one set by the user " + bool + " and sound uri was default " + z);
    }
}
