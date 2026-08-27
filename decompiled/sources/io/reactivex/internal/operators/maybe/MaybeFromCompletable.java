package io.reactivex.internal.operators.maybe;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.rider.support.implementation.data.RiderSupportFeature;
import com.roadrunner.rider.support.implementation.data.RiderSupportFeature$Companion$logIn$1;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.accessstartTrackingTable;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setFontSizeR2X_6o;
import o.toViewVelocity;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeFromCompletable<T> extends Maybe<T> {
    public final CompletableSource write;

    public static final class FromCompletableObserver<T> implements CompletableObserver, Disposable {
        private static short[] MediaMetadataCompat;
        public final MaybeObserver IconCompatParcelizer;
        public Disposable serializer;
        private static final byte[] $$b = {21, -17, 79, 99};
        private static final int $$c = 72;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int MediaDescriptionCompat = 0;
        private static int RatingCompat = 1;
        private static int RemoteActionCompatParcelizer = 1134582869;
        private static int write = 459299272;
        private static int read = 558896146;
        private static byte[] MediaBrowserCompatMediaItem = {38, 47, -106, 110, 103, -123, -107, -48, 40, 107, 101, -111, -108, -119, 49};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$d(short r7, int r8, int r9) {
            /*
                int r9 = r9 * 4
                int r9 = 3 - r9
                int r8 = 115 - r8
                int r7 = r7 * 4
                int r7 = r7 + 1
                byte[] r0 = io.reactivex.internal.operators.maybe.MaybeFromCompletable.FromCompletableObserver.$$b
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r8 = r9
                r5 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                int r9 = r9 + 1
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r6
            L2a:
                int r3 = -r3
                int r9 = r9 + r3
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.maybe.MaybeFromCompletable.FromCompletableObserver.$$d(short, int, int):java.lang.String");
        }

        public FromCompletableObserver(MaybeObserver maybeObserver) {
            this.IconCompatParcelizer = maybeObserver;
        }

        public static void $$a(Context context, long j, long j2) throws Throwable {
            int i = 2 % 2;
            long j3 = j ^ (j2 << 32);
            RiderSupportFeature.Companion companion = RiderSupportFeature.Companion;
            Object obj = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
            Object[] objArr = new Object[1];
            a((byte) TextUtils.indexOf("", "", 0), (short) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) - 93, (-976244020) + (ViewConfiguration.getKeyRepeatDelay() >> 16), (-1488979393) - View.MeasureSpec.getMode(0), objArr);
            String str = (String) objArr[0];
            int i2 = MediaDescriptionCompat + 57;
            int i3 = i2 % Fields.SpotShadowColor;
            RatingCompat = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {Long.valueOf(j3), str};
                Object[] objArr3 = new Object[1];
                a((byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-93) - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 976243993, ExpandableListView.getPackedPositionChild(0L) - 1488979378, objArr3);
                Method method = af$$ExternalSyntheticOutline0.class.getMethod((String) objArr3[0], Long.TYPE, String.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, objArr2);
                int i7 = MediaDescriptionCompat + 9;
                RatingCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                Object[] objArr4 = {objInvoke, 10};
                Constructor declaredConstructor = accessstartTrackingTable.class.getDeclaredConstructor(String.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
                Object[] objArr5 = {declaredConstructor.newInstance(objArr4)};
                Method method2 = Timber.Forest.class.getMethod("write", Throwable.class);
                method2.setAccessible(true);
                method2.invoke(obj, objArr5);
                getContentViewGroupParentLayout getcontentviewgroupparentlayoutAccess$getCoroutineScope$cp = RiderSupportFeature.access$getCoroutineScope$cp();
                int i9 = MediaDescriptionCompat + 115;
                RatingCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                Constructor declaredConstructor2 = RiderSupportFeature$Companion$logIn$1.class.getDeclaredConstructor(Context.class, ShortNewsContentCardView.class);
                declaredConstructor2.setAccessible(true);
                Object[] objArr6 = {getcontentviewgroupparentlayoutAccess$getCoroutineScope$cp, null, null, declaredConstructor2.newInstance(context, null), 3};
                Method method3 = BuildersKt.class.getMethod("RemoteActionCompatParcelizer", getContentViewGroupParentLayout.class, TextAnnouncementContentCardView.class, CoroutineStart.class, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0.class, Integer.TYPE);
                method3.setAccessible(true);
                method3.invoke(null, objArr6);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 59;
            RatingCompat = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.serializer.isDisposed();
                obj.hashCode();
                throw null;
            }
            boolean zIsDisposed = this.serializer.isDisposed();
            int i3 = RatingCompat + 35;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return zIsDisposed;
            }
            obj.hashCode();
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 27;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.serializer.dispose();
            this.serializer = DisposableHelper.DISPOSED;
            int i4 = MediaDescriptionCompat + 39;
            RatingCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 47;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                this.serializer = DisposableHelper.DISPOSED;
                this.IconCompatParcelizer.onComplete();
                int i3 = 58 / 0;
            } else {
                this.serializer = DisposableHelper.DISPOSED;
                this.IconCompatParcelizer.onComplete();
            }
            int i4 = MediaDescriptionCompat + 91;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 63;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.serializer = DisposableHelper.DISPOSED;
            this.IconCompatParcelizer.onError(th);
            int i4 = MediaDescriptionCompat + 107;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            int i = 2 % 2;
            if (DisposableHelper.validate(this.serializer, disposable)) {
                int i2 = MediaDescriptionCompat + 41;
                RatingCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                this.serializer = disposable;
                this.IconCompatParcelizer.onSubscribe(this);
            }
            int i4 = MediaDescriptionCompat + 51;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }

        private static void a(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2;
            int i5 = 2 % 2;
            toViewVelocity toviewvelocity = new toViewVelocity();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(write)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (Color.red(0) + 15495), 2822 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 16 - MotionEvent.axisFromString(""), 1193962993, false, $$d(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                int i6 = iIntValue == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = MediaBrowserCompatMediaItem;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i7 = 0;
                        while (i7 < length) {
                            int i8 = $10 + 13;
                            $11 = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % i4;
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-748751776);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 + 2);
                                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (4453 - (ViewConfiguration.getLongPressTimeout() >> 16)), 2484 - Drawable.resolveOpacity(0, 0), View.resolveSize(0, 0) + 18, 59692417, false, $$d(b4, b5, (byte) (b5 - 2)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                            i7++;
                            i4 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = MediaBrowserCompatMediaItem;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(RemoteActionCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (15495 - (Process.myTid() >> 22)), 2820 - TextUtils.lastIndexOf("", '0', 0), 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1193962993, false, $$d(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ (-565326573115254380L))) + ((int) (((long) write) ^ (-565326573115254380L))));
                    } else {
                        iIntValue = (short) (((short) (((long) MediaMetadataCompat[i3 + ((int) (((long) RemoteActionCompatParcelizer) ^ (-565326573115254380L)))]) ^ (-565326573115254380L))) + ((int) (((long) write) ^ (-565326573115254380L))));
                    }
                }
                if (iIntValue > 0) {
                    int i10 = $10 + 115;
                    $11 = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    toviewvelocity.RemoteActionCompatParcelizer = ((i3 + iIntValue) - 2) + ((int) (((long) RemoteActionCompatParcelizer) ^ (-565326573115254380L))) + i6;
                    Object[] objArr5 = {toviewvelocity, Integer.valueOf(i2), Integer.valueOf(read), sb};
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1760519764);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getTapTimeout() >> 16) + 2411, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, 1203812429, false, $$d(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(toviewvelocity.serializer);
                    toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                    byte[] bArr4 = MediaBrowserCompatMediaItem;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) ^ (-565326573115254380L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    toviewvelocity.read = 1;
                    while (toviewvelocity.read < iIntValue) {
                        if (z) {
                            byte[] bArr6 = MediaBrowserCompatMediaItem;
                            int i13 = toviewvelocity.RemoteActionCompatParcelizer;
                            toviewvelocity.RemoteActionCompatParcelizer = i13 - 1;
                            toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((byte) (((byte) (((long) bArr6[i13]) ^ (-565326573115254380L))) + s)) ^ b));
                            int i14 = $10 + 1;
                            $11 = i14 % Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                        } else {
                            short[] sArr = MediaMetadataCompat;
                            int i16 = toviewvelocity.RemoteActionCompatParcelizer;
                            toviewvelocity.RemoteActionCompatParcelizer = i16 - 1;
                            toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((short) (((short) (((long) sArr[i16]) ^ (-565326573115254380L))) + s)) ^ b));
                        }
                        sb.append(toviewvelocity.serializer);
                        toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                        toviewvelocity.read++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.write.subscribe(new FromCompletableObserver(maybeObserver));
    }

    public MaybeFromCompletable(Completable completable) {
        this.write = completable;
    }
}
