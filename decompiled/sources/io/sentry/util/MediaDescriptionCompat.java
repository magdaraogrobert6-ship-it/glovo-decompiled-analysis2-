package io.sentry.util;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.IBrazeActionStep;
import o.getSecondArg;
import o.isAppSetIdReadingEnabled;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaDescriptionCompat implements getSecondArg {
    public final ArrayDeque write;

    @Override // o.getSecondArg
    public final void ResultReceiver() {
    }

    @Override // o.getSecondArg
    public final Object r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    @Override // o.getSecondArg
    public final void serializer(boolean z) {
    }

    @Override // o.getSecondArg
    public final void IconCompatParcelizer() {
        ArrayDeque arrayDeque = this.write;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // o.getSecondArg
    public final String PlaybackStateCompat() throws IOException {
        Map.Entry entry = (Map.Entry) this.write.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), "Expected a name but was ");
        return null;
    }

    @Override // o.getSecondArg
    public final void RemoteActionCompatParcelizer() throws IOException {
        ArrayDeque arrayDeque = this.write;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("No more entries");
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Current token is not an object");
            return;
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.IconCompatParcelizer.END_ARRAY));
        List list = (List) value;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.write.clear();
    }

    @Override // o.getSecondArg
    public final io.sentry.vendor.gson.stream.IconCompatParcelizer r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        ArrayDeque arrayDeque = this.write;
        if (arrayDeque.isEmpty()) {
            return io.sentry.vendor.gson.stream.IconCompatParcelizer.END_DOCUMENT;
        }
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return io.sentry.vendor.gson.stream.IconCompatParcelizer.END_DOCUMENT;
        }
        if (entry.getKey() != null) {
            return io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME;
        }
        Object value = entry.getValue();
        if (value instanceof Map) {
            return io.sentry.vendor.gson.stream.IconCompatParcelizer.BEGIN_OBJECT;
        }
        if (value instanceof List) {
            return io.sentry.vendor.gson.stream.IconCompatParcelizer.BEGIN_ARRAY;
        }
        if (value instanceof String) {
            return io.sentry.vendor.gson.stream.IconCompatParcelizer.STRING;
        }
        if (value instanceof Number) {
            return io.sentry.vendor.gson.stream.IconCompatParcelizer.NUMBER;
        }
        if (value instanceof Boolean) {
            return io.sentry.vendor.gson.stream.IconCompatParcelizer.BOOLEAN;
        }
        return value instanceof io.sentry.vendor.gson.stream.IconCompatParcelizer ? (io.sentry.vendor.gson.stream.IconCompatParcelizer) value : io.sentry.vendor.gson.stream.IconCompatParcelizer.END_DOCUMENT;
    }

    public final Object r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() throws IOException {
        try {
            ArrayDeque arrayDeque = this.write;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    @Override // o.getSecondArg
    public final boolean read() {
        return !this.write.isEmpty();
    }

    @Override // o.getSecondArg
    public final Object serializer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, IBrazeActionStep iBrazeActionStep) {
        ArrayDeque arrayDeque = this.write;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (brazeActionParserExternalSyntheticLambda0 != null) {
            return iBrazeActionStep.write(this, brazeActionParserExternalSyntheticLambda0);
        }
        arrayDeque.removeLast();
        return value;
    }

    @Override // o.getSecondArg
    public final void serializer() {
        ArrayDeque arrayDeque = this.write;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // o.getSecondArg
    public final void write() throws IOException {
        ArrayDeque arrayDeque = this.write;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("No more entries");
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Current token is not an object");
            return;
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.IconCompatParcelizer.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((Map.Entry) it.next());
        }
    }

    @Override // o.getSecondArg
    public final String ComponentActivity() {
        return (String) r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    @Override // o.getSecondArg
    public final double MediaBrowserCompatMediaItem() throws IOException {
        Object objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM instanceof Number) {
            return ((Number) objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).doubleValue();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Expected double");
        return 0.0d;
    }

    @Override // o.getSecondArg
    public final float MediaDescriptionCompat() throws IOException {
        Object objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM instanceof Number) {
            return ((Number) objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).floatValue();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Expected float");
        return 0.0f;
    }

    @Override // o.getSecondArg
    public final Float MediaMetadataCompat() throws IOException {
        Object objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM instanceof Number) {
            return Float.valueOf(((Number) objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).floatValue());
        }
        return null;
    }

    @Override // o.getSecondArg
    public final Double MediaSessionCompatQueueItem() throws IOException {
        Object objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM instanceof Number) {
            return Double.valueOf(((Number) objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).doubleValue());
        }
        return null;
    }

    @Override // o.getSecondArg
    public final int MediaSessionCompatResultReceiverWrapper() throws IOException {
        Object objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM instanceof Number) {
            return ((Number) objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).intValue();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Expected int");
        return 0;
    }

    @Override // o.getSecondArg
    public final long MediaSessionCompatToken() throws IOException {
        Object objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM instanceof Number) {
            return ((Number) objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).longValue();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Expected long");
        return 0L;
    }

    @Override // o.getSecondArg
    public final Long ParcelableVolumeInfo() throws IOException {
        Object objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM instanceof Number) {
            return Long.valueOf(((Number) objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).longValue());
        }
        return null;
    }

    @Override // o.getSecondArg
    public final Integer PlaybackStateCompatCustomAction() throws IOException {
        Object objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM instanceof Number) {
            return Integer.valueOf(((Number) objR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).intValue());
        }
        return null;
    }

    @Override // o.getSecondArg
    public final Boolean RatingCompat() {
        return (Boolean) r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    @Override // o.getSecondArg
    public final Date RemoteActionCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        String str = (String) r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (str == null) {
            return null;
        }
        try {
            try {
                return setNativeShader.write(str);
            } catch (Exception unused) {
                int iSerializer = isAppSetIdReadingEnabled.serializer();
                int iSerializer2 = isAppSetIdReadingEnabled.serializer();
                int iSerializer3 = isAppSetIdReadingEnabled.serializer();
                return (Date) setNativeShader.read(1269650257, isAppSetIdReadingEnabled.serializer(), iSerializer2, new Object[]{str}, iSerializer, iSerializer3, -1269650256);
            }
        } catch (Exception e) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error when deserializing millis timestamp format.", e);
            return null;
        }
    }

    @Override // o.getSecondArg
    public final HashMap RemoteActionCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, IBrazeActionStep iBrazeActionStep) throws IOException {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            if (r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() == null) {
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), "Expected null but was ");
            return null;
        }
        try {
            write();
            HashMap map = new HashMap();
            if (read()) {
                while (true) {
                    try {
                        map.put(PlaybackStateCompat(), iBrazeActionStep.write(this, brazeActionParserExternalSyntheticLambda0));
                    } catch (Exception e) {
                        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to deserialize object in map.", e);
                    }
                    if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != io.sentry.vendor.gson.stream.IconCompatParcelizer.BEGIN_OBJECT && r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                        break;
                    }
                }
            }
            serializer();
            return map;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // o.getSecondArg
    public final String r8lambda54BeH8ZsBru0CXI2CCSP2syNys() throws IOException {
        String str = (String) r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (str != null) {
            return str;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Expected string");
        return null;
    }

    @Override // o.getSecondArg
    public final TimeZone read(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        String str = (String) r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (str != null) {
            return TimeZone.getTimeZone(str);
        }
        return null;
    }

    @Override // o.getSecondArg
    public final ArrayList write(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, IBrazeActionStep iBrazeActionStep) throws IOException {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            if (r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() == null) {
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), "Expected null but was ");
            return null;
        }
        try {
            RemoteActionCompatParcelizer();
            ArrayList arrayList = new ArrayList();
            if (read()) {
                do {
                    try {
                        arrayList.add(iBrazeActionStep.write(this, brazeActionParserExternalSyntheticLambda0));
                    } catch (Exception e) {
                        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to deserialize object in list.", e);
                    }
                } while (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.BEGIN_OBJECT);
            }
            IconCompatParcelizer();
            return arrayList;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // o.getSecondArg
    public final void write(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, AbstractMap abstractMap, String str) {
        try {
            abstractMap.put(str, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
        } catch (Exception e) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "Error deserializing unknown key: %s", str);
        }
    }

    public MediaDescriptionCompat(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.write = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }
}
