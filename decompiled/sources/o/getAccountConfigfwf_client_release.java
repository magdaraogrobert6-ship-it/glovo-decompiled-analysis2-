package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class getAccountConfigfwf_client_release implements Serializable {
    public final int IconCompatParcelizer;
    public final TreeMap MediaBrowserCompatMediaItem;
    public final ArrayList MediaDescriptionCompat;
    public final Stack MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final transient isContentCardsUnreadVisualIndicatorEnabled MediaSessionCompatResultReceiverWrapper;
    public boolean RatingCompat;
    public final TreeMap RemoteActionCompatParcelizer;
    public final ArrayList read;
    public int serializer;
    public transient int write;

    public final void IconCompatParcelizer(byte[] bArr, byte[] bArr2, setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release) {
        setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release2;
        int i;
        setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release3 = setcustomerprofileupdatetimefwf_client_release;
        long j = setcustomerprofileupdatetimefwf_client_release3.MediaBrowserCompatMediaItem;
        int i2 = setcustomerprofileupdatetimefwf_client_release3.MediaDescriptionCompat;
        int i3 = 0;
        setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release = new setCustomerProfilefwf_client_release(0);
        setcustomerprofilefwf_client_release.serializer = i2;
        setcustomerprofilefwf_client_release.MediaBrowserCompatMediaItem = j;
        setEvaluationfwf_client_release setevaluationfwf_client_release = new setEvaluationfwf_client_release(setcustomerprofilefwf_client_release);
        getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release = new getFeaturesToUpdatefwf_client_release();
        getfeaturestoupdatefwf_client_release.serializer = i2;
        getfeaturestoupdatefwf_client_release.MediaBrowserCompatMediaItem = j;
        getHoldoutKeysfwf_client_release getholdoutkeysfwf_client_release = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release);
        int i4 = 0;
        while (true) {
            int i5 = this.MediaSessionCompatQueueItem;
            Stack stack = this.MediaMetadataCompat;
            if (i4 < (1 << i5)) {
                setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release2 = new setCustomerProfilefwf_client_release(1);
                setcustomerprofilefwf_client_release2.serializer = setcustomerprofileupdatetimefwf_client_release3.MediaDescriptionCompat;
                setcustomerprofilefwf_client_release2.MediaBrowserCompatMediaItem = setcustomerprofileupdatetimefwf_client_release3.MediaBrowserCompatMediaItem;
                setcustomerprofilefwf_client_release2.RemoteActionCompatParcelizer = i4;
                setcustomerprofilefwf_client_release2.write = setcustomerprofileupdatetimefwf_client_release3.serializer;
                setcustomerprofilefwf_client_release2.read = setcustomerprofileupdatetimefwf_client_release3.read;
                setcustomerprofilefwf_client_release2.IconCompatParcelizer = setcustomerprofileupdatetimefwf_client_release3.write;
                setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release4 = new setCustomerProfileUpdateTimefwf_client_release(setcustomerprofilefwf_client_release2);
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = this.MediaSessionCompatResultReceiverWrapper;
                iscontentcardsunreadvisualindicatorenabled.serializer(iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer(bArr2, setcustomerprofileupdatetimefwf_client_release4), bArr);
                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_releaseIconCompatParcelizer = iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer(setcustomerprofileupdatetimefwf_client_release4);
                setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release3 = new setCustomerProfilefwf_client_release(i3);
                setcustomerprofilefwf_client_release3.serializer = setevaluationfwf_client_release.MediaDescriptionCompat;
                setcustomerprofilefwf_client_release3.MediaBrowserCompatMediaItem = setevaluationfwf_client_release.MediaBrowserCompatMediaItem;
                setcustomerprofilefwf_client_release3.RemoteActionCompatParcelizer = i4;
                setcustomerprofilefwf_client_release3.write = setevaluationfwf_client_release.RemoteActionCompatParcelizer;
                setcustomerprofilefwf_client_release3.read = setevaluationfwf_client_release.read;
                setcustomerprofilefwf_client_release3.IconCompatParcelizer = setevaluationfwf_client_release.write;
                setevaluationfwf_client_release = new setEvaluationfwf_client_release(setcustomerprofilefwf_client_release3);
                MemoryCachedecodeFeatures1 memoryCachedecodeFeatures1 = MemoryCachedecodeFeatures11.read(iscontentcardsunreadvisualindicatorenabled, sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_releaseIconCompatParcelizer, setevaluationfwf_client_release);
                getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release2 = new getFeaturesToUpdatefwf_client_release();
                getfeaturestoupdatefwf_client_release2.serializer = getholdoutkeysfwf_client_release.MediaDescriptionCompat;
                getfeaturestoupdatefwf_client_release2.MediaBrowserCompatMediaItem = getholdoutkeysfwf_client_release.MediaBrowserCompatMediaItem;
                getfeaturestoupdatefwf_client_release2.RemoteActionCompatParcelizer = i4;
                getfeaturestoupdatefwf_client_release2.IconCompatParcelizer = getholdoutkeysfwf_client_release.write;
                getholdoutkeysfwf_client_release = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release2);
                while (!stack.isEmpty()) {
                    int i6 = ((MemoryCachedecodeFeatures1) stack.peek()).IconCompatParcelizer;
                    int i7 = memoryCachedecodeFeatures1.IconCompatParcelizer;
                    if (i6 != i7) {
                        break;
                    }
                    int i8 = i4 / (1 << i7);
                    if (i8 == 1) {
                        this.read.add(memoryCachedecodeFeatures1);
                    }
                    int i9 = this.IconCompatParcelizer;
                    if (i8 == 3) {
                        if (i7 < i5 - i9) {
                            getCustomerProfileUpdateTimefwf_client_release getcustomerprofileupdatetimefwf_client_release = (getCustomerProfileUpdateTimefwf_client_release) this.MediaDescriptionCompat.get(i7);
                            getcustomerprofileupdatetimefwf_client_release.MediaSessionCompatQueueItem = memoryCachedecodeFeatures1;
                            getcustomerprofileupdatetimefwf_client_release.IconCompatParcelizer = i7;
                            setcustomerprofileupdatetimefwf_client_release2 = setcustomerprofileupdatetimefwf_client_release4;
                            if (i7 == getcustomerprofileupdatetimefwf_client_release.serializer) {
                                getcustomerprofileupdatetimefwf_client_release.read = true;
                            }
                        } else {
                            setcustomerprofileupdatetimefwf_client_release2 = setcustomerprofileupdatetimefwf_client_release4;
                        }
                        i = 3;
                    } else {
                        setcustomerprofileupdatetimefwf_client_release2 = setcustomerprofileupdatetimefwf_client_release4;
                        i = 3;
                    }
                    if (i8 >= i && (i8 & 1) == 1 && i7 >= i5 - i9 && i7 <= i5 - 2) {
                        TreeMap treeMap = this.MediaBrowserCompatMediaItem;
                        if (treeMap.get(Integer.valueOf(i7)) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(memoryCachedecodeFeatures1);
                            treeMap.put(Integer.valueOf(i7), linkedList);
                        } else {
                            ((LinkedList) treeMap.get(Integer.valueOf(i7))).add(memoryCachedecodeFeatures1);
                        }
                    }
                    getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release3 = new getFeaturesToUpdatefwf_client_release();
                    getfeaturestoupdatefwf_client_release3.serializer = getholdoutkeysfwf_client_release.MediaDescriptionCompat;
                    getfeaturestoupdatefwf_client_release3.MediaBrowserCompatMediaItem = getholdoutkeysfwf_client_release.MediaBrowserCompatMediaItem;
                    getfeaturestoupdatefwf_client_release3.write = getholdoutkeysfwf_client_release.serializer;
                    getfeaturestoupdatefwf_client_release3.RemoteActionCompatParcelizer = (getholdoutkeysfwf_client_release.IconCompatParcelizer - 1) / 2;
                    getfeaturestoupdatefwf_client_release3.IconCompatParcelizer = getholdoutkeysfwf_client_release.write;
                    getHoldoutKeysfwf_client_release getholdoutkeysfwf_client_release2 = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release3);
                    MemoryCachedecodeFeatures1 memoryCachedecodeFeatures1RemoteActionCompatParcelizer = MemoryCachedecodeFeatures11.RemoteActionCompatParcelizer(iscontentcardsunreadvisualindicatorenabled, (MemoryCachedecodeFeatures1) stack.pop(), memoryCachedecodeFeatures1, getholdoutkeysfwf_client_release2);
                    memoryCachedecodeFeatures1 = new MemoryCachedecodeFeatures1(memoryCachedecodeFeatures1RemoteActionCompatParcelizer.IconCompatParcelizer + 1, hsvJlNiLsgdefault.write(memoryCachedecodeFeatures1RemoteActionCompatParcelizer.write));
                    getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release4 = new getFeaturesToUpdatefwf_client_release();
                    getfeaturestoupdatefwf_client_release4.serializer = getholdoutkeysfwf_client_release2.MediaDescriptionCompat;
                    getfeaturestoupdatefwf_client_release4.MediaBrowserCompatMediaItem = getholdoutkeysfwf_client_release2.MediaBrowserCompatMediaItem;
                    getfeaturestoupdatefwf_client_release4.write = getholdoutkeysfwf_client_release2.serializer + 1;
                    getfeaturestoupdatefwf_client_release4.RemoteActionCompatParcelizer = getholdoutkeysfwf_client_release2.IconCompatParcelizer;
                    getfeaturestoupdatefwf_client_release4.IconCompatParcelizer = getholdoutkeysfwf_client_release2.write;
                    getholdoutkeysfwf_client_release = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release4);
                    setcustomerprofileupdatetimefwf_client_release4 = setcustomerprofileupdatetimefwf_client_release2;
                }
                stack.push(memoryCachedecodeFeatures1);
                i4++;
                setcustomerprofileupdatetimefwf_client_release3 = setcustomerprofileupdatetimefwf_client_release4;
                i3 = 0;
            } else {
                return;
            }
        }
    }

    public getAccountConfigfwf_client_release(getAccountConfigfwf_client_release getaccountconfigfwf_client_release, getNetworkModule getnetworkmodule) {
        this.MediaSessionCompatResultReceiverWrapper = new isContentCardsUnreadVisualIndicatorEnabled(new isActive(getnetworkmodule));
        this.MediaSessionCompatQueueItem = getaccountconfigfwf_client_release.MediaSessionCompatQueueItem;
        this.IconCompatParcelizer = getaccountconfigfwf_client_release.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        this.read = arrayList;
        arrayList.addAll(getaccountconfigfwf_client_release.read);
        this.MediaBrowserCompatMediaItem = new TreeMap();
        for (Integer num : getaccountconfigfwf_client_release.MediaBrowserCompatMediaItem.keySet()) {
            this.MediaBrowserCompatMediaItem.put(num, (LinkedList) ((LinkedList) getaccountconfigfwf_client_release.MediaBrowserCompatMediaItem.get(num)).clone());
        }
        Stack stack = new Stack();
        this.MediaMetadataCompat = stack;
        stack.addAll(getaccountconfigfwf_client_release.MediaMetadataCompat);
        this.MediaDescriptionCompat = new ArrayList();
        Iterator it = getaccountconfigfwf_client_release.MediaDescriptionCompat.iterator();
        while (it.hasNext()) {
            this.MediaDescriptionCompat.add(((getCustomerProfileUpdateTimefwf_client_release) it.next()).clone());
        }
        this.RemoteActionCompatParcelizer = new TreeMap((Map) getaccountconfigfwf_client_release.RemoteActionCompatParcelizer);
        int i = getaccountconfigfwf_client_release.serializer;
        this.serializer = i;
        this.write = getaccountconfigfwf_client_release.write;
        this.RatingCompat = getaccountconfigfwf_client_release.RatingCompat;
        if (this.read == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("authenticationPath == null");
            throw null;
        }
        if (this.MediaBrowserCompatMediaItem == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("retain == null");
            throw null;
        }
        if (this.MediaMetadataCompat == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("stack == null");
            throw null;
        }
        if (this.MediaDescriptionCompat == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("treeHashInstances == null");
            throw null;
        }
        if (hsvJlNiLsgdefault.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, i)) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("index in BDS state out of bounds");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:83:0x02b3  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    public final void read(byte[] bArr, byte[] bArr2, setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release) {
        int i;
        Object objRemoveFirst;
        setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release2;
        ArrayList arrayList;
        int i2;
        int i3;
        Stack stack;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        ?? r7;
        boolean z;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release3 = setcustomerprofileupdatetimefwf_client_release;
        long j2 = setcustomerprofileupdatetimefwf_client_release3.MediaBrowserCompatMediaItem;
        int i8 = setcustomerprofileupdatetimefwf_client_release3.MediaDescriptionCompat;
        if (!this.RatingCompat) {
            int i9 = this.serializer;
            int i10 = 1;
            if (i9 <= this.write - 1) {
                int i11 = 0;
                while (true) {
                    i = this.MediaSessionCompatQueueItem;
                    if (i11 >= i) {
                        i11 = 0;
                        break;
                    } else if (((i9 >> i11) & 1) == 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
                int i12 = this.serializer;
                TreeMap treeMap = this.RemoteActionCompatParcelizer;
                ArrayList arrayList2 = this.read;
                if (((i12 >> (i11 + 1)) & 1) == 0 && i11 < i - 1) {
                    treeMap.put(Integer.valueOf(i11), arrayList2.get(i11));
                }
                ArrayList<getCustomerProfileUpdateTimefwf_client_release> arrayList3 = this.MediaDescriptionCompat;
                int i13 = this.IconCompatParcelizer;
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = this.MediaSessionCompatResultReceiverWrapper;
                if (i11 == 0) {
                    setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release = new setCustomerProfilefwf_client_release(1);
                    setcustomerprofilefwf_client_release.serializer = i8;
                    setcustomerprofilefwf_client_release.MediaBrowserCompatMediaItem = j2;
                    setcustomerprofilefwf_client_release.RemoteActionCompatParcelizer = this.serializer;
                    setcustomerprofilefwf_client_release.write = setcustomerprofileupdatetimefwf_client_release3.serializer;
                    setcustomerprofilefwf_client_release.read = setcustomerprofileupdatetimefwf_client_release3.read;
                    setcustomerprofilefwf_client_release.IconCompatParcelizer = setcustomerprofileupdatetimefwf_client_release3.write;
                    setcustomerprofileupdatetimefwf_client_release3 = new setCustomerProfileUpdateTimefwf_client_release(setcustomerprofilefwf_client_release);
                    iscontentcardsunreadvisualindicatorenabled.serializer(iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer(bArr4, setcustomerprofileupdatetimefwf_client_release3), bArr3);
                    setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_releaseIconCompatParcelizer = iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer(setcustomerprofileupdatetimefwf_client_release3);
                    setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release2 = new setCustomerProfilefwf_client_release(0);
                    setcustomerprofilefwf_client_release2.serializer = i8;
                    setcustomerprofilefwf_client_release2.MediaBrowserCompatMediaItem = j2;
                    setcustomerprofilefwf_client_release2.RemoteActionCompatParcelizer = this.serializer;
                    setcustomerprofilefwf_client_release2.write = 0;
                    setcustomerprofilefwf_client_release2.read = 0;
                    setcustomerprofilefwf_client_release2.IconCompatParcelizer = 0;
                    arrayList2.set(0, MemoryCachedecodeFeatures11.read(iscontentcardsunreadvisualindicatorenabled, sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_releaseIconCompatParcelizer, new setEvaluationfwf_client_release(setcustomerprofilefwf_client_release2)));
                } else {
                    getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release = new getFeaturesToUpdatefwf_client_release();
                    getfeaturestoupdatefwf_client_release.serializer = i8;
                    getfeaturestoupdatefwf_client_release.MediaBrowserCompatMediaItem = j2;
                    int i14 = i11 - 1;
                    getfeaturestoupdatefwf_client_release.write = i14;
                    getfeaturestoupdatefwf_client_release.RemoteActionCompatParcelizer = this.serializer >> i11;
                    getfeaturestoupdatefwf_client_release.IconCompatParcelizer = 0;
                    getHoldoutKeysfwf_client_release getholdoutkeysfwf_client_release = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release);
                    iscontentcardsunreadvisualindicatorenabled.serializer(iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer(bArr4, setcustomerprofileupdatetimefwf_client_release3), bArr3);
                    MemoryCachedecodeFeatures1 memoryCachedecodeFeatures1RemoteActionCompatParcelizer = MemoryCachedecodeFeatures11.RemoteActionCompatParcelizer(iscontentcardsunreadvisualindicatorenabled, (MemoryCachedecodeFeatures1) arrayList2.get(i14), (MemoryCachedecodeFeatures1) treeMap.get(Integer.valueOf(i14)), getholdoutkeysfwf_client_release);
                    arrayList2.set(i11, new MemoryCachedecodeFeatures1(memoryCachedecodeFeatures1RemoteActionCompatParcelizer.IconCompatParcelizer + 1, hsvJlNiLsgdefault.write(memoryCachedecodeFeatures1RemoteActionCompatParcelizer.write)));
                    treeMap.remove(Integer.valueOf(i14));
                    for (int i15 = 0; i15 < i11; i15++) {
                        if (i15 < i - i13) {
                            objRemoveFirst = ((getCustomerProfileUpdateTimefwf_client_release) arrayList3.get(i15)).MediaSessionCompatQueueItem;
                        } else {
                            objRemoveFirst = ((LinkedList) this.MediaBrowserCompatMediaItem.get(Integer.valueOf(i15))).removeFirst();
                        }
                        arrayList2.set(i15, objRemoveFirst);
                    }
                    int iMin = Math.min(i11, i - i13);
                    for (int i16 = 0; i16 < iMin; i16++) {
                        int i17 = ((1 << i16) * 3) + this.serializer + 1;
                        if (i17 < (1 << i)) {
                            getCustomerProfileUpdateTimefwf_client_release getcustomerprofileupdatetimefwf_client_release = (getCustomerProfileUpdateTimefwf_client_release) arrayList3.get(i16);
                            getcustomerprofileupdatetimefwf_client_release.MediaSessionCompatQueueItem = null;
                            getcustomerprofileupdatetimefwf_client_release.IconCompatParcelizer = getcustomerprofileupdatetimefwf_client_release.serializer;
                            getcustomerprofileupdatetimefwf_client_release.RemoteActionCompatParcelizer = i17;
                            getcustomerprofileupdatetimefwf_client_release.write = true;
                            getcustomerprofileupdatetimefwf_client_release.read = false;
                        }
                    }
                }
                getCustomerProfileUpdateTimefwf_client_release getcustomerprofileupdatetimefwf_client_release2 = null;
                int i18 = 0;
                while (i18 < ((i - i13) >> i10)) {
                    getCustomerProfileUpdateTimefwf_client_release getcustomerprofileupdatetimefwf_client_release3 = getcustomerprofileupdatetimefwf_client_release2;
                    for (getCustomerProfileUpdateTimefwf_client_release getcustomerprofileupdatetimefwf_client_release4 : arrayList3) {
                        if (!getcustomerprofileupdatetimefwf_client_release4.read && getcustomerprofileupdatetimefwf_client_release4.write && (getcustomerprofileupdatetimefwf_client_release3 == null || getcustomerprofileupdatetimefwf_client_release4.RemoteActionCompatParcelizer() < getcustomerprofileupdatetimefwf_client_release3.RemoteActionCompatParcelizer() || (getcustomerprofileupdatetimefwf_client_release4.RemoteActionCompatParcelizer() == getcustomerprofileupdatetimefwf_client_release3.RemoteActionCompatParcelizer() && getcustomerprofileupdatetimefwf_client_release4.RemoteActionCompatParcelizer < getcustomerprofileupdatetimefwf_client_release3.RemoteActionCompatParcelizer))) {
                            getcustomerprofileupdatetimefwf_client_release3 = getcustomerprofileupdatetimefwf_client_release4;
                        }
                    }
                    if (getcustomerprofileupdatetimefwf_client_release3 != null) {
                        int i19 = getcustomerprofileupdatetimefwf_client_release3.serializer;
                        if (!getcustomerprofileupdatetimefwf_client_release3.read && getcustomerprofileupdatetimefwf_client_release3.write) {
                            setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release3 = new setCustomerProfilefwf_client_release(i10);
                            setcustomerprofilefwf_client_release3.serializer = setcustomerprofileupdatetimefwf_client_release3.MediaDescriptionCompat;
                            setcustomerprofilefwf_client_release3.MediaBrowserCompatMediaItem = setcustomerprofileupdatetimefwf_client_release3.MediaBrowserCompatMediaItem;
                            int i20 = getcustomerprofileupdatetimefwf_client_release3.RemoteActionCompatParcelizer;
                            setcustomerprofilefwf_client_release3.RemoteActionCompatParcelizer = i20;
                            setcustomerprofilefwf_client_release3.write = setcustomerprofileupdatetimefwf_client_release3.serializer;
                            setcustomerprofilefwf_client_release3.read = setcustomerprofileupdatetimefwf_client_release3.read;
                            setcustomerprofilefwf_client_release3.IconCompatParcelizer = setcustomerprofileupdatetimefwf_client_release3.write;
                            setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release4 = new setCustomerProfileUpdateTimefwf_client_release(setcustomerprofilefwf_client_release3);
                            setCustomerProfilefwf_client_release setcustomerprofilefwf_client_release4 = new setCustomerProfilefwf_client_release(0);
                            int i21 = setcustomerprofileupdatetimefwf_client_release4.MediaDescriptionCompat;
                            setcustomerprofilefwf_client_release4.serializer = i21;
                            long j3 = setcustomerprofileupdatetimefwf_client_release4.MediaBrowserCompatMediaItem;
                            setcustomerprofilefwf_client_release4.MediaBrowserCompatMediaItem = j3;
                            setcustomerprofilefwf_client_release4.RemoteActionCompatParcelizer = i20;
                            setcustomerprofileupdatetimefwf_client_release2 = setcustomerprofileupdatetimefwf_client_release3;
                            setEvaluationfwf_client_release setevaluationfwf_client_release = new setEvaluationfwf_client_release(setcustomerprofilefwf_client_release4);
                            getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release2 = new getFeaturesToUpdatefwf_client_release();
                            arrayList = arrayList3;
                            getfeaturestoupdatefwf_client_release2.serializer = i21;
                            getfeaturestoupdatefwf_client_release2.MediaBrowserCompatMediaItem = j3;
                            getfeaturestoupdatefwf_client_release2.RemoteActionCompatParcelizer = i20;
                            getHoldoutKeysfwf_client_release getholdoutkeysfwf_client_release2 = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release2);
                            iscontentcardsunreadvisualindicatorenabled.serializer(iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer(bArr4, setcustomerprofileupdatetimefwf_client_release4), bArr3);
                            MemoryCachedecodeFeatures1 memoryCachedecodeFeatures1 = MemoryCachedecodeFeatures11.read(iscontentcardsunreadvisualindicatorenabled, iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer(setcustomerprofileupdatetimefwf_client_release4), setevaluationfwf_client_release);
                            while (true) {
                                stack = this.MediaMetadataCompat;
                                boolean zIsEmpty = stack.isEmpty();
                                i4 = getholdoutkeysfwf_client_release2.write;
                                i5 = getholdoutkeysfwf_client_release2.IconCompatParcelizer;
                                i6 = getholdoutkeysfwf_client_release2.serializer;
                                j = getholdoutkeysfwf_client_release2.MediaBrowserCompatMediaItem;
                                i7 = getholdoutkeysfwf_client_release2.MediaDescriptionCompat;
                                if (zIsEmpty) {
                                    i2 = i;
                                    break;
                                }
                                i2 = i;
                                if (((MemoryCachedecodeFeatures1) stack.peek()).IconCompatParcelizer != memoryCachedecodeFeatures1.IconCompatParcelizer || ((MemoryCachedecodeFeatures1) stack.peek()).IconCompatParcelizer == i19) {
                                    break;
                                }
                                getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release3 = new getFeaturesToUpdatefwf_client_release();
                                getfeaturestoupdatefwf_client_release3.serializer = i7;
                                getfeaturestoupdatefwf_client_release3.MediaBrowserCompatMediaItem = j;
                                getfeaturestoupdatefwf_client_release3.write = i6;
                                getfeaturestoupdatefwf_client_release3.RemoteActionCompatParcelizer = (i5 - 1) / 2;
                                getfeaturestoupdatefwf_client_release3.IconCompatParcelizer = i4;
                                getHoldoutKeysfwf_client_release getholdoutkeysfwf_client_release3 = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release3);
                                MemoryCachedecodeFeatures1 memoryCachedecodeFeatures1RemoteActionCompatParcelizer2 = MemoryCachedecodeFeatures11.RemoteActionCompatParcelizer(iscontentcardsunreadvisualindicatorenabled, (MemoryCachedecodeFeatures1) stack.pop(), memoryCachedecodeFeatures1, getholdoutkeysfwf_client_release3);
                                MemoryCachedecodeFeatures1 memoryCachedecodeFeatures2 = new MemoryCachedecodeFeatures1(memoryCachedecodeFeatures1RemoteActionCompatParcelizer2.IconCompatParcelizer + 1, hsvJlNiLsgdefault.write(memoryCachedecodeFeatures1RemoteActionCompatParcelizer2.write));
                                getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release4 = new getFeaturesToUpdatefwf_client_release();
                                getfeaturestoupdatefwf_client_release4.serializer = getholdoutkeysfwf_client_release3.MediaDescriptionCompat;
                                getfeaturestoupdatefwf_client_release4.MediaBrowserCompatMediaItem = getholdoutkeysfwf_client_release3.MediaBrowserCompatMediaItem;
                                getfeaturestoupdatefwf_client_release4.write = getholdoutkeysfwf_client_release3.serializer + 1;
                                getfeaturestoupdatefwf_client_release4.RemoteActionCompatParcelizer = getholdoutkeysfwf_client_release3.IconCompatParcelizer;
                                getfeaturestoupdatefwf_client_release4.IconCompatParcelizer = getholdoutkeysfwf_client_release3.write;
                                getholdoutkeysfwf_client_release2 = new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release4);
                                memoryCachedecodeFeatures1 = memoryCachedecodeFeatures2;
                                i = i2;
                            }
                            MemoryCachedecodeFeatures1 memoryCachedecodeFeatures3 = getcustomerprofileupdatetimefwf_client_release3.MediaSessionCompatQueueItem;
                            if (memoryCachedecodeFeatures3 == null) {
                                i3 = i13;
                                z = true;
                            } else {
                                i3 = i13;
                                if (memoryCachedecodeFeatures3.IconCompatParcelizer == memoryCachedecodeFeatures1.IconCompatParcelizer) {
                                    getFeaturesToUpdatefwf_client_release getfeaturestoupdatefwf_client_release5 = new getFeaturesToUpdatefwf_client_release();
                                    getfeaturestoupdatefwf_client_release5.serializer = i7;
                                    getfeaturestoupdatefwf_client_release5.MediaBrowserCompatMediaItem = j;
                                    getfeaturestoupdatefwf_client_release5.write = i6;
                                    getfeaturestoupdatefwf_client_release5.RemoteActionCompatParcelizer = (i5 - 1) / 2;
                                    getfeaturestoupdatefwf_client_release5.IconCompatParcelizer = i4;
                                    z = true;
                                    memoryCachedecodeFeatures1 = new MemoryCachedecodeFeatures1(getcustomerprofileupdatetimefwf_client_release3.MediaSessionCompatQueueItem.IconCompatParcelizer + 1, hsvJlNiLsgdefault.write(MemoryCachedecodeFeatures11.RemoteActionCompatParcelizer(iscontentcardsunreadvisualindicatorenabled, memoryCachedecodeFeatures3, memoryCachedecodeFeatures1, new getHoldoutKeysfwf_client_release(getfeaturestoupdatefwf_client_release5)).write));
                                } else {
                                    r7 = 1;
                                    stack.push(memoryCachedecodeFeatures1);
                                }
                                if (getcustomerprofileupdatetimefwf_client_release3.MediaSessionCompatQueueItem.IconCompatParcelizer == i19) {
                                    getcustomerprofileupdatetimefwf_client_release3.read = r7;
                                } else {
                                    getcustomerprofileupdatetimefwf_client_release3.IconCompatParcelizer = memoryCachedecodeFeatures1.IconCompatParcelizer;
                                    getcustomerprofileupdatetimefwf_client_release3.RemoteActionCompatParcelizer += r7;
                                }
                            }
                            getcustomerprofileupdatetimefwf_client_release3.MediaSessionCompatQueueItem = memoryCachedecodeFeatures1;
                            r7 = z;
                            if (getcustomerprofileupdatetimefwf_client_release3.MediaSessionCompatQueueItem.IconCompatParcelizer == i19) {
                                getcustomerprofileupdatetimefwf_client_release3.read = r7;
                            } else {
                                getcustomerprofileupdatetimefwf_client_release3.IconCompatParcelizer = memoryCachedecodeFeatures1.IconCompatParcelizer;
                                getcustomerprofileupdatetimefwf_client_release3.RemoteActionCompatParcelizer += r7;
                            }
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("finished or not initialized");
                            return;
                        }
                    } else {
                        setcustomerprofileupdatetimefwf_client_release2 = setcustomerprofileupdatetimefwf_client_release3;
                        arrayList = arrayList3;
                        i2 = i;
                        i3 = i13;
                    }
                    i18++;
                    bArr3 = bArr;
                    bArr4 = bArr2;
                    setcustomerprofileupdatetimefwf_client_release3 = setcustomerprofileupdatetimefwf_client_release2;
                    arrayList3 = arrayList;
                    i = i2;
                    i13 = i3;
                    i10 = 1;
                    getcustomerprofileupdatetimefwf_client_release2 = null;
                }
                this.serializer++;
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("index out of bounds");
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("index already used");
    }

    public getAccountConfigfwf_client_release(getAccountConfigfwf_client_release getaccountconfigfwf_client_release) {
        this.MediaSessionCompatResultReceiverWrapper = new isContentCardsUnreadVisualIndicatorEnabled((isActive) getaccountconfigfwf_client_release.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer);
        this.MediaSessionCompatQueueItem = getaccountconfigfwf_client_release.MediaSessionCompatQueueItem;
        this.IconCompatParcelizer = getaccountconfigfwf_client_release.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        this.read = arrayList;
        arrayList.addAll(getaccountconfigfwf_client_release.read);
        this.MediaBrowserCompatMediaItem = new TreeMap();
        for (Integer num : getaccountconfigfwf_client_release.MediaBrowserCompatMediaItem.keySet()) {
            this.MediaBrowserCompatMediaItem.put(num, (LinkedList) ((LinkedList) getaccountconfigfwf_client_release.MediaBrowserCompatMediaItem.get(num)).clone());
        }
        Stack stack = new Stack();
        this.MediaMetadataCompat = stack;
        stack.addAll(getaccountconfigfwf_client_release.MediaMetadataCompat);
        this.MediaDescriptionCompat = new ArrayList();
        Iterator it = getaccountconfigfwf_client_release.MediaDescriptionCompat.iterator();
        while (it.hasNext()) {
            this.MediaDescriptionCompat.add(((getCustomerProfileUpdateTimefwf_client_release) it.next()).clone());
        }
        this.RemoteActionCompatParcelizer = new TreeMap((Map) getaccountconfigfwf_client_release.RemoteActionCompatParcelizer);
        this.serializer = getaccountconfigfwf_client_release.serializer;
        this.write = getaccountconfigfwf_client_release.write;
        this.RatingCompat = getaccountconfigfwf_client_release.RatingCompat;
    }

    public getAccountConfigfwf_client_release(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled, int i, int i2, int i3) {
        this.MediaSessionCompatResultReceiverWrapper = iscontentcardsunreadvisualindicatorenabled;
        this.MediaSessionCompatQueueItem = i;
        this.write = i3;
        this.IconCompatParcelizer = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.read = new ArrayList();
                this.MediaBrowserCompatMediaItem = new TreeMap();
                this.MediaMetadataCompat = new Stack();
                this.MediaDescriptionCompat = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.MediaDescriptionCompat.add(new getCustomerProfileUpdateTimefwf_client_release(i5));
                }
                this.RemoteActionCompatParcelizer = new TreeMap();
                this.serializer = 0;
                this.RatingCompat = false;
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("illegal value for BDS parameter k");
        throw null;
    }

    public getAccountConfigfwf_client_release(getAccountConfigfwf_client_release getaccountconfigfwf_client_release, byte[] bArr, byte[] bArr2, setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release) {
        this.MediaSessionCompatResultReceiverWrapper = new isContentCardsUnreadVisualIndicatorEnabled((isActive) getaccountconfigfwf_client_release.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer);
        this.MediaSessionCompatQueueItem = getaccountconfigfwf_client_release.MediaSessionCompatQueueItem;
        this.IconCompatParcelizer = getaccountconfigfwf_client_release.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        this.read = arrayList;
        arrayList.addAll(getaccountconfigfwf_client_release.read);
        this.MediaBrowserCompatMediaItem = new TreeMap();
        for (Integer num : getaccountconfigfwf_client_release.MediaBrowserCompatMediaItem.keySet()) {
            this.MediaBrowserCompatMediaItem.put(num, (LinkedList) ((LinkedList) getaccountconfigfwf_client_release.MediaBrowserCompatMediaItem.get(num)).clone());
        }
        Stack stack = new Stack();
        this.MediaMetadataCompat = stack;
        stack.addAll(getaccountconfigfwf_client_release.MediaMetadataCompat);
        this.MediaDescriptionCompat = new ArrayList();
        Iterator it = getaccountconfigfwf_client_release.MediaDescriptionCompat.iterator();
        while (it.hasNext()) {
            this.MediaDescriptionCompat.add(((getCustomerProfileUpdateTimefwf_client_release) it.next()).clone());
        }
        this.RemoteActionCompatParcelizer = new TreeMap((Map) getaccountconfigfwf_client_release.RemoteActionCompatParcelizer);
        this.serializer = getaccountconfigfwf_client_release.serializer;
        this.write = getaccountconfigfwf_client_release.write;
        this.RatingCompat = false;
        read(bArr, bArr2, setcustomerprofileupdatetimefwf_client_release);
    }

    public getAccountConfigfwf_client_release(MemoryCacheclearEvaluations1 memoryCacheclearEvaluations1, byte[] bArr, byte[] bArr2, setCustomerProfileUpdateTimefwf_client_release setcustomerprofileupdatetimefwf_client_release) {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(memoryCacheclearEvaluations1.RatingCompat);
        int i = memoryCacheclearEvaluations1.RemoteActionCompatParcelizer;
        this(iscontentcardsunreadvisualindicatorenabled, i, memoryCacheclearEvaluations1.serializer, (1 << i) - 1);
        IconCompatParcelizer(bArr, bArr2, setcustomerprofileupdatetimefwf_client_release);
    }
}
