package o;

import com.google.firebase.perf.config.DeviceCacheManager;
import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetAddChangeCallbackMethodcp {
    public static volatile accesssetAddChangeCallbackMethodcp IconCompatParcelizer;
    public static final getWindowInfoannotations RemoteActionCompatParcelizer = getWindowInfoannotations.write();
    public final RemoteConfigManager serializer = RemoteConfigManager.getInstance();
    public scheduleMeasureAndLayout write = new scheduleMeasureAndLayout();
    public final DeviceCacheManager read = DeviceCacheManager.read();

    public static boolean RemoteActionCompatParcelizer(long j) {
        return j >= 0;
    }

    public static boolean read(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    public static boolean read(long j) {
        return j >= 0;
    }

    public static accesssetAddChangeCallbackMethodcp RemoteActionCompatParcelizer() {
        accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp;
        synchronized (accesssetAddChangeCallbackMethodcp.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new accesssetAddChangeCallbackMethodcp();
            }
            accesssetaddchangecallbackmethodcp = IconCompatParcelizer;
        }
        return accesssetaddchangecallbackmethodcp;
    }

    public final long IconCompatParcelizer() {
        clearChildInvalidObservations clearchildinvalidobservations;
        synchronized (clearChildInvalidObservations.class) {
            if (clearChildInvalidObservations.IconCompatParcelizer == null) {
                clearChildInvalidObservations.IconCompatParcelizer = new clearChildInvalidObservations();
            }
            clearchildinvalidobservations = clearChildInvalidObservations.IconCompatParcelizer;
        }
        RemoteConfigManager remoteConfigManager = this.serializer;
        clearchildinvalidobservations.getClass();
        sendMotionEvent8iAsVTc sendmotionevent8iasvtc = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (sendmotionevent8iasvtc.serializer() && ((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue() > 0) {
            this.read.write(((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).longValue();
        }
        sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite = write(clearchildinvalidobservations);
        if (!sendmotionevent8iasvtcWrite.serializer() || ((Long) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) sendmotionevent8iasvtcWrite.RemoteActionCompatParcelizer()).longValue();
    }

    public final sendMotionEvent8iAsVTc IconCompatParcelizer(r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw r8lambda7ajnrvtmynn7ksbgxueytb0niyw) {
        DeviceCacheManager deviceCacheManager = this.read;
        String strRemoteActionCompatParcelizer = r8lambda7ajnrvtmynn7ksbgxueytb0niyw.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            deviceCacheManager.getClass();
            DeviceCacheManager.write.read();
            return new sendMotionEvent8iAsVTc();
        }
        if (deviceCacheManager.RemoteActionCompatParcelizer == null) {
            deviceCacheManager.IconCompatParcelizer(DeviceCacheManager.serializer());
            if (deviceCacheManager.RemoteActionCompatParcelizer == null) {
                return new sendMotionEvent8iAsVTc();
            }
        }
        if (!deviceCacheManager.RemoteActionCompatParcelizer.contains(strRemoteActionCompatParcelizer)) {
            return new sendMotionEvent8iAsVTc();
        }
        try {
            return new sendMotionEvent8iAsVTc(Boolean.valueOf(deviceCacheManager.RemoteActionCompatParcelizer.getBoolean(strRemoteActionCompatParcelizer, false)));
        } catch (ClassCastException e) {
            DeviceCacheManager.write.RemoteActionCompatParcelizer("Key %s from sharedPreferences has type other than long: %s", strRemoteActionCompatParcelizer, e.getMessage());
            return new sendMotionEvent8iAsVTc();
        }
    }

    public final sendMotionEvent8iAsVTc MediaMetadataCompat(r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw r8lambda7ajnrvtmynn7ksbgxueytb0niyw) {
        scheduleMeasureAndLayout schedulemeasureandlayout = this.write;
        String strSerializer = r8lambda7ajnrvtmynn7ksbgxueytb0niyw.serializer();
        if (strSerializer == null) {
            schedulemeasureandlayout.getClass();
        } else if (schedulemeasureandlayout.serializer.containsKey(strSerializer)) {
            Object obj = schedulemeasureandlayout.serializer.get(strSerializer);
            if (obj == null) {
                return new sendMotionEvent8iAsVTc();
            }
            if (obj instanceof Float) {
                return new sendMotionEvent8iAsVTc(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return new sendMotionEvent8iAsVTc((Double) obj);
            }
            scheduleMeasureAndLayout.IconCompatParcelizer.RemoteActionCompatParcelizer("Metadata key %s contains type other than double: %s", strSerializer);
            return new sendMotionEvent8iAsVTc();
        }
        return new sendMotionEvent8iAsVTc();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    public final sendMotionEvent8iAsVTc MediaSessionCompatQueueItem(r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw r8lambda7ajnrvtmynn7ksbgxueytb0niyw) {
        sendMotionEvent8iAsVTc sendmotionevent8iasvtc;
        scheduleMeasureAndLayout schedulemeasureandlayout = this.write;
        String strSerializer = r8lambda7ajnrvtmynn7ksbgxueytb0niyw.serializer();
        if (strSerializer != null) {
            if (schedulemeasureandlayout.serializer.containsKey(strSerializer)) {
                try {
                    Integer num = (Integer) schedulemeasureandlayout.serializer.get(strSerializer);
                    sendmotionevent8iasvtc = num == null ? new sendMotionEvent8iAsVTc() : new sendMotionEvent8iAsVTc(num);
                } catch (ClassCastException e) {
                    scheduleMeasureAndLayout.IconCompatParcelizer.RemoteActionCompatParcelizer("Metadata key %s contains type other than int: %s", strSerializer, e.getMessage());
                    sendmotionevent8iasvtc = new sendMotionEvent8iAsVTc();
                }
            }
            return sendmotionevent8iasvtc.serializer() ? new sendMotionEvent8iAsVTc(Long.valueOf(((Integer) sendmotionevent8iasvtc.RemoteActionCompatParcelizer()).intValue())) : new sendMotionEvent8iAsVTc();
        }
        schedulemeasureandlayout.getClass();
        sendmotionevent8iasvtc = new sendMotionEvent8iAsVTc();
        if (sendmotionevent8iasvtc.serializer()) {
        }
    }

    public final sendMotionEvent8iAsVTc RemoteActionCompatParcelizer(r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw r8lambda7ajnrvtmynn7ksbgxueytb0niyw) {
        DeviceCacheManager deviceCacheManager = this.read;
        String strRemoteActionCompatParcelizer = r8lambda7ajnrvtmynn7ksbgxueytb0niyw.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            deviceCacheManager.getClass();
            DeviceCacheManager.write.read();
            return new sendMotionEvent8iAsVTc();
        }
        if (deviceCacheManager.RemoteActionCompatParcelizer == null) {
            deviceCacheManager.IconCompatParcelizer(DeviceCacheManager.serializer());
            if (deviceCacheManager.RemoteActionCompatParcelizer == null) {
                return new sendMotionEvent8iAsVTc();
            }
        }
        if (!deviceCacheManager.RemoteActionCompatParcelizer.contains(strRemoteActionCompatParcelizer)) {
            return new sendMotionEvent8iAsVTc();
        }
        try {
            return new sendMotionEvent8iAsVTc(deviceCacheManager.RemoteActionCompatParcelizer.getString(strRemoteActionCompatParcelizer, ""));
        } catch (ClassCastException e) {
            DeviceCacheManager.write.RemoteActionCompatParcelizer("Key %s from sharedPreferences has type other than String: %s", strRemoteActionCompatParcelizer, e.getMessage());
            return new sendMotionEvent8iAsVTc();
        }
    }

    public final sendMotionEvent8iAsVTc read(r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw r8lambda7ajnrvtmynn7ksbgxueytb0niyw) {
        DeviceCacheManager deviceCacheManager = this.read;
        String strRemoteActionCompatParcelizer = r8lambda7ajnrvtmynn7ksbgxueytb0niyw.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            deviceCacheManager.getClass();
            DeviceCacheManager.write.read();
            return new sendMotionEvent8iAsVTc();
        }
        if (deviceCacheManager.RemoteActionCompatParcelizer == null) {
            deviceCacheManager.IconCompatParcelizer(DeviceCacheManager.serializer());
            if (deviceCacheManager.RemoteActionCompatParcelizer == null) {
                return new sendMotionEvent8iAsVTc();
            }
        }
        if (!deviceCacheManager.RemoteActionCompatParcelizer.contains(strRemoteActionCompatParcelizer)) {
            return new sendMotionEvent8iAsVTc();
        }
        try {
            try {
                return new sendMotionEvent8iAsVTc(Double.valueOf(Double.longBitsToDouble(deviceCacheManager.RemoteActionCompatParcelizer.getLong(strRemoteActionCompatParcelizer, 0L))));
            } catch (ClassCastException e) {
                DeviceCacheManager.write.RemoteActionCompatParcelizer("Key %s from sharedPreferences has type other than double: %s", strRemoteActionCompatParcelizer, e.getMessage());
                return new sendMotionEvent8iAsVTc();
            }
        } catch (ClassCastException unused) {
            return new sendMotionEvent8iAsVTc(Double.valueOf(Float.valueOf(deviceCacheManager.RemoteActionCompatParcelizer.getFloat(strRemoteActionCompatParcelizer, 0.0f)).doubleValue()));
        }
    }

    public final Boolean serializer() {
        accesssendSimulatedEvent accesssendsimulatedevent;
        accessisAttached accessisattached;
        synchronized (accesssendSimulatedEvent.class) {
            if (accesssendSimulatedEvent.read == null) {
                accesssendSimulatedEvent.read = new accesssendSimulatedEvent();
            }
            accesssendsimulatedevent = accesssendSimulatedEvent.read;
        }
        sendMotionEvent8iAsVTc sendmotionevent8iasvtcSerializer = serializer(accesssendsimulatedevent);
        if ((sendmotionevent8iasvtcSerializer.serializer() ? (Boolean) sendmotionevent8iasvtcSerializer.RemoteActionCompatParcelizer() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (accessisAttached.class) {
            if (accessisAttached.RemoteActionCompatParcelizer == null) {
                accessisAttached.RemoteActionCompatParcelizer = new accessisAttached();
            }
            accessisattached = accessisAttached.RemoteActionCompatParcelizer;
        }
        sendMotionEvent8iAsVTc sendmotionevent8iasvtcIconCompatParcelizer = IconCompatParcelizer(accessisattached);
        if (sendmotionevent8iasvtcIconCompatParcelizer.serializer()) {
            return (Boolean) sendmotionevent8iasvtcIconCompatParcelizer.RemoteActionCompatParcelizer();
        }
        sendMotionEvent8iAsVTc sendmotionevent8iasvtcSerializer2 = serializer(accessisattached);
        if (sendmotionevent8iasvtcSerializer2.serializer()) {
            return (Boolean) sendmotionevent8iasvtcSerializer2.RemoteActionCompatParcelizer();
        }
        return null;
    }

    public final sendMotionEvent8iAsVTc serializer(r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw r8lambda7ajnrvtmynn7ksbgxueytb0niyw) {
        scheduleMeasureAndLayout schedulemeasureandlayout = this.write;
        String strSerializer = r8lambda7ajnrvtmynn7ksbgxueytb0niyw.serializer();
        if (strSerializer == null) {
            schedulemeasureandlayout.getClass();
        } else if (schedulemeasureandlayout.serializer.containsKey(strSerializer)) {
            try {
                Boolean bool = (Boolean) schedulemeasureandlayout.serializer.get(strSerializer);
                return bool == null ? new sendMotionEvent8iAsVTc() : new sendMotionEvent8iAsVTc(bool);
            } catch (ClassCastException e) {
                scheduleMeasureAndLayout.IconCompatParcelizer.RemoteActionCompatParcelizer("Metadata key %s contains type other than boolean: %s", strSerializer, e.getMessage());
                return new sendMotionEvent8iAsVTc();
            }
        }
        return new sendMotionEvent8iAsVTc();
    }

    public final sendMotionEvent8iAsVTc write(r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw r8lambda7ajnrvtmynn7ksbgxueytb0niyw) {
        DeviceCacheManager deviceCacheManager = this.read;
        String strRemoteActionCompatParcelizer = r8lambda7ajnrvtmynn7ksbgxueytb0niyw.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            deviceCacheManager.getClass();
            DeviceCacheManager.write.read();
            return new sendMotionEvent8iAsVTc();
        }
        if (deviceCacheManager.RemoteActionCompatParcelizer == null) {
            deviceCacheManager.IconCompatParcelizer(DeviceCacheManager.serializer());
            if (deviceCacheManager.RemoteActionCompatParcelizer == null) {
                return new sendMotionEvent8iAsVTc();
            }
        }
        if (!deviceCacheManager.RemoteActionCompatParcelizer.contains(strRemoteActionCompatParcelizer)) {
            return new sendMotionEvent8iAsVTc();
        }
        try {
            return new sendMotionEvent8iAsVTc(Long.valueOf(deviceCacheManager.RemoteActionCompatParcelizer.getLong(strRemoteActionCompatParcelizer, 0L)));
        } catch (ClassCastException e) {
            DeviceCacheManager.write.RemoteActionCompatParcelizer("Key %s from sharedPreferences has type other than long: %s", strRemoteActionCompatParcelizer, e.getMessage());
            return new sendMotionEvent8iAsVTc();
        }
    }

    public static boolean write(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("22.0.4")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[Catch: all -> 0x00d1, TryCatch #0 {, blocks: (B:30:0x0071, B:32:0x0075, B:33:0x007c), top: B:57:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public final boolean read() {
        addExtraDataToAccessibilityNodeInfoHelper addextradatatoaccessibilitynodeinfohelper;
        boolean zBooleanValue;
        sendMotionEvent8iAsVTc sendmotionevent8iasvtcRemoteActionCompatParcelizer;
        sendMotionEvent8iAsVTc string;
        boolean zWrite;
        String str;
        Boolean boolSerializer = serializer();
        if (boolSerializer != null && !boolSerializer.booleanValue()) {
            return false;
        }
        synchronized (addExtraDataToAccessibilityNodeInfoHelper.class) {
            if (addExtraDataToAccessibilityNodeInfoHelper.write == null) {
                addExtraDataToAccessibilityNodeInfoHelper.write = new addExtraDataToAccessibilityNodeInfoHelper();
            }
            addextradatatoaccessibilitynodeinfohelper = addExtraDataToAccessibilityNodeInfoHelper.write;
        }
        sendMotionEvent8iAsVTc sendmotionevent8iasvtcIconCompatParcelizer = IconCompatParcelizer(addextradatatoaccessibilitynodeinfohelper);
        sendMotionEvent8iAsVTc sendmotionevent8iasvtc = this.serializer.getBoolean("fpr_enabled");
        if (!sendmotionevent8iasvtc.serializer()) {
            if (sendmotionevent8iasvtcIconCompatParcelizer.serializer()) {
                zBooleanValue = ((Boolean) sendmotionevent8iasvtcIconCompatParcelizer.RemoteActionCompatParcelizer()).booleanValue();
            }
            synchronized (autofillSupported.class) {
                if (autofillSupported.read == null) {
                    autofillSupported.read = new autofillSupported();
                }
                autofillSupported autofillsupported = autofillSupported.read;
            }
            sendmotionevent8iasvtcRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(autofillsupported);
            string = this.serializer.getString("fpr_disabled_android_versions");
            if (string.serializer()) {
                str = (String) string.RemoteActionCompatParcelizer();
                if (sendmotionevent8iasvtcRemoteActionCompatParcelizer.serializer() || !((String) sendmotionevent8iasvtcRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()).equals(str)) {
                    this.read.IconCompatParcelizer("com.google.firebase.perf.SdkDisabledVersions", str);
                }
                zWrite = write(str);
            } else if (sendmotionevent8iasvtcRemoteActionCompatParcelizer.serializer()) {
                zWrite = write((String) sendmotionevent8iasvtcRemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
            } else {
                zWrite = write("");
            }
            if (zWrite) {
                return false;
            }
            return true;
        }
        if (this.serializer.isLastFetchFailed()) {
            return false;
        }
        Boolean bool = (Boolean) sendmotionevent8iasvtc.RemoteActionCompatParcelizer();
        if (!sendmotionevent8iasvtcIconCompatParcelizer.serializer() || sendmotionevent8iasvtcIconCompatParcelizer.RemoteActionCompatParcelizer() != bool) {
            this.read.write("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
        }
        zBooleanValue = bool.booleanValue();
        if (!zBooleanValue) {
            return false;
        }
        synchronized (autofillSupported.class) {
            if (autofillSupported.read == null) {
                autofillSupported.read = new autofillSupported();
            }
            autofillSupported autofillsupported2 = autofillSupported.read;
            sendmotionevent8iasvtcRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(autofillsupported2);
            string = this.serializer.getString("fpr_disabled_android_versions");
            if (string.serializer()) {
                str = (String) string.RemoteActionCompatParcelizer();
                if (sendmotionevent8iasvtcRemoteActionCompatParcelizer.serializer()) {
                    this.read.IconCompatParcelizer("com.google.firebase.perf.SdkDisabledVersions", str);
                } else {
                    this.read.IconCompatParcelizer("com.google.firebase.perf.SdkDisabledVersions", str);
                }
                zWrite = write(str);
            } else if (sendmotionevent8iasvtcRemoteActionCompatParcelizer.serializer()) {
                zWrite = write((String) sendmotionevent8iasvtcRemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
            } else {
                zWrite = write("");
            }
            if (zWrite) {
                return true;
            }
            return false;
        }
    }
}
