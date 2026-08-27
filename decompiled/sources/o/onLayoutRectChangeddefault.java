package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgs;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.riemann.location.common.utils.Constant;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public final class onLayoutRectChangeddefault extends Measurable {
    public Boolean MediaBrowserCompatMediaItem;
    public BezierKtWhenMappings MediaDescriptionCompat;
    public Integer MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public final AtomicLong serializer;
    public SecureRandom write;
    public static final String[] read = {"firebase_", "google_", "ga_"};
    public static final String[] IconCompatParcelizer = {"_err"};

    @Override // o.Measurable
    public final boolean read() {
        return true;
    }

    public static void RemoteActionCompatParcelizer(onLayoutRectChanged onlayoutrectchanged, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        read(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        onlayoutrectchanged.RemoteActionCompatParcelizer(str, "_err", bundle);
    }

    public final int IconCompatParcelizer(Object obj, String str) {
        return "_ldl".equals(str) ? serializer("user property referrer", str, MediaMetadataCompat(str), obj) : serializer("user property", str, MediaMetadataCompat(str), obj) ? 0 : 7;
    }

    public final void IconCompatParcelizer(getQEK5gGoQ getqek5ggoq, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            getqek5ggoq.RemoteActionCompatParcelizer(bundle);
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Error returning byte array to wrapper");
        }
    }

    public final int MediaBrowserCompatMediaItem(String str) {
        if (!serializer("event param", str)) {
            return 3;
        }
        if (!write("event param", null, null, str)) {
            return 14;
        }
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        return !RemoteActionCompatParcelizer(40, "event param", str) ? 3 : 0;
    }

    public final int MediaMetadataCompat(String str) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if ("_ldl".equals(str)) {
            lookaheadScopeKtLookaheadScope221.getClass();
            return androidx.compose.ui.graphics.Fields.CameraDistance;
        }
        if ("_id".equals(str)) {
            lookaheadScopeKtLookaheadScope221.getClass();
            return androidx.compose.ui.graphics.Fields.RotationX;
        }
        if ("_lgclid".equals(str)) {
            lookaheadScopeKtLookaheadScope221.getClass();
            return 100;
        }
        lookaheadScopeKtLookaheadScope221.getClass();
        return 36;
    }

    public final int MediaSessionCompatQueueItem(String str) {
        if (!read("event", str)) {
            return 2;
        }
        if (!write("event", Measured.IconCompatParcelizer, Measured.write, str)) {
            return 13;
        }
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        return !RemoteActionCompatParcelizer(40, "event", str) ? 2 : 0;
    }

    public final int RatingCompat(String str) {
        if (!read("event param", str)) {
            return 3;
        }
        if (!write("event param", null, null, str)) {
            return 14;
        }
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        return !RemoteActionCompatParcelizer(40, "event param", str) ? 3 : 0;
    }

    public final void RemoteActionCompatParcelizer(getQEK5gGoQ getqek5ggoq, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            getqek5ggoq.RemoteActionCompatParcelizer(bundle);
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Error returning bundle list to wrapper");
        }
    }

    public final boolean RemoteActionCompatParcelizer(int i, String str, String str2) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (str2 == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaDescriptionCompat.serializer(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        getlookaheaddelegate2.MediaDescriptionCompat.IconCompatParcelizer("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final String ResultReceiver() {
        byte[] bArr = new byte[16];
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().nextBytes(bArr);
        return String.format(java.util.Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        long andIncrement;
        long jNextLong;
        long j;
        AtomicLong atomicLong = this.serializer;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.serializer;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.RemoteActionCompatParcelizer + 1;
            this.RemoteActionCompatParcelizer = i;
            j = i;
        }
        return jNextLong + j;
    }

    public final Object read(Object obj, String str) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        boolean zEquals = "_ev".equals(str);
        int iMax = Constant.ERROR_UNKNOWN;
        if (zEquals) {
            lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.getClass();
            return RemoteActionCompatParcelizer(Math.max(Constant.ERROR_UNKNOWN, androidx.compose.ui.graphics.Fields.RotationX), obj, true, true);
        }
        if (RemoteActionCompatParcelizer(str)) {
            lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.getClass();
            iMax = Math.max(Constant.ERROR_UNKNOWN, androidx.compose.ui.graphics.Fields.RotationX);
        } else {
            lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.getClass();
        }
        return RemoteActionCompatParcelizer(iMax, obj, false, true);
    }

    public final void read(androidx.camera.core.FocusMeteringAction focusMeteringAction, int i) {
        Bundle bundle = (Bundle) focusMeteringAction.serializer;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (serializer(str) && (i2 = i2 + 1) > i) {
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
                zzgn zzgnVar = lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (!setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.onPreparePanel) || !z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.MediaDescriptionCompat.serializer(string, zzgnVar.write((String) focusMeteringAction.IconCompatParcelizer), zzgnVar.read(bundle));
                    read(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final void read(String str, getQEK5gGoQ getqek5ggoq) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            getqek5ggoq.RemoteActionCompatParcelizer(bundle);
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Error returning string value to wrapper");
        }
    }

    public final boolean read(int i) {
        Boolean bool = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat().read;
        if (MediaSessionCompatResultReceiverWrapper() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final boolean read(String str) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (TextUtils.isEmpty(str)) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaDescriptionCompat.RemoteActionCompatParcelizer("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        getlookaheaddelegate2.MediaDescriptionCompat.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean read(String str, String str2) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (str2 == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaDescriptionCompat.serializer(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.MediaDescriptionCompat.serializer(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                getlookaheaddelegate3.MediaDescriptionCompat.serializer("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                getlookaheaddelegate4.MediaDescriptionCompat.serializer("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    public final int serializer(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        if (!RatingCompat(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!IconCompatParcelizer(str2, getMeasuredHeight.IconCompatParcelizer)) {
                return 20;
            }
            setViewportBounds setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat();
            setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat.serializer();
            if (setviewportboundsMediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper()) {
                onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) setviewportboundsMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                if (onlayoutrectchangeddefault.MediaSessionCompatResultReceiverWrapper() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.RatingCompat.IconCompatParcelizer("Parameter array is too long; discarded. Value kind, name, array length", RemoteMessageConst.MessageBody.PARAM, str2, Integer.valueOf(size));
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
            } else {
                i = 0;
            }
        }
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        int iMax = Constant.ERROR_UNKNOWN;
        if (zRemoteActionCompatParcelizer || RemoteActionCompatParcelizer(str2)) {
            lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.getClass();
            iMax = Math.max(Constant.ERROR_UNKNOWN, androidx.compose.ui.graphics.Fields.RotationX);
        } else {
            lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.getClass();
        }
        if (!serializer(RemoteMessageConst.MessageBody.PARAM, str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                IconCompatParcelizer(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                        getlookaheaddelegate2.RatingCompat.serializer("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return 4;
                    }
                    IconCompatParcelizer(str, str2, (Bundle) parcelable, list, z);
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                        getlookaheaddelegate3.RatingCompat.serializer("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                        return 4;
                    }
                    IconCompatParcelizer(str, str2, (Bundle) obj2, list, z);
                }
            }
        }
        return i;
    }

    public final Bundle serializer(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = read(bundle.get(str), str);
                if (obj == null) {
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.RatingCompat.serializer(lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(str), "Param value can't be null");
                } else {
                    write(str, bundle2, obj);
                }
            }
        }
        return bundle2;
    }

    public final void serializer(getQEK5gGoQ getqek5ggoq, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            getqek5ggoq.RemoteActionCompatParcelizer(bundle);
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Error returning int value to wrapper");
        }
    }

    public final boolean serializer(Context context, String str) {
        Signature[] signatureArr;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = accessgetTvMediaContextMenucp.serializer(context).read(64, str);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean serializer(String str, String str2) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (str2 == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaDescriptionCompat.serializer(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.MediaDescriptionCompat.serializer(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.MediaDescriptionCompat.serializer("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                getlookaheaddelegate4.MediaDescriptionCompat.serializer("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final Object write(Object obj, String str) {
        return "_ldl".equals(str) ? RemoteActionCompatParcelizer(MediaMetadataCompat(str), obj, true, false) : RemoteActionCompatParcelizer(MediaMetadataCompat(str), obj, false, false);
    }

    public final void write(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void write(getQEK5gGoQ getqek5ggoq, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            getqek5ggoq.RemoteActionCompatParcelizer(bundle);
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Error returning long value to wrapper");
        }
    }

    public final void write(getQEK5gGoQ getqek5ggoq, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            getqek5ggoq.RemoteActionCompatParcelizer(bundle);
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Error returning boolean value to wrapper");
        }
    }

    public final boolean write(String str, String[] strArr, String[] strArr2, String str2) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (str2 == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaDescriptionCompat.serializer(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(read[i])) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.MediaDescriptionCompat.serializer("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !IconCompatParcelizer(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && IconCompatParcelizer(str2, strArr2)) {
            return true;
        }
        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
        getlookaheaddelegate3.MediaDescriptionCompat.serializer("Name is reserved. Type, name", str, str2);
        return false;
    }

    public static String IconCompatParcelizer(String str, int i, boolean z) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
            }
        }
        return null;
    }

    public static boolean RemoteActionCompatParcelizer(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static long serializer(byte[] bArr) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(bArr);
        int length = bArr.length;
        int i = 0;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static boolean write(String str) {
        String str2 = (String) premeasure0kLqBqw.getViewModelStore.IconCompatParcelizer(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public final boolean IconCompatParcelizer(String str) {
        MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (accessgetTvMediaContextMenucp.serializer(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat).write.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.MediaSessionCompatToken.serializer(str, "Permission not granted");
        return false;
    }

    public final int MediaDescriptionCompat(String str) {
        if (!read("user property", str)) {
            return 6;
        }
        if (!write("user property", MeasureScopelayout1.write, null, str)) {
            return 15;
        }
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        return !RemoteActionCompatParcelizer(24, "user property", str) ? 6 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    public final long MediaSessionCompatQueueItem() {
        long j;
        Object e;
        boolean z;
        MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        resume resumeVarMediaMetadataCompat = lookaheadScopeKtLookaheadScope221.MediaMetadataCompat();
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        if (!write(resumeVarMediaMetadataCompat.MediaSessionCompatResultReceiverWrapper())) {
            return 0L;
        }
        Integer num = null;
        if (Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = MediaMetadataCompat() < ((Integer) premeasure0kLqBqw.getFullyDrawnReporter.IconCompatParcelizer(null)).intValue() ? 16L : 0L;
        }
        if (!IconCompatParcelizer("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.MediaBrowserCompatMediaItem == null) {
                if (this.MediaDescriptionCompat == null) {
                    this.MediaDescriptionCompat = BezierKtWhenMappings.write(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat);
                }
                BezierKtWhenMappings bezierKtWhenMappings = this.MediaDescriptionCompat;
                if (bezierKtWhenMappings == null) {
                    j = 64;
                } else {
                    try {
                        Integer num2 = (Integer) bezierKtWhenMappings.serializer().get(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, TimeUnit.MILLISECONDS);
                        if (num2 != null) {
                            try {
                                z = true;
                                if (num2.intValue() != 1) {
                                    z = false;
                                }
                                this.MediaBrowserCompatMediaItem = Boolean.valueOf(z);
                            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
                                e = e2;
                                num = num2;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Measurement manager api exception");
                                this.MediaBrowserCompatMediaItem = Boolean.FALSE;
                                num2 = num;
                            }
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.PlaybackStateCompat.serializer(num2, "Measurement manager api status result");
                            if (!this.MediaBrowserCompatMediaItem.booleanValue()) {
                                j = 64;
                            }
                        } else {
                            z = false;
                            this.MediaBrowserCompatMediaItem = Boolean.valueOf(z);
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.PlaybackStateCompat.serializer(num2, "Measurement manager api status result");
                            if (!this.MediaBrowserCompatMediaItem.booleanValue()) {
                                j = 64;
                            }
                        }
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e3) {
                        e = e3;
                    }
                }
            } else if (!this.MediaBrowserCompatMediaItem.booleanValue()) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final void RemoteActionCompatParcelizer(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                onlayoutrectchangeddefault.write(str, bundle, bundle2.get(str));
            }
        }
    }

    public final SecureRandom r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        MediaSessionCompatToken();
        if (this.write == null) {
            this.write = new SecureRandom();
        }
        return this.write;
    }

    public final boolean serializer(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i) {
            return true;
        }
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.RatingCompat.IconCompatParcelizer("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        return false;
    }

    public final void write(String str, Bundle bundle, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.RatingCompat.serializer("Not putting event parameter. Invalid value type. name, type", lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(str), simpleName);
        }
    }

    public final void write(Parcelable[] parcelableArr, int i) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (serializer(str) && !IconCompatParcelizer(str, getMeasuredHeight.write) && (i2 = i2 + 1) > i) {
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
                    zzgn zzgnVar = lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    if (!setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.onPreparePanel) || !z) {
                        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgs zzgsVar = getlookaheaddelegate.MediaDescriptionCompat;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        zzgsVar.serializer(sb.toString(), zzgnVar.IconCompatParcelizer(str), zzgnVar.read(bundle));
                    }
                    read(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public onLayoutRectChangeddefault(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        this.MediaSessionCompatQueueItem = null;
        this.serializer = new AtomicLong(0L);
    }

    public static boolean IconCompatParcelizer(Context context) {
        ActivityInfo receiverInfo;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static byte[] IconCompatParcelizer(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static boolean RatingCompat(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean serializer(String str) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final int MediaSessionCompatResultReceiverWrapper() {
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat) / 1000);
        }
        return this.MediaSessionCompatQueueItem.intValue();
    }

    public final Object RemoteActionCompatParcelizer(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return IconCompatParcelizer(obj.toString(), i, z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleSerializer = serializer((Bundle) parcelable);
                if (!bundleSerializer.isEmpty()) {
                    arrayList.add(bundleSerializer);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean IconCompatParcelizer(String str, String[] strArr) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean read(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static ArrayList write(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(HiAnalyticsConstant.BI_KEY_APP_ID, zzahVar.RemoteActionCompatParcelizer);
            bundle.putString("origin", zzahVar.read);
            bundle.putLong("creation_timestamp", zzahVar.write);
            bundle.putString("name", zzahVar.serializer.write);
            Object objIconCompatParcelizer = zzahVar.serializer.IconCompatParcelizer();
            accessgetSystemNavigationDowncp.IconCompatParcelizer(objIconCompatParcelizer);
            accesslayoutjd.read(bundle, objIconCompatParcelizer);
            bundle.putBoolean("active", zzahVar.IconCompatParcelizer);
            String str = zzahVar.MediaDescriptionCompat;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbg zzbgVar = zzahVar.MediaSessionCompatQueueItem;
            if (zzbgVar != null) {
                bundle.putString("timed_out_event_name", zzbgVar.IconCompatParcelizer);
                zzbe zzbeVar = zzbgVar.read;
                if (zzbeVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbeVar.write());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.MediaBrowserCompatMediaItem);
            zzbg zzbgVar2 = zzahVar.MediaMetadataCompat;
            if (zzbgVar2 != null) {
                bundle.putString("triggered_event_name", zzbgVar2.IconCompatParcelizer);
                zzbe zzbeVar2 = zzbgVar2.read;
                if (zzbeVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbeVar2.write());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.serializer.IconCompatParcelizer);
            bundle.putLong("time_to_live", zzahVar.RatingCompat);
            zzbg zzbgVar3 = zzahVar.MediaSessionCompatResultReceiverWrapper;
            if (zzbgVar3 != null) {
                bundle.putString("expired_event_name", zzbgVar3.IconCompatParcelizer);
                zzbe zzbeVar3 = zzbgVar3.read;
                if (zzbeVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbeVar3.write());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final Bundle IconCompatParcelizer(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("gbraid");
                    queryParameter6 = uri.getQueryParameter("utm_id");
                    queryParameter7 = uri.getQueryParameter("dclid");
                    queryParameter8 = uri.getQueryParameter("srsltid");
                    queryParameter9 = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString(com.adjust.sdk.Constants.MEDIUM, queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("gbraid", queryParameter5);
                }
                String queryParameter10 = uri.getQueryParameter("gad_source");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("gad_source", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("term", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString(RemoteMessageConst.Notification.CONTENT, queryParameter12);
                }
                String queryParameter13 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter13)) {
                    bundle.putString("aclid", queryParameter13);
                }
                String queryParameter14 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter14)) {
                    bundle.putString("cp1", queryParameter14);
                }
                String queryParameter15 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter15)) {
                    bundle.putString("anid", queryParameter15);
                }
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("campaign_id", queryParameter6);
                }
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("dclid", queryParameter7);
                }
                String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter16)) {
                    bundle.putString("source_platform", queryParameter16);
                }
                String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter17)) {
                    bundle.putString("creative_format", queryParameter17);
                }
                String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter18)) {
                    bundle.putString("marketing_tactic", queryParameter18);
                }
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("srsltid", queryParameter8);
                }
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("sfmc_id", queryParameter9);
                }
                for (String str : uri.getQueryParameterNames()) {
                    if (str.startsWith("gad_")) {
                        String queryParameter19 = uri.getQueryParameter(str);
                        if (!TextUtils.isEmpty(queryParameter19)) {
                            bundle.putString(str, queryParameter19);
                        }
                    }
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    public final void serializer(getQEK5gGoQ getqek5ggoq, Bundle bundle) {
        try {
            getqek5ggoq.RemoteActionCompatParcelizer(bundle);
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Error returning bundle value to wrapper");
        }
    }

    public static void IconCompatParcelizer(getViewportBounds getviewportbounds, Bundle bundle, boolean z) {
        if (bundle != null && getviewportbounds != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = getviewportbounds.read;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = getviewportbounds.write;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", getviewportbounds.IconCompatParcelizer);
                return;
            }
            z = false;
        }
        if (bundle != null && getviewportbounds == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static int MediaMetadataCompat() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static MessageDigest serializer() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public final void IconCompatParcelizer(Bundle bundle, int i, String str, Object obj) {
        if (read(i, bundle)) {
            ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
            bundle.putString("_ev", IconCompatParcelizer(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public static boolean RemoteActionCompatParcelizer(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(BundleUtil.UNDERLINE_TAG);
    }

    public final boolean IconCompatParcelizer(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompat.read("debug.firebase.analytics.app").equals(str);
    }

    public final zzbg RemoteActionCompatParcelizer(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (MediaSessionCompatQueueItem(str) != 0) {
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(str), "Invalid conditional property event name");
            DrawableTransformation.write();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleSerializer = read(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleSerializer = serializer(bundleSerializer);
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer(bundleSerializer);
        return new zzbg(str, new zzbe(bundleSerializer), str2, j);
    }

    public final Bundle read(String str, Bundle bundle, List list, boolean z) {
        int iMediaBrowserCompatMediaItem;
        int i;
        zzgn zzgnVar;
        boolean zIconCompatParcelizer = IconCompatParcelizer(str, Measured.read);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
        zzgn zzgnVar2 = lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) setcomposedwithreusablecontenthost.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        int i2 = onlayoutrectchangeddefault.read(201500000) ? 100 : 25;
        int i3 = 0;
        boolean z2 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iMediaBrowserCompatMediaItem = !z ? MediaBrowserCompatMediaItem(str2) : 0;
                if (iMediaBrowserCompatMediaItem == 0) {
                    iMediaBrowserCompatMediaItem = RatingCompat(str2);
                }
            } else {
                iMediaBrowserCompatMediaItem = 0;
            }
            if (iMediaBrowserCompatMediaItem != 0) {
                IconCompatParcelizer(bundle2, iMediaBrowserCompatMediaItem, str2, iMediaBrowserCompatMediaItem == 3 ? str2 : null);
                bundle2.remove(str2);
                i = i2;
                zzgnVar = zzgnVar2;
            } else {
                i = i2;
                zzgn zzgnVar3 = zzgnVar2;
                int iSerializer = serializer(str, str2, bundle.get(str2), bundle2, list, z, zIconCompatParcelizer);
                if (iSerializer == 17) {
                    IconCompatParcelizer(bundle2, 17, str2, Boolean.FALSE);
                } else {
                    if (iSerializer != 0 && !"_ev".equals(str2)) {
                        IconCompatParcelizer(bundle2, iSerializer, iSerializer == 21 ? str : str2, bundle.get(str2));
                        bundle2.remove(str2);
                    }
                    zzgnVar = zzgnVar3;
                }
                if (serializer(str2)) {
                    int i4 = i3 + 1;
                    if (i4 > i) {
                        if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw.onPreparePanel) && z2) {
                            zzgnVar = zzgnVar3;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgnVar = zzgnVar3;
                            getlookaheaddelegate.MediaDescriptionCompat.serializer(string, zzgnVar.write(str), zzgnVar.read(bundle));
                        }
                        read(5, bundle2);
                        bundle2.remove(str2);
                        i3 = i4;
                        z2 = true;
                    } else {
                        i3 = i4;
                        i2 = i;
                        zzgnVar2 = zzgnVar3;
                    }
                } else {
                    zzgnVar = zzgnVar3;
                }
            }
            zzgnVar2 = zzgnVar;
            i2 = i;
        }
        return bundle2;
    }

    public final void IconCompatParcelizer(String str, String str2, Bundle bundle, List list, boolean z) {
        int iMediaBrowserCompatMediaItem;
        int iSerializer;
        char c;
        if (bundle == null) {
            return;
        }
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        zzgn zzgnVar = lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) setcomposedwithreusablecontenthost.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        char c2 = 20064;
        boolean z2 = true;
        int i = true != onlayoutrectchangeddefault.read(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z3 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str3)) {
                iMediaBrowserCompatMediaItem = !z ? MediaBrowserCompatMediaItem(str3) : 0;
                if (iMediaBrowserCompatMediaItem == 0) {
                    iMediaBrowserCompatMediaItem = RatingCompat(str3);
                }
            } else {
                iMediaBrowserCompatMediaItem = 0;
            }
            if (iMediaBrowserCompatMediaItem != 0) {
                IconCompatParcelizer(bundle, iMediaBrowserCompatMediaItem, str3, iMediaBrowserCompatMediaItem == 3 ? str3 : null);
                bundle.remove(str3);
                i = i;
                z2 = z2;
                c = c2;
            } else {
                if (RatingCompat(bundle.get(str3))) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.RatingCompat.IconCompatParcelizer("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iSerializer = 22;
                } else {
                    iSerializer = serializer(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iSerializer != 0 && !"_ev".equals(str3)) {
                    IconCompatParcelizer(bundle, iSerializer, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (serializer(str3) && !IconCompatParcelizer(str3, getMeasuredHeight.write)) {
                    int i3 = i2 + 1;
                    c = 20064;
                    if (!read(231100000)) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate.MediaDescriptionCompat.serializer("Item array not supported on client's version of Google Play Services (Android Only)", zzgnVar.write(str), zzgnVar.read(bundle));
                        read(23, bundle);
                        bundle.remove(str3);
                    } else if (i3 > i) {
                        if (!lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw.onPreparePanel) || !z3) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgs zzgsVar = getlookaheaddelegate.MediaDescriptionCompat;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            zzgsVar.serializer(sb.toString(), zzgnVar.write(str), zzgnVar.read(bundle));
                        }
                        read(28, bundle);
                        bundle.remove(str3);
                        i2 = i3;
                        c2 = 20064;
                        i = i;
                        z2 = z2;
                        z3 = z2;
                    }
                    i2 = i3;
                }
                c = 20064;
            }
            c2 = c;
            i = i;
            z2 = z2;
        }
    }
}
