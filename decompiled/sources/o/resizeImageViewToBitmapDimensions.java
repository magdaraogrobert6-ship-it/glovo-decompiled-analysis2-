package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.StandardJsonAdapters;

/* JADX INFO: loaded from: classes4.dex */
public final class resizeImageViewToBitmapDimensions extends JsonAdapter {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ resizeImageViewToBitmapDimensions(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        switch (this.IconCompatParcelizer) {
            case 0:
                return Boolean.valueOf(getdisplayheightandwidthpixels.RatingCompat());
            case 1:
                return getdisplayheightandwidthpixels.PlaybackStateCompat();
            case 2:
                return Byte.valueOf((byte) StandardJsonAdapters.read(getdisplayheightandwidthpixels, "a byte", -128, 255));
            case 3:
                String strPlaybackStateCompat = getdisplayheightandwidthpixels.PlaybackStateCompat();
                if (strPlaybackStateCompat.length() <= 1) {
                    return Character.valueOf(strPlaybackStateCompat.charAt(0));
                }
                throw new com.squareup.moshi.JsonDataException(af$$ExternalSyntheticOutline0.m("Expected a char but was ", m1$$ExternalSyntheticOutline0.m('\"', "\"", strPlaybackStateCompat), " at path ", getdisplayheightandwidthpixels.RemoteActionCompatParcelizer()));
            case 4:
                return Double.valueOf(getdisplayheightandwidthpixels.MediaMetadataCompat());
            case 5:
                float fMediaMetadataCompat = (float) getdisplayheightandwidthpixels.MediaMetadataCompat();
                if (getdisplayheightandwidthpixels.write || !Float.isInfinite(fMediaMetadataCompat)) {
                    return Float.valueOf(fMediaMetadataCompat);
                }
                throw new com.squareup.moshi.JsonDataException("JSON forbids NaN and infinities: " + fMediaMetadataCompat + " at path " + getdisplayheightandwidthpixels.RemoteActionCompatParcelizer());
            case 6:
                return Integer.valueOf(getdisplayheightandwidthpixels.MediaSessionCompatQueueItem());
            case 7:
                return Long.valueOf(getdisplayheightandwidthpixels.MediaDescriptionCompat());
            default:
                return Short.valueOf((short) StandardJsonAdapters.read(getdisplayheightandwidthpixels, "a short", -32768, 32767));
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        switch (this.IconCompatParcelizer) {
            case 0:
                jsonWriter.IconCompatParcelizer(((Boolean) obj).booleanValue());
                break;
            case 1:
                jsonWriter.read((String) obj);
                break;
            case 2:
                jsonWriter.serializer(((Byte) obj).intValue() & 255);
                break;
            case 3:
                jsonWriter.read(((Character) obj).toString());
                break;
            case 4:
                jsonWriter.RemoteActionCompatParcelizer(((Double) obj).doubleValue());
                break;
            case 5:
                Float f = (Float) obj;
                f.getClass();
                jsonWriter.RemoteActionCompatParcelizer(f);
                break;
            case 6:
                jsonWriter.serializer(((Integer) obj).intValue());
                break;
            case 7:
                jsonWriter.serializer(((Long) obj).longValue());
                break;
            default:
                jsonWriter.serializer(((Short) obj).intValue());
                break;
        }
    }

    public final String toString() {
        switch (this.IconCompatParcelizer) {
            case 0:
                return "JsonAdapter(Boolean)";
            case 1:
                return "JsonAdapter(String)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
