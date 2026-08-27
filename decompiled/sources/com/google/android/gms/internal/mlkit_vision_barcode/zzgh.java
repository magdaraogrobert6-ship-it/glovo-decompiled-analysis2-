package com.google.android.gms.internal.mlkit_vision_barcode;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import androidx.compose.ui.graphics.Fields;
import com.adjust.sdk.Constants;
import com.huawei.hms.android.SystemUtils;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationContainerFragment;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationParams;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import o.dispatchRotaryEvent;
import o.getRelatedFixedSize;
import o.getThumbTintList;
import o.getValue;
import o.setInflatedId;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgh {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static BookShiftConfirmationContainerFragment serializer(BookShiftConfirmationParams bookShiftConfirmationParams) {
        int i = 2 % 2;
        BookShiftConfirmationContainerFragment bookShiftConfirmationContainerFragment = new BookShiftConfirmationContainerFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("book_shift_confirmation_params", bookShiftConfirmationParams);
        bundle.putString("book_shift_confirmation_flow_request_key", "book_shift_confirmation_flow_request_key");
        bookShiftConfirmationContainerFragment.setArguments(bundle);
        int i2 = serializer + 93;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return bookShiftConfirmationContainerFragment;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x021a  */
    /* JADX WARN: Code duplicated, block: B:123:0x022a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0369  */
    /* JADX WARN: Code duplicated, block: B:302:0x0532  */
    /* JADX WARN: Code duplicated, block: B:315:0x0574  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    public static u$a read(getThumbTintList getthumbtintlist) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i = 2 % 2;
        getValue getvalue = getValue.IconCompatParcelizer;
        getvalue.getClass();
        try {
            getRelatedFixedSize getrelatedfixedsize = (getRelatedFixedSize) getvalue.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().get();
            ArrayList arrayList = new ArrayList();
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num = (Integer) getthumbtintlist.write(key);
            boolean z12 = false;
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(AeFpsRangeLegacyQuirk.class, num != null && num.intValue() == 2)) {
                arrayList.add(new AeFpsRangeLegacyQuirk(getthumbtintlist));
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(AspectRatioLegacyApi21Quirk.class, false)) {
                arrayList.add(new AspectRatioLegacyApi21Quirk());
            }
            HashSet hashSet = JpegHalCorruptImageQuirk.RemoteActionCompatParcelizer;
            String str = Build.DEVICE;
            Locale locale = Locale.US;
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(JpegHalCorruptImageQuirk.class, hashSet.contains(str.toLowerCase(locale)))) {
                arrayList.add(new JpegHalCorruptImageQuirk());
            }
            HashSet hashSet2 = JpegCaptureDownsizingQuirk.serializer;
            String str2 = Build.MODEL;
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(JpegCaptureDownsizingQuirk.class, hashSet2.contains(str2.toLowerCase(locale)) && ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new JpegCaptureDownsizingQuirk());
            }
            Integer num2 = (Integer) getthumbtintlist.write(key);
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(CamcorderProfileResolutionQuirk.class, num2 != null && num2.intValue() == 2)) {
                arrayList.add(new CamcorderProfileResolutionQuirk(getthumbtintlist));
            }
            String str3 = Build.HARDWARE;
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(CaptureNoResponseQuirk.class, ("samsungexynos7420".equalsIgnoreCase(str3) || "universal7420".equalsIgnoreCase(str3)) && ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CaptureNoResponseQuirk());
            }
            Integer num3 = (Integer) getthumbtintlist.write(key);
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(LegacyCameraOutputConfigNullPointerQuirk.class, num3 != null && num3.intValue() == 2)) {
                arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
            }
            Object obj = null;
            if (Build.VERSION.SDK_INT < 29) {
                int i2 = serializer + 79;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                Integer num4 = (Integer) getthumbtintlist.write(key);
                if (num4 == null || num4.intValue() != 2) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(LegacyCameraSurfaceCleanupQuirk.class, z)) {
                arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
            }
            if (ImageCaptureWashedOutImageQuirk.write.contains(str2.toUpperCase(locale)) && ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                int i3 = IconCompatParcelizer + 73;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ImageCaptureWashedOutImageQuirk.class, z2)) {
                arrayList.add(new ImageCaptureWashedOutImageQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.IconCompatParcelizer.contains(str2.toUpperCase(locale)) && ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
            }
            String str4 = Build.BRAND;
            if (("motorola".equalsIgnoreCase(str4) && "MotoG3".equalsIgnoreCase(str2)) || ((Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str4) && "SM-G532F".equalsIgnoreCase(str2)) || ((Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str4) && "SM-J700F".equalsIgnoreCase(str2)) || (!(!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str4)) && "SM-A920F".equalsIgnoreCase(str2))))) {
                z3 = true;
            } else if (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str4)) {
                int i5 = serializer + 91;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    "SM-J415F".equalsIgnoreCase(str2);
                    obj.hashCode();
                    throw null;
                }
                if ("SM-J415F".equalsIgnoreCase(str2)) {
                    z3 = true;
                } else if (Constants.REFERRER_API_XIAOMI.equalsIgnoreCase(str4) || !"Mi A1".equalsIgnoreCase(str2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                if (Constants.REFERRER_API_XIAOMI.equalsIgnoreCase(str4)) {
                }
                z3 = false;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(YuvImageOnePixelShiftQuirk.class, z3)) {
                arrayList.add(new YuvImageOnePixelShiftQuirk());
            }
            Iterator it = FlashTooSlowQuirk.read.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                        int i6 = IconCompatParcelizer + 27;
                        serializer = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0 ? ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 1 : ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                            z4 = true;
                            break;
                        }
                        break;
                    }
                }
                z4 = false;
                break;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(FlashTooSlowQuirk.class, z4)) {
                arrayList.add(new FlashTooSlowQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(AfRegionFlipHorizontallyQuirk.class, Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new AfRegionFlipHorizontallyQuirk());
            }
            CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num5 = (Integer) getthumbtintlist.write(key2);
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ConfigureSurfaceToSecondarySessionFailQuirk.class, num5 != null && num5.intValue() == 2)) {
                arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
            }
            Integer num6 = (Integer) getthumbtintlist.write(key2);
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(PreviewOrientationIncorrectQuirk.class, num6 != null && num6.intValue() == 2)) {
                arrayList.add(new PreviewOrientationIncorrectQuirk());
            }
            Integer num7 = (Integer) getthumbtintlist.write(key2);
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(CaptureSessionStuckQuirk.class, num7 != null && num7.intValue() == 2)) {
                arrayList.add(new CaptureSessionStuckQuirk());
            }
            List list = ImageCaptureFlashNotFireQuirk.write;
            String str5 = Build.MODEL;
            Locale locale2 = Locale.US;
            boolean z13 = list.contains(str5.toLowerCase(locale2)) && ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 0;
            boolean zContains = ImageCaptureFlashNotFireQuirk.read.contains(str5.toLowerCase(locale2));
            if (z13) {
                z5 = true;
            } else {
                int i7 = serializer + 49;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (zContains) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ImageCaptureFlashNotFireQuirk.class, z5)) {
                arrayList.add(new ImageCaptureFlashNotFireQuirk());
            }
            if (ImageCaptureWithFlashUnderexposureQuirk.IconCompatParcelizer.contains(str5.toLowerCase(locale2)) && ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                int i9 = serializer + 105;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                z6 = true;
            } else {
                z6 = false;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ImageCaptureWithFlashUnderexposureQuirk.class, z6)) {
                arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.write.contains(str5.toLowerCase(locale2)) && ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
            }
            Integer num8 = (Integer) getthumbtintlist.write(key2);
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(IncorrectCaptureStateQuirk.class, num8 != null && num8.intValue() == 2)) {
                arrayList.add(new IncorrectCaptureStateQuirk());
            }
            Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.serializer.iterator();
            while (true) {
                if (!(!it2.hasNext())) {
                    if (Build.MODEL.toUpperCase(Locale.US).equals((String) it2.next())) {
                        int i11 = IconCompatParcelizer + 29;
                        serializer = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 == 0) {
                            ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue();
                            throw null;
                        }
                        if (((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                            z7 = true;
                            break;
                        }
                    }
                }
                z7 = false;
                break;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(TorchFlashRequiredFor3aUpdateQuirk.class, z7)) {
                arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(getthumbtintlist));
            }
            String str6 = Build.MANUFACTURER;
            if (SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str6) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) {
                z8 = true;
            } else {
                if ("Samsung".equalsIgnoreCase(str6) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) {
                    int i12 = serializer + 123;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                } else if ((!"Samsung".equalsIgnoreCase(str6) || !"sm-j700f".equalsIgnoreCase(Build.MODEL)) && ((!"Samsung".equalsIgnoreCase(str6) || !"sm-j111f".equalsIgnoreCase(Build.MODEL)) && ((!"OPPO".equalsIgnoreCase(str6) || !"A37F".equalsIgnoreCase(Build.MODEL)) && ((!"Samsung".equalsIgnoreCase(str6)) || !"sm-j510fn".equalsIgnoreCase(Build.MODEL))))) {
                    z8 = false;
                }
                z8 = true;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, z8)) {
                arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, "Huawei".equalsIgnoreCase(str6))) {
                arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
            }
            if (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.read() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaBrowserCompatMediaItem() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.serializer()) {
                z9 = true;
            } else {
                String str7 = Build.MODEL;
                if (("pixel 4 xl".equalsIgnoreCase(str7) && Build.VERSION.SDK_INT == 29) || (("motorola".equalsIgnoreCase(Build.BRAND) && "moto e13".equalsIgnoreCase(str7)) || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.write() || dispatchRotaryEvent.IconCompatParcelizer())) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z9)) {
                arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
            }
            String str8 = Build.MODEL;
            if ("Pixel 8".equalsIgnoreCase(str8)) {
                int i14 = serializer + 79;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    ((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue();
                    throw null;
                }
                if (((Integer) getthumbtintlist.write(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(TemporalNoiseQuirk.class, z10)) {
                arrayList.add(new TemporalNoiseQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.serializer())) {
                arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
            }
            String str9 = Build.BRAND;
            if ("motorola".equalsIgnoreCase(str9) && "moto e20".equalsIgnoreCase(str8) && getthumbtintlist.serializer.equals("1")) {
                int i15 = IconCompatParcelizer + 97;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                z11 = true;
            } else {
                z11 = false;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, z11)) {
                arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
            }
            if (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str9) && !(!Build.DEVICE.equalsIgnoreCase("m55xq"))) {
                z12 = true;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, z12)) {
                arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
            }
            u$a u_a = new u$a(arrayList);
            u$a.write(u_a);
            setInflatedId.IconCompatParcelizer(3, "CameraQuirks");
            return u_a;
        } catch (InterruptedException | ExecutionException e) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
        }
    }
}
