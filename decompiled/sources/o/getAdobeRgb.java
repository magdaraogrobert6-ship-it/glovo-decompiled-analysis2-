package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getAdobeRgb {
    public final float ComponentActivity;
    public final getExponentimpl IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final List MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final getBt2020PqTransferParametersui_graphics MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final float ParcelableVolumeInfo;
    public final long PlaybackStateCompat;
    public final float PlaybackStateCompatCustomAction;
    public final getBt2020Pq RatingCompat;
    public final com.airbnb.lottie.parser.DropShadowEffect RemoteActionCompatParcelizer;
    public final int ResultReceiver;
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final List r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final ColorSpaceKt r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final xyzaToColorJlNiLsgui_graphics r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final toXyz r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final accessgetGreencp r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final float r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final createConnectorYBCOT_4 read;
    public final boolean serializer;
    public final StrokeJoinCompanion write;

    public getAdobeRgb(List list, StrokeJoinCompanion strokeJoinCompanion, String str, long j, getBt2020Pq getbt2020pq, long j2, String str2, List list2, ColorSpaceKt colorSpaceKt, int i, int i2, int i3, float f, float f2, float f3, float f4, xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics, accessgetGreencp accessgetgreencp, List list3, getBt2020PqTransferParametersui_graphics getbt2020pqtransferparametersui_graphics, toXyz toxyz, boolean z, getExponentimpl getexponentimpl, com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect, createConnectorYBCOT_4 createconnectorybcot_4) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = list;
        this.write = strokeJoinCompanion;
        this.MediaBrowserCompatMediaItem = str;
        this.MediaMetadataCompat = j;
        this.RatingCompat = getbt2020pq;
        this.PlaybackStateCompat = j2;
        this.MediaSessionCompatToken = str2;
        this.MediaSessionCompatQueueItem = list2;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = colorSpaceKt;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2;
        this.ResultReceiver = i3;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = f;
        this.ComponentActivity = f2;
        this.ParcelableVolumeInfo = f3;
        this.PlaybackStateCompatCustomAction = f4;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = xyzatocolorjlnilsgui_graphics;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = accessgetgreencp;
        this.MediaDescriptionCompat = list3;
        this.MediaSessionCompatResultReceiverWrapper = getbt2020pqtransferparametersui_graphics;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toxyz;
        this.serializer = z;
        this.IconCompatParcelizer = getexponentimpl;
        this.RemoteActionCompatParcelizer = dropShadowEffect;
        this.read = createconnectorybcot_4;
    }

    public final String RemoteActionCompatParcelizer(String str) {
        int i;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str);
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append("\n");
        long j = this.PlaybackStateCompat;
        StrokeJoinCompanion strokeJoinCompanion = this.write;
        getAdobeRgb getadobergb = (getAdobeRgb) strokeJoinCompanion.RatingCompat.write(j);
        if (getadobergb != null) {
            sbM.append("\t\tParents: ");
            sbM.append(getadobergb.MediaBrowserCompatMediaItem);
            for (getAdobeRgb getadobergb2 = (getAdobeRgb) strokeJoinCompanion.RatingCompat.write(getadobergb.PlaybackStateCompat); getadobergb2 != null; getadobergb2 = (getAdobeRgb) strokeJoinCompanion.RatingCompat.write(getadobergb2.PlaybackStateCompat)) {
                sbM.append("->");
                sbM.append(getadobergb2.MediaBrowserCompatMediaItem);
            }
            sbM.append(str);
            sbM.append("\n");
        }
        List list = this.MediaSessionCompatQueueItem;
        if (!list.isEmpty()) {
            sbM.append(str);
            sbM.append("\tMasks: ");
            sbM.append(list.size());
            sbM.append("\n");
        }
        int i2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (i2 != 0 && (i = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) != 0) {
            sbM.append(str);
            sbM.append("\tBackground: ");
            sbM.append(String.format(java.util.Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.ResultReceiver)));
        }
        List list2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (!list2.isEmpty()) {
            sbM.append(str);
            sbM.append("\tShapes:\n");
            for (Object obj : list2) {
                sbM.append(str);
                sbM.append("\t\t");
                sbM.append(obj);
                sbM.append("\n");
            }
        }
        return sbM.toString();
    }

    public final String toString() {
        return RemoteActionCompatParcelizer("");
    }
}
