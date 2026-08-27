package o;

import android.content.SharedPreferences;
import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class hslJlNiLsg implements SharedPreferences.Editor {
    public final ColorFilter IconCompatParcelizer;
    public final SharedPreferences.Editor read;
    public final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);
    public final CopyOnWriteArrayList serializer = new CopyOnWriteArrayList();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(hsvJlNiLsg.BOOLEAN.getId());
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        RemoteActionCompatParcelizer(str, byteBufferAllocate.array());
        return this;
    }

    public final void RemoteActionCompatParcelizer() {
        ColorFilter colorFilter = this.IconCompatParcelizer;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : colorFilter.RemoteActionCompatParcelizer) {
            Iterator it = this.serializer.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(colorFilter, (String) it.next());
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str, byte[] bArr) {
        ColorFilter colorFilter = this.IconCompatParcelizer;
        colorFilter.getClass();
        if (ColorFilter.read(str)) {
            throw new SecurityException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, " is a reserved key for the encryption keyset."));
        }
        this.serializer.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strIconCompatParcelizer = colorFilter.IconCompatParcelizer(str);
            try {
                Pair pair = new Pair(strIconCompatParcelizer, new String(resetAlignmentLines.read(colorFilter.IconCompatParcelizer.IconCompatParcelizer(bArr, strIconCompatParcelizer.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.read.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not encrypt data: ", (Object) e2.getMessage(), (Throwable) e2);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.serializer;
        serializer();
        try {
            return this.read.commit();
        } finally {
            RemoteActionCompatParcelizer();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(hsvJlNiLsg.FLOAT.getId());
        byteBufferAllocate.putFloat(f);
        RemoteActionCompatParcelizer(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(hsvJlNiLsg.INT.getId());
        byteBufferAllocate.putInt(i);
        RemoteActionCompatParcelizer(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(hsvJlNiLsg.LONG.getId());
        byteBufferAllocate.putLong(j);
        RemoteActionCompatParcelizer(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(hsvJlNiLsg.STRING.getId());
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        RemoteActionCompatParcelizer(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        ColorFilter colorFilter = this.IconCompatParcelizer;
        colorFilter.getClass();
        if (ColorFilter.read(str)) {
            throw new SecurityException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, " is a reserved key for the encryption keyset."));
        }
        this.read.remove(colorFilter.IconCompatParcelizer(str));
        this.serializer.add(str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        serializer();
        this.read.apply();
        RemoteActionCompatParcelizer();
        this.serializer.clear();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.RemoteActionCompatParcelizer.set(true);
        return this;
    }

    public final void serializer() {
        if (this.RemoteActionCompatParcelizer.getAndSet(false)) {
            ColorFilter colorFilter = this.IconCompatParcelizer;
            for (String str : ((HashMap) colorFilter.getAll()).keySet()) {
                if (!this.serializer.contains(str) && !ColorFilter.read(str)) {
                    this.read.remove(colorFilter.IconCompatParcelizer(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new createnHHXs2Y(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(hsvJlNiLsg.STRING_SET.getId());
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        RemoteActionCompatParcelizer(str, byteBufferAllocate.array());
        return this;
    }

    public hslJlNiLsg(ColorFilter colorFilter, SharedPreferences.Editor editor) {
        this.IconCompatParcelizer = colorFilter;
        this.read = editor;
    }
}
