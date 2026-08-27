package com.deliveryhero.customerchat.analytics.model;

import androidx.room.Room;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import java.util.Map;
import o.IconCompatParcelizer;
import o.ItemTouchHelperAdapter;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getRemoteBitmaplambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class EventJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableMapOfStringNullableStringAdapter;
    private final getLocalBitmap options;
    private final JsonAdapter stringAdapter;

    public EventJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.options = getLocalBitmap.RemoteActionCompatParcelizer("id", "name", "details");
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.stringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "id");
        this.nullableMapOfStringNullableStringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Room.IconCompatParcelizer(Map.class, String.class, String.class), itemTouchHelperAdapter, "details");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Event fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        String str = null;
        String str2 = null;
        Map map = null;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.options);
            if (iSerializer == -1) {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } else if (iSerializer == 0) {
                str = (String) this.stringAdapter.fromJson(getdisplayheightandwidthpixels);
                if (str == null) {
                    throw getRemoteBitmaplambda4.IconCompatParcelizer("id", "id", getdisplayheightandwidthpixels);
                }
            } else if (iSerializer == 1) {
                str2 = (String) this.stringAdapter.fromJson(getdisplayheightandwidthpixels);
                if (str2 == null) {
                    throw getRemoteBitmaplambda4.IconCompatParcelizer("name", "name", getdisplayheightandwidthpixels);
                }
            } else if (iSerializer == 2) {
                map = (Map) this.nullableMapOfStringNullableStringAdapter.fromJson(getdisplayheightandwidthpixels);
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (str == null) {
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("id", "id", getdisplayheightandwidthpixels);
        }
        if (str2 != null) {
            return new Event(str, str2, map);
        }
        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("name", "name", getdisplayheightandwidthpixels);
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(27, "GeneratedJsonAdapter(Event)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, Event event) {
        jsonWriter.getClass();
        if (event == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("id");
        this.stringAdapter.toJson(jsonWriter, event.getId());
        jsonWriter.IconCompatParcelizer("name");
        this.stringAdapter.toJson(jsonWriter, event.getName());
        jsonWriter.IconCompatParcelizer("details");
        this.nullableMapOfStringNullableStringAdapter.toJson(jsonWriter, event.getDetails());
        jsonWriter.serializer();
    }
}
