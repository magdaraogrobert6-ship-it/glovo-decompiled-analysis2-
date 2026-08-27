package com.roadrunner.rider.support.implementation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
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
public final class RiderSupportFeaturesImpl$verifyHookIntegrity$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ SystemLifecycleSystemLifecycleCallback RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RiderSupportFeaturesImpl$verifyHookIntegrity$1(SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = systemLifecycleSystemLifecycleCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 13;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = this.IconCompatParcelizer;
        SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            return new RiderSupportFeaturesImpl$verifyHookIntegrity$1(systemLifecycleSystemLifecycleCallback, shortNewsContentCardView, 0);
        }
        int i5 = 1;
        if (i4 != 1) {
            return new RiderSupportFeaturesImpl$verifyHookIntegrity$1(systemLifecycleSystemLifecycleCallback, shortNewsContentCardView, i);
        }
        RiderSupportFeaturesImpl$verifyHookIntegrity$1 riderSupportFeaturesImpl$verifyHookIntegrity$1 = new RiderSupportFeaturesImpl$verifyHookIntegrity$1(systemLifecycleSystemLifecycleCallback, shortNewsContentCardView, i5);
        int i6 = write + 31;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return riderSupportFeaturesImpl$verifyHookIntegrity$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 25;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            ((RiderSupportFeaturesImpl$verifyHookIntegrity$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        if (i3 == 1) {
            ((RiderSupportFeaturesImpl$verifyHookIntegrity$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        ((RiderSupportFeaturesImpl$verifyHookIntegrity$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = write + 109;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel2;
        }
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 69;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback = this.RemoteActionCompatParcelizer;
        Object obj2 = null;
        try {
            if (i4 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object[] objArr = {systemLifecycleSystemLifecycleCallback};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1673128143);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (3103 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 4856 - (ViewConfiguration.getWindowTouchSlop() >> 8), (-16777203) - Color.rgb(0, 0, 0), -1284912850, false, "write", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3103), 4856 - Gravity.getAbsoluteGravity(0, 0), 13 - ExpandableListView.getPackedPositionType(0L))});
                }
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
                firebaseRemoteConfigImpl.getClass();
                if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_LOGIN_LOGGER_FAILURE_TRACKING_ENABLED)) {
                    int i5 = write + 31;
                    serializer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        try {
                            Object[] objArr2 = {systemLifecycleSystemLifecycleCallback};
                            Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-76260484);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (3104 - View.MeasureSpec.makeMeasureSpec(0, 0)), Color.blue(0) + 4856, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, 732199581, false, "serializer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (3103 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.resolveSize(0, 0) + 4856, (ViewConfiguration.getPressedStateDuration() >> 16) + 13)});
                            }
                            ((canReadAppSetId) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr2)).read();
                            obj2.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    Object[] objArr3 = {systemLifecycleSystemLifecycleCallback};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-76260484);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (3104 - (Process.myPid() >> 22)), 4855 - MotionEvent.axisFromString(""), 13 - ExpandableListView.getPackedPositionType(0L), 732199581, false, "serializer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (Color.alpha(0) + 3104), 4855 - MotionEvent.axisFromString(""), Color.blue(0) + 13)});
                    }
                    ((canReadAppSetId) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr3)).read();
                }
                return createfromparcel;
            }
            if (i4 != 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object[] objArr4 = {systemLifecycleSystemLifecycleCallback};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1673128143);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (3103 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf((CharSequence) "", '0') + 4857, View.resolveSizeAndState(0, 0, 0) + 13, -1284912850, false, "write", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (3104 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), ImageFormat.getBitsPerPixel(0) + 4857, AndroidCharacter.getMirror('0') - '#')});
                }
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr4);
                firebaseRemoteConfigImpl2.getClass();
                if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_LOGIN_LOGGER_SUCCESS_TRACKING_ENABLED)) {
                    int i6 = write + 55;
                    serializer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        Object[] objArr5 = {systemLifecycleSystemLifecycleCallback};
                        Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-76260484);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 3105), View.resolveSize(0, 0) + 4856, KeyEvent.getDeadChar(0, 0) + 13, 732199581, false, "serializer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (3104 - (ViewConfiguration.getTouchSlop() >> 8)), 4856 - Color.green(0), 12 - MotionEvent.axisFromString(""))});
                        }
                        ((canReadAppSetId) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr5)).MediaSessionCompatQueueItem();
                        throw null;
                    }
                    Object[] objArr6 = {systemLifecycleSystemLifecycleCallback};
                    Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-76260484);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (3104 - Drawable.resolveOpacity(0, 0)), 4856 - View.resolveSize(0, 0), Color.alpha(0) + 13, 732199581, false, "serializer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (3105 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4856, TextUtils.getOffsetBefore("", 0) + 13)});
                    }
                    ((canReadAppSetId) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr6)).MediaSessionCompatQueueItem();
                }
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object[] objArr7 = {systemLifecycleSystemLifecycleCallback};
            Object objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1673128143);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3103), (ViewConfiguration.getWindowTouchSlop() >> 8) + 4856, Color.argb(0, 0, 0, 0) + 13, -1284912850, false, "write", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (3104 - KeyEvent.normalizeMetaState(0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4856, 13 - Drawable.resolveOpacity(0, 0))});
            }
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl3 = (FirebaseRemoteConfigImpl) ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr7);
            firebaseRemoteConfigImpl3.getClass();
            if (firebaseRemoteConfigImpl3.IconCompatParcelizer(updateAdidI.IS_LOGIN_LOGGER_FALLBACK_ENABLED)) {
                int i7 = serializer + 75;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    Object[] objArr8 = {systemLifecycleSystemLifecycleCallback};
                    Object objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-76260484);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        objRemoteActionCompatParcelizer8 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3104), 4856 - TextUtils.indexOf("", ""), 12 - ImageFormat.getBitsPerPixel(0), 732199581, false, "serializer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (3104 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), KeyEvent.getDeadChar(0, 0) + 4856, ExpandableListView.getPackedPositionType(0L) + 13)});
                    }
                    ((canReadAppSetId) ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr8)).IconCompatParcelizer();
                    obj2.hashCode();
                    throw null;
                }
                Object[] objArr9 = {systemLifecycleSystemLifecycleCallback};
                Object objRemoteActionCompatParcelizer9 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-76260484);
                if (objRemoteActionCompatParcelizer9 == null) {
                    objRemoteActionCompatParcelizer9 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3104), ImageFormat.getBitsPerPixel(0) + 4857, ExpandableListView.getPackedPositionChild(0L) + 14, 732199581, false, "serializer", new Class[]{(Class) setFontSizeR2X_6o.IconCompatParcelizer((char) (AndroidCharacter.getMirror('0') + 3056), TextUtils.indexOf("", "", 0) + 4856, ExpandableListView.getPackedPositionGroup(0L) + 13)});
                }
                ((canReadAppSetId) ((Method) objRemoteActionCompatParcelizer9).invoke(null, objArr9)).IconCompatParcelizer();
            }
            return createfromparcel;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }
}
