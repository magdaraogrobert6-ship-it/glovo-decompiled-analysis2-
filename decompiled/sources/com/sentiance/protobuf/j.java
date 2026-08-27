package com.sentiance.protobuf;

import java.util.ArrayList;
import java.util.List;
import o.AbstractC0170getTimestamp;
import o.AndroidContentCaptureManagercurrentSemanticsNodes1;
import o.AndroidContentCaptureManagersendContentCaptureAppearEvents1;
import o.ContentInViewNode;
import o.IValueCallback;
import o.accesssetDiskLruCachep;
import o.animateToWithDecay;
import o.component4;
import o.createFromAutofillValue;
import o.fromStringlambda1;
import o.getBirthDateYear;
import o.getCieXyz;
import o.getCreditCardExpirationDay;
import o.getCreditCardExpirationMonth;
import o.getPhoneNumberDevice;
import o.getRequestInitiationTime;
import o.getType;
import o.getUnviewedCardCount;
import o.instance_delegatelambda0;
import o.isFromOfflineStorage;
import o.onLayoutDirectionChange;
import o.onSuccess;
import o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY;
import o.r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0;
import o.r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4;
import o.removeNodeAtDepth;
import o.updateBuffersOnDisappeared;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static List RemoteActionCompatParcelizer(getType gettype) {
        return IconCompatParcelizer(gettype, (Integer) null, gettype.IconCompatParcelizer, (Integer) null);
    }

    public static int IconCompatParcelizer(byte[] bArr, int i, onSuccess onsuccess, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) onsuccess;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iIconCompatParcelizer;
        while (iIconCompatParcelizer < i2) {
            r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(write(iIconCompatParcelizer, bArr));
            iIconCompatParcelizer += 8;
        }
        if (iIconCompatParcelizer == i2) {
            return iIconCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    public static int MediaMetadataCompat(byte[] bArr, int i, onSuccess onsuccess, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) onsuccess;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iIconCompatParcelizer;
        while (iIconCompatParcelizer < i2) {
            iIconCompatParcelizer = serializer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(u.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
        }
        if (iIconCompatParcelizer == i2) {
            return iIconCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    public static int MediaSessionCompatQueueItem(byte[] bArr, int i, onSuccess onsuccess, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) onsuccess;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iIconCompatParcelizer;
        while (iIconCompatParcelizer < i2) {
            iIconCompatParcelizer = IconCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            getunviewedcardcount.IconCompatParcelizer(u.serializer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
        }
        if (iIconCompatParcelizer == i2) {
            return iIconCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    public static int RatingCompat(byte[] bArr, int i, onSuccess onsuccess, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) onsuccess;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iIconCompatParcelizer;
        while (iIconCompatParcelizer < i2) {
            iIconCompatParcelizer = IconCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            getunviewedcardcount.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer);
        }
        if (iIconCompatParcelizer == i2) {
            return iIconCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.onLayoutDirectionChange] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList RemoteActionCompatParcelizer(component4 component4Var, int i, Integer num) {
        ?? onlayoutdirectionchange = new onLayoutDirectionChange(component4Var);
        i = component4Var.MediaSessionCompatQueueItem(i);
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = component4Var.read(i);
        while (i >= 0) {
            onlayoutdirectionchange.write(component4Var.write(i), component4Var.IconCompatParcelizer(i) ? component4Var.RemoteActionCompatParcelizer(component4Var.RatingCompat, i) : getCreditCardExpirationMonth.write, component4Var.ParcelableVolumeInfo.read(i), num);
            if (i >= 0) {
                AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes2 = androidContentCaptureManagercurrentSemanticsNodes1;
                androidContentCaptureManagercurrentSemanticsNodes1 = component4Var.read(i);
                i = component4Var.MediaSessionCompatQueueItem(i);
                num = androidContentCaptureManagercurrentSemanticsNodes2;
            } else {
                num = androidContentCaptureManagercurrentSemanticsNodes1;
            }
        }
        return onlayoutdirectionchange.write;
    }

    public static int read(byte[] bArr, int i, onSuccess onsuccess, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        accesssetDiskLruCachep accesssetdisklrucachep = (accesssetDiskLruCachep) onsuccess;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iIconCompatParcelizer;
        while (iIconCompatParcelizer < i2) {
            accesssetdisklrucachep.RemoteActionCompatParcelizer(Double.longBitsToDouble(write(iIconCompatParcelizer, bArr)));
            iIconCompatParcelizer += 8;
        }
        if (iIconCompatParcelizer == i2) {
            return iIconCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    public static int serializer(byte[] bArr, int i, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.serializer = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & 127)) << i4;
            i3++;
        }
        r8lambdacyuxafptvn7drfel1dgtevxcy.serializer = j2;
        return i3;
    }

    public static int write(int i, byte[] bArr, int i2, int i3, onSuccess onsuccess, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) onsuccess;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        getunviewedcardcount.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer);
        while (iIconCompatParcelizer < i3) {
            int iIconCompatParcelizer2 = IconCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            iIconCompatParcelizer = IconCompatParcelizer(bArr, iIconCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            getunviewedcardcount.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer);
        }
        return iIconCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.onLayoutDirectionChange] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [o.AndroidContentCaptureManagercurrentSemanticsNodes1] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List IconCompatParcelizer(getType gettype, Integer num, int i, Integer num2) {
        int iSerializer;
        int iMediaSessionCompatQueueItem;
        ContentInViewNode contentInViewNode;
        if (gettype.serializer || gettype.IconCompatParcelizer() == 0) {
            return instance_delegatelambda0.write;
        }
        ?? onlayoutdirectionchange = new onLayoutDirectionChange(gettype);
        if (num2 != null) {
            iSerializer = num2.intValue();
        } else {
            iSerializer = gettype.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (iSerializer < 0) {
                iSerializer = gettype.serializer(gettype.PlaybackStateCompatCustomAction, i);
            }
        }
        if (num == 0) {
            int i2 = gettype.MediaDescriptionCompat;
            int iWrite = gettype.write(gettype.PlaybackStateCompatCustomAction, gettype.MediaBrowserCompatMediaItem(i));
            animateToWithDecay animatetowithdecay = gettype.MediaBrowserCompatMediaItem;
            num = Integer.valueOf((i2 - iWrite) + ((animatetowithdecay == null || (contentInViewNode = (ContentInViewNode) animatetowithdecay.serializer(i)) == null) ? 0 : contentInViewNode.IconCompatParcelizer));
        }
        int iMediaBrowserCompatMediaItem = gettype.MediaBrowserCompatMediaItem(i);
        int[] iArr = gettype.PlaybackStateCompatCustomAction;
        if (iMediaBrowserCompatMediaItem * 5 < iArr.length) {
            iMediaSessionCompatQueueItem = gettype.MediaSessionCompatQueueItem(i);
        } else {
            int iSerializer2 = iSerializer >= 0 ? gettype.serializer(iArr, iSerializer) : iSerializer;
            iMediaSessionCompatQueueItem = gettype.MediaSessionCompatQueueItem(iSerializer);
            int i3 = iSerializer;
            iSerializer = iSerializer2;
            i = i3;
        }
        while (i >= 0) {
            onlayoutdirectionchange.write(iMediaSessionCompatQueueItem, (gettype.PlaybackStateCompatCustomAction[(gettype.MediaBrowserCompatMediaItem(i) * 5) + 1] & 536870912) != 0 ? gettype.RatingCompat(i) : getCreditCardExpirationMonth.write, gettype.MediaSessionCompatToken(i), num);
            num = gettype.serializer(i);
            if (iSerializer >= 0) {
                int iSerializer3 = gettype.serializer(gettype.PlaybackStateCompatCustomAction, iSerializer);
                iMediaSessionCompatQueueItem = gettype.MediaSessionCompatQueueItem(iSerializer);
                int i4 = iSerializer;
                iSerializer = iSerializer3;
                i = i4;
            } else {
                i = iSerializer;
            }
        }
        return onlayoutdirectionchange.write;
    }

    public static final Integer RemoteActionCompatParcelizer(AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1, getBirthDateYear getbirthdateyear) {
        component4 component4VarSerializer = androidContentCaptureManagersendContentCaptureAppearEvents1.serializer();
        try {
            return write(component4VarSerializer, getbirthdateyear, 0, component4VarSerializer.MediaSessionCompatQueueItem);
        } finally {
            component4VarSerializer.write();
        }
    }

    public static long write(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static final Integer write(component4 component4Var, getBirthDateYear getbirthdateyear, int i, int i2) {
        Integer numWrite;
        int[] iArr = component4Var.RatingCompat;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (component4Var.RemoteActionCompatParcelizer(i) && component4Var.write(i) == 206) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{component4Var.RemoteActionCompatParcelizer(iArr, i), getCreditCardExpirationDay.serializer}, getCieXyz.write())).booleanValue()) {
                    Object objSerializer = component4Var.serializer(i, 0);
                    createFromAutofillValue createfromautofillvalue = objSerializer instanceof createFromAutofillValue ? (createFromAutofillValue) objSerializer : null;
                    updateBuffersOnDisappeared updatebuffersondisappeared = createfromautofillvalue != null ? createfromautofillvalue.read : null;
                    getPhoneNumberDevice getphonenumberdevice = updatebuffersondisappeared instanceof getPhoneNumberDevice ? (getPhoneNumberDevice) updatebuffersondisappeared : null;
                    if (getphonenumberdevice != null && getphonenumberdevice.serializer == getbirthdateyear) {
                        return Integer.valueOf(i);
                    }
                }
            }
            if (component4Var.serializer(i) && (numWrite = write(component4Var, getbirthdateyear, i + 1, i3)) != null) {
                return Integer.valueOf(numWrite.intValue());
            }
            i = i3;
        }
    }

    public static int RemoteActionCompatParcelizer(int i, byte[] bArr, int i2, int i3, IValueCallback iValueCallback, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.write();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iSerializer = serializer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            iValueCallback.write(i, Long.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
            return iSerializer;
        }
        if (i4 == 1) {
            iValueCallback.write(i, Long.valueOf(write(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iIconCompatParcelizer = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            int i5 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
            if (i5 >= 0) {
                if (i5 > bArr.length - iIconCompatParcelizer) {
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (i5 == 0) {
                    iValueCallback.write(i, ByteString.RemoteActionCompatParcelizer);
                } else {
                    iValueCallback.write(i, ByteString.write(bArr, iIconCompatParcelizer, i5));
                }
                return iIconCompatParcelizer + i5;
            }
            throw InvalidProtocolBufferException.serializer();
        }
        if (i4 != 3) {
            if (i4 == 5) {
                iValueCallback.write(i, Integer.valueOf(serializer(i2, bArr)));
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.write();
        }
        IValueCallback iValueCallback2 = new IValueCallback();
        int i6 = (i & (-8)) | 4;
        int i7 = r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat + 1;
        r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat = i7;
        if (i7 < 100) {
            int i8 = 0;
            while (i2 < i3) {
                int iIconCompatParcelizer2 = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                int i9 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                if (i9 == i6) {
                    i8 = i9;
                    i2 = iIconCompatParcelizer2;
                    break;
                }
                i8 = i9;
                i2 = RemoteActionCompatParcelizer(i9, bArr, iIconCompatParcelizer2, i3, iValueCallback2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            }
            r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat--;
            if (i2 <= i3 && i8 == i6) {
                iValueCallback.write(i, iValueCallback2);
                return i2;
            }
            throw InvalidProtocolBufferException.RatingCompat();
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int IconCompatParcelizer(byte[] bArr, int i, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer = b;
            return i2;
        }
        return serializer(b, bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr, int i, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.serializer();
        }
        if (i2 == 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.read = "";
            return iIconCompatParcelizer;
        }
        r8lambdacyuxafptvn7drfel1dgtevxcy.read = new String(bArr, iIconCompatParcelizer, i2, isFromOfflineStorage.read);
        return iIconCompatParcelizer + i2;
    }

    public static int serializer(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int serializer(fromStringlambda1 fromstringlambda1, int i, byte[] bArr, int i2, int i3, onSuccess onsuccess, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int i4 = read(fromstringlambda1, bArr, i2, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
        onsuccess.add(r8lambdacyuxafptvn7drfel1dgtevxcy.read);
        while (i4 < i3) {
            int iIconCompatParcelizer = IconCompatParcelizer(bArr, i4, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            i4 = read(fromstringlambda1, bArr, iIconCompatParcelizer, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
            onsuccess.add(r8lambdacyuxafptvn7drfel1dgtevxcy.read);
        }
        return i4;
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr, int i, onSuccess onsuccess, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        getRequestInitiationTime getrequestinitiationtime = (getRequestInitiationTime) onsuccess;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iIconCompatParcelizer;
        while (iIconCompatParcelizer < i2) {
            getrequestinitiationtime.write(Float.intBitsToFloat(serializer(iIconCompatParcelizer, bArr)));
            iIconCompatParcelizer += 4;
        }
        if (iIconCompatParcelizer == i2) {
            return iIconCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    public static int write(byte[] bArr, int i, onSuccess onsuccess, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) onsuccess;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iIconCompatParcelizer;
        while (iIconCompatParcelizer < i2) {
            getunviewedcardcount.IconCompatParcelizer(serializer(iIconCompatParcelizer, bArr));
            iIconCompatParcelizer += 4;
        }
        if (iIconCompatParcelizer == i2) {
            return iIconCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    public static final List serializer(component4 component4Var) {
        Object objRemoteActionCompatParcelizer;
        boolean z = component4Var.read;
        int[] iArr = component4Var.RatingCompat;
        if (!z && component4Var.MediaSessionCompatQueueItem != 0) {
            onLayoutDirectionChange onlayoutdirectionchange = new onLayoutDirectionChange(component4Var);
            int iMediaSessionCompatQueueItem = component4Var.PlaybackStateCompat;
            Object objValueOf = Integer.valueOf(component4Var.IconCompatParcelizer - AbstractC0170getTimestamp.read(iArr, iMediaSessionCompatQueueItem));
            while (iMediaSessionCompatQueueItem >= 0) {
                if (component4Var.IconCompatParcelizer(iMediaSessionCompatQueueItem)) {
                    objRemoteActionCompatParcelizer = component4Var.RemoteActionCompatParcelizer(iArr, iMediaSessionCompatQueueItem);
                } else {
                    objRemoteActionCompatParcelizer = getCreditCardExpirationMonth.write;
                }
                onlayoutdirectionchange.write(component4Var.write(iMediaSessionCompatQueueItem), objRemoteActionCompatParcelizer, component4Var.ParcelableVolumeInfo.read(iMediaSessionCompatQueueItem), objValueOf);
                objValueOf = component4Var.read(iMediaSessionCompatQueueItem);
                iMediaSessionCompatQueueItem = component4Var.MediaSessionCompatQueueItem(iMediaSessionCompatQueueItem);
            }
            return onlayoutdirectionchange.write;
        }
        return instance_delegatelambda0.write;
    }

    public static int write(byte[] bArr, int i, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        if (i2 >= 0) {
            if (i2 > bArr.length - iIconCompatParcelizer) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            if (i2 == 0) {
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = ByteString.RemoteActionCompatParcelizer;
                return iIconCompatParcelizer;
            }
            r8lambdacyuxafptvn7drfel1dgtevxcy.read = ByteString.write(bArr, iIconCompatParcelizer, i2);
            return iIconCompatParcelizer + i2;
        }
        throw InvalidProtocolBufferException.serializer();
    }

    public static int read(fromStringlambda1 fromstringlambda1, byte[] bArr, int i, int i2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteSerializer = fromstringlambda1.serializer();
        int i3 = read(generatedMessageLiteSerializer, fromstringlambda1, bArr, i, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        fromstringlambda1.IconCompatParcelizer((Object) generatedMessageLiteSerializer);
        r8lambdacyuxafptvn7drfel1dgtevxcy.read = generatedMessageLiteSerializer;
        return i3;
    }

    public static int read(Object obj, fromStringlambda1 fromstringlambda1, byte[] bArr, int i, int i2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iSerializer = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iSerializer = serializer(i3, bArr, iSerializer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            i3 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        }
        int i4 = iSerializer;
        if (i3 >= 0 && i3 <= i2 - i4) {
            int i5 = r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat + 1;
            r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat = i5;
            if (i5 < 100) {
                int i6 = i3 + i4;
                fromstringlambda1.RemoteActionCompatParcelizer(obj, bArr, i4, i6, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat--;
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = obj;
                return i6;
            }
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    public static int read(Object obj, fromStringlambda1 fromstringlambda1, byte[] bArr, int i, int i2, int i3, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        u0 u0Var = (u0) fromstringlambda1;
        int i4 = r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat + 1;
        r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat = i4;
        if (i4 < 100) {
            int iIconCompatParcelizer = u0Var.IconCompatParcelizer(obj, bArr, i, i2, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
            r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat--;
            r8lambdacyuxafptvn7drfel1dgtevxcy.read = obj;
            return iIconCompatParcelizer;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int serializer(byte[] bArr, int i, onSuccess onsuccess, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4 r8lambdad9d8zanadasmqv1rdea0gwxvs4 = (r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4) onsuccess;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iIconCompatParcelizer;
        while (iIconCompatParcelizer < i2) {
            iIconCompatParcelizer = serializer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            r8lambdad9d8zanadasmqv1rdea0gwxvs4.read(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0);
        }
        if (iIconCompatParcelizer == i2) {
            return iIconCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    public static int serializer(int i, byte[] bArr, int i2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer = i9 | (b4 << 28);
            return i10;
        }
        while (true) {
            int i11 = i10 + 1;
            if (bArr[i10] >= 0) {
                r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer = i9 | ((b4 & 127) << 28);
                return i11;
            }
            i10 = i11;
        }
    }

    public static int RemoteActionCompatParcelizer(int i, byte[] bArr, int i2, int i3, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.write();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return serializer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy) + r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.write();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            i6 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
            if (i6 == i5) {
                break;
            }
            i2 = RemoteActionCompatParcelizer(i6, bArr, i2, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.RatingCompat();
        }
        return i2;
    }
}
