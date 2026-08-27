package com.huawei.location.lite.common.util;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import com.sentiance.okhttp3.u$a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.LegacyCameraSurfaceCleanupQuirk;
import o.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import o.PreviewOrientationIncorrectQuirk;
import o.SurfaceRequest;
import o.VideoCaptureExternalSyntheticLambda5;
import o.getOnExit;
import o.onResume;
import o.setInflatedId;
import o.setThumbTintList;
import o.shutdown;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceInfoUtil$DeviceType implements shutdown {
    public final String IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final boolean RatingCompat;
    public final Object RemoteActionCompatParcelizer;
    public final Serializable read;

    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00a4, please report this as an issue */
    @Override // o.shutdown
    public SurfaceRequest write(int i) {
        CamcorderProfile camcorderProfile;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        String str2;
        PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkSerializer;
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk;
        SurfaceRequest surfaceRequestWrite;
        List listAsList;
        SurfaceRequest surfaceRequest = null;
        if (!this.RatingCompat || !CamcorderProfile.hasProfile(this.MediaBrowserCompatMediaItem, i)) {
            return null;
        }
        if (((HashMap) this.read).containsKey(Integer.valueOf(i))) {
            return (SurfaceRequest) ((HashMap) this.read).get(Integer.valueOf(i));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            EncoderProfiles encoderProfilesBT_ = getOnExit.bT_(i, this.IconCompatParcelizer);
            if (encoderProfilesBT_ != null) {
                if (setThumbTintList.RemoteActionCompatParcelizer.read(InvalidVideoProfilesQuirk.class) == null) {
                    try {
                        if (i7 >= 33) {
                            previewOrientationIncorrectQuirkSerializer = VideoCaptureExternalSyntheticLambda5.ar_(encoderProfilesBT_);
                        } else if (i7 >= 31) {
                            previewOrientationIncorrectQuirkSerializer = onResume.aq_(encoderProfilesBT_);
                        } else {
                            throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i7 + ". Version 31 or higher required.");
                        }
                    } catch (NullPointerException e) {
                        setInflatedId.RemoteActionCompatParcelizer("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e);
                        camcorderProfile = CamcorderProfile.get(this.MediaBrowserCompatMediaItem, i);
                        if (camcorderProfile != null) {
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 31) {
                                setInflatedId.read("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                            }
                            int i8 = camcorderProfile.duration;
                            int i9 = camcorderProfile.fileFormat;
                            ArrayList arrayList = new ArrayList();
                            i3 = camcorderProfile.audioCodec;
                            switch (i3) {
                                case 1:
                                    str = "audio/3gpp";
                                    break;
                                case 2:
                                    str = "audio/amr-wb";
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    str = "audio/mp4a-latm";
                                    break;
                                case 6:
                                    str = "audio/vorbis";
                                    break;
                                case 7:
                                    str = "audio/opus";
                                    break;
                                default:
                                    str = "audio/none";
                                    break;
                            }
                            String str3 = str;
                            int i10 = camcorderProfile.audioBitRate;
                            int i11 = camcorderProfile.audioSampleRate;
                            int i12 = camcorderProfile.audioChannels;
                            if (i3 != 3) {
                                i5 = 5;
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        i5 = -1;
                                    } else {
                                        i4 = 39;
                                    }
                                }
                                arrayList.add(new LegacyCameraSurfaceCleanupQuirk(str3, i3, i10, i11, i12, i5));
                                ArrayList arrayList2 = new ArrayList();
                                i6 = camcorderProfile.videoCodec;
                                switch (i6) {
                                    case 1:
                                        str2 = "video/3gpp";
                                        break;
                                    case 2:
                                        str2 = "video/avc";
                                        break;
                                    case 3:
                                        str2 = "video/mp4v-es";
                                        break;
                                    case 4:
                                        str2 = "video/x-vnd.on2.vp8";
                                        break;
                                    case 5:
                                        str2 = "video/hevc";
                                        break;
                                    case 6:
                                        str2 = "video/x-vnd.on2.vp9";
                                        break;
                                    case 7:
                                        str2 = "video/dolby-vision";
                                        break;
                                    case 8:
                                        str2 = "video/av01";
                                        break;
                                    default:
                                        str2 = "video/none";
                                        break;
                                }
                                arrayList2.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk(i6, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                                previewOrientationIncorrectQuirkSerializer = PreviewOrientationIncorrectQuirk.serializer(i8, i9, arrayList, arrayList2);
                            } else {
                                i4 = 2;
                            }
                            i5 = i4;
                            arrayList.add(new LegacyCameraSurfaceCleanupQuirk(str3, i3, i10, i11, i12, i5));
                            ArrayList arrayList3 = new ArrayList();
                            i6 = camcorderProfile.videoCodec;
                            switch (i6) {
                                case 1:
                                    str2 = "video/3gpp";
                                    break;
                                case 2:
                                    str2 = "video/avc";
                                    break;
                                case 3:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 4:
                                    str2 = "video/x-vnd.on2.vp8";
                                    break;
                                case 5:
                                    str2 = "video/hevc";
                                    break;
                                case 6:
                                    str2 = "video/x-vnd.on2.vp9";
                                    break;
                                case 7:
                                    str2 = "video/dolby-vision";
                                    break;
                                case 8:
                                    str2 = "video/av01";
                                    break;
                                default:
                                    str2 = "video/none";
                                    break;
                            }
                            arrayList3.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk(i6, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                            previewOrientationIncorrectQuirkSerializer = PreviewOrientationIncorrectQuirk.serializer(i8, i9, arrayList, arrayList3);
                        } else {
                            previewOrientationIncorrectQuirkSerializer = null;
                        }
                    }
                } else {
                    setInflatedId.IconCompatParcelizer(3, "Camera2EncoderProfilesProvider");
                }
                camcorderProfile = CamcorderProfile.get(this.MediaBrowserCompatMediaItem, i);
                if (camcorderProfile != null) {
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31) {
                        setInflatedId.read("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                    }
                    int i13 = camcorderProfile.duration;
                    int i14 = camcorderProfile.fileFormat;
                    ArrayList arrayList4 = new ArrayList();
                    i3 = camcorderProfile.audioCodec;
                    switch (i3) {
                        case 1:
                            str = "audio/3gpp";
                            break;
                        case 2:
                            str = "audio/amr-wb";
                            break;
                        case 3:
                        case 4:
                        case 5:
                            str = "audio/mp4a-latm";
                            break;
                        case 6:
                            str = "audio/vorbis";
                            break;
                        case 7:
                            str = "audio/opus";
                            break;
                        default:
                            str = "audio/none";
                            break;
                    }
                    String str4 = str;
                    int i15 = camcorderProfile.audioBitRate;
                    int i16 = camcorderProfile.audioSampleRate;
                    int i17 = camcorderProfile.audioChannels;
                    if (i3 != 3) {
                        i5 = 5;
                        if (i3 != 4) {
                            if (i3 != 5) {
                                i5 = -1;
                            } else {
                                i4 = 39;
                            }
                        }
                        arrayList4.add(new LegacyCameraSurfaceCleanupQuirk(str4, i3, i15, i16, i17, i5));
                        ArrayList arrayList5 = new ArrayList();
                        i6 = camcorderProfile.videoCodec;
                        switch (i6) {
                            case 1:
                                str2 = "video/3gpp";
                                break;
                            case 2:
                                str2 = "video/avc";
                                break;
                            case 3:
                                str2 = "video/mp4v-es";
                                break;
                            case 4:
                                str2 = "video/x-vnd.on2.vp8";
                                break;
                            case 5:
                                str2 = "video/hevc";
                                break;
                            case 6:
                                str2 = "video/x-vnd.on2.vp9";
                                break;
                            case 7:
                                str2 = "video/dolby-vision";
                                break;
                            case 8:
                                str2 = "video/av01";
                                break;
                            default:
                                str2 = "video/none";
                                break;
                        }
                        arrayList5.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk(i6, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                        previewOrientationIncorrectQuirkSerializer = PreviewOrientationIncorrectQuirk.serializer(i13, i14, arrayList4, arrayList5);
                    } else {
                        i4 = 2;
                    }
                    i5 = i4;
                    arrayList4.add(new LegacyCameraSurfaceCleanupQuirk(str4, i3, i15, i16, i17, i5));
                    ArrayList arrayList6 = new ArrayList();
                    i6 = camcorderProfile.videoCodec;
                    switch (i6) {
                        case 1:
                            str2 = "video/3gpp";
                            break;
                        case 2:
                            str2 = "video/avc";
                            break;
                        case 3:
                            str2 = "video/mp4v-es";
                            break;
                        case 4:
                            str2 = "video/x-vnd.on2.vp8";
                            break;
                        case 5:
                            str2 = "video/hevc";
                            break;
                        case 6:
                            str2 = "video/x-vnd.on2.vp9";
                            break;
                        case 7:
                            str2 = "video/dolby-vision";
                            break;
                        case 8:
                            str2 = "video/av01";
                            break;
                        default:
                            str2 = "video/none";
                            break;
                    }
                    arrayList6.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk(i6, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                    previewOrientationIncorrectQuirkSerializer = PreviewOrientationIncorrectQuirk.serializer(i13, i14, arrayList4, arrayList6);
                } else {
                    previewOrientationIncorrectQuirkSerializer = null;
                }
            } else {
                previewOrientationIncorrectQuirkSerializer = null;
            }
        } else {
            try {
                camcorderProfile = CamcorderProfile.get(this.MediaBrowserCompatMediaItem, i);
            } catch (RuntimeException e2) {
                setInflatedId.RemoteActionCompatParcelizer("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i, e2);
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    setInflatedId.read("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                }
                int i18 = camcorderProfile.duration;
                int i19 = camcorderProfile.fileFormat;
                ArrayList arrayList7 = new ArrayList();
                i3 = camcorderProfile.audioCodec;
                switch (i3) {
                    case 1:
                        str = "audio/3gpp";
                        break;
                    case 2:
                        str = "audio/amr-wb";
                        break;
                    case 3:
                    case 4:
                    case 5:
                        str = "audio/mp4a-latm";
                        break;
                    case 6:
                        str = "audio/vorbis";
                        break;
                    case 7:
                        str = "audio/opus";
                        break;
                    default:
                        str = "audio/none";
                        break;
                }
                String str5 = str;
                int i110 = camcorderProfile.audioBitRate;
                int i111 = camcorderProfile.audioSampleRate;
                int i112 = camcorderProfile.audioChannels;
                if (i3 != 3) {
                    i5 = 5;
                    if (i3 != 4) {
                        if (i3 != 5) {
                            i5 = -1;
                        } else {
                            i4 = 39;
                        }
                    }
                    arrayList7.add(new LegacyCameraSurfaceCleanupQuirk(str5, i3, i110, i111, i112, i5));
                    ArrayList arrayList8 = new ArrayList();
                    i6 = camcorderProfile.videoCodec;
                    switch (i6) {
                        case 1:
                            str2 = "video/3gpp";
                            break;
                        case 2:
                            str2 = "video/avc";
                            break;
                        case 3:
                            str2 = "video/mp4v-es";
                            break;
                        case 4:
                            str2 = "video/x-vnd.on2.vp8";
                            break;
                        case 5:
                            str2 = "video/hevc";
                            break;
                        case 6:
                            str2 = "video/x-vnd.on2.vp9";
                            break;
                        case 7:
                            str2 = "video/dolby-vision";
                            break;
                        case 8:
                            str2 = "video/av01";
                            break;
                        default:
                            str2 = "video/none";
                            break;
                    }
                    arrayList8.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk(i6, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                    previewOrientationIncorrectQuirkSerializer = PreviewOrientationIncorrectQuirk.serializer(i18, i19, arrayList7, arrayList8);
                } else {
                    i4 = 2;
                }
                i5 = i4;
                arrayList7.add(new LegacyCameraSurfaceCleanupQuirk(str5, i3, i110, i111, i112, i5));
                ArrayList arrayList9 = new ArrayList();
                i6 = camcorderProfile.videoCodec;
                switch (i6) {
                    case 1:
                        str2 = "video/3gpp";
                        break;
                    case 2:
                        str2 = "video/avc";
                        break;
                    case 3:
                        str2 = "video/mp4v-es";
                        break;
                    case 4:
                        str2 = "video/x-vnd.on2.vp8";
                        break;
                    case 5:
                        str2 = "video/hevc";
                        break;
                    case 6:
                        str2 = "video/x-vnd.on2.vp9";
                        break;
                    case 7:
                        str2 = "video/dolby-vision";
                        break;
                    case 8:
                        str2 = "video/av01";
                        break;
                    default:
                        str2 = "video/none";
                        break;
                }
                arrayList9.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk(i6, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                previewOrientationIncorrectQuirkSerializer = PreviewOrientationIncorrectQuirk.serializer(i18, i19, arrayList7, arrayList9);
            } else {
                previewOrientationIncorrectQuirkSerializer = null;
            }
        }
        if (previewOrientationIncorrectQuirkSerializer == null || (camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) ((u$a) this.RemoteActionCompatParcelizer).read(CamcorderProfileResolutionQuirk.class)) == null) {
            surfaceRequest = previewOrientationIncorrectQuirkSerializer;
        } else {
            List list = previewOrientationIncorrectQuirkSerializer.write;
            if (list.isEmpty()) {
                surfaceRequest = previewOrientationIncorrectQuirkSerializer;
            } else {
                PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) list.get(0);
                if (camcorderProfileResolutionQuirk.IconCompatParcelizer == null) {
                    Size[] sizeArrIconCompatParcelizer = camcorderProfileResolutionQuirk.read.IconCompatParcelizer(34);
                    if (sizeArrIconCompatParcelizer != null) {
                        listAsList = Arrays.asList((Size[]) sizeArrIconCompatParcelizer.clone());
                    } else {
                        listAsList = Collections.EMPTY_LIST;
                    }
                    camcorderProfileResolutionQuirk.IconCompatParcelizer = listAsList;
                    Objects.toString(listAsList);
                    setInflatedId.IconCompatParcelizer(3, "CamcorderProfileResolutionQuirk");
                }
                if (new ArrayList(camcorderProfileResolutionQuirk.IconCompatParcelizer).contains(previewDelayWhenVideoCaptureIsBoundQuirk.read())) {
                    surfaceRequest = previewOrientationIncorrectQuirkSerializer;
                } else if (i == 1) {
                    Iterator it = shutdown.n_.iterator();
                    while (it.hasNext()) {
                        surfaceRequestWrite = write(((Integer) it.next()).intValue());
                        if (surfaceRequestWrite != null) {
                            surfaceRequest = surfaceRequestWrite;
                        }
                    }
                } else if (i == 0) {
                    for (int size = shutdown.n_.size() - 1; size >= 0; size--) {
                        surfaceRequestWrite = write(size);
                        if (surfaceRequestWrite != null) {
                            surfaceRequest = surfaceRequestWrite;
                        }
                    }
                }
            }
        }
        ((HashMap) this.read).put(Integer.valueOf(i), surfaceRequest);
        return surfaceRequest;
    }

    public DeviceInfoUtil$DeviceType(String str, u$a u_a) {
        boolean z;
        int i;
        this.read = new HashMap();
        this.IconCompatParcelizer = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            setInflatedId.read("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.RatingCompat = z;
        this.MediaBrowserCompatMediaItem = i;
        this.RemoteActionCompatParcelizer = u_a;
    }

    @Override // o.shutdown
    public boolean serializer(int i) {
        return this.RatingCompat && write(i) != null;
    }

    public DeviceInfoUtil$DeviceType(int i, String str, String str2, String str3, boolean z) {
        this.MediaBrowserCompatMediaItem = i;
        this.IconCompatParcelizer = str;
        this.RatingCompat = z;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
    }
}
