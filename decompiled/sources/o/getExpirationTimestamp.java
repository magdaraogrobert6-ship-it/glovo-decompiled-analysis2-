package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class getExpirationTimestamp {

    public static class RemoteActionCompatParcelizer {
        private final double IconCompatParcelizer;
        private final double RemoteActionCompatParcelizer;
        private final double read;
        private final double write;

        public final double IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final double RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final double read() {
            return this.IconCompatParcelizer;
        }

        public final double serializer() {
            return this.read;
        }

        public final int hashCode() {
            return Double.hashCode(this.write) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.IconCompatParcelizer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, Double.hashCode(this.read) * 31, 31), 31);
        }

        public RemoteActionCompatParcelizer(double d, double d2, double d3, double d4) {
            this.read = d;
            this.RemoteActionCompatParcelizer = d2;
            this.IconCompatParcelizer = d3;
            this.write = d4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!getClass().equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.read == remoteActionCompatParcelizer.read && this.RemoteActionCompatParcelizer == remoteActionCompatParcelizer.RemoteActionCompatParcelizer && this.IconCompatParcelizer == remoteActionCompatParcelizer.IconCompatParcelizer && this.write == remoteActionCompatParcelizer.write;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x000f A[SYNTHETIC] */
    public static r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k read(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer, ArrayList arrayList) {
        double dSerializer;
        getIconColor geticoncolor;
        str.getClass();
        remoteActionCompatParcelizer.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            getIconColor geticoncolor2 = null;
            if (!it.hasNext()) {
                break;
            }
            r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k r8lambdaljnxqufanckwlgxbv6bnxcttl0k = (r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k) it.next();
            SafetyScoreType safetyScoreTypeIconCompatParcelizer = r8lambdaljnxqufanckwlgxbv6bnxcttl0k != null ? r8lambdaljnxqufanckwlgxbv6bnxcttl0k.IconCompatParcelizer() : null;
            int i = safetyScoreTypeIconCompatParcelizer == null ? -1 : getLocalPrefetchedAssetPaths.IconCompatParcelizer[safetyScoreTypeIconCompatParcelizer.ordinal()];
            if (i == 1) {
                geticoncolor = new getIconColor(r8lambdaljnxqufanckwlgxbv6bnxcttl0k.write(), remoteActionCompatParcelizer.serializer());
            } else if (i == 2) {
                geticoncolor = new getIconColor(r8lambdaljnxqufanckwlgxbv6bnxcttl0k.write(), remoteActionCompatParcelizer.IconCompatParcelizer());
            } else if (i != 3) {
                if (i == 4) {
                    geticoncolor = new getIconColor(r8lambdaljnxqufanckwlgxbv6bnxcttl0k.write(), remoteActionCompatParcelizer.read());
                }
                if (geticoncolor2 != null) {
                    arrayList2.add(geticoncolor2);
                }
            } else {
                geticoncolor = new getIconColor(r8lambdaljnxqufanckwlgxbv6bnxcttl0k.write(), remoteActionCompatParcelizer.RemoteActionCompatParcelizer());
            }
            geticoncolor2 = geticoncolor;
            if (geticoncolor2 != null) {
                arrayList2.add(geticoncolor2);
            }
        }
        ArrayList<getIconColor> arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            dSerializer = 0.0d;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((getIconColor) next).serializer() != 0.0d) {
                arrayList3.add(next);
            }
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            dSerializer += ((getIconColor) it3.next()).serializer();
        }
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
        for (getIconColor geticoncolor3 : arrayList3) {
            arrayList4.add(Double.valueOf((geticoncolor3.serializer() * geticoncolor3.IconCompatParcelizer()) / dSerializer));
        }
        return new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.OVERALL, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(onContentCardDismissed.MediaSessionCompatToken(arrayList4)));
    }
}
