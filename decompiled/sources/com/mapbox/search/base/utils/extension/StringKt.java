package com.mapbox.search.base.utils.extension;

import android.util.Size;
import java.util.HashMap;
import o.AeFpsRangeQuirk;
import o.CaptureFailedRetryQuirk;
import o.ImageCaptureFailedForSpecificCombinationQuirk;
import o.ImageCaptureRotationOptionQuirk;
import o.SoftwareJpegEncodingPreferredQuirk;
import o.TemporalNoiseQuirk;
import o.setController;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StringKt {
    public static final String nullIfEmpty(String str) {
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    public static ImageCaptureRotationOptionQuirk RemoteActionCompatParcelizer(int i, Size size, TemporalNoiseQuirk temporalNoiseQuirk, int i2, CaptureFailedRetryQuirk captureFailedRetryQuirk, AeFpsRangeQuirk aeFpsRangeQuirk) {
        size.getClass();
        temporalNoiseQuirk.getClass();
        HashMap map = temporalNoiseQuirk.IconCompatParcelizer;
        captureFailedRetryQuirk.getClass();
        aeFpsRangeQuirk.getClass();
        SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk = (SoftwareJpegEncodingPreferredQuirk) ImageCaptureRotationOptionQuirk.write.get(Integer.valueOf(i));
        if (softwareJpegEncodingPreferredQuirk == null) {
            softwareJpegEncodingPreferredQuirk = SoftwareJpegEncodingPreferredQuirk.PRIV;
        }
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.NOT_SUPPORT;
        Size size2 = setController.MediaDescriptionCompat;
        int height = size.getHeight() * size.getWidth();
        if (i2 == 1) {
            if (height <= setController.write((Size) temporalNoiseQuirk.MediaMetadataCompat.get(Integer.valueOf(i)))) {
                imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.S720P_16_9;
            } else if (height <= setController.write((Size) temporalNoiseQuirk.MediaBrowserCompatMediaItem.get(Integer.valueOf(i)))) {
                imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.S1440P_4_3;
            }
        } else if (captureFailedRetryQuirk == CaptureFailedRetryQuirk.FEATURE_COMBINATION_TABLE) {
            Size size3 = (Size) map.get(Integer.valueOf(i));
            for (ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk2 : ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer) {
                if (size.equals(imageCaptureFailedForSpecificCombinationQuirk2.getRelatedFixedSize())) {
                    imageCaptureFailedForSpecificCombinationQuirk = imageCaptureFailedForSpecificCombinationQuirk2;
                    break;
                }
            }
            if (imageCaptureFailedForSpecificCombinationQuirk == ImageCaptureFailedForSpecificCombinationQuirk.NOT_SUPPORT && size.equals(size3)) {
                imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM;
            }
        } else if (height <= setController.write(temporalNoiseQuirk.write)) {
            imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.VGA;
        } else if (height <= setController.write(temporalNoiseQuirk.read)) {
            imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.PREVIEW;
        } else if (height <= setController.write(temporalNoiseQuirk.RatingCompat)) {
            imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.RECORD;
        } else {
            Size size4 = (Size) map.get(Integer.valueOf(i));
            Size size5 = (Size) temporalNoiseQuirk.MediaSessionCompatQueueItem.get(Integer.valueOf(i));
            if (size4 != null) {
                if (height <= size4.getHeight() * size4.getWidth()) {
                    if (i2 != 2) {
                        imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM;
                    } else if (size5 != null) {
                        if (height <= size5.getHeight() * size5.getWidth()) {
                            imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.ULTRA_MAXIMUM;
                        }
                    }
                } else if (size5 != null) {
                    if (height <= size5.getHeight() * size5.getWidth()) {
                        imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.ULTRA_MAXIMUM;
                    }
                }
            } else if (i2 != 2) {
                imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM;
            } else if (size5 != null) {
                if (height <= size5.getHeight() * size5.getWidth()) {
                    imageCaptureFailedForSpecificCombinationQuirk = ImageCaptureFailedForSpecificCombinationQuirk.ULTRA_MAXIMUM;
                }
            }
        }
        return serializer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk, aeFpsRangeQuirk);
    }

    public static ImageCaptureRotationOptionQuirk serializer(SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk, ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk, AeFpsRangeQuirk aeFpsRangeQuirk) {
        softwareJpegEncodingPreferredQuirk.getClass();
        imageCaptureFailedForSpecificCombinationQuirk.getClass();
        aeFpsRangeQuirk.getClass();
        return new ImageCaptureRotationOptionQuirk(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk, aeFpsRangeQuirk);
    }
}
