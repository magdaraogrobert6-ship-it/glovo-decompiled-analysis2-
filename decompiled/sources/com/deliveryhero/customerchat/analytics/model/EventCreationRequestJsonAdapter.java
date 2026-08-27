package com.deliveryhero.customerchat.analytics.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import o.IconCompatParcelizer;
import o.ItemTouchHelperAdapter;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getRemoteBitmaplambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class EventCreationRequestJsonAdapter extends JsonAdapter {
    private volatile Constructor<EventCreationRequest> constructorRef;
    private final JsonAdapter eventAdapter;
    private final JsonAdapter nullableContactAdapter;
    private final JsonAdapter nullableFinancialAdapter;
    private final JsonAdapter nullableOrderAdapter;
    private final JsonAdapter nullableScreenAdapter;
    private final getLocalBitmap options;
    private final JsonAdapter productAdapter;
    private final JsonAdapter stringAdapter;
    private final JsonAdapter userAdapter;

    public EventCreationRequestJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.options = getLocalBitmap.RemoteActionCompatParcelizer("globalEntityId", "timestamp", "event", "product", FeedbackEvent.UI, "order", "contact", "screen", "financial");
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.stringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "globalEntityId");
        this.eventAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Event.class, itemTouchHelperAdapter, "event");
        this.productAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Product.class, itemTouchHelperAdapter, "product");
        this.userAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(User.class, itemTouchHelperAdapter, FeedbackEvent.UI);
        this.nullableOrderAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Order.class, itemTouchHelperAdapter, "order");
        this.nullableContactAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Contact.class, itemTouchHelperAdapter, "contact");
        this.nullableScreenAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Screen.class, itemTouchHelperAdapter, "screen");
        this.nullableFinancialAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Financial.class, itemTouchHelperAdapter, "financial");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public EventCreationRequest fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        int i = -1;
        String str = null;
        String str2 = null;
        Event event = null;
        Product product = null;
        User user = null;
        Order order = null;
        Contact contact = null;
        Screen screen = null;
        Financial financial = null;
        while (true) {
            Financial financial2 = financial;
            Screen screen2 = screen;
            if (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
                switch (getdisplayheightandwidthpixels.serializer(this.options)) {
                    case -1:
                        getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                        getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                        financial = financial2;
                        screen = screen2;
                        break;
                    case 0:
                        str = (String) this.stringAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("globalEntityId", "globalEntityId", getdisplayheightandwidthpixels);
                        }
                        financial = financial2;
                        screen = screen2;
                        break;
                    case 1:
                        String str3 = (String) this.stringAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str3 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("timestamp", "timestamp", getdisplayheightandwidthpixels);
                        }
                        str2 = str3;
                        financial = financial2;
                        screen = screen2;
                        break;
                        break;
                    case 2:
                        event = (Event) this.eventAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (event == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("event", "event", getdisplayheightandwidthpixels);
                        }
                        financial = financial2;
                        screen = screen2;
                        break;
                    case 3:
                        product = (Product) this.productAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (product == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("product", "product", getdisplayheightandwidthpixels);
                        }
                        financial = financial2;
                        screen = screen2;
                        break;
                    case 4:
                        user = (User) this.userAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (user == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer(FeedbackEvent.UI, FeedbackEvent.UI, getdisplayheightandwidthpixels);
                        }
                        financial = financial2;
                        screen = screen2;
                        break;
                    case 5:
                        i &= -33;
                        order = (Order) this.nullableOrderAdapter.fromJson(getdisplayheightandwidthpixels);
                        financial = financial2;
                        screen = screen2;
                        break;
                    case 6:
                        i &= -65;
                        contact = (Contact) this.nullableContactAdapter.fromJson(getdisplayheightandwidthpixels);
                        financial = financial2;
                        screen = screen2;
                        break;
                    case 7:
                        i &= -129;
                        screen = (Screen) this.nullableScreenAdapter.fromJson(getdisplayheightandwidthpixels);
                        financial = financial2;
                        break;
                    case 8:
                        i &= -257;
                        financial = (Financial) this.nullableFinancialAdapter.fromJson(getdisplayheightandwidthpixels);
                        screen = screen2;
                        break;
                    default:
                        financial = financial2;
                        screen = screen2;
                        break;
                }
            } else {
                getdisplayheightandwidthpixels.IconCompatParcelizer();
                if (i == -481) {
                    if (str == null) {
                        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("globalEntityId", "globalEntityId", getdisplayheightandwidthpixels);
                    }
                    if (str2 == null) {
                        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("timestamp", "timestamp", getdisplayheightandwidthpixels);
                    }
                    if (event == null) {
                        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("event", "event", getdisplayheightandwidthpixels);
                    }
                    if (product == null) {
                        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("product", "product", getdisplayheightandwidthpixels);
                    }
                    if (user != null) {
                        return new EventCreationRequest(str, str2, event, product, user, order, contact, screen2, financial2);
                    }
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer(FeedbackEvent.UI, FeedbackEvent.UI, getdisplayheightandwidthpixels);
                }
                Constructor<EventCreationRequest> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    declaredConstructor = EventCreationRequest.class.getDeclaredConstructor(String.class, String.class, Event.class, Product.class, User.class, Order.class, Contact.class, Screen.class, Financial.class, Integer.TYPE, getRemoteBitmaplambda4.IconCompatParcelizer);
                    this.constructorRef = declaredConstructor;
                    declaredConstructor.getClass();
                }
                Constructor<EventCreationRequest> constructor = declaredConstructor;
                if (str == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("globalEntityId", "globalEntityId", getdisplayheightandwidthpixels);
                }
                if (str2 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("timestamp", "timestamp", getdisplayheightandwidthpixels);
                }
                if (event == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("event", "event", getdisplayheightandwidthpixels);
                }
                if (product == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("product", "product", getdisplayheightandwidthpixels);
                }
                if (user != null) {
                    EventCreationRequest eventCreationRequestNewInstance = constructor.newInstance(str, str2, event, product, user, order, contact, screen2, financial2, Integer.valueOf(i), null);
                    eventCreationRequestNewInstance.getClass();
                    return eventCreationRequestNewInstance;
                }
                throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer(FeedbackEvent.UI, FeedbackEvent.UI, getdisplayheightandwidthpixels);
            }
        }
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(42, "GeneratedJsonAdapter(EventCreationRequest)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, EventCreationRequest eventCreationRequest) {
        jsonWriter.getClass();
        if (eventCreationRequest == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("globalEntityId");
        this.stringAdapter.toJson(jsonWriter, eventCreationRequest.getGlobalEntityId());
        jsonWriter.IconCompatParcelizer("timestamp");
        this.stringAdapter.toJson(jsonWriter, eventCreationRequest.getTimestamp());
        jsonWriter.IconCompatParcelizer("event");
        this.eventAdapter.toJson(jsonWriter, eventCreationRequest.getEvent());
        jsonWriter.IconCompatParcelizer("product");
        this.productAdapter.toJson(jsonWriter, eventCreationRequest.getProduct());
        jsonWriter.IconCompatParcelizer(FeedbackEvent.UI);
        this.userAdapter.toJson(jsonWriter, eventCreationRequest.getUser());
        jsonWriter.IconCompatParcelizer("order");
        this.nullableOrderAdapter.toJson(jsonWriter, eventCreationRequest.getOrder());
        jsonWriter.IconCompatParcelizer("contact");
        this.nullableContactAdapter.toJson(jsonWriter, eventCreationRequest.getContact());
        jsonWriter.IconCompatParcelizer("screen");
        this.nullableScreenAdapter.toJson(jsonWriter, eventCreationRequest.getScreen());
        jsonWriter.IconCompatParcelizer("financial");
        this.nullableFinancialAdapter.toJson(jsonWriter, eventCreationRequest.getFinancial());
        jsonWriter.serializer();
    }
}
