package com.adjust.sdk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.graphics.Fields;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.huawei.riemann.location.common.utils.Constant;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.accesstoOffsetmoWRBKg;
import o.extractIntegerPixels;
import o.setFontSizeR2X_6o;

/* JADX INFO: loaded from: classes.dex */
public class AdjustInstance {
    private IActivityHandler activityHandler;
    private String basePath;
    private OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    private String gdprPath;
    private String purchaseVerificationPath;
    private String pushToken;
    private String subscriptionPath;
    private Boolean startEnabled = null;
    private boolean startOffline = false;
    private PreLaunchActions preLaunchActions = new PreLaunchActions();
    private final ArrayList<OnAdidReadListener> cachedAdidReadCallbacks = new ArrayList<>();
    private final ArrayList<AdjustTimeoutCallback> cachedAdidReadTimeoutCallbacks = new ArrayList<>();
    private final ArrayList<OnAttributionReadListener> cachedAttributionReadCallbacks = new ArrayList<>();
    private final ArrayList<AdjustTimeoutCallback> cachedAttributionReadTimeoutCallbacks = new ArrayList<>();
    private final ArrayList<AdjustTimeoutCallback> cachedThirdPartySharingTimeoutCallbacks = new ArrayList<>();

    public static class PreLaunchActions {
        public List<IRunActivityHandler> preLaunchActionsArray = new ArrayList();
    }

    public void disable() {
        this.startEnabled = Boolean.FALSE;
        if (checkActivityHandler(false, "enabled mode", "disabled mode")) {
            this.activityHandler.setEnabled(false);
        }
    }

    public void disableCoppaComplianceInDelay() {
        if (checkActivityHandler("disableCoppaComplianceInDelay")) {
            this.activityHandler.setCoppaComplianceInDelay(false);
        }
    }

    public void disablePlayStoreKidsComplianceInDelay() {
        if (checkActivityHandler("disablePlayStoreKidsComplianceInDelay")) {
            this.activityHandler.setPlayStoreKidsComplianceInDelay(false);
        }
    }

    public void enable() {
        this.startEnabled = Boolean.TRUE;
        if (checkActivityHandler(true, "enabled mode", "disabled mode")) {
            this.activityHandler.setEnabled(true);
        }
    }

    public void enableCoppaComplianceInDelay() {
        if (checkActivityHandler("enableCoppaComplianceInDelay")) {
            this.activityHandler.setCoppaComplianceInDelay(true);
        }
    }

    public void enablePlayStoreKidsComplianceInDelay() {
        if (checkActivityHandler("enablePlayStoreKidsComplianceInDelay")) {
            this.activityHandler.setPlayStoreKidsComplianceInDelay(true);
        }
    }

    public void endFirstSessionDelay() {
        if (checkActivityHandler("endFirstSessionDelay")) {
            this.activityHandler.endFirstSessionDelay();
        }
    }

    public void getAdid(OnAdidReadListener onAdidReadListener) {
        if (checkActivityHandler("getAdid")) {
            this.activityHandler.getAdid(onAdidReadListener);
        } else {
            this.cachedAdidReadCallbacks.add(onAdidReadListener);
        }
    }

