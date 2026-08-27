package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceHolder;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import o.DrawableTransformation;
import o.MutableOrderedSetWrapperiterator1iterator1;
import o.MutableSetWrapperiterator1iterator1;
import o.access501;
import o.getCieXyz;
import o.getThumbTintList;
import o.getTrackTintList;
import o.removeNodeAtDepth;
import o.setSplitTrack;
import o.sizeOf;

/* JADX INFO: loaded from: classes.dex */
public final class access501 implements onReadoutStarted {
    public static final access601 IconCompatParcelizer = new access601();
    public final Context MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaSessionCompatQueueItem;
    public final androidx.camera.camera2.internal.compat.CameraManagerCompat RatingCompat;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final String read;
    public final isAdapterPositionOnScreen serializer;
    public final isAdapterPositionOnScreen write;

    public static CameraDevice.CameraDeviceSetup ai_(access501 access501Var) {
        androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat = access501Var.RatingCompat;
        CameraManager cameraManager = (CameraManager) cameraManagerCompat.serializer.MediaSessionCompatQueueItem;
        String str = access501Var.read;
        if (cameraManager.isCameraDeviceSetupSupported(str)) {
            return ((CameraManager) cameraManagerCompat.serializer.MediaSessionCompatQueueItem).getCameraDeviceSetup(str);
        }
        return null;
    }

