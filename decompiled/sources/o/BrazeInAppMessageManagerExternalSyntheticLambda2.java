package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeInAppMessageManagerExternalSyntheticLambda2 implements Comparable {
    public final long IconCompatParcelizer;
    public static final unregisterInAppMessageManager write = new unregisterInAppMessageManager(0);
    public static final long RemoteActionCompatParcelizer = coil3.UriKt.RemoteActionCompatParcelizer(4611686018427387903L);
    public static final long serializer = coil3.UriKt.RemoteActionCompatParcelizer(-4611686018427387903L);
    public static final long read = 9223372036854759646L;

    public static final boolean IconCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    public static final long RemoteActionCompatParcelizer(long j) {
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            return j2;
        }
        if (j2 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j2 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j2 * 1000000;
    }

    public static final /* synthetic */ BrazeInAppMessageManagerExternalSyntheticLambda2 IconCompatParcelizer(long j) {
        return new BrazeInAppMessageManagerExternalSyntheticLambda2(j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((BrazeInAppMessageManagerExternalSyntheticLambda2) obj).IconCompatParcelizer);
    }

    public final int hashCode() {
        return Long.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        return MediaBrowserCompatMediaItem(this.IconCompatParcelizer);
    }

    public /* synthetic */ BrazeInAppMessageManagerExternalSyntheticLambda2(long j) {
        this.IconCompatParcelizer = j;
    }

    public static final long RemoteActionCompatParcelizer(long j, setUnregisteredInAppMessage setunregisteredinappmessage) {
        setunregisteredinappmessage.getClass();
        if (j == RemoteActionCompatParcelizer) {
            return Long.MAX_VALUE;
        }
        if (j == serializer) {
            return Long.MIN_VALUE;
        }
        setUnregisteredInAppMessage setunregisteredinappmessage2 = (((int) j) & 1) == 0 ? setUnregisteredInAppMessage.NANOSECONDS : setUnregisteredInAppMessage.MILLISECONDS;
        setunregisteredinappmessage2.getClass();
        return setunregisteredinappmessage.getTimeUnit$kotlin_stdlib().convert(j >> 1, setunregisteredinappmessage2.getTimeUnit$kotlin_stdlib());
    }

    public static final double serializer(long j, setUnregisteredInAppMessage setunregisteredinappmessage) {
        setunregisteredinappmessage.getClass();
        if (j == RemoteActionCompatParcelizer) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == serializer) {
            return Double.NEGATIVE_INFINITY;
        }
        return ((Double) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -703904562, 703904565, trackEventI.IconCompatParcelizer(), new Object[]{Double.valueOf(j >> 1), (((int) j) & 1) == 0 ? setUnregisteredInAppMessage.NANOSECONDS : setUnregisteredInAppMessage.MILLISECONDS, setunregisteredinappmessage})).doubleValue();
    }

    public static final long serializer(long j, long j2) {
        long j3 = j2 / 1000000;
        long jSerializer = coil3.UriKt.serializer(j, j3);
        if (-4611686018426L <= jSerializer && jSerializer < 4611686018427L) {
            return coil3.UriKt.read((jSerializer * 1000000) + (j2 - (j3 * 1000000)));
        }
        return coil3.UriKt.RemoteActionCompatParcelizer(jSerializer);
    }

    public static final long write(long j) {
        return ((((int) j) & 1) != 1 || read(j)) ? RemoteActionCompatParcelizer(j, setUnregisteredInAppMessage.MILLISECONDS) : j >> 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BrazeInAppMessageManagerExternalSyntheticLambda2) {
            return this.IconCompatParcelizer == ((BrazeInAppMessageManagerExternalSyntheticLambda2) obj).IconCompatParcelizer;
        }
        return false;
    }

    public static final boolean read(long j) {
        return j == RemoteActionCompatParcelizer || j == serializer;
    }

    public static final void IconCompatParcelizer(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strSerializer = hideCurrentlyDisplayingInAppMessage.serializer(i3, String.valueOf(i2));
            int length = strSerializer.length() - 1;
            if (length < 0) {
                length = -1;
                break;
            }
            while (true) {
                int i4 = length - 1;
                if (strSerializer.charAt(length) != '0') {
                    break;
                }
                if (i4 < 0) {
                    length = -1;
                    break;
                }
                length = i4;
            }
            int i5 = length + 1;
            if (z || i5 >= 3) {
                sb.append((CharSequence) strSerializer, 0, ((length + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strSerializer, 0, i5);
            }
        }
        sb.append(str);
    }

    public static String MediaBrowserCompatMediaItem(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == RemoteActionCompatParcelizer) {
            return "Infinity";
        }
        if (j == serializer) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        long jMediaSessionCompatQueueItem = j < 0 ? MediaSessionCompatQueueItem(j) : j;
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(jMediaSessionCompatQueueItem, setUnregisteredInAppMessage.DAYS);
        int iRemoteActionCompatParcelizer = read(jMediaSessionCompatQueueItem) ? 0 : (int) (RemoteActionCompatParcelizer(jMediaSessionCompatQueueItem, setUnregisteredInAppMessage.HOURS) % 24);
        int iRemoteActionCompatParcelizer2 = read(jMediaSessionCompatQueueItem) ? 0 : (int) (RemoteActionCompatParcelizer(jMediaSessionCompatQueueItem, setUnregisteredInAppMessage.MINUTES) % 60);
        int iRemoteActionCompatParcelizer3 = read(jMediaSessionCompatQueueItem) ? 0 : (int) (RemoteActionCompatParcelizer(jMediaSessionCompatQueueItem, setUnregisteredInAppMessage.SECONDS) % 60);
        int iSerializer = serializer(jMediaSessionCompatQueueItem);
        boolean z2 = jRemoteActionCompatParcelizer != 0;
        boolean z3 = iRemoteActionCompatParcelizer != 0;
        boolean z4 = iRemoteActionCompatParcelizer2 != 0;
        boolean z5 = (iRemoteActionCompatParcelizer3 == 0 && iSerializer == 0) ? false : true;
        if (z2) {
            sb.append(jRemoteActionCompatParcelizer);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iRemoteActionCompatParcelizer);
            sb.append('h');
            i++;
        }
        if (z4 || (z5 && (z3 || z2))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iRemoteActionCompatParcelizer2);
            sb.append('m');
            i++;
        }
        if (z5) {
            if (i > 0) {
                sb.append(' ');
            }
            if (iRemoteActionCompatParcelizer3 != 0 || z2 || z3 || z4) {
                IconCompatParcelizer(sb, iRemoteActionCompatParcelizer3, iSerializer, 9, com.braze.Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, false);
            } else if (iSerializer >= 1000000) {
                IconCompatParcelizer(sb, iSerializer / 1000000, iSerializer % 1000000, 6, "ms", false);
            } else if (iSerializer >= 1000) {
                IconCompatParcelizer(sb, iSerializer / 1000, iSerializer % 1000, 3, "us", false);
            } else {
                sb.append(iSerializer);
                sb.append("ns");
            }
            i++;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long MediaSessionCompatQueueItem(long j) {
        int i = BrazeInAppMessageManagerExternalSyntheticLambda0.write;
        return ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
    }

    public static final int serializer(long j) {
        if (read(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static int RemoteActionCompatParcelizer(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return removeNodeAtDepth.read(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final long read(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            if (i == 1) {
                return serializer(j >> 1, j2 >> 1);
            }
            return serializer(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L <= j3 && j3 < 4611686018427000000L) {
                return coil3.UriKt.read(j3);
            }
            return coil3.UriKt.RemoteActionCompatParcelizer(j3 / 1000000);
        }
        long jSerializer = coil3.UriKt.serializer(j >> 1, j2 >> 1);
        if (jSerializer == 9223372036854759646L) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jSerializer != 4611686018427387903L && jSerializer != -4611686018427387903L) {
            Object[] objArr = {Long.valueOf(jSerializer)};
            return ((Long) coil3.UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), -1740381907, 1740381910, objArr, accessunpack.serializer(), accessunpack.serializer())).longValue();
        }
        return coil3.UriKt.RemoteActionCompatParcelizer(jSerializer);
    }
}
