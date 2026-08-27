package o;

import android.app.Application;
import android.os.Process;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MemoryCachedecodeFeatures11 {
    public static Boolean serializer;
    public static String write;

    public static MemoryCachedecodeFeatures1 read(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, setEvaluationfwf_client_release setevaluationfwf_client_release) {
        double d;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        int iCeil = ((isActive) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer).read;
        byte[][] bArrRemoteActionCompatParcelizer = hsvJlNiLsgdefault.RemoteActionCompatParcelizer((byte[][]) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write);
        MemoryCachedecodeFeatures1[] memoryCachedecodeFeatures1Arr = new MemoryCachedecodeFeatures1[bArrRemoteActionCompatParcelizer.length];
        for (int i5 = 0; i5 < bArrRemoteActionCompatParcelizer.length; i5++) {
            memoryCachedecodeFeatures1Arr[i5] = new MemoryCachedecodeFeatures1(0, bArrRemoteActionCompatParcelizer[i5]);
        }
        setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release = new setCustomerProfilefwf_client_release(0);
        setcustomerprofilefwf_client_release.serializer = setevaluationfwf_client_release.MediaDescriptionCompat;
        setcustomerprofilefwf_client_release.MediaBrowserCompatMediaItem = setevaluationfwf_client_release.MediaBrowserCompatMediaItem;
        setcustomerprofilefwf_client_release.RemoteActionCompatParcelizer = setevaluationfwf_client_release.IconCompatParcelizer;
        setcustomerprofilefwf_client_release.write = 0;
        setcustomerprofilefwf_client_release.read = setevaluationfwf_client_release.read;
        setcustomerprofilefwf_client_release.IconCompatParcelizer = setevaluationfwf_client_release.write;
        setEvaluationfwf_client_release setevaluationfwf_client_release2 = new setEvaluationfwf_client_release(setcustomerprofilefwf_client_release);
        while (iCeil > 1) {
            int i6 = 0;
            while (true) {
                d = iCeil / 2;
                int iFloor = (int) Math.floor(d);
                i = setevaluationfwf_client_release2.write;
                i2 = setevaluationfwf_client_release2.RemoteActionCompatParcelizer;
                i3 = setevaluationfwf_client_release2.IconCompatParcelizer;
                j = setevaluationfwf_client_release2.MediaBrowserCompatMediaItem;
                i4 = setevaluationfwf_client_release2.MediaDescriptionCompat;
                if (i6 >= iFloor) {
                    break;
                }
                setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release2 = new setCustomerProfilefwf_client_release(0);
                setcustomerprofilefwf_client_release2.serializer = i4;
                setcustomerprofilefwf_client_release2.MediaBrowserCompatMediaItem = j;
                setcustomerprofilefwf_client_release2.RemoteActionCompatParcelizer = i3;
                setcustomerprofilefwf_client_release2.write = i2;
                setcustomerprofilefwf_client_release2.read = i6;
                setcustomerprofilefwf_client_release2.IconCompatParcelizer = i;
                setEvaluationfwf_client_release setevaluationfwf_client_release3 = new setEvaluationfwf_client_release(setcustomerprofilefwf_client_release2);
                int i7 = i6 * 2;
                memoryCachedecodeFeatures1Arr[i6] = RemoteActionCompatParcelizer(iscontentcardsunreadvisualindicatorenabled, memoryCachedecodeFeatures1Arr[i7], memoryCachedecodeFeatures1Arr[i7 + 1], setevaluationfwf_client_release3);
                i6++;
                setevaluationfwf_client_release2 = setevaluationfwf_client_release3;
            }
            if (iCeil % 2 == 1) {
                memoryCachedecodeFeatures1Arr[(int) Math.floor(d)] = memoryCachedecodeFeatures1Arr[iCeil - 1];
            }
            iCeil = (int) Math.ceil(((double) iCeil) / 2.0d);
            setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release3 = new setCustomerProfilefwf_client_release(0);
            setcustomerprofilefwf_client_release3.serializer = i4;
            setcustomerprofilefwf_client_release3.MediaBrowserCompatMediaItem = j;
            setcustomerprofilefwf_client_release3.RemoteActionCompatParcelizer = i3;
            setcustomerprofilefwf_client_release3.write = i2 + 1;
            setcustomerprofilefwf_client_release3.read = setevaluationfwf_client_release2.read;
            setcustomerprofilefwf_client_release3.IconCompatParcelizer = i;
            setevaluationfwf_client_release2 = new setEvaluationfwf_client_release(setcustomerprofilefwf_client_release3);
        }
        return memoryCachedecodeFeatures1Arr[0];
    }

    public static String IconCompatParcelizer() {
        if (write == null) {
            write = Application.getProcessName();
        }
        return write;
    }

    public static boolean serializer() {
        Boolean boolValueOf = serializer;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(Process.isIsolated());
            serializer = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static MemoryCachedecodeFeatures1 RemoteActionCompatParcelizer(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled, MemoryCachedecodeFeatures1 memoryCachedecodeFeatures1, MemoryCachedecodeFeatures1 memoryCachedecodeFeatures2, setAccountConfigfwf_client_release setaccountconfigfwf_client_release) {
        setAccountConfigfwf_client_release getholdoutkeysfwf_client_release = setaccountconfigfwf_client_release;
        if (memoryCachedecodeFeatures1 != null) {
            int i = memoryCachedecodeFeatures1.IconCompatParcelizer;
            if (memoryCachedecodeFeatures2 != null) {
                if (i == memoryCachedecodeFeatures2.IconCompatParcelizer) {
                    byte[] bArr = (byte[]) iscontentcardsunreadvisualindicatorenabled.read;
                    getHoldouts getholdouts = (getHoldouts) iscontentcardsunreadvisualindicatorenabled.write;
                    byte[] bArrRemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
                    if (getholdoutkeysfwf_client_release instanceof setEvaluationfwf_client_release) {
                        setEvaluationfwf_client_release setevaluationfwf_client_release = (setEvaluationfwf_client_release) getholdoutkeysfwf_client_release;
                        setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release = new setCustomerProfilefwf_client_release(0);
                        setcustomerprofilefwf_client_release.serializer = setevaluationfwf_client_release.MediaDescriptionCompat;
                        setcustomerprofilefwf_client_release.MediaBrowserCompatMediaItem = setevaluationfwf_client_release.MediaBrowserCompatMediaItem;
                        setcustomerprofilefwf_client_release.RemoteActionCompatParcelizer = setevaluationfwf_client_release.IconCompatParcelizer;
                        setcustomerprofilefwf_client_release.write = setevaluationfwf_client_release.RemoteActionCompatParcelizer;
                        setcustomerprofilefwf_client_release.read = setevaluationfwf_client_release.read;
                        setcustomerprofilefwf_client_release.IconCompatParcelizer = 0;
                        getholdoutkeysfwf_client_release = new setEvaluationfwf_client_release(setcustomerprofilefwf_client_release);
                    } else if (getholdoutkeysfwf_client_release instanceof getHoldoutKeysfwf_client_release) {
                        getHoldoutKeysfwf_client_release getholdoutkeysfwf_client_release2 = (getHoldoutKeysfwf_client_release) getholdoutkeysfwf_client_release;
                        getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release = new getFeaturesToUpdatefwf_client_release();
                        getfeaturestoupdatefwf_client_release.serializer = getholdoutkeysfwf_client_release2.MediaDescriptionCompat;
                        getfeaturestoupdatefwf_client_release.MediaBrowserCompatMediaItem = getholdoutkeysfwf_client_release2.MediaBrowserCompatMediaItem;
                        getfeaturestoupdatefwf_client_release.write = getholdoutkeysfwf_client_release2.serializer;
                        getfeaturestoupdatefwf_client_release.RemoteActionCompatParcelizer = getholdoutkeysfwf_client_release2.IconCompatParcelizer;
                        getfeaturestoupdatefwf_client_release.IconCompatParcelizer = 0;
                        getholdoutkeysfwf_client_release = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release);
                    }
                    byte[] bArr2 = getholdouts.read(bArrRemoteActionCompatParcelizer, getholdoutkeysfwf_client_release.serializer());
                    if (getholdoutkeysfwf_client_release instanceof setEvaluationfwf_client_release) {
                        setEvaluationfwf_client_release setevaluationfwf_client_release2 = (setEvaluationfwf_client_release) getholdoutkeysfwf_client_release;
                        setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release2 = new setCustomerProfilefwf_client_release(0);
                        setcustomerprofilefwf_client_release2.serializer = setevaluationfwf_client_release2.MediaDescriptionCompat;
                        setcustomerprofilefwf_client_release2.MediaBrowserCompatMediaItem = setevaluationfwf_client_release2.MediaBrowserCompatMediaItem;
                        setcustomerprofilefwf_client_release2.RemoteActionCompatParcelizer = setevaluationfwf_client_release2.IconCompatParcelizer;
                        setcustomerprofilefwf_client_release2.write = setevaluationfwf_client_release2.RemoteActionCompatParcelizer;
                        setcustomerprofilefwf_client_release2.read = setevaluationfwf_client_release2.read;
                        setcustomerprofilefwf_client_release2.IconCompatParcelizer = 1;
                        getholdoutkeysfwf_client_release = new setEvaluationfwf_client_release(setcustomerprofilefwf_client_release2);
                    } else if (getholdoutkeysfwf_client_release instanceof getHoldoutKeysfwf_client_release) {
                        getHoldoutKeysfwf_client_release getholdoutkeysfwf_client_release3 = (getHoldoutKeysfwf_client_release) getholdoutkeysfwf_client_release;
                        getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release2 = new getFeaturesToUpdatefwf_client_release();
                        getfeaturestoupdatefwf_client_release2.serializer = getholdoutkeysfwf_client_release3.MediaDescriptionCompat;
                        getfeaturestoupdatefwf_client_release2.MediaBrowserCompatMediaItem = getholdoutkeysfwf_client_release3.MediaBrowserCompatMediaItem;
                        getfeaturestoupdatefwf_client_release2.write = getholdoutkeysfwf_client_release3.serializer;
                        getfeaturestoupdatefwf_client_release2.RemoteActionCompatParcelizer = getholdoutkeysfwf_client_release3.IconCompatParcelizer;
                        getfeaturestoupdatefwf_client_release2.IconCompatParcelizer = 1;
                        getholdoutkeysfwf_client_release = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release2);
                    }
                    byte[] bArr3 = getholdouts.read(bArrRemoteActionCompatParcelizer, getholdoutkeysfwf_client_release.serializer());
                    if (getholdoutkeysfwf_client_release instanceof setEvaluationfwf_client_release) {
                        setEvaluationfwf_client_release setevaluationfwf_client_release3 = (setEvaluationfwf_client_release) getholdoutkeysfwf_client_release;
                        setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release3 = new setCustomerProfilefwf_client_release(0);
                        setcustomerprofilefwf_client_release3.serializer = setevaluationfwf_client_release3.MediaDescriptionCompat;
                        setcustomerprofilefwf_client_release3.MediaBrowserCompatMediaItem = setevaluationfwf_client_release3.MediaBrowserCompatMediaItem;
                        setcustomerprofilefwf_client_release3.RemoteActionCompatParcelizer = setevaluationfwf_client_release3.IconCompatParcelizer;
                        setcustomerprofilefwf_client_release3.write = setevaluationfwf_client_release3.RemoteActionCompatParcelizer;
                        setcustomerprofilefwf_client_release3.read = setevaluationfwf_client_release3.read;
                        setcustomerprofilefwf_client_release3.IconCompatParcelizer = 2;
                        getholdoutkeysfwf_client_release = new setEvaluationfwf_client_release(setcustomerprofilefwf_client_release3);
                    } else if (getholdoutkeysfwf_client_release instanceof getHoldoutKeysfwf_client_release) {
                        getHoldoutKeysfwf_client_release getholdoutkeysfwf_client_release4 = (getHoldoutKeysfwf_client_release) getholdoutkeysfwf_client_release;
                        getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release3 = new getFeaturesToUpdatefwf_client_release();
                        getfeaturestoupdatefwf_client_release3.serializer = getholdoutkeysfwf_client_release4.MediaDescriptionCompat;
                        getfeaturestoupdatefwf_client_release3.MediaBrowserCompatMediaItem = getholdoutkeysfwf_client_release4.MediaBrowserCompatMediaItem;
                        getfeaturestoupdatefwf_client_release3.write = getholdoutkeysfwf_client_release4.serializer;
                        getfeaturestoupdatefwf_client_release3.RemoteActionCompatParcelizer = getholdoutkeysfwf_client_release4.IconCompatParcelizer;
                        getfeaturestoupdatefwf_client_release3.IconCompatParcelizer = 2;
                        getholdoutkeysfwf_client_release = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release3);
                    }
                    byte[] bArr4 = getholdouts.read(bArrRemoteActionCompatParcelizer, getholdoutkeysfwf_client_release.serializer());
                    int i2 = ((isActive) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer).write;
                    int i3 = i2 * 2;
                    byte[] bArr5 = new byte[i3];
                    for (int i4 = 0; i4 < i2; i4++) {
                        bArr5[i4] = (byte) (hsvJlNiLsgdefault.write(memoryCachedecodeFeatures1.write)[i4] ^ bArr3[i4]);
                    }
                    for (int i5 = 0; i5 < i2; i5++) {
                        bArr5[i5 + i2] = (byte) (hsvJlNiLsgdefault.write(memoryCachedecodeFeatures2.write)[i5] ^ bArr4[i5]);
                    }
                    int length = bArr2.length;
                    int i6 = getholdouts.IconCompatParcelizer;
                    if (length != i6) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("wrong key length");
                        return null;
                    }
                    if (i3 == i6 * 2) {
                        return new MemoryCachedecodeFeatures1(i, getholdouts.read(1, bArr2, bArr5));
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("wrong in length");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("height of both nodes must be equal");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("right == null");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("left == null");
        return null;
    }
}
