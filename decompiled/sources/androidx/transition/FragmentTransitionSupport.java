package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.fragment.app.Fragment;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.zzw;
import com.huawei.location.logic.zp;
import com.logistics.rider.glovo.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.ColorSpaceVerificationHelperExternalSyntheticLambda0;
import o.CompositeShaderBrush;
import o.accessgetAutocp;
import o.accessgetModulateAlphacp;
import o.applyAsDouble;
import o.composeColorSpace;
import o.composeColorSpacelambda0;
import o.composeColorSpacelambda1;
import o.getOffscreenNrFUSI;
import o.toAndroidBlendModes9anfk8;

/* JADX INFO: loaded from: classes.dex */
public class FragmentTransitionSupport extends toAndroidBlendModes9anfk8 {
    @Override // o.toAndroidBlendModes9anfk8
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final boolean RemoteActionCompatParcelizer(Object obj) {
        boolean zIconCompatParcelizer = ((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj).IconCompatParcelizer();
        if (!zIconCompatParcelizer) {
            Objects.toString(obj);
        }
        return zIconCompatParcelizer;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final boolean read(Object obj) {
        return obj instanceof ColorSpaceVerificationHelperExternalSyntheticLambda0;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final Object IconCompatParcelizer(Object obj, Object obj2) {
        getOffscreenNrFUSI getoffscreennrfusi = new getOffscreenNrFUSI();
        if (obj != null) {
            getoffscreennrfusi.serializer((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj);
        }
        getoffscreennrfusi.serializer((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj2);
        return getoffscreennrfusi;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0047  */
    @Override // o.toAndroidBlendModes9anfk8
    public final void read(float f, Object obj) {
        long j;
        CompositeShaderBrush compositeShaderBrush = (CompositeShaderBrush) obj;
        boolean z = compositeShaderBrush.serializer;
        if (z) {
            getOffscreenNrFUSI getoffscreennrfusi = compositeShaderBrush.MediaBrowserCompatMediaItem;
            long j2 = getoffscreennrfusi.addObserverForBackInvoker;
            long j3 = (long) (f * j2);
            if (j3 == 0) {
                j3 = 1;
            }
            if (j3 == j2) {
                j3 = j2 - 1;
            }
            if (compositeShaderBrush.MediaMetadataCompat != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j4 = compositeShaderBrush.RemoteActionCompatParcelizer;
            if (j3 == j4 || !z) {
                return;
            }
            if (!compositeShaderBrush.write) {
                if (j3 == 0 && j4 > 0) {
                    j = -1;
                } else if (j3 == j2 && j4 < j2) {
                    j = j2 + 1;
                } else if (j3 != j4) {
                    getoffscreennrfusi.IconCompatParcelizer(j3, j4);
                    compositeShaderBrush.RemoteActionCompatParcelizer = j3;
                }
                j3 = j;
                if (j3 != j4) {
                    getoffscreennrfusi.IconCompatParcelizer(j3, j4);
                    compositeShaderBrush.RemoteActionCompatParcelizer = j3;
                }
            }
            zp zpVar = compositeShaderBrush.MediaDescriptionCompat;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i = (zpVar.write + 1) % 20;
            zpVar.write = i;
            ((long[]) zpVar.serializer)[i] = jCurrentAnimationTimeMillis;
            ((float[]) zpVar.IconCompatParcelizer)[i] = j3;
        }
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void read(View view, Object obj) {
        if (view != null) {
            toAndroidBlendModes9anfk8.RemoteActionCompatParcelizer(view, new Rect());
            ((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj).serializer(new composeColorSpace());
        }
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void read(Object obj, w4$$ExternalSyntheticLambda0 w4__externalsyntheticlambda0) {
        CompositeShaderBrush compositeShaderBrush = (CompositeShaderBrush) obj;
        compositeShaderBrush.IconCompatParcelizer = w4__externalsyntheticlambda0;
        if (!compositeShaderBrush.serializer) {
            compositeShaderBrush.read = 2;
        } else {
            compositeShaderBrush.RemoteActionCompatParcelizer();
            compositeShaderBrush.MediaMetadataCompat.read(0.0f);
        }
    }

    public final void read(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) obj;
        int i = 0;
        if (colorSpaceVerificationHelperExternalSyntheticLambda0 instanceof getOffscreenNrFUSI) {
            getOffscreenNrFUSI getoffscreennrfusi = (getOffscreenNrFUSI) colorSpaceVerificationHelperExternalSyntheticLambda0;
            int size = getoffscreennrfusi.RemoteActionCompatParcelizer.size();
            while (i < size) {
                read(getoffscreennrfusi.write(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (!toAndroidBlendModes9anfk8.serializer((List) colorSpaceVerificationHelperExternalSyntheticLambda0._init_lambda2)) {
            return;
        }
        ArrayList arrayList3 = colorSpaceVerificationHelperExternalSyntheticLambda0._init_lambda3;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            colorSpaceVerificationHelperExternalSyntheticLambda0.read((View) arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                colorSpaceVerificationHelperExternalSyntheticLambda0.IconCompatParcelizer((View) arrayList.get(size3));
            }
        }
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final Object serializer(ViewGroup viewGroup, Object obj) {
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) obj;
        ArrayList arrayList = accessgetModulateAlphacp.serializer;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (colorSpaceVerificationHelperExternalSyntheticLambda0.IconCompatParcelizer()) {
                arrayList.add(viewGroup);
                ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0Clone = colorSpaceVerificationHelperExternalSyntheticLambda0.clone();
                getOffscreenNrFUSI getoffscreennrfusi = new getOffscreenNrFUSI();
                getoffscreennrfusi.serializer(colorSpaceVerificationHelperExternalSyntheticLambda0Clone);
                accessgetModulateAlphacp.write(viewGroup, getoffscreennrfusi);
                viewGroup.setTag(R.id.transition_current_scene, null);
                accessgetAutocp accessgetautocp = new accessgetAutocp();
                accessgetautocp.serializer = getoffscreennrfusi;
                accessgetautocp.RemoteActionCompatParcelizer = viewGroup;
                viewGroup.addOnAttachStateChangeListener(accessgetautocp);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(accessgetautocp);
                viewGroup.invalidate();
                CompositeShaderBrush compositeShaderBrush = new CompositeShaderBrush(getoffscreennrfusi);
                getoffscreennrfusi.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = compositeShaderBrush;
                getoffscreennrfusi.read(compositeShaderBrush);
                return getoffscreennrfusi.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The Transition must support seeking.");
        }
        return null;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void serializer(Object obj) {
        ((CompositeShaderBrush) obj).IconCompatParcelizer();
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final Object write(Object obj) {
        if (obj != null) {
            return ((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj).clone();
        }
        return null;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final Object write(Object obj, Object obj2, Object obj3) {
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) obj;
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda1 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) obj2;
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda2 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) obj3;
        if (colorSpaceVerificationHelperExternalSyntheticLambda0 != null && colorSpaceVerificationHelperExternalSyntheticLambda1 != null) {
            getOffscreenNrFUSI getoffscreennrfusi = new getOffscreenNrFUSI();
            getoffscreennrfusi.serializer(colorSpaceVerificationHelperExternalSyntheticLambda0);
            getoffscreennrfusi.serializer(colorSpaceVerificationHelperExternalSyntheticLambda1);
            getoffscreennrfusi.IconCompatParcelizer = false;
            colorSpaceVerificationHelperExternalSyntheticLambda0 = getoffscreennrfusi;
        } else if (colorSpaceVerificationHelperExternalSyntheticLambda0 == null) {
            colorSpaceVerificationHelperExternalSyntheticLambda0 = colorSpaceVerificationHelperExternalSyntheticLambda1 != null ? colorSpaceVerificationHelperExternalSyntheticLambda1 : null;
        }
        if (colorSpaceVerificationHelperExternalSyntheticLambda2 == null) {
            return colorSpaceVerificationHelperExternalSyntheticLambda0;
        }
        getOffscreenNrFUSI getoffscreennrfusi2 = new getOffscreenNrFUSI();
        if (colorSpaceVerificationHelperExternalSyntheticLambda0 != null) {
            getoffscreennrfusi2.serializer(colorSpaceVerificationHelperExternalSyntheticLambda0);
        }
        getoffscreennrfusi2.serializer(colorSpaceVerificationHelperExternalSyntheticLambda2);
        return getoffscreennrfusi2;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(View view, Object obj) {
        ((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj).read(view);
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(ViewGroup viewGroup, Object obj) {
        accessgetModulateAlphacp.serializer(viewGroup, (ColorSpaceVerificationHelperExternalSyntheticLambda0) obj);
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(Object obj, View view, ArrayList arrayList) {
        getOffscreenNrFUSI getoffscreennrfusi = (getOffscreenNrFUSI) obj;
        ArrayList arrayList2 = getoffscreennrfusi._init_lambda3;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            toAndroidBlendModes9anfk8.IconCompatParcelizer((List) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        write(arrayList, getoffscreennrfusi);
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void RemoteActionCompatParcelizer(Object obj, View view, ArrayList arrayList) {
        ((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj).read(new composeColorSpacelambda0(view, arrayList));
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void RemoteActionCompatParcelizer(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        getOffscreenNrFUSI getoffscreennrfusi = (getOffscreenNrFUSI) obj;
        if (getoffscreennrfusi != null) {
            ArrayList arrayList3 = getoffscreennrfusi._init_lambda3;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            read(getoffscreennrfusi, arrayList, arrayList2);
        }
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void RemoteActionCompatParcelizer(Object obj, zzw zzwVar, RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0, Runnable runnable) {
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) obj;
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = new PreviewView$1$$ExternalSyntheticLambda2(rxWorker$1$$ExternalSyntheticLambda0, colorSpaceVerificationHelperExternalSyntheticLambda0, runnable, 6);
        synchronized (zzwVar) {
            while (zzwVar.read) {
                try {
                    zzwVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (((PreviewView$1$$ExternalSyntheticLambda2) zzwVar.RemoteActionCompatParcelizer) != previewView$1$$ExternalSyntheticLambda2) {
                zzwVar.RemoteActionCompatParcelizer = previewView$1$$ExternalSyntheticLambda2;
                if (zzwVar.write) {
                    Runnable runnable2 = (Runnable) previewView$1$$ExternalSyntheticLambda2.serializer;
                    ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda1 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) previewView$1$$ExternalSyntheticLambda2.read;
                    Runnable runnable3 = (Runnable) previewView$1$$ExternalSyntheticLambda2.IconCompatParcelizer;
                    if (runnable2 == null) {
                        colorSpaceVerificationHelperExternalSyntheticLambda1.read();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        colorSpaceVerificationHelperExternalSyntheticLambda0.read(new applyAsDouble(runnable));
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(ArrayList arrayList, Object obj) {
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) obj;
        if (colorSpaceVerificationHelperExternalSyntheticLambda0 == null) {
            return;
        }
        int i = 0;
        if (colorSpaceVerificationHelperExternalSyntheticLambda0 instanceof getOffscreenNrFUSI) {
            getOffscreenNrFUSI getoffscreennrfusi = (getOffscreenNrFUSI) colorSpaceVerificationHelperExternalSyntheticLambda0;
            int size = getoffscreennrfusi.RemoteActionCompatParcelizer.size();
            while (i < size) {
                write(arrayList, getoffscreennrfusi.write(i));
                i++;
            }
            return;
        }
        if (toAndroidBlendModes9anfk8.serializer((List) colorSpaceVerificationHelperExternalSyntheticLambda0._init_lambda2) && toAndroidBlendModes9anfk8.serializer((List) colorSpaceVerificationHelperExternalSyntheticLambda0._init_lambda3)) {
            int size2 = arrayList.size();
            while (i < size2) {
                colorSpaceVerificationHelperExternalSyntheticLambda0.read((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final Object IconCompatParcelizer(Object obj) {
        if (obj == null) {
            return null;
        }
        getOffscreenNrFUSI getoffscreennrfusi = new getOffscreenNrFUSI();
        getoffscreennrfusi.serializer((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj);
        return getoffscreennrfusi;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void serializer(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj).read(new composeColorSpacelambda1(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(Object obj, Rect rect) {
        ((ColorSpaceVerificationHelperExternalSyntheticLambda0) obj).serializer(new composeColorSpace());
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(Fragment fragment, Object obj, zzw zzwVar, Runnable runnable) {
        RemoteActionCompatParcelizer(obj, zzwVar, null, runnable);
    }
}
