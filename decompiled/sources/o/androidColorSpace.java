package o;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class androidColorSpace extends ColorSpaceVerificationHelperExternalSyntheticLambda0 {
    public static final String[] read = {"android:visibility:visibility", "android:visibility:parent"};
    public final int IconCompatParcelizer;

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void write(CompositingStrategyCompanion compositingStrategyCompanion) {
        read(compositingStrategyCompanion);
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final String[] write() {
        return read;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static accessgetLowcp IconCompatParcelizer(CompositingStrategyCompanion compositingStrategyCompanion, CompositingStrategyCompanion compositingStrategyCompanion2) {
        accessgetLowcp accessgetlowcp = new accessgetLowcp();
        accessgetlowcp.MediaSessionCompatQueueItem = false;
        accessgetlowcp.serializer = false;
        if (compositingStrategyCompanion != null) {
            HashMap map = compositingStrategyCompanion.write;
            if (map.containsKey("android:visibility:visibility")) {
                accessgetlowcp.RemoteActionCompatParcelizer = ((Integer) map.get("android:visibility:visibility")).intValue();
                accessgetlowcp.IconCompatParcelizer = (ViewGroup) map.get("android:visibility:parent");
            } else {
                accessgetlowcp.RemoteActionCompatParcelizer = -1;
                accessgetlowcp.IconCompatParcelizer = null;
            }
        } else {
            accessgetlowcp.RemoteActionCompatParcelizer = -1;
            accessgetlowcp.IconCompatParcelizer = null;
        }
        if (compositingStrategyCompanion2 != null) {
            HashMap map2 = compositingStrategyCompanion2.write;
            if (map2.containsKey("android:visibility:visibility")) {
                accessgetlowcp.read = ((Integer) map2.get("android:visibility:visibility")).intValue();
                accessgetlowcp.write = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                accessgetlowcp.read = -1;
                accessgetlowcp.write = null;
            }
        } else {
            accessgetlowcp.read = -1;
            accessgetlowcp.write = null;
        }
        if (compositingStrategyCompanion != null && compositingStrategyCompanion2 != null) {
            int i = accessgetlowcp.RemoteActionCompatParcelizer;
            int i2 = accessgetlowcp.read;
            if (i != i2 || accessgetlowcp.IconCompatParcelizer != accessgetlowcp.write) {
                if (i != i2) {
                    if (i == 0) {
                        accessgetlowcp.serializer = false;
                        accessgetlowcp.MediaSessionCompatQueueItem = true;
                        return accessgetlowcp;
                    }
                    if (i2 == 0) {
                        accessgetlowcp.serializer = true;
                        accessgetlowcp.MediaSessionCompatQueueItem = true;
                        return accessgetlowcp;
                    }
                } else {
                    if (accessgetlowcp.write == null) {
                        accessgetlowcp.serializer = false;
                        accessgetlowcp.MediaSessionCompatQueueItem = true;
                        return accessgetlowcp;
                    }
                    if (accessgetlowcp.IconCompatParcelizer == null) {
                        accessgetlowcp.serializer = true;
                        accessgetlowcp.MediaSessionCompatQueueItem = true;
                        return accessgetlowcp;
                    }
                }
            }
        } else {
            if (compositingStrategyCompanion == null && accessgetlowcp.read == 0) {
                accessgetlowcp.serializer = true;
                accessgetlowcp.MediaSessionCompatQueueItem = true;
                return accessgetlowcp;
            }
            if (compositingStrategyCompanion2 == null && accessgetlowcp.RemoteActionCompatParcelizer == 0) {
                accessgetlowcp.serializer = false;
                accessgetlowcp.MediaSessionCompatQueueItem = true;
            }
        }
        return accessgetlowcp;
    }

    public static float read(CompositingStrategyCompanion compositingStrategyCompanion, float f) {
        Float f2;
        return (compositingStrategyCompanion == null || (f2 = (Float) compositingStrategyCompanion.write.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    public static void read(CompositingStrategyCompanion compositingStrategyCompanion) {
        View view = compositingStrategyCompanion.RemoteActionCompatParcelizer;
        int visibility = view.getVisibility();
        HashMap map = compositingStrategyCompanion.write;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void serializer(CompositingStrategyCompanion compositingStrategyCompanion) {
        read(compositingStrategyCompanion);
        View view = compositingStrategyCompanion.RemoteActionCompatParcelizer;
        Float fValueOf = (Float) view.getTag(com.logistics.rider.glovo.R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(getAutoNrFUSI.IconCompatParcelizer.RemoteActionCompatParcelizer(view)) : Float.valueOf(0.0f);
        }
        compositingStrategyCompanion.write.put("android:fade:transitionAlpha", fValueOf);
    }

    public androidColorSpace() {
        this.IconCompatParcelizer = 3;
    }

    public final ObjectAnimator read(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        getAutoNrFUSI.IconCompatParcelizer.IconCompatParcelizer(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, getAutoNrFUSI.serializer, f2);
        androidColorSpacelambda0 androidcolorspacelambda0 = new androidColorSpacelambda0(view);
        objectAnimatorOfFloat.addListener(androidcolorspacelambda0);
        MediaSessionCompatQueueItem().read(androidcolorspacelambda0);
        return objectAnimatorOfFloat;
    }

    public androidColorSpace(int i) {
        this();
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:64:0x0146  */
    /* JADX WARN: Code duplicated, block: B:67:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x019c  */
    /* JADX WARN: Code duplicated, block: B:71:0x019f  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d9  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (IconCompatParcelizer(IconCompatParcelizer(r3, false), serializer(r3, false)).MediaSessionCompatQueueItem != false) goto L105;
     */
    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator read(android.view.ViewGroup r21, o.CompositingStrategyCompanion r22, o.CompositingStrategyCompanion r23) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.androidColorSpace.read(android.view.ViewGroup, o.CompositingStrategyCompanion, o.CompositingStrategyCompanion):android.animation.Animator");
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final boolean write(CompositingStrategyCompanion compositingStrategyCompanion, CompositingStrategyCompanion compositingStrategyCompanion2) {
        if (compositingStrategyCompanion == null && compositingStrategyCompanion2 == null) {
            return false;
        }
        if (compositingStrategyCompanion != null && compositingStrategyCompanion2 != null && compositingStrategyCompanion2.write.containsKey("android:visibility:visibility") != compositingStrategyCompanion.write.containsKey("android:visibility:visibility")) {
            return false;
        }
        accessgetLowcp accessgetlowcpIconCompatParcelizer = IconCompatParcelizer(compositingStrategyCompanion, compositingStrategyCompanion2);
        if (accessgetlowcpIconCompatParcelizer.MediaSessionCompatQueueItem) {
            return accessgetlowcpIconCompatParcelizer.RemoteActionCompatParcelizer == 0 || accessgetlowcpIconCompatParcelizer.read == 0;
        }
        return false;
    }
}
