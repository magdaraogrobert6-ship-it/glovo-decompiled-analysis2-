package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getHeadsetHookEK5gGoQ implements Iterator {
    public Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 3;
    public Object read;

    public getHeadsetHookEK5gGoQ(getClipMetadata getclipmetadata) {
        if (!(getclipmetadata instanceof DisposableSaveableStateRegistry)) {
            this.IconCompatParcelizer = null;
            this.read = (ClipboardExtensions_androidKt) getclipmetadata;
            return;
        }
        DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) getclipmetadata;
        ArrayDeque arrayDeque = new ArrayDeque(disposableSaveableStateRegistry.MediaMetadataCompat);
        this.IconCompatParcelizer = arrayDeque;
        arrayDeque.push(disposableSaveableStateRegistry);
        getClipMetadata getclipmetadata2 = disposableSaveableStateRegistry.write;
        while (getclipmetadata2 instanceof DisposableSaveableStateRegistry) {
            DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = (DisposableSaveableStateRegistry) getclipmetadata2;
            ((ArrayDeque) this.IconCompatParcelizer).push(disposableSaveableStateRegistry2);
            getclipmetadata2 = disposableSaveableStateRegistry2.write;
        }
        this.read = (ClipboardExtensions_androidKt) getclipmetadata2;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            CommonDomainCompanion commonDomainCompanion = (CommonDomainCompanion) this.IconCompatParcelizer;
            return commonDomainCompanion.hasNext() ? commonDomainCompanion.IconCompatParcelizer() : (getFunctionEK5gGoQ) ((Iterator) this.read).next();
        }
        if (i == 1) {
            Map.Entry entry = (Map.Entry) ((Iterator) this.read).next();
            this.IconCompatParcelizer = entry;
            return entry.getKey();
        }
        if (i == 2) {
            return write();
        }
        byte[] bArr = (byte[]) ((io.sentry.cache.tape.MediaMetadataCompat) this.IconCompatParcelizer).next();
        SentryOptions sentryOptions = ((io.sentry.cache.MediaMetadataCompat) ((io.sentry.cache.tape.IconCompatParcelizer) this.read).serializer.jsonReflectionObjectSerializer).IconCompatParcelizer;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), io.sentry.cache.MediaMetadataCompat.write));
            try {
                getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = (getIntentArrayWithConfiguredBackStacklambda1) sentryOptions.getSerializer().write(bufferedReader, getIntentArrayWithConfiguredBackStacklambda1.class);
                bufferedReader.close();
                return getintentarraywithconfiguredbackstacklambda1;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th3, "Error reading entity from scope cache", new Object[0]);
            return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i != 1) {
            if (i == 2) {
                throw new UnsupportedOperationException();
            }
            ((io.sentry.cache.tape.MediaMetadataCompat) this.IconCompatParcelizer).remove();
            return;
        }
        TuplesKt.RemoteActionCompatParcelizer(503622116, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{"no calls to next() since the last call to remove()", Boolean.valueOf(((Map.Entry) this.IconCompatParcelizer) != null)}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -503622113);
        Collection collection = (Collection) ((Map.Entry) this.IconCompatParcelizer).getValue();
        ((Iterator) this.read).remove();
        collection.size();
        collection.clear();
        this.IconCompatParcelizer = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return ((CommonDomainCompanion) this.IconCompatParcelizer).hasNext() || ((Iterator) this.read).hasNext();
        }
        if (i == 1) {
            return ((Iterator) this.read).hasNext();
        }
        if (i != 2) {
            return ((io.sentry.cache.tape.MediaMetadataCompat) this.IconCompatParcelizer).hasNext();
        }
        return ((ClipboardExtensions_androidKt) this.read) != null;
    }

    public getHeadsetHookEK5gGoQ(CommonDomainCompanion commonDomainCompanion, Iterator it) {
        this.IconCompatParcelizer = commonDomainCompanion;
        this.read = it;
    }

    public getHeadsetHookEK5gGoQ(io.sentry.cache.tape.IconCompatParcelizer iconCompatParcelizer, io.sentry.cache.tape.MediaMetadataCompat mediaMetadataCompat) {
        this.read = iconCompatParcelizer;
        this.IconCompatParcelizer = mediaMetadataCompat;
    }

    public getHeadsetHookEK5gGoQ(onExit onexit, Iterator it) {
        this.read = it;
    }

    public ClipboardExtensions_androidKt write() {
        ArrayDeque arrayDeque = (ArrayDeque) this.IconCompatParcelizer;
        ClipboardExtensions_androidKt clipboardExtensions_androidKt = (ClipboardExtensions_androidKt) this.read;
        ClipboardExtensions_androidKt clipboardExtensions_androidKt2 = null;
        if (clipboardExtensions_androidKt != null) {
            while (arrayDeque != null && !arrayDeque.isEmpty()) {
                getClipMetadata getclipmetadata = ((DisposableSaveableStateRegistry) arrayDeque.pop()).RatingCompat;
                while (getclipmetadata instanceof DisposableSaveableStateRegistry) {
                    DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) getclipmetadata;
                    arrayDeque.push(disposableSaveableStateRegistry);
                    getclipmetadata = disposableSaveableStateRegistry.write;
                }
                ClipboardExtensions_androidKt clipboardExtensions_androidKt3 = (ClipboardExtensions_androidKt) getclipmetadata;
                if (!clipboardExtensions_androidKt3.serializer()) {
                    clipboardExtensions_androidKt2 = clipboardExtensions_androidKt3;
                    break;
                }
            }
            this.read = clipboardExtensions_androidKt2;
            return clipboardExtensions_androidKt;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }
}
