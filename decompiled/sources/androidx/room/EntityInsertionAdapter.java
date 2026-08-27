package androidx.room;

import androidx.sqlite.SQLite;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.getQueryParameterslambda2;
import o.luminance8_81llA;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EntityInsertionAdapter extends SharedSQLiteStatement {
    public abstract void bind(luminance8_81llA luminance8_81lla, Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
        roomDatabase.getClass();
    }

    public final void insert(Iterable<Object> iterable) {
        iterable.getClass();
        luminance8_81llA luminance8_81llaAcquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                bind(luminance8_81llaAcquire, it.next());
                luminance8_81llaAcquire.write();
            }
            release(luminance8_81llaAcquire);
        } catch (Throwable th) {
            release(luminance8_81llaAcquire);
            throw th;
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> collection) {
        collection.getClass();
        luminance8_81llA luminance8_81llaAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (Object obj : collection) {
                if (i < 0) {
                    SQLite.serializer();
                    throw null;
                }
                bind(luminance8_81llaAcquire, obj);
                jArr[i] = luminance8_81llaAcquire.write();
                i++;
            }
            release(luminance8_81llaAcquire);
            return jArr;
        } catch (Throwable th) {
            release(luminance8_81llaAcquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objArr) {
        objArr.getClass();
        luminance8_81llA luminance8_81llaAcquire = acquire();
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                try {
                    bind(luminance8_81llaAcquire, objArr[i2]);
                    lArr[i] = Long.valueOf(luminance8_81llaAcquire.write());
                    i++;
                    i2++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
            release(luminance8_81llaAcquire);
            return lArr;
        } catch (Throwable th) {
            release(luminance8_81llaAcquire);
            throw th;
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> collection) {
        collection.getClass();
        luminance8_81llA luminance8_81llaAcquire = acquire();
        try {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bind(luminance8_81llaAcquire, it.next());
                baseContentCardViewExternalSyntheticLambda0.add(Long.valueOf(luminance8_81llaAcquire.write()));
            }
            return SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
        } finally {
            release(luminance8_81llaAcquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        luminance8_81llA luminance8_81llaAcquire = acquire();
        try {
            bind(luminance8_81llaAcquire, obj);
            return luminance8_81llaAcquire.write();
        } finally {
            release(luminance8_81llaAcquire);
        }
    }

    public final void insert(Object[] objArr) {
        objArr.getClass();
        luminance8_81llA luminance8_81llaAcquire = acquire();
        try {
            for (Object obj : objArr) {
                bind(luminance8_81llaAcquire, obj);
                luminance8_81llaAcquire.write();
            }
            release(luminance8_81llaAcquire);
        } catch (Throwable th) {
            release(luminance8_81llaAcquire);
            throw th;
        }
    }

    public final void insert(Object obj) {
        luminance8_81llA luminance8_81llaAcquire = acquire();
        try {
            bind(luminance8_81llaAcquire, obj);
            luminance8_81llaAcquire.write();
        } finally {
            release(luminance8_81llaAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> collection) {
        collection.getClass();
        luminance8_81llA luminance8_81llaAcquire = acquire();
        Iterator<Object> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(luminance8_81llaAcquire, it.next());
                lArr[i] = Long.valueOf(luminance8_81llaAcquire.write());
            }
            release(luminance8_81llaAcquire);
            return lArr;
        } catch (Throwable th) {
            release(luminance8_81llaAcquire);
            throw th;
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] objArr) {
        objArr.getClass();
        luminance8_81llA luminance8_81llaAcquire = acquire();
        try {
            int iSerializer = getQueryParameterslambda2.serializer();
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
            for (Object obj : objArr) {
                bind(luminance8_81llaAcquire, obj);
                baseContentCardViewExternalSyntheticLambda0.add(Long.valueOf(luminance8_81llaAcquire.write()));
            }
            return SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
        } finally {
            release(luminance8_81llaAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] objArr) {
        objArr.getClass();
        luminance8_81llA luminance8_81llaAcquire = acquire();
        try {
            long[] jArr = new long[objArr.length];
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                bind(luminance8_81llaAcquire, objArr[i]);
                jArr[i2] = luminance8_81llaAcquire.write();
                i++;
                i2++;
            }
            release(luminance8_81llaAcquire);
            return jArr;
        } catch (Throwable th) {
            release(luminance8_81llaAcquire);
            throw th;
        }
    }
}
