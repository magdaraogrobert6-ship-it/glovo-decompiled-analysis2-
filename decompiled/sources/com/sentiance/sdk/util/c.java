package com.sentiance.sdk.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.getExpirationTimestampSeconds;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint
public class c {
    private Optional<SharedPreferences> IconCompatParcelizer;
    private final boolean RatingCompat;
    private final Context RemoteActionCompatParcelizer;
    private final getExpirationTimestampSeconds read;
    private final SharedPreferences serializer;
    private final String write;

    public final void read() {
        synchronized (this) {
            String strWrite = write();
            for (String str : this.serializer.getAll().keySet()) {
                if (str.startsWith(strWrite)) {
                    this.serializer.edit().remove(str).apply();
                }
            }
            serializer(this.serializer.edit());
            if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                this.IconCompatParcelizer.write().edit().clear().commit();
                this.IconCompatParcelizer = Absent.serializer();
                RemoteActionCompatParcelizer(this.write);
            }
        }
    }

    public final void read(String str) {
        synchronized (this) {
            serializer(this.serializer.edit().remove(MediaMetadataCompat(str)));
            RatingCompat(str);
        }
    }

    public final boolean write(String str) {
        boolean zContains;
        synchronized (this) {
            zContains = this.serializer.contains(MediaMetadataCompat(str));
        }
        return zContains;
    }

    private void RatingCompat(String str) {
        if (this.IconCompatParcelizer.IconCompatParcelizer() && this.IconCompatParcelizer.write().contains(str)) {
            this.IconCompatParcelizer.write().edit().remove(str).commit();
            if (this.IconCompatParcelizer.write().getAll().size() == 0) {
                this.IconCompatParcelizer = Absent.serializer();
                RemoteActionCompatParcelizer(this.write);
            }
        }
    }

    private void RemoteActionCompatParcelizer(String str, Class cls, Object obj) {
        if (this.IconCompatParcelizer.IconCompatParcelizer()) {
            SharedPreferences sharedPreferences = this.serializer;
            if (!sharedPreferences.getBoolean("_ignore_migration_", false) && !sharedPreferences.contains(MediaMetadataCompat(str)) && this.IconCompatParcelizer.write().contains(str)) {
                if (cls == Boolean.class && obj != null) {
                    sharedPreferences.edit().putBoolean(MediaMetadataCompat(str), this.IconCompatParcelizer.write().getBoolean(str, ((Boolean) obj).booleanValue())).apply();
                } else if (cls == Integer.class && obj != null) {
                    sharedPreferences.edit().putInt(MediaMetadataCompat(str), this.IconCompatParcelizer.write().getInt(str, ((Integer) obj).intValue())).apply();
                } else if (cls == String.class) {
                    sharedPreferences.edit().putString(MediaMetadataCompat(str), this.IconCompatParcelizer.write().getString(str, (String) obj)).apply();
                } else if (cls == Long.class && obj != null) {
                    sharedPreferences.edit().putLong(MediaMetadataCompat(str), this.IconCompatParcelizer.write().getLong(str, ((Long) obj).longValue())).apply();
                } else if (cls == Float.class && obj != null) {
                    sharedPreferences.edit().putFloat(MediaMetadataCompat(str), this.IconCompatParcelizer.write().getFloat(str, ((Float) obj).floatValue())).apply();
                } else if (cls == Set.class) {
                    sharedPreferences.edit().putStringSet(MediaMetadataCompat(str), this.IconCompatParcelizer.write().getStringSet(str, (Set) obj)).apply();
                }
            }
            RatingCompat(str);
        }
    }

    public final boolean IconCompatParcelizer(String str) {
        synchronized (this) {
            String strSerializer = this.read.serializer(str);
            if (strSerializer == null) {
                return false;
            }
            RemoteActionCompatParcelizer("encrypted_token_info", strSerializer);
            return true;
        }
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        String strWrite = write();
        for (String str : this.serializer.getAll().keySet()) {
            if (str.startsWith(strWrite)) {
                arrayList.add(str.substring(strWrite.length()));
            }
        }
        return arrayList;
    }

    public c(Context context, String str, getExpirationTimestampSeconds getexpirationtimestampseconds) {
        Optional<SharedPreferences> optionalSerializer;
        this.RemoteActionCompatParcelizer = context;
        this.write = str;
        this.serializer = context.getSharedPreferences("sentiance", 0);
        Optional<File> optionalMediaDescriptionCompat = MediaDescriptionCompat(str);
        if (optionalMediaDescriptionCompat.IconCompatParcelizer() && optionalMediaDescriptionCompat.write().exists()) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            if (sharedPreferences.getAll().size() > 0) {
                optionalSerializer = new Present<>(sharedPreferences);
            } else {
                RemoteActionCompatParcelizer(str);
                optionalSerializer = Absent.serializer();
            }
        } else {
            optionalSerializer = Absent.serializer();
        }
        this.IconCompatParcelizer = optionalSerializer;
        this.read = getexpirationtimestampseconds;
        this.RatingCompat = false;
    }

    public final void serializer(String str, Set set) {
        synchronized (this) {
            serializer(this.serializer.edit().putStringSet(MediaMetadataCompat(str), set));
        }
    }

    private String write() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.write, "__");
    }

    private String MediaMetadataCompat(String str) {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder(), write(), str);
    }

    public final void RemoteActionCompatParcelizer(String str, String str2) {
        synchronized (this) {
            RemoteActionCompatParcelizer(str, String.class, str2);
            serializer(this.serializer.edit().putString(MediaMetadataCompat(str), str2));
        }
    }

    private Optional<File> MediaDescriptionCompat(String str) {
        File file = new File(new File(this.RemoteActionCompatParcelizer.getApplicationInfo().dataDir, "shared_prefs"), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ".xml"));
        if (file.exists()) {
            return new Present(file);
        }
        return Absent.serializer();
    }

    private c(c cVar) {
        this.RemoteActionCompatParcelizer = cVar.RemoteActionCompatParcelizer;
        this.write = cVar.write;
        this.serializer = cVar.serializer;
        this.IconCompatParcelizer = cVar.IconCompatParcelizer;
        this.read = cVar.read;
        this.RatingCompat = true;
    }

    public final void IconCompatParcelizer(int i, String str) {
        synchronized (this) {
            RemoteActionCompatParcelizer(str, Integer.class, Integer.valueOf(i));
            serializer(this.serializer.edit().putInt(MediaMetadataCompat(str), i));
        }
    }

    public final void read(long j, String str) {
        synchronized (this) {
            RemoteActionCompatParcelizer(str, Long.class, Long.valueOf(j));
            serializer(this.serializer.edit().putLong(MediaMetadataCompat(str), j));
        }
    }

    public final void IconCompatParcelizer(float f, String str) {
        synchronized (this) {
            RemoteActionCompatParcelizer(str, Float.class, Float.valueOf(f));
            serializer(this.serializer.edit().putFloat(MediaMetadataCompat(str), f));
        }
    }

    public final Set<String> write(String str, Set<String> set) {
        Set<String> stringSet;
        synchronized (this) {
            stringSet = this.serializer.getStringSet(MediaMetadataCompat(str), set);
        }
        return stringSet;
    }

    public final String serializer(String str) throws IOException {
        synchronized (this) {
            if (!write(str)) {
                return null;
            }
            String strWrite = write(str, (String) null);
            if (strWrite == null) {
                return null;
            }
            String strIconCompatParcelizer = this.read.IconCompatParcelizer(strWrite);
            if (strIconCompatParcelizer == null && (strIconCompatParcelizer = this.read.IconCompatParcelizer(strWrite)) == null) {
                throw new IOException("Failed to decrypt value for key: ".concat(str));
            }
            return strIconCompatParcelizer;
        }
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        synchronized (this) {
            RemoteActionCompatParcelizer(str, Boolean.class, Boolean.valueOf(z));
            serializer(this.serializer.edit().putBoolean(MediaMetadataCompat(str), z));
        }
    }

    public final Set serializer() {
        synchronized (this) {
            Set<String> setWrite = write("open_otg_reasons", (Set<String>) null);
            if (setWrite == null) {
                return null;
            }
            HashSet hashSet = new HashSet(setWrite.size());
            Iterator<String> it = setWrite.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(Byte.valueOf(it.next()));
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            return hashSet;
        }
    }

    public final boolean read(String str, boolean z) {
        boolean z2;
        synchronized (this) {
            RemoteActionCompatParcelizer(str, Boolean.class, Boolean.valueOf(z));
            z2 = this.serializer.getBoolean(MediaMetadataCompat(str), z);
        }
        return z2;
    }

    public final int write(String str, int i) {
        int i2;
        synchronized (this) {
            RemoteActionCompatParcelizer(str, Integer.class, Integer.valueOf(i));
            i2 = this.serializer.getInt(MediaMetadataCompat(str), i);
        }
        return i2;
    }

    public final long IconCompatParcelizer(String str, long j) {
        long j2;
        synchronized (this) {
            RemoteActionCompatParcelizer(str, Long.class, Long.valueOf(j));
            j2 = this.serializer.getLong(MediaMetadataCompat(str), j);
        }
        return j2;
    }

    public final float read(float f, String str) {
        float f2;
        synchronized (this) {
            RemoteActionCompatParcelizer(str, Float.class, Float.valueOf(f));
            f2 = this.serializer.getFloat(MediaMetadataCompat(str), f);
        }
        return f2;
    }

    public final String write(String str, String str2) {
        String string;
        synchronized (this) {
            RemoteActionCompatParcelizer(str, String.class, str2);
            string = this.serializer.getString(MediaMetadataCompat(str), str2);
        }
        return string;
    }

    private void serializer(SharedPreferences.Editor editor) {
        if (this.RatingCompat) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    public final c IconCompatParcelizer() {
        return new c(this);
    }

    private void RemoteActionCompatParcelizer(String str) {
        Optional<File> optionalMediaDescriptionCompat = MediaDescriptionCompat(str);
        if (optionalMediaDescriptionCompat.IconCompatParcelizer() && optionalMediaDescriptionCompat.write().exists()) {
            optionalMediaDescriptionCompat.write().delete();
        }
    }
}
