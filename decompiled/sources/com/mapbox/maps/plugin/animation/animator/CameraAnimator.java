package com.mapbox.maps.plugin.animation.animator;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Lambda;
import o.DrawableTransformation;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CameraAnimator extends ValueAnimator {
    public static final ScreenCoordinate ZERO_SCREEN_COORDINATE = new ScreenCoordinate(0.0d, 0.0d);
    public boolean canceled;
    public boolean endedManually;
    public final TypeEvaluator evaluator;
    public CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 internalListener;
    public CompassViewPlugin$$ExternalSyntheticLambda0 internalUpdateListener;
    public boolean isInternal;
    public String owner;
    public boolean registered;
    public boolean skipped;
    public final Object startValue;
    public final Object[] targets;
    public final CopyOnWriteArraySet userListeners;
    public final CopyOnWriteArraySet userUpdateListeners;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$addListener$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public final /* synthetic */ Animator.AnimatorListener $listener;
        public final /* synthetic */ int $r8$classId = 1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Animator.AnimatorListener animatorListener, CameraAnimator cameraAnimator) {
            super(0);
            this.$listener = animatorListener;
            CameraAnimator.this = cameraAnimator;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            CameraAnimator cameraAnimator = CameraAnimator.this;
            Animator.AnimatorListener animatorListener = this.$listener;
            if (i == 0) {
                if (cameraAnimator.internalListener != null) {
                    CameraAnimator.super.addListener(animatorListener);
                }
                cameraAnimator.userListeners.add(animatorListener);
                return createfromparcel;
            }
            CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 = cameraAnimator.internalListener;
            CopyOnWriteArraySet copyOnWriteArraySet = cameraAnimator.userListeners;
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{animatorListener, compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1}, iWrite3)).booleanValue()) {
                CameraAnimator.super.removeListener(animatorListener);
            }
            if (copyOnWriteArraySet.contains(animatorListener)) {
                copyOnWriteArraySet.remove(animatorListener);
            }
            return createfromparcel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Animator.AnimatorListener animatorListener) {
            super(0);
            this.$listener = animatorListener;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$addUpdateListener$1, reason: invalid class name and case insensitive filesystem */
    public final class C01391 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public final /* synthetic */ ValueAnimator.AnimatorUpdateListener $listener;
        public final /* synthetic */ int $r8$classId = 1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01391(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, CameraAnimator cameraAnimator) {
            super(0);
            this.$listener = animatorUpdateListener;
            CameraAnimator.this = cameraAnimator;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            CameraAnimator cameraAnimator = CameraAnimator.this;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.$listener;
            if (i == 0) {
                if (cameraAnimator.internalUpdateListener != null) {
                    CameraAnimator.super.addUpdateListener(animatorUpdateListener);
                }
                cameraAnimator.userUpdateListeners.add(animatorUpdateListener);
                return createfromparcel;
            }
            CompassViewPlugin$$ExternalSyntheticLambda0 compassViewPlugin$$ExternalSyntheticLambda0 = cameraAnimator.internalUpdateListener;
            CopyOnWriteArraySet copyOnWriteArraySet = cameraAnimator.userUpdateListeners;
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{animatorUpdateListener, compassViewPlugin$$ExternalSyntheticLambda0}, iWrite3)).booleanValue()) {
                CameraAnimator.super.removeUpdateListener(animatorUpdateListener);
            }
            if (copyOnWriteArraySet.contains(animatorUpdateListener)) {
                copyOnWriteArraySet.remove(animatorUpdateListener);
            }
            return createfromparcel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01391(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            super(0);
            this.$listener = animatorUpdateListener;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.animator.CameraAnimator$end$1, reason: invalid class name and case insensitive filesystem */
    public final class C01401 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ CameraAnimator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C01401(CameraAnimator cameraAnimator, int i) {
            super(0);
            this.$r8$classId = i;
            this.this$0 = cameraAnimator;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            CameraAnimator cameraAnimator = this.this$0;
            if (i == 0) {
                cameraAnimator.endedManually = true;
                CameraAnimator.super.end();
                return createfromparcel;
            }
            if (i == 1) {
                cameraAnimator.cancel();
                return createfromparcel;
            }
            if (i == 2) {
                cameraAnimator.cancel();
                return createfromparcel;
            }
            if (i == 3) {
                cameraAnimator.canceled = true;
                CameraAnimator.super.cancel();
                return createfromparcel;
            }
            if (i != 4) {
                CameraAnimator.super.removeAllUpdateListeners();
                CompassViewPlugin$$ExternalSyntheticLambda0 compassViewPlugin$$ExternalSyntheticLambda0 = cameraAnimator.internalUpdateListener;
                if (compassViewPlugin$$ExternalSyntheticLambda0 != null) {
                    CameraAnimator.super.addUpdateListener(compassViewPlugin$$ExternalSyntheticLambda0);
                }
                cameraAnimator.userUpdateListeners.clear();
                return createfromparcel;
            }
            CameraAnimator.super.removeAllListeners();
            CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 = cameraAnimator.internalListener;
            if (compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 != null) {
                CameraAnimator.super.addListener(compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1);
            }
            cameraAnimator.userListeners.clear();
            return createfromparcel;
        }
    }

    public abstract CameraAnimatorType getType();

    public final Object getAnimatedValueAt$plugin_animation_release(float f, CameraState cameraState) {
        Object center;
        Object[] objArr = this.targets;
        if (objArr.length != 1) {
            IBraze$$ExternalSyntheticBUOutline0.m("getAnimatedValueAt() is only supported for single target animations.");
            return null;
        }
        Object obj = this.startValue;
        if (obj == null && cameraState == null) {
            IBraze$$ExternalSyntheticBUOutline0.m("getAnimatedValueAt() is only supported for animators with a startValue or a non-null current camera state must be provided.");
            return null;
        }
        if (obj == null) {
            if (cameraState != null) {
                switch (WhenMappings.$EnumSwitchMapping$0[getType().ordinal()]) {
                    case 1:
                        center = cameraState.getCenter();
                        center.getClass();
                        break;
                    case 2:
                        center = Double.valueOf(cameraState.getZoom());
                        break;
                    case 3:
                        center = ZERO_SCREEN_COORDINATE;
                        break;
                    case 4:
                        center = cameraState.getPadding();
                        center.getClass();
                        break;
                    case 5:
                        center = Double.valueOf(cameraState.getBearing());
                        break;
                    case 6:
                        center = Double.valueOf(cameraState.getPitch());
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                }
                obj = center;
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
        }
        if (obj == null) {
            IBraze$$ExternalSyntheticBUOutline0.m("Could not resolve start value for animator");
            return null;
        }
        float interpolation = getInterpolator().getInterpolation(f);
        if (objArr.length != 0) {
            return this.evaluator.evaluate(interpolation, obj, objArr[objArr.length - 1]);
        }
        DrawableTransformation.write("Array is empty.");
        return null;
    }

    public final void removeInternalListener$plugin_animation_release() {
        super.removeListener(this.internalListener);
        this.internalListener = null;
        this.registered = false;
    }

    public final void removeInternalUpdateListener$plugin_animation_release() {
        super.removeUpdateListener(this.internalUpdateListener);
        this.internalUpdateListener = null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraAnimatorType.values().length];
            try {
                iArr[CameraAnimatorType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraAnimatorType.ZOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraAnimatorType.ANCHOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CameraAnimatorType.PADDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CameraAnimatorType.BEARING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CameraAnimatorType.PITCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CameraAnimator(TypeEvaluator typeEvaluator, CameraAnimatorOptions cameraAnimatorOptions) {
        typeEvaluator.getClass();
        this.evaluator = typeEvaluator;
        this.owner = cameraAnimatorOptions.owner;
        this.startValue = cameraAnimatorOptions.startValue;
        Object[] objArr = cameraAnimatorOptions.targets;
        this.targets = objArr;
        this.userUpdateListeners = new CopyOnWriteArraySet();
        this.userListeners = new CopyOnWriteArraySet();
        Object obj = objArr[0];
        setObjectValues(obj, obj);
        super.setEvaluator(typeEvaluator);
    }

    public final void addInternalUpdateListener$plugin_animation_release(CompassViewPlugin$$ExternalSyntheticLambda0 compassViewPlugin$$ExternalSyntheticLambda0) {
        super.removeAllUpdateListeners();
        this.internalUpdateListener = compassViewPlugin$$ExternalSyntheticLambda0;
        super.addUpdateListener(compassViewPlugin$$ExternalSyntheticLambda0);
        Iterator it = this.userUpdateListeners.iterator();
        while (it.hasNext()) {
            super.addUpdateListener((ValueAnimator.AnimatorUpdateListener) it.next());
        }
    }

    public Object[] resolveAnimationObjectValues(Object obj) {
        obj.getClass();
        Object[] objArr = this.targets;
        int length = objArr.length + 1;
        Object[] objArr2 = new Object[length];
        int i = 0;
        while (i < length) {
            objArr2[i] = i == 0 ? obj : objArr[i - 1];
            i++;
        }
        return objArr2;
    }

    @Override // android.animation.ValueAnimator
    public final void setObjectValues(Object... objArr) {
        objArr.getClass();
        super.setObjectValues(Arrays.copyOf(objArr, objArr.length));
    }

    public final void addInternalListener$plugin_animation_release(CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1) {
        super.removeAllListeners();
        this.registered = true;
        this.internalListener = compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1;
        super.addListener(compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1);
        Iterator it = this.userListeners.iterator();
        while (it.hasNext()) {
            super.addListener((Animator.AnimatorListener) it.next());
        }
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass1(animatorListener));
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C01391(animatorUpdateListener));
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass1(animatorListener, this));
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C01391(animatorUpdateListener, this));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C01401(this, 3));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void end() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C01401(this, 0));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C01401(this, 4));
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C01401(this, 5));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new SingleProcessDataStore$file$2(11, this));
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        if (getDuration() != 0 || getStartDelay() != 0) {
            Object animatedValue = super.getAnimatedValue();
            animatedValue.getClass();
            return animatedValue;
        }
        Object[] objArr = this.targets;
        objArr.getClass();
        if (objArr.length == 0) {
            DrawableTransformation.write("Array is empty.");
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        obj.getClass();
        return obj;
    }
}
