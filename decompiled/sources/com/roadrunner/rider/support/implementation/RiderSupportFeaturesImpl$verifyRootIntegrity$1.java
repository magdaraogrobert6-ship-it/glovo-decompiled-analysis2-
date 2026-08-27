package com.roadrunner.rider.support.implementation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.lang.reflect.Method;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.SystemLifecycleSystemLifecycleCallback;
import o.canReadAppSetId;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setFontSizeR2X_6o;
import o.updateAdidI;

/* JADX INFO: loaded from: classes5.dex */
public final class RiderSupportFeaturesImpl$verifyRootIntegrity$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ SystemLifecycleSystemLifecycleCallback serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RiderSupportFeaturesImpl$verifyRootIntegrity$1(SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.serializer = systemLifecycleSystemLifecycleCallback;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r0 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r0 = new com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1(r5, r9, 4);
        r9 = com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1.RemoteActionCompatParcelizer + 47;
        com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1.read = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if ((r9 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return new com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1(r5, r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != 3) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r8, o.ShortNewsContentCardView r9) {
        /*
            r7 = this;
            r8 = 2
            int r0 = r8 % r8
            int r0 = com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1.RemoteActionCompatParcelizer
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1.read = r1
            int r0 = r0 % r8
            r1 = 0
            r2 = 0
            r3 = 3
            r4 = 1
            if (r0 == 0) goto L22
            int r0 = r7.write
            o.SystemLifecycleSystemLifecycleCallback r5 = r7.serializer
            r6 = 85
            int r6 = r6 / r1
            if (r0 == 0) goto L62
            if (r0 == r4) goto L5c
            if (r0 == r8) goto L47
            if (r0 == r3) goto L41
            goto L2e
        L22:
            int r0 = r7.write
            o.SystemLifecycleSystemLifecycleCallback r5 = r7.serializer
            if (r0 == 0) goto L62
            if (r0 == r4) goto L5c
            if (r0 == r8) goto L47
            if (r0 == r3) goto L41
        L2e:
            com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1 r0 = new com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1
            r1 = 4
            r0.<init>(r5, r9, r1)
            int r9 = com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1.RemoteActionCompatParcelizer
            int r9 = r9 + 47
            int r1 = r9 % 128
            com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1.read = r1
            int r9 = r9 % r8
            if (r9 != 0) goto L40
            return r0
        L40:
            throw r2
        L41:
            com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1 r8 = new com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1
            r8.<init>(r5, r9, r3)
            return r8
        L47:
            com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1 r0 = new com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1
            r0.<init>(r5, r9, r8)
            int r9 = com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1.RemoteActionCompatParcelizer
            int r9 = r9 + 95
            int r1 = r9 % 128
            com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1.read = r1
            int r9 = r9 % r8
            if (r9 != 0) goto L58
            return r0
        L58:
            r2.hashCode()
            throw r2
        L5c:
            com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1 r8 = new com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1
            r8.<init>(r5, r9, r4)
            return r8
        L62:
            com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1 r8 = new com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1
            r8.<init>(r5, r9, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.support.implementation.RiderSupportFeaturesImpl$verifyRootIntegrity$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 95;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            ((RiderSupportFeaturesImpl$verifyRootIntegrity$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i4 == 1) {
            ((RiderSupportFeaturesImpl$verifyRootIntegrity$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                ((RiderSupportFeaturesImpl$verifyRootIntegrity$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                return createfromparcel;
            }
            ((RiderSupportFeaturesImpl$verifyRootIntegrity$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((RiderSupportFeaturesImpl$verifyRootIntegrity$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RemoteActionCompatParcelizer + 111;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback = this.serializer;
        Object obj2 = null;
        try {
            if (i4 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object[] objArr = {systemLifecycleSystemLifecycleCallback};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1673128143);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3104), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4856, 12 - TextUtils.lastIndexOf("", '0', 0, 0), -1284912850, false, "write", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (3104 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4855, 13 - TextUtils.indexOf("", ""))});
                }
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
                firebaseRemoteConfigImpl.getClass();
                if (!(!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_LOGIN_LOGGER_TRACKING_ENABLED))) {
                    Object[] objArr2 = {systemLifecycleSystemLifecycleCallback};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-76260484);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((Process.myPid() >> 22) + 3104), 4856 - KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetAfter("", 0) + 13, 732199581, false, "serializer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (3104 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 4856 - Color.argb(0, 0, 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12)});
                    }
                    ((canReadAppSetId) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr2)).serializer();
                }
                return createfromparcel;
            }
            if (i4 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object[] objArr3 = {systemLifecycleSystemLifecycleCallback};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1673128143);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (3104 - TextUtils.indexOf("", "", 0, 0)), 4857 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 13 - (ViewConfiguration.getTapTimeout() >> 16), -1284912850, false, "write", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (Color.green(0) + 3104), 4856 - KeyEvent.keyCodeFromString(""), 13 - Color.green(0))});
                }
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr3);
                firebaseRemoteConfigImpl2.getClass();
                if (!firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_LOGIN_LOGGER_FAILURE_DISABLED)) {
                    try {
                        Object[] objArr4 = {systemLifecycleSystemLifecycleCallback};
                        Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-76260484);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 3105), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4855, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13, 732199581, false, "serializer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (3104 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.red(0) + 4856, TextUtils.lastIndexOf("", '0', 0) + 14)});
                        }
                        ((canReadAppSetId) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr4)).write();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i5 = RemoteActionCompatParcelizer + 71;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return createfromparcel;
                }
                obj2.hashCode();
                throw null;
            }
            if (i4 == 2) {
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object[] objArr5 = {systemLifecycleSystemLifecycleCallback};
                Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1673128143);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (3104 - KeyEvent.normalizeMetaState(0)), 4855 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1284912850, false, "write", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionChild(0L) + 3105), 4856 - (ViewConfiguration.getJumpTapTimeout() >> 16), 13 - TextUtils.indexOf("", ""))});
                }
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl3 = (FirebaseRemoteConfigImpl) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr5);
                firebaseRemoteConfigImpl3.getClass();
                if (!firebaseRemoteConfigImpl3.IconCompatParcelizer(updateAdidI.IS_LOGIN_LOGGER_SUCCESS_DISABLED)) {
                    Object[] objArr6 = {systemLifecycleSystemLifecycleCallback};
                    Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-76260484);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 3105), 4856 - (Process.myPid() >> 22), 13 - Color.blue(0), 732199581, false, "serializer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 3104), 4856 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))});
                    }
                    ((canReadAppSetId) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr6)).RemoteActionCompatParcelizer();
                    int i6 = RemoteActionCompatParcelizer + 125;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
                return createfromparcel;
            }
            if (i4 != 3) {
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object[] objArr7 = {systemLifecycleSystemLifecycleCallback};
                Object objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1041119031);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (3104 - ExpandableListView.getPackedPositionType(0L)), 4856 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 14, 287435048, false, "RemoteActionCompatParcelizer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3104), 4856 - (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myTid() >> 22) + 13)});
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1193594313);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.getTrimmedLength(""), 4869 - TextUtils.indexOf("", "", 0), TextUtils.lastIndexOf("", '0') + 16, 1745556438, false, "serializer", new Class[0]);
                }
                ((Method) objRemoteActionCompatParcelizer8).invoke(objInvoke, null);
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                Object[] objArr8 = {systemLifecycleSystemLifecycleCallback};
                Object objRemoteActionCompatParcelizer9 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-76260484);
                if (objRemoteActionCompatParcelizer9 == null) {
                    objRemoteActionCompatParcelizer9 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3104), KeyEvent.keyCodeFromString("") + 4856, 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 732199581, false, "serializer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (3104 - KeyEvent.getDeadChar(0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4856, '=' - AndroidCharacter.getMirror('0'))});
                }
                ((canReadAppSetId) ((Method) objRemoteActionCompatParcelizer9).invoke(null, objArr8)).RemoteActionCompatParcelizer();
                return createfromparcel;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }
}