    public access501(Context context, String str, androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat) {
        context.getClass();
        str.getClass();
        cameraManagerCompat.getClass();
        this.MediaBrowserCompatMediaItem = context;
        this.read = str;
        this.RatingCompat = cameraManagerCompat;
        final int i = 0;
        this.write = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.camera.camera2.impl.FeatureCombinationQueryImpl$$ExternalSyntheticLambda2
            public final /* synthetic */ access501 write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() throws CameraUnavailableException {
                String string;
                int i2 = i;
                access501 access501Var = this.write;
                MutableOrderedSetWrapperiterator1iterator1 mutableOrderedSetWrapperiterator1iterator1 = null;
                Boolean bool = null;
                mutableOrderedSetWrapperiterator1iterator1 = null;
                mutableOrderedSetWrapperiterator1iterator1 = null;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return access501.ai_(access501Var);
                    }
                    if (i2 == 2) {
                        try {
                            return access501Var.RatingCompat.serializer(access501Var.read);
                        } catch (CameraAccessExceptionCompat e) {
                            throw new CameraUnavailableException(e);
                        }
                    }
                    if (i2 == 3) {
                        getTrackTintList gettracktintlistSerializer = getTrackTintList.serializer((getThumbTintList) access501Var.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
                        UtilsKt.RemoteActionCompatParcelizer("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((setSplitTrack) gettracktintlistSerializer.serializer).ap_();
                    }
                    Context context2 = access501Var.MediaBrowserCompatMediaItem;
                    try {
                        ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                        if (serviceInfoArr == null) {
                            bool = Boolean.FALSE;
                        } else {
                            for (ServiceInfo serviceInfo : serviceInfoArr) {
                                try {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                        bool = Boolean.TRUE;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e2) {
                                    DrawableTransformation.write(e2.getMessage());
                                    return null;
                                }
                            }
                            bool = Boolean.FALSE;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, Boolean.FALSE}, getCieXyz.write())).booleanValue());
                }
                Context context3 = access501Var.MediaBrowserCompatMediaItem;
                MutableOrderedSetWrapperiterator1iterator1 mutableOrderedSetWrapperiterator1iterator2 = Build.VERSION.SDK_INT >= 35 ? new MutableOrderedSetWrapperiterator1iterator1(context3) : null;
                try {
                    ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                    if (serviceInfoArr2 != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo2 : serviceInfoArr2) {
                            Bundle bundle2 = serviceInfo2.metaData;
                            if (bundle2 != null && (string = bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                mutableOrderedSetWrapperiterator1iterator1 = (MutableOrderedSetWrapperiterator1iterator1) Class.forName(str2).getConstructor(Context.class).newInstance(context3);
                            } catch (Exception e3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e3);
                                return null;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                String str3 = access501Var.read;
                ArrayList arrayList = new ArrayList();
                if (mutableOrderedSetWrapperiterator1iterator1 != null) {
                    arrayList.add(new MutableSetWrapperiterator1iterator1(mutableOrderedSetWrapperiterator1iterator1.write, str3));
                }
                if (mutableOrderedSetWrapperiterator1iterator2 != null) {
                    try {
                        arrayList.add(new MutableSetWrapperiterator1iterator1(mutableOrderedSetWrapperiterator1iterator2.write, str3));
                    } catch (UnsupportedOperationException unused3) {
                    }
                }
                return new sizeOf(arrayList);
            }
        });
        final int i2 = 1;
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.camera.camera2.impl.FeatureCombinationQueryImpl$$ExternalSyntheticLambda2
            public final /* synthetic */ access501 write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() throws CameraUnavailableException {
                String string;
                int i3 = i2;
                access501 access501Var = this.write;
                MutableOrderedSetWrapperiterator1iterator1 mutableOrderedSetWrapperiterator1iterator1 = null;
                Boolean bool = null;
                mutableOrderedSetWrapperiterator1iterator1 = null;
                mutableOrderedSetWrapperiterator1iterator1 = null;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return access501.ai_(access501Var);
                    }
                    if (i3 == 2) {
                        try {
                            return access501Var.RatingCompat.serializer(access501Var.read);
                        } catch (CameraAccessExceptionCompat e) {
                            throw new CameraUnavailableException(e);
                        }
                    }
                    if (i3 == 3) {
                        getTrackTintList gettracktintlistSerializer = getTrackTintList.serializer((getThumbTintList) access501Var.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
                        UtilsKt.RemoteActionCompatParcelizer("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((setSplitTrack) gettracktintlistSerializer.serializer).ap_();
                    }
                    Context context2 = access501Var.MediaBrowserCompatMediaItem;
                    try {
                        ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                        if (serviceInfoArr == null) {
                            bool = Boolean.FALSE;
                        } else {
                            for (ServiceInfo serviceInfo : serviceInfoArr) {
                                try {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                        bool = Boolean.TRUE;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e2) {
                                    DrawableTransformation.write(e2.getMessage());
                                    return null;
                                }
                            }
                            bool = Boolean.FALSE;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, Boolean.FALSE}, getCieXyz.write())).booleanValue());
                }
                Context context3 = access501Var.MediaBrowserCompatMediaItem;
                MutableOrderedSetWrapperiterator1iterator1 mutableOrderedSetWrapperiterator1iterator2 = Build.VERSION.SDK_INT >= 35 ? new MutableOrderedSetWrapperiterator1iterator1(context3) : null;
                try {
                    ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                    if (serviceInfoArr2 != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo2 : serviceInfoArr2) {
                            Bundle bundle2 = serviceInfo2.metaData;
                            if (bundle2 != null && (string = bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                mutableOrderedSetWrapperiterator1iterator1 = (MutableOrderedSetWrapperiterator1iterator1) Class.forName(str2).getConstructor(Context.class).newInstance(context3);
                            } catch (Exception e3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e3);
                                return null;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                String str3 = access501Var.read;
                ArrayList arrayList = new ArrayList();
                if (mutableOrderedSetWrapperiterator1iterator1 != null) {
                    arrayList.add(new MutableSetWrapperiterator1iterator1(mutableOrderedSetWrapperiterator1iterator1.write, str3));
                }
                if (mutableOrderedSetWrapperiterator1iterator2 != null) {
                    try {
                        arrayList.add(new MutableSetWrapperiterator1iterator1(mutableOrderedSetWrapperiterator1iterator2.write, str3));
                    } catch (UnsupportedOperationException unused3) {
                    }
                }
                return new sizeOf(arrayList);
            }
        });
        final int i3 = 2;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.camera.camera2.impl.FeatureCombinationQueryImpl$$ExternalSyntheticLambda2
            public final /* synthetic */ access501 write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() throws CameraUnavailableException {
                String string;
                int i4 = i3;
                access501 access501Var = this.write;
                MutableOrderedSetWrapperiterator1iterator1 mutableOrderedSetWrapperiterator1iterator1 = null;
                Boolean bool = null;
                mutableOrderedSetWrapperiterator1iterator1 = null;
                mutableOrderedSetWrapperiterator1iterator1 = null;
                if (i4 != 0) {
                    if (i4 == 1) {
                        return access501.ai_(access501Var);
                    }
                    if (i4 == 2) {
                        try {
                            return access501Var.RatingCompat.serializer(access501Var.read);
                        } catch (CameraAccessExceptionCompat e) {
                            throw new CameraUnavailableException(e);
                        }
                    }
                    if (i4 == 3) {
                        getTrackTintList gettracktintlistSerializer = getTrackTintList.serializer((getThumbTintList) access501Var.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
                        UtilsKt.RemoteActionCompatParcelizer("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((setSplitTrack) gettracktintlistSerializer.serializer).ap_();
                    }
                    Context context2 = access501Var.MediaBrowserCompatMediaItem;
                    try {
                        ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                        if (serviceInfoArr == null) {
                            bool = Boolean.FALSE;
                        } else {
                            for (ServiceInfo serviceInfo : serviceInfoArr) {
                                try {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                        bool = Boolean.TRUE;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e2) {
                                    DrawableTransformation.write(e2.getMessage());
                                    return null;
                                }
                            }
                            bool = Boolean.FALSE;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, Boolean.FALSE}, getCieXyz.write())).booleanValue());
                }
                Context context3 = access501Var.MediaBrowserCompatMediaItem;
                MutableOrderedSetWrapperiterator1iterator1 mutableOrderedSetWrapperiterator1iterator2 = Build.VERSION.SDK_INT >= 35 ? new MutableOrderedSetWrapperiterator1iterator1(context3) : null;
                try {
                    ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                    if (serviceInfoArr2 != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo2 : serviceInfoArr2) {
                            Bundle bundle2 = serviceInfo2.metaData;
                            if (bundle2 != null && (string = bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                mutableOrderedSetWrapperiterator1iterator1 = (MutableOrderedSetWrapperiterator1iterator1) Class.forName(str2).getConstructor(Context.class).newInstance(context3);
                            } catch (Exception e3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e3);
                                return null;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                String str3 = access501Var.read;
                ArrayList arrayList = new ArrayList();
                if (mutableOrderedSetWrapperiterator1iterator1 != null) {
                    arrayList.add(new MutableSetWrapperiterator1iterator1(mutableOrderedSetWrapperiterator1iterator1.write, str3));
                }
                if (mutableOrderedSetWrapperiterator1iterator2 != null) {
                    try {
                        arrayList.add(new MutableSetWrapperiterator1iterator1(mutableOrderedSetWrapperiterator1iterator2.write, str3));
                    } catch (UnsupportedOperationException unused3) {
                    }
                }
                return new sizeOf(arrayList);
            }
        });
        final int i4 = 3;
        this.MediaSessionCompatQueueItem = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.camera.camera2.impl.FeatureCombinationQueryImpl$$ExternalSyntheticLambda2
            public final /* synthetic */ access501 write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() throws CameraUnavailableException {
                String string;
                int i5 = i4;
                access501 access501Var = this.write;
                MutableOrderedSetWrapperiterator1iterator1 mutableOrderedSetWrapperiterator1iterator1 = null;
                Boolean bool = null;
                mutableOrderedSetWrapperiterator1iterator1 = null;
                mutableOrderedSetWrapperiterator1iterator1 = null;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return access501.ai_(access501Var);
                    }
                    if (i5 == 2) {
                        try {
                            return access501Var.RatingCompat.serializer(access501Var.read);
                        } catch (CameraAccessExceptionCompat e) {
                            throw new CameraUnavailableException(e);
                        }
                    }
                    if (i5 == 3) {
                        getTrackTintList gettracktintlistSerializer = getTrackTintList.serializer((getThumbTintList) access501Var.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
                        UtilsKt.RemoteActionCompatParcelizer("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((setSplitTrack) gettracktintlistSerializer.serializer).ap_();
                    }
                    Context context2 = access501Var.MediaBrowserCompatMediaItem;
                    try {
                        ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                        if (serviceInfoArr == null) {
                            bool = Boolean.FALSE;
                        } else {
                            for (ServiceInfo serviceInfo : serviceInfoArr) {
                                try {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                        bool = Boolean.TRUE;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e2) {
                                    DrawableTransformation.write(e2.getMessage());
                                    return null;
                                }
                            }
                            bool = Boolean.FALSE;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, Boolean.FALSE}, getCieXyz.write())).booleanValue());
                }
                Context context3 = access501Var.MediaBrowserCompatMediaItem;
                MutableOrderedSetWrapperiterator1iterator1 mutableOrderedSetWrapperiterator1iterator2 = Build.VERSION.SDK_INT >= 35 ? new MutableOrderedSetWrapperiterator1iterator1(context3) : null;
                try {
                    ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                    if (serviceInfoArr2 != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo2 : serviceInfoArr2) {
                            Bundle bundle2 = serviceInfo2.metaData;
                            if (bundle2 != null && (string = bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                mutableOrderedSetWrapperiterator1iterator1 = (MutableOrderedSetWrapperiterator1iterator1) Class.forName(str2).getConstructor(Context.class).newInstance(context3);
                            } catch (Exception e3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e3);
                                return null;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                String str3 = access501Var.read;
                ArrayList arrayList = new ArrayList();
                if (mutableOrderedSetWrapperiterator1iterator1 != null) {
                    arrayList.add(new MutableSetWrapperiterator1iterator1(mutableOrderedSetWrapperiterator1iterator1.write, str3));
                }
                if (mutableOrderedSetWrapperiterator1iterator2 != null) {
                    try {
                        arrayList.add(new MutableSetWrapperiterator1iterator1(mutableOrderedSetWrapperiterator1iterator2.write, str3));
                    } catch (UnsupportedOperationException unused3) {
                    }
                }
                return new sizeOf(arrayList);
            }
        });
        final int i5 = 4;
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.camera.camera2.impl.FeatureCombinationQueryImpl$$ExternalSyntheticLambda2
            public final /* synthetic */ access501 write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() throws CameraUnavailableException {
                String string;
                int i6 = i5;
                access501 access501Var = this.write;
                MutableOrderedSetWrapperiterator1iterator1 mutableOrderedSetWrapperiterator1iterator1 = null;
                Boolean bool = null;
                mutableOrderedSetWrapperiterator1iterator1 = null;
                mutableOrderedSetWrapperiterator1iterator1 = null;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return access501.ai_(access501Var);
                    }
                    if (i6 == 2) {
                        try {
                            return access501Var.RatingCompat.serializer(access501Var.read);
                        } catch (CameraAccessExceptionCompat e) {
                            throw new CameraUnavailableException(e);
                        }
                    }
                    if (i6 == 3) {
                        getTrackTintList gettracktintlistSerializer = getTrackTintList.serializer((getThumbTintList) access501Var.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
                        UtilsKt.RemoteActionCompatParcelizer("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((setSplitTrack) gettracktintlistSerializer.serializer).ap_();
                    }
                    Context context2 = access501Var.MediaBrowserCompatMediaItem;
                    try {
                        ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                        if (serviceInfoArr == null) {
                            bool = Boolean.FALSE;
                        } else {
                            for (ServiceInfo serviceInfo : serviceInfoArr) {
                                try {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                        bool = Boolean.TRUE;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e2) {
                                    DrawableTransformation.write(e2.getMessage());
                                    return null;
                                }
                            }
                            bool = Boolean.FALSE;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, Boolean.FALSE}, getCieXyz.write())).booleanValue());
                }
                Context context3 = access501Var.MediaBrowserCompatMediaItem;
                MutableOrderedSetWrapperiterator1iterator1 mutableOrderedSetWrapperiterator1iterator2 = Build.VERSION.SDK_INT >= 35 ? new MutableOrderedSetWrapperiterator1iterator1(context3) : null;
                try {
                    ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                    if (serviceInfoArr2 != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo2 : serviceInfoArr2) {
                            Bundle bundle2 = serviceInfo2.metaData;
                            if (bundle2 != null && (string = bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                mutableOrderedSetWrapperiterator1iterator1 = (MutableOrderedSetWrapperiterator1iterator1) Class.forName(str2).getConstructor(Context.class).newInstance(context3);
                            } catch (Exception e3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e3);
                                return null;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                String str3 = access501Var.read;
                ArrayList arrayList = new ArrayList();
                if (mutableOrderedSetWrapperiterator1iterator1 != null) {
                    arrayList.add(new MutableSetWrapperiterator1iterator1(mutableOrderedSetWrapperiterator1iterator1.write, str3));
                }
                if (mutableOrderedSetWrapperiterator1iterator2 != null) {
                    try {
                        arrayList.add(new MutableSetWrapperiterator1iterator1(mutableOrderedSetWrapperiterator1iterator2.write, str3));
                    } catch (UnsupportedOperationException unused3) {
                    }
                }
                return new sizeOf(arrayList);
            }
        });
    }

    @Override // o.onReadoutStarted
    public final boolean IconCompatParcelizer(mapToBase maptobase) throws Exception {
        boolean zIsTerminated;
        long j;
        access401 access401Var;
        DynamicRangeProfiles dynamicRangeProfilesAj_;
        OutputConfiguration outputConfiguration;
        nativeGetYUVImageVUOff nativegetyuvimagevuoff = maptobase.MediaDescriptionCompat;
        ArrayList<Preview3AThreadCrashQuirk> arrayList = maptobase.IconCompatParcelizer;
        ArrayList<AutoCloseable> arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (Preview3AThreadCrashQuirk preview3AThreadCrashQuirk : arrayList) {
            if (((Boolean) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                preview3AThreadCrashQuirk.getClass();
                PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 = preview3AThreadCrashQuirk.serializer;
                Class cls = previewExternalSyntheticLambda0.MediaDescriptionCompat;
                android.util.Size size = previewExternalSyntheticLambda0.PlaybackStateCompatCustomAction;
                Objects.toString(cls);
                setInflatedId.IconCompatParcelizer(3, "FeatureCombinationQueryImpl");
                if (cls == null) {
                    outputConfiguration = new OutputConfiguration(previewExternalSyntheticLambda0.PlaybackStateCompat, size);
                } else if (size != null) {
                    outputConfiguration = new OutputConfiguration(size, cls);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                    return false;
                }
                access401Var = new access401(outputConfiguration, null);
            } else {
                preview3AThreadCrashQuirk.getClass();
                PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda1 = preview3AThreadCrashQuirk.serializer;
                Class cls2 = previewExternalSyntheticLambda1.MediaDescriptionCompat;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cls2, MediaCodec.class}, getCieXyz.write())).booleanValue()) {
                    j = 65536;
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cls2, SurfaceHolder.class}, getCieXyz.write())).booleanValue()) {
                    j = 2048;
                } else {
                    j = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cls2, SurfaceTexture.class}, getCieXyz.write())).booleanValue() ? 256L : 0L;
                }
                long j2 = j;
                Class cls3 = previewExternalSyntheticLambda1.MediaDescriptionCompat;
                android.util.Size size2 = previewExternalSyntheticLambda1.PlaybackStateCompatCustomAction;
                Objects.toString(cls3);
                setInflatedId.IconCompatParcelizer(3, "FeatureCombinationQueryImpl");
                ImageReader imageReaderNewInstance = ImageReader.newInstance(size2.getWidth(), size2.getHeight(), previewExternalSyntheticLambda1.PlaybackStateCompat, 1, j2);
                imageReaderNewInstance.getClass();
                access401Var = new access401(new OutputConfiguration(imageReaderNewInstance.getSurface()), imageReaderNewInstance);
            }
            if (preview3AThreadCrashQuirk.serializer.MediaDescriptionCompat != null && (dynamicRangeProfilesAj_ = getTrackDrawable.aj_(this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper())) != null) {
                Long lAm_ = setEnforceSwitchWidth.am_(preview3AThreadCrashQuirk.write, dynamicRangeProfilesAj_);
                if (lAm_ != null) {
                    access401Var.read.setDynamicRangeProfile(lAm_.longValue());
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                    return false;
                }
            }
            arrayList2.add(access401Var);
        }
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((access401) it.next()).read);
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList3, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read(), IconCompatParcelizer);
        CameraDevice.CameraDeviceSetup cameraDeviceSetup = (CameraDevice.CameraDeviceSetup) this.serializer.MediaSessionCompatResultReceiverWrapper();
        if (cameraDeviceSetup == null) {
            sessionConfiguration = null;
        } else {
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetup.createCaptureRequest(nativegetyuvimagevuoff.MediaSessionCompatQueueItem);
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, nativegetyuvimagevuoff.IconCompatParcelizer());
            if (nativegetyuvimagevuoff.read() == 2) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
            }
            sessionConfiguration.setSessionParameters(builderCreateCaptureRequest.build());
        }
        if (sessionConfiguration == null) {
            return false;
        }
        int i = ((trimToSize) this.write.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer(sessionConfiguration).write;
        Objects.toString(nativegetyuvimagevuoff.IconCompatParcelizer());
        nativegetyuvimagevuoff.read();
        int i2 = 0;
        for (Object obj : arrayList) {
            if (i2 >= 0) {
                Preview3AThreadCrashQuirk preview3AThreadCrashQuirk2 = (Preview3AThreadCrashQuirk) obj;
                PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda2 = preview3AThreadCrashQuirk2.serializer;
                int i3 = previewExternalSyntheticLambda2.PlaybackStateCompat;
                Objects.toString(previewExternalSyntheticLambda2.PlaybackStateCompatCustomAction);
                Objects.toString(preview3AThreadCrashQuirk2.write);
                Objects.toString(previewExternalSyntheticLambda2.MediaDescriptionCompat);
                i2++;
            } else {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
        }
        setInflatedId.IconCompatParcelizer(3, "FeatureCombinationQueryImpl");
        boolean z = i == 1;
        for (AutoCloseable autoCloseable : arrayList2) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z2 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z2) {
                                executorService.shutdownNow();
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                DrawableTransformation.write();
                return false;
            }
        }
        return z;
    }
}
