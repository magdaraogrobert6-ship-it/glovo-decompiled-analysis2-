package com.sentiance.core.model.thrift;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PointF;
import android.os.Process;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.rider.recruitment.applicant.domain.GetApplicantAccessTokenUseCaseImpl;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import dagger.Lazy;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.BrazeUser;
import o.FwFClientConfigKt;
import o.FwFClientExtensionKt;
import o.GifDrawableTransformation;
import o.RequestBuilder;
import o.createFromParcel;
import o.createNotification;
import o.getGreatNetworkIntervalandroid_sdk_base_release;
import o.getMaxSafeLeftInset;
import o.getMaxSafeTopInset;
import o.inCompatibilityMode;
import o.invokeSuspendlambda1;
import o.logLocationRecordedEvent;
import o.pageDowndefault;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc;
import o.r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI;
import o.r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs;
import o.r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4;
import o.setFontSizeR2X_6o;
import o.sourceInformationContextOfdefault;
import o.subscribeToSdkAuthenticationFailures;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public final class O$b {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public void MediaBrowserCompatMediaItem() {
        AssetManager assets;
        try {
            getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
            Object obj = getMaxSafeTopInset.MediaDescriptionCompat;
            getMaxSafeLeftInset getmaxsafeleftinset = obj != null ? (getMaxSafeLeftInset) obj : null;
            Context contextSerializer = getmaxsafeleftinset != null ? getmaxsafeleftinset.serializer() : null;
            if (contextSerializer == null || (assets = contextSerializer.getAssets()) == null) {
                throw new IOException("Platform applicationContext not initialized");
            }
            try {
                Object[] objArr = {assets, (String) this.read};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26243), (ViewConfiguration.getFadingEdgeLength() >> 16) + 37, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                }
                InputStream inputStream = (InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
                inputStream.getClass();
                GifDrawableTransformation gifDrawableTransformation = new GifDrawableTransformation(Okio.RemoteActionCompatParcelizer(inputStream));
                try {
                    RequestBuilder requestBuilderRemoteActionCompatParcelizer = gifDrawableTransformation.RemoteActionCompatParcelizer(gifDrawableTransformation.MediaSessionCompatResultReceiverWrapper());
                    RequestBuilder requestBuilderRemoteActionCompatParcelizer2 = gifDrawableTransformation.RemoteActionCompatParcelizer(gifDrawableTransformation.MediaSessionCompatResultReceiverWrapper());
                    gifDrawableTransformation.close();
                    synchronized (this) {
                        requestBuilderRemoteActionCompatParcelizer.getClass();
                        this.serializer = requestBuilderRemoteActionCompatParcelizer;
                        requestBuilderRemoteActionCompatParcelizer2.getClass();
                        this.IconCompatParcelizer = requestBuilderRemoteActionCompatParcelizer2;
                    }
                    ((CountDownLatch) this.RemoteActionCompatParcelizer).countDown();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{gifDrawableTransformation, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause == null) {
                    throw th3;
                }
                throw cause;
            }
        } catch (Throwable th4) {
            ((CountDownLatch) this.RemoteActionCompatParcelizer).countDown();
            throw th4;
        }
    }

    public O$b(FwFClientExtensionKt fwFClientExtensionKt) {
        this.IconCompatParcelizer = fwFClientExtensionKt;
        this.write = new short[2];
        Class cls = Short.TYPE;
        this.RemoteActionCompatParcelizer = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.serializer = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.read = new short[Fields.RotationX];
    }

    public static final Object access$proceedWithJsInject(O$b o$b, WebView webView, String str, RxConvertKt$asFlow$1 rxConvertKt$asFlow$1) throws Throwable {
        int i = 2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("window.storeToken('", str, "');");
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(MainDispatcherLoader.read, new PhotoIdUiModelImpl$1$1(webView, strM, null, 27), rxConvertKt$asFlow$1);
        if (objWithContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createFromParcel.INSTANCE;
        }
        int i2 = MediaBrowserCompatMediaItem + 111;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 95;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objWithContext;
    }

    public void ParcelableVolumeInfo() {
        int i = 2 % 2;
        short[][] sArr = (short[][]) this.RemoteActionCompatParcelizer;
        FwFClientConfigKt.write((short[]) this.write);
        int i2 = MediaMetadataCompat + 79;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = 0;
        for (short[] sArr2 : sArr) {
            FwFClientConfigKt.write(sArr2);
        }
        while (i4 < sArr.length) {
            int i5 = MediaBrowserCompatMediaItem + 75;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                FwFClientConfigKt.write(((short[][]) this.serializer)[i4]);
                i4 += 78;
            } else {
                FwFClientConfigKt.write(((short[][]) this.serializer)[i4]);
                i4++;
            }
        }
        FwFClientConfigKt.write((short[]) this.read);
    }

    public O$b(GetApplicantAccessTokenUseCaseImpl getApplicantAccessTokenUseCaseImpl, zzz zzzVar, pageDowndefault pagedowndefault, Lazy lazy, subscribeToSdkAuthenticationFailures subscribetosdkauthenticationfailures, inCompatibilityMode incompatibilitymode) {
        lazy.getClass();
        this.write = getApplicantAccessTokenUseCaseImpl;
        this.RemoteActionCompatParcelizer = zzzVar;
        this.serializer = pagedowndefault;
        this.read = lazy;
        this.IconCompatParcelizer = subscribetosdkauthenticationfailures;
    }

    public logLocationRecordedEvent RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 75;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (((Byte) this.RemoteActionCompatParcelizer) != null) {
            int i5 = i3 + 93;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (((Long) this.write) != null) {
                int i7 = i3 + 15;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (((ArrayList) this.serializer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'base_offsets' is missing");
                } else {
                    if (((List) this.read) != null) {
                        return new logLocationRecordedEvent(this);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'i32_measurements' is missing");
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'base_timestamp' is missing");
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
        }
        return null;
    }

    public O$b(int i) {
        if (i != 17) {
            this.IconCompatParcelizer = (byte) 0;
            return;
        }
        this.write = new AtomicBoolean(false);
        this.RemoteActionCompatParcelizer = new CountDownLatch(1);
        this.read = "PublicSuffixDatabase.list";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        return r1.RemoteActionCompatParcelizer(((short[][]) r4.RemoteActionCompatParcelizer)[r5]) / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r1.RemoteActionCompatParcelizer(((short[][]) r4.RemoteActionCompatParcelizer)[r5]) + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r1.IconCompatParcelizer(r3, 1) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        return r1.RemoteActionCompatParcelizer(((short[][]) r4.serializer)[r5]) + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        return r1.RemoteActionCompatParcelizer((short[]) r4.read) + 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r1.IconCompatParcelizer(r3, 0) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r1.IconCompatParcelizer(r3, 0) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r2 = com.sentiance.core.model.thrift.O$b.MediaBrowserCompatMediaItem + 73;
        com.sentiance.core.model.thrift.O$b.MediaMetadataCompat = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int RemoteActionCompatParcelizer(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.sentiance.core.model.thrift.O$b.MediaBrowserCompatMediaItem
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.sentiance.core.model.thrift.O$b.MediaMetadataCompat = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.Object r1 = r4.IconCompatParcelizer
            o.FwFClientExtensionKt r1 = (o.FwFClientExtensionKt) r1
            o.FwFClientConfigKt r1 = r1.ParcelableVolumeInfo
            java.lang.Object r3 = r4.write
            short[] r3 = (short[]) r3
            int r2 = r1.IconCompatParcelizer(r3, r2)
            if (r2 != 0) goto L53
            goto L30
        L20:
            java.lang.Object r1 = r4.IconCompatParcelizer
            o.FwFClientExtensionKt r1 = (o.FwFClientExtensionKt) r1
            o.FwFClientConfigKt r1 = r1.ParcelableVolumeInfo
            java.lang.Object r3 = r4.write
            short[] r3 = (short[]) r3
            int r2 = r1.IconCompatParcelizer(r3, r2)
            if (r2 != 0) goto L53
        L30:
            int r2 = com.sentiance.core.model.thrift.O$b.MediaBrowserCompatMediaItem
            int r2 = r2 + 73
            int r3 = r2 % 128
            com.sentiance.core.model.thrift.O$b.MediaMetadataCompat = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L47
            java.lang.Object r2 = r4.RemoteActionCompatParcelizer
            short[][] r2 = (short[][]) r2
            r5 = r2[r5]
            int r5 = r1.RemoteActionCompatParcelizer(r5)
            int r5 = r5 / r0
            return r5
        L47:
            java.lang.Object r2 = r4.RemoteActionCompatParcelizer
            short[][] r2 = (short[][]) r2
            r5 = r2[r5]
            int r5 = r1.RemoteActionCompatParcelizer(r5)
            int r5 = r5 + r0
            return r5
        L53:
            r0 = 1
            int r0 = r1.IconCompatParcelizer(r3, r0)
            if (r0 != 0) goto L67
            java.lang.Object r0 = r4.serializer
            short[][] r0 = (short[][]) r0
            r5 = r0[r5]
            int r5 = r1.RemoteActionCompatParcelizer(r5)
            int r5 = r5 + 10
            return r5
        L67:
            java.lang.Object r5 = r4.read
            short[] r5 = (short[]) r5
            int r5 = r1.RemoteActionCompatParcelizer(r5)
            int r5 = r5 + 18
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.core.model.thrift.O$b.RemoteActionCompatParcelizer(int):int");
    }

    public r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI write() {
        int i = 2 % 2;
        if (((Long) this.write) != null) {
            if (((Long) this.RemoteActionCompatParcelizer) != null) {
                if (((Integer) this.serializer) != null) {
                    r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r8lambdanpc69wzeqaei66oxsnhlebhusqi = new r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI(this);
                    int i2 = MediaMetadataCompat + 57;
                    MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return r8lambdanpc69wzeqaei66oxsnhlebhusqi;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'steps' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'end_time' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start_time' is missing");
        int i4 = MediaMetadataCompat + 73;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public createNotification RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 103;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (((TimeSeriesType) this.RemoteActionCompatParcelizer) != null) {
            return new createNotification(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
        int i3 = MediaMetadataCompat + 123;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc serializer() {
        int i = 2 % 2;
        if (((String) this.read) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stationary_unique_id' is missing");
            return null;
        }
        if (((Byte) this.write) != null) {
            if (((List) this.RemoteActionCompatParcelizer) != null) {
                r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc r8lambdagn7c5ha_lryxg0qpuqgwsic0hc = new r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc(this);
                int i2 = MediaBrowserCompatMediaItem + 27;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return r8lambdagn7c5ha_lryxg0qpuqgwsic0hc;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'venues' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'venue_significance' is missing");
        int i4 = MediaBrowserCompatMediaItem + 37;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return null;
        }
        int i5 = 3 / 3;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 111;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
            if (((Integer) this.write) != null) {
                if (((HashMap) this.RemoteActionCompatParcelizer) != null) {
                    return new r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'confidences' is missing");
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'duration_millis' is missing");
                int i4 = MediaMetadataCompat + 31;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } else if (((Integer) this.write) != null) {
            if (((HashMap) this.RemoteActionCompatParcelizer) != null) {
                return new r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'confidences' is missing");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'duration_millis' is missing");
            int i6 = MediaMetadataCompat + 31;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = MediaBrowserCompatMediaItem + 57;
        MediaMetadataCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    public invokeSuspendlambda1 read() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 25;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        if (((Long) this.write) != null) {
            int i5 = i3 + 59;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 25 / 0;
                if (((Boolean) this.RemoteActionCompatParcelizer) != null) {
                    if (((Boolean) this.IconCompatParcelizer) != null) {
                        return new invokeSuspendlambda1(this);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'was_crash_detected_by_sdk' is missing");
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_crash' is missing");
                }
            } else if (((Boolean) this.RemoteActionCompatParcelizer) != null) {
                if (((Boolean) this.IconCompatParcelizer) != null) {
                    return new invokeSuspendlambda1(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'was_crash_detected_by_sdk' is missing");
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_crash' is missing");
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'crash_event_time' is missing");
            int i7 = MediaMetadataCompat + 17;
            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        int i9 = MediaMetadataCompat + 97;
        MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
        Object obj = null;
        if (i9 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public BrazeUser IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 83;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (((Byte) this.RemoteActionCompatParcelizer) != null) {
                if (((Long) this.write) != null) {
                    if (((ArrayList) this.serializer) == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'base_offsets' is missing");
                    } else {
                        int i4 = i3 + 65;
                        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            if (((ArrayList) this.read) != null) {
                                return new BrazeUser(this);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'i32_measurements' is missing");
                        } else {
                            obj.hashCode();
                            throw null;
                        }
                    }
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'base_timestamp' is missing");
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
            }
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 MediaDescriptionCompat() {
        r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 r8lambdasscpazklpwhzf7qziwqx9zu4wp4;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 45;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
            if (((Long) this.write) != null) {
                if (((DetectionTrigger) this.RemoteActionCompatParcelizer) != null) {
                    r8lambdasscpazklpwhzf7qziwqx9zu4wp4 = new r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4(this);
                    i = MediaMetadataCompat + 95;
                    MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        return r8lambdasscpazklpwhzf7qziwqx9zu4wp4;
                    }
                    throw null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'trip_open_trigger' is missing");
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start' is missing");
            }
        } else if (((Long) this.write) != null) {
            if (((DetectionTrigger) this.RemoteActionCompatParcelizer) != null) {
                r8lambdasscpazklpwhzf7qziwqx9zu4wp4 = new r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4(this);
                i = MediaMetadataCompat + 95;
                MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    return r8lambdasscpazklpwhzf7qziwqx9zu4wp4;
                }
                throw null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'trip_open_trigger' is missing");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start' is missing");
        }
        return null;
    }

    public getGreatNetworkIntervalandroid_sdk_base_release MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 69;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (((Short) this.RemoteActionCompatParcelizer) != null) {
            int i5 = i3 + 123;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (((Long) this.write) != null) {
                int i6 = i3 + 95;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    throw null;
                }
                if (((Long) this.serializer) != null) {
                    return new getGreatNetworkIntervalandroid_sdk_base_release(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'current_marker_epoch' is missing");
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'time_horizon' is missing");
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
        }
        return null;
    }

    public O$b() {
    }
}
