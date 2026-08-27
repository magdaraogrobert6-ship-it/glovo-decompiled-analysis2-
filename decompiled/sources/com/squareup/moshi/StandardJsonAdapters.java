package com.squareup.moshi;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.getDensityDpi;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getRemoteBitmap;
import o.getRemoteBitmaplambda2;
import o.getRemoteBitmaplambda4;
import o.resizeImageViewToBitmapDimensions;
import o.seekAnimationsanimation_core;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StandardJsonAdapters {
    public static final getRemoteBitmap IconCompatParcelizer = new getRemoteBitmap(5);
    public static final resizeImageViewToBitmapDimensions serializer = new resizeImageViewToBitmapDimensions(0);
    public static final resizeImageViewToBitmapDimensions write = new resizeImageViewToBitmapDimensions(2);
    public static final resizeImageViewToBitmapDimensions RemoteActionCompatParcelizer = new resizeImageViewToBitmapDimensions(3);
    public static final resizeImageViewToBitmapDimensions read = new resizeImageViewToBitmapDimensions(4);
    public static final resizeImageViewToBitmapDimensions MediaMetadataCompat = new resizeImageViewToBitmapDimensions(5);
    public static final resizeImageViewToBitmapDimensions MediaDescriptionCompat = new resizeImageViewToBitmapDimensions(6);
    public static final resizeImageViewToBitmapDimensions MediaSessionCompatQueueItem = new resizeImageViewToBitmapDimensions(7);
    public static final resizeImageViewToBitmapDimensions MediaBrowserCompatMediaItem = new resizeImageViewToBitmapDimensions(8);
    public static final resizeImageViewToBitmapDimensions RatingCompat = new resizeImageViewToBitmapDimensions(1);

    public final class EnumJsonAdapter extends JsonAdapter {
        public final String[] IconCompatParcelizer;
        public final Class RemoteActionCompatParcelizer;
        public final getLocalBitmap read;
        public final Enum[] write;

        @Override // com.squareup.moshi.JsonAdapter
        public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
            int iWrite = getdisplayheightandwidthpixels.write(this.read);
            if (iWrite != -1) {
                return this.write[iWrite];
            }
            String strRemoteActionCompatParcelizer = getdisplayheightandwidthpixels.RemoteActionCompatParcelizer();
            String strPlaybackStateCompat = getdisplayheightandwidthpixels.PlaybackStateCompat();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.IconCompatParcelizer) + " but was " + strPlaybackStateCompat + " at path " + strRemoteActionCompatParcelizer, 0);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(JsonWriter jsonWriter, Object obj) {
            jsonWriter.read(this.IconCompatParcelizer[((Enum) obj).ordinal()]);
        }

        public EnumJsonAdapter(Class cls) {
            this.RemoteActionCompatParcelizer = cls;
            try {
                Enum[] enumArr = (Enum[]) cls.getEnumConstants();
                this.write = enumArr;
                this.IconCompatParcelizer = new String[enumArr.length];
                int i = 0;
                while (true) {
                    Enum[] enumArr2 = this.write;
                    if (i >= enumArr2.length) {
                        this.read = getLocalBitmap.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                        return;
                    }
                    String strName = enumArr2[i].name();
                    String[] strArr = this.IconCompatParcelizer;
                    Field field = cls.getField(strName);
                    Set set = getRemoteBitmaplambda4.read;
                    getDensityDpi getdensitydpi = (getDensityDpi) field.getAnnotation(getDensityDpi.class);
                    if (getdensitydpi != null) {
                        String strSerializer = getdensitydpi.serializer();
                        if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strSerializer)) {
                            strName = strSerializer;
                        }
                    }
                    strArr[i] = strName;
                    i++;
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in ".concat(cls.getName()), e);
            }
        }

        public final String toString() {
            return "JsonAdapter(" + this.RemoteActionCompatParcelizer.getName() + ")";
        }
    }

    public final class ObjectJsonAdapter extends JsonAdapter {
        public final getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations IconCompatParcelizer;
        public final JsonAdapter MediaDescriptionCompat;
        public final JsonAdapter RemoteActionCompatParcelizer;
        public final JsonAdapter read;
        public final JsonAdapter serializer;
        public final JsonAdapter write;

        @Override // com.squareup.moshi.JsonAdapter
        public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
            switch (getRemoteBitmaplambda2.write[getdisplayheightandwidthpixels.MediaSessionCompatToken().ordinal()]) {
                case 1:
                    return this.RemoteActionCompatParcelizer.fromJson(getdisplayheightandwidthpixels);
                case 2:
                    return this.read.fromJson(getdisplayheightandwidthpixels);
                case 3:
                    return this.MediaDescriptionCompat.fromJson(getdisplayheightandwidthpixels);
                case 4:
                    return this.write.fromJson(getdisplayheightandwidthpixels);
                case 5:
                    return this.serializer.fromJson(getdisplayheightandwidthpixels);
                case 6:
                    getdisplayheightandwidthpixels.MediaSessionCompatResultReceiverWrapper();
                    return null;
                default:
                    StringBuilder sb = new StringBuilder("Expected a value but was ");
                    sb.append(getdisplayheightandwidthpixels.MediaSessionCompatToken());
                    seekAnimationsanimation_core.IconCompatParcelizer(sb, " at path ", getdisplayheightandwidthpixels.RemoteActionCompatParcelizer());
                    return null;
            }
        }

        public final String toString() {
            return "JsonAdapter(Object)";
        }

        public ObjectJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
            this.IconCompatParcelizer = getruntime_memory_image_loader_usage_quotientannotations;
            Set set = getRemoteBitmaplambda4.read;
            this.RemoteActionCompatParcelizer = getruntime_memory_image_loader_usage_quotientannotations.read(List.class, set, null);
            this.read = getruntime_memory_image_loader_usage_quotientannotations.read(Map.class, set, null);
            this.MediaDescriptionCompat = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, set, null);
            this.write = getruntime_memory_image_loader_usage_quotientannotations.read(Double.class, set, null);
            this.serializer = getruntime_memory_image_loader_usage_quotientannotations.read(Boolean.class, set, null);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0019 A[PHI: r1
  0x0019: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x0017, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(JsonWriter jsonWriter, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                jsonWriter.IconCompatParcelizer();
                jsonWriter.serializer();
                return;
            }
            Class<?> cls2 = Map.class;
            if (Map.class.isAssignableFrom(cls)) {
                cls = cls2;
            } else {
                cls2 = Collection.class;
                if (Collection.class.isAssignableFrom(cls)) {
                    cls = cls2;
                }
            }
            this.IconCompatParcelizer.read(cls, getRemoteBitmaplambda4.read, null).toJson(jsonWriter, obj);
        }
    }

    public static int read(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels, String str, int i, int i2) {
        int iMediaSessionCompatQueueItem = getdisplayheightandwidthpixels.MediaSessionCompatQueueItem();
        if (iMediaSessionCompatQueueItem >= i && iMediaSessionCompatQueueItem <= i2) {
            return iMediaSessionCompatQueueItem;
        }
        String strRemoteActionCompatParcelizer = getdisplayheightandwidthpixels.RemoteActionCompatParcelizer();
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("Expected ", iMediaSessionCompatQueueItem, str, " but was ", " at path ");
        sbM.append(strRemoteActionCompatParcelizer);
        throw new JsonDataException(sbM.toString());
    }
}
