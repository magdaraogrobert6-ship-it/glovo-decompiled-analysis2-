package com.mapbox.maps.renderer.egl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.os.Build;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.hms.android.SystemUtils;
import com.mapbox.maps.MapboxConstants;
import com.mapbox.maps.MapboxLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BrazeContentCardsManagerCompanion;
import o.DrawableTransformation;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardClicked;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class EGLConfigChooser {
    public static final Companion Companion = new Companion(null);
    private static int STENCIL_SIZE = 8;
    private final String TAG;
    private int antialiasingSampleCount;
    private final boolean translucentSurface;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getSTENCIL_SIZE$maps_sdk_release$annotations() {
        }

        public final int getSTENCIL_SIZE$maps_sdk_release() {
            return EGLConfigChooser.STENCIL_SIZE;
        }

        public final void setSTENCIL_SIZE$maps_sdk_release(int i) {
            EGLConfigChooser.STENCIL_SIZE = i;
        }

        public final boolean inEmulator$maps_sdk_release() {
            String str = Build.FINGERPRINT;
            str.getClass();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "generic", false) || setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, SystemUtils.UNKNOWN, false)) {
                return true;
            }
            String str2 = Build.MODEL;
            str2.getClass();
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) "google_sdk", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) "Emulator", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) "Android SDK built for x86", false)) {
                return true;
            }
            String str3 = Build.BRAND;
            str3.getClass();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str3, "generic", false)) {
                return true;
            }
            String str4 = Build.DEVICE;
            str4.getClass();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str4, "generic", false)) {
                return true;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Build.PRODUCT, "google_sdk"}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            String str5 = Build.MANUFACTURER;
            str5.getClass();
            return hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str5, (CharSequence) "Genymotion", false) || System.getProperty("ro.kernel.qemu") != null;
        }

        private Companion() {
        }
    }

    private static final Integer chooseBestMatchConfig$getConfigAttr(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLConfigChooser eGLConfigChooser, int i) {
        int[] iArr = new int[1];
        if (EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr, 0)) {
            return Integer.valueOf(iArr[0]);
        }
        MapboxLogger.logE(eGLConfigChooser.TAG, String.format(MapboxConstants.getMAPBOX_LOCALE(), "eglGetConfigAttrib(%d) returned error %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(EGL14.eglGetError())}, 2)));
        return null;
    }

    private final boolean getAntialiasingEnabled() {
        return this.antialiasingSampleCount > 1;
    }

    private final List<EGLConfig> getConfigs(EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[100];
        int i = this.antialiasingSampleCount;
        boolean z = false;
        while (true) {
            List<EGLConfig> listAsList = instance_delegatelambda0.write;
            if (z) {
                int i2 = this.antialiasingSampleCount;
                if (i != i2) {
                    MapboxLogger.logW(this.TAG, i2 == 1 ? "Found EGL configs only with MSAA disabled." : af$$ExternalSyntheticOutline0.m(new StringBuilder("Found EGL configs with MSAA enabled, EGL_SAMPLES="), this.antialiasingSampleCount, '.'));
                }
                int i3 = iArr[0];
                if (i3 < 0) {
                    DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i3, "Requested element count ", " is less than zero."));
                    return null;
                }
                if (i3 != 0) {
                    if (i3 >= 100) {
                        listAsList = onContentCardClicked.RatingCompat(eGLConfigArr);
                    } else if (i3 == 1) {
                        listAsList = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{eGLConfigArr[0]}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    } else {
                        listAsList = Arrays.asList(onContentCardClicked.write(0, i3, eGLConfigArr));
                        listAsList.getClass();
                    }
                }
                List<EGLConfig> list = listAsList;
                Iterator<EGLConfig> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        DrawableTransformation.write(list, "null element found in ");
                        return null;
                    }
                }
                return list;
            }
            if (!EGL14.eglChooseConfig(eGLDisplay, getConfigAttributes(), 0, eGLConfigArr, 0, 100, iArr, 0) || iArr[0] < 1) {
                int i4 = this.antialiasingSampleCount;
                String str = this.TAG;
                if (i4 <= 1) {
                    MapboxLogger.logE(str, "No suitable EGL configs were found, eglChooseConfig returned error " + EGL14.eglGetError() + '.');
                    return listAsList;
                }
                MapboxLogger.logW(str, "Reducing sample count in 2 times for MSAA as EGL_SAMPLES=" + this.antialiasingSampleCount + " is not supported");
                this.antialiasingSampleCount = this.antialiasingSampleCount / 2;
            } else {
                z = true;
            }
        }
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    public enum BufferFormat {
        Format32BitAlpha(0),
        Format32BitNoAlpha(1),
        Format24Bit(2),
        Format16Bit(3),
        Unknown(4);

        private int value;

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        BufferFormat(int i) {
            this.value = i;
        }
    }

    public enum DepthStencilFormat {
        Format24Depth8Stencil(0),
        Format16Depth8Stencil(1);

        private int value;

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        DepthStencilFormat(int i) {
            this.value = i;
        }
    }

    public static final class Config implements Comparable<Config> {
        private final BufferFormat bufferFormat;
        private final EGLConfig config;
        private final DepthStencilFormat depthStencilFormat;
        private final int index;
        private final boolean isCaveat;
        private final boolean isNotConformant;
        private final int samples;

        public final BufferFormat getBufferFormat() {
            return this.bufferFormat;
        }

        public final EGLConfig getConfig() {
            return this.config;
        }

        public final DepthStencilFormat getDepthStencilFormat() {
            return this.depthStencilFormat;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getSamples() {
            return this.samples;
        }

        public final boolean isCaveat() {
            return this.isCaveat;
        }

        public final boolean isNotConformant() {
            return this.isNotConformant;
        }

        public Config(BufferFormat bufferFormat, DepthStencilFormat depthStencilFormat, boolean z, boolean z2, int i, EGLConfig eGLConfig, int i2) {
            bufferFormat.getClass();
            depthStencilFormat.getClass();
            eGLConfig.getClass();
            this.bufferFormat = bufferFormat;
            this.depthStencilFormat = depthStencilFormat;
            this.isNotConformant = z;
            this.isCaveat = z2;
            this.index = i;
            this.config = eGLConfig;
            this.samples = i2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Config config) {
            config.getClass();
            int iCompare = Integer.compare(this.bufferFormat.getValue(), config.bufferFormat.getValue());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Integer.compare(this.depthStencilFormat.getValue(), config.depthStencilFormat.getValue());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Boolean.compare(this.isNotConformant, config.isNotConformant);
            if (iCompare3 != 0) {
                return iCompare3;
            }
            int iCompare4 = Boolean.compare(this.isCaveat, config.isCaveat);
            if (iCompare4 != 0) {
                return iCompare4;
            }
            int iCompare5 = Integer.compare(this.index, config.index);
            if (iCompare5 != 0) {
                return iCompare5;
            }
            return 0;
        }
    }

    private final int[] getConfigAttributes() {
        boolean zInEmulator$maps_sdk_release = Companion.inEmulator$maps_sdk_release();
        MapboxLogger.logI(this.TAG, "In emulator: " + zInEmulator$maps_sdk_release);
        int[] iArr = onContentCardClicked.read(onContentCardClicked.read(new int[]{12327, 12344, 12339, 4, 12320, 16, 12324, 5, 12323, 6, 12322, 5, 12321, this.translucentSurface ? 8 : 0, 12325, 16, 12326, STENCIL_SIZE, 12352, 4}, getAntialiasingEnabled() ? new int[]{12338, 1, 12337, this.antialiasingSampleCount} : new int[0]), zInEmulator$maps_sdk_release ? new int[]{12354, 4, 12351, 12430} : new int[0]);
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = 12344;
        return iArrCopyOf;
    }

    public EGLConfigChooser(boolean z, int i, String str) {
        str.getClass();
        this.translucentSurface = z;
        this.antialiasingSampleCount = i;
        this.TAG = "Mbgl-EGLConfigChooser".concat(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? "\\".concat(str) : "");
    }

    public final EGLConfig chooseConfig(EGLDisplay eGLDisplay) {
        eGLDisplay.getClass();
        EGLConfig eGLConfigChooseBestMatchConfig = chooseBestMatchConfig(eGLDisplay, getConfigs(eGLDisplay));
        if (eGLConfigChooseBestMatchConfig == null) {
            MapboxLogger.logE(this.TAG, "No EGL config found, see log above for concrete error.");
        }
        return eGLConfigChooseBestMatchConfig;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    private final EGLConfig chooseBestMatchConfig(EGLDisplay eGLDisplay, List<? extends EGLConfig> list) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        BufferFormat bufferFormat;
        DepthStencilFormat depthStencilFormat;
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends EGLConfig> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            EGLConfig next = it.next();
            i++;
            Integer numChooseBestMatchConfig$getConfigAttr = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12327);
            if (numChooseBestMatchConfig$getConfigAttr == null) {
                return null;
            }
            int iIntValue = numChooseBestMatchConfig$getConfigAttr.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr2 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12354);
            if (numChooseBestMatchConfig$getConfigAttr2 == null) {
                return null;
            }
            int iIntValue2 = numChooseBestMatchConfig$getConfigAttr2.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr3 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12320);
            if (numChooseBestMatchConfig$getConfigAttr3 == null) {
                return null;
            }
            int iIntValue3 = numChooseBestMatchConfig$getConfigAttr3.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr4 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12324);
            if (numChooseBestMatchConfig$getConfigAttr4 == null) {
                return null;
            }
            int iIntValue4 = numChooseBestMatchConfig$getConfigAttr4.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr5 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12323);
            if (numChooseBestMatchConfig$getConfigAttr5 == null) {
                return null;
            }
            int iIntValue5 = numChooseBestMatchConfig$getConfigAttr5.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr6 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12322);
            if (numChooseBestMatchConfig$getConfigAttr6 == null) {
                return null;
            }
            int iIntValue6 = numChooseBestMatchConfig$getConfigAttr6.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr7 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12321);
            if (numChooseBestMatchConfig$getConfigAttr7 == null) {
                return null;
            }
            int iIntValue7 = numChooseBestMatchConfig$getConfigAttr7.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr8 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12325);
            if (numChooseBestMatchConfig$getConfigAttr8 == null) {
                return null;
            }
            int iIntValue8 = numChooseBestMatchConfig$getConfigAttr8.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr9 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12326);
            if (numChooseBestMatchConfig$getConfigAttr9 == null) {
                return null;
            }
            int iIntValue9 = numChooseBestMatchConfig$getConfigAttr9.intValue();
            Integer numChooseBestMatchConfig$getConfigAttr10 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12338);
            if (numChooseBestMatchConfig$getConfigAttr10 == null) {
                return null;
            }
            int iIntValue10 = numChooseBestMatchConfig$getConfigAttr10.intValue();
            Iterator<? extends EGLConfig> it2 = it;
            Integer numChooseBestMatchConfig$getConfigAttr11 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12337);
            if (numChooseBestMatchConfig$getConfigAttr11 == null) {
                return null;
            }
            int iIntValue11 = numChooseBestMatchConfig$getConfigAttr11.intValue();
            ArrayList arrayList3 = arrayList2;
            boolean z3 = (iIntValue8 == 24 || iIntValue8 == 16) & (iIntValue9 == 8);
            if (getAntialiasingEnabled()) {
                boolean z4 = iIntValue10 >= 1;
                z2 = iIntValue11 >= this.antialiasingSampleCount;
                z = z3 & z4;
            } else {
                boolean z5 = iIntValue10 == 0;
                z = iIntValue11 == 0;
                z2 = z3 & z5;
            }
            if (!z2 || !z) {
                arrayList = arrayList3;
            } else {
                if (iIntValue3 == 16 && iIntValue4 == 5 && iIntValue5 == 6 && iIntValue6 == 5 && iIntValue7 == 0) {
                    bufferFormat = BufferFormat.Format16Bit;
                } else if (iIntValue3 == 32 && iIntValue4 == 8 && iIntValue5 == 8 && iIntValue6 == 8 && iIntValue7 == 0) {
                    bufferFormat = BufferFormat.Format32BitNoAlpha;
                } else if (iIntValue3 == 32 && iIntValue4 == 8 && iIntValue5 == 8 && iIntValue6 == 8 && iIntValue7 == 8) {
                    bufferFormat = BufferFormat.Format32BitAlpha;
                } else if (iIntValue3 == 24 && iIntValue4 == 8 && iIntValue5 == 8 && iIntValue6 == 8 && iIntValue7 == 0) {
                    bufferFormat = BufferFormat.Format24Bit;
                } else {
                    bufferFormat = BufferFormat.Unknown;
                }
                if (bufferFormat != BufferFormat.Unknown) {
                    if (iIntValue8 == 16 && iIntValue9 == 8) {
                        depthStencilFormat = DepthStencilFormat.Format16Depth8Stencil;
                    } else {
                        depthStencilFormat = DepthStencilFormat.Format24Depth8Stencil;
                    }
                    Config config = new Config(bufferFormat, depthStencilFormat, (iIntValue2 & 4) != 4, iIntValue != 12344, i, next, iIntValue11);
                    arrayList = arrayList3;
                    arrayList.add(config);
                } else {
                    arrayList = arrayList3;
                }
            }
            arrayList2 = arrayList;
            it = it2;
        }
        ArrayList arrayList4 = arrayList2;
        if (arrayList4.size() == 0) {
            MapboxLogger.logE(this.TAG, "No matching configurations after filtering");
            return null;
        }
        BrazeContentCardsManagerCompanion.RatingCompat(arrayList4);
        Object obj = arrayList4.get(0);
        obj.getClass();
        Config config2 = (Config) obj;
        if (config2.isCaveat()) {
            MapboxLogger.logW(this.TAG, "Chosen config has a caveat.");
        }
        if (config2.isNotConformant()) {
            MapboxLogger.logW(this.TAG, "Chosen config is not conformant.");
        }
        if (getAntialiasingEnabled() && config2.getSamples() != this.antialiasingSampleCount) {
            MapboxLogger.logW(this.TAG, "MSAA x" + this.antialiasingSampleCount + " requested, but closest supported x" + config2.getSamples() + " applied");
        }
        return config2.getConfig();
    }
}
