package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ColorFilter implements SharedPreferences {
    public final findBestHitDistancefn2tFes IconCompatParcelizer;
    public final CopyOnWriteArrayList RemoteActionCompatParcelizer = new CopyOnWriteArrayList();
    public final accessgetValuesp read;
    public final String serializer;
    public final SharedPreferences write;

    public static boolean read(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public static ColorFilter write(Context context, String str, lightingOWjLjI lightingowjlji, getYellow0d7_KjU getyellow0d7_kju, colorMatrixjHGOpc colormatrixjhgopc) {
        androidx.emoji2.text.EmojiProcessor emojiProcessor;
        androidx.emoji2.text.EmojiProcessor emojiProcessor2;
        String str2 = lightingowjlji.write;
        int i = getMeasurePolicyState.write;
        removeFirst.write(minLookaheadIntrinsicWidth.IconCompatParcelizer);
        if (!getLayoutNode.IconCompatParcelizer()) {
            removeFirst.serializer(new previous(getLookaheadPassDelegateui.class, new LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode[]{new applyModifier(accessgetValuesp.class, 9)}, 8), true);
        }
        siblingHits.RemoteActionCompatParcelizer();
        Context applicationContext = context.getApplicationContext();
        androidx.work.impl.WorkerWrapper.Builder builder = new androidx.work.impl.WorkerWrapper.Builder();
        builder.MediaMetadataCompat = getyellow0d7_kju.getKeyTemplate();
        if (applicationContext == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("need an Android context");
            return null;
        }
        builder.RemoteActionCompatParcelizer = applicationContext;
        builder.write = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        builder.MediaSessionCompatQueueItem = str;
        String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("android-keystore://", str2);
        if (!strSerializer.startsWith("android-keystore://")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("key URI must start with android-keystore://");
            return null;
        }
        builder.read = strSerializer;
        maxLookaheadIntrinsicWidth maxlookaheadintrinsicwidthWrite = builder.write();
        synchronized (maxlookaheadintrinsicwidthWrite) {
            emojiProcessor = maxlookaheadintrinsicwidthWrite.RemoteActionCompatParcelizer.read();
        }
        androidx.work.impl.WorkerWrapper.Builder builder2 = new androidx.work.impl.WorkerWrapper.Builder();
        builder2.MediaMetadataCompat = colormatrixjhgopc.getKeyTemplate();
        builder2.RemoteActionCompatParcelizer = applicationContext;
        builder2.write = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        builder2.MediaSessionCompatQueueItem = str;
        String strSerializer2 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("android-keystore://", str2);
        if (!strSerializer2.startsWith("android-keystore://")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("key URI must start with android-keystore://");
            return null;
        }
        builder2.read = strSerializer2;
        maxLookaheadIntrinsicWidth maxlookaheadintrinsicwidthWrite2 = builder2.write();
        synchronized (maxlookaheadintrinsicwidthWrite2) {
            emojiProcessor2 = maxlookaheadintrinsicwidthWrite2.RemoteActionCompatParcelizer.read();
        }
        return new ColorFilter(str, applicationContext.getSharedPreferences(str, 0), (findBestHitDistancefn2tFes) emojiProcessor2.serializer(findBestHitDistancefn2tFes.class), (accessgetValuesp) emojiProcessor.serializer(accessgetValuesp.class));
    }

    public final String IconCompatParcelizer(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(resetAlignmentLines.read(this.read.read(str.getBytes(StandardCharsets.UTF_8), this.serializer.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not encrypt key. ", (Object) e2.getMessage(), (Throwable) e2);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new hslJlNiLsg(this, this.write.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.write.getAll().entrySet()) {
            if (!read(entry.getKey())) {
                try {
                    String str = new String(this.read.serializer(resetAlignmentLines.serializer(entry.getKey()), this.serializer.getBytes()), StandardCharsets.UTF_8);
                    String str2 = str.equals("__NULL__") ? null : str;
                    map.put(str2, serializer(str2));
                } catch (GeneralSecurityException e) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not decrypt key. ", (Object) e.getMessage(), (Throwable) e);
                    return null;
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.RemoteActionCompatParcelizer.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.RemoteActionCompatParcelizer.remove(onSharedPreferenceChangeListener);
    }

    public ColorFilter(String str, SharedPreferences sharedPreferences, findBestHitDistancefn2tFes findbesthitdistancefn2tfes, accessgetValuesp accessgetvaluesp) {
        this.serializer = str;
        this.write = sharedPreferences;
        this.IconCompatParcelizer = findbesthitdistancefn2tfes;
        this.read = accessgetvaluesp;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objSerializer = serializer(str);
        return objSerializer instanceof Boolean ? ((Boolean) objSerializer).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objSerializer = serializer(str);
        return objSerializer instanceof Float ? ((Float) objSerializer).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objSerializer = serializer(str);
        return objSerializer instanceof Integer ? ((Integer) objSerializer).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objSerializer = serializer(str);
        return objSerializer instanceof Long ? ((Long) objSerializer).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objSerializer = serializer(str);
        return objSerializer instanceof String ? (String) objSerializer : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objSerializer = serializer(str);
        Set createnhhxs2y = objSerializer instanceof Set ? (Set) objSerializer : new createnHHXs2Y(0);
        return createnhhxs2y.size() > 0 ? createnhhxs2y : set;
    }

    public final Object serializer(String str) {
        if (!read(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String strIconCompatParcelizer = IconCompatParcelizer(str);
                String string = this.write.getString(strIconCompatParcelizer, null);
                if (string != null) {
                    byte[] bArrSerializer = resetAlignmentLines.serializer(string);
                    findBestHitDistancefn2tFes findbesthitdistancefn2tfes = this.IconCompatParcelizer;
                    Charset charset = StandardCharsets.UTF_8;
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(findbesthitdistancefn2tfes.serializer(bArrSerializer, strIconCompatParcelizer.getBytes(charset)));
                    byteBufferWrap.position(0);
                    int i = byteBufferWrap.getInt();
                    hsvJlNiLsg hsvjlnilsgFromId = hsvJlNiLsg.fromId(i);
                    if (hsvjlnilsgFromId != null) {
                        int iOrdinal = hsvjlnilsgFromId.ordinal();
                        if (iOrdinal == 0) {
                            int i2 = byteBufferWrap.getInt();
                            ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                            byteBufferWrap.limit(i2);
                            String string2 = charset.decode(byteBufferSlice).toString();
                            if (!string2.equals("__NULL__")) {
                                return string2;
                            }
                        } else {
                            if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    return Integer.valueOf(byteBufferWrap.getInt());
                                }
                                if (iOrdinal == 3) {
                                    return Long.valueOf(byteBufferWrap.getLong());
                                }
                                if (iOrdinal == 4) {
                                    return Float.valueOf(byteBufferWrap.getFloat());
                                }
                                if (iOrdinal == 5) {
                                    return Boolean.valueOf(byteBufferWrap.get() != 0);
                                }
                                throw new SecurityException("Unhandled type for encrypted pref value: " + hsvjlnilsgFromId);
                            }
                            createnHHXs2Y createnhhxs2y = new createnHHXs2Y(0);
                            while (byteBufferWrap.hasRemaining()) {
                                int i3 = byteBufferWrap.getInt();
                                ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                                byteBufferSlice2.limit(i3);
                                byteBufferWrap.position(byteBufferWrap.position() + i3);
                                createnhhxs2y.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                            }
                            if (createnhhxs2y.write != 1 || !"__NULL__".equals(createnhhxs2y.serializer[0])) {
                                return createnhhxs2y;
                            }
                        }
                    } else {
                        throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
                    }
                }
                return null;
            } catch (GeneralSecurityException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not decrypt value. ", (Object) e.getMessage(), (Throwable) e);
                return null;
            }
        }
        throw new SecurityException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (read(str)) {
            throw new SecurityException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, " is a reserved key for the encryption keyset."));
        }
        return this.write.contains(IconCompatParcelizer(str));
    }
}