    public void getAdidWithTimeout(final Context context, final long j, final OnAdidReadListener onAdidReadListener) {
        if (checkActivityHandler("getAdidWithTimeout")) {
            this.activityHandler.getAdidWithTimeout(j, onAdidReadListener);
        } else {
            new SingleThreadCachedScheduler("getAdidWithTimeout").submit(new Runnable() { // from class: com.adjust.sdk.AdjustInstance.8
                @Override // java.lang.Runnable
                public final void run() {
                    final String adidFromActivityStateFile = Util.getAdidFromActivityStateFile(context);
                    if (adidFromActivityStateFile != null) {
                        new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.adjust.sdk.AdjustInstance.8.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                onAdidReadListener.onAdidRead(adidFromActivityStateFile);
                            }
                        });
                    } else {
                        ActivityHandler.queueGetAdidWithTimeout(j, onAdidReadListener, AdjustInstance.this.cachedAdidReadTimeoutCallbacks, context);
                    }
                }
            });
        }
    }

    public void getAttribution(OnAttributionReadListener onAttributionReadListener) {
        if (checkActivityHandler("getAttribution")) {
            this.activityHandler.getAttribution(onAttributionReadListener);
        } else {
            this.cachedAttributionReadCallbacks.add(onAttributionReadListener);
        }
    }

    public void getAttributionWithTimeout(final Context context, final long j, final OnAttributionReadListener onAttributionReadListener) {
        if (checkActivityHandler("getAttributionWithTimeout")) {
            this.activityHandler.getAttributionWithTimeout(j, onAttributionReadListener);
        } else {
            new SingleThreadCachedScheduler("getAttributionWithTimeout").submit(new Runnable() { // from class: com.adjust.sdk.AdjustInstance.9
                @Override // java.lang.Runnable
                public final void run() {
                    final AdjustAttribution attributionFromAttributionFile = Util.getAttributionFromAttributionFile(context);
                    if (attributionFromAttributionFile != null) {
                        new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.adjust.sdk.AdjustInstance.9.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                onAttributionReadListener.onAttributionRead(attributionFromAttributionFile);
                            }
                        });
                    } else {
                        ActivityHandler.queueGetAttributionWithTimeout(j, onAttributionReadListener, AdjustInstance.this.cachedAttributionReadTimeoutCallbacks, context);
                    }
                }
            });
        }
    }

    public void getLastDeeplink(final Context context, final OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        new AsyncTaskExecutor<Void, Uri>() { // from class: com.adjust.sdk.AdjustInstance.13
            private static final byte[] $$c = {48, 87, 118, 14};
            private static final int $$d = Constant.ERROR_ROAD_AREA_INVALID;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {62, 67, -109, -100, 8, -1, -8, -8, 2};
            private static final int $$b = 36;
            private static int MediaBrowserCompatMediaItem = 0;
            private static int MediaDescriptionCompat = 1;
            private static char[] IconCompatParcelizer = {63635, 52563, 52581, 52602, 52577, 63634, 52514, 52600, 52591, 52583, 52596, 63632, 52585, 52590, 52607, 52578, 52604, 52576, 52587, 63637, 63636, 52589, 52541, 52601, 52513, 52586, 52606, 52584, 52597, 52515, 52603, 63639, 52580, 63633, 52579, 63646};
            private static char serializer = 63632;
            private static long write = -7009568347796326538L;
            private static int read = -2037237951;
            private static char RemoteActionCompatParcelizer = 14198;

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r5, byte r6, short r7) {
                /*
                    int r5 = r5 * 3
                    int r0 = 1 - r5
                    int r7 = r7 + 103
                    int r6 = r6 * 2
                    int r6 = r6 + 4
                    byte[] r1 = com.adjust.sdk.AdjustInstance.AnonymousClass13.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r5 = 0 - r5
                    if (r1 != 0) goto L17
                    r7 = r5
                    r4 = r6
                    r3 = r2
                    goto L27
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r5) goto L23
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L23:
                    r4 = r1[r6]
                    int r3 = r3 + 1
                L27:
                    int r6 = r6 + 1
                    int r7 = r7 + r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.AdjustInstance.AnonymousClass13.$$e(int, byte, short):java.lang.String");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r6 = 4 - r6
                    byte[] r0 = com.adjust.sdk.AdjustInstance.AnonymousClass13.$$a
                    int r8 = r8 * 2
                    int r8 = r8 + 114
                    int r7 = r7 + 4
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r4 = r6
                    r8 = r7
                    r3 = r2
                    goto L2a
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r8
                    int r7 = r7 + 1
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    r4 = r0[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L2a:
                    int r4 = -r4
                    int r7 = r7 + r4
                    int r7 = r7 + (-5)
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.AdjustInstance.AnonymousClass13.d(int, int, short, java.lang.Object[]):void");
            }

            @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
            public final void onPostExecute(Uri uri) {
                int i = 2 % 2;
                int i2 = MediaDescriptionCompat + 61;
                MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    onLastDeeplinkReadListener.onLastDeeplinkRead(uri);
                } else {
                    onLastDeeplinkReadListener.onLastDeeplinkRead(uri);
                    int i3 = 0 / 0;
                }
            }

            @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
            public final Uri doInBackground(Void[] voidArr) {
                Uri uri;
                int i = 2 % 2;
                int i2 = MediaBrowserCompatMediaItem + 93;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                try {
                    if (i2 % 2 == 0) {
                        uri = Uri.parse(AdjustInstance.this.getCachedDeeplink(context));
                        int i3 = 3 / 0;
                    } else {
                        uri = Uri.parse(AdjustInstance.this.getCachedDeeplink(context));
                    }
                    int i4 = MediaBrowserCompatMediaItem + 53;
                    MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return uri;
                    }
                    throw null;
                } catch (Exception unused) {
                    return null;
                }
            }

            private static void f(char[] cArr, int i, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                accesstoOffsetmoWRBKg accesstooffsetmowrbkg = new accesstoOffsetmoWRBKg();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                accesstooffsetmowrbkg.IconCompatParcelizer = 0;
                while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
                    int i4 = $10 + 109;
                    $11 = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % i2;
                    try {
                        Object[] objArr2 = {accesstooffsetmowrbkg};
                        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) View.MeasureSpec.makeMeasureSpec(0, 0), 231 - TextUtils.indexOf("", "", 0), (-16777195) - Color.rgb(0, 0, 0), 1436720535, false, "j", new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {accesstooffsetmowrbkg};
                        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) Gravity.getAbsoluteGravity(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 2547, 30 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -73045399, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {accesstooffsetmowrbkg, Integer.valueOf(cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (Process.getGidForName("") + 1), 888 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 61 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -562850980, false, $$e(b3, b4, (byte) (b4 | 8)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 65450), (ViewConfiguration.getScrollBarSize() >> 8) + 1244, 33 - (Process.myPid() >> 22), 1854554309, false, $$e(b5, b6, (byte) (b6 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                        cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (write ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) read) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) RemoteActionCompatParcelizer) ^ (-7009568347796326538L)))));
                        accesstooffsetmowrbkg.IconCompatParcelizer++;
                        int i6 = $10 + 9;
                        $11 = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            private static void e(byte b, char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int i3 = 2 % 2;
                extractIntegerPixels extractintegerpixels = new extractIntegerPixels();
                char[] cArr2 = IconCompatParcelizer;
                int i4 = -556721944;
                Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i5 = $10 + 101;
                    $11 = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                            if (objRemoteActionCompatParcelizer == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ViewConfiguration.getEdgeSlop() >> 16), 2015 - KeyEvent.keyCodeFromString(""), 23 - ImageFormat.getBitsPerPixel(0), 234961161, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                            i7++;
                            i4 = -556721944;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(serializer)};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-556721944);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2015 - View.getDefaultSize(0, 0), 24 - KeyEvent.keyCodeFromString(""), 234961161, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        int i8 = $10 + 21;
                        $11 = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        extractintegerpixels.IconCompatParcelizer = 0;
                        while (extractintegerpixels.IconCompatParcelizer < i2) {
                            extractintegerpixels.read = cArr[extractintegerpixels.IconCompatParcelizer];
                            extractintegerpixels.write = cArr[extractintegerpixels.IconCompatParcelizer + 1];
                            if (extractintegerpixels.read == extractintegerpixels.write) {
                                cArr4[extractintegerpixels.IconCompatParcelizer] = (char) (extractintegerpixels.read - b);
                                cArr4[extractintegerpixels.IconCompatParcelizer + 1] = (char) (extractintegerpixels.write - b);
                                obj = obj2;
                            } else {
                                Object[] objArr4 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(445195572);
                                if (objRemoteActionCompatParcelizer3 == null) {
                                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.indexOf("", ""), 142 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 18, -900135723, false, "f", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == extractintegerpixels.RatingCompat) {
                                    Object[] objArr5 = {extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, extractintegerpixels, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), extractintegerpixels, Integer.valueOf(cCharValue), extractintegerpixels};
                                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1333055039);
                                    if (objRemoteActionCompatParcelizer4 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = b6;
                                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ViewConfiguration.getTouchSlop() >> 8), 2370 - View.combineMeasuredStates(0, 0), 18 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1616580640, false, $$e(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                                    int i10 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                                    cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[iIntValue];
                                    cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i10];
                                } else {
                                    obj = null;
                                    if (extractintegerpixels.serializer == extractintegerpixels.RemoteActionCompatParcelizer) {
                                        int i11 = $11 + 35;
                                        $10 = i11 % Fields.SpotShadowColor;
                                        int i12 = i11 % 2;
                                        extractintegerpixels.MediaBrowserCompatMediaItem = ((extractintegerpixels.MediaBrowserCompatMediaItem + cCharValue) - 1) % cCharValue;
                                        extractintegerpixels.RatingCompat = ((extractintegerpixels.RatingCompat + cCharValue) - 1) % cCharValue;
                                        int i13 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                                        int i14 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.RatingCompat;
                                        cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i13];
                                        cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i14];
                                    } else {
                                        int i15 = (extractintegerpixels.serializer * cCharValue) + extractintegerpixels.RatingCompat;
                                        int i16 = (extractintegerpixels.RemoteActionCompatParcelizer * cCharValue) + extractintegerpixels.MediaBrowserCompatMediaItem;
                                        cArr4[extractintegerpixels.IconCompatParcelizer] = cArr2[i15];
                                        cArr4[extractintegerpixels.IconCompatParcelizer + 1] = cArr2[i16];
                                    }
                                }
                            }
                            extractintegerpixels.IconCompatParcelizer += 2;
                            obj2 = obj;
                        }
                    }
                    for (int i17 = 0; i17 < i; i17++) {
                        cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                    }
                    objArr[0] = new String(cArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX WARN: Multi-variable search skipped. Vars limit reached: 7820 (expected less than 5000) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v170, types: [char[]] */
            /* JADX WARN: Type inference failed for: r11v171 */
            /* JADX WARN: Type inference failed for: r11v193 */
            /* JADX WARN: Type inference failed for: r11v194 */
            /* JADX WARN: Type inference failed for: r11v195, types: [java.lang.CharSequence, java.lang.String] */
            /* JADX WARN: Type inference failed for: r11v196, types: [java.lang.CharSequence, java.lang.String] */
            /* JADX WARN: Type inference failed for: r11v204 */
            /* JADX WARN: Type inference failed for: r11v396 */
            /* JADX WARN: Type inference failed for: r11v397 */
            /* JADX WARN: Type inference failed for: r11v460, types: [java.lang.CharSequence] */
            /* JADX WARN: Type inference failed for: r11v518 */
            /* JADX WARN: Type inference failed for: r11v521 */
            /* JADX WARN: Type inference failed for: r11v522 */
            /* JADX WARN: Type inference failed for: r11v532 */
            /* JADX WARN: Type inference failed for: r11v533, types: [java.lang.CharSequence] */
            /* JADX WARN: Type inference failed for: r11v553 */
            /* JADX WARN: Type inference failed for: r11v684 */
            /* JADX WARN: Type inference failed for: r11v685 */
            /* JADX WARN: Type inference failed for: r11v686 */
            /* JADX WARN: Type inference failed for: r11v687 */
            /* JADX WARN: Type inference failed for: r11v688 */
            /* JADX WARN: Type inference failed for: r11v689 */
            /* JADX WARN: Type inference failed for: r11v690 */
            /* JADX WARN: Type inference failed for: r11v691 */
            /* JADX WARN: Type inference failed for: r11v692 */
            /* JADX WARN: Type inference failed for: r11v693 */
            /* JADX WARN: Type inference failed for: r39v21 */
            /* JADX WARN: Type inference failed for: r39v23, types: [java.lang.CharSequence, java.lang.String] */
            /* JADX WARN: Type inference failed for: r40v103 */
            /* JADX WARN: Type inference failed for: r40v41 */
            /* JADX WARN: Type inference failed for: r40v42 */
            /* JADX WARN: Type inference failed for: r40v54 */
            /* JADX WARN: Type inference failed for: r41v25 */
            /* JADX WARN: Type inference failed for: r41v26 */
            /* JADX WARN: Type inference failed for: r41v27 */
            /* JADX WARN: Type inference failed for: r41v28 */
            /* JADX WARN: Type inference failed for: r41v29 */
            /* JADX WARN: Type inference failed for: r41v30 */
            /* JADX WARN: Type inference failed for: r41v43 */
            /* JADX WARN: Type inference failed for: r41v44 */
            /* JADX WARN: Type inference failed for: r41v83 */
            /* JADX WARN: Type inference failed for: r41v84 */
            /* JADX WARN: Type inference failed for: r41v85 */
            /* JADX WARN: Type inference failed for: r41v86 */
            /* JADX WARN: Type inference failed for: r41v87 */
            /* JADX WARN: Type inference failed for: r5v288, types: [java.util.regex.Pattern] */
            /* JADX WARN: Type inference failed for: r7v141 */
            /* JADX WARN: Type inference failed for: r7v146, types: [java.lang.CharSequence, java.lang.String] */
            /* JADX WARN: Type inference failed for: r7v147 */
            /* JADX WARN: Type inference failed for: r7v148, types: [java.lang.CharSequence] */
            /* JADX WARN: Type inference failed for: r7v234, types: [java.lang.CharSequence] */
            /* JADX WARN: Type inference failed for: r7v245 */
            /* JADX WARN: Type inference failed for: r7v440 */
            /* JADX WARN: Type inference failed for: r7v658 */
            /* JADX WARN: Type inference failed for: r7v659 */
            /* JADX WARN: Type inference failed for: r7v660 */
            /* JADX WARN: Type inference failed for: r7v661 */
            /* JADX WARN: Type inference failed for: r9v547 */
            /* JADX WARN: Type inference failed for: r9v548 */
            /* JADX WARN: Type inference failed for: r9v652, types: [java.lang.CharSequence] */
            /* JADX WARN: Type inference failed for: r9v932 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(Unknown Source)
                	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] IconCompatParcelizer(int r70, int r71, o.getHorizontalScrollAxisRange r72, int r73, boolean r74) {
                /*
                    Method dump skipped, instruction units count: 22127
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.AdjustInstance.AnonymousClass13.IconCompatParcelizer(int, int, o.getHorizontalScrollAxisRange, int, boolean):java.lang.Object[]");
            }
        }.execute(new Void[0]);
    }

    public void getSdkVersion(final OnSdkVersionReadListener onSdkVersionReadListener) {
        new AsyncTaskExecutor<Void, String>() { // from class: com.adjust.sdk.AdjustInstance.11
            @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
            public final String doInBackground(Void[] voidArr) {
                return Util.getSdkVersion();
            }

            @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
            public final void onPostExecute(String str) {
                onSdkVersionReadListener.onSdkVersionRead(str);
            }
        }.execute(new Void[0]);
    }

    public void getThirdPartySharingSettingsWithTimeout(final Context context, final long j, final OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener) {
        if (checkActivityHandler("getThirdPartySharingSettings")) {
            this.activityHandler.getThirdPartySharingSettingsWithTimeout(j, onThirdPartySharingSettingsReadListener);
        } else {
            new SingleThreadCachedScheduler("getThirdPartySharingSettings").submit(new Runnable() { // from class: com.adjust.sdk.AdjustInstance.10
                @Override // java.lang.Runnable
                public final void run() {
                    final AdjustThirdPartySharingResult thirdPartySharingResult = SharedPreferencesManager.getDefaultInstance(context).getThirdPartySharingResult();
                    if (thirdPartySharingResult != null) {
                        new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.adjust.sdk.AdjustInstance.10.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                onThirdPartySharingSettingsReadListener.onThirdPartySharingSettingsRead(thirdPartySharingResult);
                            }
                        });
                    } else {
                        ActivityHandler.queueGetThirdPartySharingSettingsWithTimeout(j, onThirdPartySharingSettingsReadListener, AdjustInstance.this.cachedThirdPartySharingTimeoutCallbacks, context);
                    }
                }
            });
        }
    }

    public void isEnabled(Context context, final OnIsEnabledListener onIsEnabledListener) {
        if (checkActivityHandler("isEnabled")) {
            this.activityHandler.isEnabled(onIsEnabledListener);
        } else {
            new AsyncTaskExecutor<Context, Boolean>() { // from class: com.adjust.sdk.AdjustInstance.1
                @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
                public final void onPostExecute(Boolean bool) {
                    onIsEnabledListener.onIsEnabledRead(bool.booleanValue());
                }

                @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
                public final Boolean doInBackground(Context[] contextArr) {
                    return Boolean.valueOf(Util.isEnabledFromActivityStateFile(contextArr[0]));
                }
            }.execute(context);
        }
    }

    public void onPause() {
        if (checkActivityHandler("onPause")) {
            this.activityHandler.onPause();
        }
    }

    public void onResume() {
        if (checkActivityHandler("onResume")) {
            this.activityHandler.onResume();
        }
    }

    public void processAndResolveDeeplink(AdjustDeeplink adjustDeeplink, Context context, OnDeeplinkResolvedListener onDeeplinkResolvedListener) {
        if (adjustDeeplink == null || !adjustDeeplink.isValid()) {
            AdjustFactory.getLogger().warn("Skipping deeplink processing (null or empty)", new Object[0]);
            return;
        }
        if (onDeeplinkResolvedListener == null) {
            processDeeplink(adjustDeeplink, context);
            return;
        }
        cacheDeeplink(adjustDeeplink.url, context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (checkActivityHandler("processAndResolveDeeplink", true)) {
            this.activityHandler.processAndResolveDeeplink(adjustDeeplink, jCurrentTimeMillis, onDeeplinkResolvedListener);
        } else {
            saveDeeplink(adjustDeeplink, jCurrentTimeMillis, context);
            this.cachedDeeplinkResolutionCallback = onDeeplinkResolvedListener;
        }
    }

    public void processDeeplink(AdjustDeeplink adjustDeeplink, Context context) {
        if (adjustDeeplink == null || !adjustDeeplink.isValid()) {
            AdjustFactory.getLogger().warn("Skipping deeplink processing (null or empty)", new Object[0]);
            return;
        }
        cacheDeeplink(adjustDeeplink.url, context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (checkActivityHandler("processDeeplink", true)) {
            this.activityHandler.processDeeplink(adjustDeeplink, jCurrentTimeMillis);
        } else {
            saveDeeplink(adjustDeeplink, jCurrentTimeMillis, context);
        }
    }

    public void sendPreinstallReferrer(String str, Context context) {
        if (str == null || str.length() == 0) {
            AdjustFactory.getLogger().warn("Skipping SYSTEM_INSTALLER_REFERRER preinstall referrer processing (null or empty)", new Object[0]);
            return;
        }
        savePreinstallReferrer(str, context);
        if (checkActivityHandler("preinstall referrer", true) && this.activityHandler.isEnabled()) {
            this.activityHandler.sendPreinstallReferrer();
        }
    }

    public void addGlobalCallbackParameter(final String str, final String str2) {
        if (checkActivityHandler("adding global callback parameter", true)) {
            this.activityHandler.addGlobalCallbackParameter(str, str2);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() { // from class: com.adjust.sdk.AdjustInstance.2
                @Override // com.adjust.sdk.IRunActivityHandler
                public final void run(ActivityHandler activityHandler) {
                    activityHandler.addGlobalCallbackParameterI(str, str2);
                }
            });
        }
    }

    public void addGlobalPartnerParameter(final String str, final String str2) {
        if (checkActivityHandler("adding global partner parameter", true)) {
            this.activityHandler.addGlobalPartnerParameter(str, str2);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() { // from class: com.adjust.sdk.AdjustInstance.3
                @Override // com.adjust.sdk.IRunActivityHandler
                public final void run(ActivityHandler activityHandler) {
                    activityHandler.addGlobalPartnerParameterI(str, str2);
                }
            });
        }
    }

    public void setExternalDeviceIdInDelay(String str) {
        if (checkActivityHandler("setExternalDeviceIdInDelay")) {
            this.activityHandler.setExternalDeviceIdInDelay(str);
        }
    }

    public void teardown() {
        if (checkActivityHandler("teardown")) {
            this.activityHandler.teardown();
            this.activityHandler = null;
        }
    }

    public void trackAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityHandler("trackAdRevenue")) {
            this.activityHandler.trackAdRevenue(adjustAdRevenue);
        }
    }

    public void trackEvent(AdjustEvent adjustEvent) {
        if (checkActivityHandler("trackEvent")) {
            this.activityHandler.trackEvent(adjustEvent);
        }
    }

    public void trackMeasurementConsent(boolean z) {
        if (!checkActivityHandler("measurement consent", true)) {
            this.preLaunchActions.preLaunchActionsArray.add(new AdjustInstance$$ExternalSyntheticLambda2(z, 0));
        } else {
            this.activityHandler.trackMeasurementConsent(z);
        }
    }

    public void trackPlayStoreSubscription(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (checkActivityHandler("trackPlayStoreSubscription")) {
            this.activityHandler.trackPlayStoreSubscription(adjustPlayStoreSubscription);
        }
    }

    public void verifyAndTrackPlayStorePurchase(AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (checkActivityHandler("verifyAndTrack")) {
            this.activityHandler.verifyAndTrackPlayStorePurchase(adjustEvent, onPurchaseVerificationFinishedListener);
        } else if (onPurchaseVerificationFinishedListener != null) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 100, "SDK needs to be initialized before making purchase verification request"));
        }
    }

    public void verifyPlayStorePurchase(AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (!checkActivityHandler("verifyPurchase")) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 100, "SDK needs to be initialized before making purchase verification request"));
        } else {
            this.activityHandler.verifyPlayStorePurchase(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
        }
    }

    private void cacheDeeplink(Uri uri, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).cacheDeeplink(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCachedDeeplink(Context context) {
        return SharedPreferencesManager.getDefaultInstance(context).getCachedDeeplink();
    }

    private boolean isInstanceEnabled() {
        Boolean bool = this.startEnabled;
        return bool == null || bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setSendingReferrersAsNotSent$2(Context context) {
        SharedPreferencesManager.getDefaultInstance(context).setSendingReferrersAsNotSent();
    }

    private void saveDeeplink(AdjustDeeplink adjustDeeplink, long j, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).saveDeeplink(adjustDeeplink, j);
    }

    private void saveGdprForgetMe(Context context) {
        SharedPreferencesManager.getDefaultInstance(context).setGdprForgetMe();
    }

    private void savePreinstallReferrer(String str, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).savePreinstallReferrer(str);
    }

    private void savePushToken(String str, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).savePushToken(str);
    }

    private void saveRawReferrer(String str, long j, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).saveRawReferrer(str, j);
    }

    private void setSendingReferrersAsNotSent(Context context) {
        new SingleThreadCachedScheduler("AdjustInstance").submit(new AdjustInstance$$ExternalSyntheticLambda1(context, 0));
    }

    public void getAmazonAdId(Context context, OnAmazonAdIdReadListener onAmazonAdIdReadListener) {
        DeviceInfo.getFireAdvertisingIdBypassConditions(context.getContentResolver(), onAmazonAdIdReadListener);
    }

    public void getGooglePlayInstallReferrer(Context context, final OnGooglePlayInstallReferrerReadListener onGooglePlayInstallReferrerReadListener) {
        new InstallReferrer(context, new InstallReferrerReadListener() { // from class: com.adjust.sdk.AdjustInstance.12
            @Override // com.adjust.sdk.InstallReferrerReadListener
            public final void onFail(String str) {
                onGooglePlayInstallReferrerReadListener.onFail(str);
            }

            @Override // com.adjust.sdk.InstallReferrerReadListener
            public final void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
                onGooglePlayInstallReferrerReadListener.onInstallReferrerRead(new GooglePlayInstallReferrerDetails(referrerDetails));
            }
        }).startConnection();
    }

    public void removeGlobalCallbackParameter(final String str) {
        if (checkActivityHandler("removing global callback parameter", true)) {
            this.activityHandler.removeGlobalCallbackParameter(str);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() { // from class: com.adjust.sdk.AdjustInstance.4
                @Override // com.adjust.sdk.IRunActivityHandler
                public final void run(ActivityHandler activityHandler) {
                    activityHandler.removeGlobalCallbackParameterI(str);
                }
            });
        }
    }

    public void removeGlobalCallbackParameters() {
        if (checkActivityHandler("resetting global callback parameters", true)) {
            this.activityHandler.removeGlobalCallbackParameters();
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() { // from class: com.adjust.sdk.AdjustInstance.6
                @Override // com.adjust.sdk.IRunActivityHandler
                public final void run(ActivityHandler activityHandler) {
                    activityHandler.removeGlobalCallbackParametersI();
                }
            });
        }
    }

    public void removeGlobalPartnerParameter(final String str) {
        if (checkActivityHandler("removing global partner parameter", true)) {
            this.activityHandler.removeGlobalPartnerParameter(str);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() { // from class: com.adjust.sdk.AdjustInstance.5
                @Override // com.adjust.sdk.IRunActivityHandler
                public final void run(ActivityHandler activityHandler) {
                    activityHandler.removeGlobalPartnerParameterI(str);
                }
            });
        }
    }

    public void removeGlobalPartnerParameters() {
        if (checkActivityHandler("resetting global partner parameters", true)) {
            this.activityHandler.removeGlobalPartnerParameters();
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() { // from class: com.adjust.sdk.AdjustInstance.7
                @Override // com.adjust.sdk.IRunActivityHandler
                public final void run(ActivityHandler activityHandler) {
                    activityHandler.removeGlobalPartnerParametersI();
                }
            });
        }
    }

    public void setTestOptions(AdjustTestOptions adjustTestOptions) {
        String str = adjustTestOptions.basePath;
        if (str != null) {
            this.basePath = str;
        }
        String str2 = adjustTestOptions.gdprPath;
        if (str2 != null) {
            this.gdprPath = str2;
        }
        String str3 = adjustTestOptions.subscriptionPath;
        if (str3 != null) {
            this.subscriptionPath = str3;
        }
        String str4 = adjustTestOptions.purchaseVerificationPath;
        if (str4 != null) {
            this.purchaseVerificationPath = str4;
        }
        String str5 = adjustTestOptions.baseUrl;
        if (str5 != null) {
            AdjustFactory.setBaseUrl(str5);
        }
        String str6 = adjustTestOptions.gdprUrl;
        if (str6 != null) {
            AdjustFactory.setGdprUrl(str6);
        }
        String str7 = adjustTestOptions.subscriptionUrl;
        if (str7 != null) {
            AdjustFactory.setSubscriptionUrl(str7);
        }
        String str8 = adjustTestOptions.purchaseVerificationUrl;
        if (str8 != null) {
            AdjustFactory.setPurchaseVerificationUrl(str8);
        }
        Long l = adjustTestOptions.timerIntervalInMilliseconds;
        if (l != null) {
            AdjustFactory.setTimerInterval(l.longValue());
        }
        if (adjustTestOptions.timerStartInMilliseconds != null) {
            AdjustFactory.setTimerStart(adjustTestOptions.timerIntervalInMilliseconds.longValue());
        }
        Long l2 = adjustTestOptions.sessionIntervalInMilliseconds;
        if (l2 != null) {
            AdjustFactory.setSessionInterval(l2.longValue());
        }
        Long l3 = adjustTestOptions.subsessionIntervalInMilliseconds;
        if (l3 != null) {
            AdjustFactory.setSubsessionInterval(l3.longValue());
        }
        Boolean bool = adjustTestOptions.tryInstallReferrer;
        if (bool != null) {
            AdjustFactory.setTryInstallReferrer(bool.booleanValue());
        }
        if (adjustTestOptions.noBackoffWait != null) {
            BackoffStrategy backoffStrategy = BackoffStrategy.NO_WAIT;
            AdjustFactory.setPackageHandlerBackoffStrategy(backoffStrategy);
            AdjustFactory.setSdkClickBackoffStrategy(backoffStrategy);
        }
        Boolean bool2 = adjustTestOptions.ignoreSystemLifecycleBootstrap;
        if (bool2 != null) {
            AdjustFactory.setIgnoreSystemLifecycleBootstrap(bool2.booleanValue());
        }
        Boolean bool3 = adjustTestOptions.allowUrlStrategyFallback;
        if (bool3 != null) {
            AdjustFactory.setAllowUrlStrategyFallback(bool3.booleanValue());
        }
    }

    public void trackThirdPartySharing(AdjustThirdPartySharing adjustThirdPartySharing) {
        if (!checkActivityHandler("third party sharing", true)) {
            this.preLaunchActions.preLaunchActionsArray.add(new AdjustInstance$$ExternalSyntheticLambda0(adjustThirdPartySharing, 0));
        } else {
            this.activityHandler.trackThirdPartySharing(adjustThirdPartySharing);
        }
    }

    public void switchBackToOnlineMode() {
        if (!checkActivityHandler(false, "offline mode", "online mode")) {
            this.startOffline = false;
        } else {
            this.activityHandler.setOfflineMode(false);
        }
    }

    public void switchToOfflineMode() {
        if (!checkActivityHandler(true, "offline mode", "online mode")) {
            this.startOffline = true;
        } else {
            this.activityHandler.setOfflineMode(true);
        }
    }

    public void gdprForgetMe(Context context) {
        saveGdprForgetMe(context);
        if (checkActivityHandler("gdpr", true) && this.activityHandler.isEnabled()) {
            this.activityHandler.gdprForgetMe();
        }
    }

    public void sendReferrer(String str, Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str == null || str.length() == 0) {
            AdjustFactory.getLogger().warn("Skipping INSTALL_REFERRER intent referrer processing (null or empty)", new Object[0]);
            return;
        }
        saveRawReferrer(str, jCurrentTimeMillis, context);
        if (checkActivityHandler(Constants.REFERRER, true) && this.activityHandler.isEnabled()) {
            this.activityHandler.sendReftagReferrer();
        }
    }

    public void setPushToken(String str, Context context) {
        savePushToken(str, context);
        if (checkActivityHandler("push token", true) && this.activityHandler.isEnabled()) {
            this.activityHandler.setPushToken(str, true);
        }
    }

    public void initSdk(AdjustConfig adjustConfig) {
        if (!AdjustSigner.isPresent()) {
            AdjustFactory.getLogger().error("Missing signature library, SDK can't be initialised", new Object[0]);
            return;
        }
        if (adjustConfig == null) {
            AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
            return;
        }
        if (!adjustConfig.isValid()) {
            AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
            return;
        }
        if (this.activityHandler != null) {
            AdjustFactory.getLogger().error("Adjust already initialized", new Object[0]);
            return;
        }
        adjustConfig.preLaunchActions = this.preLaunchActions;
        adjustConfig.pushToken = this.pushToken;
        adjustConfig.startEnabled = this.startEnabled;
        adjustConfig.startOffline = this.startOffline;
        adjustConfig.basePath = this.basePath;
        adjustConfig.gdprPath = this.gdprPath;
        adjustConfig.subscriptionPath = this.subscriptionPath;
        adjustConfig.purchaseVerificationPath = this.purchaseVerificationPath;
        adjustConfig.cachedDeeplinkResolutionCallback = this.cachedDeeplinkResolutionCallback;
        adjustConfig.cachedAdidReadCallbacks = this.cachedAdidReadCallbacks;
        adjustConfig.cachedAdidReadTimeoutCallbacks = this.cachedAdidReadTimeoutCallbacks;
        adjustConfig.cachedAttributionReadCallbacks = this.cachedAttributionReadCallbacks;
        adjustConfig.cachedAttributionReadTimeoutCallbacks = this.cachedAttributionReadTimeoutCallbacks;
        adjustConfig.cachedThirdPartySharingTimeoutCallbacks = this.cachedThirdPartySharingTimeoutCallbacks;
        this.activityHandler = AdjustFactory.getActivityHandler(adjustConfig);
        setSendingReferrersAsNotSent(adjustConfig.context);
    }

    private boolean checkActivityHandler(String str, boolean z) {
        if (this.activityHandler != null) {
            return true;
        }
        if (str == null) {
            AdjustFactory.getLogger().error("Adjust not initialized correctly", new Object[0]);
            return false;
        }
        if (z) {
            AdjustFactory.getLogger().warn("Adjust not initialized, but %s saved for launch", str);
        } else {
            AdjustFactory.getLogger().warn("Adjust not initialized, can't perform %s", str);
        }
        return false;
    }

    private boolean checkActivityHandler(boolean z, String str, String str2) {
        if (z) {
            return checkActivityHandler(str, true);
        }
        return checkActivityHandler(str2, true);
    }

    private boolean checkActivityHandler(String str) {
        return checkActivityHandler(str, false);
    }
}
