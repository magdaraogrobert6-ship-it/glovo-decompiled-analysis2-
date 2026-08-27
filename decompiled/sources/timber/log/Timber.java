package timber.log;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import o.ProtoPrerequisiteMsgserializer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Timber {
    public static final Forest RemoteActionCompatParcelizer = new Forest();
    public static final ArrayList IconCompatParcelizer = new ArrayList();
    public static volatile ProtoPrerequisiteMsgserializer[] read = new ProtoPrerequisiteMsgserializer[0];

    public final class Forest extends ProtoPrerequisiteMsgserializer {
        @Override // o.ProtoPrerequisiteMsgserializer
        public final void IconCompatParcelizer(String str, Object... objArr) {
            for (ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer : Timber.read) {
                protoPrerequisiteMsgserializer.IconCompatParcelizer(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.ProtoPrerequisiteMsgserializer
        public final void RemoteActionCompatParcelizer(String str, Object... objArr) {
            for (ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer : Timber.read) {
                protoPrerequisiteMsgserializer.RemoteActionCompatParcelizer(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.ProtoPrerequisiteMsgserializer
        public final void read(String str, Object... objArr) {
            for (ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer : Timber.read) {
                protoPrerequisiteMsgserializer.read(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void write(ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer) {
            if (protoPrerequisiteMsgserializer == this) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot plant Timber into itself.");
                return;
            }
            ArrayList arrayList = Timber.IconCompatParcelizer;
            synchronized (arrayList) {
                arrayList.add(protoPrerequisiteMsgserializer);
                Object[] array = arrayList.toArray(new ProtoPrerequisiteMsgserializer[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.read = (ProtoPrerequisiteMsgserializer[]) array;
            }
        }

        public final void RemoteActionCompatParcelizer(String str) {
            str.getClass();
            ProtoPrerequisiteMsgserializer[] protoPrerequisiteMsgserializerArr = Timber.read;
            int length = protoPrerequisiteMsgserializerArr.length;
            int i = 0;
            while (i < length) {
                ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer = protoPrerequisiteMsgserializerArr[i];
                i++;
                protoPrerequisiteMsgserializer.RatingCompat.set(str);
            }
        }

        @Override // o.ProtoPrerequisiteMsgserializer
        public final void IconCompatParcelizer(int i, String str, String str2, Throwable th) {
            str2.getClass();
            throw new AssertionError();
        }

        @Override // o.ProtoPrerequisiteMsgserializer
        public final void read(Throwable th) {
            for (ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer : Timber.read) {
                protoPrerequisiteMsgserializer.read(th);
            }
        }

        @Override // o.ProtoPrerequisiteMsgserializer
        public final void serializer(Throwable th) {
            for (ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer : Timber.read) {
                protoPrerequisiteMsgserializer.serializer(th);
            }
        }

        @Override // o.ProtoPrerequisiteMsgserializer
        public final void write(Throwable th) {
            for (ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer : Timber.read) {
                protoPrerequisiteMsgserializer.write(th);
            }
        }

        @Override // o.ProtoPrerequisiteMsgserializer
        public final void RemoteActionCompatParcelizer(Throwable th, String str, Object... objArr) {
            for (ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer : Timber.read) {
                protoPrerequisiteMsgserializer.RemoteActionCompatParcelizer(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.ProtoPrerequisiteMsgserializer
        public final void read(Throwable th, String str, Object... objArr) {
            for (ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer : Timber.read) {
                protoPrerequisiteMsgserializer.read(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // o.ProtoPrerequisiteMsgserializer
        public final void serializer(Throwable th, String str, Object... objArr) {
            for (ProtoPrerequisiteMsgserializer protoPrerequisiteMsgserializer : Timber.read) {
                protoPrerequisiteMsgserializer.serializer(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }
}
