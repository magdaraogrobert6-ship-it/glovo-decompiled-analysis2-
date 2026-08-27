package com.incognia;

import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomEvent {
    private final String accountId;
    private final EventAddress address;
    private final String externalId;
    private final EventProperties properties;
    private final String status;
    private final String tag;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private String accountId;
        private EventAddress address;
        private String externalId;
        private EventProperties properties;
        private String status;
        private String tag;

        public final Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public final Builder address(EventAddress eventAddress) {
            this.address = eventAddress;
            return this;
        }

        public final Builder externalId(String str) {
            this.externalId = str;
            return this;
        }

        public final Builder properties(EventProperties eventProperties) {
            this.properties = eventProperties;
            return this;
        }

        public final Builder status(String str) {
            this.status = str;
            return this;
        }

        public final Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public final CustomEvent build() {
            return new CustomEvent(this.accountId, this.externalId, this.address, this.tag, this.properties, this.status);
        }
    }

    public final String component1() {
        return this.accountId;
    }

    public final String component2() {
        return this.externalId;
    }

    public final EventAddress component3() {
        return this.address;
    }

    public final String component4() {
        return this.tag;
    }

    public final EventProperties component5() {
        return this.properties;
    }

    public final String component6() {
        return this.status;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final EventAddress getAddress() {
        return this.address;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final EventProperties getProperties() {
        return this.properties;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTag() {
        return this.tag;
    }

    public final CustomEvent copy(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
        return new CustomEvent(str, str2, eventAddress, str3, eventProperties, str4);
    }

    public static /* synthetic */ CustomEvent copy$default(CustomEvent customEvent, String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customEvent.accountId;
        }
        if ((i & 2) != 0) {
            str2 = customEvent.externalId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            eventAddress = customEvent.address;
        }
        EventAddress eventAddress2 = eventAddress;
        if ((i & 8) != 0) {
            str3 = customEvent.tag;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            eventProperties = customEvent.properties;
        }
        EventProperties eventProperties2 = eventProperties;
        if ((i & 32) != 0) {
            str4 = customEvent.status;
        }
        return customEvent.copy(str, str5, eventAddress2, str6, eventProperties2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomEvent)) {
            return false;
        }
        CustomEvent customEvent = (CustomEvent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accountId, customEvent.accountId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.externalId, customEvent.externalId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, customEvent.address}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tag, customEvent.tag}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.properties, customEvent.properties}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, customEvent.status}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomEvent(accountId=");
        sb.append(this.accountId);
        sb.append(", externalId=");
        sb.append(this.externalId);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", properties=");
        sb.append(this.properties);
        sb.append(", status=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.status, ')');
    }

    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.externalId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        EventAddress eventAddress = this.address;
        int iHashCode3 = eventAddress == null ? 0 : eventAddress.hashCode();
        String str3 = this.tag;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        EventProperties eventProperties = this.properties;
        int iHashCode5 = eventProperties == null ? 0 : eventProperties.hashCode();
        String str4 = this.status;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public /* synthetic */ CustomEvent(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : eventAddress, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : eventProperties, (i & 32) != 0 ? null : str4);
    }

    public CustomEvent(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
        this.accountId = str;
        this.externalId = str2;
        this.address = eventAddress;
        this.tag = str3;
        this.properties = eventProperties;
        this.status = str4;
    }

    public CustomEvent() {
        this(null, null, null, null, null, null, 63, null);
    }
}
