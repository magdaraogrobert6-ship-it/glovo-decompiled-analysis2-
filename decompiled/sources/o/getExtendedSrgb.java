package o;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class getExtendedSrgb {
    public static final colorResource RemoteActionCompatParcelizer = colorResource.RemoteActionCompatParcelizer("ty", com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);

    /* JADX WARN: Code duplicated, block: B:159:0x0220  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    public static adaptdefault IconCompatParcelizer(com.airbnb.lottie.parser.moshi.JsonUtf8Reader jsonUtf8Reader, StrokeJoinCompanion strokeJoinCompanion) {
        String strMediaDescriptionCompat;
        byte b;
        adaptdefault chromaticadaptation;
        android.graphics.Path.FillType fillType;
        adaptdefault r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs;
        mul3x3 mul3x3Var;
        android.graphics.Path.FillType fillType2;
        mul3x3 mul3x3Var2;
        byte b2;
        int i = 100;
        jsonUtf8Reader.RemoteActionCompatParcelizer();
        int iRatingCompat = 2;
        while (true) {
            if (!jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                strMediaDescriptionCompat = null;
                break;
            }
            int i2 = jsonUtf8Reader.read(RemoteActionCompatParcelizer);
            if (i2 == 0) {
                strMediaDescriptionCompat = jsonUtf8Reader.MediaDescriptionCompat();
                break;
            }
            if (i2 != 1) {
                jsonUtf8Reader.MediaSessionCompatToken();
                jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
            } else {
                iRatingCompat = jsonUtf8Reader.RatingCompat();
            }
        }
        if (strMediaDescriptionCompat == null) {
            return null;
        }
        int iHashCode = strMediaDescriptionCompat.hashCode();
        if (iHashCode != 3239) {
            if (iHashCode != 3270) {
                if (iHashCode != 3295) {
                    if (iHashCode != 3488) {
                        if (iHashCode != 3646) {
                            if (iHashCode != 3669) {
                                if (iHashCode != 3679) {
                                    if (iHashCode != 3681) {
                                        if (iHashCode != 3705) {
                                            if (iHashCode != 3710) {
                                                if (iHashCode != 3307) {
                                                    if (iHashCode != 3308) {
                                                        if (iHashCode != 3633) {
                                                            if (iHashCode == 3634 && strMediaDescriptionCompat.equals("rd")) {
                                                                b = 7;
                                                            } else {
                                                                b = -1;
                                                            }
                                                        } else if (strMediaDescriptionCompat.equals("rc")) {
                                                            b = 6;
                                                        } else {
                                                            b = -1;
                                                        }
                                                    } else if (strMediaDescriptionCompat.equals("gs")) {
                                                        b = 4;
                                                    } else {
                                                        b = -1;
                                                    }
                                                } else if (strMediaDescriptionCompat.equals("gr")) {
                                                    b = 3;
                                                } else {
                                                    b = -1;
                                                }
                                            } else if (strMediaDescriptionCompat.equals("tr")) {
                                                b = 13;
                                            } else {
                                                b = -1;
                                            }
                                        } else if (strMediaDescriptionCompat.equals("tm")) {
                                            b = 12;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strMediaDescriptionCompat.equals("st")) {
                                        b = 11;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strMediaDescriptionCompat.equals("sr")) {
                                    b = 10;
                                } else {
                                    b = -1;
                                }
                            } else if (strMediaDescriptionCompat.equals("sh")) {
                                b = 9;
                            } else {
                                b = -1;
                            }
                        } else if (strMediaDescriptionCompat.equals("rp")) {
                            b = 8;
                        } else {
                            b = -1;
                        }
                    } else if (strMediaDescriptionCompat.equals("mm")) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                } else if (strMediaDescriptionCompat.equals("gf")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (strMediaDescriptionCompat.equals("fl")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (strMediaDescriptionCompat.equals("el")) {
            b = 0;
        } else {
            b = -1;
        }
        switch (b) {
            case 0:
                colorResource colorresource = getLinearSrgb.write;
                boolean z = iRatingCompat == 3;
                boolean zMediaSessionCompatQueueItem = false;
                String strMediaDescriptionCompat2 = null;
                absRcpResponse absrcpresponseSerializer = null;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer = null;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    int i3 = jsonUtf8Reader.read(getLinearSrgb.write);
                    if (i3 == 0) {
                        strMediaDescriptionCompat2 = jsonUtf8Reader.MediaDescriptionCompat();
                    } else if (i3 == 1) {
                        absrcpresponseSerializer = getDciP3.serializer(jsonUtf8Reader, strokeJoinCompanion);
                    } else if (i3 == 2) {
                        xyzatocolorjlnilsgui_graphicsSerializer = getDisplayP3.serializer(jsonUtf8Reader, strokeJoinCompanion);
                    } else if (i3 == 3) {
                        zMediaSessionCompatQueueItem = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    } else if (i3 != 4) {
                        jsonUtf8Reader.MediaSessionCompatToken();
                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        z = jsonUtf8Reader.RatingCompat() == 3;
                    }
                }
                chromaticadaptation = new chromaticAdaptation(strMediaDescriptionCompat2, absrcpresponseSerializer, xyzatocolorjlnilsgui_graphicsSerializer, z, zMediaSessionCompatQueueItem);
                break;
            case 1:
                colorResource colorresource2 = computeTransformYBCOT_4.RemoteActionCompatParcelizer;
                boolean zMediaSessionCompatQueueItem2 = false;
                boolean zMediaSessionCompatQueueItem3 = false;
                int iRatingCompat2 = 1;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics = null;
                String strMediaDescriptionCompat3 = null;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsWrite = null;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    int i4 = jsonUtf8Reader.read(computeTransformYBCOT_4.RemoteActionCompatParcelizer);
                    if (i4 == 0) {
                        strMediaDescriptionCompat3 = jsonUtf8Reader.MediaDescriptionCompat();
                    } else if (i4 == 1) {
                        xyzatocolorjlnilsgui_graphicsWrite = getDisplayP3.write(jsonUtf8Reader, strokeJoinCompanion);
                    } else if (i4 == 2) {
                        xyzatocolorjlnilsgui_graphics = getDisplayP3.serializer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion);
                    } else if (i4 == 3) {
                        zMediaSessionCompatQueueItem2 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    } else if (i4 == 4) {
                        iRatingCompat2 = jsonUtf8Reader.RatingCompat();
                    } else if (i4 != 5) {
                        jsonUtf8Reader.MediaSessionCompatToken();
                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        zMediaSessionCompatQueueItem3 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    }
                }
                if (xyzatocolorjlnilsgui_graphics == null) {
                    xyzatocolorjlnilsgui_graphics = new xyzaToColorJlNiLsgui_graphics(Collections.singletonList(new Lab(100)), 3);
                }
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics2 = xyzatocolorjlnilsgui_graphics;
                if (iRatingCompat2 == 1) {
                    fillType = android.graphics.Path.FillType.WINDING;
                } else {
                    fillType = android.graphics.Path.FillType.EVEN_ODD;
                }
                r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs = new r8lambdaAuDvHD5rvRWLz7Jo_0pkShsZRJs(strMediaDescriptionCompat3, zMediaSessionCompatQueueItem2, fillType, xyzatocolorjlnilsgui_graphicsWrite, xyzatocolorjlnilsgui_graphics2, zMediaSessionCompatQueueItem3);
                chromaticadaptation = r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs;
                break;
            case 2:
                colorResource colorresource3 = getOklab.serializer;
                android.graphics.Path.FillType fillType3 = android.graphics.Path.FillType.WINDING;
                boolean zMediaSessionCompatQueueItem4 = false;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer2 = null;
                String strMediaDescriptionCompat4 = null;
                mul3x3 mul3x3Var3 = null;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsIconCompatParcelizer = null;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer3 = null;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer4 = null;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    switch (jsonUtf8Reader.read(getOklab.serializer)) {
                        case 0:
                            strMediaDescriptionCompat4 = jsonUtf8Reader.MediaDescriptionCompat();
                            break;
                        case 1:
                            jsonUtf8Reader.RemoteActionCompatParcelizer();
                            int iRatingCompat3 = -1;
                            while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                int i5 = jsonUtf8Reader.read(getOklab.write);
                                if (i5 == 0) {
                                    iRatingCompat3 = jsonUtf8Reader.RatingCompat();
                                } else if (i5 != 1) {
                                    jsonUtf8Reader.MediaSessionCompatToken();
                                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                } else {
                                    xyzatocolorjlnilsgui_graphicsIconCompatParcelizer = getDisplayP3.IconCompatParcelizer(jsonUtf8Reader, strokeJoinCompanion, iRatingCompat3);
                                }
                            }
                            jsonUtf8Reader.write();
                            break;
                        case 2:
                            xyzatocolorjlnilsgui_graphicsSerializer2 = getDisplayP3.serializer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion);
                            break;
                        case 3:
                            if (jsonUtf8Reader.RatingCompat() == 1) {
                                mul3x3Var = mul3x3.LINEAR;
                            } else {
                                mul3x3Var = mul3x3.RADIAL;
                            }
                            mul3x3Var3 = mul3x3Var;
                            break;
                        case 4:
                            xyzatocolorjlnilsgui_graphicsSerializer3 = getDisplayP3.serializer(jsonUtf8Reader, strokeJoinCompanion);
                            break;
                        case 5:
                            xyzatocolorjlnilsgui_graphicsSerializer4 = getDisplayP3.serializer(jsonUtf8Reader, strokeJoinCompanion);
                            break;
                        case 6:
                            if (jsonUtf8Reader.RatingCompat() == 1) {
                                fillType2 = android.graphics.Path.FillType.WINDING;
                            } else {
                                fillType2 = android.graphics.Path.FillType.EVEN_ODD;
                            }
                            fillType3 = fillType2;
                            break;
                        case 7:
                            zMediaSessionCompatQueueItem4 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                            break;
                        default:
                            jsonUtf8Reader.MediaSessionCompatToken();
                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                            break;
                    }
                }
                chromaticadaptation = new adapt(strMediaDescriptionCompat4, mul3x3Var3, fillType3, xyzatocolorjlnilsgui_graphicsIconCompatParcelizer, xyzatocolorjlnilsgui_graphicsSerializer2 == null ? new xyzaToColorJlNiLsgui_graphics(Collections.singletonList(new Lab(100)), 3) : xyzatocolorjlnilsgui_graphicsSerializer2, xyzatocolorjlnilsgui_graphicsSerializer3, xyzatocolorjlnilsgui_graphicsSerializer4, zMediaSessionCompatQueueItem4);
                break;
            case 3:
                boolean zMediaSessionCompatQueueItem5 = false;
                colorResource colorresource4 = ConnectorKt.IconCompatParcelizer;
                ArrayList arrayList = new ArrayList();
                String strMediaDescriptionCompat5 = null;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    int i6 = jsonUtf8Reader.read(ConnectorKt.IconCompatParcelizer);
                    if (i6 == 0) {
                        strMediaDescriptionCompat5 = jsonUtf8Reader.MediaDescriptionCompat();
                    } else if (i6 == 1) {
                        zMediaSessionCompatQueueItem5 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    } else if (i6 != 2) {
                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        jsonUtf8Reader.read();
                        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                            adaptdefault adaptdefaultVarIconCompatParcelizer = IconCompatParcelizer(jsonUtf8Reader, strokeJoinCompanion);
                            if (adaptdefaultVarIconCompatParcelizer != null) {
                                arrayList.add(adaptdefaultVarIconCompatParcelizer);
                            }
                        }
                        jsonUtf8Reader.IconCompatParcelizer();
                    }
                }
                r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs = new rcpResponse(strMediaDescriptionCompat5, arrayList, zMediaSessionCompatQueueItem5);
                chromaticadaptation = r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs;
                break;
            case 4:
                colorResource colorresource5 = getSrgbTransferParametersui_graphics.read;
                ArrayList arrayList2 = new ArrayList();
                float fMediaMetadataCompat = 0.0f;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer5 = null;
                String strMediaDescriptionCompat6 = null;
                mul3x3 mul3x3Var4 = null;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsIconCompatParcelizer2 = null;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer6 = null;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer7 = null;
                toXyz toxyzIconCompatParcelizer = null;
                r8lambdaYd8d8llBoQBR8Da_XopDGLk0XAc r8lambdayd8d8llboqbr8da_xopdglk0xac = null;
                r8lambdaE4KVZcdX3AZ_s6Jzj0ZAq28pilk r8lambdae4kvzcdx3az_s6jzj0zaq28pilk = null;
                toXyz toxyz = null;
                boolean zMediaSessionCompatQueueItem6 = false;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    switch (jsonUtf8Reader.read(getSrgbTransferParametersui_graphics.read)) {
                        case 0:
                            strMediaDescriptionCompat6 = jsonUtf8Reader.MediaDescriptionCompat();
                            break;
                        case 1:
                            jsonUtf8Reader.RemoteActionCompatParcelizer();
                            int iRatingCompat4 = -1;
                            while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                int i7 = jsonUtf8Reader.read(getSrgbTransferParametersui_graphics.serializer);
                                if (i7 == 0) {
                                    iRatingCompat4 = jsonUtf8Reader.RatingCompat();
                                } else if (i7 != 1) {
                                    jsonUtf8Reader.MediaSessionCompatToken();
                                    jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                } else {
                                    xyzatocolorjlnilsgui_graphicsIconCompatParcelizer2 = getDisplayP3.IconCompatParcelizer(jsonUtf8Reader, strokeJoinCompanion, iRatingCompat4);
                                }
                            }
                            jsonUtf8Reader.write();
                            break;
                        case 2:
                            xyzatocolorjlnilsgui_graphicsSerializer5 = getDisplayP3.serializer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion);
                            break;
                        case 3:
                            if (jsonUtf8Reader.RatingCompat() == 1) {
                                mul3x3Var2 = mul3x3.LINEAR;
                            } else {
                                mul3x3Var2 = mul3x3.RADIAL;
                            }
                            mul3x3Var4 = mul3x3Var2;
                            break;
                        case 4:
                            xyzatocolorjlnilsgui_graphicsSerializer6 = getDisplayP3.serializer(jsonUtf8Reader, strokeJoinCompanion);
                            break;
                        case 5:
                            xyzatocolorjlnilsgui_graphicsSerializer7 = getDisplayP3.serializer(jsonUtf8Reader, strokeJoinCompanion);
                            break;
                        case 6:
                            toxyzIconCompatParcelizer = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                            break;
                        case 7:
                            r8lambdayd8d8llboqbr8da_xopdglk0xac = r8lambdaYd8d8llBoQBR8Da_XopDGLk0XAc.values()[jsonUtf8Reader.RatingCompat() - 1];
                            break;
                        case 8:
                            r8lambdae4kvzcdx3az_s6jzj0zaq28pilk = r8lambdaE4KVZcdX3AZ_s6Jzj0ZAq28pilk.values()[jsonUtf8Reader.RatingCompat() - 1];
                            break;
                        case 9:
                            fMediaMetadataCompat = (float) jsonUtf8Reader.MediaMetadataCompat();
                            break;
                        case 10:
                            zMediaSessionCompatQueueItem6 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                            break;
                        case 11:
                            jsonUtf8Reader.read();
                            while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                jsonUtf8Reader.RemoteActionCompatParcelizer();
                                toXyz toxyzIconCompatParcelizer2 = null;
                                String strMediaDescriptionCompat7 = null;
                                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                    int i8 = jsonUtf8Reader.read(getSrgbTransferParametersui_graphics.write);
                                    if (i8 == 0) {
                                        strMediaDescriptionCompat7 = jsonUtf8Reader.MediaDescriptionCompat();
                                    } else if (i8 != 1) {
                                        jsonUtf8Reader.MediaSessionCompatToken();
                                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                    } else {
                                        toxyzIconCompatParcelizer2 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                                    }
                                }
                                jsonUtf8Reader.write();
                                if (strMediaDescriptionCompat7.equals("o")) {
                                    toxyz = toxyzIconCompatParcelizer2;
                                } else if (strMediaDescriptionCompat7.equals(com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE) || strMediaDescriptionCompat7.equals("g")) {
                                    strokeJoinCompanion.MediaMetadataCompat = true;
                                    arrayList2.add(toxyzIconCompatParcelizer2);
                                }
                            }
                            jsonUtf8Reader.IconCompatParcelizer();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((toXyz) arrayList2.get(0));
                            }
                            break;
                        default:
                            jsonUtf8Reader.MediaSessionCompatToken();
                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                            break;
                    }
                }
                r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs = new connectYBCOT_4(strMediaDescriptionCompat6, mul3x3Var4, xyzatocolorjlnilsgui_graphicsIconCompatParcelizer2, xyzatocolorjlnilsgui_graphicsSerializer5 == null ? new xyzaToColorJlNiLsgui_graphics(Collections.singletonList(new Lab(100)), 3) : xyzatocolorjlnilsgui_graphicsSerializer5, xyzatocolorjlnilsgui_graphicsSerializer6, xyzatocolorjlnilsgui_graphicsSerializer7, toxyzIconCompatParcelizer, r8lambdayd8d8llboqbr8da_xopdglk0xac, r8lambdae4kvzcdx3az_s6jzj0zaq28pilk, fMediaMetadataCompat, arrayList2, toxyz, zMediaSessionCompatQueueItem6);
                chromaticadaptation = r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs;
                break;
            case 5:
                colorResource colorresource6 = transferHlgOetfui_graphics.write;
                mul3x3Float3 mul3x3float3ForId = null;
                boolean zMediaSessionCompatQueueItem7 = false;
                String strMediaDescriptionCompat8 = null;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    int i9 = jsonUtf8Reader.read(transferHlgOetfui_graphics.write);
                    if (i9 == 0) {
                        strMediaDescriptionCompat8 = jsonUtf8Reader.MediaDescriptionCompat();
                    } else if (i9 == 1) {
                        mul3x3float3ForId = mul3x3Float3.forId(jsonUtf8Reader.RatingCompat());
                    } else if (i9 != 2) {
                        jsonUtf8Reader.MediaSessionCompatToken();
                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        zMediaSessionCompatQueueItem7 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    }
                }
                mul3x3Diag mul3x3diag = new mul3x3Diag(strMediaDescriptionCompat8, mul3x3float3ForId, zMediaSessionCompatQueueItem7);
                strokeJoinCompanion.IconCompatParcelizer("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                chromaticadaptation = mul3x3diag;
                break;
            case 6:
                colorResource colorresource7 = accesscomputeTransformYBCOT_4.RemoteActionCompatParcelizer;
                String strMediaDescriptionCompat9 = null;
                absRcpResponse absrcpresponseSerializer2 = null;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer8 = null;
                toXyz toxyzIconCompatParcelizer3 = null;
                boolean zMediaSessionCompatQueueItem8 = false;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    int i10 = jsonUtf8Reader.read(accesscomputeTransformYBCOT_4.RemoteActionCompatParcelizer);
                    if (i10 == 0) {
                        strMediaDescriptionCompat9 = jsonUtf8Reader.MediaDescriptionCompat();
                    } else if (i10 == 1) {
                        absrcpresponseSerializer2 = getDciP3.serializer(jsonUtf8Reader, strokeJoinCompanion);
                    } else if (i10 == 2) {
                        xyzatocolorjlnilsgui_graphicsSerializer8 = getDisplayP3.serializer(jsonUtf8Reader, strokeJoinCompanion);
                    } else if (i10 == 3) {
                        toxyzIconCompatParcelizer3 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                    } else if (i10 != 4) {
                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        zMediaSessionCompatQueueItem8 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    }
                }
                chromaticadaptation = new response(strMediaDescriptionCompat9, absrcpresponseSerializer2, xyzatocolorjlnilsgui_graphicsSerializer8, toxyzIconCompatParcelizer3, zMediaSessionCompatQueueItem8);
                break;
            case 7:
                colorResource colorresource8 = getRenderIntentuksYyKA.RemoteActionCompatParcelizer;
                String strMediaDescriptionCompat10 = null;
                toXyz toxyzIconCompatParcelizer4 = null;
                boolean zMediaSessionCompatQueueItem9 = false;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    int i11 = jsonUtf8Reader.read(getRenderIntentuksYyKA.RemoteActionCompatParcelizer);
                    if (i11 == 0) {
                        strMediaDescriptionCompat10 = jsonUtf8Reader.MediaDescriptionCompat();
                    } else if (i11 == 1) {
                        toxyzIconCompatParcelizer4 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                    } else if (i11 != 2) {
                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        zMediaSessionCompatQueueItem9 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    }
                }
                chromaticadaptation = !zMediaSessionCompatQueueItem9 ? new ColorSpaces(strMediaDescriptionCompat10, toxyzIconCompatParcelizer4) : null;
                break;
            case 8:
                colorResource colorresource9 = getSource.read;
                String strMediaDescriptionCompat11 = null;
                toXyz toxyzIconCompatParcelizer5 = null;
                toXyz toxyzIconCompatParcelizer6 = null;
                ColorSpaceKt colorSpaceKt = null;
                boolean zMediaSessionCompatQueueItem10 = false;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    int i12 = jsonUtf8Reader.read(getSource.read);
                    if (i12 == 0) {
                        strMediaDescriptionCompat11 = jsonUtf8Reader.MediaDescriptionCompat();
                    } else if (i12 == 1) {
                        toxyzIconCompatParcelizer5 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    } else if (i12 == 2) {
                        toxyzIconCompatParcelizer6 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    } else if (i12 == 3) {
                        colorSpaceKt = getNtsc1953.read(jsonUtf8Reader, strokeJoinCompanion);
                    } else if (i12 != 4) {
                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        zMediaSessionCompatQueueItem10 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    }
                }
                chromaticadaptation = new response(strMediaDescriptionCompat11, toxyzIconCompatParcelizer5, toxyzIconCompatParcelizer6, colorSpaceKt, zMediaSessionCompatQueueItem10);
                break;
            case 9:
                colorResource colorresource10 = ConnectorCompanionidentity1.write;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics3 = null;
                int iRatingCompat5 = 0;
                boolean zMediaSessionCompatQueueItem11 = false;
                String strMediaDescriptionCompat12 = null;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    int i13 = jsonUtf8Reader.read(ConnectorCompanionidentity1.write);
                    if (i13 == 0) {
                        strMediaDescriptionCompat12 = jsonUtf8Reader.MediaDescriptionCompat();
                    } else if (i13 == 1) {
                        iRatingCompat5 = jsonUtf8Reader.RatingCompat();
                    } else if (i13 == 2) {
                        xyzatocolorjlnilsgui_graphics3 = new xyzaToColorJlNiLsgui_graphics(match.serializer(jsonUtf8Reader, strokeJoinCompanion, newD50Xyzui_graphics.IconCompatParcelizer(), ConnectorCompanion.IconCompatParcelizer, false), 6);
                    } else if (i13 != 3) {
                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        zMediaSessionCompatQueueItem11 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    }
                }
                r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs = new r8lambdari4swWY4EFQdKU1W_SyLqgkcz7Q(strMediaDescriptionCompat12, iRatingCompat5, xyzatocolorjlnilsgui_graphics3, zMediaSessionCompatQueueItem11);
                chromaticadaptation = r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs;
                break;
            case 10:
                colorResource colorresource11 = transformToColorl2rxGTcui_graphics.IconCompatParcelizer;
                int i14 = 3;
                boolean z2 = iRatingCompat == 3;
                String strMediaDescriptionCompat13 = null;
                mul3x3Float3_0 mul3x3float3_0ForValue = null;
                toXyz toxyzIconCompatParcelizer7 = null;
                absRcpResponse absrcpresponseSerializer3 = null;
                toXyz toxyzIconCompatParcelizer8 = null;
                toXyz toxyzIconCompatParcelizer9 = null;
                toXyz toxyzIconCompatParcelizer10 = null;
                toXyz toxyzIconCompatParcelizer11 = null;
                toXyz toxyzIconCompatParcelizer12 = null;
                boolean zMediaSessionCompatQueueItem12 = false;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    switch (jsonUtf8Reader.read(transformToColorl2rxGTcui_graphics.IconCompatParcelizer)) {
                        case 0:
                            strMediaDescriptionCompat13 = jsonUtf8Reader.MediaDescriptionCompat();
                            break;
                        case 1:
                            mul3x3float3_0ForValue = mul3x3Float3_0.forValue(jsonUtf8Reader.RatingCompat());
                            break;
                        case 2:
                            toxyzIconCompatParcelizer7 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                            break;
                        case 3:
                            absrcpresponseSerializer3 = getDciP3.serializer(jsonUtf8Reader, strokeJoinCompanion);
                            break;
                        case 4:
                            toxyzIconCompatParcelizer8 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                            break;
                        case 5:
                            toxyzIconCompatParcelizer10 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                            break;
                        case 6:
                            toxyzIconCompatParcelizer12 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                            break;
                        case 7:
                            toxyzIconCompatParcelizer9 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                            break;
                        case 8:
                            toxyzIconCompatParcelizer11 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                            break;
                        case 9:
                            zMediaSessionCompatQueueItem12 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                            break;
                        case 10:
                            if (jsonUtf8Reader.RatingCompat() == i14) {
                                z2 = true;
                            } else {
                                z2 = false;
                                continue;
                            }
                            break;
                        default:
                            jsonUtf8Reader.MediaSessionCompatToken();
                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                            break;
                    }
                    i14 = 3;
                }
                r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs = new mul3x3Float3_1(strMediaDescriptionCompat13, mul3x3float3_0ForValue, toxyzIconCompatParcelizer7, absrcpresponseSerializer3, toxyzIconCompatParcelizer8, toxyzIconCompatParcelizer9, toxyzIconCompatParcelizer10, toxyzIconCompatParcelizer11, toxyzIconCompatParcelizer12, zMediaSessionCompatQueueItem12, z2);
                chromaticadaptation = r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs;
                break;
            case 11:
                colorResource colorresource12 = identityui_graphics.read;
                ArrayList arrayList3 = new ArrayList();
                boolean zMediaSessionCompatQueueItem13 = false;
                float fMediaMetadataCompat2 = 0.0f;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsSerializer9 = null;
                r8lambdaYd8d8llBoQBR8Da_XopDGLk0XAc r8lambdayd8d8llboqbr8da_xopdglk0xac2 = null;
                r8lambdaE4KVZcdX3AZ_s6Jzj0ZAq28pilk r8lambdae4kvzcdx3az_s6jzj0zaq28pilk2 = null;
                String strMediaDescriptionCompat14 = null;
                toXyz toxyz2 = null;
                xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphicsWrite2 = null;
                toXyz toxyzIconCompatParcelizer13 = null;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    switch (jsonUtf8Reader.read(identityui_graphics.read)) {
                        case 0:
                            strMediaDescriptionCompat14 = jsonUtf8Reader.MediaDescriptionCompat();
                            break;
                        case 1:
                            xyzatocolorjlnilsgui_graphicsWrite2 = getDisplayP3.write(jsonUtf8Reader, strokeJoinCompanion);
                            break;
                        case 2:
                            toxyzIconCompatParcelizer13 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                            break;
                        case 3:
                            xyzatocolorjlnilsgui_graphicsSerializer9 = getDisplayP3.serializer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion);
                            break;
                        case 4:
                            r8lambdayd8d8llboqbr8da_xopdglk0xac2 = r8lambdaYd8d8llBoQBR8Da_XopDGLk0XAc.values()[jsonUtf8Reader.RatingCompat() - 1];
                            break;
                        case 5:
                            r8lambdae4kvzcdx3az_s6jzj0zaq28pilk2 = r8lambdaE4KVZcdX3AZ_s6Jzj0ZAq28pilk.values()[jsonUtf8Reader.RatingCompat() - 1];
                            break;
                        case 6:
                            fMediaMetadataCompat2 = (float) jsonUtf8Reader.MediaMetadataCompat();
                            break;
                        case 7:
                            zMediaSessionCompatQueueItem13 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                            break;
                        case 8:
                            jsonUtf8Reader.read();
                            while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                jsonUtf8Reader.RemoteActionCompatParcelizer();
                                String strMediaDescriptionCompat15 = null;
                                toXyz toxyzIconCompatParcelizer14 = null;
                                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                                    int i15 = jsonUtf8Reader.read(identityui_graphics.RemoteActionCompatParcelizer);
                                    if (i15 == 0) {
                                        strMediaDescriptionCompat15 = jsonUtf8Reader.MediaDescriptionCompat();
                                    } else if (i15 != 1) {
                                        jsonUtf8Reader.MediaSessionCompatToken();
                                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                                    } else {
                                        toxyzIconCompatParcelizer14 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, true);
                                    }
                                }
                                jsonUtf8Reader.write();
                                strMediaDescriptionCompat15.getClass();
                                int iHashCode2 = strMediaDescriptionCompat15.hashCode();
                                if (iHashCode2 != i) {
                                    if (iHashCode2 != 103) {
                                        if (iHashCode2 == 111 && strMediaDescriptionCompat15.equals("o")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (strMediaDescriptionCompat15.equals("g")) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strMediaDescriptionCompat15.equals(com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE)) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                if (b2 == 0 || b2 == 1) {
                                    strokeJoinCompanion.MediaMetadataCompat = true;
                                    arrayList3.add(toxyzIconCompatParcelizer14);
                                } else if (b2 == 2) {
                                    toxyz2 = toxyzIconCompatParcelizer14;
                                }
                                i = 100;
                            }
                            jsonUtf8Reader.IconCompatParcelizer();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((toXyz) arrayList3.get(0));
                            }
                            break;
                        default:
                            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                            break;
                    }
                    i = 100;
                }
                r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs = new r8lambdatciNJxE1qhqOKkSFEiubAeQGegA(strMediaDescriptionCompat14, toxyz2, arrayList3, xyzatocolorjlnilsgui_graphicsWrite2, xyzatocolorjlnilsgui_graphicsSerializer9 == null ? new xyzaToColorJlNiLsgui_graphics(Collections.singletonList(new Lab(100)), 3) : xyzatocolorjlnilsgui_graphicsSerializer9, toxyzIconCompatParcelizer13, r8lambdayd8d8llboqbr8da_xopdglk0xac2 == null ? r8lambdaYd8d8llBoQBR8Da_XopDGLk0XAc.BUTT : r8lambdayd8d8llboqbr8da_xopdglk0xac2, r8lambdae4kvzcdx3az_s6jzj0zaq28pilk2 == null ? r8lambdaE4KVZcdX3AZ_s6Jzj0ZAq28pilk.MITER : r8lambdae4kvzcdx3az_s6jzj0zaq28pilk2, fMediaMetadataCompat2, zMediaSessionCompatQueueItem13);
                chromaticadaptation = r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs;
                break;
            case 12:
                colorResource colorresource13 = ConnectorRgbConnector.IconCompatParcelizer;
                boolean zMediaSessionCompatQueueItem14 = false;
                String strMediaDescriptionCompat16 = null;
                Bt2020Pqlambda0 bt2020Pqlambda0ForId = null;
                toXyz toxyzIconCompatParcelizer15 = null;
                toXyz toxyzIconCompatParcelizer16 = null;
                toXyz toxyzIconCompatParcelizer17 = null;
                while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
                    int i16 = jsonUtf8Reader.read(ConnectorRgbConnector.IconCompatParcelizer);
                    if (i16 == 0) {
                        toxyzIconCompatParcelizer15 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    } else if (i16 == 1) {
                        toxyzIconCompatParcelizer16 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    } else if (i16 == 2) {
                        toxyzIconCompatParcelizer17 = getDisplayP3.IconCompatParcelizer((com.airbnb.lottie.parser.moshi.JsonReader) jsonUtf8Reader, strokeJoinCompanion, false);
                    } else if (i16 == 3) {
                        strMediaDescriptionCompat16 = jsonUtf8Reader.MediaDescriptionCompat();
                    } else if (i16 == 4) {
                        bt2020Pqlambda0ForId = Bt2020Pqlambda0.forId(jsonUtf8Reader.RatingCompat());
                    } else if (i16 != 5) {
                        jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        zMediaSessionCompatQueueItem14 = jsonUtf8Reader.MediaSessionCompatQueueItem();
                    }
                }
                r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs = new Bt2020Hlglambda1(strMediaDescriptionCompat16, bt2020Pqlambda0ForId, toxyzIconCompatParcelizer15, toxyzIconCompatParcelizer16, toxyzIconCompatParcelizer17, zMediaSessionCompatQueueItem14);
                chromaticadaptation = r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs;
                break;
            case 13:
                chromaticadaptation = getNtsc1953.read(jsonUtf8Reader, strokeJoinCompanion);
                break;
            default:
                getD50Xyzui_graphics.IconCompatParcelizer("Unknown shape type ".concat(strMediaDescriptionCompat));
                break;
        }
        while (jsonUtf8Reader.MediaBrowserCompatMediaItem()) {
            jsonUtf8Reader.MediaSessionCompatResultReceiverWrapper();
        }
        jsonUtf8Reader.write();
        return chromaticadaptation;
    }
}
