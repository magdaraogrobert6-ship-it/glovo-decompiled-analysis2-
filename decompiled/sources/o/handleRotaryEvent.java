package o;

import com.google.firebase.perf.v1.TraceMetric;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class handleRotaryEvent extends handleMotionEvent8iAsVTc {
    public static final getWindowInfoannotations RemoteActionCompatParcelizer = getWindowInfoannotations.write();
    public final TraceMetric read;

    public handleRotaryEvent(TraceMetric traceMetric) {
        this.read = traceMetric;
    }

    @Override // o.handleMotionEvent8iAsVTc
    public final boolean read() {
        TraceMetric traceMetric = this.read;
        boolean zIconCompatParcelizer = IconCompatParcelizer(traceMetric, 0);
        getWindowInfoannotations getwindowinfoannotations = RemoteActionCompatParcelizer;
        if (!zIconCompatParcelizer) {
            getwindowinfoannotations.read("Invalid Trace:" + traceMetric.getName());
            return false;
        }
        if (traceMetric.getCountersCount() <= 0) {
            Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
            while (it.hasNext()) {
                if (it.next().getCountersCount() > 0) {
                }
            }
            return true;
        }
        if (serializer(traceMetric, 0)) {
            return true;
        }
        getwindowinfoannotations.read("Invalid Counters for Trace:" + traceMetric.getName());
        return false;
    }

    public static boolean serializer(TraceMetric traceMetric, int i) {
        if (traceMetric != null) {
            getWindowInfoannotations getwindowinfoannotations = RemoteActionCompatParcelizer;
            if (i > 1) {
                getwindowinfoannotations.read("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry<String, Long> entry : traceMetric.getCountersMap().entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    String strTrim = key.trim();
                    if (strTrim.isEmpty()) {
                        getwindowinfoannotations.read("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        getwindowinfoannotations.read("counterId exceeded max length 100");
                    } else if (entry.getValue() == null) {
                        getwindowinfoannotations.read("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                getwindowinfoannotations.read("invalid CounterId:" + entry.getKey());
                return false;
            }
            Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
            while (it.hasNext()) {
                if (!serializer(it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean IconCompatParcelizer(TraceMetric traceMetric, int i) {
        Long l;
        getWindowInfoannotations getwindowinfoannotations = RemoteActionCompatParcelizer;
        if (traceMetric == null) {
            getwindowinfoannotations.read("TraceMetric is null");
            return false;
        }
        if (i > 1) {
            getwindowinfoannotations.read("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String name = traceMetric.getName();
        if (name != null) {
            String strTrim = name.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (traceMetric.getDurationUs() <= 0) {
                    getwindowinfoannotations.read("invalid TraceDuration:" + traceMetric.getDurationUs());
                    return false;
                }
                if (!traceMetric.hasClientStartTimeUs()) {
                    getwindowinfoannotations.read("clientStartTimeUs is null.");
                    return false;
                }
                if (traceMetric.getName().startsWith("_st_") && ((l = traceMetric.getCountersMap().get(recalculateWindowPosition.FRAMES_TOTAL.toString())) == null || l.compareTo((Long) 0L) <= 0)) {
                    getwindowinfoannotations.read("non-positive totalFrames in screen trace " + traceMetric.getName());
                    return false;
                }
                Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
                while (it.hasNext()) {
                    if (!IconCompatParcelizer(it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry<String, String> entry : traceMetric.getCustomAttributesMap().entrySet()) {
                    try {
                        handleMotionEvent8iAsVTc.write(entry.getKey(), entry.getValue());
                    } catch (IllegalArgumentException e) {
                        getwindowinfoannotations.read(e.getLocalizedMessage());
                        return false;
                    }
                }
                return true;
            }
        }
        getwindowinfoannotations.read("invalid TraceId:" + traceMetric.getName());
        return false;
    }
}
