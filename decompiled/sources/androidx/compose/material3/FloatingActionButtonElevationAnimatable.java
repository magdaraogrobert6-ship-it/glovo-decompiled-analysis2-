package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.internal.ElevationKt;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BottomSheetScaffoldKtStandardBottomSheet3;
import o.Button;
import o.UiMediaScopePosture;
import o.accessgetFlatcp;
import o.createFromParcel;
import o.onShowTranslationui;
import o.requiredWidth3ABfNKs;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingActionButtonElevationAnimatable {
    public float IconCompatParcelizer;
    public o.ButtonDefaults MediaDescriptionCompat;
    public float RatingCompat;
    public float RemoteActionCompatParcelizer;
    public o.ButtonDefaults read;
    public final Animatable serializer;
    public float write;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [o.ButtonDefaults] */
    /* JADX WARN: Type inference failed for: r6v1, types: [o.ButtonDefaults] */
    /* JADX WARN: Type inference failed for: r6v2, types: [o.ButtonDefaults] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, o.createFromParcel] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Object animateElevation(o.ButtonDefaults buttonDefaults, ContinuationImpl continuationImpl) {
        UiMediaScopePosture uiMediaScopePosture;
        float f;
        ?? r6;
        Animatable animatable = this.serializer;
        if (continuationImpl instanceof UiMediaScopePosture) {
            uiMediaScopePosture = (UiMediaScopePosture) continuationImpl;
            int i = uiMediaScopePosture.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                uiMediaScopePosture.write = i - Integer.MIN_VALUE;
            } else {
                uiMediaScopePosture = new UiMediaScopePosture(this, continuationImpl);
            }
        } else {
            uiMediaScopePosture = new UiMediaScopePosture(this, continuationImpl);
        }
        Object obj = uiMediaScopePosture.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = uiMediaScopePosture.write;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (buttonDefaults instanceof Button) {
                    f = this.RatingCompat;
                } else if (buttonDefaults instanceof o.ButtonKt) {
                    f = this.IconCompatParcelizer;
                } else {
                    f = buttonDefaults instanceof BottomSheetScaffoldKtStandardBottomSheet3 ? this.write : this.RemoteActionCompatParcelizer;
                }
                this.MediaDescriptionCompat = buttonDefaults;
                r6 = buttonDefaults;
                if (!Dp.m3678equalsimpl0(((Dp) ((onShowTranslationui) animatable.RatingCompat).getValue()).m3687unboximpl(), f)) {
                    o.ButtonDefaults buttonDefaults2 = this.read;
                    uiMediaScopePosture.RemoteActionCompatParcelizer = buttonDefaults;
                    uiMediaScopePosture.write = 1;
                    if (ElevationKt.m135animateElevationrAjV9yQ(animatable, f, buttonDefaults2, buttonDefaults, uiMediaScopePosture) == coroutineSingletons) {
                        r6 = buttonDefaults;
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o.ButtonDefaults buttonDefaults3 = uiMediaScopePosture.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                r6 = buttonDefaults3;
            }
            r6 = buttonDefaults;
            this.read = r6;
            buttonDefaults = createFromParcel.INSTANCE;
            return buttonDefaults;
        } catch (Throwable th) {
            this.read = buttonDefaults;
            throw th;
        }
    }

    public FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.RemoteActionCompatParcelizer = f;
        this.RatingCompat = f2;
        this.IconCompatParcelizer = f3;
        this.write = f4;
        this.serializer = new Animatable(Dp.m3671boximpl(f), requiredWidth3ABfNKs.RemoteActionCompatParcelizer, (Object) null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object snapElevation(ContinuationImpl continuationImpl) {
        accessgetFlatcp accessgetflatcp;
        float f;
        if (continuationImpl instanceof accessgetFlatcp) {
            accessgetflatcp = (accessgetFlatcp) continuationImpl;
            int i = accessgetflatcp.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessgetflatcp.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                accessgetflatcp = new accessgetFlatcp(this, continuationImpl);
            }
        } else {
            accessgetflatcp = new accessgetFlatcp(this, continuationImpl);
        }
        Object obj = accessgetflatcp.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accessgetflatcp.IconCompatParcelizer;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                o.ButtonDefaults buttonDefaults = this.MediaDescriptionCompat;
                if (buttonDefaults instanceof Button) {
                    f = this.RatingCompat;
                } else if (buttonDefaults instanceof o.ButtonKt) {
                    f = this.IconCompatParcelizer;
                } else {
                    f = buttonDefaults instanceof BottomSheetScaffoldKtStandardBottomSheet3 ? this.write : this.RemoteActionCompatParcelizer;
                }
                Animatable animatable = this.serializer;
                if (!Dp.m3678equalsimpl0(((Dp) ((onShowTranslationui) animatable.RatingCompat).getValue()).m3687unboximpl(), f)) {
                    Dp dpM3671boximpl = Dp.m3671boximpl(f);
                    accessgetflatcp.IconCompatParcelizer = 1;
                    if (animatable.snapTo(dpM3671boximpl, accessgetflatcp) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return createFromParcel.INSTANCE;
            }
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.read = this.MediaDescriptionCompat;
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            this.read = this.MediaDescriptionCompat;
            throw th;
        }
    }
}
