package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class getDestination {
    public static final colorResource read = colorResource.RemoteActionCompatParcelizer("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", com.braze.Constants.BRAZE_PUSH_TITLE_KEY, "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final colorResource RemoteActionCompatParcelizer = colorResource.RemoteActionCompatParcelizer(com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY);
    public static final colorResource write = colorResource.RemoteActionCompatParcelizer("ty", "nm");

    /* JADX WARN: Code duplicated, block: B:204:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:262:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:295:0x050e  */
    public static getAdobeRgb serializer(com.airbnb.lottie.parser.moshi.JsonUtf8Reader jsonUtf8Reader, StrokeJoinCompanion strokeJoinCompanion) {
        ColorSpaceKt colorSpaceKt;
        boolean z;
        boolean z2;
        String str;
        byte b;
        byte b2;
        boolean z3;
        String str2;
        String str3;
        String str4;
        Bt2020Pqlambda1 bt2020Pqlambda1;
        boolean z4;
        toXyz toxyz;
        toXyz toxyz2;
        toXyz toxyz3;
        byte b3;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        getBt2020PqTransferParametersui_graphics getbt2020pqtransferparametersui_graphics = getBt2020PqTransferParametersui_graphics.NONE;
        createConnectorYBCOT_4 createconnectorybcot_4 = createConnectorYBCOT_4.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonUtf8Reader.RemoteActionCompatParcelizer();
        boolean z5 = false;
        float fMediaMetadataCompat = 1.0f;
        getBt2020PqTransferParametersui_graphics getbt2020pqtransferparametersui_graphics2 = getbt2020pqtransferparametersui_graphics;
        createConnectorYBCOT_4 createconnectorybcot_5 = createconnectorybcot_4;
        boolean z6 = false;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        int color = 0;
        boolean zMediaSessionCompatQueueItem = false;
        float fMediaMetadataCompat2 = 0.0f;
        float fMediaMetadataCompat3 = 0.0f;
        float fMediaMetadataCompat4 = 0.0f;
        float fMediaMetadataCompat5 = 0.0f;
        long jRatingCompat = -1;
        getBt2020Pq getbt2020pq = null;
        String strMediaDescriptionCompat = null;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics = null;
        accessgetGreencp accessgetgreencp = null;
        toXyz toxyzIconCompatParcelizer = null;
        getExponentimpl getexponentimpl = null;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = null;
        ColorSpaceKt colorSpaceKt2 = null;
        float fMediaMetadataCompat6 = 0.0f;
        long jRatingCompat2 = 0;
        String strMediaDescriptionCompat2 = "UNSET";
        String strMediaDescriptionCompat3 = null;
        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
            boolean z7 = true;
            switch (jsonUtf8Reader.read(read)) {
                case 0:
                    strMediaDescriptionCompat2 = jsonUtf8Reader.MediaDescriptionCompat();
                    break;
                case 1:
                    z = z6;
                    z2 = z5;
                    str = strMediaDescriptionCompat3;
                    jRatingCompat2 = jsonUtf8Reader.RatingCompat();
                    z5 = z2;
                    strMediaDescriptionCompat3 = str;
                    z6 = z;
                    break;
                case 2:
                    strMediaDescriptionCompat = jsonUtf8Reader.MediaDescriptionCompat();
                    break;
                case 3:
                    z = z6;
                    z2 = z5;
                    str = strMediaDescriptionCompat3;
                    int iRatingCompat = jsonUtf8Reader.RatingCompat();
                    getbt2020pq = getBt2020Pq.UNKNOWN;
                    if (iRatingCompat < getbt2020pq.ordinal()) {
                        getbt2020pq = getBt2020Pq.values()[iRatingCompat];
                    }
                    z5 = z2;
                    strMediaDescriptionCompat3 = str;
                    z6 = z;
                    break;
                case 4:
                    z = z6;
                    z2 = z5;
                    str = strMediaDescriptionCompat3;
                    jRatingCompat = jsonUtf8Reader.RatingCompat();
                    z5 = z2;
                    strMediaDescriptionCompat3 = str;
                    z6 = z;
                    break;
                case 5:
                    z = z6;
                    z2 = z5;
                    str = strMediaDescriptionCompat3;
                    iIconCompatParcelizer = (int) (newD50Xyzui_graphics.IconCompatParcelizer() * jsonUtf8Reader.RatingCompat());
                    z5 = z2;
                    strMediaDescriptionCompat3 = str;
                    z6 = z;
                    break;
                case 6:
                    z = z6;
                    z2 = z5;
                    str = strMediaDescriptionCompat3;
                    iIconCompatParcelizer2 = (int) (newD50Xyzui_graphics.IconCompatParcelizer() * jsonUtf8Reader.RatingCompat());
                    z5 = z2;
                    strMediaDescriptionCompat3 = str;
                    z6 = z;
                    break;
                case 7:
                    z = z6;
                    z2 = z5;
                    str = strMediaDescriptionCompat3;
                    color = android.graphics.Color.parseColor(jsonUtf8Reader.MediaDescriptionCompat());
                    z5 = z2;
                    strMediaDescriptionCompat3 = str;
                    z6 = z;
                    break;
                case 8:
                    colorSpaceKt2 = getNtsc1953.read(jsonUtf8Reader, strokeJoinCompanion);
                    break;
                case 9:
                    z = z6;
                    z2 = z5;
                    str = strMediaDescriptionCompat3;
                    int iRatingCompat2 = jsonUtf8Reader.RatingCompat();
                    if (iRatingCompat2 >= getBt2020PqTransferParametersui_graphics.values().length) {
                        strokeJoinCompanion.IconCompatParcelizer("Unsupported matte type: " + iRatingCompat2);
                    } else {
                        getBt2020PqTransferParametersui_graphics getbt2020pqtransferparametersui_graphics3 = getBt2020PqTransferParametersui_graphics.values()[iRatingCompat2];
                        int i = transferSt2048Eotfui_graphics.serializer[getbt2020pqtransferparametersui_graphics3.ordinal()];
                        if (i == 1) {
                            strokeJoinCompanion.IconCompatParcelizer("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            strokeJoinCompanion.IconCompatParcelizer("Unsupported matte type: Luma Inverted");
                        }
                        strokeJoinCompanion.MediaSessionCompatResultReceiverWrapper++;
                        getbt2020pqtransferparametersui_graphics2 = getbt2020pqtransferparametersui_graphics3;
                    }
                    z5 = z2;
                    strMediaDescriptionCompat3 = str;
                    z6 = z;
                    break;
                case 10:
                    z = z6;
                    str = strMediaDescriptionCompat3;
                    jsonUtf8Reader.read();
                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                        jsonUtf8Reader.RemoteActionCompatParcelizer();
                        mul3x3Float3_2 mul3x3float3_2 = null;
                        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics2 = null;
                        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer = null;
                        boolean zMediaSessionCompatQueueItem2 = false;
                        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                            String strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = jsonUtf8Reader.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                            strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getClass();
                            int iHashCode = strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.hashCode();
                            if (iHashCode != 111) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 104433) {
                                        if (iHashCode == 3357091 && strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.equals("mode")) {
                                            b = 3;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.equals("inv")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.equals("pt")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                            } else if (strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.equals("o")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                xyzatocolorjlnilsgui_graphicsSerializer = getDisplayP3.serializer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion);
                            } else if (b == 1) {
                                xyzatocolorjlnilsgui_graphics2 = new xyzaToColorJlNiLsgui_graphics(match.serializer(jsonUtf8Reader, strokeJoinCompanion, newD50Xyzui_graphics.IconCompatParcelizer(), ConnectorCompanion.IconCompatParcelizer, false), 6);
                            } else if (b == 2) {
                                zMediaSessionCompatQueueItem2 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                            } else if (b != 3) {
                                jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                            } else {
                                String strMediaDescriptionCompat4 = jsonUtf8Reader.MediaDescriptionCompat();
                                strMediaDescriptionCompat4.getClass();
                                int iHashCode2 = strMediaDescriptionCompat4.hashCode();
                                if (iHashCode2 != 97) {
                                    if (iHashCode2 != 105) {
                                        if (iHashCode2 != 110) {
                                            if (iHashCode2 == 115 && strMediaDescriptionCompat4.equals(com.braze.Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY)) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (strMediaDescriptionCompat4.equals(com.braze.Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID)) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (strMediaDescriptionCompat4.equals("i")) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strMediaDescriptionCompat4.equals(com.braze.Constants.BRAZE_PUSH_CONTENT_KEY)) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                if (b2 == 0) {
                                    mul3x3float3_2 = mul3x3Float3_2.MASK_MODE_ADD;
                                } else if (b2 == 1) {
                                    strokeJoinCompanion.IconCompatParcelizer("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    mul3x3float3_2 = mul3x3Float3_2.MASK_MODE_INTERSECT;
                                } else if (b2 == 2) {
                                    mul3x3float3_2 = mul3x3Float3_2.MASK_MODE_NONE;
                                } else if (b2 != 3) {
                                    getD50Xyzui_graphics.IconCompatParcelizer("Unknown mask mode " + strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + ". Defaulting to Add.");
                                    mul3x3float3_2 = mul3x3Float3_2.MASK_MODE_ADD;
                                } else {
                                    mul3x3float3_2 = mul3x3Float3_2.MASK_MODE_SUBTRACT;
                                }
                            }
                        }
                        jsonUtf8Reader.write();
                        arrayList.add(new connectYBCOT_4default(mul3x3float3_2, xyzatocolorjlnilsgui_graphics2, xyzatocolorjlnilsgui_graphicsSerializer, zMediaSessionCompatQueueItem2));
                    }
                    z2 = false;
                    strokeJoinCompanion.MediaSessionCompatResultReceiverWrapper += arrayList.size();
                    jsonUtf8Reader.IconCompatParcelizer();
                    z5 = z2;
                    strMediaDescriptionCompat3 = str;
                    z6 = z;
                    break;
                case 11:
                    z = z6;
                    str = strMediaDescriptionCompat3;
                    jsonUtf8Reader.read();
                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                        adaptdefault adaptdefaultVarIconCompatParcelizer = getExtendedSrgb.IconCompatParcelizer(jsonUtf8Reader, strokeJoinCompanion);
                        if (adaptdefaultVarIconCompatParcelizer != null) {
                            arrayList2.add(adaptdefaultVarIconCompatParcelizer);
                        }
                    }
                    jsonUtf8Reader.IconCompatParcelizer();
                    z2 = false;
                    z5 = z2;
                    strMediaDescriptionCompat3 = str;
                    z6 = z;
                    break;
                case 12:
                    z3 = z6;
                    jsonUtf8Reader.RemoteActionCompatParcelizer();
                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                        int i2 = jsonUtf8Reader.read(RemoteActionCompatParcelizer);
                        if (i2 == 0) {
                            str3 = strMediaDescriptionCompat3;
                            xyzatocolorjlnilsgui_graphics = new xyzaToColorJlNiLsgui_graphics(match.serializer(jsonUtf8Reader, strokeJoinCompanion, newD50Xyzui_graphics.IconCompatParcelizer(), getProPhotoRgb.serializer, false), 0);
                        } else if (i2 != 1) {
                            jsonUtf8Reader.MediaSessionCompatToken();
                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                        } else {
                            jsonUtf8Reader.read();
                            if (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                colorResource colorresource = getColorSpacesArrayui_graphics.RemoteActionCompatParcelizer;
                                jsonUtf8Reader.RemoteActionCompatParcelizer();
                                com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect2 = null;
                                androidx.transition.TransitionValuesMaps transitionValuesMaps = null;
                                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                    int i3 = jsonUtf8Reader.read(getColorSpacesArrayui_graphics.RemoteActionCompatParcelizer);
                                    if (i3 != 0) {
                                        boolean z8 = true;
                                        if (i3 != 1) {
                                            jsonUtf8Reader.MediaSessionCompatToken();
                                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                        } else {
                                            jsonUtf8Reader.RemoteActionCompatParcelizer();
                                            xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsWrite = null;
                                            xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsWrite2 = null;
                                            toXyz toxyzIconCompatParcelizer2 = null;
                                            toXyz toxyzIconCompatParcelizer3 = null;
                                            xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer2 = null;
                                            while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                                int i4 = jsonUtf8Reader.read(getColorSpacesArrayui_graphics.read);
                                                if (i4 == 0) {
                                                    xyzatocolorjlnilsgui_graphicsWrite = getDisplayP3.write(jsonUtf8Reader, strokeJoinCompanion);
                                                } else if (i4 == z8) {
                                                    xyzatocolorjlnilsgui_graphicsWrite2 = getDisplayP3.write(jsonUtf8Reader, strokeJoinCompanion);
                                                } else if (i4 == 2) {
                                                    toxyzIconCompatParcelizer2 = getDisplayP3.IconCompatParcelizer(jsonUtf8Reader, strokeJoinCompanion, z8);
                                                } else if (i4 == 3) {
                                                    toxyzIconCompatParcelizer3 = getDisplayP3.IconCompatParcelizer(jsonUtf8Reader, strokeJoinCompanion, z8);
                                                } else if (i4 != 4) {
                                                    jsonUtf8Reader.MediaSessionCompatToken();
                                                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                                } else {
                                                    xyzatocolorjlnilsgui_graphicsSerializer2 = getDisplayP3.serializer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion);
                                                }
                                                z8 = true;
                                            }
                                            jsonUtf8Reader.write();
                                            dropShadowEffect2 = new com.airbnb.lottie.parser.DropShadowEffect(xyzatocolorjlnilsgui_graphicsWrite, xyzatocolorjlnilsgui_graphicsWrite2, toxyzIconCompatParcelizer2, toxyzIconCompatParcelizer3, xyzatocolorjlnilsgui_graphicsSerializer2);
                                        }
                                    } else {
                                        jsonUtf8Reader.RemoteActionCompatParcelizer();
                                        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics3 = null;
                                        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer3 = null;
                                        Bt2020Pqlambda1 bt2020Pqlambda2 = null;
                                        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer4 = null;
                                        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                            int i5 = jsonUtf8Reader.read(getColorSpacesArrayui_graphics.IconCompatParcelizer);
                                            if (i5 != 0) {
                                                str4 = strMediaDescriptionCompat3;
                                                if (i5 == 1) {
                                                    xyzatocolorjlnilsgui_graphicsSerializer3 = getDisplayP3.serializer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion);
                                                } else if (i5 == 2) {
                                                    xyzatocolorjlnilsgui_graphicsSerializer4 = getDisplayP3.serializer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion);
                                                } else if (i5 != 3) {
                                                    jsonUtf8Reader.MediaSessionCompatToken();
                                                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                                } else {
                                                    int iRatingCompat3 = jsonUtf8Reader.RatingCompat();
                                                    int i6 = 1;
                                                    if (iRatingCompat3 == 1) {
                                                        if (iRatingCompat3 == i6) {
                                                            bt2020Pqlambda1 = Bt2020Pqlambda1.PERCENT;
                                                        } else {
                                                            bt2020Pqlambda1 = Bt2020Pqlambda1.INDEX;
                                                        }
                                                        bt2020Pqlambda2 = bt2020Pqlambda1;
                                                    } else if (iRatingCompat3 != 2) {
                                                        strokeJoinCompanion.IconCompatParcelizer("Unsupported text range units: " + iRatingCompat3);
                                                        bt2020Pqlambda2 = Bt2020Pqlambda1.INDEX;
                                                    } else {
                                                        i6 = 1;
                                                        if (iRatingCompat3 == i6) {
                                                            bt2020Pqlambda1 = Bt2020Pqlambda1.PERCENT;
                                                        } else {
                                                            bt2020Pqlambda1 = Bt2020Pqlambda1.INDEX;
                                                        }
                                                        bt2020Pqlambda2 = bt2020Pqlambda1;
                                                    }
                                                }
                                            } else {
                                                str4 = strMediaDescriptionCompat3;
                                                xyzatocolorjlnilsgui_graphics3 = getDisplayP3.serializer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion);
                                            }
                                            strMediaDescriptionCompat3 = str4;
                                        }
                                        String str5 = strMediaDescriptionCompat3;
                                        jsonUtf8Reader.write();
                                        if (xyzatocolorjlnilsgui_graphics3 == null && xyzatocolorjlnilsgui_graphicsSerializer3 != null) {
                                            xyzatocolorjlnilsgui_graphics3 = new xyzaToColorJlNiLsgui_graphics(Collections.singletonList(new Lab(0)), 3);
                                        }
                                        transitionValuesMaps = new androidx.transition.TransitionValuesMaps(xyzatocolorjlnilsgui_graphics3, xyzatocolorjlnilsgui_graphicsSerializer3, xyzatocolorjlnilsgui_graphicsSerializer4, bt2020Pqlambda2);
                                        strMediaDescriptionCompat3 = str5;
                                    }
                                }
                                str3 = strMediaDescriptionCompat3;
                                jsonUtf8Reader.write();
                                accessgetgreencp = new accessgetGreencp(dropShadowEffect2, 13, transitionValuesMaps);
                            } else {
                                str3 = strMediaDescriptionCompat3;
                            }
                            while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                            }
                            jsonUtf8Reader.IconCompatParcelizer();
                        }
                        strMediaDescriptionCompat3 = str3;
                    }
                    str2 = strMediaDescriptionCompat3;
                    jsonUtf8Reader.write();
                    strMediaDescriptionCompat3 = str2;
                    z6 = z3;
                    z5 = false;
                    break;
                case 13:
                    jsonUtf8Reader.read();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                        jsonUtf8Reader.RemoteActionCompatParcelizer();
                        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                            int i7 = jsonUtf8Reader.read(write);
                            if (i7 == 0) {
                                int iRatingCompat4 = jsonUtf8Reader.RatingCompat();
                                if (iRatingCompat4 == 29) {
                                    colorResource colorresource2 = getLinearExtendedSrgb.write;
                                    getexponentimpl = null;
                                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                        if (jsonUtf8Reader.read(getLinearExtendedSrgb.write) != 0) {
                                            jsonUtf8Reader.MediaSessionCompatToken();
                                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                        } else {
                                            jsonUtf8Reader.read();
                                            while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                                jsonUtf8Reader.RemoteActionCompatParcelizer();
                                                boolean z9 = false;
                                                getExponentimpl getexponentimpl2 = null;
                                                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                                    int i8 = jsonUtf8Reader.read(getLinearExtendedSrgb.serializer);
                                                    if (i8 == 0) {
                                                        z9 = jsonUtf8Reader.RatingCompat() == 0;
                                                    } else if (i8 != z7) {
                                                        jsonUtf8Reader.MediaSessionCompatToken();
                                                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                                    } else if (z9) {
                                                        getexponentimpl2 = new getExponentimpl(10, getDisplayP3.IconCompatParcelizer(jsonUtf8Reader, strokeJoinCompanion, z7));
                                                    } else {
                                                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                                    }
                                                    z7 = true;
                                                }
                                                jsonUtf8Reader.write();
                                                if (getexponentimpl2 != null) {
                                                    getexponentimpl = getexponentimpl2;
                                                }
                                                z7 = true;
                                            }
                                            jsonUtf8Reader.IconCompatParcelizer();
                                            z7 = true;
                                        }
                                    }
                                } else {
                                    if (iRatingCompat4 == 25) {
                                        getSmpteC getsmptec = new getSmpteC();
                                        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                            if (jsonUtf8Reader.read(getSmpteC.write) != 0) {
                                                jsonUtf8Reader.MediaSessionCompatToken();
                                                jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                            } else {
                                                jsonUtf8Reader.read();
                                                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                                    jsonUtf8Reader.RemoteActionCompatParcelizer();
                                                    String strMediaDescriptionCompat5 = "";
                                                    while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                                        int i9 = jsonUtf8Reader.read(getSmpteC.read);
                                                        if (i9 == 0) {
                                                            strMediaDescriptionCompat5 = jsonUtf8Reader.MediaDescriptionCompat();
                                                        } else if (i9 != 1) {
                                                            jsonUtf8Reader.MediaSessionCompatToken();
                                                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                                        } else {
                                                            strMediaDescriptionCompat5.getClass();
                                                            switch (strMediaDescriptionCompat5) {
                                                                case "Distance":
                                                                    b3 = 0;
                                                                    break;
                                                                case "Opacity":
                                                                    b3 = 1;
                                                                    break;
                                                                case "Direction":
                                                                    b3 = 2;
                                                                    break;
                                                                case "Shadow Color":
                                                                    b3 = 3;
                                                                    break;
                                                                case "Softness":
                                                                    b3 = 4;
                                                                    break;
                                                                default:
                                                                    b3 = -1;
                                                                    break;
                                                            }
                                                            if (b3 == 0) {
                                                                getsmptec.RemoteActionCompatParcelizer = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                                                            } else if (b3 == 1) {
                                                                getsmptec.MediaSessionCompatQueueItem = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                                                            } else if (b3 == 2) {
                                                                getsmptec.IconCompatParcelizer = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                                                            } else if (b3 == 3) {
                                                                getsmptec.serializer = getDisplayP3.write(jsonUtf8Reader, strokeJoinCompanion);
                                                            } else if (b3 != 4) {
                                                                jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                                            } else {
                                                                getsmptec.MediaDescriptionCompat = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                                                            }
                                                        }
                                                    }
                                                    jsonUtf8Reader.write();
                                                }
                                                jsonUtf8Reader.IconCompatParcelizer();
                                            }
                                        }
                                        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics4 = getsmptec.serializer;
                                        if (xyzatocolorjlnilsgui_graphics4 == null || (toxyz = getsmptec.MediaSessionCompatQueueItem) == null || (toxyz2 = getsmptec.IconCompatParcelizer) == null) {
                                            z4 = z6;
                                        } else {
                                            z4 = z6;
                                            toXyz toxyz4 = getsmptec.RemoteActionCompatParcelizer;
                                            if (toxyz4 != null && (toxyz3 = getsmptec.MediaDescriptionCompat) != null) {
                                                dropShadowEffect = new com.airbnb.lottie.parser.DropShadowEffect(xyzatocolorjlnilsgui_graphics4, toxyz, toxyz2, toxyz4, toxyz3, 0);
                                            }
                                        }
                                        dropShadowEffect = null;
                                    }
                                    z6 = z4;
                                    z7 = true;
                                }
                            } else if (i7 != z7) {
                                jsonUtf8Reader.MediaSessionCompatToken();
                                jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                            } else {
                                arrayList3.add(jsonUtf8Reader.MediaDescriptionCompat());
                            }
                            z4 = z6;
                            z6 = z4;
                            z7 = true;
                        }
                        jsonUtf8Reader.write();
                        z7 = true;
                    }
                    z3 = z6;
                    jsonUtf8Reader.IconCompatParcelizer();
                    strokeJoinCompanion.IconCompatParcelizer("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    str2 = strMediaDescriptionCompat3;
                    strMediaDescriptionCompat3 = str2;
                    z6 = z3;
                    z5 = false;
                    break;
                case 14:
                    fMediaMetadataCompat = (float) jsonUtf8Reader.MediaMetadataCompat();
                    z3 = z6;
                    str2 = strMediaDescriptionCompat3;
                    strMediaDescriptionCompat3 = str2;
                    z6 = z3;
                    z5 = false;
                    break;
                case 15:
                    fMediaMetadataCompat2 = (float) jsonUtf8Reader.MediaMetadataCompat();
                    z3 = z6;
                    str2 = strMediaDescriptionCompat3;
                    strMediaDescriptionCompat3 = str2;
                    z6 = z3;
                    z5 = false;
                    break;
                case 16:
                    fMediaMetadataCompat3 = (float) (jsonUtf8Reader.MediaMetadataCompat() * ((double) newD50Xyzui_graphics.IconCompatParcelizer()));
                    z3 = z6;
                    str2 = strMediaDescriptionCompat3;
                    strMediaDescriptionCompat3 = str2;
                    z6 = z3;
                    z5 = false;
                    break;
                case 17:
                    fMediaMetadataCompat4 = (float) (jsonUtf8Reader.MediaMetadataCompat() * ((double) newD50Xyzui_graphics.IconCompatParcelizer()));
                    z3 = z6;
                    str2 = strMediaDescriptionCompat3;
                    strMediaDescriptionCompat3 = str2;
                    z6 = z3;
                    z5 = false;
                    break;
                case 18:
                    fMediaMetadataCompat6 = (float) jsonUtf8Reader.MediaMetadataCompat();
                    break;
                case 19:
                    fMediaMetadataCompat5 = (float) jsonUtf8Reader.MediaMetadataCompat();
                    break;
                case 20:
                    toxyzIconCompatParcelizer = getDisplayP3.IconCompatParcelizer(jsonUtf8Reader, strokeJoinCompanion, z5);
                    break;
                case 21:
                    strMediaDescriptionCompat3 = jsonUtf8Reader.MediaDescriptionCompat();
                    break;
                case 22:
                    zMediaSessionCompatQueueItem = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    break;
                case 23:
                    z6 = jsonUtf8Reader.RatingCompat() != 1 ? z5 : true;
                    break;
                case 24:
                    int iRatingCompat5 = jsonUtf8Reader.RatingCompat();
                    if (iRatingCompat5 >= createConnectorYBCOT_4.values().length) {
                        strokeJoinCompanion.IconCompatParcelizer("Unsupported Blend Mode: " + iRatingCompat5);
                        createconnectorybcot_5 = createConnectorYBCOT_4.NORMAL;
                    } else {
                        createconnectorybcot_5 = createConnectorYBCOT_4.values()[iRatingCompat5];
                    }
                    break;
                default:
                    z = z6;
                    z2 = z5;
                    str = strMediaDescriptionCompat3;
                    jsonUtf8Reader.MediaSessionCompatToken();
                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    z5 = z2;
                    strMediaDescriptionCompat3 = str;
                    z6 = z;
                    break;
            }
        }
        boolean z10 = z6;
        String str6 = strMediaDescriptionCompat3;
        jsonUtf8Reader.write();
        ArrayList arrayList4 = new ArrayList();
        if (fMediaMetadataCompat6 > 0.0f) {
            arrayList4.add(new Lab(strokeJoinCompanion, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(fMediaMetadataCompat6)));
        }
        if (fMediaMetadataCompat5 <= 0.0f) {
            fMediaMetadataCompat5 = strokeJoinCompanion.read;
        }
        arrayList4.add(new Lab(strokeJoinCompanion, fValueOf2, fValueOf2, (Interpolator) null, fMediaMetadataCompat6, Float.valueOf(fMediaMetadataCompat5)));
        arrayList4.add(new Lab(strokeJoinCompanion, fValueOf, fValueOf, (Interpolator) null, fMediaMetadataCompat5, Float.valueOf(Float.MAX_VALUE)));
        if (strMediaDescriptionCompat2.endsWith(".ai") || "ai".equals(str6)) {
            strokeJoinCompanion.IconCompatParcelizer("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (colorSpaceKt2 == null) {
                colorSpaceKt2 = new ColorSpaceKt();
            }
            ColorSpaceKt colorSpaceKt3 = colorSpaceKt2;
            colorSpaceKt3.IconCompatParcelizer = z10;
            colorSpaceKt = colorSpaceKt3;
        } else {
            colorSpaceKt = colorSpaceKt2;
        }
        return new getAdobeRgb(arrayList2, strokeJoinCompanion, strMediaDescriptionCompat2, jRatingCompat2, getbt2020pq, jRatingCompat, strMediaDescriptionCompat, arrayList, colorSpaceKt, iIconCompatParcelizer, iIconCompatParcelizer2, color, fMediaMetadataCompat, fMediaMetadataCompat2, fMediaMetadataCompat3, fMediaMetadataCompat4, xyzatocolorjlnilsgui_graphics, accessgetgreencp, arrayList4, getbt2020pqtransferparametersui_graphics2, toxyzIconCompatParcelizer, zMediaSessionCompatQueueItem, getexponentimpl, dropShadowEffect, createconnectorybcot_5);
    }
}
