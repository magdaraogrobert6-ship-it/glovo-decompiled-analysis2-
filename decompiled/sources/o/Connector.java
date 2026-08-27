package o;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Connector {
    public static final colorResource serializer = colorResource.RemoteActionCompatParcelizer("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final colorResource write = colorResource.RemoteActionCompatParcelizer("id", "layers", "w", "h", com.braze.Constants.BRAZE_PUSH_PRIORITY_KEY, "u");
    public static final colorResource IconCompatParcelizer = colorResource.RemoteActionCompatParcelizer("list");
    public static final colorResource RemoteActionCompatParcelizer = colorResource.RemoteActionCompatParcelizer("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0046. Please report as an issue. */
    public static StrokeJoinCompanion serializer(com.airbnb.lottie.parser.moshi.JsonUtf8Reader jsonUtf8Reader) throws com.airbnb.lottie.parser.moshi.JsonEncodingException, EOFException {
        float fMediaMetadataCompat;
        float f;
        int i;
        float f2;
        StrokeJoinCompanion strokeJoinCompanion;
        float f3;
        float fIconCompatParcelizer = newD50Xyzui_graphics.IconCompatParcelizer();
        ContextMenuSpec contextMenuSpec = new ContextMenuSpec((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        accessprocessDragStart accessprocessdragstart = new accessprocessDragStart(0);
        StrokeJoinCompanion strokeJoinCompanion2 = new StrokeJoinCompanion();
        jsonUtf8Reader.RemoteActionCompatParcelizer();
        int iMediaMetadataCompat = 0;
        int iMediaMetadataCompat2 = 0;
        float f4 = 0.0f;
        float fMediaMetadataCompat2 = 0.0f;
        float fMediaMetadataCompat3 = 0.0f;
        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
            switch (jsonUtf8Reader.read(serializer)) {
                case 0:
                    iMediaMetadataCompat = (int) jsonUtf8Reader.MediaMetadataCompat();
                    f4 = f4;
                    break;
                case 1:
                    iMediaMetadataCompat2 = (int) jsonUtf8Reader.MediaMetadataCompat();
                    f4 = f4;
                    break;
                case 2:
                    fMediaMetadataCompat2 = (float) jsonUtf8Reader.MediaMetadataCompat();
                    f4 = f4;
                    break;
                case 3:
                    fMediaMetadataCompat = ((float) jsonUtf8Reader.MediaMetadataCompat()) - 0.01f;
                    iMediaMetadataCompat2 = iMediaMetadataCompat2;
                    fMediaMetadataCompat2 = fMediaMetadataCompat2;
                    f4 = fMediaMetadataCompat;
                    break;
                case 4:
                    fMediaMetadataCompat3 = (float) jsonUtf8Reader.MediaMetadataCompat();
                    fMediaMetadataCompat = f4;
                    iMediaMetadataCompat2 = iMediaMetadataCompat2;
                    fMediaMetadataCompat2 = fMediaMetadataCompat2;
                    f4 = fMediaMetadataCompat;
                    break;
                case 5:
                    arrayList2 = arrayList2;
                    strokeJoinCompanion2 = strokeJoinCompanion2;
                    f = f4;
                    i = iMediaMetadataCompat2;
                    f2 = fMediaMetadataCompat2;
                    String[] strArrSplit = jsonUtf8Reader.MediaDescriptionCompat().split("\\.");
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    int i3 = Integer.parseInt(strArrSplit[1]);
                    int i4 = Integer.parseInt(strArrSplit[2]);
                    if (i2 < 4 || (i2 <= 4 && (i3 < 4 || (i3 <= 4 && i4 < 0)))) {
                        strokeJoinCompanion2.IconCompatParcelizer("Lottie only supports bodymovin >= 4.4.0");
                    }
                    iMediaMetadataCompat2 = i;
                    f4 = f;
                    fMediaMetadataCompat2 = f2;
                    break;
                case 6:
                    arrayList2 = arrayList2;
                    StrokeJoinCompanion strokeJoinCompanion3 = strokeJoinCompanion2;
                    f = f4;
                    i = iMediaMetadataCompat2;
                    f2 = fMediaMetadataCompat2;
                    jsonUtf8Reader.read();
                    int i5 = 0;
                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                        StrokeJoinCompanion strokeJoinCompanion4 = strokeJoinCompanion3;
                        getAdobeRgb getadobergbSerializer = getDestination.serializer(jsonUtf8Reader, strokeJoinCompanion4);
                        if (getadobergbSerializer.RatingCompat == getBt2020Pq.IMAGE) {
                            i5++;
                        }
                        arrayList.add(getadobergbSerializer);
                        contextMenuSpec.read(getadobergbSerializer.MediaMetadataCompat, getadobergbSerializer);
                        if (i5 > 4) {
                            getD50Xyzui_graphics.IconCompatParcelizer("You have " + i5 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        strokeJoinCompanion3 = strokeJoinCompanion4;
                    }
                    strokeJoinCompanion2 = strokeJoinCompanion3;
                    jsonUtf8Reader.IconCompatParcelizer();
                    iMediaMetadataCompat2 = i;
                    f4 = f;
                    fMediaMetadataCompat2 = f2;
                    break;
                case 7:
                    arrayList2 = arrayList2;
                    f = f4;
                    i = iMediaMetadataCompat2;
                    f2 = fMediaMetadataCompat2;
                    jsonUtf8Reader.read();
                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                        ArrayList arrayList3 = new ArrayList();
                        ContextMenuSpec contextMenuSpec2 = new ContextMenuSpec((Object) null);
                        jsonUtf8Reader.RemoteActionCompatParcelizer();
                        String strMediaDescriptionCompat = null;
                        String strMediaDescriptionCompat2 = null;
                        String strMediaDescriptionCompat3 = null;
                        int iRatingCompat = 0;
                        int iRatingCompat2 = 0;
                        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                            int i6 = jsonUtf8Reader.read(write);
                            if (i6 == 0) {
                                strokeJoinCompanion = strokeJoinCompanion2;
                                strMediaDescriptionCompat = jsonUtf8Reader.MediaDescriptionCompat();
                            } else if (i6 == 1) {
                                jsonUtf8Reader.read();
                                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                    getAdobeRgb getadobergbSerializer2 = getDestination.serializer(jsonUtf8Reader, strokeJoinCompanion2);
                                    contextMenuSpec2.read(getadobergbSerializer2.MediaMetadataCompat, getadobergbSerializer2);
                                    arrayList3.add(getadobergbSerializer2);
                                    strokeJoinCompanion2 = strokeJoinCompanion2;
                                }
                                strokeJoinCompanion = strokeJoinCompanion2;
                                jsonUtf8Reader.IconCompatParcelizer();
                            } else if (i6 == 2) {
                                strokeJoinCompanion = strokeJoinCompanion2;
                                iRatingCompat = jsonUtf8Reader.RatingCompat();
                            } else if (i6 != 3) {
                                if (i6 == 4) {
                                    strMediaDescriptionCompat2 = jsonUtf8Reader.MediaDescriptionCompat();
                                } else if (i6 != 5) {
                                    jsonUtf8Reader.MediaSessionCompatToken();
                                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                } else {
                                    strMediaDescriptionCompat3 = jsonUtf8Reader.MediaDescriptionCompat();
                                }
                                strokeJoinCompanion = strokeJoinCompanion2;
                            } else {
                                strokeJoinCompanion = strokeJoinCompanion2;
                                iRatingCompat2 = jsonUtf8Reader.RatingCompat();
                            }
                            strokeJoinCompanion2 = strokeJoinCompanion;
                        }
                        StrokeJoinCompanion strokeJoinCompanion5 = strokeJoinCompanion2;
                        jsonUtf8Reader.write();
                        if (strMediaDescriptionCompat2 != null) {
                            map2.put(strMediaDescriptionCompat, new getMirror3opZhB0(iRatingCompat, iRatingCompat2, strMediaDescriptionCompat, strMediaDescriptionCompat2, strMediaDescriptionCompat3));
                        } else {
                            map.put(strMediaDescriptionCompat, arrayList3);
                        }
                        strokeJoinCompanion2 = strokeJoinCompanion5;
                    }
                    jsonUtf8Reader.IconCompatParcelizer();
                    strokeJoinCompanion2 = strokeJoinCompanion2;
                    iMediaMetadataCompat2 = i;
                    f4 = f;
                    fMediaMetadataCompat2 = f2;
                    break;
                case 8:
                    f = f4;
                    i = iMediaMetadataCompat2;
                    f2 = fMediaMetadataCompat2;
                    jsonUtf8Reader.RemoteActionCompatParcelizer();
                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                        if (jsonUtf8Reader.read(IconCompatParcelizer) != 0) {
                            jsonUtf8Reader.MediaSessionCompatToken();
                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                        } else {
                            jsonUtf8Reader.read();
                            while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                colorResource colorresource = getNtsc1953Primariesui_graphics.write;
                                jsonUtf8Reader.RemoteActionCompatParcelizer();
                                String strMediaDescriptionCompat4 = null;
                                String strMediaDescriptionCompat5 = null;
                                String strMediaDescriptionCompat6 = null;
                                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                    int i7 = jsonUtf8Reader.read(getNtsc1953Primariesui_graphics.write);
                                    if (i7 != 0) {
                                        ArrayList arrayList4 = arrayList2;
                                        if (i7 == 1) {
                                            strMediaDescriptionCompat5 = jsonUtf8Reader.MediaDescriptionCompat();
                                        } else if (i7 == 2) {
                                            strMediaDescriptionCompat6 = jsonUtf8Reader.MediaDescriptionCompat();
                                        } else if (i7 != 3) {
                                            jsonUtf8Reader.MediaSessionCompatToken();
                                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                        } else {
                                            jsonUtf8Reader.MediaMetadataCompat();
                                        }
                                        arrayList2 = arrayList4;
                                    } else {
                                        strMediaDescriptionCompat4 = jsonUtf8Reader.MediaDescriptionCompat();
                                    }
                                }
                                jsonUtf8Reader.write();
                                map3.put(strMediaDescriptionCompat5, new getName(strMediaDescriptionCompat4, strMediaDescriptionCompat5, strMediaDescriptionCompat6));
                                arrayList2 = arrayList2;
                            }
                            jsonUtf8Reader.IconCompatParcelizer();
                        }
                    }
                    arrayList2 = arrayList2;
                    jsonUtf8Reader.write();
                    strokeJoinCompanion2 = strokeJoinCompanion2;
                    iMediaMetadataCompat2 = i;
                    f4 = f;
                    fMediaMetadataCompat2 = f2;
                    break;
                case 9:
                    f = f4;
                    i = iMediaMetadataCompat2;
                    f2 = fMediaMetadataCompat2;
                    jsonUtf8Reader.read();
                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                        colorResource colorresource2 = getSrgb.IconCompatParcelizer;
                        ArrayList arrayList5 = new ArrayList();
                        jsonUtf8Reader.RemoteActionCompatParcelizer();
                        double dMediaMetadataCompat = 0.0d;
                        char cCharAt = 0;
                        String strMediaDescriptionCompat7 = null;
                        String strMediaDescriptionCompat8 = null;
                        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                            int i8 = jsonUtf8Reader.read(getSrgb.IconCompatParcelizer);
                            if (i8 == 0) {
                                cCharAt = jsonUtf8Reader.MediaDescriptionCompat().charAt(0);
                            } else if (i8 == 1) {
                                jsonUtf8Reader.MediaMetadataCompat();
                            } else if (i8 == 2) {
                                dMediaMetadataCompat = jsonUtf8Reader.MediaMetadataCompat();
                            } else if (i8 == 3) {
                                strMediaDescriptionCompat7 = jsonUtf8Reader.MediaDescriptionCompat();
                            } else if (i8 == 4) {
                                strMediaDescriptionCompat8 = jsonUtf8Reader.MediaDescriptionCompat();
                            } else if (i8 != 5) {
                                jsonUtf8Reader.MediaSessionCompatToken();
                                jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                            } else {
                                jsonUtf8Reader.RemoteActionCompatParcelizer();
                                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                    if (jsonUtf8Reader.read(getSrgb.read) != 0) {
                                        jsonUtf8Reader.MediaSessionCompatToken();
                                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                    } else {
                                        jsonUtf8Reader.read();
                                        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                            arrayList5.add((rcpResponse) getExtendedSrgb.IconCompatParcelizer(jsonUtf8Reader, strokeJoinCompanion2));
                                        }
                                        jsonUtf8Reader.IconCompatParcelizer();
                                    }
                                }
                                jsonUtf8Reader.write();
                            }
                        }
                        jsonUtf8Reader.write();
                        isSrgb issrgb = new isSrgb(arrayList5, cCharAt, dMediaMetadataCompat, strMediaDescriptionCompat7, strMediaDescriptionCompat8);
                        accessprocessdragstart.RemoteActionCompatParcelizer(issrgb.hashCode(), issrgb);
                    }
                    jsonUtf8Reader.IconCompatParcelizer();
                    arrayList2 = arrayList2;
                    strokeJoinCompanion2 = strokeJoinCompanion2;
                    iMediaMetadataCompat2 = i;
                    f4 = f;
                    fMediaMetadataCompat2 = f2;
                    break;
                case 10:
                    jsonUtf8Reader.read();
                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                        jsonUtf8Reader.RemoteActionCompatParcelizer();
                        String strMediaDescriptionCompat9 = null;
                        float fMediaMetadataCompat4 = 0.0f;
                        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                            float f5 = f4;
                            int i9 = jsonUtf8Reader.read(RemoteActionCompatParcelizer);
                            if (i9 != 0) {
                                f3 = fMediaMetadataCompat2;
                                if (i9 == 1) {
                                    fMediaMetadataCompat4 = (float) jsonUtf8Reader.MediaMetadataCompat();
                                } else if (i9 != 2) {
                                    jsonUtf8Reader.MediaSessionCompatToken();
                                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                } else {
                                    jsonUtf8Reader.MediaMetadataCompat();
                                }
                            } else {
                                f3 = fMediaMetadataCompat2;
                                strMediaDescriptionCompat9 = jsonUtf8Reader.MediaDescriptionCompat();
                            }
                            iMediaMetadataCompat2 = iMediaMetadataCompat2;
                            f4 = f5;
                            fMediaMetadataCompat2 = f3;
                        }
                        jsonUtf8Reader.write();
                        arrayList2.add(new isWideGamut(strMediaDescriptionCompat9, fMediaMetadataCompat4));
                        iMediaMetadataCompat2 = iMediaMetadataCompat2;
                        f4 = f4;
                    }
                    f = f4;
                    i = iMediaMetadataCompat2;
                    f2 = fMediaMetadataCompat2;
                    jsonUtf8Reader.IconCompatParcelizer();
                    arrayList2 = arrayList2;
                    strokeJoinCompanion2 = strokeJoinCompanion2;
                    iMediaMetadataCompat2 = i;
                    f4 = f;
                    fMediaMetadataCompat2 = f2;
                    break;
                default:
                    arrayList2 = arrayList2;
                    strokeJoinCompanion2 = strokeJoinCompanion2;
                    f = f4;
                    i = iMediaMetadataCompat2;
                    f2 = fMediaMetadataCompat2;
                    jsonUtf8Reader.MediaSessionCompatToken();
                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    iMediaMetadataCompat2 = i;
                    f4 = f;
                    fMediaMetadataCompat2 = f2;
                    break;
            }
            strokeJoinCompanion2 = strokeJoinCompanion2;
            arrayList2 = arrayList2;
        }
        ArrayList arrayList6 = arrayList2;
        StrokeJoinCompanion strokeJoinCompanion6 = strokeJoinCompanion2;
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, (int) (iMediaMetadataCompat * fIconCompatParcelizer), (int) (iMediaMetadataCompat2 * fIconCompatParcelizer));
        float fIconCompatParcelizer2 = newD50Xyzui_graphics.IconCompatParcelizer();
        strokeJoinCompanion6.write = rect;
        strokeJoinCompanion6.PlaybackStateCompat = fMediaMetadataCompat2;
        strokeJoinCompanion6.read = f4;
        strokeJoinCompanion6.IconCompatParcelizer = fMediaMetadataCompat3;
        strokeJoinCompanion6.MediaBrowserCompatMediaItem = arrayList;
        strokeJoinCompanion6.RatingCompat = contextMenuSpec;
        strokeJoinCompanion6.ParcelableVolumeInfo = map;
        strokeJoinCompanion6.MediaDescriptionCompat = map2;
        strokeJoinCompanion6.MediaSessionCompatQueueItem = fIconCompatParcelizer2;
        strokeJoinCompanion6.RemoteActionCompatParcelizer = accessprocessdragstart;
        strokeJoinCompanion6.serializer = map3;
        strokeJoinCompanion6.PlaybackStateCompatCustomAction = arrayList6;
        return strokeJoinCompanion6;
    }
}
