package androidx.compose.ui.autofill;

/* JADX INFO: loaded from: classes.dex */
public interface FillableData {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    default Boolean getBooleanValue() {
        return null;
    }

    default Long getDateMillisValue() {
        return null;
    }

    default Integer getListIndexValue() {
        return null;
    }

    default CharSequence getTextValue() {
        return null;
    }

    default long getDateMillisOrDefault(long j) {
        Long dateMillisValue = getDateMillisValue();
        return dateMillisValue != null ? dateMillisValue.longValue() : j;
    }

    default int getListIndexOrDefault(int i) {
        Integer listIndexValue = getListIndexValue();
        return listIndexValue != null ? listIndexValue.intValue() : i;
    }
}
