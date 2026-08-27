package com.roadrunner.notifications;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationChannelNotMatchingException extends Exception {
    public NotificationChannelNotMatchingException(String str, int i) {
        super("Notification channel " + str + " importance has changed to " + i);
    }
}
