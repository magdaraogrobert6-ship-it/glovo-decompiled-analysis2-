package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class getProPhotoRgb implements connectorKeyYBCOT_4 {
    public static final getProPhotoRgb serializer = new getProPhotoRgb();
    public static final colorResource RemoteActionCompatParcelizer = colorResource.RemoteActionCompatParcelizer(com.braze.Constants.BRAZE_PUSH_TITLE_KEY, "f", com.braze.Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // o.connectorKeyYBCOT_4
    public final Object serializer(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) {
        toXyui_graphics toxyui_graphics = toXyui_graphics.CENTER;
        jsonReader.RemoteActionCompatParcelizer();
        String strMediaDescriptionCompat = null;
        float fMediaMetadataCompat = 0.0f;
        float fMediaMetadataCompat2 = 0.0f;
        float fMediaMetadataCompat3 = 0.0f;
        float fMediaMetadataCompat4 = 0.0f;
        int iRatingCompat = 0;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        boolean zMediaSessionCompatQueueItem = true;
        String strMediaDescriptionCompat2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (jsonReader.MediaBrowserCompatMediaItem()) {
            switch (jsonReader.read(RemoteActionCompatParcelizer)) {
                case 0:
                    strMediaDescriptionCompat = jsonReader.MediaDescriptionCompat();
                    break;
                case 1:
                    strMediaDescriptionCompat2 = jsonReader.MediaDescriptionCompat();
                    break;
                case 2:
                    fMediaMetadataCompat = (float) jsonReader.MediaMetadataCompat();
                    break;
                case 3:
                    int iRatingCompat2 = jsonReader.RatingCompat();
                    toXyui_graphics toxyui_graphics2 = toXyui_graphics.CENTER;
                    toxyui_graphics = (iRatingCompat2 <= toxyui_graphics2.ordinal() && iRatingCompat2 >= 0) ? toXyui_graphics.values()[iRatingCompat2] : toxyui_graphics2;
                    break;
                case 4:
                    iRatingCompat = jsonReader.RatingCompat();
                    break;
                case 5:
                    fMediaMetadataCompat2 = (float) jsonReader.MediaMetadataCompat();
                    break;
                case 6:
                    fMediaMetadataCompat3 = (float) jsonReader.MediaMetadataCompat();
                    break;
                case 7:
                    iIconCompatParcelizer = transferHlgEotfui_graphics.IconCompatParcelizer(jsonReader);
                    break;
                case 8:
                    iIconCompatParcelizer2 = transferHlgEotfui_graphics.IconCompatParcelizer(jsonReader);
                    break;
                case 9:
                    fMediaMetadataCompat4 = (float) jsonReader.MediaMetadataCompat();
                    break;
                case 10:
                    zMediaSessionCompatQueueItem = jsonReader.MediaSessionCompatQueueItem();
                    break;
                case 11:
                    jsonReader.read();
                    PointF pointF3 = new PointF(((float) jsonReader.MediaMetadataCompat()) * f, ((float) jsonReader.MediaMetadataCompat()) * f);
                    jsonReader.IconCompatParcelizer();
                    pointF = pointF3;
                    break;
                case 12:
                    jsonReader.read();
                    PointF pointF4 = new PointF(((float) jsonReader.MediaMetadataCompat()) * f, ((float) jsonReader.MediaMetadataCompat()) * f);
                    jsonReader.IconCompatParcelizer();
                    pointF2 = pointF4;
                    break;
                default:
                    jsonReader.MediaSessionCompatToken();
                    jsonReader.MediaSessionCompatResultReceiverWrapper();
                    break;
            }
        }
        jsonReader.write();
        getMinValue getminvalue = new getMinValue();
        getminvalue.PlaybackStateCompatCustomAction = strMediaDescriptionCompat;
        getminvalue.write = strMediaDescriptionCompat2;
        getminvalue.MediaSessionCompatQueueItem = fMediaMetadataCompat;
        getminvalue.MediaMetadataCompat = toxyui_graphics;
        getminvalue.MediaSessionCompatResultReceiverWrapper = iRatingCompat;
        getminvalue.MediaBrowserCompatMediaItem = fMediaMetadataCompat2;
        getminvalue.IconCompatParcelizer = fMediaMetadataCompat3;
        getminvalue.RemoteActionCompatParcelizer = iIconCompatParcelizer;
        getminvalue.MediaDescriptionCompat = iIconCompatParcelizer2;
        getminvalue.ParcelableVolumeInfo = fMediaMetadataCompat4;
        getminvalue.RatingCompat = zMediaSessionCompatQueueItem;
        getminvalue.read = pointF;
        getminvalue.serializer = pointF2;
        return getminvalue;
    }
}
