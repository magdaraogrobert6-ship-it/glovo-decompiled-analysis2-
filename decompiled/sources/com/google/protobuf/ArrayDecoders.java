package com.google.protobuf;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.ChainedPlatformTextInputInterceptortextInputSession2scope1startInputMethod31;
import o.ClipEntry;
import o.CompositionLocalsKtLocalClipboard1;
import o.CompositionLocalsKtLocalInputModeManager1;
import o.CompositionLocalsKtLocalLocale1;
import o.CompositionLocalsKtLocalProvidableScrollCaptureInProgress1;
import o.CompositionLocalsKtLocalWindowInfo1;
import o.DebugUtilsKt;
import o.DisposableSaveableStateRegistrylambda0;
import o.GraphicsLayerOwnerLayer;
import o.IndirectPointerNavigationGestureDetector;
import o.component26;
import o.decodeString;
import o.getClipMetadata;
import o.getDpSizeMYxV2XQ;
import o.getElevation;
import o.getLocalDensity;
import o.getLocalProvidableScrollCaptureInProgress;
import o.ifDebug;
import o.onScroll;
import o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.registerProvider;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ArrayDecoders {
    public static int IconCompatParcelizer(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        getLocalDensity getlocaldensity = (getLocalDensity) decodestring;
        getlocaldensity.IconCompatParcelizer(IconCompatParcelizer(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i4, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            getlocaldensity.IconCompatParcelizer(Double.longBitsToDouble(read(iRemoteActionCompatParcelizer, bArr)));
            i4 = iRemoteActionCompatParcelizer + 8;
        }
        return i4;
    }

    public static int IconCompatParcelizer(Object obj, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0, byte[] bArr, int i, int i2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iRemoteActionCompatParcelizer = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i3, bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            i3 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        }
        int i4 = iRemoteActionCompatParcelizer;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        int i5 = r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat + 1;
        r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat = i5;
        if (i5 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i3 + i4;
        disposableSaveableStateRegistrylambda0.read(obj, bArr, i4, i6, r8lambdacyuxafptvn7drfel1dgtevxcy);
        r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat--;
        r8lambdacyuxafptvn7drfel1dgtevxcy.read = obj;
        return i6;
    }

    public static int IconCompatParcelizer(byte[] bArr, int i, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iRemoteActionCompatParcelizer;
        while (iRemoteActionCompatParcelizer < i2) {
            debugUtilsKt.IconCompatParcelizer(serializer(iRemoteActionCompatParcelizer, bArr));
            iRemoteActionCompatParcelizer += 4;
        }
        if (iRemoteActionCompatParcelizer == i2) {
            return iRemoteActionCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    public static int IconCompatParcelizer(byte[] bArr, int i, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
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

    public static int MediaBrowserCompatMediaItem(byte[] bArr, int i, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iRemoteActionCompatParcelizer;
        while (iRemoteActionCompatParcelizer < i2) {
            iRemoteActionCompatParcelizer = IconCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            getdpsizemyxv2xq.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer);
        }
        if (iRemoteActionCompatParcelizer == i2) {
            return iRemoteActionCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    public static int MediaDescriptionCompat(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) decodestring;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        getdpsizemyxv2xq.IconCompatParcelizer(CodedInputStream.read(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
        while (iIconCompatParcelizer < i3) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            iIconCompatParcelizer = IconCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            getdpsizemyxv2xq.IconCompatParcelizer(CodedInputStream.read(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
        }
        return iIconCompatParcelizer;
    }

    public static int MediaMetadataCompat(byte[] bArr, int i, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iRemoteActionCompatParcelizer;
        while (iRemoteActionCompatParcelizer < i2) {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            debugUtilsKt.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer);
        }
        if (iRemoteActionCompatParcelizer == i2) {
            return iRemoteActionCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    public static int MediaSessionCompatQueueItem(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        CompositionLocalsKtLocalInputModeManager1 compositionLocalsKtLocalInputModeManager1 = (CompositionLocalsKtLocalInputModeManager1) decodestring;
        compositionLocalsKtLocalInputModeManager1.IconCompatParcelizer(write(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i4, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            compositionLocalsKtLocalInputModeManager1.IconCompatParcelizer(Float.intBitsToFloat(serializer(iRemoteActionCompatParcelizer, bArr)));
            i4 = iRemoteActionCompatParcelizer + 4;
        }
        return i4;
    }

    public static int MediaSessionCompatQueueItem(byte[] bArr, int i, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iRemoteActionCompatParcelizer;
        while (iRemoteActionCompatParcelizer < i2) {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            debugUtilsKt.IconCompatParcelizer(CodedInputStream.write(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
        }
        if (iRemoteActionCompatParcelizer == i2) {
            return iRemoteActionCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    public static int ParcelableVolumeInfo(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        debugUtilsKt.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer);
        while (iRemoteActionCompatParcelizer < i3) {
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            debugUtilsKt.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer);
        }
        return iRemoteActionCompatParcelizer;
    }

    public static int PlaybackStateCompatCustomAction(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) decodestring;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        getdpsizemyxv2xq.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer);
        while (iIconCompatParcelizer < i3) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            iIconCompatParcelizer = IconCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            getdpsizemyxv2xq.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer);
        }
        return iIconCompatParcelizer;
    }

    public static int RatingCompat(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        debugUtilsKt.IconCompatParcelizer(CodedInputStream.write(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
        while (iRemoteActionCompatParcelizer < i3) {
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            debugUtilsKt.IconCompatParcelizer(CodedInputStream.write(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
        }
        return iRemoteActionCompatParcelizer;
    }

    public static int RatingCompat(byte[] bArr, int i, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iRemoteActionCompatParcelizer;
        while (iRemoteActionCompatParcelizer < i2) {
            iRemoteActionCompatParcelizer = IconCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            getdpsizemyxv2xq.IconCompatParcelizer(CodedInputStream.read(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
        }
        if (iRemoteActionCompatParcelizer == i2) {
            return iRemoteActionCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    public static int RemoteActionCompatParcelizer(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) decodestring;
        getdpsizemyxv2xq.IconCompatParcelizer(read(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i4, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            getdpsizemyxv2xq.IconCompatParcelizer(read(iRemoteActionCompatParcelizer, bArr));
            i4 = iRemoteActionCompatParcelizer + 8;
        }
        return i4;
    }

    public static int RemoteActionCompatParcelizer(Object obj, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0, byte[] bArr, int i, int i2, int i3, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        MessageSchema messageSchema = (MessageSchema) disposableSaveableStateRegistrylambda0;
        int i4 = r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat + 1;
        r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat = i4;
        if (i4 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iRemoteActionCompatParcelizer = messageSchema.RemoteActionCompatParcelizer(obj, bArr, i, i2, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
        r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat--;
        r8lambdacyuxafptvn7drfel1dgtevxcy.read = obj;
        return iRemoteActionCompatParcelizer;
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr, int i, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        getLocalDensity getlocaldensity = (getLocalDensity) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iRemoteActionCompatParcelizer;
        while (iRemoteActionCompatParcelizer < i2) {
            getlocaldensity.IconCompatParcelizer(Double.longBitsToDouble(read(iRemoteActionCompatParcelizer, bArr)));
            iRemoteActionCompatParcelizer += 8;
        }
        if (iRemoteActionCompatParcelizer == i2) {
            return iRemoteActionCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    public static int read(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) decodestring;
        debugUtilsKt.IconCompatParcelizer(serializer(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i4, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            debugUtilsKt.IconCompatParcelizer(serializer(iRemoteActionCompatParcelizer, bArr));
            i4 = iRemoteActionCompatParcelizer + 4;
        }
        return i4;
    }

    public static int read(byte[] bArr, int i, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iRemoteActionCompatParcelizer;
        while (iRemoteActionCompatParcelizer < i2) {
            getdpsizemyxv2xq.IconCompatParcelizer(read(iRemoteActionCompatParcelizer, bArr));
            iRemoteActionCompatParcelizer += 8;
        }
        if (iRemoteActionCompatParcelizer == i2) {
            return iRemoteActionCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    public static int serializer(byte[] bArr, int i, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        CompositionLocalsKtLocalInputModeManager1 compositionLocalsKtLocalInputModeManager1 = (CompositionLocalsKtLocalInputModeManager1) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iRemoteActionCompatParcelizer;
        while (iRemoteActionCompatParcelizer < i2) {
            compositionLocalsKtLocalInputModeManager1.IconCompatParcelizer(Float.intBitsToFloat(serializer(iRemoteActionCompatParcelizer, bArr)));
            iRemoteActionCompatParcelizer += 4;
        }
        if (iRemoteActionCompatParcelizer == i2) {
            return iRemoteActionCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    public static int write(int i, byte[] bArr, int i2, int i3, Object obj, getElevation getelevation, UnknownFieldSchema unknownFieldSchema, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        Object objValueOf;
        int iIconCompatParcelizer;
        int i4;
        int i5 = i >>> 3;
        CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer = ((getLocalProvidableScrollCaptureInProgress) r8lambdacyuxafptvn7drfel1dgtevxcy.IconCompatParcelizer).RemoteActionCompatParcelizer(i5, getelevation);
        if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer == null) {
            return RemoteActionCompatParcelizer(i, bArr, i2, i3, MessageSchema.RemoteActionCompatParcelizer(obj), r8lambdacyuxafptvn7drfel1dgtevxcy);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = extendableMessage.extensions;
        CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer.write;
        getElevation getelevation2 = compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer.serializer;
        boolean z = compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer;
        onScroll onscroll = compositionLocalsKtLocalLocale1.write;
        if (z && compositionLocalsKtLocalLocale1.read) {
            switch (ChainedPlatformTextInputInterceptortextInputSession2scope1startInputMethod31.IconCompatParcelizer[onscroll.ordinal()]) {
                case 1:
                    getLocalDensity getlocaldensity = new getLocalDensity(new double[10], 0, true);
                    int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i2, getlocaldensity, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, getlocaldensity);
                    return iRemoteActionCompatParcelizer;
                case 2:
                    CompositionLocalsKtLocalInputModeManager1 compositionLocalsKtLocalInputModeManager1 = new CompositionLocalsKtLocalInputModeManager1(new float[10], 0, true);
                    int iSerializer = serializer(bArr, i2, compositionLocalsKtLocalInputModeManager1, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, compositionLocalsKtLocalInputModeManager1);
                    return iSerializer;
                case 3:
                case 4:
                    getDpSizeMYxV2XQ getdpsizemyxv2xq = new getDpSizeMYxV2XQ();
                    int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(bArr, i2, getdpsizemyxv2xq, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, getdpsizemyxv2xq);
                    return iMediaBrowserCompatMediaItem;
                case 5:
                case 6:
                    DebugUtilsKt debugUtilsKt = new DebugUtilsKt();
                    int iMediaMetadataCompat = MediaMetadataCompat(bArr, i2, debugUtilsKt, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, debugUtilsKt);
                    return iMediaMetadataCompat;
                case 7:
                case 8:
                    getDpSizeMYxV2XQ getdpsizemyxv2xq2 = new getDpSizeMYxV2XQ();
                    int i6 = read(bArr, i2, getdpsizemyxv2xq2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, getdpsizemyxv2xq2);
                    return i6;
                case 9:
                case 10:
                    DebugUtilsKt debugUtilsKt2 = new DebugUtilsKt();
                    int iIconCompatParcelizer2 = IconCompatParcelizer(bArr, i2, debugUtilsKt2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, debugUtilsKt2);
                    return iIconCompatParcelizer2;
                case 11:
                    ClipEntry clipEntry = new ClipEntry(new boolean[10], 0, true);
                    int iWrite = write(bArr, i2, clipEntry, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, clipEntry);
                    return iWrite;
                case 12:
                    DebugUtilsKt debugUtilsKt3 = new DebugUtilsKt();
                    int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(bArr, i2, debugUtilsKt3, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, debugUtilsKt3);
                    return iMediaSessionCompatQueueItem;
                case 13:
                    getDpSizeMYxV2XQ getdpsizemyxv2xq3 = new getDpSizeMYxV2XQ();
                    int iRatingCompat = RatingCompat(bArr, i2, getdpsizemyxv2xq3, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, getdpsizemyxv2xq3);
                    return iRatingCompat;
                case 14:
                    DebugUtilsKt debugUtilsKt4 = new DebugUtilsKt();
                    int iMediaMetadataCompat2 = MediaMetadataCompat(bArr, i2, debugUtilsKt4, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    registerProvider.read(extendableMessage, i5, debugUtilsKt4, compositionLocalsKtLocalLocale1.serializer, null, unknownFieldSchema);
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, debugUtilsKt4);
                    return iMediaMetadataCompat2;
                default:
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(compositionLocalsKtLocalLocale1.write, "Type cannot be packed: ");
                    return 0;
            }
        }
        Object objValueOf2 = null;
        if (onscroll != onScroll.ENUM) {
            switch (ChainedPlatformTextInputInterceptortextInputSession2scope1startInputMethod31.IconCompatParcelizer[onscroll.ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(IconCompatParcelizer(i2, bArr));
                    i4 = i2 + 8;
                    objValueOf2 = objValueOf;
                    iIconCompatParcelizer = i4;
                    break;
                case 2:
                    objValueOf = Float.valueOf(write(i2, bArr));
                    i4 = i2 + 4;
                    objValueOf2 = objValueOf;
                    iIconCompatParcelizer = i4;
                    break;
                case 3:
                case 4:
                    iIconCompatParcelizer = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    objValueOf2 = Long.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer);
                    break;
                case 5:
                case 6:
                    iIconCompatParcelizer = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    objValueOf2 = Integer.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(read(i2, bArr));
                    i4 = i2 + 8;
                    objValueOf2 = objValueOf;
                    iIconCompatParcelizer = i4;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(serializer(i2, bArr));
                    i4 = i2 + 4;
                    objValueOf2 = objValueOf;
                    iIconCompatParcelizer = i4;
                    break;
                case 11:
                    iIconCompatParcelizer = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    objValueOf2 = Boolean.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0);
                    break;
                case 12:
                    iIconCompatParcelizer = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    objValueOf2 = Integer.valueOf(CodedInputStream.write(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
                    break;
                case 13:
                    iIconCompatParcelizer = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    objValueOf2 = Long.valueOf(CodedInputStream.read(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
                    break;
                case 14:
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Shouldn't reach here.");
                    return 0;
                case 15:
                    iIconCompatParcelizer = serializer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    objValueOf2 = r8lambdacyuxafptvn7drfel1dgtevxcy.read;
                    break;
                case 16:
                    iIconCompatParcelizer = read(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    objValueOf2 = r8lambdacyuxafptvn7drfel1dgtevxcy.read;
                    break;
                case 17:
                    int i7 = (i5 << 3) | 4;
                    DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0 = component26.IconCompatParcelizer.read(getelevation2.getClass());
                    if (compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer) {
                        int i8 = read(disposableSaveableStateRegistrylambda0, bArr, i2, i3, i7, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        compositionLocalsKtLocalClipboard1.write(compositionLocalsKtLocalLocale1, r8lambdacyuxafptvn7drfel1dgtevxcy.read);
                        return i8;
                    }
                    Object obj2 = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalLocale1);
                    if (obj2 == null) {
                        obj2 = disposableSaveableStateRegistrylambda0.read();
                        compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, obj2);
                    }
                    return RemoteActionCompatParcelizer(obj2, disposableSaveableStateRegistrylambda0, bArr, i2, i3, i7, r8lambdacyuxafptvn7drfel1dgtevxcy);
                case 18:
                    DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda1 = component26.IconCompatParcelizer.read(getelevation2.getClass());
                    if (compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer) {
                        int iWrite2 = write(disposableSaveableStateRegistrylambda1, bArr, i2, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        compositionLocalsKtLocalClipboard1.write(compositionLocalsKtLocalLocale1, r8lambdacyuxafptvn7drfel1dgtevxcy.read);
                        return iWrite2;
                    }
                    Object obj3 = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalLocale1);
                    if (obj3 == null) {
                        obj3 = disposableSaveableStateRegistrylambda1.read();
                        compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, obj3);
                    }
                    return IconCompatParcelizer(obj3, disposableSaveableStateRegistrylambda1, bArr, i2, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
                default:
                    iIconCompatParcelizer = i2;
                    break;
            }
        } else {
            iIconCompatParcelizer = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            ifDebug ifdebugIconCompatParcelizer = compositionLocalsKtLocalLocale1.serializer.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer);
            int i9 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
            if (ifdebugIconCompatParcelizer == null) {
                registerProvider.RemoteActionCompatParcelizer(extendableMessage, i5, i9, null, unknownFieldSchema);
            } else {
                objValueOf2 = Integer.valueOf(i9);
            }
            return iIconCompatParcelizer;
        }
        if (compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer) {
            compositionLocalsKtLocalClipboard1.write(compositionLocalsKtLocalLocale1, objValueOf2);
        } else {
            compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, objValueOf2);
        }
        return iIconCompatParcelizer;
    }

    public static int write(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        ClipEntry clipEntry = (ClipEntry) decodestring;
        int iIconCompatParcelizer = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        clipEntry.serializer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0);
        while (iIconCompatParcelizer < i3) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            iIconCompatParcelizer = IconCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            clipEntry.serializer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0);
        }
        return iIconCompatParcelizer;
    }

    public static int write(byte[] bArr, int i, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        ClipEntry clipEntry = (ClipEntry) decodestring;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iRemoteActionCompatParcelizer;
        while (iRemoteActionCompatParcelizer < i2) {
            iRemoteActionCompatParcelizer = IconCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            clipEntry.serializer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0);
        }
        if (iRemoteActionCompatParcelizer == i2) {
            return iRemoteActionCompatParcelizer;
        }
        throw InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    public static double IconCompatParcelizer(int i, byte[] bArr) {
        return Double.longBitsToDouble(read(i, bArr));
    }

    public static int MediaBrowserCompatMediaItem(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i4 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.MediaMetadataCompat();
        }
        if (i4 == 0) {
            decodestring.add("");
        } else {
            decodestring.add(new String(bArr, iRemoteActionCompatParcelizer, i4, CompositionLocalsKtLocalWindowInfo1.serializer));
            iRemoteActionCompatParcelizer += i4;
        }
        while (iRemoteActionCompatParcelizer < i3) {
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            int i5 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.MediaMetadataCompat();
            }
            if (i5 == 0) {
                decodestring.add("");
            } else {
                decodestring.add(new String(bArr, iRemoteActionCompatParcelizer, i5, CompositionLocalsKtLocalWindowInfo1.serializer));
                iRemoteActionCompatParcelizer += i5;
            }
        }
        return iRemoteActionCompatParcelizer;
    }

    public static int MediaMetadataCompat(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i4 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.MediaMetadataCompat();
        }
        if (i4 == 0) {
            decodestring.add("");
        } else {
            int i5 = iRemoteActionCompatParcelizer + i4;
            if (!IndirectPointerNavigationGestureDetector.write.read(bArr, iRemoteActionCompatParcelizer, i5)) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            decodestring.add(new String(bArr, iRemoteActionCompatParcelizer, i4, CompositionLocalsKtLocalWindowInfo1.serializer));
            iRemoteActionCompatParcelizer = i5;
        }
        while (iRemoteActionCompatParcelizer < i3) {
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            int i6 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.MediaMetadataCompat();
            }
            if (i6 == 0) {
                decodestring.add("");
            } else {
                int i7 = iRemoteActionCompatParcelizer + i6;
                if (!IndirectPointerNavigationGestureDetector.write.read(bArr, iRemoteActionCompatParcelizer, i7)) {
                    throw InvalidProtocolBufferException.IconCompatParcelizer();
                }
                decodestring.add(new String(bArr, iRemoteActionCompatParcelizer, i6, CompositionLocalsKtLocalWindowInfo1.serializer));
                iRemoteActionCompatParcelizer = i7;
            }
        }
        return iRemoteActionCompatParcelizer;
    }

    public static int RemoteActionCompatParcelizer(int i, byte[] bArr, int i2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
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

    public static int read(byte[] bArr, int i, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.MediaMetadataCompat();
        }
        if (i2 == 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.read = "";
            return iRemoteActionCompatParcelizer;
        }
        r8lambdacyuxafptvn7drfel1dgtevxcy.read = new String(bArr, iRemoteActionCompatParcelizer, i2, CompositionLocalsKtLocalWindowInfo1.serializer);
        return iRemoteActionCompatParcelizer + i2;
    }

    public static int serializer(int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i4 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.MediaMetadataCompat();
        }
        if (i4 > bArr.length - iRemoteActionCompatParcelizer) {
            throw InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        if (i4 == 0) {
            decodestring.add(getClipMetadata.serializer);
        } else {
            decodestring.add(getClipMetadata.read(bArr, iRemoteActionCompatParcelizer, i4));
            iRemoteActionCompatParcelizer += i4;
        }
        while (iRemoteActionCompatParcelizer < i3) {
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            int i5 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.MediaMetadataCompat();
            }
            if (i5 > bArr.length - iRemoteActionCompatParcelizer) {
                throw InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            if (i5 == 0) {
                decodestring.add(getClipMetadata.serializer);
            } else {
                decodestring.add(getClipMetadata.read(bArr, iRemoteActionCompatParcelizer, i5));
                iRemoteActionCompatParcelizer += i5;
            }
        }
        return iRemoteActionCompatParcelizer;
    }

    public static int serializer(DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0, int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iWrite = write(disposableSaveableStateRegistrylambda0, bArr, i2, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
        decodestring.add(r8lambdacyuxafptvn7drfel1dgtevxcy.read);
        while (iWrite < i3) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, iWrite, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            iWrite = write(disposableSaveableStateRegistrylambda0, bArr, iRemoteActionCompatParcelizer, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
            decodestring.add(r8lambdacyuxafptvn7drfel1dgtevxcy.read);
        }
        return iWrite;
    }

    public static int serializer(byte[] bArr, int i, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.MediaMetadataCompat();
        }
        if (i2 > bArr.length - iRemoteActionCompatParcelizer) {
            throw InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        if (i2 == 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.read = getClipMetadata.serializer;
            return iRemoteActionCompatParcelizer;
        }
        r8lambdacyuxafptvn7drfel1dgtevxcy.read = getClipMetadata.read(bArr, iRemoteActionCompatParcelizer, i2);
        return iRemoteActionCompatParcelizer + i2;
    }

    public static float write(int i, byte[] bArr) {
        return Float.intBitsToFloat(serializer(i, bArr));
    }

    public static int write(byte[] bArr, int i, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i2 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.MediaMetadataCompat();
        }
        if (i2 == 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.read = "";
            return iRemoteActionCompatParcelizer;
        }
        r8lambdacyuxafptvn7drfel1dgtevxcy.read = IndirectPointerNavigationGestureDetector.write.RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer, i2);
        return iRemoteActionCompatParcelizer + i2;
    }

    public static int serializer(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long read(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int write(DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0, int i, byte[] bArr, int i2, int i3, decodeString decodestring, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int i4 = (i & (-8)) | 4;
        int i5 = read(disposableSaveableStateRegistrylambda0, bArr, i2, i3, i4, r8lambdacyuxafptvn7drfel1dgtevxcy);
        decodestring.add(r8lambdacyuxafptvn7drfel1dgtevxcy.read);
        while (i5 < i3) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i5, r8lambdacyuxafptvn7drfel1dgtevxcy);
            if (i != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                break;
            }
            i5 = read(disposableSaveableStateRegistrylambda0, bArr, iRemoteActionCompatParcelizer, i3, i4, r8lambdacyuxafptvn7drfel1dgtevxcy);
            decodestring.add(r8lambdacyuxafptvn7drfel1dgtevxcy.read);
        }
        return i5;
    }

    public static int write(DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0, byte[] bArr, int i, int i2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        Object obj = disposableSaveableStateRegistrylambda0.read();
        int iIconCompatParcelizer = IconCompatParcelizer(obj, disposableSaveableStateRegistrylambda0, bArr, i, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        disposableSaveableStateRegistrylambda0.read(obj);
        r8lambdacyuxafptvn7drfel1dgtevxcy.read = obj;
        return iIconCompatParcelizer;
    }

    public static int read(DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0, byte[] bArr, int i, int i2, int i3, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        Object obj = disposableSaveableStateRegistrylambda0.read();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj, disposableSaveableStateRegistrylambda0, bArr, i, i2, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
        disposableSaveableStateRegistrylambda0.read(obj);
        r8lambdacyuxafptvn7drfel1dgtevxcy.read = obj;
        return iRemoteActionCompatParcelizer;
    }

    public static int RemoteActionCompatParcelizer(int i, byte[] bArr, int i2, int i3, GraphicsLayerOwnerLayer graphicsLayerOwnerLayer, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iIconCompatParcelizer = IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            graphicsLayerOwnerLayer.serializer(i, Long.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
            return iIconCompatParcelizer;
        }
        if (i4 == 1) {
            graphicsLayerOwnerLayer.serializer(i, Long.valueOf(read(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            int i5 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
            if (i5 >= 0) {
                if (i5 > bArr.length - iRemoteActionCompatParcelizer) {
                    throw InvalidProtocolBufferException.MediaDescriptionCompat();
                }
                if (i5 == 0) {
                    graphicsLayerOwnerLayer.serializer(i, getClipMetadata.serializer);
                } else {
                    graphicsLayerOwnerLayer.serializer(i, getClipMetadata.read(bArr, iRemoteActionCompatParcelizer, i5));
                }
                return iRemoteActionCompatParcelizer + i5;
            }
            throw InvalidProtocolBufferException.MediaMetadataCompat();
        }
        if (i4 != 3) {
            if (i4 == 5) {
                graphicsLayerOwnerLayer.serializer(i, Integer.valueOf(serializer(i2, bArr)));
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer2 = new GraphicsLayerOwnerLayer();
        int i6 = (i & (-8)) | 4;
        int i7 = r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat + 1;
        r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat = i7;
        if (i7 < 100) {
            int i8 = 0;
            while (i2 < i3) {
                int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                int i9 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                if (i9 == i6) {
                    i8 = i9;
                    i2 = iRemoteActionCompatParcelizer2;
                    break;
                }
                i8 = i9;
                i2 = RemoteActionCompatParcelizer(i9, bArr, iRemoteActionCompatParcelizer2, i3, graphicsLayerOwnerLayer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            }
            r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat--;
            if (i2 <= i3 && i8 == i6) {
                graphicsLayerOwnerLayer.serializer(i, graphicsLayerOwnerLayer2);
                return i2;
            }
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int write(int i, byte[] bArr, int i2, int i3, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return IconCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy) + r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = RemoteActionCompatParcelizer(bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            i6 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
            if (i6 == i5) {
                break;
            }
            i2 = write(i6, bArr, i2, i3, r8lambdacyuxafptvn7drfel1dgtevxcy);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        return i2;
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr, int i, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer = b;
            return i2;
        }
        return RemoteActionCompatParcelizer(b, bArr, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
    }
}
