package com.huawei.secure.android.common.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class SafeIntent extends Intent {
    @Override // android.content.Intent
    public final boolean getBooleanExtra(String str, boolean z) {
        try {
            return super.getBooleanExtra(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    @Override // android.content.Intent
    public final byte getByteExtra(String str, byte b) {
        try {
            return super.getByteExtra(str, b);
        } catch (Throwable unused) {
            return b;
        }
    }

    @Override // android.content.Intent
    public final char getCharExtra(String str, char c) {
        try {
            return super.getCharExtra(str, c);
        } catch (Throwable unused) {
            return c;
        }
    }

    @Override // android.content.Intent
    public final Uri getData() {
        try {
            return super.getData();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public final double getDoubleExtra(String str, double d) {
        try {
            return super.getDoubleExtra(str, d);
        } catch (Throwable unused) {
            return d;
        }
    }

    @Override // android.content.Intent
    public final float getFloatExtra(String str, float f) {
        try {
            return super.getFloatExtra(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    @Override // android.content.Intent
    public final int getIntExtra(String str, int i) {
        try {
            return super.getIntExtra(str, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    @Override // android.content.Intent
    public final long getLongExtra(String str, long j) {
        try {
            return super.getLongExtra(str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    @Override // android.content.Intent
    public final ArrayList getParcelableArrayListExtra(String str) {
        try {
            return super.getParcelableArrayListExtra(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public final Parcelable getParcelableExtra(String str) {
        try {
            return super.getParcelableExtra(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public final String getScheme() {
        try {
            return super.getScheme();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public final short getShortExtra(String str, short s) {
        try {
            return super.getShortExtra(str, s);
        } catch (Throwable unused) {
            return s;
        }
    }

    @Override // android.content.Intent
    public final boolean hasExtra(String str) {
        try {
            return super.hasExtra(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Parcelable parcelable) {
        try {
            return super.putExtra(str, parcelable);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtras(Intent intent) {
        try {
            return super.putExtras(intent);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putParcelableArrayListExtra(String str, ArrayList arrayList) {
        try {
            return super.putParcelableArrayListExtra(str, arrayList);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent setAction(String str) {
        try {
            return super.setAction(str);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent setPackage(String str) {
        try {
            return super.setPackage(str);
        } catch (Throwable unused) {
            return this;
        }
    }

    public SafeIntent(Intent intent) {
        super(intent == null ? new Intent() : intent);
    }

    @Override // android.content.Intent
    public final Serializable getSerializableExtra(String str, Class cls) {
        try {
            Serializable serializableExtra = super.getSerializableExtra(str);
            if (cls.isInstance(serializableExtra)) {
                return (Serializable) cls.cast(serializableExtra);
            }
            return null;
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeIntent", new StringBuilder("getSerializable exception: "), th);
            return null;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Parcelable[] parcelableArr) {
        try {
            return super.putExtra(str, parcelableArr);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final boolean[] getBooleanArrayExtra(String str) {
        try {
            return super.getBooleanArrayExtra(str);
        } catch (Throwable unused) {
            return new boolean[0];
        }
    }

    @Override // android.content.Intent
    public final byte[] getByteArrayExtra(String str) {
        try {
            return super.getByteArrayExtra(str);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // android.content.Intent
    public final char[] getCharArrayExtra(String str) {
        try {
            return super.getCharArrayExtra(str);
        } catch (Throwable unused) {
            return new char[0];
        }
    }

    @Override // android.content.Intent
    public final CharSequence[] getCharSequenceArrayExtra(String str) {
        try {
            return super.getCharSequenceArrayExtra(str);
        } catch (Throwable unused) {
            return new CharSequence[0];
        }
    }

    @Override // android.content.Intent
    public final double[] getDoubleArrayExtra(String str) {
        try {
            return super.getDoubleArrayExtra(str);
        } catch (Throwable unused) {
            return new double[0];
        }
    }

    @Override // android.content.Intent
    public final float[] getFloatArrayExtra(String str) {
        try {
            return super.getFloatArrayExtra(str);
        } catch (Throwable unused) {
            return new float[0];
        }
    }

    @Override // android.content.Intent
    public final int[] getIntArrayExtra(String str) {
        try {
            return super.getIntArrayExtra(str);
        } catch (Throwable unused) {
            return new int[0];
        }
    }

    @Override // android.content.Intent
    public final long[] getLongArrayExtra(String str) {
        try {
            return super.getLongArrayExtra(str);
        } catch (Throwable unused) {
            return new long[0];
        }
    }

    @Override // android.content.Intent
    public final Parcelable[] getParcelableArrayExtra(String str) {
        try {
            return super.getParcelableArrayExtra(str);
        } catch (Throwable unused) {
            return new Parcelable[0];
        }
    }

    @Override // android.content.Intent
    public final short[] getShortArrayExtra(String str) {
        try {
            return super.getShortArrayExtra(str);
        } catch (Throwable unused) {
            return new short[0];
        }
    }

    @Override // android.content.Intent
    public final String[] getStringArrayExtra(String str) {
        try {
            return super.getStringArrayExtra(str);
        } catch (Throwable unused) {
            return new String[0];
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Serializable serializable) {
        try {
            return super.putExtra(str, serializable);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final String getAction() {
        try {
            return super.getAction();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // android.content.Intent
    public final Bundle getBundleExtra(String str) {
        try {
            return super.getBundleExtra(str);
        } catch (Throwable unused) {
            return new Bundle();
        }
    }

    @Override // android.content.Intent
    public final ArrayList getCharSequenceArrayListExtra(String str) {
        try {
            return super.getCharSequenceArrayListExtra(str);
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    @Override // android.content.Intent
    public final CharSequence getCharSequenceExtra(String str) {
        try {
            return super.getCharSequenceExtra(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // android.content.Intent
    public final Bundle getExtras() {
        try {
            return super.getExtras();
        } catch (Throwable unused) {
            return new Bundle();
        }
    }

    @Override // android.content.Intent
    public final ArrayList getIntegerArrayListExtra(String str) {
        try {
            return super.getIntegerArrayListExtra(str);
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    @Override // android.content.Intent
    public final ArrayList getStringArrayListExtra(String str) {
        try {
            return super.getStringArrayListExtra(str);
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    @Override // android.content.Intent
    public final String getStringExtra(String str) {
        try {
            return super.getStringExtra(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, int i) {
        try {
            return super.putExtra(str, i);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, String str2) {
        try {
            return super.putExtra(str, str2);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, String[] strArr) {
        try {
            return super.putExtra(str, strArr);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final void removeExtra(String str) {
        try {
            super.removeExtra(str);
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeIntent", new StringBuilder("removeExtra: "), th);
        }
    }

    @Override // android.content.Intent
    public final void setSelector(Intent intent) {
        try {
            super.setSelector(intent);
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeIntent", new StringBuilder("setSelector: "), th);
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, CharSequence charSequence) {
        try {
            return super.putExtra(str, charSequence);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final String toURI() {
        try {
            return super.toURI();
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeIntent", new StringBuilder("toURI: exception "), th);
            return "";
        }
    }

    @Override // android.content.Intent
    public final String toUri(int i) {
        try {
            return super.toUri(i);
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeIntent", new StringBuilder("toUri: "), th);
            return "";
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, CharSequence[] charSequenceArr) {
        try {
            return super.putExtra(str, charSequenceArr);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Bundle bundle) {
        try {
            return super.putExtra(str, bundle);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Serializable getSerializableExtra(String str) {
        try {
            return super.getSerializableExtra(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public SafeIntent(Intent intent, int i) {
        super(intent);
    }
}
