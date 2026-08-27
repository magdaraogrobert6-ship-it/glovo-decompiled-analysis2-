package com.squareup.moshi;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;
import o.DrawableTransformation;
import o.calculateInSampleSizelambda1;
import o.getDestinationHeightAndWidthPixels;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getRemoteBitmap;
import o.getRemoteBitmaplambda4;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes4.dex */
public final class ClassJsonAdapter extends JsonAdapter {
    public static final getRemoteBitmap read = new getRemoteBitmap(2);
    public final getLocalBitmap RemoteActionCompatParcelizer;
    public final getDestinationHeightAndWidthPixels[] serializer;
    public final calculateInSampleSizelambda1 write;

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        try {
            Object objSerializer = this.write.serializer();
            try {
                getdisplayheightandwidthpixels.read();
                while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
                    int iSerializer = getdisplayheightandwidthpixels.serializer(this.RemoteActionCompatParcelizer);
                    if (iSerializer == -1) {
                        getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                        getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    } else {
                        this.serializer[iSerializer].write(getdisplayheightandwidthpixels, objSerializer);
                    }
                }
                getdisplayheightandwidthpixels.IconCompatParcelizer();
                return objSerializer;
            } catch (IllegalAccessException unused) {
                int iSerializer2 = isAppSetIdReadingEnabled.serializer();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer2);
                return null;
            }
        } catch (IllegalAccessException unused2) {
            int iSerializer3 = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer3);
            return null;
        } catch (InstantiationException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        } catch (InvocationTargetException e2) {
            getRemoteBitmaplambda4.serializer(e2);
            throw null;
        }
    }

    public ClassJsonAdapter(calculateInSampleSizelambda1 calculateinsamplesizelambda1, TreeMap treeMap) {
        this.write = calculateinsamplesizelambda1;
        this.serializer = (getDestinationHeightAndWidthPixels[]) treeMap.values().toArray(new getDestinationHeightAndWidthPixels[treeMap.size()]);
        this.RemoteActionCompatParcelizer = getLocalBitmap.RemoteActionCompatParcelizer((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        try {
            jsonWriter.IconCompatParcelizer();
            for (getDestinationHeightAndWidthPixels getdestinationheightandwidthpixels : this.serializer) {
                jsonWriter.IconCompatParcelizer(getdestinationheightandwidthpixels.serializer);
                getdestinationheightandwidthpixels.IconCompatParcelizer(jsonWriter, obj);
            }
            jsonWriter.serializer();
        } catch (IllegalAccessException unused) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.write + ")";
    }
}
