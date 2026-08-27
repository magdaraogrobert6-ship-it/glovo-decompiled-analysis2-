package com.deliveryhero.customerchat.analytics.model;

import androidx.room.Room;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import o.IconCompatParcelizer;
import o.ItemTouchHelperAdapter;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getRemoteBitmaplambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class UserJsonAdapter extends JsonAdapter {
    private volatile Constructor<User> constructorRef;
    private final JsonAdapter nullableMapOfStringNullableStringAdapter;
    private final getLocalBitmap options;
    private final JsonAdapter stringAdapter;

    public UserJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.options = getLocalBitmap.RemoteActionCompatParcelizer("id", "details");
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.stringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "id");
        this.nullableMapOfStringNullableStringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Room.IconCompatParcelizer(Map.class, String.class, String.class), itemTouchHelperAdapter, "details");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public User fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        String str = null;
        Map map = null;
        int i = -1;
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
                map = (Map) this.nullableMapOfStringNullableStringAdapter.fromJson(getdisplayheightandwidthpixels);
                i = -3;
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (i == -3) {
            if (str != null) {
                return new User(str, map);
            }
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("id", "id", getdisplayheightandwidthpixels);
        }
        Constructor<User> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = User.class.getDeclaredConstructor(String.class, Map.class, Integer.TYPE, getRemoteBitmaplambda4.IconCompatParcelizer);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        if (str == null) {
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("id", "id", getdisplayheightandwidthpixels);
        }
        User userNewInstance = declaredConstructor.newInstance(str, map, Integer.valueOf(i), null);
        userNewInstance.getClass();
        return userNewInstance;
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(26, "GeneratedJsonAdapter(User)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, User user) {
        jsonWriter.getClass();
        if (user == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("id");
        this.stringAdapter.toJson(jsonWriter, user.getId());
        jsonWriter.IconCompatParcelizer("details");
        this.nullableMapOfStringNullableStringAdapter.toJson(jsonWriter, user.getDetails());
        jsonWriter.serializer();
    }
}
