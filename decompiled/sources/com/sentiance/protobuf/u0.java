package com.sentiance.protobuf;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import o.BrazeViewBounds;
import o.DataStoreValueType;
import o.DelayedInitializationAnalyticsBehavior;
import o.DrawableTransformation;
import o.FeatureFlagsUpdatedEventCompanion;
import o.GenderCompanion;
import o.GeofenceTransitionType;
import o.IValueCallback;
import o.ImageStyle;
import o.InAppMessageEvent;
import o.RuntimeAppConfigurationProvider;
import o.SdkDataWipeEvent;
import o.SessionStateChangedEventChangeType;
import o.SimpleValueCallback;
import o.accessgetCardTypeMapcp;
import o.accessgetDiskCacheLockp;
import o.accessisOfflinep;
import o.accesssetDiskLruCachep;
import o.fromStringlambda1;
import o.getDrawableValue;
import o.getErrorReason;
import o.getMonthlambda10;
import o.getRequestInitiationTime;
import o.getServerKeyFromCardType;
import o.getTriggerEvent;
import o.getUnviewedCardCount;
import o.isAppSetIdReadingEnabled;
import o.isFromOfflineStorage;
import o.onSuccess;
import o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA;
import o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY;
import o.r8lambdaHxndgEp3NZAe65egvieVRgKrMSA;
import o.r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0;
import o.r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4;
import o.r8lambdadeOzq815xUUwmlLYYvm_QV79QY;
import o.r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.r8lambdaz9qWKJS3IHEjgTkGhRIWaI8yrYc;
import o.setRuntimeAppConfigurationProvider;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements fromStringlambda1 {
    public final int[] ComponentActivity;
    public final r8lambdaHxndgEp3NZAe65egvieVRgKrMSA MediaBrowserCompatMediaItem;
    public final c1 MediaDescriptionCompat;
    public final int[] MediaMetadataCompat;
    public final n0 MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatResultReceiverWrapper;
    public final Object[] MediaSessionCompatToken;
    public final int ParcelableVolumeInfo;
    public final int PlaybackStateCompat;
    public final accessgetDiskCacheLockp PlaybackStateCompatCustomAction;
    public final SdkDataWipeEvent RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getDrawableValue read;
    public final int write;
    public static final int[] serializer = new int[0];
    public static final Unsafe IconCompatParcelizer = SimpleValueCallback.read();

    public static long serializer(int i) {
        return i & 1048575;
    }

    public static int write(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int RemoteActionCompatParcelizer(long j, Object obj) {
        return ((Integer) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj)).intValue();
    }

    public static IValueCallback read(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        IValueCallback iValueCallback = generatedMessageLite.serializer;
        if (iValueCallback != IValueCallback.write) {
            return iValueCallback;
        }
        IValueCallback iValueCallback2 = new IValueCallback();
        generatedMessageLite.serializer = iValueCallback2;
        return iValueCallback2;
    }

    public static long write(long j, Object obj) {
        return ((Long) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj)).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0218 A[PHI: r3
  0x0218: PHI (r3v29 int) = (r3v10 int), (r3v31 int) binds: [B:82:0x0216, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.fromStringlambda1
    public final int IconCompatParcelizer(GeneratedMessageLite generatedMessageLite) {
        int i;
        int iWrite;
        int[] iArr = this.MediaMetadataCompat;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i3);
            int i4 = iArr[i3];
            long j = 1048575 & iMediaBrowserCompatMediaItem;
            int i5 = 1237;
            switch (write(iMediaBrowserCompatMediaItem)) {
                case 0:
                    i = i2 * 53;
                    iWrite = isFromOfflineStorage.write(Double.doubleToLongBits(SimpleValueCallback.IconCompatParcelizer.IconCompatParcelizer(j, generatedMessageLite)));
                    i2 = i + iWrite;
                    break;
                case 1:
                    i = i2 * 53;
                    iWrite = Float.floatToIntBits(SimpleValueCallback.IconCompatParcelizer.serializer(j, generatedMessageLite));
                    i2 = i + iWrite;
                    break;
                case 2:
                    i = i2 * 53;
                    iWrite = isFromOfflineStorage.write(SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j, generatedMessageLite));
                    i2 = i + iWrite;
                    break;
                case 3:
                    i = i2 * 53;
                    iWrite = isFromOfflineStorage.write(SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j, generatedMessageLite));
                    i2 = i + iWrite;
                    break;
                case 4:
                    i = i2 * 53;
                    iWrite = SimpleValueCallback.IconCompatParcelizer.read(j, generatedMessageLite);
                    i2 = i + iWrite;
                    break;
                case 5:
                    i = i2 * 53;
                    iWrite = isFromOfflineStorage.write(SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j, generatedMessageLite));
                    i2 = i + iWrite;
                    break;
                case 6:
                    i = i2 * 53;
                    iWrite = SimpleValueCallback.IconCompatParcelizer.read(j, generatedMessageLite);
                    i2 = i + iWrite;
                    break;
                case 7:
                    i = i2 * 53;
                    boolean zRemoteActionCompatParcelizer = SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(j, generatedMessageLite);
                    Charset charset = isFromOfflineStorage.read;
                    if (zRemoteActionCompatParcelizer) {
                        i5 = 1231;
                    }
                    iWrite = i5;
                    i2 = i + iWrite;
                    break;
                case 8:
                    i = i2 * 53;
                    iWrite = ((String) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite)).hashCode();
                    i2 = i + iWrite;
                    break;
                case 9:
                    Object objMediaMetadataCompat = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite);
                    if (objMediaMetadataCompat != null) {
                        iWrite = objMediaMetadataCompat.hashCode();
                    } else {
                        iWrite = 37;
                    }
                    i = i2 * 53;
                    i2 = i + iWrite;
                    break;
                case 10:
                    i = i2 * 53;
                    iWrite = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite).hashCode();
                    i2 = i + iWrite;
                    break;
                case 11:
                    i = i2 * 53;
                    iWrite = SimpleValueCallback.IconCompatParcelizer.read(j, generatedMessageLite);
                    i2 = i + iWrite;
                    break;
                case 12:
                    i = i2 * 53;
                    iWrite = SimpleValueCallback.IconCompatParcelizer.read(j, generatedMessageLite);
                    i2 = i + iWrite;
                    break;
                case 13:
                    i = i2 * 53;
                    iWrite = SimpleValueCallback.IconCompatParcelizer.read(j, generatedMessageLite);
                    i2 = i + iWrite;
                    break;
                case 14:
                    i = i2 * 53;
                    iWrite = isFromOfflineStorage.write(SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j, generatedMessageLite));
                    i2 = i + iWrite;
                    break;
                case 15:
                    i = i2 * 53;
                    iWrite = SimpleValueCallback.IconCompatParcelizer.read(j, generatedMessageLite);
                    i2 = i + iWrite;
                    break;
                case 16:
                    i = i2 * 53;
                    iWrite = isFromOfflineStorage.write(SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j, generatedMessageLite));
                    i2 = i + iWrite;
                    break;
                case 17:
                    Object objMediaMetadataCompat2 = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite);
                    if (objMediaMetadataCompat2 != null) {
                        iWrite = objMediaMetadataCompat2.hashCode();
                    } else {
                        iWrite = 37;
                    }
                    i = i2 * 53;
                    i2 = i + iWrite;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case 44:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                case 49:
                    i = i2 * 53;
                    iWrite = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite).hashCode();
                    i2 = i + iWrite;
                    break;
                case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    i = i2 * 53;
                    iWrite = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite).hashCode();
                    i2 = i + iWrite;
                    break;
                case 51:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = isFromOfflineStorage.write(Double.doubleToLongBits(((Double) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite)).doubleValue()));
                        i2 = i + iWrite;
                    }
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = Float.floatToIntBits(((Float) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite)).floatValue());
                        i2 = i + iWrite;
                    }
                    break;
                case 53:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = isFromOfflineStorage.write(write(j, generatedMessageLite));
                        i2 = i + iWrite;
                    }
                    break;
                case 54:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = isFromOfflineStorage.write(write(j, generatedMessageLite));
                        i2 = i + iWrite;
                    }
                    break;
                case 55:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = RemoteActionCompatParcelizer(j, generatedMessageLite);
                        i2 = i + iWrite;
                    }
                    break;
                case 56:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = isFromOfflineStorage.write(write(j, generatedMessageLite));
                        i2 = i + iWrite;
                    }
                    break;
                case 57:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = RemoteActionCompatParcelizer(j, generatedMessageLite);
                        i2 = i + iWrite;
                    }
                    break;
                case 58:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        boolean zBooleanValue = ((Boolean) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite)).booleanValue();
                        Charset charset2 = isFromOfflineStorage.read;
                        if (zBooleanValue) {
                            i5 = 1231;
                        }
                        iWrite = i5;
                        i2 = i + iWrite;
                    }
                    break;
                case 59:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = ((String) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite)).hashCode();
                        i2 = i + iWrite;
                    }
                    break;
                case 60:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite).hashCode();
                        i2 = i + iWrite;
                    }
                    break;
                case RectListKt.BitOffsetForFocusable /* 61 */:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite).hashCode();
                        i2 = i + iWrite;
                    }
                    break;
                case RectListKt.BitOffsetForGesturable /* 62 */:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = RemoteActionCompatParcelizer(j, generatedMessageLite);
                        i2 = i + iWrite;
                    }
                    break;
                case 63:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = RemoteActionCompatParcelizer(j, generatedMessageLite);
                        i2 = i + iWrite;
                    }
                    break;
                case 64:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = RemoteActionCompatParcelizer(j, generatedMessageLite);
                        i2 = i + iWrite;
                    }
                    break;
                case 65:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = isFromOfflineStorage.write(write(j, generatedMessageLite));
                        i2 = i + iWrite;
                    }
                    break;
                case 66:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = RemoteActionCompatParcelizer(j, generatedMessageLite);
                        i2 = i + iWrite;
                    }
                    break;
                case 67:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = isFromOfflineStorage.write(write(j, generatedMessageLite));
                        i2 = i + iWrite;
                    }
                    break;
                case 68:
                    if (read(i4, i3, generatedMessageLite)) {
                        i = i2 * 53;
                        iWrite = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, generatedMessageLite).hashCode();
                        i2 = i + iWrite;
                    }
                    break;
            }
        }
        ((getTriggerEvent) this.MediaDescriptionCompat).getClass();
        int iHashCode = generatedMessageLite.serializer.hashCode() + (i2 * 53);
        if (!this.MediaSessionCompatResultReceiverWrapper) {
            return iHashCode;
        }
        this.MediaBrowserCompatMediaItem.getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.serializer.hashCode() + (iHashCode * 53);
    }

    public final int MediaBrowserCompatMediaItem(int i) {
        return this.MediaMetadataCompat[i + 1];
    }

    public final void serializer(Object obj, int i, Object obj2) {
        int[] iArr = this.MediaMetadataCompat;
        int i2 = iArr[i];
        if (read(i2, i, obj2)) {
            long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i) & 1048575;
            Unsafe unsafe = IconCompatParcelizer;
            Object object = unsafe.getObject(obj2, jMediaBrowserCompatMediaItem);
            if (object == null) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(iArr[i], obj2);
                return;
            }
            fromStringlambda1 fromstringlambda1 = read(i);
            if (!read(i2, i, obj)) {
                if (RemoteActionCompatParcelizer(object)) {
                    GeneratedMessageLite generatedMessageLiteSerializer = fromstringlambda1.serializer();
                    fromstringlambda1.write(generatedMessageLiteSerializer, object);
                    unsafe.putObject(obj, jMediaBrowserCompatMediaItem, generatedMessageLiteSerializer);
                } else {
                    unsafe.putObject(obj, jMediaBrowserCompatMediaItem, object);
                }
                IconCompatParcelizer(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jMediaBrowserCompatMediaItem);
            if (!RemoteActionCompatParcelizer(object2)) {
                GeneratedMessageLite generatedMessageLiteSerializer2 = fromstringlambda1.serializer();
                fromstringlambda1.write(generatedMessageLiteSerializer2, object2);
                unsafe.putObject(obj, jMediaBrowserCompatMediaItem, generatedMessageLiteSerializer2);
                object2 = generatedMessageLiteSerializer2;
            }
            fromstringlambda1.write(object2, object);
        }
    }

    public u0(int[] iArr, Object[] objArr, int i, int i2, accessgetDiskCacheLockp accessgetdiskcachelockp, int[] iArr2, int i3, int i4, getDrawableValue getdrawablevalue, SdkDataWipeEvent sdkDataWipeEvent, c1 c1Var, r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa, n0 n0Var) {
        this.MediaMetadataCompat = iArr;
        this.MediaSessionCompatToken = objArr;
        this.ParcelableVolumeInfo = i;
        this.PlaybackStateCompat = i2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = accessgetdiskcachelockp instanceof GeneratedMessageLite;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdahxndgep3nzae65egvievrgkrmsa != null && (accessgetdiskcachelockp instanceof GeneratedMessageLite.ExtendableMessage);
        this.ComponentActivity = iArr2;
        this.RemoteActionCompatParcelizer = i3;
        this.write = i4;
        this.read = getdrawablevalue;
        this.RatingCompat = sdkDataWipeEvent;
        this.MediaDescriptionCompat = c1Var;
        this.MediaBrowserCompatMediaItem = r8lambdahxndgep3nzae65egvievrgkrmsa;
        this.PlaybackStateCompatCustomAction = accessgetdiskcachelockp;
        this.MediaSessionCompatQueueItem = n0Var;
    }

    public static boolean RemoteActionCompatParcelizer(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    public static u0 read(DataStoreValueType dataStoreValueType, getDrawableValue getdrawablevalue, SdkDataWipeEvent sdkDataWipeEvent, c1 c1Var, r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa, n0 n0Var) {
        if (dataStoreValueType instanceof DataStoreValueType) {
            return IconCompatParcelizer(dataStoreValueType, getdrawablevalue, sdkDataWipeEvent, c1Var, r8lambdahxndgep3nzae65egvievrgkrmsa, n0Var);
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:207:0x0547  */
    @Override // o.fromStringlambda1
    public final int read(GeneratedMessageLite generatedMessageLite) {
        int i;
        int i2;
        int i3;
        int iSerializer;
        int iSerializer2;
        int iSerializer3;
        int serializedSize;
        int iSerializer4;
        int iRemoteActionCompatParcelizer;
        int iSerializer5;
        int iSerializer6;
        int iSerializer7;
        int i4;
        int iSerializer8;
        int serializedSize2;
        int i5;
        int i6;
        int iSerializer9;
        int serializedSize3;
        int iSerializer10;
        int iSerializer11;
        int size;
        int iMediaSessionCompatQueueItem;
        int iSerializer12;
        int iSerializer13;
        int iSerializer14;
        int i7;
        int iSerializer15;
        int i8;
        int iSerializer16;
        int iSerializer17;
        int i9;
        Unsafe unsafe = IconCompatParcelizer;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.MediaMetadataCompat;
            if (i13 < iArr.length) {
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i13);
                int iWrite = write(iMediaBrowserCompatMediaItem);
                int i15 = iArr[i13];
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i10;
                if (iWrite <= 17) {
                    if (i17 != i11) {
                        i12 = i17 == i10 ? 0 : unsafe.getInt(generatedMessageLite, i17);
                        i11 = i17;
                    }
                    i = i12;
                    i2 = i11;
                    i3 = 1 << (i16 >>> 20);
                } else {
                    i = i12;
                    i2 = i11;
                    i3 = 0;
                }
                long j = iMediaBrowserCompatMediaItem & i10;
                if (iWrite >= FieldType.DOUBLE_LIST_PACKED.id()) {
                    FieldType.SINT64_LIST_PACKED.id();
                }
                switch (iWrite) {
                    case 0:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            iSerializer = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer + 8;
                            i14 += iSerializer9;
                        }
                        break;
                    case 1:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            iSerializer2 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer2 + 4;
                            i14 += iSerializer9;
                        }
                        break;
                    case 2:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            long j2 = unsafe.getLong(generatedMessageLite, j);
                            iSerializer3 = setRuntimeAppConfigurationProvider.serializer(i15);
                            serializedSize = setRuntimeAppConfigurationProvider.read(j2);
                            iSerializer9 = serializedSize + iSerializer3;
                            i14 += iSerializer9;
                        }
                        break;
                    case 3:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            long j3 = unsafe.getLong(generatedMessageLite, j);
                            iSerializer3 = setRuntimeAppConfigurationProvider.serializer(i15);
                            serializedSize = setRuntimeAppConfigurationProvider.read(j3);
                            iSerializer9 = serializedSize + iSerializer3;
                            i14 += iSerializer9;
                        }
                        break;
                    case 4:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            int i18 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer4 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iRemoteActionCompatParcelizer = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(i18);
                            i6 = iSerializer4 + iRemoteActionCompatParcelizer;
                            iSerializer9 = i6;
                            i14 += iSerializer9;
                        }
                        break;
                    case 5:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            iSerializer = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer + 8;
                            i14 += iSerializer9;
                        }
                        break;
                    case 6:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            iSerializer2 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer2 + 4;
                            i14 += iSerializer9;
                        }
                        break;
                    case 7:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            iSerializer5 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer5 + 1;
                            i14 += iSerializer9;
                        }
                        break;
                    case 8:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            Object object = unsafe.getObject(generatedMessageLite, j);
                            if (object instanceof ByteString) {
                                iSerializer6 = setRuntimeAppConfigurationProvider.serializer(i15);
                                iSerializer7 = ((ByteString) object).serializer();
                                i4 = setRuntimeAppConfigurationProvider.read(iSerializer7);
                                i6 = iSerializer6 + i4 + iSerializer7;
                                iSerializer9 = i6;
                                i14 += iSerializer9;
                            } else {
                                iSerializer4 = setRuntimeAppConfigurationProvider.serializer(i15);
                                iRemoteActionCompatParcelizer = setRuntimeAppConfigurationProvider.IconCompatParcelizer((String) object);
                                i6 = iSerializer4 + iRemoteActionCompatParcelizer;
                                iSerializer9 = i6;
                                i14 += iSerializer9;
                            }
                        }
                        break;
                    case 9:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            Object object2 = unsafe.getObject(generatedMessageLite, j);
                            fromStringlambda1 fromstringlambda1 = read(i13);
                            Class cls = GeofenceTransitionType.write;
                            iSerializer8 = setRuntimeAppConfigurationProvider.serializer(i15);
                            serializedSize2 = ((a) ((accessgetDiskCacheLockp) object2)).getSerializedSize(fromstringlambda1);
                            i5 = setRuntimeAppConfigurationProvider.read(serializedSize2);
                            iSerializer9 = i5 + serializedSize2 + iSerializer8;
                            i14 += iSerializer9;
                        }
                        break;
                    case 10:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            ByteString byteString = (ByteString) unsafe.getObject(generatedMessageLite, j);
                            iSerializer6 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer7 = byteString.serializer();
                            i4 = setRuntimeAppConfigurationProvider.read(iSerializer7);
                            i6 = iSerializer6 + i4 + iSerializer7;
                            iSerializer9 = i6;
                            i14 += iSerializer9;
                        }
                        break;
                    case 11:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            int i19 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer4 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iRemoteActionCompatParcelizer = setRuntimeAppConfigurationProvider.read(i19);
                            i6 = iSerializer4 + iRemoteActionCompatParcelizer;
                            iSerializer9 = i6;
                            i14 += iSerializer9;
                        }
                        break;
                    case 12:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            int i20 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer4 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iRemoteActionCompatParcelizer = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(i20);
                            i6 = iSerializer4 + iRemoteActionCompatParcelizer;
                            iSerializer9 = i6;
                            i14 += iSerializer9;
                        }
                        break;
                    case 13:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            iSerializer2 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer2 + 4;
                            i14 += iSerializer9;
                        }
                        break;
                    case 14:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            iSerializer = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer + 8;
                            i14 += iSerializer9;
                        }
                        break;
                    case 15:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            int i21 = unsafe.getInt(generatedMessageLite, j);
                            iSerializer4 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iRemoteActionCompatParcelizer = setRuntimeAppConfigurationProvider.read((i21 << 1) ^ (i21 >> 31));
                            i6 = iSerializer4 + iRemoteActionCompatParcelizer;
                            iSerializer9 = i6;
                            i14 += iSerializer9;
                        }
                        break;
                    case 16:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            long j4 = unsafe.getLong(generatedMessageLite, j);
                            iSerializer3 = setRuntimeAppConfigurationProvider.serializer(i15);
                            serializedSize = setRuntimeAppConfigurationProvider.read((j4 >> 63) ^ (j4 << 1));
                            iSerializer9 = serializedSize + iSerializer3;
                            i14 += iSerializer9;
                        }
                        break;
                    case 17:
                        if (read(generatedMessageLite, i13, i2, i, i3)) {
                            accessgetDiskCacheLockp accessgetdiskcachelockp = (accessgetDiskCacheLockp) unsafe.getObject(generatedMessageLite, j);
                            fromStringlambda1 fromstringlambda2 = read(i13);
                            int iSerializer18 = setRuntimeAppConfigurationProvider.serializer(i15) * 2;
                            serializedSize3 = ((a) accessgetdiskcachelockp).getSerializedSize(fromstringlambda2);
                            iSerializer10 = iSerializer18;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 18:
                        iSerializer9 = GeofenceTransitionType.serializer(i15, (List) unsafe.getObject(generatedMessageLite, j));
                        i14 += iSerializer9;
                        break;
                    case 19:
                        iSerializer9 = GeofenceTransitionType.read(i15, (List) unsafe.getObject(generatedMessageLite, j));
                        i14 += iSerializer9;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls2 = GeofenceTransitionType.write;
                        if (list.size() == 0) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer11 = (setRuntimeAppConfigurationProvider.serializer(i15) * list.size()) + GeofenceTransitionType.RemoteActionCompatParcelizer(list);
                            iSerializer9 = iSerializer11;
                        }
                        i14 += iSerializer9;
                        break;
                    case 21:
                        List list2 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls3 = GeofenceTransitionType.write;
                        size = list2.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = GeofenceTransitionType.MediaSessionCompatQueueItem(list2);
                            iSerializer12 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer11 = (iSerializer12 * size) + iMediaSessionCompatQueueItem;
                            iSerializer9 = iSerializer11;
                        }
                        i14 += iSerializer9;
                        break;
                    case 22:
                        List list3 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls4 = GeofenceTransitionType.write;
                        size = list3.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = GeofenceTransitionType.IconCompatParcelizer(list3);
                            iSerializer12 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer11 = (iSerializer12 * size) + iMediaSessionCompatQueueItem;
                            iSerializer9 = iSerializer11;
                        }
                        i14 += iSerializer9;
                        break;
                    case 23:
                        iSerializer9 = GeofenceTransitionType.serializer(i15, (List) unsafe.getObject(generatedMessageLite, j));
                        i14 += iSerializer9;
                        break;
                    case 24:
                        iSerializer9 = GeofenceTransitionType.read(i15, (List) unsafe.getObject(generatedMessageLite, j));
                        i14 += iSerializer9;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls5 = GeofenceTransitionType.write;
                        int size2 = list4.size();
                        if (size2 == 0) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer9 = size2 * (setRuntimeAppConfigurationProvider.serializer(i15) + 1);
                        }
                        i14 += iSerializer9;
                        break;
                    case 26:
                        List list5 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls6 = GeofenceTransitionType.write;
                        int size3 = list5.size();
                        if (size3 == 0) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer11 = setRuntimeAppConfigurationProvider.serializer(i15) * size3;
                            if (list5 instanceof SessionStateChangedEventChangeType) {
                                SessionStateChangedEventChangeType sessionStateChangedEventChangeType = (SessionStateChangedEventChangeType) list5;
                                for (int i22 = 0; i22 < size3; i22++) {
                                    Object objIconCompatParcelizer = sessionStateChangedEventChangeType.IconCompatParcelizer(i22);
                                    if (objIconCompatParcelizer instanceof ByteString) {
                                        int iSerializer19 = ((ByteString) objIconCompatParcelizer).serializer();
                                        iSerializer11 = setRuntimeAppConfigurationProvider.read(iSerializer19) + iSerializer19 + iSerializer11;
                                    } else {
                                        iSerializer11 = setRuntimeAppConfigurationProvider.IconCompatParcelizer((String) objIconCompatParcelizer) + iSerializer11;
                                    }
                                }
                            } else {
                                for (int i23 = 0; i23 < size3; i23++) {
                                    Object obj = list5.get(i23);
                                    if (obj instanceof ByteString) {
                                        int iSerializer20 = ((ByteString) obj).serializer();
                                        iSerializer11 = setRuntimeAppConfigurationProvider.read(iSerializer20) + iSerializer20 + iSerializer11;
                                    } else {
                                        iSerializer11 = setRuntimeAppConfigurationProvider.IconCompatParcelizer((String) obj) + iSerializer11;
                                    }
                                }
                            }
                            iSerializer9 = iSerializer11;
                        }
                        i14 += iSerializer9;
                        break;
                    case 27:
                        List list6 = (List) unsafe.getObject(generatedMessageLite, j);
                        fromStringlambda1 fromstringlambda3 = read(i13);
                        Class cls7 = GeofenceTransitionType.write;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer13 = setRuntimeAppConfigurationProvider.serializer(i15) * size4;
                            for (int i24 = 0; i24 < size4; i24++) {
                                int serializedSize4 = ((a) ((accessgetDiskCacheLockp) list6.get(i24))).getSerializedSize(fromstringlambda3);
                                iSerializer13 += setRuntimeAppConfigurationProvider.read(serializedSize4) + serializedSize4;
                            }
                            iSerializer9 = iSerializer13;
                        }
                        i14 += iSerializer9;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls8 = GeofenceTransitionType.write;
                        int size5 = list7.size();
                        if (size5 == 0) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer11 = setRuntimeAppConfigurationProvider.serializer(i15) * size5;
                            for (int i25 = 0; i25 < list7.size(); i25++) {
                                int iSerializer21 = ((ByteString) list7.get(i25)).serializer();
                                iSerializer11 += setRuntimeAppConfigurationProvider.read(iSerializer21) + iSerializer21;
                            }
                            iSerializer9 = iSerializer11;
                        }
                        i14 += iSerializer9;
                        break;
                    case 29:
                        List list8 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls9 = GeofenceTransitionType.write;
                        size = list8.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = GeofenceTransitionType.RatingCompat(list8);
                            iSerializer12 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer11 = (iSerializer12 * size) + iMediaSessionCompatQueueItem;
                            iSerializer9 = iSerializer11;
                        }
                        i14 += iSerializer9;
                        break;
                    case 30:
                        List list9 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls10 = GeofenceTransitionType.write;
                        size = list9.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = GeofenceTransitionType.read(list9);
                            iSerializer12 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer11 = (iSerializer12 * size) + iMediaSessionCompatQueueItem;
                            iSerializer9 = iSerializer11;
                        }
                        i14 += iSerializer9;
                        break;
                    case 31:
                        iSerializer9 = GeofenceTransitionType.read(i15, (List) unsafe.getObject(generatedMessageLite, j));
                        i14 += iSerializer9;
                        break;
                    case 32:
                        iSerializer9 = GeofenceTransitionType.serializer(i15, (List) unsafe.getObject(generatedMessageLite, j));
                        i14 += iSerializer9;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls11 = GeofenceTransitionType.write;
                        size = list10.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = GeofenceTransitionType.write(list10);
                            iSerializer12 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer11 = (iSerializer12 * size) + iMediaSessionCompatQueueItem;
                            iSerializer9 = iSerializer11;
                        }
                        i14 += iSerializer9;
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        List list11 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls12 = GeofenceTransitionType.write;
                        size = list11.size();
                        if (size == 0) {
                            iSerializer9 = 0;
                        } else {
                            iMediaSessionCompatQueueItem = GeofenceTransitionType.serializer(list11);
                            iSerializer12 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer11 = (iSerializer12 * size) + iMediaSessionCompatQueueItem;
                            iSerializer9 = iSerializer11;
                        }
                        i14 += iSerializer9;
                        break;
                    case 35:
                        List list12 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls13 = GeofenceTransitionType.write;
                        serializedSize3 = list12.size() * 8;
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        List list13 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls14 = GeofenceTransitionType.write;
                        serializedSize3 = list13.size() * 4;
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 37:
                        serializedSize3 = GeofenceTransitionType.RemoteActionCompatParcelizer((List) unsafe.getObject(generatedMessageLite, j));
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 38:
                        serializedSize3 = GeofenceTransitionType.MediaSessionCompatQueueItem((List) unsafe.getObject(generatedMessageLite, j));
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        serializedSize3 = GeofenceTransitionType.IconCompatParcelizer((List) unsafe.getObject(generatedMessageLite, j));
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 40:
                        List list14 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls15 = GeofenceTransitionType.write;
                        serializedSize3 = list14.size() * 8;
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        List list15 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls16 = GeofenceTransitionType.write;
                        serializedSize3 = list15.size() * 4;
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        List list16 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls17 = GeofenceTransitionType.write;
                        serializedSize3 = list16.size();
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 43:
                        serializedSize3 = GeofenceTransitionType.RatingCompat((List) unsafe.getObject(generatedMessageLite, j));
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 44:
                        serializedSize3 = GeofenceTransitionType.read((List) unsafe.getObject(generatedMessageLite, j));
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        List list17 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls18 = GeofenceTransitionType.write;
                        serializedSize3 = list17.size() * 4;
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 46:
                        List list18 = (List) unsafe.getObject(generatedMessageLite, j);
                        Class cls19 = GeofenceTransitionType.write;
                        serializedSize3 = list18.size() * 8;
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 47:
                        serializedSize3 = GeofenceTransitionType.write((List) unsafe.getObject(generatedMessageLite, j));
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        serializedSize3 = GeofenceTransitionType.serializer((List) unsafe.getObject(generatedMessageLite, j));
                        if (serializedSize3 > 0) {
                            iSerializer14 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i7 = setRuntimeAppConfigurationProvider.read(serializedSize3);
                            iSerializer10 = iSerializer14 + i7;
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 49:
                        List list19 = (List) unsafe.getObject(generatedMessageLite, j);
                        fromStringlambda1 fromstringlambda4 = read(i13);
                        Class cls20 = GeofenceTransitionType.write;
                        int size6 = list19.size();
                        if (size6 == 0) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer13 = 0;
                            for (int i26 = 0; i26 < size6; i26++) {
                                iSerializer13 += ((a) ((accessgetDiskCacheLockp) list19.get(i26))).getSerializedSize(fromstringlambda4) + (setRuntimeAppConfigurationProvider.serializer(i15) * 2);
                            }
                            iSerializer9 = iSerializer13;
                        }
                        i14 += iSerializer9;
                        break;
                    case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        Object object3 = unsafe.getObject(generatedMessageLite, j);
                        Object objIconCompatParcelizer2 = IconCompatParcelizer(i13);
                        this.MediaSessionCompatQueueItem.getClass();
                        MapFieldLite mapFieldLite = (MapFieldLite) object3;
                        r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA r8lambdarqb9rtvn7c2tw8sxkqk3qtbwbpa = (r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA) objIconCompatParcelizer2;
                        if (mapFieldLite.isEmpty()) {
                            iSerializer9 = 0;
                        } else {
                            iSerializer11 = 0;
                            for (Map.Entry entry : mapFieldLite.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                r8lambdarqb9rtvn7c2tw8sxkqk3qtbwbpa.getClass();
                                int iSerializer22 = setRuntimeAppConfigurationProvider.serializer(i15);
                                int iSerializer23 = r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA.serializer(r8lambdarqb9rtvn7c2tw8sxkqk3qtbwbpa.IconCompatParcelizer, key, value);
                                iSerializer11 += setRuntimeAppConfigurationProvider.read(iSerializer23) + iSerializer23 + iSerializer22;
                            }
                            iSerializer9 = iSerializer11;
                        }
                        i14 += iSerializer9;
                        break;
                    case 51:
                        if (read(i15, i13, generatedMessageLite)) {
                            iSerializer = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer + 8;
                            i14 += iSerializer9;
                        }
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        if (read(i15, i13, generatedMessageLite)) {
                            iSerializer2 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer2 + 4;
                            i14 += iSerializer9;
                        }
                        break;
                    case 53:
                        if (read(i15, i13, generatedMessageLite)) {
                            long jWrite = write(j, generatedMessageLite);
                            iSerializer15 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i8 = setRuntimeAppConfigurationProvider.read(jWrite);
                            iSerializer9 = i8 + iSerializer15;
                            i14 += iSerializer9;
                        }
                        break;
                    case 54:
                        if (read(i15, i13, generatedMessageLite)) {
                            long jWrite2 = write(j, generatedMessageLite);
                            iSerializer15 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i8 = setRuntimeAppConfigurationProvider.read(jWrite2);
                            iSerializer9 = i8 + iSerializer15;
                            i14 += iSerializer9;
                        }
                        break;
                    case 55:
                        if (read(i15, i13, generatedMessageLite)) {
                            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(j, generatedMessageLite);
                            iSerializer10 = setRuntimeAppConfigurationProvider.serializer(i15);
                            serializedSize3 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 56:
                        if (read(i15, i13, generatedMessageLite)) {
                            iSerializer = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer + 8;
                            i14 += iSerializer9;
                        }
                        break;
                    case 57:
                        if (read(i15, i13, generatedMessageLite)) {
                            iSerializer2 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer2 + 4;
                            i14 += iSerializer9;
                        }
                        break;
                    case 58:
                        if (read(i15, i13, generatedMessageLite)) {
                            iSerializer5 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer5 + 1;
                            i14 += iSerializer9;
                        }
                        break;
                    case 59:
                        if (read(i15, i13, generatedMessageLite)) {
                            Object object4 = unsafe.getObject(generatedMessageLite, j);
                            if (object4 instanceof ByteString) {
                                iSerializer16 = setRuntimeAppConfigurationProvider.serializer(i15);
                                iSerializer17 = ((ByteString) object4).serializer();
                                i9 = setRuntimeAppConfigurationProvider.read(iSerializer17);
                                iSerializer9 = i9 + iSerializer17 + iSerializer16;
                                i14 += iSerializer9;
                            } else {
                                iSerializer10 = setRuntimeAppConfigurationProvider.serializer(i15);
                                serializedSize3 = setRuntimeAppConfigurationProvider.IconCompatParcelizer((String) object4);
                                iSerializer9 = serializedSize3 + iSerializer10;
                                i14 += iSerializer9;
                            }
                        }
                        break;
                    case 60:
                        if (read(i15, i13, generatedMessageLite)) {
                            Object object5 = unsafe.getObject(generatedMessageLite, j);
                            fromStringlambda1 fromstringlambda5 = read(i13);
                            Class cls21 = GeofenceTransitionType.write;
                            iSerializer8 = setRuntimeAppConfigurationProvider.serializer(i15);
                            serializedSize2 = ((a) ((accessgetDiskCacheLockp) object5)).getSerializedSize(fromstringlambda5);
                            i5 = setRuntimeAppConfigurationProvider.read(serializedSize2);
                            iSerializer9 = i5 + serializedSize2 + iSerializer8;
                            i14 += iSerializer9;
                        }
                        break;
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                        if (read(i15, i13, generatedMessageLite)) {
                            ByteString byteString2 = (ByteString) unsafe.getObject(generatedMessageLite, j);
                            iSerializer16 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer17 = byteString2.serializer();
                            i9 = setRuntimeAppConfigurationProvider.read(iSerializer17);
                            iSerializer9 = i9 + iSerializer17 + iSerializer16;
                            i14 += iSerializer9;
                        }
                        break;
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                        if (read(i15, i13, generatedMessageLite)) {
                            int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(j, generatedMessageLite);
                            iSerializer10 = setRuntimeAppConfigurationProvider.serializer(i15);
                            serializedSize3 = setRuntimeAppConfigurationProvider.read(iRemoteActionCompatParcelizer3);
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 63:
                        if (read(i15, i13, generatedMessageLite)) {
                            int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(j, generatedMessageLite);
                            iSerializer10 = setRuntimeAppConfigurationProvider.serializer(i15);
                            serializedSize3 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer4);
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 64:
                        if (read(i15, i13, generatedMessageLite)) {
                            iSerializer2 = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer2 + 4;
                            i14 += iSerializer9;
                        }
                        break;
                    case 65:
                        if (read(i15, i13, generatedMessageLite)) {
                            iSerializer = setRuntimeAppConfigurationProvider.serializer(i15);
                            iSerializer9 = iSerializer + 8;
                            i14 += iSerializer9;
                        }
                        break;
                    case 66:
                        if (read(i15, i13, generatedMessageLite)) {
                            int iRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(j, generatedMessageLite);
                            iSerializer10 = setRuntimeAppConfigurationProvider.serializer(i15);
                            serializedSize3 = setRuntimeAppConfigurationProvider.read((iRemoteActionCompatParcelizer5 << 1) ^ (iRemoteActionCompatParcelizer5 >> 31));
                            iSerializer9 = serializedSize3 + iSerializer10;
                            i14 += iSerializer9;
                        }
                        break;
                    case 67:
                        if (read(i15, i13, generatedMessageLite)) {
                            long jWrite3 = write(j, generatedMessageLite);
                            iSerializer15 = setRuntimeAppConfigurationProvider.serializer(i15);
                            i8 = setRuntimeAppConfigurationProvider.read((jWrite3 >> 63) ^ (jWrite3 << 1));
                            iSerializer9 = i8 + iSerializer15;
                            i14 += iSerializer9;
                        }
                        break;
                    case 68:
                        if (read(i15, i13, generatedMessageLite)) {
                            accessgetDiskCacheLockp accessgetdiskcachelockp2 = (accessgetDiskCacheLockp) unsafe.getObject(generatedMessageLite, j);
                            fromStringlambda1 fromstringlambda6 = read(i13);
                            int iSerializer24 = setRuntimeAppConfigurationProvider.serializer(i15);
                            serializedSize = ((a) accessgetdiskcachelockp2).getSerializedSize(fromstringlambda6);
                            iSerializer3 = iSerializer24 * 2;
                            iSerializer9 = serializedSize + iSerializer3;
                            i14 += iSerializer9;
                        }
                        break;
                }
                i13 += 3;
                i12 = i;
                i11 = i2;
                i10 = 1048575;
            } else {
                ((getTriggerEvent) this.MediaDescriptionCompat).getClass();
                int i27 = generatedMessageLite.serializer.read() + i14;
                if (!this.MediaSessionCompatResultReceiverWrapper) {
                    return i27;
                }
                this.MediaBrowserCompatMediaItem.getClass();
                return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.IconCompatParcelizer() + i27;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:213:0x06bf A[Catch: all -> 0x06b0, TryCatch #15 {all -> 0x06b0, blocks: (B:196:0x0689, B:211:0x06ba, B:213:0x06bf, B:214:0x06c4), top: B:247:0x0689 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x06d0 A[LOOP:5: B:217:0x06ce->B:218:0x06d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:220:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:230:0x06f6 A[LOOP:2: B:229:0x06f4->B:230:0x06f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:232:0x0708  */
    /* JADX WARN: Code duplicated, block: B:274:0x06cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:? A[RETURN, SYNTHETIC] */
    @Override // o.fromStringlambda1
    public final void write(Object obj, v vVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws Throwable {
        int[] iArr;
        int i;
        Object obj2;
        Object objSerializer;
        int i2;
        Object objSerializer2;
        int i3;
        Object objSerializer3;
        boolean z;
        Object objSerializer4;
        getServerKeyFromCardType getserverkeyfromcardtypeSerializer;
        u uVar = vVar.read;
        delayedInitializationAnalyticsBehavior.getClass();
        write(obj);
        c1 c1Var = this.MediaDescriptionCompat;
        int[] iArr2 = this.ComponentActivity;
        int i4 = this.write;
        int i5 = this.RemoteActionCompatParcelizer;
        Object objWrite = null;
        ImageStyle imageStyleEnsureExtensionsAreMutable = null;
        while (true) {
            try {
                int i6 = vVar.read();
                int iWrite = (i6 < this.ParcelableVolumeInfo || i6 > this.PlaybackStateCompat) ? -1 : write(i6, 0);
                if (iWrite < 0) {
                    if (i6 == Integer.MAX_VALUE) {
                        Object objSerializer5 = objWrite;
                        while (i5 < i4) {
                            objSerializer5 = serializer(obj, iArr2[i5], objSerializer5, c1Var, obj);
                            i5++;
                        }
                        if (objSerializer5 != null) {
                            c1Var.write(obj, objSerializer5);
                            return;
                        }
                        return;
                    }
                    try {
                        boolean z2 = this.MediaSessionCompatResultReceiverWrapper;
                        r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa = this.MediaBrowserCompatMediaItem;
                        if (z2) {
                            accessgetDiskCacheLockp accessgetdiskcachelockp = this.PlaybackStateCompatCustomAction;
                            try {
                                r8lambdahxndgep3nzae65egvievrgkrmsa.getClass();
                                getserverkeyfromcardtypeSerializer = delayedInitializationAnalyticsBehavior.serializer(i6, accessgetdiskcachelockp);
                            } catch (Throwable th) {
                                th = th;
                                i = i5;
                                obj2 = objWrite;
                                iArr = iArr2;
                                objWrite = obj2;
                                objSerializer = objWrite;
                                while (i2 < i4) {
                                    objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
                                }
                                if (objSerializer != null) {
                                    c1Var.write(obj, objSerializer);
                                }
                                throw th;
                            }
                        } else {
                            getserverkeyfromcardtypeSerializer = null;
                        }
                        if (getserverkeyfromcardtypeSerializer != null) {
                            if (imageStyleEnsureExtensionsAreMutable == null) {
                                try {
                                    r8lambdahxndgep3nzae65egvievrgkrmsa.getClass();
                                    imageStyleEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
                                } catch (Throwable th2) {
                                    th = th2;
                                    iArr = iArr2;
                                    i = i5;
                                    obj2 = objWrite;
                                    objSerializer = obj2;
                                    while (i2 < i4) {
                                        objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
                                    }
                                    if (objSerializer != null) {
                                        c1Var.write(obj, objSerializer);
                                    }
                                    throw th;
                                }
                            }
                            r8lambdahxndgep3nzae65egvievrgkrmsa.getClass();
                            i = i5;
                            obj2 = objWrite;
                            try {
                                objSerializer4 = r8lambdaHxndgEp3NZAe65egvieVRgKrMSA.serializer(obj, vVar, getserverkeyfromcardtypeSerializer, delayedInitializationAnalyticsBehavior, imageStyleEnsureExtensionsAreMutable, objWrite, c1Var);
                                objWrite = objSerializer4;
                                iArr = iArr2;
                                i5 = i;
                                iArr2 = iArr;
                            } catch (Throwable th3) {
                                th = th3;
                                iArr = iArr2;
                                objSerializer = obj2;
                                while (i2 < i4) {
                                    objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
                                }
                                if (objSerializer != null) {
                                    c1Var.write(obj, objSerializer);
                                }
                                throw th;
                            }
                        } else {
                            i = i5;
                            Object obj3 = objWrite;
                            try {
                                c1Var.getClass();
                                objWrite = obj3 == null ? c1Var.write(obj) : obj3;
                                try {
                                    if (!c1Var.serializer(0, vVar, objWrite)) {
                                        Object objSerializer6 = objWrite;
                                        for (int i7 = i; i7 < i4; i7++) {
                                            objSerializer6 = serializer(obj, iArr2[i7], objSerializer6, c1Var, obj);
                                        }
                                        if (objSerializer6 != null) {
                                            c1Var.write(obj, objSerializer6);
                                            return;
                                        }
                                        return;
                                    }
                                    i5 = i;
                                } catch (Throwable th4) {
                                    th = th4;
                                    iArr = iArr2;
                                    objSerializer = objWrite;
                                    while (i2 < i4) {
                                        objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
                                    }
                                    if (objSerializer != null) {
                                        c1Var.write(obj, objSerializer);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                objWrite = obj3;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        i = i5;
                        obj2 = objWrite;
                    }
                } else {
                    i = i5;
                    obj2 = objWrite;
                    try {
                        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(iWrite);
                        try {
                            try {
                                int iWrite2 = write(iMediaBrowserCompatMediaItem);
                                SdkDataWipeEvent sdkDataWipeEvent = this.RatingCompat;
                                switch (iWrite2) {
                                    case 0:
                                        iArr = iArr2;
                                        long jSerializer = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(1);
                                        SimpleValueCallback.IconCompatParcelizer.read(obj, jSerializer, uVar.PlaybackStateCompat());
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 1:
                                        iArr = iArr2;
                                        long jSerializer2 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(5);
                                        SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(obj, jSerializer2, uVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 2:
                                        iArr = iArr2;
                                        long jSerializer3 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(0);
                                        SimpleValueCallback.write(obj, jSerializer3, uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 3:
                                        iArr = iArr2;
                                        long jSerializer4 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(0);
                                        SimpleValueCallback.write(obj, jSerializer4, uVar.MediaDescriptionCompat());
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 4:
                                        iArr = iArr2;
                                        long jSerializer5 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(0);
                                        SimpleValueCallback.read(jSerializer5, uVar.ComponentActivity(), obj);
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 5:
                                        iArr = iArr2;
                                        long jSerializer6 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(1);
                                        SimpleValueCallback.write(obj, jSerializer6, uVar.ResultReceiver());
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 6:
                                        iArr = iArr2;
                                        long jSerializer7 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(5);
                                        SimpleValueCallback.read(jSerializer7, uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), obj);
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 7:
                                        iArr = iArr2;
                                        long jSerializer8 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(0);
                                        SimpleValueCallback.IconCompatParcelizer.serializer(obj, jSerializer8, uVar.MediaSessionCompatResultReceiverWrapper());
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 8:
                                        iArr = iArr2;
                                        read(iMediaBrowserCompatMediaItem, vVar, obj);
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 9:
                                        iArr = iArr2;
                                        accessgetDiskCacheLockp accessgetdiskcachelockp2 = (accessgetDiskCacheLockp) write(iWrite, obj);
                                        fromStringlambda1 fromstringlambda1 = read(iWrite);
                                        vVar.write(2);
                                        vVar.read(accessgetdiskcachelockp2, fromstringlambda1, delayedInitializationAnalyticsBehavior);
                                        read(obj, iWrite, accessgetdiskcachelockp2);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 10:
                                        iArr = iArr2;
                                        SimpleValueCallback.serializer(serializer(iMediaBrowserCompatMediaItem), obj, vVar.serializer());
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 11:
                                        iArr = iArr2;
                                        long jSerializer9 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(0);
                                        SimpleValueCallback.read(jSerializer9, uVar.serializer(), obj);
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 12:
                                        iArr = iArr2;
                                        vVar.write(0);
                                        int iPlaybackStateCompatCustomAction = uVar.PlaybackStateCompatCustomAction();
                                        FeatureFlagsUpdatedEventCompanion featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iWrite);
                                        if (featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer != null && !featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer.write(iPlaybackStateCompatCustomAction)) {
                                            objSerializer3 = GeofenceTransitionType.read(obj, i6, iPlaybackStateCompatCustomAction, obj2, c1Var);
                                            objWrite = objSerializer3;
                                            i5 = i;
                                            iArr2 = iArr;
                                        }
                                        SimpleValueCallback.read(serializer(iMediaBrowserCompatMediaItem), iPlaybackStateCompatCustomAction, obj);
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 13:
                                        iArr = iArr2;
                                        long jSerializer10 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(5);
                                        SimpleValueCallback.read(jSerializer10, uVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8(), obj);
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 14:
                                        iArr = iArr2;
                                        long jSerializer11 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(1);
                                        SimpleValueCallback.write(obj, jSerializer11, uVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 15:
                                        iArr = iArr2;
                                        long jSerializer12 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(0);
                                        SimpleValueCallback.read(jSerializer12, uVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), obj);
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 16:
                                        iArr = iArr2;
                                        long jSerializer13 = serializer(iMediaBrowserCompatMediaItem);
                                        vVar.write(0);
                                        SimpleValueCallback.write(obj, jSerializer13, uVar.IconCompatParcelizer());
                                        IconCompatParcelizer(iWrite, obj);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 17:
                                        iArr = iArr2;
                                        accessgetDiskCacheLockp accessgetdiskcachelockp3 = (accessgetDiskCacheLockp) write(iWrite, obj);
                                        fromStringlambda1 fromstringlambda2 = read(iWrite);
                                        vVar.write(3);
                                        vVar.serializer(accessgetdiskcachelockp3, fromstringlambda2, delayedInitializationAnalyticsBehavior);
                                        read(obj, iWrite, accessgetdiskcachelockp3);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 18:
                                        iArr = iArr2;
                                        vVar.RatingCompat(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 19:
                                        iArr = iArr2;
                                        vVar.serializer(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 20:
                                        iArr = iArr2;
                                        vVar.MediaBrowserCompatMediaItem(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 21:
                                        iArr = iArr2;
                                        vVar.IconCompatParcelizer(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 22:
                                        iArr = iArr2;
                                        vVar.ParcelableVolumeInfo(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 23:
                                        iArr = iArr2;
                                        vVar.MediaSessionCompatResultReceiverWrapper(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 24:
                                        iArr = iArr2;
                                        vVar.write(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 25:
                                        iArr = iArr2;
                                        vVar.PlaybackStateCompatCustomAction(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 26:
                                        iArr = iArr2;
                                        if ((536870912 & iMediaBrowserCompatMediaItem) != 0) {
                                            vVar.read(sdkDataWipeEvent.write(iMediaBrowserCompatMediaItem & 1048575, obj), true);
                                        } else {
                                            vVar.read(sdkDataWipeEvent.write(iMediaBrowserCompatMediaItem & 1048575, obj), false);
                                        }
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 27:
                                        iArr = iArr2;
                                        RemoteActionCompatParcelizer(obj, iMediaBrowserCompatMediaItem, vVar, read(iWrite), delayedInitializationAnalyticsBehavior);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 28:
                                        iArr = iArr2;
                                        vVar.MediaDescriptionCompat(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 29:
                                        iArr = iArr2;
                                        vVar.MediaMetadataCompat(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 30:
                                        iArr = iArr2;
                                        List listWrite = sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj);
                                        vVar.PlaybackStateCompat(listWrite);
                                        objSerializer3 = GeofenceTransitionType.serializer(obj, i6, listWrite, RemoteActionCompatParcelizer(iWrite), obj2, c1Var);
                                        objWrite = objSerializer3;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 31:
                                        iArr = iArr2;
                                        vVar.read(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 32:
                                        iArr = iArr2;
                                        vVar.MediaSessionCompatToken(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 33:
                                        iArr = iArr2;
                                        vVar.RemoteActionCompatParcelizer(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        iArr = iArr2;
                                        vVar.MediaSessionCompatQueueItem(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 35:
                                        iArr = iArr2;
                                        vVar.RatingCompat(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        iArr = iArr2;
                                        vVar.serializer(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 37:
                                        iArr = iArr2;
                                        vVar.MediaBrowserCompatMediaItem(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 38:
                                        iArr = iArr2;
                                        vVar.IconCompatParcelizer(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        iArr = iArr2;
                                        vVar.ParcelableVolumeInfo(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 40:
                                        iArr = iArr2;
                                        vVar.MediaSessionCompatResultReceiverWrapper(sdkDataWipeEvent.write(serializer(iMediaBrowserCompatMediaItem), obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        iArr = iArr2;
                                        vVar.write(sdkDataWipeEvent.write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        iArr = iArr2;
                                        vVar.PlaybackStateCompatCustomAction(sdkDataWipeEvent.write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 43:
                                        iArr = iArr2;
                                        vVar.MediaMetadataCompat(sdkDataWipeEvent.write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 44:
                                        iArr = iArr2;
                                        try {
                                            List listWrite2 = sdkDataWipeEvent.write(iMediaBrowserCompatMediaItem & 1048575, obj);
                                            vVar.PlaybackStateCompat(listWrite2);
                                            objSerializer3 = GeofenceTransitionType.serializer(obj, i6, listWrite2, RemoteActionCompatParcelizer(iWrite), obj2, c1Var);
                                            objWrite = objSerializer3;
                                            i5 = i;
                                            iArr2 = iArr;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            objSerializer = obj2;
                                            for (i2 = i; i2 < i4; i2++) {
                                                objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
                                            }
                                            if (objSerializer != null) {
                                                c1Var.write(obj, objSerializer);
                                            }
                                            throw th;
                                        }
                                        break;
                                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        iArr = iArr2;
                                        vVar.read(sdkDataWipeEvent.write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 46:
                                        iArr = iArr2;
                                        vVar.MediaSessionCompatToken(sdkDataWipeEvent.write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 47:
                                        iArr = iArr2;
                                        vVar.RemoteActionCompatParcelizer(sdkDataWipeEvent.write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                                        iArr = iArr2;
                                        vVar.MediaSessionCompatQueueItem(sdkDataWipeEvent.write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 49:
                                        iArr = iArr2;
                                        serializer(obj, iMediaBrowserCompatMediaItem & 1048575, vVar, read(iWrite), delayedInitializationAnalyticsBehavior);
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                                        read(obj, iWrite, IconCompatParcelizer(iWrite), delayedInitializationAnalyticsBehavior, vVar);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 51:
                                        vVar.write(1);
                                        SimpleValueCallback.serializer(iMediaBrowserCompatMediaItem & 1048575, obj, Double.valueOf(uVar.PlaybackStateCompat()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                                        vVar.write(5);
                                        SimpleValueCallback.serializer(iMediaBrowserCompatMediaItem & 1048575, obj, Float.valueOf(uVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 53:
                                        long j = iMediaBrowserCompatMediaItem & 1048575;
                                        z = false;
                                        try {
                                            vVar.write(0);
                                            SimpleValueCallback.serializer(j, obj, Long.valueOf(uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
                                            IconCompatParcelizer(i6, iWrite, obj);
                                            iArr = iArr2;
                                            objWrite = obj2;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                            iArr = iArr2;
                                            objWrite = obj2;
                                            c1Var.getClass();
                                            if (objWrite == null) {
                                                objWrite = c1Var.write(obj);
                                            }
                                            if (!c1Var.serializer(0, vVar, objWrite)) {
                                                objSerializer2 = objWrite;
                                                for (i3 = i; i3 < i4; i3++) {
                                                    objSerializer2 = serializer(obj, iArr[i3], objSerializer2, c1Var, obj);
                                                }
                                                if (objSerializer2 != null) {
                                                    c1Var.write(obj, objSerializer2);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 54:
                                        long j2 = iMediaBrowserCompatMediaItem & 1048575;
                                        vVar.write(0);
                                        SimpleValueCallback.serializer(j2, obj, Long.valueOf(uVar.MediaDescriptionCompat()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 55:
                                        long j3 = iMediaBrowserCompatMediaItem & 1048575;
                                        vVar.write(0);
                                        SimpleValueCallback.serializer(j3, obj, Integer.valueOf(uVar.ComponentActivity()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 56:
                                        vVar.write(1);
                                        SimpleValueCallback.serializer(iMediaBrowserCompatMediaItem & 1048575, obj, Long.valueOf(uVar.ResultReceiver()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 57:
                                        vVar.write(5);
                                        SimpleValueCallback.serializer(iMediaBrowserCompatMediaItem & 1048575, obj, Integer.valueOf(uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 58:
                                        long j4 = iMediaBrowserCompatMediaItem & 1048575;
                                        vVar.write(0);
                                        SimpleValueCallback.serializer(j4, obj, Boolean.valueOf(uVar.MediaSessionCompatResultReceiverWrapper()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 59:
                                        read(iMediaBrowserCompatMediaItem, vVar, obj);
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 60:
                                        accessgetDiskCacheLockp accessgetdiskcachelockp4 = (accessgetDiskCacheLockp) RemoteActionCompatParcelizer(i6, iWrite, obj);
                                        fromStringlambda1 fromstringlambda3 = read(iWrite);
                                        vVar.write(2);
                                        vVar.read(accessgetdiskcachelockp4, fromstringlambda3, delayedInitializationAnalyticsBehavior);
                                        IconCompatParcelizer(i6, iWrite, obj, accessgetdiskcachelockp4);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case RectListKt.BitOffsetForFocusable /* 61 */:
                                        SimpleValueCallback.serializer(iMediaBrowserCompatMediaItem & 1048575, obj, vVar.serializer());
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case RectListKt.BitOffsetForGesturable /* 62 */:
                                        long j5 = iMediaBrowserCompatMediaItem & 1048575;
                                        try {
                                            vVar.write(0);
                                            SimpleValueCallback.serializer(j5, obj, Integer.valueOf(uVar.serializer()));
                                            IconCompatParcelizer(i6, iWrite, obj);
                                            iArr = iArr2;
                                            objWrite = obj2;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                            z = false;
                                            iArr = iArr2;
                                            objWrite = obj2;
                                            c1Var.getClass();
                                            if (objWrite == null) {
                                                objWrite = c1Var.write(obj);
                                            }
                                            if (!c1Var.serializer(0, vVar, objWrite)) {
                                                objSerializer2 = objWrite;
                                                while (i3 < i4) {
                                                    objSerializer2 = serializer(obj, iArr[i3], objSerializer2, c1Var, obj);
                                                }
                                                if (objSerializer2 != null) {
                                                    c1Var.write(obj, objSerializer2);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 63:
                                        try {
                                            try {
                                                vVar.write(0);
                                                int iPlaybackStateCompatCustomAction2 = uVar.PlaybackStateCompatCustomAction();
                                                FeatureFlagsUpdatedEventCompanion featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(iWrite);
                                                try {
                                                    if (featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer2 != null && !featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer2.write(iPlaybackStateCompatCustomAction2)) {
                                                        objSerializer4 = GeofenceTransitionType.read(obj, i6, iPlaybackStateCompatCustomAction2, obj2, c1Var);
                                                        objWrite = objSerializer4;
                                                        iArr = iArr2;
                                                        i5 = i;
                                                        iArr2 = iArr;
                                                    }
                                                    SimpleValueCallback.serializer(iMediaBrowserCompatMediaItem & 1048575, obj, Integer.valueOf(iPlaybackStateCompatCustomAction2));
                                                    IconCompatParcelizer(i6, iWrite, obj);
                                                    iArr = iArr2;
                                                    objWrite = obj2;
                                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                                    z = false;
                                                    iArr = iArr2;
                                                    objWrite = obj2;
                                                    c1Var.getClass();
                                                    if (objWrite == null) {
                                                        objWrite = c1Var.write(obj);
                                                    }
                                                    if (!c1Var.serializer(0, vVar, objWrite)) {
                                                        objSerializer2 = objWrite;
                                                        while (i3 < i4) {
                                                            objSerializer2 = serializer(obj, iArr[i3], objSerializer2, c1Var, obj);
                                                        }
                                                        if (objSerializer2 != null) {
                                                            c1Var.write(obj, objSerializer2);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                iArr = iArr2;
                                                objWrite = obj2;
                                                objSerializer = objWrite;
                                                while (i2 < i4) {
                                                    objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
                                                }
                                                if (objSerializer != null) {
                                                    c1Var.write(obj, objSerializer);
                                                }
                                                throw th;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            iArr = iArr2;
                                            objWrite = obj2;
                                            c1Var.getClass();
                                            if (objWrite == null) {
                                                objWrite = c1Var.write(obj);
                                            }
                                            if (!c1Var.serializer(0, vVar, objWrite)) {
                                                objSerializer2 = objWrite;
                                                while (i3 < i4) {
                                                    objSerializer2 = serializer(obj, iArr[i3], objSerializer2, c1Var, obj);
                                                }
                                                if (objSerializer2 != null) {
                                                    c1Var.write(obj, objSerializer2);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 64:
                                        vVar.write(5);
                                        SimpleValueCallback.serializer(iMediaBrowserCompatMediaItem & 1048575, obj, Integer.valueOf(uVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 65:
                                        vVar.write(1);
                                        SimpleValueCallback.serializer(iMediaBrowserCompatMediaItem & 1048575, obj, Long.valueOf(uVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 66:
                                        vVar.write(0);
                                        SimpleValueCallback.serializer(iMediaBrowserCompatMediaItem & 1048575, obj, Integer.valueOf(uVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 67:
                                        vVar.write(0);
                                        SimpleValueCallback.serializer(iMediaBrowserCompatMediaItem & 1048575, obj, Long.valueOf(uVar.IconCompatParcelizer()));
                                        IconCompatParcelizer(i6, iWrite, obj);
                                        iArr = iArr2;
                                        objWrite = obj2;
                                        i5 = i;
                                        iArr2 = iArr;
                                        break;
                                    case 68:
                                        try {
                                            accessgetDiskCacheLockp accessgetdiskcachelockp5 = (accessgetDiskCacheLockp) RemoteActionCompatParcelizer(i6, iWrite, obj);
                                            fromStringlambda1 fromstringlambda4 = read(iWrite);
                                            vVar.write(3);
                                            vVar.serializer(accessgetdiskcachelockp5, fromstringlambda4, delayedInitializationAnalyticsBehavior);
                                            IconCompatParcelizer(i6, iWrite, obj, accessgetdiskcachelockp5);
                                            iArr = iArr2;
                                            objWrite = obj2;
                                            i5 = i;
                                            iArr2 = iArr;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            iArr = iArr2;
                                            objWrite = obj2;
                                            objSerializer = objWrite;
                                            while (i2 < i4) {
                                                objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
                                            }
                                            if (objSerializer != null) {
                                                c1Var.write(obj, objSerializer);
                                            }
                                            throw th;
                                        }
                                        break;
                                    default:
                                        iArr = iArr2;
                                        if (obj2 == null) {
                                            try {
                                                try {
                                                    objWrite = c1Var.write(obj);
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    objWrite = obj2;
                                                    objSerializer = objWrite;
                                                    while (i2 < i4) {
                                                        objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
                                                    }
                                                    if (objSerializer != null) {
                                                        c1Var.write(obj, objSerializer);
                                                    }
                                                    throw th;
                                                }
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                                objWrite = obj2;
                                                c1Var.getClass();
                                                if (objWrite == null) {
                                                    objWrite = c1Var.write(obj);
                                                }
                                                if (!c1Var.serializer(0, vVar, objWrite)) {
                                                    objSerializer2 = objWrite;
                                                    while (i3 < i4) {
                                                        objSerializer2 = serializer(obj, iArr[i3], objSerializer2, c1Var, obj);
                                                    }
                                                    if (objSerializer2 != null) {
                                                        c1Var.write(obj, objSerializer2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                i5 = i;
                                                iArr2 = iArr;
                                            }
                                        } else {
                                            objWrite = obj2;
                                        }
                                        try {
                                            try {
                                                if (!c1Var.serializer(0, vVar, objWrite)) {
                                                    Object objSerializer7 = objWrite;
                                                    for (int i8 = i; i8 < i4; i8++) {
                                                        objSerializer7 = serializer(obj, iArr[i8], objSerializer7, c1Var, obj);
                                                    }
                                                    if (objSerializer7 != null) {
                                                        c1Var.write(obj, objSerializer7);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                                c1Var.getClass();
                                                if (objWrite == null) {
                                                    objWrite = c1Var.write(obj);
                                                }
                                                if (!c1Var.serializer(0, vVar, objWrite)) {
                                                    objSerializer2 = objWrite;
                                                    while (i3 < i4) {
                                                        objSerializer2 = serializer(obj, iArr[i3], objSerializer2, c1Var, obj);
                                                    }
                                                    if (objSerializer2 != null) {
                                                        c1Var.write(obj, objSerializer2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                            i5 = i;
                                            iArr2 = iArr;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            objSerializer = objWrite;
                                            while (i2 < i4) {
                                                objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
                                            }
                                            if (objSerializer != null) {
                                                c1Var.write(obj, objSerializer);
                                            }
                                            throw th;
                                        }
                                        break;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                iArr = iArr2;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        iArr = iArr2;
                        objSerializer = obj2;
                        while (i2 < i4) {
                            objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
                        }
                        if (objSerializer != null) {
                            c1Var.write(obj, objSerializer);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th14) {
                th = th14;
            }
            while (i2 < i4) {
                objSerializer = serializer(obj, iArr[i2], objSerializer, c1Var, obj);
            }
            if (objSerializer != null) {
                c1Var.write(obj, objSerializer);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082 A[SYNTHETIC] */
    @Override // o.fromStringlambda1
    public final void IconCompatParcelizer(Object obj) {
        if (RemoteActionCompatParcelizer(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.MediaMetadataCompat;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
                long j = 1048575 & iMediaBrowserCompatMediaItem;
                int iWrite = write(iMediaBrowserCompatMediaItem);
                if (iWrite != 9) {
                    if (iWrite != 60 && iWrite != 68) {
                        switch (iWrite) {
                            case 17:
                                if (serializer(i, obj)) {
                                    read(i).IconCompatParcelizer(IconCompatParcelizer.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            case 35:
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case 37:
                            case 38:
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            case 40:
                            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            case 43:
                            case 44:
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            case 46:
                            case 47:
                            case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                            case 49:
                                this.RatingCompat.IconCompatParcelizer(j, obj);
                                break;
                            case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                                Unsafe unsafe = IconCompatParcelizer;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.MediaSessionCompatQueueItem.getClass();
                                    ((MapFieldLite) object).RemoteActionCompatParcelizer();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (read(iArr[i], i, obj)) {
                        read(i).IconCompatParcelizer(IconCompatParcelizer.getObject(obj, j));
                    }
                } else if (serializer(i, obj)) {
                    read(i).IconCompatParcelizer(IconCompatParcelizer.getObject(obj, j));
                }
            }
            ((getTriggerEvent) this.MediaDescriptionCompat).getClass();
            IValueCallback iValueCallback = ((GeneratedMessageLite) obj).serializer;
            if (iValueCallback.MediaDescriptionCompat) {
                iValueCallback.MediaDescriptionCompat = false;
            }
            if (this.MediaSessionCompatResultReceiverWrapper) {
                this.MediaBrowserCompatMediaItem.getClass();
                ((GeneratedMessageLite.ExtendableMessage) obj).extensions.MediaDescriptionCompat();
            }
        }
    }

    public final void IconCompatParcelizer(int i, int i2, Object obj) {
        SimpleValueCallback.read(this.MediaMetadataCompat[i2 + 2] & 1048575, i, obj);
    }

    public static void write(Object obj) {
        if (RemoteActionCompatParcelizer(obj)) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj, "Mutating immutable message: "));
    }

    public final boolean read(int i, int i2, Object obj) {
        return SimpleValueCallback.IconCompatParcelizer.read((long) (this.MediaMetadataCompat[i2 + 2] & 1048575), obj) == i;
    }

    public final fromStringlambda1 read(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.MediaSessionCompatToken;
        fromStringlambda1 fromstringlambda1 = (fromStringlambda1) objArr[i2];
        if (fromstringlambda1 != null) {
            return fromstringlambda1;
        }
        fromStringlambda1 fromstringlambda2 = BrazeViewBounds.read.read((Class) objArr[i2 + 1]);
        objArr[i2] = fromstringlambda2;
        return fromstringlambda2;
    }

    public final void IconCompatParcelizer(int i, Object obj) {
        int i2 = this.MediaMetadataCompat[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        SimpleValueCallback.read(j, (1 << (i2 >>> 20)) | SimpleValueCallback.IconCompatParcelizer.read(j, obj), obj);
    }

    public final void IconCompatParcelizer(Object obj, int i, Object obj2) {
        if (serializer(i, obj2)) {
            long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i) & 1048575;
            Unsafe unsafe = IconCompatParcelizer;
            Object object = unsafe.getObject(obj2, jMediaBrowserCompatMediaItem);
            if (object != null) {
                fromStringlambda1 fromstringlambda1 = read(i);
                if (!serializer(i, obj)) {
                    if (!RemoteActionCompatParcelizer(object)) {
                        unsafe.putObject(obj, jMediaBrowserCompatMediaItem, object);
                    } else {
                        GeneratedMessageLite generatedMessageLiteSerializer = fromstringlambda1.serializer();
                        fromstringlambda1.write(generatedMessageLiteSerializer, object);
                        unsafe.putObject(obj, jMediaBrowserCompatMediaItem, generatedMessageLiteSerializer);
                    }
                    IconCompatParcelizer(i, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, jMediaBrowserCompatMediaItem);
                if (!RemoteActionCompatParcelizer(object2)) {
                    GeneratedMessageLite generatedMessageLiteSerializer2 = fromstringlambda1.serializer();
                    fromstringlambda1.write(generatedMessageLiteSerializer2, object2);
                    unsafe.putObject(obj, jMediaBrowserCompatMediaItem, generatedMessageLiteSerializer2);
                    object2 = generatedMessageLiteSerializer2;
                }
                fromstringlambda1.write(object2, object);
                return;
            }
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(this.MediaMetadataCompat[i], obj2);
        }
    }

    public final Object RemoteActionCompatParcelizer(int i, int i2, Object obj) {
        fromStringlambda1 fromstringlambda1 = read(i2);
        if (!read(i, i2, obj)) {
            return fromstringlambda1.serializer();
        }
        Object object = IconCompatParcelizer.getObject(obj, MediaBrowserCompatMediaItem(i2) & 1048575);
        if (RemoteActionCompatParcelizer(object)) {
            return object;
        }
        GeneratedMessageLite generatedMessageLiteSerializer = fromstringlambda1.serializer();
        if (object != null) {
            fromstringlambda1.write(generatedMessageLiteSerializer, object);
        }
        return generatedMessageLiteSerializer;
    }

    @Override // o.fromStringlambda1
    public final boolean read(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        boolean zWrite;
        int[] iArr = this.MediaMetadataCompat;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
            long j = iMediaBrowserCompatMediaItem & 1048575;
            switch (write(iMediaBrowserCompatMediaItem)) {
                case 0:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla = SimpleValueCallback.IconCompatParcelizer;
                        if (Double.doubleToLongBits(r8lambdabnqylh_upxuvzpqwd9sltrjrla.IconCompatParcelizer(j, generatedMessageLite)) == Double.doubleToLongBits(r8lambdabnqylh_upxuvzpqwd9sltrjrla.IconCompatParcelizer(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla2 = SimpleValueCallback.IconCompatParcelizer;
                        if (Float.floatToIntBits(r8lambdabnqylh_upxuvzpqwd9sltrjrla2.serializer(j, generatedMessageLite)) == Float.floatToIntBits(r8lambdabnqylh_upxuvzpqwd9sltrjrla2.serializer(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla3 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla3.MediaDescriptionCompat(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla3.MediaDescriptionCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 3:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla4 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla4.MediaDescriptionCompat(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla4.MediaDescriptionCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 4:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla5 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla5.read(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla5.read(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 5:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla6 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla6.MediaDescriptionCompat(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla6.MediaDescriptionCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 6:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla7 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla7.read(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla7.read(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 7:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla8 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla8.RemoteActionCompatParcelizer(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla8.RemoteActionCompatParcelizer(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 8:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla9 = SimpleValueCallback.IconCompatParcelizer;
                        if (GeofenceTransitionType.write(r8lambdabnqylh_upxuvzpqwd9sltrjrla9.MediaMetadataCompat(j, generatedMessageLite), r8lambdabnqylh_upxuvzpqwd9sltrjrla9.MediaMetadataCompat(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 9:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla10 = SimpleValueCallback.IconCompatParcelizer;
                        if (GeofenceTransitionType.write(r8lambdabnqylh_upxuvzpqwd9sltrjrla10.MediaMetadataCompat(j, generatedMessageLite), r8lambdabnqylh_upxuvzpqwd9sltrjrla10.MediaMetadataCompat(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 10:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla11 = SimpleValueCallback.IconCompatParcelizer;
                        if (GeofenceTransitionType.write(r8lambdabnqylh_upxuvzpqwd9sltrjrla11.MediaMetadataCompat(j, generatedMessageLite), r8lambdabnqylh_upxuvzpqwd9sltrjrla11.MediaMetadataCompat(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 11:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla12 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla12.read(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla12.read(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 12:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla13 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla13.read(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla13.read(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 13:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla14 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla14.read(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla14.read(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 14:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla15 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla15.MediaDescriptionCompat(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla15.MediaDescriptionCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 15:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla16 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla16.read(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla16.read(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 16:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla17 = SimpleValueCallback.IconCompatParcelizer;
                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla17.MediaDescriptionCompat(j, generatedMessageLite) == r8lambdabnqylh_upxuvzpqwd9sltrjrla17.MediaDescriptionCompat(j, generatedMessageLite2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 17:
                    if (RemoteActionCompatParcelizer(generatedMessageLite, generatedMessageLite2, i)) {
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla18 = SimpleValueCallback.IconCompatParcelizer;
                        if (GeofenceTransitionType.write(r8lambdabnqylh_upxuvzpqwd9sltrjrla18.MediaMetadataCompat(j, generatedMessageLite), r8lambdabnqylh_upxuvzpqwd9sltrjrla18.MediaMetadataCompat(j, generatedMessageLite2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case 44:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                case 49:
                    r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla19 = SimpleValueCallback.IconCompatParcelizer;
                    zWrite = GeofenceTransitionType.write(r8lambdabnqylh_upxuvzpqwd9sltrjrla19.MediaMetadataCompat(j, generatedMessageLite), r8lambdabnqylh_upxuvzpqwd9sltrjrla19.MediaMetadataCompat(j, generatedMessageLite2));
                    break;
                case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla20 = SimpleValueCallback.IconCompatParcelizer;
                    zWrite = GeofenceTransitionType.write(r8lambdabnqylh_upxuvzpqwd9sltrjrla20.MediaMetadataCompat(j, generatedMessageLite), r8lambdabnqylh_upxuvzpqwd9sltrjrla20.MediaMetadataCompat(j, generatedMessageLite2));
                    break;
                case 51:
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case RectListKt.BitOffsetForFocusable /* 61 */:
                case RectListKt.BitOffsetForGesturable /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = iArr[i + 2] & 1048575;
                    r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla21 = SimpleValueCallback.IconCompatParcelizer;
                    if (r8lambdabnqylh_upxuvzpqwd9sltrjrla21.read(j2, generatedMessageLite) != r8lambdabnqylh_upxuvzpqwd9sltrjrla21.read(j2, generatedMessageLite2) || !GeofenceTransitionType.write(r8lambdabnqylh_upxuvzpqwd9sltrjrla21.MediaMetadataCompat(j, generatedMessageLite), r8lambdabnqylh_upxuvzpqwd9sltrjrla21.MediaMetadataCompat(j, generatedMessageLite2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zWrite) {
                return false;
            }
        }
        getTriggerEvent gettriggerevent = (getTriggerEvent) this.MediaDescriptionCompat;
        gettriggerevent.getClass();
        IValueCallback iValueCallback = generatedMessageLite.serializer;
        gettriggerevent.getClass();
        if (iValueCallback.equals(generatedMessageLite2.serializer)) {
            if (!this.MediaSessionCompatResultReceiverWrapper) {
                return true;
            }
            this.MediaBrowserCompatMediaItem.getClass();
            return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:101:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:102:0x0308  */
    /* JADX WARN: Code duplicated, block: B:103:0x0316  */
    /* JADX WARN: Code duplicated, block: B:104:0x0324  */
    /* JADX WARN: Code duplicated, block: B:105:0x0332  */
    /* JADX WARN: Code duplicated, block: B:106:0x0340  */
    /* JADX WARN: Code duplicated, block: B:107:0x034e  */
    /* JADX WARN: Code duplicated, block: B:108:0x035b  */
    /* JADX WARN: Code duplicated, block: B:109:0x036c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0379  */
    /* JADX WARN: Code duplicated, block: B:111:0x0386  */
    /* JADX WARN: Code duplicated, block: B:112:0x0393  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:114:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:116:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:117:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:119:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:121:0x0403  */
    /* JADX WARN: Code duplicated, block: B:122:0x0411  */
    /* JADX WARN: Code duplicated, block: B:124:0x0418  */
    /* JADX WARN: Code duplicated, block: B:126:0x0433  */
    /* JADX WARN: Code duplicated, block: B:127:0x0446  */
    /* JADX WARN: Code duplicated, block: B:129:0x0461  */
    /* JADX WARN: Code duplicated, block: B:130:0x0473  */
    /* JADX WARN: Code duplicated, block: B:132:0x048e  */
    /* JADX WARN: Code duplicated, block: B:133:0x049b  */
    /* JADX WARN: Code duplicated, block: B:135:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:136:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:138:0x04de  */
    /* JADX WARN: Code duplicated, block: B:139:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:141:0x0506  */
    /* JADX WARN: Code duplicated, block: B:142:0x0513  */
    /* JADX WARN: Code duplicated, block: B:144:0x052e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0539  */
    /* JADX WARN: Code duplicated, block: B:147:0x0554  */
    /* JADX WARN: Code duplicated, block: B:148:0x0561  */
    /* JADX WARN: Code duplicated, block: B:150:0x057c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0585  */
    /* JADX WARN: Code duplicated, block: B:153:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:154:0x05af  */
    /* JADX WARN: Code duplicated, block: B:156:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:157:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:159:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:160:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:162:0x0612  */
    /* JADX WARN: Code duplicated, block: B:163:0x061b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0636  */
    /* JADX WARN: Code duplicated, block: B:166:0x0643  */
    /* JADX WARN: Code duplicated, block: B:168:0x065e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0667  */
    /* JADX WARN: Code duplicated, block: B:171:0x0682  */
    /* JADX WARN: Code duplicated, block: B:172:0x0697  */
    /* JADX WARN: Code duplicated, block: B:174:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:188:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x06c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x011b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x013b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:61:0x016e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0198  */
    /* JADX WARN: Code duplicated, block: B:69:0x019e  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX WARN: Code duplicated, block: B:81:0x01de  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x0200  */
    /* JADX WARN: Code duplicated, block: B:85:0x021c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0225  */
    /* JADX WARN: Code duplicated, block: B:87:0x0236  */
    /* JADX WARN: Code duplicated, block: B:88:0x0244  */
    /* JADX WARN: Code duplicated, block: B:89:0x0252  */
    /* JADX WARN: Code duplicated, block: B:90:0x0260  */
    /* JADX WARN: Code duplicated, block: B:91:0x026e  */
    /* JADX WARN: Code duplicated, block: B:92:0x027c  */
    /* JADX WARN: Code duplicated, block: B:93:0x028a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0298  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x02de  */
    public final void write(Object obj, accessisOfflinep accessisofflinep) {
        Map.Entry entry;
        Iterator it;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        long j;
        int i4;
        boolean z;
        accessisOfflinep accessisofflinep2 = accessisofflinep;
        boolean z2 = this.MediaSessionCompatResultReceiverWrapper;
        r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa = this.MediaBrowserCompatMediaItem;
        if (z2) {
            r8lambdahxndgep3nzae65egvievrgkrmsa.getClass();
            ImageStyle imageStyle = ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
            if (imageStyle.serializer.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itRemoteActionCompatParcelizer = imageStyle.RemoteActionCompatParcelizer();
                entry = (Map.Entry) itRemoteActionCompatParcelizer.next();
                it = itRemoteActionCompatParcelizer;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = this.MediaMetadataCompat;
        int length = iArr.length;
        Unsafe unsafe = IconCompatParcelizer;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < length) {
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i7);
            int i8 = iArr[i7];
            int iWrite = write(iMediaBrowserCompatMediaItem);
            int i9 = length;
            if (iWrite <= 17) {
                int i10 = iArr[i7 + 2];
                Map.Entry entry3 = entry;
                int i11 = i10 & 1048575;
                if (i11 != i5) {
                    i6 = i11 == 1048575 ? 0 : unsafe.getInt(obj, i11);
                    i5 = i11;
                }
                int i12 = 1 << (i10 >>> 20);
                i = i5;
                i2 = i6;
                entry2 = entry3;
                i3 = i12;
            } else {
                i = i5;
                i2 = i6;
                entry2 = entry;
                i3 = 0;
            }
            while (entry2 != null) {
                r8lambdahxndgep3nzae65egvievrgkrmsa.getClass();
                if (((accessgetCardTypeMapcp) entry2.getKey()).RemoteActionCompatParcelizer <= i8) {
                    r8lambdaHxndgEp3NZAe65egvieVRgKrMSA.serializer(accessisofflinep2, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                } else {
                    j = iMediaBrowserCompatMediaItem & 1048575;
                    switch (iWrite) {
                        case 0:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                double dIconCompatParcelizer = SimpleValueCallback.IconCompatParcelizer.IconCompatParcelizer(j, obj);
                                setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer;
                                setruntimeappconfigurationprovider.getClass();
                                setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(i8, Double.doubleToRawLongBits(dIconCompatParcelizer));
                            }
                            break;
                        case 1:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                float fSerializer = SimpleValueCallback.IconCompatParcelizer.serializer(j, obj);
                                setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider2 = (setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer;
                                setruntimeappconfigurationprovider2.getClass();
                                setruntimeappconfigurationprovider2.read(i8, Float.floatToRawIntBits(fSerializer));
                            }
                            break;
                        case 2:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                accessisofflinep2.serializer(i8, unsafe.getLong(obj, j));
                            }
                            break;
                        case 3:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).write(i8, unsafe.getLong(obj, j));
                            }
                            break;
                        case 4:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                accessisofflinep2.RemoteActionCompatParcelizer(i8, unsafe.getInt(obj, j));
                            }
                            break;
                        case 5:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                accessisofflinep2.RemoteActionCompatParcelizer(i8, unsafe.getLong(obj, j));
                            }
                            break;
                        case 6:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                accessisofflinep2.write(i8, unsafe.getInt(obj, j));
                            }
                            break;
                        case 7:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).read(i8, SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(j, obj));
                            }
                            break;
                        case 8:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                read(i8, unsafe.getObject(obj, j), accessisofflinep2);
                            }
                            break;
                        case 9:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                accessisofflinep2.serializer(i8, unsafe.getObject(obj, j), read(i4));
                            }
                            break;
                        case 10:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                accessisofflinep2.RemoteActionCompatParcelizer(i8, (ByteString) unsafe.getObject(obj, j));
                            }
                            break;
                        case 11:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).serializer(i8, unsafe.getInt(obj, j));
                            }
                            break;
                        case 12:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).IconCompatParcelizer(i8, unsafe.getInt(obj, j));
                            }
                            break;
                        case 13:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).read(i8, unsafe.getInt(obj, j));
                            }
                            break;
                        case 14:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(i8, unsafe.getLong(obj, j));
                            }
                            break;
                        case 15:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            it = it;
                            i = i;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i4, i, i2, i3)) {
                                int i13 = unsafe.getInt(obj, j);
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).serializer(i8, (i13 << 1) ^ (i13 >> 31));
                            }
                            break;
                        case 16:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            entry2 = entry2;
                            i4 = i7;
                            it = it;
                            i = i;
                            if (read(obj, i4, i, i2, i3)) {
                                long j2 = unsafe.getLong(obj, j);
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).write(i8, (j2 >> 63) ^ (j2 << 1));
                            }
                            break;
                        case 17:
                            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                            entry2 = entry2;
                            i4 = i7;
                            if (read(obj, i7, i, i2, i3)) {
                                accessisofflinep2 = accessisofflinep;
                                accessisofflinep2.read(i8, unsafe.getObject(obj, j), read(i4));
                            } else {
                                accessisofflinep2 = accessisofflinep;
                            }
                            it = it;
                            i = i;
                            break;
                        case 18:
                            z = false;
                            GeofenceTransitionType.read(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 19:
                            z = false;
                            GeofenceTransitionType.RatingCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 20:
                            z = false;
                            GeofenceTransitionType.MediaDescriptionCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 21:
                            z = false;
                            GeofenceTransitionType.PlaybackStateCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 22:
                            z = false;
                            GeofenceTransitionType.MediaMetadataCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 23:
                            z = false;
                            GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 24:
                            z = false;
                            GeofenceTransitionType.serializer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 25:
                            z = false;
                            GeofenceTransitionType.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 26:
                            GeofenceTransitionType.serializer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2);
                            i4 = i7;
                            break;
                        case 27:
                            GeofenceTransitionType.serializer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, read(i7));
                            i4 = i7;
                            break;
                        case 28:
                            GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2);
                            i4 = i7;
                            break;
                        case 29:
                            GeofenceTransitionType.ParcelableVolumeInfo(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 30:
                            GeofenceTransitionType.write(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 31:
                            GeofenceTransitionType.MediaSessionCompatQueueItem(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 32:
                            GeofenceTransitionType.MediaBrowserCompatMediaItem(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 33:
                            GeofenceTransitionType.MediaSessionCompatResultReceiverWrapper(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            GeofenceTransitionType.MediaSessionCompatToken(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                            i4 = i7;
                            break;
                        case 35:
                            GeofenceTransitionType.read(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            GeofenceTransitionType.RatingCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case 37:
                            GeofenceTransitionType.MediaDescriptionCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case 38:
                            GeofenceTransitionType.PlaybackStateCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            GeofenceTransitionType.MediaMetadataCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case 40:
                            GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            GeofenceTransitionType.serializer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            GeofenceTransitionType.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case 43:
                            GeofenceTransitionType.ParcelableVolumeInfo(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case 44:
                            GeofenceTransitionType.write(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            GeofenceTransitionType.MediaSessionCompatQueueItem(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case 46:
                            GeofenceTransitionType.MediaBrowserCompatMediaItem(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case 47:
                            GeofenceTransitionType.MediaSessionCompatResultReceiverWrapper(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                            GeofenceTransitionType.MediaSessionCompatToken(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                            i4 = i7;
                            break;
                        case 49:
                            GeofenceTransitionType.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, read(i7));
                            i4 = i7;
                            break;
                        case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                            write(accessisofflinep2, i8, unsafe.getObject(obj, j), i7);
                            i4 = i7;
                            break;
                        case 51:
                            if (read(i8, i7, obj)) {
                                double dDoubleValue = ((Double) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj)).doubleValue();
                                setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider3 = (setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer;
                                setruntimeappconfigurationprovider3.getClass();
                                setruntimeappconfigurationprovider3.RemoteActionCompatParcelizer(i8, Double.doubleToRawLongBits(dDoubleValue));
                            }
                            i4 = i7;
                            break;
                        case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                            if (read(i8, i7, obj)) {
                                float fFloatValue = ((Float) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj)).floatValue();
                                setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider4 = (setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer;
                                setruntimeappconfigurationprovider4.getClass();
                                setruntimeappconfigurationprovider4.read(i8, Float.floatToRawIntBits(fFloatValue));
                            }
                            i4 = i7;
                            break;
                        case 53:
                            if (read(i8, i7, obj)) {
                                accessisofflinep2.serializer(i8, write(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 54:
                            if (read(i8, i7, obj)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).write(i8, write(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 55:
                            if (read(i8, i7, obj)) {
                                accessisofflinep2.RemoteActionCompatParcelizer(i8, RemoteActionCompatParcelizer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 56:
                            if (read(i8, i7, obj)) {
                                accessisofflinep2.RemoteActionCompatParcelizer(i8, write(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 57:
                            if (read(i8, i7, obj)) {
                                accessisofflinep2.write(i8, RemoteActionCompatParcelizer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 58:
                            if (read(i8, i7, obj)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).read(i8, ((Boolean) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj)).booleanValue());
                            }
                            i4 = i7;
                            break;
                        case 59:
                            if (read(i8, i7, obj)) {
                                read(i8, unsafe.getObject(obj, j), accessisofflinep2);
                            }
                            i4 = i7;
                            break;
                        case 60:
                            if (read(i8, i7, obj)) {
                                accessisofflinep2.serializer(i8, unsafe.getObject(obj, j), read(i7));
                            }
                            i4 = i7;
                            break;
                        case RectListKt.BitOffsetForFocusable /* 61 */:
                            if (read(i8, i7, obj)) {
                                accessisofflinep2.RemoteActionCompatParcelizer(i8, (ByteString) unsafe.getObject(obj, j));
                            }
                            i4 = i7;
                            break;
                        case RectListKt.BitOffsetForGesturable /* 62 */:
                            if (read(i8, i7, obj)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).serializer(i8, RemoteActionCompatParcelizer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 63:
                            if (read(i8, i7, obj)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).IconCompatParcelizer(i8, RemoteActionCompatParcelizer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 64:
                            if (read(i8, i7, obj)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).read(i8, RemoteActionCompatParcelizer(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 65:
                            if (read(i8, i7, obj)) {
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(i8, write(j, obj));
                            }
                            i4 = i7;
                            break;
                        case 66:
                            if (read(i8, i7, obj)) {
                                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j, obj);
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).serializer(i8, (iRemoteActionCompatParcelizer << 1) ^ (iRemoteActionCompatParcelizer >> 31));
                            }
                            i4 = i7;
                            break;
                        case 67:
                            if (read(i8, i7, obj)) {
                                long jWrite = write(j, obj);
                                ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).write(i8, (jWrite << 1) ^ (jWrite >> 63));
                            }
                            i4 = i7;
                            break;
                        case 68:
                            if (read(i8, i7, obj)) {
                                accessisofflinep2.read(i8, unsafe.getObject(obj, j), read(i7));
                            }
                            i4 = i7;
                            break;
                        default:
                            i4 = i7;
                            break;
                    }
                    i7 = i4 + 3;
                    it = it;
                    i6 = i2;
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    length = i9;
                    iArr = iArr;
                    entry = entry2;
                    i5 = i;
                }
            }
            j = iMediaBrowserCompatMediaItem & 1048575;
            switch (iWrite) {
                case 0:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        double dIconCompatParcelizer2 = SimpleValueCallback.IconCompatParcelizer.IconCompatParcelizer(j, obj);
                        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider5 = (setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer;
                        setruntimeappconfigurationprovider5.getClass();
                        setruntimeappconfigurationprovider5.RemoteActionCompatParcelizer(i8, Double.doubleToRawLongBits(dIconCompatParcelizer2));
                    }
                    break;
                case 1:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        float fSerializer2 = SimpleValueCallback.IconCompatParcelizer.serializer(j, obj);
                        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider6 = (setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer;
                        setruntimeappconfigurationprovider6.getClass();
                        setruntimeappconfigurationprovider6.read(i8, Float.floatToRawIntBits(fSerializer2));
                    }
                    break;
                case 2:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        accessisofflinep2.serializer(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).write(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        accessisofflinep2.RemoteActionCompatParcelizer(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        accessisofflinep2.RemoteActionCompatParcelizer(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        accessisofflinep2.write(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).read(i8, SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(j, obj));
                    }
                    break;
                case 8:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        read(i8, unsafe.getObject(obj, j), accessisofflinep2);
                    }
                    break;
                case 9:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        accessisofflinep2.serializer(i8, unsafe.getObject(obj, j), read(i4));
                    }
                    break;
                case 10:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        accessisofflinep2.RemoteActionCompatParcelizer(i8, (ByteString) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).serializer(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).IconCompatParcelizer(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).read(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    it = it;
                    i = i;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i4, i, i2, i3)) {
                        int i14 = unsafe.getInt(obj, j);
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).serializer(i8, (i14 << 1) ^ (i14 >> 31));
                    }
                    break;
                case 16:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    entry2 = entry2;
                    i4 = i7;
                    it = it;
                    i = i;
                    if (read(obj, i4, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).write(i8, (j3 >> 63) ^ (j3 << 1));
                    }
                    break;
                case 17:
                    r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
                    entry2 = entry2;
                    i4 = i7;
                    if (read(obj, i7, i, i2, i3)) {
                        accessisofflinep2 = accessisofflinep;
                        accessisofflinep2.read(i8, unsafe.getObject(obj, j), read(i4));
                    } else {
                        accessisofflinep2 = accessisofflinep;
                    }
                    it = it;
                    i = i;
                    break;
                case 18:
                    z = false;
                    GeofenceTransitionType.read(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 19:
                    z = false;
                    GeofenceTransitionType.RatingCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 20:
                    z = false;
                    GeofenceTransitionType.MediaDescriptionCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 21:
                    z = false;
                    GeofenceTransitionType.PlaybackStateCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 22:
                    z = false;
                    GeofenceTransitionType.MediaMetadataCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 23:
                    z = false;
                    GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 24:
                    z = false;
                    GeofenceTransitionType.serializer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 25:
                    z = false;
                    GeofenceTransitionType.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 26:
                    GeofenceTransitionType.serializer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2);
                    i4 = i7;
                    break;
                case 27:
                    GeofenceTransitionType.serializer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, read(i7));
                    i4 = i7;
                    break;
                case 28:
                    GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2);
                    i4 = i7;
                    break;
                case 29:
                    GeofenceTransitionType.ParcelableVolumeInfo(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 30:
                    GeofenceTransitionType.write(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 31:
                    GeofenceTransitionType.MediaSessionCompatQueueItem(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 32:
                    GeofenceTransitionType.MediaBrowserCompatMediaItem(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 33:
                    GeofenceTransitionType.MediaSessionCompatResultReceiverWrapper(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    GeofenceTransitionType.MediaSessionCompatToken(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, false);
                    i4 = i7;
                    break;
                case 35:
                    GeofenceTransitionType.read(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    GeofenceTransitionType.RatingCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case 37:
                    GeofenceTransitionType.MediaDescriptionCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case 38:
                    GeofenceTransitionType.PlaybackStateCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    GeofenceTransitionType.MediaMetadataCompat(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case 40:
                    GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    GeofenceTransitionType.serializer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    GeofenceTransitionType.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case 43:
                    GeofenceTransitionType.ParcelableVolumeInfo(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case 44:
                    GeofenceTransitionType.write(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    GeofenceTransitionType.MediaSessionCompatQueueItem(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case 46:
                    GeofenceTransitionType.MediaBrowserCompatMediaItem(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case 47:
                    GeofenceTransitionType.MediaSessionCompatResultReceiverWrapper(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                    GeofenceTransitionType.MediaSessionCompatToken(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, true);
                    i4 = i7;
                    break;
                case 49:
                    GeofenceTransitionType.IconCompatParcelizer(iArr[i7], (List) unsafe.getObject(obj, j), accessisofflinep2, read(i7));
                    i4 = i7;
                    break;
                case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                    write(accessisofflinep2, i8, unsafe.getObject(obj, j), i7);
                    i4 = i7;
                    break;
                case 51:
                    if (read(i8, i7, obj)) {
                        double dDoubleValue2 = ((Double) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj)).doubleValue();
                        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider7 = (setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer;
                        setruntimeappconfigurationprovider7.getClass();
                        setruntimeappconfigurationprovider7.RemoteActionCompatParcelizer(i8, Double.doubleToRawLongBits(dDoubleValue2));
                    }
                    i4 = i7;
                    break;
                case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    if (read(i8, i7, obj)) {
                        float fFloatValue2 = ((Float) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj)).floatValue();
                        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider8 = (setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer;
                        setruntimeappconfigurationprovider8.getClass();
                        setruntimeappconfigurationprovider8.read(i8, Float.floatToRawIntBits(fFloatValue2));
                    }
                    i4 = i7;
                    break;
                case 53:
                    if (read(i8, i7, obj)) {
                        accessisofflinep2.serializer(i8, write(j, obj));
                    }
                    i4 = i7;
                    break;
                case 54:
                    if (read(i8, i7, obj)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).write(i8, write(j, obj));
                    }
                    i4 = i7;
                    break;
                case 55:
                    if (read(i8, i7, obj)) {
                        accessisofflinep2.RemoteActionCompatParcelizer(i8, RemoteActionCompatParcelizer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 56:
                    if (read(i8, i7, obj)) {
                        accessisofflinep2.RemoteActionCompatParcelizer(i8, write(j, obj));
                    }
                    i4 = i7;
                    break;
                case 57:
                    if (read(i8, i7, obj)) {
                        accessisofflinep2.write(i8, RemoteActionCompatParcelizer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 58:
                    if (read(i8, i7, obj)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).read(i8, ((Boolean) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj)).booleanValue());
                    }
                    i4 = i7;
                    break;
                case 59:
                    if (read(i8, i7, obj)) {
                        read(i8, unsafe.getObject(obj, j), accessisofflinep2);
                    }
                    i4 = i7;
                    break;
                case 60:
                    if (read(i8, i7, obj)) {
                        accessisofflinep2.serializer(i8, unsafe.getObject(obj, j), read(i7));
                    }
                    i4 = i7;
                    break;
                case RectListKt.BitOffsetForFocusable /* 61 */:
                    if (read(i8, i7, obj)) {
                        accessisofflinep2.RemoteActionCompatParcelizer(i8, (ByteString) unsafe.getObject(obj, j));
                    }
                    i4 = i7;
                    break;
                case RectListKt.BitOffsetForGesturable /* 62 */:
                    if (read(i8, i7, obj)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).serializer(i8, RemoteActionCompatParcelizer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 63:
                    if (read(i8, i7, obj)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).IconCompatParcelizer(i8, RemoteActionCompatParcelizer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 64:
                    if (read(i8, i7, obj)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).read(i8, RemoteActionCompatParcelizer(j, obj));
                    }
                    i4 = i7;
                    break;
                case 65:
                    if (read(i8, i7, obj)) {
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(i8, write(j, obj));
                    }
                    i4 = i7;
                    break;
                case 66:
                    if (read(i8, i7, obj)) {
                        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(j, obj);
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).serializer(i8, (iRemoteActionCompatParcelizer2 << 1) ^ (iRemoteActionCompatParcelizer2 >> 31));
                    }
                    i4 = i7;
                    break;
                case 67:
                    if (read(i8, i7, obj)) {
                        long jWrite2 = write(j, obj);
                        ((setRuntimeAppConfigurationProvider) accessisofflinep2.RemoteActionCompatParcelizer).write(i8, (jWrite2 << 1) ^ (jWrite2 >> 63));
                    }
                    i4 = i7;
                    break;
                case 68:
                    if (read(i8, i7, obj)) {
                        accessisofflinep2.read(i8, unsafe.getObject(obj, j), read(i7));
                    }
                    i4 = i7;
                    break;
                default:
                    i4 = i7;
                    break;
            }
            i7 = i4 + 3;
            it = it;
            i6 = i2;
            r8lambdahxndgep3nzae65egvievrgkrmsa = r8lambdahxndgep3nzae65egvievrgkrmsa;
            length = i9;
            iArr = iArr;
            entry = entry2;
            i5 = i;
        }
        r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa2 = r8lambdahxndgep3nzae65egvievrgkrmsa;
        Iterator it2 = it;
        while (entry != null) {
            r8lambdahxndgep3nzae65egvievrgkrmsa2.getClass();
            r8lambdaHxndgEp3NZAe65egvieVRgKrMSA.serializer(accessisofflinep2, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        ((getTriggerEvent) this.MediaDescriptionCompat).getClass();
        ((GeneratedMessageLite) obj).serializer.read(accessisofflinep2);
    }

    public final Object IconCompatParcelizer(int i) {
        return this.MediaSessionCompatToken[(i / 3) * 2];
    }

    public final Object write(int i, Object obj) {
        fromStringlambda1 fromstringlambda1 = read(i);
        long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i) & 1048575;
        if (!serializer(i, obj)) {
            return fromstringlambda1.serializer();
        }
        Object object = IconCompatParcelizer.getObject(obj, jMediaBrowserCompatMediaItem);
        if (RemoteActionCompatParcelizer(object)) {
            return object;
        }
        GeneratedMessageLite generatedMessageLiteSerializer = fromstringlambda1.serializer();
        if (object != null) {
            fromstringlambda1.write(generatedMessageLiteSerializer, object);
        }
        return generatedMessageLiteSerializer;
    }

    public final int write(int i, int i2) {
        int[] iArr = this.MediaMetadataCompat;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final Object serializer(Object obj, int i, Object obj2, c1 c1Var, Object obj3) {
        FeatureFlagsUpdatedEventCompanion featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer;
        int i2 = this.MediaMetadataCompat[i];
        Object objMediaMetadataCompat = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(MediaBrowserCompatMediaItem(i) & 1048575, obj);
        if (objMediaMetadataCompat == null || (featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i)) == null) {
            return obj2;
        }
        this.MediaSessionCompatQueueItem.getClass();
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = ((r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA) IconCompatParcelizer(i)).IconCompatParcelizer;
        Iterator it = ((MapFieldLite) objMediaMetadataCompat).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer.write(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = c1Var.write(obj3);
                }
                int iSerializer = r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA.serializer(r8lambdadeozq815xuuwmllyyvm_qv79qy, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iSerializer];
                Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(bArr, iSerializer);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    ImageStyle.read(runtimeAppConfigurationProvider, (WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer, 1, key);
                    ImageStyle.read(runtimeAppConfigurationProvider, (WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.write, 2, value);
                    if (runtimeAppConfigurationProvider.read() == 0) {
                        ByteString.LiteralByteString literalByteString = new ByteString.LiteralByteString(bArr);
                        ((getTriggerEvent) c1Var).getClass();
                        ((IValueCallback) obj2).write((i2 << 3) | 2, literalByteString);
                        it.remove();
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Did not write as much data as expected.");
                        return null;
                    }
                } catch (IOException e) {
                    DrawableTransformation.read((Throwable) e);
                    return null;
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    public final boolean serializer(int i, Object obj) {
        int i2 = this.MediaMetadataCompat[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
            long j2 = iMediaBrowserCompatMediaItem & 1048575;
            switch (write(iMediaBrowserCompatMediaItem)) {
                case 0:
                    if (Double.doubleToRawLongBits(SimpleValueCallback.IconCompatParcelizer.IconCompatParcelizer(j2, obj)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(SimpleValueCallback.IconCompatParcelizer.serializer(j2, obj)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (SimpleValueCallback.IconCompatParcelizer.read(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (SimpleValueCallback.IconCompatParcelizer.read(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(j2, obj);
                case 8:
                    Object objMediaMetadataCompat = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j2, obj);
                    if (objMediaMetadataCompat instanceof String) {
                        return !((String) objMediaMetadataCompat).isEmpty();
                    }
                    if (objMediaMetadataCompat instanceof ByteString) {
                        return !ByteString.RemoteActionCompatParcelizer.equals(objMediaMetadataCompat);
                    }
                    DrawableTransformation.write();
                    return false;
                case 9:
                    if (SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j2, obj) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !ByteString.RemoteActionCompatParcelizer.equals(SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j2, obj));
                case 11:
                    if (SimpleValueCallback.IconCompatParcelizer.read(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (SimpleValueCallback.IconCompatParcelizer.read(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (SimpleValueCallback.IconCompatParcelizer.read(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (SimpleValueCallback.IconCompatParcelizer.read(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j2, obj) != null) {
                        return true;
                    }
                    return false;
                default:
                    DrawableTransformation.write();
                    return false;
            }
        }
        if (((1 << (i2 >>> 20)) & SimpleValueCallback.IconCompatParcelizer.read(j, obj)) != 0) {
            return true;
        }
        return false;
    }

    public static java.lang.reflect.Field write(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Field ", str, " for ");
            sbM.append(cls.getName());
            sbM.append(" not found. Known fields are ");
            sbM.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM.toString());
        }
    }

    @Override // o.fromStringlambda1
    public final GeneratedMessageLite serializer() {
        this.read.getClass();
        return ((GeneratedMessageLite) this.PlaybackStateCompatCustomAction).newMutableInstance();
    }

    @Override // o.fromStringlambda1
    public final void write(Object obj, Object obj2) {
        write(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.MediaMetadataCompat;
            if (i < iArr.length) {
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
                long j = 1048575 & iMediaBrowserCompatMediaItem;
                int i2 = iArr[i];
                switch (write(iMediaBrowserCompatMediaItem)) {
                    case 0:
                        if (serializer(i, obj2)) {
                            r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla = SimpleValueCallback.IconCompatParcelizer;
                            r8lambdabnqylh_upxuvzpqwd9sltrjrla.read(obj, j, r8lambdabnqylh_upxuvzpqwd9sltrjrla.IconCompatParcelizer(j, obj2));
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 1:
                        if (serializer(i, obj2)) {
                            r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla2 = SimpleValueCallback.IconCompatParcelizer;
                            r8lambdabnqylh_upxuvzpqwd9sltrjrla2.RemoteActionCompatParcelizer(obj, j, r8lambdabnqylh_upxuvzpqwd9sltrjrla2.serializer(j, obj2));
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 2:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.write(obj, j, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j, obj2));
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 3:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.write(obj, j, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j, obj2));
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 4:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.read(j, SimpleValueCallback.IconCompatParcelizer.read(j, obj2), obj);
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 5:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.write(obj, j, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j, obj2));
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 6:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.read(j, SimpleValueCallback.IconCompatParcelizer.read(j, obj2), obj);
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 7:
                        if (serializer(i, obj2)) {
                            r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla3 = SimpleValueCallback.IconCompatParcelizer;
                            r8lambdabnqylh_upxuvzpqwd9sltrjrla3.serializer(obj, j, r8lambdabnqylh_upxuvzpqwd9sltrjrla3.RemoteActionCompatParcelizer(j, obj2));
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 8:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.serializer(j, obj, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj2));
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 9:
                        IconCompatParcelizer(obj, i, obj2);
                        break;
                    case 10:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.serializer(j, obj, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj2));
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 11:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.read(j, SimpleValueCallback.IconCompatParcelizer.read(j, obj2), obj);
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 12:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.read(j, SimpleValueCallback.IconCompatParcelizer.read(j, obj2), obj);
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 13:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.read(j, SimpleValueCallback.IconCompatParcelizer.read(j, obj2), obj);
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 14:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.write(obj, j, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j, obj2));
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 15:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.read(j, SimpleValueCallback.IconCompatParcelizer.read(j, obj2), obj);
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 16:
                        if (serializer(i, obj2)) {
                            SimpleValueCallback.write(obj, j, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(j, obj2));
                            IconCompatParcelizer(i, obj);
                        }
                        break;
                    case 17:
                        IconCompatParcelizer(obj, i, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    case 35:
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case 37:
                    case 38:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case 40:
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    case 43:
                    case 44:
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                    case 47:
                    case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                    case 49:
                        this.RatingCompat.read(j, obj, obj2);
                        break;
                    case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        Class cls = GeofenceTransitionType.write;
                        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla4 = SimpleValueCallback.IconCompatParcelizer;
                        Object objMediaMetadataCompat = r8lambdabnqylh_upxuvzpqwd9sltrjrla4.MediaMetadataCompat(j, obj);
                        Object objMediaMetadataCompat2 = r8lambdabnqylh_upxuvzpqwd9sltrjrla4.MediaMetadataCompat(j, obj2);
                        this.MediaSessionCompatQueueItem.getClass();
                        SimpleValueCallback.serializer(j, obj, n0.RemoteActionCompatParcelizer(objMediaMetadataCompat, objMediaMetadataCompat2));
                        break;
                    case 51:
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (read(i2, i, obj2)) {
                            SimpleValueCallback.serializer(j, obj, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj2));
                            IconCompatParcelizer(i2, i, obj);
                        }
                        break;
                    case 60:
                        serializer(obj, i, obj2);
                        break;
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (read(i2, i, obj2)) {
                            SimpleValueCallback.serializer(j, obj, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj2));
                            IconCompatParcelizer(i2, i, obj);
                        }
                        break;
                    case 68:
                        serializer(obj, i, obj2);
                        break;
                }
                i += 3;
            } else {
                GeofenceTransitionType.write(this.MediaDescriptionCompat, obj, obj2);
                if (this.MediaSessionCompatResultReceiverWrapper) {
                    this.MediaBrowserCompatMediaItem.getClass();
                    ImageStyle imageStyle = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
                    if (imageStyle.serializer.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable().read(imageStyle);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:101:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:102:0x0400  */
    /* JADX WARN: Code duplicated, block: B:103:0x0414  */
    /* JADX WARN: Code duplicated, block: B:104:0x0428  */
    /* JADX WARN: Code duplicated, block: B:105:0x0440  */
    /* JADX WARN: Code duplicated, block: B:106:0x0454  */
    /* JADX WARN: Code duplicated, block: B:107:0x0468  */
    /* JADX WARN: Code duplicated, block: B:108:0x047c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0490  */
    /* JADX WARN: Code duplicated, block: B:110:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:111:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:112:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:113:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:114:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:117:0x050e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0516  */
    /* JADX WARN: Code duplicated, block: B:120:0x052c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0534  */
    /* JADX WARN: Code duplicated, block: B:123:0x054a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0552  */
    /* JADX WARN: Code duplicated, block: B:126:0x0564  */
    /* JADX WARN: Code duplicated, block: B:128:0x056c  */
    /* JADX WARN: Code duplicated, block: B:129:0x057e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:131:0x0586  */
    /* JADX WARN: Code duplicated, block: B:132:0x0598  */
    /* JADX WARN: Code duplicated, block: B:134:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:137:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:138:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:140:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:143:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:144:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:146:0x0602  */
    /* JADX WARN: Code duplicated, block: B:147:0x0614  */
    /* JADX WARN: Code duplicated, block: B:149:0x061c  */
    /* JADX WARN: Code duplicated, block: B:150:0x062a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0632  */
    /* JADX WARN: Code duplicated, block: B:153:0x0640  */
    /* JADX WARN: Code duplicated, block: B:155:0x0648  */
    /* JADX WARN: Code duplicated, block: B:156:0x0655  */
    /* JADX WARN: Code duplicated, block: B:158:0x065d  */
    /* JADX WARN: Code duplicated, block: B:159:0x066e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0676  */
    /* JADX WARN: Code duplicated, block: B:162:0x0683  */
    /* JADX WARN: Code duplicated, block: B:164:0x068b  */
    /* JADX WARN: Code duplicated, block: B:165:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:167:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:181:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:270:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x012e  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x0178  */
    /* JADX WARN: Code duplicated, block: B:57:0x0186  */
    /* JADX WARN: Code duplicated, block: B:59:0x018e  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x0202  */
    /* JADX WARN: Code duplicated, block: B:75:0x020e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0216  */
    /* JADX WARN: Code duplicated, block: B:78:0x0235  */
    /* JADX WARN: Code duplicated, block: B:80:0x023d  */
    /* JADX WARN: Code duplicated, block: B:81:0x025c  */
    /* JADX WARN: Code duplicated, block: B:82:0x026c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0284  */
    /* JADX WARN: Code duplicated, block: B:84:0x0298  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:88:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0310  */
    /* JADX WARN: Code duplicated, block: B:91:0x0324  */
    /* JADX WARN: Code duplicated, block: B:92:0x0338  */
    /* JADX WARN: Code duplicated, block: B:93:0x034c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0360  */
    /* JADX WARN: Code duplicated, block: B:95:0x0374  */
    /* JADX WARN: Code duplicated, block: B:96:0x0388  */
    /* JADX WARN: Code duplicated, block: B:97:0x039c  */
    /* JADX WARN: Code duplicated, block: B:98:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:99:0x03c4  */
    @Override // o.fromStringlambda1
    public final void read(Object obj, accessisOfflinep accessisofflinep) {
        Iterator it;
        Map.Entry entry;
        Map.Entry entry2;
        accessisofflinep.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa = this.MediaBrowserCompatMediaItem;
            int[] iArr = this.MediaMetadataCompat;
            ((getTriggerEvent) this.MediaDescriptionCompat).getClass();
            ((GeneratedMessageLite) obj).serializer.read(accessisofflinep);
            if (this.MediaSessionCompatResultReceiverWrapper) {
                r8lambdahxndgep3nzae65egvievrgkrmsa.getClass();
                ImageStyle imageStyle = ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
                if (imageStyle.serializer.isEmpty()) {
                    it = null;
                    entry = null;
                } else {
                    GenderCompanion genderCompanion = imageStyle.serializer;
                    if (genderCompanion.MediaDescriptionCompat == null) {
                        genderCompanion.MediaDescriptionCompat = new getMonthlambda10(genderCompanion);
                    }
                    it = genderCompanion.MediaDescriptionCompat.iterator();
                    entry = (Map.Entry) it.next();
                }
            } else {
                it = null;
                entry = null;
            }
            int length = iArr.length - 3;
            while (length >= 0) {
                int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(length);
                int i = iArr[length];
                while (entry != null) {
                    r8lambdahxndgep3nzae65egvievrgkrmsa.getClass();
                    if (((accessgetCardTypeMapcp) entry.getKey()).RemoteActionCompatParcelizer > i) {
                        r8lambdaHxndgEp3NZAe65egvieVRgKrMSA.serializer(accessisofflinep, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    } else {
                        switch (write(iMediaBrowserCompatMediaItem)) {
                            case 0:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    double dIconCompatParcelizer = SimpleValueCallback.IconCompatParcelizer.IconCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj);
                                    setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                                    setruntimeappconfigurationprovider.getClass();
                                    setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dIconCompatParcelizer));
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 1:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    float fSerializer = SimpleValueCallback.IconCompatParcelizer.serializer(iMediaBrowserCompatMediaItem & 1048575, obj);
                                    setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider2 = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                                    setruntimeappconfigurationprovider2.getClass();
                                    setruntimeappconfigurationprovider2.read(i, Float.floatToRawIntBits(fSerializer));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 2:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    accessisofflinep.serializer(i, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 3:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).write(i, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 4:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    accessisofflinep.RemoteActionCompatParcelizer(i, SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 5:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    accessisofflinep.RemoteActionCompatParcelizer(i, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 6:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    accessisofflinep.write(i, SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 7:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).read(i, SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 8:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    read(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep);
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 9:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    accessisofflinep.serializer(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), read(length));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 10:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    accessisofflinep.RemoteActionCompatParcelizer(i, (ByteString) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 11:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 12:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).IconCompatParcelizer(i, SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 13:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).read(i, SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 14:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(i, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 15:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    int i2 = SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj);
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, (i2 << 1) ^ (i2 >> 31));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 16:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    long jMediaDescriptionCompat = SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(iMediaBrowserCompatMediaItem & 1048575, obj);
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).write(i, (jMediaDescriptionCompat >> 63) ^ (jMediaDescriptionCompat << 1));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 17:
                                entry2 = entry;
                                if (serializer(length, obj)) {
                                    accessisofflinep.read(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), read(length));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 18:
                                entry2 = entry;
                                GeofenceTransitionType.read(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 19:
                                entry2 = entry;
                                GeofenceTransitionType.RatingCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 20:
                                entry2 = entry;
                                GeofenceTransitionType.MediaDescriptionCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 21:
                                entry2 = entry;
                                GeofenceTransitionType.PlaybackStateCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 22:
                                entry2 = entry;
                                GeofenceTransitionType.MediaMetadataCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 23:
                                entry2 = entry;
                                GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 24:
                                entry2 = entry;
                                GeofenceTransitionType.serializer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 25:
                                entry2 = entry;
                                GeofenceTransitionType.IconCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 26:
                                entry2 = entry;
                                GeofenceTransitionType.serializer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 27:
                                entry2 = entry;
                                GeofenceTransitionType.serializer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, read(length));
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 28:
                                entry2 = entry;
                                GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 29:
                                entry2 = entry;
                                GeofenceTransitionType.ParcelableVolumeInfo(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 30:
                                entry2 = entry;
                                GeofenceTransitionType.write(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 31:
                                entry2 = entry;
                                GeofenceTransitionType.MediaSessionCompatQueueItem(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 32:
                                entry2 = entry;
                                GeofenceTransitionType.MediaBrowserCompatMediaItem(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 33:
                                entry2 = entry;
                                GeofenceTransitionType.MediaSessionCompatResultReceiverWrapper(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                entry2 = entry;
                                GeofenceTransitionType.MediaSessionCompatToken(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 35:
                                entry2 = entry;
                                GeofenceTransitionType.read(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                entry2 = entry;
                                GeofenceTransitionType.RatingCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 37:
                                entry2 = entry;
                                GeofenceTransitionType.MediaDescriptionCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 38:
                                entry2 = entry;
                                GeofenceTransitionType.PlaybackStateCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                entry2 = entry;
                                GeofenceTransitionType.MediaMetadataCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 40:
                                entry2 = entry;
                                GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                entry2 = entry;
                                GeofenceTransitionType.serializer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                entry2 = entry;
                                GeofenceTransitionType.IconCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 43:
                                entry2 = entry;
                                GeofenceTransitionType.ParcelableVolumeInfo(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 44:
                                entry2 = entry;
                                GeofenceTransitionType.write(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                entry2 = entry;
                                GeofenceTransitionType.MediaSessionCompatQueueItem(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 46:
                                entry2 = entry;
                                GeofenceTransitionType.MediaBrowserCompatMediaItem(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 47:
                                entry2 = entry;
                                GeofenceTransitionType.MediaSessionCompatResultReceiverWrapper(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                                entry2 = entry;
                                GeofenceTransitionType.MediaSessionCompatToken(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 49:
                                entry2 = entry;
                                GeofenceTransitionType.IconCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, read(length));
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                                entry2 = entry;
                                write(accessisofflinep, i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), length);
                                continue;
                                continue;
                                length -= 3;
                                entry = entry2;
                                break;
                            case 51:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    double dDoubleValue = ((Double) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj)).doubleValue();
                                    setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider3 = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                                    setruntimeappconfigurationprovider3.getClass();
                                    setruntimeappconfigurationprovider3.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dDoubleValue));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    float fFloatValue = ((Float) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj)).floatValue();
                                    setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider4 = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                                    setruntimeappconfigurationprovider4.getClass();
                                    setruntimeappconfigurationprovider4.read(i, Float.floatToRawIntBits(fFloatValue));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 53:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    accessisofflinep.serializer(i, write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 54:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).write(i, write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 55:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    accessisofflinep.RemoteActionCompatParcelizer(i, RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 56:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    accessisofflinep.RemoteActionCompatParcelizer(i, write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 57:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    accessisofflinep.write(i, RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 58:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).read(i, ((Boolean) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj)).booleanValue());
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 59:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    read(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep);
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 60:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    accessisofflinep.serializer(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), read(length));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case RectListKt.BitOffsetForFocusable /* 61 */:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    accessisofflinep.RemoteActionCompatParcelizer(i, (ByteString) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case RectListKt.BitOffsetForGesturable /* 62 */:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 63:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).IconCompatParcelizer(i, RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 64:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).read(i, RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 65:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(i, write(iMediaBrowserCompatMediaItem & 1048575, obj));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 66:
                                entry2 = entry;
                                if (read(i, length, obj)) {
                                    int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj);
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, (iRemoteActionCompatParcelizer << 1) ^ (iRemoteActionCompatParcelizer >> 31));
                                } else {
                                    continue;
                                    continue;
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 67:
                                if (read(i, length, obj)) {
                                    entry2 = entry;
                                    long jWrite = write(iMediaBrowserCompatMediaItem & 1048575, obj);
                                    ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).write(i, (jWrite >> 63) ^ (jWrite << 1));
                                }
                                length -= 3;
                                entry = entry2;
                                break;
                            case 68:
                                if (read(i, length, obj)) {
                                    accessisofflinep.read(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), read(length));
                                }
                                break;
                        }
                        entry2 = entry;
                        length -= 3;
                        entry = entry2;
                    }
                }
                switch (write(iMediaBrowserCompatMediaItem)) {
                    case 0:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            double dIconCompatParcelizer2 = SimpleValueCallback.IconCompatParcelizer.IconCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj);
                            setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider5 = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                            setruntimeappconfigurationprovider5.getClass();
                            setruntimeappconfigurationprovider5.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dIconCompatParcelizer2));
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 1:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            float fSerializer2 = SimpleValueCallback.IconCompatParcelizer.serializer(iMediaBrowserCompatMediaItem & 1048575, obj);
                            setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider6 = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                            setruntimeappconfigurationprovider6.getClass();
                            setruntimeappconfigurationprovider6.read(i, Float.floatToRawIntBits(fSerializer2));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 2:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            accessisofflinep.serializer(i, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 3:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).write(i, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 4:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            accessisofflinep.RemoteActionCompatParcelizer(i, SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 5:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            accessisofflinep.RemoteActionCompatParcelizer(i, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 6:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            accessisofflinep.write(i, SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 7:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).read(i, SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 8:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            read(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep);
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 9:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            accessisofflinep.serializer(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), read(length));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 10:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            accessisofflinep.RemoteActionCompatParcelizer(i, (ByteString) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 11:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 12:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).IconCompatParcelizer(i, SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 13:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).read(i, SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 14:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(i, SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 15:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            int i3 = SimpleValueCallback.IconCompatParcelizer.read(iMediaBrowserCompatMediaItem & 1048575, obj);
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, (i3 << 1) ^ (i3 >> 31));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 16:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            long jMediaDescriptionCompat2 = SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(iMediaBrowserCompatMediaItem & 1048575, obj);
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).write(i, (jMediaDescriptionCompat2 >> 63) ^ (jMediaDescriptionCompat2 << 1));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 17:
                        entry2 = entry;
                        if (serializer(length, obj)) {
                            accessisofflinep.read(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), read(length));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 18:
                        entry2 = entry;
                        GeofenceTransitionType.read(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 19:
                        entry2 = entry;
                        GeofenceTransitionType.RatingCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 20:
                        entry2 = entry;
                        GeofenceTransitionType.MediaDescriptionCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 21:
                        entry2 = entry;
                        GeofenceTransitionType.PlaybackStateCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 22:
                        entry2 = entry;
                        GeofenceTransitionType.MediaMetadataCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 23:
                        entry2 = entry;
                        GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 24:
                        entry2 = entry;
                        GeofenceTransitionType.serializer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 25:
                        entry2 = entry;
                        GeofenceTransitionType.IconCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 26:
                        entry2 = entry;
                        GeofenceTransitionType.serializer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 27:
                        entry2 = entry;
                        GeofenceTransitionType.serializer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, read(length));
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 28:
                        entry2 = entry;
                        GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 29:
                        entry2 = entry;
                        GeofenceTransitionType.ParcelableVolumeInfo(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 30:
                        entry2 = entry;
                        GeofenceTransitionType.write(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 31:
                        entry2 = entry;
                        GeofenceTransitionType.MediaSessionCompatQueueItem(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 32:
                        entry2 = entry;
                        GeofenceTransitionType.MediaBrowserCompatMediaItem(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 33:
                        entry2 = entry;
                        GeofenceTransitionType.MediaSessionCompatResultReceiverWrapper(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        entry2 = entry;
                        GeofenceTransitionType.MediaSessionCompatToken(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, false);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 35:
                        entry2 = entry;
                        GeofenceTransitionType.read(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        entry2 = entry;
                        GeofenceTransitionType.RatingCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 37:
                        entry2 = entry;
                        GeofenceTransitionType.MediaDescriptionCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 38:
                        entry2 = entry;
                        GeofenceTransitionType.PlaybackStateCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        entry2 = entry;
                        GeofenceTransitionType.MediaMetadataCompat(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 40:
                        entry2 = entry;
                        GeofenceTransitionType.RemoteActionCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        entry2 = entry;
                        GeofenceTransitionType.serializer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        entry2 = entry;
                        GeofenceTransitionType.IconCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 43:
                        entry2 = entry;
                        GeofenceTransitionType.ParcelableVolumeInfo(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 44:
                        entry2 = entry;
                        GeofenceTransitionType.write(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        entry2 = entry;
                        GeofenceTransitionType.MediaSessionCompatQueueItem(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 46:
                        entry2 = entry;
                        GeofenceTransitionType.MediaBrowserCompatMediaItem(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 47:
                        entry2 = entry;
                        GeofenceTransitionType.MediaSessionCompatResultReceiverWrapper(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        entry2 = entry;
                        GeofenceTransitionType.MediaSessionCompatToken(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, true);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 49:
                        entry2 = entry;
                        GeofenceTransitionType.IconCompatParcelizer(iArr[length], (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep, read(length));
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        entry2 = entry;
                        write(accessisofflinep, i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), length);
                        continue;
                        continue;
                        length -= 3;
                        entry = entry2;
                        break;
                    case 51:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            double dDoubleValue2 = ((Double) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj)).doubleValue();
                            setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider7 = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                            setruntimeappconfigurationprovider7.getClass();
                            setruntimeappconfigurationprovider7.RemoteActionCompatParcelizer(i, Double.doubleToRawLongBits(dDoubleValue2));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            float fFloatValue2 = ((Float) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj)).floatValue();
                            setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider8 = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                            setruntimeappconfigurationprovider8.getClass();
                            setruntimeappconfigurationprovider8.read(i, Float.floatToRawIntBits(fFloatValue2));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 53:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            accessisofflinep.serializer(i, write(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 54:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).write(i, write(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 55:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            accessisofflinep.RemoteActionCompatParcelizer(i, RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 56:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            accessisofflinep.RemoteActionCompatParcelizer(i, write(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 57:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            accessisofflinep.write(i, RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 58:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).read(i, ((Boolean) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj)).booleanValue());
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 59:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            read(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), accessisofflinep);
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 60:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            accessisofflinep.serializer(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), read(length));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            accessisofflinep.RemoteActionCompatParcelizer(i, (ByteString) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 63:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).IconCompatParcelizer(i, RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 64:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).read(i, RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 65:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(i, write(iMediaBrowserCompatMediaItem & 1048575, obj));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 66:
                        entry2 = entry;
                        if (read(i, length, obj)) {
                            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(iMediaBrowserCompatMediaItem & 1048575, obj);
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).serializer(i, (iRemoteActionCompatParcelizer2 << 1) ^ (iRemoteActionCompatParcelizer2 >> 31));
                        } else {
                            continue;
                            continue;
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 67:
                        if (read(i, length, obj)) {
                            entry2 = entry;
                            long jWrite2 = write(iMediaBrowserCompatMediaItem & 1048575, obj);
                            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).write(i, (jWrite2 >> 63) ^ (jWrite2 << 1));
                        }
                        length -= 3;
                        entry = entry2;
                        break;
                    case 68:
                        if (read(i, length, obj)) {
                            accessisofflinep.read(i, SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj), read(length));
                        }
                        break;
                }
                entry2 = entry;
                length -= 3;
                entry = entry2;
            }
            while (entry != null) {
                r8lambdahxndgep3nzae65egvievrgkrmsa.getClass();
                r8lambdaHxndgEp3NZAe65egvieVRgKrMSA.serializer(accessisofflinep, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            return;
        }
        write(obj, accessisofflinep);
    }

    public final void write(accessisOfflinep accessisofflinep, int i, Object obj, int i2) {
        if (obj != null) {
            Object objIconCompatParcelizer = IconCompatParcelizer(i2);
            this.MediaSessionCompatQueueItem.getClass();
            r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = ((r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA) objIconCompatParcelizer).IconCompatParcelizer;
            setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
            setruntimeappconfigurationprovider.getClass();
            for (Map.Entry entry : ((MapFieldLite) obj).entrySet()) {
                setruntimeappconfigurationprovider.write(i, 2);
                setruntimeappconfigurationprovider.RatingCompat(r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA.serializer(r8lambdadeozq815xuuwmllyyvm_qv79qy, entry.getKey(), entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                ImageStyle.read(setruntimeappconfigurationprovider, (WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer, 1, key);
                ImageStyle.read(setruntimeappconfigurationprovider, (WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.write, 2, value);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0250  */
    /* JADX WARN: Code duplicated, block: B:123:0x0253  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:127:0x026c  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:180:0x0371  */
    public static u0 IconCompatParcelizer(DataStoreValueType dataStoreValueType, getDrawableValue getdrawablevalue, SdkDataWipeEvent sdkDataWipeEvent, c1 c1Var, r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa, n0 n0Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int[] iArr2;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        int i18;
        java.lang.reflect.Field fieldWrite;
        char cCharAt9;
        int i19;
        int i20;
        Object obj;
        java.lang.reflect.Field fieldWrite2;
        int i21;
        Object obj2;
        java.lang.reflect.Field fieldWrite3;
        int i22;
        char cCharAt10;
        int i23;
        char cCharAt11;
        int i24;
        char cCharAt12;
        int i25;
        char cCharAt13;
        DataStoreValueType dataStoreValueType2 = dataStoreValueType;
        String str = dataStoreValueType2.serializer;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i26 = 1;
            while (true) {
                i = i26 + 1;
                if (str.charAt(i26) < 55296) {
                    break;
                }
                i26 = i;
            }
        } else {
            i = 1;
        }
        int i27 = i + 1;
        int iCharAt4 = str.charAt(i);
        if (iCharAt4 >= 55296) {
            int i28 = iCharAt4 & 8191;
            int i29 = 13;
            while (true) {
                i25 = i27 + 1;
                cCharAt13 = str.charAt(i27);
                if (cCharAt13 < 55296) {
                    break;
                }
                i28 |= (cCharAt13 & 8191) << i29;
                i29 += 13;
                i27 = i25;
            }
            iCharAt4 = i28 | (cCharAt13 << i29);
            i27 = i25;
        }
        if (iCharAt4 == 0) {
            iCharAt2 = 0;
            iCharAt3 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i2 = i27;
            iArr = serializer;
            iCharAt = 0;
        } else {
            int i30 = i27 + 1;
            iCharAt = str.charAt(i27);
            if (iCharAt >= 55296) {
                int i31 = iCharAt & 8191;
                int i32 = 13;
                while (true) {
                    i14 = i30 + 1;
                    cCharAt8 = str.charAt(i30);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i31 |= (cCharAt8 & 8191) << i32;
                    i32 += 13;
                    i30 = i14;
                }
                iCharAt = i31 | (cCharAt8 << i32);
                i30 = i14;
            }
            int i33 = i30 + 1;
            int iCharAt5 = str.charAt(i30);
            if (iCharAt5 >= 55296) {
                int i34 = iCharAt5 & 8191;
                int i35 = 13;
                while (true) {
                    i13 = i33 + 1;
                    cCharAt7 = str.charAt(i33);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt7 & 8191) << i35;
                    i35 += 13;
                    i33 = i13;
                }
                iCharAt5 = i34 | (cCharAt7 << i35);
                i33 = i13;
            }
            int i36 = i33 + 1;
            int iCharAt6 = str.charAt(i33);
            if (iCharAt6 >= 55296) {
                int i37 = iCharAt6 & 8191;
                int i38 = 13;
                while (true) {
                    i12 = i36 + 1;
                    cCharAt6 = str.charAt(i36);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt6 & 8191) << i38;
                    i38 += 13;
                    i36 = i12;
                }
                iCharAt6 = i37 | (cCharAt6 << i38);
                i36 = i12;
            }
            int i39 = i36 + 1;
            int iCharAt7 = str.charAt(i36);
            if (iCharAt7 >= 55296) {
                int i40 = iCharAt7 & 8191;
                int i41 = 13;
                while (true) {
                    i11 = i39 + 1;
                    cCharAt5 = str.charAt(i39);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt5 & 8191) << i41;
                    i41 += 13;
                    i39 = i11;
                }
                iCharAt7 = i40 | (cCharAt5 << i41);
                i39 = i11;
            }
            int i42 = i39 + 1;
            iCharAt2 = str.charAt(i39);
            if (iCharAt2 >= 55296) {
                int i43 = iCharAt2 & 8191;
                int i44 = 13;
                while (true) {
                    i10 = i42 + 1;
                    cCharAt4 = str.charAt(i42);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt4 & 8191) << i44;
                    i44 += 13;
                    i42 = i10;
                }
                iCharAt2 = i43 | (cCharAt4 << i44);
                i42 = i10;
            }
            int i45 = i42 + 1;
            iCharAt3 = str.charAt(i42);
            if (iCharAt3 >= 55296) {
                int i46 = iCharAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i9 = i45 + 1;
                    cCharAt3 = str.charAt(i45);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt3 & 8191) << i47;
                    i47 += 13;
                    i45 = i9;
                }
                iCharAt3 = i46 | (cCharAt3 << i47);
                i45 = i9;
            }
            int i48 = i45 + 1;
            int iCharAt8 = str.charAt(i45);
            if (iCharAt8 >= 55296) {
                int i49 = iCharAt8 & 8191;
                int i50 = 13;
                while (true) {
                    i8 = i48 + 1;
                    cCharAt2 = str.charAt(i48);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt2 & 8191) << i50;
                    i50 += 13;
                    i48 = i8;
                }
                iCharAt8 = i49 | (cCharAt2 << i50);
                i48 = i8;
            }
            i2 = i48 + 1;
            int iCharAt9 = str.charAt(i48);
            if (iCharAt9 >= 55296) {
                int i51 = iCharAt9 & 8191;
                int i52 = 13;
                while (true) {
                    i7 = i2 + 1;
                    cCharAt = str.charAt(i2);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i51 |= (cCharAt & 8191) << i52;
                    i52 += 13;
                    i2 = i7;
                }
                iCharAt9 = i51 | (cCharAt << i52);
                i2 = i7;
            }
            i3 = (iCharAt * 2) + iCharAt5;
            i4 = iCharAt6;
            i5 = iCharAt7;
            iArr = new int[iCharAt9 + iCharAt3 + iCharAt8];
            i6 = iCharAt9;
        }
        Unsafe unsafe = IconCompatParcelizer;
        Object[] objArr = dataStoreValueType2.write;
        Class<?> cls = dataStoreValueType2.IconCompatParcelizer.getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 * 2];
        int i53 = i6 + iCharAt3;
        int i54 = 0;
        int i55 = 0;
        int i56 = i6;
        int i57 = i53;
        while (i2 < length) {
            int i58 = i2 + 1;
            int iCharAt10 = str.charAt(i2);
            if (iCharAt10 >= c) {
                int i59 = iCharAt10 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i24 = i60 + 1;
                    cCharAt12 = str.charAt(i60);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i59 |= (cCharAt12 & 8191) << i61;
                    i61 += 13;
                    i60 = i24;
                }
                iCharAt10 = i59 | (cCharAt12 << i61);
                i15 = i24;
            } else {
                i15 = i58;
            }
            int i62 = i15 + 1;
            int iCharAt11 = str.charAt(i15);
            if (iCharAt11 >= c) {
                int i63 = iCharAt11 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i23 = i64 + 1;
                    cCharAt11 = str.charAt(i64);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i63 |= (cCharAt11 & 8191) << i65;
                    i65 += 13;
                    i64 = i23;
                }
                iCharAt11 = i63 | (cCharAt11 << i65);
                i16 = i23;
            } else {
                i16 = i62;
            }
            int i66 = iCharAt11 & 255;
            if ((iCharAt11 & Fields.RotationZ) != 0) {
                iArr[i55] = i54;
                i55++;
            }
            if (i66 >= 51) {
                int i67 = i16 + 1;
                int iCharAt12 = str.charAt(i16);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i68 = iCharAt12 & 8191;
                    int i69 = 13;
                    while (true) {
                        i22 = i67 + 1;
                        cCharAt10 = str.charAt(i67);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i68 |= (cCharAt10 & 8191) << i69;
                        i69 += 13;
                        i67 = i22;
                        c2 = 55296;
                    }
                    iCharAt12 = i68 | (cCharAt10 << i69);
                    i67 = i22;
                }
                int i70 = i66 - 51;
                if (i70 != 9 && i70 != 17) {
                    if (i70 != 12 || (!dataStoreValueType.RemoteActionCompatParcelizer().equals(ProtoSyntax.PROTO2) && (iCharAt11 & Fields.CameraDistance) == 0)) {
                        i67 = i67;
                        i19 = 2;
                    } else {
                        i19 = 2;
                        objArr2[ff$$ExternalSyntheticOutline0.m(i54, 3, 2, 1)] = objArr[i3];
                    }
                    i20 = iCharAt12 * i19;
                    obj = objArr[i20];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldWrite2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldWrite2 = write((Class) cls, (String) obj);
                        objArr[i20] = fieldWrite2;
                    }
                    int[] iArr4 = iArr3;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldWrite2);
                    i21 = i20 + 1;
                    obj2 = objArr[i21];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldWrite3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldWrite3 = write((Class) cls, (String) obj2);
                        objArr[i21] = fieldWrite3;
                    }
                    iArr2 = iArr4;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldWrite3);
                    iCharAt10 = iCharAt10;
                    i2 = i67;
                    i18 = 0;
                } else {
                    i19 = 2;
                    objArr2[ff$$ExternalSyntheticOutline0.m(i54, 3, 2, 1)] = objArr[i3];
                }
                i3++;
                i20 = iCharAt12 * i19;
                obj = objArr[i20];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldWrite2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldWrite2 = write((Class) cls, (String) obj);
                    objArr[i20] = fieldWrite2;
                }
                int[] iArr5 = iArr3;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldWrite2);
                i21 = i20 + 1;
                obj2 = objArr[i21];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldWrite3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldWrite3 = write((Class) cls, (String) obj2);
                    objArr[i21] = fieldWrite3;
                }
                iArr2 = iArr5;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldWrite3);
                iCharAt10 = iCharAt10;
                i2 = i67;
                i18 = 0;
            } else {
                iArr2 = iArr3;
                int i71 = i3 + 1;
                java.lang.reflect.Field fieldWrite4 = write((Class) cls, (String) objArr[i3]);
                if (i66 == 9 || i66 == 17) {
                    iArr2 = iArr2;
                    objArr2[ff$$ExternalSyntheticOutline0.m(i54, 3, 2, 1)] = fieldWrite4.getType();
                } else {
                    if (i66 == 27 || i66 == 49) {
                        iArr2 = iArr2;
                        i3 += 2;
                        objArr2[ff$$ExternalSyntheticOutline0.m(i54, 3, 2, 1)] = objArr[i71];
                    } else if (i66 == 12 || i66 == 30 || i66 == 44) {
                        if (dataStoreValueType.RemoteActionCompatParcelizer() == ProtoSyntax.PROTO2 || (iCharAt11 & Fields.CameraDistance) != 0) {
                            iArr2 = iArr2;
                            i3 += 2;
                            objArr2[ff$$ExternalSyntheticOutline0.m(i54, 3, 2, 1)] = objArr[i71];
                        }
                    } else if (i66 == 50) {
                        int i72 = i56 + 1;
                        iArr[i56] = i54;
                        int i73 = (i54 / 3) * 2;
                        int i74 = i3 + 2;
                        objArr2[i73] = objArr[i71];
                        if ((iCharAt11 & Fields.CameraDistance) != 0) {
                            i3 += 3;
                            objArr2[i73 + 1] = objArr[i74];
                            iArr2 = iArr2;
                            i56 = i72;
                        } else {
                            i56 = i72;
                            i71 = i74;
                        }
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldWrite4);
                    if ((iCharAt11 & Fields.TransformOrigin) != 0 || i66 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i17 = i16;
                        i18 = 0;
                    } else {
                        int i75 = i16 + 1;
                        int iCharAt13 = str.charAt(i16);
                        if (iCharAt13 >= 55296) {
                            int i76 = iCharAt13 & 8191;
                            int i77 = 13;
                            while (true) {
                                i17 = i75 + 1;
                                cCharAt9 = str.charAt(i75);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i76 |= (cCharAt9 & 8191) << i77;
                                i77 += 13;
                                i75 = i17;
                            }
                            iCharAt13 = i76 | (cCharAt9 << i77);
                        } else {
                            i17 = i75;
                        }
                        int i78 = (iCharAt13 / 32) + (iCharAt * 2);
                        Object obj3 = objArr[i78];
                        if (obj3 instanceof java.lang.reflect.Field) {
                            fieldWrite = (java.lang.reflect.Field) obj3;
                        } else {
                            fieldWrite = write((Class) cls, (String) obj3);
                            objArr[i78] = fieldWrite;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldWrite);
                        i18 = iCharAt13 % 32;
                    }
                    if (i66 >= 18 && i66 <= 49) {
                        iArr[i57] = iObjectFieldOffset;
                        i57++;
                    }
                    i2 = i17;
                }
                i3 = i71;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldWrite4);
                if ((iCharAt11 & Fields.TransformOrigin) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i17 = i16;
                    i18 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i17 = i16;
                    i18 = 0;
                }
                if (i66 >= 18) {
                    iArr[i57] = iObjectFieldOffset;
                    i57++;
                }
                i2 = i17;
            }
            iArr2[i54] = iCharAt10;
            iArr2[i54 + 1] = ((iCharAt11 & Fields.RotationY) != 0 ? 536870912 : 0) | ((iCharAt11 & Fields.RotationX) != 0 ? 268435456 : 0) | ((iCharAt11 & Fields.CameraDistance) != 0 ? Integer.MIN_VALUE : 0) | (i66 << 20) | iObjectFieldOffset;
            iArr2[i54 + 2] = (i18 << 20) | iObjectFieldOffset2;
            i54 += 3;
            iArr3 = iArr2;
            length = length;
            c = 55296;
            dataStoreValueType2 = dataStoreValueType;
        }
        accessgetDiskCacheLockp accessgetdiskcachelockp = dataStoreValueType2.IconCompatParcelizer;
        dataStoreValueType.RemoteActionCompatParcelizer();
        return new u0(iArr3, objArr2, i4, i5, accessgetdiskcachelockp, iArr, i6, i53, getdrawablevalue, sdkDataWipeEvent, c1Var, r8lambdahxndgep3nzae65egvievrgkrmsa, n0Var);
    }

    public static int serializer(byte[] bArr, int i, int i2, WireFormat$FieldType wireFormat$FieldType, Class cls, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        switch (r8lambdaz9qWKJS3IHEjgTkGhRIWaI8yrYc.read[wireFormat$FieldType.ordinal()]) {
            case 1:
                int iSerializer = j.serializer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Boolean.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0);
                return iSerializer;
            case 2:
                return j.write(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
            case 3:
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Double.valueOf(Double.longBitsToDouble(j.write(i, bArr)));
                return i + 8;
            case 4:
            case 5:
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Integer.valueOf(j.serializer(i, bArr));
                return i + 4;
            case 6:
            case 7:
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Long.valueOf(j.write(i, bArr));
                return i + 8;
            case 8:
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Float.valueOf(Float.intBitsToFloat(j.serializer(i, bArr)));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iIconCompatParcelizer = j.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Integer.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer);
                return iIconCompatParcelizer;
            case 12:
            case 13:
                int iSerializer2 = j.serializer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Long.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer);
                return iSerializer2;
            case 14:
                return j.read(BrazeViewBounds.read.read(cls), bArr, i, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            case 15:
                int iIconCompatParcelizer2 = j.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Integer.valueOf(u.serializer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
                return iIconCompatParcelizer2;
            case 16:
                int iSerializer3 = j.serializer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = Long.valueOf(u.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
                return iSerializer3;
            case 17:
                int iIconCompatParcelizer3 = j.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                int i3 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                if (i3 < 0) {
                    throw InvalidProtocolBufferException.serializer();
                }
                if (i3 == 0) {
                    r8lambdacyuxafptvn7drfel1dgtevxcy.read = "";
                    return iIconCompatParcelizer3;
                }
                r8lambdacyuxafptvn7drfel1dgtevxcy.read = getErrorReason.read.write(bArr, iIconCompatParcelizer3, i3);
                return iIconCompatParcelizer3 + i3;
            default:
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("unsupported field type.");
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int write(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iWrite;
        int iIconCompatParcelizer = i;
        Unsafe unsafe = IconCompatParcelizer;
        onSuccess onsuccess = (onSuccess) unsafe.getObject(obj, j2);
        if (!((InAppMessageEvent) onsuccess).read) {
            int size = onsuccess.size();
            onsuccess = onsuccess.read(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, onsuccess);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return j.read(bArr, iIconCompatParcelizer, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 1) {
                    accesssetDiskLruCachep accesssetdisklrucachep = (accesssetDiskLruCachep) onsuccess;
                    accesssetdisklrucachep.RemoteActionCompatParcelizer(Double.longBitsToDouble(j.write(iIconCompatParcelizer, bArr)));
                    while (true) {
                        i8 = iIconCompatParcelizer + 8;
                        if (i8 < i2) {
                            iIconCompatParcelizer = j.IconCompatParcelizer(bArr, i8, r8lambdacyuxafptvn7drfel1dgtevxcy);
                            if (i3 == r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                                accesssetdisklrucachep.RemoteActionCompatParcelizer(Double.longBitsToDouble(j.write(iIconCompatParcelizer, bArr)));
                            }
                        }
                    }
                    return i8;
                }
                return iIconCompatParcelizer;
            case 19:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    return j.RemoteActionCompatParcelizer(bArr, iIconCompatParcelizer, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 5) {
                    getRequestInitiationTime getrequestinitiationtime = (getRequestInitiationTime) onsuccess;
                    getrequestinitiationtime.write(Float.intBitsToFloat(j.serializer(iIconCompatParcelizer, bArr)));
                    while (true) {
                        i9 = iIconCompatParcelizer + 4;
                        if (i9 < i2) {
                            iIconCompatParcelizer = j.IconCompatParcelizer(bArr, i9, r8lambdacyuxafptvn7drfel1dgtevxcy);
                            if (i3 == r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                                getrequestinitiationtime.write(Float.intBitsToFloat(j.serializer(iIconCompatParcelizer, bArr)));
                            }
                        }
                    }
                    return i9;
                }
                return iIconCompatParcelizer;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) onsuccess;
                    int iIconCompatParcelizer2 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    int i12 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer + iIconCompatParcelizer2;
                    while (iIconCompatParcelizer2 < i12) {
                        iIconCompatParcelizer2 = j.serializer(bArr, iIconCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer);
                    }
                    if (iIconCompatParcelizer2 == i12) {
                        return iIconCompatParcelizer2;
                    }
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (i5 == 0) {
                    r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb1 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) onsuccess;
                    int iSerializer = j.serializer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    r8lambdawenh2zfjpauxgrrcztm8m6cjb1.RemoteActionCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer);
                    while (iSerializer < i2) {
                        int iIconCompatParcelizer3 = j.IconCompatParcelizer(bArr, iSerializer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        if (i3 != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                            return iSerializer;
                        }
                        iSerializer = j.serializer(bArr, iIconCompatParcelizer3, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        r8lambdawenh2zfjpauxgrrcztm8m6cjb1.RemoteActionCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer);
                    }
                    return iSerializer;
                }
                return iIconCompatParcelizer;
            case 22:
            case 29:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i5 == 2) {
                    return j.RatingCompat(bArr, iIconCompatParcelizer, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 0) {
                    return j.write(i3, bArr, i, i2, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return iIconCompatParcelizer;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return j.IconCompatParcelizer(bArr, iIconCompatParcelizer, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 1) {
                    r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb2 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) onsuccess;
                    r8lambdawenh2zfjpauxgrrcztm8m6cjb2.RemoteActionCompatParcelizer(j.write(iIconCompatParcelizer, bArr));
                    while (true) {
                        i10 = iIconCompatParcelizer + 8;
                        if (i10 < i2) {
                            iIconCompatParcelizer = j.IconCompatParcelizer(bArr, i10, r8lambdacyuxafptvn7drfel1dgtevxcy);
                            if (i3 == r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                                r8lambdawenh2zfjpauxgrrcztm8m6cjb2.RemoteActionCompatParcelizer(j.write(iIconCompatParcelizer, bArr));
                            }
                        }
                    }
                    return i10;
                }
                return iIconCompatParcelizer;
            case 24:
            case 31:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i5 == 2) {
                    return j.write(bArr, iIconCompatParcelizer, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 5) {
                    getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) onsuccess;
                    getunviewedcardcount.IconCompatParcelizer(j.serializer(iIconCompatParcelizer, bArr));
                    while (true) {
                        i11 = iIconCompatParcelizer + 4;
                        if (i11 < i2) {
                            iIconCompatParcelizer = j.IconCompatParcelizer(bArr, i11, r8lambdacyuxafptvn7drfel1dgtevxcy);
                            if (i3 == r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                                getunviewedcardcount.IconCompatParcelizer(j.serializer(iIconCompatParcelizer, bArr));
                            }
                        }
                    }
                    return i11;
                }
                return iIconCompatParcelizer;
            case 25:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (i5 == 2) {
                    return j.serializer(bArr, iIconCompatParcelizer, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 0) {
                    r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4 r8lambdad9d8zanadasmqv1rdea0gwxvs4 = (r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4) onsuccess;
                    int iSerializer2 = j.serializer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    r8lambdad9d8zanadasmqv1rdea0gwxvs4.read(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0);
                    while (iSerializer2 < i2) {
                        int iIconCompatParcelizer4 = j.IconCompatParcelizer(bArr, iSerializer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        if (i3 != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                            return iSerializer2;
                        }
                        iSerializer2 = j.serializer(bArr, iIconCompatParcelizer4, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        r8lambdad9d8zanadasmqv1rdea0gwxvs4.read(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0);
                    }
                    return iSerializer2;
                }
                return iIconCompatParcelizer;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iIconCompatParcelizer5 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        int i13 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                        if (i13 < 0) {
                            throw InvalidProtocolBufferException.serializer();
                        }
                        if (i13 == 0) {
                            onsuccess.add("");
                        } else {
                            onsuccess.add(new String(bArr, iIconCompatParcelizer5, i13, isFromOfflineStorage.read));
                            iIconCompatParcelizer5 += i13;
                        }
                        while (iIconCompatParcelizer5 < i2) {
                            int iIconCompatParcelizer6 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer5, r8lambdacyuxafptvn7drfel1dgtevxcy);
                            if (i3 != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                                return iIconCompatParcelizer5;
                            }
                            iIconCompatParcelizer5 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer6, r8lambdacyuxafptvn7drfel1dgtevxcy);
                            int i14 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                            if (i14 < 0) {
                                throw InvalidProtocolBufferException.serializer();
                            }
                            if (i14 == 0) {
                                onsuccess.add("");
                            } else {
                                onsuccess.add(new String(bArr, iIconCompatParcelizer5, i14, isFromOfflineStorage.read));
                                iIconCompatParcelizer5 += i14;
                            }
                        }
                        return iIconCompatParcelizer5;
                    }
                    int iIconCompatParcelizer7 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    int i15 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                    if (i15 < 0) {
                        throw InvalidProtocolBufferException.serializer();
                    }
                    if (i15 == 0) {
                        onsuccess.add("");
                    } else {
                        int i16 = iIconCompatParcelizer7 + i15;
                        if (getErrorReason.read.serializer(bArr, iIconCompatParcelizer7, i16)) {
                            onsuccess.add(new String(bArr, iIconCompatParcelizer7, i15, isFromOfflineStorage.read));
                            iIconCompatParcelizer7 = i16;
                        } else {
                            throw InvalidProtocolBufferException.read();
                        }
                    }
                    while (iIconCompatParcelizer7 < i2) {
                        int iIconCompatParcelizer8 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer7, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        if (i3 != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                            return iIconCompatParcelizer7;
                        }
                        iIconCompatParcelizer7 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer8, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        int i17 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                        if (i17 < 0) {
                            throw InvalidProtocolBufferException.serializer();
                        }
                        if (i17 == 0) {
                            onsuccess.add("");
                        } else {
                            int i18 = iIconCompatParcelizer7 + i17;
                            if (getErrorReason.read.serializer(bArr, iIconCompatParcelizer7, i18)) {
                                onsuccess.add(new String(bArr, iIconCompatParcelizer7, i17, isFromOfflineStorage.read));
                                iIconCompatParcelizer7 = i18;
                            } else {
                                throw InvalidProtocolBufferException.read();
                            }
                        }
                    }
                    return iIconCompatParcelizer7;
                }
                return iIconCompatParcelizer;
            case 27:
                if (i5 == 2) {
                    return j.serializer(read(i6), i3, bArr, i, i2, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                return iIconCompatParcelizer;
            case 28:
                if (i5 == 2) {
                    int iIconCompatParcelizer9 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    int i19 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                    if (i19 >= 0) {
                        if (i19 > bArr.length - iIconCompatParcelizer9) {
                            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                        }
                        if (i19 == 0) {
                            onsuccess.add(ByteString.RemoteActionCompatParcelizer);
                        } else {
                            onsuccess.add(ByteString.write(bArr, iIconCompatParcelizer9, i19));
                            iIconCompatParcelizer9 += i19;
                        }
                        while (iIconCompatParcelizer9 < i2) {
                            int iIconCompatParcelizer10 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer9, r8lambdacyuxafptvn7drfel1dgtevxcy);
                            if (i3 != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                                return iIconCompatParcelizer9;
                            }
                            iIconCompatParcelizer9 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer10, r8lambdacyuxafptvn7drfel1dgtevxcy);
                            int i20 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                            if (i20 >= 0) {
                                if (i20 > bArr.length - iIconCompatParcelizer9) {
                                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                                }
                                if (i20 == 0) {
                                    onsuccess.add(ByteString.RemoteActionCompatParcelizer);
                                } else {
                                    onsuccess.add(ByteString.write(bArr, iIconCompatParcelizer9, i20));
                                    iIconCompatParcelizer9 += i20;
                                }
                            } else {
                                throw InvalidProtocolBufferException.serializer();
                            }
                        }
                        return iIconCompatParcelizer9;
                    }
                    throw InvalidProtocolBufferException.serializer();
                }
                return iIconCompatParcelizer;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iWrite = j.write(i3, bArr, i, i2, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    }
                    return iIconCompatParcelizer;
                }
                iWrite = j.RatingCompat(bArr, iIconCompatParcelizer, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                GeofenceTransitionType.serializer(obj, i4, onsuccess, RemoteActionCompatParcelizer(i6), null, this.MediaDescriptionCompat);
                return iWrite;
            case 33:
            case 47:
                if (i5 == 2) {
                    return j.MediaSessionCompatQueueItem(bArr, iIconCompatParcelizer, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 0) {
                    getUnviewedCardCount getunviewedcardcount2 = (getUnviewedCardCount) onsuccess;
                    int iIconCompatParcelizer11 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    getunviewedcardcount2.IconCompatParcelizer(u.serializer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
                    while (iIconCompatParcelizer11 < i2) {
                        int iIconCompatParcelizer12 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer11, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        if (i3 != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                            return iIconCompatParcelizer11;
                        }
                        iIconCompatParcelizer11 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer12, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        getunviewedcardcount2.IconCompatParcelizer(u.serializer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
                    }
                    return iIconCompatParcelizer11;
                }
                return iIconCompatParcelizer;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                if (i5 == 2) {
                    return j.MediaMetadataCompat(bArr, iIconCompatParcelizer, onsuccess, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                if (i5 == 0) {
                    r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb3 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) onsuccess;
                    int iSerializer3 = j.serializer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    r8lambdawenh2zfjpauxgrrcztm8m6cjb3.RemoteActionCompatParcelizer(u.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
                    while (iSerializer3 < i2) {
                        int iIconCompatParcelizer13 = j.IconCompatParcelizer(bArr, iSerializer3, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        if (i3 != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                            return iSerializer3;
                        }
                        iSerializer3 = j.serializer(bArr, iIconCompatParcelizer13, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        r8lambdawenh2zfjpauxgrrcztm8m6cjb3.RemoteActionCompatParcelizer(u.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
                    }
                    return iSerializer3;
                }
                return iIconCompatParcelizer;
            case 49:
                if (i5 == 3) {
                    fromStringlambda1 fromstringlambda1 = read(i6);
                    int i21 = (i3 & (-8)) | 4;
                    GeneratedMessageLite generatedMessageLiteSerializer = fromstringlambda1.serializer();
                    int i22 = j.read(generatedMessageLiteSerializer, fromstringlambda1, bArr, i, i2, i21, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    fromstringlambda1.IconCompatParcelizer((Object) generatedMessageLiteSerializer);
                    r8lambdacyuxafptvn7drfel1dgtevxcy.read = generatedMessageLiteSerializer;
                    onsuccess.add(generatedMessageLiteSerializer);
                    while (i22 < i2) {
                        int iIconCompatParcelizer14 = j.IconCompatParcelizer(bArr, i22, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        if (i3 != r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer) {
                            return i22;
                        }
                        GeneratedMessageLite generatedMessageLiteSerializer2 = fromstringlambda1.serializer();
                        int i23 = j.read(generatedMessageLiteSerializer2, fromstringlambda1, bArr, iIconCompatParcelizer14, i2, i21, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        fromstringlambda1.IconCompatParcelizer((Object) generatedMessageLiteSerializer2);
                        r8lambdacyuxafptvn7drfel1dgtevxcy.read = generatedMessageLiteSerializer2;
                        onsuccess.add(generatedMessageLiteSerializer2);
                        i22 = i23;
                    }
                    return i22;
                }
                return iIconCompatParcelizer;
            default:
                return iIconCompatParcelizer;
        }
    }

    public final int serializer(Object obj, byte[] bArr, int i, int i2, int i3, long j, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        Unsafe unsafe = IconCompatParcelizer;
        Object objIconCompatParcelizer = IconCompatParcelizer(i3);
        Object object = unsafe.getObject(obj, j);
        this.MediaSessionCompatQueueItem.getClass();
        if (!((MapFieldLite) object).write()) {
            MapFieldLite mapFieldLiteIconCompatParcelizer = MapFieldLite.serializer.IconCompatParcelizer();
            n0.RemoteActionCompatParcelizer(mapFieldLiteIconCompatParcelizer, object);
            unsafe.putObject(obj, j, mapFieldLiteIconCompatParcelizer);
            object = mapFieldLiteIconCompatParcelizer;
        }
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = ((r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA) objIconCompatParcelizer).IconCompatParcelizer;
        MapFieldLite mapFieldLite = (MapFieldLite) object;
        int iIconCompatParcelizer = j.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
        int i4 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
        if (i4 >= 0 && i4 <= i2 - iIconCompatParcelizer) {
            int i5 = iIconCompatParcelizer + i4;
            Object obj2 = r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
            Object obj3 = "";
            Object obj4 = obj2;
            while (iIconCompatParcelizer < i5) {
                int iSerializer = iIconCompatParcelizer + 1;
                int i6 = bArr[iIconCompatParcelizer];
                if (i6 < 0) {
                    iSerializer = j.serializer(i6, bArr, iSerializer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    i6 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                }
                int i7 = i6 >>> 3;
                int i8 = i6 & 7;
                if (i7 != 1) {
                    if (i7 == 2 && i8 == ((WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.write).getWireType()) {
                        iIconCompatParcelizer = serializer(bArr, iSerializer, i2, (WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.write, obj2.getClass(), r8lambdacyuxafptvn7drfel1dgtevxcy);
                        obj4 = r8lambdacyuxafptvn7drfel1dgtevxcy.read;
                    } else {
                        iIconCompatParcelizer = j.RemoteActionCompatParcelizer(i6, bArr, iSerializer, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    }
                } else if (i8 == ((WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer).getWireType()) {
                    iIconCompatParcelizer = serializer(bArr, iSerializer, i2, (WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer, null, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    obj3 = r8lambdacyuxafptvn7drfel1dgtevxcy.read;
                } else {
                    iIconCompatParcelizer = j.RemoteActionCompatParcelizer(i6, bArr, iSerializer, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
            }
            if (iIconCompatParcelizer == i5) {
                mapFieldLite.put(obj3, obj4);
                return i5;
            }
            throw InvalidProtocolBufferException.RatingCompat();
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int write(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        Unsafe unsafe = IconCompatParcelizer;
        long j2 = this.MediaMetadataCompat[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(j.write(i, bArr))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                return i;
            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(j.serializer(i, bArr))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    int iSerializer = j.serializer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, Long.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer));
                    unsafe.putInt(obj, j2, i4);
                    return iSerializer;
                }
                return i;
            case 55:
            case RectListKt.BitOffsetForGesturable /* 62 */:
                if (i5 == 0) {
                    int iIconCompatParcelizer = j.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, Integer.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer));
                    unsafe.putInt(obj, j2, i4);
                    return iIconCompatParcelizer;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(j.write(i, bArr)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(j.serializer(i, bArr)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    int iSerializer2 = j.serializer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, Boolean.valueOf(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iSerializer2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int iIconCompatParcelizer2 = j.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    int i9 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !getErrorReason.read.serializer(bArr, iIconCompatParcelizer2, iIconCompatParcelizer2 + i9)) {
                            throw InvalidProtocolBufferException.read();
                        }
                        unsafe.putObject(obj, j, new String(bArr, iIconCompatParcelizer2, i9, isFromOfflineStorage.read));
                        iIconCompatParcelizer2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iIconCompatParcelizer2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i4, i8, obj);
                    int i10 = j.read(objRemoteActionCompatParcelizer, read(i8), bArr, i, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    IconCompatParcelizer(i4, i8, obj, objRemoteActionCompatParcelizer);
                    return i10;
                }
                return i;
            case RectListKt.BitOffsetForFocusable /* 61 */:
                if (i5 == 2) {
                    int iWrite = j.write(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, r8lambdacyuxafptvn7drfel1dgtevxcy.read);
                    unsafe.putInt(obj, j2, i4);
                    return iWrite;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int iIconCompatParcelizer3 = j.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    int i11 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                    FeatureFlagsUpdatedEventCompanion featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i8);
                    if (featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer != null && !featureFlagsUpdatedEventCompanionRemoteActionCompatParcelizer.write(i11)) {
                        read(obj).write(i3, Long.valueOf(i11));
                        return iIconCompatParcelizer3;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i11));
                    unsafe.putInt(obj, j2, i4);
                    return iIconCompatParcelizer3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    int iIconCompatParcelizer4 = j.IconCompatParcelizer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, Integer.valueOf(u.serializer(r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer)));
                    unsafe.putInt(obj, j2, i4);
                    return iIconCompatParcelizer4;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    int iSerializer3 = j.serializer(bArr, i, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    unsafe.putObject(obj, j, Long.valueOf(u.IconCompatParcelizer(r8lambdacyuxafptvn7drfel1dgtevxcy.serializer)));
                    unsafe.putInt(obj, j2, i4);
                    return iSerializer3;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    Object objRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i4, i8, obj);
                    int i12 = j.read(objRemoteActionCompatParcelizer2, read(i8), bArr, i, i2, (i3 & (-8)) | 4, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    IconCompatParcelizer(i4, i8, obj, objRemoteActionCompatParcelizer2);
                    return i12;
                }
                return i;
            default:
                return i;
        }
    }

    public final FeatureFlagsUpdatedEventCompanion RemoteActionCompatParcelizer(int i) {
        return (FeatureFlagsUpdatedEventCompanion) this.MediaSessionCompatToken[ff$$ExternalSyntheticOutline0.m(i, 3, 2, 1)];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21861. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int IconCompatParcelizer(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r40) {
        /*
            Method dump skipped, instruction units count: 2186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.protobuf.u0.IconCompatParcelizer(java.lang.Object, byte[], int, int, int, o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY):int");
    }

    public final void read(Object obj, int i, Object obj2) {
        IconCompatParcelizer.putObject(obj, MediaBrowserCompatMediaItem(i) & 1048575, obj2);
        IconCompatParcelizer(i, obj);
    }

    public final void IconCompatParcelizer(int i, int i2, Object obj, Object obj2) {
        IconCompatParcelizer.putObject(obj, MediaBrowserCompatMediaItem(i2) & 1048575, obj2);
        IconCompatParcelizer(i, i2, obj);
    }

    @Override // o.fromStringlambda1
    public final void RemoteActionCompatParcelizer(Object obj, byte[] bArr, int i, int i2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) {
        IconCompatParcelizer(obj, bArr, i, i2, 0, r8lambdacyuxafptvn7drfel1dgtevxcy);
    }

    public final void read(Object obj, int i, Object obj2, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, v vVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i) & 1048575;
        Object objMediaMetadataCompat = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(jMediaBrowserCompatMediaItem, obj);
        n0 n0Var = this.MediaSessionCompatQueueItem;
        if (objMediaMetadataCompat == null) {
            n0Var.getClass();
            objMediaMetadataCompat = MapFieldLite.serializer.IconCompatParcelizer();
            SimpleValueCallback.serializer(jMediaBrowserCompatMediaItem, obj, objMediaMetadataCompat);
        } else {
            n0Var.getClass();
            if (!((MapFieldLite) objMediaMetadataCompat).write()) {
                MapFieldLite mapFieldLiteIconCompatParcelizer = MapFieldLite.serializer.IconCompatParcelizer();
                n0.RemoteActionCompatParcelizer(mapFieldLiteIconCompatParcelizer, objMediaMetadataCompat);
                SimpleValueCallback.serializer(jMediaBrowserCompatMediaItem, obj, mapFieldLiteIconCompatParcelizer);
                objMediaMetadataCompat = mapFieldLiteIconCompatParcelizer;
            }
        }
        n0Var.getClass();
        MapFieldLite mapFieldLite = (MapFieldLite) objMediaMetadataCompat;
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = ((r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA) obj2).IconCompatParcelizer;
        vVar.write(2);
        u uVar = vVar.read;
        int iIconCompatParcelizer = uVar.IconCompatParcelizer(uVar.serializer());
        Object obj3 = r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
        Object objRemoteActionCompatParcelizer = "";
        Object objRemoteActionCompatParcelizer2 = obj3;
        while (true) {
            try {
                int i2 = vVar.read();
                if (i2 == Integer.MAX_VALUE || uVar.ParcelableVolumeInfo()) {
                    break;
                }
                if (i2 == 1) {
                    objRemoteActionCompatParcelizer = vVar.RemoteActionCompatParcelizer((WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer, null, null);
                } else if (i2 != 2) {
                    try {
                        if (!vVar.RemoteActionCompatParcelizer()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!vVar.RemoteActionCompatParcelizer()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objRemoteActionCompatParcelizer2 = vVar.RemoteActionCompatParcelizer((WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.write, obj3.getClass(), delayedInitializationAnalyticsBehavior);
                }
            } catch (Throwable th) {
                uVar.write(iIconCompatParcelizer);
                throw th;
            }
        }
        mapFieldLite.put(objRemoteActionCompatParcelizer, objRemoteActionCompatParcelizer2);
        uVar.write(iIconCompatParcelizer);
    }

    @Override // o.fromStringlambda1
    public final boolean serializer(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.RemoteActionCompatParcelizer) {
            int i6 = this.ComponentActivity[i5];
            int[] iArr = this.MediaMetadataCompat;
            int i7 = iArr[i6];
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = IconCompatParcelizer.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & iMediaBrowserCompatMediaItem) == 0 || read(obj, i6, i, i2, i10)) {
                int iWrite = write(iMediaBrowserCompatMediaItem);
                if (iWrite != 9 && iWrite != 17) {
                    if (iWrite != 27) {
                        if (iWrite == 60 || iWrite == 68) {
                            if (read(i7, i6, obj)) {
                                if (!read(i6).serializer(SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iWrite != 49) {
                            if (iWrite != 50) {
                                continue;
                            } else {
                                Object objMediaMetadataCompat = SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj);
                                this.MediaSessionCompatQueueItem.getClass();
                                MapFieldLite mapFieldLite = (MapFieldLite) objMediaMetadataCompat;
                                if (!mapFieldLite.isEmpty() && ((WireFormat$FieldType) ((r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA) IconCompatParcelizer(i6)).IconCompatParcelizer.write).getJavaType() == WireFormat$JavaType.MESSAGE) {
                                    fromStringlambda1 fromstringlambda1 = null;
                                    for (Object obj2 : mapFieldLite.values()) {
                                        if (fromstringlambda1 == null) {
                                            fromstringlambda1 = BrazeViewBounds.read.read(obj2.getClass());
                                        }
                                        if (!fromstringlambda1.serializer(obj2)) {
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        fromStringlambda1 fromstringlambda2 = read(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (fromstringlambda2.serializer(list.get(i11))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (read(obj, i6, i, i2, i10)) {
                        if (!read(i6).serializer(SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(iMediaBrowserCompatMediaItem & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        if (this.MediaSessionCompatResultReceiverWrapper) {
            this.MediaBrowserCompatMediaItem.getClass();
            if (!((GeneratedMessageLite.ExtendableMessage) obj).extensions.serializer()) {
                return false;
            }
        }
        return true;
    }

    public static void read(int i, Object obj, accessisOfflinep accessisofflinep) {
        if (obj instanceof String) {
            ((setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer).IconCompatParcelizer(i, (String) obj);
        } else {
            accessisofflinep.RemoteActionCompatParcelizer(i, (ByteString) obj);
        }
    }

    public final void read(int i, v vVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        u uVar = vVar.read;
        if ((536870912 & i) != 0) {
            vVar.write(2);
            SimpleValueCallback.serializer(i & 1048575, obj, uVar.write());
        } else if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            vVar.write(2);
            SimpleValueCallback.serializer(i & 1048575, obj, uVar.RemoteActionCompatParcelizer());
        } else {
            SimpleValueCallback.serializer(i & 1048575, obj, vVar.serializer());
        }
    }

    public final void RemoteActionCompatParcelizer(Object obj, int i, v vVar, fromStringlambda1 fromstringlambda1, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        int i2;
        List listWrite = this.RatingCompat.write(i & 1048575, obj);
        u uVar = vVar.read;
        int i3 = vVar.serializer;
        if ((i3 & 7) == 2) {
            do {
                GeneratedMessageLite generatedMessageLiteSerializer = fromstringlambda1.serializer();
                vVar.read(generatedMessageLiteSerializer, fromstringlambda1, delayedInitializationAnalyticsBehavior);
                fromstringlambda1.IconCompatParcelizer((Object) generatedMessageLiteSerializer);
                listWrite.add(generatedMessageLiteSerializer);
                if (uVar.ParcelableVolumeInfo() || vVar.IconCompatParcelizer != 0) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == i3);
            vVar.IconCompatParcelizer = i2;
            return;
        }
        throw InvalidProtocolBufferException.IconCompatParcelizer();
    }

    public final void serializer(Object obj, long j, v vVar, fromStringlambda1 fromstringlambda1, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i;
        List listWrite = this.RatingCompat.write(j, obj);
        u uVar = vVar.read;
        int i2 = vVar.serializer;
        if ((i2 & 7) == 3) {
            do {
                GeneratedMessageLite generatedMessageLiteSerializer = fromstringlambda1.serializer();
                vVar.serializer(generatedMessageLiteSerializer, fromstringlambda1, delayedInitializationAnalyticsBehavior);
                fromstringlambda1.IconCompatParcelizer((Object) generatedMessageLiteSerializer);
                listWrite.add(generatedMessageLiteSerializer);
                if (uVar.ParcelableVolumeInfo() || vVar.IconCompatParcelizer != 0) {
                    return;
                } else {
                    i = uVar.read();
                }
            } while (i == i2);
            vVar.IconCompatParcelizer = i;
            return;
        }
        throw InvalidProtocolBufferException.IconCompatParcelizer();
    }

    public final boolean RemoteActionCompatParcelizer(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return serializer(i, generatedMessageLite) == serializer(i, generatedMessageLite2);
    }

    public final boolean read(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return serializer(i, obj);
        }
        return (i3 & i4) != 0;
    }
}
