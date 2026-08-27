package o;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Iterator;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class evaluateFeaturefwf_client_release {
    public static final Scope read(ComponentCallbacks componentCallbacks) {
        componentCallbacks.getClass();
        if (componentCallbacks instanceof evaluateFeaturesfwf_client_release) {
            return ((evaluateFeaturesfwf_client_release) componentCallbacks).write();
        }
        if (componentCallbacks instanceof getFwfEventValueTransformerfwf_client_release) {
            return ((getFwfEventValueTransformerfwf_client_release) componentCallbacks).write().IconCompatParcelizer.serializer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("KoinApplication has not been started");
        return null;
    }

    public static final int RemoteActionCompatParcelizer(Bundle bundle) {
        int iHashCode;
        Iterator<String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                iHashCode = RemoteActionCompatParcelizer((Bundle) obj);
            } else if (obj instanceof Object[]) {
                iHashCode = Arrays.deepHashCode((Object[]) obj);
            } else if (obj instanceof byte[]) {
                iHashCode = Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                iHashCode = Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                iHashCode = Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                iHashCode = Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                iHashCode = Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                iHashCode = Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                iHashCode = Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                iHashCode = Arrays.hashCode((boolean[]) obj);
            } else {
                iHashCode = obj != null ? obj.hashCode() : 0;
            }
            i = (i * 31) + iHashCode;
        }
        return i;
    }

    public static final boolean read(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2) {
                int iWrite = getCieXyz.write();
                int iWrite2 = getCieXyz.write();
                int iWrite3 = getCieXyz.write();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{obj, obj2}, iWrite3)).booleanValue()) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                            if (!read((Bundle) obj, (Bundle) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!onContentCardClicked.RemoteActionCompatParcelizer((Object[]) obj, (Object[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                                return false;
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                                return false;
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                    return false;
                }
                continue;
            }
        }
        return true;
    }
}
