package o;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class migrateSealedSessionsMapToJsonlambda3 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    public static accesstoSpkPz2Gy4jd serializer(String str) {
        byte b;
        accesstoSpkPz2Gy4jd accesstospkpz2gy4jd = accesstoSpkPz2Gy4jd.read(0);
        switch (str) {
            case "preferWrap":
                b = 0;
                break;
            case "parent":
                b = 1;
                break;
            case "spread":
                b = 2;
                break;
            case "wrap":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        String str2 = accesstoSpkPz2Gy4jd.MediaSessionCompatQueueItem;
        String str3 = accesstoSpkPz2Gy4jd.serializer;
        if (b == 0) {
            return accesstoSpkPz2Gy4jd.write(str2);
        }
        if (b == 1) {
            return new accesstoSpkPz2Gy4jd(accesstoSpkPz2Gy4jd.write);
        }
        if (b == 2) {
            return accesstoSpkPz2Gy4jd.write(str3);
        }
        if (b == 3) {
            return new accesstoSpkPz2Gy4jd(str2);
        }
        if (str.endsWith("%")) {
            float f = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
            accesstoSpkPz2Gy4jd accesstospkpz2gy4jd2 = new accesstoSpkPz2Gy4jd(accesstoSpkPz2Gy4jd.RemoteActionCompatParcelizer);
            accesstospkpz2gy4jd2.MediaSessionCompatToken = f;
            accesstospkpz2gy4jd2.MediaBrowserCompatMediaItem = true;
            accesstospkpz2gy4jd2.MediaMetadataCompat = 0;
            return accesstospkpz2gy4jd2;
        }
        if (!str.contains(":")) {
            return accesstospkpz2gy4jd;
        }
        accesstoSpkPz2Gy4jd accesstospkpz2gy4jd3 = new accesstoSpkPz2Gy4jd(accesstoSpkPz2Gy4jd.read);
        accesstospkpz2gy4jd3.PlaybackStateCompatCustomAction = str;
        accesstospkpz2gy4jd3.MediaDescriptionCompat = str3;
        accesstospkpz2gy4jd3.MediaBrowserCompatMediaItem = true;
        return accesstospkpz2gy4jd3;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    public static void write(int i, drawBehind drawbehind, androidx.navigation.NavArgsLazy navArgsLazy, accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd) {
        PainterElement painterElement;
        String strWrite;
        if (i == 0) {
            drawbehind.getClass();
            painterElement = (getColorFilter) drawbehind.serializer(toRect.HORIZONTAL_CHAIN);
        } else {
            drawbehind.getClass();
            painterElement = (getAlignment) drawbehind.serializer(toRect.VERTICAL_CHAIN);
        }
        DropShadowScope dropShadowScope = accessroundtopxr2x_6ojd.read(1);
        if (dropShadowScope instanceof accessroundToPxR2X_6ojd) {
            accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd2 = (accessroundToPxR2X_6ojd) dropShadowScope;
            if (accessroundtopxr2x_6ojd2.RemoteActionCompatParcelizer.size() < 1) {
                return;
            }
            for (int i2 = 0; i2 < accessroundtopxr2x_6ojd2.RemoteActionCompatParcelizer.size(); i2++) {
                painterElement.IconCompatParcelizer(accessroundtopxr2x_6ojd2.write(i2));
            }
            if (accessroundtopxr2x_6ojd.RemoteActionCompatParcelizer.size() > 2) {
                DropShadowScope dropShadowScope2 = accessroundtopxr2x_6ojd.read(2);
                if (dropShadowScope2 instanceof accesstoPxR2X_6ojd) {
                    accesstoPxR2X_6ojd accesstopxr2x_6ojd = (accesstoPxR2X_6ojd) dropShadowScope2;
                    for (String str : accesstopxr2x_6ojd.serializer()) {
                        str.getClass();
                        if (str.equals("style")) {
                            DropShadowScope dropShadowScope3 = accesstopxr2x_6ojd.read(str);
                            if (dropShadowScope3 instanceof accessroundToPxR2X_6ojd) {
                                accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd3 = (accessroundToPxR2X_6ojd) dropShadowScope3;
                                if (accessroundtopxr2x_6ojd3.RemoteActionCompatParcelizer.size() > 1) {
                                    strWrite = accessroundtopxr2x_6ojd3.write(0);
                                    painterElement.getViewModelStore = accessroundtopxr2x_6ojd3.RemoteActionCompatParcelizer(1);
                                } else {
                                    strWrite = dropShadowScope3.write();
                                }
                            } else {
                                strWrite = dropShadowScope3.write();
                            }
                            if (strWrite.equals("packed")) {
                                painterElement.onConfigurationChanged = toDpSizekrfVVM.PACKED;
                            } else if (strWrite.equals("spread_inside")) {
                                painterElement.onConfigurationChanged = toDpSizekrfVVM.SPREAD_INSIDE;
                            } else {
                                painterElement.onConfigurationChanged = toDpSizekrfVVM.SPREAD;
                            }
                        } else {
                            IconCompatParcelizer(drawbehind, accesstopxr2x_6ojd, painterElement, navArgsLazy, str);
                        }
                    }
                }
            }
        }
    }

    public static final double RemoteActionCompatParcelizer(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("#." + setCarryoverInAppMessage.RemoteActionCompatParcelizer(5, "#"), new DecimalFormatSymbols(java.util.Locale.US));
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String str = decimalFormat.format(d);
        str.getClass();
        return Double.parseDouble(str);
    }

    public static void RemoteActionCompatParcelizer(drawBehind drawbehind, androidx.navigation.NavArgsLazy navArgsLazy, String str, accesstoPxR2X_6ojd accesstopxr2x_6ojd) {
        accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite = drawbehind.write(str);
        accesstoSpkPz2Gy4jd accesstospkpz2gy4jd = accesstosizexkawntqjdWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        String str2 = accesstoSpkPz2Gy4jd.MediaSessionCompatQueueItem;
        if (accesstospkpz2gy4jd == null) {
            accesstosizexkawntqjdWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new accesstoSpkPz2Gy4jd(str2);
        }
        if (accesstosizexkawntqjdWrite.addOnUserLeaveHintListener == null) {
            accesstosizexkawntqjdWrite.addOnUserLeaveHintListener = new accesstoSpkPz2Gy4jd(str2);
        }
        Iterator it = accesstopxr2x_6ojd.serializer().iterator();
        while (it.hasNext()) {
            read(drawbehind, accesstopxr2x_6ojd, accesstosizexkawntqjdWrite, navArgsLazy, (String) it.next());
        }
    }

    public static accesstoSpkPz2Gy4jd IconCompatParcelizer(accesstoPxR2X_6ojd accesstopxr2x_6ojd, String str, drawBehind drawbehind, StreamSharing$$ExternalSyntheticLambda0 streamSharing$$ExternalSyntheticLambda0) throws androidx.constraintlayout.core.parser.CLParsingException {
        DropShadowScope dropShadowScope = accesstopxr2x_6ojd.read(str);
        accesstoSpkPz2Gy4jd accesstospkpz2gy4jdSerializer = accesstoSpkPz2Gy4jd.read(0);
        if (dropShadowScope instanceof accesstoDpSizekrfVVMjd) {
            return serializer(dropShadowScope.write());
        }
        if (dropShadowScope instanceof accesstoRectjd) {
            return accesstoSpkPz2Gy4jd.read(drawbehind.read(Float.valueOf(streamSharing$$ExternalSyntheticLambda0.IconCompatParcelizer(accesstopxr2x_6ojd.serializer(str)))));
        }
        if (dropShadowScope instanceof accesstoPxR2X_6ojd) {
            accesstoPxR2X_6ojd accesstopxr2x_6ojd2 = (accesstoPxR2X_6ojd) dropShadowScope;
            String strWrite = accesstopxr2x_6ojd2.write("value");
            if (strWrite != null) {
                accesstospkpz2gy4jdSerializer = serializer(strWrite);
            }
            DropShadowScope dropShadowScopeRemoteActionCompatParcelizer = accesstopxr2x_6ojd2.RemoteActionCompatParcelizer("min");
            if (dropShadowScopeRemoteActionCompatParcelizer != null) {
                if (dropShadowScopeRemoteActionCompatParcelizer instanceof accesstoRectjd) {
                    int i = drawbehind.read(Float.valueOf(streamSharing$$ExternalSyntheticLambda0.IconCompatParcelizer(((accesstoRectjd) dropShadowScopeRemoteActionCompatParcelizer).IconCompatParcelizer())));
                    if (i >= 0) {
                        accesstospkpz2gy4jdSerializer.RatingCompat = i;
                    }
                } else if (dropShadowScopeRemoteActionCompatParcelizer instanceof accesstoDpSizekrfVVMjd) {
                    accesstospkpz2gy4jdSerializer.RatingCompat = -2;
                }
            }
            DropShadowScope dropShadowScopeRemoteActionCompatParcelizer2 = accesstopxr2x_6ojd2.RemoteActionCompatParcelizer("max");
            if (dropShadowScopeRemoteActionCompatParcelizer2 != null) {
                if (dropShadowScopeRemoteActionCompatParcelizer2 instanceof accesstoRectjd) {
                    int i2 = drawbehind.read(Float.valueOf(streamSharing$$ExternalSyntheticLambda0.IconCompatParcelizer(((accesstoRectjd) dropShadowScopeRemoteActionCompatParcelizer2).IconCompatParcelizer())));
                    if (accesstospkpz2gy4jdSerializer.MediaMetadataCompat >= 0) {
                        accesstospkpz2gy4jdSerializer.MediaMetadataCompat = i2;
                        return accesstospkpz2gy4jdSerializer;
                    }
                } else if ((dropShadowScopeRemoteActionCompatParcelizer2 instanceof accesstoDpSizekrfVVMjd) && accesstospkpz2gy4jdSerializer.MediaBrowserCompatMediaItem) {
                    accesstospkpz2gy4jdSerializer.MediaDescriptionCompat = accesstoSpkPz2Gy4jd.MediaSessionCompatQueueItem;
                    accesstospkpz2gy4jdSerializer.MediaMetadataCompat = Integer.MAX_VALUE;
                }
            }
        }
        return accesstospkpz2gy4jdSerializer;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0111  */
    public static void IconCompatParcelizer(int i, drawBehind drawbehind, String str, accesstoPxR2X_6ojd accesstopxr2x_6ojd) {
        byte b;
        boolean z;
        byte b2;
        ArrayList<String> arrayListSerializer = accesstopxr2x_6ojd.serializer();
        accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite = drawbehind.write(str);
        if (i == 0) {
            drawbehind.write(0, str);
        } else {
            drawbehind.write(1, str);
        }
        boolean z2 = drawbehind.MediaBrowserCompatMediaItem || i == 0;
        getContentScale getcontentscale = (getContentScale) accesstosizexkawntqjdWrite.ComponentActivity;
        boolean z3 = false;
        boolean z4 = true;
        float fIconCompatParcelizer = 0.0f;
        for (String str2 : arrayListSerializer) {
            str2.getClass();
            switch (str2) {
                case "percent":
                    b = 0;
                    break;
                case "end":
                    b = 1;
                    break;
                case "left":
                    b = 2;
                    break;
                case "right":
                    b = 3;
                    break;
                case "start":
                    b = 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                DropShadowScope dropShadowScopeRemoteActionCompatParcelizer = accesstopxr2x_6ojd.RemoteActionCompatParcelizer(str2);
                accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd = dropShadowScopeRemoteActionCompatParcelizer instanceof accessroundToPxR2X_6ojd ? (accessroundToPxR2X_6ojd) dropShadowScopeRemoteActionCompatParcelizer : null;
                if (accessroundtopxr2x_6ojd == null) {
                    fIconCompatParcelizer = accesstopxr2x_6ojd.serializer(str2);
                    z3 = true;
                    z4 = true;
                } else {
                    if (accessroundtopxr2x_6ojd.RemoteActionCompatParcelizer.size() > 1) {
                        z = false;
                        String strWrite = accessroundtopxr2x_6ojd.write(0);
                        float fRemoteActionCompatParcelizer = accessroundtopxr2x_6ojd.RemoteActionCompatParcelizer(1);
                        switch (strWrite) {
                            case "end":
                                b2 = 0;
                                break;
                            case "left":
                                b2 = 1;
                                break;
                            case "right":
                                b2 = 2;
                                break;
                            case "start":
                                b2 = 3;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 == 0) {
                            z4 = !z2;
                        } else if (b2 == 1) {
                            z4 = true;
                            fIconCompatParcelizer = fRemoteActionCompatParcelizer;
                            z3 = true;
                        } else if (b2 == 2) {
                            z4 = false;
                        } else if (b2 == 3) {
                            z4 = z2;
                        }
                        fIconCompatParcelizer = fRemoteActionCompatParcelizer;
                    } else {
                        z = false;
                    }
                    z3 = true;
                }
            } else if (b == 1) {
                fIconCompatParcelizer = drawbehind.IconCompatParcelizer.IconCompatParcelizer(accesstopxr2x_6ojd.serializer(str2));
                z4 = !z2;
            } else if (b == 2) {
                fIconCompatParcelizer = drawbehind.IconCompatParcelizer.IconCompatParcelizer(accesstopxr2x_6ojd.serializer(str2));
                z4 = true;
            } else if (b == 3) {
                fIconCompatParcelizer = drawbehind.IconCompatParcelizer.IconCompatParcelizer(accesstopxr2x_6ojd.serializer(str2));
                z4 = false;
            } else if (b == 4) {
                fIconCompatParcelizer = drawbehind.IconCompatParcelizer.IconCompatParcelizer(accesstopxr2x_6ojd.serializer(str2));
                z4 = z2;
            }
        }
        if (z3) {
            if (z4) {
                getcontentscale.MediaDescriptionCompat = -1;
                getcontentscale.read = -1;
                getcontentscale.write = fIconCompatParcelizer;
                return;
            } else {
                getcontentscale.MediaDescriptionCompat = -1;
                getcontentscale.read = -1;
                getcontentscale.write = 1.0f - fIconCompatParcelizer;
                return;
            }
        }
        if (z4) {
            getcontentscale.MediaDescriptionCompat = getcontentscale.RatingCompat.read(Float.valueOf(fIconCompatParcelizer));
            getcontentscale.read = -1;
            getcontentscale.write = 0.0f;
        } else {
            getcontentscale.MediaDescriptionCompat = -1;
            getcontentscale.read = getcontentscale.RatingCompat.read(Float.valueOf(fIconCompatParcelizer));
            getcontentscale.write = 0.0f;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x0185  */
    /* JADX WARN: Code duplicated, block: B:144:0x020d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0275  */
    /* JADX WARN: Code duplicated, block: B:84:0x0128  */
    public static void IconCompatParcelizer(drawBehind drawbehind, accesstoPxR2X_6ojd accesstopxr2x_6ojd, accesstoSizeXkaWNTQjd accesstosizexkawntqjd, androidx.navigation.NavArgsLazy navArgsLazy, String str) {
        accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite;
        byte b;
        float fIconCompatParcelizer;
        float fIconCompatParcelizer2;
        accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite2;
        boolean z;
        boolean z2;
        byte b2;
        byte b3;
        boolean z3;
        byte b4;
        byte b5;
        boolean z4;
        boolean z5 = drawbehind.MediaBrowserCompatMediaItem;
        DropShadowScope dropShadowScopeRemoteActionCompatParcelizer = accesstopxr2x_6ojd.RemoteActionCompatParcelizer(str);
        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd = dropShadowScopeRemoteActionCompatParcelizer instanceof accessroundToPxR2X_6ojd ? (accessroundToPxR2X_6ojd) dropShadowScopeRemoteActionCompatParcelizer : null;
        if (accessroundtopxr2x_6ojd != null && accessroundtopxr2x_6ojd.RemoteActionCompatParcelizer.size() > 1) {
            String strWrite = accessroundtopxr2x_6ojd.write(0);
            DropShadowScope dropShadowScopeSerializer = accessroundtopxr2x_6ojd.serializer(1);
            String strWrite2 = dropShadowScopeSerializer instanceof accesstoDpSizekrfVVMjd ? dropShadowScopeSerializer.write() : null;
            float fIconCompatParcelizer3 = 0.0f;
            if (accessroundtopxr2x_6ojd.RemoteActionCompatParcelizer.size() > 2) {
                fIconCompatParcelizer = drawbehind.IconCompatParcelizer.IconCompatParcelizer(navArgsLazy.IconCompatParcelizer(accessroundtopxr2x_6ojd.serializer(2)));
            } else {
                fIconCompatParcelizer = 0.0f;
            }
            float f = fIconCompatParcelizer;
            if (accessroundtopxr2x_6ojd.RemoteActionCompatParcelizer.size() > 3) {
                fIconCompatParcelizer2 = drawbehind.IconCompatParcelizer.IconCompatParcelizer(navArgsLazy.IconCompatParcelizer(accessroundtopxr2x_6ojd.serializer(3)));
            } else {
                fIconCompatParcelizer2 = 0.0f;
            }
            if (strWrite.equals("parent")) {
                accesstosizexkawntqjdWrite2 = drawbehind.write(0);
            } else {
                accesstosizexkawntqjdWrite2 = drawbehind.write(strWrite);
            }
            str.getClass();
            switch (str) {
                case "baseline":
                    strWrite2.getClass();
                    int iHashCode = strWrite2.hashCode();
                    if (iHashCode != -1720785339) {
                        if (iHashCode != -1383228885) {
                            if (iHashCode == 115029 && strWrite2.equals("top")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (strWrite2.equals("bottom")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (strWrite2.equals("baseline")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        drawbehind.RemoteActionCompatParcelizer(accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                        drawbehind.RemoteActionCompatParcelizer(accesstosizexkawntqjdWrite2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                        accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.BASELINE_TO_BASELINE;
                        accesstosizexkawntqjd.RemoteActionCompatParcelizer = accesstosizexkawntqjdWrite2;
                    } else if (b2 == 1) {
                        drawbehind.RemoteActionCompatParcelizer(accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                        accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.BASELINE_TO_BOTTOM;
                        accesstosizexkawntqjd.serializer = accesstosizexkawntqjdWrite2;
                    } else if (b2 == 2) {
                        drawbehind.RemoteActionCompatParcelizer(accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                        accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.BASELINE_TO_TOP;
                        accesstosizexkawntqjd.write = accesstosizexkawntqjdWrite2;
                    }
                    z = false;
                    z2 = true;
                    break;
                case "circular":
                    float fIconCompatParcelizer4 = navArgsLazy.IconCompatParcelizer(accessroundtopxr2x_6ojd.read(1));
                    if (accessroundtopxr2x_6ojd.RemoteActionCompatParcelizer.size() > 2) {
                        fIconCompatParcelizer3 = drawbehind.IconCompatParcelizer.IconCompatParcelizer(navArgsLazy.IconCompatParcelizer(accessroundtopxr2x_6ojd.serializer(2)));
                    }
                    accesstosizexkawntqjd.RatingCompat = accesstosizexkawntqjd.RemoteActionCompatParcelizer(accesstosizexkawntqjdWrite2);
                    accesstosizexkawntqjd.MediaDescriptionCompat = fIconCompatParcelizer4;
                    accesstosizexkawntqjd.MediaBrowserCompatMediaItem = fIconCompatParcelizer3;
                    accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.CIRCULAR_CONSTRAINT;
                    z = false;
                    z2 = true;
                    break;
                case "bottom":
                    strWrite2.getClass();
                    int iHashCode2 = strWrite2.hashCode();
                    if (iHashCode2 != -1720785339) {
                        if (iHashCode2 != -1383228885) {
                            if (iHashCode2 == 115029 && strWrite2.equals("top")) {
                                b3 = 2;
                            } else {
                                b3 = -1;
                            }
                        } else if (strWrite2.equals("bottom")) {
                            b3 = 1;
                        } else {
                            b3 = -1;
                        }
                    } else if (strWrite2.equals("baseline")) {
                        b3 = 0;
                    } else {
                        b3 = -1;
                    }
                    if (b3 == 0) {
                        drawbehind.RemoteActionCompatParcelizer(accesstosizexkawntqjdWrite2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                        accesstosizexkawntqjd.getClass();
                        accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.BOTTOM_TO_BASELINE;
                        accesstosizexkawntqjd.IconCompatParcelizer = accesstosizexkawntqjdWrite2;
                    } else if (b3 == 1) {
                        accesstosizexkawntqjd.serializer(accesstosizexkawntqjdWrite2);
                    } else if (b3 == 2) {
                        accesstosizexkawntqjd.getClass();
                        accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.BOTTOM_TO_TOP;
                        accesstosizexkawntqjd.MediaMetadataCompat = accesstosizexkawntqjdWrite2;
                    }
                    z = false;
                    z2 = true;
                    break;
                case "end":
                    z3 = !z5;
                    z2 = z3;
                    z = true;
                    break;
                case "top":
                    strWrite2.getClass();
                    int iHashCode3 = strWrite2.hashCode();
                    if (iHashCode3 != -1720785339) {
                        if (iHashCode3 != -1383228885) {
                            if (iHashCode3 == 115029 && strWrite2.equals("top")) {
                                b4 = 2;
                            } else {
                                b4 = -1;
                            }
                        } else if (strWrite2.equals("bottom")) {
                            b4 = 1;
                        } else {
                            b4 = -1;
                        }
                    } else if (strWrite2.equals("baseline")) {
                        b4 = 0;
                    } else {
                        b4 = -1;
                    }
                    if (b4 == 0) {
                        drawbehind.RemoteActionCompatParcelizer(accesstosizexkawntqjdWrite2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                        accesstosizexkawntqjd.getClass();
                        accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.TOP_TO_BASELINE;
                        accesstosizexkawntqjd.addOnNewIntentListener = accesstosizexkawntqjdWrite2;
                    } else if (b4 == 1) {
                        accesstosizexkawntqjd.getClass();
                        accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.TOP_TO_BOTTOM;
                        accesstosizexkawntqjd.addOnContextAvailableListener = accesstosizexkawntqjdWrite2;
                    } else if (b4 == 2) {
                        accesstosizexkawntqjd.read(accesstosizexkawntqjdWrite2);
                    }
                    z = false;
                    z2 = true;
                    break;
                case "left":
                    z3 = true;
                    z2 = z3;
                    z = true;
                    break;
                case "right":
                    z3 = false;
                    z2 = z3;
                    z = true;
                    break;
                case "start":
                    z3 = z5;
                    z2 = z3;
                    z = true;
                    break;
                default:
                    z = false;
                    z2 = true;
                    break;
            }
            if (z) {
                strWrite2.getClass();
                int iHashCode4 = strWrite2.hashCode();
                if (iHashCode4 != 100571) {
                    if (iHashCode4 != 108511772) {
                        if (iHashCode4 == 109757538 && strWrite2.equals("start")) {
                            b5 = 2;
                        } else {
                            b5 = -1;
                        }
                    } else if (strWrite2.equals("right")) {
                        b5 = 1;
                    } else {
                        b5 = -1;
                    }
                } else if (strWrite2.equals("end")) {
                    b5 = 0;
                } else {
                    b5 = -1;
                }
                if (b5 == 0) {
                    z4 = !z5;
                } else if (b5 != 1) {
                    z4 = b5 != 2 ? true : z5;
                } else {
                    z4 = false;
                }
                if (z2) {
                    if (z4) {
                        accesstosizexkawntqjd.getClass();
                        accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.LEFT_TO_LEFT;
                        accesstosizexkawntqjd.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = accesstosizexkawntqjdWrite2;
                    } else {
                        accesstosizexkawntqjd.getClass();
                        accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.LEFT_TO_RIGHT;
                        accesstosizexkawntqjd.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = accesstosizexkawntqjdWrite2;
                    }
                } else if (z4) {
                    accesstosizexkawntqjd.getClass();
                    accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.RIGHT_TO_LEFT;
                    accesstosizexkawntqjd.getSavedStateRegistryControllerannotations = accesstosizexkawntqjdWrite2;
                } else {
                    accesstosizexkawntqjd.getClass();
                    accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.RIGHT_TO_RIGHT;
                    accesstosizexkawntqjd.fullyDrawnReporter_delegatelambda00 = accesstosizexkawntqjdWrite2;
                }
            }
            accesstosizexkawntqjd.IconCompatParcelizer(Float.valueOf(f)).read(Float.valueOf(fIconCompatParcelizer2));
            return;
        }
        String strWrite3 = accesstopxr2x_6ojd.write(str);
        if (strWrite3 != null) {
            if (strWrite3.equals("parent")) {
                accesstosizexkawntqjdWrite = drawbehind.write(0);
            } else {
                accesstosizexkawntqjdWrite = drawbehind.write(strWrite3);
            }
            str.getClass();
            switch (str) {
                case "baseline":
                    b = 0;
                    break;
                case "bottom":
                    b = 1;
                    break;
                case "end":
                    b = 2;
                    break;
                case "top":
                    b = 3;
                    break;
                case "start":
                    b = 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                drawbehind.RemoteActionCompatParcelizer(accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                drawbehind.RemoteActionCompatParcelizer(accesstosizexkawntqjdWrite.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.BASELINE_TO_BASELINE;
                accesstosizexkawntqjd.RemoteActionCompatParcelizer = accesstosizexkawntqjdWrite;
                return;
            }
            if (b == 1) {
                accesstosizexkawntqjd.serializer(accesstosizexkawntqjdWrite);
                return;
            }
            if (b == 2) {
                if (z5) {
                    accesstosizexkawntqjd.getClass();
                    accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.RIGHT_TO_RIGHT;
                    accesstosizexkawntqjd.fullyDrawnReporter_delegatelambda00 = accesstosizexkawntqjdWrite;
                    return;
                } else {
                    accesstosizexkawntqjd.getClass();
                    accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.LEFT_TO_LEFT;
                    accesstosizexkawntqjd.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = accesstosizexkawntqjdWrite;
                    return;
                }
            }
            if (b == 3) {
                accesstosizexkawntqjd.read(accesstosizexkawntqjdWrite);
                return;
            }
            if (b != 4) {
                return;
            }
            if (z5) {
                accesstosizexkawntqjd.getClass();
                accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.LEFT_TO_LEFT;
                accesstosizexkawntqjd.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = accesstosizexkawntqjdWrite;
            } else {
                accesstosizexkawntqjd.getClass();
                accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.RIGHT_TO_RIGHT;
                accesstosizexkawntqjd.fullyDrawnReporter_delegatelambda00 = accesstosizexkawntqjdWrite;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x015c  */
    /* JADX WARN: Code duplicated, block: B:123:0x019c  */
    /* JADX WARN: Code duplicated, block: B:195:0x02d1  */
    public static void read(drawBehind drawbehind, accesstoPxR2X_6ojd accesstopxr2x_6ojd, accesstoSizeXkaWNTQjd accesstosizexkawntqjd, androidx.navigation.NavArgsLazy navArgsLazy, String str) {
        accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite;
        accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite2;
        long j;
        byte b;
        int i;
        accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite3;
        byte b2;
        str.getClass();
        switch (str) {
            case "centerVertically":
                String strIconCompatParcelizer = accesstopxr2x_6ojd.IconCompatParcelizer(str);
                if (strIconCompatParcelizer.equals("parent")) {
                    accesstosizexkawntqjdWrite = drawbehind.write(0);
                } else {
                    accesstosizexkawntqjdWrite = drawbehind.write(strIconCompatParcelizer);
                }
                accesstosizexkawntqjd.read(accesstosizexkawntqjdWrite);
                accesstosizexkawntqjd.serializer(accesstosizexkawntqjdWrite);
                return;
            case "center":
                String strIconCompatParcelizer2 = accesstopxr2x_6ojd.IconCompatParcelizer(str);
                if (strIconCompatParcelizer2.equals("parent")) {
                    accesstosizexkawntqjdWrite2 = drawbehind.write(0);
                } else {
                    accesstosizexkawntqjdWrite2 = drawbehind.write(strIconCompatParcelizer2);
                }
                accesstosizexkawntqjd.write(accesstosizexkawntqjdWrite2);
                accesstosizexkawntqjd.IconCompatParcelizer(accesstosizexkawntqjdWrite2);
                accesstosizexkawntqjd.read(accesstosizexkawntqjdWrite2);
                accesstosizexkawntqjd.serializer(accesstosizexkawntqjdWrite2);
                return;
            case "custom":
                DropShadowScope dropShadowScopeRemoteActionCompatParcelizer = accesstopxr2x_6ojd.RemoteActionCompatParcelizer(str);
                accesstoPxR2X_6ojd accesstopxr2x_6ojd2 = dropShadowScopeRemoteActionCompatParcelizer instanceof accesstoPxR2X_6ojd ? (accesstoPxR2X_6ojd) dropShadowScopeRemoteActionCompatParcelizer : null;
                if (accesstopxr2x_6ojd2 == null) {
                    return;
                }
                for (String str2 : accesstopxr2x_6ojd2.serializer()) {
                    DropShadowScope dropShadowScope = accesstopxr2x_6ojd2.read(str2);
                    if (dropShadowScope instanceof accesstoRectjd) {
                        float fIconCompatParcelizer = dropShadowScope.IconCompatParcelizer();
                        if (accesstosizexkawntqjd.MediaSessionCompatResultReceiverWrapper == null) {
                            accesstosizexkawntqjd.MediaSessionCompatResultReceiverWrapper = new HashMap();
                        }
                        accesstosizexkawntqjd.MediaSessionCompatResultReceiverWrapper.put(str2, Float.valueOf(fIconCompatParcelizer));
                    } else if (dropShadowScope instanceof accesstoDpSizekrfVVMjd) {
                        String strWrite = dropShadowScope.write();
                        if (strWrite.startsWith("#")) {
                            String strSubstring = strWrite.substring(1);
                            if (strSubstring.length() == 6) {
                                strSubstring = "FF".concat(strSubstring);
                            }
                            j = Long.parseLong(strSubstring, 16);
                        } else {
                            j = -1;
                        }
                        if (j != -1) {
                            accesstosizexkawntqjd.MediaSessionCompatToken.put(str2, Integer.valueOf((int) j));
                        }
                    }
                }
                return;
            case "rotationX":
                accesstosizexkawntqjd.getOnBackPressedInput = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "rotationY":
                accesstosizexkawntqjd.menuHostHelperlambda0 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "rotationZ":
                accesstosizexkawntqjd.fullyDrawnReporter_delegatelambda0 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "translationX":
                accesstosizexkawntqjd.addOnConfigurationChangedListener = drawbehind.IconCompatParcelizer.IconCompatParcelizer(navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str)));
                return;
            case "translationY":
                accesstosizexkawntqjd.addMenuProvider = drawbehind.IconCompatParcelizer.IconCompatParcelizer(navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str)));
                return;
            case "translationZ":
                accesstosizexkawntqjd.addOnPictureInPictureUiStateChangedListener = drawbehind.IconCompatParcelizer.IconCompatParcelizer(navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str)));
                return;
            case "height":
                accesstosizexkawntqjd.addOnUserLeaveHintListener = IconCompatParcelizer(accesstopxr2x_6ojd, str, drawbehind, drawbehind.IconCompatParcelizer);
                return;
            case "motion":
                DropShadowScope dropShadowScope2 = accesstopxr2x_6ojd.read(str);
                if (dropShadowScope2 instanceof accesstoPxR2X_6ojd) {
                    accesstoPxR2X_6ojd accesstopxr2x_6ojd3 = (accesstoPxR2X_6ojd) dropShadowScope2;
                    accessroundToPx0680j_4jd accessroundtopx0680j_4jd = new accessroundToPx0680j_4jd();
                    accessroundtopx0680j_4jd.RemoteActionCompatParcelizer = new int[10];
                    accessroundtopx0680j_4jd.MediaDescriptionCompat = new int[10];
                    accessroundtopx0680j_4jd.read = 0;
                    accessroundtopx0680j_4jd.IconCompatParcelizer = new int[10];
                    accessroundtopx0680j_4jd.MediaSessionCompatQueueItem = new float[10];
                    accessroundtopx0680j_4jd.serializer = 0;
                    accessroundtopx0680j_4jd.MediaMetadataCompat = new int[5];
                    accessroundtopx0680j_4jd.RatingCompat = new String[5];
                    accessroundtopx0680j_4jd.write = 0;
                    for (String str3 : accesstopxr2x_6ojd3.serializer()) {
                        str3.getClass();
                        switch (str3) {
                            case "stagger":
                                b = 0;
                                break;
                            case "easing":
                                b = 1;
                                break;
                            case "quantize":
                                b = 2;
                                break;
                            case "pathArc":
                                b = 3;
                                break;
                            case "relativeTo":
                                b = 4;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 0) {
                            accessroundtopx0680j_4jd.IconCompatParcelizer(accesstopxr2x_6ojd3.serializer(str3), 600);
                        } else if (b == 1) {
                            accessroundtopx0680j_4jd.read(603, accesstopxr2x_6ojd3.IconCompatParcelizer(str3));
                        } else if (b == 2) {
                            DropShadowScope dropShadowScope3 = accesstopxr2x_6ojd3.read(str3);
                            if (dropShadowScope3 instanceof accessroundToPxR2X_6ojd) {
                                accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd = (accessroundToPxR2X_6ojd) dropShadowScope3;
                                int size = accessroundtopxr2x_6ojd.RemoteActionCompatParcelizer.size();
                                if (size > 0) {
                                    accessroundtopx0680j_4jd.IconCompatParcelizer(610, accessroundtopxr2x_6ojd.IconCompatParcelizer(0));
                                    if (size > 1) {
                                        accessroundtopx0680j_4jd.read(611, accessroundtopxr2x_6ojd.write(1));
                                        if (size > 2) {
                                            accessroundtopx0680j_4jd.IconCompatParcelizer(accessroundtopxr2x_6ojd.RemoteActionCompatParcelizer(2), 602);
                                        }
                                    }
                                }
                            } else {
                                DropShadowScope dropShadowScope4 = accesstopxr2x_6ojd3.read(str3);
                                if (dropShadowScope4 != null) {
                                    accessroundtopx0680j_4jd.IconCompatParcelizer(610, dropShadowScope4.MediaMetadataCompat());
                                } else {
                                    StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("no int found for key <", str3, ">, found [");
                                    sbM.append(dropShadowScope4.RatingCompat());
                                    sbM.append("] : ");
                                    sbM.append(dropShadowScope4);
                                    throw new androidx.constraintlayout.core.parser.CLParsingException(sbM.toString(), accesstopxr2x_6ojd3);
                                }
                            }
                        } else if (b == 3) {
                            String strIconCompatParcelizer3 = accesstopxr2x_6ojd3.IconCompatParcelizer(str3);
                            String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                            int i2 = 0;
                            while (true) {
                                if (i2 >= 6) {
                                    i = -1;
                                    i2 = -1;
                                } else if (strArr[i2].equals(strIconCompatParcelizer3)) {
                                    i = -1;
                                } else {
                                    i2++;
                                }
                            }
                            if (i2 == i) {
                                System.err.println("0 pathArc = '" + strIconCompatParcelizer3 + "'");
                            } else {
                                accessroundtopx0680j_4jd.IconCompatParcelizer(607, i2);
                            }
                        } else if (b == 4) {
                            accessroundtopx0680j_4jd.read(605, accesstopxr2x_6ojd3.IconCompatParcelizer(str3));
                        }
                    }
                    accesstosizexkawntqjd.getClass();
                    return;
                }
                return;
            case "pivotX":
                accesstosizexkawntqjd.defaultViewModelProviderFactory_delegatelambda0 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "pivotY":
                accesstosizexkawntqjd.addObserverForBackInvokerlambda0 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "scaleX":
                accesstosizexkawntqjd.onBackPressedDispatcher_delegatelambda0 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "scaleY":
                accesstosizexkawntqjd.onBackPressedInput_delegatelambda0 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "hRtlBias":
                float fIconCompatParcelizer2 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                if (!drawbehind.MediaBrowserCompatMediaItem) {
                    fIconCompatParcelizer2 = 1.0f - fIconCompatParcelizer2;
                }
                accesstosizexkawntqjd.ResultReceiver = fIconCompatParcelizer2;
                return;
            case "vWeight":
                accesstosizexkawntqjd.addOnTrimMemoryListener = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "alpha":
                accesstosizexkawntqjd.read = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "hBias":
                accesstosizexkawntqjd.ResultReceiver = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "vBias":
                accesstosizexkawntqjd.enterPictureInPictureMode = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "width":
                accesstosizexkawntqjd.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = IconCompatParcelizer(accesstopxr2x_6ojd, str, drawbehind, drawbehind.IconCompatParcelizer);
                return;
            case "hWeight":
                accesstosizexkawntqjd.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd.read(str));
                return;
            case "centerHorizontally":
                String strIconCompatParcelizer4 = accesstopxr2x_6ojd.IconCompatParcelizer(str);
                if (strIconCompatParcelizer4.equals("parent")) {
                    accesstosizexkawntqjdWrite3 = drawbehind.write(0);
                } else {
                    accesstosizexkawntqjdWrite3 = drawbehind.write(strIconCompatParcelizer4);
                }
                accesstosizexkawntqjd.write(accesstosizexkawntqjdWrite3);
                accesstosizexkawntqjd.IconCompatParcelizer(accesstosizexkawntqjdWrite3);
                return;
            case "visibility":
                String strIconCompatParcelizer5 = accesstopxr2x_6ojd.IconCompatParcelizer(str);
                int iHashCode = strIconCompatParcelizer5.hashCode();
                if (iHashCode != -1901805651) {
                    if (iHashCode != 3178655) {
                        if (iHashCode == 466743410 && strIconCompatParcelizer5.equals("visible")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (strIconCompatParcelizer5.equals("gone")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (strIconCompatParcelizer5.equals("invisible")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    accesstosizexkawntqjd.getDefaultViewModelCreationExtras = 4;
                    accesstosizexkawntqjd.read = 0.0f;
                    return;
                } else {
                    if (b2 != 1) {
                        if (b2 != 2) {
                            return;
                        }
                        accesstosizexkawntqjd.getDefaultViewModelCreationExtras = 0;
                        return;
                    }
                    accesstosizexkawntqjd.getDefaultViewModelCreationExtras = 8;
                    return;
                }
            default:
                IconCompatParcelizer(drawbehind, accesstopxr2x_6ojd, accesstosizexkawntqjd, navArgsLazy, str);
                return;
        }
    }
}
