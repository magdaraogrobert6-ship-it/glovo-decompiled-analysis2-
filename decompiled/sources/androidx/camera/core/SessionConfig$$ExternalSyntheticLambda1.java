package androidx.camera.core;

import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import com.adjust.sdk.Constants;
import com.huawei.hms.android.SystemUtils;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import o.FocusOwnerImplmodifier1;
import o.HoverableNode;
import o.IncorrectJpegMetadataQuirk;
import o.accesswaitForCompositionAfterTargetStateChange;
import o.getRelatedFixedSize;
import o.getSurfaceProvider;
import o.setInflatedId;
import o.setThumbTintList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SessionConfig$$ExternalSyntheticLambda1 implements FocusOwnerImplmodifier1 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ SessionConfig$$ExternalSyntheticLambda1(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:509:0x082e  */
    /* JADX WARN: Code duplicated, block: B:512:0x0835  */
    /* JADX WARN: Code duplicated, block: B:513:0x0837  */
    /* JADX WARN: Code duplicated, block: B:573:0x095d  */
    /* JADX WARN: Code duplicated, block: B:577:0x096d  */
    /* JADX WARN: Code duplicated, block: B:579:0x097b  */
    /* JADX WARN: Code duplicated, block: B:582:0x0986  */
    /* JADX WARN: Code duplicated, block: B:593:0x09aa  */
    @Override // o.FocusOwnerImplmodifier1
    public final void accept(Object obj) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            getRelatedFixedSize getrelatedfixedsize = (getRelatedFixedSize) obj;
            ArrayList arrayList = new ArrayList();
            List list = ImageCapturePixelHDRPlusQuirk.read;
            String str2 = Build.MODEL;
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ImageCapturePixelHDRPlusQuirk.class, list.contains(str2) && "Google".equals(Build.MANUFACTURER))) {
                arrayList.add(new ImageCapturePixelHDRPlusQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ExtraCroppingQuirk.class, ExtraCroppingQuirk.read())) {
                arrayList.add(new ExtraCroppingQuirk());
            }
            int i2 = Nexus4AndroidLTargetAspectRatioQuirk.IconCompatParcelizer;
            String str3 = Build.BRAND;
            "GOOGLE".equalsIgnoreCase(str3);
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ExcludedSupportedSizesQuirk.class, ("OnePlus".equalsIgnoreCase(str3) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) || ("OnePlus".equalsIgnoreCase(str3) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) || ((SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str3) && "HWANE".equalsIgnoreCase(Build.DEVICE)) || (("SAMSUNG".equalsIgnoreCase(str3) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE)) || (("SAMSUNG".equalsIgnoreCase(str3) && "J7XELTE".equalsIgnoreCase(Build.DEVICE)) || (("REDMI".equalsIgnoreCase(str3) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) || ExcludedSupportedSizesQuirk.RemoteActionCompatParcelizer() || ExcludedSupportedSizesQuirk.serializer())))))) {
                arrayList.add(new ExcludedSupportedSizesQuirk());
            }
            List list2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.read;
            Locale locale = Locale.US;
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list2.contains(str2.toUpperCase(locale)))) {
                arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
            }
            List list3 = PreviewPixelHDRnetQuirk.serializer;
            String str4 = Build.MANUFACTURER;
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(PreviewPixelHDRnetQuirk.class, "Google".equals(str4) && PreviewPixelHDRnetQuirk.serializer.contains(Build.DEVICE.toLowerCase(Locale.getDefault())))) {
                arrayList.add(new PreviewPixelHDRnetQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(StillCaptureFlashStopRepeatingQuirk.class, "SAMSUNG".equals(str4.toUpperCase(locale)) && str2.toUpperCase(locale).startsWith("SM-A716"))) {
                arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
            }
            IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = ExtraSupportedSurfaceCombinationsQuirk.IconCompatParcelizer;
            String str5 = Build.DEVICE;
            if ("heroqltevzw".equalsIgnoreCase(str5) || "heroqltetmo".equalsIgnoreCase(str5)) {
                z = true;
            } else if (Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(str3)) {
                if (ExtraSupportedSurfaceCombinationsQuirk.RemoteActionCompatParcelizer.contains(str2.toUpperCase(locale))) {
                    z = true;
                } else if (ExtraSupportedSurfaceCombinationsQuirk.read()) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (ExtraSupportedSurfaceCombinationsQuirk.read()) {
                z = true;
            } else {
                z = false;
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ExtraSupportedSurfaceCombinationsQuirk.class, z)) {
                arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.write.contains(new Pair(str4.toLowerCase(locale), str2.toLowerCase(locale))))) {
                arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(RepeatingStreamConstraintForVideoRecordingQuirk.class, "Huawei".equalsIgnoreCase(str3) && "mha-l29".equalsIgnoreCase(str2))) {
                arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(TextureViewIsClosedQuirk.class, false)) {
                arrayList.add(new TextureViewIsClosedQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.RemoteActionCompatParcelizer.contains(str2.toLowerCase(locale)))) {
                arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
            }
            List list4 = ZslDisablerQuirk.write;
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ZslDisablerQuirk.class, (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str3) && ZslDisablerQuirk.read(ZslDisablerQuirk.write)) || (Constants.REFERRER_API_XIAOMI.equalsIgnoreCase(str3) && ZslDisablerQuirk.read(ZslDisablerQuirk.IconCompatParcelizer)))) {
                arrayList.add(new ZslDisablerQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(ExtraSupportedOutputSizeQuirk.class, "motorola".equalsIgnoreCase(str3) && "moto e5 play".equalsIgnoreCase(str2))) {
                arrayList.add(new ExtraSupportedOutputSizeQuirk());
            }
            List list5 = InvalidVideoProfilesQuirk.RemoteActionCompatParcelizer;
            if (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str3) && Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a")) {
                z2 = true;
            } else {
                List list6 = InvalidVideoProfilesQuirk.RemoteActionCompatParcelizer;
                Locale locale2 = Locale.ROOT;
                if (list6.contains(str2.toLowerCase(locale2))) {
                    String str6 = Build.ID;
                    if (str6.toLowerCase(locale2).startsWith("tp1a") || str6.toLowerCase(locale2).startsWith("td1a")) {
                        z2 = true;
                    } else if (!"redmi".equalsIgnoreCase(str3) || Constants.REFERRER_API_XIAOMI.equalsIgnoreCase(str3)) {
                        str = Build.ID;
                        if (!str.toLowerCase(locale2).startsWith("tkq1") || str.toLowerCase(locale2).startsWith("tp1a")) {
                            z2 = true;
                        } else if ((!InvalidVideoProfilesQuirk.IconCompatParcelizer.contains(str2.toLowerCase(locale2)) && Build.VERSION.SDK_INT == 33) || (InvalidVideoProfilesQuirk.read.contains(str2.toLowerCase(locale2)) && Build.VERSION.SDK_INT == 33)) {
                            z2 = true;
                        }
                    } else {
                        z2 = !InvalidVideoProfilesQuirk.IconCompatParcelizer.contains(str2.toLowerCase(locale2)) ? false : false;
                    }
                } else {
                    if ("redmi".equalsIgnoreCase(str3)) {
                        str = Build.ID;
                        if (str.toLowerCase(locale2).startsWith("tkq1")) {
                        }
                    } else {
                        str = Build.ID;
                        if (str.toLowerCase(locale2).startsWith("tkq1")) {
                        }
                    }
                    z2 = true;
                }
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(InvalidVideoProfilesQuirk.class, z2)) {
                arrayList.add(new InvalidVideoProfilesQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(Preview3AThreadCrashQuirk.class, "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE))) {
                arrayList.add(new Preview3AThreadCrashQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.read.containsKey(str2.toUpperCase(locale)))) {
                arrayList.add(new SmallDisplaySizeQuirk());
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.serializer)) {
                arrayList.add(PreviewUnderExposureQuirk.IconCompatParcelizer);
            }
            if (getrelatedfixedsize.RemoteActionCompatParcelizer(CaptureSessionShouldUseMrirQuirk.class, Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(str3) && Build.VERSION.SDK_INT >= 35)) {
                arrayList.add(new CaptureSessionShouldUseMrirQuirk());
            }
            setThumbTintList.RemoteActionCompatParcelizer = new u$a(arrayList);
            u$a.write(setThumbTintList.RemoteActionCompatParcelizer);
            setInflatedId.IconCompatParcelizer(3, "DeviceQuirks");
            return;
        }
        if (i == 2) {
            getRelatedFixedSize getrelatedfixedsize2 = (getRelatedFixedSize) obj;
            ArrayList arrayList2 = new ArrayList();
            String str7 = Build.BRAND;
            if ((SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str7) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || (SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str7) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
                z3 = true;
            } else {
                String str8 = Build.FINGERPRINT;
                if (!str8.startsWith("generic") && !str8.startsWith(SystemUtils.UNKNOWN)) {
                    String str9 = Build.MODEL;
                    if (!str9.contains("google_sdk") && !str9.contains("Emulator") && !str9.contains("Cuttlefish") && !str9.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!str7.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk"))) {
                        Build.HARDWARE.contains("ranchu");
                    }
                }
                z3 = false;
            }
            if (getrelatedfixedsize2.RemoteActionCompatParcelizer(ImageCaptureRotationOptionQuirk.class, z3)) {
                arrayList2.add(new ImageCaptureRotationOptionQuirk());
            }
            if (getrelatedfixedsize2.RemoteActionCompatParcelizer(SurfaceOrderQuirk.class, true)) {
                arrayList2.add(new SurfaceOrderQuirk());
            }
            HashSet hashSet = CaptureFailedRetryQuirk.RemoteActionCompatParcelizer;
            Locale locale3 = Locale.US;
            String upperCase = str7.toUpperCase(locale3);
            String str10 = Build.MODEL;
            if (getrelatedfixedsize2.RemoteActionCompatParcelizer(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.RemoteActionCompatParcelizer.contains(Pair.create(upperCase, str10.toUpperCase(locale3))))) {
                arrayList2.add(new CaptureFailedRetryQuirk());
            }
            if (getrelatedfixedsize2.RemoteActionCompatParcelizer(LowMemoryQuirk.class, LowMemoryQuirk.write.contains(str10.toUpperCase(locale3)))) {
                arrayList2.add(new LowMemoryQuirk());
            }
            HashSet hashSet2 = LargeJpegImageQuirk.write;
            if (getrelatedfixedsize2.RemoteActionCompatParcelizer(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str7) || LargeJpegImageQuirk.serializer())) {
                arrayList2.add(new LargeJpegImageQuirk());
            }
            HashSet hashSet3 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.RemoteActionCompatParcelizer;
            if (getrelatedfixedsize2.RemoteActionCompatParcelizer(androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class, "Samsung".equalsIgnoreCase(str7) && androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.RemoteActionCompatParcelizer.contains(Build.DEVICE.toUpperCase(locale3)))) {
                arrayList2.add(new androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk());
            }
            HashSet hashSet4 = ImageCaptureFailedForSpecificCombinationQuirk.serializer;
            if (getrelatedfixedsize2.RemoteActionCompatParcelizer(ImageCaptureFailedForSpecificCombinationQuirk.class, ("oneplus".equalsIgnoreCase(str7) && "cph2583".equalsIgnoreCase(str10)) || (Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(str7) && ImageCaptureFailedForSpecificCombinationQuirk.serializer.contains(str10.toLowerCase())))) {
                arrayList2.add(new ImageCaptureFailedForSpecificCombinationQuirk());
            }
            PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.RemoteActionCompatParcelizer;
            if (getrelatedfixedsize2.RemoteActionCompatParcelizer(PreviewGreenTintQuirk.class, "motorola".equalsIgnoreCase(str7) && "moto e20".equalsIgnoreCase(str10))) {
                arrayList2.add(previewGreenTintQuirk);
            }
            getSurfaceProvider.read = new u$a(arrayList2);
            u$a.write(getSurfaceProvider.read);
            setInflatedId.IconCompatParcelizer(3, "DeviceQuirks");
            return;
        }
        if (i != 3) {
            getRelatedFixedSize getrelatedfixedsize3 = (getRelatedFixedSize) obj;
            ArrayList arrayList3 = new ArrayList();
            if (Build.VERSION.SDK_INT < 33) {
                String str11 = Build.MANUFACTURER;
                if ("SAMSUNG".equalsIgnoreCase(str11)) {
                    String str12 = Build.DEVICE;
                    if (!"F2Q".equalsIgnoreCase(str12) && !"Q2Q".equalsIgnoreCase(str12)) {
                        if (("OPPO".equalsIgnoreCase(str11) || !"OP4E75L1".equalsIgnoreCase(Build.DEVICE)) && (!"LENOVO".equalsIgnoreCase(str11) || !"Q706F".equalsIgnoreCase(Build.DEVICE))) {
                            z4 = false;
                        }
                    }
                    z4 = true;
                } else if ("OPPO".equalsIgnoreCase(str11)) {
                    z4 = false;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            if (getrelatedfixedsize3.RemoteActionCompatParcelizer(SurfaceViewStretchedQuirk.class, z4)) {
                arrayList3.add(new SurfaceViewStretchedQuirk());
            }
            if (getrelatedfixedsize3.RemoteActionCompatParcelizer(SurfaceViewNotCroppedByParentQuirk.class, "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
                arrayList3.add(new SurfaceViewNotCroppedByParentQuirk());
            }
            HoverableNode.serializer = new u$a(arrayList3);
            u$a.write(HoverableNode.serializer);
            setInflatedId.IconCompatParcelizer(3, "DeviceQuirks");
            return;
        }
        getRelatedFixedSize getrelatedfixedsize4 = (getRelatedFixedSize) obj;
        ArrayList arrayList4 = new ArrayList();
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class, false)) {
            arrayList4.add(new MediaFormatMustNotUseFrameRateToFindEncoderQuirk());
        }
        List list7 = MediaCodecInfoReportIncorrectInfoQuirk.write;
        String str13 = Build.BRAND;
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(MediaCodecInfoReportIncorrectInfoQuirk.class, ("Nokia".equalsIgnoreCase(str13) && "Nokia 1".equalsIgnoreCase(Build.MODEL)) || ("motorola".equalsIgnoreCase(str13) && "moto c".equalsIgnoreCase(Build.MODEL)) || (("infinix".equalsIgnoreCase(str13) && "infinix x650".equalsIgnoreCase(Build.MODEL)) || (("LGE".equalsIgnoreCase(str13) && "LG-X230".equalsIgnoreCase(Build.MODEL)) || (("Huawei".equalsIgnoreCase(str13) && "mha-l29".equalsIgnoreCase(Build.MODEL)) || (("Redmi".equalsIgnoreCase(str13) && "Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL)) || (("positivo".equalsIgnoreCase(str13) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || MediaCodecInfoReportIncorrectInfoQuirk.write.contains(Build.MODEL.toLowerCase(Locale.US))))))))) {
            arrayList4.add(new MediaCodecInfoReportIncorrectInfoQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class, false)) {
            arrayList4.add(new DeactivateEncoderSurfaceBeforeStopEncoderQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(CameraUseInconsistentTimebaseQuirk.class, CameraUseInconsistentTimebaseQuirk.read())) {
            arrayList4.add(new CameraUseInconsistentTimebaseQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(ReportedVideoQualityNotSupportedQuirk.class, ReportedVideoQualityNotSupportedQuirk.IconCompatParcelizer() || ReportedVideoQualityNotSupportedQuirk.write() || ("Vivo".equalsIgnoreCase(str13) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ReportedVideoQualityNotSupportedQuirk.RemoteActionCompatParcelizer() || ReportedVideoQualityNotSupportedQuirk.read())) {
            arrayList4.add(new ReportedVideoQualityNotSupportedQuirk());
        }
        List list8 = EncoderNotUsePersistentInputSurfaceQuirk.read;
        String str14 = Build.MODEL;
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(EncoderNotUsePersistentInputSurfaceQuirk.class, list8.contains(str14.toUpperCase()))) {
            arrayList4.add(new EncoderNotUsePersistentInputSurfaceQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(VideoEncoderCrashQuirk.class, "positivo".equalsIgnoreCase(str13) && "twist 2 pro".equalsIgnoreCase(str14))) {
            arrayList4.add(new VideoEncoderCrashQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(ExcludeStretchedVideoQualityQuirk.class, ("Samsung".equalsIgnoreCase(str13) && "SM-J260F".equalsIgnoreCase(str14)) || ("Samsung".equalsIgnoreCase(str13) && "SM-J400G".equalsIgnoreCase(str14)) || (("Samsung".equalsIgnoreCase(str13) && "SM-J530F".equalsIgnoreCase(str14)) || (("Samsung".equalsIgnoreCase(str13) && "sm-j600g".equalsIgnoreCase(str14)) || (("Samsung".equalsIgnoreCase(str13) && "SM-J701F".equalsIgnoreCase(str14)) || (("Samsung".equalsIgnoreCase(str13) && "SM-G610M".equalsIgnoreCase(str14)) || ("Samsung".equalsIgnoreCase(str13) && "SM-J710MN".equalsIgnoreCase(str14)))))))) {
            arrayList4.add(new ExcludeStretchedVideoQualityQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(MediaStoreVideoCannotWrite.class, ("positivo".equalsIgnoreCase(str13) && "twist 2 pro".equalsIgnoreCase(str14)) || ("itel".equalsIgnoreCase(str13) && "itel w6004".equalsIgnoreCase(str14)))) {
            arrayList4.add(new MediaStoreVideoCannotWrite());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(AudioEncoderIgnoresInputTimestampQuirk.class, "Sony".equalsIgnoreCase(str13) && "G3125".equalsIgnoreCase(str14))) {
            arrayList4.add(new AudioEncoderIgnoresInputTimestampQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, "Samsung".equalsIgnoreCase(str13) && Build.VERSION.SDK_INT < 29)) {
            arrayList4.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(NegativeLatLongSavesIncorrectlyQuirk.class, Build.VERSION.SDK_INT < 34)) {
            arrayList4.add(new NegativeLatLongSavesIncorrectlyQuirk());
        }
        List list9 = AudioTimestampFramePositionIncorrectQuirk.RemoteActionCompatParcelizer;
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(AudioTimestampFramePositionIncorrectQuirk.class, ("oppo".equalsIgnoreCase(str13) && AudioTimestampFramePositionIncorrectQuirk.RemoteActionCompatParcelizer.contains(str14.toLowerCase(Locale.ROOT))) || ("lge".equalsIgnoreCase(str13) && "lg-m250".equalsIgnoreCase(str14)) || (("motorola".equalsIgnoreCase(str13) && "moto c".equalsIgnoreCase(str14)) || (("realme".equalsIgnoreCase(str13) && "rmx1941".equalsIgnoreCase(str14)) || (("Xiaomi".equalsIgnoreCase(str13) && "Redmi 6A".equalsIgnoreCase(str14)) || ((Constants.REFERRER_API_VIVO.equalsIgnoreCase(str13) && "vivo 1820".equalsIgnoreCase(str14)) || (Constants.REFERRER_API_VIVO.equalsIgnoreCase(str13) && "VIVO Y17".equalsIgnoreCase(str14)))))))) {
            arrayList4.add(new AudioTimestampFramePositionIncorrectQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(ExtraSupportedResolutionQuirk.class, "motorola".equalsIgnoreCase(str13) && "moto e5 play".equalsIgnoreCase(str14))) {
            arrayList4.add(new ExtraSupportedResolutionQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(StretchedVideoResolutionQuirk.class, "motorola".equalsIgnoreCase(str13) && "moto e5 play".equalsIgnoreCase(str14))) {
            arrayList4.add(new StretchedVideoResolutionQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(CodecStuckOnFlushQuirk.class, "Nokia".equalsIgnoreCase(str13) && "Nokia 1".equalsIgnoreCase(str14))) {
            arrayList4.add(new CodecStuckOnFlushQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, "motorola".equalsIgnoreCase(str13) && "moto c".equalsIgnoreCase(str14))) {
            arrayList4.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(ExtraSupportedQualityQuirk.class, "motorola".equalsIgnoreCase(str13) && "moto c".equalsIgnoreCase(str14))) {
            arrayList4.add(new ExtraSupportedQualityQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(SignalEosOutputBufferNotComeQuirk.class, "Nokia".equalsIgnoreCase(str13) && "Nokia 1".equalsIgnoreCase(str14))) {
            arrayList4.add(new SignalEosOutputBufferNotComeQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(SizeCannotEncodeVideoQuirk.class, "motorola".equalsIgnoreCase(str13) && "moto c".equalsIgnoreCase(str14))) {
            arrayList4.add(new SizeCannotEncodeVideoQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(PreviewBlackScreenQuirk.class, PreviewBlackScreenQuirk.RemoteActionCompatParcelizer || PreviewBlackScreenQuirk.serializer)) {
            arrayList4.add(new PreviewBlackScreenQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.IconCompatParcelizer)) {
            arrayList4.add(PrematureEndOfStreamVideoQuirk.write);
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(MediaCodecDefaultDataSpaceQuirk.class, true)) {
            arrayList4.add(new MediaCodecDefaultDataSpaceQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(HdrRepeatingRequestFailureQuirk.class, Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str13) && "pa3q".equalsIgnoreCase(Build.DEVICE))) {
            arrayList4.add(new HdrRepeatingRequestFailureQuirk());
        }
        if (getrelatedfixedsize4.RemoteActionCompatParcelizer(PreviewFreezeAfterHighSpeedRecordingQuirk.class, PreviewFreezeAfterHighSpeedRecordingQuirk.read)) {
            arrayList4.add(PreviewFreezeAfterHighSpeedRecordingQuirk.IconCompatParcelizer);
        }
        accesswaitForCompositionAfterTargetStateChange.read = new u$a(arrayList4);
        u$a.write(accesswaitForCompositionAfterTargetStateChange.read);
        setInflatedId.IconCompatParcelizer(3, "DeviceQuirks");
    }
}
