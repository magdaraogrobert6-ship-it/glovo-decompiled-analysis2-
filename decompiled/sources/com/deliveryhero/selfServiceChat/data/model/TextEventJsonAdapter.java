package com.deliveryhero.selfServiceChat.data.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
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
public final class TextEventJsonAdapter extends JsonAdapter {
    public final JsonAdapter RemoteActionCompatParcelizer;
    public volatile Constructor read;
    public final getLocalBitmap write;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        TextEvent textEvent = (TextEvent) obj;
        jsonWriter.getClass();
        if (textEvent == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("text");
        String str = textEvent.serializer;
        JsonAdapter jsonAdapter = this.RemoteActionCompatParcelizer;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.IconCompatParcelizer("type");
        jsonAdapter.toJson(jsonWriter, textEvent.read);
        jsonWriter.serializer();
    }

    public TextEventJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.write = getLocalBitmap.RemoteActionCompatParcelizer("text", "type");
        this.RemoteActionCompatParcelizer = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, ItemTouchHelperAdapter.serializer, "text");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        String str = null;
        String str2 = null;
        int i = -1;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.write);
            if (iSerializer == -1) {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } else if (iSerializer == 0) {
                str = (String) this.RemoteActionCompatParcelizer.fromJson(getdisplayheightandwidthpixels);
                if (str == null) {
                    throw getRemoteBitmaplambda4.IconCompatParcelizer("text", "text", getdisplayheightandwidthpixels);
                }
            } else if (iSerializer == 1) {
                str2 = (String) this.RemoteActionCompatParcelizer.fromJson(getdisplayheightandwidthpixels);
                if (str2 == null) {
                    throw getRemoteBitmaplambda4.IconCompatParcelizer("type", "type", getdisplayheightandwidthpixels);
                }
                i = -3;
            } else {
                continue;
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (i == -3) {
            if (str == null) {
                throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("text", "text", getdisplayheightandwidthpixels);
            }
            str2.getClass();
            return new TextEvent(str, str2);
        }
        Constructor declaredConstructor = this.read;
        if (declaredConstructor == null) {
            declaredConstructor = TextEvent.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, getRemoteBitmaplambda4.IconCompatParcelizer);
            this.read = declaredConstructor;
            declaredConstructor.getClass();
        }
        if (str == null) {
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("text", "text", getdisplayheightandwidthpixels);
        }
        Object objNewInstance = declaredConstructor.newInstance(str, str2, Integer.valueOf(i), null);
        objNewInstance.getClass();
        return (TextEvent) objNewInstance;
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(31, "GeneratedJsonAdapter(TextEvent)");
    }
}
