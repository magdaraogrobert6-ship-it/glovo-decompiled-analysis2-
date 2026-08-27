package com.braze.events;

import bo.app.da;
import bo.app.ga;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageEvent {
    private final IInAppMessage inAppMessage;
    private final ga triggerAction;
    private final da triggerEvent;
    private final String userId;

    public final da component1() {
        return this.triggerEvent;
    }

    public final ga component2() {
        return this.triggerAction;
    }

    public final IInAppMessage component3() {
        return this.inAppMessage;
    }

    public final String component4() {
        return this.userId;
    }

    public final IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public final ga getTriggerAction() {
        return this.triggerAction;
    }

    public final da getTriggerEvent() {
        return this.triggerEvent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.triggerEvent.hashCode();
        int iHashCode2 = this.triggerAction.hashCode();
        int iHashCode3 = this.inAppMessage.hashCode();
        String str = this.userId;
        return ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return JsonUtils.getPrettyPrintedString(this.inAppMessage.forJsonPut());
    }

    public InAppMessageEvent(da daVar, ga gaVar, IInAppMessage iInAppMessage, String str) {
        daVar.getClass();
        gaVar.getClass();
        iInAppMessage.getClass();
        this.triggerEvent = daVar;
        this.triggerAction = gaVar;
        this.inAppMessage = iInAppMessage;
        this.userId = str;
    }

    public final InAppMessageEvent copy(da daVar, ga gaVar, IInAppMessage iInAppMessage, String str) {
        daVar.getClass();
        gaVar.getClass();
        iInAppMessage.getClass();
        return new InAppMessageEvent(daVar, gaVar, iInAppMessage, str);
    }

    public static /* synthetic */ InAppMessageEvent copy$default(InAppMessageEvent inAppMessageEvent, da daVar, ga gaVar, IInAppMessage iInAppMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            daVar = inAppMessageEvent.triggerEvent;
        }
        if ((i & 2) != 0) {
            gaVar = inAppMessageEvent.triggerAction;
        }
        if ((i & 4) != 0) {
            iInAppMessage = inAppMessageEvent.inAppMessage;
        }
        if ((i & 8) != 0) {
            str = inAppMessageEvent.userId;
        }
        return inAppMessageEvent.copy(daVar, gaVar, iInAppMessage, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessageEvent)) {
            return false;
        }
        InAppMessageEvent inAppMessageEvent = (InAppMessageEvent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.triggerEvent, inAppMessageEvent.triggerEvent}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.triggerAction, inAppMessageEvent.triggerAction}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.inAppMessage, inAppMessageEvent.inAppMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, inAppMessageEvent.userId}, getCieXyz.write())).booleanValue();
    }
}
