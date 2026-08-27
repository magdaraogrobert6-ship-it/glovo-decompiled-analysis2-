package o;

import android.os.Build;
import android.view.MotionEvent;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setFocusPropertiesScope {
    public static final Map IconCompatParcelizer = Collections.synchronizedMap(new WeakHashMap());

    public static void serializer(android.view.VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map = IconCompatParcelizer;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new getFocusPropertiesScope());
            }
            getFocusPropertiesScope getfocuspropertiesscope = (getFocusPropertiesScope) map.get(velocityTracker);
            long[] jArr = getfocuspropertiesscope.IconCompatParcelizer;
            long eventTime = motionEvent.getEventTime();
            if (getfocuspropertiesscope.RemoteActionCompatParcelizer != 0 && eventTime - jArr[getfocuspropertiesscope.write] > 40) {
                getfocuspropertiesscope.RemoteActionCompatParcelizer = 0;
                getfocuspropertiesscope.read = 0.0f;
            }
            int i = (getfocuspropertiesscope.write + 1) % 20;
            getfocuspropertiesscope.write = i;
            int i2 = getfocuspropertiesscope.RemoteActionCompatParcelizer;
            if (i2 != 20) {
                getfocuspropertiesscope.RemoteActionCompatParcelizer = i2 + 1;
            }
            getfocuspropertiesscope.serializer[i] = motionEvent.getAxisValue(26);
            jArr[getfocuspropertiesscope.write] = eventTime;
        }
    }

    public static float serializer(android.view.VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return invalidateFocusProperties.read(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        getFocusPropertiesScope getfocuspropertiesscope = (getFocusPropertiesScope) IconCompatParcelizer.get(velocityTracker);
        if (getfocuspropertiesscope == null || i != 26) {
            return 0.0f;
        }
        return getfocuspropertiesscope.read;
    }

    public static void write(android.view.VelocityTracker velocityTracker) {
        long j;
        int i;
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        getFocusPropertiesScope getfocuspropertiesscope = (getFocusPropertiesScope) IconCompatParcelizer.get(velocityTracker);
        if (getfocuspropertiesscope != null) {
            float[] fArr = getfocuspropertiesscope.serializer;
            long[] jArr = getfocuspropertiesscope.IconCompatParcelizer;
            int i2 = getfocuspropertiesscope.RemoteActionCompatParcelizer;
            float fSqrt = 0.0f;
            if (i2 >= 2) {
                int i3 = getfocuspropertiesscope.write;
                int i4 = ((i3 + 20) - (i2 - 1)) % 20;
                long j2 = jArr[i3];
                while (true) {
                    j = jArr[i4];
                    i = getfocuspropertiesscope.RemoteActionCompatParcelizer;
                    if (j2 - j <= 100) {
                        break;
                    }
                    getfocuspropertiesscope.RemoteActionCompatParcelizer = i - 1;
                    i4 = (i4 + 1) % 20;
                }
                if (i >= 2) {
                    if (i == 2) {
                        int i5 = (i4 + 1) % 20;
                        long j3 = jArr[i5];
                        if (j != j3) {
                            fSqrt = fArr[i5] / (j3 - j);
                        }
                    } else {
                        int i6 = 0;
                        int i7 = 0;
                        float fAbs = 0.0f;
                        while (true) {
                            if (i6 >= getfocuspropertiesscope.RemoteActionCompatParcelizer - 1) {
                                break;
                            }
                            int i8 = i6 + i4;
                            long j4 = jArr[i8 % 20];
                            int i9 = (i8 + 1) % 20;
                            if (jArr[i9] != j4) {
                                i7++;
                                float f = fAbs >= 0.0f ? 1.0f : -1.0f;
                                float fSqrt2 = (float) Math.sqrt(Math.abs(fAbs) * 2.0f);
                                float f2 = fArr[i9] / (jArr[i9] - j4);
                                fAbs += Math.abs(f2) * (f2 - (f * fSqrt2));
                                if (i7 == 1) {
                                    fAbs *= 0.5f;
                                }
                            }
                            i6++;
                        }
                        fSqrt = (fAbs >= 0.0f ? 1.0f : -1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                    }
                }
            }
            float f3 = fSqrt * 1000.0f;
            getfocuspropertiesscope.read = f3;
            if (f3 < (-Math.abs(Float.MAX_VALUE))) {
                getfocuspropertiesscope.read = -Math.abs(Float.MAX_VALUE);
            } else if (getfocuspropertiesscope.read > Math.abs(Float.MAX_VALUE)) {
                getfocuspropertiesscope.read = Math.abs(Float.MAX_VALUE);
            }
        }
    }
}
