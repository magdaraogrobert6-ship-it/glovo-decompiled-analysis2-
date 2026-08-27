package com.deliveryhero.customerchat.analytics.model;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class EventCreationRequest {
    private final Contact contact;
    private final Event event;
    private final Financial financial;
    private final String globalEntityId;
    private final Order order;
    private final Product product;
    private final Screen screen;
    private final String timestamp;
    private final User user;

    public final String component1() {
        return this.globalEntityId;
    }

    public final String component2() {
        return this.timestamp;
    }

    public final Event component3() {
        return this.event;
    }

    public final Product component4() {
        return this.product;
    }

    public final User component5() {
        return this.user;
    }

    public final Order component6() {
        return this.order;
    }

    public final Contact component7() {
        return this.contact;
    }

    public final Screen component8() {
        return this.screen;
    }

    public final Financial component9() {
        return this.financial;
    }

    public final Contact getContact() {
        return this.contact;
    }

    public final Event getEvent() {
        return this.event;
    }

    public final Financial getFinancial() {
        return this.financial;
    }

    public final String getGlobalEntityId() {
        return this.globalEntityId;
    }

    public final Order getOrder() {
        return this.order;
    }

    public final Product getProduct() {
        return this.product;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.globalEntityId.hashCode() * 31, 31, this.timestamp);
        int iHashCode = this.event.hashCode();
        int iHashCode2 = this.product.hashCode();
        int iHashCode3 = this.user.hashCode();
        Order order = this.order;
        int iHashCode4 = order == null ? 0 : order.hashCode();
        Contact contact = this.contact;
        int iHashCode5 = contact == null ? 0 : contact.hashCode();
        Screen screen = this.screen;
        int iHashCode6 = screen == null ? 0 : screen.hashCode();
        Financial financial = this.financial;
        return ((((((((iHashCode3 + ((iHashCode2 + ((iHashCode + iM) * 31)) * 31)) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (financial != null ? financial.hashCode() : 0);
    }

    public EventCreationRequest(@getDensityDpi(serializer = "globalEntityId") String str, @getDensityDpi(serializer = "timestamp") String str2, @getDensityDpi(serializer = "event") Event event, @getDensityDpi(serializer = "product") Product product, @getDensityDpi(serializer = FeedbackEvent.UI) User user, @getDensityDpi(serializer = "order") Order order, @getDensityDpi(serializer = "contact") Contact contact, @getDensityDpi(serializer = "screen") Screen screen, @getDensityDpi(serializer = "financial") Financial financial) {
        str.getClass();
        str2.getClass();
        event.getClass();
        product.getClass();
        user.getClass();
        this.globalEntityId = str;
        this.timestamp = str2;
        this.event = event;
        this.product = product;
        this.user = user;
        this.order = order;
        this.contact = contact;
        this.screen = screen;
        this.financial = financial;
    }

    public final EventCreationRequest copy(@getDensityDpi(serializer = "globalEntityId") String str, @getDensityDpi(serializer = "timestamp") String str2, @getDensityDpi(serializer = "event") Event event, @getDensityDpi(serializer = "product") Product product, @getDensityDpi(serializer = FeedbackEvent.UI) User user, @getDensityDpi(serializer = "order") Order order, @getDensityDpi(serializer = "contact") Contact contact, @getDensityDpi(serializer = "screen") Screen screen, @getDensityDpi(serializer = "financial") Financial financial) {
        str.getClass();
        str2.getClass();
        event.getClass();
        product.getClass();
        user.getClass();
        return new EventCreationRequest(str, str2, event, product, user, order, contact, screen, financial);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventCreationRequest)) {
            return false;
        }
        EventCreationRequest eventCreationRequest = (EventCreationRequest) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, eventCreationRequest.globalEntityId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timestamp, eventCreationRequest.timestamp}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.event, eventCreationRequest.event}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.product, eventCreationRequest.product}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.user, eventCreationRequest.user}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.order, eventCreationRequest.order}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.contact, eventCreationRequest.contact}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.screen, eventCreationRequest.screen}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.financial, eventCreationRequest.financial}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "EventCreationRequest(globalEntityId=" + this.globalEntityId + ", timestamp=" + this.timestamp + ", event=" + this.event + ", product=" + this.product + ", user=" + this.user + ", order=" + this.order + ", contact=" + this.contact + ", screen=" + this.screen + ", financial=" + this.financial + ')';
    }

    public /* synthetic */ EventCreationRequest(String str, String str2, Event event, Product product, User user, Order order, Contact contact, Screen screen, Financial financial, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, event, product, user, (i & 32) != 0 ? null : order, (i & 64) != 0 ? null : contact, (i & Fields.SpotShadowColor) != 0 ? null : screen, (i & Fields.RotationX) != 0 ? null : financial);
    }
}
