package app.cash.sqldelight;

/* JADX INFO: loaded from: classes4.dex */
public interface ColumnAdapter<T, S> {
    T decode(S s);

    S encode(T t);
}
