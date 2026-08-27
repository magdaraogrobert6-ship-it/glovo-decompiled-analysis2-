package com.braze.events;

import com.braze.enums.BrazePushEventType;
import com.braze.models.push.BrazeNotificationPayload;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BrazePushEvent {
    private final BrazePushEventType eventType;
    private final BrazeNotificationPayload notificationPayload;

    public final BrazePushEventType component1() {
        return this.eventType;
    }

    public final BrazeNotificationPayload component2() {
        return this.notificationPayload;
    }

    public final BrazePushEventType getEventType() {
        return this.eventType;
    }

    public final BrazeNotificationPayload getNotificationPayload() {
        return this.notificationPayload;
    }

    public int hashCode() {
        return this.notificationPayload.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "BrazePushEvent(eventType=" + this.eventType + ", notificationPayload=" + this.notificationPayload + ")";
    }

    public BrazePushEvent(BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload) {
        brazePushEventType.getClass();
        brazeNotificationPayload.getClass();
        this.eventType = brazePushEventType;
        this.notificationPayload = brazeNotificationPayload;
    }

    public final BrazePushEvent copy(BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload) {
        brazePushEventType.getClass();
        brazeNotificationPayload.getClass();
        return new BrazePushEvent(brazePushEventType, brazeNotificationPayload);
    }

    public static /* synthetic */ BrazePushEvent copy$default(BrazePushEvent brazePushEvent, BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            brazePushEventType = brazePushEvent.eventType;
        }
        if ((i & 2) != 0) {
            brazeNotificationPayload = brazePushEvent.notificationPayload;
        }
        return brazePushEvent.copy(brazePushEventType, brazeNotificationPayload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazePushEvent)) {
            return false;
        }
        BrazePushEvent brazePushEvent = (BrazePushEvent) obj;
        if (this.eventType != brazePushEvent.eventType) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.notificationPayload, brazePushEvent.notificationPayload}, getCieXyz.write())).booleanValue();
    }
}
