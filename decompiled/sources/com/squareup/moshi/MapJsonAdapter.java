package com.squareup.moshi;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmaplambda7;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getRemoteBitmap;
import o.getRemoteBitmaplambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class MapJsonAdapter extends JsonAdapter {
    public final JsonAdapter IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final Object serializer;
    public static final getRemoteBitmap write = new getRemoteBitmap(1);
    public static final getRemoteBitmap read = new getRemoteBitmap(0);

    public MapJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations, Type type, Type type2) {
        Set set = getRemoteBitmaplambda4.read;
        this.IconCompatParcelizer = getruntime_memory_image_loader_usage_quotientannotations.read(type, set, null);
        this.serializer = getruntime_memory_image_loader_usage_quotientannotations.read(type2, set, null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        JsonAdapter jsonAdapter = this.IconCompatParcelizer;
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            getdisplayheightandwidthpixels.serializer();
            while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
                arrayList.add(jsonAdapter.fromJson(getdisplayheightandwidthpixels));
            }
            getdisplayheightandwidthpixels.write();
            Object objNewInstance = Array.newInstance((Class<?>) obj, arrayList.size());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Array.set(objNewInstance, i2, arrayList.get(i2));
            }
            return objNewInstance;
        }
        getLocalBitmaplambda7 getlocalbitmaplambda7 = new getLocalBitmaplambda7();
        getdisplayheightandwidthpixels.read();
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            getdisplayheightandwidthpixels.ParcelableVolumeInfo();
            Object objFromJson = jsonAdapter.fromJson(getdisplayheightandwidthpixels);
            Object objFromJson2 = ((JsonAdapter) obj).fromJson(getdisplayheightandwidthpixels);
            Object objPut = getlocalbitmaplambda7.put(objFromJson, objFromJson2);
            if (objPut != null) {
                StringBuilder sb = new StringBuilder("Map key '");
                sb.append(objFromJson);
                String strRemoteActionCompatParcelizer = getdisplayheightandwidthpixels.RemoteActionCompatParcelizer();
                sb.append("' has multiple values at path ");
                sb.append(strRemoteActionCompatParcelizer);
                sb.append(": ");
                sb.append(objPut);
                sb.append(" and ");
                sb.append(objFromJson2);
                throw new JsonDataException(sb.toString());
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        return getlocalbitmaplambda7;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        JsonAdapter jsonAdapter = this.IconCompatParcelizer;
        if (i != 0) {
            jsonWriter.RemoteActionCompatParcelizer();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jsonAdapter.toJson(jsonWriter, Array.get(obj, i2));
            }
            jsonWriter.write();
            return;
        }
        jsonWriter.IconCompatParcelizer();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at ".concat(jsonWriter.MediaBrowserCompatMediaItem()));
            }
            jsonWriter.PlaybackStateCompat();
            jsonAdapter.toJson(jsonWriter, entry.getKey());
            ((JsonAdapter) this.serializer).toJson(jsonWriter, entry.getValue());
        }
        jsonWriter.serializer();
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        JsonAdapter jsonAdapter = this.IconCompatParcelizer;
        if (i != 0) {
            return jsonAdapter + ".array()";
        }
        return "JsonAdapter(" + jsonAdapter + ContainerUtils.KEY_VALUE_DELIMITER + ((JsonAdapter) this.serializer) + ")";
    }

    public MapJsonAdapter(Class cls, JsonAdapter jsonAdapter) {
        this.serializer = cls;
        this.IconCompatParcelizer = jsonAdapter;
    }
}
